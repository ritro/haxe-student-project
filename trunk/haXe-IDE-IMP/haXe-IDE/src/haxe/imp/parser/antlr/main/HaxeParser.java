// $ANTLR 3.3 Nov 30, 2010 12:50:56 Haxe.g 2011-05-01 20:18:06

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
import haxe.imp.parser.antlr.tree.specific.ReturnNode;
import haxe.imp.parser.antlr.tree.specific.VarDeclarationNode;
import haxe.imp.parser.antlr.tree.specific.VarUsageNode;
import haxe.imp.parser.antlr.tree.specific.ConstantNode;
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
    // Haxe.g:64:1: module : ( myPackage )? topLevelList -> ^( MODULE[\"MODULE\",true] ( myPackage )? ( topLevelList )? ) ;
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
            // Haxe.g:65:5: ( ( myPackage )? topLevelList -> ^( MODULE[\"MODULE\",true] ( myPackage )? ( topLevelList )? ) )
            // Haxe.g:65:7: ( myPackage )? topLevelList
            {
            // Haxe.g:65:7: ( myPackage )?
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
            // 65:31: -> ^( MODULE[\"MODULE\",true] ( myPackage )? ( topLevelList )? )
            {
                // Haxe.g:65:34: ^( MODULE[\"MODULE\",true] ( myPackage )? ( topLevelList )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new HaxeTree(MODULE, "MODULE", true), root_1);

                // Haxe.g:65:68: ( myPackage )?
                if ( stream_myPackage.hasNext() ) {
                    adaptor.addChild(root_1, stream_myPackage.nextTree());

                }
                stream_myPackage.reset();
                // Haxe.g:65:79: ( topLevelList )?
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
    // Haxe.g:68:1: topLevelList : ( topLevel )* ;
    public final HaxeParser.topLevelList_return topLevelList() throws RecognitionException {
        HaxeParser.topLevelList_return retval = new HaxeParser.topLevelList_return();
        retval.start = input.LT(1);
        int topLevelList_StartIndex = input.index();
        Object root_0 = null;

        HaxeParser.topLevel_return topLevel3 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return retval; }
            // Haxe.g:69:5: ( ( topLevel )* )
            // Haxe.g:69:7: ( topLevel )*
            {
            root_0 = (Object)adaptor.nil();

            // Haxe.g:69:7: ( topLevel )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==MONKEYS_AT||(LA2_0>=EXTERN && LA2_0<=PRIVATE)||(LA2_0>=IMPORT && LA2_0<=USING)||LA2_0==ENUM||(LA2_0>=CLASS && LA2_0<=INTERFACE)||LA2_0==TYPEDEF) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // Haxe.g:69:8: topLevel
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
    // Haxe.g:72:1: topLevel : ( myImport | topLevelDecl );
    public final HaxeParser.topLevel_return topLevel() throws RecognitionException {
        HaxeParser.topLevel_return retval = new HaxeParser.topLevel_return();
        retval.start = input.LT(1);
        int topLevel_StartIndex = input.index();
        Object root_0 = null;

        HaxeParser.myImport_return myImport4 = null;

        HaxeParser.topLevelDecl_return topLevelDecl5 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return retval; }
            // Haxe.g:73:5: ( myImport | topLevelDecl )
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
                    // Haxe.g:73:7: myImport
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
                    // Haxe.g:75:7: topLevelDecl
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
    // Haxe.g:78:1: myPackage : PACKAGE dotIdent SEMI -> ^( PACKAGE ( dotIdent )? ) ;
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
            // Haxe.g:79:5: ( PACKAGE dotIdent SEMI -> ^( PACKAGE ( dotIdent )? ) )
            // Haxe.g:79:7: PACKAGE dotIdent SEMI
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
            // 79:29: -> ^( PACKAGE ( dotIdent )? )
            {
                // Haxe.g:79:32: ^( PACKAGE ( dotIdent )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_PACKAGE.nextNode(), root_1);

                // Haxe.g:79:42: ( dotIdent )?
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
    // Haxe.g:82:1: meta : MONKEYS_AT metaName ( LPAREN paramList RPAREN )? ;
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
            // Haxe.g:82:9: ( MONKEYS_AT metaName ( LPAREN paramList RPAREN )? )
            // Haxe.g:82:11: MONKEYS_AT metaName ( LPAREN paramList RPAREN )?
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
            // Haxe.g:82:31: ( LPAREN paramList RPAREN )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==LPAREN) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // Haxe.g:82:32: LPAREN paramList RPAREN
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
    // Haxe.g:85:1: metaName : ( IDENTIFIER | primitiveType | COLON metaName );
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
            // Haxe.g:86:5: ( IDENTIFIER | primitiveType | COLON metaName )
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
                    // Haxe.g:86:7: IDENTIFIER
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
                    // Haxe.g:87:7: primitiveType
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
                    // Haxe.g:89:7: COLON metaName
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
    // Haxe.g:92:1: typeDeclFlags : ( meta )* ( EXTERN | PRIVATE )* ;
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
            // Haxe.g:93:5: ( ( meta )* ( EXTERN | PRIVATE )* )
            // Haxe.g:93:7: ( meta )* ( EXTERN | PRIVATE )*
            {
            root_0 = (Object)adaptor.nil();

            // Haxe.g:93:7: ( meta )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==MONKEYS_AT) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // Haxe.g:93:8: meta
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

            // Haxe.g:93:15: ( EXTERN | PRIVATE )*
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
    // Haxe.g:96:1: qualifiedIdentifier : (a= IDENTIFIER -> $a) ( DOT ident= IDENTIFIER -> ^( DOT $qualifiedIdentifier $ident) )* ;
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
            // Haxe.g:97:5: ( (a= IDENTIFIER -> $a) ( DOT ident= IDENTIFIER -> ^( DOT $qualifiedIdentifier $ident) )* )
            // Haxe.g:97:7: (a= IDENTIFIER -> $a) ( DOT ident= IDENTIFIER -> ^( DOT $qualifiedIdentifier $ident) )*
            {
            // Haxe.g:97:7: (a= IDENTIFIER -> $a)
            // Haxe.g:97:8: a= IDENTIFIER
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
            // 97:22: -> $a
            {
                adaptor.addChild(root_0, stream_a.nextNode());

            }

            retval.tree = root_0;}
            }

            // Haxe.g:97:30: ( DOT ident= IDENTIFIER -> ^( DOT $qualifiedIdentifier $ident) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==DOT) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // Haxe.g:97:31: DOT ident= IDENTIFIER
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
            	    // 97:53: -> ^( DOT $qualifiedIdentifier $ident)
            	    {
            	        // Haxe.g:97:57: ^( DOT $qualifiedIdentifier $ident)
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
    // Haxe.g:100:1: myImport : ( IMPORT dotIdent SEMI | USING dotIdent SEMI );
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
            // Haxe.g:101:5: ( IMPORT dotIdent SEMI | USING dotIdent SEMI )
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
                    // Haxe.g:101:7: IMPORT dotIdent SEMI
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
                    // Haxe.g:102:7: USING dotIdent SEMI
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
    // Haxe.g:106:1: access : ( PUBLIC | PRIVATE );
    public final HaxeParser.access_return access() throws RecognitionException {
        HaxeParser.access_return retval = new HaxeParser.access_return();
        retval.start = input.LT(1);
        int access_StartIndex = input.index();
        Object root_0 = null;

        Token set27=null;

        Object set27_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return retval; }
            // Haxe.g:107:5: ( PUBLIC | PRIVATE )
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
    // Haxe.g:111:1: declAttr : ( STATIC | INLINE | DYNAMIC | OVERRIDE | access );
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
            // Haxe.g:112:5: ( STATIC | INLINE | DYNAMIC | OVERRIDE | access )
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
                    // Haxe.g:112:7: STATIC
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
                    // Haxe.g:113:7: INLINE
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
                    // Haxe.g:114:7: DYNAMIC
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
                    // Haxe.g:115:7: OVERRIDE
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
                    // Haxe.g:116:7: access
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
    // Haxe.g:119:1: declAttrList : ( declAttr )+ -> ^( DECL_ATTR_LIST[\"DECL_ATTR_LIST\", true] ( declAttr )+ ) ;
    public final HaxeParser.declAttrList_return declAttrList() throws RecognitionException {
        HaxeParser.declAttrList_return retval = new HaxeParser.declAttrList_return();
        retval.start = input.LT(1);
        int declAttrList_StartIndex = input.index();
        Object root_0 = null;

        HaxeParser.declAttr_return declAttr33 = null;


        RewriteRuleSubtreeStream stream_declAttr=new RewriteRuleSubtreeStream(adaptor,"rule declAttr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return retval; }
            // Haxe.g:120:5: ( ( declAttr )+ -> ^( DECL_ATTR_LIST[\"DECL_ATTR_LIST\", true] ( declAttr )+ ) )
            // Haxe.g:120:7: ( declAttr )+
            {
            // Haxe.g:120:7: ( declAttr )+
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
            	    // Haxe.g:120:8: declAttr
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
            // 120:19: -> ^( DECL_ATTR_LIST[\"DECL_ATTR_LIST\", true] ( declAttr )+ )
            {
                // Haxe.g:120:22: ^( DECL_ATTR_LIST[\"DECL_ATTR_LIST\", true] ( declAttr )+ )
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
    // Haxe.g:123:1: paramList : ( param ( COMMA param )* -> ^( PARAM_LIST[\"PARAM_LIST\", true] ( param )+ ) | );
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
            // Haxe.g:124:5: ( param ( COMMA param )* -> ^( PARAM_LIST[\"PARAM_LIST\", true] ( param )+ ) | )
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
                    // Haxe.g:124:7: param ( COMMA param )*
                    {
                    pushFollow(FOLLOW_param_in_paramList585);
                    param34=param();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_param.add(param34.getTree());
                    // Haxe.g:124:13: ( COMMA param )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==COMMA) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // Haxe.g:124:14: COMMA param
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
                    // 124:28: -> ^( PARAM_LIST[\"PARAM_LIST\", true] ( param )+ )
                    {
                        // Haxe.g:124:31: ^( PARAM_LIST[\"PARAM_LIST\", true] ( param )+ )
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
                    // Haxe.g:126:5: 
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
    // Haxe.g:128:1: param : ( QUES )? IDENTIFIER typeTagOpt varInit -> ^( VAR[$IDENTIFIER, true] ( IDENTIFIER )? ( typeTagOpt )? ( varInit )? ( QUES )? ) ;
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
            // Haxe.g:129:5: ( ( QUES )? IDENTIFIER typeTagOpt varInit -> ^( VAR[$IDENTIFIER, true] ( IDENTIFIER )? ( typeTagOpt )? ( varInit )? ( QUES )? ) )
            // Haxe.g:129:7: ( QUES )? IDENTIFIER typeTagOpt varInit
            {
            // Haxe.g:129:7: ( QUES )?
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
            // 129:43: -> ^( VAR[$IDENTIFIER, true] ( IDENTIFIER )? ( typeTagOpt )? ( varInit )? ( QUES )? )
            {
                // Haxe.g:129:46: ^( VAR[$IDENTIFIER, true] ( IDENTIFIER )? ( typeTagOpt )? ( varInit )? ( QUES )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new VarDeclarationNode(VAR, IDENTIFIER38, true), root_1);

                // Haxe.g:129:91: ( IDENTIFIER )?
                if ( stream_IDENTIFIER.hasNext() ) {
                    adaptor.addChild(root_1, new VarUsageNode(stream_IDENTIFIER.nextToken()));

                }
                stream_IDENTIFIER.reset();
                // Haxe.g:129:117: ( typeTagOpt )?
                if ( stream_typeTagOpt.hasNext() ) {
                    adaptor.addChild(root_1, stream_typeTagOpt.nextTree());

                }
                stream_typeTagOpt.reset();
                // Haxe.g:129:129: ( varInit )?
                if ( stream_varInit.hasNext() ) {
                    adaptor.addChild(root_1, stream_varInit.nextTree());

                }
                stream_varInit.reset();
                // Haxe.g:129:138: ( QUES )?
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
    // Haxe.g:132:1: id : ( IDENTIFIER -> ^( IDENTIFIER ) | THIS -> ^( THIS ) );
    public final HaxeParser.id_return id() throws RecognitionException {
        HaxeParser.id_return retval = new HaxeParser.id_return();
        retval.start = input.LT(1);
        int id_StartIndex = input.index();
        Object root_0 = null;

        Token IDENTIFIER41=null;
        Token THIS42=null;

        Object IDENTIFIER41_tree=null;
        Object THIS42_tree=null;
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_THIS=new RewriteRuleTokenStream(adaptor,"token THIS");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return retval; }
            // Haxe.g:132:5: ( IDENTIFIER -> ^( IDENTIFIER ) | THIS -> ^( THIS ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==IDENTIFIER) ) {
                alt15=1;
            }
            else if ( (LA15_0==THIS) ) {
                alt15=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // Haxe.g:132:10: IDENTIFIER
                    {
                    IDENTIFIER41=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_id681); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER41);



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
                    // 132:21: -> ^( IDENTIFIER )
                    {
                        // Haxe.g:132:24: ^( IDENTIFIER )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new VarUsageNode(stream_IDENTIFIER.nextToken()), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // Haxe.g:133:10: THIS
                    {
                    THIS42=(Token)match(input,THIS,FOLLOW_THIS_in_id701); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THIS.add(THIS42);



                    // AST REWRITE
                    // elements: THIS
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 133:15: -> ^( THIS )
                    {
                        // Haxe.g:133:18: ^( THIS )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new VarUsageNode(stream_THIS.nextToken()), root_1);

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
    // Haxe.g:136:1: dotIdent : ( id DOT a= dotIdent -> ^( DOT[true] id $a) | id -> id );
    public final HaxeParser.dotIdent_return dotIdent() throws RecognitionException {
        HaxeParser.dotIdent_return retval = new HaxeParser.dotIdent_return();
        retval.start = input.LT(1);
        int dotIdent_StartIndex = input.index();
        Object root_0 = null;

        Token DOT44=null;
        HaxeParser.dotIdent_return a = null;

        HaxeParser.id_return id43 = null;

        HaxeParser.id_return id45 = null;


        Object DOT44_tree=null;
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_dotIdent=new RewriteRuleSubtreeStream(adaptor,"rule dotIdent");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return retval; }
            // Haxe.g:137:5: ( id DOT a= dotIdent -> ^( DOT[true] id $a) | id -> id )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==IDENTIFIER) ) {
                int LA16_1 = input.LA(2);

                if ( (LA16_1==DOT) ) {
                    alt16=1;
                }
                else if ( (LA16_1==EOF||(LA16_1>=SEMI && LA16_1<=RPAREN)||(LA16_1>=COLON && LA16_1<=PRIVATE)||(LA16_1>=IMPORT && LA16_1<=USING)||(LA16_1>=COMMA && LA16_1<=QUES)||(LA16_1>=EQ && LA16_1<=AMPEQ)||(LA16_1>=LBRACKET && LA16_1<=MINUS_BIGGER)||(LA16_1>=LT && LA16_1<=GTGTGT)||LA16_1==IN||(LA16_1>=LBRACE && LA16_1<=RBRACE)||(LA16_1>=ELLIPSIS && LA16_1<=PLUSPLUS)||LA16_1==ENUM||(LA16_1>=CLASS && LA16_1<=TYPEDEF)) ) {
                    alt16=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA16_0==THIS) ) {
                int LA16_2 = input.LA(2);

                if ( (LA16_2==DOT) ) {
                    alt16=1;
                }
                else if ( (LA16_2==EOF||(LA16_2>=SEMI && LA16_2<=RPAREN)||(LA16_2>=COLON && LA16_2<=PRIVATE)||(LA16_2>=IMPORT && LA16_2<=USING)||(LA16_2>=COMMA && LA16_2<=QUES)||(LA16_2>=EQ && LA16_2<=AMPEQ)||(LA16_2>=LBRACKET && LA16_2<=MINUS_BIGGER)||(LA16_2>=LT && LA16_2<=GTGTGT)||LA16_2==IN||(LA16_2>=LBRACE && LA16_2<=RBRACE)||(LA16_2>=ELLIPSIS && LA16_2<=PLUSPLUS)||LA16_2==ENUM||(LA16_2>=CLASS && LA16_2<=TYPEDEF)) ) {
                    alt16=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // Haxe.g:137:10: id DOT a= dotIdent
                    {
                    pushFollow(FOLLOW_id_in_dotIdent730);
                    id43=id();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_id.add(id43.getTree());
                    DOT44=(Token)match(input,DOT,FOLLOW_DOT_in_dotIdent732); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DOT.add(DOT44);

                    pushFollow(FOLLOW_dotIdent_in_dotIdent736);
                    a=dotIdent();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_dotIdent.add(a.getTree());


                    // AST REWRITE
                    // elements: id, a, DOT
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
                    // 137:28: -> ^( DOT[true] id $a)
                    {
                        // Haxe.g:137:32: ^( DOT[true] id $a)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new VarUsageNode(DOT, true), root_1);

                        adaptor.addChild(root_1, stream_id.nextTree());
                        adaptor.addChild(root_1, stream_a.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // Haxe.g:138:10: id
                    {
                    pushFollow(FOLLOW_id_in_dotIdent763);
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
                    // 138:13: -> id
                    {
                        adaptor.addChild(root_0, stream_id.nextTree());

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
    // Haxe.g:141:1: assignOp : ( EQ -> EQ[$EQ] | PLUSEQ -> PLUSEQ[$PLUSEQ] | SUBEQ -> SUBEQ[$SUBEQ] | SLASHEQ -> SLASHEQ[$SLASHEQ] | PERCENTEQ -> PERCENTEQ[$PERCENTEQ] | AMPEQ -> AMPEQ[$AMPEQ] );
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
            // Haxe.g:142:5: ( EQ -> EQ[$EQ] | PLUSEQ -> PLUSEQ[$PLUSEQ] | SUBEQ -> SUBEQ[$SUBEQ] | SLASHEQ -> SLASHEQ[$SLASHEQ] | PERCENTEQ -> PERCENTEQ[$PERCENTEQ] | AMPEQ -> AMPEQ[$AMPEQ] )
            int alt17=6;
            switch ( input.LA(1) ) {
            case EQ:
                {
                alt17=1;
                }
                break;
            case PLUSEQ:
                {
                alt17=2;
                }
                break;
            case SUBEQ:
                {
                alt17=3;
                }
                break;
            case SLASHEQ:
                {
                alt17=4;
                }
                break;
            case PERCENTEQ:
                {
                alt17=5;
                }
                break;
            case AMPEQ:
                {
                alt17=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // Haxe.g:142:10: EQ
                    {
                    EQ46=(Token)match(input,EQ,FOLLOW_EQ_in_assignOp787); if (state.failed) return retval; 
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
                    // 142:20: -> EQ[$EQ]
                    {
                        adaptor.addChild(root_0, new AssignOperationNode(EQ, EQ46));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // Haxe.g:143:10: PLUSEQ
                    {
                    PLUSEQ47=(Token)match(input,PLUSEQ,FOLLOW_PLUSEQ_in_assignOp813); if (state.failed) return retval; 
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
                    // 143:21: -> PLUSEQ[$PLUSEQ]
                    {
                        adaptor.addChild(root_0, new AssignOperationNode(PLUSEQ, PLUSEQ47));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // Haxe.g:144:10: SUBEQ
                    {
                    SUBEQ48=(Token)match(input,SUBEQ,FOLLOW_SUBEQ_in_assignOp836); if (state.failed) return retval; 
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
                    // 144:19: -> SUBEQ[$SUBEQ]
                    {
                        adaptor.addChild(root_0, new AssignOperationNode(SUBEQ, SUBEQ48));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // Haxe.g:145:10: SLASHEQ
                    {
                    SLASHEQ49=(Token)match(input,SLASHEQ,FOLLOW_SLASHEQ_in_assignOp858); if (state.failed) return retval; 
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
                    // 145:21: -> SLASHEQ[$SLASHEQ]
                    {
                        adaptor.addChild(root_0, new AssignOperationNode(SLASHEQ, SLASHEQ49));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // Haxe.g:146:10: PERCENTEQ
                    {
                    PERCENTEQ50=(Token)match(input,PERCENTEQ,FOLLOW_PERCENTEQ_in_assignOp880); if (state.failed) return retval; 
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
                    // 146:23: -> PERCENTEQ[$PERCENTEQ]
                    {
                        adaptor.addChild(root_0, new AssignOperationNode(PERCENTEQ, PERCENTEQ50));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    // Haxe.g:147:10: AMPEQ
                    {
                    AMPEQ51=(Token)match(input,AMPEQ,FOLLOW_AMPEQ_in_assignOp902); if (state.failed) return retval; 
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
                    // 147:19: -> AMPEQ[$AMPEQ]
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
    // Haxe.g:151:1: funcLit : FUNCTION LPAREN paramList RPAREN ( typeTagOpt )? block -> ^( FUNCTION ( paramList )? ( typeTagOpt )? ( block )? ) ;
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
            // Haxe.g:151:9: ( FUNCTION LPAREN paramList RPAREN ( typeTagOpt )? block -> ^( FUNCTION ( paramList )? ( typeTagOpt )? ( block )? ) )
            // Haxe.g:151:11: FUNCTION LPAREN paramList RPAREN ( typeTagOpt )? block
            {
            FUNCTION52=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcLit931); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION52);

            LPAREN53=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcLit933); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN53);

            pushFollow(FOLLOW_paramList_in_funcLit935);
            paramList54=paramList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_paramList.add(paramList54.getTree());
            RPAREN55=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcLit937); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN55);

            // Haxe.g:151:44: ( typeTagOpt )?
            int alt18=2;
            switch ( input.LA(1) ) {
                case COLON:
                    {
                    alt18=1;
                    }
                    break;
                case LBRACE:
                    {
                    int LA18_2 = input.LA(2);

                    if ( (synpred28_Haxe()) ) {
                        alt18=1;
                    }
                    }
                    break;
                case SEMI:
                    {
                    int LA18_3 = input.LA(2);

                    if ( (synpred28_Haxe()) ) {
                        alt18=1;
                    }
                    }
                    break;
            }

            switch (alt18) {
                case 1 :
                    // Haxe.g:0:0: typeTagOpt
                    {
                    pushFollow(FOLLOW_typeTagOpt_in_funcLit939);
                    typeTagOpt56=typeTagOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeTagOpt.add(typeTagOpt56.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_block_in_funcLit942);
            block57=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block57.getTree());


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
            // 151:62: -> ^( FUNCTION ( paramList )? ( typeTagOpt )? ( block )? )
            {
                // Haxe.g:151:65: ^( FUNCTION ( paramList )? ( typeTagOpt )? ( block )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new FunctionNode(stream_FUNCTION.nextToken()), root_1);

                // Haxe.g:151:90: ( paramList )?
                if ( stream_paramList.hasNext() ) {
                    adaptor.addChild(root_1, stream_paramList.nextTree());

                }
                stream_paramList.reset();
                // Haxe.g:151:101: ( typeTagOpt )?
                if ( stream_typeTagOpt.hasNext() ) {
                    adaptor.addChild(root_1, stream_typeTagOpt.nextTree());

                }
                stream_typeTagOpt.reset();
                // Haxe.g:151:113: ( block )?
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
    // Haxe.g:153:1: arrayLit : LBRACKET exprListOpt RBRACKET ;
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
            // Haxe.g:153:13: ( LBRACKET exprListOpt RBRACKET )
            // Haxe.g:153:15: LBRACKET exprListOpt RBRACKET
            {
            root_0 = (Object)adaptor.nil();

            LBRACKET58=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_arrayLit979); if (state.failed) return retval;
            pushFollow(FOLLOW_exprListOpt_in_arrayLit982);
            exprListOpt59=exprListOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, exprListOpt59.getTree());
            RBRACKET60=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_arrayLit984); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // Haxe.g:181:1: typeTag : COLON funcType ;
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
            // Haxe.g:181:9: ( COLON funcType )
            // Haxe.g:181:11: COLON funcType
            {
            root_0 = (Object)adaptor.nil();

            COLON61=(Token)match(input,COLON,FOLLOW_COLON_in_typeTag1016); if (state.failed) return retval;
            pushFollow(FOLLOW_funcType_in_typeTag1019);
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
    // Haxe.g:184:1: typeTagOpt : ( typeTag -> ^( TYPE_TAG[\"TYPE_TAG\",true] ( typeTag )? ) | );
    public final HaxeParser.typeTagOpt_return typeTagOpt() throws RecognitionException {
        HaxeParser.typeTagOpt_return retval = new HaxeParser.typeTagOpt_return();
        retval.start = input.LT(1);
        int typeTagOpt_StartIndex = input.index();
        Object root_0 = null;

        HaxeParser.typeTag_return typeTag63 = null;


        RewriteRuleSubtreeStream stream_typeTag=new RewriteRuleSubtreeStream(adaptor,"rule typeTag");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return retval; }
            // Haxe.g:185:5: ( typeTag -> ^( TYPE_TAG[\"TYPE_TAG\",true] ( typeTag )? ) | )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==COLON) ) {
                alt19=1;
            }
            else if ( (LA19_0==EOF||LA19_0==SEMI||LA19_0==RPAREN||LA19_0==COMMA||LA19_0==EQ||LA19_0==LBRACE) ) {
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
                    // Haxe.g:185:10: typeTag
                    {
                    pushFollow(FOLLOW_typeTag_in_typeTagOpt1047);
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
                    // 185:18: -> ^( TYPE_TAG[\"TYPE_TAG\",true] ( typeTag )? )
                    {
                        // Haxe.g:185:21: ^( TYPE_TAG[\"TYPE_TAG\",true] ( typeTag )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new HaxeTree(TYPE_TAG, "TYPE_TAG", true), root_1);

                        // Haxe.g:185:59: ( typeTag )?
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
                    // Haxe.g:187:5: 
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
    // Haxe.g:189:1: typeList : ( type ( COMMA type )* | typeConstraint ( COMMA typeConstraint )* );
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
            // Haxe.g:190:5: ( type ( COMMA type )* | typeConstraint ( COMMA typeConstraint )* )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RPAREN||LA22_0==DYNAMIC||LA22_0==COMMA||LA22_0==THIS||(LA22_0>=VOID && LA22_0<=GTGTGT)||LA22_0==LBRACE) ) {
                alt22=1;
            }
            else if ( (LA22_0==IDENTIFIER) ) {
                int LA22_2 = input.LA(2);

                if ( (LA22_2==COLON) ) {
                    alt22=2;
                }
                else if ( (LA22_2==RPAREN||LA22_2==DOT||LA22_2==COMMA||(LA22_2>=LT && LA22_2<=GTGTGT)) ) {
                    alt22=1;
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
                    // Haxe.g:190:10: type ( COMMA type )*
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_type_in_typeList1090);
                    type64=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, type64.getTree());
                    // Haxe.g:190:15: ( COMMA type )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==COMMA) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // Haxe.g:190:16: COMMA type
                    	    {
                    	    COMMA65=(Token)match(input,COMMA,FOLLOW_COMMA_in_typeList1093); if (state.failed) return retval;
                    	    pushFollow(FOLLOW_type_in_typeList1096);
                    	    type66=type();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, type66.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // Haxe.g:191:10: typeConstraint ( COMMA typeConstraint )*
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_typeConstraint_in_typeList1113);
                    typeConstraint67=typeConstraint();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeConstraint67.getTree());
                    // Haxe.g:191:25: ( COMMA typeConstraint )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==COMMA) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // Haxe.g:191:26: COMMA typeConstraint
                    	    {
                    	    COMMA68=(Token)match(input,COMMA,FOLLOW_COMMA_in_typeList1116); if (state.failed) return retval;
                    	    pushFollow(FOLLOW_typeConstraint_in_typeList1119);
                    	    typeConstraint69=typeConstraint();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeConstraint69.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop21;
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
    // Haxe.g:194:1: funcType : ( ( type ) ( MINUS_BIGGER type )* | VOID );
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
            // Haxe.g:195:5: ( ( type ) ( MINUS_BIGGER type )* | VOID )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==EOF||(LA24_0>=SEMI && LA24_0<=MONKEYS_AT)||(LA24_0>=RPAREN && LA24_0<=IDENTIFIER)||(LA24_0>=EXTERN && LA24_0<=PRIVATE)||(LA24_0>=IMPORT && LA24_0<=USING)||LA24_0==DYNAMIC||LA24_0==COMMA||(LA24_0>=THIS && LA24_0<=EQ)||LA24_0==MINUS_BIGGER||(LA24_0>=INT && LA24_0<=BOOLEAN)||(LA24_0>=LBRACE && LA24_0<=RBRACE)||LA24_0==ENUM||(LA24_0>=CLASS && LA24_0<=INTERFACE)||LA24_0==TYPEDEF) ) {
                alt24=1;
            }
            else if ( (LA24_0==VOID) ) {
                int LA24_2 = input.LA(2);

                if ( (synpred34_Haxe()) ) {
                    alt24=1;
                }
                else if ( (true) ) {
                    alt24=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 24, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // Haxe.g:195:10: ( type ) ( MINUS_BIGGER type )*
                    {
                    root_0 = (Object)adaptor.nil();

                    // Haxe.g:195:10: ( type )
                    // Haxe.g:195:11: type
                    {
                    pushFollow(FOLLOW_type_in_funcType1144);
                    type70=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, type70.getTree());

                    }

                    // Haxe.g:195:17: ( MINUS_BIGGER type )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==MINUS_BIGGER) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // Haxe.g:195:18: MINUS_BIGGER type
                    	    {
                    	    MINUS_BIGGER71=(Token)match(input,MINUS_BIGGER,FOLLOW_MINUS_BIGGER_in_funcType1148); if (state.failed) return retval;
                    	    pushFollow(FOLLOW_type_in_funcType1151);
                    	    type72=type();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, type72.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // Haxe.g:196:10: VOID
                    {
                    root_0 = (Object)adaptor.nil();

                    VOID73=(Token)match(input,VOID,FOLLOW_VOID_in_funcType1164); if (state.failed) return retval;
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
    // Haxe.g:199:1: primitiveType : ( INT | FLOAT | DYNAMIC | BOOLEAN | VOID );
    public final HaxeParser.primitiveType_return primitiveType() throws RecognitionException {
        HaxeParser.primitiveType_return retval = new HaxeParser.primitiveType_return();
        retval.start = input.LT(1);
        int primitiveType_StartIndex = input.index();
        Object root_0 = null;

        Token set74=null;

        Object set74_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return retval; }
            // Haxe.g:200:5: ( INT | FLOAT | DYNAMIC | BOOLEAN | VOID )
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
    // Haxe.g:203:1: type : ( ( anonType | dotIdent | primitiveType ) ( typeParam )* | );
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
            // Haxe.g:203:9: ( ( anonType | dotIdent | primitiveType ) ( typeParam )* | )
            int alt27=2;
            alt27 = dfa27.predict(input);
            switch (alt27) {
                case 1 :
                    // Haxe.g:203:14: ( anonType | dotIdent | primitiveType ) ( typeParam )*
                    {
                    root_0 = (Object)adaptor.nil();

                    // Haxe.g:203:14: ( anonType | dotIdent | primitiveType )
                    int alt25=3;
                    switch ( input.LA(1) ) {
                    case LBRACE:
                        {
                        alt25=1;
                        }
                        break;
                    case IDENTIFIER:
                    case THIS:
                        {
                        alt25=2;
                        }
                        break;
                    case DYNAMIC:
                    case VOID:
                    case INT:
                    case FLOAT:
                    case BOOLEAN:
                        {
                        alt25=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 25, 0, input);

                        throw nvae;
                    }

                    switch (alt25) {
                        case 1 :
                            // Haxe.g:203:15: anonType
                            {
                            pushFollow(FOLLOW_anonType_in_type1224);
                            anonType75=anonType();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(anonType75.getTree(), root_0);

                            }
                            break;
                        case 2 :
                            // Haxe.g:203:27: dotIdent
                            {
                            pushFollow(FOLLOW_dotIdent_in_type1229);
                            dotIdent76=dotIdent();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(dotIdent76.getTree(), root_0);

                            }
                            break;
                        case 3 :
                            // Haxe.g:203:39: primitiveType
                            {
                            pushFollow(FOLLOW_primitiveType_in_type1234);
                            primitiveType77=primitiveType();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(primitiveType77.getTree(), root_0);

                            }
                            break;

                    }

                    // Haxe.g:203:56: ( typeParam )*
                    loop26:
                    do {
                        int alt26=2;
                        alt26 = dfa26.predict(input);
                        switch (alt26) {
                    	case 1 :
                    	    // Haxe.g:203:57: typeParam
                    	    {
                    	    pushFollow(FOLLOW_typeParam_in_type1240);
                    	    typeParam78=typeParam();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeParam78.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // Haxe.g:205:9: 
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
    // Haxe.g:207:1: typeParam : ( LT typeList GT | LT typeList LT typeList GTGT | LT typeList LT typeList LT typeList GTGTGT );
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
            // Haxe.g:208:5: ( LT typeList GT | LT typeList LT typeList GTGT | LT typeList LT typeList LT typeList GTGTGT )
            int alt28=3;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==LT) ) {
                int LA28_1 = input.LA(2);

                if ( (synpred43_Haxe()) ) {
                    alt28=1;
                }
                else if ( (synpred44_Haxe()) ) {
                    alt28=2;
                }
                else if ( (true) ) {
                    alt28=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 28, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // Haxe.g:208:10: LT typeList GT
                    {
                    root_0 = (Object)adaptor.nil();

                    LT79=(Token)match(input,LT,FOLLOW_LT_in_typeParam1288); if (state.failed) return retval;
                    pushFollow(FOLLOW_typeList_in_typeParam1291);
                    typeList80=typeList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeList80.getTree());
                    GT81=(Token)match(input,GT,FOLLOW_GT_in_typeParam1293); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // Haxe.g:209:10: LT typeList LT typeList GTGT
                    {
                    root_0 = (Object)adaptor.nil();

                    LT82=(Token)match(input,LT,FOLLOW_LT_in_typeParam1305); if (state.failed) return retval;
                    pushFollow(FOLLOW_typeList_in_typeParam1308);
                    typeList83=typeList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeList83.getTree());
                    LT84=(Token)match(input,LT,FOLLOW_LT_in_typeParam1310); if (state.failed) return retval;
                    pushFollow(FOLLOW_typeList_in_typeParam1313);
                    typeList85=typeList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeList85.getTree());
                    GTGT86=(Token)match(input,GTGT,FOLLOW_GTGT_in_typeParam1315); if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // Haxe.g:210:10: LT typeList LT typeList LT typeList GTGTGT
                    {
                    root_0 = (Object)adaptor.nil();

                    LT87=(Token)match(input,LT,FOLLOW_LT_in_typeParam1327); if (state.failed) return retval;
                    pushFollow(FOLLOW_typeList_in_typeParam1330);
                    typeList88=typeList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeList88.getTree());
                    LT89=(Token)match(input,LT,FOLLOW_LT_in_typeParam1332); if (state.failed) return retval;
                    pushFollow(FOLLOW_typeList_in_typeParam1335);
                    typeList90=typeList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeList90.getTree());
                    LT91=(Token)match(input,LT,FOLLOW_LT_in_typeParam1337); if (state.failed) return retval;
                    pushFollow(FOLLOW_typeList_in_typeParam1340);
                    typeList92=typeList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeList92.getTree());
                    GTGTGT93=(Token)match(input,GTGTGT,FOLLOW_GTGTGT_in_typeParam1342); if (state.failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // Haxe.g:214:1: typeParamOpt : ( typeParam -> ^( TYPE_PARAM_OPT[\"TYPE_PARAM_OPT\",true] ( typeParam )? ) | );
    public final HaxeParser.typeParamOpt_return typeParamOpt() throws RecognitionException {
        HaxeParser.typeParamOpt_return retval = new HaxeParser.typeParamOpt_return();
        retval.start = input.LT(1);
        int typeParamOpt_StartIndex = input.index();
        Object root_0 = null;

        HaxeParser.typeParam_return typeParam94 = null;


        RewriteRuleSubtreeStream stream_typeParam=new RewriteRuleSubtreeStream(adaptor,"rule typeParam");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return retval; }
            // Haxe.g:215:5: ( typeParam -> ^( TYPE_PARAM_OPT[\"TYPE_PARAM_OPT\",true] ( typeParam )? ) | )
            int alt29=2;
            alt29 = dfa29.predict(input);
            switch (alt29) {
                case 1 :
                    // Haxe.g:215:10: typeParam
                    {
                    pushFollow(FOLLOW_typeParam_in_typeParamOpt1374);
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
                    // 215:20: -> ^( TYPE_PARAM_OPT[\"TYPE_PARAM_OPT\",true] ( typeParam )? )
                    {
                        // Haxe.g:215:23: ^( TYPE_PARAM_OPT[\"TYPE_PARAM_OPT\",true] ( typeParam )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new HaxeTree(TYPE_PARAM_OPT, "TYPE_PARAM_OPT", true), root_1);

                        // Haxe.g:215:73: ( typeParam )?
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
                    // Haxe.g:217:5: 
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
    // Haxe.g:219:1: typeConstraint : IDENTIFIER COLON LPAREN typeList RPAREN -> ^( $typeConstraint ( IDENTIFIER )? ( typeList )? ) ;
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
            // Haxe.g:220:5: ( IDENTIFIER COLON LPAREN typeList RPAREN -> ^( $typeConstraint ( IDENTIFIER )? ( typeList )? ) )
            // Haxe.g:220:9: IDENTIFIER COLON LPAREN typeList RPAREN
            {
            IDENTIFIER95=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_typeConstraint1423); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER95);

            COLON96=(Token)match(input,COLON,FOLLOW_COLON_in_typeConstraint1425); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COLON.add(COLON96);

            LPAREN97=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_typeConstraint1427); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN97);

            pushFollow(FOLLOW_typeList_in_typeConstraint1429);
            typeList98=typeList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeList.add(typeList98.getTree());
            RPAREN99=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_typeConstraint1431); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN99);



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
            // 220:49: -> ^( $typeConstraint ( IDENTIFIER )? ( typeList )? )
            {
                // Haxe.g:220:52: ^( $typeConstraint ( IDENTIFIER )? ( typeList )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_retval.nextNode(), root_1);

                // Haxe.g:220:70: ( IDENTIFIER )?
                if ( stream_IDENTIFIER.hasNext() ) {
                    adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());

                }
                stream_IDENTIFIER.reset();
                // Haxe.g:220:82: ( typeList )?
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
    // Haxe.g:224:1: functionReturn : ( declAttrList )? FUNCTION NEW LPAREN paramList RPAREN typeTagOpt block -> ^( FUNCTION NEW ( declAttrList )? ( paramList )? ( typeTagOpt )? ( block )? ) ;
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
            // Haxe.g:225:5: ( ( declAttrList )? FUNCTION NEW LPAREN paramList RPAREN typeTagOpt block -> ^( FUNCTION NEW ( declAttrList )? ( paramList )? ( typeTagOpt )? ( block )? ) )
            // Haxe.g:225:10: ( declAttrList )? FUNCTION NEW LPAREN paramList RPAREN typeTagOpt block
            {
            // Haxe.g:225:10: ( declAttrList )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==PRIVATE||(LA30_0>=PUBLIC && LA30_0<=OVERRIDE)) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // Haxe.g:0:0: declAttrList
                    {
                    pushFollow(FOLLOW_declAttrList_in_functionReturn1469);
                    declAttrList100=declAttrList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declAttrList.add(declAttrList100.getTree());

                    }
                    break;

            }

            FUNCTION101=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_functionReturn1472); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION101);

            NEW102=(Token)match(input,NEW,FOLLOW_NEW_in_functionReturn1474); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_NEW.add(NEW102);

            LPAREN103=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_functionReturn1476); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN103);

            pushFollow(FOLLOW_paramList_in_functionReturn1478);
            paramList104=paramList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_paramList.add(paramList104.getTree());
            RPAREN105=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_functionReturn1480); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN105);

            pushFollow(FOLLOW_typeTagOpt_in_functionReturn1482);
            typeTagOpt106=typeTagOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeTagOpt.add(typeTagOpt106.getTree());
            pushFollow(FOLLOW_block_in_functionReturn1484);
            block107=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block107.getTree());


            // AST REWRITE
            // elements: paramList, typeTagOpt, block, NEW, FUNCTION, declAttrList
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 225:78: -> ^( FUNCTION NEW ( declAttrList )? ( paramList )? ( typeTagOpt )? ( block )? )
            {
                // Haxe.g:225:81: ^( FUNCTION NEW ( declAttrList )? ( paramList )? ( typeTagOpt )? ( block )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new FunctionNode(stream_FUNCTION.nextToken()), root_1);

                adaptor.addChild(root_1, stream_NEW.nextNode());
                // Haxe.g:225:110: ( declAttrList )?
                if ( stream_declAttrList.hasNext() ) {
                    adaptor.addChild(root_1, stream_declAttrList.nextTree());

                }
                stream_declAttrList.reset();
                // Haxe.g:225:124: ( paramList )?
                if ( stream_paramList.hasNext() ) {
                    adaptor.addChild(root_1, stream_paramList.nextTree());

                }
                stream_paramList.reset();
                // Haxe.g:225:135: ( typeTagOpt )?
                if ( stream_typeTagOpt.hasNext() ) {
                    adaptor.addChild(root_1, stream_typeTagOpt.nextTree());

                }
                stream_typeTagOpt.reset();
                // Haxe.g:225:147: ( block )?
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
    // Haxe.g:228:1: statement : ( block | assignExpr SEMI | varDecl | IF parExpression st1= statement ( ELSE st2= statement )? -> ^( IF parExpression $st1 ( ^( ELSE $st2) )? ) | FOR LPAREN exp1= expr IN exp2= expr RPAREN statement -> ^( FOR ^( IN $exp1 $exp2) ( statement )? ) | WHILE parExpression statement -> ^( WHILE ( parExpression )? ( statement )? ) | DO statement WHILE parExpression SEMI -> ^( DO ( parExpression )? ( statement )? ) | TRY block catchStmtList -> ^( TRY ( block )? ( catchStmtList )? ) | SWITCH LPAREN expr RPAREN LBRACE ( caseStmt )+ RBRACE -> ^( SWITCH ( expr )? ( caseStmt )+ ) | RETURN ( expr )? SEMI -> ^( RETURN ( expr )? ) | THROW expr SEMI -> ^( THROW ( expr )? ) | BREAK ( IDENTIFIER )? SEMI -> ^( BREAK ( IDENTIFIER )? ) | CONTINUE ( IDENTIFIER )? SEMI -> ^( CONTINUE ( IDENTIFIER )? ) | expr SEMI | IDENTIFIER COLON statement -> ^( COLON ( IDENTIFIER )? ( statement )? ) | SEMI );
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
            // Haxe.g:229:5: ( block | assignExpr SEMI | varDecl | IF parExpression st1= statement ( ELSE st2= statement )? -> ^( IF parExpression $st1 ( ^( ELSE $st2) )? ) | FOR LPAREN exp1= expr IN exp2= expr RPAREN statement -> ^( FOR ^( IN $exp1 $exp2) ( statement )? ) | WHILE parExpression statement -> ^( WHILE ( parExpression )? ( statement )? ) | DO statement WHILE parExpression SEMI -> ^( DO ( parExpression )? ( statement )? ) | TRY block catchStmtList -> ^( TRY ( block )? ( catchStmtList )? ) | SWITCH LPAREN expr RPAREN LBRACE ( caseStmt )+ RBRACE -> ^( SWITCH ( expr )? ( caseStmt )+ ) | RETURN ( expr )? SEMI -> ^( RETURN ( expr )? ) | THROW expr SEMI -> ^( THROW ( expr )? ) | BREAK ( IDENTIFIER )? SEMI -> ^( BREAK ( IDENTIFIER )? ) | CONTINUE ( IDENTIFIER )? SEMI -> ^( CONTINUE ( IDENTIFIER )? ) | expr SEMI | IDENTIFIER COLON statement -> ^( COLON ( IDENTIFIER )? ( statement )? ) | SEMI )
            int alt36=16;
            alt36 = dfa36.predict(input);
            switch (alt36) {
                case 1 :
                    // Haxe.g:229:10: block
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_block_in_statement1533);
                    block108=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, block108.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:230:10: assignExpr SEMI
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_assignExpr_in_statement1544);
                    assignExpr109=assignExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignExpr109.getTree());
                    SEMI110=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement1546); if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // Haxe.g:231:10: varDecl
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_varDecl_in_statement1558);
                    varDecl111=varDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDecl111.getTree());

                    }
                    break;
                case 4 :
                    // Haxe.g:232:10: IF parExpression st1= statement ( ELSE st2= statement )?
                    {
                    IF112=(Token)match(input,IF,FOLLOW_IF_in_statement1569); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IF.add(IF112);

                    pushFollow(FOLLOW_parExpression_in_statement1571);
                    parExpression113=parExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_parExpression.add(parExpression113.getTree());
                    pushFollow(FOLLOW_statement_in_statement1575);
                    st1=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(st1.getTree());
                    // Haxe.g:232:41: ( ELSE st2= statement )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==ELSE) ) {
                        int LA31_1 = input.LA(2);

                        if ( (synpred50_Haxe()) ) {
                            alt31=1;
                        }
                    }
                    switch (alt31) {
                        case 1 :
                            // Haxe.g:232:42: ELSE st2= statement
                            {
                            ELSE114=(Token)match(input,ELSE,FOLLOW_ELSE_in_statement1578); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_ELSE.add(ELSE114);

                            pushFollow(FOLLOW_statement_in_statement1582);
                            st2=statement();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_statement.add(st2.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: st2, IF, ELSE, st1, parExpression
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
                    // 232:67: -> ^( IF parExpression $st1 ( ^( ELSE $st2) )? )
                    {
                        // Haxe.g:232:70: ^( IF parExpression $st1 ( ^( ELSE $st2) )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new IfNode(stream_IF.nextToken()), root_1);

                        adaptor.addChild(root_1, stream_parExpression.nextTree());
                        adaptor.addChild(root_1, stream_st1.nextTree());
                        // Haxe.g:232:102: ( ^( ELSE $st2) )?
                        if ( stream_st2.hasNext()||stream_ELSE.hasNext() ) {
                            // Haxe.g:232:102: ^( ELSE $st2)
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
                    // Haxe.g:233:10: FOR LPAREN exp1= expr IN exp2= expr RPAREN statement
                    {
                    FOR115=(Token)match(input,FOR,FOLLOW_FOR_in_statement1631); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FOR.add(FOR115);

                    LPAREN116=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_statement1633); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN116);

                    pushFollow(FOLLOW_expr_in_statement1637);
                    exp1=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(exp1.getTree());
                    IN117=(Token)match(input,IN,FOLLOW_IN_in_statement1639); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IN.add(IN117);

                    pushFollow(FOLLOW_expr_in_statement1643);
                    exp2=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(exp2.getTree());
                    RPAREN118=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_statement1645); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN118);

                    pushFollow(FOLLOW_statement_in_statement1647);
                    statement119=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement119.getTree());


                    // AST REWRITE
                    // elements: exp1, FOR, exp2, statement, IN
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
                    // 233:65: -> ^( FOR ^( IN $exp1 $exp2) ( statement )? )
                    {
                        // Haxe.g:233:68: ^( FOR ^( IN $exp1 $exp2) ( statement )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new ForNode(stream_FOR.nextToken()), root_1);

                        // Haxe.g:233:83: ^( IN $exp1 $exp2)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_IN.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_exp1.nextTree());
                        adaptor.addChild(root_2, stream_exp2.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // Haxe.g:233:101: ( statement )?
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
                    // Haxe.g:234:10: WHILE parExpression statement
                    {
                    WHILE120=(Token)match(input,WHILE,FOLLOW_WHILE_in_statement1684); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHILE.add(WHILE120);

                    pushFollow(FOLLOW_parExpression_in_statement1686);
                    parExpression121=parExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_parExpression.add(parExpression121.getTree());
                    pushFollow(FOLLOW_statement_in_statement1688);
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
                    // 234:56: -> ^( WHILE ( parExpression )? ( statement )? )
                    {
                        // Haxe.g:234:59: ^( WHILE ( parExpression )? ( statement )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new WhileNode(stream_WHILE.nextToken()), root_1);

                        // Haxe.g:234:78: ( parExpression )?
                        if ( stream_parExpression.hasNext() ) {
                            adaptor.addChild(root_1, stream_parExpression.nextTree());

                        }
                        stream_parExpression.reset();
                        // Haxe.g:234:93: ( statement )?
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
                    // Haxe.g:235:10: DO statement WHILE parExpression SEMI
                    {
                    DO123=(Token)match(input,DO,FOLLOW_DO_in_statement1730); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DO.add(DO123);

                    pushFollow(FOLLOW_statement_in_statement1732);
                    statement124=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement124.getTree());
                    WHILE125=(Token)match(input,WHILE,FOLLOW_WHILE_in_statement1734); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHILE.add(WHILE125);

                    pushFollow(FOLLOW_parExpression_in_statement1736);
                    parExpression126=parExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_parExpression.add(parExpression126.getTree());
                    SEMI127=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement1738); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI127);



                    // AST REWRITE
                    // elements: statement, parExpression, DO
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 235:60: -> ^( DO ( parExpression )? ( statement )? )
                    {
                        // Haxe.g:235:63: ^( DO ( parExpression )? ( statement )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new DoWhileNode(stream_DO.nextToken()), root_1);

                        // Haxe.g:235:81: ( parExpression )?
                        if ( stream_parExpression.hasNext() ) {
                            adaptor.addChild(root_1, stream_parExpression.nextTree());

                        }
                        stream_parExpression.reset();
                        // Haxe.g:235:96: ( statement )?
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
                    // Haxe.g:236:10: TRY block catchStmtList
                    {
                    TRY128=(Token)match(input,TRY,FOLLOW_TRY_in_statement1776); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TRY.add(TRY128);

                    pushFollow(FOLLOW_block_in_statement1778);
                    block129=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block129.getTree());
                    pushFollow(FOLLOW_catchStmtList_in_statement1780);
                    catchStmtList130=catchStmtList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_catchStmtList.add(catchStmtList130.getTree());


                    // AST REWRITE
                    // elements: TRY, block, catchStmtList
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 236:50: -> ^( TRY ( block )? ( catchStmtList )? )
                    {
                        // Haxe.g:236:53: ^( TRY ( block )? ( catchStmtList )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new TryNode(stream_TRY.nextToken()), root_1);

                        // Haxe.g:236:68: ( block )?
                        if ( stream_block.hasNext() ) {
                            adaptor.addChild(root_1, stream_block.nextTree());

                        }
                        stream_block.reset();
                        // Haxe.g:236:75: ( catchStmtList )?
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
                    // Haxe.g:237:10: SWITCH LPAREN expr RPAREN LBRACE ( caseStmt )+ RBRACE
                    {
                    SWITCH131=(Token)match(input,SWITCH,FOLLOW_SWITCH_in_statement1822); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SWITCH.add(SWITCH131);

                    LPAREN132=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_statement1824); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN132);

                    pushFollow(FOLLOW_expr_in_statement1826);
                    expr133=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr133.getTree());
                    RPAREN134=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_statement1828); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN134);

                    LBRACE135=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_statement1830); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LBRACE.add(LBRACE135);

                    // Haxe.g:237:43: ( caseStmt )+
                    int cnt32=0;
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( ((LA32_0>=CASE && LA32_0<=DEFAULT)) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // Haxe.g:0:0: caseStmt
                    	    {
                    	    pushFollow(FOLLOW_caseStmt_in_statement1832);
                    	    caseStmt136=caseStmt();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_caseStmt.add(caseStmt136.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt32 >= 1 ) break loop32;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(32, input);
                                throw eee;
                        }
                        cnt32++;
                    } while (true);

                    RBRACE137=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_statement1835); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RBRACE.add(RBRACE137);



                    // AST REWRITE
                    // elements: caseStmt, expr, SWITCH
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 237:64: -> ^( SWITCH ( expr )? ( caseStmt )+ )
                    {
                        // Haxe.g:237:67: ^( SWITCH ( expr )? ( caseStmt )+ )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new SwitchNode(stream_SWITCH.nextToken()), root_1);

                        // Haxe.g:237:88: ( expr )?
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
                    // Haxe.g:238:10: RETURN ( expr )? SEMI
                    {
                    RETURN138=(Token)match(input,RETURN,FOLLOW_RETURN_in_statement1865); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RETURN.add(RETURN138);

                    // Haxe.g:238:17: ( expr )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==LPAREN||LA33_0==IDENTIFIER||LA33_0==THIS||LA33_0==FUNCTION||LA33_0==NEW||LA33_0==LBRACE||LA33_0==UNTYPED||(LA33_0>=PLUS && LA33_0<=SUB)||(LA33_0>=SUBSUB && LA33_0<=CAST)||LA33_0==NULL||(LA33_0>=LONGLITERAL && LA33_0<=FALSE)) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // Haxe.g:238:18: expr
                            {
                            pushFollow(FOLLOW_expr_in_statement1868);
                            expr139=expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expr.add(expr139.getTree());

                            }
                            break;

                    }

                    SEMI140=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement1872); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI140);



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
                    // 238:49: -> ^( RETURN ( expr )? )
                    {
                        // Haxe.g:238:52: ^( RETURN ( expr )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new ReturnNode(stream_RETURN.nextToken()), root_1);

                        // Haxe.g:238:73: ( expr )?
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
                    // Haxe.g:239:10: THROW expr SEMI
                    {
                    THROW141=(Token)match(input,THROW,FOLLOW_THROW_in_statement1914); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THROW.add(THROW141);

                    pushFollow(FOLLOW_expr_in_statement1916);
                    expr142=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr142.getTree());
                    SEMI143=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement1918); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI143);



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
                    // 239:46: -> ^( THROW ( expr )? )
                    {
                        // Haxe.g:239:49: ^( THROW ( expr )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_THROW.nextNode(), root_1);

                        // Haxe.g:239:57: ( expr )?
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
                    // Haxe.g:240:10: BREAK ( IDENTIFIER )? SEMI
                    {
                    BREAK144=(Token)match(input,BREAK,FOLLOW_BREAK_in_statement1958); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_BREAK.add(BREAK144);

                    // Haxe.g:240:16: ( IDENTIFIER )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==IDENTIFIER) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // Haxe.g:240:17: IDENTIFIER
                            {
                            IDENTIFIER145=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_statement1961); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER145);


                            }
                            break;

                    }

                    SEMI146=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement1965); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI146);



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
                    // 240:50: -> ^( BREAK ( IDENTIFIER )? )
                    {
                        // Haxe.g:240:53: ^( BREAK ( IDENTIFIER )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_BREAK.nextNode(), root_1);

                        // Haxe.g:240:61: ( IDENTIFIER )?
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
                    // Haxe.g:241:10: CONTINUE ( IDENTIFIER )? SEMI
                    {
                    CONTINUE147=(Token)match(input,CONTINUE,FOLLOW_CONTINUE_in_statement2000); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CONTINUE.add(CONTINUE147);

                    // Haxe.g:241:19: ( IDENTIFIER )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==IDENTIFIER) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // Haxe.g:241:20: IDENTIFIER
                            {
                            IDENTIFIER148=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_statement2003); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER148);


                            }
                            break;

                    }

                    SEMI149=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement2007); if (state.failed) return retval; 
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
                    // 241:54: -> ^( CONTINUE ( IDENTIFIER )? )
                    {
                        // Haxe.g:241:57: ^( CONTINUE ( IDENTIFIER )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_CONTINUE.nextNode(), root_1);

                        // Haxe.g:241:68: ( IDENTIFIER )?
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
                    // Haxe.g:242:10: expr SEMI
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_expr_in_statement2043);
                    expr150=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr150.getTree());
                    SEMI151=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement2046); if (state.failed) return retval;

                    }
                    break;
                case 15 :
                    // Haxe.g:243:10: IDENTIFIER COLON statement
                    {
                    IDENTIFIER152=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_statement2058); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER152);

                    COLON153=(Token)match(input,COLON,FOLLOW_COLON_in_statement2060); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(COLON153);

                    pushFollow(FOLLOW_statement_in_statement2062);
                    statement154=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement154.getTree());


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
                    // 243:53: -> ^( COLON ( IDENTIFIER )? ( statement )? )
                    {
                        // Haxe.g:243:56: ^( COLON ( IDENTIFIER )? ( statement )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_COLON.nextNode(), root_1);

                        // Haxe.g:243:64: ( IDENTIFIER )?
                        if ( stream_IDENTIFIER.hasNext() ) {
                            adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());

                        }
                        stream_IDENTIFIER.reset();
                        // Haxe.g:243:76: ( statement )?
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
                    // Haxe.g:244:10: SEMI
                    {
                    root_0 = (Object)adaptor.nil();

                    SEMI155=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement2101); if (state.failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // Haxe.g:247:1: parExpression : LPAREN expr RPAREN ;
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
            // Haxe.g:248:5: ( LPAREN expr RPAREN )
            // Haxe.g:248:9: LPAREN expr RPAREN
            {
            root_0 = (Object)adaptor.nil();

            LPAREN156=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_parExpression2125); if (state.failed) return retval;
            pushFollow(FOLLOW_expr_in_parExpression2128);
            expr157=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr157.getTree());
            RPAREN158=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_parExpression2130); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // Haxe.g:251:1: block : ( LBRACE ( blockStmt )* RBRACE -> ^( BLOCK_SCOPE[\"BLOCK_SCOPE\", true, $LBRACE] ( blockStmt )* RBRACE[$RBRACE, true] ) | SEMI );
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
            // Haxe.g:251:9: ( LBRACE ( blockStmt )* RBRACE -> ^( BLOCK_SCOPE[\"BLOCK_SCOPE\", true, $LBRACE] ( blockStmt )* RBRACE[$RBRACE, true] ) | SEMI )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==LBRACE) ) {
                alt38=1;
            }
            else if ( (LA38_0==SEMI) ) {
                alt38=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // Haxe.g:251:14: LBRACE ( blockStmt )* RBRACE
                    {
                    LBRACE159=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_block2149); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LBRACE.add(LBRACE159);

                    // Haxe.g:251:21: ( blockStmt )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( ((LA37_0>=SEMI && LA37_0<=LPAREN)||LA37_0==IDENTIFIER||(LA37_0>=EXTERN && LA37_0<=PRIVATE)||(LA37_0>=PUBLIC && LA37_0<=OVERRIDE)||LA37_0==THIS||LA37_0==FUNCTION||(LA37_0>=NEW && LA37_0<=IF)||LA37_0==FOR||(LA37_0>=WHILE && LA37_0<=LBRACE)||(LA37_0>=RETURN && LA37_0<=CONTINUE)||LA37_0==UNTYPED||(LA37_0>=PLUS && LA37_0<=SUB)||(LA37_0>=SUBSUB && LA37_0<=INTERFACE)||(LA37_0>=LONGLITERAL && LA37_0<=FALSE)) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // Haxe.g:251:22: blockStmt
                    	    {
                    	    pushFollow(FOLLOW_blockStmt_in_block2152);
                    	    blockStmt160=blockStmt();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_blockStmt.add(blockStmt160.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop37;
                        }
                    } while (true);

                    RBRACE161=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_block2156); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RBRACE.add(RBRACE161);



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
                    // 251:41: -> ^( BLOCK_SCOPE[\"BLOCK_SCOPE\", true, $LBRACE] ( blockStmt )* RBRACE[$RBRACE, true] )
                    {
                        // Haxe.g:251:44: ^( BLOCK_SCOPE[\"BLOCK_SCOPE\", true, $LBRACE] ( blockStmt )* RBRACE[$RBRACE, true] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new BlockScopeNode(BLOCK_SCOPE, "BLOCK_SCOPE", true, LBRACE159), root_1);

                        // Haxe.g:251:104: ( blockStmt )*
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
                    // Haxe.g:252:14: SEMI
                    {
                    root_0 = (Object)adaptor.nil();

                    SEMI162=(Token)match(input,SEMI,FOLLOW_SEMI_in_block2191); if (state.failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // Haxe.g:255:1: blockStmt : ( varDecl | classDecl | statement );
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
            // Haxe.g:256:5: ( varDecl | classDecl | statement )
            int alt39=3;
            alt39 = dfa39.predict(input);
            switch (alt39) {
                case 1 :
                    // Haxe.g:256:10: varDecl
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_varDecl_in_blockStmt2220);
                    varDecl163=varDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDecl163.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:257:10: classDecl
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_classDecl_in_blockStmt2231);
                    classDecl164=classDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, classDecl164.getTree());

                    }
                    break;
                case 3 :
                    // Haxe.g:258:10: statement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_statement_in_blockStmt2242);
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
    // Haxe.g:261:1: breakStmt : BREAK SEMI ;
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
            // Haxe.g:262:5: ( BREAK SEMI )
            // Haxe.g:262:10: BREAK SEMI
            {
            root_0 = (Object)adaptor.nil();

            BREAK166=(Token)match(input,BREAK,FOLLOW_BREAK_in_breakStmt2266); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            BREAK166_tree = (Object)adaptor.create(BREAK166);
            adaptor.addChild(root_0, BREAK166_tree);
            }
            SEMI167=(Token)match(input,SEMI,FOLLOW_SEMI_in_breakStmt2268); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // Haxe.g:265:1: continueStmt : CONTINUE SEMI ;
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
            // Haxe.g:266:5: ( CONTINUE SEMI )
            // Haxe.g:266:10: CONTINUE SEMI
            {
            root_0 = (Object)adaptor.nil();

            CONTINUE168=(Token)match(input,CONTINUE,FOLLOW_CONTINUE_in_continueStmt2293); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            CONTINUE168_tree = (Object)adaptor.create(CONTINUE168);
            adaptor.addChild(root_0, CONTINUE168_tree);
            }
            SEMI169=(Token)match(input,SEMI,FOLLOW_SEMI_in_continueStmt2295); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // Haxe.g:269:1: caseStmt : ( CASE exprList COLON statement -> ^( CASE ( exprList )? ( statement )? ) | DEFAULT COLON statement -> ^( DEFAULT ( statement )? ) );
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
            // Haxe.g:270:5: ( CASE exprList COLON statement -> ^( CASE ( exprList )? ( statement )? ) | DEFAULT COLON statement -> ^( DEFAULT ( statement )? ) )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==CASE) ) {
                alt40=1;
            }
            else if ( (LA40_0==DEFAULT) ) {
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
                    // Haxe.g:270:10: CASE exprList COLON statement
                    {
                    CASE170=(Token)match(input,CASE,FOLLOW_CASE_in_caseStmt2320); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CASE.add(CASE170);

                    pushFollow(FOLLOW_exprList_in_caseStmt2322);
                    exprList171=exprList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_exprList.add(exprList171.getTree());
                    COLON172=(Token)match(input,COLON,FOLLOW_COLON_in_caseStmt2324); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(COLON172);

                    pushFollow(FOLLOW_statement_in_caseStmt2326);
                    statement173=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement173.getTree());


                    // AST REWRITE
                    // elements: exprList, statement, CASE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 270:41: -> ^( CASE ( exprList )? ( statement )? )
                    {
                        // Haxe.g:270:44: ^( CASE ( exprList )? ( statement )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_CASE.nextNode(), root_1);

                        // Haxe.g:270:51: ( exprList )?
                        if ( stream_exprList.hasNext() ) {
                            adaptor.addChild(root_1, stream_exprList.nextTree());

                        }
                        stream_exprList.reset();
                        // Haxe.g:270:61: ( statement )?
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
                    // Haxe.g:271:10: DEFAULT COLON statement
                    {
                    DEFAULT174=(Token)match(input,DEFAULT,FOLLOW_DEFAULT_in_caseStmt2350); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DEFAULT.add(DEFAULT174);

                    COLON175=(Token)match(input,COLON,FOLLOW_COLON_in_caseStmt2352); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(COLON175);

                    pushFollow(FOLLOW_statement_in_caseStmt2354);
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
                    // 271:41: -> ^( DEFAULT ( statement )? )
                    {
                        // Haxe.g:271:44: ^( DEFAULT ( statement )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_DEFAULT.nextNode(), root_1);

                        // Haxe.g:271:54: ( statement )?
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
    // Haxe.g:274:1: defaultStmt : DEFAULT COLON ;
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
            // Haxe.g:275:5: ( DEFAULT COLON )
            // Haxe.g:275:10: DEFAULT COLON
            {
            root_0 = (Object)adaptor.nil();

            DEFAULT177=(Token)match(input,DEFAULT,FOLLOW_DEFAULT_in_defaultStmt2394); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            DEFAULT177_tree = (Object)adaptor.create(DEFAULT177);
            adaptor.addChild(root_0, DEFAULT177_tree);
            }
            COLON178=(Token)match(input,COLON,FOLLOW_COLON_in_defaultStmt2396); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // Haxe.g:278:1: catchStmtList : ( catchStmt catchStmtList | );
    public final HaxeParser.catchStmtList_return catchStmtList() throws RecognitionException {
        HaxeParser.catchStmtList_return retval = new HaxeParser.catchStmtList_return();
        retval.start = input.LT(1);
        int catchStmtList_StartIndex = input.index();
        Object root_0 = null;

        HaxeParser.catchStmt_return catchStmt179 = null;

        HaxeParser.catchStmtList_return catchStmtList180 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return retval; }
            // Haxe.g:279:5: ( catchStmt catchStmtList | )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==CATCH) ) {
                alt41=1;
            }
            else if ( (LA41_0==EOF||(LA41_0>=SEMI && LA41_0<=IDENTIFIER)||(LA41_0>=EXTERN && LA41_0<=PRIVATE)||(LA41_0>=PUBLIC && LA41_0<=OVERRIDE)||LA41_0==THIS||LA41_0==FUNCTION||(LA41_0>=NEW && LA41_0<=FOR)||(LA41_0>=WHILE && LA41_0<=DEFAULT)||LA41_0==UNTYPED||(LA41_0>=PLUS && LA41_0<=SUB)||(LA41_0>=SUBSUB && LA41_0<=INTERFACE)||(LA41_0>=LONGLITERAL && LA41_0<=FALSE)) ) {
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
                    // Haxe.g:279:7: catchStmt catchStmtList
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_catchStmt_in_catchStmtList2418);
                    catchStmt179=catchStmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, catchStmt179.getTree());
                    pushFollow(FOLLOW_catchStmtList_in_catchStmtList2420);
                    catchStmtList180=catchStmtList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, catchStmtList180.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:281:5: 
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
    // Haxe.g:283:1: catchStmt : CATCH LPAREN param RPAREN block -> ^( CATCH ( param )? ( block )? ) ;
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
            // Haxe.g:284:5: ( CATCH LPAREN param RPAREN block -> ^( CATCH ( param )? ( block )? ) )
            // Haxe.g:284:10: CATCH LPAREN param RPAREN block
            {
            CATCH181=(Token)match(input,CATCH,FOLLOW_CATCH_in_catchStmt2450); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CATCH.add(CATCH181);

            LPAREN182=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_catchStmt2452); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN182);

            pushFollow(FOLLOW_param_in_catchStmt2454);
            param183=param();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_param.add(param183.getTree());
            RPAREN184=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_catchStmt2456); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN184);

            pushFollow(FOLLOW_block_in_catchStmt2458);
            block185=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block185.getTree());


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
            // 284:42: -> ^( CATCH ( param )? ( block )? )
            {
                // Haxe.g:284:45: ^( CATCH ( param )? ( block )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_CATCH.nextNode(), root_1);

                // Haxe.g:284:53: ( param )?
                if ( stream_param.hasNext() ) {
                    adaptor.addChild(root_1, stream_param.nextTree());

                }
                stream_param.reset();
                // Haxe.g:284:60: ( block )?
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
    // Haxe.g:289:1: exprListOpt : ( exprList | );
    public final HaxeParser.exprListOpt_return exprListOpt() throws RecognitionException {
        HaxeParser.exprListOpt_return retval = new HaxeParser.exprListOpt_return();
        retval.start = input.LT(1);
        int exprListOpt_StartIndex = input.index();
        Object root_0 = null;

        HaxeParser.exprList_return exprList186 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return retval; }
            // Haxe.g:290:5: ( exprList | )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==LPAREN||LA42_0==IDENTIFIER||LA42_0==THIS||LA42_0==FUNCTION||LA42_0==NEW||LA42_0==LBRACE||LA42_0==UNTYPED||(LA42_0>=PLUS && LA42_0<=SUB)||(LA42_0>=SUBSUB && LA42_0<=CAST)||LA42_0==NULL||(LA42_0>=LONGLITERAL && LA42_0<=FALSE)) ) {
                alt42=1;
            }
            else if ( (LA42_0==RPAREN||LA42_0==RBRACKET) ) {
                alt42=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // Haxe.g:290:10: exprList
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_exprList_in_exprListOpt2496);
                    exprList186=exprList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, exprList186.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:292:5: 
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
    // Haxe.g:294:1: exprList : expr ( COMMA expr )* ;
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
            // Haxe.g:295:5: ( expr ( COMMA expr )* )
            // Haxe.g:295:10: expr ( COMMA expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_expr_in_exprList2526);
            expr187=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr187.getTree());
            // Haxe.g:295:15: ( COMMA expr )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==COMMA) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // Haxe.g:295:16: COMMA expr
            	    {
            	    COMMA188=(Token)match(input,COMMA,FOLLOW_COMMA_in_exprList2529); if (state.failed) return retval;
            	    pushFollow(FOLLOW_expr_in_exprList2532);
            	    expr189=expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr189.getTree());

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
    // Haxe.g:298:1: expr : ( assignExpr | UNTYPED assignExpr -> ^( UNTYPED assignExpr ) );
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
            // Haxe.g:299:5: ( assignExpr | UNTYPED assignExpr -> ^( UNTYPED assignExpr ) )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==LPAREN||LA44_0==IDENTIFIER||LA44_0==THIS||LA44_0==FUNCTION||LA44_0==NEW||LA44_0==LBRACE||(LA44_0>=PLUS && LA44_0<=SUB)||(LA44_0>=SUBSUB && LA44_0<=CAST)||LA44_0==NULL||(LA44_0>=LONGLITERAL && LA44_0<=FALSE)) ) {
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
                    // Haxe.g:299:10: assignExpr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_assignExpr_in_expr2558);
                    assignExpr190=assignExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignExpr190.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:300:10: UNTYPED assignExpr
                    {
                    UNTYPED191=(Token)match(input,UNTYPED,FOLLOW_UNTYPED_in_expr2569); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_UNTYPED.add(UNTYPED191);

                    pushFollow(FOLLOW_assignExpr_in_expr2571);
                    assignExpr192=assignExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_assignExpr.add(assignExpr192.getTree());


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
                    // 300:32: -> ^( UNTYPED assignExpr )
                    {
                        // Haxe.g:300:35: ^( UNTYPED assignExpr )
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
    // Haxe.g:303:1: assignExpr : iterExpr ( assignOp iterExpr )? ;
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
            // Haxe.g:304:5: ( iterExpr ( assignOp iterExpr )? )
            // Haxe.g:304:11: iterExpr ( assignOp iterExpr )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_iterExpr_in_assignExpr2603);
            iterExpr193=iterExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, iterExpr193.getTree());
            // Haxe.g:304:20: ( assignOp iterExpr )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( ((LA45_0>=EQ && LA45_0<=AMPEQ)) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // Haxe.g:304:21: assignOp iterExpr
                    {
                    pushFollow(FOLLOW_assignOp_in_assignExpr2606);
                    assignOp194=assignOp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(assignOp194.getTree(), root_0);
                    pushFollow(FOLLOW_iterExpr_in_assignExpr2609);
                    iterExpr195=iterExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, iterExpr195.getTree());

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
    // Haxe.g:307:1: iterExpr : ternaryExpr ( ELLIPSIS ternaryExpr )? ;
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
            // Haxe.g:308:5: ( ternaryExpr ( ELLIPSIS ternaryExpr )? )
            // Haxe.g:308:10: ternaryExpr ( ELLIPSIS ternaryExpr )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_ternaryExpr_in_iterExpr2632);
            ternaryExpr196=ternaryExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, ternaryExpr196.getTree());
            // Haxe.g:308:22: ( ELLIPSIS ternaryExpr )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==ELLIPSIS) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // Haxe.g:308:23: ELLIPSIS ternaryExpr
                    {
                    ELLIPSIS197=(Token)match(input,ELLIPSIS,FOLLOW_ELLIPSIS_in_iterExpr2635); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ELLIPSIS197_tree = (Object)adaptor.create(ELLIPSIS197);
                    root_0 = (Object)adaptor.becomeRoot(ELLIPSIS197_tree, root_0);
                    }
                    pushFollow(FOLLOW_ternaryExpr_in_iterExpr2638);
                    ternaryExpr198=ternaryExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ternaryExpr198.getTree());

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
    // Haxe.g:311:1: ternaryExpr : logicOrExpr ( QUES expr COLON logicOrExpr )? ;
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
            // Haxe.g:312:5: ( logicOrExpr ( QUES expr COLON logicOrExpr )? )
            // Haxe.g:312:10: logicOrExpr ( QUES expr COLON logicOrExpr )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_logicOrExpr_in_ternaryExpr2660);
            logicOrExpr199=logicOrExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, logicOrExpr199.getTree());
            // Haxe.g:312:22: ( QUES expr COLON logicOrExpr )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==QUES) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // Haxe.g:312:23: QUES expr COLON logicOrExpr
                    {
                    QUES200=(Token)match(input,QUES,FOLLOW_QUES_in_ternaryExpr2663); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    QUES200_tree = (Object)adaptor.create(QUES200);
                    root_0 = (Object)adaptor.becomeRoot(QUES200_tree, root_0);
                    }
                    pushFollow(FOLLOW_expr_in_ternaryExpr2666);
                    expr201=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr201.getTree());
                    COLON202=(Token)match(input,COLON,FOLLOW_COLON_in_ternaryExpr2668); if (state.failed) return retval;
                    pushFollow(FOLLOW_logicOrExpr_in_ternaryExpr2671);
                    logicOrExpr203=logicOrExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, logicOrExpr203.getTree());

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
    // Haxe.g:315:1: logicOrExpr : logicAndExpr ( BARBAR logicAndExpr )* ;
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
            // Haxe.g:316:5: ( logicAndExpr ( BARBAR logicAndExpr )* )
            // Haxe.g:316:10: logicAndExpr ( BARBAR logicAndExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_logicAndExpr_in_logicOrExpr2694);
            logicAndExpr204=logicAndExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, logicAndExpr204.getTree());
            // Haxe.g:316:23: ( BARBAR logicAndExpr )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==BARBAR) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // Haxe.g:316:24: BARBAR logicAndExpr
            	    {
            	    BARBAR205=(Token)match(input,BARBAR,FOLLOW_BARBAR_in_logicOrExpr2697); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    BARBAR205_tree = (Object)adaptor.create(BARBAR205);
            	    root_0 = (Object)adaptor.becomeRoot(BARBAR205_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_logicAndExpr_in_logicOrExpr2700);
            	    logicAndExpr206=logicAndExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, logicAndExpr206.getTree());

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
    // Haxe.g:319:1: logicAndExpr : ( cmpExpr ) ( AMPAMP cmpExpr )* ;
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
            // Haxe.g:320:5: ( ( cmpExpr ) ( AMPAMP cmpExpr )* )
            // Haxe.g:320:10: ( cmpExpr ) ( AMPAMP cmpExpr )*
            {
            root_0 = (Object)adaptor.nil();

            // Haxe.g:320:10: ( cmpExpr )
            // Haxe.g:320:11: cmpExpr
            {
            pushFollow(FOLLOW_cmpExpr_in_logicAndExpr2727);
            cmpExpr207=cmpExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, cmpExpr207.getTree());

            }

            // Haxe.g:320:20: ( AMPAMP cmpExpr )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==AMPAMP) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // Haxe.g:320:21: AMPAMP cmpExpr
            	    {
            	    AMPAMP208=(Token)match(input,AMPAMP,FOLLOW_AMPAMP_in_logicAndExpr2731); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    AMPAMP208_tree = (Object)adaptor.create(AMPAMP208);
            	    root_0 = (Object)adaptor.becomeRoot(AMPAMP208_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_cmpExpr_in_logicAndExpr2734);
            	    cmpExpr209=cmpExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, cmpExpr209.getTree());

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
    // Haxe.g:323:1: cmpExpr : ( bitExpr ) ( ( EQEQ | BANGEQ | GTEQ | LTEQ | GT | LT ) bitExpr )* ;
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
            // Haxe.g:323:9: ( ( bitExpr ) ( ( EQEQ | BANGEQ | GTEQ | LTEQ | GT | LT ) bitExpr )* )
            // Haxe.g:323:14: ( bitExpr ) ( ( EQEQ | BANGEQ | GTEQ | LTEQ | GT | LT ) bitExpr )*
            {
            root_0 = (Object)adaptor.nil();

            // Haxe.g:323:14: ( bitExpr )
            // Haxe.g:323:15: bitExpr
            {
            pushFollow(FOLLOW_bitExpr_in_cmpExpr2757);
            bitExpr210=bitExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bitExpr210.getTree());

            }

            // Haxe.g:323:24: ( ( EQEQ | BANGEQ | GTEQ | LTEQ | GT | LT ) bitExpr )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( ((LA51_0>=LT && LA51_0<=GT)||(LA51_0>=EQEQ && LA51_0<=LTEQ)) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // Haxe.g:323:25: ( EQEQ | BANGEQ | GTEQ | LTEQ | GT | LT ) bitExpr
            	    {
            	    // Haxe.g:323:25: ( EQEQ | BANGEQ | GTEQ | LTEQ | GT | LT )
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
            	            // Haxe.g:323:26: EQEQ
            	            {
            	            EQEQ211=(Token)match(input,EQEQ,FOLLOW_EQEQ_in_cmpExpr2762); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            EQEQ211_tree = (Object)adaptor.create(EQEQ211);
            	            root_0 = (Object)adaptor.becomeRoot(EQEQ211_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // Haxe.g:323:33: BANGEQ
            	            {
            	            BANGEQ212=(Token)match(input,BANGEQ,FOLLOW_BANGEQ_in_cmpExpr2766); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            BANGEQ212_tree = (Object)adaptor.create(BANGEQ212);
            	            root_0 = (Object)adaptor.becomeRoot(BANGEQ212_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // Haxe.g:323:43: GTEQ
            	            {
            	            GTEQ213=(Token)match(input,GTEQ,FOLLOW_GTEQ_in_cmpExpr2771); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            GTEQ213_tree = (Object)adaptor.create(GTEQ213);
            	            root_0 = (Object)adaptor.becomeRoot(GTEQ213_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // Haxe.g:323:51: LTEQ
            	            {
            	            LTEQ214=(Token)match(input,LTEQ,FOLLOW_LTEQ_in_cmpExpr2776); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            LTEQ214_tree = (Object)adaptor.create(LTEQ214);
            	            root_0 = (Object)adaptor.becomeRoot(LTEQ214_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 5 :
            	            // Haxe.g:323:59: GT
            	            {
            	            GT215=(Token)match(input,GT,FOLLOW_GT_in_cmpExpr2781); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            GT215_tree = (Object)adaptor.create(GT215);
            	            root_0 = (Object)adaptor.becomeRoot(GT215_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 6 :
            	            // Haxe.g:323:65: LT
            	            {
            	            LT216=(Token)match(input,LT,FOLLOW_LT_in_cmpExpr2786); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            LT216_tree = (Object)adaptor.create(LT216);
            	            root_0 = (Object)adaptor.becomeRoot(LT216_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_bitExpr_in_cmpExpr2791);
            	    bitExpr217=bitExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, bitExpr217.getTree());

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
    // Haxe.g:326:1: bitExpr : ( shiftExpr ) ( BAR shiftExpr | AMP shiftExpr | CARET shiftExpr )* ;
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
            // Haxe.g:326:9: ( ( shiftExpr ) ( BAR shiftExpr | AMP shiftExpr | CARET shiftExpr )* )
            // Haxe.g:326:14: ( shiftExpr ) ( BAR shiftExpr | AMP shiftExpr | CARET shiftExpr )*
            {
            root_0 = (Object)adaptor.nil();

            // Haxe.g:326:14: ( shiftExpr )
            // Haxe.g:326:15: shiftExpr
            {
            pushFollow(FOLLOW_shiftExpr_in_bitExpr2814);
            shiftExpr218=shiftExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, shiftExpr218.getTree());

            }

            // Haxe.g:326:26: ( BAR shiftExpr | AMP shiftExpr | CARET shiftExpr )*
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
            	    // Haxe.g:326:27: BAR shiftExpr
            	    {
            	    BAR219=(Token)match(input,BAR,FOLLOW_BAR_in_bitExpr2818); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    BAR219_tree = (Object)adaptor.create(BAR219);
            	    root_0 = (Object)adaptor.becomeRoot(BAR219_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_shiftExpr_in_bitExpr2821);
            	    shiftExpr220=shiftExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, shiftExpr220.getTree());

            	    }
            	    break;
            	case 2 :
            	    // Haxe.g:326:44: AMP shiftExpr
            	    {
            	    AMP221=(Token)match(input,AMP,FOLLOW_AMP_in_bitExpr2825); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    AMP221_tree = (Object)adaptor.create(AMP221);
            	    root_0 = (Object)adaptor.becomeRoot(AMP221_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_shiftExpr_in_bitExpr2828);
            	    shiftExpr222=shiftExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, shiftExpr222.getTree());

            	    }
            	    break;
            	case 3 :
            	    // Haxe.g:326:60: CARET shiftExpr
            	    {
            	    CARET223=(Token)match(input,CARET,FOLLOW_CARET_in_bitExpr2831); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    CARET223_tree = (Object)adaptor.create(CARET223);
            	    root_0 = (Object)adaptor.becomeRoot(CARET223_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_shiftExpr_in_bitExpr2834);
            	    shiftExpr224=shiftExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, shiftExpr224.getTree());

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
    // Haxe.g:329:1: shiftExpr : ( addExpr ) ( LTLT addExpr | ( GT GT ) addExpr | GTGTGT addExpr )* ;
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
            // Haxe.g:330:5: ( ( addExpr ) ( LTLT addExpr | ( GT GT ) addExpr | GTGTGT addExpr )* )
            // Haxe.g:330:10: ( addExpr ) ( LTLT addExpr | ( GT GT ) addExpr | GTGTGT addExpr )*
            {
            root_0 = (Object)adaptor.nil();

            // Haxe.g:330:10: ( addExpr )
            // Haxe.g:330:11: addExpr
            {
            pushFollow(FOLLOW_addExpr_in_shiftExpr2863);
            addExpr225=addExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, addExpr225.getTree());

            }

            // Haxe.g:330:20: ( LTLT addExpr | ( GT GT ) addExpr | GTGTGT addExpr )*
            loop53:
            do {
                int alt53=4;
                switch ( input.LA(1) ) {
                case GT:
                    {
                    int LA53_2 = input.LA(2);

                    if ( (LA53_2==GT) ) {
                        alt53=2;
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
            	    // Haxe.g:330:21: LTLT addExpr
            	    {
            	    LTLT226=(Token)match(input,LTLT,FOLLOW_LTLT_in_shiftExpr2867); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    LTLT226_tree = (Object)adaptor.create(LTLT226);
            	    root_0 = (Object)adaptor.becomeRoot(LTLT226_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_addExpr_in_shiftExpr2871);
            	    addExpr227=addExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, addExpr227.getTree());

            	    }
            	    break;
            	case 2 :
            	    // Haxe.g:330:38: ( GT GT ) addExpr
            	    {
            	    // Haxe.g:330:38: ( GT GT )
            	    // Haxe.g:330:39: GT GT
            	    {
            	    GT228=(Token)match(input,GT,FOLLOW_GT_in_shiftExpr2876); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    GT228_tree = (Object)adaptor.create(GT228);
            	    adaptor.addChild(root_0, GT228_tree);
            	    }
            	    GT229=(Token)match(input,GT,FOLLOW_GT_in_shiftExpr2878); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    GT229_tree = (Object)adaptor.create(GT229);
            	    adaptor.addChild(root_0, GT229_tree);
            	    }

            	    }

            	    pushFollow(FOLLOW_addExpr_in_shiftExpr2883);
            	    addExpr230=addExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, addExpr230.getTree());

            	    }
            	    break;
            	case 3 :
            	    // Haxe.g:330:58: GTGTGT addExpr
            	    {
            	    GTGTGT231=(Token)match(input,GTGTGT,FOLLOW_GTGTGT_in_shiftExpr2887); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    GTGTGT231_tree = (Object)adaptor.create(GTGTGT231);
            	    root_0 = (Object)adaptor.becomeRoot(GTGTGT231_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_addExpr_in_shiftExpr2890);
            	    addExpr232=addExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, addExpr232.getTree());

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
    // Haxe.g:333:1: addExpr : ( multExpr ) ( ( PLUS | SUB ) multExpr )* ;
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
            // Haxe.g:333:9: ( ( multExpr ) ( ( PLUS | SUB ) multExpr )* )
            // Haxe.g:333:15: ( multExpr ) ( ( PLUS | SUB ) multExpr )*
            {
            root_0 = (Object)adaptor.nil();

            // Haxe.g:333:15: ( multExpr )
            // Haxe.g:333:16: multExpr
            {
            pushFollow(FOLLOW_multExpr_in_addExpr2910);
            multExpr233=multExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, multExpr233.getTree());

            }

            // Haxe.g:333:26: ( ( PLUS | SUB ) multExpr )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( ((LA55_0>=PLUS && LA55_0<=SUB)) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // Haxe.g:333:27: ( PLUS | SUB ) multExpr
            	    {
            	    // Haxe.g:333:27: ( PLUS | SUB )
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
            	            // Haxe.g:333:28: PLUS
            	            {
            	            PLUS234=(Token)match(input,PLUS,FOLLOW_PLUS_in_addExpr2915); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            PLUS234_tree = (Object)adaptor.create(PLUS234);
            	            root_0 = (Object)adaptor.becomeRoot(PLUS234_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // Haxe.g:333:36: SUB
            	            {
            	            SUB235=(Token)match(input,SUB,FOLLOW_SUB_in_addExpr2920); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            SUB235_tree = (Object)adaptor.create(SUB235);
            	            root_0 = (Object)adaptor.becomeRoot(SUB235_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_multExpr_in_addExpr2924);
            	    multExpr236=multExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, multExpr236.getTree());

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
    // Haxe.g:336:1: multExpr : ( psExpr ) ( ( STAR | SLASH | PERCENT ) psExpr )* ;
    public final HaxeParser.multExpr_return multExpr() throws RecognitionException {
        HaxeParser.multExpr_return retval = new HaxeParser.multExpr_return();
        retval.start = input.LT(1);
        int multExpr_StartIndex = input.index();
        Object root_0 = null;

        Token STAR238=null;
        Token SLASH239=null;
        Token PERCENT240=null;
        HaxeParser.psExpr_return psExpr237 = null;

        HaxeParser.psExpr_return psExpr241 = null;


        Object STAR238_tree=null;
        Object SLASH239_tree=null;
        Object PERCENT240_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 52) ) { return retval; }
            // Haxe.g:336:9: ( ( psExpr ) ( ( STAR | SLASH | PERCENT ) psExpr )* )
            // Haxe.g:336:14: ( psExpr ) ( ( STAR | SLASH | PERCENT ) psExpr )*
            {
            root_0 = (Object)adaptor.nil();

            // Haxe.g:336:14: ( psExpr )
            // Haxe.g:336:15: psExpr
            {
            pushFollow(FOLLOW_psExpr_in_multExpr2951);
            psExpr237=psExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, psExpr237.getTree());

            }

            // Haxe.g:336:23: ( ( STAR | SLASH | PERCENT ) psExpr )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( ((LA57_0>=STAR && LA57_0<=PERCENT)) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // Haxe.g:336:24: ( STAR | SLASH | PERCENT ) psExpr
            	    {
            	    // Haxe.g:336:24: ( STAR | SLASH | PERCENT )
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
            	            // Haxe.g:336:25: STAR
            	            {
            	            STAR238=(Token)match(input,STAR,FOLLOW_STAR_in_multExpr2956); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            STAR238_tree = (Object)adaptor.create(STAR238);
            	            root_0 = (Object)adaptor.becomeRoot(STAR238_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // Haxe.g:336:31: SLASH
            	            {
            	            SLASH239=(Token)match(input,SLASH,FOLLOW_SLASH_in_multExpr2959); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            SLASH239_tree = (Object)adaptor.create(SLASH239);
            	            root_0 = (Object)adaptor.becomeRoot(SLASH239_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // Haxe.g:336:38: PERCENT
            	            {
            	            PERCENT240=(Token)match(input,PERCENT,FOLLOW_PERCENT_in_multExpr2962); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            PERCENT240_tree = (Object)adaptor.create(PERCENT240);
            	            root_0 = (Object)adaptor.becomeRoot(PERCENT240_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_psExpr_in_multExpr2966);
            	    psExpr241=psExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, psExpr241.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 52, multExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "multExpr"

    public static class psExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "psExpr"
    // Haxe.g:339:1: psExpr : ( prefixExpr | suffixExpr | value );
    public final HaxeParser.psExpr_return psExpr() throws RecognitionException {
        HaxeParser.psExpr_return retval = new HaxeParser.psExpr_return();
        retval.start = input.LT(1);
        int psExpr_StartIndex = input.index();
        Object root_0 = null;

        HaxeParser.prefixExpr_return prefixExpr242 = null;

        HaxeParser.suffixExpr_return suffixExpr243 = null;

        HaxeParser.value_return value244 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 53) ) { return retval; }
            // Haxe.g:340:6: ( prefixExpr | suffixExpr | value )
            int alt58=3;
            alt58 = dfa58.predict(input);
            switch (alt58) {
                case 1 :
                    // Haxe.g:340:8: prefixExpr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_prefixExpr_in_psExpr2998);
                    prefixExpr242=prefixExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, prefixExpr242.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:341:8: suffixExpr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_suffixExpr_in_psExpr3007);
                    suffixExpr243=suffixExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, suffixExpr243.getTree());

                    }
                    break;
                case 3 :
                    // Haxe.g:342:9: value
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_value_in_psExpr3017);
                    value244=value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, value244.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 53, psExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "psExpr"

    public static class prefixExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "prefixExpr"
    // Haxe.g:345:1: prefixExpr : ( ( SUB | SUBSUB | PLUS | PLUSPLUS | BANG | TILDE ) value | newExpr | cast | funcLit );
    public final HaxeParser.prefixExpr_return prefixExpr() throws RecognitionException {
        HaxeParser.prefixExpr_return retval = new HaxeParser.prefixExpr_return();
        retval.start = input.LT(1);
        int prefixExpr_StartIndex = input.index();
        Object root_0 = null;

        Token set245=null;
        HaxeParser.value_return value246 = null;

        HaxeParser.newExpr_return newExpr247 = null;

        HaxeParser.cast_return cast248 = null;

        HaxeParser.funcLit_return funcLit249 = null;


        Object set245_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 54) ) { return retval; }
            // Haxe.g:346:2: ( ( SUB | SUBSUB | PLUS | PLUSPLUS | BANG | TILDE ) value | newExpr | cast | funcLit )
            int alt59=4;
            switch ( input.LA(1) ) {
            case PLUS:
            case SUB:
            case SUBSUB:
            case PLUSPLUS:
            case BANG:
            case TILDE:
                {
                alt59=1;
                }
                break;
            case NEW:
                {
                alt59=2;
                }
                break;
            case CAST:
                {
                alt59=3;
                }
                break;
            case FUNCTION:
                {
                alt59=4;
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
                    // Haxe.g:346:7: ( SUB | SUBSUB | PLUS | PLUSPLUS | BANG | TILDE ) value
                    {
                    root_0 = (Object)adaptor.nil();

                    set245=(Token)input.LT(1);
                    set245=(Token)input.LT(1);
                    if ( (input.LA(1)>=PLUS && input.LA(1)<=SUB)||(input.LA(1)>=SUBSUB && input.LA(1)<=TILDE) ) {
                        input.consume();
                        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set245), root_0);
                        state.errorRecovery=false;state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_value_in_prefixExpr3054);
                    value246=value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, value246.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:347:4: newExpr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_newExpr_in_prefixExpr3059);
                    newExpr247=newExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, newExpr247.getTree());

                    }
                    break;
                case 3 :
                    // Haxe.g:348:8: cast
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_cast_in_prefixExpr3068);
                    cast248=cast();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, cast248.getTree());

                    }
                    break;
                case 4 :
                    // Haxe.g:349:8: funcLit
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_funcLit_in_prefixExpr3082);
                    funcLit249=funcLit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, funcLit249.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // Haxe.g:352:1: suffixExpr : ( value methodCallOrSliceList -> ^( SUFFIX_EXPR[\"CallOrSlice\",true] ( value )? ( methodCallOrSliceList )? ) | value PLUSPLUS -> ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] ( value )? ( PLUSPLUS )? ) | value SUBSUB -> ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] ( value )? SUBSUB ) );
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


        Object PLUSPLUS253_tree=null;
        Object SUBSUB255_tree=null;
        RewriteRuleTokenStream stream_SUBSUB=new RewriteRuleTokenStream(adaptor,"token SUBSUB");
        RewriteRuleTokenStream stream_PLUSPLUS=new RewriteRuleTokenStream(adaptor,"token PLUSPLUS");
        RewriteRuleSubtreeStream stream_methodCallOrSliceList=new RewriteRuleSubtreeStream(adaptor,"rule methodCallOrSliceList");
        RewriteRuleSubtreeStream stream_value=new RewriteRuleSubtreeStream(adaptor,"rule value");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 55) ) { return retval; }
            // Haxe.g:353:5: ( value methodCallOrSliceList -> ^( SUFFIX_EXPR[\"CallOrSlice\",true] ( value )? ( methodCallOrSliceList )? ) | value PLUSPLUS -> ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] ( value )? ( PLUSPLUS )? ) | value SUBSUB -> ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] ( value )? SUBSUB ) )
            int alt60=3;
            alt60 = dfa60.predict(input);
            switch (alt60) {
                case 1 :
                    // Haxe.g:353:10: value methodCallOrSliceList
                    {
                    pushFollow(FOLLOW_value_in_suffixExpr3104);
                    value250=value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_value.add(value250.getTree());
                    pushFollow(FOLLOW_methodCallOrSliceList_in_suffixExpr3106);
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
                    // 353:38: -> ^( SUFFIX_EXPR[\"CallOrSlice\",true] ( value )? ( methodCallOrSliceList )? )
                    {
                        // Haxe.g:353:41: ^( SUFFIX_EXPR[\"CallOrSlice\",true] ( value )? ( methodCallOrSliceList )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new HaxeTree(SUFFIX_EXPR, "CallOrSlice", true), root_1);

                        // Haxe.g:353:85: ( value )?
                        if ( stream_value.hasNext() ) {
                            adaptor.addChild(root_1, stream_value.nextTree());

                        }
                        stream_value.reset();
                        // Haxe.g:353:92: ( methodCallOrSliceList )?
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
                    // Haxe.g:354:10: value PLUSPLUS
                    {
                    pushFollow(FOLLOW_value_in_suffixExpr3133);
                    value252=value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_value.add(value252.getTree());
                    PLUSPLUS253=(Token)match(input,PLUSPLUS,FOLLOW_PLUSPLUS_in_suffixExpr3135); if (state.failed) return retval; 
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
                    // 354:37: -> ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] ( value )? ( PLUSPLUS )? )
                    {
                        // Haxe.g:354:40: ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] ( value )? ( PLUSPLUS )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new HaxeTree(SUFFIX_EXPR, "SUFFIX_EXPR", true), root_1);

                        // Haxe.g:354:84: ( value )?
                        if ( stream_value.hasNext() ) {
                            adaptor.addChild(root_1, stream_value.nextTree());

                        }
                        stream_value.reset();
                        // Haxe.g:354:91: ( PLUSPLUS )?
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
                    // Haxe.g:355:10: value SUBSUB
                    {
                    pushFollow(FOLLOW_value_in_suffixExpr3174);
                    value254=value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_value.add(value254.getTree());
                    SUBSUB255=(Token)match(input,SUBSUB,FOLLOW_SUBSUB_in_suffixExpr3176); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SUBSUB.add(SUBSUB255);



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
                    // 355:35: -> ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] ( value )? SUBSUB )
                    {
                        // Haxe.g:355:38: ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] ( value )? SUBSUB )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new HaxeTree(SUFFIX_EXPR, "SUFFIX_EXPR", true), root_1);

                        // Haxe.g:355:82: ( value )?
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

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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

    public static class methodCallOrSlice_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "methodCallOrSlice"
    // Haxe.g:358:1: methodCallOrSlice : ( LPAREN exprListOpt RPAREN -> ^( SUFFIX_EXPR[\"MethodCall\",true] ( exprListOpt )? ) | LBRACKET expr RBRACKET -> ^( SUFFIX_EXPR[\"Slice\",true] ( expr )? ) );
    public final HaxeParser.methodCallOrSlice_return methodCallOrSlice() throws RecognitionException {
        HaxeParser.methodCallOrSlice_return retval = new HaxeParser.methodCallOrSlice_return();
        retval.start = input.LT(1);
        int methodCallOrSlice_StartIndex = input.index();
        Object root_0 = null;

        Token LPAREN256=null;
        Token RPAREN258=null;
        Token LBRACKET259=null;
        Token RBRACKET261=null;
        HaxeParser.exprListOpt_return exprListOpt257 = null;

        HaxeParser.expr_return expr260 = null;


        Object LPAREN256_tree=null;
        Object RPAREN258_tree=null;
        Object LBRACKET259_tree=null;
        Object RBRACKET261_tree=null;
        RewriteRuleTokenStream stream_LBRACKET=new RewriteRuleTokenStream(adaptor,"token LBRACKET");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_RBRACKET=new RewriteRuleTokenStream(adaptor,"token RBRACKET");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_exprListOpt=new RewriteRuleSubtreeStream(adaptor,"rule exprListOpt");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 56) ) { return retval; }
            // Haxe.g:359:5: ( LPAREN exprListOpt RPAREN -> ^( SUFFIX_EXPR[\"MethodCall\",true] ( exprListOpt )? ) | LBRACKET expr RBRACKET -> ^( SUFFIX_EXPR[\"Slice\",true] ( expr )? ) )
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==LPAREN) ) {
                alt61=1;
            }
            else if ( (LA61_0==LBRACKET) ) {
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
                    // Haxe.g:359:10: LPAREN exprListOpt RPAREN
                    {
                    LPAREN256=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_methodCallOrSlice3223); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN256);

                    pushFollow(FOLLOW_exprListOpt_in_methodCallOrSlice3225);
                    exprListOpt257=exprListOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_exprListOpt.add(exprListOpt257.getTree());
                    RPAREN258=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_methodCallOrSlice3227); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN258);



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
                    // 359:36: -> ^( SUFFIX_EXPR[\"MethodCall\",true] ( exprListOpt )? )
                    {
                        // Haxe.g:359:39: ^( SUFFIX_EXPR[\"MethodCall\",true] ( exprListOpt )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new HaxeTree(SUFFIX_EXPR, "MethodCall", true), root_1);

                        // Haxe.g:359:82: ( exprListOpt )?
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
                    // Haxe.g:360:10: LBRACKET expr RBRACKET
                    {
                    LBRACKET259=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_methodCallOrSlice3251); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LBRACKET.add(LBRACKET259);

                    pushFollow(FOLLOW_expr_in_methodCallOrSlice3253);
                    expr260=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr260.getTree());
                    RBRACKET261=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_methodCallOrSlice3255); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RBRACKET.add(RBRACKET261);



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
                    // 360:33: -> ^( SUFFIX_EXPR[\"Slice\",true] ( expr )? )
                    {
                        // Haxe.g:360:36: ^( SUFFIX_EXPR[\"Slice\",true] ( expr )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new HaxeTree(SUFFIX_EXPR, "Slice", true), root_1);

                        // Haxe.g:360:74: ( expr )?
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
            if ( state.backtracking>0 ) { memoize(input, 56, methodCallOrSlice_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "methodCallOrSlice"

    public static class methodCallOrSliceList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "methodCallOrSliceList"
    // Haxe.g:363:1: methodCallOrSliceList : ( methodCallOrSlice methodCallOrSliceList | methodCallOrSlice );
    public final HaxeParser.methodCallOrSliceList_return methodCallOrSliceList() throws RecognitionException {
        HaxeParser.methodCallOrSliceList_return retval = new HaxeParser.methodCallOrSliceList_return();
        retval.start = input.LT(1);
        int methodCallOrSliceList_StartIndex = input.index();
        Object root_0 = null;

        HaxeParser.methodCallOrSlice_return methodCallOrSlice262 = null;

        HaxeParser.methodCallOrSliceList_return methodCallOrSliceList263 = null;

        HaxeParser.methodCallOrSlice_return methodCallOrSlice264 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 57) ) { return retval; }
            // Haxe.g:364:5: ( methodCallOrSlice methodCallOrSliceList | methodCallOrSlice )
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==LPAREN) ) {
                int LA62_1 = input.LA(2);

                if ( (synpred111_Haxe()) ) {
                    alt62=1;
                }
                else if ( (true) ) {
                    alt62=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 62, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA62_0==LBRACKET) ) {
                int LA62_2 = input.LA(2);

                if ( (synpred111_Haxe()) ) {
                    alt62=1;
                }
                else if ( (true) ) {
                    alt62=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 62, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }
            switch (alt62) {
                case 1 :
                    // Haxe.g:364:10: methodCallOrSlice methodCallOrSliceList
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_methodCallOrSlice_in_methodCallOrSliceList3288);
                    methodCallOrSlice262=methodCallOrSlice();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, methodCallOrSlice262.getTree());
                    pushFollow(FOLLOW_methodCallOrSliceList_in_methodCallOrSliceList3290);
                    methodCallOrSliceList263=methodCallOrSliceList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, methodCallOrSliceList263.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:365:10: methodCallOrSlice
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_methodCallOrSlice_in_methodCallOrSliceList3301);
                    methodCallOrSlice264=methodCallOrSlice();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, methodCallOrSlice264.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 57, methodCallOrSliceList_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "methodCallOrSliceList"

    public static class value_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "value"
    // Haxe.g:368:1: value : ( objLit | elementarySymbol | LPAREN ( expr | statement ) RPAREN | dotIdent typeParamOpt );
    public final HaxeParser.value_return value() throws RecognitionException {
        HaxeParser.value_return retval = new HaxeParser.value_return();
        retval.start = input.LT(1);
        int value_StartIndex = input.index();
        Object root_0 = null;

        Token LPAREN267=null;
        Token RPAREN270=null;
        HaxeParser.objLit_return objLit265 = null;

        HaxeParser.elementarySymbol_return elementarySymbol266 = null;

        HaxeParser.expr_return expr268 = null;

        HaxeParser.statement_return statement269 = null;

        HaxeParser.dotIdent_return dotIdent271 = null;

        HaxeParser.typeParamOpt_return typeParamOpt272 = null;


        Object LPAREN267_tree=null;
        Object RPAREN270_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 58) ) { return retval; }
            // Haxe.g:371:5: ( objLit | elementarySymbol | LPAREN ( expr | statement ) RPAREN | dotIdent typeParamOpt )
            int alt64=4;
            switch ( input.LA(1) ) {
            case LBRACE:
                {
                alt64=1;
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
                alt64=2;
                }
                break;
            case LPAREN:
                {
                alt64=3;
                }
                break;
            case IDENTIFIER:
            case THIS:
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
                    // Haxe.g:371:9: objLit
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_objLit_in_value3330);
                    objLit265=objLit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, objLit265.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:372:9: elementarySymbol
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_elementarySymbol_in_value3340);
                    elementarySymbol266=elementarySymbol();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, elementarySymbol266.getTree());

                    }
                    break;
                case 3 :
                    // Haxe.g:373:9: LPAREN ( expr | statement ) RPAREN
                    {
                    root_0 = (Object)adaptor.nil();

                    LPAREN267=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_value3350); if (state.failed) return retval;
                    // Haxe.g:373:17: ( expr | statement )
                    int alt63=2;
                    alt63 = dfa63.predict(input);
                    switch (alt63) {
                        case 1 :
                            // Haxe.g:373:18: expr
                            {
                            pushFollow(FOLLOW_expr_in_value3354);
                            expr268=expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr268.getTree());

                            }
                            break;
                        case 2 :
                            // Haxe.g:373:23: statement
                            {
                            pushFollow(FOLLOW_statement_in_value3356);
                            statement269=statement();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, statement269.getTree());

                            }
                            break;

                    }

                    RPAREN270=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_value3359); if (state.failed) return retval;

                    }
                    break;
                case 4 :
                    // Haxe.g:374:9: dotIdent typeParamOpt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_dotIdent_in_value3370);
                    dotIdent271=dotIdent();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dotIdent271.getTree());
                    pushFollow(FOLLOW_typeParamOpt_in_value3372);
                    typeParamOpt272=typeParamOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeParamOpt272.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // Haxe.g:377:1: newExpr : NEW type LPAREN exprListOpt RPAREN -> ^( NEW ( type )? ( exprListOpt )? ) ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 59) ) { return retval; }
            // Haxe.g:378:5: ( NEW type LPAREN exprListOpt RPAREN -> ^( NEW ( type )? ( exprListOpt )? ) )
            // Haxe.g:378:9: NEW type LPAREN exprListOpt RPAREN
            {
            NEW273=(Token)match(input,NEW,FOLLOW_NEW_in_newExpr3402); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_NEW.add(NEW273);

            pushFollow(FOLLOW_type_in_newExpr3404);
            type274=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(type274.getTree());
            LPAREN275=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_newExpr3406); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN275);

            pushFollow(FOLLOW_exprListOpt_in_newExpr3408);
            exprListOpt276=exprListOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_exprListOpt.add(exprListOpt276.getTree());
            RPAREN277=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_newExpr3410); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN277);



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
            // 378:44: -> ^( NEW ( type )? ( exprListOpt )? )
            {
                // Haxe.g:378:47: ^( NEW ( type )? ( exprListOpt )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_NEW.nextNode(), root_1);

                // Haxe.g:378:53: ( type )?
                if ( stream_type.hasNext() ) {
                    adaptor.addChild(root_1, stream_type.nextTree());

                }
                stream_type.reset();
                // Haxe.g:378:59: ( exprListOpt )?
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
    // Haxe.g:381:1: cast : ( CAST LPAREN expr ( COMMA funcType )? RPAREN -> ^( CAST ( expr )? ( funcType )? ) | CAST LPAREN expr RPAREN -> ^( CAST ( expr )? ) );
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 60) ) { return retval; }
            // Haxe.g:381:9: ( CAST LPAREN expr ( COMMA funcType )? RPAREN -> ^( CAST ( expr )? ( funcType )? ) | CAST LPAREN expr RPAREN -> ^( CAST ( expr )? ) )
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==CAST) ) {
                int LA66_1 = input.LA(2);

                if ( (synpred117_Haxe()) ) {
                    alt66=1;
                }
                else if ( (true) ) {
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
                    // Haxe.g:381:13: CAST LPAREN expr ( COMMA funcType )? RPAREN
                    {
                    CAST278=(Token)match(input,CAST,FOLLOW_CAST_in_cast3440); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CAST.add(CAST278);

                    LPAREN279=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_cast3442); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN279);

                    pushFollow(FOLLOW_expr_in_cast3444);
                    expr280=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr280.getTree());
                    // Haxe.g:381:30: ( COMMA funcType )?
                    int alt65=2;
                    int LA65_0 = input.LA(1);

                    if ( (LA65_0==COMMA) ) {
                        alt65=1;
                    }
                    switch (alt65) {
                        case 1 :
                            // Haxe.g:381:31: COMMA funcType
                            {
                            COMMA281=(Token)match(input,COMMA,FOLLOW_COMMA_in_cast3447); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_COMMA.add(COMMA281);

                            pushFollow(FOLLOW_funcType_in_cast3449);
                            funcType282=funcType();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_funcType.add(funcType282.getTree());

                            }
                            break;

                    }

                    RPAREN283=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_cast3453); if (state.failed) return retval; 
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
                    // 381:57: -> ^( CAST ( expr )? ( funcType )? )
                    {
                        // Haxe.g:381:60: ^( CAST ( expr )? ( funcType )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_CAST.nextNode(), root_1);

                        // Haxe.g:381:67: ( expr )?
                        if ( stream_expr.hasNext() ) {
                            adaptor.addChild(root_1, stream_expr.nextTree());

                        }
                        stream_expr.reset();
                        // Haxe.g:381:73: ( funcType )?
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
                    // Haxe.g:382:13: CAST LPAREN expr RPAREN
                    {
                    CAST284=(Token)match(input,CAST,FOLLOW_CAST_in_cast3481); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CAST.add(CAST284);

                    LPAREN285=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_cast3483); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN285);

                    pushFollow(FOLLOW_expr_in_cast3485);
                    expr286=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr286.getTree());
                    RPAREN287=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_cast3487); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN287);



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
                    // 382:57: -> ^( CAST ( expr )? )
                    {
                        // Haxe.g:382:60: ^( CAST ( expr )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_CAST.nextNode(), root_1);

                        // Haxe.g:382:67: ( expr )?
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
    // Haxe.g:388:1: topLevelDecl : ( classDecl | interfaceDecl | enumDecl | typedefDecl );
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 61) ) { return retval; }
            // Haxe.g:389:5: ( classDecl | interfaceDecl | enumDecl | typedefDecl )
            int alt67=4;
            switch ( input.LA(1) ) {
            case MONKEYS_AT:
                {
                int LA67_1 = input.LA(2);

                if ( (synpred118_Haxe()) ) {
                    alt67=1;
                }
                else if ( (synpred119_Haxe()) ) {
                    alt67=2;
                }
                else if ( (synpred120_Haxe()) ) {
                    alt67=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 67, 1, input);

                    throw nvae;
                }
                }
                break;
            case EXTERN:
            case PRIVATE:
                {
                int LA67_2 = input.LA(2);

                if ( (synpred118_Haxe()) ) {
                    alt67=1;
                }
                else if ( (synpred119_Haxe()) ) {
                    alt67=2;
                }
                else if ( (synpred120_Haxe()) ) {
                    alt67=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 67, 2, input);

                    throw nvae;
                }
                }
                break;
            case CLASS:
                {
                alt67=1;
                }
                break;
            case INTERFACE:
                {
                alt67=2;
                }
                break;
            case ENUM:
                {
                alt67=3;
                }
                break;
            case TYPEDEF:
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
                    // Haxe.g:389:9: classDecl
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_classDecl_in_topLevelDecl3552);
                    classDecl288=classDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, classDecl288.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:390:9: interfaceDecl
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_interfaceDecl_in_topLevelDecl3562);
                    interfaceDecl289=interfaceDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceDecl289.getTree());

                    }
                    break;
                case 3 :
                    // Haxe.g:391:9: enumDecl
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_enumDecl_in_topLevelDecl3572);
                    enumDecl290=enumDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, enumDecl290.getTree());

                    }
                    break;
                case 4 :
                    // Haxe.g:392:9: typedefDecl
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_typedefDecl_in_topLevelDecl3582);
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
    // Haxe.g:395:1: enumDecl : typeDeclFlags ENUM IDENTIFIER typeParamOpt enumBody -> ^( IDENTIFIER ( typeParamOpt )? ( enumBody )? ) ;
    public final HaxeParser.enumDecl_return enumDecl() throws RecognitionException {
        HaxeParser.enumDecl_return retval = new HaxeParser.enumDecl_return();
        retval.start = input.LT(1);
        int enumDecl_StartIndex = input.index();
        Object root_0 = null;

        Token ENUM293=null;
        Token IDENTIFIER294=null;
        HaxeParser.typeDeclFlags_return typeDeclFlags292 = null;

        HaxeParser.typeParamOpt_return typeParamOpt295 = null;

        HaxeParser.enumBody_return enumBody296 = null;


        Object ENUM293_tree=null;
        Object IDENTIFIER294_tree=null;
        RewriteRuleTokenStream stream_ENUM=new RewriteRuleTokenStream(adaptor,"token ENUM");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleSubtreeStream stream_typeDeclFlags=new RewriteRuleSubtreeStream(adaptor,"rule typeDeclFlags");
        RewriteRuleSubtreeStream stream_enumBody=new RewriteRuleSubtreeStream(adaptor,"rule enumBody");
        RewriteRuleSubtreeStream stream_typeParamOpt=new RewriteRuleSubtreeStream(adaptor,"rule typeParamOpt");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 62) ) { return retval; }
            // Haxe.g:395:9: ( typeDeclFlags ENUM IDENTIFIER typeParamOpt enumBody -> ^( IDENTIFIER ( typeParamOpt )? ( enumBody )? ) )
            // Haxe.g:395:13: typeDeclFlags ENUM IDENTIFIER typeParamOpt enumBody
            {
            pushFollow(FOLLOW_typeDeclFlags_in_enumDecl3600);
            typeDeclFlags292=typeDeclFlags();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeDeclFlags.add(typeDeclFlags292.getTree());
            ENUM293=(Token)match(input,ENUM,FOLLOW_ENUM_in_enumDecl3602); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ENUM.add(ENUM293);

            IDENTIFIER294=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_enumDecl3604); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER294);

            pushFollow(FOLLOW_typeParamOpt_in_enumDecl3606);
            typeParamOpt295=typeParamOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeParamOpt.add(typeParamOpt295.getTree());
            pushFollow(FOLLOW_enumBody_in_enumDecl3608);
            enumBody296=enumBody();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_enumBody.add(enumBody296.getTree());


            // AST REWRITE
            // elements: enumBody, IDENTIFIER, typeParamOpt
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 395:65: -> ^( IDENTIFIER ( typeParamOpt )? ( enumBody )? )
            {
                // Haxe.g:395:68: ^( IDENTIFIER ( typeParamOpt )? ( enumBody )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new EnumNode(stream_IDENTIFIER.nextToken()), root_1);

                // Haxe.g:395:91: ( typeParamOpt )?
                if ( stream_typeParamOpt.hasNext() ) {
                    adaptor.addChild(root_1, stream_typeParamOpt.nextTree());

                }
                stream_typeParamOpt.reset();
                // Haxe.g:395:105: ( enumBody )?
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
    // Haxe.g:398:1: enumBody : LBRACE ( enumValueDecl )* RBRACE -> ^( BLOCK_SCOPE[\"BLOCK_SCOPE\", true, $LBRACE] ( enumValueDecl )* RBRACE[$RBRACE, true] ) ;
    public final HaxeParser.enumBody_return enumBody() throws RecognitionException {
        HaxeParser.enumBody_return retval = new HaxeParser.enumBody_return();
        retval.start = input.LT(1);
        int enumBody_StartIndex = input.index();
        Object root_0 = null;

        Token LBRACE297=null;
        Token RBRACE299=null;
        HaxeParser.enumValueDecl_return enumValueDecl298 = null;


        Object LBRACE297_tree=null;
        Object RBRACE299_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_enumValueDecl=new RewriteRuleSubtreeStream(adaptor,"rule enumValueDecl");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 63) ) { return retval; }
            // Haxe.g:398:9: ( LBRACE ( enumValueDecl )* RBRACE -> ^( BLOCK_SCOPE[\"BLOCK_SCOPE\", true, $LBRACE] ( enumValueDecl )* RBRACE[$RBRACE, true] ) )
            // Haxe.g:398:13: LBRACE ( enumValueDecl )* RBRACE
            {
            LBRACE297=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_enumBody3641); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACE.add(LBRACE297);

            // Haxe.g:398:20: ( enumValueDecl )*
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( (LA68_0==IDENTIFIER) ) {
                    alt68=1;
                }


                switch (alt68) {
            	case 1 :
            	    // Haxe.g:398:21: enumValueDecl
            	    {
            	    pushFollow(FOLLOW_enumValueDecl_in_enumBody3644);
            	    enumValueDecl298=enumValueDecl();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_enumValueDecl.add(enumValueDecl298.getTree());

            	    }
            	    break;

            	default :
            	    break loop68;
                }
            } while (true);

            RBRACE299=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_enumBody3648); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACE.add(RBRACE299);



            // AST REWRITE
            // elements: RBRACE, enumValueDecl
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 399:13: -> ^( BLOCK_SCOPE[\"BLOCK_SCOPE\", true, $LBRACE] ( enumValueDecl )* RBRACE[$RBRACE, true] )
            {
                // Haxe.g:399:16: ^( BLOCK_SCOPE[\"BLOCK_SCOPE\", true, $LBRACE] ( enumValueDecl )* RBRACE[$RBRACE, true] )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new BlockScopeNode(BLOCK_SCOPE, "BLOCK_SCOPE", true, LBRACE297), root_1);

                // Haxe.g:399:76: ( enumValueDecl )*
                while ( stream_enumValueDecl.hasNext() ) {
                    adaptor.addChild(root_1, stream_enumValueDecl.nextTree());

                }
                stream_enumValueDecl.reset();
                adaptor.addChild(root_1, new HaxeTree(RBRACE, RBRACE299, true));

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
    // Haxe.g:402:1: enumValueDecl : ( IDENTIFIER LPAREN paramList RPAREN SEMI -> ^( IDENTIFIER[$IDENTIFIER] ( IDENTIFIER )? ( paramList )? ) | IDENTIFIER SEMI -> ^( IDENTIFIER[$IDENTIFIER] ( IDENTIFIER )? ) );
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 64) ) { return retval; }
            // Haxe.g:403:5: ( IDENTIFIER LPAREN paramList RPAREN SEMI -> ^( IDENTIFIER[$IDENTIFIER] ( IDENTIFIER )? ( paramList )? ) | IDENTIFIER SEMI -> ^( IDENTIFIER[$IDENTIFIER] ( IDENTIFIER )? ) )
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==IDENTIFIER) ) {
                int LA69_1 = input.LA(2);

                if ( (LA69_1==LPAREN) ) {
                    alt69=1;
                }
                else if ( (LA69_1==SEMI) ) {
                    alt69=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 69, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;
            }
            switch (alt69) {
                case 1 :
                    // Haxe.g:403:9: IDENTIFIER LPAREN paramList RPAREN SEMI
                    {
                    IDENTIFIER300=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_enumValueDecl3707); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER300);

                    LPAREN301=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_enumValueDecl3709); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN301);

                    pushFollow(FOLLOW_paramList_in_enumValueDecl3711);
                    paramList302=paramList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_paramList.add(paramList302.getTree());
                    RPAREN303=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_enumValueDecl3713); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN303);

                    SEMI304=(Token)match(input,SEMI,FOLLOW_SEMI_in_enumValueDecl3715); if (state.failed) return retval; 
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
                    // 403:49: -> ^( IDENTIFIER[$IDENTIFIER] ( IDENTIFIER )? ( paramList )? )
                    {
                        // Haxe.g:403:52: ^( IDENTIFIER[$IDENTIFIER] ( IDENTIFIER )? ( paramList )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new VarDeclarationNode(IDENTIFIER, IDENTIFIER300), root_1);

                        // Haxe.g:403:98: ( IDENTIFIER )?
                        if ( stream_IDENTIFIER.hasNext() ) {
                            adaptor.addChild(root_1, new VarUsageNode(stream_IDENTIFIER.nextToken()));

                        }
                        stream_IDENTIFIER.reset();
                        // Haxe.g:403:124: ( paramList )?
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
                    // Haxe.g:404:9: IDENTIFIER SEMI
                    {
                    IDENTIFIER305=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_enumValueDecl3749); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER305);

                    SEMI306=(Token)match(input,SEMI,FOLLOW_SEMI_in_enumValueDecl3751); if (state.failed) return retval; 
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
                    // 404:49: -> ^( IDENTIFIER[$IDENTIFIER] ( IDENTIFIER )? )
                    {
                        // Haxe.g:404:52: ^( IDENTIFIER[$IDENTIFIER] ( IDENTIFIER )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new VarDeclarationNode(IDENTIFIER, IDENTIFIER305), root_1);

                        // Haxe.g:404:98: ( IDENTIFIER )?
                        if ( stream_IDENTIFIER.hasNext() ) {
                            adaptor.addChild(root_1, new VarUsageNode(stream_IDENTIFIER.nextToken()));

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
    // Haxe.g:408:1: varDeclList : varDecl varDeclList ;
    public final HaxeParser.varDeclList_return varDeclList() throws RecognitionException {
        HaxeParser.varDeclList_return retval = new HaxeParser.varDeclList_return();
        retval.start = input.LT(1);
        int varDeclList_StartIndex = input.index();
        Object root_0 = null;

        HaxeParser.varDecl_return varDecl307 = null;

        HaxeParser.varDeclList_return varDeclList308 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 65) ) { return retval; }
            // Haxe.g:409:5: ( varDecl varDeclList )
            // Haxe.g:409:9: varDecl varDeclList
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_varDecl_in_varDeclList3811);
            varDecl307=varDecl();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, varDecl307.getTree());
            pushFollow(FOLLOW_varDeclList_in_varDeclList3813);
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
    // Haxe.g:412:1: varDecl : ( declAttrList )? VAR varDeclPartList SEMI -> ^( VAR[$VAR] ( declAttrList )? ( varDeclPartList )? ) ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 66) ) { return retval; }
            // Haxe.g:412:9: ( ( declAttrList )? VAR varDeclPartList SEMI -> ^( VAR[$VAR] ( declAttrList )? ( varDeclPartList )? ) )
            // Haxe.g:412:13: ( declAttrList )? VAR varDeclPartList SEMI
            {
            // Haxe.g:412:13: ( declAttrList )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==PRIVATE||(LA70_0>=PUBLIC && LA70_0<=OVERRIDE)) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // Haxe.g:412:14: declAttrList
                    {
                    pushFollow(FOLLOW_declAttrList_in_varDecl3829);
                    declAttrList309=declAttrList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declAttrList.add(declAttrList309.getTree());

                    }
                    break;

            }

            VAR310=(Token)match(input,VAR,FOLLOW_VAR_in_varDecl3833); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_VAR.add(VAR310);

            pushFollow(FOLLOW_varDeclPartList_in_varDecl3835);
            varDeclPartList311=varDeclPartList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_varDeclPartList.add(varDeclPartList311.getTree());
            SEMI312=(Token)match(input,SEMI,FOLLOW_SEMI_in_varDecl3837); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SEMI.add(SEMI312);



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
            // 412:54: -> ^( VAR[$VAR] ( declAttrList )? ( varDeclPartList )? )
            {
                // Haxe.g:412:57: ^( VAR[$VAR] ( declAttrList )? ( varDeclPartList )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new VarDeclarationNode(VAR, VAR310), root_1);

                // Haxe.g:412:89: ( declAttrList )?
                if ( stream_declAttrList.hasNext() ) {
                    adaptor.addChild(root_1, stream_declAttrList.nextTree());

                }
                stream_declAttrList.reset();
                // Haxe.g:412:103: ( varDeclPartList )?
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
    // Haxe.g:415:1: varDeclPartList : varDeclPart ( COMMA varDeclPart )* ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 67) ) { return retval; }
            // Haxe.g:416:5: ( varDeclPart ( COMMA varDeclPart )* )
            // Haxe.g:416:9: varDeclPart ( COMMA varDeclPart )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_varDeclPart_in_varDeclPartList3883);
            varDeclPart313=varDeclPart();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclPart313.getTree());
            // Haxe.g:416:21: ( COMMA varDeclPart )*
            loop71:
            do {
                int alt71=2;
                int LA71_0 = input.LA(1);

                if ( (LA71_0==COMMA) ) {
                    alt71=1;
                }


                switch (alt71) {
            	case 1 :
            	    // Haxe.g:416:22: COMMA varDeclPart
            	    {
            	    COMMA314=(Token)match(input,COMMA,FOLLOW_COMMA_in_varDeclPartList3886); if (state.failed) return retval;
            	    pushFollow(FOLLOW_varDeclPart_in_varDeclPartList3889);
            	    varDeclPart315=varDeclPart();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclPart315.getTree());

            	    }
            	    break;

            	default :
            	    break loop71;
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
    // Haxe.g:419:1: varDeclPart : IDENTIFIER propDeclOpt typeTagOpt varInit ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 68) ) { return retval; }
            // Haxe.g:420:5: ( IDENTIFIER propDeclOpt typeTagOpt varInit )
            // Haxe.g:420:9: IDENTIFIER propDeclOpt typeTagOpt varInit
            {
            root_0 = (Object)adaptor.nil();

            IDENTIFIER316=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_varDeclPart3910); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER316_tree = new VarUsageNode(IDENTIFIER316) ;
            adaptor.addChild(root_0, IDENTIFIER316_tree);
            }
            pushFollow(FOLLOW_propDeclOpt_in_varDeclPart3915);
            propDeclOpt317=propDeclOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, propDeclOpt317.getTree());
            pushFollow(FOLLOW_typeTagOpt_in_varDeclPart3917);
            typeTagOpt318=typeTagOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, typeTagOpt318.getTree());
            pushFollow(FOLLOW_varInit_in_varDeclPart3919);
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
    // Haxe.g:423:1: propDecl : LPAREN a1= propAccessor COMMA a2= propAccessor RPAREN -> ^( PROPERTY_DECL[\"PROPERTY_DECL\",true] ( $a1)? ( $a2)? ) ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 69) ) { return retval; }
            // Haxe.g:423:9: ( LPAREN a1= propAccessor COMMA a2= propAccessor RPAREN -> ^( PROPERTY_DECL[\"PROPERTY_DECL\",true] ( $a1)? ( $a2)? ) )
            // Haxe.g:423:13: LPAREN a1= propAccessor COMMA a2= propAccessor RPAREN
            {
            LPAREN320=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_propDecl3933); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN320);

            pushFollow(FOLLOW_propAccessor_in_propDecl3937);
            a1=propAccessor();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_propAccessor.add(a1.getTree());
            COMMA321=(Token)match(input,COMMA,FOLLOW_COMMA_in_propDecl3939); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COMMA.add(COMMA321);

            pushFollow(FOLLOW_propAccessor_in_propDecl3943);
            a2=propAccessor();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_propAccessor.add(a2.getTree());
            RPAREN322=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_propDecl3945); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN322);



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
            // 423:65: -> ^( PROPERTY_DECL[\"PROPERTY_DECL\",true] ( $a1)? ( $a2)? )
            {
                // Haxe.g:423:68: ^( PROPERTY_DECL[\"PROPERTY_DECL\",true] ( $a1)? ( $a2)? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new HaxeTree(PROPERTY_DECL, "PROPERTY_DECL", true), root_1);

                // Haxe.g:423:116: ( $a1)?
                if ( stream_a1.hasNext() ) {
                    adaptor.addChild(root_1, stream_a1.nextTree());

                }
                stream_a1.reset();
                // Haxe.g:423:121: ( $a2)?
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
    // Haxe.g:426:1: propAccessor : ( IDENTIFIER | NULL | DEFAULT | DYNAMIC );
    public final HaxeParser.propAccessor_return propAccessor() throws RecognitionException {
        HaxeParser.propAccessor_return retval = new HaxeParser.propAccessor_return();
        retval.start = input.LT(1);
        int propAccessor_StartIndex = input.index();
        Object root_0 = null;

        Token set323=null;

        Object set323_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 70) ) { return retval; }
            // Haxe.g:427:9: ( IDENTIFIER | NULL | DEFAULT | DYNAMIC )
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
    // Haxe.g:433:1: propDeclOpt : ( propDecl | );
    public final HaxeParser.propDeclOpt_return propDeclOpt() throws RecognitionException {
        HaxeParser.propDeclOpt_return retval = new HaxeParser.propDeclOpt_return();
        retval.start = input.LT(1);
        int propDeclOpt_StartIndex = input.index();
        Object root_0 = null;

        HaxeParser.propDecl_return propDecl324 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 71) ) { return retval; }
            // Haxe.g:434:5: ( propDecl | )
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==LPAREN) ) {
                alt72=1;
            }
            else if ( (LA72_0==EOF||LA72_0==SEMI||LA72_0==RPAREN||LA72_0==COLON||LA72_0==COMMA||LA72_0==EQ||LA72_0==LBRACE) ) {
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
                    // Haxe.g:434:9: propDecl
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_propDecl_in_propDeclOpt4065);
                    propDecl324=propDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, propDecl324.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:436:5: 
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
    // Haxe.g:438:1: varInit : ( EQ expr -> ^( VAR_INIT[\"VAR_INIT\",true] ( expr )? ) | );
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 72) ) { return retval; }
            // Haxe.g:438:9: ( EQ expr -> ^( VAR_INIT[\"VAR_INIT\",true] ( expr )? ) | )
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==EQ) ) {
                alt73=1;
            }
            else if ( (LA73_0==EOF||LA73_0==SEMI||LA73_0==RPAREN||LA73_0==COMMA) ) {
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
                    // Haxe.g:438:13: EQ expr
                    {
                    EQ325=(Token)match(input,EQ,FOLLOW_EQ_in_varInit4090); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EQ.add(EQ325);

                    pushFollow(FOLLOW_expr_in_varInit4092);
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
                    // 438:21: -> ^( VAR_INIT[\"VAR_INIT\",true] ( expr )? )
                    {
                        // Haxe.g:438:24: ^( VAR_INIT[\"VAR_INIT\",true] ( expr )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new HaxeTree(VAR_INIT, "VAR_INIT", true), root_1);

                        // Haxe.g:438:62: ( expr )?
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
                    // Haxe.g:440:9: 
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
    // Haxe.g:442:1: funcDecl : ( ( declAttrList )? FUNCTION NEW LPAREN paramList RPAREN typeTagOpt block -> ^( FUNCTION NEW ( declAttrList )? ( paramList )? ( typeTagOpt )? ( block )? ) | ( declAttrList )? FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt block -> ^( FUNCTION IDENTIFIER ( declAttrList )? ( paramList )? ( typeTagOpt )? ( block )? ( typeParamOpt )? ) );
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 73) ) { return retval; }
            // Haxe.g:442:9: ( ( declAttrList )? FUNCTION NEW LPAREN paramList RPAREN typeTagOpt block -> ^( FUNCTION NEW ( declAttrList )? ( paramList )? ( typeTagOpt )? ( block )? ) | ( declAttrList )? FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt block -> ^( FUNCTION IDENTIFIER ( declAttrList )? ( paramList )? ( typeTagOpt )? ( block )? ( typeParamOpt )? ) )
            int alt76=2;
            alt76 = dfa76.predict(input);
            switch (alt76) {
                case 1 :
                    // Haxe.g:442:13: ( declAttrList )? FUNCTION NEW LPAREN paramList RPAREN typeTagOpt block
                    {
                    // Haxe.g:442:13: ( declAttrList )?
                    int alt74=2;
                    int LA74_0 = input.LA(1);

                    if ( (LA74_0==PRIVATE||(LA74_0>=PUBLIC && LA74_0<=OVERRIDE)) ) {
                        alt74=1;
                    }
                    switch (alt74) {
                        case 1 :
                            // Haxe.g:0:0: declAttrList
                            {
                            pushFollow(FOLLOW_declAttrList_in_funcDecl4140);
                            declAttrList327=declAttrList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_declAttrList.add(declAttrList327.getTree());

                            }
                            break;

                    }

                    FUNCTION328=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcDecl4143); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION328);

                    NEW329=(Token)match(input,NEW,FOLLOW_NEW_in_funcDecl4145); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEW.add(NEW329);

                    LPAREN330=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcDecl4147); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN330);

                    pushFollow(FOLLOW_paramList_in_funcDecl4149);
                    paramList331=paramList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_paramList.add(paramList331.getTree());
                    RPAREN332=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcDecl4151); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN332);

                    pushFollow(FOLLOW_typeTagOpt_in_funcDecl4153);
                    typeTagOpt333=typeTagOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeTagOpt.add(typeTagOpt333.getTree());
                    pushFollow(FOLLOW_block_in_funcDecl4155);
                    block334=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block334.getTree());


                    // AST REWRITE
                    // elements: FUNCTION, block, NEW, declAttrList, paramList, typeTagOpt
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 443:17: -> ^( FUNCTION NEW ( declAttrList )? ( paramList )? ( typeTagOpt )? ( block )? )
                    {
                        // Haxe.g:443:20: ^( FUNCTION NEW ( declAttrList )? ( paramList )? ( typeTagOpt )? ( block )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new FunctionNode(stream_FUNCTION.nextToken()), root_1);

                        adaptor.addChild(root_1, stream_NEW.nextNode());
                        // Haxe.g:443:49: ( declAttrList )?
                        if ( stream_declAttrList.hasNext() ) {
                            adaptor.addChild(root_1, stream_declAttrList.nextTree());

                        }
                        stream_declAttrList.reset();
                        // Haxe.g:443:63: ( paramList )?
                        if ( stream_paramList.hasNext() ) {
                            adaptor.addChild(root_1, stream_paramList.nextTree());

                        }
                        stream_paramList.reset();
                        // Haxe.g:443:74: ( typeTagOpt )?
                        if ( stream_typeTagOpt.hasNext() ) {
                            adaptor.addChild(root_1, stream_typeTagOpt.nextTree());

                        }
                        stream_typeTagOpt.reset();
                        // Haxe.g:443:86: ( block )?
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
                    // Haxe.g:444:13: ( declAttrList )? FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt block
                    {
                    // Haxe.g:444:13: ( declAttrList )?
                    int alt75=2;
                    int LA75_0 = input.LA(1);

                    if ( (LA75_0==PRIVATE||(LA75_0>=PUBLIC && LA75_0<=OVERRIDE)) ) {
                        alt75=1;
                    }
                    switch (alt75) {
                        case 1 :
                            // Haxe.g:0:0: declAttrList
                            {
                            pushFollow(FOLLOW_declAttrList_in_funcDecl4210);
                            declAttrList335=declAttrList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_declAttrList.add(declAttrList335.getTree());

                            }
                            break;

                    }

                    FUNCTION336=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcDecl4213); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION336);

                    IDENTIFIER337=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_funcDecl4215); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER337);

                    pushFollow(FOLLOW_typeParamOpt_in_funcDecl4217);
                    typeParamOpt338=typeParamOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeParamOpt.add(typeParamOpt338.getTree());
                    LPAREN339=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcDecl4219); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN339);

                    pushFollow(FOLLOW_paramList_in_funcDecl4221);
                    paramList340=paramList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_paramList.add(paramList340.getTree());
                    RPAREN341=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcDecl4223); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN341);

                    pushFollow(FOLLOW_typeTagOpt_in_funcDecl4225);
                    typeTagOpt342=typeTagOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeTagOpt.add(typeTagOpt342.getTree());
                    pushFollow(FOLLOW_block_in_funcDecl4227);
                    block343=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block343.getTree());


                    // AST REWRITE
                    // elements: typeParamOpt, block, FUNCTION, typeTagOpt, declAttrList, IDENTIFIER, paramList
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 445:17: -> ^( FUNCTION IDENTIFIER ( declAttrList )? ( paramList )? ( typeTagOpt )? ( block )? ( typeParamOpt )? )
                    {
                        // Haxe.g:445:20: ^( FUNCTION IDENTIFIER ( declAttrList )? ( paramList )? ( typeTagOpt )? ( block )? ( typeParamOpt )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new FunctionNode(stream_FUNCTION.nextToken()), root_1);

                        adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
                        // Haxe.g:445:56: ( declAttrList )?
                        if ( stream_declAttrList.hasNext() ) {
                            adaptor.addChild(root_1, stream_declAttrList.nextTree());

                        }
                        stream_declAttrList.reset();
                        // Haxe.g:445:70: ( paramList )?
                        if ( stream_paramList.hasNext() ) {
                            adaptor.addChild(root_1, stream_paramList.nextTree());

                        }
                        stream_paramList.reset();
                        // Haxe.g:445:81: ( typeTagOpt )?
                        if ( stream_typeTagOpt.hasNext() ) {
                            adaptor.addChild(root_1, stream_typeTagOpt.nextTree());

                        }
                        stream_typeTagOpt.reset();
                        // Haxe.g:445:93: ( block )?
                        if ( stream_block.hasNext() ) {
                            adaptor.addChild(root_1, stream_block.nextTree());

                        }
                        stream_block.reset();
                        // Haxe.g:445:100: ( typeParamOpt )?
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
    // Haxe.g:448:1: funcProtoDecl : ( declAttrList FUNCTION NEW LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTagOpt )? ( declAttrList )? ) | declAttrList FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTagOpt )? ( declAttrList )? ( typeParamOpt )? ) | FUNCTION NEW LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTagOpt )? ) | FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTagOpt )? ( typeParamOpt )? ) );
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 74) ) { return retval; }
            // Haxe.g:449:5: ( declAttrList FUNCTION NEW LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTagOpt )? ( declAttrList )? ) | declAttrList FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTagOpt )? ( declAttrList )? ( typeParamOpt )? ) | FUNCTION NEW LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTagOpt )? ) | FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTagOpt )? ( typeParamOpt )? ) )
            int alt77=4;
            alt77 = dfa77.predict(input);
            switch (alt77) {
                case 1 :
                    // Haxe.g:449:9: declAttrList FUNCTION NEW LPAREN paramList RPAREN typeTagOpt SEMI
                    {
                    pushFollow(FOLLOW_declAttrList_in_funcProtoDecl4297);
                    declAttrList344=declAttrList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declAttrList.add(declAttrList344.getTree());
                    FUNCTION345=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcProtoDecl4299); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION345);

                    NEW346=(Token)match(input,NEW,FOLLOW_NEW_in_funcProtoDecl4301); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEW.add(NEW346);

                    LPAREN347=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcProtoDecl4303); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN347);

                    pushFollow(FOLLOW_paramList_in_funcProtoDecl4305);
                    paramList348=paramList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_paramList.add(paramList348.getTree());
                    RPAREN349=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcProtoDecl4307); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN349);

                    pushFollow(FOLLOW_typeTagOpt_in_funcProtoDecl4309);
                    typeTagOpt350=typeTagOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeTagOpt.add(typeTagOpt350.getTree());
                    SEMI351=(Token)match(input,SEMI,FOLLOW_SEMI_in_funcProtoDecl4311); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI351);



                    // AST REWRITE
                    // elements: NEW, FUNCTION, typeTagOpt, paramList, declAttrList
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 450:13: -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTagOpt )? ( declAttrList )? )
                    {
                        // Haxe.g:450:16: ^( FUNCTION ( NEW )? ( paramList )? ( typeTagOpt )? ( declAttrList )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_FUNCTION.nextNode(), root_1);

                        // Haxe.g:450:27: ( NEW )?
                        if ( stream_NEW.hasNext() ) {
                            adaptor.addChild(root_1, stream_NEW.nextNode());

                        }
                        stream_NEW.reset();
                        // Haxe.g:450:32: ( paramList )?
                        if ( stream_paramList.hasNext() ) {
                            adaptor.addChild(root_1, stream_paramList.nextTree());

                        }
                        stream_paramList.reset();
                        // Haxe.g:450:43: ( typeTagOpt )?
                        if ( stream_typeTagOpt.hasNext() ) {
                            adaptor.addChild(root_1, stream_typeTagOpt.nextTree());

                        }
                        stream_typeTagOpt.reset();
                        // Haxe.g:450:55: ( declAttrList )?
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
                    // Haxe.g:451:9: declAttrList FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt SEMI
                    {
                    pushFollow(FOLLOW_declAttrList_in_funcProtoDecl4352);
                    declAttrList352=declAttrList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declAttrList.add(declAttrList352.getTree());
                    FUNCTION353=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcProtoDecl4354); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION353);

                    IDENTIFIER354=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_funcProtoDecl4356); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER354);

                    pushFollow(FOLLOW_typeParamOpt_in_funcProtoDecl4358);
                    typeParamOpt355=typeParamOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeParamOpt.add(typeParamOpt355.getTree());
                    LPAREN356=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcProtoDecl4360); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN356);

                    pushFollow(FOLLOW_paramList_in_funcProtoDecl4362);
                    paramList357=paramList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_paramList.add(paramList357.getTree());
                    RPAREN358=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcProtoDecl4364); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN358);

                    pushFollow(FOLLOW_typeTagOpt_in_funcProtoDecl4366);
                    typeTagOpt359=typeTagOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeTagOpt.add(typeTagOpt359.getTree());
                    SEMI360=(Token)match(input,SEMI,FOLLOW_SEMI_in_funcProtoDecl4368); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI360);



                    // AST REWRITE
                    // elements: paramList, IDENTIFIER, FUNCTION, typeParamOpt, typeTagOpt, declAttrList
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 452:13: -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTagOpt )? ( declAttrList )? ( typeParamOpt )? )
                    {
                        // Haxe.g:452:16: ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTagOpt )? ( declAttrList )? ( typeParamOpt )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_FUNCTION.nextNode(), root_1);

                        // Haxe.g:452:27: ( IDENTIFIER )?
                        if ( stream_IDENTIFIER.hasNext() ) {
                            adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());

                        }
                        stream_IDENTIFIER.reset();
                        // Haxe.g:452:39: ( paramList )?
                        if ( stream_paramList.hasNext() ) {
                            adaptor.addChild(root_1, stream_paramList.nextTree());

                        }
                        stream_paramList.reset();
                        // Haxe.g:452:50: ( typeTagOpt )?
                        if ( stream_typeTagOpt.hasNext() ) {
                            adaptor.addChild(root_1, stream_typeTagOpt.nextTree());

                        }
                        stream_typeTagOpt.reset();
                        // Haxe.g:452:62: ( declAttrList )?
                        if ( stream_declAttrList.hasNext() ) {
                            adaptor.addChild(root_1, stream_declAttrList.nextTree());

                        }
                        stream_declAttrList.reset();
                        // Haxe.g:452:76: ( typeParamOpt )?
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
                    // Haxe.g:453:9: FUNCTION NEW LPAREN paramList RPAREN typeTagOpt SEMI
                    {
                    FUNCTION361=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcProtoDecl4412); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION361);

                    NEW362=(Token)match(input,NEW,FOLLOW_NEW_in_funcProtoDecl4414); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEW.add(NEW362);

                    LPAREN363=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcProtoDecl4416); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN363);

                    pushFollow(FOLLOW_paramList_in_funcProtoDecl4418);
                    paramList364=paramList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_paramList.add(paramList364.getTree());
                    RPAREN365=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcProtoDecl4420); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN365);

                    pushFollow(FOLLOW_typeTagOpt_in_funcProtoDecl4422);
                    typeTagOpt366=typeTagOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeTagOpt.add(typeTagOpt366.getTree());
                    SEMI367=(Token)match(input,SEMI,FOLLOW_SEMI_in_funcProtoDecl4424); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI367);



                    // AST REWRITE
                    // elements: NEW, paramList, FUNCTION, typeTagOpt
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 454:13: -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTagOpt )? )
                    {
                        // Haxe.g:454:16: ^( FUNCTION ( NEW )? ( paramList )? ( typeTagOpt )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_FUNCTION.nextNode(), root_1);

                        // Haxe.g:454:27: ( NEW )?
                        if ( stream_NEW.hasNext() ) {
                            adaptor.addChild(root_1, stream_NEW.nextNode());

                        }
                        stream_NEW.reset();
                        // Haxe.g:454:32: ( paramList )?
                        if ( stream_paramList.hasNext() ) {
                            adaptor.addChild(root_1, stream_paramList.nextTree());

                        }
                        stream_paramList.reset();
                        // Haxe.g:454:43: ( typeTagOpt )?
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
                    // Haxe.g:455:9: FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt SEMI
                    {
                    FUNCTION368=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcProtoDecl4462); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION368);

                    IDENTIFIER369=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_funcProtoDecl4464); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER369);

                    pushFollow(FOLLOW_typeParamOpt_in_funcProtoDecl4466);
                    typeParamOpt370=typeParamOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeParamOpt.add(typeParamOpt370.getTree());
                    LPAREN371=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcProtoDecl4468); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN371);

                    pushFollow(FOLLOW_paramList_in_funcProtoDecl4470);
                    paramList372=paramList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_paramList.add(paramList372.getTree());
                    RPAREN373=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcProtoDecl4472); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN373);

                    pushFollow(FOLLOW_typeTagOpt_in_funcProtoDecl4474);
                    typeTagOpt374=typeTagOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeTagOpt.add(typeTagOpt374.getTree());
                    SEMI375=(Token)match(input,SEMI,FOLLOW_SEMI_in_funcProtoDecl4476); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI375);



                    // AST REWRITE
                    // elements: typeParamOpt, IDENTIFIER, typeTagOpt, FUNCTION, paramList
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 456:13: -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTagOpt )? ( typeParamOpt )? )
                    {
                        // Haxe.g:456:16: ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTagOpt )? ( typeParamOpt )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_FUNCTION.nextNode(), root_1);

                        // Haxe.g:456:27: ( IDENTIFIER )?
                        if ( stream_IDENTIFIER.hasNext() ) {
                            adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());

                        }
                        stream_IDENTIFIER.reset();
                        // Haxe.g:456:39: ( paramList )?
                        if ( stream_paramList.hasNext() ) {
                            adaptor.addChild(root_1, stream_paramList.nextTree());

                        }
                        stream_paramList.reset();
                        // Haxe.g:456:50: ( typeTagOpt )?
                        if ( stream_typeTagOpt.hasNext() ) {
                            adaptor.addChild(root_1, stream_typeTagOpt.nextTree());

                        }
                        stream_typeTagOpt.reset();
                        // Haxe.g:456:62: ( typeParamOpt )?
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
    // Haxe.g:459:1: classDecl : typeDeclFlags CLASS IDENTIFIER typeParamOpt inheritListOpt classBodyScope -> ^( IDENTIFIER ( typeDeclFlags )? ( typeParamOpt )? ( inheritListOpt )? ( classBodyScope )? ) ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 75) ) { return retval; }
            // Haxe.g:460:5: ( typeDeclFlags CLASS IDENTIFIER typeParamOpt inheritListOpt classBodyScope -> ^( IDENTIFIER ( typeDeclFlags )? ( typeParamOpt )? ( inheritListOpt )? ( classBodyScope )? ) )
            // Haxe.g:460:9: typeDeclFlags CLASS IDENTIFIER typeParamOpt inheritListOpt classBodyScope
            {
            pushFollow(FOLLOW_typeDeclFlags_in_classDecl4530);
            typeDeclFlags376=typeDeclFlags();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeDeclFlags.add(typeDeclFlags376.getTree());
            CLASS377=(Token)match(input,CLASS,FOLLOW_CLASS_in_classDecl4532); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CLASS.add(CLASS377);

            IDENTIFIER378=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_classDecl4534); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER378);

            pushFollow(FOLLOW_typeParamOpt_in_classDecl4536);
            typeParamOpt379=typeParamOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeParamOpt.add(typeParamOpt379.getTree());
            pushFollow(FOLLOW_inheritListOpt_in_classDecl4538);
            inheritListOpt380=inheritListOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_inheritListOpt.add(inheritListOpt380.getTree());
            pushFollow(FOLLOW_classBodyScope_in_classDecl4540);
            classBodyScope381=classBodyScope();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_classBodyScope.add(classBodyScope381.getTree());


            // AST REWRITE
            // elements: typeParamOpt, typeDeclFlags, classBodyScope, IDENTIFIER, inheritListOpt
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 461:13: -> ^( IDENTIFIER ( typeDeclFlags )? ( typeParamOpt )? ( inheritListOpt )? ( classBodyScope )? )
            {
                // Haxe.g:461:16: ^( IDENTIFIER ( typeDeclFlags )? ( typeParamOpt )? ( inheritListOpt )? ( classBodyScope )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new ClassNode(stream_IDENTIFIER.nextToken()), root_1);

                // Haxe.g:461:40: ( typeDeclFlags )?
                if ( stream_typeDeclFlags.hasNext() ) {
                    adaptor.addChild(root_1, stream_typeDeclFlags.nextTree());

                }
                stream_typeDeclFlags.reset();
                // Haxe.g:461:55: ( typeParamOpt )?
                if ( stream_typeParamOpt.hasNext() ) {
                    adaptor.addChild(root_1, stream_typeParamOpt.nextTree());

                }
                stream_typeParamOpt.reset();
                // Haxe.g:461:69: ( inheritListOpt )?
                if ( stream_inheritListOpt.hasNext() ) {
                    adaptor.addChild(root_1, stream_inheritListOpt.nextTree());

                }
                stream_inheritListOpt.reset();
                // Haxe.g:461:85: ( classBodyScope )?
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
            if ( state.backtracking>0 ) { memoize(input, 75, classDecl_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "classDecl"

    public static class classBodyScope_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "classBodyScope"
    // Haxe.g:464:1: classBodyScope : LBRACE ( classMember )* RBRACE -> ^( BLOCK_SCOPE[\"BLOCK_SCOPE\", true, $LBRACE] ( classMember )* RBRACE[$RBRACE, true] ) ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 76) ) { return retval; }
            // Haxe.g:465:5: ( LBRACE ( classMember )* RBRACE -> ^( BLOCK_SCOPE[\"BLOCK_SCOPE\", true, $LBRACE] ( classMember )* RBRACE[$RBRACE, true] ) )
            // Haxe.g:465:9: LBRACE ( classMember )* RBRACE
            {
            LBRACE382=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_classBodyScope4596); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACE.add(LBRACE382);

            // Haxe.g:465:16: ( classMember )*
            loop78:
            do {
                int alt78=2;
                int LA78_0 = input.LA(1);

                if ( (LA78_0==MONKEYS_AT||(LA78_0>=EXTERN && LA78_0<=PRIVATE)||(LA78_0>=PUBLIC && LA78_0<=OVERRIDE)||LA78_0==FUNCTION||(LA78_0>=ENUM && LA78_0<=VAR)||(LA78_0>=CLASS && LA78_0<=INTERFACE)) ) {
                    alt78=1;
                }


                switch (alt78) {
            	case 1 :
            	    // Haxe.g:465:17: classMember
            	    {
            	    pushFollow(FOLLOW_classMember_in_classBodyScope4599);
            	    classMember383=classMember();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_classMember.add(classMember383.getTree());

            	    }
            	    break;

            	default :
            	    break loop78;
                }
            } while (true);

            RBRACE384=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_classBodyScope4603); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACE.add(RBRACE384);



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
            // 465:38: -> ^( BLOCK_SCOPE[\"BLOCK_SCOPE\", true, $LBRACE] ( classMember )* RBRACE[$RBRACE, true] )
            {
                // Haxe.g:465:41: ^( BLOCK_SCOPE[\"BLOCK_SCOPE\", true, $LBRACE] ( classMember )* RBRACE[$RBRACE, true] )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new BlockScopeNode(BLOCK_SCOPE, "BLOCK_SCOPE", true, LBRACE382), root_1);

                // Haxe.g:465:101: ( classMember )*
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
            if ( state.backtracking>0 ) { memoize(input, 76, classBodyScope_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "classBodyScope"

    public static class classMember_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "classMember"
    // Haxe.g:468:1: classMember : ( varDecl | funcDecl | enumDecl );
    public final HaxeParser.classMember_return classMember() throws RecognitionException {
        HaxeParser.classMember_return retval = new HaxeParser.classMember_return();
        retval.start = input.LT(1);
        int classMember_StartIndex = input.index();
        Object root_0 = null;

        HaxeParser.varDecl_return varDecl385 = null;

        HaxeParser.funcDecl_return funcDecl386 = null;

        HaxeParser.enumDecl_return enumDecl387 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 77) ) { return retval; }
            // Haxe.g:469:5: ( varDecl | funcDecl | enumDecl )
            int alt79=3;
            alt79 = dfa79.predict(input);
            switch (alt79) {
                case 1 :
                    // Haxe.g:469:9: varDecl
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_varDecl_in_classMember4641);
                    varDecl385=varDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDecl385.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:470:9: funcDecl
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_funcDecl_in_classMember4652);
                    funcDecl386=funcDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, funcDecl386.getTree());

                    }
                    break;
                case 3 :
                    // Haxe.g:472:9: enumDecl
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_enumDecl_in_classMember4664);
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
            if ( state.backtracking>0 ) { memoize(input, 77, classMember_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "classMember"

    public static class interfaceDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "interfaceDecl"
    // Haxe.g:475:1: interfaceDecl : typeDeclFlags INTERFACE type inheritListOpt LBRACE interfaceBody RBRACE ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 78) ) { return retval; }
            // Haxe.g:476:5: ( typeDeclFlags INTERFACE type inheritListOpt LBRACE interfaceBody RBRACE )
            // Haxe.g:476:9: typeDeclFlags INTERFACE type inheritListOpt LBRACE interfaceBody RBRACE
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_typeDeclFlags_in_interfaceDecl4693);
            typeDeclFlags388=typeDeclFlags();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, typeDeclFlags388.getTree());
            INTERFACE389=(Token)match(input,INTERFACE,FOLLOW_INTERFACE_in_interfaceDecl4695); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            INTERFACE389_tree = (Object)adaptor.create(INTERFACE389);
            adaptor.addChild(root_0, INTERFACE389_tree);
            }
            pushFollow(FOLLOW_type_in_interfaceDecl4697);
            type390=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type390.getTree());
            pushFollow(FOLLOW_inheritListOpt_in_interfaceDecl4699);
            inheritListOpt391=inheritListOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, inheritListOpt391.getTree());
            LBRACE392=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_interfaceDecl4701); if (state.failed) return retval;
            pushFollow(FOLLOW_interfaceBody_in_interfaceDecl4704);
            interfaceBody393=interfaceBody();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceBody393.getTree());
            RBRACE394=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_interfaceDecl4706); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // Haxe.g:479:1: interfaceBody : ( varDecl interfaceBody | funcProtoDecl interfaceBody | );
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 79) ) { return retval; }
            // Haxe.g:480:5: ( varDecl interfaceBody | funcProtoDecl interfaceBody | )
            int alt80=3;
            alt80 = dfa80.predict(input);
            switch (alt80) {
                case 1 :
                    // Haxe.g:480:9: varDecl interfaceBody
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_varDecl_in_interfaceBody4730);
                    varDecl395=varDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDecl395.getTree());
                    pushFollow(FOLLOW_interfaceBody_in_interfaceBody4732);
                    interfaceBody396=interfaceBody();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceBody396.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:481:9: funcProtoDecl interfaceBody
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_funcProtoDecl_in_interfaceBody4742);
                    funcProtoDecl397=funcProtoDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, funcProtoDecl397.getTree());
                    pushFollow(FOLLOW_interfaceBody_in_interfaceBody4744);
                    interfaceBody398=interfaceBody();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceBody398.getTree());

                    }
                    break;
                case 3 :
                    // Haxe.g:484:5: 
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
    // Haxe.g:486:1: inheritList : inherit ( COMMA inherit )* ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 80) ) { return retval; }
            // Haxe.g:487:5: ( inherit ( COMMA inherit )* )
            // Haxe.g:487:10: inherit ( COMMA inherit )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_inherit_in_inheritList4778);
            inherit399=inherit();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, inherit399.getTree());
            // Haxe.g:487:18: ( COMMA inherit )*
            loop81:
            do {
                int alt81=2;
                int LA81_0 = input.LA(1);

                if ( (LA81_0==COMMA) ) {
                    alt81=1;
                }


                switch (alt81) {
            	case 1 :
            	    // Haxe.g:487:19: COMMA inherit
            	    {
            	    COMMA400=(Token)match(input,COMMA,FOLLOW_COMMA_in_inheritList4781); if (state.failed) return retval;
            	    pushFollow(FOLLOW_inherit_in_inheritList4784);
            	    inherit401=inherit();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, inherit401.getTree());

            	    }
            	    break;

            	default :
            	    break loop81;
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
    // Haxe.g:490:1: inheritListOpt : ( inheritList -> ^( INHERIT_LIST_OPT[\"INHERIT_LIST_OPT\",true] ( inheritList )? ) | );
    public final HaxeParser.inheritListOpt_return inheritListOpt() throws RecognitionException {
        HaxeParser.inheritListOpt_return retval = new HaxeParser.inheritListOpt_return();
        retval.start = input.LT(1);
        int inheritListOpt_StartIndex = input.index();
        Object root_0 = null;

        HaxeParser.inheritList_return inheritList402 = null;


        RewriteRuleSubtreeStream stream_inheritList=new RewriteRuleSubtreeStream(adaptor,"rule inheritList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 81) ) { return retval; }
            // Haxe.g:491:5: ( inheritList -> ^( INHERIT_LIST_OPT[\"INHERIT_LIST_OPT\",true] ( inheritList )? ) | )
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( ((LA82_0>=EXTENDS && LA82_0<=IMPLEMENTS)) ) {
                alt82=1;
            }
            else if ( (LA82_0==LBRACE) ) {
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
                    // Haxe.g:491:10: inheritList
                    {
                    pushFollow(FOLLOW_inheritList_in_inheritListOpt4814);
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
                    // 491:22: -> ^( INHERIT_LIST_OPT[\"INHERIT_LIST_OPT\",true] ( inheritList )? )
                    {
                        // Haxe.g:491:25: ^( INHERIT_LIST_OPT[\"INHERIT_LIST_OPT\",true] ( inheritList )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new HaxeTree(INHERIT_LIST_OPT, "INHERIT_LIST_OPT", true), root_1);

                        // Haxe.g:491:79: ( inheritList )?
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
                    // Haxe.g:493:5: 
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
    // Haxe.g:495:1: inherit : ( EXTENDS type -> ^( EXTENDS ( type )? ) | IMPLEMENTS type -> ^( IMPLEMENTS ( type )? ) );
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 82) ) { return retval; }
            // Haxe.g:495:12: ( EXTENDS type -> ^( EXTENDS ( type )? ) | IMPLEMENTS type -> ^( IMPLEMENTS ( type )? ) )
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==EXTENDS) ) {
                alt83=1;
            }
            else if ( (LA83_0==IMPLEMENTS) ) {
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
                    // Haxe.g:495:17: EXTENDS type
                    {
                    EXTENDS403=(Token)match(input,EXTENDS,FOLLOW_EXTENDS_in_inherit4860); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EXTENDS.add(EXTENDS403);

                    pushFollow(FOLLOW_type_in_inherit4862);
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
                    // 495:34: -> ^( EXTENDS ( type )? )
                    {
                        // Haxe.g:495:37: ^( EXTENDS ( type )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_EXTENDS.nextNode(), root_1);

                        // Haxe.g:495:47: ( type )?
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
                    // Haxe.g:496:14: IMPLEMENTS type
                    {
                    IMPLEMENTS405=(Token)match(input,IMPLEMENTS,FOLLOW_IMPLEMENTS_in_inherit4890); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IMPLEMENTS.add(IMPLEMENTS405);

                    pushFollow(FOLLOW_type_in_inherit4892);
                    type406=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type406.getTree());


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
                    // 496:30: -> ^( IMPLEMENTS ( type )? )
                    {
                        // Haxe.g:496:33: ^( IMPLEMENTS ( type )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_IMPLEMENTS.nextNode(), root_1);

                        // Haxe.g:496:46: ( type )?
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
    // Haxe.g:499:1: typedefDecl : TYPEDEF IDENTIFIER EQ funcType ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 83) ) { return retval; }
            // Haxe.g:500:5: ( TYPEDEF IDENTIFIER EQ funcType )
            // Haxe.g:500:10: TYPEDEF IDENTIFIER EQ funcType
            {
            root_0 = (Object)adaptor.nil();

            TYPEDEF407=(Token)match(input,TYPEDEF,FOLLOW_TYPEDEF_in_typedefDecl4932); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TYPEDEF407_tree = (Object)adaptor.create(TYPEDEF407);
            adaptor.addChild(root_0, TYPEDEF407_tree);
            }
            IDENTIFIER408=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_typedefDecl4934); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER408_tree = (Object)adaptor.create(IDENTIFIER408);
            adaptor.addChild(root_0, IDENTIFIER408_tree);
            }
            EQ409=(Token)match(input,EQ,FOLLOW_EQ_in_typedefDecl4936); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            EQ409_tree = (Object)adaptor.create(EQ409);
            adaptor.addChild(root_0, EQ409_tree);
            }
            pushFollow(FOLLOW_funcType_in_typedefDecl4938);
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
    // Haxe.g:503:1: typeExtend : GT funcType COMMA ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 84) ) { return retval; }
            // Haxe.g:504:5: ( GT funcType COMMA )
            // Haxe.g:504:10: GT funcType COMMA
            {
            root_0 = (Object)adaptor.nil();

            GT411=(Token)match(input,GT,FOLLOW_GT_in_typeExtend4962); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            GT411_tree = (Object)adaptor.create(GT411);
            adaptor.addChild(root_0, GT411_tree);
            }
            pushFollow(FOLLOW_funcType_in_typeExtend4964);
            funcType412=funcType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, funcType412.getTree());
            COMMA413=(Token)match(input,COMMA,FOLLOW_COMMA_in_typeExtend4966); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // Haxe.g:507:1: anonType : LBRACE ( | anonTypeFieldList | varDeclList | typeExtend ( | anonTypeFieldList | varDeclList ) ) RBRACE ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 85) ) { return retval; }
            // Haxe.g:508:5: ( LBRACE ( | anonTypeFieldList | varDeclList | typeExtend ( | anonTypeFieldList | varDeclList ) ) RBRACE )
            // Haxe.g:508:9: LBRACE ( | anonTypeFieldList | varDeclList | typeExtend ( | anonTypeFieldList | varDeclList ) ) RBRACE
            {
            root_0 = (Object)adaptor.nil();

            LBRACE414=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_anonType4990); if (state.failed) return retval;
            // Haxe.g:509:13: ( | anonTypeFieldList | varDeclList | typeExtend ( | anonTypeFieldList | varDeclList ) )
            int alt85=4;
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
            case GT:
                {
                alt85=4;
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
                    // Haxe.g:510:13: 
                    {
                    }
                    break;
                case 2 :
                    // Haxe.g:510:17: anonTypeFieldList
                    {
                    pushFollow(FOLLOW_anonTypeFieldList_in_anonType5024);
                    anonTypeFieldList415=anonTypeFieldList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, anonTypeFieldList415.getTree());

                    }
                    break;
                case 3 :
                    // Haxe.g:511:17: varDeclList
                    {
                    pushFollow(FOLLOW_varDeclList_in_anonType5043);
                    varDeclList416=varDeclList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclList416.getTree());

                    }
                    break;
                case 4 :
                    // Haxe.g:512:17: typeExtend ( | anonTypeFieldList | varDeclList )
                    {
                    pushFollow(FOLLOW_typeExtend_in_anonType5062);
                    typeExtend417=typeExtend();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeExtend417.getTree());
                    // Haxe.g:512:28: ( | anonTypeFieldList | varDeclList )
                    int alt84=3;
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
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 84, 0, input);

                        throw nvae;
                    }

                    switch (alt84) {
                        case 1 :
                            // Haxe.g:513:25: 
                            {
                            }
                            break;
                        case 2 :
                            // Haxe.g:513:29: anonTypeFieldList
                            {
                            pushFollow(FOLLOW_anonTypeFieldList_in_anonType5094);
                            anonTypeFieldList418=anonTypeFieldList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, anonTypeFieldList418.getTree());

                            }
                            break;
                        case 3 :
                            // Haxe.g:514:29: varDeclList
                            {
                            pushFollow(FOLLOW_varDeclList_in_anonType5124);
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

            RBRACE420=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_anonType5151); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // Haxe.g:519:1: anonTypeFieldList : anonTypeField ( COMMA anonTypeField )* ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 86) ) { return retval; }
            // Haxe.g:520:5: ( anonTypeField ( COMMA anonTypeField )* )
            // Haxe.g:520:10: anonTypeField ( COMMA anonTypeField )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_anonTypeField_in_anonTypeFieldList5177);
            anonTypeField421=anonTypeField();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, anonTypeField421.getTree());
            // Haxe.g:520:24: ( COMMA anonTypeField )*
            loop86:
            do {
                int alt86=2;
                int LA86_0 = input.LA(1);

                if ( (LA86_0==COMMA) ) {
                    alt86=1;
                }


                switch (alt86) {
            	case 1 :
            	    // Haxe.g:520:25: COMMA anonTypeField
            	    {
            	    COMMA422=(Token)match(input,COMMA,FOLLOW_COMMA_in_anonTypeFieldList5180); if (state.failed) return retval;
            	    pushFollow(FOLLOW_anonTypeField_in_anonTypeFieldList5183);
            	    anonTypeField423=anonTypeField();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, anonTypeField423.getTree());

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
    // Haxe.g:523:1: objLit : '{' objLitElemList '}' ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 87) ) { return retval; }
            // Haxe.g:523:9: ( '{' objLitElemList '}' )
            // Haxe.g:523:11: '{' objLitElemList '}'
            {
            root_0 = (Object)adaptor.nil();

            char_literal424=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_objLit5199); if (state.failed) return retval;
            pushFollow(FOLLOW_objLitElemList_in_objLit5202);
            objLitElemList425=objLitElemList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, objLitElemList425.getTree());
            char_literal426=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_objLit5204); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // Haxe.g:526:1: anonTypeField : IDENTIFIER COLON funcType ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 88) ) { return retval; }
            // Haxe.g:527:5: ( IDENTIFIER COLON funcType )
            // Haxe.g:527:10: IDENTIFIER COLON funcType
            {
            root_0 = (Object)adaptor.nil();

            IDENTIFIER427=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_anonTypeField5229); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER427_tree = (Object)adaptor.create(IDENTIFIER427);
            adaptor.addChild(root_0, IDENTIFIER427_tree);
            }
            COLON428=(Token)match(input,COLON,FOLLOW_COLON_in_anonTypeField5231); if (state.failed) return retval;
            pushFollow(FOLLOW_funcType_in_anonTypeField5234);
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
    // Haxe.g:530:1: objLitElemList : objLitElem ( COMMA objLitElem )* ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 89) ) { return retval; }
            // Haxe.g:531:5: ( objLitElem ( COMMA objLitElem )* )
            // Haxe.g:531:10: objLitElem ( COMMA objLitElem )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_objLitElem_in_objLitElemList5262);
            objLitElem430=objLitElem();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, objLitElem430.getTree());
            // Haxe.g:531:21: ( COMMA objLitElem )*
            loop87:
            do {
                int alt87=2;
                int LA87_0 = input.LA(1);

                if ( (LA87_0==COMMA) ) {
                    alt87=1;
                }


                switch (alt87) {
            	case 1 :
            	    // Haxe.g:531:22: COMMA objLitElem
            	    {
            	    COMMA431=(Token)match(input,COMMA,FOLLOW_COMMA_in_objLitElemList5265); if (state.failed) return retval;
            	    pushFollow(FOLLOW_objLitElem_in_objLitElemList5268);
            	    objLitElem432=objLitElem();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, objLitElem432.getTree());

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
    // Haxe.g:534:1: objLitElem : IDENTIFIER COLON expr ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 90) ) { return retval; }
            // Haxe.g:535:5: ( IDENTIFIER COLON expr )
            // Haxe.g:535:10: IDENTIFIER COLON expr
            {
            root_0 = (Object)adaptor.nil();

            IDENTIFIER433=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_objLitElem5294); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER433_tree = (Object)adaptor.create(IDENTIFIER433);
            adaptor.addChild(root_0, IDENTIFIER433_tree);
            }
            COLON434=(Token)match(input,COLON,FOLLOW_COLON_in_objLitElem5296); if (state.failed) return retval;
            pushFollow(FOLLOW_expr_in_objLitElem5299);
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
    // Haxe.g:538:1: elementarySymbol : ( LONGLITERAL -> LONGLITERAL[$LONGLITERAL, \"INT\"] | NULL -> ^( NULL[$NULL,\"Unknown<0>\"] ) | INTLITERAL -> INTLITERAL[$INTLITERAL, \"INT\"] | STRINGLITERAL -> STRINGLITERAL[$STRINGLITERAL,\"STRING\"] | CHARLITERAL -> CHARLITERAL[$CHARLITERAL, \"STRING\"] | FLOATNUM -> FLOATNUM[$FLOATNUM, \"FLOAT\"] | TRUE -> TRUE[$TRUE,\"BOOL\"] | FALSE -> FALSE[$FALSE,\"BOOL\"] );
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 91) ) { return retval; }
            // Haxe.g:539:5: ( LONGLITERAL -> LONGLITERAL[$LONGLITERAL, \"INT\"] | NULL -> ^( NULL[$NULL,\"Unknown<0>\"] ) | INTLITERAL -> INTLITERAL[$INTLITERAL, \"INT\"] | STRINGLITERAL -> STRINGLITERAL[$STRINGLITERAL,\"STRING\"] | CHARLITERAL -> CHARLITERAL[$CHARLITERAL, \"STRING\"] | FLOATNUM -> FLOATNUM[$FLOATNUM, \"FLOAT\"] | TRUE -> TRUE[$TRUE,\"BOOL\"] | FALSE -> FALSE[$FALSE,\"BOOL\"] )
            int alt88=8;
            switch ( input.LA(1) ) {
            case LONGLITERAL:
                {
                alt88=1;
                }
                break;
            case NULL:
                {
                alt88=2;
                }
                break;
            case INTLITERAL:
                {
                alt88=3;
                }
                break;
            case STRINGLITERAL:
                {
                alt88=4;
                }
                break;
            case CHARLITERAL:
                {
                alt88=5;
                }
                break;
            case FLOATNUM:
                {
                alt88=6;
                }
                break;
            case TRUE:
                {
                alt88=7;
                }
                break;
            case FALSE:
                {
                alt88=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 88, 0, input);

                throw nvae;
            }

            switch (alt88) {
                case 1 :
                    // Haxe.g:539:9: LONGLITERAL
                    {
                    LONGLITERAL436=(Token)match(input,LONGLITERAL,FOLLOW_LONGLITERAL_in_elementarySymbol5322); if (state.failed) return retval; 
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
                    // 539:24: -> LONGLITERAL[$LONGLITERAL, \"INT\"]
                    {
                        adaptor.addChild(root_0, new ConstantNode(LONGLITERAL, LONGLITERAL436, "INT"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // Haxe.g:540:9: NULL
                    {
                    NULL437=(Token)match(input,NULL,FOLLOW_NULL_in_elementarySymbol5343); if (state.failed) return retval; 
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
                    // 540:14: -> ^( NULL[$NULL,\"Unknown<0>\"] )
                    {
                        // Haxe.g:540:17: ^( NULL[$NULL,\"Unknown<0>\"] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new ConstantNode(NULL, NULL437, "Unknown<0>"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // Haxe.g:541:9: INTLITERAL
                    {
                    INTLITERAL438=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_elementarySymbol5363); if (state.failed) return retval; 
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
                    // 541:23: -> INTLITERAL[$INTLITERAL, \"INT\"]
                    {
                        adaptor.addChild(root_0, new ConstantNode(INTLITERAL, INTLITERAL438, "INT"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // Haxe.g:542:9: STRINGLITERAL
                    {
                    STRINGLITERAL439=(Token)match(input,STRINGLITERAL,FOLLOW_STRINGLITERAL_in_elementarySymbol5384); if (state.failed) return retval; 
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
                    // 542:26: -> STRINGLITERAL[$STRINGLITERAL,\"STRING\"]
                    {
                        adaptor.addChild(root_0, new ConstantNode(STRINGLITERAL, STRINGLITERAL439, "STRING"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // Haxe.g:543:9: CHARLITERAL
                    {
                    CHARLITERAL440=(Token)match(input,CHARLITERAL,FOLLOW_CHARLITERAL_in_elementarySymbol5405); if (state.failed) return retval; 
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
                    // 543:24: -> CHARLITERAL[$CHARLITERAL, \"STRING\"]
                    {
                        adaptor.addChild(root_0, new ConstantNode(CHARLITERAL, CHARLITERAL440, "STRING"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    // Haxe.g:544:9: FLOATNUM
                    {
                    FLOATNUM441=(Token)match(input,FLOATNUM,FOLLOW_FLOATNUM_in_elementarySymbol5426); if (state.failed) return retval; 
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
                    // 544:21: -> FLOATNUM[$FLOATNUM, \"FLOAT\"]
                    {
                        adaptor.addChild(root_0, new ConstantNode(FLOATNUM, FLOATNUM441, "FLOAT"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 7 :
                    // Haxe.g:545:9: TRUE
                    {
                    TRUE442=(Token)match(input,TRUE,FOLLOW_TRUE_in_elementarySymbol5447); if (state.failed) return retval; 
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
                    // 545:21: -> TRUE[$TRUE,\"BOOL\"]
                    {
                        adaptor.addChild(root_0, new ConstantNode(TRUE, TRUE442, "BOOL"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 8 :
                    // Haxe.g:546:9: FALSE
                    {
                    FALSE443=(Token)match(input,FALSE,FOLLOW_FALSE_in_elementarySymbol5472); if (state.failed) return retval; 
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
                    // 546:22: -> FALSE[$FALSE,\"BOOL\"]
                    {
                        adaptor.addChild(root_0, new ConstantNode(FALSE, FALSE443, "BOOL"));

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
            if ( state.backtracking>0 ) { memoize(input, 91, elementarySymbol_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "elementarySymbol"

    // $ANTLR start synpred28_Haxe
    public final void synpred28_Haxe_fragment() throws RecognitionException {   
        // Haxe.g:151:44: ( typeTagOpt )
        // Haxe.g:151:44: typeTagOpt
        {
        pushFollow(FOLLOW_typeTagOpt_in_synpred28_Haxe939);
        typeTagOpt();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred28_Haxe

    // $ANTLR start synpred34_Haxe
    public final void synpred34_Haxe_fragment() throws RecognitionException {   
        // Haxe.g:195:10: ( ( type ) ( MINUS_BIGGER type )* )
        // Haxe.g:195:10: ( type ) ( MINUS_BIGGER type )*
        {
        // Haxe.g:195:10: ( type )
        // Haxe.g:195:11: type
        {
        pushFollow(FOLLOW_type_in_synpred34_Haxe1144);
        type();

        state._fsp--;
        if (state.failed) return ;

        }

        // Haxe.g:195:17: ( MINUS_BIGGER type )*
        loop91:
        do {
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==MINUS_BIGGER) ) {
                alt91=1;
            }


            switch (alt91) {
        	case 1 :
        	    // Haxe.g:195:18: MINUS_BIGGER type
        	    {
        	    match(input,MINUS_BIGGER,FOLLOW_MINUS_BIGGER_in_synpred34_Haxe1148); if (state.failed) return ;
        	    pushFollow(FOLLOW_type_in_synpred34_Haxe1151);
        	    type();

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
    // $ANTLR end synpred34_Haxe

    // $ANTLR start synpred41_Haxe
    public final void synpred41_Haxe_fragment() throws RecognitionException {   
        // Haxe.g:203:57: ( typeParam )
        // Haxe.g:203:57: typeParam
        {
        pushFollow(FOLLOW_typeParam_in_synpred41_Haxe1240);
        typeParam();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred41_Haxe

    // $ANTLR start synpred42_Haxe
    public final void synpred42_Haxe_fragment() throws RecognitionException {   
        // Haxe.g:203:14: ( ( anonType | dotIdent | primitiveType ) ( typeParam )* )
        // Haxe.g:203:14: ( anonType | dotIdent | primitiveType ) ( typeParam )*
        {
        // Haxe.g:203:14: ( anonType | dotIdent | primitiveType )
        int alt92=3;
        switch ( input.LA(1) ) {
        case LBRACE:
            {
            alt92=1;
            }
            break;
        case IDENTIFIER:
        case THIS:
            {
            alt92=2;
            }
            break;
        case DYNAMIC:
        case VOID:
        case INT:
        case FLOAT:
        case BOOLEAN:
            {
            alt92=3;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 92, 0, input);

            throw nvae;
        }

        switch (alt92) {
            case 1 :
                // Haxe.g:203:15: anonType
                {
                pushFollow(FOLLOW_anonType_in_synpred42_Haxe1224);
                anonType();

                state._fsp--;
                if (state.failed) return ;

                }
                break;
            case 2 :
                // Haxe.g:203:27: dotIdent
                {
                pushFollow(FOLLOW_dotIdent_in_synpred42_Haxe1229);
                dotIdent();

                state._fsp--;
                if (state.failed) return ;

                }
                break;
            case 3 :
                // Haxe.g:203:39: primitiveType
                {
                pushFollow(FOLLOW_primitiveType_in_synpred42_Haxe1234);
                primitiveType();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }

        // Haxe.g:203:56: ( typeParam )*
        loop93:
        do {
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==LT) ) {
                alt93=1;
            }


            switch (alt93) {
        	case 1 :
        	    // Haxe.g:203:57: typeParam
        	    {
        	    pushFollow(FOLLOW_typeParam_in_synpred42_Haxe1240);
        	    typeParam();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop93;
            }
        } while (true);


        }
    }
    // $ANTLR end synpred42_Haxe

    // $ANTLR start synpred43_Haxe
    public final void synpred43_Haxe_fragment() throws RecognitionException {   
        // Haxe.g:208:10: ( LT typeList GT )
        // Haxe.g:208:10: LT typeList GT
        {
        match(input,LT,FOLLOW_LT_in_synpred43_Haxe1288); if (state.failed) return ;
        pushFollow(FOLLOW_typeList_in_synpred43_Haxe1291);
        typeList();

        state._fsp--;
        if (state.failed) return ;
        match(input,GT,FOLLOW_GT_in_synpred43_Haxe1293); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred43_Haxe

    // $ANTLR start synpred44_Haxe
    public final void synpred44_Haxe_fragment() throws RecognitionException {   
        // Haxe.g:209:10: ( LT typeList LT typeList GTGT )
        // Haxe.g:209:10: LT typeList LT typeList GTGT
        {
        match(input,LT,FOLLOW_LT_in_synpred44_Haxe1305); if (state.failed) return ;
        pushFollow(FOLLOW_typeList_in_synpred44_Haxe1308);
        typeList();

        state._fsp--;
        if (state.failed) return ;
        match(input,LT,FOLLOW_LT_in_synpred44_Haxe1310); if (state.failed) return ;
        pushFollow(FOLLOW_typeList_in_synpred44_Haxe1313);
        typeList();

        state._fsp--;
        if (state.failed) return ;
        match(input,GTGT,FOLLOW_GTGT_in_synpred44_Haxe1315); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred44_Haxe

    // $ANTLR start synpred45_Haxe
    public final void synpred45_Haxe_fragment() throws RecognitionException {   
        // Haxe.g:215:10: ( typeParam )
        // Haxe.g:215:10: typeParam
        {
        pushFollow(FOLLOW_typeParam_in_synpred45_Haxe1374);
        typeParam();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred45_Haxe

    // $ANTLR start synpred47_Haxe
    public final void synpred47_Haxe_fragment() throws RecognitionException {   
        // Haxe.g:229:10: ( block )
        // Haxe.g:229:10: block
        {
        pushFollow(FOLLOW_block_in_synpred47_Haxe1533);
        block();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred47_Haxe

    // $ANTLR start synpred48_Haxe
    public final void synpred48_Haxe_fragment() throws RecognitionException {   
        // Haxe.g:230:10: ( assignExpr SEMI )
        // Haxe.g:230:10: assignExpr SEMI
        {
        pushFollow(FOLLOW_assignExpr_in_synpred48_Haxe1544);
        assignExpr();

        state._fsp--;
        if (state.failed) return ;
        match(input,SEMI,FOLLOW_SEMI_in_synpred48_Haxe1546); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred48_Haxe

    // $ANTLR start synpred50_Haxe
    public final void synpred50_Haxe_fragment() throws RecognitionException {   
        HaxeParser.statement_return st2 = null;


        // Haxe.g:232:42: ( ELSE st2= statement )
        // Haxe.g:232:42: ELSE st2= statement
        {
        match(input,ELSE,FOLLOW_ELSE_in_synpred50_Haxe1578); if (state.failed) return ;
        pushFollow(FOLLOW_statement_in_synpred50_Haxe1582);
        st2=statement();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred50_Haxe

    // $ANTLR start synpred65_Haxe
    public final void synpred65_Haxe_fragment() throws RecognitionException {   
        // Haxe.g:242:10: ( expr SEMI )
        // Haxe.g:242:10: expr SEMI
        {
        pushFollow(FOLLOW_expr_in_synpred65_Haxe2043);
        expr();

        state._fsp--;
        if (state.failed) return ;
        match(input,SEMI,FOLLOW_SEMI_in_synpred65_Haxe2046); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred65_Haxe

    // $ANTLR start synpred66_Haxe
    public final void synpred66_Haxe_fragment() throws RecognitionException {   
        // Haxe.g:243:10: ( IDENTIFIER COLON statement )
        // Haxe.g:243:10: IDENTIFIER COLON statement
        {
        match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_synpred66_Haxe2058); if (state.failed) return ;
        match(input,COLON,FOLLOW_COLON_in_synpred66_Haxe2060); if (state.failed) return ;
        pushFollow(FOLLOW_statement_in_synpred66_Haxe2062);
        statement();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred66_Haxe

    // $ANTLR start synpred69_Haxe
    public final void synpred69_Haxe_fragment() throws RecognitionException {   
        // Haxe.g:256:10: ( varDecl )
        // Haxe.g:256:10: varDecl
        {
        pushFollow(FOLLOW_varDecl_in_synpred69_Haxe2220);
        varDecl();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred69_Haxe

    // $ANTLR start synpred70_Haxe
    public final void synpred70_Haxe_fragment() throws RecognitionException {   
        // Haxe.g:257:10: ( classDecl )
        // Haxe.g:257:10: classDecl
        {
        pushFollow(FOLLOW_classDecl_in_synpred70_Haxe2231);
        classDecl();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred70_Haxe

    // $ANTLR start synpred99_Haxe
    public final void synpred99_Haxe_fragment() throws RecognitionException {   
        // Haxe.g:341:8: ( suffixExpr )
        // Haxe.g:341:8: suffixExpr
        {
        pushFollow(FOLLOW_suffixExpr_in_synpred99_Haxe3007);
        suffixExpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred99_Haxe

    // $ANTLR start synpred108_Haxe
    public final void synpred108_Haxe_fragment() throws RecognitionException {   
        // Haxe.g:353:10: ( value methodCallOrSliceList )
        // Haxe.g:353:10: value methodCallOrSliceList
        {
        pushFollow(FOLLOW_value_in_synpred108_Haxe3104);
        value();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_methodCallOrSliceList_in_synpred108_Haxe3106);
        methodCallOrSliceList();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred108_Haxe

    // $ANTLR start synpred109_Haxe
    public final void synpred109_Haxe_fragment() throws RecognitionException {   
        // Haxe.g:354:10: ( value PLUSPLUS )
        // Haxe.g:354:10: value PLUSPLUS
        {
        pushFollow(FOLLOW_value_in_synpred109_Haxe3133);
        value();

        state._fsp--;
        if (state.failed) return ;
        match(input,PLUSPLUS,FOLLOW_PLUSPLUS_in_synpred109_Haxe3135); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred109_Haxe

    // $ANTLR start synpred111_Haxe
    public final void synpred111_Haxe_fragment() throws RecognitionException {   
        // Haxe.g:364:10: ( methodCallOrSlice methodCallOrSliceList )
        // Haxe.g:364:10: methodCallOrSlice methodCallOrSliceList
        {
        pushFollow(FOLLOW_methodCallOrSlice_in_synpred111_Haxe3288);
        methodCallOrSlice();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_methodCallOrSliceList_in_synpred111_Haxe3290);
        methodCallOrSliceList();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred111_Haxe

    // $ANTLR start synpred114_Haxe
    public final void synpred114_Haxe_fragment() throws RecognitionException {   
        // Haxe.g:373:18: ( expr )
        // Haxe.g:373:18: expr
        {
        pushFollow(FOLLOW_expr_in_synpred114_Haxe3354);
        expr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred114_Haxe

    // $ANTLR start synpred117_Haxe
    public final void synpred117_Haxe_fragment() throws RecognitionException {   
        // Haxe.g:381:13: ( CAST LPAREN expr ( COMMA funcType )? RPAREN )
        // Haxe.g:381:13: CAST LPAREN expr ( COMMA funcType )? RPAREN
        {
        match(input,CAST,FOLLOW_CAST_in_synpred117_Haxe3440); if (state.failed) return ;
        match(input,LPAREN,FOLLOW_LPAREN_in_synpred117_Haxe3442); if (state.failed) return ;
        pushFollow(FOLLOW_expr_in_synpred117_Haxe3444);
        expr();

        state._fsp--;
        if (state.failed) return ;
        // Haxe.g:381:30: ( COMMA funcType )?
        int alt101=2;
        int LA101_0 = input.LA(1);

        if ( (LA101_0==COMMA) ) {
            alt101=1;
        }
        switch (alt101) {
            case 1 :
                // Haxe.g:381:31: COMMA funcType
                {
                match(input,COMMA,FOLLOW_COMMA_in_synpred117_Haxe3447); if (state.failed) return ;
                pushFollow(FOLLOW_funcType_in_synpred117_Haxe3449);
                funcType();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }

        match(input,RPAREN,FOLLOW_RPAREN_in_synpred117_Haxe3453); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred117_Haxe

    // $ANTLR start synpred118_Haxe
    public final void synpred118_Haxe_fragment() throws RecognitionException {   
        // Haxe.g:389:9: ( classDecl )
        // Haxe.g:389:9: classDecl
        {
        pushFollow(FOLLOW_classDecl_in_synpred118_Haxe3552);
        classDecl();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred118_Haxe

    // $ANTLR start synpred119_Haxe
    public final void synpred119_Haxe_fragment() throws RecognitionException {   
        // Haxe.g:390:9: ( interfaceDecl )
        // Haxe.g:390:9: interfaceDecl
        {
        pushFollow(FOLLOW_interfaceDecl_in_synpred119_Haxe3562);
        interfaceDecl();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred119_Haxe

    // $ANTLR start synpred120_Haxe
    public final void synpred120_Haxe_fragment() throws RecognitionException {   
        // Haxe.g:391:9: ( enumDecl )
        // Haxe.g:391:9: enumDecl
        {
        pushFollow(FOLLOW_enumDecl_in_synpred120_Haxe3572);
        enumDecl();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred120_Haxe

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
    public final boolean synpred117_Haxe() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred117_Haxe_fragment(); // can never throw exception
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
    public final boolean synpred99_Haxe() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred99_Haxe_fragment(); // can never throw exception
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
    public final boolean synpred114_Haxe() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred114_Haxe_fragment(); // can never throw exception
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


    protected DFA27 dfa27 = new DFA27(this);
    protected DFA26 dfa26 = new DFA26(this);
    protected DFA29 dfa29 = new DFA29(this);
    protected DFA36 dfa36 = new DFA36(this);
    protected DFA39 dfa39 = new DFA39(this);
    protected DFA58 dfa58 = new DFA58(this);
    protected DFA60 dfa60 = new DFA60(this);
    protected DFA63 dfa63 = new DFA63(this);
    protected DFA76 dfa76 = new DFA76(this);
    protected DFA77 dfa77 = new DFA77(this);
    protected DFA79 dfa79 = new DFA79(this);
    protected DFA80 dfa80 = new DFA80(this);
    static final String DFA27_eotS =
        "\33\uffff";
    static final String DFA27_eofS =
        "\1\5\32\uffff";
    static final String DFA27_minS =
        "\1\22\1\0\31\uffff";
    static final String DFA27_maxS =
        "\1\146\1\0\31\uffff";
    static final String DFA27_acceptS =
        "\2\uffff\1\1\2\uffff\1\2\25\uffff";
    static final String DFA27_specialS =
        "\1\uffff\1\0\31\uffff}>";
    static final String[] DFA27_transitionS = {
            "\4\5\1\2\1\uffff\2\5\1\uffff\2\5\3\uffff\1\2\1\uffff\1\5\1"+
            "\uffff\1\2\1\5\10\uffff\1\5\4\2\4\5\11\uffff\1\1\1\5\35\uffff"+
            "\1\5\2\uffff\5\5",
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
            ""
    };

    static final short[] DFA27_eot = DFA.unpackEncodedString(DFA27_eotS);
    static final short[] DFA27_eof = DFA.unpackEncodedString(DFA27_eofS);
    static final char[] DFA27_min = DFA.unpackEncodedStringToUnsignedChars(DFA27_minS);
    static final char[] DFA27_max = DFA.unpackEncodedStringToUnsignedChars(DFA27_maxS);
    static final short[] DFA27_accept = DFA.unpackEncodedString(DFA27_acceptS);
    static final short[] DFA27_special = DFA.unpackEncodedString(DFA27_specialS);
    static final short[][] DFA27_transition;

    static {
        int numStates = DFA27_transitionS.length;
        DFA27_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA27_transition[i] = DFA.unpackEncodedString(DFA27_transitionS[i]);
        }
    }

    class DFA27 extends DFA {

        public DFA27(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 27;
            this.eot = DFA27_eot;
            this.eof = DFA27_eof;
            this.min = DFA27_min;
            this.max = DFA27_max;
            this.accept = DFA27_accept;
            this.special = DFA27_special;
            this.transition = DFA27_transition;
        }
        public String getDescription() {
            return "203:1: type : ( ( anonType | dotIdent | primitiveType ) ( typeParam )* | );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA27_1 = input.LA(1);

                         
                        int index27_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_Haxe()) ) {s = 2;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index27_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 27, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA26_eotS =
        "\31\uffff";
    static final String DFA26_eofS =
        "\1\1\30\uffff";
    static final String DFA26_minS =
        "\1\22\2\uffff\1\0\25\uffff";
    static final String DFA26_maxS =
        "\1\146\2\uffff\1\0\25\uffff";
    static final String DFA26_acceptS =
        "\1\uffff\1\2\26\uffff\1\1";
    static final String DFA26_specialS =
        "\3\uffff\1\0\25\uffff}>";
    static final String[] DFA26_transitionS = {
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
            return "()* loopback of 203:56: ( typeParam )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA26_3 = input.LA(1);

                         
                        int index26_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_Haxe()) ) {s = 24;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index26_3);
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
    static final String DFA29_eotS =
        "\53\uffff";
    static final String DFA29_eofS =
        "\1\2\52\uffff";
    static final String DFA29_minS =
        "\1\22\1\0\51\uffff";
    static final String DFA29_maxS =
        "\1\145\1\0\51\uffff";
    static final String DFA29_acceptS =
        "\2\uffff\1\2\47\uffff\1\1";
    static final String DFA29_specialS =
        "\1\uffff\1\0\51\uffff}>";
    static final String[] DFA29_transitionS = {
            "\1\2\1\uffff\2\2\1\uffff\1\2\12\uffff\2\2\1\uffff\6\2\1\uffff"+
            "\2\2\5\uffff\1\1\1\2\1\uffff\1\2\4\uffff\1\2\4\uffff\2\2\10"+
            "\uffff\22\2\10\uffff\2\2",
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
            ""
    };

    static final short[] DFA29_eot = DFA.unpackEncodedString(DFA29_eotS);
    static final short[] DFA29_eof = DFA.unpackEncodedString(DFA29_eofS);
    static final char[] DFA29_min = DFA.unpackEncodedStringToUnsignedChars(DFA29_minS);
    static final char[] DFA29_max = DFA.unpackEncodedStringToUnsignedChars(DFA29_maxS);
    static final short[] DFA29_accept = DFA.unpackEncodedString(DFA29_acceptS);
    static final short[] DFA29_special = DFA.unpackEncodedString(DFA29_specialS);
    static final short[][] DFA29_transition;

    static {
        int numStates = DFA29_transitionS.length;
        DFA29_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA29_transition[i] = DFA.unpackEncodedString(DFA29_transitionS[i]);
        }
    }

    class DFA29 extends DFA {

        public DFA29(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 29;
            this.eot = DFA29_eot;
            this.eof = DFA29_eof;
            this.min = DFA29_min;
            this.max = DFA29_max;
            this.accept = DFA29_accept;
            this.special = DFA29_special;
            this.transition = DFA29_transition;
        }
        public String getDescription() {
            return "214:1: typeParamOpt : ( typeParam -> ^( TYPE_PARAM_OPT[\"TYPE_PARAM_OPT\",true] ( typeParam )? ) | );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA29_1 = input.LA(1);

                         
                        int index29_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred45_Haxe()) ) {s = 42;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index29_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 29, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA36_eotS =
        "\47\uffff";
    static final String DFA36_eofS =
        "\47\uffff";
    static final String DFA36_minS =
        "\1\22\21\0\25\uffff";
    static final String DFA36_maxS =
        "\1\155\21\0\25\uffff";
    static final String DFA36_acceptS =
        "\22\uffff\1\3\5\uffff\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
        "\1\15\1\16\1\1\1\2\1\20\1\17";
    static final String DFA36_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"+
        "\14\1\15\1\16\1\17\1\20\25\uffff}>";
    static final String[] DFA36_transitionS = {
            "\1\2\1\uffff\1\17\1\uffff\1\20\2\uffff\1\22\3\uffff\5\22\2"+
            "\uffff\1\21\6\uffff\1\6\13\uffff\1\4\1\30\1\uffff\1\31\1\uffff"+
            "\1\32\1\33\1\34\1\35\1\1\1\uffff\1\36\1\37\1\40\1\41\3\uffff"+
            "\1\42\13\uffff\2\3\3\uffff\4\3\1\5\1\uffff\1\22\1\10\5\uffff"+
            "\1\7\1\11\1\12\1\13\1\14\1\15\1\16",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
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

    static final short[] DFA36_eot = DFA.unpackEncodedString(DFA36_eotS);
    static final short[] DFA36_eof = DFA.unpackEncodedString(DFA36_eofS);
    static final char[] DFA36_min = DFA.unpackEncodedStringToUnsignedChars(DFA36_minS);
    static final char[] DFA36_max = DFA.unpackEncodedStringToUnsignedChars(DFA36_maxS);
    static final short[] DFA36_accept = DFA.unpackEncodedString(DFA36_acceptS);
    static final short[] DFA36_special = DFA.unpackEncodedString(DFA36_specialS);
    static final short[][] DFA36_transition;

    static {
        int numStates = DFA36_transitionS.length;
        DFA36_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA36_transition[i] = DFA.unpackEncodedString(DFA36_transitionS[i]);
        }
    }

    class DFA36 extends DFA {

        public DFA36(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 36;
            this.eot = DFA36_eot;
            this.eof = DFA36_eof;
            this.min = DFA36_min;
            this.max = DFA36_max;
            this.accept = DFA36_accept;
            this.special = DFA36_special;
            this.transition = DFA36_transition;
        }
        public String getDescription() {
            return "228:1: statement : ( block | assignExpr SEMI | varDecl | IF parExpression st1= statement ( ELSE st2= statement )? -> ^( IF parExpression $st1 ( ^( ELSE $st2) )? ) | FOR LPAREN exp1= expr IN exp2= expr RPAREN statement -> ^( FOR ^( IN $exp1 $exp2) ( statement )? ) | WHILE parExpression statement -> ^( WHILE ( parExpression )? ( statement )? ) | DO statement WHILE parExpression SEMI -> ^( DO ( parExpression )? ( statement )? ) | TRY block catchStmtList -> ^( TRY ( block )? ( catchStmtList )? ) | SWITCH LPAREN expr RPAREN LBRACE ( caseStmt )+ RBRACE -> ^( SWITCH ( expr )? ( caseStmt )+ ) | RETURN ( expr )? SEMI -> ^( RETURN ( expr )? ) | THROW expr SEMI -> ^( THROW ( expr )? ) | BREAK ( IDENTIFIER )? SEMI -> ^( BREAK ( IDENTIFIER )? ) | CONTINUE ( IDENTIFIER )? SEMI -> ^( CONTINUE ( IDENTIFIER )? ) | expr SEMI | IDENTIFIER COLON statement -> ^( COLON ( IDENTIFIER )? ( statement )? ) | SEMI );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA36_1 = input.LA(1);

                         
                        int index36_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred47_Haxe()) ) {s = 35;}

                        else if ( (synpred48_Haxe()) ) {s = 36;}

                        else if ( (synpred65_Haxe()) ) {s = 34;}

                         
                        input.seek(index36_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA36_2 = input.LA(1);

                         
                        int index36_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred47_Haxe()) ) {s = 35;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index36_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA36_3 = input.LA(1);

                         
                        int index36_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_Haxe()) ) {s = 36;}

                        else if ( (synpred65_Haxe()) ) {s = 34;}

                         
                        input.seek(index36_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA36_4 = input.LA(1);

                         
                        int index36_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_Haxe()) ) {s = 36;}

                        else if ( (synpred65_Haxe()) ) {s = 34;}

                         
                        input.seek(index36_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA36_5 = input.LA(1);

                         
                        int index36_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_Haxe()) ) {s = 36;}

                        else if ( (synpred65_Haxe()) ) {s = 34;}

                         
                        input.seek(index36_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA36_6 = input.LA(1);

                         
                        int index36_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_Haxe()) ) {s = 36;}

                        else if ( (synpred65_Haxe()) ) {s = 34;}

                         
                        input.seek(index36_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA36_7 = input.LA(1);

                         
                        int index36_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_Haxe()) ) {s = 36;}

                        else if ( (synpred65_Haxe()) ) {s = 34;}

                         
                        input.seek(index36_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA36_8 = input.LA(1);

                         
                        int index36_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_Haxe()) ) {s = 36;}

                        else if ( (synpred65_Haxe()) ) {s = 34;}

                         
                        input.seek(index36_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA36_9 = input.LA(1);

                         
                        int index36_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_Haxe()) ) {s = 36;}

                        else if ( (synpred65_Haxe()) ) {s = 34;}

                         
                        input.seek(index36_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA36_10 = input.LA(1);

                         
                        int index36_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_Haxe()) ) {s = 36;}

                        else if ( (synpred65_Haxe()) ) {s = 34;}

                         
                        input.seek(index36_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA36_11 = input.LA(1);

                         
                        int index36_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_Haxe()) ) {s = 36;}

                        else if ( (synpred65_Haxe()) ) {s = 34;}

                         
                        input.seek(index36_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA36_12 = input.LA(1);

                         
                        int index36_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_Haxe()) ) {s = 36;}

                        else if ( (synpred65_Haxe()) ) {s = 34;}

                         
                        input.seek(index36_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA36_13 = input.LA(1);

                         
                        int index36_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_Haxe()) ) {s = 36;}

                        else if ( (synpred65_Haxe()) ) {s = 34;}

                         
                        input.seek(index36_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA36_14 = input.LA(1);

                         
                        int index36_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_Haxe()) ) {s = 36;}

                        else if ( (synpred65_Haxe()) ) {s = 34;}

                         
                        input.seek(index36_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA36_15 = input.LA(1);

                         
                        int index36_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_Haxe()) ) {s = 36;}

                        else if ( (synpred65_Haxe()) ) {s = 34;}

                         
                        input.seek(index36_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA36_16 = input.LA(1);

                         
                        int index36_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_Haxe()) ) {s = 36;}

                        else if ( (synpred65_Haxe()) ) {s = 34;}

                        else if ( (synpred66_Haxe()) ) {s = 38;}

                         
                        input.seek(index36_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA36_17 = input.LA(1);

                         
                        int index36_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_Haxe()) ) {s = 36;}

                        else if ( (synpred65_Haxe()) ) {s = 34;}

                         
                        input.seek(index36_17);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 36, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA39_eotS =
        "\50\uffff";
    static final String DFA39_eofS =
        "\50\uffff";
    static final String DFA39_minS =
        "\1\22\6\0\1\uffff\1\0\37\uffff";
    static final String DFA39_maxS =
        "\1\155\6\0\1\uffff\1\0\37\uffff";
    static final String DFA39_acceptS =
        "\7\uffff\1\2\3\uffff\1\3\33\uffff\1\1";
    static final String DFA39_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\uffff\1\6\37\uffff}>";
    static final String[] DFA39_transitionS = {
            "\1\13\1\7\1\13\1\uffff\1\13\1\uffff\1\7\1\5\3\uffff\1\10\1"+
            "\1\1\2\1\3\1\4\2\uffff\1\13\6\uffff\1\13\13\uffff\2\13\1\uffff"+
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
            ""
    };

    static final short[] DFA39_eot = DFA.unpackEncodedString(DFA39_eotS);
    static final short[] DFA39_eof = DFA.unpackEncodedString(DFA39_eofS);
    static final char[] DFA39_min = DFA.unpackEncodedStringToUnsignedChars(DFA39_minS);
    static final char[] DFA39_max = DFA.unpackEncodedStringToUnsignedChars(DFA39_maxS);
    static final short[] DFA39_accept = DFA.unpackEncodedString(DFA39_acceptS);
    static final short[] DFA39_special = DFA.unpackEncodedString(DFA39_specialS);
    static final short[][] DFA39_transition;

    static {
        int numStates = DFA39_transitionS.length;
        DFA39_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA39_transition[i] = DFA.unpackEncodedString(DFA39_transitionS[i]);
        }
    }

    class DFA39 extends DFA {

        public DFA39(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 39;
            this.eot = DFA39_eot;
            this.eof = DFA39_eof;
            this.min = DFA39_min;
            this.max = DFA39_max;
            this.accept = DFA39_accept;
            this.special = DFA39_special;
            this.transition = DFA39_transition;
        }
        public String getDescription() {
            return "255:1: blockStmt : ( varDecl | classDecl | statement );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA39_1 = input.LA(1);

                         
                        int index39_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred69_Haxe()) ) {s = 39;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index39_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA39_2 = input.LA(1);

                         
                        int index39_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred69_Haxe()) ) {s = 39;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index39_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA39_3 = input.LA(1);

                         
                        int index39_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred69_Haxe()) ) {s = 39;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index39_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA39_4 = input.LA(1);

                         
                        int index39_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred69_Haxe()) ) {s = 39;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index39_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA39_5 = input.LA(1);

                         
                        int index39_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred69_Haxe()) ) {s = 39;}

                        else if ( (synpred70_Haxe()) ) {s = 7;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index39_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA39_6 = input.LA(1);

                         
                        int index39_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred69_Haxe()) ) {s = 39;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index39_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA39_8 = input.LA(1);

                         
                        int index39_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred69_Haxe()) ) {s = 39;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index39_8);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 39, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA58_eotS =
        "\23\uffff";
    static final String DFA58_eofS =
        "\23\uffff";
    static final String DFA58_minS =
        "\1\24\4\uffff\14\0\2\uffff";
    static final String DFA58_maxS =
        "\1\155\4\uffff\14\0\2\uffff";
    static final String DFA58_acceptS =
        "\1\uffff\1\1\17\uffff\1\2\1\3";
    static final String DFA58_specialS =
        "\5\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\2"+
        "\uffff}>";
    static final String[] DFA58_transitionS = {
            "\1\16\1\uffff\1\17\15\uffff\1\20\6\uffff\1\1\13\uffff\1\1\10"+
            "\uffff\1\5\24\uffff\2\1\3\uffff\5\1\2\uffff\1\7\5\uffff\1\6"+
            "\1\10\1\11\1\12\1\13\1\14\1\15",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
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
            return "339:1: psExpr : ( prefixExpr | suffixExpr | value );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA58_5 = input.LA(1);

                         
                        int index58_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred99_Haxe()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index58_5);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA58_6 = input.LA(1);

                         
                        int index58_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred99_Haxe()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index58_6);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA58_7 = input.LA(1);

                         
                        int index58_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred99_Haxe()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index58_7);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA58_8 = input.LA(1);

                         
                        int index58_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred99_Haxe()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index58_8);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA58_9 = input.LA(1);

                         
                        int index58_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred99_Haxe()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index58_9);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA58_10 = input.LA(1);

                         
                        int index58_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred99_Haxe()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index58_10);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA58_11 = input.LA(1);

                         
                        int index58_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred99_Haxe()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index58_11);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA58_12 = input.LA(1);

                         
                        int index58_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred99_Haxe()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index58_12);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA58_13 = input.LA(1);

                         
                        int index58_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred99_Haxe()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index58_13);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA58_14 = input.LA(1);

                         
                        int index58_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred99_Haxe()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index58_14);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA58_15 = input.LA(1);

                         
                        int index58_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred99_Haxe()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index58_15);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA58_16 = input.LA(1);

                         
                        int index58_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred99_Haxe()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index58_16);
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
    static final String DFA60_eotS =
        "\20\uffff";
    static final String DFA60_eofS =
        "\20\uffff";
    static final String DFA60_minS =
        "\1\24\14\0\3\uffff";
    static final String DFA60_maxS =
        "\1\155\14\0\3\uffff";
    static final String DFA60_acceptS =
        "\15\uffff\1\1\1\2\1\3";
    static final String DFA60_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\3"+
        "\uffff}>";
    static final String[] DFA60_transitionS = {
            "\1\12\1\uffff\1\13\15\uffff\1\14\33\uffff\1\1\40\uffff\1\3"+
            "\5\uffff\1\2\1\4\1\5\1\6\1\7\1\10\1\11",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
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
            return "352:1: suffixExpr : ( value methodCallOrSliceList -> ^( SUFFIX_EXPR[\"CallOrSlice\",true] ( value )? ( methodCallOrSliceList )? ) | value PLUSPLUS -> ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] ( value )? ( PLUSPLUS )? ) | value SUBSUB -> ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] ( value )? SUBSUB ) );";
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
                        if ( (synpred108_Haxe()) ) {s = 13;}

                        else if ( (synpred109_Haxe()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index60_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA60_2 = input.LA(1);

                         
                        int index60_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_Haxe()) ) {s = 13;}

                        else if ( (synpred109_Haxe()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index60_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA60_3 = input.LA(1);

                         
                        int index60_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_Haxe()) ) {s = 13;}

                        else if ( (synpred109_Haxe()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index60_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA60_4 = input.LA(1);

                         
                        int index60_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_Haxe()) ) {s = 13;}

                        else if ( (synpred109_Haxe()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index60_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA60_5 = input.LA(1);

                         
                        int index60_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_Haxe()) ) {s = 13;}

                        else if ( (synpred109_Haxe()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index60_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA60_6 = input.LA(1);

                         
                        int index60_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_Haxe()) ) {s = 13;}

                        else if ( (synpred109_Haxe()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index60_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA60_7 = input.LA(1);

                         
                        int index60_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_Haxe()) ) {s = 13;}

                        else if ( (synpred109_Haxe()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index60_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA60_8 = input.LA(1);

                         
                        int index60_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_Haxe()) ) {s = 13;}

                        else if ( (synpred109_Haxe()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index60_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA60_9 = input.LA(1);

                         
                        int index60_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_Haxe()) ) {s = 13;}

                        else if ( (synpred109_Haxe()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index60_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA60_10 = input.LA(1);

                         
                        int index60_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_Haxe()) ) {s = 13;}

                        else if ( (synpred109_Haxe()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index60_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA60_11 = input.LA(1);

                         
                        int index60_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_Haxe()) ) {s = 13;}

                        else if ( (synpred109_Haxe()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index60_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA60_12 = input.LA(1);

                         
                        int index60_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_Haxe()) ) {s = 13;}

                        else if ( (synpred109_Haxe()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index60_12);
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
    static final String DFA63_eotS =
        "\44\uffff";
    static final String DFA63_eofS =
        "\44\uffff";
    static final String DFA63_minS =
        "\1\22\21\0\22\uffff";
    static final String DFA63_maxS =
        "\1\155\21\0\22\uffff";
    static final String DFA63_acceptS =
        "\22\uffff\1\2\20\uffff\1\1";
    static final String DFA63_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"+
        "\14\1\15\1\16\1\17\1\20\22\uffff}>";
    static final String[] DFA63_transitionS = {
            "\1\22\1\uffff\1\16\1\uffff\1\17\2\uffff\1\22\3\uffff\5\22\2"+
            "\uffff\1\20\6\uffff\1\4\13\uffff\1\2\1\22\1\uffff\1\22\1\uffff"+
            "\4\22\1\5\1\uffff\4\22\3\uffff\1\21\13\uffff\2\1\3\uffff\4\1"+
            "\1\3\1\uffff\1\22\1\7\5\uffff\1\6\1\10\1\11\1\12\1\13\1\14\1"+
            "\15",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
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

    static final short[] DFA63_eot = DFA.unpackEncodedString(DFA63_eotS);
    static final short[] DFA63_eof = DFA.unpackEncodedString(DFA63_eofS);
    static final char[] DFA63_min = DFA.unpackEncodedStringToUnsignedChars(DFA63_minS);
    static final char[] DFA63_max = DFA.unpackEncodedStringToUnsignedChars(DFA63_maxS);
    static final short[] DFA63_accept = DFA.unpackEncodedString(DFA63_acceptS);
    static final short[] DFA63_special = DFA.unpackEncodedString(DFA63_specialS);
    static final short[][] DFA63_transition;

    static {
        int numStates = DFA63_transitionS.length;
        DFA63_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA63_transition[i] = DFA.unpackEncodedString(DFA63_transitionS[i]);
        }
    }

    class DFA63 extends DFA {

        public DFA63(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 63;
            this.eot = DFA63_eot;
            this.eof = DFA63_eof;
            this.min = DFA63_min;
            this.max = DFA63_max;
            this.accept = DFA63_accept;
            this.special = DFA63_special;
            this.transition = DFA63_transition;
        }
        public String getDescription() {
            return "373:17: ( expr | statement )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA63_1 = input.LA(1);

                         
                        int index63_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred114_Haxe()) ) {s = 35;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index63_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA63_2 = input.LA(1);

                         
                        int index63_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred114_Haxe()) ) {s = 35;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index63_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA63_3 = input.LA(1);

                         
                        int index63_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred114_Haxe()) ) {s = 35;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index63_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA63_4 = input.LA(1);

                         
                        int index63_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred114_Haxe()) ) {s = 35;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index63_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA63_5 = input.LA(1);

                         
                        int index63_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred114_Haxe()) ) {s = 35;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index63_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA63_6 = input.LA(1);

                         
                        int index63_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred114_Haxe()) ) {s = 35;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index63_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA63_7 = input.LA(1);

                         
                        int index63_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred114_Haxe()) ) {s = 35;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index63_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA63_8 = input.LA(1);

                         
                        int index63_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred114_Haxe()) ) {s = 35;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index63_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA63_9 = input.LA(1);

                         
                        int index63_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred114_Haxe()) ) {s = 35;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index63_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA63_10 = input.LA(1);

                         
                        int index63_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred114_Haxe()) ) {s = 35;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index63_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA63_11 = input.LA(1);

                         
                        int index63_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred114_Haxe()) ) {s = 35;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index63_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA63_12 = input.LA(1);

                         
                        int index63_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred114_Haxe()) ) {s = 35;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index63_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA63_13 = input.LA(1);

                         
                        int index63_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred114_Haxe()) ) {s = 35;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index63_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA63_14 = input.LA(1);

                         
                        int index63_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred114_Haxe()) ) {s = 35;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index63_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA63_15 = input.LA(1);

                         
                        int index63_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred114_Haxe()) ) {s = 35;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index63_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA63_16 = input.LA(1);

                         
                        int index63_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred114_Haxe()) ) {s = 35;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index63_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA63_17 = input.LA(1);

                         
                        int index63_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred114_Haxe()) ) {s = 35;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index63_17);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 63, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA76_eotS =
        "\11\uffff";
    static final String DFA76_eofS =
        "\11\uffff";
    static final String DFA76_minS =
        "\6\31\1\26\2\uffff";
    static final String DFA76_maxS =
        "\6\53\1\67\2\uffff";
    static final String DFA76_acceptS =
        "\7\uffff\1\1\1\2";
    static final String DFA76_specialS =
        "\11\uffff}>";
    static final String[] DFA76_transitionS = {
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
            return "442:1: funcDecl : ( ( declAttrList )? FUNCTION NEW LPAREN paramList RPAREN typeTagOpt block -> ^( FUNCTION NEW ( declAttrList )? ( paramList )? ( typeTagOpt )? ( block )? ) | ( declAttrList )? FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt block -> ^( FUNCTION IDENTIFIER ( declAttrList )? ( paramList )? ( typeTagOpt )? ( block )? ( typeParamOpt )? ) );";
        }
    }
    static final String DFA77_eotS =
        "\14\uffff";
    static final String DFA77_eofS =
        "\14\uffff";
    static final String DFA77_minS =
        "\6\31\2\26\4\uffff";
    static final String DFA77_maxS =
        "\6\53\2\67\4\uffff";
    static final String DFA77_acceptS =
        "\10\uffff\1\3\1\4\1\1\1\2";
    static final String DFA77_specialS =
        "\14\uffff}>";
    static final String[] DFA77_transitionS = {
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
            return "448:1: funcProtoDecl : ( declAttrList FUNCTION NEW LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTagOpt )? ( declAttrList )? ) | declAttrList FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTagOpt )? ( declAttrList )? ( typeParamOpt )? ) | FUNCTION NEW LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTagOpt )? ) | FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTagOpt )? ( typeParamOpt )? ) );";
        }
    }
    static final String DFA79_eotS =
        "\12\uffff";
    static final String DFA79_eofS =
        "\12\uffff";
    static final String DFA79_minS =
        "\1\23\4\31\1\30\3\uffff\1\31";
    static final String DFA79_maxS =
        "\6\140\3\uffff\1\140";
    static final String DFA79_acceptS =
        "\6\uffff\1\1\1\2\1\3\1\uffff";
    static final String DFA79_specialS =
        "\12\uffff}>";
    static final String[] DFA79_transitionS = {
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
            return "468:1: classMember : ( varDecl | funcDecl | enumDecl );";
        }
    }
    static final String DFA80_eotS =
        "\11\uffff";
    static final String DFA80_eofS =
        "\1\10\10\uffff";
    static final String DFA80_minS =
        "\6\31\3\uffff";
    static final String DFA80_maxS =
        "\6\140\3\uffff";
    static final String DFA80_acceptS =
        "\6\uffff\1\1\1\2\1\3";
    static final String DFA80_specialS =
        "\11\uffff}>";
    static final String[] DFA80_transitionS = {
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
            return "479:1: interfaceBody : ( varDecl interfaceBody | funcProtoDecl interfaceBody | );";
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
    public static final BitSet FOLLOW_IDENTIFIER_in_id681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIS_in_id701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_dotIdent730 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_DOT_in_dotIdent732 = new BitSet(new long[]{0x0000001000400000L});
    public static final BitSet FOLLOW_dotIdent_in_dotIdent736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_dotIdent763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQ_in_assignOp787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUSEQ_in_assignOp813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUBEQ_in_assignOp836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SLASHEQ_in_assignOp858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PERCENTEQ_in_assignOp880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AMPEQ_in_assignOp902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_in_funcLit931 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_LPAREN_in_funcLit933 = new BitSet(new long[]{0x0000000800600000L});
    public static final BitSet FOLLOW_paramList_in_funcLit935 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_RPAREN_in_funcLit937 = new BitSet(new long[]{0x0000000000840000L,0x0000000000000001L});
    public static final BitSet FOLLOW_typeTagOpt_in_funcLit939 = new BitSet(new long[]{0x0000000000840000L,0x0000000000000001L});
    public static final BitSet FOLLOW_block_in_funcLit942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACKET_in_arrayLit979 = new BitSet(new long[]{0x0080281000500000L,0x00003F827C600201L});
    public static final BitSet FOLLOW_exprListOpt_in_arrayLit982 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_RBRACKET_in_arrayLit984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_in_typeTag1016 = new BitSet(new long[]{0x0007C01100400000L,0x0000000000000001L});
    public static final BitSet FOLLOW_funcType_in_typeTag1019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeTag_in_typeTagOpt1047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_typeList1090 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_COMMA_in_typeList1093 = new BitSet(new long[]{0x0007801500400000L,0x0000000000000001L});
    public static final BitSet FOLLOW_type_in_typeList1096 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_typeConstraint_in_typeList1113 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_COMMA_in_typeList1116 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_typeConstraint_in_typeList1119 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_type_in_funcType1144 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_MINUS_BIGGER_in_funcType1148 = new BitSet(new long[]{0x0007C01100400000L,0x0000000000000001L});
    public static final BitSet FOLLOW_type_in_funcType1151 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_VOID_in_funcType1164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_primitiveType0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_anonType_in_type1224 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_dotIdent_in_type1229 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_primitiveType_in_type1234 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_typeParam_in_type1240 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_LT_in_typeParam1288 = new BitSet(new long[]{0x0007801500400000L,0x0000000000000001L});
    public static final BitSet FOLLOW_typeList_in_typeParam1291 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_GT_in_typeParam1293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_in_typeParam1305 = new BitSet(new long[]{0x0007801500400000L,0x0000000000000001L});
    public static final BitSet FOLLOW_typeList_in_typeParam1308 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_LT_in_typeParam1310 = new BitSet(new long[]{0x0007801500400000L,0x0000000000000001L});
    public static final BitSet FOLLOW_typeList_in_typeParam1313 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_GTGT_in_typeParam1315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_in_typeParam1327 = new BitSet(new long[]{0x0007801500400000L,0x0000000000000001L});
    public static final BitSet FOLLOW_typeList_in_typeParam1330 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_LT_in_typeParam1332 = new BitSet(new long[]{0x0007801500400000L,0x0000000000000001L});
    public static final BitSet FOLLOW_typeList_in_typeParam1335 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_LT_in_typeParam1337 = new BitSet(new long[]{0x0007801500400000L,0x0000000000000001L});
    public static final BitSet FOLLOW_typeList_in_typeParam1340 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_GTGTGT_in_typeParam1342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeParam_in_typeParamOpt1374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_typeConstraint1423 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_COLON_in_typeConstraint1425 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_LPAREN_in_typeConstraint1427 = new BitSet(new long[]{0x0007801500400000L,0x0000000000000001L});
    public static final BitSet FOLLOW_typeList_in_typeConstraint1429 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_RPAREN_in_typeConstraint1431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttrList_in_functionReturn1469 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_FUNCTION_in_functionReturn1472 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_NEW_in_functionReturn1474 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_LPAREN_in_functionReturn1476 = new BitSet(new long[]{0x0000000800600000L});
    public static final BitSet FOLLOW_paramList_in_functionReturn1478 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_RPAREN_in_functionReturn1480 = new BitSet(new long[]{0x0000000000840000L,0x0000000000000001L});
    public static final BitSet FOLLOW_typeTagOpt_in_functionReturn1482 = new BitSet(new long[]{0x0000000000840000L,0x0000000000000001L});
    public static final BitSet FOLLOW_block_in_functionReturn1484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_statement1533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignExpr_in_statement1544 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_SEMI_in_statement1546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDecl_in_statement1558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_statement1569 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_parExpression_in_statement1571 = new BitSet(new long[]{0xF5800813E2D40000L,0x00003F837C60023DL});
    public static final BitSet FOLLOW_statement_in_statement1575 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_ELSE_in_statement1578 = new BitSet(new long[]{0xF5800813E2D40000L,0x00003F837C60023DL});
    public static final BitSet FOLLOW_statement_in_statement1582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_statement1631 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_LPAREN_in_statement1633 = new BitSet(new long[]{0x0080081000500000L,0x00003F827C600201L});
    public static final BitSet FOLLOW_expr_in_statement1637 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_IN_in_statement1639 = new BitSet(new long[]{0x0080081000500000L,0x00003F827C600201L});
    public static final BitSet FOLLOW_expr_in_statement1643 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_RPAREN_in_statement1645 = new BitSet(new long[]{0xF5800813E2D40000L,0x00003F837C60023DL});
    public static final BitSet FOLLOW_statement_in_statement1647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_statement1684 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_parExpression_in_statement1686 = new BitSet(new long[]{0xF5800813E2D40000L,0x00003F837C60023DL});
    public static final BitSet FOLLOW_statement_in_statement1688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DO_in_statement1730 = new BitSet(new long[]{0xF5800813E2D40000L,0x00003F837C60023DL});
    public static final BitSet FOLLOW_statement_in_statement1732 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_WHILE_in_statement1734 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_parExpression_in_statement1736 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_SEMI_in_statement1738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRY_in_statement1776 = new BitSet(new long[]{0x0000000000840000L,0x0000000000000001L});
    public static final BitSet FOLLOW_block_in_statement1778 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_catchStmtList_in_statement1780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SWITCH_in_statement1822 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_LPAREN_in_statement1824 = new BitSet(new long[]{0x0080081000500000L,0x00003F827C600201L});
    public static final BitSet FOLLOW_expr_in_statement1826 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_RPAREN_in_statement1828 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_LBRACE_in_statement1830 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_caseStmt_in_statement1832 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000C2L});
    public static final BitSet FOLLOW_RBRACE_in_statement1835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_statement1865 = new BitSet(new long[]{0x0080081000540000L,0x00003F827C600201L});
    public static final BitSet FOLLOW_expr_in_statement1868 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_SEMI_in_statement1872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THROW_in_statement1914 = new BitSet(new long[]{0x0080081000500000L,0x00003F827C600201L});
    public static final BitSet FOLLOW_expr_in_statement1916 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_SEMI_in_statement1918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BREAK_in_statement1958 = new BitSet(new long[]{0x0000000000440000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_statement1961 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_SEMI_in_statement1965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONTINUE_in_statement2000 = new BitSet(new long[]{0x0000000000440000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_statement2003 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_SEMI_in_statement2007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_statement2043 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_SEMI_in_statement2046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_statement2058 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_COLON_in_statement2060 = new BitSet(new long[]{0xF5800813E2D40000L,0x00003F837C60023DL});
    public static final BitSet FOLLOW_statement_in_statement2062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMI_in_statement2101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_parExpression2125 = new BitSet(new long[]{0x0080081000500000L,0x00003F827C600201L});
    public static final BitSet FOLLOW_expr_in_parExpression2128 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_RPAREN_in_parExpression2130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_block2149 = new BitSet(new long[]{0xF5800813E3DC0000L,0x00003F877C60023FL});
    public static final BitSet FOLLOW_blockStmt_in_block2152 = new BitSet(new long[]{0xF5800813E3DC0000L,0x00003F877C60023FL});
    public static final BitSet FOLLOW_RBRACE_in_block2156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMI_in_block2191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDecl_in_blockStmt2220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classDecl_in_blockStmt2231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_blockStmt2242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BREAK_in_breakStmt2266 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_SEMI_in_breakStmt2268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONTINUE_in_continueStmt2293 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_SEMI_in_continueStmt2295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CASE_in_caseStmt2320 = new BitSet(new long[]{0x0080081000500000L,0x00003F827C600201L});
    public static final BitSet FOLLOW_exprList_in_caseStmt2322 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_COLON_in_caseStmt2324 = new BitSet(new long[]{0xF5800813E2D40000L,0x00003F837C60023DL});
    public static final BitSet FOLLOW_statement_in_caseStmt2326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_caseStmt2350 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_COLON_in_caseStmt2352 = new BitSet(new long[]{0xF5800813E2D40000L,0x00003F837C60023DL});
    public static final BitSet FOLLOW_statement_in_caseStmt2354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_defaultStmt2394 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_COLON_in_defaultStmt2396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_catchStmt_in_catchStmtList2418 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_catchStmtList_in_catchStmtList2420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CATCH_in_catchStmt2450 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_LPAREN_in_catchStmt2452 = new BitSet(new long[]{0x0000000800400000L});
    public static final BitSet FOLLOW_param_in_catchStmt2454 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_RPAREN_in_catchStmt2456 = new BitSet(new long[]{0x0000000000840000L,0x0000000000000001L});
    public static final BitSet FOLLOW_block_in_catchStmt2458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprList_in_exprListOpt2496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_exprList2526 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_COMMA_in_exprList2529 = new BitSet(new long[]{0x0080081000500000L,0x00003F827C600201L});
    public static final BitSet FOLLOW_expr_in_exprList2532 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_assignExpr_in_expr2558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNTYPED_in_expr2569 = new BitSet(new long[]{0x0080081000500000L,0x00003F827C600001L});
    public static final BitSet FOLLOW_assignExpr_in_expr2571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iterExpr_in_assignExpr2603 = new BitSet(new long[]{0x000007E000000002L});
    public static final BitSet FOLLOW_assignOp_in_assignExpr2606 = new BitSet(new long[]{0x0080081000500000L,0x00003F827C600001L});
    public static final BitSet FOLLOW_iterExpr_in_assignExpr2609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ternaryExpr_in_iterExpr2632 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_ELLIPSIS_in_iterExpr2635 = new BitSet(new long[]{0x0080081000500000L,0x00003F827C600001L});
    public static final BitSet FOLLOW_ternaryExpr_in_iterExpr2638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicOrExpr_in_ternaryExpr2660 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_QUES_in_ternaryExpr2663 = new BitSet(new long[]{0x0080081000500000L,0x00003F827C600201L});
    public static final BitSet FOLLOW_expr_in_ternaryExpr2666 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_COLON_in_ternaryExpr2668 = new BitSet(new long[]{0x0080081000500000L,0x00003F827C600001L});
    public static final BitSet FOLLOW_logicOrExpr_in_ternaryExpr2671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicAndExpr_in_logicOrExpr2694 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_BARBAR_in_logicOrExpr2697 = new BitSet(new long[]{0x0080081000500000L,0x00003F827C600001L});
    public static final BitSet FOLLOW_logicAndExpr_in_logicOrExpr2700 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_cmpExpr_in_logicAndExpr2727 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_AMPAMP_in_logicAndExpr2731 = new BitSet(new long[]{0x0080081000500000L,0x00003F827C600001L});
    public static final BitSet FOLLOW_cmpExpr_in_logicAndExpr2734 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_bitExpr_in_cmpExpr2757 = new BitSet(new long[]{0x0018000000000002L,0x000000000001E000L});
    public static final BitSet FOLLOW_EQEQ_in_cmpExpr2762 = new BitSet(new long[]{0x0080081000500000L,0x00003F827C600001L});
    public static final BitSet FOLLOW_BANGEQ_in_cmpExpr2766 = new BitSet(new long[]{0x0080081000500000L,0x00003F827C600001L});
    public static final BitSet FOLLOW_GTEQ_in_cmpExpr2771 = new BitSet(new long[]{0x0080081000500000L,0x00003F827C600001L});
    public static final BitSet FOLLOW_LTEQ_in_cmpExpr2776 = new BitSet(new long[]{0x0080081000500000L,0x00003F827C600001L});
    public static final BitSet FOLLOW_GT_in_cmpExpr2781 = new BitSet(new long[]{0x0080081000500000L,0x00003F827C600001L});
    public static final BitSet FOLLOW_LT_in_cmpExpr2786 = new BitSet(new long[]{0x0080081000500000L,0x00003F827C600001L});
    public static final BitSet FOLLOW_bitExpr_in_cmpExpr2791 = new BitSet(new long[]{0x0018000000000002L,0x000000000001E000L});
    public static final BitSet FOLLOW_shiftExpr_in_bitExpr2814 = new BitSet(new long[]{0x0000000000000002L,0x00000000000E0000L});
    public static final BitSet FOLLOW_BAR_in_bitExpr2818 = new BitSet(new long[]{0x0080081000500000L,0x00003F827C600001L});
    public static final BitSet FOLLOW_shiftExpr_in_bitExpr2821 = new BitSet(new long[]{0x0000000000000002L,0x00000000000E0000L});
    public static final BitSet FOLLOW_AMP_in_bitExpr2825 = new BitSet(new long[]{0x0080081000500000L,0x00003F827C600001L});
    public static final BitSet FOLLOW_shiftExpr_in_bitExpr2828 = new BitSet(new long[]{0x0000000000000002L,0x00000000000E0000L});
    public static final BitSet FOLLOW_CARET_in_bitExpr2831 = new BitSet(new long[]{0x0080081000500000L,0x00003F827C600001L});
    public static final BitSet FOLLOW_shiftExpr_in_bitExpr2834 = new BitSet(new long[]{0x0000000000000002L,0x00000000000E0000L});
    public static final BitSet FOLLOW_addExpr_in_shiftExpr2863 = new BitSet(new long[]{0x0050000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_LTLT_in_shiftExpr2867 = new BitSet(new long[]{0x0080081000500000L,0x00003F827C600001L});
    public static final BitSet FOLLOW_addExpr_in_shiftExpr2871 = new BitSet(new long[]{0x0050000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_GT_in_shiftExpr2876 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_GT_in_shiftExpr2878 = new BitSet(new long[]{0x0080081000500000L,0x00003F827C600001L});
    public static final BitSet FOLLOW_addExpr_in_shiftExpr2883 = new BitSet(new long[]{0x0050000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_GTGTGT_in_shiftExpr2887 = new BitSet(new long[]{0x0080081000500000L,0x00003F827C600001L});
    public static final BitSet FOLLOW_addExpr_in_shiftExpr2890 = new BitSet(new long[]{0x0050000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_multExpr_in_addExpr2910 = new BitSet(new long[]{0x0000000000000002L,0x0000000000600000L});
    public static final BitSet FOLLOW_PLUS_in_addExpr2915 = new BitSet(new long[]{0x0080081000500000L,0x00003F827C600001L});
    public static final BitSet FOLLOW_SUB_in_addExpr2920 = new BitSet(new long[]{0x0080081000500000L,0x00003F827C600001L});
    public static final BitSet FOLLOW_multExpr_in_addExpr2924 = new BitSet(new long[]{0x0000000000000002L,0x0000000000600000L});
    public static final BitSet FOLLOW_psExpr_in_multExpr2951 = new BitSet(new long[]{0x0000000000000002L,0x0000000003800000L});
    public static final BitSet FOLLOW_STAR_in_multExpr2956 = new BitSet(new long[]{0x0080081000500000L,0x00003F827C600001L});
    public static final BitSet FOLLOW_SLASH_in_multExpr2959 = new BitSet(new long[]{0x0080081000500000L,0x00003F827C600001L});
    public static final BitSet FOLLOW_PERCENT_in_multExpr2962 = new BitSet(new long[]{0x0080081000500000L,0x00003F827C600001L});
    public static final BitSet FOLLOW_psExpr_in_multExpr2966 = new BitSet(new long[]{0x0000000000000002L,0x0000000003800000L});
    public static final BitSet FOLLOW_prefixExpr_in_psExpr2998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_suffixExpr_in_psExpr3007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_psExpr3017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_prefixExpr3039 = new BitSet(new long[]{0x0000001000500000L,0x00003F8200000001L});
    public static final BitSet FOLLOW_value_in_prefixExpr3054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_newExpr_in_prefixExpr3059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cast_in_prefixExpr3068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcLit_in_prefixExpr3082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_suffixExpr3104 = new BitSet(new long[]{0x0000100000100000L});
    public static final BitSet FOLLOW_methodCallOrSliceList_in_suffixExpr3106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_suffixExpr3133 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_PLUSPLUS_in_suffixExpr3135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_suffixExpr3174 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_SUBSUB_in_suffixExpr3176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_methodCallOrSlice3223 = new BitSet(new long[]{0x0080081000700000L,0x00003F827C600201L});
    public static final BitSet FOLLOW_exprListOpt_in_methodCallOrSlice3225 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_RPAREN_in_methodCallOrSlice3227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACKET_in_methodCallOrSlice3251 = new BitSet(new long[]{0x0080081000500000L,0x00003F827C600201L});
    public static final BitSet FOLLOW_expr_in_methodCallOrSlice3253 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_RBRACKET_in_methodCallOrSlice3255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_methodCallOrSlice_in_methodCallOrSliceList3288 = new BitSet(new long[]{0x0000100000100000L});
    public static final BitSet FOLLOW_methodCallOrSliceList_in_methodCallOrSliceList3290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_methodCallOrSlice_in_methodCallOrSliceList3301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objLit_in_value3330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_elementarySymbol_in_value3340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_value3350 = new BitSet(new long[]{0xF5800813E2D40000L,0x00003F837C60023DL});
    public static final BitSet FOLLOW_expr_in_value3354 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_statement_in_value3356 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_RPAREN_in_value3359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dotIdent_in_value3370 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_typeParamOpt_in_value3372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEW_in_newExpr3402 = new BitSet(new long[]{0x0007801100500000L,0x0000000000000001L});
    public static final BitSet FOLLOW_type_in_newExpr3404 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_LPAREN_in_newExpr3406 = new BitSet(new long[]{0x0080081000700000L,0x00003F827C600201L});
    public static final BitSet FOLLOW_exprListOpt_in_newExpr3408 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_RPAREN_in_newExpr3410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CAST_in_cast3440 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_LPAREN_in_cast3442 = new BitSet(new long[]{0x0080081000500000L,0x00003F827C600201L});
    public static final BitSet FOLLOW_expr_in_cast3444 = new BitSet(new long[]{0x0000000400200000L});
    public static final BitSet FOLLOW_COMMA_in_cast3447 = new BitSet(new long[]{0x0007C01100400000L,0x0000000000000001L});
    public static final BitSet FOLLOW_funcType_in_cast3449 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_RPAREN_in_cast3453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CAST_in_cast3481 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_LPAREN_in_cast3483 = new BitSet(new long[]{0x0080081000500000L,0x00003F827C600201L});
    public static final BitSet FOLLOW_expr_in_cast3485 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_RPAREN_in_cast3487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classDecl_in_topLevelDecl3552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interfaceDecl_in_topLevelDecl3562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumDecl_in_topLevelDecl3572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typedefDecl_in_topLevelDecl3582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeDeclFlags_in_enumDecl3600 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_ENUM_in_enumDecl3602 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_enumDecl3604 = new BitSet(new long[]{0x0008000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_typeParamOpt_in_enumDecl3606 = new BitSet(new long[]{0x0008000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_enumBody_in_enumDecl3608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_enumBody3641 = new BitSet(new long[]{0x0000000000400000L,0x0000000000000002L});
    public static final BitSet FOLLOW_enumValueDecl_in_enumBody3644 = new BitSet(new long[]{0x0000000000400000L,0x0000000000000002L});
    public static final BitSet FOLLOW_RBRACE_in_enumBody3648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_enumValueDecl3707 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_LPAREN_in_enumValueDecl3709 = new BitSet(new long[]{0x0000000800600000L});
    public static final BitSet FOLLOW_paramList_in_enumValueDecl3711 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_RPAREN_in_enumValueDecl3713 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_SEMI_in_enumValueDecl3715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_enumValueDecl3749 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_SEMI_in_enumValueDecl3751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDecl_in_varDeclList3811 = new BitSet(new long[]{0x00000003E2000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_varDeclList_in_varDeclList3813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttrList_in_varDecl3829 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_VAR_in_varDecl3833 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_varDeclPartList_in_varDecl3835 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_SEMI_in_varDecl3837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDeclPart_in_varDeclPartList3883 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_COMMA_in_varDeclPartList3886 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_varDeclPart_in_varDeclPartList3889 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_varDeclPart3910 = new BitSet(new long[]{0x0000002000900000L});
    public static final BitSet FOLLOW_propDeclOpt_in_varDeclPart3915 = new BitSet(new long[]{0x0000002000800000L});
    public static final BitSet FOLLOW_typeTagOpt_in_varDeclPart3917 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_varInit_in_varDeclPart3919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_propDecl3933 = new BitSet(new long[]{0x0000000100400000L,0x0000000200000080L});
    public static final BitSet FOLLOW_propAccessor_in_propDecl3937 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_COMMA_in_propDecl3939 = new BitSet(new long[]{0x0000000100400000L,0x0000000200000080L});
    public static final BitSet FOLLOW_propAccessor_in_propDecl3943 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_RPAREN_in_propDecl3945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_propAccessor0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_propDecl_in_propDeclOpt4065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQ_in_varInit4090 = new BitSet(new long[]{0x0080081000500000L,0x00003F827C600201L});
    public static final BitSet FOLLOW_expr_in_varInit4092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttrList_in_funcDecl4140 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_FUNCTION_in_funcDecl4143 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_NEW_in_funcDecl4145 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_LPAREN_in_funcDecl4147 = new BitSet(new long[]{0x0000000800600000L});
    public static final BitSet FOLLOW_paramList_in_funcDecl4149 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_RPAREN_in_funcDecl4151 = new BitSet(new long[]{0x0000000000840000L,0x0000000000000001L});
    public static final BitSet FOLLOW_typeTagOpt_in_funcDecl4153 = new BitSet(new long[]{0x0000000000840000L,0x0000000000000001L});
    public static final BitSet FOLLOW_block_in_funcDecl4155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttrList_in_funcDecl4210 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_FUNCTION_in_funcDecl4213 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_funcDecl4215 = new BitSet(new long[]{0x0008000000100000L});
    public static final BitSet FOLLOW_typeParamOpt_in_funcDecl4217 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_LPAREN_in_funcDecl4219 = new BitSet(new long[]{0x0000000800600000L});
    public static final BitSet FOLLOW_paramList_in_funcDecl4221 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_RPAREN_in_funcDecl4223 = new BitSet(new long[]{0x0000000000840000L,0x0000000000000001L});
    public static final BitSet FOLLOW_typeTagOpt_in_funcDecl4225 = new BitSet(new long[]{0x0000000000840000L,0x0000000000000001L});
    public static final BitSet FOLLOW_block_in_funcDecl4227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttrList_in_funcProtoDecl4297 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_FUNCTION_in_funcProtoDecl4299 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_NEW_in_funcProtoDecl4301 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_LPAREN_in_funcProtoDecl4303 = new BitSet(new long[]{0x0000000800600000L});
    public static final BitSet FOLLOW_paramList_in_funcProtoDecl4305 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_RPAREN_in_funcProtoDecl4307 = new BitSet(new long[]{0x0000000000840000L});
    public static final BitSet FOLLOW_typeTagOpt_in_funcProtoDecl4309 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_SEMI_in_funcProtoDecl4311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttrList_in_funcProtoDecl4352 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_FUNCTION_in_funcProtoDecl4354 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_funcProtoDecl4356 = new BitSet(new long[]{0x0008000000100000L});
    public static final BitSet FOLLOW_typeParamOpt_in_funcProtoDecl4358 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_LPAREN_in_funcProtoDecl4360 = new BitSet(new long[]{0x0000000800600000L});
    public static final BitSet FOLLOW_paramList_in_funcProtoDecl4362 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_RPAREN_in_funcProtoDecl4364 = new BitSet(new long[]{0x0000000000840000L});
    public static final BitSet FOLLOW_typeTagOpt_in_funcProtoDecl4366 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_SEMI_in_funcProtoDecl4368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_in_funcProtoDecl4412 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_NEW_in_funcProtoDecl4414 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_LPAREN_in_funcProtoDecl4416 = new BitSet(new long[]{0x0000000800600000L});
    public static final BitSet FOLLOW_paramList_in_funcProtoDecl4418 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_RPAREN_in_funcProtoDecl4420 = new BitSet(new long[]{0x0000000000840000L});
    public static final BitSet FOLLOW_typeTagOpt_in_funcProtoDecl4422 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_SEMI_in_funcProtoDecl4424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_in_funcProtoDecl4462 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_funcProtoDecl4464 = new BitSet(new long[]{0x0008000000100000L});
    public static final BitSet FOLLOW_typeParamOpt_in_funcProtoDecl4466 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_LPAREN_in_funcProtoDecl4468 = new BitSet(new long[]{0x0000000800600000L});
    public static final BitSet FOLLOW_paramList_in_funcProtoDecl4470 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_RPAREN_in_funcProtoDecl4472 = new BitSet(new long[]{0x0000000000840000L});
    public static final BitSet FOLLOW_typeTagOpt_in_funcProtoDecl4474 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_SEMI_in_funcProtoDecl4476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeDeclFlags_in_classDecl4530 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_CLASS_in_classDecl4532 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_classDecl4534 = new BitSet(new long[]{0x0008000000000000L,0x0000003000000001L});
    public static final BitSet FOLLOW_typeParamOpt_in_classDecl4536 = new BitSet(new long[]{0x0008000000000000L,0x0000003000000001L});
    public static final BitSet FOLLOW_inheritListOpt_in_classDecl4538 = new BitSet(new long[]{0x0008000000000000L,0x0000003000000001L});
    public static final BitSet FOLLOW_classBodyScope_in_classDecl4540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_classBodyScope4596 = new BitSet(new long[]{0x00000803E3080000L,0x0000000180000002L});
    public static final BitSet FOLLOW_classMember_in_classBodyScope4599 = new BitSet(new long[]{0x00000803E3080000L,0x0000000180000002L});
    public static final BitSet FOLLOW_RBRACE_in_classBodyScope4603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDecl_in_classMember4641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcDecl_in_classMember4652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumDecl_in_classMember4664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeDeclFlags_in_interfaceDecl4693 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_INTERFACE_in_interfaceDecl4695 = new BitSet(new long[]{0x0007801100400000L,0x0000003000000001L});
    public static final BitSet FOLLOW_type_in_interfaceDecl4697 = new BitSet(new long[]{0x0000000000000000L,0x0000003000000001L});
    public static final BitSet FOLLOW_inheritListOpt_in_interfaceDecl4699 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_LBRACE_in_interfaceDecl4701 = new BitSet(new long[]{0x00000803E2000000L,0x0000000100000002L});
    public static final BitSet FOLLOW_interfaceBody_in_interfaceDecl4704 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_RBRACE_in_interfaceDecl4706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDecl_in_interfaceBody4730 = new BitSet(new long[]{0x00000803E2000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_interfaceBody_in_interfaceBody4732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcProtoDecl_in_interfaceBody4742 = new BitSet(new long[]{0x00000803E2000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_interfaceBody_in_interfaceBody4744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inherit_in_inheritList4778 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_COMMA_in_inheritList4781 = new BitSet(new long[]{0x0000000000000000L,0x0000003000000000L});
    public static final BitSet FOLLOW_inherit_in_inheritList4784 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_inheritList_in_inheritListOpt4814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXTENDS_in_inherit4860 = new BitSet(new long[]{0x0007801100400000L,0x0000000000000001L});
    public static final BitSet FOLLOW_type_in_inherit4862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IMPLEMENTS_in_inherit4890 = new BitSet(new long[]{0x0007801100400000L,0x0000000000000001L});
    public static final BitSet FOLLOW_type_in_inherit4892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPEDEF_in_typedefDecl4932 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_typedefDecl4934 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_EQ_in_typedefDecl4936 = new BitSet(new long[]{0x0007C01100400000L,0x0000000000000001L});
    public static final BitSet FOLLOW_funcType_in_typedefDecl4938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GT_in_typeExtend4962 = new BitSet(new long[]{0x0007C01100400000L,0x0000000000000001L});
    public static final BitSet FOLLOW_funcType_in_typeExtend4964 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_COMMA_in_typeExtend4966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_anonType4990 = new BitSet(new long[]{0x00100003E2400000L,0x0000000100000002L});
    public static final BitSet FOLLOW_anonTypeFieldList_in_anonType5024 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_varDeclList_in_anonType5043 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_typeExtend_in_anonType5062 = new BitSet(new long[]{0x00000003E2400000L,0x0000000100000002L});
    public static final BitSet FOLLOW_anonTypeFieldList_in_anonType5094 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_varDeclList_in_anonType5124 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_RBRACE_in_anonType5151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_anonTypeField_in_anonTypeFieldList5177 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_COMMA_in_anonTypeFieldList5180 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_anonTypeField_in_anonTypeFieldList5183 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_LBRACE_in_objLit5199 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_objLitElemList_in_objLit5202 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_RBRACE_in_objLit5204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_anonTypeField5229 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_COLON_in_anonTypeField5231 = new BitSet(new long[]{0x0007C01100400000L,0x0000000000000001L});
    public static final BitSet FOLLOW_funcType_in_anonTypeField5234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objLitElem_in_objLitElemList5262 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_COMMA_in_objLitElemList5265 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_objLitElem_in_objLitElemList5268 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_objLitElem5294 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_COLON_in_objLitElem5296 = new BitSet(new long[]{0x0080081000500000L,0x00003F827C600201L});
    public static final BitSet FOLLOW_expr_in_objLitElem5299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LONGLITERAL_in_elementarySymbol5322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_elementarySymbol5343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTLITERAL_in_elementarySymbol5363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRINGLITERAL_in_elementarySymbol5384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARLITERAL_in_elementarySymbol5405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOATNUM_in_elementarySymbol5426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_elementarySymbol5447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_elementarySymbol5472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeTagOpt_in_synpred28_Haxe939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_synpred34_Haxe1144 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_MINUS_BIGGER_in_synpred34_Haxe1148 = new BitSet(new long[]{0x0007C01100400000L,0x0000000000000001L});
    public static final BitSet FOLLOW_type_in_synpred34_Haxe1151 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_typeParam_in_synpred41_Haxe1240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_anonType_in_synpred42_Haxe1224 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_dotIdent_in_synpred42_Haxe1229 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_primitiveType_in_synpred42_Haxe1234 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_typeParam_in_synpred42_Haxe1240 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_LT_in_synpred43_Haxe1288 = new BitSet(new long[]{0x0007801500400000L,0x0000000000000001L});
    public static final BitSet FOLLOW_typeList_in_synpred43_Haxe1291 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_GT_in_synpred43_Haxe1293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_in_synpred44_Haxe1305 = new BitSet(new long[]{0x0007801500400000L,0x0000000000000001L});
    public static final BitSet FOLLOW_typeList_in_synpred44_Haxe1308 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_LT_in_synpred44_Haxe1310 = new BitSet(new long[]{0x0007801500400000L,0x0000000000000001L});
    public static final BitSet FOLLOW_typeList_in_synpred44_Haxe1313 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_GTGT_in_synpred44_Haxe1315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeParam_in_synpred45_Haxe1374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_synpred47_Haxe1533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignExpr_in_synpred48_Haxe1544 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_SEMI_in_synpred48_Haxe1546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_synpred50_Haxe1578 = new BitSet(new long[]{0xF5800813E2D40000L,0x00003F837C60023DL});
    public static final BitSet FOLLOW_statement_in_synpred50_Haxe1582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_synpred65_Haxe2043 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_SEMI_in_synpred65_Haxe2046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_synpred66_Haxe2058 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_COLON_in_synpred66_Haxe2060 = new BitSet(new long[]{0xF5800813E2D40000L,0x00003F837C60023DL});
    public static final BitSet FOLLOW_statement_in_synpred66_Haxe2062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDecl_in_synpred69_Haxe2220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classDecl_in_synpred70_Haxe2231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_suffixExpr_in_synpred99_Haxe3007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_synpred108_Haxe3104 = new BitSet(new long[]{0x0000100000100000L});
    public static final BitSet FOLLOW_methodCallOrSliceList_in_synpred108_Haxe3106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_synpred109_Haxe3133 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_PLUSPLUS_in_synpred109_Haxe3135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_methodCallOrSlice_in_synpred111_Haxe3288 = new BitSet(new long[]{0x0000100000100000L});
    public static final BitSet FOLLOW_methodCallOrSliceList_in_synpred111_Haxe3290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_synpred114_Haxe3354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CAST_in_synpred117_Haxe3440 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_LPAREN_in_synpred117_Haxe3442 = new BitSet(new long[]{0x0080081000500000L,0x00003F827C600201L});
    public static final BitSet FOLLOW_expr_in_synpred117_Haxe3444 = new BitSet(new long[]{0x0000000400200000L});
    public static final BitSet FOLLOW_COMMA_in_synpred117_Haxe3447 = new BitSet(new long[]{0x0007C01100400000L,0x0000000000000001L});
    public static final BitSet FOLLOW_funcType_in_synpred117_Haxe3449 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_RPAREN_in_synpred117_Haxe3453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classDecl_in_synpred118_Haxe3552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interfaceDecl_in_synpred119_Haxe3562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumDecl_in_synpred120_Haxe3572 = new BitSet(new long[]{0x0000000000000002L});

}