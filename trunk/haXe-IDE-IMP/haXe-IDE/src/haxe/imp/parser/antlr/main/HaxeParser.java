// $ANTLR 3.3 Nov 30, 2010 12:50:56 Haxe.g 2011-04-07 01:15:23

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
    // Haxe.g:62:1: module : ( myPackage )? topLevelList -> ^( MODULE[\"MODULE\",true] ( myPackage )? ( topLevelList )? ) ;
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
            // Haxe.g:63:5: ( ( myPackage )? topLevelList -> ^( MODULE[\"MODULE\",true] ( myPackage )? ( topLevelList )? ) )
            // Haxe.g:63:7: ( myPackage )? topLevelList
            {
            // Haxe.g:63:7: ( myPackage )?
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
            // 63:31: -> ^( MODULE[\"MODULE\",true] ( myPackage )? ( topLevelList )? )
            {
                // Haxe.g:63:34: ^( MODULE[\"MODULE\",true] ( myPackage )? ( topLevelList )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new HaxeTree(MODULE, "MODULE", true), root_1);

                // Haxe.g:63:68: ( myPackage )?
                if ( stream_myPackage.hasNext() ) {
                    adaptor.addChild(root_1, stream_myPackage.nextTree());

                }
                stream_myPackage.reset();
                // Haxe.g:63:79: ( topLevelList )?
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
    // Haxe.g:66:1: topLevelList : ( topLevel )* ;
    public final HaxeParser.topLevelList_return topLevelList() throws RecognitionException {
        HaxeParser.topLevelList_return retval = new HaxeParser.topLevelList_return();
        retval.start = input.LT(1);
        int topLevelList_StartIndex = input.index();
        Object root_0 = null;

        HaxeParser.topLevel_return topLevel3 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return retval; }
            // Haxe.g:67:5: ( ( topLevel )* )
            // Haxe.g:67:7: ( topLevel )*
            {
            root_0 = (Object)adaptor.nil();

            // Haxe.g:67:7: ( topLevel )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==MONKEYS_AT||(LA2_0>=EXTERN && LA2_0<=PRIVATE)||(LA2_0>=IMPORT && LA2_0<=USING)||LA2_0==ENUM||(LA2_0>=CLASS && LA2_0<=INTERFACE)||LA2_0==TYPEDEF) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // Haxe.g:67:8: topLevel
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
    // Haxe.g:70:1: topLevel : ( myImport | topLevelDecl );
    public final HaxeParser.topLevel_return topLevel() throws RecognitionException {
        HaxeParser.topLevel_return retval = new HaxeParser.topLevel_return();
        retval.start = input.LT(1);
        int topLevel_StartIndex = input.index();
        Object root_0 = null;

        HaxeParser.myImport_return myImport4 = null;

        HaxeParser.topLevelDecl_return topLevelDecl5 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return retval; }
            // Haxe.g:71:5: ( myImport | topLevelDecl )
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
                    // Haxe.g:71:7: myImport
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
                    // Haxe.g:73:7: topLevelDecl
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
    // Haxe.g:76:1: myPackage : PACKAGE dotIdent SEMI -> ^( PACKAGE ( dotIdent )? ) ;
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
            // Haxe.g:77:5: ( PACKAGE dotIdent SEMI -> ^( PACKAGE ( dotIdent )? ) )
            // Haxe.g:77:7: PACKAGE dotIdent SEMI
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
            // 77:29: -> ^( PACKAGE ( dotIdent )? )
            {
                // Haxe.g:77:32: ^( PACKAGE ( dotIdent )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_PACKAGE.nextNode(), root_1);

                // Haxe.g:77:42: ( dotIdent )?
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
    // Haxe.g:80:1: meta : MONKEYS_AT metaName ( LPAREN paramList RPAREN )? ;
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
            // Haxe.g:80:9: ( MONKEYS_AT metaName ( LPAREN paramList RPAREN )? )
            // Haxe.g:80:11: MONKEYS_AT metaName ( LPAREN paramList RPAREN )?
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
            // Haxe.g:80:31: ( LPAREN paramList RPAREN )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==LPAREN) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // Haxe.g:80:32: LPAREN paramList RPAREN
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
    // Haxe.g:83:1: metaName : ( IDENTIFIER | primitiveType | COLON metaName );
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
            // Haxe.g:84:5: ( IDENTIFIER | primitiveType | COLON metaName )
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
                    // Haxe.g:84:7: IDENTIFIER
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
                    // Haxe.g:85:7: primitiveType
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
                    // Haxe.g:87:7: COLON metaName
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
    // Haxe.g:90:1: typeDeclFlags : ( meta )* ( EXTERN | PRIVATE )* ;
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
            // Haxe.g:91:5: ( ( meta )* ( EXTERN | PRIVATE )* )
            // Haxe.g:91:7: ( meta )* ( EXTERN | PRIVATE )*
            {
            root_0 = (Object)adaptor.nil();

            // Haxe.g:91:7: ( meta )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==MONKEYS_AT) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // Haxe.g:91:8: meta
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

            // Haxe.g:91:15: ( EXTERN | PRIVATE )*
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
    // Haxe.g:94:1: qualifiedIdentifier : (a= IDENTIFIER -> $a) ( DOT ident= IDENTIFIER -> ^( DOT $qualifiedIdentifier $ident) )* ;
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
            // Haxe.g:95:5: ( (a= IDENTIFIER -> $a) ( DOT ident= IDENTIFIER -> ^( DOT $qualifiedIdentifier $ident) )* )
            // Haxe.g:95:7: (a= IDENTIFIER -> $a) ( DOT ident= IDENTIFIER -> ^( DOT $qualifiedIdentifier $ident) )*
            {
            // Haxe.g:95:7: (a= IDENTIFIER -> $a)
            // Haxe.g:95:8: a= IDENTIFIER
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
            // 95:22: -> $a
            {
                adaptor.addChild(root_0, stream_a.nextNode());

            }

            retval.tree = root_0;}
            }

            // Haxe.g:95:30: ( DOT ident= IDENTIFIER -> ^( DOT $qualifiedIdentifier $ident) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==DOT) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // Haxe.g:95:31: DOT ident= IDENTIFIER
            	    {
            	    DOT20=(Token)match(input,DOT,FOLLOW_DOT_in_qualifiedIdentifier398); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_DOT.add(DOT20);

            	    ident=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_qualifiedIdentifier402); if (state.failed) return retval; 
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
            	    // 95:53: -> ^( DOT $qualifiedIdentifier $ident)
            	    {
            	        // Haxe.g:95:57: ^( DOT $qualifiedIdentifier $ident)
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
    // Haxe.g:98:1: myImport : ( IMPORT dotIdent SEMI | USING dotIdent SEMI );
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
            // Haxe.g:99:5: ( IMPORT dotIdent SEMI | USING dotIdent SEMI )
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
                    // Haxe.g:99:7: IMPORT dotIdent SEMI
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
                    // Haxe.g:100:7: USING dotIdent SEMI
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
    // Haxe.g:104:1: access : ( PUBLIC | PRIVATE );
    public final HaxeParser.access_return access() throws RecognitionException {
        HaxeParser.access_return retval = new HaxeParser.access_return();
        retval.start = input.LT(1);
        int access_StartIndex = input.index();
        Object root_0 = null;

        Token set27=null;

        Object set27_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return retval; }
            // Haxe.g:105:5: ( PUBLIC | PRIVATE )
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
    // Haxe.g:109:1: declAttr : ( STATIC | INLINE | DYNAMIC | OVERRIDE | access );
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
            // Haxe.g:110:5: ( STATIC | INLINE | DYNAMIC | OVERRIDE | access )
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
                    // Haxe.g:110:7: STATIC
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
                    // Haxe.g:111:7: INLINE
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
                    // Haxe.g:112:7: DYNAMIC
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
                    // Haxe.g:113:7: OVERRIDE
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
                    // Haxe.g:114:7: access
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
    // Haxe.g:117:1: declAttrList : ( declAttr )+ -> ^( DECL_ATTR_LIST[\"DECL_ATTR_LIST\", true] ( declAttr )+ ) ;
    public final HaxeParser.declAttrList_return declAttrList() throws RecognitionException {
        HaxeParser.declAttrList_return retval = new HaxeParser.declAttrList_return();
        retval.start = input.LT(1);
        int declAttrList_StartIndex = input.index();
        Object root_0 = null;

        HaxeParser.declAttr_return declAttr33 = null;


        RewriteRuleSubtreeStream stream_declAttr=new RewriteRuleSubtreeStream(adaptor,"rule declAttr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return retval; }
            // Haxe.g:118:5: ( ( declAttr )+ -> ^( DECL_ATTR_LIST[\"DECL_ATTR_LIST\", true] ( declAttr )+ ) )
            // Haxe.g:118:7: ( declAttr )+
            {
            // Haxe.g:118:7: ( declAttr )+
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
            	    // Haxe.g:118:8: declAttr
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
            // 118:19: -> ^( DECL_ATTR_LIST[\"DECL_ATTR_LIST\", true] ( declAttr )+ )
            {
                // Haxe.g:118:22: ^( DECL_ATTR_LIST[\"DECL_ATTR_LIST\", true] ( declAttr )+ )
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
    // Haxe.g:121:1: paramList : ( param ( COMMA param )* -> ^( PARAM_LIST[\"PARAM_LIST\", true] ( param )+ ) | );
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
            // Haxe.g:122:5: ( param ( COMMA param )* -> ^( PARAM_LIST[\"PARAM_LIST\", true] ( param )+ ) | )
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
                    // Haxe.g:122:7: param ( COMMA param )*
                    {
                    pushFollow(FOLLOW_param_in_paramList585);
                    param34=param();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_param.add(param34.getTree());
                    // Haxe.g:122:13: ( COMMA param )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==COMMA) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // Haxe.g:122:14: COMMA param
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
                    // 122:28: -> ^( PARAM_LIST[\"PARAM_LIST\", true] ( param )+ )
                    {
                        // Haxe.g:122:31: ^( PARAM_LIST[\"PARAM_LIST\", true] ( param )+ )
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
                    // Haxe.g:124:5: 
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
    // Haxe.g:126:1: param : ( QUES )? IDENTIFIER typeTagOpt varInit -> ^( VAR[$IDENTIFIER, true] ( IDENTIFIER )? ( typeTagOpt )? ( varInit )? ( QUES )? ) ;
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
            // Haxe.g:127:5: ( ( QUES )? IDENTIFIER typeTagOpt varInit -> ^( VAR[$IDENTIFIER, true] ( IDENTIFIER )? ( typeTagOpt )? ( varInit )? ( QUES )? ) )
            // Haxe.g:127:7: ( QUES )? IDENTIFIER typeTagOpt varInit
            {
            // Haxe.g:127:7: ( QUES )?
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
            // elements: QUES, varInit, typeTagOpt, IDENTIFIER
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 127:43: -> ^( VAR[$IDENTIFIER, true] ( IDENTIFIER )? ( typeTagOpt )? ( varInit )? ( QUES )? )
            {
                // Haxe.g:127:46: ^( VAR[$IDENTIFIER, true] ( IDENTIFIER )? ( typeTagOpt )? ( varInit )? ( QUES )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new VarDeclaration(VAR, IDENTIFIER38, true), root_1);

                // Haxe.g:127:87: ( IDENTIFIER )?
                if ( stream_IDENTIFIER.hasNext() ) {
                    adaptor.addChild(root_1, new VarUsage(stream_IDENTIFIER.nextToken()));

                }
                stream_IDENTIFIER.reset();
                // Haxe.g:127:109: ( typeTagOpt )?
                if ( stream_typeTagOpt.hasNext() ) {
                    adaptor.addChild(root_1, stream_typeTagOpt.nextTree());

                }
                stream_typeTagOpt.reset();
                // Haxe.g:127:121: ( varInit )?
                if ( stream_varInit.hasNext() ) {
                    adaptor.addChild(root_1, stream_varInit.nextTree());

                }
                stream_varInit.reset();
                // Haxe.g:127:130: ( QUES )?
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
    // Haxe.g:130:1: id : ( IDENTIFIER | THIS );
    public final HaxeParser.id_return id() throws RecognitionException {
        HaxeParser.id_return retval = new HaxeParser.id_return();
        retval.start = input.LT(1);
        int id_StartIndex = input.index();
        Object root_0 = null;

        Token set41=null;

        Object set41_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return retval; }
            // Haxe.g:130:5: ( IDENTIFIER | THIS )
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
    // Haxe.g:134:1: dotIdent : ( id DOT dotIdent -> ^( IDENT[true] id ( dotIdent )? ) | id -> ^( IDENT[true] id ) );
    public final HaxeParser.dotIdent_return dotIdent() throws RecognitionException {
        HaxeParser.dotIdent_return retval = new HaxeParser.dotIdent_return();
        retval.start = input.LT(1);
        int dotIdent_StartIndex = input.index();
        Object root_0 = null;

        Token DOT43=null;
        HaxeParser.id_return id42 = null;

        HaxeParser.dotIdent_return dotIdent44 = null;

        HaxeParser.id_return id45 = null;


        Object DOT43_tree=null;
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_dotIdent=new RewriteRuleSubtreeStream(adaptor,"rule dotIdent");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return retval; }
            // Haxe.g:135:5: ( id DOT dotIdent -> ^( IDENT[true] id ( dotIdent )? ) | id -> ^( IDENT[true] id ) )
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
                    // Haxe.g:135:10: id DOT dotIdent
                    {
                    pushFollow(FOLLOW_id_in_dotIdent714);
                    id42=id();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_id.add(id42.getTree());
                    DOT43=(Token)match(input,DOT,FOLLOW_DOT_in_dotIdent716); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DOT.add(DOT43);

                    pushFollow(FOLLOW_dotIdent_in_dotIdent718);
                    dotIdent44=dotIdent();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_dotIdent.add(dotIdent44.getTree());


                    // AST REWRITE
                    // elements: dotIdent, id
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 135:26: -> ^( IDENT[true] id ( dotIdent )? )
                    {
                        // Haxe.g:135:30: ^( IDENT[true] id ( dotIdent )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new VarUsage(IDENT, true), root_1);

                        adaptor.addChild(root_1, stream_id.nextTree());
                        // Haxe.g:135:57: ( dotIdent )?
                        if ( stream_dotIdent.hasNext() ) {
                            adaptor.addChild(root_1, stream_dotIdent.nextTree());

                        }
                        stream_dotIdent.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // Haxe.g:136:10: id
                    {
                    pushFollow(FOLLOW_id_in_dotIdent745);
                    id45=id();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_id.add(id45.getTree());


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
                    // 136:13: -> ^( IDENT[true] id )
                    {
                        // Haxe.g:136:16: ^( IDENT[true] id )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new VarUsage(IDENT, true), root_1);

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
    // Haxe.g:139:1: assignOp : ( EQ -> EQ[$EQ] | PLUSEQ -> PLUSEQ[$PLUSEQ] | SUBEQ -> SUBEQ[$SUBEQ] | SLASHEQ -> SLASHEQ[$SLASHEQ] | PERCENTEQ -> PERCENTEQ[$PERCENTEQ] | AMPEQ -> AMPEQ[$AMPEQ] );
    public final HaxeParser.assignOp_return assignOp() throws RecognitionException {
        HaxeParser.assignOp_return retval = new HaxeParser.assignOp_return();
        retval.start = input.LT(1);
        int assignOp_StartIndex = input.index();
        Object root_0 = null;

        Token EQ46=null;
        Token PLUSEQ47=null;
        Token SUBEQ48=null;
        Token SLASHEQ49=null;
        Token PERCENTEQ50=null;
        Token AMPEQ51=null;

        Object EQ46_tree=null;
        Object PLUSEQ47_tree=null;
        Object SUBEQ48_tree=null;
        Object SLASHEQ49_tree=null;
        Object PERCENTEQ50_tree=null;
        Object AMPEQ51_tree=null;
        RewriteRuleTokenStream stream_SUBEQ=new RewriteRuleTokenStream(adaptor,"token SUBEQ");
        RewriteRuleTokenStream stream_SLASHEQ=new RewriteRuleTokenStream(adaptor,"token SLASHEQ");
        RewriteRuleTokenStream stream_PERCENTEQ=new RewriteRuleTokenStream(adaptor,"token PERCENTEQ");
        RewriteRuleTokenStream stream_EQ=new RewriteRuleTokenStream(adaptor,"token EQ");
        RewriteRuleTokenStream stream_AMPEQ=new RewriteRuleTokenStream(adaptor,"token AMPEQ");
        RewriteRuleTokenStream stream_PLUSEQ=new RewriteRuleTokenStream(adaptor,"token PLUSEQ");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return retval; }
            // Haxe.g:140:5: ( EQ -> EQ[$EQ] | PLUSEQ -> PLUSEQ[$PLUSEQ] | SUBEQ -> SUBEQ[$SUBEQ] | SLASHEQ -> SLASHEQ[$SLASHEQ] | PERCENTEQ -> PERCENTEQ[$PERCENTEQ] | AMPEQ -> AMPEQ[$AMPEQ] )
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
                    // Haxe.g:140:10: EQ
                    {
                    EQ46=(Token)match(input,EQ,FOLLOW_EQ_in_assignOp777); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EQ.add(EQ46);



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
                    // 140:20: -> EQ[$EQ]
                    {
                        adaptor.addChild(root_0, new AssignOperationNode(EQ, EQ46));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // Haxe.g:141:10: PLUSEQ
                    {
                    PLUSEQ47=(Token)match(input,PLUSEQ,FOLLOW_PLUSEQ_in_assignOp803); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PLUSEQ.add(PLUSEQ47);



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
                    // 141:21: -> PLUSEQ[$PLUSEQ]
                    {
                        adaptor.addChild(root_0, new AssignOperationNode(PLUSEQ, PLUSEQ47));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // Haxe.g:142:10: SUBEQ
                    {
                    SUBEQ48=(Token)match(input,SUBEQ,FOLLOW_SUBEQ_in_assignOp826); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SUBEQ.add(SUBEQ48);



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
                    // 142:19: -> SUBEQ[$SUBEQ]
                    {
                        adaptor.addChild(root_0, new AssignOperationNode(SUBEQ, SUBEQ48));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // Haxe.g:143:10: SLASHEQ
                    {
                    SLASHEQ49=(Token)match(input,SLASHEQ,FOLLOW_SLASHEQ_in_assignOp848); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SLASHEQ.add(SLASHEQ49);



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
                    // 143:21: -> SLASHEQ[$SLASHEQ]
                    {
                        adaptor.addChild(root_0, new AssignOperationNode(SLASHEQ, SLASHEQ49));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // Haxe.g:144:10: PERCENTEQ
                    {
                    PERCENTEQ50=(Token)match(input,PERCENTEQ,FOLLOW_PERCENTEQ_in_assignOp870); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PERCENTEQ.add(PERCENTEQ50);



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
                    // 144:23: -> PERCENTEQ[$PERCENTEQ]
                    {
                        adaptor.addChild(root_0, new AssignOperationNode(PERCENTEQ, PERCENTEQ50));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    // Haxe.g:145:10: AMPEQ
                    {
                    AMPEQ51=(Token)match(input,AMPEQ,FOLLOW_AMPEQ_in_assignOp892); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AMPEQ.add(AMPEQ51);



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
                    // 145:19: -> AMPEQ[$AMPEQ]
                    {
                        adaptor.addChild(root_0, new AssignOperationNode(AMPEQ, AMPEQ51));

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
    // Haxe.g:149:1: funcLit : FUNCTION LPAREN paramList RPAREN ( typeTagOpt )? block -> ^( FUNCTION ( paramList )? ( typeTagOpt )? ( block )? ) ;
    public final HaxeParser.funcLit_return funcLit() throws RecognitionException {
        HaxeParser.funcLit_return retval = new HaxeParser.funcLit_return();
        retval.start = input.LT(1);
        int funcLit_StartIndex = input.index();
        Object root_0 = null;

        Token FUNCTION52=null;
        Token LPAREN53=null;
        Token RPAREN55=null;
        HaxeParser.paramList_return paramList54 = null;

        HaxeParser.typeTagOpt_return typeTagOpt56 = null;

        HaxeParser.block_return block57 = null;


        Object FUNCTION52_tree=null;
        Object LPAREN53_tree=null;
        Object RPAREN55_tree=null;
        RewriteRuleTokenStream stream_FUNCTION=new RewriteRuleTokenStream(adaptor,"token FUNCTION");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_paramList=new RewriteRuleSubtreeStream(adaptor,"rule paramList");
        RewriteRuleSubtreeStream stream_typeTagOpt=new RewriteRuleSubtreeStream(adaptor,"rule typeTagOpt");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return retval; }
            // Haxe.g:149:9: ( FUNCTION LPAREN paramList RPAREN ( typeTagOpt )? block -> ^( FUNCTION ( paramList )? ( typeTagOpt )? ( block )? ) )
            // Haxe.g:149:11: FUNCTION LPAREN paramList RPAREN ( typeTagOpt )? block
            {
            FUNCTION52=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcLit921); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION52);

            LPAREN53=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcLit923); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN53);

            pushFollow(FOLLOW_paramList_in_funcLit925);
            paramList54=paramList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_paramList.add(paramList54.getTree());
            RPAREN55=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcLit927); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN55);

            // Haxe.g:149:44: ( typeTagOpt )?
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
                    pushFollow(FOLLOW_typeTagOpt_in_funcLit929);
                    typeTagOpt56=typeTagOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeTagOpt.add(typeTagOpt56.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_block_in_funcLit932);
            block57=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block57.getTree());


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
            // 149:62: -> ^( FUNCTION ( paramList )? ( typeTagOpt )? ( block )? )
            {
                // Haxe.g:149:65: ^( FUNCTION ( paramList )? ( typeTagOpt )? ( block )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new FunctionNode(stream_FUNCTION.nextToken()), root_1);

                // Haxe.g:149:90: ( paramList )?
                if ( stream_paramList.hasNext() ) {
                    adaptor.addChild(root_1, stream_paramList.nextTree());

                }
                stream_paramList.reset();
                // Haxe.g:149:101: ( typeTagOpt )?
                if ( stream_typeTagOpt.hasNext() ) {
                    adaptor.addChild(root_1, stream_typeTagOpt.nextTree());

                }
                stream_typeTagOpt.reset();
                // Haxe.g:149:113: ( block )?
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
    // Haxe.g:151:1: arrayLit : LBRACKET exprListOpt RBRACKET ;
    public final HaxeParser.arrayLit_return arrayLit() throws RecognitionException {
        HaxeParser.arrayLit_return retval = new HaxeParser.arrayLit_return();
        retval.start = input.LT(1);
        int arrayLit_StartIndex = input.index();
        Object root_0 = null;

        Token LBRACKET58=null;
        Token RBRACKET60=null;
        HaxeParser.exprListOpt_return exprListOpt59 = null;


        Object LBRACKET58_tree=null;
        Object RBRACKET60_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return retval; }
            // Haxe.g:151:13: ( LBRACKET exprListOpt RBRACKET )
            // Haxe.g:151:15: LBRACKET exprListOpt RBRACKET
            {
            root_0 = (Object)adaptor.nil();

            LBRACKET58=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_arrayLit969); if (state.failed) return retval;
            pushFollow(FOLLOW_exprListOpt_in_arrayLit972);
            exprListOpt59=exprListOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, exprListOpt59.getTree());
            RBRACKET60=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_arrayLit974); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // Haxe.g:179:1: typeTag : COLON funcType ;
    public final HaxeParser.typeTag_return typeTag() throws RecognitionException {
        HaxeParser.typeTag_return retval = new HaxeParser.typeTag_return();
        retval.start = input.LT(1);
        int typeTag_StartIndex = input.index();
        Object root_0 = null;

        Token COLON61=null;
        HaxeParser.funcType_return funcType62 = null;


        Object COLON61_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return retval; }
            // Haxe.g:179:9: ( COLON funcType )
            // Haxe.g:179:11: COLON funcType
            {
            root_0 = (Object)adaptor.nil();

            COLON61=(Token)match(input,COLON,FOLLOW_COLON_in_typeTag1006); if (state.failed) return retval;
            pushFollow(FOLLOW_funcType_in_typeTag1009);
            funcType62=funcType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, funcType62.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // Haxe.g:182:1: typeTagOpt : ( typeTag -> ^( TYPE_TAG[\"TYPE_TAG\",true] ( typeTag )? ) | );
    public final HaxeParser.typeTagOpt_return typeTagOpt() throws RecognitionException {
        HaxeParser.typeTagOpt_return retval = new HaxeParser.typeTagOpt_return();
        retval.start = input.LT(1);
        int typeTagOpt_StartIndex = input.index();
        Object root_0 = null;

        HaxeParser.typeTag_return typeTag63 = null;


        RewriteRuleSubtreeStream stream_typeTag=new RewriteRuleSubtreeStream(adaptor,"rule typeTag");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return retval; }
            // Haxe.g:183:5: ( typeTag -> ^( TYPE_TAG[\"TYPE_TAG\",true] ( typeTag )? ) | )
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
                    // Haxe.g:183:10: typeTag
                    {
                    pushFollow(FOLLOW_typeTag_in_typeTagOpt1037);
                    typeTag63=typeTag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeTag.add(typeTag63.getTree());


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
                    // 183:18: -> ^( TYPE_TAG[\"TYPE_TAG\",true] ( typeTag )? )
                    {
                        // Haxe.g:183:21: ^( TYPE_TAG[\"TYPE_TAG\",true] ( typeTag )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new HaxeTree(TYPE_TAG, "TYPE_TAG", true), root_1);

                        // Haxe.g:183:59: ( typeTag )?
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
                    // Haxe.g:185:5: 
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
    // Haxe.g:187:1: typeList : ( type ( COMMA type )* | typeConstraint ( COMMA typeConstraint )* );
    public final HaxeParser.typeList_return typeList() throws RecognitionException {
        HaxeParser.typeList_return retval = new HaxeParser.typeList_return();
        retval.start = input.LT(1);
        int typeList_StartIndex = input.index();
        Object root_0 = null;

        Token COMMA65=null;
        Token COMMA68=null;
        HaxeParser.type_return type64 = null;

        HaxeParser.type_return type66 = null;

        HaxeParser.typeConstraint_return typeConstraint67 = null;

        HaxeParser.typeConstraint_return typeConstraint69 = null;


        Object COMMA65_tree=null;
        Object COMMA68_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return retval; }
            // Haxe.g:188:5: ( type ( COMMA type )* | typeConstraint ( COMMA typeConstraint )* )
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
                    // Haxe.g:188:10: type ( COMMA type )*
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_type_in_typeList1080);
                    type64=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, type64.getTree());
                    // Haxe.g:188:15: ( COMMA type )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==COMMA) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // Haxe.g:188:16: COMMA type
                    	    {
                    	    COMMA65=(Token)match(input,COMMA,FOLLOW_COMMA_in_typeList1083); if (state.failed) return retval;
                    	    pushFollow(FOLLOW_type_in_typeList1086);
                    	    type66=type();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, type66.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // Haxe.g:189:10: typeConstraint ( COMMA typeConstraint )*
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_typeConstraint_in_typeList1103);
                    typeConstraint67=typeConstraint();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeConstraint67.getTree());
                    // Haxe.g:189:25: ( COMMA typeConstraint )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==COMMA) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // Haxe.g:189:26: COMMA typeConstraint
                    	    {
                    	    COMMA68=(Token)match(input,COMMA,FOLLOW_COMMA_in_typeList1106); if (state.failed) return retval;
                    	    pushFollow(FOLLOW_typeConstraint_in_typeList1109);
                    	    typeConstraint69=typeConstraint();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeConstraint69.getTree());

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
    // Haxe.g:192:1: funcType : ( ( type ) ( MINUS_BIGGER type )* | VOID );
    public final HaxeParser.funcType_return funcType() throws RecognitionException {
        HaxeParser.funcType_return retval = new HaxeParser.funcType_return();
        retval.start = input.LT(1);
        int funcType_StartIndex = input.index();
        Object root_0 = null;

        Token MINUS_BIGGER71=null;
        Token VOID73=null;
        HaxeParser.type_return type70 = null;

        HaxeParser.type_return type72 = null;


        Object MINUS_BIGGER71_tree=null;
        Object VOID73_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return retval; }
            // Haxe.g:193:5: ( ( type ) ( MINUS_BIGGER type )* | VOID )
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
                    // Haxe.g:193:10: ( type ) ( MINUS_BIGGER type )*
                    {
                    root_0 = (Object)adaptor.nil();

                    // Haxe.g:193:10: ( type )
                    // Haxe.g:193:11: type
                    {
                    pushFollow(FOLLOW_type_in_funcType1134);
                    type70=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, type70.getTree());

                    }

                    // Haxe.g:193:17: ( MINUS_BIGGER type )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==MINUS_BIGGER) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // Haxe.g:193:18: MINUS_BIGGER type
                    	    {
                    	    MINUS_BIGGER71=(Token)match(input,MINUS_BIGGER,FOLLOW_MINUS_BIGGER_in_funcType1138); if (state.failed) return retval;
                    	    pushFollow(FOLLOW_type_in_funcType1141);
                    	    type72=type();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, type72.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // Haxe.g:194:10: VOID
                    {
                    root_0 = (Object)adaptor.nil();

                    VOID73=(Token)match(input,VOID,FOLLOW_VOID_in_funcType1154); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    VOID73_tree = (Object)adaptor.create(VOID73);
                    adaptor.addChild(root_0, VOID73_tree);
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
    // Haxe.g:197:1: primitiveType : ( INT | FLOAT | DYNAMIC | BOOLEAN | VOID );
    public final HaxeParser.primitiveType_return primitiveType() throws RecognitionException {
        HaxeParser.primitiveType_return retval = new HaxeParser.primitiveType_return();
        retval.start = input.LT(1);
        int primitiveType_StartIndex = input.index();
        Object root_0 = null;

        Token set74=null;

        Object set74_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return retval; }
            // Haxe.g:198:5: ( INT | FLOAT | DYNAMIC | BOOLEAN | VOID )
            // Haxe.g:
            {
            root_0 = (Object)adaptor.nil();

            set74=(Token)input.LT(1);
            if ( input.LA(1)==DYNAMIC||(input.LA(1)>=VOID && input.LA(1)<=BOOLEAN) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set74));
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
    // Haxe.g:201:1: type : ( ( anonType | dotIdent | primitiveType ) ( typeParam )* | );
    public final HaxeParser.type_return type() throws RecognitionException {
        HaxeParser.type_return retval = new HaxeParser.type_return();
        retval.start = input.LT(1);
        int type_StartIndex = input.index();
        Object root_0 = null;

        HaxeParser.anonType_return anonType75 = null;

        HaxeParser.dotIdent_return dotIdent76 = null;

        HaxeParser.primitiveType_return primitiveType77 = null;

        HaxeParser.typeParam_return typeParam78 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return retval; }
            // Haxe.g:201:9: ( ( anonType | dotIdent | primitiveType ) ( typeParam )* | )
            int alt26=2;
            alt26 = dfa26.predict(input);
            switch (alt26) {
                case 1 :
                    // Haxe.g:201:14: ( anonType | dotIdent | primitiveType ) ( typeParam )*
                    {
                    root_0 = (Object)adaptor.nil();

                    // Haxe.g:201:14: ( anonType | dotIdent | primitiveType )
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
                            // Haxe.g:201:15: anonType
                            {
                            pushFollow(FOLLOW_anonType_in_type1214);
                            anonType75=anonType();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, anonType75.getTree());

                            }
                            break;
                        case 2 :
                            // Haxe.g:201:26: dotIdent
                            {
                            pushFollow(FOLLOW_dotIdent_in_type1218);
                            dotIdent76=dotIdent();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, dotIdent76.getTree());

                            }
                            break;
                        case 3 :
                            // Haxe.g:201:37: primitiveType
                            {
                            pushFollow(FOLLOW_primitiveType_in_type1222);
                            primitiveType77=primitiveType();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveType77.getTree());

                            }
                            break;

                    }

                    // Haxe.g:201:53: ( typeParam )*
                    loop25:
                    do {
                        int alt25=2;
                        alt25 = dfa25.predict(input);
                        switch (alt25) {
                    	case 1 :
                    	    // Haxe.g:201:54: typeParam
                    	    {
                    	    pushFollow(FOLLOW_typeParam_in_type1227);
                    	    typeParam78=typeParam();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeParam78.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // Haxe.g:203:9: 
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
    // Haxe.g:205:1: typeParam : ( LT typeList GT | LT typeList LT typeList GTGT | LT typeList LT typeList LT typeList GTGTGT );
    public final HaxeParser.typeParam_return typeParam() throws RecognitionException {
        HaxeParser.typeParam_return retval = new HaxeParser.typeParam_return();
        retval.start = input.LT(1);
        int typeParam_StartIndex = input.index();
        Object root_0 = null;

        Token LT79=null;
        Token GT81=null;
        Token LT82=null;
        Token LT84=null;
        Token GTGT86=null;
        Token LT87=null;
        Token LT89=null;
        Token LT91=null;
        Token GTGTGT93=null;
        HaxeParser.typeList_return typeList80 = null;

        HaxeParser.typeList_return typeList83 = null;

        HaxeParser.typeList_return typeList85 = null;

        HaxeParser.typeList_return typeList88 = null;

        HaxeParser.typeList_return typeList90 = null;

        HaxeParser.typeList_return typeList92 = null;


        Object LT79_tree=null;
        Object GT81_tree=null;
        Object LT82_tree=null;
        Object LT84_tree=null;
        Object GTGT86_tree=null;
        Object LT87_tree=null;
        Object LT89_tree=null;
        Object LT91_tree=null;
        Object GTGTGT93_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return retval; }
            // Haxe.g:206:5: ( LT typeList GT | LT typeList LT typeList GTGT | LT typeList LT typeList LT typeList GTGTGT )
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
                    // Haxe.g:206:10: LT typeList GT
                    {
                    root_0 = (Object)adaptor.nil();

                    LT79=(Token)match(input,LT,FOLLOW_LT_in_typeParam1271); if (state.failed) return retval;
                    pushFollow(FOLLOW_typeList_in_typeParam1274);
                    typeList80=typeList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeList80.getTree());
                    GT81=(Token)match(input,GT,FOLLOW_GT_in_typeParam1276); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // Haxe.g:207:10: LT typeList LT typeList GTGT
                    {
                    root_0 = (Object)adaptor.nil();

                    LT82=(Token)match(input,LT,FOLLOW_LT_in_typeParam1288); if (state.failed) return retval;
                    pushFollow(FOLLOW_typeList_in_typeParam1291);
                    typeList83=typeList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeList83.getTree());
                    LT84=(Token)match(input,LT,FOLLOW_LT_in_typeParam1293); if (state.failed) return retval;
                    pushFollow(FOLLOW_typeList_in_typeParam1296);
                    typeList85=typeList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeList85.getTree());
                    GTGT86=(Token)match(input,GTGT,FOLLOW_GTGT_in_typeParam1298); if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // Haxe.g:208:10: LT typeList LT typeList LT typeList GTGTGT
                    {
                    root_0 = (Object)adaptor.nil();

                    LT87=(Token)match(input,LT,FOLLOW_LT_in_typeParam1310); if (state.failed) return retval;
                    pushFollow(FOLLOW_typeList_in_typeParam1313);
                    typeList88=typeList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeList88.getTree());
                    LT89=(Token)match(input,LT,FOLLOW_LT_in_typeParam1315); if (state.failed) return retval;
                    pushFollow(FOLLOW_typeList_in_typeParam1318);
                    typeList90=typeList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeList90.getTree());
                    LT91=(Token)match(input,LT,FOLLOW_LT_in_typeParam1320); if (state.failed) return retval;
                    pushFollow(FOLLOW_typeList_in_typeParam1323);
                    typeList92=typeList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeList92.getTree());
                    GTGTGT93=(Token)match(input,GTGTGT,FOLLOW_GTGTGT_in_typeParam1325); if (state.failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // Haxe.g:212:1: typeParamOpt : ( typeParam -> ^( TYPE_PARAM_OPT[\"TYPE_PARAM_OPT\",true] ( typeParam )? ) | );
    public final HaxeParser.typeParamOpt_return typeParamOpt() throws RecognitionException {
        HaxeParser.typeParamOpt_return retval = new HaxeParser.typeParamOpt_return();
        retval.start = input.LT(1);
        int typeParamOpt_StartIndex = input.index();
        Object root_0 = null;

        HaxeParser.typeParam_return typeParam94 = null;


        RewriteRuleSubtreeStream stream_typeParam=new RewriteRuleSubtreeStream(adaptor,"rule typeParam");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return retval; }
            // Haxe.g:213:5: ( typeParam -> ^( TYPE_PARAM_OPT[\"TYPE_PARAM_OPT\",true] ( typeParam )? ) | )
            int alt28=2;
            alt28 = dfa28.predict(input);
            switch (alt28) {
                case 1 :
                    // Haxe.g:213:10: typeParam
                    {
                    pushFollow(FOLLOW_typeParam_in_typeParamOpt1357);
                    typeParam94=typeParam();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeParam.add(typeParam94.getTree());


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
                    // 213:20: -> ^( TYPE_PARAM_OPT[\"TYPE_PARAM_OPT\",true] ( typeParam )? )
                    {
                        // Haxe.g:213:23: ^( TYPE_PARAM_OPT[\"TYPE_PARAM_OPT\",true] ( typeParam )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new HaxeTree(TYPE_PARAM_OPT, "TYPE_PARAM_OPT", true), root_1);

                        // Haxe.g:213:73: ( typeParam )?
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
                    // Haxe.g:215:5: 
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
    // Haxe.g:217:1: typeConstraint : IDENTIFIER COLON LPAREN typeList RPAREN -> ^( $typeConstraint ( IDENTIFIER )? ( typeList )? ) ;
    public final HaxeParser.typeConstraint_return typeConstraint() throws RecognitionException {
        HaxeParser.typeConstraint_return retval = new HaxeParser.typeConstraint_return();
        retval.start = input.LT(1);
        int typeConstraint_StartIndex = input.index();
        Object root_0 = null;

        Token IDENTIFIER95=null;
        Token COLON96=null;
        Token LPAREN97=null;
        Token RPAREN99=null;
        HaxeParser.typeList_return typeList98 = null;


        Object IDENTIFIER95_tree=null;
        Object COLON96_tree=null;
        Object LPAREN97_tree=null;
        Object RPAREN99_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_typeList=new RewriteRuleSubtreeStream(adaptor,"rule typeList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return retval; }
            // Haxe.g:218:5: ( IDENTIFIER COLON LPAREN typeList RPAREN -> ^( $typeConstraint ( IDENTIFIER )? ( typeList )? ) )
            // Haxe.g:218:9: IDENTIFIER COLON LPAREN typeList RPAREN
            {
            IDENTIFIER95=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_typeConstraint1406); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER95);

            COLON96=(Token)match(input,COLON,FOLLOW_COLON_in_typeConstraint1408); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COLON.add(COLON96);

            LPAREN97=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_typeConstraint1410); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN97);

            pushFollow(FOLLOW_typeList_in_typeConstraint1412);
            typeList98=typeList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeList.add(typeList98.getTree());
            RPAREN99=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_typeConstraint1414); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN99);



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
            // 218:49: -> ^( $typeConstraint ( IDENTIFIER )? ( typeList )? )
            {
                // Haxe.g:218:52: ^( $typeConstraint ( IDENTIFIER )? ( typeList )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_retval.nextNode(), root_1);

                // Haxe.g:218:70: ( IDENTIFIER )?
                if ( stream_IDENTIFIER.hasNext() ) {
                    adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());

                }
                stream_IDENTIFIER.reset();
                // Haxe.g:218:82: ( typeList )?
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
    // Haxe.g:222:1: functionReturn : ( declAttrList )? FUNCTION NEW LPAREN paramList RPAREN typeTagOpt block -> ^( FUNCTION NEW ( declAttrList )? ( paramList )? ( typeTagOpt )? ( block )? ) ;
    public final HaxeParser.functionReturn_return functionReturn() throws RecognitionException {
        HaxeParser.functionReturn_return retval = new HaxeParser.functionReturn_return();
        retval.start = input.LT(1);
        int functionReturn_StartIndex = input.index();
        Object root_0 = null;

        Token FUNCTION101=null;
        Token NEW102=null;
        Token LPAREN103=null;
        Token RPAREN105=null;
        HaxeParser.declAttrList_return declAttrList100 = null;

        HaxeParser.paramList_return paramList104 = null;

        HaxeParser.typeTagOpt_return typeTagOpt106 = null;

        HaxeParser.block_return block107 = null;


        Object FUNCTION101_tree=null;
        Object NEW102_tree=null;
        Object LPAREN103_tree=null;
        Object RPAREN105_tree=null;
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
            // Haxe.g:223:5: ( ( declAttrList )? FUNCTION NEW LPAREN paramList RPAREN typeTagOpt block -> ^( FUNCTION NEW ( declAttrList )? ( paramList )? ( typeTagOpt )? ( block )? ) )
            // Haxe.g:223:10: ( declAttrList )? FUNCTION NEW LPAREN paramList RPAREN typeTagOpt block
            {
            // Haxe.g:223:10: ( declAttrList )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==PRIVATE||(LA29_0>=PUBLIC && LA29_0<=OVERRIDE)) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // Haxe.g:0:0: declAttrList
                    {
                    pushFollow(FOLLOW_declAttrList_in_functionReturn1452);
                    declAttrList100=declAttrList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declAttrList.add(declAttrList100.getTree());

                    }
                    break;

            }

            FUNCTION101=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_functionReturn1455); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION101);

            NEW102=(Token)match(input,NEW,FOLLOW_NEW_in_functionReturn1457); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_NEW.add(NEW102);

            LPAREN103=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_functionReturn1459); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN103);

            pushFollow(FOLLOW_paramList_in_functionReturn1461);
            paramList104=paramList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_paramList.add(paramList104.getTree());
            RPAREN105=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_functionReturn1463); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN105);

            pushFollow(FOLLOW_typeTagOpt_in_functionReturn1465);
            typeTagOpt106=typeTagOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeTagOpt.add(typeTagOpt106.getTree());
            pushFollow(FOLLOW_block_in_functionReturn1467);
            block107=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block107.getTree());


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
            // 223:78: -> ^( FUNCTION NEW ( declAttrList )? ( paramList )? ( typeTagOpt )? ( block )? )
            {
                // Haxe.g:223:81: ^( FUNCTION NEW ( declAttrList )? ( paramList )? ( typeTagOpt )? ( block )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new FunctionNode(stream_FUNCTION.nextToken()), root_1);

                adaptor.addChild(root_1, stream_NEW.nextNode());
                // Haxe.g:223:110: ( declAttrList )?
                if ( stream_declAttrList.hasNext() ) {
                    adaptor.addChild(root_1, stream_declAttrList.nextTree());

                }
                stream_declAttrList.reset();
                // Haxe.g:223:124: ( paramList )?
                if ( stream_paramList.hasNext() ) {
                    adaptor.addChild(root_1, stream_paramList.nextTree());

                }
                stream_paramList.reset();
                // Haxe.g:223:135: ( typeTagOpt )?
                if ( stream_typeTagOpt.hasNext() ) {
                    adaptor.addChild(root_1, stream_typeTagOpt.nextTree());

                }
                stream_typeTagOpt.reset();
                // Haxe.g:223:147: ( block )?
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
    // Haxe.g:226:1: statement : ( block | assignExpr SEMI | varDecl | IF parExpression st1= statement ( ELSE st2= statement )? -> ^( IF parExpression $st1 ( ^( ELSE $st2) )? ) | FOR LPAREN exp1= expr IN exp2= expr RPAREN statement -> ^( FOR ^( IN $exp1 $exp2) ( statement )? ) | WHILE parExpression statement -> ^( WHILE ( parExpression )? ( statement )? ) | DO statement WHILE parExpression SEMI -> ^( DO ( parExpression )? ( statement )? ) | TRY block catchStmtList -> ^( TRY ( block )? ( catchStmtList )? ) | SWITCH LPAREN expr RPAREN LBRACE ( caseStmt )+ RBRACE -> ^( SWITCH ( expr )? ( caseStmt )+ ) | RETURN ( expr )? SEMI -> ^( RETURN ( expr )? ) | THROW expr SEMI -> ^( THROW ( expr )? ) | BREAK ( IDENTIFIER )? SEMI -> ^( BREAK ( IDENTIFIER )? ) | CONTINUE ( IDENTIFIER )? SEMI -> ^( CONTINUE ( IDENTIFIER )? ) | expr SEMI | IDENTIFIER COLON statement -> ^( COLON ( IDENTIFIER )? ( statement )? ) | SEMI );
    public final HaxeParser.statement_return statement() throws RecognitionException {
        HaxeParser.statement_return retval = new HaxeParser.statement_return();
        retval.start = input.LT(1);
        int statement_StartIndex = input.index();
        Object root_0 = null;

        Token SEMI110=null;
        Token IF112=null;
        Token ELSE114=null;
        Token FOR115=null;
        Token LPAREN116=null;
        Token IN117=null;
        Token RPAREN118=null;
        Token WHILE120=null;
        Token DO123=null;
        Token WHILE125=null;
        Token SEMI127=null;
        Token TRY128=null;
        Token SWITCH131=null;
        Token LPAREN132=null;
        Token RPAREN134=null;
        Token LBRACE135=null;
        Token RBRACE137=null;
        Token RETURN138=null;
        Token SEMI140=null;
        Token THROW141=null;
        Token SEMI143=null;
        Token BREAK144=null;
        Token IDENTIFIER145=null;
        Token SEMI146=null;
        Token CONTINUE147=null;
        Token IDENTIFIER148=null;
        Token SEMI149=null;
        Token SEMI151=null;
        Token IDENTIFIER152=null;
        Token COLON153=null;
        Token SEMI155=null;
        HaxeParser.statement_return st1 = null;

        HaxeParser.statement_return st2 = null;

        HaxeParser.expr_return exp1 = null;

        HaxeParser.expr_return exp2 = null;

        HaxeParser.block_return block108 = null;

        HaxeParser.assignExpr_return assignExpr109 = null;

        HaxeParser.varDecl_return varDecl111 = null;

        HaxeParser.parExpression_return parExpression113 = null;

        HaxeParser.statement_return statement119 = null;

        HaxeParser.parExpression_return parExpression121 = null;

        HaxeParser.statement_return statement122 = null;

        HaxeParser.statement_return statement124 = null;

        HaxeParser.parExpression_return parExpression126 = null;

        HaxeParser.block_return block129 = null;

        HaxeParser.catchStmtList_return catchStmtList130 = null;

        HaxeParser.expr_return expr133 = null;

        HaxeParser.caseStmt_return caseStmt136 = null;

        HaxeParser.expr_return expr139 = null;

        HaxeParser.expr_return expr142 = null;

        HaxeParser.expr_return expr150 = null;

        HaxeParser.statement_return statement154 = null;


        Object SEMI110_tree=null;
        Object IF112_tree=null;
        Object ELSE114_tree=null;
        Object FOR115_tree=null;
        Object LPAREN116_tree=null;
        Object IN117_tree=null;
        Object RPAREN118_tree=null;
        Object WHILE120_tree=null;
        Object DO123_tree=null;
        Object WHILE125_tree=null;
        Object SEMI127_tree=null;
        Object TRY128_tree=null;
        Object SWITCH131_tree=null;
        Object LPAREN132_tree=null;
        Object RPAREN134_tree=null;
        Object LBRACE135_tree=null;
        Object RBRACE137_tree=null;
        Object RETURN138_tree=null;
        Object SEMI140_tree=null;
        Object THROW141_tree=null;
        Object SEMI143_tree=null;
        Object BREAK144_tree=null;
        Object IDENTIFIER145_tree=null;
        Object SEMI146_tree=null;
        Object CONTINUE147_tree=null;
        Object IDENTIFIER148_tree=null;
        Object SEMI149_tree=null;
        Object SEMI151_tree=null;
        Object IDENTIFIER152_tree=null;
        Object COLON153_tree=null;
        Object SEMI155_tree=null;
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
            // Haxe.g:227:5: ( block | assignExpr SEMI | varDecl | IF parExpression st1= statement ( ELSE st2= statement )? -> ^( IF parExpression $st1 ( ^( ELSE $st2) )? ) | FOR LPAREN exp1= expr IN exp2= expr RPAREN statement -> ^( FOR ^( IN $exp1 $exp2) ( statement )? ) | WHILE parExpression statement -> ^( WHILE ( parExpression )? ( statement )? ) | DO statement WHILE parExpression SEMI -> ^( DO ( parExpression )? ( statement )? ) | TRY block catchStmtList -> ^( TRY ( block )? ( catchStmtList )? ) | SWITCH LPAREN expr RPAREN LBRACE ( caseStmt )+ RBRACE -> ^( SWITCH ( expr )? ( caseStmt )+ ) | RETURN ( expr )? SEMI -> ^( RETURN ( expr )? ) | THROW expr SEMI -> ^( THROW ( expr )? ) | BREAK ( IDENTIFIER )? SEMI -> ^( BREAK ( IDENTIFIER )? ) | CONTINUE ( IDENTIFIER )? SEMI -> ^( CONTINUE ( IDENTIFIER )? ) | expr SEMI | IDENTIFIER COLON statement -> ^( COLON ( IDENTIFIER )? ( statement )? ) | SEMI )
            int alt35=16;
            alt35 = dfa35.predict(input);
            switch (alt35) {
                case 1 :
                    // Haxe.g:227:10: block
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_block_in_statement1516);
                    block108=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, block108.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:228:10: assignExpr SEMI
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_assignExpr_in_statement1527);
                    assignExpr109=assignExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignExpr109.getTree());
                    SEMI110=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement1529); if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // Haxe.g:229:10: varDecl
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_varDecl_in_statement1541);
                    varDecl111=varDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDecl111.getTree());

                    }
                    break;
                case 4 :
                    // Haxe.g:230:10: IF parExpression st1= statement ( ELSE st2= statement )?
                    {
                    IF112=(Token)match(input,IF,FOLLOW_IF_in_statement1552); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IF.add(IF112);

                    pushFollow(FOLLOW_parExpression_in_statement1554);
                    parExpression113=parExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_parExpression.add(parExpression113.getTree());
                    pushFollow(FOLLOW_statement_in_statement1558);
                    st1=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(st1.getTree());
                    // Haxe.g:230:41: ( ELSE st2= statement )?
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
                            // Haxe.g:230:42: ELSE st2= statement
                            {
                            ELSE114=(Token)match(input,ELSE,FOLLOW_ELSE_in_statement1561); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_ELSE.add(ELSE114);

                            pushFollow(FOLLOW_statement_in_statement1565);
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
                    // 230:67: -> ^( IF parExpression $st1 ( ^( ELSE $st2) )? )
                    {
                        // Haxe.g:230:70: ^( IF parExpression $st1 ( ^( ELSE $st2) )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new IfNode(stream_IF.nextToken()), root_1);

                        adaptor.addChild(root_1, stream_parExpression.nextTree());
                        adaptor.addChild(root_1, stream_st1.nextTree());
                        // Haxe.g:230:102: ( ^( ELSE $st2) )?
                        if ( stream_ELSE.hasNext()||stream_st2.hasNext() ) {
                            // Haxe.g:230:102: ^( ELSE $st2)
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
                    // Haxe.g:231:10: FOR LPAREN exp1= expr IN exp2= expr RPAREN statement
                    {
                    FOR115=(Token)match(input,FOR,FOLLOW_FOR_in_statement1614); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FOR.add(FOR115);

                    LPAREN116=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_statement1616); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN116);

                    pushFollow(FOLLOW_expr_in_statement1620);
                    exp1=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(exp1.getTree());
                    IN117=(Token)match(input,IN,FOLLOW_IN_in_statement1622); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IN.add(IN117);

                    pushFollow(FOLLOW_expr_in_statement1626);
                    exp2=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(exp2.getTree());
                    RPAREN118=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_statement1628); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN118);

                    pushFollow(FOLLOW_statement_in_statement1630);
                    statement119=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement119.getTree());


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
                    // 231:65: -> ^( FOR ^( IN $exp1 $exp2) ( statement )? )
                    {
                        // Haxe.g:231:68: ^( FOR ^( IN $exp1 $exp2) ( statement )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new ForNode(stream_FOR.nextToken()), root_1);

                        // Haxe.g:231:83: ^( IN $exp1 $exp2)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_IN.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_exp1.nextTree());
                        adaptor.addChild(root_2, stream_exp2.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // Haxe.g:231:101: ( statement )?
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
                    // Haxe.g:232:10: WHILE parExpression statement
                    {
                    WHILE120=(Token)match(input,WHILE,FOLLOW_WHILE_in_statement1667); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHILE.add(WHILE120);

                    pushFollow(FOLLOW_parExpression_in_statement1669);
                    parExpression121=parExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_parExpression.add(parExpression121.getTree());
                    pushFollow(FOLLOW_statement_in_statement1671);
                    statement122=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement122.getTree());


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
                    // 232:56: -> ^( WHILE ( parExpression )? ( statement )? )
                    {
                        // Haxe.g:232:59: ^( WHILE ( parExpression )? ( statement )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new WhileNode(stream_WHILE.nextToken()), root_1);

                        // Haxe.g:232:78: ( parExpression )?
                        if ( stream_parExpression.hasNext() ) {
                            adaptor.addChild(root_1, stream_parExpression.nextTree());

                        }
                        stream_parExpression.reset();
                        // Haxe.g:232:93: ( statement )?
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
                    // Haxe.g:233:10: DO statement WHILE parExpression SEMI
                    {
                    DO123=(Token)match(input,DO,FOLLOW_DO_in_statement1713); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DO.add(DO123);

                    pushFollow(FOLLOW_statement_in_statement1715);
                    statement124=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement124.getTree());
                    WHILE125=(Token)match(input,WHILE,FOLLOW_WHILE_in_statement1717); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHILE.add(WHILE125);

                    pushFollow(FOLLOW_parExpression_in_statement1719);
                    parExpression126=parExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_parExpression.add(parExpression126.getTree());
                    SEMI127=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement1721); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI127);



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
                    // 233:60: -> ^( DO ( parExpression )? ( statement )? )
                    {
                        // Haxe.g:233:63: ^( DO ( parExpression )? ( statement )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new DoWhileNode(stream_DO.nextToken()), root_1);

                        // Haxe.g:233:81: ( parExpression )?
                        if ( stream_parExpression.hasNext() ) {
                            adaptor.addChild(root_1, stream_parExpression.nextTree());

                        }
                        stream_parExpression.reset();
                        // Haxe.g:233:96: ( statement )?
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
                    // Haxe.g:234:10: TRY block catchStmtList
                    {
                    TRY128=(Token)match(input,TRY,FOLLOW_TRY_in_statement1759); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TRY.add(TRY128);

                    pushFollow(FOLLOW_block_in_statement1761);
                    block129=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block129.getTree());
                    pushFollow(FOLLOW_catchStmtList_in_statement1763);
                    catchStmtList130=catchStmtList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_catchStmtList.add(catchStmtList130.getTree());


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
                    // 234:50: -> ^( TRY ( block )? ( catchStmtList )? )
                    {
                        // Haxe.g:234:53: ^( TRY ( block )? ( catchStmtList )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new TryNode(stream_TRY.nextToken()), root_1);

                        // Haxe.g:234:68: ( block )?
                        if ( stream_block.hasNext() ) {
                            adaptor.addChild(root_1, stream_block.nextTree());

                        }
                        stream_block.reset();
                        // Haxe.g:234:75: ( catchStmtList )?
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
                    // Haxe.g:235:10: SWITCH LPAREN expr RPAREN LBRACE ( caseStmt )+ RBRACE
                    {
                    SWITCH131=(Token)match(input,SWITCH,FOLLOW_SWITCH_in_statement1805); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SWITCH.add(SWITCH131);

                    LPAREN132=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_statement1807); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN132);

                    pushFollow(FOLLOW_expr_in_statement1809);
                    expr133=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr133.getTree());
                    RPAREN134=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_statement1811); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN134);

                    LBRACE135=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_statement1813); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LBRACE.add(LBRACE135);

                    // Haxe.g:235:43: ( caseStmt )+
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
                    	    pushFollow(FOLLOW_caseStmt_in_statement1815);
                    	    caseStmt136=caseStmt();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_caseStmt.add(caseStmt136.getTree());

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

                    RBRACE137=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_statement1818); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RBRACE.add(RBRACE137);



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
                    // 235:64: -> ^( SWITCH ( expr )? ( caseStmt )+ )
                    {
                        // Haxe.g:235:67: ^( SWITCH ( expr )? ( caseStmt )+ )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new SwitchNode(stream_SWITCH.nextToken()), root_1);

                        // Haxe.g:235:88: ( expr )?
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
                    // Haxe.g:236:10: RETURN ( expr )? SEMI
                    {
                    RETURN138=(Token)match(input,RETURN,FOLLOW_RETURN_in_statement1848); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RETURN.add(RETURN138);

                    // Haxe.g:236:17: ( expr )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==LPAREN||LA32_0==IDENTIFIER||LA32_0==THIS||(LA32_0>=FUNCTION && LA32_0<=LBRACKET)||LA32_0==NEW||LA32_0==LBRACE||LA32_0==UNTYPED||(LA32_0>=PLUS && LA32_0<=SUB)||(LA32_0>=SUBSUB && LA32_0<=CAST)||LA32_0==NULL||(LA32_0>=LONGLITERAL && LA32_0<=FALSE)) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // Haxe.g:236:18: expr
                            {
                            pushFollow(FOLLOW_expr_in_statement1851);
                            expr139=expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expr.add(expr139.getTree());

                            }
                            break;

                    }

                    SEMI140=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement1855); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI140);



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
                    // 236:49: -> ^( RETURN ( expr )? )
                    {
                        // Haxe.g:236:52: ^( RETURN ( expr )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_RETURN.nextNode(), root_1);

                        // Haxe.g:236:61: ( expr )?
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
                    // Haxe.g:237:10: THROW expr SEMI
                    {
                    THROW141=(Token)match(input,THROW,FOLLOW_THROW_in_statement1894); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THROW.add(THROW141);

                    pushFollow(FOLLOW_expr_in_statement1896);
                    expr142=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr142.getTree());
                    SEMI143=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement1898); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI143);



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
                    // 237:46: -> ^( THROW ( expr )? )
                    {
                        // Haxe.g:237:49: ^( THROW ( expr )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_THROW.nextNode(), root_1);

                        // Haxe.g:237:57: ( expr )?
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
                    // Haxe.g:238:10: BREAK ( IDENTIFIER )? SEMI
                    {
                    BREAK144=(Token)match(input,BREAK,FOLLOW_BREAK_in_statement1938); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_BREAK.add(BREAK144);

                    // Haxe.g:238:16: ( IDENTIFIER )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==IDENTIFIER) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // Haxe.g:238:17: IDENTIFIER
                            {
                            IDENTIFIER145=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_statement1941); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER145);


                            }
                            break;

                    }

                    SEMI146=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement1945); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI146);



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
                    // 238:50: -> ^( BREAK ( IDENTIFIER )? )
                    {
                        // Haxe.g:238:53: ^( BREAK ( IDENTIFIER )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_BREAK.nextNode(), root_1);

                        // Haxe.g:238:61: ( IDENTIFIER )?
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
                    // Haxe.g:239:10: CONTINUE ( IDENTIFIER )? SEMI
                    {
                    CONTINUE147=(Token)match(input,CONTINUE,FOLLOW_CONTINUE_in_statement1980); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CONTINUE.add(CONTINUE147);

                    // Haxe.g:239:19: ( IDENTIFIER )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==IDENTIFIER) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // Haxe.g:239:20: IDENTIFIER
                            {
                            IDENTIFIER148=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_statement1983); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER148);


                            }
                            break;

                    }

                    SEMI149=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement1987); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI149);



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
                    // 239:54: -> ^( CONTINUE ( IDENTIFIER )? )
                    {
                        // Haxe.g:239:57: ^( CONTINUE ( IDENTIFIER )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_CONTINUE.nextNode(), root_1);

                        // Haxe.g:239:68: ( IDENTIFIER )?
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
                    // Haxe.g:240:10: expr SEMI
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_expr_in_statement2023);
                    expr150=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr150.getTree());
                    SEMI151=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement2026); if (state.failed) return retval;

                    }
                    break;
                case 15 :
                    // Haxe.g:241:10: IDENTIFIER COLON statement
                    {
                    IDENTIFIER152=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_statement2038); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER152);

                    COLON153=(Token)match(input,COLON,FOLLOW_COLON_in_statement2040); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(COLON153);

                    pushFollow(FOLLOW_statement_in_statement2042);
                    statement154=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement154.getTree());


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
                    // 241:53: -> ^( COLON ( IDENTIFIER )? ( statement )? )
                    {
                        // Haxe.g:241:56: ^( COLON ( IDENTIFIER )? ( statement )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_COLON.nextNode(), root_1);

                        // Haxe.g:241:64: ( IDENTIFIER )?
                        if ( stream_IDENTIFIER.hasNext() ) {
                            adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());

                        }
                        stream_IDENTIFIER.reset();
                        // Haxe.g:241:76: ( statement )?
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
                    // Haxe.g:242:10: SEMI
                    {
                    root_0 = (Object)adaptor.nil();

                    SEMI155=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement2081); if (state.failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // Haxe.g:245:1: parExpression : LPAREN expr RPAREN ;
    public final HaxeParser.parExpression_return parExpression() throws RecognitionException {
        HaxeParser.parExpression_return retval = new HaxeParser.parExpression_return();
        retval.start = input.LT(1);
        int parExpression_StartIndex = input.index();
        Object root_0 = null;

        Token LPAREN156=null;
        Token RPAREN158=null;
        HaxeParser.expr_return expr157 = null;


        Object LPAREN156_tree=null;
        Object RPAREN158_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return retval; }
            // Haxe.g:246:5: ( LPAREN expr RPAREN )
            // Haxe.g:246:9: LPAREN expr RPAREN
            {
            root_0 = (Object)adaptor.nil();

            LPAREN156=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_parExpression2105); if (state.failed) return retval;
            pushFollow(FOLLOW_expr_in_parExpression2108);
            expr157=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr157.getTree());
            RPAREN158=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_parExpression2110); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // Haxe.g:249:1: block : ( LBRACE ( blockStmt )* RBRACE -> ^( BLOCK_SCOPE[\"BLOCK_SCOPE\", true, $LBRACE] ( blockStmt )* RBRACE[$RBRACE, true] ) | SEMI );
    public final HaxeParser.block_return block() throws RecognitionException {
        HaxeParser.block_return retval = new HaxeParser.block_return();
        retval.start = input.LT(1);
        int block_StartIndex = input.index();
        Object root_0 = null;

        Token LBRACE159=null;
        Token RBRACE161=null;
        Token SEMI162=null;
        HaxeParser.blockStmt_return blockStmt160 = null;


        Object LBRACE159_tree=null;
        Object RBRACE161_tree=null;
        Object SEMI162_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_blockStmt=new RewriteRuleSubtreeStream(adaptor,"rule blockStmt");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return retval; }
            // Haxe.g:249:9: ( LBRACE ( blockStmt )* RBRACE -> ^( BLOCK_SCOPE[\"BLOCK_SCOPE\", true, $LBRACE] ( blockStmt )* RBRACE[$RBRACE, true] ) | SEMI )
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
                    // Haxe.g:249:14: LBRACE ( blockStmt )* RBRACE
                    {
                    LBRACE159=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_block2129); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LBRACE.add(LBRACE159);

                    // Haxe.g:249:21: ( blockStmt )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( ((LA36_0>=SEMI && LA36_0<=LPAREN)||LA36_0==IDENTIFIER||(LA36_0>=EXTERN && LA36_0<=PRIVATE)||(LA36_0>=PUBLIC && LA36_0<=OVERRIDE)||LA36_0==THIS||(LA36_0>=FUNCTION && LA36_0<=LBRACKET)||(LA36_0>=NEW && LA36_0<=IF)||LA36_0==FOR||(LA36_0>=WHILE && LA36_0<=LBRACE)||(LA36_0>=RETURN && LA36_0<=CONTINUE)||LA36_0==UNTYPED||(LA36_0>=PLUS && LA36_0<=SUB)||(LA36_0>=SUBSUB && LA36_0<=INTERFACE)||(LA36_0>=LONGLITERAL && LA36_0<=FALSE)) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // Haxe.g:249:22: blockStmt
                    	    {
                    	    pushFollow(FOLLOW_blockStmt_in_block2132);
                    	    blockStmt160=blockStmt();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_blockStmt.add(blockStmt160.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop36;
                        }
                    } while (true);

                    RBRACE161=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_block2136); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RBRACE.add(RBRACE161);



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
                    // 249:41: -> ^( BLOCK_SCOPE[\"BLOCK_SCOPE\", true, $LBRACE] ( blockStmt )* RBRACE[$RBRACE, true] )
                    {
                        // Haxe.g:249:44: ^( BLOCK_SCOPE[\"BLOCK_SCOPE\", true, $LBRACE] ( blockStmt )* RBRACE[$RBRACE, true] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new BlockScopeNode(BLOCK_SCOPE, "BLOCK_SCOPE", true, LBRACE159), root_1);

                        // Haxe.g:249:104: ( blockStmt )*
                        while ( stream_blockStmt.hasNext() ) {
                            adaptor.addChild(root_1, stream_blockStmt.nextTree());

                        }
                        stream_blockStmt.reset();
                        adaptor.addChild(root_1, new HaxeTree(RBRACE, RBRACE161, true));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // Haxe.g:250:14: SEMI
                    {
                    root_0 = (Object)adaptor.nil();

                    SEMI162=(Token)match(input,SEMI,FOLLOW_SEMI_in_block2171); if (state.failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // Haxe.g:253:1: blockStmt : ( varDecl | classDecl | statement );
    public final HaxeParser.blockStmt_return blockStmt() throws RecognitionException {
        HaxeParser.blockStmt_return retval = new HaxeParser.blockStmt_return();
        retval.start = input.LT(1);
        int blockStmt_StartIndex = input.index();
        Object root_0 = null;

        HaxeParser.varDecl_return varDecl163 = null;

        HaxeParser.classDecl_return classDecl164 = null;

        HaxeParser.statement_return statement165 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return retval; }
            // Haxe.g:254:5: ( varDecl | classDecl | statement )
            int alt38=3;
            alt38 = dfa38.predict(input);
            switch (alt38) {
                case 1 :
                    // Haxe.g:254:10: varDecl
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_varDecl_in_blockStmt2200);
                    varDecl163=varDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDecl163.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:255:10: classDecl
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_classDecl_in_blockStmt2211);
                    classDecl164=classDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, classDecl164.getTree());

                    }
                    break;
                case 3 :
                    // Haxe.g:256:10: statement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_statement_in_blockStmt2222);
                    statement165=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement165.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // Haxe.g:259:1: breakStmt : BREAK SEMI ;
    public final HaxeParser.breakStmt_return breakStmt() throws RecognitionException {
        HaxeParser.breakStmt_return retval = new HaxeParser.breakStmt_return();
        retval.start = input.LT(1);
        int breakStmt_StartIndex = input.index();
        Object root_0 = null;

        Token BREAK166=null;
        Token SEMI167=null;

        Object BREAK166_tree=null;
        Object SEMI167_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return retval; }
            // Haxe.g:260:5: ( BREAK SEMI )
            // Haxe.g:260:10: BREAK SEMI
            {
            root_0 = (Object)adaptor.nil();

            BREAK166=(Token)match(input,BREAK,FOLLOW_BREAK_in_breakStmt2246); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            BREAK166_tree = (Object)adaptor.create(BREAK166);
            adaptor.addChild(root_0, BREAK166_tree);
            }
            SEMI167=(Token)match(input,SEMI,FOLLOW_SEMI_in_breakStmt2248); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // Haxe.g:263:1: continueStmt : CONTINUE SEMI ;
    public final HaxeParser.continueStmt_return continueStmt() throws RecognitionException {
        HaxeParser.continueStmt_return retval = new HaxeParser.continueStmt_return();
        retval.start = input.LT(1);
        int continueStmt_StartIndex = input.index();
        Object root_0 = null;

        Token CONTINUE168=null;
        Token SEMI169=null;

        Object CONTINUE168_tree=null;
        Object SEMI169_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return retval; }
            // Haxe.g:264:5: ( CONTINUE SEMI )
            // Haxe.g:264:10: CONTINUE SEMI
            {
            root_0 = (Object)adaptor.nil();

            CONTINUE168=(Token)match(input,CONTINUE,FOLLOW_CONTINUE_in_continueStmt2273); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            CONTINUE168_tree = (Object)adaptor.create(CONTINUE168);
            adaptor.addChild(root_0, CONTINUE168_tree);
            }
            SEMI169=(Token)match(input,SEMI,FOLLOW_SEMI_in_continueStmt2275); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // Haxe.g:267:1: caseStmt : ( CASE exprList COLON statement -> ^( CASE ( exprList )? ( statement )? ) | DEFAULT COLON statement -> ^( DEFAULT ( statement )? ) );
    public final HaxeParser.caseStmt_return caseStmt() throws RecognitionException {
        HaxeParser.caseStmt_return retval = new HaxeParser.caseStmt_return();
        retval.start = input.LT(1);
        int caseStmt_StartIndex = input.index();
        Object root_0 = null;

        Token CASE170=null;
        Token COLON172=null;
        Token DEFAULT174=null;
        Token COLON175=null;
        HaxeParser.exprList_return exprList171 = null;

        HaxeParser.statement_return statement173 = null;

        HaxeParser.statement_return statement176 = null;


        Object CASE170_tree=null;
        Object COLON172_tree=null;
        Object DEFAULT174_tree=null;
        Object COLON175_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_DEFAULT=new RewriteRuleTokenStream(adaptor,"token DEFAULT");
        RewriteRuleTokenStream stream_CASE=new RewriteRuleTokenStream(adaptor,"token CASE");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_exprList=new RewriteRuleSubtreeStream(adaptor,"rule exprList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return retval; }
            // Haxe.g:268:5: ( CASE exprList COLON statement -> ^( CASE ( exprList )? ( statement )? ) | DEFAULT COLON statement -> ^( DEFAULT ( statement )? ) )
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
                    // Haxe.g:268:10: CASE exprList COLON statement
                    {
                    CASE170=(Token)match(input,CASE,FOLLOW_CASE_in_caseStmt2300); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CASE.add(CASE170);

                    pushFollow(FOLLOW_exprList_in_caseStmt2302);
                    exprList171=exprList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_exprList.add(exprList171.getTree());
                    COLON172=(Token)match(input,COLON,FOLLOW_COLON_in_caseStmt2304); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(COLON172);

                    pushFollow(FOLLOW_statement_in_caseStmt2306);
                    statement173=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement173.getTree());


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
                    // 268:41: -> ^( CASE ( exprList )? ( statement )? )
                    {
                        // Haxe.g:268:44: ^( CASE ( exprList )? ( statement )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_CASE.nextNode(), root_1);

                        // Haxe.g:268:51: ( exprList )?
                        if ( stream_exprList.hasNext() ) {
                            adaptor.addChild(root_1, stream_exprList.nextTree());

                        }
                        stream_exprList.reset();
                        // Haxe.g:268:61: ( statement )?
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
                    // Haxe.g:269:10: DEFAULT COLON statement
                    {
                    DEFAULT174=(Token)match(input,DEFAULT,FOLLOW_DEFAULT_in_caseStmt2330); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DEFAULT.add(DEFAULT174);

                    COLON175=(Token)match(input,COLON,FOLLOW_COLON_in_caseStmt2332); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(COLON175);

                    pushFollow(FOLLOW_statement_in_caseStmt2334);
                    statement176=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement176.getTree());


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
                    // 269:41: -> ^( DEFAULT ( statement )? )
                    {
                        // Haxe.g:269:44: ^( DEFAULT ( statement )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_DEFAULT.nextNode(), root_1);

                        // Haxe.g:269:54: ( statement )?
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
    // Haxe.g:272:1: defaultStmt : DEFAULT COLON ;
    public final HaxeParser.defaultStmt_return defaultStmt() throws RecognitionException {
        HaxeParser.defaultStmt_return retval = new HaxeParser.defaultStmt_return();
        retval.start = input.LT(1);
        int defaultStmt_StartIndex = input.index();
        Object root_0 = null;

        Token DEFAULT177=null;
        Token COLON178=null;

        Object DEFAULT177_tree=null;
        Object COLON178_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return retval; }
            // Haxe.g:273:5: ( DEFAULT COLON )
            // Haxe.g:273:10: DEFAULT COLON
            {
            root_0 = (Object)adaptor.nil();

            DEFAULT177=(Token)match(input,DEFAULT,FOLLOW_DEFAULT_in_defaultStmt2374); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            DEFAULT177_tree = (Object)adaptor.create(DEFAULT177);
            adaptor.addChild(root_0, DEFAULT177_tree);
            }
            COLON178=(Token)match(input,COLON,FOLLOW_COLON_in_defaultStmt2376); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // Haxe.g:276:1: catchStmtList : ( catchStmt catchStmtList | );
    public final HaxeParser.catchStmtList_return catchStmtList() throws RecognitionException {
        HaxeParser.catchStmtList_return retval = new HaxeParser.catchStmtList_return();
        retval.start = input.LT(1);
        int catchStmtList_StartIndex = input.index();
        Object root_0 = null;

        HaxeParser.catchStmt_return catchStmt179 = null;

        HaxeParser.catchStmtList_return catchStmtList180 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return retval; }
            // Haxe.g:277:5: ( catchStmt catchStmtList | )
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
                    // Haxe.g:277:7: catchStmt catchStmtList
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_catchStmt_in_catchStmtList2398);
                    catchStmt179=catchStmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, catchStmt179.getTree());
                    pushFollow(FOLLOW_catchStmtList_in_catchStmtList2400);
                    catchStmtList180=catchStmtList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, catchStmtList180.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:279:5: 
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
    // Haxe.g:281:1: catchStmt : CATCH LPAREN param RPAREN block -> ^( CATCH ( param )? ( block )? ) ;
    public final HaxeParser.catchStmt_return catchStmt() throws RecognitionException {
        HaxeParser.catchStmt_return retval = new HaxeParser.catchStmt_return();
        retval.start = input.LT(1);
        int catchStmt_StartIndex = input.index();
        Object root_0 = null;

        Token CATCH181=null;
        Token LPAREN182=null;
        Token RPAREN184=null;
        HaxeParser.param_return param183 = null;

        HaxeParser.block_return block185 = null;


        Object CATCH181_tree=null;
        Object LPAREN182_tree=null;
        Object RPAREN184_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_CATCH=new RewriteRuleTokenStream(adaptor,"token CATCH");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_param=new RewriteRuleSubtreeStream(adaptor,"rule param");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return retval; }
            // Haxe.g:282:5: ( CATCH LPAREN param RPAREN block -> ^( CATCH ( param )? ( block )? ) )
            // Haxe.g:282:10: CATCH LPAREN param RPAREN block
            {
            CATCH181=(Token)match(input,CATCH,FOLLOW_CATCH_in_catchStmt2430); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CATCH.add(CATCH181);

            LPAREN182=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_catchStmt2432); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN182);

            pushFollow(FOLLOW_param_in_catchStmt2434);
            param183=param();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_param.add(param183.getTree());
            RPAREN184=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_catchStmt2436); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN184);

            pushFollow(FOLLOW_block_in_catchStmt2438);
            block185=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block185.getTree());


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
            // 282:42: -> ^( CATCH ( param )? ( block )? )
            {
                // Haxe.g:282:45: ^( CATCH ( param )? ( block )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_CATCH.nextNode(), root_1);

                // Haxe.g:282:53: ( param )?
                if ( stream_param.hasNext() ) {
                    adaptor.addChild(root_1, stream_param.nextTree());

                }
                stream_param.reset();
                // Haxe.g:282:60: ( block )?
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
    // Haxe.g:287:1: exprListOpt : ( exprList | );
    public final HaxeParser.exprListOpt_return exprListOpt() throws RecognitionException {
        HaxeParser.exprListOpt_return retval = new HaxeParser.exprListOpt_return();
        retval.start = input.LT(1);
        int exprListOpt_StartIndex = input.index();
        Object root_0 = null;

        HaxeParser.exprList_return exprList186 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return retval; }
            // Haxe.g:288:5: ( exprList | )
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
                    // Haxe.g:288:10: exprList
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_exprList_in_exprListOpt2476);
                    exprList186=exprList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, exprList186.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:290:5: 
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
    // Haxe.g:292:1: exprList : expr ( COMMA expr )* ;
    public final HaxeParser.exprList_return exprList() throws RecognitionException {
        HaxeParser.exprList_return retval = new HaxeParser.exprList_return();
        retval.start = input.LT(1);
        int exprList_StartIndex = input.index();
        Object root_0 = null;

        Token COMMA188=null;
        HaxeParser.expr_return expr187 = null;

        HaxeParser.expr_return expr189 = null;


        Object COMMA188_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return retval; }
            // Haxe.g:293:5: ( expr ( COMMA expr )* )
            // Haxe.g:293:10: expr ( COMMA expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_expr_in_exprList2506);
            expr187=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr187.getTree());
            // Haxe.g:293:15: ( COMMA expr )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==COMMA) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // Haxe.g:293:16: COMMA expr
            	    {
            	    COMMA188=(Token)match(input,COMMA,FOLLOW_COMMA_in_exprList2509); if (state.failed) return retval;
            	    pushFollow(FOLLOW_expr_in_exprList2512);
            	    expr189=expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr189.getTree());

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
    // Haxe.g:296:1: expr : ( assignExpr | UNTYPED assignExpr -> ^( UNTYPED assignExpr ) );
    public final HaxeParser.expr_return expr() throws RecognitionException {
        HaxeParser.expr_return retval = new HaxeParser.expr_return();
        retval.start = input.LT(1);
        int expr_StartIndex = input.index();
        Object root_0 = null;

        Token UNTYPED191=null;
        HaxeParser.assignExpr_return assignExpr190 = null;

        HaxeParser.assignExpr_return assignExpr192 = null;


        Object UNTYPED191_tree=null;
        RewriteRuleTokenStream stream_UNTYPED=new RewriteRuleTokenStream(adaptor,"token UNTYPED");
        RewriteRuleSubtreeStream stream_assignExpr=new RewriteRuleSubtreeStream(adaptor,"rule assignExpr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 42) ) { return retval; }
            // Haxe.g:297:5: ( assignExpr | UNTYPED assignExpr -> ^( UNTYPED assignExpr ) )
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
                    // Haxe.g:297:10: assignExpr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_assignExpr_in_expr2538);
                    assignExpr190=assignExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignExpr190.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:298:10: UNTYPED assignExpr
                    {
                    UNTYPED191=(Token)match(input,UNTYPED,FOLLOW_UNTYPED_in_expr2549); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_UNTYPED.add(UNTYPED191);

                    pushFollow(FOLLOW_assignExpr_in_expr2551);
                    assignExpr192=assignExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_assignExpr.add(assignExpr192.getTree());


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
                    // 298:32: -> ^( UNTYPED assignExpr )
                    {
                        // Haxe.g:298:35: ^( UNTYPED assignExpr )
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
    // Haxe.g:301:1: assignExpr : iterExpr ( assignOp iterExpr )* ;
    public final HaxeParser.assignExpr_return assignExpr() throws RecognitionException {
        HaxeParser.assignExpr_return retval = new HaxeParser.assignExpr_return();
        retval.start = input.LT(1);
        int assignExpr_StartIndex = input.index();
        Object root_0 = null;

        HaxeParser.iterExpr_return iterExpr193 = null;

        HaxeParser.assignOp_return assignOp194 = null;

        HaxeParser.iterExpr_return iterExpr195 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 43) ) { return retval; }
            // Haxe.g:302:5: ( iterExpr ( assignOp iterExpr )* )
            // Haxe.g:302:11: iterExpr ( assignOp iterExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_iterExpr_in_assignExpr2583);
            iterExpr193=iterExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, iterExpr193.getTree());
            // Haxe.g:302:20: ( assignOp iterExpr )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( ((LA44_0>=EQ && LA44_0<=AMPEQ)) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // Haxe.g:302:21: assignOp iterExpr
            	    {
            	    pushFollow(FOLLOW_assignOp_in_assignExpr2586);
            	    assignOp194=assignOp();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(assignOp194.getTree(), root_0);
            	    pushFollow(FOLLOW_iterExpr_in_assignExpr2589);
            	    iterExpr195=iterExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, iterExpr195.getTree());

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
    // Haxe.g:305:1: iterExpr : ternaryExpr ( ELLIPSIS ternaryExpr )* ;
    public final HaxeParser.iterExpr_return iterExpr() throws RecognitionException {
        HaxeParser.iterExpr_return retval = new HaxeParser.iterExpr_return();
        retval.start = input.LT(1);
        int iterExpr_StartIndex = input.index();
        Object root_0 = null;

        Token ELLIPSIS197=null;
        HaxeParser.ternaryExpr_return ternaryExpr196 = null;

        HaxeParser.ternaryExpr_return ternaryExpr198 = null;


        Object ELLIPSIS197_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 44) ) { return retval; }
            // Haxe.g:306:5: ( ternaryExpr ( ELLIPSIS ternaryExpr )* )
            // Haxe.g:306:10: ternaryExpr ( ELLIPSIS ternaryExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_ternaryExpr_in_iterExpr2612);
            ternaryExpr196=ternaryExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, ternaryExpr196.getTree());
            // Haxe.g:306:22: ( ELLIPSIS ternaryExpr )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==ELLIPSIS) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // Haxe.g:306:23: ELLIPSIS ternaryExpr
            	    {
            	    ELLIPSIS197=(Token)match(input,ELLIPSIS,FOLLOW_ELLIPSIS_in_iterExpr2615); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    ELLIPSIS197_tree = (Object)adaptor.create(ELLIPSIS197);
            	    root_0 = (Object)adaptor.becomeRoot(ELLIPSIS197_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ternaryExpr_in_iterExpr2618);
            	    ternaryExpr198=ternaryExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, ternaryExpr198.getTree());

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
    // Haxe.g:309:1: ternaryExpr : logicOrExpr ( QUES expr COLON logicOrExpr )* ;
    public final HaxeParser.ternaryExpr_return ternaryExpr() throws RecognitionException {
        HaxeParser.ternaryExpr_return retval = new HaxeParser.ternaryExpr_return();
        retval.start = input.LT(1);
        int ternaryExpr_StartIndex = input.index();
        Object root_0 = null;

        Token QUES200=null;
        Token COLON202=null;
        HaxeParser.logicOrExpr_return logicOrExpr199 = null;

        HaxeParser.expr_return expr201 = null;

        HaxeParser.logicOrExpr_return logicOrExpr203 = null;


        Object QUES200_tree=null;
        Object COLON202_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 45) ) { return retval; }
            // Haxe.g:310:5: ( logicOrExpr ( QUES expr COLON logicOrExpr )* )
            // Haxe.g:310:10: logicOrExpr ( QUES expr COLON logicOrExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_logicOrExpr_in_ternaryExpr2640);
            logicOrExpr199=logicOrExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, logicOrExpr199.getTree());
            // Haxe.g:310:22: ( QUES expr COLON logicOrExpr )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==QUES) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // Haxe.g:310:23: QUES expr COLON logicOrExpr
            	    {
            	    QUES200=(Token)match(input,QUES,FOLLOW_QUES_in_ternaryExpr2643); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    QUES200_tree = (Object)adaptor.create(QUES200);
            	    root_0 = (Object)adaptor.becomeRoot(QUES200_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_expr_in_ternaryExpr2646);
            	    expr201=expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr201.getTree());
            	    COLON202=(Token)match(input,COLON,FOLLOW_COLON_in_ternaryExpr2648); if (state.failed) return retval;
            	    pushFollow(FOLLOW_logicOrExpr_in_ternaryExpr2651);
            	    logicOrExpr203=logicOrExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, logicOrExpr203.getTree());

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
    // Haxe.g:313:1: logicOrExpr : logicAndExpr ( BARBAR logicAndExpr )* ;
    public final HaxeParser.logicOrExpr_return logicOrExpr() throws RecognitionException {
        HaxeParser.logicOrExpr_return retval = new HaxeParser.logicOrExpr_return();
        retval.start = input.LT(1);
        int logicOrExpr_StartIndex = input.index();
        Object root_0 = null;

        Token BARBAR205=null;
        HaxeParser.logicAndExpr_return logicAndExpr204 = null;

        HaxeParser.logicAndExpr_return logicAndExpr206 = null;


        Object BARBAR205_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 46) ) { return retval; }
            // Haxe.g:314:5: ( logicAndExpr ( BARBAR logicAndExpr )* )
            // Haxe.g:314:10: logicAndExpr ( BARBAR logicAndExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_logicAndExpr_in_logicOrExpr2673);
            logicAndExpr204=logicAndExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, logicAndExpr204.getTree());
            // Haxe.g:314:23: ( BARBAR logicAndExpr )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==BARBAR) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // Haxe.g:314:24: BARBAR logicAndExpr
            	    {
            	    BARBAR205=(Token)match(input,BARBAR,FOLLOW_BARBAR_in_logicOrExpr2676); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    BARBAR205_tree = (Object)adaptor.create(BARBAR205);
            	    root_0 = (Object)adaptor.becomeRoot(BARBAR205_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_logicAndExpr_in_logicOrExpr2679);
            	    logicAndExpr206=logicAndExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, logicAndExpr206.getTree());

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
    // Haxe.g:317:1: logicAndExpr : ( cmpExpr ) ( AMPAMP cmpExpr )* ;
    public final HaxeParser.logicAndExpr_return logicAndExpr() throws RecognitionException {
        HaxeParser.logicAndExpr_return retval = new HaxeParser.logicAndExpr_return();
        retval.start = input.LT(1);
        int logicAndExpr_StartIndex = input.index();
        Object root_0 = null;

        Token AMPAMP208=null;
        HaxeParser.cmpExpr_return cmpExpr207 = null;

        HaxeParser.cmpExpr_return cmpExpr209 = null;


        Object AMPAMP208_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 47) ) { return retval; }
            // Haxe.g:318:5: ( ( cmpExpr ) ( AMPAMP cmpExpr )* )
            // Haxe.g:318:10: ( cmpExpr ) ( AMPAMP cmpExpr )*
            {
            root_0 = (Object)adaptor.nil();

            // Haxe.g:318:10: ( cmpExpr )
            // Haxe.g:318:11: cmpExpr
            {
            pushFollow(FOLLOW_cmpExpr_in_logicAndExpr2706);
            cmpExpr207=cmpExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, cmpExpr207.getTree());

            }

            // Haxe.g:318:20: ( AMPAMP cmpExpr )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==AMPAMP) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // Haxe.g:318:21: AMPAMP cmpExpr
            	    {
            	    AMPAMP208=(Token)match(input,AMPAMP,FOLLOW_AMPAMP_in_logicAndExpr2710); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    AMPAMP208_tree = (Object)adaptor.create(AMPAMP208);
            	    root_0 = (Object)adaptor.becomeRoot(AMPAMP208_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_cmpExpr_in_logicAndExpr2713);
            	    cmpExpr209=cmpExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, cmpExpr209.getTree());

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
    // Haxe.g:321:1: cmpExpr : ( bitExpr ) ( ( EQEQ | BANGEQ | GTEQ | LTEQ | GT | LT ) bitExpr )* ;
    public final HaxeParser.cmpExpr_return cmpExpr() throws RecognitionException {
        HaxeParser.cmpExpr_return retval = new HaxeParser.cmpExpr_return();
        retval.start = input.LT(1);
        int cmpExpr_StartIndex = input.index();
        Object root_0 = null;

        Token EQEQ211=null;
        Token BANGEQ212=null;
        Token GTEQ213=null;
        Token LTEQ214=null;
        Token GT215=null;
        Token LT216=null;
        HaxeParser.bitExpr_return bitExpr210 = null;

        HaxeParser.bitExpr_return bitExpr217 = null;


        Object EQEQ211_tree=null;
        Object BANGEQ212_tree=null;
        Object GTEQ213_tree=null;
        Object LTEQ214_tree=null;
        Object GT215_tree=null;
        Object LT216_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 48) ) { return retval; }
            // Haxe.g:321:9: ( ( bitExpr ) ( ( EQEQ | BANGEQ | GTEQ | LTEQ | GT | LT ) bitExpr )* )
            // Haxe.g:321:14: ( bitExpr ) ( ( EQEQ | BANGEQ | GTEQ | LTEQ | GT | LT ) bitExpr )*
            {
            root_0 = (Object)adaptor.nil();

            // Haxe.g:321:14: ( bitExpr )
            // Haxe.g:321:15: bitExpr
            {
            pushFollow(FOLLOW_bitExpr_in_cmpExpr2736);
            bitExpr210=bitExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bitExpr210.getTree());

            }

            // Haxe.g:321:24: ( ( EQEQ | BANGEQ | GTEQ | LTEQ | GT | LT ) bitExpr )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( ((LA50_0>=LT && LA50_0<=GT)||(LA50_0>=EQEQ && LA50_0<=LTEQ)) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // Haxe.g:321:25: ( EQEQ | BANGEQ | GTEQ | LTEQ | GT | LT ) bitExpr
            	    {
            	    // Haxe.g:321:25: ( EQEQ | BANGEQ | GTEQ | LTEQ | GT | LT )
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
            	            // Haxe.g:321:26: EQEQ
            	            {
            	            EQEQ211=(Token)match(input,EQEQ,FOLLOW_EQEQ_in_cmpExpr2741); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            EQEQ211_tree = (Object)adaptor.create(EQEQ211);
            	            root_0 = (Object)adaptor.becomeRoot(EQEQ211_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // Haxe.g:321:33: BANGEQ
            	            {
            	            BANGEQ212=(Token)match(input,BANGEQ,FOLLOW_BANGEQ_in_cmpExpr2745); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            BANGEQ212_tree = (Object)adaptor.create(BANGEQ212);
            	            root_0 = (Object)adaptor.becomeRoot(BANGEQ212_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // Haxe.g:321:43: GTEQ
            	            {
            	            GTEQ213=(Token)match(input,GTEQ,FOLLOW_GTEQ_in_cmpExpr2750); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            GTEQ213_tree = (Object)adaptor.create(GTEQ213);
            	            root_0 = (Object)adaptor.becomeRoot(GTEQ213_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // Haxe.g:321:51: LTEQ
            	            {
            	            LTEQ214=(Token)match(input,LTEQ,FOLLOW_LTEQ_in_cmpExpr2755); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            LTEQ214_tree = (Object)adaptor.create(LTEQ214);
            	            root_0 = (Object)adaptor.becomeRoot(LTEQ214_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 5 :
            	            // Haxe.g:321:59: GT
            	            {
            	            GT215=(Token)match(input,GT,FOLLOW_GT_in_cmpExpr2760); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            GT215_tree = (Object)adaptor.create(GT215);
            	            root_0 = (Object)adaptor.becomeRoot(GT215_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 6 :
            	            // Haxe.g:321:65: LT
            	            {
            	            LT216=(Token)match(input,LT,FOLLOW_LT_in_cmpExpr2765); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            LT216_tree = (Object)adaptor.create(LT216);
            	            root_0 = (Object)adaptor.becomeRoot(LT216_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_bitExpr_in_cmpExpr2770);
            	    bitExpr217=bitExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, bitExpr217.getTree());

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
    // Haxe.g:324:1: bitExpr : ( shiftExpr ) ( BAR shiftExpr | AMP shiftExpr | CARET shiftExpr )* ;
    public final HaxeParser.bitExpr_return bitExpr() throws RecognitionException {
        HaxeParser.bitExpr_return retval = new HaxeParser.bitExpr_return();
        retval.start = input.LT(1);
        int bitExpr_StartIndex = input.index();
        Object root_0 = null;

        Token BAR219=null;
        Token AMP221=null;
        Token CARET223=null;
        HaxeParser.shiftExpr_return shiftExpr218 = null;

        HaxeParser.shiftExpr_return shiftExpr220 = null;

        HaxeParser.shiftExpr_return shiftExpr222 = null;

        HaxeParser.shiftExpr_return shiftExpr224 = null;


        Object BAR219_tree=null;
        Object AMP221_tree=null;
        Object CARET223_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 49) ) { return retval; }
            // Haxe.g:324:9: ( ( shiftExpr ) ( BAR shiftExpr | AMP shiftExpr | CARET shiftExpr )* )
            // Haxe.g:324:14: ( shiftExpr ) ( BAR shiftExpr | AMP shiftExpr | CARET shiftExpr )*
            {
            root_0 = (Object)adaptor.nil();

            // Haxe.g:324:14: ( shiftExpr )
            // Haxe.g:324:15: shiftExpr
            {
            pushFollow(FOLLOW_shiftExpr_in_bitExpr2793);
            shiftExpr218=shiftExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, shiftExpr218.getTree());

            }

            // Haxe.g:324:26: ( BAR shiftExpr | AMP shiftExpr | CARET shiftExpr )*
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
            	    // Haxe.g:324:27: BAR shiftExpr
            	    {
            	    BAR219=(Token)match(input,BAR,FOLLOW_BAR_in_bitExpr2797); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    BAR219_tree = (Object)adaptor.create(BAR219);
            	    root_0 = (Object)adaptor.becomeRoot(BAR219_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_shiftExpr_in_bitExpr2800);
            	    shiftExpr220=shiftExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, shiftExpr220.getTree());

            	    }
            	    break;
            	case 2 :
            	    // Haxe.g:324:44: AMP shiftExpr
            	    {
            	    AMP221=(Token)match(input,AMP,FOLLOW_AMP_in_bitExpr2804); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    AMP221_tree = (Object)adaptor.create(AMP221);
            	    root_0 = (Object)adaptor.becomeRoot(AMP221_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_shiftExpr_in_bitExpr2807);
            	    shiftExpr222=shiftExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, shiftExpr222.getTree());

            	    }
            	    break;
            	case 3 :
            	    // Haxe.g:324:60: CARET shiftExpr
            	    {
            	    CARET223=(Token)match(input,CARET,FOLLOW_CARET_in_bitExpr2810); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    CARET223_tree = (Object)adaptor.create(CARET223);
            	    root_0 = (Object)adaptor.becomeRoot(CARET223_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_shiftExpr_in_bitExpr2813);
            	    shiftExpr224=shiftExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, shiftExpr224.getTree());

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
    // Haxe.g:327:1: shiftExpr : ( addExpr ) ( LTLT addExpr | ( GT GT ) addExpr | GTGTGT addExpr )* ;
    public final HaxeParser.shiftExpr_return shiftExpr() throws RecognitionException {
        HaxeParser.shiftExpr_return retval = new HaxeParser.shiftExpr_return();
        retval.start = input.LT(1);
        int shiftExpr_StartIndex = input.index();
        Object root_0 = null;

        Token LTLT226=null;
        Token GT228=null;
        Token GT229=null;
        Token GTGTGT231=null;
        HaxeParser.addExpr_return addExpr225 = null;

        HaxeParser.addExpr_return addExpr227 = null;

        HaxeParser.addExpr_return addExpr230 = null;

        HaxeParser.addExpr_return addExpr232 = null;


        Object LTLT226_tree=null;
        Object GT228_tree=null;
        Object GT229_tree=null;
        Object GTGTGT231_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 50) ) { return retval; }
            // Haxe.g:328:5: ( ( addExpr ) ( LTLT addExpr | ( GT GT ) addExpr | GTGTGT addExpr )* )
            // Haxe.g:328:10: ( addExpr ) ( LTLT addExpr | ( GT GT ) addExpr | GTGTGT addExpr )*
            {
            root_0 = (Object)adaptor.nil();

            // Haxe.g:328:10: ( addExpr )
            // Haxe.g:328:11: addExpr
            {
            pushFollow(FOLLOW_addExpr_in_shiftExpr2840);
            addExpr225=addExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, addExpr225.getTree());

            }

            // Haxe.g:328:20: ( LTLT addExpr | ( GT GT ) addExpr | GTGTGT addExpr )*
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
            	    // Haxe.g:328:21: LTLT addExpr
            	    {
            	    LTLT226=(Token)match(input,LTLT,FOLLOW_LTLT_in_shiftExpr2844); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    LTLT226_tree = (Object)adaptor.create(LTLT226);
            	    root_0 = (Object)adaptor.becomeRoot(LTLT226_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_addExpr_in_shiftExpr2848);
            	    addExpr227=addExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, addExpr227.getTree());

            	    }
            	    break;
            	case 2 :
            	    // Haxe.g:328:38: ( GT GT ) addExpr
            	    {
            	    // Haxe.g:328:38: ( GT GT )
            	    // Haxe.g:328:39: GT GT
            	    {
            	    GT228=(Token)match(input,GT,FOLLOW_GT_in_shiftExpr2853); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    GT228_tree = (Object)adaptor.create(GT228);
            	    adaptor.addChild(root_0, GT228_tree);
            	    }
            	    GT229=(Token)match(input,GT,FOLLOW_GT_in_shiftExpr2855); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    GT229_tree = (Object)adaptor.create(GT229);
            	    adaptor.addChild(root_0, GT229_tree);
            	    }

            	    }

            	    pushFollow(FOLLOW_addExpr_in_shiftExpr2860);
            	    addExpr230=addExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, addExpr230.getTree());

            	    }
            	    break;
            	case 3 :
            	    // Haxe.g:328:58: GTGTGT addExpr
            	    {
            	    GTGTGT231=(Token)match(input,GTGTGT,FOLLOW_GTGTGT_in_shiftExpr2864); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    GTGTGT231_tree = (Object)adaptor.create(GTGTGT231);
            	    root_0 = (Object)adaptor.becomeRoot(GTGTGT231_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_addExpr_in_shiftExpr2867);
            	    addExpr232=addExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, addExpr232.getTree());

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
    // Haxe.g:331:1: addExpr : ( multExpr ) ( ( PLUS | SUB ) multExpr )* ;
    public final HaxeParser.addExpr_return addExpr() throws RecognitionException {
        HaxeParser.addExpr_return retval = new HaxeParser.addExpr_return();
        retval.start = input.LT(1);
        int addExpr_StartIndex = input.index();
        Object root_0 = null;

        Token PLUS234=null;
        Token SUB235=null;
        HaxeParser.multExpr_return multExpr233 = null;

        HaxeParser.multExpr_return multExpr236 = null;


        Object PLUS234_tree=null;
        Object SUB235_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 51) ) { return retval; }
            // Haxe.g:331:9: ( ( multExpr ) ( ( PLUS | SUB ) multExpr )* )
            // Haxe.g:331:15: ( multExpr ) ( ( PLUS | SUB ) multExpr )*
            {
            root_0 = (Object)adaptor.nil();

            // Haxe.g:331:15: ( multExpr )
            // Haxe.g:331:16: multExpr
            {
            pushFollow(FOLLOW_multExpr_in_addExpr2887);
            multExpr233=multExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, multExpr233.getTree());

            }

            // Haxe.g:331:26: ( ( PLUS | SUB ) multExpr )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( ((LA54_0>=PLUS && LA54_0<=SUB)) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // Haxe.g:331:27: ( PLUS | SUB ) multExpr
            	    {
            	    // Haxe.g:331:27: ( PLUS | SUB )
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
            	            // Haxe.g:331:28: PLUS
            	            {
            	            PLUS234=(Token)match(input,PLUS,FOLLOW_PLUS_in_addExpr2892); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            PLUS234_tree = (Object)adaptor.create(PLUS234);
            	            root_0 = (Object)adaptor.becomeRoot(PLUS234_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // Haxe.g:331:36: SUB
            	            {
            	            SUB235=(Token)match(input,SUB,FOLLOW_SUB_in_addExpr2897); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            SUB235_tree = (Object)adaptor.create(SUB235);
            	            root_0 = (Object)adaptor.becomeRoot(SUB235_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_multExpr_in_addExpr2901);
            	    multExpr236=multExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, multExpr236.getTree());

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
    // Haxe.g:334:1: multExpr : ( prefixExpr ) ( ( STAR | SLASH | PERCENT ) prefixExpr )* ;
    public final HaxeParser.multExpr_return multExpr() throws RecognitionException {
        HaxeParser.multExpr_return retval = new HaxeParser.multExpr_return();
        retval.start = input.LT(1);
        int multExpr_StartIndex = input.index();
        Object root_0 = null;

        Token STAR238=null;
        Token SLASH239=null;
        Token PERCENT240=null;
        HaxeParser.prefixExpr_return prefixExpr237 = null;

        HaxeParser.prefixExpr_return prefixExpr241 = null;


        Object STAR238_tree=null;
        Object SLASH239_tree=null;
        Object PERCENT240_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 52) ) { return retval; }
            // Haxe.g:334:9: ( ( prefixExpr ) ( ( STAR | SLASH | PERCENT ) prefixExpr )* )
            // Haxe.g:334:14: ( prefixExpr ) ( ( STAR | SLASH | PERCENT ) prefixExpr )*
            {
            root_0 = (Object)adaptor.nil();

            // Haxe.g:334:14: ( prefixExpr )
            // Haxe.g:334:15: prefixExpr
            {
            pushFollow(FOLLOW_prefixExpr_in_multExpr2928);
            prefixExpr237=prefixExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, prefixExpr237.getTree());

            }

            // Haxe.g:334:27: ( ( STAR | SLASH | PERCENT ) prefixExpr )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( ((LA56_0>=STAR && LA56_0<=PERCENT)) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // Haxe.g:334:28: ( STAR | SLASH | PERCENT ) prefixExpr
            	    {
            	    // Haxe.g:334:28: ( STAR | SLASH | PERCENT )
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
            	            // Haxe.g:334:29: STAR
            	            {
            	            STAR238=(Token)match(input,STAR,FOLLOW_STAR_in_multExpr2933); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            STAR238_tree = (Object)adaptor.create(STAR238);
            	            root_0 = (Object)adaptor.becomeRoot(STAR238_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // Haxe.g:334:35: SLASH
            	            {
            	            SLASH239=(Token)match(input,SLASH,FOLLOW_SLASH_in_multExpr2936); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            SLASH239_tree = (Object)adaptor.create(SLASH239);
            	            root_0 = (Object)adaptor.becomeRoot(SLASH239_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // Haxe.g:334:42: PERCENT
            	            {
            	            PERCENT240=(Token)match(input,PERCENT,FOLLOW_PERCENT_in_multExpr2939); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            PERCENT240_tree = (Object)adaptor.create(PERCENT240);
            	            root_0 = (Object)adaptor.becomeRoot(PERCENT240_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_prefixExpr_in_multExpr2943);
            	    prefixExpr241=prefixExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, prefixExpr241.getTree());

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
    // Haxe.g:337:1: prefixExpr : ( ( SUB | SUBSUB | PLUS | PLUSPLUS | BANG | TILDE ) prefixExpr | newExpr | cast | suffixExpr );
    public final HaxeParser.prefixExpr_return prefixExpr() throws RecognitionException {
        HaxeParser.prefixExpr_return retval = new HaxeParser.prefixExpr_return();
        retval.start = input.LT(1);
        int prefixExpr_StartIndex = input.index();
        Object root_0 = null;

        Token set242=null;
        HaxeParser.prefixExpr_return prefixExpr243 = null;

        HaxeParser.newExpr_return newExpr244 = null;

        HaxeParser.cast_return cast245 = null;

        HaxeParser.suffixExpr_return suffixExpr246 = null;


        Object set242_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 53) ) { return retval; }
            // Haxe.g:338:5: ( ( SUB | SUBSUB | PLUS | PLUSPLUS | BANG | TILDE ) prefixExpr | newExpr | cast | suffixExpr )
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
                    // Haxe.g:338:10: ( SUB | SUBSUB | PLUS | PLUSPLUS | BANG | TILDE ) prefixExpr
                    {
                    root_0 = (Object)adaptor.nil();

                    set242=(Token)input.LT(1);
                    set242=(Token)input.LT(1);
                    if ( (input.LA(1)>=PLUS && input.LA(1)<=SUB)||(input.LA(1)>=SUBSUB && input.LA(1)<=TILDE) ) {
                        input.consume();
                        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set242), root_0);
                        state.errorRecovery=false;state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_prefixExpr_in_prefixExpr2988);
                    prefixExpr243=prefixExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, prefixExpr243.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:339:10: newExpr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_newExpr_in_prefixExpr2999);
                    newExpr244=newExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, newExpr244.getTree());

                    }
                    break;
                case 3 :
                    // Haxe.g:340:10: cast
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_cast_in_prefixExpr3010);
                    cast245=cast();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, cast245.getTree());

                    }
                    break;
                case 4 :
                    // Haxe.g:341:10: suffixExpr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_suffixExpr_in_prefixExpr3021);
                    suffixExpr246=suffixExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, suffixExpr246.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // Haxe.g:344:1: suffixExpr : ( value methodCallOrSliceList -> ^( SUFFIX_EXPR[\"CallOrSlice\",true] ( value )? ( methodCallOrSliceList )? ) | value PLUSPLUS -> ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] ( value )? ( PLUSPLUS )? ) | value SUBSUB -> ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] ( value )? SUBSUB ) | value typeParamOpt );
    public final HaxeParser.suffixExpr_return suffixExpr() throws RecognitionException {
        HaxeParser.suffixExpr_return retval = new HaxeParser.suffixExpr_return();
        retval.start = input.LT(1);
        int suffixExpr_StartIndex = input.index();
        Object root_0 = null;

        Token PLUSPLUS250=null;
        Token SUBSUB252=null;
        HaxeParser.value_return value247 = null;

        HaxeParser.methodCallOrSliceList_return methodCallOrSliceList248 = null;

        HaxeParser.value_return value249 = null;

        HaxeParser.value_return value251 = null;

        HaxeParser.value_return value253 = null;

        HaxeParser.typeParamOpt_return typeParamOpt254 = null;


        Object PLUSPLUS250_tree=null;
        Object SUBSUB252_tree=null;
        RewriteRuleTokenStream stream_SUBSUB=new RewriteRuleTokenStream(adaptor,"token SUBSUB");
        RewriteRuleTokenStream stream_PLUSPLUS=new RewriteRuleTokenStream(adaptor,"token PLUSPLUS");
        RewriteRuleSubtreeStream stream_methodCallOrSliceList=new RewriteRuleSubtreeStream(adaptor,"rule methodCallOrSliceList");
        RewriteRuleSubtreeStream stream_value=new RewriteRuleSubtreeStream(adaptor,"rule value");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 54) ) { return retval; }
            // Haxe.g:345:5: ( value methodCallOrSliceList -> ^( SUFFIX_EXPR[\"CallOrSlice\",true] ( value )? ( methodCallOrSliceList )? ) | value PLUSPLUS -> ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] ( value )? ( PLUSPLUS )? ) | value SUBSUB -> ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] ( value )? SUBSUB ) | value typeParamOpt )
            int alt58=4;
            alt58 = dfa58.predict(input);
            switch (alt58) {
                case 1 :
                    // Haxe.g:345:10: value methodCallOrSliceList
                    {
                    pushFollow(FOLLOW_value_in_suffixExpr3045);
                    value247=value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_value.add(value247.getTree());
                    pushFollow(FOLLOW_methodCallOrSliceList_in_suffixExpr3047);
                    methodCallOrSliceList248=methodCallOrSliceList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_methodCallOrSliceList.add(methodCallOrSliceList248.getTree());


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
                    // 345:38: -> ^( SUFFIX_EXPR[\"CallOrSlice\",true] ( value )? ( methodCallOrSliceList )? )
                    {
                        // Haxe.g:345:41: ^( SUFFIX_EXPR[\"CallOrSlice\",true] ( value )? ( methodCallOrSliceList )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new HaxeTree(SUFFIX_EXPR, "CallOrSlice", true), root_1);

                        // Haxe.g:345:85: ( value )?
                        if ( stream_value.hasNext() ) {
                            adaptor.addChild(root_1, stream_value.nextTree());

                        }
                        stream_value.reset();
                        // Haxe.g:345:92: ( methodCallOrSliceList )?
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
                    // Haxe.g:346:10: value PLUSPLUS
                    {
                    pushFollow(FOLLOW_value_in_suffixExpr3074);
                    value249=value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_value.add(value249.getTree());
                    PLUSPLUS250=(Token)match(input,PLUSPLUS,FOLLOW_PLUSPLUS_in_suffixExpr3076); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PLUSPLUS.add(PLUSPLUS250);



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
                    // 346:37: -> ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] ( value )? ( PLUSPLUS )? )
                    {
                        // Haxe.g:346:40: ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] ( value )? ( PLUSPLUS )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new HaxeTree(SUFFIX_EXPR, "SUFFIX_EXPR", true), root_1);

                        // Haxe.g:346:84: ( value )?
                        if ( stream_value.hasNext() ) {
                            adaptor.addChild(root_1, stream_value.nextTree());

                        }
                        stream_value.reset();
                        // Haxe.g:346:91: ( PLUSPLUS )?
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
                    // Haxe.g:347:10: value SUBSUB
                    {
                    pushFollow(FOLLOW_value_in_suffixExpr3115);
                    value251=value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_value.add(value251.getTree());
                    SUBSUB252=(Token)match(input,SUBSUB,FOLLOW_SUBSUB_in_suffixExpr3117); if (state.failed) return retval; 
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
                    // 347:35: -> ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] ( value )? SUBSUB )
                    {
                        // Haxe.g:347:38: ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] ( value )? SUBSUB )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new HaxeTree(SUFFIX_EXPR, "SUFFIX_EXPR", true), root_1);

                        // Haxe.g:347:82: ( value )?
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
                    // Haxe.g:348:10: value typeParamOpt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_value_in_suffixExpr3155);
                    value253=value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, value253.getTree());
                    pushFollow(FOLLOW_typeParamOpt_in_suffixExpr3157);
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
    // Haxe.g:351:1: methodCallOrSlice : ( LPAREN exprListOpt RPAREN -> ^( SUFFIX_EXPR[\"MethodCall\",true] ( exprListOpt )? ) | LBRACKET expr RBRACKET -> ^( SUFFIX_EXPR[\"Slice\",true] ( expr )? ) );
    public final HaxeParser.methodCallOrSlice_return methodCallOrSlice() throws RecognitionException {
        HaxeParser.methodCallOrSlice_return retval = new HaxeParser.methodCallOrSlice_return();
        retval.start = input.LT(1);
        int methodCallOrSlice_StartIndex = input.index();
        Object root_0 = null;

        Token LPAREN255=null;
        Token RPAREN257=null;
        Token LBRACKET258=null;
        Token RBRACKET260=null;
        HaxeParser.exprListOpt_return exprListOpt256 = null;

        HaxeParser.expr_return expr259 = null;


        Object LPAREN255_tree=null;
        Object RPAREN257_tree=null;
        Object LBRACKET258_tree=null;
        Object RBRACKET260_tree=null;
        RewriteRuleTokenStream stream_LBRACKET=new RewriteRuleTokenStream(adaptor,"token LBRACKET");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_RBRACKET=new RewriteRuleTokenStream(adaptor,"token RBRACKET");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_exprListOpt=new RewriteRuleSubtreeStream(adaptor,"rule exprListOpt");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 55) ) { return retval; }
            // Haxe.g:352:5: ( LPAREN exprListOpt RPAREN -> ^( SUFFIX_EXPR[\"MethodCall\",true] ( exprListOpt )? ) | LBRACKET expr RBRACKET -> ^( SUFFIX_EXPR[\"Slice\",true] ( expr )? ) )
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
                    // Haxe.g:352:10: LPAREN exprListOpt RPAREN
                    {
                    LPAREN255=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_methodCallOrSlice3177); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN255);

                    pushFollow(FOLLOW_exprListOpt_in_methodCallOrSlice3179);
                    exprListOpt256=exprListOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_exprListOpt.add(exprListOpt256.getTree());
                    RPAREN257=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_methodCallOrSlice3181); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN257);



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
                    // 352:36: -> ^( SUFFIX_EXPR[\"MethodCall\",true] ( exprListOpt )? )
                    {
                        // Haxe.g:352:39: ^( SUFFIX_EXPR[\"MethodCall\",true] ( exprListOpt )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new HaxeTree(SUFFIX_EXPR, "MethodCall", true), root_1);

                        // Haxe.g:352:82: ( exprListOpt )?
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
                    // Haxe.g:353:10: LBRACKET expr RBRACKET
                    {
                    LBRACKET258=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_methodCallOrSlice3205); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LBRACKET.add(LBRACKET258);

                    pushFollow(FOLLOW_expr_in_methodCallOrSlice3207);
                    expr259=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr259.getTree());
                    RBRACKET260=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_methodCallOrSlice3209); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RBRACKET.add(RBRACKET260);



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
                    // 353:33: -> ^( SUFFIX_EXPR[\"Slice\",true] ( expr )? )
                    {
                        // Haxe.g:353:36: ^( SUFFIX_EXPR[\"Slice\",true] ( expr )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new HaxeTree(SUFFIX_EXPR, "Slice", true), root_1);

                        // Haxe.g:353:74: ( expr )?
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
    // Haxe.g:356:1: methodCallOrSliceList : ( methodCallOrSlice methodCallOrSliceList | methodCallOrSlice );
    public final HaxeParser.methodCallOrSliceList_return methodCallOrSliceList() throws RecognitionException {
        HaxeParser.methodCallOrSliceList_return retval = new HaxeParser.methodCallOrSliceList_return();
        retval.start = input.LT(1);
        int methodCallOrSliceList_StartIndex = input.index();
        Object root_0 = null;

        HaxeParser.methodCallOrSlice_return methodCallOrSlice261 = null;

        HaxeParser.methodCallOrSliceList_return methodCallOrSliceList262 = null;

        HaxeParser.methodCallOrSlice_return methodCallOrSlice263 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 56) ) { return retval; }
            // Haxe.g:357:5: ( methodCallOrSlice methodCallOrSliceList | methodCallOrSlice )
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
                    // Haxe.g:357:10: methodCallOrSlice methodCallOrSliceList
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_methodCallOrSlice_in_methodCallOrSliceList3242);
                    methodCallOrSlice261=methodCallOrSlice();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, methodCallOrSlice261.getTree());
                    pushFollow(FOLLOW_methodCallOrSliceList_in_methodCallOrSliceList3244);
                    methodCallOrSliceList262=methodCallOrSliceList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, methodCallOrSliceList262.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:358:10: methodCallOrSlice
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_methodCallOrSlice_in_methodCallOrSliceList3255);
                    methodCallOrSlice263=methodCallOrSlice();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, methodCallOrSlice263.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // Haxe.g:361:1: value : ( funcLit | arrayLit | objLit | elementarySymbol | LPAREN ( expr | statement ) RPAREN | dotIdent );
    public final HaxeParser.value_return value() throws RecognitionException {
        HaxeParser.value_return retval = new HaxeParser.value_return();
        retval.start = input.LT(1);
        int value_StartIndex = input.index();
        Object root_0 = null;

        Token LPAREN268=null;
        Token RPAREN271=null;
        HaxeParser.funcLit_return funcLit264 = null;

        HaxeParser.arrayLit_return arrayLit265 = null;

        HaxeParser.objLit_return objLit266 = null;

        HaxeParser.elementarySymbol_return elementarySymbol267 = null;

        HaxeParser.expr_return expr269 = null;

        HaxeParser.statement_return statement270 = null;

        HaxeParser.dotIdent_return dotIdent272 = null;


        Object LPAREN268_tree=null;
        Object RPAREN271_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 57) ) { return retval; }
            // Haxe.g:362:5: ( funcLit | arrayLit | objLit | elementarySymbol | LPAREN ( expr | statement ) RPAREN | dotIdent )
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
                    // Haxe.g:362:9: funcLit
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_funcLit_in_value3274);
                    funcLit264=funcLit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, funcLit264.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:363:9: arrayLit
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_arrayLit_in_value3285);
                    arrayLit265=arrayLit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arrayLit265.getTree());

                    }
                    break;
                case 3 :
                    // Haxe.g:364:9: objLit
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_objLit_in_value3295);
                    objLit266=objLit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, objLit266.getTree());

                    }
                    break;
                case 4 :
                    // Haxe.g:365:9: elementarySymbol
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_elementarySymbol_in_value3305);
                    elementarySymbol267=elementarySymbol();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, elementarySymbol267.getTree());

                    }
                    break;
                case 5 :
                    // Haxe.g:366:9: LPAREN ( expr | statement ) RPAREN
                    {
                    root_0 = (Object)adaptor.nil();

                    LPAREN268=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_value3315); if (state.failed) return retval;
                    // Haxe.g:366:17: ( expr | statement )
                    int alt61=2;
                    alt61 = dfa61.predict(input);
                    switch (alt61) {
                        case 1 :
                            // Haxe.g:366:18: expr
                            {
                            pushFollow(FOLLOW_expr_in_value3319);
                            expr269=expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr269.getTree());

                            }
                            break;
                        case 2 :
                            // Haxe.g:366:23: statement
                            {
                            pushFollow(FOLLOW_statement_in_value3321);
                            statement270=statement();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, statement270.getTree());

                            }
                            break;

                    }

                    RPAREN271=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_value3324); if (state.failed) return retval;

                    }
                    break;
                case 6 :
                    // Haxe.g:367:9: dotIdent
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_dotIdent_in_value3335);
                    dotIdent272=dotIdent();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dotIdent272.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // Haxe.g:370:1: newExpr : NEW type LPAREN exprListOpt RPAREN -> ^( NEW ( type )? ( exprListOpt )? ) ;
    public final HaxeParser.newExpr_return newExpr() throws RecognitionException {
        HaxeParser.newExpr_return retval = new HaxeParser.newExpr_return();
        retval.start = input.LT(1);
        int newExpr_StartIndex = input.index();
        Object root_0 = null;

        Token NEW273=null;
        Token LPAREN275=null;
        Token RPAREN277=null;
        HaxeParser.type_return type274 = null;

        HaxeParser.exprListOpt_return exprListOpt276 = null;


        Object NEW273_tree=null;
        Object LPAREN275_tree=null;
        Object RPAREN277_tree=null;
        RewriteRuleTokenStream stream_NEW=new RewriteRuleTokenStream(adaptor,"token NEW");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_exprListOpt=new RewriteRuleSubtreeStream(adaptor,"rule exprListOpt");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 58) ) { return retval; }
            // Haxe.g:371:5: ( NEW type LPAREN exprListOpt RPAREN -> ^( NEW ( type )? ( exprListOpt )? ) )
            // Haxe.g:371:9: NEW type LPAREN exprListOpt RPAREN
            {
            NEW273=(Token)match(input,NEW,FOLLOW_NEW_in_newExpr3365); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_NEW.add(NEW273);

            pushFollow(FOLLOW_type_in_newExpr3367);
            type274=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(type274.getTree());
            LPAREN275=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_newExpr3369); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN275);

            pushFollow(FOLLOW_exprListOpt_in_newExpr3371);
            exprListOpt276=exprListOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_exprListOpt.add(exprListOpt276.getTree());
            RPAREN277=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_newExpr3373); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN277);



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
            // 371:44: -> ^( NEW ( type )? ( exprListOpt )? )
            {
                // Haxe.g:371:47: ^( NEW ( type )? ( exprListOpt )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_NEW.nextNode(), root_1);

                // Haxe.g:371:53: ( type )?
                if ( stream_type.hasNext() ) {
                    adaptor.addChild(root_1, stream_type.nextTree());

                }
                stream_type.reset();
                // Haxe.g:371:59: ( exprListOpt )?
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
    // Haxe.g:374:1: cast : ( CAST LPAREN expr ( COMMA funcType )? RPAREN -> ^( CAST ( expr )? ( funcType )? ) | CAST LPAREN expr RPAREN -> ^( CAST ( expr )? ) );
    public final HaxeParser.cast_return cast() throws RecognitionException {
        HaxeParser.cast_return retval = new HaxeParser.cast_return();
        retval.start = input.LT(1);
        int cast_StartIndex = input.index();
        Object root_0 = null;

        Token CAST278=null;
        Token LPAREN279=null;
        Token COMMA281=null;
        Token RPAREN283=null;
        Token CAST284=null;
        Token LPAREN285=null;
        Token RPAREN287=null;
        HaxeParser.expr_return expr280 = null;

        HaxeParser.funcType_return funcType282 = null;

        HaxeParser.expr_return expr286 = null;


        Object CAST278_tree=null;
        Object LPAREN279_tree=null;
        Object COMMA281_tree=null;
        Object RPAREN283_tree=null;
        Object CAST284_tree=null;
        Object LPAREN285_tree=null;
        Object RPAREN287_tree=null;
        RewriteRuleTokenStream stream_CAST=new RewriteRuleTokenStream(adaptor,"token CAST");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_funcType=new RewriteRuleSubtreeStream(adaptor,"rule funcType");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 59) ) { return retval; }
            // Haxe.g:374:9: ( CAST LPAREN expr ( COMMA funcType )? RPAREN -> ^( CAST ( expr )? ( funcType )? ) | CAST LPAREN expr RPAREN -> ^( CAST ( expr )? ) )
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
                    // Haxe.g:374:13: CAST LPAREN expr ( COMMA funcType )? RPAREN
                    {
                    CAST278=(Token)match(input,CAST,FOLLOW_CAST_in_cast3403); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CAST.add(CAST278);

                    LPAREN279=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_cast3405); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN279);

                    pushFollow(FOLLOW_expr_in_cast3407);
                    expr280=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr280.getTree());
                    // Haxe.g:374:30: ( COMMA funcType )?
                    int alt63=2;
                    int LA63_0 = input.LA(1);

                    if ( (LA63_0==COMMA) ) {
                        alt63=1;
                    }
                    switch (alt63) {
                        case 1 :
                            // Haxe.g:374:31: COMMA funcType
                            {
                            COMMA281=(Token)match(input,COMMA,FOLLOW_COMMA_in_cast3410); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_COMMA.add(COMMA281);

                            pushFollow(FOLLOW_funcType_in_cast3412);
                            funcType282=funcType();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_funcType.add(funcType282.getTree());

                            }
                            break;

                    }

                    RPAREN283=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_cast3416); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN283);



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
                    // 374:57: -> ^( CAST ( expr )? ( funcType )? )
                    {
                        // Haxe.g:374:60: ^( CAST ( expr )? ( funcType )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_CAST.nextNode(), root_1);

                        // Haxe.g:374:67: ( expr )?
                        if ( stream_expr.hasNext() ) {
                            adaptor.addChild(root_1, stream_expr.nextTree());

                        }
                        stream_expr.reset();
                        // Haxe.g:374:73: ( funcType )?
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
                    // Haxe.g:375:13: CAST LPAREN expr RPAREN
                    {
                    CAST284=(Token)match(input,CAST,FOLLOW_CAST_in_cast3444); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CAST.add(CAST284);

                    LPAREN285=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_cast3446); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN285);

                    pushFollow(FOLLOW_expr_in_cast3448);
                    expr286=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr286.getTree());
                    RPAREN287=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_cast3450); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN287);



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
                    // 375:57: -> ^( CAST ( expr )? )
                    {
                        // Haxe.g:375:60: ^( CAST ( expr )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_CAST.nextNode(), root_1);

                        // Haxe.g:375:67: ( expr )?
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
    // Haxe.g:381:1: topLevelDecl : ( classDecl | interfaceDecl | enumDecl | typedefDecl );
    public final HaxeParser.topLevelDecl_return topLevelDecl() throws RecognitionException {
        HaxeParser.topLevelDecl_return retval = new HaxeParser.topLevelDecl_return();
        retval.start = input.LT(1);
        int topLevelDecl_StartIndex = input.index();
        Object root_0 = null;

        HaxeParser.classDecl_return classDecl288 = null;

        HaxeParser.interfaceDecl_return interfaceDecl289 = null;

        HaxeParser.enumDecl_return enumDecl290 = null;

        HaxeParser.typedefDecl_return typedefDecl291 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 60) ) { return retval; }
            // Haxe.g:382:5: ( classDecl | interfaceDecl | enumDecl | typedefDecl )
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
                    // Haxe.g:382:9: classDecl
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_classDecl_in_topLevelDecl3515);
                    classDecl288=classDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, classDecl288.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:383:9: interfaceDecl
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_interfaceDecl_in_topLevelDecl3525);
                    interfaceDecl289=interfaceDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceDecl289.getTree());

                    }
                    break;
                case 3 :
                    // Haxe.g:384:9: enumDecl
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_enumDecl_in_topLevelDecl3535);
                    enumDecl290=enumDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, enumDecl290.getTree());

                    }
                    break;
                case 4 :
                    // Haxe.g:385:9: typedefDecl
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_typedefDecl_in_topLevelDecl3545);
                    typedefDecl291=typedefDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typedefDecl291.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // Haxe.g:388:1: enumDecl : typeDeclFlags ENUM IDENTIFIER typeParamOpt LBRACE enumBody RBRACE -> ^( ENUM ( IDENTIFIER )? ( typeParamOpt )? ( enumBody )? ) ;
    public final HaxeParser.enumDecl_return enumDecl() throws RecognitionException {
        HaxeParser.enumDecl_return retval = new HaxeParser.enumDecl_return();
        retval.start = input.LT(1);
        int enumDecl_StartIndex = input.index();
        Object root_0 = null;

        Token ENUM293=null;
        Token IDENTIFIER294=null;
        Token LBRACE296=null;
        Token RBRACE298=null;
        HaxeParser.typeDeclFlags_return typeDeclFlags292 = null;

        HaxeParser.typeParamOpt_return typeParamOpt295 = null;

        HaxeParser.enumBody_return enumBody297 = null;


        Object ENUM293_tree=null;
        Object IDENTIFIER294_tree=null;
        Object LBRACE296_tree=null;
        Object RBRACE298_tree=null;
        RewriteRuleTokenStream stream_ENUM=new RewriteRuleTokenStream(adaptor,"token ENUM");
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_typeDeclFlags=new RewriteRuleSubtreeStream(adaptor,"rule typeDeclFlags");
        RewriteRuleSubtreeStream stream_enumBody=new RewriteRuleSubtreeStream(adaptor,"rule enumBody");
        RewriteRuleSubtreeStream stream_typeParamOpt=new RewriteRuleSubtreeStream(adaptor,"rule typeParamOpt");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 61) ) { return retval; }
            // Haxe.g:388:9: ( typeDeclFlags ENUM IDENTIFIER typeParamOpt LBRACE enumBody RBRACE -> ^( ENUM ( IDENTIFIER )? ( typeParamOpt )? ( enumBody )? ) )
            // Haxe.g:388:13: typeDeclFlags ENUM IDENTIFIER typeParamOpt LBRACE enumBody RBRACE
            {
            pushFollow(FOLLOW_typeDeclFlags_in_enumDecl3563);
            typeDeclFlags292=typeDeclFlags();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeDeclFlags.add(typeDeclFlags292.getTree());
            ENUM293=(Token)match(input,ENUM,FOLLOW_ENUM_in_enumDecl3565); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ENUM.add(ENUM293);

            IDENTIFIER294=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_enumDecl3567); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER294);

            pushFollow(FOLLOW_typeParamOpt_in_enumDecl3569);
            typeParamOpt295=typeParamOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeParamOpt.add(typeParamOpt295.getTree());
            LBRACE296=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_enumDecl3571); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACE.add(LBRACE296);

            pushFollow(FOLLOW_enumBody_in_enumDecl3573);
            enumBody297=enumBody();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_enumBody.add(enumBody297.getTree());
            RBRACE298=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_enumDecl3575); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACE.add(RBRACE298);



            // AST REWRITE
            // elements: enumBody, IDENTIFIER, ENUM, typeParamOpt
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 388:79: -> ^( ENUM ( IDENTIFIER )? ( typeParamOpt )? ( enumBody )? )
            {
                // Haxe.g:388:82: ^( ENUM ( IDENTIFIER )? ( typeParamOpt )? ( enumBody )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_ENUM.nextNode(), root_1);

                // Haxe.g:388:89: ( IDENTIFIER )?
                if ( stream_IDENTIFIER.hasNext() ) {
                    adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());

                }
                stream_IDENTIFIER.reset();
                // Haxe.g:388:101: ( typeParamOpt )?
                if ( stream_typeParamOpt.hasNext() ) {
                    adaptor.addChild(root_1, stream_typeParamOpt.nextTree());

                }
                stream_typeParamOpt.reset();
                // Haxe.g:388:115: ( enumBody )?
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
    // Haxe.g:391:1: enumBody : ( enumValueDecl )* ;
    public final HaxeParser.enumBody_return enumBody() throws RecognitionException {
        HaxeParser.enumBody_return retval = new HaxeParser.enumBody_return();
        retval.start = input.LT(1);
        int enumBody_StartIndex = input.index();
        Object root_0 = null;

        HaxeParser.enumValueDecl_return enumValueDecl299 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 62) ) { return retval; }
            // Haxe.g:391:9: ( ( enumValueDecl )* )
            // Haxe.g:391:13: ( enumValueDecl )*
            {
            root_0 = (Object)adaptor.nil();

            // Haxe.g:391:13: ( enumValueDecl )*
            loop66:
            do {
                int alt66=2;
                int LA66_0 = input.LA(1);

                if ( (LA66_0==IDENTIFIER) ) {
                    alt66=1;
                }


                switch (alt66) {
            	case 1 :
            	    // Haxe.g:391:14: enumValueDecl
            	    {
            	    pushFollow(FOLLOW_enumValueDecl_in_enumBody3609);
            	    enumValueDecl299=enumValueDecl();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, enumValueDecl299.getTree());

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
    // Haxe.g:394:1: enumValueDecl : ( IDENTIFIER LPAREN paramList RPAREN SEMI -> ^( IDENTIFIER[$IDENTIFIER] ( IDENTIFIER )? ( paramList )? ) | IDENTIFIER SEMI -> ^( IDENTIFIER[$IDENTIFIER] ( IDENTIFIER )? ) );
    public final HaxeParser.enumValueDecl_return enumValueDecl() throws RecognitionException {
        HaxeParser.enumValueDecl_return retval = new HaxeParser.enumValueDecl_return();
        retval.start = input.LT(1);
        int enumValueDecl_StartIndex = input.index();
        Object root_0 = null;

        Token IDENTIFIER300=null;
        Token LPAREN301=null;
        Token RPAREN303=null;
        Token SEMI304=null;
        Token IDENTIFIER305=null;
        Token SEMI306=null;
        HaxeParser.paramList_return paramList302 = null;


        Object IDENTIFIER300_tree=null;
        Object LPAREN301_tree=null;
        Object RPAREN303_tree=null;
        Object SEMI304_tree=null;
        Object IDENTIFIER305_tree=null;
        Object SEMI306_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_paramList=new RewriteRuleSubtreeStream(adaptor,"rule paramList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 63) ) { return retval; }
            // Haxe.g:395:5: ( IDENTIFIER LPAREN paramList RPAREN SEMI -> ^( IDENTIFIER[$IDENTIFIER] ( IDENTIFIER )? ( paramList )? ) | IDENTIFIER SEMI -> ^( IDENTIFIER[$IDENTIFIER] ( IDENTIFIER )? ) )
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
                    // Haxe.g:395:9: IDENTIFIER LPAREN paramList RPAREN SEMI
                    {
                    IDENTIFIER300=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_enumValueDecl3639); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER300);

                    LPAREN301=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_enumValueDecl3641); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN301);

                    pushFollow(FOLLOW_paramList_in_enumValueDecl3643);
                    paramList302=paramList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_paramList.add(paramList302.getTree());
                    RPAREN303=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_enumValueDecl3645); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN303);

                    SEMI304=(Token)match(input,SEMI,FOLLOW_SEMI_in_enumValueDecl3647); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI304);



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
                    // 395:49: -> ^( IDENTIFIER[$IDENTIFIER] ( IDENTIFIER )? ( paramList )? )
                    {
                        // Haxe.g:395:52: ^( IDENTIFIER[$IDENTIFIER] ( IDENTIFIER )? ( paramList )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new VarDeclaration(IDENTIFIER, IDENTIFIER300), root_1);

                        // Haxe.g:395:94: ( IDENTIFIER )?
                        if ( stream_IDENTIFIER.hasNext() ) {
                            adaptor.addChild(root_1, new VarUsage(stream_IDENTIFIER.nextToken()));

                        }
                        stream_IDENTIFIER.reset();
                        // Haxe.g:395:116: ( paramList )?
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
                    // Haxe.g:396:9: IDENTIFIER SEMI
                    {
                    IDENTIFIER305=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_enumValueDecl3681); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER305);

                    SEMI306=(Token)match(input,SEMI,FOLLOW_SEMI_in_enumValueDecl3683); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI306);



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
                    // 396:49: -> ^( IDENTIFIER[$IDENTIFIER] ( IDENTIFIER )? )
                    {
                        // Haxe.g:396:52: ^( IDENTIFIER[$IDENTIFIER] ( IDENTIFIER )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new VarDeclaration(IDENTIFIER, IDENTIFIER305), root_1);

                        // Haxe.g:396:94: ( IDENTIFIER )?
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
    // Haxe.g:400:1: varDeclList : varDecl varDeclList ;
    public final HaxeParser.varDeclList_return varDeclList() throws RecognitionException {
        HaxeParser.varDeclList_return retval = new HaxeParser.varDeclList_return();
        retval.start = input.LT(1);
        int varDeclList_StartIndex = input.index();
        Object root_0 = null;

        HaxeParser.varDecl_return varDecl307 = null;

        HaxeParser.varDeclList_return varDeclList308 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 64) ) { return retval; }
            // Haxe.g:401:5: ( varDecl varDeclList )
            // Haxe.g:401:9: varDecl varDeclList
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_varDecl_in_varDeclList3743);
            varDecl307=varDecl();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, varDecl307.getTree());
            pushFollow(FOLLOW_varDeclList_in_varDeclList3745);
            varDeclList308=varDeclList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclList308.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // Haxe.g:404:1: varDecl : ( declAttrList )? VAR varDeclPartList SEMI -> ^( VAR[$VAR] ( declAttrList )? ( varDeclPartList )? ) ;
    public final HaxeParser.varDecl_return varDecl() throws RecognitionException {
        HaxeParser.varDecl_return retval = new HaxeParser.varDecl_return();
        retval.start = input.LT(1);
        int varDecl_StartIndex = input.index();
        Object root_0 = null;

        Token VAR310=null;
        Token SEMI312=null;
        HaxeParser.declAttrList_return declAttrList309 = null;

        HaxeParser.varDeclPartList_return varDeclPartList311 = null;


        Object VAR310_tree=null;
        Object SEMI312_tree=null;
        RewriteRuleTokenStream stream_VAR=new RewriteRuleTokenStream(adaptor,"token VAR");
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleSubtreeStream stream_declAttrList=new RewriteRuleSubtreeStream(adaptor,"rule declAttrList");
        RewriteRuleSubtreeStream stream_varDeclPartList=new RewriteRuleSubtreeStream(adaptor,"rule varDeclPartList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 65) ) { return retval; }
            // Haxe.g:404:9: ( ( declAttrList )? VAR varDeclPartList SEMI -> ^( VAR[$VAR] ( declAttrList )? ( varDeclPartList )? ) )
            // Haxe.g:404:13: ( declAttrList )? VAR varDeclPartList SEMI
            {
            // Haxe.g:404:13: ( declAttrList )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==PRIVATE||(LA68_0>=PUBLIC && LA68_0<=OVERRIDE)) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // Haxe.g:404:14: declAttrList
                    {
                    pushFollow(FOLLOW_declAttrList_in_varDecl3761);
                    declAttrList309=declAttrList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declAttrList.add(declAttrList309.getTree());

                    }
                    break;

            }

            VAR310=(Token)match(input,VAR,FOLLOW_VAR_in_varDecl3765); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_VAR.add(VAR310);

            pushFollow(FOLLOW_varDeclPartList_in_varDecl3767);
            varDeclPartList311=varDeclPartList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_varDeclPartList.add(varDeclPartList311.getTree());
            SEMI312=(Token)match(input,SEMI,FOLLOW_SEMI_in_varDecl3769); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SEMI.add(SEMI312);



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
            // 404:54: -> ^( VAR[$VAR] ( declAttrList )? ( varDeclPartList )? )
            {
                // Haxe.g:404:57: ^( VAR[$VAR] ( declAttrList )? ( varDeclPartList )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new VarDeclaration(VAR, VAR310), root_1);

                // Haxe.g:404:85: ( declAttrList )?
                if ( stream_declAttrList.hasNext() ) {
                    adaptor.addChild(root_1, stream_declAttrList.nextTree());

                }
                stream_declAttrList.reset();
                // Haxe.g:404:99: ( varDeclPartList )?
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
    // Haxe.g:407:1: varDeclPartList : varDeclPart ( COMMA varDeclPart )* ;
    public final HaxeParser.varDeclPartList_return varDeclPartList() throws RecognitionException {
        HaxeParser.varDeclPartList_return retval = new HaxeParser.varDeclPartList_return();
        retval.start = input.LT(1);
        int varDeclPartList_StartIndex = input.index();
        Object root_0 = null;

        Token COMMA314=null;
        HaxeParser.varDeclPart_return varDeclPart313 = null;

        HaxeParser.varDeclPart_return varDeclPart315 = null;


        Object COMMA314_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 66) ) { return retval; }
            // Haxe.g:408:5: ( varDeclPart ( COMMA varDeclPart )* )
            // Haxe.g:408:9: varDeclPart ( COMMA varDeclPart )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_varDeclPart_in_varDeclPartList3815);
            varDeclPart313=varDeclPart();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclPart313.getTree());
            // Haxe.g:408:21: ( COMMA varDeclPart )*
            loop69:
            do {
                int alt69=2;
                int LA69_0 = input.LA(1);

                if ( (LA69_0==COMMA) ) {
                    alt69=1;
                }


                switch (alt69) {
            	case 1 :
            	    // Haxe.g:408:22: COMMA varDeclPart
            	    {
            	    COMMA314=(Token)match(input,COMMA,FOLLOW_COMMA_in_varDeclPartList3818); if (state.failed) return retval;
            	    pushFollow(FOLLOW_varDeclPart_in_varDeclPartList3821);
            	    varDeclPart315=varDeclPart();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclPart315.getTree());

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
    // Haxe.g:411:1: varDeclPart : IDENTIFIER propDeclOpt typeTagOpt varInit ;
    public final HaxeParser.varDeclPart_return varDeclPart() throws RecognitionException {
        HaxeParser.varDeclPart_return retval = new HaxeParser.varDeclPart_return();
        retval.start = input.LT(1);
        int varDeclPart_StartIndex = input.index();
        Object root_0 = null;

        Token IDENTIFIER316=null;
        HaxeParser.propDeclOpt_return propDeclOpt317 = null;

        HaxeParser.typeTagOpt_return typeTagOpt318 = null;

        HaxeParser.varInit_return varInit319 = null;


        Object IDENTIFIER316_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 67) ) { return retval; }
            // Haxe.g:412:5: ( IDENTIFIER propDeclOpt typeTagOpt varInit )
            // Haxe.g:412:9: IDENTIFIER propDeclOpt typeTagOpt varInit
            {
            root_0 = (Object)adaptor.nil();

            IDENTIFIER316=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_varDeclPart3842); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER316_tree = new VarUsage(IDENTIFIER316) ;
            adaptor.addChild(root_0, IDENTIFIER316_tree);
            }
            pushFollow(FOLLOW_propDeclOpt_in_varDeclPart3847);
            propDeclOpt317=propDeclOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, propDeclOpt317.getTree());
            pushFollow(FOLLOW_typeTagOpt_in_varDeclPart3849);
            typeTagOpt318=typeTagOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, typeTagOpt318.getTree());
            pushFollow(FOLLOW_varInit_in_varDeclPart3851);
            varInit319=varInit();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, varInit319.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // Haxe.g:415:1: propDecl : LPAREN a1= propAccessor COMMA a2= propAccessor RPAREN -> ^( PROPERTY_DECL[\"PROPERTY_DECL\",true] ( $a1)? ( $a2)? ) ;
    public final HaxeParser.propDecl_return propDecl() throws RecognitionException {
        HaxeParser.propDecl_return retval = new HaxeParser.propDecl_return();
        retval.start = input.LT(1);
        int propDecl_StartIndex = input.index();
        Object root_0 = null;

        Token LPAREN320=null;
        Token COMMA321=null;
        Token RPAREN322=null;
        HaxeParser.propAccessor_return a1 = null;

        HaxeParser.propAccessor_return a2 = null;


        Object LPAREN320_tree=null;
        Object COMMA321_tree=null;
        Object RPAREN322_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_propAccessor=new RewriteRuleSubtreeStream(adaptor,"rule propAccessor");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 68) ) { return retval; }
            // Haxe.g:415:9: ( LPAREN a1= propAccessor COMMA a2= propAccessor RPAREN -> ^( PROPERTY_DECL[\"PROPERTY_DECL\",true] ( $a1)? ( $a2)? ) )
            // Haxe.g:415:13: LPAREN a1= propAccessor COMMA a2= propAccessor RPAREN
            {
            LPAREN320=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_propDecl3865); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN320);

            pushFollow(FOLLOW_propAccessor_in_propDecl3869);
            a1=propAccessor();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_propAccessor.add(a1.getTree());
            COMMA321=(Token)match(input,COMMA,FOLLOW_COMMA_in_propDecl3871); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COMMA.add(COMMA321);

            pushFollow(FOLLOW_propAccessor_in_propDecl3875);
            a2=propAccessor();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_propAccessor.add(a2.getTree());
            RPAREN322=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_propDecl3877); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN322);



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
            // 415:65: -> ^( PROPERTY_DECL[\"PROPERTY_DECL\",true] ( $a1)? ( $a2)? )
            {
                // Haxe.g:415:68: ^( PROPERTY_DECL[\"PROPERTY_DECL\",true] ( $a1)? ( $a2)? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new HaxeTree(PROPERTY_DECL, "PROPERTY_DECL", true), root_1);

                // Haxe.g:415:116: ( $a1)?
                if ( stream_a1.hasNext() ) {
                    adaptor.addChild(root_1, stream_a1.nextTree());

                }
                stream_a1.reset();
                // Haxe.g:415:121: ( $a2)?
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
    // Haxe.g:418:1: propAccessor : ( IDENTIFIER | NULL | DEFAULT | DYNAMIC );
    public final HaxeParser.propAccessor_return propAccessor() throws RecognitionException {
        HaxeParser.propAccessor_return retval = new HaxeParser.propAccessor_return();
        retval.start = input.LT(1);
        int propAccessor_StartIndex = input.index();
        Object root_0 = null;

        Token set323=null;

        Object set323_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 69) ) { return retval; }
            // Haxe.g:419:9: ( IDENTIFIER | NULL | DEFAULT | DYNAMIC )
            // Haxe.g:
            {
            root_0 = (Object)adaptor.nil();

            set323=(Token)input.LT(1);
            if ( input.LA(1)==IDENTIFIER||input.LA(1)==DYNAMIC||input.LA(1)==DEFAULT||input.LA(1)==NULL ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set323));
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
    // Haxe.g:425:1: propDeclOpt : ( propDecl | );
    public final HaxeParser.propDeclOpt_return propDeclOpt() throws RecognitionException {
        HaxeParser.propDeclOpt_return retval = new HaxeParser.propDeclOpt_return();
        retval.start = input.LT(1);
        int propDeclOpt_StartIndex = input.index();
        Object root_0 = null;

        HaxeParser.propDecl_return propDecl324 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 70) ) { return retval; }
            // Haxe.g:426:5: ( propDecl | )
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
                    // Haxe.g:426:9: propDecl
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_propDecl_in_propDeclOpt3997);
                    propDecl324=propDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, propDecl324.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:428:5: 
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
    // Haxe.g:430:1: varInit : ( EQ expr -> ^( VAR_INIT[\"VAR_INIT\",true] ( expr )? ) | );
    public final HaxeParser.varInit_return varInit() throws RecognitionException {
        HaxeParser.varInit_return retval = new HaxeParser.varInit_return();
        retval.start = input.LT(1);
        int varInit_StartIndex = input.index();
        Object root_0 = null;

        Token EQ325=null;
        HaxeParser.expr_return expr326 = null;


        Object EQ325_tree=null;
        RewriteRuleTokenStream stream_EQ=new RewriteRuleTokenStream(adaptor,"token EQ");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 71) ) { return retval; }
            // Haxe.g:430:9: ( EQ expr -> ^( VAR_INIT[\"VAR_INIT\",true] ( expr )? ) | )
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
                    // Haxe.g:430:13: EQ expr
                    {
                    EQ325=(Token)match(input,EQ,FOLLOW_EQ_in_varInit4022); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EQ.add(EQ325);

                    pushFollow(FOLLOW_expr_in_varInit4024);
                    expr326=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr326.getTree());


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
                    // 430:21: -> ^( VAR_INIT[\"VAR_INIT\",true] ( expr )? )
                    {
                        // Haxe.g:430:24: ^( VAR_INIT[\"VAR_INIT\",true] ( expr )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new HaxeTree(VAR_INIT, "VAR_INIT", true), root_1);

                        // Haxe.g:430:62: ( expr )?
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
                    // Haxe.g:432:9: 
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
    // Haxe.g:434:1: funcDecl : ( ( declAttrList )? FUNCTION NEW LPAREN paramList RPAREN typeTagOpt block -> ^( FUNCTION NEW ( declAttrList )? ( paramList )? ( typeTagOpt )? ( block )? ) | ( declAttrList )? FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt block -> ^( FUNCTION IDENTIFIER ( declAttrList )? ( paramList )? ( typeTagOpt )? ( block )? ( typeParamOpt )? ) );
    public final HaxeParser.funcDecl_return funcDecl() throws RecognitionException {
        HaxeParser.funcDecl_return retval = new HaxeParser.funcDecl_return();
        retval.start = input.LT(1);
        int funcDecl_StartIndex = input.index();
        Object root_0 = null;

        Token FUNCTION328=null;
        Token NEW329=null;
        Token LPAREN330=null;
        Token RPAREN332=null;
        Token FUNCTION336=null;
        Token IDENTIFIER337=null;
        Token LPAREN339=null;
        Token RPAREN341=null;
        HaxeParser.declAttrList_return declAttrList327 = null;

        HaxeParser.paramList_return paramList331 = null;

        HaxeParser.typeTagOpt_return typeTagOpt333 = null;

        HaxeParser.block_return block334 = null;

        HaxeParser.declAttrList_return declAttrList335 = null;

        HaxeParser.typeParamOpt_return typeParamOpt338 = null;

        HaxeParser.paramList_return paramList340 = null;

        HaxeParser.typeTagOpt_return typeTagOpt342 = null;

        HaxeParser.block_return block343 = null;


        Object FUNCTION328_tree=null;
        Object NEW329_tree=null;
        Object LPAREN330_tree=null;
        Object RPAREN332_tree=null;
        Object FUNCTION336_tree=null;
        Object IDENTIFIER337_tree=null;
        Object LPAREN339_tree=null;
        Object RPAREN341_tree=null;
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
            // Haxe.g:434:9: ( ( declAttrList )? FUNCTION NEW LPAREN paramList RPAREN typeTagOpt block -> ^( FUNCTION NEW ( declAttrList )? ( paramList )? ( typeTagOpt )? ( block )? ) | ( declAttrList )? FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt block -> ^( FUNCTION IDENTIFIER ( declAttrList )? ( paramList )? ( typeTagOpt )? ( block )? ( typeParamOpt )? ) )
            int alt74=2;
            alt74 = dfa74.predict(input);
            switch (alt74) {
                case 1 :
                    // Haxe.g:434:13: ( declAttrList )? FUNCTION NEW LPAREN paramList RPAREN typeTagOpt block
                    {
                    // Haxe.g:434:13: ( declAttrList )?
                    int alt72=2;
                    int LA72_0 = input.LA(1);

                    if ( (LA72_0==PRIVATE||(LA72_0>=PUBLIC && LA72_0<=OVERRIDE)) ) {
                        alt72=1;
                    }
                    switch (alt72) {
                        case 1 :
                            // Haxe.g:0:0: declAttrList
                            {
                            pushFollow(FOLLOW_declAttrList_in_funcDecl4072);
                            declAttrList327=declAttrList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_declAttrList.add(declAttrList327.getTree());

                            }
                            break;

                    }

                    FUNCTION328=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcDecl4075); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION328);

                    NEW329=(Token)match(input,NEW,FOLLOW_NEW_in_funcDecl4077); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEW.add(NEW329);

                    LPAREN330=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcDecl4079); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN330);

                    pushFollow(FOLLOW_paramList_in_funcDecl4081);
                    paramList331=paramList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_paramList.add(paramList331.getTree());
                    RPAREN332=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcDecl4083); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN332);

                    pushFollow(FOLLOW_typeTagOpt_in_funcDecl4085);
                    typeTagOpt333=typeTagOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeTagOpt.add(typeTagOpt333.getTree());
                    pushFollow(FOLLOW_block_in_funcDecl4087);
                    block334=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block334.getTree());


                    // AST REWRITE
                    // elements: declAttrList, typeTagOpt, block, paramList, NEW, FUNCTION
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 435:17: -> ^( FUNCTION NEW ( declAttrList )? ( paramList )? ( typeTagOpt )? ( block )? )
                    {
                        // Haxe.g:435:20: ^( FUNCTION NEW ( declAttrList )? ( paramList )? ( typeTagOpt )? ( block )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new FunctionNode(stream_FUNCTION.nextToken()), root_1);

                        adaptor.addChild(root_1, stream_NEW.nextNode());
                        // Haxe.g:435:49: ( declAttrList )?
                        if ( stream_declAttrList.hasNext() ) {
                            adaptor.addChild(root_1, stream_declAttrList.nextTree());

                        }
                        stream_declAttrList.reset();
                        // Haxe.g:435:63: ( paramList )?
                        if ( stream_paramList.hasNext() ) {
                            adaptor.addChild(root_1, stream_paramList.nextTree());

                        }
                        stream_paramList.reset();
                        // Haxe.g:435:74: ( typeTagOpt )?
                        if ( stream_typeTagOpt.hasNext() ) {
                            adaptor.addChild(root_1, stream_typeTagOpt.nextTree());

                        }
                        stream_typeTagOpt.reset();
                        // Haxe.g:435:86: ( block )?
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
                    // Haxe.g:436:13: ( declAttrList )? FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt block
                    {
                    // Haxe.g:436:13: ( declAttrList )?
                    int alt73=2;
                    int LA73_0 = input.LA(1);

                    if ( (LA73_0==PRIVATE||(LA73_0>=PUBLIC && LA73_0<=OVERRIDE)) ) {
                        alt73=1;
                    }
                    switch (alt73) {
                        case 1 :
                            // Haxe.g:0:0: declAttrList
                            {
                            pushFollow(FOLLOW_declAttrList_in_funcDecl4142);
                            declAttrList335=declAttrList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_declAttrList.add(declAttrList335.getTree());

                            }
                            break;

                    }

                    FUNCTION336=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcDecl4145); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION336);

                    IDENTIFIER337=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_funcDecl4147); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER337);

                    pushFollow(FOLLOW_typeParamOpt_in_funcDecl4149);
                    typeParamOpt338=typeParamOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeParamOpt.add(typeParamOpt338.getTree());
                    LPAREN339=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcDecl4151); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN339);

                    pushFollow(FOLLOW_paramList_in_funcDecl4153);
                    paramList340=paramList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_paramList.add(paramList340.getTree());
                    RPAREN341=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcDecl4155); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN341);

                    pushFollow(FOLLOW_typeTagOpt_in_funcDecl4157);
                    typeTagOpt342=typeTagOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeTagOpt.add(typeTagOpt342.getTree());
                    pushFollow(FOLLOW_block_in_funcDecl4159);
                    block343=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block343.getTree());


                    // AST REWRITE
                    // elements: FUNCTION, typeTagOpt, declAttrList, typeParamOpt, block, IDENTIFIER, paramList
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 437:17: -> ^( FUNCTION IDENTIFIER ( declAttrList )? ( paramList )? ( typeTagOpt )? ( block )? ( typeParamOpt )? )
                    {
                        // Haxe.g:437:20: ^( FUNCTION IDENTIFIER ( declAttrList )? ( paramList )? ( typeTagOpt )? ( block )? ( typeParamOpt )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new FunctionNode(stream_FUNCTION.nextToken()), root_1);

                        adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
                        // Haxe.g:437:56: ( declAttrList )?
                        if ( stream_declAttrList.hasNext() ) {
                            adaptor.addChild(root_1, stream_declAttrList.nextTree());

                        }
                        stream_declAttrList.reset();
                        // Haxe.g:437:70: ( paramList )?
                        if ( stream_paramList.hasNext() ) {
                            adaptor.addChild(root_1, stream_paramList.nextTree());

                        }
                        stream_paramList.reset();
                        // Haxe.g:437:81: ( typeTagOpt )?
                        if ( stream_typeTagOpt.hasNext() ) {
                            adaptor.addChild(root_1, stream_typeTagOpt.nextTree());

                        }
                        stream_typeTagOpt.reset();
                        // Haxe.g:437:93: ( block )?
                        if ( stream_block.hasNext() ) {
                            adaptor.addChild(root_1, stream_block.nextTree());

                        }
                        stream_block.reset();
                        // Haxe.g:437:100: ( typeParamOpt )?
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
    // Haxe.g:440:1: funcProtoDecl : ( declAttrList FUNCTION NEW LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTagOpt )? ( declAttrList )? ) | declAttrList FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTagOpt )? ( declAttrList )? ( typeParamOpt )? ) | FUNCTION NEW LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTagOpt )? ) | FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTagOpt )? ( typeParamOpt )? ) );
    public final HaxeParser.funcProtoDecl_return funcProtoDecl() throws RecognitionException {
        HaxeParser.funcProtoDecl_return retval = new HaxeParser.funcProtoDecl_return();
        retval.start = input.LT(1);
        int funcProtoDecl_StartIndex = input.index();
        Object root_0 = null;

        Token FUNCTION345=null;
        Token NEW346=null;
        Token LPAREN347=null;
        Token RPAREN349=null;
        Token SEMI351=null;
        Token FUNCTION353=null;
        Token IDENTIFIER354=null;
        Token LPAREN356=null;
        Token RPAREN358=null;
        Token SEMI360=null;
        Token FUNCTION361=null;
        Token NEW362=null;
        Token LPAREN363=null;
        Token RPAREN365=null;
        Token SEMI367=null;
        Token FUNCTION368=null;
        Token IDENTIFIER369=null;
        Token LPAREN371=null;
        Token RPAREN373=null;
        Token SEMI375=null;
        HaxeParser.declAttrList_return declAttrList344 = null;

        HaxeParser.paramList_return paramList348 = null;

        HaxeParser.typeTagOpt_return typeTagOpt350 = null;

        HaxeParser.declAttrList_return declAttrList352 = null;

        HaxeParser.typeParamOpt_return typeParamOpt355 = null;

        HaxeParser.paramList_return paramList357 = null;

        HaxeParser.typeTagOpt_return typeTagOpt359 = null;

        HaxeParser.paramList_return paramList364 = null;

        HaxeParser.typeTagOpt_return typeTagOpt366 = null;

        HaxeParser.typeParamOpt_return typeParamOpt370 = null;

        HaxeParser.paramList_return paramList372 = null;

        HaxeParser.typeTagOpt_return typeTagOpt374 = null;


        Object FUNCTION345_tree=null;
        Object NEW346_tree=null;
        Object LPAREN347_tree=null;
        Object RPAREN349_tree=null;
        Object SEMI351_tree=null;
        Object FUNCTION353_tree=null;
        Object IDENTIFIER354_tree=null;
        Object LPAREN356_tree=null;
        Object RPAREN358_tree=null;
        Object SEMI360_tree=null;
        Object FUNCTION361_tree=null;
        Object NEW362_tree=null;
        Object LPAREN363_tree=null;
        Object RPAREN365_tree=null;
        Object SEMI367_tree=null;
        Object FUNCTION368_tree=null;
        Object IDENTIFIER369_tree=null;
        Object LPAREN371_tree=null;
        Object RPAREN373_tree=null;
        Object SEMI375_tree=null;
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
            // Haxe.g:441:5: ( declAttrList FUNCTION NEW LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTagOpt )? ( declAttrList )? ) | declAttrList FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTagOpt )? ( declAttrList )? ( typeParamOpt )? ) | FUNCTION NEW LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTagOpt )? ) | FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTagOpt )? ( typeParamOpt )? ) )
            int alt75=4;
            alt75 = dfa75.predict(input);
            switch (alt75) {
                case 1 :
                    // Haxe.g:441:9: declAttrList FUNCTION NEW LPAREN paramList RPAREN typeTagOpt SEMI
                    {
                    pushFollow(FOLLOW_declAttrList_in_funcProtoDecl4229);
                    declAttrList344=declAttrList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declAttrList.add(declAttrList344.getTree());
                    FUNCTION345=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcProtoDecl4231); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION345);

                    NEW346=(Token)match(input,NEW,FOLLOW_NEW_in_funcProtoDecl4233); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEW.add(NEW346);

                    LPAREN347=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcProtoDecl4235); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN347);

                    pushFollow(FOLLOW_paramList_in_funcProtoDecl4237);
                    paramList348=paramList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_paramList.add(paramList348.getTree());
                    RPAREN349=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcProtoDecl4239); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN349);

                    pushFollow(FOLLOW_typeTagOpt_in_funcProtoDecl4241);
                    typeTagOpt350=typeTagOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeTagOpt.add(typeTagOpt350.getTree());
                    SEMI351=(Token)match(input,SEMI,FOLLOW_SEMI_in_funcProtoDecl4243); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI351);



                    // AST REWRITE
                    // elements: NEW, declAttrList, FUNCTION, typeTagOpt, paramList
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 442:13: -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTagOpt )? ( declAttrList )? )
                    {
                        // Haxe.g:442:16: ^( FUNCTION ( NEW )? ( paramList )? ( typeTagOpt )? ( declAttrList )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_FUNCTION.nextNode(), root_1);

                        // Haxe.g:442:27: ( NEW )?
                        if ( stream_NEW.hasNext() ) {
                            adaptor.addChild(root_1, stream_NEW.nextNode());

                        }
                        stream_NEW.reset();
                        // Haxe.g:442:32: ( paramList )?
                        if ( stream_paramList.hasNext() ) {
                            adaptor.addChild(root_1, stream_paramList.nextTree());

                        }
                        stream_paramList.reset();
                        // Haxe.g:442:43: ( typeTagOpt )?
                        if ( stream_typeTagOpt.hasNext() ) {
                            adaptor.addChild(root_1, stream_typeTagOpt.nextTree());

                        }
                        stream_typeTagOpt.reset();
                        // Haxe.g:442:55: ( declAttrList )?
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
                    // Haxe.g:443:9: declAttrList FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt SEMI
                    {
                    pushFollow(FOLLOW_declAttrList_in_funcProtoDecl4284);
                    declAttrList352=declAttrList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declAttrList.add(declAttrList352.getTree());
                    FUNCTION353=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcProtoDecl4286); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION353);

                    IDENTIFIER354=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_funcProtoDecl4288); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER354);

                    pushFollow(FOLLOW_typeParamOpt_in_funcProtoDecl4290);
                    typeParamOpt355=typeParamOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeParamOpt.add(typeParamOpt355.getTree());
                    LPAREN356=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcProtoDecl4292); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN356);

                    pushFollow(FOLLOW_paramList_in_funcProtoDecl4294);
                    paramList357=paramList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_paramList.add(paramList357.getTree());
                    RPAREN358=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcProtoDecl4296); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN358);

                    pushFollow(FOLLOW_typeTagOpt_in_funcProtoDecl4298);
                    typeTagOpt359=typeTagOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeTagOpt.add(typeTagOpt359.getTree());
                    SEMI360=(Token)match(input,SEMI,FOLLOW_SEMI_in_funcProtoDecl4300); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI360);



                    // AST REWRITE
                    // elements: IDENTIFIER, typeTagOpt, FUNCTION, typeParamOpt, declAttrList, paramList
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 444:13: -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTagOpt )? ( declAttrList )? ( typeParamOpt )? )
                    {
                        // Haxe.g:444:16: ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTagOpt )? ( declAttrList )? ( typeParamOpt )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_FUNCTION.nextNode(), root_1);

                        // Haxe.g:444:27: ( IDENTIFIER )?
                        if ( stream_IDENTIFIER.hasNext() ) {
                            adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());

                        }
                        stream_IDENTIFIER.reset();
                        // Haxe.g:444:39: ( paramList )?
                        if ( stream_paramList.hasNext() ) {
                            adaptor.addChild(root_1, stream_paramList.nextTree());

                        }
                        stream_paramList.reset();
                        // Haxe.g:444:50: ( typeTagOpt )?
                        if ( stream_typeTagOpt.hasNext() ) {
                            adaptor.addChild(root_1, stream_typeTagOpt.nextTree());

                        }
                        stream_typeTagOpt.reset();
                        // Haxe.g:444:62: ( declAttrList )?
                        if ( stream_declAttrList.hasNext() ) {
                            adaptor.addChild(root_1, stream_declAttrList.nextTree());

                        }
                        stream_declAttrList.reset();
                        // Haxe.g:444:76: ( typeParamOpt )?
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
                    // Haxe.g:445:9: FUNCTION NEW LPAREN paramList RPAREN typeTagOpt SEMI
                    {
                    FUNCTION361=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcProtoDecl4344); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION361);

                    NEW362=(Token)match(input,NEW,FOLLOW_NEW_in_funcProtoDecl4346); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEW.add(NEW362);

                    LPAREN363=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcProtoDecl4348); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN363);

                    pushFollow(FOLLOW_paramList_in_funcProtoDecl4350);
                    paramList364=paramList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_paramList.add(paramList364.getTree());
                    RPAREN365=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcProtoDecl4352); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN365);

                    pushFollow(FOLLOW_typeTagOpt_in_funcProtoDecl4354);
                    typeTagOpt366=typeTagOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeTagOpt.add(typeTagOpt366.getTree());
                    SEMI367=(Token)match(input,SEMI,FOLLOW_SEMI_in_funcProtoDecl4356); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI367);



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
                    // 446:13: -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTagOpt )? )
                    {
                        // Haxe.g:446:16: ^( FUNCTION ( NEW )? ( paramList )? ( typeTagOpt )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_FUNCTION.nextNode(), root_1);

                        // Haxe.g:446:27: ( NEW )?
                        if ( stream_NEW.hasNext() ) {
                            adaptor.addChild(root_1, stream_NEW.nextNode());

                        }
                        stream_NEW.reset();
                        // Haxe.g:446:32: ( paramList )?
                        if ( stream_paramList.hasNext() ) {
                            adaptor.addChild(root_1, stream_paramList.nextTree());

                        }
                        stream_paramList.reset();
                        // Haxe.g:446:43: ( typeTagOpt )?
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
                    // Haxe.g:447:9: FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt SEMI
                    {
                    FUNCTION368=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcProtoDecl4394); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION368);

                    IDENTIFIER369=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_funcProtoDecl4396); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER369);

                    pushFollow(FOLLOW_typeParamOpt_in_funcProtoDecl4398);
                    typeParamOpt370=typeParamOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeParamOpt.add(typeParamOpt370.getTree());
                    LPAREN371=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcProtoDecl4400); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN371);

                    pushFollow(FOLLOW_paramList_in_funcProtoDecl4402);
                    paramList372=paramList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_paramList.add(paramList372.getTree());
                    RPAREN373=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcProtoDecl4404); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN373);

                    pushFollow(FOLLOW_typeTagOpt_in_funcProtoDecl4406);
                    typeTagOpt374=typeTagOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeTagOpt.add(typeTagOpt374.getTree());
                    SEMI375=(Token)match(input,SEMI,FOLLOW_SEMI_in_funcProtoDecl4408); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI375);



                    // AST REWRITE
                    // elements: paramList, IDENTIFIER, typeTagOpt, typeParamOpt, FUNCTION
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 448:13: -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTagOpt )? ( typeParamOpt )? )
                    {
                        // Haxe.g:448:16: ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTagOpt )? ( typeParamOpt )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_FUNCTION.nextNode(), root_1);

                        // Haxe.g:448:27: ( IDENTIFIER )?
                        if ( stream_IDENTIFIER.hasNext() ) {
                            adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());

                        }
                        stream_IDENTIFIER.reset();
                        // Haxe.g:448:39: ( paramList )?
                        if ( stream_paramList.hasNext() ) {
                            adaptor.addChild(root_1, stream_paramList.nextTree());

                        }
                        stream_paramList.reset();
                        // Haxe.g:448:50: ( typeTagOpt )?
                        if ( stream_typeTagOpt.hasNext() ) {
                            adaptor.addChild(root_1, stream_typeTagOpt.nextTree());

                        }
                        stream_typeTagOpt.reset();
                        // Haxe.g:448:62: ( typeParamOpt )?
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
    // Haxe.g:451:1: classDecl : typeDeclFlags CLASS IDENTIFIER typeParamOpt inheritListOpt classBodyScope -> ^( CLASS IDENTIFIER ( typeDeclFlags )? ( typeParamOpt )? ( inheritListOpt )? ( classBodyScope )? ) ;
    public final HaxeParser.classDecl_return classDecl() throws RecognitionException {
        HaxeParser.classDecl_return retval = new HaxeParser.classDecl_return();
        retval.start = input.LT(1);
        int classDecl_StartIndex = input.index();
        Object root_0 = null;

        Token CLASS377=null;
        Token IDENTIFIER378=null;
        HaxeParser.typeDeclFlags_return typeDeclFlags376 = null;

        HaxeParser.typeParamOpt_return typeParamOpt379 = null;

        HaxeParser.inheritListOpt_return inheritListOpt380 = null;

        HaxeParser.classBodyScope_return classBodyScope381 = null;


        Object CLASS377_tree=null;
        Object IDENTIFIER378_tree=null;
        RewriteRuleTokenStream stream_CLASS=new RewriteRuleTokenStream(adaptor,"token CLASS");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleSubtreeStream stream_typeDeclFlags=new RewriteRuleSubtreeStream(adaptor,"rule typeDeclFlags");
        RewriteRuleSubtreeStream stream_classBodyScope=new RewriteRuleSubtreeStream(adaptor,"rule classBodyScope");
        RewriteRuleSubtreeStream stream_typeParamOpt=new RewriteRuleSubtreeStream(adaptor,"rule typeParamOpt");
        RewriteRuleSubtreeStream stream_inheritListOpt=new RewriteRuleSubtreeStream(adaptor,"rule inheritListOpt");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 74) ) { return retval; }
            // Haxe.g:452:5: ( typeDeclFlags CLASS IDENTIFIER typeParamOpt inheritListOpt classBodyScope -> ^( CLASS IDENTIFIER ( typeDeclFlags )? ( typeParamOpt )? ( inheritListOpt )? ( classBodyScope )? ) )
            // Haxe.g:452:9: typeDeclFlags CLASS IDENTIFIER typeParamOpt inheritListOpt classBodyScope
            {
            pushFollow(FOLLOW_typeDeclFlags_in_classDecl4462);
            typeDeclFlags376=typeDeclFlags();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeDeclFlags.add(typeDeclFlags376.getTree());
            CLASS377=(Token)match(input,CLASS,FOLLOW_CLASS_in_classDecl4464); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CLASS.add(CLASS377);

            IDENTIFIER378=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_classDecl4466); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER378);

            pushFollow(FOLLOW_typeParamOpt_in_classDecl4468);
            typeParamOpt379=typeParamOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeParamOpt.add(typeParamOpt379.getTree());
            pushFollow(FOLLOW_inheritListOpt_in_classDecl4470);
            inheritListOpt380=inheritListOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_inheritListOpt.add(inheritListOpt380.getTree());
            pushFollow(FOLLOW_classBodyScope_in_classDecl4472);
            classBodyScope381=classBodyScope();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_classBodyScope.add(classBodyScope381.getTree());


            // AST REWRITE
            // elements: classBodyScope, inheritListOpt, typeDeclFlags, typeParamOpt, IDENTIFIER, CLASS
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 453:13: -> ^( CLASS IDENTIFIER ( typeDeclFlags )? ( typeParamOpt )? ( inheritListOpt )? ( classBodyScope )? )
            {
                // Haxe.g:453:16: ^( CLASS IDENTIFIER ( typeDeclFlags )? ( typeParamOpt )? ( inheritListOpt )? ( classBodyScope )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new ClassNode(stream_CLASS.nextToken()), root_1);

                adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
                // Haxe.g:453:46: ( typeDeclFlags )?
                if ( stream_typeDeclFlags.hasNext() ) {
                    adaptor.addChild(root_1, stream_typeDeclFlags.nextTree());

                }
                stream_typeDeclFlags.reset();
                // Haxe.g:453:61: ( typeParamOpt )?
                if ( stream_typeParamOpt.hasNext() ) {
                    adaptor.addChild(root_1, stream_typeParamOpt.nextTree());

                }
                stream_typeParamOpt.reset();
                // Haxe.g:453:75: ( inheritListOpt )?
                if ( stream_inheritListOpt.hasNext() ) {
                    adaptor.addChild(root_1, stream_inheritListOpt.nextTree());

                }
                stream_inheritListOpt.reset();
                // Haxe.g:453:91: ( classBodyScope )?
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
    // Haxe.g:456:1: classBodyScope : LBRACE ( classMember )* RBRACE -> ^( BLOCK_SCOPE[\"BLOCK_SCOPE\", true, $LBRACE] ( classMember )* RBRACE[$RBRACE, true] ) ;
    public final HaxeParser.classBodyScope_return classBodyScope() throws RecognitionException {
        HaxeParser.classBodyScope_return retval = new HaxeParser.classBodyScope_return();
        retval.start = input.LT(1);
        int classBodyScope_StartIndex = input.index();
        Object root_0 = null;

        Token LBRACE382=null;
        Token RBRACE384=null;
        HaxeParser.classMember_return classMember383 = null;


        Object LBRACE382_tree=null;
        Object RBRACE384_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_classMember=new RewriteRuleSubtreeStream(adaptor,"rule classMember");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 75) ) { return retval; }
            // Haxe.g:457:5: ( LBRACE ( classMember )* RBRACE -> ^( BLOCK_SCOPE[\"BLOCK_SCOPE\", true, $LBRACE] ( classMember )* RBRACE[$RBRACE, true] ) )
            // Haxe.g:457:9: LBRACE ( classMember )* RBRACE
            {
            LBRACE382=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_classBodyScope4530); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACE.add(LBRACE382);

            // Haxe.g:457:16: ( classMember )*
            loop76:
            do {
                int alt76=2;
                int LA76_0 = input.LA(1);

                if ( (LA76_0==MONKEYS_AT||(LA76_0>=EXTERN && LA76_0<=PRIVATE)||(LA76_0>=PUBLIC && LA76_0<=OVERRIDE)||LA76_0==FUNCTION||(LA76_0>=ENUM && LA76_0<=VAR)||(LA76_0>=CLASS && LA76_0<=INTERFACE)) ) {
                    alt76=1;
                }


                switch (alt76) {
            	case 1 :
            	    // Haxe.g:457:17: classMember
            	    {
            	    pushFollow(FOLLOW_classMember_in_classBodyScope4533);
            	    classMember383=classMember();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_classMember.add(classMember383.getTree());

            	    }
            	    break;

            	default :
            	    break loop76;
                }
            } while (true);

            RBRACE384=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_classBodyScope4537); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACE.add(RBRACE384);



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
            // 457:38: -> ^( BLOCK_SCOPE[\"BLOCK_SCOPE\", true, $LBRACE] ( classMember )* RBRACE[$RBRACE, true] )
            {
                // Haxe.g:457:41: ^( BLOCK_SCOPE[\"BLOCK_SCOPE\", true, $LBRACE] ( classMember )* RBRACE[$RBRACE, true] )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new BlockScopeNode(BLOCK_SCOPE, "BLOCK_SCOPE", true, LBRACE382), root_1);

                // Haxe.g:457:101: ( classMember )*
                while ( stream_classMember.hasNext() ) {
                    adaptor.addChild(root_1, stream_classMember.nextTree());

                }
                stream_classMember.reset();
                adaptor.addChild(root_1, new HaxeTree(RBRACE, RBRACE384, true));

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
    // Haxe.g:460:1: classMember : ( varDecl | funcDecl | enumDecl );
    public final HaxeParser.classMember_return classMember() throws RecognitionException {
        HaxeParser.classMember_return retval = new HaxeParser.classMember_return();
        retval.start = input.LT(1);
        int classMember_StartIndex = input.index();
        Object root_0 = null;

        HaxeParser.varDecl_return varDecl385 = null;

        HaxeParser.funcDecl_return funcDecl386 = null;

        HaxeParser.enumDecl_return enumDecl387 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 76) ) { return retval; }
            // Haxe.g:461:5: ( varDecl | funcDecl | enumDecl )
            int alt77=3;
            alt77 = dfa77.predict(input);
            switch (alt77) {
                case 1 :
                    // Haxe.g:461:9: varDecl
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_varDecl_in_classMember4575);
                    varDecl385=varDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDecl385.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:462:9: funcDecl
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_funcDecl_in_classMember4586);
                    funcDecl386=funcDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, funcDecl386.getTree());

                    }
                    break;
                case 3 :
                    // Haxe.g:464:9: enumDecl
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_enumDecl_in_classMember4598);
                    enumDecl387=enumDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, enumDecl387.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // Haxe.g:467:1: interfaceDecl : typeDeclFlags INTERFACE type inheritListOpt LBRACE interfaceBody RBRACE ;
    public final HaxeParser.interfaceDecl_return interfaceDecl() throws RecognitionException {
        HaxeParser.interfaceDecl_return retval = new HaxeParser.interfaceDecl_return();
        retval.start = input.LT(1);
        int interfaceDecl_StartIndex = input.index();
        Object root_0 = null;

        Token INTERFACE389=null;
        Token LBRACE392=null;
        Token RBRACE394=null;
        HaxeParser.typeDeclFlags_return typeDeclFlags388 = null;

        HaxeParser.type_return type390 = null;

        HaxeParser.inheritListOpt_return inheritListOpt391 = null;

        HaxeParser.interfaceBody_return interfaceBody393 = null;


        Object INTERFACE389_tree=null;
        Object LBRACE392_tree=null;
        Object RBRACE394_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 77) ) { return retval; }
            // Haxe.g:468:5: ( typeDeclFlags INTERFACE type inheritListOpt LBRACE interfaceBody RBRACE )
            // Haxe.g:468:9: typeDeclFlags INTERFACE type inheritListOpt LBRACE interfaceBody RBRACE
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_typeDeclFlags_in_interfaceDecl4627);
            typeDeclFlags388=typeDeclFlags();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, typeDeclFlags388.getTree());
            INTERFACE389=(Token)match(input,INTERFACE,FOLLOW_INTERFACE_in_interfaceDecl4629); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            INTERFACE389_tree = (Object)adaptor.create(INTERFACE389);
            adaptor.addChild(root_0, INTERFACE389_tree);
            }
            pushFollow(FOLLOW_type_in_interfaceDecl4631);
            type390=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type390.getTree());
            pushFollow(FOLLOW_inheritListOpt_in_interfaceDecl4633);
            inheritListOpt391=inheritListOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, inheritListOpt391.getTree());
            LBRACE392=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_interfaceDecl4635); if (state.failed) return retval;
            pushFollow(FOLLOW_interfaceBody_in_interfaceDecl4638);
            interfaceBody393=interfaceBody();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceBody393.getTree());
            RBRACE394=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_interfaceDecl4640); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // Haxe.g:471:1: interfaceBody : ( varDecl interfaceBody | funcProtoDecl interfaceBody | );
    public final HaxeParser.interfaceBody_return interfaceBody() throws RecognitionException {
        HaxeParser.interfaceBody_return retval = new HaxeParser.interfaceBody_return();
        retval.start = input.LT(1);
        int interfaceBody_StartIndex = input.index();
        Object root_0 = null;

        HaxeParser.varDecl_return varDecl395 = null;

        HaxeParser.interfaceBody_return interfaceBody396 = null;

        HaxeParser.funcProtoDecl_return funcProtoDecl397 = null;

        HaxeParser.interfaceBody_return interfaceBody398 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 78) ) { return retval; }
            // Haxe.g:472:5: ( varDecl interfaceBody | funcProtoDecl interfaceBody | )
            int alt78=3;
            alt78 = dfa78.predict(input);
            switch (alt78) {
                case 1 :
                    // Haxe.g:472:9: varDecl interfaceBody
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_varDecl_in_interfaceBody4664);
                    varDecl395=varDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDecl395.getTree());
                    pushFollow(FOLLOW_interfaceBody_in_interfaceBody4666);
                    interfaceBody396=interfaceBody();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceBody396.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:473:9: funcProtoDecl interfaceBody
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_funcProtoDecl_in_interfaceBody4676);
                    funcProtoDecl397=funcProtoDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, funcProtoDecl397.getTree());
                    pushFollow(FOLLOW_interfaceBody_in_interfaceBody4678);
                    interfaceBody398=interfaceBody();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceBody398.getTree());

                    }
                    break;
                case 3 :
                    // Haxe.g:476:5: 
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
    // Haxe.g:478:1: inheritList : inherit ( COMMA inherit )* ;
    public final HaxeParser.inheritList_return inheritList() throws RecognitionException {
        HaxeParser.inheritList_return retval = new HaxeParser.inheritList_return();
        retval.start = input.LT(1);
        int inheritList_StartIndex = input.index();
        Object root_0 = null;

        Token COMMA400=null;
        HaxeParser.inherit_return inherit399 = null;

        HaxeParser.inherit_return inherit401 = null;


        Object COMMA400_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 79) ) { return retval; }
            // Haxe.g:479:5: ( inherit ( COMMA inherit )* )
            // Haxe.g:479:10: inherit ( COMMA inherit )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_inherit_in_inheritList4712);
            inherit399=inherit();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, inherit399.getTree());
            // Haxe.g:479:18: ( COMMA inherit )*
            loop79:
            do {
                int alt79=2;
                int LA79_0 = input.LA(1);

                if ( (LA79_0==COMMA) ) {
                    alt79=1;
                }


                switch (alt79) {
            	case 1 :
            	    // Haxe.g:479:19: COMMA inherit
            	    {
            	    COMMA400=(Token)match(input,COMMA,FOLLOW_COMMA_in_inheritList4715); if (state.failed) return retval;
            	    pushFollow(FOLLOW_inherit_in_inheritList4718);
            	    inherit401=inherit();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, inherit401.getTree());

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
    // Haxe.g:482:1: inheritListOpt : ( inheritList -> ^( INHERIT_LIST_OPT[\"INHERIT_LIST_OPT\",true] ( inheritList )? ) | );
    public final HaxeParser.inheritListOpt_return inheritListOpt() throws RecognitionException {
        HaxeParser.inheritListOpt_return retval = new HaxeParser.inheritListOpt_return();
        retval.start = input.LT(1);
        int inheritListOpt_StartIndex = input.index();
        Object root_0 = null;

        HaxeParser.inheritList_return inheritList402 = null;


        RewriteRuleSubtreeStream stream_inheritList=new RewriteRuleSubtreeStream(adaptor,"rule inheritList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 80) ) { return retval; }
            // Haxe.g:483:5: ( inheritList -> ^( INHERIT_LIST_OPT[\"INHERIT_LIST_OPT\",true] ( inheritList )? ) | )
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
                    // Haxe.g:483:10: inheritList
                    {
                    pushFollow(FOLLOW_inheritList_in_inheritListOpt4748);
                    inheritList402=inheritList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_inheritList.add(inheritList402.getTree());


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
                    // 483:22: -> ^( INHERIT_LIST_OPT[\"INHERIT_LIST_OPT\",true] ( inheritList )? )
                    {
                        // Haxe.g:483:25: ^( INHERIT_LIST_OPT[\"INHERIT_LIST_OPT\",true] ( inheritList )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new HaxeTree(INHERIT_LIST_OPT, "INHERIT_LIST_OPT", true), root_1);

                        // Haxe.g:483:79: ( inheritList )?
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
                    // Haxe.g:485:5: 
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
    // Haxe.g:487:1: inherit : ( EXTENDS type -> ^( EXTENDS ( type )? ) | IMPLEMENTS type -> ^( IMPLEMENTS ( type )? ) );
    public final HaxeParser.inherit_return inherit() throws RecognitionException {
        HaxeParser.inherit_return retval = new HaxeParser.inherit_return();
        retval.start = input.LT(1);
        int inherit_StartIndex = input.index();
        Object root_0 = null;

        Token EXTENDS403=null;
        Token IMPLEMENTS405=null;
        HaxeParser.type_return type404 = null;

        HaxeParser.type_return type406 = null;


        Object EXTENDS403_tree=null;
        Object IMPLEMENTS405_tree=null;
        RewriteRuleTokenStream stream_IMPLEMENTS=new RewriteRuleTokenStream(adaptor,"token IMPLEMENTS");
        RewriteRuleTokenStream stream_EXTENDS=new RewriteRuleTokenStream(adaptor,"token EXTENDS");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 81) ) { return retval; }
            // Haxe.g:487:12: ( EXTENDS type -> ^( EXTENDS ( type )? ) | IMPLEMENTS type -> ^( IMPLEMENTS ( type )? ) )
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
                    // Haxe.g:487:17: EXTENDS type
                    {
                    EXTENDS403=(Token)match(input,EXTENDS,FOLLOW_EXTENDS_in_inherit4794); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EXTENDS.add(EXTENDS403);

                    pushFollow(FOLLOW_type_in_inherit4796);
                    type404=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type404.getTree());


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
                    // 487:34: -> ^( EXTENDS ( type )? )
                    {
                        // Haxe.g:487:37: ^( EXTENDS ( type )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_EXTENDS.nextNode(), root_1);

                        // Haxe.g:487:47: ( type )?
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
                    // Haxe.g:488:14: IMPLEMENTS type
                    {
                    IMPLEMENTS405=(Token)match(input,IMPLEMENTS,FOLLOW_IMPLEMENTS_in_inherit4824); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IMPLEMENTS.add(IMPLEMENTS405);

                    pushFollow(FOLLOW_type_in_inherit4826);
                    type406=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type406.getTree());


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
                    // 488:30: -> ^( IMPLEMENTS ( type )? )
                    {
                        // Haxe.g:488:33: ^( IMPLEMENTS ( type )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_IMPLEMENTS.nextNode(), root_1);

                        // Haxe.g:488:46: ( type )?
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
    // Haxe.g:491:1: typedefDecl : TYPEDEF IDENTIFIER EQ funcType ;
    public final HaxeParser.typedefDecl_return typedefDecl() throws RecognitionException {
        HaxeParser.typedefDecl_return retval = new HaxeParser.typedefDecl_return();
        retval.start = input.LT(1);
        int typedefDecl_StartIndex = input.index();
        Object root_0 = null;

        Token TYPEDEF407=null;
        Token IDENTIFIER408=null;
        Token EQ409=null;
        HaxeParser.funcType_return funcType410 = null;


        Object TYPEDEF407_tree=null;
        Object IDENTIFIER408_tree=null;
        Object EQ409_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 82) ) { return retval; }
            // Haxe.g:492:5: ( TYPEDEF IDENTIFIER EQ funcType )
            // Haxe.g:492:10: TYPEDEF IDENTIFIER EQ funcType
            {
            root_0 = (Object)adaptor.nil();

            TYPEDEF407=(Token)match(input,TYPEDEF,FOLLOW_TYPEDEF_in_typedefDecl4866); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TYPEDEF407_tree = (Object)adaptor.create(TYPEDEF407);
            adaptor.addChild(root_0, TYPEDEF407_tree);
            }
            IDENTIFIER408=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_typedefDecl4868); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER408_tree = (Object)adaptor.create(IDENTIFIER408);
            adaptor.addChild(root_0, IDENTIFIER408_tree);
            }
            EQ409=(Token)match(input,EQ,FOLLOW_EQ_in_typedefDecl4870); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            EQ409_tree = (Object)adaptor.create(EQ409);
            adaptor.addChild(root_0, EQ409_tree);
            }
            pushFollow(FOLLOW_funcType_in_typedefDecl4872);
            funcType410=funcType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, funcType410.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // Haxe.g:495:1: typeExtend : GT funcType COMMA ;
    public final HaxeParser.typeExtend_return typeExtend() throws RecognitionException {
        HaxeParser.typeExtend_return retval = new HaxeParser.typeExtend_return();
        retval.start = input.LT(1);
        int typeExtend_StartIndex = input.index();
        Object root_0 = null;

        Token GT411=null;
        Token COMMA413=null;
        HaxeParser.funcType_return funcType412 = null;


        Object GT411_tree=null;
        Object COMMA413_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 83) ) { return retval; }
            // Haxe.g:496:5: ( GT funcType COMMA )
            // Haxe.g:496:10: GT funcType COMMA
            {
            root_0 = (Object)adaptor.nil();

            GT411=(Token)match(input,GT,FOLLOW_GT_in_typeExtend4896); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            GT411_tree = (Object)adaptor.create(GT411);
            adaptor.addChild(root_0, GT411_tree);
            }
            pushFollow(FOLLOW_funcType_in_typeExtend4898);
            funcType412=funcType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, funcType412.getTree());
            COMMA413=(Token)match(input,COMMA,FOLLOW_COMMA_in_typeExtend4900); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // Haxe.g:499:1: anonType : LBRACE ( | anonTypeFieldList | varDeclList | typeExtend ( | anonTypeFieldList | varDeclList ) ) RBRACE ;
    public final HaxeParser.anonType_return anonType() throws RecognitionException {
        HaxeParser.anonType_return retval = new HaxeParser.anonType_return();
        retval.start = input.LT(1);
        int anonType_StartIndex = input.index();
        Object root_0 = null;

        Token LBRACE414=null;
        Token RBRACE420=null;
        HaxeParser.anonTypeFieldList_return anonTypeFieldList415 = null;

        HaxeParser.varDeclList_return varDeclList416 = null;

        HaxeParser.typeExtend_return typeExtend417 = null;

        HaxeParser.anonTypeFieldList_return anonTypeFieldList418 = null;

        HaxeParser.varDeclList_return varDeclList419 = null;


        Object LBRACE414_tree=null;
        Object RBRACE420_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 84) ) { return retval; }
            // Haxe.g:500:5: ( LBRACE ( | anonTypeFieldList | varDeclList | typeExtend ( | anonTypeFieldList | varDeclList ) ) RBRACE )
            // Haxe.g:500:9: LBRACE ( | anonTypeFieldList | varDeclList | typeExtend ( | anonTypeFieldList | varDeclList ) ) RBRACE
            {
            root_0 = (Object)adaptor.nil();

            LBRACE414=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_anonType4924); if (state.failed) return retval;
            // Haxe.g:501:13: ( | anonTypeFieldList | varDeclList | typeExtend ( | anonTypeFieldList | varDeclList ) )
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
                    // Haxe.g:502:13: 
                    {
                    }
                    break;
                case 2 :
                    // Haxe.g:502:17: anonTypeFieldList
                    {
                    pushFollow(FOLLOW_anonTypeFieldList_in_anonType4958);
                    anonTypeFieldList415=anonTypeFieldList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, anonTypeFieldList415.getTree());

                    }
                    break;
                case 3 :
                    // Haxe.g:503:17: varDeclList
                    {
                    pushFollow(FOLLOW_varDeclList_in_anonType4977);
                    varDeclList416=varDeclList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclList416.getTree());

                    }
                    break;
                case 4 :
                    // Haxe.g:504:17: typeExtend ( | anonTypeFieldList | varDeclList )
                    {
                    pushFollow(FOLLOW_typeExtend_in_anonType4996);
                    typeExtend417=typeExtend();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeExtend417.getTree());
                    // Haxe.g:504:28: ( | anonTypeFieldList | varDeclList )
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
                            // Haxe.g:505:25: 
                            {
                            }
                            break;
                        case 2 :
                            // Haxe.g:505:29: anonTypeFieldList
                            {
                            pushFollow(FOLLOW_anonTypeFieldList_in_anonType5028);
                            anonTypeFieldList418=anonTypeFieldList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, anonTypeFieldList418.getTree());

                            }
                            break;
                        case 3 :
                            // Haxe.g:506:29: varDeclList
                            {
                            pushFollow(FOLLOW_varDeclList_in_anonType5058);
                            varDeclList419=varDeclList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclList419.getTree());

                            }
                            break;

                    }


                    }
                    break;

            }

            RBRACE420=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_anonType5085); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // Haxe.g:511:1: anonTypeFieldList : anonTypeField ( COMMA anonTypeField )* ;
    public final HaxeParser.anonTypeFieldList_return anonTypeFieldList() throws RecognitionException {
        HaxeParser.anonTypeFieldList_return retval = new HaxeParser.anonTypeFieldList_return();
        retval.start = input.LT(1);
        int anonTypeFieldList_StartIndex = input.index();
        Object root_0 = null;

        Token COMMA422=null;
        HaxeParser.anonTypeField_return anonTypeField421 = null;

        HaxeParser.anonTypeField_return anonTypeField423 = null;


        Object COMMA422_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 85) ) { return retval; }
            // Haxe.g:512:5: ( anonTypeField ( COMMA anonTypeField )* )
            // Haxe.g:512:10: anonTypeField ( COMMA anonTypeField )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_anonTypeField_in_anonTypeFieldList5111);
            anonTypeField421=anonTypeField();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, anonTypeField421.getTree());
            // Haxe.g:512:24: ( COMMA anonTypeField )*
            loop84:
            do {
                int alt84=2;
                int LA84_0 = input.LA(1);

                if ( (LA84_0==COMMA) ) {
                    alt84=1;
                }


                switch (alt84) {
            	case 1 :
            	    // Haxe.g:512:25: COMMA anonTypeField
            	    {
            	    COMMA422=(Token)match(input,COMMA,FOLLOW_COMMA_in_anonTypeFieldList5114); if (state.failed) return retval;
            	    pushFollow(FOLLOW_anonTypeField_in_anonTypeFieldList5117);
            	    anonTypeField423=anonTypeField();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, anonTypeField423.getTree());

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
    // Haxe.g:515:1: objLit : '{' objLitElemList '}' ;
    public final HaxeParser.objLit_return objLit() throws RecognitionException {
        HaxeParser.objLit_return retval = new HaxeParser.objLit_return();
        retval.start = input.LT(1);
        int objLit_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal424=null;
        Token char_literal426=null;
        HaxeParser.objLitElemList_return objLitElemList425 = null;


        Object char_literal424_tree=null;
        Object char_literal426_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 86) ) { return retval; }
            // Haxe.g:515:9: ( '{' objLitElemList '}' )
            // Haxe.g:515:11: '{' objLitElemList '}'
            {
            root_0 = (Object)adaptor.nil();

            char_literal424=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_objLit5133); if (state.failed) return retval;
            pushFollow(FOLLOW_objLitElemList_in_objLit5136);
            objLitElemList425=objLitElemList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, objLitElemList425.getTree());
            char_literal426=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_objLit5138); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // Haxe.g:518:1: anonTypeField : IDENTIFIER COLON funcType ;
    public final HaxeParser.anonTypeField_return anonTypeField() throws RecognitionException {
        HaxeParser.anonTypeField_return retval = new HaxeParser.anonTypeField_return();
        retval.start = input.LT(1);
        int anonTypeField_StartIndex = input.index();
        Object root_0 = null;

        Token IDENTIFIER427=null;
        Token COLON428=null;
        HaxeParser.funcType_return funcType429 = null;


        Object IDENTIFIER427_tree=null;
        Object COLON428_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 87) ) { return retval; }
            // Haxe.g:519:5: ( IDENTIFIER COLON funcType )
            // Haxe.g:519:10: IDENTIFIER COLON funcType
            {
            root_0 = (Object)adaptor.nil();

            IDENTIFIER427=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_anonTypeField5163); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER427_tree = (Object)adaptor.create(IDENTIFIER427);
            adaptor.addChild(root_0, IDENTIFIER427_tree);
            }
            COLON428=(Token)match(input,COLON,FOLLOW_COLON_in_anonTypeField5165); if (state.failed) return retval;
            pushFollow(FOLLOW_funcType_in_anonTypeField5168);
            funcType429=funcType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, funcType429.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // Haxe.g:522:1: objLitElemList : objLitElem ( COMMA objLitElem )* ;
    public final HaxeParser.objLitElemList_return objLitElemList() throws RecognitionException {
        HaxeParser.objLitElemList_return retval = new HaxeParser.objLitElemList_return();
        retval.start = input.LT(1);
        int objLitElemList_StartIndex = input.index();
        Object root_0 = null;

        Token COMMA431=null;
        HaxeParser.objLitElem_return objLitElem430 = null;

        HaxeParser.objLitElem_return objLitElem432 = null;


        Object COMMA431_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 88) ) { return retval; }
            // Haxe.g:523:5: ( objLitElem ( COMMA objLitElem )* )
            // Haxe.g:523:10: objLitElem ( COMMA objLitElem )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_objLitElem_in_objLitElemList5196);
            objLitElem430=objLitElem();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, objLitElem430.getTree());
            // Haxe.g:523:21: ( COMMA objLitElem )*
            loop85:
            do {
                int alt85=2;
                int LA85_0 = input.LA(1);

                if ( (LA85_0==COMMA) ) {
                    alt85=1;
                }


                switch (alt85) {
            	case 1 :
            	    // Haxe.g:523:22: COMMA objLitElem
            	    {
            	    COMMA431=(Token)match(input,COMMA,FOLLOW_COMMA_in_objLitElemList5199); if (state.failed) return retval;
            	    pushFollow(FOLLOW_objLitElem_in_objLitElemList5202);
            	    objLitElem432=objLitElem();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, objLitElem432.getTree());

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
    // Haxe.g:526:1: objLitElem : IDENTIFIER COLON expr ;
    public final HaxeParser.objLitElem_return objLitElem() throws RecognitionException {
        HaxeParser.objLitElem_return retval = new HaxeParser.objLitElem_return();
        retval.start = input.LT(1);
        int objLitElem_StartIndex = input.index();
        Object root_0 = null;

        Token IDENTIFIER433=null;
        Token COLON434=null;
        HaxeParser.expr_return expr435 = null;


        Object IDENTIFIER433_tree=null;
        Object COLON434_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 89) ) { return retval; }
            // Haxe.g:527:5: ( IDENTIFIER COLON expr )
            // Haxe.g:527:10: IDENTIFIER COLON expr
            {
            root_0 = (Object)adaptor.nil();

            IDENTIFIER433=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_objLitElem5228); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER433_tree = (Object)adaptor.create(IDENTIFIER433);
            adaptor.addChild(root_0, IDENTIFIER433_tree);
            }
            COLON434=(Token)match(input,COLON,FOLLOW_COLON_in_objLitElem5230); if (state.failed) return retval;
            pushFollow(FOLLOW_expr_in_objLitElem5233);
            expr435=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr435.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // Haxe.g:530:1: elementarySymbol : ( LONGLITERAL -> LONGLITERAL[$LONGLITERAL, \"INT\"] | NULL -> ^( NULL[$NULL,\"Unknown<0>\"] ) | INTLITERAL -> INTLITERAL[$INTLITERAL, \"INT\"] | STRINGLITERAL -> STRINGLITERAL[$STRINGLITERAL,\"STRING\"] | CHARLITERAL -> CHARLITERAL[$CHARLITERAL, \"STRING\"] | FLOATNUM -> FLOATNUM[$FLOATNUM, \"FLOAT\"] | TRUE -> TRUE[$TRUE,\"BOOL\"] | FALSE -> FALSE[$FALSE,\"BOOL\"] );
    public final HaxeParser.elementarySymbol_return elementarySymbol() throws RecognitionException {
        HaxeParser.elementarySymbol_return retval = new HaxeParser.elementarySymbol_return();
        retval.start = input.LT(1);
        int elementarySymbol_StartIndex = input.index();
        Object root_0 = null;

        Token LONGLITERAL436=null;
        Token NULL437=null;
        Token INTLITERAL438=null;
        Token STRINGLITERAL439=null;
        Token CHARLITERAL440=null;
        Token FLOATNUM441=null;
        Token TRUE442=null;
        Token FALSE443=null;

        Object LONGLITERAL436_tree=null;
        Object NULL437_tree=null;
        Object INTLITERAL438_tree=null;
        Object STRINGLITERAL439_tree=null;
        Object CHARLITERAL440_tree=null;
        Object FLOATNUM441_tree=null;
        Object TRUE442_tree=null;
        Object FALSE443_tree=null;
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
            // Haxe.g:531:5: ( LONGLITERAL -> LONGLITERAL[$LONGLITERAL, \"INT\"] | NULL -> ^( NULL[$NULL,\"Unknown<0>\"] ) | INTLITERAL -> INTLITERAL[$INTLITERAL, \"INT\"] | STRINGLITERAL -> STRINGLITERAL[$STRINGLITERAL,\"STRING\"] | CHARLITERAL -> CHARLITERAL[$CHARLITERAL, \"STRING\"] | FLOATNUM -> FLOATNUM[$FLOATNUM, \"FLOAT\"] | TRUE -> TRUE[$TRUE,\"BOOL\"] | FALSE -> FALSE[$FALSE,\"BOOL\"] )
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
                    // Haxe.g:531:9: LONGLITERAL
                    {
                    LONGLITERAL436=(Token)match(input,LONGLITERAL,FOLLOW_LONGLITERAL_in_elementarySymbol5256); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LONGLITERAL.add(LONGLITERAL436);



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
                    // 531:24: -> LONGLITERAL[$LONGLITERAL, \"INT\"]
                    {
                        adaptor.addChild(root_0, new Constant(LONGLITERAL, LONGLITERAL436, "INT"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // Haxe.g:532:9: NULL
                    {
                    NULL437=(Token)match(input,NULL,FOLLOW_NULL_in_elementarySymbol5277); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NULL.add(NULL437);



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
                    // 532:14: -> ^( NULL[$NULL,\"Unknown<0>\"] )
                    {
                        // Haxe.g:532:17: ^( NULL[$NULL,\"Unknown<0>\"] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new Constant(NULL, NULL437, "Unknown<0>"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // Haxe.g:533:9: INTLITERAL
                    {
                    INTLITERAL438=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_elementarySymbol5297); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INTLITERAL.add(INTLITERAL438);



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
                    // 533:23: -> INTLITERAL[$INTLITERAL, \"INT\"]
                    {
                        adaptor.addChild(root_0, new Constant(INTLITERAL, INTLITERAL438, "INT"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // Haxe.g:534:9: STRINGLITERAL
                    {
                    STRINGLITERAL439=(Token)match(input,STRINGLITERAL,FOLLOW_STRINGLITERAL_in_elementarySymbol5318); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STRINGLITERAL.add(STRINGLITERAL439);



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
                    // 534:26: -> STRINGLITERAL[$STRINGLITERAL,\"STRING\"]
                    {
                        adaptor.addChild(root_0, new Constant(STRINGLITERAL, STRINGLITERAL439, "STRING"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // Haxe.g:535:9: CHARLITERAL
                    {
                    CHARLITERAL440=(Token)match(input,CHARLITERAL,FOLLOW_CHARLITERAL_in_elementarySymbol5339); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CHARLITERAL.add(CHARLITERAL440);



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
                    // 535:24: -> CHARLITERAL[$CHARLITERAL, \"STRING\"]
                    {
                        adaptor.addChild(root_0, new Constant(CHARLITERAL, CHARLITERAL440, "STRING"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    // Haxe.g:536:9: FLOATNUM
                    {
                    FLOATNUM441=(Token)match(input,FLOATNUM,FOLLOW_FLOATNUM_in_elementarySymbol5360); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FLOATNUM.add(FLOATNUM441);



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
                    // 536:21: -> FLOATNUM[$FLOATNUM, \"FLOAT\"]
                    {
                        adaptor.addChild(root_0, new Constant(FLOATNUM, FLOATNUM441, "FLOAT"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 7 :
                    // Haxe.g:537:9: TRUE
                    {
                    TRUE442=(Token)match(input,TRUE,FOLLOW_TRUE_in_elementarySymbol5381); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TRUE.add(TRUE442);



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
                    // 537:21: -> TRUE[$TRUE,\"BOOL\"]
                    {
                        adaptor.addChild(root_0, new Constant(TRUE, TRUE442, "BOOL"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 8 :
                    // Haxe.g:538:9: FALSE
                    {
                    FALSE443=(Token)match(input,FALSE,FOLLOW_FALSE_in_elementarySymbol5406); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FALSE.add(FALSE443);



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
                    // 538:22: -> FALSE[$FALSE,\"BOOL\"]
                    {
                        adaptor.addChild(root_0, new Constant(FALSE, FALSE443, "BOOL"));

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
        // Haxe.g:149:44: ( typeTagOpt )
        // Haxe.g:149:44: typeTagOpt
        {
        pushFollow(FOLLOW_typeTagOpt_in_synpred28_Haxe929);
        typeTagOpt();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred28_Haxe

    // $ANTLR start synpred34_Haxe
    public final void synpred34_Haxe_fragment() throws RecognitionException {   
        // Haxe.g:193:10: ( ( type ) ( MINUS_BIGGER type )* )
        // Haxe.g:193:10: ( type ) ( MINUS_BIGGER type )*
        {
        // Haxe.g:193:10: ( type )
        // Haxe.g:193:11: type
        {
        pushFollow(FOLLOW_type_in_synpred34_Haxe1134);
        type();

        state._fsp--;
        if (state.failed) return ;

        }

        // Haxe.g:193:17: ( MINUS_BIGGER type )*
        loop89:
        do {
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==MINUS_BIGGER) ) {
                alt89=1;
            }


            switch (alt89) {
        	case 1 :
        	    // Haxe.g:193:18: MINUS_BIGGER type
        	    {
        	    match(input,MINUS_BIGGER,FOLLOW_MINUS_BIGGER_in_synpred34_Haxe1138); if (state.failed) return ;
        	    pushFollow(FOLLOW_type_in_synpred34_Haxe1141);
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
        // Haxe.g:201:54: ( typeParam )
        // Haxe.g:201:54: typeParam
        {
        pushFollow(FOLLOW_typeParam_in_synpred41_Haxe1227);
        typeParam();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred41_Haxe

    // $ANTLR start synpred42_Haxe
    public final void synpred42_Haxe_fragment() throws RecognitionException {   
        // Haxe.g:201:14: ( ( anonType | dotIdent | primitiveType ) ( typeParam )* )
        // Haxe.g:201:14: ( anonType | dotIdent | primitiveType ) ( typeParam )*
        {
        // Haxe.g:201:14: ( anonType | dotIdent | primitiveType )
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
                // Haxe.g:201:15: anonType
                {
                pushFollow(FOLLOW_anonType_in_synpred42_Haxe1214);
                anonType();

                state._fsp--;
                if (state.failed) return ;

                }
                break;
            case 2 :
                // Haxe.g:201:26: dotIdent
                {
                pushFollow(FOLLOW_dotIdent_in_synpred42_Haxe1218);
                dotIdent();

                state._fsp--;
                if (state.failed) return ;

                }
                break;
            case 3 :
                // Haxe.g:201:37: primitiveType
                {
                pushFollow(FOLLOW_primitiveType_in_synpred42_Haxe1222);
                primitiveType();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }

        // Haxe.g:201:53: ( typeParam )*
        loop91:
        do {
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==LT) ) {
                alt91=1;
            }


            switch (alt91) {
        	case 1 :
        	    // Haxe.g:201:54: typeParam
        	    {
        	    pushFollow(FOLLOW_typeParam_in_synpred42_Haxe1227);
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
        // Haxe.g:206:10: ( LT typeList GT )
        // Haxe.g:206:10: LT typeList GT
        {
        match(input,LT,FOLLOW_LT_in_synpred43_Haxe1271); if (state.failed) return ;
        pushFollow(FOLLOW_typeList_in_synpred43_Haxe1274);
        typeList();

        state._fsp--;
        if (state.failed) return ;
        match(input,GT,FOLLOW_GT_in_synpred43_Haxe1276); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred43_Haxe

    // $ANTLR start synpred44_Haxe
    public final void synpred44_Haxe_fragment() throws RecognitionException {   
        // Haxe.g:207:10: ( LT typeList LT typeList GTGT )
        // Haxe.g:207:10: LT typeList LT typeList GTGT
        {
        match(input,LT,FOLLOW_LT_in_synpred44_Haxe1288); if (state.failed) return ;
        pushFollow(FOLLOW_typeList_in_synpred44_Haxe1291);
        typeList();

        state._fsp--;
        if (state.failed) return ;
        match(input,LT,FOLLOW_LT_in_synpred44_Haxe1293); if (state.failed) return ;
        pushFollow(FOLLOW_typeList_in_synpred44_Haxe1296);
        typeList();

        state._fsp--;
        if (state.failed) return ;
        match(input,GTGT,FOLLOW_GTGT_in_synpred44_Haxe1298); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred44_Haxe

    // $ANTLR start synpred45_Haxe
    public final void synpred45_Haxe_fragment() throws RecognitionException {   
        // Haxe.g:213:10: ( typeParam )
        // Haxe.g:213:10: typeParam
        {
        pushFollow(FOLLOW_typeParam_in_synpred45_Haxe1357);
        typeParam();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred45_Haxe

    // $ANTLR start synpred47_Haxe
    public final void synpred47_Haxe_fragment() throws RecognitionException {   
        // Haxe.g:227:10: ( block )
        // Haxe.g:227:10: block
        {
        pushFollow(FOLLOW_block_in_synpred47_Haxe1516);
        block();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred47_Haxe

    // $ANTLR start synpred48_Haxe
    public final void synpred48_Haxe_fragment() throws RecognitionException {   
        // Haxe.g:228:10: ( assignExpr SEMI )
        // Haxe.g:228:10: assignExpr SEMI
        {
        pushFollow(FOLLOW_assignExpr_in_synpred48_Haxe1527);
        assignExpr();

        state._fsp--;
        if (state.failed) return ;
        match(input,SEMI,FOLLOW_SEMI_in_synpred48_Haxe1529); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred48_Haxe

    // $ANTLR start synpred50_Haxe
    public final void synpred50_Haxe_fragment() throws RecognitionException {   
        HaxeParser.statement_return st2 = null;


        // Haxe.g:230:42: ( ELSE st2= statement )
        // Haxe.g:230:42: ELSE st2= statement
        {
        match(input,ELSE,FOLLOW_ELSE_in_synpred50_Haxe1561); if (state.failed) return ;
        pushFollow(FOLLOW_statement_in_synpred50_Haxe1565);
        st2=statement();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred50_Haxe

    // $ANTLR start synpred65_Haxe
    public final void synpred65_Haxe_fragment() throws RecognitionException {   
        // Haxe.g:240:10: ( expr SEMI )
        // Haxe.g:240:10: expr SEMI
        {
        pushFollow(FOLLOW_expr_in_synpred65_Haxe2023);
        expr();

        state._fsp--;
        if (state.failed) return ;
        match(input,SEMI,FOLLOW_SEMI_in_synpred65_Haxe2026); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred65_Haxe

    // $ANTLR start synpred66_Haxe
    public final void synpred66_Haxe_fragment() throws RecognitionException {   
        // Haxe.g:241:10: ( IDENTIFIER COLON statement )
        // Haxe.g:241:10: IDENTIFIER COLON statement
        {
        match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_synpred66_Haxe2038); if (state.failed) return ;
        match(input,COLON,FOLLOW_COLON_in_synpred66_Haxe2040); if (state.failed) return ;
        pushFollow(FOLLOW_statement_in_synpred66_Haxe2042);
        statement();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred66_Haxe

    // $ANTLR start synpred69_Haxe
    public final void synpred69_Haxe_fragment() throws RecognitionException {   
        // Haxe.g:254:10: ( varDecl )
        // Haxe.g:254:10: varDecl
        {
        pushFollow(FOLLOW_varDecl_in_synpred69_Haxe2200);
        varDecl();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred69_Haxe

    // $ANTLR start synpred70_Haxe
    public final void synpred70_Haxe_fragment() throws RecognitionException {   
        // Haxe.g:255:10: ( classDecl )
        // Haxe.g:255:10: classDecl
        {
        pushFollow(FOLLOW_classDecl_in_synpred70_Haxe2211);
        classDecl();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred70_Haxe

    // $ANTLR start synpred106_Haxe
    public final void synpred106_Haxe_fragment() throws RecognitionException {   
        // Haxe.g:345:10: ( value methodCallOrSliceList )
        // Haxe.g:345:10: value methodCallOrSliceList
        {
        pushFollow(FOLLOW_value_in_synpred106_Haxe3045);
        value();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_methodCallOrSliceList_in_synpred106_Haxe3047);
        methodCallOrSliceList();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred106_Haxe

    // $ANTLR start synpred107_Haxe
    public final void synpred107_Haxe_fragment() throws RecognitionException {   
        // Haxe.g:346:10: ( value PLUSPLUS )
        // Haxe.g:346:10: value PLUSPLUS
        {
        pushFollow(FOLLOW_value_in_synpred107_Haxe3074);
        value();

        state._fsp--;
        if (state.failed) return ;
        match(input,PLUSPLUS,FOLLOW_PLUSPLUS_in_synpred107_Haxe3076); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred107_Haxe

    // $ANTLR start synpred108_Haxe
    public final void synpred108_Haxe_fragment() throws RecognitionException {   
        // Haxe.g:347:10: ( value SUBSUB )
        // Haxe.g:347:10: value SUBSUB
        {
        pushFollow(FOLLOW_value_in_synpred108_Haxe3115);
        value();

        state._fsp--;
        if (state.failed) return ;
        match(input,SUBSUB,FOLLOW_SUBSUB_in_synpred108_Haxe3117); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred108_Haxe

    // $ANTLR start synpred110_Haxe
    public final void synpred110_Haxe_fragment() throws RecognitionException {   
        // Haxe.g:357:10: ( methodCallOrSlice methodCallOrSliceList )
        // Haxe.g:357:10: methodCallOrSlice methodCallOrSliceList
        {
        pushFollow(FOLLOW_methodCallOrSlice_in_synpred110_Haxe3242);
        methodCallOrSlice();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_methodCallOrSliceList_in_synpred110_Haxe3244);
        methodCallOrSliceList();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred110_Haxe

    // $ANTLR start synpred115_Haxe
    public final void synpred115_Haxe_fragment() throws RecognitionException {   
        // Haxe.g:366:18: ( expr )
        // Haxe.g:366:18: expr
        {
        pushFollow(FOLLOW_expr_in_synpred115_Haxe3319);
        expr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred115_Haxe

    // $ANTLR start synpred118_Haxe
    public final void synpred118_Haxe_fragment() throws RecognitionException {   
        // Haxe.g:374:13: ( CAST LPAREN expr ( COMMA funcType )? RPAREN )
        // Haxe.g:374:13: CAST LPAREN expr ( COMMA funcType )? RPAREN
        {
        match(input,CAST,FOLLOW_CAST_in_synpred118_Haxe3403); if (state.failed) return ;
        match(input,LPAREN,FOLLOW_LPAREN_in_synpred118_Haxe3405); if (state.failed) return ;
        pushFollow(FOLLOW_expr_in_synpred118_Haxe3407);
        expr();

        state._fsp--;
        if (state.failed) return ;
        // Haxe.g:374:30: ( COMMA funcType )?
        int alt99=2;
        int LA99_0 = input.LA(1);

        if ( (LA99_0==COMMA) ) {
            alt99=1;
        }
        switch (alt99) {
            case 1 :
                // Haxe.g:374:31: COMMA funcType
                {
                match(input,COMMA,FOLLOW_COMMA_in_synpred118_Haxe3410); if (state.failed) return ;
                pushFollow(FOLLOW_funcType_in_synpred118_Haxe3412);
                funcType();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }

        match(input,RPAREN,FOLLOW_RPAREN_in_synpred118_Haxe3416); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred118_Haxe

    // $ANTLR start synpred119_Haxe
    public final void synpred119_Haxe_fragment() throws RecognitionException {   
        // Haxe.g:382:9: ( classDecl )
        // Haxe.g:382:9: classDecl
        {
        pushFollow(FOLLOW_classDecl_in_synpred119_Haxe3515);
        classDecl();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred119_Haxe

    // $ANTLR start synpred120_Haxe
    public final void synpred120_Haxe_fragment() throws RecognitionException {   
        // Haxe.g:383:9: ( interfaceDecl )
        // Haxe.g:383:9: interfaceDecl
        {
        pushFollow(FOLLOW_interfaceDecl_in_synpred120_Haxe3525);
        interfaceDecl();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred120_Haxe

    // $ANTLR start synpred121_Haxe
    public final void synpred121_Haxe_fragment() throws RecognitionException {   
        // Haxe.g:384:9: ( enumDecl )
        // Haxe.g:384:9: enumDecl
        {
        pushFollow(FOLLOW_enumDecl_in_synpred121_Haxe3535);
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
            return "201:1: type : ( ( anonType | dotIdent | primitiveType ) ( typeParam )* | );";
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
            return "()* loopback of 201:53: ( typeParam )*";
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
            return "212:1: typeParamOpt : ( typeParam -> ^( TYPE_PARAM_OPT[\"TYPE_PARAM_OPT\",true] ( typeParam )? ) | );";
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
            return "226:1: statement : ( block | assignExpr SEMI | varDecl | IF parExpression st1= statement ( ELSE st2= statement )? -> ^( IF parExpression $st1 ( ^( ELSE $st2) )? ) | FOR LPAREN exp1= expr IN exp2= expr RPAREN statement -> ^( FOR ^( IN $exp1 $exp2) ( statement )? ) | WHILE parExpression statement -> ^( WHILE ( parExpression )? ( statement )? ) | DO statement WHILE parExpression SEMI -> ^( DO ( parExpression )? ( statement )? ) | TRY block catchStmtList -> ^( TRY ( block )? ( catchStmtList )? ) | SWITCH LPAREN expr RPAREN LBRACE ( caseStmt )+ RBRACE -> ^( SWITCH ( expr )? ( caseStmt )+ ) | RETURN ( expr )? SEMI -> ^( RETURN ( expr )? ) | THROW expr SEMI -> ^( THROW ( expr )? ) | BREAK ( IDENTIFIER )? SEMI -> ^( BREAK ( IDENTIFIER )? ) | CONTINUE ( IDENTIFIER )? SEMI -> ^( CONTINUE ( IDENTIFIER )? ) | expr SEMI | IDENTIFIER COLON statement -> ^( COLON ( IDENTIFIER )? ( statement )? ) | SEMI );";
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
            return "253:1: blockStmt : ( varDecl | classDecl | statement );";
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
            return "344:1: suffixExpr : ( value methodCallOrSliceList -> ^( SUFFIX_EXPR[\"CallOrSlice\",true] ( value )? ( methodCallOrSliceList )? ) | value PLUSPLUS -> ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] ( value )? ( PLUSPLUS )? ) | value SUBSUB -> ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] ( value )? SUBSUB ) | value typeParamOpt );";
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
            return "366:17: ( expr | statement )";
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
            return "434:1: funcDecl : ( ( declAttrList )? FUNCTION NEW LPAREN paramList RPAREN typeTagOpt block -> ^( FUNCTION NEW ( declAttrList )? ( paramList )? ( typeTagOpt )? ( block )? ) | ( declAttrList )? FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt block -> ^( FUNCTION IDENTIFIER ( declAttrList )? ( paramList )? ( typeTagOpt )? ( block )? ( typeParamOpt )? ) );";
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
            return "440:1: funcProtoDecl : ( declAttrList FUNCTION NEW LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTagOpt )? ( declAttrList )? ) | declAttrList FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTagOpt )? ( declAttrList )? ( typeParamOpt )? ) | FUNCTION NEW LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTagOpt )? ) | FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTagOpt )? ( typeParamOpt )? ) );";
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
            return "460:1: classMember : ( varDecl | funcDecl | enumDecl );";
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
            return "471:1: interfaceBody : ( varDecl interfaceBody | funcProtoDecl interfaceBody | );";
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
    public static final BitSet FOLLOW_dotIdent_in_dotIdent718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_dotIdent745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQ_in_assignOp777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUSEQ_in_assignOp803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUBEQ_in_assignOp826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SLASHEQ_in_assignOp848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PERCENTEQ_in_assignOp870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AMPEQ_in_assignOp892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_in_funcLit921 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_LPAREN_in_funcLit923 = new BitSet(new long[]{0x0000000800600000L});
    public static final BitSet FOLLOW_paramList_in_funcLit925 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_RPAREN_in_funcLit927 = new BitSet(new long[]{0x0000000000840000L,0x0000000000000001L});
    public static final BitSet FOLLOW_typeTagOpt_in_funcLit929 = new BitSet(new long[]{0x0000000000840000L,0x0000000000000001L});
    public static final BitSet FOLLOW_block_in_funcLit932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACKET_in_arrayLit969 = new BitSet(new long[]{0x0080381000500000L,0x00003F827C600201L});
    public static final BitSet FOLLOW_exprListOpt_in_arrayLit972 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_RBRACKET_in_arrayLit974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_in_typeTag1006 = new BitSet(new long[]{0x0007C01100400000L,0x0000000000000001L});
    public static final BitSet FOLLOW_funcType_in_typeTag1009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeTag_in_typeTagOpt1037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_typeList1080 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_COMMA_in_typeList1083 = new BitSet(new long[]{0x0007801500400000L,0x0000000000000001L});
    public static final BitSet FOLLOW_type_in_typeList1086 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_typeConstraint_in_typeList1103 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_COMMA_in_typeList1106 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_typeConstraint_in_typeList1109 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_type_in_funcType1134 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_MINUS_BIGGER_in_funcType1138 = new BitSet(new long[]{0x0007C01100400000L,0x0000000000000001L});
    public static final BitSet FOLLOW_type_in_funcType1141 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_VOID_in_funcType1154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_primitiveType0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_anonType_in_type1214 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_dotIdent_in_type1218 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_primitiveType_in_type1222 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_typeParam_in_type1227 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_LT_in_typeParam1271 = new BitSet(new long[]{0x0007801500400000L,0x0000000000000001L});
    public static final BitSet FOLLOW_typeList_in_typeParam1274 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_GT_in_typeParam1276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_in_typeParam1288 = new BitSet(new long[]{0x0007801500400000L,0x0000000000000001L});
    public static final BitSet FOLLOW_typeList_in_typeParam1291 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_LT_in_typeParam1293 = new BitSet(new long[]{0x0007801500400000L,0x0000000000000001L});
    public static final BitSet FOLLOW_typeList_in_typeParam1296 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_GTGT_in_typeParam1298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_in_typeParam1310 = new BitSet(new long[]{0x0007801500400000L,0x0000000000000001L});
    public static final BitSet FOLLOW_typeList_in_typeParam1313 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_LT_in_typeParam1315 = new BitSet(new long[]{0x0007801500400000L,0x0000000000000001L});
    public static final BitSet FOLLOW_typeList_in_typeParam1318 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_LT_in_typeParam1320 = new BitSet(new long[]{0x0007801500400000L,0x0000000000000001L});
    public static final BitSet FOLLOW_typeList_in_typeParam1323 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_GTGTGT_in_typeParam1325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeParam_in_typeParamOpt1357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_typeConstraint1406 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_COLON_in_typeConstraint1408 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_LPAREN_in_typeConstraint1410 = new BitSet(new long[]{0x0007801500400000L,0x0000000000000001L});
    public static final BitSet FOLLOW_typeList_in_typeConstraint1412 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_RPAREN_in_typeConstraint1414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttrList_in_functionReturn1452 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_FUNCTION_in_functionReturn1455 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_NEW_in_functionReturn1457 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_LPAREN_in_functionReturn1459 = new BitSet(new long[]{0x0000000800600000L});
    public static final BitSet FOLLOW_paramList_in_functionReturn1461 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_RPAREN_in_functionReturn1463 = new BitSet(new long[]{0x0000000000840000L,0x0000000000000001L});
    public static final BitSet FOLLOW_typeTagOpt_in_functionReturn1465 = new BitSet(new long[]{0x0000000000840000L,0x0000000000000001L});
    public static final BitSet FOLLOW_block_in_functionReturn1467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_statement1516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignExpr_in_statement1527 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_SEMI_in_statement1529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDecl_in_statement1541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_statement1552 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_parExpression_in_statement1554 = new BitSet(new long[]{0xF5801813E2D40000L,0x00003F837C60023DL});
    public static final BitSet FOLLOW_statement_in_statement1558 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_ELSE_in_statement1561 = new BitSet(new long[]{0xF5801813E2D40000L,0x00003F837C60023DL});
    public static final BitSet FOLLOW_statement_in_statement1565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_statement1614 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_LPAREN_in_statement1616 = new BitSet(new long[]{0x0080181000500000L,0x00003F827C600201L});
    public static final BitSet FOLLOW_expr_in_statement1620 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_IN_in_statement1622 = new BitSet(new long[]{0x0080181000500000L,0x00003F827C600201L});
    public static final BitSet FOLLOW_expr_in_statement1626 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_RPAREN_in_statement1628 = new BitSet(new long[]{0xF5801813E2D40000L,0x00003F837C60023DL});
    public static final BitSet FOLLOW_statement_in_statement1630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_statement1667 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_parExpression_in_statement1669 = new BitSet(new long[]{0xF5801813E2D40000L,0x00003F837C60023DL});
    public static final BitSet FOLLOW_statement_in_statement1671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DO_in_statement1713 = new BitSet(new long[]{0xF5801813E2D40000L,0x00003F837C60023DL});
    public static final BitSet FOLLOW_statement_in_statement1715 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_WHILE_in_statement1717 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_parExpression_in_statement1719 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_SEMI_in_statement1721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRY_in_statement1759 = new BitSet(new long[]{0x0000000000840000L,0x0000000000000001L});
    public static final BitSet FOLLOW_block_in_statement1761 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_catchStmtList_in_statement1763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SWITCH_in_statement1805 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_LPAREN_in_statement1807 = new BitSet(new long[]{0x0080181000500000L,0x00003F827C600201L});
    public static final BitSet FOLLOW_expr_in_statement1809 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_RPAREN_in_statement1811 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_LBRACE_in_statement1813 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_caseStmt_in_statement1815 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000C2L});
    public static final BitSet FOLLOW_RBRACE_in_statement1818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_statement1848 = new BitSet(new long[]{0x0080181000540000L,0x00003F827C600201L});
    public static final BitSet FOLLOW_expr_in_statement1851 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_SEMI_in_statement1855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THROW_in_statement1894 = new BitSet(new long[]{0x0080181000500000L,0x00003F827C600201L});
    public static final BitSet FOLLOW_expr_in_statement1896 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_SEMI_in_statement1898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BREAK_in_statement1938 = new BitSet(new long[]{0x0000000000440000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_statement1941 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_SEMI_in_statement1945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONTINUE_in_statement1980 = new BitSet(new long[]{0x0000000000440000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_statement1983 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_SEMI_in_statement1987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_statement2023 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_SEMI_in_statement2026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_statement2038 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_COLON_in_statement2040 = new BitSet(new long[]{0xF5801813E2D40000L,0x00003F837C60023DL});
    public static final BitSet FOLLOW_statement_in_statement2042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMI_in_statement2081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_parExpression2105 = new BitSet(new long[]{0x0080181000500000L,0x00003F827C600201L});
    public static final BitSet FOLLOW_expr_in_parExpression2108 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_RPAREN_in_parExpression2110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_block2129 = new BitSet(new long[]{0xF5801813E3DC0000L,0x00003F877C60023FL});
    public static final BitSet FOLLOW_blockStmt_in_block2132 = new BitSet(new long[]{0xF5801813E3DC0000L,0x00003F877C60023FL});
    public static final BitSet FOLLOW_RBRACE_in_block2136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMI_in_block2171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDecl_in_blockStmt2200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classDecl_in_blockStmt2211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_blockStmt2222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BREAK_in_breakStmt2246 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_SEMI_in_breakStmt2248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONTINUE_in_continueStmt2273 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_SEMI_in_continueStmt2275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CASE_in_caseStmt2300 = new BitSet(new long[]{0x0080181000500000L,0x00003F827C600201L});
    public static final BitSet FOLLOW_exprList_in_caseStmt2302 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_COLON_in_caseStmt2304 = new BitSet(new long[]{0xF5801813E2D40000L,0x00003F837C60023DL});
    public static final BitSet FOLLOW_statement_in_caseStmt2306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_caseStmt2330 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_COLON_in_caseStmt2332 = new BitSet(new long[]{0xF5801813E2D40000L,0x00003F837C60023DL});
    public static final BitSet FOLLOW_statement_in_caseStmt2334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_defaultStmt2374 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_COLON_in_defaultStmt2376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_catchStmt_in_catchStmtList2398 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_catchStmtList_in_catchStmtList2400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CATCH_in_catchStmt2430 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_LPAREN_in_catchStmt2432 = new BitSet(new long[]{0x0000000800400000L});
    public static final BitSet FOLLOW_param_in_catchStmt2434 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_RPAREN_in_catchStmt2436 = new BitSet(new long[]{0x0000000000840000L,0x0000000000000001L});
    public static final BitSet FOLLOW_block_in_catchStmt2438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprList_in_exprListOpt2476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_exprList2506 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_COMMA_in_exprList2509 = new BitSet(new long[]{0x0080181000500000L,0x00003F827C600201L});
    public static final BitSet FOLLOW_expr_in_exprList2512 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_assignExpr_in_expr2538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNTYPED_in_expr2549 = new BitSet(new long[]{0x0080181000500000L,0x00003F827C600001L});
    public static final BitSet FOLLOW_assignExpr_in_expr2551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iterExpr_in_assignExpr2583 = new BitSet(new long[]{0x000007E000000002L});
    public static final BitSet FOLLOW_assignOp_in_assignExpr2586 = new BitSet(new long[]{0x0080181000500000L,0x00003F827C600001L});
    public static final BitSet FOLLOW_iterExpr_in_assignExpr2589 = new BitSet(new long[]{0x000007E000000002L});
    public static final BitSet FOLLOW_ternaryExpr_in_iterExpr2612 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_ELLIPSIS_in_iterExpr2615 = new BitSet(new long[]{0x0080181000500000L,0x00003F827C600001L});
    public static final BitSet FOLLOW_ternaryExpr_in_iterExpr2618 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_logicOrExpr_in_ternaryExpr2640 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_QUES_in_ternaryExpr2643 = new BitSet(new long[]{0x0080181000500000L,0x00003F827C600201L});
    public static final BitSet FOLLOW_expr_in_ternaryExpr2646 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_COLON_in_ternaryExpr2648 = new BitSet(new long[]{0x0080181000500000L,0x00003F827C600001L});
    public static final BitSet FOLLOW_logicOrExpr_in_ternaryExpr2651 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_logicAndExpr_in_logicOrExpr2673 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_BARBAR_in_logicOrExpr2676 = new BitSet(new long[]{0x0080181000500000L,0x00003F827C600001L});
    public static final BitSet FOLLOW_logicAndExpr_in_logicOrExpr2679 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_cmpExpr_in_logicAndExpr2706 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_AMPAMP_in_logicAndExpr2710 = new BitSet(new long[]{0x0080181000500000L,0x00003F827C600001L});
    public static final BitSet FOLLOW_cmpExpr_in_logicAndExpr2713 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_bitExpr_in_cmpExpr2736 = new BitSet(new long[]{0x0018000000000002L,0x000000000001E000L});
    public static final BitSet FOLLOW_EQEQ_in_cmpExpr2741 = new BitSet(new long[]{0x0080181000500000L,0x00003F827C600001L});
    public static final BitSet FOLLOW_BANGEQ_in_cmpExpr2745 = new BitSet(new long[]{0x0080181000500000L,0x00003F827C600001L});
    public static final BitSet FOLLOW_GTEQ_in_cmpExpr2750 = new BitSet(new long[]{0x0080181000500000L,0x00003F827C600001L});
    public static final BitSet FOLLOW_LTEQ_in_cmpExpr2755 = new BitSet(new long[]{0x0080181000500000L,0x00003F827C600001L});
    public static final BitSet FOLLOW_GT_in_cmpExpr2760 = new BitSet(new long[]{0x0080181000500000L,0x00003F827C600001L});
    public static final BitSet FOLLOW_LT_in_cmpExpr2765 = new BitSet(new long[]{0x0080181000500000L,0x00003F827C600001L});
    public static final BitSet FOLLOW_bitExpr_in_cmpExpr2770 = new BitSet(new long[]{0x0018000000000002L,0x000000000001E000L});
    public static final BitSet FOLLOW_shiftExpr_in_bitExpr2793 = new BitSet(new long[]{0x0000000000000002L,0x00000000000E0000L});
    public static final BitSet FOLLOW_BAR_in_bitExpr2797 = new BitSet(new long[]{0x0080181000500000L,0x00003F827C600001L});
    public static final BitSet FOLLOW_shiftExpr_in_bitExpr2800 = new BitSet(new long[]{0x0000000000000002L,0x00000000000E0000L});
    public static final BitSet FOLLOW_AMP_in_bitExpr2804 = new BitSet(new long[]{0x0080181000500000L,0x00003F827C600001L});
    public static final BitSet FOLLOW_shiftExpr_in_bitExpr2807 = new BitSet(new long[]{0x0000000000000002L,0x00000000000E0000L});
    public static final BitSet FOLLOW_CARET_in_bitExpr2810 = new BitSet(new long[]{0x0080181000500000L,0x00003F827C600001L});
    public static final BitSet FOLLOW_shiftExpr_in_bitExpr2813 = new BitSet(new long[]{0x0000000000000002L,0x00000000000E0000L});
    public static final BitSet FOLLOW_addExpr_in_shiftExpr2840 = new BitSet(new long[]{0x0050000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_LTLT_in_shiftExpr2844 = new BitSet(new long[]{0x0080181000500000L,0x00003F827C600001L});
    public static final BitSet FOLLOW_addExpr_in_shiftExpr2848 = new BitSet(new long[]{0x0050000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_GT_in_shiftExpr2853 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_GT_in_shiftExpr2855 = new BitSet(new long[]{0x0080181000500000L,0x00003F827C600001L});
    public static final BitSet FOLLOW_addExpr_in_shiftExpr2860 = new BitSet(new long[]{0x0050000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_GTGTGT_in_shiftExpr2864 = new BitSet(new long[]{0x0080181000500000L,0x00003F827C600001L});
    public static final BitSet FOLLOW_addExpr_in_shiftExpr2867 = new BitSet(new long[]{0x0050000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_multExpr_in_addExpr2887 = new BitSet(new long[]{0x0000000000000002L,0x0000000000600000L});
    public static final BitSet FOLLOW_PLUS_in_addExpr2892 = new BitSet(new long[]{0x0080181000500000L,0x00003F827C600001L});
    public static final BitSet FOLLOW_SUB_in_addExpr2897 = new BitSet(new long[]{0x0080181000500000L,0x00003F827C600001L});
    public static final BitSet FOLLOW_multExpr_in_addExpr2901 = new BitSet(new long[]{0x0000000000000002L,0x0000000000600000L});
    public static final BitSet FOLLOW_prefixExpr_in_multExpr2928 = new BitSet(new long[]{0x0000000000000002L,0x0000000003800000L});
    public static final BitSet FOLLOW_STAR_in_multExpr2933 = new BitSet(new long[]{0x0080181000500000L,0x00003F827C600001L});
    public static final BitSet FOLLOW_SLASH_in_multExpr2936 = new BitSet(new long[]{0x0080181000500000L,0x00003F827C600001L});
    public static final BitSet FOLLOW_PERCENT_in_multExpr2939 = new BitSet(new long[]{0x0080181000500000L,0x00003F827C600001L});
    public static final BitSet FOLLOW_prefixExpr_in_multExpr2943 = new BitSet(new long[]{0x0000000000000002L,0x0000000003800000L});
    public static final BitSet FOLLOW_set_in_prefixExpr2973 = new BitSet(new long[]{0x0080181000500000L,0x00003F827C600001L});
    public static final BitSet FOLLOW_prefixExpr_in_prefixExpr2988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_newExpr_in_prefixExpr2999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cast_in_prefixExpr3010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_suffixExpr_in_prefixExpr3021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_suffixExpr3045 = new BitSet(new long[]{0x0000100000100000L});
    public static final BitSet FOLLOW_methodCallOrSliceList_in_suffixExpr3047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_suffixExpr3074 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_PLUSPLUS_in_suffixExpr3076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_suffixExpr3115 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_SUBSUB_in_suffixExpr3117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_suffixExpr3155 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_typeParamOpt_in_suffixExpr3157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_methodCallOrSlice3177 = new BitSet(new long[]{0x0080181000700000L,0x00003F827C600201L});
    public static final BitSet FOLLOW_exprListOpt_in_methodCallOrSlice3179 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_RPAREN_in_methodCallOrSlice3181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACKET_in_methodCallOrSlice3205 = new BitSet(new long[]{0x0080181000500000L,0x00003F827C600201L});
    public static final BitSet FOLLOW_expr_in_methodCallOrSlice3207 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_RBRACKET_in_methodCallOrSlice3209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_methodCallOrSlice_in_methodCallOrSliceList3242 = new BitSet(new long[]{0x0000100000100000L});
    public static final BitSet FOLLOW_methodCallOrSliceList_in_methodCallOrSliceList3244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_methodCallOrSlice_in_methodCallOrSliceList3255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcLit_in_value3274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayLit_in_value3285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objLit_in_value3295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_elementarySymbol_in_value3305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_value3315 = new BitSet(new long[]{0xF5801813E2D40000L,0x00003F837C60023DL});
    public static final BitSet FOLLOW_expr_in_value3319 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_statement_in_value3321 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_RPAREN_in_value3324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dotIdent_in_value3335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEW_in_newExpr3365 = new BitSet(new long[]{0x0007801100500000L,0x0000000000000001L});
    public static final BitSet FOLLOW_type_in_newExpr3367 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_LPAREN_in_newExpr3369 = new BitSet(new long[]{0x0080181000700000L,0x00003F827C600201L});
    public static final BitSet FOLLOW_exprListOpt_in_newExpr3371 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_RPAREN_in_newExpr3373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CAST_in_cast3403 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_LPAREN_in_cast3405 = new BitSet(new long[]{0x0080181000500000L,0x00003F827C600201L});
    public static final BitSet FOLLOW_expr_in_cast3407 = new BitSet(new long[]{0x0000000400200000L});
    public static final BitSet FOLLOW_COMMA_in_cast3410 = new BitSet(new long[]{0x0007C01100400000L,0x0000000000000001L});
    public static final BitSet FOLLOW_funcType_in_cast3412 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_RPAREN_in_cast3416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CAST_in_cast3444 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_LPAREN_in_cast3446 = new BitSet(new long[]{0x0080181000500000L,0x00003F827C600201L});
    public static final BitSet FOLLOW_expr_in_cast3448 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_RPAREN_in_cast3450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classDecl_in_topLevelDecl3515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interfaceDecl_in_topLevelDecl3525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumDecl_in_topLevelDecl3535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typedefDecl_in_topLevelDecl3545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeDeclFlags_in_enumDecl3563 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_ENUM_in_enumDecl3565 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_enumDecl3567 = new BitSet(new long[]{0x0008000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_typeParamOpt_in_enumDecl3569 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_LBRACE_in_enumDecl3571 = new BitSet(new long[]{0x0000000000400000L,0x0000000000000002L});
    public static final BitSet FOLLOW_enumBody_in_enumDecl3573 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_RBRACE_in_enumDecl3575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumValueDecl_in_enumBody3609 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_enumValueDecl3639 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_LPAREN_in_enumValueDecl3641 = new BitSet(new long[]{0x0000000800600000L});
    public static final BitSet FOLLOW_paramList_in_enumValueDecl3643 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_RPAREN_in_enumValueDecl3645 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_SEMI_in_enumValueDecl3647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_enumValueDecl3681 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_SEMI_in_enumValueDecl3683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDecl_in_varDeclList3743 = new BitSet(new long[]{0x00000003E2000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_varDeclList_in_varDeclList3745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttrList_in_varDecl3761 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_VAR_in_varDecl3765 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_varDeclPartList_in_varDecl3767 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_SEMI_in_varDecl3769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDeclPart_in_varDeclPartList3815 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_COMMA_in_varDeclPartList3818 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_varDeclPart_in_varDeclPartList3821 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_varDeclPart3842 = new BitSet(new long[]{0x0000002000900000L});
    public static final BitSet FOLLOW_propDeclOpt_in_varDeclPart3847 = new BitSet(new long[]{0x0000002000800000L});
    public static final BitSet FOLLOW_typeTagOpt_in_varDeclPart3849 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_varInit_in_varDeclPart3851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_propDecl3865 = new BitSet(new long[]{0x0000000100400000L,0x0000000200000080L});
    public static final BitSet FOLLOW_propAccessor_in_propDecl3869 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_COMMA_in_propDecl3871 = new BitSet(new long[]{0x0000000100400000L,0x0000000200000080L});
    public static final BitSet FOLLOW_propAccessor_in_propDecl3875 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_RPAREN_in_propDecl3877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_propAccessor0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_propDecl_in_propDeclOpt3997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQ_in_varInit4022 = new BitSet(new long[]{0x0080181000500000L,0x00003F827C600201L});
    public static final BitSet FOLLOW_expr_in_varInit4024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttrList_in_funcDecl4072 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_FUNCTION_in_funcDecl4075 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_NEW_in_funcDecl4077 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_LPAREN_in_funcDecl4079 = new BitSet(new long[]{0x0000000800600000L});
    public static final BitSet FOLLOW_paramList_in_funcDecl4081 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_RPAREN_in_funcDecl4083 = new BitSet(new long[]{0x0000000000840000L,0x0000000000000001L});
    public static final BitSet FOLLOW_typeTagOpt_in_funcDecl4085 = new BitSet(new long[]{0x0000000000840000L,0x0000000000000001L});
    public static final BitSet FOLLOW_block_in_funcDecl4087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttrList_in_funcDecl4142 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_FUNCTION_in_funcDecl4145 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_funcDecl4147 = new BitSet(new long[]{0x0008000000100000L});
    public static final BitSet FOLLOW_typeParamOpt_in_funcDecl4149 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_LPAREN_in_funcDecl4151 = new BitSet(new long[]{0x0000000800600000L});
    public static final BitSet FOLLOW_paramList_in_funcDecl4153 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_RPAREN_in_funcDecl4155 = new BitSet(new long[]{0x0000000000840000L,0x0000000000000001L});
    public static final BitSet FOLLOW_typeTagOpt_in_funcDecl4157 = new BitSet(new long[]{0x0000000000840000L,0x0000000000000001L});
    public static final BitSet FOLLOW_block_in_funcDecl4159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttrList_in_funcProtoDecl4229 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_FUNCTION_in_funcProtoDecl4231 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_NEW_in_funcProtoDecl4233 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_LPAREN_in_funcProtoDecl4235 = new BitSet(new long[]{0x0000000800600000L});
    public static final BitSet FOLLOW_paramList_in_funcProtoDecl4237 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_RPAREN_in_funcProtoDecl4239 = new BitSet(new long[]{0x0000000000840000L});
    public static final BitSet FOLLOW_typeTagOpt_in_funcProtoDecl4241 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_SEMI_in_funcProtoDecl4243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttrList_in_funcProtoDecl4284 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_FUNCTION_in_funcProtoDecl4286 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_funcProtoDecl4288 = new BitSet(new long[]{0x0008000000100000L});
    public static final BitSet FOLLOW_typeParamOpt_in_funcProtoDecl4290 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_LPAREN_in_funcProtoDecl4292 = new BitSet(new long[]{0x0000000800600000L});
    public static final BitSet FOLLOW_paramList_in_funcProtoDecl4294 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_RPAREN_in_funcProtoDecl4296 = new BitSet(new long[]{0x0000000000840000L});
    public static final BitSet FOLLOW_typeTagOpt_in_funcProtoDecl4298 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_SEMI_in_funcProtoDecl4300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_in_funcProtoDecl4344 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_NEW_in_funcProtoDecl4346 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_LPAREN_in_funcProtoDecl4348 = new BitSet(new long[]{0x0000000800600000L});
    public static final BitSet FOLLOW_paramList_in_funcProtoDecl4350 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_RPAREN_in_funcProtoDecl4352 = new BitSet(new long[]{0x0000000000840000L});
    public static final BitSet FOLLOW_typeTagOpt_in_funcProtoDecl4354 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_SEMI_in_funcProtoDecl4356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_in_funcProtoDecl4394 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_funcProtoDecl4396 = new BitSet(new long[]{0x0008000000100000L});
    public static final BitSet FOLLOW_typeParamOpt_in_funcProtoDecl4398 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_LPAREN_in_funcProtoDecl4400 = new BitSet(new long[]{0x0000000800600000L});
    public static final BitSet FOLLOW_paramList_in_funcProtoDecl4402 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_RPAREN_in_funcProtoDecl4404 = new BitSet(new long[]{0x0000000000840000L});
    public static final BitSet FOLLOW_typeTagOpt_in_funcProtoDecl4406 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_SEMI_in_funcProtoDecl4408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeDeclFlags_in_classDecl4462 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_CLASS_in_classDecl4464 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_classDecl4466 = new BitSet(new long[]{0x0008000000000000L,0x0000003000000001L});
    public static final BitSet FOLLOW_typeParamOpt_in_classDecl4468 = new BitSet(new long[]{0x0008000000000000L,0x0000003000000001L});
    public static final BitSet FOLLOW_inheritListOpt_in_classDecl4470 = new BitSet(new long[]{0x0008000000000000L,0x0000003000000001L});
    public static final BitSet FOLLOW_classBodyScope_in_classDecl4472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_classBodyScope4530 = new BitSet(new long[]{0x00000803E3080000L,0x0000000180000002L});
    public static final BitSet FOLLOW_classMember_in_classBodyScope4533 = new BitSet(new long[]{0x00000803E3080000L,0x0000000180000002L});
    public static final BitSet FOLLOW_RBRACE_in_classBodyScope4537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDecl_in_classMember4575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcDecl_in_classMember4586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumDecl_in_classMember4598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeDeclFlags_in_interfaceDecl4627 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_INTERFACE_in_interfaceDecl4629 = new BitSet(new long[]{0x0007801100400000L,0x0000003000000001L});
    public static final BitSet FOLLOW_type_in_interfaceDecl4631 = new BitSet(new long[]{0x0000000000000000L,0x0000003000000001L});
    public static final BitSet FOLLOW_inheritListOpt_in_interfaceDecl4633 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_LBRACE_in_interfaceDecl4635 = new BitSet(new long[]{0x00000803E2000000L,0x0000000100000002L});
    public static final BitSet FOLLOW_interfaceBody_in_interfaceDecl4638 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_RBRACE_in_interfaceDecl4640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDecl_in_interfaceBody4664 = new BitSet(new long[]{0x00000803E2000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_interfaceBody_in_interfaceBody4666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcProtoDecl_in_interfaceBody4676 = new BitSet(new long[]{0x00000803E2000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_interfaceBody_in_interfaceBody4678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inherit_in_inheritList4712 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_COMMA_in_inheritList4715 = new BitSet(new long[]{0x0000000000000000L,0x0000003000000000L});
    public static final BitSet FOLLOW_inherit_in_inheritList4718 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_inheritList_in_inheritListOpt4748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXTENDS_in_inherit4794 = new BitSet(new long[]{0x0007801100400000L,0x0000000000000001L});
    public static final BitSet FOLLOW_type_in_inherit4796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IMPLEMENTS_in_inherit4824 = new BitSet(new long[]{0x0007801100400000L,0x0000000000000001L});
    public static final BitSet FOLLOW_type_in_inherit4826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPEDEF_in_typedefDecl4866 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_typedefDecl4868 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_EQ_in_typedefDecl4870 = new BitSet(new long[]{0x0007C01100400000L,0x0000000000000001L});
    public static final BitSet FOLLOW_funcType_in_typedefDecl4872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GT_in_typeExtend4896 = new BitSet(new long[]{0x0007C01100400000L,0x0000000000000001L});
    public static final BitSet FOLLOW_funcType_in_typeExtend4898 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_COMMA_in_typeExtend4900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_anonType4924 = new BitSet(new long[]{0x00100003E2400000L,0x0000000100000002L});
    public static final BitSet FOLLOW_anonTypeFieldList_in_anonType4958 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_varDeclList_in_anonType4977 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_typeExtend_in_anonType4996 = new BitSet(new long[]{0x00000003E2400000L,0x0000000100000002L});
    public static final BitSet FOLLOW_anonTypeFieldList_in_anonType5028 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_varDeclList_in_anonType5058 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_RBRACE_in_anonType5085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_anonTypeField_in_anonTypeFieldList5111 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_COMMA_in_anonTypeFieldList5114 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_anonTypeField_in_anonTypeFieldList5117 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_LBRACE_in_objLit5133 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_objLitElemList_in_objLit5136 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_RBRACE_in_objLit5138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_anonTypeField5163 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_COLON_in_anonTypeField5165 = new BitSet(new long[]{0x0007C01100400000L,0x0000000000000001L});
    public static final BitSet FOLLOW_funcType_in_anonTypeField5168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objLitElem_in_objLitElemList5196 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_COMMA_in_objLitElemList5199 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_objLitElem_in_objLitElemList5202 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_objLitElem5228 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_COLON_in_objLitElem5230 = new BitSet(new long[]{0x0080181000500000L,0x00003F827C600201L});
    public static final BitSet FOLLOW_expr_in_objLitElem5233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LONGLITERAL_in_elementarySymbol5256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_elementarySymbol5277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTLITERAL_in_elementarySymbol5297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRINGLITERAL_in_elementarySymbol5318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARLITERAL_in_elementarySymbol5339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOATNUM_in_elementarySymbol5360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_elementarySymbol5381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_elementarySymbol5406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeTagOpt_in_synpred28_Haxe929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_synpred34_Haxe1134 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_MINUS_BIGGER_in_synpred34_Haxe1138 = new BitSet(new long[]{0x0007C01100400000L,0x0000000000000001L});
    public static final BitSet FOLLOW_type_in_synpred34_Haxe1141 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_typeParam_in_synpred41_Haxe1227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_anonType_in_synpred42_Haxe1214 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_dotIdent_in_synpred42_Haxe1218 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_primitiveType_in_synpred42_Haxe1222 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_typeParam_in_synpred42_Haxe1227 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_LT_in_synpred43_Haxe1271 = new BitSet(new long[]{0x0007801500400000L,0x0000000000000001L});
    public static final BitSet FOLLOW_typeList_in_synpred43_Haxe1274 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_GT_in_synpred43_Haxe1276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_in_synpred44_Haxe1288 = new BitSet(new long[]{0x0007801500400000L,0x0000000000000001L});
    public static final BitSet FOLLOW_typeList_in_synpred44_Haxe1291 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_LT_in_synpred44_Haxe1293 = new BitSet(new long[]{0x0007801500400000L,0x0000000000000001L});
    public static final BitSet FOLLOW_typeList_in_synpred44_Haxe1296 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_GTGT_in_synpred44_Haxe1298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeParam_in_synpred45_Haxe1357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_synpred47_Haxe1516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignExpr_in_synpred48_Haxe1527 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_SEMI_in_synpred48_Haxe1529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_synpred50_Haxe1561 = new BitSet(new long[]{0xF5801813E2D40000L,0x00003F837C60023DL});
    public static final BitSet FOLLOW_statement_in_synpred50_Haxe1565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_synpred65_Haxe2023 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_SEMI_in_synpred65_Haxe2026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_synpred66_Haxe2038 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_COLON_in_synpred66_Haxe2040 = new BitSet(new long[]{0xF5801813E2D40000L,0x00003F837C60023DL});
    public static final BitSet FOLLOW_statement_in_synpred66_Haxe2042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDecl_in_synpred69_Haxe2200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classDecl_in_synpred70_Haxe2211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_synpred106_Haxe3045 = new BitSet(new long[]{0x0000100000100000L});
    public static final BitSet FOLLOW_methodCallOrSliceList_in_synpred106_Haxe3047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_synpred107_Haxe3074 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_PLUSPLUS_in_synpred107_Haxe3076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_synpred108_Haxe3115 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_SUBSUB_in_synpred108_Haxe3117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_methodCallOrSlice_in_synpred110_Haxe3242 = new BitSet(new long[]{0x0000100000100000L});
    public static final BitSet FOLLOW_methodCallOrSliceList_in_synpred110_Haxe3244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_synpred115_Haxe3319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CAST_in_synpred118_Haxe3403 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_LPAREN_in_synpred118_Haxe3405 = new BitSet(new long[]{0x0080181000500000L,0x00003F827C600201L});
    public static final BitSet FOLLOW_expr_in_synpred118_Haxe3407 = new BitSet(new long[]{0x0000000400200000L});
    public static final BitSet FOLLOW_COMMA_in_synpred118_Haxe3410 = new BitSet(new long[]{0x0007C01100400000L,0x0000000000000001L});
    public static final BitSet FOLLOW_funcType_in_synpred118_Haxe3412 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_RPAREN_in_synpred118_Haxe3416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classDecl_in_synpred119_Haxe3515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interfaceDecl_in_synpred120_Haxe3525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumDecl_in_synpred121_Haxe3535 = new BitSet(new long[]{0x0000000000000002L});

}