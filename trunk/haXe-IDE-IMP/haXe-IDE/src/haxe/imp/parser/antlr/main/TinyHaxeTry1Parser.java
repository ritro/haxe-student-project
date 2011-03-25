// $ANTLR 3.2 Sep 23, 2009 12:02:23 TinyHaxeTry1.g 2011-03-25 15:58:16

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "PROPERTY_DECL", "MODULE", "SUFFIX_EXPR", "BLOCK_SCOPE", "PARAM_LIST", "TYPE_TAG", "TYPE_PARAM_OPT", "INHERIT_LIST_OPT", "DECL_ATTR_LIST", "VAR_INIT", "ASSIGN_OPERATOR", "PACKAGE", "SEMI", "MONKEYS_AT", "IDENTIFIER", "COLON", "EXTERN", "PRIVATE", "DOT", "IMPORT", "USING", "PUBLIC", "STATIC", "INLINE", "DYNAMIC", "OVERRIDE", "COMMA", "QUES", "EQ", "PLUSEQ", "SUBEQ", "SLASHEQ", "PERCENTEQ", "AMPEQ", "FUNCTION", "LPAREN", "RPAREN", "LBRACKET", "RBRACKET", "MINUS_BIGGER", "VOID", "INT", "FLOAT", "BOOLEAN", "LT", "GT", "GTGT", "NEW", "FOR", "IN", "WHILE", "DO", "TRY", "RETURN", "THROW", "BREAK", "CONTINUE", "SWITCH", "LBRACE", "RBRACE", "IF", "ELSE", "CASE", "DEFAULT", "CATCH", "UNTYPED", "ELLIPSIS", "BARBAR", "AMPAMP", "EQEQ", "BANGEQ", "GTEQ", "LTEQ", "BAR", "AMP", "CARET", "LTLT", "GTGTGT", "PLUS", "SUB", "STAR", "SLASH", "PERCENT", "SUBSUB", "PLUSPLUS", "BANG", "TILDE", "NULL", "CAST", "ENUM", "VAR", "CLASS", "INTERFACE", "EXTENDS", "IMPLEMENTS", "TYPEDEF", "LONGLITERAL", "INTLITERAL", "STRINGLITERAL", "CHARLITERAL", "FLOATNUM", "TRUE", "FALSE", "WS", "IntegerNumber", "LongSuffix", "HexPrefix", "HexDigit", "Exponent", "EscapeSequence", "ABSTRACT", "BYTE", "CHAR", "CONST", "DOUBLE", "FINAL", "FINALLY", "GOTO", "INSTANCEOF", "LONG", "NATIVE", "PROTECTED", "SHORT", "STRICTFP", "SUPER", "THIS", "THROWS", "TRANSIENT", "VOLATILE", "STAREQ", "BAREQ", "CARETEQ", "PERCENTDLQ", "PERCENTDBQ", "PERCENTDBBQ", "EQEQEQ", "PERCENTLESQ", "BANGEQQ", "PERCENTLL", "PERCENTBB", "PERCENTBBB", "LTLTEQ", "GTGTEQ", "GTGTGTEQ", "INTNUM", "EXPONENT", "COMMENT", "TS", "PP_CONDITIONAL", "PREPROCESSOR_DIRECTIVE", "IF_TOKEN", "ELSE_TOKEN", "ENDIF_TOKEN", "PP_EXPRESSION", "PP_OR_EXPRESSION", "PP_AND_EXPRESSION", "PP_UNARY_EXPRESSION", "PP_PRIMARY_EXPRESSION", "HEX_DIGIT", "UNICODE_ESC", "OCTAL_ESC", "ESC_SEQ"
    };
    public static final int CAST=92;
    public static final int FUNCTION=38;
    public static final int PACKAGE=15;
    public static final int EXPONENT=149;
    public static final int LT=48;
    public static final int STAR=84;
    public static final int WHILE=54;
    public static final int PP_OR_EXPRESSION=158;
    public static final int FLOATNUM=104;
    public static final int CONST=117;
    public static final int OCTAL_ESC=164;
    public static final int CASE=66;
    public static final int CHAR=116;
    public static final int NEW=51;
    public static final int EXTERN=20;
    public static final int DO=55;
    public static final int EOF=-1;
    public static final int GTGT=50;
    public static final int BREAK=59;
    public static final int ELSE_TOKEN=155;
    public static final int LBRACKET=41;
    public static final int FINAL=119;
    public static final int RPAREN=40;
    public static final int IMPORT=23;
    public static final int USING=24;
    public static final int SUBSUB=87;
    public static final int STAREQ=133;
    public static final int PP_AND_EXPRESSION=159;
    public static final int CARET=79;
    public static final int THIS=129;
    public static final int RETURN=57;
    public static final int DOUBLE=118;
    public static final int MONKEYS_AT=17;
    public static final int BARBAR=71;
    public static final int VAR=94;
    public static final int VOID=44;
    public static final int SUPER=128;
    public static final int GOTO=121;
    public static final int EQ=32;
    public static final int COMMENT=150;
    public static final int AMPAMP=72;
    public static final int VAR_INIT=13;
    public static final int LTLTEQ=145;
    public static final int QUES=31;
    public static final int EQEQ=73;
    public static final int HexPrefix=110;
    public static final int PERCENTDBBQ=138;
    public static final int RBRACE=63;
    public static final int STATIC=26;
    public static final int PRIVATE=21;
    public static final int BLOCK_SCOPE=7;
    public static final int SWITCH=61;
    public static final int NULL=91;
    public static final int GTGTEQ=146;
    public static final int STRICTFP=127;
    public static final int ELSE=65;
    public static final int NATIVE=124;
    public static final int ELLIPSIS=70;
    public static final int THROWS=130;
    public static final int INT=45;
    public static final int SLASHEQ=35;
    public static final int INTLITERAL=101;
    public static final int PERCENTBB=143;
    public static final int TRY=56;
    public static final int IF_TOKEN=154;
    public static final int LongSuffix=109;
    public static final int LONGLITERAL=100;
    public static final int ENDIF_TOKEN=156;
    public static final int PERCENTLL=142;
    public static final int BANGEQQ=141;
    public static final int WS=107;
    public static final int PP_PRIMARY_EXPRESSION=161;
    public static final int PERCENTDLQ=136;
    public static final int INHERIT_LIST_OPT=11;
    public static final int UNTYPED=69;
    public static final int CHARLITERAL=103;
    public static final int GT=49;
    public static final int PP_CONDITIONAL=152;
    public static final int INLINE=27;
    public static final int CATCH=68;
    public static final int FALSE=106;
    public static final int EscapeSequence=113;
    public static final int THROW=58;
    public static final int DYNAMIC=28;
    public static final int PROTECTED=125;
    public static final int CLASS=95;
    public static final int BAREQ=134;
    public static final int IntegerNumber=108;
    public static final int PP_EXPRESSION=157;
    public static final int AMP=78;
    public static final int PLUSPLUS=88;
    public static final int LBRACE=62;
    public static final int TYPE_PARAM_OPT=10;
    public static final int LTEQ=76;
    public static final int SUBEQ=34;
    public static final int GTGTGT=81;
    public static final int Exponent=112;
    public static final int FOR=52;
    public static final int SUFFIX_EXPR=6;
    public static final int SUB=83;
    public static final int FLOAT=46;
    public static final int ABSTRACT=114;
    public static final int MINUS_BIGGER=43;
    public static final int PERCENTDBQ=137;
    public static final int HexDigit=111;
    public static final int PLUSEQ=33;
    public static final int LPAREN=39;
    public static final int IF=64;
    public static final int INTNUM=148;
    public static final int ESC_SEQ=165;
    public static final int BOOLEAN=47;
    public static final int SLASH=85;
    public static final int IN=53;
    public static final int GTGTGTEQ=147;
    public static final int IMPLEMENTS=98;
    public static final int CONTINUE=60;
    public static final int COMMA=30;
    public static final int PREPROCESSOR_DIRECTIVE=153;
    public static final int AMPEQ=37;
    public static final int TRANSIENT=131;
    public static final int IDENTIFIER=18;
    public static final int TILDE=90;
    public static final int BANGEQ=74;
    public static final int PLUS=82;
    public static final int RBRACKET=42;
    public static final int DOT=22;
    public static final int LTLT=80;
    public static final int BYTE=115;
    public static final int PERCENT=86;
    public static final int VOLATILE=132;
    public static final int DECL_ATTR_LIST=12;
    public static final int ASSIGN_OPERATOR=14;
    public static final int TS=151;
    public static final int TYPEDEF=99;
    public static final int UNICODE_ESC=163;
    public static final int EQEQEQ=139;
    public static final int DEFAULT=67;
    public static final int HEX_DIGIT=162;
    public static final int SHORT=126;
    public static final int BANG=89;
    public static final int INSTANCEOF=122;
    public static final int GTEQ=75;
    public static final int MODULE=5;
    public static final int TRUE=105;
    public static final int SEMI=16;
    public static final int COLON=19;
    public static final int PARAM_LIST=8;
    public static final int PERCENTLESQ=140;
    public static final int ENUM=93;
    public static final int FINALLY=120;
    public static final int PERCENTEQ=36;
    public static final int PROPERTY_DECL=4;
    public static final int OVERRIDE=29;
    public static final int STRINGLITERAL=102;
    public static final int CARETEQ=135;
    public static final int PERCENTBBB=144;
    public static final int INTERFACE=96;
    public static final int PP_UNARY_EXPRESSION=160;
    public static final int LONG=123;
    public static final int EXTENDS=97;
    public static final int PUBLIC=25;
    public static final int TYPE_TAG=9;
    public static final int BAR=77;

    // delegates
    // delegators


        public TinyHaxeTry1Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public TinyHaxeTry1Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
            this.state.ruleMemo = new HashMap[255+1];
             
             
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
            // TinyHaxeTry1.g:66:2: ( ( myPackage )? topLevelList -> ^( MODULE[\"MODULE\",true] ( myPackage )? ( topLevelList )? ) )
            // TinyHaxeTry1.g:66:4: ( myPackage )? topLevelList
            {
            // TinyHaxeTry1.g:66:4: ( myPackage )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==PACKAGE) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // TinyHaxeTry1.g:0:0: myPackage
                    {
                    pushFollow(FOLLOW_myPackage_in_module125);
                    myPackage1=myPackage();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_myPackage.add(myPackage1.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_topLevelList_in_module128);
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
            // 66:28: -> ^( MODULE[\"MODULE\",true] ( myPackage )? ( topLevelList )? )
            {
                // TinyHaxeTry1.g:66:31: ^( MODULE[\"MODULE\",true] ( myPackage )? ( topLevelList )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new ExtendedCommonTree(MODULE, "MODULE", true), root_1);

                // TinyHaxeTry1.g:66:75: ( myPackage )?
                if ( stream_myPackage.hasNext() ) {
                    adaptor.addChild(root_1, stream_myPackage.nextTree());

                }
                stream_myPackage.reset();
                // TinyHaxeTry1.g:66:86: ( topLevelList )?
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
    // TinyHaxeTry1.g:69:1: topLevelList : ( topLevel )* ;
    public final TinyHaxeTry1Parser.topLevelList_return topLevelList() throws RecognitionException {
        TinyHaxeTry1Parser.topLevelList_return retval = new TinyHaxeTry1Parser.topLevelList_return();
        retval.start = input.LT(1);
        int topLevelList_StartIndex = input.index();
        Object root_0 = null;

        TinyHaxeTry1Parser.topLevel_return topLevel3 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return retval; }
            // TinyHaxeTry1.g:70:2: ( ( topLevel )* )
            // TinyHaxeTry1.g:70:4: ( topLevel )*
            {
            root_0 = (Object)adaptor.nil();

            // TinyHaxeTry1.g:70:4: ( topLevel )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==MONKEYS_AT||(LA2_0>=EXTERN && LA2_0<=PRIVATE)||(LA2_0>=IMPORT && LA2_0<=USING)||LA2_0==ENUM||(LA2_0>=CLASS && LA2_0<=INTERFACE)||LA2_0==TYPEDEF) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // TinyHaxeTry1.g:70:5: topLevel
            	    {
            	    pushFollow(FOLLOW_topLevel_in_topLevelList157);
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
    // TinyHaxeTry1.g:73:1: topLevel : ( myImport | topLevelDecl );
    public final TinyHaxeTry1Parser.topLevel_return topLevel() throws RecognitionException {
        TinyHaxeTry1Parser.topLevel_return retval = new TinyHaxeTry1Parser.topLevel_return();
        retval.start = input.LT(1);
        int topLevel_StartIndex = input.index();
        Object root_0 = null;

        TinyHaxeTry1Parser.myImport_return myImport4 = null;

        TinyHaxeTry1Parser.topLevelDecl_return topLevelDecl5 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return retval; }
            // TinyHaxeTry1.g:74:2: ( myImport | topLevelDecl )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=IMPORT && LA3_0<=USING)) ) {
                alt3=1;
            }
            else if ( (LA3_0==MONKEYS_AT||(LA3_0>=EXTERN && LA3_0<=PRIVATE)||LA3_0==ENUM||(LA3_0>=CLASS && LA3_0<=INTERFACE)||LA3_0==TYPEDEF) ) {
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
                    // TinyHaxeTry1.g:74:4: myImport
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_myImport_in_topLevel170);
                    myImport4=myImport();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, myImport4.getTree());

                    }
                    break;
                case 2 :
                    // TinyHaxeTry1.g:76:4: topLevelDecl
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_topLevelDecl_in_topLevel176);
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
    // TinyHaxeTry1.g:79:1: myPackage : PACKAGE dotIdent SEMI -> ^( PACKAGE ( dotIdent )? ) ;
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
            // TinyHaxeTry1.g:80:2: ( PACKAGE dotIdent SEMI -> ^( PACKAGE ( dotIdent )? ) )
            // TinyHaxeTry1.g:80:4: PACKAGE dotIdent SEMI
            {
            PACKAGE6=(Token)match(input,PACKAGE,FOLLOW_PACKAGE_in_myPackage187); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_PACKAGE.add(PACKAGE6);

            pushFollow(FOLLOW_dotIdent_in_myPackage189);
            dotIdent7=dotIdent();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_dotIdent.add(dotIdent7.getTree());
            SEMI8=(Token)match(input,SEMI,FOLLOW_SEMI_in_myPackage191); if (state.failed) return retval; 
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
            // 80:26: -> ^( PACKAGE ( dotIdent )? )
            {
                // TinyHaxeTry1.g:80:29: ^( PACKAGE ( dotIdent )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_PACKAGE.nextNode(), root_1);

                // TinyHaxeTry1.g:80:39: ( dotIdent )?
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

    public static class meta_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "meta"
    // TinyHaxeTry1.g:83:1: meta : MONKEYS_AT meta ;
    public final TinyHaxeTry1Parser.meta_return meta() throws RecognitionException {
        TinyHaxeTry1Parser.meta_return retval = new TinyHaxeTry1Parser.meta_return();
        retval.start = input.LT(1);
        int meta_StartIndex = input.index();
        Object root_0 = null;

        Token MONKEYS_AT9=null;
        TinyHaxeTry1Parser.meta_return meta10 = null;


        Object MONKEYS_AT9_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return retval; }
            // TinyHaxeTry1.g:83:6: ( MONKEYS_AT meta )
            // TinyHaxeTry1.g:83:8: MONKEYS_AT meta
            {
            root_0 = (Object)adaptor.nil();

            MONKEYS_AT9=(Token)match(input,MONKEYS_AT,FOLLOW_MONKEYS_AT_in_meta210); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            MONKEYS_AT9_tree = (Object)adaptor.create(MONKEYS_AT9);
            adaptor.addChild(root_0, MONKEYS_AT9_tree);
            }
            pushFollow(FOLLOW_meta_in_meta212);
            meta10=meta();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, meta10.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 5, meta_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "meta"

    public static class metaName_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "metaName"
    // TinyHaxeTry1.g:86:1: metaName : ( IDENTIFIER | primitiveType | COLON metaName );
    public final TinyHaxeTry1Parser.metaName_return metaName() throws RecognitionException {
        TinyHaxeTry1Parser.metaName_return retval = new TinyHaxeTry1Parser.metaName_return();
        retval.start = input.LT(1);
        int metaName_StartIndex = input.index();
        Object root_0 = null;

        Token IDENTIFIER11=null;
        Token COLON13=null;
        TinyHaxeTry1Parser.primitiveType_return primitiveType12 = null;

        TinyHaxeTry1Parser.metaName_return metaName14 = null;


        Object IDENTIFIER11_tree=null;
        Object COLON13_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return retval; }
            // TinyHaxeTry1.g:87:2: ( IDENTIFIER | primitiveType | COLON metaName )
            int alt4=3;
            switch ( input.LA(1) ) {
            case IDENTIFIER:
                {
                alt4=1;
                }
                break;
            case DYNAMIC:
            case VOID:
            case INT:
            case FLOAT:
            case BOOLEAN:
                {
                alt4=2;
                }
                break;
            case COLON:
                {
                alt4=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // TinyHaxeTry1.g:87:4: IDENTIFIER
                    {
                    root_0 = (Object)adaptor.nil();

                    IDENTIFIER11=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_metaName223); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER11_tree = (Object)adaptor.create(IDENTIFIER11);
                    adaptor.addChild(root_0, IDENTIFIER11_tree);
                    }

                    }
                    break;
                case 2 :
                    // TinyHaxeTry1.g:88:4: primitiveType
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_primitiveType_in_metaName228);
                    primitiveType12=primitiveType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveType12.getTree());

                    }
                    break;
                case 3 :
                    // TinyHaxeTry1.g:90:4: COLON metaName
                    {
                    root_0 = (Object)adaptor.nil();

                    COLON13=(Token)match(input,COLON,FOLLOW_COLON_in_metaName234); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    COLON13_tree = (Object)adaptor.create(COLON13);
                    adaptor.addChild(root_0, COLON13_tree);
                    }
                    pushFollow(FOLLOW_metaName_in_metaName236);
                    metaName14=metaName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, metaName14.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 6, metaName_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "metaName"

    public static class typeDeclFlags_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typeDeclFlags"
    // TinyHaxeTry1.g:93:1: typeDeclFlags : ( meta )* ( EXTERN | PRIVATE )* ;
    public final TinyHaxeTry1Parser.typeDeclFlags_return typeDeclFlags() throws RecognitionException {
        TinyHaxeTry1Parser.typeDeclFlags_return retval = new TinyHaxeTry1Parser.typeDeclFlags_return();
        retval.start = input.LT(1);
        int typeDeclFlags_StartIndex = input.index();
        Object root_0 = null;

        Token set16=null;
        TinyHaxeTry1Parser.meta_return meta15 = null;


        Object set16_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return retval; }
            // TinyHaxeTry1.g:94:2: ( ( meta )* ( EXTERN | PRIVATE )* )
            // TinyHaxeTry1.g:94:4: ( meta )* ( EXTERN | PRIVATE )*
            {
            root_0 = (Object)adaptor.nil();

            // TinyHaxeTry1.g:94:4: ( meta )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==MONKEYS_AT) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // TinyHaxeTry1.g:94:5: meta
            	    {
            	    pushFollow(FOLLOW_meta_in_typeDeclFlags248);
            	    meta15=meta();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, meta15.getTree());

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // TinyHaxeTry1.g:94:12: ( EXTERN | PRIVATE )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=EXTERN && LA6_0<=PRIVATE)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // TinyHaxeTry1.g:
            	    {
            	    set16=(Token)input.LT(1);
            	    if ( (input.LA(1)>=EXTERN && input.LA(1)<=PRIVATE) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set16));
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
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
            if ( state.backtracking>0 ) { memoize(input, 7, typeDeclFlags_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "typeDeclFlags"

    public static class qualifiedIdentifier_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "qualifiedIdentifier"
    // TinyHaxeTry1.g:97:1: qualifiedIdentifier : (a= IDENTIFIER -> $a) ( DOT ident= IDENTIFIER -> ^( DOT $qualifiedIdentifier $ident) )* ;
    public final TinyHaxeTry1Parser.qualifiedIdentifier_return qualifiedIdentifier() throws RecognitionException {
        TinyHaxeTry1Parser.qualifiedIdentifier_return retval = new TinyHaxeTry1Parser.qualifiedIdentifier_return();
        retval.start = input.LT(1);
        int qualifiedIdentifier_StartIndex = input.index();
        Object root_0 = null;

        Token a=null;
        Token ident=null;
        Token DOT17=null;

        Object a_tree=null;
        Object ident_tree=null;
        Object DOT17_tree=null;
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return retval; }
            // TinyHaxeTry1.g:98:2: ( (a= IDENTIFIER -> $a) ( DOT ident= IDENTIFIER -> ^( DOT $qualifiedIdentifier $ident) )* )
            // TinyHaxeTry1.g:98:4: (a= IDENTIFIER -> $a) ( DOT ident= IDENTIFIER -> ^( DOT $qualifiedIdentifier $ident) )*
            {
            // TinyHaxeTry1.g:98:4: (a= IDENTIFIER -> $a)
            // TinyHaxeTry1.g:98:5: a= IDENTIFIER
            {
            a=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_qualifiedIdentifier274); if (state.failed) return retval; 
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
            // 98:19: -> $a
            {
                adaptor.addChild(root_0, stream_a.nextNode());

            }

            retval.tree = root_0;}
            }

            // TinyHaxeTry1.g:98:29: ( DOT ident= IDENTIFIER -> ^( DOT $qualifiedIdentifier $ident) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==DOT) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // TinyHaxeTry1.g:98:30: DOT ident= IDENTIFIER
            	    {
            	    DOT17=(Token)match(input,DOT,FOLLOW_DOT_in_qualifiedIdentifier287); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_DOT.add(DOT17);

            	    ident=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_qualifiedIdentifier291); if (state.failed) return retval; 
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
            	    // 98:52: -> ^( DOT $qualifiedIdentifier $ident)
            	    {
            	        // TinyHaxeTry1.g:98:56: ^( DOT $qualifiedIdentifier $ident)
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
            	    break loop7;
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
            if ( state.backtracking>0 ) { memoize(input, 8, qualifiedIdentifier_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "qualifiedIdentifier"

    public static class myImport_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "myImport"
    // TinyHaxeTry1.g:101:1: myImport : ( IMPORT dotIdent SEMI | USING dotIdent SEMI );
    public final TinyHaxeTry1Parser.myImport_return myImport() throws RecognitionException {
        TinyHaxeTry1Parser.myImport_return retval = new TinyHaxeTry1Parser.myImport_return();
        retval.start = input.LT(1);
        int myImport_StartIndex = input.index();
        Object root_0 = null;

        Token IMPORT18=null;
        Token SEMI20=null;
        Token USING21=null;
        Token SEMI23=null;
        TinyHaxeTry1Parser.dotIdent_return dotIdent19 = null;

        TinyHaxeTry1Parser.dotIdent_return dotIdent22 = null;


        Object IMPORT18_tree=null;
        Object SEMI20_tree=null;
        Object USING21_tree=null;
        Object SEMI23_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return retval; }
            // TinyHaxeTry1.g:102:2: ( IMPORT dotIdent SEMI | USING dotIdent SEMI )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==IMPORT) ) {
                alt8=1;
            }
            else if ( (LA8_0==USING) ) {
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
                    // TinyHaxeTry1.g:102:4: IMPORT dotIdent SEMI
                    {
                    root_0 = (Object)adaptor.nil();

                    IMPORT18=(Token)match(input,IMPORT,FOLLOW_IMPORT_in_myImport320); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IMPORT18_tree = (Object)adaptor.create(IMPORT18);
                    root_0 = (Object)adaptor.becomeRoot(IMPORT18_tree, root_0);
                    }
                    pushFollow(FOLLOW_dotIdent_in_myImport323);
                    dotIdent19=dotIdent();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dotIdent19.getTree());
                    SEMI20=(Token)match(input,SEMI,FOLLOW_SEMI_in_myImport325); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // TinyHaxeTry1.g:103:4: USING dotIdent SEMI
                    {
                    root_0 = (Object)adaptor.nil();

                    USING21=(Token)match(input,USING,FOLLOW_USING_in_myImport331); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    USING21_tree = (Object)adaptor.create(USING21);
                    root_0 = (Object)adaptor.becomeRoot(USING21_tree, root_0);
                    }
                    pushFollow(FOLLOW_dotIdent_in_myImport334);
                    dotIdent22=dotIdent();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dotIdent22.getTree());
                    SEMI23=(Token)match(input,SEMI,FOLLOW_SEMI_in_myImport336); if (state.failed) return retval;

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
            if ( state.backtracking>0 ) { memoize(input, 9, myImport_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "myImport"

    public static class access_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "access"
    // TinyHaxeTry1.g:107:1: access : ( PUBLIC | PRIVATE );
    public final TinyHaxeTry1Parser.access_return access() throws RecognitionException {
        TinyHaxeTry1Parser.access_return retval = new TinyHaxeTry1Parser.access_return();
        retval.start = input.LT(1);
        int access_StartIndex = input.index();
        Object root_0 = null;

        Token set24=null;

        Object set24_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return retval; }
            // TinyHaxeTry1.g:108:2: ( PUBLIC | PRIVATE )
            // TinyHaxeTry1.g:
            {
            root_0 = (Object)adaptor.nil();

            set24=(Token)input.LT(1);
            if ( input.LA(1)==PRIVATE||input.LA(1)==PUBLIC ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set24));
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
            if ( state.backtracking>0 ) { memoize(input, 10, access_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "access"

    public static class declAttr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "declAttr"
    // TinyHaxeTry1.g:112:1: declAttr : ( STATIC | INLINE | DYNAMIC | OVERRIDE | access );
    public final TinyHaxeTry1Parser.declAttr_return declAttr() throws RecognitionException {
        TinyHaxeTry1Parser.declAttr_return retval = new TinyHaxeTry1Parser.declAttr_return();
        retval.start = input.LT(1);
        int declAttr_StartIndex = input.index();
        Object root_0 = null;

        Token STATIC25=null;
        Token INLINE26=null;
        Token DYNAMIC27=null;
        Token OVERRIDE28=null;
        TinyHaxeTry1Parser.access_return access29 = null;


        Object STATIC25_tree=null;
        Object INLINE26_tree=null;
        Object DYNAMIC27_tree=null;
        Object OVERRIDE28_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return retval; }
            // TinyHaxeTry1.g:113:2: ( STATIC | INLINE | DYNAMIC | OVERRIDE | access )
            int alt9=5;
            switch ( input.LA(1) ) {
            case STATIC:
                {
                alt9=1;
                }
                break;
            case INLINE:
                {
                alt9=2;
                }
                break;
            case DYNAMIC:
                {
                alt9=3;
                }
                break;
            case OVERRIDE:
                {
                alt9=4;
                }
                break;
            case PRIVATE:
            case PUBLIC:
                {
                alt9=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // TinyHaxeTry1.g:113:4: STATIC
                    {
                    root_0 = (Object)adaptor.nil();

                    STATIC25=(Token)match(input,STATIC,FOLLOW_STATIC_in_declAttr385); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STATIC25_tree = (Object)adaptor.create(STATIC25);
                    adaptor.addChild(root_0, STATIC25_tree);
                    }

                    }
                    break;
                case 2 :
                    // TinyHaxeTry1.g:114:4: INLINE
                    {
                    root_0 = (Object)adaptor.nil();

                    INLINE26=(Token)match(input,INLINE,FOLLOW_INLINE_in_declAttr390); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INLINE26_tree = (Object)adaptor.create(INLINE26);
                    adaptor.addChild(root_0, INLINE26_tree);
                    }

                    }
                    break;
                case 3 :
                    // TinyHaxeTry1.g:115:4: DYNAMIC
                    {
                    root_0 = (Object)adaptor.nil();

                    DYNAMIC27=(Token)match(input,DYNAMIC,FOLLOW_DYNAMIC_in_declAttr395); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DYNAMIC27_tree = (Object)adaptor.create(DYNAMIC27);
                    adaptor.addChild(root_0, DYNAMIC27_tree);
                    }

                    }
                    break;
                case 4 :
                    // TinyHaxeTry1.g:116:4: OVERRIDE
                    {
                    root_0 = (Object)adaptor.nil();

                    OVERRIDE28=(Token)match(input,OVERRIDE,FOLLOW_OVERRIDE_in_declAttr400); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    OVERRIDE28_tree = (Object)adaptor.create(OVERRIDE28);
                    adaptor.addChild(root_0, OVERRIDE28_tree);
                    }

                    }
                    break;
                case 5 :
                    // TinyHaxeTry1.g:117:4: access
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_access_in_declAttr405);
                    access29=access();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, access29.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 11, declAttr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "declAttr"

    public static class declAttrList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "declAttrList"
    // TinyHaxeTry1.g:120:1: declAttrList : ( declAttr )+ -> ^( DECL_ATTR_LIST[\"DECL_ATTR_LIST\", true] ( declAttr )+ ) ;
    public final TinyHaxeTry1Parser.declAttrList_return declAttrList() throws RecognitionException {
        TinyHaxeTry1Parser.declAttrList_return retval = new TinyHaxeTry1Parser.declAttrList_return();
        retval.start = input.LT(1);
        int declAttrList_StartIndex = input.index();
        Object root_0 = null;

        TinyHaxeTry1Parser.declAttr_return declAttr30 = null;


        RewriteRuleSubtreeStream stream_declAttr=new RewriteRuleSubtreeStream(adaptor,"rule declAttr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return retval; }
            // TinyHaxeTry1.g:121:2: ( ( declAttr )+ -> ^( DECL_ATTR_LIST[\"DECL_ATTR_LIST\", true] ( declAttr )+ ) )
            // TinyHaxeTry1.g:121:4: ( declAttr )+
            {
            // TinyHaxeTry1.g:121:4: ( declAttr )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==PRIVATE||(LA10_0>=PUBLIC && LA10_0<=OVERRIDE)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // TinyHaxeTry1.g:121:5: declAttr
            	    {
            	    pushFollow(FOLLOW_declAttr_in_declAttrList417);
            	    declAttr30=declAttr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_declAttr.add(declAttr30.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
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
            // 121:16: -> ^( DECL_ATTR_LIST[\"DECL_ATTR_LIST\", true] ( declAttr )+ )
            {
                // TinyHaxeTry1.g:121:19: ^( DECL_ATTR_LIST[\"DECL_ATTR_LIST\", true] ( declAttr )+ )
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
            if ( state.backtracking>0 ) { memoize(input, 12, declAttrList_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "declAttrList"

    public static class paramList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "paramList"
    // TinyHaxeTry1.g:124:1: paramList : ( param ( COMMA param )* -> ^( PARAM_LIST[\"PARAM_LIST\", true] ( param )+ ) | );
    public final TinyHaxeTry1Parser.paramList_return paramList() throws RecognitionException {
        TinyHaxeTry1Parser.paramList_return retval = new TinyHaxeTry1Parser.paramList_return();
        retval.start = input.LT(1);
        int paramList_StartIndex = input.index();
        Object root_0 = null;

        Token COMMA32=null;
        TinyHaxeTry1Parser.param_return param31 = null;

        TinyHaxeTry1Parser.param_return param33 = null;


        Object COMMA32_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_param=new RewriteRuleSubtreeStream(adaptor,"rule param");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return retval; }
            // TinyHaxeTry1.g:125:2: ( param ( COMMA param )* -> ^( PARAM_LIST[\"PARAM_LIST\", true] ( param )+ ) | )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==IDENTIFIER||LA12_0==QUES) ) {
                alt12=1;
            }
            else if ( (LA12_0==RPAREN) ) {
                alt12=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // TinyHaxeTry1.g:125:4: param ( COMMA param )*
                    {
                    pushFollow(FOLLOW_param_in_paramList443);
                    param31=param();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_param.add(param31.getTree());
                    // TinyHaxeTry1.g:125:10: ( COMMA param )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==COMMA) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // TinyHaxeTry1.g:125:11: COMMA param
                    	    {
                    	    COMMA32=(Token)match(input,COMMA,FOLLOW_COMMA_in_paramList446); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA32);

                    	    pushFollow(FOLLOW_param_in_paramList448);
                    	    param33=param();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_param.add(param33.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop11;
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
                    // 125:25: -> ^( PARAM_LIST[\"PARAM_LIST\", true] ( param )+ )
                    {
                        // TinyHaxeTry1.g:125:28: ^( PARAM_LIST[\"PARAM_LIST\", true] ( param )+ )
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
                    // TinyHaxeTry1.g:127:2: 
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
            if ( state.backtracking>0 ) { memoize(input, 13, paramList_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "paramList"

    public static class param_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "param"
    // TinyHaxeTry1.g:129:1: param : ( QUES )? IDENTIFIER typeTagOpt varInit -> ^( VAR[$IDENTIFIER, true] ( IDENTIFIER )? ( typeTagOpt )? ( varInit )? ( QUES )? ) ;
    public final TinyHaxeTry1Parser.param_return param() throws RecognitionException {
        TinyHaxeTry1Parser.param_return retval = new TinyHaxeTry1Parser.param_return();
        retval.start = input.LT(1);
        int param_StartIndex = input.index();
        Object root_0 = null;

        Token QUES34=null;
        Token IDENTIFIER35=null;
        TinyHaxeTry1Parser.typeTagOpt_return typeTagOpt36 = null;

        TinyHaxeTry1Parser.varInit_return varInit37 = null;


        Object QUES34_tree=null;
        Object IDENTIFIER35_tree=null;
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_QUES=new RewriteRuleTokenStream(adaptor,"token QUES");
        RewriteRuleSubtreeStream stream_typeTagOpt=new RewriteRuleSubtreeStream(adaptor,"rule typeTagOpt");
        RewriteRuleSubtreeStream stream_varInit=new RewriteRuleSubtreeStream(adaptor,"rule varInit");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return retval; }
            // TinyHaxeTry1.g:130:2: ( ( QUES )? IDENTIFIER typeTagOpt varInit -> ^( VAR[$IDENTIFIER, true] ( IDENTIFIER )? ( typeTagOpt )? ( varInit )? ( QUES )? ) )
            // TinyHaxeTry1.g:130:4: ( QUES )? IDENTIFIER typeTagOpt varInit
            {
            // TinyHaxeTry1.g:130:4: ( QUES )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==QUES) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // TinyHaxeTry1.g:0:0: QUES
                    {
                    QUES34=(Token)match(input,QUES,FOLLOW_QUES_in_param478); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_QUES.add(QUES34);


                    }
                    break;

            }

            IDENTIFIER35=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_param481); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER35);

            pushFollow(FOLLOW_typeTagOpt_in_param483);
            typeTagOpt36=typeTagOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeTagOpt.add(typeTagOpt36.getTree());
            pushFollow(FOLLOW_varInit_in_param485);
            varInit37=varInit();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_varInit.add(varInit37.getTree());


            // AST REWRITE
            // elements: typeTagOpt, IDENTIFIER, varInit, QUES
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 130:40: -> ^( VAR[$IDENTIFIER, true] ( IDENTIFIER )? ( typeTagOpt )? ( varInit )? ( QUES )? )
            {
                // TinyHaxeTry1.g:130:43: ^( VAR[$IDENTIFIER, true] ( IDENTIFIER )? ( typeTagOpt )? ( varInit )? ( QUES )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new VarDeclaration(VAR, IDENTIFIER35, true), root_1);

                // TinyHaxeTry1.g:130:84: ( IDENTIFIER )?
                if ( stream_IDENTIFIER.hasNext() ) {
                    adaptor.addChild(root_1, new VarUsage(stream_IDENTIFIER.nextToken()));

                }
                stream_IDENTIFIER.reset();
                // TinyHaxeTry1.g:130:106: ( typeTagOpt )?
                if ( stream_typeTagOpt.hasNext() ) {
                    adaptor.addChild(root_1, stream_typeTagOpt.nextTree());

                }
                stream_typeTagOpt.reset();
                // TinyHaxeTry1.g:130:118: ( varInit )?
                if ( stream_varInit.hasNext() ) {
                    adaptor.addChild(root_1, stream_varInit.nextTree());

                }
                stream_varInit.reset();
                // TinyHaxeTry1.g:130:127: ( QUES )?
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
            if ( state.backtracking>0 ) { memoize(input, 14, param_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "param"

    public static class id_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "id"
    // TinyHaxeTry1.g:133:1: id : IDENTIFIER ;
    public final TinyHaxeTry1Parser.id_return id() throws RecognitionException {
        TinyHaxeTry1Parser.id_return retval = new TinyHaxeTry1Parser.id_return();
        retval.start = input.LT(1);
        int id_StartIndex = input.index();
        Object root_0 = null;

        Token IDENTIFIER38=null;

        Object IDENTIFIER38_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return retval; }
            // TinyHaxeTry1.g:133:4: ( IDENTIFIER )
            // TinyHaxeTry1.g:133:6: IDENTIFIER
            {
            root_0 = (Object)adaptor.nil();

            IDENTIFIER38=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_id521); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER38_tree = new VarUsage(IDENTIFIER38) ;
            adaptor.addChild(root_0, IDENTIFIER38_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 15, id_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "id"

    public static class dotIdent_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "dotIdent"
    // TinyHaxeTry1.g:136:1: dotIdent : ( id -> id ) ( DOT ident= id -> ^( DOT $dotIdent $ident) )* ;
    public final TinyHaxeTry1Parser.dotIdent_return dotIdent() throws RecognitionException {
        TinyHaxeTry1Parser.dotIdent_return retval = new TinyHaxeTry1Parser.dotIdent_return();
        retval.start = input.LT(1);
        int dotIdent_StartIndex = input.index();
        Object root_0 = null;

        Token DOT40=null;
        TinyHaxeTry1Parser.id_return ident = null;

        TinyHaxeTry1Parser.id_return id39 = null;


        Object DOT40_tree=null;
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return retval; }
            // TinyHaxeTry1.g:136:9: ( ( id -> id ) ( DOT ident= id -> ^( DOT $dotIdent $ident) )* )
            // TinyHaxeTry1.g:136:11: ( id -> id ) ( DOT ident= id -> ^( DOT $dotIdent $ident) )*
            {
            // TinyHaxeTry1.g:136:11: ( id -> id )
            // TinyHaxeTry1.g:136:12: id
            {
            pushFollow(FOLLOW_id_in_dotIdent535);
            id39=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_id.add(id39.getTree());


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
            // 136:15: -> id
            {
                adaptor.addChild(root_0, stream_id.nextTree());

            }

            retval.tree = root_0;}
            }

            // TinyHaxeTry1.g:136:22: ( DOT ident= id -> ^( DOT $dotIdent $ident) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==DOT) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // TinyHaxeTry1.g:136:23: DOT ident= id
            	    {
            	    DOT40=(Token)match(input,DOT,FOLLOW_DOT_in_dotIdent543); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_DOT.add(DOT40);

            	    pushFollow(FOLLOW_id_in_dotIdent547);
            	    ident=id();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_id.add(ident.getTree());


            	    // AST REWRITE
            	    // elements: DOT, ident, dotIdent
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
            	    // 136:36: -> ^( DOT $dotIdent $ident)
            	    {
            	        // TinyHaxeTry1.g:136:39: ^( DOT $dotIdent $ident)
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
            	    break loop14;
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
            if ( state.backtracking>0 ) { memoize(input, 16, dotIdent_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "dotIdent"

    public static class assignOp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assignOp"
    // TinyHaxeTry1.g:139:1: assignOp : ( EQ -> EQ[$EQ] | PLUSEQ -> PLUSEQ[$PLUSEQ] | SUBEQ -> SUBEQ[$SUBEQ] | SLASHEQ -> SLASHEQ[$SLASHEQ] | PERCENTEQ -> PERCENTEQ[$PERCENTEQ] | AMPEQ -> AMPEQ[$AMPEQ] );
    public final TinyHaxeTry1Parser.assignOp_return assignOp() throws RecognitionException {
        TinyHaxeTry1Parser.assignOp_return retval = new TinyHaxeTry1Parser.assignOp_return();
        retval.start = input.LT(1);
        int assignOp_StartIndex = input.index();
        Object root_0 = null;

        Token EQ41=null;
        Token PLUSEQ42=null;
        Token SUBEQ43=null;
        Token SLASHEQ44=null;
        Token PERCENTEQ45=null;
        Token AMPEQ46=null;

        Object EQ41_tree=null;
        Object PLUSEQ42_tree=null;
        Object SUBEQ43_tree=null;
        Object SLASHEQ44_tree=null;
        Object PERCENTEQ45_tree=null;
        Object AMPEQ46_tree=null;
        RewriteRuleTokenStream stream_SUBEQ=new RewriteRuleTokenStream(adaptor,"token SUBEQ");
        RewriteRuleTokenStream stream_SLASHEQ=new RewriteRuleTokenStream(adaptor,"token SLASHEQ");
        RewriteRuleTokenStream stream_PERCENTEQ=new RewriteRuleTokenStream(adaptor,"token PERCENTEQ");
        RewriteRuleTokenStream stream_EQ=new RewriteRuleTokenStream(adaptor,"token EQ");
        RewriteRuleTokenStream stream_AMPEQ=new RewriteRuleTokenStream(adaptor,"token AMPEQ");
        RewriteRuleTokenStream stream_PLUSEQ=new RewriteRuleTokenStream(adaptor,"token PLUSEQ");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return retval; }
            // TinyHaxeTry1.g:139:9: ( EQ -> EQ[$EQ] | PLUSEQ -> PLUSEQ[$PLUSEQ] | SUBEQ -> SUBEQ[$SUBEQ] | SLASHEQ -> SLASHEQ[$SLASHEQ] | PERCENTEQ -> PERCENTEQ[$PERCENTEQ] | AMPEQ -> AMPEQ[$AMPEQ] )
            int alt15=6;
            switch ( input.LA(1) ) {
            case EQ:
                {
                alt15=1;
                }
                break;
            case PLUSEQ:
                {
                alt15=2;
                }
                break;
            case SUBEQ:
                {
                alt15=3;
                }
                break;
            case SLASHEQ:
                {
                alt15=4;
                }
                break;
            case PERCENTEQ:
                {
                alt15=5;
                }
                break;
            case AMPEQ:
                {
                alt15=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // TinyHaxeTry1.g:139:11: EQ
                    {
                    EQ41=(Token)match(input,EQ,FOLLOW_EQ_in_assignOp571); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EQ.add(EQ41);



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
                    // 139:15: -> EQ[$EQ]
                    {
                        adaptor.addChild(root_0, new AssignOperationNode(EQ, EQ41));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // TinyHaxeTry1.g:140:11: PLUSEQ
                    {
                    PLUSEQ42=(Token)match(input,PLUSEQ,FOLLOW_PLUSEQ_in_assignOp592); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PLUSEQ.add(PLUSEQ42);



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
                    // 140:20: -> PLUSEQ[$PLUSEQ]
                    {
                        adaptor.addChild(root_0, new AssignOperationNode(PLUSEQ, PLUSEQ42));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // TinyHaxeTry1.g:141:11: SUBEQ
                    {
                    SUBEQ43=(Token)match(input,SUBEQ,FOLLOW_SUBEQ_in_assignOp614); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SUBEQ.add(SUBEQ43);



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
                    // 141:18: -> SUBEQ[$SUBEQ]
                    {
                        adaptor.addChild(root_0, new AssignOperationNode(SUBEQ, SUBEQ43));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // TinyHaxeTry1.g:142:11: SLASHEQ
                    {
                    SLASHEQ44=(Token)match(input,SLASHEQ,FOLLOW_SLASHEQ_in_assignOp635); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SLASHEQ.add(SLASHEQ44);



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
                    // 142:20: -> SLASHEQ[$SLASHEQ]
                    {
                        adaptor.addChild(root_0, new AssignOperationNode(SLASHEQ, SLASHEQ44));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // TinyHaxeTry1.g:143:4: PERCENTEQ
                    {
                    PERCENTEQ45=(Token)match(input,PERCENTEQ,FOLLOW_PERCENTEQ_in_assignOp649); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PERCENTEQ.add(PERCENTEQ45);



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
                    // 143:14: -> PERCENTEQ[$PERCENTEQ]
                    {
                        adaptor.addChild(root_0, new AssignOperationNode(PERCENTEQ, PERCENTEQ45));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    // TinyHaxeTry1.g:144:4: AMPEQ
                    {
                    AMPEQ46=(Token)match(input,AMPEQ,FOLLOW_AMPEQ_in_assignOp662); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AMPEQ.add(AMPEQ46);



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
                    // 144:11: -> AMPEQ[$AMPEQ]
                    {
                        adaptor.addChild(root_0, new AssignOperationNode(AMPEQ, AMPEQ46));

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
            if ( state.backtracking>0 ) { memoize(input, 17, assignOp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "assignOp"

    public static class funcLit_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "funcLit"
    // TinyHaxeTry1.g:147:1: funcLit : FUNCTION LPAREN paramList RPAREN ( typeTagOpt )? block -> ^( FUNCTION ( paramList )? ( typeTagOpt )? ( block )? ) ;
    public final TinyHaxeTry1Parser.funcLit_return funcLit() throws RecognitionException {
        TinyHaxeTry1Parser.funcLit_return retval = new TinyHaxeTry1Parser.funcLit_return();
        retval.start = input.LT(1);
        int funcLit_StartIndex = input.index();
        Object root_0 = null;

        Token FUNCTION47=null;
        Token LPAREN48=null;
        Token RPAREN50=null;
        TinyHaxeTry1Parser.paramList_return paramList49 = null;

        TinyHaxeTry1Parser.typeTagOpt_return typeTagOpt51 = null;

        TinyHaxeTry1Parser.block_return block52 = null;


        Object FUNCTION47_tree=null;
        Object LPAREN48_tree=null;
        Object RPAREN50_tree=null;
        RewriteRuleTokenStream stream_FUNCTION=new RewriteRuleTokenStream(adaptor,"token FUNCTION");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_paramList=new RewriteRuleSubtreeStream(adaptor,"rule paramList");
        RewriteRuleSubtreeStream stream_typeTagOpt=new RewriteRuleSubtreeStream(adaptor,"rule typeTagOpt");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return retval; }
            // TinyHaxeTry1.g:147:9: ( FUNCTION LPAREN paramList RPAREN ( typeTagOpt )? block -> ^( FUNCTION ( paramList )? ( typeTagOpt )? ( block )? ) )
            // TinyHaxeTry1.g:147:11: FUNCTION LPAREN paramList RPAREN ( typeTagOpt )? block
            {
            FUNCTION47=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcLit682); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION47);

            LPAREN48=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcLit684); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN48);

            pushFollow(FOLLOW_paramList_in_funcLit686);
            paramList49=paramList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_paramList.add(paramList49.getTree());
            RPAREN50=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcLit688); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN50);

            // TinyHaxeTry1.g:147:44: ( typeTagOpt )?
            int alt16=2;
            switch ( input.LA(1) ) {
                case COLON:
                    {
                    alt16=1;
                    }
                    break;
                case LBRACE:
                    {
                    int LA16_2 = input.LA(2);

                    if ( (synpred26_TinyHaxeTry1()) ) {
                        alt16=1;
                    }
                    }
                    break;
                case SEMI:
                    {
                    int LA16_3 = input.LA(2);

                    if ( (synpred26_TinyHaxeTry1()) ) {
                        alt16=1;
                    }
                    }
                    break;
            }

            switch (alt16) {
                case 1 :
                    // TinyHaxeTry1.g:0:0: typeTagOpt
                    {
                    pushFollow(FOLLOW_typeTagOpt_in_funcLit690);
                    typeTagOpt51=typeTagOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeTagOpt.add(typeTagOpt51.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_block_in_funcLit693);
            block52=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block52.getTree());


            // AST REWRITE
            // elements: block, FUNCTION, typeTagOpt, paramList
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 147:62: -> ^( FUNCTION ( paramList )? ( typeTagOpt )? ( block )? )
            {
                // TinyHaxeTry1.g:147:65: ^( FUNCTION ( paramList )? ( typeTagOpt )? ( block )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new FunctionNode(stream_FUNCTION.nextToken()), root_1);

                // TinyHaxeTry1.g:147:90: ( paramList )?
                if ( stream_paramList.hasNext() ) {
                    adaptor.addChild(root_1, stream_paramList.nextTree());

                }
                stream_paramList.reset();
                // TinyHaxeTry1.g:147:101: ( typeTagOpt )?
                if ( stream_typeTagOpt.hasNext() ) {
                    adaptor.addChild(root_1, stream_typeTagOpt.nextTree());

                }
                stream_typeTagOpt.reset();
                // TinyHaxeTry1.g:147:113: ( block )?
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
            if ( state.backtracking>0 ) { memoize(input, 18, funcLit_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "funcLit"

    public static class arrayLit_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "arrayLit"
    // TinyHaxeTry1.g:150:1: arrayLit : LBRACKET exprListOpt RBRACKET ;
    public final TinyHaxeTry1Parser.arrayLit_return arrayLit() throws RecognitionException {
        TinyHaxeTry1Parser.arrayLit_return retval = new TinyHaxeTry1Parser.arrayLit_return();
        retval.start = input.LT(1);
        int arrayLit_StartIndex = input.index();
        Object root_0 = null;

        Token LBRACKET53=null;
        Token RBRACKET55=null;
        TinyHaxeTry1Parser.exprListOpt_return exprListOpt54 = null;


        Object LBRACKET53_tree=null;
        Object RBRACKET55_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return retval; }
            // TinyHaxeTry1.g:151:2: ( LBRACKET exprListOpt RBRACKET )
            // TinyHaxeTry1.g:151:4: LBRACKET exprListOpt RBRACKET
            {
            root_0 = (Object)adaptor.nil();

            LBRACKET53=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_arrayLit722); if (state.failed) return retval;
            pushFollow(FOLLOW_exprListOpt_in_arrayLit725);
            exprListOpt54=exprListOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, exprListOpt54.getTree());
            RBRACKET55=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_arrayLit727); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 19, arrayLit_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "arrayLit"

    public static class typeTag_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typeTag"
    // TinyHaxeTry1.g:179:1: typeTag : COLON funcType ;
    public final TinyHaxeTry1Parser.typeTag_return typeTag() throws RecognitionException {
        TinyHaxeTry1Parser.typeTag_return retval = new TinyHaxeTry1Parser.typeTag_return();
        retval.start = input.LT(1);
        int typeTag_StartIndex = input.index();
        Object root_0 = null;

        Token COLON56=null;
        TinyHaxeTry1Parser.funcType_return funcType57 = null;


        Object COLON56_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return retval; }
            // TinyHaxeTry1.g:179:9: ( COLON funcType )
            // TinyHaxeTry1.g:179:11: COLON funcType
            {
            root_0 = (Object)adaptor.nil();

            COLON56=(Token)match(input,COLON,FOLLOW_COLON_in_typeTag746); if (state.failed) return retval;
            pushFollow(FOLLOW_funcType_in_typeTag749);
            funcType57=funcType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, funcType57.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 20, typeTag_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "typeTag"

    public static class typeTagOpt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typeTagOpt"
    // TinyHaxeTry1.g:182:1: typeTagOpt : ( typeTag -> ^( TYPE_TAG[\"TYPE_TAG\",true] ( typeTag )? ) | );
    public final TinyHaxeTry1Parser.typeTagOpt_return typeTagOpt() throws RecognitionException {
        TinyHaxeTry1Parser.typeTagOpt_return retval = new TinyHaxeTry1Parser.typeTagOpt_return();
        retval.start = input.LT(1);
        int typeTagOpt_StartIndex = input.index();
        Object root_0 = null;

        TinyHaxeTry1Parser.typeTag_return typeTag58 = null;


        RewriteRuleSubtreeStream stream_typeTag=new RewriteRuleSubtreeStream(adaptor,"rule typeTag");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return retval; }
            // TinyHaxeTry1.g:183:2: ( typeTag -> ^( TYPE_TAG[\"TYPE_TAG\",true] ( typeTag )? ) | )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==COLON) ) {
                alt17=1;
            }
            else if ( (LA17_0==EOF||LA17_0==SEMI||LA17_0==COMMA||LA17_0==EQ||LA17_0==RPAREN||LA17_0==LBRACE) ) {
                alt17=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // TinyHaxeTry1.g:183:4: typeTag
                    {
                    pushFollow(FOLLOW_typeTag_in_typeTagOpt761);
                    typeTag58=typeTag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeTag.add(typeTag58.getTree());


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
                    // 183:12: -> ^( TYPE_TAG[\"TYPE_TAG\",true] ( typeTag )? )
                    {
                        // TinyHaxeTry1.g:183:15: ^( TYPE_TAG[\"TYPE_TAG\",true] ( typeTag )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new ExtendedCommonTree(TYPE_TAG, "TYPE_TAG", true), root_1);

                        // TinyHaxeTry1.g:183:63: ( typeTag )?
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
                    // TinyHaxeTry1.g:185:2: 
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
            if ( state.backtracking>0 ) { memoize(input, 21, typeTagOpt_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "typeTagOpt"

    public static class typeList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typeList"
    // TinyHaxeTry1.g:187:1: typeList : ( funcType ( COMMA funcType )* | typeConstraint ( COMMA typeConstraint )* );
    public final TinyHaxeTry1Parser.typeList_return typeList() throws RecognitionException {
        TinyHaxeTry1Parser.typeList_return retval = new TinyHaxeTry1Parser.typeList_return();
        retval.start = input.LT(1);
        int typeList_StartIndex = input.index();
        Object root_0 = null;

        Token COMMA60=null;
        Token COMMA63=null;
        TinyHaxeTry1Parser.funcType_return funcType59 = null;

        TinyHaxeTry1Parser.funcType_return funcType61 = null;

        TinyHaxeTry1Parser.typeConstraint_return typeConstraint62 = null;

        TinyHaxeTry1Parser.typeConstraint_return typeConstraint64 = null;


        Object COMMA60_tree=null;
        Object COMMA63_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return retval; }
            // TinyHaxeTry1.g:187:9: ( funcType ( COMMA funcType )* | typeConstraint ( COMMA typeConstraint )* )
            int alt20=2;
            alt20 = dfa20.predict(input);
            switch (alt20) {
                case 1 :
                    // TinyHaxeTry1.g:187:11: funcType ( COMMA funcType )*
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_funcType_in_typeList787);
                    funcType59=funcType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, funcType59.getTree());
                    // TinyHaxeTry1.g:187:20: ( COMMA funcType )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==COMMA) ) {
                            int LA18_2 = input.LA(2);

                            if ( (synpred28_TinyHaxeTry1()) ) {
                                alt18=1;
                            }


                        }


                        switch (alt18) {
                    	case 1 :
                    	    // TinyHaxeTry1.g:187:21: COMMA funcType
                    	    {
                    	    COMMA60=(Token)match(input,COMMA,FOLLOW_COMMA_in_typeList790); if (state.failed) return retval;
                    	    pushFollow(FOLLOW_funcType_in_typeList793);
                    	    funcType61=funcType();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, funcType61.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // TinyHaxeTry1.g:188:4: typeConstraint ( COMMA typeConstraint )*
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_typeConstraint_in_typeList801);
                    typeConstraint62=typeConstraint();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeConstraint62.getTree());
                    // TinyHaxeTry1.g:188:19: ( COMMA typeConstraint )*
                    loop19:
                    do {
                        int alt19=2;
                        alt19 = dfa19.predict(input);
                        switch (alt19) {
                    	case 1 :
                    	    // TinyHaxeTry1.g:188:20: COMMA typeConstraint
                    	    {
                    	    COMMA63=(Token)match(input,COMMA,FOLLOW_COMMA_in_typeList804); if (state.failed) return retval;
                    	    pushFollow(FOLLOW_typeConstraint_in_typeList807);
                    	    typeConstraint64=typeConstraint();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeConstraint64.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop19;
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
            if ( state.backtracking>0 ) { memoize(input, 22, typeList_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "typeList"

    public static class funcType_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "funcType"
    // TinyHaxeTry1.g:191:1: funcType : ( ( type ) ( MINUS_BIGGER type )* | VOID );
    public final TinyHaxeTry1Parser.funcType_return funcType() throws RecognitionException {
        TinyHaxeTry1Parser.funcType_return retval = new TinyHaxeTry1Parser.funcType_return();
        retval.start = input.LT(1);
        int funcType_StartIndex = input.index();
        Object root_0 = null;

        Token MINUS_BIGGER66=null;
        Token VOID68=null;
        TinyHaxeTry1Parser.type_return type65 = null;

        TinyHaxeTry1Parser.type_return type67 = null;


        Object MINUS_BIGGER66_tree=null;
        Object VOID68_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return retval; }
            // TinyHaxeTry1.g:191:9: ( ( type ) ( MINUS_BIGGER type )* | VOID )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==EOF||(LA22_0>=SEMI && LA22_0<=PRIVATE)||(LA22_0>=IMPORT && LA22_0<=USING)||LA22_0==DYNAMIC||(LA22_0>=COMMA && LA22_0<=AMPEQ)||(LA22_0>=LPAREN && LA22_0<=RPAREN)||(LA22_0>=RBRACKET && LA22_0<=MINUS_BIGGER)||(LA22_0>=INT && LA22_0<=GTGT)||LA22_0==IN||(LA22_0>=LBRACE && LA22_0<=RBRACE)||LA22_0==ELSE||(LA22_0>=ELLIPSIS && LA22_0<=PERCENT)||LA22_0==ENUM||(LA22_0>=CLASS && LA22_0<=TYPEDEF)) ) {
                alt22=1;
            }
            else if ( (LA22_0==VOID) ) {
                int LA22_2 = input.LA(2);

                if ( (synpred32_TinyHaxeTry1()) ) {
                    alt22=1;
                }
                else if ( (true) ) {
                    alt22=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 22, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // TinyHaxeTry1.g:191:11: ( type ) ( MINUS_BIGGER type )*
                    {
                    root_0 = (Object)adaptor.nil();

                    // TinyHaxeTry1.g:191:11: ( type )
                    // TinyHaxeTry1.g:191:12: type
                    {
                    pushFollow(FOLLOW_type_in_funcType822);
                    type65=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, type65.getTree());

                    }

                    // TinyHaxeTry1.g:191:18: ( MINUS_BIGGER type )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==MINUS_BIGGER) ) {
                            int LA21_2 = input.LA(2);

                            if ( (synpred31_TinyHaxeTry1()) ) {
                                alt21=1;
                            }


                        }


                        switch (alt21) {
                    	case 1 :
                    	    // TinyHaxeTry1.g:191:19: MINUS_BIGGER type
                    	    {
                    	    MINUS_BIGGER66=(Token)match(input,MINUS_BIGGER,FOLLOW_MINUS_BIGGER_in_funcType826); if (state.failed) return retval;
                    	    pushFollow(FOLLOW_type_in_funcType829);
                    	    type67=type();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, type67.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // TinyHaxeTry1.g:192:4: VOID
                    {
                    root_0 = (Object)adaptor.nil();

                    VOID68=(Token)match(input,VOID,FOLLOW_VOID_in_funcType836); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    VOID68_tree = (Object)adaptor.create(VOID68);
                    adaptor.addChild(root_0, VOID68_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 23, funcType_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "funcType"

    public static class primitiveType_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "primitiveType"
    // TinyHaxeTry1.g:195:1: primitiveType : ( INT | FLOAT | DYNAMIC | BOOLEAN | VOID );
    public final TinyHaxeTry1Parser.primitiveType_return primitiveType() throws RecognitionException {
        TinyHaxeTry1Parser.primitiveType_return retval = new TinyHaxeTry1Parser.primitiveType_return();
        retval.start = input.LT(1);
        int primitiveType_StartIndex = input.index();
        Object root_0 = null;

        Token set69=null;

        Object set69_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return retval; }
            // TinyHaxeTry1.g:196:2: ( INT | FLOAT | DYNAMIC | BOOLEAN | VOID )
            // TinyHaxeTry1.g:
            {
            root_0 = (Object)adaptor.nil();

            set69=(Token)input.LT(1);
            if ( input.LA(1)==DYNAMIC||(input.LA(1)>=VOID && input.LA(1)<=BOOLEAN) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set69));
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
            if ( state.backtracking>0 ) { memoize(input, 24, primitiveType_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "primitiveType"

    public static class type_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "type"
    // TinyHaxeTry1.g:199:1: type : ( ( anonType | dotIdent | primitiveType ) ( typeParam )* | );
    public final TinyHaxeTry1Parser.type_return type() throws RecognitionException {
        TinyHaxeTry1Parser.type_return retval = new TinyHaxeTry1Parser.type_return();
        retval.start = input.LT(1);
        int type_StartIndex = input.index();
        Object root_0 = null;

        TinyHaxeTry1Parser.anonType_return anonType70 = null;

        TinyHaxeTry1Parser.dotIdent_return dotIdent71 = null;

        TinyHaxeTry1Parser.primitiveType_return primitiveType72 = null;

        TinyHaxeTry1Parser.typeParam_return typeParam73 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return retval; }
            // TinyHaxeTry1.g:199:6: ( ( anonType | dotIdent | primitiveType ) ( typeParam )* | )
            int alt25=2;
            alt25 = dfa25.predict(input);
            switch (alt25) {
                case 1 :
                    // TinyHaxeTry1.g:199:8: ( anonType | dotIdent | primitiveType ) ( typeParam )*
                    {
                    root_0 = (Object)adaptor.nil();

                    // TinyHaxeTry1.g:199:8: ( anonType | dotIdent | primitiveType )
                    int alt23=3;
                    switch ( input.LA(1) ) {
                    case LBRACE:
                        {
                        alt23=1;
                        }
                        break;
                    case IDENTIFIER:
                        {
                        alt23=2;
                        }
                        break;
                    case DYNAMIC:
                    case VOID:
                    case INT:
                    case FLOAT:
                    case BOOLEAN:
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
                            // TinyHaxeTry1.g:199:9: anonType
                            {
                            pushFollow(FOLLOW_anonType_in_type875);
                            anonType70=anonType();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, anonType70.getTree());

                            }
                            break;
                        case 2 :
                            // TinyHaxeTry1.g:199:20: dotIdent
                            {
                            pushFollow(FOLLOW_dotIdent_in_type879);
                            dotIdent71=dotIdent();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, dotIdent71.getTree());

                            }
                            break;
                        case 3 :
                            // TinyHaxeTry1.g:199:31: primitiveType
                            {
                            pushFollow(FOLLOW_primitiveType_in_type883);
                            primitiveType72=primitiveType();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveType72.getTree());

                            }
                            break;

                    }

                    // TinyHaxeTry1.g:199:47: ( typeParam )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==LT) ) {
                            int LA24_2 = input.LA(2);

                            if ( (synpred39_TinyHaxeTry1()) ) {
                                alt24=1;
                            }


                        }


                        switch (alt24) {
                    	case 1 :
                    	    // TinyHaxeTry1.g:199:48: typeParam
                    	    {
                    	    pushFollow(FOLLOW_typeParam_in_type888);
                    	    typeParam73=typeParam();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeParam73.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // TinyHaxeTry1.g:201:2: 
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
            if ( state.backtracking>0 ) { memoize(input, 25, type_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "type"

    public static class typeParam_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typeParam"
    // TinyHaxeTry1.g:203:1: typeParam : LT ( type | typeList ) ( GT | GTGT | ) ;
    public final TinyHaxeTry1Parser.typeParam_return typeParam() throws RecognitionException {
        TinyHaxeTry1Parser.typeParam_return retval = new TinyHaxeTry1Parser.typeParam_return();
        retval.start = input.LT(1);
        int typeParam_StartIndex = input.index();
        Object root_0 = null;

        Token LT74=null;
        Token GT77=null;
        Token GTGT78=null;
        TinyHaxeTry1Parser.type_return type75 = null;

        TinyHaxeTry1Parser.typeList_return typeList76 = null;


        Object LT74_tree=null;
        Object GT77_tree=null;
        Object GTGT78_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return retval; }
            // TinyHaxeTry1.g:204:2: ( LT ( type | typeList ) ( GT | GTGT | ) )
            // TinyHaxeTry1.g:204:4: LT ( type | typeList ) ( GT | GTGT | )
            {
            root_0 = (Object)adaptor.nil();

            LT74=(Token)match(input,LT,FOLLOW_LT_in_typeParam906); if (state.failed) return retval;
            // TinyHaxeTry1.g:204:8: ( type | typeList )
            int alt26=2;
            alt26 = dfa26.predict(input);
            switch (alt26) {
                case 1 :
                    // TinyHaxeTry1.g:204:9: type
                    {
                    pushFollow(FOLLOW_type_in_typeParam910);
                    type75=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, type75.getTree());

                    }
                    break;
                case 2 :
                    // TinyHaxeTry1.g:204:14: typeList
                    {
                    pushFollow(FOLLOW_typeList_in_typeParam912);
                    typeList76=typeList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeList76.getTree());

                    }
                    break;

            }

            // TinyHaxeTry1.g:204:24: ( GT | GTGT | )
            int alt27=3;
            switch ( input.LA(1) ) {
            case GT:
                {
                int LA27_1 = input.LA(2);

                if ( (synpred42_TinyHaxeTry1()) ) {
                    alt27=1;
                }
                else if ( (true) ) {
                    alt27=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 27, 1, input);

                    throw nvae;
                }
                }
                break;
            case GTGT:
                {
                int LA27_2 = input.LA(2);

                if ( (synpred43_TinyHaxeTry1()) ) {
                    alt27=2;
                }
                else if ( (true) ) {
                    alt27=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 27, 2, input);

                    throw nvae;
                }
                }
                break;
            case EOF:
            case SEMI:
            case MONKEYS_AT:
            case COLON:
            case EXTERN:
            case PRIVATE:
            case IMPORT:
            case USING:
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
            case MINUS_BIGGER:
            case LT:
            case IN:
            case LBRACE:
            case RBRACE:
            case ELSE:
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
            case CLASS:
            case INTERFACE:
            case EXTENDS:
            case IMPLEMENTS:
            case TYPEDEF:
                {
                alt27=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // TinyHaxeTry1.g:204:25: GT
                    {
                    GT77=(Token)match(input,GT,FOLLOW_GT_in_typeParam916); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // TinyHaxeTry1.g:204:29: GTGT
                    {
                    GTGT78=(Token)match(input,GTGT,FOLLOW_GTGT_in_typeParam919); if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // TinyHaxeTry1.g:204:35: 
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
            if ( state.backtracking>0 ) { memoize(input, 26, typeParam_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "typeParam"

    public static class typeParamOpt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typeParamOpt"
    // TinyHaxeTry1.g:208:1: typeParamOpt : ( typeParam -> ^( TYPE_PARAM_OPT[\"TYPE_PARAM_OPT\",true] ( typeParam )? ) | );
    public final TinyHaxeTry1Parser.typeParamOpt_return typeParamOpt() throws RecognitionException {
        TinyHaxeTry1Parser.typeParamOpt_return retval = new TinyHaxeTry1Parser.typeParamOpt_return();
        retval.start = input.LT(1);
        int typeParamOpt_StartIndex = input.index();
        Object root_0 = null;

        TinyHaxeTry1Parser.typeParam_return typeParam79 = null;


        RewriteRuleSubtreeStream stream_typeParam=new RewriteRuleSubtreeStream(adaptor,"rule typeParam");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return retval; }
            // TinyHaxeTry1.g:209:2: ( typeParam -> ^( TYPE_PARAM_OPT[\"TYPE_PARAM_OPT\",true] ( typeParam )? ) | )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==LT) ) {
                int LA28_1 = input.LA(2);

                if ( (synpred44_TinyHaxeTry1()) ) {
                    alt28=1;
                }
                else if ( (true) ) {
                    alt28=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 28, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA28_0==EOF||LA28_0==SEMI||LA28_0==COLON||(LA28_0>=COMMA && LA28_0<=AMPEQ)||(LA28_0>=LPAREN && LA28_0<=RPAREN)||LA28_0==RBRACKET||LA28_0==GT||LA28_0==IN||(LA28_0>=LBRACE && LA28_0<=RBRACE)||LA28_0==ELSE||(LA28_0>=ELLIPSIS && LA28_0<=PERCENT)||(LA28_0>=EXTENDS && LA28_0<=IMPLEMENTS)) ) {
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
                    // TinyHaxeTry1.g:209:4: typeParam
                    {
                    pushFollow(FOLLOW_typeParam_in_typeParamOpt941);
                    typeParam79=typeParam();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeParam.add(typeParam79.getTree());


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
                    // 209:13: -> ^( TYPE_PARAM_OPT[\"TYPE_PARAM_OPT\",true] ( typeParam )? )
                    {
                        // TinyHaxeTry1.g:209:16: ^( TYPE_PARAM_OPT[\"TYPE_PARAM_OPT\",true] ( typeParam )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new ExtendedCommonTree(TYPE_PARAM_OPT, "TYPE_PARAM_OPT", true), root_1);

                        // TinyHaxeTry1.g:209:76: ( typeParam )?
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
                    // TinyHaxeTry1.g:211:9: 
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
            if ( state.backtracking>0 ) { memoize(input, 27, typeParamOpt_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "typeParamOpt"

    public static class typeConstraint_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typeConstraint"
    // TinyHaxeTry1.g:213:1: typeConstraint : IDENTIFIER COLON LPAREN typeList RPAREN -> ^( $typeConstraint ( IDENTIFIER )? ( typeList )? ) ;
    public final TinyHaxeTry1Parser.typeConstraint_return typeConstraint() throws RecognitionException {
        TinyHaxeTry1Parser.typeConstraint_return retval = new TinyHaxeTry1Parser.typeConstraint_return();
        retval.start = input.LT(1);
        int typeConstraint_StartIndex = input.index();
        Object root_0 = null;

        Token IDENTIFIER80=null;
        Token COLON81=null;
        Token LPAREN82=null;
        Token RPAREN84=null;
        TinyHaxeTry1Parser.typeList_return typeList83 = null;


        Object IDENTIFIER80_tree=null;
        Object COLON81_tree=null;
        Object LPAREN82_tree=null;
        Object RPAREN84_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_typeList=new RewriteRuleSubtreeStream(adaptor,"rule typeList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return retval; }
            // TinyHaxeTry1.g:213:19: ( IDENTIFIER COLON LPAREN typeList RPAREN -> ^( $typeConstraint ( IDENTIFIER )? ( typeList )? ) )
            // TinyHaxeTry1.g:213:21: IDENTIFIER COLON LPAREN typeList RPAREN
            {
            IDENTIFIER80=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_typeConstraint984); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER80);

            COLON81=(Token)match(input,COLON,FOLLOW_COLON_in_typeConstraint986); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COLON.add(COLON81);

            LPAREN82=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_typeConstraint988); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN82);

            pushFollow(FOLLOW_typeList_in_typeConstraint990);
            typeList83=typeList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeList.add(typeList83.getTree());
            RPAREN84=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_typeConstraint992); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN84);



            // AST REWRITE
            // elements: IDENTIFIER, typeConstraint, typeList
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 213:61: -> ^( $typeConstraint ( IDENTIFIER )? ( typeList )? )
            {
                // TinyHaxeTry1.g:213:64: ^( $typeConstraint ( IDENTIFIER )? ( typeList )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_retval.nextNode(), root_1);

                // TinyHaxeTry1.g:213:82: ( IDENTIFIER )?
                if ( stream_IDENTIFIER.hasNext() ) {
                    adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());

                }
                stream_IDENTIFIER.reset();
                // TinyHaxeTry1.g:213:94: ( typeList )?
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
            if ( state.backtracking>0 ) { memoize(input, 28, typeConstraint_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "typeConstraint"

    public static class functionReturn_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "functionReturn"
    // TinyHaxeTry1.g:217:1: functionReturn : ( declAttrList )? FUNCTION NEW LPAREN paramList RPAREN typeTagOpt block -> ^( FUNCTION NEW ( declAttrList )? ( paramList )? ( typeTagOpt )? ( block )? ) ;
    public final TinyHaxeTry1Parser.functionReturn_return functionReturn() throws RecognitionException {
        TinyHaxeTry1Parser.functionReturn_return retval = new TinyHaxeTry1Parser.functionReturn_return();
        retval.start = input.LT(1);
        int functionReturn_StartIndex = input.index();
        Object root_0 = null;

        Token FUNCTION86=null;
        Token NEW87=null;
        Token LPAREN88=null;
        Token RPAREN90=null;
        TinyHaxeTry1Parser.declAttrList_return declAttrList85 = null;

        TinyHaxeTry1Parser.paramList_return paramList89 = null;

        TinyHaxeTry1Parser.typeTagOpt_return typeTagOpt91 = null;

        TinyHaxeTry1Parser.block_return block92 = null;


        Object FUNCTION86_tree=null;
        Object NEW87_tree=null;
        Object LPAREN88_tree=null;
        Object RPAREN90_tree=null;
        RewriteRuleTokenStream stream_FUNCTION=new RewriteRuleTokenStream(adaptor,"token FUNCTION");
        RewriteRuleTokenStream stream_NEW=new RewriteRuleTokenStream(adaptor,"token NEW");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_declAttrList=new RewriteRuleSubtreeStream(adaptor,"rule declAttrList");
        RewriteRuleSubtreeStream stream_paramList=new RewriteRuleSubtreeStream(adaptor,"rule paramList");
        RewriteRuleSubtreeStream stream_typeTagOpt=new RewriteRuleSubtreeStream(adaptor,"rule typeTagOpt");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return retval; }
            // TinyHaxeTry1.g:218:2: ( ( declAttrList )? FUNCTION NEW LPAREN paramList RPAREN typeTagOpt block -> ^( FUNCTION NEW ( declAttrList )? ( paramList )? ( typeTagOpt )? ( block )? ) )
            // TinyHaxeTry1.g:218:4: ( declAttrList )? FUNCTION NEW LPAREN paramList RPAREN typeTagOpt block
            {
            // TinyHaxeTry1.g:218:4: ( declAttrList )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==PRIVATE||(LA29_0>=PUBLIC && LA29_0<=OVERRIDE)) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // TinyHaxeTry1.g:0:0: declAttrList
                    {
                    pushFollow(FOLLOW_declAttrList_in_functionReturn1018);
                    declAttrList85=declAttrList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declAttrList.add(declAttrList85.getTree());

                    }
                    break;

            }

            FUNCTION86=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_functionReturn1021); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION86);

            NEW87=(Token)match(input,NEW,FOLLOW_NEW_in_functionReturn1023); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_NEW.add(NEW87);

            LPAREN88=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_functionReturn1025); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN88);

            pushFollow(FOLLOW_paramList_in_functionReturn1027);
            paramList89=paramList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_paramList.add(paramList89.getTree());
            RPAREN90=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_functionReturn1029); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN90);

            pushFollow(FOLLOW_typeTagOpt_in_functionReturn1031);
            typeTagOpt91=typeTagOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeTagOpt.add(typeTagOpt91.getTree());
            pushFollow(FOLLOW_block_in_functionReturn1033);
            block92=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block92.getTree());


            // AST REWRITE
            // elements: declAttrList, block, NEW, typeTagOpt, paramList, FUNCTION
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 218:72: -> ^( FUNCTION NEW ( declAttrList )? ( paramList )? ( typeTagOpt )? ( block )? )
            {
                // TinyHaxeTry1.g:218:75: ^( FUNCTION NEW ( declAttrList )? ( paramList )? ( typeTagOpt )? ( block )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new FunctionNode(stream_FUNCTION.nextToken()), root_1);

                adaptor.addChild(root_1, stream_NEW.nextNode());
                // TinyHaxeTry1.g:218:104: ( declAttrList )?
                if ( stream_declAttrList.hasNext() ) {
                    adaptor.addChild(root_1, stream_declAttrList.nextTree());

                }
                stream_declAttrList.reset();
                // TinyHaxeTry1.g:218:118: ( paramList )?
                if ( stream_paramList.hasNext() ) {
                    adaptor.addChild(root_1, stream_paramList.nextTree());

                }
                stream_paramList.reset();
                // TinyHaxeTry1.g:218:129: ( typeTagOpt )?
                if ( stream_typeTagOpt.hasNext() ) {
                    adaptor.addChild(root_1, stream_typeTagOpt.nextTree());

                }
                stream_typeTagOpt.reset();
                // TinyHaxeTry1.g:218:141: ( block )?
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
            if ( state.backtracking>0 ) { memoize(input, 29, functionReturn_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "functionReturn"

    public static class statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "statement"
    // TinyHaxeTry1.g:221:1: statement : ( varDecl | block | IDENTIFIER COLON statement -> ^( COLON ( IDENTIFIER )? ( statement )? ) | ifStmt | FOR LPAREN exp1= expr IN exp2= expr RPAREN statement -> ^( FOR ^( IN $exp1 $exp2) ( statement )? ) | WHILE parExpression statement -> ^( WHILE ( parExpression )? ( statement )? ) | DO statement WHILE parExpression -> ^( DO ( parExpression )? ( statement )? ) | TRY block catchStmtList -> ^( TRY ( block )? ( catchStmtList )? ) | switchStmt | RETURN ( expr )? SEMI -> ^( RETURN ( expr )? ) | THROW expr SEMI -> ^( THROW ( expr )? ) | BREAK ( IDENTIFIER )? SEMI -> ^( BREAK ( IDENTIFIER )? ) | CONTINUE ( IDENTIFIER )? SEMI -> ^( CONTINUE ( IDENTIFIER )? ) | expr SEMI | SEMI );
    public final TinyHaxeTry1Parser.statement_return statement() throws RecognitionException {
        TinyHaxeTry1Parser.statement_return retval = new TinyHaxeTry1Parser.statement_return();
        retval.start = input.LT(1);
        int statement_StartIndex = input.index();
        Object root_0 = null;

        Token IDENTIFIER95=null;
        Token COLON96=null;
        Token FOR99=null;
        Token LPAREN100=null;
        Token IN101=null;
        Token RPAREN102=null;
        Token WHILE104=null;
        Token DO107=null;
        Token WHILE109=null;
        Token TRY111=null;
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
        Token SEMI129=null;
        TinyHaxeTry1Parser.expr_return exp1 = null;

        TinyHaxeTry1Parser.expr_return exp2 = null;

        TinyHaxeTry1Parser.varDecl_return varDecl93 = null;

        TinyHaxeTry1Parser.block_return block94 = null;

        TinyHaxeTry1Parser.statement_return statement97 = null;

        TinyHaxeTry1Parser.ifStmt_return ifStmt98 = null;

        TinyHaxeTry1Parser.statement_return statement103 = null;

        TinyHaxeTry1Parser.parExpression_return parExpression105 = null;

        TinyHaxeTry1Parser.statement_return statement106 = null;

        TinyHaxeTry1Parser.statement_return statement108 = null;

        TinyHaxeTry1Parser.parExpression_return parExpression110 = null;

        TinyHaxeTry1Parser.block_return block112 = null;

        TinyHaxeTry1Parser.catchStmtList_return catchStmtList113 = null;

        TinyHaxeTry1Parser.switchStmt_return switchStmt114 = null;

        TinyHaxeTry1Parser.expr_return expr116 = null;

        TinyHaxeTry1Parser.expr_return expr119 = null;

        TinyHaxeTry1Parser.expr_return expr127 = null;


        Object IDENTIFIER95_tree=null;
        Object COLON96_tree=null;
        Object FOR99_tree=null;
        Object LPAREN100_tree=null;
        Object IN101_tree=null;
        Object RPAREN102_tree=null;
        Object WHILE104_tree=null;
        Object DO107_tree=null;
        Object WHILE109_tree=null;
        Object TRY111_tree=null;
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
        Object SEMI129_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_IN=new RewriteRuleTokenStream(adaptor,"token IN");
        RewriteRuleTokenStream stream_WHILE=new RewriteRuleTokenStream(adaptor,"token WHILE");
        RewriteRuleTokenStream stream_CONTINUE=new RewriteRuleTokenStream(adaptor,"token CONTINUE");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_RETURN=new RewriteRuleTokenStream(adaptor,"token RETURN");
        RewriteRuleTokenStream stream_FOR=new RewriteRuleTokenStream(adaptor,"token FOR");
        RewriteRuleTokenStream stream_DO=new RewriteRuleTokenStream(adaptor,"token DO");
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleTokenStream stream_BREAK=new RewriteRuleTokenStream(adaptor,"token BREAK");
        RewriteRuleTokenStream stream_TRY=new RewriteRuleTokenStream(adaptor,"token TRY");
        RewriteRuleTokenStream stream_THROW=new RewriteRuleTokenStream(adaptor,"token THROW");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_parExpression=new RewriteRuleSubtreeStream(adaptor,"rule parExpression");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_catchStmtList=new RewriteRuleSubtreeStream(adaptor,"rule catchStmtList");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return retval; }
            // TinyHaxeTry1.g:222:2: ( varDecl | block | IDENTIFIER COLON statement -> ^( COLON ( IDENTIFIER )? ( statement )? ) | ifStmt | FOR LPAREN exp1= expr IN exp2= expr RPAREN statement -> ^( FOR ^( IN $exp1 $exp2) ( statement )? ) | WHILE parExpression statement -> ^( WHILE ( parExpression )? ( statement )? ) | DO statement WHILE parExpression -> ^( DO ( parExpression )? ( statement )? ) | TRY block catchStmtList -> ^( TRY ( block )? ( catchStmtList )? ) | switchStmt | RETURN ( expr )? SEMI -> ^( RETURN ( expr )? ) | THROW expr SEMI -> ^( THROW ( expr )? ) | BREAK ( IDENTIFIER )? SEMI -> ^( BREAK ( IDENTIFIER )? ) | CONTINUE ( IDENTIFIER )? SEMI -> ^( CONTINUE ( IDENTIFIER )? ) | expr SEMI | SEMI )
            int alt33=15;
            alt33 = dfa33.predict(input);
            switch (alt33) {
                case 1 :
                    // TinyHaxeTry1.g:222:4: varDecl
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_varDecl_in_statement1070);
                    varDecl93=varDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDecl93.getTree());

                    }
                    break;
                case 2 :
                    // TinyHaxeTry1.g:223:4: block
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_block_in_statement1075);
                    block94=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, block94.getTree());

                    }
                    break;
                case 3 :
                    // TinyHaxeTry1.g:224:4: IDENTIFIER COLON statement
                    {
                    IDENTIFIER95=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_statement1080); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER95);

                    COLON96=(Token)match(input,COLON,FOLLOW_COLON_in_statement1082); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(COLON96);

                    pushFollow(FOLLOW_statement_in_statement1084);
                    statement97=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement97.getTree());


                    // AST REWRITE
                    // elements: statement, COLON, IDENTIFIER
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 224:35: -> ^( COLON ( IDENTIFIER )? ( statement )? )
                    {
                        // TinyHaxeTry1.g:224:38: ^( COLON ( IDENTIFIER )? ( statement )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_COLON.nextNode(), root_1);

                        // TinyHaxeTry1.g:224:46: ( IDENTIFIER )?
                        if ( stream_IDENTIFIER.hasNext() ) {
                            adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());

                        }
                        stream_IDENTIFIER.reset();
                        // TinyHaxeTry1.g:224:58: ( statement )?
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
                case 4 :
                    // TinyHaxeTry1.g:225:4: ifStmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ifStmt_in_statement1105);
                    ifStmt98=ifStmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ifStmt98.getTree());

                    }
                    break;
                case 5 :
                    // TinyHaxeTry1.g:226:4: FOR LPAREN exp1= expr IN exp2= expr RPAREN statement
                    {
                    FOR99=(Token)match(input,FOR,FOLLOW_FOR_in_statement1110); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FOR.add(FOR99);

                    LPAREN100=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_statement1112); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN100);

                    pushFollow(FOLLOW_expr_in_statement1116);
                    exp1=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(exp1.getTree());
                    IN101=(Token)match(input,IN,FOLLOW_IN_in_statement1118); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IN.add(IN101);

                    pushFollow(FOLLOW_expr_in_statement1122);
                    exp2=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(exp2.getTree());
                    RPAREN102=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_statement1124); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN102);

                    pushFollow(FOLLOW_statement_in_statement1126);
                    statement103=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement103.getTree());


                    // AST REWRITE
                    // elements: exp1, exp2, IN, statement, FOR
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
                    // 226:56: -> ^( FOR ^( IN $exp1 $exp2) ( statement )? )
                    {
                        // TinyHaxeTry1.g:226:59: ^( FOR ^( IN $exp1 $exp2) ( statement )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new ForNode(stream_FOR.nextToken()), root_1);

                        // TinyHaxeTry1.g:226:74: ^( IN $exp1 $exp2)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_IN.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_exp1.nextTree());
                        adaptor.addChild(root_2, stream_exp2.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // TinyHaxeTry1.g:226:92: ( statement )?
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
                    // TinyHaxeTry1.g:227:4: WHILE parExpression statement
                    {
                    WHILE104=(Token)match(input,WHILE,FOLLOW_WHILE_in_statement1154); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHILE.add(WHILE104);

                    pushFollow(FOLLOW_parExpression_in_statement1156);
                    parExpression105=parExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_parExpression.add(parExpression105.getTree());
                    pushFollow(FOLLOW_statement_in_statement1158);
                    statement106=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement106.getTree());


                    // AST REWRITE
                    // elements: WHILE, statement, parExpression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 227:38: -> ^( WHILE ( parExpression )? ( statement )? )
                    {
                        // TinyHaxeTry1.g:227:41: ^( WHILE ( parExpression )? ( statement )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new WhileNode(stream_WHILE.nextToken()), root_1);

                        // TinyHaxeTry1.g:227:60: ( parExpression )?
                        if ( stream_parExpression.hasNext() ) {
                            adaptor.addChild(root_1, stream_parExpression.nextTree());

                        }
                        stream_parExpression.reset();
                        // TinyHaxeTry1.g:227:75: ( statement )?
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
                    // TinyHaxeTry1.g:228:4: DO statement WHILE parExpression
                    {
                    DO107=(Token)match(input,DO,FOLLOW_DO_in_statement1182); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DO.add(DO107);

                    pushFollow(FOLLOW_statement_in_statement1184);
                    statement108=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement108.getTree());
                    WHILE109=(Token)match(input,WHILE,FOLLOW_WHILE_in_statement1186); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHILE.add(WHILE109);

                    pushFollow(FOLLOW_parExpression_in_statement1188);
                    parExpression110=parExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_parExpression.add(parExpression110.getTree());


                    // AST REWRITE
                    // elements: parExpression, statement, DO
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 228:40: -> ^( DO ( parExpression )? ( statement )? )
                    {
                        // TinyHaxeTry1.g:228:43: ^( DO ( parExpression )? ( statement )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new DoWhileNode(stream_DO.nextToken()), root_1);

                        // TinyHaxeTry1.g:228:61: ( parExpression )?
                        if ( stream_parExpression.hasNext() ) {
                            adaptor.addChild(root_1, stream_parExpression.nextTree());

                        }
                        stream_parExpression.reset();
                        // TinyHaxeTry1.g:228:76: ( statement )?
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
                    // TinyHaxeTry1.g:229:4: TRY block catchStmtList
                    {
                    TRY111=(Token)match(input,TRY,FOLLOW_TRY_in_statement1211); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TRY.add(TRY111);

                    pushFollow(FOLLOW_block_in_statement1213);
                    block112=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block112.getTree());
                    pushFollow(FOLLOW_catchStmtList_in_statement1215);
                    catchStmtList113=catchStmtList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_catchStmtList.add(catchStmtList113.getTree());


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
                    // 229:32: -> ^( TRY ( block )? ( catchStmtList )? )
                    {
                        // TinyHaxeTry1.g:229:35: ^( TRY ( block )? ( catchStmtList )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new TryNode(stream_TRY.nextToken()), root_1);

                        // TinyHaxeTry1.g:229:50: ( block )?
                        if ( stream_block.hasNext() ) {
                            adaptor.addChild(root_1, stream_block.nextTree());

                        }
                        stream_block.reset();
                        // TinyHaxeTry1.g:229:57: ( catchStmtList )?
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
                    // TinyHaxeTry1.g:230:4: switchStmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_switchStmt_in_statement1239);
                    switchStmt114=switchStmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, switchStmt114.getTree());

                    }
                    break;
                case 10 :
                    // TinyHaxeTry1.g:231:4: RETURN ( expr )? SEMI
                    {
                    RETURN115=(Token)match(input,RETURN,FOLLOW_RETURN_in_statement1244); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RETURN.add(RETURN115);

                    // TinyHaxeTry1.g:231:11: ( expr )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==IDENTIFIER||(LA30_0>=QUES && LA30_0<=LPAREN)||LA30_0==LBRACKET||(LA30_0>=LT && LA30_0<=GT)||LA30_0==NEW||(LA30_0>=SWITCH && LA30_0<=LBRACE)||LA30_0==IF||(LA30_0>=UNTYPED && LA30_0<=CAST)||(LA30_0>=LONGLITERAL && LA30_0<=FALSE)) ) {
                        alt30=1;
                    }
                    else if ( (LA30_0==SEMI) ) {
                        int LA30_2 = input.LA(2);

                        if ( (synpred55_TinyHaxeTry1()) ) {
                            alt30=1;
                        }
                    }
                    switch (alt30) {
                        case 1 :
                            // TinyHaxeTry1.g:231:12: expr
                            {
                            pushFollow(FOLLOW_expr_in_statement1247);
                            expr116=expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expr.add(expr116.getTree());

                            }
                            break;

                    }

                    SEMI117=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement1251); if (state.failed) return retval; 
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
                    // 231:29: -> ^( RETURN ( expr )? )
                    {
                        // TinyHaxeTry1.g:231:32: ^( RETURN ( expr )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_RETURN.nextNode(), root_1);

                        // TinyHaxeTry1.g:231:41: ( expr )?
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
                    // TinyHaxeTry1.g:232:4: THROW expr SEMI
                    {
                    THROW118=(Token)match(input,THROW,FOLLOW_THROW_in_statement1270); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THROW.add(THROW118);

                    pushFollow(FOLLOW_expr_in_statement1272);
                    expr119=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr119.getTree());
                    SEMI120=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement1274); if (state.failed) return retval; 
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
                    // 232:26: -> ^( THROW ( expr )? )
                    {
                        // TinyHaxeTry1.g:232:29: ^( THROW ( expr )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_THROW.nextNode(), root_1);

                        // TinyHaxeTry1.g:232:37: ( expr )?
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
                    // TinyHaxeTry1.g:233:4: BREAK ( IDENTIFIER )? SEMI
                    {
                    BREAK121=(Token)match(input,BREAK,FOLLOW_BREAK_in_statement1294); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_BREAK.add(BREAK121);

                    // TinyHaxeTry1.g:233:10: ( IDENTIFIER )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==IDENTIFIER) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // TinyHaxeTry1.g:233:11: IDENTIFIER
                            {
                            IDENTIFIER122=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_statement1297); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER122);


                            }
                            break;

                    }

                    SEMI123=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement1301); if (state.failed) return retval; 
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
                    // 233:33: -> ^( BREAK ( IDENTIFIER )? )
                    {
                        // TinyHaxeTry1.g:233:36: ^( BREAK ( IDENTIFIER )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_BREAK.nextNode(), root_1);

                        // TinyHaxeTry1.g:233:44: ( IDENTIFIER )?
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
                    // TinyHaxeTry1.g:234:4: CONTINUE ( IDENTIFIER )? SEMI
                    {
                    CONTINUE124=(Token)match(input,CONTINUE,FOLLOW_CONTINUE_in_statement1319); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CONTINUE.add(CONTINUE124);

                    // TinyHaxeTry1.g:234:13: ( IDENTIFIER )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==IDENTIFIER) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // TinyHaxeTry1.g:234:14: IDENTIFIER
                            {
                            IDENTIFIER125=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_statement1322); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER125);


                            }
                            break;

                    }

                    SEMI126=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement1326); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI126);



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
                    // 234:36: -> ^( CONTINUE ( IDENTIFIER )? )
                    {
                        // TinyHaxeTry1.g:234:39: ^( CONTINUE ( IDENTIFIER )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_CONTINUE.nextNode(), root_1);

                        // TinyHaxeTry1.g:234:50: ( IDENTIFIER )?
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
                    // TinyHaxeTry1.g:235:4: expr SEMI
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_expr_in_statement1344);
                    expr127=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr127.getTree());
                    SEMI128=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement1346); if (state.failed) return retval;

                    }
                    break;
                case 15 :
                    // TinyHaxeTry1.g:236:4: SEMI
                    {
                    root_0 = (Object)adaptor.nil();

                    SEMI129=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement1352); if (state.failed) return retval;

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

    public static class expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expr"
    // TinyHaxeTry1.g:242:1: expr : ( assignExpr | block | switchStmt | ifExpr );
    public final TinyHaxeTry1Parser.expr_return expr() throws RecognitionException {
        TinyHaxeTry1Parser.expr_return retval = new TinyHaxeTry1Parser.expr_return();
        retval.start = input.LT(1);
        int expr_StartIndex = input.index();
        Object root_0 = null;

        TinyHaxeTry1Parser.assignExpr_return assignExpr130 = null;

        TinyHaxeTry1Parser.block_return block131 = null;

        TinyHaxeTry1Parser.switchStmt_return switchStmt132 = null;

        TinyHaxeTry1Parser.ifExpr_return ifExpr133 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return retval; }
            // TinyHaxeTry1.g:243:2: ( assignExpr | block | switchStmt | ifExpr )
            int alt34=4;
            alt34 = dfa34.predict(input);
            switch (alt34) {
                case 1 :
                    // TinyHaxeTry1.g:243:4: assignExpr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_assignExpr_in_expr1367);
                    assignExpr130=assignExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignExpr130.getTree());

                    }
                    break;
                case 2 :
                    // TinyHaxeTry1.g:244:4: block
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_block_in_expr1373);
                    block131=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, block131.getTree());

                    }
                    break;
                case 3 :
                    // TinyHaxeTry1.g:245:4: switchStmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_switchStmt_in_expr1378);
                    switchStmt132=switchStmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, switchStmt132.getTree());

                    }
                    break;
                case 4 :
                    // TinyHaxeTry1.g:246:4: ifExpr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ifExpr_in_expr1383);
                    ifExpr133=ifExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ifExpr133.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 31, expr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "expr"

    public static class switchStmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "switchStmt"
    // TinyHaxeTry1.g:249:1: switchStmt : SWITCH LPAREN expr RPAREN LBRACE ( caseStmt )+ RBRACE -> ^( SWITCH ( expr )? ( caseStmt )+ ) ;
    public final TinyHaxeTry1Parser.switchStmt_return switchStmt() throws RecognitionException {
        TinyHaxeTry1Parser.switchStmt_return retval = new TinyHaxeTry1Parser.switchStmt_return();
        retval.start = input.LT(1);
        int switchStmt_StartIndex = input.index();
        Object root_0 = null;

        Token SWITCH134=null;
        Token LPAREN135=null;
        Token RPAREN137=null;
        Token LBRACE138=null;
        Token RBRACE140=null;
        TinyHaxeTry1Parser.expr_return expr136 = null;

        TinyHaxeTry1Parser.caseStmt_return caseStmt139 = null;


        Object SWITCH134_tree=null;
        Object LPAREN135_tree=null;
        Object RPAREN137_tree=null;
        Object LBRACE138_tree=null;
        Object RBRACE140_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_SWITCH=new RewriteRuleTokenStream(adaptor,"token SWITCH");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_caseStmt=new RewriteRuleSubtreeStream(adaptor,"rule caseStmt");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return retval; }
            // TinyHaxeTry1.g:250:2: ( SWITCH LPAREN expr RPAREN LBRACE ( caseStmt )+ RBRACE -> ^( SWITCH ( expr )? ( caseStmt )+ ) )
            // TinyHaxeTry1.g:250:4: SWITCH LPAREN expr RPAREN LBRACE ( caseStmt )+ RBRACE
            {
            SWITCH134=(Token)match(input,SWITCH,FOLLOW_SWITCH_in_switchStmt1394); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SWITCH.add(SWITCH134);

            LPAREN135=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_switchStmt1396); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN135);

            pushFollow(FOLLOW_expr_in_switchStmt1398);
            expr136=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr136.getTree());
            RPAREN137=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_switchStmt1400); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN137);

            LBRACE138=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_switchStmt1402); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACE.add(LBRACE138);

            // TinyHaxeTry1.g:250:37: ( caseStmt )+
            int cnt35=0;
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( ((LA35_0>=CASE && LA35_0<=DEFAULT)) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // TinyHaxeTry1.g:0:0: caseStmt
            	    {
            	    pushFollow(FOLLOW_caseStmt_in_switchStmt1404);
            	    caseStmt139=caseStmt();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_caseStmt.add(caseStmt139.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt35 >= 1 ) break loop35;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(35, input);
                        throw eee;
                }
                cnt35++;
            } while (true);

            RBRACE140=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_switchStmt1407); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACE.add(RBRACE140);



            // AST REWRITE
            // elements: SWITCH, caseStmt, expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 250:55: -> ^( SWITCH ( expr )? ( caseStmt )+ )
            {
                // TinyHaxeTry1.g:250:58: ^( SWITCH ( expr )? ( caseStmt )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new SwitchNode(stream_SWITCH.nextToken()), root_1);

                // TinyHaxeTry1.g:250:79: ( expr )?
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

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 32, switchStmt_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "switchStmt"

    public static class ifExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ifExpr"
    // TinyHaxeTry1.g:253:1: ifExpr : IF parExpression st1= expr ( ELSE st2= expr )? -> ^( IF parExpression $st1 ( ^( ELSE $st2) )? ) ;
    public final TinyHaxeTry1Parser.ifExpr_return ifExpr() throws RecognitionException {
        TinyHaxeTry1Parser.ifExpr_return retval = new TinyHaxeTry1Parser.ifExpr_return();
        retval.start = input.LT(1);
        int ifExpr_StartIndex = input.index();
        Object root_0 = null;

        Token IF141=null;
        Token ELSE143=null;
        TinyHaxeTry1Parser.expr_return st1 = null;

        TinyHaxeTry1Parser.expr_return st2 = null;

        TinyHaxeTry1Parser.parExpression_return parExpression142 = null;


        Object IF141_tree=null;
        Object ELSE143_tree=null;
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
        RewriteRuleSubtreeStream stream_parExpression=new RewriteRuleSubtreeStream(adaptor,"rule parExpression");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return retval; }
            // TinyHaxeTry1.g:254:2: ( IF parExpression st1= expr ( ELSE st2= expr )? -> ^( IF parExpression $st1 ( ^( ELSE $st2) )? ) )
            // TinyHaxeTry1.g:254:4: IF parExpression st1= expr ( ELSE st2= expr )?
            {
            IF141=(Token)match(input,IF,FOLLOW_IF_in_ifExpr1434); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IF.add(IF141);

            pushFollow(FOLLOW_parExpression_in_ifExpr1436);
            parExpression142=parExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_parExpression.add(parExpression142.getTree());
            pushFollow(FOLLOW_expr_in_ifExpr1440);
            st1=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(st1.getTree());
            // TinyHaxeTry1.g:254:30: ( ELSE st2= expr )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==ELSE) ) {
                int LA36_1 = input.LA(2);

                if ( (synpred67_TinyHaxeTry1()) ) {
                    alt36=1;
                }
            }
            switch (alt36) {
                case 1 :
                    // TinyHaxeTry1.g:254:31: ELSE st2= expr
                    {
                    ELSE143=(Token)match(input,ELSE,FOLLOW_ELSE_in_ifExpr1443); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ELSE.add(ELSE143);

                    pushFollow(FOLLOW_expr_in_ifExpr1447);
                    st2=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(st2.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: IF, st1, ELSE, st2, parExpression
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
            // 254:48: -> ^( IF parExpression $st1 ( ^( ELSE $st2) )? )
            {
                // TinyHaxeTry1.g:254:51: ^( IF parExpression $st1 ( ^( ELSE $st2) )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new IfNode(stream_IF.nextToken()), root_1);

                adaptor.addChild(root_1, stream_parExpression.nextTree());
                adaptor.addChild(root_1, stream_st1.nextTree());
                // TinyHaxeTry1.g:254:83: ( ^( ELSE $st2) )?
                if ( stream_ELSE.hasNext()||stream_st2.hasNext() ) {
                    // TinyHaxeTry1.g:254:83: ^( ELSE $st2)
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

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 33, ifExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "ifExpr"

    public static class ifStmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ifStmt"
    // TinyHaxeTry1.g:257:1: ifStmt : ( IF parExpression st1= statement ( ELSE st2= statement )? -> ^( IF parExpression $st1 ( ^( ELSE $st2) )? ) | IF parExpression st1= statement ( ELSE st2= statement )? -> ^( IF parExpression $st1 ( ^( ELSE $st2) )? ) );
    public final TinyHaxeTry1Parser.ifStmt_return ifStmt() throws RecognitionException {
        TinyHaxeTry1Parser.ifStmt_return retval = new TinyHaxeTry1Parser.ifStmt_return();
        retval.start = input.LT(1);
        int ifStmt_StartIndex = input.index();
        Object root_0 = null;

        Token IF144=null;
        Token ELSE146=null;
        Token IF147=null;
        Token ELSE149=null;
        TinyHaxeTry1Parser.statement_return st1 = null;

        TinyHaxeTry1Parser.statement_return st2 = null;

        TinyHaxeTry1Parser.parExpression_return parExpression145 = null;

        TinyHaxeTry1Parser.parExpression_return parExpression148 = null;


        Object IF144_tree=null;
        Object ELSE146_tree=null;
        Object IF147_tree=null;
        Object ELSE149_tree=null;
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_parExpression=new RewriteRuleSubtreeStream(adaptor,"rule parExpression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return retval; }
            // TinyHaxeTry1.g:258:2: ( IF parExpression st1= statement ( ELSE st2= statement )? -> ^( IF parExpression $st1 ( ^( ELSE $st2) )? ) | IF parExpression st1= statement ( ELSE st2= statement )? -> ^( IF parExpression $st1 ( ^( ELSE $st2) )? ) )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==IF) ) {
                int LA39_1 = input.LA(2);

                if ( (synpred69_TinyHaxeTry1()) ) {
                    alt39=1;
                }
                else if ( (true) ) {
                    alt39=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 39, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // TinyHaxeTry1.g:258:4: IF parExpression st1= statement ( ELSE st2= statement )?
                    {
                    IF144=(Token)match(input,IF,FOLLOW_IF_in_ifStmt1483); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IF.add(IF144);

                    pushFollow(FOLLOW_parExpression_in_ifStmt1485);
                    parExpression145=parExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_parExpression.add(parExpression145.getTree());
                    pushFollow(FOLLOW_statement_in_ifStmt1489);
                    st1=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(st1.getTree());
                    // TinyHaxeTry1.g:258:35: ( ELSE st2= statement )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==ELSE) ) {
                        int LA37_1 = input.LA(2);

                        if ( (synpred68_TinyHaxeTry1()) ) {
                            alt37=1;
                        }
                    }
                    switch (alt37) {
                        case 1 :
                            // TinyHaxeTry1.g:258:36: ELSE st2= statement
                            {
                            ELSE146=(Token)match(input,ELSE,FOLLOW_ELSE_in_ifStmt1492); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_ELSE.add(ELSE146);

                            pushFollow(FOLLOW_statement_in_ifStmt1496);
                            st2=statement();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_statement.add(st2.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: IF, parExpression, st2, st1, ELSE
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
                    // 258:58: -> ^( IF parExpression $st1 ( ^( ELSE $st2) )? )
                    {
                        // TinyHaxeTry1.g:258:61: ^( IF parExpression $st1 ( ^( ELSE $st2) )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new IfNode(stream_IF.nextToken()), root_1);

                        adaptor.addChild(root_1, stream_parExpression.nextTree());
                        adaptor.addChild(root_1, stream_st1.nextTree());
                        // TinyHaxeTry1.g:258:93: ( ^( ELSE $st2) )?
                        if ( stream_st2.hasNext()||stream_ELSE.hasNext() ) {
                            // TinyHaxeTry1.g:258:93: ^( ELSE $st2)
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
                case 2 :
                    // TinyHaxeTry1.g:259:4: IF parExpression st1= statement ( ELSE st2= statement )?
                    {
                    IF147=(Token)match(input,IF,FOLLOW_IF_in_ifStmt1526); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IF.add(IF147);

                    pushFollow(FOLLOW_parExpression_in_ifStmt1528);
                    parExpression148=parExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_parExpression.add(parExpression148.getTree());
                    pushFollow(FOLLOW_statement_in_ifStmt1532);
                    st1=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(st1.getTree());
                    // TinyHaxeTry1.g:259:35: ( ELSE st2= statement )?
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==ELSE) ) {
                        int LA38_1 = input.LA(2);

                        if ( (synpred70_TinyHaxeTry1()) ) {
                            alt38=1;
                        }
                    }
                    switch (alt38) {
                        case 1 :
                            // TinyHaxeTry1.g:259:36: ELSE st2= statement
                            {
                            ELSE149=(Token)match(input,ELSE,FOLLOW_ELSE_in_ifStmt1535); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_ELSE.add(ELSE149);

                            pushFollow(FOLLOW_statement_in_ifStmt1539);
                            st2=statement();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_statement.add(st2.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: IF, ELSE, parExpression, st1, st2
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
                    // 259:58: -> ^( IF parExpression $st1 ( ^( ELSE $st2) )? )
                    {
                        // TinyHaxeTry1.g:259:61: ^( IF parExpression $st1 ( ^( ELSE $st2) )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new IfNode(stream_IF.nextToken()), root_1);

                        adaptor.addChild(root_1, stream_parExpression.nextTree());
                        adaptor.addChild(root_1, stream_st1.nextTree());
                        // TinyHaxeTry1.g:259:93: ( ^( ELSE $st2) )?
                        if ( stream_ELSE.hasNext()||stream_st2.hasNext() ) {
                            // TinyHaxeTry1.g:259:93: ^( ELSE $st2)
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

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 34, ifStmt_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "ifStmt"

    public static class parExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "parExpression"
    // TinyHaxeTry1.g:262:1: parExpression : LPAREN expr RPAREN ;
    public final TinyHaxeTry1Parser.parExpression_return parExpression() throws RecognitionException {
        TinyHaxeTry1Parser.parExpression_return retval = new TinyHaxeTry1Parser.parExpression_return();
        retval.start = input.LT(1);
        int parExpression_StartIndex = input.index();
        Object root_0 = null;

        Token LPAREN150=null;
        Token RPAREN152=null;
        TinyHaxeTry1Parser.expr_return expr151 = null;


        Object LPAREN150_tree=null;
        Object RPAREN152_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return retval; }
            // TinyHaxeTry1.g:263:2: ( LPAREN expr RPAREN )
            // TinyHaxeTry1.g:263:6: LPAREN expr RPAREN
            {
            root_0 = (Object)adaptor.nil();

            LPAREN150=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_parExpression1578); if (state.failed) return retval;
            pushFollow(FOLLOW_expr_in_parExpression1581);
            expr151=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr151.getTree());
            RPAREN152=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_parExpression1583); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 35, parExpression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "parExpression"

    public static class block_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "block"
    // TinyHaxeTry1.g:266:1: block : ( LBRACE ( blockStmt )* RBRACE -> ^( BLOCK_SCOPE[\"BLOCK_SCOPE\", true, $LBRACE] ( blockStmt )* RBRACE[$RBRACE, true] ) | SEMI );
    public final TinyHaxeTry1Parser.block_return block() throws RecognitionException {
        TinyHaxeTry1Parser.block_return retval = new TinyHaxeTry1Parser.block_return();
        retval.start = input.LT(1);
        int block_StartIndex = input.index();
        Object root_0 = null;

        Token LBRACE153=null;
        Token RBRACE155=null;
        Token SEMI156=null;
        TinyHaxeTry1Parser.blockStmt_return blockStmt154 = null;


        Object LBRACE153_tree=null;
        Object RBRACE155_tree=null;
        Object SEMI156_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_blockStmt=new RewriteRuleSubtreeStream(adaptor,"rule blockStmt");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return retval; }
            // TinyHaxeTry1.g:266:8: ( LBRACE ( blockStmt )* RBRACE -> ^( BLOCK_SCOPE[\"BLOCK_SCOPE\", true, $LBRACE] ( blockStmt )* RBRACE[$RBRACE, true] ) | SEMI )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==LBRACE) ) {
                alt41=1;
            }
            else if ( (LA41_0==SEMI) ) {
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
                    // TinyHaxeTry1.g:266:10: LBRACE ( blockStmt )* RBRACE
                    {
                    LBRACE153=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_block1595); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LBRACE.add(LBRACE153);

                    // TinyHaxeTry1.g:266:17: ( blockStmt )*
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( ((LA40_0>=SEMI && LA40_0<=IDENTIFIER)||(LA40_0>=EXTERN && LA40_0<=PRIVATE)||(LA40_0>=PUBLIC && LA40_0<=OVERRIDE)||(LA40_0>=QUES && LA40_0<=LPAREN)||LA40_0==LBRACKET||(LA40_0>=LT && LA40_0<=GT)||(LA40_0>=NEW && LA40_0<=FOR)||(LA40_0>=WHILE && LA40_0<=LBRACE)||LA40_0==IF||(LA40_0>=UNTYPED && LA40_0<=CAST)||(LA40_0>=VAR && LA40_0<=CLASS)||(LA40_0>=LONGLITERAL && LA40_0<=FALSE)) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // TinyHaxeTry1.g:266:18: blockStmt
                    	    {
                    	    pushFollow(FOLLOW_blockStmt_in_block1598);
                    	    blockStmt154=blockStmt();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_blockStmt.add(blockStmt154.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop40;
                        }
                    } while (true);

                    RBRACE155=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_block1602); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RBRACE.add(RBRACE155);



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
                    // 266:37: -> ^( BLOCK_SCOPE[\"BLOCK_SCOPE\", true, $LBRACE] ( blockStmt )* RBRACE[$RBRACE, true] )
                    {
                        // TinyHaxeTry1.g:266:40: ^( BLOCK_SCOPE[\"BLOCK_SCOPE\", true, $LBRACE] ( blockStmt )* RBRACE[$RBRACE, true] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new BlockScopeNode(BLOCK_SCOPE, "BLOCK_SCOPE", true, LBRACE153), root_1);

                        // TinyHaxeTry1.g:266:100: ( blockStmt )*
                        while ( stream_blockStmt.hasNext() ) {
                            adaptor.addChild(root_1, stream_blockStmt.nextTree());

                        }
                        stream_blockStmt.reset();
                        adaptor.addChild(root_1, new ExtendedCommonTree(RBRACE, RBRACE155, true));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // TinyHaxeTry1.g:267:4: SEMI
                    {
                    root_0 = (Object)adaptor.nil();

                    SEMI156=(Token)match(input,SEMI,FOLLOW_SEMI_in_block1627); if (state.failed) return retval;

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
            if ( state.backtracking>0 ) { memoize(input, 36, block_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "block"

    public static class blockStmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "blockStmt"
    // TinyHaxeTry1.g:270:1: blockStmt : ( varDecl | classDecl | statement );
    public final TinyHaxeTry1Parser.blockStmt_return blockStmt() throws RecognitionException {
        TinyHaxeTry1Parser.blockStmt_return retval = new TinyHaxeTry1Parser.blockStmt_return();
        retval.start = input.LT(1);
        int blockStmt_StartIndex = input.index();
        Object root_0 = null;

        TinyHaxeTry1Parser.varDecl_return varDecl157 = null;

        TinyHaxeTry1Parser.classDecl_return classDecl158 = null;

        TinyHaxeTry1Parser.statement_return statement159 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return retval; }
            // TinyHaxeTry1.g:271:2: ( varDecl | classDecl | statement )
            int alt42=3;
            alt42 = dfa42.predict(input);
            switch (alt42) {
                case 1 :
                    // TinyHaxeTry1.g:271:4: varDecl
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_varDecl_in_blockStmt1640);
                    varDecl157=varDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDecl157.getTree());

                    }
                    break;
                case 2 :
                    // TinyHaxeTry1.g:272:4: classDecl
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_classDecl_in_blockStmt1645);
                    classDecl158=classDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, classDecl158.getTree());

                    }
                    break;
                case 3 :
                    // TinyHaxeTry1.g:273:4: statement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_statement_in_blockStmt1650);
                    statement159=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement159.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 37, blockStmt_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "blockStmt"

    public static class breakStmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "breakStmt"
    // TinyHaxeTry1.g:277:1: breakStmt : BREAK SEMI ;
    public final TinyHaxeTry1Parser.breakStmt_return breakStmt() throws RecognitionException {
        TinyHaxeTry1Parser.breakStmt_return retval = new TinyHaxeTry1Parser.breakStmt_return();
        retval.start = input.LT(1);
        int breakStmt_StartIndex = input.index();
        Object root_0 = null;

        Token BREAK160=null;
        Token SEMI161=null;

        Object BREAK160_tree=null;
        Object SEMI161_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return retval; }
            // TinyHaxeTry1.g:278:2: ( BREAK SEMI )
            // TinyHaxeTry1.g:278:4: BREAK SEMI
            {
            root_0 = (Object)adaptor.nil();

            BREAK160=(Token)match(input,BREAK,FOLLOW_BREAK_in_breakStmt1683); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            BREAK160_tree = (Object)adaptor.create(BREAK160);
            adaptor.addChild(root_0, BREAK160_tree);
            }
            SEMI161=(Token)match(input,SEMI,FOLLOW_SEMI_in_breakStmt1685); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 38, breakStmt_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "breakStmt"

    public static class continueStmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "continueStmt"
    // TinyHaxeTry1.g:281:1: continueStmt : CONTINUE SEMI ;
    public final TinyHaxeTry1Parser.continueStmt_return continueStmt() throws RecognitionException {
        TinyHaxeTry1Parser.continueStmt_return retval = new TinyHaxeTry1Parser.continueStmt_return();
        retval.start = input.LT(1);
        int continueStmt_StartIndex = input.index();
        Object root_0 = null;

        Token CONTINUE162=null;
        Token SEMI163=null;

        Object CONTINUE162_tree=null;
        Object SEMI163_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return retval; }
            // TinyHaxeTry1.g:282:2: ( CONTINUE SEMI )
            // TinyHaxeTry1.g:282:4: CONTINUE SEMI
            {
            root_0 = (Object)adaptor.nil();

            CONTINUE162=(Token)match(input,CONTINUE,FOLLOW_CONTINUE_in_continueStmt1704); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            CONTINUE162_tree = (Object)adaptor.create(CONTINUE162);
            adaptor.addChild(root_0, CONTINUE162_tree);
            }
            SEMI163=(Token)match(input,SEMI,FOLLOW_SEMI_in_continueStmt1706); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 39, continueStmt_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "continueStmt"

    public static class caseStmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "caseStmt"
    // TinyHaxeTry1.g:285:1: caseStmt : ( CASE exprList COLON statement -> ^( CASE ( exprList )? ( statement )? ) | DEFAULT COLON statement -> ^( DEFAULT ( statement )? ) );
    public final TinyHaxeTry1Parser.caseStmt_return caseStmt() throws RecognitionException {
        TinyHaxeTry1Parser.caseStmt_return retval = new TinyHaxeTry1Parser.caseStmt_return();
        retval.start = input.LT(1);
        int caseStmt_StartIndex = input.index();
        Object root_0 = null;

        Token CASE164=null;
        Token COLON166=null;
        Token DEFAULT168=null;
        Token COLON169=null;
        TinyHaxeTry1Parser.exprList_return exprList165 = null;

        TinyHaxeTry1Parser.statement_return statement167 = null;

        TinyHaxeTry1Parser.statement_return statement170 = null;


        Object CASE164_tree=null;
        Object COLON166_tree=null;
        Object DEFAULT168_tree=null;
        Object COLON169_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_DEFAULT=new RewriteRuleTokenStream(adaptor,"token DEFAULT");
        RewriteRuleTokenStream stream_CASE=new RewriteRuleTokenStream(adaptor,"token CASE");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_exprList=new RewriteRuleSubtreeStream(adaptor,"rule exprList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return retval; }
            // TinyHaxeTry1.g:285:9: ( CASE exprList COLON statement -> ^( CASE ( exprList )? ( statement )? ) | DEFAULT COLON statement -> ^( DEFAULT ( statement )? ) )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==CASE) ) {
                alt43=1;
            }
            else if ( (LA43_0==DEFAULT) ) {
                alt43=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // TinyHaxeTry1.g:285:11: CASE exprList COLON statement
                    {
                    CASE164=(Token)match(input,CASE,FOLLOW_CASE_in_caseStmt1717); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CASE.add(CASE164);

                    pushFollow(FOLLOW_exprList_in_caseStmt1719);
                    exprList165=exprList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_exprList.add(exprList165.getTree());
                    COLON166=(Token)match(input,COLON,FOLLOW_COLON_in_caseStmt1721); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(COLON166);

                    pushFollow(FOLLOW_statement_in_caseStmt1723);
                    statement167=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement167.getTree());


                    // AST REWRITE
                    // elements: statement, exprList, CASE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 285:42: -> ^( CASE ( exprList )? ( statement )? )
                    {
                        // TinyHaxeTry1.g:285:45: ^( CASE ( exprList )? ( statement )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_CASE.nextNode(), root_1);

                        // TinyHaxeTry1.g:285:52: ( exprList )?
                        if ( stream_exprList.hasNext() ) {
                            adaptor.addChild(root_1, stream_exprList.nextTree());

                        }
                        stream_exprList.reset();
                        // TinyHaxeTry1.g:285:62: ( statement )?
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
                    // TinyHaxeTry1.g:286:4: DEFAULT COLON statement
                    {
                    DEFAULT168=(Token)match(input,DEFAULT,FOLLOW_DEFAULT_in_caseStmt1741); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DEFAULT.add(DEFAULT168);

                    COLON169=(Token)match(input,COLON,FOLLOW_COLON_in_caseStmt1743); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(COLON169);

                    pushFollow(FOLLOW_statement_in_caseStmt1745);
                    statement170=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement170.getTree());


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
                    // 286:29: -> ^( DEFAULT ( statement )? )
                    {
                        // TinyHaxeTry1.g:286:32: ^( DEFAULT ( statement )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_DEFAULT.nextNode(), root_1);

                        // TinyHaxeTry1.g:286:42: ( statement )?
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
            if ( state.backtracking>0 ) { memoize(input, 40, caseStmt_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "caseStmt"

    public static class defaultStmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "defaultStmt"
    // TinyHaxeTry1.g:289:1: defaultStmt : DEFAULT COLON ;
    public final TinyHaxeTry1Parser.defaultStmt_return defaultStmt() throws RecognitionException {
        TinyHaxeTry1Parser.defaultStmt_return retval = new TinyHaxeTry1Parser.defaultStmt_return();
        retval.start = input.LT(1);
        int defaultStmt_StartIndex = input.index();
        Object root_0 = null;

        Token DEFAULT171=null;
        Token COLON172=null;

        Object DEFAULT171_tree=null;
        Object COLON172_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return retval; }
            // TinyHaxeTry1.g:290:9: ( DEFAULT COLON )
            // TinyHaxeTry1.g:290:11: DEFAULT COLON
            {
            root_0 = (Object)adaptor.nil();

            DEFAULT171=(Token)match(input,DEFAULT,FOLLOW_DEFAULT_in_defaultStmt1774); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            DEFAULT171_tree = (Object)adaptor.create(DEFAULT171);
            adaptor.addChild(root_0, DEFAULT171_tree);
            }
            COLON172=(Token)match(input,COLON,FOLLOW_COLON_in_defaultStmt1776); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 41, defaultStmt_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "defaultStmt"

    public static class catchStmtList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "catchStmtList"
    // TinyHaxeTry1.g:293:1: catchStmtList : ( catchStmt catchStmtList | );
    public final TinyHaxeTry1Parser.catchStmtList_return catchStmtList() throws RecognitionException {
        TinyHaxeTry1Parser.catchStmtList_return retval = new TinyHaxeTry1Parser.catchStmtList_return();
        retval.start = input.LT(1);
        int catchStmtList_StartIndex = input.index();
        Object root_0 = null;

        TinyHaxeTry1Parser.catchStmt_return catchStmt173 = null;

        TinyHaxeTry1Parser.catchStmtList_return catchStmtList174 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 42) ) { return retval; }
            // TinyHaxeTry1.g:294:2: ( catchStmt catchStmtList | )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==CATCH) ) {
                alt44=1;
            }
            else if ( (LA44_0==EOF||(LA44_0>=SEMI && LA44_0<=PRIVATE)||(LA44_0>=PUBLIC && LA44_0<=RBRACKET)||(LA44_0>=LT && LA44_0<=GT)||(LA44_0>=NEW && LA44_0<=DEFAULT)||(LA44_0>=UNTYPED && LA44_0<=IMPLEMENTS)||(LA44_0>=LONGLITERAL && LA44_0<=FALSE)) ) {
                alt44=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // TinyHaxeTry1.g:294:4: catchStmt catchStmtList
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_catchStmt_in_catchStmtList1789);
                    catchStmt173=catchStmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, catchStmt173.getTree());
                    pushFollow(FOLLOW_catchStmtList_in_catchStmtList1791);
                    catchStmtList174=catchStmtList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, catchStmtList174.getTree());

                    }
                    break;
                case 2 :
                    // TinyHaxeTry1.g:296:2: 
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
            if ( state.backtracking>0 ) { memoize(input, 42, catchStmtList_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "catchStmtList"

    public static class catchStmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "catchStmt"
    // TinyHaxeTry1.g:298:1: catchStmt : CATCH LPAREN param RPAREN block -> ^( CATCH ( param )? ( block )? ) ;
    public final TinyHaxeTry1Parser.catchStmt_return catchStmt() throws RecognitionException {
        TinyHaxeTry1Parser.catchStmt_return retval = new TinyHaxeTry1Parser.catchStmt_return();
        retval.start = input.LT(1);
        int catchStmt_StartIndex = input.index();
        Object root_0 = null;

        Token CATCH175=null;
        Token LPAREN176=null;
        Token RPAREN178=null;
        TinyHaxeTry1Parser.param_return param177 = null;

        TinyHaxeTry1Parser.block_return block179 = null;


        Object CATCH175_tree=null;
        Object LPAREN176_tree=null;
        Object RPAREN178_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_CATCH=new RewriteRuleTokenStream(adaptor,"token CATCH");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_param=new RewriteRuleSubtreeStream(adaptor,"rule param");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 43) ) { return retval; }
            // TinyHaxeTry1.g:299:2: ( CATCH LPAREN param RPAREN block -> ^( CATCH ( param )? ( block )? ) )
            // TinyHaxeTry1.g:299:4: CATCH LPAREN param RPAREN block
            {
            CATCH175=(Token)match(input,CATCH,FOLLOW_CATCH_in_catchStmt1813); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CATCH.add(CATCH175);

            LPAREN176=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_catchStmt1815); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN176);

            pushFollow(FOLLOW_param_in_catchStmt1817);
            param177=param();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_param.add(param177.getTree());
            RPAREN178=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_catchStmt1819); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN178);

            pushFollow(FOLLOW_block_in_catchStmt1821);
            block179=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block179.getTree());


            // AST REWRITE
            // elements: param, CATCH, block
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 299:36: -> ^( CATCH ( param )? ( block )? )
            {
                // TinyHaxeTry1.g:299:39: ^( CATCH ( param )? ( block )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_CATCH.nextNode(), root_1);

                // TinyHaxeTry1.g:299:47: ( param )?
                if ( stream_param.hasNext() ) {
                    adaptor.addChild(root_1, stream_param.nextTree());

                }
                stream_param.reset();
                // TinyHaxeTry1.g:299:54: ( block )?
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
            if ( state.backtracking>0 ) { memoize(input, 43, catchStmt_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "catchStmt"

    public static class exprListOpt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exprListOpt"
    // TinyHaxeTry1.g:304:1: exprListOpt : ( exprList | );
    public final TinyHaxeTry1Parser.exprListOpt_return exprListOpt() throws RecognitionException {
        TinyHaxeTry1Parser.exprListOpt_return retval = new TinyHaxeTry1Parser.exprListOpt_return();
        retval.start = input.LT(1);
        int exprListOpt_StartIndex = input.index();
        Object root_0 = null;

        TinyHaxeTry1Parser.exprList_return exprList180 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 44) ) { return retval; }
            // TinyHaxeTry1.g:305:2: ( exprList | )
            int alt45=2;
            switch ( input.LA(1) ) {
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
            case LBRACKET:
            case LT:
            case GT:
            case NEW:
            case SWITCH:
            case LBRACE:
            case IF:
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
                alt45=1;
                }
                break;
            case RBRACKET:
                {
                int LA45_2 = input.LA(2);

                if ( (synpred77_TinyHaxeTry1()) ) {
                    alt45=1;
                }
                else if ( (true) ) {
                    alt45=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 45, 2, input);

                    throw nvae;
                }
                }
                break;
            case RPAREN:
                {
                int LA45_3 = input.LA(2);

                if ( (synpred77_TinyHaxeTry1()) ) {
                    alt45=1;
                }
                else if ( (true) ) {
                    alt45=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 45, 3, input);

                    throw nvae;
                }
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
                    // TinyHaxeTry1.g:305:4: exprList
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_exprList_in_exprListOpt1847);
                    exprList180=exprList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, exprList180.getTree());

                    }
                    break;
                case 2 :
                    // TinyHaxeTry1.g:307:2: 
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
            if ( state.backtracking>0 ) { memoize(input, 44, exprListOpt_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "exprListOpt"

    public static class exprList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exprList"
    // TinyHaxeTry1.g:309:1: exprList : expr ( COMMA expr )* ;
    public final TinyHaxeTry1Parser.exprList_return exprList() throws RecognitionException {
        TinyHaxeTry1Parser.exprList_return retval = new TinyHaxeTry1Parser.exprList_return();
        retval.start = input.LT(1);
        int exprList_StartIndex = input.index();
        Object root_0 = null;

        Token COMMA182=null;
        TinyHaxeTry1Parser.expr_return expr181 = null;

        TinyHaxeTry1Parser.expr_return expr183 = null;


        Object COMMA182_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 45) ) { return retval; }
            // TinyHaxeTry1.g:309:9: ( expr ( COMMA expr )* )
            // TinyHaxeTry1.g:309:11: expr ( COMMA expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_expr_in_exprList1860);
            expr181=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr181.getTree());
            // TinyHaxeTry1.g:309:16: ( COMMA expr )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==COMMA) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // TinyHaxeTry1.g:309:17: COMMA expr
            	    {
            	    COMMA182=(Token)match(input,COMMA,FOLLOW_COMMA_in_exprList1863); if (state.failed) return retval;
            	    pushFollow(FOLLOW_expr_in_exprList1866);
            	    expr183=expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr183.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 45, exprList_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "exprList"

    public static class assignExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assignExpr"
    // TinyHaxeTry1.g:315:1: assignExpr : ( assignExprEx | UNTYPED assignExprEx -> ^( UNTYPED assignExprEx ) );
    public final TinyHaxeTry1Parser.assignExpr_return assignExpr() throws RecognitionException {
        TinyHaxeTry1Parser.assignExpr_return retval = new TinyHaxeTry1Parser.assignExpr_return();
        retval.start = input.LT(1);
        int assignExpr_StartIndex = input.index();
        Object root_0 = null;

        Token UNTYPED185=null;
        TinyHaxeTry1Parser.assignExprEx_return assignExprEx184 = null;

        TinyHaxeTry1Parser.assignExprEx_return assignExprEx186 = null;


        Object UNTYPED185_tree=null;
        RewriteRuleTokenStream stream_UNTYPED=new RewriteRuleTokenStream(adaptor,"token UNTYPED");
        RewriteRuleSubtreeStream stream_assignExprEx=new RewriteRuleSubtreeStream(adaptor,"rule assignExprEx");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 46) ) { return retval; }
            // TinyHaxeTry1.g:316:2: ( assignExprEx | UNTYPED assignExprEx -> ^( UNTYPED assignExprEx ) )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==EOF||LA47_0==SEMI||(LA47_0>=IDENTIFIER && LA47_0<=COLON)||(LA47_0>=COMMA && LA47_0<=RBRACKET)||(LA47_0>=LT && LA47_0<=GT)||LA47_0==NEW||LA47_0==IN||(LA47_0>=LBRACE && LA47_0<=RBRACE)||LA47_0==ELSE||(LA47_0>=ELLIPSIS && LA47_0<=CAST)||(LA47_0>=EXTENDS && LA47_0<=IMPLEMENTS)||(LA47_0>=LONGLITERAL && LA47_0<=FALSE)) ) {
                alt47=1;
            }
            else if ( (LA47_0==UNTYPED) ) {
                alt47=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // TinyHaxeTry1.g:316:4: assignExprEx
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_assignExprEx_in_assignExpr1883);
                    assignExprEx184=assignExprEx();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignExprEx184.getTree());

                    }
                    break;
                case 2 :
                    // TinyHaxeTry1.g:317:4: UNTYPED assignExprEx
                    {
                    UNTYPED185=(Token)match(input,UNTYPED,FOLLOW_UNTYPED_in_assignExpr1888); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_UNTYPED.add(UNTYPED185);

                    pushFollow(FOLLOW_assignExprEx_in_assignExpr1890);
                    assignExprEx186=assignExprEx();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_assignExprEx.add(assignExprEx186.getTree());


                    // AST REWRITE
                    // elements: UNTYPED, assignExprEx
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 317:25: -> ^( UNTYPED assignExprEx )
                    {
                        // TinyHaxeTry1.g:317:28: ^( UNTYPED assignExprEx )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_UNTYPED.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_assignExprEx.nextTree());

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
            if ( state.backtracking>0 ) { memoize(input, 46, assignExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "assignExpr"

    public static class assignExprEx_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assignExprEx"
    // TinyHaxeTry1.g:320:1: assignExprEx : iterExpr ( assignOp iterExpr )* ;
    public final TinyHaxeTry1Parser.assignExprEx_return assignExprEx() throws RecognitionException {
        TinyHaxeTry1Parser.assignExprEx_return retval = new TinyHaxeTry1Parser.assignExprEx_return();
        retval.start = input.LT(1);
        int assignExprEx_StartIndex = input.index();
        Object root_0 = null;

        TinyHaxeTry1Parser.iterExpr_return iterExpr187 = null;

        TinyHaxeTry1Parser.assignOp_return assignOp188 = null;

        TinyHaxeTry1Parser.iterExpr_return iterExpr189 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 47) ) { return retval; }
            // TinyHaxeTry1.g:321:2: ( iterExpr ( assignOp iterExpr )* )
            // TinyHaxeTry1.g:321:5: iterExpr ( assignOp iterExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_iterExpr_in_assignExprEx1910);
            iterExpr187=iterExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, iterExpr187.getTree());
            // TinyHaxeTry1.g:321:14: ( assignOp iterExpr )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( ((LA48_0>=EQ && LA48_0<=AMPEQ)) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // TinyHaxeTry1.g:321:15: assignOp iterExpr
            	    {
            	    pushFollow(FOLLOW_assignOp_in_assignExprEx1913);
            	    assignOp188=assignOp();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(assignOp188.getTree(), root_0);
            	    pushFollow(FOLLOW_iterExpr_in_assignExprEx1916);
            	    iterExpr189=iterExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, iterExpr189.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 47, assignExprEx_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "assignExprEx"

    public static class iterExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "iterExpr"
    // TinyHaxeTry1.g:324:1: iterExpr : ternaryExpr ( ELLIPSIS ternaryExpr )* ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 48) ) { return retval; }
            // TinyHaxeTry1.g:324:9: ( ternaryExpr ( ELLIPSIS ternaryExpr )* )
            // TinyHaxeTry1.g:324:11: ternaryExpr ( ELLIPSIS ternaryExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_ternaryExpr_in_iterExpr1928);
            ternaryExpr190=ternaryExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, ternaryExpr190.getTree());
            // TinyHaxeTry1.g:324:23: ( ELLIPSIS ternaryExpr )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==ELLIPSIS) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // TinyHaxeTry1.g:324:24: ELLIPSIS ternaryExpr
            	    {
            	    ELLIPSIS191=(Token)match(input,ELLIPSIS,FOLLOW_ELLIPSIS_in_iterExpr1931); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    ELLIPSIS191_tree = (Object)adaptor.create(ELLIPSIS191);
            	    root_0 = (Object)adaptor.becomeRoot(ELLIPSIS191_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ternaryExpr_in_iterExpr1934);
            	    ternaryExpr192=ternaryExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, ternaryExpr192.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 48, iterExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "iterExpr"

    public static class ternaryExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ternaryExpr"
    // TinyHaxeTry1.g:327:1: ternaryExpr : logicOrExpr ( QUES expr COLON logicOrExpr )* ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 49) ) { return retval; }
            // TinyHaxeTry1.g:328:2: ( logicOrExpr ( QUES expr COLON logicOrExpr )* )
            // TinyHaxeTry1.g:328:4: logicOrExpr ( QUES expr COLON logicOrExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_logicOrExpr_in_ternaryExpr1947);
            logicOrExpr193=logicOrExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, logicOrExpr193.getTree());
            // TinyHaxeTry1.g:328:16: ( QUES expr COLON logicOrExpr )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==QUES) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // TinyHaxeTry1.g:328:17: QUES expr COLON logicOrExpr
            	    {
            	    QUES194=(Token)match(input,QUES,FOLLOW_QUES_in_ternaryExpr1950); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    QUES194_tree = (Object)adaptor.create(QUES194);
            	    root_0 = (Object)adaptor.becomeRoot(QUES194_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_expr_in_ternaryExpr1953);
            	    expr195=expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr195.getTree());
            	    COLON196=(Token)match(input,COLON,FOLLOW_COLON_in_ternaryExpr1955); if (state.failed) return retval;
            	    pushFollow(FOLLOW_logicOrExpr_in_ternaryExpr1958);
            	    logicOrExpr197=logicOrExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, logicOrExpr197.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 49, ternaryExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "ternaryExpr"

    public static class logicOrExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "logicOrExpr"
    // TinyHaxeTry1.g:331:1: logicOrExpr : ( logicAndExpr ) ( BARBAR logicAndExpr )* ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 50) ) { return retval; }
            // TinyHaxeTry1.g:332:2: ( ( logicAndExpr ) ( BARBAR logicAndExpr )* )
            // TinyHaxeTry1.g:332:4: ( logicAndExpr ) ( BARBAR logicAndExpr )*
            {
            root_0 = (Object)adaptor.nil();

            // TinyHaxeTry1.g:332:4: ( logicAndExpr )
            // TinyHaxeTry1.g:332:5: logicAndExpr
            {
            pushFollow(FOLLOW_logicAndExpr_in_logicOrExpr1979);
            logicAndExpr198=logicAndExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, logicAndExpr198.getTree());

            }

            // TinyHaxeTry1.g:332:19: ( BARBAR logicAndExpr )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==BARBAR) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // TinyHaxeTry1.g:332:20: BARBAR logicAndExpr
            	    {
            	    BARBAR199=(Token)match(input,BARBAR,FOLLOW_BARBAR_in_logicOrExpr1983); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    BARBAR199_tree = (Object)adaptor.create(BARBAR199);
            	    root_0 = (Object)adaptor.becomeRoot(BARBAR199_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_logicAndExpr_in_logicOrExpr1986);
            	    logicAndExpr200=logicAndExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, logicAndExpr200.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 50, logicOrExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "logicOrExpr"

    public static class logicAndExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "logicAndExpr"
    // TinyHaxeTry1.g:335:1: logicAndExpr : ( cmpExpr ) ( AMPAMP cmpExpr )* ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 51) ) { return retval; }
            // TinyHaxeTry1.g:336:2: ( ( cmpExpr ) ( AMPAMP cmpExpr )* )
            // TinyHaxeTry1.g:336:4: ( cmpExpr ) ( AMPAMP cmpExpr )*
            {
            root_0 = (Object)adaptor.nil();

            // TinyHaxeTry1.g:336:4: ( cmpExpr )
            // TinyHaxeTry1.g:336:5: cmpExpr
            {
            pushFollow(FOLLOW_cmpExpr_in_logicAndExpr2007);
            cmpExpr201=cmpExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, cmpExpr201.getTree());

            }

            // TinyHaxeTry1.g:336:14: ( AMPAMP cmpExpr )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==AMPAMP) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // TinyHaxeTry1.g:336:15: AMPAMP cmpExpr
            	    {
            	    AMPAMP202=(Token)match(input,AMPAMP,FOLLOW_AMPAMP_in_logicAndExpr2011); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    AMPAMP202_tree = (Object)adaptor.create(AMPAMP202);
            	    root_0 = (Object)adaptor.becomeRoot(AMPAMP202_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_cmpExpr_in_logicAndExpr2014);
            	    cmpExpr203=cmpExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, cmpExpr203.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 51, logicAndExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "logicAndExpr"

    public static class cmpExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "cmpExpr"
    // TinyHaxeTry1.g:339:1: cmpExpr : ( bitExpr ) ( ( EQEQ | BANGEQ | GTEQ | LTEQ | GT | LT ) bitExpr )* ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 52) ) { return retval; }
            // TinyHaxeTry1.g:339:9: ( ( bitExpr ) ( ( EQEQ | BANGEQ | GTEQ | LTEQ | GT | LT ) bitExpr )* )
            // TinyHaxeTry1.g:339:11: ( bitExpr ) ( ( EQEQ | BANGEQ | GTEQ | LTEQ | GT | LT ) bitExpr )*
            {
            root_0 = (Object)adaptor.nil();

            // TinyHaxeTry1.g:339:11: ( bitExpr )
            // TinyHaxeTry1.g:339:12: bitExpr
            {
            pushFollow(FOLLOW_bitExpr_in_cmpExpr2028);
            bitExpr204=bitExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bitExpr204.getTree());

            }

            // TinyHaxeTry1.g:339:21: ( ( EQEQ | BANGEQ | GTEQ | LTEQ | GT | LT ) bitExpr )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( ((LA54_0>=LT && LA54_0<=GT)||(LA54_0>=EQEQ && LA54_0<=LTEQ)) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // TinyHaxeTry1.g:339:22: ( EQEQ | BANGEQ | GTEQ | LTEQ | GT | LT ) bitExpr
            	    {
            	    // TinyHaxeTry1.g:339:22: ( EQEQ | BANGEQ | GTEQ | LTEQ | GT | LT )
            	    int alt53=6;
            	    switch ( input.LA(1) ) {
            	    case EQEQ:
            	        {
            	        alt53=1;
            	        }
            	        break;
            	    case BANGEQ:
            	        {
            	        alt53=2;
            	        }
            	        break;
            	    case GTEQ:
            	        {
            	        alt53=3;
            	        }
            	        break;
            	    case LTEQ:
            	        {
            	        alt53=4;
            	        }
            	        break;
            	    case GT:
            	        {
            	        alt53=5;
            	        }
            	        break;
            	    case LT:
            	        {
            	        alt53=6;
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
            	            // TinyHaxeTry1.g:339:23: EQEQ
            	            {
            	            EQEQ205=(Token)match(input,EQEQ,FOLLOW_EQEQ_in_cmpExpr2033); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            EQEQ205_tree = (Object)adaptor.create(EQEQ205);
            	            root_0 = (Object)adaptor.becomeRoot(EQEQ205_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // TinyHaxeTry1.g:339:30: BANGEQ
            	            {
            	            BANGEQ206=(Token)match(input,BANGEQ,FOLLOW_BANGEQ_in_cmpExpr2037); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            BANGEQ206_tree = (Object)adaptor.create(BANGEQ206);
            	            root_0 = (Object)adaptor.becomeRoot(BANGEQ206_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // TinyHaxeTry1.g:339:40: GTEQ
            	            {
            	            GTEQ207=(Token)match(input,GTEQ,FOLLOW_GTEQ_in_cmpExpr2042); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            GTEQ207_tree = (Object)adaptor.create(GTEQ207);
            	            root_0 = (Object)adaptor.becomeRoot(GTEQ207_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // TinyHaxeTry1.g:339:48: LTEQ
            	            {
            	            LTEQ208=(Token)match(input,LTEQ,FOLLOW_LTEQ_in_cmpExpr2047); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            LTEQ208_tree = (Object)adaptor.create(LTEQ208);
            	            root_0 = (Object)adaptor.becomeRoot(LTEQ208_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 5 :
            	            // TinyHaxeTry1.g:339:56: GT
            	            {
            	            GT209=(Token)match(input,GT,FOLLOW_GT_in_cmpExpr2052); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            GT209_tree = (Object)adaptor.create(GT209);
            	            root_0 = (Object)adaptor.becomeRoot(GT209_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 6 :
            	            // TinyHaxeTry1.g:339:62: LT
            	            {
            	            LT210=(Token)match(input,LT,FOLLOW_LT_in_cmpExpr2057); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            LT210_tree = (Object)adaptor.create(LT210);
            	            root_0 = (Object)adaptor.becomeRoot(LT210_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_bitExpr_in_cmpExpr2062);
            	    bitExpr211=bitExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, bitExpr211.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 52, cmpExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "cmpExpr"

    public static class bitExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bitExpr"
    // TinyHaxeTry1.g:342:1: bitExpr : ( shiftExpr ) ( BAR shiftExpr | AMP shiftExpr | CARET shiftExpr )* ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 53) ) { return retval; }
            // TinyHaxeTry1.g:342:9: ( ( shiftExpr ) ( BAR shiftExpr | AMP shiftExpr | CARET shiftExpr )* )
            // TinyHaxeTry1.g:342:11: ( shiftExpr ) ( BAR shiftExpr | AMP shiftExpr | CARET shiftExpr )*
            {
            root_0 = (Object)adaptor.nil();

            // TinyHaxeTry1.g:342:11: ( shiftExpr )
            // TinyHaxeTry1.g:342:12: shiftExpr
            {
            pushFollow(FOLLOW_shiftExpr_in_bitExpr2076);
            shiftExpr212=shiftExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, shiftExpr212.getTree());

            }

            // TinyHaxeTry1.g:342:23: ( BAR shiftExpr | AMP shiftExpr | CARET shiftExpr )*
            loop55:
            do {
                int alt55=4;
                switch ( input.LA(1) ) {
                case BAR:
                    {
                    alt55=1;
                    }
                    break;
                case AMP:
                    {
                    alt55=2;
                    }
                    break;
                case CARET:
                    {
                    alt55=3;
                    }
                    break;

                }

                switch (alt55) {
            	case 1 :
            	    // TinyHaxeTry1.g:342:24: BAR shiftExpr
            	    {
            	    BAR213=(Token)match(input,BAR,FOLLOW_BAR_in_bitExpr2080); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    BAR213_tree = (Object)adaptor.create(BAR213);
            	    root_0 = (Object)adaptor.becomeRoot(BAR213_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_shiftExpr_in_bitExpr2083);
            	    shiftExpr214=shiftExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, shiftExpr214.getTree());

            	    }
            	    break;
            	case 2 :
            	    // TinyHaxeTry1.g:342:41: AMP shiftExpr
            	    {
            	    AMP215=(Token)match(input,AMP,FOLLOW_AMP_in_bitExpr2087); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    AMP215_tree = (Object)adaptor.create(AMP215);
            	    root_0 = (Object)adaptor.becomeRoot(AMP215_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_shiftExpr_in_bitExpr2090);
            	    shiftExpr216=shiftExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, shiftExpr216.getTree());

            	    }
            	    break;
            	case 3 :
            	    // TinyHaxeTry1.g:342:57: CARET shiftExpr
            	    {
            	    CARET217=(Token)match(input,CARET,FOLLOW_CARET_in_bitExpr2093); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    CARET217_tree = (Object)adaptor.create(CARET217);
            	    root_0 = (Object)adaptor.becomeRoot(CARET217_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_shiftExpr_in_bitExpr2096);
            	    shiftExpr218=shiftExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, shiftExpr218.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 53, bitExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "bitExpr"

    public static class shiftExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "shiftExpr"
    // TinyHaxeTry1.g:345:1: shiftExpr : ( addExpr ) ( LTLT addExpr | ( GT GT ) addExpr | GTGTGT addExpr )* ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 54) ) { return retval; }
            // TinyHaxeTry1.g:346:2: ( ( addExpr ) ( LTLT addExpr | ( GT GT ) addExpr | GTGTGT addExpr )* )
            // TinyHaxeTry1.g:346:4: ( addExpr ) ( LTLT addExpr | ( GT GT ) addExpr | GTGTGT addExpr )*
            {
            root_0 = (Object)adaptor.nil();

            // TinyHaxeTry1.g:346:4: ( addExpr )
            // TinyHaxeTry1.g:346:5: addExpr
            {
            pushFollow(FOLLOW_addExpr_in_shiftExpr2110);
            addExpr219=addExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, addExpr219.getTree());

            }

            // TinyHaxeTry1.g:346:14: ( LTLT addExpr | ( GT GT ) addExpr | GTGTGT addExpr )*
            loop56:
            do {
                int alt56=4;
                switch ( input.LA(1) ) {
                case GT:
                    {
                    int LA56_2 = input.LA(2);

                    if ( (LA56_2==GT) ) {
                        int LA56_5 = input.LA(3);

                        if ( (synpred95_TinyHaxeTry1()) ) {
                            alt56=2;
                        }


                    }


                    }
                    break;
                case LTLT:
                    {
                    alt56=1;
                    }
                    break;
                case GTGTGT:
                    {
                    alt56=3;
                    }
                    break;

                }

                switch (alt56) {
            	case 1 :
            	    // TinyHaxeTry1.g:346:15: LTLT addExpr
            	    {
            	    LTLT220=(Token)match(input,LTLT,FOLLOW_LTLT_in_shiftExpr2114); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    LTLT220_tree = (Object)adaptor.create(LTLT220);
            	    root_0 = (Object)adaptor.becomeRoot(LTLT220_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_addExpr_in_shiftExpr2118);
            	    addExpr221=addExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, addExpr221.getTree());

            	    }
            	    break;
            	case 2 :
            	    // TinyHaxeTry1.g:346:32: ( GT GT ) addExpr
            	    {
            	    // TinyHaxeTry1.g:346:32: ( GT GT )
            	    // TinyHaxeTry1.g:346:33: GT GT
            	    {
            	    GT222=(Token)match(input,GT,FOLLOW_GT_in_shiftExpr2123); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    GT222_tree = (Object)adaptor.create(GT222);
            	    adaptor.addChild(root_0, GT222_tree);
            	    }
            	    GT223=(Token)match(input,GT,FOLLOW_GT_in_shiftExpr2125); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    GT223_tree = (Object)adaptor.create(GT223);
            	    adaptor.addChild(root_0, GT223_tree);
            	    }

            	    }

            	    pushFollow(FOLLOW_addExpr_in_shiftExpr2130);
            	    addExpr224=addExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, addExpr224.getTree());

            	    }
            	    break;
            	case 3 :
            	    // TinyHaxeTry1.g:346:52: GTGTGT addExpr
            	    {
            	    GTGTGT225=(Token)match(input,GTGTGT,FOLLOW_GTGTGT_in_shiftExpr2134); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    GTGTGT225_tree = (Object)adaptor.create(GTGTGT225);
            	    root_0 = (Object)adaptor.becomeRoot(GTGTGT225_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_addExpr_in_shiftExpr2137);
            	    addExpr226=addExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, addExpr226.getTree());

            	    }
            	    break;

            	default :
            	    break loop56;
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
            if ( state.backtracking>0 ) { memoize(input, 54, shiftExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "shiftExpr"

    public static class addExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "addExpr"
    // TinyHaxeTry1.g:349:1: addExpr : ( multExpr ) ( ( PLUS | SUB ) multExpr )* ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 55) ) { return retval; }
            // TinyHaxeTry1.g:349:9: ( ( multExpr ) ( ( PLUS | SUB ) multExpr )* )
            // TinyHaxeTry1.g:349:12: ( multExpr ) ( ( PLUS | SUB ) multExpr )*
            {
            root_0 = (Object)adaptor.nil();

            // TinyHaxeTry1.g:349:12: ( multExpr )
            // TinyHaxeTry1.g:349:13: multExpr
            {
            pushFollow(FOLLOW_multExpr_in_addExpr2151);
            multExpr227=multExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, multExpr227.getTree());

            }

            // TinyHaxeTry1.g:349:23: ( ( PLUS | SUB ) multExpr )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( ((LA58_0>=PLUS && LA58_0<=SUB)) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // TinyHaxeTry1.g:349:24: ( PLUS | SUB ) multExpr
            	    {
            	    // TinyHaxeTry1.g:349:24: ( PLUS | SUB )
            	    int alt57=2;
            	    int LA57_0 = input.LA(1);

            	    if ( (LA57_0==PLUS) ) {
            	        alt57=1;
            	    }
            	    else if ( (LA57_0==SUB) ) {
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
            	            // TinyHaxeTry1.g:349:25: PLUS
            	            {
            	            PLUS228=(Token)match(input,PLUS,FOLLOW_PLUS_in_addExpr2156); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            PLUS228_tree = (Object)adaptor.create(PLUS228);
            	            root_0 = (Object)adaptor.becomeRoot(PLUS228_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // TinyHaxeTry1.g:349:33: SUB
            	            {
            	            SUB229=(Token)match(input,SUB,FOLLOW_SUB_in_addExpr2161); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            SUB229_tree = (Object)adaptor.create(SUB229);
            	            root_0 = (Object)adaptor.becomeRoot(SUB229_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_multExpr_in_addExpr2165);
            	    multExpr230=multExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, multExpr230.getTree());

            	    }
            	    break;

            	default :
            	    break loop58;
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
            if ( state.backtracking>0 ) { memoize(input, 55, addExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "addExpr"

    public static class multExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "multExpr"
    // TinyHaxeTry1.g:352:1: multExpr : ( prefixExpr ) ( ( STAR | SLASH | PERCENT ) prefixExpr )* ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 56) ) { return retval; }
            // TinyHaxeTry1.g:352:9: ( ( prefixExpr ) ( ( STAR | SLASH | PERCENT ) prefixExpr )* )
            // TinyHaxeTry1.g:352:11: ( prefixExpr ) ( ( STAR | SLASH | PERCENT ) prefixExpr )*
            {
            root_0 = (Object)adaptor.nil();

            // TinyHaxeTry1.g:352:11: ( prefixExpr )
            // TinyHaxeTry1.g:352:12: prefixExpr
            {
            pushFollow(FOLLOW_prefixExpr_in_multExpr2179);
            prefixExpr231=prefixExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, prefixExpr231.getTree());

            }

            // TinyHaxeTry1.g:352:24: ( ( STAR | SLASH | PERCENT ) prefixExpr )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( ((LA60_0>=STAR && LA60_0<=PERCENT)) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // TinyHaxeTry1.g:352:25: ( STAR | SLASH | PERCENT ) prefixExpr
            	    {
            	    // TinyHaxeTry1.g:352:25: ( STAR | SLASH | PERCENT )
            	    int alt59=3;
            	    switch ( input.LA(1) ) {
            	    case STAR:
            	        {
            	        alt59=1;
            	        }
            	        break;
            	    case SLASH:
            	        {
            	        alt59=2;
            	        }
            	        break;
            	    case PERCENT:
            	        {
            	        alt59=3;
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
            	            // TinyHaxeTry1.g:352:26: STAR
            	            {
            	            STAR232=(Token)match(input,STAR,FOLLOW_STAR_in_multExpr2184); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            STAR232_tree = (Object)adaptor.create(STAR232);
            	            root_0 = (Object)adaptor.becomeRoot(STAR232_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // TinyHaxeTry1.g:352:32: SLASH
            	            {
            	            SLASH233=(Token)match(input,SLASH,FOLLOW_SLASH_in_multExpr2187); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            SLASH233_tree = (Object)adaptor.create(SLASH233);
            	            root_0 = (Object)adaptor.becomeRoot(SLASH233_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // TinyHaxeTry1.g:352:39: PERCENT
            	            {
            	            PERCENT234=(Token)match(input,PERCENT,FOLLOW_PERCENT_in_multExpr2190); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            PERCENT234_tree = (Object)adaptor.create(PERCENT234);
            	            root_0 = (Object)adaptor.becomeRoot(PERCENT234_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_prefixExpr_in_multExpr2194);
            	    prefixExpr235=prefixExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, prefixExpr235.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 56, multExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "multExpr"

    public static class prefixExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "prefixExpr"
    // TinyHaxeTry1.g:355:1: prefixExpr : ( ( SUB | SUBSUB | PLUSPLUS | BANG | TILDE ) prefixExpr | newExpr | cast | suffixExpr );
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 57) ) { return retval; }
            // TinyHaxeTry1.g:356:9: ( ( SUB | SUBSUB | PLUSPLUS | BANG | TILDE ) prefixExpr | newExpr | cast | suffixExpr )
            int alt61=4;
            switch ( input.LA(1) ) {
            case PLUSPLUS:
                {
                int LA61_1 = input.LA(2);

                if ( (synpred106_TinyHaxeTry1()) ) {
                    alt61=1;
                }
                else if ( (true) ) {
                    alt61=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 61, 1, input);

                    throw nvae;
                }
                }
                break;
            case NEW:
                {
                alt61=2;
                }
                break;
            case CAST:
                {
                alt61=3;
                }
                break;
            case EOF:
            case SEMI:
            case IDENTIFIER:
            case COLON:
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
            case LT:
            case GT:
            case IN:
            case LBRACE:
            case RBRACE:
            case ELSE:
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
                alt61=4;
                }
                break;
            case SUBSUB:
                {
                int LA61_5 = input.LA(2);

                if ( (synpred106_TinyHaxeTry1()) ) {
                    alt61=1;
                }
                else if ( (true) ) {
                    alt61=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 61, 5, input);

                    throw nvae;
                }
                }
                break;
            case SUB:
                {
                int LA61_6 = input.LA(2);

                if ( (synpred106_TinyHaxeTry1()) ) {
                    alt61=1;
                }
                else if ( (true) ) {
                    alt61=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 61, 6, input);

                    throw nvae;
                }
                }
                break;
            case BANG:
            case TILDE:
                {
                alt61=1;
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
                    // TinyHaxeTry1.g:356:11: ( SUB | SUBSUB | PLUSPLUS | BANG | TILDE ) prefixExpr
                    {
                    root_0 = (Object)adaptor.nil();

                    set236=(Token)input.LT(1);
                    if ( input.LA(1)==SUB||(input.LA(1)>=SUBSUB && input.LA(1)<=TILDE) ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set236));
                        state.errorRecovery=false;state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_prefixExpr_in_prefixExpr2227);
                    prefixExpr237=prefixExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, prefixExpr237.getTree());

                    }
                    break;
                case 2 :
                    // TinyHaxeTry1.g:357:11: newExpr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_newExpr_in_prefixExpr2239);
                    newExpr238=newExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, newExpr238.getTree());

                    }
                    break;
                case 3 :
                    // TinyHaxeTry1.g:358:11: cast
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_cast_in_prefixExpr2251);
                    cast239=cast();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, cast239.getTree());

                    }
                    break;
                case 4 :
                    // TinyHaxeTry1.g:359:11: suffixExpr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_suffixExpr_in_prefixExpr2263);
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
            if ( state.backtracking>0 ) { memoize(input, 57, prefixExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "prefixExpr"

    public static class suffixExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "suffixExpr"
    // TinyHaxeTry1.g:363:1: suffixExpr : ( value callOrSliceList -> ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] ( value )? ( callOrSliceList )? ) | value PLUSPLUS -> ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] ( value )? ( PLUSPLUS )? ) | value SUBSUB -> ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] ( value )? ( SUBSUB )? ) | value typeParamOpt );
    public final TinyHaxeTry1Parser.suffixExpr_return suffixExpr() throws RecognitionException {
        TinyHaxeTry1Parser.suffixExpr_return retval = new TinyHaxeTry1Parser.suffixExpr_return();
        retval.start = input.LT(1);
        int suffixExpr_StartIndex = input.index();
        Object root_0 = null;

        Token PLUSPLUS244=null;
        Token SUBSUB246=null;
        TinyHaxeTry1Parser.value_return value241 = null;

        TinyHaxeTry1Parser.callOrSliceList_return callOrSliceList242 = null;

        TinyHaxeTry1Parser.value_return value243 = null;

        TinyHaxeTry1Parser.value_return value245 = null;

        TinyHaxeTry1Parser.value_return value247 = null;

        TinyHaxeTry1Parser.typeParamOpt_return typeParamOpt248 = null;


        Object PLUSPLUS244_tree=null;
        Object SUBSUB246_tree=null;
        RewriteRuleTokenStream stream_SUBSUB=new RewriteRuleTokenStream(adaptor,"token SUBSUB");
        RewriteRuleTokenStream stream_PLUSPLUS=new RewriteRuleTokenStream(adaptor,"token PLUSPLUS");
        RewriteRuleSubtreeStream stream_value=new RewriteRuleSubtreeStream(adaptor,"rule value");
        RewriteRuleSubtreeStream stream_callOrSliceList=new RewriteRuleSubtreeStream(adaptor,"rule callOrSliceList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 58) ) { return retval; }
            // TinyHaxeTry1.g:364:2: ( value callOrSliceList -> ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] ( value )? ( callOrSliceList )? ) | value PLUSPLUS -> ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] ( value )? ( PLUSPLUS )? ) | value SUBSUB -> ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] ( value )? ( SUBSUB )? ) | value typeParamOpt )
            int alt62=4;
            alt62 = dfa62.predict(input);
            switch (alt62) {
                case 1 :
                    // TinyHaxeTry1.g:364:4: value callOrSliceList
                    {
                    pushFollow(FOLLOW_value_in_suffixExpr2283);
                    value241=value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_value.add(value241.getTree());
                    pushFollow(FOLLOW_callOrSliceList_in_suffixExpr2285);
                    callOrSliceList242=callOrSliceList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_callOrSliceList.add(callOrSliceList242.getTree());


                    // AST REWRITE
                    // elements: value, callOrSliceList
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 364:27: -> ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] ( value )? ( callOrSliceList )? )
                    {
                        // TinyHaxeTry1.g:364:30: ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] ( value )? ( callOrSliceList )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new ExtendedCommonTree(SUFFIX_EXPR, "SUFFIX_EXPR", true), root_1);

                        // TinyHaxeTry1.g:364:84: ( value )?
                        if ( stream_value.hasNext() ) {
                            adaptor.addChild(root_1, stream_value.nextTree());

                        }
                        stream_value.reset();
                        // TinyHaxeTry1.g:364:91: ( callOrSliceList )?
                        if ( stream_callOrSliceList.hasNext() ) {
                            adaptor.addChild(root_1, stream_callOrSliceList.nextTree());

                        }
                        stream_callOrSliceList.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // TinyHaxeTry1.g:365:4: value PLUSPLUS
                    {
                    pushFollow(FOLLOW_value_in_suffixExpr2307);
                    value243=value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_value.add(value243.getTree());
                    PLUSPLUS244=(Token)match(input,PLUSPLUS,FOLLOW_PLUSPLUS_in_suffixExpr2309); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PLUSPLUS.add(PLUSPLUS244);



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
                    // 365:21: -> ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] ( value )? ( PLUSPLUS )? )
                    {
                        // TinyHaxeTry1.g:365:24: ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] ( value )? ( PLUSPLUS )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new ExtendedCommonTree(SUFFIX_EXPR, "SUFFIX_EXPR", true), root_1);

                        // TinyHaxeTry1.g:365:78: ( value )?
                        if ( stream_value.hasNext() ) {
                            adaptor.addChild(root_1, stream_value.nextTree());

                        }
                        stream_value.reset();
                        // TinyHaxeTry1.g:365:85: ( PLUSPLUS )?
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
                case 3 :
                    // TinyHaxeTry1.g:366:4: value SUBSUB
                    {
                    pushFollow(FOLLOW_value_in_suffixExpr2332);
                    value245=value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_value.add(value245.getTree());
                    SUBSUB246=(Token)match(input,SUBSUB,FOLLOW_SUBSUB_in_suffixExpr2334); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SUBSUB.add(SUBSUB246);



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
                    // 366:19: -> ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] ( value )? ( SUBSUB )? )
                    {
                        // TinyHaxeTry1.g:366:22: ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] ( value )? ( SUBSUB )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new ExtendedCommonTree(SUFFIX_EXPR, "SUFFIX_EXPR", true), root_1);

                        // TinyHaxeTry1.g:366:76: ( value )?
                        if ( stream_value.hasNext() ) {
                            adaptor.addChild(root_1, stream_value.nextTree());

                        }
                        stream_value.reset();
                        // TinyHaxeTry1.g:366:83: ( SUBSUB )?
                        if ( stream_SUBSUB.hasNext() ) {
                            adaptor.addChild(root_1, stream_SUBSUB.nextNode());

                        }
                        stream_SUBSUB.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // TinyHaxeTry1.g:367:4: value typeParamOpt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_value_in_suffixExpr2357);
                    value247=value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, value247.getTree());
                    pushFollow(FOLLOW_typeParamOpt_in_suffixExpr2359);
                    typeParamOpt248=typeParamOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeParamOpt248.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 58, suffixExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "suffixExpr"

    public static class callOrSliceList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "callOrSliceList"
    // TinyHaxeTry1.g:370:1: callOrSliceList : ( callOrSlice )+ ;
    public final TinyHaxeTry1Parser.callOrSliceList_return callOrSliceList() throws RecognitionException {
        TinyHaxeTry1Parser.callOrSliceList_return retval = new TinyHaxeTry1Parser.callOrSliceList_return();
        retval.start = input.LT(1);
        int callOrSliceList_StartIndex = input.index();
        Object root_0 = null;

        TinyHaxeTry1Parser.callOrSlice_return callOrSlice249 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 59) ) { return retval; }
            // TinyHaxeTry1.g:371:2: ( ( callOrSlice )+ )
            // TinyHaxeTry1.g:371:4: ( callOrSlice )+
            {
            root_0 = (Object)adaptor.nil();

            // TinyHaxeTry1.g:371:4: ( callOrSlice )+
            int cnt63=0;
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( (LA63_0==LPAREN||LA63_0==LBRACKET) ) {
                    alt63=1;
                }


                switch (alt63) {
            	case 1 :
            	    // TinyHaxeTry1.g:371:5: callOrSlice
            	    {
            	    pushFollow(FOLLOW_callOrSlice_in_callOrSliceList2371);
            	    callOrSlice249=callOrSlice();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, callOrSlice249.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt63 >= 1 ) break loop63;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(63, input);
                        throw eee;
                }
                cnt63++;
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
            if ( state.backtracking>0 ) { memoize(input, 59, callOrSliceList_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "callOrSliceList"

    public static class callOrSlice_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "callOrSlice"
    // TinyHaxeTry1.g:374:1: callOrSlice : ( LPAREN exprListOpt RPAREN | LBRACKET expr RBRACKET );
    public final TinyHaxeTry1Parser.callOrSlice_return callOrSlice() throws RecognitionException {
        TinyHaxeTry1Parser.callOrSlice_return retval = new TinyHaxeTry1Parser.callOrSlice_return();
        retval.start = input.LT(1);
        int callOrSlice_StartIndex = input.index();
        Object root_0 = null;

        Token LPAREN250=null;
        Token RPAREN252=null;
        Token LBRACKET253=null;
        Token RBRACKET255=null;
        TinyHaxeTry1Parser.exprListOpt_return exprListOpt251 = null;

        TinyHaxeTry1Parser.expr_return expr254 = null;


        Object LPAREN250_tree=null;
        Object RPAREN252_tree=null;
        Object LBRACKET253_tree=null;
        Object RBRACKET255_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 60) ) { return retval; }
            // TinyHaxeTry1.g:375:2: ( LPAREN exprListOpt RPAREN | LBRACKET expr RBRACKET )
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==LPAREN) ) {
                alt64=1;
            }
            else if ( (LA64_0==LBRACKET) ) {
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
                    // TinyHaxeTry1.g:375:4: LPAREN exprListOpt RPAREN
                    {
                    root_0 = (Object)adaptor.nil();

                    LPAREN250=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_callOrSlice2384); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LPAREN250_tree = (Object)adaptor.create(LPAREN250);
                    adaptor.addChild(root_0, LPAREN250_tree);
                    }
                    pushFollow(FOLLOW_exprListOpt_in_callOrSlice2386);
                    exprListOpt251=exprListOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, exprListOpt251.getTree());
                    RPAREN252=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_callOrSlice2388); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RPAREN252_tree = (Object)adaptor.create(RPAREN252);
                    adaptor.addChild(root_0, RPAREN252_tree);
                    }

                    }
                    break;
                case 2 :
                    // TinyHaxeTry1.g:376:4: LBRACKET expr RBRACKET
                    {
                    root_0 = (Object)adaptor.nil();

                    LBRACKET253=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_callOrSlice2393); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LBRACKET253_tree = (Object)adaptor.create(LBRACKET253);
                    adaptor.addChild(root_0, LBRACKET253_tree);
                    }
                    pushFollow(FOLLOW_expr_in_callOrSlice2395);
                    expr254=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr254.getTree());
                    RBRACKET255=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_callOrSlice2397); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RBRACKET255_tree = (Object)adaptor.create(RBRACKET255);
                    adaptor.addChild(root_0, RBRACKET255_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 60, callOrSlice_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "callOrSlice"

    public static class value_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "value"
    // TinyHaxeTry1.g:379:1: value : ( funcLit | arrayLit | objLit | NULL | elementarySymbol | LPAREN expr RPAREN | dotIdent | );
    public final TinyHaxeTry1Parser.value_return value() throws RecognitionException {
        TinyHaxeTry1Parser.value_return retval = new TinyHaxeTry1Parser.value_return();
        retval.start = input.LT(1);
        int value_StartIndex = input.index();
        Object root_0 = null;

        Token NULL259=null;
        Token LPAREN261=null;
        Token RPAREN263=null;
        TinyHaxeTry1Parser.funcLit_return funcLit256 = null;

        TinyHaxeTry1Parser.arrayLit_return arrayLit257 = null;

        TinyHaxeTry1Parser.objLit_return objLit258 = null;

        TinyHaxeTry1Parser.elementarySymbol_return elementarySymbol260 = null;

        TinyHaxeTry1Parser.expr_return expr262 = null;

        TinyHaxeTry1Parser.dotIdent_return dotIdent264 = null;


        Object NULL259_tree=null;
        Object LPAREN261_tree=null;
        Object RPAREN263_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 61) ) { return retval; }
            // TinyHaxeTry1.g:379:7: ( funcLit | arrayLit | objLit | NULL | elementarySymbol | LPAREN expr RPAREN | dotIdent | )
            int alt65=8;
            alt65 = dfa65.predict(input);
            switch (alt65) {
                case 1 :
                    // TinyHaxeTry1.g:379:9: funcLit
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_funcLit_in_value2407);
                    funcLit256=funcLit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, funcLit256.getTree());

                    }
                    break;
                case 2 :
                    // TinyHaxeTry1.g:380:4: arrayLit
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_arrayLit_in_value2413);
                    arrayLit257=arrayLit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arrayLit257.getTree());

                    }
                    break;
                case 3 :
                    // TinyHaxeTry1.g:381:14: objLit
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_objLit_in_value2428);
                    objLit258=objLit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, objLit258.getTree());

                    }
                    break;
                case 4 :
                    // TinyHaxeTry1.g:382:14: NULL
                    {
                    root_0 = (Object)adaptor.nil();

                    NULL259=(Token)match(input,NULL,FOLLOW_NULL_in_value2443); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NULL259_tree = (Object)adaptor.create(NULL259);
                    adaptor.addChild(root_0, NULL259_tree);
                    }

                    }
                    break;
                case 5 :
                    // TinyHaxeTry1.g:383:14: elementarySymbol
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_elementarySymbol_in_value2458);
                    elementarySymbol260=elementarySymbol();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, elementarySymbol260.getTree());

                    }
                    break;
                case 6 :
                    // TinyHaxeTry1.g:384:14: LPAREN expr RPAREN
                    {
                    root_0 = (Object)adaptor.nil();

                    LPAREN261=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_value2473); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_value2476);
                    expr262=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr262.getTree());
                    RPAREN263=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_value2478); if (state.failed) return retval;

                    }
                    break;
                case 7 :
                    // TinyHaxeTry1.g:385:11: dotIdent
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_dotIdent_in_value2491);
                    dotIdent264=dotIdent();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dotIdent264.getTree());

                    }
                    break;
                case 8 :
                    // TinyHaxeTry1.g:387:9: 
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
            if ( state.backtracking>0 ) { memoize(input, 61, value_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "value"

    public static class newExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "newExpr"
    // TinyHaxeTry1.g:389:1: newExpr : NEW type LPAREN exprListOpt RPAREN -> ^( NEW ( type )? ( exprListOpt )? ) ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 62) ) { return retval; }
            // TinyHaxeTry1.g:390:2: ( NEW type LPAREN exprListOpt RPAREN -> ^( NEW ( type )? ( exprListOpt )? ) )
            // TinyHaxeTry1.g:390:4: NEW type LPAREN exprListOpt RPAREN
            {
            NEW265=(Token)match(input,NEW,FOLLOW_NEW_in_newExpr2530); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_NEW.add(NEW265);

            pushFollow(FOLLOW_type_in_newExpr2532);
            type266=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(type266.getTree());
            LPAREN267=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_newExpr2534); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN267);

            pushFollow(FOLLOW_exprListOpt_in_newExpr2536);
            exprListOpt268=exprListOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_exprListOpt.add(exprListOpt268.getTree());
            RPAREN269=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_newExpr2538); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN269);



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
            // 390:39: -> ^( NEW ( type )? ( exprListOpt )? )
            {
                // TinyHaxeTry1.g:390:42: ^( NEW ( type )? ( exprListOpt )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_NEW.nextNode(), root_1);

                // TinyHaxeTry1.g:390:48: ( type )?
                if ( stream_type.hasNext() ) {
                    adaptor.addChild(root_1, stream_type.nextTree());

                }
                stream_type.reset();
                // TinyHaxeTry1.g:390:54: ( exprListOpt )?
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
            if ( state.backtracking>0 ) { memoize(input, 62, newExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "newExpr"

    public static class cast_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "cast"
    // TinyHaxeTry1.g:393:1: cast : ( CAST LPAREN expr ( COMMA funcType )? RPAREN -> ^( CAST ( expr )? ( funcType )? ) | CAST LPAREN expr RPAREN -> ^( CAST ( expr )? ) );
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 63) ) { return retval; }
            // TinyHaxeTry1.g:393:9: ( CAST LPAREN expr ( COMMA funcType )? RPAREN -> ^( CAST ( expr )? ( funcType )? ) | CAST LPAREN expr RPAREN -> ^( CAST ( expr )? ) )
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==CAST) ) {
                int LA67_1 = input.LA(2);

                if ( (synpred122_TinyHaxeTry1()) ) {
                    alt67=1;
                }
                else if ( (true) ) {
                    alt67=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 67, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;
            }
            switch (alt67) {
                case 1 :
                    // TinyHaxeTry1.g:393:11: CAST LPAREN expr ( COMMA funcType )? RPAREN
                    {
                    CAST270=(Token)match(input,CAST,FOLLOW_CAST_in_cast2564); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CAST.add(CAST270);

                    LPAREN271=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_cast2566); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN271);

                    pushFollow(FOLLOW_expr_in_cast2568);
                    expr272=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr272.getTree());
                    // TinyHaxeTry1.g:393:28: ( COMMA funcType )?
                    int alt66=2;
                    int LA66_0 = input.LA(1);

                    if ( (LA66_0==COMMA) ) {
                        alt66=1;
                    }
                    switch (alt66) {
                        case 1 :
                            // TinyHaxeTry1.g:393:29: COMMA funcType
                            {
                            COMMA273=(Token)match(input,COMMA,FOLLOW_COMMA_in_cast2571); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_COMMA.add(COMMA273);

                            pushFollow(FOLLOW_funcType_in_cast2573);
                            funcType274=funcType();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_funcType.add(funcType274.getTree());

                            }
                            break;

                    }

                    RPAREN275=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_cast2577); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN275);



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
                    // 393:54: -> ^( CAST ( expr )? ( funcType )? )
                    {
                        // TinyHaxeTry1.g:393:57: ^( CAST ( expr )? ( funcType )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_CAST.nextNode(), root_1);

                        // TinyHaxeTry1.g:393:64: ( expr )?
                        if ( stream_expr.hasNext() ) {
                            adaptor.addChild(root_1, stream_expr.nextTree());

                        }
                        stream_expr.reset();
                        // TinyHaxeTry1.g:393:70: ( funcType )?
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
                    // TinyHaxeTry1.g:394:4: CAST LPAREN expr RPAREN
                    {
                    CAST276=(Token)match(input,CAST,FOLLOW_CAST_in_cast2595); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CAST.add(CAST276);

                    LPAREN277=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_cast2597); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN277);

                    pushFollow(FOLLOW_expr_in_cast2599);
                    expr278=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr278.getTree());
                    RPAREN279=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_cast2601); if (state.failed) return retval; 
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
                    // 394:31: -> ^( CAST ( expr )? )
                    {
                        // TinyHaxeTry1.g:394:34: ^( CAST ( expr )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_CAST.nextNode(), root_1);

                        // TinyHaxeTry1.g:394:41: ( expr )?
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
            if ( state.backtracking>0 ) { memoize(input, 63, cast_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "cast"

    public static class topLevelDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "topLevelDecl"
    // TinyHaxeTry1.g:399:1: topLevelDecl : ( classDecl | interfaceDecl | enumDecl | typedefDecl );
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 64) ) { return retval; }
            // TinyHaxeTry1.g:400:2: ( classDecl | interfaceDecl | enumDecl | typedefDecl )
            int alt68=4;
            switch ( input.LA(1) ) {
            case MONKEYS_AT:
                {
                int LA68_1 = input.LA(2);

                if ( (synpred123_TinyHaxeTry1()) ) {
                    alt68=1;
                }
                else if ( (synpred124_TinyHaxeTry1()) ) {
                    alt68=2;
                }
                else if ( (synpred125_TinyHaxeTry1()) ) {
                    alt68=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 68, 1, input);

                    throw nvae;
                }
                }
                break;
            case EXTERN:
            case PRIVATE:
                {
                int LA68_2 = input.LA(2);

                if ( (synpred123_TinyHaxeTry1()) ) {
                    alt68=1;
                }
                else if ( (synpred124_TinyHaxeTry1()) ) {
                    alt68=2;
                }
                else if ( (synpred125_TinyHaxeTry1()) ) {
                    alt68=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 68, 2, input);

                    throw nvae;
                }
                }
                break;
            case CLASS:
                {
                alt68=1;
                }
                break;
            case INTERFACE:
                {
                alt68=2;
                }
                break;
            case ENUM:
                {
                alt68=3;
                }
                break;
            case TYPEDEF:
                {
                alt68=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;
            }

            switch (alt68) {
                case 1 :
                    // TinyHaxeTry1.g:400:4: classDecl
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_classDecl_in_topLevelDecl2633);
                    classDecl280=classDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, classDecl280.getTree());

                    }
                    break;
                case 2 :
                    // TinyHaxeTry1.g:401:4: interfaceDecl
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_interfaceDecl_in_topLevelDecl2638);
                    interfaceDecl281=interfaceDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceDecl281.getTree());

                    }
                    break;
                case 3 :
                    // TinyHaxeTry1.g:402:11: enumDecl
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_enumDecl_in_topLevelDecl2650);
                    enumDecl282=enumDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, enumDecl282.getTree());

                    }
                    break;
                case 4 :
                    // TinyHaxeTry1.g:403:4: typedefDecl
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_typedefDecl_in_topLevelDecl2655);
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
            if ( state.backtracking>0 ) { memoize(input, 64, topLevelDecl_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "topLevelDecl"

    public static class enumDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "enumDecl"
    // TinyHaxeTry1.g:406:1: enumDecl : typeDeclFlags ENUM IDENTIFIER typeParamOpt LBRACE enumBody RBRACE -> ^( ENUM ( IDENTIFIER )? ( typeParamOpt )? ( enumBody )? ) ;
    public final TinyHaxeTry1Parser.enumDecl_return enumDecl() throws RecognitionException {
        TinyHaxeTry1Parser.enumDecl_return retval = new TinyHaxeTry1Parser.enumDecl_return();
        retval.start = input.LT(1);
        int enumDecl_StartIndex = input.index();
        Object root_0 = null;

        Token ENUM285=null;
        Token IDENTIFIER286=null;
        Token LBRACE288=null;
        Token RBRACE290=null;
        TinyHaxeTry1Parser.typeDeclFlags_return typeDeclFlags284 = null;

        TinyHaxeTry1Parser.typeParamOpt_return typeParamOpt287 = null;

        TinyHaxeTry1Parser.enumBody_return enumBody289 = null;


        Object ENUM285_tree=null;
        Object IDENTIFIER286_tree=null;
        Object LBRACE288_tree=null;
        Object RBRACE290_tree=null;
        RewriteRuleTokenStream stream_ENUM=new RewriteRuleTokenStream(adaptor,"token ENUM");
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_typeDeclFlags=new RewriteRuleSubtreeStream(adaptor,"rule typeDeclFlags");
        RewriteRuleSubtreeStream stream_enumBody=new RewriteRuleSubtreeStream(adaptor,"rule enumBody");
        RewriteRuleSubtreeStream stream_typeParamOpt=new RewriteRuleSubtreeStream(adaptor,"rule typeParamOpt");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 65) ) { return retval; }
            // TinyHaxeTry1.g:406:9: ( typeDeclFlags ENUM IDENTIFIER typeParamOpt LBRACE enumBody RBRACE -> ^( ENUM ( IDENTIFIER )? ( typeParamOpt )? ( enumBody )? ) )
            // TinyHaxeTry1.g:406:11: typeDeclFlags ENUM IDENTIFIER typeParamOpt LBRACE enumBody RBRACE
            {
            pushFollow(FOLLOW_typeDeclFlags_in_enumDecl2665);
            typeDeclFlags284=typeDeclFlags();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeDeclFlags.add(typeDeclFlags284.getTree());
            ENUM285=(Token)match(input,ENUM,FOLLOW_ENUM_in_enumDecl2667); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ENUM.add(ENUM285);

            IDENTIFIER286=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_enumDecl2669); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER286);

            pushFollow(FOLLOW_typeParamOpt_in_enumDecl2671);
            typeParamOpt287=typeParamOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeParamOpt.add(typeParamOpt287.getTree());
            LBRACE288=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_enumDecl2673); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACE.add(LBRACE288);

            pushFollow(FOLLOW_enumBody_in_enumDecl2675);
            enumBody289=enumBody();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_enumBody.add(enumBody289.getTree());
            RBRACE290=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_enumDecl2677); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACE.add(RBRACE290);



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
            // 406:77: -> ^( ENUM ( IDENTIFIER )? ( typeParamOpt )? ( enumBody )? )
            {
                // TinyHaxeTry1.g:406:80: ^( ENUM ( IDENTIFIER )? ( typeParamOpt )? ( enumBody )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_ENUM.nextNode(), root_1);

                // TinyHaxeTry1.g:406:87: ( IDENTIFIER )?
                if ( stream_IDENTIFIER.hasNext() ) {
                    adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());

                }
                stream_IDENTIFIER.reset();
                // TinyHaxeTry1.g:406:99: ( typeParamOpt )?
                if ( stream_typeParamOpt.hasNext() ) {
                    adaptor.addChild(root_1, stream_typeParamOpt.nextTree());

                }
                stream_typeParamOpt.reset();
                // TinyHaxeTry1.g:406:113: ( enumBody )?
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
            if ( state.backtracking>0 ) { memoize(input, 65, enumDecl_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "enumDecl"

    public static class enumBody_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "enumBody"
    // TinyHaxeTry1.g:409:1: enumBody : ( enumValueDecl )* ;
    public final TinyHaxeTry1Parser.enumBody_return enumBody() throws RecognitionException {
        TinyHaxeTry1Parser.enumBody_return retval = new TinyHaxeTry1Parser.enumBody_return();
        retval.start = input.LT(1);
        int enumBody_StartIndex = input.index();
        Object root_0 = null;

        TinyHaxeTry1Parser.enumValueDecl_return enumValueDecl291 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 66) ) { return retval; }
            // TinyHaxeTry1.g:409:9: ( ( enumValueDecl )* )
            // TinyHaxeTry1.g:409:11: ( enumValueDecl )*
            {
            root_0 = (Object)adaptor.nil();

            // TinyHaxeTry1.g:409:11: ( enumValueDecl )*
            loop69:
            do {
                int alt69=2;
                int LA69_0 = input.LA(1);

                if ( (LA69_0==IDENTIFIER) ) {
                    alt69=1;
                }


                switch (alt69) {
            	case 1 :
            	    // TinyHaxeTry1.g:409:12: enumValueDecl
            	    {
            	    pushFollow(FOLLOW_enumValueDecl_in_enumBody2703);
            	    enumValueDecl291=enumValueDecl();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, enumValueDecl291.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 66, enumBody_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "enumBody"

    public static class enumValueDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "enumValueDecl"
    // TinyHaxeTry1.g:412:1: enumValueDecl : ( IDENTIFIER LPAREN paramList RPAREN SEMI -> ^( IDENTIFIER[$IDENTIFIER] ( IDENTIFIER )? ( paramList )? ) | IDENTIFIER SEMI -> ^( IDENTIFIER[$IDENTIFIER] ( IDENTIFIER )? ) );
    public final TinyHaxeTry1Parser.enumValueDecl_return enumValueDecl() throws RecognitionException {
        TinyHaxeTry1Parser.enumValueDecl_return retval = new TinyHaxeTry1Parser.enumValueDecl_return();
        retval.start = input.LT(1);
        int enumValueDecl_StartIndex = input.index();
        Object root_0 = null;

        Token IDENTIFIER292=null;
        Token LPAREN293=null;
        Token RPAREN295=null;
        Token SEMI296=null;
        Token IDENTIFIER297=null;
        Token SEMI298=null;
        TinyHaxeTry1Parser.paramList_return paramList294 = null;


        Object IDENTIFIER292_tree=null;
        Object LPAREN293_tree=null;
        Object RPAREN295_tree=null;
        Object SEMI296_tree=null;
        Object IDENTIFIER297_tree=null;
        Object SEMI298_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_paramList=new RewriteRuleSubtreeStream(adaptor,"rule paramList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 67) ) { return retval; }
            // TinyHaxeTry1.g:413:2: ( IDENTIFIER LPAREN paramList RPAREN SEMI -> ^( IDENTIFIER[$IDENTIFIER] ( IDENTIFIER )? ( paramList )? ) | IDENTIFIER SEMI -> ^( IDENTIFIER[$IDENTIFIER] ( IDENTIFIER )? ) )
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==IDENTIFIER) ) {
                int LA70_1 = input.LA(2);

                if ( (LA70_1==LPAREN) ) {
                    alt70=1;
                }
                else if ( (LA70_1==SEMI) ) {
                    alt70=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 70, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;
            }
            switch (alt70) {
                case 1 :
                    // TinyHaxeTry1.g:413:4: IDENTIFIER LPAREN paramList RPAREN SEMI
                    {
                    IDENTIFIER292=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_enumValueDecl2722); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER292);

                    LPAREN293=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_enumValueDecl2724); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN293);

                    pushFollow(FOLLOW_paramList_in_enumValueDecl2726);
                    paramList294=paramList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_paramList.add(paramList294.getTree());
                    RPAREN295=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_enumValueDecl2728); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN295);

                    SEMI296=(Token)match(input,SEMI,FOLLOW_SEMI_in_enumValueDecl2730); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI296);



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
                    // 413:44: -> ^( IDENTIFIER[$IDENTIFIER] ( IDENTIFIER )? ( paramList )? )
                    {
                        // TinyHaxeTry1.g:413:47: ^( IDENTIFIER[$IDENTIFIER] ( IDENTIFIER )? ( paramList )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new VarDeclaration(IDENTIFIER, IDENTIFIER292), root_1);

                        // TinyHaxeTry1.g:413:89: ( IDENTIFIER )?
                        if ( stream_IDENTIFIER.hasNext() ) {
                            adaptor.addChild(root_1, new VarUsage(stream_IDENTIFIER.nextToken()));

                        }
                        stream_IDENTIFIER.reset();
                        // TinyHaxeTry1.g:413:111: ( paramList )?
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
                    // TinyHaxeTry1.g:414:4: IDENTIFIER SEMI
                    {
                    IDENTIFIER297=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_enumValueDecl2756); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER297);

                    SEMI298=(Token)match(input,SEMI,FOLLOW_SEMI_in_enumValueDecl2758); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI298);



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
                    // 414:23: -> ^( IDENTIFIER[$IDENTIFIER] ( IDENTIFIER )? )
                    {
                        // TinyHaxeTry1.g:414:26: ^( IDENTIFIER[$IDENTIFIER] ( IDENTIFIER )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new VarDeclaration(IDENTIFIER, IDENTIFIER297), root_1);

                        // TinyHaxeTry1.g:414:68: ( IDENTIFIER )?
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
            if ( state.backtracking>0 ) { memoize(input, 67, enumValueDecl_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "enumValueDecl"

    public static class varDeclList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "varDeclList"
    // TinyHaxeTry1.g:418:1: varDeclList : varDecl varDeclList ;
    public final TinyHaxeTry1Parser.varDeclList_return varDeclList() throws RecognitionException {
        TinyHaxeTry1Parser.varDeclList_return retval = new TinyHaxeTry1Parser.varDeclList_return();
        retval.start = input.LT(1);
        int varDeclList_StartIndex = input.index();
        Object root_0 = null;

        TinyHaxeTry1Parser.varDecl_return varDecl299 = null;

        TinyHaxeTry1Parser.varDeclList_return varDeclList300 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 68) ) { return retval; }
            // TinyHaxeTry1.g:419:2: ( varDecl varDeclList )
            // TinyHaxeTry1.g:419:4: varDecl varDeclList
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_varDecl_in_varDeclList2797);
            varDecl299=varDecl();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, varDecl299.getTree());
            pushFollow(FOLLOW_varDeclList_in_varDeclList2799);
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
            if ( state.backtracking>0 ) { memoize(input, 68, varDeclList_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "varDeclList"

    public static class varDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "varDecl"
    // TinyHaxeTry1.g:422:1: varDecl : ( declAttrList )? VAR varDeclPartList SEMI -> ^( VAR[$VAR] ( declAttrList )? ( varDeclPartList )? ) ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 69) ) { return retval; }
            // TinyHaxeTry1.g:422:9: ( ( declAttrList )? VAR varDeclPartList SEMI -> ^( VAR[$VAR] ( declAttrList )? ( varDeclPartList )? ) )
            // TinyHaxeTry1.g:422:11: ( declAttrList )? VAR varDeclPartList SEMI
            {
            // TinyHaxeTry1.g:422:11: ( declAttrList )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==PRIVATE||(LA71_0>=PUBLIC && LA71_0<=OVERRIDE)) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // TinyHaxeTry1.g:422:12: declAttrList
                    {
                    pushFollow(FOLLOW_declAttrList_in_varDecl2811);
                    declAttrList301=declAttrList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declAttrList.add(declAttrList301.getTree());

                    }
                    break;

            }

            VAR302=(Token)match(input,VAR,FOLLOW_VAR_in_varDecl2815); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_VAR.add(VAR302);

            pushFollow(FOLLOW_varDeclPartList_in_varDecl2817);
            varDeclPartList303=varDeclPartList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_varDeclPartList.add(varDeclPartList303.getTree());
            SEMI304=(Token)match(input,SEMI,FOLLOW_SEMI_in_varDecl2819); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SEMI.add(SEMI304);



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
            // 422:52: -> ^( VAR[$VAR] ( declAttrList )? ( varDeclPartList )? )
            {
                // TinyHaxeTry1.g:422:55: ^( VAR[$VAR] ( declAttrList )? ( varDeclPartList )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new VarDeclaration(VAR, VAR302), root_1);

                // TinyHaxeTry1.g:422:83: ( declAttrList )?
                if ( stream_declAttrList.hasNext() ) {
                    adaptor.addChild(root_1, stream_declAttrList.nextTree());

                }
                stream_declAttrList.reset();
                // TinyHaxeTry1.g:422:97: ( varDeclPartList )?
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
            if ( state.backtracking>0 ) { memoize(input, 69, varDecl_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "varDecl"

    public static class varDeclPartList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "varDeclPartList"
    // TinyHaxeTry1.g:425:1: varDeclPartList : varDeclPart ( COMMA varDeclPart )* ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 70) ) { return retval; }
            // TinyHaxeTry1.g:426:2: ( varDeclPart ( COMMA varDeclPart )* )
            // TinyHaxeTry1.g:426:4: varDeclPart ( COMMA varDeclPart )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_varDeclPart_in_varDeclPartList2850);
            varDeclPart305=varDeclPart();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclPart305.getTree());
            // TinyHaxeTry1.g:426:16: ( COMMA varDeclPart )*
            loop72:
            do {
                int alt72=2;
                int LA72_0 = input.LA(1);

                if ( (LA72_0==COMMA) ) {
                    alt72=1;
                }


                switch (alt72) {
            	case 1 :
            	    // TinyHaxeTry1.g:426:17: COMMA varDeclPart
            	    {
            	    COMMA306=(Token)match(input,COMMA,FOLLOW_COMMA_in_varDeclPartList2853); if (state.failed) return retval;
            	    pushFollow(FOLLOW_varDeclPart_in_varDeclPartList2856);
            	    varDeclPart307=varDeclPart();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclPart307.getTree());

            	    }
            	    break;

            	default :
            	    break loop72;
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
            if ( state.backtracking>0 ) { memoize(input, 70, varDeclPartList_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "varDeclPartList"

    public static class varDeclPart_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "varDeclPart"
    // TinyHaxeTry1.g:429:1: varDeclPart : IDENTIFIER propDeclOpt typeTagOpt varInit ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 71) ) { return retval; }
            // TinyHaxeTry1.g:430:2: ( IDENTIFIER propDeclOpt typeTagOpt varInit )
            // TinyHaxeTry1.g:430:4: IDENTIFIER propDeclOpt typeTagOpt varInit
            {
            root_0 = (Object)adaptor.nil();

            IDENTIFIER308=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_varDeclPart2870); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER308_tree = new VarUsage(IDENTIFIER308) ;
            adaptor.addChild(root_0, IDENTIFIER308_tree);
            }
            pushFollow(FOLLOW_propDeclOpt_in_varDeclPart2875);
            propDeclOpt309=propDeclOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, propDeclOpt309.getTree());
            pushFollow(FOLLOW_typeTagOpt_in_varDeclPart2877);
            typeTagOpt310=typeTagOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, typeTagOpt310.getTree());
            pushFollow(FOLLOW_varInit_in_varDeclPart2879);
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
            if ( state.backtracking>0 ) { memoize(input, 71, varDeclPart_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "varDeclPart"

    public static class propDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "propDecl"
    // TinyHaxeTry1.g:433:1: propDecl : LPAREN a1= propAccessor COMMA a2= propAccessor RPAREN -> ^( PROPERTY_DECL[\"PROPERTY_DECL\",true] ( $a1)? ( $a2)? ) ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 72) ) { return retval; }
            // TinyHaxeTry1.g:433:9: ( LPAREN a1= propAccessor COMMA a2= propAccessor RPAREN -> ^( PROPERTY_DECL[\"PROPERTY_DECL\",true] ( $a1)? ( $a2)? ) )
            // TinyHaxeTry1.g:433:11: LPAREN a1= propAccessor COMMA a2= propAccessor RPAREN
            {
            LPAREN312=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_propDecl2889); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN312);

            pushFollow(FOLLOW_propAccessor_in_propDecl2893);
            a1=propAccessor();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_propAccessor.add(a1.getTree());
            COMMA313=(Token)match(input,COMMA,FOLLOW_COMMA_in_propDecl2895); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COMMA.add(COMMA313);

            pushFollow(FOLLOW_propAccessor_in_propDecl2899);
            a2=propAccessor();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_propAccessor.add(a2.getTree());
            RPAREN314=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_propDecl2901); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN314);



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
            // 433:63: -> ^( PROPERTY_DECL[\"PROPERTY_DECL\",true] ( $a1)? ( $a2)? )
            {
                // TinyHaxeTry1.g:433:66: ^( PROPERTY_DECL[\"PROPERTY_DECL\",true] ( $a1)? ( $a2)? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new ExtendedCommonTree(PROPERTY_DECL, "PROPERTY_DECL", true), root_1);

                // TinyHaxeTry1.g:433:124: ( $a1)?
                if ( stream_a1.hasNext() ) {
                    adaptor.addChild(root_1, stream_a1.nextTree());

                }
                stream_a1.reset();
                // TinyHaxeTry1.g:433:129: ( $a2)?
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
            if ( state.backtracking>0 ) { memoize(input, 72, propDecl_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "propDecl"

    public static class propAccessor_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "propAccessor"
    // TinyHaxeTry1.g:436:1: propAccessor : ( IDENTIFIER | NULL | DEFAULT | DYNAMIC );
    public final TinyHaxeTry1Parser.propAccessor_return propAccessor() throws RecognitionException {
        TinyHaxeTry1Parser.propAccessor_return retval = new TinyHaxeTry1Parser.propAccessor_return();
        retval.start = input.LT(1);
        int propAccessor_StartIndex = input.index();
        Object root_0 = null;

        Token set315=null;

        Object set315_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 73) ) { return retval; }
            // TinyHaxeTry1.g:437:2: ( IDENTIFIER | NULL | DEFAULT | DYNAMIC )
            // TinyHaxeTry1.g:
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
            if ( state.backtracking>0 ) { memoize(input, 73, propAccessor_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "propAccessor"

    public static class propDeclOpt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "propDeclOpt"
    // TinyHaxeTry1.g:443:1: propDeclOpt : ( propDecl | );
    public final TinyHaxeTry1Parser.propDeclOpt_return propDeclOpt() throws RecognitionException {
        TinyHaxeTry1Parser.propDeclOpt_return retval = new TinyHaxeTry1Parser.propDeclOpt_return();
        retval.start = input.LT(1);
        int propDeclOpt_StartIndex = input.index();
        Object root_0 = null;

        TinyHaxeTry1Parser.propDecl_return propDecl316 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 74) ) { return retval; }
            // TinyHaxeTry1.g:444:2: ( propDecl | )
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==LPAREN) ) {
                alt73=1;
            }
            else if ( (LA73_0==EOF||LA73_0==SEMI||LA73_0==COLON||LA73_0==COMMA||LA73_0==EQ||LA73_0==RPAREN||LA73_0==LBRACE) ) {
                alt73=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;
            }
            switch (alt73) {
                case 1 :
                    // TinyHaxeTry1.g:444:4: propDecl
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_propDecl_in_propDeclOpt2961);
                    propDecl316=propDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, propDecl316.getTree());

                    }
                    break;
                case 2 :
                    // TinyHaxeTry1.g:446:2: 
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
            if ( state.backtracking>0 ) { memoize(input, 74, propDeclOpt_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "propDeclOpt"

    public static class varInit_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "varInit"
    // TinyHaxeTry1.g:448:1: varInit : ( EQ expr -> ^( VAR_INIT[\"VAR_INIT\",true] ( expr )? ) | );
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 75) ) { return retval; }
            // TinyHaxeTry1.g:448:9: ( EQ expr -> ^( VAR_INIT[\"VAR_INIT\",true] ( expr )? ) | )
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==EQ) ) {
                alt74=1;
            }
            else if ( (LA74_0==EOF||LA74_0==SEMI||LA74_0==COMMA||LA74_0==RPAREN) ) {
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
                    // TinyHaxeTry1.g:448:11: EQ expr
                    {
                    EQ317=(Token)match(input,EQ,FOLLOW_EQ_in_varInit2976); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EQ.add(EQ317);

                    pushFollow(FOLLOW_expr_in_varInit2978);
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
                    // 448:19: -> ^( VAR_INIT[\"VAR_INIT\",true] ( expr )? )
                    {
                        // TinyHaxeTry1.g:448:22: ^( VAR_INIT[\"VAR_INIT\",true] ( expr )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new ExtendedCommonTree(VAR_INIT, "VAR_INIT", true), root_1);

                        // TinyHaxeTry1.g:448:70: ( expr )?
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
                    // TinyHaxeTry1.g:450:2: 
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
            if ( state.backtracking>0 ) { memoize(input, 75, varInit_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "varInit"

    public static class funcDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "funcDecl"
    // TinyHaxeTry1.g:452:1: funcDecl : ( ( declAttrList )? FUNCTION NEW LPAREN paramList RPAREN typeTagOpt block -> ^( FUNCTION NEW ( declAttrList )? ( paramList )? ( typeTagOpt )? ( block )? ) | ( declAttrList )? FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt block -> ^( FUNCTION IDENTIFIER ( declAttrList )? ( paramList )? ( typeTagOpt )? ( block )? ( typeParamOpt )? ) );
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 76) ) { return retval; }
            // TinyHaxeTry1.g:452:9: ( ( declAttrList )? FUNCTION NEW LPAREN paramList RPAREN typeTagOpt block -> ^( FUNCTION NEW ( declAttrList )? ( paramList )? ( typeTagOpt )? ( block )? ) | ( declAttrList )? FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt block -> ^( FUNCTION IDENTIFIER ( declAttrList )? ( paramList )? ( typeTagOpt )? ( block )? ( typeParamOpt )? ) )
            int alt77=2;
            alt77 = dfa77.predict(input);
            switch (alt77) {
                case 1 :
                    // TinyHaxeTry1.g:452:11: ( declAttrList )? FUNCTION NEW LPAREN paramList RPAREN typeTagOpt block
                    {
                    // TinyHaxeTry1.g:452:11: ( declAttrList )?
                    int alt75=2;
                    int LA75_0 = input.LA(1);

                    if ( (LA75_0==PRIVATE||(LA75_0>=PUBLIC && LA75_0<=OVERRIDE)) ) {
                        alt75=1;
                    }
                    switch (alt75) {
                        case 1 :
                            // TinyHaxeTry1.g:0:0: declAttrList
                            {
                            pushFollow(FOLLOW_declAttrList_in_funcDecl3005);
                            declAttrList319=declAttrList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_declAttrList.add(declAttrList319.getTree());

                            }
                            break;

                    }

                    FUNCTION320=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcDecl3008); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION320);

                    NEW321=(Token)match(input,NEW,FOLLOW_NEW_in_funcDecl3010); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEW.add(NEW321);

                    LPAREN322=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcDecl3012); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN322);

                    pushFollow(FOLLOW_paramList_in_funcDecl3014);
                    paramList323=paramList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_paramList.add(paramList323.getTree());
                    RPAREN324=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcDecl3016); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN324);

                    pushFollow(FOLLOW_typeTagOpt_in_funcDecl3018);
                    typeTagOpt325=typeTagOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeTagOpt.add(typeTagOpt325.getTree());
                    pushFollow(FOLLOW_block_in_funcDecl3020);
                    block326=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block326.getTree());


                    // AST REWRITE
                    // elements: FUNCTION, typeTagOpt, paramList, NEW, declAttrList, block
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 453:4: -> ^( FUNCTION NEW ( declAttrList )? ( paramList )? ( typeTagOpt )? ( block )? )
                    {
                        // TinyHaxeTry1.g:453:7: ^( FUNCTION NEW ( declAttrList )? ( paramList )? ( typeTagOpt )? ( block )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new FunctionNode(stream_FUNCTION.nextToken()), root_1);

                        adaptor.addChild(root_1, stream_NEW.nextNode());
                        // TinyHaxeTry1.g:453:36: ( declAttrList )?
                        if ( stream_declAttrList.hasNext() ) {
                            adaptor.addChild(root_1, stream_declAttrList.nextTree());

                        }
                        stream_declAttrList.reset();
                        // TinyHaxeTry1.g:453:50: ( paramList )?
                        if ( stream_paramList.hasNext() ) {
                            adaptor.addChild(root_1, stream_paramList.nextTree());

                        }
                        stream_paramList.reset();
                        // TinyHaxeTry1.g:453:61: ( typeTagOpt )?
                        if ( stream_typeTagOpt.hasNext() ) {
                            adaptor.addChild(root_1, stream_typeTagOpt.nextTree());

                        }
                        stream_typeTagOpt.reset();
                        // TinyHaxeTry1.g:453:73: ( block )?
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
                    // TinyHaxeTry1.g:454:4: ( declAttrList )? FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt block
                    {
                    // TinyHaxeTry1.g:454:4: ( declAttrList )?
                    int alt76=2;
                    int LA76_0 = input.LA(1);

                    if ( (LA76_0==PRIVATE||(LA76_0>=PUBLIC && LA76_0<=OVERRIDE)) ) {
                        alt76=1;
                    }
                    switch (alt76) {
                        case 1 :
                            // TinyHaxeTry1.g:0:0: declAttrList
                            {
                            pushFollow(FOLLOW_declAttrList_in_funcDecl3053);
                            declAttrList327=declAttrList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_declAttrList.add(declAttrList327.getTree());

                            }
                            break;

                    }

                    FUNCTION328=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcDecl3056); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION328);

                    IDENTIFIER329=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_funcDecl3058); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER329);

                    pushFollow(FOLLOW_typeParamOpt_in_funcDecl3060);
                    typeParamOpt330=typeParamOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeParamOpt.add(typeParamOpt330.getTree());
                    LPAREN331=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcDecl3062); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN331);

                    pushFollow(FOLLOW_paramList_in_funcDecl3064);
                    paramList332=paramList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_paramList.add(paramList332.getTree());
                    RPAREN333=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcDecl3066); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN333);

                    pushFollow(FOLLOW_typeTagOpt_in_funcDecl3068);
                    typeTagOpt334=typeTagOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeTagOpt.add(typeTagOpt334.getTree());
                    pushFollow(FOLLOW_block_in_funcDecl3070);
                    block335=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block335.getTree());


                    // AST REWRITE
                    // elements: paramList, block, FUNCTION, typeTagOpt, IDENTIFIER, typeParamOpt, declAttrList
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 455:4: -> ^( FUNCTION IDENTIFIER ( declAttrList )? ( paramList )? ( typeTagOpt )? ( block )? ( typeParamOpt )? )
                    {
                        // TinyHaxeTry1.g:455:7: ^( FUNCTION IDENTIFIER ( declAttrList )? ( paramList )? ( typeTagOpt )? ( block )? ( typeParamOpt )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new FunctionNode(stream_FUNCTION.nextToken()), root_1);

                        adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
                        // TinyHaxeTry1.g:455:43: ( declAttrList )?
                        if ( stream_declAttrList.hasNext() ) {
                            adaptor.addChild(root_1, stream_declAttrList.nextTree());

                        }
                        stream_declAttrList.reset();
                        // TinyHaxeTry1.g:455:57: ( paramList )?
                        if ( stream_paramList.hasNext() ) {
                            adaptor.addChild(root_1, stream_paramList.nextTree());

                        }
                        stream_paramList.reset();
                        // TinyHaxeTry1.g:455:68: ( typeTagOpt )?
                        if ( stream_typeTagOpt.hasNext() ) {
                            adaptor.addChild(root_1, stream_typeTagOpt.nextTree());

                        }
                        stream_typeTagOpt.reset();
                        // TinyHaxeTry1.g:455:80: ( block )?
                        if ( stream_block.hasNext() ) {
                            adaptor.addChild(root_1, stream_block.nextTree());

                        }
                        stream_block.reset();
                        // TinyHaxeTry1.g:455:87: ( typeParamOpt )?
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
            if ( state.backtracking>0 ) { memoize(input, 76, funcDecl_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "funcDecl"

    public static class funcProtoDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "funcProtoDecl"
    // TinyHaxeTry1.g:458:1: funcProtoDecl : ( declAttrList FUNCTION NEW LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTagOpt )? ( declAttrList )? ) | declAttrList FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTagOpt )? ( declAttrList )? ( typeParamOpt )? ) | FUNCTION NEW LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTagOpt )? ) | FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTagOpt )? ( typeParamOpt )? ) );
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 77) ) { return retval; }
            // TinyHaxeTry1.g:459:2: ( declAttrList FUNCTION NEW LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTagOpt )? ( declAttrList )? ) | declAttrList FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTagOpt )? ( declAttrList )? ( typeParamOpt )? ) | FUNCTION NEW LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTagOpt )? ) | FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTagOpt )? ( typeParamOpt )? ) )
            int alt78=4;
            alt78 = dfa78.predict(input);
            switch (alt78) {
                case 1 :
                    // TinyHaxeTry1.g:459:4: declAttrList FUNCTION NEW LPAREN paramList RPAREN typeTagOpt SEMI
                    {
                    pushFollow(FOLLOW_declAttrList_in_funcProtoDecl3112);
                    declAttrList336=declAttrList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declAttrList.add(declAttrList336.getTree());
                    FUNCTION337=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcProtoDecl3114); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION337);

                    NEW338=(Token)match(input,NEW,FOLLOW_NEW_in_funcProtoDecl3116); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEW.add(NEW338);

                    LPAREN339=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcProtoDecl3118); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN339);

                    pushFollow(FOLLOW_paramList_in_funcProtoDecl3120);
                    paramList340=paramList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_paramList.add(paramList340.getTree());
                    RPAREN341=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcProtoDecl3122); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN341);

                    pushFollow(FOLLOW_typeTagOpt_in_funcProtoDecl3124);
                    typeTagOpt342=typeTagOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeTagOpt.add(typeTagOpt342.getTree());
                    SEMI343=(Token)match(input,SEMI,FOLLOW_SEMI_in_funcProtoDecl3126); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI343);



                    // AST REWRITE
                    // elements: declAttrList, FUNCTION, paramList, NEW, typeTagOpt
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 460:4: -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTagOpt )? ( declAttrList )? )
                    {
                        // TinyHaxeTry1.g:460:7: ^( FUNCTION ( NEW )? ( paramList )? ( typeTagOpt )? ( declAttrList )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_FUNCTION.nextNode(), root_1);

                        // TinyHaxeTry1.g:460:18: ( NEW )?
                        if ( stream_NEW.hasNext() ) {
                            adaptor.addChild(root_1, stream_NEW.nextNode());

                        }
                        stream_NEW.reset();
                        // TinyHaxeTry1.g:460:23: ( paramList )?
                        if ( stream_paramList.hasNext() ) {
                            adaptor.addChild(root_1, stream_paramList.nextTree());

                        }
                        stream_paramList.reset();
                        // TinyHaxeTry1.g:460:34: ( typeTagOpt )?
                        if ( stream_typeTagOpt.hasNext() ) {
                            adaptor.addChild(root_1, stream_typeTagOpt.nextTree());

                        }
                        stream_typeTagOpt.reset();
                        // TinyHaxeTry1.g:460:46: ( declAttrList )?
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
                    // TinyHaxeTry1.g:461:4: declAttrList FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt SEMI
                    {
                    pushFollow(FOLLOW_declAttrList_in_funcProtoDecl3153);
                    declAttrList344=declAttrList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declAttrList.add(declAttrList344.getTree());
                    FUNCTION345=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcProtoDecl3155); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION345);

                    IDENTIFIER346=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_funcProtoDecl3157); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER346);

                    pushFollow(FOLLOW_typeParamOpt_in_funcProtoDecl3159);
                    typeParamOpt347=typeParamOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeParamOpt.add(typeParamOpt347.getTree());
                    LPAREN348=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcProtoDecl3161); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN348);

                    pushFollow(FOLLOW_paramList_in_funcProtoDecl3163);
                    paramList349=paramList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_paramList.add(paramList349.getTree());
                    RPAREN350=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcProtoDecl3165); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN350);

                    pushFollow(FOLLOW_typeTagOpt_in_funcProtoDecl3167);
                    typeTagOpt351=typeTagOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeTagOpt.add(typeTagOpt351.getTree());
                    SEMI352=(Token)match(input,SEMI,FOLLOW_SEMI_in_funcProtoDecl3169); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI352);



                    // AST REWRITE
                    // elements: FUNCTION, typeParamOpt, declAttrList, typeTagOpt, IDENTIFIER, paramList
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 462:4: -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTagOpt )? ( declAttrList )? ( typeParamOpt )? )
                    {
                        // TinyHaxeTry1.g:462:7: ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTagOpt )? ( declAttrList )? ( typeParamOpt )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_FUNCTION.nextNode(), root_1);

                        // TinyHaxeTry1.g:462:18: ( IDENTIFIER )?
                        if ( stream_IDENTIFIER.hasNext() ) {
                            adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());

                        }
                        stream_IDENTIFIER.reset();
                        // TinyHaxeTry1.g:462:30: ( paramList )?
                        if ( stream_paramList.hasNext() ) {
                            adaptor.addChild(root_1, stream_paramList.nextTree());

                        }
                        stream_paramList.reset();
                        // TinyHaxeTry1.g:462:41: ( typeTagOpt )?
                        if ( stream_typeTagOpt.hasNext() ) {
                            adaptor.addChild(root_1, stream_typeTagOpt.nextTree());

                        }
                        stream_typeTagOpt.reset();
                        // TinyHaxeTry1.g:462:53: ( declAttrList )?
                        if ( stream_declAttrList.hasNext() ) {
                            adaptor.addChild(root_1, stream_declAttrList.nextTree());

                        }
                        stream_declAttrList.reset();
                        // TinyHaxeTry1.g:462:67: ( typeParamOpt )?
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
                    // TinyHaxeTry1.g:463:4: FUNCTION NEW LPAREN paramList RPAREN typeTagOpt SEMI
                    {
                    FUNCTION353=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcProtoDecl3199); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION353);

                    NEW354=(Token)match(input,NEW,FOLLOW_NEW_in_funcProtoDecl3201); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEW.add(NEW354);

                    LPAREN355=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcProtoDecl3203); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN355);

                    pushFollow(FOLLOW_paramList_in_funcProtoDecl3205);
                    paramList356=paramList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_paramList.add(paramList356.getTree());
                    RPAREN357=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcProtoDecl3207); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN357);

                    pushFollow(FOLLOW_typeTagOpt_in_funcProtoDecl3209);
                    typeTagOpt358=typeTagOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeTagOpt.add(typeTagOpt358.getTree());
                    SEMI359=(Token)match(input,SEMI,FOLLOW_SEMI_in_funcProtoDecl3211); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI359);



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
                    // 464:4: -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTagOpt )? )
                    {
                        // TinyHaxeTry1.g:464:7: ^( FUNCTION ( NEW )? ( paramList )? ( typeTagOpt )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_FUNCTION.nextNode(), root_1);

                        // TinyHaxeTry1.g:464:18: ( NEW )?
                        if ( stream_NEW.hasNext() ) {
                            adaptor.addChild(root_1, stream_NEW.nextNode());

                        }
                        stream_NEW.reset();
                        // TinyHaxeTry1.g:464:23: ( paramList )?
                        if ( stream_paramList.hasNext() ) {
                            adaptor.addChild(root_1, stream_paramList.nextTree());

                        }
                        stream_paramList.reset();
                        // TinyHaxeTry1.g:464:34: ( typeTagOpt )?
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
                    // TinyHaxeTry1.g:465:4: FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt SEMI
                    {
                    FUNCTION360=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcProtoDecl3235); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION360);

                    IDENTIFIER361=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_funcProtoDecl3237); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER361);

                    pushFollow(FOLLOW_typeParamOpt_in_funcProtoDecl3239);
                    typeParamOpt362=typeParamOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeParamOpt.add(typeParamOpt362.getTree());
                    LPAREN363=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcProtoDecl3241); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN363);

                    pushFollow(FOLLOW_paramList_in_funcProtoDecl3243);
                    paramList364=paramList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_paramList.add(paramList364.getTree());
                    RPAREN365=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcProtoDecl3245); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN365);

                    pushFollow(FOLLOW_typeTagOpt_in_funcProtoDecl3247);
                    typeTagOpt366=typeTagOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeTagOpt.add(typeTagOpt366.getTree());
                    SEMI367=(Token)match(input,SEMI,FOLLOW_SEMI_in_funcProtoDecl3249); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI367);



                    // AST REWRITE
                    // elements: typeParamOpt, paramList, FUNCTION, IDENTIFIER, typeTagOpt
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 466:4: -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTagOpt )? ( typeParamOpt )? )
                    {
                        // TinyHaxeTry1.g:466:7: ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTagOpt )? ( typeParamOpt )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_FUNCTION.nextNode(), root_1);

                        // TinyHaxeTry1.g:466:18: ( IDENTIFIER )?
                        if ( stream_IDENTIFIER.hasNext() ) {
                            adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());

                        }
                        stream_IDENTIFIER.reset();
                        // TinyHaxeTry1.g:466:30: ( paramList )?
                        if ( stream_paramList.hasNext() ) {
                            adaptor.addChild(root_1, stream_paramList.nextTree());

                        }
                        stream_paramList.reset();
                        // TinyHaxeTry1.g:466:41: ( typeTagOpt )?
                        if ( stream_typeTagOpt.hasNext() ) {
                            adaptor.addChild(root_1, stream_typeTagOpt.nextTree());

                        }
                        stream_typeTagOpt.reset();
                        // TinyHaxeTry1.g:466:53: ( typeParamOpt )?
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
            if ( state.backtracking>0 ) { memoize(input, 77, funcProtoDecl_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "funcProtoDecl"

    public static class classDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "classDecl"
    // TinyHaxeTry1.g:469:1: classDecl : typeDeclFlags CLASS IDENTIFIER typeParamOpt inheritListOpt classBodyScope -> ^( CLASS IDENTIFIER ( typeDeclFlags )? ( typeParamOpt )? ( inheritListOpt )? ( classBodyScope )? ) ;
    public final TinyHaxeTry1Parser.classDecl_return classDecl() throws RecognitionException {
        TinyHaxeTry1Parser.classDecl_return retval = new TinyHaxeTry1Parser.classDecl_return();
        retval.start = input.LT(1);
        int classDecl_StartIndex = input.index();
        Object root_0 = null;

        Token CLASS369=null;
        Token IDENTIFIER370=null;
        TinyHaxeTry1Parser.typeDeclFlags_return typeDeclFlags368 = null;

        TinyHaxeTry1Parser.typeParamOpt_return typeParamOpt371 = null;

        TinyHaxeTry1Parser.inheritListOpt_return inheritListOpt372 = null;

        TinyHaxeTry1Parser.classBodyScope_return classBodyScope373 = null;


        Object CLASS369_tree=null;
        Object IDENTIFIER370_tree=null;
        RewriteRuleTokenStream stream_CLASS=new RewriteRuleTokenStream(adaptor,"token CLASS");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleSubtreeStream stream_typeDeclFlags=new RewriteRuleSubtreeStream(adaptor,"rule typeDeclFlags");
        RewriteRuleSubtreeStream stream_classBodyScope=new RewriteRuleSubtreeStream(adaptor,"rule classBodyScope");
        RewriteRuleSubtreeStream stream_typeParamOpt=new RewriteRuleSubtreeStream(adaptor,"rule typeParamOpt");
        RewriteRuleSubtreeStream stream_inheritListOpt=new RewriteRuleSubtreeStream(adaptor,"rule inheritListOpt");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 78) ) { return retval; }
            // TinyHaxeTry1.g:470:2: ( typeDeclFlags CLASS IDENTIFIER typeParamOpt inheritListOpt classBodyScope -> ^( CLASS IDENTIFIER ( typeDeclFlags )? ( typeParamOpt )? ( inheritListOpt )? ( classBodyScope )? ) )
            // TinyHaxeTry1.g:470:4: typeDeclFlags CLASS IDENTIFIER typeParamOpt inheritListOpt classBodyScope
            {
            pushFollow(FOLLOW_typeDeclFlags_in_classDecl3283);
            typeDeclFlags368=typeDeclFlags();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeDeclFlags.add(typeDeclFlags368.getTree());
            CLASS369=(Token)match(input,CLASS,FOLLOW_CLASS_in_classDecl3285); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CLASS.add(CLASS369);

            IDENTIFIER370=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_classDecl3287); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER370);

            pushFollow(FOLLOW_typeParamOpt_in_classDecl3289);
            typeParamOpt371=typeParamOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeParamOpt.add(typeParamOpt371.getTree());
            pushFollow(FOLLOW_inheritListOpt_in_classDecl3291);
            inheritListOpt372=inheritListOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_inheritListOpt.add(inheritListOpt372.getTree());
            pushFollow(FOLLOW_classBodyScope_in_classDecl3293);
            classBodyScope373=classBodyScope();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_classBodyScope.add(classBodyScope373.getTree());


            // AST REWRITE
            // elements: typeDeclFlags, typeParamOpt, inheritListOpt, IDENTIFIER, CLASS, classBodyScope
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 471:4: -> ^( CLASS IDENTIFIER ( typeDeclFlags )? ( typeParamOpt )? ( inheritListOpt )? ( classBodyScope )? )
            {
                // TinyHaxeTry1.g:471:7: ^( CLASS IDENTIFIER ( typeDeclFlags )? ( typeParamOpt )? ( inheritListOpt )? ( classBodyScope )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new ClassNode(stream_CLASS.nextToken()), root_1);

                adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
                // TinyHaxeTry1.g:471:37: ( typeDeclFlags )?
                if ( stream_typeDeclFlags.hasNext() ) {
                    adaptor.addChild(root_1, stream_typeDeclFlags.nextTree());

                }
                stream_typeDeclFlags.reset();
                // TinyHaxeTry1.g:471:52: ( typeParamOpt )?
                if ( stream_typeParamOpt.hasNext() ) {
                    adaptor.addChild(root_1, stream_typeParamOpt.nextTree());

                }
                stream_typeParamOpt.reset();
                // TinyHaxeTry1.g:471:66: ( inheritListOpt )?
                if ( stream_inheritListOpt.hasNext() ) {
                    adaptor.addChild(root_1, stream_inheritListOpt.nextTree());

                }
                stream_inheritListOpt.reset();
                // TinyHaxeTry1.g:471:82: ( classBodyScope )?
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
            if ( state.backtracking>0 ) { memoize(input, 78, classDecl_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "classDecl"

    public static class classBodyScope_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "classBodyScope"
    // TinyHaxeTry1.g:474:1: classBodyScope : LBRACE ( classMember )* RBRACE -> ^( BLOCK_SCOPE[\"BLOCK_SCOPE\", true, $LBRACE] ( classMember )* RBRACE[$RBRACE, true] ) ;
    public final TinyHaxeTry1Parser.classBodyScope_return classBodyScope() throws RecognitionException {
        TinyHaxeTry1Parser.classBodyScope_return retval = new TinyHaxeTry1Parser.classBodyScope_return();
        retval.start = input.LT(1);
        int classBodyScope_StartIndex = input.index();
        Object root_0 = null;

        Token LBRACE374=null;
        Token RBRACE376=null;
        TinyHaxeTry1Parser.classMember_return classMember375 = null;


        Object LBRACE374_tree=null;
        Object RBRACE376_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_classMember=new RewriteRuleSubtreeStream(adaptor,"rule classMember");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 79) ) { return retval; }
            // TinyHaxeTry1.g:475:2: ( LBRACE ( classMember )* RBRACE -> ^( BLOCK_SCOPE[\"BLOCK_SCOPE\", true, $LBRACE] ( classMember )* RBRACE[$RBRACE, true] ) )
            // TinyHaxeTry1.g:475:4: LBRACE ( classMember )* RBRACE
            {
            LBRACE374=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_classBodyScope3331); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACE.add(LBRACE374);

            // TinyHaxeTry1.g:475:11: ( classMember )*
            loop79:
            do {
                int alt79=2;
                int LA79_0 = input.LA(1);

                if ( (LA79_0==MONKEYS_AT||(LA79_0>=EXTERN && LA79_0<=PRIVATE)||(LA79_0>=PUBLIC && LA79_0<=OVERRIDE)||LA79_0==FUNCTION||(LA79_0>=ENUM && LA79_0<=INTERFACE)) ) {
                    alt79=1;
                }


                switch (alt79) {
            	case 1 :
            	    // TinyHaxeTry1.g:475:12: classMember
            	    {
            	    pushFollow(FOLLOW_classMember_in_classBodyScope3334);
            	    classMember375=classMember();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_classMember.add(classMember375.getTree());

            	    }
            	    break;

            	default :
            	    break loop79;
                }
            } while (true);

            RBRACE376=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_classBodyScope3338); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACE.add(RBRACE376);



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
            // 475:33: -> ^( BLOCK_SCOPE[\"BLOCK_SCOPE\", true, $LBRACE] ( classMember )* RBRACE[$RBRACE, true] )
            {
                // TinyHaxeTry1.g:475:36: ^( BLOCK_SCOPE[\"BLOCK_SCOPE\", true, $LBRACE] ( classMember )* RBRACE[$RBRACE, true] )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new BlockScopeNode(BLOCK_SCOPE, "BLOCK_SCOPE", true, LBRACE374), root_1);

                // TinyHaxeTry1.g:475:96: ( classMember )*
                while ( stream_classMember.hasNext() ) {
                    adaptor.addChild(root_1, stream_classMember.nextTree());

                }
                stream_classMember.reset();
                adaptor.addChild(root_1, new ExtendedCommonTree(RBRACE, RBRACE376, true));

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
            if ( state.backtracking>0 ) { memoize(input, 79, classBodyScope_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "classBodyScope"

    public static class classMember_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "classMember"
    // TinyHaxeTry1.g:478:1: classMember : ( varDecl | funcDecl | enumDecl );
    public final TinyHaxeTry1Parser.classMember_return classMember() throws RecognitionException {
        TinyHaxeTry1Parser.classMember_return retval = new TinyHaxeTry1Parser.classMember_return();
        retval.start = input.LT(1);
        int classMember_StartIndex = input.index();
        Object root_0 = null;

        TinyHaxeTry1Parser.varDecl_return varDecl377 = null;

        TinyHaxeTry1Parser.funcDecl_return funcDecl378 = null;

        TinyHaxeTry1Parser.enumDecl_return enumDecl379 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 80) ) { return retval; }
            // TinyHaxeTry1.g:479:2: ( varDecl | funcDecl | enumDecl )
            int alt80=3;
            alt80 = dfa80.predict(input);
            switch (alt80) {
                case 1 :
                    // TinyHaxeTry1.g:479:4: varDecl
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_varDecl_in_classMember3368);
                    varDecl377=varDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDecl377.getTree());

                    }
                    break;
                case 2 :
                    // TinyHaxeTry1.g:480:4: funcDecl
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_funcDecl_in_classMember3374);
                    funcDecl378=funcDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, funcDecl378.getTree());

                    }
                    break;
                case 3 :
                    // TinyHaxeTry1.g:482:4: enumDecl
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_enumDecl_in_classMember3381);
                    enumDecl379=enumDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, enumDecl379.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 80, classMember_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "classMember"

    public static class interfaceDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "interfaceDecl"
    // TinyHaxeTry1.g:485:1: interfaceDecl : typeDeclFlags INTERFACE type inheritListOpt LBRACE interfaceBody RBRACE ;
    public final TinyHaxeTry1Parser.interfaceDecl_return interfaceDecl() throws RecognitionException {
        TinyHaxeTry1Parser.interfaceDecl_return retval = new TinyHaxeTry1Parser.interfaceDecl_return();
        retval.start = input.LT(1);
        int interfaceDecl_StartIndex = input.index();
        Object root_0 = null;

        Token INTERFACE381=null;
        Token LBRACE384=null;
        Token RBRACE386=null;
        TinyHaxeTry1Parser.typeDeclFlags_return typeDeclFlags380 = null;

        TinyHaxeTry1Parser.type_return type382 = null;

        TinyHaxeTry1Parser.inheritListOpt_return inheritListOpt383 = null;

        TinyHaxeTry1Parser.interfaceBody_return interfaceBody385 = null;


        Object INTERFACE381_tree=null;
        Object LBRACE384_tree=null;
        Object RBRACE386_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 81) ) { return retval; }
            // TinyHaxeTry1.g:486:2: ( typeDeclFlags INTERFACE type inheritListOpt LBRACE interfaceBody RBRACE )
            // TinyHaxeTry1.g:486:4: typeDeclFlags INTERFACE type inheritListOpt LBRACE interfaceBody RBRACE
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_typeDeclFlags_in_interfaceDecl3399);
            typeDeclFlags380=typeDeclFlags();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, typeDeclFlags380.getTree());
            INTERFACE381=(Token)match(input,INTERFACE,FOLLOW_INTERFACE_in_interfaceDecl3401); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            INTERFACE381_tree = (Object)adaptor.create(INTERFACE381);
            adaptor.addChild(root_0, INTERFACE381_tree);
            }
            pushFollow(FOLLOW_type_in_interfaceDecl3403);
            type382=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type382.getTree());
            pushFollow(FOLLOW_inheritListOpt_in_interfaceDecl3405);
            inheritListOpt383=inheritListOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, inheritListOpt383.getTree());
            LBRACE384=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_interfaceDecl3407); if (state.failed) return retval;
            pushFollow(FOLLOW_interfaceBody_in_interfaceDecl3410);
            interfaceBody385=interfaceBody();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceBody385.getTree());
            RBRACE386=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_interfaceDecl3412); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 81, interfaceDecl_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "interfaceDecl"

    public static class interfaceBody_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "interfaceBody"
    // TinyHaxeTry1.g:489:1: interfaceBody : ( varDecl interfaceBody | funcProtoDecl interfaceBody | );
    public final TinyHaxeTry1Parser.interfaceBody_return interfaceBody() throws RecognitionException {
        TinyHaxeTry1Parser.interfaceBody_return retval = new TinyHaxeTry1Parser.interfaceBody_return();
        retval.start = input.LT(1);
        int interfaceBody_StartIndex = input.index();
        Object root_0 = null;

        TinyHaxeTry1Parser.varDecl_return varDecl387 = null;

        TinyHaxeTry1Parser.interfaceBody_return interfaceBody388 = null;

        TinyHaxeTry1Parser.funcProtoDecl_return funcProtoDecl389 = null;

        TinyHaxeTry1Parser.interfaceBody_return interfaceBody390 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 82) ) { return retval; }
            // TinyHaxeTry1.g:490:2: ( varDecl interfaceBody | funcProtoDecl interfaceBody | )
            int alt81=3;
            alt81 = dfa81.predict(input);
            switch (alt81) {
                case 1 :
                    // TinyHaxeTry1.g:490:4: varDecl interfaceBody
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_varDecl_in_interfaceBody3425);
                    varDecl387=varDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDecl387.getTree());
                    pushFollow(FOLLOW_interfaceBody_in_interfaceBody3427);
                    interfaceBody388=interfaceBody();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceBody388.getTree());

                    }
                    break;
                case 2 :
                    // TinyHaxeTry1.g:491:4: funcProtoDecl interfaceBody
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_funcProtoDecl_in_interfaceBody3432);
                    funcProtoDecl389=funcProtoDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, funcProtoDecl389.getTree());
                    pushFollow(FOLLOW_interfaceBody_in_interfaceBody3434);
                    interfaceBody390=interfaceBody();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceBody390.getTree());

                    }
                    break;
                case 3 :
                    // TinyHaxeTry1.g:494:2: 
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
            if ( state.backtracking>0 ) { memoize(input, 82, interfaceBody_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "interfaceBody"

    public static class inheritList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "inheritList"
    // TinyHaxeTry1.g:496:1: inheritList : inherit ( COMMA inherit )* ;
    public final TinyHaxeTry1Parser.inheritList_return inheritList() throws RecognitionException {
        TinyHaxeTry1Parser.inheritList_return retval = new TinyHaxeTry1Parser.inheritList_return();
        retval.start = input.LT(1);
        int inheritList_StartIndex = input.index();
        Object root_0 = null;

        Token COMMA392=null;
        TinyHaxeTry1Parser.inherit_return inherit391 = null;

        TinyHaxeTry1Parser.inherit_return inherit393 = null;


        Object COMMA392_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 83) ) { return retval; }
            // TinyHaxeTry1.g:497:2: ( inherit ( COMMA inherit )* )
            // TinyHaxeTry1.g:497:4: inherit ( COMMA inherit )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_inherit_in_inheritList3456);
            inherit391=inherit();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, inherit391.getTree());
            // TinyHaxeTry1.g:497:12: ( COMMA inherit )*
            loop82:
            do {
                int alt82=2;
                int LA82_0 = input.LA(1);

                if ( (LA82_0==COMMA) ) {
                    alt82=1;
                }


                switch (alt82) {
            	case 1 :
            	    // TinyHaxeTry1.g:497:13: COMMA inherit
            	    {
            	    COMMA392=(Token)match(input,COMMA,FOLLOW_COMMA_in_inheritList3459); if (state.failed) return retval;
            	    pushFollow(FOLLOW_inherit_in_inheritList3462);
            	    inherit393=inherit();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, inherit393.getTree());

            	    }
            	    break;

            	default :
            	    break loop82;
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
            if ( state.backtracking>0 ) { memoize(input, 83, inheritList_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "inheritList"

    public static class inheritListOpt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "inheritListOpt"
    // TinyHaxeTry1.g:500:1: inheritListOpt : ( inheritList -> ^( INHERIT_LIST_OPT[\"INHERIT_LIST_OPT\",true] ( inheritList )? ) | );
    public final TinyHaxeTry1Parser.inheritListOpt_return inheritListOpt() throws RecognitionException {
        TinyHaxeTry1Parser.inheritListOpt_return retval = new TinyHaxeTry1Parser.inheritListOpt_return();
        retval.start = input.LT(1);
        int inheritListOpt_StartIndex = input.index();
        Object root_0 = null;

        TinyHaxeTry1Parser.inheritList_return inheritList394 = null;


        RewriteRuleSubtreeStream stream_inheritList=new RewriteRuleSubtreeStream(adaptor,"rule inheritList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 84) ) { return retval; }
            // TinyHaxeTry1.g:501:2: ( inheritList -> ^( INHERIT_LIST_OPT[\"INHERIT_LIST_OPT\",true] ( inheritList )? ) | )
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( ((LA83_0>=EXTENDS && LA83_0<=IMPLEMENTS)) ) {
                alt83=1;
            }
            else if ( (LA83_0==LBRACE) ) {
                alt83=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 83, 0, input);

                throw nvae;
            }
            switch (alt83) {
                case 1 :
                    // TinyHaxeTry1.g:501:4: inheritList
                    {
                    pushFollow(FOLLOW_inheritList_in_inheritListOpt3480);
                    inheritList394=inheritList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_inheritList.add(inheritList394.getTree());


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
                    // 501:16: -> ^( INHERIT_LIST_OPT[\"INHERIT_LIST_OPT\",true] ( inheritList )? )
                    {
                        // TinyHaxeTry1.g:501:19: ^( INHERIT_LIST_OPT[\"INHERIT_LIST_OPT\",true] ( inheritList )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new ExtendedCommonTree(INHERIT_LIST_OPT, "INHERIT_LIST_OPT", true), root_1);

                        // TinyHaxeTry1.g:501:83: ( inheritList )?
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
                    // TinyHaxeTry1.g:503:6: 
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
            if ( state.backtracking>0 ) { memoize(input, 84, inheritListOpt_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "inheritListOpt"

    public static class inherit_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "inherit"
    // TinyHaxeTry1.g:505:1: inherit : ( EXTENDS type -> ^( EXTENDS ( type )? ) | IMPLEMENTS type -> ^( IMPLEMENTS ( type )? ) );
    public final TinyHaxeTry1Parser.inherit_return inherit() throws RecognitionException {
        TinyHaxeTry1Parser.inherit_return retval = new TinyHaxeTry1Parser.inherit_return();
        retval.start = input.LT(1);
        int inherit_StartIndex = input.index();
        Object root_0 = null;

        Token EXTENDS395=null;
        Token IMPLEMENTS397=null;
        TinyHaxeTry1Parser.type_return type396 = null;

        TinyHaxeTry1Parser.type_return type398 = null;


        Object EXTENDS395_tree=null;
        Object IMPLEMENTS397_tree=null;
        RewriteRuleTokenStream stream_IMPLEMENTS=new RewriteRuleTokenStream(adaptor,"token IMPLEMENTS");
        RewriteRuleTokenStream stream_EXTENDS=new RewriteRuleTokenStream(adaptor,"token EXTENDS");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 85) ) { return retval; }
            // TinyHaxeTry1.g:505:9: ( EXTENDS type -> ^( EXTENDS ( type )? ) | IMPLEMENTS type -> ^( IMPLEMENTS ( type )? ) )
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==EXTENDS) ) {
                alt84=1;
            }
            else if ( (LA84_0==IMPLEMENTS) ) {
                alt84=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 84, 0, input);

                throw nvae;
            }
            switch (alt84) {
                case 1 :
                    // TinyHaxeTry1.g:505:11: EXTENDS type
                    {
                    EXTENDS395=(Token)match(input,EXTENDS,FOLLOW_EXTENDS_in_inherit3516); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EXTENDS.add(EXTENDS395);

                    pushFollow(FOLLOW_type_in_inherit3518);
                    type396=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type396.getTree());


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
                    // 505:25: -> ^( EXTENDS ( type )? )
                    {
                        // TinyHaxeTry1.g:505:28: ^( EXTENDS ( type )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_EXTENDS.nextNode(), root_1);

                        // TinyHaxeTry1.g:505:38: ( type )?
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
                    // TinyHaxeTry1.g:506:11: IMPLEMENTS type
                    {
                    IMPLEMENTS397=(Token)match(input,IMPLEMENTS,FOLLOW_IMPLEMENTS_in_inherit3540); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IMPLEMENTS.add(IMPLEMENTS397);

                    pushFollow(FOLLOW_type_in_inherit3542);
                    type398=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type398.getTree());


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
                    // 506:27: -> ^( IMPLEMENTS ( type )? )
                    {
                        // TinyHaxeTry1.g:506:30: ^( IMPLEMENTS ( type )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_IMPLEMENTS.nextNode(), root_1);

                        // TinyHaxeTry1.g:506:43: ( type )?
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
            if ( state.backtracking>0 ) { memoize(input, 85, inherit_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "inherit"

    public static class typedefDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typedefDecl"
    // TinyHaxeTry1.g:509:1: typedefDecl : TYPEDEF IDENTIFIER EQ funcType ;
    public final TinyHaxeTry1Parser.typedefDecl_return typedefDecl() throws RecognitionException {
        TinyHaxeTry1Parser.typedefDecl_return retval = new TinyHaxeTry1Parser.typedefDecl_return();
        retval.start = input.LT(1);
        int typedefDecl_StartIndex = input.index();
        Object root_0 = null;

        Token TYPEDEF399=null;
        Token IDENTIFIER400=null;
        Token EQ401=null;
        TinyHaxeTry1Parser.funcType_return funcType402 = null;


        Object TYPEDEF399_tree=null;
        Object IDENTIFIER400_tree=null;
        Object EQ401_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 86) ) { return retval; }
            // TinyHaxeTry1.g:510:2: ( TYPEDEF IDENTIFIER EQ funcType )
            // TinyHaxeTry1.g:510:4: TYPEDEF IDENTIFIER EQ funcType
            {
            root_0 = (Object)adaptor.nil();

            TYPEDEF399=(Token)match(input,TYPEDEF,FOLLOW_TYPEDEF_in_typedefDecl3570); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TYPEDEF399_tree = (Object)adaptor.create(TYPEDEF399);
            adaptor.addChild(root_0, TYPEDEF399_tree);
            }
            IDENTIFIER400=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_typedefDecl3572); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER400_tree = (Object)adaptor.create(IDENTIFIER400);
            adaptor.addChild(root_0, IDENTIFIER400_tree);
            }
            EQ401=(Token)match(input,EQ,FOLLOW_EQ_in_typedefDecl3574); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            EQ401_tree = (Object)adaptor.create(EQ401);
            adaptor.addChild(root_0, EQ401_tree);
            }
            pushFollow(FOLLOW_funcType_in_typedefDecl3576);
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
            if ( state.backtracking>0 ) { memoize(input, 86, typedefDecl_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "typedefDecl"

    public static class typeExtend_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typeExtend"
    // TinyHaxeTry1.g:513:1: typeExtend : GT funcType COMMA ;
    public final TinyHaxeTry1Parser.typeExtend_return typeExtend() throws RecognitionException {
        TinyHaxeTry1Parser.typeExtend_return retval = new TinyHaxeTry1Parser.typeExtend_return();
        retval.start = input.LT(1);
        int typeExtend_StartIndex = input.index();
        Object root_0 = null;

        Token GT403=null;
        Token COMMA405=null;
        TinyHaxeTry1Parser.funcType_return funcType404 = null;


        Object GT403_tree=null;
        Object COMMA405_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 87) ) { return retval; }
            // TinyHaxeTry1.g:514:9: ( GT funcType COMMA )
            // TinyHaxeTry1.g:514:11: GT funcType COMMA
            {
            root_0 = (Object)adaptor.nil();

            GT403=(Token)match(input,GT,FOLLOW_GT_in_typeExtend3595); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            GT403_tree = (Object)adaptor.create(GT403);
            adaptor.addChild(root_0, GT403_tree);
            }
            pushFollow(FOLLOW_funcType_in_typeExtend3597);
            funcType404=funcType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, funcType404.getTree());
            COMMA405=(Token)match(input,COMMA,FOLLOW_COMMA_in_typeExtend3599); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 87, typeExtend_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "typeExtend"

    public static class anonType_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "anonType"
    // TinyHaxeTry1.g:517:1: anonType : LBRACE ( | anonTypeFieldList | varDeclList | typeExtend ( | anonTypeFieldList | varDeclList ) ) RBRACE ;
    public final TinyHaxeTry1Parser.anonType_return anonType() throws RecognitionException {
        TinyHaxeTry1Parser.anonType_return retval = new TinyHaxeTry1Parser.anonType_return();
        retval.start = input.LT(1);
        int anonType_StartIndex = input.index();
        Object root_0 = null;

        Token LBRACE406=null;
        Token RBRACE412=null;
        TinyHaxeTry1Parser.anonTypeFieldList_return anonTypeFieldList407 = null;

        TinyHaxeTry1Parser.varDeclList_return varDeclList408 = null;

        TinyHaxeTry1Parser.typeExtend_return typeExtend409 = null;

        TinyHaxeTry1Parser.anonTypeFieldList_return anonTypeFieldList410 = null;

        TinyHaxeTry1Parser.varDeclList_return varDeclList411 = null;


        Object LBRACE406_tree=null;
        Object RBRACE412_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 88) ) { return retval; }
            // TinyHaxeTry1.g:517:9: ( LBRACE ( | anonTypeFieldList | varDeclList | typeExtend ( | anonTypeFieldList | varDeclList ) ) RBRACE )
            // TinyHaxeTry1.g:517:11: LBRACE ( | anonTypeFieldList | varDeclList | typeExtend ( | anonTypeFieldList | varDeclList ) ) RBRACE
            {
            root_0 = (Object)adaptor.nil();

            LBRACE406=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_anonType3610); if (state.failed) return retval;
            // TinyHaxeTry1.g:518:4: ( | anonTypeFieldList | varDeclList | typeExtend ( | anonTypeFieldList | varDeclList ) )
            int alt86=4;
            switch ( input.LA(1) ) {
            case RBRACE:
                {
                alt86=1;
                }
                break;
            case IDENTIFIER:
                {
                alt86=2;
                }
                break;
            case PRIVATE:
            case PUBLIC:
            case STATIC:
            case INLINE:
            case DYNAMIC:
            case OVERRIDE:
            case VAR:
                {
                alt86=3;
                }
                break;
            case GT:
                {
                alt86=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 86, 0, input);

                throw nvae;
            }

            switch (alt86) {
                case 1 :
                    // TinyHaxeTry1.g:519:22: 
                    {
                    }
                    break;
                case 2 :
                    // TinyHaxeTry1.g:519:27: anonTypeFieldList
                    {
                    pushFollow(FOLLOW_anonTypeFieldList_in_anonType3645);
                    anonTypeFieldList407=anonTypeFieldList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, anonTypeFieldList407.getTree());

                    }
                    break;
                case 3 :
                    // TinyHaxeTry1.g:520:26: varDeclList
                    {
                    pushFollow(FOLLOW_varDeclList_in_anonType3673);
                    varDeclList408=varDeclList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclList408.getTree());

                    }
                    break;
                case 4 :
                    // TinyHaxeTry1.g:521:27: typeExtend ( | anonTypeFieldList | varDeclList )
                    {
                    pushFollow(FOLLOW_typeExtend_in_anonType3702);
                    typeExtend409=typeExtend();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeExtend409.getTree());
                    // TinyHaxeTry1.g:521:38: ( | anonTypeFieldList | varDeclList )
                    int alt85=3;
                    switch ( input.LA(1) ) {
                    case RBRACE:
                        {
                        alt85=1;
                        }
                        break;
                    case IDENTIFIER:
                        {
                        alt85=2;
                        }
                        break;
                    case PRIVATE:
                    case PUBLIC:
                    case STATIC:
                    case INLINE:
                    case DYNAMIC:
                    case OVERRIDE:
                    case VAR:
                        {
                        alt85=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 85, 0, input);

                        throw nvae;
                    }

                    switch (alt85) {
                        case 1 :
                            // TinyHaxeTry1.g:522:24: 
                            {
                            }
                            break;
                        case 2 :
                            // TinyHaxeTry1.g:522:25: anonTypeFieldList
                            {
                            pushFollow(FOLLOW_anonTypeFieldList_in_anonType3730);
                            anonTypeFieldList410=anonTypeFieldList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, anonTypeFieldList410.getTree());

                            }
                            break;
                        case 3 :
                            // TinyHaxeTry1.g:523:25: varDeclList
                            {
                            pushFollow(FOLLOW_varDeclList_in_anonType3756);
                            varDeclList411=varDeclList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclList411.getTree());

                            }
                            break;

                    }


                    }
                    break;

            }

            RBRACE412=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_anonType3800); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 88, anonType_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "anonType"

    public static class anonTypeFieldList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "anonTypeFieldList"
    // TinyHaxeTry1.g:528:1: anonTypeFieldList : anonTypeField ( COMMA anonTypeField )* ;
    public final TinyHaxeTry1Parser.anonTypeFieldList_return anonTypeFieldList() throws RecognitionException {
        TinyHaxeTry1Parser.anonTypeFieldList_return retval = new TinyHaxeTry1Parser.anonTypeFieldList_return();
        retval.start = input.LT(1);
        int anonTypeFieldList_StartIndex = input.index();
        Object root_0 = null;

        Token COMMA414=null;
        TinyHaxeTry1Parser.anonTypeField_return anonTypeField413 = null;

        TinyHaxeTry1Parser.anonTypeField_return anonTypeField415 = null;


        Object COMMA414_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 89) ) { return retval; }
            // TinyHaxeTry1.g:529:2: ( anonTypeField ( COMMA anonTypeField )* )
            // TinyHaxeTry1.g:529:4: anonTypeField ( COMMA anonTypeField )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_anonTypeField_in_anonTypeFieldList3814);
            anonTypeField413=anonTypeField();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, anonTypeField413.getTree());
            // TinyHaxeTry1.g:529:18: ( COMMA anonTypeField )*
            loop87:
            do {
                int alt87=2;
                int LA87_0 = input.LA(1);

                if ( (LA87_0==COMMA) ) {
                    alt87=1;
                }


                switch (alt87) {
            	case 1 :
            	    // TinyHaxeTry1.g:529:19: COMMA anonTypeField
            	    {
            	    COMMA414=(Token)match(input,COMMA,FOLLOW_COMMA_in_anonTypeFieldList3817); if (state.failed) return retval;
            	    pushFollow(FOLLOW_anonTypeField_in_anonTypeFieldList3820);
            	    anonTypeField415=anonTypeField();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, anonTypeField415.getTree());

            	    }
            	    break;

            	default :
            	    break loop87;
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
            if ( state.backtracking>0 ) { memoize(input, 89, anonTypeFieldList_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "anonTypeFieldList"

    public static class objLit_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "objLit"
    // TinyHaxeTry1.g:532:1: objLit : '{' objLitElemList '}' ;
    public final TinyHaxeTry1Parser.objLit_return objLit() throws RecognitionException {
        TinyHaxeTry1Parser.objLit_return retval = new TinyHaxeTry1Parser.objLit_return();
        retval.start = input.LT(1);
        int objLit_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal416=null;
        Token char_literal418=null;
        TinyHaxeTry1Parser.objLitElemList_return objLitElemList417 = null;


        Object char_literal416_tree=null;
        Object char_literal418_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 90) ) { return retval; }
            // TinyHaxeTry1.g:532:8: ( '{' objLitElemList '}' )
            // TinyHaxeTry1.g:532:10: '{' objLitElemList '}'
            {
            root_0 = (Object)adaptor.nil();

            char_literal416=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_objLit3832); if (state.failed) return retval;
            pushFollow(FOLLOW_objLitElemList_in_objLit3835);
            objLitElemList417=objLitElemList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, objLitElemList417.getTree());
            char_literal418=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_objLit3837); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 90, objLit_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "objLit"

    public static class anonTypeField_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "anonTypeField"
    // TinyHaxeTry1.g:535:1: anonTypeField : IDENTIFIER COLON funcType ;
    public final TinyHaxeTry1Parser.anonTypeField_return anonTypeField() throws RecognitionException {
        TinyHaxeTry1Parser.anonTypeField_return retval = new TinyHaxeTry1Parser.anonTypeField_return();
        retval.start = input.LT(1);
        int anonTypeField_StartIndex = input.index();
        Object root_0 = null;

        Token IDENTIFIER419=null;
        Token COLON420=null;
        TinyHaxeTry1Parser.funcType_return funcType421 = null;


        Object IDENTIFIER419_tree=null;
        Object COLON420_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 91) ) { return retval; }
            // TinyHaxeTry1.g:536:2: ( IDENTIFIER COLON funcType )
            // TinyHaxeTry1.g:536:4: IDENTIFIER COLON funcType
            {
            root_0 = (Object)adaptor.nil();

            IDENTIFIER419=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_anonTypeField3849); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER419_tree = (Object)adaptor.create(IDENTIFIER419);
            adaptor.addChild(root_0, IDENTIFIER419_tree);
            }
            COLON420=(Token)match(input,COLON,FOLLOW_COLON_in_anonTypeField3851); if (state.failed) return retval;
            pushFollow(FOLLOW_funcType_in_anonTypeField3854);
            funcType421=funcType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, funcType421.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 91, anonTypeField_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "anonTypeField"

    public static class objLitElemList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "objLitElemList"
    // TinyHaxeTry1.g:539:1: objLitElemList : objLitElem ( COMMA objLitElem )* ;
    public final TinyHaxeTry1Parser.objLitElemList_return objLitElemList() throws RecognitionException {
        TinyHaxeTry1Parser.objLitElemList_return retval = new TinyHaxeTry1Parser.objLitElemList_return();
        retval.start = input.LT(1);
        int objLitElemList_StartIndex = input.index();
        Object root_0 = null;

        Token COMMA423=null;
        TinyHaxeTry1Parser.objLitElem_return objLitElem422 = null;

        TinyHaxeTry1Parser.objLitElem_return objLitElem424 = null;


        Object COMMA423_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 92) ) { return retval; }
            // TinyHaxeTry1.g:540:2: ( objLitElem ( COMMA objLitElem )* )
            // TinyHaxeTry1.g:540:4: objLitElem ( COMMA objLitElem )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_objLitElem_in_objLitElemList3870);
            objLitElem422=objLitElem();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, objLitElem422.getTree());
            // TinyHaxeTry1.g:540:15: ( COMMA objLitElem )*
            loop88:
            do {
                int alt88=2;
                int LA88_0 = input.LA(1);

                if ( (LA88_0==COMMA) ) {
                    alt88=1;
                }


                switch (alt88) {
            	case 1 :
            	    // TinyHaxeTry1.g:540:16: COMMA objLitElem
            	    {
            	    COMMA423=(Token)match(input,COMMA,FOLLOW_COMMA_in_objLitElemList3873); if (state.failed) return retval;
            	    pushFollow(FOLLOW_objLitElem_in_objLitElemList3876);
            	    objLitElem424=objLitElem();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, objLitElem424.getTree());

            	    }
            	    break;

            	default :
            	    break loop88;
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
            if ( state.backtracking>0 ) { memoize(input, 92, objLitElemList_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "objLitElemList"

    public static class objLitElem_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "objLitElem"
    // TinyHaxeTry1.g:543:1: objLitElem : IDENTIFIER COLON expr ;
    public final TinyHaxeTry1Parser.objLitElem_return objLitElem() throws RecognitionException {
        TinyHaxeTry1Parser.objLitElem_return retval = new TinyHaxeTry1Parser.objLitElem_return();
        retval.start = input.LT(1);
        int objLitElem_StartIndex = input.index();
        Object root_0 = null;

        Token IDENTIFIER425=null;
        Token COLON426=null;
        TinyHaxeTry1Parser.expr_return expr427 = null;


        Object IDENTIFIER425_tree=null;
        Object COLON426_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 93) ) { return retval; }
            // TinyHaxeTry1.g:544:9: ( IDENTIFIER COLON expr )
            // TinyHaxeTry1.g:544:11: IDENTIFIER COLON expr
            {
            root_0 = (Object)adaptor.nil();

            IDENTIFIER425=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_objLitElem3897); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER425_tree = (Object)adaptor.create(IDENTIFIER425);
            adaptor.addChild(root_0, IDENTIFIER425_tree);
            }
            COLON426=(Token)match(input,COLON,FOLLOW_COLON_in_objLitElem3899); if (state.failed) return retval;
            pushFollow(FOLLOW_expr_in_objLitElem3902);
            expr427=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr427.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 93, objLitElem_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "objLitElem"

    public static class elementarySymbol_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "elementarySymbol"
    // TinyHaxeTry1.g:547:1: elementarySymbol : ( LONGLITERAL -> LONGLITERAL[$LONGLITERAL, \"INT\"] | INTLITERAL -> INTLITERAL[$INTLITERAL, \"INT\"] | STRINGLITERAL -> STRINGLITERAL[$STRINGLITERAL,\"STRING\"] | CHARLITERAL -> CHARLITERAL[$CHARLITERAL, \"STRING\"] | FLOATNUM -> FLOATNUM[$FLOATNUM, \"FLOAT\"] | TRUE -> TRUE[$TRUE,\"BOOL\"] | FALSE -> FALSE[$FALSE,\"BOOL\"] );
    public final TinyHaxeTry1Parser.elementarySymbol_return elementarySymbol() throws RecognitionException {
        TinyHaxeTry1Parser.elementarySymbol_return retval = new TinyHaxeTry1Parser.elementarySymbol_return();
        retval.start = input.LT(1);
        int elementarySymbol_StartIndex = input.index();
        Object root_0 = null;

        Token LONGLITERAL428=null;
        Token INTLITERAL429=null;
        Token STRINGLITERAL430=null;
        Token CHARLITERAL431=null;
        Token FLOATNUM432=null;
        Token TRUE433=null;
        Token FALSE434=null;

        Object LONGLITERAL428_tree=null;
        Object INTLITERAL429_tree=null;
        Object STRINGLITERAL430_tree=null;
        Object CHARLITERAL431_tree=null;
        Object FLOATNUM432_tree=null;
        Object TRUE433_tree=null;
        Object FALSE434_tree=null;
        RewriteRuleTokenStream stream_INTLITERAL=new RewriteRuleTokenStream(adaptor,"token INTLITERAL");
        RewriteRuleTokenStream stream_FALSE=new RewriteRuleTokenStream(adaptor,"token FALSE");
        RewriteRuleTokenStream stream_TRUE=new RewriteRuleTokenStream(adaptor,"token TRUE");
        RewriteRuleTokenStream stream_FLOATNUM=new RewriteRuleTokenStream(adaptor,"token FLOATNUM");
        RewriteRuleTokenStream stream_STRINGLITERAL=new RewriteRuleTokenStream(adaptor,"token STRINGLITERAL");
        RewriteRuleTokenStream stream_CHARLITERAL=new RewriteRuleTokenStream(adaptor,"token CHARLITERAL");
        RewriteRuleTokenStream stream_LONGLITERAL=new RewriteRuleTokenStream(adaptor,"token LONGLITERAL");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 94) ) { return retval; }
            // TinyHaxeTry1.g:548:2: ( LONGLITERAL -> LONGLITERAL[$LONGLITERAL, \"INT\"] | INTLITERAL -> INTLITERAL[$INTLITERAL, \"INT\"] | STRINGLITERAL -> STRINGLITERAL[$STRINGLITERAL,\"STRING\"] | CHARLITERAL -> CHARLITERAL[$CHARLITERAL, \"STRING\"] | FLOATNUM -> FLOATNUM[$FLOATNUM, \"FLOAT\"] | TRUE -> TRUE[$TRUE,\"BOOL\"] | FALSE -> FALSE[$FALSE,\"BOOL\"] )
            int alt89=7;
            switch ( input.LA(1) ) {
            case LONGLITERAL:
                {
                alt89=1;
                }
                break;
            case INTLITERAL:
                {
                alt89=2;
                }
                break;
            case STRINGLITERAL:
                {
                alt89=3;
                }
                break;
            case CHARLITERAL:
                {
                alt89=4;
                }
                break;
            case FLOATNUM:
                {
                alt89=5;
                }
                break;
            case TRUE:
                {
                alt89=6;
                }
                break;
            case FALSE:
                {
                alt89=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 89, 0, input);

                throw nvae;
            }

            switch (alt89) {
                case 1 :
                    // TinyHaxeTry1.g:548:4: LONGLITERAL
                    {
                    LONGLITERAL428=(Token)match(input,LONGLITERAL,FOLLOW_LONGLITERAL_in_elementarySymbol3914); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LONGLITERAL.add(LONGLITERAL428);



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
                    // 548:16: -> LONGLITERAL[$LONGLITERAL, \"INT\"]
                    {
                        adaptor.addChild(root_0, new VarUsage(LONGLITERAL, LONGLITERAL428, "INT"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // TinyHaxeTry1.g:549:4: INTLITERAL
                    {
                    INTLITERAL429=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_elementarySymbol3927); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INTLITERAL.add(INTLITERAL429);



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
                    // 549:15: -> INTLITERAL[$INTLITERAL, \"INT\"]
                    {
                        adaptor.addChild(root_0, new VarUsage(INTLITERAL, INTLITERAL429, "INT"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // TinyHaxeTry1.g:550:4: STRINGLITERAL
                    {
                    STRINGLITERAL430=(Token)match(input,STRINGLITERAL,FOLLOW_STRINGLITERAL_in_elementarySymbol3940); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STRINGLITERAL.add(STRINGLITERAL430);



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
                    // 550:18: -> STRINGLITERAL[$STRINGLITERAL,\"STRING\"]
                    {
                        adaptor.addChild(root_0, new VarUsage(STRINGLITERAL, STRINGLITERAL430, "STRING"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // TinyHaxeTry1.g:551:4: CHARLITERAL
                    {
                    CHARLITERAL431=(Token)match(input,CHARLITERAL,FOLLOW_CHARLITERAL_in_elementarySymbol3953); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CHARLITERAL.add(CHARLITERAL431);



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
                    // 551:16: -> CHARLITERAL[$CHARLITERAL, \"STRING\"]
                    {
                        adaptor.addChild(root_0, new VarUsage(CHARLITERAL, CHARLITERAL431, "STRING"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // TinyHaxeTry1.g:552:4: FLOATNUM
                    {
                    FLOATNUM432=(Token)match(input,FLOATNUM,FOLLOW_FLOATNUM_in_elementarySymbol3966); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FLOATNUM.add(FLOATNUM432);



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
                    // 552:13: -> FLOATNUM[$FLOATNUM, \"FLOAT\"]
                    {
                        adaptor.addChild(root_0, new VarUsage(FLOATNUM, FLOATNUM432, "FLOAT"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    // TinyHaxeTry1.g:553:4: TRUE
                    {
                    TRUE433=(Token)match(input,TRUE,FOLLOW_TRUE_in_elementarySymbol3979); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TRUE.add(TRUE433);



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
                    // 553:10: -> TRUE[$TRUE,\"BOOL\"]
                    {
                        adaptor.addChild(root_0, new VarUsage(TRUE, TRUE433, "BOOL"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 7 :
                    // TinyHaxeTry1.g:554:4: FALSE
                    {
                    FALSE434=(Token)match(input,FALSE,FOLLOW_FALSE_in_elementarySymbol3993); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FALSE.add(FALSE434);



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
                    // 554:11: -> FALSE[$FALSE,\"BOOL\"]
                    {
                        adaptor.addChild(root_0, new VarUsage(FALSE, FALSE434, "BOOL"));

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
            if ( state.backtracking>0 ) { memoize(input, 94, elementarySymbol_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "elementarySymbol"

    // $ANTLR start synpred26_TinyHaxeTry1
    public final void synpred26_TinyHaxeTry1_fragment() throws RecognitionException {   
        // TinyHaxeTry1.g:147:44: ( typeTagOpt )
        // TinyHaxeTry1.g:147:44: typeTagOpt
        {
        pushFollow(FOLLOW_typeTagOpt_in_synpred26_TinyHaxeTry1690);
        typeTagOpt();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred26_TinyHaxeTry1

    // $ANTLR start synpred28_TinyHaxeTry1
    public final void synpred28_TinyHaxeTry1_fragment() throws RecognitionException {   
        // TinyHaxeTry1.g:187:21: ( COMMA funcType )
        // TinyHaxeTry1.g:187:21: COMMA funcType
        {
        match(input,COMMA,FOLLOW_COMMA_in_synpred28_TinyHaxeTry1790); if (state.failed) return ;
        pushFollow(FOLLOW_funcType_in_synpred28_TinyHaxeTry1793);
        funcType();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred28_TinyHaxeTry1

    // $ANTLR start synpred29_TinyHaxeTry1
    public final void synpred29_TinyHaxeTry1_fragment() throws RecognitionException {   
        // TinyHaxeTry1.g:187:11: ( funcType ( COMMA funcType )* )
        // TinyHaxeTry1.g:187:11: funcType ( COMMA funcType )*
        {
        pushFollow(FOLLOW_funcType_in_synpred29_TinyHaxeTry1787);
        funcType();

        state._fsp--;
        if (state.failed) return ;
        // TinyHaxeTry1.g:187:20: ( COMMA funcType )*
        loop91:
        do {
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==COMMA) ) {
                alt91=1;
            }


            switch (alt91) {
        	case 1 :
        	    // TinyHaxeTry1.g:187:21: COMMA funcType
        	    {
        	    match(input,COMMA,FOLLOW_COMMA_in_synpred29_TinyHaxeTry1790); if (state.failed) return ;
        	    pushFollow(FOLLOW_funcType_in_synpred29_TinyHaxeTry1793);
        	    funcType();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop91;
            }
        } while (true);


        }
    }
    // $ANTLR end synpred29_TinyHaxeTry1

    // $ANTLR start synpred30_TinyHaxeTry1
    public final void synpred30_TinyHaxeTry1_fragment() throws RecognitionException {   
        // TinyHaxeTry1.g:188:20: ( COMMA typeConstraint )
        // TinyHaxeTry1.g:188:20: COMMA typeConstraint
        {
        match(input,COMMA,FOLLOW_COMMA_in_synpred30_TinyHaxeTry1804); if (state.failed) return ;
        pushFollow(FOLLOW_typeConstraint_in_synpred30_TinyHaxeTry1807);
        typeConstraint();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred30_TinyHaxeTry1

    // $ANTLR start synpred31_TinyHaxeTry1
    public final void synpred31_TinyHaxeTry1_fragment() throws RecognitionException {   
        // TinyHaxeTry1.g:191:19: ( MINUS_BIGGER type )
        // TinyHaxeTry1.g:191:19: MINUS_BIGGER type
        {
        match(input,MINUS_BIGGER,FOLLOW_MINUS_BIGGER_in_synpred31_TinyHaxeTry1826); if (state.failed) return ;
        pushFollow(FOLLOW_type_in_synpred31_TinyHaxeTry1829);
        type();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred31_TinyHaxeTry1

    // $ANTLR start synpred32_TinyHaxeTry1
    public final void synpred32_TinyHaxeTry1_fragment() throws RecognitionException {   
        // TinyHaxeTry1.g:191:11: ( ( type ) ( MINUS_BIGGER type )* )
        // TinyHaxeTry1.g:191:11: ( type ) ( MINUS_BIGGER type )*
        {
        // TinyHaxeTry1.g:191:11: ( type )
        // TinyHaxeTry1.g:191:12: type
        {
        pushFollow(FOLLOW_type_in_synpred32_TinyHaxeTry1822);
        type();

        state._fsp--;
        if (state.failed) return ;

        }

        // TinyHaxeTry1.g:191:18: ( MINUS_BIGGER type )*
        loop92:
        do {
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==MINUS_BIGGER) ) {
                alt92=1;
            }


            switch (alt92) {
        	case 1 :
        	    // TinyHaxeTry1.g:191:19: MINUS_BIGGER type
        	    {
        	    match(input,MINUS_BIGGER,FOLLOW_MINUS_BIGGER_in_synpred32_TinyHaxeTry1826); if (state.failed) return ;
        	    pushFollow(FOLLOW_type_in_synpred32_TinyHaxeTry1829);
        	    type();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop92;
            }
        } while (true);


        }
    }
    // $ANTLR end synpred32_TinyHaxeTry1

    // $ANTLR start synpred39_TinyHaxeTry1
    public final void synpred39_TinyHaxeTry1_fragment() throws RecognitionException {   
        // TinyHaxeTry1.g:199:48: ( typeParam )
        // TinyHaxeTry1.g:199:48: typeParam
        {
        pushFollow(FOLLOW_typeParam_in_synpred39_TinyHaxeTry1888);
        typeParam();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred39_TinyHaxeTry1

    // $ANTLR start synpred40_TinyHaxeTry1
    public final void synpred40_TinyHaxeTry1_fragment() throws RecognitionException {   
        // TinyHaxeTry1.g:199:8: ( ( anonType | dotIdent | primitiveType ) ( typeParam )* )
        // TinyHaxeTry1.g:199:8: ( anonType | dotIdent | primitiveType ) ( typeParam )*
        {
        // TinyHaxeTry1.g:199:8: ( anonType | dotIdent | primitiveType )
        int alt93=3;
        switch ( input.LA(1) ) {
        case LBRACE:
            {
            alt93=1;
            }
            break;
        case IDENTIFIER:
            {
            alt93=2;
            }
            break;
        case DYNAMIC:
        case VOID:
        case INT:
        case FLOAT:
        case BOOLEAN:
            {
            alt93=3;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 93, 0, input);

            throw nvae;
        }

        switch (alt93) {
            case 1 :
                // TinyHaxeTry1.g:199:9: anonType
                {
                pushFollow(FOLLOW_anonType_in_synpred40_TinyHaxeTry1875);
                anonType();

                state._fsp--;
                if (state.failed) return ;

                }
                break;
            case 2 :
                // TinyHaxeTry1.g:199:20: dotIdent
                {
                pushFollow(FOLLOW_dotIdent_in_synpred40_TinyHaxeTry1879);
                dotIdent();

                state._fsp--;
                if (state.failed) return ;

                }
                break;
            case 3 :
                // TinyHaxeTry1.g:199:31: primitiveType
                {
                pushFollow(FOLLOW_primitiveType_in_synpred40_TinyHaxeTry1883);
                primitiveType();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }

        // TinyHaxeTry1.g:199:47: ( typeParam )*
        loop94:
        do {
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==LT) ) {
                alt94=1;
            }


            switch (alt94) {
        	case 1 :
        	    // TinyHaxeTry1.g:199:48: typeParam
        	    {
        	    pushFollow(FOLLOW_typeParam_in_synpred40_TinyHaxeTry1888);
        	    typeParam();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop94;
            }
        } while (true);


        }
    }
    // $ANTLR end synpred40_TinyHaxeTry1

    // $ANTLR start synpred41_TinyHaxeTry1
    public final void synpred41_TinyHaxeTry1_fragment() throws RecognitionException {   
        // TinyHaxeTry1.g:204:9: ( type )
        // TinyHaxeTry1.g:204:9: type
        {
        pushFollow(FOLLOW_type_in_synpred41_TinyHaxeTry1910);
        type();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred41_TinyHaxeTry1

    // $ANTLR start synpred42_TinyHaxeTry1
    public final void synpred42_TinyHaxeTry1_fragment() throws RecognitionException {   
        // TinyHaxeTry1.g:204:25: ( GT )
        // TinyHaxeTry1.g:204:25: GT
        {
        match(input,GT,FOLLOW_GT_in_synpred42_TinyHaxeTry1916); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred42_TinyHaxeTry1

    // $ANTLR start synpred43_TinyHaxeTry1
    public final void synpred43_TinyHaxeTry1_fragment() throws RecognitionException {   
        // TinyHaxeTry1.g:204:29: ( GTGT )
        // TinyHaxeTry1.g:204:29: GTGT
        {
        match(input,GTGT,FOLLOW_GTGT_in_synpred43_TinyHaxeTry1919); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred43_TinyHaxeTry1

    // $ANTLR start synpred44_TinyHaxeTry1
    public final void synpred44_TinyHaxeTry1_fragment() throws RecognitionException {   
        // TinyHaxeTry1.g:209:4: ( typeParam )
        // TinyHaxeTry1.g:209:4: typeParam
        {
        pushFollow(FOLLOW_typeParam_in_synpred44_TinyHaxeTry1941);
        typeParam();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred44_TinyHaxeTry1

    // $ANTLR start synpred47_TinyHaxeTry1
    public final void synpred47_TinyHaxeTry1_fragment() throws RecognitionException {   
        // TinyHaxeTry1.g:223:4: ( block )
        // TinyHaxeTry1.g:223:4: block
        {
        pushFollow(FOLLOW_block_in_synpred47_TinyHaxeTry11075);
        block();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred47_TinyHaxeTry1

    // $ANTLR start synpred48_TinyHaxeTry1
    public final void synpred48_TinyHaxeTry1_fragment() throws RecognitionException {   
        // TinyHaxeTry1.g:224:4: ( IDENTIFIER COLON statement )
        // TinyHaxeTry1.g:224:4: IDENTIFIER COLON statement
        {
        match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_synpred48_TinyHaxeTry11080); if (state.failed) return ;
        match(input,COLON,FOLLOW_COLON_in_synpred48_TinyHaxeTry11082); if (state.failed) return ;
        pushFollow(FOLLOW_statement_in_synpred48_TinyHaxeTry11084);
        statement();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred48_TinyHaxeTry1

    // $ANTLR start synpred49_TinyHaxeTry1
    public final void synpred49_TinyHaxeTry1_fragment() throws RecognitionException {   
        // TinyHaxeTry1.g:225:4: ( ifStmt )
        // TinyHaxeTry1.g:225:4: ifStmt
        {
        pushFollow(FOLLOW_ifStmt_in_synpred49_TinyHaxeTry11105);
        ifStmt();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred49_TinyHaxeTry1

    // $ANTLR start synpred54_TinyHaxeTry1
    public final void synpred54_TinyHaxeTry1_fragment() throws RecognitionException {   
        // TinyHaxeTry1.g:230:4: ( switchStmt )
        // TinyHaxeTry1.g:230:4: switchStmt
        {
        pushFollow(FOLLOW_switchStmt_in_synpred54_TinyHaxeTry11239);
        switchStmt();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred54_TinyHaxeTry1

    // $ANTLR start synpred55_TinyHaxeTry1
    public final void synpred55_TinyHaxeTry1_fragment() throws RecognitionException {   
        // TinyHaxeTry1.g:231:12: ( expr )
        // TinyHaxeTry1.g:231:12: expr
        {
        pushFollow(FOLLOW_expr_in_synpred55_TinyHaxeTry11247);
        expr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred55_TinyHaxeTry1

    // $ANTLR start synpred62_TinyHaxeTry1
    public final void synpred62_TinyHaxeTry1_fragment() throws RecognitionException {   
        // TinyHaxeTry1.g:235:4: ( expr SEMI )
        // TinyHaxeTry1.g:235:4: expr SEMI
        {
        pushFollow(FOLLOW_expr_in_synpred62_TinyHaxeTry11344);
        expr();

        state._fsp--;
        if (state.failed) return ;
        match(input,SEMI,FOLLOW_SEMI_in_synpred62_TinyHaxeTry11346); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred62_TinyHaxeTry1

    // $ANTLR start synpred63_TinyHaxeTry1
    public final void synpred63_TinyHaxeTry1_fragment() throws RecognitionException {   
        // TinyHaxeTry1.g:243:4: ( assignExpr )
        // TinyHaxeTry1.g:243:4: assignExpr
        {
        pushFollow(FOLLOW_assignExpr_in_synpred63_TinyHaxeTry11367);
        assignExpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred63_TinyHaxeTry1

    // $ANTLR start synpred64_TinyHaxeTry1
    public final void synpred64_TinyHaxeTry1_fragment() throws RecognitionException {   
        // TinyHaxeTry1.g:244:4: ( block )
        // TinyHaxeTry1.g:244:4: block
        {
        pushFollow(FOLLOW_block_in_synpred64_TinyHaxeTry11373);
        block();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred64_TinyHaxeTry1

    // $ANTLR start synpred67_TinyHaxeTry1
    public final void synpred67_TinyHaxeTry1_fragment() throws RecognitionException {   
        TinyHaxeTry1Parser.expr_return st2 = null;


        // TinyHaxeTry1.g:254:31: ( ELSE st2= expr )
        // TinyHaxeTry1.g:254:31: ELSE st2= expr
        {
        match(input,ELSE,FOLLOW_ELSE_in_synpred67_TinyHaxeTry11443); if (state.failed) return ;
        pushFollow(FOLLOW_expr_in_synpred67_TinyHaxeTry11447);
        st2=expr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred67_TinyHaxeTry1

    // $ANTLR start synpred68_TinyHaxeTry1
    public final void synpred68_TinyHaxeTry1_fragment() throws RecognitionException {   
        TinyHaxeTry1Parser.statement_return st2 = null;


        // TinyHaxeTry1.g:258:36: ( ELSE st2= statement )
        // TinyHaxeTry1.g:258:36: ELSE st2= statement
        {
        match(input,ELSE,FOLLOW_ELSE_in_synpred68_TinyHaxeTry11492); if (state.failed) return ;
        pushFollow(FOLLOW_statement_in_synpred68_TinyHaxeTry11496);
        st2=statement();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred68_TinyHaxeTry1

    // $ANTLR start synpred69_TinyHaxeTry1
    public final void synpred69_TinyHaxeTry1_fragment() throws RecognitionException {   
        TinyHaxeTry1Parser.statement_return st1 = null;

        TinyHaxeTry1Parser.statement_return st2 = null;


        // TinyHaxeTry1.g:258:4: ( IF parExpression st1= statement ( ELSE st2= statement )? )
        // TinyHaxeTry1.g:258:4: IF parExpression st1= statement ( ELSE st2= statement )?
        {
        match(input,IF,FOLLOW_IF_in_synpred69_TinyHaxeTry11483); if (state.failed) return ;
        pushFollow(FOLLOW_parExpression_in_synpred69_TinyHaxeTry11485);
        parExpression();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_statement_in_synpred69_TinyHaxeTry11489);
        st1=statement();

        state._fsp--;
        if (state.failed) return ;
        // TinyHaxeTry1.g:258:35: ( ELSE st2= statement )?
        int alt98=2;
        int LA98_0 = input.LA(1);

        if ( (LA98_0==ELSE) ) {
            alt98=1;
        }
        switch (alt98) {
            case 1 :
                // TinyHaxeTry1.g:258:36: ELSE st2= statement
                {
                match(input,ELSE,FOLLOW_ELSE_in_synpred69_TinyHaxeTry11492); if (state.failed) return ;
                pushFollow(FOLLOW_statement_in_synpred69_TinyHaxeTry11496);
                st2=statement();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        }
    }
    // $ANTLR end synpred69_TinyHaxeTry1

    // $ANTLR start synpred70_TinyHaxeTry1
    public final void synpred70_TinyHaxeTry1_fragment() throws RecognitionException {   
        TinyHaxeTry1Parser.statement_return st2 = null;


        // TinyHaxeTry1.g:259:36: ( ELSE st2= statement )
        // TinyHaxeTry1.g:259:36: ELSE st2= statement
        {
        match(input,ELSE,FOLLOW_ELSE_in_synpred70_TinyHaxeTry11535); if (state.failed) return ;
        pushFollow(FOLLOW_statement_in_synpred70_TinyHaxeTry11539);
        st2=statement();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred70_TinyHaxeTry1

    // $ANTLR start synpred73_TinyHaxeTry1
    public final void synpred73_TinyHaxeTry1_fragment() throws RecognitionException {   
        // TinyHaxeTry1.g:271:4: ( varDecl )
        // TinyHaxeTry1.g:271:4: varDecl
        {
        pushFollow(FOLLOW_varDecl_in_synpred73_TinyHaxeTry11640);
        varDecl();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred73_TinyHaxeTry1

    // $ANTLR start synpred74_TinyHaxeTry1
    public final void synpred74_TinyHaxeTry1_fragment() throws RecognitionException {   
        // TinyHaxeTry1.g:272:4: ( classDecl )
        // TinyHaxeTry1.g:272:4: classDecl
        {
        pushFollow(FOLLOW_classDecl_in_synpred74_TinyHaxeTry11645);
        classDecl();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred74_TinyHaxeTry1

    // $ANTLR start synpred77_TinyHaxeTry1
    public final void synpred77_TinyHaxeTry1_fragment() throws RecognitionException {   
        // TinyHaxeTry1.g:305:4: ( exprList )
        // TinyHaxeTry1.g:305:4: exprList
        {
        pushFollow(FOLLOW_exprList_in_synpred77_TinyHaxeTry11847);
        exprList();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred77_TinyHaxeTry1

    // $ANTLR start synpred95_TinyHaxeTry1
    public final void synpred95_TinyHaxeTry1_fragment() throws RecognitionException {   
        // TinyHaxeTry1.g:346:32: ( ( GT GT ) addExpr )
        // TinyHaxeTry1.g:346:32: ( GT GT ) addExpr
        {
        // TinyHaxeTry1.g:346:32: ( GT GT )
        // TinyHaxeTry1.g:346:33: GT GT
        {
        match(input,GT,FOLLOW_GT_in_synpred95_TinyHaxeTry12123); if (state.failed) return ;
        match(input,GT,FOLLOW_GT_in_synpred95_TinyHaxeTry12125); if (state.failed) return ;

        }

        pushFollow(FOLLOW_addExpr_in_synpred95_TinyHaxeTry12130);
        addExpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred95_TinyHaxeTry1

    // $ANTLR start synpred106_TinyHaxeTry1
    public final void synpred106_TinyHaxeTry1_fragment() throws RecognitionException {   
        // TinyHaxeTry1.g:356:11: ( ( SUB | SUBSUB | PLUSPLUS | BANG | TILDE ) prefixExpr )
        // TinyHaxeTry1.g:356:11: ( SUB | SUBSUB | PLUSPLUS | BANG | TILDE ) prefixExpr
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

        pushFollow(FOLLOW_prefixExpr_in_synpred106_TinyHaxeTry12227);
        prefixExpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred106_TinyHaxeTry1

    // $ANTLR start synpred109_TinyHaxeTry1
    public final void synpred109_TinyHaxeTry1_fragment() throws RecognitionException {   
        // TinyHaxeTry1.g:364:4: ( value callOrSliceList )
        // TinyHaxeTry1.g:364:4: value callOrSliceList
        {
        pushFollow(FOLLOW_value_in_synpred109_TinyHaxeTry12283);
        value();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_callOrSliceList_in_synpred109_TinyHaxeTry12285);
        callOrSliceList();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred109_TinyHaxeTry1

    // $ANTLR start synpred110_TinyHaxeTry1
    public final void synpred110_TinyHaxeTry1_fragment() throws RecognitionException {   
        // TinyHaxeTry1.g:365:4: ( value PLUSPLUS )
        // TinyHaxeTry1.g:365:4: value PLUSPLUS
        {
        pushFollow(FOLLOW_value_in_synpred110_TinyHaxeTry12307);
        value();

        state._fsp--;
        if (state.failed) return ;
        match(input,PLUSPLUS,FOLLOW_PLUSPLUS_in_synpred110_TinyHaxeTry12309); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred110_TinyHaxeTry1

    // $ANTLR start synpred111_TinyHaxeTry1
    public final void synpred111_TinyHaxeTry1_fragment() throws RecognitionException {   
        // TinyHaxeTry1.g:366:4: ( value SUBSUB )
        // TinyHaxeTry1.g:366:4: value SUBSUB
        {
        pushFollow(FOLLOW_value_in_synpred111_TinyHaxeTry12332);
        value();

        state._fsp--;
        if (state.failed) return ;
        match(input,SUBSUB,FOLLOW_SUBSUB_in_synpred111_TinyHaxeTry12334); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred111_TinyHaxeTry1

    // $ANTLR start synpred115_TinyHaxeTry1
    public final void synpred115_TinyHaxeTry1_fragment() throws RecognitionException {   
        // TinyHaxeTry1.g:380:4: ( arrayLit )
        // TinyHaxeTry1.g:380:4: arrayLit
        {
        pushFollow(FOLLOW_arrayLit_in_synpred115_TinyHaxeTry12413);
        arrayLit();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred115_TinyHaxeTry1

    // $ANTLR start synpred119_TinyHaxeTry1
    public final void synpred119_TinyHaxeTry1_fragment() throws RecognitionException {   
        // TinyHaxeTry1.g:384:14: ( LPAREN expr RPAREN )
        // TinyHaxeTry1.g:384:14: LPAREN expr RPAREN
        {
        match(input,LPAREN,FOLLOW_LPAREN_in_synpred119_TinyHaxeTry12473); if (state.failed) return ;
        pushFollow(FOLLOW_expr_in_synpred119_TinyHaxeTry12476);
        expr();

        state._fsp--;
        if (state.failed) return ;
        match(input,RPAREN,FOLLOW_RPAREN_in_synpred119_TinyHaxeTry12478); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred119_TinyHaxeTry1

    // $ANTLR start synpred122_TinyHaxeTry1
    public final void synpred122_TinyHaxeTry1_fragment() throws RecognitionException {   
        // TinyHaxeTry1.g:393:11: ( CAST LPAREN expr ( COMMA funcType )? RPAREN )
        // TinyHaxeTry1.g:393:11: CAST LPAREN expr ( COMMA funcType )? RPAREN
        {
        match(input,CAST,FOLLOW_CAST_in_synpred122_TinyHaxeTry12564); if (state.failed) return ;
        match(input,LPAREN,FOLLOW_LPAREN_in_synpred122_TinyHaxeTry12566); if (state.failed) return ;
        pushFollow(FOLLOW_expr_in_synpred122_TinyHaxeTry12568);
        expr();

        state._fsp--;
        if (state.failed) return ;
        // TinyHaxeTry1.g:393:28: ( COMMA funcType )?
        int alt100=2;
        int LA100_0 = input.LA(1);

        if ( (LA100_0==COMMA) ) {
            alt100=1;
        }
        switch (alt100) {
            case 1 :
                // TinyHaxeTry1.g:393:29: COMMA funcType
                {
                match(input,COMMA,FOLLOW_COMMA_in_synpred122_TinyHaxeTry12571); if (state.failed) return ;
                pushFollow(FOLLOW_funcType_in_synpred122_TinyHaxeTry12573);
                funcType();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }

        match(input,RPAREN,FOLLOW_RPAREN_in_synpred122_TinyHaxeTry12577); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred122_TinyHaxeTry1

    // $ANTLR start synpred123_TinyHaxeTry1
    public final void synpred123_TinyHaxeTry1_fragment() throws RecognitionException {   
        // TinyHaxeTry1.g:400:4: ( classDecl )
        // TinyHaxeTry1.g:400:4: classDecl
        {
        pushFollow(FOLLOW_classDecl_in_synpred123_TinyHaxeTry12633);
        classDecl();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred123_TinyHaxeTry1

    // $ANTLR start synpred124_TinyHaxeTry1
    public final void synpred124_TinyHaxeTry1_fragment() throws RecognitionException {   
        // TinyHaxeTry1.g:401:4: ( interfaceDecl )
        // TinyHaxeTry1.g:401:4: interfaceDecl
        {
        pushFollow(FOLLOW_interfaceDecl_in_synpred124_TinyHaxeTry12638);
        interfaceDecl();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred124_TinyHaxeTry1

    // $ANTLR start synpred125_TinyHaxeTry1
    public final void synpred125_TinyHaxeTry1_fragment() throws RecognitionException {   
        // TinyHaxeTry1.g:402:11: ( enumDecl )
        // TinyHaxeTry1.g:402:11: enumDecl
        {
        pushFollow(FOLLOW_enumDecl_in_synpred125_TinyHaxeTry12650);
        enumDecl();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred125_TinyHaxeTry1

    // Delegated rules

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
    public final boolean synpred55_TinyHaxeTry1() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred55_TinyHaxeTry1_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
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
    public final boolean synpred70_TinyHaxeTry1() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred70_TinyHaxeTry1_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
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
    public final boolean synpred54_TinyHaxeTry1() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred54_TinyHaxeTry1_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred124_TinyHaxeTry1() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred124_TinyHaxeTry1_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred123_TinyHaxeTry1() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred123_TinyHaxeTry1_fragment(); // can never throw exception
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
    public final boolean synpred125_TinyHaxeTry1() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred125_TinyHaxeTry1_fragment(); // can never throw exception
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
    public final boolean synpred28_TinyHaxeTry1() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred28_TinyHaxeTry1_fragment(); // can never throw exception
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
    public final boolean synpred74_TinyHaxeTry1() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred74_TinyHaxeTry1_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred119_TinyHaxeTry1() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred119_TinyHaxeTry1_fragment(); // can never throw exception
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
    public final boolean synpred77_TinyHaxeTry1() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred77_TinyHaxeTry1_fragment(); // can never throw exception
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
    public final boolean synpred122_TinyHaxeTry1() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred122_TinyHaxeTry1_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred115_TinyHaxeTry1() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred115_TinyHaxeTry1_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred111_TinyHaxeTry1() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred111_TinyHaxeTry1_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA20 dfa20 = new DFA20(this);
    protected DFA19 dfa19 = new DFA19(this);
    protected DFA25 dfa25 = new DFA25(this);
    protected DFA26 dfa26 = new DFA26(this);
    protected DFA33 dfa33 = new DFA33(this);
    protected DFA34 dfa34 = new DFA34(this);
    protected DFA42 dfa42 = new DFA42(this);
    protected DFA62 dfa62 = new DFA62(this);
    protected DFA65 dfa65 = new DFA65(this);
    protected DFA77 dfa77 = new DFA77(this);
    protected DFA78 dfa78 = new DFA78(this);
    protected DFA80 dfa80 = new DFA80(this);
    protected DFA81 dfa81 = new DFA81(this);
    static final String DFA20_eotS =
        "\66\uffff";
    static final String DFA20_eofS =
        "\1\1\65\uffff";
    static final String DFA20_minS =
        "\1\20\1\uffff\1\0\63\uffff";
    static final String DFA20_maxS =
        "\1\143\1\uffff\1\0\63\uffff";
    static final String DFA20_acceptS =
        "\1\uffff\1\1\63\uffff\1\2";
    static final String DFA20_specialS =
        "\2\uffff\1\0\63\uffff}>";
    static final String[] DFA20_transitionS = {
            "\2\1\1\2\3\1\1\uffff\2\1\3\uffff\1\1\1\uffff\10\1\1\uffff\2"+
            "\1\1\uffff\11\1\2\uffff\1\1\10\uffff\2\1\1\uffff\1\1\4\uffff"+
            "\21\1\6\uffff\1\1\1\uffff\5\1",
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

    static final short[] DFA20_eot = DFA.unpackEncodedString(DFA20_eotS);
    static final short[] DFA20_eof = DFA.unpackEncodedString(DFA20_eofS);
    static final char[] DFA20_min = DFA.unpackEncodedStringToUnsignedChars(DFA20_minS);
    static final char[] DFA20_max = DFA.unpackEncodedStringToUnsignedChars(DFA20_maxS);
    static final short[] DFA20_accept = DFA.unpackEncodedString(DFA20_acceptS);
    static final short[] DFA20_special = DFA.unpackEncodedString(DFA20_specialS);
    static final short[][] DFA20_transition;

    static {
        int numStates = DFA20_transitionS.length;
        DFA20_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA20_transition[i] = DFA.unpackEncodedString(DFA20_transitionS[i]);
        }
    }

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = DFA20_eot;
            this.eof = DFA20_eof;
            this.min = DFA20_min;
            this.max = DFA20_max;
            this.accept = DFA20_accept;
            this.special = DFA20_special;
            this.transition = DFA20_transition;
        }
        public String getDescription() {
            return "187:1: typeList : ( funcType ( COMMA funcType )* | typeConstraint ( COMMA typeConstraint )* );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA20_2 = input.LA(1);

                         
                        int index20_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_TinyHaxeTry1()) ) {s = 1;}

                        else if ( (true) ) {s = 53;}

                         
                        input.seek(index20_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 20, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA19_eotS =
        "\63\uffff";
    static final String DFA19_eofS =
        "\1\1\62\uffff";
    static final String DFA19_minS =
        "\1\20\4\uffff\1\0\55\uffff";
    static final String DFA19_maxS =
        "\1\143\4\uffff\1\0\55\uffff";
    static final String DFA19_acceptS =
        "\1\uffff\1\2\60\uffff\1\1";
    static final String DFA19_specialS =
        "\5\uffff\1\0\55\uffff}>";
    static final String[] DFA19_transitionS = {
            "\2\1\1\uffff\3\1\1\uffff\2\1\5\uffff\1\5\7\1\1\uffff\2\1\1"+
            "\uffff\2\1\4\uffff\3\1\2\uffff\1\1\10\uffff\2\1\1\uffff\1\1"+
            "\4\uffff\21\1\6\uffff\1\1\1\uffff\5\1",
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
            ""
    };

    static final short[] DFA19_eot = DFA.unpackEncodedString(DFA19_eotS);
    static final short[] DFA19_eof = DFA.unpackEncodedString(DFA19_eofS);
    static final char[] DFA19_min = DFA.unpackEncodedStringToUnsignedChars(DFA19_minS);
    static final char[] DFA19_max = DFA.unpackEncodedStringToUnsignedChars(DFA19_maxS);
    static final short[] DFA19_accept = DFA.unpackEncodedString(DFA19_acceptS);
    static final short[] DFA19_special = DFA.unpackEncodedString(DFA19_specialS);
    static final short[][] DFA19_transition;

    static {
        int numStates = DFA19_transitionS.length;
        DFA19_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA19_transition[i] = DFA.unpackEncodedString(DFA19_transitionS[i]);
        }
    }

    class DFA19 extends DFA {

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
        public String getDescription() {
            return "()* loopback of 188:19: ( COMMA typeConstraint )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA19_5 = input.LA(1);

                         
                        int index19_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred30_TinyHaxeTry1()) ) {s = 50;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index19_5);
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
    static final String DFA25_eotS =
        "\64\uffff";
    static final String DFA25_eofS =
        "\1\4\63\uffff";
    static final String DFA25_minS =
        "\1\20\1\0\62\uffff";
    static final String DFA25_maxS =
        "\1\143\1\0\62\uffff";
    static final String DFA25_acceptS =
        "\2\uffff\1\1\1\uffff\1\2\57\uffff";
    static final String DFA25_specialS =
        "\1\uffff\1\0\62\uffff}>";
    static final String[] DFA25_transitionS = {
            "\2\4\1\2\3\4\1\uffff\2\4\3\uffff\1\2\1\uffff\10\4\1\uffff\2"+
            "\4\1\uffff\2\4\4\2\3\4\2\uffff\1\4\10\uffff\1\1\1\4\1\uffff"+
            "\1\4\4\uffff\21\4\6\uffff\1\4\1\uffff\5\4",
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
            ""
    };

    static final short[] DFA25_eot = DFA.unpackEncodedString(DFA25_eotS);
    static final short[] DFA25_eof = DFA.unpackEncodedString(DFA25_eofS);
    static final char[] DFA25_min = DFA.unpackEncodedStringToUnsignedChars(DFA25_minS);
    static final char[] DFA25_max = DFA.unpackEncodedStringToUnsignedChars(DFA25_maxS);
    static final short[] DFA25_accept = DFA.unpackEncodedString(DFA25_acceptS);
    static final short[] DFA25_special = DFA.unpackEncodedString(DFA25_specialS);
    static final short[][] DFA25_transition;

    static {
        int numStates = DFA25_transitionS.length;
        DFA25_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA25_transition[i] = DFA.unpackEncodedString(DFA25_transitionS[i]);
        }
    }

    class DFA25 extends DFA {

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
        public String getDescription() {
            return "199:1: type : ( ( anonType | dotIdent | primitiveType ) ( typeParam )* | );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA25_1 = input.LA(1);

                         
                        int index25_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred40_TinyHaxeTry1()) ) {s = 2;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index25_1);
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
    static final String DFA26_eotS =
        "\67\uffff";
    static final String DFA26_eofS =
        "\1\12\66\uffff";
    static final String DFA26_minS =
        "\1\20\64\0\2\uffff";
    static final String DFA26_maxS =
        "\1\143\64\0\2\uffff";
    static final String DFA26_acceptS =
        "\65\uffff\1\1\1\2";
    static final String DFA26_specialS =
        "\1\uffff\1\63\1\16\1\4\1\20\1\61\1\14\1\30\1\34\1\23\1\7\1\36\1"+
        "\53\1\40\1\55\1\17\1\26\1\3\1\60\1\13\1\11\1\41\1\27\1\35\1\62\1"+
        "\42\1\33\1\31\1\0\1\6\1\21\1\50\1\22\1\2\1\15\1\37\1\43\1\47\1\24"+
        "\1\25\1\1\1\5\1\12\1\54\1\57\1\45\1\52\1\32\1\51\1\46\1\56\1\44"+
        "\1\10\2\uffff}>";
    static final String[] DFA26_transitionS = {
            "\1\13\1\16\1\2\1\62\2\17\1\uffff\1\14\1\15\3\uffff\1\64\1\uffff"+
            "\1\10\1\51\1\7\1\53\1\54\1\55\1\56\1\57\1\uffff\1\25\1\11\1"+
            "\uffff\1\63\1\6\1\3\3\64\1\30\1\4\1\5\2\uffff\1\60\10\uffff"+
            "\1\1\1\24\1\uffff\1\61\4\uffff\1\52\1\50\1\47\1\43\1\44\1\45"+
            "\1\46\1\40\1\41\1\42\1\36\1\37\1\34\1\35\1\31\1\32\1\33\6\uffff"+
            "\1\22\1\uffff\1\20\1\21\1\26\1\27\1\23",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
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
            return "204:8: ( type | typeList )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA26_28 = input.LA(1);

                         
                        int index26_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_TinyHaxeTry1()) ) {s = 53;}

                        else if ( (true) ) {s = 54;}

                         
                        input.seek(index26_28);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA26_40 = input.LA(1);

                         
                        int index26_40 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_TinyHaxeTry1()) ) {s = 53;}

                        else if ( (true) ) {s = 54;}

                         
                        input.seek(index26_40);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA26_33 = input.LA(1);

                         
                        int index26_33 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_TinyHaxeTry1()) ) {s = 53;}

                        else if ( (true) ) {s = 54;}

                         
                        input.seek(index26_33);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA26_17 = input.LA(1);

                         
                        int index26_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_TinyHaxeTry1()) ) {s = 53;}

                        else if ( (true) ) {s = 54;}

                         
                        input.seek(index26_17);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA26_3 = input.LA(1);

                         
                        int index26_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_TinyHaxeTry1()) ) {s = 53;}

                        else if ( (true) ) {s = 54;}

                         
                        input.seek(index26_3);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA26_41 = input.LA(1);

                         
                        int index26_41 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_TinyHaxeTry1()) ) {s = 53;}

                        else if ( (true) ) {s = 54;}

                         
                        input.seek(index26_41);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA26_29 = input.LA(1);

                         
                        int index26_29 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_TinyHaxeTry1()) ) {s = 53;}

                        else if ( (true) ) {s = 54;}

                         
                        input.seek(index26_29);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA26_10 = input.LA(1);

                         
                        int index26_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_TinyHaxeTry1()) ) {s = 53;}

                        else if ( (true) ) {s = 54;}

                         
                        input.seek(index26_10);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA26_52 = input.LA(1);

                         
                        int index26_52 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_TinyHaxeTry1()) ) {s = 53;}

                        else if ( (true) ) {s = 54;}

                         
                        input.seek(index26_52);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA26_20 = input.LA(1);

                         
                        int index26_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_TinyHaxeTry1()) ) {s = 53;}

                        else if ( (true) ) {s = 54;}

                         
                        input.seek(index26_20);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA26_42 = input.LA(1);

                         
                        int index26_42 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_TinyHaxeTry1()) ) {s = 53;}

                        else if ( (true) ) {s = 54;}

                         
                        input.seek(index26_42);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA26_19 = input.LA(1);

                         
                        int index26_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_TinyHaxeTry1()) ) {s = 53;}

                        else if ( (true) ) {s = 54;}

                         
                        input.seek(index26_19);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA26_6 = input.LA(1);

                         
                        int index26_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_TinyHaxeTry1()) ) {s = 53;}

                        else if ( (true) ) {s = 54;}

                         
                        input.seek(index26_6);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA26_34 = input.LA(1);

                         
                        int index26_34 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_TinyHaxeTry1()) ) {s = 53;}

                        else if ( (true) ) {s = 54;}

                         
                        input.seek(index26_34);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA26_2 = input.LA(1);

                         
                        int index26_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_TinyHaxeTry1()) ) {s = 53;}

                        else if ( (true) ) {s = 54;}

                         
                        input.seek(index26_2);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA26_15 = input.LA(1);

                         
                        int index26_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_TinyHaxeTry1()) ) {s = 53;}

                        else if ( (true) ) {s = 54;}

                         
                        input.seek(index26_15);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA26_4 = input.LA(1);

                         
                        int index26_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_TinyHaxeTry1()) ) {s = 53;}

                        else if ( (true) ) {s = 54;}

                         
                        input.seek(index26_4);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA26_30 = input.LA(1);

                         
                        int index26_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_TinyHaxeTry1()) ) {s = 53;}

                        else if ( (true) ) {s = 54;}

                         
                        input.seek(index26_30);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA26_32 = input.LA(1);

                         
                        int index26_32 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_TinyHaxeTry1()) ) {s = 53;}

                        else if ( (true) ) {s = 54;}

                         
                        input.seek(index26_32);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA26_9 = input.LA(1);

                         
                        int index26_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_TinyHaxeTry1()) ) {s = 53;}

                        else if ( (true) ) {s = 54;}

                         
                        input.seek(index26_9);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA26_38 = input.LA(1);

                         
                        int index26_38 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_TinyHaxeTry1()) ) {s = 53;}

                        else if ( (true) ) {s = 54;}

                         
                        input.seek(index26_38);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA26_39 = input.LA(1);

                         
                        int index26_39 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_TinyHaxeTry1()) ) {s = 53;}

                        else if ( (true) ) {s = 54;}

                         
                        input.seek(index26_39);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA26_16 = input.LA(1);

                         
                        int index26_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_TinyHaxeTry1()) ) {s = 53;}

                        else if ( (true) ) {s = 54;}

                         
                        input.seek(index26_16);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA26_22 = input.LA(1);

                         
                        int index26_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_TinyHaxeTry1()) ) {s = 53;}

                        else if ( (true) ) {s = 54;}

                         
                        input.seek(index26_22);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA26_7 = input.LA(1);

                         
                        int index26_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_TinyHaxeTry1()) ) {s = 53;}

                        else if ( (true) ) {s = 54;}

                         
                        input.seek(index26_7);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA26_27 = input.LA(1);

                         
                        int index26_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_TinyHaxeTry1()) ) {s = 53;}

                        else if ( (true) ) {s = 54;}

                         
                        input.seek(index26_27);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA26_47 = input.LA(1);

                         
                        int index26_47 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_TinyHaxeTry1()) ) {s = 53;}

                        else if ( (true) ) {s = 54;}

                         
                        input.seek(index26_47);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA26_26 = input.LA(1);

                         
                        int index26_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_TinyHaxeTry1()) ) {s = 53;}

                        else if ( (true) ) {s = 54;}

                         
                        input.seek(index26_26);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA26_8 = input.LA(1);

                         
                        int index26_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_TinyHaxeTry1()) ) {s = 53;}

                        else if ( (true) ) {s = 54;}

                         
                        input.seek(index26_8);
                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA26_23 = input.LA(1);

                         
                        int index26_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_TinyHaxeTry1()) ) {s = 53;}

                        else if ( (true) ) {s = 54;}

                         
                        input.seek(index26_23);
                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA26_11 = input.LA(1);

                         
                        int index26_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_TinyHaxeTry1()) ) {s = 53;}

                        else if ( (true) ) {s = 54;}

                         
                        input.seek(index26_11);
                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA26_35 = input.LA(1);

                         
                        int index26_35 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_TinyHaxeTry1()) ) {s = 53;}

                        else if ( (true) ) {s = 54;}

                         
                        input.seek(index26_35);
                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA26_13 = input.LA(1);

                         
                        int index26_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_TinyHaxeTry1()) ) {s = 53;}

                        else if ( (true) ) {s = 54;}

                         
                        input.seek(index26_13);
                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA26_21 = input.LA(1);

                         
                        int index26_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_TinyHaxeTry1()) ) {s = 53;}

                        else if ( (true) ) {s = 54;}

                         
                        input.seek(index26_21);
                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA26_25 = input.LA(1);

                         
                        int index26_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_TinyHaxeTry1()) ) {s = 53;}

                        else if ( (true) ) {s = 54;}

                         
                        input.seek(index26_25);
                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA26_36 = input.LA(1);

                         
                        int index26_36 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_TinyHaxeTry1()) ) {s = 53;}

                        else if ( (true) ) {s = 54;}

                         
                        input.seek(index26_36);
                        if ( s>=0 ) return s;
                        break;
                    case 36 : 
                        int LA26_51 = input.LA(1);

                         
                        int index26_51 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_TinyHaxeTry1()) ) {s = 53;}

                        else if ( (true) ) {s = 54;}

                         
                        input.seek(index26_51);
                        if ( s>=0 ) return s;
                        break;
                    case 37 : 
                        int LA26_45 = input.LA(1);

                         
                        int index26_45 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_TinyHaxeTry1()) ) {s = 53;}

                        else if ( (true) ) {s = 54;}

                         
                        input.seek(index26_45);
                        if ( s>=0 ) return s;
                        break;
                    case 38 : 
                        int LA26_49 = input.LA(1);

                         
                        int index26_49 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_TinyHaxeTry1()) ) {s = 53;}

                        else if ( (true) ) {s = 54;}

                         
                        input.seek(index26_49);
                        if ( s>=0 ) return s;
                        break;
                    case 39 : 
                        int LA26_37 = input.LA(1);

                         
                        int index26_37 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_TinyHaxeTry1()) ) {s = 53;}

                        else if ( (true) ) {s = 54;}

                         
                        input.seek(index26_37);
                        if ( s>=0 ) return s;
                        break;
                    case 40 : 
                        int LA26_31 = input.LA(1);

                         
                        int index26_31 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_TinyHaxeTry1()) ) {s = 53;}

                        else if ( (true) ) {s = 54;}

                         
                        input.seek(index26_31);
                        if ( s>=0 ) return s;
                        break;
                    case 41 : 
                        int LA26_48 = input.LA(1);

                         
                        int index26_48 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_TinyHaxeTry1()) ) {s = 53;}

                        else if ( (true) ) {s = 54;}

                         
                        input.seek(index26_48);
                        if ( s>=0 ) return s;
                        break;
                    case 42 : 
                        int LA26_46 = input.LA(1);

                         
                        int index26_46 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_TinyHaxeTry1()) ) {s = 53;}

                        else if ( (true) ) {s = 54;}

                         
                        input.seek(index26_46);
                        if ( s>=0 ) return s;
                        break;
                    case 43 : 
                        int LA26_12 = input.LA(1);

                         
                        int index26_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_TinyHaxeTry1()) ) {s = 53;}

                        else if ( (true) ) {s = 54;}

                         
                        input.seek(index26_12);
                        if ( s>=0 ) return s;
                        break;
                    case 44 : 
                        int LA26_43 = input.LA(1);

                         
                        int index26_43 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_TinyHaxeTry1()) ) {s = 53;}

                        else if ( (true) ) {s = 54;}

                         
                        input.seek(index26_43);
                        if ( s>=0 ) return s;
                        break;
                    case 45 : 
                        int LA26_14 = input.LA(1);

                         
                        int index26_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_TinyHaxeTry1()) ) {s = 53;}

                        else if ( (true) ) {s = 54;}

                         
                        input.seek(index26_14);
                        if ( s>=0 ) return s;
                        break;
                    case 46 : 
                        int LA26_50 = input.LA(1);

                         
                        int index26_50 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_TinyHaxeTry1()) ) {s = 53;}

                        else if ( (true) ) {s = 54;}

                         
                        input.seek(index26_50);
                        if ( s>=0 ) return s;
                        break;
                    case 47 : 
                        int LA26_44 = input.LA(1);

                         
                        int index26_44 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_TinyHaxeTry1()) ) {s = 53;}

                        else if ( (true) ) {s = 54;}

                         
                        input.seek(index26_44);
                        if ( s>=0 ) return s;
                        break;
                    case 48 : 
                        int LA26_18 = input.LA(1);

                         
                        int index26_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_TinyHaxeTry1()) ) {s = 53;}

                        else if ( (true) ) {s = 54;}

                         
                        input.seek(index26_18);
                        if ( s>=0 ) return s;
                        break;
                    case 49 : 
                        int LA26_5 = input.LA(1);

                         
                        int index26_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_TinyHaxeTry1()) ) {s = 53;}

                        else if ( (true) ) {s = 54;}

                         
                        input.seek(index26_5);
                        if ( s>=0 ) return s;
                        break;
                    case 50 : 
                        int LA26_24 = input.LA(1);

                         
                        int index26_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_TinyHaxeTry1()) ) {s = 53;}

                        else if ( (true) ) {s = 54;}

                         
                        input.seek(index26_24);
                        if ( s>=0 ) return s;
                        break;
                    case 51 : 
                        int LA26_1 = input.LA(1);

                         
                        int index26_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_TinyHaxeTry1()) ) {s = 53;}

                        else if ( (true) ) {s = 54;}

                         
                        input.seek(index26_1);
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
    static final String DFA33_eotS =
        "\104\uffff";
    static final String DFA33_eofS =
        "\104\uffff";
    static final String DFA33_minS =
        "\1\20\6\uffff\4\0\4\uffff\1\0\64\uffff";
    static final String DFA33_maxS =
        "\1\152\6\uffff\4\0\4\uffff\1\0\64\uffff";
    static final String DFA33_acceptS =
        "\1\uffff\1\1\11\uffff\1\5\1\6\1\7\1\10\1\uffff\1\12\1\13\1\14\1"+
        "\15\1\16\52\uffff\1\2\1\17\1\3\1\4\1\11";
    static final String DFA33_specialS =
        "\7\uffff\1\0\1\1\1\2\1\3\4\uffff\1\4\64\uffff}>";
    static final String[] DFA33_transitionS = {
            "\1\10\1\uffff\1\11\2\uffff\1\1\3\uffff\5\1\1\uffff\11\24\1"+
            "\uffff\1\24\6\uffff\2\24\1\uffff\1\24\1\13\1\uffff\1\14\1\15"+
            "\1\16\1\20\1\21\1\22\1\23\1\17\1\7\1\uffff\1\12\4\uffff\30\24"+
            "\1\uffff\1\1\5\uffff\7\24",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
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
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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

    static final short[] DFA33_eot = DFA.unpackEncodedString(DFA33_eotS);
    static final short[] DFA33_eof = DFA.unpackEncodedString(DFA33_eofS);
    static final char[] DFA33_min = DFA.unpackEncodedStringToUnsignedChars(DFA33_minS);
    static final char[] DFA33_max = DFA.unpackEncodedStringToUnsignedChars(DFA33_maxS);
    static final short[] DFA33_accept = DFA.unpackEncodedString(DFA33_acceptS);
    static final short[] DFA33_special = DFA.unpackEncodedString(DFA33_specialS);
    static final short[][] DFA33_transition;

    static {
        int numStates = DFA33_transitionS.length;
        DFA33_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA33_transition[i] = DFA.unpackEncodedString(DFA33_transitionS[i]);
        }
    }

    class DFA33 extends DFA {

        public DFA33(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 33;
            this.eot = DFA33_eot;
            this.eof = DFA33_eof;
            this.min = DFA33_min;
            this.max = DFA33_max;
            this.accept = DFA33_accept;
            this.special = DFA33_special;
            this.transition = DFA33_transition;
        }
        public String getDescription() {
            return "221:1: statement : ( varDecl | block | IDENTIFIER COLON statement -> ^( COLON ( IDENTIFIER )? ( statement )? ) | ifStmt | FOR LPAREN exp1= expr IN exp2= expr RPAREN statement -> ^( FOR ^( IN $exp1 $exp2) ( statement )? ) | WHILE parExpression statement -> ^( WHILE ( parExpression )? ( statement )? ) | DO statement WHILE parExpression -> ^( DO ( parExpression )? ( statement )? ) | TRY block catchStmtList -> ^( TRY ( block )? ( catchStmtList )? ) | switchStmt | RETURN ( expr )? SEMI -> ^( RETURN ( expr )? ) | THROW expr SEMI -> ^( THROW ( expr )? ) | BREAK ( IDENTIFIER )? SEMI -> ^( BREAK ( IDENTIFIER )? ) | CONTINUE ( IDENTIFIER )? SEMI -> ^( CONTINUE ( IDENTIFIER )? ) | expr SEMI | SEMI );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA33_7 = input.LA(1);

                         
                        int index33_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred47_TinyHaxeTry1()) ) {s = 63;}

                        else if ( (synpred62_TinyHaxeTry1()) ) {s = 20;}

                         
                        input.seek(index33_7);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA33_8 = input.LA(1);

                         
                        int index33_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred47_TinyHaxeTry1()) ) {s = 63;}

                        else if ( (synpred62_TinyHaxeTry1()) ) {s = 20;}

                        else if ( (true) ) {s = 64;}

                         
                        input.seek(index33_8);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA33_9 = input.LA(1);

                         
                        int index33_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_TinyHaxeTry1()) ) {s = 65;}

                        else if ( (synpred62_TinyHaxeTry1()) ) {s = 20;}

                         
                        input.seek(index33_9);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA33_10 = input.LA(1);

                         
                        int index33_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred49_TinyHaxeTry1()) ) {s = 66;}

                        else if ( (synpred62_TinyHaxeTry1()) ) {s = 20;}

                         
                        input.seek(index33_10);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA33_15 = input.LA(1);

                         
                        int index33_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred54_TinyHaxeTry1()) ) {s = 67;}

                        else if ( (synpred62_TinyHaxeTry1()) ) {s = 20;}

                         
                        input.seek(index33_15);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 33, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA34_eotS =
        "\72\uffff";
    static final String DFA34_eofS =
        "\1\1\71\uffff";
    static final String DFA34_minS =
        "\1\20\5\uffff\1\0\50\uffff\1\0\12\uffff";
    static final String DFA34_maxS =
        "\1\152\5\uffff\1\0\50\uffff\1\0\12\uffff";
    static final String DFA34_acceptS =
        "\1\uffff\1\1\65\uffff\1\3\1\4\1\2";
    static final String DFA34_specialS =
        "\6\uffff\1\0\50\uffff\1\1\12\uffff}>";
    static final String[] DFA34_transitionS = {
            "\1\57\1\uffff\2\1\12\uffff\15\1\5\uffff\2\1\1\uffff\1\1\1\uffff"+
            "\1\1\7\uffff\1\67\1\6\1\1\1\70\1\1\3\uffff\30\1\7\uffff\7\1",
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
            return "242:1: expr : ( assignExpr | block | switchStmt | ifExpr );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA34_6 = input.LA(1);

                         
                        int index34_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred63_TinyHaxeTry1()) ) {s = 1;}

                        else if ( (synpred64_TinyHaxeTry1()) ) {s = 57;}

                         
                        input.seek(index34_6);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA34_47 = input.LA(1);

                         
                        int index34_47 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred63_TinyHaxeTry1()) ) {s = 1;}

                        else if ( (synpred64_TinyHaxeTry1()) ) {s = 57;}

                         
                        input.seek(index34_47);
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
    static final String DFA42_eotS =
        "\104\uffff";
    static final String DFA42_eofS =
        "\104\uffff";
    static final String DFA42_minS =
        "\1\20\6\0\1\uffff\1\0\73\uffff";
    static final String DFA42_maxS =
        "\1\152\6\0\1\uffff\1\0\73\uffff";
    static final String DFA42_acceptS =
        "\7\uffff\1\2\3\uffff\1\3\67\uffff\1\1";
    static final String DFA42_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\uffff\1\6\73\uffff}>";
    static final String[] DFA42_transitionS = {
            "\1\13\1\7\1\13\1\uffff\1\7\1\5\3\uffff\1\10\1\1\1\2\1\3\1\4"+
            "\1\uffff\11\13\1\uffff\1\13\6\uffff\2\13\1\uffff\2\13\1\uffff"+
            "\11\13\1\uffff\1\13\4\uffff\30\13\1\uffff\1\6\1\7\4\uffff\7"+
            "\13",
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
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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

    static final short[] DFA42_eot = DFA.unpackEncodedString(DFA42_eotS);
    static final short[] DFA42_eof = DFA.unpackEncodedString(DFA42_eofS);
    static final char[] DFA42_min = DFA.unpackEncodedStringToUnsignedChars(DFA42_minS);
    static final char[] DFA42_max = DFA.unpackEncodedStringToUnsignedChars(DFA42_maxS);
    static final short[] DFA42_accept = DFA.unpackEncodedString(DFA42_acceptS);
    static final short[] DFA42_special = DFA.unpackEncodedString(DFA42_specialS);
    static final short[][] DFA42_transition;

    static {
        int numStates = DFA42_transitionS.length;
        DFA42_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA42_transition[i] = DFA.unpackEncodedString(DFA42_transitionS[i]);
        }
    }

    class DFA42 extends DFA {

        public DFA42(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 42;
            this.eot = DFA42_eot;
            this.eof = DFA42_eof;
            this.min = DFA42_min;
            this.max = DFA42_max;
            this.accept = DFA42_accept;
            this.special = DFA42_special;
            this.transition = DFA42_transition;
        }
        public String getDescription() {
            return "270:1: blockStmt : ( varDecl | classDecl | statement );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA42_1 = input.LA(1);

                         
                        int index42_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred73_TinyHaxeTry1()) ) {s = 67;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index42_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA42_2 = input.LA(1);

                         
                        int index42_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred73_TinyHaxeTry1()) ) {s = 67;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index42_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA42_3 = input.LA(1);

                         
                        int index42_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred73_TinyHaxeTry1()) ) {s = 67;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index42_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA42_4 = input.LA(1);

                         
                        int index42_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred73_TinyHaxeTry1()) ) {s = 67;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index42_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA42_5 = input.LA(1);

                         
                        int index42_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred73_TinyHaxeTry1()) ) {s = 67;}

                        else if ( (synpred74_TinyHaxeTry1()) ) {s = 7;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index42_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA42_6 = input.LA(1);

                         
                        int index42_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred73_TinyHaxeTry1()) ) {s = 67;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index42_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA42_8 = input.LA(1);

                         
                        int index42_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred73_TinyHaxeTry1()) ) {s = 67;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index42_8);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 42, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA62_eotS =
        "\64\uffff";
    static final String DFA62_eofS =
        "\1\20\63\uffff";
    static final String DFA62_minS =
        "\1\20\15\0\46\uffff";
    static final String DFA62_maxS =
        "\1\152\15\0\46\uffff";
    static final String DFA62_acceptS =
        "\16\uffff\1\2\1\3\1\4\42\uffff\1\1";
    static final String DFA62_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"+
        "\14\46\uffff}>";
    static final String[] DFA62_transitionS = {
            "\1\20\1\uffff\1\15\1\20\12\uffff\10\20\1\1\1\14\1\20\1\2\1"+
            "\20\5\uffff\2\20\3\uffff\1\20\10\uffff\1\3\1\20\1\uffff\1\20"+
            "\4\uffff\21\20\1\17\1\16\2\uffff\1\4\10\uffff\1\5\1\6\1\7\1"+
            "\10\1\11\1\12\1\13",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
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
            return "363:1: suffixExpr : ( value callOrSliceList -> ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] ( value )? ( callOrSliceList )? ) | value PLUSPLUS -> ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] ( value )? ( PLUSPLUS )? ) | value SUBSUB -> ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] ( value )? ( SUBSUB )? ) | value typeParamOpt );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA62_1 = input.LA(1);

                         
                        int index62_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred109_TinyHaxeTry1()) ) {s = 51;}

                        else if ( (synpred110_TinyHaxeTry1()) ) {s = 14;}

                        else if ( (synpred111_TinyHaxeTry1()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index62_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA62_2 = input.LA(1);

                         
                        int index62_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred109_TinyHaxeTry1()) ) {s = 51;}

                        else if ( (synpred110_TinyHaxeTry1()) ) {s = 14;}

                        else if ( (synpred111_TinyHaxeTry1()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index62_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA62_3 = input.LA(1);

                         
                        int index62_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred109_TinyHaxeTry1()) ) {s = 51;}

                        else if ( (synpred110_TinyHaxeTry1()) ) {s = 14;}

                        else if ( (synpred111_TinyHaxeTry1()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index62_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA62_4 = input.LA(1);

                         
                        int index62_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred109_TinyHaxeTry1()) ) {s = 51;}

                        else if ( (synpred110_TinyHaxeTry1()) ) {s = 14;}

                        else if ( (synpred111_TinyHaxeTry1()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index62_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA62_5 = input.LA(1);

                         
                        int index62_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred109_TinyHaxeTry1()) ) {s = 51;}

                        else if ( (synpred110_TinyHaxeTry1()) ) {s = 14;}

                        else if ( (synpred111_TinyHaxeTry1()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index62_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA62_6 = input.LA(1);

                         
                        int index62_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred109_TinyHaxeTry1()) ) {s = 51;}

                        else if ( (synpred110_TinyHaxeTry1()) ) {s = 14;}

                        else if ( (synpred111_TinyHaxeTry1()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index62_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA62_7 = input.LA(1);

                         
                        int index62_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred109_TinyHaxeTry1()) ) {s = 51;}

                        else if ( (synpred110_TinyHaxeTry1()) ) {s = 14;}

                        else if ( (synpred111_TinyHaxeTry1()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index62_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA62_8 = input.LA(1);

                         
                        int index62_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred109_TinyHaxeTry1()) ) {s = 51;}

                        else if ( (synpred110_TinyHaxeTry1()) ) {s = 14;}

                        else if ( (synpred111_TinyHaxeTry1()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index62_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA62_9 = input.LA(1);

                         
                        int index62_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred109_TinyHaxeTry1()) ) {s = 51;}

                        else if ( (synpred110_TinyHaxeTry1()) ) {s = 14;}

                        else if ( (synpred111_TinyHaxeTry1()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index62_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA62_10 = input.LA(1);

                         
                        int index62_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred109_TinyHaxeTry1()) ) {s = 51;}

                        else if ( (synpred110_TinyHaxeTry1()) ) {s = 14;}

                        else if ( (synpred111_TinyHaxeTry1()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index62_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA62_11 = input.LA(1);

                         
                        int index62_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred109_TinyHaxeTry1()) ) {s = 51;}

                        else if ( (synpred110_TinyHaxeTry1()) ) {s = 14;}

                        else if ( (synpred111_TinyHaxeTry1()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index62_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA62_12 = input.LA(1);

                         
                        int index62_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred109_TinyHaxeTry1()) ) {s = 51;}

                        else if ( (synpred110_TinyHaxeTry1()) ) {s = 14;}

                        else if ( (synpred111_TinyHaxeTry1()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index62_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA62_13 = input.LA(1);

                         
                        int index62_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred109_TinyHaxeTry1()) ) {s = 51;}

                        else if ( (synpred110_TinyHaxeTry1()) ) {s = 14;}

                        else if ( (synpred111_TinyHaxeTry1()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index62_13);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 62, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA65_eotS =
        "\65\uffff";
    static final String DFA65_eofS =
        "\1\16\64\uffff";
    static final String DFA65_minS =
        "\1\20\1\uffff\1\0\11\uffff\1\0\50\uffff";
    static final String DFA65_maxS =
        "\1\152\1\uffff\1\0\11\uffff\1\0\50\uffff";
    static final String DFA65_acceptS =
        "\1\uffff\1\1\1\uffff\1\3\1\4\1\5\7\uffff\1\7\1\10\44\uffff\1\2"+
        "\1\6";
    static final String DFA65_specialS =
        "\2\uffff\1\0\11\uffff\1\1\50\uffff}>";
    static final String[] DFA65_transitionS = {
            "\1\16\1\uffff\1\15\1\16\12\uffff\10\16\1\1\1\14\1\16\1\2\1"+
            "\16\5\uffff\2\16\3\uffff\1\16\10\uffff\1\3\1\16\1\uffff\1\16"+
            "\4\uffff\23\16\2\uffff\1\4\10\uffff\7\5",
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
            return "379:1: value : ( funcLit | arrayLit | objLit | NULL | elementarySymbol | LPAREN expr RPAREN | dotIdent | );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA65_2 = input.LA(1);

                         
                        int index65_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred115_TinyHaxeTry1()) ) {s = 51;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index65_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA65_12 = input.LA(1);

                         
                        int index65_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred119_TinyHaxeTry1()) ) {s = 52;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index65_12);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 65, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA77_eotS =
        "\11\uffff";
    static final String DFA77_eofS =
        "\11\uffff";
    static final String DFA77_minS =
        "\6\25\1\22\2\uffff";
    static final String DFA77_maxS =
        "\6\46\1\63\2\uffff";
    static final String DFA77_acceptS =
        "\7\uffff\1\1\1\2";
    static final String DFA77_specialS =
        "\11\uffff}>";
    static final String[] DFA77_transitionS = {
            "\1\5\3\uffff\1\5\1\1\1\2\1\3\1\4\10\uffff\1\6",
            "\1\5\3\uffff\1\5\1\1\1\2\1\3\1\4\10\uffff\1\6",
            "\1\5\3\uffff\1\5\1\1\1\2\1\3\1\4\10\uffff\1\6",
            "\1\5\3\uffff\1\5\1\1\1\2\1\3\1\4\10\uffff\1\6",
            "\1\5\3\uffff\1\5\1\1\1\2\1\3\1\4\10\uffff\1\6",
            "\1\5\3\uffff\1\5\1\1\1\2\1\3\1\4\10\uffff\1\6",
            "\1\10\40\uffff\1\7",
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
            return "452:1: funcDecl : ( ( declAttrList )? FUNCTION NEW LPAREN paramList RPAREN typeTagOpt block -> ^( FUNCTION NEW ( declAttrList )? ( paramList )? ( typeTagOpt )? ( block )? ) | ( declAttrList )? FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt block -> ^( FUNCTION IDENTIFIER ( declAttrList )? ( paramList )? ( typeTagOpt )? ( block )? ( typeParamOpt )? ) );";
        }
    }
    static final String DFA78_eotS =
        "\14\uffff";
    static final String DFA78_eofS =
        "\14\uffff";
    static final String DFA78_minS =
        "\6\25\2\22\4\uffff";
    static final String DFA78_maxS =
        "\6\46\2\63\4\uffff";
    static final String DFA78_acceptS =
        "\10\uffff\1\3\1\4\1\1\1\2";
    static final String DFA78_specialS =
        "\14\uffff}>";
    static final String[] DFA78_transitionS = {
            "\1\5\3\uffff\1\5\1\1\1\2\1\3\1\4\10\uffff\1\6",
            "\1\5\3\uffff\1\5\1\1\1\2\1\3\1\4\10\uffff\1\7",
            "\1\5\3\uffff\1\5\1\1\1\2\1\3\1\4\10\uffff\1\7",
            "\1\5\3\uffff\1\5\1\1\1\2\1\3\1\4\10\uffff\1\7",
            "\1\5\3\uffff\1\5\1\1\1\2\1\3\1\4\10\uffff\1\7",
            "\1\5\3\uffff\1\5\1\1\1\2\1\3\1\4\10\uffff\1\7",
            "\1\11\40\uffff\1\10",
            "\1\13\40\uffff\1\12",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA78_eot = DFA.unpackEncodedString(DFA78_eotS);
    static final short[] DFA78_eof = DFA.unpackEncodedString(DFA78_eofS);
    static final char[] DFA78_min = DFA.unpackEncodedStringToUnsignedChars(DFA78_minS);
    static final char[] DFA78_max = DFA.unpackEncodedStringToUnsignedChars(DFA78_maxS);
    static final short[] DFA78_accept = DFA.unpackEncodedString(DFA78_acceptS);
    static final short[] DFA78_special = DFA.unpackEncodedString(DFA78_specialS);
    static final short[][] DFA78_transition;

    static {
        int numStates = DFA78_transitionS.length;
        DFA78_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA78_transition[i] = DFA.unpackEncodedString(DFA78_transitionS[i]);
        }
    }

    class DFA78 extends DFA {

        public DFA78(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 78;
            this.eot = DFA78_eot;
            this.eof = DFA78_eof;
            this.min = DFA78_min;
            this.max = DFA78_max;
            this.accept = DFA78_accept;
            this.special = DFA78_special;
            this.transition = DFA78_transition;
        }
        public String getDescription() {
            return "458:1: funcProtoDecl : ( declAttrList FUNCTION NEW LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTagOpt )? ( declAttrList )? ) | declAttrList FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTagOpt )? ( declAttrList )? ( typeParamOpt )? ) | FUNCTION NEW LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTagOpt )? ) | FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTagOpt )? ( typeParamOpt )? ) );";
        }
    }
    static final String DFA80_eotS =
        "\12\uffff";
    static final String DFA80_eofS =
        "\12\uffff";
    static final String DFA80_minS =
        "\1\21\4\25\1\24\3\uffff\1\25";
    static final String DFA80_maxS =
        "\6\136\3\uffff\1\136";
    static final String DFA80_acceptS =
        "\6\uffff\1\1\1\2\1\3\1\uffff";
    static final String DFA80_specialS =
        "\12\uffff}>";
    static final String[] DFA80_transitionS = {
            "\1\10\2\uffff\1\10\1\5\3\uffff\1\11\1\1\1\2\1\3\1\4\10\uffff"+
            "\1\7\66\uffff\1\10\1\6",
            "\1\11\3\uffff\1\11\1\1\1\2\1\3\1\4\10\uffff\1\7\67\uffff\1"+
            "\6",
            "\1\11\3\uffff\1\11\1\1\1\2\1\3\1\4\10\uffff\1\7\67\uffff\1"+
            "\6",
            "\1\11\3\uffff\1\11\1\1\1\2\1\3\1\4\10\uffff\1\7\67\uffff\1"+
            "\6",
            "\1\11\3\uffff\1\11\1\1\1\2\1\3\1\4\10\uffff\1\7\67\uffff\1"+
            "\6",
            "\1\10\1\5\3\uffff\1\11\1\1\1\2\1\3\1\4\10\uffff\1\7\66\uffff"+
            "\1\10\1\6",
            "",
            "",
            "",
            "\1\11\3\uffff\1\11\1\1\1\2\1\3\1\4\10\uffff\1\7\67\uffff\1"+
            "\6"
    };

    static final short[] DFA80_eot = DFA.unpackEncodedString(DFA80_eotS);
    static final short[] DFA80_eof = DFA.unpackEncodedString(DFA80_eofS);
    static final char[] DFA80_min = DFA.unpackEncodedStringToUnsignedChars(DFA80_minS);
    static final char[] DFA80_max = DFA.unpackEncodedStringToUnsignedChars(DFA80_maxS);
    static final short[] DFA80_accept = DFA.unpackEncodedString(DFA80_acceptS);
    static final short[] DFA80_special = DFA.unpackEncodedString(DFA80_specialS);
    static final short[][] DFA80_transition;

    static {
        int numStates = DFA80_transitionS.length;
        DFA80_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA80_transition[i] = DFA.unpackEncodedString(DFA80_transitionS[i]);
        }
    }

    class DFA80 extends DFA {

        public DFA80(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 80;
            this.eot = DFA80_eot;
            this.eof = DFA80_eof;
            this.min = DFA80_min;
            this.max = DFA80_max;
            this.accept = DFA80_accept;
            this.special = DFA80_special;
            this.transition = DFA80_transition;
        }
        public String getDescription() {
            return "478:1: classMember : ( varDecl | funcDecl | enumDecl );";
        }
    }
    static final String DFA81_eotS =
        "\11\uffff";
    static final String DFA81_eofS =
        "\1\10\10\uffff";
    static final String DFA81_minS =
        "\6\25\3\uffff";
    static final String DFA81_maxS =
        "\6\136\3\uffff";
    static final String DFA81_acceptS =
        "\6\uffff\1\1\1\2\1\3";
    static final String DFA81_specialS =
        "\11\uffff}>";
    static final String[] DFA81_transitionS = {
            "\1\5\3\uffff\1\5\1\1\1\2\1\3\1\4\10\uffff\1\7\30\uffff\1\10"+
            "\36\uffff\1\6",
            "\1\5\3\uffff\1\5\1\1\1\2\1\3\1\4\10\uffff\1\7\67\uffff\1\6",
            "\1\5\3\uffff\1\5\1\1\1\2\1\3\1\4\10\uffff\1\7\67\uffff\1\6",
            "\1\5\3\uffff\1\5\1\1\1\2\1\3\1\4\10\uffff\1\7\67\uffff\1\6",
            "\1\5\3\uffff\1\5\1\1\1\2\1\3\1\4\10\uffff\1\7\67\uffff\1\6",
            "\1\5\3\uffff\1\5\1\1\1\2\1\3\1\4\10\uffff\1\7\67\uffff\1\6",
            "",
            "",
            ""
    };

    static final short[] DFA81_eot = DFA.unpackEncodedString(DFA81_eotS);
    static final short[] DFA81_eof = DFA.unpackEncodedString(DFA81_eofS);
    static final char[] DFA81_min = DFA.unpackEncodedStringToUnsignedChars(DFA81_minS);
    static final char[] DFA81_max = DFA.unpackEncodedStringToUnsignedChars(DFA81_maxS);
    static final short[] DFA81_accept = DFA.unpackEncodedString(DFA81_acceptS);
    static final short[] DFA81_special = DFA.unpackEncodedString(DFA81_specialS);
    static final short[][] DFA81_transition;

    static {
        int numStates = DFA81_transitionS.length;
        DFA81_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA81_transition[i] = DFA.unpackEncodedString(DFA81_transitionS[i]);
        }
    }

    class DFA81 extends DFA {

        public DFA81(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 81;
            this.eot = DFA81_eot;
            this.eof = DFA81_eof;
            this.min = DFA81_min;
            this.max = DFA81_max;
            this.accept = DFA81_accept;
            this.special = DFA81_special;
            this.transition = DFA81_transition;
        }
        public String getDescription() {
            return "489:1: interfaceBody : ( varDecl interfaceBody | funcProtoDecl interfaceBody | );";
        }
    }
 

    public static final BitSet FOLLOW_myPackage_in_module125 = new BitSet(new long[]{0x0000000001B20000L,0x00000009A0000000L});
    public static final BitSet FOLLOW_topLevelList_in_module128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_topLevel_in_topLevelList157 = new BitSet(new long[]{0x0000000001B20002L,0x00000009A0000000L});
    public static final BitSet FOLLOW_myImport_in_topLevel170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_topLevelDecl_in_topLevel176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PACKAGE_in_myPackage187 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_dotIdent_in_myPackage189 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_SEMI_in_myPackage191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MONKEYS_AT_in_meta210 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_meta_in_meta212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_metaName223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveType_in_metaName228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_in_metaName234 = new BitSet(new long[]{0x0000F000100C0000L});
    public static final BitSet FOLLOW_metaName_in_metaName236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_meta_in_typeDeclFlags248 = new BitSet(new long[]{0x0000000000320002L});
    public static final BitSet FOLLOW_set_in_typeDeclFlags252 = new BitSet(new long[]{0x0000000000300002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_qualifiedIdentifier274 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_DOT_in_qualifiedIdentifier287 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_qualifiedIdentifier291 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_IMPORT_in_myImport320 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_dotIdent_in_myImport323 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_SEMI_in_myImport325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_USING_in_myImport331 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_dotIdent_in_myImport334 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_SEMI_in_myImport336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_access0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STATIC_in_declAttr385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INLINE_in_declAttr390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DYNAMIC_in_declAttr395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OVERRIDE_in_declAttr400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_access_in_declAttr405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttr_in_declAttrList417 = new BitSet(new long[]{0x000000003E200002L});
    public static final BitSet FOLLOW_param_in_paramList443 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_COMMA_in_paramList446 = new BitSet(new long[]{0x0000000080040000L});
    public static final BitSet FOLLOW_param_in_paramList448 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_QUES_in_param478 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_param481 = new BitSet(new long[]{0x0000000100080000L});
    public static final BitSet FOLLOW_typeTagOpt_in_param483 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_varInit_in_param485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_id521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_dotIdent535 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_DOT_in_dotIdent543 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_id_in_dotIdent547 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_EQ_in_assignOp571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUSEQ_in_assignOp592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUBEQ_in_assignOp614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SLASHEQ_in_assignOp635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PERCENTEQ_in_assignOp649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AMPEQ_in_assignOp662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_in_funcLit682 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_LPAREN_in_funcLit684 = new BitSet(new long[]{0x0000010080040000L});
    public static final BitSet FOLLOW_paramList_in_funcLit686 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_RPAREN_in_funcLit688 = new BitSet(new long[]{0x4000000000090000L});
    public static final BitSet FOLLOW_typeTagOpt_in_funcLit690 = new BitSet(new long[]{0x4000000000090000L});
    public static final BitSet FOLLOW_block_in_funcLit693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACKET_in_arrayLit722 = new BitSet(new long[]{0x600906C0000D0000L,0x000007F01F880021L});
    public static final BitSet FOLLOW_exprListOpt_in_arrayLit725 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_RBRACKET_in_arrayLit727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_in_typeTag746 = new BitSet(new long[]{0x4000F80010040000L});
    public static final BitSet FOLLOW_funcType_in_typeTag749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeTag_in_typeTagOpt761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcType_in_typeList787 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_COMMA_in_typeList790 = new BitSet(new long[]{0x4000F80010040000L});
    public static final BitSet FOLLOW_funcType_in_typeList793 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_typeConstraint_in_typeList801 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_COMMA_in_typeList804 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_typeConstraint_in_typeList807 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_type_in_funcType822 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_MINUS_BIGGER_in_funcType826 = new BitSet(new long[]{0x4000F80010040000L});
    public static final BitSet FOLLOW_type_in_funcType829 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_VOID_in_funcType836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_primitiveType0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_anonType_in_type875 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_dotIdent_in_type879 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_primitiveType_in_type883 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_typeParam_in_type888 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_LT_in_typeParam906 = new BitSet(new long[]{0x4006F80010040000L});
    public static final BitSet FOLLOW_type_in_typeParam910 = new BitSet(new long[]{0x0006000000000002L});
    public static final BitSet FOLLOW_typeList_in_typeParam912 = new BitSet(new long[]{0x0006000000000002L});
    public static final BitSet FOLLOW_GT_in_typeParam916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GTGT_in_typeParam919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeParam_in_typeParamOpt941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_typeConstraint984 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_COLON_in_typeConstraint986 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_LPAREN_in_typeConstraint988 = new BitSet(new long[]{0x4006F80010040000L});
    public static final BitSet FOLLOW_typeList_in_typeConstraint990 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_RPAREN_in_typeConstraint992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttrList_in_functionReturn1018 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_FUNCTION_in_functionReturn1021 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_NEW_in_functionReturn1023 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_LPAREN_in_functionReturn1025 = new BitSet(new long[]{0x0000010080040000L});
    public static final BitSet FOLLOW_paramList_in_functionReturn1027 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_RPAREN_in_functionReturn1029 = new BitSet(new long[]{0x4000000000090000L});
    public static final BitSet FOLLOW_typeTagOpt_in_functionReturn1031 = new BitSet(new long[]{0x4000000000090000L});
    public static final BitSet FOLLOW_block_in_functionReturn1033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDecl_in_statement1070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_statement1075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_statement1080 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_COLON_in_statement1082 = new BitSet(new long[]{0x7FD902C03E2D0000L,0x000007F05F880021L});
    public static final BitSet FOLLOW_statement_in_statement1084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifStmt_in_statement1105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_statement1110 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_LPAREN_in_statement1112 = new BitSet(new long[]{0x600902C0000D0000L,0x000007F01F880021L});
    public static final BitSet FOLLOW_expr_in_statement1116 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_IN_in_statement1118 = new BitSet(new long[]{0x600902C0000D0000L,0x000007F01F880021L});
    public static final BitSet FOLLOW_expr_in_statement1122 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_RPAREN_in_statement1124 = new BitSet(new long[]{0x7FD902C03E2D0000L,0x000007F05F880021L});
    public static final BitSet FOLLOW_statement_in_statement1126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_statement1154 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_parExpression_in_statement1156 = new BitSet(new long[]{0x7FD902C03E2D0000L,0x000007F05F880021L});
    public static final BitSet FOLLOW_statement_in_statement1158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DO_in_statement1182 = new BitSet(new long[]{0x7FD902C03E2D0000L,0x000007F05F880021L});
    public static final BitSet FOLLOW_statement_in_statement1184 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_WHILE_in_statement1186 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_parExpression_in_statement1188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRY_in_statement1211 = new BitSet(new long[]{0x4000000000090000L});
    public static final BitSet FOLLOW_block_in_statement1213 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_catchStmtList_in_statement1215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_switchStmt_in_statement1239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_statement1244 = new BitSet(new long[]{0x600902C0000D0000L,0x000007F01F880021L});
    public static final BitSet FOLLOW_expr_in_statement1247 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_SEMI_in_statement1251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THROW_in_statement1270 = new BitSet(new long[]{0x600902C0000D0000L,0x000007F01F880021L});
    public static final BitSet FOLLOW_expr_in_statement1272 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_SEMI_in_statement1274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BREAK_in_statement1294 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_statement1297 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_SEMI_in_statement1301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONTINUE_in_statement1319 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_statement1322 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_SEMI_in_statement1326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_statement1344 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_SEMI_in_statement1346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMI_in_statement1352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignExpr_in_expr1367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_expr1373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_switchStmt_in_expr1378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifExpr_in_expr1383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SWITCH_in_switchStmt1394 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_LPAREN_in_switchStmt1396 = new BitSet(new long[]{0x600902C0000D0000L,0x000007F01F880021L});
    public static final BitSet FOLLOW_expr_in_switchStmt1398 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_RPAREN_in_switchStmt1400 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_LBRACE_in_switchStmt1402 = new BitSet(new long[]{0x0000000000000000L,0x000000000000000CL});
    public static final BitSet FOLLOW_caseStmt_in_switchStmt1404 = new BitSet(new long[]{0x8000000000000000L,0x000000000000000CL});
    public static final BitSet FOLLOW_RBRACE_in_switchStmt1407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifExpr1434 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_parExpression_in_ifExpr1436 = new BitSet(new long[]{0x600902C0000D0000L,0x000007F01F880021L});
    public static final BitSet FOLLOW_expr_in_ifExpr1440 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_ifExpr1443 = new BitSet(new long[]{0x600902C0000D0000L,0x000007F01F880021L});
    public static final BitSet FOLLOW_expr_in_ifExpr1447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifStmt1483 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_parExpression_in_ifStmt1485 = new BitSet(new long[]{0x7FD902C03E2D0000L,0x000007F05F880021L});
    public static final BitSet FOLLOW_statement_in_ifStmt1489 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_ifStmt1492 = new BitSet(new long[]{0x7FD902C03E2D0000L,0x000007F05F880021L});
    public static final BitSet FOLLOW_statement_in_ifStmt1496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifStmt1526 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_parExpression_in_ifStmt1528 = new BitSet(new long[]{0x7FD902C03E2D0000L,0x000007F05F880021L});
    public static final BitSet FOLLOW_statement_in_ifStmt1532 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_ifStmt1535 = new BitSet(new long[]{0x7FD902C03E2D0000L,0x000007F05F880021L});
    public static final BitSet FOLLOW_statement_in_ifStmt1539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_parExpression1578 = new BitSet(new long[]{0x600902C0000D0000L,0x000007F01F880021L});
    public static final BitSet FOLLOW_expr_in_parExpression1581 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_RPAREN_in_parExpression1583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_block1595 = new BitSet(new long[]{0xFFD902C03E3F0000L,0x000007F0DF880021L});
    public static final BitSet FOLLOW_blockStmt_in_block1598 = new BitSet(new long[]{0xFFD902C03E3F0000L,0x000007F0DF880021L});
    public static final BitSet FOLLOW_RBRACE_in_block1602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMI_in_block1627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDecl_in_blockStmt1640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classDecl_in_blockStmt1645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_blockStmt1650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BREAK_in_breakStmt1683 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_SEMI_in_breakStmt1685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONTINUE_in_continueStmt1704 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_SEMI_in_continueStmt1706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CASE_in_caseStmt1717 = new BitSet(new long[]{0x600902C0000D0000L,0x000007F01F880021L});
    public static final BitSet FOLLOW_exprList_in_caseStmt1719 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_COLON_in_caseStmt1721 = new BitSet(new long[]{0x7FD902C03E2D0000L,0x000007F05F880021L});
    public static final BitSet FOLLOW_statement_in_caseStmt1723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_caseStmt1741 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_COLON_in_caseStmt1743 = new BitSet(new long[]{0x7FD902C03E2D0000L,0x000007F05F880021L});
    public static final BitSet FOLLOW_statement_in_caseStmt1745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_defaultStmt1774 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_COLON_in_defaultStmt1776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_catchStmt_in_catchStmtList1789 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_catchStmtList_in_catchStmtList1791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CATCH_in_catchStmt1813 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_LPAREN_in_catchStmt1815 = new BitSet(new long[]{0x0000000080040000L});
    public static final BitSet FOLLOW_param_in_catchStmt1817 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_RPAREN_in_catchStmt1819 = new BitSet(new long[]{0x4000000000090000L});
    public static final BitSet FOLLOW_block_in_catchStmt1821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprList_in_exprListOpt1847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_exprList1860 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_COMMA_in_exprList1863 = new BitSet(new long[]{0x600902C0000D0000L,0x000007F01F880021L});
    public static final BitSet FOLLOW_expr_in_exprList1866 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_assignExprEx_in_assignExpr1883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNTYPED_in_assignExpr1888 = new BitSet(new long[]{0x400902C000040000L,0x000007F01F880000L});
    public static final BitSet FOLLOW_assignExprEx_in_assignExpr1890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iterExpr_in_assignExprEx1910 = new BitSet(new long[]{0x0000003F00000002L});
    public static final BitSet FOLLOW_assignOp_in_assignExprEx1913 = new BitSet(new long[]{0x400902C000040000L,0x000007F01F880000L});
    public static final BitSet FOLLOW_iterExpr_in_assignExprEx1916 = new BitSet(new long[]{0x0000003F00000002L});
    public static final BitSet FOLLOW_ternaryExpr_in_iterExpr1928 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_ELLIPSIS_in_iterExpr1931 = new BitSet(new long[]{0x400902C000040000L,0x000007F01F880000L});
    public static final BitSet FOLLOW_ternaryExpr_in_iterExpr1934 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_logicOrExpr_in_ternaryExpr1947 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_QUES_in_ternaryExpr1950 = new BitSet(new long[]{0x600902C0000D0000L,0x000007F01F880021L});
    public static final BitSet FOLLOW_expr_in_ternaryExpr1953 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_COLON_in_ternaryExpr1955 = new BitSet(new long[]{0x400902C000040000L,0x000007F01F880000L});
    public static final BitSet FOLLOW_logicOrExpr_in_ternaryExpr1958 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_logicAndExpr_in_logicOrExpr1979 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_BARBAR_in_logicOrExpr1983 = new BitSet(new long[]{0x400902C000040000L,0x000007F01F880000L});
    public static final BitSet FOLLOW_logicAndExpr_in_logicOrExpr1986 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_cmpExpr_in_logicAndExpr2007 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_AMPAMP_in_logicAndExpr2011 = new BitSet(new long[]{0x400902C000040000L,0x000007F01F880000L});
    public static final BitSet FOLLOW_cmpExpr_in_logicAndExpr2014 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_bitExpr_in_cmpExpr2028 = new BitSet(new long[]{0x0003000000000002L,0x0000000000001E00L});
    public static final BitSet FOLLOW_EQEQ_in_cmpExpr2033 = new BitSet(new long[]{0x400902C000040000L,0x000007F01F880000L});
    public static final BitSet FOLLOW_BANGEQ_in_cmpExpr2037 = new BitSet(new long[]{0x400902C000040000L,0x000007F01F880000L});
    public static final BitSet FOLLOW_GTEQ_in_cmpExpr2042 = new BitSet(new long[]{0x400902C000040000L,0x000007F01F880000L});
    public static final BitSet FOLLOW_LTEQ_in_cmpExpr2047 = new BitSet(new long[]{0x400902C000040000L,0x000007F01F880000L});
    public static final BitSet FOLLOW_GT_in_cmpExpr2052 = new BitSet(new long[]{0x400902C000040000L,0x000007F01F880000L});
    public static final BitSet FOLLOW_LT_in_cmpExpr2057 = new BitSet(new long[]{0x400902C000040000L,0x000007F01F880000L});
    public static final BitSet FOLLOW_bitExpr_in_cmpExpr2062 = new BitSet(new long[]{0x0003000000000002L,0x0000000000001E00L});
    public static final BitSet FOLLOW_shiftExpr_in_bitExpr2076 = new BitSet(new long[]{0x0000000000000002L,0x000000000000E000L});
    public static final BitSet FOLLOW_BAR_in_bitExpr2080 = new BitSet(new long[]{0x400902C000040000L,0x000007F01F880000L});
    public static final BitSet FOLLOW_shiftExpr_in_bitExpr2083 = new BitSet(new long[]{0x0000000000000002L,0x000000000000E000L});
    public static final BitSet FOLLOW_AMP_in_bitExpr2087 = new BitSet(new long[]{0x400902C000040000L,0x000007F01F880000L});
    public static final BitSet FOLLOW_shiftExpr_in_bitExpr2090 = new BitSet(new long[]{0x0000000000000002L,0x000000000000E000L});
    public static final BitSet FOLLOW_CARET_in_bitExpr2093 = new BitSet(new long[]{0x400902C000040000L,0x000007F01F880000L});
    public static final BitSet FOLLOW_shiftExpr_in_bitExpr2096 = new BitSet(new long[]{0x0000000000000002L,0x000000000000E000L});
    public static final BitSet FOLLOW_addExpr_in_shiftExpr2110 = new BitSet(new long[]{0x0002000000000002L,0x0000000000030000L});
    public static final BitSet FOLLOW_LTLT_in_shiftExpr2114 = new BitSet(new long[]{0x400902C000040000L,0x000007F01F880000L});
    public static final BitSet FOLLOW_addExpr_in_shiftExpr2118 = new BitSet(new long[]{0x0002000000000002L,0x0000000000030000L});
    public static final BitSet FOLLOW_GT_in_shiftExpr2123 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_GT_in_shiftExpr2125 = new BitSet(new long[]{0x400902C000040000L,0x000007F01F880000L});
    public static final BitSet FOLLOW_addExpr_in_shiftExpr2130 = new BitSet(new long[]{0x0002000000000002L,0x0000000000030000L});
    public static final BitSet FOLLOW_GTGTGT_in_shiftExpr2134 = new BitSet(new long[]{0x400902C000040000L,0x000007F01F880000L});
    public static final BitSet FOLLOW_addExpr_in_shiftExpr2137 = new BitSet(new long[]{0x0002000000000002L,0x0000000000030000L});
    public static final BitSet FOLLOW_multExpr_in_addExpr2151 = new BitSet(new long[]{0x0000000000000002L,0x00000000000C0000L});
    public static final BitSet FOLLOW_PLUS_in_addExpr2156 = new BitSet(new long[]{0x400902C000040000L,0x000007F01F880000L});
    public static final BitSet FOLLOW_SUB_in_addExpr2161 = new BitSet(new long[]{0x400902C000040000L,0x000007F01F880000L});
    public static final BitSet FOLLOW_multExpr_in_addExpr2165 = new BitSet(new long[]{0x0000000000000002L,0x00000000000C0000L});
    public static final BitSet FOLLOW_prefixExpr_in_multExpr2179 = new BitSet(new long[]{0x0000000000000002L,0x0000000000700000L});
    public static final BitSet FOLLOW_STAR_in_multExpr2184 = new BitSet(new long[]{0x400902C000040000L,0x000007F01F880000L});
    public static final BitSet FOLLOW_SLASH_in_multExpr2187 = new BitSet(new long[]{0x400902C000040000L,0x000007F01F880000L});
    public static final BitSet FOLLOW_PERCENT_in_multExpr2190 = new BitSet(new long[]{0x400902C000040000L,0x000007F01F880000L});
    public static final BitSet FOLLOW_prefixExpr_in_multExpr2194 = new BitSet(new long[]{0x0000000000000002L,0x0000000000700000L});
    public static final BitSet FOLLOW_set_in_prefixExpr2215 = new BitSet(new long[]{0x400902C000040000L,0x000007F01F880000L});
    public static final BitSet FOLLOW_prefixExpr_in_prefixExpr2227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_newExpr_in_prefixExpr2239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cast_in_prefixExpr2251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_suffixExpr_in_prefixExpr2263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_suffixExpr2283 = new BitSet(new long[]{0x400002C000040000L,0x000007F008000000L});
    public static final BitSet FOLLOW_callOrSliceList_in_suffixExpr2285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_suffixExpr2307 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_PLUSPLUS_in_suffixExpr2309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_suffixExpr2332 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_SUBSUB_in_suffixExpr2334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_suffixExpr2357 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_typeParamOpt_in_suffixExpr2359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callOrSlice_in_callOrSliceList2371 = new BitSet(new long[]{0x400002C000040002L,0x000007F008000000L});
    public static final BitSet FOLLOW_LPAREN_in_callOrSlice2384 = new BitSet(new long[]{0x600903C0000D0000L,0x000007F01F880021L});
    public static final BitSet FOLLOW_exprListOpt_in_callOrSlice2386 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_RPAREN_in_callOrSlice2388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACKET_in_callOrSlice2393 = new BitSet(new long[]{0x600902C0000D0000L,0x000007F01F880021L});
    public static final BitSet FOLLOW_expr_in_callOrSlice2395 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_RBRACKET_in_callOrSlice2397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcLit_in_value2407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayLit_in_value2413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objLit_in_value2428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_value2443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_elementarySymbol_in_value2458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_value2473 = new BitSet(new long[]{0x600902C0000D0000L,0x000007F01F880021L});
    public static final BitSet FOLLOW_expr_in_value2476 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_RPAREN_in_value2478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dotIdent_in_value2491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEW_in_newExpr2530 = new BitSet(new long[]{0x4000F08010040000L});
    public static final BitSet FOLLOW_type_in_newExpr2532 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_LPAREN_in_newExpr2534 = new BitSet(new long[]{0x600903C0000D0000L,0x000007F01F880021L});
    public static final BitSet FOLLOW_exprListOpt_in_newExpr2536 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_RPAREN_in_newExpr2538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CAST_in_cast2564 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_LPAREN_in_cast2566 = new BitSet(new long[]{0x600902C0000D0000L,0x000007F01F880021L});
    public static final BitSet FOLLOW_expr_in_cast2568 = new BitSet(new long[]{0x0000010040000000L});
    public static final BitSet FOLLOW_COMMA_in_cast2571 = new BitSet(new long[]{0x4000F80010040000L});
    public static final BitSet FOLLOW_funcType_in_cast2573 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_RPAREN_in_cast2577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CAST_in_cast2595 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_LPAREN_in_cast2597 = new BitSet(new long[]{0x600902C0000D0000L,0x000007F01F880021L});
    public static final BitSet FOLLOW_expr_in_cast2599 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_RPAREN_in_cast2601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classDecl_in_topLevelDecl2633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interfaceDecl_in_topLevelDecl2638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumDecl_in_topLevelDecl2650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typedefDecl_in_topLevelDecl2655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeDeclFlags_in_enumDecl2665 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_ENUM_in_enumDecl2667 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_enumDecl2669 = new BitSet(new long[]{0x4001000000000000L});
    public static final BitSet FOLLOW_typeParamOpt_in_enumDecl2671 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_LBRACE_in_enumDecl2673 = new BitSet(new long[]{0x8000000000040000L});
    public static final BitSet FOLLOW_enumBody_in_enumDecl2675 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_RBRACE_in_enumDecl2677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumValueDecl_in_enumBody2703 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_enumValueDecl2722 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_LPAREN_in_enumValueDecl2724 = new BitSet(new long[]{0x0000010080040000L});
    public static final BitSet FOLLOW_paramList_in_enumValueDecl2726 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_RPAREN_in_enumValueDecl2728 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_SEMI_in_enumValueDecl2730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_enumValueDecl2756 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_SEMI_in_enumValueDecl2758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDecl_in_varDeclList2797 = new BitSet(new long[]{0x000000003E200000L,0x0000000040000000L});
    public static final BitSet FOLLOW_varDeclList_in_varDeclList2799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttrList_in_varDecl2811 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_VAR_in_varDecl2815 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_varDeclPartList_in_varDecl2817 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_SEMI_in_varDecl2819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDeclPart_in_varDeclPartList2850 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_COMMA_in_varDeclPartList2853 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_varDeclPart_in_varDeclPartList2856 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_varDeclPart2870 = new BitSet(new long[]{0x0000008100080000L});
    public static final BitSet FOLLOW_propDeclOpt_in_varDeclPart2875 = new BitSet(new long[]{0x0000000100080000L});
    public static final BitSet FOLLOW_typeTagOpt_in_varDeclPart2877 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_varInit_in_varDeclPart2879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_propDecl2889 = new BitSet(new long[]{0x0000000010040000L,0x0000000008000008L});
    public static final BitSet FOLLOW_propAccessor_in_propDecl2893 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_COMMA_in_propDecl2895 = new BitSet(new long[]{0x0000000010040000L,0x0000000008000008L});
    public static final BitSet FOLLOW_propAccessor_in_propDecl2899 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_RPAREN_in_propDecl2901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_propAccessor0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_propDecl_in_propDeclOpt2961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQ_in_varInit2976 = new BitSet(new long[]{0x600902C0000D0000L,0x000007F01F880021L});
    public static final BitSet FOLLOW_expr_in_varInit2978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttrList_in_funcDecl3005 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_FUNCTION_in_funcDecl3008 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_NEW_in_funcDecl3010 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_LPAREN_in_funcDecl3012 = new BitSet(new long[]{0x0000010080040000L});
    public static final BitSet FOLLOW_paramList_in_funcDecl3014 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_RPAREN_in_funcDecl3016 = new BitSet(new long[]{0x4000000000090000L});
    public static final BitSet FOLLOW_typeTagOpt_in_funcDecl3018 = new BitSet(new long[]{0x4000000000090000L});
    public static final BitSet FOLLOW_block_in_funcDecl3020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttrList_in_funcDecl3053 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_FUNCTION_in_funcDecl3056 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_funcDecl3058 = new BitSet(new long[]{0x0001008000000000L});
    public static final BitSet FOLLOW_typeParamOpt_in_funcDecl3060 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_LPAREN_in_funcDecl3062 = new BitSet(new long[]{0x0000010080040000L});
    public static final BitSet FOLLOW_paramList_in_funcDecl3064 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_RPAREN_in_funcDecl3066 = new BitSet(new long[]{0x4000000000090000L});
    public static final BitSet FOLLOW_typeTagOpt_in_funcDecl3068 = new BitSet(new long[]{0x4000000000090000L});
    public static final BitSet FOLLOW_block_in_funcDecl3070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttrList_in_funcProtoDecl3112 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_FUNCTION_in_funcProtoDecl3114 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_NEW_in_funcProtoDecl3116 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_LPAREN_in_funcProtoDecl3118 = new BitSet(new long[]{0x0000010080040000L});
    public static final BitSet FOLLOW_paramList_in_funcProtoDecl3120 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_RPAREN_in_funcProtoDecl3122 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_typeTagOpt_in_funcProtoDecl3124 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_SEMI_in_funcProtoDecl3126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttrList_in_funcProtoDecl3153 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_FUNCTION_in_funcProtoDecl3155 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_funcProtoDecl3157 = new BitSet(new long[]{0x0001008000000000L});
    public static final BitSet FOLLOW_typeParamOpt_in_funcProtoDecl3159 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_LPAREN_in_funcProtoDecl3161 = new BitSet(new long[]{0x0000010080040000L});
    public static final BitSet FOLLOW_paramList_in_funcProtoDecl3163 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_RPAREN_in_funcProtoDecl3165 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_typeTagOpt_in_funcProtoDecl3167 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_SEMI_in_funcProtoDecl3169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_in_funcProtoDecl3199 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_NEW_in_funcProtoDecl3201 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_LPAREN_in_funcProtoDecl3203 = new BitSet(new long[]{0x0000010080040000L});
    public static final BitSet FOLLOW_paramList_in_funcProtoDecl3205 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_RPAREN_in_funcProtoDecl3207 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_typeTagOpt_in_funcProtoDecl3209 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_SEMI_in_funcProtoDecl3211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_in_funcProtoDecl3235 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_funcProtoDecl3237 = new BitSet(new long[]{0x0001008000000000L});
    public static final BitSet FOLLOW_typeParamOpt_in_funcProtoDecl3239 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_LPAREN_in_funcProtoDecl3241 = new BitSet(new long[]{0x0000010080040000L});
    public static final BitSet FOLLOW_paramList_in_funcProtoDecl3243 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_RPAREN_in_funcProtoDecl3245 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_typeTagOpt_in_funcProtoDecl3247 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_SEMI_in_funcProtoDecl3249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeDeclFlags_in_classDecl3283 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_CLASS_in_classDecl3285 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_classDecl3287 = new BitSet(new long[]{0x4001000000000000L,0x0000000600000000L});
    public static final BitSet FOLLOW_typeParamOpt_in_classDecl3289 = new BitSet(new long[]{0x4001000000000000L,0x0000000600000000L});
    public static final BitSet FOLLOW_inheritListOpt_in_classDecl3291 = new BitSet(new long[]{0x4001000000000000L,0x0000000600000000L});
    public static final BitSet FOLLOW_classBodyScope_in_classDecl3293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_classBodyScope3331 = new BitSet(new long[]{0x800000403E320000L,0x0000000060000000L});
    public static final BitSet FOLLOW_classMember_in_classBodyScope3334 = new BitSet(new long[]{0x800000403E320000L,0x0000000060000000L});
    public static final BitSet FOLLOW_RBRACE_in_classBodyScope3338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDecl_in_classMember3368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcDecl_in_classMember3374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumDecl_in_classMember3381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeDeclFlags_in_interfaceDecl3399 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_INTERFACE_in_interfaceDecl3401 = new BitSet(new long[]{0x4000F00010040000L,0x0000000600000000L});
    public static final BitSet FOLLOW_type_in_interfaceDecl3403 = new BitSet(new long[]{0x4000000000000000L,0x0000000600000000L});
    public static final BitSet FOLLOW_inheritListOpt_in_interfaceDecl3405 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_LBRACE_in_interfaceDecl3407 = new BitSet(new long[]{0x800000403E200000L,0x0000000040000000L});
    public static final BitSet FOLLOW_interfaceBody_in_interfaceDecl3410 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_RBRACE_in_interfaceDecl3412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDecl_in_interfaceBody3425 = new BitSet(new long[]{0x000000403E200000L,0x0000000040000000L});
    public static final BitSet FOLLOW_interfaceBody_in_interfaceBody3427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcProtoDecl_in_interfaceBody3432 = new BitSet(new long[]{0x000000403E200000L,0x0000000040000000L});
    public static final BitSet FOLLOW_interfaceBody_in_interfaceBody3434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inherit_in_inheritList3456 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_COMMA_in_inheritList3459 = new BitSet(new long[]{0x0000000000000000L,0x0000000600000000L});
    public static final BitSet FOLLOW_inherit_in_inheritList3462 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_inheritList_in_inheritListOpt3480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXTENDS_in_inherit3516 = new BitSet(new long[]{0x4000F00010040000L});
    public static final BitSet FOLLOW_type_in_inherit3518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IMPLEMENTS_in_inherit3540 = new BitSet(new long[]{0x4000F00010040000L});
    public static final BitSet FOLLOW_type_in_inherit3542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPEDEF_in_typedefDecl3570 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_typedefDecl3572 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_EQ_in_typedefDecl3574 = new BitSet(new long[]{0x4000F80010040000L});
    public static final BitSet FOLLOW_funcType_in_typedefDecl3576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GT_in_typeExtend3595 = new BitSet(new long[]{0x4000F80010040000L});
    public static final BitSet FOLLOW_funcType_in_typeExtend3597 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_COMMA_in_typeExtend3599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_anonType3610 = new BitSet(new long[]{0x800200003E240000L,0x0000000040000000L});
    public static final BitSet FOLLOW_anonTypeFieldList_in_anonType3645 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_varDeclList_in_anonType3673 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_typeExtend_in_anonType3702 = new BitSet(new long[]{0x800000003E240000L,0x0000000040000000L});
    public static final BitSet FOLLOW_anonTypeFieldList_in_anonType3730 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_varDeclList_in_anonType3756 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_RBRACE_in_anonType3800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_anonTypeField_in_anonTypeFieldList3814 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_COMMA_in_anonTypeFieldList3817 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_anonTypeField_in_anonTypeFieldList3820 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_LBRACE_in_objLit3832 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_objLitElemList_in_objLit3835 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_RBRACE_in_objLit3837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_anonTypeField3849 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_COLON_in_anonTypeField3851 = new BitSet(new long[]{0x4000F80010040000L});
    public static final BitSet FOLLOW_funcType_in_anonTypeField3854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objLitElem_in_objLitElemList3870 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_COMMA_in_objLitElemList3873 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_objLitElem_in_objLitElemList3876 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_objLitElem3897 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_COLON_in_objLitElem3899 = new BitSet(new long[]{0x600902C0000D0000L,0x000007F01F880021L});
    public static final BitSet FOLLOW_expr_in_objLitElem3902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LONGLITERAL_in_elementarySymbol3914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTLITERAL_in_elementarySymbol3927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRINGLITERAL_in_elementarySymbol3940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARLITERAL_in_elementarySymbol3953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOATNUM_in_elementarySymbol3966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_elementarySymbol3979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_elementarySymbol3993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeTagOpt_in_synpred26_TinyHaxeTry1690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_synpred28_TinyHaxeTry1790 = new BitSet(new long[]{0x4000F80010040000L});
    public static final BitSet FOLLOW_funcType_in_synpred28_TinyHaxeTry1793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcType_in_synpred29_TinyHaxeTry1787 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_COMMA_in_synpred29_TinyHaxeTry1790 = new BitSet(new long[]{0x4000F80010040000L});
    public static final BitSet FOLLOW_funcType_in_synpred29_TinyHaxeTry1793 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_COMMA_in_synpred30_TinyHaxeTry1804 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_typeConstraint_in_synpred30_TinyHaxeTry1807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_BIGGER_in_synpred31_TinyHaxeTry1826 = new BitSet(new long[]{0x4000F00010040000L});
    public static final BitSet FOLLOW_type_in_synpred31_TinyHaxeTry1829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_synpred32_TinyHaxeTry1822 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_MINUS_BIGGER_in_synpred32_TinyHaxeTry1826 = new BitSet(new long[]{0x4000F80010040000L});
    public static final BitSet FOLLOW_type_in_synpred32_TinyHaxeTry1829 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_typeParam_in_synpred39_TinyHaxeTry1888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_anonType_in_synpred40_TinyHaxeTry1875 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_dotIdent_in_synpred40_TinyHaxeTry1879 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_primitiveType_in_synpred40_TinyHaxeTry1883 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_typeParam_in_synpred40_TinyHaxeTry1888 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_type_in_synpred41_TinyHaxeTry1910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GT_in_synpred42_TinyHaxeTry1916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GTGT_in_synpred43_TinyHaxeTry1919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeParam_in_synpred44_TinyHaxeTry1941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_synpred47_TinyHaxeTry11075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_synpred48_TinyHaxeTry11080 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_COLON_in_synpred48_TinyHaxeTry11082 = new BitSet(new long[]{0x7FD902C03E2D0000L,0x000007F05F880021L});
    public static final BitSet FOLLOW_statement_in_synpred48_TinyHaxeTry11084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifStmt_in_synpred49_TinyHaxeTry11105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_switchStmt_in_synpred54_TinyHaxeTry11239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_synpred55_TinyHaxeTry11247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_synpred62_TinyHaxeTry11344 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_SEMI_in_synpred62_TinyHaxeTry11346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignExpr_in_synpred63_TinyHaxeTry11367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_synpred64_TinyHaxeTry11373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_synpred67_TinyHaxeTry11443 = new BitSet(new long[]{0x600902C0000D0000L,0x000007F01F880021L});
    public static final BitSet FOLLOW_expr_in_synpred67_TinyHaxeTry11447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_synpred68_TinyHaxeTry11492 = new BitSet(new long[]{0x7FD902C03E2D0000L,0x000007F05F880021L});
    public static final BitSet FOLLOW_statement_in_synpred68_TinyHaxeTry11496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_synpred69_TinyHaxeTry11483 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_parExpression_in_synpred69_TinyHaxeTry11485 = new BitSet(new long[]{0x7FD902C03E2D0000L,0x000007F05F880021L});
    public static final BitSet FOLLOW_statement_in_synpred69_TinyHaxeTry11489 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_synpred69_TinyHaxeTry11492 = new BitSet(new long[]{0x7FD902C03E2D0000L,0x000007F05F880021L});
    public static final BitSet FOLLOW_statement_in_synpred69_TinyHaxeTry11496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_synpred70_TinyHaxeTry11535 = new BitSet(new long[]{0x7FD902C03E2D0000L,0x000007F05F880021L});
    public static final BitSet FOLLOW_statement_in_synpred70_TinyHaxeTry11539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDecl_in_synpred73_TinyHaxeTry11640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classDecl_in_synpred74_TinyHaxeTry11645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprList_in_synpred77_TinyHaxeTry11847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GT_in_synpred95_TinyHaxeTry12123 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_GT_in_synpred95_TinyHaxeTry12125 = new BitSet(new long[]{0x400902C000040000L,0x000007F01F880000L});
    public static final BitSet FOLLOW_addExpr_in_synpred95_TinyHaxeTry12130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred106_TinyHaxeTry12215 = new BitSet(new long[]{0x400902C000040000L,0x000007F01F880000L});
    public static final BitSet FOLLOW_prefixExpr_in_synpred106_TinyHaxeTry12227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_synpred109_TinyHaxeTry12283 = new BitSet(new long[]{0x400002C000040000L,0x000007F008000000L});
    public static final BitSet FOLLOW_callOrSliceList_in_synpred109_TinyHaxeTry12285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_synpred110_TinyHaxeTry12307 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_PLUSPLUS_in_synpred110_TinyHaxeTry12309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_synpred111_TinyHaxeTry12332 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_SUBSUB_in_synpred111_TinyHaxeTry12334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayLit_in_synpred115_TinyHaxeTry12413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_synpred119_TinyHaxeTry12473 = new BitSet(new long[]{0x600902C0000D0000L,0x000007F01F880021L});
    public static final BitSet FOLLOW_expr_in_synpred119_TinyHaxeTry12476 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_RPAREN_in_synpred119_TinyHaxeTry12478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CAST_in_synpred122_TinyHaxeTry12564 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_LPAREN_in_synpred122_TinyHaxeTry12566 = new BitSet(new long[]{0x600902C0000D0000L,0x000007F01F880021L});
    public static final BitSet FOLLOW_expr_in_synpred122_TinyHaxeTry12568 = new BitSet(new long[]{0x0000010040000000L});
    public static final BitSet FOLLOW_COMMA_in_synpred122_TinyHaxeTry12571 = new BitSet(new long[]{0x4000F80010040000L});
    public static final BitSet FOLLOW_funcType_in_synpred122_TinyHaxeTry12573 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_RPAREN_in_synpred122_TinyHaxeTry12577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classDecl_in_synpred123_TinyHaxeTry12633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interfaceDecl_in_synpred124_TinyHaxeTry12638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumDecl_in_synpred125_TinyHaxeTry12650 = new BitSet(new long[]{0x0000000000000002L});

}