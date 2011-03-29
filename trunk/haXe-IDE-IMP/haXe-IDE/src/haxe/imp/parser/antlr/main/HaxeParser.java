// $ANTLR 3.3 Nov 30, 2010 12:50:56 Haxe.g 2011-03-29 12:50:06

package haxe.imp.parser.antlr.main;

import haxe.imp.parser.antlr.tree.HaxeTree;
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

public class HaxeParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "PROPERTY_DECL", "MODULE", "SUFFIX_EXPR", "BLOCK_SCOPE", "PARAM_LIST", "TYPE_TAG", "TYPE_PARAM_OPT", "INHERIT_LIST_OPT", "DECL_ATTR_LIST", "VAR_INIT", "ASSIGN_OPERATOR", "PACKAGE", "SEMI", "MONKEYS_AT", "LPAREN", "RPAREN", "IDENTIFIER", "COLON", "EXTERN", "PRIVATE", "DOT", "IMPORT", "USING", "PUBLIC", "STATIC", "INLINE", "DYNAMIC", "OVERRIDE", "COMMA", "QUES", "THIS", "EQ", "PLUSEQ", "SUBEQ", "SLASHEQ", "PERCENTEQ", "AMPEQ", "FUNCTION", "LBRACKET", "RBRACKET", "MINUS_BIGGER", "VOID", "INT", "FLOAT", "BOOLEAN", "LT", "GT", "GTGT", "GTGTGT", "NEW", "IF", "ELSE", "FOR", "IN", "WHILE", "DO", "TRY", "SWITCH", "LBRACE", "RBRACE", "RETURN", "THROW", "BREAK", "CONTINUE", "CASE", "DEFAULT", "CATCH", "UNTYPED", "ELLIPSIS", "BARBAR", "AMPAMP", "EQEQ", "BANGEQ", "GTEQ", "LTEQ", "BAR", "AMP", "CARET", "LTLT", "PLUS", "SUB", "STAR", "SLASH", "PERCENT", "SUBSUB", "PLUSPLUS", "BANG", "TILDE", "NULL", "CAST", "ENUM", "VAR", "CLASS", "INTERFACE", "EXTENDS", "IMPLEMENTS", "TYPEDEF", "LONGLITERAL", "INTLITERAL", "STRINGLITERAL", "CHARLITERAL", "FLOATNUM", "TRUE", "FALSE", "WS", "IntegerNumber", "LongSuffix", "HexPrefix", "HexDigit", "Exponent", "EscapeSequence", "ABSTRACT", "BYTE", "CHAR", "CONST", "DOUBLE", "FINAL", "FINALLY", "GOTO", "INSTANCEOF", "LONG", "NATIVE", "PROTECTED", "SHORT", "STRICTFP", "SUPER", "THROWS", "TRANSIENT", "VOLATILE", "STAREQ", "BAREQ", "CARETEQ", "PERCENTDLQ", "PERCENTDBQ", "PERCENTDBBQ", "EQEQEQ", "PERCENTLESQ", "BANGEQQ", "PERCENTLL", "PERCENTBB", "PERCENTBBB", "LTLTEQ", "GTGTEQ", "GTGTGTEQ", "INTNUM", "EXPONENT", "COMMENT", "PP_IF", "PP_ELSEIF", "PP_ELSE", "PP_END", "PP_ERROR", "TS", "PP_CONDITIONAL", "PREPROCESSOR_DIRECTIVE", "IF_TOKEN", "ELSE_TOKEN", "ENDIF_TOKEN", "PP_EXPRESSION", "PP_OR_EXPRESSION", "PP_AND_EXPRESSION", "PP_UNARY_EXPRESSION", "PP_PRIMARY_EXPRESSION", "HEX_DIGIT", "UNICODE_ESC", "OCTAL_ESC", "ESC_SEQ"
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
    public static final int MONKEYS_AT=17;
    public static final int LPAREN=18;
    public static final int RPAREN=19;
    public static final int IDENTIFIER=20;
    public static final int COLON=21;
    public static final int EXTERN=22;
    public static final int PRIVATE=23;
    public static final int DOT=24;
    public static final int IMPORT=25;
    public static final int USING=26;
    public static final int PUBLIC=27;
    public static final int STATIC=28;
    public static final int INLINE=29;
    public static final int DYNAMIC=30;
    public static final int OVERRIDE=31;
    public static final int COMMA=32;
    public static final int QUES=33;
    public static final int THIS=34;
    public static final int EQ=35;
    public static final int PLUSEQ=36;
    public static final int SUBEQ=37;
    public static final int SLASHEQ=38;
    public static final int PERCENTEQ=39;
    public static final int AMPEQ=40;
    public static final int FUNCTION=41;
    public static final int LBRACKET=42;
    public static final int RBRACKET=43;
    public static final int MINUS_BIGGER=44;
    public static final int VOID=45;
    public static final int INT=46;
    public static final int FLOAT=47;
    public static final int BOOLEAN=48;
    public static final int LT=49;
    public static final int GT=50;
    public static final int GTGT=51;
    public static final int GTGTGT=52;
    public static final int NEW=53;
    public static final int IF=54;
    public static final int ELSE=55;
    public static final int FOR=56;
    public static final int IN=57;
    public static final int WHILE=58;
    public static final int DO=59;
    public static final int TRY=60;
    public static final int SWITCH=61;
    public static final int LBRACE=62;
    public static final int RBRACE=63;
    public static final int RETURN=64;
    public static final int THROW=65;
    public static final int BREAK=66;
    public static final int CONTINUE=67;
    public static final int CASE=68;
    public static final int DEFAULT=69;
    public static final int CATCH=70;
    public static final int UNTYPED=71;
    public static final int ELLIPSIS=72;
    public static final int BARBAR=73;
    public static final int AMPAMP=74;
    public static final int EQEQ=75;
    public static final int BANGEQ=76;
    public static final int GTEQ=77;
    public static final int LTEQ=78;
    public static final int BAR=79;
    public static final int AMP=80;
    public static final int CARET=81;
    public static final int LTLT=82;
    public static final int PLUS=83;
    public static final int SUB=84;
    public static final int STAR=85;
    public static final int SLASH=86;
    public static final int PERCENT=87;
    public static final int SUBSUB=88;
    public static final int PLUSPLUS=89;
    public static final int BANG=90;
    public static final int TILDE=91;
    public static final int NULL=92;
    public static final int CAST=93;
    public static final int ENUM=94;
    public static final int VAR=95;
    public static final int CLASS=96;
    public static final int INTERFACE=97;
    public static final int EXTENDS=98;
    public static final int IMPLEMENTS=99;
    public static final int TYPEDEF=100;
    public static final int LONGLITERAL=101;
    public static final int INTLITERAL=102;
    public static final int STRINGLITERAL=103;
    public static final int CHARLITERAL=104;
    public static final int FLOATNUM=105;
    public static final int TRUE=106;
    public static final int FALSE=107;
    public static final int WS=108;
    public static final int IntegerNumber=109;
    public static final int LongSuffix=110;
    public static final int HexPrefix=111;
    public static final int HexDigit=112;
    public static final int Exponent=113;
    public static final int EscapeSequence=114;
    public static final int ABSTRACT=115;
    public static final int BYTE=116;
    public static final int CHAR=117;
    public static final int CONST=118;
    public static final int DOUBLE=119;
    public static final int FINAL=120;
    public static final int FINALLY=121;
    public static final int GOTO=122;
    public static final int INSTANCEOF=123;
    public static final int LONG=124;
    public static final int NATIVE=125;
    public static final int PROTECTED=126;
    public static final int SHORT=127;
    public static final int STRICTFP=128;
    public static final int SUPER=129;
    public static final int THROWS=130;
    public static final int TRANSIENT=131;
    public static final int VOLATILE=132;
    public static final int STAREQ=133;
    public static final int BAREQ=134;
    public static final int CARETEQ=135;
    public static final int PERCENTDLQ=136;
    public static final int PERCENTDBQ=137;
    public static final int PERCENTDBBQ=138;
    public static final int EQEQEQ=139;
    public static final int PERCENTLESQ=140;
    public static final int BANGEQQ=141;
    public static final int PERCENTLL=142;
    public static final int PERCENTBB=143;
    public static final int PERCENTBBB=144;
    public static final int LTLTEQ=145;
    public static final int GTGTEQ=146;
    public static final int GTGTGTEQ=147;
    public static final int INTNUM=148;
    public static final int EXPONENT=149;
    public static final int COMMENT=150;
    public static final int PP_IF=151;
    public static final int PP_ELSEIF=152;
    public static final int PP_ELSE=153;
    public static final int PP_END=154;
    public static final int PP_ERROR=155;
    public static final int TS=156;
    public static final int PP_CONDITIONAL=157;
    public static final int PREPROCESSOR_DIRECTIVE=158;
    public static final int IF_TOKEN=159;
    public static final int ELSE_TOKEN=160;
    public static final int ENDIF_TOKEN=161;
    public static final int PP_EXPRESSION=162;
    public static final int PP_OR_EXPRESSION=163;
    public static final int PP_AND_EXPRESSION=164;
    public static final int PP_UNARY_EXPRESSION=165;
    public static final int PP_PRIMARY_EXPRESSION=166;
    public static final int HEX_DIGIT=167;
    public static final int UNICODE_ESC=168;
    public static final int OCTAL_ESC=169;
    public static final int ESC_SEQ=170;

    // delegates
    // delegators


        public HaxeParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public HaxeParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
            this.state.ruleMemo = new HashMap[247+1];
             
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return HaxeParser.tokenNames; }
    public String getGrammarFileName() { return "Haxe.g"; }


    public static class module_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "module"
    // Haxe.g:63:1: module : ( myPackage )? topLevelList -> ^( MODULE[\"MODULE\",true] ( myPackage )? ( topLevelList )? ) ;
    public final HaxeParser.module_return module() throws RecognitionException {
        HaxeParser.module_return retval = new HaxeParser.module_return();
        retval.start = input.LT(1);
        int module_StartIndex = input.index();
        Object root_0 = null;

        HaxeParser.myPackage_return myPackage1 = null;

        HaxeParser.topLevelList_return topLevelList2 = null;


        RewriteRuleSubtreeStream stream_myPackage=new RewriteRuleSubtreeStream(adaptor,"rule myPackage");
        RewriteRuleSubtreeStream stream_topLevelList=new RewriteRuleSubtreeStream(adaptor,"rule topLevelList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return retval; }
            // Haxe.g:64:2: ( ( myPackage )? topLevelList -> ^( MODULE[\"MODULE\",true] ( myPackage )? ( topLevelList )? ) )
            // Haxe.g:64:4: ( myPackage )? topLevelList
            {
            // Haxe.g:64:4: ( myPackage )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==PACKAGE) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // Haxe.g:0:0: myPackage
                    {
                    pushFollow(FOLLOW_myPackage_in_module123);
                    myPackage1=myPackage();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_myPackage.add(myPackage1.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_topLevelList_in_module126);
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
            // 64:28: -> ^( MODULE[\"MODULE\",true] ( myPackage )? ( topLevelList )? )
            {
                // Haxe.g:64:31: ^( MODULE[\"MODULE\",true] ( myPackage )? ( topLevelList )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new HaxeTree(MODULE, "MODULE", true), root_1);

                // Haxe.g:64:65: ( myPackage )?
                if ( stream_myPackage.hasNext() ) {
                    adaptor.addChild(root_1, stream_myPackage.nextTree());

                }
                stream_myPackage.reset();
                // Haxe.g:64:76: ( topLevelList )?
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
    // Haxe.g:67:1: topLevelList : ( topLevel )* ;
    public final HaxeParser.topLevelList_return topLevelList() throws RecognitionException {
        HaxeParser.topLevelList_return retval = new HaxeParser.topLevelList_return();
        retval.start = input.LT(1);
        int topLevelList_StartIndex = input.index();
        Object root_0 = null;

        HaxeParser.topLevel_return topLevel3 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return retval; }
            // Haxe.g:68:2: ( ( topLevel )* )
            // Haxe.g:68:4: ( topLevel )*
            {
            root_0 = (Object)adaptor.nil();

            // Haxe.g:68:4: ( topLevel )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==MONKEYS_AT||(LA2_0>=EXTERN && LA2_0<=PRIVATE)||(LA2_0>=IMPORT && LA2_0<=USING)||LA2_0==ENUM||(LA2_0>=CLASS && LA2_0<=INTERFACE)||LA2_0==TYPEDEF) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // Haxe.g:68:5: topLevel
            	    {
            	    pushFollow(FOLLOW_topLevel_in_topLevelList155);
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
    // Haxe.g:71:1: topLevel : ( myImport | topLevelDecl );
    public final HaxeParser.topLevel_return topLevel() throws RecognitionException {
        HaxeParser.topLevel_return retval = new HaxeParser.topLevel_return();
        retval.start = input.LT(1);
        int topLevel_StartIndex = input.index();
        Object root_0 = null;

        HaxeParser.myImport_return myImport4 = null;

        HaxeParser.topLevelDecl_return topLevelDecl5 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return retval; }
            // Haxe.g:72:2: ( myImport | topLevelDecl )
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
                    // Haxe.g:72:4: myImport
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_myImport_in_topLevel168);
                    myImport4=myImport();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, myImport4.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:74:4: topLevelDecl
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_topLevelDecl_in_topLevel174);
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
    // Haxe.g:77:1: myPackage : PACKAGE dotIdent SEMI -> ^( PACKAGE ( dotIdent )? ) ;
    public final HaxeParser.myPackage_return myPackage() throws RecognitionException {
        HaxeParser.myPackage_return retval = new HaxeParser.myPackage_return();
        retval.start = input.LT(1);
        int myPackage_StartIndex = input.index();
        Object root_0 = null;

        Token PACKAGE6=null;
        Token SEMI8=null;
        HaxeParser.dotIdent_return dotIdent7 = null;


        Object PACKAGE6_tree=null;
        Object SEMI8_tree=null;
        RewriteRuleTokenStream stream_PACKAGE=new RewriteRuleTokenStream(adaptor,"token PACKAGE");
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleSubtreeStream stream_dotIdent=new RewriteRuleSubtreeStream(adaptor,"rule dotIdent");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return retval; }
            // Haxe.g:78:2: ( PACKAGE dotIdent SEMI -> ^( PACKAGE ( dotIdent )? ) )
            // Haxe.g:78:4: PACKAGE dotIdent SEMI
            {
            PACKAGE6=(Token)match(input,PACKAGE,FOLLOW_PACKAGE_in_myPackage185); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_PACKAGE.add(PACKAGE6);

            pushFollow(FOLLOW_dotIdent_in_myPackage187);
            dotIdent7=dotIdent();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_dotIdent.add(dotIdent7.getTree());
            SEMI8=(Token)match(input,SEMI,FOLLOW_SEMI_in_myPackage189); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SEMI.add(SEMI8);



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
            // 78:26: -> ^( PACKAGE ( dotIdent )? )
            {
                // Haxe.g:78:29: ^( PACKAGE ( dotIdent )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_PACKAGE.nextNode(), root_1);

                // Haxe.g:78:39: ( dotIdent )?
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
    // Haxe.g:81:1: meta : MONKEYS_AT metaName ( LPAREN paramList RPAREN )? ;
    public final HaxeParser.meta_return meta() throws RecognitionException {
        HaxeParser.meta_return retval = new HaxeParser.meta_return();
        retval.start = input.LT(1);
        int meta_StartIndex = input.index();
        Object root_0 = null;

        Token MONKEYS_AT9=null;
        Token LPAREN11=null;
        Token RPAREN13=null;
        HaxeParser.metaName_return metaName10 = null;

        HaxeParser.paramList_return paramList12 = null;


        Object MONKEYS_AT9_tree=null;
        Object LPAREN11_tree=null;
        Object RPAREN13_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return retval; }
            // Haxe.g:81:6: ( MONKEYS_AT metaName ( LPAREN paramList RPAREN )? )
            // Haxe.g:81:8: MONKEYS_AT metaName ( LPAREN paramList RPAREN )?
            {
            root_0 = (Object)adaptor.nil();

            MONKEYS_AT9=(Token)match(input,MONKEYS_AT,FOLLOW_MONKEYS_AT_in_meta208); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            MONKEYS_AT9_tree = (Object)adaptor.create(MONKEYS_AT9);
            adaptor.addChild(root_0, MONKEYS_AT9_tree);
            }
            pushFollow(FOLLOW_metaName_in_meta210);
            metaName10=metaName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, metaName10.getTree());
            // Haxe.g:81:28: ( LPAREN paramList RPAREN )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==LPAREN) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // Haxe.g:81:29: LPAREN paramList RPAREN
                    {
                    LPAREN11=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_meta213); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LPAREN11_tree = (Object)adaptor.create(LPAREN11);
                    adaptor.addChild(root_0, LPAREN11_tree);
                    }
                    pushFollow(FOLLOW_paramList_in_meta215);
                    paramList12=paramList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, paramList12.getTree());
                    RPAREN13=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_meta217); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RPAREN13_tree = (Object)adaptor.create(RPAREN13);
                    adaptor.addChild(root_0, RPAREN13_tree);
                    }

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
    // Haxe.g:84:1: metaName : ( IDENTIFIER | primitiveType | COLON metaName );
    public final HaxeParser.metaName_return metaName() throws RecognitionException {
        HaxeParser.metaName_return retval = new HaxeParser.metaName_return();
        retval.start = input.LT(1);
        int metaName_StartIndex = input.index();
        Object root_0 = null;

        Token IDENTIFIER14=null;
        Token COLON16=null;
        HaxeParser.primitiveType_return primitiveType15 = null;

        HaxeParser.metaName_return metaName17 = null;


        Object IDENTIFIER14_tree=null;
        Object COLON16_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return retval; }
            // Haxe.g:85:2: ( IDENTIFIER | primitiveType | COLON metaName )
            int alt5=3;
            switch ( input.LA(1) ) {
            case IDENTIFIER:
                {
                alt5=1;
                }
                break;
            case DYNAMIC:
            case VOID:
            case INT:
            case FLOAT:
            case BOOLEAN:
                {
                alt5=2;
                }
                break;
            case COLON:
                {
                alt5=3;
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
                    // Haxe.g:85:4: IDENTIFIER
                    {
                    root_0 = (Object)adaptor.nil();

                    IDENTIFIER14=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_metaName230); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER14_tree = (Object)adaptor.create(IDENTIFIER14);
                    adaptor.addChild(root_0, IDENTIFIER14_tree);
                    }

                    }
                    break;
                case 2 :
                    // Haxe.g:86:4: primitiveType
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_primitiveType_in_metaName235);
                    primitiveType15=primitiveType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveType15.getTree());

                    }
                    break;
                case 3 :
                    // Haxe.g:88:4: COLON metaName
                    {
                    root_0 = (Object)adaptor.nil();

                    COLON16=(Token)match(input,COLON,FOLLOW_COLON_in_metaName241); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    COLON16_tree = (Object)adaptor.create(COLON16);
                    adaptor.addChild(root_0, COLON16_tree);
                    }
                    pushFollow(FOLLOW_metaName_in_metaName243);
                    metaName17=metaName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, metaName17.getTree());

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
    // Haxe.g:91:1: typeDeclFlags : ( meta )* ( EXTERN | PRIVATE )* ;
    public final HaxeParser.typeDeclFlags_return typeDeclFlags() throws RecognitionException {
        HaxeParser.typeDeclFlags_return retval = new HaxeParser.typeDeclFlags_return();
        retval.start = input.LT(1);
        int typeDeclFlags_StartIndex = input.index();
        Object root_0 = null;

        Token set19=null;
        HaxeParser.meta_return meta18 = null;


        Object set19_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return retval; }
            // Haxe.g:92:2: ( ( meta )* ( EXTERN | PRIVATE )* )
            // Haxe.g:92:4: ( meta )* ( EXTERN | PRIVATE )*
            {
            root_0 = (Object)adaptor.nil();

            // Haxe.g:92:4: ( meta )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==MONKEYS_AT) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // Haxe.g:92:5: meta
            	    {
            	    pushFollow(FOLLOW_meta_in_typeDeclFlags255);
            	    meta18=meta();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, meta18.getTree());

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // Haxe.g:92:12: ( EXTERN | PRIVATE )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=EXTERN && LA7_0<=PRIVATE)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // Haxe.g:
            	    {
            	    set19=(Token)input.LT(1);
            	    if ( (input.LA(1)>=EXTERN && input.LA(1)<=PRIVATE) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set19));
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
    // Haxe.g:95:1: qualifiedIdentifier : (a= IDENTIFIER -> $a) ( DOT ident= IDENTIFIER -> ^( DOT $qualifiedIdentifier $ident) )* ;
    public final HaxeParser.qualifiedIdentifier_return qualifiedIdentifier() throws RecognitionException {
        HaxeParser.qualifiedIdentifier_return retval = new HaxeParser.qualifiedIdentifier_return();
        retval.start = input.LT(1);
        int qualifiedIdentifier_StartIndex = input.index();
        Object root_0 = null;

        Token a=null;
        Token ident=null;
        Token DOT20=null;

        Object a_tree=null;
        Object ident_tree=null;
        Object DOT20_tree=null;
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return retval; }
            // Haxe.g:96:2: ( (a= IDENTIFIER -> $a) ( DOT ident= IDENTIFIER -> ^( DOT $qualifiedIdentifier $ident) )* )
            // Haxe.g:96:4: (a= IDENTIFIER -> $a) ( DOT ident= IDENTIFIER -> ^( DOT $qualifiedIdentifier $ident) )*
            {
            // Haxe.g:96:4: (a= IDENTIFIER -> $a)
            // Haxe.g:96:5: a= IDENTIFIER
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
            // 96:19: -> $a
            {
                adaptor.addChild(root_0, stream_a.nextNode());

            }

            retval.tree = root_0;}
            }

            // Haxe.g:96:29: ( DOT ident= IDENTIFIER -> ^( DOT $qualifiedIdentifier $ident) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==DOT) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // Haxe.g:96:30: DOT ident= IDENTIFIER
            	    {
            	    DOT20=(Token)match(input,DOT,FOLLOW_DOT_in_qualifiedIdentifier294); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_DOT.add(DOT20);

            	    ident=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_qualifiedIdentifier298); if (state.failed) return retval; 
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
            	    // 96:52: -> ^( DOT $qualifiedIdentifier $ident)
            	    {
            	        // Haxe.g:96:56: ^( DOT $qualifiedIdentifier $ident)
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
            	    break loop8;
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
    // Haxe.g:99:1: myImport : ( IMPORT dotIdent SEMI | USING dotIdent SEMI );
    public final HaxeParser.myImport_return myImport() throws RecognitionException {
        HaxeParser.myImport_return retval = new HaxeParser.myImport_return();
        retval.start = input.LT(1);
        int myImport_StartIndex = input.index();
        Object root_0 = null;

        Token IMPORT21=null;
        Token SEMI23=null;
        Token USING24=null;
        Token SEMI26=null;
        HaxeParser.dotIdent_return dotIdent22 = null;

        HaxeParser.dotIdent_return dotIdent25 = null;


        Object IMPORT21_tree=null;
        Object SEMI23_tree=null;
        Object USING24_tree=null;
        Object SEMI26_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return retval; }
            // Haxe.g:100:2: ( IMPORT dotIdent SEMI | USING dotIdent SEMI )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==IMPORT) ) {
                alt9=1;
            }
            else if ( (LA9_0==USING) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // Haxe.g:100:4: IMPORT dotIdent SEMI
                    {
                    root_0 = (Object)adaptor.nil();

                    IMPORT21=(Token)match(input,IMPORT,FOLLOW_IMPORT_in_myImport327); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IMPORT21_tree = (Object)adaptor.create(IMPORT21);
                    root_0 = (Object)adaptor.becomeRoot(IMPORT21_tree, root_0);
                    }
                    pushFollow(FOLLOW_dotIdent_in_myImport330);
                    dotIdent22=dotIdent();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dotIdent22.getTree());
                    SEMI23=(Token)match(input,SEMI,FOLLOW_SEMI_in_myImport332); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // Haxe.g:101:4: USING dotIdent SEMI
                    {
                    root_0 = (Object)adaptor.nil();

                    USING24=(Token)match(input,USING,FOLLOW_USING_in_myImport338); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    USING24_tree = (Object)adaptor.create(USING24);
                    root_0 = (Object)adaptor.becomeRoot(USING24_tree, root_0);
                    }
                    pushFollow(FOLLOW_dotIdent_in_myImport341);
                    dotIdent25=dotIdent();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dotIdent25.getTree());
                    SEMI26=(Token)match(input,SEMI,FOLLOW_SEMI_in_myImport343); if (state.failed) return retval;

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
    // Haxe.g:105:1: access : ( PUBLIC | PRIVATE );
    public final HaxeParser.access_return access() throws RecognitionException {
        HaxeParser.access_return retval = new HaxeParser.access_return();
        retval.start = input.LT(1);
        int access_StartIndex = input.index();
        Object root_0 = null;

        Token set27=null;

        Object set27_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return retval; }
            // Haxe.g:106:2: ( PUBLIC | PRIVATE )
            // Haxe.g:
            {
            root_0 = (Object)adaptor.nil();

            set27=(Token)input.LT(1);
            if ( input.LA(1)==PRIVATE||input.LA(1)==PUBLIC ) {
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
    // Haxe.g:110:1: declAttr : ( STATIC | INLINE | DYNAMIC | OVERRIDE | access );
    public final HaxeParser.declAttr_return declAttr() throws RecognitionException {
        HaxeParser.declAttr_return retval = new HaxeParser.declAttr_return();
        retval.start = input.LT(1);
        int declAttr_StartIndex = input.index();
        Object root_0 = null;

        Token STATIC28=null;
        Token INLINE29=null;
        Token DYNAMIC30=null;
        Token OVERRIDE31=null;
        HaxeParser.access_return access32 = null;


        Object STATIC28_tree=null;
        Object INLINE29_tree=null;
        Object DYNAMIC30_tree=null;
        Object OVERRIDE31_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return retval; }
            // Haxe.g:111:2: ( STATIC | INLINE | DYNAMIC | OVERRIDE | access )
            int alt10=5;
            switch ( input.LA(1) ) {
            case STATIC:
                {
                alt10=1;
                }
                break;
            case INLINE:
                {
                alt10=2;
                }
                break;
            case DYNAMIC:
                {
                alt10=3;
                }
                break;
            case OVERRIDE:
                {
                alt10=4;
                }
                break;
            case PRIVATE:
            case PUBLIC:
                {
                alt10=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // Haxe.g:111:4: STATIC
                    {
                    root_0 = (Object)adaptor.nil();

                    STATIC28=(Token)match(input,STATIC,FOLLOW_STATIC_in_declAttr392); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STATIC28_tree = (Object)adaptor.create(STATIC28);
                    adaptor.addChild(root_0, STATIC28_tree);
                    }

                    }
                    break;
                case 2 :
                    // Haxe.g:112:4: INLINE
                    {
                    root_0 = (Object)adaptor.nil();

                    INLINE29=(Token)match(input,INLINE,FOLLOW_INLINE_in_declAttr397); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INLINE29_tree = (Object)adaptor.create(INLINE29);
                    adaptor.addChild(root_0, INLINE29_tree);
                    }

                    }
                    break;
                case 3 :
                    // Haxe.g:113:4: DYNAMIC
                    {
                    root_0 = (Object)adaptor.nil();

                    DYNAMIC30=(Token)match(input,DYNAMIC,FOLLOW_DYNAMIC_in_declAttr402); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DYNAMIC30_tree = (Object)adaptor.create(DYNAMIC30);
                    adaptor.addChild(root_0, DYNAMIC30_tree);
                    }

                    }
                    break;
                case 4 :
                    // Haxe.g:114:4: OVERRIDE
                    {
                    root_0 = (Object)adaptor.nil();

                    OVERRIDE31=(Token)match(input,OVERRIDE,FOLLOW_OVERRIDE_in_declAttr407); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    OVERRIDE31_tree = (Object)adaptor.create(OVERRIDE31);
                    adaptor.addChild(root_0, OVERRIDE31_tree);
                    }

                    }
                    break;
                case 5 :
                    // Haxe.g:115:4: access
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_access_in_declAttr412);
                    access32=access();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, access32.getTree());

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
    // Haxe.g:118:1: declAttrList : ( declAttr )+ -> ^( DECL_ATTR_LIST[\"DECL_ATTR_LIST\", true] ( declAttr )+ ) ;
    public final HaxeParser.declAttrList_return declAttrList() throws RecognitionException {
        HaxeParser.declAttrList_return retval = new HaxeParser.declAttrList_return();
        retval.start = input.LT(1);
        int declAttrList_StartIndex = input.index();
        Object root_0 = null;

        HaxeParser.declAttr_return declAttr33 = null;


        RewriteRuleSubtreeStream stream_declAttr=new RewriteRuleSubtreeStream(adaptor,"rule declAttr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return retval; }
            // Haxe.g:119:2: ( ( declAttr )+ -> ^( DECL_ATTR_LIST[\"DECL_ATTR_LIST\", true] ( declAttr )+ ) )
            // Haxe.g:119:4: ( declAttr )+
            {
            // Haxe.g:119:4: ( declAttr )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==PRIVATE||(LA11_0>=PUBLIC && LA11_0<=OVERRIDE)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // Haxe.g:119:5: declAttr
            	    {
            	    pushFollow(FOLLOW_declAttr_in_declAttrList424);
            	    declAttr33=declAttr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_declAttr.add(declAttr33.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
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
            // 119:16: -> ^( DECL_ATTR_LIST[\"DECL_ATTR_LIST\", true] ( declAttr )+ )
            {
                // Haxe.g:119:19: ^( DECL_ATTR_LIST[\"DECL_ATTR_LIST\", true] ( declAttr )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new HaxeTree(DECL_ATTR_LIST, "DECL_ATTR_LIST", true), root_1);

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
    // Haxe.g:122:1: paramList : ( param ( COMMA param )* -> ^( PARAM_LIST[\"PARAM_LIST\", true] ( param )+ ) | );
    public final HaxeParser.paramList_return paramList() throws RecognitionException {
        HaxeParser.paramList_return retval = new HaxeParser.paramList_return();
        retval.start = input.LT(1);
        int paramList_StartIndex = input.index();
        Object root_0 = null;

        Token COMMA35=null;
        HaxeParser.param_return param34 = null;

        HaxeParser.param_return param36 = null;


        Object COMMA35_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_param=new RewriteRuleSubtreeStream(adaptor,"rule param");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return retval; }
            // Haxe.g:123:2: ( param ( COMMA param )* -> ^( PARAM_LIST[\"PARAM_LIST\", true] ( param )+ ) | )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==IDENTIFIER||LA13_0==QUES) ) {
                alt13=1;
            }
            else if ( (LA13_0==RPAREN) ) {
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
                    // Haxe.g:123:4: param ( COMMA param )*
                    {
                    pushFollow(FOLLOW_param_in_paramList450);
                    param34=param();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_param.add(param34.getTree());
                    // Haxe.g:123:10: ( COMMA param )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==COMMA) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // Haxe.g:123:11: COMMA param
                    	    {
                    	    COMMA35=(Token)match(input,COMMA,FOLLOW_COMMA_in_paramList453); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA35);

                    	    pushFollow(FOLLOW_param_in_paramList455);
                    	    param36=param();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_param.add(param36.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop12;
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
                    // 123:25: -> ^( PARAM_LIST[\"PARAM_LIST\", true] ( param )+ )
                    {
                        // Haxe.g:123:28: ^( PARAM_LIST[\"PARAM_LIST\", true] ( param )+ )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new HaxeTree(PARAM_LIST, "PARAM_LIST", true), root_1);

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
                    // Haxe.g:125:2: 
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
    // Haxe.g:127:1: param : ( QUES )? IDENTIFIER typeTagOpt varInit -> ^( VAR[$IDENTIFIER, true] ( IDENTIFIER )? ( typeTagOpt )? ( varInit )? ( QUES )? ) ;
    public final HaxeParser.param_return param() throws RecognitionException {
        HaxeParser.param_return retval = new HaxeParser.param_return();
        retval.start = input.LT(1);
        int param_StartIndex = input.index();
        Object root_0 = null;

        Token QUES37=null;
        Token IDENTIFIER38=null;
        HaxeParser.typeTagOpt_return typeTagOpt39 = null;

        HaxeParser.varInit_return varInit40 = null;


        Object QUES37_tree=null;
        Object IDENTIFIER38_tree=null;
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_QUES=new RewriteRuleTokenStream(adaptor,"token QUES");
        RewriteRuleSubtreeStream stream_typeTagOpt=new RewriteRuleSubtreeStream(adaptor,"rule typeTagOpt");
        RewriteRuleSubtreeStream stream_varInit=new RewriteRuleSubtreeStream(adaptor,"rule varInit");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return retval; }
            // Haxe.g:128:2: ( ( QUES )? IDENTIFIER typeTagOpt varInit -> ^( VAR[$IDENTIFIER, true] ( IDENTIFIER )? ( typeTagOpt )? ( varInit )? ( QUES )? ) )
            // Haxe.g:128:4: ( QUES )? IDENTIFIER typeTagOpt varInit
            {
            // Haxe.g:128:4: ( QUES )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==QUES) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // Haxe.g:0:0: QUES
                    {
                    QUES37=(Token)match(input,QUES,FOLLOW_QUES_in_param485); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_QUES.add(QUES37);


                    }
                    break;

            }

            IDENTIFIER38=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_param488); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER38);

            pushFollow(FOLLOW_typeTagOpt_in_param490);
            typeTagOpt39=typeTagOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeTagOpt.add(typeTagOpt39.getTree());
            pushFollow(FOLLOW_varInit_in_param492);
            varInit40=varInit();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_varInit.add(varInit40.getTree());


            // AST REWRITE
            // elements: typeTagOpt, QUES, varInit, IDENTIFIER
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 128:40: -> ^( VAR[$IDENTIFIER, true] ( IDENTIFIER )? ( typeTagOpt )? ( varInit )? ( QUES )? )
            {
                // Haxe.g:128:43: ^( VAR[$IDENTIFIER, true] ( IDENTIFIER )? ( typeTagOpt )? ( varInit )? ( QUES )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new VarDeclaration(VAR, IDENTIFIER38, true), root_1);

                // Haxe.g:128:84: ( IDENTIFIER )?
                if ( stream_IDENTIFIER.hasNext() ) {
                    adaptor.addChild(root_1, new VarUsage(stream_IDENTIFIER.nextToken()));

                }
                stream_IDENTIFIER.reset();
                // Haxe.g:128:106: ( typeTagOpt )?
                if ( stream_typeTagOpt.hasNext() ) {
                    adaptor.addChild(root_1, stream_typeTagOpt.nextTree());

                }
                stream_typeTagOpt.reset();
                // Haxe.g:128:118: ( varInit )?
                if ( stream_varInit.hasNext() ) {
                    adaptor.addChild(root_1, stream_varInit.nextTree());

                }
                stream_varInit.reset();
                // Haxe.g:128:127: ( QUES )?
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
    // Haxe.g:131:1: id : ( IDENTIFIER | THIS );
    public final HaxeParser.id_return id() throws RecognitionException {
        HaxeParser.id_return retval = new HaxeParser.id_return();
        retval.start = input.LT(1);
        int id_StartIndex = input.index();
        Object root_0 = null;

        Token set41=null;

        Object set41_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return retval; }
            // Haxe.g:131:4: ( IDENTIFIER | THIS )
            // Haxe.g:
            {
            root_0 = (Object)adaptor.nil();

            set41=(Token)input.LT(1);
            if ( input.LA(1)==IDENTIFIER||input.LA(1)==THIS ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set41));
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
    // Haxe.g:135:1: dotIdent : ( id -> id ) ( DOT ident= id -> ^( DOT $dotIdent $ident) )* ;
    public final HaxeParser.dotIdent_return dotIdent() throws RecognitionException {
        HaxeParser.dotIdent_return retval = new HaxeParser.dotIdent_return();
        retval.start = input.LT(1);
        int dotIdent_StartIndex = input.index();
        Object root_0 = null;

        Token DOT43=null;
        HaxeParser.id_return ident = null;

        HaxeParser.id_return id42 = null;


        Object DOT43_tree=null;
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return retval; }
            // Haxe.g:135:9: ( ( id -> id ) ( DOT ident= id -> ^( DOT $dotIdent $ident) )* )
            // Haxe.g:135:11: ( id -> id ) ( DOT ident= id -> ^( DOT $dotIdent $ident) )*
            {
            // Haxe.g:135:11: ( id -> id )
            // Haxe.g:135:12: id
            {
            pushFollow(FOLLOW_id_in_dotIdent547);
            id42=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_id.add(id42.getTree());


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
            // 135:15: -> id
            {
                adaptor.addChild(root_0, stream_id.nextTree());

            }

            retval.tree = root_0;}
            }

            // Haxe.g:135:22: ( DOT ident= id -> ^( DOT $dotIdent $ident) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==DOT) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // Haxe.g:135:23: DOT ident= id
            	    {
            	    DOT43=(Token)match(input,DOT,FOLLOW_DOT_in_dotIdent555); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_DOT.add(DOT43);

            	    pushFollow(FOLLOW_id_in_dotIdent559);
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
            	    // 135:36: -> ^( DOT $dotIdent $ident)
            	    {
            	        // Haxe.g:135:39: ^( DOT $dotIdent $ident)
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
            	    break loop15;
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
    // Haxe.g:138:1: assignOp : ( EQ -> EQ[$EQ] | PLUSEQ -> PLUSEQ[$PLUSEQ] | SUBEQ -> SUBEQ[$SUBEQ] | SLASHEQ -> SLASHEQ[$SLASHEQ] | PERCENTEQ -> PERCENTEQ[$PERCENTEQ] | AMPEQ -> AMPEQ[$AMPEQ] );
    public final HaxeParser.assignOp_return assignOp() throws RecognitionException {
        HaxeParser.assignOp_return retval = new HaxeParser.assignOp_return();
        retval.start = input.LT(1);
        int assignOp_StartIndex = input.index();
        Object root_0 = null;

        Token EQ44=null;
        Token PLUSEQ45=null;
        Token SUBEQ46=null;
        Token SLASHEQ47=null;
        Token PERCENTEQ48=null;
        Token AMPEQ49=null;

        Object EQ44_tree=null;
        Object PLUSEQ45_tree=null;
        Object SUBEQ46_tree=null;
        Object SLASHEQ47_tree=null;
        Object PERCENTEQ48_tree=null;
        Object AMPEQ49_tree=null;
        RewriteRuleTokenStream stream_SUBEQ=new RewriteRuleTokenStream(adaptor,"token SUBEQ");
        RewriteRuleTokenStream stream_SLASHEQ=new RewriteRuleTokenStream(adaptor,"token SLASHEQ");
        RewriteRuleTokenStream stream_PERCENTEQ=new RewriteRuleTokenStream(adaptor,"token PERCENTEQ");
        RewriteRuleTokenStream stream_EQ=new RewriteRuleTokenStream(adaptor,"token EQ");
        RewriteRuleTokenStream stream_AMPEQ=new RewriteRuleTokenStream(adaptor,"token AMPEQ");
        RewriteRuleTokenStream stream_PLUSEQ=new RewriteRuleTokenStream(adaptor,"token PLUSEQ");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return retval; }
            // Haxe.g:139:2: ( EQ -> EQ[$EQ] | PLUSEQ -> PLUSEQ[$PLUSEQ] | SUBEQ -> SUBEQ[$SUBEQ] | SLASHEQ -> SLASHEQ[$SLASHEQ] | PERCENTEQ -> PERCENTEQ[$PERCENTEQ] | AMPEQ -> AMPEQ[$AMPEQ] )
            int alt16=6;
            switch ( input.LA(1) ) {
            case EQ:
                {
                alt16=1;
                }
                break;
            case PLUSEQ:
                {
                alt16=2;
                }
                break;
            case SUBEQ:
                {
                alt16=3;
                }
                break;
            case SLASHEQ:
                {
                alt16=4;
                }
                break;
            case PERCENTEQ:
                {
                alt16=5;
                }
                break;
            case AMPEQ:
                {
                alt16=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // Haxe.g:139:4: EQ
                    {
                    EQ44=(Token)match(input,EQ,FOLLOW_EQ_in_assignOp585); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EQ.add(EQ44);



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
                    // 139:8: -> EQ[$EQ]
                    {
                        adaptor.addChild(root_0, new AssignOperationNode(EQ, EQ44));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // Haxe.g:140:4: PLUSEQ
                    {
                    PLUSEQ45=(Token)match(input,PLUSEQ,FOLLOW_PLUSEQ_in_assignOp599); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PLUSEQ.add(PLUSEQ45);



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
                    // 140:12: -> PLUSEQ[$PLUSEQ]
                    {
                        adaptor.addChild(root_0, new AssignOperationNode(PLUSEQ, PLUSEQ45));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // Haxe.g:141:4: SUBEQ
                    {
                    SUBEQ46=(Token)match(input,SUBEQ,FOLLOW_SUBEQ_in_assignOp613); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SUBEQ.add(SUBEQ46);



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
                    // 141:10: -> SUBEQ[$SUBEQ]
                    {
                        adaptor.addChild(root_0, new AssignOperationNode(SUBEQ, SUBEQ46));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // Haxe.g:142:4: SLASHEQ
                    {
                    SLASHEQ47=(Token)match(input,SLASHEQ,FOLLOW_SLASHEQ_in_assignOp626); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SLASHEQ.add(SLASHEQ47);



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
                    // 142:12: -> SLASHEQ[$SLASHEQ]
                    {
                        adaptor.addChild(root_0, new AssignOperationNode(SLASHEQ, SLASHEQ47));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // Haxe.g:143:4: PERCENTEQ
                    {
                    PERCENTEQ48=(Token)match(input,PERCENTEQ,FOLLOW_PERCENTEQ_in_assignOp639); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PERCENTEQ.add(PERCENTEQ48);



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
                        adaptor.addChild(root_0, new AssignOperationNode(PERCENTEQ, PERCENTEQ48));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    // Haxe.g:144:4: AMPEQ
                    {
                    AMPEQ49=(Token)match(input,AMPEQ,FOLLOW_AMPEQ_in_assignOp652); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AMPEQ.add(AMPEQ49);



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
                    // 144:10: -> AMPEQ[$AMPEQ]
                    {
                        adaptor.addChild(root_0, new AssignOperationNode(AMPEQ, AMPEQ49));

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
    // Haxe.g:148:1: funcLit : FUNCTION LPAREN paramList RPAREN ( typeTagOpt )? block -> ^( FUNCTION ( paramList )? ( typeTagOpt )? ( block )? ) ;
    public final HaxeParser.funcLit_return funcLit() throws RecognitionException {
        HaxeParser.funcLit_return retval = new HaxeParser.funcLit_return();
        retval.start = input.LT(1);
        int funcLit_StartIndex = input.index();
        Object root_0 = null;

        Token FUNCTION50=null;
        Token LPAREN51=null;
        Token RPAREN53=null;
        HaxeParser.paramList_return paramList52 = null;

        HaxeParser.typeTagOpt_return typeTagOpt54 = null;

        HaxeParser.block_return block55 = null;


        Object FUNCTION50_tree=null;
        Object LPAREN51_tree=null;
        Object RPAREN53_tree=null;
        RewriteRuleTokenStream stream_FUNCTION=new RewriteRuleTokenStream(adaptor,"token FUNCTION");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_paramList=new RewriteRuleSubtreeStream(adaptor,"rule paramList");
        RewriteRuleSubtreeStream stream_typeTagOpt=new RewriteRuleSubtreeStream(adaptor,"rule typeTagOpt");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return retval; }
            // Haxe.g:148:8: ( FUNCTION LPAREN paramList RPAREN ( typeTagOpt )? block -> ^( FUNCTION ( paramList )? ( typeTagOpt )? ( block )? ) )
            // Haxe.g:148:10: FUNCTION LPAREN paramList RPAREN ( typeTagOpt )? block
            {
            FUNCTION50=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcLit671); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION50);

            LPAREN51=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcLit673); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN51);

            pushFollow(FOLLOW_paramList_in_funcLit675);
            paramList52=paramList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_paramList.add(paramList52.getTree());
            RPAREN53=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcLit677); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN53);

            // Haxe.g:148:43: ( typeTagOpt )?
            int alt17=2;
            switch ( input.LA(1) ) {
                case COLON:
                    {
                    alt17=1;
                    }
                    break;
                case LBRACE:
                    {
                    int LA17_2 = input.LA(2);

                    if ( (synpred28_Haxe()) ) {
                        alt17=1;
                    }
                    }
                    break;
                case SEMI:
                    {
                    int LA17_3 = input.LA(2);

                    if ( (synpred28_Haxe()) ) {
                        alt17=1;
                    }
                    }
                    break;
            }

            switch (alt17) {
                case 1 :
                    // Haxe.g:0:0: typeTagOpt
                    {
                    pushFollow(FOLLOW_typeTagOpt_in_funcLit679);
                    typeTagOpt54=typeTagOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeTagOpt.add(typeTagOpt54.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_block_in_funcLit682);
            block55=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block55.getTree());


            // AST REWRITE
            // elements: block, typeTagOpt, FUNCTION, paramList
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 148:61: -> ^( FUNCTION ( paramList )? ( typeTagOpt )? ( block )? )
            {
                // Haxe.g:148:64: ^( FUNCTION ( paramList )? ( typeTagOpt )? ( block )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new FunctionNode(stream_FUNCTION.nextToken()), root_1);

                // Haxe.g:148:89: ( paramList )?
                if ( stream_paramList.hasNext() ) {
                    adaptor.addChild(root_1, stream_paramList.nextTree());

                }
                stream_paramList.reset();
                // Haxe.g:148:100: ( typeTagOpt )?
                if ( stream_typeTagOpt.hasNext() ) {
                    adaptor.addChild(root_1, stream_typeTagOpt.nextTree());

                }
                stream_typeTagOpt.reset();
                // Haxe.g:148:112: ( block )?
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
    // Haxe.g:150:1: arrayLit : LBRACKET exprListOpt RBRACKET ;
    public final HaxeParser.arrayLit_return arrayLit() throws RecognitionException {
        HaxeParser.arrayLit_return retval = new HaxeParser.arrayLit_return();
        retval.start = input.LT(1);
        int arrayLit_StartIndex = input.index();
        Object root_0 = null;

        Token LBRACKET56=null;
        Token RBRACKET58=null;
        HaxeParser.exprListOpt_return exprListOpt57 = null;


        Object LBRACKET56_tree=null;
        Object RBRACKET58_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return retval; }
            // Haxe.g:150:18: ( LBRACKET exprListOpt RBRACKET )
            // Haxe.g:150:20: LBRACKET exprListOpt RBRACKET
            {
            root_0 = (Object)adaptor.nil();

            LBRACKET56=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_arrayLit717); if (state.failed) return retval;
            pushFollow(FOLLOW_exprListOpt_in_arrayLit720);
            exprListOpt57=exprListOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, exprListOpt57.getTree());
            RBRACKET58=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_arrayLit722); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // Haxe.g:178:1: typeTag : COLON funcType ;
    public final HaxeParser.typeTag_return typeTag() throws RecognitionException {
        HaxeParser.typeTag_return retval = new HaxeParser.typeTag_return();
        retval.start = input.LT(1);
        int typeTag_StartIndex = input.index();
        Object root_0 = null;

        Token COLON59=null;
        HaxeParser.funcType_return funcType60 = null;


        Object COLON59_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return retval; }
            // Haxe.g:178:9: ( COLON funcType )
            // Haxe.g:178:11: COLON funcType
            {
            root_0 = (Object)adaptor.nil();

            COLON59=(Token)match(input,COLON,FOLLOW_COLON_in_typeTag741); if (state.failed) return retval;
            pushFollow(FOLLOW_funcType_in_typeTag744);
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
    // Haxe.g:181:1: typeTagOpt : ( typeTag -> ^( TYPE_TAG[\"TYPE_TAG\",true] ( typeTag )? ) | );
    public final HaxeParser.typeTagOpt_return typeTagOpt() throws RecognitionException {
        HaxeParser.typeTagOpt_return retval = new HaxeParser.typeTagOpt_return();
        retval.start = input.LT(1);
        int typeTagOpt_StartIndex = input.index();
        Object root_0 = null;

        HaxeParser.typeTag_return typeTag61 = null;


        RewriteRuleSubtreeStream stream_typeTag=new RewriteRuleSubtreeStream(adaptor,"rule typeTag");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return retval; }
            // Haxe.g:182:2: ( typeTag -> ^( TYPE_TAG[\"TYPE_TAG\",true] ( typeTag )? ) | )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==COLON) ) {
                alt18=1;
            }
            else if ( (LA18_0==EOF||LA18_0==SEMI||LA18_0==RPAREN||LA18_0==COMMA||LA18_0==EQ||LA18_0==LBRACE) ) {
                alt18=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // Haxe.g:182:4: typeTag
                    {
                    pushFollow(FOLLOW_typeTag_in_typeTagOpt756);
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
                    // 182:12: -> ^( TYPE_TAG[\"TYPE_TAG\",true] ( typeTag )? )
                    {
                        // Haxe.g:182:15: ^( TYPE_TAG[\"TYPE_TAG\",true] ( typeTag )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new HaxeTree(TYPE_TAG, "TYPE_TAG", true), root_1);

                        // Haxe.g:182:53: ( typeTag )?
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
                    // Haxe.g:184:2: 
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
    // Haxe.g:186:1: typeList : ( type ( COMMA type )* | typeConstraint ( COMMA typeConstraint )* );
    public final HaxeParser.typeList_return typeList() throws RecognitionException {
        HaxeParser.typeList_return retval = new HaxeParser.typeList_return();
        retval.start = input.LT(1);
        int typeList_StartIndex = input.index();
        Object root_0 = null;

        Token COMMA63=null;
        Token COMMA66=null;
        HaxeParser.type_return type62 = null;

        HaxeParser.type_return type64 = null;

        HaxeParser.typeConstraint_return typeConstraint65 = null;

        HaxeParser.typeConstraint_return typeConstraint67 = null;


        Object COMMA63_tree=null;
        Object COMMA66_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return retval; }
            // Haxe.g:186:9: ( type ( COMMA type )* | typeConstraint ( COMMA typeConstraint )* )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RPAREN||LA21_0==DYNAMIC||LA21_0==COMMA||LA21_0==THIS||(LA21_0>=VOID && LA21_0<=GTGTGT)||LA21_0==LBRACE) ) {
                alt21=1;
            }
            else if ( (LA21_0==IDENTIFIER) ) {
                int LA21_2 = input.LA(2);

                if ( (LA21_2==COLON) ) {
                    alt21=2;
                }
                else if ( (LA21_2==RPAREN||LA21_2==DOT||LA21_2==COMMA||(LA21_2>=LT && LA21_2<=GTGTGT)) ) {
                    alt21=1;
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
                    // Haxe.g:186:11: type ( COMMA type )*
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_type_in_typeList782);
                    type62=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, type62.getTree());
                    // Haxe.g:186:16: ( COMMA type )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==COMMA) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // Haxe.g:186:17: COMMA type
                    	    {
                    	    COMMA63=(Token)match(input,COMMA,FOLLOW_COMMA_in_typeList785); if (state.failed) return retval;
                    	    pushFollow(FOLLOW_type_in_typeList788);
                    	    type64=type();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, type64.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // Haxe.g:187:4: typeConstraint ( COMMA typeConstraint )*
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_typeConstraint_in_typeList796);
                    typeConstraint65=typeConstraint();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeConstraint65.getTree());
                    // Haxe.g:187:19: ( COMMA typeConstraint )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==COMMA) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // Haxe.g:187:20: COMMA typeConstraint
                    	    {
                    	    COMMA66=(Token)match(input,COMMA,FOLLOW_COMMA_in_typeList799); if (state.failed) return retval;
                    	    pushFollow(FOLLOW_typeConstraint_in_typeList802);
                    	    typeConstraint67=typeConstraint();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeConstraint67.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop20;
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
    // Haxe.g:190:1: funcType : ( ( type ) ( MINUS_BIGGER type )* | VOID );
    public final HaxeParser.funcType_return funcType() throws RecognitionException {
        HaxeParser.funcType_return retval = new HaxeParser.funcType_return();
        retval.start = input.LT(1);
        int funcType_StartIndex = input.index();
        Object root_0 = null;

        Token MINUS_BIGGER69=null;
        Token VOID71=null;
        HaxeParser.type_return type68 = null;

        HaxeParser.type_return type70 = null;


        Object MINUS_BIGGER69_tree=null;
        Object VOID71_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return retval; }
            // Haxe.g:190:9: ( ( type ) ( MINUS_BIGGER type )* | VOID )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==EOF||(LA23_0>=SEMI && LA23_0<=MONKEYS_AT)||(LA23_0>=RPAREN && LA23_0<=IDENTIFIER)||(LA23_0>=EXTERN && LA23_0<=PRIVATE)||(LA23_0>=IMPORT && LA23_0<=USING)||LA23_0==DYNAMIC||LA23_0==COMMA||(LA23_0>=THIS && LA23_0<=EQ)||LA23_0==MINUS_BIGGER||(LA23_0>=INT && LA23_0<=BOOLEAN)||(LA23_0>=LBRACE && LA23_0<=RBRACE)||LA23_0==ENUM||(LA23_0>=CLASS && LA23_0<=INTERFACE)||LA23_0==TYPEDEF) ) {
                alt23=1;
            }
            else if ( (LA23_0==VOID) ) {
                int LA23_2 = input.LA(2);

                if ( (synpred34_Haxe()) ) {
                    alt23=1;
                }
                else if ( (true) ) {
                    alt23=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 23, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // Haxe.g:190:11: ( type ) ( MINUS_BIGGER type )*
                    {
                    root_0 = (Object)adaptor.nil();

                    // Haxe.g:190:11: ( type )
                    // Haxe.g:190:12: type
                    {
                    pushFollow(FOLLOW_type_in_funcType817);
                    type68=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, type68.getTree());

                    }

                    // Haxe.g:190:18: ( MINUS_BIGGER type )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==MINUS_BIGGER) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // Haxe.g:190:19: MINUS_BIGGER type
                    	    {
                    	    MINUS_BIGGER69=(Token)match(input,MINUS_BIGGER,FOLLOW_MINUS_BIGGER_in_funcType821); if (state.failed) return retval;
                    	    pushFollow(FOLLOW_type_in_funcType824);
                    	    type70=type();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, type70.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // Haxe.g:191:4: VOID
                    {
                    root_0 = (Object)adaptor.nil();

                    VOID71=(Token)match(input,VOID,FOLLOW_VOID_in_funcType831); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    VOID71_tree = (Object)adaptor.create(VOID71);
                    adaptor.addChild(root_0, VOID71_tree);
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
    // Haxe.g:194:1: primitiveType : ( INT | FLOAT | DYNAMIC | BOOLEAN | VOID );
    public final HaxeParser.primitiveType_return primitiveType() throws RecognitionException {
        HaxeParser.primitiveType_return retval = new HaxeParser.primitiveType_return();
        retval.start = input.LT(1);
        int primitiveType_StartIndex = input.index();
        Object root_0 = null;

        Token set72=null;

        Object set72_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return retval; }
            // Haxe.g:195:2: ( INT | FLOAT | DYNAMIC | BOOLEAN | VOID )
            // Haxe.g:
            {
            root_0 = (Object)adaptor.nil();

            set72=(Token)input.LT(1);
            if ( input.LA(1)==DYNAMIC||(input.LA(1)>=VOID && input.LA(1)<=BOOLEAN) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set72));
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
    // Haxe.g:198:1: type : ( ( anonType | dotIdent | primitiveType ) ( typeParam )* | );
    public final HaxeParser.type_return type() throws RecognitionException {
        HaxeParser.type_return retval = new HaxeParser.type_return();
        retval.start = input.LT(1);
        int type_StartIndex = input.index();
        Object root_0 = null;

        HaxeParser.anonType_return anonType73 = null;

        HaxeParser.dotIdent_return dotIdent74 = null;

        HaxeParser.primitiveType_return primitiveType75 = null;

        HaxeParser.typeParam_return typeParam76 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return retval; }
            // Haxe.g:198:6: ( ( anonType | dotIdent | primitiveType ) ( typeParam )* | )
            int alt26=2;
            alt26 = dfa26.predict(input);
            switch (alt26) {
                case 1 :
                    // Haxe.g:198:8: ( anonType | dotIdent | primitiveType ) ( typeParam )*
                    {
                    root_0 = (Object)adaptor.nil();

                    // Haxe.g:198:8: ( anonType | dotIdent | primitiveType )
                    int alt24=3;
                    switch ( input.LA(1) ) {
                    case LBRACE:
                        {
                        alt24=1;
                        }
                        break;
                    case IDENTIFIER:
                    case THIS:
                        {
                        alt24=2;
                        }
                        break;
                    case DYNAMIC:
                    case VOID:
                    case INT:
                    case FLOAT:
                    case BOOLEAN:
                        {
                        alt24=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 24, 0, input);

                        throw nvae;
                    }

                    switch (alt24) {
                        case 1 :
                            // Haxe.g:198:9: anonType
                            {
                            pushFollow(FOLLOW_anonType_in_type870);
                            anonType73=anonType();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, anonType73.getTree());

                            }
                            break;
                        case 2 :
                            // Haxe.g:198:20: dotIdent
                            {
                            pushFollow(FOLLOW_dotIdent_in_type874);
                            dotIdent74=dotIdent();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, dotIdent74.getTree());

                            }
                            break;
                        case 3 :
                            // Haxe.g:198:31: primitiveType
                            {
                            pushFollow(FOLLOW_primitiveType_in_type878);
                            primitiveType75=primitiveType();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveType75.getTree());

                            }
                            break;

                    }

                    // Haxe.g:198:47: ( typeParam )*
                    loop25:
                    do {
                        int alt25=2;
                        alt25 = dfa25.predict(input);
                        switch (alt25) {
                    	case 1 :
                    	    // Haxe.g:198:48: typeParam
                    	    {
                    	    pushFollow(FOLLOW_typeParam_in_type883);
                    	    typeParam76=typeParam();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeParam76.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // Haxe.g:200:2: 
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
    // Haxe.g:202:1: typeParam : ( LT typeList GT | LT typeList LT typeList GTGT | LT typeList LT typeList LT typeList GTGTGT );
    public final HaxeParser.typeParam_return typeParam() throws RecognitionException {
        HaxeParser.typeParam_return retval = new HaxeParser.typeParam_return();
        retval.start = input.LT(1);
        int typeParam_StartIndex = input.index();
        Object root_0 = null;

        Token LT77=null;
        Token GT79=null;
        Token LT80=null;
        Token LT82=null;
        Token GTGT84=null;
        Token LT85=null;
        Token LT87=null;
        Token LT89=null;
        Token GTGTGT91=null;
        HaxeParser.typeList_return typeList78 = null;

        HaxeParser.typeList_return typeList81 = null;

        HaxeParser.typeList_return typeList83 = null;

        HaxeParser.typeList_return typeList86 = null;

        HaxeParser.typeList_return typeList88 = null;

        HaxeParser.typeList_return typeList90 = null;


        Object LT77_tree=null;
        Object GT79_tree=null;
        Object LT80_tree=null;
        Object LT82_tree=null;
        Object GTGT84_tree=null;
        Object LT85_tree=null;
        Object LT87_tree=null;
        Object LT89_tree=null;
        Object GTGTGT91_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return retval; }
            // Haxe.g:203:2: ( LT typeList GT | LT typeList LT typeList GTGT | LT typeList LT typeList LT typeList GTGTGT )
            int alt27=3;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==LT) ) {
                int LA27_1 = input.LA(2);

                if ( (synpred43_Haxe()) ) {
                    alt27=1;
                }
                else if ( (synpred44_Haxe()) ) {
                    alt27=2;
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
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // Haxe.g:203:4: LT typeList GT
                    {
                    root_0 = (Object)adaptor.nil();

                    LT77=(Token)match(input,LT,FOLLOW_LT_in_typeParam901); if (state.failed) return retval;
                    pushFollow(FOLLOW_typeList_in_typeParam904);
                    typeList78=typeList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeList78.getTree());
                    GT79=(Token)match(input,GT,FOLLOW_GT_in_typeParam906); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // Haxe.g:204:4: LT typeList LT typeList GTGT
                    {
                    root_0 = (Object)adaptor.nil();

                    LT80=(Token)match(input,LT,FOLLOW_LT_in_typeParam912); if (state.failed) return retval;
                    pushFollow(FOLLOW_typeList_in_typeParam915);
                    typeList81=typeList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeList81.getTree());
                    LT82=(Token)match(input,LT,FOLLOW_LT_in_typeParam917); if (state.failed) return retval;
                    pushFollow(FOLLOW_typeList_in_typeParam920);
                    typeList83=typeList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeList83.getTree());
                    GTGT84=(Token)match(input,GTGT,FOLLOW_GTGT_in_typeParam922); if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // Haxe.g:205:4: LT typeList LT typeList LT typeList GTGTGT
                    {
                    root_0 = (Object)adaptor.nil();

                    LT85=(Token)match(input,LT,FOLLOW_LT_in_typeParam928); if (state.failed) return retval;
                    pushFollow(FOLLOW_typeList_in_typeParam931);
                    typeList86=typeList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeList86.getTree());
                    LT87=(Token)match(input,LT,FOLLOW_LT_in_typeParam933); if (state.failed) return retval;
                    pushFollow(FOLLOW_typeList_in_typeParam936);
                    typeList88=typeList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeList88.getTree());
                    LT89=(Token)match(input,LT,FOLLOW_LT_in_typeParam938); if (state.failed) return retval;
                    pushFollow(FOLLOW_typeList_in_typeParam941);
                    typeList90=typeList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeList90.getTree());
                    GTGTGT91=(Token)match(input,GTGTGT,FOLLOW_GTGTGT_in_typeParam943); if (state.failed) return retval;

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
    // Haxe.g:209:1: typeParamOpt : ( typeParam -> ^( TYPE_PARAM_OPT[\"TYPE_PARAM_OPT\",true] ( typeParam )? ) | );
    public final HaxeParser.typeParamOpt_return typeParamOpt() throws RecognitionException {
        HaxeParser.typeParamOpt_return retval = new HaxeParser.typeParamOpt_return();
        retval.start = input.LT(1);
        int typeParamOpt_StartIndex = input.index();
        Object root_0 = null;

        HaxeParser.typeParam_return typeParam92 = null;


        RewriteRuleSubtreeStream stream_typeParam=new RewriteRuleSubtreeStream(adaptor,"rule typeParam");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return retval; }
            // Haxe.g:210:2: ( typeParam -> ^( TYPE_PARAM_OPT[\"TYPE_PARAM_OPT\",true] ( typeParam )? ) | )
            int alt28=2;
            alt28 = dfa28.predict(input);
            switch (alt28) {
                case 1 :
                    // Haxe.g:210:4: typeParam
                    {
                    pushFollow(FOLLOW_typeParam_in_typeParamOpt963);
                    typeParam92=typeParam();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeParam.add(typeParam92.getTree());


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
                    // 210:14: -> ^( TYPE_PARAM_OPT[\"TYPE_PARAM_OPT\",true] ( typeParam )? )
                    {
                        // Haxe.g:210:17: ^( TYPE_PARAM_OPT[\"TYPE_PARAM_OPT\",true] ( typeParam )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new HaxeTree(TYPE_PARAM_OPT, "TYPE_PARAM_OPT", true), root_1);

                        // Haxe.g:210:67: ( typeParam )?
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
                    // Haxe.g:212:2: 
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
    // Haxe.g:214:1: typeConstraint : IDENTIFIER COLON LPAREN typeList RPAREN -> ^( $typeConstraint ( IDENTIFIER )? ( typeList )? ) ;
    public final HaxeParser.typeConstraint_return typeConstraint() throws RecognitionException {
        HaxeParser.typeConstraint_return retval = new HaxeParser.typeConstraint_return();
        retval.start = input.LT(1);
        int typeConstraint_StartIndex = input.index();
        Object root_0 = null;

        Token IDENTIFIER93=null;
        Token COLON94=null;
        Token LPAREN95=null;
        Token RPAREN97=null;
        HaxeParser.typeList_return typeList96 = null;


        Object IDENTIFIER93_tree=null;
        Object COLON94_tree=null;
        Object LPAREN95_tree=null;
        Object RPAREN97_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_typeList=new RewriteRuleSubtreeStream(adaptor,"rule typeList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return retval; }
            // Haxe.g:215:2: ( IDENTIFIER COLON LPAREN typeList RPAREN -> ^( $typeConstraint ( IDENTIFIER )? ( typeList )? ) )
            // Haxe.g:215:4: IDENTIFIER COLON LPAREN typeList RPAREN
            {
            IDENTIFIER93=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_typeConstraint998); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER93);

            COLON94=(Token)match(input,COLON,FOLLOW_COLON_in_typeConstraint1000); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COLON.add(COLON94);

            LPAREN95=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_typeConstraint1002); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN95);

            pushFollow(FOLLOW_typeList_in_typeConstraint1004);
            typeList96=typeList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeList.add(typeList96.getTree());
            RPAREN97=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_typeConstraint1006); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN97);



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
            // 215:44: -> ^( $typeConstraint ( IDENTIFIER )? ( typeList )? )
            {
                // Haxe.g:215:47: ^( $typeConstraint ( IDENTIFIER )? ( typeList )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_retval.nextNode(), root_1);

                // Haxe.g:215:65: ( IDENTIFIER )?
                if ( stream_IDENTIFIER.hasNext() ) {
                    adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());

                }
                stream_IDENTIFIER.reset();
                // Haxe.g:215:77: ( typeList )?
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
    // Haxe.g:219:1: functionReturn : ( declAttrList )? FUNCTION NEW LPAREN paramList RPAREN typeTagOpt block -> ^( FUNCTION NEW ( declAttrList )? ( paramList )? ( typeTagOpt )? ( block )? ) ;
    public final HaxeParser.functionReturn_return functionReturn() throws RecognitionException {
        HaxeParser.functionReturn_return retval = new HaxeParser.functionReturn_return();
        retval.start = input.LT(1);
        int functionReturn_StartIndex = input.index();
        Object root_0 = null;

        Token FUNCTION99=null;
        Token NEW100=null;
        Token LPAREN101=null;
        Token RPAREN103=null;
        HaxeParser.declAttrList_return declAttrList98 = null;

        HaxeParser.paramList_return paramList102 = null;

        HaxeParser.typeTagOpt_return typeTagOpt104 = null;

        HaxeParser.block_return block105 = null;


        Object FUNCTION99_tree=null;
        Object NEW100_tree=null;
        Object LPAREN101_tree=null;
        Object RPAREN103_tree=null;
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
            // Haxe.g:220:2: ( ( declAttrList )? FUNCTION NEW LPAREN paramList RPAREN typeTagOpt block -> ^( FUNCTION NEW ( declAttrList )? ( paramList )? ( typeTagOpt )? ( block )? ) )
            // Haxe.g:220:4: ( declAttrList )? FUNCTION NEW LPAREN paramList RPAREN typeTagOpt block
            {
            // Haxe.g:220:4: ( declAttrList )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==PRIVATE||(LA29_0>=PUBLIC && LA29_0<=OVERRIDE)) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // Haxe.g:0:0: declAttrList
                    {
                    pushFollow(FOLLOW_declAttrList_in_functionReturn1032);
                    declAttrList98=declAttrList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declAttrList.add(declAttrList98.getTree());

                    }
                    break;

            }

            FUNCTION99=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_functionReturn1035); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION99);

            NEW100=(Token)match(input,NEW,FOLLOW_NEW_in_functionReturn1037); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_NEW.add(NEW100);

            LPAREN101=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_functionReturn1039); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN101);

            pushFollow(FOLLOW_paramList_in_functionReturn1041);
            paramList102=paramList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_paramList.add(paramList102.getTree());
            RPAREN103=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_functionReturn1043); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN103);

            pushFollow(FOLLOW_typeTagOpt_in_functionReturn1045);
            typeTagOpt104=typeTagOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeTagOpt.add(typeTagOpt104.getTree());
            pushFollow(FOLLOW_block_in_functionReturn1047);
            block105=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block105.getTree());


            // AST REWRITE
            // elements: NEW, declAttrList, block, paramList, typeTagOpt, FUNCTION
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 220:72: -> ^( FUNCTION NEW ( declAttrList )? ( paramList )? ( typeTagOpt )? ( block )? )
            {
                // Haxe.g:220:75: ^( FUNCTION NEW ( declAttrList )? ( paramList )? ( typeTagOpt )? ( block )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new FunctionNode(stream_FUNCTION.nextToken()), root_1);

                adaptor.addChild(root_1, stream_NEW.nextNode());
                // Haxe.g:220:104: ( declAttrList )?
                if ( stream_declAttrList.hasNext() ) {
                    adaptor.addChild(root_1, stream_declAttrList.nextTree());

                }
                stream_declAttrList.reset();
                // Haxe.g:220:118: ( paramList )?
                if ( stream_paramList.hasNext() ) {
                    adaptor.addChild(root_1, stream_paramList.nextTree());

                }
                stream_paramList.reset();
                // Haxe.g:220:129: ( typeTagOpt )?
                if ( stream_typeTagOpt.hasNext() ) {
                    adaptor.addChild(root_1, stream_typeTagOpt.nextTree());

                }
                stream_typeTagOpt.reset();
                // Haxe.g:220:141: ( block )?
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
    // Haxe.g:223:1: statement : ( block | assignExpr SEMI | varDecl | IF parExpression st1= statement ( ELSE st2= statement )? -> ^( IF parExpression $st1 ( ^( ELSE $st2) )? ) | FOR LPAREN exp1= expr IN exp2= expr RPAREN statement -> ^( FOR ^( IN $exp1 $exp2) ( statement )? ) | WHILE parExpression statement -> ^( WHILE ( parExpression )? ( statement )? ) | DO statement WHILE parExpression SEMI -> ^( DO ( parExpression )? ( statement )? ) | TRY block catchStmtList -> ^( TRY ( block )? ( catchStmtList )? ) | SWITCH LPAREN expr RPAREN LBRACE ( caseStmt )+ RBRACE -> ^( SWITCH ( expr )? ( caseStmt )+ ) | RETURN ( expr )? SEMI -> ^( RETURN ( expr )? ) | THROW expr SEMI -> ^( THROW ( expr )? ) | BREAK ( IDENTIFIER )? SEMI -> ^( BREAK ( IDENTIFIER )? ) | CONTINUE ( IDENTIFIER )? SEMI -> ^( CONTINUE ( IDENTIFIER )? ) | expr SEMI | IDENTIFIER COLON statement -> ^( COLON ( IDENTIFIER )? ( statement )? ) | SEMI );
    public final HaxeParser.statement_return statement() throws RecognitionException {
        HaxeParser.statement_return retval = new HaxeParser.statement_return();
        retval.start = input.LT(1);
        int statement_StartIndex = input.index();
        Object root_0 = null;

        Token SEMI108=null;
        Token IF110=null;
        Token ELSE112=null;
        Token FOR113=null;
        Token LPAREN114=null;
        Token IN115=null;
        Token RPAREN116=null;
        Token WHILE118=null;
        Token DO121=null;
        Token WHILE123=null;
        Token SEMI125=null;
        Token TRY126=null;
        Token SWITCH129=null;
        Token LPAREN130=null;
        Token RPAREN132=null;
        Token LBRACE133=null;
        Token RBRACE135=null;
        Token RETURN136=null;
        Token SEMI138=null;
        Token THROW139=null;
        Token SEMI141=null;
        Token BREAK142=null;
        Token IDENTIFIER143=null;
        Token SEMI144=null;
        Token CONTINUE145=null;
        Token IDENTIFIER146=null;
        Token SEMI147=null;
        Token SEMI149=null;
        Token IDENTIFIER150=null;
        Token COLON151=null;
        Token SEMI153=null;
        HaxeParser.statement_return st1 = null;

        HaxeParser.statement_return st2 = null;

        HaxeParser.expr_return exp1 = null;

        HaxeParser.expr_return exp2 = null;

        HaxeParser.block_return block106 = null;

        HaxeParser.assignExpr_return assignExpr107 = null;

        HaxeParser.varDecl_return varDecl109 = null;

        HaxeParser.parExpression_return parExpression111 = null;

        HaxeParser.statement_return statement117 = null;

        HaxeParser.parExpression_return parExpression119 = null;

        HaxeParser.statement_return statement120 = null;

        HaxeParser.statement_return statement122 = null;

        HaxeParser.parExpression_return parExpression124 = null;

        HaxeParser.block_return block127 = null;

        HaxeParser.catchStmtList_return catchStmtList128 = null;

        HaxeParser.expr_return expr131 = null;

        HaxeParser.caseStmt_return caseStmt134 = null;

        HaxeParser.expr_return expr137 = null;

        HaxeParser.expr_return expr140 = null;

        HaxeParser.expr_return expr148 = null;

        HaxeParser.statement_return statement152 = null;


        Object SEMI108_tree=null;
        Object IF110_tree=null;
        Object ELSE112_tree=null;
        Object FOR113_tree=null;
        Object LPAREN114_tree=null;
        Object IN115_tree=null;
        Object RPAREN116_tree=null;
        Object WHILE118_tree=null;
        Object DO121_tree=null;
        Object WHILE123_tree=null;
        Object SEMI125_tree=null;
        Object TRY126_tree=null;
        Object SWITCH129_tree=null;
        Object LPAREN130_tree=null;
        Object RPAREN132_tree=null;
        Object LBRACE133_tree=null;
        Object RBRACE135_tree=null;
        Object RETURN136_tree=null;
        Object SEMI138_tree=null;
        Object THROW139_tree=null;
        Object SEMI141_tree=null;
        Object BREAK142_tree=null;
        Object IDENTIFIER143_tree=null;
        Object SEMI144_tree=null;
        Object CONTINUE145_tree=null;
        Object IDENTIFIER146_tree=null;
        Object SEMI147_tree=null;
        Object SEMI149_tree=null;
        Object IDENTIFIER150_tree=null;
        Object COLON151_tree=null;
        Object SEMI153_tree=null;
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
            // Haxe.g:224:2: ( block | assignExpr SEMI | varDecl | IF parExpression st1= statement ( ELSE st2= statement )? -> ^( IF parExpression $st1 ( ^( ELSE $st2) )? ) | FOR LPAREN exp1= expr IN exp2= expr RPAREN statement -> ^( FOR ^( IN $exp1 $exp2) ( statement )? ) | WHILE parExpression statement -> ^( WHILE ( parExpression )? ( statement )? ) | DO statement WHILE parExpression SEMI -> ^( DO ( parExpression )? ( statement )? ) | TRY block catchStmtList -> ^( TRY ( block )? ( catchStmtList )? ) | SWITCH LPAREN expr RPAREN LBRACE ( caseStmt )+ RBRACE -> ^( SWITCH ( expr )? ( caseStmt )+ ) | RETURN ( expr )? SEMI -> ^( RETURN ( expr )? ) | THROW expr SEMI -> ^( THROW ( expr )? ) | BREAK ( IDENTIFIER )? SEMI -> ^( BREAK ( IDENTIFIER )? ) | CONTINUE ( IDENTIFIER )? SEMI -> ^( CONTINUE ( IDENTIFIER )? ) | expr SEMI | IDENTIFIER COLON statement -> ^( COLON ( IDENTIFIER )? ( statement )? ) | SEMI )
            int alt35=16;
            alt35 = dfa35.predict(input);
            switch (alt35) {
                case 1 :
                    // Haxe.g:224:4: block
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_block_in_statement1084);
                    block106=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, block106.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:225:4: assignExpr SEMI
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_assignExpr_in_statement1089);
                    assignExpr107=assignExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignExpr107.getTree());
                    SEMI108=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement1091); if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // Haxe.g:226:4: varDecl
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_varDecl_in_statement1097);
                    varDecl109=varDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDecl109.getTree());

                    }
                    break;
                case 4 :
                    // Haxe.g:227:4: IF parExpression st1= statement ( ELSE st2= statement )?
                    {
                    IF110=(Token)match(input,IF,FOLLOW_IF_in_statement1102); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IF.add(IF110);

                    pushFollow(FOLLOW_parExpression_in_statement1104);
                    parExpression111=parExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_parExpression.add(parExpression111.getTree());
                    pushFollow(FOLLOW_statement_in_statement1108);
                    st1=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(st1.getTree());
                    // Haxe.g:227:35: ( ELSE st2= statement )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==ELSE) ) {
                        int LA30_1 = input.LA(2);

                        if ( (synpred50_Haxe()) ) {
                            alt30=1;
                        }
                    }
                    switch (alt30) {
                        case 1 :
                            // Haxe.g:227:36: ELSE st2= statement
                            {
                            ELSE112=(Token)match(input,ELSE,FOLLOW_ELSE_in_statement1111); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_ELSE.add(ELSE112);

                            pushFollow(FOLLOW_statement_in_statement1115);
                            st2=statement();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_statement.add(st2.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: st2, ELSE, parExpression, IF, st1
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
                    // 227:58: -> ^( IF parExpression $st1 ( ^( ELSE $st2) )? )
                    {
                        // Haxe.g:227:61: ^( IF parExpression $st1 ( ^( ELSE $st2) )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new IfNode(stream_IF.nextToken()), root_1);

                        adaptor.addChild(root_1, stream_parExpression.nextTree());
                        adaptor.addChild(root_1, stream_st1.nextTree());
                        // Haxe.g:227:93: ( ^( ELSE $st2) )?
                        if ( stream_st2.hasNext()||stream_ELSE.hasNext() ) {
                            // Haxe.g:227:93: ^( ELSE $st2)
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
                    // Haxe.g:228:4: FOR LPAREN exp1= expr IN exp2= expr RPAREN statement
                    {
                    FOR113=(Token)match(input,FOR,FOLLOW_FOR_in_statement1155); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FOR.add(FOR113);

                    LPAREN114=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_statement1157); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN114);

                    pushFollow(FOLLOW_expr_in_statement1161);
                    exp1=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(exp1.getTree());
                    IN115=(Token)match(input,IN,FOLLOW_IN_in_statement1163); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IN.add(IN115);

                    pushFollow(FOLLOW_expr_in_statement1167);
                    exp2=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(exp2.getTree());
                    RPAREN116=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_statement1169); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN116);

                    pushFollow(FOLLOW_statement_in_statement1171);
                    statement117=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement117.getTree());


                    // AST REWRITE
                    // elements: exp2, exp1, statement, IN, FOR
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
                    // 228:56: -> ^( FOR ^( IN $exp1 $exp2) ( statement )? )
                    {
                        // Haxe.g:228:59: ^( FOR ^( IN $exp1 $exp2) ( statement )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new ForNode(stream_FOR.nextToken()), root_1);

                        // Haxe.g:228:74: ^( IN $exp1 $exp2)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_IN.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_exp1.nextTree());
                        adaptor.addChild(root_2, stream_exp2.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // Haxe.g:228:92: ( statement )?
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
                    // Haxe.g:229:4: WHILE parExpression statement
                    {
                    WHILE118=(Token)match(input,WHILE,FOLLOW_WHILE_in_statement1199); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHILE.add(WHILE118);

                    pushFollow(FOLLOW_parExpression_in_statement1201);
                    parExpression119=parExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_parExpression.add(parExpression119.getTree());
                    pushFollow(FOLLOW_statement_in_statement1203);
                    statement120=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement120.getTree());


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
                    // 229:38: -> ^( WHILE ( parExpression )? ( statement )? )
                    {
                        // Haxe.g:229:41: ^( WHILE ( parExpression )? ( statement )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new WhileNode(stream_WHILE.nextToken()), root_1);

                        // Haxe.g:229:60: ( parExpression )?
                        if ( stream_parExpression.hasNext() ) {
                            adaptor.addChild(root_1, stream_parExpression.nextTree());

                        }
                        stream_parExpression.reset();
                        // Haxe.g:229:75: ( statement )?
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
                    // Haxe.g:230:4: DO statement WHILE parExpression SEMI
                    {
                    DO121=(Token)match(input,DO,FOLLOW_DO_in_statement1227); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DO.add(DO121);

                    pushFollow(FOLLOW_statement_in_statement1229);
                    statement122=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement122.getTree());
                    WHILE123=(Token)match(input,WHILE,FOLLOW_WHILE_in_statement1231); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHILE.add(WHILE123);

                    pushFollow(FOLLOW_parExpression_in_statement1233);
                    parExpression124=parExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_parExpression.add(parExpression124.getTree());
                    SEMI125=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement1235); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI125);



                    // AST REWRITE
                    // elements: DO, parExpression, statement
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 230:45: -> ^( DO ( parExpression )? ( statement )? )
                    {
                        // Haxe.g:230:48: ^( DO ( parExpression )? ( statement )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new DoWhileNode(stream_DO.nextToken()), root_1);

                        // Haxe.g:230:66: ( parExpression )?
                        if ( stream_parExpression.hasNext() ) {
                            adaptor.addChild(root_1, stream_parExpression.nextTree());

                        }
                        stream_parExpression.reset();
                        // Haxe.g:230:81: ( statement )?
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
                    // Haxe.g:231:4: TRY block catchStmtList
                    {
                    TRY126=(Token)match(input,TRY,FOLLOW_TRY_in_statement1258); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TRY.add(TRY126);

                    pushFollow(FOLLOW_block_in_statement1260);
                    block127=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block127.getTree());
                    pushFollow(FOLLOW_catchStmtList_in_statement1262);
                    catchStmtList128=catchStmtList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_catchStmtList.add(catchStmtList128.getTree());


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
                    // 231:32: -> ^( TRY ( block )? ( catchStmtList )? )
                    {
                        // Haxe.g:231:35: ^( TRY ( block )? ( catchStmtList )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new TryNode(stream_TRY.nextToken()), root_1);

                        // Haxe.g:231:50: ( block )?
                        if ( stream_block.hasNext() ) {
                            adaptor.addChild(root_1, stream_block.nextTree());

                        }
                        stream_block.reset();
                        // Haxe.g:231:57: ( catchStmtList )?
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
                    // Haxe.g:232:4: SWITCH LPAREN expr RPAREN LBRACE ( caseStmt )+ RBRACE
                    {
                    SWITCH129=(Token)match(input,SWITCH,FOLLOW_SWITCH_in_statement1286); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SWITCH.add(SWITCH129);

                    LPAREN130=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_statement1288); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN130);

                    pushFollow(FOLLOW_expr_in_statement1290);
                    expr131=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr131.getTree());
                    RPAREN132=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_statement1292); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN132);

                    LBRACE133=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_statement1294); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LBRACE.add(LBRACE133);

                    // Haxe.g:232:37: ( caseStmt )+
                    int cnt31=0;
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( ((LA31_0>=CASE && LA31_0<=DEFAULT)) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // Haxe.g:0:0: caseStmt
                    	    {
                    	    pushFollow(FOLLOW_caseStmt_in_statement1296);
                    	    caseStmt134=caseStmt();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_caseStmt.add(caseStmt134.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt31 >= 1 ) break loop31;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(31, input);
                                throw eee;
                        }
                        cnt31++;
                    } while (true);

                    RBRACE135=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_statement1299); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RBRACE.add(RBRACE135);



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
                    // 232:55: -> ^( SWITCH ( expr )? ( caseStmt )+ )
                    {
                        // Haxe.g:232:58: ^( SWITCH ( expr )? ( caseStmt )+ )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new SwitchNode(stream_SWITCH.nextToken()), root_1);

                        // Haxe.g:232:79: ( expr )?
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
                    // Haxe.g:233:4: RETURN ( expr )? SEMI
                    {
                    RETURN136=(Token)match(input,RETURN,FOLLOW_RETURN_in_statement1320); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RETURN.add(RETURN136);

                    // Haxe.g:233:11: ( expr )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==LPAREN||LA32_0==IDENTIFIER||(LA32_0>=QUES && LA32_0<=LBRACKET)||(LA32_0>=LT && LA32_0<=GT)||(LA32_0>=GTGTGT && LA32_0<=NEW)||LA32_0==LBRACE||(LA32_0>=UNTYPED && LA32_0<=CAST)||(LA32_0>=LONGLITERAL && LA32_0<=FALSE)) ) {
                        alt32=1;
                    }
                    else if ( (LA32_0==SEMI) ) {
                        int LA32_2 = input.LA(2);

                        if ( (synpred58_Haxe()) ) {
                            alt32=1;
                        }
                    }
                    switch (alt32) {
                        case 1 :
                            // Haxe.g:233:12: expr
                            {
                            pushFollow(FOLLOW_expr_in_statement1323);
                            expr137=expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expr.add(expr137.getTree());

                            }
                            break;

                    }

                    SEMI138=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement1327); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI138);



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
                    // 233:28: -> ^( RETURN ( expr )? )
                    {
                        // Haxe.g:233:31: ^( RETURN ( expr )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_RETURN.nextNode(), root_1);

                        // Haxe.g:233:40: ( expr )?
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
                    // Haxe.g:234:4: THROW expr SEMI
                    {
                    THROW139=(Token)match(input,THROW,FOLLOW_THROW_in_statement1345); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THROW.add(THROW139);

                    pushFollow(FOLLOW_expr_in_statement1347);
                    expr140=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr140.getTree());
                    SEMI141=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement1349); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI141);



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
                    // 234:25: -> ^( THROW ( expr )? )
                    {
                        // Haxe.g:234:28: ^( THROW ( expr )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_THROW.nextNode(), root_1);

                        // Haxe.g:234:36: ( expr )?
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
                    // Haxe.g:235:4: BREAK ( IDENTIFIER )? SEMI
                    {
                    BREAK142=(Token)match(input,BREAK,FOLLOW_BREAK_in_statement1368); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_BREAK.add(BREAK142);

                    // Haxe.g:235:10: ( IDENTIFIER )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==IDENTIFIER) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // Haxe.g:235:11: IDENTIFIER
                            {
                            IDENTIFIER143=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_statement1371); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER143);


                            }
                            break;

                    }

                    SEMI144=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement1375); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI144);



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
                    // 235:32: -> ^( BREAK ( IDENTIFIER )? )
                    {
                        // Haxe.g:235:35: ^( BREAK ( IDENTIFIER )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_BREAK.nextNode(), root_1);

                        // Haxe.g:235:43: ( IDENTIFIER )?
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
                    // Haxe.g:236:4: CONTINUE ( IDENTIFIER )? SEMI
                    {
                    CONTINUE145=(Token)match(input,CONTINUE,FOLLOW_CONTINUE_in_statement1392); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CONTINUE.add(CONTINUE145);

                    // Haxe.g:236:13: ( IDENTIFIER )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==IDENTIFIER) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // Haxe.g:236:14: IDENTIFIER
                            {
                            IDENTIFIER146=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_statement1395); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER146);


                            }
                            break;

                    }

                    SEMI147=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement1399); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI147);



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
                    // 236:36: -> ^( CONTINUE ( IDENTIFIER )? )
                    {
                        // Haxe.g:236:39: ^( CONTINUE ( IDENTIFIER )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_CONTINUE.nextNode(), root_1);

                        // Haxe.g:236:50: ( IDENTIFIER )?
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
                    // Haxe.g:237:4: expr SEMI
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_expr_in_statement1417);
                    expr148=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr148.getTree());
                    SEMI149=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement1420); if (state.failed) return retval;

                    }
                    break;
                case 15 :
                    // Haxe.g:238:4: IDENTIFIER COLON statement
                    {
                    IDENTIFIER150=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_statement1426); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER150);

                    COLON151=(Token)match(input,COLON,FOLLOW_COLON_in_statement1428); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(COLON151);

                    pushFollow(FOLLOW_statement_in_statement1430);
                    statement152=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement152.getTree());


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
                    // 238:35: -> ^( COLON ( IDENTIFIER )? ( statement )? )
                    {
                        // Haxe.g:238:38: ^( COLON ( IDENTIFIER )? ( statement )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_COLON.nextNode(), root_1);

                        // Haxe.g:238:46: ( IDENTIFIER )?
                        if ( stream_IDENTIFIER.hasNext() ) {
                            adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());

                        }
                        stream_IDENTIFIER.reset();
                        // Haxe.g:238:58: ( statement )?
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
                    // Haxe.g:239:4: SEMI
                    {
                    root_0 = (Object)adaptor.nil();

                    SEMI153=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement1451); if (state.failed) return retval;

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
    // Haxe.g:242:1: parExpression : LPAREN expr RPAREN ;
    public final HaxeParser.parExpression_return parExpression() throws RecognitionException {
        HaxeParser.parExpression_return retval = new HaxeParser.parExpression_return();
        retval.start = input.LT(1);
        int parExpression_StartIndex = input.index();
        Object root_0 = null;

        Token LPAREN154=null;
        Token RPAREN156=null;
        HaxeParser.expr_return expr155 = null;


        Object LPAREN154_tree=null;
        Object RPAREN156_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return retval; }
            // Haxe.g:243:2: ( LPAREN expr RPAREN )
            // Haxe.g:243:6: LPAREN expr RPAREN
            {
            root_0 = (Object)adaptor.nil();

            LPAREN154=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_parExpression1469); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LPAREN154_tree = (Object)adaptor.create(LPAREN154);
            adaptor.addChild(root_0, LPAREN154_tree);
            }
            pushFollow(FOLLOW_expr_in_parExpression1471);
            expr155=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr155.getTree());
            RPAREN156=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_parExpression1473); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            RPAREN156_tree = (Object)adaptor.create(RPAREN156);
            adaptor.addChild(root_0, RPAREN156_tree);
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
    // Haxe.g:246:1: block : ( LBRACE ( blockStmt )* RBRACE -> ^( BLOCK_SCOPE[\"BLOCK_SCOPE\", true, $LBRACE] ( blockStmt )* RBRACE[$RBRACE, true] ) | SEMI );
    public final HaxeParser.block_return block() throws RecognitionException {
        HaxeParser.block_return retval = new HaxeParser.block_return();
        retval.start = input.LT(1);
        int block_StartIndex = input.index();
        Object root_0 = null;

        Token LBRACE157=null;
        Token RBRACE159=null;
        Token SEMI160=null;
        HaxeParser.blockStmt_return blockStmt158 = null;


        Object LBRACE157_tree=null;
        Object RBRACE159_tree=null;
        Object SEMI160_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_blockStmt=new RewriteRuleSubtreeStream(adaptor,"rule blockStmt");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return retval; }
            // Haxe.g:246:8: ( LBRACE ( blockStmt )* RBRACE -> ^( BLOCK_SCOPE[\"BLOCK_SCOPE\", true, $LBRACE] ( blockStmt )* RBRACE[$RBRACE, true] ) | SEMI )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==LBRACE) ) {
                alt37=1;
            }
            else if ( (LA37_0==SEMI) ) {
                alt37=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // Haxe.g:246:10: LBRACE ( blockStmt )* RBRACE
                    {
                    LBRACE157=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_block1484); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LBRACE.add(LBRACE157);

                    // Haxe.g:246:17: ( blockStmt )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( ((LA36_0>=SEMI && LA36_0<=LPAREN)||LA36_0==IDENTIFIER||(LA36_0>=EXTERN && LA36_0<=PRIVATE)||(LA36_0>=PUBLIC && LA36_0<=OVERRIDE)||(LA36_0>=QUES && LA36_0<=LBRACKET)||(LA36_0>=LT && LA36_0<=GT)||(LA36_0>=GTGTGT && LA36_0<=IF)||LA36_0==FOR||(LA36_0>=WHILE && LA36_0<=LBRACE)||(LA36_0>=RETURN && LA36_0<=CONTINUE)||(LA36_0>=UNTYPED && LA36_0<=CAST)||(LA36_0>=VAR && LA36_0<=CLASS)||(LA36_0>=LONGLITERAL && LA36_0<=FALSE)) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // Haxe.g:246:18: blockStmt
                    	    {
                    	    pushFollow(FOLLOW_blockStmt_in_block1487);
                    	    blockStmt158=blockStmt();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_blockStmt.add(blockStmt158.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop36;
                        }
                    } while (true);

                    RBRACE159=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_block1491); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RBRACE.add(RBRACE159);



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
                    // 246:37: -> ^( BLOCK_SCOPE[\"BLOCK_SCOPE\", true, $LBRACE] ( blockStmt )* RBRACE[$RBRACE, true] )
                    {
                        // Haxe.g:246:40: ^( BLOCK_SCOPE[\"BLOCK_SCOPE\", true, $LBRACE] ( blockStmt )* RBRACE[$RBRACE, true] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new BlockScopeNode(BLOCK_SCOPE, "BLOCK_SCOPE", true, LBRACE157), root_1);

                        // Haxe.g:246:100: ( blockStmt )*
                        while ( stream_blockStmt.hasNext() ) {
                            adaptor.addChild(root_1, stream_blockStmt.nextTree());

                        }
                        stream_blockStmt.reset();
                        adaptor.addChild(root_1, new HaxeTree(RBRACE, RBRACE159, true));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // Haxe.g:247:4: SEMI
                    {
                    root_0 = (Object)adaptor.nil();

                    SEMI160=(Token)match(input,SEMI,FOLLOW_SEMI_in_block1516); if (state.failed) return retval;

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
    // Haxe.g:250:1: blockStmt : ( varDecl | classDecl | statement );
    public final HaxeParser.blockStmt_return blockStmt() throws RecognitionException {
        HaxeParser.blockStmt_return retval = new HaxeParser.blockStmt_return();
        retval.start = input.LT(1);
        int blockStmt_StartIndex = input.index();
        Object root_0 = null;

        HaxeParser.varDecl_return varDecl161 = null;

        HaxeParser.classDecl_return classDecl162 = null;

        HaxeParser.statement_return statement163 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return retval; }
            // Haxe.g:251:2: ( varDecl | classDecl | statement )
            int alt38=3;
            alt38 = dfa38.predict(input);
            switch (alt38) {
                case 1 :
                    // Haxe.g:251:4: varDecl
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_varDecl_in_blockStmt1529);
                    varDecl161=varDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDecl161.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:252:4: classDecl
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_classDecl_in_blockStmt1534);
                    classDecl162=classDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, classDecl162.getTree());

                    }
                    break;
                case 3 :
                    // Haxe.g:253:4: statement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_statement_in_blockStmt1539);
                    statement163=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement163.getTree());

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
    // Haxe.g:257:1: breakStmt : BREAK SEMI ;
    public final HaxeParser.breakStmt_return breakStmt() throws RecognitionException {
        HaxeParser.breakStmt_return retval = new HaxeParser.breakStmt_return();
        retval.start = input.LT(1);
        int breakStmt_StartIndex = input.index();
        Object root_0 = null;

        Token BREAK164=null;
        Token SEMI165=null;

        Object BREAK164_tree=null;
        Object SEMI165_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return retval; }
            // Haxe.g:258:2: ( BREAK SEMI )
            // Haxe.g:258:4: BREAK SEMI
            {
            root_0 = (Object)adaptor.nil();

            BREAK164=(Token)match(input,BREAK,FOLLOW_BREAK_in_breakStmt1572); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            BREAK164_tree = (Object)adaptor.create(BREAK164);
            adaptor.addChild(root_0, BREAK164_tree);
            }
            SEMI165=(Token)match(input,SEMI,FOLLOW_SEMI_in_breakStmt1574); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // Haxe.g:261:1: continueStmt : CONTINUE SEMI ;
    public final HaxeParser.continueStmt_return continueStmt() throws RecognitionException {
        HaxeParser.continueStmt_return retval = new HaxeParser.continueStmt_return();
        retval.start = input.LT(1);
        int continueStmt_StartIndex = input.index();
        Object root_0 = null;

        Token CONTINUE166=null;
        Token SEMI167=null;

        Object CONTINUE166_tree=null;
        Object SEMI167_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return retval; }
            // Haxe.g:262:2: ( CONTINUE SEMI )
            // Haxe.g:262:4: CONTINUE SEMI
            {
            root_0 = (Object)adaptor.nil();

            CONTINUE166=(Token)match(input,CONTINUE,FOLLOW_CONTINUE_in_continueStmt1593); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            CONTINUE166_tree = (Object)adaptor.create(CONTINUE166);
            adaptor.addChild(root_0, CONTINUE166_tree);
            }
            SEMI167=(Token)match(input,SEMI,FOLLOW_SEMI_in_continueStmt1595); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // Haxe.g:265:1: caseStmt : ( CASE exprList COLON statement -> ^( CASE ( exprList )? ( statement )? ) | DEFAULT COLON statement -> ^( DEFAULT ( statement )? ) );
    public final HaxeParser.caseStmt_return caseStmt() throws RecognitionException {
        HaxeParser.caseStmt_return retval = new HaxeParser.caseStmt_return();
        retval.start = input.LT(1);
        int caseStmt_StartIndex = input.index();
        Object root_0 = null;

        Token CASE168=null;
        Token COLON170=null;
        Token DEFAULT172=null;
        Token COLON173=null;
        HaxeParser.exprList_return exprList169 = null;

        HaxeParser.statement_return statement171 = null;

        HaxeParser.statement_return statement174 = null;


        Object CASE168_tree=null;
        Object COLON170_tree=null;
        Object DEFAULT172_tree=null;
        Object COLON173_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_DEFAULT=new RewriteRuleTokenStream(adaptor,"token DEFAULT");
        RewriteRuleTokenStream stream_CASE=new RewriteRuleTokenStream(adaptor,"token CASE");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_exprList=new RewriteRuleSubtreeStream(adaptor,"rule exprList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return retval; }
            // Haxe.g:265:9: ( CASE exprList COLON statement -> ^( CASE ( exprList )? ( statement )? ) | DEFAULT COLON statement -> ^( DEFAULT ( statement )? ) )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==CASE) ) {
                alt39=1;
            }
            else if ( (LA39_0==DEFAULT) ) {
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
                    // Haxe.g:265:11: CASE exprList COLON statement
                    {
                    CASE168=(Token)match(input,CASE,FOLLOW_CASE_in_caseStmt1606); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CASE.add(CASE168);

                    pushFollow(FOLLOW_exprList_in_caseStmt1608);
                    exprList169=exprList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_exprList.add(exprList169.getTree());
                    COLON170=(Token)match(input,COLON,FOLLOW_COLON_in_caseStmt1610); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(COLON170);

                    pushFollow(FOLLOW_statement_in_caseStmt1612);
                    statement171=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement171.getTree());


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
                    // 265:42: -> ^( CASE ( exprList )? ( statement )? )
                    {
                        // Haxe.g:265:45: ^( CASE ( exprList )? ( statement )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_CASE.nextNode(), root_1);

                        // Haxe.g:265:52: ( exprList )?
                        if ( stream_exprList.hasNext() ) {
                            adaptor.addChild(root_1, stream_exprList.nextTree());

                        }
                        stream_exprList.reset();
                        // Haxe.g:265:62: ( statement )?
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
                    // Haxe.g:266:4: DEFAULT COLON statement
                    {
                    DEFAULT172=(Token)match(input,DEFAULT,FOLLOW_DEFAULT_in_caseStmt1630); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DEFAULT.add(DEFAULT172);

                    COLON173=(Token)match(input,COLON,FOLLOW_COLON_in_caseStmt1632); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(COLON173);

                    pushFollow(FOLLOW_statement_in_caseStmt1634);
                    statement174=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement174.getTree());


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
                    // 266:29: -> ^( DEFAULT ( statement )? )
                    {
                        // Haxe.g:266:32: ^( DEFAULT ( statement )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_DEFAULT.nextNode(), root_1);

                        // Haxe.g:266:42: ( statement )?
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
    // Haxe.g:269:1: defaultStmt : DEFAULT COLON ;
    public final HaxeParser.defaultStmt_return defaultStmt() throws RecognitionException {
        HaxeParser.defaultStmt_return retval = new HaxeParser.defaultStmt_return();
        retval.start = input.LT(1);
        int defaultStmt_StartIndex = input.index();
        Object root_0 = null;

        Token DEFAULT175=null;
        Token COLON176=null;

        Object DEFAULT175_tree=null;
        Object COLON176_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return retval; }
            // Haxe.g:270:9: ( DEFAULT COLON )
            // Haxe.g:270:11: DEFAULT COLON
            {
            root_0 = (Object)adaptor.nil();

            DEFAULT175=(Token)match(input,DEFAULT,FOLLOW_DEFAULT_in_defaultStmt1663); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            DEFAULT175_tree = (Object)adaptor.create(DEFAULT175);
            adaptor.addChild(root_0, DEFAULT175_tree);
            }
            COLON176=(Token)match(input,COLON,FOLLOW_COLON_in_defaultStmt1665); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // Haxe.g:273:1: catchStmtList : ( catchStmt catchStmtList | );
    public final HaxeParser.catchStmtList_return catchStmtList() throws RecognitionException {
        HaxeParser.catchStmtList_return retval = new HaxeParser.catchStmtList_return();
        retval.start = input.LT(1);
        int catchStmtList_StartIndex = input.index();
        Object root_0 = null;

        HaxeParser.catchStmt_return catchStmt177 = null;

        HaxeParser.catchStmtList_return catchStmtList178 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return retval; }
            // Haxe.g:274:2: ( catchStmt catchStmtList | )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==CATCH) ) {
                alt40=1;
            }
            else if ( (LA40_0==EOF||(LA40_0>=SEMI && LA40_0<=PRIVATE)||(LA40_0>=PUBLIC && LA40_0<=RBRACKET)||(LA40_0>=LT && LA40_0<=GT)||(LA40_0>=GTGTGT && LA40_0<=DEFAULT)||(LA40_0>=UNTYPED && LA40_0<=IMPLEMENTS)||(LA40_0>=LONGLITERAL && LA40_0<=FALSE)) ) {
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
                    // Haxe.g:274:4: catchStmt catchStmtList
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_catchStmt_in_catchStmtList1678);
                    catchStmt177=catchStmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, catchStmt177.getTree());
                    pushFollow(FOLLOW_catchStmtList_in_catchStmtList1680);
                    catchStmtList178=catchStmtList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, catchStmtList178.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:276:2: 
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
    // Haxe.g:278:1: catchStmt : CATCH LPAREN param RPAREN block -> ^( CATCH ( param )? ( block )? ) ;
    public final HaxeParser.catchStmt_return catchStmt() throws RecognitionException {
        HaxeParser.catchStmt_return retval = new HaxeParser.catchStmt_return();
        retval.start = input.LT(1);
        int catchStmt_StartIndex = input.index();
        Object root_0 = null;

        Token CATCH179=null;
        Token LPAREN180=null;
        Token RPAREN182=null;
        HaxeParser.param_return param181 = null;

        HaxeParser.block_return block183 = null;


        Object CATCH179_tree=null;
        Object LPAREN180_tree=null;
        Object RPAREN182_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_CATCH=new RewriteRuleTokenStream(adaptor,"token CATCH");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_param=new RewriteRuleSubtreeStream(adaptor,"rule param");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return retval; }
            // Haxe.g:279:2: ( CATCH LPAREN param RPAREN block -> ^( CATCH ( param )? ( block )? ) )
            // Haxe.g:279:4: CATCH LPAREN param RPAREN block
            {
            CATCH179=(Token)match(input,CATCH,FOLLOW_CATCH_in_catchStmt1702); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CATCH.add(CATCH179);

            LPAREN180=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_catchStmt1704); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN180);

            pushFollow(FOLLOW_param_in_catchStmt1706);
            param181=param();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_param.add(param181.getTree());
            RPAREN182=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_catchStmt1708); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN182);

            pushFollow(FOLLOW_block_in_catchStmt1710);
            block183=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block183.getTree());


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
            // 279:36: -> ^( CATCH ( param )? ( block )? )
            {
                // Haxe.g:279:39: ^( CATCH ( param )? ( block )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_CATCH.nextNode(), root_1);

                // Haxe.g:279:47: ( param )?
                if ( stream_param.hasNext() ) {
                    adaptor.addChild(root_1, stream_param.nextTree());

                }
                stream_param.reset();
                // Haxe.g:279:54: ( block )?
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
    // Haxe.g:284:1: exprListOpt : ( exprList | );
    public final HaxeParser.exprListOpt_return exprListOpt() throws RecognitionException {
        HaxeParser.exprListOpt_return retval = new HaxeParser.exprListOpt_return();
        retval.start = input.LT(1);
        int exprListOpt_StartIndex = input.index();
        Object root_0 = null;

        HaxeParser.exprList_return exprList184 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return retval; }
            // Haxe.g:285:2: ( exprList | )
            int alt41=2;
            switch ( input.LA(1) ) {
            case LPAREN:
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
            case LBRACKET:
            case LT:
            case GT:
            case GTGTGT:
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
                alt41=1;
                }
                break;
            case RBRACKET:
                {
                int LA41_2 = input.LA(2);

                if ( (synpred73_Haxe()) ) {
                    alt41=1;
                }
                else if ( (true) ) {
                    alt41=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 41, 2, input);

                    throw nvae;
                }
                }
                break;
            case RPAREN:
                {
                int LA41_3 = input.LA(2);

                if ( (synpred73_Haxe()) ) {
                    alt41=1;
                }
                else if ( (true) ) {
                    alt41=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 41, 3, input);

                    throw nvae;
                }
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
                    // Haxe.g:285:4: exprList
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_exprList_in_exprListOpt1736);
                    exprList184=exprList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, exprList184.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:287:2: 
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
    // Haxe.g:289:1: exprList : expr ( COMMA expr )* ;
    public final HaxeParser.exprList_return exprList() throws RecognitionException {
        HaxeParser.exprList_return retval = new HaxeParser.exprList_return();
        retval.start = input.LT(1);
        int exprList_StartIndex = input.index();
        Object root_0 = null;

        Token COMMA186=null;
        HaxeParser.expr_return expr185 = null;

        HaxeParser.expr_return expr187 = null;


        Object COMMA186_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return retval; }
            // Haxe.g:289:9: ( expr ( COMMA expr )* )
            // Haxe.g:289:11: expr ( COMMA expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_expr_in_exprList1749);
            expr185=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr185.getTree());
            // Haxe.g:289:16: ( COMMA expr )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==COMMA) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // Haxe.g:289:17: COMMA expr
            	    {
            	    COMMA186=(Token)match(input,COMMA,FOLLOW_COMMA_in_exprList1752); if (state.failed) return retval;
            	    pushFollow(FOLLOW_expr_in_exprList1755);
            	    expr187=expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr187.getTree());

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
    // Haxe.g:292:1: expr : ( assignExpr | UNTYPED assignExpr -> ^( UNTYPED assignExpr ) );
    public final HaxeParser.expr_return expr() throws RecognitionException {
        HaxeParser.expr_return retval = new HaxeParser.expr_return();
        retval.start = input.LT(1);
        int expr_StartIndex = input.index();
        Object root_0 = null;

        Token UNTYPED189=null;
        HaxeParser.assignExpr_return assignExpr188 = null;

        HaxeParser.assignExpr_return assignExpr190 = null;


        Object UNTYPED189_tree=null;
        RewriteRuleTokenStream stream_UNTYPED=new RewriteRuleTokenStream(adaptor,"token UNTYPED");
        RewriteRuleSubtreeStream stream_assignExpr=new RewriteRuleSubtreeStream(adaptor,"rule assignExpr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 42) ) { return retval; }
            // Haxe.g:292:6: ( assignExpr | UNTYPED assignExpr -> ^( UNTYPED assignExpr ) )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==EOF||LA43_0==SEMI||(LA43_0>=LPAREN && LA43_0<=COLON)||(LA43_0>=COMMA && LA43_0<=RBRACKET)||(LA43_0>=LT && LA43_0<=GT)||(LA43_0>=GTGTGT && LA43_0<=NEW)||LA43_0==IN||(LA43_0>=LBRACE && LA43_0<=RBRACE)||(LA43_0>=ELLIPSIS && LA43_0<=CAST)||(LA43_0>=LONGLITERAL && LA43_0<=FALSE)) ) {
                alt43=1;
            }
            else if ( (LA43_0==UNTYPED) ) {
                int LA43_2 = input.LA(2);

                if ( (synpred75_Haxe()) ) {
                    alt43=1;
                }
                else if ( (true) ) {
                    alt43=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 43, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // Haxe.g:292:8: assignExpr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_assignExpr_in_expr1768);
                    assignExpr188=assignExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignExpr188.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:293:4: UNTYPED assignExpr
                    {
                    UNTYPED189=(Token)match(input,UNTYPED,FOLLOW_UNTYPED_in_expr1773); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_UNTYPED.add(UNTYPED189);

                    pushFollow(FOLLOW_assignExpr_in_expr1775);
                    assignExpr190=assignExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_assignExpr.add(assignExpr190.getTree());


                    // AST REWRITE
                    // elements: UNTYPED, assignExpr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 293:23: -> ^( UNTYPED assignExpr )
                    {
                        // Haxe.g:293:26: ^( UNTYPED assignExpr )
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
    // Haxe.g:296:1: assignExpr : ( assignExprEx | UNTYPED assignExprEx -> ^( UNTYPED assignExprEx ) );
    public final HaxeParser.assignExpr_return assignExpr() throws RecognitionException {
        HaxeParser.assignExpr_return retval = new HaxeParser.assignExpr_return();
        retval.start = input.LT(1);
        int assignExpr_StartIndex = input.index();
        Object root_0 = null;

        Token UNTYPED192=null;
        HaxeParser.assignExprEx_return assignExprEx191 = null;

        HaxeParser.assignExprEx_return assignExprEx193 = null;


        Object UNTYPED192_tree=null;
        RewriteRuleTokenStream stream_UNTYPED=new RewriteRuleTokenStream(adaptor,"token UNTYPED");
        RewriteRuleSubtreeStream stream_assignExprEx=new RewriteRuleSubtreeStream(adaptor,"rule assignExprEx");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 43) ) { return retval; }
            // Haxe.g:297:2: ( assignExprEx | UNTYPED assignExprEx -> ^( UNTYPED assignExprEx ) )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==EOF||LA44_0==SEMI||(LA44_0>=LPAREN && LA44_0<=COLON)||(LA44_0>=COMMA && LA44_0<=RBRACKET)||(LA44_0>=LT && LA44_0<=GT)||(LA44_0>=GTGTGT && LA44_0<=NEW)||LA44_0==IN||(LA44_0>=LBRACE && LA44_0<=RBRACE)||(LA44_0>=ELLIPSIS && LA44_0<=CAST)||(LA44_0>=EXTENDS && LA44_0<=IMPLEMENTS)||(LA44_0>=LONGLITERAL && LA44_0<=FALSE)) ) {
                alt44=1;
            }
            else if ( (LA44_0==UNTYPED) ) {
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
                    // Haxe.g:297:4: assignExprEx
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_assignExprEx_in_assignExpr1795);
                    assignExprEx191=assignExprEx();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignExprEx191.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:298:4: UNTYPED assignExprEx
                    {
                    UNTYPED192=(Token)match(input,UNTYPED,FOLLOW_UNTYPED_in_assignExpr1800); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_UNTYPED.add(UNTYPED192);

                    pushFollow(FOLLOW_assignExprEx_in_assignExpr1802);
                    assignExprEx193=assignExprEx();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_assignExprEx.add(assignExprEx193.getTree());


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
                    // 298:25: -> ^( UNTYPED assignExprEx )
                    {
                        // Haxe.g:298:28: ^( UNTYPED assignExprEx )
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
            if ( state.backtracking>0 ) { memoize(input, 43, assignExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "assignExpr"

    public static class assignExprEx_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assignExprEx"
    // Haxe.g:301:1: assignExprEx : iterExpr ( assignOp iterExpr )* ;
    public final HaxeParser.assignExprEx_return assignExprEx() throws RecognitionException {
        HaxeParser.assignExprEx_return retval = new HaxeParser.assignExprEx_return();
        retval.start = input.LT(1);
        int assignExprEx_StartIndex = input.index();
        Object root_0 = null;

        HaxeParser.iterExpr_return iterExpr194 = null;

        HaxeParser.assignOp_return assignOp195 = null;

        HaxeParser.iterExpr_return iterExpr196 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 44) ) { return retval; }
            // Haxe.g:302:2: ( iterExpr ( assignOp iterExpr )* )
            // Haxe.g:302:5: iterExpr ( assignOp iterExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_iterExpr_in_assignExprEx1822);
            iterExpr194=iterExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, iterExpr194.getTree());
            // Haxe.g:302:14: ( assignOp iterExpr )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( ((LA45_0>=EQ && LA45_0<=AMPEQ)) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // Haxe.g:302:15: assignOp iterExpr
            	    {
            	    pushFollow(FOLLOW_assignOp_in_assignExprEx1825);
            	    assignOp195=assignOp();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(assignOp195.getTree(), root_0);
            	    pushFollow(FOLLOW_iterExpr_in_assignExprEx1828);
            	    iterExpr196=iterExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, iterExpr196.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 44, assignExprEx_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "assignExprEx"

    public static class iterExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "iterExpr"
    // Haxe.g:305:1: iterExpr : ternaryExpr ( ELLIPSIS ternaryExpr )* ;
    public final HaxeParser.iterExpr_return iterExpr() throws RecognitionException {
        HaxeParser.iterExpr_return retval = new HaxeParser.iterExpr_return();
        retval.start = input.LT(1);
        int iterExpr_StartIndex = input.index();
        Object root_0 = null;

        Token ELLIPSIS198=null;
        HaxeParser.ternaryExpr_return ternaryExpr197 = null;

        HaxeParser.ternaryExpr_return ternaryExpr199 = null;


        Object ELLIPSIS198_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 45) ) { return retval; }
            // Haxe.g:305:9: ( ternaryExpr ( ELLIPSIS ternaryExpr )* )
            // Haxe.g:305:11: ternaryExpr ( ELLIPSIS ternaryExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_ternaryExpr_in_iterExpr1840);
            ternaryExpr197=ternaryExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, ternaryExpr197.getTree());
            // Haxe.g:305:23: ( ELLIPSIS ternaryExpr )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==ELLIPSIS) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // Haxe.g:305:24: ELLIPSIS ternaryExpr
            	    {
            	    ELLIPSIS198=(Token)match(input,ELLIPSIS,FOLLOW_ELLIPSIS_in_iterExpr1843); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    ELLIPSIS198_tree = (Object)adaptor.create(ELLIPSIS198);
            	    root_0 = (Object)adaptor.becomeRoot(ELLIPSIS198_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ternaryExpr_in_iterExpr1846);
            	    ternaryExpr199=ternaryExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, ternaryExpr199.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 45, iterExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "iterExpr"

    public static class ternaryExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ternaryExpr"
    // Haxe.g:308:1: ternaryExpr : logicOrExpr ( QUES expr COLON logicOrExpr )* ;
    public final HaxeParser.ternaryExpr_return ternaryExpr() throws RecognitionException {
        HaxeParser.ternaryExpr_return retval = new HaxeParser.ternaryExpr_return();
        retval.start = input.LT(1);
        int ternaryExpr_StartIndex = input.index();
        Object root_0 = null;

        Token QUES201=null;
        Token COLON203=null;
        HaxeParser.logicOrExpr_return logicOrExpr200 = null;

        HaxeParser.expr_return expr202 = null;

        HaxeParser.logicOrExpr_return logicOrExpr204 = null;


        Object QUES201_tree=null;
        Object COLON203_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 46) ) { return retval; }
            // Haxe.g:309:2: ( logicOrExpr ( QUES expr COLON logicOrExpr )* )
            // Haxe.g:309:4: logicOrExpr ( QUES expr COLON logicOrExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_logicOrExpr_in_ternaryExpr1859);
            logicOrExpr200=logicOrExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, logicOrExpr200.getTree());
            // Haxe.g:309:16: ( QUES expr COLON logicOrExpr )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==QUES) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // Haxe.g:309:17: QUES expr COLON logicOrExpr
            	    {
            	    QUES201=(Token)match(input,QUES,FOLLOW_QUES_in_ternaryExpr1862); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    QUES201_tree = (Object)adaptor.create(QUES201);
            	    root_0 = (Object)adaptor.becomeRoot(QUES201_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_expr_in_ternaryExpr1865);
            	    expr202=expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr202.getTree());
            	    COLON203=(Token)match(input,COLON,FOLLOW_COLON_in_ternaryExpr1867); if (state.failed) return retval;
            	    pushFollow(FOLLOW_logicOrExpr_in_ternaryExpr1870);
            	    logicOrExpr204=logicOrExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, logicOrExpr204.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 46, ternaryExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "ternaryExpr"

    public static class logicOrExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "logicOrExpr"
    // Haxe.g:312:1: logicOrExpr : logicAndExpr ( BARBAR logicAndExpr )* ;
    public final HaxeParser.logicOrExpr_return logicOrExpr() throws RecognitionException {
        HaxeParser.logicOrExpr_return retval = new HaxeParser.logicOrExpr_return();
        retval.start = input.LT(1);
        int logicOrExpr_StartIndex = input.index();
        Object root_0 = null;

        Token BARBAR206=null;
        HaxeParser.logicAndExpr_return logicAndExpr205 = null;

        HaxeParser.logicAndExpr_return logicAndExpr207 = null;


        Object BARBAR206_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 47) ) { return retval; }
            // Haxe.g:313:2: ( logicAndExpr ( BARBAR logicAndExpr )* )
            // Haxe.g:313:4: logicAndExpr ( BARBAR logicAndExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_logicAndExpr_in_logicOrExpr1890);
            logicAndExpr205=logicAndExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, logicAndExpr205.getTree());
            // Haxe.g:313:17: ( BARBAR logicAndExpr )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==BARBAR) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // Haxe.g:313:18: BARBAR logicAndExpr
            	    {
            	    BARBAR206=(Token)match(input,BARBAR,FOLLOW_BARBAR_in_logicOrExpr1893); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    BARBAR206_tree = (Object)adaptor.create(BARBAR206);
            	    root_0 = (Object)adaptor.becomeRoot(BARBAR206_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_logicAndExpr_in_logicOrExpr1896);
            	    logicAndExpr207=logicAndExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, logicAndExpr207.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 47, logicOrExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "logicOrExpr"

    public static class logicAndExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "logicAndExpr"
    // Haxe.g:316:1: logicAndExpr : ( cmpExpr ) ( AMPAMP cmpExpr )* ;
    public final HaxeParser.logicAndExpr_return logicAndExpr() throws RecognitionException {
        HaxeParser.logicAndExpr_return retval = new HaxeParser.logicAndExpr_return();
        retval.start = input.LT(1);
        int logicAndExpr_StartIndex = input.index();
        Object root_0 = null;

        Token AMPAMP209=null;
        HaxeParser.cmpExpr_return cmpExpr208 = null;

        HaxeParser.cmpExpr_return cmpExpr210 = null;


        Object AMPAMP209_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 48) ) { return retval; }
            // Haxe.g:317:2: ( ( cmpExpr ) ( AMPAMP cmpExpr )* )
            // Haxe.g:317:4: ( cmpExpr ) ( AMPAMP cmpExpr )*
            {
            root_0 = (Object)adaptor.nil();

            // Haxe.g:317:4: ( cmpExpr )
            // Haxe.g:317:5: cmpExpr
            {
            pushFollow(FOLLOW_cmpExpr_in_logicAndExpr1917);
            cmpExpr208=cmpExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, cmpExpr208.getTree());

            }

            // Haxe.g:317:14: ( AMPAMP cmpExpr )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==AMPAMP) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // Haxe.g:317:15: AMPAMP cmpExpr
            	    {
            	    AMPAMP209=(Token)match(input,AMPAMP,FOLLOW_AMPAMP_in_logicAndExpr1921); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    AMPAMP209_tree = (Object)adaptor.create(AMPAMP209);
            	    root_0 = (Object)adaptor.becomeRoot(AMPAMP209_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_cmpExpr_in_logicAndExpr1924);
            	    cmpExpr210=cmpExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, cmpExpr210.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 48, logicAndExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "logicAndExpr"

    public static class cmpExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "cmpExpr"
    // Haxe.g:320:1: cmpExpr : ( bitExpr ) ( ( EQEQ | BANGEQ | GTEQ | LTEQ | GT | LT ) bitExpr )* ;
    public final HaxeParser.cmpExpr_return cmpExpr() throws RecognitionException {
        HaxeParser.cmpExpr_return retval = new HaxeParser.cmpExpr_return();
        retval.start = input.LT(1);
        int cmpExpr_StartIndex = input.index();
        Object root_0 = null;

        Token EQEQ212=null;
        Token BANGEQ213=null;
        Token GTEQ214=null;
        Token LTEQ215=null;
        Token GT216=null;
        Token LT217=null;
        HaxeParser.bitExpr_return bitExpr211 = null;

        HaxeParser.bitExpr_return bitExpr218 = null;


        Object EQEQ212_tree=null;
        Object BANGEQ213_tree=null;
        Object GTEQ214_tree=null;
        Object LTEQ215_tree=null;
        Object GT216_tree=null;
        Object LT217_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 49) ) { return retval; }
            // Haxe.g:320:9: ( ( bitExpr ) ( ( EQEQ | BANGEQ | GTEQ | LTEQ | GT | LT ) bitExpr )* )
            // Haxe.g:320:11: ( bitExpr ) ( ( EQEQ | BANGEQ | GTEQ | LTEQ | GT | LT ) bitExpr )*
            {
            root_0 = (Object)adaptor.nil();

            // Haxe.g:320:11: ( bitExpr )
            // Haxe.g:320:12: bitExpr
            {
            pushFollow(FOLLOW_bitExpr_in_cmpExpr1938);
            bitExpr211=bitExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bitExpr211.getTree());

            }

            // Haxe.g:320:21: ( ( EQEQ | BANGEQ | GTEQ | LTEQ | GT | LT ) bitExpr )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( ((LA51_0>=LT && LA51_0<=GT)||(LA51_0>=EQEQ && LA51_0<=LTEQ)) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // Haxe.g:320:22: ( EQEQ | BANGEQ | GTEQ | LTEQ | GT | LT ) bitExpr
            	    {
            	    // Haxe.g:320:22: ( EQEQ | BANGEQ | GTEQ | LTEQ | GT | LT )
            	    int alt50=6;
            	    switch ( input.LA(1) ) {
            	    case EQEQ:
            	        {
            	        alt50=1;
            	        }
            	        break;
            	    case BANGEQ:
            	        {
            	        alt50=2;
            	        }
            	        break;
            	    case GTEQ:
            	        {
            	        alt50=3;
            	        }
            	        break;
            	    case LTEQ:
            	        {
            	        alt50=4;
            	        }
            	        break;
            	    case GT:
            	        {
            	        alt50=5;
            	        }
            	        break;
            	    case LT:
            	        {
            	        alt50=6;
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
            	            // Haxe.g:320:23: EQEQ
            	            {
            	            EQEQ212=(Token)match(input,EQEQ,FOLLOW_EQEQ_in_cmpExpr1943); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            EQEQ212_tree = (Object)adaptor.create(EQEQ212);
            	            root_0 = (Object)adaptor.becomeRoot(EQEQ212_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // Haxe.g:320:30: BANGEQ
            	            {
            	            BANGEQ213=(Token)match(input,BANGEQ,FOLLOW_BANGEQ_in_cmpExpr1947); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            BANGEQ213_tree = (Object)adaptor.create(BANGEQ213);
            	            root_0 = (Object)adaptor.becomeRoot(BANGEQ213_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // Haxe.g:320:40: GTEQ
            	            {
            	            GTEQ214=(Token)match(input,GTEQ,FOLLOW_GTEQ_in_cmpExpr1952); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            GTEQ214_tree = (Object)adaptor.create(GTEQ214);
            	            root_0 = (Object)adaptor.becomeRoot(GTEQ214_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // Haxe.g:320:48: LTEQ
            	            {
            	            LTEQ215=(Token)match(input,LTEQ,FOLLOW_LTEQ_in_cmpExpr1957); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            LTEQ215_tree = (Object)adaptor.create(LTEQ215);
            	            root_0 = (Object)adaptor.becomeRoot(LTEQ215_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 5 :
            	            // Haxe.g:320:56: GT
            	            {
            	            GT216=(Token)match(input,GT,FOLLOW_GT_in_cmpExpr1962); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            GT216_tree = (Object)adaptor.create(GT216);
            	            root_0 = (Object)adaptor.becomeRoot(GT216_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 6 :
            	            // Haxe.g:320:62: LT
            	            {
            	            LT217=(Token)match(input,LT,FOLLOW_LT_in_cmpExpr1967); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            LT217_tree = (Object)adaptor.create(LT217);
            	            root_0 = (Object)adaptor.becomeRoot(LT217_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_bitExpr_in_cmpExpr1972);
            	    bitExpr218=bitExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, bitExpr218.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 49, cmpExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "cmpExpr"

    public static class bitExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bitExpr"
    // Haxe.g:323:1: bitExpr : ( shiftExpr ) ( BAR shiftExpr | AMP shiftExpr | CARET shiftExpr )* ;
    public final HaxeParser.bitExpr_return bitExpr() throws RecognitionException {
        HaxeParser.bitExpr_return retval = new HaxeParser.bitExpr_return();
        retval.start = input.LT(1);
        int bitExpr_StartIndex = input.index();
        Object root_0 = null;

        Token BAR220=null;
        Token AMP222=null;
        Token CARET224=null;
        HaxeParser.shiftExpr_return shiftExpr219 = null;

        HaxeParser.shiftExpr_return shiftExpr221 = null;

        HaxeParser.shiftExpr_return shiftExpr223 = null;

        HaxeParser.shiftExpr_return shiftExpr225 = null;


        Object BAR220_tree=null;
        Object AMP222_tree=null;
        Object CARET224_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 50) ) { return retval; }
            // Haxe.g:323:9: ( ( shiftExpr ) ( BAR shiftExpr | AMP shiftExpr | CARET shiftExpr )* )
            // Haxe.g:323:11: ( shiftExpr ) ( BAR shiftExpr | AMP shiftExpr | CARET shiftExpr )*
            {
            root_0 = (Object)adaptor.nil();

            // Haxe.g:323:11: ( shiftExpr )
            // Haxe.g:323:12: shiftExpr
            {
            pushFollow(FOLLOW_shiftExpr_in_bitExpr1986);
            shiftExpr219=shiftExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, shiftExpr219.getTree());

            }

            // Haxe.g:323:23: ( BAR shiftExpr | AMP shiftExpr | CARET shiftExpr )*
            loop52:
            do {
                int alt52=4;
                switch ( input.LA(1) ) {
                case BAR:
                    {
                    alt52=1;
                    }
                    break;
                case AMP:
                    {
                    alt52=2;
                    }
                    break;
                case CARET:
                    {
                    alt52=3;
                    }
                    break;

                }

                switch (alt52) {
            	case 1 :
            	    // Haxe.g:323:24: BAR shiftExpr
            	    {
            	    BAR220=(Token)match(input,BAR,FOLLOW_BAR_in_bitExpr1990); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    BAR220_tree = (Object)adaptor.create(BAR220);
            	    root_0 = (Object)adaptor.becomeRoot(BAR220_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_shiftExpr_in_bitExpr1993);
            	    shiftExpr221=shiftExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, shiftExpr221.getTree());

            	    }
            	    break;
            	case 2 :
            	    // Haxe.g:323:41: AMP shiftExpr
            	    {
            	    AMP222=(Token)match(input,AMP,FOLLOW_AMP_in_bitExpr1997); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    AMP222_tree = (Object)adaptor.create(AMP222);
            	    root_0 = (Object)adaptor.becomeRoot(AMP222_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_shiftExpr_in_bitExpr2000);
            	    shiftExpr223=shiftExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, shiftExpr223.getTree());

            	    }
            	    break;
            	case 3 :
            	    // Haxe.g:323:57: CARET shiftExpr
            	    {
            	    CARET224=(Token)match(input,CARET,FOLLOW_CARET_in_bitExpr2003); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    CARET224_tree = (Object)adaptor.create(CARET224);
            	    root_0 = (Object)adaptor.becomeRoot(CARET224_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_shiftExpr_in_bitExpr2006);
            	    shiftExpr225=shiftExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, shiftExpr225.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 50, bitExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "bitExpr"

    public static class shiftExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "shiftExpr"
    // Haxe.g:326:1: shiftExpr : ( addExpr ) ( LTLT addExpr | ( GT GT ) addExpr | GTGTGT addExpr )* ;
    public final HaxeParser.shiftExpr_return shiftExpr() throws RecognitionException {
        HaxeParser.shiftExpr_return retval = new HaxeParser.shiftExpr_return();
        retval.start = input.LT(1);
        int shiftExpr_StartIndex = input.index();
        Object root_0 = null;

        Token LTLT227=null;
        Token GT229=null;
        Token GT230=null;
        Token GTGTGT232=null;
        HaxeParser.addExpr_return addExpr226 = null;

        HaxeParser.addExpr_return addExpr228 = null;

        HaxeParser.addExpr_return addExpr231 = null;

        HaxeParser.addExpr_return addExpr233 = null;


        Object LTLT227_tree=null;
        Object GT229_tree=null;
        Object GT230_tree=null;
        Object GTGTGT232_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 51) ) { return retval; }
            // Haxe.g:327:2: ( ( addExpr ) ( LTLT addExpr | ( GT GT ) addExpr | GTGTGT addExpr )* )
            // Haxe.g:327:4: ( addExpr ) ( LTLT addExpr | ( GT GT ) addExpr | GTGTGT addExpr )*
            {
            root_0 = (Object)adaptor.nil();

            // Haxe.g:327:4: ( addExpr )
            // Haxe.g:327:5: addExpr
            {
            pushFollow(FOLLOW_addExpr_in_shiftExpr2020);
            addExpr226=addExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, addExpr226.getTree());

            }

            // Haxe.g:327:14: ( LTLT addExpr | ( GT GT ) addExpr | GTGTGT addExpr )*
            loop53:
            do {
                int alt53=4;
                switch ( input.LA(1) ) {
                case GT:
                    {
                    int LA53_2 = input.LA(2);

                    if ( (LA53_2==GT) ) {
                        int LA53_5 = input.LA(3);

                        if ( (synpred92_Haxe()) ) {
                            alt53=2;
                        }


                    }


                    }
                    break;
                case LTLT:
                    {
                    alt53=1;
                    }
                    break;
                case GTGTGT:
                    {
                    alt53=3;
                    }
                    break;

                }

                switch (alt53) {
            	case 1 :
            	    // Haxe.g:327:15: LTLT addExpr
            	    {
            	    LTLT227=(Token)match(input,LTLT,FOLLOW_LTLT_in_shiftExpr2024); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    LTLT227_tree = (Object)adaptor.create(LTLT227);
            	    root_0 = (Object)adaptor.becomeRoot(LTLT227_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_addExpr_in_shiftExpr2028);
            	    addExpr228=addExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, addExpr228.getTree());

            	    }
            	    break;
            	case 2 :
            	    // Haxe.g:327:32: ( GT GT ) addExpr
            	    {
            	    // Haxe.g:327:32: ( GT GT )
            	    // Haxe.g:327:33: GT GT
            	    {
            	    GT229=(Token)match(input,GT,FOLLOW_GT_in_shiftExpr2033); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    GT229_tree = (Object)adaptor.create(GT229);
            	    adaptor.addChild(root_0, GT229_tree);
            	    }
            	    GT230=(Token)match(input,GT,FOLLOW_GT_in_shiftExpr2035); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    GT230_tree = (Object)adaptor.create(GT230);
            	    adaptor.addChild(root_0, GT230_tree);
            	    }

            	    }

            	    pushFollow(FOLLOW_addExpr_in_shiftExpr2040);
            	    addExpr231=addExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, addExpr231.getTree());

            	    }
            	    break;
            	case 3 :
            	    // Haxe.g:327:52: GTGTGT addExpr
            	    {
            	    GTGTGT232=(Token)match(input,GTGTGT,FOLLOW_GTGTGT_in_shiftExpr2044); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    GTGTGT232_tree = (Object)adaptor.create(GTGTGT232);
            	    root_0 = (Object)adaptor.becomeRoot(GTGTGT232_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_addExpr_in_shiftExpr2047);
            	    addExpr233=addExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, addExpr233.getTree());

            	    }
            	    break;

            	default :
            	    break loop53;
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
            if ( state.backtracking>0 ) { memoize(input, 51, shiftExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "shiftExpr"

    public static class addExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "addExpr"
    // Haxe.g:330:1: addExpr : ( multExpr ) ( ( PLUS | SUB ) multExpr )* ;
    public final HaxeParser.addExpr_return addExpr() throws RecognitionException {
        HaxeParser.addExpr_return retval = new HaxeParser.addExpr_return();
        retval.start = input.LT(1);
        int addExpr_StartIndex = input.index();
        Object root_0 = null;

        Token PLUS235=null;
        Token SUB236=null;
        HaxeParser.multExpr_return multExpr234 = null;

        HaxeParser.multExpr_return multExpr237 = null;


        Object PLUS235_tree=null;
        Object SUB236_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 52) ) { return retval; }
            // Haxe.g:330:9: ( ( multExpr ) ( ( PLUS | SUB ) multExpr )* )
            // Haxe.g:330:12: ( multExpr ) ( ( PLUS | SUB ) multExpr )*
            {
            root_0 = (Object)adaptor.nil();

            // Haxe.g:330:12: ( multExpr )
            // Haxe.g:330:13: multExpr
            {
            pushFollow(FOLLOW_multExpr_in_addExpr2061);
            multExpr234=multExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, multExpr234.getTree());

            }

            // Haxe.g:330:23: ( ( PLUS | SUB ) multExpr )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( ((LA55_0>=PLUS && LA55_0<=SUB)) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // Haxe.g:330:24: ( PLUS | SUB ) multExpr
            	    {
            	    // Haxe.g:330:24: ( PLUS | SUB )
            	    int alt54=2;
            	    int LA54_0 = input.LA(1);

            	    if ( (LA54_0==PLUS) ) {
            	        alt54=1;
            	    }
            	    else if ( (LA54_0==SUB) ) {
            	        alt54=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 54, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt54) {
            	        case 1 :
            	            // Haxe.g:330:25: PLUS
            	            {
            	            PLUS235=(Token)match(input,PLUS,FOLLOW_PLUS_in_addExpr2066); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            PLUS235_tree = (Object)adaptor.create(PLUS235);
            	            root_0 = (Object)adaptor.becomeRoot(PLUS235_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // Haxe.g:330:33: SUB
            	            {
            	            SUB236=(Token)match(input,SUB,FOLLOW_SUB_in_addExpr2071); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            SUB236_tree = (Object)adaptor.create(SUB236);
            	            root_0 = (Object)adaptor.becomeRoot(SUB236_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_multExpr_in_addExpr2075);
            	    multExpr237=multExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, multExpr237.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 52, addExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "addExpr"

    public static class multExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "multExpr"
    // Haxe.g:333:1: multExpr : ( prefixExpr ) ( ( STAR | SLASH | PERCENT ) prefixExpr )* ;
    public final HaxeParser.multExpr_return multExpr() throws RecognitionException {
        HaxeParser.multExpr_return retval = new HaxeParser.multExpr_return();
        retval.start = input.LT(1);
        int multExpr_StartIndex = input.index();
        Object root_0 = null;

        Token STAR239=null;
        Token SLASH240=null;
        Token PERCENT241=null;
        HaxeParser.prefixExpr_return prefixExpr238 = null;

        HaxeParser.prefixExpr_return prefixExpr242 = null;


        Object STAR239_tree=null;
        Object SLASH240_tree=null;
        Object PERCENT241_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 53) ) { return retval; }
            // Haxe.g:333:9: ( ( prefixExpr ) ( ( STAR | SLASH | PERCENT ) prefixExpr )* )
            // Haxe.g:333:11: ( prefixExpr ) ( ( STAR | SLASH | PERCENT ) prefixExpr )*
            {
            root_0 = (Object)adaptor.nil();

            // Haxe.g:333:11: ( prefixExpr )
            // Haxe.g:333:12: prefixExpr
            {
            pushFollow(FOLLOW_prefixExpr_in_multExpr2089);
            prefixExpr238=prefixExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, prefixExpr238.getTree());

            }

            // Haxe.g:333:24: ( ( STAR | SLASH | PERCENT ) prefixExpr )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( ((LA57_0>=STAR && LA57_0<=PERCENT)) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // Haxe.g:333:25: ( STAR | SLASH | PERCENT ) prefixExpr
            	    {
            	    // Haxe.g:333:25: ( STAR | SLASH | PERCENT )
            	    int alt56=3;
            	    switch ( input.LA(1) ) {
            	    case STAR:
            	        {
            	        alt56=1;
            	        }
            	        break;
            	    case SLASH:
            	        {
            	        alt56=2;
            	        }
            	        break;
            	    case PERCENT:
            	        {
            	        alt56=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 56, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt56) {
            	        case 1 :
            	            // Haxe.g:333:26: STAR
            	            {
            	            STAR239=(Token)match(input,STAR,FOLLOW_STAR_in_multExpr2094); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            STAR239_tree = (Object)adaptor.create(STAR239);
            	            root_0 = (Object)adaptor.becomeRoot(STAR239_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // Haxe.g:333:32: SLASH
            	            {
            	            SLASH240=(Token)match(input,SLASH,FOLLOW_SLASH_in_multExpr2097); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            SLASH240_tree = (Object)adaptor.create(SLASH240);
            	            root_0 = (Object)adaptor.becomeRoot(SLASH240_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // Haxe.g:333:39: PERCENT
            	            {
            	            PERCENT241=(Token)match(input,PERCENT,FOLLOW_PERCENT_in_multExpr2100); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            PERCENT241_tree = (Object)adaptor.create(PERCENT241);
            	            root_0 = (Object)adaptor.becomeRoot(PERCENT241_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_prefixExpr_in_multExpr2104);
            	    prefixExpr242=prefixExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, prefixExpr242.getTree());

            	    }
            	    break;

            	default :
            	    break loop57;
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
            if ( state.backtracking>0 ) { memoize(input, 53, multExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "multExpr"

    public static class prefixExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "prefixExpr"
    // Haxe.g:336:1: prefixExpr : ( ( SUB | SUBSUB | PLUSPLUS | BANG | TILDE ) prefixExpr | newExpr | cast | suffixExpr );
    public final HaxeParser.prefixExpr_return prefixExpr() throws RecognitionException {
        HaxeParser.prefixExpr_return retval = new HaxeParser.prefixExpr_return();
        retval.start = input.LT(1);
        int prefixExpr_StartIndex = input.index();
        Object root_0 = null;

        Token set243=null;
        HaxeParser.prefixExpr_return prefixExpr244 = null;

        HaxeParser.newExpr_return newExpr245 = null;

        HaxeParser.cast_return cast246 = null;

        HaxeParser.suffixExpr_return suffixExpr247 = null;


        Object set243_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 54) ) { return retval; }
            // Haxe.g:337:9: ( ( SUB | SUBSUB | PLUSPLUS | BANG | TILDE ) prefixExpr | newExpr | cast | suffixExpr )
            int alt58=4;
            switch ( input.LA(1) ) {
            case PLUSPLUS:
                {
                int LA58_1 = input.LA(2);

                if ( (synpred103_Haxe()) ) {
                    alt58=1;
                }
                else if ( (true) ) {
                    alt58=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 58, 1, input);

                    throw nvae;
                }
                }
                break;
            case NEW:
                {
                alt58=2;
                }
                break;
            case CAST:
                {
                alt58=3;
                }
                break;
            case EOF:
            case SEMI:
            case LPAREN:
            case RPAREN:
            case IDENTIFIER:
            case COLON:
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
            case LBRACKET:
            case RBRACKET:
            case LT:
            case GT:
            case GTGTGT:
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
                alt58=4;
                }
                break;
            case SUBSUB:
                {
                int LA58_5 = input.LA(2);

                if ( (synpred103_Haxe()) ) {
                    alt58=1;
                }
                else if ( (true) ) {
                    alt58=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 58, 5, input);

                    throw nvae;
                }
                }
                break;
            case SUB:
                {
                int LA58_6 = input.LA(2);

                if ( (synpred103_Haxe()) ) {
                    alt58=1;
                }
                else if ( (true) ) {
                    alt58=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 58, 6, input);

                    throw nvae;
                }
                }
                break;
            case BANG:
            case TILDE:
                {
                alt58=1;
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
                    // Haxe.g:337:11: ( SUB | SUBSUB | PLUSPLUS | BANG | TILDE ) prefixExpr
                    {
                    root_0 = (Object)adaptor.nil();

                    set243=(Token)input.LT(1);
                    if ( input.LA(1)==SUB||(input.LA(1)>=SUBSUB && input.LA(1)<=TILDE) ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set243));
                        state.errorRecovery=false;state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_prefixExpr_in_prefixExpr2137);
                    prefixExpr244=prefixExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, prefixExpr244.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:338:11: newExpr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_newExpr_in_prefixExpr2149);
                    newExpr245=newExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, newExpr245.getTree());

                    }
                    break;
                case 3 :
                    // Haxe.g:339:11: cast
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_cast_in_prefixExpr2161);
                    cast246=cast();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, cast246.getTree());

                    }
                    break;
                case 4 :
                    // Haxe.g:340:11: suffixExpr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_suffixExpr_in_prefixExpr2173);
                    suffixExpr247=suffixExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, suffixExpr247.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 54, prefixExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "prefixExpr"

    public static class suffixExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "suffixExpr"
    // Haxe.g:343:1: suffixExpr : ( value LPAREN exprListOpt RPAREN -> ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] ( value )? ( exprListOpt )? ) | value LBRACKET expr RBRACKET | value PLUSPLUS -> ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] ( value )? ( PLUSPLUS )? ) | value SUBSUB -> ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] ( value )? SUBSUB ) | value typeParamOpt );
    public final HaxeParser.suffixExpr_return suffixExpr() throws RecognitionException {
        HaxeParser.suffixExpr_return retval = new HaxeParser.suffixExpr_return();
        retval.start = input.LT(1);
        int suffixExpr_StartIndex = input.index();
        Object root_0 = null;

        Token LPAREN249=null;
        Token RPAREN251=null;
        Token LBRACKET253=null;
        Token RBRACKET255=null;
        Token PLUSPLUS257=null;
        Token SUBSUB259=null;
        HaxeParser.value_return value248 = null;

        HaxeParser.exprListOpt_return exprListOpt250 = null;

        HaxeParser.value_return value252 = null;

        HaxeParser.expr_return expr254 = null;

        HaxeParser.value_return value256 = null;

        HaxeParser.value_return value258 = null;

        HaxeParser.value_return value260 = null;

        HaxeParser.typeParamOpt_return typeParamOpt261 = null;


        Object LPAREN249_tree=null;
        Object RPAREN251_tree=null;
        Object LBRACKET253_tree=null;
        Object RBRACKET255_tree=null;
        Object PLUSPLUS257_tree=null;
        Object SUBSUB259_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_SUBSUB=new RewriteRuleTokenStream(adaptor,"token SUBSUB");
        RewriteRuleTokenStream stream_PLUSPLUS=new RewriteRuleTokenStream(adaptor,"token PLUSPLUS");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_exprListOpt=new RewriteRuleSubtreeStream(adaptor,"rule exprListOpt");
        RewriteRuleSubtreeStream stream_value=new RewriteRuleSubtreeStream(adaptor,"rule value");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 55) ) { return retval; }
            // Haxe.g:344:2: ( value LPAREN exprListOpt RPAREN -> ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] ( value )? ( exprListOpt )? ) | value LBRACKET expr RBRACKET | value PLUSPLUS -> ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] ( value )? ( PLUSPLUS )? ) | value SUBSUB -> ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] ( value )? SUBSUB ) | value typeParamOpt )
            int alt59=5;
            alt59 = dfa59.predict(input);
            switch (alt59) {
                case 1 :
                    // Haxe.g:344:4: value LPAREN exprListOpt RPAREN
                    {
                    pushFollow(FOLLOW_value_in_suffixExpr2192);
                    value248=value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_value.add(value248.getTree());
                    LPAREN249=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_suffixExpr2194); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN249);

                    pushFollow(FOLLOW_exprListOpt_in_suffixExpr2196);
                    exprListOpt250=exprListOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_exprListOpt.add(exprListOpt250.getTree());
                    RPAREN251=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_suffixExpr2198); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN251);



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
                    // 344:36: -> ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] ( value )? ( exprListOpt )? )
                    {
                        // Haxe.g:344:39: ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] ( value )? ( exprListOpt )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new HaxeTree(SUFFIX_EXPR, "SUFFIX_EXPR", true), root_1);

                        // Haxe.g:344:83: ( value )?
                        if ( stream_value.hasNext() ) {
                            adaptor.addChild(root_1, stream_value.nextTree());

                        }
                        stream_value.reset();
                        // Haxe.g:344:90: ( exprListOpt )?
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
                    // Haxe.g:345:4: value LBRACKET expr RBRACKET
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_value_in_suffixExpr2219);
                    value252=value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, value252.getTree());
                    LBRACKET253=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_suffixExpr2221); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LBRACKET253_tree = (Object)adaptor.create(LBRACKET253);
                    adaptor.addChild(root_0, LBRACKET253_tree);
                    }
                    pushFollow(FOLLOW_expr_in_suffixExpr2223);
                    expr254=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr254.getTree());
                    RBRACKET255=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_suffixExpr2225); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RBRACKET255_tree = (Object)adaptor.create(RBRACKET255);
                    adaptor.addChild(root_0, RBRACKET255_tree);
                    }

                    }
                    break;
                case 3 :
                    // Haxe.g:346:4: value PLUSPLUS
                    {
                    pushFollow(FOLLOW_value_in_suffixExpr2230);
                    value256=value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_value.add(value256.getTree());
                    PLUSPLUS257=(Token)match(input,PLUSPLUS,FOLLOW_PLUSPLUS_in_suffixExpr2232); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PLUSPLUS.add(PLUSPLUS257);



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
                    // 346:22: -> ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] ( value )? ( PLUSPLUS )? )
                    {
                        // Haxe.g:346:25: ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] ( value )? ( PLUSPLUS )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new HaxeTree(SUFFIX_EXPR, "SUFFIX_EXPR", true), root_1);

                        // Haxe.g:346:69: ( value )?
                        if ( stream_value.hasNext() ) {
                            adaptor.addChild(root_1, stream_value.nextTree());

                        }
                        stream_value.reset();
                        // Haxe.g:346:76: ( PLUSPLUS )?
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
                    // Haxe.g:347:4: value SUBSUB
                    {
                    pushFollow(FOLLOW_value_in_suffixExpr2256);
                    value258=value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_value.add(value258.getTree());
                    SUBSUB259=(Token)match(input,SUBSUB,FOLLOW_SUBSUB_in_suffixExpr2258); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SUBSUB.add(SUBSUB259);



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
                    // 347:20: -> ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] ( value )? SUBSUB )
                    {
                        // Haxe.g:347:23: ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] ( value )? SUBSUB )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new HaxeTree(SUFFIX_EXPR, "SUFFIX_EXPR", true), root_1);

                        // Haxe.g:347:67: ( value )?
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
                    // Haxe.g:348:4: value typeParamOpt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_value_in_suffixExpr2281);
                    value260=value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, value260.getTree());
                    pushFollow(FOLLOW_typeParamOpt_in_suffixExpr2283);
                    typeParamOpt261=typeParamOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeParamOpt261.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 55, suffixExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "suffixExpr"

    public static class value_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "value"
    // Haxe.g:351:1: value : ( funcLit | arrayLit | objLit | NULL | elementarySymbol | LPAREN ( expr | statement ) RPAREN | dotIdent | );
    public final HaxeParser.value_return value() throws RecognitionException {
        HaxeParser.value_return retval = new HaxeParser.value_return();
        retval.start = input.LT(1);
        int value_StartIndex = input.index();
        Object root_0 = null;

        Token NULL265=null;
        Token LPAREN267=null;
        Token RPAREN270=null;
        HaxeParser.funcLit_return funcLit262 = null;

        HaxeParser.arrayLit_return arrayLit263 = null;

        HaxeParser.objLit_return objLit264 = null;

        HaxeParser.elementarySymbol_return elementarySymbol266 = null;

        HaxeParser.expr_return expr268 = null;

        HaxeParser.statement_return statement269 = null;

        HaxeParser.dotIdent_return dotIdent271 = null;


        Object NULL265_tree=null;
        Object LPAREN267_tree=null;
        Object RPAREN270_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 56) ) { return retval; }
            // Haxe.g:351:7: ( funcLit | arrayLit | objLit | NULL | elementarySymbol | LPAREN ( expr | statement ) RPAREN | dotIdent | )
            int alt61=8;
            alt61 = dfa61.predict(input);
            switch (alt61) {
                case 1 :
                    // Haxe.g:351:9: funcLit
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_funcLit_in_value2292);
                    funcLit262=funcLit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, funcLit262.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:352:4: arrayLit
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_arrayLit_in_value2298);
                    arrayLit263=arrayLit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arrayLit263.getTree());

                    }
                    break;
                case 3 :
                    // Haxe.g:353:14: objLit
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_objLit_in_value2313);
                    objLit264=objLit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, objLit264.getTree());

                    }
                    break;
                case 4 :
                    // Haxe.g:354:14: NULL
                    {
                    root_0 = (Object)adaptor.nil();

                    NULL265=(Token)match(input,NULL,FOLLOW_NULL_in_value2328); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NULL265_tree = (Object)adaptor.create(NULL265);
                    adaptor.addChild(root_0, NULL265_tree);
                    }

                    }
                    break;
                case 5 :
                    // Haxe.g:355:14: elementarySymbol
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_elementarySymbol_in_value2343);
                    elementarySymbol266=elementarySymbol();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, elementarySymbol266.getTree());

                    }
                    break;
                case 6 :
                    // Haxe.g:356:14: LPAREN ( expr | statement ) RPAREN
                    {
                    root_0 = (Object)adaptor.nil();

                    LPAREN267=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_value2358); if (state.failed) return retval;
                    // Haxe.g:356:22: ( expr | statement )
                    int alt60=2;
                    alt60 = dfa60.predict(input);
                    switch (alt60) {
                        case 1 :
                            // Haxe.g:356:23: expr
                            {
                            pushFollow(FOLLOW_expr_in_value2362);
                            expr268=expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr268.getTree());

                            }
                            break;
                        case 2 :
                            // Haxe.g:356:28: statement
                            {
                            pushFollow(FOLLOW_statement_in_value2364);
                            statement269=statement();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, statement269.getTree());

                            }
                            break;

                    }

                    RPAREN270=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_value2367); if (state.failed) return retval;

                    }
                    break;
                case 7 :
                    // Haxe.g:357:11: dotIdent
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_dotIdent_in_value2380);
                    dotIdent271=dotIdent();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dotIdent271.getTree());

                    }
                    break;
                case 8 :
                    // Haxe.g:359:9: 
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
            if ( state.backtracking>0 ) { memoize(input, 56, value_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "value"

    public static class newExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "newExpr"
    // Haxe.g:361:1: newExpr : NEW type LPAREN exprListOpt RPAREN -> ^( NEW ( type )? ( exprListOpt )? ) ;
    public final HaxeParser.newExpr_return newExpr() throws RecognitionException {
        HaxeParser.newExpr_return retval = new HaxeParser.newExpr_return();
        retval.start = input.LT(1);
        int newExpr_StartIndex = input.index();
        Object root_0 = null;

        Token NEW272=null;
        Token LPAREN274=null;
        Token RPAREN276=null;
        HaxeParser.type_return type273 = null;

        HaxeParser.exprListOpt_return exprListOpt275 = null;


        Object NEW272_tree=null;
        Object LPAREN274_tree=null;
        Object RPAREN276_tree=null;
        RewriteRuleTokenStream stream_NEW=new RewriteRuleTokenStream(adaptor,"token NEW");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_exprListOpt=new RewriteRuleSubtreeStream(adaptor,"rule exprListOpt");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 57) ) { return retval; }
            // Haxe.g:362:2: ( NEW type LPAREN exprListOpt RPAREN -> ^( NEW ( type )? ( exprListOpt )? ) )
            // Haxe.g:362:4: NEW type LPAREN exprListOpt RPAREN
            {
            NEW272=(Token)match(input,NEW,FOLLOW_NEW_in_newExpr2419); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_NEW.add(NEW272);

            pushFollow(FOLLOW_type_in_newExpr2421);
            type273=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(type273.getTree());
            LPAREN274=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_newExpr2423); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN274);

            pushFollow(FOLLOW_exprListOpt_in_newExpr2425);
            exprListOpt275=exprListOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_exprListOpt.add(exprListOpt275.getTree());
            RPAREN276=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_newExpr2427); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN276);



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
            // 362:39: -> ^( NEW ( type )? ( exprListOpt )? )
            {
                // Haxe.g:362:42: ^( NEW ( type )? ( exprListOpt )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_NEW.nextNode(), root_1);

                // Haxe.g:362:48: ( type )?
                if ( stream_type.hasNext() ) {
                    adaptor.addChild(root_1, stream_type.nextTree());

                }
                stream_type.reset();
                // Haxe.g:362:54: ( exprListOpt )?
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
            if ( state.backtracking>0 ) { memoize(input, 57, newExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "newExpr"

    public static class cast_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "cast"
    // Haxe.g:365:1: cast : ( CAST LPAREN expr ( COMMA funcType )? RPAREN -> ^( CAST ( expr )? ( funcType )? ) | CAST LPAREN expr RPAREN -> ^( CAST ( expr )? ) );
    public final HaxeParser.cast_return cast() throws RecognitionException {
        HaxeParser.cast_return retval = new HaxeParser.cast_return();
        retval.start = input.LT(1);
        int cast_StartIndex = input.index();
        Object root_0 = null;

        Token CAST277=null;
        Token LPAREN278=null;
        Token COMMA280=null;
        Token RPAREN282=null;
        Token CAST283=null;
        Token LPAREN284=null;
        Token RPAREN286=null;
        HaxeParser.expr_return expr279 = null;

        HaxeParser.funcType_return funcType281 = null;

        HaxeParser.expr_return expr285 = null;


        Object CAST277_tree=null;
        Object LPAREN278_tree=null;
        Object COMMA280_tree=null;
        Object RPAREN282_tree=null;
        Object CAST283_tree=null;
        Object LPAREN284_tree=null;
        Object RPAREN286_tree=null;
        RewriteRuleTokenStream stream_CAST=new RewriteRuleTokenStream(adaptor,"token CAST");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_funcType=new RewriteRuleSubtreeStream(adaptor,"rule funcType");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 58) ) { return retval; }
            // Haxe.g:365:9: ( CAST LPAREN expr ( COMMA funcType )? RPAREN -> ^( CAST ( expr )? ( funcType )? ) | CAST LPAREN expr RPAREN -> ^( CAST ( expr )? ) )
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==CAST) ) {
                int LA63_1 = input.LA(2);

                if ( (synpred119_Haxe()) ) {
                    alt63=1;
                }
                else if ( (true) ) {
                    alt63=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 63, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }
            switch (alt63) {
                case 1 :
                    // Haxe.g:365:11: CAST LPAREN expr ( COMMA funcType )? RPAREN
                    {
                    CAST277=(Token)match(input,CAST,FOLLOW_CAST_in_cast2453); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CAST.add(CAST277);

                    LPAREN278=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_cast2455); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN278);

                    pushFollow(FOLLOW_expr_in_cast2457);
                    expr279=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr279.getTree());
                    // Haxe.g:365:28: ( COMMA funcType )?
                    int alt62=2;
                    int LA62_0 = input.LA(1);

                    if ( (LA62_0==COMMA) ) {
                        alt62=1;
                    }
                    switch (alt62) {
                        case 1 :
                            // Haxe.g:365:29: COMMA funcType
                            {
                            COMMA280=(Token)match(input,COMMA,FOLLOW_COMMA_in_cast2460); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_COMMA.add(COMMA280);

                            pushFollow(FOLLOW_funcType_in_cast2462);
                            funcType281=funcType();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_funcType.add(funcType281.getTree());

                            }
                            break;

                    }

                    RPAREN282=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_cast2466); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN282);



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
                    // 365:54: -> ^( CAST ( expr )? ( funcType )? )
                    {
                        // Haxe.g:365:57: ^( CAST ( expr )? ( funcType )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_CAST.nextNode(), root_1);

                        // Haxe.g:365:64: ( expr )?
                        if ( stream_expr.hasNext() ) {
                            adaptor.addChild(root_1, stream_expr.nextTree());

                        }
                        stream_expr.reset();
                        // Haxe.g:365:70: ( funcType )?
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
                    // Haxe.g:366:4: CAST LPAREN expr RPAREN
                    {
                    CAST283=(Token)match(input,CAST,FOLLOW_CAST_in_cast2484); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CAST.add(CAST283);

                    LPAREN284=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_cast2486); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN284);

                    pushFollow(FOLLOW_expr_in_cast2488);
                    expr285=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr285.getTree());
                    RPAREN286=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_cast2490); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN286);



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
                    // 366:31: -> ^( CAST ( expr )? )
                    {
                        // Haxe.g:366:34: ^( CAST ( expr )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_CAST.nextNode(), root_1);

                        // Haxe.g:366:41: ( expr )?
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
            if ( state.backtracking>0 ) { memoize(input, 58, cast_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "cast"

    public static class topLevelDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "topLevelDecl"
    // Haxe.g:372:1: topLevelDecl : ( classDecl | interfaceDecl | enumDecl | typedefDecl );
    public final HaxeParser.topLevelDecl_return topLevelDecl() throws RecognitionException {
        HaxeParser.topLevelDecl_return retval = new HaxeParser.topLevelDecl_return();
        retval.start = input.LT(1);
        int topLevelDecl_StartIndex = input.index();
        Object root_0 = null;

        HaxeParser.classDecl_return classDecl287 = null;

        HaxeParser.interfaceDecl_return interfaceDecl288 = null;

        HaxeParser.enumDecl_return enumDecl289 = null;

        HaxeParser.typedefDecl_return typedefDecl290 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 59) ) { return retval; }
            // Haxe.g:373:2: ( classDecl | interfaceDecl | enumDecl | typedefDecl )
            int alt64=4;
            switch ( input.LA(1) ) {
            case MONKEYS_AT:
                {
                int LA64_1 = input.LA(2);

                if ( (synpred120_Haxe()) ) {
                    alt64=1;
                }
                else if ( (synpred121_Haxe()) ) {
                    alt64=2;
                }
                else if ( (synpred122_Haxe()) ) {
                    alt64=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 64, 1, input);

                    throw nvae;
                }
                }
                break;
            case EXTERN:
            case PRIVATE:
                {
                int LA64_2 = input.LA(2);

                if ( (synpred120_Haxe()) ) {
                    alt64=1;
                }
                else if ( (synpred121_Haxe()) ) {
                    alt64=2;
                }
                else if ( (synpred122_Haxe()) ) {
                    alt64=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 64, 2, input);

                    throw nvae;
                }
                }
                break;
            case CLASS:
                {
                alt64=1;
                }
                break;
            case INTERFACE:
                {
                alt64=2;
                }
                break;
            case ENUM:
                {
                alt64=3;
                }
                break;
            case TYPEDEF:
                {
                alt64=4;
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
                    // Haxe.g:373:4: classDecl
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_classDecl_in_topLevelDecl2524);
                    classDecl287=classDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, classDecl287.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:374:4: interfaceDecl
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_interfaceDecl_in_topLevelDecl2529);
                    interfaceDecl288=interfaceDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceDecl288.getTree());

                    }
                    break;
                case 3 :
                    // Haxe.g:375:11: enumDecl
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_enumDecl_in_topLevelDecl2541);
                    enumDecl289=enumDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, enumDecl289.getTree());

                    }
                    break;
                case 4 :
                    // Haxe.g:376:4: typedefDecl
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_typedefDecl_in_topLevelDecl2546);
                    typedefDecl290=typedefDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typedefDecl290.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 59, topLevelDecl_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "topLevelDecl"

    public static class enumDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "enumDecl"
    // Haxe.g:379:1: enumDecl : typeDeclFlags ENUM IDENTIFIER typeParamOpt LBRACE enumBody RBRACE -> ^( ENUM ( IDENTIFIER )? ( typeParamOpt )? ( enumBody )? ) ;
    public final HaxeParser.enumDecl_return enumDecl() throws RecognitionException {
        HaxeParser.enumDecl_return retval = new HaxeParser.enumDecl_return();
        retval.start = input.LT(1);
        int enumDecl_StartIndex = input.index();
        Object root_0 = null;

        Token ENUM292=null;
        Token IDENTIFIER293=null;
        Token LBRACE295=null;
        Token RBRACE297=null;
        HaxeParser.typeDeclFlags_return typeDeclFlags291 = null;

        HaxeParser.typeParamOpt_return typeParamOpt294 = null;

        HaxeParser.enumBody_return enumBody296 = null;


        Object ENUM292_tree=null;
        Object IDENTIFIER293_tree=null;
        Object LBRACE295_tree=null;
        Object RBRACE297_tree=null;
        RewriteRuleTokenStream stream_ENUM=new RewriteRuleTokenStream(adaptor,"token ENUM");
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_typeDeclFlags=new RewriteRuleSubtreeStream(adaptor,"rule typeDeclFlags");
        RewriteRuleSubtreeStream stream_enumBody=new RewriteRuleSubtreeStream(adaptor,"rule enumBody");
        RewriteRuleSubtreeStream stream_typeParamOpt=new RewriteRuleSubtreeStream(adaptor,"rule typeParamOpt");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 60) ) { return retval; }
            // Haxe.g:379:9: ( typeDeclFlags ENUM IDENTIFIER typeParamOpt LBRACE enumBody RBRACE -> ^( ENUM ( IDENTIFIER )? ( typeParamOpt )? ( enumBody )? ) )
            // Haxe.g:379:11: typeDeclFlags ENUM IDENTIFIER typeParamOpt LBRACE enumBody RBRACE
            {
            pushFollow(FOLLOW_typeDeclFlags_in_enumDecl2556);
            typeDeclFlags291=typeDeclFlags();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeDeclFlags.add(typeDeclFlags291.getTree());
            ENUM292=(Token)match(input,ENUM,FOLLOW_ENUM_in_enumDecl2558); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ENUM.add(ENUM292);

            IDENTIFIER293=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_enumDecl2560); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER293);

            pushFollow(FOLLOW_typeParamOpt_in_enumDecl2562);
            typeParamOpt294=typeParamOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeParamOpt.add(typeParamOpt294.getTree());
            LBRACE295=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_enumDecl2564); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACE.add(LBRACE295);

            pushFollow(FOLLOW_enumBody_in_enumDecl2566);
            enumBody296=enumBody();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_enumBody.add(enumBody296.getTree());
            RBRACE297=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_enumDecl2568); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACE.add(RBRACE297);



            // AST REWRITE
            // elements: IDENTIFIER, ENUM, enumBody, typeParamOpt
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 379:77: -> ^( ENUM ( IDENTIFIER )? ( typeParamOpt )? ( enumBody )? )
            {
                // Haxe.g:379:80: ^( ENUM ( IDENTIFIER )? ( typeParamOpt )? ( enumBody )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_ENUM.nextNode(), root_1);

                // Haxe.g:379:87: ( IDENTIFIER )?
                if ( stream_IDENTIFIER.hasNext() ) {
                    adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());

                }
                stream_IDENTIFIER.reset();
                // Haxe.g:379:99: ( typeParamOpt )?
                if ( stream_typeParamOpt.hasNext() ) {
                    adaptor.addChild(root_1, stream_typeParamOpt.nextTree());

                }
                stream_typeParamOpt.reset();
                // Haxe.g:379:113: ( enumBody )?
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
            if ( state.backtracking>0 ) { memoize(input, 60, enumDecl_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "enumDecl"

    public static class enumBody_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "enumBody"
    // Haxe.g:382:1: enumBody : ( enumValueDecl )* ;
    public final HaxeParser.enumBody_return enumBody() throws RecognitionException {
        HaxeParser.enumBody_return retval = new HaxeParser.enumBody_return();
        retval.start = input.LT(1);
        int enumBody_StartIndex = input.index();
        Object root_0 = null;

        HaxeParser.enumValueDecl_return enumValueDecl298 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 61) ) { return retval; }
            // Haxe.g:382:9: ( ( enumValueDecl )* )
            // Haxe.g:382:11: ( enumValueDecl )*
            {
            root_0 = (Object)adaptor.nil();

            // Haxe.g:382:11: ( enumValueDecl )*
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( (LA65_0==IDENTIFIER) ) {
                    alt65=1;
                }


                switch (alt65) {
            	case 1 :
            	    // Haxe.g:382:12: enumValueDecl
            	    {
            	    pushFollow(FOLLOW_enumValueDecl_in_enumBody2594);
            	    enumValueDecl298=enumValueDecl();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, enumValueDecl298.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 61, enumBody_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "enumBody"

    public static class enumValueDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "enumValueDecl"
    // Haxe.g:385:1: enumValueDecl : ( IDENTIFIER LPAREN paramList RPAREN SEMI -> ^( IDENTIFIER[$IDENTIFIER] ( IDENTIFIER )? ( paramList )? ) | IDENTIFIER SEMI -> ^( IDENTIFIER[$IDENTIFIER] ( IDENTIFIER )? ) );
    public final HaxeParser.enumValueDecl_return enumValueDecl() throws RecognitionException {
        HaxeParser.enumValueDecl_return retval = new HaxeParser.enumValueDecl_return();
        retval.start = input.LT(1);
        int enumValueDecl_StartIndex = input.index();
        Object root_0 = null;

        Token IDENTIFIER299=null;
        Token LPAREN300=null;
        Token RPAREN302=null;
        Token SEMI303=null;
        Token IDENTIFIER304=null;
        Token SEMI305=null;
        HaxeParser.paramList_return paramList301 = null;


        Object IDENTIFIER299_tree=null;
        Object LPAREN300_tree=null;
        Object RPAREN302_tree=null;
        Object SEMI303_tree=null;
        Object IDENTIFIER304_tree=null;
        Object SEMI305_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_paramList=new RewriteRuleSubtreeStream(adaptor,"rule paramList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 62) ) { return retval; }
            // Haxe.g:386:2: ( IDENTIFIER LPAREN paramList RPAREN SEMI -> ^( IDENTIFIER[$IDENTIFIER] ( IDENTIFIER )? ( paramList )? ) | IDENTIFIER SEMI -> ^( IDENTIFIER[$IDENTIFIER] ( IDENTIFIER )? ) )
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==IDENTIFIER) ) {
                int LA66_1 = input.LA(2);

                if ( (LA66_1==LPAREN) ) {
                    alt66=1;
                }
                else if ( (LA66_1==SEMI) ) {
                    alt66=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 66, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }
            switch (alt66) {
                case 1 :
                    // Haxe.g:386:4: IDENTIFIER LPAREN paramList RPAREN SEMI
                    {
                    IDENTIFIER299=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_enumValueDecl2613); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER299);

                    LPAREN300=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_enumValueDecl2615); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN300);

                    pushFollow(FOLLOW_paramList_in_enumValueDecl2617);
                    paramList301=paramList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_paramList.add(paramList301.getTree());
                    RPAREN302=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_enumValueDecl2619); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN302);

                    SEMI303=(Token)match(input,SEMI,FOLLOW_SEMI_in_enumValueDecl2621); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI303);



                    // AST REWRITE
                    // elements: IDENTIFIER, IDENTIFIER, paramList
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 386:44: -> ^( IDENTIFIER[$IDENTIFIER] ( IDENTIFIER )? ( paramList )? )
                    {
                        // Haxe.g:386:47: ^( IDENTIFIER[$IDENTIFIER] ( IDENTIFIER )? ( paramList )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new VarDeclaration(IDENTIFIER, IDENTIFIER299), root_1);

                        // Haxe.g:386:89: ( IDENTIFIER )?
                        if ( stream_IDENTIFIER.hasNext() ) {
                            adaptor.addChild(root_1, new VarUsage(stream_IDENTIFIER.nextToken()));

                        }
                        stream_IDENTIFIER.reset();
                        // Haxe.g:386:111: ( paramList )?
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
                    // Haxe.g:387:4: IDENTIFIER SEMI
                    {
                    IDENTIFIER304=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_enumValueDecl2647); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER304);

                    SEMI305=(Token)match(input,SEMI,FOLLOW_SEMI_in_enumValueDecl2649); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI305);



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
                    // 387:23: -> ^( IDENTIFIER[$IDENTIFIER] ( IDENTIFIER )? )
                    {
                        // Haxe.g:387:26: ^( IDENTIFIER[$IDENTIFIER] ( IDENTIFIER )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new VarDeclaration(IDENTIFIER, IDENTIFIER304), root_1);

                        // Haxe.g:387:68: ( IDENTIFIER )?
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
            if ( state.backtracking>0 ) { memoize(input, 62, enumValueDecl_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "enumValueDecl"

    public static class varDeclList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "varDeclList"
    // Haxe.g:391:1: varDeclList : varDecl varDeclList ;
    public final HaxeParser.varDeclList_return varDeclList() throws RecognitionException {
        HaxeParser.varDeclList_return retval = new HaxeParser.varDeclList_return();
        retval.start = input.LT(1);
        int varDeclList_StartIndex = input.index();
        Object root_0 = null;

        HaxeParser.varDecl_return varDecl306 = null;

        HaxeParser.varDeclList_return varDeclList307 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 63) ) { return retval; }
            // Haxe.g:392:2: ( varDecl varDeclList )
            // Haxe.g:392:4: varDecl varDeclList
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_varDecl_in_varDeclList2688);
            varDecl306=varDecl();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, varDecl306.getTree());
            pushFollow(FOLLOW_varDeclList_in_varDeclList2690);
            varDeclList307=varDeclList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclList307.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 63, varDeclList_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "varDeclList"

    public static class varDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "varDecl"
    // Haxe.g:395:1: varDecl : ( declAttrList )? VAR varDeclPartList SEMI -> ^( VAR[$VAR] ( declAttrList )? ( varDeclPartList )? ) ;
    public final HaxeParser.varDecl_return varDecl() throws RecognitionException {
        HaxeParser.varDecl_return retval = new HaxeParser.varDecl_return();
        retval.start = input.LT(1);
        int varDecl_StartIndex = input.index();
        Object root_0 = null;

        Token VAR309=null;
        Token SEMI311=null;
        HaxeParser.declAttrList_return declAttrList308 = null;

        HaxeParser.varDeclPartList_return varDeclPartList310 = null;


        Object VAR309_tree=null;
        Object SEMI311_tree=null;
        RewriteRuleTokenStream stream_VAR=new RewriteRuleTokenStream(adaptor,"token VAR");
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleSubtreeStream stream_declAttrList=new RewriteRuleSubtreeStream(adaptor,"rule declAttrList");
        RewriteRuleSubtreeStream stream_varDeclPartList=new RewriteRuleSubtreeStream(adaptor,"rule varDeclPartList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 64) ) { return retval; }
            // Haxe.g:395:9: ( ( declAttrList )? VAR varDeclPartList SEMI -> ^( VAR[$VAR] ( declAttrList )? ( varDeclPartList )? ) )
            // Haxe.g:395:11: ( declAttrList )? VAR varDeclPartList SEMI
            {
            // Haxe.g:395:11: ( declAttrList )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==PRIVATE||(LA67_0>=PUBLIC && LA67_0<=OVERRIDE)) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // Haxe.g:395:12: declAttrList
                    {
                    pushFollow(FOLLOW_declAttrList_in_varDecl2702);
                    declAttrList308=declAttrList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declAttrList.add(declAttrList308.getTree());

                    }
                    break;

            }

            VAR309=(Token)match(input,VAR,FOLLOW_VAR_in_varDecl2706); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_VAR.add(VAR309);

            pushFollow(FOLLOW_varDeclPartList_in_varDecl2708);
            varDeclPartList310=varDeclPartList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_varDeclPartList.add(varDeclPartList310.getTree());
            SEMI311=(Token)match(input,SEMI,FOLLOW_SEMI_in_varDecl2710); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SEMI.add(SEMI311);



            // AST REWRITE
            // elements: VAR, declAttrList, varDeclPartList
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 395:52: -> ^( VAR[$VAR] ( declAttrList )? ( varDeclPartList )? )
            {
                // Haxe.g:395:55: ^( VAR[$VAR] ( declAttrList )? ( varDeclPartList )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new VarDeclaration(VAR, VAR309), root_1);

                // Haxe.g:395:83: ( declAttrList )?
                if ( stream_declAttrList.hasNext() ) {
                    adaptor.addChild(root_1, stream_declAttrList.nextTree());

                }
                stream_declAttrList.reset();
                // Haxe.g:395:97: ( varDeclPartList )?
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
            if ( state.backtracking>0 ) { memoize(input, 64, varDecl_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "varDecl"

    public static class varDeclPartList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "varDeclPartList"
    // Haxe.g:398:1: varDeclPartList : varDeclPart ( COMMA varDeclPart )* ;
    public final HaxeParser.varDeclPartList_return varDeclPartList() throws RecognitionException {
        HaxeParser.varDeclPartList_return retval = new HaxeParser.varDeclPartList_return();
        retval.start = input.LT(1);
        int varDeclPartList_StartIndex = input.index();
        Object root_0 = null;

        Token COMMA313=null;
        HaxeParser.varDeclPart_return varDeclPart312 = null;

        HaxeParser.varDeclPart_return varDeclPart314 = null;


        Object COMMA313_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 65) ) { return retval; }
            // Haxe.g:399:2: ( varDeclPart ( COMMA varDeclPart )* )
            // Haxe.g:399:4: varDeclPart ( COMMA varDeclPart )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_varDeclPart_in_varDeclPartList2741);
            varDeclPart312=varDeclPart();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclPart312.getTree());
            // Haxe.g:399:16: ( COMMA varDeclPart )*
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( (LA68_0==COMMA) ) {
                    alt68=1;
                }


                switch (alt68) {
            	case 1 :
            	    // Haxe.g:399:17: COMMA varDeclPart
            	    {
            	    COMMA313=(Token)match(input,COMMA,FOLLOW_COMMA_in_varDeclPartList2744); if (state.failed) return retval;
            	    pushFollow(FOLLOW_varDeclPart_in_varDeclPartList2747);
            	    varDeclPart314=varDeclPart();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclPart314.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 65, varDeclPartList_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "varDeclPartList"

    public static class varDeclPart_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "varDeclPart"
    // Haxe.g:402:1: varDeclPart : IDENTIFIER propDeclOpt typeTagOpt varInit ;
    public final HaxeParser.varDeclPart_return varDeclPart() throws RecognitionException {
        HaxeParser.varDeclPart_return retval = new HaxeParser.varDeclPart_return();
        retval.start = input.LT(1);
        int varDeclPart_StartIndex = input.index();
        Object root_0 = null;

        Token IDENTIFIER315=null;
        HaxeParser.propDeclOpt_return propDeclOpt316 = null;

        HaxeParser.typeTagOpt_return typeTagOpt317 = null;

        HaxeParser.varInit_return varInit318 = null;


        Object IDENTIFIER315_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 66) ) { return retval; }
            // Haxe.g:403:2: ( IDENTIFIER propDeclOpt typeTagOpt varInit )
            // Haxe.g:403:4: IDENTIFIER propDeclOpt typeTagOpt varInit
            {
            root_0 = (Object)adaptor.nil();

            IDENTIFIER315=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_varDeclPart2761); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER315_tree = new VarUsage(IDENTIFIER315) ;
            adaptor.addChild(root_0, IDENTIFIER315_tree);
            }
            pushFollow(FOLLOW_propDeclOpt_in_varDeclPart2766);
            propDeclOpt316=propDeclOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, propDeclOpt316.getTree());
            pushFollow(FOLLOW_typeTagOpt_in_varDeclPart2768);
            typeTagOpt317=typeTagOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, typeTagOpt317.getTree());
            pushFollow(FOLLOW_varInit_in_varDeclPart2770);
            varInit318=varInit();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, varInit318.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 66, varDeclPart_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "varDeclPart"

    public static class propDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "propDecl"
    // Haxe.g:406:1: propDecl : LPAREN a1= propAccessor COMMA a2= propAccessor RPAREN -> ^( PROPERTY_DECL[\"PROPERTY_DECL\",true] ( $a1)? ( $a2)? ) ;
    public final HaxeParser.propDecl_return propDecl() throws RecognitionException {
        HaxeParser.propDecl_return retval = new HaxeParser.propDecl_return();
        retval.start = input.LT(1);
        int propDecl_StartIndex = input.index();
        Object root_0 = null;

        Token LPAREN319=null;
        Token COMMA320=null;
        Token RPAREN321=null;
        HaxeParser.propAccessor_return a1 = null;

        HaxeParser.propAccessor_return a2 = null;


        Object LPAREN319_tree=null;
        Object COMMA320_tree=null;
        Object RPAREN321_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_propAccessor=new RewriteRuleSubtreeStream(adaptor,"rule propAccessor");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 67) ) { return retval; }
            // Haxe.g:406:9: ( LPAREN a1= propAccessor COMMA a2= propAccessor RPAREN -> ^( PROPERTY_DECL[\"PROPERTY_DECL\",true] ( $a1)? ( $a2)? ) )
            // Haxe.g:406:11: LPAREN a1= propAccessor COMMA a2= propAccessor RPAREN
            {
            LPAREN319=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_propDecl2780); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN319);

            pushFollow(FOLLOW_propAccessor_in_propDecl2784);
            a1=propAccessor();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_propAccessor.add(a1.getTree());
            COMMA320=(Token)match(input,COMMA,FOLLOW_COMMA_in_propDecl2786); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COMMA.add(COMMA320);

            pushFollow(FOLLOW_propAccessor_in_propDecl2790);
            a2=propAccessor();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_propAccessor.add(a2.getTree());
            RPAREN321=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_propDecl2792); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN321);



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
            // 406:63: -> ^( PROPERTY_DECL[\"PROPERTY_DECL\",true] ( $a1)? ( $a2)? )
            {
                // Haxe.g:406:66: ^( PROPERTY_DECL[\"PROPERTY_DECL\",true] ( $a1)? ( $a2)? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new HaxeTree(PROPERTY_DECL, "PROPERTY_DECL", true), root_1);

                // Haxe.g:406:114: ( $a1)?
                if ( stream_a1.hasNext() ) {
                    adaptor.addChild(root_1, stream_a1.nextTree());

                }
                stream_a1.reset();
                // Haxe.g:406:119: ( $a2)?
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
            if ( state.backtracking>0 ) { memoize(input, 67, propDecl_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "propDecl"

    public static class propAccessor_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "propAccessor"
    // Haxe.g:409:1: propAccessor : ( IDENTIFIER | NULL | DEFAULT | DYNAMIC );
    public final HaxeParser.propAccessor_return propAccessor() throws RecognitionException {
        HaxeParser.propAccessor_return retval = new HaxeParser.propAccessor_return();
        retval.start = input.LT(1);
        int propAccessor_StartIndex = input.index();
        Object root_0 = null;

        Token set322=null;

        Object set322_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 68) ) { return retval; }
            // Haxe.g:410:2: ( IDENTIFIER | NULL | DEFAULT | DYNAMIC )
            // Haxe.g:
            {
            root_0 = (Object)adaptor.nil();

            set322=(Token)input.LT(1);
            if ( input.LA(1)==IDENTIFIER||input.LA(1)==DYNAMIC||input.LA(1)==DEFAULT||input.LA(1)==NULL ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set322));
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
            if ( state.backtracking>0 ) { memoize(input, 68, propAccessor_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "propAccessor"

    public static class propDeclOpt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "propDeclOpt"
    // Haxe.g:416:1: propDeclOpt : ( propDecl | );
    public final HaxeParser.propDeclOpt_return propDeclOpt() throws RecognitionException {
        HaxeParser.propDeclOpt_return retval = new HaxeParser.propDeclOpt_return();
        retval.start = input.LT(1);
        int propDeclOpt_StartIndex = input.index();
        Object root_0 = null;

        HaxeParser.propDecl_return propDecl323 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 69) ) { return retval; }
            // Haxe.g:417:2: ( propDecl | )
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==LPAREN) ) {
                alt69=1;
            }
            else if ( (LA69_0==EOF||LA69_0==SEMI||LA69_0==RPAREN||LA69_0==COLON||LA69_0==COMMA||LA69_0==EQ||LA69_0==LBRACE) ) {
                alt69=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;
            }
            switch (alt69) {
                case 1 :
                    // Haxe.g:417:4: propDecl
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_propDecl_in_propDeclOpt2852);
                    propDecl323=propDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, propDecl323.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:419:2: 
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
            if ( state.backtracking>0 ) { memoize(input, 69, propDeclOpt_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "propDeclOpt"

    public static class varInit_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "varInit"
    // Haxe.g:421:1: varInit : ( EQ expr -> ^( VAR_INIT[\"VAR_INIT\",true] ( expr )? ) | );
    public final HaxeParser.varInit_return varInit() throws RecognitionException {
        HaxeParser.varInit_return retval = new HaxeParser.varInit_return();
        retval.start = input.LT(1);
        int varInit_StartIndex = input.index();
        Object root_0 = null;

        Token EQ324=null;
        HaxeParser.expr_return expr325 = null;


        Object EQ324_tree=null;
        RewriteRuleTokenStream stream_EQ=new RewriteRuleTokenStream(adaptor,"token EQ");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 70) ) { return retval; }
            // Haxe.g:421:9: ( EQ expr -> ^( VAR_INIT[\"VAR_INIT\",true] ( expr )? ) | )
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==EQ) ) {
                alt70=1;
            }
            else if ( (LA70_0==EOF||LA70_0==SEMI||LA70_0==RPAREN||LA70_0==COMMA) ) {
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
                    // Haxe.g:421:11: EQ expr
                    {
                    EQ324=(Token)match(input,EQ,FOLLOW_EQ_in_varInit2867); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EQ.add(EQ324);

                    pushFollow(FOLLOW_expr_in_varInit2869);
                    expr325=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr325.getTree());


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
                    // 421:19: -> ^( VAR_INIT[\"VAR_INIT\",true] ( expr )? )
                    {
                        // Haxe.g:421:22: ^( VAR_INIT[\"VAR_INIT\",true] ( expr )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new HaxeTree(VAR_INIT, "VAR_INIT", true), root_1);

                        // Haxe.g:421:60: ( expr )?
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
                    // Haxe.g:423:2: 
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
            if ( state.backtracking>0 ) { memoize(input, 70, varInit_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "varInit"

    public static class funcDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "funcDecl"
    // Haxe.g:425:1: funcDecl : ( ( declAttrList )? FUNCTION NEW LPAREN paramList RPAREN typeTagOpt block -> ^( FUNCTION NEW ( declAttrList )? ( paramList )? ( typeTagOpt )? ( block )? ) | ( declAttrList )? FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt block -> ^( FUNCTION IDENTIFIER ( declAttrList )? ( paramList )? ( typeTagOpt )? ( block )? ( typeParamOpt )? ) );
    public final HaxeParser.funcDecl_return funcDecl() throws RecognitionException {
        HaxeParser.funcDecl_return retval = new HaxeParser.funcDecl_return();
        retval.start = input.LT(1);
        int funcDecl_StartIndex = input.index();
        Object root_0 = null;

        Token FUNCTION327=null;
        Token NEW328=null;
        Token LPAREN329=null;
        Token RPAREN331=null;
        Token FUNCTION335=null;
        Token IDENTIFIER336=null;
        Token LPAREN338=null;
        Token RPAREN340=null;
        HaxeParser.declAttrList_return declAttrList326 = null;

        HaxeParser.paramList_return paramList330 = null;

        HaxeParser.typeTagOpt_return typeTagOpt332 = null;

        HaxeParser.block_return block333 = null;

        HaxeParser.declAttrList_return declAttrList334 = null;

        HaxeParser.typeParamOpt_return typeParamOpt337 = null;

        HaxeParser.paramList_return paramList339 = null;

        HaxeParser.typeTagOpt_return typeTagOpt341 = null;

        HaxeParser.block_return block342 = null;


        Object FUNCTION327_tree=null;
        Object NEW328_tree=null;
        Object LPAREN329_tree=null;
        Object RPAREN331_tree=null;
        Object FUNCTION335_tree=null;
        Object IDENTIFIER336_tree=null;
        Object LPAREN338_tree=null;
        Object RPAREN340_tree=null;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 71) ) { return retval; }
            // Haxe.g:425:9: ( ( declAttrList )? FUNCTION NEW LPAREN paramList RPAREN typeTagOpt block -> ^( FUNCTION NEW ( declAttrList )? ( paramList )? ( typeTagOpt )? ( block )? ) | ( declAttrList )? FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt block -> ^( FUNCTION IDENTIFIER ( declAttrList )? ( paramList )? ( typeTagOpt )? ( block )? ( typeParamOpt )? ) )
            int alt73=2;
            alt73 = dfa73.predict(input);
            switch (alt73) {
                case 1 :
                    // Haxe.g:425:11: ( declAttrList )? FUNCTION NEW LPAREN paramList RPAREN typeTagOpt block
                    {
                    // Haxe.g:425:11: ( declAttrList )?
                    int alt71=2;
                    int LA71_0 = input.LA(1);

                    if ( (LA71_0==PRIVATE||(LA71_0>=PUBLIC && LA71_0<=OVERRIDE)) ) {
                        alt71=1;
                    }
                    switch (alt71) {
                        case 1 :
                            // Haxe.g:0:0: declAttrList
                            {
                            pushFollow(FOLLOW_declAttrList_in_funcDecl2896);
                            declAttrList326=declAttrList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_declAttrList.add(declAttrList326.getTree());

                            }
                            break;

                    }

                    FUNCTION327=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcDecl2899); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION327);

                    NEW328=(Token)match(input,NEW,FOLLOW_NEW_in_funcDecl2901); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEW.add(NEW328);

                    LPAREN329=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcDecl2903); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN329);

                    pushFollow(FOLLOW_paramList_in_funcDecl2905);
                    paramList330=paramList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_paramList.add(paramList330.getTree());
                    RPAREN331=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcDecl2907); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN331);

                    pushFollow(FOLLOW_typeTagOpt_in_funcDecl2909);
                    typeTagOpt332=typeTagOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeTagOpt.add(typeTagOpt332.getTree());
                    pushFollow(FOLLOW_block_in_funcDecl2911);
                    block333=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block333.getTree());


                    // AST REWRITE
                    // elements: declAttrList, block, FUNCTION, paramList, typeTagOpt, NEW
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 426:4: -> ^( FUNCTION NEW ( declAttrList )? ( paramList )? ( typeTagOpt )? ( block )? )
                    {
                        // Haxe.g:426:7: ^( FUNCTION NEW ( declAttrList )? ( paramList )? ( typeTagOpt )? ( block )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new FunctionNode(stream_FUNCTION.nextToken()), root_1);

                        adaptor.addChild(root_1, stream_NEW.nextNode());
                        // Haxe.g:426:36: ( declAttrList )?
                        if ( stream_declAttrList.hasNext() ) {
                            adaptor.addChild(root_1, stream_declAttrList.nextTree());

                        }
                        stream_declAttrList.reset();
                        // Haxe.g:426:50: ( paramList )?
                        if ( stream_paramList.hasNext() ) {
                            adaptor.addChild(root_1, stream_paramList.nextTree());

                        }
                        stream_paramList.reset();
                        // Haxe.g:426:61: ( typeTagOpt )?
                        if ( stream_typeTagOpt.hasNext() ) {
                            adaptor.addChild(root_1, stream_typeTagOpt.nextTree());

                        }
                        stream_typeTagOpt.reset();
                        // Haxe.g:426:73: ( block )?
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
                    // Haxe.g:427:4: ( declAttrList )? FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt block
                    {
                    // Haxe.g:427:4: ( declAttrList )?
                    int alt72=2;
                    int LA72_0 = input.LA(1);

                    if ( (LA72_0==PRIVATE||(LA72_0>=PUBLIC && LA72_0<=OVERRIDE)) ) {
                        alt72=1;
                    }
                    switch (alt72) {
                        case 1 :
                            // Haxe.g:0:0: declAttrList
                            {
                            pushFollow(FOLLOW_declAttrList_in_funcDecl2944);
                            declAttrList334=declAttrList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_declAttrList.add(declAttrList334.getTree());

                            }
                            break;

                    }

                    FUNCTION335=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcDecl2947); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION335);

                    IDENTIFIER336=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_funcDecl2949); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER336);

                    pushFollow(FOLLOW_typeParamOpt_in_funcDecl2951);
                    typeParamOpt337=typeParamOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeParamOpt.add(typeParamOpt337.getTree());
                    LPAREN338=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcDecl2953); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN338);

                    pushFollow(FOLLOW_paramList_in_funcDecl2955);
                    paramList339=paramList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_paramList.add(paramList339.getTree());
                    RPAREN340=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcDecl2957); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN340);

                    pushFollow(FOLLOW_typeTagOpt_in_funcDecl2959);
                    typeTagOpt341=typeTagOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeTagOpt.add(typeTagOpt341.getTree());
                    pushFollow(FOLLOW_block_in_funcDecl2961);
                    block342=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block342.getTree());


                    // AST REWRITE
                    // elements: block, IDENTIFIER, declAttrList, typeParamOpt, paramList, FUNCTION, typeTagOpt
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 428:4: -> ^( FUNCTION IDENTIFIER ( declAttrList )? ( paramList )? ( typeTagOpt )? ( block )? ( typeParamOpt )? )
                    {
                        // Haxe.g:428:7: ^( FUNCTION IDENTIFIER ( declAttrList )? ( paramList )? ( typeTagOpt )? ( block )? ( typeParamOpt )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new FunctionNode(stream_FUNCTION.nextToken()), root_1);

                        adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
                        // Haxe.g:428:43: ( declAttrList )?
                        if ( stream_declAttrList.hasNext() ) {
                            adaptor.addChild(root_1, stream_declAttrList.nextTree());

                        }
                        stream_declAttrList.reset();
                        // Haxe.g:428:57: ( paramList )?
                        if ( stream_paramList.hasNext() ) {
                            adaptor.addChild(root_1, stream_paramList.nextTree());

                        }
                        stream_paramList.reset();
                        // Haxe.g:428:68: ( typeTagOpt )?
                        if ( stream_typeTagOpt.hasNext() ) {
                            adaptor.addChild(root_1, stream_typeTagOpt.nextTree());

                        }
                        stream_typeTagOpt.reset();
                        // Haxe.g:428:80: ( block )?
                        if ( stream_block.hasNext() ) {
                            adaptor.addChild(root_1, stream_block.nextTree());

                        }
                        stream_block.reset();
                        // Haxe.g:428:87: ( typeParamOpt )?
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
            if ( state.backtracking>0 ) { memoize(input, 71, funcDecl_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "funcDecl"

    public static class funcProtoDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "funcProtoDecl"
    // Haxe.g:431:1: funcProtoDecl : ( declAttrList FUNCTION NEW LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTagOpt )? ( declAttrList )? ) | declAttrList FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTagOpt )? ( declAttrList )? ( typeParamOpt )? ) | FUNCTION NEW LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTagOpt )? ) | FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTagOpt )? ( typeParamOpt )? ) );
    public final HaxeParser.funcProtoDecl_return funcProtoDecl() throws RecognitionException {
        HaxeParser.funcProtoDecl_return retval = new HaxeParser.funcProtoDecl_return();
        retval.start = input.LT(1);
        int funcProtoDecl_StartIndex = input.index();
        Object root_0 = null;

        Token FUNCTION344=null;
        Token NEW345=null;
        Token LPAREN346=null;
        Token RPAREN348=null;
        Token SEMI350=null;
        Token FUNCTION352=null;
        Token IDENTIFIER353=null;
        Token LPAREN355=null;
        Token RPAREN357=null;
        Token SEMI359=null;
        Token FUNCTION360=null;
        Token NEW361=null;
        Token LPAREN362=null;
        Token RPAREN364=null;
        Token SEMI366=null;
        Token FUNCTION367=null;
        Token IDENTIFIER368=null;
        Token LPAREN370=null;
        Token RPAREN372=null;
        Token SEMI374=null;
        HaxeParser.declAttrList_return declAttrList343 = null;

        HaxeParser.paramList_return paramList347 = null;

        HaxeParser.typeTagOpt_return typeTagOpt349 = null;

        HaxeParser.declAttrList_return declAttrList351 = null;

        HaxeParser.typeParamOpt_return typeParamOpt354 = null;

        HaxeParser.paramList_return paramList356 = null;

        HaxeParser.typeTagOpt_return typeTagOpt358 = null;

        HaxeParser.paramList_return paramList363 = null;

        HaxeParser.typeTagOpt_return typeTagOpt365 = null;

        HaxeParser.typeParamOpt_return typeParamOpt369 = null;

        HaxeParser.paramList_return paramList371 = null;

        HaxeParser.typeTagOpt_return typeTagOpt373 = null;


        Object FUNCTION344_tree=null;
        Object NEW345_tree=null;
        Object LPAREN346_tree=null;
        Object RPAREN348_tree=null;
        Object SEMI350_tree=null;
        Object FUNCTION352_tree=null;
        Object IDENTIFIER353_tree=null;
        Object LPAREN355_tree=null;
        Object RPAREN357_tree=null;
        Object SEMI359_tree=null;
        Object FUNCTION360_tree=null;
        Object NEW361_tree=null;
        Object LPAREN362_tree=null;
        Object RPAREN364_tree=null;
        Object SEMI366_tree=null;
        Object FUNCTION367_tree=null;
        Object IDENTIFIER368_tree=null;
        Object LPAREN370_tree=null;
        Object RPAREN372_tree=null;
        Object SEMI374_tree=null;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 72) ) { return retval; }
            // Haxe.g:432:2: ( declAttrList FUNCTION NEW LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTagOpt )? ( declAttrList )? ) | declAttrList FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTagOpt )? ( declAttrList )? ( typeParamOpt )? ) | FUNCTION NEW LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTagOpt )? ) | FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTagOpt )? ( typeParamOpt )? ) )
            int alt74=4;
            alt74 = dfa74.predict(input);
            switch (alt74) {
                case 1 :
                    // Haxe.g:432:4: declAttrList FUNCTION NEW LPAREN paramList RPAREN typeTagOpt SEMI
                    {
                    pushFollow(FOLLOW_declAttrList_in_funcProtoDecl3003);
                    declAttrList343=declAttrList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declAttrList.add(declAttrList343.getTree());
                    FUNCTION344=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcProtoDecl3005); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION344);

                    NEW345=(Token)match(input,NEW,FOLLOW_NEW_in_funcProtoDecl3007); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEW.add(NEW345);

                    LPAREN346=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcProtoDecl3009); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN346);

                    pushFollow(FOLLOW_paramList_in_funcProtoDecl3011);
                    paramList347=paramList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_paramList.add(paramList347.getTree());
                    RPAREN348=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcProtoDecl3013); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN348);

                    pushFollow(FOLLOW_typeTagOpt_in_funcProtoDecl3015);
                    typeTagOpt349=typeTagOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeTagOpt.add(typeTagOpt349.getTree());
                    SEMI350=(Token)match(input,SEMI,FOLLOW_SEMI_in_funcProtoDecl3017); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI350);



                    // AST REWRITE
                    // elements: paramList, declAttrList, NEW, typeTagOpt, FUNCTION
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 433:4: -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTagOpt )? ( declAttrList )? )
                    {
                        // Haxe.g:433:7: ^( FUNCTION ( NEW )? ( paramList )? ( typeTagOpt )? ( declAttrList )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_FUNCTION.nextNode(), root_1);

                        // Haxe.g:433:18: ( NEW )?
                        if ( stream_NEW.hasNext() ) {
                            adaptor.addChild(root_1, stream_NEW.nextNode());

                        }
                        stream_NEW.reset();
                        // Haxe.g:433:23: ( paramList )?
                        if ( stream_paramList.hasNext() ) {
                            adaptor.addChild(root_1, stream_paramList.nextTree());

                        }
                        stream_paramList.reset();
                        // Haxe.g:433:34: ( typeTagOpt )?
                        if ( stream_typeTagOpt.hasNext() ) {
                            adaptor.addChild(root_1, stream_typeTagOpt.nextTree());

                        }
                        stream_typeTagOpt.reset();
                        // Haxe.g:433:46: ( declAttrList )?
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
                    // Haxe.g:434:4: declAttrList FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt SEMI
                    {
                    pushFollow(FOLLOW_declAttrList_in_funcProtoDecl3044);
                    declAttrList351=declAttrList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declAttrList.add(declAttrList351.getTree());
                    FUNCTION352=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcProtoDecl3046); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION352);

                    IDENTIFIER353=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_funcProtoDecl3048); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER353);

                    pushFollow(FOLLOW_typeParamOpt_in_funcProtoDecl3050);
                    typeParamOpt354=typeParamOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeParamOpt.add(typeParamOpt354.getTree());
                    LPAREN355=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcProtoDecl3052); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN355);

                    pushFollow(FOLLOW_paramList_in_funcProtoDecl3054);
                    paramList356=paramList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_paramList.add(paramList356.getTree());
                    RPAREN357=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcProtoDecl3056); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN357);

                    pushFollow(FOLLOW_typeTagOpt_in_funcProtoDecl3058);
                    typeTagOpt358=typeTagOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeTagOpt.add(typeTagOpt358.getTree());
                    SEMI359=(Token)match(input,SEMI,FOLLOW_SEMI_in_funcProtoDecl3060); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI359);



                    // AST REWRITE
                    // elements: paramList, typeParamOpt, typeTagOpt, FUNCTION, declAttrList, IDENTIFIER
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 435:4: -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTagOpt )? ( declAttrList )? ( typeParamOpt )? )
                    {
                        // Haxe.g:435:7: ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTagOpt )? ( declAttrList )? ( typeParamOpt )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_FUNCTION.nextNode(), root_1);

                        // Haxe.g:435:18: ( IDENTIFIER )?
                        if ( stream_IDENTIFIER.hasNext() ) {
                            adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());

                        }
                        stream_IDENTIFIER.reset();
                        // Haxe.g:435:30: ( paramList )?
                        if ( stream_paramList.hasNext() ) {
                            adaptor.addChild(root_1, stream_paramList.nextTree());

                        }
                        stream_paramList.reset();
                        // Haxe.g:435:41: ( typeTagOpt )?
                        if ( stream_typeTagOpt.hasNext() ) {
                            adaptor.addChild(root_1, stream_typeTagOpt.nextTree());

                        }
                        stream_typeTagOpt.reset();
                        // Haxe.g:435:53: ( declAttrList )?
                        if ( stream_declAttrList.hasNext() ) {
                            adaptor.addChild(root_1, stream_declAttrList.nextTree());

                        }
                        stream_declAttrList.reset();
                        // Haxe.g:435:67: ( typeParamOpt )?
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
                    // Haxe.g:436:4: FUNCTION NEW LPAREN paramList RPAREN typeTagOpt SEMI
                    {
                    FUNCTION360=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcProtoDecl3090); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION360);

                    NEW361=(Token)match(input,NEW,FOLLOW_NEW_in_funcProtoDecl3092); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEW.add(NEW361);

                    LPAREN362=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcProtoDecl3094); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN362);

                    pushFollow(FOLLOW_paramList_in_funcProtoDecl3096);
                    paramList363=paramList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_paramList.add(paramList363.getTree());
                    RPAREN364=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcProtoDecl3098); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN364);

                    pushFollow(FOLLOW_typeTagOpt_in_funcProtoDecl3100);
                    typeTagOpt365=typeTagOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeTagOpt.add(typeTagOpt365.getTree());
                    SEMI366=(Token)match(input,SEMI,FOLLOW_SEMI_in_funcProtoDecl3102); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI366);



                    // AST REWRITE
                    // elements: FUNCTION, typeTagOpt, NEW, paramList
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 437:4: -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTagOpt )? )
                    {
                        // Haxe.g:437:7: ^( FUNCTION ( NEW )? ( paramList )? ( typeTagOpt )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_FUNCTION.nextNode(), root_1);

                        // Haxe.g:437:18: ( NEW )?
                        if ( stream_NEW.hasNext() ) {
                            adaptor.addChild(root_1, stream_NEW.nextNode());

                        }
                        stream_NEW.reset();
                        // Haxe.g:437:23: ( paramList )?
                        if ( stream_paramList.hasNext() ) {
                            adaptor.addChild(root_1, stream_paramList.nextTree());

                        }
                        stream_paramList.reset();
                        // Haxe.g:437:34: ( typeTagOpt )?
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
                    // Haxe.g:438:4: FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt SEMI
                    {
                    FUNCTION367=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcProtoDecl3126); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION367);

                    IDENTIFIER368=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_funcProtoDecl3128); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER368);

                    pushFollow(FOLLOW_typeParamOpt_in_funcProtoDecl3130);
                    typeParamOpt369=typeParamOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeParamOpt.add(typeParamOpt369.getTree());
                    LPAREN370=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcProtoDecl3132); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN370);

                    pushFollow(FOLLOW_paramList_in_funcProtoDecl3134);
                    paramList371=paramList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_paramList.add(paramList371.getTree());
                    RPAREN372=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcProtoDecl3136); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN372);

                    pushFollow(FOLLOW_typeTagOpt_in_funcProtoDecl3138);
                    typeTagOpt373=typeTagOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeTagOpt.add(typeTagOpt373.getTree());
                    SEMI374=(Token)match(input,SEMI,FOLLOW_SEMI_in_funcProtoDecl3140); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI374);



                    // AST REWRITE
                    // elements: typeParamOpt, FUNCTION, IDENTIFIER, paramList, typeTagOpt
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 439:4: -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTagOpt )? ( typeParamOpt )? )
                    {
                        // Haxe.g:439:7: ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTagOpt )? ( typeParamOpt )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_FUNCTION.nextNode(), root_1);

                        // Haxe.g:439:18: ( IDENTIFIER )?
                        if ( stream_IDENTIFIER.hasNext() ) {
                            adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());

                        }
                        stream_IDENTIFIER.reset();
                        // Haxe.g:439:30: ( paramList )?
                        if ( stream_paramList.hasNext() ) {
                            adaptor.addChild(root_1, stream_paramList.nextTree());

                        }
                        stream_paramList.reset();
                        // Haxe.g:439:41: ( typeTagOpt )?
                        if ( stream_typeTagOpt.hasNext() ) {
                            adaptor.addChild(root_1, stream_typeTagOpt.nextTree());

                        }
                        stream_typeTagOpt.reset();
                        // Haxe.g:439:53: ( typeParamOpt )?
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
            if ( state.backtracking>0 ) { memoize(input, 72, funcProtoDecl_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "funcProtoDecl"

    public static class classDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "classDecl"
    // Haxe.g:442:1: classDecl : typeDeclFlags CLASS IDENTIFIER typeParamOpt inheritListOpt classBodyScope -> ^( CLASS IDENTIFIER ( typeDeclFlags )? ( typeParamOpt )? ( inheritListOpt )? ( classBodyScope )? ) ;
    public final HaxeParser.classDecl_return classDecl() throws RecognitionException {
        HaxeParser.classDecl_return retval = new HaxeParser.classDecl_return();
        retval.start = input.LT(1);
        int classDecl_StartIndex = input.index();
        Object root_0 = null;

        Token CLASS376=null;
        Token IDENTIFIER377=null;
        HaxeParser.typeDeclFlags_return typeDeclFlags375 = null;

        HaxeParser.typeParamOpt_return typeParamOpt378 = null;

        HaxeParser.inheritListOpt_return inheritListOpt379 = null;

        HaxeParser.classBodyScope_return classBodyScope380 = null;


        Object CLASS376_tree=null;
        Object IDENTIFIER377_tree=null;
        RewriteRuleTokenStream stream_CLASS=new RewriteRuleTokenStream(adaptor,"token CLASS");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleSubtreeStream stream_typeDeclFlags=new RewriteRuleSubtreeStream(adaptor,"rule typeDeclFlags");
        RewriteRuleSubtreeStream stream_classBodyScope=new RewriteRuleSubtreeStream(adaptor,"rule classBodyScope");
        RewriteRuleSubtreeStream stream_typeParamOpt=new RewriteRuleSubtreeStream(adaptor,"rule typeParamOpt");
        RewriteRuleSubtreeStream stream_inheritListOpt=new RewriteRuleSubtreeStream(adaptor,"rule inheritListOpt");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 73) ) { return retval; }
            // Haxe.g:443:2: ( typeDeclFlags CLASS IDENTIFIER typeParamOpt inheritListOpt classBodyScope -> ^( CLASS IDENTIFIER ( typeDeclFlags )? ( typeParamOpt )? ( inheritListOpt )? ( classBodyScope )? ) )
            // Haxe.g:443:4: typeDeclFlags CLASS IDENTIFIER typeParamOpt inheritListOpt classBodyScope
            {
            pushFollow(FOLLOW_typeDeclFlags_in_classDecl3174);
            typeDeclFlags375=typeDeclFlags();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeDeclFlags.add(typeDeclFlags375.getTree());
            CLASS376=(Token)match(input,CLASS,FOLLOW_CLASS_in_classDecl3176); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CLASS.add(CLASS376);

            IDENTIFIER377=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_classDecl3178); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER377);

            pushFollow(FOLLOW_typeParamOpt_in_classDecl3180);
            typeParamOpt378=typeParamOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeParamOpt.add(typeParamOpt378.getTree());
            pushFollow(FOLLOW_inheritListOpt_in_classDecl3182);
            inheritListOpt379=inheritListOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_inheritListOpt.add(inheritListOpt379.getTree());
            pushFollow(FOLLOW_classBodyScope_in_classDecl3184);
            classBodyScope380=classBodyScope();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_classBodyScope.add(classBodyScope380.getTree());


            // AST REWRITE
            // elements: inheritListOpt, IDENTIFIER, classBodyScope, typeParamOpt, CLASS, typeDeclFlags
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 444:4: -> ^( CLASS IDENTIFIER ( typeDeclFlags )? ( typeParamOpt )? ( inheritListOpt )? ( classBodyScope )? )
            {
                // Haxe.g:444:7: ^( CLASS IDENTIFIER ( typeDeclFlags )? ( typeParamOpt )? ( inheritListOpt )? ( classBodyScope )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new ClassNode(stream_CLASS.nextToken()), root_1);

                adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
                // Haxe.g:444:37: ( typeDeclFlags )?
                if ( stream_typeDeclFlags.hasNext() ) {
                    adaptor.addChild(root_1, stream_typeDeclFlags.nextTree());

                }
                stream_typeDeclFlags.reset();
                // Haxe.g:444:52: ( typeParamOpt )?
                if ( stream_typeParamOpt.hasNext() ) {
                    adaptor.addChild(root_1, stream_typeParamOpt.nextTree());

                }
                stream_typeParamOpt.reset();
                // Haxe.g:444:66: ( inheritListOpt )?
                if ( stream_inheritListOpt.hasNext() ) {
                    adaptor.addChild(root_1, stream_inheritListOpt.nextTree());

                }
                stream_inheritListOpt.reset();
                // Haxe.g:444:82: ( classBodyScope )?
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
            if ( state.backtracking>0 ) { memoize(input, 73, classDecl_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "classDecl"

    public static class classBodyScope_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "classBodyScope"
    // Haxe.g:447:1: classBodyScope : LBRACE ( classMember )* RBRACE -> ^( BLOCK_SCOPE[\"BLOCK_SCOPE\", true, $LBRACE] ( classMember )* RBRACE[$RBRACE, true] ) ;
    public final HaxeParser.classBodyScope_return classBodyScope() throws RecognitionException {
        HaxeParser.classBodyScope_return retval = new HaxeParser.classBodyScope_return();
        retval.start = input.LT(1);
        int classBodyScope_StartIndex = input.index();
        Object root_0 = null;

        Token LBRACE381=null;
        Token RBRACE383=null;
        HaxeParser.classMember_return classMember382 = null;


        Object LBRACE381_tree=null;
        Object RBRACE383_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_classMember=new RewriteRuleSubtreeStream(adaptor,"rule classMember");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 74) ) { return retval; }
            // Haxe.g:448:2: ( LBRACE ( classMember )* RBRACE -> ^( BLOCK_SCOPE[\"BLOCK_SCOPE\", true, $LBRACE] ( classMember )* RBRACE[$RBRACE, true] ) )
            // Haxe.g:448:4: LBRACE ( classMember )* RBRACE
            {
            LBRACE381=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_classBodyScope3222); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACE.add(LBRACE381);

            // Haxe.g:448:11: ( classMember )*
            loop75:
            do {
                int alt75=2;
                int LA75_0 = input.LA(1);

                if ( (LA75_0==MONKEYS_AT||(LA75_0>=EXTERN && LA75_0<=PRIVATE)||(LA75_0>=PUBLIC && LA75_0<=OVERRIDE)||LA75_0==FUNCTION||(LA75_0>=ENUM && LA75_0<=INTERFACE)) ) {
                    alt75=1;
                }


                switch (alt75) {
            	case 1 :
            	    // Haxe.g:448:12: classMember
            	    {
            	    pushFollow(FOLLOW_classMember_in_classBodyScope3225);
            	    classMember382=classMember();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_classMember.add(classMember382.getTree());

            	    }
            	    break;

            	default :
            	    break loop75;
                }
            } while (true);

            RBRACE383=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_classBodyScope3229); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACE.add(RBRACE383);



            // AST REWRITE
            // elements: classMember, RBRACE
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 448:33: -> ^( BLOCK_SCOPE[\"BLOCK_SCOPE\", true, $LBRACE] ( classMember )* RBRACE[$RBRACE, true] )
            {
                // Haxe.g:448:36: ^( BLOCK_SCOPE[\"BLOCK_SCOPE\", true, $LBRACE] ( classMember )* RBRACE[$RBRACE, true] )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new BlockScopeNode(BLOCK_SCOPE, "BLOCK_SCOPE", true, LBRACE381), root_1);

                // Haxe.g:448:96: ( classMember )*
                while ( stream_classMember.hasNext() ) {
                    adaptor.addChild(root_1, stream_classMember.nextTree());

                }
                stream_classMember.reset();
                adaptor.addChild(root_1, new HaxeTree(RBRACE, RBRACE383, true));

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
            if ( state.backtracking>0 ) { memoize(input, 74, classBodyScope_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "classBodyScope"

    public static class classMember_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "classMember"
    // Haxe.g:451:1: classMember : ( varDecl | funcDecl | enumDecl );
    public final HaxeParser.classMember_return classMember() throws RecognitionException {
        HaxeParser.classMember_return retval = new HaxeParser.classMember_return();
        retval.start = input.LT(1);
        int classMember_StartIndex = input.index();
        Object root_0 = null;

        HaxeParser.varDecl_return varDecl384 = null;

        HaxeParser.funcDecl_return funcDecl385 = null;

        HaxeParser.enumDecl_return enumDecl386 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 75) ) { return retval; }
            // Haxe.g:452:2: ( varDecl | funcDecl | enumDecl )
            int alt76=3;
            alt76 = dfa76.predict(input);
            switch (alt76) {
                case 1 :
                    // Haxe.g:452:4: varDecl
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_varDecl_in_classMember3259);
                    varDecl384=varDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDecl384.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:453:4: funcDecl
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_funcDecl_in_classMember3265);
                    funcDecl385=funcDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, funcDecl385.getTree());

                    }
                    break;
                case 3 :
                    // Haxe.g:455:4: enumDecl
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_enumDecl_in_classMember3272);
                    enumDecl386=enumDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, enumDecl386.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 75, classMember_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "classMember"

    public static class interfaceDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "interfaceDecl"
    // Haxe.g:458:1: interfaceDecl : typeDeclFlags INTERFACE type inheritListOpt LBRACE interfaceBody RBRACE ;
    public final HaxeParser.interfaceDecl_return interfaceDecl() throws RecognitionException {
        HaxeParser.interfaceDecl_return retval = new HaxeParser.interfaceDecl_return();
        retval.start = input.LT(1);
        int interfaceDecl_StartIndex = input.index();
        Object root_0 = null;

        Token INTERFACE388=null;
        Token LBRACE391=null;
        Token RBRACE393=null;
        HaxeParser.typeDeclFlags_return typeDeclFlags387 = null;

        HaxeParser.type_return type389 = null;

        HaxeParser.inheritListOpt_return inheritListOpt390 = null;

        HaxeParser.interfaceBody_return interfaceBody392 = null;


        Object INTERFACE388_tree=null;
        Object LBRACE391_tree=null;
        Object RBRACE393_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 76) ) { return retval; }
            // Haxe.g:459:2: ( typeDeclFlags INTERFACE type inheritListOpt LBRACE interfaceBody RBRACE )
            // Haxe.g:459:4: typeDeclFlags INTERFACE type inheritListOpt LBRACE interfaceBody RBRACE
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_typeDeclFlags_in_interfaceDecl3290);
            typeDeclFlags387=typeDeclFlags();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, typeDeclFlags387.getTree());
            INTERFACE388=(Token)match(input,INTERFACE,FOLLOW_INTERFACE_in_interfaceDecl3292); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            INTERFACE388_tree = (Object)adaptor.create(INTERFACE388);
            adaptor.addChild(root_0, INTERFACE388_tree);
            }
            pushFollow(FOLLOW_type_in_interfaceDecl3294);
            type389=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type389.getTree());
            pushFollow(FOLLOW_inheritListOpt_in_interfaceDecl3296);
            inheritListOpt390=inheritListOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, inheritListOpt390.getTree());
            LBRACE391=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_interfaceDecl3298); if (state.failed) return retval;
            pushFollow(FOLLOW_interfaceBody_in_interfaceDecl3301);
            interfaceBody392=interfaceBody();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceBody392.getTree());
            RBRACE393=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_interfaceDecl3303); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 76, interfaceDecl_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "interfaceDecl"

    public static class interfaceBody_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "interfaceBody"
    // Haxe.g:462:1: interfaceBody : ( varDecl interfaceBody | funcProtoDecl interfaceBody | );
    public final HaxeParser.interfaceBody_return interfaceBody() throws RecognitionException {
        HaxeParser.interfaceBody_return retval = new HaxeParser.interfaceBody_return();
        retval.start = input.LT(1);
        int interfaceBody_StartIndex = input.index();
        Object root_0 = null;

        HaxeParser.varDecl_return varDecl394 = null;

        HaxeParser.interfaceBody_return interfaceBody395 = null;

        HaxeParser.funcProtoDecl_return funcProtoDecl396 = null;

        HaxeParser.interfaceBody_return interfaceBody397 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 77) ) { return retval; }
            // Haxe.g:463:2: ( varDecl interfaceBody | funcProtoDecl interfaceBody | )
            int alt77=3;
            alt77 = dfa77.predict(input);
            switch (alt77) {
                case 1 :
                    // Haxe.g:463:4: varDecl interfaceBody
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_varDecl_in_interfaceBody3316);
                    varDecl394=varDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDecl394.getTree());
                    pushFollow(FOLLOW_interfaceBody_in_interfaceBody3318);
                    interfaceBody395=interfaceBody();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceBody395.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:464:4: funcProtoDecl interfaceBody
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_funcProtoDecl_in_interfaceBody3323);
                    funcProtoDecl396=funcProtoDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, funcProtoDecl396.getTree());
                    pushFollow(FOLLOW_interfaceBody_in_interfaceBody3325);
                    interfaceBody397=interfaceBody();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceBody397.getTree());

                    }
                    break;
                case 3 :
                    // Haxe.g:467:2: 
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
            if ( state.backtracking>0 ) { memoize(input, 77, interfaceBody_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "interfaceBody"

    public static class inheritList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "inheritList"
    // Haxe.g:469:1: inheritList : inherit ( COMMA inherit )* ;
    public final HaxeParser.inheritList_return inheritList() throws RecognitionException {
        HaxeParser.inheritList_return retval = new HaxeParser.inheritList_return();
        retval.start = input.LT(1);
        int inheritList_StartIndex = input.index();
        Object root_0 = null;

        Token COMMA399=null;
        HaxeParser.inherit_return inherit398 = null;

        HaxeParser.inherit_return inherit400 = null;


        Object COMMA399_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 78) ) { return retval; }
            // Haxe.g:470:2: ( inherit ( COMMA inherit )* )
            // Haxe.g:470:4: inherit ( COMMA inherit )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_inherit_in_inheritList3347);
            inherit398=inherit();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, inherit398.getTree());
            // Haxe.g:470:12: ( COMMA inherit )*
            loop78:
            do {
                int alt78=2;
                int LA78_0 = input.LA(1);

                if ( (LA78_0==COMMA) ) {
                    alt78=1;
                }


                switch (alt78) {
            	case 1 :
            	    // Haxe.g:470:13: COMMA inherit
            	    {
            	    COMMA399=(Token)match(input,COMMA,FOLLOW_COMMA_in_inheritList3350); if (state.failed) return retval;
            	    pushFollow(FOLLOW_inherit_in_inheritList3353);
            	    inherit400=inherit();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, inherit400.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 78, inheritList_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "inheritList"

    public static class inheritListOpt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "inheritListOpt"
    // Haxe.g:473:1: inheritListOpt : ( inheritList -> ^( INHERIT_LIST_OPT[\"INHERIT_LIST_OPT\",true] ( inheritList )? ) | );
    public final HaxeParser.inheritListOpt_return inheritListOpt() throws RecognitionException {
        HaxeParser.inheritListOpt_return retval = new HaxeParser.inheritListOpt_return();
        retval.start = input.LT(1);
        int inheritListOpt_StartIndex = input.index();
        Object root_0 = null;

        HaxeParser.inheritList_return inheritList401 = null;


        RewriteRuleSubtreeStream stream_inheritList=new RewriteRuleSubtreeStream(adaptor,"rule inheritList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 79) ) { return retval; }
            // Haxe.g:474:2: ( inheritList -> ^( INHERIT_LIST_OPT[\"INHERIT_LIST_OPT\",true] ( inheritList )? ) | )
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( ((LA79_0>=EXTENDS && LA79_0<=IMPLEMENTS)) ) {
                alt79=1;
            }
            else if ( (LA79_0==LBRACE) ) {
                alt79=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 79, 0, input);

                throw nvae;
            }
            switch (alt79) {
                case 1 :
                    // Haxe.g:474:4: inheritList
                    {
                    pushFollow(FOLLOW_inheritList_in_inheritListOpt3371);
                    inheritList401=inheritList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_inheritList.add(inheritList401.getTree());


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
                    // 474:16: -> ^( INHERIT_LIST_OPT[\"INHERIT_LIST_OPT\",true] ( inheritList )? )
                    {
                        // Haxe.g:474:19: ^( INHERIT_LIST_OPT[\"INHERIT_LIST_OPT\",true] ( inheritList )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new HaxeTree(INHERIT_LIST_OPT, "INHERIT_LIST_OPT", true), root_1);

                        // Haxe.g:474:73: ( inheritList )?
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
                    // Haxe.g:476:6: 
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
            if ( state.backtracking>0 ) { memoize(input, 79, inheritListOpt_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "inheritListOpt"

    public static class inherit_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "inherit"
    // Haxe.g:478:1: inherit : ( EXTENDS type -> ^( EXTENDS ( type )? ) | IMPLEMENTS type -> ^( IMPLEMENTS ( type )? ) );
    public final HaxeParser.inherit_return inherit() throws RecognitionException {
        HaxeParser.inherit_return retval = new HaxeParser.inherit_return();
        retval.start = input.LT(1);
        int inherit_StartIndex = input.index();
        Object root_0 = null;

        Token EXTENDS402=null;
        Token IMPLEMENTS404=null;
        HaxeParser.type_return type403 = null;

        HaxeParser.type_return type405 = null;


        Object EXTENDS402_tree=null;
        Object IMPLEMENTS404_tree=null;
        RewriteRuleTokenStream stream_IMPLEMENTS=new RewriteRuleTokenStream(adaptor,"token IMPLEMENTS");
        RewriteRuleTokenStream stream_EXTENDS=new RewriteRuleTokenStream(adaptor,"token EXTENDS");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 80) ) { return retval; }
            // Haxe.g:478:9: ( EXTENDS type -> ^( EXTENDS ( type )? ) | IMPLEMENTS type -> ^( IMPLEMENTS ( type )? ) )
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==EXTENDS) ) {
                alt80=1;
            }
            else if ( (LA80_0==IMPLEMENTS) ) {
                alt80=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 80, 0, input);

                throw nvae;
            }
            switch (alt80) {
                case 1 :
                    // Haxe.g:478:11: EXTENDS type
                    {
                    EXTENDS402=(Token)match(input,EXTENDS,FOLLOW_EXTENDS_in_inherit3407); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EXTENDS.add(EXTENDS402);

                    pushFollow(FOLLOW_type_in_inherit3409);
                    type403=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type403.getTree());


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
                    // 478:25: -> ^( EXTENDS ( type )? )
                    {
                        // Haxe.g:478:28: ^( EXTENDS ( type )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_EXTENDS.nextNode(), root_1);

                        // Haxe.g:478:38: ( type )?
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
                    // Haxe.g:479:11: IMPLEMENTS type
                    {
                    IMPLEMENTS404=(Token)match(input,IMPLEMENTS,FOLLOW_IMPLEMENTS_in_inherit3431); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IMPLEMENTS.add(IMPLEMENTS404);

                    pushFollow(FOLLOW_type_in_inherit3433);
                    type405=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type405.getTree());


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
                    // 479:27: -> ^( IMPLEMENTS ( type )? )
                    {
                        // Haxe.g:479:30: ^( IMPLEMENTS ( type )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_IMPLEMENTS.nextNode(), root_1);

                        // Haxe.g:479:43: ( type )?
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
            if ( state.backtracking>0 ) { memoize(input, 80, inherit_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "inherit"

    public static class typedefDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typedefDecl"
    // Haxe.g:482:1: typedefDecl : TYPEDEF IDENTIFIER EQ funcType ;
    public final HaxeParser.typedefDecl_return typedefDecl() throws RecognitionException {
        HaxeParser.typedefDecl_return retval = new HaxeParser.typedefDecl_return();
        retval.start = input.LT(1);
        int typedefDecl_StartIndex = input.index();
        Object root_0 = null;

        Token TYPEDEF406=null;
        Token IDENTIFIER407=null;
        Token EQ408=null;
        HaxeParser.funcType_return funcType409 = null;


        Object TYPEDEF406_tree=null;
        Object IDENTIFIER407_tree=null;
        Object EQ408_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 81) ) { return retval; }
            // Haxe.g:483:2: ( TYPEDEF IDENTIFIER EQ funcType )
            // Haxe.g:483:4: TYPEDEF IDENTIFIER EQ funcType
            {
            root_0 = (Object)adaptor.nil();

            TYPEDEF406=(Token)match(input,TYPEDEF,FOLLOW_TYPEDEF_in_typedefDecl3461); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TYPEDEF406_tree = (Object)adaptor.create(TYPEDEF406);
            adaptor.addChild(root_0, TYPEDEF406_tree);
            }
            IDENTIFIER407=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_typedefDecl3463); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER407_tree = (Object)adaptor.create(IDENTIFIER407);
            adaptor.addChild(root_0, IDENTIFIER407_tree);
            }
            EQ408=(Token)match(input,EQ,FOLLOW_EQ_in_typedefDecl3465); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            EQ408_tree = (Object)adaptor.create(EQ408);
            adaptor.addChild(root_0, EQ408_tree);
            }
            pushFollow(FOLLOW_funcType_in_typedefDecl3467);
            funcType409=funcType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, funcType409.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 81, typedefDecl_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "typedefDecl"

    public static class typeExtend_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typeExtend"
    // Haxe.g:486:1: typeExtend : GT funcType COMMA ;
    public final HaxeParser.typeExtend_return typeExtend() throws RecognitionException {
        HaxeParser.typeExtend_return retval = new HaxeParser.typeExtend_return();
        retval.start = input.LT(1);
        int typeExtend_StartIndex = input.index();
        Object root_0 = null;

        Token GT410=null;
        Token COMMA412=null;
        HaxeParser.funcType_return funcType411 = null;


        Object GT410_tree=null;
        Object COMMA412_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 82) ) { return retval; }
            // Haxe.g:487:9: ( GT funcType COMMA )
            // Haxe.g:487:11: GT funcType COMMA
            {
            root_0 = (Object)adaptor.nil();

            GT410=(Token)match(input,GT,FOLLOW_GT_in_typeExtend3486); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            GT410_tree = (Object)adaptor.create(GT410);
            adaptor.addChild(root_0, GT410_tree);
            }
            pushFollow(FOLLOW_funcType_in_typeExtend3488);
            funcType411=funcType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, funcType411.getTree());
            COMMA412=(Token)match(input,COMMA,FOLLOW_COMMA_in_typeExtend3490); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 82, typeExtend_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "typeExtend"

    public static class anonType_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "anonType"
    // Haxe.g:490:1: anonType : LBRACE ( | anonTypeFieldList | varDeclList | typeExtend ( | anonTypeFieldList | varDeclList ) ) RBRACE ;
    public final HaxeParser.anonType_return anonType() throws RecognitionException {
        HaxeParser.anonType_return retval = new HaxeParser.anonType_return();
        retval.start = input.LT(1);
        int anonType_StartIndex = input.index();
        Object root_0 = null;

        Token LBRACE413=null;
        Token RBRACE419=null;
        HaxeParser.anonTypeFieldList_return anonTypeFieldList414 = null;

        HaxeParser.varDeclList_return varDeclList415 = null;

        HaxeParser.typeExtend_return typeExtend416 = null;

        HaxeParser.anonTypeFieldList_return anonTypeFieldList417 = null;

        HaxeParser.varDeclList_return varDeclList418 = null;


        Object LBRACE413_tree=null;
        Object RBRACE419_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 83) ) { return retval; }
            // Haxe.g:490:9: ( LBRACE ( | anonTypeFieldList | varDeclList | typeExtend ( | anonTypeFieldList | varDeclList ) ) RBRACE )
            // Haxe.g:490:11: LBRACE ( | anonTypeFieldList | varDeclList | typeExtend ( | anonTypeFieldList | varDeclList ) ) RBRACE
            {
            root_0 = (Object)adaptor.nil();

            LBRACE413=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_anonType3501); if (state.failed) return retval;
            // Haxe.g:491:4: ( | anonTypeFieldList | varDeclList | typeExtend ( | anonTypeFieldList | varDeclList ) )
            int alt82=4;
            switch ( input.LA(1) ) {
            case RBRACE:
                {
                alt82=1;
                }
                break;
            case IDENTIFIER:
                {
                alt82=2;
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
                alt82=3;
                }
                break;
            case GT:
                {
                alt82=4;
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
                    // Haxe.g:492:22: 
                    {
                    }
                    break;
                case 2 :
                    // Haxe.g:492:27: anonTypeFieldList
                    {
                    pushFollow(FOLLOW_anonTypeFieldList_in_anonType3536);
                    anonTypeFieldList414=anonTypeFieldList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, anonTypeFieldList414.getTree());

                    }
                    break;
                case 3 :
                    // Haxe.g:493:26: varDeclList
                    {
                    pushFollow(FOLLOW_varDeclList_in_anonType3564);
                    varDeclList415=varDeclList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclList415.getTree());

                    }
                    break;
                case 4 :
                    // Haxe.g:494:27: typeExtend ( | anonTypeFieldList | varDeclList )
                    {
                    pushFollow(FOLLOW_typeExtend_in_anonType3593);
                    typeExtend416=typeExtend();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeExtend416.getTree());
                    // Haxe.g:494:38: ( | anonTypeFieldList | varDeclList )
                    int alt81=3;
                    switch ( input.LA(1) ) {
                    case RBRACE:
                        {
                        alt81=1;
                        }
                        break;
                    case IDENTIFIER:
                        {
                        alt81=2;
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
                        alt81=3;
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
                            // Haxe.g:495:24: 
                            {
                            }
                            break;
                        case 2 :
                            // Haxe.g:495:25: anonTypeFieldList
                            {
                            pushFollow(FOLLOW_anonTypeFieldList_in_anonType3621);
                            anonTypeFieldList417=anonTypeFieldList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, anonTypeFieldList417.getTree());

                            }
                            break;
                        case 3 :
                            // Haxe.g:496:25: varDeclList
                            {
                            pushFollow(FOLLOW_varDeclList_in_anonType3647);
                            varDeclList418=varDeclList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclList418.getTree());

                            }
                            break;

                    }


                    }
                    break;

            }

            RBRACE419=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_anonType3691); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 83, anonType_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "anonType"

    public static class anonTypeFieldList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "anonTypeFieldList"
    // Haxe.g:501:1: anonTypeFieldList : anonTypeField ( COMMA anonTypeField )* ;
    public final HaxeParser.anonTypeFieldList_return anonTypeFieldList() throws RecognitionException {
        HaxeParser.anonTypeFieldList_return retval = new HaxeParser.anonTypeFieldList_return();
        retval.start = input.LT(1);
        int anonTypeFieldList_StartIndex = input.index();
        Object root_0 = null;

        Token COMMA421=null;
        HaxeParser.anonTypeField_return anonTypeField420 = null;

        HaxeParser.anonTypeField_return anonTypeField422 = null;


        Object COMMA421_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 84) ) { return retval; }
            // Haxe.g:502:2: ( anonTypeField ( COMMA anonTypeField )* )
            // Haxe.g:502:4: anonTypeField ( COMMA anonTypeField )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_anonTypeField_in_anonTypeFieldList3705);
            anonTypeField420=anonTypeField();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, anonTypeField420.getTree());
            // Haxe.g:502:18: ( COMMA anonTypeField )*
            loop83:
            do {
                int alt83=2;
                int LA83_0 = input.LA(1);

                if ( (LA83_0==COMMA) ) {
                    alt83=1;
                }


                switch (alt83) {
            	case 1 :
            	    // Haxe.g:502:19: COMMA anonTypeField
            	    {
            	    COMMA421=(Token)match(input,COMMA,FOLLOW_COMMA_in_anonTypeFieldList3708); if (state.failed) return retval;
            	    pushFollow(FOLLOW_anonTypeField_in_anonTypeFieldList3711);
            	    anonTypeField422=anonTypeField();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, anonTypeField422.getTree());

            	    }
            	    break;

            	default :
            	    break loop83;
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
            if ( state.backtracking>0 ) { memoize(input, 84, anonTypeFieldList_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "anonTypeFieldList"

    public static class objLit_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "objLit"
    // Haxe.g:505:1: objLit : '{' objLitElemList '}' ;
    public final HaxeParser.objLit_return objLit() throws RecognitionException {
        HaxeParser.objLit_return retval = new HaxeParser.objLit_return();
        retval.start = input.LT(1);
        int objLit_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal423=null;
        Token char_literal425=null;
        HaxeParser.objLitElemList_return objLitElemList424 = null;


        Object char_literal423_tree=null;
        Object char_literal425_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 85) ) { return retval; }
            // Haxe.g:505:8: ( '{' objLitElemList '}' )
            // Haxe.g:505:10: '{' objLitElemList '}'
            {
            root_0 = (Object)adaptor.nil();

            char_literal423=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_objLit3723); if (state.failed) return retval;
            pushFollow(FOLLOW_objLitElemList_in_objLit3726);
            objLitElemList424=objLitElemList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, objLitElemList424.getTree());
            char_literal425=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_objLit3728); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 85, objLit_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "objLit"

    public static class anonTypeField_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "anonTypeField"
    // Haxe.g:508:1: anonTypeField : IDENTIFIER COLON funcType ;
    public final HaxeParser.anonTypeField_return anonTypeField() throws RecognitionException {
        HaxeParser.anonTypeField_return retval = new HaxeParser.anonTypeField_return();
        retval.start = input.LT(1);
        int anonTypeField_StartIndex = input.index();
        Object root_0 = null;

        Token IDENTIFIER426=null;
        Token COLON427=null;
        HaxeParser.funcType_return funcType428 = null;


        Object IDENTIFIER426_tree=null;
        Object COLON427_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 86) ) { return retval; }
            // Haxe.g:509:2: ( IDENTIFIER COLON funcType )
            // Haxe.g:509:4: IDENTIFIER COLON funcType
            {
            root_0 = (Object)adaptor.nil();

            IDENTIFIER426=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_anonTypeField3740); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER426_tree = (Object)adaptor.create(IDENTIFIER426);
            adaptor.addChild(root_0, IDENTIFIER426_tree);
            }
            COLON427=(Token)match(input,COLON,FOLLOW_COLON_in_anonTypeField3742); if (state.failed) return retval;
            pushFollow(FOLLOW_funcType_in_anonTypeField3745);
            funcType428=funcType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, funcType428.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 86, anonTypeField_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "anonTypeField"

    public static class objLitElemList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "objLitElemList"
    // Haxe.g:512:1: objLitElemList : objLitElem ( COMMA objLitElem )* ;
    public final HaxeParser.objLitElemList_return objLitElemList() throws RecognitionException {
        HaxeParser.objLitElemList_return retval = new HaxeParser.objLitElemList_return();
        retval.start = input.LT(1);
        int objLitElemList_StartIndex = input.index();
        Object root_0 = null;

        Token COMMA430=null;
        HaxeParser.objLitElem_return objLitElem429 = null;

        HaxeParser.objLitElem_return objLitElem431 = null;


        Object COMMA430_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 87) ) { return retval; }
            // Haxe.g:513:2: ( objLitElem ( COMMA objLitElem )* )
            // Haxe.g:513:4: objLitElem ( COMMA objLitElem )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_objLitElem_in_objLitElemList3761);
            objLitElem429=objLitElem();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, objLitElem429.getTree());
            // Haxe.g:513:15: ( COMMA objLitElem )*
            loop84:
            do {
                int alt84=2;
                int LA84_0 = input.LA(1);

                if ( (LA84_0==COMMA) ) {
                    alt84=1;
                }


                switch (alt84) {
            	case 1 :
            	    // Haxe.g:513:16: COMMA objLitElem
            	    {
            	    COMMA430=(Token)match(input,COMMA,FOLLOW_COMMA_in_objLitElemList3764); if (state.failed) return retval;
            	    pushFollow(FOLLOW_objLitElem_in_objLitElemList3767);
            	    objLitElem431=objLitElem();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, objLitElem431.getTree());

            	    }
            	    break;

            	default :
            	    break loop84;
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
            if ( state.backtracking>0 ) { memoize(input, 87, objLitElemList_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "objLitElemList"

    public static class objLitElem_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "objLitElem"
    // Haxe.g:516:1: objLitElem : IDENTIFIER COLON expr ;
    public final HaxeParser.objLitElem_return objLitElem() throws RecognitionException {
        HaxeParser.objLitElem_return retval = new HaxeParser.objLitElem_return();
        retval.start = input.LT(1);
        int objLitElem_StartIndex = input.index();
        Object root_0 = null;

        Token IDENTIFIER432=null;
        Token COLON433=null;
        HaxeParser.expr_return expr434 = null;


        Object IDENTIFIER432_tree=null;
        Object COLON433_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 88) ) { return retval; }
            // Haxe.g:517:9: ( IDENTIFIER COLON expr )
            // Haxe.g:517:11: IDENTIFIER COLON expr
            {
            root_0 = (Object)adaptor.nil();

            IDENTIFIER432=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_objLitElem3788); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER432_tree = (Object)adaptor.create(IDENTIFIER432);
            adaptor.addChild(root_0, IDENTIFIER432_tree);
            }
            COLON433=(Token)match(input,COLON,FOLLOW_COLON_in_objLitElem3790); if (state.failed) return retval;
            pushFollow(FOLLOW_expr_in_objLitElem3793);
            expr434=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr434.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 88, objLitElem_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "objLitElem"

    public static class elementarySymbol_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "elementarySymbol"
    // Haxe.g:520:1: elementarySymbol : ( LONGLITERAL -> LONGLITERAL[$LONGLITERAL, \"INT\"] | INTLITERAL -> INTLITERAL[$INTLITERAL, \"INT\"] | STRINGLITERAL -> STRINGLITERAL[$STRINGLITERAL,\"STRING\"] | CHARLITERAL -> CHARLITERAL[$CHARLITERAL, \"STRING\"] | FLOATNUM -> FLOATNUM[$FLOATNUM, \"FLOAT\"] | TRUE -> TRUE[$TRUE,\"BOOL\"] | FALSE -> FALSE[$FALSE,\"BOOL\"] );
    public final HaxeParser.elementarySymbol_return elementarySymbol() throws RecognitionException {
        HaxeParser.elementarySymbol_return retval = new HaxeParser.elementarySymbol_return();
        retval.start = input.LT(1);
        int elementarySymbol_StartIndex = input.index();
        Object root_0 = null;

        Token LONGLITERAL435=null;
        Token INTLITERAL436=null;
        Token STRINGLITERAL437=null;
        Token CHARLITERAL438=null;
        Token FLOATNUM439=null;
        Token TRUE440=null;
        Token FALSE441=null;

        Object LONGLITERAL435_tree=null;
        Object INTLITERAL436_tree=null;
        Object STRINGLITERAL437_tree=null;
        Object CHARLITERAL438_tree=null;
        Object FLOATNUM439_tree=null;
        Object TRUE440_tree=null;
        Object FALSE441_tree=null;
        RewriteRuleTokenStream stream_INTLITERAL=new RewriteRuleTokenStream(adaptor,"token INTLITERAL");
        RewriteRuleTokenStream stream_FALSE=new RewriteRuleTokenStream(adaptor,"token FALSE");
        RewriteRuleTokenStream stream_TRUE=new RewriteRuleTokenStream(adaptor,"token TRUE");
        RewriteRuleTokenStream stream_FLOATNUM=new RewriteRuleTokenStream(adaptor,"token FLOATNUM");
        RewriteRuleTokenStream stream_STRINGLITERAL=new RewriteRuleTokenStream(adaptor,"token STRINGLITERAL");
        RewriteRuleTokenStream stream_CHARLITERAL=new RewriteRuleTokenStream(adaptor,"token CHARLITERAL");
        RewriteRuleTokenStream stream_LONGLITERAL=new RewriteRuleTokenStream(adaptor,"token LONGLITERAL");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 89) ) { return retval; }
            // Haxe.g:521:2: ( LONGLITERAL -> LONGLITERAL[$LONGLITERAL, \"INT\"] | INTLITERAL -> INTLITERAL[$INTLITERAL, \"INT\"] | STRINGLITERAL -> STRINGLITERAL[$STRINGLITERAL,\"STRING\"] | CHARLITERAL -> CHARLITERAL[$CHARLITERAL, \"STRING\"] | FLOATNUM -> FLOATNUM[$FLOATNUM, \"FLOAT\"] | TRUE -> TRUE[$TRUE,\"BOOL\"] | FALSE -> FALSE[$FALSE,\"BOOL\"] )
            int alt85=7;
            switch ( input.LA(1) ) {
            case LONGLITERAL:
                {
                alt85=1;
                }
                break;
            case INTLITERAL:
                {
                alt85=2;
                }
                break;
            case STRINGLITERAL:
                {
                alt85=3;
                }
                break;
            case CHARLITERAL:
                {
                alt85=4;
                }
                break;
            case FLOATNUM:
                {
                alt85=5;
                }
                break;
            case TRUE:
                {
                alt85=6;
                }
                break;
            case FALSE:
                {
                alt85=7;
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
                    // Haxe.g:521:4: LONGLITERAL
                    {
                    LONGLITERAL435=(Token)match(input,LONGLITERAL,FOLLOW_LONGLITERAL_in_elementarySymbol3805); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LONGLITERAL.add(LONGLITERAL435);



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
                    // 521:16: -> LONGLITERAL[$LONGLITERAL, \"INT\"]
                    {
                        adaptor.addChild(root_0, new VarUsage(LONGLITERAL, LONGLITERAL435, "INT"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // Haxe.g:522:4: INTLITERAL
                    {
                    INTLITERAL436=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_elementarySymbol3818); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INTLITERAL.add(INTLITERAL436);



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
                    // 522:15: -> INTLITERAL[$INTLITERAL, \"INT\"]
                    {
                        adaptor.addChild(root_0, new VarUsage(INTLITERAL, INTLITERAL436, "INT"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // Haxe.g:523:4: STRINGLITERAL
                    {
                    STRINGLITERAL437=(Token)match(input,STRINGLITERAL,FOLLOW_STRINGLITERAL_in_elementarySymbol3831); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STRINGLITERAL.add(STRINGLITERAL437);



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
                    // 523:18: -> STRINGLITERAL[$STRINGLITERAL,\"STRING\"]
                    {
                        adaptor.addChild(root_0, new VarUsage(STRINGLITERAL, STRINGLITERAL437, "STRING"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // Haxe.g:524:4: CHARLITERAL
                    {
                    CHARLITERAL438=(Token)match(input,CHARLITERAL,FOLLOW_CHARLITERAL_in_elementarySymbol3844); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CHARLITERAL.add(CHARLITERAL438);



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
                    // 524:16: -> CHARLITERAL[$CHARLITERAL, \"STRING\"]
                    {
                        adaptor.addChild(root_0, new VarUsage(CHARLITERAL, CHARLITERAL438, "STRING"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // Haxe.g:525:4: FLOATNUM
                    {
                    FLOATNUM439=(Token)match(input,FLOATNUM,FOLLOW_FLOATNUM_in_elementarySymbol3857); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FLOATNUM.add(FLOATNUM439);



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
                    // 525:13: -> FLOATNUM[$FLOATNUM, \"FLOAT\"]
                    {
                        adaptor.addChild(root_0, new VarUsage(FLOATNUM, FLOATNUM439, "FLOAT"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    // Haxe.g:526:4: TRUE
                    {
                    TRUE440=(Token)match(input,TRUE,FOLLOW_TRUE_in_elementarySymbol3870); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TRUE.add(TRUE440);



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
                    // 526:10: -> TRUE[$TRUE,\"BOOL\"]
                    {
                        adaptor.addChild(root_0, new VarUsage(TRUE, TRUE440, "BOOL"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 7 :
                    // Haxe.g:527:4: FALSE
                    {
                    FALSE441=(Token)match(input,FALSE,FOLLOW_FALSE_in_elementarySymbol3884); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FALSE.add(FALSE441);



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
                    // 527:11: -> FALSE[$FALSE,\"BOOL\"]
                    {
                        adaptor.addChild(root_0, new VarUsage(FALSE, FALSE441, "BOOL"));

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
            if ( state.backtracking>0 ) { memoize(input, 89, elementarySymbol_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "elementarySymbol"

    // $ANTLR start synpred28_Haxe
    public final void synpred28_Haxe_fragment() throws RecognitionException {   
        // Haxe.g:148:43: ( typeTagOpt )
        // Haxe.g:148:43: typeTagOpt
        {
        pushFollow(FOLLOW_typeTagOpt_in_synpred28_Haxe679);
        typeTagOpt();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred28_Haxe

    // $ANTLR start synpred34_Haxe
    public final void synpred34_Haxe_fragment() throws RecognitionException {   
        // Haxe.g:190:11: ( ( type ) ( MINUS_BIGGER type )* )
        // Haxe.g:190:11: ( type ) ( MINUS_BIGGER type )*
        {
        // Haxe.g:190:11: ( type )
        // Haxe.g:190:12: type
        {
        pushFollow(FOLLOW_type_in_synpred34_Haxe817);
        type();

        state._fsp--;
        if (state.failed) return ;

        }

        // Haxe.g:190:18: ( MINUS_BIGGER type )*
        loop88:
        do {
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==MINUS_BIGGER) ) {
                alt88=1;
            }


            switch (alt88) {
        	case 1 :
        	    // Haxe.g:190:19: MINUS_BIGGER type
        	    {
        	    match(input,MINUS_BIGGER,FOLLOW_MINUS_BIGGER_in_synpred34_Haxe821); if (state.failed) return ;
        	    pushFollow(FOLLOW_type_in_synpred34_Haxe824);
        	    type();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop88;
            }
        } while (true);


        }
    }
    // $ANTLR end synpred34_Haxe

    // $ANTLR start synpred41_Haxe
    public final void synpred41_Haxe_fragment() throws RecognitionException {   
        // Haxe.g:198:48: ( typeParam )
        // Haxe.g:198:48: typeParam
        {
        pushFollow(FOLLOW_typeParam_in_synpred41_Haxe883);
        typeParam();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred41_Haxe

    // $ANTLR start synpred42_Haxe
    public final void synpred42_Haxe_fragment() throws RecognitionException {   
        // Haxe.g:198:8: ( ( anonType | dotIdent | primitiveType ) ( typeParam )* )
        // Haxe.g:198:8: ( anonType | dotIdent | primitiveType ) ( typeParam )*
        {
        // Haxe.g:198:8: ( anonType | dotIdent | primitiveType )
        int alt89=3;
        switch ( input.LA(1) ) {
        case LBRACE:
            {
            alt89=1;
            }
            break;
        case IDENTIFIER:
        case THIS:
            {
            alt89=2;
            }
            break;
        case DYNAMIC:
        case VOID:
        case INT:
        case FLOAT:
        case BOOLEAN:
            {
            alt89=3;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 89, 0, input);

            throw nvae;
        }

        switch (alt89) {
            case 1 :
                // Haxe.g:198:9: anonType
                {
                pushFollow(FOLLOW_anonType_in_synpred42_Haxe870);
                anonType();

                state._fsp--;
                if (state.failed) return ;

                }
                break;
            case 2 :
                // Haxe.g:198:20: dotIdent
                {
                pushFollow(FOLLOW_dotIdent_in_synpred42_Haxe874);
                dotIdent();

                state._fsp--;
                if (state.failed) return ;

                }
                break;
            case 3 :
                // Haxe.g:198:31: primitiveType
                {
                pushFollow(FOLLOW_primitiveType_in_synpred42_Haxe878);
                primitiveType();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }

        // Haxe.g:198:47: ( typeParam )*
        loop90:
        do {
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==LT) ) {
                alt90=1;
            }


            switch (alt90) {
        	case 1 :
        	    // Haxe.g:198:48: typeParam
        	    {
        	    pushFollow(FOLLOW_typeParam_in_synpred42_Haxe883);
        	    typeParam();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop90;
            }
        } while (true);


        }
    }
    // $ANTLR end synpred42_Haxe

    // $ANTLR start synpred43_Haxe
    public final void synpred43_Haxe_fragment() throws RecognitionException {   
        // Haxe.g:203:4: ( LT typeList GT )
        // Haxe.g:203:4: LT typeList GT
        {
        match(input,LT,FOLLOW_LT_in_synpred43_Haxe901); if (state.failed) return ;
        pushFollow(FOLLOW_typeList_in_synpred43_Haxe904);
        typeList();

        state._fsp--;
        if (state.failed) return ;
        match(input,GT,FOLLOW_GT_in_synpred43_Haxe906); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred43_Haxe

    // $ANTLR start synpred44_Haxe
    public final void synpred44_Haxe_fragment() throws RecognitionException {   
        // Haxe.g:204:4: ( LT typeList LT typeList GTGT )
        // Haxe.g:204:4: LT typeList LT typeList GTGT
        {
        match(input,LT,FOLLOW_LT_in_synpred44_Haxe912); if (state.failed) return ;
        pushFollow(FOLLOW_typeList_in_synpred44_Haxe915);
        typeList();

        state._fsp--;
        if (state.failed) return ;
        match(input,LT,FOLLOW_LT_in_synpred44_Haxe917); if (state.failed) return ;
        pushFollow(FOLLOW_typeList_in_synpred44_Haxe920);
        typeList();

        state._fsp--;
        if (state.failed) return ;
        match(input,GTGT,FOLLOW_GTGT_in_synpred44_Haxe922); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred44_Haxe

    // $ANTLR start synpred45_Haxe
    public final void synpred45_Haxe_fragment() throws RecognitionException {   
        // Haxe.g:210:4: ( typeParam )
        // Haxe.g:210:4: typeParam
        {
        pushFollow(FOLLOW_typeParam_in_synpred45_Haxe963);
        typeParam();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred45_Haxe

    // $ANTLR start synpred47_Haxe
    public final void synpred47_Haxe_fragment() throws RecognitionException {   
        // Haxe.g:224:4: ( block )
        // Haxe.g:224:4: block
        {
        pushFollow(FOLLOW_block_in_synpred47_Haxe1084);
        block();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred47_Haxe

    // $ANTLR start synpred48_Haxe
    public final void synpred48_Haxe_fragment() throws RecognitionException {   
        // Haxe.g:225:4: ( assignExpr SEMI )
        // Haxe.g:225:4: assignExpr SEMI
        {
        pushFollow(FOLLOW_assignExpr_in_synpred48_Haxe1089);
        assignExpr();

        state._fsp--;
        if (state.failed) return ;
        match(input,SEMI,FOLLOW_SEMI_in_synpred48_Haxe1091); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred48_Haxe

    // $ANTLR start synpred50_Haxe
    public final void synpred50_Haxe_fragment() throws RecognitionException {   
        HaxeParser.statement_return st2 = null;


        // Haxe.g:227:36: ( ELSE st2= statement )
        // Haxe.g:227:36: ELSE st2= statement
        {
        match(input,ELSE,FOLLOW_ELSE_in_synpred50_Haxe1111); if (state.failed) return ;
        pushFollow(FOLLOW_statement_in_synpred50_Haxe1115);
        st2=statement();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred50_Haxe

    // $ANTLR start synpred58_Haxe
    public final void synpred58_Haxe_fragment() throws RecognitionException {   
        // Haxe.g:233:12: ( expr )
        // Haxe.g:233:12: expr
        {
        pushFollow(FOLLOW_expr_in_synpred58_Haxe1323);
        expr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred58_Haxe

    // $ANTLR start synpred65_Haxe
    public final void synpred65_Haxe_fragment() throws RecognitionException {   
        // Haxe.g:237:4: ( expr SEMI )
        // Haxe.g:237:4: expr SEMI
        {
        pushFollow(FOLLOW_expr_in_synpred65_Haxe1417);
        expr();

        state._fsp--;
        if (state.failed) return ;
        match(input,SEMI,FOLLOW_SEMI_in_synpred65_Haxe1420); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred65_Haxe

    // $ANTLR start synpred66_Haxe
    public final void synpred66_Haxe_fragment() throws RecognitionException {   
        // Haxe.g:238:4: ( IDENTIFIER COLON statement )
        // Haxe.g:238:4: IDENTIFIER COLON statement
        {
        match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_synpred66_Haxe1426); if (state.failed) return ;
        match(input,COLON,FOLLOW_COLON_in_synpred66_Haxe1428); if (state.failed) return ;
        pushFollow(FOLLOW_statement_in_synpred66_Haxe1430);
        statement();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred66_Haxe

    // $ANTLR start synpred69_Haxe
    public final void synpred69_Haxe_fragment() throws RecognitionException {   
        // Haxe.g:251:4: ( varDecl )
        // Haxe.g:251:4: varDecl
        {
        pushFollow(FOLLOW_varDecl_in_synpred69_Haxe1529);
        varDecl();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred69_Haxe

    // $ANTLR start synpred70_Haxe
    public final void synpred70_Haxe_fragment() throws RecognitionException {   
        // Haxe.g:252:4: ( classDecl )
        // Haxe.g:252:4: classDecl
        {
        pushFollow(FOLLOW_classDecl_in_synpred70_Haxe1534);
        classDecl();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred70_Haxe

    // $ANTLR start synpred73_Haxe
    public final void synpred73_Haxe_fragment() throws RecognitionException {   
        // Haxe.g:285:4: ( exprList )
        // Haxe.g:285:4: exprList
        {
        pushFollow(FOLLOW_exprList_in_synpred73_Haxe1736);
        exprList();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred73_Haxe

    // $ANTLR start synpred75_Haxe
    public final void synpred75_Haxe_fragment() throws RecognitionException {   
        // Haxe.g:292:8: ( assignExpr )
        // Haxe.g:292:8: assignExpr
        {
        pushFollow(FOLLOW_assignExpr_in_synpred75_Haxe1768);
        assignExpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred75_Haxe

    // $ANTLR start synpred92_Haxe
    public final void synpred92_Haxe_fragment() throws RecognitionException {   
        // Haxe.g:327:32: ( ( GT GT ) addExpr )
        // Haxe.g:327:32: ( GT GT ) addExpr
        {
        // Haxe.g:327:32: ( GT GT )
        // Haxe.g:327:33: GT GT
        {
        match(input,GT,FOLLOW_GT_in_synpred92_Haxe2033); if (state.failed) return ;
        match(input,GT,FOLLOW_GT_in_synpred92_Haxe2035); if (state.failed) return ;

        }

        pushFollow(FOLLOW_addExpr_in_synpred92_Haxe2040);
        addExpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred92_Haxe

    // $ANTLR start synpred103_Haxe
    public final void synpred103_Haxe_fragment() throws RecognitionException {   
        // Haxe.g:337:11: ( ( SUB | SUBSUB | PLUSPLUS | BANG | TILDE ) prefixExpr )
        // Haxe.g:337:11: ( SUB | SUBSUB | PLUSPLUS | BANG | TILDE ) prefixExpr
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

        pushFollow(FOLLOW_prefixExpr_in_synpred103_Haxe2137);
        prefixExpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred103_Haxe

    // $ANTLR start synpred106_Haxe
    public final void synpred106_Haxe_fragment() throws RecognitionException {   
        // Haxe.g:344:4: ( value LPAREN exprListOpt RPAREN )
        // Haxe.g:344:4: value LPAREN exprListOpt RPAREN
        {
        pushFollow(FOLLOW_value_in_synpred106_Haxe2192);
        value();

        state._fsp--;
        if (state.failed) return ;
        match(input,LPAREN,FOLLOW_LPAREN_in_synpred106_Haxe2194); if (state.failed) return ;
        pushFollow(FOLLOW_exprListOpt_in_synpred106_Haxe2196);
        exprListOpt();

        state._fsp--;
        if (state.failed) return ;
        match(input,RPAREN,FOLLOW_RPAREN_in_synpred106_Haxe2198); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred106_Haxe

    // $ANTLR start synpred107_Haxe
    public final void synpred107_Haxe_fragment() throws RecognitionException {   
        // Haxe.g:345:4: ( value LBRACKET expr RBRACKET )
        // Haxe.g:345:4: value LBRACKET expr RBRACKET
        {
        pushFollow(FOLLOW_value_in_synpred107_Haxe2219);
        value();

        state._fsp--;
        if (state.failed) return ;
        match(input,LBRACKET,FOLLOW_LBRACKET_in_synpred107_Haxe2221); if (state.failed) return ;
        pushFollow(FOLLOW_expr_in_synpred107_Haxe2223);
        expr();

        state._fsp--;
        if (state.failed) return ;
        match(input,RBRACKET,FOLLOW_RBRACKET_in_synpred107_Haxe2225); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred107_Haxe

    // $ANTLR start synpred108_Haxe
    public final void synpred108_Haxe_fragment() throws RecognitionException {   
        // Haxe.g:346:4: ( value PLUSPLUS )
        // Haxe.g:346:4: value PLUSPLUS
        {
        pushFollow(FOLLOW_value_in_synpred108_Haxe2230);
        value();

        state._fsp--;
        if (state.failed) return ;
        match(input,PLUSPLUS,FOLLOW_PLUSPLUS_in_synpred108_Haxe2232); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred108_Haxe

    // $ANTLR start synpred109_Haxe
    public final void synpred109_Haxe_fragment() throws RecognitionException {   
        // Haxe.g:347:4: ( value SUBSUB )
        // Haxe.g:347:4: value SUBSUB
        {
        pushFollow(FOLLOW_value_in_synpred109_Haxe2256);
        value();

        state._fsp--;
        if (state.failed) return ;
        match(input,SUBSUB,FOLLOW_SUBSUB_in_synpred109_Haxe2258); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred109_Haxe

    // $ANTLR start synpred111_Haxe
    public final void synpred111_Haxe_fragment() throws RecognitionException {   
        // Haxe.g:352:4: ( arrayLit )
        // Haxe.g:352:4: arrayLit
        {
        pushFollow(FOLLOW_arrayLit_in_synpred111_Haxe2298);
        arrayLit();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred111_Haxe

    // $ANTLR start synpred115_Haxe
    public final void synpred115_Haxe_fragment() throws RecognitionException {   
        // Haxe.g:356:23: ( expr )
        // Haxe.g:356:23: expr
        {
        pushFollow(FOLLOW_expr_in_synpred115_Haxe2362);
        expr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred115_Haxe

    // $ANTLR start synpred116_Haxe
    public final void synpred116_Haxe_fragment() throws RecognitionException {   
        // Haxe.g:356:14: ( LPAREN ( expr | statement ) RPAREN )
        // Haxe.g:356:14: LPAREN ( expr | statement ) RPAREN
        {
        match(input,LPAREN,FOLLOW_LPAREN_in_synpred116_Haxe2358); if (state.failed) return ;
        // Haxe.g:356:22: ( expr | statement )
        int alt97=2;
        alt97 = dfa97.predict(input);
        switch (alt97) {
            case 1 :
                // Haxe.g:356:23: expr
                {
                pushFollow(FOLLOW_expr_in_synpred116_Haxe2362);
                expr();

                state._fsp--;
                if (state.failed) return ;

                }
                break;
            case 2 :
                // Haxe.g:356:28: statement
                {
                pushFollow(FOLLOW_statement_in_synpred116_Haxe2364);
                statement();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }

        match(input,RPAREN,FOLLOW_RPAREN_in_synpred116_Haxe2367); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred116_Haxe

    // $ANTLR start synpred119_Haxe
    public final void synpred119_Haxe_fragment() throws RecognitionException {   
        // Haxe.g:365:11: ( CAST LPAREN expr ( COMMA funcType )? RPAREN )
        // Haxe.g:365:11: CAST LPAREN expr ( COMMA funcType )? RPAREN
        {
        match(input,CAST,FOLLOW_CAST_in_synpred119_Haxe2453); if (state.failed) return ;
        match(input,LPAREN,FOLLOW_LPAREN_in_synpred119_Haxe2455); if (state.failed) return ;
        pushFollow(FOLLOW_expr_in_synpred119_Haxe2457);
        expr();

        state._fsp--;
        if (state.failed) return ;
        // Haxe.g:365:28: ( COMMA funcType )?
        int alt98=2;
        int LA98_0 = input.LA(1);

        if ( (LA98_0==COMMA) ) {
            alt98=1;
        }
        switch (alt98) {
            case 1 :
                // Haxe.g:365:29: COMMA funcType
                {
                match(input,COMMA,FOLLOW_COMMA_in_synpred119_Haxe2460); if (state.failed) return ;
                pushFollow(FOLLOW_funcType_in_synpred119_Haxe2462);
                funcType();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }

        match(input,RPAREN,FOLLOW_RPAREN_in_synpred119_Haxe2466); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred119_Haxe

    // $ANTLR start synpred120_Haxe
    public final void synpred120_Haxe_fragment() throws RecognitionException {   
        // Haxe.g:373:4: ( classDecl )
        // Haxe.g:373:4: classDecl
        {
        pushFollow(FOLLOW_classDecl_in_synpred120_Haxe2524);
        classDecl();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred120_Haxe

    // $ANTLR start synpred121_Haxe
    public final void synpred121_Haxe_fragment() throws RecognitionException {   
        // Haxe.g:374:4: ( interfaceDecl )
        // Haxe.g:374:4: interfaceDecl
        {
        pushFollow(FOLLOW_interfaceDecl_in_synpred121_Haxe2529);
        interfaceDecl();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred121_Haxe

    // $ANTLR start synpred122_Haxe
    public final void synpred122_Haxe_fragment() throws RecognitionException {   
        // Haxe.g:375:11: ( enumDecl )
        // Haxe.g:375:11: enumDecl
        {
        pushFollow(FOLLOW_enumDecl_in_synpred122_Haxe2541);
        enumDecl();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred122_Haxe

    // Delegated rules

    public final boolean synpred58_Haxe() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred58_Haxe_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred45_Haxe() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred45_Haxe_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred103_Haxe() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred103_Haxe_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred116_Haxe() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred116_Haxe_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred73_Haxe() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred73_Haxe_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred111_Haxe() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred111_Haxe_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred121_Haxe() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred121_Haxe_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred41_Haxe() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred41_Haxe_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred34_Haxe() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred34_Haxe_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred115_Haxe() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred115_Haxe_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred48_Haxe() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred48_Haxe_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred120_Haxe() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred120_Haxe_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred108_Haxe() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred108_Haxe_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred65_Haxe() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred65_Haxe_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred50_Haxe() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred50_Haxe_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred42_Haxe() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred42_Haxe_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred47_Haxe() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred47_Haxe_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred69_Haxe() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred69_Haxe_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred70_Haxe() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred70_Haxe_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred28_Haxe() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred28_Haxe_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred44_Haxe() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred44_Haxe_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred106_Haxe() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred106_Haxe_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred119_Haxe() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred119_Haxe_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred66_Haxe() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred66_Haxe_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred92_Haxe() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred92_Haxe_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred109_Haxe() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred109_Haxe_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred43_Haxe() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred43_Haxe_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred107_Haxe() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred107_Haxe_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred75_Haxe() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred75_Haxe_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred122_Haxe() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred122_Haxe_fragment(); // can never throw exception
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
    protected DFA25 dfa25 = new DFA25(this);
    protected DFA28 dfa28 = new DFA28(this);
    protected DFA35 dfa35 = new DFA35(this);
    protected DFA38 dfa38 = new DFA38(this);
    protected DFA59 dfa59 = new DFA59(this);
    protected DFA61 dfa61 = new DFA61(this);
    protected DFA60 dfa60 = new DFA60(this);
    protected DFA73 dfa73 = new DFA73(this);
    protected DFA74 dfa74 = new DFA74(this);
    protected DFA76 dfa76 = new DFA76(this);
    protected DFA77 dfa77 = new DFA77(this);
    protected DFA97 dfa97 = new DFA97(this);
    static final String DFA26_eotS =
        "\32\uffff";
    static final String DFA26_eofS =
        "\1\4\31\uffff";
    static final String DFA26_minS =
        "\1\20\1\0\30\uffff";
    static final String DFA26_maxS =
        "\1\144\1\0\30\uffff";
    static final String DFA26_acceptS =
        "\2\uffff\1\1\1\uffff\1\2\25\uffff";
    static final String DFA26_specialS =
        "\1\uffff\1\0\30\uffff}>";
    static final String[] DFA26_transitionS = {
            "\4\4\1\2\1\uffff\2\4\1\uffff\2\4\3\uffff\1\2\1\uffff\1\4\1"+
            "\uffff\1\2\1\4\10\uffff\1\4\4\2\4\4\11\uffff\1\1\1\4\36\uffff"+
            "\1\4\1\uffff\5\4",
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
            return "198:1: type : ( ( anonType | dotIdent | primitiveType ) ( typeParam )* | );";
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
                        if ( (synpred42_Haxe()) ) {s = 2;}

                        else if ( (true) ) {s = 4;}

                         
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
    static final String DFA25_eotS =
        "\31\uffff";
    static final String DFA25_eofS =
        "\1\1\30\uffff";
    static final String DFA25_minS =
        "\1\20\2\uffff\1\0\25\uffff";
    static final String DFA25_maxS =
        "\1\144\2\uffff\1\0\25\uffff";
    static final String DFA25_acceptS =
        "\1\uffff\1\2\26\uffff\1\1";
    static final String DFA25_specialS =
        "\3\uffff\1\0\25\uffff}>";
    static final String[] DFA25_transitionS = {
            "\4\1\2\uffff\2\1\1\uffff\2\1\5\uffff\1\1\2\uffff\1\1\10\uffff"+
            "\1\1\4\uffff\1\3\3\1\11\uffff\2\1\36\uffff\1\1\1\uffff\5\1",
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
            return "()* loopback of 198:47: ( typeParam )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA25_3 = input.LA(1);

                         
                        int index25_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_Haxe()) ) {s = 24;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index25_3);
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
    static final String DFA28_eotS =
        "\50\uffff";
    static final String DFA28_eofS =
        "\1\2\47\uffff";
    static final String DFA28_minS =
        "\1\20\1\0\46\uffff";
    static final String DFA28_maxS =
        "\1\143\1\0\46\uffff";
    static final String DFA28_acceptS =
        "\2\uffff\1\2\44\uffff\1\1";
    static final String DFA28_specialS =
        "\1\uffff\1\0\46\uffff}>";
    static final String[] DFA28_transitionS = {
            "\1\2\1\uffff\2\2\1\uffff\1\2\12\uffff\2\2\1\uffff\6\2\2\uffff"+
            "\1\2\5\uffff\1\1\1\2\1\uffff\1\2\4\uffff\1\2\4\uffff\2\2\10"+
            "\uffff\20\2\12\uffff\2\2",
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
            return "209:1: typeParamOpt : ( typeParam -> ^( TYPE_PARAM_OPT[\"TYPE_PARAM_OPT\",true] ( typeParam )? ) | );";
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
                        if ( (synpred45_Haxe()) ) {s = 39;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index28_1);
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
    static final String DFA35_eotS =
        "\105\uffff";
    static final String DFA35_eofS =
        "\105\uffff";
    static final String DFA35_minS =
        "\1\20\56\0\20\uffff\1\0\5\uffff";
    static final String DFA35_maxS =
        "\1\153\56\0\20\uffff\1\0\5\uffff";
    static final String DFA35_acceptS =
        "\57\uffff\1\3\5\uffff\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
        "\1\15\1\uffff\1\1\1\2\1\16\1\20\1\17";
    static final String DFA35_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"+
        "\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30"+
        "\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45"+
        "\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\20\uffff\1\56\5\uffff}>";
    static final String[] DFA35_transitionS = {
            "\1\2\1\uffff\1\20\1\uffff\1\21\2\uffff\1\57\3\uffff\5\57\1"+
            "\uffff\1\46\1\77\1\50\1\51\1\52\1\53\1\54\1\55\1\6\1\7\6\uffff"+
            "\1\24\1\33\1\uffff\1\34\1\4\1\65\1\uffff\1\66\1\uffff\1\67\1"+
            "\70\1\71\1\72\1\1\1\uffff\1\73\1\74\1\75\1\76\3\uffff\1\56\1"+
            "\47\1\45\1\44\1\40\1\41\1\42\1\43\1\35\1\36\1\37\1\32\1\30\1"+
            "\23\1\25\1\26\1\27\1\22\1\3\2\31\1\10\1\5\1\uffff\1\57\5\uffff"+
            "\1\11\1\12\1\13\1\14\1\15\1\16\1\17",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
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
            "\1\uffff",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA35_eot = DFA.unpackEncodedString(DFA35_eotS);
    static final short[] DFA35_eof = DFA.unpackEncodedString(DFA35_eofS);
    static final char[] DFA35_min = DFA.unpackEncodedStringToUnsignedChars(DFA35_minS);
    static final char[] DFA35_max = DFA.unpackEncodedStringToUnsignedChars(DFA35_maxS);
    static final short[] DFA35_accept = DFA.unpackEncodedString(DFA35_acceptS);
    static final short[] DFA35_special = DFA.unpackEncodedString(DFA35_specialS);
    static final short[][] DFA35_transition;

    static {
        int numStates = DFA35_transitionS.length;
        DFA35_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA35_transition[i] = DFA.unpackEncodedString(DFA35_transitionS[i]);
        }
    }

    class DFA35 extends DFA {

        public DFA35(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 35;
            this.eot = DFA35_eot;
            this.eof = DFA35_eof;
            this.min = DFA35_min;
            this.max = DFA35_max;
            this.accept = DFA35_accept;
            this.special = DFA35_special;
            this.transition = DFA35_transition;
        }
        public String getDescription() {
            return "223:1: statement : ( block | assignExpr SEMI | varDecl | IF parExpression st1= statement ( ELSE st2= statement )? -> ^( IF parExpression $st1 ( ^( ELSE $st2) )? ) | FOR LPAREN exp1= expr IN exp2= expr RPAREN statement -> ^( FOR ^( IN $exp1 $exp2) ( statement )? ) | WHILE parExpression statement -> ^( WHILE ( parExpression )? ( statement )? ) | DO statement WHILE parExpression SEMI -> ^( DO ( parExpression )? ( statement )? ) | TRY block catchStmtList -> ^( TRY ( block )? ( catchStmtList )? ) | SWITCH LPAREN expr RPAREN LBRACE ( caseStmt )+ RBRACE -> ^( SWITCH ( expr )? ( caseStmt )+ ) | RETURN ( expr )? SEMI -> ^( RETURN ( expr )? ) | THROW expr SEMI -> ^( THROW ( expr )? ) | BREAK ( IDENTIFIER )? SEMI -> ^( BREAK ( IDENTIFIER )? ) | CONTINUE ( IDENTIFIER )? SEMI -> ^( CONTINUE ( IDENTIFIER )? ) | expr SEMI | IDENTIFIER COLON statement -> ^( COLON ( IDENTIFIER )? ( statement )? ) | SEMI );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA35_1 = input.LA(1);

                         
                        int index35_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred47_Haxe()) ) {s = 64;}

                        else if ( (synpred48_Haxe()) ) {s = 65;}

                        else if ( (synpred65_Haxe()) ) {s = 66;}

                         
                        input.seek(index35_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA35_2 = input.LA(1);

                         
                        int index35_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred47_Haxe()) ) {s = 64;}

                        else if ( (synpred48_Haxe()) ) {s = 65;}

                        else if ( (synpred65_Haxe()) ) {s = 66;}

                        else if ( (true) ) {s = 67;}

                         
                        input.seek(index35_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA35_3 = input.LA(1);

                         
                        int index35_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_Haxe()) ) {s = 65;}

                        else if ( (synpred65_Haxe()) ) {s = 66;}

                         
                        input.seek(index35_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA35_4 = input.LA(1);

                         
                        int index35_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_Haxe()) ) {s = 65;}

                        else if ( (synpred65_Haxe()) ) {s = 66;}

                         
                        input.seek(index35_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA35_5 = input.LA(1);

                         
                        int index35_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_Haxe()) ) {s = 65;}

                        else if ( (synpred65_Haxe()) ) {s = 66;}

                         
                        input.seek(index35_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA35_6 = input.LA(1);

                         
                        int index35_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_Haxe()) ) {s = 65;}

                        else if ( (synpred65_Haxe()) ) {s = 66;}

                         
                        input.seek(index35_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA35_7 = input.LA(1);

                         
                        int index35_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_Haxe()) ) {s = 65;}

                        else if ( (synpred65_Haxe()) ) {s = 66;}

                         
                        input.seek(index35_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA35_8 = input.LA(1);

                         
                        int index35_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_Haxe()) ) {s = 65;}

                        else if ( (synpred65_Haxe()) ) {s = 66;}

                         
                        input.seek(index35_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA35_9 = input.LA(1);

                         
                        int index35_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_Haxe()) ) {s = 65;}

                        else if ( (synpred65_Haxe()) ) {s = 66;}

                         
                        input.seek(index35_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA35_10 = input.LA(1);

                         
                        int index35_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_Haxe()) ) {s = 65;}

                        else if ( (synpred65_Haxe()) ) {s = 66;}

                         
                        input.seek(index35_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA35_11 = input.LA(1);

                         
                        int index35_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_Haxe()) ) {s = 65;}

                        else if ( (synpred65_Haxe()) ) {s = 66;}

                         
                        input.seek(index35_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA35_12 = input.LA(1);

                         
                        int index35_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_Haxe()) ) {s = 65;}

                        else if ( (synpred65_Haxe()) ) {s = 66;}

                         
                        input.seek(index35_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA35_13 = input.LA(1);

                         
                        int index35_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_Haxe()) ) {s = 65;}

                        else if ( (synpred65_Haxe()) ) {s = 66;}

                         
                        input.seek(index35_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA35_14 = input.LA(1);

                         
                        int index35_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_Haxe()) ) {s = 65;}

                        else if ( (synpred65_Haxe()) ) {s = 66;}

                         
                        input.seek(index35_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA35_15 = input.LA(1);

                         
                        int index35_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_Haxe()) ) {s = 65;}

                        else if ( (synpred65_Haxe()) ) {s = 66;}

                         
                        input.seek(index35_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA35_16 = input.LA(1);

                         
                        int index35_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_Haxe()) ) {s = 65;}

                        else if ( (synpred65_Haxe()) ) {s = 66;}

                         
                        input.seek(index35_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA35_17 = input.LA(1);

                         
                        int index35_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_Haxe()) ) {s = 65;}

                        else if ( (synpred65_Haxe()) ) {s = 66;}

                        else if ( (synpred66_Haxe()) ) {s = 68;}

                         
                        input.seek(index35_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA35_18 = input.LA(1);

                         
                        int index35_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_Haxe()) ) {s = 65;}

                        else if ( (synpred65_Haxe()) ) {s = 66;}

                         
                        input.seek(index35_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA35_19 = input.LA(1);

                         
                        int index35_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_Haxe()) ) {s = 65;}

                        else if ( (synpred65_Haxe()) ) {s = 66;}

                         
                        input.seek(index35_19);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA35_20 = input.LA(1);

                         
                        int index35_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_Haxe()) ) {s = 65;}

                        else if ( (synpred65_Haxe()) ) {s = 66;}

                         
                        input.seek(index35_20);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA35_21 = input.LA(1);

                         
                        int index35_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_Haxe()) ) {s = 65;}

                        else if ( (synpred65_Haxe()) ) {s = 66;}

                         
                        input.seek(index35_21);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA35_22 = input.LA(1);

                         
                        int index35_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_Haxe()) ) {s = 65;}

                        else if ( (synpred65_Haxe()) ) {s = 66;}

                         
                        input.seek(index35_22);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA35_23 = input.LA(1);

                         
                        int index35_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_Haxe()) ) {s = 65;}

                        else if ( (synpred65_Haxe()) ) {s = 66;}

                         
                        input.seek(index35_23);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA35_24 = input.LA(1);

                         
                        int index35_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_Haxe()) ) {s = 65;}

                        else if ( (synpred65_Haxe()) ) {s = 66;}

                         
                        input.seek(index35_24);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA35_25 = input.LA(1);

                         
                        int index35_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_Haxe()) ) {s = 65;}

                        else if ( (synpred65_Haxe()) ) {s = 66;}

                         
                        input.seek(index35_25);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA35_26 = input.LA(1);

                         
                        int index35_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_Haxe()) ) {s = 65;}

                        else if ( (synpred65_Haxe()) ) {s = 66;}

                         
                        input.seek(index35_26);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA35_27 = input.LA(1);

                         
                        int index35_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_Haxe()) ) {s = 65;}

                        else if ( (synpred65_Haxe()) ) {s = 66;}

                         
                        input.seek(index35_27);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA35_28 = input.LA(1);

                         
                        int index35_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_Haxe()) ) {s = 65;}

                        else if ( (synpred65_Haxe()) ) {s = 66;}

                         
                        input.seek(index35_28);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA35_29 = input.LA(1);

                         
                        int index35_29 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_Haxe()) ) {s = 65;}

                        else if ( (synpred65_Haxe()) ) {s = 66;}

                         
                        input.seek(index35_29);
                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA35_30 = input.LA(1);

                         
                        int index35_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_Haxe()) ) {s = 65;}

                        else if ( (synpred65_Haxe()) ) {s = 66;}

                         
                        input.seek(index35_30);
                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA35_31 = input.LA(1);

                         
                        int index35_31 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_Haxe()) ) {s = 65;}

                        else if ( (synpred65_Haxe()) ) {s = 66;}

                         
                        input.seek(index35_31);
                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA35_32 = input.LA(1);

                         
                        int index35_32 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_Haxe()) ) {s = 65;}

                        else if ( (synpred65_Haxe()) ) {s = 66;}

                         
                        input.seek(index35_32);
                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA35_33 = input.LA(1);

                         
                        int index35_33 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_Haxe()) ) {s = 65;}

                        else if ( (synpred65_Haxe()) ) {s = 66;}

                         
                        input.seek(index35_33);
                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA35_34 = input.LA(1);

                         
                        int index35_34 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_Haxe()) ) {s = 65;}

                        else if ( (synpred65_Haxe()) ) {s = 66;}

                         
                        input.seek(index35_34);
                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA35_35 = input.LA(1);

                         
                        int index35_35 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_Haxe()) ) {s = 65;}

                        else if ( (synpred65_Haxe()) ) {s = 66;}

                         
                        input.seek(index35_35);
                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA35_36 = input.LA(1);

                         
                        int index35_36 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_Haxe()) ) {s = 65;}

                        else if ( (synpred65_Haxe()) ) {s = 66;}

                         
                        input.seek(index35_36);
                        if ( s>=0 ) return s;
                        break;
                    case 36 : 
                        int LA35_37 = input.LA(1);

                         
                        int index35_37 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_Haxe()) ) {s = 65;}

                        else if ( (synpred65_Haxe()) ) {s = 66;}

                         
                        input.seek(index35_37);
                        if ( s>=0 ) return s;
                        break;
                    case 37 : 
                        int LA35_38 = input.LA(1);

                         
                        int index35_38 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_Haxe()) ) {s = 65;}

                        else if ( (synpred65_Haxe()) ) {s = 66;}

                         
                        input.seek(index35_38);
                        if ( s>=0 ) return s;
                        break;
                    case 38 : 
                        int LA35_39 = input.LA(1);

                         
                        int index35_39 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_Haxe()) ) {s = 65;}

                        else if ( (synpred65_Haxe()) ) {s = 66;}

                         
                        input.seek(index35_39);
                        if ( s>=0 ) return s;
                        break;
                    case 39 : 
                        int LA35_40 = input.LA(1);

                         
                        int index35_40 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_Haxe()) ) {s = 65;}

                        else if ( (synpred65_Haxe()) ) {s = 66;}

                         
                        input.seek(index35_40);
                        if ( s>=0 ) return s;
                        break;
                    case 40 : 
                        int LA35_41 = input.LA(1);

                         
                        int index35_41 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_Haxe()) ) {s = 65;}

                        else if ( (synpred65_Haxe()) ) {s = 66;}

                         
                        input.seek(index35_41);
                        if ( s>=0 ) return s;
                        break;
                    case 41 : 
                        int LA35_42 = input.LA(1);

                         
                        int index35_42 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_Haxe()) ) {s = 65;}

                        else if ( (synpred65_Haxe()) ) {s = 66;}

                         
                        input.seek(index35_42);
                        if ( s>=0 ) return s;
                        break;
                    case 42 : 
                        int LA35_43 = input.LA(1);

                         
                        int index35_43 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_Haxe()) ) {s = 65;}

                        else if ( (synpred65_Haxe()) ) {s = 66;}

                         
                        input.seek(index35_43);
                        if ( s>=0 ) return s;
                        break;
                    case 43 : 
                        int LA35_44 = input.LA(1);

                         
                        int index35_44 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_Haxe()) ) {s = 65;}

                        else if ( (synpred65_Haxe()) ) {s = 66;}

                         
                        input.seek(index35_44);
                        if ( s>=0 ) return s;
                        break;
                    case 44 : 
                        int LA35_45 = input.LA(1);

                         
                        int index35_45 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_Haxe()) ) {s = 65;}

                        else if ( (synpred65_Haxe()) ) {s = 66;}

                         
                        input.seek(index35_45);
                        if ( s>=0 ) return s;
                        break;
                    case 45 : 
                        int LA35_46 = input.LA(1);

                         
                        int index35_46 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_Haxe()) ) {s = 65;}

                        else if ( (synpred65_Haxe()) ) {s = 66;}

                         
                        input.seek(index35_46);
                        if ( s>=0 ) return s;
                        break;
                    case 46 : 
                        int LA35_63 = input.LA(1);

                         
                        int index35_63 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_Haxe()) ) {s = 65;}

                        else if ( (synpred65_Haxe()) ) {s = 66;}

                         
                        input.seek(index35_63);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 35, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA38_eotS =
        "\105\uffff";
    static final String DFA38_eofS =
        "\105\uffff";
    static final String DFA38_minS =
        "\1\20\6\0\1\uffff\1\0\74\uffff";
    static final String DFA38_maxS =
        "\1\153\6\0\1\uffff\1\0\74\uffff";
    static final String DFA38_acceptS =
        "\7\uffff\1\2\3\uffff\1\3\70\uffff\1\1";
    static final String DFA38_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\uffff\1\6\74\uffff}>";
    static final String[] DFA38_transitionS = {
            "\1\13\1\7\1\13\1\uffff\1\13\1\uffff\1\7\1\5\3\uffff\1\10\1"+
            "\1\1\2\1\3\1\4\1\uffff\12\13\6\uffff\2\13\1\uffff\3\13\1\uffff"+
            "\1\13\1\uffff\5\13\1\uffff\4\13\3\uffff\27\13\1\uffff\1\6\1"+
            "\7\4\uffff\7\13",
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
            "",
            ""
    };

    static final short[] DFA38_eot = DFA.unpackEncodedString(DFA38_eotS);
    static final short[] DFA38_eof = DFA.unpackEncodedString(DFA38_eofS);
    static final char[] DFA38_min = DFA.unpackEncodedStringToUnsignedChars(DFA38_minS);
    static final char[] DFA38_max = DFA.unpackEncodedStringToUnsignedChars(DFA38_maxS);
    static final short[] DFA38_accept = DFA.unpackEncodedString(DFA38_acceptS);
    static final short[] DFA38_special = DFA.unpackEncodedString(DFA38_specialS);
    static final short[][] DFA38_transition;

    static {
        int numStates = DFA38_transitionS.length;
        DFA38_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA38_transition[i] = DFA.unpackEncodedString(DFA38_transitionS[i]);
        }
    }

    class DFA38 extends DFA {

        public DFA38(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 38;
            this.eot = DFA38_eot;
            this.eof = DFA38_eof;
            this.min = DFA38_min;
            this.max = DFA38_max;
            this.accept = DFA38_accept;
            this.special = DFA38_special;
            this.transition = DFA38_transition;
        }
        public String getDescription() {
            return "250:1: blockStmt : ( varDecl | classDecl | statement );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA38_1 = input.LA(1);

                         
                        int index38_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred69_Haxe()) ) {s = 68;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index38_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA38_2 = input.LA(1);

                         
                        int index38_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred69_Haxe()) ) {s = 68;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index38_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA38_3 = input.LA(1);

                         
                        int index38_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred69_Haxe()) ) {s = 68;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index38_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA38_4 = input.LA(1);

                         
                        int index38_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred69_Haxe()) ) {s = 68;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index38_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA38_5 = input.LA(1);

                         
                        int index38_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred69_Haxe()) ) {s = 68;}

                        else if ( (synpred70_Haxe()) ) {s = 7;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index38_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA38_6 = input.LA(1);

                         
                        int index38_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred69_Haxe()) ) {s = 68;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index38_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA38_8 = input.LA(1);

                         
                        int index38_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred69_Haxe()) ) {s = 68;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index38_8);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 38, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA59_eotS =
        "\64\uffff";
    static final String DFA59_eofS =
        "\1\20\63\uffff";
    static final String DFA59_minS =
        "\1\20\15\0\46\uffff";
    static final String DFA59_maxS =
        "\1\153\15\0\46\uffff";
    static final String DFA59_acceptS =
        "\16\uffff\1\3\1\4\1\5\41\uffff\1\1\1\2";
    static final String DFA59_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"+
        "\14\46\uffff}>";
    static final String[] DFA59_transitionS = {
            "\1\20\1\uffff\1\14\1\20\1\15\1\20\12\uffff\2\20\1\15\6\20\1"+
            "\1\1\2\1\20\5\uffff\2\20\1\uffff\1\20\4\uffff\1\20\4\uffff\1"+
            "\3\1\20\10\uffff\20\20\1\17\1\16\2\uffff\1\4\10\uffff\1\5\1"+
            "\6\1\7\1\10\1\11\1\12\1\13",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
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
            return "343:1: suffixExpr : ( value LPAREN exprListOpt RPAREN -> ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] ( value )? ( exprListOpt )? ) | value LBRACKET expr RBRACKET | value PLUSPLUS -> ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] ( value )? ( PLUSPLUS )? ) | value SUBSUB -> ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] ( value )? SUBSUB ) | value typeParamOpt );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA59_1 = input.LA(1);

                         
                        int index59_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred106_Haxe()) ) {s = 50;}

                        else if ( (synpred107_Haxe()) ) {s = 51;}

                        else if ( (synpred108_Haxe()) ) {s = 14;}

                        else if ( (synpred109_Haxe()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index59_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA59_2 = input.LA(1);

                         
                        int index59_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred106_Haxe()) ) {s = 50;}

                        else if ( (synpred107_Haxe()) ) {s = 51;}

                        else if ( (synpred108_Haxe()) ) {s = 14;}

                        else if ( (synpred109_Haxe()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index59_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA59_3 = input.LA(1);

                         
                        int index59_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred106_Haxe()) ) {s = 50;}

                        else if ( (synpred107_Haxe()) ) {s = 51;}

                        else if ( (synpred108_Haxe()) ) {s = 14;}

                        else if ( (synpred109_Haxe()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index59_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA59_4 = input.LA(1);

                         
                        int index59_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred106_Haxe()) ) {s = 50;}

                        else if ( (synpred107_Haxe()) ) {s = 51;}

                        else if ( (synpred108_Haxe()) ) {s = 14;}

                        else if ( (synpred109_Haxe()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index59_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA59_5 = input.LA(1);

                         
                        int index59_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred106_Haxe()) ) {s = 50;}

                        else if ( (synpred107_Haxe()) ) {s = 51;}

                        else if ( (synpred108_Haxe()) ) {s = 14;}

                        else if ( (synpred109_Haxe()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index59_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA59_6 = input.LA(1);

                         
                        int index59_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred106_Haxe()) ) {s = 50;}

                        else if ( (synpred107_Haxe()) ) {s = 51;}

                        else if ( (synpred108_Haxe()) ) {s = 14;}

                        else if ( (synpred109_Haxe()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index59_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA59_7 = input.LA(1);

                         
                        int index59_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred106_Haxe()) ) {s = 50;}

                        else if ( (synpred107_Haxe()) ) {s = 51;}

                        else if ( (synpred108_Haxe()) ) {s = 14;}

                        else if ( (synpred109_Haxe()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index59_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA59_8 = input.LA(1);

                         
                        int index59_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred106_Haxe()) ) {s = 50;}

                        else if ( (synpred107_Haxe()) ) {s = 51;}

                        else if ( (synpred108_Haxe()) ) {s = 14;}

                        else if ( (synpred109_Haxe()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index59_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA59_9 = input.LA(1);

                         
                        int index59_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred106_Haxe()) ) {s = 50;}

                        else if ( (synpred107_Haxe()) ) {s = 51;}

                        else if ( (synpred108_Haxe()) ) {s = 14;}

                        else if ( (synpred109_Haxe()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index59_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA59_10 = input.LA(1);

                         
                        int index59_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred106_Haxe()) ) {s = 50;}

                        else if ( (synpred107_Haxe()) ) {s = 51;}

                        else if ( (synpred108_Haxe()) ) {s = 14;}

                        else if ( (synpred109_Haxe()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index59_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA59_11 = input.LA(1);

                         
                        int index59_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred106_Haxe()) ) {s = 50;}

                        else if ( (synpred107_Haxe()) ) {s = 51;}

                        else if ( (synpred108_Haxe()) ) {s = 14;}

                        else if ( (synpred109_Haxe()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index59_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA59_12 = input.LA(1);

                         
                        int index59_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred106_Haxe()) ) {s = 50;}

                        else if ( (synpred107_Haxe()) ) {s = 51;}

                        else if ( (synpred108_Haxe()) ) {s = 14;}

                        else if ( (synpred109_Haxe()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index59_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA59_13 = input.LA(1);

                         
                        int index59_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred106_Haxe()) ) {s = 50;}

                        else if ( (synpred107_Haxe()) ) {s = 51;}

                        else if ( (synpred108_Haxe()) ) {s = 14;}

                        else if ( (synpred109_Haxe()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index59_13);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 59, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA61_eotS =
        "\64\uffff";
    static final String DFA61_eofS =
        "\1\16\63\uffff";
    static final String DFA61_minS =
        "\1\20\1\uffff\1\0\11\uffff\1\0\47\uffff";
    static final String DFA61_maxS =
        "\1\153\1\uffff\1\0\11\uffff\1\0\47\uffff";
    static final String DFA61_acceptS =
        "\1\uffff\1\1\1\uffff\1\3\1\4\1\5\7\uffff\1\7\1\10\43\uffff\1\2"+
        "\1\6";
    static final String DFA61_specialS =
        "\2\uffff\1\0\11\uffff\1\1\47\uffff}>";
    static final String[] DFA61_transitionS = {
            "\1\16\1\uffff\1\14\1\16\1\15\1\16\12\uffff\2\16\1\15\6\16\1"+
            "\1\1\2\1\16\5\uffff\2\16\1\uffff\1\16\4\uffff\1\16\4\uffff\1"+
            "\3\1\16\10\uffff\22\16\2\uffff\1\4\10\uffff\7\5",
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
            return "351:1: value : ( funcLit | arrayLit | objLit | NULL | elementarySymbol | LPAREN ( expr | statement ) RPAREN | dotIdent | );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA61_2 = input.LA(1);

                         
                        int index61_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred111_Haxe()) ) {s = 50;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index61_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA61_12 = input.LA(1);

                         
                        int index61_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred116_Haxe()) ) {s = 51;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index61_12);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 61, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA60_eotS =
        "\101\uffff";
    static final String DFA60_eofS =
        "\101\uffff";
    static final String DFA60_minS =
        "\1\20\54\0\1\uffff\1\0\21\uffff\1\0";
    static final String DFA60_maxS =
        "\1\153\54\0\1\uffff\1\0\21\uffff\1\0";
    static final String DFA60_acceptS =
        "\55\uffff\1\1\1\uffff\1\2\21\uffff";
    static final String DFA60_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"+
        "\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30"+
        "\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45"+
        "\1\46\1\47\1\50\1\51\1\52\1\53\1\uffff\1\54\21\uffff\1\55}>";
    static final String[] DFA60_transitionS = {
            "\1\57\1\uffff\1\17\1\55\1\20\2\uffff\1\57\3\uffff\5\57\1\uffff"+
            "\1\45\1\100\1\47\1\50\1\51\1\52\1\53\1\54\1\4\1\5\6\uffff\1"+
            "\23\1\32\1\uffff\1\33\1\2\1\57\1\uffff\1\57\1\uffff\4\57\1\6"+
            "\1\uffff\4\57\3\uffff\1\56\1\46\1\44\1\43\1\37\1\40\1\41\1\42"+
            "\1\34\1\35\1\36\1\31\1\27\1\22\1\24\1\25\1\26\1\21\1\1\2\30"+
            "\1\7\1\3\1\uffff\1\57\5\uffff\1\10\1\11\1\12\1\13\1\14\1\15"+
            "\1\16",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
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
            return "356:22: ( expr | statement )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA60_1 = input.LA(1);

                         
                        int index60_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred115_Haxe()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index60_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA60_2 = input.LA(1);

                         
                        int index60_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred115_Haxe()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index60_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA60_3 = input.LA(1);

                         
                        int index60_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred115_Haxe()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index60_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA60_4 = input.LA(1);

                         
                        int index60_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred115_Haxe()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index60_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA60_5 = input.LA(1);

                         
                        int index60_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred115_Haxe()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index60_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA60_6 = input.LA(1);

                         
                        int index60_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred115_Haxe()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index60_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA60_7 = input.LA(1);

                         
                        int index60_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred115_Haxe()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index60_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA60_8 = input.LA(1);

                         
                        int index60_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred115_Haxe()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index60_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA60_9 = input.LA(1);

                         
                        int index60_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred115_Haxe()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index60_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA60_10 = input.LA(1);

                         
                        int index60_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred115_Haxe()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index60_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA60_11 = input.LA(1);

                         
                        int index60_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred115_Haxe()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index60_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA60_12 = input.LA(1);

                         
                        int index60_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred115_Haxe()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index60_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA60_13 = input.LA(1);

                         
                        int index60_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred115_Haxe()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index60_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA60_14 = input.LA(1);

                         
                        int index60_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred115_Haxe()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index60_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA60_15 = input.LA(1);

                         
                        int index60_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred115_Haxe()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index60_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA60_16 = input.LA(1);

                         
                        int index60_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred115_Haxe()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index60_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA60_17 = input.LA(1);

                         
                        int index60_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred115_Haxe()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index60_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA60_18 = input.LA(1);

                         
                        int index60_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred115_Haxe()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index60_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA60_19 = input.LA(1);

                         
                        int index60_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred115_Haxe()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index60_19);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA60_20 = input.LA(1);

                         
                        int index60_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred115_Haxe()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index60_20);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA60_21 = input.LA(1);

                         
                        int index60_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred115_Haxe()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index60_21);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA60_22 = input.LA(1);

                         
                        int index60_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred115_Haxe()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index60_22);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA60_23 = input.LA(1);

                         
                        int index60_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred115_Haxe()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index60_23);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA60_24 = input.LA(1);

                         
                        int index60_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred115_Haxe()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index60_24);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA60_25 = input.LA(1);

                         
                        int index60_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred115_Haxe()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index60_25);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA60_26 = input.LA(1);

                         
                        int index60_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred115_Haxe()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index60_26);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA60_27 = input.LA(1);

                         
                        int index60_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred115_Haxe()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index60_27);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA60_28 = input.LA(1);

                         
                        int index60_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred115_Haxe()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index60_28);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA60_29 = input.LA(1);

                         
                        int index60_29 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred115_Haxe()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index60_29);
                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA60_30 = input.LA(1);

                         
                        int index60_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred115_Haxe()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index60_30);
                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA60_31 = input.LA(1);

                         
                        int index60_31 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred115_Haxe()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index60_31);
                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA60_32 = input.LA(1);

                         
                        int index60_32 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred115_Haxe()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index60_32);
                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA60_33 = input.LA(1);

                         
                        int index60_33 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred115_Haxe()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index60_33);
                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA60_34 = input.LA(1);

                         
                        int index60_34 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred115_Haxe()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index60_34);
                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA60_35 = input.LA(1);

                         
                        int index60_35 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred115_Haxe()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index60_35);
                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA60_36 = input.LA(1);

                         
                        int index60_36 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred115_Haxe()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index60_36);
                        if ( s>=0 ) return s;
                        break;
                    case 36 : 
                        int LA60_37 = input.LA(1);

                         
                        int index60_37 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred115_Haxe()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index60_37);
                        if ( s>=0 ) return s;
                        break;
                    case 37 : 
                        int LA60_38 = input.LA(1);

                         
                        int index60_38 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred115_Haxe()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index60_38);
                        if ( s>=0 ) return s;
                        break;
                    case 38 : 
                        int LA60_39 = input.LA(1);

                         
                        int index60_39 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred115_Haxe()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index60_39);
                        if ( s>=0 ) return s;
                        break;
                    case 39 : 
                        int LA60_40 = input.LA(1);

                         
                        int index60_40 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred115_Haxe()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index60_40);
                        if ( s>=0 ) return s;
                        break;
                    case 40 : 
                        int LA60_41 = input.LA(1);

                         
                        int index60_41 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred115_Haxe()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index60_41);
                        if ( s>=0 ) return s;
                        break;
                    case 41 : 
                        int LA60_42 = input.LA(1);

                         
                        int index60_42 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred115_Haxe()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index60_42);
                        if ( s>=0 ) return s;
                        break;
                    case 42 : 
                        int LA60_43 = input.LA(1);

                         
                        int index60_43 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred115_Haxe()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index60_43);
                        if ( s>=0 ) return s;
                        break;
                    case 43 : 
                        int LA60_44 = input.LA(1);

                         
                        int index60_44 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred115_Haxe()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index60_44);
                        if ( s>=0 ) return s;
                        break;
                    case 44 : 
                        int LA60_46 = input.LA(1);

                         
                        int index60_46 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred115_Haxe()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index60_46);
                        if ( s>=0 ) return s;
                        break;
                    case 45 : 
                        int LA60_64 = input.LA(1);

                         
                        int index60_64 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred115_Haxe()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index60_64);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 60, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA73_eotS =
        "\11\uffff";
    static final String DFA73_eofS =
        "\11\uffff";
    static final String DFA73_minS =
        "\6\27\1\24\2\uffff";
    static final String DFA73_maxS =
        "\6\51\1\65\2\uffff";
    static final String DFA73_acceptS =
        "\7\uffff\1\1\1\2";
    static final String DFA73_specialS =
        "\11\uffff}>";
    static final String[] DFA73_transitionS = {
            "\1\5\3\uffff\1\5\1\1\1\2\1\3\1\4\11\uffff\1\6",
            "\1\5\3\uffff\1\5\1\1\1\2\1\3\1\4\11\uffff\1\6",
            "\1\5\3\uffff\1\5\1\1\1\2\1\3\1\4\11\uffff\1\6",
            "\1\5\3\uffff\1\5\1\1\1\2\1\3\1\4\11\uffff\1\6",
            "\1\5\3\uffff\1\5\1\1\1\2\1\3\1\4\11\uffff\1\6",
            "\1\5\3\uffff\1\5\1\1\1\2\1\3\1\4\11\uffff\1\6",
            "\1\10\40\uffff\1\7",
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
            return "425:1: funcDecl : ( ( declAttrList )? FUNCTION NEW LPAREN paramList RPAREN typeTagOpt block -> ^( FUNCTION NEW ( declAttrList )? ( paramList )? ( typeTagOpt )? ( block )? ) | ( declAttrList )? FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt block -> ^( FUNCTION IDENTIFIER ( declAttrList )? ( paramList )? ( typeTagOpt )? ( block )? ( typeParamOpt )? ) );";
        }
    }
    static final String DFA74_eotS =
        "\14\uffff";
    static final String DFA74_eofS =
        "\14\uffff";
    static final String DFA74_minS =
        "\6\27\2\24\4\uffff";
    static final String DFA74_maxS =
        "\6\51\2\65\4\uffff";
    static final String DFA74_acceptS =
        "\10\uffff\1\3\1\4\1\1\1\2";
    static final String DFA74_specialS =
        "\14\uffff}>";
    static final String[] DFA74_transitionS = {
            "\1\5\3\uffff\1\5\1\1\1\2\1\3\1\4\11\uffff\1\6",
            "\1\5\3\uffff\1\5\1\1\1\2\1\3\1\4\11\uffff\1\7",
            "\1\5\3\uffff\1\5\1\1\1\2\1\3\1\4\11\uffff\1\7",
            "\1\5\3\uffff\1\5\1\1\1\2\1\3\1\4\11\uffff\1\7",
            "\1\5\3\uffff\1\5\1\1\1\2\1\3\1\4\11\uffff\1\7",
            "\1\5\3\uffff\1\5\1\1\1\2\1\3\1\4\11\uffff\1\7",
            "\1\11\40\uffff\1\10",
            "\1\13\40\uffff\1\12",
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
            return "431:1: funcProtoDecl : ( declAttrList FUNCTION NEW LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTagOpt )? ( declAttrList )? ) | declAttrList FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTagOpt )? ( declAttrList )? ( typeParamOpt )? ) | FUNCTION NEW LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTagOpt )? ) | FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTagOpt )? ( typeParamOpt )? ) );";
        }
    }
    static final String DFA76_eotS =
        "\12\uffff";
    static final String DFA76_eofS =
        "\12\uffff";
    static final String DFA76_minS =
        "\1\21\4\27\1\26\3\uffff\1\27";
    static final String DFA76_maxS =
        "\6\137\3\uffff\1\137";
    static final String DFA76_acceptS =
        "\6\uffff\1\1\1\2\1\3\1\uffff";
    static final String DFA76_specialS =
        "\12\uffff}>";
    static final String[] DFA76_transitionS = {
            "\1\10\4\uffff\1\10\1\5\3\uffff\1\11\1\1\1\2\1\3\1\4\11\uffff"+
            "\1\7\64\uffff\1\10\1\6",
            "\1\11\3\uffff\1\11\1\1\1\2\1\3\1\4\11\uffff\1\7\65\uffff\1"+
            "\6",
            "\1\11\3\uffff\1\11\1\1\1\2\1\3\1\4\11\uffff\1\7\65\uffff\1"+
            "\6",
            "\1\11\3\uffff\1\11\1\1\1\2\1\3\1\4\11\uffff\1\7\65\uffff\1"+
            "\6",
            "\1\11\3\uffff\1\11\1\1\1\2\1\3\1\4\11\uffff\1\7\65\uffff\1"+
            "\6",
            "\1\10\1\5\3\uffff\1\11\1\1\1\2\1\3\1\4\11\uffff\1\7\64\uffff"+
            "\1\10\1\6",
            "",
            "",
            "",
            "\1\11\3\uffff\1\11\1\1\1\2\1\3\1\4\11\uffff\1\7\65\uffff\1"+
            "\6"
    };

    static final short[] DFA76_eot = DFA.unpackEncodedString(DFA76_eotS);
    static final short[] DFA76_eof = DFA.unpackEncodedString(DFA76_eofS);
    static final char[] DFA76_min = DFA.unpackEncodedStringToUnsignedChars(DFA76_minS);
    static final char[] DFA76_max = DFA.unpackEncodedStringToUnsignedChars(DFA76_maxS);
    static final short[] DFA76_accept = DFA.unpackEncodedString(DFA76_acceptS);
    static final short[] DFA76_special = DFA.unpackEncodedString(DFA76_specialS);
    static final short[][] DFA76_transition;

    static {
        int numStates = DFA76_transitionS.length;
        DFA76_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA76_transition[i] = DFA.unpackEncodedString(DFA76_transitionS[i]);
        }
    }

    class DFA76 extends DFA {

        public DFA76(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 76;
            this.eot = DFA76_eot;
            this.eof = DFA76_eof;
            this.min = DFA76_min;
            this.max = DFA76_max;
            this.accept = DFA76_accept;
            this.special = DFA76_special;
            this.transition = DFA76_transition;
        }
        public String getDescription() {
            return "451:1: classMember : ( varDecl | funcDecl | enumDecl );";
        }
    }
    static final String DFA77_eotS =
        "\11\uffff";
    static final String DFA77_eofS =
        "\1\10\10\uffff";
    static final String DFA77_minS =
        "\6\27\3\uffff";
    static final String DFA77_maxS =
        "\6\137\3\uffff";
    static final String DFA77_acceptS =
        "\6\uffff\1\1\1\2\1\3";
    static final String DFA77_specialS =
        "\11\uffff}>";
    static final String[] DFA77_transitionS = {
            "\1\5\3\uffff\1\5\1\1\1\2\1\3\1\4\11\uffff\1\7\25\uffff\1\10"+
            "\37\uffff\1\6",
            "\1\5\3\uffff\1\5\1\1\1\2\1\3\1\4\11\uffff\1\7\65\uffff\1\6",
            "\1\5\3\uffff\1\5\1\1\1\2\1\3\1\4\11\uffff\1\7\65\uffff\1\6",
            "\1\5\3\uffff\1\5\1\1\1\2\1\3\1\4\11\uffff\1\7\65\uffff\1\6",
            "\1\5\3\uffff\1\5\1\1\1\2\1\3\1\4\11\uffff\1\7\65\uffff\1\6",
            "\1\5\3\uffff\1\5\1\1\1\2\1\3\1\4\11\uffff\1\7\65\uffff\1\6",
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
            return "462:1: interfaceBody : ( varDecl interfaceBody | funcProtoDecl interfaceBody | );";
        }
    }
    static final String DFA97_eotS =
        "\101\uffff";
    static final String DFA97_eofS =
        "\101\uffff";
    static final String DFA97_minS =
        "\1\20\54\0\1\uffff\1\0\21\uffff\1\0";
    static final String DFA97_maxS =
        "\1\153\54\0\1\uffff\1\0\21\uffff\1\0";
    static final String DFA97_acceptS =
        "\55\uffff\1\1\1\uffff\1\2\21\uffff";
    static final String DFA97_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"+
        "\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30"+
        "\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45"+
        "\1\46\1\47\1\50\1\51\1\52\1\53\1\uffff\1\54\21\uffff\1\55}>";
    static final String[] DFA97_transitionS = {
            "\1\57\1\uffff\1\17\1\55\1\20\2\uffff\1\57\3\uffff\5\57\1\uffff"+
            "\1\45\1\100\1\47\1\50\1\51\1\52\1\53\1\54\1\4\1\5\6\uffff\1"+
            "\23\1\32\1\uffff\1\33\1\2\1\57\1\uffff\1\57\1\uffff\4\57\1\6"+
            "\1\uffff\4\57\3\uffff\1\56\1\46\1\44\1\43\1\37\1\40\1\41\1\42"+
            "\1\34\1\35\1\36\1\31\1\27\1\22\1\24\1\25\1\26\1\21\1\1\2\30"+
            "\1\7\1\3\1\uffff\1\57\5\uffff\1\10\1\11\1\12\1\13\1\14\1\15"+
            "\1\16",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
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

    static final short[] DFA97_eot = DFA.unpackEncodedString(DFA97_eotS);
    static final short[] DFA97_eof = DFA.unpackEncodedString(DFA97_eofS);
    static final char[] DFA97_min = DFA.unpackEncodedStringToUnsignedChars(DFA97_minS);
    static final char[] DFA97_max = DFA.unpackEncodedStringToUnsignedChars(DFA97_maxS);
    static final short[] DFA97_accept = DFA.unpackEncodedString(DFA97_acceptS);
    static final short[] DFA97_special = DFA.unpackEncodedString(DFA97_specialS);
    static final short[][] DFA97_transition;

    static {
        int numStates = DFA97_transitionS.length;
        DFA97_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA97_transition[i] = DFA.unpackEncodedString(DFA97_transitionS[i]);
        }
    }

    class DFA97 extends DFA {

        public DFA97(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 97;
            this.eot = DFA97_eot;
            this.eof = DFA97_eof;
            this.min = DFA97_min;
            this.max = DFA97_max;
            this.accept = DFA97_accept;
            this.special = DFA97_special;
            this.transition = DFA97_transition;
        }
        public String getDescription() {
            return "356:22: ( expr | statement )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA97_1 = input.LA(1);

                         
                        int index97_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred115_Haxe()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index97_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA97_2 = input.LA(1);

                         
                        int index97_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred115_Haxe()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index97_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA97_3 = input.LA(1);

                         
                        int index97_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred115_Haxe()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index97_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA97_4 = input.LA(1);

                         
                        int index97_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred115_Haxe()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index97_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA97_5 = input.LA(1);

                         
                        int index97_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred115_Haxe()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index97_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA97_6 = input.LA(1);

                         
                        int index97_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred115_Haxe()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index97_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA97_7 = input.LA(1);

                         
                        int index97_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred115_Haxe()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index97_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA97_8 = input.LA(1);

                         
                        int index97_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred115_Haxe()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index97_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA97_9 = input.LA(1);

                         
                        int index97_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred115_Haxe()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index97_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA97_10 = input.LA(1);

                         
                        int index97_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred115_Haxe()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index97_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA97_11 = input.LA(1);

                         
                        int index97_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred115_Haxe()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index97_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA97_12 = input.LA(1);

                         
                        int index97_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred115_Haxe()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index97_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA97_13 = input.LA(1);

                         
                        int index97_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred115_Haxe()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index97_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA97_14 = input.LA(1);

                         
                        int index97_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred115_Haxe()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index97_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA97_15 = input.LA(1);

                         
                        int index97_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred115_Haxe()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index97_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA97_16 = input.LA(1);

                         
                        int index97_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred115_Haxe()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index97_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA97_17 = input.LA(1);

                         
                        int index97_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred115_Haxe()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index97_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA97_18 = input.LA(1);

                         
                        int index97_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred115_Haxe()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index97_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA97_19 = input.LA(1);

                         
                        int index97_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred115_Haxe()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index97_19);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA97_20 = input.LA(1);

                         
                        int index97_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred115_Haxe()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index97_20);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA97_21 = input.LA(1);

                         
                        int index97_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred115_Haxe()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index97_21);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA97_22 = input.LA(1);

                         
                        int index97_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred115_Haxe()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index97_22);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA97_23 = input.LA(1);

                         
                        int index97_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred115_Haxe()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index97_23);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA97_24 = input.LA(1);

                         
                        int index97_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred115_Haxe()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index97_24);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA97_25 = input.LA(1);

                         
                        int index97_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred115_Haxe()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index97_25);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA97_26 = input.LA(1);

                         
                        int index97_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred115_Haxe()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index97_26);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA97_27 = input.LA(1);

                         
                        int index97_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred115_Haxe()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index97_27);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA97_28 = input.LA(1);

                         
                        int index97_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred115_Haxe()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index97_28);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA97_29 = input.LA(1);

                         
                        int index97_29 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred115_Haxe()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index97_29);
                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA97_30 = input.LA(1);

                         
                        int index97_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred115_Haxe()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index97_30);
                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA97_31 = input.LA(1);

                         
                        int index97_31 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred115_Haxe()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index97_31);
                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA97_32 = input.LA(1);

                         
                        int index97_32 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred115_Haxe()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index97_32);
                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA97_33 = input.LA(1);

                         
                        int index97_33 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred115_Haxe()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index97_33);
                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA97_34 = input.LA(1);

                         
                        int index97_34 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred115_Haxe()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index97_34);
                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA97_35 = input.LA(1);

                         
                        int index97_35 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred115_Haxe()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index97_35);
                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA97_36 = input.LA(1);

                         
                        int index97_36 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred115_Haxe()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index97_36);
                        if ( s>=0 ) return s;
                        break;
                    case 36 : 
                        int LA97_37 = input.LA(1);

                         
                        int index97_37 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred115_Haxe()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index97_37);
                        if ( s>=0 ) return s;
                        break;
                    case 37 : 
                        int LA97_38 = input.LA(1);

                         
                        int index97_38 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred115_Haxe()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index97_38);
                        if ( s>=0 ) return s;
                        break;
                    case 38 : 
                        int LA97_39 = input.LA(1);

                         
                        int index97_39 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred115_Haxe()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index97_39);
                        if ( s>=0 ) return s;
                        break;
                    case 39 : 
                        int LA97_40 = input.LA(1);

                         
                        int index97_40 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred115_Haxe()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index97_40);
                        if ( s>=0 ) return s;
                        break;
                    case 40 : 
                        int LA97_41 = input.LA(1);

                         
                        int index97_41 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred115_Haxe()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index97_41);
                        if ( s>=0 ) return s;
                        break;
                    case 41 : 
                        int LA97_42 = input.LA(1);

                         
                        int index97_42 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred115_Haxe()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index97_42);
                        if ( s>=0 ) return s;
                        break;
                    case 42 : 
                        int LA97_43 = input.LA(1);

                         
                        int index97_43 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred115_Haxe()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index97_43);
                        if ( s>=0 ) return s;
                        break;
                    case 43 : 
                        int LA97_44 = input.LA(1);

                         
                        int index97_44 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred115_Haxe()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index97_44);
                        if ( s>=0 ) return s;
                        break;
                    case 44 : 
                        int LA97_46 = input.LA(1);

                         
                        int index97_46 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred115_Haxe()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index97_46);
                        if ( s>=0 ) return s;
                        break;
                    case 45 : 
                        int LA97_64 = input.LA(1);

                         
                        int index97_64 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred115_Haxe()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index97_64);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 97, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_myPackage_in_module123 = new BitSet(new long[]{0x0000000006C20000L,0x0000001340000000L});
    public static final BitSet FOLLOW_topLevelList_in_module126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_topLevel_in_topLevelList155 = new BitSet(new long[]{0x0000000006C20002L,0x0000001340000000L});
    public static final BitSet FOLLOW_myImport_in_topLevel168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_topLevelDecl_in_topLevel174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PACKAGE_in_myPackage185 = new BitSet(new long[]{0x0000000400100000L});
    public static final BitSet FOLLOW_dotIdent_in_myPackage187 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_SEMI_in_myPackage189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MONKEYS_AT_in_meta208 = new BitSet(new long[]{0x0001E00040300000L});
    public static final BitSet FOLLOW_metaName_in_meta210 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_LPAREN_in_meta213 = new BitSet(new long[]{0x0000000200180000L});
    public static final BitSet FOLLOW_paramList_in_meta215 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_RPAREN_in_meta217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_metaName230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveType_in_metaName235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_in_metaName241 = new BitSet(new long[]{0x0001E00040300000L});
    public static final BitSet FOLLOW_metaName_in_metaName243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_meta_in_typeDeclFlags255 = new BitSet(new long[]{0x0000000000C20002L});
    public static final BitSet FOLLOW_set_in_typeDeclFlags259 = new BitSet(new long[]{0x0000000000C00002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_qualifiedIdentifier281 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_DOT_in_qualifiedIdentifier294 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_qualifiedIdentifier298 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_IMPORT_in_myImport327 = new BitSet(new long[]{0x0000000400100000L});
    public static final BitSet FOLLOW_dotIdent_in_myImport330 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_SEMI_in_myImport332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_USING_in_myImport338 = new BitSet(new long[]{0x0000000400100000L});
    public static final BitSet FOLLOW_dotIdent_in_myImport341 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_SEMI_in_myImport343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_access0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STATIC_in_declAttr392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INLINE_in_declAttr397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DYNAMIC_in_declAttr402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OVERRIDE_in_declAttr407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_access_in_declAttr412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttr_in_declAttrList424 = new BitSet(new long[]{0x00000000F8800002L});
    public static final BitSet FOLLOW_param_in_paramList450 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_COMMA_in_paramList453 = new BitSet(new long[]{0x0000000200100000L});
    public static final BitSet FOLLOW_param_in_paramList455 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_QUES_in_param485 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_param488 = new BitSet(new long[]{0x0000000800200000L});
    public static final BitSet FOLLOW_typeTagOpt_in_param490 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_varInit_in_param492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_id0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_dotIdent547 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_DOT_in_dotIdent555 = new BitSet(new long[]{0x0000000400100000L});
    public static final BitSet FOLLOW_id_in_dotIdent559 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_EQ_in_assignOp585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUSEQ_in_assignOp599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUBEQ_in_assignOp613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SLASHEQ_in_assignOp626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PERCENTEQ_in_assignOp639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AMPEQ_in_assignOp652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_in_funcLit671 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_LPAREN_in_funcLit673 = new BitSet(new long[]{0x0000000200180000L});
    public static final BitSet FOLLOW_paramList_in_funcLit675 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_RPAREN_in_funcLit677 = new BitSet(new long[]{0x4000000000210000L});
    public static final BitSet FOLLOW_typeTagOpt_in_funcLit679 = new BitSet(new long[]{0x4000000000210000L});
    public static final BitSet FOLLOW_block_in_funcLit682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACKET_in_arrayLit717 = new BitSet(new long[]{0x40220E0400140000L,0x00000FE03F100080L});
    public static final BitSet FOLLOW_exprListOpt_in_arrayLit720 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_RBRACKET_in_arrayLit722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_in_typeTag741 = new BitSet(new long[]{0x4001F00440100000L});
    public static final BitSet FOLLOW_funcType_in_typeTag744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeTag_in_typeTagOpt756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_typeList782 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_COMMA_in_typeList785 = new BitSet(new long[]{0x4001E00540100000L});
    public static final BitSet FOLLOW_type_in_typeList788 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_typeConstraint_in_typeList796 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_COMMA_in_typeList799 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_typeConstraint_in_typeList802 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_type_in_funcType817 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_MINUS_BIGGER_in_funcType821 = new BitSet(new long[]{0x4001F00440100000L});
    public static final BitSet FOLLOW_type_in_funcType824 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_VOID_in_funcType831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_primitiveType0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_anonType_in_type870 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_dotIdent_in_type874 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_primitiveType_in_type878 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_typeParam_in_type883 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_LT_in_typeParam901 = new BitSet(new long[]{0x4001E00540100000L});
    public static final BitSet FOLLOW_typeList_in_typeParam904 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_GT_in_typeParam906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_in_typeParam912 = new BitSet(new long[]{0x4001E00540100000L});
    public static final BitSet FOLLOW_typeList_in_typeParam915 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_LT_in_typeParam917 = new BitSet(new long[]{0x4001E00540100000L});
    public static final BitSet FOLLOW_typeList_in_typeParam920 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_GTGT_in_typeParam922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_in_typeParam928 = new BitSet(new long[]{0x4001E00540100000L});
    public static final BitSet FOLLOW_typeList_in_typeParam931 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_LT_in_typeParam933 = new BitSet(new long[]{0x4001E00540100000L});
    public static final BitSet FOLLOW_typeList_in_typeParam936 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_LT_in_typeParam938 = new BitSet(new long[]{0x4001E00540100000L});
    public static final BitSet FOLLOW_typeList_in_typeParam941 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_GTGTGT_in_typeParam943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeParam_in_typeParamOpt963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_typeConstraint998 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_COLON_in_typeConstraint1000 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_LPAREN_in_typeConstraint1002 = new BitSet(new long[]{0x4001E00540100000L});
    public static final BitSet FOLLOW_typeList_in_typeConstraint1004 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_RPAREN_in_typeConstraint1006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttrList_in_functionReturn1032 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_FUNCTION_in_functionReturn1035 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_NEW_in_functionReturn1037 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_LPAREN_in_functionReturn1039 = new BitSet(new long[]{0x0000000200180000L});
    public static final BitSet FOLLOW_paramList_in_functionReturn1041 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_RPAREN_in_functionReturn1043 = new BitSet(new long[]{0x4000000000210000L});
    public static final BitSet FOLLOW_typeTagOpt_in_functionReturn1045 = new BitSet(new long[]{0x4000000000210000L});
    public static final BitSet FOLLOW_block_in_functionReturn1047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_statement1084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignExpr_in_statement1089 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_SEMI_in_statement1091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDecl_in_statement1097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_statement1102 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_parExpression_in_statement1104 = new BitSet(new long[]{0x7D620604F8B50000L,0x00000FE0BF10008FL});
    public static final BitSet FOLLOW_statement_in_statement1108 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_ELSE_in_statement1111 = new BitSet(new long[]{0x7D620604F8B50000L,0x00000FE0BF10008FL});
    public static final BitSet FOLLOW_statement_in_statement1115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_statement1155 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_LPAREN_in_statement1157 = new BitSet(new long[]{0x4022060400140000L,0x00000FE03F100080L});
    public static final BitSet FOLLOW_expr_in_statement1161 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_IN_in_statement1163 = new BitSet(new long[]{0x4022060400140000L,0x00000FE03F100080L});
    public static final BitSet FOLLOW_expr_in_statement1167 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_RPAREN_in_statement1169 = new BitSet(new long[]{0x7D620604F8B50000L,0x00000FE0BF10008FL});
    public static final BitSet FOLLOW_statement_in_statement1171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_statement1199 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_parExpression_in_statement1201 = new BitSet(new long[]{0x7D620604F8B50000L,0x00000FE0BF10008FL});
    public static final BitSet FOLLOW_statement_in_statement1203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DO_in_statement1227 = new BitSet(new long[]{0x7D620604F8B50000L,0x00000FE0BF10008FL});
    public static final BitSet FOLLOW_statement_in_statement1229 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_WHILE_in_statement1231 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_parExpression_in_statement1233 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_SEMI_in_statement1235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRY_in_statement1258 = new BitSet(new long[]{0x4000000000210000L});
    public static final BitSet FOLLOW_block_in_statement1260 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_catchStmtList_in_statement1262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SWITCH_in_statement1286 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_LPAREN_in_statement1288 = new BitSet(new long[]{0x4022060400140000L,0x00000FE03F100080L});
    public static final BitSet FOLLOW_expr_in_statement1290 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_RPAREN_in_statement1292 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_LBRACE_in_statement1294 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000030L});
    public static final BitSet FOLLOW_caseStmt_in_statement1296 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000030L});
    public static final BitSet FOLLOW_RBRACE_in_statement1299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_statement1320 = new BitSet(new long[]{0x4022060400150000L,0x00000FE03F100080L});
    public static final BitSet FOLLOW_expr_in_statement1323 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_SEMI_in_statement1327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THROW_in_statement1345 = new BitSet(new long[]{0x4022060400140000L,0x00000FE03F100080L});
    public static final BitSet FOLLOW_expr_in_statement1347 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_SEMI_in_statement1349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BREAK_in_statement1368 = new BitSet(new long[]{0x0000000000110000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_statement1371 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_SEMI_in_statement1375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONTINUE_in_statement1392 = new BitSet(new long[]{0x0000000000110000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_statement1395 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_SEMI_in_statement1399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_statement1417 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_SEMI_in_statement1420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_statement1426 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_COLON_in_statement1428 = new BitSet(new long[]{0x7D620604F8B50000L,0x00000FE0BF10008FL});
    public static final BitSet FOLLOW_statement_in_statement1430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMI_in_statement1451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_parExpression1469 = new BitSet(new long[]{0x4022060400140000L,0x00000FE03F100080L});
    public static final BitSet FOLLOW_expr_in_parExpression1471 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_RPAREN_in_parExpression1473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_block1484 = new BitSet(new long[]{0xFD620604F8F70000L,0x00000FE1BF10008FL});
    public static final BitSet FOLLOW_blockStmt_in_block1487 = new BitSet(new long[]{0xFD620604F8F70000L,0x00000FE1BF10008FL});
    public static final BitSet FOLLOW_RBRACE_in_block1491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMI_in_block1516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDecl_in_blockStmt1529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classDecl_in_blockStmt1534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_blockStmt1539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BREAK_in_breakStmt1572 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_SEMI_in_breakStmt1574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONTINUE_in_continueStmt1593 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_SEMI_in_continueStmt1595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CASE_in_caseStmt1606 = new BitSet(new long[]{0x4022060400140000L,0x00000FE03F100080L});
    public static final BitSet FOLLOW_exprList_in_caseStmt1608 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_COLON_in_caseStmt1610 = new BitSet(new long[]{0x7D620604F8B50000L,0x00000FE0BF10008FL});
    public static final BitSet FOLLOW_statement_in_caseStmt1612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_caseStmt1630 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_COLON_in_caseStmt1632 = new BitSet(new long[]{0x7D620604F8B50000L,0x00000FE0BF10008FL});
    public static final BitSet FOLLOW_statement_in_caseStmt1634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_defaultStmt1663 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_COLON_in_defaultStmt1665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_catchStmt_in_catchStmtList1678 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_catchStmtList_in_catchStmtList1680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CATCH_in_catchStmt1702 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_LPAREN_in_catchStmt1704 = new BitSet(new long[]{0x0000000200100000L});
    public static final BitSet FOLLOW_param_in_catchStmt1706 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_RPAREN_in_catchStmt1708 = new BitSet(new long[]{0x4000000000210000L});
    public static final BitSet FOLLOW_block_in_catchStmt1710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprList_in_exprListOpt1736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_exprList1749 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_COMMA_in_exprList1752 = new BitSet(new long[]{0x4022060400140000L,0x00000FE03F100080L});
    public static final BitSet FOLLOW_expr_in_exprList1755 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_assignExpr_in_expr1768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNTYPED_in_expr1773 = new BitSet(new long[]{0x4022060400140000L,0x00000FE03F100080L});
    public static final BitSet FOLLOW_assignExpr_in_expr1775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignExprEx_in_assignExpr1795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNTYPED_in_assignExpr1800 = new BitSet(new long[]{0x4022060400140000L,0x00000FE03F100000L});
    public static final BitSet FOLLOW_assignExprEx_in_assignExpr1802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iterExpr_in_assignExprEx1822 = new BitSet(new long[]{0x000001F800000002L});
    public static final BitSet FOLLOW_assignOp_in_assignExprEx1825 = new BitSet(new long[]{0x4022060400140000L,0x00000FE03F100000L});
    public static final BitSet FOLLOW_iterExpr_in_assignExprEx1828 = new BitSet(new long[]{0x000001F800000002L});
    public static final BitSet FOLLOW_ternaryExpr_in_iterExpr1840 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_ELLIPSIS_in_iterExpr1843 = new BitSet(new long[]{0x4022060400140000L,0x00000FE03F100000L});
    public static final BitSet FOLLOW_ternaryExpr_in_iterExpr1846 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_logicOrExpr_in_ternaryExpr1859 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_QUES_in_ternaryExpr1862 = new BitSet(new long[]{0x4022060400140000L,0x00000FE03F100080L});
    public static final BitSet FOLLOW_expr_in_ternaryExpr1865 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_COLON_in_ternaryExpr1867 = new BitSet(new long[]{0x4022060400140000L,0x00000FE03F100000L});
    public static final BitSet FOLLOW_logicOrExpr_in_ternaryExpr1870 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_logicAndExpr_in_logicOrExpr1890 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_BARBAR_in_logicOrExpr1893 = new BitSet(new long[]{0x4022060400140000L,0x00000FE03F100000L});
    public static final BitSet FOLLOW_logicAndExpr_in_logicOrExpr1896 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_cmpExpr_in_logicAndExpr1917 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_AMPAMP_in_logicAndExpr1921 = new BitSet(new long[]{0x4022060400140000L,0x00000FE03F100000L});
    public static final BitSet FOLLOW_cmpExpr_in_logicAndExpr1924 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_bitExpr_in_cmpExpr1938 = new BitSet(new long[]{0x0006000000000002L,0x0000000000007800L});
    public static final BitSet FOLLOW_EQEQ_in_cmpExpr1943 = new BitSet(new long[]{0x4022060400140000L,0x00000FE03F100000L});
    public static final BitSet FOLLOW_BANGEQ_in_cmpExpr1947 = new BitSet(new long[]{0x4022060400140000L,0x00000FE03F100000L});
    public static final BitSet FOLLOW_GTEQ_in_cmpExpr1952 = new BitSet(new long[]{0x4022060400140000L,0x00000FE03F100000L});
    public static final BitSet FOLLOW_LTEQ_in_cmpExpr1957 = new BitSet(new long[]{0x4022060400140000L,0x00000FE03F100000L});
    public static final BitSet FOLLOW_GT_in_cmpExpr1962 = new BitSet(new long[]{0x4022060400140000L,0x00000FE03F100000L});
    public static final BitSet FOLLOW_LT_in_cmpExpr1967 = new BitSet(new long[]{0x4022060400140000L,0x00000FE03F100000L});
    public static final BitSet FOLLOW_bitExpr_in_cmpExpr1972 = new BitSet(new long[]{0x0006000000000002L,0x0000000000007800L});
    public static final BitSet FOLLOW_shiftExpr_in_bitExpr1986 = new BitSet(new long[]{0x0000000000000002L,0x0000000000038000L});
    public static final BitSet FOLLOW_BAR_in_bitExpr1990 = new BitSet(new long[]{0x4022060400140000L,0x00000FE03F100000L});
    public static final BitSet FOLLOW_shiftExpr_in_bitExpr1993 = new BitSet(new long[]{0x0000000000000002L,0x0000000000038000L});
    public static final BitSet FOLLOW_AMP_in_bitExpr1997 = new BitSet(new long[]{0x4022060400140000L,0x00000FE03F100000L});
    public static final BitSet FOLLOW_shiftExpr_in_bitExpr2000 = new BitSet(new long[]{0x0000000000000002L,0x0000000000038000L});
    public static final BitSet FOLLOW_CARET_in_bitExpr2003 = new BitSet(new long[]{0x4022060400140000L,0x00000FE03F100000L});
    public static final BitSet FOLLOW_shiftExpr_in_bitExpr2006 = new BitSet(new long[]{0x0000000000000002L,0x0000000000038000L});
    public static final BitSet FOLLOW_addExpr_in_shiftExpr2020 = new BitSet(new long[]{0x0014000000000002L,0x0000000000040000L});
    public static final BitSet FOLLOW_LTLT_in_shiftExpr2024 = new BitSet(new long[]{0x4022060400140000L,0x00000FE03F100000L});
    public static final BitSet FOLLOW_addExpr_in_shiftExpr2028 = new BitSet(new long[]{0x0014000000000002L,0x0000000000040000L});
    public static final BitSet FOLLOW_GT_in_shiftExpr2033 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_GT_in_shiftExpr2035 = new BitSet(new long[]{0x4022060400140000L,0x00000FE03F100000L});
    public static final BitSet FOLLOW_addExpr_in_shiftExpr2040 = new BitSet(new long[]{0x0014000000000002L,0x0000000000040000L});
    public static final BitSet FOLLOW_GTGTGT_in_shiftExpr2044 = new BitSet(new long[]{0x4022060400140000L,0x00000FE03F100000L});
    public static final BitSet FOLLOW_addExpr_in_shiftExpr2047 = new BitSet(new long[]{0x0014000000000002L,0x0000000000040000L});
    public static final BitSet FOLLOW_multExpr_in_addExpr2061 = new BitSet(new long[]{0x0000000000000002L,0x0000000000180000L});
    public static final BitSet FOLLOW_PLUS_in_addExpr2066 = new BitSet(new long[]{0x4022060400140000L,0x00000FE03F100000L});
    public static final BitSet FOLLOW_SUB_in_addExpr2071 = new BitSet(new long[]{0x4022060400140000L,0x00000FE03F100000L});
    public static final BitSet FOLLOW_multExpr_in_addExpr2075 = new BitSet(new long[]{0x0000000000000002L,0x0000000000180000L});
    public static final BitSet FOLLOW_prefixExpr_in_multExpr2089 = new BitSet(new long[]{0x0000000000000002L,0x0000000000E00000L});
    public static final BitSet FOLLOW_STAR_in_multExpr2094 = new BitSet(new long[]{0x4022060400140000L,0x00000FE03F100000L});
    public static final BitSet FOLLOW_SLASH_in_multExpr2097 = new BitSet(new long[]{0x4022060400140000L,0x00000FE03F100000L});
    public static final BitSet FOLLOW_PERCENT_in_multExpr2100 = new BitSet(new long[]{0x4022060400140000L,0x00000FE03F100000L});
    public static final BitSet FOLLOW_prefixExpr_in_multExpr2104 = new BitSet(new long[]{0x0000000000000002L,0x0000000000E00000L});
    public static final BitSet FOLLOW_set_in_prefixExpr2125 = new BitSet(new long[]{0x4022060400140000L,0x00000FE03F100000L});
    public static final BitSet FOLLOW_prefixExpr_in_prefixExpr2137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_newExpr_in_prefixExpr2149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cast_in_prefixExpr2161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_suffixExpr_in_prefixExpr2173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_suffixExpr2192 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_LPAREN_in_suffixExpr2194 = new BitSet(new long[]{0x40220604001C0000L,0x00000FE03F100080L});
    public static final BitSet FOLLOW_exprListOpt_in_suffixExpr2196 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_RPAREN_in_suffixExpr2198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_suffixExpr2219 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_LBRACKET_in_suffixExpr2221 = new BitSet(new long[]{0x4022060400140000L,0x00000FE03F100080L});
    public static final BitSet FOLLOW_expr_in_suffixExpr2223 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_RBRACKET_in_suffixExpr2225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_suffixExpr2230 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_PLUSPLUS_in_suffixExpr2232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_suffixExpr2256 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_SUBSUB_in_suffixExpr2258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_suffixExpr2281 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_typeParamOpt_in_suffixExpr2283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcLit_in_value2292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayLit_in_value2298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objLit_in_value2313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_value2328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_elementarySymbol_in_value2343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_value2358 = new BitSet(new long[]{0x7D620604F8B50000L,0x00000FE0BF10008FL});
    public static final BitSet FOLLOW_expr_in_value2362 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_statement_in_value2364 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_RPAREN_in_value2367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dotIdent_in_value2380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEW_in_newExpr2419 = new BitSet(new long[]{0x4001E00440140000L});
    public static final BitSet FOLLOW_type_in_newExpr2421 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_LPAREN_in_newExpr2423 = new BitSet(new long[]{0x40220604001C0000L,0x00000FE03F100080L});
    public static final BitSet FOLLOW_exprListOpt_in_newExpr2425 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_RPAREN_in_newExpr2427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CAST_in_cast2453 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_LPAREN_in_cast2455 = new BitSet(new long[]{0x4022060400140000L,0x00000FE03F100080L});
    public static final BitSet FOLLOW_expr_in_cast2457 = new BitSet(new long[]{0x0000000100080000L});
    public static final BitSet FOLLOW_COMMA_in_cast2460 = new BitSet(new long[]{0x4001F00440100000L});
    public static final BitSet FOLLOW_funcType_in_cast2462 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_RPAREN_in_cast2466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CAST_in_cast2484 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_LPAREN_in_cast2486 = new BitSet(new long[]{0x4022060400140000L,0x00000FE03F100080L});
    public static final BitSet FOLLOW_expr_in_cast2488 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_RPAREN_in_cast2490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classDecl_in_topLevelDecl2524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interfaceDecl_in_topLevelDecl2529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumDecl_in_topLevelDecl2541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typedefDecl_in_topLevelDecl2546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeDeclFlags_in_enumDecl2556 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_ENUM_in_enumDecl2558 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_enumDecl2560 = new BitSet(new long[]{0x4002000000000000L});
    public static final BitSet FOLLOW_typeParamOpt_in_enumDecl2562 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_LBRACE_in_enumDecl2564 = new BitSet(new long[]{0x8000000000100000L});
    public static final BitSet FOLLOW_enumBody_in_enumDecl2566 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_RBRACE_in_enumDecl2568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumValueDecl_in_enumBody2594 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_enumValueDecl2613 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_LPAREN_in_enumValueDecl2615 = new BitSet(new long[]{0x0000000200180000L});
    public static final BitSet FOLLOW_paramList_in_enumValueDecl2617 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_RPAREN_in_enumValueDecl2619 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_SEMI_in_enumValueDecl2621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_enumValueDecl2647 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_SEMI_in_enumValueDecl2649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDecl_in_varDeclList2688 = new BitSet(new long[]{0x00000000F8800000L,0x0000000080000000L});
    public static final BitSet FOLLOW_varDeclList_in_varDeclList2690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttrList_in_varDecl2702 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_VAR_in_varDecl2706 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_varDeclPartList_in_varDecl2708 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_SEMI_in_varDecl2710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDeclPart_in_varDeclPartList2741 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_COMMA_in_varDeclPartList2744 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_varDeclPart_in_varDeclPartList2747 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_varDeclPart2761 = new BitSet(new long[]{0x0000000800240000L});
    public static final BitSet FOLLOW_propDeclOpt_in_varDeclPart2766 = new BitSet(new long[]{0x0000000800200000L});
    public static final BitSet FOLLOW_typeTagOpt_in_varDeclPart2768 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_varInit_in_varDeclPart2770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_propDecl2780 = new BitSet(new long[]{0x0000000040100000L,0x0000000010000020L});
    public static final BitSet FOLLOW_propAccessor_in_propDecl2784 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_COMMA_in_propDecl2786 = new BitSet(new long[]{0x0000000040100000L,0x0000000010000020L});
    public static final BitSet FOLLOW_propAccessor_in_propDecl2790 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_RPAREN_in_propDecl2792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_propAccessor0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_propDecl_in_propDeclOpt2852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQ_in_varInit2867 = new BitSet(new long[]{0x4022060400140000L,0x00000FE03F100080L});
    public static final BitSet FOLLOW_expr_in_varInit2869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttrList_in_funcDecl2896 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_FUNCTION_in_funcDecl2899 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_NEW_in_funcDecl2901 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_LPAREN_in_funcDecl2903 = new BitSet(new long[]{0x0000000200180000L});
    public static final BitSet FOLLOW_paramList_in_funcDecl2905 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_RPAREN_in_funcDecl2907 = new BitSet(new long[]{0x4000000000210000L});
    public static final BitSet FOLLOW_typeTagOpt_in_funcDecl2909 = new BitSet(new long[]{0x4000000000210000L});
    public static final BitSet FOLLOW_block_in_funcDecl2911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttrList_in_funcDecl2944 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_FUNCTION_in_funcDecl2947 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_funcDecl2949 = new BitSet(new long[]{0x0002000000040000L});
    public static final BitSet FOLLOW_typeParamOpt_in_funcDecl2951 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_LPAREN_in_funcDecl2953 = new BitSet(new long[]{0x0000000200180000L});
    public static final BitSet FOLLOW_paramList_in_funcDecl2955 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_RPAREN_in_funcDecl2957 = new BitSet(new long[]{0x4000000000210000L});
    public static final BitSet FOLLOW_typeTagOpt_in_funcDecl2959 = new BitSet(new long[]{0x4000000000210000L});
    public static final BitSet FOLLOW_block_in_funcDecl2961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttrList_in_funcProtoDecl3003 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_FUNCTION_in_funcProtoDecl3005 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_NEW_in_funcProtoDecl3007 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_LPAREN_in_funcProtoDecl3009 = new BitSet(new long[]{0x0000000200180000L});
    public static final BitSet FOLLOW_paramList_in_funcProtoDecl3011 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_RPAREN_in_funcProtoDecl3013 = new BitSet(new long[]{0x0000000000210000L});
    public static final BitSet FOLLOW_typeTagOpt_in_funcProtoDecl3015 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_SEMI_in_funcProtoDecl3017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttrList_in_funcProtoDecl3044 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_FUNCTION_in_funcProtoDecl3046 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_funcProtoDecl3048 = new BitSet(new long[]{0x0002000000040000L});
    public static final BitSet FOLLOW_typeParamOpt_in_funcProtoDecl3050 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_LPAREN_in_funcProtoDecl3052 = new BitSet(new long[]{0x0000000200180000L});
    public static final BitSet FOLLOW_paramList_in_funcProtoDecl3054 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_RPAREN_in_funcProtoDecl3056 = new BitSet(new long[]{0x0000000000210000L});
    public static final BitSet FOLLOW_typeTagOpt_in_funcProtoDecl3058 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_SEMI_in_funcProtoDecl3060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_in_funcProtoDecl3090 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_NEW_in_funcProtoDecl3092 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_LPAREN_in_funcProtoDecl3094 = new BitSet(new long[]{0x0000000200180000L});
    public static final BitSet FOLLOW_paramList_in_funcProtoDecl3096 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_RPAREN_in_funcProtoDecl3098 = new BitSet(new long[]{0x0000000000210000L});
    public static final BitSet FOLLOW_typeTagOpt_in_funcProtoDecl3100 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_SEMI_in_funcProtoDecl3102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_in_funcProtoDecl3126 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_funcProtoDecl3128 = new BitSet(new long[]{0x0002000000040000L});
    public static final BitSet FOLLOW_typeParamOpt_in_funcProtoDecl3130 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_LPAREN_in_funcProtoDecl3132 = new BitSet(new long[]{0x0000000200180000L});
    public static final BitSet FOLLOW_paramList_in_funcProtoDecl3134 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_RPAREN_in_funcProtoDecl3136 = new BitSet(new long[]{0x0000000000210000L});
    public static final BitSet FOLLOW_typeTagOpt_in_funcProtoDecl3138 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_SEMI_in_funcProtoDecl3140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeDeclFlags_in_classDecl3174 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_CLASS_in_classDecl3176 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_classDecl3178 = new BitSet(new long[]{0x4002000000000000L,0x0000000C00000000L});
    public static final BitSet FOLLOW_typeParamOpt_in_classDecl3180 = new BitSet(new long[]{0x4002000000000000L,0x0000000C00000000L});
    public static final BitSet FOLLOW_inheritListOpt_in_classDecl3182 = new BitSet(new long[]{0x4002000000000000L,0x0000000C00000000L});
    public static final BitSet FOLLOW_classBodyScope_in_classDecl3184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_classBodyScope3222 = new BitSet(new long[]{0x80000200F8C20000L,0x00000000C0000000L});
    public static final BitSet FOLLOW_classMember_in_classBodyScope3225 = new BitSet(new long[]{0x80000200F8C20000L,0x00000000C0000000L});
    public static final BitSet FOLLOW_RBRACE_in_classBodyScope3229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDecl_in_classMember3259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcDecl_in_classMember3265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumDecl_in_classMember3272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeDeclFlags_in_interfaceDecl3290 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_INTERFACE_in_interfaceDecl3292 = new BitSet(new long[]{0x4001E00440100000L,0x0000000C00000000L});
    public static final BitSet FOLLOW_type_in_interfaceDecl3294 = new BitSet(new long[]{0x4000000000000000L,0x0000000C00000000L});
    public static final BitSet FOLLOW_inheritListOpt_in_interfaceDecl3296 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_LBRACE_in_interfaceDecl3298 = new BitSet(new long[]{0x80000200F8800000L,0x0000000080000000L});
    public static final BitSet FOLLOW_interfaceBody_in_interfaceDecl3301 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_RBRACE_in_interfaceDecl3303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDecl_in_interfaceBody3316 = new BitSet(new long[]{0x00000200F8800000L,0x0000000080000000L});
    public static final BitSet FOLLOW_interfaceBody_in_interfaceBody3318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcProtoDecl_in_interfaceBody3323 = new BitSet(new long[]{0x00000200F8800000L,0x0000000080000000L});
    public static final BitSet FOLLOW_interfaceBody_in_interfaceBody3325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inherit_in_inheritList3347 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_COMMA_in_inheritList3350 = new BitSet(new long[]{0x0000000000000000L,0x0000000C00000000L});
    public static final BitSet FOLLOW_inherit_in_inheritList3353 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_inheritList_in_inheritListOpt3371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXTENDS_in_inherit3407 = new BitSet(new long[]{0x4001E00440100000L});
    public static final BitSet FOLLOW_type_in_inherit3409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IMPLEMENTS_in_inherit3431 = new BitSet(new long[]{0x4001E00440100000L});
    public static final BitSet FOLLOW_type_in_inherit3433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPEDEF_in_typedefDecl3461 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_typedefDecl3463 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_EQ_in_typedefDecl3465 = new BitSet(new long[]{0x4001F00440100000L});
    public static final BitSet FOLLOW_funcType_in_typedefDecl3467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GT_in_typeExtend3486 = new BitSet(new long[]{0x4001F00440100000L});
    public static final BitSet FOLLOW_funcType_in_typeExtend3488 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_COMMA_in_typeExtend3490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_anonType3501 = new BitSet(new long[]{0x80040000F8900000L,0x0000000080000000L});
    public static final BitSet FOLLOW_anonTypeFieldList_in_anonType3536 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_varDeclList_in_anonType3564 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_typeExtend_in_anonType3593 = new BitSet(new long[]{0x80000000F8900000L,0x0000000080000000L});
    public static final BitSet FOLLOW_anonTypeFieldList_in_anonType3621 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_varDeclList_in_anonType3647 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_RBRACE_in_anonType3691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_anonTypeField_in_anonTypeFieldList3705 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_COMMA_in_anonTypeFieldList3708 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_anonTypeField_in_anonTypeFieldList3711 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_LBRACE_in_objLit3723 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_objLitElemList_in_objLit3726 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_RBRACE_in_objLit3728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_anonTypeField3740 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_COLON_in_anonTypeField3742 = new BitSet(new long[]{0x4001F00440100000L});
    public static final BitSet FOLLOW_funcType_in_anonTypeField3745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objLitElem_in_objLitElemList3761 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_COMMA_in_objLitElemList3764 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_objLitElem_in_objLitElemList3767 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_objLitElem3788 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_COLON_in_objLitElem3790 = new BitSet(new long[]{0x4022060400140000L,0x00000FE03F100080L});
    public static final BitSet FOLLOW_expr_in_objLitElem3793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LONGLITERAL_in_elementarySymbol3805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTLITERAL_in_elementarySymbol3818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRINGLITERAL_in_elementarySymbol3831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARLITERAL_in_elementarySymbol3844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOATNUM_in_elementarySymbol3857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_elementarySymbol3870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_elementarySymbol3884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeTagOpt_in_synpred28_Haxe679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_synpred34_Haxe817 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_MINUS_BIGGER_in_synpred34_Haxe821 = new BitSet(new long[]{0x4001F00440100000L});
    public static final BitSet FOLLOW_type_in_synpred34_Haxe824 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_typeParam_in_synpred41_Haxe883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_anonType_in_synpred42_Haxe870 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_dotIdent_in_synpred42_Haxe874 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_primitiveType_in_synpred42_Haxe878 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_typeParam_in_synpred42_Haxe883 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_LT_in_synpred43_Haxe901 = new BitSet(new long[]{0x4001E00540100000L});
    public static final BitSet FOLLOW_typeList_in_synpred43_Haxe904 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_GT_in_synpred43_Haxe906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_in_synpred44_Haxe912 = new BitSet(new long[]{0x4001E00540100000L});
    public static final BitSet FOLLOW_typeList_in_synpred44_Haxe915 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_LT_in_synpred44_Haxe917 = new BitSet(new long[]{0x4001E00540100000L});
    public static final BitSet FOLLOW_typeList_in_synpred44_Haxe920 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_GTGT_in_synpred44_Haxe922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeParam_in_synpred45_Haxe963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_synpred47_Haxe1084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignExpr_in_synpred48_Haxe1089 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_SEMI_in_synpred48_Haxe1091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_synpred50_Haxe1111 = new BitSet(new long[]{0x7D620604F8B50000L,0x00000FE0BF10008FL});
    public static final BitSet FOLLOW_statement_in_synpred50_Haxe1115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_synpred58_Haxe1323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_synpred65_Haxe1417 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_SEMI_in_synpred65_Haxe1420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_synpred66_Haxe1426 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_COLON_in_synpred66_Haxe1428 = new BitSet(new long[]{0x7D620604F8B50000L,0x00000FE0BF10008FL});
    public static final BitSet FOLLOW_statement_in_synpred66_Haxe1430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDecl_in_synpred69_Haxe1529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classDecl_in_synpred70_Haxe1534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprList_in_synpred73_Haxe1736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignExpr_in_synpred75_Haxe1768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GT_in_synpred92_Haxe2033 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_GT_in_synpred92_Haxe2035 = new BitSet(new long[]{0x4022060400140000L,0x00000FE03F100000L});
    public static final BitSet FOLLOW_addExpr_in_synpred92_Haxe2040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred103_Haxe2125 = new BitSet(new long[]{0x4022060400140000L,0x00000FE03F100000L});
    public static final BitSet FOLLOW_prefixExpr_in_synpred103_Haxe2137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_synpred106_Haxe2192 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_LPAREN_in_synpred106_Haxe2194 = new BitSet(new long[]{0x40220604001C0000L,0x00000FE03F100080L});
    public static final BitSet FOLLOW_exprListOpt_in_synpred106_Haxe2196 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_RPAREN_in_synpred106_Haxe2198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_synpred107_Haxe2219 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_LBRACKET_in_synpred107_Haxe2221 = new BitSet(new long[]{0x4022060400140000L,0x00000FE03F100080L});
    public static final BitSet FOLLOW_expr_in_synpred107_Haxe2223 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_RBRACKET_in_synpred107_Haxe2225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_synpred108_Haxe2230 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_PLUSPLUS_in_synpred108_Haxe2232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_synpred109_Haxe2256 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_SUBSUB_in_synpred109_Haxe2258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayLit_in_synpred111_Haxe2298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_synpred115_Haxe2362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_synpred116_Haxe2358 = new BitSet(new long[]{0x7D620604F8B50000L,0x00000FE0BF10008FL});
    public static final BitSet FOLLOW_expr_in_synpred116_Haxe2362 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_statement_in_synpred116_Haxe2364 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_RPAREN_in_synpred116_Haxe2367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CAST_in_synpred119_Haxe2453 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_LPAREN_in_synpred119_Haxe2455 = new BitSet(new long[]{0x4022060400140000L,0x00000FE03F100080L});
    public static final BitSet FOLLOW_expr_in_synpred119_Haxe2457 = new BitSet(new long[]{0x0000000100080000L});
    public static final BitSet FOLLOW_COMMA_in_synpred119_Haxe2460 = new BitSet(new long[]{0x4001F00440100000L});
    public static final BitSet FOLLOW_funcType_in_synpred119_Haxe2462 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_RPAREN_in_synpred119_Haxe2466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classDecl_in_synpred120_Haxe2524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interfaceDecl_in_synpred121_Haxe2529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumDecl_in_synpred122_Haxe2541 = new BitSet(new long[]{0x0000000000000002L});

}