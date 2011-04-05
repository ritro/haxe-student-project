// $ANTLR 3.3 Nov 30, 2010 12:50:56 Haxe.g 2011-04-05 14:11:39

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "PROPERTY_DECL", "MODULE", "SUFFIX_EXPR", "BLOCK_SCOPE", "PARAM_LIST", "TYPE_TAG", "TYPE_PARAM_OPT", "INHERIT_LIST_OPT", "DECL_ATTR_LIST", "VAR_INIT", "IDENT", "ASSIGN_OPERATOR", "PACKAGE", "SEMI", "MONKEYS_AT", "LPAREN", "RPAREN", "IDENTIFIER", "COLON", "EXTERN", "PRIVATE", "DOT", "IMPORT", "USING", "PUBLIC", "STATIC", "INLINE", "DYNAMIC", "OVERRIDE", "COMMA", "QUES", "THIS", "EQ", "PLUSEQ", "SUBEQ", "SLASHEQ", "PERCENTEQ", "AMPEQ", "FUNCTION", "LBRACKET", "RBRACKET", "MINUS_BIGGER", "VOID", "INT", "FLOAT", "BOOLEAN", "LT", "GT", "GTGT", "GTGTGT", "NEW", "IF", "ELSE", "FOR", "IN", "WHILE", "DO", "TRY", "SWITCH", "LBRACE", "RBRACE", "RETURN", "THROW", "BREAK", "CONTINUE", "CASE", "DEFAULT", "CATCH", "UNTYPED", "ELLIPSIS", "BARBAR", "AMPAMP", "EQEQ", "BANGEQ", "GTEQ", "LTEQ", "BAR", "AMP", "CARET", "LTLT", "PLUS", "SUB", "STAR", "SLASH", "PERCENT", "SUBSUB", "PLUSPLUS", "BANG", "TILDE", "CAST", "ENUM", "VAR", "NULL", "CLASS", "INTERFACE", "EXTENDS", "IMPLEMENTS", "TYPEDEF", "LONGLITERAL", "INTLITERAL", "STRINGLITERAL", "CHARLITERAL", "FLOATNUM", "TRUE", "FALSE", "WS", "IntegerNumber", "LongSuffix", "HexPrefix", "HexDigit", "Exponent", "EscapeSequence", "ABSTRACT", "BYTE", "CHAR", "CONST", "DOUBLE", "FINAL", "FINALLY", "GOTO", "INSTANCEOF", "LONG", "NATIVE", "PROTECTED", "SHORT", "STRICTFP", "SUPER", "THROWS", "TRANSIENT", "VOLATILE", "STAREQ", "BAREQ", "CARETEQ", "PERCENTDLQ", "PERCENTDBQ", "PERCENTDBBQ", "EQEQEQ", "PERCENTLESQ", "BANGEQQ", "PERCENTLL", "PERCENTBB", "PERCENTBBB", "LTLTEQ", "GTGTEQ", "GTGTGTEQ", "INTNUM", "EXPONENT", "COMMENT", "PP_IF", "PP_ELSEIF", "PP_ELSE", "PP_END", "PP_ERROR", "TS", "PP_CONDITIONAL", "PREPROCESSOR_DIRECTIVE", "IF_TOKEN", "ELSE_TOKEN", "ENDIF_TOKEN", "PP_EXPRESSION", "PP_OR_EXPRESSION", "PP_AND_EXPRESSION", "PP_UNARY_EXPRESSION", "PP_PRIMARY_EXPRESSION", "HEX_DIGIT", "UNICODE_ESC", "OCTAL_ESC", "ESC_SEQ"
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
    public static final int IDENT=14;
    public static final int ASSIGN_OPERATOR=15;
    public static final int PACKAGE=16;
    public static final int SEMI=17;
    public static final int MONKEYS_AT=18;
    public static final int LPAREN=19;
    public static final int RPAREN=20;
    public static final int IDENTIFIER=21;
    public static final int COLON=22;
    public static final int EXTERN=23;
    public static final int PRIVATE=24;
    public static final int DOT=25;
    public static final int IMPORT=26;
    public static final int USING=27;
    public static final int PUBLIC=28;
    public static final int STATIC=29;
    public static final int INLINE=30;
    public static final int DYNAMIC=31;
    public static final int OVERRIDE=32;
    public static final int COMMA=33;
    public static final int QUES=34;
    public static final int THIS=35;
    public static final int EQ=36;
    public static final int PLUSEQ=37;
    public static final int SUBEQ=38;
    public static final int SLASHEQ=39;
    public static final int PERCENTEQ=40;
    public static final int AMPEQ=41;
    public static final int FUNCTION=42;
    public static final int LBRACKET=43;
    public static final int RBRACKET=44;
    public static final int MINUS_BIGGER=45;
    public static final int VOID=46;
    public static final int INT=47;
    public static final int FLOAT=48;
    public static final int BOOLEAN=49;
    public static final int LT=50;
    public static final int GT=51;
    public static final int GTGT=52;
    public static final int GTGTGT=53;
    public static final int NEW=54;
    public static final int IF=55;
    public static final int ELSE=56;
    public static final int FOR=57;
    public static final int IN=58;
    public static final int WHILE=59;
    public static final int DO=60;
    public static final int TRY=61;
    public static final int SWITCH=62;
    public static final int LBRACE=63;
    public static final int RBRACE=64;
    public static final int RETURN=65;
    public static final int THROW=66;
    public static final int BREAK=67;
    public static final int CONTINUE=68;
    public static final int CASE=69;
    public static final int DEFAULT=70;
    public static final int CATCH=71;
    public static final int UNTYPED=72;
    public static final int ELLIPSIS=73;
    public static final int BARBAR=74;
    public static final int AMPAMP=75;
    public static final int EQEQ=76;
    public static final int BANGEQ=77;
    public static final int GTEQ=78;
    public static final int LTEQ=79;
    public static final int BAR=80;
    public static final int AMP=81;
    public static final int CARET=82;
    public static final int LTLT=83;
    public static final int PLUS=84;
    public static final int SUB=85;
    public static final int STAR=86;
    public static final int SLASH=87;
    public static final int PERCENT=88;
    public static final int SUBSUB=89;
    public static final int PLUSPLUS=90;
    public static final int BANG=91;
    public static final int TILDE=92;
    public static final int CAST=93;
    public static final int ENUM=94;
    public static final int VAR=95;
    public static final int NULL=96;
    public static final int CLASS=97;
    public static final int INTERFACE=98;
    public static final int EXTENDS=99;
    public static final int IMPLEMENTS=100;
    public static final int TYPEDEF=101;
    public static final int LONGLITERAL=102;
    public static final int INTLITERAL=103;
    public static final int STRINGLITERAL=104;
    public static final int CHARLITERAL=105;
    public static final int FLOATNUM=106;
    public static final int TRUE=107;
    public static final int FALSE=108;
    public static final int WS=109;
    public static final int IntegerNumber=110;
    public static final int LongSuffix=111;
    public static final int HexPrefix=112;
    public static final int HexDigit=113;
    public static final int Exponent=114;
    public static final int EscapeSequence=115;
    public static final int ABSTRACT=116;
    public static final int BYTE=117;
    public static final int CHAR=118;
    public static final int CONST=119;
    public static final int DOUBLE=120;
    public static final int FINAL=121;
    public static final int FINALLY=122;
    public static final int GOTO=123;
    public static final int INSTANCEOF=124;
    public static final int LONG=125;
    public static final int NATIVE=126;
    public static final int PROTECTED=127;
    public static final int SHORT=128;
    public static final int STRICTFP=129;
    public static final int SUPER=130;
    public static final int THROWS=131;
    public static final int TRANSIENT=132;
    public static final int VOLATILE=133;
    public static final int STAREQ=134;
    public static final int BAREQ=135;
    public static final int CARETEQ=136;
    public static final int PERCENTDLQ=137;
    public static final int PERCENTDBQ=138;
    public static final int PERCENTDBBQ=139;
    public static final int EQEQEQ=140;
    public static final int PERCENTLESQ=141;
    public static final int BANGEQQ=142;
    public static final int PERCENTLL=143;
    public static final int PERCENTBB=144;
    public static final int PERCENTBBB=145;
    public static final int LTLTEQ=146;
    public static final int GTGTEQ=147;
    public static final int GTGTGTEQ=148;
    public static final int INTNUM=149;
    public static final int EXPONENT=150;
    public static final int COMMENT=151;
    public static final int PP_IF=152;
    public static final int PP_ELSEIF=153;
    public static final int PP_ELSE=154;
    public static final int PP_END=155;
    public static final int PP_ERROR=156;
    public static final int TS=157;
    public static final int PP_CONDITIONAL=158;
    public static final int PREPROCESSOR_DIRECTIVE=159;
    public static final int IF_TOKEN=160;
    public static final int ELSE_TOKEN=161;
    public static final int ENDIF_TOKEN=162;
    public static final int PP_EXPRESSION=163;
    public static final int PP_OR_EXPRESSION=164;
    public static final int PP_AND_EXPRESSION=165;
    public static final int PP_UNARY_EXPRESSION=166;
    public static final int PP_PRIMARY_EXPRESSION=167;
    public static final int HEX_DIGIT=168;
    public static final int UNICODE_ESC=169;
    public static final int OCTAL_ESC=170;
    public static final int ESC_SEQ=171;

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
    // Haxe.g:61:1: module : ( myPackage )? topLevelList -> ^( MODULE[\"MODULE\",true] ( myPackage )? ( topLevelList )? ) ;
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
            // Haxe.g:62:5: ( ( myPackage )? topLevelList -> ^( MODULE[\"MODULE\",true] ( myPackage )? ( topLevelList )? ) )
            // Haxe.g:62:7: ( myPackage )? topLevelList
            {
            // Haxe.g:62:7: ( myPackage )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==PACKAGE) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // Haxe.g:0:0: myPackage
                    {
                    pushFollow(FOLLOW_myPackage_in_module165);
                    myPackage1=myPackage();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_myPackage.add(myPackage1.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_topLevelList_in_module168);
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
            // 62:31: -> ^( MODULE[\"MODULE\",true] ( myPackage )? ( topLevelList )? )
            {
                // Haxe.g:62:34: ^( MODULE[\"MODULE\",true] ( myPackage )? ( topLevelList )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new HaxeTree(MODULE, "MODULE", true), root_1);

                // Haxe.g:62:68: ( myPackage )?
                if ( stream_myPackage.hasNext() ) {
                    adaptor.addChild(root_1, stream_myPackage.nextTree());

                }
                stream_myPackage.reset();
                // Haxe.g:62:79: ( topLevelList )?
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
    // Haxe.g:65:1: topLevelList : ( topLevel )* ;
    public final HaxeParser.topLevelList_return topLevelList() throws RecognitionException {
        HaxeParser.topLevelList_return retval = new HaxeParser.topLevelList_return();
        retval.start = input.LT(1);
        int topLevelList_StartIndex = input.index();
        Object root_0 = null;

        HaxeParser.topLevel_return topLevel3 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return retval; }
            // Haxe.g:66:5: ( ( topLevel )* )
            // Haxe.g:66:7: ( topLevel )*
            {
            root_0 = (Object)adaptor.nil();

            // Haxe.g:66:7: ( topLevel )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==MONKEYS_AT||(LA2_0>=EXTERN && LA2_0<=PRIVATE)||(LA2_0>=IMPORT && LA2_0<=USING)||LA2_0==ENUM||(LA2_0>=CLASS && LA2_0<=INTERFACE)||LA2_0==TYPEDEF) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // Haxe.g:66:8: topLevel
            	    {
            	    pushFollow(FOLLOW_topLevel_in_topLevelList206);
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
    // Haxe.g:69:1: topLevel : ( myImport | topLevelDecl );
    public final HaxeParser.topLevel_return topLevel() throws RecognitionException {
        HaxeParser.topLevel_return retval = new HaxeParser.topLevel_return();
        retval.start = input.LT(1);
        int topLevel_StartIndex = input.index();
        Object root_0 = null;

        HaxeParser.myImport_return myImport4 = null;

        HaxeParser.topLevelDecl_return topLevelDecl5 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return retval; }
            // Haxe.g:70:5: ( myImport | topLevelDecl )
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
                    // Haxe.g:70:7: myImport
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_myImport_in_topLevel225);
                    myImport4=myImport();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, myImport4.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:72:7: topLevelDecl
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_topLevelDecl_in_topLevel234);
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
    // Haxe.g:75:1: myPackage : PACKAGE dotIdent SEMI -> ^( PACKAGE ( dotIdent )? ) ;
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
            // Haxe.g:76:5: ( PACKAGE dotIdent SEMI -> ^( PACKAGE ( dotIdent )? ) )
            // Haxe.g:76:7: PACKAGE dotIdent SEMI
            {
            PACKAGE6=(Token)match(input,PACKAGE,FOLLOW_PACKAGE_in_myPackage251); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_PACKAGE.add(PACKAGE6);

            pushFollow(FOLLOW_dotIdent_in_myPackage253);
            dotIdent7=dotIdent();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_dotIdent.add(dotIdent7.getTree());
            SEMI8=(Token)match(input,SEMI,FOLLOW_SEMI_in_myPackage255); if (state.failed) return retval; 
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
            // 76:29: -> ^( PACKAGE ( dotIdent )? )
            {
                // Haxe.g:76:32: ^( PACKAGE ( dotIdent )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_PACKAGE.nextNode(), root_1);

                // Haxe.g:76:42: ( dotIdent )?
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
    // Haxe.g:79:1: meta : MONKEYS_AT metaName ( LPAREN paramList RPAREN )? ;
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
            // Haxe.g:79:9: ( MONKEYS_AT metaName ( LPAREN paramList RPAREN )? )
            // Haxe.g:79:11: MONKEYS_AT metaName ( LPAREN paramList RPAREN )?
            {
            root_0 = (Object)adaptor.nil();

            MONKEYS_AT9=(Token)match(input,MONKEYS_AT,FOLLOW_MONKEYS_AT_in_meta280); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            MONKEYS_AT9_tree = (Object)adaptor.create(MONKEYS_AT9);
            adaptor.addChild(root_0, MONKEYS_AT9_tree);
            }
            pushFollow(FOLLOW_metaName_in_meta282);
            metaName10=metaName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, metaName10.getTree());
            // Haxe.g:79:31: ( LPAREN paramList RPAREN )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==LPAREN) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // Haxe.g:79:32: LPAREN paramList RPAREN
                    {
                    LPAREN11=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_meta285); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LPAREN11_tree = (Object)adaptor.create(LPAREN11);
                    adaptor.addChild(root_0, LPAREN11_tree);
                    }
                    pushFollow(FOLLOW_paramList_in_meta287);
                    paramList12=paramList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, paramList12.getTree());
                    RPAREN13=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_meta289); if (state.failed) return retval;
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
    // Haxe.g:82:1: metaName : ( IDENTIFIER | primitiveType | COLON metaName );
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
            // Haxe.g:83:5: ( IDENTIFIER | primitiveType | COLON metaName )
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
                    // Haxe.g:83:7: IDENTIFIER
                    {
                    root_0 = (Object)adaptor.nil();

                    IDENTIFIER14=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_metaName308); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER14_tree = (Object)adaptor.create(IDENTIFIER14);
                    adaptor.addChild(root_0, IDENTIFIER14_tree);
                    }

                    }
                    break;
                case 2 :
                    // Haxe.g:84:7: primitiveType
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_primitiveType_in_metaName316);
                    primitiveType15=primitiveType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveType15.getTree());

                    }
                    break;
                case 3 :
                    // Haxe.g:86:7: COLON metaName
                    {
                    root_0 = (Object)adaptor.nil();

                    COLON16=(Token)match(input,COLON,FOLLOW_COLON_in_metaName325); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    COLON16_tree = (Object)adaptor.create(COLON16);
                    adaptor.addChild(root_0, COLON16_tree);
                    }
                    pushFollow(FOLLOW_metaName_in_metaName327);
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
    // Haxe.g:89:1: typeDeclFlags : ( meta )* ( EXTERN | PRIVATE )* ;
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
            // Haxe.g:90:5: ( ( meta )* ( EXTERN | PRIVATE )* )
            // Haxe.g:90:7: ( meta )* ( EXTERN | PRIVATE )*
            {
            root_0 = (Object)adaptor.nil();

            // Haxe.g:90:7: ( meta )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==MONKEYS_AT) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // Haxe.g:90:8: meta
            	    {
            	    pushFollow(FOLLOW_meta_in_typeDeclFlags345);
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

            // Haxe.g:90:15: ( EXTERN | PRIVATE )*
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
    // Haxe.g:93:1: qualifiedIdentifier : (a= IDENTIFIER -> $a) ( DOT ident= IDENTIFIER -> ^( DOT $qualifiedIdentifier $ident) )* ;
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
            // Haxe.g:94:5: ( (a= IDENTIFIER -> $a) ( DOT ident= IDENTIFIER -> ^( DOT $qualifiedIdentifier $ident) )* )
            // Haxe.g:94:10: (a= IDENTIFIER -> $a) ( DOT ident= IDENTIFIER -> ^( DOT $qualifiedIdentifier $ident) )*
            {
            // Haxe.g:94:10: (a= IDENTIFIER -> $a)
            // Haxe.g:94:11: a= IDENTIFIER
            {
            a=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_qualifiedIdentifier383); if (state.failed) return retval; 
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
            // 94:25: -> $a
            {
                adaptor.addChild(root_0, stream_a.nextNode());

            }

            retval.tree = root_0;}
            }

            // Haxe.g:94:35: ( DOT ident= IDENTIFIER -> ^( DOT $qualifiedIdentifier $ident) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==DOT) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // Haxe.g:94:36: DOT ident= IDENTIFIER
            	    {
            	    DOT20=(Token)match(input,DOT,FOLLOW_DOT_in_qualifiedIdentifier396); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_DOT.add(DOT20);

            	    ident=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_qualifiedIdentifier400); if (state.failed) return retval; 
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
            	    // 94:58: -> ^( DOT $qualifiedIdentifier $ident)
            	    {
            	        // Haxe.g:94:62: ^( DOT $qualifiedIdentifier $ident)
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
    // Haxe.g:97:1: myImport : ( IMPORT dotIdent SEMI | USING dotIdent SEMI );
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
            // Haxe.g:98:5: ( IMPORT dotIdent SEMI | USING dotIdent SEMI )
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
                    // Haxe.g:98:7: IMPORT dotIdent SEMI
                    {
                    root_0 = (Object)adaptor.nil();

                    IMPORT21=(Token)match(input,IMPORT,FOLLOW_IMPORT_in_myImport438); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IMPORT21_tree = (Object)adaptor.create(IMPORT21);
                    root_0 = (Object)adaptor.becomeRoot(IMPORT21_tree, root_0);
                    }
                    pushFollow(FOLLOW_dotIdent_in_myImport441);
                    dotIdent22=dotIdent();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dotIdent22.getTree());
                    SEMI23=(Token)match(input,SEMI,FOLLOW_SEMI_in_myImport443); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // Haxe.g:99:7: USING dotIdent SEMI
                    {
                    root_0 = (Object)adaptor.nil();

                    USING24=(Token)match(input,USING,FOLLOW_USING_in_myImport452); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    USING24_tree = (Object)adaptor.create(USING24);
                    root_0 = (Object)adaptor.becomeRoot(USING24_tree, root_0);
                    }
                    pushFollow(FOLLOW_dotIdent_in_myImport455);
                    dotIdent25=dotIdent();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dotIdent25.getTree());
                    SEMI26=(Token)match(input,SEMI,FOLLOW_SEMI_in_myImport457); if (state.failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // Haxe.g:103:1: access : ( PUBLIC | PRIVATE );
    public final HaxeParser.access_return access() throws RecognitionException {
        HaxeParser.access_return retval = new HaxeParser.access_return();
        retval.start = input.LT(1);
        int access_StartIndex = input.index();
        Object root_0 = null;

        Token set27=null;

        Object set27_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return retval; }
            // Haxe.g:104:5: ( PUBLIC | PRIVATE )
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
    // Haxe.g:108:1: declAttr : ( STATIC | INLINE | DYNAMIC | OVERRIDE | access );
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
            // Haxe.g:109:5: ( STATIC | INLINE | DYNAMIC | OVERRIDE | access )
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
                    // Haxe.g:109:7: STATIC
                    {
                    root_0 = (Object)adaptor.nil();

                    STATIC28=(Token)match(input,STATIC,FOLLOW_STATIC_in_declAttr521); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STATIC28_tree = (Object)adaptor.create(STATIC28);
                    adaptor.addChild(root_0, STATIC28_tree);
                    }

                    }
                    break;
                case 2 :
                    // Haxe.g:110:7: INLINE
                    {
                    root_0 = (Object)adaptor.nil();

                    INLINE29=(Token)match(input,INLINE,FOLLOW_INLINE_in_declAttr529); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INLINE29_tree = (Object)adaptor.create(INLINE29);
                    adaptor.addChild(root_0, INLINE29_tree);
                    }

                    }
                    break;
                case 3 :
                    // Haxe.g:111:7: DYNAMIC
                    {
                    root_0 = (Object)adaptor.nil();

                    DYNAMIC30=(Token)match(input,DYNAMIC,FOLLOW_DYNAMIC_in_declAttr537); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DYNAMIC30_tree = (Object)adaptor.create(DYNAMIC30);
                    adaptor.addChild(root_0, DYNAMIC30_tree);
                    }

                    }
                    break;
                case 4 :
                    // Haxe.g:112:7: OVERRIDE
                    {
                    root_0 = (Object)adaptor.nil();

                    OVERRIDE31=(Token)match(input,OVERRIDE,FOLLOW_OVERRIDE_in_declAttr545); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    OVERRIDE31_tree = (Object)adaptor.create(OVERRIDE31);
                    adaptor.addChild(root_0, OVERRIDE31_tree);
                    }

                    }
                    break;
                case 5 :
                    // Haxe.g:113:7: access
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_access_in_declAttr553);
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
    // Haxe.g:116:1: declAttrList : ( declAttr )+ -> ^( DECL_ATTR_LIST[\"DECL_ATTR_LIST\", true] ( declAttr )+ ) ;
    public final HaxeParser.declAttrList_return declAttrList() throws RecognitionException {
        HaxeParser.declAttrList_return retval = new HaxeParser.declAttrList_return();
        retval.start = input.LT(1);
        int declAttrList_StartIndex = input.index();
        Object root_0 = null;

        HaxeParser.declAttr_return declAttr33 = null;


        RewriteRuleSubtreeStream stream_declAttr=new RewriteRuleSubtreeStream(adaptor,"rule declAttr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return retval; }
            // Haxe.g:117:5: ( ( declAttr )+ -> ^( DECL_ATTR_LIST[\"DECL_ATTR_LIST\", true] ( declAttr )+ ) )
            // Haxe.g:117:7: ( declAttr )+
            {
            // Haxe.g:117:7: ( declAttr )+
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
            	    // Haxe.g:117:8: declAttr
            	    {
            	    pushFollow(FOLLOW_declAttr_in_declAttrList571);
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
            // 117:19: -> ^( DECL_ATTR_LIST[\"DECL_ATTR_LIST\", true] ( declAttr )+ )
            {
                // Haxe.g:117:22: ^( DECL_ATTR_LIST[\"DECL_ATTR_LIST\", true] ( declAttr )+ )
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
    // Haxe.g:120:1: paramList : ( param ( COMMA param )* -> ^( PARAM_LIST[\"PARAM_LIST\", true] ( param )+ ) | );
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
            // Haxe.g:121:5: ( param ( COMMA param )* -> ^( PARAM_LIST[\"PARAM_LIST\", true] ( param )+ ) | )
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
                    // Haxe.g:121:7: param ( COMMA param )*
                    {
                    pushFollow(FOLLOW_param_in_paramList603);
                    param34=param();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_param.add(param34.getTree());
                    // Haxe.g:121:13: ( COMMA param )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==COMMA) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // Haxe.g:121:14: COMMA param
                    	    {
                    	    COMMA35=(Token)match(input,COMMA,FOLLOW_COMMA_in_paramList606); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA35);

                    	    pushFollow(FOLLOW_param_in_paramList608);
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
                    // 121:28: -> ^( PARAM_LIST[\"PARAM_LIST\", true] ( param )+ )
                    {
                        // Haxe.g:121:31: ^( PARAM_LIST[\"PARAM_LIST\", true] ( param )+ )
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
                    // Haxe.g:123:5: 
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
    // Haxe.g:125:1: param : ( QUES )? IDENTIFIER typeTagOpt varInit -> ^( VAR[$IDENTIFIER, true] ( IDENTIFIER )? ( typeTagOpt )? ( varInit )? ( QUES )? ) ;
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
            // Haxe.g:126:5: ( ( QUES )? IDENTIFIER typeTagOpt varInit -> ^( VAR[$IDENTIFIER, true] ( IDENTIFIER )? ( typeTagOpt )? ( varInit )? ( QUES )? ) )
            // Haxe.g:126:7: ( QUES )? IDENTIFIER typeTagOpt varInit
            {
            // Haxe.g:126:7: ( QUES )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==QUES) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // Haxe.g:0:0: QUES
                    {
                    QUES37=(Token)match(input,QUES,FOLLOW_QUES_in_param650); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_QUES.add(QUES37);


                    }
                    break;

            }

            IDENTIFIER38=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_param653); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER38);

            pushFollow(FOLLOW_typeTagOpt_in_param655);
            typeTagOpt39=typeTagOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeTagOpt.add(typeTagOpt39.getTree());
            pushFollow(FOLLOW_varInit_in_param657);
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
            // 126:43: -> ^( VAR[$IDENTIFIER, true] ( IDENTIFIER )? ( typeTagOpt )? ( varInit )? ( QUES )? )
            {
                // Haxe.g:126:46: ^( VAR[$IDENTIFIER, true] ( IDENTIFIER )? ( typeTagOpt )? ( varInit )? ( QUES )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new VarDeclaration(VAR, IDENTIFIER38, true), root_1);

                // Haxe.g:126:87: ( IDENTIFIER )?
                if ( stream_IDENTIFIER.hasNext() ) {
                    adaptor.addChild(root_1, new VarUsage(stream_IDENTIFIER.nextToken()));

                }
                stream_IDENTIFIER.reset();
                // Haxe.g:126:109: ( typeTagOpt )?
                if ( stream_typeTagOpt.hasNext() ) {
                    adaptor.addChild(root_1, stream_typeTagOpt.nextTree());

                }
                stream_typeTagOpt.reset();
                // Haxe.g:126:121: ( varInit )?
                if ( stream_varInit.hasNext() ) {
                    adaptor.addChild(root_1, stream_varInit.nextTree());

                }
                stream_varInit.reset();
                // Haxe.g:126:130: ( QUES )?
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
    // Haxe.g:129:1: id : ( IDENTIFIER | THIS );
    public final HaxeParser.id_return id() throws RecognitionException {
        HaxeParser.id_return retval = new HaxeParser.id_return();
        retval.start = input.LT(1);
        int id_StartIndex = input.index();
        Object root_0 = null;

        Token set41=null;

        Object set41_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return retval; }
            // Haxe.g:129:7: ( IDENTIFIER | THIS )
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
    // Haxe.g:133:1: dotIdent : ( id -> id ) ( DOT ident= id -> ^( $ident $dotIdent) )* ;
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
            // Haxe.g:133:9: ( ( id -> id ) ( DOT ident= id -> ^( $ident $dotIdent) )* )
            // Haxe.g:133:14: ( id -> id ) ( DOT ident= id -> ^( $ident $dotIdent) )*
            {
            // Haxe.g:133:14: ( id -> id )
            // Haxe.g:133:15: id
            {
            pushFollow(FOLLOW_id_in_dotIdent736);
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
            // 133:18: -> id
            {
                adaptor.addChild(root_0, stream_id.nextTree());

            }

            retval.tree = root_0;}
            }

            // Haxe.g:133:25: ( DOT ident= id -> ^( $ident $dotIdent) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==DOT) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // Haxe.g:133:26: DOT ident= id
            	    {
            	    DOT43=(Token)match(input,DOT,FOLLOW_DOT_in_dotIdent744); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_DOT.add(DOT43);

            	    pushFollow(FOLLOW_id_in_dotIdent748);
            	    ident=id();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_id.add(ident.getTree());


            	    // AST REWRITE
            	    // elements: dotIdent, ident
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
            	    // 133:39: -> ^( $ident $dotIdent)
            	    {
            	        // Haxe.g:133:42: ^( $ident $dotIdent)
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot(stream_ident.nextNode(), root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());

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
    // Haxe.g:136:1: assignOp : ( EQ -> EQ[$EQ] | PLUSEQ -> PLUSEQ[$PLUSEQ] | SUBEQ -> SUBEQ[$SUBEQ] | SLASHEQ -> SLASHEQ[$SLASHEQ] | PERCENTEQ -> PERCENTEQ[$PERCENTEQ] | AMPEQ -> AMPEQ[$AMPEQ] );
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
            // Haxe.g:137:5: ( EQ -> EQ[$EQ] | PLUSEQ -> PLUSEQ[$PLUSEQ] | SUBEQ -> SUBEQ[$SUBEQ] | SLASHEQ -> SLASHEQ[$SLASHEQ] | PERCENTEQ -> PERCENTEQ[$PERCENTEQ] | AMPEQ -> AMPEQ[$AMPEQ] )
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
                    // Haxe.g:137:10: EQ
                    {
                    EQ44=(Token)match(input,EQ,FOLLOW_EQ_in_assignOp785); if (state.failed) return retval; 
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
                    // 137:20: -> EQ[$EQ]
                    {
                        adaptor.addChild(root_0, new AssignOperationNode(EQ, EQ44));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // Haxe.g:138:10: PLUSEQ
                    {
                    PLUSEQ45=(Token)match(input,PLUSEQ,FOLLOW_PLUSEQ_in_assignOp811); if (state.failed) return retval; 
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
                    // 138:21: -> PLUSEQ[$PLUSEQ]
                    {
                        adaptor.addChild(root_0, new AssignOperationNode(PLUSEQ, PLUSEQ45));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // Haxe.g:139:10: SUBEQ
                    {
                    SUBEQ46=(Token)match(input,SUBEQ,FOLLOW_SUBEQ_in_assignOp834); if (state.failed) return retval; 
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
                    // 139:19: -> SUBEQ[$SUBEQ]
                    {
                        adaptor.addChild(root_0, new AssignOperationNode(SUBEQ, SUBEQ46));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // Haxe.g:140:10: SLASHEQ
                    {
                    SLASHEQ47=(Token)match(input,SLASHEQ,FOLLOW_SLASHEQ_in_assignOp856); if (state.failed) return retval; 
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
                    // 140:21: -> SLASHEQ[$SLASHEQ]
                    {
                        adaptor.addChild(root_0, new AssignOperationNode(SLASHEQ, SLASHEQ47));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // Haxe.g:141:10: PERCENTEQ
                    {
                    PERCENTEQ48=(Token)match(input,PERCENTEQ,FOLLOW_PERCENTEQ_in_assignOp878); if (state.failed) return retval; 
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
                    // 141:23: -> PERCENTEQ[$PERCENTEQ]
                    {
                        adaptor.addChild(root_0, new AssignOperationNode(PERCENTEQ, PERCENTEQ48));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    // Haxe.g:142:10: AMPEQ
                    {
                    AMPEQ49=(Token)match(input,AMPEQ,FOLLOW_AMPEQ_in_assignOp900); if (state.failed) return retval; 
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
                    // 142:19: -> AMPEQ[$AMPEQ]
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
    // Haxe.g:146:1: funcLit : FUNCTION LPAREN paramList RPAREN ( typeTagOpt )? block -> ^( FUNCTION ( paramList )? ( typeTagOpt )? ( block )? ) ;
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
            // Haxe.g:146:8: ( FUNCTION LPAREN paramList RPAREN ( typeTagOpt )? block -> ^( FUNCTION ( paramList )? ( typeTagOpt )? ( block )? ) )
            // Haxe.g:146:10: FUNCTION LPAREN paramList RPAREN ( typeTagOpt )? block
            {
            FUNCTION50=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcLit928); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION50);

            LPAREN51=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcLit930); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN51);

            pushFollow(FOLLOW_paramList_in_funcLit932);
            paramList52=paramList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_paramList.add(paramList52.getTree());
            RPAREN53=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcLit934); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN53);

            // Haxe.g:146:43: ( typeTagOpt )?
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
                    pushFollow(FOLLOW_typeTagOpt_in_funcLit936);
                    typeTagOpt54=typeTagOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeTagOpt.add(typeTagOpt54.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_block_in_funcLit939);
            block55=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block55.getTree());


            // AST REWRITE
            // elements: block, FUNCTION, paramList, typeTagOpt
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 146:61: -> ^( FUNCTION ( paramList )? ( typeTagOpt )? ( block )? )
            {
                // Haxe.g:146:64: ^( FUNCTION ( paramList )? ( typeTagOpt )? ( block )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new FunctionNode(stream_FUNCTION.nextToken()), root_1);

                // Haxe.g:146:89: ( paramList )?
                if ( stream_paramList.hasNext() ) {
                    adaptor.addChild(root_1, stream_paramList.nextTree());

                }
                stream_paramList.reset();
                // Haxe.g:146:100: ( typeTagOpt )?
                if ( stream_typeTagOpt.hasNext() ) {
                    adaptor.addChild(root_1, stream_typeTagOpt.nextTree());

                }
                stream_typeTagOpt.reset();
                // Haxe.g:146:112: ( block )?
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
    // Haxe.g:148:1: arrayLit : LBRACKET exprListOpt RBRACKET ;
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
            // Haxe.g:148:18: ( LBRACKET exprListOpt RBRACKET )
            // Haxe.g:148:20: LBRACKET exprListOpt RBRACKET
            {
            root_0 = (Object)adaptor.nil();

            LBRACKET56=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_arrayLit977); if (state.failed) return retval;
            pushFollow(FOLLOW_exprListOpt_in_arrayLit980);
            exprListOpt57=exprListOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, exprListOpt57.getTree());
            RBRACKET58=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_arrayLit982); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // Haxe.g:176:1: typeTag : COLON funcType ;
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
            // Haxe.g:176:12: ( COLON funcType )
            // Haxe.g:176:17: COLON funcType
            {
            root_0 = (Object)adaptor.nil();

            COLON59=(Token)match(input,COLON,FOLLOW_COLON_in_typeTag1016); if (state.failed) return retval;
            pushFollow(FOLLOW_funcType_in_typeTag1019);
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
    // Haxe.g:179:1: typeTagOpt : ( typeTag -> ^( TYPE_TAG[\"TYPE_TAG\",true] ( typeTag )? ) | );
    public final HaxeParser.typeTagOpt_return typeTagOpt() throws RecognitionException {
        HaxeParser.typeTagOpt_return retval = new HaxeParser.typeTagOpt_return();
        retval.start = input.LT(1);
        int typeTagOpt_StartIndex = input.index();
        Object root_0 = null;

        HaxeParser.typeTag_return typeTag61 = null;


        RewriteRuleSubtreeStream stream_typeTag=new RewriteRuleSubtreeStream(adaptor,"rule typeTag");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return retval; }
            // Haxe.g:180:5: ( typeTag -> ^( TYPE_TAG[\"TYPE_TAG\",true] ( typeTag )? ) | )
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
                    // Haxe.g:180:10: typeTag
                    {
                    pushFollow(FOLLOW_typeTag_in_typeTagOpt1043);
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
                    // 180:18: -> ^( TYPE_TAG[\"TYPE_TAG\",true] ( typeTag )? )
                    {
                        // Haxe.g:180:21: ^( TYPE_TAG[\"TYPE_TAG\",true] ( typeTag )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new HaxeTree(TYPE_TAG, "TYPE_TAG", true), root_1);

                        // Haxe.g:180:59: ( typeTag )?
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
                    // Haxe.g:182:5: 
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
    // Haxe.g:184:1: typeList : ( type ( COMMA type )* | typeConstraint ( COMMA typeConstraint )* );
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
            // Haxe.g:185:5: ( type ( COMMA type )* | typeConstraint ( COMMA typeConstraint )* )
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
                    // Haxe.g:185:10: type ( COMMA type )*
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_type_in_typeList1086);
                    type62=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, type62.getTree());
                    // Haxe.g:185:15: ( COMMA type )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==COMMA) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // Haxe.g:185:16: COMMA type
                    	    {
                    	    COMMA63=(Token)match(input,COMMA,FOLLOW_COMMA_in_typeList1089); if (state.failed) return retval;
                    	    pushFollow(FOLLOW_type_in_typeList1092);
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
                    // Haxe.g:186:10: typeConstraint ( COMMA typeConstraint )*
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_typeConstraint_in_typeList1109);
                    typeConstraint65=typeConstraint();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeConstraint65.getTree());
                    // Haxe.g:186:25: ( COMMA typeConstraint )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==COMMA) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // Haxe.g:186:26: COMMA typeConstraint
                    	    {
                    	    COMMA66=(Token)match(input,COMMA,FOLLOW_COMMA_in_typeList1112); if (state.failed) return retval;
                    	    pushFollow(FOLLOW_typeConstraint_in_typeList1115);
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
    // Haxe.g:189:1: funcType : ( ( type ) ( MINUS_BIGGER type )* | VOID );
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
            // Haxe.g:189:9: ( ( type ) ( MINUS_BIGGER type )* | VOID )
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
                    // Haxe.g:189:14: ( type ) ( MINUS_BIGGER type )*
                    {
                    root_0 = (Object)adaptor.nil();

                    // Haxe.g:189:14: ( type )
                    // Haxe.g:189:15: type
                    {
                    pushFollow(FOLLOW_type_in_funcType1135);
                    type68=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, type68.getTree());

                    }

                    // Haxe.g:189:21: ( MINUS_BIGGER type )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==MINUS_BIGGER) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // Haxe.g:189:22: MINUS_BIGGER type
                    	    {
                    	    MINUS_BIGGER69=(Token)match(input,MINUS_BIGGER,FOLLOW_MINUS_BIGGER_in_funcType1139); if (state.failed) return retval;
                    	    pushFollow(FOLLOW_type_in_funcType1142);
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
                    // Haxe.g:190:10: VOID
                    {
                    root_0 = (Object)adaptor.nil();

                    VOID71=(Token)match(input,VOID,FOLLOW_VOID_in_funcType1155); if (state.failed) return retval;
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
    // Haxe.g:193:1: primitiveType : ( INT | FLOAT | DYNAMIC | BOOLEAN | VOID );
    public final HaxeParser.primitiveType_return primitiveType() throws RecognitionException {
        HaxeParser.primitiveType_return retval = new HaxeParser.primitiveType_return();
        retval.start = input.LT(1);
        int primitiveType_StartIndex = input.index();
        Object root_0 = null;

        Token set72=null;

        Object set72_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return retval; }
            // Haxe.g:194:5: ( INT | FLOAT | DYNAMIC | BOOLEAN | VOID )
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
    // Haxe.g:197:1: type : ( ( anonType | dotIdent | primitiveType ) ( typeParam )* | );
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
            // Haxe.g:197:9: ( ( anonType | dotIdent | primitiveType ) ( typeParam )* | )
            int alt26=2;
            alt26 = dfa26.predict(input);
            switch (alt26) {
                case 1 :
                    // Haxe.g:197:14: ( anonType | dotIdent | primitiveType ) ( typeParam )*
                    {
                    root_0 = (Object)adaptor.nil();

                    // Haxe.g:197:14: ( anonType | dotIdent | primitiveType )
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
                            // Haxe.g:197:15: anonType
                            {
                            pushFollow(FOLLOW_anonType_in_type1215);
                            anonType73=anonType();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, anonType73.getTree());

                            }
                            break;
                        case 2 :
                            // Haxe.g:197:26: dotIdent
                            {
                            pushFollow(FOLLOW_dotIdent_in_type1219);
                            dotIdent74=dotIdent();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, dotIdent74.getTree());

                            }
                            break;
                        case 3 :
                            // Haxe.g:197:37: primitiveType
                            {
                            pushFollow(FOLLOW_primitiveType_in_type1223);
                            primitiveType75=primitiveType();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveType75.getTree());

                            }
                            break;

                    }

                    // Haxe.g:197:53: ( typeParam )*
                    loop25:
                    do {
                        int alt25=2;
                        alt25 = dfa25.predict(input);
                        switch (alt25) {
                    	case 1 :
                    	    // Haxe.g:197:54: typeParam
                    	    {
                    	    pushFollow(FOLLOW_typeParam_in_type1228);
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
                    // Haxe.g:199:5: 
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
    // Haxe.g:201:1: typeParam : ( LT typeList GT | LT typeList LT typeList GTGT | LT typeList LT typeList LT typeList GTGTGT );
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
            // Haxe.g:202:5: ( LT typeList GT | LT typeList LT typeList GTGT | LT typeList LT typeList LT typeList GTGTGT )
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
                    // Haxe.g:202:10: LT typeList GT
                    {
                    root_0 = (Object)adaptor.nil();

                    LT77=(Token)match(input,LT,FOLLOW_LT_in_typeParam1264); if (state.failed) return retval;
                    pushFollow(FOLLOW_typeList_in_typeParam1267);
                    typeList78=typeList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeList78.getTree());
                    GT79=(Token)match(input,GT,FOLLOW_GT_in_typeParam1269); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // Haxe.g:203:10: LT typeList LT typeList GTGT
                    {
                    root_0 = (Object)adaptor.nil();

                    LT80=(Token)match(input,LT,FOLLOW_LT_in_typeParam1281); if (state.failed) return retval;
                    pushFollow(FOLLOW_typeList_in_typeParam1284);
                    typeList81=typeList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeList81.getTree());
                    LT82=(Token)match(input,LT,FOLLOW_LT_in_typeParam1286); if (state.failed) return retval;
                    pushFollow(FOLLOW_typeList_in_typeParam1289);
                    typeList83=typeList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeList83.getTree());
                    GTGT84=(Token)match(input,GTGT,FOLLOW_GTGT_in_typeParam1291); if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // Haxe.g:204:10: LT typeList LT typeList LT typeList GTGTGT
                    {
                    root_0 = (Object)adaptor.nil();

                    LT85=(Token)match(input,LT,FOLLOW_LT_in_typeParam1303); if (state.failed) return retval;
                    pushFollow(FOLLOW_typeList_in_typeParam1306);
                    typeList86=typeList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeList86.getTree());
                    LT87=(Token)match(input,LT,FOLLOW_LT_in_typeParam1308); if (state.failed) return retval;
                    pushFollow(FOLLOW_typeList_in_typeParam1311);
                    typeList88=typeList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeList88.getTree());
                    LT89=(Token)match(input,LT,FOLLOW_LT_in_typeParam1313); if (state.failed) return retval;
                    pushFollow(FOLLOW_typeList_in_typeParam1316);
                    typeList90=typeList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeList90.getTree());
                    GTGTGT91=(Token)match(input,GTGTGT,FOLLOW_GTGTGT_in_typeParam1318); if (state.failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // Haxe.g:208:1: typeParamOpt : ( typeParam -> ^( TYPE_PARAM_OPT[\"TYPE_PARAM_OPT\",true] ( typeParam )? ) | );
    public final HaxeParser.typeParamOpt_return typeParamOpt() throws RecognitionException {
        HaxeParser.typeParamOpt_return retval = new HaxeParser.typeParamOpt_return();
        retval.start = input.LT(1);
        int typeParamOpt_StartIndex = input.index();
        Object root_0 = null;

        HaxeParser.typeParam_return typeParam92 = null;


        RewriteRuleSubtreeStream stream_typeParam=new RewriteRuleSubtreeStream(adaptor,"rule typeParam");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return retval; }
            // Haxe.g:209:5: ( typeParam -> ^( TYPE_PARAM_OPT[\"TYPE_PARAM_OPT\",true] ( typeParam )? ) | )
            int alt28=2;
            alt28 = dfa28.predict(input);
            switch (alt28) {
                case 1 :
                    // Haxe.g:209:10: typeParam
                    {
                    pushFollow(FOLLOW_typeParam_in_typeParamOpt1350);
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
                    // 209:20: -> ^( TYPE_PARAM_OPT[\"TYPE_PARAM_OPT\",true] ( typeParam )? )
                    {
                        // Haxe.g:209:23: ^( TYPE_PARAM_OPT[\"TYPE_PARAM_OPT\",true] ( typeParam )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new HaxeTree(TYPE_PARAM_OPT, "TYPE_PARAM_OPT", true), root_1);

                        // Haxe.g:209:73: ( typeParam )?
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
                    // Haxe.g:211:5: 
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
    // Haxe.g:213:1: typeConstraint : IDENTIFIER COLON LPAREN typeList RPAREN -> ^( $typeConstraint ( IDENTIFIER )? ( typeList )? ) ;
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
            // Haxe.g:214:5: ( IDENTIFIER COLON LPAREN typeList RPAREN -> ^( $typeConstraint ( IDENTIFIER )? ( typeList )? ) )
            // Haxe.g:214:7: IDENTIFIER COLON LPAREN typeList RPAREN
            {
            IDENTIFIER93=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_typeConstraint1397); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER93);

            COLON94=(Token)match(input,COLON,FOLLOW_COLON_in_typeConstraint1399); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COLON.add(COLON94);

            LPAREN95=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_typeConstraint1401); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN95);

            pushFollow(FOLLOW_typeList_in_typeConstraint1403);
            typeList96=typeList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeList.add(typeList96.getTree());
            RPAREN97=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_typeConstraint1405); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN97);



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
            // 214:47: -> ^( $typeConstraint ( IDENTIFIER )? ( typeList )? )
            {
                // Haxe.g:214:50: ^( $typeConstraint ( IDENTIFIER )? ( typeList )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_retval.nextNode(), root_1);

                // Haxe.g:214:68: ( IDENTIFIER )?
                if ( stream_IDENTIFIER.hasNext() ) {
                    adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());

                }
                stream_IDENTIFIER.reset();
                // Haxe.g:214:80: ( typeList )?
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
    // Haxe.g:218:1: functionReturn : ( declAttrList )? FUNCTION NEW LPAREN paramList RPAREN typeTagOpt block -> ^( FUNCTION NEW ( declAttrList )? ( paramList )? ( typeTagOpt )? ( block )? ) ;
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
            // Haxe.g:219:5: ( ( declAttrList )? FUNCTION NEW LPAREN paramList RPAREN typeTagOpt block -> ^( FUNCTION NEW ( declAttrList )? ( paramList )? ( typeTagOpt )? ( block )? ) )
            // Haxe.g:219:10: ( declAttrList )? FUNCTION NEW LPAREN paramList RPAREN typeTagOpt block
            {
            // Haxe.g:219:10: ( declAttrList )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==PRIVATE||(LA29_0>=PUBLIC && LA29_0<=OVERRIDE)) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // Haxe.g:0:0: declAttrList
                    {
                    pushFollow(FOLLOW_declAttrList_in_functionReturn1443);
                    declAttrList98=declAttrList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declAttrList.add(declAttrList98.getTree());

                    }
                    break;

            }

            FUNCTION99=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_functionReturn1446); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION99);

            NEW100=(Token)match(input,NEW,FOLLOW_NEW_in_functionReturn1448); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_NEW.add(NEW100);

            LPAREN101=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_functionReturn1450); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN101);

            pushFollow(FOLLOW_paramList_in_functionReturn1452);
            paramList102=paramList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_paramList.add(paramList102.getTree());
            RPAREN103=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_functionReturn1454); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN103);

            pushFollow(FOLLOW_typeTagOpt_in_functionReturn1456);
            typeTagOpt104=typeTagOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeTagOpt.add(typeTagOpt104.getTree());
            pushFollow(FOLLOW_block_in_functionReturn1458);
            block105=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block105.getTree());


            // AST REWRITE
            // elements: declAttrList, paramList, FUNCTION, typeTagOpt, block, NEW
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 219:78: -> ^( FUNCTION NEW ( declAttrList )? ( paramList )? ( typeTagOpt )? ( block )? )
            {
                // Haxe.g:219:81: ^( FUNCTION NEW ( declAttrList )? ( paramList )? ( typeTagOpt )? ( block )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new FunctionNode(stream_FUNCTION.nextToken()), root_1);

                adaptor.addChild(root_1, stream_NEW.nextNode());
                // Haxe.g:219:110: ( declAttrList )?
                if ( stream_declAttrList.hasNext() ) {
                    adaptor.addChild(root_1, stream_declAttrList.nextTree());

                }
                stream_declAttrList.reset();
                // Haxe.g:219:124: ( paramList )?
                if ( stream_paramList.hasNext() ) {
                    adaptor.addChild(root_1, stream_paramList.nextTree());

                }
                stream_paramList.reset();
                // Haxe.g:219:135: ( typeTagOpt )?
                if ( stream_typeTagOpt.hasNext() ) {
                    adaptor.addChild(root_1, stream_typeTagOpt.nextTree());

                }
                stream_typeTagOpt.reset();
                // Haxe.g:219:147: ( block )?
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
    // Haxe.g:222:1: statement : ( block | assignExpr SEMI | varDecl | IF parExpression st1= statement ( ELSE st2= statement )? -> ^( IF parExpression $st1 ( ^( ELSE $st2) )? ) | FOR LPAREN exp1= expr IN exp2= expr RPAREN statement -> ^( FOR ^( IN $exp1 $exp2) ( statement )? ) | WHILE parExpression statement -> ^( WHILE ( parExpression )? ( statement )? ) | DO statement WHILE parExpression SEMI -> ^( DO ( parExpression )? ( statement )? ) | TRY block catchStmtList -> ^( TRY ( block )? ( catchStmtList )? ) | SWITCH LPAREN expr RPAREN LBRACE ( caseStmt )+ RBRACE -> ^( SWITCH ( expr )? ( caseStmt )+ ) | RETURN ( expr )? SEMI -> ^( RETURN ( expr )? ) | THROW expr SEMI -> ^( THROW ( expr )? ) | BREAK ( IDENTIFIER )? SEMI -> ^( BREAK ( IDENTIFIER )? ) | CONTINUE ( IDENTIFIER )? SEMI -> ^( CONTINUE ( IDENTIFIER )? ) | expr SEMI | IDENTIFIER COLON statement -> ^( COLON ( IDENTIFIER )? ( statement )? ) | SEMI );
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
            // Haxe.g:223:5: ( block | assignExpr SEMI | varDecl | IF parExpression st1= statement ( ELSE st2= statement )? -> ^( IF parExpression $st1 ( ^( ELSE $st2) )? ) | FOR LPAREN exp1= expr IN exp2= expr RPAREN statement -> ^( FOR ^( IN $exp1 $exp2) ( statement )? ) | WHILE parExpression statement -> ^( WHILE ( parExpression )? ( statement )? ) | DO statement WHILE parExpression SEMI -> ^( DO ( parExpression )? ( statement )? ) | TRY block catchStmtList -> ^( TRY ( block )? ( catchStmtList )? ) | SWITCH LPAREN expr RPAREN LBRACE ( caseStmt )+ RBRACE -> ^( SWITCH ( expr )? ( caseStmt )+ ) | RETURN ( expr )? SEMI -> ^( RETURN ( expr )? ) | THROW expr SEMI -> ^( THROW ( expr )? ) | BREAK ( IDENTIFIER )? SEMI -> ^( BREAK ( IDENTIFIER )? ) | CONTINUE ( IDENTIFIER )? SEMI -> ^( CONTINUE ( IDENTIFIER )? ) | expr SEMI | IDENTIFIER COLON statement -> ^( COLON ( IDENTIFIER )? ( statement )? ) | SEMI )
            int alt35=16;
            alt35 = dfa35.predict(input);
            switch (alt35) {
                case 1 :
                    // Haxe.g:223:10: block
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_block_in_statement1507);
                    block106=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, block106.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:224:10: assignExpr SEMI
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_assignExpr_in_statement1518);
                    assignExpr107=assignExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignExpr107.getTree());
                    SEMI108=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement1520); if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // Haxe.g:225:10: varDecl
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_varDecl_in_statement1532);
                    varDecl109=varDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDecl109.getTree());

                    }
                    break;
                case 4 :
                    // Haxe.g:226:10: IF parExpression st1= statement ( ELSE st2= statement )?
                    {
                    IF110=(Token)match(input,IF,FOLLOW_IF_in_statement1543); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IF.add(IF110);

                    pushFollow(FOLLOW_parExpression_in_statement1545);
                    parExpression111=parExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_parExpression.add(parExpression111.getTree());
                    pushFollow(FOLLOW_statement_in_statement1549);
                    st1=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(st1.getTree());
                    // Haxe.g:226:41: ( ELSE st2= statement )?
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
                            // Haxe.g:226:42: ELSE st2= statement
                            {
                            ELSE112=(Token)match(input,ELSE,FOLLOW_ELSE_in_statement1552); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_ELSE.add(ELSE112);

                            pushFollow(FOLLOW_statement_in_statement1556);
                            st2=statement();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_statement.add(st2.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: IF, st2, st1, parExpression, ELSE
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
                    // 226:67: -> ^( IF parExpression $st1 ( ^( ELSE $st2) )? )
                    {
                        // Haxe.g:226:70: ^( IF parExpression $st1 ( ^( ELSE $st2) )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new IfNode(stream_IF.nextToken()), root_1);

                        adaptor.addChild(root_1, stream_parExpression.nextTree());
                        adaptor.addChild(root_1, stream_st1.nextTree());
                        // Haxe.g:226:102: ( ^( ELSE $st2) )?
                        if ( stream_st2.hasNext()||stream_ELSE.hasNext() ) {
                            // Haxe.g:226:102: ^( ELSE $st2)
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
                    // Haxe.g:227:10: FOR LPAREN exp1= expr IN exp2= expr RPAREN statement
                    {
                    FOR113=(Token)match(input,FOR,FOLLOW_FOR_in_statement1605); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FOR.add(FOR113);

                    LPAREN114=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_statement1607); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN114);

                    pushFollow(FOLLOW_expr_in_statement1611);
                    exp1=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(exp1.getTree());
                    IN115=(Token)match(input,IN,FOLLOW_IN_in_statement1613); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IN.add(IN115);

                    pushFollow(FOLLOW_expr_in_statement1617);
                    exp2=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(exp2.getTree());
                    RPAREN116=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_statement1619); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN116);

                    pushFollow(FOLLOW_statement_in_statement1621);
                    statement117=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement117.getTree());


                    // AST REWRITE
                    // elements: statement, exp2, exp1, IN, FOR
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
                    // 227:65: -> ^( FOR ^( IN $exp1 $exp2) ( statement )? )
                    {
                        // Haxe.g:227:68: ^( FOR ^( IN $exp1 $exp2) ( statement )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new ForNode(stream_FOR.nextToken()), root_1);

                        // Haxe.g:227:83: ^( IN $exp1 $exp2)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_IN.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_exp1.nextTree());
                        adaptor.addChild(root_2, stream_exp2.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // Haxe.g:227:101: ( statement )?
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
                    // Haxe.g:228:10: WHILE parExpression statement
                    {
                    WHILE118=(Token)match(input,WHILE,FOLLOW_WHILE_in_statement1658); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHILE.add(WHILE118);

                    pushFollow(FOLLOW_parExpression_in_statement1660);
                    parExpression119=parExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_parExpression.add(parExpression119.getTree());
                    pushFollow(FOLLOW_statement_in_statement1662);
                    statement120=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement120.getTree());


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
                    // 228:56: -> ^( WHILE ( parExpression )? ( statement )? )
                    {
                        // Haxe.g:228:59: ^( WHILE ( parExpression )? ( statement )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new WhileNode(stream_WHILE.nextToken()), root_1);

                        // Haxe.g:228:78: ( parExpression )?
                        if ( stream_parExpression.hasNext() ) {
                            adaptor.addChild(root_1, stream_parExpression.nextTree());

                        }
                        stream_parExpression.reset();
                        // Haxe.g:228:93: ( statement )?
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
                    // Haxe.g:229:10: DO statement WHILE parExpression SEMI
                    {
                    DO121=(Token)match(input,DO,FOLLOW_DO_in_statement1704); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DO.add(DO121);

                    pushFollow(FOLLOW_statement_in_statement1706);
                    statement122=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement122.getTree());
                    WHILE123=(Token)match(input,WHILE,FOLLOW_WHILE_in_statement1708); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHILE.add(WHILE123);

                    pushFollow(FOLLOW_parExpression_in_statement1710);
                    parExpression124=parExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_parExpression.add(parExpression124.getTree());
                    SEMI125=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement1712); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI125);



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
                    // 229:60: -> ^( DO ( parExpression )? ( statement )? )
                    {
                        // Haxe.g:229:63: ^( DO ( parExpression )? ( statement )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new DoWhileNode(stream_DO.nextToken()), root_1);

                        // Haxe.g:229:81: ( parExpression )?
                        if ( stream_parExpression.hasNext() ) {
                            adaptor.addChild(root_1, stream_parExpression.nextTree());

                        }
                        stream_parExpression.reset();
                        // Haxe.g:229:96: ( statement )?
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
                    // Haxe.g:230:10: TRY block catchStmtList
                    {
                    TRY126=(Token)match(input,TRY,FOLLOW_TRY_in_statement1750); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TRY.add(TRY126);

                    pushFollow(FOLLOW_block_in_statement1752);
                    block127=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block127.getTree());
                    pushFollow(FOLLOW_catchStmtList_in_statement1754);
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
                    // 230:50: -> ^( TRY ( block )? ( catchStmtList )? )
                    {
                        // Haxe.g:230:53: ^( TRY ( block )? ( catchStmtList )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new TryNode(stream_TRY.nextToken()), root_1);

                        // Haxe.g:230:68: ( block )?
                        if ( stream_block.hasNext() ) {
                            adaptor.addChild(root_1, stream_block.nextTree());

                        }
                        stream_block.reset();
                        // Haxe.g:230:75: ( catchStmtList )?
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
                    // Haxe.g:231:10: SWITCH LPAREN expr RPAREN LBRACE ( caseStmt )+ RBRACE
                    {
                    SWITCH129=(Token)match(input,SWITCH,FOLLOW_SWITCH_in_statement1796); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SWITCH.add(SWITCH129);

                    LPAREN130=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_statement1798); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN130);

                    pushFollow(FOLLOW_expr_in_statement1800);
                    expr131=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr131.getTree());
                    RPAREN132=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_statement1802); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN132);

                    LBRACE133=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_statement1804); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LBRACE.add(LBRACE133);

                    // Haxe.g:231:43: ( caseStmt )+
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
                    	    pushFollow(FOLLOW_caseStmt_in_statement1806);
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

                    RBRACE135=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_statement1809); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RBRACE.add(RBRACE135);



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
                    // 231:64: -> ^( SWITCH ( expr )? ( caseStmt )+ )
                    {
                        // Haxe.g:231:67: ^( SWITCH ( expr )? ( caseStmt )+ )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new SwitchNode(stream_SWITCH.nextToken()), root_1);

                        // Haxe.g:231:88: ( expr )?
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
                    // Haxe.g:232:10: RETURN ( expr )? SEMI
                    {
                    RETURN136=(Token)match(input,RETURN,FOLLOW_RETURN_in_statement1839); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RETURN.add(RETURN136);

                    // Haxe.g:232:17: ( expr )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==LPAREN||LA32_0==IDENTIFIER||LA32_0==THIS||(LA32_0>=FUNCTION && LA32_0<=LBRACKET)||LA32_0==NEW||LA32_0==LBRACE||LA32_0==UNTYPED||(LA32_0>=PLUS && LA32_0<=SUB)||(LA32_0>=SUBSUB && LA32_0<=CAST)||LA32_0==NULL||(LA32_0>=LONGLITERAL && LA32_0<=FALSE)) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // Haxe.g:232:18: expr
                            {
                            pushFollow(FOLLOW_expr_in_statement1842);
                            expr137=expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expr.add(expr137.getTree());

                            }
                            break;

                    }

                    SEMI138=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement1846); if (state.failed) return retval; 
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
                    // 232:49: -> ^( RETURN ( expr )? )
                    {
                        // Haxe.g:232:52: ^( RETURN ( expr )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_RETURN.nextNode(), root_1);

                        // Haxe.g:232:61: ( expr )?
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
                    // Haxe.g:233:10: THROW expr SEMI
                    {
                    THROW139=(Token)match(input,THROW,FOLLOW_THROW_in_statement1885); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THROW.add(THROW139);

                    pushFollow(FOLLOW_expr_in_statement1887);
                    expr140=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr140.getTree());
                    SEMI141=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement1889); if (state.failed) return retval; 
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
                    // 233:46: -> ^( THROW ( expr )? )
                    {
                        // Haxe.g:233:49: ^( THROW ( expr )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_THROW.nextNode(), root_1);

                        // Haxe.g:233:57: ( expr )?
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
                    // Haxe.g:234:10: BREAK ( IDENTIFIER )? SEMI
                    {
                    BREAK142=(Token)match(input,BREAK,FOLLOW_BREAK_in_statement1929); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_BREAK.add(BREAK142);

                    // Haxe.g:234:16: ( IDENTIFIER )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==IDENTIFIER) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // Haxe.g:234:17: IDENTIFIER
                            {
                            IDENTIFIER143=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_statement1932); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER143);


                            }
                            break;

                    }

                    SEMI144=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement1936); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI144);



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
                    // 234:50: -> ^( BREAK ( IDENTIFIER )? )
                    {
                        // Haxe.g:234:53: ^( BREAK ( IDENTIFIER )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_BREAK.nextNode(), root_1);

                        // Haxe.g:234:61: ( IDENTIFIER )?
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
                    // Haxe.g:235:10: CONTINUE ( IDENTIFIER )? SEMI
                    {
                    CONTINUE145=(Token)match(input,CONTINUE,FOLLOW_CONTINUE_in_statement1971); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CONTINUE.add(CONTINUE145);

                    // Haxe.g:235:19: ( IDENTIFIER )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==IDENTIFIER) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // Haxe.g:235:20: IDENTIFIER
                            {
                            IDENTIFIER146=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_statement1974); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER146);


                            }
                            break;

                    }

                    SEMI147=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement1978); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI147);



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
                    // 235:54: -> ^( CONTINUE ( IDENTIFIER )? )
                    {
                        // Haxe.g:235:57: ^( CONTINUE ( IDENTIFIER )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_CONTINUE.nextNode(), root_1);

                        // Haxe.g:235:68: ( IDENTIFIER )?
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
                    // Haxe.g:236:10: expr SEMI
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_expr_in_statement2014);
                    expr148=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr148.getTree());
                    SEMI149=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement2017); if (state.failed) return retval;

                    }
                    break;
                case 15 :
                    // Haxe.g:237:10: IDENTIFIER COLON statement
                    {
                    IDENTIFIER150=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_statement2029); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER150);

                    COLON151=(Token)match(input,COLON,FOLLOW_COLON_in_statement2031); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(COLON151);

                    pushFollow(FOLLOW_statement_in_statement2033);
                    statement152=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement152.getTree());


                    // AST REWRITE
                    // elements: IDENTIFIER, statement, COLON
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 237:53: -> ^( COLON ( IDENTIFIER )? ( statement )? )
                    {
                        // Haxe.g:237:56: ^( COLON ( IDENTIFIER )? ( statement )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_COLON.nextNode(), root_1);

                        // Haxe.g:237:64: ( IDENTIFIER )?
                        if ( stream_IDENTIFIER.hasNext() ) {
                            adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());

                        }
                        stream_IDENTIFIER.reset();
                        // Haxe.g:237:76: ( statement )?
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
                    // Haxe.g:238:10: SEMI
                    {
                    root_0 = (Object)adaptor.nil();

                    SEMI153=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement2072); if (state.failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // Haxe.g:241:1: parExpression : LPAREN expr RPAREN ;
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
            // Haxe.g:242:5: ( LPAREN expr RPAREN )
            // Haxe.g:242:9: LPAREN expr RPAREN
            {
            root_0 = (Object)adaptor.nil();

            LPAREN154=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_parExpression2096); if (state.failed) return retval;
            pushFollow(FOLLOW_expr_in_parExpression2099);
            expr155=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr155.getTree());
            RPAREN156=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_parExpression2101); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // Haxe.g:245:1: block : ( LBRACE ( blockStmt )* RBRACE -> ^( BLOCK_SCOPE[\"BLOCK_SCOPE\", true, $LBRACE] ( blockStmt )* RBRACE[$RBRACE, true] ) | SEMI );
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
            // Haxe.g:245:11: ( LBRACE ( blockStmt )* RBRACE -> ^( BLOCK_SCOPE[\"BLOCK_SCOPE\", true, $LBRACE] ( blockStmt )* RBRACE[$RBRACE, true] ) | SEMI )
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
                    // Haxe.g:245:16: LBRACE ( blockStmt )* RBRACE
                    {
                    LBRACE157=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_block2122); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LBRACE.add(LBRACE157);

                    // Haxe.g:245:23: ( blockStmt )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( ((LA36_0>=SEMI && LA36_0<=LPAREN)||LA36_0==IDENTIFIER||(LA36_0>=EXTERN && LA36_0<=PRIVATE)||(LA36_0>=PUBLIC && LA36_0<=OVERRIDE)||LA36_0==THIS||(LA36_0>=FUNCTION && LA36_0<=LBRACKET)||(LA36_0>=NEW && LA36_0<=IF)||LA36_0==FOR||(LA36_0>=WHILE && LA36_0<=LBRACE)||(LA36_0>=RETURN && LA36_0<=CONTINUE)||LA36_0==UNTYPED||(LA36_0>=PLUS && LA36_0<=SUB)||(LA36_0>=SUBSUB && LA36_0<=INTERFACE)||(LA36_0>=LONGLITERAL && LA36_0<=FALSE)) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // Haxe.g:245:24: blockStmt
                    	    {
                    	    pushFollow(FOLLOW_blockStmt_in_block2125);
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

                    RBRACE159=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_block2129); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RBRACE.add(RBRACE159);



                    // AST REWRITE
                    // elements: blockStmt, RBRACE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 245:43: -> ^( BLOCK_SCOPE[\"BLOCK_SCOPE\", true, $LBRACE] ( blockStmt )* RBRACE[$RBRACE, true] )
                    {
                        // Haxe.g:245:46: ^( BLOCK_SCOPE[\"BLOCK_SCOPE\", true, $LBRACE] ( blockStmt )* RBRACE[$RBRACE, true] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new BlockScopeNode(BLOCK_SCOPE, "BLOCK_SCOPE", true, LBRACE157), root_1);

                        // Haxe.g:245:106: ( blockStmt )*
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
                    // Haxe.g:246:10: SEMI
                    {
                    root_0 = (Object)adaptor.nil();

                    SEMI160=(Token)match(input,SEMI,FOLLOW_SEMI_in_block2160); if (state.failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // Haxe.g:249:1: blockStmt : ( varDecl | classDecl | statement );
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
            // Haxe.g:250:5: ( varDecl | classDecl | statement )
            int alt38=3;
            alt38 = dfa38.predict(input);
            switch (alt38) {
                case 1 :
                    // Haxe.g:250:10: varDecl
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_varDecl_in_blockStmt2185);
                    varDecl161=varDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDecl161.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:251:10: classDecl
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_classDecl_in_blockStmt2196);
                    classDecl162=classDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, classDecl162.getTree());

                    }
                    break;
                case 3 :
                    // Haxe.g:252:10: statement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_statement_in_blockStmt2207);
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
    // Haxe.g:256:1: breakStmt : BREAK SEMI ;
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
            // Haxe.g:257:5: ( BREAK SEMI )
            // Haxe.g:257:10: BREAK SEMI
            {
            root_0 = (Object)adaptor.nil();

            BREAK164=(Token)match(input,BREAK,FOLLOW_BREAK_in_breakStmt2255); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            BREAK164_tree = (Object)adaptor.create(BREAK164);
            adaptor.addChild(root_0, BREAK164_tree);
            }
            SEMI165=(Token)match(input,SEMI,FOLLOW_SEMI_in_breakStmt2257); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // Haxe.g:260:1: continueStmt : CONTINUE SEMI ;
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
            // Haxe.g:261:5: ( CONTINUE SEMI )
            // Haxe.g:261:10: CONTINUE SEMI
            {
            root_0 = (Object)adaptor.nil();

            CONTINUE166=(Token)match(input,CONTINUE,FOLLOW_CONTINUE_in_continueStmt2288); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            CONTINUE166_tree = (Object)adaptor.create(CONTINUE166);
            adaptor.addChild(root_0, CONTINUE166_tree);
            }
            SEMI167=(Token)match(input,SEMI,FOLLOW_SEMI_in_continueStmt2290); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // Haxe.g:264:1: caseStmt : ( CASE exprList COLON statement -> ^( CASE ( exprList )? ( statement )? ) | DEFAULT COLON statement -> ^( DEFAULT ( statement )? ) );
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
            // Haxe.g:264:9: ( CASE exprList COLON statement -> ^( CASE ( exprList )? ( statement )? ) | DEFAULT COLON statement -> ^( DEFAULT ( statement )? ) )
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
                    // Haxe.g:264:14: CASE exprList COLON statement
                    {
                    CASE168=(Token)match(input,CASE,FOLLOW_CASE_in_caseStmt2310); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CASE.add(CASE168);

                    pushFollow(FOLLOW_exprList_in_caseStmt2312);
                    exprList169=exprList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_exprList.add(exprList169.getTree());
                    COLON170=(Token)match(input,COLON,FOLLOW_COLON_in_caseStmt2314); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(COLON170);

                    pushFollow(FOLLOW_statement_in_caseStmt2316);
                    statement171=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement171.getTree());


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
                    // 264:48: -> ^( CASE ( exprList )? ( statement )? )
                    {
                        // Haxe.g:264:51: ^( CASE ( exprList )? ( statement )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_CASE.nextNode(), root_1);

                        // Haxe.g:264:58: ( exprList )?
                        if ( stream_exprList.hasNext() ) {
                            adaptor.addChild(root_1, stream_exprList.nextTree());

                        }
                        stream_exprList.reset();
                        // Haxe.g:264:68: ( statement )?
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
                    // Haxe.g:265:10: DEFAULT COLON statement
                    {
                    DEFAULT172=(Token)match(input,DEFAULT,FOLLOW_DEFAULT_in_caseStmt2343); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DEFAULT.add(DEFAULT172);

                    COLON173=(Token)match(input,COLON,FOLLOW_COLON_in_caseStmt2345); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(COLON173);

                    pushFollow(FOLLOW_statement_in_caseStmt2347);
                    statement174=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement174.getTree());


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
                    // 265:38: -> ^( DEFAULT ( statement )? )
                    {
                        // Haxe.g:265:41: ^( DEFAULT ( statement )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_DEFAULT.nextNode(), root_1);

                        // Haxe.g:265:51: ( statement )?
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
    // Haxe.g:268:1: defaultStmt : DEFAULT COLON ;
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
            // Haxe.g:269:12: ( DEFAULT COLON )
            // Haxe.g:269:17: DEFAULT COLON
            {
            root_0 = (Object)adaptor.nil();

            DEFAULT175=(Token)match(input,DEFAULT,FOLLOW_DEFAULT_in_defaultStmt2391); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            DEFAULT175_tree = (Object)adaptor.create(DEFAULT175);
            adaptor.addChild(root_0, DEFAULT175_tree);
            }
            COLON176=(Token)match(input,COLON,FOLLOW_COLON_in_defaultStmt2393); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // Haxe.g:272:1: catchStmtList : ( catchStmt catchStmtList | );
    public final HaxeParser.catchStmtList_return catchStmtList() throws RecognitionException {
        HaxeParser.catchStmtList_return retval = new HaxeParser.catchStmtList_return();
        retval.start = input.LT(1);
        int catchStmtList_StartIndex = input.index();
        Object root_0 = null;

        HaxeParser.catchStmt_return catchStmt177 = null;

        HaxeParser.catchStmtList_return catchStmtList178 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return retval; }
            // Haxe.g:273:5: ( catchStmt catchStmtList | )
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
                    // Haxe.g:273:7: catchStmt catchStmtList
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_catchStmt_in_catchStmtList2415);
                    catchStmt177=catchStmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, catchStmt177.getTree());
                    pushFollow(FOLLOW_catchStmtList_in_catchStmtList2417);
                    catchStmtList178=catchStmtList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, catchStmtList178.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:275:5: 
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
    // Haxe.g:277:1: catchStmt : CATCH LPAREN param RPAREN block -> ^( CATCH ( param )? ( block )? ) ;
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
            // Haxe.g:278:5: ( CATCH LPAREN param RPAREN block -> ^( CATCH ( param )? ( block )? ) )
            // Haxe.g:278:10: CATCH LPAREN param RPAREN block
            {
            CATCH179=(Token)match(input,CATCH,FOLLOW_CATCH_in_catchStmt2451); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CATCH.add(CATCH179);

            LPAREN180=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_catchStmt2453); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN180);

            pushFollow(FOLLOW_param_in_catchStmt2455);
            param181=param();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_param.add(param181.getTree());
            RPAREN182=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_catchStmt2457); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN182);

            pushFollow(FOLLOW_block_in_catchStmt2459);
            block183=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block183.getTree());


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
            // 278:42: -> ^( CATCH ( param )? ( block )? )
            {
                // Haxe.g:278:45: ^( CATCH ( param )? ( block )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_CATCH.nextNode(), root_1);

                // Haxe.g:278:53: ( param )?
                if ( stream_param.hasNext() ) {
                    adaptor.addChild(root_1, stream_param.nextTree());

                }
                stream_param.reset();
                // Haxe.g:278:60: ( block )?
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
    // Haxe.g:283:1: exprListOpt : ( exprList | );
    public final HaxeParser.exprListOpt_return exprListOpt() throws RecognitionException {
        HaxeParser.exprListOpt_return retval = new HaxeParser.exprListOpt_return();
        retval.start = input.LT(1);
        int exprListOpt_StartIndex = input.index();
        Object root_0 = null;

        HaxeParser.exprList_return exprList184 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return retval; }
            // Haxe.g:284:5: ( exprList | )
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
                    // Haxe.g:284:10: exprList
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_exprList_in_exprListOpt2497);
                    exprList184=exprList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, exprList184.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:286:5: 
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
    // Haxe.g:288:1: exprList : expr ( COMMA expr )* ;
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
            // Haxe.g:288:9: ( expr ( COMMA expr )* )
            // Haxe.g:288:14: expr ( COMMA expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_expr_in_exprList2522);
            expr185=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr185.getTree());
            // Haxe.g:288:19: ( COMMA expr )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==COMMA) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // Haxe.g:288:20: COMMA expr
            	    {
            	    COMMA186=(Token)match(input,COMMA,FOLLOW_COMMA_in_exprList2525); if (state.failed) return retval;
            	    pushFollow(FOLLOW_expr_in_exprList2528);
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
    // Haxe.g:291:1: expr : ( assignExpr | UNTYPED assignExpr -> ^( UNTYPED assignExpr ) );
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
            // Haxe.g:291:9: ( assignExpr | UNTYPED assignExpr -> ^( UNTYPED assignExpr ) )
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
                    // Haxe.g:291:14: assignExpr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_assignExpr_in_expr2553);
                    assignExpr188=assignExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignExpr188.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:292:10: UNTYPED assignExpr
                    {
                    UNTYPED189=(Token)match(input,UNTYPED,FOLLOW_UNTYPED_in_expr2564); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_UNTYPED.add(UNTYPED189);

                    pushFollow(FOLLOW_assignExpr_in_expr2566);
                    assignExpr190=assignExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_assignExpr.add(assignExpr190.getTree());


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
                    // 292:32: -> ^( UNTYPED assignExpr )
                    {
                        // Haxe.g:292:35: ^( UNTYPED assignExpr )
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
    // Haxe.g:295:1: assignExpr : iterExpr ( assignOp iterExpr )* ;
    public final HaxeParser.assignExpr_return assignExpr() throws RecognitionException {
        HaxeParser.assignExpr_return retval = new HaxeParser.assignExpr_return();
        retval.start = input.LT(1);
        int assignExpr_StartIndex = input.index();
        Object root_0 = null;

        HaxeParser.iterExpr_return iterExpr191 = null;

        HaxeParser.assignOp_return assignOp192 = null;

        HaxeParser.iterExpr_return iterExpr193 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 43) ) { return retval; }
            // Haxe.g:296:5: ( iterExpr ( assignOp iterExpr )* )
            // Haxe.g:296:11: iterExpr ( assignOp iterExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_iterExpr_in_assignExpr2598);
            iterExpr191=iterExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, iterExpr191.getTree());
            // Haxe.g:296:20: ( assignOp iterExpr )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( ((LA44_0>=EQ && LA44_0<=AMPEQ)) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // Haxe.g:296:21: assignOp iterExpr
            	    {
            	    pushFollow(FOLLOW_assignOp_in_assignExpr2601);
            	    assignOp192=assignOp();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(assignOp192.getTree(), root_0);
            	    pushFollow(FOLLOW_iterExpr_in_assignExpr2604);
            	    iterExpr193=iterExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, iterExpr193.getTree());

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
    // Haxe.g:299:1: iterExpr : ternaryExpr ( ELLIPSIS ternaryExpr )* ;
    public final HaxeParser.iterExpr_return iterExpr() throws RecognitionException {
        HaxeParser.iterExpr_return retval = new HaxeParser.iterExpr_return();
        retval.start = input.LT(1);
        int iterExpr_StartIndex = input.index();
        Object root_0 = null;

        Token ELLIPSIS195=null;
        HaxeParser.ternaryExpr_return ternaryExpr194 = null;

        HaxeParser.ternaryExpr_return ternaryExpr196 = null;


        Object ELLIPSIS195_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 44) ) { return retval; }
            // Haxe.g:299:9: ( ternaryExpr ( ELLIPSIS ternaryExpr )* )
            // Haxe.g:299:14: ternaryExpr ( ELLIPSIS ternaryExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_ternaryExpr_in_iterExpr2622);
            ternaryExpr194=ternaryExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, ternaryExpr194.getTree());
            // Haxe.g:299:26: ( ELLIPSIS ternaryExpr )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==ELLIPSIS) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // Haxe.g:299:27: ELLIPSIS ternaryExpr
            	    {
            	    ELLIPSIS195=(Token)match(input,ELLIPSIS,FOLLOW_ELLIPSIS_in_iterExpr2625); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    ELLIPSIS195_tree = (Object)adaptor.create(ELLIPSIS195);
            	    root_0 = (Object)adaptor.becomeRoot(ELLIPSIS195_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ternaryExpr_in_iterExpr2628);
            	    ternaryExpr196=ternaryExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, ternaryExpr196.getTree());

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
    // Haxe.g:302:1: ternaryExpr : logicOrExpr ( QUES expr COLON logicOrExpr )* ;
    public final HaxeParser.ternaryExpr_return ternaryExpr() throws RecognitionException {
        HaxeParser.ternaryExpr_return retval = new HaxeParser.ternaryExpr_return();
        retval.start = input.LT(1);
        int ternaryExpr_StartIndex = input.index();
        Object root_0 = null;

        Token QUES198=null;
        Token COLON200=null;
        HaxeParser.logicOrExpr_return logicOrExpr197 = null;

        HaxeParser.expr_return expr199 = null;

        HaxeParser.logicOrExpr_return logicOrExpr201 = null;


        Object QUES198_tree=null;
        Object COLON200_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 45) ) { return retval; }
            // Haxe.g:303:5: ( logicOrExpr ( QUES expr COLON logicOrExpr )* )
            // Haxe.g:303:10: logicOrExpr ( QUES expr COLON logicOrExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_logicOrExpr_in_ternaryExpr2650);
            logicOrExpr197=logicOrExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, logicOrExpr197.getTree());
            // Haxe.g:303:22: ( QUES expr COLON logicOrExpr )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==QUES) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // Haxe.g:303:23: QUES expr COLON logicOrExpr
            	    {
            	    QUES198=(Token)match(input,QUES,FOLLOW_QUES_in_ternaryExpr2653); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    QUES198_tree = (Object)adaptor.create(QUES198);
            	    root_0 = (Object)adaptor.becomeRoot(QUES198_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_expr_in_ternaryExpr2656);
            	    expr199=expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr199.getTree());
            	    COLON200=(Token)match(input,COLON,FOLLOW_COLON_in_ternaryExpr2658); if (state.failed) return retval;
            	    pushFollow(FOLLOW_logicOrExpr_in_ternaryExpr2661);
            	    logicOrExpr201=logicOrExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, logicOrExpr201.getTree());

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
    // Haxe.g:306:1: logicOrExpr : logicAndExpr ( BARBAR logicAndExpr )* ;
    public final HaxeParser.logicOrExpr_return logicOrExpr() throws RecognitionException {
        HaxeParser.logicOrExpr_return retval = new HaxeParser.logicOrExpr_return();
        retval.start = input.LT(1);
        int logicOrExpr_StartIndex = input.index();
        Object root_0 = null;

        Token BARBAR203=null;
        HaxeParser.logicAndExpr_return logicAndExpr202 = null;

        HaxeParser.logicAndExpr_return logicAndExpr204 = null;


        Object BARBAR203_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 46) ) { return retval; }
            // Haxe.g:307:5: ( logicAndExpr ( BARBAR logicAndExpr )* )
            // Haxe.g:307:10: logicAndExpr ( BARBAR logicAndExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_logicAndExpr_in_logicOrExpr2683);
            logicAndExpr202=logicAndExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, logicAndExpr202.getTree());
            // Haxe.g:307:23: ( BARBAR logicAndExpr )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==BARBAR) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // Haxe.g:307:24: BARBAR logicAndExpr
            	    {
            	    BARBAR203=(Token)match(input,BARBAR,FOLLOW_BARBAR_in_logicOrExpr2686); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    BARBAR203_tree = (Object)adaptor.create(BARBAR203);
            	    root_0 = (Object)adaptor.becomeRoot(BARBAR203_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_logicAndExpr_in_logicOrExpr2689);
            	    logicAndExpr204=logicAndExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, logicAndExpr204.getTree());

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
    // Haxe.g:310:1: logicAndExpr : ( cmpExpr ) ( AMPAMP cmpExpr )* ;
    public final HaxeParser.logicAndExpr_return logicAndExpr() throws RecognitionException {
        HaxeParser.logicAndExpr_return retval = new HaxeParser.logicAndExpr_return();
        retval.start = input.LT(1);
        int logicAndExpr_StartIndex = input.index();
        Object root_0 = null;

        Token AMPAMP206=null;
        HaxeParser.cmpExpr_return cmpExpr205 = null;

        HaxeParser.cmpExpr_return cmpExpr207 = null;


        Object AMPAMP206_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 47) ) { return retval; }
            // Haxe.g:311:5: ( ( cmpExpr ) ( AMPAMP cmpExpr )* )
            // Haxe.g:311:10: ( cmpExpr ) ( AMPAMP cmpExpr )*
            {
            root_0 = (Object)adaptor.nil();

            // Haxe.g:311:10: ( cmpExpr )
            // Haxe.g:311:11: cmpExpr
            {
            pushFollow(FOLLOW_cmpExpr_in_logicAndExpr2716);
            cmpExpr205=cmpExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, cmpExpr205.getTree());

            }

            // Haxe.g:311:20: ( AMPAMP cmpExpr )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==AMPAMP) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // Haxe.g:311:21: AMPAMP cmpExpr
            	    {
            	    AMPAMP206=(Token)match(input,AMPAMP,FOLLOW_AMPAMP_in_logicAndExpr2720); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    AMPAMP206_tree = (Object)adaptor.create(AMPAMP206);
            	    root_0 = (Object)adaptor.becomeRoot(AMPAMP206_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_cmpExpr_in_logicAndExpr2723);
            	    cmpExpr207=cmpExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, cmpExpr207.getTree());

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
    // Haxe.g:314:1: cmpExpr : ( bitExpr ) ( ( EQEQ | BANGEQ | GTEQ | LTEQ | GT | LT ) bitExpr )* ;
    public final HaxeParser.cmpExpr_return cmpExpr() throws RecognitionException {
        HaxeParser.cmpExpr_return retval = new HaxeParser.cmpExpr_return();
        retval.start = input.LT(1);
        int cmpExpr_StartIndex = input.index();
        Object root_0 = null;

        Token EQEQ209=null;
        Token BANGEQ210=null;
        Token GTEQ211=null;
        Token LTEQ212=null;
        Token GT213=null;
        Token LT214=null;
        HaxeParser.bitExpr_return bitExpr208 = null;

        HaxeParser.bitExpr_return bitExpr215 = null;


        Object EQEQ209_tree=null;
        Object BANGEQ210_tree=null;
        Object GTEQ211_tree=null;
        Object LTEQ212_tree=null;
        Object GT213_tree=null;
        Object LT214_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 48) ) { return retval; }
            // Haxe.g:314:9: ( ( bitExpr ) ( ( EQEQ | BANGEQ | GTEQ | LTEQ | GT | LT ) bitExpr )* )
            // Haxe.g:314:14: ( bitExpr ) ( ( EQEQ | BANGEQ | GTEQ | LTEQ | GT | LT ) bitExpr )*
            {
            root_0 = (Object)adaptor.nil();

            // Haxe.g:314:14: ( bitExpr )
            // Haxe.g:314:15: bitExpr
            {
            pushFollow(FOLLOW_bitExpr_in_cmpExpr2746);
            bitExpr208=bitExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bitExpr208.getTree());

            }

            // Haxe.g:314:24: ( ( EQEQ | BANGEQ | GTEQ | LTEQ | GT | LT ) bitExpr )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( ((LA50_0>=LT && LA50_0<=GT)||(LA50_0>=EQEQ && LA50_0<=LTEQ)) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // Haxe.g:314:25: ( EQEQ | BANGEQ | GTEQ | LTEQ | GT | LT ) bitExpr
            	    {
            	    // Haxe.g:314:25: ( EQEQ | BANGEQ | GTEQ | LTEQ | GT | LT )
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
            	            // Haxe.g:314:26: EQEQ
            	            {
            	            EQEQ209=(Token)match(input,EQEQ,FOLLOW_EQEQ_in_cmpExpr2751); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            EQEQ209_tree = (Object)adaptor.create(EQEQ209);
            	            root_0 = (Object)adaptor.becomeRoot(EQEQ209_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // Haxe.g:314:33: BANGEQ
            	            {
            	            BANGEQ210=(Token)match(input,BANGEQ,FOLLOW_BANGEQ_in_cmpExpr2755); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            BANGEQ210_tree = (Object)adaptor.create(BANGEQ210);
            	            root_0 = (Object)adaptor.becomeRoot(BANGEQ210_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // Haxe.g:314:43: GTEQ
            	            {
            	            GTEQ211=(Token)match(input,GTEQ,FOLLOW_GTEQ_in_cmpExpr2760); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            GTEQ211_tree = (Object)adaptor.create(GTEQ211);
            	            root_0 = (Object)adaptor.becomeRoot(GTEQ211_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // Haxe.g:314:51: LTEQ
            	            {
            	            LTEQ212=(Token)match(input,LTEQ,FOLLOW_LTEQ_in_cmpExpr2765); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            LTEQ212_tree = (Object)adaptor.create(LTEQ212);
            	            root_0 = (Object)adaptor.becomeRoot(LTEQ212_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 5 :
            	            // Haxe.g:314:59: GT
            	            {
            	            GT213=(Token)match(input,GT,FOLLOW_GT_in_cmpExpr2770); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            GT213_tree = (Object)adaptor.create(GT213);
            	            root_0 = (Object)adaptor.becomeRoot(GT213_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 6 :
            	            // Haxe.g:314:65: LT
            	            {
            	            LT214=(Token)match(input,LT,FOLLOW_LT_in_cmpExpr2775); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            LT214_tree = (Object)adaptor.create(LT214);
            	            root_0 = (Object)adaptor.becomeRoot(LT214_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_bitExpr_in_cmpExpr2780);
            	    bitExpr215=bitExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, bitExpr215.getTree());

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
    // Haxe.g:317:1: bitExpr : ( shiftExpr ) ( BAR shiftExpr | AMP shiftExpr | CARET shiftExpr )* ;
    public final HaxeParser.bitExpr_return bitExpr() throws RecognitionException {
        HaxeParser.bitExpr_return retval = new HaxeParser.bitExpr_return();
        retval.start = input.LT(1);
        int bitExpr_StartIndex = input.index();
        Object root_0 = null;

        Token BAR217=null;
        Token AMP219=null;
        Token CARET221=null;
        HaxeParser.shiftExpr_return shiftExpr216 = null;

        HaxeParser.shiftExpr_return shiftExpr218 = null;

        HaxeParser.shiftExpr_return shiftExpr220 = null;

        HaxeParser.shiftExpr_return shiftExpr222 = null;


        Object BAR217_tree=null;
        Object AMP219_tree=null;
        Object CARET221_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 49) ) { return retval; }
            // Haxe.g:317:9: ( ( shiftExpr ) ( BAR shiftExpr | AMP shiftExpr | CARET shiftExpr )* )
            // Haxe.g:317:14: ( shiftExpr ) ( BAR shiftExpr | AMP shiftExpr | CARET shiftExpr )*
            {
            root_0 = (Object)adaptor.nil();

            // Haxe.g:317:14: ( shiftExpr )
            // Haxe.g:317:15: shiftExpr
            {
            pushFollow(FOLLOW_shiftExpr_in_bitExpr2803);
            shiftExpr216=shiftExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, shiftExpr216.getTree());

            }

            // Haxe.g:317:26: ( BAR shiftExpr | AMP shiftExpr | CARET shiftExpr )*
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
            	    // Haxe.g:317:27: BAR shiftExpr
            	    {
            	    BAR217=(Token)match(input,BAR,FOLLOW_BAR_in_bitExpr2807); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    BAR217_tree = (Object)adaptor.create(BAR217);
            	    root_0 = (Object)adaptor.becomeRoot(BAR217_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_shiftExpr_in_bitExpr2810);
            	    shiftExpr218=shiftExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, shiftExpr218.getTree());

            	    }
            	    break;
            	case 2 :
            	    // Haxe.g:317:44: AMP shiftExpr
            	    {
            	    AMP219=(Token)match(input,AMP,FOLLOW_AMP_in_bitExpr2814); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    AMP219_tree = (Object)adaptor.create(AMP219);
            	    root_0 = (Object)adaptor.becomeRoot(AMP219_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_shiftExpr_in_bitExpr2817);
            	    shiftExpr220=shiftExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, shiftExpr220.getTree());

            	    }
            	    break;
            	case 3 :
            	    // Haxe.g:317:60: CARET shiftExpr
            	    {
            	    CARET221=(Token)match(input,CARET,FOLLOW_CARET_in_bitExpr2820); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    CARET221_tree = (Object)adaptor.create(CARET221);
            	    root_0 = (Object)adaptor.becomeRoot(CARET221_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_shiftExpr_in_bitExpr2823);
            	    shiftExpr222=shiftExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, shiftExpr222.getTree());

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
    // Haxe.g:320:1: shiftExpr : ( addExpr ) ( LTLT addExpr | ( GT GT ) addExpr | GTGTGT addExpr )* ;
    public final HaxeParser.shiftExpr_return shiftExpr() throws RecognitionException {
        HaxeParser.shiftExpr_return retval = new HaxeParser.shiftExpr_return();
        retval.start = input.LT(1);
        int shiftExpr_StartIndex = input.index();
        Object root_0 = null;

        Token LTLT224=null;
        Token GT226=null;
        Token GT227=null;
        Token GTGTGT229=null;
        HaxeParser.addExpr_return addExpr223 = null;

        HaxeParser.addExpr_return addExpr225 = null;

        HaxeParser.addExpr_return addExpr228 = null;

        HaxeParser.addExpr_return addExpr230 = null;


        Object LTLT224_tree=null;
        Object GT226_tree=null;
        Object GT227_tree=null;
        Object GTGTGT229_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 50) ) { return retval; }
            // Haxe.g:321:5: ( ( addExpr ) ( LTLT addExpr | ( GT GT ) addExpr | GTGTGT addExpr )* )
            // Haxe.g:321:10: ( addExpr ) ( LTLT addExpr | ( GT GT ) addExpr | GTGTGT addExpr )*
            {
            root_0 = (Object)adaptor.nil();

            // Haxe.g:321:10: ( addExpr )
            // Haxe.g:321:11: addExpr
            {
            pushFollow(FOLLOW_addExpr_in_shiftExpr2846);
            addExpr223=addExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, addExpr223.getTree());

            }

            // Haxe.g:321:20: ( LTLT addExpr | ( GT GT ) addExpr | GTGTGT addExpr )*
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
            	    // Haxe.g:321:21: LTLT addExpr
            	    {
            	    LTLT224=(Token)match(input,LTLT,FOLLOW_LTLT_in_shiftExpr2850); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    LTLT224_tree = (Object)adaptor.create(LTLT224);
            	    root_0 = (Object)adaptor.becomeRoot(LTLT224_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_addExpr_in_shiftExpr2854);
            	    addExpr225=addExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, addExpr225.getTree());

            	    }
            	    break;
            	case 2 :
            	    // Haxe.g:321:38: ( GT GT ) addExpr
            	    {
            	    // Haxe.g:321:38: ( GT GT )
            	    // Haxe.g:321:39: GT GT
            	    {
            	    GT226=(Token)match(input,GT,FOLLOW_GT_in_shiftExpr2859); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    GT226_tree = (Object)adaptor.create(GT226);
            	    adaptor.addChild(root_0, GT226_tree);
            	    }
            	    GT227=(Token)match(input,GT,FOLLOW_GT_in_shiftExpr2861); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    GT227_tree = (Object)adaptor.create(GT227);
            	    adaptor.addChild(root_0, GT227_tree);
            	    }

            	    }

            	    pushFollow(FOLLOW_addExpr_in_shiftExpr2866);
            	    addExpr228=addExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, addExpr228.getTree());

            	    }
            	    break;
            	case 3 :
            	    // Haxe.g:321:58: GTGTGT addExpr
            	    {
            	    GTGTGT229=(Token)match(input,GTGTGT,FOLLOW_GTGTGT_in_shiftExpr2870); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    GTGTGT229_tree = (Object)adaptor.create(GTGTGT229);
            	    root_0 = (Object)adaptor.becomeRoot(GTGTGT229_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_addExpr_in_shiftExpr2873);
            	    addExpr230=addExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, addExpr230.getTree());

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
    // Haxe.g:324:1: addExpr : ( multExpr ) ( ( PLUS | SUB ) multExpr )* ;
    public final HaxeParser.addExpr_return addExpr() throws RecognitionException {
        HaxeParser.addExpr_return retval = new HaxeParser.addExpr_return();
        retval.start = input.LT(1);
        int addExpr_StartIndex = input.index();
        Object root_0 = null;

        Token PLUS232=null;
        Token SUB233=null;
        HaxeParser.multExpr_return multExpr231 = null;

        HaxeParser.multExpr_return multExpr234 = null;


        Object PLUS232_tree=null;
        Object SUB233_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 51) ) { return retval; }
            // Haxe.g:324:9: ( ( multExpr ) ( ( PLUS | SUB ) multExpr )* )
            // Haxe.g:324:15: ( multExpr ) ( ( PLUS | SUB ) multExpr )*
            {
            root_0 = (Object)adaptor.nil();

            // Haxe.g:324:15: ( multExpr )
            // Haxe.g:324:16: multExpr
            {
            pushFollow(FOLLOW_multExpr_in_addExpr2893);
            multExpr231=multExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, multExpr231.getTree());

            }

            // Haxe.g:324:26: ( ( PLUS | SUB ) multExpr )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( ((LA54_0>=PLUS && LA54_0<=SUB)) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // Haxe.g:324:27: ( PLUS | SUB ) multExpr
            	    {
            	    // Haxe.g:324:27: ( PLUS | SUB )
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
            	            // Haxe.g:324:28: PLUS
            	            {
            	            PLUS232=(Token)match(input,PLUS,FOLLOW_PLUS_in_addExpr2898); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            PLUS232_tree = (Object)adaptor.create(PLUS232);
            	            root_0 = (Object)adaptor.becomeRoot(PLUS232_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // Haxe.g:324:36: SUB
            	            {
            	            SUB233=(Token)match(input,SUB,FOLLOW_SUB_in_addExpr2903); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            SUB233_tree = (Object)adaptor.create(SUB233);
            	            root_0 = (Object)adaptor.becomeRoot(SUB233_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_multExpr_in_addExpr2907);
            	    multExpr234=multExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, multExpr234.getTree());

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
    // Haxe.g:327:1: multExpr : ( prefixExpr ) ( ( STAR | SLASH | PERCENT ) prefixExpr )* ;
    public final HaxeParser.multExpr_return multExpr() throws RecognitionException {
        HaxeParser.multExpr_return retval = new HaxeParser.multExpr_return();
        retval.start = input.LT(1);
        int multExpr_StartIndex = input.index();
        Object root_0 = null;

        Token STAR236=null;
        Token SLASH237=null;
        Token PERCENT238=null;
        HaxeParser.prefixExpr_return prefixExpr235 = null;

        HaxeParser.prefixExpr_return prefixExpr239 = null;


        Object STAR236_tree=null;
        Object SLASH237_tree=null;
        Object PERCENT238_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 52) ) { return retval; }
            // Haxe.g:327:9: ( ( prefixExpr ) ( ( STAR | SLASH | PERCENT ) prefixExpr )* )
            // Haxe.g:327:14: ( prefixExpr ) ( ( STAR | SLASH | PERCENT ) prefixExpr )*
            {
            root_0 = (Object)adaptor.nil();

            // Haxe.g:327:14: ( prefixExpr )
            // Haxe.g:327:15: prefixExpr
            {
            pushFollow(FOLLOW_prefixExpr_in_multExpr2930);
            prefixExpr235=prefixExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, prefixExpr235.getTree());

            }

            // Haxe.g:327:27: ( ( STAR | SLASH | PERCENT ) prefixExpr )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( ((LA56_0>=STAR && LA56_0<=PERCENT)) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // Haxe.g:327:28: ( STAR | SLASH | PERCENT ) prefixExpr
            	    {
            	    // Haxe.g:327:28: ( STAR | SLASH | PERCENT )
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
            	            // Haxe.g:327:29: STAR
            	            {
            	            STAR236=(Token)match(input,STAR,FOLLOW_STAR_in_multExpr2935); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            STAR236_tree = (Object)adaptor.create(STAR236);
            	            root_0 = (Object)adaptor.becomeRoot(STAR236_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // Haxe.g:327:35: SLASH
            	            {
            	            SLASH237=(Token)match(input,SLASH,FOLLOW_SLASH_in_multExpr2938); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            SLASH237_tree = (Object)adaptor.create(SLASH237);
            	            root_0 = (Object)adaptor.becomeRoot(SLASH237_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // Haxe.g:327:42: PERCENT
            	            {
            	            PERCENT238=(Token)match(input,PERCENT,FOLLOW_PERCENT_in_multExpr2941); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            PERCENT238_tree = (Object)adaptor.create(PERCENT238);
            	            root_0 = (Object)adaptor.becomeRoot(PERCENT238_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_prefixExpr_in_multExpr2945);
            	    prefixExpr239=prefixExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, prefixExpr239.getTree());

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
    // Haxe.g:330:1: prefixExpr : ( ( SUB | SUBSUB | PLUS | PLUSPLUS | BANG | TILDE ) prefixExpr | newExpr | cast | suffixExpr );
    public final HaxeParser.prefixExpr_return prefixExpr() throws RecognitionException {
        HaxeParser.prefixExpr_return retval = new HaxeParser.prefixExpr_return();
        retval.start = input.LT(1);
        int prefixExpr_StartIndex = input.index();
        Object root_0 = null;

        Token SUB240=null;
        Token SUBSUB241=null;
        Token PLUS242=null;
        Token PLUSPLUS243=null;
        Token BANG244=null;
        Token TILDE245=null;
        HaxeParser.prefixExpr_return prefixExpr246 = null;

        HaxeParser.newExpr_return newExpr247 = null;

        HaxeParser.cast_return cast248 = null;

        HaxeParser.suffixExpr_return suffixExpr249 = null;


        Object SUB240_tree=null;
        Object SUBSUB241_tree=null;
        Object PLUS242_tree=null;
        Object PLUSPLUS243_tree=null;
        Object BANG244_tree=null;
        Object TILDE245_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 53) ) { return retval; }
            // Haxe.g:331:5: ( ( SUB | SUBSUB | PLUS | PLUSPLUS | BANG | TILDE ) prefixExpr | newExpr | cast | suffixExpr )
            int alt58=4;
            switch ( input.LA(1) ) {
            case PLUS:
            case SUB:
            case SUBSUB:
            case PLUSPLUS:
            case BANG:
            case TILDE:
                {
                alt58=1;
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
                    // Haxe.g:331:10: ( SUB | SUBSUB | PLUS | PLUSPLUS | BANG | TILDE ) prefixExpr
                    {
                    root_0 = (Object)adaptor.nil();

                    // Haxe.g:331:10: ( SUB | SUBSUB | PLUS | PLUSPLUS | BANG | TILDE )
                    int alt57=6;
                    switch ( input.LA(1) ) {
                    case SUB:
                        {
                        alt57=1;
                        }
                        break;
                    case SUBSUB:
                        {
                        alt57=2;
                        }
                        break;
                    case PLUS:
                        {
                        alt57=3;
                        }
                        break;
                    case PLUSPLUS:
                        {
                        alt57=4;
                        }
                        break;
                    case BANG:
                        {
                        alt57=5;
                        }
                        break;
                    case TILDE:
                        {
                        alt57=6;
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
                            // Haxe.g:331:11: SUB
                            {
                            SUB240=(Token)match(input,SUB,FOLLOW_SUB_in_prefixExpr2972); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            SUB240_tree = (Object)adaptor.create(SUB240);
                            root_0 = (Object)adaptor.becomeRoot(SUB240_tree, root_0);
                            }

                            }
                            break;
                        case 2 :
                            // Haxe.g:331:16: SUBSUB
                            {
                            SUBSUB241=(Token)match(input,SUBSUB,FOLLOW_SUBSUB_in_prefixExpr2975); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            SUBSUB241_tree = (Object)adaptor.create(SUBSUB241);
                            root_0 = (Object)adaptor.becomeRoot(SUBSUB241_tree, root_0);
                            }

                            }
                            break;
                        case 3 :
                            // Haxe.g:331:24: PLUS
                            {
                            PLUS242=(Token)match(input,PLUS,FOLLOW_PLUS_in_prefixExpr2978); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            PLUS242_tree = (Object)adaptor.create(PLUS242);
                            root_0 = (Object)adaptor.becomeRoot(PLUS242_tree, root_0);
                            }

                            }
                            break;
                        case 4 :
                            // Haxe.g:331:30: PLUSPLUS
                            {
                            PLUSPLUS243=(Token)match(input,PLUSPLUS,FOLLOW_PLUSPLUS_in_prefixExpr2981); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            PLUSPLUS243_tree = (Object)adaptor.create(PLUSPLUS243);
                            root_0 = (Object)adaptor.becomeRoot(PLUSPLUS243_tree, root_0);
                            }

                            }
                            break;
                        case 5 :
                            // Haxe.g:331:40: BANG
                            {
                            BANG244=(Token)match(input,BANG,FOLLOW_BANG_in_prefixExpr2984); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            BANG244_tree = (Object)adaptor.create(BANG244);
                            root_0 = (Object)adaptor.becomeRoot(BANG244_tree, root_0);
                            }

                            }
                            break;
                        case 6 :
                            // Haxe.g:331:46: TILDE
                            {
                            TILDE245=(Token)match(input,TILDE,FOLLOW_TILDE_in_prefixExpr2987); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            TILDE245_tree = (Object)adaptor.create(TILDE245);
                            root_0 = (Object)adaptor.becomeRoot(TILDE245_tree, root_0);
                            }

                            }
                            break;

                    }

                    pushFollow(FOLLOW_prefixExpr_in_prefixExpr2991);
                    prefixExpr246=prefixExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, prefixExpr246.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:332:10: newExpr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_newExpr_in_prefixExpr3002);
                    newExpr247=newExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, newExpr247.getTree());

                    }
                    break;
                case 3 :
                    // Haxe.g:333:10: cast
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_cast_in_prefixExpr3013);
                    cast248=cast();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, cast248.getTree());

                    }
                    break;
                case 4 :
                    // Haxe.g:334:10: suffixExpr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_suffixExpr_in_prefixExpr3024);
                    suffixExpr249=suffixExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, suffixExpr249.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // Haxe.g:337:1: suffixExpr : ( value methodCallOrSliceList -> ^( SUFFIX_EXPR[\"CallOrSlice\",true] ( value )? ( methodCallOrSliceList )? ) | value PLUSPLUS -> ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] ( value )? ( PLUSPLUS )? ) | value SUBSUB -> ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] ( value )? SUBSUB ) | value typeParamOpt );
    public final HaxeParser.suffixExpr_return suffixExpr() throws RecognitionException {
        HaxeParser.suffixExpr_return retval = new HaxeParser.suffixExpr_return();
        retval.start = input.LT(1);
        int suffixExpr_StartIndex = input.index();
        Object root_0 = null;

        Token PLUSPLUS253=null;
        Token SUBSUB255=null;
        HaxeParser.value_return value250 = null;

        HaxeParser.methodCallOrSliceList_return methodCallOrSliceList251 = null;

        HaxeParser.value_return value252 = null;

        HaxeParser.value_return value254 = null;

        HaxeParser.value_return value256 = null;

        HaxeParser.typeParamOpt_return typeParamOpt257 = null;


        Object PLUSPLUS253_tree=null;
        Object SUBSUB255_tree=null;
        RewriteRuleTokenStream stream_SUBSUB=new RewriteRuleTokenStream(adaptor,"token SUBSUB");
        RewriteRuleTokenStream stream_PLUSPLUS=new RewriteRuleTokenStream(adaptor,"token PLUSPLUS");
        RewriteRuleSubtreeStream stream_methodCallOrSliceList=new RewriteRuleSubtreeStream(adaptor,"rule methodCallOrSliceList");
        RewriteRuleSubtreeStream stream_value=new RewriteRuleSubtreeStream(adaptor,"rule value");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 54) ) { return retval; }
            // Haxe.g:338:5: ( value methodCallOrSliceList -> ^( SUFFIX_EXPR[\"CallOrSlice\",true] ( value )? ( methodCallOrSliceList )? ) | value PLUSPLUS -> ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] ( value )? ( PLUSPLUS )? ) | value SUBSUB -> ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] ( value )? SUBSUB ) | value typeParamOpt )
            int alt59=4;
            alt59 = dfa59.predict(input);
            switch (alt59) {
                case 1 :
                    // Haxe.g:338:10: value methodCallOrSliceList
                    {
                    pushFollow(FOLLOW_value_in_suffixExpr3048);
                    value250=value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_value.add(value250.getTree());
                    pushFollow(FOLLOW_methodCallOrSliceList_in_suffixExpr3050);
                    methodCallOrSliceList251=methodCallOrSliceList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_methodCallOrSliceList.add(methodCallOrSliceList251.getTree());


                    // AST REWRITE
                    // elements: value, methodCallOrSliceList
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 338:38: -> ^( SUFFIX_EXPR[\"CallOrSlice\",true] ( value )? ( methodCallOrSliceList )? )
                    {
                        // Haxe.g:338:41: ^( SUFFIX_EXPR[\"CallOrSlice\",true] ( value )? ( methodCallOrSliceList )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new HaxeTree(SUFFIX_EXPR, "CallOrSlice", true), root_1);

                        // Haxe.g:338:85: ( value )?
                        if ( stream_value.hasNext() ) {
                            adaptor.addChild(root_1, stream_value.nextTree());

                        }
                        stream_value.reset();
                        // Haxe.g:338:92: ( methodCallOrSliceList )?
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
                    // Haxe.g:339:10: value PLUSPLUS
                    {
                    pushFollow(FOLLOW_value_in_suffixExpr3077);
                    value252=value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_value.add(value252.getTree());
                    PLUSPLUS253=(Token)match(input,PLUSPLUS,FOLLOW_PLUSPLUS_in_suffixExpr3079); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PLUSPLUS.add(PLUSPLUS253);



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
                    // 339:37: -> ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] ( value )? ( PLUSPLUS )? )
                    {
                        // Haxe.g:339:40: ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] ( value )? ( PLUSPLUS )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new HaxeTree(SUFFIX_EXPR, "SUFFIX_EXPR", true), root_1);

                        // Haxe.g:339:84: ( value )?
                        if ( stream_value.hasNext() ) {
                            adaptor.addChild(root_1, stream_value.nextTree());

                        }
                        stream_value.reset();
                        // Haxe.g:339:91: ( PLUSPLUS )?
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
                    // Haxe.g:340:10: value SUBSUB
                    {
                    pushFollow(FOLLOW_value_in_suffixExpr3118);
                    value254=value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_value.add(value254.getTree());
                    SUBSUB255=(Token)match(input,SUBSUB,FOLLOW_SUBSUB_in_suffixExpr3120); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SUBSUB.add(SUBSUB255);



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
                    // 340:35: -> ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] ( value )? SUBSUB )
                    {
                        // Haxe.g:340:38: ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] ( value )? SUBSUB )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new HaxeTree(SUFFIX_EXPR, "SUFFIX_EXPR", true), root_1);

                        // Haxe.g:340:82: ( value )?
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
                    // Haxe.g:341:10: value typeParamOpt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_value_in_suffixExpr3158);
                    value256=value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, value256.getTree());
                    pushFollow(FOLLOW_typeParamOpt_in_suffixExpr3160);
                    typeParamOpt257=typeParamOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeParamOpt257.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // Haxe.g:344:1: methodCallOrSlice : ( LPAREN exprListOpt RPAREN -> ^( SUFFIX_EXPR[\"MethodCall\",true] ( exprListOpt )? ) | LBRACKET expr RBRACKET -> ^( SUFFIX_EXPR[\"Slice\",true] ( expr )? ) );
    public final HaxeParser.methodCallOrSlice_return methodCallOrSlice() throws RecognitionException {
        HaxeParser.methodCallOrSlice_return retval = new HaxeParser.methodCallOrSlice_return();
        retval.start = input.LT(1);
        int methodCallOrSlice_StartIndex = input.index();
        Object root_0 = null;

        Token LPAREN258=null;
        Token RPAREN260=null;
        Token LBRACKET261=null;
        Token RBRACKET263=null;
        HaxeParser.exprListOpt_return exprListOpt259 = null;

        HaxeParser.expr_return expr262 = null;


        Object LPAREN258_tree=null;
        Object RPAREN260_tree=null;
        Object LBRACKET261_tree=null;
        Object RBRACKET263_tree=null;
        RewriteRuleTokenStream stream_LBRACKET=new RewriteRuleTokenStream(adaptor,"token LBRACKET");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_RBRACKET=new RewriteRuleTokenStream(adaptor,"token RBRACKET");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_exprListOpt=new RewriteRuleSubtreeStream(adaptor,"rule exprListOpt");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 55) ) { return retval; }
            // Haxe.g:345:5: ( LPAREN exprListOpt RPAREN -> ^( SUFFIX_EXPR[\"MethodCall\",true] ( exprListOpt )? ) | LBRACKET expr RBRACKET -> ^( SUFFIX_EXPR[\"Slice\",true] ( expr )? ) )
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==LPAREN) ) {
                alt60=1;
            }
            else if ( (LA60_0==LBRACKET) ) {
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
                    // Haxe.g:345:10: LPAREN exprListOpt RPAREN
                    {
                    LPAREN258=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_methodCallOrSlice3180); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN258);

                    pushFollow(FOLLOW_exprListOpt_in_methodCallOrSlice3182);
                    exprListOpt259=exprListOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_exprListOpt.add(exprListOpt259.getTree());
                    RPAREN260=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_methodCallOrSlice3184); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN260);



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
                    // 345:36: -> ^( SUFFIX_EXPR[\"MethodCall\",true] ( exprListOpt )? )
                    {
                        // Haxe.g:345:39: ^( SUFFIX_EXPR[\"MethodCall\",true] ( exprListOpt )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new HaxeTree(SUFFIX_EXPR, "MethodCall", true), root_1);

                        // Haxe.g:345:82: ( exprListOpt )?
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
                    // Haxe.g:346:10: LBRACKET expr RBRACKET
                    {
                    LBRACKET261=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_methodCallOrSlice3208); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LBRACKET.add(LBRACKET261);

                    pushFollow(FOLLOW_expr_in_methodCallOrSlice3210);
                    expr262=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr262.getTree());
                    RBRACKET263=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_methodCallOrSlice3212); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RBRACKET.add(RBRACKET263);



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
                    // 346:33: -> ^( SUFFIX_EXPR[\"Slice\",true] ( expr )? )
                    {
                        // Haxe.g:346:36: ^( SUFFIX_EXPR[\"Slice\",true] ( expr )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new HaxeTree(SUFFIX_EXPR, "Slice", true), root_1);

                        // Haxe.g:346:74: ( expr )?
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
    // Haxe.g:349:1: methodCallOrSliceList : ( methodCallOrSlice methodCallOrSliceList | methodCallOrSlice );
    public final HaxeParser.methodCallOrSliceList_return methodCallOrSliceList() throws RecognitionException {
        HaxeParser.methodCallOrSliceList_return retval = new HaxeParser.methodCallOrSliceList_return();
        retval.start = input.LT(1);
        int methodCallOrSliceList_StartIndex = input.index();
        Object root_0 = null;

        HaxeParser.methodCallOrSlice_return methodCallOrSlice264 = null;

        HaxeParser.methodCallOrSliceList_return methodCallOrSliceList265 = null;

        HaxeParser.methodCallOrSlice_return methodCallOrSlice266 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 56) ) { return retval; }
            // Haxe.g:350:5: ( methodCallOrSlice methodCallOrSliceList | methodCallOrSlice )
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==LPAREN) ) {
                int LA61_1 = input.LA(2);

                if ( (synpred110_Haxe()) ) {
                    alt61=1;
                }
                else if ( (true) ) {
                    alt61=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 61, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA61_0==LBRACKET) ) {
                int LA61_2 = input.LA(2);

                if ( (synpred110_Haxe()) ) {
                    alt61=1;
                }
                else if ( (true) ) {
                    alt61=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 61, 2, input);

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
                    // Haxe.g:350:10: methodCallOrSlice methodCallOrSliceList
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_methodCallOrSlice_in_methodCallOrSliceList3245);
                    methodCallOrSlice264=methodCallOrSlice();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, methodCallOrSlice264.getTree());
                    pushFollow(FOLLOW_methodCallOrSliceList_in_methodCallOrSliceList3247);
                    methodCallOrSliceList265=methodCallOrSliceList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, methodCallOrSliceList265.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:351:10: methodCallOrSlice
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_methodCallOrSlice_in_methodCallOrSliceList3258);
                    methodCallOrSlice266=methodCallOrSlice();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, methodCallOrSlice266.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // Haxe.g:354:1: value : ( funcLit | arrayLit | objLit | elementarySymbol | LPAREN ( expr | statement ) RPAREN | dotIdent -> ^( IDENT[true] dotIdent ) );
    public final HaxeParser.value_return value() throws RecognitionException {
        HaxeParser.value_return retval = new HaxeParser.value_return();
        retval.start = input.LT(1);
        int value_StartIndex = input.index();
        Object root_0 = null;

        Token LPAREN271=null;
        Token RPAREN274=null;
        HaxeParser.funcLit_return funcLit267 = null;

        HaxeParser.arrayLit_return arrayLit268 = null;

        HaxeParser.objLit_return objLit269 = null;

        HaxeParser.elementarySymbol_return elementarySymbol270 = null;

        HaxeParser.expr_return expr272 = null;

        HaxeParser.statement_return statement273 = null;

        HaxeParser.dotIdent_return dotIdent275 = null;


        Object LPAREN271_tree=null;
        Object RPAREN274_tree=null;
        RewriteRuleSubtreeStream stream_dotIdent=new RewriteRuleSubtreeStream(adaptor,"rule dotIdent");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 57) ) { return retval; }
            // Haxe.g:355:5: ( funcLit | arrayLit | objLit | elementarySymbol | LPAREN ( expr | statement ) RPAREN | dotIdent -> ^( IDENT[true] dotIdent ) )
            int alt63=6;
            switch ( input.LA(1) ) {
            case FUNCTION:
                {
                alt63=1;
                }
                break;
            case LBRACKET:
                {
                alt63=2;
                }
                break;
            case LBRACE:
                {
                alt63=3;
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
                alt63=4;
                }
                break;
            case LPAREN:
                {
                alt63=5;
                }
                break;
            case IDENTIFIER:
            case THIS:
                {
                alt63=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }

            switch (alt63) {
                case 1 :
                    // Haxe.g:355:9: funcLit
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_funcLit_in_value3277);
                    funcLit267=funcLit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, funcLit267.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:356:9: arrayLit
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_arrayLit_in_value3288);
                    arrayLit268=arrayLit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arrayLit268.getTree());

                    }
                    break;
                case 3 :
                    // Haxe.g:357:9: objLit
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_objLit_in_value3298);
                    objLit269=objLit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, objLit269.getTree());

                    }
                    break;
                case 4 :
                    // Haxe.g:358:9: elementarySymbol
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_elementarySymbol_in_value3308);
                    elementarySymbol270=elementarySymbol();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, elementarySymbol270.getTree());

                    }
                    break;
                case 5 :
                    // Haxe.g:359:9: LPAREN ( expr | statement ) RPAREN
                    {
                    root_0 = (Object)adaptor.nil();

                    LPAREN271=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_value3318); if (state.failed) return retval;
                    // Haxe.g:359:17: ( expr | statement )
                    int alt62=2;
                    alt62 = dfa62.predict(input);
                    switch (alt62) {
                        case 1 :
                            // Haxe.g:359:18: expr
                            {
                            pushFollow(FOLLOW_expr_in_value3322);
                            expr272=expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr272.getTree());

                            }
                            break;
                        case 2 :
                            // Haxe.g:359:23: statement
                            {
                            pushFollow(FOLLOW_statement_in_value3324);
                            statement273=statement();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, statement273.getTree());

                            }
                            break;

                    }

                    RPAREN274=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_value3327); if (state.failed) return retval;

                    }
                    break;
                case 6 :
                    // Haxe.g:360:9: dotIdent
                    {
                    pushFollow(FOLLOW_dotIdent_in_value3338);
                    dotIdent275=dotIdent();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_dotIdent.add(dotIdent275.getTree());


                    // AST REWRITE
                    // elements: dotIdent
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 360:18: -> ^( IDENT[true] dotIdent )
                    {
                        // Haxe.g:360:21: ^( IDENT[true] dotIdent )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new VarUsage(IDENT, true), root_1);

                        adaptor.addChild(root_1, stream_dotIdent.nextTree());

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
    // Haxe.g:363:1: newExpr : NEW type LPAREN exprListOpt RPAREN -> ^( NEW ( type )? ( exprListOpt )? ) ;
    public final HaxeParser.newExpr_return newExpr() throws RecognitionException {
        HaxeParser.newExpr_return retval = new HaxeParser.newExpr_return();
        retval.start = input.LT(1);
        int newExpr_StartIndex = input.index();
        Object root_0 = null;

        Token NEW276=null;
        Token LPAREN278=null;
        Token RPAREN280=null;
        HaxeParser.type_return type277 = null;

        HaxeParser.exprListOpt_return exprListOpt279 = null;


        Object NEW276_tree=null;
        Object LPAREN278_tree=null;
        Object RPAREN280_tree=null;
        RewriteRuleTokenStream stream_NEW=new RewriteRuleTokenStream(adaptor,"token NEW");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_exprListOpt=new RewriteRuleSubtreeStream(adaptor,"rule exprListOpt");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 58) ) { return retval; }
            // Haxe.g:364:5: ( NEW type LPAREN exprListOpt RPAREN -> ^( NEW ( type )? ( exprListOpt )? ) )
            // Haxe.g:364:9: NEW type LPAREN exprListOpt RPAREN
            {
            NEW276=(Token)match(input,NEW,FOLLOW_NEW_in_newExpr3380); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_NEW.add(NEW276);

            pushFollow(FOLLOW_type_in_newExpr3382);
            type277=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(type277.getTree());
            LPAREN278=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_newExpr3384); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN278);

            pushFollow(FOLLOW_exprListOpt_in_newExpr3386);
            exprListOpt279=exprListOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_exprListOpt.add(exprListOpt279.getTree());
            RPAREN280=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_newExpr3388); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN280);



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
            // 364:44: -> ^( NEW ( type )? ( exprListOpt )? )
            {
                // Haxe.g:364:47: ^( NEW ( type )? ( exprListOpt )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_NEW.nextNode(), root_1);

                // Haxe.g:364:53: ( type )?
                if ( stream_type.hasNext() ) {
                    adaptor.addChild(root_1, stream_type.nextTree());

                }
                stream_type.reset();
                // Haxe.g:364:59: ( exprListOpt )?
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
    // Haxe.g:367:1: cast : ( CAST LPAREN expr ( COMMA funcType )? RPAREN -> ^( CAST ( expr )? ( funcType )? ) | CAST LPAREN expr RPAREN -> ^( CAST ( expr )? ) );
    public final HaxeParser.cast_return cast() throws RecognitionException {
        HaxeParser.cast_return retval = new HaxeParser.cast_return();
        retval.start = input.LT(1);
        int cast_StartIndex = input.index();
        Object root_0 = null;

        Token CAST281=null;
        Token LPAREN282=null;
        Token COMMA284=null;
        Token RPAREN286=null;
        Token CAST287=null;
        Token LPAREN288=null;
        Token RPAREN290=null;
        HaxeParser.expr_return expr283 = null;

        HaxeParser.funcType_return funcType285 = null;

        HaxeParser.expr_return expr289 = null;


        Object CAST281_tree=null;
        Object LPAREN282_tree=null;
        Object COMMA284_tree=null;
        Object RPAREN286_tree=null;
        Object CAST287_tree=null;
        Object LPAREN288_tree=null;
        Object RPAREN290_tree=null;
        RewriteRuleTokenStream stream_CAST=new RewriteRuleTokenStream(adaptor,"token CAST");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_funcType=new RewriteRuleSubtreeStream(adaptor,"rule funcType");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 59) ) { return retval; }
            // Haxe.g:367:9: ( CAST LPAREN expr ( COMMA funcType )? RPAREN -> ^( CAST ( expr )? ( funcType )? ) | CAST LPAREN expr RPAREN -> ^( CAST ( expr )? ) )
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==CAST) ) {
                int LA65_1 = input.LA(2);

                if ( (synpred118_Haxe()) ) {
                    alt65=1;
                }
                else if ( (true) ) {
                    alt65=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 65, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }
            switch (alt65) {
                case 1 :
                    // Haxe.g:367:13: CAST LPAREN expr ( COMMA funcType )? RPAREN
                    {
                    CAST281=(Token)match(input,CAST,FOLLOW_CAST_in_cast3418); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CAST.add(CAST281);

                    LPAREN282=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_cast3420); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN282);

                    pushFollow(FOLLOW_expr_in_cast3422);
                    expr283=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr283.getTree());
                    // Haxe.g:367:30: ( COMMA funcType )?
                    int alt64=2;
                    int LA64_0 = input.LA(1);

                    if ( (LA64_0==COMMA) ) {
                        alt64=1;
                    }
                    switch (alt64) {
                        case 1 :
                            // Haxe.g:367:31: COMMA funcType
                            {
                            COMMA284=(Token)match(input,COMMA,FOLLOW_COMMA_in_cast3425); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_COMMA.add(COMMA284);

                            pushFollow(FOLLOW_funcType_in_cast3427);
                            funcType285=funcType();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_funcType.add(funcType285.getTree());

                            }
                            break;

                    }

                    RPAREN286=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_cast3431); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN286);



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
                    // 367:57: -> ^( CAST ( expr )? ( funcType )? )
                    {
                        // Haxe.g:367:60: ^( CAST ( expr )? ( funcType )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_CAST.nextNode(), root_1);

                        // Haxe.g:367:67: ( expr )?
                        if ( stream_expr.hasNext() ) {
                            adaptor.addChild(root_1, stream_expr.nextTree());

                        }
                        stream_expr.reset();
                        // Haxe.g:367:73: ( funcType )?
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
                    // Haxe.g:368:13: CAST LPAREN expr RPAREN
                    {
                    CAST287=(Token)match(input,CAST,FOLLOW_CAST_in_cast3459); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CAST.add(CAST287);

                    LPAREN288=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_cast3461); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN288);

                    pushFollow(FOLLOW_expr_in_cast3463);
                    expr289=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr289.getTree());
                    RPAREN290=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_cast3465); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN290);



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
                    // 368:57: -> ^( CAST ( expr )? )
                    {
                        // Haxe.g:368:60: ^( CAST ( expr )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_CAST.nextNode(), root_1);

                        // Haxe.g:368:67: ( expr )?
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
    // Haxe.g:374:1: topLevelDecl : ( classDecl | interfaceDecl | enumDecl | typedefDecl );
    public final HaxeParser.topLevelDecl_return topLevelDecl() throws RecognitionException {
        HaxeParser.topLevelDecl_return retval = new HaxeParser.topLevelDecl_return();
        retval.start = input.LT(1);
        int topLevelDecl_StartIndex = input.index();
        Object root_0 = null;

        HaxeParser.classDecl_return classDecl291 = null;

        HaxeParser.interfaceDecl_return interfaceDecl292 = null;

        HaxeParser.enumDecl_return enumDecl293 = null;

        HaxeParser.typedefDecl_return typedefDecl294 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 60) ) { return retval; }
            // Haxe.g:375:5: ( classDecl | interfaceDecl | enumDecl | typedefDecl )
            int alt66=4;
            switch ( input.LA(1) ) {
            case MONKEYS_AT:
                {
                int LA66_1 = input.LA(2);

                if ( (synpred119_Haxe()) ) {
                    alt66=1;
                }
                else if ( (synpred120_Haxe()) ) {
                    alt66=2;
                }
                else if ( (synpred121_Haxe()) ) {
                    alt66=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 66, 1, input);

                    throw nvae;
                }
                }
                break;
            case EXTERN:
            case PRIVATE:
                {
                int LA66_2 = input.LA(2);

                if ( (synpred119_Haxe()) ) {
                    alt66=1;
                }
                else if ( (synpred120_Haxe()) ) {
                    alt66=2;
                }
                else if ( (synpred121_Haxe()) ) {
                    alt66=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 66, 2, input);

                    throw nvae;
                }
                }
                break;
            case CLASS:
                {
                alt66=1;
                }
                break;
            case INTERFACE:
                {
                alt66=2;
                }
                break;
            case ENUM:
                {
                alt66=3;
                }
                break;
            case TYPEDEF:
                {
                alt66=4;
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
                    // Haxe.g:375:9: classDecl
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_classDecl_in_topLevelDecl3530);
                    classDecl291=classDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, classDecl291.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:376:9: interfaceDecl
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_interfaceDecl_in_topLevelDecl3540);
                    interfaceDecl292=interfaceDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceDecl292.getTree());

                    }
                    break;
                case 3 :
                    // Haxe.g:377:9: enumDecl
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_enumDecl_in_topLevelDecl3550);
                    enumDecl293=enumDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, enumDecl293.getTree());

                    }
                    break;
                case 4 :
                    // Haxe.g:378:9: typedefDecl
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_typedefDecl_in_topLevelDecl3560);
                    typedefDecl294=typedefDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typedefDecl294.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // Haxe.g:381:1: enumDecl : typeDeclFlags ENUM IDENTIFIER typeParamOpt LBRACE enumBody RBRACE -> ^( ENUM ( IDENTIFIER )? ( typeParamOpt )? ( enumBody )? ) ;
    public final HaxeParser.enumDecl_return enumDecl() throws RecognitionException {
        HaxeParser.enumDecl_return retval = new HaxeParser.enumDecl_return();
        retval.start = input.LT(1);
        int enumDecl_StartIndex = input.index();
        Object root_0 = null;

        Token ENUM296=null;
        Token IDENTIFIER297=null;
        Token LBRACE299=null;
        Token RBRACE301=null;
        HaxeParser.typeDeclFlags_return typeDeclFlags295 = null;

        HaxeParser.typeParamOpt_return typeParamOpt298 = null;

        HaxeParser.enumBody_return enumBody300 = null;


        Object ENUM296_tree=null;
        Object IDENTIFIER297_tree=null;
        Object LBRACE299_tree=null;
        Object RBRACE301_tree=null;
        RewriteRuleTokenStream stream_ENUM=new RewriteRuleTokenStream(adaptor,"token ENUM");
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_typeDeclFlags=new RewriteRuleSubtreeStream(adaptor,"rule typeDeclFlags");
        RewriteRuleSubtreeStream stream_enumBody=new RewriteRuleSubtreeStream(adaptor,"rule enumBody");
        RewriteRuleSubtreeStream stream_typeParamOpt=new RewriteRuleSubtreeStream(adaptor,"rule typeParamOpt");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 61) ) { return retval; }
            // Haxe.g:381:9: ( typeDeclFlags ENUM IDENTIFIER typeParamOpt LBRACE enumBody RBRACE -> ^( ENUM ( IDENTIFIER )? ( typeParamOpt )? ( enumBody )? ) )
            // Haxe.g:381:13: typeDeclFlags ENUM IDENTIFIER typeParamOpt LBRACE enumBody RBRACE
            {
            pushFollow(FOLLOW_typeDeclFlags_in_enumDecl3578);
            typeDeclFlags295=typeDeclFlags();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeDeclFlags.add(typeDeclFlags295.getTree());
            ENUM296=(Token)match(input,ENUM,FOLLOW_ENUM_in_enumDecl3580); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ENUM.add(ENUM296);

            IDENTIFIER297=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_enumDecl3582); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER297);

            pushFollow(FOLLOW_typeParamOpt_in_enumDecl3584);
            typeParamOpt298=typeParamOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeParamOpt.add(typeParamOpt298.getTree());
            LBRACE299=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_enumDecl3586); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACE.add(LBRACE299);

            pushFollow(FOLLOW_enumBody_in_enumDecl3588);
            enumBody300=enumBody();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_enumBody.add(enumBody300.getTree());
            RBRACE301=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_enumDecl3590); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACE.add(RBRACE301);



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
            // 381:79: -> ^( ENUM ( IDENTIFIER )? ( typeParamOpt )? ( enumBody )? )
            {
                // Haxe.g:381:82: ^( ENUM ( IDENTIFIER )? ( typeParamOpt )? ( enumBody )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_ENUM.nextNode(), root_1);

                // Haxe.g:381:89: ( IDENTIFIER )?
                if ( stream_IDENTIFIER.hasNext() ) {
                    adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());

                }
                stream_IDENTIFIER.reset();
                // Haxe.g:381:101: ( typeParamOpt )?
                if ( stream_typeParamOpt.hasNext() ) {
                    adaptor.addChild(root_1, stream_typeParamOpt.nextTree());

                }
                stream_typeParamOpt.reset();
                // Haxe.g:381:115: ( enumBody )?
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
    // Haxe.g:384:1: enumBody : ( enumValueDecl )* ;
    public final HaxeParser.enumBody_return enumBody() throws RecognitionException {
        HaxeParser.enumBody_return retval = new HaxeParser.enumBody_return();
        retval.start = input.LT(1);
        int enumBody_StartIndex = input.index();
        Object root_0 = null;

        HaxeParser.enumValueDecl_return enumValueDecl302 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 62) ) { return retval; }
            // Haxe.g:384:9: ( ( enumValueDecl )* )
            // Haxe.g:384:13: ( enumValueDecl )*
            {
            root_0 = (Object)adaptor.nil();

            // Haxe.g:384:13: ( enumValueDecl )*
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( (LA67_0==IDENTIFIER) ) {
                    alt67=1;
                }


                switch (alt67) {
            	case 1 :
            	    // Haxe.g:384:14: enumValueDecl
            	    {
            	    pushFollow(FOLLOW_enumValueDecl_in_enumBody3624);
            	    enumValueDecl302=enumValueDecl();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, enumValueDecl302.getTree());

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
    // Haxe.g:387:1: enumValueDecl : ( IDENTIFIER LPAREN paramList RPAREN SEMI -> ^( IDENTIFIER[$IDENTIFIER] ( IDENTIFIER )? ( paramList )? ) | IDENTIFIER SEMI -> ^( IDENTIFIER[$IDENTIFIER] ( IDENTIFIER )? ) );
    public final HaxeParser.enumValueDecl_return enumValueDecl() throws RecognitionException {
        HaxeParser.enumValueDecl_return retval = new HaxeParser.enumValueDecl_return();
        retval.start = input.LT(1);
        int enumValueDecl_StartIndex = input.index();
        Object root_0 = null;

        Token IDENTIFIER303=null;
        Token LPAREN304=null;
        Token RPAREN306=null;
        Token SEMI307=null;
        Token IDENTIFIER308=null;
        Token SEMI309=null;
        HaxeParser.paramList_return paramList305 = null;


        Object IDENTIFIER303_tree=null;
        Object LPAREN304_tree=null;
        Object RPAREN306_tree=null;
        Object SEMI307_tree=null;
        Object IDENTIFIER308_tree=null;
        Object SEMI309_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_paramList=new RewriteRuleSubtreeStream(adaptor,"rule paramList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 63) ) { return retval; }
            // Haxe.g:388:5: ( IDENTIFIER LPAREN paramList RPAREN SEMI -> ^( IDENTIFIER[$IDENTIFIER] ( IDENTIFIER )? ( paramList )? ) | IDENTIFIER SEMI -> ^( IDENTIFIER[$IDENTIFIER] ( IDENTIFIER )? ) )
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==IDENTIFIER) ) {
                int LA68_1 = input.LA(2);

                if ( (LA68_1==LPAREN) ) {
                    alt68=1;
                }
                else if ( (LA68_1==SEMI) ) {
                    alt68=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 68, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;
            }
            switch (alt68) {
                case 1 :
                    // Haxe.g:388:9: IDENTIFIER LPAREN paramList RPAREN SEMI
                    {
                    IDENTIFIER303=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_enumValueDecl3662); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER303);

                    LPAREN304=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_enumValueDecl3664); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN304);

                    pushFollow(FOLLOW_paramList_in_enumValueDecl3666);
                    paramList305=paramList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_paramList.add(paramList305.getTree());
                    RPAREN306=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_enumValueDecl3668); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN306);

                    SEMI307=(Token)match(input,SEMI,FOLLOW_SEMI_in_enumValueDecl3670); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI307);



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
                    // 388:49: -> ^( IDENTIFIER[$IDENTIFIER] ( IDENTIFIER )? ( paramList )? )
                    {
                        // Haxe.g:388:52: ^( IDENTIFIER[$IDENTIFIER] ( IDENTIFIER )? ( paramList )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new VarDeclaration(IDENTIFIER, IDENTIFIER303), root_1);

                        // Haxe.g:388:94: ( IDENTIFIER )?
                        if ( stream_IDENTIFIER.hasNext() ) {
                            adaptor.addChild(root_1, new VarUsage(stream_IDENTIFIER.nextToken()));

                        }
                        stream_IDENTIFIER.reset();
                        // Haxe.g:388:116: ( paramList )?
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
                    // Haxe.g:389:9: IDENTIFIER SEMI
                    {
                    IDENTIFIER308=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_enumValueDecl3704); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER308);

                    SEMI309=(Token)match(input,SEMI,FOLLOW_SEMI_in_enumValueDecl3706); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI309);



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
                    // 389:49: -> ^( IDENTIFIER[$IDENTIFIER] ( IDENTIFIER )? )
                    {
                        // Haxe.g:389:52: ^( IDENTIFIER[$IDENTIFIER] ( IDENTIFIER )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new VarDeclaration(IDENTIFIER, IDENTIFIER308), root_1);

                        // Haxe.g:389:94: ( IDENTIFIER )?
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
    // Haxe.g:393:1: varDeclList : varDecl varDeclList ;
    public final HaxeParser.varDeclList_return varDeclList() throws RecognitionException {
        HaxeParser.varDeclList_return retval = new HaxeParser.varDeclList_return();
        retval.start = input.LT(1);
        int varDeclList_StartIndex = input.index();
        Object root_0 = null;

        HaxeParser.varDecl_return varDecl310 = null;

        HaxeParser.varDeclList_return varDeclList311 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 64) ) { return retval; }
            // Haxe.g:394:5: ( varDecl varDeclList )
            // Haxe.g:394:9: varDecl varDeclList
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_varDecl_in_varDeclList3777);
            varDecl310=varDecl();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, varDecl310.getTree());
            pushFollow(FOLLOW_varDeclList_in_varDeclList3779);
            varDeclList311=varDeclList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclList311.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // Haxe.g:397:1: varDecl : ( declAttrList )? VAR varDeclPartList SEMI -> ^( VAR[$VAR] ( declAttrList )? ( varDeclPartList )? ) ;
    public final HaxeParser.varDecl_return varDecl() throws RecognitionException {
        HaxeParser.varDecl_return retval = new HaxeParser.varDecl_return();
        retval.start = input.LT(1);
        int varDecl_StartIndex = input.index();
        Object root_0 = null;

        Token VAR313=null;
        Token SEMI315=null;
        HaxeParser.declAttrList_return declAttrList312 = null;

        HaxeParser.varDeclPartList_return varDeclPartList314 = null;


        Object VAR313_tree=null;
        Object SEMI315_tree=null;
        RewriteRuleTokenStream stream_VAR=new RewriteRuleTokenStream(adaptor,"token VAR");
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleSubtreeStream stream_declAttrList=new RewriteRuleSubtreeStream(adaptor,"rule declAttrList");
        RewriteRuleSubtreeStream stream_varDeclPartList=new RewriteRuleSubtreeStream(adaptor,"rule varDeclPartList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 65) ) { return retval; }
            // Haxe.g:397:9: ( ( declAttrList )? VAR varDeclPartList SEMI -> ^( VAR[$VAR] ( declAttrList )? ( varDeclPartList )? ) )
            // Haxe.g:397:13: ( declAttrList )? VAR varDeclPartList SEMI
            {
            // Haxe.g:397:13: ( declAttrList )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==PRIVATE||(LA69_0>=PUBLIC && LA69_0<=OVERRIDE)) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // Haxe.g:397:14: declAttrList
                    {
                    pushFollow(FOLLOW_declAttrList_in_varDecl3799);
                    declAttrList312=declAttrList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declAttrList.add(declAttrList312.getTree());

                    }
                    break;

            }

            VAR313=(Token)match(input,VAR,FOLLOW_VAR_in_varDecl3803); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_VAR.add(VAR313);

            pushFollow(FOLLOW_varDeclPartList_in_varDecl3805);
            varDeclPartList314=varDeclPartList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_varDeclPartList.add(varDeclPartList314.getTree());
            SEMI315=(Token)match(input,SEMI,FOLLOW_SEMI_in_varDecl3807); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SEMI.add(SEMI315);



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
            // 397:54: -> ^( VAR[$VAR] ( declAttrList )? ( varDeclPartList )? )
            {
                // Haxe.g:397:57: ^( VAR[$VAR] ( declAttrList )? ( varDeclPartList )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new VarDeclaration(VAR, VAR313), root_1);

                // Haxe.g:397:85: ( declAttrList )?
                if ( stream_declAttrList.hasNext() ) {
                    adaptor.addChild(root_1, stream_declAttrList.nextTree());

                }
                stream_declAttrList.reset();
                // Haxe.g:397:99: ( varDeclPartList )?
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
    // Haxe.g:400:1: varDeclPartList : varDeclPart ( COMMA varDeclPart )* ;
    public final HaxeParser.varDeclPartList_return varDeclPartList() throws RecognitionException {
        HaxeParser.varDeclPartList_return retval = new HaxeParser.varDeclPartList_return();
        retval.start = input.LT(1);
        int varDeclPartList_StartIndex = input.index();
        Object root_0 = null;

        Token COMMA317=null;
        HaxeParser.varDeclPart_return varDeclPart316 = null;

        HaxeParser.varDeclPart_return varDeclPart318 = null;


        Object COMMA317_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 66) ) { return retval; }
            // Haxe.g:401:5: ( varDeclPart ( COMMA varDeclPart )* )
            // Haxe.g:401:9: varDeclPart ( COMMA varDeclPart )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_varDeclPart_in_varDeclPartList3853);
            varDeclPart316=varDeclPart();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclPart316.getTree());
            // Haxe.g:401:21: ( COMMA varDeclPart )*
            loop70:
            do {
                int alt70=2;
                int LA70_0 = input.LA(1);

                if ( (LA70_0==COMMA) ) {
                    alt70=1;
                }


                switch (alt70) {
            	case 1 :
            	    // Haxe.g:401:22: COMMA varDeclPart
            	    {
            	    COMMA317=(Token)match(input,COMMA,FOLLOW_COMMA_in_varDeclPartList3856); if (state.failed) return retval;
            	    pushFollow(FOLLOW_varDeclPart_in_varDeclPartList3859);
            	    varDeclPart318=varDeclPart();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclPart318.getTree());

            	    }
            	    break;

            	default :
            	    break loop70;
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
    // Haxe.g:404:1: varDeclPart : IDENTIFIER propDeclOpt typeTagOpt varInit ;
    public final HaxeParser.varDeclPart_return varDeclPart() throws RecognitionException {
        HaxeParser.varDeclPart_return retval = new HaxeParser.varDeclPart_return();
        retval.start = input.LT(1);
        int varDeclPart_StartIndex = input.index();
        Object root_0 = null;

        Token IDENTIFIER319=null;
        HaxeParser.propDeclOpt_return propDeclOpt320 = null;

        HaxeParser.typeTagOpt_return typeTagOpt321 = null;

        HaxeParser.varInit_return varInit322 = null;


        Object IDENTIFIER319_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 67) ) { return retval; }
            // Haxe.g:405:5: ( IDENTIFIER propDeclOpt typeTagOpt varInit )
            // Haxe.g:405:9: IDENTIFIER propDeclOpt typeTagOpt varInit
            {
            root_0 = (Object)adaptor.nil();

            IDENTIFIER319=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_varDeclPart3884); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER319_tree = new VarUsage(IDENTIFIER319) ;
            adaptor.addChild(root_0, IDENTIFIER319_tree);
            }
            pushFollow(FOLLOW_propDeclOpt_in_varDeclPart3889);
            propDeclOpt320=propDeclOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, propDeclOpt320.getTree());
            pushFollow(FOLLOW_typeTagOpt_in_varDeclPart3891);
            typeTagOpt321=typeTagOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, typeTagOpt321.getTree());
            pushFollow(FOLLOW_varInit_in_varDeclPart3893);
            varInit322=varInit();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, varInit322.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // Haxe.g:408:1: propDecl : LPAREN a1= propAccessor COMMA a2= propAccessor RPAREN -> ^( PROPERTY_DECL[\"PROPERTY_DECL\",true] ( $a1)? ( $a2)? ) ;
    public final HaxeParser.propDecl_return propDecl() throws RecognitionException {
        HaxeParser.propDecl_return retval = new HaxeParser.propDecl_return();
        retval.start = input.LT(1);
        int propDecl_StartIndex = input.index();
        Object root_0 = null;

        Token LPAREN323=null;
        Token COMMA324=null;
        Token RPAREN325=null;
        HaxeParser.propAccessor_return a1 = null;

        HaxeParser.propAccessor_return a2 = null;


        Object LPAREN323_tree=null;
        Object COMMA324_tree=null;
        Object RPAREN325_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_propAccessor=new RewriteRuleSubtreeStream(adaptor,"rule propAccessor");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 68) ) { return retval; }
            // Haxe.g:408:9: ( LPAREN a1= propAccessor COMMA a2= propAccessor RPAREN -> ^( PROPERTY_DECL[\"PROPERTY_DECL\",true] ( $a1)? ( $a2)? ) )
            // Haxe.g:408:13: LPAREN a1= propAccessor COMMA a2= propAccessor RPAREN
            {
            LPAREN323=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_propDecl3911); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN323);

            pushFollow(FOLLOW_propAccessor_in_propDecl3915);
            a1=propAccessor();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_propAccessor.add(a1.getTree());
            COMMA324=(Token)match(input,COMMA,FOLLOW_COMMA_in_propDecl3917); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COMMA.add(COMMA324);

            pushFollow(FOLLOW_propAccessor_in_propDecl3921);
            a2=propAccessor();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_propAccessor.add(a2.getTree());
            RPAREN325=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_propDecl3923); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN325);



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
            // 408:65: -> ^( PROPERTY_DECL[\"PROPERTY_DECL\",true] ( $a1)? ( $a2)? )
            {
                // Haxe.g:408:68: ^( PROPERTY_DECL[\"PROPERTY_DECL\",true] ( $a1)? ( $a2)? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new HaxeTree(PROPERTY_DECL, "PROPERTY_DECL", true), root_1);

                // Haxe.g:408:116: ( $a1)?
                if ( stream_a1.hasNext() ) {
                    adaptor.addChild(root_1, stream_a1.nextTree());

                }
                stream_a1.reset();
                // Haxe.g:408:121: ( $a2)?
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
    // Haxe.g:411:1: propAccessor : ( IDENTIFIER | NULL | DEFAULT | DYNAMIC );
    public final HaxeParser.propAccessor_return propAccessor() throws RecognitionException {
        HaxeParser.propAccessor_return retval = new HaxeParser.propAccessor_return();
        retval.start = input.LT(1);
        int propAccessor_StartIndex = input.index();
        Object root_0 = null;

        Token set326=null;

        Object set326_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 69) ) { return retval; }
            // Haxe.g:412:13: ( IDENTIFIER | NULL | DEFAULT | DYNAMIC )
            // Haxe.g:
            {
            root_0 = (Object)adaptor.nil();

            set326=(Token)input.LT(1);
            if ( input.LA(1)==IDENTIFIER||input.LA(1)==DYNAMIC||input.LA(1)==DEFAULT||input.LA(1)==NULL ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set326));
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
    // Haxe.g:418:1: propDeclOpt : ( propDecl | );
    public final HaxeParser.propDeclOpt_return propDeclOpt() throws RecognitionException {
        HaxeParser.propDeclOpt_return retval = new HaxeParser.propDeclOpt_return();
        retval.start = input.LT(1);
        int propDeclOpt_StartIndex = input.index();
        Object root_0 = null;

        HaxeParser.propDecl_return propDecl327 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 70) ) { return retval; }
            // Haxe.g:419:13: ( propDecl | )
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==LPAREN) ) {
                alt71=1;
            }
            else if ( (LA71_0==EOF||LA71_0==SEMI||LA71_0==RPAREN||LA71_0==COLON||LA71_0==COMMA||LA71_0==EQ||LA71_0==LBRACE) ) {
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
                    // Haxe.g:419:17: propDecl
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_propDecl_in_propDeclOpt4079);
                    propDecl327=propDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, propDecl327.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:421:13: 
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
    // Haxe.g:423:1: varInit : ( EQ expr -> ^( VAR_INIT[\"VAR_INIT\",true] ( expr )? ) | );
    public final HaxeParser.varInit_return varInit() throws RecognitionException {
        HaxeParser.varInit_return retval = new HaxeParser.varInit_return();
        retval.start = input.LT(1);
        int varInit_StartIndex = input.index();
        Object root_0 = null;

        Token EQ328=null;
        HaxeParser.expr_return expr329 = null;


        Object EQ328_tree=null;
        RewriteRuleTokenStream stream_EQ=new RewriteRuleTokenStream(adaptor,"token EQ");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 71) ) { return retval; }
            // Haxe.g:423:9: ( EQ expr -> ^( VAR_INIT[\"VAR_INIT\",true] ( expr )? ) | )
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==EQ) ) {
                alt72=1;
            }
            else if ( (LA72_0==EOF||LA72_0==SEMI||LA72_0==RPAREN||LA72_0==COMMA) ) {
                alt72=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 72, 0, input);

                throw nvae;
            }
            switch (alt72) {
                case 1 :
                    // Haxe.g:423:13: EQ expr
                    {
                    EQ328=(Token)match(input,EQ,FOLLOW_EQ_in_varInit4124); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EQ.add(EQ328);

                    pushFollow(FOLLOW_expr_in_varInit4126);
                    expr329=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr329.getTree());


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
                    // 423:21: -> ^( VAR_INIT[\"VAR_INIT\",true] ( expr )? )
                    {
                        // Haxe.g:423:24: ^( VAR_INIT[\"VAR_INIT\",true] ( expr )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new HaxeTree(VAR_INIT, "VAR_INIT", true), root_1);

                        // Haxe.g:423:62: ( expr )?
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
                    // Haxe.g:425:9: 
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
    // Haxe.g:427:1: funcDecl : ( ( declAttrList )? FUNCTION NEW LPAREN paramList RPAREN typeTagOpt block -> ^( FUNCTION NEW ( declAttrList )? ( paramList )? ( typeTagOpt )? ( block )? ) | ( declAttrList )? FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt block -> ^( FUNCTION IDENTIFIER ( declAttrList )? ( paramList )? ( typeTagOpt )? ( block )? ( typeParamOpt )? ) );
    public final HaxeParser.funcDecl_return funcDecl() throws RecognitionException {
        HaxeParser.funcDecl_return retval = new HaxeParser.funcDecl_return();
        retval.start = input.LT(1);
        int funcDecl_StartIndex = input.index();
        Object root_0 = null;

        Token FUNCTION331=null;
        Token NEW332=null;
        Token LPAREN333=null;
        Token RPAREN335=null;
        Token FUNCTION339=null;
        Token IDENTIFIER340=null;
        Token LPAREN342=null;
        Token RPAREN344=null;
        HaxeParser.declAttrList_return declAttrList330 = null;

        HaxeParser.paramList_return paramList334 = null;

        HaxeParser.typeTagOpt_return typeTagOpt336 = null;

        HaxeParser.block_return block337 = null;

        HaxeParser.declAttrList_return declAttrList338 = null;

        HaxeParser.typeParamOpt_return typeParamOpt341 = null;

        HaxeParser.paramList_return paramList343 = null;

        HaxeParser.typeTagOpt_return typeTagOpt345 = null;

        HaxeParser.block_return block346 = null;


        Object FUNCTION331_tree=null;
        Object NEW332_tree=null;
        Object LPAREN333_tree=null;
        Object RPAREN335_tree=null;
        Object FUNCTION339_tree=null;
        Object IDENTIFIER340_tree=null;
        Object LPAREN342_tree=null;
        Object RPAREN344_tree=null;
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
            // Haxe.g:427:9: ( ( declAttrList )? FUNCTION NEW LPAREN paramList RPAREN typeTagOpt block -> ^( FUNCTION NEW ( declAttrList )? ( paramList )? ( typeTagOpt )? ( block )? ) | ( declAttrList )? FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt block -> ^( FUNCTION IDENTIFIER ( declAttrList )? ( paramList )? ( typeTagOpt )? ( block )? ( typeParamOpt )? ) )
            int alt75=2;
            alt75 = dfa75.predict(input);
            switch (alt75) {
                case 1 :
                    // Haxe.g:427:13: ( declAttrList )? FUNCTION NEW LPAREN paramList RPAREN typeTagOpt block
                    {
                    // Haxe.g:427:13: ( declAttrList )?
                    int alt73=2;
                    int LA73_0 = input.LA(1);

                    if ( (LA73_0==PRIVATE||(LA73_0>=PUBLIC && LA73_0<=OVERRIDE)) ) {
                        alt73=1;
                    }
                    switch (alt73) {
                        case 1 :
                            // Haxe.g:0:0: declAttrList
                            {
                            pushFollow(FOLLOW_declAttrList_in_funcDecl4174);
                            declAttrList330=declAttrList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_declAttrList.add(declAttrList330.getTree());

                            }
                            break;

                    }

                    FUNCTION331=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcDecl4177); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION331);

                    NEW332=(Token)match(input,NEW,FOLLOW_NEW_in_funcDecl4179); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEW.add(NEW332);

                    LPAREN333=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcDecl4181); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN333);

                    pushFollow(FOLLOW_paramList_in_funcDecl4183);
                    paramList334=paramList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_paramList.add(paramList334.getTree());
                    RPAREN335=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcDecl4185); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN335);

                    pushFollow(FOLLOW_typeTagOpt_in_funcDecl4187);
                    typeTagOpt336=typeTagOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeTagOpt.add(typeTagOpt336.getTree());
                    pushFollow(FOLLOW_block_in_funcDecl4189);
                    block337=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block337.getTree());


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
                    // 428:17: -> ^( FUNCTION NEW ( declAttrList )? ( paramList )? ( typeTagOpt )? ( block )? )
                    {
                        // Haxe.g:428:20: ^( FUNCTION NEW ( declAttrList )? ( paramList )? ( typeTagOpt )? ( block )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new FunctionNode(stream_FUNCTION.nextToken()), root_1);

                        adaptor.addChild(root_1, stream_NEW.nextNode());
                        // Haxe.g:428:49: ( declAttrList )?
                        if ( stream_declAttrList.hasNext() ) {
                            adaptor.addChild(root_1, stream_declAttrList.nextTree());

                        }
                        stream_declAttrList.reset();
                        // Haxe.g:428:63: ( paramList )?
                        if ( stream_paramList.hasNext() ) {
                            adaptor.addChild(root_1, stream_paramList.nextTree());

                        }
                        stream_paramList.reset();
                        // Haxe.g:428:74: ( typeTagOpt )?
                        if ( stream_typeTagOpt.hasNext() ) {
                            adaptor.addChild(root_1, stream_typeTagOpt.nextTree());

                        }
                        stream_typeTagOpt.reset();
                        // Haxe.g:428:86: ( block )?
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
                    // Haxe.g:429:13: ( declAttrList )? FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt block
                    {
                    // Haxe.g:429:13: ( declAttrList )?
                    int alt74=2;
                    int LA74_0 = input.LA(1);

                    if ( (LA74_0==PRIVATE||(LA74_0>=PUBLIC && LA74_0<=OVERRIDE)) ) {
                        alt74=1;
                    }
                    switch (alt74) {
                        case 1 :
                            // Haxe.g:0:0: declAttrList
                            {
                            pushFollow(FOLLOW_declAttrList_in_funcDecl4244);
                            declAttrList338=declAttrList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_declAttrList.add(declAttrList338.getTree());

                            }
                            break;

                    }

                    FUNCTION339=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcDecl4247); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION339);

                    IDENTIFIER340=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_funcDecl4249); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER340);

                    pushFollow(FOLLOW_typeParamOpt_in_funcDecl4251);
                    typeParamOpt341=typeParamOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeParamOpt.add(typeParamOpt341.getTree());
                    LPAREN342=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcDecl4253); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN342);

                    pushFollow(FOLLOW_paramList_in_funcDecl4255);
                    paramList343=paramList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_paramList.add(paramList343.getTree());
                    RPAREN344=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcDecl4257); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN344);

                    pushFollow(FOLLOW_typeTagOpt_in_funcDecl4259);
                    typeTagOpt345=typeTagOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeTagOpt.add(typeTagOpt345.getTree());
                    pushFollow(FOLLOW_block_in_funcDecl4261);
                    block346=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block346.getTree());


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
                    // 430:17: -> ^( FUNCTION IDENTIFIER ( declAttrList )? ( paramList )? ( typeTagOpt )? ( block )? ( typeParamOpt )? )
                    {
                        // Haxe.g:430:20: ^( FUNCTION IDENTIFIER ( declAttrList )? ( paramList )? ( typeTagOpt )? ( block )? ( typeParamOpt )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new FunctionNode(stream_FUNCTION.nextToken()), root_1);

                        adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
                        // Haxe.g:430:56: ( declAttrList )?
                        if ( stream_declAttrList.hasNext() ) {
                            adaptor.addChild(root_1, stream_declAttrList.nextTree());

                        }
                        stream_declAttrList.reset();
                        // Haxe.g:430:70: ( paramList )?
                        if ( stream_paramList.hasNext() ) {
                            adaptor.addChild(root_1, stream_paramList.nextTree());

                        }
                        stream_paramList.reset();
                        // Haxe.g:430:81: ( typeTagOpt )?
                        if ( stream_typeTagOpt.hasNext() ) {
                            adaptor.addChild(root_1, stream_typeTagOpt.nextTree());

                        }
                        stream_typeTagOpt.reset();
                        // Haxe.g:430:93: ( block )?
                        if ( stream_block.hasNext() ) {
                            adaptor.addChild(root_1, stream_block.nextTree());

                        }
                        stream_block.reset();
                        // Haxe.g:430:100: ( typeParamOpt )?
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
    // Haxe.g:433:1: funcProtoDecl : ( declAttrList FUNCTION NEW LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTagOpt )? ( declAttrList )? ) | declAttrList FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTagOpt )? ( declAttrList )? ( typeParamOpt )? ) | FUNCTION NEW LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTagOpt )? ) | FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTagOpt )? ( typeParamOpt )? ) );
    public final HaxeParser.funcProtoDecl_return funcProtoDecl() throws RecognitionException {
        HaxeParser.funcProtoDecl_return retval = new HaxeParser.funcProtoDecl_return();
        retval.start = input.LT(1);
        int funcProtoDecl_StartIndex = input.index();
        Object root_0 = null;

        Token FUNCTION348=null;
        Token NEW349=null;
        Token LPAREN350=null;
        Token RPAREN352=null;
        Token SEMI354=null;
        Token FUNCTION356=null;
        Token IDENTIFIER357=null;
        Token LPAREN359=null;
        Token RPAREN361=null;
        Token SEMI363=null;
        Token FUNCTION364=null;
        Token NEW365=null;
        Token LPAREN366=null;
        Token RPAREN368=null;
        Token SEMI370=null;
        Token FUNCTION371=null;
        Token IDENTIFIER372=null;
        Token LPAREN374=null;
        Token RPAREN376=null;
        Token SEMI378=null;
        HaxeParser.declAttrList_return declAttrList347 = null;

        HaxeParser.paramList_return paramList351 = null;

        HaxeParser.typeTagOpt_return typeTagOpt353 = null;

        HaxeParser.declAttrList_return declAttrList355 = null;

        HaxeParser.typeParamOpt_return typeParamOpt358 = null;

        HaxeParser.paramList_return paramList360 = null;

        HaxeParser.typeTagOpt_return typeTagOpt362 = null;

        HaxeParser.paramList_return paramList367 = null;

        HaxeParser.typeTagOpt_return typeTagOpt369 = null;

        HaxeParser.typeParamOpt_return typeParamOpt373 = null;

        HaxeParser.paramList_return paramList375 = null;

        HaxeParser.typeTagOpt_return typeTagOpt377 = null;


        Object FUNCTION348_tree=null;
        Object NEW349_tree=null;
        Object LPAREN350_tree=null;
        Object RPAREN352_tree=null;
        Object SEMI354_tree=null;
        Object FUNCTION356_tree=null;
        Object IDENTIFIER357_tree=null;
        Object LPAREN359_tree=null;
        Object RPAREN361_tree=null;
        Object SEMI363_tree=null;
        Object FUNCTION364_tree=null;
        Object NEW365_tree=null;
        Object LPAREN366_tree=null;
        Object RPAREN368_tree=null;
        Object SEMI370_tree=null;
        Object FUNCTION371_tree=null;
        Object IDENTIFIER372_tree=null;
        Object LPAREN374_tree=null;
        Object RPAREN376_tree=null;
        Object SEMI378_tree=null;
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
            // Haxe.g:434:5: ( declAttrList FUNCTION NEW LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTagOpt )? ( declAttrList )? ) | declAttrList FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTagOpt )? ( declAttrList )? ( typeParamOpt )? ) | FUNCTION NEW LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTagOpt )? ) | FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTagOpt )? ( typeParamOpt )? ) )
            int alt76=4;
            alt76 = dfa76.predict(input);
            switch (alt76) {
                case 1 :
                    // Haxe.g:434:9: declAttrList FUNCTION NEW LPAREN paramList RPAREN typeTagOpt SEMI
                    {
                    pushFollow(FOLLOW_declAttrList_in_funcProtoDecl4331);
                    declAttrList347=declAttrList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declAttrList.add(declAttrList347.getTree());
                    FUNCTION348=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcProtoDecl4333); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION348);

                    NEW349=(Token)match(input,NEW,FOLLOW_NEW_in_funcProtoDecl4335); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEW.add(NEW349);

                    LPAREN350=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcProtoDecl4337); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN350);

                    pushFollow(FOLLOW_paramList_in_funcProtoDecl4339);
                    paramList351=paramList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_paramList.add(paramList351.getTree());
                    RPAREN352=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcProtoDecl4341); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN352);

                    pushFollow(FOLLOW_typeTagOpt_in_funcProtoDecl4343);
                    typeTagOpt353=typeTagOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeTagOpt.add(typeTagOpt353.getTree());
                    SEMI354=(Token)match(input,SEMI,FOLLOW_SEMI_in_funcProtoDecl4345); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI354);



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
                    // 435:13: -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTagOpt )? ( declAttrList )? )
                    {
                        // Haxe.g:435:16: ^( FUNCTION ( NEW )? ( paramList )? ( typeTagOpt )? ( declAttrList )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_FUNCTION.nextNode(), root_1);

                        // Haxe.g:435:27: ( NEW )?
                        if ( stream_NEW.hasNext() ) {
                            adaptor.addChild(root_1, stream_NEW.nextNode());

                        }
                        stream_NEW.reset();
                        // Haxe.g:435:32: ( paramList )?
                        if ( stream_paramList.hasNext() ) {
                            adaptor.addChild(root_1, stream_paramList.nextTree());

                        }
                        stream_paramList.reset();
                        // Haxe.g:435:43: ( typeTagOpt )?
                        if ( stream_typeTagOpt.hasNext() ) {
                            adaptor.addChild(root_1, stream_typeTagOpt.nextTree());

                        }
                        stream_typeTagOpt.reset();
                        // Haxe.g:435:55: ( declAttrList )?
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
                    // Haxe.g:436:9: declAttrList FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt SEMI
                    {
                    pushFollow(FOLLOW_declAttrList_in_funcProtoDecl4386);
                    declAttrList355=declAttrList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declAttrList.add(declAttrList355.getTree());
                    FUNCTION356=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcProtoDecl4388); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION356);

                    IDENTIFIER357=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_funcProtoDecl4390); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER357);

                    pushFollow(FOLLOW_typeParamOpt_in_funcProtoDecl4392);
                    typeParamOpt358=typeParamOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeParamOpt.add(typeParamOpt358.getTree());
                    LPAREN359=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcProtoDecl4394); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN359);

                    pushFollow(FOLLOW_paramList_in_funcProtoDecl4396);
                    paramList360=paramList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_paramList.add(paramList360.getTree());
                    RPAREN361=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcProtoDecl4398); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN361);

                    pushFollow(FOLLOW_typeTagOpt_in_funcProtoDecl4400);
                    typeTagOpt362=typeTagOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeTagOpt.add(typeTagOpt362.getTree());
                    SEMI363=(Token)match(input,SEMI,FOLLOW_SEMI_in_funcProtoDecl4402); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI363);



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
                    // 437:13: -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTagOpt )? ( declAttrList )? ( typeParamOpt )? )
                    {
                        // Haxe.g:437:16: ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTagOpt )? ( declAttrList )? ( typeParamOpt )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_FUNCTION.nextNode(), root_1);

                        // Haxe.g:437:27: ( IDENTIFIER )?
                        if ( stream_IDENTIFIER.hasNext() ) {
                            adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());

                        }
                        stream_IDENTIFIER.reset();
                        // Haxe.g:437:39: ( paramList )?
                        if ( stream_paramList.hasNext() ) {
                            adaptor.addChild(root_1, stream_paramList.nextTree());

                        }
                        stream_paramList.reset();
                        // Haxe.g:437:50: ( typeTagOpt )?
                        if ( stream_typeTagOpt.hasNext() ) {
                            adaptor.addChild(root_1, stream_typeTagOpt.nextTree());

                        }
                        stream_typeTagOpt.reset();
                        // Haxe.g:437:62: ( declAttrList )?
                        if ( stream_declAttrList.hasNext() ) {
                            adaptor.addChild(root_1, stream_declAttrList.nextTree());

                        }
                        stream_declAttrList.reset();
                        // Haxe.g:437:76: ( typeParamOpt )?
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
                    // Haxe.g:438:9: FUNCTION NEW LPAREN paramList RPAREN typeTagOpt SEMI
                    {
                    FUNCTION364=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcProtoDecl4446); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION364);

                    NEW365=(Token)match(input,NEW,FOLLOW_NEW_in_funcProtoDecl4448); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEW.add(NEW365);

                    LPAREN366=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcProtoDecl4450); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN366);

                    pushFollow(FOLLOW_paramList_in_funcProtoDecl4452);
                    paramList367=paramList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_paramList.add(paramList367.getTree());
                    RPAREN368=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcProtoDecl4454); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN368);

                    pushFollow(FOLLOW_typeTagOpt_in_funcProtoDecl4456);
                    typeTagOpt369=typeTagOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeTagOpt.add(typeTagOpt369.getTree());
                    SEMI370=(Token)match(input,SEMI,FOLLOW_SEMI_in_funcProtoDecl4458); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI370);



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
                    // 439:13: -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTagOpt )? )
                    {
                        // Haxe.g:439:16: ^( FUNCTION ( NEW )? ( paramList )? ( typeTagOpt )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_FUNCTION.nextNode(), root_1);

                        // Haxe.g:439:27: ( NEW )?
                        if ( stream_NEW.hasNext() ) {
                            adaptor.addChild(root_1, stream_NEW.nextNode());

                        }
                        stream_NEW.reset();
                        // Haxe.g:439:32: ( paramList )?
                        if ( stream_paramList.hasNext() ) {
                            adaptor.addChild(root_1, stream_paramList.nextTree());

                        }
                        stream_paramList.reset();
                        // Haxe.g:439:43: ( typeTagOpt )?
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
                    // Haxe.g:440:9: FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt SEMI
                    {
                    FUNCTION371=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcProtoDecl4496); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION371);

                    IDENTIFIER372=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_funcProtoDecl4498); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER372);

                    pushFollow(FOLLOW_typeParamOpt_in_funcProtoDecl4500);
                    typeParamOpt373=typeParamOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeParamOpt.add(typeParamOpt373.getTree());
                    LPAREN374=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcProtoDecl4502); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN374);

                    pushFollow(FOLLOW_paramList_in_funcProtoDecl4504);
                    paramList375=paramList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_paramList.add(paramList375.getTree());
                    RPAREN376=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcProtoDecl4506); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN376);

                    pushFollow(FOLLOW_typeTagOpt_in_funcProtoDecl4508);
                    typeTagOpt377=typeTagOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeTagOpt.add(typeTagOpt377.getTree());
                    SEMI378=(Token)match(input,SEMI,FOLLOW_SEMI_in_funcProtoDecl4510); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI378);



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
                    // 441:13: -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTagOpt )? ( typeParamOpt )? )
                    {
                        // Haxe.g:441:16: ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTagOpt )? ( typeParamOpt )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_FUNCTION.nextNode(), root_1);

                        // Haxe.g:441:27: ( IDENTIFIER )?
                        if ( stream_IDENTIFIER.hasNext() ) {
                            adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());

                        }
                        stream_IDENTIFIER.reset();
                        // Haxe.g:441:39: ( paramList )?
                        if ( stream_paramList.hasNext() ) {
                            adaptor.addChild(root_1, stream_paramList.nextTree());

                        }
                        stream_paramList.reset();
                        // Haxe.g:441:50: ( typeTagOpt )?
                        if ( stream_typeTagOpt.hasNext() ) {
                            adaptor.addChild(root_1, stream_typeTagOpt.nextTree());

                        }
                        stream_typeTagOpt.reset();
                        // Haxe.g:441:62: ( typeParamOpt )?
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
    // Haxe.g:444:1: classDecl : typeDeclFlags CLASS IDENTIFIER typeParamOpt inheritListOpt classBodyScope -> ^( CLASS IDENTIFIER ( typeDeclFlags )? ( typeParamOpt )? ( inheritListOpt )? ( classBodyScope )? ) ;
    public final HaxeParser.classDecl_return classDecl() throws RecognitionException {
        HaxeParser.classDecl_return retval = new HaxeParser.classDecl_return();
        retval.start = input.LT(1);
        int classDecl_StartIndex = input.index();
        Object root_0 = null;

        Token CLASS380=null;
        Token IDENTIFIER381=null;
        HaxeParser.typeDeclFlags_return typeDeclFlags379 = null;

        HaxeParser.typeParamOpt_return typeParamOpt382 = null;

        HaxeParser.inheritListOpt_return inheritListOpt383 = null;

        HaxeParser.classBodyScope_return classBodyScope384 = null;


        Object CLASS380_tree=null;
        Object IDENTIFIER381_tree=null;
        RewriteRuleTokenStream stream_CLASS=new RewriteRuleTokenStream(adaptor,"token CLASS");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleSubtreeStream stream_typeDeclFlags=new RewriteRuleSubtreeStream(adaptor,"rule typeDeclFlags");
        RewriteRuleSubtreeStream stream_classBodyScope=new RewriteRuleSubtreeStream(adaptor,"rule classBodyScope");
        RewriteRuleSubtreeStream stream_typeParamOpt=new RewriteRuleSubtreeStream(adaptor,"rule typeParamOpt");
        RewriteRuleSubtreeStream stream_inheritListOpt=new RewriteRuleSubtreeStream(adaptor,"rule inheritListOpt");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 74) ) { return retval; }
            // Haxe.g:445:5: ( typeDeclFlags CLASS IDENTIFIER typeParamOpt inheritListOpt classBodyScope -> ^( CLASS IDENTIFIER ( typeDeclFlags )? ( typeParamOpt )? ( inheritListOpt )? ( classBodyScope )? ) )
            // Haxe.g:445:9: typeDeclFlags CLASS IDENTIFIER typeParamOpt inheritListOpt classBodyScope
            {
            pushFollow(FOLLOW_typeDeclFlags_in_classDecl4564);
            typeDeclFlags379=typeDeclFlags();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeDeclFlags.add(typeDeclFlags379.getTree());
            CLASS380=(Token)match(input,CLASS,FOLLOW_CLASS_in_classDecl4566); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CLASS.add(CLASS380);

            IDENTIFIER381=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_classDecl4568); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER381);

            pushFollow(FOLLOW_typeParamOpt_in_classDecl4570);
            typeParamOpt382=typeParamOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeParamOpt.add(typeParamOpt382.getTree());
            pushFollow(FOLLOW_inheritListOpt_in_classDecl4572);
            inheritListOpt383=inheritListOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_inheritListOpt.add(inheritListOpt383.getTree());
            pushFollow(FOLLOW_classBodyScope_in_classDecl4574);
            classBodyScope384=classBodyScope();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_classBodyScope.add(classBodyScope384.getTree());


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
            // 446:13: -> ^( CLASS IDENTIFIER ( typeDeclFlags )? ( typeParamOpt )? ( inheritListOpt )? ( classBodyScope )? )
            {
                // Haxe.g:446:16: ^( CLASS IDENTIFIER ( typeDeclFlags )? ( typeParamOpt )? ( inheritListOpt )? ( classBodyScope )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new ClassNode(stream_CLASS.nextToken()), root_1);

                adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
                // Haxe.g:446:46: ( typeDeclFlags )?
                if ( stream_typeDeclFlags.hasNext() ) {
                    adaptor.addChild(root_1, stream_typeDeclFlags.nextTree());

                }
                stream_typeDeclFlags.reset();
                // Haxe.g:446:61: ( typeParamOpt )?
                if ( stream_typeParamOpt.hasNext() ) {
                    adaptor.addChild(root_1, stream_typeParamOpt.nextTree());

                }
                stream_typeParamOpt.reset();
                // Haxe.g:446:75: ( inheritListOpt )?
                if ( stream_inheritListOpt.hasNext() ) {
                    adaptor.addChild(root_1, stream_inheritListOpt.nextTree());

                }
                stream_inheritListOpt.reset();
                // Haxe.g:446:91: ( classBodyScope )?
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
    // Haxe.g:449:1: classBodyScope : LBRACE ( classMember )* RBRACE -> ^( BLOCK_SCOPE[\"BLOCK_SCOPE\", true, $LBRACE] ( classMember )* RBRACE[$RBRACE, true] ) ;
    public final HaxeParser.classBodyScope_return classBodyScope() throws RecognitionException {
        HaxeParser.classBodyScope_return retval = new HaxeParser.classBodyScope_return();
        retval.start = input.LT(1);
        int classBodyScope_StartIndex = input.index();
        Object root_0 = null;

        Token LBRACE385=null;
        Token RBRACE387=null;
        HaxeParser.classMember_return classMember386 = null;


        Object LBRACE385_tree=null;
        Object RBRACE387_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_classMember=new RewriteRuleSubtreeStream(adaptor,"rule classMember");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 75) ) { return retval; }
            // Haxe.g:450:5: ( LBRACE ( classMember )* RBRACE -> ^( BLOCK_SCOPE[\"BLOCK_SCOPE\", true, $LBRACE] ( classMember )* RBRACE[$RBRACE, true] ) )
            // Haxe.g:450:9: LBRACE ( classMember )* RBRACE
            {
            LBRACE385=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_classBodyScope4632); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACE.add(LBRACE385);

            // Haxe.g:450:16: ( classMember )*
            loop77:
            do {
                int alt77=2;
                int LA77_0 = input.LA(1);

                if ( (LA77_0==MONKEYS_AT||(LA77_0>=EXTERN && LA77_0<=PRIVATE)||(LA77_0>=PUBLIC && LA77_0<=OVERRIDE)||LA77_0==FUNCTION||(LA77_0>=ENUM && LA77_0<=VAR)||(LA77_0>=CLASS && LA77_0<=INTERFACE)) ) {
                    alt77=1;
                }


                switch (alt77) {
            	case 1 :
            	    // Haxe.g:450:17: classMember
            	    {
            	    pushFollow(FOLLOW_classMember_in_classBodyScope4635);
            	    classMember386=classMember();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_classMember.add(classMember386.getTree());

            	    }
            	    break;

            	default :
            	    break loop77;
                }
            } while (true);

            RBRACE387=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_classBodyScope4639); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACE.add(RBRACE387);



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
            // 450:38: -> ^( BLOCK_SCOPE[\"BLOCK_SCOPE\", true, $LBRACE] ( classMember )* RBRACE[$RBRACE, true] )
            {
                // Haxe.g:450:41: ^( BLOCK_SCOPE[\"BLOCK_SCOPE\", true, $LBRACE] ( classMember )* RBRACE[$RBRACE, true] )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new BlockScopeNode(BLOCK_SCOPE, "BLOCK_SCOPE", true, LBRACE385), root_1);

                // Haxe.g:450:101: ( classMember )*
                while ( stream_classMember.hasNext() ) {
                    adaptor.addChild(root_1, stream_classMember.nextTree());

                }
                stream_classMember.reset();
                adaptor.addChild(root_1, new HaxeTree(RBRACE, RBRACE387, true));

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
    // Haxe.g:453:1: classMember : ( varDecl | funcDecl | enumDecl );
    public final HaxeParser.classMember_return classMember() throws RecognitionException {
        HaxeParser.classMember_return retval = new HaxeParser.classMember_return();
        retval.start = input.LT(1);
        int classMember_StartIndex = input.index();
        Object root_0 = null;

        HaxeParser.varDecl_return varDecl388 = null;

        HaxeParser.funcDecl_return funcDecl389 = null;

        HaxeParser.enumDecl_return enumDecl390 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 76) ) { return retval; }
            // Haxe.g:454:5: ( varDecl | funcDecl | enumDecl )
            int alt78=3;
            alt78 = dfa78.predict(input);
            switch (alt78) {
                case 1 :
                    // Haxe.g:454:9: varDecl
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_varDecl_in_classMember4677);
                    varDecl388=varDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDecl388.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:455:9: funcDecl
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_funcDecl_in_classMember4688);
                    funcDecl389=funcDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, funcDecl389.getTree());

                    }
                    break;
                case 3 :
                    // Haxe.g:457:9: enumDecl
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_enumDecl_in_classMember4700);
                    enumDecl390=enumDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, enumDecl390.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // Haxe.g:460:1: interfaceDecl : typeDeclFlags INTERFACE type inheritListOpt LBRACE interfaceBody RBRACE ;
    public final HaxeParser.interfaceDecl_return interfaceDecl() throws RecognitionException {
        HaxeParser.interfaceDecl_return retval = new HaxeParser.interfaceDecl_return();
        retval.start = input.LT(1);
        int interfaceDecl_StartIndex = input.index();
        Object root_0 = null;

        Token INTERFACE392=null;
        Token LBRACE395=null;
        Token RBRACE397=null;
        HaxeParser.typeDeclFlags_return typeDeclFlags391 = null;

        HaxeParser.type_return type393 = null;

        HaxeParser.inheritListOpt_return inheritListOpt394 = null;

        HaxeParser.interfaceBody_return interfaceBody396 = null;


        Object INTERFACE392_tree=null;
        Object LBRACE395_tree=null;
        Object RBRACE397_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 77) ) { return retval; }
            // Haxe.g:461:5: ( typeDeclFlags INTERFACE type inheritListOpt LBRACE interfaceBody RBRACE )
            // Haxe.g:461:9: typeDeclFlags INTERFACE type inheritListOpt LBRACE interfaceBody RBRACE
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_typeDeclFlags_in_interfaceDecl4729);
            typeDeclFlags391=typeDeclFlags();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, typeDeclFlags391.getTree());
            INTERFACE392=(Token)match(input,INTERFACE,FOLLOW_INTERFACE_in_interfaceDecl4731); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            INTERFACE392_tree = (Object)adaptor.create(INTERFACE392);
            adaptor.addChild(root_0, INTERFACE392_tree);
            }
            pushFollow(FOLLOW_type_in_interfaceDecl4733);
            type393=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type393.getTree());
            pushFollow(FOLLOW_inheritListOpt_in_interfaceDecl4735);
            inheritListOpt394=inheritListOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, inheritListOpt394.getTree());
            LBRACE395=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_interfaceDecl4737); if (state.failed) return retval;
            pushFollow(FOLLOW_interfaceBody_in_interfaceDecl4740);
            interfaceBody396=interfaceBody();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceBody396.getTree());
            RBRACE397=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_interfaceDecl4742); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // Haxe.g:464:1: interfaceBody : ( varDecl interfaceBody | funcProtoDecl interfaceBody | );
    public final HaxeParser.interfaceBody_return interfaceBody() throws RecognitionException {
        HaxeParser.interfaceBody_return retval = new HaxeParser.interfaceBody_return();
        retval.start = input.LT(1);
        int interfaceBody_StartIndex = input.index();
        Object root_0 = null;

        HaxeParser.varDecl_return varDecl398 = null;

        HaxeParser.interfaceBody_return interfaceBody399 = null;

        HaxeParser.funcProtoDecl_return funcProtoDecl400 = null;

        HaxeParser.interfaceBody_return interfaceBody401 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 78) ) { return retval; }
            // Haxe.g:465:5: ( varDecl interfaceBody | funcProtoDecl interfaceBody | )
            int alt79=3;
            alt79 = dfa79.predict(input);
            switch (alt79) {
                case 1 :
                    // Haxe.g:465:9: varDecl interfaceBody
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_varDecl_in_interfaceBody4766);
                    varDecl398=varDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDecl398.getTree());
                    pushFollow(FOLLOW_interfaceBody_in_interfaceBody4768);
                    interfaceBody399=interfaceBody();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceBody399.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:466:9: funcProtoDecl interfaceBody
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_funcProtoDecl_in_interfaceBody4778);
                    funcProtoDecl400=funcProtoDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, funcProtoDecl400.getTree());
                    pushFollow(FOLLOW_interfaceBody_in_interfaceBody4780);
                    interfaceBody401=interfaceBody();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceBody401.getTree());

                    }
                    break;
                case 3 :
                    // Haxe.g:469:5: 
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
    // Haxe.g:471:1: inheritList : inherit ( COMMA inherit )* ;
    public final HaxeParser.inheritList_return inheritList() throws RecognitionException {
        HaxeParser.inheritList_return retval = new HaxeParser.inheritList_return();
        retval.start = input.LT(1);
        int inheritList_StartIndex = input.index();
        Object root_0 = null;

        Token COMMA403=null;
        HaxeParser.inherit_return inherit402 = null;

        HaxeParser.inherit_return inherit404 = null;


        Object COMMA403_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 79) ) { return retval; }
            // Haxe.g:472:5: ( inherit ( COMMA inherit )* )
            // Haxe.g:472:10: inherit ( COMMA inherit )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_inherit_in_inheritList4814);
            inherit402=inherit();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, inherit402.getTree());
            // Haxe.g:472:18: ( COMMA inherit )*
            loop80:
            do {
                int alt80=2;
                int LA80_0 = input.LA(1);

                if ( (LA80_0==COMMA) ) {
                    alt80=1;
                }


                switch (alt80) {
            	case 1 :
            	    // Haxe.g:472:19: COMMA inherit
            	    {
            	    COMMA403=(Token)match(input,COMMA,FOLLOW_COMMA_in_inheritList4817); if (state.failed) return retval;
            	    pushFollow(FOLLOW_inherit_in_inheritList4820);
            	    inherit404=inherit();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, inherit404.getTree());

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
    // Haxe.g:475:1: inheritListOpt : ( inheritList -> ^( INHERIT_LIST_OPT[\"INHERIT_LIST_OPT\",true] ( inheritList )? ) | );
    public final HaxeParser.inheritListOpt_return inheritListOpt() throws RecognitionException {
        HaxeParser.inheritListOpt_return retval = new HaxeParser.inheritListOpt_return();
        retval.start = input.LT(1);
        int inheritListOpt_StartIndex = input.index();
        Object root_0 = null;

        HaxeParser.inheritList_return inheritList405 = null;


        RewriteRuleSubtreeStream stream_inheritList=new RewriteRuleSubtreeStream(adaptor,"rule inheritList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 80) ) { return retval; }
            // Haxe.g:476:5: ( inheritList -> ^( INHERIT_LIST_OPT[\"INHERIT_LIST_OPT\",true] ( inheritList )? ) | )
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( ((LA81_0>=EXTENDS && LA81_0<=IMPLEMENTS)) ) {
                alt81=1;
            }
            else if ( (LA81_0==LBRACE) ) {
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
                    // Haxe.g:476:10: inheritList
                    {
                    pushFollow(FOLLOW_inheritList_in_inheritListOpt4850);
                    inheritList405=inheritList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_inheritList.add(inheritList405.getTree());


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
                    // 476:22: -> ^( INHERIT_LIST_OPT[\"INHERIT_LIST_OPT\",true] ( inheritList )? )
                    {
                        // Haxe.g:476:25: ^( INHERIT_LIST_OPT[\"INHERIT_LIST_OPT\",true] ( inheritList )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new HaxeTree(INHERIT_LIST_OPT, "INHERIT_LIST_OPT", true), root_1);

                        // Haxe.g:476:79: ( inheritList )?
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
                    // Haxe.g:478:9: 
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
    // Haxe.g:480:1: inherit : ( EXTENDS type -> ^( EXTENDS ( type )? ) | IMPLEMENTS type -> ^( IMPLEMENTS ( type )? ) );
    public final HaxeParser.inherit_return inherit() throws RecognitionException {
        HaxeParser.inherit_return retval = new HaxeParser.inherit_return();
        retval.start = input.LT(1);
        int inherit_StartIndex = input.index();
        Object root_0 = null;

        Token EXTENDS406=null;
        Token IMPLEMENTS408=null;
        HaxeParser.type_return type407 = null;

        HaxeParser.type_return type409 = null;


        Object EXTENDS406_tree=null;
        Object IMPLEMENTS408_tree=null;
        RewriteRuleTokenStream stream_IMPLEMENTS=new RewriteRuleTokenStream(adaptor,"token IMPLEMENTS");
        RewriteRuleTokenStream stream_EXTENDS=new RewriteRuleTokenStream(adaptor,"token EXTENDS");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 81) ) { return retval; }
            // Haxe.g:480:12: ( EXTENDS type -> ^( EXTENDS ( type )? ) | IMPLEMENTS type -> ^( IMPLEMENTS ( type )? ) )
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==EXTENDS) ) {
                alt82=1;
            }
            else if ( (LA82_0==IMPLEMENTS) ) {
                alt82=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 82, 0, input);

                throw nvae;
            }
            switch (alt82) {
                case 1 :
                    // Haxe.g:480:17: EXTENDS type
                    {
                    EXTENDS406=(Token)match(input,EXTENDS,FOLLOW_EXTENDS_in_inherit4904); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EXTENDS.add(EXTENDS406);

                    pushFollow(FOLLOW_type_in_inherit4906);
                    type407=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type407.getTree());


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
                    // 480:34: -> ^( EXTENDS ( type )? )
                    {
                        // Haxe.g:480:37: ^( EXTENDS ( type )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_EXTENDS.nextNode(), root_1);

                        // Haxe.g:480:47: ( type )?
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
                    // Haxe.g:481:14: IMPLEMENTS type
                    {
                    IMPLEMENTS408=(Token)match(input,IMPLEMENTS,FOLLOW_IMPLEMENTS_in_inherit4934); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IMPLEMENTS.add(IMPLEMENTS408);

                    pushFollow(FOLLOW_type_in_inherit4936);
                    type409=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type409.getTree());


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
                    // 481:30: -> ^( IMPLEMENTS ( type )? )
                    {
                        // Haxe.g:481:33: ^( IMPLEMENTS ( type )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_IMPLEMENTS.nextNode(), root_1);

                        // Haxe.g:481:46: ( type )?
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
    // Haxe.g:484:1: typedefDecl : TYPEDEF IDENTIFIER EQ funcType ;
    public final HaxeParser.typedefDecl_return typedefDecl() throws RecognitionException {
        HaxeParser.typedefDecl_return retval = new HaxeParser.typedefDecl_return();
        retval.start = input.LT(1);
        int typedefDecl_StartIndex = input.index();
        Object root_0 = null;

        Token TYPEDEF410=null;
        Token IDENTIFIER411=null;
        Token EQ412=null;
        HaxeParser.funcType_return funcType413 = null;


        Object TYPEDEF410_tree=null;
        Object IDENTIFIER411_tree=null;
        Object EQ412_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 82) ) { return retval; }
            // Haxe.g:485:5: ( TYPEDEF IDENTIFIER EQ funcType )
            // Haxe.g:485:10: TYPEDEF IDENTIFIER EQ funcType
            {
            root_0 = (Object)adaptor.nil();

            TYPEDEF410=(Token)match(input,TYPEDEF,FOLLOW_TYPEDEF_in_typedefDecl4976); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TYPEDEF410_tree = (Object)adaptor.create(TYPEDEF410);
            adaptor.addChild(root_0, TYPEDEF410_tree);
            }
            IDENTIFIER411=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_typedefDecl4978); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER411_tree = (Object)adaptor.create(IDENTIFIER411);
            adaptor.addChild(root_0, IDENTIFIER411_tree);
            }
            EQ412=(Token)match(input,EQ,FOLLOW_EQ_in_typedefDecl4980); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            EQ412_tree = (Object)adaptor.create(EQ412);
            adaptor.addChild(root_0, EQ412_tree);
            }
            pushFollow(FOLLOW_funcType_in_typedefDecl4982);
            funcType413=funcType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, funcType413.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // Haxe.g:488:1: typeExtend : GT funcType COMMA ;
    public final HaxeParser.typeExtend_return typeExtend() throws RecognitionException {
        HaxeParser.typeExtend_return retval = new HaxeParser.typeExtend_return();
        retval.start = input.LT(1);
        int typeExtend_StartIndex = input.index();
        Object root_0 = null;

        Token GT414=null;
        Token COMMA416=null;
        HaxeParser.funcType_return funcType415 = null;


        Object GT414_tree=null;
        Object COMMA416_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 83) ) { return retval; }
            // Haxe.g:489:9: ( GT funcType COMMA )
            // Haxe.g:489:14: GT funcType COMMA
            {
            root_0 = (Object)adaptor.nil();

            GT414=(Token)match(input,GT,FOLLOW_GT_in_typeExtend5010); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            GT414_tree = (Object)adaptor.create(GT414);
            adaptor.addChild(root_0, GT414_tree);
            }
            pushFollow(FOLLOW_funcType_in_typeExtend5012);
            funcType415=funcType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, funcType415.getTree());
            COMMA416=(Token)match(input,COMMA,FOLLOW_COMMA_in_typeExtend5014); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // Haxe.g:492:1: anonType : LBRACE ( | anonTypeFieldList | varDeclList | typeExtend ( | anonTypeFieldList | varDeclList ) ) RBRACE ;
    public final HaxeParser.anonType_return anonType() throws RecognitionException {
        HaxeParser.anonType_return retval = new HaxeParser.anonType_return();
        retval.start = input.LT(1);
        int anonType_StartIndex = input.index();
        Object root_0 = null;

        Token LBRACE417=null;
        Token RBRACE423=null;
        HaxeParser.anonTypeFieldList_return anonTypeFieldList418 = null;

        HaxeParser.varDeclList_return varDeclList419 = null;

        HaxeParser.typeExtend_return typeExtend420 = null;

        HaxeParser.anonTypeFieldList_return anonTypeFieldList421 = null;

        HaxeParser.varDeclList_return varDeclList422 = null;


        Object LBRACE417_tree=null;
        Object RBRACE423_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 84) ) { return retval; }
            // Haxe.g:492:9: ( LBRACE ( | anonTypeFieldList | varDeclList | typeExtend ( | anonTypeFieldList | varDeclList ) ) RBRACE )
            // Haxe.g:492:14: LBRACE ( | anonTypeFieldList | varDeclList | typeExtend ( | anonTypeFieldList | varDeclList ) ) RBRACE
            {
            root_0 = (Object)adaptor.nil();

            LBRACE417=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_anonType5034); if (state.failed) return retval;
            // Haxe.g:493:13: ( | anonTypeFieldList | varDeclList | typeExtend ( | anonTypeFieldList | varDeclList ) )
            int alt84=4;
            switch ( input.LA(1) ) {
            case RBRACE:
                {
                alt84=1;
                }
                break;
            case IDENTIFIER:
                {
                alt84=2;
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
                alt84=3;
                }
                break;
            case GT:
                {
                alt84=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 84, 0, input);

                throw nvae;
            }

            switch (alt84) {
                case 1 :
                    // Haxe.g:494:25: 
                    {
                    }
                    break;
                case 2 :
                    // Haxe.g:494:30: anonTypeFieldList
                    {
                    pushFollow(FOLLOW_anonTypeFieldList_in_anonType5081);
                    anonTypeFieldList418=anonTypeFieldList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, anonTypeFieldList418.getTree());

                    }
                    break;
                case 3 :
                    // Haxe.g:495:29: varDeclList
                    {
                    pushFollow(FOLLOW_varDeclList_in_anonType5112);
                    varDeclList419=varDeclList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclList419.getTree());

                    }
                    break;
                case 4 :
                    // Haxe.g:496:30: typeExtend ( | anonTypeFieldList | varDeclList )
                    {
                    pushFollow(FOLLOW_typeExtend_in_anonType5144);
                    typeExtend420=typeExtend();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeExtend420.getTree());
                    // Haxe.g:496:41: ( | anonTypeFieldList | varDeclList )
                    int alt83=3;
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
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 83, 0, input);

                        throw nvae;
                    }

                    switch (alt83) {
                        case 1 :
                            // Haxe.g:497:33: 
                            {
                            }
                            break;
                        case 2 :
                            // Haxe.g:497:34: anonTypeFieldList
                            {
                            pushFollow(FOLLOW_anonTypeFieldList_in_anonType5181);
                            anonTypeFieldList421=anonTypeFieldList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, anonTypeFieldList421.getTree());

                            }
                            break;
                        case 3 :
                            // Haxe.g:498:34: varDeclList
                            {
                            pushFollow(FOLLOW_varDeclList_in_anonType5216);
                            varDeclList422=varDeclList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclList422.getTree());

                            }
                            break;

                    }


                    }
                    break;

            }

            RBRACE423=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_anonType5263); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // Haxe.g:503:1: anonTypeFieldList : anonTypeField ( COMMA anonTypeField )* ;
    public final HaxeParser.anonTypeFieldList_return anonTypeFieldList() throws RecognitionException {
        HaxeParser.anonTypeFieldList_return retval = new HaxeParser.anonTypeFieldList_return();
        retval.start = input.LT(1);
        int anonTypeFieldList_StartIndex = input.index();
        Object root_0 = null;

        Token COMMA425=null;
        HaxeParser.anonTypeField_return anonTypeField424 = null;

        HaxeParser.anonTypeField_return anonTypeField426 = null;


        Object COMMA425_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 85) ) { return retval; }
            // Haxe.g:504:5: ( anonTypeField ( COMMA anonTypeField )* )
            // Haxe.g:504:10: anonTypeField ( COMMA anonTypeField )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_anonTypeField_in_anonTypeFieldList5289);
            anonTypeField424=anonTypeField();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, anonTypeField424.getTree());
            // Haxe.g:504:24: ( COMMA anonTypeField )*
            loop85:
            do {
                int alt85=2;
                int LA85_0 = input.LA(1);

                if ( (LA85_0==COMMA) ) {
                    alt85=1;
                }


                switch (alt85) {
            	case 1 :
            	    // Haxe.g:504:25: COMMA anonTypeField
            	    {
            	    COMMA425=(Token)match(input,COMMA,FOLLOW_COMMA_in_anonTypeFieldList5292); if (state.failed) return retval;
            	    pushFollow(FOLLOW_anonTypeField_in_anonTypeFieldList5295);
            	    anonTypeField426=anonTypeField();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, anonTypeField426.getTree());

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
    // Haxe.g:507:1: objLit : '{' objLitElemList '}' ;
    public final HaxeParser.objLit_return objLit() throws RecognitionException {
        HaxeParser.objLit_return retval = new HaxeParser.objLit_return();
        retval.start = input.LT(1);
        int objLit_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal427=null;
        Token char_literal429=null;
        HaxeParser.objLitElemList_return objLitElemList428 = null;


        Object char_literal427_tree=null;
        Object char_literal429_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 86) ) { return retval; }
            // Haxe.g:507:11: ( '{' objLitElemList '}' )
            // Haxe.g:507:16: '{' objLitElemList '}'
            {
            root_0 = (Object)adaptor.nil();

            char_literal427=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_objLit5316); if (state.failed) return retval;
            pushFollow(FOLLOW_objLitElemList_in_objLit5319);
            objLitElemList428=objLitElemList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, objLitElemList428.getTree());
            char_literal429=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_objLit5321); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // Haxe.g:510:1: anonTypeField : IDENTIFIER COLON funcType ;
    public final HaxeParser.anonTypeField_return anonTypeField() throws RecognitionException {
        HaxeParser.anonTypeField_return retval = new HaxeParser.anonTypeField_return();
        retval.start = input.LT(1);
        int anonTypeField_StartIndex = input.index();
        Object root_0 = null;

        Token IDENTIFIER430=null;
        Token COLON431=null;
        HaxeParser.funcType_return funcType432 = null;


        Object IDENTIFIER430_tree=null;
        Object COLON431_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 87) ) { return retval; }
            // Haxe.g:511:5: ( IDENTIFIER COLON funcType )
            // Haxe.g:511:10: IDENTIFIER COLON funcType
            {
            root_0 = (Object)adaptor.nil();

            IDENTIFIER430=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_anonTypeField5342); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER430_tree = (Object)adaptor.create(IDENTIFIER430);
            adaptor.addChild(root_0, IDENTIFIER430_tree);
            }
            COLON431=(Token)match(input,COLON,FOLLOW_COLON_in_anonTypeField5344); if (state.failed) return retval;
            pushFollow(FOLLOW_funcType_in_anonTypeField5347);
            funcType432=funcType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, funcType432.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // Haxe.g:514:1: objLitElemList : objLitElem ( COMMA objLitElem )* ;
    public final HaxeParser.objLitElemList_return objLitElemList() throws RecognitionException {
        HaxeParser.objLitElemList_return retval = new HaxeParser.objLitElemList_return();
        retval.start = input.LT(1);
        int objLitElemList_StartIndex = input.index();
        Object root_0 = null;

        Token COMMA434=null;
        HaxeParser.objLitElem_return objLitElem433 = null;

        HaxeParser.objLitElem_return objLitElem435 = null;


        Object COMMA434_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 88) ) { return retval; }
            // Haxe.g:515:5: ( objLitElem ( COMMA objLitElem )* )
            // Haxe.g:515:10: objLitElem ( COMMA objLitElem )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_objLitElem_in_objLitElemList5375);
            objLitElem433=objLitElem();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, objLitElem433.getTree());
            // Haxe.g:515:21: ( COMMA objLitElem )*
            loop86:
            do {
                int alt86=2;
                int LA86_0 = input.LA(1);

                if ( (LA86_0==COMMA) ) {
                    alt86=1;
                }


                switch (alt86) {
            	case 1 :
            	    // Haxe.g:515:22: COMMA objLitElem
            	    {
            	    COMMA434=(Token)match(input,COMMA,FOLLOW_COMMA_in_objLitElemList5378); if (state.failed) return retval;
            	    pushFollow(FOLLOW_objLitElem_in_objLitElemList5381);
            	    objLitElem435=objLitElem();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, objLitElem435.getTree());

            	    }
            	    break;

            	default :
            	    break loop86;
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
    // Haxe.g:518:1: objLitElem : IDENTIFIER COLON expr ;
    public final HaxeParser.objLitElem_return objLitElem() throws RecognitionException {
        HaxeParser.objLitElem_return retval = new HaxeParser.objLitElem_return();
        retval.start = input.LT(1);
        int objLitElem_StartIndex = input.index();
        Object root_0 = null;

        Token IDENTIFIER436=null;
        Token COLON437=null;
        HaxeParser.expr_return expr438 = null;


        Object IDENTIFIER436_tree=null;
        Object COLON437_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 89) ) { return retval; }
            // Haxe.g:519:9: ( IDENTIFIER COLON expr )
            // Haxe.g:519:14: IDENTIFIER COLON expr
            {
            root_0 = (Object)adaptor.nil();

            IDENTIFIER436=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_objLitElem5411); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER436_tree = (Object)adaptor.create(IDENTIFIER436);
            adaptor.addChild(root_0, IDENTIFIER436_tree);
            }
            COLON437=(Token)match(input,COLON,FOLLOW_COLON_in_objLitElem5413); if (state.failed) return retval;
            pushFollow(FOLLOW_expr_in_objLitElem5416);
            expr438=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr438.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // Haxe.g:522:1: elementarySymbol : ( LONGLITERAL -> LONGLITERAL[$LONGLITERAL, \"INT\"] | NULL -> ^( NULL[$NULL,\"Unknown<0>\"] ) | INTLITERAL -> INTLITERAL[$INTLITERAL, \"INT\"] | STRINGLITERAL -> STRINGLITERAL[$STRINGLITERAL,\"STRING\"] | CHARLITERAL -> CHARLITERAL[$CHARLITERAL, \"STRING\"] | FLOATNUM -> FLOATNUM[$FLOATNUM, \"FLOAT\"] | TRUE -> TRUE[$TRUE,\"BOOL\"] | FALSE -> FALSE[$FALSE,\"BOOL\"] );
    public final HaxeParser.elementarySymbol_return elementarySymbol() throws RecognitionException {
        HaxeParser.elementarySymbol_return retval = new HaxeParser.elementarySymbol_return();
        retval.start = input.LT(1);
        int elementarySymbol_StartIndex = input.index();
        Object root_0 = null;

        Token LONGLITERAL439=null;
        Token NULL440=null;
        Token INTLITERAL441=null;
        Token STRINGLITERAL442=null;
        Token CHARLITERAL443=null;
        Token FLOATNUM444=null;
        Token TRUE445=null;
        Token FALSE446=null;

        Object LONGLITERAL439_tree=null;
        Object NULL440_tree=null;
        Object INTLITERAL441_tree=null;
        Object STRINGLITERAL442_tree=null;
        Object CHARLITERAL443_tree=null;
        Object FLOATNUM444_tree=null;
        Object TRUE445_tree=null;
        Object FALSE446_tree=null;
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
            // Haxe.g:523:5: ( LONGLITERAL -> LONGLITERAL[$LONGLITERAL, \"INT\"] | NULL -> ^( NULL[$NULL,\"Unknown<0>\"] ) | INTLITERAL -> INTLITERAL[$INTLITERAL, \"INT\"] | STRINGLITERAL -> STRINGLITERAL[$STRINGLITERAL,\"STRING\"] | CHARLITERAL -> CHARLITERAL[$CHARLITERAL, \"STRING\"] | FLOATNUM -> FLOATNUM[$FLOATNUM, \"FLOAT\"] | TRUE -> TRUE[$TRUE,\"BOOL\"] | FALSE -> FALSE[$FALSE,\"BOOL\"] )
            int alt87=8;
            switch ( input.LA(1) ) {
            case LONGLITERAL:
                {
                alt87=1;
                }
                break;
            case NULL:
                {
                alt87=2;
                }
                break;
            case INTLITERAL:
                {
                alt87=3;
                }
                break;
            case STRINGLITERAL:
                {
                alt87=4;
                }
                break;
            case CHARLITERAL:
                {
                alt87=5;
                }
                break;
            case FLOATNUM:
                {
                alt87=6;
                }
                break;
            case TRUE:
                {
                alt87=7;
                }
                break;
            case FALSE:
                {
                alt87=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 87, 0, input);

                throw nvae;
            }

            switch (alt87) {
                case 1 :
                    // Haxe.g:523:10: LONGLITERAL
                    {
                    LONGLITERAL439=(Token)match(input,LONGLITERAL,FOLLOW_LONGLITERAL_in_elementarySymbol5440); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LONGLITERAL.add(LONGLITERAL439);



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
                    // 523:25: -> LONGLITERAL[$LONGLITERAL, \"INT\"]
                    {
                        adaptor.addChild(root_0, new Constant(LONGLITERAL, LONGLITERAL439, "INT"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // Haxe.g:524:9: NULL
                    {
                    NULL440=(Token)match(input,NULL,FOLLOW_NULL_in_elementarySymbol5461); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NULL.add(NULL440);



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
                    // 524:14: -> ^( NULL[$NULL,\"Unknown<0>\"] )
                    {
                        // Haxe.g:524:17: ^( NULL[$NULL,\"Unknown<0>\"] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new Constant(NULL, NULL440, "Unknown<0>"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // Haxe.g:525:10: INTLITERAL
                    {
                    INTLITERAL441=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_elementarySymbol5482); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INTLITERAL.add(INTLITERAL441);



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
                    // 525:24: -> INTLITERAL[$INTLITERAL, \"INT\"]
                    {
                        adaptor.addChild(root_0, new Constant(INTLITERAL, INTLITERAL441, "INT"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // Haxe.g:526:10: STRINGLITERAL
                    {
                    STRINGLITERAL442=(Token)match(input,STRINGLITERAL,FOLLOW_STRINGLITERAL_in_elementarySymbol5504); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STRINGLITERAL.add(STRINGLITERAL442);



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
                    // 526:27: -> STRINGLITERAL[$STRINGLITERAL,\"STRING\"]
                    {
                        adaptor.addChild(root_0, new Constant(STRINGLITERAL, STRINGLITERAL442, "STRING"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // Haxe.g:527:10: CHARLITERAL
                    {
                    CHARLITERAL443=(Token)match(input,CHARLITERAL,FOLLOW_CHARLITERAL_in_elementarySymbol5526); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CHARLITERAL.add(CHARLITERAL443);



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
                    // 527:25: -> CHARLITERAL[$CHARLITERAL, \"STRING\"]
                    {
                        adaptor.addChild(root_0, new Constant(CHARLITERAL, CHARLITERAL443, "STRING"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    // Haxe.g:528:10: FLOATNUM
                    {
                    FLOATNUM444=(Token)match(input,FLOATNUM,FOLLOW_FLOATNUM_in_elementarySymbol5548); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FLOATNUM.add(FLOATNUM444);



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
                    // 528:22: -> FLOATNUM[$FLOATNUM, \"FLOAT\"]
                    {
                        adaptor.addChild(root_0, new Constant(FLOATNUM, FLOATNUM444, "FLOAT"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 7 :
                    // Haxe.g:529:10: TRUE
                    {
                    TRUE445=(Token)match(input,TRUE,FOLLOW_TRUE_in_elementarySymbol5570); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TRUE.add(TRUE445);



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
                    // 529:22: -> TRUE[$TRUE,\"BOOL\"]
                    {
                        adaptor.addChild(root_0, new Constant(TRUE, TRUE445, "BOOL"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 8 :
                    // Haxe.g:530:10: FALSE
                    {
                    FALSE446=(Token)match(input,FALSE,FOLLOW_FALSE_in_elementarySymbol5596); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FALSE.add(FALSE446);



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
                    // 530:23: -> FALSE[$FALSE,\"BOOL\"]
                    {
                        adaptor.addChild(root_0, new Constant(FALSE, FALSE446, "BOOL"));

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
        // Haxe.g:146:43: ( typeTagOpt )
        // Haxe.g:146:43: typeTagOpt
        {
        pushFollow(FOLLOW_typeTagOpt_in_synpred28_Haxe936);
        typeTagOpt();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred28_Haxe

    // $ANTLR start synpred34_Haxe
    public final void synpred34_Haxe_fragment() throws RecognitionException {   
        // Haxe.g:189:14: ( ( type ) ( MINUS_BIGGER type )* )
        // Haxe.g:189:14: ( type ) ( MINUS_BIGGER type )*
        {
        // Haxe.g:189:14: ( type )
        // Haxe.g:189:15: type
        {
        pushFollow(FOLLOW_type_in_synpred34_Haxe1135);
        type();

        state._fsp--;
        if (state.failed) return ;

        }

        // Haxe.g:189:21: ( MINUS_BIGGER type )*
        loop90:
        do {
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==MINUS_BIGGER) ) {
                alt90=1;
            }


            switch (alt90) {
        	case 1 :
        	    // Haxe.g:189:22: MINUS_BIGGER type
        	    {
        	    match(input,MINUS_BIGGER,FOLLOW_MINUS_BIGGER_in_synpred34_Haxe1139); if (state.failed) return ;
        	    pushFollow(FOLLOW_type_in_synpred34_Haxe1142);
        	    type();

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
    // $ANTLR end synpred34_Haxe

    // $ANTLR start synpred41_Haxe
    public final void synpred41_Haxe_fragment() throws RecognitionException {   
        // Haxe.g:197:54: ( typeParam )
        // Haxe.g:197:54: typeParam
        {
        pushFollow(FOLLOW_typeParam_in_synpred41_Haxe1228);
        typeParam();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred41_Haxe

    // $ANTLR start synpred42_Haxe
    public final void synpred42_Haxe_fragment() throws RecognitionException {   
        // Haxe.g:197:14: ( ( anonType | dotIdent | primitiveType ) ( typeParam )* )
        // Haxe.g:197:14: ( anonType | dotIdent | primitiveType ) ( typeParam )*
        {
        // Haxe.g:197:14: ( anonType | dotIdent | primitiveType )
        int alt91=3;
        switch ( input.LA(1) ) {
        case LBRACE:
            {
            alt91=1;
            }
            break;
        case IDENTIFIER:
        case THIS:
            {
            alt91=2;
            }
            break;
        case DYNAMIC:
        case VOID:
        case INT:
        case FLOAT:
        case BOOLEAN:
            {
            alt91=3;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 91, 0, input);

            throw nvae;
        }

        switch (alt91) {
            case 1 :
                // Haxe.g:197:15: anonType
                {
                pushFollow(FOLLOW_anonType_in_synpred42_Haxe1215);
                anonType();

                state._fsp--;
                if (state.failed) return ;

                }
                break;
            case 2 :
                // Haxe.g:197:26: dotIdent
                {
                pushFollow(FOLLOW_dotIdent_in_synpred42_Haxe1219);
                dotIdent();

                state._fsp--;
                if (state.failed) return ;

                }
                break;
            case 3 :
                // Haxe.g:197:37: primitiveType
                {
                pushFollow(FOLLOW_primitiveType_in_synpred42_Haxe1223);
                primitiveType();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }

        // Haxe.g:197:53: ( typeParam )*
        loop92:
        do {
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==LT) ) {
                alt92=1;
            }


            switch (alt92) {
        	case 1 :
        	    // Haxe.g:197:54: typeParam
        	    {
        	    pushFollow(FOLLOW_typeParam_in_synpred42_Haxe1228);
        	    typeParam();

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
    // $ANTLR end synpred42_Haxe

    // $ANTLR start synpred43_Haxe
    public final void synpred43_Haxe_fragment() throws RecognitionException {   
        // Haxe.g:202:10: ( LT typeList GT )
        // Haxe.g:202:10: LT typeList GT
        {
        match(input,LT,FOLLOW_LT_in_synpred43_Haxe1264); if (state.failed) return ;
        pushFollow(FOLLOW_typeList_in_synpred43_Haxe1267);
        typeList();

        state._fsp--;
        if (state.failed) return ;
        match(input,GT,FOLLOW_GT_in_synpred43_Haxe1269); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred43_Haxe

    // $ANTLR start synpred44_Haxe
    public final void synpred44_Haxe_fragment() throws RecognitionException {   
        // Haxe.g:203:10: ( LT typeList LT typeList GTGT )
        // Haxe.g:203:10: LT typeList LT typeList GTGT
        {
        match(input,LT,FOLLOW_LT_in_synpred44_Haxe1281); if (state.failed) return ;
        pushFollow(FOLLOW_typeList_in_synpred44_Haxe1284);
        typeList();

        state._fsp--;
        if (state.failed) return ;
        match(input,LT,FOLLOW_LT_in_synpred44_Haxe1286); if (state.failed) return ;
        pushFollow(FOLLOW_typeList_in_synpred44_Haxe1289);
        typeList();

        state._fsp--;
        if (state.failed) return ;
        match(input,GTGT,FOLLOW_GTGT_in_synpred44_Haxe1291); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred44_Haxe

    // $ANTLR start synpred45_Haxe
    public final void synpred45_Haxe_fragment() throws RecognitionException {   
        // Haxe.g:209:10: ( typeParam )
        // Haxe.g:209:10: typeParam
        {
        pushFollow(FOLLOW_typeParam_in_synpred45_Haxe1350);
        typeParam();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred45_Haxe

    // $ANTLR start synpred47_Haxe
    public final void synpred47_Haxe_fragment() throws RecognitionException {   
        // Haxe.g:223:10: ( block )
        // Haxe.g:223:10: block
        {
        pushFollow(FOLLOW_block_in_synpred47_Haxe1507);
        block();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred47_Haxe

    // $ANTLR start synpred48_Haxe
    public final void synpred48_Haxe_fragment() throws RecognitionException {   
        // Haxe.g:224:10: ( assignExpr SEMI )
        // Haxe.g:224:10: assignExpr SEMI
        {
        pushFollow(FOLLOW_assignExpr_in_synpred48_Haxe1518);
        assignExpr();

        state._fsp--;
        if (state.failed) return ;
        match(input,SEMI,FOLLOW_SEMI_in_synpred48_Haxe1520); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred48_Haxe

    // $ANTLR start synpred50_Haxe
    public final void synpred50_Haxe_fragment() throws RecognitionException {   
        HaxeParser.statement_return st2 = null;


        // Haxe.g:226:42: ( ELSE st2= statement )
        // Haxe.g:226:42: ELSE st2= statement
        {
        match(input,ELSE,FOLLOW_ELSE_in_synpred50_Haxe1552); if (state.failed) return ;
        pushFollow(FOLLOW_statement_in_synpred50_Haxe1556);
        st2=statement();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred50_Haxe

    // $ANTLR start synpred65_Haxe
    public final void synpred65_Haxe_fragment() throws RecognitionException {   
        // Haxe.g:236:10: ( expr SEMI )
        // Haxe.g:236:10: expr SEMI
        {
        pushFollow(FOLLOW_expr_in_synpred65_Haxe2014);
        expr();

        state._fsp--;
        if (state.failed) return ;
        match(input,SEMI,FOLLOW_SEMI_in_synpred65_Haxe2017); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred65_Haxe

    // $ANTLR start synpred66_Haxe
    public final void synpred66_Haxe_fragment() throws RecognitionException {   
        // Haxe.g:237:10: ( IDENTIFIER COLON statement )
        // Haxe.g:237:10: IDENTIFIER COLON statement
        {
        match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_synpred66_Haxe2029); if (state.failed) return ;
        match(input,COLON,FOLLOW_COLON_in_synpred66_Haxe2031); if (state.failed) return ;
        pushFollow(FOLLOW_statement_in_synpred66_Haxe2033);
        statement();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred66_Haxe

    // $ANTLR start synpred69_Haxe
    public final void synpred69_Haxe_fragment() throws RecognitionException {   
        // Haxe.g:250:10: ( varDecl )
        // Haxe.g:250:10: varDecl
        {
        pushFollow(FOLLOW_varDecl_in_synpred69_Haxe2185);
        varDecl();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred69_Haxe

    // $ANTLR start synpred70_Haxe
    public final void synpred70_Haxe_fragment() throws RecognitionException {   
        // Haxe.g:251:10: ( classDecl )
        // Haxe.g:251:10: classDecl
        {
        pushFollow(FOLLOW_classDecl_in_synpred70_Haxe2196);
        classDecl();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred70_Haxe

    // $ANTLR start synpred106_Haxe
    public final void synpred106_Haxe_fragment() throws RecognitionException {   
        // Haxe.g:338:10: ( value methodCallOrSliceList )
        // Haxe.g:338:10: value methodCallOrSliceList
        {
        pushFollow(FOLLOW_value_in_synpred106_Haxe3048);
        value();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_methodCallOrSliceList_in_synpred106_Haxe3050);
        methodCallOrSliceList();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred106_Haxe

    // $ANTLR start synpred107_Haxe
    public final void synpred107_Haxe_fragment() throws RecognitionException {   
        // Haxe.g:339:10: ( value PLUSPLUS )
        // Haxe.g:339:10: value PLUSPLUS
        {
        pushFollow(FOLLOW_value_in_synpred107_Haxe3077);
        value();

        state._fsp--;
        if (state.failed) return ;
        match(input,PLUSPLUS,FOLLOW_PLUSPLUS_in_synpred107_Haxe3079); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred107_Haxe

    // $ANTLR start synpred108_Haxe
    public final void synpred108_Haxe_fragment() throws RecognitionException {   
        // Haxe.g:340:10: ( value SUBSUB )
        // Haxe.g:340:10: value SUBSUB
        {
        pushFollow(FOLLOW_value_in_synpred108_Haxe3118);
        value();

        state._fsp--;
        if (state.failed) return ;
        match(input,SUBSUB,FOLLOW_SUBSUB_in_synpred108_Haxe3120); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred108_Haxe

    // $ANTLR start synpred110_Haxe
    public final void synpred110_Haxe_fragment() throws RecognitionException {   
        // Haxe.g:350:10: ( methodCallOrSlice methodCallOrSliceList )
        // Haxe.g:350:10: methodCallOrSlice methodCallOrSliceList
        {
        pushFollow(FOLLOW_methodCallOrSlice_in_synpred110_Haxe3245);
        methodCallOrSlice();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_methodCallOrSliceList_in_synpred110_Haxe3247);
        methodCallOrSliceList();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred110_Haxe

    // $ANTLR start synpred115_Haxe
    public final void synpred115_Haxe_fragment() throws RecognitionException {   
        // Haxe.g:359:18: ( expr )
        // Haxe.g:359:18: expr
        {
        pushFollow(FOLLOW_expr_in_synpred115_Haxe3322);
        expr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred115_Haxe

    // $ANTLR start synpred118_Haxe
    public final void synpred118_Haxe_fragment() throws RecognitionException {   
        // Haxe.g:367:13: ( CAST LPAREN expr ( COMMA funcType )? RPAREN )
        // Haxe.g:367:13: CAST LPAREN expr ( COMMA funcType )? RPAREN
        {
        match(input,CAST,FOLLOW_CAST_in_synpred118_Haxe3418); if (state.failed) return ;
        match(input,LPAREN,FOLLOW_LPAREN_in_synpred118_Haxe3420); if (state.failed) return ;
        pushFollow(FOLLOW_expr_in_synpred118_Haxe3422);
        expr();

        state._fsp--;
        if (state.failed) return ;
        // Haxe.g:367:30: ( COMMA funcType )?
        int alt100=2;
        int LA100_0 = input.LA(1);

        if ( (LA100_0==COMMA) ) {
            alt100=1;
        }
        switch (alt100) {
            case 1 :
                // Haxe.g:367:31: COMMA funcType
                {
                match(input,COMMA,FOLLOW_COMMA_in_synpred118_Haxe3425); if (state.failed) return ;
                pushFollow(FOLLOW_funcType_in_synpred118_Haxe3427);
                funcType();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }

        match(input,RPAREN,FOLLOW_RPAREN_in_synpred118_Haxe3431); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred118_Haxe

    // $ANTLR start synpred119_Haxe
    public final void synpred119_Haxe_fragment() throws RecognitionException {   
        // Haxe.g:375:9: ( classDecl )
        // Haxe.g:375:9: classDecl
        {
        pushFollow(FOLLOW_classDecl_in_synpred119_Haxe3530);
        classDecl();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred119_Haxe

    // $ANTLR start synpred120_Haxe
    public final void synpred120_Haxe_fragment() throws RecognitionException {   
        // Haxe.g:376:9: ( interfaceDecl )
        // Haxe.g:376:9: interfaceDecl
        {
        pushFollow(FOLLOW_interfaceDecl_in_synpred120_Haxe3540);
        interfaceDecl();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred120_Haxe

    // $ANTLR start synpred121_Haxe
    public final void synpred121_Haxe_fragment() throws RecognitionException {   
        // Haxe.g:377:9: ( enumDecl )
        // Haxe.g:377:9: enumDecl
        {
        pushFollow(FOLLOW_enumDecl_in_synpred121_Haxe3550);
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
    protected DFA59 dfa59 = new DFA59(this);
    protected DFA62 dfa62 = new DFA62(this);
    protected DFA75 dfa75 = new DFA75(this);
    protected DFA76 dfa76 = new DFA76(this);
    protected DFA78 dfa78 = new DFA78(this);
    protected DFA79 dfa79 = new DFA79(this);
    static final String DFA26_eotS =
        "\32\uffff";
    static final String DFA26_eofS =
        "\1\4\31\uffff";
    static final String DFA26_minS =
        "\1\21\1\0\30\uffff";
    static final String DFA26_maxS =
        "\1\145\1\0\30\uffff";
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
            return "197:1: type : ( ( anonType | dotIdent | primitiveType ) ( typeParam )* | );";
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
        "\1\21\2\uffff\1\0\25\uffff";
    static final String DFA25_maxS =
        "\1\145\2\uffff\1\0\25\uffff";
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
            return "()* loopback of 197:53: ( typeParam )*";
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
        "\1\21\1\0\46\uffff";
    static final String DFA28_maxS =
        "\1\144\1\0\46\uffff";
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
            return "208:1: typeParamOpt : ( typeParam -> ^( TYPE_PARAM_OPT[\"TYPE_PARAM_OPT\",true] ( typeParam )? ) | );";
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
        "\55\uffff";
    static final String DFA35_eofS =
        "\55\uffff";
    static final String DFA35_minS =
        "\1\21\26\0\21\uffff\1\0\4\uffff";
    static final String DFA35_maxS =
        "\1\154\26\0\21\uffff\1\0\4\uffff";
    static final String DFA35_acceptS =
        "\27\uffff\1\3\5\uffff\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
        "\1\15\1\16\1\uffff\1\1\1\2\1\20\1\17";
    static final String DFA35_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"+
        "\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\21\uffff\1\26\4"+
        "\uffff}>";
    static final String[] DFA35_transitionS = {
            "\1\2\1\uffff\1\25\1\uffff\1\26\2\uffff\1\27\3\uffff\5\27\2"+
            "\uffff\1\50\6\uffff\1\13\1\14\12\uffff\1\11\1\35\1\uffff\1\36"+
            "\1\uffff\1\37\1\40\1\41\1\42\1\1\1\uffff\1\43\1\44\1\45\1\46"+
            "\3\uffff\1\47\13\uffff\1\5\1\3\3\uffff\1\4\1\6\1\7\1\10\1\12"+
            "\1\uffff\1\27\1\16\5\uffff\1\15\1\17\1\20\1\21\1\22\1\23\1\24",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
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
            return "222:1: statement : ( block | assignExpr SEMI | varDecl | IF parExpression st1= statement ( ELSE st2= statement )? -> ^( IF parExpression $st1 ( ^( ELSE $st2) )? ) | FOR LPAREN exp1= expr IN exp2= expr RPAREN statement -> ^( FOR ^( IN $exp1 $exp2) ( statement )? ) | WHILE parExpression statement -> ^( WHILE ( parExpression )? ( statement )? ) | DO statement WHILE parExpression SEMI -> ^( DO ( parExpression )? ( statement )? ) | TRY block catchStmtList -> ^( TRY ( block )? ( catchStmtList )? ) | SWITCH LPAREN expr RPAREN LBRACE ( caseStmt )+ RBRACE -> ^( SWITCH ( expr )? ( caseStmt )+ ) | RETURN ( expr )? SEMI -> ^( RETURN ( expr )? ) | THROW expr SEMI -> ^( THROW ( expr )? ) | BREAK ( IDENTIFIER )? SEMI -> ^( BREAK ( IDENTIFIER )? ) | CONTINUE ( IDENTIFIER )? SEMI -> ^( CONTINUE ( IDENTIFIER )? ) | expr SEMI | IDENTIFIER COLON statement -> ^( COLON ( IDENTIFIER )? ( statement )? ) | SEMI );";
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
                        if ( (synpred47_Haxe()) ) {s = 41;}

                        else if ( (synpred48_Haxe()) ) {s = 42;}

                        else if ( (synpred65_Haxe()) ) {s = 39;}

                         
                        input.seek(index35_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA35_2 = input.LA(1);

                         
                        int index35_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred47_Haxe()) ) {s = 41;}

                        else if ( (true) ) {s = 43;}

                         
                        input.seek(index35_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA35_3 = input.LA(1);

                         
                        int index35_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_Haxe()) ) {s = 42;}

                        else if ( (synpred65_Haxe()) ) {s = 39;}

                         
                        input.seek(index35_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA35_4 = input.LA(1);

                         
                        int index35_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_Haxe()) ) {s = 42;}

                        else if ( (synpred65_Haxe()) ) {s = 39;}

                         
                        input.seek(index35_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA35_5 = input.LA(1);

                         
                        int index35_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_Haxe()) ) {s = 42;}

                        else if ( (synpred65_Haxe()) ) {s = 39;}

                         
                        input.seek(index35_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA35_6 = input.LA(1);

                         
                        int index35_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_Haxe()) ) {s = 42;}

                        else if ( (synpred65_Haxe()) ) {s = 39;}

                         
                        input.seek(index35_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA35_7 = input.LA(1);

                         
                        int index35_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_Haxe()) ) {s = 42;}

                        else if ( (synpred65_Haxe()) ) {s = 39;}

                         
                        input.seek(index35_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA35_8 = input.LA(1);

                         
                        int index35_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_Haxe()) ) {s = 42;}

                        else if ( (synpred65_Haxe()) ) {s = 39;}

                         
                        input.seek(index35_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA35_9 = input.LA(1);

                         
                        int index35_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_Haxe()) ) {s = 42;}

                        else if ( (synpred65_Haxe()) ) {s = 39;}

                         
                        input.seek(index35_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA35_10 = input.LA(1);

                         
                        int index35_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_Haxe()) ) {s = 42;}

                        else if ( (synpred65_Haxe()) ) {s = 39;}

                         
                        input.seek(index35_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA35_11 = input.LA(1);

                         
                        int index35_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_Haxe()) ) {s = 42;}

                        else if ( (synpred65_Haxe()) ) {s = 39;}

                         
                        input.seek(index35_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA35_12 = input.LA(1);

                         
                        int index35_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_Haxe()) ) {s = 42;}

                        else if ( (synpred65_Haxe()) ) {s = 39;}

                         
                        input.seek(index35_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA35_13 = input.LA(1);

                         
                        int index35_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_Haxe()) ) {s = 42;}

                        else if ( (synpred65_Haxe()) ) {s = 39;}

                         
                        input.seek(index35_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA35_14 = input.LA(1);

                         
                        int index35_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_Haxe()) ) {s = 42;}

                        else if ( (synpred65_Haxe()) ) {s = 39;}

                         
                        input.seek(index35_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA35_15 = input.LA(1);

                         
                        int index35_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_Haxe()) ) {s = 42;}

                        else if ( (synpred65_Haxe()) ) {s = 39;}

                         
                        input.seek(index35_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA35_16 = input.LA(1);

                         
                        int index35_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_Haxe()) ) {s = 42;}

                        else if ( (synpred65_Haxe()) ) {s = 39;}

                         
                        input.seek(index35_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA35_17 = input.LA(1);

                         
                        int index35_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_Haxe()) ) {s = 42;}

                        else if ( (synpred65_Haxe()) ) {s = 39;}

                         
                        input.seek(index35_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA35_18 = input.LA(1);

                         
                        int index35_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_Haxe()) ) {s = 42;}

                        else if ( (synpred65_Haxe()) ) {s = 39;}

                         
                        input.seek(index35_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA35_19 = input.LA(1);

                         
                        int index35_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_Haxe()) ) {s = 42;}

                        else if ( (synpred65_Haxe()) ) {s = 39;}

                         
                        input.seek(index35_19);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA35_20 = input.LA(1);

                         
                        int index35_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_Haxe()) ) {s = 42;}

                        else if ( (synpred65_Haxe()) ) {s = 39;}

                         
                        input.seek(index35_20);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA35_21 = input.LA(1);

                         
                        int index35_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_Haxe()) ) {s = 42;}

                        else if ( (synpred65_Haxe()) ) {s = 39;}

                         
                        input.seek(index35_21);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA35_22 = input.LA(1);

                         
                        int index35_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_Haxe()) ) {s = 42;}

                        else if ( (synpred65_Haxe()) ) {s = 39;}

                        else if ( (synpred66_Haxe()) ) {s = 44;}

                         
                        input.seek(index35_22);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA35_40 = input.LA(1);

                         
                        int index35_40 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_Haxe()) ) {s = 42;}

                        else if ( (synpred65_Haxe()) ) {s = 39;}

                         
                        input.seek(index35_40);
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
        "\56\uffff";
    static final String DFA38_eofS =
        "\56\uffff";
    static final String DFA38_minS =
        "\1\21\6\0\1\uffff\1\0\45\uffff";
    static final String DFA38_maxS =
        "\1\154\6\0\1\uffff\1\0\45\uffff";
    static final String DFA38_acceptS =
        "\7\uffff\1\2\3\uffff\1\3\41\uffff\1\1";
    static final String DFA38_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\uffff\1\6\45\uffff}>";
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
            return "249:1: blockStmt : ( varDecl | classDecl | statement );";
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
                        if ( (synpred69_Haxe()) ) {s = 45;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index38_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA38_2 = input.LA(1);

                         
                        int index38_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred69_Haxe()) ) {s = 45;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index38_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA38_3 = input.LA(1);

                         
                        int index38_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred69_Haxe()) ) {s = 45;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index38_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA38_4 = input.LA(1);

                         
                        int index38_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred69_Haxe()) ) {s = 45;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index38_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA38_5 = input.LA(1);

                         
                        int index38_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred69_Haxe()) ) {s = 45;}

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
                        if ( (synpred69_Haxe()) ) {s = 45;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index38_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA38_8 = input.LA(1);

                         
                        int index38_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred69_Haxe()) ) {s = 45;}

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
        "\22\uffff";
    static final String DFA59_eofS =
        "\22\uffff";
    static final String DFA59_minS =
        "\1\23\15\0\4\uffff";
    static final String DFA59_maxS =
        "\1\154\15\0\4\uffff";
    static final String DFA59_acceptS =
        "\16\uffff\1\1\1\2\1\3\1\4";
    static final String DFA59_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"+
        "\14\4\uffff}>";
    static final String[] DFA59_transitionS = {
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
            return "337:1: suffixExpr : ( value methodCallOrSliceList -> ^( SUFFIX_EXPR[\"CallOrSlice\",true] ( value )? ( methodCallOrSliceList )? ) | value PLUSPLUS -> ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] ( value )? ( PLUSPLUS )? ) | value SUBSUB -> ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] ( value )? SUBSUB ) | value typeParamOpt );";
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
                        if ( (synpred106_Haxe()) ) {s = 14;}

                        else if ( (synpred107_Haxe()) ) {s = 15;}

                        else if ( (synpred108_Haxe()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index59_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA59_2 = input.LA(1);

                         
                        int index59_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred106_Haxe()) ) {s = 14;}

                        else if ( (synpred107_Haxe()) ) {s = 15;}

                        else if ( (synpred108_Haxe()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index59_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA59_3 = input.LA(1);

                         
                        int index59_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred106_Haxe()) ) {s = 14;}

                        else if ( (synpred107_Haxe()) ) {s = 15;}

                        else if ( (synpred108_Haxe()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index59_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA59_4 = input.LA(1);

                         
                        int index59_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred106_Haxe()) ) {s = 14;}

                        else if ( (synpred107_Haxe()) ) {s = 15;}

                        else if ( (synpred108_Haxe()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index59_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA59_5 = input.LA(1);

                         
                        int index59_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred106_Haxe()) ) {s = 14;}

                        else if ( (synpred107_Haxe()) ) {s = 15;}

                        else if ( (synpred108_Haxe()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index59_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA59_6 = input.LA(1);

                         
                        int index59_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred106_Haxe()) ) {s = 14;}

                        else if ( (synpred107_Haxe()) ) {s = 15;}

                        else if ( (synpred108_Haxe()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index59_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA59_7 = input.LA(1);

                         
                        int index59_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred106_Haxe()) ) {s = 14;}

                        else if ( (synpred107_Haxe()) ) {s = 15;}

                        else if ( (synpred108_Haxe()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index59_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA59_8 = input.LA(1);

                         
                        int index59_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred106_Haxe()) ) {s = 14;}

                        else if ( (synpred107_Haxe()) ) {s = 15;}

                        else if ( (synpred108_Haxe()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index59_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA59_9 = input.LA(1);

                         
                        int index59_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred106_Haxe()) ) {s = 14;}

                        else if ( (synpred107_Haxe()) ) {s = 15;}

                        else if ( (synpred108_Haxe()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index59_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA59_10 = input.LA(1);

                         
                        int index59_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred106_Haxe()) ) {s = 14;}

                        else if ( (synpred107_Haxe()) ) {s = 15;}

                        else if ( (synpred108_Haxe()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index59_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA59_11 = input.LA(1);

                         
                        int index59_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred106_Haxe()) ) {s = 14;}

                        else if ( (synpred107_Haxe()) ) {s = 15;}

                        else if ( (synpred108_Haxe()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index59_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA59_12 = input.LA(1);

                         
                        int index59_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred106_Haxe()) ) {s = 14;}

                        else if ( (synpred107_Haxe()) ) {s = 15;}

                        else if ( (synpred108_Haxe()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index59_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA59_13 = input.LA(1);

                         
                        int index59_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred106_Haxe()) ) {s = 14;}

                        else if ( (synpred107_Haxe()) ) {s = 15;}

                        else if ( (synpred108_Haxe()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
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
    static final String DFA62_eotS =
        "\52\uffff";
    static final String DFA62_eofS =
        "\52\uffff";
    static final String DFA62_minS =
        "\1\21\26\0\21\uffff\1\0\1\uffff";
    static final String DFA62_maxS =
        "\1\154\26\0\21\uffff\1\0\1\uffff";
    static final String DFA62_acceptS =
        "\27\uffff\1\2\21\uffff\1\1";
    static final String DFA62_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"+
        "\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\21\uffff\1\26\1"+
        "\uffff}>";
    static final String[] DFA62_transitionS = {
            "\1\27\1\uffff\1\24\1\uffff\1\25\2\uffff\1\27\3\uffff\5\27\2"+
            "\uffff\1\50\6\uffff\1\11\1\12\12\uffff\1\7\1\27\1\uffff\1\27"+
            "\1\uffff\4\27\1\13\1\uffff\4\27\3\uffff\1\26\13\uffff\1\3\1"+
            "\1\3\uffff\1\2\1\4\1\5\1\6\1\10\1\uffff\1\27\1\15\5\uffff\1"+
            "\14\1\16\1\17\1\20\1\21\1\22\1\23",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
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
            return "359:17: ( expr | statement )";
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
                        if ( (synpred115_Haxe()) ) {s = 41;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index62_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA62_2 = input.LA(1);

                         
                        int index62_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred115_Haxe()) ) {s = 41;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index62_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA62_3 = input.LA(1);

                         
                        int index62_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred115_Haxe()) ) {s = 41;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index62_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA62_4 = input.LA(1);

                         
                        int index62_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred115_Haxe()) ) {s = 41;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index62_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA62_5 = input.LA(1);

                         
                        int index62_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred115_Haxe()) ) {s = 41;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index62_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA62_6 = input.LA(1);

                         
                        int index62_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred115_Haxe()) ) {s = 41;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index62_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA62_7 = input.LA(1);

                         
                        int index62_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred115_Haxe()) ) {s = 41;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index62_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA62_8 = input.LA(1);

                         
                        int index62_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred115_Haxe()) ) {s = 41;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index62_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA62_9 = input.LA(1);

                         
                        int index62_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred115_Haxe()) ) {s = 41;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index62_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA62_10 = input.LA(1);

                         
                        int index62_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred115_Haxe()) ) {s = 41;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index62_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA62_11 = input.LA(1);

                         
                        int index62_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred115_Haxe()) ) {s = 41;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index62_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA62_12 = input.LA(1);

                         
                        int index62_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred115_Haxe()) ) {s = 41;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index62_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA62_13 = input.LA(1);

                         
                        int index62_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred115_Haxe()) ) {s = 41;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index62_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA62_14 = input.LA(1);

                         
                        int index62_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred115_Haxe()) ) {s = 41;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index62_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA62_15 = input.LA(1);

                         
                        int index62_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred115_Haxe()) ) {s = 41;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index62_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA62_16 = input.LA(1);

                         
                        int index62_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred115_Haxe()) ) {s = 41;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index62_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA62_17 = input.LA(1);

                         
                        int index62_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred115_Haxe()) ) {s = 41;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index62_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA62_18 = input.LA(1);

                         
                        int index62_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred115_Haxe()) ) {s = 41;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index62_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA62_19 = input.LA(1);

                         
                        int index62_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred115_Haxe()) ) {s = 41;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index62_19);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA62_20 = input.LA(1);

                         
                        int index62_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred115_Haxe()) ) {s = 41;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index62_20);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA62_21 = input.LA(1);

                         
                        int index62_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred115_Haxe()) ) {s = 41;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index62_21);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA62_22 = input.LA(1);

                         
                        int index62_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred115_Haxe()) ) {s = 41;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index62_22);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA62_40 = input.LA(1);

                         
                        int index62_40 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred115_Haxe()) ) {s = 41;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index62_40);
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
    static final String DFA75_eotS =
        "\11\uffff";
    static final String DFA75_eofS =
        "\11\uffff";
    static final String DFA75_minS =
        "\6\30\1\25\2\uffff";
    static final String DFA75_maxS =
        "\6\52\1\66\2\uffff";
    static final String DFA75_acceptS =
        "\7\uffff\1\1\1\2";
    static final String DFA75_specialS =
        "\11\uffff}>";
    static final String[] DFA75_transitionS = {
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
            return "427:1: funcDecl : ( ( declAttrList )? FUNCTION NEW LPAREN paramList RPAREN typeTagOpt block -> ^( FUNCTION NEW ( declAttrList )? ( paramList )? ( typeTagOpt )? ( block )? ) | ( declAttrList )? FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt block -> ^( FUNCTION IDENTIFIER ( declAttrList )? ( paramList )? ( typeTagOpt )? ( block )? ( typeParamOpt )? ) );";
        }
    }
    static final String DFA76_eotS =
        "\14\uffff";
    static final String DFA76_eofS =
        "\14\uffff";
    static final String DFA76_minS =
        "\6\30\2\25\4\uffff";
    static final String DFA76_maxS =
        "\6\52\2\66\4\uffff";
    static final String DFA76_acceptS =
        "\10\uffff\1\3\1\4\1\1\1\2";
    static final String DFA76_specialS =
        "\14\uffff}>";
    static final String[] DFA76_transitionS = {
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
            return "433:1: funcProtoDecl : ( declAttrList FUNCTION NEW LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTagOpt )? ( declAttrList )? ) | declAttrList FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTagOpt )? ( declAttrList )? ( typeParamOpt )? ) | FUNCTION NEW LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTagOpt )? ) | FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTagOpt )? ( typeParamOpt )? ) );";
        }
    }
    static final String DFA78_eotS =
        "\12\uffff";
    static final String DFA78_eofS =
        "\12\uffff";
    static final String DFA78_minS =
        "\1\22\4\30\1\27\3\uffff\1\30";
    static final String DFA78_maxS =
        "\6\137\3\uffff\1\137";
    static final String DFA78_acceptS =
        "\6\uffff\1\1\1\2\1\3\1\uffff";
    static final String DFA78_specialS =
        "\12\uffff}>";
    static final String[] DFA78_transitionS = {
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
            return "453:1: classMember : ( varDecl | funcDecl | enumDecl );";
        }
    }
    static final String DFA79_eotS =
        "\11\uffff";
    static final String DFA79_eofS =
        "\1\10\10\uffff";
    static final String DFA79_minS =
        "\6\30\3\uffff";
    static final String DFA79_maxS =
        "\6\137\3\uffff";
    static final String DFA79_acceptS =
        "\6\uffff\1\1\1\2\1\3";
    static final String DFA79_specialS =
        "\11\uffff}>";
    static final String[] DFA79_transitionS = {
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

    static final short[] DFA79_eot = DFA.unpackEncodedString(DFA79_eotS);
    static final short[] DFA79_eof = DFA.unpackEncodedString(DFA79_eofS);
    static final char[] DFA79_min = DFA.unpackEncodedStringToUnsignedChars(DFA79_minS);
    static final char[] DFA79_max = DFA.unpackEncodedStringToUnsignedChars(DFA79_maxS);
    static final short[] DFA79_accept = DFA.unpackEncodedString(DFA79_acceptS);
    static final short[] DFA79_special = DFA.unpackEncodedString(DFA79_specialS);
    static final short[][] DFA79_transition;

    static {
        int numStates = DFA79_transitionS.length;
        DFA79_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA79_transition[i] = DFA.unpackEncodedString(DFA79_transitionS[i]);
        }
    }

    class DFA79 extends DFA {

        public DFA79(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 79;
            this.eot = DFA79_eot;
            this.eof = DFA79_eof;
            this.min = DFA79_min;
            this.max = DFA79_max;
            this.accept = DFA79_accept;
            this.special = DFA79_special;
            this.transition = DFA79_transition;
        }
        public String getDescription() {
            return "464:1: interfaceBody : ( varDecl interfaceBody | funcProtoDecl interfaceBody | );";
        }
    }
 

    public static final BitSet FOLLOW_myPackage_in_module165 = new BitSet(new long[]{0x000000000D840000L,0x0000002640000000L});
    public static final BitSet FOLLOW_topLevelList_in_module168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_topLevel_in_topLevelList206 = new BitSet(new long[]{0x000000000D840002L,0x0000002640000000L});
    public static final BitSet FOLLOW_myImport_in_topLevel225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_topLevelDecl_in_topLevel234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PACKAGE_in_myPackage251 = new BitSet(new long[]{0x0000000800200000L});
    public static final BitSet FOLLOW_dotIdent_in_myPackage253 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_SEMI_in_myPackage255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MONKEYS_AT_in_meta280 = new BitSet(new long[]{0x0003C00080600000L});
    public static final BitSet FOLLOW_metaName_in_meta282 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_LPAREN_in_meta285 = new BitSet(new long[]{0x0000000400300000L});
    public static final BitSet FOLLOW_paramList_in_meta287 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_RPAREN_in_meta289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_metaName308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveType_in_metaName316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_in_metaName325 = new BitSet(new long[]{0x0003C00080600000L});
    public static final BitSet FOLLOW_metaName_in_metaName327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_meta_in_typeDeclFlags345 = new BitSet(new long[]{0x0000000001840002L});
    public static final BitSet FOLLOW_set_in_typeDeclFlags349 = new BitSet(new long[]{0x0000000001800002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_qualifiedIdentifier383 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_DOT_in_qualifiedIdentifier396 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_qualifiedIdentifier400 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_IMPORT_in_myImport438 = new BitSet(new long[]{0x0000000800200000L});
    public static final BitSet FOLLOW_dotIdent_in_myImport441 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_SEMI_in_myImport443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_USING_in_myImport452 = new BitSet(new long[]{0x0000000800200000L});
    public static final BitSet FOLLOW_dotIdent_in_myImport455 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_SEMI_in_myImport457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_access0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STATIC_in_declAttr521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INLINE_in_declAttr529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DYNAMIC_in_declAttr537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OVERRIDE_in_declAttr545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_access_in_declAttr553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttr_in_declAttrList571 = new BitSet(new long[]{0x00000001F1000002L});
    public static final BitSet FOLLOW_param_in_paramList603 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_COMMA_in_paramList606 = new BitSet(new long[]{0x0000000400200000L});
    public static final BitSet FOLLOW_param_in_paramList608 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_QUES_in_param650 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_param653 = new BitSet(new long[]{0x0000001000400000L});
    public static final BitSet FOLLOW_typeTagOpt_in_param655 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_varInit_in_param657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_id0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_dotIdent736 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_DOT_in_dotIdent744 = new BitSet(new long[]{0x0000000800200000L});
    public static final BitSet FOLLOW_id_in_dotIdent748 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_EQ_in_assignOp785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUSEQ_in_assignOp811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUBEQ_in_assignOp834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SLASHEQ_in_assignOp856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PERCENTEQ_in_assignOp878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AMPEQ_in_assignOp900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_in_funcLit928 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_LPAREN_in_funcLit930 = new BitSet(new long[]{0x0000000400300000L});
    public static final BitSet FOLLOW_paramList_in_funcLit932 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_RPAREN_in_funcLit934 = new BitSet(new long[]{0x8000000000420000L});
    public static final BitSet FOLLOW_typeTagOpt_in_funcLit936 = new BitSet(new long[]{0x8000000000420000L});
    public static final BitSet FOLLOW_block_in_funcLit939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACKET_in_arrayLit977 = new BitSet(new long[]{0x80401C0800280000L,0x00001FC13E300100L});
    public static final BitSet FOLLOW_exprListOpt_in_arrayLit980 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_RBRACKET_in_arrayLit982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_in_typeTag1016 = new BitSet(new long[]{0x8003E00880200000L});
    public static final BitSet FOLLOW_funcType_in_typeTag1019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeTag_in_typeTagOpt1043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_typeList1086 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_COMMA_in_typeList1089 = new BitSet(new long[]{0x8003C00A80200000L});
    public static final BitSet FOLLOW_type_in_typeList1092 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_typeConstraint_in_typeList1109 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_COMMA_in_typeList1112 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_typeConstraint_in_typeList1115 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_type_in_funcType1135 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_MINUS_BIGGER_in_funcType1139 = new BitSet(new long[]{0x8003E00880200000L});
    public static final BitSet FOLLOW_type_in_funcType1142 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_VOID_in_funcType1155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_primitiveType0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_anonType_in_type1215 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_dotIdent_in_type1219 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_primitiveType_in_type1223 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_typeParam_in_type1228 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_LT_in_typeParam1264 = new BitSet(new long[]{0x8003C00A80200000L});
    public static final BitSet FOLLOW_typeList_in_typeParam1267 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_GT_in_typeParam1269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_in_typeParam1281 = new BitSet(new long[]{0x8003C00A80200000L});
    public static final BitSet FOLLOW_typeList_in_typeParam1284 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_LT_in_typeParam1286 = new BitSet(new long[]{0x8003C00A80200000L});
    public static final BitSet FOLLOW_typeList_in_typeParam1289 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_GTGT_in_typeParam1291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_in_typeParam1303 = new BitSet(new long[]{0x8003C00A80200000L});
    public static final BitSet FOLLOW_typeList_in_typeParam1306 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_LT_in_typeParam1308 = new BitSet(new long[]{0x8003C00A80200000L});
    public static final BitSet FOLLOW_typeList_in_typeParam1311 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_LT_in_typeParam1313 = new BitSet(new long[]{0x8003C00A80200000L});
    public static final BitSet FOLLOW_typeList_in_typeParam1316 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_GTGTGT_in_typeParam1318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeParam_in_typeParamOpt1350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_typeConstraint1397 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_COLON_in_typeConstraint1399 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_LPAREN_in_typeConstraint1401 = new BitSet(new long[]{0x8003C00A80200000L});
    public static final BitSet FOLLOW_typeList_in_typeConstraint1403 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_RPAREN_in_typeConstraint1405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttrList_in_functionReturn1443 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_FUNCTION_in_functionReturn1446 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_NEW_in_functionReturn1448 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_LPAREN_in_functionReturn1450 = new BitSet(new long[]{0x0000000400300000L});
    public static final BitSet FOLLOW_paramList_in_functionReturn1452 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_RPAREN_in_functionReturn1454 = new BitSet(new long[]{0x8000000000420000L});
    public static final BitSet FOLLOW_typeTagOpt_in_functionReturn1456 = new BitSet(new long[]{0x8000000000420000L});
    public static final BitSet FOLLOW_block_in_functionReturn1458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_statement1507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignExpr_in_statement1518 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_SEMI_in_statement1520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDecl_in_statement1532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_statement1543 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_parExpression_in_statement1545 = new BitSet(new long[]{0xFAC00C09F16A0000L,0x00001FC1BE30011EL});
    public static final BitSet FOLLOW_statement_in_statement1549 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_ELSE_in_statement1552 = new BitSet(new long[]{0xFAC00C09F16A0000L,0x00001FC1BE30011EL});
    public static final BitSet FOLLOW_statement_in_statement1556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_statement1605 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_LPAREN_in_statement1607 = new BitSet(new long[]{0x80400C0800280000L,0x00001FC13E300100L});
    public static final BitSet FOLLOW_expr_in_statement1611 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_IN_in_statement1613 = new BitSet(new long[]{0x80400C0800280000L,0x00001FC13E300100L});
    public static final BitSet FOLLOW_expr_in_statement1617 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_RPAREN_in_statement1619 = new BitSet(new long[]{0xFAC00C09F16A0000L,0x00001FC1BE30011EL});
    public static final BitSet FOLLOW_statement_in_statement1621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_statement1658 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_parExpression_in_statement1660 = new BitSet(new long[]{0xFAC00C09F16A0000L,0x00001FC1BE30011EL});
    public static final BitSet FOLLOW_statement_in_statement1662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DO_in_statement1704 = new BitSet(new long[]{0xFAC00C09F16A0000L,0x00001FC1BE30011EL});
    public static final BitSet FOLLOW_statement_in_statement1706 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_WHILE_in_statement1708 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_parExpression_in_statement1710 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_SEMI_in_statement1712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRY_in_statement1750 = new BitSet(new long[]{0x8000000000420000L});
    public static final BitSet FOLLOW_block_in_statement1752 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_catchStmtList_in_statement1754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SWITCH_in_statement1796 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_LPAREN_in_statement1798 = new BitSet(new long[]{0x80400C0800280000L,0x00001FC13E300100L});
    public static final BitSet FOLLOW_expr_in_statement1800 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_RPAREN_in_statement1802 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_LBRACE_in_statement1804 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000060L});
    public static final BitSet FOLLOW_caseStmt_in_statement1806 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000061L});
    public static final BitSet FOLLOW_RBRACE_in_statement1809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_statement1839 = new BitSet(new long[]{0x80400C08002A0000L,0x00001FC13E300100L});
    public static final BitSet FOLLOW_expr_in_statement1842 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_SEMI_in_statement1846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THROW_in_statement1885 = new BitSet(new long[]{0x80400C0800280000L,0x00001FC13E300100L});
    public static final BitSet FOLLOW_expr_in_statement1887 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_SEMI_in_statement1889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BREAK_in_statement1929 = new BitSet(new long[]{0x0000000000220000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_statement1932 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_SEMI_in_statement1936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONTINUE_in_statement1971 = new BitSet(new long[]{0x0000000000220000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_statement1974 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_SEMI_in_statement1978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_statement2014 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_SEMI_in_statement2017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_statement2029 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_COLON_in_statement2031 = new BitSet(new long[]{0xFAC00C09F16A0000L,0x00001FC1BE30011EL});
    public static final BitSet FOLLOW_statement_in_statement2033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMI_in_statement2072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_parExpression2096 = new BitSet(new long[]{0x80400C0800280000L,0x00001FC13E300100L});
    public static final BitSet FOLLOW_expr_in_parExpression2099 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_RPAREN_in_parExpression2101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_block2122 = new BitSet(new long[]{0xFAC00C09F1EE0000L,0x00001FC3BE30011FL});
    public static final BitSet FOLLOW_blockStmt_in_block2125 = new BitSet(new long[]{0xFAC00C09F1EE0000L,0x00001FC3BE30011FL});
    public static final BitSet FOLLOW_RBRACE_in_block2129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMI_in_block2160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDecl_in_blockStmt2185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classDecl_in_blockStmt2196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_blockStmt2207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BREAK_in_breakStmt2255 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_SEMI_in_breakStmt2257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONTINUE_in_continueStmt2288 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_SEMI_in_continueStmt2290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CASE_in_caseStmt2310 = new BitSet(new long[]{0x80400C0800280000L,0x00001FC13E300100L});
    public static final BitSet FOLLOW_exprList_in_caseStmt2312 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_COLON_in_caseStmt2314 = new BitSet(new long[]{0xFAC00C09F16A0000L,0x00001FC1BE30011EL});
    public static final BitSet FOLLOW_statement_in_caseStmt2316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_caseStmt2343 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_COLON_in_caseStmt2345 = new BitSet(new long[]{0xFAC00C09F16A0000L,0x00001FC1BE30011EL});
    public static final BitSet FOLLOW_statement_in_caseStmt2347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_defaultStmt2391 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_COLON_in_defaultStmt2393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_catchStmt_in_catchStmtList2415 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_catchStmtList_in_catchStmtList2417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CATCH_in_catchStmt2451 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_LPAREN_in_catchStmt2453 = new BitSet(new long[]{0x0000000400200000L});
    public static final BitSet FOLLOW_param_in_catchStmt2455 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_RPAREN_in_catchStmt2457 = new BitSet(new long[]{0x8000000000420000L});
    public static final BitSet FOLLOW_block_in_catchStmt2459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprList_in_exprListOpt2497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_exprList2522 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_COMMA_in_exprList2525 = new BitSet(new long[]{0x80400C0800280000L,0x00001FC13E300100L});
    public static final BitSet FOLLOW_expr_in_exprList2528 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_assignExpr_in_expr2553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNTYPED_in_expr2564 = new BitSet(new long[]{0x80400C0800280000L,0x00001FC13E300000L});
    public static final BitSet FOLLOW_assignExpr_in_expr2566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iterExpr_in_assignExpr2598 = new BitSet(new long[]{0x000003F000000002L});
    public static final BitSet FOLLOW_assignOp_in_assignExpr2601 = new BitSet(new long[]{0x80400C0800280000L,0x00001FC13E300000L});
    public static final BitSet FOLLOW_iterExpr_in_assignExpr2604 = new BitSet(new long[]{0x000003F000000002L});
    public static final BitSet FOLLOW_ternaryExpr_in_iterExpr2622 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_ELLIPSIS_in_iterExpr2625 = new BitSet(new long[]{0x80400C0800280000L,0x00001FC13E300000L});
    public static final BitSet FOLLOW_ternaryExpr_in_iterExpr2628 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_logicOrExpr_in_ternaryExpr2650 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_QUES_in_ternaryExpr2653 = new BitSet(new long[]{0x80400C0800280000L,0x00001FC13E300100L});
    public static final BitSet FOLLOW_expr_in_ternaryExpr2656 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_COLON_in_ternaryExpr2658 = new BitSet(new long[]{0x80400C0800280000L,0x00001FC13E300000L});
    public static final BitSet FOLLOW_logicOrExpr_in_ternaryExpr2661 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_logicAndExpr_in_logicOrExpr2683 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_BARBAR_in_logicOrExpr2686 = new BitSet(new long[]{0x80400C0800280000L,0x00001FC13E300000L});
    public static final BitSet FOLLOW_logicAndExpr_in_logicOrExpr2689 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_cmpExpr_in_logicAndExpr2716 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_AMPAMP_in_logicAndExpr2720 = new BitSet(new long[]{0x80400C0800280000L,0x00001FC13E300000L});
    public static final BitSet FOLLOW_cmpExpr_in_logicAndExpr2723 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_bitExpr_in_cmpExpr2746 = new BitSet(new long[]{0x000C000000000002L,0x000000000000F000L});
    public static final BitSet FOLLOW_EQEQ_in_cmpExpr2751 = new BitSet(new long[]{0x80400C0800280000L,0x00001FC13E300000L});
    public static final BitSet FOLLOW_BANGEQ_in_cmpExpr2755 = new BitSet(new long[]{0x80400C0800280000L,0x00001FC13E300000L});
    public static final BitSet FOLLOW_GTEQ_in_cmpExpr2760 = new BitSet(new long[]{0x80400C0800280000L,0x00001FC13E300000L});
    public static final BitSet FOLLOW_LTEQ_in_cmpExpr2765 = new BitSet(new long[]{0x80400C0800280000L,0x00001FC13E300000L});
    public static final BitSet FOLLOW_GT_in_cmpExpr2770 = new BitSet(new long[]{0x80400C0800280000L,0x00001FC13E300000L});
    public static final BitSet FOLLOW_LT_in_cmpExpr2775 = new BitSet(new long[]{0x80400C0800280000L,0x00001FC13E300000L});
    public static final BitSet FOLLOW_bitExpr_in_cmpExpr2780 = new BitSet(new long[]{0x000C000000000002L,0x000000000000F000L});
    public static final BitSet FOLLOW_shiftExpr_in_bitExpr2803 = new BitSet(new long[]{0x0000000000000002L,0x0000000000070000L});
    public static final BitSet FOLLOW_BAR_in_bitExpr2807 = new BitSet(new long[]{0x80400C0800280000L,0x00001FC13E300000L});
    public static final BitSet FOLLOW_shiftExpr_in_bitExpr2810 = new BitSet(new long[]{0x0000000000000002L,0x0000000000070000L});
    public static final BitSet FOLLOW_AMP_in_bitExpr2814 = new BitSet(new long[]{0x80400C0800280000L,0x00001FC13E300000L});
    public static final BitSet FOLLOW_shiftExpr_in_bitExpr2817 = new BitSet(new long[]{0x0000000000000002L,0x0000000000070000L});
    public static final BitSet FOLLOW_CARET_in_bitExpr2820 = new BitSet(new long[]{0x80400C0800280000L,0x00001FC13E300000L});
    public static final BitSet FOLLOW_shiftExpr_in_bitExpr2823 = new BitSet(new long[]{0x0000000000000002L,0x0000000000070000L});
    public static final BitSet FOLLOW_addExpr_in_shiftExpr2846 = new BitSet(new long[]{0x0028000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_LTLT_in_shiftExpr2850 = new BitSet(new long[]{0x80400C0800280000L,0x00001FC13E300000L});
    public static final BitSet FOLLOW_addExpr_in_shiftExpr2854 = new BitSet(new long[]{0x0028000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_GT_in_shiftExpr2859 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_GT_in_shiftExpr2861 = new BitSet(new long[]{0x80400C0800280000L,0x00001FC13E300000L});
    public static final BitSet FOLLOW_addExpr_in_shiftExpr2866 = new BitSet(new long[]{0x0028000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_GTGTGT_in_shiftExpr2870 = new BitSet(new long[]{0x80400C0800280000L,0x00001FC13E300000L});
    public static final BitSet FOLLOW_addExpr_in_shiftExpr2873 = new BitSet(new long[]{0x0028000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_multExpr_in_addExpr2893 = new BitSet(new long[]{0x0000000000000002L,0x0000000000300000L});
    public static final BitSet FOLLOW_PLUS_in_addExpr2898 = new BitSet(new long[]{0x80400C0800280000L,0x00001FC13E300000L});
    public static final BitSet FOLLOW_SUB_in_addExpr2903 = new BitSet(new long[]{0x80400C0800280000L,0x00001FC13E300000L});
    public static final BitSet FOLLOW_multExpr_in_addExpr2907 = new BitSet(new long[]{0x0000000000000002L,0x0000000000300000L});
    public static final BitSet FOLLOW_prefixExpr_in_multExpr2930 = new BitSet(new long[]{0x0000000000000002L,0x0000000001C00000L});
    public static final BitSet FOLLOW_STAR_in_multExpr2935 = new BitSet(new long[]{0x80400C0800280000L,0x00001FC13E300000L});
    public static final BitSet FOLLOW_SLASH_in_multExpr2938 = new BitSet(new long[]{0x80400C0800280000L,0x00001FC13E300000L});
    public static final BitSet FOLLOW_PERCENT_in_multExpr2941 = new BitSet(new long[]{0x80400C0800280000L,0x00001FC13E300000L});
    public static final BitSet FOLLOW_prefixExpr_in_multExpr2945 = new BitSet(new long[]{0x0000000000000002L,0x0000000001C00000L});
    public static final BitSet FOLLOW_SUB_in_prefixExpr2972 = new BitSet(new long[]{0x80400C0800280000L,0x00001FC13E300000L});
    public static final BitSet FOLLOW_SUBSUB_in_prefixExpr2975 = new BitSet(new long[]{0x80400C0800280000L,0x00001FC13E300000L});
    public static final BitSet FOLLOW_PLUS_in_prefixExpr2978 = new BitSet(new long[]{0x80400C0800280000L,0x00001FC13E300000L});
    public static final BitSet FOLLOW_PLUSPLUS_in_prefixExpr2981 = new BitSet(new long[]{0x80400C0800280000L,0x00001FC13E300000L});
    public static final BitSet FOLLOW_BANG_in_prefixExpr2984 = new BitSet(new long[]{0x80400C0800280000L,0x00001FC13E300000L});
    public static final BitSet FOLLOW_TILDE_in_prefixExpr2987 = new BitSet(new long[]{0x80400C0800280000L,0x00001FC13E300000L});
    public static final BitSet FOLLOW_prefixExpr_in_prefixExpr2991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_newExpr_in_prefixExpr3002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cast_in_prefixExpr3013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_suffixExpr_in_prefixExpr3024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_suffixExpr3048 = new BitSet(new long[]{0x0000080000080000L});
    public static final BitSet FOLLOW_methodCallOrSliceList_in_suffixExpr3050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_suffixExpr3077 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_PLUSPLUS_in_suffixExpr3079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_suffixExpr3118 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_SUBSUB_in_suffixExpr3120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_suffixExpr3158 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_typeParamOpt_in_suffixExpr3160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_methodCallOrSlice3180 = new BitSet(new long[]{0x80400C0800380000L,0x00001FC13E300100L});
    public static final BitSet FOLLOW_exprListOpt_in_methodCallOrSlice3182 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_RPAREN_in_methodCallOrSlice3184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACKET_in_methodCallOrSlice3208 = new BitSet(new long[]{0x80400C0800280000L,0x00001FC13E300100L});
    public static final BitSet FOLLOW_expr_in_methodCallOrSlice3210 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_RBRACKET_in_methodCallOrSlice3212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_methodCallOrSlice_in_methodCallOrSliceList3245 = new BitSet(new long[]{0x0000080000080000L});
    public static final BitSet FOLLOW_methodCallOrSliceList_in_methodCallOrSliceList3247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_methodCallOrSlice_in_methodCallOrSliceList3258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcLit_in_value3277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayLit_in_value3288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objLit_in_value3298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_elementarySymbol_in_value3308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_value3318 = new BitSet(new long[]{0xFAC00C09F16A0000L,0x00001FC1BE30011EL});
    public static final BitSet FOLLOW_expr_in_value3322 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_statement_in_value3324 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_RPAREN_in_value3327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dotIdent_in_value3338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEW_in_newExpr3380 = new BitSet(new long[]{0x8003C00880280000L});
    public static final BitSet FOLLOW_type_in_newExpr3382 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_LPAREN_in_newExpr3384 = new BitSet(new long[]{0x80400C0800380000L,0x00001FC13E300100L});
    public static final BitSet FOLLOW_exprListOpt_in_newExpr3386 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_RPAREN_in_newExpr3388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CAST_in_cast3418 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_LPAREN_in_cast3420 = new BitSet(new long[]{0x80400C0800280000L,0x00001FC13E300100L});
    public static final BitSet FOLLOW_expr_in_cast3422 = new BitSet(new long[]{0x0000000200100000L});
    public static final BitSet FOLLOW_COMMA_in_cast3425 = new BitSet(new long[]{0x8003E00880200000L});
    public static final BitSet FOLLOW_funcType_in_cast3427 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_RPAREN_in_cast3431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CAST_in_cast3459 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_LPAREN_in_cast3461 = new BitSet(new long[]{0x80400C0800280000L,0x00001FC13E300100L});
    public static final BitSet FOLLOW_expr_in_cast3463 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_RPAREN_in_cast3465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classDecl_in_topLevelDecl3530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interfaceDecl_in_topLevelDecl3540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumDecl_in_topLevelDecl3550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typedefDecl_in_topLevelDecl3560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeDeclFlags_in_enumDecl3578 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_ENUM_in_enumDecl3580 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_enumDecl3582 = new BitSet(new long[]{0x8004000000000000L});
    public static final BitSet FOLLOW_typeParamOpt_in_enumDecl3584 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_LBRACE_in_enumDecl3586 = new BitSet(new long[]{0x0000000000200000L,0x0000000000000001L});
    public static final BitSet FOLLOW_enumBody_in_enumDecl3588 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RBRACE_in_enumDecl3590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumValueDecl_in_enumBody3624 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_enumValueDecl3662 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_LPAREN_in_enumValueDecl3664 = new BitSet(new long[]{0x0000000400300000L});
    public static final BitSet FOLLOW_paramList_in_enumValueDecl3666 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_RPAREN_in_enumValueDecl3668 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_SEMI_in_enumValueDecl3670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_enumValueDecl3704 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_SEMI_in_enumValueDecl3706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDecl_in_varDeclList3777 = new BitSet(new long[]{0x00000001F1000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_varDeclList_in_varDeclList3779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttrList_in_varDecl3799 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_VAR_in_varDecl3803 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_varDeclPartList_in_varDecl3805 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_SEMI_in_varDecl3807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDeclPart_in_varDeclPartList3853 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_COMMA_in_varDeclPartList3856 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_varDeclPart_in_varDeclPartList3859 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_varDeclPart3884 = new BitSet(new long[]{0x0000001000480000L});
    public static final BitSet FOLLOW_propDeclOpt_in_varDeclPart3889 = new BitSet(new long[]{0x0000001000400000L});
    public static final BitSet FOLLOW_typeTagOpt_in_varDeclPart3891 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_varInit_in_varDeclPart3893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_propDecl3911 = new BitSet(new long[]{0x0000000080200000L,0x0000000100000040L});
    public static final BitSet FOLLOW_propAccessor_in_propDecl3915 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_COMMA_in_propDecl3917 = new BitSet(new long[]{0x0000000080200000L,0x0000000100000040L});
    public static final BitSet FOLLOW_propAccessor_in_propDecl3921 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_RPAREN_in_propDecl3923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_propAccessor0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_propDecl_in_propDeclOpt4079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQ_in_varInit4124 = new BitSet(new long[]{0x80400C0800280000L,0x00001FC13E300100L});
    public static final BitSet FOLLOW_expr_in_varInit4126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttrList_in_funcDecl4174 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_FUNCTION_in_funcDecl4177 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_NEW_in_funcDecl4179 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_LPAREN_in_funcDecl4181 = new BitSet(new long[]{0x0000000400300000L});
    public static final BitSet FOLLOW_paramList_in_funcDecl4183 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_RPAREN_in_funcDecl4185 = new BitSet(new long[]{0x8000000000420000L});
    public static final BitSet FOLLOW_typeTagOpt_in_funcDecl4187 = new BitSet(new long[]{0x8000000000420000L});
    public static final BitSet FOLLOW_block_in_funcDecl4189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttrList_in_funcDecl4244 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_FUNCTION_in_funcDecl4247 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_funcDecl4249 = new BitSet(new long[]{0x0004000000080000L});
    public static final BitSet FOLLOW_typeParamOpt_in_funcDecl4251 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_LPAREN_in_funcDecl4253 = new BitSet(new long[]{0x0000000400300000L});
    public static final BitSet FOLLOW_paramList_in_funcDecl4255 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_RPAREN_in_funcDecl4257 = new BitSet(new long[]{0x8000000000420000L});
    public static final BitSet FOLLOW_typeTagOpt_in_funcDecl4259 = new BitSet(new long[]{0x8000000000420000L});
    public static final BitSet FOLLOW_block_in_funcDecl4261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttrList_in_funcProtoDecl4331 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_FUNCTION_in_funcProtoDecl4333 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_NEW_in_funcProtoDecl4335 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_LPAREN_in_funcProtoDecl4337 = new BitSet(new long[]{0x0000000400300000L});
    public static final BitSet FOLLOW_paramList_in_funcProtoDecl4339 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_RPAREN_in_funcProtoDecl4341 = new BitSet(new long[]{0x0000000000420000L});
    public static final BitSet FOLLOW_typeTagOpt_in_funcProtoDecl4343 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_SEMI_in_funcProtoDecl4345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttrList_in_funcProtoDecl4386 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_FUNCTION_in_funcProtoDecl4388 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_funcProtoDecl4390 = new BitSet(new long[]{0x0004000000080000L});
    public static final BitSet FOLLOW_typeParamOpt_in_funcProtoDecl4392 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_LPAREN_in_funcProtoDecl4394 = new BitSet(new long[]{0x0000000400300000L});
    public static final BitSet FOLLOW_paramList_in_funcProtoDecl4396 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_RPAREN_in_funcProtoDecl4398 = new BitSet(new long[]{0x0000000000420000L});
    public static final BitSet FOLLOW_typeTagOpt_in_funcProtoDecl4400 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_SEMI_in_funcProtoDecl4402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_in_funcProtoDecl4446 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_NEW_in_funcProtoDecl4448 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_LPAREN_in_funcProtoDecl4450 = new BitSet(new long[]{0x0000000400300000L});
    public static final BitSet FOLLOW_paramList_in_funcProtoDecl4452 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_RPAREN_in_funcProtoDecl4454 = new BitSet(new long[]{0x0000000000420000L});
    public static final BitSet FOLLOW_typeTagOpt_in_funcProtoDecl4456 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_SEMI_in_funcProtoDecl4458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_in_funcProtoDecl4496 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_funcProtoDecl4498 = new BitSet(new long[]{0x0004000000080000L});
    public static final BitSet FOLLOW_typeParamOpt_in_funcProtoDecl4500 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_LPAREN_in_funcProtoDecl4502 = new BitSet(new long[]{0x0000000400300000L});
    public static final BitSet FOLLOW_paramList_in_funcProtoDecl4504 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_RPAREN_in_funcProtoDecl4506 = new BitSet(new long[]{0x0000000000420000L});
    public static final BitSet FOLLOW_typeTagOpt_in_funcProtoDecl4508 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_SEMI_in_funcProtoDecl4510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeDeclFlags_in_classDecl4564 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_CLASS_in_classDecl4566 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_classDecl4568 = new BitSet(new long[]{0x8004000000000000L,0x0000001800000000L});
    public static final BitSet FOLLOW_typeParamOpt_in_classDecl4570 = new BitSet(new long[]{0x8004000000000000L,0x0000001800000000L});
    public static final BitSet FOLLOW_inheritListOpt_in_classDecl4572 = new BitSet(new long[]{0x8004000000000000L,0x0000001800000000L});
    public static final BitSet FOLLOW_classBodyScope_in_classDecl4574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_classBodyScope4632 = new BitSet(new long[]{0x00000401F1840000L,0x00000000C0000001L});
    public static final BitSet FOLLOW_classMember_in_classBodyScope4635 = new BitSet(new long[]{0x00000401F1840000L,0x00000000C0000001L});
    public static final BitSet FOLLOW_RBRACE_in_classBodyScope4639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDecl_in_classMember4677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcDecl_in_classMember4688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumDecl_in_classMember4700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeDeclFlags_in_interfaceDecl4729 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_INTERFACE_in_interfaceDecl4731 = new BitSet(new long[]{0x8003C00880200000L,0x0000001800000000L});
    public static final BitSet FOLLOW_type_in_interfaceDecl4733 = new BitSet(new long[]{0x8000000000000000L,0x0000001800000000L});
    public static final BitSet FOLLOW_inheritListOpt_in_interfaceDecl4735 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_LBRACE_in_interfaceDecl4737 = new BitSet(new long[]{0x00000401F1000000L,0x0000000080000001L});
    public static final BitSet FOLLOW_interfaceBody_in_interfaceDecl4740 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RBRACE_in_interfaceDecl4742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDecl_in_interfaceBody4766 = new BitSet(new long[]{0x00000401F1000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_interfaceBody_in_interfaceBody4768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcProtoDecl_in_interfaceBody4778 = new BitSet(new long[]{0x00000401F1000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_interfaceBody_in_interfaceBody4780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inherit_in_inheritList4814 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_COMMA_in_inheritList4817 = new BitSet(new long[]{0x0000000000000000L,0x0000001800000000L});
    public static final BitSet FOLLOW_inherit_in_inheritList4820 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_inheritList_in_inheritListOpt4850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXTENDS_in_inherit4904 = new BitSet(new long[]{0x8003C00880200000L});
    public static final BitSet FOLLOW_type_in_inherit4906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IMPLEMENTS_in_inherit4934 = new BitSet(new long[]{0x8003C00880200000L});
    public static final BitSet FOLLOW_type_in_inherit4936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPEDEF_in_typedefDecl4976 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_typedefDecl4978 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_EQ_in_typedefDecl4980 = new BitSet(new long[]{0x8003E00880200000L});
    public static final BitSet FOLLOW_funcType_in_typedefDecl4982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GT_in_typeExtend5010 = new BitSet(new long[]{0x8003E00880200000L});
    public static final BitSet FOLLOW_funcType_in_typeExtend5012 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_COMMA_in_typeExtend5014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_anonType5034 = new BitSet(new long[]{0x00080001F1200000L,0x0000000080000001L});
    public static final BitSet FOLLOW_anonTypeFieldList_in_anonType5081 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_varDeclList_in_anonType5112 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_typeExtend_in_anonType5144 = new BitSet(new long[]{0x00000001F1200000L,0x0000000080000001L});
    public static final BitSet FOLLOW_anonTypeFieldList_in_anonType5181 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_varDeclList_in_anonType5216 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RBRACE_in_anonType5263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_anonTypeField_in_anonTypeFieldList5289 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_COMMA_in_anonTypeFieldList5292 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_anonTypeField_in_anonTypeFieldList5295 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_LBRACE_in_objLit5316 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_objLitElemList_in_objLit5319 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RBRACE_in_objLit5321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_anonTypeField5342 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_COLON_in_anonTypeField5344 = new BitSet(new long[]{0x8003E00880200000L});
    public static final BitSet FOLLOW_funcType_in_anonTypeField5347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objLitElem_in_objLitElemList5375 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_COMMA_in_objLitElemList5378 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_objLitElem_in_objLitElemList5381 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_objLitElem5411 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_COLON_in_objLitElem5413 = new BitSet(new long[]{0x80400C0800280000L,0x00001FC13E300100L});
    public static final BitSet FOLLOW_expr_in_objLitElem5416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LONGLITERAL_in_elementarySymbol5440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_elementarySymbol5461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTLITERAL_in_elementarySymbol5482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRINGLITERAL_in_elementarySymbol5504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARLITERAL_in_elementarySymbol5526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOATNUM_in_elementarySymbol5548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_elementarySymbol5570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_elementarySymbol5596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeTagOpt_in_synpred28_Haxe936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_synpred34_Haxe1135 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_MINUS_BIGGER_in_synpred34_Haxe1139 = new BitSet(new long[]{0x8003E00880200000L});
    public static final BitSet FOLLOW_type_in_synpred34_Haxe1142 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_typeParam_in_synpred41_Haxe1228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_anonType_in_synpred42_Haxe1215 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_dotIdent_in_synpred42_Haxe1219 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_primitiveType_in_synpred42_Haxe1223 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_typeParam_in_synpred42_Haxe1228 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_LT_in_synpred43_Haxe1264 = new BitSet(new long[]{0x8003C00A80200000L});
    public static final BitSet FOLLOW_typeList_in_synpred43_Haxe1267 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_GT_in_synpred43_Haxe1269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_in_synpred44_Haxe1281 = new BitSet(new long[]{0x8003C00A80200000L});
    public static final BitSet FOLLOW_typeList_in_synpred44_Haxe1284 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_LT_in_synpred44_Haxe1286 = new BitSet(new long[]{0x8003C00A80200000L});
    public static final BitSet FOLLOW_typeList_in_synpred44_Haxe1289 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_GTGT_in_synpred44_Haxe1291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeParam_in_synpred45_Haxe1350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_synpred47_Haxe1507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignExpr_in_synpred48_Haxe1518 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_SEMI_in_synpred48_Haxe1520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_synpred50_Haxe1552 = new BitSet(new long[]{0xFAC00C09F16A0000L,0x00001FC1BE30011EL});
    public static final BitSet FOLLOW_statement_in_synpred50_Haxe1556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_synpred65_Haxe2014 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_SEMI_in_synpred65_Haxe2017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_synpred66_Haxe2029 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_COLON_in_synpred66_Haxe2031 = new BitSet(new long[]{0xFAC00C09F16A0000L,0x00001FC1BE30011EL});
    public static final BitSet FOLLOW_statement_in_synpred66_Haxe2033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDecl_in_synpred69_Haxe2185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classDecl_in_synpred70_Haxe2196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_synpred106_Haxe3048 = new BitSet(new long[]{0x0000080000080000L});
    public static final BitSet FOLLOW_methodCallOrSliceList_in_synpred106_Haxe3050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_synpred107_Haxe3077 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_PLUSPLUS_in_synpred107_Haxe3079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_synpred108_Haxe3118 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_SUBSUB_in_synpred108_Haxe3120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_methodCallOrSlice_in_synpred110_Haxe3245 = new BitSet(new long[]{0x0000080000080000L});
    public static final BitSet FOLLOW_methodCallOrSliceList_in_synpred110_Haxe3247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_synpred115_Haxe3322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CAST_in_synpred118_Haxe3418 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_LPAREN_in_synpred118_Haxe3420 = new BitSet(new long[]{0x80400C0800280000L,0x00001FC13E300100L});
    public static final BitSet FOLLOW_expr_in_synpred118_Haxe3422 = new BitSet(new long[]{0x0000000200100000L});
    public static final BitSet FOLLOW_COMMA_in_synpred118_Haxe3425 = new BitSet(new long[]{0x8003E00880200000L});
    public static final BitSet FOLLOW_funcType_in_synpred118_Haxe3427 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_RPAREN_in_synpred118_Haxe3431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classDecl_in_synpred119_Haxe3530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interfaceDecl_in_synpred120_Haxe3540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumDecl_in_synpred121_Haxe3550 = new BitSet(new long[]{0x0000000000000002L});

}