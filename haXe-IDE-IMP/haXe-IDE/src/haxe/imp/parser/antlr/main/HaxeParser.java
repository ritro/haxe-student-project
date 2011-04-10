// $ANTLR 3.3 Nov 30, 2010 12:50:56 Haxe.g 2011-04-09 19:05:12

package haxe.imp.parser.antlr.main;

import haxe.imp.parser.antlr.tree.HaxeTree;
import haxe.imp.parser.antlr.tree.specific.AssignOperationNode;
import haxe.imp.parser.antlr.tree.specific.BlockScopeNode;
import haxe.imp.parser.antlr.tree.specific.ClassNode;
import haxe.imp.parser.antlr.tree.specific.EnumNode;
import haxe.imp.parser.antlr.tree.specific.DoWhileNode;
import haxe.imp.parser.antlr.tree.specific.ForNode;
import haxe.imp.parser.antlr.tree.specific.FunctionNode;
import haxe.imp.parser.antlr.tree.specific.IfNode;
import haxe.imp.parser.antlr.tree.specific.SwitchNode;
import haxe.imp.parser.antlr.tree.specific.TryNode;
import haxe.imp.parser.antlr.tree.specific.VarDeclaration;
import haxe.imp.parser.antlr.tree.specific.VarUsage;
import haxe.imp.parser.antlr.tree.specific.Constant;
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "PROPERTY_DECL", "MODULE", "SUFFIX_EXPR", "PREFIX_EXPR", "BLOCK_SCOPE", "PARAM_LIST", "TYPE_TAG", "TYPE_PARAM_OPT", "INHERIT_LIST_OPT", "DECL_ATTR_LIST", "VAR_INIT", "IDENT", "ASSIGN_OPERATOR", "PACKAGE", "SEMI", "MONKEYS_AT", "LPAREN", "RPAREN", "IDENTIFIER", "COLON", "EXTERN", "PRIVATE", "DOT", "IMPORT", "USING", "PUBLIC", "STATIC", "INLINE", "DYNAMIC", "OVERRIDE", "COMMA", "QUES", "THIS", "EQ", "PLUSEQ", "SUBEQ", "SLASHEQ", "PERCENTEQ", "AMPEQ", "FUNCTION", "LBRACKET", "RBRACKET", "MINUS_BIGGER", "VOID", "INT", "FLOAT", "BOOLEAN", "LT", "GT", "GTGT", "GTGTGT", "NEW", "IF", "ELSE", "FOR", "IN", "WHILE", "DO", "TRY", "SWITCH", "LBRACE", "RBRACE", "RETURN", "THROW", "BREAK", "CONTINUE", "CASE", "DEFAULT", "CATCH", "UNTYPED", "ELLIPSIS", "BARBAR", "AMPAMP", "EQEQ", "BANGEQ", "GTEQ", "LTEQ", "BAR", "AMP", "CARET", "LTLT", "PLUS", "SUB", "STAR", "SLASH", "PERCENT", "SUBSUB", "PLUSPLUS", "BANG", "TILDE", "CAST", "ENUM", "VAR", "NULL", "CLASS", "INTERFACE", "EXTENDS", "IMPLEMENTS", "TYPEDEF", "LONGLITERAL", "INTLITERAL", "STRINGLITERAL", "CHARLITERAL", "FLOATNUM", "TRUE", "FALSE", "WS", "IntegerNumber", "LongSuffix", "HexPrefix", "HexDigit", "Exponent", "EscapeSequence", "ABSTRACT", "BYTE", "CHAR", "CONST", "DOUBLE", "FINAL", "FINALLY", "GOTO", "INSTANCEOF", "LONG", "NATIVE", "PROTECTED", "SHORT", "STRICTFP", "SUPER", "THROWS", "TRANSIENT", "VOLATILE", "STAREQ", "BAREQ", "CARETEQ", "PERCENTDLQ", "PERCENTDBQ", "PERCENTDBBQ", "EQEQEQ", "PERCENTLESQ", "BANGEQQ", "PERCENTLL", "PERCENTBB", "PERCENTBBB", "LTLTEQ", "GTGTEQ", "GTGTGTEQ", "INTNUM", "EXPONENT", "COMMENT", "PP_IF", "PP_ELSEIF", "PP_ELSE", "PP_END", "PP_ERROR", "TS", "PP_CONDITIONAL", "PREPROCESSOR_DIRECTIVE", "IF_TOKEN", "ELSE_TOKEN", "ENDIF_TOKEN", "PP_EXPRESSION", "PP_OR_EXPRESSION", "PP_AND_EXPRESSION", "PP_UNARY_EXPRESSION", "PP_PRIMARY_EXPRESSION", "HEX_DIGIT", "UNICODE_ESC", "OCTAL_ESC", "ESC_SEQ"
    };
    public static final int EOF=-1;
    public static final int PROPERTY_DECL=4;
    public static final int MODULE=5;
    public static final int SUFFIX_EXPR=6;
    public static final int PREFIX_EXPR=7;
    public static final int BLOCK_SCOPE=8;
    public static final int PARAM_LIST=9;
    public static final int TYPE_TAG=10;
    public static final int TYPE_PARAM_OPT=11;
    public static final int INHERIT_LIST_OPT=12;
    public static final int DECL_ATTR_LIST=13;
    public static final int VAR_INIT=14;
    public static final int IDENT=15;
    public static final int ASSIGN_OPERATOR=16;
    public static final int PACKAGE=17;
    public static final int SEMI=18;
    public static final int MONKEYS_AT=19;
    public static final int LPAREN=20;
    public static final int RPAREN=21;
    public static final int IDENTIFIER=22;
    public static final int COLON=23;
    public static final int EXTERN=24;
    public static final int PRIVATE=25;
    public static final int DOT=26;
    public static final int IMPORT=27;
    public static final int USING=28;
    public static final int PUBLIC=29;
    public static final int STATIC=30;
    public static final int INLINE=31;
    public static final int DYNAMIC=32;
    public static final int OVERRIDE=33;
    public static final int COMMA=34;
    public static final int QUES=35;
    public static final int THIS=36;
    public static final int EQ=37;
    public static final int PLUSEQ=38;
    public static final int SUBEQ=39;
    public static final int SLASHEQ=40;
    public static final int PERCENTEQ=41;
    public static final int AMPEQ=42;
    public static final int FUNCTION=43;
    public static final int LBRACKET=44;
    public static final int RBRACKET=45;
    public static final int MINUS_BIGGER=46;
    public static final int VOID=47;
    public static final int INT=48;
    public static final int FLOAT=49;
    public static final int BOOLEAN=50;
    public static final int LT=51;
    public static final int GT=52;
    public static final int GTGT=53;
    public static final int GTGTGT=54;
    public static final int NEW=55;
    public static final int IF=56;
    public static final int ELSE=57;
    public static final int FOR=58;
    public static final int IN=59;
    public static final int WHILE=60;
    public static final int DO=61;
    public static final int TRY=62;
    public static final int SWITCH=63;
    public static final int LBRACE=64;
    public static final int RBRACE=65;
    public static final int RETURN=66;
    public static final int THROW=67;
    public static final int BREAK=68;
    public static final int CONTINUE=69;
    public static final int CASE=70;
    public static final int DEFAULT=71;
    public static final int CATCH=72;
    public static final int UNTYPED=73;
    public static final int ELLIPSIS=74;
    public static final int BARBAR=75;
    public static final int AMPAMP=76;
    public static final int EQEQ=77;
    public static final int BANGEQ=78;
    public static final int GTEQ=79;
    public static final int LTEQ=80;
    public static final int BAR=81;
    public static final int AMP=82;
    public static final int CARET=83;
    public static final int LTLT=84;
    public static final int PLUS=85;
    public static final int SUB=86;
    public static final int STAR=87;
    public static final int SLASH=88;
    public static final int PERCENT=89;
    public static final int SUBSUB=90;
    public static final int PLUSPLUS=91;
    public static final int BANG=92;
    public static final int TILDE=93;
    public static final int CAST=94;
    public static final int ENUM=95;
    public static final int VAR=96;
    public static final int NULL=97;
    public static final int CLASS=98;
    public static final int INTERFACE=99;
    public static final int EXTENDS=100;
    public static final int IMPLEMENTS=101;
    public static final int TYPEDEF=102;
    public static final int LONGLITERAL=103;
    public static final int INTLITERAL=104;
    public static final int STRINGLITERAL=105;
    public static final int CHARLITERAL=106;
    public static final int FLOATNUM=107;
    public static final int TRUE=108;
    public static final int FALSE=109;
    public static final int WS=110;
    public static final int IntegerNumber=111;
    public static final int LongSuffix=112;
    public static final int HexPrefix=113;
    public static final int HexDigit=114;
    public static final int Exponent=115;
    public static final int EscapeSequence=116;
    public static final int ABSTRACT=117;
    public static final int BYTE=118;
    public static final int CHAR=119;
    public static final int CONST=120;
    public static final int DOUBLE=121;
    public static final int FINAL=122;
    public static final int FINALLY=123;
    public static final int GOTO=124;
    public static final int INSTANCEOF=125;
    public static final int LONG=126;
    public static final int NATIVE=127;
    public static final int PROTECTED=128;
    public static final int SHORT=129;
    public static final int STRICTFP=130;
    public static final int SUPER=131;
    public static final int THROWS=132;
    public static final int TRANSIENT=133;
    public static final int VOLATILE=134;
    public static final int STAREQ=135;
    public static final int BAREQ=136;
    public static final int CARETEQ=137;
    public static final int PERCENTDLQ=138;
    public static final int PERCENTDBQ=139;
    public static final int PERCENTDBBQ=140;
    public static final int EQEQEQ=141;
    public static final int PERCENTLESQ=142;
    public static final int BANGEQQ=143;
    public static final int PERCENTLL=144;
    public static final int PERCENTBB=145;
    public static final int PERCENTBBB=146;
    public static final int LTLTEQ=147;
    public static final int GTGTEQ=148;
    public static final int GTGTGTEQ=149;
    public static final int INTNUM=150;
    public static final int EXPONENT=151;
    public static final int COMMENT=152;
    public static final int PP_IF=153;
    public static final int PP_ELSEIF=154;
    public static final int PP_ELSE=155;
    public static final int PP_END=156;
    public static final int PP_ERROR=157;
    public static final int TS=158;
    public static final int PP_CONDITIONAL=159;
    public static final int PREPROCESSOR_DIRECTIVE=160;
    public static final int IF_TOKEN=161;
    public static final int ELSE_TOKEN=162;
    public static final int ENDIF_TOKEN=163;
    public static final int PP_EXPRESSION=164;
    public static final int PP_OR_EXPRESSION=165;
    public static final int PP_AND_EXPRESSION=166;
    public static final int PP_UNARY_EXPRESSION=167;
    public static final int PP_PRIMARY_EXPRESSION=168;
    public static final int HEX_DIGIT=169;
    public static final int UNICODE_ESC=170;
    public static final int OCTAL_ESC=171;
    public static final int ESC_SEQ=172;

    // delegates
    // delegators


        public HaxeParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public HaxeParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
            this.state.ruleMemo = new HashMap[248+1];
             
             
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
            // Haxe.g:64:5: ( ( myPackage )? topLevelList -> ^( MODULE[\"MODULE\",true] ( myPackage )? ( topLevelList )? ) )
            // Haxe.g:64:7: ( myPackage )? topLevelList
            {
            // Haxe.g:64:7: ( myPackage )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==PACKAGE) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // Haxe.g:0:0: myPackage
                    {
                    pushFollow(FOLLOW_myPackage_in_module172);
                    myPackage1=myPackage();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_myPackage.add(myPackage1.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_topLevelList_in_module175);
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
            // 64:31: -> ^( MODULE[\"MODULE\",true] ( myPackage )? ( topLevelList )? )
            {
                // Haxe.g:64:34: ^( MODULE[\"MODULE\",true] ( myPackage )? ( topLevelList )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new HaxeTree(MODULE, "MODULE", true), root_1);

                // Haxe.g:64:68: ( myPackage )?
                if ( stream_myPackage.hasNext() ) {
                    adaptor.addChild(root_1, stream_myPackage.nextTree());

                }
                stream_myPackage.reset();
                // Haxe.g:64:79: ( topLevelList )?
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
            // Haxe.g:68:5: ( ( topLevel )* )
            // Haxe.g:68:7: ( topLevel )*
            {
            root_0 = (Object)adaptor.nil();

            // Haxe.g:68:7: ( topLevel )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==MONKEYS_AT||(LA2_0>=EXTERN && LA2_0<=PRIVATE)||(LA2_0>=IMPORT && LA2_0<=USING)||LA2_0==ENUM||(LA2_0>=CLASS && LA2_0<=INTERFACE)||LA2_0==TYPEDEF) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // Haxe.g:68:8: topLevel
            	    {
            	    pushFollow(FOLLOW_topLevel_in_topLevelList213);
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
            // Haxe.g:72:5: ( myImport | topLevelDecl )
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
                    // Haxe.g:72:7: myImport
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_myImport_in_topLevel232);
                    myImport4=myImport();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, myImport4.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:74:7: topLevelDecl
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_topLevelDecl_in_topLevel241);
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
            // Haxe.g:78:5: ( PACKAGE dotIdent SEMI -> ^( PACKAGE ( dotIdent )? ) )
            // Haxe.g:78:7: PACKAGE dotIdent SEMI
            {
            PACKAGE6=(Token)match(input,PACKAGE,FOLLOW_PACKAGE_in_myPackage258); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_PACKAGE.add(PACKAGE6);

            pushFollow(FOLLOW_dotIdent_in_myPackage260);
            dotIdent7=dotIdent();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_dotIdent.add(dotIdent7.getTree());
            SEMI8=(Token)match(input,SEMI,FOLLOW_SEMI_in_myPackage262); if (state.failed) return retval; 
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
            // 78:29: -> ^( PACKAGE ( dotIdent )? )
            {
                // Haxe.g:78:32: ^( PACKAGE ( dotIdent )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_PACKAGE.nextNode(), root_1);

                // Haxe.g:78:42: ( dotIdent )?
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
            // Haxe.g:81:9: ( MONKEYS_AT metaName ( LPAREN paramList RPAREN )? )
            // Haxe.g:81:11: MONKEYS_AT metaName ( LPAREN paramList RPAREN )?
            {
            root_0 = (Object)adaptor.nil();

            MONKEYS_AT9=(Token)match(input,MONKEYS_AT,FOLLOW_MONKEYS_AT_in_meta287); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            MONKEYS_AT9_tree = (Object)adaptor.create(MONKEYS_AT9);
            adaptor.addChild(root_0, MONKEYS_AT9_tree);
            }
            pushFollow(FOLLOW_metaName_in_meta289);
            metaName10=metaName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, metaName10.getTree());
            // Haxe.g:81:31: ( LPAREN paramList RPAREN )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==LPAREN) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // Haxe.g:81:32: LPAREN paramList RPAREN
                    {
                    LPAREN11=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_meta292); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LPAREN11_tree = (Object)adaptor.create(LPAREN11);
                    adaptor.addChild(root_0, LPAREN11_tree);
                    }
                    pushFollow(FOLLOW_paramList_in_meta294);
                    paramList12=paramList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, paramList12.getTree());
                    RPAREN13=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_meta296); if (state.failed) return retval;
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
            // Haxe.g:85:5: ( IDENTIFIER | primitiveType | COLON metaName )
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
                    // Haxe.g:85:7: IDENTIFIER
                    {
                    root_0 = (Object)adaptor.nil();

                    IDENTIFIER14=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_metaName315); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER14_tree = (Object)adaptor.create(IDENTIFIER14);
                    adaptor.addChild(root_0, IDENTIFIER14_tree);
                    }

                    }
                    break;
                case 2 :
                    // Haxe.g:86:7: primitiveType
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_primitiveType_in_metaName323);
                    primitiveType15=primitiveType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveType15.getTree());

                    }
                    break;
                case 3 :
                    // Haxe.g:88:7: COLON metaName
                    {
                    root_0 = (Object)adaptor.nil();

                    COLON16=(Token)match(input,COLON,FOLLOW_COLON_in_metaName332); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    COLON16_tree = (Object)adaptor.create(COLON16);
                    adaptor.addChild(root_0, COLON16_tree);
                    }
                    pushFollow(FOLLOW_metaName_in_metaName334);
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
            // Haxe.g:92:5: ( ( meta )* ( EXTERN | PRIVATE )* )
            // Haxe.g:92:7: ( meta )* ( EXTERN | PRIVATE )*
            {
            root_0 = (Object)adaptor.nil();

            // Haxe.g:92:7: ( meta )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==MONKEYS_AT) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // Haxe.g:92:8: meta
            	    {
            	    pushFollow(FOLLOW_meta_in_typeDeclFlags352);
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

            // Haxe.g:92:15: ( EXTERN | PRIVATE )*
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
            // Haxe.g:96:5: ( (a= IDENTIFIER -> $a) ( DOT ident= IDENTIFIER -> ^( DOT $qualifiedIdentifier $ident) )* )
            // Haxe.g:96:7: (a= IDENTIFIER -> $a) ( DOT ident= IDENTIFIER -> ^( DOT $qualifiedIdentifier $ident) )*
            {
            // Haxe.g:96:7: (a= IDENTIFIER -> $a)
            // Haxe.g:96:8: a= IDENTIFIER
            {
            a=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_qualifiedIdentifier387); if (state.failed) return retval; 
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
            // 96:22: -> $a
            {
                adaptor.addChild(root_0, stream_a.nextNode());

            }

            retval.tree = root_0;}
            }

            // Haxe.g:96:30: ( DOT ident= IDENTIFIER -> ^( DOT $qualifiedIdentifier $ident) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==DOT) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // Haxe.g:96:31: DOT ident= IDENTIFIER
            	    {
            	    DOT20=(Token)match(input,DOT,FOLLOW_DOT_in_qualifiedIdentifier398); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_DOT.add(DOT20);

            	    ident=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_qualifiedIdentifier402); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_IDENTIFIER.add(ident);



            	    // AST REWRITE
            	    // elements: ident, DOT, qualifiedIdentifier
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
            	    // 96:53: -> ^( DOT $qualifiedIdentifier $ident)
            	    {
            	        // Haxe.g:96:57: ^( DOT $qualifiedIdentifier $ident)
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
            // Haxe.g:100:5: ( IMPORT dotIdent SEMI | USING dotIdent SEMI )
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
                    // Haxe.g:100:7: IMPORT dotIdent SEMI
                    {
                    root_0 = (Object)adaptor.nil();

                    IMPORT21=(Token)match(input,IMPORT,FOLLOW_IMPORT_in_myImport440); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IMPORT21_tree = (Object)adaptor.create(IMPORT21);
                    root_0 = (Object)adaptor.becomeRoot(IMPORT21_tree, root_0);
                    }
                    pushFollow(FOLLOW_dotIdent_in_myImport443);
                    dotIdent22=dotIdent();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dotIdent22.getTree());
                    SEMI23=(Token)match(input,SEMI,FOLLOW_SEMI_in_myImport445); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // Haxe.g:101:7: USING dotIdent SEMI
                    {
                    root_0 = (Object)adaptor.nil();

                    USING24=(Token)match(input,USING,FOLLOW_USING_in_myImport454); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    USING24_tree = (Object)adaptor.create(USING24);
                    root_0 = (Object)adaptor.becomeRoot(USING24_tree, root_0);
                    }
                    pushFollow(FOLLOW_dotIdent_in_myImport457);
                    dotIdent25=dotIdent();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dotIdent25.getTree());
                    SEMI26=(Token)match(input,SEMI,FOLLOW_SEMI_in_myImport459); if (state.failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
            // Haxe.g:106:5: ( PUBLIC | PRIVATE )
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
            // Haxe.g:111:5: ( STATIC | INLINE | DYNAMIC | OVERRIDE | access )
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
                    // Haxe.g:111:7: STATIC
                    {
                    root_0 = (Object)adaptor.nil();

                    STATIC28=(Token)match(input,STATIC,FOLLOW_STATIC_in_declAttr503); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STATIC28_tree = (Object)adaptor.create(STATIC28);
                    adaptor.addChild(root_0, STATIC28_tree);
                    }

                    }
                    break;
                case 2 :
                    // Haxe.g:112:7: INLINE
                    {
                    root_0 = (Object)adaptor.nil();

                    INLINE29=(Token)match(input,INLINE,FOLLOW_INLINE_in_declAttr511); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INLINE29_tree = (Object)adaptor.create(INLINE29);
                    adaptor.addChild(root_0, INLINE29_tree);
                    }

                    }
                    break;
                case 3 :
                    // Haxe.g:113:7: DYNAMIC
                    {
                    root_0 = (Object)adaptor.nil();

                    DYNAMIC30=(Token)match(input,DYNAMIC,FOLLOW_DYNAMIC_in_declAttr519); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DYNAMIC30_tree = (Object)adaptor.create(DYNAMIC30);
                    adaptor.addChild(root_0, DYNAMIC30_tree);
                    }

                    }
                    break;
                case 4 :
                    // Haxe.g:114:7: OVERRIDE
                    {
                    root_0 = (Object)adaptor.nil();

                    OVERRIDE31=(Token)match(input,OVERRIDE,FOLLOW_OVERRIDE_in_declAttr527); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    OVERRIDE31_tree = (Object)adaptor.create(OVERRIDE31);
                    adaptor.addChild(root_0, OVERRIDE31_tree);
                    }

                    }
                    break;
                case 5 :
                    // Haxe.g:115:7: access
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_access_in_declAttr535);
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
            // Haxe.g:119:5: ( ( declAttr )+ -> ^( DECL_ATTR_LIST[\"DECL_ATTR_LIST\", true] ( declAttr )+ ) )
            // Haxe.g:119:7: ( declAttr )+
            {
            // Haxe.g:119:7: ( declAttr )+
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
            	    // Haxe.g:119:8: declAttr
            	    {
            	    pushFollow(FOLLOW_declAttr_in_declAttrList553);
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
            // 119:19: -> ^( DECL_ATTR_LIST[\"DECL_ATTR_LIST\", true] ( declAttr )+ )
            {
                // Haxe.g:119:22: ^( DECL_ATTR_LIST[\"DECL_ATTR_LIST\", true] ( declAttr )+ )
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
            // Haxe.g:123:5: ( param ( COMMA param )* -> ^( PARAM_LIST[\"PARAM_LIST\", true] ( param )+ ) | )
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
                    // Haxe.g:123:7: param ( COMMA param )*
                    {
                    pushFollow(FOLLOW_param_in_paramList585);
                    param34=param();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_param.add(param34.getTree());
                    // Haxe.g:123:13: ( COMMA param )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==COMMA) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // Haxe.g:123:14: COMMA param
                    	    {
                    	    COMMA35=(Token)match(input,COMMA,FOLLOW_COMMA_in_paramList588); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA35);

                    	    pushFollow(FOLLOW_param_in_paramList590);
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
                    // 123:28: -> ^( PARAM_LIST[\"PARAM_LIST\", true] ( param )+ )
                    {
                        // Haxe.g:123:31: ^( PARAM_LIST[\"PARAM_LIST\", true] ( param )+ )
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
                    // Haxe.g:125:5: 
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
            // Haxe.g:128:5: ( ( QUES )? IDENTIFIER typeTagOpt varInit -> ^( VAR[$IDENTIFIER, true] ( IDENTIFIER )? ( typeTagOpt )? ( varInit )? ( QUES )? ) )
            // Haxe.g:128:7: ( QUES )? IDENTIFIER typeTagOpt varInit
            {
            // Haxe.g:128:7: ( QUES )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==QUES) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // Haxe.g:0:0: QUES
                    {
                    QUES37=(Token)match(input,QUES,FOLLOW_QUES_in_param628); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_QUES.add(QUES37);


                    }
                    break;

            }

            IDENTIFIER38=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_param631); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER38);

            pushFollow(FOLLOW_typeTagOpt_in_param633);
            typeTagOpt39=typeTagOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeTagOpt.add(typeTagOpt39.getTree());
            pushFollow(FOLLOW_varInit_in_param635);
            varInit40=varInit();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_varInit.add(varInit40.getTree());


            // AST REWRITE
            // elements: IDENTIFIER, QUES, varInit, typeTagOpt
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 128:43: -> ^( VAR[$IDENTIFIER, true] ( IDENTIFIER )? ( typeTagOpt )? ( varInit )? ( QUES )? )
            {
                // Haxe.g:128:46: ^( VAR[$IDENTIFIER, true] ( IDENTIFIER )? ( typeTagOpt )? ( varInit )? ( QUES )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new VarDeclaration(VAR, IDENTIFIER38, true), root_1);

                // Haxe.g:128:87: ( IDENTIFIER )?
                if ( stream_IDENTIFIER.hasNext() ) {
                    adaptor.addChild(root_1, new VarUsage(stream_IDENTIFIER.nextToken()));

                }
                stream_IDENTIFIER.reset();
                // Haxe.g:128:109: ( typeTagOpt )?
                if ( stream_typeTagOpt.hasNext() ) {
                    adaptor.addChild(root_1, stream_typeTagOpt.nextTree());

                }
                stream_typeTagOpt.reset();
                // Haxe.g:128:121: ( varInit )?
                if ( stream_varInit.hasNext() ) {
                    adaptor.addChild(root_1, stream_varInit.nextTree());

                }
                stream_varInit.reset();
                // Haxe.g:128:130: ( QUES )?
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
            // Haxe.g:131:5: ( IDENTIFIER | THIS )
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
    // Haxe.g:135:1: dotIdent : ( id DOT a= dotIdent -> ^( DOT[true] id $a) | id -> ^( DOT[true] id ) );
    public final HaxeParser.dotIdent_return dotIdent() throws RecognitionException {
        HaxeParser.dotIdent_return retval = new HaxeParser.dotIdent_return();
        retval.start = input.LT(1);
        int dotIdent_StartIndex = input.index();
        Object root_0 = null;

        Token DOT43=null;
        HaxeParser.dotIdent_return a = null;

        HaxeParser.id_return id42 = null;

        HaxeParser.id_return id44 = null;


        Object DOT43_tree=null;
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_dotIdent=new RewriteRuleSubtreeStream(adaptor,"rule dotIdent");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return retval; }
            // Haxe.g:136:5: ( id DOT a= dotIdent -> ^( DOT[true] id $a) | id -> ^( DOT[true] id ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==IDENTIFIER||LA15_0==THIS) ) {
                int LA15_1 = input.LA(2);

                if ( (LA15_1==DOT) ) {
                    alt15=1;
                }
                else if ( (LA15_1==EOF||(LA15_1>=SEMI && LA15_1<=RPAREN)||(LA15_1>=COLON && LA15_1<=PRIVATE)||(LA15_1>=IMPORT && LA15_1<=USING)||(LA15_1>=COMMA && LA15_1<=QUES)||(LA15_1>=EQ && LA15_1<=AMPEQ)||(LA15_1>=LBRACKET && LA15_1<=MINUS_BIGGER)||(LA15_1>=LT && LA15_1<=GTGTGT)||LA15_1==IN||(LA15_1>=LBRACE && LA15_1<=RBRACE)||(LA15_1>=ELLIPSIS && LA15_1<=PLUSPLUS)||LA15_1==ENUM||(LA15_1>=CLASS && LA15_1<=TYPEDEF)) ) {
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
                    // Haxe.g:136:10: id DOT a= dotIdent
                    {
                    pushFollow(FOLLOW_id_in_dotIdent714);
                    id42=id();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_id.add(id42.getTree());
                    DOT43=(Token)match(input,DOT,FOLLOW_DOT_in_dotIdent716); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DOT.add(DOT43);

                    pushFollow(FOLLOW_dotIdent_in_dotIdent720);
                    a=dotIdent();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_dotIdent.add(a.getTree());


                    // AST REWRITE
                    // elements: DOT, a, id
                    // token labels: 
                    // rule labels: retval, a
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_a=new RewriteRuleSubtreeStream(adaptor,"rule a",a!=null?a.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 136:28: -> ^( DOT[true] id $a)
                    {
                        // Haxe.g:136:32: ^( DOT[true] id $a)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new VarUsage(DOT, true), root_1);

                        adaptor.addChild(root_1, stream_id.nextTree());
                        adaptor.addChild(root_1, stream_a.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // Haxe.g:137:10: id
                    {
                    pushFollow(FOLLOW_id_in_dotIdent747);
                    id44=id();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_id.add(id44.getTree());


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
                    // 137:13: -> ^( DOT[true] id )
                    {
                        // Haxe.g:137:16: ^( DOT[true] id )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new VarUsage(DOT, true), root_1);

                        adaptor.addChild(root_1, stream_id.nextTree());

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
    // Haxe.g:140:1: assignOp : ( EQ -> EQ[$EQ] | PLUSEQ -> PLUSEQ[$PLUSEQ] | SUBEQ -> SUBEQ[$SUBEQ] | SLASHEQ -> SLASHEQ[$SLASHEQ] | PERCENTEQ -> PERCENTEQ[$PERCENTEQ] | AMPEQ -> AMPEQ[$AMPEQ] );
    public final HaxeParser.assignOp_return assignOp() throws RecognitionException {
        HaxeParser.assignOp_return retval = new HaxeParser.assignOp_return();
        retval.start = input.LT(1);
        int assignOp_StartIndex = input.index();
        Object root_0 = null;

        Token EQ45=null;
        Token PLUSEQ46=null;
        Token SUBEQ47=null;
        Token SLASHEQ48=null;
        Token PERCENTEQ49=null;
        Token AMPEQ50=null;

        Object EQ45_tree=null;
        Object PLUSEQ46_tree=null;
        Object SUBEQ47_tree=null;
        Object SLASHEQ48_tree=null;
        Object PERCENTEQ49_tree=null;
        Object AMPEQ50_tree=null;
        RewriteRuleTokenStream stream_SUBEQ=new RewriteRuleTokenStream(adaptor,"token SUBEQ");
        RewriteRuleTokenStream stream_SLASHEQ=new RewriteRuleTokenStream(adaptor,"token SLASHEQ");
        RewriteRuleTokenStream stream_PERCENTEQ=new RewriteRuleTokenStream(adaptor,"token PERCENTEQ");
        RewriteRuleTokenStream stream_EQ=new RewriteRuleTokenStream(adaptor,"token EQ");
        RewriteRuleTokenStream stream_AMPEQ=new RewriteRuleTokenStream(adaptor,"token AMPEQ");
        RewriteRuleTokenStream stream_PLUSEQ=new RewriteRuleTokenStream(adaptor,"token PLUSEQ");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return retval; }
            // Haxe.g:141:5: ( EQ -> EQ[$EQ] | PLUSEQ -> PLUSEQ[$PLUSEQ] | SUBEQ -> SUBEQ[$SUBEQ] | SLASHEQ -> SLASHEQ[$SLASHEQ] | PERCENTEQ -> PERCENTEQ[$PERCENTEQ] | AMPEQ -> AMPEQ[$AMPEQ] )
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
                    // Haxe.g:141:10: EQ
                    {
                    EQ45=(Token)match(input,EQ,FOLLOW_EQ_in_assignOp779); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EQ.add(EQ45);



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
                    // 141:20: -> EQ[$EQ]
                    {
                        adaptor.addChild(root_0, new AssignOperationNode(EQ, EQ45));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // Haxe.g:142:10: PLUSEQ
                    {
                    PLUSEQ46=(Token)match(input,PLUSEQ,FOLLOW_PLUSEQ_in_assignOp805); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PLUSEQ.add(PLUSEQ46);



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
                    // 142:21: -> PLUSEQ[$PLUSEQ]
                    {
                        adaptor.addChild(root_0, new AssignOperationNode(PLUSEQ, PLUSEQ46));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // Haxe.g:143:10: SUBEQ
                    {
                    SUBEQ47=(Token)match(input,SUBEQ,FOLLOW_SUBEQ_in_assignOp828); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SUBEQ.add(SUBEQ47);



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
                    // 143:19: -> SUBEQ[$SUBEQ]
                    {
                        adaptor.addChild(root_0, new AssignOperationNode(SUBEQ, SUBEQ47));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // Haxe.g:144:10: SLASHEQ
                    {
                    SLASHEQ48=(Token)match(input,SLASHEQ,FOLLOW_SLASHEQ_in_assignOp850); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SLASHEQ.add(SLASHEQ48);



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
                    // 144:21: -> SLASHEQ[$SLASHEQ]
                    {
                        adaptor.addChild(root_0, new AssignOperationNode(SLASHEQ, SLASHEQ48));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // Haxe.g:145:10: PERCENTEQ
                    {
                    PERCENTEQ49=(Token)match(input,PERCENTEQ,FOLLOW_PERCENTEQ_in_assignOp872); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PERCENTEQ.add(PERCENTEQ49);



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
                    // 145:23: -> PERCENTEQ[$PERCENTEQ]
                    {
                        adaptor.addChild(root_0, new AssignOperationNode(PERCENTEQ, PERCENTEQ49));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    // Haxe.g:146:10: AMPEQ
                    {
                    AMPEQ50=(Token)match(input,AMPEQ,FOLLOW_AMPEQ_in_assignOp894); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AMPEQ.add(AMPEQ50);



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
                    // 146:19: -> AMPEQ[$AMPEQ]
                    {
                        adaptor.addChild(root_0, new AssignOperationNode(AMPEQ, AMPEQ50));

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
    // Haxe.g:150:1: funcLit : FUNCTION LPAREN paramList RPAREN ( typeTagOpt )? block -> ^( FUNCTION ( paramList )? ( typeTagOpt )? ( block )? ) ;
    public final HaxeParser.funcLit_return funcLit() throws RecognitionException {
        HaxeParser.funcLit_return retval = new HaxeParser.funcLit_return();
        retval.start = input.LT(1);
        int funcLit_StartIndex = input.index();
        Object root_0 = null;

        Token FUNCTION51=null;
        Token LPAREN52=null;
        Token RPAREN54=null;
        HaxeParser.paramList_return paramList53 = null;

        HaxeParser.typeTagOpt_return typeTagOpt55 = null;

        HaxeParser.block_return block56 = null;


        Object FUNCTION51_tree=null;
        Object LPAREN52_tree=null;
        Object RPAREN54_tree=null;
        RewriteRuleTokenStream stream_FUNCTION=new RewriteRuleTokenStream(adaptor,"token FUNCTION");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_paramList=new RewriteRuleSubtreeStream(adaptor,"rule paramList");
        RewriteRuleSubtreeStream stream_typeTagOpt=new RewriteRuleSubtreeStream(adaptor,"rule typeTagOpt");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return retval; }
            // Haxe.g:150:9: ( FUNCTION LPAREN paramList RPAREN ( typeTagOpt )? block -> ^( FUNCTION ( paramList )? ( typeTagOpt )? ( block )? ) )
            // Haxe.g:150:11: FUNCTION LPAREN paramList RPAREN ( typeTagOpt )? block
            {
            FUNCTION51=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcLit923); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION51);

            LPAREN52=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcLit925); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN52);

            pushFollow(FOLLOW_paramList_in_funcLit927);
            paramList53=paramList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_paramList.add(paramList53.getTree());
            RPAREN54=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcLit929); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN54);

            // Haxe.g:150:44: ( typeTagOpt )?
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
                    pushFollow(FOLLOW_typeTagOpt_in_funcLit931);
                    typeTagOpt55=typeTagOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeTagOpt.add(typeTagOpt55.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_block_in_funcLit934);
            block56=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block56.getTree());


            // AST REWRITE
            // elements: typeTagOpt, paramList, FUNCTION, block
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 150:62: -> ^( FUNCTION ( paramList )? ( typeTagOpt )? ( block )? )
            {
                // Haxe.g:150:65: ^( FUNCTION ( paramList )? ( typeTagOpt )? ( block )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new FunctionNode(stream_FUNCTION.nextToken()), root_1);

                // Haxe.g:150:90: ( paramList )?
                if ( stream_paramList.hasNext() ) {
                    adaptor.addChild(root_1, stream_paramList.nextTree());

                }
                stream_paramList.reset();
                // Haxe.g:150:101: ( typeTagOpt )?
                if ( stream_typeTagOpt.hasNext() ) {
                    adaptor.addChild(root_1, stream_typeTagOpt.nextTree());

                }
                stream_typeTagOpt.reset();
                // Haxe.g:150:113: ( block )?
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
    // Haxe.g:152:1: arrayLit : LBRACKET exprListOpt RBRACKET ;
    public final HaxeParser.arrayLit_return arrayLit() throws RecognitionException {
        HaxeParser.arrayLit_return retval = new HaxeParser.arrayLit_return();
        retval.start = input.LT(1);
        int arrayLit_StartIndex = input.index();
        Object root_0 = null;

        Token LBRACKET57=null;
        Token RBRACKET59=null;
        HaxeParser.exprListOpt_return exprListOpt58 = null;


        Object LBRACKET57_tree=null;
        Object RBRACKET59_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return retval; }
            // Haxe.g:152:13: ( LBRACKET exprListOpt RBRACKET )
            // Haxe.g:152:15: LBRACKET exprListOpt RBRACKET
            {
            root_0 = (Object)adaptor.nil();

            LBRACKET57=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_arrayLit971); if (state.failed) return retval;
            pushFollow(FOLLOW_exprListOpt_in_arrayLit974);
            exprListOpt58=exprListOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, exprListOpt58.getTree());
            RBRACKET59=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_arrayLit976); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // Haxe.g:180:1: typeTag : COLON funcType ;
    public final HaxeParser.typeTag_return typeTag() throws RecognitionException {
        HaxeParser.typeTag_return retval = new HaxeParser.typeTag_return();
        retval.start = input.LT(1);
        int typeTag_StartIndex = input.index();
        Object root_0 = null;

        Token COLON60=null;
        HaxeParser.funcType_return funcType61 = null;


        Object COLON60_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return retval; }
            // Haxe.g:180:9: ( COLON funcType )
            // Haxe.g:180:11: COLON funcType
            {
            root_0 = (Object)adaptor.nil();

            COLON60=(Token)match(input,COLON,FOLLOW_COLON_in_typeTag1008); if (state.failed) return retval;
            pushFollow(FOLLOW_funcType_in_typeTag1011);
            funcType61=funcType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, funcType61.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // Haxe.g:183:1: typeTagOpt : ( typeTag -> ^( TYPE_TAG[\"TYPE_TAG\",true] ( typeTag )? ) | );
    public final HaxeParser.typeTagOpt_return typeTagOpt() throws RecognitionException {
        HaxeParser.typeTagOpt_return retval = new HaxeParser.typeTagOpt_return();
        retval.start = input.LT(1);
        int typeTagOpt_StartIndex = input.index();
        Object root_0 = null;

        HaxeParser.typeTag_return typeTag62 = null;


        RewriteRuleSubtreeStream stream_typeTag=new RewriteRuleSubtreeStream(adaptor,"rule typeTag");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return retval; }
            // Haxe.g:184:5: ( typeTag -> ^( TYPE_TAG[\"TYPE_TAG\",true] ( typeTag )? ) | )
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
                    // Haxe.g:184:10: typeTag
                    {
                    pushFollow(FOLLOW_typeTag_in_typeTagOpt1039);
                    typeTag62=typeTag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeTag.add(typeTag62.getTree());


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
                    // 184:18: -> ^( TYPE_TAG[\"TYPE_TAG\",true] ( typeTag )? )
                    {
                        // Haxe.g:184:21: ^( TYPE_TAG[\"TYPE_TAG\",true] ( typeTag )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new HaxeTree(TYPE_TAG, "TYPE_TAG", true), root_1);

                        // Haxe.g:184:59: ( typeTag )?
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
                    // Haxe.g:186:5: 
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
    // Haxe.g:188:1: typeList : ( type ( COMMA type )* | typeConstraint ( COMMA typeConstraint )* );
    public final HaxeParser.typeList_return typeList() throws RecognitionException {
        HaxeParser.typeList_return retval = new HaxeParser.typeList_return();
        retval.start = input.LT(1);
        int typeList_StartIndex = input.index();
        Object root_0 = null;

        Token COMMA64=null;
        Token COMMA67=null;
        HaxeParser.type_return type63 = null;

        HaxeParser.type_return type65 = null;

        HaxeParser.typeConstraint_return typeConstraint66 = null;

        HaxeParser.typeConstraint_return typeConstraint68 = null;


        Object COMMA64_tree=null;
        Object COMMA67_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return retval; }
            // Haxe.g:189:5: ( type ( COMMA type )* | typeConstraint ( COMMA typeConstraint )* )
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
                    // Haxe.g:189:10: type ( COMMA type )*
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_type_in_typeList1082);
                    type63=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, type63.getTree());
                    // Haxe.g:189:15: ( COMMA type )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==COMMA) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // Haxe.g:189:16: COMMA type
                    	    {
                    	    COMMA64=(Token)match(input,COMMA,FOLLOW_COMMA_in_typeList1085); if (state.failed) return retval;
                    	    pushFollow(FOLLOW_type_in_typeList1088);
                    	    type65=type();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, type65.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // Haxe.g:190:10: typeConstraint ( COMMA typeConstraint )*
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_typeConstraint_in_typeList1105);
                    typeConstraint66=typeConstraint();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeConstraint66.getTree());
                    // Haxe.g:190:25: ( COMMA typeConstraint )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==COMMA) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // Haxe.g:190:26: COMMA typeConstraint
                    	    {
                    	    COMMA67=(Token)match(input,COMMA,FOLLOW_COMMA_in_typeList1108); if (state.failed) return retval;
                    	    pushFollow(FOLLOW_typeConstraint_in_typeList1111);
                    	    typeConstraint68=typeConstraint();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeConstraint68.getTree());

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
    // Haxe.g:193:1: funcType : ( ( type ) ( MINUS_BIGGER type )* | VOID );
    public final HaxeParser.funcType_return funcType() throws RecognitionException {
        HaxeParser.funcType_return retval = new HaxeParser.funcType_return();
        retval.start = input.LT(1);
        int funcType_StartIndex = input.index();
        Object root_0 = null;

        Token MINUS_BIGGER70=null;
        Token VOID72=null;
        HaxeParser.type_return type69 = null;

        HaxeParser.type_return type71 = null;


        Object MINUS_BIGGER70_tree=null;
        Object VOID72_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return retval; }
            // Haxe.g:194:5: ( ( type ) ( MINUS_BIGGER type )* | VOID )
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
                    // Haxe.g:194:10: ( type ) ( MINUS_BIGGER type )*
                    {
                    root_0 = (Object)adaptor.nil();

                    // Haxe.g:194:10: ( type )
                    // Haxe.g:194:11: type
                    {
                    pushFollow(FOLLOW_type_in_funcType1136);
                    type69=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, type69.getTree());

                    }

                    // Haxe.g:194:17: ( MINUS_BIGGER type )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==MINUS_BIGGER) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // Haxe.g:194:18: MINUS_BIGGER type
                    	    {
                    	    MINUS_BIGGER70=(Token)match(input,MINUS_BIGGER,FOLLOW_MINUS_BIGGER_in_funcType1140); if (state.failed) return retval;
                    	    pushFollow(FOLLOW_type_in_funcType1143);
                    	    type71=type();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, type71.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // Haxe.g:195:10: VOID
                    {
                    root_0 = (Object)adaptor.nil();

                    VOID72=(Token)match(input,VOID,FOLLOW_VOID_in_funcType1156); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    VOID72_tree = (Object)adaptor.create(VOID72);
                    adaptor.addChild(root_0, VOID72_tree);
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
    // Haxe.g:198:1: primitiveType : ( INT | FLOAT | DYNAMIC | BOOLEAN | VOID );
    public final HaxeParser.primitiveType_return primitiveType() throws RecognitionException {
        HaxeParser.primitiveType_return retval = new HaxeParser.primitiveType_return();
        retval.start = input.LT(1);
        int primitiveType_StartIndex = input.index();
        Object root_0 = null;

        Token set73=null;

        Object set73_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return retval; }
            // Haxe.g:199:5: ( INT | FLOAT | DYNAMIC | BOOLEAN | VOID )
            // Haxe.g:
            {
            root_0 = (Object)adaptor.nil();

            set73=(Token)input.LT(1);
            if ( input.LA(1)==DYNAMIC||(input.LA(1)>=VOID && input.LA(1)<=BOOLEAN) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set73));
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
    // Haxe.g:202:1: type : ( ( anonType | dotIdent | primitiveType ) ( typeParam )* | );
    public final HaxeParser.type_return type() throws RecognitionException {
        HaxeParser.type_return retval = new HaxeParser.type_return();
        retval.start = input.LT(1);
        int type_StartIndex = input.index();
        Object root_0 = null;

        HaxeParser.anonType_return anonType74 = null;

        HaxeParser.dotIdent_return dotIdent75 = null;

        HaxeParser.primitiveType_return primitiveType76 = null;

        HaxeParser.typeParam_return typeParam77 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return retval; }
            // Haxe.g:202:9: ( ( anonType | dotIdent | primitiveType ) ( typeParam )* | )
            int alt26=2;
            alt26 = dfa26.predict(input);
            switch (alt26) {
                case 1 :
                    // Haxe.g:202:14: ( anonType | dotIdent | primitiveType ) ( typeParam )*
                    {
                    root_0 = (Object)adaptor.nil();

                    // Haxe.g:202:14: ( anonType | dotIdent | primitiveType )
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
                            // Haxe.g:202:15: anonType
                            {
                            pushFollow(FOLLOW_anonType_in_type1216);
                            anonType74=anonType();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, anonType74.getTree());

                            }
                            break;
                        case 2 :
                            // Haxe.g:202:26: dotIdent
                            {
                            pushFollow(FOLLOW_dotIdent_in_type1220);
                            dotIdent75=dotIdent();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, dotIdent75.getTree());

                            }
                            break;
                        case 3 :
                            // Haxe.g:202:37: primitiveType
                            {
                            pushFollow(FOLLOW_primitiveType_in_type1224);
                            primitiveType76=primitiveType();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveType76.getTree());

                            }
                            break;

                    }

                    // Haxe.g:202:53: ( typeParam )*
                    loop25:
                    do {
                        int alt25=2;
                        alt25 = dfa25.predict(input);
                        switch (alt25) {
                    	case 1 :
                    	    // Haxe.g:202:54: typeParam
                    	    {
                    	    pushFollow(FOLLOW_typeParam_in_type1229);
                    	    typeParam77=typeParam();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeParam77.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // Haxe.g:204:9: 
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
    // Haxe.g:206:1: typeParam : ( LT typeList GT | LT typeList LT typeList GTGT | LT typeList LT typeList LT typeList GTGTGT );
    public final HaxeParser.typeParam_return typeParam() throws RecognitionException {
        HaxeParser.typeParam_return retval = new HaxeParser.typeParam_return();
        retval.start = input.LT(1);
        int typeParam_StartIndex = input.index();
        Object root_0 = null;

        Token LT78=null;
        Token GT80=null;
        Token LT81=null;
        Token LT83=null;
        Token GTGT85=null;
        Token LT86=null;
        Token LT88=null;
        Token LT90=null;
        Token GTGTGT92=null;
        HaxeParser.typeList_return typeList79 = null;

        HaxeParser.typeList_return typeList82 = null;

        HaxeParser.typeList_return typeList84 = null;

        HaxeParser.typeList_return typeList87 = null;

        HaxeParser.typeList_return typeList89 = null;

        HaxeParser.typeList_return typeList91 = null;


        Object LT78_tree=null;
        Object GT80_tree=null;
        Object LT81_tree=null;
        Object LT83_tree=null;
        Object GTGT85_tree=null;
        Object LT86_tree=null;
        Object LT88_tree=null;
        Object LT90_tree=null;
        Object GTGTGT92_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return retval; }
            // Haxe.g:207:5: ( LT typeList GT | LT typeList LT typeList GTGT | LT typeList LT typeList LT typeList GTGTGT )
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
                    // Haxe.g:207:10: LT typeList GT
                    {
                    root_0 = (Object)adaptor.nil();

                    LT78=(Token)match(input,LT,FOLLOW_LT_in_typeParam1273); if (state.failed) return retval;
                    pushFollow(FOLLOW_typeList_in_typeParam1276);
                    typeList79=typeList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeList79.getTree());
                    GT80=(Token)match(input,GT,FOLLOW_GT_in_typeParam1278); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // Haxe.g:208:10: LT typeList LT typeList GTGT
                    {
                    root_0 = (Object)adaptor.nil();

                    LT81=(Token)match(input,LT,FOLLOW_LT_in_typeParam1290); if (state.failed) return retval;
                    pushFollow(FOLLOW_typeList_in_typeParam1293);
                    typeList82=typeList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeList82.getTree());
                    LT83=(Token)match(input,LT,FOLLOW_LT_in_typeParam1295); if (state.failed) return retval;
                    pushFollow(FOLLOW_typeList_in_typeParam1298);
                    typeList84=typeList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeList84.getTree());
                    GTGT85=(Token)match(input,GTGT,FOLLOW_GTGT_in_typeParam1300); if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // Haxe.g:209:10: LT typeList LT typeList LT typeList GTGTGT
                    {
                    root_0 = (Object)adaptor.nil();

                    LT86=(Token)match(input,LT,FOLLOW_LT_in_typeParam1312); if (state.failed) return retval;
                    pushFollow(FOLLOW_typeList_in_typeParam1315);
                    typeList87=typeList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeList87.getTree());
                    LT88=(Token)match(input,LT,FOLLOW_LT_in_typeParam1317); if (state.failed) return retval;
                    pushFollow(FOLLOW_typeList_in_typeParam1320);
                    typeList89=typeList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeList89.getTree());
                    LT90=(Token)match(input,LT,FOLLOW_LT_in_typeParam1322); if (state.failed) return retval;
                    pushFollow(FOLLOW_typeList_in_typeParam1325);
                    typeList91=typeList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeList91.getTree());
                    GTGTGT92=(Token)match(input,GTGTGT,FOLLOW_GTGTGT_in_typeParam1327); if (state.failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // Haxe.g:213:1: typeParamOpt : ( typeParam -> ^( TYPE_PARAM_OPT[\"TYPE_PARAM_OPT\",true] ( typeParam )? ) | );
    public final HaxeParser.typeParamOpt_return typeParamOpt() throws RecognitionException {
        HaxeParser.typeParamOpt_return retval = new HaxeParser.typeParamOpt_return();
        retval.start = input.LT(1);
        int typeParamOpt_StartIndex = input.index();
        Object root_0 = null;

        HaxeParser.typeParam_return typeParam93 = null;


        RewriteRuleSubtreeStream stream_typeParam=new RewriteRuleSubtreeStream(adaptor,"rule typeParam");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return retval; }
            // Haxe.g:214:5: ( typeParam -> ^( TYPE_PARAM_OPT[\"TYPE_PARAM_OPT\",true] ( typeParam )? ) | )
            int alt28=2;
            alt28 = dfa28.predict(input);
            switch (alt28) {
                case 1 :
                    // Haxe.g:214:10: typeParam
                    {
                    pushFollow(FOLLOW_typeParam_in_typeParamOpt1359);
                    typeParam93=typeParam();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeParam.add(typeParam93.getTree());


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
                    // 214:20: -> ^( TYPE_PARAM_OPT[\"TYPE_PARAM_OPT\",true] ( typeParam )? )
                    {
                        // Haxe.g:214:23: ^( TYPE_PARAM_OPT[\"TYPE_PARAM_OPT\",true] ( typeParam )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new HaxeTree(TYPE_PARAM_OPT, "TYPE_PARAM_OPT", true), root_1);

                        // Haxe.g:214:73: ( typeParam )?
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
                    // Haxe.g:216:5: 
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
    // Haxe.g:218:1: typeConstraint : IDENTIFIER COLON LPAREN typeList RPAREN -> ^( $typeConstraint ( IDENTIFIER )? ( typeList )? ) ;
    public final HaxeParser.typeConstraint_return typeConstraint() throws RecognitionException {
        HaxeParser.typeConstraint_return retval = new HaxeParser.typeConstraint_return();
        retval.start = input.LT(1);
        int typeConstraint_StartIndex = input.index();
        Object root_0 = null;

        Token IDENTIFIER94=null;
        Token COLON95=null;
        Token LPAREN96=null;
        Token RPAREN98=null;
        HaxeParser.typeList_return typeList97 = null;


        Object IDENTIFIER94_tree=null;
        Object COLON95_tree=null;
        Object LPAREN96_tree=null;
        Object RPAREN98_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_typeList=new RewriteRuleSubtreeStream(adaptor,"rule typeList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return retval; }
            // Haxe.g:219:5: ( IDENTIFIER COLON LPAREN typeList RPAREN -> ^( $typeConstraint ( IDENTIFIER )? ( typeList )? ) )
            // Haxe.g:219:9: IDENTIFIER COLON LPAREN typeList RPAREN
            {
            IDENTIFIER94=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_typeConstraint1408); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER94);

            COLON95=(Token)match(input,COLON,FOLLOW_COLON_in_typeConstraint1410); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COLON.add(COLON95);

            LPAREN96=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_typeConstraint1412); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN96);

            pushFollow(FOLLOW_typeList_in_typeConstraint1414);
            typeList97=typeList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeList.add(typeList97.getTree());
            RPAREN98=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_typeConstraint1416); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN98);



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
            // 219:49: -> ^( $typeConstraint ( IDENTIFIER )? ( typeList )? )
            {
                // Haxe.g:219:52: ^( $typeConstraint ( IDENTIFIER )? ( typeList )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_retval.nextNode(), root_1);

                // Haxe.g:219:70: ( IDENTIFIER )?
                if ( stream_IDENTIFIER.hasNext() ) {
                    adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());

                }
                stream_IDENTIFIER.reset();
                // Haxe.g:219:82: ( typeList )?
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
    // Haxe.g:223:1: functionReturn : ( declAttrList )? FUNCTION NEW LPAREN paramList RPAREN typeTagOpt block -> ^( FUNCTION NEW ( declAttrList )? ( paramList )? ( typeTagOpt )? ( block )? ) ;
    public final HaxeParser.functionReturn_return functionReturn() throws RecognitionException {
        HaxeParser.functionReturn_return retval = new HaxeParser.functionReturn_return();
        retval.start = input.LT(1);
        int functionReturn_StartIndex = input.index();
        Object root_0 = null;

        Token FUNCTION100=null;
        Token NEW101=null;
        Token LPAREN102=null;
        Token RPAREN104=null;
        HaxeParser.declAttrList_return declAttrList99 = null;

        HaxeParser.paramList_return paramList103 = null;

        HaxeParser.typeTagOpt_return typeTagOpt105 = null;

        HaxeParser.block_return block106 = null;


        Object FUNCTION100_tree=null;
        Object NEW101_tree=null;
        Object LPAREN102_tree=null;
        Object RPAREN104_tree=null;
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
            // Haxe.g:224:5: ( ( declAttrList )? FUNCTION NEW LPAREN paramList RPAREN typeTagOpt block -> ^( FUNCTION NEW ( declAttrList )? ( paramList )? ( typeTagOpt )? ( block )? ) )
            // Haxe.g:224:10: ( declAttrList )? FUNCTION NEW LPAREN paramList RPAREN typeTagOpt block
            {
            // Haxe.g:224:10: ( declAttrList )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==PRIVATE||(LA29_0>=PUBLIC && LA29_0<=OVERRIDE)) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // Haxe.g:0:0: declAttrList
                    {
                    pushFollow(FOLLOW_declAttrList_in_functionReturn1454);
                    declAttrList99=declAttrList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declAttrList.add(declAttrList99.getTree());

                    }
                    break;

            }

            FUNCTION100=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_functionReturn1457); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION100);

            NEW101=(Token)match(input,NEW,FOLLOW_NEW_in_functionReturn1459); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_NEW.add(NEW101);

            LPAREN102=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_functionReturn1461); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN102);

            pushFollow(FOLLOW_paramList_in_functionReturn1463);
            paramList103=paramList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_paramList.add(paramList103.getTree());
            RPAREN104=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_functionReturn1465); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN104);

            pushFollow(FOLLOW_typeTagOpt_in_functionReturn1467);
            typeTagOpt105=typeTagOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeTagOpt.add(typeTagOpt105.getTree());
            pushFollow(FOLLOW_block_in_functionReturn1469);
            block106=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block106.getTree());


            // AST REWRITE
            // elements: NEW, typeTagOpt, declAttrList, FUNCTION, paramList, block
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 224:78: -> ^( FUNCTION NEW ( declAttrList )? ( paramList )? ( typeTagOpt )? ( block )? )
            {
                // Haxe.g:224:81: ^( FUNCTION NEW ( declAttrList )? ( paramList )? ( typeTagOpt )? ( block )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new FunctionNode(stream_FUNCTION.nextToken()), root_1);

                adaptor.addChild(root_1, stream_NEW.nextNode());
                // Haxe.g:224:110: ( declAttrList )?
                if ( stream_declAttrList.hasNext() ) {
                    adaptor.addChild(root_1, stream_declAttrList.nextTree());

                }
                stream_declAttrList.reset();
                // Haxe.g:224:124: ( paramList )?
                if ( stream_paramList.hasNext() ) {
                    adaptor.addChild(root_1, stream_paramList.nextTree());

                }
                stream_paramList.reset();
                // Haxe.g:224:135: ( typeTagOpt )?
                if ( stream_typeTagOpt.hasNext() ) {
                    adaptor.addChild(root_1, stream_typeTagOpt.nextTree());

                }
                stream_typeTagOpt.reset();
                // Haxe.g:224:147: ( block )?
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
    // Haxe.g:227:1: statement : ( block | assignExpr SEMI | varDecl | IF parExpression st1= statement ( ELSE st2= statement )? -> ^( IF parExpression $st1 ( ^( ELSE $st2) )? ) | FOR LPAREN exp1= expr IN exp2= expr RPAREN statement -> ^( FOR ^( IN $exp1 $exp2) ( statement )? ) | WHILE parExpression statement -> ^( WHILE ( parExpression )? ( statement )? ) | DO statement WHILE parExpression SEMI -> ^( DO ( parExpression )? ( statement )? ) | TRY block catchStmtList -> ^( TRY ( block )? ( catchStmtList )? ) | SWITCH LPAREN expr RPAREN LBRACE ( caseStmt )+ RBRACE -> ^( SWITCH ( expr )? ( caseStmt )+ ) | RETURN ( expr )? SEMI -> ^( RETURN ( expr )? ) | THROW expr SEMI -> ^( THROW ( expr )? ) | BREAK ( IDENTIFIER )? SEMI -> ^( BREAK ( IDENTIFIER )? ) | CONTINUE ( IDENTIFIER )? SEMI -> ^( CONTINUE ( IDENTIFIER )? ) | expr SEMI | IDENTIFIER COLON statement -> ^( COLON ( IDENTIFIER )? ( statement )? ) | SEMI );
    public final HaxeParser.statement_return statement() throws RecognitionException {
        HaxeParser.statement_return retval = new HaxeParser.statement_return();
        retval.start = input.LT(1);
        int statement_StartIndex = input.index();
        Object root_0 = null;

        Token SEMI109=null;
        Token IF111=null;
        Token ELSE113=null;
        Token FOR114=null;
        Token LPAREN115=null;
        Token IN116=null;
        Token RPAREN117=null;
        Token WHILE119=null;
        Token DO122=null;
        Token WHILE124=null;
        Token SEMI126=null;
        Token TRY127=null;
        Token SWITCH130=null;
        Token LPAREN131=null;
        Token RPAREN133=null;
        Token LBRACE134=null;
        Token RBRACE136=null;
        Token RETURN137=null;
        Token SEMI139=null;
        Token THROW140=null;
        Token SEMI142=null;
        Token BREAK143=null;
        Token IDENTIFIER144=null;
        Token SEMI145=null;
        Token CONTINUE146=null;
        Token IDENTIFIER147=null;
        Token SEMI148=null;
        Token SEMI150=null;
        Token IDENTIFIER151=null;
        Token COLON152=null;
        Token SEMI154=null;
        HaxeParser.statement_return st1 = null;

        HaxeParser.statement_return st2 = null;

        HaxeParser.expr_return exp1 = null;

        HaxeParser.expr_return exp2 = null;

        HaxeParser.block_return block107 = null;

        HaxeParser.assignExpr_return assignExpr108 = null;

        HaxeParser.varDecl_return varDecl110 = null;

        HaxeParser.parExpression_return parExpression112 = null;

        HaxeParser.statement_return statement118 = null;

        HaxeParser.parExpression_return parExpression120 = null;

        HaxeParser.statement_return statement121 = null;

        HaxeParser.statement_return statement123 = null;

        HaxeParser.parExpression_return parExpression125 = null;

        HaxeParser.block_return block128 = null;

        HaxeParser.catchStmtList_return catchStmtList129 = null;

        HaxeParser.expr_return expr132 = null;

        HaxeParser.caseStmt_return caseStmt135 = null;

        HaxeParser.expr_return expr138 = null;

        HaxeParser.expr_return expr141 = null;

        HaxeParser.expr_return expr149 = null;

        HaxeParser.statement_return statement153 = null;


        Object SEMI109_tree=null;
        Object IF111_tree=null;
        Object ELSE113_tree=null;
        Object FOR114_tree=null;
        Object LPAREN115_tree=null;
        Object IN116_tree=null;
        Object RPAREN117_tree=null;
        Object WHILE119_tree=null;
        Object DO122_tree=null;
        Object WHILE124_tree=null;
        Object SEMI126_tree=null;
        Object TRY127_tree=null;
        Object SWITCH130_tree=null;
        Object LPAREN131_tree=null;
        Object RPAREN133_tree=null;
        Object LBRACE134_tree=null;
        Object RBRACE136_tree=null;
        Object RETURN137_tree=null;
        Object SEMI139_tree=null;
        Object THROW140_tree=null;
        Object SEMI142_tree=null;
        Object BREAK143_tree=null;
        Object IDENTIFIER144_tree=null;
        Object SEMI145_tree=null;
        Object CONTINUE146_tree=null;
        Object IDENTIFIER147_tree=null;
        Object SEMI148_tree=null;
        Object SEMI150_tree=null;
        Object IDENTIFIER151_tree=null;
        Object COLON152_tree=null;
        Object SEMI154_tree=null;
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
            // Haxe.g:228:5: ( block | assignExpr SEMI | varDecl | IF parExpression st1= statement ( ELSE st2= statement )? -> ^( IF parExpression $st1 ( ^( ELSE $st2) )? ) | FOR LPAREN exp1= expr IN exp2= expr RPAREN statement -> ^( FOR ^( IN $exp1 $exp2) ( statement )? ) | WHILE parExpression statement -> ^( WHILE ( parExpression )? ( statement )? ) | DO statement WHILE parExpression SEMI -> ^( DO ( parExpression )? ( statement )? ) | TRY block catchStmtList -> ^( TRY ( block )? ( catchStmtList )? ) | SWITCH LPAREN expr RPAREN LBRACE ( caseStmt )+ RBRACE -> ^( SWITCH ( expr )? ( caseStmt )+ ) | RETURN ( expr )? SEMI -> ^( RETURN ( expr )? ) | THROW expr SEMI -> ^( THROW ( expr )? ) | BREAK ( IDENTIFIER )? SEMI -> ^( BREAK ( IDENTIFIER )? ) | CONTINUE ( IDENTIFIER )? SEMI -> ^( CONTINUE ( IDENTIFIER )? ) | expr SEMI | IDENTIFIER COLON statement -> ^( COLON ( IDENTIFIER )? ( statement )? ) | SEMI )
            int alt35=16;
            alt35 = dfa35.predict(input);
            switch (alt35) {
                case 1 :
                    // Haxe.g:228:10: block
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_block_in_statement1518);
                    block107=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, block107.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:229:10: assignExpr SEMI
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_assignExpr_in_statement1529);
                    assignExpr108=assignExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignExpr108.getTree());
                    SEMI109=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement1531); if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // Haxe.g:230:10: varDecl
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_varDecl_in_statement1543);
                    varDecl110=varDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDecl110.getTree());

                    }
                    break;
                case 4 :
                    // Haxe.g:231:10: IF parExpression st1= statement ( ELSE st2= statement )?
                    {
                    IF111=(Token)match(input,IF,FOLLOW_IF_in_statement1554); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IF.add(IF111);

                    pushFollow(FOLLOW_parExpression_in_statement1556);
                    parExpression112=parExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_parExpression.add(parExpression112.getTree());
                    pushFollow(FOLLOW_statement_in_statement1560);
                    st1=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(st1.getTree());
                    // Haxe.g:231:41: ( ELSE st2= statement )?
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
                            // Haxe.g:231:42: ELSE st2= statement
                            {
                            ELSE113=(Token)match(input,ELSE,FOLLOW_ELSE_in_statement1563); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_ELSE.add(ELSE113);

                            pushFollow(FOLLOW_statement_in_statement1567);
                            st2=statement();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_statement.add(st2.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: IF, st1, ELSE, parExpression, st2
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
                    // 231:67: -> ^( IF parExpression $st1 ( ^( ELSE $st2) )? )
                    {
                        // Haxe.g:231:70: ^( IF parExpression $st1 ( ^( ELSE $st2) )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new IfNode(stream_IF.nextToken()), root_1);

                        adaptor.addChild(root_1, stream_parExpression.nextTree());
                        adaptor.addChild(root_1, stream_st1.nextTree());
                        // Haxe.g:231:102: ( ^( ELSE $st2) )?
                        if ( stream_ELSE.hasNext()||stream_st2.hasNext() ) {
                            // Haxe.g:231:102: ^( ELSE $st2)
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
                    // Haxe.g:232:10: FOR LPAREN exp1= expr IN exp2= expr RPAREN statement
                    {
                    FOR114=(Token)match(input,FOR,FOLLOW_FOR_in_statement1616); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FOR.add(FOR114);

                    LPAREN115=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_statement1618); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN115);

                    pushFollow(FOLLOW_expr_in_statement1622);
                    exp1=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(exp1.getTree());
                    IN116=(Token)match(input,IN,FOLLOW_IN_in_statement1624); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IN.add(IN116);

                    pushFollow(FOLLOW_expr_in_statement1628);
                    exp2=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(exp2.getTree());
                    RPAREN117=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_statement1630); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN117);

                    pushFollow(FOLLOW_statement_in_statement1632);
                    statement118=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement118.getTree());


                    // AST REWRITE
                    // elements: FOR, exp2, exp1, IN, statement
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
                    // 232:65: -> ^( FOR ^( IN $exp1 $exp2) ( statement )? )
                    {
                        // Haxe.g:232:68: ^( FOR ^( IN $exp1 $exp2) ( statement )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new ForNode(stream_FOR.nextToken()), root_1);

                        // Haxe.g:232:83: ^( IN $exp1 $exp2)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_IN.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_exp1.nextTree());
                        adaptor.addChild(root_2, stream_exp2.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // Haxe.g:232:101: ( statement )?
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
                    // Haxe.g:233:10: WHILE parExpression statement
                    {
                    WHILE119=(Token)match(input,WHILE,FOLLOW_WHILE_in_statement1669); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHILE.add(WHILE119);

                    pushFollow(FOLLOW_parExpression_in_statement1671);
                    parExpression120=parExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_parExpression.add(parExpression120.getTree());
                    pushFollow(FOLLOW_statement_in_statement1673);
                    statement121=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement121.getTree());


                    // AST REWRITE
                    // elements: parExpression, statement, WHILE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 233:56: -> ^( WHILE ( parExpression )? ( statement )? )
                    {
                        // Haxe.g:233:59: ^( WHILE ( parExpression )? ( statement )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new WhileNode(stream_WHILE.nextToken()), root_1);

                        // Haxe.g:233:78: ( parExpression )?
                        if ( stream_parExpression.hasNext() ) {
                            adaptor.addChild(root_1, stream_parExpression.nextTree());

                        }
                        stream_parExpression.reset();
                        // Haxe.g:233:93: ( statement )?
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
                    // Haxe.g:234:10: DO statement WHILE parExpression SEMI
                    {
                    DO122=(Token)match(input,DO,FOLLOW_DO_in_statement1715); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DO.add(DO122);

                    pushFollow(FOLLOW_statement_in_statement1717);
                    statement123=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement123.getTree());
                    WHILE124=(Token)match(input,WHILE,FOLLOW_WHILE_in_statement1719); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHILE.add(WHILE124);

                    pushFollow(FOLLOW_parExpression_in_statement1721);
                    parExpression125=parExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_parExpression.add(parExpression125.getTree());
                    SEMI126=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement1723); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI126);



                    // AST REWRITE
                    // elements: parExpression, DO, statement
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 234:60: -> ^( DO ( parExpression )? ( statement )? )
                    {
                        // Haxe.g:234:63: ^( DO ( parExpression )? ( statement )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new DoWhileNode(stream_DO.nextToken()), root_1);

                        // Haxe.g:234:81: ( parExpression )?
                        if ( stream_parExpression.hasNext() ) {
                            adaptor.addChild(root_1, stream_parExpression.nextTree());

                        }
                        stream_parExpression.reset();
                        // Haxe.g:234:96: ( statement )?
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
                    // Haxe.g:235:10: TRY block catchStmtList
                    {
                    TRY127=(Token)match(input,TRY,FOLLOW_TRY_in_statement1761); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TRY.add(TRY127);

                    pushFollow(FOLLOW_block_in_statement1763);
                    block128=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block128.getTree());
                    pushFollow(FOLLOW_catchStmtList_in_statement1765);
                    catchStmtList129=catchStmtList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_catchStmtList.add(catchStmtList129.getTree());


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
                    // 235:50: -> ^( TRY ( block )? ( catchStmtList )? )
                    {
                        // Haxe.g:235:53: ^( TRY ( block )? ( catchStmtList )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new TryNode(stream_TRY.nextToken()), root_1);

                        // Haxe.g:235:68: ( block )?
                        if ( stream_block.hasNext() ) {
                            adaptor.addChild(root_1, stream_block.nextTree());

                        }
                        stream_block.reset();
                        // Haxe.g:235:75: ( catchStmtList )?
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
                    // Haxe.g:236:10: SWITCH LPAREN expr RPAREN LBRACE ( caseStmt )+ RBRACE
                    {
                    SWITCH130=(Token)match(input,SWITCH,FOLLOW_SWITCH_in_statement1807); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SWITCH.add(SWITCH130);

                    LPAREN131=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_statement1809); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN131);

                    pushFollow(FOLLOW_expr_in_statement1811);
                    expr132=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr132.getTree());
                    RPAREN133=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_statement1813); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN133);

                    LBRACE134=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_statement1815); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LBRACE.add(LBRACE134);

                    // Haxe.g:236:43: ( caseStmt )+
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
                    	    pushFollow(FOLLOW_caseStmt_in_statement1817);
                    	    caseStmt135=caseStmt();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_caseStmt.add(caseStmt135.getTree());

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

                    RBRACE136=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_statement1820); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RBRACE.add(RBRACE136);



                    // AST REWRITE
                    // elements: expr, SWITCH, caseStmt
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 236:64: -> ^( SWITCH ( expr )? ( caseStmt )+ )
                    {
                        // Haxe.g:236:67: ^( SWITCH ( expr )? ( caseStmt )+ )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new SwitchNode(stream_SWITCH.nextToken()), root_1);

                        // Haxe.g:236:88: ( expr )?
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
                    // Haxe.g:237:10: RETURN ( expr )? SEMI
                    {
                    RETURN137=(Token)match(input,RETURN,FOLLOW_RETURN_in_statement1850); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RETURN.add(RETURN137);

                    // Haxe.g:237:17: ( expr )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==LPAREN||LA32_0==IDENTIFIER||LA32_0==THIS||(LA32_0>=FUNCTION && LA32_0<=LBRACKET)||LA32_0==NEW||LA32_0==LBRACE||LA32_0==UNTYPED||(LA32_0>=PLUS && LA32_0<=SUB)||(LA32_0>=SUBSUB && LA32_0<=CAST)||LA32_0==NULL||(LA32_0>=LONGLITERAL && LA32_0<=FALSE)) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // Haxe.g:237:18: expr
                            {
                            pushFollow(FOLLOW_expr_in_statement1853);
                            expr138=expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expr.add(expr138.getTree());

                            }
                            break;

                    }

                    SEMI139=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement1857); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI139);



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
                    // 237:49: -> ^( RETURN ( expr )? )
                    {
                        // Haxe.g:237:52: ^( RETURN ( expr )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_RETURN.nextNode(), root_1);

                        // Haxe.g:237:61: ( expr )?
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
                    // Haxe.g:238:10: THROW expr SEMI
                    {
                    THROW140=(Token)match(input,THROW,FOLLOW_THROW_in_statement1896); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THROW.add(THROW140);

                    pushFollow(FOLLOW_expr_in_statement1898);
                    expr141=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr141.getTree());
                    SEMI142=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement1900); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI142);



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
                    // 238:46: -> ^( THROW ( expr )? )
                    {
                        // Haxe.g:238:49: ^( THROW ( expr )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_THROW.nextNode(), root_1);

                        // Haxe.g:238:57: ( expr )?
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
                    // Haxe.g:239:10: BREAK ( IDENTIFIER )? SEMI
                    {
                    BREAK143=(Token)match(input,BREAK,FOLLOW_BREAK_in_statement1940); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_BREAK.add(BREAK143);

                    // Haxe.g:239:16: ( IDENTIFIER )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==IDENTIFIER) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // Haxe.g:239:17: IDENTIFIER
                            {
                            IDENTIFIER144=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_statement1943); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER144);


                            }
                            break;

                    }

                    SEMI145=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement1947); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI145);



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
                    // 239:50: -> ^( BREAK ( IDENTIFIER )? )
                    {
                        // Haxe.g:239:53: ^( BREAK ( IDENTIFIER )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_BREAK.nextNode(), root_1);

                        // Haxe.g:239:61: ( IDENTIFIER )?
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
                    // Haxe.g:240:10: CONTINUE ( IDENTIFIER )? SEMI
                    {
                    CONTINUE146=(Token)match(input,CONTINUE,FOLLOW_CONTINUE_in_statement1982); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CONTINUE.add(CONTINUE146);

                    // Haxe.g:240:19: ( IDENTIFIER )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==IDENTIFIER) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // Haxe.g:240:20: IDENTIFIER
                            {
                            IDENTIFIER147=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_statement1985); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER147);


                            }
                            break;

                    }

                    SEMI148=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement1989); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI148);



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
                    // 240:54: -> ^( CONTINUE ( IDENTIFIER )? )
                    {
                        // Haxe.g:240:57: ^( CONTINUE ( IDENTIFIER )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_CONTINUE.nextNode(), root_1);

                        // Haxe.g:240:68: ( IDENTIFIER )?
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
                    // Haxe.g:241:10: expr SEMI
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_expr_in_statement2025);
                    expr149=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr149.getTree());
                    SEMI150=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement2028); if (state.failed) return retval;

                    }
                    break;
                case 15 :
                    // Haxe.g:242:10: IDENTIFIER COLON statement
                    {
                    IDENTIFIER151=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_statement2040); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER151);

                    COLON152=(Token)match(input,COLON,FOLLOW_COLON_in_statement2042); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(COLON152);

                    pushFollow(FOLLOW_statement_in_statement2044);
                    statement153=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement153.getTree());


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
                    // 242:53: -> ^( COLON ( IDENTIFIER )? ( statement )? )
                    {
                        // Haxe.g:242:56: ^( COLON ( IDENTIFIER )? ( statement )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_COLON.nextNode(), root_1);

                        // Haxe.g:242:64: ( IDENTIFIER )?
                        if ( stream_IDENTIFIER.hasNext() ) {
                            adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());

                        }
                        stream_IDENTIFIER.reset();
                        // Haxe.g:242:76: ( statement )?
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
                    // Haxe.g:243:10: SEMI
                    {
                    root_0 = (Object)adaptor.nil();

                    SEMI154=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement2083); if (state.failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // Haxe.g:246:1: parExpression : LPAREN expr RPAREN ;
    public final HaxeParser.parExpression_return parExpression() throws RecognitionException {
        HaxeParser.parExpression_return retval = new HaxeParser.parExpression_return();
        retval.start = input.LT(1);
        int parExpression_StartIndex = input.index();
        Object root_0 = null;

        Token LPAREN155=null;
        Token RPAREN157=null;
        HaxeParser.expr_return expr156 = null;


        Object LPAREN155_tree=null;
        Object RPAREN157_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return retval; }
            // Haxe.g:247:5: ( LPAREN expr RPAREN )
            // Haxe.g:247:9: LPAREN expr RPAREN
            {
            root_0 = (Object)adaptor.nil();

            LPAREN155=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_parExpression2107); if (state.failed) return retval;
            pushFollow(FOLLOW_expr_in_parExpression2110);
            expr156=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr156.getTree());
            RPAREN157=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_parExpression2112); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // Haxe.g:250:1: block : ( LBRACE ( blockStmt )* RBRACE -> ^( BLOCK_SCOPE[\"BLOCK_SCOPE\", true, $LBRACE] ( blockStmt )* RBRACE[$RBRACE, true] ) | SEMI );
    public final HaxeParser.block_return block() throws RecognitionException {
        HaxeParser.block_return retval = new HaxeParser.block_return();
        retval.start = input.LT(1);
        int block_StartIndex = input.index();
        Object root_0 = null;

        Token LBRACE158=null;
        Token RBRACE160=null;
        Token SEMI161=null;
        HaxeParser.blockStmt_return blockStmt159 = null;


        Object LBRACE158_tree=null;
        Object RBRACE160_tree=null;
        Object SEMI161_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_blockStmt=new RewriteRuleSubtreeStream(adaptor,"rule blockStmt");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return retval; }
            // Haxe.g:250:9: ( LBRACE ( blockStmt )* RBRACE -> ^( BLOCK_SCOPE[\"BLOCK_SCOPE\", true, $LBRACE] ( blockStmt )* RBRACE[$RBRACE, true] ) | SEMI )
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
                    // Haxe.g:250:14: LBRACE ( blockStmt )* RBRACE
                    {
                    LBRACE158=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_block2131); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LBRACE.add(LBRACE158);

                    // Haxe.g:250:21: ( blockStmt )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( ((LA36_0>=SEMI && LA36_0<=LPAREN)||LA36_0==IDENTIFIER||(LA36_0>=EXTERN && LA36_0<=PRIVATE)||(LA36_0>=PUBLIC && LA36_0<=OVERRIDE)||LA36_0==THIS||(LA36_0>=FUNCTION && LA36_0<=LBRACKET)||(LA36_0>=NEW && LA36_0<=IF)||LA36_0==FOR||(LA36_0>=WHILE && LA36_0<=LBRACE)||(LA36_0>=RETURN && LA36_0<=CONTINUE)||LA36_0==UNTYPED||(LA36_0>=PLUS && LA36_0<=SUB)||(LA36_0>=SUBSUB && LA36_0<=INTERFACE)||(LA36_0>=LONGLITERAL && LA36_0<=FALSE)) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // Haxe.g:250:22: blockStmt
                    	    {
                    	    pushFollow(FOLLOW_blockStmt_in_block2134);
                    	    blockStmt159=blockStmt();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_blockStmt.add(blockStmt159.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop36;
                        }
                    } while (true);

                    RBRACE160=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_block2138); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RBRACE.add(RBRACE160);



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
                    // 250:41: -> ^( BLOCK_SCOPE[\"BLOCK_SCOPE\", true, $LBRACE] ( blockStmt )* RBRACE[$RBRACE, true] )
                    {
                        // Haxe.g:250:44: ^( BLOCK_SCOPE[\"BLOCK_SCOPE\", true, $LBRACE] ( blockStmt )* RBRACE[$RBRACE, true] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new BlockScopeNode(BLOCK_SCOPE, "BLOCK_SCOPE", true, LBRACE158), root_1);

                        // Haxe.g:250:104: ( blockStmt )*
                        while ( stream_blockStmt.hasNext() ) {
                            adaptor.addChild(root_1, stream_blockStmt.nextTree());

                        }
                        stream_blockStmt.reset();
                        adaptor.addChild(root_1, new HaxeTree(RBRACE, RBRACE160, true));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // Haxe.g:251:14: SEMI
                    {
                    root_0 = (Object)adaptor.nil();

                    SEMI161=(Token)match(input,SEMI,FOLLOW_SEMI_in_block2173); if (state.failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // Haxe.g:254:1: blockStmt : ( varDecl | classDecl | statement );
    public final HaxeParser.blockStmt_return blockStmt() throws RecognitionException {
        HaxeParser.blockStmt_return retval = new HaxeParser.blockStmt_return();
        retval.start = input.LT(1);
        int blockStmt_StartIndex = input.index();
        Object root_0 = null;

        HaxeParser.varDecl_return varDecl162 = null;

        HaxeParser.classDecl_return classDecl163 = null;

        HaxeParser.statement_return statement164 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return retval; }
            // Haxe.g:255:5: ( varDecl | classDecl | statement )
            int alt38=3;
            alt38 = dfa38.predict(input);
            switch (alt38) {
                case 1 :
                    // Haxe.g:255:10: varDecl
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_varDecl_in_blockStmt2202);
                    varDecl162=varDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDecl162.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:256:10: classDecl
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_classDecl_in_blockStmt2213);
                    classDecl163=classDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, classDecl163.getTree());

                    }
                    break;
                case 3 :
                    // Haxe.g:257:10: statement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_statement_in_blockStmt2224);
                    statement164=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement164.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // Haxe.g:260:1: breakStmt : BREAK SEMI ;
    public final HaxeParser.breakStmt_return breakStmt() throws RecognitionException {
        HaxeParser.breakStmt_return retval = new HaxeParser.breakStmt_return();
        retval.start = input.LT(1);
        int breakStmt_StartIndex = input.index();
        Object root_0 = null;

        Token BREAK165=null;
        Token SEMI166=null;

        Object BREAK165_tree=null;
        Object SEMI166_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return retval; }
            // Haxe.g:261:5: ( BREAK SEMI )
            // Haxe.g:261:10: BREAK SEMI
            {
            root_0 = (Object)adaptor.nil();

            BREAK165=(Token)match(input,BREAK,FOLLOW_BREAK_in_breakStmt2248); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            BREAK165_tree = (Object)adaptor.create(BREAK165);
            adaptor.addChild(root_0, BREAK165_tree);
            }
            SEMI166=(Token)match(input,SEMI,FOLLOW_SEMI_in_breakStmt2250); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // Haxe.g:264:1: continueStmt : CONTINUE SEMI ;
    public final HaxeParser.continueStmt_return continueStmt() throws RecognitionException {
        HaxeParser.continueStmt_return retval = new HaxeParser.continueStmt_return();
        retval.start = input.LT(1);
        int continueStmt_StartIndex = input.index();
        Object root_0 = null;

        Token CONTINUE167=null;
        Token SEMI168=null;

        Object CONTINUE167_tree=null;
        Object SEMI168_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return retval; }
            // Haxe.g:265:5: ( CONTINUE SEMI )
            // Haxe.g:265:10: CONTINUE SEMI
            {
            root_0 = (Object)adaptor.nil();

            CONTINUE167=(Token)match(input,CONTINUE,FOLLOW_CONTINUE_in_continueStmt2275); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            CONTINUE167_tree = (Object)adaptor.create(CONTINUE167);
            adaptor.addChild(root_0, CONTINUE167_tree);
            }
            SEMI168=(Token)match(input,SEMI,FOLLOW_SEMI_in_continueStmt2277); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // Haxe.g:268:1: caseStmt : ( CASE exprList COLON statement -> ^( CASE ( exprList )? ( statement )? ) | DEFAULT COLON statement -> ^( DEFAULT ( statement )? ) );
    public final HaxeParser.caseStmt_return caseStmt() throws RecognitionException {
        HaxeParser.caseStmt_return retval = new HaxeParser.caseStmt_return();
        retval.start = input.LT(1);
        int caseStmt_StartIndex = input.index();
        Object root_0 = null;

        Token CASE169=null;
        Token COLON171=null;
        Token DEFAULT173=null;
        Token COLON174=null;
        HaxeParser.exprList_return exprList170 = null;

        HaxeParser.statement_return statement172 = null;

        HaxeParser.statement_return statement175 = null;


        Object CASE169_tree=null;
        Object COLON171_tree=null;
        Object DEFAULT173_tree=null;
        Object COLON174_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_DEFAULT=new RewriteRuleTokenStream(adaptor,"token DEFAULT");
        RewriteRuleTokenStream stream_CASE=new RewriteRuleTokenStream(adaptor,"token CASE");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_exprList=new RewriteRuleSubtreeStream(adaptor,"rule exprList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return retval; }
            // Haxe.g:269:5: ( CASE exprList COLON statement -> ^( CASE ( exprList )? ( statement )? ) | DEFAULT COLON statement -> ^( DEFAULT ( statement )? ) )
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
                    // Haxe.g:269:10: CASE exprList COLON statement
                    {
                    CASE169=(Token)match(input,CASE,FOLLOW_CASE_in_caseStmt2302); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CASE.add(CASE169);

                    pushFollow(FOLLOW_exprList_in_caseStmt2304);
                    exprList170=exprList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_exprList.add(exprList170.getTree());
                    COLON171=(Token)match(input,COLON,FOLLOW_COLON_in_caseStmt2306); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(COLON171);

                    pushFollow(FOLLOW_statement_in_caseStmt2308);
                    statement172=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement172.getTree());


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
                    // 269:41: -> ^( CASE ( exprList )? ( statement )? )
                    {
                        // Haxe.g:269:44: ^( CASE ( exprList )? ( statement )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_CASE.nextNode(), root_1);

                        // Haxe.g:269:51: ( exprList )?
                        if ( stream_exprList.hasNext() ) {
                            adaptor.addChild(root_1, stream_exprList.nextTree());

                        }
                        stream_exprList.reset();
                        // Haxe.g:269:61: ( statement )?
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
                    // Haxe.g:270:10: DEFAULT COLON statement
                    {
                    DEFAULT173=(Token)match(input,DEFAULT,FOLLOW_DEFAULT_in_caseStmt2332); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DEFAULT.add(DEFAULT173);

                    COLON174=(Token)match(input,COLON,FOLLOW_COLON_in_caseStmt2334); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(COLON174);

                    pushFollow(FOLLOW_statement_in_caseStmt2336);
                    statement175=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement175.getTree());


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
                    // 270:41: -> ^( DEFAULT ( statement )? )
                    {
                        // Haxe.g:270:44: ^( DEFAULT ( statement )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_DEFAULT.nextNode(), root_1);

                        // Haxe.g:270:54: ( statement )?
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
    // Haxe.g:273:1: defaultStmt : DEFAULT COLON ;
    public final HaxeParser.defaultStmt_return defaultStmt() throws RecognitionException {
        HaxeParser.defaultStmt_return retval = new HaxeParser.defaultStmt_return();
        retval.start = input.LT(1);
        int defaultStmt_StartIndex = input.index();
        Object root_0 = null;

        Token DEFAULT176=null;
        Token COLON177=null;

        Object DEFAULT176_tree=null;
        Object COLON177_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return retval; }
            // Haxe.g:274:5: ( DEFAULT COLON )
            // Haxe.g:274:10: DEFAULT COLON
            {
            root_0 = (Object)adaptor.nil();

            DEFAULT176=(Token)match(input,DEFAULT,FOLLOW_DEFAULT_in_defaultStmt2376); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            DEFAULT176_tree = (Object)adaptor.create(DEFAULT176);
            adaptor.addChild(root_0, DEFAULT176_tree);
            }
            COLON177=(Token)match(input,COLON,FOLLOW_COLON_in_defaultStmt2378); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // Haxe.g:277:1: catchStmtList : ( catchStmt catchStmtList | );
    public final HaxeParser.catchStmtList_return catchStmtList() throws RecognitionException {
        HaxeParser.catchStmtList_return retval = new HaxeParser.catchStmtList_return();
        retval.start = input.LT(1);
        int catchStmtList_StartIndex = input.index();
        Object root_0 = null;

        HaxeParser.catchStmt_return catchStmt178 = null;

        HaxeParser.catchStmtList_return catchStmtList179 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return retval; }
            // Haxe.g:278:5: ( catchStmt catchStmtList | )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==CATCH) ) {
                alt40=1;
            }
            else if ( (LA40_0==EOF||(LA40_0>=SEMI && LA40_0<=IDENTIFIER)||(LA40_0>=EXTERN && LA40_0<=PRIVATE)||(LA40_0>=PUBLIC && LA40_0<=OVERRIDE)||LA40_0==THIS||(LA40_0>=FUNCTION && LA40_0<=LBRACKET)||(LA40_0>=NEW && LA40_0<=FOR)||(LA40_0>=WHILE && LA40_0<=DEFAULT)||LA40_0==UNTYPED||(LA40_0>=PLUS && LA40_0<=SUB)||(LA40_0>=SUBSUB && LA40_0<=INTERFACE)||(LA40_0>=LONGLITERAL && LA40_0<=FALSE)) ) {
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
                    // Haxe.g:278:7: catchStmt catchStmtList
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_catchStmt_in_catchStmtList2400);
                    catchStmt178=catchStmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, catchStmt178.getTree());
                    pushFollow(FOLLOW_catchStmtList_in_catchStmtList2402);
                    catchStmtList179=catchStmtList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, catchStmtList179.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:280:5: 
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
    // Haxe.g:282:1: catchStmt : CATCH LPAREN param RPAREN block -> ^( CATCH ( param )? ( block )? ) ;
    public final HaxeParser.catchStmt_return catchStmt() throws RecognitionException {
        HaxeParser.catchStmt_return retval = new HaxeParser.catchStmt_return();
        retval.start = input.LT(1);
        int catchStmt_StartIndex = input.index();
        Object root_0 = null;

        Token CATCH180=null;
        Token LPAREN181=null;
        Token RPAREN183=null;
        HaxeParser.param_return param182 = null;

        HaxeParser.block_return block184 = null;


        Object CATCH180_tree=null;
        Object LPAREN181_tree=null;
        Object RPAREN183_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_CATCH=new RewriteRuleTokenStream(adaptor,"token CATCH");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_param=new RewriteRuleSubtreeStream(adaptor,"rule param");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return retval; }
            // Haxe.g:283:5: ( CATCH LPAREN param RPAREN block -> ^( CATCH ( param )? ( block )? ) )
            // Haxe.g:283:10: CATCH LPAREN param RPAREN block
            {
            CATCH180=(Token)match(input,CATCH,FOLLOW_CATCH_in_catchStmt2432); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CATCH.add(CATCH180);

            LPAREN181=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_catchStmt2434); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN181);

            pushFollow(FOLLOW_param_in_catchStmt2436);
            param182=param();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_param.add(param182.getTree());
            RPAREN183=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_catchStmt2438); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN183);

            pushFollow(FOLLOW_block_in_catchStmt2440);
            block184=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block184.getTree());


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
            // 283:42: -> ^( CATCH ( param )? ( block )? )
            {
                // Haxe.g:283:45: ^( CATCH ( param )? ( block )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_CATCH.nextNode(), root_1);

                // Haxe.g:283:53: ( param )?
                if ( stream_param.hasNext() ) {
                    adaptor.addChild(root_1, stream_param.nextTree());

                }
                stream_param.reset();
                // Haxe.g:283:60: ( block )?
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
    // Haxe.g:288:1: exprListOpt : ( exprList | );
    public final HaxeParser.exprListOpt_return exprListOpt() throws RecognitionException {
        HaxeParser.exprListOpt_return retval = new HaxeParser.exprListOpt_return();
        retval.start = input.LT(1);
        int exprListOpt_StartIndex = input.index();
        Object root_0 = null;

        HaxeParser.exprList_return exprList185 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return retval; }
            // Haxe.g:289:5: ( exprList | )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==LPAREN||LA41_0==IDENTIFIER||LA41_0==THIS||(LA41_0>=FUNCTION && LA41_0<=LBRACKET)||LA41_0==NEW||LA41_0==LBRACE||LA41_0==UNTYPED||(LA41_0>=PLUS && LA41_0<=SUB)||(LA41_0>=SUBSUB && LA41_0<=CAST)||LA41_0==NULL||(LA41_0>=LONGLITERAL && LA41_0<=FALSE)) ) {
                alt41=1;
            }
            else if ( (LA41_0==RPAREN||LA41_0==RBRACKET) ) {
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
                    // Haxe.g:289:10: exprList
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_exprList_in_exprListOpt2478);
                    exprList185=exprList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, exprList185.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:291:5: 
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
    // Haxe.g:293:1: exprList : expr ( COMMA expr )* ;
    public final HaxeParser.exprList_return exprList() throws RecognitionException {
        HaxeParser.exprList_return retval = new HaxeParser.exprList_return();
        retval.start = input.LT(1);
        int exprList_StartIndex = input.index();
        Object root_0 = null;

        Token COMMA187=null;
        HaxeParser.expr_return expr186 = null;

        HaxeParser.expr_return expr188 = null;


        Object COMMA187_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return retval; }
            // Haxe.g:294:5: ( expr ( COMMA expr )* )
            // Haxe.g:294:10: expr ( COMMA expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_expr_in_exprList2508);
            expr186=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr186.getTree());
            // Haxe.g:294:15: ( COMMA expr )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==COMMA) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // Haxe.g:294:16: COMMA expr
            	    {
            	    COMMA187=(Token)match(input,COMMA,FOLLOW_COMMA_in_exprList2511); if (state.failed) return retval;
            	    pushFollow(FOLLOW_expr_in_exprList2514);
            	    expr188=expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr188.getTree());

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
    // Haxe.g:297:1: expr : ( assignExpr | UNTYPED assignExpr -> ^( UNTYPED assignExpr ) );
    public final HaxeParser.expr_return expr() throws RecognitionException {
        HaxeParser.expr_return retval = new HaxeParser.expr_return();
        retval.start = input.LT(1);
        int expr_StartIndex = input.index();
        Object root_0 = null;

        Token UNTYPED190=null;
        HaxeParser.assignExpr_return assignExpr189 = null;

        HaxeParser.assignExpr_return assignExpr191 = null;


        Object UNTYPED190_tree=null;
        RewriteRuleTokenStream stream_UNTYPED=new RewriteRuleTokenStream(adaptor,"token UNTYPED");
        RewriteRuleSubtreeStream stream_assignExpr=new RewriteRuleSubtreeStream(adaptor,"rule assignExpr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 42) ) { return retval; }
            // Haxe.g:298:5: ( assignExpr | UNTYPED assignExpr -> ^( UNTYPED assignExpr ) )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==LPAREN||LA43_0==IDENTIFIER||LA43_0==THIS||(LA43_0>=FUNCTION && LA43_0<=LBRACKET)||LA43_0==NEW||LA43_0==LBRACE||(LA43_0>=PLUS && LA43_0<=SUB)||(LA43_0>=SUBSUB && LA43_0<=CAST)||LA43_0==NULL||(LA43_0>=LONGLITERAL && LA43_0<=FALSE)) ) {
                alt43=1;
            }
            else if ( (LA43_0==UNTYPED) ) {
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
                    // Haxe.g:298:10: assignExpr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_assignExpr_in_expr2540);
                    assignExpr189=assignExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignExpr189.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:299:10: UNTYPED assignExpr
                    {
                    UNTYPED190=(Token)match(input,UNTYPED,FOLLOW_UNTYPED_in_expr2551); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_UNTYPED.add(UNTYPED190);

                    pushFollow(FOLLOW_assignExpr_in_expr2553);
                    assignExpr191=assignExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_assignExpr.add(assignExpr191.getTree());


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
                    // 299:32: -> ^( UNTYPED assignExpr )
                    {
                        // Haxe.g:299:35: ^( UNTYPED assignExpr )
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
    // Haxe.g:302:1: assignExpr : iterExpr ( assignOp iterExpr )* ;
    public final HaxeParser.assignExpr_return assignExpr() throws RecognitionException {
        HaxeParser.assignExpr_return retval = new HaxeParser.assignExpr_return();
        retval.start = input.LT(1);
        int assignExpr_StartIndex = input.index();
        Object root_0 = null;

        HaxeParser.iterExpr_return iterExpr192 = null;

        HaxeParser.assignOp_return assignOp193 = null;

        HaxeParser.iterExpr_return iterExpr194 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 43) ) { return retval; }
            // Haxe.g:303:5: ( iterExpr ( assignOp iterExpr )* )
            // Haxe.g:303:11: iterExpr ( assignOp iterExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_iterExpr_in_assignExpr2585);
            iterExpr192=iterExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, iterExpr192.getTree());
            // Haxe.g:303:20: ( assignOp iterExpr )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( ((LA44_0>=EQ && LA44_0<=AMPEQ)) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // Haxe.g:303:21: assignOp iterExpr
            	    {
            	    pushFollow(FOLLOW_assignOp_in_assignExpr2588);
            	    assignOp193=assignOp();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(assignOp193.getTree(), root_0);
            	    pushFollow(FOLLOW_iterExpr_in_assignExpr2591);
            	    iterExpr194=iterExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, iterExpr194.getTree());

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
    // Haxe.g:306:1: iterExpr : ternaryExpr ( ELLIPSIS ternaryExpr )* ;
    public final HaxeParser.iterExpr_return iterExpr() throws RecognitionException {
        HaxeParser.iterExpr_return retval = new HaxeParser.iterExpr_return();
        retval.start = input.LT(1);
        int iterExpr_StartIndex = input.index();
        Object root_0 = null;

        Token ELLIPSIS196=null;
        HaxeParser.ternaryExpr_return ternaryExpr195 = null;

        HaxeParser.ternaryExpr_return ternaryExpr197 = null;


        Object ELLIPSIS196_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 44) ) { return retval; }
            // Haxe.g:307:5: ( ternaryExpr ( ELLIPSIS ternaryExpr )* )
            // Haxe.g:307:10: ternaryExpr ( ELLIPSIS ternaryExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_ternaryExpr_in_iterExpr2614);
            ternaryExpr195=ternaryExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, ternaryExpr195.getTree());
            // Haxe.g:307:22: ( ELLIPSIS ternaryExpr )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==ELLIPSIS) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // Haxe.g:307:23: ELLIPSIS ternaryExpr
            	    {
            	    ELLIPSIS196=(Token)match(input,ELLIPSIS,FOLLOW_ELLIPSIS_in_iterExpr2617); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    ELLIPSIS196_tree = (Object)adaptor.create(ELLIPSIS196);
            	    root_0 = (Object)adaptor.becomeRoot(ELLIPSIS196_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ternaryExpr_in_iterExpr2620);
            	    ternaryExpr197=ternaryExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, ternaryExpr197.getTree());

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
    // Haxe.g:310:1: ternaryExpr : logicOrExpr ( QUES expr COLON logicOrExpr )* ;
    public final HaxeParser.ternaryExpr_return ternaryExpr() throws RecognitionException {
        HaxeParser.ternaryExpr_return retval = new HaxeParser.ternaryExpr_return();
        retval.start = input.LT(1);
        int ternaryExpr_StartIndex = input.index();
        Object root_0 = null;

        Token QUES199=null;
        Token COLON201=null;
        HaxeParser.logicOrExpr_return logicOrExpr198 = null;

        HaxeParser.expr_return expr200 = null;

        HaxeParser.logicOrExpr_return logicOrExpr202 = null;


        Object QUES199_tree=null;
        Object COLON201_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 45) ) { return retval; }
            // Haxe.g:311:5: ( logicOrExpr ( QUES expr COLON logicOrExpr )* )
            // Haxe.g:311:10: logicOrExpr ( QUES expr COLON logicOrExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_logicOrExpr_in_ternaryExpr2642);
            logicOrExpr198=logicOrExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, logicOrExpr198.getTree());
            // Haxe.g:311:22: ( QUES expr COLON logicOrExpr )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==QUES) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // Haxe.g:311:23: QUES expr COLON logicOrExpr
            	    {
            	    QUES199=(Token)match(input,QUES,FOLLOW_QUES_in_ternaryExpr2645); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    QUES199_tree = (Object)adaptor.create(QUES199);
            	    root_0 = (Object)adaptor.becomeRoot(QUES199_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_expr_in_ternaryExpr2648);
            	    expr200=expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr200.getTree());
            	    COLON201=(Token)match(input,COLON,FOLLOW_COLON_in_ternaryExpr2650); if (state.failed) return retval;
            	    pushFollow(FOLLOW_logicOrExpr_in_ternaryExpr2653);
            	    logicOrExpr202=logicOrExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, logicOrExpr202.getTree());

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
    // Haxe.g:314:1: logicOrExpr : logicAndExpr ( BARBAR logicAndExpr )* ;
    public final HaxeParser.logicOrExpr_return logicOrExpr() throws RecognitionException {
        HaxeParser.logicOrExpr_return retval = new HaxeParser.logicOrExpr_return();
        retval.start = input.LT(1);
        int logicOrExpr_StartIndex = input.index();
        Object root_0 = null;

        Token BARBAR204=null;
        HaxeParser.logicAndExpr_return logicAndExpr203 = null;

        HaxeParser.logicAndExpr_return logicAndExpr205 = null;


        Object BARBAR204_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 46) ) { return retval; }
            // Haxe.g:315:5: ( logicAndExpr ( BARBAR logicAndExpr )* )
            // Haxe.g:315:10: logicAndExpr ( BARBAR logicAndExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_logicAndExpr_in_logicOrExpr2675);
            logicAndExpr203=logicAndExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, logicAndExpr203.getTree());
            // Haxe.g:315:23: ( BARBAR logicAndExpr )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==BARBAR) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // Haxe.g:315:24: BARBAR logicAndExpr
            	    {
            	    BARBAR204=(Token)match(input,BARBAR,FOLLOW_BARBAR_in_logicOrExpr2678); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    BARBAR204_tree = (Object)adaptor.create(BARBAR204);
            	    root_0 = (Object)adaptor.becomeRoot(BARBAR204_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_logicAndExpr_in_logicOrExpr2681);
            	    logicAndExpr205=logicAndExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, logicAndExpr205.getTree());

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
    // Haxe.g:318:1: logicAndExpr : ( cmpExpr ) ( AMPAMP cmpExpr )* ;
    public final HaxeParser.logicAndExpr_return logicAndExpr() throws RecognitionException {
        HaxeParser.logicAndExpr_return retval = new HaxeParser.logicAndExpr_return();
        retval.start = input.LT(1);
        int logicAndExpr_StartIndex = input.index();
        Object root_0 = null;

        Token AMPAMP207=null;
        HaxeParser.cmpExpr_return cmpExpr206 = null;

        HaxeParser.cmpExpr_return cmpExpr208 = null;


        Object AMPAMP207_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 47) ) { return retval; }
            // Haxe.g:319:5: ( ( cmpExpr ) ( AMPAMP cmpExpr )* )
            // Haxe.g:319:10: ( cmpExpr ) ( AMPAMP cmpExpr )*
            {
            root_0 = (Object)adaptor.nil();

            // Haxe.g:319:10: ( cmpExpr )
            // Haxe.g:319:11: cmpExpr
            {
            pushFollow(FOLLOW_cmpExpr_in_logicAndExpr2708);
            cmpExpr206=cmpExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, cmpExpr206.getTree());

            }

            // Haxe.g:319:20: ( AMPAMP cmpExpr )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==AMPAMP) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // Haxe.g:319:21: AMPAMP cmpExpr
            	    {
            	    AMPAMP207=(Token)match(input,AMPAMP,FOLLOW_AMPAMP_in_logicAndExpr2712); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    AMPAMP207_tree = (Object)adaptor.create(AMPAMP207);
            	    root_0 = (Object)adaptor.becomeRoot(AMPAMP207_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_cmpExpr_in_logicAndExpr2715);
            	    cmpExpr208=cmpExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, cmpExpr208.getTree());

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
    // Haxe.g:322:1: cmpExpr : ( bitExpr ) ( ( EQEQ | BANGEQ | GTEQ | LTEQ | GT | LT ) bitExpr )* ;
    public final HaxeParser.cmpExpr_return cmpExpr() throws RecognitionException {
        HaxeParser.cmpExpr_return retval = new HaxeParser.cmpExpr_return();
        retval.start = input.LT(1);
        int cmpExpr_StartIndex = input.index();
        Object root_0 = null;

        Token EQEQ210=null;
        Token BANGEQ211=null;
        Token GTEQ212=null;
        Token LTEQ213=null;
        Token GT214=null;
        Token LT215=null;
        HaxeParser.bitExpr_return bitExpr209 = null;

        HaxeParser.bitExpr_return bitExpr216 = null;


        Object EQEQ210_tree=null;
        Object BANGEQ211_tree=null;
        Object GTEQ212_tree=null;
        Object LTEQ213_tree=null;
        Object GT214_tree=null;
        Object LT215_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 48) ) { return retval; }
            // Haxe.g:322:9: ( ( bitExpr ) ( ( EQEQ | BANGEQ | GTEQ | LTEQ | GT | LT ) bitExpr )* )
            // Haxe.g:322:14: ( bitExpr ) ( ( EQEQ | BANGEQ | GTEQ | LTEQ | GT | LT ) bitExpr )*
            {
            root_0 = (Object)adaptor.nil();

            // Haxe.g:322:14: ( bitExpr )
            // Haxe.g:322:15: bitExpr
            {
            pushFollow(FOLLOW_bitExpr_in_cmpExpr2738);
            bitExpr209=bitExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bitExpr209.getTree());

            }

            // Haxe.g:322:24: ( ( EQEQ | BANGEQ | GTEQ | LTEQ | GT | LT ) bitExpr )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( ((LA50_0>=LT && LA50_0<=GT)||(LA50_0>=EQEQ && LA50_0<=LTEQ)) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // Haxe.g:322:25: ( EQEQ | BANGEQ | GTEQ | LTEQ | GT | LT ) bitExpr
            	    {
            	    // Haxe.g:322:25: ( EQEQ | BANGEQ | GTEQ | LTEQ | GT | LT )
            	    int alt49=6;
            	    switch ( input.LA(1) ) {
            	    case EQEQ:
            	        {
            	        alt49=1;
            	        }
            	        break;
            	    case BANGEQ:
            	        {
            	        alt49=2;
            	        }
            	        break;
            	    case GTEQ:
            	        {
            	        alt49=3;
            	        }
            	        break;
            	    case LTEQ:
            	        {
            	        alt49=4;
            	        }
            	        break;
            	    case GT:
            	        {
            	        alt49=5;
            	        }
            	        break;
            	    case LT:
            	        {
            	        alt49=6;
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
            	            // Haxe.g:322:26: EQEQ
            	            {
            	            EQEQ210=(Token)match(input,EQEQ,FOLLOW_EQEQ_in_cmpExpr2743); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            EQEQ210_tree = (Object)adaptor.create(EQEQ210);
            	            root_0 = (Object)adaptor.becomeRoot(EQEQ210_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // Haxe.g:322:33: BANGEQ
            	            {
            	            BANGEQ211=(Token)match(input,BANGEQ,FOLLOW_BANGEQ_in_cmpExpr2747); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            BANGEQ211_tree = (Object)adaptor.create(BANGEQ211);
            	            root_0 = (Object)adaptor.becomeRoot(BANGEQ211_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // Haxe.g:322:43: GTEQ
            	            {
            	            GTEQ212=(Token)match(input,GTEQ,FOLLOW_GTEQ_in_cmpExpr2752); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            GTEQ212_tree = (Object)adaptor.create(GTEQ212);
            	            root_0 = (Object)adaptor.becomeRoot(GTEQ212_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // Haxe.g:322:51: LTEQ
            	            {
            	            LTEQ213=(Token)match(input,LTEQ,FOLLOW_LTEQ_in_cmpExpr2757); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            LTEQ213_tree = (Object)adaptor.create(LTEQ213);
            	            root_0 = (Object)adaptor.becomeRoot(LTEQ213_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 5 :
            	            // Haxe.g:322:59: GT
            	            {
            	            GT214=(Token)match(input,GT,FOLLOW_GT_in_cmpExpr2762); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            GT214_tree = (Object)adaptor.create(GT214);
            	            root_0 = (Object)adaptor.becomeRoot(GT214_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 6 :
            	            // Haxe.g:322:65: LT
            	            {
            	            LT215=(Token)match(input,LT,FOLLOW_LT_in_cmpExpr2767); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            LT215_tree = (Object)adaptor.create(LT215);
            	            root_0 = (Object)adaptor.becomeRoot(LT215_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_bitExpr_in_cmpExpr2772);
            	    bitExpr216=bitExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, bitExpr216.getTree());

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
    // Haxe.g:325:1: bitExpr : ( shiftExpr ) ( BAR shiftExpr | AMP shiftExpr | CARET shiftExpr )* ;
    public final HaxeParser.bitExpr_return bitExpr() throws RecognitionException {
        HaxeParser.bitExpr_return retval = new HaxeParser.bitExpr_return();
        retval.start = input.LT(1);
        int bitExpr_StartIndex = input.index();
        Object root_0 = null;

        Token BAR218=null;
        Token AMP220=null;
        Token CARET222=null;
        HaxeParser.shiftExpr_return shiftExpr217 = null;

        HaxeParser.shiftExpr_return shiftExpr219 = null;

        HaxeParser.shiftExpr_return shiftExpr221 = null;

        HaxeParser.shiftExpr_return shiftExpr223 = null;


        Object BAR218_tree=null;
        Object AMP220_tree=null;
        Object CARET222_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 49) ) { return retval; }
            // Haxe.g:325:9: ( ( shiftExpr ) ( BAR shiftExpr | AMP shiftExpr | CARET shiftExpr )* )
            // Haxe.g:325:14: ( shiftExpr ) ( BAR shiftExpr | AMP shiftExpr | CARET shiftExpr )*
            {
            root_0 = (Object)adaptor.nil();

            // Haxe.g:325:14: ( shiftExpr )
            // Haxe.g:325:15: shiftExpr
            {
            pushFollow(FOLLOW_shiftExpr_in_bitExpr2795);
            shiftExpr217=shiftExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, shiftExpr217.getTree());

            }

            // Haxe.g:325:26: ( BAR shiftExpr | AMP shiftExpr | CARET shiftExpr )*
            loop51:
            do {
                int alt51=4;
                switch ( input.LA(1) ) {
                case BAR:
                    {
                    alt51=1;
                    }
                    break;
                case AMP:
                    {
                    alt51=2;
                    }
                    break;
                case CARET:
                    {
                    alt51=3;
                    }
                    break;

                }

                switch (alt51) {
            	case 1 :
            	    // Haxe.g:325:27: BAR shiftExpr
            	    {
            	    BAR218=(Token)match(input,BAR,FOLLOW_BAR_in_bitExpr2799); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    BAR218_tree = (Object)adaptor.create(BAR218);
            	    root_0 = (Object)adaptor.becomeRoot(BAR218_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_shiftExpr_in_bitExpr2802);
            	    shiftExpr219=shiftExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, shiftExpr219.getTree());

            	    }
            	    break;
            	case 2 :
            	    // Haxe.g:325:44: AMP shiftExpr
            	    {
            	    AMP220=(Token)match(input,AMP,FOLLOW_AMP_in_bitExpr2806); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    AMP220_tree = (Object)adaptor.create(AMP220);
            	    root_0 = (Object)adaptor.becomeRoot(AMP220_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_shiftExpr_in_bitExpr2809);
            	    shiftExpr221=shiftExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, shiftExpr221.getTree());

            	    }
            	    break;
            	case 3 :
            	    // Haxe.g:325:60: CARET shiftExpr
            	    {
            	    CARET222=(Token)match(input,CARET,FOLLOW_CARET_in_bitExpr2812); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    CARET222_tree = (Object)adaptor.create(CARET222);
            	    root_0 = (Object)adaptor.becomeRoot(CARET222_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_shiftExpr_in_bitExpr2815);
            	    shiftExpr223=shiftExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, shiftExpr223.getTree());

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
    // Haxe.g:328:1: shiftExpr : ( addExpr ) ( LTLT addExpr | ( GT GT ) addExpr | GTGTGT addExpr )* ;
    public final HaxeParser.shiftExpr_return shiftExpr() throws RecognitionException {
        HaxeParser.shiftExpr_return retval = new HaxeParser.shiftExpr_return();
        retval.start = input.LT(1);
        int shiftExpr_StartIndex = input.index();
        Object root_0 = null;

        Token LTLT225=null;
        Token GT227=null;
        Token GT228=null;
        Token GTGTGT230=null;
        HaxeParser.addExpr_return addExpr224 = null;

        HaxeParser.addExpr_return addExpr226 = null;

        HaxeParser.addExpr_return addExpr229 = null;

        HaxeParser.addExpr_return addExpr231 = null;


        Object LTLT225_tree=null;
        Object GT227_tree=null;
        Object GT228_tree=null;
        Object GTGTGT230_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 50) ) { return retval; }
            // Haxe.g:329:5: ( ( addExpr ) ( LTLT addExpr | ( GT GT ) addExpr | GTGTGT addExpr )* )
            // Haxe.g:329:10: ( addExpr ) ( LTLT addExpr | ( GT GT ) addExpr | GTGTGT addExpr )*
            {
            root_0 = (Object)adaptor.nil();

            // Haxe.g:329:10: ( addExpr )
            // Haxe.g:329:11: addExpr
            {
            pushFollow(FOLLOW_addExpr_in_shiftExpr2842);
            addExpr224=addExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, addExpr224.getTree());

            }

            // Haxe.g:329:20: ( LTLT addExpr | ( GT GT ) addExpr | GTGTGT addExpr )*
            loop52:
            do {
                int alt52=4;
                switch ( input.LA(1) ) {
                case GT:
                    {
                    int LA52_2 = input.LA(2);

                    if ( (LA52_2==GT) ) {
                        alt52=2;
                    }


                    }
                    break;
                case LTLT:
                    {
                    alt52=1;
                    }
                    break;
                case GTGTGT:
                    {
                    alt52=3;
                    }
                    break;

                }

                switch (alt52) {
            	case 1 :
            	    // Haxe.g:329:21: LTLT addExpr
            	    {
            	    LTLT225=(Token)match(input,LTLT,FOLLOW_LTLT_in_shiftExpr2846); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    LTLT225_tree = (Object)adaptor.create(LTLT225);
            	    root_0 = (Object)adaptor.becomeRoot(LTLT225_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_addExpr_in_shiftExpr2850);
            	    addExpr226=addExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, addExpr226.getTree());

            	    }
            	    break;
            	case 2 :
            	    // Haxe.g:329:38: ( GT GT ) addExpr
            	    {
            	    // Haxe.g:329:38: ( GT GT )
            	    // Haxe.g:329:39: GT GT
            	    {
            	    GT227=(Token)match(input,GT,FOLLOW_GT_in_shiftExpr2855); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    GT227_tree = (Object)adaptor.create(GT227);
            	    adaptor.addChild(root_0, GT227_tree);
            	    }
            	    GT228=(Token)match(input,GT,FOLLOW_GT_in_shiftExpr2857); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    GT228_tree = (Object)adaptor.create(GT228);
            	    adaptor.addChild(root_0, GT228_tree);
            	    }

            	    }

            	    pushFollow(FOLLOW_addExpr_in_shiftExpr2862);
            	    addExpr229=addExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, addExpr229.getTree());

            	    }
            	    break;
            	case 3 :
            	    // Haxe.g:329:58: GTGTGT addExpr
            	    {
            	    GTGTGT230=(Token)match(input,GTGTGT,FOLLOW_GTGTGT_in_shiftExpr2866); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    GTGTGT230_tree = (Object)adaptor.create(GTGTGT230);
            	    root_0 = (Object)adaptor.becomeRoot(GTGTGT230_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_addExpr_in_shiftExpr2869);
            	    addExpr231=addExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, addExpr231.getTree());

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
    // Haxe.g:332:1: addExpr : ( multExpr ) ( ( PLUS | SUB ) multExpr )* ;
    public final HaxeParser.addExpr_return addExpr() throws RecognitionException {
        HaxeParser.addExpr_return retval = new HaxeParser.addExpr_return();
        retval.start = input.LT(1);
        int addExpr_StartIndex = input.index();
        Object root_0 = null;

        Token PLUS233=null;
        Token SUB234=null;
        HaxeParser.multExpr_return multExpr232 = null;

        HaxeParser.multExpr_return multExpr235 = null;


        Object PLUS233_tree=null;
        Object SUB234_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 51) ) { return retval; }
            // Haxe.g:332:9: ( ( multExpr ) ( ( PLUS | SUB ) multExpr )* )
            // Haxe.g:332:15: ( multExpr ) ( ( PLUS | SUB ) multExpr )*
            {
            root_0 = (Object)adaptor.nil();

            // Haxe.g:332:15: ( multExpr )
            // Haxe.g:332:16: multExpr
            {
            pushFollow(FOLLOW_multExpr_in_addExpr2889);
            multExpr232=multExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, multExpr232.getTree());

            }

            // Haxe.g:332:26: ( ( PLUS | SUB ) multExpr )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( ((LA54_0>=PLUS && LA54_0<=SUB)) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // Haxe.g:332:27: ( PLUS | SUB ) multExpr
            	    {
            	    // Haxe.g:332:27: ( PLUS | SUB )
            	    int alt53=2;
            	    int LA53_0 = input.LA(1);

            	    if ( (LA53_0==PLUS) ) {
            	        alt53=1;
            	    }
            	    else if ( (LA53_0==SUB) ) {
            	        alt53=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 53, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt53) {
            	        case 1 :
            	            // Haxe.g:332:28: PLUS
            	            {
            	            PLUS233=(Token)match(input,PLUS,FOLLOW_PLUS_in_addExpr2894); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            PLUS233_tree = (Object)adaptor.create(PLUS233);
            	            root_0 = (Object)adaptor.becomeRoot(PLUS233_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // Haxe.g:332:36: SUB
            	            {
            	            SUB234=(Token)match(input,SUB,FOLLOW_SUB_in_addExpr2899); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            SUB234_tree = (Object)adaptor.create(SUB234);
            	            root_0 = (Object)adaptor.becomeRoot(SUB234_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_multExpr_in_addExpr2903);
            	    multExpr235=multExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, multExpr235.getTree());

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
    // Haxe.g:335:1: multExpr : ( prefixExpr ) ( ( STAR | SLASH | PERCENT ) prefixExpr )* ;
    public final HaxeParser.multExpr_return multExpr() throws RecognitionException {
        HaxeParser.multExpr_return retval = new HaxeParser.multExpr_return();
        retval.start = input.LT(1);
        int multExpr_StartIndex = input.index();
        Object root_0 = null;

        Token STAR237=null;
        Token SLASH238=null;
        Token PERCENT239=null;
        HaxeParser.prefixExpr_return prefixExpr236 = null;

        HaxeParser.prefixExpr_return prefixExpr240 = null;


        Object STAR237_tree=null;
        Object SLASH238_tree=null;
        Object PERCENT239_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 52) ) { return retval; }
            // Haxe.g:335:9: ( ( prefixExpr ) ( ( STAR | SLASH | PERCENT ) prefixExpr )* )
            // Haxe.g:335:14: ( prefixExpr ) ( ( STAR | SLASH | PERCENT ) prefixExpr )*
            {
            root_0 = (Object)adaptor.nil();

            // Haxe.g:335:14: ( prefixExpr )
            // Haxe.g:335:15: prefixExpr
            {
            pushFollow(FOLLOW_prefixExpr_in_multExpr2930);
            prefixExpr236=prefixExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, prefixExpr236.getTree());

            }

            // Haxe.g:335:27: ( ( STAR | SLASH | PERCENT ) prefixExpr )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( ((LA56_0>=STAR && LA56_0<=PERCENT)) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // Haxe.g:335:28: ( STAR | SLASH | PERCENT ) prefixExpr
            	    {
            	    // Haxe.g:335:28: ( STAR | SLASH | PERCENT )
            	    int alt55=3;
            	    switch ( input.LA(1) ) {
            	    case STAR:
            	        {
            	        alt55=1;
            	        }
            	        break;
            	    case SLASH:
            	        {
            	        alt55=2;
            	        }
            	        break;
            	    case PERCENT:
            	        {
            	        alt55=3;
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
            	            // Haxe.g:335:29: STAR
            	            {
            	            STAR237=(Token)match(input,STAR,FOLLOW_STAR_in_multExpr2935); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            STAR237_tree = (Object)adaptor.create(STAR237);
            	            root_0 = (Object)adaptor.becomeRoot(STAR237_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // Haxe.g:335:35: SLASH
            	            {
            	            SLASH238=(Token)match(input,SLASH,FOLLOW_SLASH_in_multExpr2938); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            SLASH238_tree = (Object)adaptor.create(SLASH238);
            	            root_0 = (Object)adaptor.becomeRoot(SLASH238_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // Haxe.g:335:42: PERCENT
            	            {
            	            PERCENT239=(Token)match(input,PERCENT,FOLLOW_PERCENT_in_multExpr2941); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            PERCENT239_tree = (Object)adaptor.create(PERCENT239);
            	            root_0 = (Object)adaptor.becomeRoot(PERCENT239_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_prefixExpr_in_multExpr2945);
            	    prefixExpr240=prefixExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, prefixExpr240.getTree());

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
    // Haxe.g:338:1: prefixExpr : ( ( SUB | SUBSUB | PLUS | PLUSPLUS | BANG | TILDE ) prefixExpr | newExpr | cast | suffixExpr );
    public final HaxeParser.prefixExpr_return prefixExpr() throws RecognitionException {
        HaxeParser.prefixExpr_return retval = new HaxeParser.prefixExpr_return();
        retval.start = input.LT(1);
        int prefixExpr_StartIndex = input.index();
        Object root_0 = null;

        Token set241=null;
        HaxeParser.prefixExpr_return prefixExpr242 = null;

        HaxeParser.newExpr_return newExpr243 = null;

        HaxeParser.cast_return cast244 = null;

        HaxeParser.suffixExpr_return suffixExpr245 = null;


        Object set241_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 53) ) { return retval; }
            // Haxe.g:339:5: ( ( SUB | SUBSUB | PLUS | PLUSPLUS | BANG | TILDE ) prefixExpr | newExpr | cast | suffixExpr )
            int alt57=4;
            switch ( input.LA(1) ) {
            case PLUS:
            case SUB:
            case SUBSUB:
            case PLUSPLUS:
            case BANG:
            case TILDE:
                {
                alt57=1;
                }
                break;
            case NEW:
                {
                alt57=2;
                }
                break;
            case CAST:
                {
                alt57=3;
                }
                break;
            case LPAREN:
            case IDENTIFIER:
            case THIS:
            case FUNCTION:
            case LBRACKET:
            case LBRACE:
            case NULL:
            case LONGLITERAL:
            case INTLITERAL:
            case STRINGLITERAL:
            case CHARLITERAL:
            case FLOATNUM:
            case TRUE:
            case FALSE:
                {
                alt57=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }

            switch (alt57) {
                case 1 :
                    // Haxe.g:339:10: ( SUB | SUBSUB | PLUS | PLUSPLUS | BANG | TILDE ) prefixExpr
                    {
                    root_0 = (Object)adaptor.nil();

                    set241=(Token)input.LT(1);
                    set241=(Token)input.LT(1);
                    if ( (input.LA(1)>=PLUS && input.LA(1)<=SUB)||(input.LA(1)>=SUBSUB && input.LA(1)<=TILDE) ) {
                        input.consume();
                        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set241), root_0);
                        state.errorRecovery=false;state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_prefixExpr_in_prefixExpr2990);
                    prefixExpr242=prefixExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, prefixExpr242.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:340:10: newExpr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_newExpr_in_prefixExpr3001);
                    newExpr243=newExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, newExpr243.getTree());

                    }
                    break;
                case 3 :
                    // Haxe.g:341:10: cast
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_cast_in_prefixExpr3012);
                    cast244=cast();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, cast244.getTree());

                    }
                    break;
                case 4 :
                    // Haxe.g:342:10: suffixExpr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_suffixExpr_in_prefixExpr3023);
                    suffixExpr245=suffixExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, suffixExpr245.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // Haxe.g:345:1: suffixExpr : ( value methodCallOrSliceList -> ^( SUFFIX_EXPR[\"CallOrSlice\",true] ( value )? ( methodCallOrSliceList )? ) | value PLUSPLUS -> ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] ( value )? ( PLUSPLUS )? ) | value SUBSUB -> ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] ( value )? SUBSUB ) | value typeParamOpt );
    public final HaxeParser.suffixExpr_return suffixExpr() throws RecognitionException {
        HaxeParser.suffixExpr_return retval = new HaxeParser.suffixExpr_return();
        retval.start = input.LT(1);
        int suffixExpr_StartIndex = input.index();
        Object root_0 = null;

        Token PLUSPLUS249=null;
        Token SUBSUB251=null;
        HaxeParser.value_return value246 = null;

        HaxeParser.methodCallOrSliceList_return methodCallOrSliceList247 = null;

        HaxeParser.value_return value248 = null;

        HaxeParser.value_return value250 = null;

        HaxeParser.value_return value252 = null;

        HaxeParser.typeParamOpt_return typeParamOpt253 = null;


        Object PLUSPLUS249_tree=null;
        Object SUBSUB251_tree=null;
        RewriteRuleTokenStream stream_SUBSUB=new RewriteRuleTokenStream(adaptor,"token SUBSUB");
        RewriteRuleTokenStream stream_PLUSPLUS=new RewriteRuleTokenStream(adaptor,"token PLUSPLUS");
        RewriteRuleSubtreeStream stream_methodCallOrSliceList=new RewriteRuleSubtreeStream(adaptor,"rule methodCallOrSliceList");
        RewriteRuleSubtreeStream stream_value=new RewriteRuleSubtreeStream(adaptor,"rule value");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 54) ) { return retval; }
            // Haxe.g:346:5: ( value methodCallOrSliceList -> ^( SUFFIX_EXPR[\"CallOrSlice\",true] ( value )? ( methodCallOrSliceList )? ) | value PLUSPLUS -> ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] ( value )? ( PLUSPLUS )? ) | value SUBSUB -> ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] ( value )? SUBSUB ) | value typeParamOpt )
            int alt58=4;
            alt58 = dfa58.predict(input);
            switch (alt58) {
                case 1 :
                    // Haxe.g:346:10: value methodCallOrSliceList
                    {
                    pushFollow(FOLLOW_value_in_suffixExpr3047);
                    value246=value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_value.add(value246.getTree());
                    pushFollow(FOLLOW_methodCallOrSliceList_in_suffixExpr3049);
                    methodCallOrSliceList247=methodCallOrSliceList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_methodCallOrSliceList.add(methodCallOrSliceList247.getTree());


                    // AST REWRITE
                    // elements: methodCallOrSliceList, value
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 346:38: -> ^( SUFFIX_EXPR[\"CallOrSlice\",true] ( value )? ( methodCallOrSliceList )? )
                    {
                        // Haxe.g:346:41: ^( SUFFIX_EXPR[\"CallOrSlice\",true] ( value )? ( methodCallOrSliceList )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new HaxeTree(SUFFIX_EXPR, "CallOrSlice", true), root_1);

                        // Haxe.g:346:85: ( value )?
                        if ( stream_value.hasNext() ) {
                            adaptor.addChild(root_1, stream_value.nextTree());

                        }
                        stream_value.reset();
                        // Haxe.g:346:92: ( methodCallOrSliceList )?
                        if ( stream_methodCallOrSliceList.hasNext() ) {
                            adaptor.addChild(root_1, stream_methodCallOrSliceList.nextTree());

                        }
                        stream_methodCallOrSliceList.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // Haxe.g:347:10: value PLUSPLUS
                    {
                    pushFollow(FOLLOW_value_in_suffixExpr3076);
                    value248=value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_value.add(value248.getTree());
                    PLUSPLUS249=(Token)match(input,PLUSPLUS,FOLLOW_PLUSPLUS_in_suffixExpr3078); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PLUSPLUS.add(PLUSPLUS249);



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
                    // 347:37: -> ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] ( value )? ( PLUSPLUS )? )
                    {
                        // Haxe.g:347:40: ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] ( value )? ( PLUSPLUS )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new HaxeTree(SUFFIX_EXPR, "SUFFIX_EXPR", true), root_1);

                        // Haxe.g:347:84: ( value )?
                        if ( stream_value.hasNext() ) {
                            adaptor.addChild(root_1, stream_value.nextTree());

                        }
                        stream_value.reset();
                        // Haxe.g:347:91: ( PLUSPLUS )?
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
                    // Haxe.g:348:10: value SUBSUB
                    {
                    pushFollow(FOLLOW_value_in_suffixExpr3117);
                    value250=value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_value.add(value250.getTree());
                    SUBSUB251=(Token)match(input,SUBSUB,FOLLOW_SUBSUB_in_suffixExpr3119); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SUBSUB.add(SUBSUB251);



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
                    // 348:35: -> ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] ( value )? SUBSUB )
                    {
                        // Haxe.g:348:38: ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] ( value )? SUBSUB )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new HaxeTree(SUFFIX_EXPR, "SUFFIX_EXPR", true), root_1);

                        // Haxe.g:348:82: ( value )?
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
                case 4 :
                    // Haxe.g:349:10: value typeParamOpt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_value_in_suffixExpr3157);
                    value252=value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, value252.getTree());
                    pushFollow(FOLLOW_typeParamOpt_in_suffixExpr3159);
                    typeParamOpt253=typeParamOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeParamOpt253.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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

    public static class methodCallOrSlice_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "methodCallOrSlice"
    // Haxe.g:352:1: methodCallOrSlice : ( LPAREN exprListOpt RPAREN -> ^( SUFFIX_EXPR[\"MethodCall\",true] ( exprListOpt )? ) | LBRACKET expr RBRACKET -> ^( SUFFIX_EXPR[\"Slice\",true] ( expr )? ) );
    public final HaxeParser.methodCallOrSlice_return methodCallOrSlice() throws RecognitionException {
        HaxeParser.methodCallOrSlice_return retval = new HaxeParser.methodCallOrSlice_return();
        retval.start = input.LT(1);
        int methodCallOrSlice_StartIndex = input.index();
        Object root_0 = null;

        Token LPAREN254=null;
        Token RPAREN256=null;
        Token LBRACKET257=null;
        Token RBRACKET259=null;
        HaxeParser.exprListOpt_return exprListOpt255 = null;

        HaxeParser.expr_return expr258 = null;


        Object LPAREN254_tree=null;
        Object RPAREN256_tree=null;
        Object LBRACKET257_tree=null;
        Object RBRACKET259_tree=null;
        RewriteRuleTokenStream stream_LBRACKET=new RewriteRuleTokenStream(adaptor,"token LBRACKET");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_RBRACKET=new RewriteRuleTokenStream(adaptor,"token RBRACKET");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_exprListOpt=new RewriteRuleSubtreeStream(adaptor,"rule exprListOpt");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 55) ) { return retval; }
            // Haxe.g:353:5: ( LPAREN exprListOpt RPAREN -> ^( SUFFIX_EXPR[\"MethodCall\",true] ( exprListOpt )? ) | LBRACKET expr RBRACKET -> ^( SUFFIX_EXPR[\"Slice\",true] ( expr )? ) )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==LPAREN) ) {
                alt59=1;
            }
            else if ( (LA59_0==LBRACKET) ) {
                alt59=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }
            switch (alt59) {
                case 1 :
                    // Haxe.g:353:10: LPAREN exprListOpt RPAREN
                    {
                    LPAREN254=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_methodCallOrSlice3179); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN254);

                    pushFollow(FOLLOW_exprListOpt_in_methodCallOrSlice3181);
                    exprListOpt255=exprListOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_exprListOpt.add(exprListOpt255.getTree());
                    RPAREN256=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_methodCallOrSlice3183); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN256);



                    // AST REWRITE
                    // elements: exprListOpt
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 353:36: -> ^( SUFFIX_EXPR[\"MethodCall\",true] ( exprListOpt )? )
                    {
                        // Haxe.g:353:39: ^( SUFFIX_EXPR[\"MethodCall\",true] ( exprListOpt )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new HaxeTree(SUFFIX_EXPR, "MethodCall", true), root_1);

                        // Haxe.g:353:82: ( exprListOpt )?
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
                    // Haxe.g:354:10: LBRACKET expr RBRACKET
                    {
                    LBRACKET257=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_methodCallOrSlice3207); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LBRACKET.add(LBRACKET257);

                    pushFollow(FOLLOW_expr_in_methodCallOrSlice3209);
                    expr258=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr258.getTree());
                    RBRACKET259=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_methodCallOrSlice3211); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RBRACKET.add(RBRACKET259);



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
                    // 354:33: -> ^( SUFFIX_EXPR[\"Slice\",true] ( expr )? )
                    {
                        // Haxe.g:354:36: ^( SUFFIX_EXPR[\"Slice\",true] ( expr )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new HaxeTree(SUFFIX_EXPR, "Slice", true), root_1);

                        // Haxe.g:354:74: ( expr )?
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
            if ( state.backtracking>0 ) { memoize(input, 55, methodCallOrSlice_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "methodCallOrSlice"

    public static class methodCallOrSliceList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "methodCallOrSliceList"
    // Haxe.g:357:1: methodCallOrSliceList : ( methodCallOrSlice methodCallOrSliceList | methodCallOrSlice );
    public final HaxeParser.methodCallOrSliceList_return methodCallOrSliceList() throws RecognitionException {
        HaxeParser.methodCallOrSliceList_return retval = new HaxeParser.methodCallOrSliceList_return();
        retval.start = input.LT(1);
        int methodCallOrSliceList_StartIndex = input.index();
        Object root_0 = null;

        HaxeParser.methodCallOrSlice_return methodCallOrSlice260 = null;

        HaxeParser.methodCallOrSliceList_return methodCallOrSliceList261 = null;

        HaxeParser.methodCallOrSlice_return methodCallOrSlice262 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 56) ) { return retval; }
            // Haxe.g:358:5: ( methodCallOrSlice methodCallOrSliceList | methodCallOrSlice )
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==LPAREN) ) {
                int LA60_1 = input.LA(2);

                if ( (synpred110_Haxe()) ) {
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
            else if ( (LA60_0==LBRACKET) ) {
                int LA60_2 = input.LA(2);

                if ( (synpred110_Haxe()) ) {
                    alt60=1;
                }
                else if ( (true) ) {
                    alt60=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 60, 2, input);

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
                    // Haxe.g:358:10: methodCallOrSlice methodCallOrSliceList
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_methodCallOrSlice_in_methodCallOrSliceList3244);
                    methodCallOrSlice260=methodCallOrSlice();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, methodCallOrSlice260.getTree());
                    pushFollow(FOLLOW_methodCallOrSliceList_in_methodCallOrSliceList3246);
                    methodCallOrSliceList261=methodCallOrSliceList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, methodCallOrSliceList261.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:359:10: methodCallOrSlice
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_methodCallOrSlice_in_methodCallOrSliceList3257);
                    methodCallOrSlice262=methodCallOrSlice();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, methodCallOrSlice262.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 56, methodCallOrSliceList_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "methodCallOrSliceList"

    public static class value_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "value"
    // Haxe.g:362:1: value : ( funcLit | arrayLit | objLit | elementarySymbol | LPAREN ( expr | statement ) RPAREN | dotIdent );
    public final HaxeParser.value_return value() throws RecognitionException {
        HaxeParser.value_return retval = new HaxeParser.value_return();
        retval.start = input.LT(1);
        int value_StartIndex = input.index();
        Object root_0 = null;

        Token LPAREN267=null;
        Token RPAREN270=null;
        HaxeParser.funcLit_return funcLit263 = null;

        HaxeParser.arrayLit_return arrayLit264 = null;

        HaxeParser.objLit_return objLit265 = null;

        HaxeParser.elementarySymbol_return elementarySymbol266 = null;

        HaxeParser.expr_return expr268 = null;

        HaxeParser.statement_return statement269 = null;

        HaxeParser.dotIdent_return dotIdent271 = null;


        Object LPAREN267_tree=null;
        Object RPAREN270_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 57) ) { return retval; }
            // Haxe.g:363:5: ( funcLit | arrayLit | objLit | elementarySymbol | LPAREN ( expr | statement ) RPAREN | dotIdent )
            int alt62=6;
            switch ( input.LA(1) ) {
            case FUNCTION:
                {
                alt62=1;
                }
                break;
            case LBRACKET:
                {
                alt62=2;
                }
                break;
            case LBRACE:
                {
                alt62=3;
                }
                break;
            case NULL:
            case LONGLITERAL:
            case INTLITERAL:
            case STRINGLITERAL:
            case CHARLITERAL:
            case FLOATNUM:
            case TRUE:
            case FALSE:
                {
                alt62=4;
                }
                break;
            case LPAREN:
                {
                alt62=5;
                }
                break;
            case IDENTIFIER:
            case THIS:
                {
                alt62=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }

            switch (alt62) {
                case 1 :
                    // Haxe.g:363:9: funcLit
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_funcLit_in_value3276);
                    funcLit263=funcLit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, funcLit263.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:364:9: arrayLit
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_arrayLit_in_value3287);
                    arrayLit264=arrayLit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arrayLit264.getTree());

                    }
                    break;
                case 3 :
                    // Haxe.g:365:9: objLit
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_objLit_in_value3297);
                    objLit265=objLit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, objLit265.getTree());

                    }
                    break;
                case 4 :
                    // Haxe.g:366:9: elementarySymbol
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_elementarySymbol_in_value3307);
                    elementarySymbol266=elementarySymbol();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, elementarySymbol266.getTree());

                    }
                    break;
                case 5 :
                    // Haxe.g:367:9: LPAREN ( expr | statement ) RPAREN
                    {
                    root_0 = (Object)adaptor.nil();

                    LPAREN267=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_value3317); if (state.failed) return retval;
                    // Haxe.g:367:17: ( expr | statement )
                    int alt61=2;
                    alt61 = dfa61.predict(input);
                    switch (alt61) {
                        case 1 :
                            // Haxe.g:367:18: expr
                            {
                            pushFollow(FOLLOW_expr_in_value3321);
                            expr268=expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr268.getTree());

                            }
                            break;
                        case 2 :
                            // Haxe.g:367:23: statement
                            {
                            pushFollow(FOLLOW_statement_in_value3323);
                            statement269=statement();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, statement269.getTree());

                            }
                            break;

                    }

                    RPAREN270=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_value3326); if (state.failed) return retval;

                    }
                    break;
                case 6 :
                    // Haxe.g:368:9: dotIdent
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_dotIdent_in_value3337);
                    dotIdent271=dotIdent();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dotIdent271.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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

    public static class newExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "newExpr"
    // Haxe.g:371:1: newExpr : NEW type LPAREN exprListOpt RPAREN -> ^( NEW ( type )? ( exprListOpt )? ) ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 58) ) { return retval; }
            // Haxe.g:372:5: ( NEW type LPAREN exprListOpt RPAREN -> ^( NEW ( type )? ( exprListOpt )? ) )
            // Haxe.g:372:9: NEW type LPAREN exprListOpt RPAREN
            {
            NEW272=(Token)match(input,NEW,FOLLOW_NEW_in_newExpr3367); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_NEW.add(NEW272);

            pushFollow(FOLLOW_type_in_newExpr3369);
            type273=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(type273.getTree());
            LPAREN274=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_newExpr3371); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN274);

            pushFollow(FOLLOW_exprListOpt_in_newExpr3373);
            exprListOpt275=exprListOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_exprListOpt.add(exprListOpt275.getTree());
            RPAREN276=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_newExpr3375); if (state.failed) return retval; 
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
            // 372:44: -> ^( NEW ( type )? ( exprListOpt )? )
            {
                // Haxe.g:372:47: ^( NEW ( type )? ( exprListOpt )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_NEW.nextNode(), root_1);

                // Haxe.g:372:53: ( type )?
                if ( stream_type.hasNext() ) {
                    adaptor.addChild(root_1, stream_type.nextTree());

                }
                stream_type.reset();
                // Haxe.g:372:59: ( exprListOpt )?
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

    public static class cast_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "cast"
    // Haxe.g:375:1: cast : ( CAST LPAREN expr ( COMMA funcType )? RPAREN -> ^( CAST ( expr )? ( funcType )? ) | CAST LPAREN expr RPAREN -> ^( CAST ( expr )? ) );
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 59) ) { return retval; }
            // Haxe.g:375:9: ( CAST LPAREN expr ( COMMA funcType )? RPAREN -> ^( CAST ( expr )? ( funcType )? ) | CAST LPAREN expr RPAREN -> ^( CAST ( expr )? ) )
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==CAST) ) {
                int LA64_1 = input.LA(2);

                if ( (synpred118_Haxe()) ) {
                    alt64=1;
                }
                else if ( (true) ) {
                    alt64=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 64, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }
            switch (alt64) {
                case 1 :
                    // Haxe.g:375:13: CAST LPAREN expr ( COMMA funcType )? RPAREN
                    {
                    CAST277=(Token)match(input,CAST,FOLLOW_CAST_in_cast3405); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CAST.add(CAST277);

                    LPAREN278=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_cast3407); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN278);

                    pushFollow(FOLLOW_expr_in_cast3409);
                    expr279=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr279.getTree());
                    // Haxe.g:375:30: ( COMMA funcType )?
                    int alt63=2;
                    int LA63_0 = input.LA(1);

                    if ( (LA63_0==COMMA) ) {
                        alt63=1;
                    }
                    switch (alt63) {
                        case 1 :
                            // Haxe.g:375:31: COMMA funcType
                            {
                            COMMA280=(Token)match(input,COMMA,FOLLOW_COMMA_in_cast3412); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_COMMA.add(COMMA280);

                            pushFollow(FOLLOW_funcType_in_cast3414);
                            funcType281=funcType();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_funcType.add(funcType281.getTree());

                            }
                            break;

                    }

                    RPAREN282=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_cast3418); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN282);



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
                    // 375:57: -> ^( CAST ( expr )? ( funcType )? )
                    {
                        // Haxe.g:375:60: ^( CAST ( expr )? ( funcType )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_CAST.nextNode(), root_1);

                        // Haxe.g:375:67: ( expr )?
                        if ( stream_expr.hasNext() ) {
                            adaptor.addChild(root_1, stream_expr.nextTree());

                        }
                        stream_expr.reset();
                        // Haxe.g:375:73: ( funcType )?
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
                    // Haxe.g:376:13: CAST LPAREN expr RPAREN
                    {
                    CAST283=(Token)match(input,CAST,FOLLOW_CAST_in_cast3446); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CAST.add(CAST283);

                    LPAREN284=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_cast3448); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN284);

                    pushFollow(FOLLOW_expr_in_cast3450);
                    expr285=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr285.getTree());
                    RPAREN286=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_cast3452); if (state.failed) return retval; 
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
                    // 376:57: -> ^( CAST ( expr )? )
                    {
                        // Haxe.g:376:60: ^( CAST ( expr )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_CAST.nextNode(), root_1);

                        // Haxe.g:376:67: ( expr )?
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
            if ( state.backtracking>0 ) { memoize(input, 59, cast_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "cast"

    public static class topLevelDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "topLevelDecl"
    // Haxe.g:382:1: topLevelDecl : ( classDecl | interfaceDecl | enumDecl | typedefDecl );
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 60) ) { return retval; }
            // Haxe.g:383:5: ( classDecl | interfaceDecl | enumDecl | typedefDecl )
            int alt65=4;
            switch ( input.LA(1) ) {
            case MONKEYS_AT:
                {
                int LA65_1 = input.LA(2);

                if ( (synpred119_Haxe()) ) {
                    alt65=1;
                }
                else if ( (synpred120_Haxe()) ) {
                    alt65=2;
                }
                else if ( (synpred121_Haxe()) ) {
                    alt65=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 65, 1, input);

                    throw nvae;
                }
                }
                break;
            case EXTERN:
            case PRIVATE:
                {
                int LA65_2 = input.LA(2);

                if ( (synpred119_Haxe()) ) {
                    alt65=1;
                }
                else if ( (synpred120_Haxe()) ) {
                    alt65=2;
                }
                else if ( (synpred121_Haxe()) ) {
                    alt65=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 65, 2, input);

                    throw nvae;
                }
                }
                break;
            case CLASS:
                {
                alt65=1;
                }
                break;
            case INTERFACE:
                {
                alt65=2;
                }
                break;
            case ENUM:
                {
                alt65=3;
                }
                break;
            case TYPEDEF:
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
                    // Haxe.g:383:9: classDecl
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_classDecl_in_topLevelDecl3517);
                    classDecl287=classDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, classDecl287.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:384:9: interfaceDecl
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_interfaceDecl_in_topLevelDecl3527);
                    interfaceDecl288=interfaceDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceDecl288.getTree());

                    }
                    break;
                case 3 :
                    // Haxe.g:385:9: enumDecl
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_enumDecl_in_topLevelDecl3537);
                    enumDecl289=enumDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, enumDecl289.getTree());

                    }
                    break;
                case 4 :
                    // Haxe.g:386:9: typedefDecl
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_typedefDecl_in_topLevelDecl3547);
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
            if ( state.backtracking>0 ) { memoize(input, 60, topLevelDecl_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "topLevelDecl"

    public static class enumDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "enumDecl"
    // Haxe.g:389:1: enumDecl : typeDeclFlags ENUM IDENTIFIER typeParamOpt enumBody -> ^( IDENTIFIER ( typeParamOpt )? ( enumBody )? ) ;
    public final HaxeParser.enumDecl_return enumDecl() throws RecognitionException {
        HaxeParser.enumDecl_return retval = new HaxeParser.enumDecl_return();
        retval.start = input.LT(1);
        int enumDecl_StartIndex = input.index();
        Object root_0 = null;

        Token ENUM292=null;
        Token IDENTIFIER293=null;
        HaxeParser.typeDeclFlags_return typeDeclFlags291 = null;

        HaxeParser.typeParamOpt_return typeParamOpt294 = null;

        HaxeParser.enumBody_return enumBody295 = null;


        Object ENUM292_tree=null;
        Object IDENTIFIER293_tree=null;
        RewriteRuleTokenStream stream_ENUM=new RewriteRuleTokenStream(adaptor,"token ENUM");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleSubtreeStream stream_typeDeclFlags=new RewriteRuleSubtreeStream(adaptor,"rule typeDeclFlags");
        RewriteRuleSubtreeStream stream_enumBody=new RewriteRuleSubtreeStream(adaptor,"rule enumBody");
        RewriteRuleSubtreeStream stream_typeParamOpt=new RewriteRuleSubtreeStream(adaptor,"rule typeParamOpt");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 61) ) { return retval; }
            // Haxe.g:389:9: ( typeDeclFlags ENUM IDENTIFIER typeParamOpt enumBody -> ^( IDENTIFIER ( typeParamOpt )? ( enumBody )? ) )
            // Haxe.g:389:13: typeDeclFlags ENUM IDENTIFIER typeParamOpt enumBody
            {
            pushFollow(FOLLOW_typeDeclFlags_in_enumDecl3565);
            typeDeclFlags291=typeDeclFlags();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeDeclFlags.add(typeDeclFlags291.getTree());
            ENUM292=(Token)match(input,ENUM,FOLLOW_ENUM_in_enumDecl3567); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ENUM.add(ENUM292);

            IDENTIFIER293=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_enumDecl3569); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER293);

            pushFollow(FOLLOW_typeParamOpt_in_enumDecl3571);
            typeParamOpt294=typeParamOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeParamOpt.add(typeParamOpt294.getTree());
            pushFollow(FOLLOW_enumBody_in_enumDecl3573);
            enumBody295=enumBody();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_enumBody.add(enumBody295.getTree());


            // AST REWRITE
            // elements: typeParamOpt, enumBody, IDENTIFIER
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 389:65: -> ^( IDENTIFIER ( typeParamOpt )? ( enumBody )? )
            {
                // Haxe.g:389:68: ^( IDENTIFIER ( typeParamOpt )? ( enumBody )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new EnumNode(stream_IDENTIFIER.nextToken()), root_1);

                // Haxe.g:389:91: ( typeParamOpt )?
                if ( stream_typeParamOpt.hasNext() ) {
                    adaptor.addChild(root_1, stream_typeParamOpt.nextTree());

                }
                stream_typeParamOpt.reset();
                // Haxe.g:389:105: ( enumBody )?
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
            if ( state.backtracking>0 ) { memoize(input, 61, enumDecl_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "enumDecl"

    public static class enumBody_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "enumBody"
    // Haxe.g:392:1: enumBody : LBRACE ( enumValueDecl )* RBRACE -> ^( BLOCK_SCOPE[\"BLOCK_SCOPE\", true, $LBRACE] ( enumValueDecl )* RBRACE[$RBRACE, true] ) ;
    public final HaxeParser.enumBody_return enumBody() throws RecognitionException {
        HaxeParser.enumBody_return retval = new HaxeParser.enumBody_return();
        retval.start = input.LT(1);
        int enumBody_StartIndex = input.index();
        Object root_0 = null;

        Token LBRACE296=null;
        Token RBRACE298=null;
        HaxeParser.enumValueDecl_return enumValueDecl297 = null;


        Object LBRACE296_tree=null;
        Object RBRACE298_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_enumValueDecl=new RewriteRuleSubtreeStream(adaptor,"rule enumValueDecl");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 62) ) { return retval; }
            // Haxe.g:392:9: ( LBRACE ( enumValueDecl )* RBRACE -> ^( BLOCK_SCOPE[\"BLOCK_SCOPE\", true, $LBRACE] ( enumValueDecl )* RBRACE[$RBRACE, true] ) )
            // Haxe.g:392:13: LBRACE ( enumValueDecl )* RBRACE
            {
            LBRACE296=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_enumBody3606); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACE.add(LBRACE296);

            // Haxe.g:392:20: ( enumValueDecl )*
            loop66:
            do {
                int alt66=2;
                int LA66_0 = input.LA(1);

                if ( (LA66_0==IDENTIFIER) ) {
                    alt66=1;
                }


                switch (alt66) {
            	case 1 :
            	    // Haxe.g:392:21: enumValueDecl
            	    {
            	    pushFollow(FOLLOW_enumValueDecl_in_enumBody3609);
            	    enumValueDecl297=enumValueDecl();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_enumValueDecl.add(enumValueDecl297.getTree());

            	    }
            	    break;

            	default :
            	    break loop66;
                }
            } while (true);

            RBRACE298=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_enumBody3613); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACE.add(RBRACE298);



            // AST REWRITE
            // elements: enumValueDecl, RBRACE
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 393:13: -> ^( BLOCK_SCOPE[\"BLOCK_SCOPE\", true, $LBRACE] ( enumValueDecl )* RBRACE[$RBRACE, true] )
            {
                // Haxe.g:393:16: ^( BLOCK_SCOPE[\"BLOCK_SCOPE\", true, $LBRACE] ( enumValueDecl )* RBRACE[$RBRACE, true] )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new BlockScopeNode(BLOCK_SCOPE, "BLOCK_SCOPE", true, LBRACE296), root_1);

                // Haxe.g:393:76: ( enumValueDecl )*
                while ( stream_enumValueDecl.hasNext() ) {
                    adaptor.addChild(root_1, stream_enumValueDecl.nextTree());

                }
                stream_enumValueDecl.reset();
                adaptor.addChild(root_1, new HaxeTree(RBRACE, RBRACE298, true));

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
            if ( state.backtracking>0 ) { memoize(input, 62, enumBody_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "enumBody"

    public static class enumValueDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "enumValueDecl"
    // Haxe.g:396:1: enumValueDecl : ( IDENTIFIER LPAREN paramList RPAREN SEMI -> ^( IDENTIFIER[$IDENTIFIER] ( IDENTIFIER )? ( paramList )? ) | IDENTIFIER SEMI -> ^( IDENTIFIER[$IDENTIFIER] ( IDENTIFIER )? ) );
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 63) ) { return retval; }
            // Haxe.g:397:5: ( IDENTIFIER LPAREN paramList RPAREN SEMI -> ^( IDENTIFIER[$IDENTIFIER] ( IDENTIFIER )? ( paramList )? ) | IDENTIFIER SEMI -> ^( IDENTIFIER[$IDENTIFIER] ( IDENTIFIER )? ) )
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==IDENTIFIER) ) {
                int LA67_1 = input.LA(2);

                if ( (LA67_1==LPAREN) ) {
                    alt67=1;
                }
                else if ( (LA67_1==SEMI) ) {
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
                    // Haxe.g:397:9: IDENTIFIER LPAREN paramList RPAREN SEMI
                    {
                    IDENTIFIER299=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_enumValueDecl3672); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER299);

                    LPAREN300=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_enumValueDecl3674); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN300);

                    pushFollow(FOLLOW_paramList_in_enumValueDecl3676);
                    paramList301=paramList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_paramList.add(paramList301.getTree());
                    RPAREN302=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_enumValueDecl3678); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN302);

                    SEMI303=(Token)match(input,SEMI,FOLLOW_SEMI_in_enumValueDecl3680); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI303);



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
                    // 397:49: -> ^( IDENTIFIER[$IDENTIFIER] ( IDENTIFIER )? ( paramList )? )
                    {
                        // Haxe.g:397:52: ^( IDENTIFIER[$IDENTIFIER] ( IDENTIFIER )? ( paramList )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new VarDeclaration(IDENTIFIER, IDENTIFIER299), root_1);

                        // Haxe.g:397:94: ( IDENTIFIER )?
                        if ( stream_IDENTIFIER.hasNext() ) {
                            adaptor.addChild(root_1, new VarUsage(stream_IDENTIFIER.nextToken()));

                        }
                        stream_IDENTIFIER.reset();
                        // Haxe.g:397:116: ( paramList )?
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
                    // Haxe.g:398:9: IDENTIFIER SEMI
                    {
                    IDENTIFIER304=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_enumValueDecl3714); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER304);

                    SEMI305=(Token)match(input,SEMI,FOLLOW_SEMI_in_enumValueDecl3716); if (state.failed) return retval; 
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
                    // 398:49: -> ^( IDENTIFIER[$IDENTIFIER] ( IDENTIFIER )? )
                    {
                        // Haxe.g:398:52: ^( IDENTIFIER[$IDENTIFIER] ( IDENTIFIER )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new VarDeclaration(IDENTIFIER, IDENTIFIER304), root_1);

                        // Haxe.g:398:94: ( IDENTIFIER )?
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
            if ( state.backtracking>0 ) { memoize(input, 63, enumValueDecl_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "enumValueDecl"

    public static class varDeclList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "varDeclList"
    // Haxe.g:402:1: varDeclList : varDecl varDeclList ;
    public final HaxeParser.varDeclList_return varDeclList() throws RecognitionException {
        HaxeParser.varDeclList_return retval = new HaxeParser.varDeclList_return();
        retval.start = input.LT(1);
        int varDeclList_StartIndex = input.index();
        Object root_0 = null;

        HaxeParser.varDecl_return varDecl306 = null;

        HaxeParser.varDeclList_return varDeclList307 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 64) ) { return retval; }
            // Haxe.g:403:5: ( varDecl varDeclList )
            // Haxe.g:403:9: varDecl varDeclList
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_varDecl_in_varDeclList3776);
            varDecl306=varDecl();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, varDecl306.getTree());
            pushFollow(FOLLOW_varDeclList_in_varDeclList3778);
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
            if ( state.backtracking>0 ) { memoize(input, 64, varDeclList_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "varDeclList"

    public static class varDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "varDecl"
    // Haxe.g:406:1: varDecl : ( declAttrList )? VAR varDeclPartList SEMI -> ^( VAR[$VAR] ( declAttrList )? ( varDeclPartList )? ) ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 65) ) { return retval; }
            // Haxe.g:406:9: ( ( declAttrList )? VAR varDeclPartList SEMI -> ^( VAR[$VAR] ( declAttrList )? ( varDeclPartList )? ) )
            // Haxe.g:406:13: ( declAttrList )? VAR varDeclPartList SEMI
            {
            // Haxe.g:406:13: ( declAttrList )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==PRIVATE||(LA68_0>=PUBLIC && LA68_0<=OVERRIDE)) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // Haxe.g:406:14: declAttrList
                    {
                    pushFollow(FOLLOW_declAttrList_in_varDecl3794);
                    declAttrList308=declAttrList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declAttrList.add(declAttrList308.getTree());

                    }
                    break;

            }

            VAR309=(Token)match(input,VAR,FOLLOW_VAR_in_varDecl3798); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_VAR.add(VAR309);

            pushFollow(FOLLOW_varDeclPartList_in_varDecl3800);
            varDeclPartList310=varDeclPartList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_varDeclPartList.add(varDeclPartList310.getTree());
            SEMI311=(Token)match(input,SEMI,FOLLOW_SEMI_in_varDecl3802); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SEMI.add(SEMI311);



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
            // 406:54: -> ^( VAR[$VAR] ( declAttrList )? ( varDeclPartList )? )
            {
                // Haxe.g:406:57: ^( VAR[$VAR] ( declAttrList )? ( varDeclPartList )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new VarDeclaration(VAR, VAR309), root_1);

                // Haxe.g:406:85: ( declAttrList )?
                if ( stream_declAttrList.hasNext() ) {
                    adaptor.addChild(root_1, stream_declAttrList.nextTree());

                }
                stream_declAttrList.reset();
                // Haxe.g:406:99: ( varDeclPartList )?
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
            if ( state.backtracking>0 ) { memoize(input, 65, varDecl_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "varDecl"

    public static class varDeclPartList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "varDeclPartList"
    // Haxe.g:409:1: varDeclPartList : varDeclPart ( COMMA varDeclPart )* ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 66) ) { return retval; }
            // Haxe.g:410:5: ( varDeclPart ( COMMA varDeclPart )* )
            // Haxe.g:410:9: varDeclPart ( COMMA varDeclPart )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_varDeclPart_in_varDeclPartList3848);
            varDeclPart312=varDeclPart();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclPart312.getTree());
            // Haxe.g:410:21: ( COMMA varDeclPart )*
            loop69:
            do {
                int alt69=2;
                int LA69_0 = input.LA(1);

                if ( (LA69_0==COMMA) ) {
                    alt69=1;
                }


                switch (alt69) {
            	case 1 :
            	    // Haxe.g:410:22: COMMA varDeclPart
            	    {
            	    COMMA313=(Token)match(input,COMMA,FOLLOW_COMMA_in_varDeclPartList3851); if (state.failed) return retval;
            	    pushFollow(FOLLOW_varDeclPart_in_varDeclPartList3854);
            	    varDeclPart314=varDeclPart();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclPart314.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 66, varDeclPartList_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "varDeclPartList"

    public static class varDeclPart_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "varDeclPart"
    // Haxe.g:413:1: varDeclPart : IDENTIFIER propDeclOpt typeTagOpt varInit ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 67) ) { return retval; }
            // Haxe.g:414:5: ( IDENTIFIER propDeclOpt typeTagOpt varInit )
            // Haxe.g:414:9: IDENTIFIER propDeclOpt typeTagOpt varInit
            {
            root_0 = (Object)adaptor.nil();

            IDENTIFIER315=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_varDeclPart3875); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER315_tree = new VarUsage(IDENTIFIER315) ;
            adaptor.addChild(root_0, IDENTIFIER315_tree);
            }
            pushFollow(FOLLOW_propDeclOpt_in_varDeclPart3880);
            propDeclOpt316=propDeclOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, propDeclOpt316.getTree());
            pushFollow(FOLLOW_typeTagOpt_in_varDeclPart3882);
            typeTagOpt317=typeTagOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, typeTagOpt317.getTree());
            pushFollow(FOLLOW_varInit_in_varDeclPart3884);
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
            if ( state.backtracking>0 ) { memoize(input, 67, varDeclPart_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "varDeclPart"

    public static class propDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "propDecl"
    // Haxe.g:417:1: propDecl : LPAREN a1= propAccessor COMMA a2= propAccessor RPAREN -> ^( PROPERTY_DECL[\"PROPERTY_DECL\",true] ( $a1)? ( $a2)? ) ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 68) ) { return retval; }
            // Haxe.g:417:9: ( LPAREN a1= propAccessor COMMA a2= propAccessor RPAREN -> ^( PROPERTY_DECL[\"PROPERTY_DECL\",true] ( $a1)? ( $a2)? ) )
            // Haxe.g:417:13: LPAREN a1= propAccessor COMMA a2= propAccessor RPAREN
            {
            LPAREN319=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_propDecl3898); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN319);

            pushFollow(FOLLOW_propAccessor_in_propDecl3902);
            a1=propAccessor();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_propAccessor.add(a1.getTree());
            COMMA320=(Token)match(input,COMMA,FOLLOW_COMMA_in_propDecl3904); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COMMA.add(COMMA320);

            pushFollow(FOLLOW_propAccessor_in_propDecl3908);
            a2=propAccessor();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_propAccessor.add(a2.getTree());
            RPAREN321=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_propDecl3910); if (state.failed) return retval; 
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
            // 417:65: -> ^( PROPERTY_DECL[\"PROPERTY_DECL\",true] ( $a1)? ( $a2)? )
            {
                // Haxe.g:417:68: ^( PROPERTY_DECL[\"PROPERTY_DECL\",true] ( $a1)? ( $a2)? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new HaxeTree(PROPERTY_DECL, "PROPERTY_DECL", true), root_1);

                // Haxe.g:417:116: ( $a1)?
                if ( stream_a1.hasNext() ) {
                    adaptor.addChild(root_1, stream_a1.nextTree());

                }
                stream_a1.reset();
                // Haxe.g:417:121: ( $a2)?
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
            if ( state.backtracking>0 ) { memoize(input, 68, propDecl_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "propDecl"

    public static class propAccessor_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "propAccessor"
    // Haxe.g:420:1: propAccessor : ( IDENTIFIER | NULL | DEFAULT | DYNAMIC );
    public final HaxeParser.propAccessor_return propAccessor() throws RecognitionException {
        HaxeParser.propAccessor_return retval = new HaxeParser.propAccessor_return();
        retval.start = input.LT(1);
        int propAccessor_StartIndex = input.index();
        Object root_0 = null;

        Token set322=null;

        Object set322_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 69) ) { return retval; }
            // Haxe.g:421:9: ( IDENTIFIER | NULL | DEFAULT | DYNAMIC )
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
            if ( state.backtracking>0 ) { memoize(input, 69, propAccessor_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "propAccessor"

    public static class propDeclOpt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "propDeclOpt"
    // Haxe.g:427:1: propDeclOpt : ( propDecl | );
    public final HaxeParser.propDeclOpt_return propDeclOpt() throws RecognitionException {
        HaxeParser.propDeclOpt_return retval = new HaxeParser.propDeclOpt_return();
        retval.start = input.LT(1);
        int propDeclOpt_StartIndex = input.index();
        Object root_0 = null;

        HaxeParser.propDecl_return propDecl323 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 70) ) { return retval; }
            // Haxe.g:428:5: ( propDecl | )
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==LPAREN) ) {
                alt70=1;
            }
            else if ( (LA70_0==EOF||LA70_0==SEMI||LA70_0==RPAREN||LA70_0==COLON||LA70_0==COMMA||LA70_0==EQ||LA70_0==LBRACE) ) {
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
                    // Haxe.g:428:9: propDecl
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_propDecl_in_propDeclOpt4030);
                    propDecl323=propDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, propDecl323.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:430:5: 
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

    public static class varInit_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "varInit"
    // Haxe.g:432:1: varInit : ( EQ expr -> ^( VAR_INIT[\"VAR_INIT\",true] ( expr )? ) | );
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 71) ) { return retval; }
            // Haxe.g:432:9: ( EQ expr -> ^( VAR_INIT[\"VAR_INIT\",true] ( expr )? ) | )
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==EQ) ) {
                alt71=1;
            }
            else if ( (LA71_0==EOF||LA71_0==SEMI||LA71_0==RPAREN||LA71_0==COMMA) ) {
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
                    // Haxe.g:432:13: EQ expr
                    {
                    EQ324=(Token)match(input,EQ,FOLLOW_EQ_in_varInit4055); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EQ.add(EQ324);

                    pushFollow(FOLLOW_expr_in_varInit4057);
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
                    // 432:21: -> ^( VAR_INIT[\"VAR_INIT\",true] ( expr )? )
                    {
                        // Haxe.g:432:24: ^( VAR_INIT[\"VAR_INIT\",true] ( expr )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new HaxeTree(VAR_INIT, "VAR_INIT", true), root_1);

                        // Haxe.g:432:62: ( expr )?
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
                    // Haxe.g:434:9: 
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

    public static class funcDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "funcDecl"
    // Haxe.g:436:1: funcDecl : ( ( declAttrList )? FUNCTION NEW LPAREN paramList RPAREN typeTagOpt block -> ^( FUNCTION NEW ( declAttrList )? ( paramList )? ( typeTagOpt )? ( block )? ) | ( declAttrList )? FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt block -> ^( FUNCTION IDENTIFIER ( declAttrList )? ( paramList )? ( typeTagOpt )? ( block )? ( typeParamOpt )? ) );
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 72) ) { return retval; }
            // Haxe.g:436:9: ( ( declAttrList )? FUNCTION NEW LPAREN paramList RPAREN typeTagOpt block -> ^( FUNCTION NEW ( declAttrList )? ( paramList )? ( typeTagOpt )? ( block )? ) | ( declAttrList )? FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt block -> ^( FUNCTION IDENTIFIER ( declAttrList )? ( paramList )? ( typeTagOpt )? ( block )? ( typeParamOpt )? ) )
            int alt74=2;
            alt74 = dfa74.predict(input);
            switch (alt74) {
                case 1 :
                    // Haxe.g:436:13: ( declAttrList )? FUNCTION NEW LPAREN paramList RPAREN typeTagOpt block
                    {
                    // Haxe.g:436:13: ( declAttrList )?
                    int alt72=2;
                    int LA72_0 = input.LA(1);

                    if ( (LA72_0==PRIVATE||(LA72_0>=PUBLIC && LA72_0<=OVERRIDE)) ) {
                        alt72=1;
                    }
                    switch (alt72) {
                        case 1 :
                            // Haxe.g:0:0: declAttrList
                            {
                            pushFollow(FOLLOW_declAttrList_in_funcDecl4105);
                            declAttrList326=declAttrList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_declAttrList.add(declAttrList326.getTree());

                            }
                            break;

                    }

                    FUNCTION327=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcDecl4108); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION327);

                    NEW328=(Token)match(input,NEW,FOLLOW_NEW_in_funcDecl4110); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEW.add(NEW328);

                    LPAREN329=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcDecl4112); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN329);

                    pushFollow(FOLLOW_paramList_in_funcDecl4114);
                    paramList330=paramList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_paramList.add(paramList330.getTree());
                    RPAREN331=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcDecl4116); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN331);

                    pushFollow(FOLLOW_typeTagOpt_in_funcDecl4118);
                    typeTagOpt332=typeTagOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeTagOpt.add(typeTagOpt332.getTree());
                    pushFollow(FOLLOW_block_in_funcDecl4120);
                    block333=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block333.getTree());


                    // AST REWRITE
                    // elements: NEW, paramList, typeTagOpt, block, declAttrList, FUNCTION
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 437:17: -> ^( FUNCTION NEW ( declAttrList )? ( paramList )? ( typeTagOpt )? ( block )? )
                    {
                        // Haxe.g:437:20: ^( FUNCTION NEW ( declAttrList )? ( paramList )? ( typeTagOpt )? ( block )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new FunctionNode(stream_FUNCTION.nextToken()), root_1);

                        adaptor.addChild(root_1, stream_NEW.nextNode());
                        // Haxe.g:437:49: ( declAttrList )?
                        if ( stream_declAttrList.hasNext() ) {
                            adaptor.addChild(root_1, stream_declAttrList.nextTree());

                        }
                        stream_declAttrList.reset();
                        // Haxe.g:437:63: ( paramList )?
                        if ( stream_paramList.hasNext() ) {
                            adaptor.addChild(root_1, stream_paramList.nextTree());

                        }
                        stream_paramList.reset();
                        // Haxe.g:437:74: ( typeTagOpt )?
                        if ( stream_typeTagOpt.hasNext() ) {
                            adaptor.addChild(root_1, stream_typeTagOpt.nextTree());

                        }
                        stream_typeTagOpt.reset();
                        // Haxe.g:437:86: ( block )?
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
                    // Haxe.g:438:13: ( declAttrList )? FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt block
                    {
                    // Haxe.g:438:13: ( declAttrList )?
                    int alt73=2;
                    int LA73_0 = input.LA(1);

                    if ( (LA73_0==PRIVATE||(LA73_0>=PUBLIC && LA73_0<=OVERRIDE)) ) {
                        alt73=1;
                    }
                    switch (alt73) {
                        case 1 :
                            // Haxe.g:0:0: declAttrList
                            {
                            pushFollow(FOLLOW_declAttrList_in_funcDecl4175);
                            declAttrList334=declAttrList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_declAttrList.add(declAttrList334.getTree());

                            }
                            break;

                    }

                    FUNCTION335=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcDecl4178); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION335);

                    IDENTIFIER336=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_funcDecl4180); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER336);

                    pushFollow(FOLLOW_typeParamOpt_in_funcDecl4182);
                    typeParamOpt337=typeParamOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeParamOpt.add(typeParamOpt337.getTree());
                    LPAREN338=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcDecl4184); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN338);

                    pushFollow(FOLLOW_paramList_in_funcDecl4186);
                    paramList339=paramList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_paramList.add(paramList339.getTree());
                    RPAREN340=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcDecl4188); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN340);

                    pushFollow(FOLLOW_typeTagOpt_in_funcDecl4190);
                    typeTagOpt341=typeTagOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeTagOpt.add(typeTagOpt341.getTree());
                    pushFollow(FOLLOW_block_in_funcDecl4192);
                    block342=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block342.getTree());


                    // AST REWRITE
                    // elements: paramList, IDENTIFIER, block, typeTagOpt, FUNCTION, typeParamOpt, declAttrList
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 439:17: -> ^( FUNCTION IDENTIFIER ( declAttrList )? ( paramList )? ( typeTagOpt )? ( block )? ( typeParamOpt )? )
                    {
                        // Haxe.g:439:20: ^( FUNCTION IDENTIFIER ( declAttrList )? ( paramList )? ( typeTagOpt )? ( block )? ( typeParamOpt )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new FunctionNode(stream_FUNCTION.nextToken()), root_1);

                        adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
                        // Haxe.g:439:56: ( declAttrList )?
                        if ( stream_declAttrList.hasNext() ) {
                            adaptor.addChild(root_1, stream_declAttrList.nextTree());

                        }
                        stream_declAttrList.reset();
                        // Haxe.g:439:70: ( paramList )?
                        if ( stream_paramList.hasNext() ) {
                            adaptor.addChild(root_1, stream_paramList.nextTree());

                        }
                        stream_paramList.reset();
                        // Haxe.g:439:81: ( typeTagOpt )?
                        if ( stream_typeTagOpt.hasNext() ) {
                            adaptor.addChild(root_1, stream_typeTagOpt.nextTree());

                        }
                        stream_typeTagOpt.reset();
                        // Haxe.g:439:93: ( block )?
                        if ( stream_block.hasNext() ) {
                            adaptor.addChild(root_1, stream_block.nextTree());

                        }
                        stream_block.reset();
                        // Haxe.g:439:100: ( typeParamOpt )?
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

    public static class funcProtoDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "funcProtoDecl"
    // Haxe.g:442:1: funcProtoDecl : ( declAttrList FUNCTION NEW LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTagOpt )? ( declAttrList )? ) | declAttrList FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTagOpt )? ( declAttrList )? ( typeParamOpt )? ) | FUNCTION NEW LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTagOpt )? ) | FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTagOpt )? ( typeParamOpt )? ) );
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 73) ) { return retval; }
            // Haxe.g:443:5: ( declAttrList FUNCTION NEW LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTagOpt )? ( declAttrList )? ) | declAttrList FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTagOpt )? ( declAttrList )? ( typeParamOpt )? ) | FUNCTION NEW LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTagOpt )? ) | FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTagOpt )? ( typeParamOpt )? ) )
            int alt75=4;
            alt75 = dfa75.predict(input);
            switch (alt75) {
                case 1 :
                    // Haxe.g:443:9: declAttrList FUNCTION NEW LPAREN paramList RPAREN typeTagOpt SEMI
                    {
                    pushFollow(FOLLOW_declAttrList_in_funcProtoDecl4262);
                    declAttrList343=declAttrList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declAttrList.add(declAttrList343.getTree());
                    FUNCTION344=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcProtoDecl4264); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION344);

                    NEW345=(Token)match(input,NEW,FOLLOW_NEW_in_funcProtoDecl4266); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEW.add(NEW345);

                    LPAREN346=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcProtoDecl4268); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN346);

                    pushFollow(FOLLOW_paramList_in_funcProtoDecl4270);
                    paramList347=paramList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_paramList.add(paramList347.getTree());
                    RPAREN348=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcProtoDecl4272); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN348);

                    pushFollow(FOLLOW_typeTagOpt_in_funcProtoDecl4274);
                    typeTagOpt349=typeTagOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeTagOpt.add(typeTagOpt349.getTree());
                    SEMI350=(Token)match(input,SEMI,FOLLOW_SEMI_in_funcProtoDecl4276); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI350);



                    // AST REWRITE
                    // elements: FUNCTION, declAttrList, typeTagOpt, paramList, NEW
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 444:13: -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTagOpt )? ( declAttrList )? )
                    {
                        // Haxe.g:444:16: ^( FUNCTION ( NEW )? ( paramList )? ( typeTagOpt )? ( declAttrList )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_FUNCTION.nextNode(), root_1);

                        // Haxe.g:444:27: ( NEW )?
                        if ( stream_NEW.hasNext() ) {
                            adaptor.addChild(root_1, stream_NEW.nextNode());

                        }
                        stream_NEW.reset();
                        // Haxe.g:444:32: ( paramList )?
                        if ( stream_paramList.hasNext() ) {
                            adaptor.addChild(root_1, stream_paramList.nextTree());

                        }
                        stream_paramList.reset();
                        // Haxe.g:444:43: ( typeTagOpt )?
                        if ( stream_typeTagOpt.hasNext() ) {
                            adaptor.addChild(root_1, stream_typeTagOpt.nextTree());

                        }
                        stream_typeTagOpt.reset();
                        // Haxe.g:444:55: ( declAttrList )?
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
                    // Haxe.g:445:9: declAttrList FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt SEMI
                    {
                    pushFollow(FOLLOW_declAttrList_in_funcProtoDecl4317);
                    declAttrList351=declAttrList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declAttrList.add(declAttrList351.getTree());
                    FUNCTION352=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcProtoDecl4319); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION352);

                    IDENTIFIER353=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_funcProtoDecl4321); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER353);

                    pushFollow(FOLLOW_typeParamOpt_in_funcProtoDecl4323);
                    typeParamOpt354=typeParamOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeParamOpt.add(typeParamOpt354.getTree());
                    LPAREN355=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcProtoDecl4325); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN355);

                    pushFollow(FOLLOW_paramList_in_funcProtoDecl4327);
                    paramList356=paramList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_paramList.add(paramList356.getTree());
                    RPAREN357=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcProtoDecl4329); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN357);

                    pushFollow(FOLLOW_typeTagOpt_in_funcProtoDecl4331);
                    typeTagOpt358=typeTagOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeTagOpt.add(typeTagOpt358.getTree());
                    SEMI359=(Token)match(input,SEMI,FOLLOW_SEMI_in_funcProtoDecl4333); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI359);



                    // AST REWRITE
                    // elements: FUNCTION, paramList, typeParamOpt, declAttrList, typeTagOpt, IDENTIFIER
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 446:13: -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTagOpt )? ( declAttrList )? ( typeParamOpt )? )
                    {
                        // Haxe.g:446:16: ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTagOpt )? ( declAttrList )? ( typeParamOpt )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_FUNCTION.nextNode(), root_1);

                        // Haxe.g:446:27: ( IDENTIFIER )?
                        if ( stream_IDENTIFIER.hasNext() ) {
                            adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());

                        }
                        stream_IDENTIFIER.reset();
                        // Haxe.g:446:39: ( paramList )?
                        if ( stream_paramList.hasNext() ) {
                            adaptor.addChild(root_1, stream_paramList.nextTree());

                        }
                        stream_paramList.reset();
                        // Haxe.g:446:50: ( typeTagOpt )?
                        if ( stream_typeTagOpt.hasNext() ) {
                            adaptor.addChild(root_1, stream_typeTagOpt.nextTree());

                        }
                        stream_typeTagOpt.reset();
                        // Haxe.g:446:62: ( declAttrList )?
                        if ( stream_declAttrList.hasNext() ) {
                            adaptor.addChild(root_1, stream_declAttrList.nextTree());

                        }
                        stream_declAttrList.reset();
                        // Haxe.g:446:76: ( typeParamOpt )?
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
                    // Haxe.g:447:9: FUNCTION NEW LPAREN paramList RPAREN typeTagOpt SEMI
                    {
                    FUNCTION360=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcProtoDecl4377); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION360);

                    NEW361=(Token)match(input,NEW,FOLLOW_NEW_in_funcProtoDecl4379); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEW.add(NEW361);

                    LPAREN362=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcProtoDecl4381); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN362);

                    pushFollow(FOLLOW_paramList_in_funcProtoDecl4383);
                    paramList363=paramList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_paramList.add(paramList363.getTree());
                    RPAREN364=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcProtoDecl4385); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN364);

                    pushFollow(FOLLOW_typeTagOpt_in_funcProtoDecl4387);
                    typeTagOpt365=typeTagOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeTagOpt.add(typeTagOpt365.getTree());
                    SEMI366=(Token)match(input,SEMI,FOLLOW_SEMI_in_funcProtoDecl4389); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI366);



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
                    // 448:13: -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTagOpt )? )
                    {
                        // Haxe.g:448:16: ^( FUNCTION ( NEW )? ( paramList )? ( typeTagOpt )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_FUNCTION.nextNode(), root_1);

                        // Haxe.g:448:27: ( NEW )?
                        if ( stream_NEW.hasNext() ) {
                            adaptor.addChild(root_1, stream_NEW.nextNode());

                        }
                        stream_NEW.reset();
                        // Haxe.g:448:32: ( paramList )?
                        if ( stream_paramList.hasNext() ) {
                            adaptor.addChild(root_1, stream_paramList.nextTree());

                        }
                        stream_paramList.reset();
                        // Haxe.g:448:43: ( typeTagOpt )?
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
                    // Haxe.g:449:9: FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt SEMI
                    {
                    FUNCTION367=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcProtoDecl4427); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION367);

                    IDENTIFIER368=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_funcProtoDecl4429); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER368);

                    pushFollow(FOLLOW_typeParamOpt_in_funcProtoDecl4431);
                    typeParamOpt369=typeParamOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeParamOpt.add(typeParamOpt369.getTree());
                    LPAREN370=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcProtoDecl4433); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN370);

                    pushFollow(FOLLOW_paramList_in_funcProtoDecl4435);
                    paramList371=paramList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_paramList.add(paramList371.getTree());
                    RPAREN372=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcProtoDecl4437); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN372);

                    pushFollow(FOLLOW_typeTagOpt_in_funcProtoDecl4439);
                    typeTagOpt373=typeTagOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeTagOpt.add(typeTagOpt373.getTree());
                    SEMI374=(Token)match(input,SEMI,FOLLOW_SEMI_in_funcProtoDecl4441); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI374);



                    // AST REWRITE
                    // elements: IDENTIFIER, FUNCTION, typeParamOpt, paramList, typeTagOpt
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 450:13: -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTagOpt )? ( typeParamOpt )? )
                    {
                        // Haxe.g:450:16: ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTagOpt )? ( typeParamOpt )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_FUNCTION.nextNode(), root_1);

                        // Haxe.g:450:27: ( IDENTIFIER )?
                        if ( stream_IDENTIFIER.hasNext() ) {
                            adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());

                        }
                        stream_IDENTIFIER.reset();
                        // Haxe.g:450:39: ( paramList )?
                        if ( stream_paramList.hasNext() ) {
                            adaptor.addChild(root_1, stream_paramList.nextTree());

                        }
                        stream_paramList.reset();
                        // Haxe.g:450:50: ( typeTagOpt )?
                        if ( stream_typeTagOpt.hasNext() ) {
                            adaptor.addChild(root_1, stream_typeTagOpt.nextTree());

                        }
                        stream_typeTagOpt.reset();
                        // Haxe.g:450:62: ( typeParamOpt )?
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
            if ( state.backtracking>0 ) { memoize(input, 73, funcProtoDecl_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "funcProtoDecl"

    public static class classDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "classDecl"
    // Haxe.g:453:1: classDecl : typeDeclFlags CLASS IDENTIFIER typeParamOpt inheritListOpt classBodyScope -> ^( IDENTIFIER ( typeDeclFlags )? ( typeParamOpt )? ( inheritListOpt )? ( classBodyScope )? ) ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 74) ) { return retval; }
            // Haxe.g:454:5: ( typeDeclFlags CLASS IDENTIFIER typeParamOpt inheritListOpt classBodyScope -> ^( IDENTIFIER ( typeDeclFlags )? ( typeParamOpt )? ( inheritListOpt )? ( classBodyScope )? ) )
            // Haxe.g:454:9: typeDeclFlags CLASS IDENTIFIER typeParamOpt inheritListOpt classBodyScope
            {
            pushFollow(FOLLOW_typeDeclFlags_in_classDecl4495);
            typeDeclFlags375=typeDeclFlags();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeDeclFlags.add(typeDeclFlags375.getTree());
            CLASS376=(Token)match(input,CLASS,FOLLOW_CLASS_in_classDecl4497); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CLASS.add(CLASS376);

            IDENTIFIER377=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_classDecl4499); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER377);

            pushFollow(FOLLOW_typeParamOpt_in_classDecl4501);
            typeParamOpt378=typeParamOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeParamOpt.add(typeParamOpt378.getTree());
            pushFollow(FOLLOW_inheritListOpt_in_classDecl4503);
            inheritListOpt379=inheritListOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_inheritListOpt.add(inheritListOpt379.getTree());
            pushFollow(FOLLOW_classBodyScope_in_classDecl4505);
            classBodyScope380=classBodyScope();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_classBodyScope.add(classBodyScope380.getTree());


            // AST REWRITE
            // elements: classBodyScope, inheritListOpt, typeDeclFlags, typeParamOpt, IDENTIFIER
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 455:13: -> ^( IDENTIFIER ( typeDeclFlags )? ( typeParamOpt )? ( inheritListOpt )? ( classBodyScope )? )
            {
                // Haxe.g:455:16: ^( IDENTIFIER ( typeDeclFlags )? ( typeParamOpt )? ( inheritListOpt )? ( classBodyScope )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new ClassNode(stream_IDENTIFIER.nextToken()), root_1);

                // Haxe.g:455:40: ( typeDeclFlags )?
                if ( stream_typeDeclFlags.hasNext() ) {
                    adaptor.addChild(root_1, stream_typeDeclFlags.nextTree());

                }
                stream_typeDeclFlags.reset();
                // Haxe.g:455:55: ( typeParamOpt )?
                if ( stream_typeParamOpt.hasNext() ) {
                    adaptor.addChild(root_1, stream_typeParamOpt.nextTree());

                }
                stream_typeParamOpt.reset();
                // Haxe.g:455:69: ( inheritListOpt )?
                if ( stream_inheritListOpt.hasNext() ) {
                    adaptor.addChild(root_1, stream_inheritListOpt.nextTree());

                }
                stream_inheritListOpt.reset();
                // Haxe.g:455:85: ( classBodyScope )?
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

    public static class classBodyScope_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "classBodyScope"
    // Haxe.g:458:1: classBodyScope : LBRACE ( classMember )* RBRACE -> ^( BLOCK_SCOPE[\"BLOCK_SCOPE\", true, $LBRACE] ( classMember )* RBRACE[$RBRACE, true] ) ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 75) ) { return retval; }
            // Haxe.g:459:5: ( LBRACE ( classMember )* RBRACE -> ^( BLOCK_SCOPE[\"BLOCK_SCOPE\", true, $LBRACE] ( classMember )* RBRACE[$RBRACE, true] ) )
            // Haxe.g:459:9: LBRACE ( classMember )* RBRACE
            {
            LBRACE381=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_classBodyScope4561); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACE.add(LBRACE381);

            // Haxe.g:459:16: ( classMember )*
            loop76:
            do {
                int alt76=2;
                int LA76_0 = input.LA(1);

                if ( (LA76_0==MONKEYS_AT||(LA76_0>=EXTERN && LA76_0<=PRIVATE)||(LA76_0>=PUBLIC && LA76_0<=OVERRIDE)||LA76_0==FUNCTION||(LA76_0>=ENUM && LA76_0<=VAR)||(LA76_0>=CLASS && LA76_0<=INTERFACE)) ) {
                    alt76=1;
                }


                switch (alt76) {
            	case 1 :
            	    // Haxe.g:459:17: classMember
            	    {
            	    pushFollow(FOLLOW_classMember_in_classBodyScope4564);
            	    classMember382=classMember();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_classMember.add(classMember382.getTree());

            	    }
            	    break;

            	default :
            	    break loop76;
                }
            } while (true);

            RBRACE383=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_classBodyScope4568); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACE.add(RBRACE383);



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
            // 459:38: -> ^( BLOCK_SCOPE[\"BLOCK_SCOPE\", true, $LBRACE] ( classMember )* RBRACE[$RBRACE, true] )
            {
                // Haxe.g:459:41: ^( BLOCK_SCOPE[\"BLOCK_SCOPE\", true, $LBRACE] ( classMember )* RBRACE[$RBRACE, true] )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new BlockScopeNode(BLOCK_SCOPE, "BLOCK_SCOPE", true, LBRACE381), root_1);

                // Haxe.g:459:101: ( classMember )*
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
            if ( state.backtracking>0 ) { memoize(input, 75, classBodyScope_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "classBodyScope"

    public static class classMember_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "classMember"
    // Haxe.g:462:1: classMember : ( varDecl | funcDecl | enumDecl );
    public final HaxeParser.classMember_return classMember() throws RecognitionException {
        HaxeParser.classMember_return retval = new HaxeParser.classMember_return();
        retval.start = input.LT(1);
        int classMember_StartIndex = input.index();
        Object root_0 = null;

        HaxeParser.varDecl_return varDecl384 = null;

        HaxeParser.funcDecl_return funcDecl385 = null;

        HaxeParser.enumDecl_return enumDecl386 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 76) ) { return retval; }
            // Haxe.g:463:5: ( varDecl | funcDecl | enumDecl )
            int alt77=3;
            alt77 = dfa77.predict(input);
            switch (alt77) {
                case 1 :
                    // Haxe.g:463:9: varDecl
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_varDecl_in_classMember4606);
                    varDecl384=varDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDecl384.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:464:9: funcDecl
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_funcDecl_in_classMember4617);
                    funcDecl385=funcDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, funcDecl385.getTree());

                    }
                    break;
                case 3 :
                    // Haxe.g:466:9: enumDecl
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_enumDecl_in_classMember4629);
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
            if ( state.backtracking>0 ) { memoize(input, 76, classMember_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "classMember"

    public static class interfaceDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "interfaceDecl"
    // Haxe.g:469:1: interfaceDecl : typeDeclFlags INTERFACE type inheritListOpt LBRACE interfaceBody RBRACE ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 77) ) { return retval; }
            // Haxe.g:470:5: ( typeDeclFlags INTERFACE type inheritListOpt LBRACE interfaceBody RBRACE )
            // Haxe.g:470:9: typeDeclFlags INTERFACE type inheritListOpt LBRACE interfaceBody RBRACE
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_typeDeclFlags_in_interfaceDecl4658);
            typeDeclFlags387=typeDeclFlags();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, typeDeclFlags387.getTree());
            INTERFACE388=(Token)match(input,INTERFACE,FOLLOW_INTERFACE_in_interfaceDecl4660); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            INTERFACE388_tree = (Object)adaptor.create(INTERFACE388);
            adaptor.addChild(root_0, INTERFACE388_tree);
            }
            pushFollow(FOLLOW_type_in_interfaceDecl4662);
            type389=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type389.getTree());
            pushFollow(FOLLOW_inheritListOpt_in_interfaceDecl4664);
            inheritListOpt390=inheritListOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, inheritListOpt390.getTree());
            LBRACE391=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_interfaceDecl4666); if (state.failed) return retval;
            pushFollow(FOLLOW_interfaceBody_in_interfaceDecl4669);
            interfaceBody392=interfaceBody();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceBody392.getTree());
            RBRACE393=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_interfaceDecl4671); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // Haxe.g:473:1: interfaceBody : ( varDecl interfaceBody | funcProtoDecl interfaceBody | );
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 78) ) { return retval; }
            // Haxe.g:474:5: ( varDecl interfaceBody | funcProtoDecl interfaceBody | )
            int alt78=3;
            alt78 = dfa78.predict(input);
            switch (alt78) {
                case 1 :
                    // Haxe.g:474:9: varDecl interfaceBody
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_varDecl_in_interfaceBody4695);
                    varDecl394=varDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDecl394.getTree());
                    pushFollow(FOLLOW_interfaceBody_in_interfaceBody4697);
                    interfaceBody395=interfaceBody();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceBody395.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:475:9: funcProtoDecl interfaceBody
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_funcProtoDecl_in_interfaceBody4707);
                    funcProtoDecl396=funcProtoDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, funcProtoDecl396.getTree());
                    pushFollow(FOLLOW_interfaceBody_in_interfaceBody4709);
                    interfaceBody397=interfaceBody();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceBody397.getTree());

                    }
                    break;
                case 3 :
                    // Haxe.g:478:5: 
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
    // Haxe.g:480:1: inheritList : inherit ( COMMA inherit )* ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 79) ) { return retval; }
            // Haxe.g:481:5: ( inherit ( COMMA inherit )* )
            // Haxe.g:481:10: inherit ( COMMA inherit )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_inherit_in_inheritList4743);
            inherit398=inherit();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, inherit398.getTree());
            // Haxe.g:481:18: ( COMMA inherit )*
            loop79:
            do {
                int alt79=2;
                int LA79_0 = input.LA(1);

                if ( (LA79_0==COMMA) ) {
                    alt79=1;
                }


                switch (alt79) {
            	case 1 :
            	    // Haxe.g:481:19: COMMA inherit
            	    {
            	    COMMA399=(Token)match(input,COMMA,FOLLOW_COMMA_in_inheritList4746); if (state.failed) return retval;
            	    pushFollow(FOLLOW_inherit_in_inheritList4749);
            	    inherit400=inherit();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, inherit400.getTree());

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
    // Haxe.g:484:1: inheritListOpt : ( inheritList -> ^( INHERIT_LIST_OPT[\"INHERIT_LIST_OPT\",true] ( inheritList )? ) | );
    public final HaxeParser.inheritListOpt_return inheritListOpt() throws RecognitionException {
        HaxeParser.inheritListOpt_return retval = new HaxeParser.inheritListOpt_return();
        retval.start = input.LT(1);
        int inheritListOpt_StartIndex = input.index();
        Object root_0 = null;

        HaxeParser.inheritList_return inheritList401 = null;


        RewriteRuleSubtreeStream stream_inheritList=new RewriteRuleSubtreeStream(adaptor,"rule inheritList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 80) ) { return retval; }
            // Haxe.g:485:5: ( inheritList -> ^( INHERIT_LIST_OPT[\"INHERIT_LIST_OPT\",true] ( inheritList )? ) | )
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( ((LA80_0>=EXTENDS && LA80_0<=IMPLEMENTS)) ) {
                alt80=1;
            }
            else if ( (LA80_0==LBRACE) ) {
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
                    // Haxe.g:485:10: inheritList
                    {
                    pushFollow(FOLLOW_inheritList_in_inheritListOpt4779);
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
                    // 485:22: -> ^( INHERIT_LIST_OPT[\"INHERIT_LIST_OPT\",true] ( inheritList )? )
                    {
                        // Haxe.g:485:25: ^( INHERIT_LIST_OPT[\"INHERIT_LIST_OPT\",true] ( inheritList )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new HaxeTree(INHERIT_LIST_OPT, "INHERIT_LIST_OPT", true), root_1);

                        // Haxe.g:485:79: ( inheritList )?
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
                    // Haxe.g:487:5: 
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
    // Haxe.g:489:1: inherit : ( EXTENDS type -> ^( EXTENDS ( type )? ) | IMPLEMENTS type -> ^( IMPLEMENTS ( type )? ) );
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 81) ) { return retval; }
            // Haxe.g:489:12: ( EXTENDS type -> ^( EXTENDS ( type )? ) | IMPLEMENTS type -> ^( IMPLEMENTS ( type )? ) )
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==EXTENDS) ) {
                alt81=1;
            }
            else if ( (LA81_0==IMPLEMENTS) ) {
                alt81=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 81, 0, input);

                throw nvae;
            }
            switch (alt81) {
                case 1 :
                    // Haxe.g:489:17: EXTENDS type
                    {
                    EXTENDS402=(Token)match(input,EXTENDS,FOLLOW_EXTENDS_in_inherit4825); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EXTENDS.add(EXTENDS402);

                    pushFollow(FOLLOW_type_in_inherit4827);
                    type403=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type403.getTree());


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
                    // 489:34: -> ^( EXTENDS ( type )? )
                    {
                        // Haxe.g:489:37: ^( EXTENDS ( type )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_EXTENDS.nextNode(), root_1);

                        // Haxe.g:489:47: ( type )?
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
                    // Haxe.g:490:14: IMPLEMENTS type
                    {
                    IMPLEMENTS404=(Token)match(input,IMPLEMENTS,FOLLOW_IMPLEMENTS_in_inherit4855); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IMPLEMENTS.add(IMPLEMENTS404);

                    pushFollow(FOLLOW_type_in_inherit4857);
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
                    // 490:30: -> ^( IMPLEMENTS ( type )? )
                    {
                        // Haxe.g:490:33: ^( IMPLEMENTS ( type )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_IMPLEMENTS.nextNode(), root_1);

                        // Haxe.g:490:46: ( type )?
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
    // Haxe.g:493:1: typedefDecl : TYPEDEF IDENTIFIER EQ funcType ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 82) ) { return retval; }
            // Haxe.g:494:5: ( TYPEDEF IDENTIFIER EQ funcType )
            // Haxe.g:494:10: TYPEDEF IDENTIFIER EQ funcType
            {
            root_0 = (Object)adaptor.nil();

            TYPEDEF406=(Token)match(input,TYPEDEF,FOLLOW_TYPEDEF_in_typedefDecl4897); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TYPEDEF406_tree = (Object)adaptor.create(TYPEDEF406);
            adaptor.addChild(root_0, TYPEDEF406_tree);
            }
            IDENTIFIER407=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_typedefDecl4899); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER407_tree = (Object)adaptor.create(IDENTIFIER407);
            adaptor.addChild(root_0, IDENTIFIER407_tree);
            }
            EQ408=(Token)match(input,EQ,FOLLOW_EQ_in_typedefDecl4901); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            EQ408_tree = (Object)adaptor.create(EQ408);
            adaptor.addChild(root_0, EQ408_tree);
            }
            pushFollow(FOLLOW_funcType_in_typedefDecl4903);
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
    // Haxe.g:497:1: typeExtend : GT funcType COMMA ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 83) ) { return retval; }
            // Haxe.g:498:5: ( GT funcType COMMA )
            // Haxe.g:498:10: GT funcType COMMA
            {
            root_0 = (Object)adaptor.nil();

            GT410=(Token)match(input,GT,FOLLOW_GT_in_typeExtend4927); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            GT410_tree = (Object)adaptor.create(GT410);
            adaptor.addChild(root_0, GT410_tree);
            }
            pushFollow(FOLLOW_funcType_in_typeExtend4929);
            funcType411=funcType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, funcType411.getTree());
            COMMA412=(Token)match(input,COMMA,FOLLOW_COMMA_in_typeExtend4931); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // Haxe.g:501:1: anonType : LBRACE ( | anonTypeFieldList | varDeclList | typeExtend ( | anonTypeFieldList | varDeclList ) ) RBRACE ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 84) ) { return retval; }
            // Haxe.g:502:5: ( LBRACE ( | anonTypeFieldList | varDeclList | typeExtend ( | anonTypeFieldList | varDeclList ) ) RBRACE )
            // Haxe.g:502:9: LBRACE ( | anonTypeFieldList | varDeclList | typeExtend ( | anonTypeFieldList | varDeclList ) ) RBRACE
            {
            root_0 = (Object)adaptor.nil();

            LBRACE413=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_anonType4955); if (state.failed) return retval;
            // Haxe.g:503:13: ( | anonTypeFieldList | varDeclList | typeExtend ( | anonTypeFieldList | varDeclList ) )
            int alt83=4;
            switch ( input.LA(1) ) {
            case RBRACE:
                {
                alt83=1;
                }
                break;
            case IDENTIFIER:
                {
                alt83=2;
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
                alt83=3;
                }
                break;
            case GT:
                {
                alt83=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 83, 0, input);

                throw nvae;
            }

            switch (alt83) {
                case 1 :
                    // Haxe.g:504:13: 
                    {
                    }
                    break;
                case 2 :
                    // Haxe.g:504:17: anonTypeFieldList
                    {
                    pushFollow(FOLLOW_anonTypeFieldList_in_anonType4989);
                    anonTypeFieldList414=anonTypeFieldList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, anonTypeFieldList414.getTree());

                    }
                    break;
                case 3 :
                    // Haxe.g:505:17: varDeclList
                    {
                    pushFollow(FOLLOW_varDeclList_in_anonType5008);
                    varDeclList415=varDeclList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclList415.getTree());

                    }
                    break;
                case 4 :
                    // Haxe.g:506:17: typeExtend ( | anonTypeFieldList | varDeclList )
                    {
                    pushFollow(FOLLOW_typeExtend_in_anonType5027);
                    typeExtend416=typeExtend();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeExtend416.getTree());
                    // Haxe.g:506:28: ( | anonTypeFieldList | varDeclList )
                    int alt82=3;
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
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 82, 0, input);

                        throw nvae;
                    }

                    switch (alt82) {
                        case 1 :
                            // Haxe.g:507:25: 
                            {
                            }
                            break;
                        case 2 :
                            // Haxe.g:507:29: anonTypeFieldList
                            {
                            pushFollow(FOLLOW_anonTypeFieldList_in_anonType5059);
                            anonTypeFieldList417=anonTypeFieldList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, anonTypeFieldList417.getTree());

                            }
                            break;
                        case 3 :
                            // Haxe.g:508:29: varDeclList
                            {
                            pushFollow(FOLLOW_varDeclList_in_anonType5089);
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

            RBRACE419=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_anonType5116); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // Haxe.g:513:1: anonTypeFieldList : anonTypeField ( COMMA anonTypeField )* ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 85) ) { return retval; }
            // Haxe.g:514:5: ( anonTypeField ( COMMA anonTypeField )* )
            // Haxe.g:514:10: anonTypeField ( COMMA anonTypeField )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_anonTypeField_in_anonTypeFieldList5142);
            anonTypeField420=anonTypeField();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, anonTypeField420.getTree());
            // Haxe.g:514:24: ( COMMA anonTypeField )*
            loop84:
            do {
                int alt84=2;
                int LA84_0 = input.LA(1);

                if ( (LA84_0==COMMA) ) {
                    alt84=1;
                }


                switch (alt84) {
            	case 1 :
            	    // Haxe.g:514:25: COMMA anonTypeField
            	    {
            	    COMMA421=(Token)match(input,COMMA,FOLLOW_COMMA_in_anonTypeFieldList5145); if (state.failed) return retval;
            	    pushFollow(FOLLOW_anonTypeField_in_anonTypeFieldList5148);
            	    anonTypeField422=anonTypeField();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, anonTypeField422.getTree());

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
    // Haxe.g:517:1: objLit : '{' objLitElemList '}' ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 86) ) { return retval; }
            // Haxe.g:517:9: ( '{' objLitElemList '}' )
            // Haxe.g:517:11: '{' objLitElemList '}'
            {
            root_0 = (Object)adaptor.nil();

            char_literal423=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_objLit5164); if (state.failed) return retval;
            pushFollow(FOLLOW_objLitElemList_in_objLit5167);
            objLitElemList424=objLitElemList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, objLitElemList424.getTree());
            char_literal425=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_objLit5169); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // Haxe.g:520:1: anonTypeField : IDENTIFIER COLON funcType ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 87) ) { return retval; }
            // Haxe.g:521:5: ( IDENTIFIER COLON funcType )
            // Haxe.g:521:10: IDENTIFIER COLON funcType
            {
            root_0 = (Object)adaptor.nil();

            IDENTIFIER426=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_anonTypeField5194); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER426_tree = (Object)adaptor.create(IDENTIFIER426);
            adaptor.addChild(root_0, IDENTIFIER426_tree);
            }
            COLON427=(Token)match(input,COLON,FOLLOW_COLON_in_anonTypeField5196); if (state.failed) return retval;
            pushFollow(FOLLOW_funcType_in_anonTypeField5199);
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
    // Haxe.g:524:1: objLitElemList : objLitElem ( COMMA objLitElem )* ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 88) ) { return retval; }
            // Haxe.g:525:5: ( objLitElem ( COMMA objLitElem )* )
            // Haxe.g:525:10: objLitElem ( COMMA objLitElem )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_objLitElem_in_objLitElemList5227);
            objLitElem429=objLitElem();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, objLitElem429.getTree());
            // Haxe.g:525:21: ( COMMA objLitElem )*
            loop85:
            do {
                int alt85=2;
                int LA85_0 = input.LA(1);

                if ( (LA85_0==COMMA) ) {
                    alt85=1;
                }


                switch (alt85) {
            	case 1 :
            	    // Haxe.g:525:22: COMMA objLitElem
            	    {
            	    COMMA430=(Token)match(input,COMMA,FOLLOW_COMMA_in_objLitElemList5230); if (state.failed) return retval;
            	    pushFollow(FOLLOW_objLitElem_in_objLitElemList5233);
            	    objLitElem431=objLitElem();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, objLitElem431.getTree());

            	    }
            	    break;

            	default :
            	    break loop85;
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
    // Haxe.g:528:1: objLitElem : IDENTIFIER COLON expr ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 89) ) { return retval; }
            // Haxe.g:529:5: ( IDENTIFIER COLON expr )
            // Haxe.g:529:10: IDENTIFIER COLON expr
            {
            root_0 = (Object)adaptor.nil();

            IDENTIFIER432=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_objLitElem5259); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER432_tree = (Object)adaptor.create(IDENTIFIER432);
            adaptor.addChild(root_0, IDENTIFIER432_tree);
            }
            COLON433=(Token)match(input,COLON,FOLLOW_COLON_in_objLitElem5261); if (state.failed) return retval;
            pushFollow(FOLLOW_expr_in_objLitElem5264);
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
    // Haxe.g:532:1: elementarySymbol : ( LONGLITERAL -> LONGLITERAL[$LONGLITERAL, \"INT\"] | NULL -> ^( NULL[$NULL,\"Unknown<0>\"] ) | INTLITERAL -> INTLITERAL[$INTLITERAL, \"INT\"] | STRINGLITERAL -> STRINGLITERAL[$STRINGLITERAL,\"STRING\"] | CHARLITERAL -> CHARLITERAL[$CHARLITERAL, \"STRING\"] | FLOATNUM -> FLOATNUM[$FLOATNUM, \"FLOAT\"] | TRUE -> TRUE[$TRUE,\"BOOL\"] | FALSE -> FALSE[$FALSE,\"BOOL\"] );
    public final HaxeParser.elementarySymbol_return elementarySymbol() throws RecognitionException {
        HaxeParser.elementarySymbol_return retval = new HaxeParser.elementarySymbol_return();
        retval.start = input.LT(1);
        int elementarySymbol_StartIndex = input.index();
        Object root_0 = null;

        Token LONGLITERAL435=null;
        Token NULL436=null;
        Token INTLITERAL437=null;
        Token STRINGLITERAL438=null;
        Token CHARLITERAL439=null;
        Token FLOATNUM440=null;
        Token TRUE441=null;
        Token FALSE442=null;

        Object LONGLITERAL435_tree=null;
        Object NULL436_tree=null;
        Object INTLITERAL437_tree=null;
        Object STRINGLITERAL438_tree=null;
        Object CHARLITERAL439_tree=null;
        Object FLOATNUM440_tree=null;
        Object TRUE441_tree=null;
        Object FALSE442_tree=null;
        RewriteRuleTokenStream stream_INTLITERAL=new RewriteRuleTokenStream(adaptor,"token INTLITERAL");
        RewriteRuleTokenStream stream_FALSE=new RewriteRuleTokenStream(adaptor,"token FALSE");
        RewriteRuleTokenStream stream_TRUE=new RewriteRuleTokenStream(adaptor,"token TRUE");
        RewriteRuleTokenStream stream_FLOATNUM=new RewriteRuleTokenStream(adaptor,"token FLOATNUM");
        RewriteRuleTokenStream stream_STRINGLITERAL=new RewriteRuleTokenStream(adaptor,"token STRINGLITERAL");
        RewriteRuleTokenStream stream_NULL=new RewriteRuleTokenStream(adaptor,"token NULL");
        RewriteRuleTokenStream stream_CHARLITERAL=new RewriteRuleTokenStream(adaptor,"token CHARLITERAL");
        RewriteRuleTokenStream stream_LONGLITERAL=new RewriteRuleTokenStream(adaptor,"token LONGLITERAL");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 90) ) { return retval; }
            // Haxe.g:533:5: ( LONGLITERAL -> LONGLITERAL[$LONGLITERAL, \"INT\"] | NULL -> ^( NULL[$NULL,\"Unknown<0>\"] ) | INTLITERAL -> INTLITERAL[$INTLITERAL, \"INT\"] | STRINGLITERAL -> STRINGLITERAL[$STRINGLITERAL,\"STRING\"] | CHARLITERAL -> CHARLITERAL[$CHARLITERAL, \"STRING\"] | FLOATNUM -> FLOATNUM[$FLOATNUM, \"FLOAT\"] | TRUE -> TRUE[$TRUE,\"BOOL\"] | FALSE -> FALSE[$FALSE,\"BOOL\"] )
            int alt86=8;
            switch ( input.LA(1) ) {
            case LONGLITERAL:
                {
                alt86=1;
                }
                break;
            case NULL:
                {
                alt86=2;
                }
                break;
            case INTLITERAL:
                {
                alt86=3;
                }
                break;
            case STRINGLITERAL:
                {
                alt86=4;
                }
                break;
            case CHARLITERAL:
                {
                alt86=5;
                }
                break;
            case FLOATNUM:
                {
                alt86=6;
                }
                break;
            case TRUE:
                {
                alt86=7;
                }
                break;
            case FALSE:
                {
                alt86=8;
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
                    // Haxe.g:533:9: LONGLITERAL
                    {
                    LONGLITERAL435=(Token)match(input,LONGLITERAL,FOLLOW_LONGLITERAL_in_elementarySymbol5287); if (state.failed) return retval; 
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
                    // 533:24: -> LONGLITERAL[$LONGLITERAL, \"INT\"]
                    {
                        adaptor.addChild(root_0, new Constant(LONGLITERAL, LONGLITERAL435, "INT"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // Haxe.g:534:9: NULL
                    {
                    NULL436=(Token)match(input,NULL,FOLLOW_NULL_in_elementarySymbol5308); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NULL.add(NULL436);



                    // AST REWRITE
                    // elements: NULL
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 534:14: -> ^( NULL[$NULL,\"Unknown<0>\"] )
                    {
                        // Haxe.g:534:17: ^( NULL[$NULL,\"Unknown<0>\"] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new Constant(NULL, NULL436, "Unknown<0>"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // Haxe.g:535:9: INTLITERAL
                    {
                    INTLITERAL437=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_elementarySymbol5328); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INTLITERAL.add(INTLITERAL437);



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
                    // 535:23: -> INTLITERAL[$INTLITERAL, \"INT\"]
                    {
                        adaptor.addChild(root_0, new Constant(INTLITERAL, INTLITERAL437, "INT"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // Haxe.g:536:9: STRINGLITERAL
                    {
                    STRINGLITERAL438=(Token)match(input,STRINGLITERAL,FOLLOW_STRINGLITERAL_in_elementarySymbol5349); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STRINGLITERAL.add(STRINGLITERAL438);



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
                    // 536:26: -> STRINGLITERAL[$STRINGLITERAL,\"STRING\"]
                    {
                        adaptor.addChild(root_0, new Constant(STRINGLITERAL, STRINGLITERAL438, "STRING"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // Haxe.g:537:9: CHARLITERAL
                    {
                    CHARLITERAL439=(Token)match(input,CHARLITERAL,FOLLOW_CHARLITERAL_in_elementarySymbol5370); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CHARLITERAL.add(CHARLITERAL439);



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
                    // 537:24: -> CHARLITERAL[$CHARLITERAL, \"STRING\"]
                    {
                        adaptor.addChild(root_0, new Constant(CHARLITERAL, CHARLITERAL439, "STRING"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    // Haxe.g:538:9: FLOATNUM
                    {
                    FLOATNUM440=(Token)match(input,FLOATNUM,FOLLOW_FLOATNUM_in_elementarySymbol5391); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FLOATNUM.add(FLOATNUM440);



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
                    // 538:21: -> FLOATNUM[$FLOATNUM, \"FLOAT\"]
                    {
                        adaptor.addChild(root_0, new Constant(FLOATNUM, FLOATNUM440, "FLOAT"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 7 :
                    // Haxe.g:539:9: TRUE
                    {
                    TRUE441=(Token)match(input,TRUE,FOLLOW_TRUE_in_elementarySymbol5412); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TRUE.add(TRUE441);



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
                    // 539:21: -> TRUE[$TRUE,\"BOOL\"]
                    {
                        adaptor.addChild(root_0, new Constant(TRUE, TRUE441, "BOOL"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 8 :
                    // Haxe.g:540:9: FALSE
                    {
                    FALSE442=(Token)match(input,FALSE,FOLLOW_FALSE_in_elementarySymbol5437); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FALSE.add(FALSE442);



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
                    // 540:22: -> FALSE[$FALSE,\"BOOL\"]
                    {
                        adaptor.addChild(root_0, new Constant(FALSE, FALSE442, "BOOL"));

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

    // $ANTLR start synpred28_Haxe
    public final void synpred28_Haxe_fragment() throws RecognitionException {   
        // Haxe.g:150:44: ( typeTagOpt )
        // Haxe.g:150:44: typeTagOpt
        {
        pushFollow(FOLLOW_typeTagOpt_in_synpred28_Haxe931);
        typeTagOpt();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred28_Haxe

    // $ANTLR start synpred34_Haxe
    public final void synpred34_Haxe_fragment() throws RecognitionException {   
        // Haxe.g:194:10: ( ( type ) ( MINUS_BIGGER type )* )
        // Haxe.g:194:10: ( type ) ( MINUS_BIGGER type )*
        {
        // Haxe.g:194:10: ( type )
        // Haxe.g:194:11: type
        {
        pushFollow(FOLLOW_type_in_synpred34_Haxe1136);
        type();

        state._fsp--;
        if (state.failed) return ;

        }

        // Haxe.g:194:17: ( MINUS_BIGGER type )*
        loop89:
        do {
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==MINUS_BIGGER) ) {
                alt89=1;
            }


            switch (alt89) {
        	case 1 :
        	    // Haxe.g:194:18: MINUS_BIGGER type
        	    {
        	    match(input,MINUS_BIGGER,FOLLOW_MINUS_BIGGER_in_synpred34_Haxe1140); if (state.failed) return ;
        	    pushFollow(FOLLOW_type_in_synpred34_Haxe1143);
        	    type();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop89;
            }
        } while (true);


        }
    }
    // $ANTLR end synpred34_Haxe

    // $ANTLR start synpred41_Haxe
    public final void synpred41_Haxe_fragment() throws RecognitionException {   
        // Haxe.g:202:54: ( typeParam )
        // Haxe.g:202:54: typeParam
        {
        pushFollow(FOLLOW_typeParam_in_synpred41_Haxe1229);
        typeParam();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred41_Haxe

    // $ANTLR start synpred42_Haxe
    public final void synpred42_Haxe_fragment() throws RecognitionException {   
        // Haxe.g:202:14: ( ( anonType | dotIdent | primitiveType ) ( typeParam )* )
        // Haxe.g:202:14: ( anonType | dotIdent | primitiveType ) ( typeParam )*
        {
        // Haxe.g:202:14: ( anonType | dotIdent | primitiveType )
        int alt90=3;
        switch ( input.LA(1) ) {
        case LBRACE:
            {
            alt90=1;
            }
            break;
        case IDENTIFIER:
        case THIS:
            {
            alt90=2;
            }
            break;
        case DYNAMIC:
        case VOID:
        case INT:
        case FLOAT:
        case BOOLEAN:
            {
            alt90=3;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 90, 0, input);

            throw nvae;
        }

        switch (alt90) {
            case 1 :
                // Haxe.g:202:15: anonType
                {
                pushFollow(FOLLOW_anonType_in_synpred42_Haxe1216);
                anonType();

                state._fsp--;
                if (state.failed) return ;

                }
                break;
            case 2 :
                // Haxe.g:202:26: dotIdent
                {
                pushFollow(FOLLOW_dotIdent_in_synpred42_Haxe1220);
                dotIdent();

                state._fsp--;
                if (state.failed) return ;

                }
                break;
            case 3 :
                // Haxe.g:202:37: primitiveType
                {
                pushFollow(FOLLOW_primitiveType_in_synpred42_Haxe1224);
                primitiveType();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }

        // Haxe.g:202:53: ( typeParam )*
        loop91:
        do {
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==LT) ) {
                alt91=1;
            }


            switch (alt91) {
        	case 1 :
        	    // Haxe.g:202:54: typeParam
        	    {
        	    pushFollow(FOLLOW_typeParam_in_synpred42_Haxe1229);
        	    typeParam();

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
    // $ANTLR end synpred42_Haxe

    // $ANTLR start synpred43_Haxe
    public final void synpred43_Haxe_fragment() throws RecognitionException {   
        // Haxe.g:207:10: ( LT typeList GT )
        // Haxe.g:207:10: LT typeList GT
        {
        match(input,LT,FOLLOW_LT_in_synpred43_Haxe1273); if (state.failed) return ;
        pushFollow(FOLLOW_typeList_in_synpred43_Haxe1276);
        typeList();

        state._fsp--;
        if (state.failed) return ;
        match(input,GT,FOLLOW_GT_in_synpred43_Haxe1278); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred43_Haxe

    // $ANTLR start synpred44_Haxe
    public final void synpred44_Haxe_fragment() throws RecognitionException {   
        // Haxe.g:208:10: ( LT typeList LT typeList GTGT )
        // Haxe.g:208:10: LT typeList LT typeList GTGT
        {
        match(input,LT,FOLLOW_LT_in_synpred44_Haxe1290); if (state.failed) return ;
        pushFollow(FOLLOW_typeList_in_synpred44_Haxe1293);
        typeList();

        state._fsp--;
        if (state.failed) return ;
        match(input,LT,FOLLOW_LT_in_synpred44_Haxe1295); if (state.failed) return ;
        pushFollow(FOLLOW_typeList_in_synpred44_Haxe1298);
        typeList();

        state._fsp--;
        if (state.failed) return ;
        match(input,GTGT,FOLLOW_GTGT_in_synpred44_Haxe1300); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred44_Haxe

    // $ANTLR start synpred45_Haxe
    public final void synpred45_Haxe_fragment() throws RecognitionException {   
        // Haxe.g:214:10: ( typeParam )
        // Haxe.g:214:10: typeParam
        {
        pushFollow(FOLLOW_typeParam_in_synpred45_Haxe1359);
        typeParam();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred45_Haxe

    // $ANTLR start synpred47_Haxe
    public final void synpred47_Haxe_fragment() throws RecognitionException {   
        // Haxe.g:228:10: ( block )
        // Haxe.g:228:10: block
        {
        pushFollow(FOLLOW_block_in_synpred47_Haxe1518);
        block();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred47_Haxe

    // $ANTLR start synpred48_Haxe
    public final void synpred48_Haxe_fragment() throws RecognitionException {   
        // Haxe.g:229:10: ( assignExpr SEMI )
        // Haxe.g:229:10: assignExpr SEMI
        {
        pushFollow(FOLLOW_assignExpr_in_synpred48_Haxe1529);
        assignExpr();

        state._fsp--;
        if (state.failed) return ;
        match(input,SEMI,FOLLOW_SEMI_in_synpred48_Haxe1531); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred48_Haxe

    // $ANTLR start synpred50_Haxe
    public final void synpred50_Haxe_fragment() throws RecognitionException {   
        HaxeParser.statement_return st2 = null;


        // Haxe.g:231:42: ( ELSE st2= statement )
        // Haxe.g:231:42: ELSE st2= statement
        {
        match(input,ELSE,FOLLOW_ELSE_in_synpred50_Haxe1563); if (state.failed) return ;
        pushFollow(FOLLOW_statement_in_synpred50_Haxe1567);
        st2=statement();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred50_Haxe

    // $ANTLR start synpred65_Haxe
    public final void synpred65_Haxe_fragment() throws RecognitionException {   
        // Haxe.g:241:10: ( expr SEMI )
        // Haxe.g:241:10: expr SEMI
        {
        pushFollow(FOLLOW_expr_in_synpred65_Haxe2025);
        expr();

        state._fsp--;
        if (state.failed) return ;
        match(input,SEMI,FOLLOW_SEMI_in_synpred65_Haxe2028); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred65_Haxe

    // $ANTLR start synpred66_Haxe
    public final void synpred66_Haxe_fragment() throws RecognitionException {   
        // Haxe.g:242:10: ( IDENTIFIER COLON statement )
        // Haxe.g:242:10: IDENTIFIER COLON statement
        {
        match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_synpred66_Haxe2040); if (state.failed) return ;
        match(input,COLON,FOLLOW_COLON_in_synpred66_Haxe2042); if (state.failed) return ;
        pushFollow(FOLLOW_statement_in_synpred66_Haxe2044);
        statement();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred66_Haxe

    // $ANTLR start synpred69_Haxe
    public final void synpred69_Haxe_fragment() throws RecognitionException {   
        // Haxe.g:255:10: ( varDecl )
        // Haxe.g:255:10: varDecl
        {
        pushFollow(FOLLOW_varDecl_in_synpred69_Haxe2202);
        varDecl();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred69_Haxe

    // $ANTLR start synpred70_Haxe
    public final void synpred70_Haxe_fragment() throws RecognitionException {   
        // Haxe.g:256:10: ( classDecl )
        // Haxe.g:256:10: classDecl
        {
        pushFollow(FOLLOW_classDecl_in_synpred70_Haxe2213);
        classDecl();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred70_Haxe

    // $ANTLR start synpred106_Haxe
    public final void synpred106_Haxe_fragment() throws RecognitionException {   
        // Haxe.g:346:10: ( value methodCallOrSliceList )
        // Haxe.g:346:10: value methodCallOrSliceList
        {
        pushFollow(FOLLOW_value_in_synpred106_Haxe3047);
        value();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_methodCallOrSliceList_in_synpred106_Haxe3049);
        methodCallOrSliceList();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred106_Haxe

    // $ANTLR start synpred107_Haxe
    public final void synpred107_Haxe_fragment() throws RecognitionException {   
        // Haxe.g:347:10: ( value PLUSPLUS )
        // Haxe.g:347:10: value PLUSPLUS
        {
        pushFollow(FOLLOW_value_in_synpred107_Haxe3076);
        value();

        state._fsp--;
        if (state.failed) return ;
        match(input,PLUSPLUS,FOLLOW_PLUSPLUS_in_synpred107_Haxe3078); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred107_Haxe

    // $ANTLR start synpred108_Haxe
    public final void synpred108_Haxe_fragment() throws RecognitionException {   
        // Haxe.g:348:10: ( value SUBSUB )
        // Haxe.g:348:10: value SUBSUB
        {
        pushFollow(FOLLOW_value_in_synpred108_Haxe3117);
        value();

        state._fsp--;
        if (state.failed) return ;
        match(input,SUBSUB,FOLLOW_SUBSUB_in_synpred108_Haxe3119); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred108_Haxe

    // $ANTLR start synpred110_Haxe
    public final void synpred110_Haxe_fragment() throws RecognitionException {   
        // Haxe.g:358:10: ( methodCallOrSlice methodCallOrSliceList )
        // Haxe.g:358:10: methodCallOrSlice methodCallOrSliceList
        {
        pushFollow(FOLLOW_methodCallOrSlice_in_synpred110_Haxe3244);
        methodCallOrSlice();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_methodCallOrSliceList_in_synpred110_Haxe3246);
        methodCallOrSliceList();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred110_Haxe

    // $ANTLR start synpred115_Haxe
    public final void synpred115_Haxe_fragment() throws RecognitionException {   
        // Haxe.g:367:18: ( expr )
        // Haxe.g:367:18: expr
        {
        pushFollow(FOLLOW_expr_in_synpred115_Haxe3321);
        expr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred115_Haxe

    // $ANTLR start synpred118_Haxe
    public final void synpred118_Haxe_fragment() throws RecognitionException {   
        // Haxe.g:375:13: ( CAST LPAREN expr ( COMMA funcType )? RPAREN )
        // Haxe.g:375:13: CAST LPAREN expr ( COMMA funcType )? RPAREN
        {
        match(input,CAST,FOLLOW_CAST_in_synpred118_Haxe3405); if (state.failed) return ;
        match(input,LPAREN,FOLLOW_LPAREN_in_synpred118_Haxe3407); if (state.failed) return ;
        pushFollow(FOLLOW_expr_in_synpred118_Haxe3409);
        expr();

        state._fsp--;
        if (state.failed) return ;
        // Haxe.g:375:30: ( COMMA funcType )?
        int alt99=2;
        int LA99_0 = input.LA(1);

        if ( (LA99_0==COMMA) ) {
            alt99=1;
        }
        switch (alt99) {
            case 1 :
                // Haxe.g:375:31: COMMA funcType
                {
                match(input,COMMA,FOLLOW_COMMA_in_synpred118_Haxe3412); if (state.failed) return ;
                pushFollow(FOLLOW_funcType_in_synpred118_Haxe3414);
                funcType();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }

        match(input,RPAREN,FOLLOW_RPAREN_in_synpred118_Haxe3418); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred118_Haxe

    // $ANTLR start synpred119_Haxe
    public final void synpred119_Haxe_fragment() throws RecognitionException {   
        // Haxe.g:383:9: ( classDecl )
        // Haxe.g:383:9: classDecl
        {
        pushFollow(FOLLOW_classDecl_in_synpred119_Haxe3517);
        classDecl();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred119_Haxe

    // $ANTLR start synpred120_Haxe
    public final void synpred120_Haxe_fragment() throws RecognitionException {   
        // Haxe.g:384:9: ( interfaceDecl )
        // Haxe.g:384:9: interfaceDecl
        {
        pushFollow(FOLLOW_interfaceDecl_in_synpred120_Haxe3527);
        interfaceDecl();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred120_Haxe

    // $ANTLR start synpred121_Haxe
    public final void synpred121_Haxe_fragment() throws RecognitionException {   
        // Haxe.g:385:9: ( enumDecl )
        // Haxe.g:385:9: enumDecl
        {
        pushFollow(FOLLOW_enumDecl_in_synpred121_Haxe3537);
        enumDecl();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred121_Haxe

    // Delegated rules

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
    public final boolean synpred110_Haxe() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred110_Haxe_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred118_Haxe() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred118_Haxe_fragment(); // can never throw exception
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


    protected DFA26 dfa26 = new DFA26(this);
    protected DFA25 dfa25 = new DFA25(this);
    protected DFA28 dfa28 = new DFA28(this);
    protected DFA35 dfa35 = new DFA35(this);
    protected DFA38 dfa38 = new DFA38(this);
    protected DFA58 dfa58 = new DFA58(this);
    protected DFA61 dfa61 = new DFA61(this);
    protected DFA74 dfa74 = new DFA74(this);
    protected DFA75 dfa75 = new DFA75(this);
    protected DFA77 dfa77 = new DFA77(this);
    protected DFA78 dfa78 = new DFA78(this);
    static final String DFA26_eotS =
        "\32\uffff";
    static final String DFA26_eofS =
        "\1\4\31\uffff";
    static final String DFA26_minS =
        "\1\22\1\0\30\uffff";
    static final String DFA26_maxS =
        "\1\146\1\0\30\uffff";
    static final String DFA26_acceptS =
        "\2\uffff\1\1\1\uffff\1\2\25\uffff";
    static final String DFA26_specialS =
        "\1\uffff\1\0\30\uffff}>";
    static final String[] DFA26_transitionS = {
            "\4\4\1\2\1\uffff\2\4\1\uffff\2\4\3\uffff\1\2\1\uffff\1\4\1"+
            "\uffff\1\2\1\4\10\uffff\1\4\4\2\4\4\11\uffff\1\1\1\4\35\uffff"+
            "\1\4\2\uffff\5\4",
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
            return "202:1: type : ( ( anonType | dotIdent | primitiveType ) ( typeParam )* | );";
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
        "\1\22\2\uffff\1\0\25\uffff";
    static final String DFA25_maxS =
        "\1\146\2\uffff\1\0\25\uffff";
    static final String DFA25_acceptS =
        "\1\uffff\1\2\26\uffff\1\1";
    static final String DFA25_specialS =
        "\3\uffff\1\0\25\uffff}>";
    static final String[] DFA25_transitionS = {
            "\4\1\2\uffff\2\1\1\uffff\2\1\5\uffff\1\1\2\uffff\1\1\10\uffff"+
            "\1\1\4\uffff\1\3\3\1\11\uffff\2\1\35\uffff\1\1\2\uffff\5\1",
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
            return "()* loopback of 202:53: ( typeParam )*";
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
        "\1\22\1\0\46\uffff";
    static final String DFA28_maxS =
        "\1\145\1\0\46\uffff";
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
            return "213:1: typeParamOpt : ( typeParam -> ^( TYPE_PARAM_OPT[\"TYPE_PARAM_OPT\",true] ( typeParam )? ) | );";
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
        "\50\uffff";
    static final String DFA35_eofS =
        "\50\uffff";
    static final String DFA35_minS =
        "\1\22\21\0\21\uffff\1\0\4\uffff";
    static final String DFA35_maxS =
        "\1\155\21\0\21\uffff\1\0\4\uffff";
    static final String DFA35_acceptS =
        "\22\uffff\1\3\5\uffff\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
        "\1\15\1\16\1\uffff\1\1\1\2\1\20\1\17";
    static final String DFA35_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"+
        "\14\1\15\1\16\1\17\1\20\21\uffff\1\21\4\uffff}>";
    static final String[] DFA35_transitionS = {
            "\1\2\1\uffff\1\20\1\uffff\1\21\2\uffff\1\22\3\uffff\5\22\2"+
            "\uffff\1\43\6\uffff\1\6\1\7\12\uffff\1\4\1\30\1\uffff\1\31\1"+
            "\uffff\1\32\1\33\1\34\1\35\1\1\1\uffff\1\36\1\37\1\40\1\41\3"+
            "\uffff\1\42\13\uffff\2\3\3\uffff\4\3\1\5\1\uffff\1\22\1\11\5"+
            "\uffff\1\10\1\12\1\13\1\14\1\15\1\16\1\17",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
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
            return "227:1: statement : ( block | assignExpr SEMI | varDecl | IF parExpression st1= statement ( ELSE st2= statement )? -> ^( IF parExpression $st1 ( ^( ELSE $st2) )? ) | FOR LPAREN exp1= expr IN exp2= expr RPAREN statement -> ^( FOR ^( IN $exp1 $exp2) ( statement )? ) | WHILE parExpression statement -> ^( WHILE ( parExpression )? ( statement )? ) | DO statement WHILE parExpression SEMI -> ^( DO ( parExpression )? ( statement )? ) | TRY block catchStmtList -> ^( TRY ( block )? ( catchStmtList )? ) | SWITCH LPAREN expr RPAREN LBRACE ( caseStmt )+ RBRACE -> ^( SWITCH ( expr )? ( caseStmt )+ ) | RETURN ( expr )? SEMI -> ^( RETURN ( expr )? ) | THROW expr SEMI -> ^( THROW ( expr )? ) | BREAK ( IDENTIFIER )? SEMI -> ^( BREAK ( IDENTIFIER )? ) | CONTINUE ( IDENTIFIER )? SEMI -> ^( CONTINUE ( IDENTIFIER )? ) | expr SEMI | IDENTIFIER COLON statement -> ^( COLON ( IDENTIFIER )? ( statement )? ) | SEMI );";
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
                        if ( (synpred47_Haxe()) ) {s = 36;}

                        else if ( (synpred48_Haxe()) ) {s = 37;}

                        else if ( (synpred65_Haxe()) ) {s = 34;}

                         
                        input.seek(index35_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA35_2 = input.LA(1);

                         
                        int index35_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred47_Haxe()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index35_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA35_3 = input.LA(1);

                         
                        int index35_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_Haxe()) ) {s = 37;}

                        else if ( (synpred65_Haxe()) ) {s = 34;}

                         
                        input.seek(index35_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA35_4 = input.LA(1);

                         
                        int index35_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_Haxe()) ) {s = 37;}

                        else if ( (synpred65_Haxe()) ) {s = 34;}

                         
                        input.seek(index35_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA35_5 = input.LA(1);

                         
                        int index35_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_Haxe()) ) {s = 37;}

                        else if ( (synpred65_Haxe()) ) {s = 34;}

                         
                        input.seek(index35_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA35_6 = input.LA(1);

                         
                        int index35_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_Haxe()) ) {s = 37;}

                        else if ( (synpred65_Haxe()) ) {s = 34;}

                         
                        input.seek(index35_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA35_7 = input.LA(1);

                         
                        int index35_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_Haxe()) ) {s = 37;}

                        else if ( (synpred65_Haxe()) ) {s = 34;}

                         
                        input.seek(index35_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA35_8 = input.LA(1);

                         
                        int index35_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_Haxe()) ) {s = 37;}

                        else if ( (synpred65_Haxe()) ) {s = 34;}

                         
                        input.seek(index35_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA35_9 = input.LA(1);

                         
                        int index35_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_Haxe()) ) {s = 37;}

                        else if ( (synpred65_Haxe()) ) {s = 34;}

                         
                        input.seek(index35_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA35_10 = input.LA(1);

                         
                        int index35_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_Haxe()) ) {s = 37;}

                        else if ( (synpred65_Haxe()) ) {s = 34;}

                         
                        input.seek(index35_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA35_11 = input.LA(1);

                         
                        int index35_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_Haxe()) ) {s = 37;}

                        else if ( (synpred65_Haxe()) ) {s = 34;}

                         
                        input.seek(index35_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA35_12 = input.LA(1);

                         
                        int index35_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_Haxe()) ) {s = 37;}

                        else if ( (synpred65_Haxe()) ) {s = 34;}

                         
                        input.seek(index35_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA35_13 = input.LA(1);

                         
                        int index35_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_Haxe()) ) {s = 37;}

                        else if ( (synpred65_Haxe()) ) {s = 34;}

                         
                        input.seek(index35_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA35_14 = input.LA(1);

                         
                        int index35_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_Haxe()) ) {s = 37;}

                        else if ( (synpred65_Haxe()) ) {s = 34;}

                         
                        input.seek(index35_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA35_15 = input.LA(1);

                         
                        int index35_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_Haxe()) ) {s = 37;}

                        else if ( (synpred65_Haxe()) ) {s = 34;}

                         
                        input.seek(index35_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA35_16 = input.LA(1);

                         
                        int index35_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_Haxe()) ) {s = 37;}

                        else if ( (synpred65_Haxe()) ) {s = 34;}

                         
                        input.seek(index35_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA35_17 = input.LA(1);

                         
                        int index35_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_Haxe()) ) {s = 37;}

                        else if ( (synpred65_Haxe()) ) {s = 34;}

                        else if ( (synpred66_Haxe()) ) {s = 39;}

                         
                        input.seek(index35_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA35_35 = input.LA(1);

                         
                        int index35_35 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_Haxe()) ) {s = 37;}

                        else if ( (synpred65_Haxe()) ) {s = 34;}

                         
                        input.seek(index35_35);
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
        "\51\uffff";
    static final String DFA38_eofS =
        "\51\uffff";
    static final String DFA38_minS =
        "\1\22\6\0\1\uffff\1\0\40\uffff";
    static final String DFA38_maxS =
        "\1\155\6\0\1\uffff\1\0\40\uffff";
    static final String DFA38_acceptS =
        "\7\uffff\1\2\3\uffff\1\3\34\uffff\1\1";
    static final String DFA38_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\uffff\1\6\40\uffff}>";
    static final String[] DFA38_transitionS = {
            "\1\13\1\7\1\13\1\uffff\1\13\1\uffff\1\7\1\5\3\uffff\1\10\1"+
            "\1\1\2\1\3\1\4\2\uffff\1\13\6\uffff\2\13\12\uffff\2\13\1\uffff"+
            "\1\13\1\uffff\5\13\1\uffff\4\13\3\uffff\1\13\13\uffff\2\13\3"+
            "\uffff\5\13\1\uffff\1\6\1\13\1\7\4\uffff\7\13",
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
            return "254:1: blockStmt : ( varDecl | classDecl | statement );";
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
                        if ( (synpred69_Haxe()) ) {s = 40;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index38_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA38_2 = input.LA(1);

                         
                        int index38_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred69_Haxe()) ) {s = 40;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index38_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA38_3 = input.LA(1);

                         
                        int index38_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred69_Haxe()) ) {s = 40;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index38_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA38_4 = input.LA(1);

                         
                        int index38_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred69_Haxe()) ) {s = 40;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index38_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA38_5 = input.LA(1);

                         
                        int index38_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred69_Haxe()) ) {s = 40;}

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
                        if ( (synpred69_Haxe()) ) {s = 40;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index38_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA38_8 = input.LA(1);

                         
                        int index38_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred69_Haxe()) ) {s = 40;}

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
    static final String DFA58_eotS =
        "\22\uffff";
    static final String DFA58_eofS =
        "\22\uffff";
    static final String DFA58_minS =
        "\1\24\15\0\4\uffff";
    static final String DFA58_maxS =
        "\1\155\15\0\4\uffff";
    static final String DFA58_acceptS =
        "\16\uffff\1\1\1\2\1\3\1\4";
    static final String DFA58_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"+
        "\14\4\uffff}>";
    static final String[] DFA58_transitionS = {
            "\1\14\1\uffff\1\15\15\uffff\1\15\6\uffff\1\1\1\2\23\uffff\1"+
            "\3\40\uffff\1\5\5\uffff\1\4\1\6\1\7\1\10\1\11\1\12\1\13",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
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
            return "345:1: suffixExpr : ( value methodCallOrSliceList -> ^( SUFFIX_EXPR[\"CallOrSlice\",true] ( value )? ( methodCallOrSliceList )? ) | value PLUSPLUS -> ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] ( value )? ( PLUSPLUS )? ) | value SUBSUB -> ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] ( value )? SUBSUB ) | value typeParamOpt );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA58_1 = input.LA(1);

                         
                        int index58_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred106_Haxe()) ) {s = 14;}

                        else if ( (synpred107_Haxe()) ) {s = 15;}

                        else if ( (synpred108_Haxe()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index58_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA58_2 = input.LA(1);

                         
                        int index58_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred106_Haxe()) ) {s = 14;}

                        else if ( (synpred107_Haxe()) ) {s = 15;}

                        else if ( (synpred108_Haxe()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index58_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA58_3 = input.LA(1);

                         
                        int index58_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred106_Haxe()) ) {s = 14;}

                        else if ( (synpred107_Haxe()) ) {s = 15;}

                        else if ( (synpred108_Haxe()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index58_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA58_4 = input.LA(1);

                         
                        int index58_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred106_Haxe()) ) {s = 14;}

                        else if ( (synpred107_Haxe()) ) {s = 15;}

                        else if ( (synpred108_Haxe()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index58_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA58_5 = input.LA(1);

                         
                        int index58_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred106_Haxe()) ) {s = 14;}

                        else if ( (synpred107_Haxe()) ) {s = 15;}

                        else if ( (synpred108_Haxe()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index58_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA58_6 = input.LA(1);

                         
                        int index58_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred106_Haxe()) ) {s = 14;}

                        else if ( (synpred107_Haxe()) ) {s = 15;}

                        else if ( (synpred108_Haxe()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index58_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA58_7 = input.LA(1);

                         
                        int index58_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred106_Haxe()) ) {s = 14;}

                        else if ( (synpred107_Haxe()) ) {s = 15;}

                        else if ( (synpred108_Haxe()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index58_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA58_8 = input.LA(1);

                         
                        int index58_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred106_Haxe()) ) {s = 14;}

                        else if ( (synpred107_Haxe()) ) {s = 15;}

                        else if ( (synpred108_Haxe()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index58_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA58_9 = input.LA(1);

                         
                        int index58_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred106_Haxe()) ) {s = 14;}

                        else if ( (synpred107_Haxe()) ) {s = 15;}

                        else if ( (synpred108_Haxe()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index58_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA58_10 = input.LA(1);

                         
                        int index58_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred106_Haxe()) ) {s = 14;}

                        else if ( (synpred107_Haxe()) ) {s = 15;}

                        else if ( (synpred108_Haxe()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index58_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA58_11 = input.LA(1);

                         
                        int index58_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred106_Haxe()) ) {s = 14;}

                        else if ( (synpred107_Haxe()) ) {s = 15;}

                        else if ( (synpred108_Haxe()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index58_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA58_12 = input.LA(1);

                         
                        int index58_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred106_Haxe()) ) {s = 14;}

                        else if ( (synpred107_Haxe()) ) {s = 15;}

                        else if ( (synpred108_Haxe()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index58_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA58_13 = input.LA(1);

                         
                        int index58_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred106_Haxe()) ) {s = 14;}

                        else if ( (synpred107_Haxe()) ) {s = 15;}

                        else if ( (synpred108_Haxe()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index58_13);
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
    static final String DFA61_eotS =
        "\45\uffff";
    static final String DFA61_eofS =
        "\45\uffff";
    static final String DFA61_minS =
        "\1\22\21\0\21\uffff\1\0\1\uffff";
    static final String DFA61_maxS =
        "\1\155\21\0\21\uffff\1\0\1\uffff";
    static final String DFA61_acceptS =
        "\22\uffff\1\2\21\uffff\1\1";
    static final String DFA61_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"+
        "\14\1\15\1\16\1\17\1\20\21\uffff\1\21\1\uffff}>";
    static final String[] DFA61_transitionS = {
            "\1\22\1\uffff\1\17\1\uffff\1\20\2\uffff\1\22\3\uffff\5\22\2"+
            "\uffff\1\43\6\uffff\1\4\1\5\12\uffff\1\2\1\22\1\uffff\1\22\1"+
            "\uffff\4\22\1\6\1\uffff\4\22\3\uffff\1\21\13\uffff\2\1\3\uffff"+
            "\4\1\1\3\1\uffff\1\22\1\10\5\uffff\1\7\1\11\1\12\1\13\1\14\1"+
            "\15\1\16",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
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
            return "367:17: ( expr | statement )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA61_1 = input.LA(1);

                         
                        int index61_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred115_Haxe()) ) {s = 36;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index61_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA61_2 = input.LA(1);

                         
                        int index61_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred115_Haxe()) ) {s = 36;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index61_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA61_3 = input.LA(1);

                         
                        int index61_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred115_Haxe()) ) {s = 36;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index61_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA61_4 = input.LA(1);

                         
                        int index61_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred115_Haxe()) ) {s = 36;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index61_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA61_5 = input.LA(1);

                         
                        int index61_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred115_Haxe()) ) {s = 36;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index61_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA61_6 = input.LA(1);

                         
                        int index61_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred115_Haxe()) ) {s = 36;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index61_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA61_7 = input.LA(1);

                         
                        int index61_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred115_Haxe()) ) {s = 36;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index61_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA61_8 = input.LA(1);

                         
                        int index61_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred115_Haxe()) ) {s = 36;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index61_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA61_9 = input.LA(1);

                         
                        int index61_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred115_Haxe()) ) {s = 36;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index61_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA61_10 = input.LA(1);

                         
                        int index61_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred115_Haxe()) ) {s = 36;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index61_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA61_11 = input.LA(1);

                         
                        int index61_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred115_Haxe()) ) {s = 36;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index61_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA61_12 = input.LA(1);

                         
                        int index61_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred115_Haxe()) ) {s = 36;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index61_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA61_13 = input.LA(1);

                         
                        int index61_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred115_Haxe()) ) {s = 36;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index61_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA61_14 = input.LA(1);

                         
                        int index61_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred115_Haxe()) ) {s = 36;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index61_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA61_15 = input.LA(1);

                         
                        int index61_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred115_Haxe()) ) {s = 36;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index61_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA61_16 = input.LA(1);

                         
                        int index61_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred115_Haxe()) ) {s = 36;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index61_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA61_17 = input.LA(1);

                         
                        int index61_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred115_Haxe()) ) {s = 36;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index61_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA61_35 = input.LA(1);

                         
                        int index61_35 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred115_Haxe()) ) {s = 36;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index61_35);
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
    static final String DFA74_eotS =
        "\11\uffff";
    static final String DFA74_eofS =
        "\11\uffff";
    static final String DFA74_minS =
        "\6\31\1\26\2\uffff";
    static final String DFA74_maxS =
        "\6\53\1\67\2\uffff";
    static final String DFA74_acceptS =
        "\7\uffff\1\1\1\2";
    static final String DFA74_specialS =
        "\11\uffff}>";
    static final String[] DFA74_transitionS = {
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
            return "436:1: funcDecl : ( ( declAttrList )? FUNCTION NEW LPAREN paramList RPAREN typeTagOpt block -> ^( FUNCTION NEW ( declAttrList )? ( paramList )? ( typeTagOpt )? ( block )? ) | ( declAttrList )? FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt block -> ^( FUNCTION IDENTIFIER ( declAttrList )? ( paramList )? ( typeTagOpt )? ( block )? ( typeParamOpt )? ) );";
        }
    }
    static final String DFA75_eotS =
        "\14\uffff";
    static final String DFA75_eofS =
        "\14\uffff";
    static final String DFA75_minS =
        "\6\31\2\26\4\uffff";
    static final String DFA75_maxS =
        "\6\53\2\67\4\uffff";
    static final String DFA75_acceptS =
        "\10\uffff\1\3\1\4\1\1\1\2";
    static final String DFA75_specialS =
        "\14\uffff}>";
    static final String[] DFA75_transitionS = {
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

    static final short[] DFA75_eot = DFA.unpackEncodedString(DFA75_eotS);
    static final short[] DFA75_eof = DFA.unpackEncodedString(DFA75_eofS);
    static final char[] DFA75_min = DFA.unpackEncodedStringToUnsignedChars(DFA75_minS);
    static final char[] DFA75_max = DFA.unpackEncodedStringToUnsignedChars(DFA75_maxS);
    static final short[] DFA75_accept = DFA.unpackEncodedString(DFA75_acceptS);
    static final short[] DFA75_special = DFA.unpackEncodedString(DFA75_specialS);
    static final short[][] DFA75_transition;

    static {
        int numStates = DFA75_transitionS.length;
        DFA75_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA75_transition[i] = DFA.unpackEncodedString(DFA75_transitionS[i]);
        }
    }

    class DFA75 extends DFA {

        public DFA75(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 75;
            this.eot = DFA75_eot;
            this.eof = DFA75_eof;
            this.min = DFA75_min;
            this.max = DFA75_max;
            this.accept = DFA75_accept;
            this.special = DFA75_special;
            this.transition = DFA75_transition;
        }
        public String getDescription() {
            return "442:1: funcProtoDecl : ( declAttrList FUNCTION NEW LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTagOpt )? ( declAttrList )? ) | declAttrList FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTagOpt )? ( declAttrList )? ( typeParamOpt )? ) | FUNCTION NEW LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTagOpt )? ) | FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTagOpt )? ( typeParamOpt )? ) );";
        }
    }
    static final String DFA77_eotS =
        "\12\uffff";
    static final String DFA77_eofS =
        "\12\uffff";
    static final String DFA77_minS =
        "\1\23\4\31\1\30\3\uffff\1\31";
    static final String DFA77_maxS =
        "\6\140\3\uffff\1\140";
    static final String DFA77_acceptS =
        "\6\uffff\1\1\1\2\1\3\1\uffff";
    static final String DFA77_specialS =
        "\12\uffff}>";
    static final String[] DFA77_transitionS = {
            "\1\10\4\uffff\1\10\1\5\3\uffff\1\11\1\1\1\2\1\3\1\4\11\uffff"+
            "\1\7\63\uffff\1\10\1\6",
            "\1\11\3\uffff\1\11\1\1\1\2\1\3\1\4\11\uffff\1\7\64\uffff\1"+
            "\6",
            "\1\11\3\uffff\1\11\1\1\1\2\1\3\1\4\11\uffff\1\7\64\uffff\1"+
            "\6",
            "\1\11\3\uffff\1\11\1\1\1\2\1\3\1\4\11\uffff\1\7\64\uffff\1"+
            "\6",
            "\1\11\3\uffff\1\11\1\1\1\2\1\3\1\4\11\uffff\1\7\64\uffff\1"+
            "\6",
            "\1\10\1\5\3\uffff\1\11\1\1\1\2\1\3\1\4\11\uffff\1\7\63\uffff"+
            "\1\10\1\6",
            "",
            "",
            "",
            "\1\11\3\uffff\1\11\1\1\1\2\1\3\1\4\11\uffff\1\7\64\uffff\1"+
            "\6"
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
            return "462:1: classMember : ( varDecl | funcDecl | enumDecl );";
        }
    }
    static final String DFA78_eotS =
        "\11\uffff";
    static final String DFA78_eofS =
        "\1\10\10\uffff";
    static final String DFA78_minS =
        "\6\31\3\uffff";
    static final String DFA78_maxS =
        "\6\140\3\uffff";
    static final String DFA78_acceptS =
        "\6\uffff\1\1\1\2\1\3";
    static final String DFA78_specialS =
        "\11\uffff}>";
    static final String[] DFA78_transitionS = {
            "\1\5\3\uffff\1\5\1\1\1\2\1\3\1\4\11\uffff\1\7\25\uffff\1\10"+
            "\36\uffff\1\6",
            "\1\5\3\uffff\1\5\1\1\1\2\1\3\1\4\11\uffff\1\7\64\uffff\1\6",
            "\1\5\3\uffff\1\5\1\1\1\2\1\3\1\4\11\uffff\1\7\64\uffff\1\6",
            "\1\5\3\uffff\1\5\1\1\1\2\1\3\1\4\11\uffff\1\7\64\uffff\1\6",
            "\1\5\3\uffff\1\5\1\1\1\2\1\3\1\4\11\uffff\1\7\64\uffff\1\6",
            "\1\5\3\uffff\1\5\1\1\1\2\1\3\1\4\11\uffff\1\7\64\uffff\1\6",
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
            return "473:1: interfaceBody : ( varDecl interfaceBody | funcProtoDecl interfaceBody | );";
        }
    }
 

    public static final BitSet FOLLOW_myPackage_in_module172 = new BitSet(new long[]{0x000000001B080000L,0x0000004C80000000L});
    public static final BitSet FOLLOW_topLevelList_in_module175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_topLevel_in_topLevelList213 = new BitSet(new long[]{0x000000001B080002L,0x0000004C80000000L});
    public static final BitSet FOLLOW_myImport_in_topLevel232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_topLevelDecl_in_topLevel241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PACKAGE_in_myPackage258 = new BitSet(new long[]{0x0000001000400000L});
    public static final BitSet FOLLOW_dotIdent_in_myPackage260 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_SEMI_in_myPackage262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MONKEYS_AT_in_meta287 = new BitSet(new long[]{0x0007800100C00000L});
    public static final BitSet FOLLOW_metaName_in_meta289 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_LPAREN_in_meta292 = new BitSet(new long[]{0x0000000800600000L});
    public static final BitSet FOLLOW_paramList_in_meta294 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_RPAREN_in_meta296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_metaName315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveType_in_metaName323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_in_metaName332 = new BitSet(new long[]{0x0007800100C00000L});
    public static final BitSet FOLLOW_metaName_in_metaName334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_meta_in_typeDeclFlags352 = new BitSet(new long[]{0x0000000003080002L});
    public static final BitSet FOLLOW_set_in_typeDeclFlags356 = new BitSet(new long[]{0x0000000003000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_qualifiedIdentifier387 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_DOT_in_qualifiedIdentifier398 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_qualifiedIdentifier402 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_IMPORT_in_myImport440 = new BitSet(new long[]{0x0000001000400000L});
    public static final BitSet FOLLOW_dotIdent_in_myImport443 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_SEMI_in_myImport445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_USING_in_myImport454 = new BitSet(new long[]{0x0000001000400000L});
    public static final BitSet FOLLOW_dotIdent_in_myImport457 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_SEMI_in_myImport459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_access0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STATIC_in_declAttr503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INLINE_in_declAttr511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DYNAMIC_in_declAttr519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OVERRIDE_in_declAttr527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_access_in_declAttr535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttr_in_declAttrList553 = new BitSet(new long[]{0x00000003E2000002L});
    public static final BitSet FOLLOW_param_in_paramList585 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_COMMA_in_paramList588 = new BitSet(new long[]{0x0000000800400000L});
    public static final BitSet FOLLOW_param_in_paramList590 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_QUES_in_param628 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_param631 = new BitSet(new long[]{0x0000002000800000L});
    public static final BitSet FOLLOW_typeTagOpt_in_param633 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_varInit_in_param635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_id0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_dotIdent714 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_DOT_in_dotIdent716 = new BitSet(new long[]{0x0000001000400000L});
    public static final BitSet FOLLOW_dotIdent_in_dotIdent720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_dotIdent747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQ_in_assignOp779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUSEQ_in_assignOp805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUBEQ_in_assignOp828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SLASHEQ_in_assignOp850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PERCENTEQ_in_assignOp872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AMPEQ_in_assignOp894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_in_funcLit923 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_LPAREN_in_funcLit925 = new BitSet(new long[]{0x0000000800600000L});
    public static final BitSet FOLLOW_paramList_in_funcLit927 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_RPAREN_in_funcLit929 = new BitSet(new long[]{0x0000000000840000L,0x0000000000000001L});
    public static final BitSet FOLLOW_typeTagOpt_in_funcLit931 = new BitSet(new long[]{0x0000000000840000L,0x0000000000000001L});
    public static final BitSet FOLLOW_block_in_funcLit934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACKET_in_arrayLit971 = new BitSet(new long[]{0x0080381000500000L,0x00003F827C600201L});
    public static final BitSet FOLLOW_exprListOpt_in_arrayLit974 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_RBRACKET_in_arrayLit976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_in_typeTag1008 = new BitSet(new long[]{0x0007C01100400000L,0x0000000000000001L});
    public static final BitSet FOLLOW_funcType_in_typeTag1011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeTag_in_typeTagOpt1039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_typeList1082 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_COMMA_in_typeList1085 = new BitSet(new long[]{0x0007801500400000L,0x0000000000000001L});
    public static final BitSet FOLLOW_type_in_typeList1088 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_typeConstraint_in_typeList1105 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_COMMA_in_typeList1108 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_typeConstraint_in_typeList1111 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_type_in_funcType1136 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_MINUS_BIGGER_in_funcType1140 = new BitSet(new long[]{0x0007C01100400000L,0x0000000000000001L});
    public static final BitSet FOLLOW_type_in_funcType1143 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_VOID_in_funcType1156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_primitiveType0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_anonType_in_type1216 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_dotIdent_in_type1220 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_primitiveType_in_type1224 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_typeParam_in_type1229 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_LT_in_typeParam1273 = new BitSet(new long[]{0x0007801500400000L,0x0000000000000001L});
    public static final BitSet FOLLOW_typeList_in_typeParam1276 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_GT_in_typeParam1278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_in_typeParam1290 = new BitSet(new long[]{0x0007801500400000L,0x0000000000000001L});
    public static final BitSet FOLLOW_typeList_in_typeParam1293 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_LT_in_typeParam1295 = new BitSet(new long[]{0x0007801500400000L,0x0000000000000001L});
    public static final BitSet FOLLOW_typeList_in_typeParam1298 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_GTGT_in_typeParam1300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_in_typeParam1312 = new BitSet(new long[]{0x0007801500400000L,0x0000000000000001L});
    public static final BitSet FOLLOW_typeList_in_typeParam1315 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_LT_in_typeParam1317 = new BitSet(new long[]{0x0007801500400000L,0x0000000000000001L});
    public static final BitSet FOLLOW_typeList_in_typeParam1320 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_LT_in_typeParam1322 = new BitSet(new long[]{0x0007801500400000L,0x0000000000000001L});
    public static final BitSet FOLLOW_typeList_in_typeParam1325 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_GTGTGT_in_typeParam1327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeParam_in_typeParamOpt1359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_typeConstraint1408 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_COLON_in_typeConstraint1410 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_LPAREN_in_typeConstraint1412 = new BitSet(new long[]{0x0007801500400000L,0x0000000000000001L});
    public static final BitSet FOLLOW_typeList_in_typeConstraint1414 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_RPAREN_in_typeConstraint1416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttrList_in_functionReturn1454 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_FUNCTION_in_functionReturn1457 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_NEW_in_functionReturn1459 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_LPAREN_in_functionReturn1461 = new BitSet(new long[]{0x0000000800600000L});
    public static final BitSet FOLLOW_paramList_in_functionReturn1463 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_RPAREN_in_functionReturn1465 = new BitSet(new long[]{0x0000000000840000L,0x0000000000000001L});
    public static final BitSet FOLLOW_typeTagOpt_in_functionReturn1467 = new BitSet(new long[]{0x0000000000840000L,0x0000000000000001L});
    public static final BitSet FOLLOW_block_in_functionReturn1469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_statement1518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignExpr_in_statement1529 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_SEMI_in_statement1531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDecl_in_statement1543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_statement1554 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_parExpression_in_statement1556 = new BitSet(new long[]{0xF5801813E2D40000L,0x00003F837C60023DL});
    public static final BitSet FOLLOW_statement_in_statement1560 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_ELSE_in_statement1563 = new BitSet(new long[]{0xF5801813E2D40000L,0x00003F837C60023DL});
    public static final BitSet FOLLOW_statement_in_statement1567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_statement1616 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_LPAREN_in_statement1618 = new BitSet(new long[]{0x0080181000500000L,0x00003F827C600201L});
    public static final BitSet FOLLOW_expr_in_statement1622 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_IN_in_statement1624 = new BitSet(new long[]{0x0080181000500000L,0x00003F827C600201L});
    public static final BitSet FOLLOW_expr_in_statement1628 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_RPAREN_in_statement1630 = new BitSet(new long[]{0xF5801813E2D40000L,0x00003F837C60023DL});
    public static final BitSet FOLLOW_statement_in_statement1632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_statement1669 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_parExpression_in_statement1671 = new BitSet(new long[]{0xF5801813E2D40000L,0x00003F837C60023DL});
    public static final BitSet FOLLOW_statement_in_statement1673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DO_in_statement1715 = new BitSet(new long[]{0xF5801813E2D40000L,0x00003F837C60023DL});
    public static final BitSet FOLLOW_statement_in_statement1717 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_WHILE_in_statement1719 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_parExpression_in_statement1721 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_SEMI_in_statement1723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRY_in_statement1761 = new BitSet(new long[]{0x0000000000840000L,0x0000000000000001L});
    public static final BitSet FOLLOW_block_in_statement1763 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_catchStmtList_in_statement1765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SWITCH_in_statement1807 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_LPAREN_in_statement1809 = new BitSet(new long[]{0x0080181000500000L,0x00003F827C600201L});
    public static final BitSet FOLLOW_expr_in_statement1811 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_RPAREN_in_statement1813 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_LBRACE_in_statement1815 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_caseStmt_in_statement1817 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000C2L});
    public static final BitSet FOLLOW_RBRACE_in_statement1820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_statement1850 = new BitSet(new long[]{0x0080181000540000L,0x00003F827C600201L});
    public static final BitSet FOLLOW_expr_in_statement1853 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_SEMI_in_statement1857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THROW_in_statement1896 = new BitSet(new long[]{0x0080181000500000L,0x00003F827C600201L});
    public static final BitSet FOLLOW_expr_in_statement1898 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_SEMI_in_statement1900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BREAK_in_statement1940 = new BitSet(new long[]{0x0000000000440000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_statement1943 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_SEMI_in_statement1947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONTINUE_in_statement1982 = new BitSet(new long[]{0x0000000000440000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_statement1985 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_SEMI_in_statement1989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_statement2025 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_SEMI_in_statement2028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_statement2040 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_COLON_in_statement2042 = new BitSet(new long[]{0xF5801813E2D40000L,0x00003F837C60023DL});
    public static final BitSet FOLLOW_statement_in_statement2044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMI_in_statement2083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_parExpression2107 = new BitSet(new long[]{0x0080181000500000L,0x00003F827C600201L});
    public static final BitSet FOLLOW_expr_in_parExpression2110 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_RPAREN_in_parExpression2112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_block2131 = new BitSet(new long[]{0xF5801813E3DC0000L,0x00003F877C60023FL});
    public static final BitSet FOLLOW_blockStmt_in_block2134 = new BitSet(new long[]{0xF5801813E3DC0000L,0x00003F877C60023FL});
    public static final BitSet FOLLOW_RBRACE_in_block2138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMI_in_block2173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDecl_in_blockStmt2202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classDecl_in_blockStmt2213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_blockStmt2224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BREAK_in_breakStmt2248 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_SEMI_in_breakStmt2250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONTINUE_in_continueStmt2275 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_SEMI_in_continueStmt2277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CASE_in_caseStmt2302 = new BitSet(new long[]{0x0080181000500000L,0x00003F827C600201L});
    public static final BitSet FOLLOW_exprList_in_caseStmt2304 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_COLON_in_caseStmt2306 = new BitSet(new long[]{0xF5801813E2D40000L,0x00003F837C60023DL});
    public static final BitSet FOLLOW_statement_in_caseStmt2308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_caseStmt2332 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_COLON_in_caseStmt2334 = new BitSet(new long[]{0xF5801813E2D40000L,0x00003F837C60023DL});
    public static final BitSet FOLLOW_statement_in_caseStmt2336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_defaultStmt2376 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_COLON_in_defaultStmt2378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_catchStmt_in_catchStmtList2400 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_catchStmtList_in_catchStmtList2402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CATCH_in_catchStmt2432 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_LPAREN_in_catchStmt2434 = new BitSet(new long[]{0x0000000800400000L});
    public static final BitSet FOLLOW_param_in_catchStmt2436 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_RPAREN_in_catchStmt2438 = new BitSet(new long[]{0x0000000000840000L,0x0000000000000001L});
    public static final BitSet FOLLOW_block_in_catchStmt2440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprList_in_exprListOpt2478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_exprList2508 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_COMMA_in_exprList2511 = new BitSet(new long[]{0x0080181000500000L,0x00003F827C600201L});
    public static final BitSet FOLLOW_expr_in_exprList2514 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_assignExpr_in_expr2540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNTYPED_in_expr2551 = new BitSet(new long[]{0x0080181000500000L,0x00003F827C600001L});
    public static final BitSet FOLLOW_assignExpr_in_expr2553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iterExpr_in_assignExpr2585 = new BitSet(new long[]{0x000007E000000002L});
    public static final BitSet FOLLOW_assignOp_in_assignExpr2588 = new BitSet(new long[]{0x0080181000500000L,0x00003F827C600001L});
    public static final BitSet FOLLOW_iterExpr_in_assignExpr2591 = new BitSet(new long[]{0x000007E000000002L});
    public static final BitSet FOLLOW_ternaryExpr_in_iterExpr2614 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_ELLIPSIS_in_iterExpr2617 = new BitSet(new long[]{0x0080181000500000L,0x00003F827C600001L});
    public static final BitSet FOLLOW_ternaryExpr_in_iterExpr2620 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_logicOrExpr_in_ternaryExpr2642 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_QUES_in_ternaryExpr2645 = new BitSet(new long[]{0x0080181000500000L,0x00003F827C600201L});
    public static final BitSet FOLLOW_expr_in_ternaryExpr2648 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_COLON_in_ternaryExpr2650 = new BitSet(new long[]{0x0080181000500000L,0x00003F827C600001L});
    public static final BitSet FOLLOW_logicOrExpr_in_ternaryExpr2653 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_logicAndExpr_in_logicOrExpr2675 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_BARBAR_in_logicOrExpr2678 = new BitSet(new long[]{0x0080181000500000L,0x00003F827C600001L});
    public static final BitSet FOLLOW_logicAndExpr_in_logicOrExpr2681 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_cmpExpr_in_logicAndExpr2708 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_AMPAMP_in_logicAndExpr2712 = new BitSet(new long[]{0x0080181000500000L,0x00003F827C600001L});
    public static final BitSet FOLLOW_cmpExpr_in_logicAndExpr2715 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_bitExpr_in_cmpExpr2738 = new BitSet(new long[]{0x0018000000000002L,0x000000000001E000L});
    public static final BitSet FOLLOW_EQEQ_in_cmpExpr2743 = new BitSet(new long[]{0x0080181000500000L,0x00003F827C600001L});
    public static final BitSet FOLLOW_BANGEQ_in_cmpExpr2747 = new BitSet(new long[]{0x0080181000500000L,0x00003F827C600001L});
    public static final BitSet FOLLOW_GTEQ_in_cmpExpr2752 = new BitSet(new long[]{0x0080181000500000L,0x00003F827C600001L});
    public static final BitSet FOLLOW_LTEQ_in_cmpExpr2757 = new BitSet(new long[]{0x0080181000500000L,0x00003F827C600001L});
    public static final BitSet FOLLOW_GT_in_cmpExpr2762 = new BitSet(new long[]{0x0080181000500000L,0x00003F827C600001L});
    public static final BitSet FOLLOW_LT_in_cmpExpr2767 = new BitSet(new long[]{0x0080181000500000L,0x00003F827C600001L});
    public static final BitSet FOLLOW_bitExpr_in_cmpExpr2772 = new BitSet(new long[]{0x0018000000000002L,0x000000000001E000L});
    public static final BitSet FOLLOW_shiftExpr_in_bitExpr2795 = new BitSet(new long[]{0x0000000000000002L,0x00000000000E0000L});
    public static final BitSet FOLLOW_BAR_in_bitExpr2799 = new BitSet(new long[]{0x0080181000500000L,0x00003F827C600001L});
    public static final BitSet FOLLOW_shiftExpr_in_bitExpr2802 = new BitSet(new long[]{0x0000000000000002L,0x00000000000E0000L});
    public static final BitSet FOLLOW_AMP_in_bitExpr2806 = new BitSet(new long[]{0x0080181000500000L,0x00003F827C600001L});
    public static final BitSet FOLLOW_shiftExpr_in_bitExpr2809 = new BitSet(new long[]{0x0000000000000002L,0x00000000000E0000L});
    public static final BitSet FOLLOW_CARET_in_bitExpr2812 = new BitSet(new long[]{0x0080181000500000L,0x00003F827C600001L});
    public static final BitSet FOLLOW_shiftExpr_in_bitExpr2815 = new BitSet(new long[]{0x0000000000000002L,0x00000000000E0000L});
    public static final BitSet FOLLOW_addExpr_in_shiftExpr2842 = new BitSet(new long[]{0x0050000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_LTLT_in_shiftExpr2846 = new BitSet(new long[]{0x0080181000500000L,0x00003F827C600001L});
    public static final BitSet FOLLOW_addExpr_in_shiftExpr2850 = new BitSet(new long[]{0x0050000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_GT_in_shiftExpr2855 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_GT_in_shiftExpr2857 = new BitSet(new long[]{0x0080181000500000L,0x00003F827C600001L});
    public static final BitSet FOLLOW_addExpr_in_shiftExpr2862 = new BitSet(new long[]{0x0050000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_GTGTGT_in_shiftExpr2866 = new BitSet(new long[]{0x0080181000500000L,0x00003F827C600001L});
    public static final BitSet FOLLOW_addExpr_in_shiftExpr2869 = new BitSet(new long[]{0x0050000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_multExpr_in_addExpr2889 = new BitSet(new long[]{0x0000000000000002L,0x0000000000600000L});
    public static final BitSet FOLLOW_PLUS_in_addExpr2894 = new BitSet(new long[]{0x0080181000500000L,0x00003F827C600001L});
    public static final BitSet FOLLOW_SUB_in_addExpr2899 = new BitSet(new long[]{0x0080181000500000L,0x00003F827C600001L});
    public static final BitSet FOLLOW_multExpr_in_addExpr2903 = new BitSet(new long[]{0x0000000000000002L,0x0000000000600000L});
    public static final BitSet FOLLOW_prefixExpr_in_multExpr2930 = new BitSet(new long[]{0x0000000000000002L,0x0000000003800000L});
    public static final BitSet FOLLOW_STAR_in_multExpr2935 = new BitSet(new long[]{0x0080181000500000L,0x00003F827C600001L});
    public static final BitSet FOLLOW_SLASH_in_multExpr2938 = new BitSet(new long[]{0x0080181000500000L,0x00003F827C600001L});
    public static final BitSet FOLLOW_PERCENT_in_multExpr2941 = new BitSet(new long[]{0x0080181000500000L,0x00003F827C600001L});
    public static final BitSet FOLLOW_prefixExpr_in_multExpr2945 = new BitSet(new long[]{0x0000000000000002L,0x0000000003800000L});
    public static final BitSet FOLLOW_set_in_prefixExpr2975 = new BitSet(new long[]{0x0080181000500000L,0x00003F827C600001L});
    public static final BitSet FOLLOW_prefixExpr_in_prefixExpr2990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_newExpr_in_prefixExpr3001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cast_in_prefixExpr3012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_suffixExpr_in_prefixExpr3023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_suffixExpr3047 = new BitSet(new long[]{0x0000100000100000L});
    public static final BitSet FOLLOW_methodCallOrSliceList_in_suffixExpr3049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_suffixExpr3076 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_PLUSPLUS_in_suffixExpr3078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_suffixExpr3117 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_SUBSUB_in_suffixExpr3119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_suffixExpr3157 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_typeParamOpt_in_suffixExpr3159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_methodCallOrSlice3179 = new BitSet(new long[]{0x0080181000700000L,0x00003F827C600201L});
    public static final BitSet FOLLOW_exprListOpt_in_methodCallOrSlice3181 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_RPAREN_in_methodCallOrSlice3183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACKET_in_methodCallOrSlice3207 = new BitSet(new long[]{0x0080181000500000L,0x00003F827C600201L});
    public static final BitSet FOLLOW_expr_in_methodCallOrSlice3209 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_RBRACKET_in_methodCallOrSlice3211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_methodCallOrSlice_in_methodCallOrSliceList3244 = new BitSet(new long[]{0x0000100000100000L});
    public static final BitSet FOLLOW_methodCallOrSliceList_in_methodCallOrSliceList3246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_methodCallOrSlice_in_methodCallOrSliceList3257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcLit_in_value3276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayLit_in_value3287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objLit_in_value3297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_elementarySymbol_in_value3307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_value3317 = new BitSet(new long[]{0xF5801813E2D40000L,0x00003F837C60023DL});
    public static final BitSet FOLLOW_expr_in_value3321 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_statement_in_value3323 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_RPAREN_in_value3326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dotIdent_in_value3337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEW_in_newExpr3367 = new BitSet(new long[]{0x0007801100500000L,0x0000000000000001L});
    public static final BitSet FOLLOW_type_in_newExpr3369 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_LPAREN_in_newExpr3371 = new BitSet(new long[]{0x0080181000700000L,0x00003F827C600201L});
    public static final BitSet FOLLOW_exprListOpt_in_newExpr3373 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_RPAREN_in_newExpr3375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CAST_in_cast3405 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_LPAREN_in_cast3407 = new BitSet(new long[]{0x0080181000500000L,0x00003F827C600201L});
    public static final BitSet FOLLOW_expr_in_cast3409 = new BitSet(new long[]{0x0000000400200000L});
    public static final BitSet FOLLOW_COMMA_in_cast3412 = new BitSet(new long[]{0x0007C01100400000L,0x0000000000000001L});
    public static final BitSet FOLLOW_funcType_in_cast3414 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_RPAREN_in_cast3418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CAST_in_cast3446 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_LPAREN_in_cast3448 = new BitSet(new long[]{0x0080181000500000L,0x00003F827C600201L});
    public static final BitSet FOLLOW_expr_in_cast3450 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_RPAREN_in_cast3452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classDecl_in_topLevelDecl3517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interfaceDecl_in_topLevelDecl3527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumDecl_in_topLevelDecl3537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typedefDecl_in_topLevelDecl3547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeDeclFlags_in_enumDecl3565 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_ENUM_in_enumDecl3567 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_enumDecl3569 = new BitSet(new long[]{0x0008000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_typeParamOpt_in_enumDecl3571 = new BitSet(new long[]{0x0008000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_enumBody_in_enumDecl3573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_enumBody3606 = new BitSet(new long[]{0x0000000000400000L,0x0000000000000002L});
    public static final BitSet FOLLOW_enumValueDecl_in_enumBody3609 = new BitSet(new long[]{0x0000000000400000L,0x0000000000000002L});
    public static final BitSet FOLLOW_RBRACE_in_enumBody3613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_enumValueDecl3672 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_LPAREN_in_enumValueDecl3674 = new BitSet(new long[]{0x0000000800600000L});
    public static final BitSet FOLLOW_paramList_in_enumValueDecl3676 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_RPAREN_in_enumValueDecl3678 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_SEMI_in_enumValueDecl3680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_enumValueDecl3714 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_SEMI_in_enumValueDecl3716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDecl_in_varDeclList3776 = new BitSet(new long[]{0x00000003E2000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_varDeclList_in_varDeclList3778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttrList_in_varDecl3794 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_VAR_in_varDecl3798 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_varDeclPartList_in_varDecl3800 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_SEMI_in_varDecl3802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDeclPart_in_varDeclPartList3848 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_COMMA_in_varDeclPartList3851 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_varDeclPart_in_varDeclPartList3854 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_varDeclPart3875 = new BitSet(new long[]{0x0000002000900000L});
    public static final BitSet FOLLOW_propDeclOpt_in_varDeclPart3880 = new BitSet(new long[]{0x0000002000800000L});
    public static final BitSet FOLLOW_typeTagOpt_in_varDeclPart3882 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_varInit_in_varDeclPart3884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_propDecl3898 = new BitSet(new long[]{0x0000000100400000L,0x0000000200000080L});
    public static final BitSet FOLLOW_propAccessor_in_propDecl3902 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_COMMA_in_propDecl3904 = new BitSet(new long[]{0x0000000100400000L,0x0000000200000080L});
    public static final BitSet FOLLOW_propAccessor_in_propDecl3908 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_RPAREN_in_propDecl3910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_propAccessor0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_propDecl_in_propDeclOpt4030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQ_in_varInit4055 = new BitSet(new long[]{0x0080181000500000L,0x00003F827C600201L});
    public static final BitSet FOLLOW_expr_in_varInit4057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttrList_in_funcDecl4105 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_FUNCTION_in_funcDecl4108 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_NEW_in_funcDecl4110 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_LPAREN_in_funcDecl4112 = new BitSet(new long[]{0x0000000800600000L});
    public static final BitSet FOLLOW_paramList_in_funcDecl4114 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_RPAREN_in_funcDecl4116 = new BitSet(new long[]{0x0000000000840000L,0x0000000000000001L});
    public static final BitSet FOLLOW_typeTagOpt_in_funcDecl4118 = new BitSet(new long[]{0x0000000000840000L,0x0000000000000001L});
    public static final BitSet FOLLOW_block_in_funcDecl4120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttrList_in_funcDecl4175 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_FUNCTION_in_funcDecl4178 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_funcDecl4180 = new BitSet(new long[]{0x0008000000100000L});
    public static final BitSet FOLLOW_typeParamOpt_in_funcDecl4182 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_LPAREN_in_funcDecl4184 = new BitSet(new long[]{0x0000000800600000L});
    public static final BitSet FOLLOW_paramList_in_funcDecl4186 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_RPAREN_in_funcDecl4188 = new BitSet(new long[]{0x0000000000840000L,0x0000000000000001L});
    public static final BitSet FOLLOW_typeTagOpt_in_funcDecl4190 = new BitSet(new long[]{0x0000000000840000L,0x0000000000000001L});
    public static final BitSet FOLLOW_block_in_funcDecl4192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttrList_in_funcProtoDecl4262 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_FUNCTION_in_funcProtoDecl4264 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_NEW_in_funcProtoDecl4266 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_LPAREN_in_funcProtoDecl4268 = new BitSet(new long[]{0x0000000800600000L});
    public static final BitSet FOLLOW_paramList_in_funcProtoDecl4270 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_RPAREN_in_funcProtoDecl4272 = new BitSet(new long[]{0x0000000000840000L});
    public static final BitSet FOLLOW_typeTagOpt_in_funcProtoDecl4274 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_SEMI_in_funcProtoDecl4276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttrList_in_funcProtoDecl4317 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_FUNCTION_in_funcProtoDecl4319 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_funcProtoDecl4321 = new BitSet(new long[]{0x0008000000100000L});
    public static final BitSet FOLLOW_typeParamOpt_in_funcProtoDecl4323 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_LPAREN_in_funcProtoDecl4325 = new BitSet(new long[]{0x0000000800600000L});
    public static final BitSet FOLLOW_paramList_in_funcProtoDecl4327 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_RPAREN_in_funcProtoDecl4329 = new BitSet(new long[]{0x0000000000840000L});
    public static final BitSet FOLLOW_typeTagOpt_in_funcProtoDecl4331 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_SEMI_in_funcProtoDecl4333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_in_funcProtoDecl4377 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_NEW_in_funcProtoDecl4379 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_LPAREN_in_funcProtoDecl4381 = new BitSet(new long[]{0x0000000800600000L});
    public static final BitSet FOLLOW_paramList_in_funcProtoDecl4383 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_RPAREN_in_funcProtoDecl4385 = new BitSet(new long[]{0x0000000000840000L});
    public static final BitSet FOLLOW_typeTagOpt_in_funcProtoDecl4387 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_SEMI_in_funcProtoDecl4389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_in_funcProtoDecl4427 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_funcProtoDecl4429 = new BitSet(new long[]{0x0008000000100000L});
    public static final BitSet FOLLOW_typeParamOpt_in_funcProtoDecl4431 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_LPAREN_in_funcProtoDecl4433 = new BitSet(new long[]{0x0000000800600000L});
    public static final BitSet FOLLOW_paramList_in_funcProtoDecl4435 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_RPAREN_in_funcProtoDecl4437 = new BitSet(new long[]{0x0000000000840000L});
    public static final BitSet FOLLOW_typeTagOpt_in_funcProtoDecl4439 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_SEMI_in_funcProtoDecl4441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeDeclFlags_in_classDecl4495 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_CLASS_in_classDecl4497 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_classDecl4499 = new BitSet(new long[]{0x0008000000000000L,0x0000003000000001L});
    public static final BitSet FOLLOW_typeParamOpt_in_classDecl4501 = new BitSet(new long[]{0x0008000000000000L,0x0000003000000001L});
    public static final BitSet FOLLOW_inheritListOpt_in_classDecl4503 = new BitSet(new long[]{0x0008000000000000L,0x0000003000000001L});
    public static final BitSet FOLLOW_classBodyScope_in_classDecl4505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_classBodyScope4561 = new BitSet(new long[]{0x00000803E3080000L,0x0000000180000002L});
    public static final BitSet FOLLOW_classMember_in_classBodyScope4564 = new BitSet(new long[]{0x00000803E3080000L,0x0000000180000002L});
    public static final BitSet FOLLOW_RBRACE_in_classBodyScope4568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDecl_in_classMember4606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcDecl_in_classMember4617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumDecl_in_classMember4629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeDeclFlags_in_interfaceDecl4658 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_INTERFACE_in_interfaceDecl4660 = new BitSet(new long[]{0x0007801100400000L,0x0000003000000001L});
    public static final BitSet FOLLOW_type_in_interfaceDecl4662 = new BitSet(new long[]{0x0000000000000000L,0x0000003000000001L});
    public static final BitSet FOLLOW_inheritListOpt_in_interfaceDecl4664 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_LBRACE_in_interfaceDecl4666 = new BitSet(new long[]{0x00000803E2000000L,0x0000000100000002L});
    public static final BitSet FOLLOW_interfaceBody_in_interfaceDecl4669 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_RBRACE_in_interfaceDecl4671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDecl_in_interfaceBody4695 = new BitSet(new long[]{0x00000803E2000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_interfaceBody_in_interfaceBody4697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcProtoDecl_in_interfaceBody4707 = new BitSet(new long[]{0x00000803E2000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_interfaceBody_in_interfaceBody4709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inherit_in_inheritList4743 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_COMMA_in_inheritList4746 = new BitSet(new long[]{0x0000000000000000L,0x0000003000000000L});
    public static final BitSet FOLLOW_inherit_in_inheritList4749 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_inheritList_in_inheritListOpt4779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXTENDS_in_inherit4825 = new BitSet(new long[]{0x0007801100400000L,0x0000000000000001L});
    public static final BitSet FOLLOW_type_in_inherit4827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IMPLEMENTS_in_inherit4855 = new BitSet(new long[]{0x0007801100400000L,0x0000000000000001L});
    public static final BitSet FOLLOW_type_in_inherit4857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPEDEF_in_typedefDecl4897 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_typedefDecl4899 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_EQ_in_typedefDecl4901 = new BitSet(new long[]{0x0007C01100400000L,0x0000000000000001L});
    public static final BitSet FOLLOW_funcType_in_typedefDecl4903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GT_in_typeExtend4927 = new BitSet(new long[]{0x0007C01100400000L,0x0000000000000001L});
    public static final BitSet FOLLOW_funcType_in_typeExtend4929 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_COMMA_in_typeExtend4931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_anonType4955 = new BitSet(new long[]{0x00100003E2400000L,0x0000000100000002L});
    public static final BitSet FOLLOW_anonTypeFieldList_in_anonType4989 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_varDeclList_in_anonType5008 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_typeExtend_in_anonType5027 = new BitSet(new long[]{0x00000003E2400000L,0x0000000100000002L});
    public static final BitSet FOLLOW_anonTypeFieldList_in_anonType5059 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_varDeclList_in_anonType5089 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_RBRACE_in_anonType5116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_anonTypeField_in_anonTypeFieldList5142 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_COMMA_in_anonTypeFieldList5145 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_anonTypeField_in_anonTypeFieldList5148 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_LBRACE_in_objLit5164 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_objLitElemList_in_objLit5167 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_RBRACE_in_objLit5169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_anonTypeField5194 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_COLON_in_anonTypeField5196 = new BitSet(new long[]{0x0007C01100400000L,0x0000000000000001L});
    public static final BitSet FOLLOW_funcType_in_anonTypeField5199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objLitElem_in_objLitElemList5227 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_COMMA_in_objLitElemList5230 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_objLitElem_in_objLitElemList5233 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_objLitElem5259 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_COLON_in_objLitElem5261 = new BitSet(new long[]{0x0080181000500000L,0x00003F827C600201L});
    public static final BitSet FOLLOW_expr_in_objLitElem5264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LONGLITERAL_in_elementarySymbol5287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_elementarySymbol5308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTLITERAL_in_elementarySymbol5328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRINGLITERAL_in_elementarySymbol5349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARLITERAL_in_elementarySymbol5370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOATNUM_in_elementarySymbol5391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_elementarySymbol5412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_elementarySymbol5437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeTagOpt_in_synpred28_Haxe931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_synpred34_Haxe1136 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_MINUS_BIGGER_in_synpred34_Haxe1140 = new BitSet(new long[]{0x0007C01100400000L,0x0000000000000001L});
    public static final BitSet FOLLOW_type_in_synpred34_Haxe1143 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_typeParam_in_synpred41_Haxe1229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_anonType_in_synpred42_Haxe1216 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_dotIdent_in_synpred42_Haxe1220 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_primitiveType_in_synpred42_Haxe1224 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_typeParam_in_synpred42_Haxe1229 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_LT_in_synpred43_Haxe1273 = new BitSet(new long[]{0x0007801500400000L,0x0000000000000001L});
    public static final BitSet FOLLOW_typeList_in_synpred43_Haxe1276 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_GT_in_synpred43_Haxe1278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_in_synpred44_Haxe1290 = new BitSet(new long[]{0x0007801500400000L,0x0000000000000001L});
    public static final BitSet FOLLOW_typeList_in_synpred44_Haxe1293 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_LT_in_synpred44_Haxe1295 = new BitSet(new long[]{0x0007801500400000L,0x0000000000000001L});
    public static final BitSet FOLLOW_typeList_in_synpred44_Haxe1298 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_GTGT_in_synpred44_Haxe1300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeParam_in_synpred45_Haxe1359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_synpred47_Haxe1518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignExpr_in_synpred48_Haxe1529 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_SEMI_in_synpred48_Haxe1531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_synpred50_Haxe1563 = new BitSet(new long[]{0xF5801813E2D40000L,0x00003F837C60023DL});
    public static final BitSet FOLLOW_statement_in_synpred50_Haxe1567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_synpred65_Haxe2025 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_SEMI_in_synpred65_Haxe2028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_synpred66_Haxe2040 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_COLON_in_synpred66_Haxe2042 = new BitSet(new long[]{0xF5801813E2D40000L,0x00003F837C60023DL});
    public static final BitSet FOLLOW_statement_in_synpred66_Haxe2044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDecl_in_synpred69_Haxe2202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classDecl_in_synpred70_Haxe2213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_synpred106_Haxe3047 = new BitSet(new long[]{0x0000100000100000L});
    public static final BitSet FOLLOW_methodCallOrSliceList_in_synpred106_Haxe3049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_synpred107_Haxe3076 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_PLUSPLUS_in_synpred107_Haxe3078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_synpred108_Haxe3117 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_SUBSUB_in_synpred108_Haxe3119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_methodCallOrSlice_in_synpred110_Haxe3244 = new BitSet(new long[]{0x0000100000100000L});
    public static final BitSet FOLLOW_methodCallOrSliceList_in_synpred110_Haxe3246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_synpred115_Haxe3321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CAST_in_synpred118_Haxe3405 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_LPAREN_in_synpred118_Haxe3407 = new BitSet(new long[]{0x0080181000500000L,0x00003F827C600201L});
    public static final BitSet FOLLOW_expr_in_synpred118_Haxe3409 = new BitSet(new long[]{0x0000000400200000L});
    public static final BitSet FOLLOW_COMMA_in_synpred118_Haxe3412 = new BitSet(new long[]{0x0007C01100400000L,0x0000000000000001L});
    public static final BitSet FOLLOW_funcType_in_synpred118_Haxe3414 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_RPAREN_in_synpred118_Haxe3418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classDecl_in_synpred119_Haxe3517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interfaceDecl_in_synpred120_Haxe3527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumDecl_in_synpred121_Haxe3537 = new BitSet(new long[]{0x0000000000000002L});

}