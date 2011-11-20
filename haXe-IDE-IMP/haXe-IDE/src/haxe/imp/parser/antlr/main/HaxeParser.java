// $ANTLR 3.4 Haxe.g 2011-11-21 01:04:46

package haxe.imp.parser.antlr.main;

import haxe.imp.parser.antlr.tree.HaxeTree;
import haxe.imp.parser.antlr.tree.specific.AssignOperationNode;
import haxe.imp.parser.antlr.tree.specific.BinaryExpressionNode;
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


@SuppressWarnings({"all", "warnings", "unchecked"})
public class HaxeParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ABSTRACT", "AMP", "AMPAMP", "AMPEQ", "ASSIGN_OPERATOR", "BANG", "BANGEQ", "BANGEQQ", "BAR", "BARBAR", "BAREQ", "BIN_OP", "BLOCK_SCOPE", "BOOLEAN", "BREAK", "BYTE", "CARET", "CARETEQ", "CASE", "CAST", "CATCH", "CHAR", "CHARLITERAL", "CLASS", "COLON", "COMMA", "COMMENT", "CONST", "CONTINUE", "DECL_ATTR_LIST", "DEFAULT", "DO", "DOT", "DOUBLE", "DYNAMIC", "ELLIPSIS", "ELSE", "ELSE_TOKEN", "ENDIF_TOKEN", "ENUM", "EQ", "EQEQ", "EQEQEQ", "ESC_SEQ", "EXPONENT", "EXTENDS", "EXTERN", "EscapeSequence", "Exponent", "FALSE", "FINAL", "FINALLY", "FLOAT", "FLOATNUM", "FOR", "FUNCTION", "GOTO", "GT", "GTEQ", "GTGT", "GTGTEQ", "GTGTGT", "GTGTGTEQ", "HEX_DIGIT", "HexDigit", "HexPrefix", "IDENT", "IDENTIFIER", "IF", "IF_TOKEN", "IMPLEMENTS", "IMPORT", "IN", "INHERIT_LIST_OPT", "INLINE", "INSTANCEOF", "INT", "INTERFACE", "INTLITERAL", "INTNUM", "IntegerNumber", "LBRACE", "LBRACKET", "LONG", "LONGLITERAL", "LPAREN", "LT", "LTEQ", "LTLT", "LTLTEQ", "LongSuffix", "MINUS_BIGGER", "MODULE", "MONKEYS_AT", "NATIVE", "NEW", "NULL", "OCTAL_ESC", "OVERRIDE", "PACKAGE", "PARAM_LIST", "PERCENT", "PERCENTBB", "PERCENTBBB", "PERCENTDBBQ", "PERCENTDBQ", "PERCENTDLQ", "PERCENTEQ", "PERCENTLESQ", "PERCENTLL", "PLUS", "PLUSEQ", "PLUSPLUS", "PP_AND_EXPRESSION", "PP_CONDITIONAL", "PP_ELSE", "PP_ELSEIF", "PP_END", "PP_ERROR", "PP_EXPRESSION", "PP_IF", "PP_OR_EXPRESSION", "PP_PRIMARY_EXPRESSION", "PP_UNARY_EXPRESSION", "PREFIX_EXPR", "PREPROCESSOR_DIRECTIVE", "PRIVATE", "PROPERTY_DECL", "PROTECTED", "PUBLIC", "QUES", "RBRACE", "RBRACKET", "RETURN", "RPAREN", "SEMI", "SHORT", "SLASH", "SLASHEQ", "STAR", "STAREQ", "STATIC", "STRICTFP", "STRINGLITERAL", "SUB", "SUBEQ", "SUBSUB", "SUFFIX_EXPR", "SUPER", "SWITCH", "THIS", "THROW", "THROWS", "TILDE", "TRANSIENT", "TRUE", "TRY", "TS", "TYPEDEF", "TYPE_PARAM_OPT", "TYPE_TAG", "UNICODE_ESC", "UNTYPED", "USING", "VAR", "VAR_INIT", "VOID", "VOLATILE", "WHILE", "WS"
    };

    public static final int EOF=-1;
    public static final int ABSTRACT=4;
    public static final int AMP=5;
    public static final int AMPAMP=6;
    public static final int AMPEQ=7;
    public static final int ASSIGN_OPERATOR=8;
    public static final int BANG=9;
    public static final int BANGEQ=10;
    public static final int BANGEQQ=11;
    public static final int BAR=12;
    public static final int BARBAR=13;
    public static final int BAREQ=14;
    public static final int BIN_OP=15;
    public static final int BLOCK_SCOPE=16;
    public static final int BOOLEAN=17;
    public static final int BREAK=18;
    public static final int BYTE=19;
    public static final int CARET=20;
    public static final int CARETEQ=21;
    public static final int CASE=22;
    public static final int CAST=23;
    public static final int CATCH=24;
    public static final int CHAR=25;
    public static final int CHARLITERAL=26;
    public static final int CLASS=27;
    public static final int COLON=28;
    public static final int COMMA=29;
    public static final int COMMENT=30;
    public static final int CONST=31;
    public static final int CONTINUE=32;
    public static final int DECL_ATTR_LIST=33;
    public static final int DEFAULT=34;
    public static final int DO=35;
    public static final int DOT=36;
    public static final int DOUBLE=37;
    public static final int DYNAMIC=38;
    public static final int ELLIPSIS=39;
    public static final int ELSE=40;
    public static final int ELSE_TOKEN=41;
    public static final int ENDIF_TOKEN=42;
    public static final int ENUM=43;
    public static final int EQ=44;
    public static final int EQEQ=45;
    public static final int EQEQEQ=46;
    public static final int ESC_SEQ=47;
    public static final int EXPONENT=48;
    public static final int EXTENDS=49;
    public static final int EXTERN=50;
    public static final int EscapeSequence=51;
    public static final int Exponent=52;
    public static final int FALSE=53;
    public static final int FINAL=54;
    public static final int FINALLY=55;
    public static final int FLOAT=56;
    public static final int FLOATNUM=57;
    public static final int FOR=58;
    public static final int FUNCTION=59;
    public static final int GOTO=60;
    public static final int GT=61;
    public static final int GTEQ=62;
    public static final int GTGT=63;
    public static final int GTGTEQ=64;
    public static final int GTGTGT=65;
    public static final int GTGTGTEQ=66;
    public static final int HEX_DIGIT=67;
    public static final int HexDigit=68;
    public static final int HexPrefix=69;
    public static final int IDENT=70;
    public static final int IDENTIFIER=71;
    public static final int IF=72;
    public static final int IF_TOKEN=73;
    public static final int IMPLEMENTS=74;
    public static final int IMPORT=75;
    public static final int IN=76;
    public static final int INHERIT_LIST_OPT=77;
    public static final int INLINE=78;
    public static final int INSTANCEOF=79;
    public static final int INT=80;
    public static final int INTERFACE=81;
    public static final int INTLITERAL=82;
    public static final int INTNUM=83;
    public static final int IntegerNumber=84;
    public static final int LBRACE=85;
    public static final int LBRACKET=86;
    public static final int LONG=87;
    public static final int LONGLITERAL=88;
    public static final int LPAREN=89;
    public static final int LT=90;
    public static final int LTEQ=91;
    public static final int LTLT=92;
    public static final int LTLTEQ=93;
    public static final int LongSuffix=94;
    public static final int MINUS_BIGGER=95;
    public static final int MODULE=96;
    public static final int MONKEYS_AT=97;
    public static final int NATIVE=98;
    public static final int NEW=99;
    public static final int NULL=100;
    public static final int OCTAL_ESC=101;
    public static final int OVERRIDE=102;
    public static final int PACKAGE=103;
    public static final int PARAM_LIST=104;
    public static final int PERCENT=105;
    public static final int PERCENTBB=106;
    public static final int PERCENTBBB=107;
    public static final int PERCENTDBBQ=108;
    public static final int PERCENTDBQ=109;
    public static final int PERCENTDLQ=110;
    public static final int PERCENTEQ=111;
    public static final int PERCENTLESQ=112;
    public static final int PERCENTLL=113;
    public static final int PLUS=114;
    public static final int PLUSEQ=115;
    public static final int PLUSPLUS=116;
    public static final int PP_AND_EXPRESSION=117;
    public static final int PP_CONDITIONAL=118;
    public static final int PP_ELSE=119;
    public static final int PP_ELSEIF=120;
    public static final int PP_END=121;
    public static final int PP_ERROR=122;
    public static final int PP_EXPRESSION=123;
    public static final int PP_IF=124;
    public static final int PP_OR_EXPRESSION=125;
    public static final int PP_PRIMARY_EXPRESSION=126;
    public static final int PP_UNARY_EXPRESSION=127;
    public static final int PREFIX_EXPR=128;
    public static final int PREPROCESSOR_DIRECTIVE=129;
    public static final int PRIVATE=130;
    public static final int PROPERTY_DECL=131;
    public static final int PROTECTED=132;
    public static final int PUBLIC=133;
    public static final int QUES=134;
    public static final int RBRACE=135;
    public static final int RBRACKET=136;
    public static final int RETURN=137;
    public static final int RPAREN=138;
    public static final int SEMI=139;
    public static final int SHORT=140;
    public static final int SLASH=141;
    public static final int SLASHEQ=142;
    public static final int STAR=143;
    public static final int STAREQ=144;
    public static final int STATIC=145;
    public static final int STRICTFP=146;
    public static final int STRINGLITERAL=147;
    public static final int SUB=148;
    public static final int SUBEQ=149;
    public static final int SUBSUB=150;
    public static final int SUFFIX_EXPR=151;
    public static final int SUPER=152;
    public static final int SWITCH=153;
    public static final int THIS=154;
    public static final int THROW=155;
    public static final int THROWS=156;
    public static final int TILDE=157;
    public static final int TRANSIENT=158;
    public static final int TRUE=159;
    public static final int TRY=160;
    public static final int TS=161;
    public static final int TYPEDEF=162;
    public static final int TYPE_PARAM_OPT=163;
    public static final int TYPE_TAG=164;
    public static final int UNICODE_ESC=165;
    public static final int UNTYPED=166;
    public static final int USING=167;
    public static final int VAR=168;
    public static final int VAR_INIT=169;
    public static final int VOID=170;
    public static final int VOLATILE=171;
    public static final int WHILE=172;
    public static final int WS=173;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

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
    // Haxe.g:66:1: module : ( myPackage )? topLevelList -> ^( MODULE[\"MODULE\",true] ( myPackage )? ( topLevelList )? ) ;
    public final HaxeParser.module_return module() throws RecognitionException {
        HaxeParser.module_return retval = new HaxeParser.module_return();
        retval.start = input.LT(1);

        int module_StartIndex = input.index();

        Object root_0 = null;

        HaxeParser.myPackage_return myPackage1 =null;

        HaxeParser.topLevelList_return topLevelList2 =null;


        RewriteRuleSubtreeStream stream_myPackage=new RewriteRuleSubtreeStream(adaptor,"rule myPackage");
        RewriteRuleSubtreeStream stream_topLevelList=new RewriteRuleSubtreeStream(adaptor,"rule topLevelList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return retval; }

            // Haxe.g:67:5: ( ( myPackage )? topLevelList -> ^( MODULE[\"MODULE\",true] ( myPackage )? ( topLevelList )? ) )
            // Haxe.g:67:7: ( myPackage )? topLevelList
            {
            // Haxe.g:67:7: ( myPackage )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==PACKAGE) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // Haxe.g:67:7: myPackage
                    {
                    pushFollow(FOLLOW_myPackage_in_module180);
                    myPackage1=myPackage();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_myPackage.add(myPackage1.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_topLevelList_in_module183);
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
            // 67:31: -> ^( MODULE[\"MODULE\",true] ( myPackage )? ( topLevelList )? )
            {
                // Haxe.g:67:34: ^( MODULE[\"MODULE\",true] ( myPackage )? ( topLevelList )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                new HaxeTree(MODULE, "MODULE", true)
                , root_1);

                // Haxe.g:67:68: ( myPackage )?
                if ( stream_myPackage.hasNext() ) {
                    adaptor.addChild(root_1, stream_myPackage.nextTree());

                }
                stream_myPackage.reset();

                // Haxe.g:67:79: ( topLevelList )?
                if ( stream_topLevelList.hasNext() ) {
                    adaptor.addChild(root_1, stream_topLevelList.nextTree());

                }
                stream_topLevelList.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
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
        	// do for sure before leaving
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
    // Haxe.g:70:1: topLevelList : ( topLevel )* ;
    public final HaxeParser.topLevelList_return topLevelList() throws RecognitionException {
        HaxeParser.topLevelList_return retval = new HaxeParser.topLevelList_return();
        retval.start = input.LT(1);

        int topLevelList_StartIndex = input.index();

        Object root_0 = null;

        HaxeParser.topLevel_return topLevel3 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return retval; }

            // Haxe.g:71:5: ( ( topLevel )* )
            // Haxe.g:71:7: ( topLevel )*
            {
            root_0 = (Object)adaptor.nil();


            // Haxe.g:71:7: ( topLevel )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==CLASS||LA2_0==ENUM||LA2_0==EXTERN||LA2_0==IMPORT||LA2_0==INTERFACE||LA2_0==MONKEYS_AT||LA2_0==PRIVATE||LA2_0==TYPEDEF||LA2_0==USING) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // Haxe.g:71:8: topLevel
            	    {
            	    pushFollow(FOLLOW_topLevel_in_topLevelList221);
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
        	// do for sure before leaving
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
    // Haxe.g:74:1: topLevel : ( myImport | topLevelDecl );
    public final HaxeParser.topLevel_return topLevel() throws RecognitionException {
        HaxeParser.topLevel_return retval = new HaxeParser.topLevel_return();
        retval.start = input.LT(1);

        int topLevel_StartIndex = input.index();

        Object root_0 = null;

        HaxeParser.myImport_return myImport4 =null;

        HaxeParser.topLevelDecl_return topLevelDecl5 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return retval; }

            // Haxe.g:75:5: ( myImport | topLevelDecl )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==IMPORT||LA3_0==USING) ) {
                alt3=1;
            }
            else if ( (LA3_0==CLASS||LA3_0==ENUM||LA3_0==EXTERN||LA3_0==INTERFACE||LA3_0==MONKEYS_AT||LA3_0==PRIVATE||LA3_0==TYPEDEF) ) {
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
                    // Haxe.g:75:7: myImport
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_myImport_in_topLevel240);
                    myImport4=myImport();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, myImport4.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:77:7: topLevelDecl
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_topLevelDecl_in_topLevel249);
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
        	// do for sure before leaving
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
    // Haxe.g:80:1: myPackage : PACKAGE dotIdent SEMI -> ^( PACKAGE ( dotIdent )? ) ;
    public final HaxeParser.myPackage_return myPackage() throws RecognitionException {
        HaxeParser.myPackage_return retval = new HaxeParser.myPackage_return();
        retval.start = input.LT(1);

        int myPackage_StartIndex = input.index();

        Object root_0 = null;

        Token PACKAGE6=null;
        Token SEMI8=null;
        HaxeParser.dotIdent_return dotIdent7 =null;


        Object PACKAGE6_tree=null;
        Object SEMI8_tree=null;
        RewriteRuleTokenStream stream_PACKAGE=new RewriteRuleTokenStream(adaptor,"token PACKAGE");
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleSubtreeStream stream_dotIdent=new RewriteRuleSubtreeStream(adaptor,"rule dotIdent");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return retval; }

            // Haxe.g:81:5: ( PACKAGE dotIdent SEMI -> ^( PACKAGE ( dotIdent )? ) )
            // Haxe.g:81:7: PACKAGE dotIdent SEMI
            {
            PACKAGE6=(Token)match(input,PACKAGE,FOLLOW_PACKAGE_in_myPackage266); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_PACKAGE.add(PACKAGE6);


            pushFollow(FOLLOW_dotIdent_in_myPackage268);
            dotIdent7=dotIdent();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_dotIdent.add(dotIdent7.getTree());

            SEMI8=(Token)match(input,SEMI,FOLLOW_SEMI_in_myPackage270); if (state.failed) return retval; 
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
            // 81:29: -> ^( PACKAGE ( dotIdent )? )
            {
                // Haxe.g:81:32: ^( PACKAGE ( dotIdent )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_PACKAGE.nextNode()
                , root_1);

                // Haxe.g:81:42: ( dotIdent )?
                if ( stream_dotIdent.hasNext() ) {
                    adaptor.addChild(root_1, stream_dotIdent.nextTree());

                }
                stream_dotIdent.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
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
        	// do for sure before leaving
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
    // Haxe.g:84:1: meta : MONKEYS_AT metaName ( LPAREN paramList RPAREN )? ;
    public final HaxeParser.meta_return meta() throws RecognitionException {
        HaxeParser.meta_return retval = new HaxeParser.meta_return();
        retval.start = input.LT(1);

        int meta_StartIndex = input.index();

        Object root_0 = null;

        Token MONKEYS_AT9=null;
        Token LPAREN11=null;
        Token RPAREN13=null;
        HaxeParser.metaName_return metaName10 =null;

        HaxeParser.paramList_return paramList12 =null;


        Object MONKEYS_AT9_tree=null;
        Object LPAREN11_tree=null;
        Object RPAREN13_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return retval; }

            // Haxe.g:84:9: ( MONKEYS_AT metaName ( LPAREN paramList RPAREN )? )
            // Haxe.g:84:11: MONKEYS_AT metaName ( LPAREN paramList RPAREN )?
            {
            root_0 = (Object)adaptor.nil();


            MONKEYS_AT9=(Token)match(input,MONKEYS_AT,FOLLOW_MONKEYS_AT_in_meta295); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            MONKEYS_AT9_tree = 
            (Object)adaptor.create(MONKEYS_AT9)
            ;
            adaptor.addChild(root_0, MONKEYS_AT9_tree);
            }

            pushFollow(FOLLOW_metaName_in_meta297);
            metaName10=metaName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, metaName10.getTree());

            // Haxe.g:84:31: ( LPAREN paramList RPAREN )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==LPAREN) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // Haxe.g:84:32: LPAREN paramList RPAREN
                    {
                    LPAREN11=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_meta300); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LPAREN11_tree = 
                    (Object)adaptor.create(LPAREN11)
                    ;
                    adaptor.addChild(root_0, LPAREN11_tree);
                    }

                    pushFollow(FOLLOW_paramList_in_meta302);
                    paramList12=paramList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, paramList12.getTree());

                    RPAREN13=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_meta304); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RPAREN13_tree = 
                    (Object)adaptor.create(RPAREN13)
                    ;
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
        	// do for sure before leaving
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
    // Haxe.g:87:1: metaName : ( IDENTIFIER | primitiveType | COLON metaName );
    public final HaxeParser.metaName_return metaName() throws RecognitionException {
        HaxeParser.metaName_return retval = new HaxeParser.metaName_return();
        retval.start = input.LT(1);

        int metaName_StartIndex = input.index();

        Object root_0 = null;

        Token IDENTIFIER14=null;
        Token COLON16=null;
        HaxeParser.primitiveType_return primitiveType15 =null;

        HaxeParser.metaName_return metaName17 =null;


        Object IDENTIFIER14_tree=null;
        Object COLON16_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return retval; }

            // Haxe.g:88:5: ( IDENTIFIER | primitiveType | COLON metaName )
            int alt5=3;
            switch ( input.LA(1) ) {
            case IDENTIFIER:
                {
                alt5=1;
                }
                break;
            case BOOLEAN:
            case DYNAMIC:
            case FLOAT:
            case INT:
            case VOID:
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
                    // Haxe.g:88:7: IDENTIFIER
                    {
                    root_0 = (Object)adaptor.nil();


                    IDENTIFIER14=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_metaName323); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER14_tree = 
                    (Object)adaptor.create(IDENTIFIER14)
                    ;
                    adaptor.addChild(root_0, IDENTIFIER14_tree);
                    }

                    }
                    break;
                case 2 :
                    // Haxe.g:89:7: primitiveType
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_primitiveType_in_metaName331);
                    primitiveType15=primitiveType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveType15.getTree());

                    }
                    break;
                case 3 :
                    // Haxe.g:91:7: COLON metaName
                    {
                    root_0 = (Object)adaptor.nil();


                    COLON16=(Token)match(input,COLON,FOLLOW_COLON_in_metaName340); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    COLON16_tree = 
                    (Object)adaptor.create(COLON16)
                    ;
                    adaptor.addChild(root_0, COLON16_tree);
                    }

                    pushFollow(FOLLOW_metaName_in_metaName342);
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
        	// do for sure before leaving
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
    // Haxe.g:94:1: typeDeclFlags : ( meta )* ( EXTERN | PRIVATE )* ;
    public final HaxeParser.typeDeclFlags_return typeDeclFlags() throws RecognitionException {
        HaxeParser.typeDeclFlags_return retval = new HaxeParser.typeDeclFlags_return();
        retval.start = input.LT(1);

        int typeDeclFlags_StartIndex = input.index();

        Object root_0 = null;

        Token set19=null;
        HaxeParser.meta_return meta18 =null;


        Object set19_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return retval; }

            // Haxe.g:95:5: ( ( meta )* ( EXTERN | PRIVATE )* )
            // Haxe.g:95:7: ( meta )* ( EXTERN | PRIVATE )*
            {
            root_0 = (Object)adaptor.nil();


            // Haxe.g:95:7: ( meta )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==MONKEYS_AT) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // Haxe.g:95:8: meta
            	    {
            	    pushFollow(FOLLOW_meta_in_typeDeclFlags360);
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


            // Haxe.g:95:15: ( EXTERN | PRIVATE )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==EXTERN||LA7_0==PRIVATE) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // Haxe.g:
            	    {
            	    set19=(Token)input.LT(1);

            	    if ( input.LA(1)==EXTERN||input.LA(1)==PRIVATE ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
            	        (Object)adaptor.create(set19)
            	        );
            	        state.errorRecovery=false;
            	        state.failed=false;
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
        	// do for sure before leaving
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
    // Haxe.g:98:1: qualifiedIdentifier : (a= IDENTIFIER -> $a) ( DOT ident= IDENTIFIER -> ^( DOT $qualifiedIdentifier $ident) )* ;
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

            // Haxe.g:99:5: ( (a= IDENTIFIER -> $a) ( DOT ident= IDENTIFIER -> ^( DOT $qualifiedIdentifier $ident) )* )
            // Haxe.g:99:7: (a= IDENTIFIER -> $a) ( DOT ident= IDENTIFIER -> ^( DOT $qualifiedIdentifier $ident) )*
            {
            // Haxe.g:99:7: (a= IDENTIFIER -> $a)
            // Haxe.g:99:8: a= IDENTIFIER
            {
            a=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_qualifiedIdentifier395); if (state.failed) return retval; 
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
            // 99:22: -> $a
            {
                adaptor.addChild(root_0, stream_a.nextNode());

            }


            retval.tree = root_0;
            }

            }


            // Haxe.g:99:30: ( DOT ident= IDENTIFIER -> ^( DOT $qualifiedIdentifier $ident) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==DOT) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // Haxe.g:99:31: DOT ident= IDENTIFIER
            	    {
            	    DOT20=(Token)match(input,DOT,FOLLOW_DOT_in_qualifiedIdentifier406); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_DOT.add(DOT20);


            	    ident=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_qualifiedIdentifier410); if (state.failed) return retval; 
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
            	    // 99:53: -> ^( DOT $qualifiedIdentifier $ident)
            	    {
            	        // Haxe.g:99:57: ^( DOT $qualifiedIdentifier $ident)
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot(
            	        stream_DOT.nextNode()
            	        , root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());

            	        adaptor.addChild(root_1, stream_ident.nextNode());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }


            	    retval.tree = root_0;
            	    }

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
        	// do for sure before leaving
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
    // Haxe.g:102:1: myImport : ( IMPORT ^ dotIdent SEMI !| USING ^ dotIdent SEMI !);
    public final HaxeParser.myImport_return myImport() throws RecognitionException {
        HaxeParser.myImport_return retval = new HaxeParser.myImport_return();
        retval.start = input.LT(1);

        int myImport_StartIndex = input.index();

        Object root_0 = null;

        Token IMPORT21=null;
        Token SEMI23=null;
        Token USING24=null;
        Token SEMI26=null;
        HaxeParser.dotIdent_return dotIdent22 =null;

        HaxeParser.dotIdent_return dotIdent25 =null;


        Object IMPORT21_tree=null;
        Object SEMI23_tree=null;
        Object USING24_tree=null;
        Object SEMI26_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return retval; }

            // Haxe.g:103:5: ( IMPORT ^ dotIdent SEMI !| USING ^ dotIdent SEMI !)
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
                    // Haxe.g:103:7: IMPORT ^ dotIdent SEMI !
                    {
                    root_0 = (Object)adaptor.nil();


                    IMPORT21=(Token)match(input,IMPORT,FOLLOW_IMPORT_in_myImport448); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IMPORT21_tree = 
                    (Object)adaptor.create(IMPORT21)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(IMPORT21_tree, root_0);
                    }

                    pushFollow(FOLLOW_dotIdent_in_myImport451);
                    dotIdent22=dotIdent();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dotIdent22.getTree());

                    SEMI23=(Token)match(input,SEMI,FOLLOW_SEMI_in_myImport453); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // Haxe.g:104:7: USING ^ dotIdent SEMI !
                    {
                    root_0 = (Object)adaptor.nil();


                    USING24=(Token)match(input,USING,FOLLOW_USING_in_myImport462); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    USING24_tree = 
                    (Object)adaptor.create(USING24)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(USING24_tree, root_0);
                    }

                    pushFollow(FOLLOW_dotIdent_in_myImport465);
                    dotIdent25=dotIdent();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dotIdent25.getTree());

                    SEMI26=(Token)match(input,SEMI,FOLLOW_SEMI_in_myImport467); if (state.failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
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
    // Haxe.g:108:1: access : ( PUBLIC | PRIVATE );
    public final HaxeParser.access_return access() throws RecognitionException {
        HaxeParser.access_return retval = new HaxeParser.access_return();
        retval.start = input.LT(1);

        int access_StartIndex = input.index();

        Object root_0 = null;

        Token set27=null;

        Object set27_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return retval; }

            // Haxe.g:109:5: ( PUBLIC | PRIVATE )
            // Haxe.g:
            {
            root_0 = (Object)adaptor.nil();


            set27=(Token)input.LT(1);

            if ( input.LA(1)==PRIVATE||input.LA(1)==PUBLIC ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (Object)adaptor.create(set27)
                );
                state.errorRecovery=false;
                state.failed=false;
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
        	// do for sure before leaving
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
    // Haxe.g:113:1: declAttr : ( STATIC | INLINE | DYNAMIC | OVERRIDE | access );
    public final HaxeParser.declAttr_return declAttr() throws RecognitionException {
        HaxeParser.declAttr_return retval = new HaxeParser.declAttr_return();
        retval.start = input.LT(1);

        int declAttr_StartIndex = input.index();

        Object root_0 = null;

        Token STATIC28=null;
        Token INLINE29=null;
        Token DYNAMIC30=null;
        Token OVERRIDE31=null;
        HaxeParser.access_return access32 =null;


        Object STATIC28_tree=null;
        Object INLINE29_tree=null;
        Object DYNAMIC30_tree=null;
        Object OVERRIDE31_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return retval; }

            // Haxe.g:114:5: ( STATIC | INLINE | DYNAMIC | OVERRIDE | access )
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
                    // Haxe.g:114:7: STATIC
                    {
                    root_0 = (Object)adaptor.nil();


                    STATIC28=(Token)match(input,STATIC,FOLLOW_STATIC_in_declAttr511); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STATIC28_tree = 
                    (Object)adaptor.create(STATIC28)
                    ;
                    adaptor.addChild(root_0, STATIC28_tree);
                    }

                    }
                    break;
                case 2 :
                    // Haxe.g:115:7: INLINE
                    {
                    root_0 = (Object)adaptor.nil();


                    INLINE29=(Token)match(input,INLINE,FOLLOW_INLINE_in_declAttr519); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INLINE29_tree = 
                    (Object)adaptor.create(INLINE29)
                    ;
                    adaptor.addChild(root_0, INLINE29_tree);
                    }

                    }
                    break;
                case 3 :
                    // Haxe.g:116:7: DYNAMIC
                    {
                    root_0 = (Object)adaptor.nil();


                    DYNAMIC30=(Token)match(input,DYNAMIC,FOLLOW_DYNAMIC_in_declAttr527); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DYNAMIC30_tree = 
                    (Object)adaptor.create(DYNAMIC30)
                    ;
                    adaptor.addChild(root_0, DYNAMIC30_tree);
                    }

                    }
                    break;
                case 4 :
                    // Haxe.g:117:7: OVERRIDE
                    {
                    root_0 = (Object)adaptor.nil();


                    OVERRIDE31=(Token)match(input,OVERRIDE,FOLLOW_OVERRIDE_in_declAttr535); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    OVERRIDE31_tree = 
                    (Object)adaptor.create(OVERRIDE31)
                    ;
                    adaptor.addChild(root_0, OVERRIDE31_tree);
                    }

                    }
                    break;
                case 5 :
                    // Haxe.g:118:7: access
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_access_in_declAttr543);
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
        	// do for sure before leaving
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
    // Haxe.g:121:1: declAttrList : ( declAttr )+ -> ^( DECL_ATTR_LIST[\"DECL_ATTR_LIST\", true] ( declAttr )+ ) ;
    public final HaxeParser.declAttrList_return declAttrList() throws RecognitionException {
        HaxeParser.declAttrList_return retval = new HaxeParser.declAttrList_return();
        retval.start = input.LT(1);

        int declAttrList_StartIndex = input.index();

        Object root_0 = null;

        HaxeParser.declAttr_return declAttr33 =null;


        RewriteRuleSubtreeStream stream_declAttr=new RewriteRuleSubtreeStream(adaptor,"rule declAttr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return retval; }

            // Haxe.g:122:5: ( ( declAttr )+ -> ^( DECL_ATTR_LIST[\"DECL_ATTR_LIST\", true] ( declAttr )+ ) )
            // Haxe.g:122:7: ( declAttr )+
            {
            // Haxe.g:122:7: ( declAttr )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==DYNAMIC||LA11_0==INLINE||LA11_0==OVERRIDE||LA11_0==PRIVATE||LA11_0==PUBLIC||LA11_0==STATIC) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // Haxe.g:122:8: declAttr
            	    {
            	    pushFollow(FOLLOW_declAttr_in_declAttrList561);
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
            // 122:19: -> ^( DECL_ATTR_LIST[\"DECL_ATTR_LIST\", true] ( declAttr )+ )
            {
                // Haxe.g:122:22: ^( DECL_ATTR_LIST[\"DECL_ATTR_LIST\", true] ( declAttr )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                new HaxeTree(DECL_ATTR_LIST, "DECL_ATTR_LIST", true)
                , root_1);

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


            retval.tree = root_0;
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
        	// do for sure before leaving
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
    // Haxe.g:125:1: paramList : ( param ( COMMA param )* -> ^( PARAM_LIST[\"PARAM_LIST\", true] ( param )+ ) |);
    public final HaxeParser.paramList_return paramList() throws RecognitionException {
        HaxeParser.paramList_return retval = new HaxeParser.paramList_return();
        retval.start = input.LT(1);

        int paramList_StartIndex = input.index();

        Object root_0 = null;

        Token COMMA35=null;
        HaxeParser.param_return param34 =null;

        HaxeParser.param_return param36 =null;


        Object COMMA35_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_param=new RewriteRuleSubtreeStream(adaptor,"rule param");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return retval; }

            // Haxe.g:126:5: ( param ( COMMA param )* -> ^( PARAM_LIST[\"PARAM_LIST\", true] ( param )+ ) |)
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
                    // Haxe.g:126:7: param ( COMMA param )*
                    {
                    pushFollow(FOLLOW_param_in_paramList593);
                    param34=param();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_param.add(param34.getTree());

                    // Haxe.g:126:13: ( COMMA param )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==COMMA) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // Haxe.g:126:14: COMMA param
                    	    {
                    	    COMMA35=(Token)match(input,COMMA,FOLLOW_COMMA_in_paramList596); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA35);


                    	    pushFollow(FOLLOW_param_in_paramList598);
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
                    // 126:28: -> ^( PARAM_LIST[\"PARAM_LIST\", true] ( param )+ )
                    {
                        // Haxe.g:126:31: ^( PARAM_LIST[\"PARAM_LIST\", true] ( param )+ )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        new HaxeTree(PARAM_LIST, "PARAM_LIST", true)
                        , root_1);

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


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // Haxe.g:128:5: 
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
        	// do for sure before leaving
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
    // Haxe.g:130:1: param : ( QUES )? IDENTIFIER typeTagOpt varInit -> ^( VAR[$IDENTIFIER, true] ( IDENTIFIER )? ( typeTagOpt )? ( varInit )? ( QUES )? ) ;
    public final HaxeParser.param_return param() throws RecognitionException {
        HaxeParser.param_return retval = new HaxeParser.param_return();
        retval.start = input.LT(1);

        int param_StartIndex = input.index();

        Object root_0 = null;

        Token QUES37=null;
        Token IDENTIFIER38=null;
        HaxeParser.typeTagOpt_return typeTagOpt39 =null;

        HaxeParser.varInit_return varInit40 =null;


        Object QUES37_tree=null;
        Object IDENTIFIER38_tree=null;
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_QUES=new RewriteRuleTokenStream(adaptor,"token QUES");
        RewriteRuleSubtreeStream stream_typeTagOpt=new RewriteRuleSubtreeStream(adaptor,"rule typeTagOpt");
        RewriteRuleSubtreeStream stream_varInit=new RewriteRuleSubtreeStream(adaptor,"rule varInit");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return retval; }

            // Haxe.g:131:5: ( ( QUES )? IDENTIFIER typeTagOpt varInit -> ^( VAR[$IDENTIFIER, true] ( IDENTIFIER )? ( typeTagOpt )? ( varInit )? ( QUES )? ) )
            // Haxe.g:131:7: ( QUES )? IDENTIFIER typeTagOpt varInit
            {
            // Haxe.g:131:7: ( QUES )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==QUES) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // Haxe.g:131:7: QUES
                    {
                    QUES37=(Token)match(input,QUES,FOLLOW_QUES_in_param636); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_QUES.add(QUES37);


                    }
                    break;

            }


            IDENTIFIER38=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_param639); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER38);


            pushFollow(FOLLOW_typeTagOpt_in_param641);
            typeTagOpt39=typeTagOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeTagOpt.add(typeTagOpt39.getTree());

            pushFollow(FOLLOW_varInit_in_param643);
            varInit40=varInit();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_varInit.add(varInit40.getTree());

            // AST REWRITE
            // elements: typeTagOpt, varInit, QUES, IDENTIFIER
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 131:43: -> ^( VAR[$IDENTIFIER, true] ( IDENTIFIER )? ( typeTagOpt )? ( varInit )? ( QUES )? )
            {
                // Haxe.g:131:46: ^( VAR[$IDENTIFIER, true] ( IDENTIFIER )? ( typeTagOpt )? ( varInit )? ( QUES )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                new VarDeclarationNode(VAR, IDENTIFIER38, true)
                , root_1);

                // Haxe.g:131:91: ( IDENTIFIER )?
                if ( stream_IDENTIFIER.hasNext() ) {
                    adaptor.addChild(root_1, 
                    new VarUsageNode(stream_IDENTIFIER.nextToken())
                    );

                }
                stream_IDENTIFIER.reset();

                // Haxe.g:131:117: ( typeTagOpt )?
                if ( stream_typeTagOpt.hasNext() ) {
                    adaptor.addChild(root_1, stream_typeTagOpt.nextTree());

                }
                stream_typeTagOpt.reset();

                // Haxe.g:131:129: ( varInit )?
                if ( stream_varInit.hasNext() ) {
                    adaptor.addChild(root_1, stream_varInit.nextTree());

                }
                stream_varInit.reset();

                // Haxe.g:131:138: ( QUES )?
                if ( stream_QUES.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_QUES.nextNode()
                    );

                }
                stream_QUES.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
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
        	// do for sure before leaving
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
    // Haxe.g:134:1: id : ( IDENTIFIER -> ^( IDENTIFIER ) | THIS -> ^( THIS ) );
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

            // Haxe.g:134:5: ( IDENTIFIER -> ^( IDENTIFIER ) | THIS -> ^( THIS ) )
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
                    // Haxe.g:134:10: IDENTIFIER
                    {
                    IDENTIFIER41=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_id689); if (state.failed) return retval; 
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
                    // 134:21: -> ^( IDENTIFIER )
                    {
                        // Haxe.g:134:24: ^( IDENTIFIER )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        new VarUsageNode(stream_IDENTIFIER.nextToken())
                        , root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // Haxe.g:135:10: THIS
                    {
                    THIS42=(Token)match(input,THIS,FOLLOW_THIS_in_id709); if (state.failed) return retval; 
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
                    // 135:15: -> ^( THIS )
                    {
                        // Haxe.g:135:18: ^( THIS )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        new VarUsageNode(stream_THIS.nextToken())
                        , root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
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
        	// do for sure before leaving
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
    // Haxe.g:138:1: dotIdent : ( id DOT a= dotIdent -> ^( DOT[true] id $a) | id -> id );
    public final HaxeParser.dotIdent_return dotIdent() throws RecognitionException {
        HaxeParser.dotIdent_return retval = new HaxeParser.dotIdent_return();
        retval.start = input.LT(1);

        int dotIdent_StartIndex = input.index();

        Object root_0 = null;

        Token DOT44=null;
        HaxeParser.dotIdent_return a =null;

        HaxeParser.id_return id43 =null;

        HaxeParser.id_return id45 =null;


        Object DOT44_tree=null;
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_dotIdent=new RewriteRuleSubtreeStream(adaptor,"rule dotIdent");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return retval; }

            // Haxe.g:139:5: ( id DOT a= dotIdent -> ^( DOT[true] id $a) | id -> id )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==IDENTIFIER) ) {
                int LA16_1 = input.LA(2);

                if ( (LA16_1==DOT) ) {
                    alt16=1;
                }
                else if ( (LA16_1==EOF||(LA16_1 >= AMP && LA16_1 <= AMPEQ)||LA16_1==BANGEQ||(LA16_1 >= BAR && LA16_1 <= BARBAR)||LA16_1==CARET||(LA16_1 >= CLASS && LA16_1 <= COMMA)||LA16_1==ELLIPSIS||(LA16_1 >= ENUM && LA16_1 <= EQEQ)||(LA16_1 >= EXTENDS && LA16_1 <= EXTERN)||(LA16_1 >= GT && LA16_1 <= GTGT)||LA16_1==GTGTGT||(LA16_1 >= IMPLEMENTS && LA16_1 <= IN)||LA16_1==INTERFACE||(LA16_1 >= LBRACE && LA16_1 <= LBRACKET)||(LA16_1 >= LPAREN && LA16_1 <= LTLT)||LA16_1==MINUS_BIGGER||LA16_1==MONKEYS_AT||LA16_1==PERCENT||LA16_1==PERCENTEQ||(LA16_1 >= PLUS && LA16_1 <= PLUSPLUS)||LA16_1==PRIVATE||(LA16_1 >= QUES && LA16_1 <= RBRACKET)||(LA16_1 >= RPAREN && LA16_1 <= SEMI)||(LA16_1 >= SLASH && LA16_1 <= STAR)||(LA16_1 >= SUB && LA16_1 <= SUBSUB)||LA16_1==TYPEDEF||LA16_1==USING) ) {
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
                else if ( (LA16_2==EOF||(LA16_2 >= AMP && LA16_2 <= AMPEQ)||LA16_2==BANGEQ||(LA16_2 >= BAR && LA16_2 <= BARBAR)||LA16_2==CARET||(LA16_2 >= CLASS && LA16_2 <= COMMA)||LA16_2==ELLIPSIS||(LA16_2 >= ENUM && LA16_2 <= EQEQ)||(LA16_2 >= EXTENDS && LA16_2 <= EXTERN)||(LA16_2 >= GT && LA16_2 <= GTGT)||LA16_2==GTGTGT||(LA16_2 >= IMPLEMENTS && LA16_2 <= IN)||LA16_2==INTERFACE||(LA16_2 >= LBRACE && LA16_2 <= LBRACKET)||(LA16_2 >= LPAREN && LA16_2 <= LTLT)||LA16_2==MINUS_BIGGER||LA16_2==MONKEYS_AT||LA16_2==PERCENT||LA16_2==PERCENTEQ||(LA16_2 >= PLUS && LA16_2 <= PLUSPLUS)||LA16_2==PRIVATE||(LA16_2 >= QUES && LA16_2 <= RBRACKET)||(LA16_2 >= RPAREN && LA16_2 <= SEMI)||(LA16_2 >= SLASH && LA16_2 <= STAR)||(LA16_2 >= SUB && LA16_2 <= SUBSUB)||LA16_2==TYPEDEF||LA16_2==USING) ) {
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
                    // Haxe.g:139:10: id DOT a= dotIdent
                    {
                    pushFollow(FOLLOW_id_in_dotIdent738);
                    id43=id();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_id.add(id43.getTree());

                    DOT44=(Token)match(input,DOT,FOLLOW_DOT_in_dotIdent740); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DOT.add(DOT44);


                    pushFollow(FOLLOW_dotIdent_in_dotIdent744);
                    a=dotIdent();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_dotIdent.add(a.getTree());

                    // AST REWRITE
                    // elements: a, id, DOT
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
                    // 139:28: -> ^( DOT[true] id $a)
                    {
                        // Haxe.g:139:32: ^( DOT[true] id $a)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        new VarUsageNode(DOT, true)
                        , root_1);

                        adaptor.addChild(root_1, stream_id.nextTree());

                        adaptor.addChild(root_1, stream_a.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // Haxe.g:140:10: id
                    {
                    pushFollow(FOLLOW_id_in_dotIdent771);
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
                    // 140:13: -> id
                    {
                        adaptor.addChild(root_0, stream_id.nextTree());

                    }


                    retval.tree = root_0;
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
        	// do for sure before leaving
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
    // Haxe.g:143:1: assignOp : ( EQ -> EQ[$EQ] | PLUSEQ -> PLUSEQ[$PLUSEQ] | SUBEQ -> SUBEQ[$SUBEQ] | SLASHEQ -> SLASHEQ[$SLASHEQ] | PERCENTEQ -> PERCENTEQ[$PERCENTEQ] | AMPEQ -> AMPEQ[$AMPEQ] );
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

            // Haxe.g:144:5: ( EQ -> EQ[$EQ] | PLUSEQ -> PLUSEQ[$PLUSEQ] | SUBEQ -> SUBEQ[$SUBEQ] | SLASHEQ -> SLASHEQ[$SLASHEQ] | PERCENTEQ -> PERCENTEQ[$PERCENTEQ] | AMPEQ -> AMPEQ[$AMPEQ] )
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
                    // Haxe.g:144:10: EQ
                    {
                    EQ46=(Token)match(input,EQ,FOLLOW_EQ_in_assignOp795); if (state.failed) return retval; 
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
                    // 144:20: -> EQ[$EQ]
                    {
                        adaptor.addChild(root_0, 
                        new AssignOperationNode(EQ, EQ46)
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // Haxe.g:145:10: PLUSEQ
                    {
                    PLUSEQ47=(Token)match(input,PLUSEQ,FOLLOW_PLUSEQ_in_assignOp821); if (state.failed) return retval; 
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
                    // 145:21: -> PLUSEQ[$PLUSEQ]
                    {
                        adaptor.addChild(root_0, 
                        new AssignOperationNode(PLUSEQ, PLUSEQ47)
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 3 :
                    // Haxe.g:146:10: SUBEQ
                    {
                    SUBEQ48=(Token)match(input,SUBEQ,FOLLOW_SUBEQ_in_assignOp844); if (state.failed) return retval; 
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
                    // 146:19: -> SUBEQ[$SUBEQ]
                    {
                        adaptor.addChild(root_0, 
                        new AssignOperationNode(SUBEQ, SUBEQ48)
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 4 :
                    // Haxe.g:147:10: SLASHEQ
                    {
                    SLASHEQ49=(Token)match(input,SLASHEQ,FOLLOW_SLASHEQ_in_assignOp866); if (state.failed) return retval; 
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
                    // 147:21: -> SLASHEQ[$SLASHEQ]
                    {
                        adaptor.addChild(root_0, 
                        new AssignOperationNode(SLASHEQ, SLASHEQ49)
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 5 :
                    // Haxe.g:148:10: PERCENTEQ
                    {
                    PERCENTEQ50=(Token)match(input,PERCENTEQ,FOLLOW_PERCENTEQ_in_assignOp888); if (state.failed) return retval; 
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
                    // 148:23: -> PERCENTEQ[$PERCENTEQ]
                    {
                        adaptor.addChild(root_0, 
                        new AssignOperationNode(PERCENTEQ, PERCENTEQ50)
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 6 :
                    // Haxe.g:149:10: AMPEQ
                    {
                    AMPEQ51=(Token)match(input,AMPEQ,FOLLOW_AMPEQ_in_assignOp910); if (state.failed) return retval; 
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
                    // 149:19: -> AMPEQ[$AMPEQ]
                    {
                        adaptor.addChild(root_0, 
                        new AssignOperationNode(AMPEQ, AMPEQ51)
                        );

                    }


                    retval.tree = root_0;
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
        	// do for sure before leaving
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
    // Haxe.g:153:1: funcLit : FUNCTION LPAREN paramList RPAREN ( typeTagOpt )? block -> ^( FUNCTION ( paramList )? ( typeTagOpt )? ( block )? ) ;
    public final HaxeParser.funcLit_return funcLit() throws RecognitionException {
        HaxeParser.funcLit_return retval = new HaxeParser.funcLit_return();
        retval.start = input.LT(1);

        int funcLit_StartIndex = input.index();

        Object root_0 = null;

        Token FUNCTION52=null;
        Token LPAREN53=null;
        Token RPAREN55=null;
        HaxeParser.paramList_return paramList54 =null;

        HaxeParser.typeTagOpt_return typeTagOpt56 =null;

        HaxeParser.block_return block57 =null;


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

            // Haxe.g:153:9: ( FUNCTION LPAREN paramList RPAREN ( typeTagOpt )? block -> ^( FUNCTION ( paramList )? ( typeTagOpt )? ( block )? ) )
            // Haxe.g:153:11: FUNCTION LPAREN paramList RPAREN ( typeTagOpt )? block
            {
            FUNCTION52=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcLit939); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION52);


            LPAREN53=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcLit941); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN53);


            pushFollow(FOLLOW_paramList_in_funcLit943);
            paramList54=paramList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_paramList.add(paramList54.getTree());

            RPAREN55=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcLit945); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN55);


            // Haxe.g:153:44: ( typeTagOpt )?
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
                    // Haxe.g:153:44: typeTagOpt
                    {
                    pushFollow(FOLLOW_typeTagOpt_in_funcLit947);
                    typeTagOpt56=typeTagOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeTagOpt.add(typeTagOpt56.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_block_in_funcLit950);
            block57=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block57.getTree());

            // AST REWRITE
            // elements: paramList, typeTagOpt, FUNCTION, block
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 153:62: -> ^( FUNCTION ( paramList )? ( typeTagOpt )? ( block )? )
            {
                // Haxe.g:153:65: ^( FUNCTION ( paramList )? ( typeTagOpt )? ( block )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                new FunctionNode(stream_FUNCTION.nextToken())
                , root_1);

                // Haxe.g:153:90: ( paramList )?
                if ( stream_paramList.hasNext() ) {
                    adaptor.addChild(root_1, stream_paramList.nextTree());

                }
                stream_paramList.reset();

                // Haxe.g:153:101: ( typeTagOpt )?
                if ( stream_typeTagOpt.hasNext() ) {
                    adaptor.addChild(root_1, stream_typeTagOpt.nextTree());

                }
                stream_typeTagOpt.reset();

                // Haxe.g:153:113: ( block )?
                if ( stream_block.hasNext() ) {
                    adaptor.addChild(root_1, stream_block.nextTree());

                }
                stream_block.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
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
        	// do for sure before leaving
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
    // Haxe.g:155:1: arrayLit : LBRACKET ! exprListOpt RBRACKET !;
    public final HaxeParser.arrayLit_return arrayLit() throws RecognitionException {
        HaxeParser.arrayLit_return retval = new HaxeParser.arrayLit_return();
        retval.start = input.LT(1);

        int arrayLit_StartIndex = input.index();

        Object root_0 = null;

        Token LBRACKET58=null;
        Token RBRACKET60=null;
        HaxeParser.exprListOpt_return exprListOpt59 =null;


        Object LBRACKET58_tree=null;
        Object RBRACKET60_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return retval; }

            // Haxe.g:155:13: ( LBRACKET ! exprListOpt RBRACKET !)
            // Haxe.g:155:15: LBRACKET ! exprListOpt RBRACKET !
            {
            root_0 = (Object)adaptor.nil();


            LBRACKET58=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_arrayLit987); if (state.failed) return retval;

            pushFollow(FOLLOW_exprListOpt_in_arrayLit990);
            exprListOpt59=exprListOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, exprListOpt59.getTree());

            RBRACKET60=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_arrayLit992); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
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
    // Haxe.g:183:1: typeTag : COLON ! funcType ;
    public final HaxeParser.typeTag_return typeTag() throws RecognitionException {
        HaxeParser.typeTag_return retval = new HaxeParser.typeTag_return();
        retval.start = input.LT(1);

        int typeTag_StartIndex = input.index();

        Object root_0 = null;

        Token COLON61=null;
        HaxeParser.funcType_return funcType62 =null;


        Object COLON61_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return retval; }

            // Haxe.g:183:9: ( COLON ! funcType )
            // Haxe.g:183:11: COLON ! funcType
            {
            root_0 = (Object)adaptor.nil();


            COLON61=(Token)match(input,COLON,FOLLOW_COLON_in_typeTag1024); if (state.failed) return retval;

            pushFollow(FOLLOW_funcType_in_typeTag1027);
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
        	// do for sure before leaving
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
    // Haxe.g:186:1: typeTagOpt : ( typeTag -> ^( TYPE_TAG[\"TYPE_TAG\",true] ( typeTag )? ) |);
    public final HaxeParser.typeTagOpt_return typeTagOpt() throws RecognitionException {
        HaxeParser.typeTagOpt_return retval = new HaxeParser.typeTagOpt_return();
        retval.start = input.LT(1);

        int typeTagOpt_StartIndex = input.index();

        Object root_0 = null;

        HaxeParser.typeTag_return typeTag63 =null;


        RewriteRuleSubtreeStream stream_typeTag=new RewriteRuleSubtreeStream(adaptor,"rule typeTag");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return retval; }

            // Haxe.g:187:5: ( typeTag -> ^( TYPE_TAG[\"TYPE_TAG\",true] ( typeTag )? ) |)
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==COLON) ) {
                alt19=1;
            }
            else if ( (LA19_0==EOF||LA19_0==COMMA||LA19_0==EQ||LA19_0==LBRACE||(LA19_0 >= RPAREN && LA19_0 <= SEMI)) ) {
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
                    // Haxe.g:187:10: typeTag
                    {
                    pushFollow(FOLLOW_typeTag_in_typeTagOpt1055);
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
                    // 187:18: -> ^( TYPE_TAG[\"TYPE_TAG\",true] ( typeTag )? )
                    {
                        // Haxe.g:187:21: ^( TYPE_TAG[\"TYPE_TAG\",true] ( typeTag )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        new HaxeTree(TYPE_TAG, "TYPE_TAG", true)
                        , root_1);

                        // Haxe.g:187:59: ( typeTag )?
                        if ( stream_typeTag.hasNext() ) {
                            adaptor.addChild(root_1, stream_typeTag.nextTree());

                        }
                        stream_typeTag.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // Haxe.g:189:5: 
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
        	// do for sure before leaving
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
    // Haxe.g:191:1: typeList : ( type ( COMMA ! type )* | typeConstraint ( COMMA ! typeConstraint )* );
    public final HaxeParser.typeList_return typeList() throws RecognitionException {
        HaxeParser.typeList_return retval = new HaxeParser.typeList_return();
        retval.start = input.LT(1);

        int typeList_StartIndex = input.index();

        Object root_0 = null;

        Token COMMA65=null;
        Token COMMA68=null;
        HaxeParser.type_return type64 =null;

        HaxeParser.type_return type66 =null;

        HaxeParser.typeConstraint_return typeConstraint67 =null;

        HaxeParser.typeConstraint_return typeConstraint69 =null;


        Object COMMA65_tree=null;
        Object COMMA68_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return retval; }

            // Haxe.g:192:5: ( type ( COMMA ! type )* | typeConstraint ( COMMA ! typeConstraint )* )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==BOOLEAN||LA22_0==COMMA||LA22_0==DYNAMIC||LA22_0==FLOAT||LA22_0==GT||LA22_0==GTGT||LA22_0==GTGTGT||LA22_0==INT||LA22_0==LBRACE||LA22_0==LT||LA22_0==RPAREN||LA22_0==THIS||LA22_0==VOID) ) {
                alt22=1;
            }
            else if ( (LA22_0==IDENTIFIER) ) {
                int LA22_2 = input.LA(2);

                if ( (LA22_2==COLON) ) {
                    alt22=2;
                }
                else if ( (LA22_2==COMMA||LA22_2==DOT||LA22_2==GT||LA22_2==GTGT||LA22_2==GTGTGT||LA22_2==LT||LA22_2==RPAREN) ) {
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
                    // Haxe.g:192:10: type ( COMMA ! type )*
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_type_in_typeList1098);
                    type64=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, type64.getTree());

                    // Haxe.g:192:15: ( COMMA ! type )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==COMMA) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // Haxe.g:192:16: COMMA ! type
                    	    {
                    	    COMMA65=(Token)match(input,COMMA,FOLLOW_COMMA_in_typeList1101); if (state.failed) return retval;

                    	    pushFollow(FOLLOW_type_in_typeList1104);
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
                    // Haxe.g:193:10: typeConstraint ( COMMA ! typeConstraint )*
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_typeConstraint_in_typeList1121);
                    typeConstraint67=typeConstraint();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeConstraint67.getTree());

                    // Haxe.g:193:25: ( COMMA ! typeConstraint )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==COMMA) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // Haxe.g:193:26: COMMA ! typeConstraint
                    	    {
                    	    COMMA68=(Token)match(input,COMMA,FOLLOW_COMMA_in_typeList1124); if (state.failed) return retval;

                    	    pushFollow(FOLLOW_typeConstraint_in_typeList1127);
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
        	// do for sure before leaving
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
    // Haxe.g:196:1: funcType : ( ( type ) ( MINUS_BIGGER ! type )* | VOID );
    public final HaxeParser.funcType_return funcType() throws RecognitionException {
        HaxeParser.funcType_return retval = new HaxeParser.funcType_return();
        retval.start = input.LT(1);

        int funcType_StartIndex = input.index();

        Object root_0 = null;

        Token MINUS_BIGGER71=null;
        Token VOID73=null;
        HaxeParser.type_return type70 =null;

        HaxeParser.type_return type72 =null;


        Object MINUS_BIGGER71_tree=null;
        Object VOID73_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return retval; }

            // Haxe.g:197:5: ( ( type ) ( MINUS_BIGGER ! type )* | VOID )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==EOF||LA24_0==BOOLEAN||LA24_0==CLASS||LA24_0==COMMA||LA24_0==DYNAMIC||(LA24_0 >= ENUM && LA24_0 <= EQ)||LA24_0==EXTERN||LA24_0==FLOAT||LA24_0==IDENTIFIER||LA24_0==IMPORT||(LA24_0 >= INT && LA24_0 <= INTERFACE)||LA24_0==LBRACE||LA24_0==MINUS_BIGGER||LA24_0==MONKEYS_AT||LA24_0==PRIVATE||LA24_0==RBRACE||(LA24_0 >= RPAREN && LA24_0 <= SEMI)||LA24_0==THIS||LA24_0==TYPEDEF||LA24_0==USING) ) {
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
                    // Haxe.g:197:10: ( type ) ( MINUS_BIGGER ! type )*
                    {
                    root_0 = (Object)adaptor.nil();


                    // Haxe.g:197:10: ( type )
                    // Haxe.g:197:11: type
                    {
                    pushFollow(FOLLOW_type_in_funcType1152);
                    type70=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, type70.getTree());

                    }


                    // Haxe.g:197:17: ( MINUS_BIGGER ! type )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==MINUS_BIGGER) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // Haxe.g:197:18: MINUS_BIGGER ! type
                    	    {
                    	    MINUS_BIGGER71=(Token)match(input,MINUS_BIGGER,FOLLOW_MINUS_BIGGER_in_funcType1156); if (state.failed) return retval;

                    	    pushFollow(FOLLOW_type_in_funcType1159);
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
                    // Haxe.g:198:10: VOID
                    {
                    root_0 = (Object)adaptor.nil();


                    VOID73=(Token)match(input,VOID,FOLLOW_VOID_in_funcType1172); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    VOID73_tree = 
                    (Object)adaptor.create(VOID73)
                    ;
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
        	// do for sure before leaving
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
    // Haxe.g:201:1: primitiveType : ( INT | FLOAT | DYNAMIC | BOOLEAN | VOID );
    public final HaxeParser.primitiveType_return primitiveType() throws RecognitionException {
        HaxeParser.primitiveType_return retval = new HaxeParser.primitiveType_return();
        retval.start = input.LT(1);

        int primitiveType_StartIndex = input.index();

        Object root_0 = null;

        Token set74=null;

        Object set74_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return retval; }

            // Haxe.g:202:5: ( INT | FLOAT | DYNAMIC | BOOLEAN | VOID )
            // Haxe.g:
            {
            root_0 = (Object)adaptor.nil();


            set74=(Token)input.LT(1);

            if ( input.LA(1)==BOOLEAN||input.LA(1)==DYNAMIC||input.LA(1)==FLOAT||input.LA(1)==INT||input.LA(1)==VOID ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (Object)adaptor.create(set74)
                );
                state.errorRecovery=false;
                state.failed=false;
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
        	// do for sure before leaving
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
    // Haxe.g:205:1: type : ( ( anonType ^| dotIdent ^| primitiveType ^) ( typeParam )* |);
    public final HaxeParser.type_return type() throws RecognitionException {
        HaxeParser.type_return retval = new HaxeParser.type_return();
        retval.start = input.LT(1);

        int type_StartIndex = input.index();

        Object root_0 = null;

        HaxeParser.anonType_return anonType75 =null;

        HaxeParser.dotIdent_return dotIdent76 =null;

        HaxeParser.primitiveType_return primitiveType77 =null;

        HaxeParser.typeParam_return typeParam78 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return retval; }

            // Haxe.g:205:9: ( ( anonType ^| dotIdent ^| primitiveType ^) ( typeParam )* |)
            int alt27=2;
            switch ( input.LA(1) ) {
            case LBRACE:
                {
                int LA27_1 = input.LA(2);

                if ( (synpred42_Haxe()) ) {
                    alt27=1;
                }
                else if ( (true) ) {
                    alt27=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 27, 1, input);

                    throw nvae;

                }
                }
                break;
            case BOOLEAN:
            case DYNAMIC:
            case FLOAT:
            case IDENTIFIER:
            case INT:
            case THIS:
            case VOID:
                {
                alt27=1;
                }
                break;
            case EOF:
            case CLASS:
            case COMMA:
            case ENUM:
            case EQ:
            case EXTENDS:
            case EXTERN:
            case GT:
            case GTGT:
            case GTGTGT:
            case IMPLEMENTS:
            case IMPORT:
            case INTERFACE:
            case LPAREN:
            case LT:
            case MINUS_BIGGER:
            case MONKEYS_AT:
            case PRIVATE:
            case RBRACE:
            case RPAREN:
            case SEMI:
            case TYPEDEF:
            case USING:
                {
                alt27=2;
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
                    // Haxe.g:205:14: ( anonType ^| dotIdent ^| primitiveType ^) ( typeParam )*
                    {
                    root_0 = (Object)adaptor.nil();


                    // Haxe.g:205:14: ( anonType ^| dotIdent ^| primitiveType ^)
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
                    case BOOLEAN:
                    case DYNAMIC:
                    case FLOAT:
                    case INT:
                    case VOID:
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
                            // Haxe.g:205:15: anonType ^
                            {
                            pushFollow(FOLLOW_anonType_in_type1232);
                            anonType75=anonType();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(anonType75.getTree(), root_0);

                            }
                            break;
                        case 2 :
                            // Haxe.g:205:27: dotIdent ^
                            {
                            pushFollow(FOLLOW_dotIdent_in_type1237);
                            dotIdent76=dotIdent();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(dotIdent76.getTree(), root_0);

                            }
                            break;
                        case 3 :
                            // Haxe.g:205:39: primitiveType ^
                            {
                            pushFollow(FOLLOW_primitiveType_in_type1242);
                            primitiveType77=primitiveType();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(primitiveType77.getTree(), root_0);

                            }
                            break;

                    }


                    // Haxe.g:205:56: ( typeParam )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==LT) ) {
                            int LA26_3 = input.LA(2);

                            if ( (synpred41_Haxe()) ) {
                                alt26=1;
                            }


                        }


                        switch (alt26) {
                    	case 1 :
                    	    // Haxe.g:205:57: typeParam
                    	    {
                    	    pushFollow(FOLLOW_typeParam_in_type1248);
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
                    // Haxe.g:207:9: 
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
        	// do for sure before leaving
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
    // Haxe.g:209:1: typeParam : ( LT ! typeList GT !| LT ! typeList LT ! typeList GTGT !| LT ! typeList LT ! typeList LT ! typeList GTGTGT !);
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
        HaxeParser.typeList_return typeList80 =null;

        HaxeParser.typeList_return typeList83 =null;

        HaxeParser.typeList_return typeList85 =null;

        HaxeParser.typeList_return typeList88 =null;

        HaxeParser.typeList_return typeList90 =null;

        HaxeParser.typeList_return typeList92 =null;


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

            // Haxe.g:210:5: ( LT ! typeList GT !| LT ! typeList LT ! typeList GTGT !| LT ! typeList LT ! typeList LT ! typeList GTGTGT !)
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
                    // Haxe.g:210:10: LT ! typeList GT !
                    {
                    root_0 = (Object)adaptor.nil();


                    LT79=(Token)match(input,LT,FOLLOW_LT_in_typeParam1296); if (state.failed) return retval;

                    pushFollow(FOLLOW_typeList_in_typeParam1299);
                    typeList80=typeList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeList80.getTree());

                    GT81=(Token)match(input,GT,FOLLOW_GT_in_typeParam1301); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // Haxe.g:211:10: LT ! typeList LT ! typeList GTGT !
                    {
                    root_0 = (Object)adaptor.nil();


                    LT82=(Token)match(input,LT,FOLLOW_LT_in_typeParam1313); if (state.failed) return retval;

                    pushFollow(FOLLOW_typeList_in_typeParam1316);
                    typeList83=typeList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeList83.getTree());

                    LT84=(Token)match(input,LT,FOLLOW_LT_in_typeParam1318); if (state.failed) return retval;

                    pushFollow(FOLLOW_typeList_in_typeParam1321);
                    typeList85=typeList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeList85.getTree());

                    GTGT86=(Token)match(input,GTGT,FOLLOW_GTGT_in_typeParam1323); if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // Haxe.g:212:10: LT ! typeList LT ! typeList LT ! typeList GTGTGT !
                    {
                    root_0 = (Object)adaptor.nil();


                    LT87=(Token)match(input,LT,FOLLOW_LT_in_typeParam1335); if (state.failed) return retval;

                    pushFollow(FOLLOW_typeList_in_typeParam1338);
                    typeList88=typeList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeList88.getTree());

                    LT89=(Token)match(input,LT,FOLLOW_LT_in_typeParam1340); if (state.failed) return retval;

                    pushFollow(FOLLOW_typeList_in_typeParam1343);
                    typeList90=typeList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeList90.getTree());

                    LT91=(Token)match(input,LT,FOLLOW_LT_in_typeParam1345); if (state.failed) return retval;

                    pushFollow(FOLLOW_typeList_in_typeParam1348);
                    typeList92=typeList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeList92.getTree());

                    GTGTGT93=(Token)match(input,GTGTGT,FOLLOW_GTGTGT_in_typeParam1350); if (state.failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
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
    // Haxe.g:216:1: typeParamOpt : ( typeParam -> ^( TYPE_PARAM_OPT[\"TYPE_PARAM_OPT\",true] ( typeParam )? ) |);
    public final HaxeParser.typeParamOpt_return typeParamOpt() throws RecognitionException {
        HaxeParser.typeParamOpt_return retval = new HaxeParser.typeParamOpt_return();
        retval.start = input.LT(1);

        int typeParamOpt_StartIndex = input.index();

        Object root_0 = null;

        HaxeParser.typeParam_return typeParam94 =null;


        RewriteRuleSubtreeStream stream_typeParam=new RewriteRuleSubtreeStream(adaptor,"rule typeParam");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return retval; }

            // Haxe.g:217:5: ( typeParam -> ^( TYPE_PARAM_OPT[\"TYPE_PARAM_OPT\",true] ( typeParam )? ) |)
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==LT) ) {
                int LA29_1 = input.LA(2);

                if ( (synpred45_Haxe()) ) {
                    alt29=1;
                }
                else if ( (true) ) {
                    alt29=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 29, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA29_0==EOF||(LA29_0 >= AMP && LA29_0 <= AMPEQ)||LA29_0==BANGEQ||(LA29_0 >= BAR && LA29_0 <= BARBAR)||LA29_0==CARET||(LA29_0 >= COLON && LA29_0 <= COMMA)||LA29_0==ELLIPSIS||(LA29_0 >= EQ && LA29_0 <= EQEQ)||LA29_0==EXTENDS||(LA29_0 >= GT && LA29_0 <= GTEQ)||LA29_0==GTGTGT||LA29_0==IMPLEMENTS||LA29_0==IN||(LA29_0 >= LBRACE && LA29_0 <= LBRACKET)||LA29_0==LPAREN||(LA29_0 >= LTEQ && LA29_0 <= LTLT)||LA29_0==PERCENT||LA29_0==PERCENTEQ||(LA29_0 >= PLUS && LA29_0 <= PLUSPLUS)||(LA29_0 >= QUES && LA29_0 <= RBRACKET)||(LA29_0 >= RPAREN && LA29_0 <= SEMI)||(LA29_0 >= SLASH && LA29_0 <= STAR)||(LA29_0 >= SUB && LA29_0 <= SUBSUB)) ) {
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
                    // Haxe.g:217:10: typeParam
                    {
                    pushFollow(FOLLOW_typeParam_in_typeParamOpt1382);
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
                    // 217:20: -> ^( TYPE_PARAM_OPT[\"TYPE_PARAM_OPT\",true] ( typeParam )? )
                    {
                        // Haxe.g:217:23: ^( TYPE_PARAM_OPT[\"TYPE_PARAM_OPT\",true] ( typeParam )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        new HaxeTree(TYPE_PARAM_OPT, "TYPE_PARAM_OPT", true)
                        , root_1);

                        // Haxe.g:217:73: ( typeParam )?
                        if ( stream_typeParam.hasNext() ) {
                            adaptor.addChild(root_1, stream_typeParam.nextTree());

                        }
                        stream_typeParam.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // Haxe.g:219:5: 
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
        	// do for sure before leaving
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
    // Haxe.g:221:1: typeConstraint : IDENTIFIER COLON LPAREN typeList RPAREN -> ^( $typeConstraint ( IDENTIFIER )? ( typeList )? ) ;
    public final HaxeParser.typeConstraint_return typeConstraint() throws RecognitionException {
        HaxeParser.typeConstraint_return retval = new HaxeParser.typeConstraint_return();
        retval.start = input.LT(1);

        int typeConstraint_StartIndex = input.index();

        Object root_0 = null;

        Token IDENTIFIER95=null;
        Token COLON96=null;
        Token LPAREN97=null;
        Token RPAREN99=null;
        HaxeParser.typeList_return typeList98 =null;


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

            // Haxe.g:222:5: ( IDENTIFIER COLON LPAREN typeList RPAREN -> ^( $typeConstraint ( IDENTIFIER )? ( typeList )? ) )
            // Haxe.g:222:9: IDENTIFIER COLON LPAREN typeList RPAREN
            {
            IDENTIFIER95=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_typeConstraint1431); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER95);


            COLON96=(Token)match(input,COLON,FOLLOW_COLON_in_typeConstraint1433); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COLON.add(COLON96);


            LPAREN97=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_typeConstraint1435); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN97);


            pushFollow(FOLLOW_typeList_in_typeConstraint1437);
            typeList98=typeList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeList.add(typeList98.getTree());

            RPAREN99=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_typeConstraint1439); if (state.failed) return retval; 
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
            // 222:49: -> ^( $typeConstraint ( IDENTIFIER )? ( typeList )? )
            {
                // Haxe.g:222:52: ^( $typeConstraint ( IDENTIFIER )? ( typeList )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_retval.nextNode(), root_1);

                // Haxe.g:222:70: ( IDENTIFIER )?
                if ( stream_IDENTIFIER.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_IDENTIFIER.nextNode()
                    );

                }
                stream_IDENTIFIER.reset();

                // Haxe.g:222:82: ( typeList )?
                if ( stream_typeList.hasNext() ) {
                    adaptor.addChild(root_1, stream_typeList.nextTree());

                }
                stream_typeList.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
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
        	// do for sure before leaving
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
    // Haxe.g:226:1: functionReturn : ( declAttrList )? FUNCTION NEW LPAREN paramList RPAREN typeTagOpt block -> ^( FUNCTION NEW ( declAttrList )? ( paramList )? ( typeTagOpt )? ( block )? ) ;
    public final HaxeParser.functionReturn_return functionReturn() throws RecognitionException {
        HaxeParser.functionReturn_return retval = new HaxeParser.functionReturn_return();
        retval.start = input.LT(1);

        int functionReturn_StartIndex = input.index();

        Object root_0 = null;

        Token FUNCTION101=null;
        Token NEW102=null;
        Token LPAREN103=null;
        Token RPAREN105=null;
        HaxeParser.declAttrList_return declAttrList100 =null;

        HaxeParser.paramList_return paramList104 =null;

        HaxeParser.typeTagOpt_return typeTagOpt106 =null;

        HaxeParser.block_return block107 =null;


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

            // Haxe.g:227:5: ( ( declAttrList )? FUNCTION NEW LPAREN paramList RPAREN typeTagOpt block -> ^( FUNCTION NEW ( declAttrList )? ( paramList )? ( typeTagOpt )? ( block )? ) )
            // Haxe.g:227:10: ( declAttrList )? FUNCTION NEW LPAREN paramList RPAREN typeTagOpt block
            {
            // Haxe.g:227:10: ( declAttrList )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==DYNAMIC||LA30_0==INLINE||LA30_0==OVERRIDE||LA30_0==PRIVATE||LA30_0==PUBLIC||LA30_0==STATIC) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // Haxe.g:227:10: declAttrList
                    {
                    pushFollow(FOLLOW_declAttrList_in_functionReturn1477);
                    declAttrList100=declAttrList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declAttrList.add(declAttrList100.getTree());

                    }
                    break;

            }


            FUNCTION101=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_functionReturn1480); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION101);


            NEW102=(Token)match(input,NEW,FOLLOW_NEW_in_functionReturn1482); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_NEW.add(NEW102);


            LPAREN103=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_functionReturn1484); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN103);


            pushFollow(FOLLOW_paramList_in_functionReturn1486);
            paramList104=paramList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_paramList.add(paramList104.getTree());

            RPAREN105=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_functionReturn1488); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN105);


            pushFollow(FOLLOW_typeTagOpt_in_functionReturn1490);
            typeTagOpt106=typeTagOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeTagOpt.add(typeTagOpt106.getTree());

            pushFollow(FOLLOW_block_in_functionReturn1492);
            block107=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block107.getTree());

            // AST REWRITE
            // elements: declAttrList, block, typeTagOpt, NEW, paramList, FUNCTION
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 227:78: -> ^( FUNCTION NEW ( declAttrList )? ( paramList )? ( typeTagOpt )? ( block )? )
            {
                // Haxe.g:227:81: ^( FUNCTION NEW ( declAttrList )? ( paramList )? ( typeTagOpt )? ( block )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                new FunctionNode(stream_FUNCTION.nextToken())
                , root_1);

                adaptor.addChild(root_1, 
                stream_NEW.nextNode()
                );

                // Haxe.g:227:110: ( declAttrList )?
                if ( stream_declAttrList.hasNext() ) {
                    adaptor.addChild(root_1, stream_declAttrList.nextTree());

                }
                stream_declAttrList.reset();

                // Haxe.g:227:124: ( paramList )?
                if ( stream_paramList.hasNext() ) {
                    adaptor.addChild(root_1, stream_paramList.nextTree());

                }
                stream_paramList.reset();

                // Haxe.g:227:135: ( typeTagOpt )?
                if ( stream_typeTagOpt.hasNext() ) {
                    adaptor.addChild(root_1, stream_typeTagOpt.nextTree());

                }
                stream_typeTagOpt.reset();

                // Haxe.g:227:147: ( block )?
                if ( stream_block.hasNext() ) {
                    adaptor.addChild(root_1, stream_block.nextTree());

                }
                stream_block.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
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
        	// do for sure before leaving
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
    // Haxe.g:230:1: statement : ( block | assignExpr SEMI !| varDecl | IF parExpression s1= statement ( ELSE s2= statement -> ^( IF parExpression $s1 $s2) | -> ^( IF parExpression $s1) ) | FOR LPAREN exp1= expr IN exp2= expr RPAREN statement -> ^( FOR ^( IN $exp1 $exp2) ( statement )? ) | WHILE parExpression statement -> ^( WHILE ( parExpression )? ( statement )? ) | DO statement WHILE parExpression SEMI -> ^( DO ( parExpression )? ( statement )? ) | TRY block catchStmtList -> ^( TRY ( block )? ( catchStmtList )? ) | SWITCH LPAREN expr RPAREN LBRACE ( caseStmt )+ RBRACE -> ^( SWITCH ( expr )? ( caseStmt )+ ) | RETURN ( expr )? SEMI -> ^( RETURN ( expr )? ) | THROW expr SEMI -> ^( THROW ( expr )? ) | BREAK ( IDENTIFIER )? SEMI -> ^( BREAK ( IDENTIFIER )? ) | CONTINUE ( IDENTIFIER )? SEMI -> ^( CONTINUE ( IDENTIFIER )? ) | expr SEMI !| IDENTIFIER COLON statement -> ^( COLON ( IDENTIFIER )? ( statement )? ) | SEMI !);
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
        HaxeParser.statement_return s1 =null;

        HaxeParser.statement_return s2 =null;

        HaxeParser.expr_return exp1 =null;

        HaxeParser.expr_return exp2 =null;

        HaxeParser.block_return block108 =null;

        HaxeParser.assignExpr_return assignExpr109 =null;

        HaxeParser.varDecl_return varDecl111 =null;

        HaxeParser.parExpression_return parExpression113 =null;

        HaxeParser.statement_return statement119 =null;

        HaxeParser.parExpression_return parExpression121 =null;

        HaxeParser.statement_return statement122 =null;

        HaxeParser.statement_return statement124 =null;

        HaxeParser.parExpression_return parExpression126 =null;

        HaxeParser.block_return block129 =null;

        HaxeParser.catchStmtList_return catchStmtList130 =null;

        HaxeParser.expr_return expr133 =null;

        HaxeParser.caseStmt_return caseStmt136 =null;

        HaxeParser.expr_return expr139 =null;

        HaxeParser.expr_return expr142 =null;

        HaxeParser.expr_return expr150 =null;

        HaxeParser.statement_return statement154 =null;


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

            // Haxe.g:231:5: ( block | assignExpr SEMI !| varDecl | IF parExpression s1= statement ( ELSE s2= statement -> ^( IF parExpression $s1 $s2) | -> ^( IF parExpression $s1) ) | FOR LPAREN exp1= expr IN exp2= expr RPAREN statement -> ^( FOR ^( IN $exp1 $exp2) ( statement )? ) | WHILE parExpression statement -> ^( WHILE ( parExpression )? ( statement )? ) | DO statement WHILE parExpression SEMI -> ^( DO ( parExpression )? ( statement )? ) | TRY block catchStmtList -> ^( TRY ( block )? ( catchStmtList )? ) | SWITCH LPAREN expr RPAREN LBRACE ( caseStmt )+ RBRACE -> ^( SWITCH ( expr )? ( caseStmt )+ ) | RETURN ( expr )? SEMI -> ^( RETURN ( expr )? ) | THROW expr SEMI -> ^( THROW ( expr )? ) | BREAK ( IDENTIFIER )? SEMI -> ^( BREAK ( IDENTIFIER )? ) | CONTINUE ( IDENTIFIER )? SEMI -> ^( CONTINUE ( IDENTIFIER )? ) | expr SEMI !| IDENTIFIER COLON statement -> ^( COLON ( IDENTIFIER )? ( statement )? ) | SEMI !)
            int alt36=16;
            switch ( input.LA(1) ) {
            case LBRACE:
                {
                int LA36_1 = input.LA(2);

                if ( (synpred47_Haxe()) ) {
                    alt36=1;
                }
                else if ( (synpred48_Haxe()) ) {
                    alt36=2;
                }
                else if ( (synpred65_Haxe()) ) {
                    alt36=14;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 36, 1, input);

                    throw nvae;

                }
                }
                break;
            case SEMI:
                {
                int LA36_2 = input.LA(2);

                if ( (synpred47_Haxe()) ) {
                    alt36=1;
                }
                else if ( (true) ) {
                    alt36=16;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 36, 2, input);

                    throw nvae;

                }
                }
                break;
            case BANG:
            case PLUS:
            case PLUSPLUS:
            case SUB:
            case SUBSUB:
            case TILDE:
                {
                int LA36_3 = input.LA(2);

                if ( (synpred48_Haxe()) ) {
                    alt36=2;
                }
                else if ( (synpred65_Haxe()) ) {
                    alt36=14;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 36, 3, input);

                    throw nvae;

                }
                }
                break;
            case NEW:
                {
                int LA36_4 = input.LA(2);

                if ( (synpred48_Haxe()) ) {
                    alt36=2;
                }
                else if ( (synpred65_Haxe()) ) {
                    alt36=14;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 36, 4, input);

                    throw nvae;

                }
                }
                break;
            case CAST:
                {
                int LA36_5 = input.LA(2);

                if ( (synpred48_Haxe()) ) {
                    alt36=2;
                }
                else if ( (synpred65_Haxe()) ) {
                    alt36=14;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 36, 5, input);

                    throw nvae;

                }
                }
                break;
            case FUNCTION:
                {
                int LA36_6 = input.LA(2);

                if ( (synpred48_Haxe()) ) {
                    alt36=2;
                }
                else if ( (synpred65_Haxe()) ) {
                    alt36=14;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 36, 6, input);

                    throw nvae;

                }
                }
                break;
            case LONGLITERAL:
                {
                int LA36_7 = input.LA(2);

                if ( (synpred48_Haxe()) ) {
                    alt36=2;
                }
                else if ( (synpred65_Haxe()) ) {
                    alt36=14;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 36, 7, input);

                    throw nvae;

                }
                }
                break;
            case NULL:
                {
                int LA36_8 = input.LA(2);

                if ( (synpred48_Haxe()) ) {
                    alt36=2;
                }
                else if ( (synpred65_Haxe()) ) {
                    alt36=14;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 36, 8, input);

                    throw nvae;

                }
                }
                break;
            case INTLITERAL:
                {
                int LA36_9 = input.LA(2);

                if ( (synpred48_Haxe()) ) {
                    alt36=2;
                }
                else if ( (synpred65_Haxe()) ) {
                    alt36=14;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 36, 9, input);

                    throw nvae;

                }
                }
                break;
            case STRINGLITERAL:
                {
                int LA36_10 = input.LA(2);

                if ( (synpred48_Haxe()) ) {
                    alt36=2;
                }
                else if ( (synpred65_Haxe()) ) {
                    alt36=14;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 36, 10, input);

                    throw nvae;

                }
                }
                break;
            case CHARLITERAL:
                {
                int LA36_11 = input.LA(2);

                if ( (synpred48_Haxe()) ) {
                    alt36=2;
                }
                else if ( (synpred65_Haxe()) ) {
                    alt36=14;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 36, 11, input);

                    throw nvae;

                }
                }
                break;
            case FLOATNUM:
                {
                int LA36_12 = input.LA(2);

                if ( (synpred48_Haxe()) ) {
                    alt36=2;
                }
                else if ( (synpred65_Haxe()) ) {
                    alt36=14;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 36, 12, input);

                    throw nvae;

                }
                }
                break;
            case TRUE:
                {
                int LA36_13 = input.LA(2);

                if ( (synpred48_Haxe()) ) {
                    alt36=2;
                }
                else if ( (synpred65_Haxe()) ) {
                    alt36=14;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 36, 13, input);

                    throw nvae;

                }
                }
                break;
            case FALSE:
                {
                int LA36_14 = input.LA(2);

                if ( (synpred48_Haxe()) ) {
                    alt36=2;
                }
                else if ( (synpred65_Haxe()) ) {
                    alt36=14;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 36, 14, input);

                    throw nvae;

                }
                }
                break;
            case LPAREN:
                {
                int LA36_15 = input.LA(2);

                if ( (synpred48_Haxe()) ) {
                    alt36=2;
                }
                else if ( (synpred65_Haxe()) ) {
                    alt36=14;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 36, 15, input);

                    throw nvae;

                }
                }
                break;
            case IDENTIFIER:
                {
                int LA36_16 = input.LA(2);

                if ( (synpred48_Haxe()) ) {
                    alt36=2;
                }
                else if ( (synpred65_Haxe()) ) {
                    alt36=14;
                }
                else if ( (synpred66_Haxe()) ) {
                    alt36=15;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 36, 16, input);

                    throw nvae;

                }
                }
                break;
            case THIS:
                {
                int LA36_17 = input.LA(2);

                if ( (synpred48_Haxe()) ) {
                    alt36=2;
                }
                else if ( (synpred65_Haxe()) ) {
                    alt36=14;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 36, 17, input);

                    throw nvae;

                }
                }
                break;
            case DYNAMIC:
            case INLINE:
            case OVERRIDE:
            case PRIVATE:
            case PUBLIC:
            case STATIC:
            case VAR:
                {
                alt36=3;
                }
                break;
            case IF:
                {
                alt36=4;
                }
                break;
            case FOR:
                {
                alt36=5;
                }
                break;
            case WHILE:
                {
                alt36=6;
                }
                break;
            case DO:
                {
                alt36=7;
                }
                break;
            case TRY:
                {
                alt36=8;
                }
                break;
            case SWITCH:
                {
                alt36=9;
                }
                break;
            case RETURN:
                {
                alt36=10;
                }
                break;
            case THROW:
                {
                alt36=11;
                }
                break;
            case BREAK:
                {
                alt36=12;
                }
                break;
            case CONTINUE:
                {
                alt36=13;
                }
                break;
            case UNTYPED:
                {
                alt36=14;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;

            }

            switch (alt36) {
                case 1 :
                    // Haxe.g:231:10: block
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_block_in_statement1541);
                    block108=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, block108.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:232:10: assignExpr SEMI !
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_assignExpr_in_statement1552);
                    assignExpr109=assignExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignExpr109.getTree());

                    SEMI110=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement1554); if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // Haxe.g:233:10: varDecl
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_varDecl_in_statement1566);
                    varDecl111=varDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDecl111.getTree());

                    }
                    break;
                case 4 :
                    // Haxe.g:234:10: IF parExpression s1= statement ( ELSE s2= statement -> ^( IF parExpression $s1 $s2) | -> ^( IF parExpression $s1) )
                    {
                    IF112=(Token)match(input,IF,FOLLOW_IF_in_statement1577); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IF.add(IF112);


                    pushFollow(FOLLOW_parExpression_in_statement1579);
                    parExpression113=parExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_parExpression.add(parExpression113.getTree());

                    pushFollow(FOLLOW_statement_in_statement1583);
                    s1=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(s1.getTree());

                    // Haxe.g:235:10: ( ELSE s2= statement -> ^( IF parExpression $s1 $s2) | -> ^( IF parExpression $s1) )
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==ELSE) ) {
                        int LA31_1 = input.LA(2);

                        if ( (synpred50_Haxe()) ) {
                            alt31=1;
                        }
                        else if ( (true) ) {
                            alt31=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 31, 1, input);

                            throw nvae;

                        }
                    }
                    else if ( (LA31_0==EOF||LA31_0==BANG||LA31_0==BREAK||(LA31_0 >= CASE && LA31_0 <= CAST)||(LA31_0 >= CHARLITERAL && LA31_0 <= CLASS)||LA31_0==CONTINUE||(LA31_0 >= DEFAULT && LA31_0 <= DO)||LA31_0==DYNAMIC||LA31_0==EXTERN||LA31_0==FALSE||(LA31_0 >= FLOATNUM && LA31_0 <= FUNCTION)||(LA31_0 >= IDENTIFIER && LA31_0 <= IF)||LA31_0==INLINE||LA31_0==INTLITERAL||LA31_0==LBRACE||(LA31_0 >= LONGLITERAL && LA31_0 <= LPAREN)||LA31_0==MONKEYS_AT||(LA31_0 >= NEW && LA31_0 <= NULL)||LA31_0==OVERRIDE||LA31_0==PLUS||LA31_0==PLUSPLUS||LA31_0==PRIVATE||LA31_0==PUBLIC||LA31_0==RBRACE||(LA31_0 >= RETURN && LA31_0 <= SEMI)||LA31_0==STATIC||(LA31_0 >= STRINGLITERAL && LA31_0 <= SUB)||LA31_0==SUBSUB||(LA31_0 >= SWITCH && LA31_0 <= THROW)||LA31_0==TILDE||(LA31_0 >= TRUE && LA31_0 <= TRY)||LA31_0==UNTYPED||LA31_0==VAR||LA31_0==WHILE) ) {
                        alt31=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 31, 0, input);

                        throw nvae;

                    }
                    switch (alt31) {
                        case 1 :
                            // Haxe.g:235:12: ELSE s2= statement
                            {
                            ELSE114=(Token)match(input,ELSE,FOLLOW_ELSE_in_statement1596); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_ELSE.add(ELSE114);


                            pushFollow(FOLLOW_statement_in_statement1600);
                            s2=statement();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_statement.add(s2.getTree());

                            // AST REWRITE
                            // elements: s1, parExpression, s2, IF
                            // token labels: 
                            // rule labels: retval, s2, s1
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {

                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                            RewriteRuleSubtreeStream stream_s2=new RewriteRuleSubtreeStream(adaptor,"rule s2",s2!=null?s2.tree:null);
                            RewriteRuleSubtreeStream stream_s1=new RewriteRuleSubtreeStream(adaptor,"rule s1",s1!=null?s1.tree:null);

                            root_0 = (Object)adaptor.nil();
                            // 235:30: -> ^( IF parExpression $s1 $s2)
                            {
                                // Haxe.g:235:33: ^( IF parExpression $s1 $s2)
                                {
                                Object root_1 = (Object)adaptor.nil();
                                root_1 = (Object)adaptor.becomeRoot(
                                new IfNode(stream_IF.nextToken())
                                , root_1);

                                adaptor.addChild(root_1, stream_parExpression.nextTree());

                                adaptor.addChild(root_1, stream_s1.nextTree());

                                adaptor.addChild(root_1, stream_s2.nextTree());

                                adaptor.addChild(root_0, root_1);
                                }

                            }


                            retval.tree = root_0;
                            }

                            }
                            break;
                        case 2 :
                            // Haxe.g:236:30: 
                            {
                            // AST REWRITE
                            // elements: s1, parExpression, IF
                            // token labels: 
                            // rule labels: retval, s1
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {

                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                            RewriteRuleSubtreeStream stream_s1=new RewriteRuleSubtreeStream(adaptor,"rule s1",s1!=null?s1.tree:null);

                            root_0 = (Object)adaptor.nil();
                            // 236:30: -> ^( IF parExpression $s1)
                            {
                                // Haxe.g:236:33: ^( IF parExpression $s1)
                                {
                                Object root_1 = (Object)adaptor.nil();
                                root_1 = (Object)adaptor.becomeRoot(
                                new IfNode(stream_IF.nextToken())
                                , root_1);

                                adaptor.addChild(root_1, stream_parExpression.nextTree());

                                adaptor.addChild(root_1, stream_s1.nextTree());

                                adaptor.addChild(root_0, root_1);
                                }

                            }


                            retval.tree = root_0;
                            }

                            }
                            break;

                    }


                    }
                    break;
                case 5 :
                    // Haxe.g:238:10: FOR LPAREN exp1= expr IN exp2= expr RPAREN statement
                    {
                    FOR115=(Token)match(input,FOR,FOLLOW_FOR_in_statement1682); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FOR.add(FOR115);


                    LPAREN116=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_statement1684); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN116);


                    pushFollow(FOLLOW_expr_in_statement1688);
                    exp1=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(exp1.getTree());

                    IN117=(Token)match(input,IN,FOLLOW_IN_in_statement1690); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IN.add(IN117);


                    pushFollow(FOLLOW_expr_in_statement1694);
                    exp2=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(exp2.getTree());

                    RPAREN118=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_statement1696); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN118);


                    pushFollow(FOLLOW_statement_in_statement1698);
                    statement119=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement119.getTree());

                    // AST REWRITE
                    // elements: FOR, exp2, statement, exp1, IN
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
                    // 238:65: -> ^( FOR ^( IN $exp1 $exp2) ( statement )? )
                    {
                        // Haxe.g:238:68: ^( FOR ^( IN $exp1 $exp2) ( statement )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        new ForNode(stream_FOR.nextToken())
                        , root_1);

                        // Haxe.g:238:83: ^( IN $exp1 $exp2)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        stream_IN.nextNode()
                        , root_2);

                        adaptor.addChild(root_2, stream_exp1.nextTree());

                        adaptor.addChild(root_2, stream_exp2.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        // Haxe.g:238:101: ( statement )?
                        if ( stream_statement.hasNext() ) {
                            adaptor.addChild(root_1, stream_statement.nextTree());

                        }
                        stream_statement.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 6 :
                    // Haxe.g:239:10: WHILE parExpression statement
                    {
                    WHILE120=(Token)match(input,WHILE,FOLLOW_WHILE_in_statement1735); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHILE.add(WHILE120);


                    pushFollow(FOLLOW_parExpression_in_statement1737);
                    parExpression121=parExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_parExpression.add(parExpression121.getTree());

                    pushFollow(FOLLOW_statement_in_statement1739);
                    statement122=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement122.getTree());

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
                    // 239:56: -> ^( WHILE ( parExpression )? ( statement )? )
                    {
                        // Haxe.g:239:59: ^( WHILE ( parExpression )? ( statement )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        new WhileNode(stream_WHILE.nextToken())
                        , root_1);

                        // Haxe.g:239:78: ( parExpression )?
                        if ( stream_parExpression.hasNext() ) {
                            adaptor.addChild(root_1, stream_parExpression.nextTree());

                        }
                        stream_parExpression.reset();

                        // Haxe.g:239:93: ( statement )?
                        if ( stream_statement.hasNext() ) {
                            adaptor.addChild(root_1, stream_statement.nextTree());

                        }
                        stream_statement.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 7 :
                    // Haxe.g:240:10: DO statement WHILE parExpression SEMI
                    {
                    DO123=(Token)match(input,DO,FOLLOW_DO_in_statement1781); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DO.add(DO123);


                    pushFollow(FOLLOW_statement_in_statement1783);
                    statement124=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement124.getTree());

                    WHILE125=(Token)match(input,WHILE,FOLLOW_WHILE_in_statement1785); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHILE.add(WHILE125);


                    pushFollow(FOLLOW_parExpression_in_statement1787);
                    parExpression126=parExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_parExpression.add(parExpression126.getTree());

                    SEMI127=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement1789); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI127);


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
                    // 240:60: -> ^( DO ( parExpression )? ( statement )? )
                    {
                        // Haxe.g:240:63: ^( DO ( parExpression )? ( statement )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        new DoWhileNode(stream_DO.nextToken())
                        , root_1);

                        // Haxe.g:240:81: ( parExpression )?
                        if ( stream_parExpression.hasNext() ) {
                            adaptor.addChild(root_1, stream_parExpression.nextTree());

                        }
                        stream_parExpression.reset();

                        // Haxe.g:240:96: ( statement )?
                        if ( stream_statement.hasNext() ) {
                            adaptor.addChild(root_1, stream_statement.nextTree());

                        }
                        stream_statement.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 8 :
                    // Haxe.g:241:10: TRY block catchStmtList
                    {
                    TRY128=(Token)match(input,TRY,FOLLOW_TRY_in_statement1827); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TRY.add(TRY128);


                    pushFollow(FOLLOW_block_in_statement1829);
                    block129=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block129.getTree());

                    pushFollow(FOLLOW_catchStmtList_in_statement1831);
                    catchStmtList130=catchStmtList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_catchStmtList.add(catchStmtList130.getTree());

                    // AST REWRITE
                    // elements: block, catchStmtList, TRY
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 241:50: -> ^( TRY ( block )? ( catchStmtList )? )
                    {
                        // Haxe.g:241:53: ^( TRY ( block )? ( catchStmtList )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        new TryNode(stream_TRY.nextToken())
                        , root_1);

                        // Haxe.g:241:68: ( block )?
                        if ( stream_block.hasNext() ) {
                            adaptor.addChild(root_1, stream_block.nextTree());

                        }
                        stream_block.reset();

                        // Haxe.g:241:75: ( catchStmtList )?
                        if ( stream_catchStmtList.hasNext() ) {
                            adaptor.addChild(root_1, stream_catchStmtList.nextTree());

                        }
                        stream_catchStmtList.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 9 :
                    // Haxe.g:242:10: SWITCH LPAREN expr RPAREN LBRACE ( caseStmt )+ RBRACE
                    {
                    SWITCH131=(Token)match(input,SWITCH,FOLLOW_SWITCH_in_statement1873); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SWITCH.add(SWITCH131);


                    LPAREN132=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_statement1875); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN132);


                    pushFollow(FOLLOW_expr_in_statement1877);
                    expr133=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr133.getTree());

                    RPAREN134=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_statement1879); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN134);


                    LBRACE135=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_statement1881); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LBRACE.add(LBRACE135);


                    // Haxe.g:242:43: ( caseStmt )+
                    int cnt32=0;
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==CASE||LA32_0==DEFAULT) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // Haxe.g:242:43: caseStmt
                    	    {
                    	    pushFollow(FOLLOW_caseStmt_in_statement1883);
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


                    RBRACE137=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_statement1886); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RBRACE.add(RBRACE137);


                    // AST REWRITE
                    // elements: caseStmt, SWITCH, expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 242:64: -> ^( SWITCH ( expr )? ( caseStmt )+ )
                    {
                        // Haxe.g:242:67: ^( SWITCH ( expr )? ( caseStmt )+ )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        new SwitchNode(stream_SWITCH.nextToken())
                        , root_1);

                        // Haxe.g:242:88: ( expr )?
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


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 10 :
                    // Haxe.g:243:10: RETURN ( expr )? SEMI
                    {
                    RETURN138=(Token)match(input,RETURN,FOLLOW_RETURN_in_statement1916); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RETURN.add(RETURN138);


                    // Haxe.g:243:17: ( expr )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==BANG||LA33_0==CAST||LA33_0==CHARLITERAL||LA33_0==FALSE||LA33_0==FLOATNUM||LA33_0==FUNCTION||LA33_0==IDENTIFIER||LA33_0==INTLITERAL||LA33_0==LBRACE||(LA33_0 >= LONGLITERAL && LA33_0 <= LPAREN)||(LA33_0 >= NEW && LA33_0 <= NULL)||LA33_0==PLUS||LA33_0==PLUSPLUS||(LA33_0 >= STRINGLITERAL && LA33_0 <= SUB)||LA33_0==SUBSUB||LA33_0==THIS||LA33_0==TILDE||LA33_0==TRUE||LA33_0==UNTYPED) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // Haxe.g:243:18: expr
                            {
                            pushFollow(FOLLOW_expr_in_statement1919);
                            expr139=expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expr.add(expr139.getTree());

                            }
                            break;

                    }


                    SEMI140=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement1923); if (state.failed) return retval; 
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
                    // 243:49: -> ^( RETURN ( expr )? )
                    {
                        // Haxe.g:243:52: ^( RETURN ( expr )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        new ReturnNode(stream_RETURN.nextToken())
                        , root_1);

                        // Haxe.g:243:73: ( expr )?
                        if ( stream_expr.hasNext() ) {
                            adaptor.addChild(root_1, stream_expr.nextTree());

                        }
                        stream_expr.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 11 :
                    // Haxe.g:244:10: THROW expr SEMI
                    {
                    THROW141=(Token)match(input,THROW,FOLLOW_THROW_in_statement1965); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THROW.add(THROW141);


                    pushFollow(FOLLOW_expr_in_statement1967);
                    expr142=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr142.getTree());

                    SEMI143=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement1969); if (state.failed) return retval; 
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
                    // 244:46: -> ^( THROW ( expr )? )
                    {
                        // Haxe.g:244:49: ^( THROW ( expr )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_THROW.nextNode()
                        , root_1);

                        // Haxe.g:244:57: ( expr )?
                        if ( stream_expr.hasNext() ) {
                            adaptor.addChild(root_1, stream_expr.nextTree());

                        }
                        stream_expr.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 12 :
                    // Haxe.g:245:10: BREAK ( IDENTIFIER )? SEMI
                    {
                    BREAK144=(Token)match(input,BREAK,FOLLOW_BREAK_in_statement2009); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_BREAK.add(BREAK144);


                    // Haxe.g:245:16: ( IDENTIFIER )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==IDENTIFIER) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // Haxe.g:245:17: IDENTIFIER
                            {
                            IDENTIFIER145=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_statement2012); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER145);


                            }
                            break;

                    }


                    SEMI146=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement2016); if (state.failed) return retval; 
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
                    // 245:50: -> ^( BREAK ( IDENTIFIER )? )
                    {
                        // Haxe.g:245:53: ^( BREAK ( IDENTIFIER )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_BREAK.nextNode()
                        , root_1);

                        // Haxe.g:245:61: ( IDENTIFIER )?
                        if ( stream_IDENTIFIER.hasNext() ) {
                            adaptor.addChild(root_1, 
                            stream_IDENTIFIER.nextNode()
                            );

                        }
                        stream_IDENTIFIER.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 13 :
                    // Haxe.g:246:10: CONTINUE ( IDENTIFIER )? SEMI
                    {
                    CONTINUE147=(Token)match(input,CONTINUE,FOLLOW_CONTINUE_in_statement2051); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CONTINUE.add(CONTINUE147);


                    // Haxe.g:246:19: ( IDENTIFIER )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==IDENTIFIER) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // Haxe.g:246:20: IDENTIFIER
                            {
                            IDENTIFIER148=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_statement2054); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER148);


                            }
                            break;

                    }


                    SEMI149=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement2058); if (state.failed) return retval; 
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
                    // 246:54: -> ^( CONTINUE ( IDENTIFIER )? )
                    {
                        // Haxe.g:246:57: ^( CONTINUE ( IDENTIFIER )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_CONTINUE.nextNode()
                        , root_1);

                        // Haxe.g:246:68: ( IDENTIFIER )?
                        if ( stream_IDENTIFIER.hasNext() ) {
                            adaptor.addChild(root_1, 
                            stream_IDENTIFIER.nextNode()
                            );

                        }
                        stream_IDENTIFIER.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 14 :
                    // Haxe.g:247:10: expr SEMI !
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_expr_in_statement2094);
                    expr150=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr150.getTree());

                    SEMI151=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement2097); if (state.failed) return retval;

                    }
                    break;
                case 15 :
                    // Haxe.g:248:10: IDENTIFIER COLON statement
                    {
                    IDENTIFIER152=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_statement2109); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER152);


                    COLON153=(Token)match(input,COLON,FOLLOW_COLON_in_statement2111); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(COLON153);


                    pushFollow(FOLLOW_statement_in_statement2113);
                    statement154=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement154.getTree());

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
                    // 248:53: -> ^( COLON ( IDENTIFIER )? ( statement )? )
                    {
                        // Haxe.g:248:56: ^( COLON ( IDENTIFIER )? ( statement )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_COLON.nextNode()
                        , root_1);

                        // Haxe.g:248:64: ( IDENTIFIER )?
                        if ( stream_IDENTIFIER.hasNext() ) {
                            adaptor.addChild(root_1, 
                            stream_IDENTIFIER.nextNode()
                            );

                        }
                        stream_IDENTIFIER.reset();

                        // Haxe.g:248:76: ( statement )?
                        if ( stream_statement.hasNext() ) {
                            adaptor.addChild(root_1, stream_statement.nextTree());

                        }
                        stream_statement.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 16 :
                    // Haxe.g:249:10: SEMI !
                    {
                    root_0 = (Object)adaptor.nil();


                    SEMI155=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement2152); if (state.failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
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
    // Haxe.g:252:1: parExpression : LPAREN ! expr RPAREN !;
    public final HaxeParser.parExpression_return parExpression() throws RecognitionException {
        HaxeParser.parExpression_return retval = new HaxeParser.parExpression_return();
        retval.start = input.LT(1);

        int parExpression_StartIndex = input.index();

        Object root_0 = null;

        Token LPAREN156=null;
        Token RPAREN158=null;
        HaxeParser.expr_return expr157 =null;


        Object LPAREN156_tree=null;
        Object RPAREN158_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return retval; }

            // Haxe.g:253:5: ( LPAREN ! expr RPAREN !)
            // Haxe.g:253:9: LPAREN ! expr RPAREN !
            {
            root_0 = (Object)adaptor.nil();


            LPAREN156=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_parExpression2176); if (state.failed) return retval;

            pushFollow(FOLLOW_expr_in_parExpression2179);
            expr157=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr157.getTree());

            RPAREN158=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_parExpression2181); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
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
    // Haxe.g:256:1: block : ( LBRACE ( blockStmt )* RBRACE -> ^( BLOCK_SCOPE[\"BLOCK_SCOPE\", true, $LBRACE] ( blockStmt )* RBRACE[$RBRACE, true] ) | SEMI !);
    public final HaxeParser.block_return block() throws RecognitionException {
        HaxeParser.block_return retval = new HaxeParser.block_return();
        retval.start = input.LT(1);

        int block_StartIndex = input.index();

        Object root_0 = null;

        Token LBRACE159=null;
        Token RBRACE161=null;
        Token SEMI162=null;
        HaxeParser.blockStmt_return blockStmt160 =null;


        Object LBRACE159_tree=null;
        Object RBRACE161_tree=null;
        Object SEMI162_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_blockStmt=new RewriteRuleSubtreeStream(adaptor,"rule blockStmt");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return retval; }

            // Haxe.g:256:9: ( LBRACE ( blockStmt )* RBRACE -> ^( BLOCK_SCOPE[\"BLOCK_SCOPE\", true, $LBRACE] ( blockStmt )* RBRACE[$RBRACE, true] ) | SEMI !)
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
                    // Haxe.g:256:14: LBRACE ( blockStmt )* RBRACE
                    {
                    LBRACE159=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_block2200); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LBRACE.add(LBRACE159);


                    // Haxe.g:256:21: ( blockStmt )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==BANG||LA37_0==BREAK||LA37_0==CAST||(LA37_0 >= CHARLITERAL && LA37_0 <= CLASS)||LA37_0==CONTINUE||LA37_0==DO||LA37_0==DYNAMIC||LA37_0==ENUM||LA37_0==EXTERN||LA37_0==FALSE||(LA37_0 >= FLOATNUM && LA37_0 <= FUNCTION)||(LA37_0 >= IDENTIFIER && LA37_0 <= IF)||LA37_0==INLINE||(LA37_0 >= INTERFACE && LA37_0 <= INTLITERAL)||LA37_0==LBRACE||(LA37_0 >= LONGLITERAL && LA37_0 <= LPAREN)||LA37_0==MONKEYS_AT||(LA37_0 >= NEW && LA37_0 <= NULL)||LA37_0==OVERRIDE||LA37_0==PLUS||LA37_0==PLUSPLUS||LA37_0==PRIVATE||LA37_0==PUBLIC||LA37_0==RETURN||LA37_0==SEMI||LA37_0==STATIC||(LA37_0 >= STRINGLITERAL && LA37_0 <= SUB)||LA37_0==SUBSUB||(LA37_0 >= SWITCH && LA37_0 <= THROW)||LA37_0==TILDE||(LA37_0 >= TRUE && LA37_0 <= TRY)||LA37_0==UNTYPED||LA37_0==VAR||LA37_0==WHILE) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // Haxe.g:256:22: blockStmt
                    	    {
                    	    pushFollow(FOLLOW_blockStmt_in_block2203);
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


                    RBRACE161=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_block2207); if (state.failed) return retval; 
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
                    // 256:41: -> ^( BLOCK_SCOPE[\"BLOCK_SCOPE\", true, $LBRACE] ( blockStmt )* RBRACE[$RBRACE, true] )
                    {
                        // Haxe.g:256:44: ^( BLOCK_SCOPE[\"BLOCK_SCOPE\", true, $LBRACE] ( blockStmt )* RBRACE[$RBRACE, true] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        new BlockScopeNode(BLOCK_SCOPE, "BLOCK_SCOPE", true, LBRACE159)
                        , root_1);

                        // Haxe.g:256:104: ( blockStmt )*
                        while ( stream_blockStmt.hasNext() ) {
                            adaptor.addChild(root_1, stream_blockStmt.nextTree());

                        }
                        stream_blockStmt.reset();

                        adaptor.addChild(root_1, 
                        new HaxeTree(RBRACE, RBRACE161, true)
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // Haxe.g:257:14: SEMI !
                    {
                    root_0 = (Object)adaptor.nil();


                    SEMI162=(Token)match(input,SEMI,FOLLOW_SEMI_in_block2242); if (state.failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
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
    // Haxe.g:260:1: blockStmt : ( varDecl | classDecl | statement );
    public final HaxeParser.blockStmt_return blockStmt() throws RecognitionException {
        HaxeParser.blockStmt_return retval = new HaxeParser.blockStmt_return();
        retval.start = input.LT(1);

        int blockStmt_StartIndex = input.index();

        Object root_0 = null;

        HaxeParser.varDecl_return varDecl163 =null;

        HaxeParser.classDecl_return classDecl164 =null;

        HaxeParser.statement_return statement165 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return retval; }

            // Haxe.g:261:5: ( varDecl | classDecl | statement )
            int alt39=3;
            switch ( input.LA(1) ) {
            case STATIC:
                {
                int LA39_1 = input.LA(2);

                if ( (synpred69_Haxe()) ) {
                    alt39=1;
                }
                else if ( (true) ) {
                    alt39=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 39, 1, input);

                    throw nvae;

                }
                }
                break;
            case INLINE:
                {
                int LA39_2 = input.LA(2);

                if ( (synpred69_Haxe()) ) {
                    alt39=1;
                }
                else if ( (true) ) {
                    alt39=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 39, 2, input);

                    throw nvae;

                }
                }
                break;
            case DYNAMIC:
                {
                int LA39_3 = input.LA(2);

                if ( (synpred69_Haxe()) ) {
                    alt39=1;
                }
                else if ( (true) ) {
                    alt39=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 39, 3, input);

                    throw nvae;

                }
                }
                break;
            case OVERRIDE:
                {
                int LA39_4 = input.LA(2);

                if ( (synpred69_Haxe()) ) {
                    alt39=1;
                }
                else if ( (true) ) {
                    alt39=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 39, 4, input);

                    throw nvae;

                }
                }
                break;
            case PRIVATE:
                {
                int LA39_5 = input.LA(2);

                if ( (synpred69_Haxe()) ) {
                    alt39=1;
                }
                else if ( (synpred70_Haxe()) ) {
                    alt39=2;
                }
                else if ( (true) ) {
                    alt39=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 39, 5, input);

                    throw nvae;

                }
                }
                break;
            case VAR:
                {
                int LA39_6 = input.LA(2);

                if ( (synpred69_Haxe()) ) {
                    alt39=1;
                }
                else if ( (true) ) {
                    alt39=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 39, 6, input);

                    throw nvae;

                }
                }
                break;
            case CLASS:
            case EXTERN:
            case MONKEYS_AT:
                {
                alt39=2;
                }
                break;
            case PUBLIC:
                {
                int LA39_8 = input.LA(2);

                if ( (synpred69_Haxe()) ) {
                    alt39=1;
                }
                else if ( (true) ) {
                    alt39=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 39, 8, input);

                    throw nvae;

                }
                }
                break;
            case BANG:
            case BREAK:
            case CAST:
            case CHARLITERAL:
            case CONTINUE:
            case DO:
            case FALSE:
            case FLOATNUM:
            case FOR:
            case FUNCTION:
            case IDENTIFIER:
            case IF:
            case INTLITERAL:
            case LBRACE:
            case LONGLITERAL:
            case LPAREN:
            case NEW:
            case NULL:
            case PLUS:
            case PLUSPLUS:
            case RETURN:
            case SEMI:
            case STRINGLITERAL:
            case SUB:
            case SUBSUB:
            case SWITCH:
            case THIS:
            case THROW:
            case TILDE:
            case TRUE:
            case TRY:
            case UNTYPED:
            case WHILE:
                {
                alt39=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;

            }

            switch (alt39) {
                case 1 :
                    // Haxe.g:261:10: varDecl
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_varDecl_in_blockStmt2271);
                    varDecl163=varDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDecl163.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:262:10: classDecl
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_classDecl_in_blockStmt2282);
                    classDecl164=classDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, classDecl164.getTree());

                    }
                    break;
                case 3 :
                    // Haxe.g:263:10: statement
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_statement_in_blockStmt2293);
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
        	// do for sure before leaving
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
    // Haxe.g:266:1: breakStmt : BREAK SEMI !;
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

            // Haxe.g:267:5: ( BREAK SEMI !)
            // Haxe.g:267:10: BREAK SEMI !
            {
            root_0 = (Object)adaptor.nil();


            BREAK166=(Token)match(input,BREAK,FOLLOW_BREAK_in_breakStmt2317); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            BREAK166_tree = 
            (Object)adaptor.create(BREAK166)
            ;
            adaptor.addChild(root_0, BREAK166_tree);
            }

            SEMI167=(Token)match(input,SEMI,FOLLOW_SEMI_in_breakStmt2319); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
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
    // Haxe.g:270:1: continueStmt : CONTINUE SEMI !;
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

            // Haxe.g:271:5: ( CONTINUE SEMI !)
            // Haxe.g:271:10: CONTINUE SEMI !
            {
            root_0 = (Object)adaptor.nil();


            CONTINUE168=(Token)match(input,CONTINUE,FOLLOW_CONTINUE_in_continueStmt2344); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            CONTINUE168_tree = 
            (Object)adaptor.create(CONTINUE168)
            ;
            adaptor.addChild(root_0, CONTINUE168_tree);
            }

            SEMI169=(Token)match(input,SEMI,FOLLOW_SEMI_in_continueStmt2346); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
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
    // Haxe.g:274:1: caseStmt : ( CASE exprList COLON statement -> ^( CASE ( exprList )? ( statement )? ) | DEFAULT COLON statement -> ^( DEFAULT ( statement )? ) );
    public final HaxeParser.caseStmt_return caseStmt() throws RecognitionException {
        HaxeParser.caseStmt_return retval = new HaxeParser.caseStmt_return();
        retval.start = input.LT(1);

        int caseStmt_StartIndex = input.index();

        Object root_0 = null;

        Token CASE170=null;
        Token COLON172=null;
        Token DEFAULT174=null;
        Token COLON175=null;
        HaxeParser.exprList_return exprList171 =null;

        HaxeParser.statement_return statement173 =null;

        HaxeParser.statement_return statement176 =null;


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

            // Haxe.g:275:5: ( CASE exprList COLON statement -> ^( CASE ( exprList )? ( statement )? ) | DEFAULT COLON statement -> ^( DEFAULT ( statement )? ) )
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
                    // Haxe.g:275:10: CASE exprList COLON statement
                    {
                    CASE170=(Token)match(input,CASE,FOLLOW_CASE_in_caseStmt2371); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CASE.add(CASE170);


                    pushFollow(FOLLOW_exprList_in_caseStmt2373);
                    exprList171=exprList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_exprList.add(exprList171.getTree());

                    COLON172=(Token)match(input,COLON,FOLLOW_COLON_in_caseStmt2375); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(COLON172);


                    pushFollow(FOLLOW_statement_in_caseStmt2377);
                    statement173=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement173.getTree());

                    // AST REWRITE
                    // elements: CASE, statement, exprList
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 275:41: -> ^( CASE ( exprList )? ( statement )? )
                    {
                        // Haxe.g:275:44: ^( CASE ( exprList )? ( statement )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_CASE.nextNode()
                        , root_1);

                        // Haxe.g:275:51: ( exprList )?
                        if ( stream_exprList.hasNext() ) {
                            adaptor.addChild(root_1, stream_exprList.nextTree());

                        }
                        stream_exprList.reset();

                        // Haxe.g:275:61: ( statement )?
                        if ( stream_statement.hasNext() ) {
                            adaptor.addChild(root_1, stream_statement.nextTree());

                        }
                        stream_statement.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // Haxe.g:276:10: DEFAULT COLON statement
                    {
                    DEFAULT174=(Token)match(input,DEFAULT,FOLLOW_DEFAULT_in_caseStmt2401); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DEFAULT.add(DEFAULT174);


                    COLON175=(Token)match(input,COLON,FOLLOW_COLON_in_caseStmt2403); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(COLON175);


                    pushFollow(FOLLOW_statement_in_caseStmt2405);
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
                    // 276:41: -> ^( DEFAULT ( statement )? )
                    {
                        // Haxe.g:276:44: ^( DEFAULT ( statement )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_DEFAULT.nextNode()
                        , root_1);

                        // Haxe.g:276:54: ( statement )?
                        if ( stream_statement.hasNext() ) {
                            adaptor.addChild(root_1, stream_statement.nextTree());

                        }
                        stream_statement.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
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
        	// do for sure before leaving
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
    // Haxe.g:279:1: defaultStmt : DEFAULT COLON !;
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

            // Haxe.g:280:5: ( DEFAULT COLON !)
            // Haxe.g:280:10: DEFAULT COLON !
            {
            root_0 = (Object)adaptor.nil();


            DEFAULT177=(Token)match(input,DEFAULT,FOLLOW_DEFAULT_in_defaultStmt2445); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            DEFAULT177_tree = 
            (Object)adaptor.create(DEFAULT177)
            ;
            adaptor.addChild(root_0, DEFAULT177_tree);
            }

            COLON178=(Token)match(input,COLON,FOLLOW_COLON_in_defaultStmt2447); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
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
    // Haxe.g:283:1: catchStmtList : ( catchStmt catchStmtList |);
    public final HaxeParser.catchStmtList_return catchStmtList() throws RecognitionException {
        HaxeParser.catchStmtList_return retval = new HaxeParser.catchStmtList_return();
        retval.start = input.LT(1);

        int catchStmtList_StartIndex = input.index();

        Object root_0 = null;

        HaxeParser.catchStmt_return catchStmt179 =null;

        HaxeParser.catchStmtList_return catchStmtList180 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return retval; }

            // Haxe.g:284:5: ( catchStmt catchStmtList |)
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==CATCH) ) {
                alt41=1;
            }
            else if ( (LA41_0==EOF||LA41_0==BANG||LA41_0==BREAK||(LA41_0 >= CASE && LA41_0 <= CAST)||(LA41_0 >= CHARLITERAL && LA41_0 <= CLASS)||LA41_0==CONTINUE||(LA41_0 >= DEFAULT && LA41_0 <= DO)||LA41_0==DYNAMIC||LA41_0==ELSE||LA41_0==ENUM||LA41_0==EXTERN||LA41_0==FALSE||(LA41_0 >= FLOATNUM && LA41_0 <= FUNCTION)||(LA41_0 >= IDENTIFIER && LA41_0 <= IF)||LA41_0==INLINE||(LA41_0 >= INTERFACE && LA41_0 <= INTLITERAL)||LA41_0==LBRACE||(LA41_0 >= LONGLITERAL && LA41_0 <= LPAREN)||LA41_0==MONKEYS_AT||(LA41_0 >= NEW && LA41_0 <= NULL)||LA41_0==OVERRIDE||LA41_0==PLUS||LA41_0==PLUSPLUS||LA41_0==PRIVATE||LA41_0==PUBLIC||LA41_0==RBRACE||(LA41_0 >= RETURN && LA41_0 <= SEMI)||LA41_0==STATIC||(LA41_0 >= STRINGLITERAL && LA41_0 <= SUB)||LA41_0==SUBSUB||(LA41_0 >= SWITCH && LA41_0 <= THROW)||LA41_0==TILDE||(LA41_0 >= TRUE && LA41_0 <= TRY)||LA41_0==UNTYPED||LA41_0==VAR||LA41_0==WHILE) ) {
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
                    // Haxe.g:284:7: catchStmt catchStmtList
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_catchStmt_in_catchStmtList2469);
                    catchStmt179=catchStmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, catchStmt179.getTree());

                    pushFollow(FOLLOW_catchStmtList_in_catchStmtList2471);
                    catchStmtList180=catchStmtList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, catchStmtList180.getTree());

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
        	// do for sure before leaving
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
    // Haxe.g:288:1: catchStmt : CATCH LPAREN param RPAREN block -> ^( CATCH ( param )? ( block )? ) ;
    public final HaxeParser.catchStmt_return catchStmt() throws RecognitionException {
        HaxeParser.catchStmt_return retval = new HaxeParser.catchStmt_return();
        retval.start = input.LT(1);

        int catchStmt_StartIndex = input.index();

        Object root_0 = null;

        Token CATCH181=null;
        Token LPAREN182=null;
        Token RPAREN184=null;
        HaxeParser.param_return param183 =null;

        HaxeParser.block_return block185 =null;


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

            // Haxe.g:289:5: ( CATCH LPAREN param RPAREN block -> ^( CATCH ( param )? ( block )? ) )
            // Haxe.g:289:10: CATCH LPAREN param RPAREN block
            {
            CATCH181=(Token)match(input,CATCH,FOLLOW_CATCH_in_catchStmt2501); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CATCH.add(CATCH181);


            LPAREN182=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_catchStmt2503); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN182);


            pushFollow(FOLLOW_param_in_catchStmt2505);
            param183=param();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_param.add(param183.getTree());

            RPAREN184=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_catchStmt2507); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN184);


            pushFollow(FOLLOW_block_in_catchStmt2509);
            block185=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block185.getTree());

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
            // 289:42: -> ^( CATCH ( param )? ( block )? )
            {
                // Haxe.g:289:45: ^( CATCH ( param )? ( block )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_CATCH.nextNode()
                , root_1);

                // Haxe.g:289:53: ( param )?
                if ( stream_param.hasNext() ) {
                    adaptor.addChild(root_1, stream_param.nextTree());

                }
                stream_param.reset();

                // Haxe.g:289:60: ( block )?
                if ( stream_block.hasNext() ) {
                    adaptor.addChild(root_1, stream_block.nextTree());

                }
                stream_block.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
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
        	// do for sure before leaving
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
    // Haxe.g:294:1: exprListOpt : ( exprList |);
    public final HaxeParser.exprListOpt_return exprListOpt() throws RecognitionException {
        HaxeParser.exprListOpt_return retval = new HaxeParser.exprListOpt_return();
        retval.start = input.LT(1);

        int exprListOpt_StartIndex = input.index();

        Object root_0 = null;

        HaxeParser.exprList_return exprList186 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return retval; }

            // Haxe.g:295:5: ( exprList |)
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==BANG||LA42_0==CAST||LA42_0==CHARLITERAL||LA42_0==FALSE||LA42_0==FLOATNUM||LA42_0==FUNCTION||LA42_0==IDENTIFIER||LA42_0==INTLITERAL||LA42_0==LBRACE||(LA42_0 >= LONGLITERAL && LA42_0 <= LPAREN)||(LA42_0 >= NEW && LA42_0 <= NULL)||LA42_0==PLUS||LA42_0==PLUSPLUS||(LA42_0 >= STRINGLITERAL && LA42_0 <= SUB)||LA42_0==SUBSUB||LA42_0==THIS||LA42_0==TILDE||LA42_0==TRUE||LA42_0==UNTYPED) ) {
                alt42=1;
            }
            else if ( (LA42_0==RBRACKET||LA42_0==RPAREN) ) {
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
                    // Haxe.g:295:10: exprList
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_exprList_in_exprListOpt2547);
                    exprList186=exprList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, exprList186.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:297:5: 
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
        	// do for sure before leaving
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
    // Haxe.g:299:1: exprList : expr ( COMMA ! expr )* ;
    public final HaxeParser.exprList_return exprList() throws RecognitionException {
        HaxeParser.exprList_return retval = new HaxeParser.exprList_return();
        retval.start = input.LT(1);

        int exprList_StartIndex = input.index();

        Object root_0 = null;

        Token COMMA188=null;
        HaxeParser.expr_return expr187 =null;

        HaxeParser.expr_return expr189 =null;


        Object COMMA188_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return retval; }

            // Haxe.g:300:5: ( expr ( COMMA ! expr )* )
            // Haxe.g:300:10: expr ( COMMA ! expr )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_expr_in_exprList2577);
            expr187=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr187.getTree());

            // Haxe.g:300:15: ( COMMA ! expr )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==COMMA) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // Haxe.g:300:16: COMMA ! expr
            	    {
            	    COMMA188=(Token)match(input,COMMA,FOLLOW_COMMA_in_exprList2580); if (state.failed) return retval;

            	    pushFollow(FOLLOW_expr_in_exprList2583);
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
        	// do for sure before leaving
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
    // Haxe.g:303:1: expr : ( assignExpr | UNTYPED assignExpr -> ^( UNTYPED assignExpr ) );
    public final HaxeParser.expr_return expr() throws RecognitionException {
        HaxeParser.expr_return retval = new HaxeParser.expr_return();
        retval.start = input.LT(1);

        int expr_StartIndex = input.index();

        Object root_0 = null;

        Token UNTYPED191=null;
        HaxeParser.assignExpr_return assignExpr190 =null;

        HaxeParser.assignExpr_return assignExpr192 =null;


        Object UNTYPED191_tree=null;
        RewriteRuleTokenStream stream_UNTYPED=new RewriteRuleTokenStream(adaptor,"token UNTYPED");
        RewriteRuleSubtreeStream stream_assignExpr=new RewriteRuleSubtreeStream(adaptor,"rule assignExpr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 42) ) { return retval; }

            // Haxe.g:304:5: ( assignExpr | UNTYPED assignExpr -> ^( UNTYPED assignExpr ) )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==BANG||LA44_0==CAST||LA44_0==CHARLITERAL||LA44_0==FALSE||LA44_0==FLOATNUM||LA44_0==FUNCTION||LA44_0==IDENTIFIER||LA44_0==INTLITERAL||LA44_0==LBRACE||(LA44_0 >= LONGLITERAL && LA44_0 <= LPAREN)||(LA44_0 >= NEW && LA44_0 <= NULL)||LA44_0==PLUS||LA44_0==PLUSPLUS||(LA44_0 >= STRINGLITERAL && LA44_0 <= SUB)||LA44_0==SUBSUB||LA44_0==THIS||LA44_0==TILDE||LA44_0==TRUE) ) {
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
                    // Haxe.g:304:10: assignExpr
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_assignExpr_in_expr2609);
                    assignExpr190=assignExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignExpr190.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:305:10: UNTYPED assignExpr
                    {
                    UNTYPED191=(Token)match(input,UNTYPED,FOLLOW_UNTYPED_in_expr2620); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_UNTYPED.add(UNTYPED191);


                    pushFollow(FOLLOW_assignExpr_in_expr2622);
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
                    // 305:32: -> ^( UNTYPED assignExpr )
                    {
                        // Haxe.g:305:35: ^( UNTYPED assignExpr )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_UNTYPED.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_assignExpr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
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
        	// do for sure before leaving
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
    // Haxe.g:308:1: assignExpr : iterExpr ( assignOp ^ iterExpr )? ;
    public final HaxeParser.assignExpr_return assignExpr() throws RecognitionException {
        HaxeParser.assignExpr_return retval = new HaxeParser.assignExpr_return();
        retval.start = input.LT(1);

        int assignExpr_StartIndex = input.index();

        Object root_0 = null;

        HaxeParser.iterExpr_return iterExpr193 =null;

        HaxeParser.assignOp_return assignOp194 =null;

        HaxeParser.iterExpr_return iterExpr195 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 43) ) { return retval; }

            // Haxe.g:309:5: ( iterExpr ( assignOp ^ iterExpr )? )
            // Haxe.g:309:11: iterExpr ( assignOp ^ iterExpr )?
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_iterExpr_in_assignExpr2654);
            iterExpr193=iterExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, iterExpr193.getTree());

            // Haxe.g:309:20: ( assignOp ^ iterExpr )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==AMPEQ||LA45_0==EQ||LA45_0==PERCENTEQ||LA45_0==PLUSEQ||LA45_0==SLASHEQ||LA45_0==SUBEQ) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // Haxe.g:309:21: assignOp ^ iterExpr
                    {
                    pushFollow(FOLLOW_assignOp_in_assignExpr2657);
                    assignOp194=assignOp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(assignOp194.getTree(), root_0);

                    pushFollow(FOLLOW_iterExpr_in_assignExpr2660);
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
        	// do for sure before leaving
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
    // Haxe.g:312:1: iterExpr : ternaryExpr ( ELLIPSIS ^ ternaryExpr )? ;
    public final HaxeParser.iterExpr_return iterExpr() throws RecognitionException {
        HaxeParser.iterExpr_return retval = new HaxeParser.iterExpr_return();
        retval.start = input.LT(1);

        int iterExpr_StartIndex = input.index();

        Object root_0 = null;

        Token ELLIPSIS197=null;
        HaxeParser.ternaryExpr_return ternaryExpr196 =null;

        HaxeParser.ternaryExpr_return ternaryExpr198 =null;


        Object ELLIPSIS197_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 44) ) { return retval; }

            // Haxe.g:313:5: ( ternaryExpr ( ELLIPSIS ^ ternaryExpr )? )
            // Haxe.g:313:10: ternaryExpr ( ELLIPSIS ^ ternaryExpr )?
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_ternaryExpr_in_iterExpr2683);
            ternaryExpr196=ternaryExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, ternaryExpr196.getTree());

            // Haxe.g:313:22: ( ELLIPSIS ^ ternaryExpr )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==ELLIPSIS) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // Haxe.g:313:23: ELLIPSIS ^ ternaryExpr
                    {
                    ELLIPSIS197=(Token)match(input,ELLIPSIS,FOLLOW_ELLIPSIS_in_iterExpr2686); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ELLIPSIS197_tree = 
                    new BinaryExpressionNode(ELLIPSIS197) 
                    ;
                    root_0 = (Object)adaptor.becomeRoot(ELLIPSIS197_tree, root_0);
                    }

                    pushFollow(FOLLOW_ternaryExpr_in_iterExpr2692);
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
        	// do for sure before leaving
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
    // Haxe.g:316:1: ternaryExpr : logicOrExpr ( QUES ^ expr COLON ! logicOrExpr )? ;
    public final HaxeParser.ternaryExpr_return ternaryExpr() throws RecognitionException {
        HaxeParser.ternaryExpr_return retval = new HaxeParser.ternaryExpr_return();
        retval.start = input.LT(1);

        int ternaryExpr_StartIndex = input.index();

        Object root_0 = null;

        Token QUES200=null;
        Token COLON202=null;
        HaxeParser.logicOrExpr_return logicOrExpr199 =null;

        HaxeParser.expr_return expr201 =null;

        HaxeParser.logicOrExpr_return logicOrExpr203 =null;


        Object QUES200_tree=null;
        Object COLON202_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 45) ) { return retval; }

            // Haxe.g:317:5: ( logicOrExpr ( QUES ^ expr COLON ! logicOrExpr )? )
            // Haxe.g:317:10: logicOrExpr ( QUES ^ expr COLON ! logicOrExpr )?
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_logicOrExpr_in_ternaryExpr2714);
            logicOrExpr199=logicOrExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, logicOrExpr199.getTree());

            // Haxe.g:317:22: ( QUES ^ expr COLON ! logicOrExpr )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==QUES) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // Haxe.g:317:23: QUES ^ expr COLON ! logicOrExpr
                    {
                    QUES200=(Token)match(input,QUES,FOLLOW_QUES_in_ternaryExpr2717); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    QUES200_tree = 
                    new BinaryExpressionNode(QUES200) 
                    ;
                    root_0 = (Object)adaptor.becomeRoot(QUES200_tree, root_0);
                    }

                    pushFollow(FOLLOW_expr_in_ternaryExpr2723);
                    expr201=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr201.getTree());

                    COLON202=(Token)match(input,COLON,FOLLOW_COLON_in_ternaryExpr2725); if (state.failed) return retval;

                    pushFollow(FOLLOW_logicOrExpr_in_ternaryExpr2728);
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
        	// do for sure before leaving
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
    // Haxe.g:320:1: logicOrExpr : logicAndExpr ( BARBAR ^ logicAndExpr )* ;
    public final HaxeParser.logicOrExpr_return logicOrExpr() throws RecognitionException {
        HaxeParser.logicOrExpr_return retval = new HaxeParser.logicOrExpr_return();
        retval.start = input.LT(1);

        int logicOrExpr_StartIndex = input.index();

        Object root_0 = null;

        Token BARBAR205=null;
        HaxeParser.logicAndExpr_return logicAndExpr204 =null;

        HaxeParser.logicAndExpr_return logicAndExpr206 =null;


        Object BARBAR205_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 46) ) { return retval; }

            // Haxe.g:321:5: ( logicAndExpr ( BARBAR ^ logicAndExpr )* )
            // Haxe.g:321:10: logicAndExpr ( BARBAR ^ logicAndExpr )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_logicAndExpr_in_logicOrExpr2751);
            logicAndExpr204=logicAndExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, logicAndExpr204.getTree());

            // Haxe.g:321:23: ( BARBAR ^ logicAndExpr )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==BARBAR) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // Haxe.g:321:24: BARBAR ^ logicAndExpr
            	    {
            	    BARBAR205=(Token)match(input,BARBAR,FOLLOW_BARBAR_in_logicOrExpr2754); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    BARBAR205_tree = 
            	    new BinaryExpressionNode(BARBAR205) 
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(BARBAR205_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_logicAndExpr_in_logicOrExpr2760);
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
        	// do for sure before leaving
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
    // Haxe.g:324:1: logicAndExpr : cmpExpr ( AMPAMP ^ cmpExpr )* ;
    public final HaxeParser.logicAndExpr_return logicAndExpr() throws RecognitionException {
        HaxeParser.logicAndExpr_return retval = new HaxeParser.logicAndExpr_return();
        retval.start = input.LT(1);

        int logicAndExpr_StartIndex = input.index();

        Object root_0 = null;

        Token AMPAMP208=null;
        HaxeParser.cmpExpr_return cmpExpr207 =null;

        HaxeParser.cmpExpr_return cmpExpr209 =null;


        Object AMPAMP208_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 47) ) { return retval; }

            // Haxe.g:325:5: ( cmpExpr ( AMPAMP ^ cmpExpr )* )
            // Haxe.g:326:5: cmpExpr ( AMPAMP ^ cmpExpr )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_cmpExpr_in_logicAndExpr2791);
            cmpExpr207=cmpExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, cmpExpr207.getTree());

            // Haxe.g:327:5: ( AMPAMP ^ cmpExpr )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==AMPAMP) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // Haxe.g:327:6: AMPAMP ^ cmpExpr
            	    {
            	    AMPAMP208=(Token)match(input,AMPAMP,FOLLOW_AMPAMP_in_logicAndExpr2799); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    AMPAMP208_tree = 
            	    new BinaryExpressionNode(AMPAMP208) 
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(AMPAMP208_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_cmpExpr_in_logicAndExpr2805);
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
        	// do for sure before leaving
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
    // Haxe.g:330:1: cmpExpr : bitExpr ( ( EQEQ ^| BANGEQ ^| GTEQ ^| LTEQ ^| GT ^| LT ^) bitExpr )* ;
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
        HaxeParser.bitExpr_return bitExpr210 =null;

        HaxeParser.bitExpr_return bitExpr217 =null;


        Object EQEQ211_tree=null;
        Object BANGEQ212_tree=null;
        Object GTEQ213_tree=null;
        Object LTEQ214_tree=null;
        Object GT215_tree=null;
        Object LT216_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 48) ) { return retval; }

            // Haxe.g:330:9: ( bitExpr ( ( EQEQ ^| BANGEQ ^| GTEQ ^| LTEQ ^| GT ^| LT ^) bitExpr )* )
            // Haxe.g:331:5: bitExpr ( ( EQEQ ^| BANGEQ ^| GTEQ ^| LTEQ ^| GT ^| LT ^) bitExpr )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_bitExpr_in_cmpExpr2832);
            bitExpr210=bitExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bitExpr210.getTree());

            // Haxe.g:332:5: ( ( EQEQ ^| BANGEQ ^| GTEQ ^| LTEQ ^| GT ^| LT ^) bitExpr )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==BANGEQ||LA51_0==EQEQ||(LA51_0 >= GT && LA51_0 <= GTEQ)||(LA51_0 >= LT && LA51_0 <= LTEQ)) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // Haxe.g:332:6: ( EQEQ ^| BANGEQ ^| GTEQ ^| LTEQ ^| GT ^| LT ^) bitExpr
            	    {
            	    // Haxe.g:332:6: ( EQEQ ^| BANGEQ ^| GTEQ ^| LTEQ ^| GT ^| LT ^)
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
            	            // Haxe.g:332:7: EQEQ ^
            	            {
            	            EQEQ211=(Token)match(input,EQEQ,FOLLOW_EQEQ_in_cmpExpr2841); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            EQEQ211_tree = 
            	            new BinaryExpressionNode(EQEQ211) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(EQEQ211_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // Haxe.g:333:9: BANGEQ ^
            	            {
            	            BANGEQ212=(Token)match(input,BANGEQ,FOLLOW_BANGEQ_in_cmpExpr2856); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            BANGEQ212_tree = 
            	            new BinaryExpressionNode(BANGEQ212) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(BANGEQ212_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // Haxe.g:334:9: GTEQ ^
            	            {
            	            GTEQ213=(Token)match(input,GTEQ,FOLLOW_GTEQ_in_cmpExpr2871); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            GTEQ213_tree = 
            	            new BinaryExpressionNode(GTEQ213) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(GTEQ213_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // Haxe.g:335:9: LTEQ ^
            	            {
            	            LTEQ214=(Token)match(input,LTEQ,FOLLOW_LTEQ_in_cmpExpr2886); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            LTEQ214_tree = 
            	            new BinaryExpressionNode(LTEQ214) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(LTEQ214_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 5 :
            	            // Haxe.g:336:9: GT ^
            	            {
            	            GT215=(Token)match(input,GT,FOLLOW_GT_in_cmpExpr2901); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            GT215_tree = 
            	            new BinaryExpressionNode(GT215) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(GT215_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 6 :
            	            // Haxe.g:337:9: LT ^
            	            {
            	            LT216=(Token)match(input,LT,FOLLOW_LT_in_cmpExpr2916); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            LT216_tree = 
            	            new BinaryExpressionNode(LT216) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(LT216_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_bitExpr_in_cmpExpr2931);
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
        	// do for sure before leaving
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
    // Haxe.g:343:1: bitExpr : ( shiftExpr ) ( ( BAR ^| AMP ^| CARET ^) shiftExpr )* ;
    public final HaxeParser.bitExpr_return bitExpr() throws RecognitionException {
        HaxeParser.bitExpr_return retval = new HaxeParser.bitExpr_return();
        retval.start = input.LT(1);

        int bitExpr_StartIndex = input.index();

        Object root_0 = null;

        Token BAR219=null;
        Token AMP220=null;
        Token CARET221=null;
        HaxeParser.shiftExpr_return shiftExpr218 =null;

        HaxeParser.shiftExpr_return shiftExpr222 =null;


        Object BAR219_tree=null;
        Object AMP220_tree=null;
        Object CARET221_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 49) ) { return retval; }

            // Haxe.g:343:9: ( ( shiftExpr ) ( ( BAR ^| AMP ^| CARET ^) shiftExpr )* )
            // Haxe.g:343:14: ( shiftExpr ) ( ( BAR ^| AMP ^| CARET ^) shiftExpr )*
            {
            root_0 = (Object)adaptor.nil();


            // Haxe.g:343:14: ( shiftExpr )
            // Haxe.g:343:15: shiftExpr
            {
            pushFollow(FOLLOW_shiftExpr_in_bitExpr2959);
            shiftExpr218=shiftExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, shiftExpr218.getTree());

            }


            // Haxe.g:343:26: ( ( BAR ^| AMP ^| CARET ^) shiftExpr )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==AMP||LA53_0==BAR||LA53_0==CARET) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // Haxe.g:343:27: ( BAR ^| AMP ^| CARET ^) shiftExpr
            	    {
            	    // Haxe.g:343:27: ( BAR ^| AMP ^| CARET ^)
            	    int alt52=3;
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
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 52, 0, input);

            	        throw nvae;

            	    }

            	    switch (alt52) {
            	        case 1 :
            	            // Haxe.g:343:28: BAR ^
            	            {
            	            BAR219=(Token)match(input,BAR,FOLLOW_BAR_in_bitExpr2964); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            BAR219_tree = 
            	            new BinaryExpressionNode(BAR219) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(BAR219_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // Haxe.g:343:57: AMP ^
            	            {
            	            AMP220=(Token)match(input,AMP,FOLLOW_AMP_in_bitExpr2972); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            AMP220_tree = 
            	            new BinaryExpressionNode(AMP220) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(AMP220_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // Haxe.g:343:86: CARET ^
            	            {
            	            CARET221=(Token)match(input,CARET,FOLLOW_CARET_in_bitExpr2980); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            CARET221_tree = 
            	            new BinaryExpressionNode(CARET221) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(CARET221_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_shiftExpr_in_bitExpr2987);
            	    shiftExpr222=shiftExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, shiftExpr222.getTree());

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
        	// do for sure before leaving
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
    // Haxe.g:346:1: shiftExpr : ( addExpr ) ( ( LTLT ^| ( GT GT ) ^| GTGTGT ^) addExpr )* ;
    public final HaxeParser.shiftExpr_return shiftExpr() throws RecognitionException {
        HaxeParser.shiftExpr_return retval = new HaxeParser.shiftExpr_return();
        retval.start = input.LT(1);

        int shiftExpr_StartIndex = input.index();

        Object root_0 = null;

        Token LTLT224=null;
        Token GT225=null;
        Token GT226=null;
        Token GTGTGT227=null;
        HaxeParser.addExpr_return addExpr223 =null;

        HaxeParser.addExpr_return addExpr228 =null;


        Object LTLT224_tree=null;
        Object GT225_tree=null;
        Object GT226_tree=null;
        Object GTGTGT227_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 50) ) { return retval; }

            // Haxe.g:347:5: ( ( addExpr ) ( ( LTLT ^| ( GT GT ) ^| GTGTGT ^) addExpr )* )
            // Haxe.g:347:10: ( addExpr ) ( ( LTLT ^| ( GT GT ) ^| GTGTGT ^) addExpr )*
            {
            root_0 = (Object)adaptor.nil();


            // Haxe.g:347:10: ( addExpr )
            // Haxe.g:347:11: addExpr
            {
            pushFollow(FOLLOW_addExpr_in_shiftExpr3016);
            addExpr223=addExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, addExpr223.getTree());

            }


            // Haxe.g:347:20: ( ( LTLT ^| ( GT GT ) ^| GTGTGT ^) addExpr )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==GT) ) {
                    int LA55_2 = input.LA(2);

                    if ( (LA55_2==GT) ) {
                        alt55=1;
                    }


                }
                else if ( (LA55_0==GTGTGT||LA55_0==LTLT) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // Haxe.g:347:21: ( LTLT ^| ( GT GT ) ^| GTGTGT ^) addExpr
            	    {
            	    // Haxe.g:347:21: ( LTLT ^| ( GT GT ) ^| GTGTGT ^)
            	    int alt54=3;
            	    switch ( input.LA(1) ) {
            	    case LTLT:
            	        {
            	        alt54=1;
            	        }
            	        break;
            	    case GT:
            	        {
            	        alt54=2;
            	        }
            	        break;
            	    case GTGTGT:
            	        {
            	        alt54=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 54, 0, input);

            	        throw nvae;

            	    }

            	    switch (alt54) {
            	        case 1 :
            	            // Haxe.g:347:22: LTLT ^
            	            {
            	            LTLT224=(Token)match(input,LTLT,FOLLOW_LTLT_in_shiftExpr3021); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            LTLT224_tree = 
            	            new BinaryExpressionNode(LTLT224) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(LTLT224_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // Haxe.g:347:52: ( GT GT ) ^
            	            {
            	            // Haxe.g:347:52: ( GT GT )
            	            // Haxe.g:347:53: GT GT
            	            {
            	            GT225=(Token)match(input,GT,FOLLOW_GT_in_shiftExpr3030); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            GT225_tree = 
            	            new BinaryExpressionNode(GT225) 
            	            ;
            	            adaptor.addChild(root_0, GT225_tree);
            	            }

            	            GT226=(Token)match(input,GT,FOLLOW_GT_in_shiftExpr3035); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            GT226_tree = 
            	            (Object)adaptor.create(GT226)
            	            ;
            	            adaptor.addChild(root_0, GT226_tree);
            	            }

            	            }


            	            }
            	            break;
            	        case 3 :
            	            // Haxe.g:347:85: GTGTGT ^
            	            {
            	            GTGTGT227=(Token)match(input,GTGTGT,FOLLOW_GTGTGT_in_shiftExpr3041); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            GTGTGT227_tree = 
            	            new BinaryExpressionNode(GTGTGT227) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(GTGTGT227_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_addExpr_in_shiftExpr3048);
            	    addExpr228=addExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, addExpr228.getTree());

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
        	// do for sure before leaving
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
    // Haxe.g:350:1: addExpr : ( multExpr ) ( ( PLUS ^| SUB ^) multExpr )* ;
    public final HaxeParser.addExpr_return addExpr() throws RecognitionException {
        HaxeParser.addExpr_return retval = new HaxeParser.addExpr_return();
        retval.start = input.LT(1);

        int addExpr_StartIndex = input.index();

        Object root_0 = null;

        Token PLUS230=null;
        Token SUB231=null;
        HaxeParser.multExpr_return multExpr229 =null;

        HaxeParser.multExpr_return multExpr232 =null;


        Object PLUS230_tree=null;
        Object SUB231_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 51) ) { return retval; }

            // Haxe.g:350:9: ( ( multExpr ) ( ( PLUS ^| SUB ^) multExpr )* )
            // Haxe.g:350:15: ( multExpr ) ( ( PLUS ^| SUB ^) multExpr )*
            {
            root_0 = (Object)adaptor.nil();


            // Haxe.g:350:15: ( multExpr )
            // Haxe.g:350:16: multExpr
            {
            pushFollow(FOLLOW_multExpr_in_addExpr3068);
            multExpr229=multExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, multExpr229.getTree());

            }


            // Haxe.g:350:26: ( ( PLUS ^| SUB ^) multExpr )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==PLUS||LA57_0==SUB) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // Haxe.g:350:27: ( PLUS ^| SUB ^) multExpr
            	    {
            	    // Haxe.g:350:27: ( PLUS ^| SUB ^)
            	    int alt56=2;
            	    int LA56_0 = input.LA(1);

            	    if ( (LA56_0==PLUS) ) {
            	        alt56=1;
            	    }
            	    else if ( (LA56_0==SUB) ) {
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
            	            // Haxe.g:350:28: PLUS ^
            	            {
            	            PLUS230=(Token)match(input,PLUS,FOLLOW_PLUS_in_addExpr3073); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            PLUS230_tree = 
            	            new BinaryExpressionNode(PLUS230) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(PLUS230_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // Haxe.g:350:58: SUB ^
            	            {
            	            SUB231=(Token)match(input,SUB,FOLLOW_SUB_in_addExpr3081); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            SUB231_tree = 
            	            new BinaryExpressionNode(SUB231) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(SUB231_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_multExpr_in_addExpr3088);
            	    multExpr232=multExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, multExpr232.getTree());

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
        	// do for sure before leaving
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
    // Haxe.g:353:1: multExpr : ( psExpr ) ( ( STAR | SLASH | PERCENT ) ^ psExpr )* ;
    public final HaxeParser.multExpr_return multExpr() throws RecognitionException {
        HaxeParser.multExpr_return retval = new HaxeParser.multExpr_return();
        retval.start = input.LT(1);

        int multExpr_StartIndex = input.index();

        Object root_0 = null;

        Token STAR234=null;
        Token SLASH235=null;
        Token PERCENT236=null;
        HaxeParser.psExpr_return psExpr233 =null;

        HaxeParser.psExpr_return psExpr237 =null;


        Object STAR234_tree=null;
        Object SLASH235_tree=null;
        Object PERCENT236_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 52) ) { return retval; }

            // Haxe.g:353:9: ( ( psExpr ) ( ( STAR | SLASH | PERCENT ) ^ psExpr )* )
            // Haxe.g:353:14: ( psExpr ) ( ( STAR | SLASH | PERCENT ) ^ psExpr )*
            {
            root_0 = (Object)adaptor.nil();


            // Haxe.g:353:14: ( psExpr )
            // Haxe.g:353:15: psExpr
            {
            pushFollow(FOLLOW_psExpr_in_multExpr3115);
            psExpr233=psExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, psExpr233.getTree());

            }


            // Haxe.g:353:23: ( ( STAR | SLASH | PERCENT ) ^ psExpr )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==PERCENT||LA59_0==SLASH||LA59_0==STAR) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // Haxe.g:353:24: ( STAR | SLASH | PERCENT ) ^ psExpr
            	    {
            	    // Haxe.g:353:24: ( STAR | SLASH | PERCENT )
            	    int alt58=3;
            	    switch ( input.LA(1) ) {
            	    case STAR:
            	        {
            	        alt58=1;
            	        }
            	        break;
            	    case SLASH:
            	        {
            	        alt58=2;
            	        }
            	        break;
            	    case PERCENT:
            	        {
            	        alt58=3;
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
            	            // Haxe.g:353:25: STAR
            	            {
            	            STAR234=(Token)match(input,STAR,FOLLOW_STAR_in_multExpr3120); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            STAR234_tree = 
            	            new BinaryExpressionNode(STAR234) 
            	            ;
            	            adaptor.addChild(root_0, STAR234_tree);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // Haxe.g:353:54: SLASH
            	            {
            	            SLASH235=(Token)match(input,SLASH,FOLLOW_SLASH_in_multExpr3127); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            SLASH235_tree = 
            	            new BinaryExpressionNode(SLASH235) 
            	            ;
            	            adaptor.addChild(root_0, SLASH235_tree);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // Haxe.g:353:84: PERCENT
            	            {
            	            PERCENT236=(Token)match(input,PERCENT,FOLLOW_PERCENT_in_multExpr3134); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            PERCENT236_tree = 
            	            new BinaryExpressionNode(PERCENT236) 
            	            ;
            	            adaptor.addChild(root_0, PERCENT236_tree);
            	            }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_psExpr_in_multExpr3141);
            	    psExpr237=psExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, psExpr237.getTree());

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
        	// do for sure before leaving
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
    // Haxe.g:356:1: psExpr : ( prefixExpr | suffixExpr | value );
    public final HaxeParser.psExpr_return psExpr() throws RecognitionException {
        HaxeParser.psExpr_return retval = new HaxeParser.psExpr_return();
        retval.start = input.LT(1);

        int psExpr_StartIndex = input.index();

        Object root_0 = null;

        HaxeParser.prefixExpr_return prefixExpr238 =null;

        HaxeParser.suffixExpr_return suffixExpr239 =null;

        HaxeParser.value_return value240 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 53) ) { return retval; }

            // Haxe.g:357:6: ( prefixExpr | suffixExpr | value )
            int alt60=3;
            switch ( input.LA(1) ) {
            case BANG:
            case CAST:
            case FUNCTION:
            case NEW:
            case PLUS:
            case PLUSPLUS:
            case SUB:
            case SUBSUB:
            case TILDE:
                {
                alt60=1;
                }
                break;
            case LBRACE:
                {
                int LA60_5 = input.LA(2);

                if ( (synpred99_Haxe()) ) {
                    alt60=2;
                }
                else if ( (true) ) {
                    alt60=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 60, 5, input);

                    throw nvae;

                }
                }
                break;
            case LONGLITERAL:
                {
                int LA60_6 = input.LA(2);

                if ( (synpred99_Haxe()) ) {
                    alt60=2;
                }
                else if ( (true) ) {
                    alt60=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 60, 6, input);

                    throw nvae;

                }
                }
                break;
            case NULL:
                {
                int LA60_7 = input.LA(2);

                if ( (synpred99_Haxe()) ) {
                    alt60=2;
                }
                else if ( (true) ) {
                    alt60=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 60, 7, input);

                    throw nvae;

                }
                }
                break;
            case INTLITERAL:
                {
                int LA60_8 = input.LA(2);

                if ( (synpred99_Haxe()) ) {
                    alt60=2;
                }
                else if ( (true) ) {
                    alt60=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 60, 8, input);

                    throw nvae;

                }
                }
                break;
            case STRINGLITERAL:
                {
                int LA60_9 = input.LA(2);

                if ( (synpred99_Haxe()) ) {
                    alt60=2;
                }
                else if ( (true) ) {
                    alt60=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 60, 9, input);

                    throw nvae;

                }
                }
                break;
            case CHARLITERAL:
                {
                int LA60_10 = input.LA(2);

                if ( (synpred99_Haxe()) ) {
                    alt60=2;
                }
                else if ( (true) ) {
                    alt60=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 60, 10, input);

                    throw nvae;

                }
                }
                break;
            case FLOATNUM:
                {
                int LA60_11 = input.LA(2);

                if ( (synpred99_Haxe()) ) {
                    alt60=2;
                }
                else if ( (true) ) {
                    alt60=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 60, 11, input);

                    throw nvae;

                }
                }
                break;
            case TRUE:
                {
                int LA60_12 = input.LA(2);

                if ( (synpred99_Haxe()) ) {
                    alt60=2;
                }
                else if ( (true) ) {
                    alt60=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 60, 12, input);

                    throw nvae;

                }
                }
                break;
            case FALSE:
                {
                int LA60_13 = input.LA(2);

                if ( (synpred99_Haxe()) ) {
                    alt60=2;
                }
                else if ( (true) ) {
                    alt60=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 60, 13, input);

                    throw nvae;

                }
                }
                break;
            case LPAREN:
                {
                int LA60_14 = input.LA(2);

                if ( (synpred99_Haxe()) ) {
                    alt60=2;
                }
                else if ( (true) ) {
                    alt60=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 60, 14, input);

                    throw nvae;

                }
                }
                break;
            case IDENTIFIER:
                {
                int LA60_15 = input.LA(2);

                if ( (synpred99_Haxe()) ) {
                    alt60=2;
                }
                else if ( (true) ) {
                    alt60=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 60, 15, input);

                    throw nvae;

                }
                }
                break;
            case THIS:
                {
                int LA60_16 = input.LA(2);

                if ( (synpred99_Haxe()) ) {
                    alt60=2;
                }
                else if ( (true) ) {
                    alt60=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 60, 16, input);

                    throw nvae;

                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;

            }

            switch (alt60) {
                case 1 :
                    // Haxe.g:357:8: prefixExpr
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_prefixExpr_in_psExpr3173);
                    prefixExpr238=prefixExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, prefixExpr238.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:358:8: suffixExpr
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_suffixExpr_in_psExpr3182);
                    suffixExpr239=suffixExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, suffixExpr239.getTree());

                    }
                    break;
                case 3 :
                    // Haxe.g:359:9: value
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_value_in_psExpr3192);
                    value240=value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, value240.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
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
    // Haxe.g:362:1: prefixExpr : ( ( SUB | SUBSUB | PLUS | PLUSPLUS | BANG | TILDE ) ^ value | newExpr | cast | funcLit );
    public final HaxeParser.prefixExpr_return prefixExpr() throws RecognitionException {
        HaxeParser.prefixExpr_return retval = new HaxeParser.prefixExpr_return();
        retval.start = input.LT(1);

        int prefixExpr_StartIndex = input.index();

        Object root_0 = null;

        Token set241=null;
        HaxeParser.value_return value242 =null;

        HaxeParser.newExpr_return newExpr243 =null;

        HaxeParser.cast_return cast244 =null;

        HaxeParser.funcLit_return funcLit245 =null;


        Object set241_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 54) ) { return retval; }

            // Haxe.g:363:2: ( ( SUB | SUBSUB | PLUS | PLUSPLUS | BANG | TILDE ) ^ value | newExpr | cast | funcLit )
            int alt61=4;
            switch ( input.LA(1) ) {
            case BANG:
            case PLUS:
            case PLUSPLUS:
            case SUB:
            case SUBSUB:
            case TILDE:
                {
                alt61=1;
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
            case FUNCTION:
                {
                alt61=4;
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
                    // Haxe.g:363:7: ( SUB | SUBSUB | PLUS | PLUSPLUS | BANG | TILDE ) ^ value
                    {
                    root_0 = (Object)adaptor.nil();


                    set241=(Token)input.LT(1);

                    set241=(Token)input.LT(1);

                    if ( input.LA(1)==BANG||input.LA(1)==PLUS||input.LA(1)==PLUSPLUS||input.LA(1)==SUB||input.LA(1)==SUBSUB||input.LA(1)==TILDE ) {
                        input.consume();
                        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(set241)
                        , root_0);
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    pushFollow(FOLLOW_value_in_prefixExpr3229);
                    value242=value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, value242.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:364:4: newExpr
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_newExpr_in_prefixExpr3234);
                    newExpr243=newExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, newExpr243.getTree());

                    }
                    break;
                case 3 :
                    // Haxe.g:365:8: cast
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_cast_in_prefixExpr3243);
                    cast244=cast();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, cast244.getTree());

                    }
                    break;
                case 4 :
                    // Haxe.g:366:8: funcLit
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_funcLit_in_prefixExpr3257);
                    funcLit245=funcLit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, funcLit245.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
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
    // Haxe.g:369:1: suffixExpr : ( value methodCallOrSliceList -> ^( SUFFIX_EXPR[\"CallOrSlice\",true] ( value )? ( methodCallOrSliceList )? ) | value PLUSPLUS -> ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] ( value )? ( PLUSPLUS )? ) | value SUBSUB -> ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] ( value )? SUBSUB ) );
    public final HaxeParser.suffixExpr_return suffixExpr() throws RecognitionException {
        HaxeParser.suffixExpr_return retval = new HaxeParser.suffixExpr_return();
        retval.start = input.LT(1);

        int suffixExpr_StartIndex = input.index();

        Object root_0 = null;

        Token PLUSPLUS249=null;
        Token SUBSUB251=null;
        HaxeParser.value_return value246 =null;

        HaxeParser.methodCallOrSliceList_return methodCallOrSliceList247 =null;

        HaxeParser.value_return value248 =null;

        HaxeParser.value_return value250 =null;


        Object PLUSPLUS249_tree=null;
        Object SUBSUB251_tree=null;
        RewriteRuleTokenStream stream_SUBSUB=new RewriteRuleTokenStream(adaptor,"token SUBSUB");
        RewriteRuleTokenStream stream_PLUSPLUS=new RewriteRuleTokenStream(adaptor,"token PLUSPLUS");
        RewriteRuleSubtreeStream stream_methodCallOrSliceList=new RewriteRuleSubtreeStream(adaptor,"rule methodCallOrSliceList");
        RewriteRuleSubtreeStream stream_value=new RewriteRuleSubtreeStream(adaptor,"rule value");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 55) ) { return retval; }

            // Haxe.g:370:5: ( value methodCallOrSliceList -> ^( SUFFIX_EXPR[\"CallOrSlice\",true] ( value )? ( methodCallOrSliceList )? ) | value PLUSPLUS -> ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] ( value )? ( PLUSPLUS )? ) | value SUBSUB -> ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] ( value )? SUBSUB ) )
            int alt62=3;
            switch ( input.LA(1) ) {
            case LBRACE:
                {
                int LA62_1 = input.LA(2);

                if ( (synpred108_Haxe()) ) {
                    alt62=1;
                }
                else if ( (synpred109_Haxe()) ) {
                    alt62=2;
                }
                else if ( (true) ) {
                    alt62=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 62, 1, input);

                    throw nvae;

                }
                }
                break;
            case LONGLITERAL:
                {
                int LA62_2 = input.LA(2);

                if ( (synpred108_Haxe()) ) {
                    alt62=1;
                }
                else if ( (synpred109_Haxe()) ) {
                    alt62=2;
                }
                else if ( (true) ) {
                    alt62=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 62, 2, input);

                    throw nvae;

                }
                }
                break;
            case NULL:
                {
                int LA62_3 = input.LA(2);

                if ( (synpred108_Haxe()) ) {
                    alt62=1;
                }
                else if ( (synpred109_Haxe()) ) {
                    alt62=2;
                }
                else if ( (true) ) {
                    alt62=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 62, 3, input);

                    throw nvae;

                }
                }
                break;
            case INTLITERAL:
                {
                int LA62_4 = input.LA(2);

                if ( (synpred108_Haxe()) ) {
                    alt62=1;
                }
                else if ( (synpred109_Haxe()) ) {
                    alt62=2;
                }
                else if ( (true) ) {
                    alt62=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 62, 4, input);

                    throw nvae;

                }
                }
                break;
            case STRINGLITERAL:
                {
                int LA62_5 = input.LA(2);

                if ( (synpred108_Haxe()) ) {
                    alt62=1;
                }
                else if ( (synpred109_Haxe()) ) {
                    alt62=2;
                }
                else if ( (true) ) {
                    alt62=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 62, 5, input);

                    throw nvae;

                }
                }
                break;
            case CHARLITERAL:
                {
                int LA62_6 = input.LA(2);

                if ( (synpred108_Haxe()) ) {
                    alt62=1;
                }
                else if ( (synpred109_Haxe()) ) {
                    alt62=2;
                }
                else if ( (true) ) {
                    alt62=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 62, 6, input);

                    throw nvae;

                }
                }
                break;
            case FLOATNUM:
                {
                int LA62_7 = input.LA(2);

                if ( (synpred108_Haxe()) ) {
                    alt62=1;
                }
                else if ( (synpred109_Haxe()) ) {
                    alt62=2;
                }
                else if ( (true) ) {
                    alt62=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 62, 7, input);

                    throw nvae;

                }
                }
                break;
            case TRUE:
                {
                int LA62_8 = input.LA(2);

                if ( (synpred108_Haxe()) ) {
                    alt62=1;
                }
                else if ( (synpred109_Haxe()) ) {
                    alt62=2;
                }
                else if ( (true) ) {
                    alt62=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 62, 8, input);

                    throw nvae;

                }
                }
                break;
            case FALSE:
                {
                int LA62_9 = input.LA(2);

                if ( (synpred108_Haxe()) ) {
                    alt62=1;
                }
                else if ( (synpred109_Haxe()) ) {
                    alt62=2;
                }
                else if ( (true) ) {
                    alt62=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 62, 9, input);

                    throw nvae;

                }
                }
                break;
            case LPAREN:
                {
                int LA62_10 = input.LA(2);

                if ( (synpred108_Haxe()) ) {
                    alt62=1;
                }
                else if ( (synpred109_Haxe()) ) {
                    alt62=2;
                }
                else if ( (true) ) {
                    alt62=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 62, 10, input);

                    throw nvae;

                }
                }
                break;
            case IDENTIFIER:
                {
                int LA62_11 = input.LA(2);

                if ( (synpred108_Haxe()) ) {
                    alt62=1;
                }
                else if ( (synpred109_Haxe()) ) {
                    alt62=2;
                }
                else if ( (true) ) {
                    alt62=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 62, 11, input);

                    throw nvae;

                }
                }
                break;
            case THIS:
                {
                int LA62_12 = input.LA(2);

                if ( (synpred108_Haxe()) ) {
                    alt62=1;
                }
                else if ( (synpred109_Haxe()) ) {
                    alt62=2;
                }
                else if ( (true) ) {
                    alt62=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 62, 12, input);

                    throw nvae;

                }
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
                    // Haxe.g:370:10: value methodCallOrSliceList
                    {
                    pushFollow(FOLLOW_value_in_suffixExpr3279);
                    value246=value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_value.add(value246.getTree());

                    pushFollow(FOLLOW_methodCallOrSliceList_in_suffixExpr3281);
                    methodCallOrSliceList247=methodCallOrSliceList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_methodCallOrSliceList.add(methodCallOrSliceList247.getTree());

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
                    // 370:38: -> ^( SUFFIX_EXPR[\"CallOrSlice\",true] ( value )? ( methodCallOrSliceList )? )
                    {
                        // Haxe.g:370:41: ^( SUFFIX_EXPR[\"CallOrSlice\",true] ( value )? ( methodCallOrSliceList )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        new HaxeTree(SUFFIX_EXPR, "CallOrSlice", true)
                        , root_1);

                        // Haxe.g:370:85: ( value )?
                        if ( stream_value.hasNext() ) {
                            adaptor.addChild(root_1, stream_value.nextTree());

                        }
                        stream_value.reset();

                        // Haxe.g:370:92: ( methodCallOrSliceList )?
                        if ( stream_methodCallOrSliceList.hasNext() ) {
                            adaptor.addChild(root_1, stream_methodCallOrSliceList.nextTree());

                        }
                        stream_methodCallOrSliceList.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // Haxe.g:371:10: value PLUSPLUS
                    {
                    pushFollow(FOLLOW_value_in_suffixExpr3308);
                    value248=value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_value.add(value248.getTree());

                    PLUSPLUS249=(Token)match(input,PLUSPLUS,FOLLOW_PLUSPLUS_in_suffixExpr3310); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PLUSPLUS.add(PLUSPLUS249);


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
                    // 371:37: -> ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] ( value )? ( PLUSPLUS )? )
                    {
                        // Haxe.g:371:40: ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] ( value )? ( PLUSPLUS )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        new HaxeTree(SUFFIX_EXPR, "SUFFIX_EXPR", true)
                        , root_1);

                        // Haxe.g:371:84: ( value )?
                        if ( stream_value.hasNext() ) {
                            adaptor.addChild(root_1, stream_value.nextTree());

                        }
                        stream_value.reset();

                        // Haxe.g:371:91: ( PLUSPLUS )?
                        if ( stream_PLUSPLUS.hasNext() ) {
                            adaptor.addChild(root_1, 
                            stream_PLUSPLUS.nextNode()
                            );

                        }
                        stream_PLUSPLUS.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 3 :
                    // Haxe.g:372:10: value SUBSUB
                    {
                    pushFollow(FOLLOW_value_in_suffixExpr3349);
                    value250=value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_value.add(value250.getTree());

                    SUBSUB251=(Token)match(input,SUBSUB,FOLLOW_SUBSUB_in_suffixExpr3351); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SUBSUB.add(SUBSUB251);


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
                    // 372:35: -> ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] ( value )? SUBSUB )
                    {
                        // Haxe.g:372:38: ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] ( value )? SUBSUB )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        new HaxeTree(SUFFIX_EXPR, "SUFFIX_EXPR", true)
                        , root_1);

                        // Haxe.g:372:82: ( value )?
                        if ( stream_value.hasNext() ) {
                            adaptor.addChild(root_1, stream_value.nextTree());

                        }
                        stream_value.reset();

                        adaptor.addChild(root_1, 
                        stream_SUBSUB.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
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
        	// do for sure before leaving
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
    // Haxe.g:375:1: methodCallOrSlice : ( LPAREN exprListOpt RPAREN -> ^( SUFFIX_EXPR[\"MethodCall\", false] LPAREN[$LPAREN, true] ( exprListOpt )? RPAREN[$LPAREN, true] ) | LBRACKET expr RBRACKET -> ^( SUFFIX_EXPR[\"Slice\", false] LBRACKET[$LBRACKET, true] ( expr )? RBRACKET[$RBRACKET, true] ) );
    public final HaxeParser.methodCallOrSlice_return methodCallOrSlice() throws RecognitionException {
        HaxeParser.methodCallOrSlice_return retval = new HaxeParser.methodCallOrSlice_return();
        retval.start = input.LT(1);

        int methodCallOrSlice_StartIndex = input.index();

        Object root_0 = null;

        Token LPAREN252=null;
        Token RPAREN254=null;
        Token LBRACKET255=null;
        Token RBRACKET257=null;
        HaxeParser.exprListOpt_return exprListOpt253 =null;

        HaxeParser.expr_return expr256 =null;


        Object LPAREN252_tree=null;
        Object RPAREN254_tree=null;
        Object LBRACKET255_tree=null;
        Object RBRACKET257_tree=null;
        RewriteRuleTokenStream stream_LBRACKET=new RewriteRuleTokenStream(adaptor,"token LBRACKET");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_RBRACKET=new RewriteRuleTokenStream(adaptor,"token RBRACKET");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_exprListOpt=new RewriteRuleSubtreeStream(adaptor,"rule exprListOpt");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 56) ) { return retval; }

            // Haxe.g:376:5: ( LPAREN exprListOpt RPAREN -> ^( SUFFIX_EXPR[\"MethodCall\", false] LPAREN[$LPAREN, true] ( exprListOpt )? RPAREN[$LPAREN, true] ) | LBRACKET expr RBRACKET -> ^( SUFFIX_EXPR[\"Slice\", false] LBRACKET[$LBRACKET, true] ( expr )? RBRACKET[$RBRACKET, true] ) )
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==LPAREN) ) {
                alt63=1;
            }
            else if ( (LA63_0==LBRACKET) ) {
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
                    // Haxe.g:376:10: LPAREN exprListOpt RPAREN
                    {
                    LPAREN252=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_methodCallOrSlice3398); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN252);


                    pushFollow(FOLLOW_exprListOpt_in_methodCallOrSlice3400);
                    exprListOpt253=exprListOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_exprListOpt.add(exprListOpt253.getTree());

                    RPAREN254=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_methodCallOrSlice3402); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN254);


                    // AST REWRITE
                    // elements: exprListOpt, RPAREN, LPAREN
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 376:36: -> ^( SUFFIX_EXPR[\"MethodCall\", false] LPAREN[$LPAREN, true] ( exprListOpt )? RPAREN[$LPAREN, true] )
                    {
                        // Haxe.g:376:39: ^( SUFFIX_EXPR[\"MethodCall\", false] LPAREN[$LPAREN, true] ( exprListOpt )? RPAREN[$LPAREN, true] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        new HaxeTree(SUFFIX_EXPR, "MethodCall", false)
                        , root_1);

                        adaptor.addChild(root_1, 
                        new HaxeTree(LPAREN, LPAREN252, true)
                        );

                        // Haxe.g:376:116: ( exprListOpt )?
                        if ( stream_exprListOpt.hasNext() ) {
                            adaptor.addChild(root_1, stream_exprListOpt.nextTree());

                        }
                        stream_exprListOpt.reset();

                        adaptor.addChild(root_1, 
                        new HaxeTree(RPAREN, LPAREN252, true)
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // Haxe.g:377:10: LBRACKET expr RBRACKET
                    {
                    LBRACKET255=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_methodCallOrSlice3438); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LBRACKET.add(LBRACKET255);


                    pushFollow(FOLLOW_expr_in_methodCallOrSlice3440);
                    expr256=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr256.getTree());

                    RBRACKET257=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_methodCallOrSlice3442); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RBRACKET.add(RBRACKET257);


                    // AST REWRITE
                    // elements: LBRACKET, RBRACKET, expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 377:33: -> ^( SUFFIX_EXPR[\"Slice\", false] LBRACKET[$LBRACKET, true] ( expr )? RBRACKET[$RBRACKET, true] )
                    {
                        // Haxe.g:377:36: ^( SUFFIX_EXPR[\"Slice\", false] LBRACKET[$LBRACKET, true] ( expr )? RBRACKET[$RBRACKET, true] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        new HaxeTree(SUFFIX_EXPR, "Slice", false)
                        , root_1);

                        adaptor.addChild(root_1, 
                        new HaxeTree(LBRACKET, LBRACKET255, true)
                        );

                        // Haxe.g:377:112: ( expr )?
                        if ( stream_expr.hasNext() ) {
                            adaptor.addChild(root_1, stream_expr.nextTree());

                        }
                        stream_expr.reset();

                        adaptor.addChild(root_1, 
                        new HaxeTree(RBRACKET, RBRACKET257, true)
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
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
        	// do for sure before leaving
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
    // Haxe.g:380:1: methodCallOrSliceList : ( methodCallOrSlice methodCallOrSliceList | methodCallOrSlice );
    public final HaxeParser.methodCallOrSliceList_return methodCallOrSliceList() throws RecognitionException {
        HaxeParser.methodCallOrSliceList_return retval = new HaxeParser.methodCallOrSliceList_return();
        retval.start = input.LT(1);

        int methodCallOrSliceList_StartIndex = input.index();

        Object root_0 = null;

        HaxeParser.methodCallOrSlice_return methodCallOrSlice258 =null;

        HaxeParser.methodCallOrSliceList_return methodCallOrSliceList259 =null;

        HaxeParser.methodCallOrSlice_return methodCallOrSlice260 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 57) ) { return retval; }

            // Haxe.g:381:5: ( methodCallOrSlice methodCallOrSliceList | methodCallOrSlice )
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==LPAREN) ) {
                int LA64_1 = input.LA(2);

                if ( (synpred111_Haxe()) ) {
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
            else if ( (LA64_0==LBRACKET) ) {
                int LA64_2 = input.LA(2);

                if ( (synpred111_Haxe()) ) {
                    alt64=1;
                }
                else if ( (true) ) {
                    alt64=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 64, 2, input);

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
                    // Haxe.g:381:10: methodCallOrSlice methodCallOrSliceList
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_methodCallOrSlice_in_methodCallOrSliceList3487);
                    methodCallOrSlice258=methodCallOrSlice();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, methodCallOrSlice258.getTree());

                    pushFollow(FOLLOW_methodCallOrSliceList_in_methodCallOrSliceList3489);
                    methodCallOrSliceList259=methodCallOrSliceList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, methodCallOrSliceList259.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:382:10: methodCallOrSlice
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_methodCallOrSlice_in_methodCallOrSliceList3500);
                    methodCallOrSlice260=methodCallOrSlice();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, methodCallOrSlice260.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
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
    // Haxe.g:385:1: value : ( objLit | elementarySymbol | LPAREN ! ( expr | statement ) RPAREN !| dotIdent typeParamOpt );
    public final HaxeParser.value_return value() throws RecognitionException {
        HaxeParser.value_return retval = new HaxeParser.value_return();
        retval.start = input.LT(1);

        int value_StartIndex = input.index();

        Object root_0 = null;

        Token LPAREN263=null;
        Token RPAREN266=null;
        HaxeParser.objLit_return objLit261 =null;

        HaxeParser.elementarySymbol_return elementarySymbol262 =null;

        HaxeParser.expr_return expr264 =null;

        HaxeParser.statement_return statement265 =null;

        HaxeParser.dotIdent_return dotIdent267 =null;

        HaxeParser.typeParamOpt_return typeParamOpt268 =null;


        Object LPAREN263_tree=null;
        Object RPAREN266_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 58) ) { return retval; }

            // Haxe.g:388:5: ( objLit | elementarySymbol | LPAREN ! ( expr | statement ) RPAREN !| dotIdent typeParamOpt )
            int alt66=4;
            switch ( input.LA(1) ) {
            case LBRACE:
                {
                alt66=1;
                }
                break;
            case CHARLITERAL:
            case FALSE:
            case FLOATNUM:
            case INTLITERAL:
            case LONGLITERAL:
            case NULL:
            case STRINGLITERAL:
            case TRUE:
                {
                alt66=2;
                }
                break;
            case LPAREN:
                {
                alt66=3;
                }
                break;
            case IDENTIFIER:
            case THIS:
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
                    // Haxe.g:388:9: objLit
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_objLit_in_value3529);
                    objLit261=objLit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, objLit261.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:389:9: elementarySymbol
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_elementarySymbol_in_value3539);
                    elementarySymbol262=elementarySymbol();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, elementarySymbol262.getTree());

                    }
                    break;
                case 3 :
                    // Haxe.g:390:9: LPAREN ! ( expr | statement ) RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    LPAREN263=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_value3549); if (state.failed) return retval;

                    // Haxe.g:390:17: ( expr | statement )
                    int alt65=2;
                    switch ( input.LA(1) ) {
                    case BANG:
                    case PLUS:
                    case PLUSPLUS:
                    case SUB:
                    case SUBSUB:
                    case TILDE:
                        {
                        int LA65_1 = input.LA(2);

                        if ( (synpred114_Haxe()) ) {
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
                        break;
                    case NEW:
                        {
                        int LA65_2 = input.LA(2);

                        if ( (synpred114_Haxe()) ) {
                            alt65=1;
                        }
                        else if ( (true) ) {
                            alt65=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 65, 2, input);

                            throw nvae;

                        }
                        }
                        break;
                    case CAST:
                        {
                        int LA65_3 = input.LA(2);

                        if ( (synpred114_Haxe()) ) {
                            alt65=1;
                        }
                        else if ( (true) ) {
                            alt65=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 65, 3, input);

                            throw nvae;

                        }
                        }
                        break;
                    case FUNCTION:
                        {
                        int LA65_4 = input.LA(2);

                        if ( (synpred114_Haxe()) ) {
                            alt65=1;
                        }
                        else if ( (true) ) {
                            alt65=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 65, 4, input);

                            throw nvae;

                        }
                        }
                        break;
                    case LBRACE:
                        {
                        int LA65_5 = input.LA(2);

                        if ( (synpred114_Haxe()) ) {
                            alt65=1;
                        }
                        else if ( (true) ) {
                            alt65=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 65, 5, input);

                            throw nvae;

                        }
                        }
                        break;
                    case LONGLITERAL:
                        {
                        int LA65_6 = input.LA(2);

                        if ( (synpred114_Haxe()) ) {
                            alt65=1;
                        }
                        else if ( (true) ) {
                            alt65=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 65, 6, input);

                            throw nvae;

                        }
                        }
                        break;
                    case NULL:
                        {
                        int LA65_7 = input.LA(2);

                        if ( (synpred114_Haxe()) ) {
                            alt65=1;
                        }
                        else if ( (true) ) {
                            alt65=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 65, 7, input);

                            throw nvae;

                        }
                        }
                        break;
                    case INTLITERAL:
                        {
                        int LA65_8 = input.LA(2);

                        if ( (synpred114_Haxe()) ) {
                            alt65=1;
                        }
                        else if ( (true) ) {
                            alt65=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 65, 8, input);

                            throw nvae;

                        }
                        }
                        break;
                    case STRINGLITERAL:
                        {
                        int LA65_9 = input.LA(2);

                        if ( (synpred114_Haxe()) ) {
                            alt65=1;
                        }
                        else if ( (true) ) {
                            alt65=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 65, 9, input);

                            throw nvae;

                        }
                        }
                        break;
                    case CHARLITERAL:
                        {
                        int LA65_10 = input.LA(2);

                        if ( (synpred114_Haxe()) ) {
                            alt65=1;
                        }
                        else if ( (true) ) {
                            alt65=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 65, 10, input);

                            throw nvae;

                        }
                        }
                        break;
                    case FLOATNUM:
                        {
                        int LA65_11 = input.LA(2);

                        if ( (synpred114_Haxe()) ) {
                            alt65=1;
                        }
                        else if ( (true) ) {
                            alt65=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 65, 11, input);

                            throw nvae;

                        }
                        }
                        break;
                    case TRUE:
                        {
                        int LA65_12 = input.LA(2);

                        if ( (synpred114_Haxe()) ) {
                            alt65=1;
                        }
                        else if ( (true) ) {
                            alt65=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 65, 12, input);

                            throw nvae;

                        }
                        }
                        break;
                    case FALSE:
                        {
                        int LA65_13 = input.LA(2);

                        if ( (synpred114_Haxe()) ) {
                            alt65=1;
                        }
                        else if ( (true) ) {
                            alt65=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 65, 13, input);

                            throw nvae;

                        }
                        }
                        break;
                    case LPAREN:
                        {
                        int LA65_14 = input.LA(2);

                        if ( (synpred114_Haxe()) ) {
                            alt65=1;
                        }
                        else if ( (true) ) {
                            alt65=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 65, 14, input);

                            throw nvae;

                        }
                        }
                        break;
                    case IDENTIFIER:
                        {
                        int LA65_15 = input.LA(2);

                        if ( (synpred114_Haxe()) ) {
                            alt65=1;
                        }
                        else if ( (true) ) {
                            alt65=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 65, 15, input);

                            throw nvae;

                        }
                        }
                        break;
                    case THIS:
                        {
                        int LA65_16 = input.LA(2);

                        if ( (synpred114_Haxe()) ) {
                            alt65=1;
                        }
                        else if ( (true) ) {
                            alt65=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 65, 16, input);

                            throw nvae;

                        }
                        }
                        break;
                    case UNTYPED:
                        {
                        int LA65_17 = input.LA(2);

                        if ( (synpred114_Haxe()) ) {
                            alt65=1;
                        }
                        else if ( (true) ) {
                            alt65=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 65, 17, input);

                            throw nvae;

                        }
                        }
                        break;
                    case BREAK:
                    case CONTINUE:
                    case DO:
                    case DYNAMIC:
                    case FOR:
                    case IF:
                    case INLINE:
                    case OVERRIDE:
                    case PRIVATE:
                    case PUBLIC:
                    case RETURN:
                    case SEMI:
                    case STATIC:
                    case SWITCH:
                    case THROW:
                    case TRY:
                    case VAR:
                    case WHILE:
                        {
                        alt65=2;
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
                            // Haxe.g:390:18: expr
                            {
                            pushFollow(FOLLOW_expr_in_value3553);
                            expr264=expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr264.getTree());

                            }
                            break;
                        case 2 :
                            // Haxe.g:390:23: statement
                            {
                            pushFollow(FOLLOW_statement_in_value3555);
                            statement265=statement();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, statement265.getTree());

                            }
                            break;

                    }


                    RPAREN266=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_value3558); if (state.failed) return retval;

                    }
                    break;
                case 4 :
                    // Haxe.g:391:9: dotIdent typeParamOpt
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_dotIdent_in_value3569);
                    dotIdent267=dotIdent();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dotIdent267.getTree());

                    pushFollow(FOLLOW_typeParamOpt_in_value3571);
                    typeParamOpt268=typeParamOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeParamOpt268.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
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
    // Haxe.g:394:1: newExpr : NEW type LPAREN exprListOpt RPAREN -> ^( NEW ( type )? ( exprListOpt )? ) ;
    public final HaxeParser.newExpr_return newExpr() throws RecognitionException {
        HaxeParser.newExpr_return retval = new HaxeParser.newExpr_return();
        retval.start = input.LT(1);

        int newExpr_StartIndex = input.index();

        Object root_0 = null;

        Token NEW269=null;
        Token LPAREN271=null;
        Token RPAREN273=null;
        HaxeParser.type_return type270 =null;

        HaxeParser.exprListOpt_return exprListOpt272 =null;


        Object NEW269_tree=null;
        Object LPAREN271_tree=null;
        Object RPAREN273_tree=null;
        RewriteRuleTokenStream stream_NEW=new RewriteRuleTokenStream(adaptor,"token NEW");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_exprListOpt=new RewriteRuleSubtreeStream(adaptor,"rule exprListOpt");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 59) ) { return retval; }

            // Haxe.g:395:5: ( NEW type LPAREN exprListOpt RPAREN -> ^( NEW ( type )? ( exprListOpt )? ) )
            // Haxe.g:395:9: NEW type LPAREN exprListOpt RPAREN
            {
            NEW269=(Token)match(input,NEW,FOLLOW_NEW_in_newExpr3601); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_NEW.add(NEW269);


            pushFollow(FOLLOW_type_in_newExpr3603);
            type270=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(type270.getTree());

            LPAREN271=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_newExpr3605); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN271);


            pushFollow(FOLLOW_exprListOpt_in_newExpr3607);
            exprListOpt272=exprListOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_exprListOpt.add(exprListOpt272.getTree());

            RPAREN273=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_newExpr3609); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN273);


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
            // 395:44: -> ^( NEW ( type )? ( exprListOpt )? )
            {
                // Haxe.g:395:47: ^( NEW ( type )? ( exprListOpt )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_NEW.nextNode()
                , root_1);

                // Haxe.g:395:53: ( type )?
                if ( stream_type.hasNext() ) {
                    adaptor.addChild(root_1, stream_type.nextTree());

                }
                stream_type.reset();

                // Haxe.g:395:59: ( exprListOpt )?
                if ( stream_exprListOpt.hasNext() ) {
                    adaptor.addChild(root_1, stream_exprListOpt.nextTree());

                }
                stream_exprListOpt.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
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
        	// do for sure before leaving
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
    // Haxe.g:398:1: cast : ( CAST LPAREN expr ( COMMA funcType )? RPAREN -> ^( CAST ( expr )? ( funcType )? ) | CAST LPAREN expr RPAREN -> ^( CAST ( expr )? ) );
    public final HaxeParser.cast_return cast() throws RecognitionException {
        HaxeParser.cast_return retval = new HaxeParser.cast_return();
        retval.start = input.LT(1);

        int cast_StartIndex = input.index();

        Object root_0 = null;

        Token CAST274=null;
        Token LPAREN275=null;
        Token COMMA277=null;
        Token RPAREN279=null;
        Token CAST280=null;
        Token LPAREN281=null;
        Token RPAREN283=null;
        HaxeParser.expr_return expr276 =null;

        HaxeParser.funcType_return funcType278 =null;

        HaxeParser.expr_return expr282 =null;


        Object CAST274_tree=null;
        Object LPAREN275_tree=null;
        Object COMMA277_tree=null;
        Object RPAREN279_tree=null;
        Object CAST280_tree=null;
        Object LPAREN281_tree=null;
        Object RPAREN283_tree=null;
        RewriteRuleTokenStream stream_CAST=new RewriteRuleTokenStream(adaptor,"token CAST");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_funcType=new RewriteRuleSubtreeStream(adaptor,"rule funcType");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 60) ) { return retval; }

            // Haxe.g:398:9: ( CAST LPAREN expr ( COMMA funcType )? RPAREN -> ^( CAST ( expr )? ( funcType )? ) | CAST LPAREN expr RPAREN -> ^( CAST ( expr )? ) )
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==CAST) ) {
                int LA68_1 = input.LA(2);

                if ( (synpred117_Haxe()) ) {
                    alt68=1;
                }
                else if ( (true) ) {
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
                    // Haxe.g:398:13: CAST LPAREN expr ( COMMA funcType )? RPAREN
                    {
                    CAST274=(Token)match(input,CAST,FOLLOW_CAST_in_cast3639); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CAST.add(CAST274);


                    LPAREN275=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_cast3641); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN275);


                    pushFollow(FOLLOW_expr_in_cast3643);
                    expr276=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr276.getTree());

                    // Haxe.g:398:30: ( COMMA funcType )?
                    int alt67=2;
                    int LA67_0 = input.LA(1);

                    if ( (LA67_0==COMMA) ) {
                        alt67=1;
                    }
                    switch (alt67) {
                        case 1 :
                            // Haxe.g:398:31: COMMA funcType
                            {
                            COMMA277=(Token)match(input,COMMA,FOLLOW_COMMA_in_cast3646); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_COMMA.add(COMMA277);


                            pushFollow(FOLLOW_funcType_in_cast3648);
                            funcType278=funcType();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_funcType.add(funcType278.getTree());

                            }
                            break;

                    }


                    RPAREN279=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_cast3652); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN279);


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
                    // 398:57: -> ^( CAST ( expr )? ( funcType )? )
                    {
                        // Haxe.g:398:60: ^( CAST ( expr )? ( funcType )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_CAST.nextNode()
                        , root_1);

                        // Haxe.g:398:67: ( expr )?
                        if ( stream_expr.hasNext() ) {
                            adaptor.addChild(root_1, stream_expr.nextTree());

                        }
                        stream_expr.reset();

                        // Haxe.g:398:73: ( funcType )?
                        if ( stream_funcType.hasNext() ) {
                            adaptor.addChild(root_1, stream_funcType.nextTree());

                        }
                        stream_funcType.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // Haxe.g:399:13: CAST LPAREN expr RPAREN
                    {
                    CAST280=(Token)match(input,CAST,FOLLOW_CAST_in_cast3680); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CAST.add(CAST280);


                    LPAREN281=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_cast3682); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN281);


                    pushFollow(FOLLOW_expr_in_cast3684);
                    expr282=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr282.getTree());

                    RPAREN283=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_cast3686); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN283);


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
                    // 399:57: -> ^( CAST ( expr )? )
                    {
                        // Haxe.g:399:60: ^( CAST ( expr )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_CAST.nextNode()
                        , root_1);

                        // Haxe.g:399:67: ( expr )?
                        if ( stream_expr.hasNext() ) {
                            adaptor.addChild(root_1, stream_expr.nextTree());

                        }
                        stream_expr.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
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
        	// do for sure before leaving
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
    // Haxe.g:405:1: topLevelDecl : ( classDecl | interfaceDecl | enumDecl | typedefDecl );
    public final HaxeParser.topLevelDecl_return topLevelDecl() throws RecognitionException {
        HaxeParser.topLevelDecl_return retval = new HaxeParser.topLevelDecl_return();
        retval.start = input.LT(1);

        int topLevelDecl_StartIndex = input.index();

        Object root_0 = null;

        HaxeParser.classDecl_return classDecl284 =null;

        HaxeParser.interfaceDecl_return interfaceDecl285 =null;

        HaxeParser.enumDecl_return enumDecl286 =null;

        HaxeParser.typedefDecl_return typedefDecl287 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 61) ) { return retval; }

            // Haxe.g:406:5: ( classDecl | interfaceDecl | enumDecl | typedefDecl )
            int alt69=4;
            switch ( input.LA(1) ) {
            case MONKEYS_AT:
                {
                int LA69_1 = input.LA(2);

                if ( (synpred118_Haxe()) ) {
                    alt69=1;
                }
                else if ( (synpred119_Haxe()) ) {
                    alt69=2;
                }
                else if ( (synpred120_Haxe()) ) {
                    alt69=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 69, 1, input);

                    throw nvae;

                }
                }
                break;
            case EXTERN:
            case PRIVATE:
                {
                int LA69_2 = input.LA(2);

                if ( (synpred118_Haxe()) ) {
                    alt69=1;
                }
                else if ( (synpred119_Haxe()) ) {
                    alt69=2;
                }
                else if ( (synpred120_Haxe()) ) {
                    alt69=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 69, 2, input);

                    throw nvae;

                }
                }
                break;
            case CLASS:
                {
                alt69=1;
                }
                break;
            case INTERFACE:
                {
                alt69=2;
                }
                break;
            case ENUM:
                {
                alt69=3;
                }
                break;
            case TYPEDEF:
                {
                alt69=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;

            }

            switch (alt69) {
                case 1 :
                    // Haxe.g:406:9: classDecl
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_classDecl_in_topLevelDecl3751);
                    classDecl284=classDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, classDecl284.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:407:9: interfaceDecl
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_interfaceDecl_in_topLevelDecl3761);
                    interfaceDecl285=interfaceDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceDecl285.getTree());

                    }
                    break;
                case 3 :
                    // Haxe.g:408:9: enumDecl
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_enumDecl_in_topLevelDecl3771);
                    enumDecl286=enumDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, enumDecl286.getTree());

                    }
                    break;
                case 4 :
                    // Haxe.g:409:9: typedefDecl
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_typedefDecl_in_topLevelDecl3781);
                    typedefDecl287=typedefDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typedefDecl287.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
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
    // Haxe.g:412:1: enumDecl : typeDeclFlags ENUM IDENTIFIER typeParamOpt enumBody -> ^( IDENTIFIER ( typeParamOpt )? ( enumBody )? ) ;
    public final HaxeParser.enumDecl_return enumDecl() throws RecognitionException {
        HaxeParser.enumDecl_return retval = new HaxeParser.enumDecl_return();
        retval.start = input.LT(1);

        int enumDecl_StartIndex = input.index();

        Object root_0 = null;

        Token ENUM289=null;
        Token IDENTIFIER290=null;
        HaxeParser.typeDeclFlags_return typeDeclFlags288 =null;

        HaxeParser.typeParamOpt_return typeParamOpt291 =null;

        HaxeParser.enumBody_return enumBody292 =null;


        Object ENUM289_tree=null;
        Object IDENTIFIER290_tree=null;
        RewriteRuleTokenStream stream_ENUM=new RewriteRuleTokenStream(adaptor,"token ENUM");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleSubtreeStream stream_typeDeclFlags=new RewriteRuleSubtreeStream(adaptor,"rule typeDeclFlags");
        RewriteRuleSubtreeStream stream_enumBody=new RewriteRuleSubtreeStream(adaptor,"rule enumBody");
        RewriteRuleSubtreeStream stream_typeParamOpt=new RewriteRuleSubtreeStream(adaptor,"rule typeParamOpt");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 62) ) { return retval; }

            // Haxe.g:412:9: ( typeDeclFlags ENUM IDENTIFIER typeParamOpt enumBody -> ^( IDENTIFIER ( typeParamOpt )? ( enumBody )? ) )
            // Haxe.g:412:13: typeDeclFlags ENUM IDENTIFIER typeParamOpt enumBody
            {
            pushFollow(FOLLOW_typeDeclFlags_in_enumDecl3799);
            typeDeclFlags288=typeDeclFlags();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeDeclFlags.add(typeDeclFlags288.getTree());

            ENUM289=(Token)match(input,ENUM,FOLLOW_ENUM_in_enumDecl3801); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ENUM.add(ENUM289);


            IDENTIFIER290=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_enumDecl3803); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER290);


            pushFollow(FOLLOW_typeParamOpt_in_enumDecl3805);
            typeParamOpt291=typeParamOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeParamOpt.add(typeParamOpt291.getTree());

            pushFollow(FOLLOW_enumBody_in_enumDecl3807);
            enumBody292=enumBody();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_enumBody.add(enumBody292.getTree());

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
            // 412:65: -> ^( IDENTIFIER ( typeParamOpt )? ( enumBody )? )
            {
                // Haxe.g:412:68: ^( IDENTIFIER ( typeParamOpt )? ( enumBody )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                new EnumNode(stream_IDENTIFIER.nextToken())
                , root_1);

                // Haxe.g:412:91: ( typeParamOpt )?
                if ( stream_typeParamOpt.hasNext() ) {
                    adaptor.addChild(root_1, stream_typeParamOpt.nextTree());

                }
                stream_typeParamOpt.reset();

                // Haxe.g:412:105: ( enumBody )?
                if ( stream_enumBody.hasNext() ) {
                    adaptor.addChild(root_1, stream_enumBody.nextTree());

                }
                stream_enumBody.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
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
        	// do for sure before leaving
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
    // Haxe.g:415:1: enumBody : LBRACE ( enumValueDecl )* RBRACE -> ^( BLOCK_SCOPE[\"BLOCK_SCOPE\", true, $LBRACE] ( enumValueDecl )* RBRACE[$RBRACE, true] ) ;
    public final HaxeParser.enumBody_return enumBody() throws RecognitionException {
        HaxeParser.enumBody_return retval = new HaxeParser.enumBody_return();
        retval.start = input.LT(1);

        int enumBody_StartIndex = input.index();

        Object root_0 = null;

        Token LBRACE293=null;
        Token RBRACE295=null;
        HaxeParser.enumValueDecl_return enumValueDecl294 =null;


        Object LBRACE293_tree=null;
        Object RBRACE295_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_enumValueDecl=new RewriteRuleSubtreeStream(adaptor,"rule enumValueDecl");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 63) ) { return retval; }

            // Haxe.g:415:9: ( LBRACE ( enumValueDecl )* RBRACE -> ^( BLOCK_SCOPE[\"BLOCK_SCOPE\", true, $LBRACE] ( enumValueDecl )* RBRACE[$RBRACE, true] ) )
            // Haxe.g:415:13: LBRACE ( enumValueDecl )* RBRACE
            {
            LBRACE293=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_enumBody3840); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACE.add(LBRACE293);


            // Haxe.g:415:20: ( enumValueDecl )*
            loop70:
            do {
                int alt70=2;
                int LA70_0 = input.LA(1);

                if ( (LA70_0==IDENTIFIER) ) {
                    alt70=1;
                }


                switch (alt70) {
            	case 1 :
            	    // Haxe.g:415:21: enumValueDecl
            	    {
            	    pushFollow(FOLLOW_enumValueDecl_in_enumBody3843);
            	    enumValueDecl294=enumValueDecl();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_enumValueDecl.add(enumValueDecl294.getTree());

            	    }
            	    break;

            	default :
            	    break loop70;
                }
            } while (true);


            RBRACE295=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_enumBody3847); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACE.add(RBRACE295);


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
            // 416:13: -> ^( BLOCK_SCOPE[\"BLOCK_SCOPE\", true, $LBRACE] ( enumValueDecl )* RBRACE[$RBRACE, true] )
            {
                // Haxe.g:416:16: ^( BLOCK_SCOPE[\"BLOCK_SCOPE\", true, $LBRACE] ( enumValueDecl )* RBRACE[$RBRACE, true] )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                new BlockScopeNode(BLOCK_SCOPE, "BLOCK_SCOPE", true, LBRACE293)
                , root_1);

                // Haxe.g:416:76: ( enumValueDecl )*
                while ( stream_enumValueDecl.hasNext() ) {
                    adaptor.addChild(root_1, stream_enumValueDecl.nextTree());

                }
                stream_enumValueDecl.reset();

                adaptor.addChild(root_1, 
                new HaxeTree(RBRACE, RBRACE295, true)
                );

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
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
        	// do for sure before leaving
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
    // Haxe.g:419:1: enumValueDecl : ( IDENTIFIER LPAREN paramList RPAREN SEMI -> ^( IDENTIFIER[$IDENTIFIER] ( IDENTIFIER )? ( paramList )? ) | IDENTIFIER SEMI -> ^( IDENTIFIER[$IDENTIFIER] ( IDENTIFIER )? ) );
    public final HaxeParser.enumValueDecl_return enumValueDecl() throws RecognitionException {
        HaxeParser.enumValueDecl_return retval = new HaxeParser.enumValueDecl_return();
        retval.start = input.LT(1);

        int enumValueDecl_StartIndex = input.index();

        Object root_0 = null;

        Token IDENTIFIER296=null;
        Token LPAREN297=null;
        Token RPAREN299=null;
        Token SEMI300=null;
        Token IDENTIFIER301=null;
        Token SEMI302=null;
        HaxeParser.paramList_return paramList298 =null;


        Object IDENTIFIER296_tree=null;
        Object LPAREN297_tree=null;
        Object RPAREN299_tree=null;
        Object SEMI300_tree=null;
        Object IDENTIFIER301_tree=null;
        Object SEMI302_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_paramList=new RewriteRuleSubtreeStream(adaptor,"rule paramList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 64) ) { return retval; }

            // Haxe.g:420:5: ( IDENTIFIER LPAREN paramList RPAREN SEMI -> ^( IDENTIFIER[$IDENTIFIER] ( IDENTIFIER )? ( paramList )? ) | IDENTIFIER SEMI -> ^( IDENTIFIER[$IDENTIFIER] ( IDENTIFIER )? ) )
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==IDENTIFIER) ) {
                int LA71_1 = input.LA(2);

                if ( (LA71_1==LPAREN) ) {
                    alt71=1;
                }
                else if ( (LA71_1==SEMI) ) {
                    alt71=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 71, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;

            }
            switch (alt71) {
                case 1 :
                    // Haxe.g:420:9: IDENTIFIER LPAREN paramList RPAREN SEMI
                    {
                    IDENTIFIER296=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_enumValueDecl3906); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER296);


                    LPAREN297=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_enumValueDecl3908); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN297);


                    pushFollow(FOLLOW_paramList_in_enumValueDecl3910);
                    paramList298=paramList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_paramList.add(paramList298.getTree());

                    RPAREN299=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_enumValueDecl3912); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN299);


                    SEMI300=(Token)match(input,SEMI,FOLLOW_SEMI_in_enumValueDecl3914); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI300);


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
                    // 420:49: -> ^( IDENTIFIER[$IDENTIFIER] ( IDENTIFIER )? ( paramList )? )
                    {
                        // Haxe.g:420:52: ^( IDENTIFIER[$IDENTIFIER] ( IDENTIFIER )? ( paramList )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        new VarDeclarationNode(IDENTIFIER, IDENTIFIER296)
                        , root_1);

                        // Haxe.g:420:98: ( IDENTIFIER )?
                        if ( stream_IDENTIFIER.hasNext() ) {
                            adaptor.addChild(root_1, 
                            new VarUsageNode(stream_IDENTIFIER.nextToken())
                            );

                        }
                        stream_IDENTIFIER.reset();

                        // Haxe.g:420:124: ( paramList )?
                        if ( stream_paramList.hasNext() ) {
                            adaptor.addChild(root_1, stream_paramList.nextTree());

                        }
                        stream_paramList.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // Haxe.g:421:9: IDENTIFIER SEMI
                    {
                    IDENTIFIER301=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_enumValueDecl3948); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER301);


                    SEMI302=(Token)match(input,SEMI,FOLLOW_SEMI_in_enumValueDecl3950); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI302);


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
                    // 421:49: -> ^( IDENTIFIER[$IDENTIFIER] ( IDENTIFIER )? )
                    {
                        // Haxe.g:421:52: ^( IDENTIFIER[$IDENTIFIER] ( IDENTIFIER )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        new VarDeclarationNode(IDENTIFIER, IDENTIFIER301)
                        , root_1);

                        // Haxe.g:421:98: ( IDENTIFIER )?
                        if ( stream_IDENTIFIER.hasNext() ) {
                            adaptor.addChild(root_1, 
                            new VarUsageNode(stream_IDENTIFIER.nextToken())
                            );

                        }
                        stream_IDENTIFIER.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
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
        	// do for sure before leaving
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
    // Haxe.g:425:1: varDeclList : varDecl varDeclList ;
    public final HaxeParser.varDeclList_return varDeclList() throws RecognitionException {
        HaxeParser.varDeclList_return retval = new HaxeParser.varDeclList_return();
        retval.start = input.LT(1);

        int varDeclList_StartIndex = input.index();

        Object root_0 = null;

        HaxeParser.varDecl_return varDecl303 =null;

        HaxeParser.varDeclList_return varDeclList304 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 65) ) { return retval; }

            // Haxe.g:426:5: ( varDecl varDeclList )
            // Haxe.g:426:9: varDecl varDeclList
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_varDecl_in_varDeclList4010);
            varDecl303=varDecl();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, varDecl303.getTree());

            pushFollow(FOLLOW_varDeclList_in_varDeclList4012);
            varDeclList304=varDeclList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclList304.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
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
    // Haxe.g:429:1: varDecl : ( declAttrList )? VAR varDeclPartList SEMI -> ^( VAR[$VAR] ( declAttrList )? ( varDeclPartList )? ) ;
    public final HaxeParser.varDecl_return varDecl() throws RecognitionException {
        HaxeParser.varDecl_return retval = new HaxeParser.varDecl_return();
        retval.start = input.LT(1);

        int varDecl_StartIndex = input.index();

        Object root_0 = null;

        Token VAR306=null;
        Token SEMI308=null;
        HaxeParser.declAttrList_return declAttrList305 =null;

        HaxeParser.varDeclPartList_return varDeclPartList307 =null;


        Object VAR306_tree=null;
        Object SEMI308_tree=null;
        RewriteRuleTokenStream stream_VAR=new RewriteRuleTokenStream(adaptor,"token VAR");
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleSubtreeStream stream_declAttrList=new RewriteRuleSubtreeStream(adaptor,"rule declAttrList");
        RewriteRuleSubtreeStream stream_varDeclPartList=new RewriteRuleSubtreeStream(adaptor,"rule varDeclPartList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 66) ) { return retval; }

            // Haxe.g:429:9: ( ( declAttrList )? VAR varDeclPartList SEMI -> ^( VAR[$VAR] ( declAttrList )? ( varDeclPartList )? ) )
            // Haxe.g:429:13: ( declAttrList )? VAR varDeclPartList SEMI
            {
            // Haxe.g:429:13: ( declAttrList )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==DYNAMIC||LA72_0==INLINE||LA72_0==OVERRIDE||LA72_0==PRIVATE||LA72_0==PUBLIC||LA72_0==STATIC) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // Haxe.g:429:14: declAttrList
                    {
                    pushFollow(FOLLOW_declAttrList_in_varDecl4028);
                    declAttrList305=declAttrList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declAttrList.add(declAttrList305.getTree());

                    }
                    break;

            }


            VAR306=(Token)match(input,VAR,FOLLOW_VAR_in_varDecl4032); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_VAR.add(VAR306);


            pushFollow(FOLLOW_varDeclPartList_in_varDecl4034);
            varDeclPartList307=varDeclPartList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_varDeclPartList.add(varDeclPartList307.getTree());

            SEMI308=(Token)match(input,SEMI,FOLLOW_SEMI_in_varDecl4036); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SEMI.add(SEMI308);


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
            // 429:54: -> ^( VAR[$VAR] ( declAttrList )? ( varDeclPartList )? )
            {
                // Haxe.g:429:57: ^( VAR[$VAR] ( declAttrList )? ( varDeclPartList )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                new VarDeclarationNode(VAR, VAR306)
                , root_1);

                // Haxe.g:429:89: ( declAttrList )?
                if ( stream_declAttrList.hasNext() ) {
                    adaptor.addChild(root_1, stream_declAttrList.nextTree());

                }
                stream_declAttrList.reset();

                // Haxe.g:429:103: ( varDeclPartList )?
                if ( stream_varDeclPartList.hasNext() ) {
                    adaptor.addChild(root_1, stream_varDeclPartList.nextTree());

                }
                stream_varDeclPartList.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
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
        	// do for sure before leaving
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
    // Haxe.g:432:1: varDeclPartList : varDeclPart ( COMMA ! varDeclPart )* ;
    public final HaxeParser.varDeclPartList_return varDeclPartList() throws RecognitionException {
        HaxeParser.varDeclPartList_return retval = new HaxeParser.varDeclPartList_return();
        retval.start = input.LT(1);

        int varDeclPartList_StartIndex = input.index();

        Object root_0 = null;

        Token COMMA310=null;
        HaxeParser.varDeclPart_return varDeclPart309 =null;

        HaxeParser.varDeclPart_return varDeclPart311 =null;


        Object COMMA310_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 67) ) { return retval; }

            // Haxe.g:433:5: ( varDeclPart ( COMMA ! varDeclPart )* )
            // Haxe.g:433:9: varDeclPart ( COMMA ! varDeclPart )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_varDeclPart_in_varDeclPartList4082);
            varDeclPart309=varDeclPart();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclPart309.getTree());

            // Haxe.g:433:21: ( COMMA ! varDeclPart )*
            loop73:
            do {
                int alt73=2;
                int LA73_0 = input.LA(1);

                if ( (LA73_0==COMMA) ) {
                    alt73=1;
                }


                switch (alt73) {
            	case 1 :
            	    // Haxe.g:433:22: COMMA ! varDeclPart
            	    {
            	    COMMA310=(Token)match(input,COMMA,FOLLOW_COMMA_in_varDeclPartList4085); if (state.failed) return retval;

            	    pushFollow(FOLLOW_varDeclPart_in_varDeclPartList4088);
            	    varDeclPart311=varDeclPart();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclPart311.getTree());

            	    }
            	    break;

            	default :
            	    break loop73;
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
        	// do for sure before leaving
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
    // Haxe.g:436:1: varDeclPart : IDENTIFIER propDeclOpt typeTagOpt varInit ;
    public final HaxeParser.varDeclPart_return varDeclPart() throws RecognitionException {
        HaxeParser.varDeclPart_return retval = new HaxeParser.varDeclPart_return();
        retval.start = input.LT(1);

        int varDeclPart_StartIndex = input.index();

        Object root_0 = null;

        Token IDENTIFIER312=null;
        HaxeParser.propDeclOpt_return propDeclOpt313 =null;

        HaxeParser.typeTagOpt_return typeTagOpt314 =null;

        HaxeParser.varInit_return varInit315 =null;


        Object IDENTIFIER312_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 68) ) { return retval; }

            // Haxe.g:437:5: ( IDENTIFIER propDeclOpt typeTagOpt varInit )
            // Haxe.g:437:9: IDENTIFIER propDeclOpt typeTagOpt varInit
            {
            root_0 = (Object)adaptor.nil();


            IDENTIFIER312=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_varDeclPart4109); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER312_tree = 
            new VarUsageNode(IDENTIFIER312) 
            ;
            adaptor.addChild(root_0, IDENTIFIER312_tree);
            }

            pushFollow(FOLLOW_propDeclOpt_in_varDeclPart4114);
            propDeclOpt313=propDeclOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, propDeclOpt313.getTree());

            pushFollow(FOLLOW_typeTagOpt_in_varDeclPart4116);
            typeTagOpt314=typeTagOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, typeTagOpt314.getTree());

            pushFollow(FOLLOW_varInit_in_varDeclPart4118);
            varInit315=varInit();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, varInit315.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
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
    // Haxe.g:440:1: propDecl : LPAREN a1= propAccessor COMMA a2= propAccessor RPAREN -> ^( PROPERTY_DECL[\"PROPERTY_DECL\",true] ( $a1)? ( $a2)? ) ;
    public final HaxeParser.propDecl_return propDecl() throws RecognitionException {
        HaxeParser.propDecl_return retval = new HaxeParser.propDecl_return();
        retval.start = input.LT(1);

        int propDecl_StartIndex = input.index();

        Object root_0 = null;

        Token LPAREN316=null;
        Token COMMA317=null;
        Token RPAREN318=null;
        HaxeParser.propAccessor_return a1 =null;

        HaxeParser.propAccessor_return a2 =null;


        Object LPAREN316_tree=null;
        Object COMMA317_tree=null;
        Object RPAREN318_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_propAccessor=new RewriteRuleSubtreeStream(adaptor,"rule propAccessor");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 69) ) { return retval; }

            // Haxe.g:440:9: ( LPAREN a1= propAccessor COMMA a2= propAccessor RPAREN -> ^( PROPERTY_DECL[\"PROPERTY_DECL\",true] ( $a1)? ( $a2)? ) )
            // Haxe.g:440:13: LPAREN a1= propAccessor COMMA a2= propAccessor RPAREN
            {
            LPAREN316=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_propDecl4132); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN316);


            pushFollow(FOLLOW_propAccessor_in_propDecl4136);
            a1=propAccessor();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_propAccessor.add(a1.getTree());

            COMMA317=(Token)match(input,COMMA,FOLLOW_COMMA_in_propDecl4138); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COMMA.add(COMMA317);


            pushFollow(FOLLOW_propAccessor_in_propDecl4142);
            a2=propAccessor();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_propAccessor.add(a2.getTree());

            RPAREN318=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_propDecl4144); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN318);


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
            // 440:65: -> ^( PROPERTY_DECL[\"PROPERTY_DECL\",true] ( $a1)? ( $a2)? )
            {
                // Haxe.g:440:68: ^( PROPERTY_DECL[\"PROPERTY_DECL\",true] ( $a1)? ( $a2)? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                new HaxeTree(PROPERTY_DECL, "PROPERTY_DECL", true)
                , root_1);

                // Haxe.g:440:117: ( $a1)?
                if ( stream_a1.hasNext() ) {
                    adaptor.addChild(root_1, stream_a1.nextTree());

                }
                stream_a1.reset();

                // Haxe.g:440:122: ( $a2)?
                if ( stream_a2.hasNext() ) {
                    adaptor.addChild(root_1, stream_a2.nextTree());

                }
                stream_a2.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
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
        	// do for sure before leaving
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
    // Haxe.g:443:1: propAccessor : ( IDENTIFIER | NULL | DEFAULT | DYNAMIC );
    public final HaxeParser.propAccessor_return propAccessor() throws RecognitionException {
        HaxeParser.propAccessor_return retval = new HaxeParser.propAccessor_return();
        retval.start = input.LT(1);

        int propAccessor_StartIndex = input.index();

        Object root_0 = null;

        Token set319=null;

        Object set319_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 70) ) { return retval; }

            // Haxe.g:444:9: ( IDENTIFIER | NULL | DEFAULT | DYNAMIC )
            // Haxe.g:
            {
            root_0 = (Object)adaptor.nil();


            set319=(Token)input.LT(1);

            if ( input.LA(1)==DEFAULT||input.LA(1)==DYNAMIC||input.LA(1)==IDENTIFIER||input.LA(1)==NULL ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (Object)adaptor.create(set319)
                );
                state.errorRecovery=false;
                state.failed=false;
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
        	// do for sure before leaving
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
    // Haxe.g:450:1: propDeclOpt : ( propDecl |);
    public final HaxeParser.propDeclOpt_return propDeclOpt() throws RecognitionException {
        HaxeParser.propDeclOpt_return retval = new HaxeParser.propDeclOpt_return();
        retval.start = input.LT(1);

        int propDeclOpt_StartIndex = input.index();

        Object root_0 = null;

        HaxeParser.propDecl_return propDecl320 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 71) ) { return retval; }

            // Haxe.g:451:5: ( propDecl |)
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==LPAREN) ) {
                alt74=1;
            }
            else if ( (LA74_0==EOF||(LA74_0 >= COLON && LA74_0 <= COMMA)||LA74_0==EQ||LA74_0==LBRACE||(LA74_0 >= RPAREN && LA74_0 <= SEMI)) ) {
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
                    // Haxe.g:451:9: propDecl
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_propDecl_in_propDeclOpt4264);
                    propDecl320=propDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, propDecl320.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:453:5: 
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
        	// do for sure before leaving
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
    // Haxe.g:455:1: varInit : ( EQ expr -> ^( VAR_INIT[\"VAR_INIT\",true] ( expr )? ) |);
    public final HaxeParser.varInit_return varInit() throws RecognitionException {
        HaxeParser.varInit_return retval = new HaxeParser.varInit_return();
        retval.start = input.LT(1);

        int varInit_StartIndex = input.index();

        Object root_0 = null;

        Token EQ321=null;
        HaxeParser.expr_return expr322 =null;


        Object EQ321_tree=null;
        RewriteRuleTokenStream stream_EQ=new RewriteRuleTokenStream(adaptor,"token EQ");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 72) ) { return retval; }

            // Haxe.g:455:9: ( EQ expr -> ^( VAR_INIT[\"VAR_INIT\",true] ( expr )? ) |)
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==EQ) ) {
                alt75=1;
            }
            else if ( (LA75_0==EOF||LA75_0==COMMA||(LA75_0 >= RPAREN && LA75_0 <= SEMI)) ) {
                alt75=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;

            }
            switch (alt75) {
                case 1 :
                    // Haxe.g:455:13: EQ expr
                    {
                    EQ321=(Token)match(input,EQ,FOLLOW_EQ_in_varInit4289); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EQ.add(EQ321);


                    pushFollow(FOLLOW_expr_in_varInit4291);
                    expr322=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr322.getTree());

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
                    // 455:21: -> ^( VAR_INIT[\"VAR_INIT\",true] ( expr )? )
                    {
                        // Haxe.g:455:24: ^( VAR_INIT[\"VAR_INIT\",true] ( expr )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        new HaxeTree(VAR_INIT, "VAR_INIT", true)
                        , root_1);

                        // Haxe.g:455:62: ( expr )?
                        if ( stream_expr.hasNext() ) {
                            adaptor.addChild(root_1, stream_expr.nextTree());

                        }
                        stream_expr.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // Haxe.g:457:9: 
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
        	// do for sure before leaving
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
    // Haxe.g:459:1: funcDecl : ( ( declAttrList )? FUNCTION NEW LPAREN paramList RPAREN typeTagOpt block -> ^( FUNCTION NEW ( declAttrList )? ( paramList )? ( typeTagOpt )? ( block )? ) | ( declAttrList )? FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt block -> ^( FUNCTION IDENTIFIER ( declAttrList )? ( paramList )? ( typeTagOpt )? ( block )? ( typeParamOpt )? ) );
    public final HaxeParser.funcDecl_return funcDecl() throws RecognitionException {
        HaxeParser.funcDecl_return retval = new HaxeParser.funcDecl_return();
        retval.start = input.LT(1);

        int funcDecl_StartIndex = input.index();

        Object root_0 = null;

        Token FUNCTION324=null;
        Token NEW325=null;
        Token LPAREN326=null;
        Token RPAREN328=null;
        Token FUNCTION332=null;
        Token IDENTIFIER333=null;
        Token LPAREN335=null;
        Token RPAREN337=null;
        HaxeParser.declAttrList_return declAttrList323 =null;

        HaxeParser.paramList_return paramList327 =null;

        HaxeParser.typeTagOpt_return typeTagOpt329 =null;

        HaxeParser.block_return block330 =null;

        HaxeParser.declAttrList_return declAttrList331 =null;

        HaxeParser.typeParamOpt_return typeParamOpt334 =null;

        HaxeParser.paramList_return paramList336 =null;

        HaxeParser.typeTagOpt_return typeTagOpt338 =null;

        HaxeParser.block_return block339 =null;


        Object FUNCTION324_tree=null;
        Object NEW325_tree=null;
        Object LPAREN326_tree=null;
        Object RPAREN328_tree=null;
        Object FUNCTION332_tree=null;
        Object IDENTIFIER333_tree=null;
        Object LPAREN335_tree=null;
        Object RPAREN337_tree=null;
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

            // Haxe.g:459:9: ( ( declAttrList )? FUNCTION NEW LPAREN paramList RPAREN typeTagOpt block -> ^( FUNCTION NEW ( declAttrList )? ( paramList )? ( typeTagOpt )? ( block )? ) | ( declAttrList )? FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt block -> ^( FUNCTION IDENTIFIER ( declAttrList )? ( paramList )? ( typeTagOpt )? ( block )? ( typeParamOpt )? ) )
            int alt78=2;
            alt78 = dfa78.predict(input);
            switch (alt78) {
                case 1 :
                    // Haxe.g:459:13: ( declAttrList )? FUNCTION NEW LPAREN paramList RPAREN typeTagOpt block
                    {
                    // Haxe.g:459:13: ( declAttrList )?
                    int alt76=2;
                    int LA76_0 = input.LA(1);

                    if ( (LA76_0==DYNAMIC||LA76_0==INLINE||LA76_0==OVERRIDE||LA76_0==PRIVATE||LA76_0==PUBLIC||LA76_0==STATIC) ) {
                        alt76=1;
                    }
                    switch (alt76) {
                        case 1 :
                            // Haxe.g:459:13: declAttrList
                            {
                            pushFollow(FOLLOW_declAttrList_in_funcDecl4339);
                            declAttrList323=declAttrList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_declAttrList.add(declAttrList323.getTree());

                            }
                            break;

                    }


                    FUNCTION324=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcDecl4342); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION324);


                    NEW325=(Token)match(input,NEW,FOLLOW_NEW_in_funcDecl4344); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEW.add(NEW325);


                    LPAREN326=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcDecl4346); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN326);


                    pushFollow(FOLLOW_paramList_in_funcDecl4348);
                    paramList327=paramList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_paramList.add(paramList327.getTree());

                    RPAREN328=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcDecl4350); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN328);


                    pushFollow(FOLLOW_typeTagOpt_in_funcDecl4352);
                    typeTagOpt329=typeTagOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeTagOpt.add(typeTagOpt329.getTree());

                    pushFollow(FOLLOW_block_in_funcDecl4354);
                    block330=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block330.getTree());

                    // AST REWRITE
                    // elements: NEW, typeTagOpt, block, paramList, declAttrList, FUNCTION
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 460:17: -> ^( FUNCTION NEW ( declAttrList )? ( paramList )? ( typeTagOpt )? ( block )? )
                    {
                        // Haxe.g:460:20: ^( FUNCTION NEW ( declAttrList )? ( paramList )? ( typeTagOpt )? ( block )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        new FunctionNode(stream_FUNCTION.nextToken())
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_NEW.nextNode()
                        );

                        // Haxe.g:460:49: ( declAttrList )?
                        if ( stream_declAttrList.hasNext() ) {
                            adaptor.addChild(root_1, stream_declAttrList.nextTree());

                        }
                        stream_declAttrList.reset();

                        // Haxe.g:460:63: ( paramList )?
                        if ( stream_paramList.hasNext() ) {
                            adaptor.addChild(root_1, stream_paramList.nextTree());

                        }
                        stream_paramList.reset();

                        // Haxe.g:460:74: ( typeTagOpt )?
                        if ( stream_typeTagOpt.hasNext() ) {
                            adaptor.addChild(root_1, stream_typeTagOpt.nextTree());

                        }
                        stream_typeTagOpt.reset();

                        // Haxe.g:460:86: ( block )?
                        if ( stream_block.hasNext() ) {
                            adaptor.addChild(root_1, stream_block.nextTree());

                        }
                        stream_block.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // Haxe.g:461:13: ( declAttrList )? FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt block
                    {
                    // Haxe.g:461:13: ( declAttrList )?
                    int alt77=2;
                    int LA77_0 = input.LA(1);

                    if ( (LA77_0==DYNAMIC||LA77_0==INLINE||LA77_0==OVERRIDE||LA77_0==PRIVATE||LA77_0==PUBLIC||LA77_0==STATIC) ) {
                        alt77=1;
                    }
                    switch (alt77) {
                        case 1 :
                            // Haxe.g:461:13: declAttrList
                            {
                            pushFollow(FOLLOW_declAttrList_in_funcDecl4409);
                            declAttrList331=declAttrList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_declAttrList.add(declAttrList331.getTree());

                            }
                            break;

                    }


                    FUNCTION332=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcDecl4412); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION332);


                    IDENTIFIER333=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_funcDecl4414); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER333);


                    pushFollow(FOLLOW_typeParamOpt_in_funcDecl4416);
                    typeParamOpt334=typeParamOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeParamOpt.add(typeParamOpt334.getTree());

                    LPAREN335=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcDecl4418); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN335);


                    pushFollow(FOLLOW_paramList_in_funcDecl4420);
                    paramList336=paramList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_paramList.add(paramList336.getTree());

                    RPAREN337=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcDecl4422); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN337);


                    pushFollow(FOLLOW_typeTagOpt_in_funcDecl4424);
                    typeTagOpt338=typeTagOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeTagOpt.add(typeTagOpt338.getTree());

                    pushFollow(FOLLOW_block_in_funcDecl4426);
                    block339=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block339.getTree());

                    // AST REWRITE
                    // elements: block, typeTagOpt, declAttrList, FUNCTION, paramList, IDENTIFIER, typeParamOpt
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 462:17: -> ^( FUNCTION IDENTIFIER ( declAttrList )? ( paramList )? ( typeTagOpt )? ( block )? ( typeParamOpt )? )
                    {
                        // Haxe.g:462:20: ^( FUNCTION IDENTIFIER ( declAttrList )? ( paramList )? ( typeTagOpt )? ( block )? ( typeParamOpt )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        new FunctionNode(stream_FUNCTION.nextToken())
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_IDENTIFIER.nextNode()
                        );

                        // Haxe.g:462:56: ( declAttrList )?
                        if ( stream_declAttrList.hasNext() ) {
                            adaptor.addChild(root_1, stream_declAttrList.nextTree());

                        }
                        stream_declAttrList.reset();

                        // Haxe.g:462:70: ( paramList )?
                        if ( stream_paramList.hasNext() ) {
                            adaptor.addChild(root_1, stream_paramList.nextTree());

                        }
                        stream_paramList.reset();

                        // Haxe.g:462:81: ( typeTagOpt )?
                        if ( stream_typeTagOpt.hasNext() ) {
                            adaptor.addChild(root_1, stream_typeTagOpt.nextTree());

                        }
                        stream_typeTagOpt.reset();

                        // Haxe.g:462:93: ( block )?
                        if ( stream_block.hasNext() ) {
                            adaptor.addChild(root_1, stream_block.nextTree());

                        }
                        stream_block.reset();

                        // Haxe.g:462:100: ( typeParamOpt )?
                        if ( stream_typeParamOpt.hasNext() ) {
                            adaptor.addChild(root_1, stream_typeParamOpt.nextTree());

                        }
                        stream_typeParamOpt.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
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
        	// do for sure before leaving
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
    // Haxe.g:465:1: funcProtoDecl : ( declAttrList FUNCTION NEW LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTagOpt )? ( declAttrList )? ) | declAttrList FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTagOpt )? ( declAttrList )? ( typeParamOpt )? ) | FUNCTION NEW LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTagOpt )? ) | FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTagOpt )? ( typeParamOpt )? ) );
    public final HaxeParser.funcProtoDecl_return funcProtoDecl() throws RecognitionException {
        HaxeParser.funcProtoDecl_return retval = new HaxeParser.funcProtoDecl_return();
        retval.start = input.LT(1);

        int funcProtoDecl_StartIndex = input.index();

        Object root_0 = null;

        Token FUNCTION341=null;
        Token NEW342=null;
        Token LPAREN343=null;
        Token RPAREN345=null;
        Token SEMI347=null;
        Token FUNCTION349=null;
        Token IDENTIFIER350=null;
        Token LPAREN352=null;
        Token RPAREN354=null;
        Token SEMI356=null;
        Token FUNCTION357=null;
        Token NEW358=null;
        Token LPAREN359=null;
        Token RPAREN361=null;
        Token SEMI363=null;
        Token FUNCTION364=null;
        Token IDENTIFIER365=null;
        Token LPAREN367=null;
        Token RPAREN369=null;
        Token SEMI371=null;
        HaxeParser.declAttrList_return declAttrList340 =null;

        HaxeParser.paramList_return paramList344 =null;

        HaxeParser.typeTagOpt_return typeTagOpt346 =null;

        HaxeParser.declAttrList_return declAttrList348 =null;

        HaxeParser.typeParamOpt_return typeParamOpt351 =null;

        HaxeParser.paramList_return paramList353 =null;

        HaxeParser.typeTagOpt_return typeTagOpt355 =null;

        HaxeParser.paramList_return paramList360 =null;

        HaxeParser.typeTagOpt_return typeTagOpt362 =null;

        HaxeParser.typeParamOpt_return typeParamOpt366 =null;

        HaxeParser.paramList_return paramList368 =null;

        HaxeParser.typeTagOpt_return typeTagOpt370 =null;


        Object FUNCTION341_tree=null;
        Object NEW342_tree=null;
        Object LPAREN343_tree=null;
        Object RPAREN345_tree=null;
        Object SEMI347_tree=null;
        Object FUNCTION349_tree=null;
        Object IDENTIFIER350_tree=null;
        Object LPAREN352_tree=null;
        Object RPAREN354_tree=null;
        Object SEMI356_tree=null;
        Object FUNCTION357_tree=null;
        Object NEW358_tree=null;
        Object LPAREN359_tree=null;
        Object RPAREN361_tree=null;
        Object SEMI363_tree=null;
        Object FUNCTION364_tree=null;
        Object IDENTIFIER365_tree=null;
        Object LPAREN367_tree=null;
        Object RPAREN369_tree=null;
        Object SEMI371_tree=null;
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

            // Haxe.g:466:5: ( declAttrList FUNCTION NEW LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTagOpt )? ( declAttrList )? ) | declAttrList FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTagOpt )? ( declAttrList )? ( typeParamOpt )? ) | FUNCTION NEW LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTagOpt )? ) | FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTagOpt )? ( typeParamOpt )? ) )
            int alt79=4;
            alt79 = dfa79.predict(input);
            switch (alt79) {
                case 1 :
                    // Haxe.g:466:9: declAttrList FUNCTION NEW LPAREN paramList RPAREN typeTagOpt SEMI
                    {
                    pushFollow(FOLLOW_declAttrList_in_funcProtoDecl4496);
                    declAttrList340=declAttrList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declAttrList.add(declAttrList340.getTree());

                    FUNCTION341=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcProtoDecl4498); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION341);


                    NEW342=(Token)match(input,NEW,FOLLOW_NEW_in_funcProtoDecl4500); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEW.add(NEW342);


                    LPAREN343=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcProtoDecl4502); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN343);


                    pushFollow(FOLLOW_paramList_in_funcProtoDecl4504);
                    paramList344=paramList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_paramList.add(paramList344.getTree());

                    RPAREN345=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcProtoDecl4506); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN345);


                    pushFollow(FOLLOW_typeTagOpt_in_funcProtoDecl4508);
                    typeTagOpt346=typeTagOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeTagOpt.add(typeTagOpt346.getTree());

                    SEMI347=(Token)match(input,SEMI,FOLLOW_SEMI_in_funcProtoDecl4510); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI347);


                    // AST REWRITE
                    // elements: paramList, typeTagOpt, FUNCTION, NEW, declAttrList
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 467:13: -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTagOpt )? ( declAttrList )? )
                    {
                        // Haxe.g:467:16: ^( FUNCTION ( NEW )? ( paramList )? ( typeTagOpt )? ( declAttrList )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_FUNCTION.nextNode()
                        , root_1);

                        // Haxe.g:467:27: ( NEW )?
                        if ( stream_NEW.hasNext() ) {
                            adaptor.addChild(root_1, 
                            stream_NEW.nextNode()
                            );

                        }
                        stream_NEW.reset();

                        // Haxe.g:467:32: ( paramList )?
                        if ( stream_paramList.hasNext() ) {
                            adaptor.addChild(root_1, stream_paramList.nextTree());

                        }
                        stream_paramList.reset();

                        // Haxe.g:467:43: ( typeTagOpt )?
                        if ( stream_typeTagOpt.hasNext() ) {
                            adaptor.addChild(root_1, stream_typeTagOpt.nextTree());

                        }
                        stream_typeTagOpt.reset();

                        // Haxe.g:467:55: ( declAttrList )?
                        if ( stream_declAttrList.hasNext() ) {
                            adaptor.addChild(root_1, stream_declAttrList.nextTree());

                        }
                        stream_declAttrList.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // Haxe.g:468:9: declAttrList FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt SEMI
                    {
                    pushFollow(FOLLOW_declAttrList_in_funcProtoDecl4551);
                    declAttrList348=declAttrList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declAttrList.add(declAttrList348.getTree());

                    FUNCTION349=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcProtoDecl4553); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION349);


                    IDENTIFIER350=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_funcProtoDecl4555); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER350);


                    pushFollow(FOLLOW_typeParamOpt_in_funcProtoDecl4557);
                    typeParamOpt351=typeParamOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeParamOpt.add(typeParamOpt351.getTree());

                    LPAREN352=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcProtoDecl4559); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN352);


                    pushFollow(FOLLOW_paramList_in_funcProtoDecl4561);
                    paramList353=paramList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_paramList.add(paramList353.getTree());

                    RPAREN354=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcProtoDecl4563); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN354);


                    pushFollow(FOLLOW_typeTagOpt_in_funcProtoDecl4565);
                    typeTagOpt355=typeTagOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeTagOpt.add(typeTagOpt355.getTree());

                    SEMI356=(Token)match(input,SEMI,FOLLOW_SEMI_in_funcProtoDecl4567); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI356);


                    // AST REWRITE
                    // elements: FUNCTION, paramList, declAttrList, IDENTIFIER, typeTagOpt, typeParamOpt
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 469:13: -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTagOpt )? ( declAttrList )? ( typeParamOpt )? )
                    {
                        // Haxe.g:469:16: ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTagOpt )? ( declAttrList )? ( typeParamOpt )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_FUNCTION.nextNode()
                        , root_1);

                        // Haxe.g:469:27: ( IDENTIFIER )?
                        if ( stream_IDENTIFIER.hasNext() ) {
                            adaptor.addChild(root_1, 
                            stream_IDENTIFIER.nextNode()
                            );

                        }
                        stream_IDENTIFIER.reset();

                        // Haxe.g:469:39: ( paramList )?
                        if ( stream_paramList.hasNext() ) {
                            adaptor.addChild(root_1, stream_paramList.nextTree());

                        }
                        stream_paramList.reset();

                        // Haxe.g:469:50: ( typeTagOpt )?
                        if ( stream_typeTagOpt.hasNext() ) {
                            adaptor.addChild(root_1, stream_typeTagOpt.nextTree());

                        }
                        stream_typeTagOpt.reset();

                        // Haxe.g:469:62: ( declAttrList )?
                        if ( stream_declAttrList.hasNext() ) {
                            adaptor.addChild(root_1, stream_declAttrList.nextTree());

                        }
                        stream_declAttrList.reset();

                        // Haxe.g:469:76: ( typeParamOpt )?
                        if ( stream_typeParamOpt.hasNext() ) {
                            adaptor.addChild(root_1, stream_typeParamOpt.nextTree());

                        }
                        stream_typeParamOpt.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 3 :
                    // Haxe.g:470:9: FUNCTION NEW LPAREN paramList RPAREN typeTagOpt SEMI
                    {
                    FUNCTION357=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcProtoDecl4611); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION357);


                    NEW358=(Token)match(input,NEW,FOLLOW_NEW_in_funcProtoDecl4613); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEW.add(NEW358);


                    LPAREN359=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcProtoDecl4615); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN359);


                    pushFollow(FOLLOW_paramList_in_funcProtoDecl4617);
                    paramList360=paramList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_paramList.add(paramList360.getTree());

                    RPAREN361=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcProtoDecl4619); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN361);


                    pushFollow(FOLLOW_typeTagOpt_in_funcProtoDecl4621);
                    typeTagOpt362=typeTagOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeTagOpt.add(typeTagOpt362.getTree());

                    SEMI363=(Token)match(input,SEMI,FOLLOW_SEMI_in_funcProtoDecl4623); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI363);


                    // AST REWRITE
                    // elements: NEW, FUNCTION, typeTagOpt, paramList
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 471:13: -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTagOpt )? )
                    {
                        // Haxe.g:471:16: ^( FUNCTION ( NEW )? ( paramList )? ( typeTagOpt )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_FUNCTION.nextNode()
                        , root_1);

                        // Haxe.g:471:27: ( NEW )?
                        if ( stream_NEW.hasNext() ) {
                            adaptor.addChild(root_1, 
                            stream_NEW.nextNode()
                            );

                        }
                        stream_NEW.reset();

                        // Haxe.g:471:32: ( paramList )?
                        if ( stream_paramList.hasNext() ) {
                            adaptor.addChild(root_1, stream_paramList.nextTree());

                        }
                        stream_paramList.reset();

                        // Haxe.g:471:43: ( typeTagOpt )?
                        if ( stream_typeTagOpt.hasNext() ) {
                            adaptor.addChild(root_1, stream_typeTagOpt.nextTree());

                        }
                        stream_typeTagOpt.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 4 :
                    // Haxe.g:472:9: FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt SEMI
                    {
                    FUNCTION364=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcProtoDecl4661); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION364);


                    IDENTIFIER365=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_funcProtoDecl4663); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER365);


                    pushFollow(FOLLOW_typeParamOpt_in_funcProtoDecl4665);
                    typeParamOpt366=typeParamOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeParamOpt.add(typeParamOpt366.getTree());

                    LPAREN367=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcProtoDecl4667); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN367);


                    pushFollow(FOLLOW_paramList_in_funcProtoDecl4669);
                    paramList368=paramList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_paramList.add(paramList368.getTree());

                    RPAREN369=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcProtoDecl4671); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN369);


                    pushFollow(FOLLOW_typeTagOpt_in_funcProtoDecl4673);
                    typeTagOpt370=typeTagOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeTagOpt.add(typeTagOpt370.getTree());

                    SEMI371=(Token)match(input,SEMI,FOLLOW_SEMI_in_funcProtoDecl4675); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI371);


                    // AST REWRITE
                    // elements: IDENTIFIER, typeTagOpt, paramList, FUNCTION, typeParamOpt
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 473:13: -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTagOpt )? ( typeParamOpt )? )
                    {
                        // Haxe.g:473:16: ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTagOpt )? ( typeParamOpt )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_FUNCTION.nextNode()
                        , root_1);

                        // Haxe.g:473:27: ( IDENTIFIER )?
                        if ( stream_IDENTIFIER.hasNext() ) {
                            adaptor.addChild(root_1, 
                            stream_IDENTIFIER.nextNode()
                            );

                        }
                        stream_IDENTIFIER.reset();

                        // Haxe.g:473:39: ( paramList )?
                        if ( stream_paramList.hasNext() ) {
                            adaptor.addChild(root_1, stream_paramList.nextTree());

                        }
                        stream_paramList.reset();

                        // Haxe.g:473:50: ( typeTagOpt )?
                        if ( stream_typeTagOpt.hasNext() ) {
                            adaptor.addChild(root_1, stream_typeTagOpt.nextTree());

                        }
                        stream_typeTagOpt.reset();

                        // Haxe.g:473:62: ( typeParamOpt )?
                        if ( stream_typeParamOpt.hasNext() ) {
                            adaptor.addChild(root_1, stream_typeParamOpt.nextTree());

                        }
                        stream_typeParamOpt.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
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
        	// do for sure before leaving
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
    // Haxe.g:476:1: classDecl : typeDeclFlags CLASS IDENTIFIER typeParamOpt inheritListOpt classBodyScope -> ^( IDENTIFIER ( typeDeclFlags )? ( typeParamOpt )? ( inheritListOpt )? ( classBodyScope )? ) ;
    public final HaxeParser.classDecl_return classDecl() throws RecognitionException {
        HaxeParser.classDecl_return retval = new HaxeParser.classDecl_return();
        retval.start = input.LT(1);

        int classDecl_StartIndex = input.index();

        Object root_0 = null;

        Token CLASS373=null;
        Token IDENTIFIER374=null;
        HaxeParser.typeDeclFlags_return typeDeclFlags372 =null;

        HaxeParser.typeParamOpt_return typeParamOpt375 =null;

        HaxeParser.inheritListOpt_return inheritListOpt376 =null;

        HaxeParser.classBodyScope_return classBodyScope377 =null;


        Object CLASS373_tree=null;
        Object IDENTIFIER374_tree=null;
        RewriteRuleTokenStream stream_CLASS=new RewriteRuleTokenStream(adaptor,"token CLASS");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleSubtreeStream stream_typeDeclFlags=new RewriteRuleSubtreeStream(adaptor,"rule typeDeclFlags");
        RewriteRuleSubtreeStream stream_classBodyScope=new RewriteRuleSubtreeStream(adaptor,"rule classBodyScope");
        RewriteRuleSubtreeStream stream_typeParamOpt=new RewriteRuleSubtreeStream(adaptor,"rule typeParamOpt");
        RewriteRuleSubtreeStream stream_inheritListOpt=new RewriteRuleSubtreeStream(adaptor,"rule inheritListOpt");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 75) ) { return retval; }

            // Haxe.g:477:5: ( typeDeclFlags CLASS IDENTIFIER typeParamOpt inheritListOpt classBodyScope -> ^( IDENTIFIER ( typeDeclFlags )? ( typeParamOpt )? ( inheritListOpt )? ( classBodyScope )? ) )
            // Haxe.g:477:9: typeDeclFlags CLASS IDENTIFIER typeParamOpt inheritListOpt classBodyScope
            {
            pushFollow(FOLLOW_typeDeclFlags_in_classDecl4729);
            typeDeclFlags372=typeDeclFlags();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeDeclFlags.add(typeDeclFlags372.getTree());

            CLASS373=(Token)match(input,CLASS,FOLLOW_CLASS_in_classDecl4731); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CLASS.add(CLASS373);


            IDENTIFIER374=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_classDecl4733); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER374);


            pushFollow(FOLLOW_typeParamOpt_in_classDecl4735);
            typeParamOpt375=typeParamOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeParamOpt.add(typeParamOpt375.getTree());

            pushFollow(FOLLOW_inheritListOpt_in_classDecl4737);
            inheritListOpt376=inheritListOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_inheritListOpt.add(inheritListOpt376.getTree());

            pushFollow(FOLLOW_classBodyScope_in_classDecl4739);
            classBodyScope377=classBodyScope();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_classBodyScope.add(classBodyScope377.getTree());

            // AST REWRITE
            // elements: typeDeclFlags, IDENTIFIER, typeParamOpt, classBodyScope, inheritListOpt
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 478:13: -> ^( IDENTIFIER ( typeDeclFlags )? ( typeParamOpt )? ( inheritListOpt )? ( classBodyScope )? )
            {
                // Haxe.g:478:16: ^( IDENTIFIER ( typeDeclFlags )? ( typeParamOpt )? ( inheritListOpt )? ( classBodyScope )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                new ClassNode(stream_IDENTIFIER.nextToken())
                , root_1);

                // Haxe.g:478:40: ( typeDeclFlags )?
                if ( stream_typeDeclFlags.hasNext() ) {
                    adaptor.addChild(root_1, stream_typeDeclFlags.nextTree());

                }
                stream_typeDeclFlags.reset();

                // Haxe.g:478:55: ( typeParamOpt )?
                if ( stream_typeParamOpt.hasNext() ) {
                    adaptor.addChild(root_1, stream_typeParamOpt.nextTree());

                }
                stream_typeParamOpt.reset();

                // Haxe.g:478:69: ( inheritListOpt )?
                if ( stream_inheritListOpt.hasNext() ) {
                    adaptor.addChild(root_1, stream_inheritListOpt.nextTree());

                }
                stream_inheritListOpt.reset();

                // Haxe.g:478:85: ( classBodyScope )?
                if ( stream_classBodyScope.hasNext() ) {
                    adaptor.addChild(root_1, stream_classBodyScope.nextTree());

                }
                stream_classBodyScope.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
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
        	// do for sure before leaving
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
    // Haxe.g:481:1: classBodyScope : LBRACE ( classMember )* RBRACE -> ^( BLOCK_SCOPE[\"BLOCK_SCOPE\", true, $LBRACE] ( classMember )* RBRACE[$RBRACE, true] ) ;
    public final HaxeParser.classBodyScope_return classBodyScope() throws RecognitionException {
        HaxeParser.classBodyScope_return retval = new HaxeParser.classBodyScope_return();
        retval.start = input.LT(1);

        int classBodyScope_StartIndex = input.index();

        Object root_0 = null;

        Token LBRACE378=null;
        Token RBRACE380=null;
        HaxeParser.classMember_return classMember379 =null;


        Object LBRACE378_tree=null;
        Object RBRACE380_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_classMember=new RewriteRuleSubtreeStream(adaptor,"rule classMember");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 76) ) { return retval; }

            // Haxe.g:482:5: ( LBRACE ( classMember )* RBRACE -> ^( BLOCK_SCOPE[\"BLOCK_SCOPE\", true, $LBRACE] ( classMember )* RBRACE[$RBRACE, true] ) )
            // Haxe.g:482:9: LBRACE ( classMember )* RBRACE
            {
            LBRACE378=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_classBodyScope4795); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACE.add(LBRACE378);


            // Haxe.g:482:16: ( classMember )*
            loop80:
            do {
                int alt80=2;
                int LA80_0 = input.LA(1);

                if ( (LA80_0==CLASS||LA80_0==DYNAMIC||LA80_0==ENUM||LA80_0==EXTERN||LA80_0==FUNCTION||LA80_0==INLINE||LA80_0==INTERFACE||LA80_0==MONKEYS_AT||LA80_0==OVERRIDE||LA80_0==PRIVATE||LA80_0==PUBLIC||LA80_0==STATIC||LA80_0==VAR) ) {
                    alt80=1;
                }


                switch (alt80) {
            	case 1 :
            	    // Haxe.g:482:17: classMember
            	    {
            	    pushFollow(FOLLOW_classMember_in_classBodyScope4798);
            	    classMember379=classMember();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_classMember.add(classMember379.getTree());

            	    }
            	    break;

            	default :
            	    break loop80;
                }
            } while (true);


            RBRACE380=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_classBodyScope4802); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACE.add(RBRACE380);


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
            // 482:38: -> ^( BLOCK_SCOPE[\"BLOCK_SCOPE\", true, $LBRACE] ( classMember )* RBRACE[$RBRACE, true] )
            {
                // Haxe.g:482:41: ^( BLOCK_SCOPE[\"BLOCK_SCOPE\", true, $LBRACE] ( classMember )* RBRACE[$RBRACE, true] )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                new BlockScopeNode(BLOCK_SCOPE, "BLOCK_SCOPE", true, LBRACE378)
                , root_1);

                // Haxe.g:482:101: ( classMember )*
                while ( stream_classMember.hasNext() ) {
                    adaptor.addChild(root_1, stream_classMember.nextTree());

                }
                stream_classMember.reset();

                adaptor.addChild(root_1, 
                new HaxeTree(RBRACE, RBRACE380, true)
                );

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
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
        	// do for sure before leaving
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
    // Haxe.g:485:1: classMember : ( varDecl | funcDecl | enumDecl );
    public final HaxeParser.classMember_return classMember() throws RecognitionException {
        HaxeParser.classMember_return retval = new HaxeParser.classMember_return();
        retval.start = input.LT(1);

        int classMember_StartIndex = input.index();

        Object root_0 = null;

        HaxeParser.varDecl_return varDecl381 =null;

        HaxeParser.funcDecl_return funcDecl382 =null;

        HaxeParser.enumDecl_return enumDecl383 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 77) ) { return retval; }

            // Haxe.g:486:5: ( varDecl | funcDecl | enumDecl )
            int alt81=3;
            alt81 = dfa81.predict(input);
            switch (alt81) {
                case 1 :
                    // Haxe.g:486:9: varDecl
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_varDecl_in_classMember4840);
                    varDecl381=varDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDecl381.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:487:9: funcDecl
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_funcDecl_in_classMember4851);
                    funcDecl382=funcDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, funcDecl382.getTree());

                    }
                    break;
                case 3 :
                    // Haxe.g:489:9: enumDecl
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_enumDecl_in_classMember4863);
                    enumDecl383=enumDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, enumDecl383.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
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
    // Haxe.g:492:1: interfaceDecl : typeDeclFlags INTERFACE type inheritListOpt LBRACE ! interfaceBody RBRACE !;
    public final HaxeParser.interfaceDecl_return interfaceDecl() throws RecognitionException {
        HaxeParser.interfaceDecl_return retval = new HaxeParser.interfaceDecl_return();
        retval.start = input.LT(1);

        int interfaceDecl_StartIndex = input.index();

        Object root_0 = null;

        Token INTERFACE385=null;
        Token LBRACE388=null;
        Token RBRACE390=null;
        HaxeParser.typeDeclFlags_return typeDeclFlags384 =null;

        HaxeParser.type_return type386 =null;

        HaxeParser.inheritListOpt_return inheritListOpt387 =null;

        HaxeParser.interfaceBody_return interfaceBody389 =null;


        Object INTERFACE385_tree=null;
        Object LBRACE388_tree=null;
        Object RBRACE390_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 78) ) { return retval; }

            // Haxe.g:493:5: ( typeDeclFlags INTERFACE type inheritListOpt LBRACE ! interfaceBody RBRACE !)
            // Haxe.g:493:9: typeDeclFlags INTERFACE type inheritListOpt LBRACE ! interfaceBody RBRACE !
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_typeDeclFlags_in_interfaceDecl4892);
            typeDeclFlags384=typeDeclFlags();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, typeDeclFlags384.getTree());

            INTERFACE385=(Token)match(input,INTERFACE,FOLLOW_INTERFACE_in_interfaceDecl4894); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            INTERFACE385_tree = 
            (Object)adaptor.create(INTERFACE385)
            ;
            adaptor.addChild(root_0, INTERFACE385_tree);
            }

            pushFollow(FOLLOW_type_in_interfaceDecl4896);
            type386=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type386.getTree());

            pushFollow(FOLLOW_inheritListOpt_in_interfaceDecl4898);
            inheritListOpt387=inheritListOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, inheritListOpt387.getTree());

            LBRACE388=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_interfaceDecl4900); if (state.failed) return retval;

            pushFollow(FOLLOW_interfaceBody_in_interfaceDecl4903);
            interfaceBody389=interfaceBody();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceBody389.getTree());

            RBRACE390=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_interfaceDecl4905); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
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
    // Haxe.g:496:1: interfaceBody : ( varDecl interfaceBody | funcProtoDecl interfaceBody |);
    public final HaxeParser.interfaceBody_return interfaceBody() throws RecognitionException {
        HaxeParser.interfaceBody_return retval = new HaxeParser.interfaceBody_return();
        retval.start = input.LT(1);

        int interfaceBody_StartIndex = input.index();

        Object root_0 = null;

        HaxeParser.varDecl_return varDecl391 =null;

        HaxeParser.interfaceBody_return interfaceBody392 =null;

        HaxeParser.funcProtoDecl_return funcProtoDecl393 =null;

        HaxeParser.interfaceBody_return interfaceBody394 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 79) ) { return retval; }

            // Haxe.g:497:5: ( varDecl interfaceBody | funcProtoDecl interfaceBody |)
            int alt82=3;
            alt82 = dfa82.predict(input);
            switch (alt82) {
                case 1 :
                    // Haxe.g:497:9: varDecl interfaceBody
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_varDecl_in_interfaceBody4929);
                    varDecl391=varDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDecl391.getTree());

                    pushFollow(FOLLOW_interfaceBody_in_interfaceBody4931);
                    interfaceBody392=interfaceBody();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceBody392.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:498:9: funcProtoDecl interfaceBody
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_funcProtoDecl_in_interfaceBody4941);
                    funcProtoDecl393=funcProtoDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, funcProtoDecl393.getTree());

                    pushFollow(FOLLOW_interfaceBody_in_interfaceBody4943);
                    interfaceBody394=interfaceBody();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceBody394.getTree());

                    }
                    break;
                case 3 :
                    // Haxe.g:501:5: 
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
        	// do for sure before leaving
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
    // Haxe.g:503:1: inheritList : inherit ( COMMA ! inherit )* ;
    public final HaxeParser.inheritList_return inheritList() throws RecognitionException {
        HaxeParser.inheritList_return retval = new HaxeParser.inheritList_return();
        retval.start = input.LT(1);

        int inheritList_StartIndex = input.index();

        Object root_0 = null;

        Token COMMA396=null;
        HaxeParser.inherit_return inherit395 =null;

        HaxeParser.inherit_return inherit397 =null;


        Object COMMA396_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 80) ) { return retval; }

            // Haxe.g:504:5: ( inherit ( COMMA ! inherit )* )
            // Haxe.g:504:10: inherit ( COMMA ! inherit )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_inherit_in_inheritList4977);
            inherit395=inherit();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, inherit395.getTree());

            // Haxe.g:504:18: ( COMMA ! inherit )*
            loop83:
            do {
                int alt83=2;
                int LA83_0 = input.LA(1);

                if ( (LA83_0==COMMA) ) {
                    alt83=1;
                }


                switch (alt83) {
            	case 1 :
            	    // Haxe.g:504:19: COMMA ! inherit
            	    {
            	    COMMA396=(Token)match(input,COMMA,FOLLOW_COMMA_in_inheritList4980); if (state.failed) return retval;

            	    pushFollow(FOLLOW_inherit_in_inheritList4983);
            	    inherit397=inherit();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, inherit397.getTree());

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
        	// do for sure before leaving
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
    // Haxe.g:507:1: inheritListOpt : ( inheritList -> ^( INHERIT_LIST_OPT[\"INHERIT_LIST_OPT\",true] ( inheritList )? ) |);
    public final HaxeParser.inheritListOpt_return inheritListOpt() throws RecognitionException {
        HaxeParser.inheritListOpt_return retval = new HaxeParser.inheritListOpt_return();
        retval.start = input.LT(1);

        int inheritListOpt_StartIndex = input.index();

        Object root_0 = null;

        HaxeParser.inheritList_return inheritList398 =null;


        RewriteRuleSubtreeStream stream_inheritList=new RewriteRuleSubtreeStream(adaptor,"rule inheritList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 81) ) { return retval; }

            // Haxe.g:508:5: ( inheritList -> ^( INHERIT_LIST_OPT[\"INHERIT_LIST_OPT\",true] ( inheritList )? ) |)
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==EXTENDS||LA84_0==IMPLEMENTS) ) {
                alt84=1;
            }
            else if ( (LA84_0==LBRACE) ) {
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
                    // Haxe.g:508:10: inheritList
                    {
                    pushFollow(FOLLOW_inheritList_in_inheritListOpt5013);
                    inheritList398=inheritList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_inheritList.add(inheritList398.getTree());

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
                    // 508:22: -> ^( INHERIT_LIST_OPT[\"INHERIT_LIST_OPT\",true] ( inheritList )? )
                    {
                        // Haxe.g:508:25: ^( INHERIT_LIST_OPT[\"INHERIT_LIST_OPT\",true] ( inheritList )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        new HaxeTree(INHERIT_LIST_OPT, "INHERIT_LIST_OPT", true)
                        , root_1);

                        // Haxe.g:508:79: ( inheritList )?
                        if ( stream_inheritList.hasNext() ) {
                            adaptor.addChild(root_1, stream_inheritList.nextTree());

                        }
                        stream_inheritList.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // Haxe.g:510:5: 
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
        	// do for sure before leaving
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
    // Haxe.g:512:1: inherit : ( EXTENDS type -> ^( EXTENDS ( type )? ) | IMPLEMENTS type -> ^( IMPLEMENTS ( type )? ) );
    public final HaxeParser.inherit_return inherit() throws RecognitionException {
        HaxeParser.inherit_return retval = new HaxeParser.inherit_return();
        retval.start = input.LT(1);

        int inherit_StartIndex = input.index();

        Object root_0 = null;

        Token EXTENDS399=null;
        Token IMPLEMENTS401=null;
        HaxeParser.type_return type400 =null;

        HaxeParser.type_return type402 =null;


        Object EXTENDS399_tree=null;
        Object IMPLEMENTS401_tree=null;
        RewriteRuleTokenStream stream_IMPLEMENTS=new RewriteRuleTokenStream(adaptor,"token IMPLEMENTS");
        RewriteRuleTokenStream stream_EXTENDS=new RewriteRuleTokenStream(adaptor,"token EXTENDS");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 82) ) { return retval; }

            // Haxe.g:512:12: ( EXTENDS type -> ^( EXTENDS ( type )? ) | IMPLEMENTS type -> ^( IMPLEMENTS ( type )? ) )
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==EXTENDS) ) {
                alt85=1;
            }
            else if ( (LA85_0==IMPLEMENTS) ) {
                alt85=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 85, 0, input);

                throw nvae;

            }
            switch (alt85) {
                case 1 :
                    // Haxe.g:512:17: EXTENDS type
                    {
                    EXTENDS399=(Token)match(input,EXTENDS,FOLLOW_EXTENDS_in_inherit5059); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EXTENDS.add(EXTENDS399);


                    pushFollow(FOLLOW_type_in_inherit5061);
                    type400=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type400.getTree());

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
                    // 512:34: -> ^( EXTENDS ( type )? )
                    {
                        // Haxe.g:512:37: ^( EXTENDS ( type )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_EXTENDS.nextNode()
                        , root_1);

                        // Haxe.g:512:47: ( type )?
                        if ( stream_type.hasNext() ) {
                            adaptor.addChild(root_1, stream_type.nextTree());

                        }
                        stream_type.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // Haxe.g:513:14: IMPLEMENTS type
                    {
                    IMPLEMENTS401=(Token)match(input,IMPLEMENTS,FOLLOW_IMPLEMENTS_in_inherit5089); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IMPLEMENTS.add(IMPLEMENTS401);


                    pushFollow(FOLLOW_type_in_inherit5091);
                    type402=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type402.getTree());

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
                    // 513:30: -> ^( IMPLEMENTS ( type )? )
                    {
                        // Haxe.g:513:33: ^( IMPLEMENTS ( type )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_IMPLEMENTS.nextNode()
                        , root_1);

                        // Haxe.g:513:46: ( type )?
                        if ( stream_type.hasNext() ) {
                            adaptor.addChild(root_1, stream_type.nextTree());

                        }
                        stream_type.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
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
        	// do for sure before leaving
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
    // Haxe.g:516:1: typedefDecl : TYPEDEF IDENTIFIER EQ funcType ;
    public final HaxeParser.typedefDecl_return typedefDecl() throws RecognitionException {
        HaxeParser.typedefDecl_return retval = new HaxeParser.typedefDecl_return();
        retval.start = input.LT(1);

        int typedefDecl_StartIndex = input.index();

        Object root_0 = null;

        Token TYPEDEF403=null;
        Token IDENTIFIER404=null;
        Token EQ405=null;
        HaxeParser.funcType_return funcType406 =null;


        Object TYPEDEF403_tree=null;
        Object IDENTIFIER404_tree=null;
        Object EQ405_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 83) ) { return retval; }

            // Haxe.g:517:5: ( TYPEDEF IDENTIFIER EQ funcType )
            // Haxe.g:517:10: TYPEDEF IDENTIFIER EQ funcType
            {
            root_0 = (Object)adaptor.nil();


            TYPEDEF403=(Token)match(input,TYPEDEF,FOLLOW_TYPEDEF_in_typedefDecl5131); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TYPEDEF403_tree = 
            (Object)adaptor.create(TYPEDEF403)
            ;
            adaptor.addChild(root_0, TYPEDEF403_tree);
            }

            IDENTIFIER404=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_typedefDecl5133); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER404_tree = 
            (Object)adaptor.create(IDENTIFIER404)
            ;
            adaptor.addChild(root_0, IDENTIFIER404_tree);
            }

            EQ405=(Token)match(input,EQ,FOLLOW_EQ_in_typedefDecl5135); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            EQ405_tree = 
            (Object)adaptor.create(EQ405)
            ;
            adaptor.addChild(root_0, EQ405_tree);
            }

            pushFollow(FOLLOW_funcType_in_typedefDecl5137);
            funcType406=funcType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, funcType406.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
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
    // Haxe.g:520:1: typeExtend : GT funcType COMMA !;
    public final HaxeParser.typeExtend_return typeExtend() throws RecognitionException {
        HaxeParser.typeExtend_return retval = new HaxeParser.typeExtend_return();
        retval.start = input.LT(1);

        int typeExtend_StartIndex = input.index();

        Object root_0 = null;

        Token GT407=null;
        Token COMMA409=null;
        HaxeParser.funcType_return funcType408 =null;


        Object GT407_tree=null;
        Object COMMA409_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 84) ) { return retval; }

            // Haxe.g:521:5: ( GT funcType COMMA !)
            // Haxe.g:521:10: GT funcType COMMA !
            {
            root_0 = (Object)adaptor.nil();


            GT407=(Token)match(input,GT,FOLLOW_GT_in_typeExtend5161); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            GT407_tree = 
            (Object)adaptor.create(GT407)
            ;
            adaptor.addChild(root_0, GT407_tree);
            }

            pushFollow(FOLLOW_funcType_in_typeExtend5163);
            funcType408=funcType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, funcType408.getTree());

            COMMA409=(Token)match(input,COMMA,FOLLOW_COMMA_in_typeExtend5165); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
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
    // Haxe.g:524:1: anonType : LBRACE ! (| anonTypeFieldList | varDeclList | typeExtend (| anonTypeFieldList | varDeclList ) ) RBRACE !;
    public final HaxeParser.anonType_return anonType() throws RecognitionException {
        HaxeParser.anonType_return retval = new HaxeParser.anonType_return();
        retval.start = input.LT(1);

        int anonType_StartIndex = input.index();

        Object root_0 = null;

        Token LBRACE410=null;
        Token RBRACE416=null;
        HaxeParser.anonTypeFieldList_return anonTypeFieldList411 =null;

        HaxeParser.varDeclList_return varDeclList412 =null;

        HaxeParser.typeExtend_return typeExtend413 =null;

        HaxeParser.anonTypeFieldList_return anonTypeFieldList414 =null;

        HaxeParser.varDeclList_return varDeclList415 =null;


        Object LBRACE410_tree=null;
        Object RBRACE416_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 85) ) { return retval; }

            // Haxe.g:525:5: ( LBRACE ! (| anonTypeFieldList | varDeclList | typeExtend (| anonTypeFieldList | varDeclList ) ) RBRACE !)
            // Haxe.g:525:9: LBRACE ! (| anonTypeFieldList | varDeclList | typeExtend (| anonTypeFieldList | varDeclList ) ) RBRACE !
            {
            root_0 = (Object)adaptor.nil();


            LBRACE410=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_anonType5189); if (state.failed) return retval;

            // Haxe.g:526:13: (| anonTypeFieldList | varDeclList | typeExtend (| anonTypeFieldList | varDeclList ) )
            int alt87=4;
            switch ( input.LA(1) ) {
            case RBRACE:
                {
                alt87=1;
                }
                break;
            case IDENTIFIER:
                {
                alt87=2;
                }
                break;
            case DYNAMIC:
            case INLINE:
            case OVERRIDE:
            case PRIVATE:
            case PUBLIC:
            case STATIC:
            case VAR:
                {
                alt87=3;
                }
                break;
            case GT:
                {
                alt87=4;
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
                    // Haxe.g:527:13: 
                    {
                    }
                    break;
                case 2 :
                    // Haxe.g:527:17: anonTypeFieldList
                    {
                    pushFollow(FOLLOW_anonTypeFieldList_in_anonType5223);
                    anonTypeFieldList411=anonTypeFieldList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, anonTypeFieldList411.getTree());

                    }
                    break;
                case 3 :
                    // Haxe.g:528:17: varDeclList
                    {
                    pushFollow(FOLLOW_varDeclList_in_anonType5242);
                    varDeclList412=varDeclList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclList412.getTree());

                    }
                    break;
                case 4 :
                    // Haxe.g:529:17: typeExtend (| anonTypeFieldList | varDeclList )
                    {
                    pushFollow(FOLLOW_typeExtend_in_anonType5261);
                    typeExtend413=typeExtend();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeExtend413.getTree());

                    // Haxe.g:529:28: (| anonTypeFieldList | varDeclList )
                    int alt86=3;
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
                    case DYNAMIC:
                    case INLINE:
                    case OVERRIDE:
                    case PRIVATE:
                    case PUBLIC:
                    case STATIC:
                    case VAR:
                        {
                        alt86=3;
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
                            // Haxe.g:530:25: 
                            {
                            }
                            break;
                        case 2 :
                            // Haxe.g:530:29: anonTypeFieldList
                            {
                            pushFollow(FOLLOW_anonTypeFieldList_in_anonType5293);
                            anonTypeFieldList414=anonTypeFieldList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, anonTypeFieldList414.getTree());

                            }
                            break;
                        case 3 :
                            // Haxe.g:531:29: varDeclList
                            {
                            pushFollow(FOLLOW_varDeclList_in_anonType5323);
                            varDeclList415=varDeclList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclList415.getTree());

                            }
                            break;

                    }


                    }
                    break;

            }


            RBRACE416=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_anonType5350); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
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
    // Haxe.g:536:1: anonTypeFieldList : anonTypeField ( COMMA ! anonTypeField )* ;
    public final HaxeParser.anonTypeFieldList_return anonTypeFieldList() throws RecognitionException {
        HaxeParser.anonTypeFieldList_return retval = new HaxeParser.anonTypeFieldList_return();
        retval.start = input.LT(1);

        int anonTypeFieldList_StartIndex = input.index();

        Object root_0 = null;

        Token COMMA418=null;
        HaxeParser.anonTypeField_return anonTypeField417 =null;

        HaxeParser.anonTypeField_return anonTypeField419 =null;


        Object COMMA418_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 86) ) { return retval; }

            // Haxe.g:537:5: ( anonTypeField ( COMMA ! anonTypeField )* )
            // Haxe.g:537:10: anonTypeField ( COMMA ! anonTypeField )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_anonTypeField_in_anonTypeFieldList5376);
            anonTypeField417=anonTypeField();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, anonTypeField417.getTree());

            // Haxe.g:537:24: ( COMMA ! anonTypeField )*
            loop88:
            do {
                int alt88=2;
                int LA88_0 = input.LA(1);

                if ( (LA88_0==COMMA) ) {
                    alt88=1;
                }


                switch (alt88) {
            	case 1 :
            	    // Haxe.g:537:25: COMMA ! anonTypeField
            	    {
            	    COMMA418=(Token)match(input,COMMA,FOLLOW_COMMA_in_anonTypeFieldList5379); if (state.failed) return retval;

            	    pushFollow(FOLLOW_anonTypeField_in_anonTypeFieldList5382);
            	    anonTypeField419=anonTypeField();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, anonTypeField419.getTree());

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
        	// do for sure before leaving
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
    // Haxe.g:540:1: objLit : '{' ! objLitElemList '}' !;
    public final HaxeParser.objLit_return objLit() throws RecognitionException {
        HaxeParser.objLit_return retval = new HaxeParser.objLit_return();
        retval.start = input.LT(1);

        int objLit_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal420=null;
        Token char_literal422=null;
        HaxeParser.objLitElemList_return objLitElemList421 =null;


        Object char_literal420_tree=null;
        Object char_literal422_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 87) ) { return retval; }

            // Haxe.g:540:9: ( '{' ! objLitElemList '}' !)
            // Haxe.g:540:11: '{' ! objLitElemList '}' !
            {
            root_0 = (Object)adaptor.nil();


            char_literal420=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_objLit5398); if (state.failed) return retval;

            pushFollow(FOLLOW_objLitElemList_in_objLit5401);
            objLitElemList421=objLitElemList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, objLitElemList421.getTree());

            char_literal422=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_objLit5403); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
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
    // Haxe.g:543:1: anonTypeField : IDENTIFIER COLON ! funcType ;
    public final HaxeParser.anonTypeField_return anonTypeField() throws RecognitionException {
        HaxeParser.anonTypeField_return retval = new HaxeParser.anonTypeField_return();
        retval.start = input.LT(1);

        int anonTypeField_StartIndex = input.index();

        Object root_0 = null;

        Token IDENTIFIER423=null;
        Token COLON424=null;
        HaxeParser.funcType_return funcType425 =null;


        Object IDENTIFIER423_tree=null;
        Object COLON424_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 88) ) { return retval; }

            // Haxe.g:544:5: ( IDENTIFIER COLON ! funcType )
            // Haxe.g:544:10: IDENTIFIER COLON ! funcType
            {
            root_0 = (Object)adaptor.nil();


            IDENTIFIER423=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_anonTypeField5428); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER423_tree = 
            (Object)adaptor.create(IDENTIFIER423)
            ;
            adaptor.addChild(root_0, IDENTIFIER423_tree);
            }

            COLON424=(Token)match(input,COLON,FOLLOW_COLON_in_anonTypeField5430); if (state.failed) return retval;

            pushFollow(FOLLOW_funcType_in_anonTypeField5433);
            funcType425=funcType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, funcType425.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
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
    // Haxe.g:547:1: objLitElemList : objLitElem ( COMMA ! objLitElem )* ;
    public final HaxeParser.objLitElemList_return objLitElemList() throws RecognitionException {
        HaxeParser.objLitElemList_return retval = new HaxeParser.objLitElemList_return();
        retval.start = input.LT(1);

        int objLitElemList_StartIndex = input.index();

        Object root_0 = null;

        Token COMMA427=null;
        HaxeParser.objLitElem_return objLitElem426 =null;

        HaxeParser.objLitElem_return objLitElem428 =null;


        Object COMMA427_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 89) ) { return retval; }

            // Haxe.g:548:5: ( objLitElem ( COMMA ! objLitElem )* )
            // Haxe.g:548:10: objLitElem ( COMMA ! objLitElem )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_objLitElem_in_objLitElemList5461);
            objLitElem426=objLitElem();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, objLitElem426.getTree());

            // Haxe.g:548:21: ( COMMA ! objLitElem )*
            loop89:
            do {
                int alt89=2;
                int LA89_0 = input.LA(1);

                if ( (LA89_0==COMMA) ) {
                    alt89=1;
                }


                switch (alt89) {
            	case 1 :
            	    // Haxe.g:548:22: COMMA ! objLitElem
            	    {
            	    COMMA427=(Token)match(input,COMMA,FOLLOW_COMMA_in_objLitElemList5464); if (state.failed) return retval;

            	    pushFollow(FOLLOW_objLitElem_in_objLitElemList5467);
            	    objLitElem428=objLitElem();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, objLitElem428.getTree());

            	    }
            	    break;

            	default :
            	    break loop89;
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
        	// do for sure before leaving
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
    // Haxe.g:551:1: objLitElem : IDENTIFIER COLON ! expr ;
    public final HaxeParser.objLitElem_return objLitElem() throws RecognitionException {
        HaxeParser.objLitElem_return retval = new HaxeParser.objLitElem_return();
        retval.start = input.LT(1);

        int objLitElem_StartIndex = input.index();

        Object root_0 = null;

        Token IDENTIFIER429=null;
        Token COLON430=null;
        HaxeParser.expr_return expr431 =null;


        Object IDENTIFIER429_tree=null;
        Object COLON430_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 90) ) { return retval; }

            // Haxe.g:552:5: ( IDENTIFIER COLON ! expr )
            // Haxe.g:552:10: IDENTIFIER COLON ! expr
            {
            root_0 = (Object)adaptor.nil();


            IDENTIFIER429=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_objLitElem5493); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER429_tree = 
            (Object)adaptor.create(IDENTIFIER429)
            ;
            adaptor.addChild(root_0, IDENTIFIER429_tree);
            }

            COLON430=(Token)match(input,COLON,FOLLOW_COLON_in_objLitElem5495); if (state.failed) return retval;

            pushFollow(FOLLOW_expr_in_objLitElem5498);
            expr431=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr431.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
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
    // Haxe.g:555:1: elementarySymbol : ( LONGLITERAL -> LONGLITERAL[$LONGLITERAL, \"INT\"] | NULL -> ^( NULL[$NULL,\"Unknown<0>\"] ) | INTLITERAL -> INTLITERAL[$INTLITERAL, \"INT\"] | STRINGLITERAL -> STRINGLITERAL[$STRINGLITERAL,\"STRING\"] | CHARLITERAL -> CHARLITERAL[$CHARLITERAL, \"STRING\"] | FLOATNUM -> FLOATNUM[$FLOATNUM, \"FLOAT\"] | TRUE -> TRUE[$TRUE,\"BOOL\"] | FALSE -> FALSE[$FALSE,\"BOOL\"] );
    public final HaxeParser.elementarySymbol_return elementarySymbol() throws RecognitionException {
        HaxeParser.elementarySymbol_return retval = new HaxeParser.elementarySymbol_return();
        retval.start = input.LT(1);

        int elementarySymbol_StartIndex = input.index();

        Object root_0 = null;

        Token LONGLITERAL432=null;
        Token NULL433=null;
        Token INTLITERAL434=null;
        Token STRINGLITERAL435=null;
        Token CHARLITERAL436=null;
        Token FLOATNUM437=null;
        Token TRUE438=null;
        Token FALSE439=null;

        Object LONGLITERAL432_tree=null;
        Object NULL433_tree=null;
        Object INTLITERAL434_tree=null;
        Object STRINGLITERAL435_tree=null;
        Object CHARLITERAL436_tree=null;
        Object FLOATNUM437_tree=null;
        Object TRUE438_tree=null;
        Object FALSE439_tree=null;
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

            // Haxe.g:556:5: ( LONGLITERAL -> LONGLITERAL[$LONGLITERAL, \"INT\"] | NULL -> ^( NULL[$NULL,\"Unknown<0>\"] ) | INTLITERAL -> INTLITERAL[$INTLITERAL, \"INT\"] | STRINGLITERAL -> STRINGLITERAL[$STRINGLITERAL,\"STRING\"] | CHARLITERAL -> CHARLITERAL[$CHARLITERAL, \"STRING\"] | FLOATNUM -> FLOATNUM[$FLOATNUM, \"FLOAT\"] | TRUE -> TRUE[$TRUE,\"BOOL\"] | FALSE -> FALSE[$FALSE,\"BOOL\"] )
            int alt90=8;
            switch ( input.LA(1) ) {
            case LONGLITERAL:
                {
                alt90=1;
                }
                break;
            case NULL:
                {
                alt90=2;
                }
                break;
            case INTLITERAL:
                {
                alt90=3;
                }
                break;
            case STRINGLITERAL:
                {
                alt90=4;
                }
                break;
            case CHARLITERAL:
                {
                alt90=5;
                }
                break;
            case FLOATNUM:
                {
                alt90=6;
                }
                break;
            case TRUE:
                {
                alt90=7;
                }
                break;
            case FALSE:
                {
                alt90=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 90, 0, input);

                throw nvae;

            }

            switch (alt90) {
                case 1 :
                    // Haxe.g:556:9: LONGLITERAL
                    {
                    LONGLITERAL432=(Token)match(input,LONGLITERAL,FOLLOW_LONGLITERAL_in_elementarySymbol5521); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LONGLITERAL.add(LONGLITERAL432);


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
                    // 556:24: -> LONGLITERAL[$LONGLITERAL, \"INT\"]
                    {
                        adaptor.addChild(root_0, 
                        new ConstantNode(LONGLITERAL, LONGLITERAL432, "INT")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // Haxe.g:557:9: NULL
                    {
                    NULL433=(Token)match(input,NULL,FOLLOW_NULL_in_elementarySymbol5542); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NULL.add(NULL433);


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
                    // 557:14: -> ^( NULL[$NULL,\"Unknown<0>\"] )
                    {
                        // Haxe.g:557:17: ^( NULL[$NULL,\"Unknown<0>\"] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        new ConstantNode(NULL, NULL433, "Unknown<0>")
                        , root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 3 :
                    // Haxe.g:558:9: INTLITERAL
                    {
                    INTLITERAL434=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_elementarySymbol5562); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INTLITERAL.add(INTLITERAL434);


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
                    // 558:23: -> INTLITERAL[$INTLITERAL, \"INT\"]
                    {
                        adaptor.addChild(root_0, 
                        new ConstantNode(INTLITERAL, INTLITERAL434, "INT")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 4 :
                    // Haxe.g:559:9: STRINGLITERAL
                    {
                    STRINGLITERAL435=(Token)match(input,STRINGLITERAL,FOLLOW_STRINGLITERAL_in_elementarySymbol5583); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STRINGLITERAL.add(STRINGLITERAL435);


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
                    // 559:26: -> STRINGLITERAL[$STRINGLITERAL,\"STRING\"]
                    {
                        adaptor.addChild(root_0, 
                        new ConstantNode(STRINGLITERAL, STRINGLITERAL435, "STRING")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 5 :
                    // Haxe.g:560:9: CHARLITERAL
                    {
                    CHARLITERAL436=(Token)match(input,CHARLITERAL,FOLLOW_CHARLITERAL_in_elementarySymbol5604); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CHARLITERAL.add(CHARLITERAL436);


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
                    // 560:24: -> CHARLITERAL[$CHARLITERAL, \"STRING\"]
                    {
                        adaptor.addChild(root_0, 
                        new ConstantNode(CHARLITERAL, CHARLITERAL436, "STRING")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 6 :
                    // Haxe.g:561:9: FLOATNUM
                    {
                    FLOATNUM437=(Token)match(input,FLOATNUM,FOLLOW_FLOATNUM_in_elementarySymbol5625); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FLOATNUM.add(FLOATNUM437);


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
                    // 561:21: -> FLOATNUM[$FLOATNUM, \"FLOAT\"]
                    {
                        adaptor.addChild(root_0, 
                        new ConstantNode(FLOATNUM, FLOATNUM437, "FLOAT")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 7 :
                    // Haxe.g:562:9: TRUE
                    {
                    TRUE438=(Token)match(input,TRUE,FOLLOW_TRUE_in_elementarySymbol5646); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TRUE.add(TRUE438);


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
                    // 562:21: -> TRUE[$TRUE,\"BOOL\"]
                    {
                        adaptor.addChild(root_0, 
                        new ConstantNode(TRUE, TRUE438, "BOOL")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 8 :
                    // Haxe.g:563:9: FALSE
                    {
                    FALSE439=(Token)match(input,FALSE,FOLLOW_FALSE_in_elementarySymbol5671); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FALSE.add(FALSE439);


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
                    // 563:22: -> FALSE[$FALSE,\"BOOL\"]
                    {
                        adaptor.addChild(root_0, 
                        new ConstantNode(FALSE, FALSE439, "BOOL")
                        );

                    }


                    retval.tree = root_0;
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
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 91, elementarySymbol_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "elementarySymbol"

    // $ANTLR start synpred28_Haxe
    public final void synpred28_Haxe_fragment() throws RecognitionException {
        // Haxe.g:153:44: ( typeTagOpt )
        // Haxe.g:153:44: typeTagOpt
        {
        pushFollow(FOLLOW_typeTagOpt_in_synpred28_Haxe947);
        typeTagOpt();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred28_Haxe

    // $ANTLR start synpred34_Haxe
    public final void synpred34_Haxe_fragment() throws RecognitionException {
        // Haxe.g:197:10: ( ( type ) ( MINUS_BIGGER type )* )
        // Haxe.g:197:10: ( type ) ( MINUS_BIGGER type )*
        {
        // Haxe.g:197:10: ( type )
        // Haxe.g:197:11: type
        {
        pushFollow(FOLLOW_type_in_synpred34_Haxe1152);
        type();

        state._fsp--;
        if (state.failed) return ;

        }


        // Haxe.g:197:17: ( MINUS_BIGGER type )*
        loop93:
        do {
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==MINUS_BIGGER) ) {
                alt93=1;
            }


            switch (alt93) {
        	case 1 :
        	    // Haxe.g:197:18: MINUS_BIGGER type
        	    {
        	    match(input,MINUS_BIGGER,FOLLOW_MINUS_BIGGER_in_synpred34_Haxe1156); if (state.failed) return ;

        	    pushFollow(FOLLOW_type_in_synpred34_Haxe1159);
        	    type();

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
    // $ANTLR end synpred34_Haxe

    // $ANTLR start synpred41_Haxe
    public final void synpred41_Haxe_fragment() throws RecognitionException {
        // Haxe.g:205:57: ( typeParam )
        // Haxe.g:205:57: typeParam
        {
        pushFollow(FOLLOW_typeParam_in_synpred41_Haxe1248);
        typeParam();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred41_Haxe

    // $ANTLR start synpred42_Haxe
    public final void synpred42_Haxe_fragment() throws RecognitionException {
        // Haxe.g:205:14: ( ( anonType | dotIdent | primitiveType ) ( typeParam )* )
        // Haxe.g:205:14: ( anonType | dotIdent | primitiveType ) ( typeParam )*
        {
        // Haxe.g:205:14: ( anonType | dotIdent | primitiveType )
        int alt94=3;
        switch ( input.LA(1) ) {
        case LBRACE:
            {
            alt94=1;
            }
            break;
        case IDENTIFIER:
        case THIS:
            {
            alt94=2;
            }
            break;
        case BOOLEAN:
        case DYNAMIC:
        case FLOAT:
        case INT:
        case VOID:
            {
            alt94=3;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 94, 0, input);

            throw nvae;

        }

        switch (alt94) {
            case 1 :
                // Haxe.g:205:15: anonType
                {
                pushFollow(FOLLOW_anonType_in_synpred42_Haxe1232);
                anonType();

                state._fsp--;
                if (state.failed) return ;

                }
                break;
            case 2 :
                // Haxe.g:205:27: dotIdent
                {
                pushFollow(FOLLOW_dotIdent_in_synpred42_Haxe1237);
                dotIdent();

                state._fsp--;
                if (state.failed) return ;

                }
                break;
            case 3 :
                // Haxe.g:205:39: primitiveType
                {
                pushFollow(FOLLOW_primitiveType_in_synpred42_Haxe1242);
                primitiveType();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        // Haxe.g:205:56: ( typeParam )*
        loop95:
        do {
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==LT) ) {
                alt95=1;
            }


            switch (alt95) {
        	case 1 :
        	    // Haxe.g:205:57: typeParam
        	    {
        	    pushFollow(FOLLOW_typeParam_in_synpred42_Haxe1248);
        	    typeParam();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop95;
            }
        } while (true);


        }

    }
    // $ANTLR end synpred42_Haxe

    // $ANTLR start synpred43_Haxe
    public final void synpred43_Haxe_fragment() throws RecognitionException {
        // Haxe.g:210:10: ( LT typeList GT )
        // Haxe.g:210:10: LT typeList GT
        {
        match(input,LT,FOLLOW_LT_in_synpred43_Haxe1296); if (state.failed) return ;

        pushFollow(FOLLOW_typeList_in_synpred43_Haxe1299);
        typeList();

        state._fsp--;
        if (state.failed) return ;

        match(input,GT,FOLLOW_GT_in_synpred43_Haxe1301); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred43_Haxe

    // $ANTLR start synpred44_Haxe
    public final void synpred44_Haxe_fragment() throws RecognitionException {
        // Haxe.g:211:10: ( LT typeList LT typeList GTGT )
        // Haxe.g:211:10: LT typeList LT typeList GTGT
        {
        match(input,LT,FOLLOW_LT_in_synpred44_Haxe1313); if (state.failed) return ;

        pushFollow(FOLLOW_typeList_in_synpred44_Haxe1316);
        typeList();

        state._fsp--;
        if (state.failed) return ;

        match(input,LT,FOLLOW_LT_in_synpred44_Haxe1318); if (state.failed) return ;

        pushFollow(FOLLOW_typeList_in_synpred44_Haxe1321);
        typeList();

        state._fsp--;
        if (state.failed) return ;

        match(input,GTGT,FOLLOW_GTGT_in_synpred44_Haxe1323); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred44_Haxe

    // $ANTLR start synpred45_Haxe
    public final void synpred45_Haxe_fragment() throws RecognitionException {
        // Haxe.g:217:10: ( typeParam )
        // Haxe.g:217:10: typeParam
        {
        pushFollow(FOLLOW_typeParam_in_synpred45_Haxe1382);
        typeParam();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred45_Haxe

    // $ANTLR start synpred47_Haxe
    public final void synpred47_Haxe_fragment() throws RecognitionException {
        // Haxe.g:231:10: ( block )
        // Haxe.g:231:10: block
        {
        pushFollow(FOLLOW_block_in_synpred47_Haxe1541);
        block();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred47_Haxe

    // $ANTLR start synpred48_Haxe
    public final void synpred48_Haxe_fragment() throws RecognitionException {
        // Haxe.g:232:10: ( assignExpr SEMI )
        // Haxe.g:232:10: assignExpr SEMI
        {
        pushFollow(FOLLOW_assignExpr_in_synpred48_Haxe1552);
        assignExpr();

        state._fsp--;
        if (state.failed) return ;

        match(input,SEMI,FOLLOW_SEMI_in_synpred48_Haxe1554); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred48_Haxe

    // $ANTLR start synpred50_Haxe
    public final void synpred50_Haxe_fragment() throws RecognitionException {

        // Haxe.g:235:12: ( ELSE s2= statement )
        // Haxe.g:235:12: ELSE s2= statement
        {
        match(input,ELSE,FOLLOW_ELSE_in_synpred50_Haxe1596); if (state.failed) return ;

        pushFollow(FOLLOW_statement_in_synpred50_Haxe1600);
        statement();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred50_Haxe

    // $ANTLR start synpred65_Haxe
    public final void synpred65_Haxe_fragment() throws RecognitionException {
        // Haxe.g:247:10: ( expr SEMI )
        // Haxe.g:247:10: expr SEMI
        {
        pushFollow(FOLLOW_expr_in_synpred65_Haxe2094);
        expr();

        state._fsp--;
        if (state.failed) return ;

        match(input,SEMI,FOLLOW_SEMI_in_synpred65_Haxe2097); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred65_Haxe

    // $ANTLR start synpred66_Haxe
    public final void synpred66_Haxe_fragment() throws RecognitionException {
        // Haxe.g:248:10: ( IDENTIFIER COLON statement )
        // Haxe.g:248:10: IDENTIFIER COLON statement
        {
        match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_synpred66_Haxe2109); if (state.failed) return ;

        match(input,COLON,FOLLOW_COLON_in_synpred66_Haxe2111); if (state.failed) return ;

        pushFollow(FOLLOW_statement_in_synpred66_Haxe2113);
        statement();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred66_Haxe

    // $ANTLR start synpred69_Haxe
    public final void synpred69_Haxe_fragment() throws RecognitionException {
        // Haxe.g:261:10: ( varDecl )
        // Haxe.g:261:10: varDecl
        {
        pushFollow(FOLLOW_varDecl_in_synpred69_Haxe2271);
        varDecl();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred69_Haxe

    // $ANTLR start synpred70_Haxe
    public final void synpred70_Haxe_fragment() throws RecognitionException {
        // Haxe.g:262:10: ( classDecl )
        // Haxe.g:262:10: classDecl
        {
        pushFollow(FOLLOW_classDecl_in_synpred70_Haxe2282);
        classDecl();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred70_Haxe

    // $ANTLR start synpred99_Haxe
    public final void synpred99_Haxe_fragment() throws RecognitionException {
        // Haxe.g:358:8: ( suffixExpr )
        // Haxe.g:358:8: suffixExpr
        {
        pushFollow(FOLLOW_suffixExpr_in_synpred99_Haxe3182);
        suffixExpr();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred99_Haxe

    // $ANTLR start synpred108_Haxe
    public final void synpred108_Haxe_fragment() throws RecognitionException {
        // Haxe.g:370:10: ( value methodCallOrSliceList )
        // Haxe.g:370:10: value methodCallOrSliceList
        {
        pushFollow(FOLLOW_value_in_synpred108_Haxe3279);
        value();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_methodCallOrSliceList_in_synpred108_Haxe3281);
        methodCallOrSliceList();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred108_Haxe

    // $ANTLR start synpred109_Haxe
    public final void synpred109_Haxe_fragment() throws RecognitionException {
        // Haxe.g:371:10: ( value PLUSPLUS )
        // Haxe.g:371:10: value PLUSPLUS
        {
        pushFollow(FOLLOW_value_in_synpred109_Haxe3308);
        value();

        state._fsp--;
        if (state.failed) return ;

        match(input,PLUSPLUS,FOLLOW_PLUSPLUS_in_synpred109_Haxe3310); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred109_Haxe

    // $ANTLR start synpred111_Haxe
    public final void synpred111_Haxe_fragment() throws RecognitionException {
        // Haxe.g:381:10: ( methodCallOrSlice methodCallOrSliceList )
        // Haxe.g:381:10: methodCallOrSlice methodCallOrSliceList
        {
        pushFollow(FOLLOW_methodCallOrSlice_in_synpred111_Haxe3487);
        methodCallOrSlice();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_methodCallOrSliceList_in_synpred111_Haxe3489);
        methodCallOrSliceList();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred111_Haxe

    // $ANTLR start synpred114_Haxe
    public final void synpred114_Haxe_fragment() throws RecognitionException {
        // Haxe.g:390:18: ( expr )
        // Haxe.g:390:18: expr
        {
        pushFollow(FOLLOW_expr_in_synpred114_Haxe3553);
        expr();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred114_Haxe

    // $ANTLR start synpred117_Haxe
    public final void synpred117_Haxe_fragment() throws RecognitionException {
        // Haxe.g:398:13: ( CAST LPAREN expr ( COMMA funcType )? RPAREN )
        // Haxe.g:398:13: CAST LPAREN expr ( COMMA funcType )? RPAREN
        {
        match(input,CAST,FOLLOW_CAST_in_synpred117_Haxe3639); if (state.failed) return ;

        match(input,LPAREN,FOLLOW_LPAREN_in_synpred117_Haxe3641); if (state.failed) return ;

        pushFollow(FOLLOW_expr_in_synpred117_Haxe3643);
        expr();

        state._fsp--;
        if (state.failed) return ;

        // Haxe.g:398:30: ( COMMA funcType )?
        int alt104=2;
        int LA104_0 = input.LA(1);

        if ( (LA104_0==COMMA) ) {
            alt104=1;
        }
        switch (alt104) {
            case 1 :
                // Haxe.g:398:31: COMMA funcType
                {
                match(input,COMMA,FOLLOW_COMMA_in_synpred117_Haxe3646); if (state.failed) return ;

                pushFollow(FOLLOW_funcType_in_synpred117_Haxe3648);
                funcType();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        match(input,RPAREN,FOLLOW_RPAREN_in_synpred117_Haxe3652); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred117_Haxe

    // $ANTLR start synpred118_Haxe
    public final void synpred118_Haxe_fragment() throws RecognitionException {
        // Haxe.g:406:9: ( classDecl )
        // Haxe.g:406:9: classDecl
        {
        pushFollow(FOLLOW_classDecl_in_synpred118_Haxe3751);
        classDecl();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred118_Haxe

    // $ANTLR start synpred119_Haxe
    public final void synpred119_Haxe_fragment() throws RecognitionException {
        // Haxe.g:407:9: ( interfaceDecl )
        // Haxe.g:407:9: interfaceDecl
        {
        pushFollow(FOLLOW_interfaceDecl_in_synpred119_Haxe3761);
        interfaceDecl();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred119_Haxe

    // $ANTLR start synpred120_Haxe
    public final void synpred120_Haxe_fragment() throws RecognitionException {
        // Haxe.g:408:9: ( enumDecl )
        // Haxe.g:408:9: enumDecl
        {
        pushFollow(FOLLOW_enumDecl_in_synpred120_Haxe3771);
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


    protected DFA78 dfa78 = new DFA78(this);
    protected DFA79 dfa79 = new DFA79(this);
    protected DFA81 dfa81 = new DFA81(this);
    protected DFA82 dfa82 = new DFA82(this);
    static final String DFA78_eotS =
        "\11\uffff";
    static final String DFA78_eofS =
        "\11\uffff";
    static final String DFA78_minS =
        "\6\46\1\107\2\uffff";
    static final String DFA78_maxS =
        "\6\u0091\1\143\2\uffff";
    static final String DFA78_acceptS =
        "\7\uffff\1\1\1\2";
    static final String DFA78_specialS =
        "\11\uffff}>";
    static final String[] DFA78_transitionS = {
            "\1\3\24\uffff\1\6\22\uffff\1\2\27\uffff\1\4\33\uffff\1\5\2\uffff"+
            "\1\5\13\uffff\1\1",
            "\1\3\24\uffff\1\6\22\uffff\1\2\27\uffff\1\4\33\uffff\1\5\2"+
            "\uffff\1\5\13\uffff\1\1",
            "\1\3\24\uffff\1\6\22\uffff\1\2\27\uffff\1\4\33\uffff\1\5\2"+
            "\uffff\1\5\13\uffff\1\1",
            "\1\3\24\uffff\1\6\22\uffff\1\2\27\uffff\1\4\33\uffff\1\5\2"+
            "\uffff\1\5\13\uffff\1\1",
            "\1\3\24\uffff\1\6\22\uffff\1\2\27\uffff\1\4\33\uffff\1\5\2"+
            "\uffff\1\5\13\uffff\1\1",
            "\1\3\24\uffff\1\6\22\uffff\1\2\27\uffff\1\4\33\uffff\1\5\2"+
            "\uffff\1\5\13\uffff\1\1",
            "\1\10\33\uffff\1\7",
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
            return "459:1: funcDecl : ( ( declAttrList )? FUNCTION NEW LPAREN paramList RPAREN typeTagOpt block -> ^( FUNCTION NEW ( declAttrList )? ( paramList )? ( typeTagOpt )? ( block )? ) | ( declAttrList )? FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt block -> ^( FUNCTION IDENTIFIER ( declAttrList )? ( paramList )? ( typeTagOpt )? ( block )? ( typeParamOpt )? ) );";
        }
    }
    static final String DFA79_eotS =
        "\14\uffff";
    static final String DFA79_eofS =
        "\14\uffff";
    static final String DFA79_minS =
        "\6\46\2\107\4\uffff";
    static final String DFA79_maxS =
        "\6\u0091\2\143\4\uffff";
    static final String DFA79_acceptS =
        "\10\uffff\1\3\1\4\1\1\1\2";
    static final String DFA79_specialS =
        "\14\uffff}>";
    static final String[] DFA79_transitionS = {
            "\1\3\24\uffff\1\6\22\uffff\1\2\27\uffff\1\4\33\uffff\1\5\2\uffff"+
            "\1\5\13\uffff\1\1",
            "\1\3\24\uffff\1\7\22\uffff\1\2\27\uffff\1\4\33\uffff\1\5\2"+
            "\uffff\1\5\13\uffff\1\1",
            "\1\3\24\uffff\1\7\22\uffff\1\2\27\uffff\1\4\33\uffff\1\5\2"+
            "\uffff\1\5\13\uffff\1\1",
            "\1\3\24\uffff\1\7\22\uffff\1\2\27\uffff\1\4\33\uffff\1\5\2"+
            "\uffff\1\5\13\uffff\1\1",
            "\1\3\24\uffff\1\7\22\uffff\1\2\27\uffff\1\4\33\uffff\1\5\2"+
            "\uffff\1\5\13\uffff\1\1",
            "\1\3\24\uffff\1\7\22\uffff\1\2\27\uffff\1\4\33\uffff\1\5\2"+
            "\uffff\1\5\13\uffff\1\1",
            "\1\11\33\uffff\1\10",
            "\1\13\33\uffff\1\12",
            "",
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
            return "465:1: funcProtoDecl : ( declAttrList FUNCTION NEW LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTagOpt )? ( declAttrList )? ) | declAttrList FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTagOpt )? ( declAttrList )? ( typeParamOpt )? ) | FUNCTION NEW LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTagOpt )? ) | FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTagOpt )? ( typeParamOpt )? ) );";
        }
    }
    static final String DFA81_eotS =
        "\12\uffff";
    static final String DFA81_eofS =
        "\12\uffff";
    static final String DFA81_minS =
        "\6\46\3\uffff\1\46";
    static final String DFA81_maxS =
        "\6\u00a8\3\uffff\1\u00a8";
    static final String DFA81_acceptS =
        "\6\uffff\1\1\1\2\1\3\1\uffff";
    static final String DFA81_specialS =
        "\12\uffff}>";
    static final String[] DFA81_transitionS = {
            "\1\3\4\uffff\1\10\6\uffff\1\10\10\uffff\1\7\22\uffff\1\2\22"+
            "\uffff\1\10\4\uffff\1\4\33\uffff\1\5\2\uffff\1\11\13\uffff\1"+
            "\1\26\uffff\1\6",
            "\1\3\24\uffff\1\7\22\uffff\1\2\27\uffff\1\4\33\uffff\1\11\2"+
            "\uffff\1\11\13\uffff\1\1\26\uffff\1\6",
            "\1\3\24\uffff\1\7\22\uffff\1\2\27\uffff\1\4\33\uffff\1\11\2"+
            "\uffff\1\11\13\uffff\1\1\26\uffff\1\6",
            "\1\3\24\uffff\1\7\22\uffff\1\2\27\uffff\1\4\33\uffff\1\11\2"+
            "\uffff\1\11\13\uffff\1\1\26\uffff\1\6",
            "\1\3\24\uffff\1\7\22\uffff\1\2\27\uffff\1\4\33\uffff\1\11\2"+
            "\uffff\1\11\13\uffff\1\1\26\uffff\1\6",
            "\1\3\4\uffff\1\10\6\uffff\1\10\10\uffff\1\7\22\uffff\1\2\27"+
            "\uffff\1\4\33\uffff\1\5\2\uffff\1\11\13\uffff\1\1\26\uffff\1"+
            "\6",
            "",
            "",
            "",
            "\1\3\24\uffff\1\7\22\uffff\1\2\27\uffff\1\4\33\uffff\1\11\2"+
            "\uffff\1\11\13\uffff\1\1\26\uffff\1\6"
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
            return "485:1: classMember : ( varDecl | funcDecl | enumDecl );";
        }
    }
    static final String DFA82_eotS =
        "\11\uffff";
    static final String DFA82_eofS =
        "\1\10\10\uffff";
    static final String DFA82_minS =
        "\6\46\3\uffff";
    static final String DFA82_maxS =
        "\6\u00a8\3\uffff";
    static final String DFA82_acceptS =
        "\6\uffff\1\1\1\2\1\3";
    static final String DFA82_specialS =
        "\11\uffff}>";
    static final String[] DFA82_transitionS = {
            "\1\3\24\uffff\1\7\22\uffff\1\2\27\uffff\1\4\33\uffff\1\5\2\uffff"+
            "\1\5\1\uffff\1\10\11\uffff\1\1\26\uffff\1\6",
            "\1\3\24\uffff\1\7\22\uffff\1\2\27\uffff\1\4\33\uffff\1\5\2"+
            "\uffff\1\5\13\uffff\1\1\26\uffff\1\6",
            "\1\3\24\uffff\1\7\22\uffff\1\2\27\uffff\1\4\33\uffff\1\5\2"+
            "\uffff\1\5\13\uffff\1\1\26\uffff\1\6",
            "\1\3\24\uffff\1\7\22\uffff\1\2\27\uffff\1\4\33\uffff\1\5\2"+
            "\uffff\1\5\13\uffff\1\1\26\uffff\1\6",
            "\1\3\24\uffff\1\7\22\uffff\1\2\27\uffff\1\4\33\uffff\1\5\2"+
            "\uffff\1\5\13\uffff\1\1\26\uffff\1\6",
            "\1\3\24\uffff\1\7\22\uffff\1\2\27\uffff\1\4\33\uffff\1\5\2"+
            "\uffff\1\5\13\uffff\1\1\26\uffff\1\6",
            "",
            "",
            ""
    };

    static final short[] DFA82_eot = DFA.unpackEncodedString(DFA82_eotS);
    static final short[] DFA82_eof = DFA.unpackEncodedString(DFA82_eofS);
    static final char[] DFA82_min = DFA.unpackEncodedStringToUnsignedChars(DFA82_minS);
    static final char[] DFA82_max = DFA.unpackEncodedStringToUnsignedChars(DFA82_maxS);
    static final short[] DFA82_accept = DFA.unpackEncodedString(DFA82_acceptS);
    static final short[] DFA82_special = DFA.unpackEncodedString(DFA82_specialS);
    static final short[][] DFA82_transition;

    static {
        int numStates = DFA82_transitionS.length;
        DFA82_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA82_transition[i] = DFA.unpackEncodedString(DFA82_transitionS[i]);
        }
    }

    class DFA82 extends DFA {

        public DFA82(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 82;
            this.eot = DFA82_eot;
            this.eof = DFA82_eof;
            this.min = DFA82_min;
            this.max = DFA82_max;
            this.accept = DFA82_accept;
            this.special = DFA82_special;
            this.transition = DFA82_transition;
        }
        public String getDescription() {
            return "496:1: interfaceBody : ( varDecl interfaceBody | funcProtoDecl interfaceBody |);";
        }
    }
 

    public static final BitSet FOLLOW_myPackage_in_module180 = new BitSet(new long[]{0x0004080008000000L,0x0000000200020800L,0x0000008400000004L});
    public static final BitSet FOLLOW_topLevelList_in_module183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_topLevel_in_topLevelList221 = new BitSet(new long[]{0x0004080008000002L,0x0000000200020800L,0x0000008400000004L});
    public static final BitSet FOLLOW_myImport_in_topLevel240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_topLevelDecl_in_topLevel249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PACKAGE_in_myPackage266 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L,0x0000000004000000L});
    public static final BitSet FOLLOW_dotIdent_in_myPackage268 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_SEMI_in_myPackage270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MONKEYS_AT_in_meta295 = new BitSet(new long[]{0x0100004010020000L,0x0000000000010080L,0x0000040000000000L});
    public static final BitSet FOLLOW_metaName_in_meta297 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_meta300 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L,0x0000000000000440L});
    public static final BitSet FOLLOW_paramList_in_meta302 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RPAREN_in_meta304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_metaName323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveType_in_metaName331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_in_metaName340 = new BitSet(new long[]{0x0100004010020000L,0x0000000000010080L,0x0000040000000000L});
    public static final BitSet FOLLOW_metaName_in_metaName342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_meta_in_typeDeclFlags360 = new BitSet(new long[]{0x0004000000000002L,0x0000000200000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_qualifiedIdentifier395 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_DOT_in_qualifiedIdentifier406 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_IDENTIFIER_in_qualifiedIdentifier410 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_IMPORT_in_myImport448 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L,0x0000000004000000L});
    public static final BitSet FOLLOW_dotIdent_in_myImport451 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_SEMI_in_myImport453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_USING_in_myImport462 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L,0x0000000004000000L});
    public static final BitSet FOLLOW_dotIdent_in_myImport465 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_SEMI_in_myImport467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STATIC_in_declAttr511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INLINE_in_declAttr519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DYNAMIC_in_declAttr527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OVERRIDE_in_declAttr535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_access_in_declAttr543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttr_in_declAttrList561 = new BitSet(new long[]{0x0000004000000002L,0x0000004000004000L,0x0000000000020024L});
    public static final BitSet FOLLOW_param_in_paramList593 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_COMMA_in_paramList596 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L,0x0000000000000040L});
    public static final BitSet FOLLOW_param_in_paramList598 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_QUES_in_param636 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_IDENTIFIER_in_param639 = new BitSet(new long[]{0x0000100010000000L});
    public static final BitSet FOLLOW_typeTagOpt_in_param641 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_varInit_in_param643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_id689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIS_in_id709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_dotIdent738 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_DOT_in_dotIdent740 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L,0x0000000004000000L});
    public static final BitSet FOLLOW_dotIdent_in_dotIdent744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_dotIdent771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQ_in_assignOp795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUSEQ_in_assignOp821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUBEQ_in_assignOp844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SLASHEQ_in_assignOp866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PERCENTEQ_in_assignOp888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AMPEQ_in_assignOp910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_in_funcLit939 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_funcLit941 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L,0x0000000000000440L});
    public static final BitSet FOLLOW_paramList_in_funcLit943 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RPAREN_in_funcLit945 = new BitSet(new long[]{0x0000000010000000L,0x0000000000200000L,0x0000000000000800L});
    public static final BitSet FOLLOW_typeTagOpt_in_funcLit947 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L,0x0000000000000800L});
    public static final BitSet FOLLOW_block_in_funcLit950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACKET_in_arrayLit987 = new BitSet(new long[]{0x0A20000004800200L,0x0014001803240080L,0x00000040A4580100L});
    public static final BitSet FOLLOW_exprListOpt_in_arrayLit990 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_RBRACKET_in_arrayLit992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_in_typeTag1024 = new BitSet(new long[]{0x0100004000020000L,0x0000000080210080L,0x0000040004000000L});
    public static final BitSet FOLLOW_funcType_in_typeTag1027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeTag_in_typeTagOpt1055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_typeList1098 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_COMMA_in_typeList1101 = new BitSet(new long[]{0x0100004020020000L,0x0000000000210080L,0x0000040004000000L});
    public static final BitSet FOLLOW_type_in_typeList1104 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_typeConstraint_in_typeList1121 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_COMMA_in_typeList1124 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_typeConstraint_in_typeList1127 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_type_in_funcType1152 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000000L});
    public static final BitSet FOLLOW_MINUS_BIGGER_in_funcType1156 = new BitSet(new long[]{0x0100004000020000L,0x0000000080210080L,0x0000040004000000L});
    public static final BitSet FOLLOW_type_in_funcType1159 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000000L});
    public static final BitSet FOLLOW_VOID_in_funcType1172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_anonType_in_type1232 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000000L});
    public static final BitSet FOLLOW_dotIdent_in_type1237 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000000L});
    public static final BitSet FOLLOW_primitiveType_in_type1242 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000000L});
    public static final BitSet FOLLOW_typeParam_in_type1248 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000000L});
    public static final BitSet FOLLOW_LT_in_typeParam1296 = new BitSet(new long[]{0x0100004020020000L,0x0000000000210080L,0x0000040004000000L});
    public static final BitSet FOLLOW_typeList_in_typeParam1299 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_GT_in_typeParam1301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_in_typeParam1313 = new BitSet(new long[]{0x0100004020020000L,0x0000000000210080L,0x0000040004000000L});
    public static final BitSet FOLLOW_typeList_in_typeParam1316 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_LT_in_typeParam1318 = new BitSet(new long[]{0x0100004020020000L,0x0000000000210080L,0x0000040004000000L});
    public static final BitSet FOLLOW_typeList_in_typeParam1321 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_GTGT_in_typeParam1323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_in_typeParam1335 = new BitSet(new long[]{0x0100004020020000L,0x0000000000210080L,0x0000040004000000L});
    public static final BitSet FOLLOW_typeList_in_typeParam1338 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_LT_in_typeParam1340 = new BitSet(new long[]{0x0100004020020000L,0x0000000000210080L,0x0000040004000000L});
    public static final BitSet FOLLOW_typeList_in_typeParam1343 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_LT_in_typeParam1345 = new BitSet(new long[]{0x0100004020020000L,0x0000000000210080L,0x0000040004000000L});
    public static final BitSet FOLLOW_typeList_in_typeParam1348 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_GTGTGT_in_typeParam1350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeParam_in_typeParamOpt1382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_typeConstraint1431 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_COLON_in_typeConstraint1433 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_typeConstraint1435 = new BitSet(new long[]{0x0100004020020000L,0x0000000000210080L,0x0000040004000000L});
    public static final BitSet FOLLOW_typeList_in_typeConstraint1437 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RPAREN_in_typeConstraint1439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttrList_in_functionReturn1477 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_FUNCTION_in_functionReturn1480 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_NEW_in_functionReturn1482 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_functionReturn1484 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L,0x0000000000000440L});
    public static final BitSet FOLLOW_paramList_in_functionReturn1486 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RPAREN_in_functionReturn1488 = new BitSet(new long[]{0x0000000010000000L,0x0000000000200000L,0x0000000000000800L});
    public static final BitSet FOLLOW_typeTagOpt_in_functionReturn1490 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L,0x0000000000000800L});
    public static final BitSet FOLLOW_block_in_functionReturn1492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_statement1541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignExpr_in_statement1552 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_SEMI_in_statement1554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDecl_in_statement1566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_statement1577 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_parExpression_in_statement1579 = new BitSet(new long[]{0x0E20004904840200L,0x0014005803244180L,0x00001141AE5A0A24L});
    public static final BitSet FOLLOW_statement_in_statement1583 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_ELSE_in_statement1596 = new BitSet(new long[]{0x0E20004904840200L,0x0014005803244180L,0x00001141AE5A0A24L});
    public static final BitSet FOLLOW_statement_in_statement1600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_statement1682 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_statement1684 = new BitSet(new long[]{0x0A20000004800200L,0x0014001803240080L,0x00000040A4580000L});
    public static final BitSet FOLLOW_expr_in_statement1688 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_IN_in_statement1690 = new BitSet(new long[]{0x0A20000004800200L,0x0014001803240080L,0x00000040A4580000L});
    public static final BitSet FOLLOW_expr_in_statement1694 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RPAREN_in_statement1696 = new BitSet(new long[]{0x0E20004904840200L,0x0014005803244180L,0x00001141AE5A0A24L});
    public static final BitSet FOLLOW_statement_in_statement1698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_statement1735 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_parExpression_in_statement1737 = new BitSet(new long[]{0x0E20004904840200L,0x0014005803244180L,0x00001141AE5A0A24L});
    public static final BitSet FOLLOW_statement_in_statement1739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DO_in_statement1781 = new BitSet(new long[]{0x0E20004904840200L,0x0014005803244180L,0x00001141AE5A0A24L});
    public static final BitSet FOLLOW_statement_in_statement1783 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_WHILE_in_statement1785 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_parExpression_in_statement1787 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_SEMI_in_statement1789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRY_in_statement1827 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L,0x0000000000000800L});
    public static final BitSet FOLLOW_block_in_statement1829 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_catchStmtList_in_statement1831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SWITCH_in_statement1873 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_statement1875 = new BitSet(new long[]{0x0A20000004800200L,0x0014001803240080L,0x00000040A4580000L});
    public static final BitSet FOLLOW_expr_in_statement1877 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RPAREN_in_statement1879 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_LBRACE_in_statement1881 = new BitSet(new long[]{0x0000000400400000L});
    public static final BitSet FOLLOW_caseStmt_in_statement1883 = new BitSet(new long[]{0x0000000400400000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_RBRACE_in_statement1886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_statement1916 = new BitSet(new long[]{0x0A20000004800200L,0x0014001803240080L,0x00000040A4580800L});
    public static final BitSet FOLLOW_expr_in_statement1919 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_SEMI_in_statement1923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THROW_in_statement1965 = new BitSet(new long[]{0x0A20000004800200L,0x0014001803240080L,0x00000040A4580000L});
    public static final BitSet FOLLOW_expr_in_statement1967 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_SEMI_in_statement1969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BREAK_in_statement2009 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L,0x0000000000000800L});
    public static final BitSet FOLLOW_IDENTIFIER_in_statement2012 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_SEMI_in_statement2016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONTINUE_in_statement2051 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L,0x0000000000000800L});
    public static final BitSet FOLLOW_IDENTIFIER_in_statement2054 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_SEMI_in_statement2058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_statement2094 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_SEMI_in_statement2097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_statement2109 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_COLON_in_statement2111 = new BitSet(new long[]{0x0E20004904840200L,0x0014005803244180L,0x00001141AE5A0A24L});
    public static final BitSet FOLLOW_statement_in_statement2113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMI_in_statement2152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_parExpression2176 = new BitSet(new long[]{0x0A20000004800200L,0x0014001803240080L,0x00000040A4580000L});
    public static final BitSet FOLLOW_expr_in_parExpression2179 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RPAREN_in_parExpression2181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_block2200 = new BitSet(new long[]{0x0E2400490C840200L,0x0014005A03244180L,0x00001141AE5A0AA4L});
    public static final BitSet FOLLOW_blockStmt_in_block2203 = new BitSet(new long[]{0x0E2400490C840200L,0x0014005A03244180L,0x00001141AE5A0AA4L});
    public static final BitSet FOLLOW_RBRACE_in_block2207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMI_in_block2242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDecl_in_blockStmt2271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classDecl_in_blockStmt2282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_blockStmt2293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BREAK_in_breakStmt2317 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_SEMI_in_breakStmt2319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONTINUE_in_continueStmt2344 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_SEMI_in_continueStmt2346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CASE_in_caseStmt2371 = new BitSet(new long[]{0x0A20000004800200L,0x0014001803240080L,0x00000040A4580000L});
    public static final BitSet FOLLOW_exprList_in_caseStmt2373 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_COLON_in_caseStmt2375 = new BitSet(new long[]{0x0E20004904840200L,0x0014005803244180L,0x00001141AE5A0A24L});
    public static final BitSet FOLLOW_statement_in_caseStmt2377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_caseStmt2401 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_COLON_in_caseStmt2403 = new BitSet(new long[]{0x0E20004904840200L,0x0014005803244180L,0x00001141AE5A0A24L});
    public static final BitSet FOLLOW_statement_in_caseStmt2405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_defaultStmt2445 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_COLON_in_defaultStmt2447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_catchStmt_in_catchStmtList2469 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_catchStmtList_in_catchStmtList2471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CATCH_in_catchStmt2501 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_catchStmt2503 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L,0x0000000000000040L});
    public static final BitSet FOLLOW_param_in_catchStmt2505 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RPAREN_in_catchStmt2507 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L,0x0000000000000800L});
    public static final BitSet FOLLOW_block_in_catchStmt2509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprList_in_exprListOpt2547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_exprList2577 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_COMMA_in_exprList2580 = new BitSet(new long[]{0x0A20000004800200L,0x0014001803240080L,0x00000040A4580000L});
    public static final BitSet FOLLOW_expr_in_exprList2583 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_assignExpr_in_expr2609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNTYPED_in_expr2620 = new BitSet(new long[]{0x0A20000004800200L,0x0014001803240080L,0x00000000A4580000L});
    public static final BitSet FOLLOW_assignExpr_in_expr2622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iterExpr_in_assignExpr2654 = new BitSet(new long[]{0x0000100000000082L,0x0008800000000000L,0x0000000000204000L});
    public static final BitSet FOLLOW_assignOp_in_assignExpr2657 = new BitSet(new long[]{0x0A20000004800200L,0x0014001803240080L,0x00000000A4580000L});
    public static final BitSet FOLLOW_iterExpr_in_assignExpr2660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ternaryExpr_in_iterExpr2683 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_ELLIPSIS_in_iterExpr2686 = new BitSet(new long[]{0x0A20000004800200L,0x0014001803240080L,0x00000000A4580000L});
    public static final BitSet FOLLOW_ternaryExpr_in_iterExpr2692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicOrExpr_in_ternaryExpr2714 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_QUES_in_ternaryExpr2717 = new BitSet(new long[]{0x0A20000004800200L,0x0014001803240080L,0x00000040A4580000L});
    public static final BitSet FOLLOW_expr_in_ternaryExpr2723 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_COLON_in_ternaryExpr2725 = new BitSet(new long[]{0x0A20000004800200L,0x0014001803240080L,0x00000000A4580000L});
    public static final BitSet FOLLOW_logicOrExpr_in_ternaryExpr2728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicAndExpr_in_logicOrExpr2751 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_BARBAR_in_logicOrExpr2754 = new BitSet(new long[]{0x0A20000004800200L,0x0014001803240080L,0x00000000A4580000L});
    public static final BitSet FOLLOW_logicAndExpr_in_logicOrExpr2760 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_cmpExpr_in_logicAndExpr2791 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_AMPAMP_in_logicAndExpr2799 = new BitSet(new long[]{0x0A20000004800200L,0x0014001803240080L,0x00000000A4580000L});
    public static final BitSet FOLLOW_cmpExpr_in_logicAndExpr2805 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_bitExpr_in_cmpExpr2832 = new BitSet(new long[]{0x6000200000000402L,0x000000000C000000L});
    public static final BitSet FOLLOW_EQEQ_in_cmpExpr2841 = new BitSet(new long[]{0x0A20000004800200L,0x0014001803240080L,0x00000000A4580000L});
    public static final BitSet FOLLOW_BANGEQ_in_cmpExpr2856 = new BitSet(new long[]{0x0A20000004800200L,0x0014001803240080L,0x00000000A4580000L});
    public static final BitSet FOLLOW_GTEQ_in_cmpExpr2871 = new BitSet(new long[]{0x0A20000004800200L,0x0014001803240080L,0x00000000A4580000L});
    public static final BitSet FOLLOW_LTEQ_in_cmpExpr2886 = new BitSet(new long[]{0x0A20000004800200L,0x0014001803240080L,0x00000000A4580000L});
    public static final BitSet FOLLOW_GT_in_cmpExpr2901 = new BitSet(new long[]{0x0A20000004800200L,0x0014001803240080L,0x00000000A4580000L});
    public static final BitSet FOLLOW_LT_in_cmpExpr2916 = new BitSet(new long[]{0x0A20000004800200L,0x0014001803240080L,0x00000000A4580000L});
    public static final BitSet FOLLOW_bitExpr_in_cmpExpr2931 = new BitSet(new long[]{0x6000200000000402L,0x000000000C000000L});
    public static final BitSet FOLLOW_shiftExpr_in_bitExpr2959 = new BitSet(new long[]{0x0000000000101022L});
    public static final BitSet FOLLOW_BAR_in_bitExpr2964 = new BitSet(new long[]{0x0A20000004800200L,0x0014001803240080L,0x00000000A4580000L});
    public static final BitSet FOLLOW_AMP_in_bitExpr2972 = new BitSet(new long[]{0x0A20000004800200L,0x0014001803240080L,0x00000000A4580000L});
    public static final BitSet FOLLOW_CARET_in_bitExpr2980 = new BitSet(new long[]{0x0A20000004800200L,0x0014001803240080L,0x00000000A4580000L});
    public static final BitSet FOLLOW_shiftExpr_in_bitExpr2987 = new BitSet(new long[]{0x0000000000101022L});
    public static final BitSet FOLLOW_addExpr_in_shiftExpr3016 = new BitSet(new long[]{0x2000000000000002L,0x0000000010000002L});
    public static final BitSet FOLLOW_LTLT_in_shiftExpr3021 = new BitSet(new long[]{0x0A20000004800200L,0x0014001803240080L,0x00000000A4580000L});
    public static final BitSet FOLLOW_GT_in_shiftExpr3030 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_GT_in_shiftExpr3035 = new BitSet(new long[]{0x0A20000004800200L,0x0014001803240080L,0x00000000A4580000L});
    public static final BitSet FOLLOW_GTGTGT_in_shiftExpr3041 = new BitSet(new long[]{0x0A20000004800200L,0x0014001803240080L,0x00000000A4580000L});
    public static final BitSet FOLLOW_addExpr_in_shiftExpr3048 = new BitSet(new long[]{0x2000000000000002L,0x0000000010000002L});
    public static final BitSet FOLLOW_multExpr_in_addExpr3068 = new BitSet(new long[]{0x0000000000000002L,0x0004000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_PLUS_in_addExpr3073 = new BitSet(new long[]{0x0A20000004800200L,0x0014001803240080L,0x00000000A4580000L});
    public static final BitSet FOLLOW_SUB_in_addExpr3081 = new BitSet(new long[]{0x0A20000004800200L,0x0014001803240080L,0x00000000A4580000L});
    public static final BitSet FOLLOW_multExpr_in_addExpr3088 = new BitSet(new long[]{0x0000000000000002L,0x0004000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_psExpr_in_multExpr3115 = new BitSet(new long[]{0x0000000000000002L,0x0000020000000000L,0x000000000000A000L});
    public static final BitSet FOLLOW_STAR_in_multExpr3120 = new BitSet(new long[]{0x0A20000004800200L,0x0014001803240080L,0x00000000A4580000L});
    public static final BitSet FOLLOW_SLASH_in_multExpr3127 = new BitSet(new long[]{0x0A20000004800200L,0x0014001803240080L,0x00000000A4580000L});
    public static final BitSet FOLLOW_PERCENT_in_multExpr3134 = new BitSet(new long[]{0x0A20000004800200L,0x0014001803240080L,0x00000000A4580000L});
    public static final BitSet FOLLOW_psExpr_in_multExpr3141 = new BitSet(new long[]{0x0000000000000002L,0x0000020000000000L,0x000000000000A000L});
    public static final BitSet FOLLOW_prefixExpr_in_psExpr3173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_suffixExpr_in_psExpr3182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_psExpr3192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_prefixExpr3214 = new BitSet(new long[]{0x0220000004000000L,0x0000001003240080L,0x0000000084080000L});
    public static final BitSet FOLLOW_value_in_prefixExpr3229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_newExpr_in_prefixExpr3234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cast_in_prefixExpr3243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcLit_in_prefixExpr3257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_suffixExpr3279 = new BitSet(new long[]{0x0000000000000000L,0x0000000002400000L});
    public static final BitSet FOLLOW_methodCallOrSliceList_in_suffixExpr3281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_suffixExpr3308 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_PLUSPLUS_in_suffixExpr3310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_suffixExpr3349 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_SUBSUB_in_suffixExpr3351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_methodCallOrSlice3398 = new BitSet(new long[]{0x0A20000004800200L,0x0014001803240080L,0x00000040A4580400L});
    public static final BitSet FOLLOW_exprListOpt_in_methodCallOrSlice3400 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RPAREN_in_methodCallOrSlice3402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACKET_in_methodCallOrSlice3438 = new BitSet(new long[]{0x0A20000004800200L,0x0014001803240080L,0x00000040A4580000L});
    public static final BitSet FOLLOW_expr_in_methodCallOrSlice3440 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_RBRACKET_in_methodCallOrSlice3442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_methodCallOrSlice_in_methodCallOrSliceList3487 = new BitSet(new long[]{0x0000000000000000L,0x0000000002400000L});
    public static final BitSet FOLLOW_methodCallOrSliceList_in_methodCallOrSliceList3489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_methodCallOrSlice_in_methodCallOrSliceList3500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objLit_in_value3529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_elementarySymbol_in_value3539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_value3549 = new BitSet(new long[]{0x0E20004904840200L,0x0014005803244180L,0x00001141AE5A0A24L});
    public static final BitSet FOLLOW_expr_in_value3553 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_statement_in_value3555 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RPAREN_in_value3558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dotIdent_in_value3569 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_typeParamOpt_in_value3571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEW_in_newExpr3601 = new BitSet(new long[]{0x0100004000020000L,0x0000000002210080L,0x0000040004000000L});
    public static final BitSet FOLLOW_type_in_newExpr3603 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_newExpr3605 = new BitSet(new long[]{0x0A20000004800200L,0x0014001803240080L,0x00000040A4580400L});
    public static final BitSet FOLLOW_exprListOpt_in_newExpr3607 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RPAREN_in_newExpr3609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CAST_in_cast3639 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_cast3641 = new BitSet(new long[]{0x0A20000004800200L,0x0014001803240080L,0x00000040A4580000L});
    public static final BitSet FOLLOW_expr_in_cast3643 = new BitSet(new long[]{0x0000000020000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_COMMA_in_cast3646 = new BitSet(new long[]{0x0100004000020000L,0x0000000080210080L,0x0000040004000000L});
    public static final BitSet FOLLOW_funcType_in_cast3648 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RPAREN_in_cast3652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CAST_in_cast3680 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_cast3682 = new BitSet(new long[]{0x0A20000004800200L,0x0014001803240080L,0x00000040A4580000L});
    public static final BitSet FOLLOW_expr_in_cast3684 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RPAREN_in_cast3686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classDecl_in_topLevelDecl3751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interfaceDecl_in_topLevelDecl3761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumDecl_in_topLevelDecl3771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typedefDecl_in_topLevelDecl3781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeDeclFlags_in_enumDecl3799 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_ENUM_in_enumDecl3801 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_IDENTIFIER_in_enumDecl3803 = new BitSet(new long[]{0x0000000000000000L,0x0000000004200000L});
    public static final BitSet FOLLOW_typeParamOpt_in_enumDecl3805 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_enumBody_in_enumDecl3807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_enumBody3840 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L,0x0000000000000080L});
    public static final BitSet FOLLOW_enumValueDecl_in_enumBody3843 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L,0x0000000000000080L});
    public static final BitSet FOLLOW_RBRACE_in_enumBody3847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_enumValueDecl3906 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_enumValueDecl3908 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L,0x0000000000000440L});
    public static final BitSet FOLLOW_paramList_in_enumValueDecl3910 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RPAREN_in_enumValueDecl3912 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_SEMI_in_enumValueDecl3914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_enumValueDecl3948 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_SEMI_in_enumValueDecl3950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDecl_in_varDeclList4010 = new BitSet(new long[]{0x0000004000000000L,0x0000004000004000L,0x0000010000020024L});
    public static final BitSet FOLLOW_varDeclList_in_varDeclList4012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttrList_in_varDecl4028 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_VAR_in_varDecl4032 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_varDeclPartList_in_varDecl4034 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_SEMI_in_varDecl4036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDeclPart_in_varDeclPartList4082 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_COMMA_in_varDeclPartList4085 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_varDeclPart_in_varDeclPartList4088 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_varDeclPart4109 = new BitSet(new long[]{0x0000100010000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_propDeclOpt_in_varDeclPart4114 = new BitSet(new long[]{0x0000100010000000L});
    public static final BitSet FOLLOW_typeTagOpt_in_varDeclPart4116 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_varInit_in_varDeclPart4118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_propDecl4132 = new BitSet(new long[]{0x0000004400000000L,0x0000001000000080L});
    public static final BitSet FOLLOW_propAccessor_in_propDecl4136 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_COMMA_in_propDecl4138 = new BitSet(new long[]{0x0000004400000000L,0x0000001000000080L});
    public static final BitSet FOLLOW_propAccessor_in_propDecl4142 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RPAREN_in_propDecl4144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_propDecl_in_propDeclOpt4264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQ_in_varInit4289 = new BitSet(new long[]{0x0A20000004800200L,0x0014001803240080L,0x00000040A4580000L});
    public static final BitSet FOLLOW_expr_in_varInit4291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttrList_in_funcDecl4339 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_FUNCTION_in_funcDecl4342 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_NEW_in_funcDecl4344 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_funcDecl4346 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L,0x0000000000000440L});
    public static final BitSet FOLLOW_paramList_in_funcDecl4348 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RPAREN_in_funcDecl4350 = new BitSet(new long[]{0x0000000010000000L,0x0000000000200000L,0x0000000000000800L});
    public static final BitSet FOLLOW_typeTagOpt_in_funcDecl4352 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L,0x0000000000000800L});
    public static final BitSet FOLLOW_block_in_funcDecl4354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttrList_in_funcDecl4409 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_FUNCTION_in_funcDecl4412 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_IDENTIFIER_in_funcDecl4414 = new BitSet(new long[]{0x0000000000000000L,0x0000000006000000L});
    public static final BitSet FOLLOW_typeParamOpt_in_funcDecl4416 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_funcDecl4418 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L,0x0000000000000440L});
    public static final BitSet FOLLOW_paramList_in_funcDecl4420 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RPAREN_in_funcDecl4422 = new BitSet(new long[]{0x0000000010000000L,0x0000000000200000L,0x0000000000000800L});
    public static final BitSet FOLLOW_typeTagOpt_in_funcDecl4424 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L,0x0000000000000800L});
    public static final BitSet FOLLOW_block_in_funcDecl4426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttrList_in_funcProtoDecl4496 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_FUNCTION_in_funcProtoDecl4498 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_NEW_in_funcProtoDecl4500 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_funcProtoDecl4502 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L,0x0000000000000440L});
    public static final BitSet FOLLOW_paramList_in_funcProtoDecl4504 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RPAREN_in_funcProtoDecl4506 = new BitSet(new long[]{0x0000000010000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_typeTagOpt_in_funcProtoDecl4508 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_SEMI_in_funcProtoDecl4510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttrList_in_funcProtoDecl4551 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_FUNCTION_in_funcProtoDecl4553 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_IDENTIFIER_in_funcProtoDecl4555 = new BitSet(new long[]{0x0000000000000000L,0x0000000006000000L});
    public static final BitSet FOLLOW_typeParamOpt_in_funcProtoDecl4557 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_funcProtoDecl4559 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L,0x0000000000000440L});
    public static final BitSet FOLLOW_paramList_in_funcProtoDecl4561 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RPAREN_in_funcProtoDecl4563 = new BitSet(new long[]{0x0000000010000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_typeTagOpt_in_funcProtoDecl4565 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_SEMI_in_funcProtoDecl4567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_in_funcProtoDecl4611 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_NEW_in_funcProtoDecl4613 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_funcProtoDecl4615 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L,0x0000000000000440L});
    public static final BitSet FOLLOW_paramList_in_funcProtoDecl4617 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RPAREN_in_funcProtoDecl4619 = new BitSet(new long[]{0x0000000010000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_typeTagOpt_in_funcProtoDecl4621 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_SEMI_in_funcProtoDecl4623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_in_funcProtoDecl4661 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_IDENTIFIER_in_funcProtoDecl4663 = new BitSet(new long[]{0x0000000000000000L,0x0000000006000000L});
    public static final BitSet FOLLOW_typeParamOpt_in_funcProtoDecl4665 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_funcProtoDecl4667 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L,0x0000000000000440L});
    public static final BitSet FOLLOW_paramList_in_funcProtoDecl4669 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RPAREN_in_funcProtoDecl4671 = new BitSet(new long[]{0x0000000010000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_typeTagOpt_in_funcProtoDecl4673 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_SEMI_in_funcProtoDecl4675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeDeclFlags_in_classDecl4729 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_CLASS_in_classDecl4731 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_IDENTIFIER_in_classDecl4733 = new BitSet(new long[]{0x0002000000000000L,0x0000000004200400L});
    public static final BitSet FOLLOW_typeParamOpt_in_classDecl4735 = new BitSet(new long[]{0x0002000000000000L,0x0000000000200400L});
    public static final BitSet FOLLOW_inheritListOpt_in_classDecl4737 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_classBodyScope_in_classDecl4739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_classBodyScope4795 = new BitSet(new long[]{0x0804084000000000L,0x0000004200004000L,0x00000100000200A4L});
    public static final BitSet FOLLOW_classMember_in_classBodyScope4798 = new BitSet(new long[]{0x0804084000000000L,0x0000004200004000L,0x00000100000200A4L});
    public static final BitSet FOLLOW_RBRACE_in_classBodyScope4802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDecl_in_classMember4840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcDecl_in_classMember4851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumDecl_in_classMember4863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeDeclFlags_in_interfaceDecl4892 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_INTERFACE_in_interfaceDecl4894 = new BitSet(new long[]{0x0102004000020000L,0x0000000000210480L,0x0000040004000000L});
    public static final BitSet FOLLOW_type_in_interfaceDecl4896 = new BitSet(new long[]{0x0002000000000000L,0x0000000000200400L});
    public static final BitSet FOLLOW_inheritListOpt_in_interfaceDecl4898 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_LBRACE_in_interfaceDecl4900 = new BitSet(new long[]{0x0800004000000000L,0x0000004000004000L,0x00000100000200A4L});
    public static final BitSet FOLLOW_interfaceBody_in_interfaceDecl4903 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_RBRACE_in_interfaceDecl4905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDecl_in_interfaceBody4929 = new BitSet(new long[]{0x0800004000000000L,0x0000004000004000L,0x0000010000020024L});
    public static final BitSet FOLLOW_interfaceBody_in_interfaceBody4931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcProtoDecl_in_interfaceBody4941 = new BitSet(new long[]{0x0800004000000000L,0x0000004000004000L,0x0000010000020024L});
    public static final BitSet FOLLOW_interfaceBody_in_interfaceBody4943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inherit_in_inheritList4977 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_COMMA_in_inheritList4980 = new BitSet(new long[]{0x0002000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_inherit_in_inheritList4983 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_inheritList_in_inheritListOpt5013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXTENDS_in_inherit5059 = new BitSet(new long[]{0x0100004000020000L,0x0000000000210080L,0x0000040004000000L});
    public static final BitSet FOLLOW_type_in_inherit5061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IMPLEMENTS_in_inherit5089 = new BitSet(new long[]{0x0100004000020000L,0x0000000000210080L,0x0000040004000000L});
    public static final BitSet FOLLOW_type_in_inherit5091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPEDEF_in_typedefDecl5131 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_IDENTIFIER_in_typedefDecl5133 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_EQ_in_typedefDecl5135 = new BitSet(new long[]{0x0100004000020000L,0x0000000080210080L,0x0000040004000000L});
    public static final BitSet FOLLOW_funcType_in_typedefDecl5137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GT_in_typeExtend5161 = new BitSet(new long[]{0x0100004000020000L,0x0000000080210080L,0x0000040004000000L});
    public static final BitSet FOLLOW_funcType_in_typeExtend5163 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_COMMA_in_typeExtend5165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_anonType5189 = new BitSet(new long[]{0x2000004000000000L,0x0000004000004080L,0x00000100000200A4L});
    public static final BitSet FOLLOW_anonTypeFieldList_in_anonType5223 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_varDeclList_in_anonType5242 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_typeExtend_in_anonType5261 = new BitSet(new long[]{0x0000004000000000L,0x0000004000004080L,0x00000100000200A4L});
    public static final BitSet FOLLOW_anonTypeFieldList_in_anonType5293 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_varDeclList_in_anonType5323 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_RBRACE_in_anonType5350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_anonTypeField_in_anonTypeFieldList5376 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_COMMA_in_anonTypeFieldList5379 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_anonTypeField_in_anonTypeFieldList5382 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_LBRACE_in_objLit5398 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_objLitElemList_in_objLit5401 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_RBRACE_in_objLit5403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_anonTypeField5428 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_COLON_in_anonTypeField5430 = new BitSet(new long[]{0x0100004000020000L,0x0000000080210080L,0x0000040004000000L});
    public static final BitSet FOLLOW_funcType_in_anonTypeField5433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objLitElem_in_objLitElemList5461 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_COMMA_in_objLitElemList5464 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_objLitElem_in_objLitElemList5467 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_objLitElem5493 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_COLON_in_objLitElem5495 = new BitSet(new long[]{0x0A20000004800200L,0x0014001803240080L,0x00000040A4580000L});
    public static final BitSet FOLLOW_expr_in_objLitElem5498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LONGLITERAL_in_elementarySymbol5521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_elementarySymbol5542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTLITERAL_in_elementarySymbol5562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRINGLITERAL_in_elementarySymbol5583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARLITERAL_in_elementarySymbol5604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOATNUM_in_elementarySymbol5625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_elementarySymbol5646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_elementarySymbol5671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeTagOpt_in_synpred28_Haxe947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_synpred34_Haxe1152 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000000L});
    public static final BitSet FOLLOW_MINUS_BIGGER_in_synpred34_Haxe1156 = new BitSet(new long[]{0x0100004000020000L,0x0000000080210080L,0x0000040004000000L});
    public static final BitSet FOLLOW_type_in_synpred34_Haxe1159 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000000L});
    public static final BitSet FOLLOW_typeParam_in_synpred41_Haxe1248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_anonType_in_synpred42_Haxe1232 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000000L});
    public static final BitSet FOLLOW_dotIdent_in_synpred42_Haxe1237 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000000L});
    public static final BitSet FOLLOW_primitiveType_in_synpred42_Haxe1242 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000000L});
    public static final BitSet FOLLOW_typeParam_in_synpred42_Haxe1248 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000000L});
    public static final BitSet FOLLOW_LT_in_synpred43_Haxe1296 = new BitSet(new long[]{0x0100004020020000L,0x0000000000210080L,0x0000040004000000L});
    public static final BitSet FOLLOW_typeList_in_synpred43_Haxe1299 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_GT_in_synpred43_Haxe1301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_in_synpred44_Haxe1313 = new BitSet(new long[]{0x0100004020020000L,0x0000000000210080L,0x0000040004000000L});
    public static final BitSet FOLLOW_typeList_in_synpred44_Haxe1316 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_LT_in_synpred44_Haxe1318 = new BitSet(new long[]{0x0100004020020000L,0x0000000000210080L,0x0000040004000000L});
    public static final BitSet FOLLOW_typeList_in_synpred44_Haxe1321 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_GTGT_in_synpred44_Haxe1323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeParam_in_synpred45_Haxe1382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_synpred47_Haxe1541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignExpr_in_synpred48_Haxe1552 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_SEMI_in_synpred48_Haxe1554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_synpred50_Haxe1596 = new BitSet(new long[]{0x0E20004904840200L,0x0014005803244180L,0x00001141AE5A0A24L});
    public static final BitSet FOLLOW_statement_in_synpred50_Haxe1600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_synpred65_Haxe2094 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_SEMI_in_synpred65_Haxe2097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_synpred66_Haxe2109 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_COLON_in_synpred66_Haxe2111 = new BitSet(new long[]{0x0E20004904840200L,0x0014005803244180L,0x00001141AE5A0A24L});
    public static final BitSet FOLLOW_statement_in_synpred66_Haxe2113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDecl_in_synpred69_Haxe2271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classDecl_in_synpred70_Haxe2282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_suffixExpr_in_synpred99_Haxe3182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_synpred108_Haxe3279 = new BitSet(new long[]{0x0000000000000000L,0x0000000002400000L});
    public static final BitSet FOLLOW_methodCallOrSliceList_in_synpred108_Haxe3281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_synpred109_Haxe3308 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_PLUSPLUS_in_synpred109_Haxe3310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_methodCallOrSlice_in_synpred111_Haxe3487 = new BitSet(new long[]{0x0000000000000000L,0x0000000002400000L});
    public static final BitSet FOLLOW_methodCallOrSliceList_in_synpred111_Haxe3489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_synpred114_Haxe3553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CAST_in_synpred117_Haxe3639 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_synpred117_Haxe3641 = new BitSet(new long[]{0x0A20000004800200L,0x0014001803240080L,0x00000040A4580000L});
    public static final BitSet FOLLOW_expr_in_synpred117_Haxe3643 = new BitSet(new long[]{0x0000000020000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_COMMA_in_synpred117_Haxe3646 = new BitSet(new long[]{0x0100004000020000L,0x0000000080210080L,0x0000040004000000L});
    public static final BitSet FOLLOW_funcType_in_synpred117_Haxe3648 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RPAREN_in_synpred117_Haxe3652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classDecl_in_synpred118_Haxe3751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interfaceDecl_in_synpred119_Haxe3761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumDecl_in_synpred120_Haxe3771 = new BitSet(new long[]{0x0000000000000002L});

}