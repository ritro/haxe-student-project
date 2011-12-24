// $ANTLR 3.4 Haxe.g 2011-12-24 10:59:28

package haxe.imp.parser.antlr.main;

import haxe.imp.parser.antlr.tree.HaxeTree;
import haxe.imp.parser.antlr.tree.specific.AssignOperationNode;
import haxe.imp.parser.antlr.tree.specific.BinaryExpressionNode;
import haxe.imp.parser.antlr.tree.specific.BlockScopeNode;
import haxe.imp.parser.antlr.tree.specific.ClassNode;
import haxe.imp.parser.antlr.tree.specific.UnarExpressionNode;
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ABSTRACT", "AMP", "AMPAMP", "AMPEQ", "ASSIGN_OPERATOR", "BANG", "BANGEQ", "BANGEQQ", "BAR", "BARBAR", "BAREQ", "BLOCK_SCOPE", "BOOLEAN", "BREAK", "BYTE", "CARET", "CARETEQ", "CASE", "CAST", "CATCH", "CHAR", "CHARLITERAL", "CLASS", "COLON", "COMMA", "COMMENT", "CONST", "CONTINUE", "DECL_ATTR_LIST", "DEFAULT", "DO", "DOT", "DOUBLE", "DYNAMIC", "ELLIPSIS", "ELSE", "ELSE_TOKEN", "ENDIF_TOKEN", "ENUM", "EQ", "EQEQ", "ESC_SEQ", "EXPONENT", "EXTENDS", "EXTERN", "EscapeSequence", "Exponent", "FALSE", "FINAL", "FINALLY", "FLOAT", "FLOATNUM", "FOR", "FUNCTION", "GOTO", "GT", "GTEQ", "GTGT", "GTGTEQ", "GTGTGT", "GTGTGTEQ", "HEX_DIGIT", "HexDigit", "HexPrefix", "IDENT", "IDENTIFIER", "IF", "IF_TOKEN", "IMPLEMENTS", "IMPORT", "IN", "INHERIT_LIST_OPT", "INLINE", "INSTANCEOF", "INT", "INTERFACE", "INTLITERAL", "INTNUM", "IntegerNumber", "LBRACE", "LBRACKET", "LONG", "LONGLITERAL", "LPAREN", "LT", "LTEQ", "LTLT", "LTLTEQ", "LongSuffix", "MINUS_BIGGER", "MODULE", "MONKEYS_AT", "NATIVE", "NEW", "NULL", "OCTAL_ESC", "OVERRIDE", "PACKAGE", "PARAM_LIST", "PERCENT", "PERCENTEQ", "PLUS", "PLUSEQ", "PLUSPLUS", "PP_AND_EXPRESSION", "PP_CONDITIONAL", "PP_ELSE", "PP_ELSEIF", "PP_END", "PP_ERROR", "PP_EXPRESSION", "PP_IF", "PP_OR_EXPRESSION", "PP_PRIMARY_EXPRESSION", "PP_UNARY_EXPRESSION", "PREFIX_EXPR", "PREPROCESSOR_DIRECTIVE", "PRIVATE", "PROPERTY_DECL", "PROTECTED", "PUBLIC", "QUES", "RBRACE", "RBRACKET", "RETURN", "RPAREN", "SEMI", "SHORT", "SLASH", "SLASHEQ", "STAR", "STAREQ", "STATIC", "STRICTFP", "STRINGLITERAL", "SUB", "SUBEQ", "SUBSUB", "SUFFIX_EXPR", "SUPER", "SWITCH", "THIS", "THROW", "THROWS", "TILDE", "TRANSIENT", "TRUE", "TRY", "TS", "TYPEDEF", "TYPE_PARAM_OPT", "TYPE_TAG", "UNICODE_ESC", "UNTYPED", "USING", "VAR", "VAR_INIT", "VOID", "VOLATILE", "WHILE", "WS"
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
    public static final int BLOCK_SCOPE=15;
    public static final int BOOLEAN=16;
    public static final int BREAK=17;
    public static final int BYTE=18;
    public static final int CARET=19;
    public static final int CARETEQ=20;
    public static final int CASE=21;
    public static final int CAST=22;
    public static final int CATCH=23;
    public static final int CHAR=24;
    public static final int CHARLITERAL=25;
    public static final int CLASS=26;
    public static final int COLON=27;
    public static final int COMMA=28;
    public static final int COMMENT=29;
    public static final int CONST=30;
    public static final int CONTINUE=31;
    public static final int DECL_ATTR_LIST=32;
    public static final int DEFAULT=33;
    public static final int DO=34;
    public static final int DOT=35;
    public static final int DOUBLE=36;
    public static final int DYNAMIC=37;
    public static final int ELLIPSIS=38;
    public static final int ELSE=39;
    public static final int ELSE_TOKEN=40;
    public static final int ENDIF_TOKEN=41;
    public static final int ENUM=42;
    public static final int EQ=43;
    public static final int EQEQ=44;
    public static final int ESC_SEQ=45;
    public static final int EXPONENT=46;
    public static final int EXTENDS=47;
    public static final int EXTERN=48;
    public static final int EscapeSequence=49;
    public static final int Exponent=50;
    public static final int FALSE=51;
    public static final int FINAL=52;
    public static final int FINALLY=53;
    public static final int FLOAT=54;
    public static final int FLOATNUM=55;
    public static final int FOR=56;
    public static final int FUNCTION=57;
    public static final int GOTO=58;
    public static final int GT=59;
    public static final int GTEQ=60;
    public static final int GTGT=61;
    public static final int GTGTEQ=62;
    public static final int GTGTGT=63;
    public static final int GTGTGTEQ=64;
    public static final int HEX_DIGIT=65;
    public static final int HexDigit=66;
    public static final int HexPrefix=67;
    public static final int IDENT=68;
    public static final int IDENTIFIER=69;
    public static final int IF=70;
    public static final int IF_TOKEN=71;
    public static final int IMPLEMENTS=72;
    public static final int IMPORT=73;
    public static final int IN=74;
    public static final int INHERIT_LIST_OPT=75;
    public static final int INLINE=76;
    public static final int INSTANCEOF=77;
    public static final int INT=78;
    public static final int INTERFACE=79;
    public static final int INTLITERAL=80;
    public static final int INTNUM=81;
    public static final int IntegerNumber=82;
    public static final int LBRACE=83;
    public static final int LBRACKET=84;
    public static final int LONG=85;
    public static final int LONGLITERAL=86;
    public static final int LPAREN=87;
    public static final int LT=88;
    public static final int LTEQ=89;
    public static final int LTLT=90;
    public static final int LTLTEQ=91;
    public static final int LongSuffix=92;
    public static final int MINUS_BIGGER=93;
    public static final int MODULE=94;
    public static final int MONKEYS_AT=95;
    public static final int NATIVE=96;
    public static final int NEW=97;
    public static final int NULL=98;
    public static final int OCTAL_ESC=99;
    public static final int OVERRIDE=100;
    public static final int PACKAGE=101;
    public static final int PARAM_LIST=102;
    public static final int PERCENT=103;
    public static final int PERCENTEQ=104;
    public static final int PLUS=105;
    public static final int PLUSEQ=106;
    public static final int PLUSPLUS=107;
    public static final int PP_AND_EXPRESSION=108;
    public static final int PP_CONDITIONAL=109;
    public static final int PP_ELSE=110;
    public static final int PP_ELSEIF=111;
    public static final int PP_END=112;
    public static final int PP_ERROR=113;
    public static final int PP_EXPRESSION=114;
    public static final int PP_IF=115;
    public static final int PP_OR_EXPRESSION=116;
    public static final int PP_PRIMARY_EXPRESSION=117;
    public static final int PP_UNARY_EXPRESSION=118;
    public static final int PREFIX_EXPR=119;
    public static final int PREPROCESSOR_DIRECTIVE=120;
    public static final int PRIVATE=121;
    public static final int PROPERTY_DECL=122;
    public static final int PROTECTED=123;
    public static final int PUBLIC=124;
    public static final int QUES=125;
    public static final int RBRACE=126;
    public static final int RBRACKET=127;
    public static final int RETURN=128;
    public static final int RPAREN=129;
    public static final int SEMI=130;
    public static final int SHORT=131;
    public static final int SLASH=132;
    public static final int SLASHEQ=133;
    public static final int STAR=134;
    public static final int STAREQ=135;
    public static final int STATIC=136;
    public static final int STRICTFP=137;
    public static final int STRINGLITERAL=138;
    public static final int SUB=139;
    public static final int SUBEQ=140;
    public static final int SUBSUB=141;
    public static final int SUFFIX_EXPR=142;
    public static final int SUPER=143;
    public static final int SWITCH=144;
    public static final int THIS=145;
    public static final int THROW=146;
    public static final int THROWS=147;
    public static final int TILDE=148;
    public static final int TRANSIENT=149;
    public static final int TRUE=150;
    public static final int TRY=151;
    public static final int TS=152;
    public static final int TYPEDEF=153;
    public static final int TYPE_PARAM_OPT=154;
    public static final int TYPE_TAG=155;
    public static final int UNICODE_ESC=156;
    public static final int UNTYPED=157;
    public static final int USING=158;
    public static final int VAR=159;
    public static final int VAR_INIT=160;
    public static final int VOID=161;
    public static final int VOLATILE=162;
    public static final int WHILE=163;
    public static final int WS=164;

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
        this.state.ruleMemo = new HashMap[277+1];
         

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
    // Haxe.g:66:1: module : ( myPackage )? topLevelList -> ^( MODULE[\"MODULE\"] ( myPackage )? ( topLevelList )? ) ;
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

            // Haxe.g:66:17: ( ( myPackage )? topLevelList -> ^( MODULE[\"MODULE\"] ( myPackage )? ( topLevelList )? ) )
            // Haxe.g:66:19: ( myPackage )? topLevelList
            {
            // Haxe.g:66:19: ( myPackage )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==PACKAGE) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // Haxe.g:66:19: myPackage
                    {
                    pushFollow(FOLLOW_myPackage_in_module177);
                    myPackage1=myPackage();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_myPackage.add(myPackage1.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_topLevelList_in_module180);
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
            // 66:43: -> ^( MODULE[\"MODULE\"] ( myPackage )? ( topLevelList )? )
            {
                // Haxe.g:66:46: ^( MODULE[\"MODULE\"] ( myPackage )? ( topLevelList )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                new HaxeTree(MODULE, "MODULE")
                , root_1);

                // Haxe.g:66:75: ( myPackage )?
                if ( stream_myPackage.hasNext() ) {
                    adaptor.addChild(root_1, stream_myPackage.nextTree());

                }
                stream_myPackage.reset();

                // Haxe.g:66:86: ( topLevelList )?
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
    // Haxe.g:69:1: topLevelList : ( topLevel )* ;
    public final HaxeParser.topLevelList_return topLevelList() throws RecognitionException {
        HaxeParser.topLevelList_return retval = new HaxeParser.topLevelList_return();
        retval.start = input.LT(1);

        int topLevelList_StartIndex = input.index();

        Object root_0 = null;

        HaxeParser.topLevel_return topLevel3 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return retval; }

            // Haxe.g:69:17: ( ( topLevel )* )
            // Haxe.g:69:19: ( topLevel )*
            {
            root_0 = (Object)adaptor.nil();


            // Haxe.g:69:19: ( topLevel )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==CLASS||LA2_0==ENUM||LA2_0==EXTERN||LA2_0==IMPORT||LA2_0==INTERFACE||LA2_0==PRIVATE||LA2_0==TYPEDEF||LA2_0==USING) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // Haxe.g:69:20: topLevel
            	    {
            	    pushFollow(FOLLOW_topLevel_in_topLevelList229);
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
    // Haxe.g:72:1: topLevel : ( IMPORT ^ dotIdent SEMI !| USING ^ dotIdent SEMI !| topLevelDecl );
    public final HaxeParser.topLevel_return topLevel() throws RecognitionException {
        HaxeParser.topLevel_return retval = new HaxeParser.topLevel_return();
        retval.start = input.LT(1);

        int topLevel_StartIndex = input.index();

        Object root_0 = null;

        Token IMPORT4=null;
        Token SEMI6=null;
        Token USING7=null;
        Token SEMI9=null;
        HaxeParser.dotIdent_return dotIdent5 =null;

        HaxeParser.dotIdent_return dotIdent8 =null;

        HaxeParser.topLevelDecl_return topLevelDecl10 =null;


        Object IMPORT4_tree=null;
        Object SEMI6_tree=null;
        Object USING7_tree=null;
        Object SEMI9_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return retval; }

            // Haxe.g:72:17: ( IMPORT ^ dotIdent SEMI !| USING ^ dotIdent SEMI !| topLevelDecl )
            int alt3=3;
            switch ( input.LA(1) ) {
            case IMPORT:
                {
                alt3=1;
                }
                break;
            case USING:
                {
                alt3=2;
                }
                break;
            case CLASS:
            case ENUM:
            case EXTERN:
            case INTERFACE:
            case PRIVATE:
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
                    // Haxe.g:72:19: IMPORT ^ dotIdent SEMI !
                    {
                    root_0 = (Object)adaptor.nil();


                    IMPORT4=(Token)match(input,IMPORT,FOLLOW_IMPORT_in_topLevel263); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IMPORT4_tree = 
                    (Object)adaptor.create(IMPORT4)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(IMPORT4_tree, root_0);
                    }

                    pushFollow(FOLLOW_dotIdent_in_topLevel266);
                    dotIdent5=dotIdent();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dotIdent5.getTree());

                    SEMI6=(Token)match(input,SEMI,FOLLOW_SEMI_in_topLevel268); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // Haxe.g:73:19: USING ^ dotIdent SEMI !
                    {
                    root_0 = (Object)adaptor.nil();


                    USING7=(Token)match(input,USING,FOLLOW_USING_in_topLevel289); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    USING7_tree = 
                    (Object)adaptor.create(USING7)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(USING7_tree, root_0);
                    }

                    pushFollow(FOLLOW_dotIdent_in_topLevel292);
                    dotIdent8=dotIdent();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dotIdent8.getTree());

                    SEMI9=(Token)match(input,SEMI,FOLLOW_SEMI_in_topLevel294); if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // Haxe.g:74:19: topLevelDecl
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_topLevelDecl_in_topLevel315);
                    topLevelDecl10=topLevelDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, topLevelDecl10.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // Haxe.g:78:1: myPackage : PACKAGE ^ dotIdent SEMI !;
    public final HaxeParser.myPackage_return myPackage() throws RecognitionException {
        HaxeParser.myPackage_return retval = new HaxeParser.myPackage_return();
        retval.start = input.LT(1);

        int myPackage_StartIndex = input.index();

        Object root_0 = null;

        Token PACKAGE11=null;
        Token SEMI13=null;
        HaxeParser.dotIdent_return dotIdent12 =null;


        Object PACKAGE11_tree=null;
        Object SEMI13_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return retval; }

            // Haxe.g:78:17: ( PACKAGE ^ dotIdent SEMI !)
            // Haxe.g:78:19: PACKAGE ^ dotIdent SEMI !
            {
            root_0 = (Object)adaptor.nil();


            PACKAGE11=(Token)match(input,PACKAGE,FOLLOW_PACKAGE_in_myPackage347); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            PACKAGE11_tree = 
            (Object)adaptor.create(PACKAGE11)
            ;
            root_0 = (Object)adaptor.becomeRoot(PACKAGE11_tree, root_0);
            }

            pushFollow(FOLLOW_dotIdent_in_myPackage350);
            dotIdent12=dotIdent();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, dotIdent12.getTree());

            SEMI13=(Token)match(input,SEMI,FOLLOW_SEMI_in_myPackage352); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // Haxe.g:82:1: meta : MONKEYS_AT metaName ( LPAREN ( paramList )? RPAREN )? ;
    public final HaxeParser.meta_return meta() throws RecognitionException {
        HaxeParser.meta_return retval = new HaxeParser.meta_return();
        retval.start = input.LT(1);

        int meta_StartIndex = input.index();

        Object root_0 = null;

        Token MONKEYS_AT14=null;
        Token LPAREN16=null;
        Token RPAREN18=null;
        HaxeParser.metaName_return metaName15 =null;

        HaxeParser.paramList_return paramList17 =null;


        Object MONKEYS_AT14_tree=null;
        Object LPAREN16_tree=null;
        Object RPAREN18_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return retval; }

            // Haxe.g:82:9: ( MONKEYS_AT metaName ( LPAREN ( paramList )? RPAREN )? )
            // Haxe.g:82:11: MONKEYS_AT metaName ( LPAREN ( paramList )? RPAREN )?
            {
            root_0 = (Object)adaptor.nil();


            MONKEYS_AT14=(Token)match(input,MONKEYS_AT,FOLLOW_MONKEYS_AT_in_meta382); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            MONKEYS_AT14_tree = 
            (Object)adaptor.create(MONKEYS_AT14)
            ;
            adaptor.addChild(root_0, MONKEYS_AT14_tree);
            }

            pushFollow(FOLLOW_metaName_in_meta384);
            metaName15=metaName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, metaName15.getTree());

            // Haxe.g:82:31: ( LPAREN ( paramList )? RPAREN )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==LPAREN) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // Haxe.g:82:32: LPAREN ( paramList )? RPAREN
                    {
                    LPAREN16=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_meta387); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LPAREN16_tree = 
                    (Object)adaptor.create(LPAREN16)
                    ;
                    adaptor.addChild(root_0, LPAREN16_tree);
                    }

                    // Haxe.g:82:39: ( paramList )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==IDENTIFIER||LA4_0==QUES) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // Haxe.g:82:39: paramList
                            {
                            pushFollow(FOLLOW_paramList_in_meta389);
                            paramList17=paramList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, paramList17.getTree());

                            }
                            break;

                    }


                    RPAREN18=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_meta392); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RPAREN18_tree = 
                    (Object)adaptor.create(RPAREN18)
                    ;
                    adaptor.addChild(root_0, RPAREN18_tree);
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
    // Haxe.g:85:1: metaName : ( IDENTIFIER | primitiveType | COLON metaName );
    public final HaxeParser.metaName_return metaName() throws RecognitionException {
        HaxeParser.metaName_return retval = new HaxeParser.metaName_return();
        retval.start = input.LT(1);

        int metaName_StartIndex = input.index();

        Object root_0 = null;

        Token IDENTIFIER19=null;
        Token COLON21=null;
        HaxeParser.primitiveType_return primitiveType20 =null;

        HaxeParser.metaName_return metaName22 =null;


        Object IDENTIFIER19_tree=null;
        Object COLON21_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return retval; }

            // Haxe.g:86:5: ( IDENTIFIER | primitiveType | COLON metaName )
            int alt6=3;
            switch ( input.LA(1) ) {
            case IDENTIFIER:
                {
                alt6=1;
                }
                break;
            case BOOLEAN:
            case DYNAMIC:
            case FLOAT:
            case INT:
            case VOID:
                {
                alt6=2;
                }
                break;
            case COLON:
                {
                alt6=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }

            switch (alt6) {
                case 1 :
                    // Haxe.g:86:7: IDENTIFIER
                    {
                    root_0 = (Object)adaptor.nil();


                    IDENTIFIER19=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_metaName411); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER19_tree = 
                    (Object)adaptor.create(IDENTIFIER19)
                    ;
                    adaptor.addChild(root_0, IDENTIFIER19_tree);
                    }

                    }
                    break;
                case 2 :
                    // Haxe.g:87:7: primitiveType
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_primitiveType_in_metaName419);
                    primitiveType20=primitiveType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveType20.getTree());

                    }
                    break;
                case 3 :
                    // Haxe.g:89:7: COLON metaName
                    {
                    root_0 = (Object)adaptor.nil();


                    COLON21=(Token)match(input,COLON,FOLLOW_COLON_in_metaName428); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    COLON21_tree = 
                    (Object)adaptor.create(COLON21)
                    ;
                    adaptor.addChild(root_0, COLON21_tree);
                    }

                    pushFollow(FOLLOW_metaName_in_metaName430);
                    metaName22=metaName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, metaName22.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // Haxe.g:92:1: typeDeclFlags : ( meta )* ( EXTERN | PRIVATE )* ;
    public final HaxeParser.typeDeclFlags_return typeDeclFlags() throws RecognitionException {
        HaxeParser.typeDeclFlags_return retval = new HaxeParser.typeDeclFlags_return();
        retval.start = input.LT(1);

        int typeDeclFlags_StartIndex = input.index();

        Object root_0 = null;

        Token set24=null;
        HaxeParser.meta_return meta23 =null;


        Object set24_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return retval; }

            // Haxe.g:93:5: ( ( meta )* ( EXTERN | PRIVATE )* )
            // Haxe.g:93:7: ( meta )* ( EXTERN | PRIVATE )*
            {
            root_0 = (Object)adaptor.nil();


            // Haxe.g:93:7: ( meta )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==MONKEYS_AT) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // Haxe.g:93:8: meta
            	    {
            	    pushFollow(FOLLOW_meta_in_typeDeclFlags448);
            	    meta23=meta();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, meta23.getTree());

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            // Haxe.g:93:15: ( EXTERN | PRIVATE )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==EXTERN||LA8_0==PRIVATE) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // Haxe.g:
            	    {
            	    set24=(Token)input.LT(1);

            	    if ( input.LA(1)==EXTERN||input.LA(1)==PRIVATE ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
            	        (Object)adaptor.create(set24)
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
            if ( state.backtracking>0 ) { memoize(input, 7, typeDeclFlags_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "typeDeclFlags"


    public static class topLevelAccess_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "topLevelAccess"
    // Haxe.g:99:1: topLevelAccess : ( PRIVATE | EXTERN );
    public final HaxeParser.topLevelAccess_return topLevelAccess() throws RecognitionException {
        HaxeParser.topLevelAccess_return retval = new HaxeParser.topLevelAccess_return();
        retval.start = input.LT(1);

        int topLevelAccess_StartIndex = input.index();

        Object root_0 = null;

        Token set25=null;

        Object set25_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return retval; }

            // Haxe.g:99:17: ( PRIVATE | EXTERN )
            // Haxe.g:
            {
            root_0 = (Object)adaptor.nil();


            set25=(Token)input.LT(1);

            if ( input.LA(1)==EXTERN||input.LA(1)==PRIVATE ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (Object)adaptor.create(set25)
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
            if ( state.backtracking>0 ) { memoize(input, 8, topLevelAccess_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "topLevelAccess"


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

        Token set26=null;

        Object set26_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return retval; }

            // Haxe.g:103:17: ( PUBLIC | PRIVATE )
            // Haxe.g:
            {
            root_0 = (Object)adaptor.nil();


            set26=(Token)input.LT(1);

            if ( input.LA(1)==PRIVATE||input.LA(1)==PUBLIC ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (Object)adaptor.create(set26)
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
            if ( state.backtracking>0 ) { memoize(input, 9, access_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "access"


    public static class declAttr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "declAttr"
    // Haxe.g:107:1: declAttr : ( STATIC | INLINE | DYNAMIC | OVERRIDE | access );
    public final HaxeParser.declAttr_return declAttr() throws RecognitionException {
        HaxeParser.declAttr_return retval = new HaxeParser.declAttr_return();
        retval.start = input.LT(1);

        int declAttr_StartIndex = input.index();

        Object root_0 = null;

        Token STATIC27=null;
        Token INLINE28=null;
        Token DYNAMIC29=null;
        Token OVERRIDE30=null;
        HaxeParser.access_return access31 =null;


        Object STATIC27_tree=null;
        Object INLINE28_tree=null;
        Object DYNAMIC29_tree=null;
        Object OVERRIDE30_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return retval; }

            // Haxe.g:107:17: ( STATIC | INLINE | DYNAMIC | OVERRIDE | access )
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
                    // Haxe.g:107:19: STATIC
                    {
                    root_0 = (Object)adaptor.nil();


                    STATIC27=(Token)match(input,STATIC,FOLLOW_STATIC_in_declAttr603); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STATIC27_tree = 
                    (Object)adaptor.create(STATIC27)
                    ;
                    adaptor.addChild(root_0, STATIC27_tree);
                    }

                    }
                    break;
                case 2 :
                    // Haxe.g:108:19: INLINE
                    {
                    root_0 = (Object)adaptor.nil();


                    INLINE28=(Token)match(input,INLINE,FOLLOW_INLINE_in_declAttr623); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INLINE28_tree = 
                    (Object)adaptor.create(INLINE28)
                    ;
                    adaptor.addChild(root_0, INLINE28_tree);
                    }

                    }
                    break;
                case 3 :
                    // Haxe.g:109:19: DYNAMIC
                    {
                    root_0 = (Object)adaptor.nil();


                    DYNAMIC29=(Token)match(input,DYNAMIC,FOLLOW_DYNAMIC_in_declAttr643); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DYNAMIC29_tree = 
                    (Object)adaptor.create(DYNAMIC29)
                    ;
                    adaptor.addChild(root_0, DYNAMIC29_tree);
                    }

                    }
                    break;
                case 4 :
                    // Haxe.g:110:19: OVERRIDE
                    {
                    root_0 = (Object)adaptor.nil();


                    OVERRIDE30=(Token)match(input,OVERRIDE,FOLLOW_OVERRIDE_in_declAttr663); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    OVERRIDE30_tree = 
                    (Object)adaptor.create(OVERRIDE30)
                    ;
                    adaptor.addChild(root_0, OVERRIDE30_tree);
                    }

                    }
                    break;
                case 5 :
                    // Haxe.g:111:19: access
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_access_in_declAttr683);
                    access31=access();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, access31.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
            if ( state.backtracking>0 ) { memoize(input, 10, declAttr_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "declAttr"


    public static class declAttrList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "declAttrList"
    // Haxe.g:115:1: declAttrList : ( declAttr )+ -> ^( DECL_ATTR_LIST[\"DECL_ATTR_LIST\"] ( declAttr )+ ) ;
    public final HaxeParser.declAttrList_return declAttrList() throws RecognitionException {
        HaxeParser.declAttrList_return retval = new HaxeParser.declAttrList_return();
        retval.start = input.LT(1);

        int declAttrList_StartIndex = input.index();

        Object root_0 = null;

        HaxeParser.declAttr_return declAttr32 =null;


        RewriteRuleSubtreeStream stream_declAttr=new RewriteRuleSubtreeStream(adaptor,"rule declAttr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return retval; }

            // Haxe.g:115:17: ( ( declAttr )+ -> ^( DECL_ATTR_LIST[\"DECL_ATTR_LIST\"] ( declAttr )+ ) )
            // Haxe.g:115:19: ( declAttr )+
            {
            // Haxe.g:115:19: ( declAttr )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==DYNAMIC||LA10_0==INLINE||LA10_0==OVERRIDE||LA10_0==PRIVATE||LA10_0==PUBLIC||LA10_0==STATIC) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // Haxe.g:115:19: declAttr
            	    {
            	    pushFollow(FOLLOW_declAttr_in_declAttrList712);
            	    declAttr32=declAttr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_declAttr.add(declAttr32.getTree());

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
            // 115:29: -> ^( DECL_ATTR_LIST[\"DECL_ATTR_LIST\"] ( declAttr )+ )
            {
                // Haxe.g:115:32: ^( DECL_ATTR_LIST[\"DECL_ATTR_LIST\"] ( declAttr )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                new HaxeTree(DECL_ATTR_LIST, "DECL_ATTR_LIST")
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
            if ( state.backtracking>0 ) { memoize(input, 11, declAttrList_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "declAttrList"


    public static class paramList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "paramList"
    // Haxe.g:118:1: paramList : param ( COMMA param )* -> ^( PARAM_LIST[\"PARAM_LIST\"] ( param )+ ) ;
    public final HaxeParser.paramList_return paramList() throws RecognitionException {
        HaxeParser.paramList_return retval = new HaxeParser.paramList_return();
        retval.start = input.LT(1);

        int paramList_StartIndex = input.index();

        Object root_0 = null;

        Token COMMA34=null;
        HaxeParser.param_return param33 =null;

        HaxeParser.param_return param35 =null;


        Object COMMA34_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_param=new RewriteRuleSubtreeStream(adaptor,"rule param");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return retval; }

            // Haxe.g:118:17: ( param ( COMMA param )* -> ^( PARAM_LIST[\"PARAM_LIST\"] ( param )+ ) )
            // Haxe.g:118:19: param ( COMMA param )*
            {
            pushFollow(FOLLOW_param_in_paramList757);
            param33=param();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_param.add(param33.getTree());

            // Haxe.g:118:25: ( COMMA param )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==COMMA) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // Haxe.g:118:26: COMMA param
            	    {
            	    COMMA34=(Token)match(input,COMMA,FOLLOW_COMMA_in_paramList760); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA34);


            	    pushFollow(FOLLOW_param_in_paramList762);
            	    param35=param();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_param.add(param35.getTree());

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
            // 118:40: -> ^( PARAM_LIST[\"PARAM_LIST\"] ( param )+ )
            {
                // Haxe.g:118:43: ^( PARAM_LIST[\"PARAM_LIST\"] ( param )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                new HaxeTree(PARAM_LIST, "PARAM_LIST")
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

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
            if ( state.backtracking>0 ) { memoize(input, 12, paramList_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "paramList"


    public static class param_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "param"
    // Haxe.g:121:1: param : ( QUES )? IDENTIFIER ( typeTag )? ( varInit )? -> ^( VAR[$IDENTIFIER] ( typeTag )? ( varInit )? ( QUES )? ) ;
    public final HaxeParser.param_return param() throws RecognitionException {
        HaxeParser.param_return retval = new HaxeParser.param_return();
        retval.start = input.LT(1);

        int param_StartIndex = input.index();

        Object root_0 = null;

        Token QUES36=null;
        Token IDENTIFIER37=null;
        HaxeParser.typeTag_return typeTag38 =null;

        HaxeParser.varInit_return varInit39 =null;


        Object QUES36_tree=null;
        Object IDENTIFIER37_tree=null;
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_QUES=new RewriteRuleTokenStream(adaptor,"token QUES");
        RewriteRuleSubtreeStream stream_typeTag=new RewriteRuleSubtreeStream(adaptor,"rule typeTag");
        RewriteRuleSubtreeStream stream_varInit=new RewriteRuleSubtreeStream(adaptor,"rule varInit");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return retval; }

            // Haxe.g:121:17: ( ( QUES )? IDENTIFIER ( typeTag )? ( varInit )? -> ^( VAR[$IDENTIFIER] ( typeTag )? ( varInit )? ( QUES )? ) )
            // Haxe.g:121:19: ( QUES )? IDENTIFIER ( typeTag )? ( varInit )?
            {
            // Haxe.g:121:19: ( QUES )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==QUES) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // Haxe.g:121:19: QUES
                    {
                    QUES36=(Token)match(input,QUES,FOLLOW_QUES_in_param812); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_QUES.add(QUES36);


                    }
                    break;

            }


            IDENTIFIER37=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_param815); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER37);


            // Haxe.g:121:36: ( typeTag )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==COLON) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // Haxe.g:121:36: typeTag
                    {
                    pushFollow(FOLLOW_typeTag_in_param817);
                    typeTag38=typeTag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeTag.add(typeTag38.getTree());

                    }
                    break;

            }


            // Haxe.g:121:45: ( varInit )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==EQ) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // Haxe.g:121:45: varInit
                    {
                    pushFollow(FOLLOW_varInit_in_param820);
                    varInit39=varInit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_varInit.add(varInit39.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: QUES, varInit, typeTag
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 121:54: -> ^( VAR[$IDENTIFIER] ( typeTag )? ( varInit )? ( QUES )? )
            {
                // Haxe.g:121:57: ^( VAR[$IDENTIFIER] ( typeTag )? ( varInit )? ( QUES )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                new VarDeclarationNode(VAR, IDENTIFIER37)
                , root_1);

                // Haxe.g:121:96: ( typeTag )?
                if ( stream_typeTag.hasNext() ) {
                    adaptor.addChild(root_1, stream_typeTag.nextTree());

                }
                stream_typeTag.reset();

                // Haxe.g:121:105: ( varInit )?
                if ( stream_varInit.hasNext() ) {
                    adaptor.addChild(root_1, stream_varInit.nextTree());

                }
                stream_varInit.reset();

                // Haxe.g:121:114: ( QUES )?
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
            if ( state.backtracking>0 ) { memoize(input, 13, param_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "param"


    public static class id_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "id"
    // Haxe.g:124:1: id : ( IDENTIFIER | THIS );
    public final HaxeParser.id_return id() throws RecognitionException {
        HaxeParser.id_return retval = new HaxeParser.id_return();
        retval.start = input.LT(1);

        int id_StartIndex = input.index();

        Object root_0 = null;

        Token IDENTIFIER40=null;
        Token THIS41=null;

        Object IDENTIFIER40_tree=null;
        Object THIS41_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return retval; }

            // Haxe.g:124:17: ( IDENTIFIER | THIS )
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
                    // Haxe.g:124:19: IDENTIFIER
                    {
                    root_0 = (Object)adaptor.nil();


                    IDENTIFIER40=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_id882); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER40_tree = 
                    new VarUsageNode(IDENTIFIER40) 
                    ;
                    adaptor.addChild(root_0, IDENTIFIER40_tree);
                    }

                    }
                    break;
                case 2 :
                    // Haxe.g:125:19: THIS
                    {
                    root_0 = (Object)adaptor.nil();


                    THIS41=(Token)match(input,THIS,FOLLOW_THIS_in_id905); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    THIS41_tree = 
                    new VarUsageNode(THIS41) 
                    ;
                    adaptor.addChild(root_0, THIS41_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 14, id_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "id"


    public static class dotIdent_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "dotIdent"
    // Haxe.g:128:1: dotIdent : ( id DOT a= dotIdent -> ^( DOT id $a) | id -> id );
    public final HaxeParser.dotIdent_return dotIdent() throws RecognitionException {
        HaxeParser.dotIdent_return retval = new HaxeParser.dotIdent_return();
        retval.start = input.LT(1);

        int dotIdent_StartIndex = input.index();

        Object root_0 = null;

        Token DOT43=null;
        HaxeParser.dotIdent_return a =null;

        HaxeParser.id_return id42 =null;

        HaxeParser.id_return id44 =null;


        Object DOT43_tree=null;
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_dotIdent=new RewriteRuleSubtreeStream(adaptor,"rule dotIdent");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return retval; }

            // Haxe.g:128:17: ( id DOT a= dotIdent -> ^( DOT id $a) | id -> id )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==IDENTIFIER) ) {
                int LA16_1 = input.LA(2);

                if ( (LA16_1==DOT) ) {
                    alt16=1;
                }
                else if ( (LA16_1==EOF||LA16_1==SEMI) ) {
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
                else if ( (LA16_2==EOF||LA16_2==SEMI) ) {
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
                    // Haxe.g:128:19: id DOT a= dotIdent
                    {
                    pushFollow(FOLLOW_id_in_dotIdent940);
                    id42=id();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_id.add(id42.getTree());

                    DOT43=(Token)match(input,DOT,FOLLOW_DOT_in_dotIdent942); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DOT.add(DOT43);


                    pushFollow(FOLLOW_dotIdent_in_dotIdent946);
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
                    // 128:37: -> ^( DOT id $a)
                    {
                        // Haxe.g:128:41: ^( DOT id $a)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        new VarUsageNode(stream_DOT.nextToken())
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
                    // Haxe.g:129:19: id
                    {
                    pushFollow(FOLLOW_id_in_dotIdent981);
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
                    // 129:22: -> id
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
            if ( state.backtracking>0 ) { memoize(input, 15, dotIdent_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "dotIdent"


    public static class assignOp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assignOp"
    // Haxe.g:132:1: assignOp : ( EQ -> EQ | PLUSEQ -> PLUSEQ | SUBEQ -> SUBEQ | STAREQ -> STAREQ | SLASHEQ -> SLASHEQ | PERCENTEQ -> PERCENTEQ | AMPEQ -> AMPEQ | BAREQ -> BAREQ | CARETEQ -> CARETEQ | LTLTEQ -> LTLTEQ | GTGTEQ -> GTGTEQ | GTGTGTEQ -> GTGTGTEQ );
    public final HaxeParser.assignOp_return assignOp() throws RecognitionException {
        HaxeParser.assignOp_return retval = new HaxeParser.assignOp_return();
        retval.start = input.LT(1);

        int assignOp_StartIndex = input.index();

        Object root_0 = null;

        Token EQ45=null;
        Token PLUSEQ46=null;
        Token SUBEQ47=null;
        Token STAREQ48=null;
        Token SLASHEQ49=null;
        Token PERCENTEQ50=null;
        Token AMPEQ51=null;
        Token BAREQ52=null;
        Token CARETEQ53=null;
        Token LTLTEQ54=null;
        Token GTGTEQ55=null;
        Token GTGTGTEQ56=null;

        Object EQ45_tree=null;
        Object PLUSEQ46_tree=null;
        Object SUBEQ47_tree=null;
        Object STAREQ48_tree=null;
        Object SLASHEQ49_tree=null;
        Object PERCENTEQ50_tree=null;
        Object AMPEQ51_tree=null;
        Object BAREQ52_tree=null;
        Object CARETEQ53_tree=null;
        Object LTLTEQ54_tree=null;
        Object GTGTEQ55_tree=null;
        Object GTGTGTEQ56_tree=null;
        RewriteRuleTokenStream stream_SUBEQ=new RewriteRuleTokenStream(adaptor,"token SUBEQ");
        RewriteRuleTokenStream stream_CARETEQ=new RewriteRuleTokenStream(adaptor,"token CARETEQ");
        RewriteRuleTokenStream stream_GTGTGTEQ=new RewriteRuleTokenStream(adaptor,"token GTGTGTEQ");
        RewriteRuleTokenStream stream_SLASHEQ=new RewriteRuleTokenStream(adaptor,"token SLASHEQ");
        RewriteRuleTokenStream stream_BAREQ=new RewriteRuleTokenStream(adaptor,"token BAREQ");
        RewriteRuleTokenStream stream_PERCENTEQ=new RewriteRuleTokenStream(adaptor,"token PERCENTEQ");
        RewriteRuleTokenStream stream_EQ=new RewriteRuleTokenStream(adaptor,"token EQ");
        RewriteRuleTokenStream stream_AMPEQ=new RewriteRuleTokenStream(adaptor,"token AMPEQ");
        RewriteRuleTokenStream stream_STAREQ=new RewriteRuleTokenStream(adaptor,"token STAREQ");
        RewriteRuleTokenStream stream_PLUSEQ=new RewriteRuleTokenStream(adaptor,"token PLUSEQ");
        RewriteRuleTokenStream stream_LTLTEQ=new RewriteRuleTokenStream(adaptor,"token LTLTEQ");
        RewriteRuleTokenStream stream_GTGTEQ=new RewriteRuleTokenStream(adaptor,"token GTGTEQ");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return retval; }

            // Haxe.g:132:17: ( EQ -> EQ | PLUSEQ -> PLUSEQ | SUBEQ -> SUBEQ | STAREQ -> STAREQ | SLASHEQ -> SLASHEQ | PERCENTEQ -> PERCENTEQ | AMPEQ -> AMPEQ | BAREQ -> BAREQ | CARETEQ -> CARETEQ | LTLTEQ -> LTLTEQ | GTGTEQ -> GTGTEQ | GTGTGTEQ -> GTGTGTEQ )
            int alt17=12;
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
            case STAREQ:
                {
                alt17=4;
                }
                break;
            case SLASHEQ:
                {
                alt17=5;
                }
                break;
            case PERCENTEQ:
                {
                alt17=6;
                }
                break;
            case AMPEQ:
                {
                alt17=7;
                }
                break;
            case BAREQ:
                {
                alt17=8;
                }
                break;
            case CARETEQ:
                {
                alt17=9;
                }
                break;
            case LTLTEQ:
                {
                alt17=10;
                }
                break;
            case GTGTEQ:
                {
                alt17=11;
                }
                break;
            case GTGTGTEQ:
                {
                alt17=12;
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
                    // Haxe.g:132:19: EQ
                    {
                    EQ45=(Token)match(input,EQ,FOLLOW_EQ_in_assignOp1017); if (state.failed) return retval; 
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
                    // 132:28: -> EQ
                    {
                        adaptor.addChild(root_0, 
                        new AssignOperationNode(stream_EQ.nextToken())
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // Haxe.g:133:19: PLUSEQ
                    {
                    PLUSEQ46=(Token)match(input,PLUSEQ,FOLLOW_PLUSEQ_in_assignOp1050); if (state.failed) return retval; 
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
                    // 133:28: -> PLUSEQ
                    {
                        adaptor.addChild(root_0, 
                        new AssignOperationNode(stream_PLUSEQ.nextToken())
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 3 :
                    // Haxe.g:134:19: SUBEQ
                    {
                    SUBEQ47=(Token)match(input,SUBEQ,FOLLOW_SUBEQ_in_assignOp1079); if (state.failed) return retval; 
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
                    // 134:28: -> SUBEQ
                    {
                        adaptor.addChild(root_0, 
                        new AssignOperationNode(stream_SUBEQ.nextToken())
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 4 :
                    // Haxe.g:135:19: STAREQ
                    {
                    STAREQ48=(Token)match(input,STAREQ,FOLLOW_STAREQ_in_assignOp1109); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STAREQ.add(STAREQ48);


                    // AST REWRITE
                    // elements: STAREQ
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 135:28: -> STAREQ
                    {
                        adaptor.addChild(root_0, 
                        new AssignOperationNode(stream_STAREQ.nextToken())
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 5 :
                    // Haxe.g:136:19: SLASHEQ
                    {
                    SLASHEQ49=(Token)match(input,SLASHEQ,FOLLOW_SLASHEQ_in_assignOp1138); if (state.failed) return retval; 
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
                    // 136:28: -> SLASHEQ
                    {
                        adaptor.addChild(root_0, 
                        new AssignOperationNode(stream_SLASHEQ.nextToken())
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 6 :
                    // Haxe.g:137:19: PERCENTEQ
                    {
                    PERCENTEQ50=(Token)match(input,PERCENTEQ,FOLLOW_PERCENTEQ_in_assignOp1166); if (state.failed) return retval; 
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
                    // 137:29: -> PERCENTEQ
                    {
                        adaptor.addChild(root_0, 
                        new AssignOperationNode(stream_PERCENTEQ.nextToken())
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 7 :
                    // Haxe.g:138:19: AMPEQ
                    {
                    AMPEQ51=(Token)match(input,AMPEQ,FOLLOW_AMPEQ_in_assignOp1193); if (state.failed) return retval; 
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
                    // 138:28: -> AMPEQ
                    {
                        adaptor.addChild(root_0, 
                        new AssignOperationNode(stream_AMPEQ.nextToken())
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 8 :
                    // Haxe.g:139:19: BAREQ
                    {
                    BAREQ52=(Token)match(input,BAREQ,FOLLOW_BAREQ_in_assignOp1223); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_BAREQ.add(BAREQ52);


                    // AST REWRITE
                    // elements: BAREQ
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 139:28: -> BAREQ
                    {
                        adaptor.addChild(root_0, 
                        new AssignOperationNode(stream_BAREQ.nextToken())
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 9 :
                    // Haxe.g:140:19: CARETEQ
                    {
                    CARETEQ53=(Token)match(input,CARETEQ,FOLLOW_CARETEQ_in_assignOp1253); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CARETEQ.add(CARETEQ53);


                    // AST REWRITE
                    // elements: CARETEQ
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 140:28: -> CARETEQ
                    {
                        adaptor.addChild(root_0, 
                        new AssignOperationNode(stream_CARETEQ.nextToken())
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 10 :
                    // Haxe.g:141:19: LTLTEQ
                    {
                    LTLTEQ54=(Token)match(input,LTLTEQ,FOLLOW_LTLTEQ_in_assignOp1281); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LTLTEQ.add(LTLTEQ54);


                    // AST REWRITE
                    // elements: LTLTEQ
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 141:28: -> LTLTEQ
                    {
                        adaptor.addChild(root_0, 
                        new AssignOperationNode(stream_LTLTEQ.nextToken())
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 11 :
                    // Haxe.g:142:19: GTGTEQ
                    {
                    GTGTEQ55=(Token)match(input,GTGTEQ,FOLLOW_GTGTEQ_in_assignOp1310); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_GTGTEQ.add(GTGTEQ55);


                    // AST REWRITE
                    // elements: GTGTEQ
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 142:28: -> GTGTEQ
                    {
                        adaptor.addChild(root_0, 
                        new AssignOperationNode(stream_GTGTEQ.nextToken())
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 12 :
                    // Haxe.g:143:19: GTGTGTEQ
                    {
                    GTGTGTEQ56=(Token)match(input,GTGTGTEQ,FOLLOW_GTGTGTEQ_in_assignOp1339); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_GTGTGTEQ.add(GTGTGTEQ56);


                    // AST REWRITE
                    // elements: GTGTGTEQ
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 143:28: -> GTGTGTEQ
                    {
                        adaptor.addChild(root_0, 
                        new AssignOperationNode(stream_GTGTGTEQ.nextToken())
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
            if ( state.backtracking>0 ) { memoize(input, 16, assignOp_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "assignOp"


    public static class funcLit_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "funcLit"
    // Haxe.g:146:1: funcLit : FUNCTION ^ LPAREN ! ( paramList )? RPAREN ! ( typeTag )? block ;
    public final HaxeParser.funcLit_return funcLit() throws RecognitionException {
        HaxeParser.funcLit_return retval = new HaxeParser.funcLit_return();
        retval.start = input.LT(1);

        int funcLit_StartIndex = input.index();

        Object root_0 = null;

        Token FUNCTION57=null;
        Token LPAREN58=null;
        Token RPAREN60=null;
        HaxeParser.paramList_return paramList59 =null;

        HaxeParser.typeTag_return typeTag61 =null;

        HaxeParser.block_return block62 =null;


        Object FUNCTION57_tree=null;
        Object LPAREN58_tree=null;
        Object RPAREN60_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return retval; }

            // Haxe.g:146:17: ( FUNCTION ^ LPAREN ! ( paramList )? RPAREN ! ( typeTag )? block )
            // Haxe.g:146:19: FUNCTION ^ LPAREN ! ( paramList )? RPAREN ! ( typeTag )? block
            {
            root_0 = (Object)adaptor.nil();


            FUNCTION57=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcLit1395); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            FUNCTION57_tree = 
            new FunctionNode(FUNCTION57) 
            ;
            root_0 = (Object)adaptor.becomeRoot(FUNCTION57_tree, root_0);
            }

            LPAREN58=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcLit1401); if (state.failed) return retval;

            // Haxe.g:146:51: ( paramList )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==IDENTIFIER||LA18_0==QUES) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // Haxe.g:146:51: paramList
                    {
                    pushFollow(FOLLOW_paramList_in_funcLit1404);
                    paramList59=paramList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, paramList59.getTree());

                    }
                    break;

            }


            RPAREN60=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcLit1407); if (state.failed) return retval;

            // Haxe.g:146:70: ( typeTag )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==COLON) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // Haxe.g:146:70: typeTag
                    {
                    pushFollow(FOLLOW_typeTag_in_funcLit1410);
                    typeTag61=typeTag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeTag61.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_block_in_funcLit1413);
            block62=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, block62.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
            if ( state.backtracking>0 ) { memoize(input, 17, funcLit_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "funcLit"


    public static class arrayLit_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "arrayLit"
    // Haxe.g:149:1: arrayLit : LBRACKET ! ( exprList )? RBRACKET !;
    public final HaxeParser.arrayLit_return arrayLit() throws RecognitionException {
        HaxeParser.arrayLit_return retval = new HaxeParser.arrayLit_return();
        retval.start = input.LT(1);

        int arrayLit_StartIndex = input.index();

        Object root_0 = null;

        Token LBRACKET63=null;
        Token RBRACKET65=null;
        HaxeParser.exprList_return exprList64 =null;


        Object LBRACKET63_tree=null;
        Object RBRACKET65_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return retval; }

            // Haxe.g:149:17: ( LBRACKET ! ( exprList )? RBRACKET !)
            // Haxe.g:149:19: LBRACKET ! ( exprList )? RBRACKET !
            {
            root_0 = (Object)adaptor.nil();


            LBRACKET63=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_arrayLit1445); if (state.failed) return retval;

            // Haxe.g:149:29: ( exprList )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==BANG||LA20_0==CAST||LA20_0==CHARLITERAL||LA20_0==FALSE||LA20_0==FLOATNUM||LA20_0==FUNCTION||LA20_0==IDENTIFIER||LA20_0==INTLITERAL||(LA20_0 >= LBRACE && LA20_0 <= LBRACKET)||(LA20_0 >= LONGLITERAL && LA20_0 <= LPAREN)||(LA20_0 >= NEW && LA20_0 <= NULL)||LA20_0==PLUSPLUS||(LA20_0 >= STRINGLITERAL && LA20_0 <= SUB)||LA20_0==SUBSUB||LA20_0==THIS||LA20_0==TILDE||LA20_0==TRUE||LA20_0==UNTYPED) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // Haxe.g:149:29: exprList
                    {
                    pushFollow(FOLLOW_exprList_in_arrayLit1448);
                    exprList64=exprList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, exprList64.getTree());

                    }
                    break;

            }


            RBRACKET65=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_arrayLit1451); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
            if ( state.backtracking>0 ) { memoize(input, 18, arrayLit_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "arrayLit"


    public static class typeTag_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "typeTag"
    // Haxe.g:177:1: typeTag : COLON funcType -> ^( TYPE_TAG[\"TYPE_TAG\"] funcType ) ;
    public final HaxeParser.typeTag_return typeTag() throws RecognitionException {
        HaxeParser.typeTag_return retval = new HaxeParser.typeTag_return();
        retval.start = input.LT(1);

        int typeTag_StartIndex = input.index();

        Object root_0 = null;

        Token COLON66=null;
        HaxeParser.funcType_return funcType67 =null;


        Object COLON66_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleSubtreeStream stream_funcType=new RewriteRuleSubtreeStream(adaptor,"rule funcType");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return retval; }

            // Haxe.g:177:17: ( COLON funcType -> ^( TYPE_TAG[\"TYPE_TAG\"] funcType ) )
            // Haxe.g:177:19: COLON funcType
            {
            COLON66=(Token)match(input,COLON,FOLLOW_COLON_in_typeTag1496); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COLON.add(COLON66);


            pushFollow(FOLLOW_funcType_in_typeTag1498);
            funcType67=funcType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_funcType.add(funcType67.getTree());

            // AST REWRITE
            // elements: funcType
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 177:34: -> ^( TYPE_TAG[\"TYPE_TAG\"] funcType )
            {
                // Haxe.g:177:37: ^( TYPE_TAG[\"TYPE_TAG\"] funcType )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                new HaxeTree(TYPE_TAG, "TYPE_TAG")
                , root_1);

                adaptor.addChild(root_1, stream_funcType.nextTree());

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
            if ( state.backtracking>0 ) { memoize(input, 19, typeTag_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "typeTag"


    public static class typeList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "typeList"
    // Haxe.g:180:1: typeList : ( funcType ( COMMA ! typeList )? | typeConstraint ( COMMA ! typeList )? );
    public final HaxeParser.typeList_return typeList() throws RecognitionException {
        HaxeParser.typeList_return retval = new HaxeParser.typeList_return();
        retval.start = input.LT(1);

        int typeList_StartIndex = input.index();

        Object root_0 = null;

        Token COMMA69=null;
        Token COMMA72=null;
        HaxeParser.funcType_return funcType68 =null;

        HaxeParser.typeList_return typeList70 =null;

        HaxeParser.typeConstraint_return typeConstraint71 =null;

        HaxeParser.typeList_return typeList73 =null;


        Object COMMA69_tree=null;
        Object COMMA72_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return retval; }

            // Haxe.g:180:17: ( funcType ( COMMA ! typeList )? | typeConstraint ( COMMA ! typeList )? )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==EOF||LA23_0==BOOLEAN||LA23_0==COMMA||LA23_0==DYNAMIC||LA23_0==FLOAT||LA23_0==GT||LA23_0==INT||LA23_0==LBRACE||LA23_0==LT||LA23_0==MINUS_BIGGER||LA23_0==RPAREN||LA23_0==VOID) ) {
                alt23=1;
            }
            else if ( (LA23_0==IDENTIFIER) ) {
                int LA23_2 = input.LA(2);

                if ( (LA23_2==COLON) ) {
                    alt23=2;
                }
                else if ( (LA23_2==EOF||LA23_2==COMMA||LA23_2==GT||LA23_2==LT||LA23_2==MINUS_BIGGER||LA23_2==RPAREN) ) {
                    alt23=1;
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
                    // Haxe.g:180:19: funcType ( COMMA ! typeList )?
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_funcType_in_typeList1542);
                    funcType68=funcType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, funcType68.getTree());

                    // Haxe.g:180:28: ( COMMA ! typeList )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==COMMA) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // Haxe.g:180:29: COMMA ! typeList
                            {
                            COMMA69=(Token)match(input,COMMA,FOLLOW_COMMA_in_typeList1545); if (state.failed) return retval;

                            pushFollow(FOLLOW_typeList_in_typeList1548);
                            typeList70=typeList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, typeList70.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // Haxe.g:181:19: typeConstraint ( COMMA ! typeList )?
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_typeConstraint_in_typeList1570);
                    typeConstraint71=typeConstraint();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeConstraint71.getTree());

                    // Haxe.g:181:34: ( COMMA ! typeList )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==COMMA) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // Haxe.g:181:35: COMMA ! typeList
                            {
                            COMMA72=(Token)match(input,COMMA,FOLLOW_COMMA_in_typeList1573); if (state.failed) return retval;

                            pushFollow(FOLLOW_typeList_in_typeList1576);
                            typeList73=typeList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, typeList73.getTree());

                            }
                            break;

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
            if ( state.backtracking>0 ) { memoize(input, 20, typeList_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "typeList"


    public static class funcType_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "funcType"
    // Haxe.g:184:1: funcType : type ( MINUS_BIGGER ! type )* ;
    public final HaxeParser.funcType_return funcType() throws RecognitionException {
        HaxeParser.funcType_return retval = new HaxeParser.funcType_return();
        retval.start = input.LT(1);

        int funcType_StartIndex = input.index();

        Object root_0 = null;

        Token MINUS_BIGGER75=null;
        HaxeParser.type_return type74 =null;

        HaxeParser.type_return type76 =null;


        Object MINUS_BIGGER75_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return retval; }

            // Haxe.g:184:17: ( type ( MINUS_BIGGER ! type )* )
            // Haxe.g:184:19: type ( MINUS_BIGGER ! type )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_type_in_funcType1611);
            type74=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type74.getTree());

            // Haxe.g:184:24: ( MINUS_BIGGER ! type )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==MINUS_BIGGER) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // Haxe.g:184:25: MINUS_BIGGER ! type
            	    {
            	    MINUS_BIGGER75=(Token)match(input,MINUS_BIGGER,FOLLOW_MINUS_BIGGER_in_funcType1614); if (state.failed) return retval;

            	    pushFollow(FOLLOW_type_in_funcType1617);
            	    type76=type();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, type76.getTree());

            	    }
            	    break;

            	default :
            	    break loop24;
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
            if ( state.backtracking>0 ) { memoize(input, 21, funcType_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "funcType"


    public static class primitiveType_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "primitiveType"
    // Haxe.g:187:1: primitiveType : ( INT | FLOAT | DYNAMIC | BOOLEAN | VOID );
    public final HaxeParser.primitiveType_return primitiveType() throws RecognitionException {
        HaxeParser.primitiveType_return retval = new HaxeParser.primitiveType_return();
        retval.start = input.LT(1);

        int primitiveType_StartIndex = input.index();

        Object root_0 = null;

        Token set77=null;

        Object set77_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return retval; }

            // Haxe.g:187:17: ( INT | FLOAT | DYNAMIC | BOOLEAN | VOID )
            // Haxe.g:
            {
            root_0 = (Object)adaptor.nil();


            set77=(Token)input.LT(1);

            if ( input.LA(1)==BOOLEAN||input.LA(1)==DYNAMIC||input.LA(1)==FLOAT||input.LA(1)==INT||input.LA(1)==VOID ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (Object)adaptor.create(set77)
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
            if ( state.backtracking>0 ) { memoize(input, 22, primitiveType_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "primitiveType"


    public static class type_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "type"
    // Haxe.g:190:1: type : ( ( anonType ^| IDENTIFIER ^| primitiveType ^) ( typeParam )* |);
    public final HaxeParser.type_return type() throws RecognitionException {
        HaxeParser.type_return retval = new HaxeParser.type_return();
        retval.start = input.LT(1);

        int type_StartIndex = input.index();

        Object root_0 = null;

        Token IDENTIFIER79=null;
        HaxeParser.anonType_return anonType78 =null;

        HaxeParser.primitiveType_return primitiveType80 =null;

        HaxeParser.typeParam_return typeParam81 =null;


        Object IDENTIFIER79_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return retval; }

            // Haxe.g:190:9: ( ( anonType ^| IDENTIFIER ^| primitiveType ^) ( typeParam )* |)
            int alt27=2;
            switch ( input.LA(1) ) {
            case LBRACE:
                {
                int LA27_1 = input.LA(2);

                if ( (synpred50_Haxe()) ) {
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
            case IMPLEMENTS:
            case IMPORT:
            case INTERFACE:
            case LPAREN:
            case LT:
            case MINUS_BIGGER:
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
                    // Haxe.g:190:14: ( anonType ^| IDENTIFIER ^| primitiveType ^) ( typeParam )*
                    {
                    root_0 = (Object)adaptor.nil();


                    // Haxe.g:190:14: ( anonType ^| IDENTIFIER ^| primitiveType ^)
                    int alt25=3;
                    switch ( input.LA(1) ) {
                    case LBRACE:
                        {
                        alt25=1;
                        }
                        break;
                    case IDENTIFIER:
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
                            // Haxe.g:190:15: anonType ^
                            {
                            pushFollow(FOLLOW_anonType_in_type1698);
                            anonType78=anonType();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(anonType78.getTree(), root_0);

                            }
                            break;
                        case 2 :
                            // Haxe.g:190:27: IDENTIFIER ^
                            {
                            IDENTIFIER79=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_type1703); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            IDENTIFIER79_tree = 
                            (Object)adaptor.create(IDENTIFIER79)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(IDENTIFIER79_tree, root_0);
                            }

                            }
                            break;
                        case 3 :
                            // Haxe.g:190:41: primitiveType ^
                            {
                            pushFollow(FOLLOW_primitiveType_in_type1708);
                            primitiveType80=primitiveType();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(primitiveType80.getTree(), root_0);

                            }
                            break;

                    }


                    // Haxe.g:190:58: ( typeParam )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==LT) ) {
                            int LA26_8 = input.LA(2);

                            if ( (synpred49_Haxe()) ) {
                                alt26=1;
                            }


                        }


                        switch (alt26) {
                    	case 1 :
                    	    // Haxe.g:190:59: typeParam
                    	    {
                    	    pushFollow(FOLLOW_typeParam_in_type1714);
                    	    typeParam81=typeParam();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeParam81.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // Haxe.g:192:9: 
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
            if ( state.backtracking>0 ) { memoize(input, 23, type_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "type"


    public static class typeParam_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "typeParam"
    // Haxe.g:194:1: typeParam : LT ! typeList ( typeParam )? GT !;
    public final HaxeParser.typeParam_return typeParam() throws RecognitionException {
        HaxeParser.typeParam_return retval = new HaxeParser.typeParam_return();
        retval.start = input.LT(1);

        int typeParam_StartIndex = input.index();

        Object root_0 = null;

        Token LT82=null;
        Token GT85=null;
        HaxeParser.typeList_return typeList83 =null;

        HaxeParser.typeParam_return typeParam84 =null;


        Object LT82_tree=null;
        Object GT85_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return retval; }

            // Haxe.g:194:17: ( LT ! typeList ( typeParam )? GT !)
            // Haxe.g:194:19: LT ! typeList ( typeParam )? GT !
            {
            root_0 = (Object)adaptor.nil();


            LT82=(Token)match(input,LT,FOLLOW_LT_in_typeParam1773); if (state.failed) return retval;

            pushFollow(FOLLOW_typeList_in_typeParam1776);
            typeList83=typeList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, typeList83.getTree());

            // Haxe.g:194:32: ( typeParam )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==LT) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // Haxe.g:194:32: typeParam
                    {
                    pushFollow(FOLLOW_typeParam_in_typeParam1778);
                    typeParam84=typeParam();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeParam84.getTree());

                    }
                    break;

            }


            GT85=(Token)match(input,GT,FOLLOW_GT_in_typeParam1781); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
            if ( state.backtracking>0 ) { memoize(input, 24, typeParam_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "typeParam"


    public static class typeParamOpt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "typeParamOpt"
    // Haxe.g:197:1: typeParamOpt : ( typeParam -> ^( TYPE_PARAM_OPT[\"TYPE_PARAM_OPT\"] ( typeParam )? ) |);
    public final HaxeParser.typeParamOpt_return typeParamOpt() throws RecognitionException {
        HaxeParser.typeParamOpt_return retval = new HaxeParser.typeParamOpt_return();
        retval.start = input.LT(1);

        int typeParamOpt_StartIndex = input.index();

        Object root_0 = null;

        HaxeParser.typeParam_return typeParam86 =null;


        RewriteRuleSubtreeStream stream_typeParam=new RewriteRuleSubtreeStream(adaptor,"rule typeParam");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return retval; }

            // Haxe.g:198:5: ( typeParam -> ^( TYPE_PARAM_OPT[\"TYPE_PARAM_OPT\"] ( typeParam )? ) |)
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==LT) ) {
                int LA29_1 = input.LA(2);

                if ( (synpred52_Haxe()) ) {
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
            else if ( (LA29_0==EOF||(LA29_0 >= AMP && LA29_0 <= AMPEQ)||LA29_0==BANGEQ||(LA29_0 >= BAR && LA29_0 <= BAREQ)||(LA29_0 >= CARET && LA29_0 <= CARETEQ)||(LA29_0 >= COLON && LA29_0 <= COMMA)||LA29_0==DOT||LA29_0==ELLIPSIS||(LA29_0 >= EQ && LA29_0 <= EQEQ)||LA29_0==EXTENDS||(LA29_0 >= GT && LA29_0 <= GTGTGTEQ)||LA29_0==IMPLEMENTS||LA29_0==IN||(LA29_0 >= LBRACE && LA29_0 <= LBRACKET)||LA29_0==LPAREN||(LA29_0 >= LTEQ && LA29_0 <= LTLTEQ)||(LA29_0 >= PERCENT && LA29_0 <= PLUSPLUS)||(LA29_0 >= QUES && LA29_0 <= RBRACKET)||(LA29_0 >= RPAREN && LA29_0 <= SEMI)||(LA29_0 >= SLASH && LA29_0 <= STAREQ)||(LA29_0 >= SUB && LA29_0 <= SUBSUB)) ) {
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
                    // Haxe.g:198:10: typeParam
                    {
                    pushFollow(FOLLOW_typeParam_in_typeParamOpt1824);
                    typeParam86=typeParam();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeParam.add(typeParam86.getTree());

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
                    // 198:20: -> ^( TYPE_PARAM_OPT[\"TYPE_PARAM_OPT\"] ( typeParam )? )
                    {
                        // Haxe.g:198:23: ^( TYPE_PARAM_OPT[\"TYPE_PARAM_OPT\"] ( typeParam )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        new HaxeTree(TYPE_PARAM_OPT, "TYPE_PARAM_OPT")
                        , root_1);

                        // Haxe.g:198:68: ( typeParam )?
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
                    // Haxe.g:200:5: 
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
            if ( state.backtracking>0 ) { memoize(input, 25, typeParamOpt_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "typeParamOpt"


    public static class typeConstraint_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "typeConstraint"
    // Haxe.g:202:1: typeConstraint : IDENTIFIER COLON LPAREN typeList RPAREN -> ^( $typeConstraint ( IDENTIFIER )? ( typeList )? ) ;
    public final HaxeParser.typeConstraint_return typeConstraint() throws RecognitionException {
        HaxeParser.typeConstraint_return retval = new HaxeParser.typeConstraint_return();
        retval.start = input.LT(1);

        int typeConstraint_StartIndex = input.index();

        Object root_0 = null;

        Token IDENTIFIER87=null;
        Token COLON88=null;
        Token LPAREN89=null;
        Token RPAREN91=null;
        HaxeParser.typeList_return typeList90 =null;


        Object IDENTIFIER87_tree=null;
        Object COLON88_tree=null;
        Object LPAREN89_tree=null;
        Object RPAREN91_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_typeList=new RewriteRuleSubtreeStream(adaptor,"rule typeList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return retval; }

            // Haxe.g:203:5: ( IDENTIFIER COLON LPAREN typeList RPAREN -> ^( $typeConstraint ( IDENTIFIER )? ( typeList )? ) )
            // Haxe.g:203:9: IDENTIFIER COLON LPAREN typeList RPAREN
            {
            IDENTIFIER87=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_typeConstraint1873); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER87);


            COLON88=(Token)match(input,COLON,FOLLOW_COLON_in_typeConstraint1875); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COLON.add(COLON88);


            LPAREN89=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_typeConstraint1877); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN89);


            pushFollow(FOLLOW_typeList_in_typeConstraint1879);
            typeList90=typeList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeList.add(typeList90.getTree());

            RPAREN91=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_typeConstraint1881); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN91);


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
            // 203:49: -> ^( $typeConstraint ( IDENTIFIER )? ( typeList )? )
            {
                // Haxe.g:203:52: ^( $typeConstraint ( IDENTIFIER )? ( typeList )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_retval.nextNode(), root_1);

                // Haxe.g:203:70: ( IDENTIFIER )?
                if ( stream_IDENTIFIER.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_IDENTIFIER.nextNode()
                    );

                }
                stream_IDENTIFIER.reset();

                // Haxe.g:203:82: ( typeList )?
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
            if ( state.backtracking>0 ) { memoize(input, 26, typeConstraint_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "typeConstraint"


    public static class functionReturn_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "functionReturn"
    // Haxe.g:207:1: functionReturn : ( declAttrList )? FUNCTION NEW LPAREN ( paramList )? RPAREN ( typeTag )? block -> ^( FUNCTION NEW ( declAttrList )? ( paramList )? ( typeTag )? ( block )? ) ;
    public final HaxeParser.functionReturn_return functionReturn() throws RecognitionException {
        HaxeParser.functionReturn_return retval = new HaxeParser.functionReturn_return();
        retval.start = input.LT(1);

        int functionReturn_StartIndex = input.index();

        Object root_0 = null;

        Token FUNCTION93=null;
        Token NEW94=null;
        Token LPAREN95=null;
        Token RPAREN97=null;
        HaxeParser.declAttrList_return declAttrList92 =null;

        HaxeParser.paramList_return paramList96 =null;

        HaxeParser.typeTag_return typeTag98 =null;

        HaxeParser.block_return block99 =null;


        Object FUNCTION93_tree=null;
        Object NEW94_tree=null;
        Object LPAREN95_tree=null;
        Object RPAREN97_tree=null;
        RewriteRuleTokenStream stream_FUNCTION=new RewriteRuleTokenStream(adaptor,"token FUNCTION");
        RewriteRuleTokenStream stream_NEW=new RewriteRuleTokenStream(adaptor,"token NEW");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_typeTag=new RewriteRuleSubtreeStream(adaptor,"rule typeTag");
        RewriteRuleSubtreeStream stream_declAttrList=new RewriteRuleSubtreeStream(adaptor,"rule declAttrList");
        RewriteRuleSubtreeStream stream_paramList=new RewriteRuleSubtreeStream(adaptor,"rule paramList");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return retval; }

            // Haxe.g:208:5: ( ( declAttrList )? FUNCTION NEW LPAREN ( paramList )? RPAREN ( typeTag )? block -> ^( FUNCTION NEW ( declAttrList )? ( paramList )? ( typeTag )? ( block )? ) )
            // Haxe.g:208:10: ( declAttrList )? FUNCTION NEW LPAREN ( paramList )? RPAREN ( typeTag )? block
            {
            // Haxe.g:208:10: ( declAttrList )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==DYNAMIC||LA30_0==INLINE||LA30_0==OVERRIDE||LA30_0==PRIVATE||LA30_0==PUBLIC||LA30_0==STATIC) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // Haxe.g:208:10: declAttrList
                    {
                    pushFollow(FOLLOW_declAttrList_in_functionReturn1920);
                    declAttrList92=declAttrList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declAttrList.add(declAttrList92.getTree());

                    }
                    break;

            }


            FUNCTION93=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_functionReturn1923); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION93);


            NEW94=(Token)match(input,NEW,FOLLOW_NEW_in_functionReturn1925); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_NEW.add(NEW94);


            LPAREN95=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_functionReturn1927); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN95);


            // Haxe.g:208:44: ( paramList )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==IDENTIFIER||LA31_0==QUES) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // Haxe.g:208:44: paramList
                    {
                    pushFollow(FOLLOW_paramList_in_functionReturn1929);
                    paramList96=paramList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_paramList.add(paramList96.getTree());

                    }
                    break;

            }


            RPAREN97=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_functionReturn1932); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN97);


            // Haxe.g:208:62: ( typeTag )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==COLON) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // Haxe.g:208:62: typeTag
                    {
                    pushFollow(FOLLOW_typeTag_in_functionReturn1934);
                    typeTag98=typeTag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeTag.add(typeTag98.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_block_in_functionReturn1937);
            block99=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block99.getTree());

            // AST REWRITE
            // elements: FUNCTION, block, declAttrList, typeTag, NEW, paramList
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 208:77: -> ^( FUNCTION NEW ( declAttrList )? ( paramList )? ( typeTag )? ( block )? )
            {
                // Haxe.g:208:80: ^( FUNCTION NEW ( declAttrList )? ( paramList )? ( typeTag )? ( block )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                new FunctionNode(stream_FUNCTION.nextToken())
                , root_1);

                adaptor.addChild(root_1, 
                stream_NEW.nextNode()
                );

                // Haxe.g:208:109: ( declAttrList )?
                if ( stream_declAttrList.hasNext() ) {
                    adaptor.addChild(root_1, stream_declAttrList.nextTree());

                }
                stream_declAttrList.reset();

                // Haxe.g:208:123: ( paramList )?
                if ( stream_paramList.hasNext() ) {
                    adaptor.addChild(root_1, stream_paramList.nextTree());

                }
                stream_paramList.reset();

                // Haxe.g:208:134: ( typeTag )?
                if ( stream_typeTag.hasNext() ) {
                    adaptor.addChild(root_1, stream_typeTag.nextTree());

                }
                stream_typeTag.reset();

                // Haxe.g:208:143: ( block )?
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
            if ( state.backtracking>0 ) { memoize(input, 27, functionReturn_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "functionReturn"


    public static class statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "statement"
    // Haxe.g:211:1: statement : ( block | assignExpr SEMI !| varDecl | IF ^ parExpression statement ( ELSE ! statement )? | FOR LPAREN exp1= expr IN exp2= expr RPAREN statement -> ^( FOR ^( IN $exp1 $exp2) statement ) | WHILE ^ parExpression statement | DO ^ statement WHILE ! parExpression SEMI !| TRY ^ block ( catchStmt )+ | SWITCH ^ LPAREN ! expr RPAREN ! LBRACE ! ( caseStmt )+ RBRACE !| RETURN ^ ( expr )? SEMI !| THROW ^ expr SEMI !| BREAK ( IDENTIFIER )? SEMI -> ^( BREAK ( IDENTIFIER )? ) | CONTINUE ( IDENTIFIER )? SEMI -> ^( CONTINUE ( IDENTIFIER )? ) | expr SEMI !| IDENTIFIER COLON statement -> ^( COLON ( IDENTIFIER )? ( statement )? ) | SEMI !);
    public final HaxeParser.statement_return statement() throws RecognitionException {
        HaxeParser.statement_return retval = new HaxeParser.statement_return();
        retval.start = input.LT(1);

        int statement_StartIndex = input.index();

        Object root_0 = null;

        Token SEMI102=null;
        Token IF104=null;
        Token ELSE107=null;
        Token FOR109=null;
        Token LPAREN110=null;
        Token IN111=null;
        Token RPAREN112=null;
        Token WHILE114=null;
        Token DO117=null;
        Token WHILE119=null;
        Token SEMI121=null;
        Token TRY122=null;
        Token SWITCH125=null;
        Token LPAREN126=null;
        Token RPAREN128=null;
        Token LBRACE129=null;
        Token RBRACE131=null;
        Token RETURN132=null;
        Token SEMI134=null;
        Token THROW135=null;
        Token SEMI137=null;
        Token BREAK138=null;
        Token IDENTIFIER139=null;
        Token SEMI140=null;
        Token CONTINUE141=null;
        Token IDENTIFIER142=null;
        Token SEMI143=null;
        Token SEMI145=null;
        Token IDENTIFIER146=null;
        Token COLON147=null;
        Token SEMI149=null;
        HaxeParser.expr_return exp1 =null;

        HaxeParser.expr_return exp2 =null;

        HaxeParser.block_return block100 =null;

        HaxeParser.assignExpr_return assignExpr101 =null;

        HaxeParser.varDecl_return varDecl103 =null;

        HaxeParser.parExpression_return parExpression105 =null;

        HaxeParser.statement_return statement106 =null;

        HaxeParser.statement_return statement108 =null;

        HaxeParser.statement_return statement113 =null;

        HaxeParser.parExpression_return parExpression115 =null;

        HaxeParser.statement_return statement116 =null;

        HaxeParser.statement_return statement118 =null;

        HaxeParser.parExpression_return parExpression120 =null;

        HaxeParser.block_return block123 =null;

        HaxeParser.catchStmt_return catchStmt124 =null;

        HaxeParser.expr_return expr127 =null;

        HaxeParser.caseStmt_return caseStmt130 =null;

        HaxeParser.expr_return expr133 =null;

        HaxeParser.expr_return expr136 =null;

        HaxeParser.expr_return expr144 =null;

        HaxeParser.statement_return statement148 =null;


        Object SEMI102_tree=null;
        Object IF104_tree=null;
        Object ELSE107_tree=null;
        Object FOR109_tree=null;
        Object LPAREN110_tree=null;
        Object IN111_tree=null;
        Object RPAREN112_tree=null;
        Object WHILE114_tree=null;
        Object DO117_tree=null;
        Object WHILE119_tree=null;
        Object SEMI121_tree=null;
        Object TRY122_tree=null;
        Object SWITCH125_tree=null;
        Object LPAREN126_tree=null;
        Object RPAREN128_tree=null;
        Object LBRACE129_tree=null;
        Object RBRACE131_tree=null;
        Object RETURN132_tree=null;
        Object SEMI134_tree=null;
        Object THROW135_tree=null;
        Object SEMI137_tree=null;
        Object BREAK138_tree=null;
        Object IDENTIFIER139_tree=null;
        Object SEMI140_tree=null;
        Object CONTINUE141_tree=null;
        Object IDENTIFIER142_tree=null;
        Object SEMI143_tree=null;
        Object SEMI145_tree=null;
        Object IDENTIFIER146_tree=null;
        Object COLON147_tree=null;
        Object SEMI149_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_FOR=new RewriteRuleTokenStream(adaptor,"token FOR");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_IN=new RewriteRuleTokenStream(adaptor,"token IN");
        RewriteRuleTokenStream stream_CONTINUE=new RewriteRuleTokenStream(adaptor,"token CONTINUE");
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleTokenStream stream_BREAK=new RewriteRuleTokenStream(adaptor,"token BREAK");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return retval; }

            // Haxe.g:212:5: ( block | assignExpr SEMI !| varDecl | IF ^ parExpression statement ( ELSE ! statement )? | FOR LPAREN exp1= expr IN exp2= expr RPAREN statement -> ^( FOR ^( IN $exp1 $exp2) statement ) | WHILE ^ parExpression statement | DO ^ statement WHILE ! parExpression SEMI !| TRY ^ block ( catchStmt )+ | SWITCH ^ LPAREN ! expr RPAREN ! LBRACE ! ( caseStmt )+ RBRACE !| RETURN ^ ( expr )? SEMI !| THROW ^ expr SEMI !| BREAK ( IDENTIFIER )? SEMI -> ^( BREAK ( IDENTIFIER )? ) | CONTINUE ( IDENTIFIER )? SEMI -> ^( CONTINUE ( IDENTIFIER )? ) | expr SEMI !| IDENTIFIER COLON statement -> ^( COLON ( IDENTIFIER )? ( statement )? ) | SEMI !)
            int alt39=16;
            switch ( input.LA(1) ) {
            case LBRACE:
                {
                int LA39_1 = input.LA(2);

                if ( (synpred56_Haxe()) ) {
                    alt39=1;
                }
                else if ( (synpred57_Haxe()) ) {
                    alt39=2;
                }
                else if ( (synpred75_Haxe()) ) {
                    alt39=14;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 39, 1, input);

                    throw nvae;

                }
                }
                break;
            case SEMI:
                {
                int LA39_2 = input.LA(2);

                if ( (synpred56_Haxe()) ) {
                    alt39=1;
                }
                else if ( (true) ) {
                    alt39=16;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 39, 2, input);

                    throw nvae;

                }
                }
                break;
            case SUB:
                {
                int LA39_3 = input.LA(2);

                if ( (synpred57_Haxe()) ) {
                    alt39=2;
                }
                else if ( (synpred75_Haxe()) ) {
                    alt39=14;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 39, 3, input);

                    throw nvae;

                }
                }
                break;
            case SUBSUB:
                {
                int LA39_4 = input.LA(2);

                if ( (synpred57_Haxe()) ) {
                    alt39=2;
                }
                else if ( (synpred75_Haxe()) ) {
                    alt39=14;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 39, 4, input);

                    throw nvae;

                }
                }
                break;
            case PLUSPLUS:
                {
                int LA39_5 = input.LA(2);

                if ( (synpred57_Haxe()) ) {
                    alt39=2;
                }
                else if ( (synpred75_Haxe()) ) {
                    alt39=14;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 39, 5, input);

                    throw nvae;

                }
                }
                break;
            case BANG:
                {
                int LA39_6 = input.LA(2);

                if ( (synpred57_Haxe()) ) {
                    alt39=2;
                }
                else if ( (synpred75_Haxe()) ) {
                    alt39=14;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 39, 6, input);

                    throw nvae;

                }
                }
                break;
            case TILDE:
                {
                int LA39_7 = input.LA(2);

                if ( (synpred57_Haxe()) ) {
                    alt39=2;
                }
                else if ( (synpred75_Haxe()) ) {
                    alt39=14;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 39, 7, input);

                    throw nvae;

                }
                }
                break;
            case NEW:
                {
                int LA39_8 = input.LA(2);

                if ( (synpred57_Haxe()) ) {
                    alt39=2;
                }
                else if ( (synpred75_Haxe()) ) {
                    alt39=14;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 39, 8, input);

                    throw nvae;

                }
                }
                break;
            case CAST:
                {
                int LA39_9 = input.LA(2);

                if ( (synpred57_Haxe()) ) {
                    alt39=2;
                }
                else if ( (synpred75_Haxe()) ) {
                    alt39=14;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 39, 9, input);

                    throw nvae;

                }
                }
                break;
            case FUNCTION:
                {
                int LA39_10 = input.LA(2);

                if ( (synpred57_Haxe()) ) {
                    alt39=2;
                }
                else if ( (synpred75_Haxe()) ) {
                    alt39=14;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 39, 10, input);

                    throw nvae;

                }
                }
                break;
            case LBRACKET:
                {
                int LA39_11 = input.LA(2);

                if ( (synpred57_Haxe()) ) {
                    alt39=2;
                }
                else if ( (synpred75_Haxe()) ) {
                    alt39=14;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 39, 11, input);

                    throw nvae;

                }
                }
                break;
            case LONGLITERAL:
                {
                int LA39_12 = input.LA(2);

                if ( (synpred57_Haxe()) ) {
                    alt39=2;
                }
                else if ( (synpred75_Haxe()) ) {
                    alt39=14;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 39, 12, input);

                    throw nvae;

                }
                }
                break;
            case NULL:
                {
                int LA39_13 = input.LA(2);

                if ( (synpred57_Haxe()) ) {
                    alt39=2;
                }
                else if ( (synpred75_Haxe()) ) {
                    alt39=14;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 39, 13, input);

                    throw nvae;

                }
                }
                break;
            case INTLITERAL:
                {
                int LA39_14 = input.LA(2);

                if ( (synpred57_Haxe()) ) {
                    alt39=2;
                }
                else if ( (synpred75_Haxe()) ) {
                    alt39=14;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 39, 14, input);

                    throw nvae;

                }
                }
                break;
            case STRINGLITERAL:
                {
                int LA39_15 = input.LA(2);

                if ( (synpred57_Haxe()) ) {
                    alt39=2;
                }
                else if ( (synpred75_Haxe()) ) {
                    alt39=14;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 39, 15, input);

                    throw nvae;

                }
                }
                break;
            case CHARLITERAL:
                {
                int LA39_16 = input.LA(2);

                if ( (synpred57_Haxe()) ) {
                    alt39=2;
                }
                else if ( (synpred75_Haxe()) ) {
                    alt39=14;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 39, 16, input);

                    throw nvae;

                }
                }
                break;
            case FLOATNUM:
                {
                int LA39_17 = input.LA(2);

                if ( (synpred57_Haxe()) ) {
                    alt39=2;
                }
                else if ( (synpred75_Haxe()) ) {
                    alt39=14;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 39, 17, input);

                    throw nvae;

                }
                }
                break;
            case TRUE:
                {
                int LA39_18 = input.LA(2);

                if ( (synpred57_Haxe()) ) {
                    alt39=2;
                }
                else if ( (synpred75_Haxe()) ) {
                    alt39=14;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 39, 18, input);

                    throw nvae;

                }
                }
                break;
            case FALSE:
                {
                int LA39_19 = input.LA(2);

                if ( (synpred57_Haxe()) ) {
                    alt39=2;
                }
                else if ( (synpred75_Haxe()) ) {
                    alt39=14;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 39, 19, input);

                    throw nvae;

                }
                }
                break;
            case LPAREN:
                {
                int LA39_20 = input.LA(2);

                if ( (synpred57_Haxe()) ) {
                    alt39=2;
                }
                else if ( (synpred75_Haxe()) ) {
                    alt39=14;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 39, 20, input);

                    throw nvae;

                }
                }
                break;
            case IDENTIFIER:
                {
                int LA39_21 = input.LA(2);

                if ( (synpred57_Haxe()) ) {
                    alt39=2;
                }
                else if ( (synpred75_Haxe()) ) {
                    alt39=14;
                }
                else if ( (synpred76_Haxe()) ) {
                    alt39=15;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 39, 21, input);

                    throw nvae;

                }
                }
                break;
            case THIS:
                {
                int LA39_22 = input.LA(2);

                if ( (synpred57_Haxe()) ) {
                    alt39=2;
                }
                else if ( (synpred75_Haxe()) ) {
                    alt39=14;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 39, 22, input);

                    throw nvae;

                }
                }
                break;
            case VAR:
                {
                alt39=3;
                }
                break;
            case IF:
                {
                alt39=4;
                }
                break;
            case FOR:
                {
                alt39=5;
                }
                break;
            case WHILE:
                {
                alt39=6;
                }
                break;
            case DO:
                {
                alt39=7;
                }
                break;
            case TRY:
                {
                alt39=8;
                }
                break;
            case SWITCH:
                {
                alt39=9;
                }
                break;
            case RETURN:
                {
                alt39=10;
                }
                break;
            case THROW:
                {
                alt39=11;
                }
                break;
            case BREAK:
                {
                alt39=12;
                }
                break;
            case CONTINUE:
                {
                alt39=13;
                }
                break;
            case UNTYPED:
                {
                alt39=14;
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
                    // Haxe.g:212:10: block
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_block_in_statement1986);
                    block100=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, block100.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:213:10: assignExpr SEMI !
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_assignExpr_in_statement1997);
                    assignExpr101=assignExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignExpr101.getTree());

                    SEMI102=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement1999); if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // Haxe.g:214:10: varDecl
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_varDecl_in_statement2011);
                    varDecl103=varDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDecl103.getTree());

                    }
                    break;
                case 4 :
                    // Haxe.g:215:19: IF ^ parExpression statement ( ELSE ! statement )?
                    {
                    root_0 = (Object)adaptor.nil();


                    IF104=(Token)match(input,IF,FOLLOW_IF_in_statement2031); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IF104_tree = 
                    new IfNode(IF104) 
                    ;
                    root_0 = (Object)adaptor.becomeRoot(IF104_tree, root_0);
                    }

                    pushFollow(FOLLOW_parExpression_in_statement2037);
                    parExpression105=parExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, parExpression105.getTree());

                    pushFollow(FOLLOW_statement_in_statement2039);
                    statement106=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement106.getTree());

                    // Haxe.g:215:55: ( ELSE ! statement )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==ELSE) ) {
                        int LA33_1 = input.LA(2);

                        if ( (synpred59_Haxe()) ) {
                            alt33=1;
                        }
                    }
                    switch (alt33) {
                        case 1 :
                            // Haxe.g:215:56: ELSE ! statement
                            {
                            ELSE107=(Token)match(input,ELSE,FOLLOW_ELSE_in_statement2042); if (state.failed) return retval;

                            pushFollow(FOLLOW_statement_in_statement2045);
                            statement108=statement();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, statement108.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 5 :
                    // Haxe.g:216:19: FOR LPAREN exp1= expr IN exp2= expr RPAREN statement
                    {
                    FOR109=(Token)match(input,FOR,FOLLOW_FOR_in_statement2067); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FOR.add(FOR109);


                    LPAREN110=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_statement2069); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN110);


                    pushFollow(FOLLOW_expr_in_statement2073);
                    exp1=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(exp1.getTree());

                    IN111=(Token)match(input,IN,FOLLOW_IN_in_statement2075); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IN.add(IN111);


                    pushFollow(FOLLOW_expr_in_statement2079);
                    exp2=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(exp2.getTree());

                    RPAREN112=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_statement2081); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN112);


                    pushFollow(FOLLOW_statement_in_statement2083);
                    statement113=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement113.getTree());

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
                    // 216:70: -> ^( FOR ^( IN $exp1 $exp2) statement )
                    {
                        // Haxe.g:216:73: ^( FOR ^( IN $exp1 $exp2) statement )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        new ForNode(stream_FOR.nextToken())
                        , root_1);

                        // Haxe.g:216:88: ^( IN $exp1 $exp2)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        stream_IN.nextNode()
                        , root_2);

                        adaptor.addChild(root_2, stream_exp1.nextTree());

                        adaptor.addChild(root_2, stream_exp2.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_1, stream_statement.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 6 :
                    // Haxe.g:217:19: WHILE ^ parExpression statement
                    {
                    root_0 = (Object)adaptor.nil();


                    WHILE114=(Token)match(input,WHILE,FOLLOW_WHILE_in_statement2124); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    WHILE114_tree = 
                    new WhileNode(WHILE114) 
                    ;
                    root_0 = (Object)adaptor.becomeRoot(WHILE114_tree, root_0);
                    }

                    pushFollow(FOLLOW_parExpression_in_statement2130);
                    parExpression115=parExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, parExpression115.getTree());

                    pushFollow(FOLLOW_statement_in_statement2132);
                    statement116=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement116.getTree());

                    }
                    break;
                case 7 :
                    // Haxe.g:218:19: DO ^ statement WHILE ! parExpression SEMI !
                    {
                    root_0 = (Object)adaptor.nil();


                    DO117=(Token)match(input,DO,FOLLOW_DO_in_statement2152); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DO117_tree = 
                    new DoWhileNode(DO117) 
                    ;
                    root_0 = (Object)adaptor.becomeRoot(DO117_tree, root_0);
                    }

                    pushFollow(FOLLOW_statement_in_statement2158);
                    statement118=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement118.getTree());

                    WHILE119=(Token)match(input,WHILE,FOLLOW_WHILE_in_statement2160); if (state.failed) return retval;

                    pushFollow(FOLLOW_parExpression_in_statement2163);
                    parExpression120=parExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, parExpression120.getTree());

                    SEMI121=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement2165); if (state.failed) return retval;

                    }
                    break;
                case 8 :
                    // Haxe.g:219:19: TRY ^ block ( catchStmt )+
                    {
                    root_0 = (Object)adaptor.nil();


                    TRY122=(Token)match(input,TRY,FOLLOW_TRY_in_statement2186); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    TRY122_tree = 
                    new TryNode(TRY122) 
                    ;
                    root_0 = (Object)adaptor.becomeRoot(TRY122_tree, root_0);
                    }

                    pushFollow(FOLLOW_block_in_statement2192);
                    block123=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, block123.getTree());

                    // Haxe.g:219:39: ( catchStmt )+
                    int cnt34=0;
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==CATCH) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // Haxe.g:219:39: catchStmt
                    	    {
                    	    pushFollow(FOLLOW_catchStmt_in_statement2194);
                    	    catchStmt124=catchStmt();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, catchStmt124.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt34 >= 1 ) break loop34;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(34, input);
                                throw eee;
                        }
                        cnt34++;
                    } while (true);


                    }
                    break;
                case 9 :
                    // Haxe.g:220:19: SWITCH ^ LPAREN ! expr RPAREN ! LBRACE ! ( caseStmt )+ RBRACE !
                    {
                    root_0 = (Object)adaptor.nil();


                    SWITCH125=(Token)match(input,SWITCH,FOLLOW_SWITCH_in_statement2215); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SWITCH125_tree = 
                    new SwitchNode(SWITCH125) 
                    ;
                    root_0 = (Object)adaptor.becomeRoot(SWITCH125_tree, root_0);
                    }

                    LPAREN126=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_statement2221); if (state.failed) return retval;

                    pushFollow(FOLLOW_expr_in_statement2224);
                    expr127=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr127.getTree());

                    RPAREN128=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_statement2226); if (state.failed) return retval;

                    LBRACE129=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_statement2229); if (state.failed) return retval;

                    // Haxe.g:220:68: ( caseStmt )+
                    int cnt35=0;
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==CASE||LA35_0==DEFAULT) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // Haxe.g:220:68: caseStmt
                    	    {
                    	    pushFollow(FOLLOW_caseStmt_in_statement2232);
                    	    caseStmt130=caseStmt();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, caseStmt130.getTree());

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


                    RBRACE131=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_statement2235); if (state.failed) return retval;

                    }
                    break;
                case 10 :
                    // Haxe.g:221:19: RETURN ^ ( expr )? SEMI !
                    {
                    root_0 = (Object)adaptor.nil();


                    RETURN132=(Token)match(input,RETURN,FOLLOW_RETURN_in_statement2256); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RETURN132_tree = 
                    new ReturnNode(RETURN132) 
                    ;
                    root_0 = (Object)adaptor.becomeRoot(RETURN132_tree, root_0);
                    }

                    // Haxe.g:221:39: ( expr )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==BANG||LA36_0==CAST||LA36_0==CHARLITERAL||LA36_0==FALSE||LA36_0==FLOATNUM||LA36_0==FUNCTION||LA36_0==IDENTIFIER||LA36_0==INTLITERAL||(LA36_0 >= LBRACE && LA36_0 <= LBRACKET)||(LA36_0 >= LONGLITERAL && LA36_0 <= LPAREN)||(LA36_0 >= NEW && LA36_0 <= NULL)||LA36_0==PLUSPLUS||(LA36_0 >= STRINGLITERAL && LA36_0 <= SUB)||LA36_0==SUBSUB||LA36_0==THIS||LA36_0==TILDE||LA36_0==TRUE||LA36_0==UNTYPED) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // Haxe.g:221:39: expr
                            {
                            pushFollow(FOLLOW_expr_in_statement2262);
                            expr133=expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr133.getTree());

                            }
                            break;

                    }


                    SEMI134=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement2265); if (state.failed) return retval;

                    }
                    break;
                case 11 :
                    // Haxe.g:222:19: THROW ^ expr SEMI !
                    {
                    root_0 = (Object)adaptor.nil();


                    THROW135=(Token)match(input,THROW,FOLLOW_THROW_in_statement2286); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    THROW135_tree = 
                    (Object)adaptor.create(THROW135)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(THROW135_tree, root_0);
                    }

                    pushFollow(FOLLOW_expr_in_statement2289);
                    expr136=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr136.getTree());

                    SEMI137=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement2291); if (state.failed) return retval;

                    }
                    break;
                case 12 :
                    // Haxe.g:223:10: BREAK ( IDENTIFIER )? SEMI
                    {
                    BREAK138=(Token)match(input,BREAK,FOLLOW_BREAK_in_statement2303); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_BREAK.add(BREAK138);


                    // Haxe.g:223:16: ( IDENTIFIER )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==IDENTIFIER) ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // Haxe.g:223:17: IDENTIFIER
                            {
                            IDENTIFIER139=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_statement2306); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER139);


                            }
                            break;

                    }


                    SEMI140=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement2310); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI140);


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
                    // 223:50: -> ^( BREAK ( IDENTIFIER )? )
                    {
                        // Haxe.g:223:53: ^( BREAK ( IDENTIFIER )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_BREAK.nextNode()
                        , root_1);

                        // Haxe.g:223:61: ( IDENTIFIER )?
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
                    // Haxe.g:224:10: CONTINUE ( IDENTIFIER )? SEMI
                    {
                    CONTINUE141=(Token)match(input,CONTINUE,FOLLOW_CONTINUE_in_statement2345); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CONTINUE.add(CONTINUE141);


                    // Haxe.g:224:19: ( IDENTIFIER )?
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==IDENTIFIER) ) {
                        alt38=1;
                    }
                    switch (alt38) {
                        case 1 :
                            // Haxe.g:224:20: IDENTIFIER
                            {
                            IDENTIFIER142=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_statement2348); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER142);


                            }
                            break;

                    }


                    SEMI143=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement2352); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI143);


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
                    // 224:54: -> ^( CONTINUE ( IDENTIFIER )? )
                    {
                        // Haxe.g:224:57: ^( CONTINUE ( IDENTIFIER )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_CONTINUE.nextNode()
                        , root_1);

                        // Haxe.g:224:68: ( IDENTIFIER )?
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
                    // Haxe.g:225:10: expr SEMI !
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_expr_in_statement2388);
                    expr144=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr144.getTree());

                    SEMI145=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement2391); if (state.failed) return retval;

                    }
                    break;
                case 15 :
                    // Haxe.g:226:10: IDENTIFIER COLON statement
                    {
                    IDENTIFIER146=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_statement2403); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER146);


                    COLON147=(Token)match(input,COLON,FOLLOW_COLON_in_statement2405); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(COLON147);


                    pushFollow(FOLLOW_statement_in_statement2407);
                    statement148=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement148.getTree());

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
                    // 226:53: -> ^( COLON ( IDENTIFIER )? ( statement )? )
                    {
                        // Haxe.g:226:56: ^( COLON ( IDENTIFIER )? ( statement )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_COLON.nextNode()
                        , root_1);

                        // Haxe.g:226:64: ( IDENTIFIER )?
                        if ( stream_IDENTIFIER.hasNext() ) {
                            adaptor.addChild(root_1, 
                            stream_IDENTIFIER.nextNode()
                            );

                        }
                        stream_IDENTIFIER.reset();

                        // Haxe.g:226:76: ( statement )?
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
                    // Haxe.g:227:10: SEMI !
                    {
                    root_0 = (Object)adaptor.nil();


                    SEMI149=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement2446); if (state.failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
            if ( state.backtracking>0 ) { memoize(input, 28, statement_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "statement"


    public static class parExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "parExpression"
    // Haxe.g:230:1: parExpression : LPAREN ! expr RPAREN !;
    public final HaxeParser.parExpression_return parExpression() throws RecognitionException {
        HaxeParser.parExpression_return retval = new HaxeParser.parExpression_return();
        retval.start = input.LT(1);

        int parExpression_StartIndex = input.index();

        Object root_0 = null;

        Token LPAREN150=null;
        Token RPAREN152=null;
        HaxeParser.expr_return expr151 =null;


        Object LPAREN150_tree=null;
        Object RPAREN152_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return retval; }

            // Haxe.g:231:5: ( LPAREN ! expr RPAREN !)
            // Haxe.g:231:9: LPAREN ! expr RPAREN !
            {
            root_0 = (Object)adaptor.nil();


            LPAREN150=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_parExpression2470); if (state.failed) return retval;

            pushFollow(FOLLOW_expr_in_parExpression2473);
            expr151=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr151.getTree());

            RPAREN152=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_parExpression2475); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
            if ( state.backtracking>0 ) { memoize(input, 29, parExpression_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "parExpression"


    public static class block_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "block"
    // Haxe.g:234:1: block : ( LBRACE ( blockStmt )* RBRACE -> ^( BLOCK_SCOPE[$LBRACE, $RBRACE] ( blockStmt )* ) | SEMI !);
    public final HaxeParser.block_return block() throws RecognitionException {
        HaxeParser.block_return retval = new HaxeParser.block_return();
        retval.start = input.LT(1);

        int block_StartIndex = input.index();

        Object root_0 = null;

        Token LBRACE153=null;
        Token RBRACE155=null;
        Token SEMI156=null;
        HaxeParser.blockStmt_return blockStmt154 =null;


        Object LBRACE153_tree=null;
        Object RBRACE155_tree=null;
        Object SEMI156_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_blockStmt=new RewriteRuleSubtreeStream(adaptor,"rule blockStmt");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return retval; }

            // Haxe.g:234:17: ( LBRACE ( blockStmt )* RBRACE -> ^( BLOCK_SCOPE[$LBRACE, $RBRACE] ( blockStmt )* ) | SEMI !)
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
                    // Haxe.g:234:19: LBRACE ( blockStmt )* RBRACE
                    {
                    LBRACE153=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_block2499); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LBRACE.add(LBRACE153);


                    // Haxe.g:234:26: ( blockStmt )*
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0==BANG||LA40_0==BREAK||LA40_0==CAST||(LA40_0 >= CHARLITERAL && LA40_0 <= CLASS)||LA40_0==CONTINUE||LA40_0==DO||LA40_0==EXTERN||LA40_0==FALSE||(LA40_0 >= FLOATNUM && LA40_0 <= FUNCTION)||(LA40_0 >= IDENTIFIER && LA40_0 <= IF)||LA40_0==INTLITERAL||(LA40_0 >= LBRACE && LA40_0 <= LBRACKET)||(LA40_0 >= LONGLITERAL && LA40_0 <= LPAREN)||(LA40_0 >= NEW && LA40_0 <= NULL)||LA40_0==PLUSPLUS||LA40_0==PRIVATE||LA40_0==RETURN||LA40_0==SEMI||(LA40_0 >= STRINGLITERAL && LA40_0 <= SUB)||LA40_0==SUBSUB||(LA40_0 >= SWITCH && LA40_0 <= THROW)||LA40_0==TILDE||(LA40_0 >= TRUE && LA40_0 <= TRY)||LA40_0==UNTYPED||LA40_0==VAR||LA40_0==WHILE) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // Haxe.g:234:27: blockStmt
                    	    {
                    	    pushFollow(FOLLOW_blockStmt_in_block2502);
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


                    RBRACE155=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_block2506); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RBRACE.add(RBRACE155);


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
                    // 234:46: -> ^( BLOCK_SCOPE[$LBRACE, $RBRACE] ( blockStmt )* )
                    {
                        // Haxe.g:234:49: ^( BLOCK_SCOPE[$LBRACE, $RBRACE] ( blockStmt )* )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        new BlockScopeNode(BLOCK_SCOPE, LBRACE153, RBRACE155)
                        , root_1);

                        // Haxe.g:234:97: ( blockStmt )*
                        while ( stream_blockStmt.hasNext() ) {
                            adaptor.addChild(root_1, stream_blockStmt.nextTree());

                        }
                        stream_blockStmt.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // Haxe.g:235:19: SEMI !
                    {
                    root_0 = (Object)adaptor.nil();


                    SEMI156=(Token)match(input,SEMI,FOLLOW_SEMI_in_block2540); if (state.failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
            if ( state.backtracking>0 ) { memoize(input, 30, block_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "block"


    public static class blockStmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "blockStmt"
    // Haxe.g:238:1: blockStmt : ( varDecl | classDecl | statement );
    public final HaxeParser.blockStmt_return blockStmt() throws RecognitionException {
        HaxeParser.blockStmt_return retval = new HaxeParser.blockStmt_return();
        retval.start = input.LT(1);

        int blockStmt_StartIndex = input.index();

        Object root_0 = null;

        HaxeParser.varDecl_return varDecl157 =null;

        HaxeParser.classDecl_return classDecl158 =null;

        HaxeParser.statement_return statement159 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return retval; }

            // Haxe.g:239:5: ( varDecl | classDecl | statement )
            int alt42=3;
            switch ( input.LA(1) ) {
            case VAR:
                {
                int LA42_1 = input.LA(2);

                if ( (synpred79_Haxe()) ) {
                    alt42=1;
                }
                else if ( (true) ) {
                    alt42=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 42, 1, input);

                    throw nvae;

                }
                }
                break;
            case CLASS:
            case EXTERN:
            case PRIVATE:
                {
                alt42=2;
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
            case LBRACKET:
            case LONGLITERAL:
            case LPAREN:
            case NEW:
            case NULL:
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
                    // Haxe.g:239:10: varDecl
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_varDecl_in_blockStmt2573);
                    varDecl157=varDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDecl157.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:240:10: classDecl
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_classDecl_in_blockStmt2584);
                    classDecl158=classDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, classDecl158.getTree());

                    }
                    break;
                case 3 :
                    // Haxe.g:241:10: statement
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_statement_in_blockStmt2595);
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
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 31, blockStmt_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "blockStmt"


    public static class breakStmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "breakStmt"
    // Haxe.g:244:1: breakStmt : BREAK SEMI !;
    public final HaxeParser.breakStmt_return breakStmt() throws RecognitionException {
        HaxeParser.breakStmt_return retval = new HaxeParser.breakStmt_return();
        retval.start = input.LT(1);

        int breakStmt_StartIndex = input.index();

        Object root_0 = null;

        Token BREAK160=null;
        Token SEMI161=null;

        Object BREAK160_tree=null;
        Object SEMI161_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return retval; }

            // Haxe.g:244:17: ( BREAK SEMI !)
            // Haxe.g:244:19: BREAK SEMI !
            {
            root_0 = (Object)adaptor.nil();


            BREAK160=(Token)match(input,BREAK,FOLLOW_BREAK_in_breakStmt2618); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            BREAK160_tree = 
            (Object)adaptor.create(BREAK160)
            ;
            adaptor.addChild(root_0, BREAK160_tree);
            }

            SEMI161=(Token)match(input,SEMI,FOLLOW_SEMI_in_breakStmt2620); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
            if ( state.backtracking>0 ) { memoize(input, 32, breakStmt_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "breakStmt"


    public static class continueStmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "continueStmt"
    // Haxe.g:247:1: continueStmt : CONTINUE SEMI !;
    public final HaxeParser.continueStmt_return continueStmt() throws RecognitionException {
        HaxeParser.continueStmt_return retval = new HaxeParser.continueStmt_return();
        retval.start = input.LT(1);

        int continueStmt_StartIndex = input.index();

        Object root_0 = null;

        Token CONTINUE162=null;
        Token SEMI163=null;

        Object CONTINUE162_tree=null;
        Object SEMI163_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return retval; }

            // Haxe.g:247:17: ( CONTINUE SEMI !)
            // Haxe.g:247:19: CONTINUE SEMI !
            {
            root_0 = (Object)adaptor.nil();


            CONTINUE162=(Token)match(input,CONTINUE,FOLLOW_CONTINUE_in_continueStmt2653); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            CONTINUE162_tree = 
            (Object)adaptor.create(CONTINUE162)
            ;
            adaptor.addChild(root_0, CONTINUE162_tree);
            }

            SEMI163=(Token)match(input,SEMI,FOLLOW_SEMI_in_continueStmt2655); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
            if ( state.backtracking>0 ) { memoize(input, 33, continueStmt_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "continueStmt"


    public static class caseStmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "caseStmt"
    // Haxe.g:250:1: caseStmt : ( CASE ^ exprList COLON ! statement | DEFAULT ^ COLON ! statement );
    public final HaxeParser.caseStmt_return caseStmt() throws RecognitionException {
        HaxeParser.caseStmt_return retval = new HaxeParser.caseStmt_return();
        retval.start = input.LT(1);

        int caseStmt_StartIndex = input.index();

        Object root_0 = null;

        Token CASE164=null;
        Token COLON166=null;
        Token DEFAULT168=null;
        Token COLON169=null;
        HaxeParser.exprList_return exprList165 =null;

        HaxeParser.statement_return statement167 =null;

        HaxeParser.statement_return statement170 =null;


        Object CASE164_tree=null;
        Object COLON166_tree=null;
        Object DEFAULT168_tree=null;
        Object COLON169_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return retval; }

            // Haxe.g:250:17: ( CASE ^ exprList COLON ! statement | DEFAULT ^ COLON ! statement )
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
                    // Haxe.g:250:19: CASE ^ exprList COLON ! statement
                    {
                    root_0 = (Object)adaptor.nil();


                    CASE164=(Token)match(input,CASE,FOLLOW_CASE_in_caseStmt2692); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CASE164_tree = 
                    (Object)adaptor.create(CASE164)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(CASE164_tree, root_0);
                    }

                    pushFollow(FOLLOW_exprList_in_caseStmt2695);
                    exprList165=exprList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, exprList165.getTree());

                    COLON166=(Token)match(input,COLON,FOLLOW_COLON_in_caseStmt2697); if (state.failed) return retval;

                    pushFollow(FOLLOW_statement_in_caseStmt2700);
                    statement167=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement167.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:251:19: DEFAULT ^ COLON ! statement
                    {
                    root_0 = (Object)adaptor.nil();


                    DEFAULT168=(Token)match(input,DEFAULT,FOLLOW_DEFAULT_in_caseStmt2720); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DEFAULT168_tree = 
                    (Object)adaptor.create(DEFAULT168)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(DEFAULT168_tree, root_0);
                    }

                    COLON169=(Token)match(input,COLON,FOLLOW_COLON_in_caseStmt2723); if (state.failed) return retval;

                    pushFollow(FOLLOW_statement_in_caseStmt2726);
                    statement170=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement170.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
            if ( state.backtracking>0 ) { memoize(input, 34, caseStmt_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "caseStmt"


    public static class catchStmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "catchStmt"
    // Haxe.g:254:1: catchStmt : CATCH ^ LPAREN ! param RPAREN ! block ;
    public final HaxeParser.catchStmt_return catchStmt() throws RecognitionException {
        HaxeParser.catchStmt_return retval = new HaxeParser.catchStmt_return();
        retval.start = input.LT(1);

        int catchStmt_StartIndex = input.index();

        Object root_0 = null;

        Token CATCH171=null;
        Token LPAREN172=null;
        Token RPAREN174=null;
        HaxeParser.param_return param173 =null;

        HaxeParser.block_return block175 =null;


        Object CATCH171_tree=null;
        Object LPAREN172_tree=null;
        Object RPAREN174_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return retval; }

            // Haxe.g:255:3: ( CATCH ^ LPAREN ! param RPAREN ! block )
            // Haxe.g:255:3: CATCH ^ LPAREN ! param RPAREN ! block
            {
            root_0 = (Object)adaptor.nil();


            CATCH171=(Token)match(input,CATCH,FOLLOW_CATCH_in_catchStmt2762); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            CATCH171_tree = 
            new HaxeTree(CATCH171) 
            ;
            root_0 = (Object)adaptor.becomeRoot(CATCH171_tree, root_0);
            }

            LPAREN172=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_catchStmt2768); if (state.failed) return retval;

            pushFollow(FOLLOW_param_in_catchStmt2771);
            param173=param();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, param173.getTree());

            RPAREN174=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_catchStmt2773); if (state.failed) return retval;

            pushFollow(FOLLOW_block_in_catchStmt2776);
            block175=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, block175.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
            if ( state.backtracking>0 ) { memoize(input, 35, catchStmt_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "catchStmt"


    public static class exprList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "exprList"
    // Haxe.g:259:1: exprList : expr ( COMMA ! expr )* ;
    public final HaxeParser.exprList_return exprList() throws RecognitionException {
        HaxeParser.exprList_return retval = new HaxeParser.exprList_return();
        retval.start = input.LT(1);

        int exprList_StartIndex = input.index();

        Object root_0 = null;

        Token COMMA177=null;
        HaxeParser.expr_return expr176 =null;

        HaxeParser.expr_return expr178 =null;


        Object COMMA177_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return retval; }

            // Haxe.g:260:5: ( expr ( COMMA ! expr )* )
            // Haxe.g:260:10: expr ( COMMA ! expr )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_expr_in_exprList2798);
            expr176=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr176.getTree());

            // Haxe.g:260:15: ( COMMA ! expr )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==COMMA) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // Haxe.g:260:16: COMMA ! expr
            	    {
            	    COMMA177=(Token)match(input,COMMA,FOLLOW_COMMA_in_exprList2801); if (state.failed) return retval;

            	    pushFollow(FOLLOW_expr_in_exprList2804);
            	    expr178=expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr178.getTree());

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
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 36, exprList_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "exprList"


    public static class expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expr"
    // Haxe.g:263:1: expr : ( assignExpr | UNTYPED assignExpr -> ^( UNTYPED assignExpr ) );
    public final HaxeParser.expr_return expr() throws RecognitionException {
        HaxeParser.expr_return retval = new HaxeParser.expr_return();
        retval.start = input.LT(1);

        int expr_StartIndex = input.index();

        Object root_0 = null;

        Token UNTYPED180=null;
        HaxeParser.assignExpr_return assignExpr179 =null;

        HaxeParser.assignExpr_return assignExpr181 =null;


        Object UNTYPED180_tree=null;
        RewriteRuleTokenStream stream_UNTYPED=new RewriteRuleTokenStream(adaptor,"token UNTYPED");
        RewriteRuleSubtreeStream stream_assignExpr=new RewriteRuleSubtreeStream(adaptor,"rule assignExpr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return retval; }

            // Haxe.g:264:5: ( assignExpr | UNTYPED assignExpr -> ^( UNTYPED assignExpr ) )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==BANG||LA45_0==CAST||LA45_0==CHARLITERAL||LA45_0==FALSE||LA45_0==FLOATNUM||LA45_0==FUNCTION||LA45_0==IDENTIFIER||LA45_0==INTLITERAL||(LA45_0 >= LBRACE && LA45_0 <= LBRACKET)||(LA45_0 >= LONGLITERAL && LA45_0 <= LPAREN)||(LA45_0 >= NEW && LA45_0 <= NULL)||LA45_0==PLUSPLUS||(LA45_0 >= STRINGLITERAL && LA45_0 <= SUB)||LA45_0==SUBSUB||LA45_0==THIS||LA45_0==TILDE||LA45_0==TRUE) ) {
                alt45=1;
            }
            else if ( (LA45_0==UNTYPED) ) {
                alt45=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;

            }
            switch (alt45) {
                case 1 :
                    // Haxe.g:264:10: assignExpr
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_assignExpr_in_expr2830);
                    assignExpr179=assignExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignExpr179.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:265:10: UNTYPED assignExpr
                    {
                    UNTYPED180=(Token)match(input,UNTYPED,FOLLOW_UNTYPED_in_expr2841); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_UNTYPED.add(UNTYPED180);


                    pushFollow(FOLLOW_assignExpr_in_expr2843);
                    assignExpr181=assignExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_assignExpr.add(assignExpr181.getTree());

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
                    // 265:32: -> ^( UNTYPED assignExpr )
                    {
                        // Haxe.g:265:35: ^( UNTYPED assignExpr )
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
            if ( state.backtracking>0 ) { memoize(input, 37, expr_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "expr"


    public static class assignExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assignExpr"
    // Haxe.g:268:1: assignExpr : iterExpr ( assignOp ^ iterExpr )? ;
    public final HaxeParser.assignExpr_return assignExpr() throws RecognitionException {
        HaxeParser.assignExpr_return retval = new HaxeParser.assignExpr_return();
        retval.start = input.LT(1);

        int assignExpr_StartIndex = input.index();

        Object root_0 = null;

        HaxeParser.iterExpr_return iterExpr182 =null;

        HaxeParser.assignOp_return assignOp183 =null;

        HaxeParser.iterExpr_return iterExpr184 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return retval; }

            // Haxe.g:269:5: ( iterExpr ( assignOp ^ iterExpr )? )
            // Haxe.g:269:11: iterExpr ( assignOp ^ iterExpr )?
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_iterExpr_in_assignExpr2875);
            iterExpr182=iterExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, iterExpr182.getTree());

            // Haxe.g:269:20: ( assignOp ^ iterExpr )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==AMPEQ||LA46_0==BAREQ||LA46_0==CARETEQ||LA46_0==EQ||LA46_0==GTGTEQ||LA46_0==GTGTGTEQ||LA46_0==LTLTEQ||LA46_0==PERCENTEQ||LA46_0==PLUSEQ||LA46_0==SLASHEQ||LA46_0==STAREQ||LA46_0==SUBEQ) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // Haxe.g:269:21: assignOp ^ iterExpr
                    {
                    pushFollow(FOLLOW_assignOp_in_assignExpr2878);
                    assignOp183=assignOp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(assignOp183.getTree(), root_0);

                    pushFollow(FOLLOW_iterExpr_in_assignExpr2881);
                    iterExpr184=iterExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, iterExpr184.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 38, assignExpr_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "assignExpr"


    public static class iterExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "iterExpr"
    // Haxe.g:273:1: iterExpr : ternaryExpr ( ELLIPSIS ^ ternaryExpr )? ;
    public final HaxeParser.iterExpr_return iterExpr() throws RecognitionException {
        HaxeParser.iterExpr_return retval = new HaxeParser.iterExpr_return();
        retval.start = input.LT(1);

        int iterExpr_StartIndex = input.index();

        Object root_0 = null;

        Token ELLIPSIS186=null;
        HaxeParser.ternaryExpr_return ternaryExpr185 =null;

        HaxeParser.ternaryExpr_return ternaryExpr187 =null;


        Object ELLIPSIS186_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return retval; }

            // Haxe.g:273:17: ( ternaryExpr ( ELLIPSIS ^ ternaryExpr )? )
            // Haxe.g:273:19: ternaryExpr ( ELLIPSIS ^ ternaryExpr )?
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_ternaryExpr_in_iterExpr2909);
            ternaryExpr185=ternaryExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, ternaryExpr185.getTree());

            // Haxe.g:273:31: ( ELLIPSIS ^ ternaryExpr )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==ELLIPSIS) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // Haxe.g:274:21: ELLIPSIS ^ ternaryExpr
                    {
                    ELLIPSIS186=(Token)match(input,ELLIPSIS,FOLLOW_ELLIPSIS_in_iterExpr2933); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ELLIPSIS186_tree = 
                    new BinaryExpressionNode(ELLIPSIS186) 
                    ;
                    root_0 = (Object)adaptor.becomeRoot(ELLIPSIS186_tree, root_0);
                    }

                    pushFollow(FOLLOW_ternaryExpr_in_iterExpr2939);
                    ternaryExpr187=ternaryExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ternaryExpr187.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 39, iterExpr_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "iterExpr"


    public static class ternaryExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ternaryExpr"
    // Haxe.g:277:1: ternaryExpr : logicOrExpr ( QUES ^ expr COLON ! logicOrExpr )? ;
    public final HaxeParser.ternaryExpr_return ternaryExpr() throws RecognitionException {
        HaxeParser.ternaryExpr_return retval = new HaxeParser.ternaryExpr_return();
        retval.start = input.LT(1);

        int ternaryExpr_StartIndex = input.index();

        Object root_0 = null;

        Token QUES189=null;
        Token COLON191=null;
        HaxeParser.logicOrExpr_return logicOrExpr188 =null;

        HaxeParser.expr_return expr190 =null;

        HaxeParser.logicOrExpr_return logicOrExpr192 =null;


        Object QUES189_tree=null;
        Object COLON191_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return retval; }

            // Haxe.g:278:5: ( logicOrExpr ( QUES ^ expr COLON ! logicOrExpr )? )
            // Haxe.g:278:10: logicOrExpr ( QUES ^ expr COLON ! logicOrExpr )?
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_logicOrExpr_in_ternaryExpr2973);
            logicOrExpr188=logicOrExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, logicOrExpr188.getTree());

            // Haxe.g:278:22: ( QUES ^ expr COLON ! logicOrExpr )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==QUES) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // Haxe.g:278:23: QUES ^ expr COLON ! logicOrExpr
                    {
                    QUES189=(Token)match(input,QUES,FOLLOW_QUES_in_ternaryExpr2976); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    QUES189_tree = 
                    new HaxeTree(QUES189) 
                    ;
                    root_0 = (Object)adaptor.becomeRoot(QUES189_tree, root_0);
                    }

                    pushFollow(FOLLOW_expr_in_ternaryExpr2982);
                    expr190=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr190.getTree());

                    COLON191=(Token)match(input,COLON,FOLLOW_COLON_in_ternaryExpr2984); if (state.failed) return retval;

                    pushFollow(FOLLOW_logicOrExpr_in_ternaryExpr2987);
                    logicOrExpr192=logicOrExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, logicOrExpr192.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 40, ternaryExpr_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "ternaryExpr"


    public static class logicOrExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "logicOrExpr"
    // Haxe.g:281:1: logicOrExpr : logicAndExpr ( BARBAR ^ logicAndExpr )* ;
    public final HaxeParser.logicOrExpr_return logicOrExpr() throws RecognitionException {
        HaxeParser.logicOrExpr_return retval = new HaxeParser.logicOrExpr_return();
        retval.start = input.LT(1);

        int logicOrExpr_StartIndex = input.index();

        Object root_0 = null;

        Token BARBAR194=null;
        HaxeParser.logicAndExpr_return logicAndExpr193 =null;

        HaxeParser.logicAndExpr_return logicAndExpr195 =null;


        Object BARBAR194_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return retval; }

            // Haxe.g:281:17: ( logicAndExpr ( BARBAR ^ logicAndExpr )* )
            // Haxe.g:281:19: logicAndExpr ( BARBAR ^ logicAndExpr )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_logicAndExpr_in_logicOrExpr3007);
            logicAndExpr193=logicAndExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, logicAndExpr193.getTree());

            // Haxe.g:281:32: ( BARBAR ^ logicAndExpr )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==BARBAR) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // Haxe.g:282:21: BARBAR ^ logicAndExpr
            	    {
            	    BARBAR194=(Token)match(input,BARBAR,FOLLOW_BARBAR_in_logicOrExpr3031); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    BARBAR194_tree = 
            	    new BinaryExpressionNode(BARBAR194) 
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(BARBAR194_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_logicAndExpr_in_logicOrExpr3037);
            	    logicAndExpr195=logicAndExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, logicAndExpr195.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 41, logicOrExpr_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "logicOrExpr"


    public static class logicAndExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "logicAndExpr"
    // Haxe.g:285:1: logicAndExpr : cmpExpr ( AMPAMP ^ cmpExpr )* ;
    public final HaxeParser.logicAndExpr_return logicAndExpr() throws RecognitionException {
        HaxeParser.logicAndExpr_return retval = new HaxeParser.logicAndExpr_return();
        retval.start = input.LT(1);

        int logicAndExpr_StartIndex = input.index();

        Object root_0 = null;

        Token AMPAMP197=null;
        HaxeParser.cmpExpr_return cmpExpr196 =null;

        HaxeParser.cmpExpr_return cmpExpr198 =null;


        Object AMPAMP197_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 42) ) { return retval; }

            // Haxe.g:285:17: ( cmpExpr ( AMPAMP ^ cmpExpr )* )
            // Haxe.g:285:19: cmpExpr ( AMPAMP ^ cmpExpr )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_cmpExpr_in_logicAndExpr3071);
            cmpExpr196=cmpExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, cmpExpr196.getTree());

            // Haxe.g:285:26: ( AMPAMP ^ cmpExpr )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==AMPAMP) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // Haxe.g:285:27: AMPAMP ^ cmpExpr
            	    {
            	    AMPAMP197=(Token)match(input,AMPAMP,FOLLOW_AMPAMP_in_logicAndExpr3073); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    AMPAMP197_tree = 
            	    new BinaryExpressionNode(AMPAMP197) 
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(AMPAMP197_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_cmpExpr_in_logicAndExpr3079);
            	    cmpExpr198=cmpExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, cmpExpr198.getTree());

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
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 42, logicAndExpr_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "logicAndExpr"


    public static class cmpExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "cmpExpr"
    // Haxe.g:288:1: cmpExpr : bitExpr ( ( EQEQ ^| BANGEQ ^| GTEQ ^| LTEQ ^| GT ^| LT ^) bitExpr )* ;
    public final HaxeParser.cmpExpr_return cmpExpr() throws RecognitionException {
        HaxeParser.cmpExpr_return retval = new HaxeParser.cmpExpr_return();
        retval.start = input.LT(1);

        int cmpExpr_StartIndex = input.index();

        Object root_0 = null;

        Token EQEQ200=null;
        Token BANGEQ201=null;
        Token GTEQ202=null;
        Token LTEQ203=null;
        Token GT204=null;
        Token LT205=null;
        HaxeParser.bitExpr_return bitExpr199 =null;

        HaxeParser.bitExpr_return bitExpr206 =null;


        Object EQEQ200_tree=null;
        Object BANGEQ201_tree=null;
        Object GTEQ202_tree=null;
        Object LTEQ203_tree=null;
        Object GT204_tree=null;
        Object LT205_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 43) ) { return retval; }

            // Haxe.g:288:17: ( bitExpr ( ( EQEQ ^| BANGEQ ^| GTEQ ^| LTEQ ^| GT ^| LT ^) bitExpr )* )
            // Haxe.g:288:19: bitExpr ( ( EQEQ ^| BANGEQ ^| GTEQ ^| LTEQ ^| GT ^| LT ^) bitExpr )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_bitExpr_in_cmpExpr3118);
            bitExpr199=bitExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bitExpr199.getTree());

            // Haxe.g:288:27: ( ( EQEQ ^| BANGEQ ^| GTEQ ^| LTEQ ^| GT ^| LT ^) bitExpr )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==BANGEQ||LA52_0==EQEQ||(LA52_0 >= GT && LA52_0 <= GTEQ)||(LA52_0 >= LT && LA52_0 <= LTEQ)) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // Haxe.g:288:28: ( EQEQ ^| BANGEQ ^| GTEQ ^| LTEQ ^| GT ^| LT ^) bitExpr
            	    {
            	    // Haxe.g:288:28: ( EQEQ ^| BANGEQ ^| GTEQ ^| LTEQ ^| GT ^| LT ^)
            	    int alt51=6;
            	    switch ( input.LA(1) ) {
            	    case EQEQ:
            	        {
            	        alt51=1;
            	        }
            	        break;
            	    case BANGEQ:
            	        {
            	        alt51=2;
            	        }
            	        break;
            	    case GTEQ:
            	        {
            	        alt51=3;
            	        }
            	        break;
            	    case LTEQ:
            	        {
            	        alt51=4;
            	        }
            	        break;
            	    case GT:
            	        {
            	        alt51=5;
            	        }
            	        break;
            	    case LT:
            	        {
            	        alt51=6;
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
            	            // Haxe.g:289:23: EQEQ ^
            	            {
            	            EQEQ200=(Token)match(input,EQEQ,FOLLOW_EQEQ_in_cmpExpr3145); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            EQEQ200_tree = 
            	            new BinaryExpressionNode(EQEQ200) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(EQEQ200_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // Haxe.g:290:23: BANGEQ ^
            	            {
            	            BANGEQ201=(Token)match(input,BANGEQ,FOLLOW_BANGEQ_in_cmpExpr3174); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            BANGEQ201_tree = 
            	            new BinaryExpressionNode(BANGEQ201) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(BANGEQ201_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // Haxe.g:291:23: GTEQ ^
            	            {
            	            GTEQ202=(Token)match(input,GTEQ,FOLLOW_GTEQ_in_cmpExpr3203); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            GTEQ202_tree = 
            	            new BinaryExpressionNode(GTEQ202) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(GTEQ202_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // Haxe.g:292:23: LTEQ ^
            	            {
            	            LTEQ203=(Token)match(input,LTEQ,FOLLOW_LTEQ_in_cmpExpr3232); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            LTEQ203_tree = 
            	            new BinaryExpressionNode(LTEQ203) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(LTEQ203_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 5 :
            	            // Haxe.g:293:23: GT ^
            	            {
            	            GT204=(Token)match(input,GT,FOLLOW_GT_in_cmpExpr3261); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            GT204_tree = 
            	            new BinaryExpressionNode(GT204) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(GT204_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 6 :
            	            // Haxe.g:294:23: LT ^
            	            {
            	            LT205=(Token)match(input,LT,FOLLOW_LT_in_cmpExpr3290); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            LT205_tree = 
            	            new BinaryExpressionNode(LT205) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(LT205_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_bitExpr_in_cmpExpr3297);
            	    bitExpr206=bitExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, bitExpr206.getTree());

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
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 43, cmpExpr_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "cmpExpr"


    public static class bitExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "bitExpr"
    // Haxe.g:297:1: bitExpr : shiftExpr ( ( BAR ^| AMP ^| CARET ^) shiftExpr )* ;
    public final HaxeParser.bitExpr_return bitExpr() throws RecognitionException {
        HaxeParser.bitExpr_return retval = new HaxeParser.bitExpr_return();
        retval.start = input.LT(1);

        int bitExpr_StartIndex = input.index();

        Object root_0 = null;

        Token BAR208=null;
        Token AMP209=null;
        Token CARET210=null;
        HaxeParser.shiftExpr_return shiftExpr207 =null;

        HaxeParser.shiftExpr_return shiftExpr211 =null;


        Object BAR208_tree=null;
        Object AMP209_tree=null;
        Object CARET210_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 44) ) { return retval; }

            // Haxe.g:297:17: ( shiftExpr ( ( BAR ^| AMP ^| CARET ^) shiftExpr )* )
            // Haxe.g:297:19: shiftExpr ( ( BAR ^| AMP ^| CARET ^) shiftExpr )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_shiftExpr_in_bitExpr3336);
            shiftExpr207=shiftExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, shiftExpr207.getTree());

            // Haxe.g:297:29: ( ( BAR ^| AMP ^| CARET ^) shiftExpr )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==AMP||LA54_0==BAR||LA54_0==CARET) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // Haxe.g:297:30: ( BAR ^| AMP ^| CARET ^) shiftExpr
            	    {
            	    // Haxe.g:297:30: ( BAR ^| AMP ^| CARET ^)
            	    int alt53=3;
            	    switch ( input.LA(1) ) {
            	    case BAR:
            	        {
            	        alt53=1;
            	        }
            	        break;
            	    case AMP:
            	        {
            	        alt53=2;
            	        }
            	        break;
            	    case CARET:
            	        {
            	        alt53=3;
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
            	            // Haxe.g:298:23: BAR ^
            	            {
            	            BAR208=(Token)match(input,BAR,FOLLOW_BAR_in_bitExpr3363); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            BAR208_tree = 
            	            new BinaryExpressionNode(BAR208) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(BAR208_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // Haxe.g:299:23: AMP ^
            	            {
            	            AMP209=(Token)match(input,AMP,FOLLOW_AMP_in_bitExpr3392); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            AMP209_tree = 
            	            new BinaryExpressionNode(AMP209) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(AMP209_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // Haxe.g:300:23: CARET ^
            	            {
            	            CARET210=(Token)match(input,CARET,FOLLOW_CARET_in_bitExpr3421); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            CARET210_tree = 
            	            new BinaryExpressionNode(CARET210) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(CARET210_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_shiftExpr_in_bitExpr3428);
            	    shiftExpr211=shiftExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, shiftExpr211.getTree());

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
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 44, bitExpr_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "bitExpr"


    public static class shiftExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "shiftExpr"
    // Haxe.g:303:1: shiftExpr : addExpr ( ( LTLT ^| GTGT ^| GTGTGT ^) addExpr )* ;
    public final HaxeParser.shiftExpr_return shiftExpr() throws RecognitionException {
        HaxeParser.shiftExpr_return retval = new HaxeParser.shiftExpr_return();
        retval.start = input.LT(1);

        int shiftExpr_StartIndex = input.index();

        Object root_0 = null;

        Token LTLT213=null;
        Token GTGT214=null;
        Token GTGTGT215=null;
        HaxeParser.addExpr_return addExpr212 =null;

        HaxeParser.addExpr_return addExpr216 =null;


        Object LTLT213_tree=null;
        Object GTGT214_tree=null;
        Object GTGTGT215_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 45) ) { return retval; }

            // Haxe.g:303:17: ( addExpr ( ( LTLT ^| GTGT ^| GTGTGT ^) addExpr )* )
            // Haxe.g:303:19: addExpr ( ( LTLT ^| GTGT ^| GTGTGT ^) addExpr )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_addExpr_in_shiftExpr3461);
            addExpr212=addExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, addExpr212.getTree());

            // Haxe.g:303:27: ( ( LTLT ^| GTGT ^| GTGTGT ^) addExpr )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==GTGT||LA56_0==GTGTGT||LA56_0==LTLT) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // Haxe.g:303:28: ( LTLT ^| GTGT ^| GTGTGT ^) addExpr
            	    {
            	    // Haxe.g:303:28: ( LTLT ^| GTGT ^| GTGTGT ^)
            	    int alt55=3;
            	    switch ( input.LA(1) ) {
            	    case LTLT:
            	        {
            	        alt55=1;
            	        }
            	        break;
            	    case GTGT:
            	        {
            	        alt55=2;
            	        }
            	        break;
            	    case GTGTGT:
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
            	            // Haxe.g:304:23: LTLT ^
            	            {
            	            LTLT213=(Token)match(input,LTLT,FOLLOW_LTLT_in_shiftExpr3488); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            LTLT213_tree = 
            	            new BinaryExpressionNode(LTLT213) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(LTLT213_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // Haxe.g:305:23: GTGT ^
            	            {
            	            GTGT214=(Token)match(input,GTGT,FOLLOW_GTGT_in_shiftExpr3517); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            GTGT214_tree = 
            	            new BinaryExpressionNode(GTGT214) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(GTGT214_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // Haxe.g:306:23: GTGTGT ^
            	            {
            	            GTGTGT215=(Token)match(input,GTGTGT,FOLLOW_GTGTGT_in_shiftExpr3546); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            GTGTGT215_tree = 
            	            new BinaryExpressionNode(GTGTGT215) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(GTGTGT215_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_addExpr_in_shiftExpr3553);
            	    addExpr216=addExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, addExpr216.getTree());

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
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 45, shiftExpr_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "shiftExpr"


    public static class addExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "addExpr"
    // Haxe.g:309:1: addExpr : multExpr ( ( PLUS ^| SUB ^) multExpr )* ;
    public final HaxeParser.addExpr_return addExpr() throws RecognitionException {
        HaxeParser.addExpr_return retval = new HaxeParser.addExpr_return();
        retval.start = input.LT(1);

        int addExpr_StartIndex = input.index();

        Object root_0 = null;

        Token PLUS218=null;
        Token SUB219=null;
        HaxeParser.multExpr_return multExpr217 =null;

        HaxeParser.multExpr_return multExpr220 =null;


        Object PLUS218_tree=null;
        Object SUB219_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 46) ) { return retval; }

            // Haxe.g:309:17: ( multExpr ( ( PLUS ^| SUB ^) multExpr )* )
            // Haxe.g:309:19: multExpr ( ( PLUS ^| SUB ^) multExpr )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_multExpr_in_addExpr3588);
            multExpr217=multExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, multExpr217.getTree());

            // Haxe.g:309:28: ( ( PLUS ^| SUB ^) multExpr )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==PLUS||LA58_0==SUB) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // Haxe.g:309:29: ( PLUS ^| SUB ^) multExpr
            	    {
            	    // Haxe.g:309:29: ( PLUS ^| SUB ^)
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
            	            // Haxe.g:310:23: PLUS ^
            	            {
            	            PLUS218=(Token)match(input,PLUS,FOLLOW_PLUS_in_addExpr3615); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            PLUS218_tree = 
            	            new BinaryExpressionNode(PLUS218) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(PLUS218_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // Haxe.g:311:23: SUB ^
            	            {
            	            SUB219=(Token)match(input,SUB,FOLLOW_SUB_in_addExpr3644); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            SUB219_tree = 
            	            new BinaryExpressionNode(SUB219) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(SUB219_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_multExpr_in_addExpr3651);
            	    multExpr220=multExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, multExpr220.getTree());

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
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 46, addExpr_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "addExpr"


    public static class multExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "multExpr"
    // Haxe.g:314:1: multExpr : unarExpr ( ( STAR ^| SLASH ^| PERCENT ^) unarExpr )* ;
    public final HaxeParser.multExpr_return multExpr() throws RecognitionException {
        HaxeParser.multExpr_return retval = new HaxeParser.multExpr_return();
        retval.start = input.LT(1);

        int multExpr_StartIndex = input.index();

        Object root_0 = null;

        Token STAR222=null;
        Token SLASH223=null;
        Token PERCENT224=null;
        HaxeParser.unarExpr_return unarExpr221 =null;

        HaxeParser.unarExpr_return unarExpr225 =null;


        Object STAR222_tree=null;
        Object SLASH223_tree=null;
        Object PERCENT224_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 47) ) { return retval; }

            // Haxe.g:314:17: ( unarExpr ( ( STAR ^| SLASH ^| PERCENT ^) unarExpr )* )
            // Haxe.g:314:19: unarExpr ( ( STAR ^| SLASH ^| PERCENT ^) unarExpr )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_unarExpr_in_multExpr3690);
            unarExpr221=unarExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, unarExpr221.getTree());

            // Haxe.g:314:28: ( ( STAR ^| SLASH ^| PERCENT ^) unarExpr )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==PERCENT||LA60_0==SLASH||LA60_0==STAR) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // Haxe.g:314:29: ( STAR ^| SLASH ^| PERCENT ^) unarExpr
            	    {
            	    // Haxe.g:314:29: ( STAR ^| SLASH ^| PERCENT ^)
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
            	            // Haxe.g:315:23: STAR ^
            	            {
            	            STAR222=(Token)match(input,STAR,FOLLOW_STAR_in_multExpr3717); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            STAR222_tree = 
            	            new BinaryExpressionNode(STAR222) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(STAR222_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // Haxe.g:316:23: SLASH ^
            	            {
            	            SLASH223=(Token)match(input,SLASH,FOLLOW_SLASH_in_multExpr3746); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            SLASH223_tree = 
            	            new BinaryExpressionNode(SLASH223) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(SLASH223_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // Haxe.g:317:23: PERCENT ^
            	            {
            	            PERCENT224=(Token)match(input,PERCENT,FOLLOW_PERCENT_in_multExpr3775); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            PERCENT224_tree = 
            	            new BinaryExpressionNode(PERCENT224) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(PERCENT224_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_unarExpr_in_multExpr3782);
            	    unarExpr225=unarExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, unarExpr225.getTree());

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
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 47, multExpr_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "multExpr"


    public static class unarExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "unarExpr"
    // Haxe.g:320:1: unarExpr : ( ( SUB ^| SUBSUB ^| PLUSPLUS ^| BANG ^| TILDE ^) psExpr | psExpr PLUSPLUS -> ^( PLUSPLUS psExpr ) | psExpr SUBSUB -> ^( SUBSUB psExpr ) | psExpr );
    public final HaxeParser.unarExpr_return unarExpr() throws RecognitionException {
        HaxeParser.unarExpr_return retval = new HaxeParser.unarExpr_return();
        retval.start = input.LT(1);

        int unarExpr_StartIndex = input.index();

        Object root_0 = null;

        Token SUB226=null;
        Token SUBSUB227=null;
        Token PLUSPLUS228=null;
        Token BANG229=null;
        Token TILDE230=null;
        Token PLUSPLUS233=null;
        Token SUBSUB235=null;
        HaxeParser.psExpr_return psExpr231 =null;

        HaxeParser.psExpr_return psExpr232 =null;

        HaxeParser.psExpr_return psExpr234 =null;

        HaxeParser.psExpr_return psExpr236 =null;


        Object SUB226_tree=null;
        Object SUBSUB227_tree=null;
        Object PLUSPLUS228_tree=null;
        Object BANG229_tree=null;
        Object TILDE230_tree=null;
        Object PLUSPLUS233_tree=null;
        Object SUBSUB235_tree=null;
        RewriteRuleTokenStream stream_SUBSUB=new RewriteRuleTokenStream(adaptor,"token SUBSUB");
        RewriteRuleTokenStream stream_PLUSPLUS=new RewriteRuleTokenStream(adaptor,"token PLUSPLUS");
        RewriteRuleSubtreeStream stream_psExpr=new RewriteRuleSubtreeStream(adaptor,"rule psExpr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 48) ) { return retval; }

            // Haxe.g:320:17: ( ( SUB ^| SUBSUB ^| PLUSPLUS ^| BANG ^| TILDE ^) psExpr | psExpr PLUSPLUS -> ^( PLUSPLUS psExpr ) | psExpr SUBSUB -> ^( SUBSUB psExpr ) | psExpr )
            int alt62=4;
            switch ( input.LA(1) ) {
            case BANG:
            case PLUSPLUS:
            case SUB:
            case SUBSUB:
            case TILDE:
                {
                alt62=1;
                }
                break;
            case NEW:
                {
                int LA62_6 = input.LA(2);

                if ( (synpred111_Haxe()) ) {
                    alt62=2;
                }
                else if ( (synpred112_Haxe()) ) {
                    alt62=3;
                }
                else if ( (true) ) {
                    alt62=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 62, 6, input);

                    throw nvae;

                }
                }
                break;
            case CAST:
                {
                int LA62_7 = input.LA(2);

                if ( (synpred111_Haxe()) ) {
                    alt62=2;
                }
                else if ( (synpred112_Haxe()) ) {
                    alt62=3;
                }
                else if ( (true) ) {
                    alt62=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 62, 7, input);

                    throw nvae;

                }
                }
                break;
            case LBRACE:
                {
                int LA62_8 = input.LA(2);

                if ( (synpred111_Haxe()) ) {
                    alt62=2;
                }
                else if ( (synpred112_Haxe()) ) {
                    alt62=3;
                }
                else if ( (true) ) {
                    alt62=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 62, 8, input);

                    throw nvae;

                }
                }
                break;
            case FUNCTION:
                {
                int LA62_9 = input.LA(2);

                if ( (synpred111_Haxe()) ) {
                    alt62=2;
                }
                else if ( (synpred112_Haxe()) ) {
                    alt62=3;
                }
                else if ( (true) ) {
                    alt62=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 62, 9, input);

                    throw nvae;

                }
                }
                break;
            case LBRACKET:
                {
                int LA62_10 = input.LA(2);

                if ( (synpred111_Haxe()) ) {
                    alt62=2;
                }
                else if ( (synpred112_Haxe()) ) {
                    alt62=3;
                }
                else if ( (true) ) {
                    alt62=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 62, 10, input);

                    throw nvae;

                }
                }
                break;
            case LONGLITERAL:
                {
                int LA62_11 = input.LA(2);

                if ( (synpred111_Haxe()) ) {
                    alt62=2;
                }
                else if ( (synpred112_Haxe()) ) {
                    alt62=3;
                }
                else if ( (true) ) {
                    alt62=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 62, 11, input);

                    throw nvae;

                }
                }
                break;
            case NULL:
                {
                int LA62_12 = input.LA(2);

                if ( (synpred111_Haxe()) ) {
                    alt62=2;
                }
                else if ( (synpred112_Haxe()) ) {
                    alt62=3;
                }
                else if ( (true) ) {
                    alt62=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 62, 12, input);

                    throw nvae;

                }
                }
                break;
            case INTLITERAL:
                {
                int LA62_13 = input.LA(2);

                if ( (synpred111_Haxe()) ) {
                    alt62=2;
                }
                else if ( (synpred112_Haxe()) ) {
                    alt62=3;
                }
                else if ( (true) ) {
                    alt62=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 62, 13, input);

                    throw nvae;

                }
                }
                break;
            case STRINGLITERAL:
                {
                int LA62_14 = input.LA(2);

                if ( (synpred111_Haxe()) ) {
                    alt62=2;
                }
                else if ( (synpred112_Haxe()) ) {
                    alt62=3;
                }
                else if ( (true) ) {
                    alt62=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 62, 14, input);

                    throw nvae;

                }
                }
                break;
            case CHARLITERAL:
                {
                int LA62_15 = input.LA(2);

                if ( (synpred111_Haxe()) ) {
                    alt62=2;
                }
                else if ( (synpred112_Haxe()) ) {
                    alt62=3;
                }
                else if ( (true) ) {
                    alt62=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 62, 15, input);

                    throw nvae;

                }
                }
                break;
            case FLOATNUM:
                {
                int LA62_16 = input.LA(2);

                if ( (synpred111_Haxe()) ) {
                    alt62=2;
                }
                else if ( (synpred112_Haxe()) ) {
                    alt62=3;
                }
                else if ( (true) ) {
                    alt62=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 62, 16, input);

                    throw nvae;

                }
                }
                break;
            case TRUE:
                {
                int LA62_17 = input.LA(2);

                if ( (synpred111_Haxe()) ) {
                    alt62=2;
                }
                else if ( (synpred112_Haxe()) ) {
                    alt62=3;
                }
                else if ( (true) ) {
                    alt62=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 62, 17, input);

                    throw nvae;

                }
                }
                break;
            case FALSE:
                {
                int LA62_18 = input.LA(2);

                if ( (synpred111_Haxe()) ) {
                    alt62=2;
                }
                else if ( (synpred112_Haxe()) ) {
                    alt62=3;
                }
                else if ( (true) ) {
                    alt62=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 62, 18, input);

                    throw nvae;

                }
                }
                break;
            case LPAREN:
                {
                int LA62_19 = input.LA(2);

                if ( (synpred111_Haxe()) ) {
                    alt62=2;
                }
                else if ( (synpred112_Haxe()) ) {
                    alt62=3;
                }
                else if ( (true) ) {
                    alt62=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 62, 19, input);

                    throw nvae;

                }
                }
                break;
            case IDENTIFIER:
                {
                int LA62_20 = input.LA(2);

                if ( (synpred111_Haxe()) ) {
                    alt62=2;
                }
                else if ( (synpred112_Haxe()) ) {
                    alt62=3;
                }
                else if ( (true) ) {
                    alt62=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 62, 20, input);

                    throw nvae;

                }
                }
                break;
            case THIS:
                {
                int LA62_21 = input.LA(2);

                if ( (synpred111_Haxe()) ) {
                    alt62=2;
                }
                else if ( (synpred112_Haxe()) ) {
                    alt62=3;
                }
                else if ( (true) ) {
                    alt62=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 62, 21, input);

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
                    // Haxe.g:320:19: ( SUB ^| SUBSUB ^| PLUSPLUS ^| BANG ^| TILDE ^) psExpr
                    {
                    root_0 = (Object)adaptor.nil();


                    // Haxe.g:320:19: ( SUB ^| SUBSUB ^| PLUSPLUS ^| BANG ^| TILDE ^)
                    int alt61=5;
                    switch ( input.LA(1) ) {
                    case SUB:
                        {
                        alt61=1;
                        }
                        break;
                    case SUBSUB:
                        {
                        alt61=2;
                        }
                        break;
                    case PLUSPLUS:
                        {
                        alt61=3;
                        }
                        break;
                    case BANG:
                        {
                        alt61=4;
                        }
                        break;
                    case TILDE:
                        {
                        alt61=5;
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
                            // Haxe.g:321:13: SUB ^
                            {
                            SUB226=(Token)match(input,SUB,FOLLOW_SUB_in_unarExpr3830); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            SUB226_tree = 
                            new UnarExpressionNode(SUB226) 
                            ;
                            root_0 = (Object)adaptor.becomeRoot(SUB226_tree, root_0);
                            }

                            }
                            break;
                        case 2 :
                            // Haxe.g:322:13: SUBSUB ^
                            {
                            SUBSUB227=(Token)match(input,SUBSUB,FOLLOW_SUBSUB_in_unarExpr3849); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            SUBSUB227_tree = 
                            new UnarExpressionNode(SUBSUB227) 
                            ;
                            root_0 = (Object)adaptor.becomeRoot(SUBSUB227_tree, root_0);
                            }

                            }
                            break;
                        case 3 :
                            // Haxe.g:323:13: PLUSPLUS ^
                            {
                            PLUSPLUS228=(Token)match(input,PLUSPLUS,FOLLOW_PLUSPLUS_in_unarExpr3868); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            PLUSPLUS228_tree = 
                            new UnarExpressionNode(PLUSPLUS228) 
                            ;
                            root_0 = (Object)adaptor.becomeRoot(PLUSPLUS228_tree, root_0);
                            }

                            }
                            break;
                        case 4 :
                            // Haxe.g:324:13: BANG ^
                            {
                            BANG229=(Token)match(input,BANG,FOLLOW_BANG_in_unarExpr3887); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            BANG229_tree = 
                            new UnarExpressionNode(BANG229) 
                            ;
                            root_0 = (Object)adaptor.becomeRoot(BANG229_tree, root_0);
                            }

                            }
                            break;
                        case 5 :
                            // Haxe.g:325:13: TILDE ^
                            {
                            TILDE230=(Token)match(input,TILDE,FOLLOW_TILDE_in_unarExpr3906); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            TILDE230_tree = 
                            new UnarExpressionNode(TILDE230) 
                            ;
                            root_0 = (Object)adaptor.becomeRoot(TILDE230_tree, root_0);
                            }

                            }
                            break;

                    }


                    pushFollow(FOLLOW_psExpr_in_unarExpr3913);
                    psExpr231=psExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, psExpr231.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:326:19: psExpr PLUSPLUS
                    {
                    pushFollow(FOLLOW_psExpr_in_unarExpr3933);
                    psExpr232=psExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_psExpr.add(psExpr232.getTree());

                    PLUSPLUS233=(Token)match(input,PLUSPLUS,FOLLOW_PLUSPLUS_in_unarExpr3935); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PLUSPLUS.add(PLUSPLUS233);


                    // AST REWRITE
                    // elements: psExpr, PLUSPLUS
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 326:61: -> ^( PLUSPLUS psExpr )
                    {
                        // Haxe.g:326:64: ^( PLUSPLUS psExpr )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        new UnarExpressionNode(stream_PLUSPLUS.nextToken())
                        , root_1);

                        adaptor.addChild(root_1, stream_psExpr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 3 :
                    // Haxe.g:327:19: psExpr SUBSUB
                    {
                    pushFollow(FOLLOW_psExpr_in_unarExpr3992);
                    psExpr234=psExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_psExpr.add(psExpr234.getTree());

                    SUBSUB235=(Token)match(input,SUBSUB,FOLLOW_SUBSUB_in_unarExpr3994); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SUBSUB.add(SUBSUB235);


                    // AST REWRITE
                    // elements: SUBSUB, psExpr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 327:61: -> ^( SUBSUB psExpr )
                    {
                        // Haxe.g:327:64: ^( SUBSUB psExpr )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        new UnarExpressionNode(stream_SUBSUB.nextToken())
                        , root_1);

                        adaptor.addChild(root_1, stream_psExpr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 4 :
                    // Haxe.g:328:19: psExpr
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_psExpr_in_unarExpr4053);
                    psExpr236=psExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, psExpr236.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
            if ( state.backtracking>0 ) { memoize(input, 48, unarExpr_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "unarExpr"


    public static class psExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "psExpr"
    // Haxe.g:331:1: psExpr : ( prefixExpr | suffixExpr );
    public final HaxeParser.psExpr_return psExpr() throws RecognitionException {
        HaxeParser.psExpr_return retval = new HaxeParser.psExpr_return();
        retval.start = input.LT(1);

        int psExpr_StartIndex = input.index();

        Object root_0 = null;

        HaxeParser.prefixExpr_return prefixExpr237 =null;

        HaxeParser.suffixExpr_return suffixExpr238 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 49) ) { return retval; }

            // Haxe.g:332:5: ( prefixExpr | suffixExpr )
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==CAST||LA63_0==NEW) ) {
                alt63=1;
            }
            else if ( (LA63_0==CHARLITERAL||LA63_0==FALSE||LA63_0==FLOATNUM||LA63_0==FUNCTION||LA63_0==IDENTIFIER||LA63_0==INTLITERAL||(LA63_0 >= LBRACE && LA63_0 <= LBRACKET)||(LA63_0 >= LONGLITERAL && LA63_0 <= LPAREN)||LA63_0==NULL||LA63_0==STRINGLITERAL||LA63_0==THIS||LA63_0==TRUE) ) {
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
                    // Haxe.g:332:7: prefixExpr
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_prefixExpr_in_psExpr4082);
                    prefixExpr237=prefixExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, prefixExpr237.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:333:7: suffixExpr
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_suffixExpr_in_psExpr4090);
                    suffixExpr238=suffixExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, suffixExpr238.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
            if ( state.backtracking>0 ) { memoize(input, 49, psExpr_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "psExpr"


    public static class suffixExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "suffixExpr"
    // Haxe.g:336:1: suffixExpr : ( methodCallOrSlice | value );
    public final HaxeParser.suffixExpr_return suffixExpr() throws RecognitionException {
        HaxeParser.suffixExpr_return retval = new HaxeParser.suffixExpr_return();
        retval.start = input.LT(1);

        int suffixExpr_StartIndex = input.index();

        Object root_0 = null;

        HaxeParser.methodCallOrSlice_return methodCallOrSlice239 =null;

        HaxeParser.value_return value240 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 50) ) { return retval; }

            // Haxe.g:336:13: ( methodCallOrSlice | value )
            int alt64=2;
            switch ( input.LA(1) ) {
            case LBRACE:
                {
                int LA64_1 = input.LA(2);

                if ( (synpred114_Haxe()) ) {
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
                break;
            case FUNCTION:
                {
                int LA64_2 = input.LA(2);

                if ( (synpred114_Haxe()) ) {
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
                break;
            case LBRACKET:
                {
                int LA64_3 = input.LA(2);

                if ( (synpred114_Haxe()) ) {
                    alt64=1;
                }
                else if ( (true) ) {
                    alt64=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 64, 3, input);

                    throw nvae;

                }
                }
                break;
            case LONGLITERAL:
                {
                int LA64_4 = input.LA(2);

                if ( (synpred114_Haxe()) ) {
                    alt64=1;
                }
                else if ( (true) ) {
                    alt64=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 64, 4, input);

                    throw nvae;

                }
                }
                break;
            case NULL:
                {
                int LA64_5 = input.LA(2);

                if ( (synpred114_Haxe()) ) {
                    alt64=1;
                }
                else if ( (true) ) {
                    alt64=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 64, 5, input);

                    throw nvae;

                }
                }
                break;
            case INTLITERAL:
                {
                int LA64_6 = input.LA(2);

                if ( (synpred114_Haxe()) ) {
                    alt64=1;
                }
                else if ( (true) ) {
                    alt64=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 64, 6, input);

                    throw nvae;

                }
                }
                break;
            case STRINGLITERAL:
                {
                int LA64_7 = input.LA(2);

                if ( (synpred114_Haxe()) ) {
                    alt64=1;
                }
                else if ( (true) ) {
                    alt64=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 64, 7, input);

                    throw nvae;

                }
                }
                break;
            case CHARLITERAL:
                {
                int LA64_8 = input.LA(2);

                if ( (synpred114_Haxe()) ) {
                    alt64=1;
                }
                else if ( (true) ) {
                    alt64=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 64, 8, input);

                    throw nvae;

                }
                }
                break;
            case FLOATNUM:
                {
                int LA64_9 = input.LA(2);

                if ( (synpred114_Haxe()) ) {
                    alt64=1;
                }
                else if ( (true) ) {
                    alt64=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 64, 9, input);

                    throw nvae;

                }
                }
                break;
            case TRUE:
                {
                int LA64_10 = input.LA(2);

                if ( (synpred114_Haxe()) ) {
                    alt64=1;
                }
                else if ( (true) ) {
                    alt64=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 64, 10, input);

                    throw nvae;

                }
                }
                break;
            case FALSE:
                {
                int LA64_11 = input.LA(2);

                if ( (synpred114_Haxe()) ) {
                    alt64=1;
                }
                else if ( (true) ) {
                    alt64=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 64, 11, input);

                    throw nvae;

                }
                }
                break;
            case LPAREN:
                {
                int LA64_12 = input.LA(2);

                if ( (synpred114_Haxe()) ) {
                    alt64=1;
                }
                else if ( (true) ) {
                    alt64=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 64, 12, input);

                    throw nvae;

                }
                }
                break;
            case IDENTIFIER:
                {
                int LA64_13 = input.LA(2);

                if ( (synpred114_Haxe()) ) {
                    alt64=1;
                }
                else if ( (true) ) {
                    alt64=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 64, 13, input);

                    throw nvae;

                }
                }
                break;
            case THIS:
                {
                int LA64_14 = input.LA(2);

                if ( (synpred114_Haxe()) ) {
                    alt64=1;
                }
                else if ( (true) ) {
                    alt64=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 64, 14, input);

                    throw nvae;

                }
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
                    // Haxe.g:336:15: methodCallOrSlice
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_methodCallOrSlice_in_suffixExpr4108);
                    methodCallOrSlice239=methodCallOrSlice();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, methodCallOrSlice239.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:337:15: value
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_value_in_suffixExpr4124);
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
            if ( state.backtracking>0 ) { memoize(input, 50, suffixExpr_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "suffixExpr"


    public static class methodCallOrSlice_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "methodCallOrSlice"
    // Haxe.g:340:1: methodCallOrSlice : ( value LPAREN ( exprList )? RPAREN ( pureCallOrSlice )? -> ^( SUFFIX_EXPR[\"MethodCall\", $LPAREN, $RPAREN] value ( exprList )? ( pureCallOrSlice )? ) | value LBRACKET expr RBRACKET ( pureCallOrSlice )? -> ^( SUFFIX_EXPR[\"Slice\", $LBRACKET, $RBRACKET] value ( expr )? ( pureCallOrSlice )? ) | value DOT ( suffixExpr )? -> ^( value ( suffixExpr )? ) );
    public final HaxeParser.methodCallOrSlice_return methodCallOrSlice() throws RecognitionException {
        HaxeParser.methodCallOrSlice_return retval = new HaxeParser.methodCallOrSlice_return();
        retval.start = input.LT(1);

        int methodCallOrSlice_StartIndex = input.index();

        Object root_0 = null;

        Token LPAREN242=null;
        Token RPAREN244=null;
        Token LBRACKET247=null;
        Token RBRACKET249=null;
        Token DOT252=null;
        HaxeParser.value_return value241 =null;

        HaxeParser.exprList_return exprList243 =null;

        HaxeParser.pureCallOrSlice_return pureCallOrSlice245 =null;

        HaxeParser.value_return value246 =null;

        HaxeParser.expr_return expr248 =null;

        HaxeParser.pureCallOrSlice_return pureCallOrSlice250 =null;

        HaxeParser.value_return value251 =null;

        HaxeParser.suffixExpr_return suffixExpr253 =null;


        Object LPAREN242_tree=null;
        Object RPAREN244_tree=null;
        Object LBRACKET247_tree=null;
        Object RBRACKET249_tree=null;
        Object DOT252_tree=null;
        RewriteRuleTokenStream stream_LBRACKET=new RewriteRuleTokenStream(adaptor,"token LBRACKET");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_RBRACKET=new RewriteRuleTokenStream(adaptor,"token RBRACKET");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_pureCallOrSlice=new RewriteRuleSubtreeStream(adaptor,"rule pureCallOrSlice");
        RewriteRuleSubtreeStream stream_suffixExpr=new RewriteRuleSubtreeStream(adaptor,"rule suffixExpr");
        RewriteRuleSubtreeStream stream_value=new RewriteRuleSubtreeStream(adaptor,"rule value");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_exprList=new RewriteRuleSubtreeStream(adaptor,"rule exprList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 51) ) { return retval; }

            // Haxe.g:340:19: ( value LPAREN ( exprList )? RPAREN ( pureCallOrSlice )? -> ^( SUFFIX_EXPR[\"MethodCall\", $LPAREN, $RPAREN] value ( exprList )? ( pureCallOrSlice )? ) | value LBRACKET expr RBRACKET ( pureCallOrSlice )? -> ^( SUFFIX_EXPR[\"Slice\", $LBRACKET, $RBRACKET] value ( expr )? ( pureCallOrSlice )? ) | value DOT ( suffixExpr )? -> ^( value ( suffixExpr )? ) )
            int alt69=3;
            switch ( input.LA(1) ) {
            case LBRACE:
                {
                int LA69_1 = input.LA(2);

                if ( (synpred117_Haxe()) ) {
                    alt69=1;
                }
                else if ( (synpred119_Haxe()) ) {
                    alt69=2;
                }
                else if ( (true) ) {
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
            case FUNCTION:
                {
                int LA69_2 = input.LA(2);

                if ( (synpred117_Haxe()) ) {
                    alt69=1;
                }
                else if ( (synpred119_Haxe()) ) {
                    alt69=2;
                }
                else if ( (true) ) {
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
            case LBRACKET:
                {
                int LA69_3 = input.LA(2);

                if ( (synpred117_Haxe()) ) {
                    alt69=1;
                }
                else if ( (synpred119_Haxe()) ) {
                    alt69=2;
                }
                else if ( (true) ) {
                    alt69=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 69, 3, input);

                    throw nvae;

                }
                }
                break;
            case LONGLITERAL:
                {
                int LA69_4 = input.LA(2);

                if ( (synpred117_Haxe()) ) {
                    alt69=1;
                }
                else if ( (synpred119_Haxe()) ) {
                    alt69=2;
                }
                else if ( (true) ) {
                    alt69=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 69, 4, input);

                    throw nvae;

                }
                }
                break;
            case NULL:
                {
                int LA69_5 = input.LA(2);

                if ( (synpred117_Haxe()) ) {
                    alt69=1;
                }
                else if ( (synpred119_Haxe()) ) {
                    alt69=2;
                }
                else if ( (true) ) {
                    alt69=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 69, 5, input);

                    throw nvae;

                }
                }
                break;
            case INTLITERAL:
                {
                int LA69_6 = input.LA(2);

                if ( (synpred117_Haxe()) ) {
                    alt69=1;
                }
                else if ( (synpred119_Haxe()) ) {
                    alt69=2;
                }
                else if ( (true) ) {
                    alt69=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 69, 6, input);

                    throw nvae;

                }
                }
                break;
            case STRINGLITERAL:
                {
                int LA69_7 = input.LA(2);

                if ( (synpred117_Haxe()) ) {
                    alt69=1;
                }
                else if ( (synpred119_Haxe()) ) {
                    alt69=2;
                }
                else if ( (true) ) {
                    alt69=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 69, 7, input);

                    throw nvae;

                }
                }
                break;
            case CHARLITERAL:
                {
                int LA69_8 = input.LA(2);

                if ( (synpred117_Haxe()) ) {
                    alt69=1;
                }
                else if ( (synpred119_Haxe()) ) {
                    alt69=2;
                }
                else if ( (true) ) {
                    alt69=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 69, 8, input);

                    throw nvae;

                }
                }
                break;
            case FLOATNUM:
                {
                int LA69_9 = input.LA(2);

                if ( (synpred117_Haxe()) ) {
                    alt69=1;
                }
                else if ( (synpred119_Haxe()) ) {
                    alt69=2;
                }
                else if ( (true) ) {
                    alt69=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 69, 9, input);

                    throw nvae;

                }
                }
                break;
            case TRUE:
                {
                int LA69_10 = input.LA(2);

                if ( (synpred117_Haxe()) ) {
                    alt69=1;
                }
                else if ( (synpred119_Haxe()) ) {
                    alt69=2;
                }
                else if ( (true) ) {
                    alt69=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 69, 10, input);

                    throw nvae;

                }
                }
                break;
            case FALSE:
                {
                int LA69_11 = input.LA(2);

                if ( (synpred117_Haxe()) ) {
                    alt69=1;
                }
                else if ( (synpred119_Haxe()) ) {
                    alt69=2;
                }
                else if ( (true) ) {
                    alt69=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 69, 11, input);

                    throw nvae;

                }
                }
                break;
            case LPAREN:
                {
                int LA69_12 = input.LA(2);

                if ( (synpred117_Haxe()) ) {
                    alt69=1;
                }
                else if ( (synpred119_Haxe()) ) {
                    alt69=2;
                }
                else if ( (true) ) {
                    alt69=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 69, 12, input);

                    throw nvae;

                }
                }
                break;
            case IDENTIFIER:
                {
                int LA69_13 = input.LA(2);

                if ( (synpred117_Haxe()) ) {
                    alt69=1;
                }
                else if ( (synpred119_Haxe()) ) {
                    alt69=2;
                }
                else if ( (true) ) {
                    alt69=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 69, 13, input);

                    throw nvae;

                }
                }
                break;
            case THIS:
                {
                int LA69_14 = input.LA(2);

                if ( (synpred117_Haxe()) ) {
                    alt69=1;
                }
                else if ( (synpred119_Haxe()) ) {
                    alt69=2;
                }
                else if ( (true) ) {
                    alt69=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 69, 14, input);

                    throw nvae;

                }
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
                    // Haxe.g:340:21: value LPAREN ( exprList )? RPAREN ( pureCallOrSlice )?
                    {
                    pushFollow(FOLLOW_value_in_methodCallOrSlice4157);
                    value241=value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_value.add(value241.getTree());

                    LPAREN242=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_methodCallOrSlice4159); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN242);


                    // Haxe.g:340:34: ( exprList )?
                    int alt65=2;
                    int LA65_0 = input.LA(1);

                    if ( (LA65_0==BANG||LA65_0==CAST||LA65_0==CHARLITERAL||LA65_0==FALSE||LA65_0==FLOATNUM||LA65_0==FUNCTION||LA65_0==IDENTIFIER||LA65_0==INTLITERAL||(LA65_0 >= LBRACE && LA65_0 <= LBRACKET)||(LA65_0 >= LONGLITERAL && LA65_0 <= LPAREN)||(LA65_0 >= NEW && LA65_0 <= NULL)||LA65_0==PLUSPLUS||(LA65_0 >= STRINGLITERAL && LA65_0 <= SUB)||LA65_0==SUBSUB||LA65_0==THIS||LA65_0==TILDE||LA65_0==TRUE||LA65_0==UNTYPED) ) {
                        alt65=1;
                    }
                    switch (alt65) {
                        case 1 :
                            // Haxe.g:340:34: exprList
                            {
                            pushFollow(FOLLOW_exprList_in_methodCallOrSlice4161);
                            exprList243=exprList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_exprList.add(exprList243.getTree());

                            }
                            break;

                    }


                    RPAREN244=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_methodCallOrSlice4164); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN244);


                    // Haxe.g:340:51: ( pureCallOrSlice )?
                    int alt66=2;
                    int LA66_0 = input.LA(1);

                    if ( (LA66_0==DOT||LA66_0==LBRACKET||LA66_0==LPAREN) ) {
                        alt66=1;
                    }
                    switch (alt66) {
                        case 1 :
                            // Haxe.g:340:51: pureCallOrSlice
                            {
                            pushFollow(FOLLOW_pureCallOrSlice_in_methodCallOrSlice4166);
                            pureCallOrSlice245=pureCallOrSlice();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_pureCallOrSlice.add(pureCallOrSlice245.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: pureCallOrSlice, exprList, value
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 340:68: -> ^( SUFFIX_EXPR[\"MethodCall\", $LPAREN, $RPAREN] value ( exprList )? ( pureCallOrSlice )? )
                    {
                        // Haxe.g:340:71: ^( SUFFIX_EXPR[\"MethodCall\", $LPAREN, $RPAREN] value ( exprList )? ( pureCallOrSlice )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        new HaxeTree(SUFFIX_EXPR, "MethodCall", LPAREN242, RPAREN244)
                        , root_1);

                        adaptor.addChild(root_1, stream_value.nextTree());

                        // Haxe.g:341:77: ( exprList )?
                        if ( stream_exprList.hasNext() ) {
                            adaptor.addChild(root_1, stream_exprList.nextTree());

                        }
                        stream_exprList.reset();

                        // Haxe.g:341:87: ( pureCallOrSlice )?
                        if ( stream_pureCallOrSlice.hasNext() ) {
                            adaptor.addChild(root_1, stream_pureCallOrSlice.nextTree());

                        }
                        stream_pureCallOrSlice.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // Haxe.g:342:15: value LBRACKET expr RBRACKET ( pureCallOrSlice )?
                    {
                    pushFollow(FOLLOW_value_in_methodCallOrSlice4218);
                    value246=value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_value.add(value246.getTree());

                    LBRACKET247=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_methodCallOrSlice4220); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LBRACKET.add(LBRACKET247);


                    pushFollow(FOLLOW_expr_in_methodCallOrSlice4222);
                    expr248=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr248.getTree());

                    RBRACKET249=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_methodCallOrSlice4224); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RBRACKET.add(RBRACKET249);


                    // Haxe.g:342:44: ( pureCallOrSlice )?
                    int alt67=2;
                    int LA67_0 = input.LA(1);

                    if ( (LA67_0==DOT||LA67_0==LBRACKET||LA67_0==LPAREN) ) {
                        alt67=1;
                    }
                    switch (alt67) {
                        case 1 :
                            // Haxe.g:342:44: pureCallOrSlice
                            {
                            pushFollow(FOLLOW_pureCallOrSlice_in_methodCallOrSlice4226);
                            pureCallOrSlice250=pureCallOrSlice();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_pureCallOrSlice.add(pureCallOrSlice250.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: value, pureCallOrSlice, expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 342:61: -> ^( SUFFIX_EXPR[\"Slice\", $LBRACKET, $RBRACKET] value ( expr )? ( pureCallOrSlice )? )
                    {
                        // Haxe.g:342:64: ^( SUFFIX_EXPR[\"Slice\", $LBRACKET, $RBRACKET] value ( expr )? ( pureCallOrSlice )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        new HaxeTree(SUFFIX_EXPR, "Slice", LBRACKET247, RBRACKET249)
                        , root_1);

                        adaptor.addChild(root_1, stream_value.nextTree());

                        // Haxe.g:343:76: ( expr )?
                        if ( stream_expr.hasNext() ) {
                            adaptor.addChild(root_1, stream_expr.nextTree());

                        }
                        stream_expr.reset();

                        // Haxe.g:343:82: ( pureCallOrSlice )?
                        if ( stream_pureCallOrSlice.hasNext() ) {
                            adaptor.addChild(root_1, stream_pureCallOrSlice.nextTree());

                        }
                        stream_pureCallOrSlice.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 3 :
                    // Haxe.g:344:19: value DOT ( suffixExpr )?
                    {
                    pushFollow(FOLLOW_value_in_methodCallOrSlice4282);
                    value251=value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_value.add(value251.getTree());

                    DOT252=(Token)match(input,DOT,FOLLOW_DOT_in_methodCallOrSlice4284); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DOT.add(DOT252);


                    // Haxe.g:344:29: ( suffixExpr )?
                    int alt68=2;
                    int LA68_0 = input.LA(1);

                    if ( (LA68_0==CHARLITERAL||LA68_0==FALSE||LA68_0==FLOATNUM||LA68_0==FUNCTION||LA68_0==IDENTIFIER||LA68_0==INTLITERAL||(LA68_0 >= LBRACE && LA68_0 <= LBRACKET)||(LA68_0 >= LONGLITERAL && LA68_0 <= LPAREN)||LA68_0==NULL||LA68_0==STRINGLITERAL||LA68_0==THIS||LA68_0==TRUE) ) {
                        alt68=1;
                    }
                    switch (alt68) {
                        case 1 :
                            // Haxe.g:344:29: suffixExpr
                            {
                            pushFollow(FOLLOW_suffixExpr_in_methodCallOrSlice4286);
                            suffixExpr253=suffixExpr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_suffixExpr.add(suffixExpr253.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: suffixExpr, value
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 344:41: -> ^( value ( suffixExpr )? )
                    {
                        // Haxe.g:344:44: ^( value ( suffixExpr )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_value.nextNode(), root_1);

                        // Haxe.g:344:52: ( suffixExpr )?
                        if ( stream_suffixExpr.hasNext() ) {
                            adaptor.addChild(root_1, stream_suffixExpr.nextTree());

                        }
                        stream_suffixExpr.reset();

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
            if ( state.backtracking>0 ) { memoize(input, 51, methodCallOrSlice_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "methodCallOrSlice"


    public static class pureCallOrSlice_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "pureCallOrSlice"
    // Haxe.g:347:1: pureCallOrSlice : ( LPAREN ( exprList )? RPAREN ( pureCallOrSlice )? -> ^( SUFFIX_EXPR[\"MethodCall\", $LPAREN, $RPAREN] ( exprList )? ( pureCallOrSlice )? ) | LBRACKET expr RBRACKET ( pureCallOrSlice )? -> ^( SUFFIX_EXPR[\"Slice\", $LBRACKET, $RBRACKET] ( expr )? ( pureCallOrSlice )? ) | DOT ! methodCallOrSlice );
    public final HaxeParser.pureCallOrSlice_return pureCallOrSlice() throws RecognitionException {
        HaxeParser.pureCallOrSlice_return retval = new HaxeParser.pureCallOrSlice_return();
        retval.start = input.LT(1);

        int pureCallOrSlice_StartIndex = input.index();

        Object root_0 = null;

        Token LPAREN254=null;
        Token RPAREN256=null;
        Token LBRACKET258=null;
        Token RBRACKET260=null;
        Token DOT262=null;
        HaxeParser.exprList_return exprList255 =null;

        HaxeParser.pureCallOrSlice_return pureCallOrSlice257 =null;

        HaxeParser.expr_return expr259 =null;

        HaxeParser.pureCallOrSlice_return pureCallOrSlice261 =null;

        HaxeParser.methodCallOrSlice_return methodCallOrSlice263 =null;


        Object LPAREN254_tree=null;
        Object RPAREN256_tree=null;
        Object LBRACKET258_tree=null;
        Object RBRACKET260_tree=null;
        Object DOT262_tree=null;
        RewriteRuleTokenStream stream_LBRACKET=new RewriteRuleTokenStream(adaptor,"token LBRACKET");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_RBRACKET=new RewriteRuleTokenStream(adaptor,"token RBRACKET");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_pureCallOrSlice=new RewriteRuleSubtreeStream(adaptor,"rule pureCallOrSlice");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_exprList=new RewriteRuleSubtreeStream(adaptor,"rule exprList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 52) ) { return retval; }

            // Haxe.g:347:17: ( LPAREN ( exprList )? RPAREN ( pureCallOrSlice )? -> ^( SUFFIX_EXPR[\"MethodCall\", $LPAREN, $RPAREN] ( exprList )? ( pureCallOrSlice )? ) | LBRACKET expr RBRACKET ( pureCallOrSlice )? -> ^( SUFFIX_EXPR[\"Slice\", $LBRACKET, $RBRACKET] ( expr )? ( pureCallOrSlice )? ) | DOT ! methodCallOrSlice )
            int alt73=3;
            switch ( input.LA(1) ) {
            case LPAREN:
                {
                alt73=1;
                }
                break;
            case LBRACKET:
                {
                alt73=2;
                }
                break;
            case DOT:
                {
                alt73=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;

            }

            switch (alt73) {
                case 1 :
                    // Haxe.g:347:19: LPAREN ( exprList )? RPAREN ( pureCallOrSlice )?
                    {
                    LPAREN254=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_pureCallOrSlice4305); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN254);


                    // Haxe.g:347:26: ( exprList )?
                    int alt70=2;
                    int LA70_0 = input.LA(1);

                    if ( (LA70_0==BANG||LA70_0==CAST||LA70_0==CHARLITERAL||LA70_0==FALSE||LA70_0==FLOATNUM||LA70_0==FUNCTION||LA70_0==IDENTIFIER||LA70_0==INTLITERAL||(LA70_0 >= LBRACE && LA70_0 <= LBRACKET)||(LA70_0 >= LONGLITERAL && LA70_0 <= LPAREN)||(LA70_0 >= NEW && LA70_0 <= NULL)||LA70_0==PLUSPLUS||(LA70_0 >= STRINGLITERAL && LA70_0 <= SUB)||LA70_0==SUBSUB||LA70_0==THIS||LA70_0==TILDE||LA70_0==TRUE||LA70_0==UNTYPED) ) {
                        alt70=1;
                    }
                    switch (alt70) {
                        case 1 :
                            // Haxe.g:347:26: exprList
                            {
                            pushFollow(FOLLOW_exprList_in_pureCallOrSlice4307);
                            exprList255=exprList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_exprList.add(exprList255.getTree());

                            }
                            break;

                    }


                    RPAREN256=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_pureCallOrSlice4310); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN256);


                    // Haxe.g:347:43: ( pureCallOrSlice )?
                    int alt71=2;
                    int LA71_0 = input.LA(1);

                    if ( (LA71_0==DOT||LA71_0==LBRACKET||LA71_0==LPAREN) ) {
                        alt71=1;
                    }
                    switch (alt71) {
                        case 1 :
                            // Haxe.g:347:43: pureCallOrSlice
                            {
                            pushFollow(FOLLOW_pureCallOrSlice_in_pureCallOrSlice4312);
                            pureCallOrSlice257=pureCallOrSlice();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_pureCallOrSlice.add(pureCallOrSlice257.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: pureCallOrSlice, exprList
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 347:60: -> ^( SUFFIX_EXPR[\"MethodCall\", $LPAREN, $RPAREN] ( exprList )? ( pureCallOrSlice )? )
                    {
                        // Haxe.g:347:63: ^( SUFFIX_EXPR[\"MethodCall\", $LPAREN, $RPAREN] ( exprList )? ( pureCallOrSlice )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        new HaxeTree(SUFFIX_EXPR, "MethodCall", LPAREN254, RPAREN256)
                        , root_1);

                        // Haxe.g:347:119: ( exprList )?
                        if ( stream_exprList.hasNext() ) {
                            adaptor.addChild(root_1, stream_exprList.nextTree());

                        }
                        stream_exprList.reset();

                        // Haxe.g:347:129: ( pureCallOrSlice )?
                        if ( stream_pureCallOrSlice.hasNext() ) {
                            adaptor.addChild(root_1, stream_pureCallOrSlice.nextTree());

                        }
                        stream_pureCallOrSlice.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // Haxe.g:348:18: LBRACKET expr RBRACKET ( pureCallOrSlice )?
                    {
                    LBRACKET258=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_pureCallOrSlice4348); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LBRACKET.add(LBRACKET258);


                    pushFollow(FOLLOW_expr_in_pureCallOrSlice4350);
                    expr259=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr259.getTree());

                    RBRACKET260=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_pureCallOrSlice4352); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RBRACKET.add(RBRACKET260);


                    // Haxe.g:348:41: ( pureCallOrSlice )?
                    int alt72=2;
                    int LA72_0 = input.LA(1);

                    if ( (LA72_0==DOT||LA72_0==LBRACKET||LA72_0==LPAREN) ) {
                        alt72=1;
                    }
                    switch (alt72) {
                        case 1 :
                            // Haxe.g:348:41: pureCallOrSlice
                            {
                            pushFollow(FOLLOW_pureCallOrSlice_in_pureCallOrSlice4354);
                            pureCallOrSlice261=pureCallOrSlice();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_pureCallOrSlice.add(pureCallOrSlice261.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: expr, pureCallOrSlice
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 348:58: -> ^( SUFFIX_EXPR[\"Slice\", $LBRACKET, $RBRACKET] ( expr )? ( pureCallOrSlice )? )
                    {
                        // Haxe.g:348:61: ^( SUFFIX_EXPR[\"Slice\", $LBRACKET, $RBRACKET] ( expr )? ( pureCallOrSlice )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        new HaxeTree(SUFFIX_EXPR, "Slice", LBRACKET258, RBRACKET260)
                        , root_1);

                        // Haxe.g:349:70: ( expr )?
                        if ( stream_expr.hasNext() ) {
                            adaptor.addChild(root_1, stream_expr.nextTree());

                        }
                        stream_expr.reset();

                        // Haxe.g:349:76: ( pureCallOrSlice )?
                        if ( stream_pureCallOrSlice.hasNext() ) {
                            adaptor.addChild(root_1, stream_pureCallOrSlice.nextTree());

                        }
                        stream_pureCallOrSlice.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 3 :
                    // Haxe.g:350:2: DOT ! methodCallOrSlice
                    {
                    root_0 = (Object)adaptor.nil();


                    DOT262=(Token)match(input,DOT,FOLLOW_DOT_in_pureCallOrSlice4391); if (state.failed) return retval;

                    pushFollow(FOLLOW_methodCallOrSlice_in_pureCallOrSlice4394);
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
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 52, pureCallOrSlice_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "pureCallOrSlice"


    public static class value_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "value"
    // Haxe.g:353:1: value : ( objLit | funcLit | arrayLit | elementarySymbol | LPAREN ! ( expr | statement ) RPAREN !| id typeParamOpt );
    public final HaxeParser.value_return value() throws RecognitionException {
        HaxeParser.value_return retval = new HaxeParser.value_return();
        retval.start = input.LT(1);

        int value_StartIndex = input.index();

        Object root_0 = null;

        Token LPAREN268=null;
        Token RPAREN271=null;
        HaxeParser.objLit_return objLit264 =null;

        HaxeParser.funcLit_return funcLit265 =null;

        HaxeParser.arrayLit_return arrayLit266 =null;

        HaxeParser.elementarySymbol_return elementarySymbol267 =null;

        HaxeParser.expr_return expr269 =null;

        HaxeParser.statement_return statement270 =null;

        HaxeParser.id_return id272 =null;

        HaxeParser.typeParamOpt_return typeParamOpt273 =null;


        Object LPAREN268_tree=null;
        Object RPAREN271_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 53) ) { return retval; }

            // Haxe.g:355:5: ( objLit | funcLit | arrayLit | elementarySymbol | LPAREN ! ( expr | statement ) RPAREN !| id typeParamOpt )
            int alt75=6;
            switch ( input.LA(1) ) {
            case LBRACE:
                {
                alt75=1;
                }
                break;
            case FUNCTION:
                {
                alt75=2;
                }
                break;
            case LBRACKET:
                {
                alt75=3;
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
                alt75=4;
                }
                break;
            case LPAREN:
                {
                alt75=5;
                }
                break;
            case IDENTIFIER:
            case THIS:
                {
                alt75=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;

            }

            switch (alt75) {
                case 1 :
                    // Haxe.g:355:9: objLit
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_objLit_in_value4414);
                    objLit264=objLit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, objLit264.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:356:7: funcLit
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_funcLit_in_value4422);
                    funcLit265=funcLit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, funcLit265.getTree());

                    }
                    break;
                case 3 :
                    // Haxe.g:357:7: arrayLit
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_arrayLit_in_value4430);
                    arrayLit266=arrayLit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arrayLit266.getTree());

                    }
                    break;
                case 4 :
                    // Haxe.g:358:9: elementarySymbol
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_elementarySymbol_in_value4440);
                    elementarySymbol267=elementarySymbol();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, elementarySymbol267.getTree());

                    }
                    break;
                case 5 :
                    // Haxe.g:359:9: LPAREN ! ( expr | statement ) RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    LPAREN268=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_value4450); if (state.failed) return retval;

                    // Haxe.g:359:17: ( expr | statement )
                    int alt74=2;
                    switch ( input.LA(1) ) {
                    case SUB:
                        {
                        int LA74_1 = input.LA(2);

                        if ( (synpred130_Haxe()) ) {
                            alt74=1;
                        }
                        else if ( (true) ) {
                            alt74=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 74, 1, input);

                            throw nvae;

                        }
                        }
                        break;
                    case SUBSUB:
                        {
                        int LA74_2 = input.LA(2);

                        if ( (synpred130_Haxe()) ) {
                            alt74=1;
                        }
                        else if ( (true) ) {
                            alt74=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 74, 2, input);

                            throw nvae;

                        }
                        }
                        break;
                    case PLUSPLUS:
                        {
                        int LA74_3 = input.LA(2);

                        if ( (synpred130_Haxe()) ) {
                            alt74=1;
                        }
                        else if ( (true) ) {
                            alt74=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 74, 3, input);

                            throw nvae;

                        }
                        }
                        break;
                    case BANG:
                        {
                        int LA74_4 = input.LA(2);

                        if ( (synpred130_Haxe()) ) {
                            alt74=1;
                        }
                        else if ( (true) ) {
                            alt74=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 74, 4, input);

                            throw nvae;

                        }
                        }
                        break;
                    case TILDE:
                        {
                        int LA74_5 = input.LA(2);

                        if ( (synpred130_Haxe()) ) {
                            alt74=1;
                        }
                        else if ( (true) ) {
                            alt74=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 74, 5, input);

                            throw nvae;

                        }
                        }
                        break;
                    case NEW:
                        {
                        int LA74_6 = input.LA(2);

                        if ( (synpred130_Haxe()) ) {
                            alt74=1;
                        }
                        else if ( (true) ) {
                            alt74=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 74, 6, input);

                            throw nvae;

                        }
                        }
                        break;
                    case CAST:
                        {
                        int LA74_7 = input.LA(2);

                        if ( (synpred130_Haxe()) ) {
                            alt74=1;
                        }
                        else if ( (true) ) {
                            alt74=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 74, 7, input);

                            throw nvae;

                        }
                        }
                        break;
                    case LBRACE:
                        {
                        int LA74_8 = input.LA(2);

                        if ( (synpred130_Haxe()) ) {
                            alt74=1;
                        }
                        else if ( (true) ) {
                            alt74=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 74, 8, input);

                            throw nvae;

                        }
                        }
                        break;
                    case FUNCTION:
                        {
                        int LA74_9 = input.LA(2);

                        if ( (synpred130_Haxe()) ) {
                            alt74=1;
                        }
                        else if ( (true) ) {
                            alt74=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 74, 9, input);

                            throw nvae;

                        }
                        }
                        break;
                    case LBRACKET:
                        {
                        int LA74_10 = input.LA(2);

                        if ( (synpred130_Haxe()) ) {
                            alt74=1;
                        }
                        else if ( (true) ) {
                            alt74=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 74, 10, input);

                            throw nvae;

                        }
                        }
                        break;
                    case LONGLITERAL:
                        {
                        int LA74_11 = input.LA(2);

                        if ( (synpred130_Haxe()) ) {
                            alt74=1;
                        }
                        else if ( (true) ) {
                            alt74=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 74, 11, input);

                            throw nvae;

                        }
                        }
                        break;
                    case NULL:
                        {
                        int LA74_12 = input.LA(2);

                        if ( (synpred130_Haxe()) ) {
                            alt74=1;
                        }
                        else if ( (true) ) {
                            alt74=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 74, 12, input);

                            throw nvae;

                        }
                        }
                        break;
                    case INTLITERAL:
                        {
                        int LA74_13 = input.LA(2);

                        if ( (synpred130_Haxe()) ) {
                            alt74=1;
                        }
                        else if ( (true) ) {
                            alt74=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 74, 13, input);

                            throw nvae;

                        }
                        }
                        break;
                    case STRINGLITERAL:
                        {
                        int LA74_14 = input.LA(2);

                        if ( (synpred130_Haxe()) ) {
                            alt74=1;
                        }
                        else if ( (true) ) {
                            alt74=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 74, 14, input);

                            throw nvae;

                        }
                        }
                        break;
                    case CHARLITERAL:
                        {
                        int LA74_15 = input.LA(2);

                        if ( (synpred130_Haxe()) ) {
                            alt74=1;
                        }
                        else if ( (true) ) {
                            alt74=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 74, 15, input);

                            throw nvae;

                        }
                        }
                        break;
                    case FLOATNUM:
                        {
                        int LA74_16 = input.LA(2);

                        if ( (synpred130_Haxe()) ) {
                            alt74=1;
                        }
                        else if ( (true) ) {
                            alt74=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 74, 16, input);

                            throw nvae;

                        }
                        }
                        break;
                    case TRUE:
                        {
                        int LA74_17 = input.LA(2);

                        if ( (synpred130_Haxe()) ) {
                            alt74=1;
                        }
                        else if ( (true) ) {
                            alt74=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 74, 17, input);

                            throw nvae;

                        }
                        }
                        break;
                    case FALSE:
                        {
                        int LA74_18 = input.LA(2);

                        if ( (synpred130_Haxe()) ) {
                            alt74=1;
                        }
                        else if ( (true) ) {
                            alt74=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 74, 18, input);

                            throw nvae;

                        }
                        }
                        break;
                    case LPAREN:
                        {
                        int LA74_19 = input.LA(2);

                        if ( (synpred130_Haxe()) ) {
                            alt74=1;
                        }
                        else if ( (true) ) {
                            alt74=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 74, 19, input);

                            throw nvae;

                        }
                        }
                        break;
                    case IDENTIFIER:
                        {
                        int LA74_20 = input.LA(2);

                        if ( (synpred130_Haxe()) ) {
                            alt74=1;
                        }
                        else if ( (true) ) {
                            alt74=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 74, 20, input);

                            throw nvae;

                        }
                        }
                        break;
                    case THIS:
                        {
                        int LA74_21 = input.LA(2);

                        if ( (synpred130_Haxe()) ) {
                            alt74=1;
                        }
                        else if ( (true) ) {
                            alt74=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 74, 21, input);

                            throw nvae;

                        }
                        }
                        break;
                    case UNTYPED:
                        {
                        int LA74_22 = input.LA(2);

                        if ( (synpred130_Haxe()) ) {
                            alt74=1;
                        }
                        else if ( (true) ) {
                            alt74=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 74, 22, input);

                            throw nvae;

                        }
                        }
                        break;
                    case BREAK:
                    case CONTINUE:
                    case DO:
                    case FOR:
                    case IF:
                    case RETURN:
                    case SEMI:
                    case SWITCH:
                    case THROW:
                    case TRY:
                    case VAR:
                    case WHILE:
                        {
                        alt74=2;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 74, 0, input);

                        throw nvae;

                    }

                    switch (alt74) {
                        case 1 :
                            // Haxe.g:359:18: expr
                            {
                            pushFollow(FOLLOW_expr_in_value4454);
                            expr269=expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr269.getTree());

                            }
                            break;
                        case 2 :
                            // Haxe.g:359:23: statement
                            {
                            pushFollow(FOLLOW_statement_in_value4456);
                            statement270=statement();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, statement270.getTree());

                            }
                            break;

                    }


                    RPAREN271=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_value4459); if (state.failed) return retval;

                    }
                    break;
                case 6 :
                    // Haxe.g:361:9: id typeParamOpt
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_id_in_value4475);
                    id272=id();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, id272.getTree());

                    pushFollow(FOLLOW_typeParamOpt_in_value4477);
                    typeParamOpt273=typeParamOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeParamOpt273.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
            if ( state.backtracking>0 ) { memoize(input, 53, value_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "value"


    public static class prefixExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "prefixExpr"
    // Haxe.g:364:1: prefixExpr : ( NEW ^ type LPAREN ! ( exprList )? RPAREN !| CAST ^ LPAREN ! expr ( COMMA ! funcType )? RPAREN !);
    public final HaxeParser.prefixExpr_return prefixExpr() throws RecognitionException {
        HaxeParser.prefixExpr_return retval = new HaxeParser.prefixExpr_return();
        retval.start = input.LT(1);

        int prefixExpr_StartIndex = input.index();

        Object root_0 = null;

        Token NEW274=null;
        Token LPAREN276=null;
        Token RPAREN278=null;
        Token CAST279=null;
        Token LPAREN280=null;
        Token COMMA282=null;
        Token RPAREN284=null;
        HaxeParser.type_return type275 =null;

        HaxeParser.exprList_return exprList277 =null;

        HaxeParser.expr_return expr281 =null;

        HaxeParser.funcType_return funcType283 =null;


        Object NEW274_tree=null;
        Object LPAREN276_tree=null;
        Object RPAREN278_tree=null;
        Object CAST279_tree=null;
        Object LPAREN280_tree=null;
        Object COMMA282_tree=null;
        Object RPAREN284_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 54) ) { return retval; }

            // Haxe.g:365:5: ( NEW ^ type LPAREN ! ( exprList )? RPAREN !| CAST ^ LPAREN ! expr ( COMMA ! funcType )? RPAREN !)
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==NEW) ) {
                alt78=1;
            }
            else if ( (LA78_0==CAST) ) {
                alt78=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 78, 0, input);

                throw nvae;

            }
            switch (alt78) {
                case 1 :
                    // Haxe.g:365:7: NEW ^ type LPAREN ! ( exprList )? RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    NEW274=(Token)match(input,NEW,FOLLOW_NEW_in_prefixExpr4499); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NEW274_tree = 
                    (Object)adaptor.create(NEW274)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(NEW274_tree, root_0);
                    }

                    pushFollow(FOLLOW_type_in_prefixExpr4502);
                    type275=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, type275.getTree());

                    LPAREN276=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_prefixExpr4504); if (state.failed) return retval;

                    // Haxe.g:365:25: ( exprList )?
                    int alt76=2;
                    int LA76_0 = input.LA(1);

                    if ( (LA76_0==BANG||LA76_0==CAST||LA76_0==CHARLITERAL||LA76_0==FALSE||LA76_0==FLOATNUM||LA76_0==FUNCTION||LA76_0==IDENTIFIER||LA76_0==INTLITERAL||(LA76_0 >= LBRACE && LA76_0 <= LBRACKET)||(LA76_0 >= LONGLITERAL && LA76_0 <= LPAREN)||(LA76_0 >= NEW && LA76_0 <= NULL)||LA76_0==PLUSPLUS||(LA76_0 >= STRINGLITERAL && LA76_0 <= SUB)||LA76_0==SUBSUB||LA76_0==THIS||LA76_0==TILDE||LA76_0==TRUE||LA76_0==UNTYPED) ) {
                        alt76=1;
                    }
                    switch (alt76) {
                        case 1 :
                            // Haxe.g:365:25: exprList
                            {
                            pushFollow(FOLLOW_exprList_in_prefixExpr4507);
                            exprList277=exprList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, exprList277.getTree());

                            }
                            break;

                    }


                    RPAREN278=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_prefixExpr4510); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // Haxe.g:366:7: CAST ^ LPAREN ! expr ( COMMA ! funcType )? RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    CAST279=(Token)match(input,CAST,FOLLOW_CAST_in_prefixExpr4519); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CAST279_tree = 
                    (Object)adaptor.create(CAST279)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(CAST279_tree, root_0);
                    }

                    LPAREN280=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_prefixExpr4522); if (state.failed) return retval;

                    pushFollow(FOLLOW_expr_in_prefixExpr4525);
                    expr281=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr281.getTree());

                    // Haxe.g:366:26: ( COMMA ! funcType )?
                    int alt77=2;
                    int LA77_0 = input.LA(1);

                    if ( (LA77_0==COMMA) ) {
                        alt77=1;
                    }
                    switch (alt77) {
                        case 1 :
                            // Haxe.g:366:27: COMMA ! funcType
                            {
                            COMMA282=(Token)match(input,COMMA,FOLLOW_COMMA_in_prefixExpr4528); if (state.failed) return retval;

                            pushFollow(FOLLOW_funcType_in_prefixExpr4531);
                            funcType283=funcType();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, funcType283.getTree());

                            }
                            break;

                    }


                    RPAREN284=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_prefixExpr4535); if (state.failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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


    public static class topLevelDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "topLevelDecl"
    // Haxe.g:370:1: topLevelDecl : ( classDecl | interfaceDecl | enumDecl | typedefDecl );
    public final HaxeParser.topLevelDecl_return topLevelDecl() throws RecognitionException {
        HaxeParser.topLevelDecl_return retval = new HaxeParser.topLevelDecl_return();
        retval.start = input.LT(1);

        int topLevelDecl_StartIndex = input.index();

        Object root_0 = null;

        HaxeParser.classDecl_return classDecl285 =null;

        HaxeParser.interfaceDecl_return interfaceDecl286 =null;

        HaxeParser.enumDecl_return enumDecl287 =null;

        HaxeParser.typedefDecl_return typedefDecl288 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 55) ) { return retval; }

            // Haxe.g:370:17: ( classDecl | interfaceDecl | enumDecl | typedefDecl )
            int alt79=4;
            switch ( input.LA(1) ) {
            case EXTERN:
            case PRIVATE:
                {
                switch ( input.LA(2) ) {
                case CLASS:
                    {
                    alt79=1;
                    }
                    break;
                case INTERFACE:
                    {
                    alt79=2;
                    }
                    break;
                case ENUM:
                    {
                    alt79=3;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 79, 1, input);

                    throw nvae;

                }

                }
                break;
            case CLASS:
                {
                alt79=1;
                }
                break;
            case INTERFACE:
                {
                alt79=2;
                }
                break;
            case ENUM:
                {
                alt79=3;
                }
                break;
            case TYPEDEF:
                {
                alt79=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 79, 0, input);

                throw nvae;

            }

            switch (alt79) {
                case 1 :
                    // Haxe.g:370:19: classDecl
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_classDecl_in_topLevelDecl4554);
                    classDecl285=classDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, classDecl285.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:371:19: interfaceDecl
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_interfaceDecl_in_topLevelDecl4574);
                    interfaceDecl286=interfaceDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceDecl286.getTree());

                    }
                    break;
                case 3 :
                    // Haxe.g:372:19: enumDecl
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_enumDecl_in_topLevelDecl4594);
                    enumDecl287=enumDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, enumDecl287.getTree());

                    }
                    break;
                case 4 :
                    // Haxe.g:373:19: typedefDecl
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_typedefDecl_in_topLevelDecl4614);
                    typedefDecl288=typedefDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typedefDecl288.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
            if ( state.backtracking>0 ) { memoize(input, 55, topLevelDecl_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "topLevelDecl"


    public static class enumDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "enumDecl"
    // Haxe.g:376:1: enumDecl : ( topLevelAccess )? ENUM IDENTIFIER typeParamOpt enumBody -> ^( IDENTIFIER ( topLevelAccess )? ( typeParamOpt )? ( enumBody )? ) ;
    public final HaxeParser.enumDecl_return enumDecl() throws RecognitionException {
        HaxeParser.enumDecl_return retval = new HaxeParser.enumDecl_return();
        retval.start = input.LT(1);

        int enumDecl_StartIndex = input.index();

        Object root_0 = null;

        Token ENUM290=null;
        Token IDENTIFIER291=null;
        HaxeParser.topLevelAccess_return topLevelAccess289 =null;

        HaxeParser.typeParamOpt_return typeParamOpt292 =null;

        HaxeParser.enumBody_return enumBody293 =null;


        Object ENUM290_tree=null;
        Object IDENTIFIER291_tree=null;
        RewriteRuleTokenStream stream_ENUM=new RewriteRuleTokenStream(adaptor,"token ENUM");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleSubtreeStream stream_enumBody=new RewriteRuleSubtreeStream(adaptor,"rule enumBody");
        RewriteRuleSubtreeStream stream_typeParamOpt=new RewriteRuleSubtreeStream(adaptor,"rule typeParamOpt");
        RewriteRuleSubtreeStream stream_topLevelAccess=new RewriteRuleSubtreeStream(adaptor,"rule topLevelAccess");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 56) ) { return retval; }

            // Haxe.g:376:17: ( ( topLevelAccess )? ENUM IDENTIFIER typeParamOpt enumBody -> ^( IDENTIFIER ( topLevelAccess )? ( typeParamOpt )? ( enumBody )? ) )
            // Haxe.g:376:19: ( topLevelAccess )? ENUM IDENTIFIER typeParamOpt enumBody
            {
            // Haxe.g:376:19: ( topLevelAccess )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==EXTERN||LA80_0==PRIVATE) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // Haxe.g:376:19: topLevelAccess
                    {
                    pushFollow(FOLLOW_topLevelAccess_in_enumDecl4650);
                    topLevelAccess289=topLevelAccess();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_topLevelAccess.add(topLevelAccess289.getTree());

                    }
                    break;

            }


            ENUM290=(Token)match(input,ENUM,FOLLOW_ENUM_in_enumDecl4653); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ENUM.add(ENUM290);


            IDENTIFIER291=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_enumDecl4655); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER291);


            pushFollow(FOLLOW_typeParamOpt_in_enumDecl4657);
            typeParamOpt292=typeParamOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeParamOpt.add(typeParamOpt292.getTree());

            pushFollow(FOLLOW_enumBody_in_enumDecl4659);
            enumBody293=enumBody();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_enumBody.add(enumBody293.getTree());

            // AST REWRITE
            // elements: topLevelAccess, IDENTIFIER, enumBody, typeParamOpt
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 376:73: -> ^( IDENTIFIER ( topLevelAccess )? ( typeParamOpt )? ( enumBody )? )
            {
                // Haxe.g:376:76: ^( IDENTIFIER ( topLevelAccess )? ( typeParamOpt )? ( enumBody )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                new EnumNode(stream_IDENTIFIER.nextToken())
                , root_1);

                // Haxe.g:376:99: ( topLevelAccess )?
                if ( stream_topLevelAccess.hasNext() ) {
                    adaptor.addChild(root_1, stream_topLevelAccess.nextTree());

                }
                stream_topLevelAccess.reset();

                // Haxe.g:376:115: ( typeParamOpt )?
                if ( stream_typeParamOpt.hasNext() ) {
                    adaptor.addChild(root_1, stream_typeParamOpt.nextTree());

                }
                stream_typeParamOpt.reset();

                // Haxe.g:376:129: ( enumBody )?
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
            if ( state.backtracking>0 ) { memoize(input, 56, enumDecl_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "enumDecl"


    public static class enumBody_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "enumBody"
    // Haxe.g:379:1: enumBody : LBRACE ( enumValueDecl )* RBRACE -> ^( BLOCK_SCOPE[$LBRACE, $RBRACE] ( enumValueDecl )* ) ;
    public final HaxeParser.enumBody_return enumBody() throws RecognitionException {
        HaxeParser.enumBody_return retval = new HaxeParser.enumBody_return();
        retval.start = input.LT(1);

        int enumBody_StartIndex = input.index();

        Object root_0 = null;

        Token LBRACE294=null;
        Token RBRACE296=null;
        HaxeParser.enumValueDecl_return enumValueDecl295 =null;


        Object LBRACE294_tree=null;
        Object RBRACE296_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_enumValueDecl=new RewriteRuleSubtreeStream(adaptor,"rule enumValueDecl");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 57) ) { return retval; }

            // Haxe.g:379:17: ( LBRACE ( enumValueDecl )* RBRACE -> ^( BLOCK_SCOPE[$LBRACE, $RBRACE] ( enumValueDecl )* ) )
            // Haxe.g:379:19: LBRACE ( enumValueDecl )* RBRACE
            {
            LBRACE294=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_enumBody4709); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACE.add(LBRACE294);


            // Haxe.g:379:26: ( enumValueDecl )*
            loop81:
            do {
                int alt81=2;
                int LA81_0 = input.LA(1);

                if ( (LA81_0==IDENTIFIER) ) {
                    alt81=1;
                }


                switch (alt81) {
            	case 1 :
            	    // Haxe.g:379:27: enumValueDecl
            	    {
            	    pushFollow(FOLLOW_enumValueDecl_in_enumBody4712);
            	    enumValueDecl295=enumValueDecl();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_enumValueDecl.add(enumValueDecl295.getTree());

            	    }
            	    break;

            	default :
            	    break loop81;
                }
            } while (true);


            RBRACE296=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_enumBody4716); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACE.add(RBRACE296);


            // AST REWRITE
            // elements: enumValueDecl
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 379:50: -> ^( BLOCK_SCOPE[$LBRACE, $RBRACE] ( enumValueDecl )* )
            {
                // Haxe.g:379:53: ^( BLOCK_SCOPE[$LBRACE, $RBRACE] ( enumValueDecl )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                new BlockScopeNode(BLOCK_SCOPE, LBRACE294, RBRACE296)
                , root_1);

                // Haxe.g:379:101: ( enumValueDecl )*
                while ( stream_enumValueDecl.hasNext() ) {
                    adaptor.addChild(root_1, stream_enumValueDecl.nextTree());

                }
                stream_enumValueDecl.reset();

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
            if ( state.backtracking>0 ) { memoize(input, 57, enumBody_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "enumBody"


    public static class enumValueDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "enumValueDecl"
    // Haxe.g:382:1: enumValueDecl : ( IDENTIFIER ^ LPAREN ! ( paramList )? RPAREN ! SEMI !| IDENTIFIER SEMI !);
    public final HaxeParser.enumValueDecl_return enumValueDecl() throws RecognitionException {
        HaxeParser.enumValueDecl_return retval = new HaxeParser.enumValueDecl_return();
        retval.start = input.LT(1);

        int enumValueDecl_StartIndex = input.index();

        Object root_0 = null;

        Token IDENTIFIER297=null;
        Token LPAREN298=null;
        Token RPAREN300=null;
        Token SEMI301=null;
        Token IDENTIFIER302=null;
        Token SEMI303=null;
        HaxeParser.paramList_return paramList299 =null;


        Object IDENTIFIER297_tree=null;
        Object LPAREN298_tree=null;
        Object RPAREN300_tree=null;
        Object SEMI301_tree=null;
        Object IDENTIFIER302_tree=null;
        Object SEMI303_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 58) ) { return retval; }

            // Haxe.g:382:17: ( IDENTIFIER ^ LPAREN ! ( paramList )? RPAREN ! SEMI !| IDENTIFIER SEMI !)
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==IDENTIFIER) ) {
                int LA83_1 = input.LA(2);

                if ( (LA83_1==LPAREN) ) {
                    alt83=1;
                }
                else if ( (LA83_1==SEMI) ) {
                    alt83=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 83, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 83, 0, input);

                throw nvae;

            }
            switch (alt83) {
                case 1 :
                    // Haxe.g:382:19: IDENTIFIER ^ LPAREN ! ( paramList )? RPAREN ! SEMI !
                    {
                    root_0 = (Object)adaptor.nil();


                    IDENTIFIER297=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_enumValueDecl4756); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER297_tree = 
                    new VarDeclarationNode(IDENTIFIER297) 
                    ;
                    root_0 = (Object)adaptor.becomeRoot(IDENTIFIER297_tree, root_0);
                    }

                    LPAREN298=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_enumValueDecl4762); if (state.failed) return retval;

                    // Haxe.g:382:59: ( paramList )?
                    int alt82=2;
                    int LA82_0 = input.LA(1);

                    if ( (LA82_0==IDENTIFIER||LA82_0==QUES) ) {
                        alt82=1;
                    }
                    switch (alt82) {
                        case 1 :
                            // Haxe.g:382:59: paramList
                            {
                            pushFollow(FOLLOW_paramList_in_enumValueDecl4765);
                            paramList299=paramList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, paramList299.getTree());

                            }
                            break;

                    }


                    RPAREN300=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_enumValueDecl4768); if (state.failed) return retval;

                    SEMI301=(Token)match(input,SEMI,FOLLOW_SEMI_in_enumValueDecl4771); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // Haxe.g:383:19: IDENTIFIER SEMI !
                    {
                    root_0 = (Object)adaptor.nil();


                    IDENTIFIER302=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_enumValueDecl4794); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER302_tree = 
                    new VarDeclarationNode(IDENTIFIER302) 
                    ;
                    adaptor.addChild(root_0, IDENTIFIER302_tree);
                    }

                    SEMI303=(Token)match(input,SEMI,FOLLOW_SEMI_in_enumValueDecl4799); if (state.failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
            if ( state.backtracking>0 ) { memoize(input, 58, enumValueDecl_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "enumValueDecl"


    public static class classDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "classDecl"
    // Haxe.g:387:1: classDecl : ( topLevelAccess )? CLASS IDENTIFIER typeParamOpt inheritListOpt classBodyScope -> ^( IDENTIFIER ( topLevelAccess )? ( typeParamOpt )? ( inheritListOpt )? ( classBodyScope )? ) ;
    public final HaxeParser.classDecl_return classDecl() throws RecognitionException {
        HaxeParser.classDecl_return retval = new HaxeParser.classDecl_return();
        retval.start = input.LT(1);

        int classDecl_StartIndex = input.index();

        Object root_0 = null;

        Token CLASS305=null;
        Token IDENTIFIER306=null;
        HaxeParser.topLevelAccess_return topLevelAccess304 =null;

        HaxeParser.typeParamOpt_return typeParamOpt307 =null;

        HaxeParser.inheritListOpt_return inheritListOpt308 =null;

        HaxeParser.classBodyScope_return classBodyScope309 =null;


        Object CLASS305_tree=null;
        Object IDENTIFIER306_tree=null;
        RewriteRuleTokenStream stream_CLASS=new RewriteRuleTokenStream(adaptor,"token CLASS");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleSubtreeStream stream_classBodyScope=new RewriteRuleSubtreeStream(adaptor,"rule classBodyScope");
        RewriteRuleSubtreeStream stream_typeParamOpt=new RewriteRuleSubtreeStream(adaptor,"rule typeParamOpt");
        RewriteRuleSubtreeStream stream_topLevelAccess=new RewriteRuleSubtreeStream(adaptor,"rule topLevelAccess");
        RewriteRuleSubtreeStream stream_inheritListOpt=new RewriteRuleSubtreeStream(adaptor,"rule inheritListOpt");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 59) ) { return retval; }

            // Haxe.g:387:17: ( ( topLevelAccess )? CLASS IDENTIFIER typeParamOpt inheritListOpt classBodyScope -> ^( IDENTIFIER ( topLevelAccess )? ( typeParamOpt )? ( inheritListOpt )? ( classBodyScope )? ) )
            // Haxe.g:387:19: ( topLevelAccess )? CLASS IDENTIFIER typeParamOpt inheritListOpt classBodyScope
            {
            // Haxe.g:387:19: ( topLevelAccess )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==EXTERN||LA84_0==PRIVATE) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // Haxe.g:387:19: topLevelAccess
                    {
                    pushFollow(FOLLOW_topLevelAccess_in_classDecl4848);
                    topLevelAccess304=topLevelAccess();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_topLevelAccess.add(topLevelAccess304.getTree());

                    }
                    break;

            }


            CLASS305=(Token)match(input,CLASS,FOLLOW_CLASS_in_classDecl4851); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CLASS.add(CLASS305);


            IDENTIFIER306=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_classDecl4853); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER306);


            pushFollow(FOLLOW_typeParamOpt_in_classDecl4855);
            typeParamOpt307=typeParamOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeParamOpt.add(typeParamOpt307.getTree());

            pushFollow(FOLLOW_inheritListOpt_in_classDecl4857);
            inheritListOpt308=inheritListOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_inheritListOpt.add(inheritListOpt308.getTree());

            pushFollow(FOLLOW_classBodyScope_in_classDecl4859);
            classBodyScope309=classBodyScope();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_classBodyScope.add(classBodyScope309.getTree());

            // AST REWRITE
            // elements: IDENTIFIER, inheritListOpt, topLevelAccess, typeParamOpt, classBodyScope
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 387:95: -> ^( IDENTIFIER ( topLevelAccess )? ( typeParamOpt )? ( inheritListOpt )? ( classBodyScope )? )
            {
                // Haxe.g:387:98: ^( IDENTIFIER ( topLevelAccess )? ( typeParamOpt )? ( inheritListOpt )? ( classBodyScope )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                new ClassNode(stream_IDENTIFIER.nextToken())
                , root_1);

                // Haxe.g:387:122: ( topLevelAccess )?
                if ( stream_topLevelAccess.hasNext() ) {
                    adaptor.addChild(root_1, stream_topLevelAccess.nextTree());

                }
                stream_topLevelAccess.reset();

                // Haxe.g:387:138: ( typeParamOpt )?
                if ( stream_typeParamOpt.hasNext() ) {
                    adaptor.addChild(root_1, stream_typeParamOpt.nextTree());

                }
                stream_typeParamOpt.reset();

                // Haxe.g:387:152: ( inheritListOpt )?
                if ( stream_inheritListOpt.hasNext() ) {
                    adaptor.addChild(root_1, stream_inheritListOpt.nextTree());

                }
                stream_inheritListOpt.reset();

                // Haxe.g:387:168: ( classBodyScope )?
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
            if ( state.backtracking>0 ) { memoize(input, 59, classDecl_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "classDecl"


    public static class classBodyScope_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "classBodyScope"
    // Haxe.g:390:1: classBodyScope : LBRACE ( classMember )* RBRACE -> ^( BLOCK_SCOPE[$LBRACE, $RBRACE] ( classMember )* ) ;
    public final HaxeParser.classBodyScope_return classBodyScope() throws RecognitionException {
        HaxeParser.classBodyScope_return retval = new HaxeParser.classBodyScope_return();
        retval.start = input.LT(1);

        int classBodyScope_StartIndex = input.index();

        Object root_0 = null;

        Token LBRACE310=null;
        Token RBRACE312=null;
        HaxeParser.classMember_return classMember311 =null;


        Object LBRACE310_tree=null;
        Object RBRACE312_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_classMember=new RewriteRuleSubtreeStream(adaptor,"rule classMember");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 60) ) { return retval; }

            // Haxe.g:390:17: ( LBRACE ( classMember )* RBRACE -> ^( BLOCK_SCOPE[$LBRACE, $RBRACE] ( classMember )* ) )
            // Haxe.g:390:19: LBRACE ( classMember )* RBRACE
            {
            LBRACE310=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_classBodyScope4906); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACE.add(LBRACE310);


            // Haxe.g:390:26: ( classMember )*
            loop85:
            do {
                int alt85=2;
                int LA85_0 = input.LA(1);

                if ( (LA85_0==DYNAMIC||LA85_0==FUNCTION||LA85_0==INLINE||LA85_0==OVERRIDE||LA85_0==PRIVATE||LA85_0==PUBLIC||LA85_0==STATIC||LA85_0==VAR) ) {
                    alt85=1;
                }


                switch (alt85) {
            	case 1 :
            	    // Haxe.g:390:27: classMember
            	    {
            	    pushFollow(FOLLOW_classMember_in_classBodyScope4909);
            	    classMember311=classMember();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_classMember.add(classMember311.getTree());

            	    }
            	    break;

            	default :
            	    break loop85;
                }
            } while (true);


            RBRACE312=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_classBodyScope4913); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACE.add(RBRACE312);


            // AST REWRITE
            // elements: classMember
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 390:48: -> ^( BLOCK_SCOPE[$LBRACE, $RBRACE] ( classMember )* )
            {
                // Haxe.g:390:51: ^( BLOCK_SCOPE[$LBRACE, $RBRACE] ( classMember )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                new BlockScopeNode(BLOCK_SCOPE, LBRACE310, RBRACE312)
                , root_1);

                // Haxe.g:390:99: ( classMember )*
                while ( stream_classMember.hasNext() ) {
                    adaptor.addChild(root_1, stream_classMember.nextTree());

                }
                stream_classMember.reset();

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
            if ( state.backtracking>0 ) { memoize(input, 60, classBodyScope_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "classBodyScope"


    public static class classMember_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "classMember"
    // Haxe.g:393:1: classMember : ( varDeclClass | funcDecl );
    public final HaxeParser.classMember_return classMember() throws RecognitionException {
        HaxeParser.classMember_return retval = new HaxeParser.classMember_return();
        retval.start = input.LT(1);

        int classMember_StartIndex = input.index();

        Object root_0 = null;

        HaxeParser.varDeclClass_return varDeclClass313 =null;

        HaxeParser.funcDecl_return funcDecl314 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 61) ) { return retval; }

            // Haxe.g:393:17: ( varDeclClass | funcDecl )
            int alt86=2;
            alt86 = dfa86.predict(input);
            switch (alt86) {
                case 1 :
                    // Haxe.g:393:19: varDeclClass
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_varDeclClass_in_classMember4959);
                    varDeclClass313=varDeclClass();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclClass313.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:394:19: funcDecl
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_funcDecl_in_classMember4979);
                    funcDecl314=funcDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, funcDecl314.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
            if ( state.backtracking>0 ) { memoize(input, 61, classMember_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "classMember"


    public static class varDeclList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "varDeclList"
    // Haxe.g:398:1: varDeclList : varDecl varDeclList ;
    public final HaxeParser.varDeclList_return varDeclList() throws RecognitionException {
        HaxeParser.varDeclList_return retval = new HaxeParser.varDeclList_return();
        retval.start = input.LT(1);

        int varDeclList_StartIndex = input.index();

        Object root_0 = null;

        HaxeParser.varDecl_return varDecl315 =null;

        HaxeParser.varDeclList_return varDeclList316 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 62) ) { return retval; }

            // Haxe.g:398:17: ( varDecl varDeclList )
            // Haxe.g:398:19: varDecl varDeclList
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_varDecl_in_varDeclList5022);
            varDecl315=varDecl();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, varDecl315.getTree());

            pushFollow(FOLLOW_varDeclList_in_varDeclList5024);
            varDeclList316=varDeclList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclList316.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
            if ( state.backtracking>0 ) { memoize(input, 62, varDeclList_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "varDeclList"


    public static class varDeclClass_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "varDeclClass"
    // Haxe.g:401:1: varDeclClass : ( declAttrList )? VAR IDENTIFIER ( propDecl )? ( typeTag )? ( varInit )? SEMI -> ^( IDENTIFIER ( declAttrList )? ( propDecl )? ( typeTag )? ( varInit )? ) ;
    public final HaxeParser.varDeclClass_return varDeclClass() throws RecognitionException {
        HaxeParser.varDeclClass_return retval = new HaxeParser.varDeclClass_return();
        retval.start = input.LT(1);

        int varDeclClass_StartIndex = input.index();

        Object root_0 = null;

        Token VAR318=null;
        Token IDENTIFIER319=null;
        Token SEMI323=null;
        HaxeParser.declAttrList_return declAttrList317 =null;

        HaxeParser.propDecl_return propDecl320 =null;

        HaxeParser.typeTag_return typeTag321 =null;

        HaxeParser.varInit_return varInit322 =null;


        Object VAR318_tree=null;
        Object IDENTIFIER319_tree=null;
        Object SEMI323_tree=null;
        RewriteRuleTokenStream stream_VAR=new RewriteRuleTokenStream(adaptor,"token VAR");
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleSubtreeStream stream_typeTag=new RewriteRuleSubtreeStream(adaptor,"rule typeTag");
        RewriteRuleSubtreeStream stream_declAttrList=new RewriteRuleSubtreeStream(adaptor,"rule declAttrList");
        RewriteRuleSubtreeStream stream_propDecl=new RewriteRuleSubtreeStream(adaptor,"rule propDecl");
        RewriteRuleSubtreeStream stream_varInit=new RewriteRuleSubtreeStream(adaptor,"rule varInit");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 63) ) { return retval; }

            // Haxe.g:401:17: ( ( declAttrList )? VAR IDENTIFIER ( propDecl )? ( typeTag )? ( varInit )? SEMI -> ^( IDENTIFIER ( declAttrList )? ( propDecl )? ( typeTag )? ( varInit )? ) )
            // Haxe.g:401:19: ( declAttrList )? VAR IDENTIFIER ( propDecl )? ( typeTag )? ( varInit )? SEMI
            {
            // Haxe.g:401:19: ( declAttrList )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==DYNAMIC||LA87_0==INLINE||LA87_0==OVERRIDE||LA87_0==PRIVATE||LA87_0==PUBLIC||LA87_0==STATIC) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // Haxe.g:401:19: declAttrList
                    {
                    pushFollow(FOLLOW_declAttrList_in_varDeclClass5052);
                    declAttrList317=declAttrList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declAttrList.add(declAttrList317.getTree());

                    }
                    break;

            }


            VAR318=(Token)match(input,VAR,FOLLOW_VAR_in_varDeclClass5055); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_VAR.add(VAR318);


            IDENTIFIER319=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_varDeclClass5057); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER319);


            // Haxe.g:401:48: ( propDecl )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==LPAREN) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // Haxe.g:401:48: propDecl
                    {
                    pushFollow(FOLLOW_propDecl_in_varDeclClass5059);
                    propDecl320=propDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_propDecl.add(propDecl320.getTree());

                    }
                    break;

            }


            // Haxe.g:401:58: ( typeTag )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==COLON) ) {
                alt89=1;
            }
            switch (alt89) {
                case 1 :
                    // Haxe.g:401:58: typeTag
                    {
                    pushFollow(FOLLOW_typeTag_in_varDeclClass5062);
                    typeTag321=typeTag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeTag.add(typeTag321.getTree());

                    }
                    break;

            }


            // Haxe.g:401:67: ( varInit )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==EQ) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // Haxe.g:401:67: varInit
                    {
                    pushFollow(FOLLOW_varInit_in_varDeclClass5065);
                    varInit322=varInit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_varInit.add(varInit322.getTree());

                    }
                    break;

            }


            SEMI323=(Token)match(input,SEMI,FOLLOW_SEMI_in_varDeclClass5068); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SEMI.add(SEMI323);


            // AST REWRITE
            // elements: declAttrList, IDENTIFIER, varInit, typeTag, propDecl
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 401:81: -> ^( IDENTIFIER ( declAttrList )? ( propDecl )? ( typeTag )? ( varInit )? )
            {
                // Haxe.g:401:84: ^( IDENTIFIER ( declAttrList )? ( propDecl )? ( typeTag )? ( varInit )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                new VarDeclarationNode(stream_IDENTIFIER.nextToken())
                , root_1);

                // Haxe.g:401:117: ( declAttrList )?
                if ( stream_declAttrList.hasNext() ) {
                    adaptor.addChild(root_1, stream_declAttrList.nextTree());

                }
                stream_declAttrList.reset();

                // Haxe.g:401:131: ( propDecl )?
                if ( stream_propDecl.hasNext() ) {
                    adaptor.addChild(root_1, stream_propDecl.nextTree());

                }
                stream_propDecl.reset();

                // Haxe.g:401:141: ( typeTag )?
                if ( stream_typeTag.hasNext() ) {
                    adaptor.addChild(root_1, stream_typeTag.nextTree());

                }
                stream_typeTag.reset();

                // Haxe.g:401:150: ( varInit )?
                if ( stream_varInit.hasNext() ) {
                    adaptor.addChild(root_1, stream_varInit.nextTree());

                }
                stream_varInit.reset();

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
            if ( state.backtracking>0 ) { memoize(input, 63, varDeclClass_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "varDeclClass"


    public static class varDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "varDecl"
    // Haxe.g:404:1: varDecl : VAR ! varDeclPartList ( COMMA ! varDeclPartList )* SEMI !;
    public final HaxeParser.varDecl_return varDecl() throws RecognitionException {
        HaxeParser.varDecl_return retval = new HaxeParser.varDecl_return();
        retval.start = input.LT(1);

        int varDecl_StartIndex = input.index();

        Object root_0 = null;

        Token VAR324=null;
        Token COMMA326=null;
        Token SEMI328=null;
        HaxeParser.varDeclPartList_return varDeclPartList325 =null;

        HaxeParser.varDeclPartList_return varDeclPartList327 =null;


        Object VAR324_tree=null;
        Object COMMA326_tree=null;
        Object SEMI328_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 64) ) { return retval; }

            // Haxe.g:404:12: ( VAR ! varDeclPartList ( COMMA ! varDeclPartList )* SEMI !)
            // Haxe.g:404:14: VAR ! varDeclPartList ( COMMA ! varDeclPartList )* SEMI !
            {
            root_0 = (Object)adaptor.nil();


            VAR324=(Token)match(input,VAR,FOLLOW_VAR_in_varDecl5133); if (state.failed) return retval;

            pushFollow(FOLLOW_varDeclPartList_in_varDecl5136);
            varDeclPartList325=varDeclPartList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclPartList325.getTree());

            // Haxe.g:404:35: ( COMMA ! varDeclPartList )*
            loop91:
            do {
                int alt91=2;
                int LA91_0 = input.LA(1);

                if ( (LA91_0==COMMA) ) {
                    alt91=1;
                }


                switch (alt91) {
            	case 1 :
            	    // Haxe.g:404:36: COMMA ! varDeclPartList
            	    {
            	    COMMA326=(Token)match(input,COMMA,FOLLOW_COMMA_in_varDecl5139); if (state.failed) return retval;

            	    pushFollow(FOLLOW_varDeclPartList_in_varDecl5142);
            	    varDeclPartList327=varDeclPartList();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclPartList327.getTree());

            	    }
            	    break;

            	default :
            	    break loop91;
                }
            } while (true);


            SEMI328=(Token)match(input,SEMI,FOLLOW_SEMI_in_varDecl5146); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // Haxe.g:407:1: varDeclPartList : IDENTIFIER ( propDecl )? ( typeTag )? ( varInit )? -> ^( IDENTIFIER ( propDecl )? ( typeTag )? ( varInit )? ) ;
    public final HaxeParser.varDeclPartList_return varDeclPartList() throws RecognitionException {
        HaxeParser.varDeclPartList_return retval = new HaxeParser.varDeclPartList_return();
        retval.start = input.LT(1);

        int varDeclPartList_StartIndex = input.index();

        Object root_0 = null;

        Token IDENTIFIER329=null;
        HaxeParser.propDecl_return propDecl330 =null;

        HaxeParser.typeTag_return typeTag331 =null;

        HaxeParser.varInit_return varInit332 =null;


        Object IDENTIFIER329_tree=null;
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleSubtreeStream stream_typeTag=new RewriteRuleSubtreeStream(adaptor,"rule typeTag");
        RewriteRuleSubtreeStream stream_propDecl=new RewriteRuleSubtreeStream(adaptor,"rule propDecl");
        RewriteRuleSubtreeStream stream_varInit=new RewriteRuleSubtreeStream(adaptor,"rule varInit");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 65) ) { return retval; }

            // Haxe.g:407:17: ( IDENTIFIER ( propDecl )? ( typeTag )? ( varInit )? -> ^( IDENTIFIER ( propDecl )? ( typeTag )? ( varInit )? ) )
            // Haxe.g:407:19: IDENTIFIER ( propDecl )? ( typeTag )? ( varInit )?
            {
            IDENTIFIER329=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_varDeclPartList5167); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER329);


            // Haxe.g:407:30: ( propDecl )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==LPAREN) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // Haxe.g:407:30: propDecl
                    {
                    pushFollow(FOLLOW_propDecl_in_varDeclPartList5169);
                    propDecl330=propDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_propDecl.add(propDecl330.getTree());

                    }
                    break;

            }


            // Haxe.g:407:40: ( typeTag )?
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==COLON) ) {
                alt93=1;
            }
            switch (alt93) {
                case 1 :
                    // Haxe.g:407:40: typeTag
                    {
                    pushFollow(FOLLOW_typeTag_in_varDeclPartList5172);
                    typeTag331=typeTag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeTag.add(typeTag331.getTree());

                    }
                    break;

            }


            // Haxe.g:407:49: ( varInit )?
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==EQ) ) {
                alt94=1;
            }
            switch (alt94) {
                case 1 :
                    // Haxe.g:407:49: varInit
                    {
                    pushFollow(FOLLOW_varInit_in_varDeclPartList5175);
                    varInit332=varInit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_varInit.add(varInit332.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: propDecl, typeTag, IDENTIFIER, varInit
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 407:58: -> ^( IDENTIFIER ( propDecl )? ( typeTag )? ( varInit )? )
            {
                // Haxe.g:407:61: ^( IDENTIFIER ( propDecl )? ( typeTag )? ( varInit )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                new VarDeclarationNode(stream_IDENTIFIER.nextToken())
                , root_1);

                // Haxe.g:407:94: ( propDecl )?
                if ( stream_propDecl.hasNext() ) {
                    adaptor.addChild(root_1, stream_propDecl.nextTree());

                }
                stream_propDecl.reset();

                // Haxe.g:407:104: ( typeTag )?
                if ( stream_typeTag.hasNext() ) {
                    adaptor.addChild(root_1, stream_typeTag.nextTree());

                }
                stream_typeTag.reset();

                // Haxe.g:407:113: ( varInit )?
                if ( stream_varInit.hasNext() ) {
                    adaptor.addChild(root_1, stream_varInit.nextTree());

                }
                stream_varInit.reset();

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
            if ( state.backtracking>0 ) { memoize(input, 65, varDeclPartList_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "varDeclPartList"


    public static class propDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "propDecl"
    // Haxe.g:410:1: propDecl : LPAREN a1= propAccessor COMMA a2= propAccessor RPAREN -> ^( PROPERTY_DECL[\"PROPERTY_DECL\"] ( $a1)? ( $a2)? ) ;
    public final HaxeParser.propDecl_return propDecl() throws RecognitionException {
        HaxeParser.propDecl_return retval = new HaxeParser.propDecl_return();
        retval.start = input.LT(1);

        int propDecl_StartIndex = input.index();

        Object root_0 = null;

        Token LPAREN333=null;
        Token COMMA334=null;
        Token RPAREN335=null;
        HaxeParser.propAccessor_return a1 =null;

        HaxeParser.propAccessor_return a2 =null;


        Object LPAREN333_tree=null;
        Object COMMA334_tree=null;
        Object RPAREN335_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_propAccessor=new RewriteRuleSubtreeStream(adaptor,"rule propAccessor");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 66) ) { return retval; }

            // Haxe.g:410:17: ( LPAREN a1= propAccessor COMMA a2= propAccessor RPAREN -> ^( PROPERTY_DECL[\"PROPERTY_DECL\"] ( $a1)? ( $a2)? ) )
            // Haxe.g:410:19: LPAREN a1= propAccessor COMMA a2= propAccessor RPAREN
            {
            LPAREN333=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_propDecl5226); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN333);


            pushFollow(FOLLOW_propAccessor_in_propDecl5230);
            a1=propAccessor();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_propAccessor.add(a1.getTree());

            COMMA334=(Token)match(input,COMMA,FOLLOW_COMMA_in_propDecl5232); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COMMA.add(COMMA334);


            pushFollow(FOLLOW_propAccessor_in_propDecl5236);
            a2=propAccessor();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_propAccessor.add(a2.getTree());

            RPAREN335=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_propDecl5238); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN335);


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
            // 410:71: -> ^( PROPERTY_DECL[\"PROPERTY_DECL\"] ( $a1)? ( $a2)? )
            {
                // Haxe.g:410:74: ^( PROPERTY_DECL[\"PROPERTY_DECL\"] ( $a1)? ( $a2)? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                new HaxeTree(PROPERTY_DECL, "PROPERTY_DECL")
                , root_1);

                // Haxe.g:410:118: ( $a1)?
                if ( stream_a1.hasNext() ) {
                    adaptor.addChild(root_1, stream_a1.nextTree());

                }
                stream_a1.reset();

                // Haxe.g:410:123: ( $a2)?
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
            if ( state.backtracking>0 ) { memoize(input, 66, propDecl_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "propDecl"


    public static class propAccessor_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "propAccessor"
    // Haxe.g:413:1: propAccessor : ( IDENTIFIER | NULL | DEFAULT | DYNAMIC );
    public final HaxeParser.propAccessor_return propAccessor() throws RecognitionException {
        HaxeParser.propAccessor_return retval = new HaxeParser.propAccessor_return();
        retval.start = input.LT(1);

        int propAccessor_StartIndex = input.index();

        Object root_0 = null;

        Token set336=null;

        Object set336_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 67) ) { return retval; }

            // Haxe.g:413:17: ( IDENTIFIER | NULL | DEFAULT | DYNAMIC )
            // Haxe.g:
            {
            root_0 = (Object)adaptor.nil();


            set336=(Token)input.LT(1);

            if ( input.LA(1)==DEFAULT||input.LA(1)==DYNAMIC||input.LA(1)==IDENTIFIER||input.LA(1)==NULL ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (Object)adaptor.create(set336)
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
            if ( state.backtracking>0 ) { memoize(input, 67, propAccessor_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "propAccessor"


    public static class varInit_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "varInit"
    // Haxe.g:419:1: varInit : EQ expr -> ^( VAR_INIT[\"VAR_INIT\"] expr ) ;
    public final HaxeParser.varInit_return varInit() throws RecognitionException {
        HaxeParser.varInit_return retval = new HaxeParser.varInit_return();
        retval.start = input.LT(1);

        int varInit_StartIndex = input.index();

        Object root_0 = null;

        Token EQ337=null;
        HaxeParser.expr_return expr338 =null;


        Object EQ337_tree=null;
        RewriteRuleTokenStream stream_EQ=new RewriteRuleTokenStream(adaptor,"token EQ");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 68) ) { return retval; }

            // Haxe.g:419:17: ( EQ expr -> ^( VAR_INIT[\"VAR_INIT\"] expr ) )
            // Haxe.g:419:19: EQ expr
            {
            EQ337=(Token)match(input,EQ,FOLLOW_EQ_in_varInit5379); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_EQ.add(EQ337);


            pushFollow(FOLLOW_expr_in_varInit5381);
            expr338=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr338.getTree());

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
            // 419:27: -> ^( VAR_INIT[\"VAR_INIT\"] expr )
            {
                // Haxe.g:419:30: ^( VAR_INIT[\"VAR_INIT\"] expr )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                new HaxeTree(VAR_INIT, "VAR_INIT")
                , root_1);

                adaptor.addChild(root_1, stream_expr.nextTree());

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
            if ( state.backtracking>0 ) { memoize(input, 68, varInit_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "varInit"


    public static class funcDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "funcDecl"
    // Haxe.g:422:1: funcDecl : ( ( declAttrList )? FUNCTION NEW LPAREN ( paramList )? RPAREN ( typeTag )? block -> ^( FUNCTION NEW ( declAttrList )? ( paramList )? ( typeTag )? ( block )? ) | ( declAttrList )? FUNCTION IDENTIFIER typeParamOpt LPAREN ( paramList )? RPAREN ( typeTag )? block -> ^( FUNCTION IDENTIFIER ( declAttrList )? ( paramList )? ( typeTag )? ( block )? ( typeParamOpt )? ) );
    public final HaxeParser.funcDecl_return funcDecl() throws RecognitionException {
        HaxeParser.funcDecl_return retval = new HaxeParser.funcDecl_return();
        retval.start = input.LT(1);

        int funcDecl_StartIndex = input.index();

        Object root_0 = null;

        Token FUNCTION340=null;
        Token NEW341=null;
        Token LPAREN342=null;
        Token RPAREN344=null;
        Token FUNCTION348=null;
        Token IDENTIFIER349=null;
        Token LPAREN351=null;
        Token RPAREN353=null;
        HaxeParser.declAttrList_return declAttrList339 =null;

        HaxeParser.paramList_return paramList343 =null;

        HaxeParser.typeTag_return typeTag345 =null;

        HaxeParser.block_return block346 =null;

        HaxeParser.declAttrList_return declAttrList347 =null;

        HaxeParser.typeParamOpt_return typeParamOpt350 =null;

        HaxeParser.paramList_return paramList352 =null;

        HaxeParser.typeTag_return typeTag354 =null;

        HaxeParser.block_return block355 =null;


        Object FUNCTION340_tree=null;
        Object NEW341_tree=null;
        Object LPAREN342_tree=null;
        Object RPAREN344_tree=null;
        Object FUNCTION348_tree=null;
        Object IDENTIFIER349_tree=null;
        Object LPAREN351_tree=null;
        Object RPAREN353_tree=null;
        RewriteRuleTokenStream stream_FUNCTION=new RewriteRuleTokenStream(adaptor,"token FUNCTION");
        RewriteRuleTokenStream stream_NEW=new RewriteRuleTokenStream(adaptor,"token NEW");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_typeTag=new RewriteRuleSubtreeStream(adaptor,"rule typeTag");
        RewriteRuleSubtreeStream stream_declAttrList=new RewriteRuleSubtreeStream(adaptor,"rule declAttrList");
        RewriteRuleSubtreeStream stream_paramList=new RewriteRuleSubtreeStream(adaptor,"rule paramList");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_typeParamOpt=new RewriteRuleSubtreeStream(adaptor,"rule typeParamOpt");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 69) ) { return retval; }

            // Haxe.g:422:9: ( ( declAttrList )? FUNCTION NEW LPAREN ( paramList )? RPAREN ( typeTag )? block -> ^( FUNCTION NEW ( declAttrList )? ( paramList )? ( typeTag )? ( block )? ) | ( declAttrList )? FUNCTION IDENTIFIER typeParamOpt LPAREN ( paramList )? RPAREN ( typeTag )? block -> ^( FUNCTION IDENTIFIER ( declAttrList )? ( paramList )? ( typeTag )? ( block )? ( typeParamOpt )? ) )
            int alt101=2;
            alt101 = dfa101.predict(input);
            switch (alt101) {
                case 1 :
                    // Haxe.g:422:13: ( declAttrList )? FUNCTION NEW LPAREN ( paramList )? RPAREN ( typeTag )? block
                    {
                    // Haxe.g:422:13: ( declAttrList )?
                    int alt95=2;
                    int LA95_0 = input.LA(1);

                    if ( (LA95_0==DYNAMIC||LA95_0==INLINE||LA95_0==OVERRIDE||LA95_0==PRIVATE||LA95_0==PUBLIC||LA95_0==STATIC) ) {
                        alt95=1;
                    }
                    switch (alt95) {
                        case 1 :
                            // Haxe.g:422:13: declAttrList
                            {
                            pushFollow(FOLLOW_declAttrList_in_funcDecl5423);
                            declAttrList339=declAttrList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_declAttrList.add(declAttrList339.getTree());

                            }
                            break;

                    }


                    FUNCTION340=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcDecl5426); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION340);


                    NEW341=(Token)match(input,NEW,FOLLOW_NEW_in_funcDecl5428); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEW.add(NEW341);


                    LPAREN342=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcDecl5430); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN342);


                    // Haxe.g:422:47: ( paramList )?
                    int alt96=2;
                    int LA96_0 = input.LA(1);

                    if ( (LA96_0==IDENTIFIER||LA96_0==QUES) ) {
                        alt96=1;
                    }
                    switch (alt96) {
                        case 1 :
                            // Haxe.g:422:47: paramList
                            {
                            pushFollow(FOLLOW_paramList_in_funcDecl5432);
                            paramList343=paramList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_paramList.add(paramList343.getTree());

                            }
                            break;

                    }


                    RPAREN344=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcDecl5435); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN344);


                    // Haxe.g:422:65: ( typeTag )?
                    int alt97=2;
                    int LA97_0 = input.LA(1);

                    if ( (LA97_0==COLON) ) {
                        alt97=1;
                    }
                    switch (alt97) {
                        case 1 :
                            // Haxe.g:422:65: typeTag
                            {
                            pushFollow(FOLLOW_typeTag_in_funcDecl5437);
                            typeTag345=typeTag();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_typeTag.add(typeTag345.getTree());

                            }
                            break;

                    }


                    pushFollow(FOLLOW_block_in_funcDecl5440);
                    block346=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block346.getTree());

                    // AST REWRITE
                    // elements: NEW, typeTag, block, paramList, declAttrList, FUNCTION
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 423:17: -> ^( FUNCTION NEW ( declAttrList )? ( paramList )? ( typeTag )? ( block )? )
                    {
                        // Haxe.g:423:20: ^( FUNCTION NEW ( declAttrList )? ( paramList )? ( typeTag )? ( block )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        new FunctionNode(stream_FUNCTION.nextToken())
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_NEW.nextNode()
                        );

                        // Haxe.g:423:49: ( declAttrList )?
                        if ( stream_declAttrList.hasNext() ) {
                            adaptor.addChild(root_1, stream_declAttrList.nextTree());

                        }
                        stream_declAttrList.reset();

                        // Haxe.g:423:63: ( paramList )?
                        if ( stream_paramList.hasNext() ) {
                            adaptor.addChild(root_1, stream_paramList.nextTree());

                        }
                        stream_paramList.reset();

                        // Haxe.g:423:74: ( typeTag )?
                        if ( stream_typeTag.hasNext() ) {
                            adaptor.addChild(root_1, stream_typeTag.nextTree());

                        }
                        stream_typeTag.reset();

                        // Haxe.g:423:83: ( block )?
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
                    // Haxe.g:424:13: ( declAttrList )? FUNCTION IDENTIFIER typeParamOpt LPAREN ( paramList )? RPAREN ( typeTag )? block
                    {
                    // Haxe.g:424:13: ( declAttrList )?
                    int alt98=2;
                    int LA98_0 = input.LA(1);

                    if ( (LA98_0==DYNAMIC||LA98_0==INLINE||LA98_0==OVERRIDE||LA98_0==PRIVATE||LA98_0==PUBLIC||LA98_0==STATIC) ) {
                        alt98=1;
                    }
                    switch (alt98) {
                        case 1 :
                            // Haxe.g:424:13: declAttrList
                            {
                            pushFollow(FOLLOW_declAttrList_in_funcDecl5495);
                            declAttrList347=declAttrList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_declAttrList.add(declAttrList347.getTree());

                            }
                            break;

                    }


                    FUNCTION348=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcDecl5498); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION348);


                    IDENTIFIER349=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_funcDecl5500); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER349);


                    pushFollow(FOLLOW_typeParamOpt_in_funcDecl5502);
                    typeParamOpt350=typeParamOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeParamOpt.add(typeParamOpt350.getTree());

                    LPAREN351=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcDecl5504); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN351);


                    // Haxe.g:424:67: ( paramList )?
                    int alt99=2;
                    int LA99_0 = input.LA(1);

                    if ( (LA99_0==IDENTIFIER||LA99_0==QUES) ) {
                        alt99=1;
                    }
                    switch (alt99) {
                        case 1 :
                            // Haxe.g:424:67: paramList
                            {
                            pushFollow(FOLLOW_paramList_in_funcDecl5506);
                            paramList352=paramList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_paramList.add(paramList352.getTree());

                            }
                            break;

                    }


                    RPAREN353=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcDecl5509); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN353);


                    // Haxe.g:424:85: ( typeTag )?
                    int alt100=2;
                    int LA100_0 = input.LA(1);

                    if ( (LA100_0==COLON) ) {
                        alt100=1;
                    }
                    switch (alt100) {
                        case 1 :
                            // Haxe.g:424:85: typeTag
                            {
                            pushFollow(FOLLOW_typeTag_in_funcDecl5511);
                            typeTag354=typeTag();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_typeTag.add(typeTag354.getTree());

                            }
                            break;

                    }


                    pushFollow(FOLLOW_block_in_funcDecl5514);
                    block355=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block355.getTree());

                    // AST REWRITE
                    // elements: block, typeTag, declAttrList, FUNCTION, paramList, IDENTIFIER, typeParamOpt
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 425:17: -> ^( FUNCTION IDENTIFIER ( declAttrList )? ( paramList )? ( typeTag )? ( block )? ( typeParamOpt )? )
                    {
                        // Haxe.g:425:20: ^( FUNCTION IDENTIFIER ( declAttrList )? ( paramList )? ( typeTag )? ( block )? ( typeParamOpt )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        new FunctionNode(stream_FUNCTION.nextToken())
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_IDENTIFIER.nextNode()
                        );

                        // Haxe.g:425:56: ( declAttrList )?
                        if ( stream_declAttrList.hasNext() ) {
                            adaptor.addChild(root_1, stream_declAttrList.nextTree());

                        }
                        stream_declAttrList.reset();

                        // Haxe.g:425:70: ( paramList )?
                        if ( stream_paramList.hasNext() ) {
                            adaptor.addChild(root_1, stream_paramList.nextTree());

                        }
                        stream_paramList.reset();

                        // Haxe.g:425:81: ( typeTag )?
                        if ( stream_typeTag.hasNext() ) {
                            adaptor.addChild(root_1, stream_typeTag.nextTree());

                        }
                        stream_typeTag.reset();

                        // Haxe.g:425:90: ( block )?
                        if ( stream_block.hasNext() ) {
                            adaptor.addChild(root_1, stream_block.nextTree());

                        }
                        stream_block.reset();

                        // Haxe.g:425:97: ( typeParamOpt )?
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
            if ( state.backtracking>0 ) { memoize(input, 69, funcDecl_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "funcDecl"


    public static class funcProtoDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "funcProtoDecl"
    // Haxe.g:428:1: funcProtoDecl : ( declAttrList FUNCTION NEW LPAREN ( paramList )? RPAREN ( typeTag )? SEMI -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTag )? ( declAttrList )? ) | declAttrList FUNCTION IDENTIFIER typeParamOpt LPAREN ( paramList )? RPAREN ( typeTag )? SEMI -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTag )? ( declAttrList )? ( typeParamOpt )? ) | FUNCTION NEW LPAREN ( paramList )? RPAREN ( typeTag )? SEMI -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTag )? ) | FUNCTION IDENTIFIER typeParamOpt LPAREN ( paramList )? RPAREN ( typeTag )? SEMI -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTag )? ( typeParamOpt )? ) );
    public final HaxeParser.funcProtoDecl_return funcProtoDecl() throws RecognitionException {
        HaxeParser.funcProtoDecl_return retval = new HaxeParser.funcProtoDecl_return();
        retval.start = input.LT(1);

        int funcProtoDecl_StartIndex = input.index();

        Object root_0 = null;

        Token FUNCTION357=null;
        Token NEW358=null;
        Token LPAREN359=null;
        Token RPAREN361=null;
        Token SEMI363=null;
        Token FUNCTION365=null;
        Token IDENTIFIER366=null;
        Token LPAREN368=null;
        Token RPAREN370=null;
        Token SEMI372=null;
        Token FUNCTION373=null;
        Token NEW374=null;
        Token LPAREN375=null;
        Token RPAREN377=null;
        Token SEMI379=null;
        Token FUNCTION380=null;
        Token IDENTIFIER381=null;
        Token LPAREN383=null;
        Token RPAREN385=null;
        Token SEMI387=null;
        HaxeParser.declAttrList_return declAttrList356 =null;

        HaxeParser.paramList_return paramList360 =null;

        HaxeParser.typeTag_return typeTag362 =null;

        HaxeParser.declAttrList_return declAttrList364 =null;

        HaxeParser.typeParamOpt_return typeParamOpt367 =null;

        HaxeParser.paramList_return paramList369 =null;

        HaxeParser.typeTag_return typeTag371 =null;

        HaxeParser.paramList_return paramList376 =null;

        HaxeParser.typeTag_return typeTag378 =null;

        HaxeParser.typeParamOpt_return typeParamOpt382 =null;

        HaxeParser.paramList_return paramList384 =null;

        HaxeParser.typeTag_return typeTag386 =null;


        Object FUNCTION357_tree=null;
        Object NEW358_tree=null;
        Object LPAREN359_tree=null;
        Object RPAREN361_tree=null;
        Object SEMI363_tree=null;
        Object FUNCTION365_tree=null;
        Object IDENTIFIER366_tree=null;
        Object LPAREN368_tree=null;
        Object RPAREN370_tree=null;
        Object SEMI372_tree=null;
        Object FUNCTION373_tree=null;
        Object NEW374_tree=null;
        Object LPAREN375_tree=null;
        Object RPAREN377_tree=null;
        Object SEMI379_tree=null;
        Object FUNCTION380_tree=null;
        Object IDENTIFIER381_tree=null;
        Object LPAREN383_tree=null;
        Object RPAREN385_tree=null;
        Object SEMI387_tree=null;
        RewriteRuleTokenStream stream_FUNCTION=new RewriteRuleTokenStream(adaptor,"token FUNCTION");
        RewriteRuleTokenStream stream_NEW=new RewriteRuleTokenStream(adaptor,"token NEW");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_typeTag=new RewriteRuleSubtreeStream(adaptor,"rule typeTag");
        RewriteRuleSubtreeStream stream_declAttrList=new RewriteRuleSubtreeStream(adaptor,"rule declAttrList");
        RewriteRuleSubtreeStream stream_paramList=new RewriteRuleSubtreeStream(adaptor,"rule paramList");
        RewriteRuleSubtreeStream stream_typeParamOpt=new RewriteRuleSubtreeStream(adaptor,"rule typeParamOpt");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 70) ) { return retval; }

            // Haxe.g:429:5: ( declAttrList FUNCTION NEW LPAREN ( paramList )? RPAREN ( typeTag )? SEMI -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTag )? ( declAttrList )? ) | declAttrList FUNCTION IDENTIFIER typeParamOpt LPAREN ( paramList )? RPAREN ( typeTag )? SEMI -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTag )? ( declAttrList )? ( typeParamOpt )? ) | FUNCTION NEW LPAREN ( paramList )? RPAREN ( typeTag )? SEMI -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTag )? ) | FUNCTION IDENTIFIER typeParamOpt LPAREN ( paramList )? RPAREN ( typeTag )? SEMI -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTag )? ( typeParamOpt )? ) )
            int alt110=4;
            alt110 = dfa110.predict(input);
            switch (alt110) {
                case 1 :
                    // Haxe.g:429:9: declAttrList FUNCTION NEW LPAREN ( paramList )? RPAREN ( typeTag )? SEMI
                    {
                    pushFollow(FOLLOW_declAttrList_in_funcProtoDecl5584);
                    declAttrList356=declAttrList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declAttrList.add(declAttrList356.getTree());

                    FUNCTION357=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcProtoDecl5586); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION357);


                    NEW358=(Token)match(input,NEW,FOLLOW_NEW_in_funcProtoDecl5588); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEW.add(NEW358);


                    LPAREN359=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcProtoDecl5590); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN359);


                    // Haxe.g:429:42: ( paramList )?
                    int alt102=2;
                    int LA102_0 = input.LA(1);

                    if ( (LA102_0==IDENTIFIER||LA102_0==QUES) ) {
                        alt102=1;
                    }
                    switch (alt102) {
                        case 1 :
                            // Haxe.g:429:42: paramList
                            {
                            pushFollow(FOLLOW_paramList_in_funcProtoDecl5592);
                            paramList360=paramList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_paramList.add(paramList360.getTree());

                            }
                            break;

                    }


                    RPAREN361=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcProtoDecl5595); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN361);


                    // Haxe.g:429:60: ( typeTag )?
                    int alt103=2;
                    int LA103_0 = input.LA(1);

                    if ( (LA103_0==COLON) ) {
                        alt103=1;
                    }
                    switch (alt103) {
                        case 1 :
                            // Haxe.g:429:60: typeTag
                            {
                            pushFollow(FOLLOW_typeTag_in_funcProtoDecl5597);
                            typeTag362=typeTag();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_typeTag.add(typeTag362.getTree());

                            }
                            break;

                    }


                    SEMI363=(Token)match(input,SEMI,FOLLOW_SEMI_in_funcProtoDecl5600); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI363);


                    // AST REWRITE
                    // elements: paramList, typeTag, FUNCTION, NEW, declAttrList
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 430:13: -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTag )? ( declAttrList )? )
                    {
                        // Haxe.g:430:16: ^( FUNCTION ( NEW )? ( paramList )? ( typeTag )? ( declAttrList )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_FUNCTION.nextNode()
                        , root_1);

                        // Haxe.g:430:27: ( NEW )?
                        if ( stream_NEW.hasNext() ) {
                            adaptor.addChild(root_1, 
                            stream_NEW.nextNode()
                            );

                        }
                        stream_NEW.reset();

                        // Haxe.g:430:32: ( paramList )?
                        if ( stream_paramList.hasNext() ) {
                            adaptor.addChild(root_1, stream_paramList.nextTree());

                        }
                        stream_paramList.reset();

                        // Haxe.g:430:43: ( typeTag )?
                        if ( stream_typeTag.hasNext() ) {
                            adaptor.addChild(root_1, stream_typeTag.nextTree());

                        }
                        stream_typeTag.reset();

                        // Haxe.g:430:52: ( declAttrList )?
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
                    // Haxe.g:431:9: declAttrList FUNCTION IDENTIFIER typeParamOpt LPAREN ( paramList )? RPAREN ( typeTag )? SEMI
                    {
                    pushFollow(FOLLOW_declAttrList_in_funcProtoDecl5641);
                    declAttrList364=declAttrList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declAttrList.add(declAttrList364.getTree());

                    FUNCTION365=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcProtoDecl5643); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION365);


                    IDENTIFIER366=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_funcProtoDecl5645); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER366);


                    pushFollow(FOLLOW_typeParamOpt_in_funcProtoDecl5647);
                    typeParamOpt367=typeParamOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeParamOpt.add(typeParamOpt367.getTree());

                    LPAREN368=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcProtoDecl5649); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN368);


                    // Haxe.g:431:62: ( paramList )?
                    int alt104=2;
                    int LA104_0 = input.LA(1);

                    if ( (LA104_0==IDENTIFIER||LA104_0==QUES) ) {
                        alt104=1;
                    }
                    switch (alt104) {
                        case 1 :
                            // Haxe.g:431:62: paramList
                            {
                            pushFollow(FOLLOW_paramList_in_funcProtoDecl5651);
                            paramList369=paramList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_paramList.add(paramList369.getTree());

                            }
                            break;

                    }


                    RPAREN370=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcProtoDecl5654); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN370);


                    // Haxe.g:431:80: ( typeTag )?
                    int alt105=2;
                    int LA105_0 = input.LA(1);

                    if ( (LA105_0==COLON) ) {
                        alt105=1;
                    }
                    switch (alt105) {
                        case 1 :
                            // Haxe.g:431:80: typeTag
                            {
                            pushFollow(FOLLOW_typeTag_in_funcProtoDecl5656);
                            typeTag371=typeTag();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_typeTag.add(typeTag371.getTree());

                            }
                            break;

                    }


                    SEMI372=(Token)match(input,SEMI,FOLLOW_SEMI_in_funcProtoDecl5659); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI372);


                    // AST REWRITE
                    // elements: typeParamOpt, FUNCTION, typeTag, IDENTIFIER, paramList, declAttrList
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 432:13: -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTag )? ( declAttrList )? ( typeParamOpt )? )
                    {
                        // Haxe.g:432:16: ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTag )? ( declAttrList )? ( typeParamOpt )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_FUNCTION.nextNode()
                        , root_1);

                        // Haxe.g:432:27: ( IDENTIFIER )?
                        if ( stream_IDENTIFIER.hasNext() ) {
                            adaptor.addChild(root_1, 
                            stream_IDENTIFIER.nextNode()
                            );

                        }
                        stream_IDENTIFIER.reset();

                        // Haxe.g:432:39: ( paramList )?
                        if ( stream_paramList.hasNext() ) {
                            adaptor.addChild(root_1, stream_paramList.nextTree());

                        }
                        stream_paramList.reset();

                        // Haxe.g:432:50: ( typeTag )?
                        if ( stream_typeTag.hasNext() ) {
                            adaptor.addChild(root_1, stream_typeTag.nextTree());

                        }
                        stream_typeTag.reset();

                        // Haxe.g:432:59: ( declAttrList )?
                        if ( stream_declAttrList.hasNext() ) {
                            adaptor.addChild(root_1, stream_declAttrList.nextTree());

                        }
                        stream_declAttrList.reset();

                        // Haxe.g:432:73: ( typeParamOpt )?
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
                    // Haxe.g:433:9: FUNCTION NEW LPAREN ( paramList )? RPAREN ( typeTag )? SEMI
                    {
                    FUNCTION373=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcProtoDecl5703); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION373);


                    NEW374=(Token)match(input,NEW,FOLLOW_NEW_in_funcProtoDecl5705); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEW.add(NEW374);


                    LPAREN375=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcProtoDecl5707); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN375);


                    // Haxe.g:433:29: ( paramList )?
                    int alt106=2;
                    int LA106_0 = input.LA(1);

                    if ( (LA106_0==IDENTIFIER||LA106_0==QUES) ) {
                        alt106=1;
                    }
                    switch (alt106) {
                        case 1 :
                            // Haxe.g:433:29: paramList
                            {
                            pushFollow(FOLLOW_paramList_in_funcProtoDecl5709);
                            paramList376=paramList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_paramList.add(paramList376.getTree());

                            }
                            break;

                    }


                    RPAREN377=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcProtoDecl5712); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN377);


                    // Haxe.g:433:47: ( typeTag )?
                    int alt107=2;
                    int LA107_0 = input.LA(1);

                    if ( (LA107_0==COLON) ) {
                        alt107=1;
                    }
                    switch (alt107) {
                        case 1 :
                            // Haxe.g:433:47: typeTag
                            {
                            pushFollow(FOLLOW_typeTag_in_funcProtoDecl5714);
                            typeTag378=typeTag();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_typeTag.add(typeTag378.getTree());

                            }
                            break;

                    }


                    SEMI379=(Token)match(input,SEMI,FOLLOW_SEMI_in_funcProtoDecl5717); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI379);


                    // AST REWRITE
                    // elements: FUNCTION, typeTag, paramList, NEW
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 434:13: -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTag )? )
                    {
                        // Haxe.g:434:16: ^( FUNCTION ( NEW )? ( paramList )? ( typeTag )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_FUNCTION.nextNode()
                        , root_1);

                        // Haxe.g:434:27: ( NEW )?
                        if ( stream_NEW.hasNext() ) {
                            adaptor.addChild(root_1, 
                            stream_NEW.nextNode()
                            );

                        }
                        stream_NEW.reset();

                        // Haxe.g:434:32: ( paramList )?
                        if ( stream_paramList.hasNext() ) {
                            adaptor.addChild(root_1, stream_paramList.nextTree());

                        }
                        stream_paramList.reset();

                        // Haxe.g:434:43: ( typeTag )?
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
                case 4 :
                    // Haxe.g:435:9: FUNCTION IDENTIFIER typeParamOpt LPAREN ( paramList )? RPAREN ( typeTag )? SEMI
                    {
                    FUNCTION380=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcProtoDecl5755); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION380);


                    IDENTIFIER381=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_funcProtoDecl5757); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER381);


                    pushFollow(FOLLOW_typeParamOpt_in_funcProtoDecl5759);
                    typeParamOpt382=typeParamOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeParamOpt.add(typeParamOpt382.getTree());

                    LPAREN383=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcProtoDecl5761); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN383);


                    // Haxe.g:435:49: ( paramList )?
                    int alt108=2;
                    int LA108_0 = input.LA(1);

                    if ( (LA108_0==IDENTIFIER||LA108_0==QUES) ) {
                        alt108=1;
                    }
                    switch (alt108) {
                        case 1 :
                            // Haxe.g:435:49: paramList
                            {
                            pushFollow(FOLLOW_paramList_in_funcProtoDecl5763);
                            paramList384=paramList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_paramList.add(paramList384.getTree());

                            }
                            break;

                    }


                    RPAREN385=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcProtoDecl5766); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN385);


                    // Haxe.g:435:67: ( typeTag )?
                    int alt109=2;
                    int LA109_0 = input.LA(1);

                    if ( (LA109_0==COLON) ) {
                        alt109=1;
                    }
                    switch (alt109) {
                        case 1 :
                            // Haxe.g:435:67: typeTag
                            {
                            pushFollow(FOLLOW_typeTag_in_funcProtoDecl5768);
                            typeTag386=typeTag();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_typeTag.add(typeTag386.getTree());

                            }
                            break;

                    }


                    SEMI387=(Token)match(input,SEMI,FOLLOW_SEMI_in_funcProtoDecl5771); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI387);


                    // AST REWRITE
                    // elements: FUNCTION, paramList, IDENTIFIER, typeTag, typeParamOpt
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 436:13: -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTag )? ( typeParamOpt )? )
                    {
                        // Haxe.g:436:16: ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTag )? ( typeParamOpt )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_FUNCTION.nextNode()
                        , root_1);

                        // Haxe.g:436:27: ( IDENTIFIER )?
                        if ( stream_IDENTIFIER.hasNext() ) {
                            adaptor.addChild(root_1, 
                            stream_IDENTIFIER.nextNode()
                            );

                        }
                        stream_IDENTIFIER.reset();

                        // Haxe.g:436:39: ( paramList )?
                        if ( stream_paramList.hasNext() ) {
                            adaptor.addChild(root_1, stream_paramList.nextTree());

                        }
                        stream_paramList.reset();

                        // Haxe.g:436:50: ( typeTag )?
                        if ( stream_typeTag.hasNext() ) {
                            adaptor.addChild(root_1, stream_typeTag.nextTree());

                        }
                        stream_typeTag.reset();

                        // Haxe.g:436:59: ( typeParamOpt )?
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
            if ( state.backtracking>0 ) { memoize(input, 70, funcProtoDecl_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "funcProtoDecl"


    public static class interfaceDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "interfaceDecl"
    // Haxe.g:439:1: interfaceDecl : ( topLevelAccess )? INTERFACE type inheritListOpt LBRACE ! interfaceBody RBRACE !;
    public final HaxeParser.interfaceDecl_return interfaceDecl() throws RecognitionException {
        HaxeParser.interfaceDecl_return retval = new HaxeParser.interfaceDecl_return();
        retval.start = input.LT(1);

        int interfaceDecl_StartIndex = input.index();

        Object root_0 = null;

        Token INTERFACE389=null;
        Token LBRACE392=null;
        Token RBRACE394=null;
        HaxeParser.topLevelAccess_return topLevelAccess388 =null;

        HaxeParser.type_return type390 =null;

        HaxeParser.inheritListOpt_return inheritListOpt391 =null;

        HaxeParser.interfaceBody_return interfaceBody393 =null;


        Object INTERFACE389_tree=null;
        Object LBRACE392_tree=null;
        Object RBRACE394_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 71) ) { return retval; }

            // Haxe.g:440:5: ( ( topLevelAccess )? INTERFACE type inheritListOpt LBRACE ! interfaceBody RBRACE !)
            // Haxe.g:440:9: ( topLevelAccess )? INTERFACE type inheritListOpt LBRACE ! interfaceBody RBRACE !
            {
            root_0 = (Object)adaptor.nil();


            // Haxe.g:440:9: ( topLevelAccess )?
            int alt111=2;
            int LA111_0 = input.LA(1);

            if ( (LA111_0==EXTERN||LA111_0==PRIVATE) ) {
                alt111=1;
            }
            switch (alt111) {
                case 1 :
                    // Haxe.g:440:9: topLevelAccess
                    {
                    pushFollow(FOLLOW_topLevelAccess_in_interfaceDecl5830);
                    topLevelAccess388=topLevelAccess();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, topLevelAccess388.getTree());

                    }
                    break;

            }


            INTERFACE389=(Token)match(input,INTERFACE,FOLLOW_INTERFACE_in_interfaceDecl5833); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            INTERFACE389_tree = 
            (Object)adaptor.create(INTERFACE389)
            ;
            adaptor.addChild(root_0, INTERFACE389_tree);
            }

            pushFollow(FOLLOW_type_in_interfaceDecl5835);
            type390=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type390.getTree());

            pushFollow(FOLLOW_inheritListOpt_in_interfaceDecl5837);
            inheritListOpt391=inheritListOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, inheritListOpt391.getTree());

            LBRACE392=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_interfaceDecl5839); if (state.failed) return retval;

            pushFollow(FOLLOW_interfaceBody_in_interfaceDecl5842);
            interfaceBody393=interfaceBody();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceBody393.getTree());

            RBRACE394=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_interfaceDecl5844); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
            if ( state.backtracking>0 ) { memoize(input, 71, interfaceDecl_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "interfaceDecl"


    public static class interfaceBody_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "interfaceBody"
    // Haxe.g:443:1: interfaceBody : ( varDecl interfaceBody | funcProtoDecl interfaceBody |);
    public final HaxeParser.interfaceBody_return interfaceBody() throws RecognitionException {
        HaxeParser.interfaceBody_return retval = new HaxeParser.interfaceBody_return();
        retval.start = input.LT(1);

        int interfaceBody_StartIndex = input.index();

        Object root_0 = null;

        HaxeParser.varDecl_return varDecl395 =null;

        HaxeParser.interfaceBody_return interfaceBody396 =null;

        HaxeParser.funcProtoDecl_return funcProtoDecl397 =null;

        HaxeParser.interfaceBody_return interfaceBody398 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 72) ) { return retval; }

            // Haxe.g:444:5: ( varDecl interfaceBody | funcProtoDecl interfaceBody |)
            int alt112=3;
            switch ( input.LA(1) ) {
            case VAR:
                {
                alt112=1;
                }
                break;
            case DYNAMIC:
            case FUNCTION:
            case INLINE:
            case OVERRIDE:
            case PRIVATE:
            case PUBLIC:
            case STATIC:
                {
                alt112=2;
                }
                break;
            case EOF:
            case RBRACE:
                {
                alt112=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 112, 0, input);

                throw nvae;

            }

            switch (alt112) {
                case 1 :
                    // Haxe.g:444:9: varDecl interfaceBody
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_varDecl_in_interfaceBody5868);
                    varDecl395=varDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDecl395.getTree());

                    pushFollow(FOLLOW_interfaceBody_in_interfaceBody5870);
                    interfaceBody396=interfaceBody();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceBody396.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:445:9: funcProtoDecl interfaceBody
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_funcProtoDecl_in_interfaceBody5880);
                    funcProtoDecl397=funcProtoDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, funcProtoDecl397.getTree());

                    pushFollow(FOLLOW_interfaceBody_in_interfaceBody5882);
                    interfaceBody398=interfaceBody();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceBody398.getTree());

                    }
                    break;
                case 3 :
                    // Haxe.g:448:5: 
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
            if ( state.backtracking>0 ) { memoize(input, 72, interfaceBody_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "interfaceBody"


    public static class inheritList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "inheritList"
    // Haxe.g:450:1: inheritList : inherit ( COMMA ! inherit )* ;
    public final HaxeParser.inheritList_return inheritList() throws RecognitionException {
        HaxeParser.inheritList_return retval = new HaxeParser.inheritList_return();
        retval.start = input.LT(1);

        int inheritList_StartIndex = input.index();

        Object root_0 = null;

        Token COMMA400=null;
        HaxeParser.inherit_return inherit399 =null;

        HaxeParser.inherit_return inherit401 =null;


        Object COMMA400_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 73) ) { return retval; }

            // Haxe.g:451:5: ( inherit ( COMMA ! inherit )* )
            // Haxe.g:451:10: inherit ( COMMA ! inherit )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_inherit_in_inheritList5916);
            inherit399=inherit();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, inherit399.getTree());

            // Haxe.g:451:18: ( COMMA ! inherit )*
            loop113:
            do {
                int alt113=2;
                int LA113_0 = input.LA(1);

                if ( (LA113_0==COMMA) ) {
                    alt113=1;
                }


                switch (alt113) {
            	case 1 :
            	    // Haxe.g:451:19: COMMA ! inherit
            	    {
            	    COMMA400=(Token)match(input,COMMA,FOLLOW_COMMA_in_inheritList5919); if (state.failed) return retval;

            	    pushFollow(FOLLOW_inherit_in_inheritList5922);
            	    inherit401=inherit();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, inherit401.getTree());

            	    }
            	    break;

            	default :
            	    break loop113;
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
            if ( state.backtracking>0 ) { memoize(input, 73, inheritList_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "inheritList"


    public static class inheritListOpt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "inheritListOpt"
    // Haxe.g:454:1: inheritListOpt : ( inheritList -> ^( INHERIT_LIST_OPT[\"INHERIT_LIST_OPT\"] ( inheritList )? ) |);
    public final HaxeParser.inheritListOpt_return inheritListOpt() throws RecognitionException {
        HaxeParser.inheritListOpt_return retval = new HaxeParser.inheritListOpt_return();
        retval.start = input.LT(1);

        int inheritListOpt_StartIndex = input.index();

        Object root_0 = null;

        HaxeParser.inheritList_return inheritList402 =null;


        RewriteRuleSubtreeStream stream_inheritList=new RewriteRuleSubtreeStream(adaptor,"rule inheritList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 74) ) { return retval; }

            // Haxe.g:455:5: ( inheritList -> ^( INHERIT_LIST_OPT[\"INHERIT_LIST_OPT\"] ( inheritList )? ) |)
            int alt114=2;
            int LA114_0 = input.LA(1);

            if ( (LA114_0==EXTENDS||LA114_0==IMPLEMENTS) ) {
                alt114=1;
            }
            else if ( (LA114_0==LBRACE) ) {
                alt114=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 114, 0, input);

                throw nvae;

            }
            switch (alt114) {
                case 1 :
                    // Haxe.g:455:10: inheritList
                    {
                    pushFollow(FOLLOW_inheritList_in_inheritListOpt5952);
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
                    // 455:22: -> ^( INHERIT_LIST_OPT[\"INHERIT_LIST_OPT\"] ( inheritList )? )
                    {
                        // Haxe.g:455:25: ^( INHERIT_LIST_OPT[\"INHERIT_LIST_OPT\"] ( inheritList )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        new HaxeTree(INHERIT_LIST_OPT, "INHERIT_LIST_OPT")
                        , root_1);

                        // Haxe.g:455:74: ( inheritList )?
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
                    // Haxe.g:457:5: 
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
            if ( state.backtracking>0 ) { memoize(input, 74, inheritListOpt_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "inheritListOpt"


    public static class inherit_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "inherit"
    // Haxe.g:459:1: inherit : ( EXTENDS type -> ^( EXTENDS ( type )? ) | IMPLEMENTS type -> ^( IMPLEMENTS ( type )? ) );
    public final HaxeParser.inherit_return inherit() throws RecognitionException {
        HaxeParser.inherit_return retval = new HaxeParser.inherit_return();
        retval.start = input.LT(1);

        int inherit_StartIndex = input.index();

        Object root_0 = null;

        Token EXTENDS403=null;
        Token IMPLEMENTS405=null;
        HaxeParser.type_return type404 =null;

        HaxeParser.type_return type406 =null;


        Object EXTENDS403_tree=null;
        Object IMPLEMENTS405_tree=null;
        RewriteRuleTokenStream stream_IMPLEMENTS=new RewriteRuleTokenStream(adaptor,"token IMPLEMENTS");
        RewriteRuleTokenStream stream_EXTENDS=new RewriteRuleTokenStream(adaptor,"token EXTENDS");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 75) ) { return retval; }

            // Haxe.g:459:12: ( EXTENDS type -> ^( EXTENDS ( type )? ) | IMPLEMENTS type -> ^( IMPLEMENTS ( type )? ) )
            int alt115=2;
            int LA115_0 = input.LA(1);

            if ( (LA115_0==EXTENDS) ) {
                alt115=1;
            }
            else if ( (LA115_0==IMPLEMENTS) ) {
                alt115=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 115, 0, input);

                throw nvae;

            }
            switch (alt115) {
                case 1 :
                    // Haxe.g:459:17: EXTENDS type
                    {
                    EXTENDS403=(Token)match(input,EXTENDS,FOLLOW_EXTENDS_in_inherit5998); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EXTENDS.add(EXTENDS403);


                    pushFollow(FOLLOW_type_in_inherit6000);
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
                    // 459:34: -> ^( EXTENDS ( type )? )
                    {
                        // Haxe.g:459:37: ^( EXTENDS ( type )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_EXTENDS.nextNode()
                        , root_1);

                        // Haxe.g:459:47: ( type )?
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
                    // Haxe.g:460:14: IMPLEMENTS type
                    {
                    IMPLEMENTS405=(Token)match(input,IMPLEMENTS,FOLLOW_IMPLEMENTS_in_inherit6028); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IMPLEMENTS.add(IMPLEMENTS405);


                    pushFollow(FOLLOW_type_in_inherit6030);
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
                    // 460:30: -> ^( IMPLEMENTS ( type )? )
                    {
                        // Haxe.g:460:33: ^( IMPLEMENTS ( type )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_IMPLEMENTS.nextNode()
                        , root_1);

                        // Haxe.g:460:46: ( type )?
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
            if ( state.backtracking>0 ) { memoize(input, 75, inherit_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "inherit"


    public static class typedefDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "typedefDecl"
    // Haxe.g:463:1: typedefDecl : TYPEDEF IDENTIFIER EQ funcType ;
    public final HaxeParser.typedefDecl_return typedefDecl() throws RecognitionException {
        HaxeParser.typedefDecl_return retval = new HaxeParser.typedefDecl_return();
        retval.start = input.LT(1);

        int typedefDecl_StartIndex = input.index();

        Object root_0 = null;

        Token TYPEDEF407=null;
        Token IDENTIFIER408=null;
        Token EQ409=null;
        HaxeParser.funcType_return funcType410 =null;


        Object TYPEDEF407_tree=null;
        Object IDENTIFIER408_tree=null;
        Object EQ409_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 76) ) { return retval; }

            // Haxe.g:464:5: ( TYPEDEF IDENTIFIER EQ funcType )
            // Haxe.g:464:10: TYPEDEF IDENTIFIER EQ funcType
            {
            root_0 = (Object)adaptor.nil();


            TYPEDEF407=(Token)match(input,TYPEDEF,FOLLOW_TYPEDEF_in_typedefDecl6070); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TYPEDEF407_tree = 
            (Object)adaptor.create(TYPEDEF407)
            ;
            adaptor.addChild(root_0, TYPEDEF407_tree);
            }

            IDENTIFIER408=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_typedefDecl6072); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER408_tree = 
            (Object)adaptor.create(IDENTIFIER408)
            ;
            adaptor.addChild(root_0, IDENTIFIER408_tree);
            }

            EQ409=(Token)match(input,EQ,FOLLOW_EQ_in_typedefDecl6074); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            EQ409_tree = 
            (Object)adaptor.create(EQ409)
            ;
            adaptor.addChild(root_0, EQ409_tree);
            }

            pushFollow(FOLLOW_funcType_in_typedefDecl6076);
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
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 76, typedefDecl_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "typedefDecl"


    public static class typeExtend_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "typeExtend"
    // Haxe.g:467:1: typeExtend : GT funcType COMMA !;
    public final HaxeParser.typeExtend_return typeExtend() throws RecognitionException {
        HaxeParser.typeExtend_return retval = new HaxeParser.typeExtend_return();
        retval.start = input.LT(1);

        int typeExtend_StartIndex = input.index();

        Object root_0 = null;

        Token GT411=null;
        Token COMMA413=null;
        HaxeParser.funcType_return funcType412 =null;


        Object GT411_tree=null;
        Object COMMA413_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 77) ) { return retval; }

            // Haxe.g:468:5: ( GT funcType COMMA !)
            // Haxe.g:468:10: GT funcType COMMA !
            {
            root_0 = (Object)adaptor.nil();


            GT411=(Token)match(input,GT,FOLLOW_GT_in_typeExtend6100); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            GT411_tree = 
            (Object)adaptor.create(GT411)
            ;
            adaptor.addChild(root_0, GT411_tree);
            }

            pushFollow(FOLLOW_funcType_in_typeExtend6102);
            funcType412=funcType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, funcType412.getTree());

            COMMA413=(Token)match(input,COMMA,FOLLOW_COMMA_in_typeExtend6104); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
            if ( state.backtracking>0 ) { memoize(input, 77, typeExtend_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "typeExtend"


    public static class anonType_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "anonType"
    // Haxe.g:471:1: anonType : LBRACE ! (| anonTypeFieldList | varDeclList | typeExtend (| anonTypeFieldList | varDeclList ) ) RBRACE !;
    public final HaxeParser.anonType_return anonType() throws RecognitionException {
        HaxeParser.anonType_return retval = new HaxeParser.anonType_return();
        retval.start = input.LT(1);

        int anonType_StartIndex = input.index();

        Object root_0 = null;

        Token LBRACE414=null;
        Token RBRACE420=null;
        HaxeParser.anonTypeFieldList_return anonTypeFieldList415 =null;

        HaxeParser.varDeclList_return varDeclList416 =null;

        HaxeParser.typeExtend_return typeExtend417 =null;

        HaxeParser.anonTypeFieldList_return anonTypeFieldList418 =null;

        HaxeParser.varDeclList_return varDeclList419 =null;


        Object LBRACE414_tree=null;
        Object RBRACE420_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 78) ) { return retval; }

            // Haxe.g:472:5: ( LBRACE ! (| anonTypeFieldList | varDeclList | typeExtend (| anonTypeFieldList | varDeclList ) ) RBRACE !)
            // Haxe.g:472:9: LBRACE ! (| anonTypeFieldList | varDeclList | typeExtend (| anonTypeFieldList | varDeclList ) ) RBRACE !
            {
            root_0 = (Object)adaptor.nil();


            LBRACE414=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_anonType6128); if (state.failed) return retval;

            // Haxe.g:473:13: (| anonTypeFieldList | varDeclList | typeExtend (| anonTypeFieldList | varDeclList ) )
            int alt117=4;
            switch ( input.LA(1) ) {
            case RBRACE:
                {
                alt117=1;
                }
                break;
            case IDENTIFIER:
                {
                alt117=2;
                }
                break;
            case VAR:
                {
                alt117=3;
                }
                break;
            case GT:
                {
                alt117=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 117, 0, input);

                throw nvae;

            }

            switch (alt117) {
                case 1 :
                    // Haxe.g:474:13: 
                    {
                    }
                    break;
                case 2 :
                    // Haxe.g:474:17: anonTypeFieldList
                    {
                    pushFollow(FOLLOW_anonTypeFieldList_in_anonType6162);
                    anonTypeFieldList415=anonTypeFieldList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, anonTypeFieldList415.getTree());

                    }
                    break;
                case 3 :
                    // Haxe.g:475:17: varDeclList
                    {
                    pushFollow(FOLLOW_varDeclList_in_anonType6181);
                    varDeclList416=varDeclList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclList416.getTree());

                    }
                    break;
                case 4 :
                    // Haxe.g:476:17: typeExtend (| anonTypeFieldList | varDeclList )
                    {
                    pushFollow(FOLLOW_typeExtend_in_anonType6200);
                    typeExtend417=typeExtend();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeExtend417.getTree());

                    // Haxe.g:476:28: (| anonTypeFieldList | varDeclList )
                    int alt116=3;
                    switch ( input.LA(1) ) {
                    case RBRACE:
                        {
                        alt116=1;
                        }
                        break;
                    case IDENTIFIER:
                        {
                        alt116=2;
                        }
                        break;
                    case VAR:
                        {
                        alt116=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 116, 0, input);

                        throw nvae;

                    }

                    switch (alt116) {
                        case 1 :
                            // Haxe.g:477:25: 
                            {
                            }
                            break;
                        case 2 :
                            // Haxe.g:477:29: anonTypeFieldList
                            {
                            pushFollow(FOLLOW_anonTypeFieldList_in_anonType6232);
                            anonTypeFieldList418=anonTypeFieldList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, anonTypeFieldList418.getTree());

                            }
                            break;
                        case 3 :
                            // Haxe.g:478:29: varDeclList
                            {
                            pushFollow(FOLLOW_varDeclList_in_anonType6262);
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


            RBRACE420=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_anonType6289); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
            if ( state.backtracking>0 ) { memoize(input, 78, anonType_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "anonType"


    public static class anonTypeFieldList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "anonTypeFieldList"
    // Haxe.g:483:1: anonTypeFieldList : anonTypeField ( COMMA ! anonTypeField )* ;
    public final HaxeParser.anonTypeFieldList_return anonTypeFieldList() throws RecognitionException {
        HaxeParser.anonTypeFieldList_return retval = new HaxeParser.anonTypeFieldList_return();
        retval.start = input.LT(1);

        int anonTypeFieldList_StartIndex = input.index();

        Object root_0 = null;

        Token COMMA422=null;
        HaxeParser.anonTypeField_return anonTypeField421 =null;

        HaxeParser.anonTypeField_return anonTypeField423 =null;


        Object COMMA422_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 79) ) { return retval; }

            // Haxe.g:484:5: ( anonTypeField ( COMMA ! anonTypeField )* )
            // Haxe.g:484:10: anonTypeField ( COMMA ! anonTypeField )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_anonTypeField_in_anonTypeFieldList6315);
            anonTypeField421=anonTypeField();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, anonTypeField421.getTree());

            // Haxe.g:484:24: ( COMMA ! anonTypeField )*
            loop118:
            do {
                int alt118=2;
                int LA118_0 = input.LA(1);

                if ( (LA118_0==COMMA) ) {
                    alt118=1;
                }


                switch (alt118) {
            	case 1 :
            	    // Haxe.g:484:25: COMMA ! anonTypeField
            	    {
            	    COMMA422=(Token)match(input,COMMA,FOLLOW_COMMA_in_anonTypeFieldList6318); if (state.failed) return retval;

            	    pushFollow(FOLLOW_anonTypeField_in_anonTypeFieldList6321);
            	    anonTypeField423=anonTypeField();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, anonTypeField423.getTree());

            	    }
            	    break;

            	default :
            	    break loop118;
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
            if ( state.backtracking>0 ) { memoize(input, 79, anonTypeFieldList_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "anonTypeFieldList"


    public static class objLit_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "objLit"
    // Haxe.g:487:1: objLit : '{' ! objLitElemList '}' !;
    public final HaxeParser.objLit_return objLit() throws RecognitionException {
        HaxeParser.objLit_return retval = new HaxeParser.objLit_return();
        retval.start = input.LT(1);

        int objLit_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal424=null;
        Token char_literal426=null;
        HaxeParser.objLitElemList_return objLitElemList425 =null;


        Object char_literal424_tree=null;
        Object char_literal426_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 80) ) { return retval; }

            // Haxe.g:487:9: ( '{' ! objLitElemList '}' !)
            // Haxe.g:487:11: '{' ! objLitElemList '}' !
            {
            root_0 = (Object)adaptor.nil();


            char_literal424=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_objLit6337); if (state.failed) return retval;

            pushFollow(FOLLOW_objLitElemList_in_objLit6340);
            objLitElemList425=objLitElemList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, objLitElemList425.getTree());

            char_literal426=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_objLit6342); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
            if ( state.backtracking>0 ) { memoize(input, 80, objLit_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "objLit"


    public static class anonTypeField_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "anonTypeField"
    // Haxe.g:490:1: anonTypeField : IDENTIFIER COLON ! funcType ;
    public final HaxeParser.anonTypeField_return anonTypeField() throws RecognitionException {
        HaxeParser.anonTypeField_return retval = new HaxeParser.anonTypeField_return();
        retval.start = input.LT(1);

        int anonTypeField_StartIndex = input.index();

        Object root_0 = null;

        Token IDENTIFIER427=null;
        Token COLON428=null;
        HaxeParser.funcType_return funcType429 =null;


        Object IDENTIFIER427_tree=null;
        Object COLON428_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 81) ) { return retval; }

            // Haxe.g:491:5: ( IDENTIFIER COLON ! funcType )
            // Haxe.g:491:10: IDENTIFIER COLON ! funcType
            {
            root_0 = (Object)adaptor.nil();


            IDENTIFIER427=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_anonTypeField6367); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER427_tree = 
            (Object)adaptor.create(IDENTIFIER427)
            ;
            adaptor.addChild(root_0, IDENTIFIER427_tree);
            }

            COLON428=(Token)match(input,COLON,FOLLOW_COLON_in_anonTypeField6369); if (state.failed) return retval;

            pushFollow(FOLLOW_funcType_in_anonTypeField6372);
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
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 81, anonTypeField_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "anonTypeField"


    public static class objLitElemList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "objLitElemList"
    // Haxe.g:494:1: objLitElemList : objLitElem ( COMMA ! objLitElem )* ;
    public final HaxeParser.objLitElemList_return objLitElemList() throws RecognitionException {
        HaxeParser.objLitElemList_return retval = new HaxeParser.objLitElemList_return();
        retval.start = input.LT(1);

        int objLitElemList_StartIndex = input.index();

        Object root_0 = null;

        Token COMMA431=null;
        HaxeParser.objLitElem_return objLitElem430 =null;

        HaxeParser.objLitElem_return objLitElem432 =null;


        Object COMMA431_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 82) ) { return retval; }

            // Haxe.g:495:5: ( objLitElem ( COMMA ! objLitElem )* )
            // Haxe.g:495:10: objLitElem ( COMMA ! objLitElem )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_objLitElem_in_objLitElemList6400);
            objLitElem430=objLitElem();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, objLitElem430.getTree());

            // Haxe.g:495:21: ( COMMA ! objLitElem )*
            loop119:
            do {
                int alt119=2;
                int LA119_0 = input.LA(1);

                if ( (LA119_0==COMMA) ) {
                    alt119=1;
                }


                switch (alt119) {
            	case 1 :
            	    // Haxe.g:495:22: COMMA ! objLitElem
            	    {
            	    COMMA431=(Token)match(input,COMMA,FOLLOW_COMMA_in_objLitElemList6403); if (state.failed) return retval;

            	    pushFollow(FOLLOW_objLitElem_in_objLitElemList6406);
            	    objLitElem432=objLitElem();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, objLitElem432.getTree());

            	    }
            	    break;

            	default :
            	    break loop119;
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
            if ( state.backtracking>0 ) { memoize(input, 82, objLitElemList_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "objLitElemList"


    public static class objLitElem_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "objLitElem"
    // Haxe.g:498:1: objLitElem : IDENTIFIER COLON ! expr ;
    public final HaxeParser.objLitElem_return objLitElem() throws RecognitionException {
        HaxeParser.objLitElem_return retval = new HaxeParser.objLitElem_return();
        retval.start = input.LT(1);

        int objLitElem_StartIndex = input.index();

        Object root_0 = null;

        Token IDENTIFIER433=null;
        Token COLON434=null;
        HaxeParser.expr_return expr435 =null;


        Object IDENTIFIER433_tree=null;
        Object COLON434_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 83) ) { return retval; }

            // Haxe.g:499:5: ( IDENTIFIER COLON ! expr )
            // Haxe.g:499:10: IDENTIFIER COLON ! expr
            {
            root_0 = (Object)adaptor.nil();


            IDENTIFIER433=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_objLitElem6432); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER433_tree = 
            (Object)adaptor.create(IDENTIFIER433)
            ;
            adaptor.addChild(root_0, IDENTIFIER433_tree);
            }

            COLON434=(Token)match(input,COLON,FOLLOW_COLON_in_objLitElem6434); if (state.failed) return retval;

            pushFollow(FOLLOW_expr_in_objLitElem6437);
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
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 83, objLitElem_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "objLitElem"


    public static class elementarySymbol_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "elementarySymbol"
    // Haxe.g:502:1: elementarySymbol : ( LONGLITERAL -> LONGLITERAL[$LONGLITERAL, \"INT\"] | NULL -> ^( NULL[$NULL,\"Unknown<0>\"] ) | INTLITERAL -> INTLITERAL[$INTLITERAL, \"INT\"] | STRINGLITERAL -> STRINGLITERAL[$STRINGLITERAL,\"STRING\"] | CHARLITERAL -> CHARLITERAL[$CHARLITERAL, \"STRING\"] | FLOATNUM -> FLOATNUM[$FLOATNUM, \"FLOAT\"] | TRUE -> TRUE[$TRUE,\"BOOL\"] | FALSE -> FALSE[$FALSE,\"BOOL\"] );
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 84) ) { return retval; }

            // Haxe.g:503:5: ( LONGLITERAL -> LONGLITERAL[$LONGLITERAL, \"INT\"] | NULL -> ^( NULL[$NULL,\"Unknown<0>\"] ) | INTLITERAL -> INTLITERAL[$INTLITERAL, \"INT\"] | STRINGLITERAL -> STRINGLITERAL[$STRINGLITERAL,\"STRING\"] | CHARLITERAL -> CHARLITERAL[$CHARLITERAL, \"STRING\"] | FLOATNUM -> FLOATNUM[$FLOATNUM, \"FLOAT\"] | TRUE -> TRUE[$TRUE,\"BOOL\"] | FALSE -> FALSE[$FALSE,\"BOOL\"] )
            int alt120=8;
            switch ( input.LA(1) ) {
            case LONGLITERAL:
                {
                alt120=1;
                }
                break;
            case NULL:
                {
                alt120=2;
                }
                break;
            case INTLITERAL:
                {
                alt120=3;
                }
                break;
            case STRINGLITERAL:
                {
                alt120=4;
                }
                break;
            case CHARLITERAL:
                {
                alt120=5;
                }
                break;
            case FLOATNUM:
                {
                alt120=6;
                }
                break;
            case TRUE:
                {
                alt120=7;
                }
                break;
            case FALSE:
                {
                alt120=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 120, 0, input);

                throw nvae;

            }

            switch (alt120) {
                case 1 :
                    // Haxe.g:503:9: LONGLITERAL
                    {
                    LONGLITERAL436=(Token)match(input,LONGLITERAL,FOLLOW_LONGLITERAL_in_elementarySymbol6460); if (state.failed) return retval; 
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
                    // 503:24: -> LONGLITERAL[$LONGLITERAL, \"INT\"]
                    {
                        adaptor.addChild(root_0, 
                        new ConstantNode(LONGLITERAL, LONGLITERAL436, "INT")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // Haxe.g:504:9: NULL
                    {
                    NULL437=(Token)match(input,NULL,FOLLOW_NULL_in_elementarySymbol6481); if (state.failed) return retval; 
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
                    // 504:14: -> ^( NULL[$NULL,\"Unknown<0>\"] )
                    {
                        // Haxe.g:504:17: ^( NULL[$NULL,\"Unknown<0>\"] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        new ConstantNode(NULL, NULL437, "Unknown<0>")
                        , root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 3 :
                    // Haxe.g:505:9: INTLITERAL
                    {
                    INTLITERAL438=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_elementarySymbol6501); if (state.failed) return retval; 
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
                    // 505:23: -> INTLITERAL[$INTLITERAL, \"INT\"]
                    {
                        adaptor.addChild(root_0, 
                        new ConstantNode(INTLITERAL, INTLITERAL438, "INT")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 4 :
                    // Haxe.g:506:9: STRINGLITERAL
                    {
                    STRINGLITERAL439=(Token)match(input,STRINGLITERAL,FOLLOW_STRINGLITERAL_in_elementarySymbol6522); if (state.failed) return retval; 
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
                    // 506:26: -> STRINGLITERAL[$STRINGLITERAL,\"STRING\"]
                    {
                        adaptor.addChild(root_0, 
                        new ConstantNode(STRINGLITERAL, STRINGLITERAL439, "STRING")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 5 :
                    // Haxe.g:507:9: CHARLITERAL
                    {
                    CHARLITERAL440=(Token)match(input,CHARLITERAL,FOLLOW_CHARLITERAL_in_elementarySymbol6543); if (state.failed) return retval; 
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
                    // 507:24: -> CHARLITERAL[$CHARLITERAL, \"STRING\"]
                    {
                        adaptor.addChild(root_0, 
                        new ConstantNode(CHARLITERAL, CHARLITERAL440, "STRING")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 6 :
                    // Haxe.g:508:9: FLOATNUM
                    {
                    FLOATNUM441=(Token)match(input,FLOATNUM,FOLLOW_FLOATNUM_in_elementarySymbol6564); if (state.failed) return retval; 
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
                    // 508:21: -> FLOATNUM[$FLOATNUM, \"FLOAT\"]
                    {
                        adaptor.addChild(root_0, 
                        new ConstantNode(FLOATNUM, FLOATNUM441, "FLOAT")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 7 :
                    // Haxe.g:509:9: TRUE
                    {
                    TRUE442=(Token)match(input,TRUE,FOLLOW_TRUE_in_elementarySymbol6585); if (state.failed) return retval; 
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
                    // 509:21: -> TRUE[$TRUE,\"BOOL\"]
                    {
                        adaptor.addChild(root_0, 
                        new ConstantNode(TRUE, TRUE442, "BOOL")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 8 :
                    // Haxe.g:510:9: FALSE
                    {
                    FALSE443=(Token)match(input,FALSE,FOLLOW_FALSE_in_elementarySymbol6610); if (state.failed) return retval; 
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
                    // 510:22: -> FALSE[$FALSE,\"BOOL\"]
                    {
                        adaptor.addChild(root_0, 
                        new ConstantNode(FALSE, FALSE443, "BOOL")
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
            if ( state.backtracking>0 ) { memoize(input, 84, elementarySymbol_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "elementarySymbol"

    // $ANTLR start synpred49_Haxe
    public final void synpred49_Haxe_fragment() throws RecognitionException {
        // Haxe.g:190:59: ( typeParam )
        // Haxe.g:190:59: typeParam
        {
        pushFollow(FOLLOW_typeParam_in_synpred49_Haxe1714);
        typeParam();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred49_Haxe

    // $ANTLR start synpred50_Haxe
    public final void synpred50_Haxe_fragment() throws RecognitionException {
        // Haxe.g:190:14: ( ( anonType | IDENTIFIER | primitiveType ) ( typeParam )* )
        // Haxe.g:190:14: ( anonType | IDENTIFIER | primitiveType ) ( typeParam )*
        {
        // Haxe.g:190:14: ( anonType | IDENTIFIER | primitiveType )
        int alt123=3;
        switch ( input.LA(1) ) {
        case LBRACE:
            {
            alt123=1;
            }
            break;
        case IDENTIFIER:
            {
            alt123=2;
            }
            break;
        case BOOLEAN:
        case DYNAMIC:
        case FLOAT:
        case INT:
        case VOID:
            {
            alt123=3;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 123, 0, input);

            throw nvae;

        }

        switch (alt123) {
            case 1 :
                // Haxe.g:190:15: anonType
                {
                pushFollow(FOLLOW_anonType_in_synpred50_Haxe1698);
                anonType();

                state._fsp--;
                if (state.failed) return ;

                }
                break;
            case 2 :
                // Haxe.g:190:27: IDENTIFIER
                {
                match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_synpred50_Haxe1703); if (state.failed) return ;

                }
                break;
            case 3 :
                // Haxe.g:190:41: primitiveType
                {
                pushFollow(FOLLOW_primitiveType_in_synpred50_Haxe1708);
                primitiveType();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        // Haxe.g:190:58: ( typeParam )*
        loop124:
        do {
            int alt124=2;
            int LA124_0 = input.LA(1);

            if ( (LA124_0==LT) ) {
                alt124=1;
            }


            switch (alt124) {
        	case 1 :
        	    // Haxe.g:190:59: typeParam
        	    {
        	    pushFollow(FOLLOW_typeParam_in_synpred50_Haxe1714);
        	    typeParam();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop124;
            }
        } while (true);


        }

    }
    // $ANTLR end synpred50_Haxe

    // $ANTLR start synpred52_Haxe
    public final void synpred52_Haxe_fragment() throws RecognitionException {
        // Haxe.g:198:10: ( typeParam )
        // Haxe.g:198:10: typeParam
        {
        pushFollow(FOLLOW_typeParam_in_synpred52_Haxe1824);
        typeParam();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred52_Haxe

    // $ANTLR start synpred56_Haxe
    public final void synpred56_Haxe_fragment() throws RecognitionException {
        // Haxe.g:212:10: ( block )
        // Haxe.g:212:10: block
        {
        pushFollow(FOLLOW_block_in_synpred56_Haxe1986);
        block();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred56_Haxe

    // $ANTLR start synpred57_Haxe
    public final void synpred57_Haxe_fragment() throws RecognitionException {
        // Haxe.g:213:10: ( assignExpr SEMI )
        // Haxe.g:213:10: assignExpr SEMI
        {
        pushFollow(FOLLOW_assignExpr_in_synpred57_Haxe1997);
        assignExpr();

        state._fsp--;
        if (state.failed) return ;

        match(input,SEMI,FOLLOW_SEMI_in_synpred57_Haxe1999); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred57_Haxe

    // $ANTLR start synpred59_Haxe
    public final void synpred59_Haxe_fragment() throws RecognitionException {
        // Haxe.g:215:56: ( ELSE statement )
        // Haxe.g:215:56: ELSE statement
        {
        match(input,ELSE,FOLLOW_ELSE_in_synpred59_Haxe2042); if (state.failed) return ;

        pushFollow(FOLLOW_statement_in_synpred59_Haxe2045);
        statement();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred59_Haxe

    // $ANTLR start synpred75_Haxe
    public final void synpred75_Haxe_fragment() throws RecognitionException {
        // Haxe.g:225:10: ( expr SEMI )
        // Haxe.g:225:10: expr SEMI
        {
        pushFollow(FOLLOW_expr_in_synpred75_Haxe2388);
        expr();

        state._fsp--;
        if (state.failed) return ;

        match(input,SEMI,FOLLOW_SEMI_in_synpred75_Haxe2391); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred75_Haxe

    // $ANTLR start synpred76_Haxe
    public final void synpred76_Haxe_fragment() throws RecognitionException {
        // Haxe.g:226:10: ( IDENTIFIER COLON statement )
        // Haxe.g:226:10: IDENTIFIER COLON statement
        {
        match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_synpred76_Haxe2403); if (state.failed) return ;

        match(input,COLON,FOLLOW_COLON_in_synpred76_Haxe2405); if (state.failed) return ;

        pushFollow(FOLLOW_statement_in_synpred76_Haxe2407);
        statement();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred76_Haxe

    // $ANTLR start synpred79_Haxe
    public final void synpred79_Haxe_fragment() throws RecognitionException {
        // Haxe.g:239:10: ( varDecl )
        // Haxe.g:239:10: varDecl
        {
        pushFollow(FOLLOW_varDecl_in_synpred79_Haxe2573);
        varDecl();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred79_Haxe

    // $ANTLR start synpred111_Haxe
    public final void synpred111_Haxe_fragment() throws RecognitionException {
        // Haxe.g:326:19: ( psExpr PLUSPLUS )
        // Haxe.g:326:19: psExpr PLUSPLUS
        {
        pushFollow(FOLLOW_psExpr_in_synpred111_Haxe3933);
        psExpr();

        state._fsp--;
        if (state.failed) return ;

        match(input,PLUSPLUS,FOLLOW_PLUSPLUS_in_synpred111_Haxe3935); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred111_Haxe

    // $ANTLR start synpred112_Haxe
    public final void synpred112_Haxe_fragment() throws RecognitionException {
        // Haxe.g:327:19: ( psExpr SUBSUB )
        // Haxe.g:327:19: psExpr SUBSUB
        {
        pushFollow(FOLLOW_psExpr_in_synpred112_Haxe3992);
        psExpr();

        state._fsp--;
        if (state.failed) return ;

        match(input,SUBSUB,FOLLOW_SUBSUB_in_synpred112_Haxe3994); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred112_Haxe

    // $ANTLR start synpred114_Haxe
    public final void synpred114_Haxe_fragment() throws RecognitionException {
        // Haxe.g:336:15: ( methodCallOrSlice )
        // Haxe.g:336:15: methodCallOrSlice
        {
        pushFollow(FOLLOW_methodCallOrSlice_in_synpred114_Haxe4108);
        methodCallOrSlice();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred114_Haxe

    // $ANTLR start synpred117_Haxe
    public final void synpred117_Haxe_fragment() throws RecognitionException {
        // Haxe.g:340:21: ( value LPAREN ( exprList )? RPAREN ( pureCallOrSlice )? )
        // Haxe.g:340:21: value LPAREN ( exprList )? RPAREN ( pureCallOrSlice )?
        {
        pushFollow(FOLLOW_value_in_synpred117_Haxe4157);
        value();

        state._fsp--;
        if (state.failed) return ;

        match(input,LPAREN,FOLLOW_LPAREN_in_synpred117_Haxe4159); if (state.failed) return ;

        // Haxe.g:340:34: ( exprList )?
        int alt132=2;
        int LA132_0 = input.LA(1);

        if ( (LA132_0==BANG||LA132_0==CAST||LA132_0==CHARLITERAL||LA132_0==FALSE||LA132_0==FLOATNUM||LA132_0==FUNCTION||LA132_0==IDENTIFIER||LA132_0==INTLITERAL||(LA132_0 >= LBRACE && LA132_0 <= LBRACKET)||(LA132_0 >= LONGLITERAL && LA132_0 <= LPAREN)||(LA132_0 >= NEW && LA132_0 <= NULL)||LA132_0==PLUSPLUS||(LA132_0 >= STRINGLITERAL && LA132_0 <= SUB)||LA132_0==SUBSUB||LA132_0==THIS||LA132_0==TILDE||LA132_0==TRUE||LA132_0==UNTYPED) ) {
            alt132=1;
        }
        switch (alt132) {
            case 1 :
                // Haxe.g:340:34: exprList
                {
                pushFollow(FOLLOW_exprList_in_synpred117_Haxe4161);
                exprList();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        match(input,RPAREN,FOLLOW_RPAREN_in_synpred117_Haxe4164); if (state.failed) return ;

        // Haxe.g:340:51: ( pureCallOrSlice )?
        int alt133=2;
        int LA133_0 = input.LA(1);

        if ( (LA133_0==DOT||LA133_0==LBRACKET||LA133_0==LPAREN) ) {
            alt133=1;
        }
        switch (alt133) {
            case 1 :
                // Haxe.g:340:51: pureCallOrSlice
                {
                pushFollow(FOLLOW_pureCallOrSlice_in_synpred117_Haxe4166);
                pureCallOrSlice();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        }

    }
    // $ANTLR end synpred117_Haxe

    // $ANTLR start synpred119_Haxe
    public final void synpred119_Haxe_fragment() throws RecognitionException {
        // Haxe.g:342:15: ( value LBRACKET expr RBRACKET ( pureCallOrSlice )? )
        // Haxe.g:342:15: value LBRACKET expr RBRACKET ( pureCallOrSlice )?
        {
        pushFollow(FOLLOW_value_in_synpred119_Haxe4218);
        value();

        state._fsp--;
        if (state.failed) return ;

        match(input,LBRACKET,FOLLOW_LBRACKET_in_synpred119_Haxe4220); if (state.failed) return ;

        pushFollow(FOLLOW_expr_in_synpred119_Haxe4222);
        expr();

        state._fsp--;
        if (state.failed) return ;

        match(input,RBRACKET,FOLLOW_RBRACKET_in_synpred119_Haxe4224); if (state.failed) return ;

        // Haxe.g:342:44: ( pureCallOrSlice )?
        int alt134=2;
        int LA134_0 = input.LA(1);

        if ( (LA134_0==DOT||LA134_0==LBRACKET||LA134_0==LPAREN) ) {
            alt134=1;
        }
        switch (alt134) {
            case 1 :
                // Haxe.g:342:44: pureCallOrSlice
                {
                pushFollow(FOLLOW_pureCallOrSlice_in_synpred119_Haxe4226);
                pureCallOrSlice();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        }

    }
    // $ANTLR end synpred119_Haxe

    // $ANTLR start synpred130_Haxe
    public final void synpred130_Haxe_fragment() throws RecognitionException {
        // Haxe.g:359:18: ( expr )
        // Haxe.g:359:18: expr
        {
        pushFollow(FOLLOW_expr_in_synpred130_Haxe4454);
        expr();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred130_Haxe

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
    public final boolean synpred52_Haxe() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred52_Haxe_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred49_Haxe() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred49_Haxe_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred59_Haxe() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred59_Haxe_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred57_Haxe() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred57_Haxe_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred56_Haxe() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred56_Haxe_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred76_Haxe() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred76_Haxe_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred130_Haxe() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred130_Haxe_fragment(); // can never throw exception
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
    public final boolean synpred112_Haxe() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred112_Haxe_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred79_Haxe() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred79_Haxe_fragment(); // can never throw exception
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


    protected DFA86 dfa86 = new DFA86(this);
    protected DFA101 dfa101 = new DFA101(this);
    protected DFA110 dfa110 = new DFA110(this);
    static final String DFA86_eotS =
        "\10\uffff";
    static final String DFA86_eofS =
        "\10\uffff";
    static final String DFA86_minS =
        "\6\45\2\uffff";
    static final String DFA86_maxS =
        "\6\u009f\2\uffff";
    static final String DFA86_acceptS =
        "\6\uffff\1\1\1\2";
    static final String DFA86_specialS =
        "\10\uffff}>";
    static final String[] DFA86_transitionS = {
            "\1\3\23\uffff\1\7\22\uffff\1\2\27\uffff\1\4\24\uffff\1\5\2\uffff"+
            "\1\5\13\uffff\1\1\26\uffff\1\6",
            "\1\3\23\uffff\1\7\22\uffff\1\2\27\uffff\1\4\24\uffff\1\5\2"+
            "\uffff\1\5\13\uffff\1\1\26\uffff\1\6",
            "\1\3\23\uffff\1\7\22\uffff\1\2\27\uffff\1\4\24\uffff\1\5\2"+
            "\uffff\1\5\13\uffff\1\1\26\uffff\1\6",
            "\1\3\23\uffff\1\7\22\uffff\1\2\27\uffff\1\4\24\uffff\1\5\2"+
            "\uffff\1\5\13\uffff\1\1\26\uffff\1\6",
            "\1\3\23\uffff\1\7\22\uffff\1\2\27\uffff\1\4\24\uffff\1\5\2"+
            "\uffff\1\5\13\uffff\1\1\26\uffff\1\6",
            "\1\3\23\uffff\1\7\22\uffff\1\2\27\uffff\1\4\24\uffff\1\5\2"+
            "\uffff\1\5\13\uffff\1\1\26\uffff\1\6",
            "",
            ""
    };

    static final short[] DFA86_eot = DFA.unpackEncodedString(DFA86_eotS);
    static final short[] DFA86_eof = DFA.unpackEncodedString(DFA86_eofS);
    static final char[] DFA86_min = DFA.unpackEncodedStringToUnsignedChars(DFA86_minS);
    static final char[] DFA86_max = DFA.unpackEncodedStringToUnsignedChars(DFA86_maxS);
    static final short[] DFA86_accept = DFA.unpackEncodedString(DFA86_acceptS);
    static final short[] DFA86_special = DFA.unpackEncodedString(DFA86_specialS);
    static final short[][] DFA86_transition;

    static {
        int numStates = DFA86_transitionS.length;
        DFA86_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA86_transition[i] = DFA.unpackEncodedString(DFA86_transitionS[i]);
        }
    }

    class DFA86 extends DFA {

        public DFA86(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 86;
            this.eot = DFA86_eot;
            this.eof = DFA86_eof;
            this.min = DFA86_min;
            this.max = DFA86_max;
            this.accept = DFA86_accept;
            this.special = DFA86_special;
            this.transition = DFA86_transition;
        }
        public String getDescription() {
            return "393:1: classMember : ( varDeclClass | funcDecl );";
        }
    }
    static final String DFA101_eotS =
        "\11\uffff";
    static final String DFA101_eofS =
        "\11\uffff";
    static final String DFA101_minS =
        "\6\45\1\105\2\uffff";
    static final String DFA101_maxS =
        "\6\u0088\1\141\2\uffff";
    static final String DFA101_acceptS =
        "\7\uffff\1\1\1\2";
    static final String DFA101_specialS =
        "\11\uffff}>";
    static final String[] DFA101_transitionS = {
            "\1\3\23\uffff\1\6\22\uffff\1\2\27\uffff\1\4\24\uffff\1\5\2\uffff"+
            "\1\5\13\uffff\1\1",
            "\1\3\23\uffff\1\6\22\uffff\1\2\27\uffff\1\4\24\uffff\1\5\2"+
            "\uffff\1\5\13\uffff\1\1",
            "\1\3\23\uffff\1\6\22\uffff\1\2\27\uffff\1\4\24\uffff\1\5\2"+
            "\uffff\1\5\13\uffff\1\1",
            "\1\3\23\uffff\1\6\22\uffff\1\2\27\uffff\1\4\24\uffff\1\5\2"+
            "\uffff\1\5\13\uffff\1\1",
            "\1\3\23\uffff\1\6\22\uffff\1\2\27\uffff\1\4\24\uffff\1\5\2"+
            "\uffff\1\5\13\uffff\1\1",
            "\1\3\23\uffff\1\6\22\uffff\1\2\27\uffff\1\4\24\uffff\1\5\2"+
            "\uffff\1\5\13\uffff\1\1",
            "\1\10\33\uffff\1\7",
            "",
            ""
    };

    static final short[] DFA101_eot = DFA.unpackEncodedString(DFA101_eotS);
    static final short[] DFA101_eof = DFA.unpackEncodedString(DFA101_eofS);
    static final char[] DFA101_min = DFA.unpackEncodedStringToUnsignedChars(DFA101_minS);
    static final char[] DFA101_max = DFA.unpackEncodedStringToUnsignedChars(DFA101_maxS);
    static final short[] DFA101_accept = DFA.unpackEncodedString(DFA101_acceptS);
    static final short[] DFA101_special = DFA.unpackEncodedString(DFA101_specialS);
    static final short[][] DFA101_transition;

    static {
        int numStates = DFA101_transitionS.length;
        DFA101_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA101_transition[i] = DFA.unpackEncodedString(DFA101_transitionS[i]);
        }
    }

    class DFA101 extends DFA {

        public DFA101(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 101;
            this.eot = DFA101_eot;
            this.eof = DFA101_eof;
            this.min = DFA101_min;
            this.max = DFA101_max;
            this.accept = DFA101_accept;
            this.special = DFA101_special;
            this.transition = DFA101_transition;
        }
        public String getDescription() {
            return "422:1: funcDecl : ( ( declAttrList )? FUNCTION NEW LPAREN ( paramList )? RPAREN ( typeTag )? block -> ^( FUNCTION NEW ( declAttrList )? ( paramList )? ( typeTag )? ( block )? ) | ( declAttrList )? FUNCTION IDENTIFIER typeParamOpt LPAREN ( paramList )? RPAREN ( typeTag )? block -> ^( FUNCTION IDENTIFIER ( declAttrList )? ( paramList )? ( typeTag )? ( block )? ( typeParamOpt )? ) );";
        }
    }
    static final String DFA110_eotS =
        "\14\uffff";
    static final String DFA110_eofS =
        "\14\uffff";
    static final String DFA110_minS =
        "\6\45\2\105\4\uffff";
    static final String DFA110_maxS =
        "\6\u0088\2\141\4\uffff";
    static final String DFA110_acceptS =
        "\10\uffff\1\3\1\4\1\1\1\2";
    static final String DFA110_specialS =
        "\14\uffff}>";
    static final String[] DFA110_transitionS = {
            "\1\3\23\uffff\1\6\22\uffff\1\2\27\uffff\1\4\24\uffff\1\5\2\uffff"+
            "\1\5\13\uffff\1\1",
            "\1\3\23\uffff\1\7\22\uffff\1\2\27\uffff\1\4\24\uffff\1\5\2"+
            "\uffff\1\5\13\uffff\1\1",
            "\1\3\23\uffff\1\7\22\uffff\1\2\27\uffff\1\4\24\uffff\1\5\2"+
            "\uffff\1\5\13\uffff\1\1",
            "\1\3\23\uffff\1\7\22\uffff\1\2\27\uffff\1\4\24\uffff\1\5\2"+
            "\uffff\1\5\13\uffff\1\1",
            "\1\3\23\uffff\1\7\22\uffff\1\2\27\uffff\1\4\24\uffff\1\5\2"+
            "\uffff\1\5\13\uffff\1\1",
            "\1\3\23\uffff\1\7\22\uffff\1\2\27\uffff\1\4\24\uffff\1\5\2"+
            "\uffff\1\5\13\uffff\1\1",
            "\1\11\33\uffff\1\10",
            "\1\13\33\uffff\1\12",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA110_eot = DFA.unpackEncodedString(DFA110_eotS);
    static final short[] DFA110_eof = DFA.unpackEncodedString(DFA110_eofS);
    static final char[] DFA110_min = DFA.unpackEncodedStringToUnsignedChars(DFA110_minS);
    static final char[] DFA110_max = DFA.unpackEncodedStringToUnsignedChars(DFA110_maxS);
    static final short[] DFA110_accept = DFA.unpackEncodedString(DFA110_acceptS);
    static final short[] DFA110_special = DFA.unpackEncodedString(DFA110_specialS);
    static final short[][] DFA110_transition;

    static {
        int numStates = DFA110_transitionS.length;
        DFA110_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA110_transition[i] = DFA.unpackEncodedString(DFA110_transitionS[i]);
        }
    }

    class DFA110 extends DFA {

        public DFA110(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 110;
            this.eot = DFA110_eot;
            this.eof = DFA110_eof;
            this.min = DFA110_min;
            this.max = DFA110_max;
            this.accept = DFA110_accept;
            this.special = DFA110_special;
            this.transition = DFA110_transition;
        }
        public String getDescription() {
            return "428:1: funcProtoDecl : ( declAttrList FUNCTION NEW LPAREN ( paramList )? RPAREN ( typeTag )? SEMI -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTag )? ( declAttrList )? ) | declAttrList FUNCTION IDENTIFIER typeParamOpt LPAREN ( paramList )? RPAREN ( typeTag )? SEMI -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTag )? ( declAttrList )? ( typeParamOpt )? ) | FUNCTION NEW LPAREN ( paramList )? RPAREN ( typeTag )? SEMI -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTag )? ) | FUNCTION IDENTIFIER typeParamOpt LPAREN ( paramList )? RPAREN ( typeTag )? SEMI -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTag )? ( typeParamOpt )? ) );";
        }
    }
 

    public static final BitSet FOLLOW_myPackage_in_module177 = new BitSet(new long[]{0x0001040004000000L,0x0200000000008200L,0x0000000042000000L});
    public static final BitSet FOLLOW_topLevelList_in_module180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_topLevel_in_topLevelList229 = new BitSet(new long[]{0x0001040004000002L,0x0200000000008200L,0x0000000042000000L});
    public static final BitSet FOLLOW_IMPORT_in_topLevel263 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L,0x0000000000020000L});
    public static final BitSet FOLLOW_dotIdent_in_topLevel266 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_SEMI_in_topLevel268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_USING_in_topLevel289 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L,0x0000000000020000L});
    public static final BitSet FOLLOW_dotIdent_in_topLevel292 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_SEMI_in_topLevel294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_topLevelDecl_in_topLevel315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PACKAGE_in_myPackage347 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L,0x0000000000020000L});
    public static final BitSet FOLLOW_dotIdent_in_myPackage350 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_SEMI_in_myPackage352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MONKEYS_AT_in_meta382 = new BitSet(new long[]{0x0040002008010000L,0x0000000000004020L,0x0000000200000000L});
    public static final BitSet FOLLOW_metaName_in_meta384 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
    public static final BitSet FOLLOW_LPAREN_in_meta387 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000020L,0x0000000000000002L});
    public static final BitSet FOLLOW_paramList_in_meta389 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_RPAREN_in_meta392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_metaName411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveType_in_metaName419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_in_metaName428 = new BitSet(new long[]{0x0040002008010000L,0x0000000000004020L,0x0000000200000000L});
    public static final BitSet FOLLOW_metaName_in_metaName430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_meta_in_typeDeclFlags448 = new BitSet(new long[]{0x0001000000000002L,0x0200000080000000L});
    public static final BitSet FOLLOW_STATIC_in_declAttr603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INLINE_in_declAttr623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DYNAMIC_in_declAttr643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OVERRIDE_in_declAttr663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_access_in_declAttr683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttr_in_declAttrList712 = new BitSet(new long[]{0x0000002000000002L,0x1200001000001000L,0x0000000000000100L});
    public static final BitSet FOLLOW_param_in_paramList757 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_COMMA_in_paramList760 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000020L});
    public static final BitSet FOLLOW_param_in_paramList762 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_QUES_in_param812 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_IDENTIFIER_in_param815 = new BitSet(new long[]{0x0000080008000002L});
    public static final BitSet FOLLOW_typeTag_in_param817 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_varInit_in_param820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_id882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIS_in_id905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_dotIdent940 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_DOT_in_dotIdent942 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L,0x0000000000020000L});
    public static final BitSet FOLLOW_dotIdent_in_dotIdent946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_dotIdent981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQ_in_assignOp1017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUSEQ_in_assignOp1050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUBEQ_in_assignOp1079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STAREQ_in_assignOp1109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SLASHEQ_in_assignOp1138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PERCENTEQ_in_assignOp1166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AMPEQ_in_assignOp1193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BAREQ_in_assignOp1223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CARETEQ_in_assignOp1253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LTLTEQ_in_assignOp1281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GTGTEQ_in_assignOp1310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GTGTGTEQ_in_assignOp1339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_in_funcLit1395 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_LPAREN_in_funcLit1401 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000020L,0x0000000000000002L});
    public static final BitSet FOLLOW_paramList_in_funcLit1404 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_RPAREN_in_funcLit1407 = new BitSet(new long[]{0x0000000008000000L,0x0000000000080000L,0x0000000000000004L});
    public static final BitSet FOLLOW_typeTag_in_funcLit1410 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L,0x0000000000000004L});
    public static final BitSet FOLLOW_block_in_funcLit1413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACKET_in_arrayLit1445 = new BitSet(new long[]{0x0288000002400200L,0x8000080600D90020L,0x0000000020522C00L});
    public static final BitSet FOLLOW_exprList_in_arrayLit1448 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_RBRACKET_in_arrayLit1451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_in_typeTag1496 = new BitSet(new long[]{0x0040002000010000L,0x0000000020084020L,0x0000000200000000L});
    public static final BitSet FOLLOW_funcType_in_typeTag1498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcType_in_typeList1542 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_COMMA_in_typeList1545 = new BitSet(new long[]{0x0040002000010000L,0x0000000020084020L,0x0000000200000000L});
    public static final BitSet FOLLOW_typeList_in_typeList1548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeConstraint_in_typeList1570 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_COMMA_in_typeList1573 = new BitSet(new long[]{0x0040002000010000L,0x0000000020084020L,0x0000000200000000L});
    public static final BitSet FOLLOW_typeList_in_typeList1576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_funcType1611 = new BitSet(new long[]{0x0000000000000002L,0x0000000020000000L});
    public static final BitSet FOLLOW_MINUS_BIGGER_in_funcType1614 = new BitSet(new long[]{0x0040002000010000L,0x0000000020084020L,0x0000000200000000L});
    public static final BitSet FOLLOW_type_in_funcType1617 = new BitSet(new long[]{0x0000000000000002L,0x0000000020000000L});
    public static final BitSet FOLLOW_anonType_in_type1698 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_type1703 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_primitiveType_in_type1708 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_typeParam_in_type1714 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_LT_in_typeParam1773 = new BitSet(new long[]{0x0040002000010000L,0x0000000020084020L,0x0000000200000000L});
    public static final BitSet FOLLOW_typeList_in_typeParam1776 = new BitSet(new long[]{0x0800000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_typeParam_in_typeParam1778 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_GT_in_typeParam1781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeParam_in_typeParamOpt1824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_typeConstraint1873 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_COLON_in_typeConstraint1875 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_LPAREN_in_typeConstraint1877 = new BitSet(new long[]{0x0040002000010000L,0x0000000020084020L,0x0000000200000000L});
    public static final BitSet FOLLOW_typeList_in_typeConstraint1879 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_RPAREN_in_typeConstraint1881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttrList_in_functionReturn1920 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_FUNCTION_in_functionReturn1923 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_NEW_in_functionReturn1925 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_LPAREN_in_functionReturn1927 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000020L,0x0000000000000002L});
    public static final BitSet FOLLOW_paramList_in_functionReturn1929 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_RPAREN_in_functionReturn1932 = new BitSet(new long[]{0x0000000008000000L,0x0000000000080000L,0x0000000000000004L});
    public static final BitSet FOLLOW_typeTag_in_functionReturn1934 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L,0x0000000000000004L});
    public static final BitSet FOLLOW_block_in_functionReturn1937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_statement1986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignExpr_in_statement1997 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_SEMI_in_statement1999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDecl_in_statement2011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_statement2031 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_parExpression_in_statement2037 = new BitSet(new long[]{0x0388000482420200L,0x0000080600D90060L,0x00000008A0D72C05L});
    public static final BitSet FOLLOW_statement_in_statement2039 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_ELSE_in_statement2042 = new BitSet(new long[]{0x0388000482420200L,0x0000080600D90060L,0x00000008A0D72C05L});
    public static final BitSet FOLLOW_statement_in_statement2045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_statement2067 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_LPAREN_in_statement2069 = new BitSet(new long[]{0x0288000002400200L,0x0000080600D90020L,0x0000000020522C00L});
    public static final BitSet FOLLOW_expr_in_statement2073 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_IN_in_statement2075 = new BitSet(new long[]{0x0288000002400200L,0x0000080600D90020L,0x0000000020522C00L});
    public static final BitSet FOLLOW_expr_in_statement2079 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_RPAREN_in_statement2081 = new BitSet(new long[]{0x0388000482420200L,0x0000080600D90060L,0x00000008A0D72C05L});
    public static final BitSet FOLLOW_statement_in_statement2083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_statement2124 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_parExpression_in_statement2130 = new BitSet(new long[]{0x0388000482420200L,0x0000080600D90060L,0x00000008A0D72C05L});
    public static final BitSet FOLLOW_statement_in_statement2132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DO_in_statement2152 = new BitSet(new long[]{0x0388000482420200L,0x0000080600D90060L,0x00000008A0D72C05L});
    public static final BitSet FOLLOW_statement_in_statement2158 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_WHILE_in_statement2160 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_parExpression_in_statement2163 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_SEMI_in_statement2165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRY_in_statement2186 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L,0x0000000000000004L});
    public static final BitSet FOLLOW_block_in_statement2192 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_catchStmt_in_statement2194 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_SWITCH_in_statement2215 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_LPAREN_in_statement2221 = new BitSet(new long[]{0x0288000002400200L,0x0000080600D90020L,0x0000000020522C00L});
    public static final BitSet FOLLOW_expr_in_statement2224 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_RPAREN_in_statement2226 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_LBRACE_in_statement2229 = new BitSet(new long[]{0x0000000200200000L});
    public static final BitSet FOLLOW_caseStmt_in_statement2232 = new BitSet(new long[]{0x0000000200200000L,0x4000000000000000L});
    public static final BitSet FOLLOW_RBRACE_in_statement2235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_statement2256 = new BitSet(new long[]{0x0288000002400200L,0x0000080600D90020L,0x0000000020522C04L});
    public static final BitSet FOLLOW_expr_in_statement2262 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_SEMI_in_statement2265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THROW_in_statement2286 = new BitSet(new long[]{0x0288000002400200L,0x0000080600D90020L,0x0000000020522C00L});
    public static final BitSet FOLLOW_expr_in_statement2289 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_SEMI_in_statement2291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BREAK_in_statement2303 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L,0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_statement2306 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_SEMI_in_statement2310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONTINUE_in_statement2345 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L,0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_statement2348 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_SEMI_in_statement2352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_statement2388 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_SEMI_in_statement2391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_statement2403 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_COLON_in_statement2405 = new BitSet(new long[]{0x0388000482420200L,0x0000080600D90060L,0x00000008A0D72C05L});
    public static final BitSet FOLLOW_statement_in_statement2407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMI_in_statement2446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_parExpression2470 = new BitSet(new long[]{0x0288000002400200L,0x0000080600D90020L,0x0000000020522C00L});
    public static final BitSet FOLLOW_expr_in_parExpression2473 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_RPAREN_in_parExpression2475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_block2499 = new BitSet(new long[]{0x0389000486420200L,0x4200080600D90060L,0x00000008A0D72C05L});
    public static final BitSet FOLLOW_blockStmt_in_block2502 = new BitSet(new long[]{0x0389000486420200L,0x4200080600D90060L,0x00000008A0D72C05L});
    public static final BitSet FOLLOW_RBRACE_in_block2506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMI_in_block2540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDecl_in_blockStmt2573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classDecl_in_blockStmt2584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_blockStmt2595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BREAK_in_breakStmt2618 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_SEMI_in_breakStmt2620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONTINUE_in_continueStmt2653 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_SEMI_in_continueStmt2655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CASE_in_caseStmt2692 = new BitSet(new long[]{0x0288000002400200L,0x0000080600D90020L,0x0000000020522C00L});
    public static final BitSet FOLLOW_exprList_in_caseStmt2695 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_COLON_in_caseStmt2697 = new BitSet(new long[]{0x0388000482420200L,0x0000080600D90060L,0x00000008A0D72C05L});
    public static final BitSet FOLLOW_statement_in_caseStmt2700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_caseStmt2720 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_COLON_in_caseStmt2723 = new BitSet(new long[]{0x0388000482420200L,0x0000080600D90060L,0x00000008A0D72C05L});
    public static final BitSet FOLLOW_statement_in_caseStmt2726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CATCH_in_catchStmt2762 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_LPAREN_in_catchStmt2768 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000020L});
    public static final BitSet FOLLOW_param_in_catchStmt2771 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_RPAREN_in_catchStmt2773 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L,0x0000000000000004L});
    public static final BitSet FOLLOW_block_in_catchStmt2776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_exprList2798 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_COMMA_in_exprList2801 = new BitSet(new long[]{0x0288000002400200L,0x0000080600D90020L,0x0000000020522C00L});
    public static final BitSet FOLLOW_expr_in_exprList2804 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_assignExpr_in_expr2830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNTYPED_in_expr2841 = new BitSet(new long[]{0x0288000002400200L,0x0000080600D90020L,0x0000000000522C00L});
    public static final BitSet FOLLOW_assignExpr_in_expr2843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iterExpr_in_assignExpr2875 = new BitSet(new long[]{0x4000080000104082L,0x0000050008000001L,0x00000000000010A0L});
    public static final BitSet FOLLOW_assignOp_in_assignExpr2878 = new BitSet(new long[]{0x0288000002400200L,0x0000080600D90020L,0x0000000000522C00L});
    public static final BitSet FOLLOW_iterExpr_in_assignExpr2881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ternaryExpr_in_iterExpr2909 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_ELLIPSIS_in_iterExpr2933 = new BitSet(new long[]{0x0288000002400200L,0x0000080600D90020L,0x0000000000522C00L});
    public static final BitSet FOLLOW_ternaryExpr_in_iterExpr2939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicOrExpr_in_ternaryExpr2973 = new BitSet(new long[]{0x0000000000000002L,0x2000000000000000L});
    public static final BitSet FOLLOW_QUES_in_ternaryExpr2976 = new BitSet(new long[]{0x0288000002400200L,0x0000080600D90020L,0x0000000020522C00L});
    public static final BitSet FOLLOW_expr_in_ternaryExpr2982 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_COLON_in_ternaryExpr2984 = new BitSet(new long[]{0x0288000002400200L,0x0000080600D90020L,0x0000000000522C00L});
    public static final BitSet FOLLOW_logicOrExpr_in_ternaryExpr2987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicAndExpr_in_logicOrExpr3007 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_BARBAR_in_logicOrExpr3031 = new BitSet(new long[]{0x0288000002400200L,0x0000080600D90020L,0x0000000000522C00L});
    public static final BitSet FOLLOW_logicAndExpr_in_logicOrExpr3037 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_cmpExpr_in_logicAndExpr3071 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_AMPAMP_in_logicAndExpr3073 = new BitSet(new long[]{0x0288000002400200L,0x0000080600D90020L,0x0000000000522C00L});
    public static final BitSet FOLLOW_cmpExpr_in_logicAndExpr3079 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_bitExpr_in_cmpExpr3118 = new BitSet(new long[]{0x1800100000000402L,0x0000000003000000L});
    public static final BitSet FOLLOW_EQEQ_in_cmpExpr3145 = new BitSet(new long[]{0x0288000002400200L,0x0000080600D90020L,0x0000000000522C00L});
    public static final BitSet FOLLOW_BANGEQ_in_cmpExpr3174 = new BitSet(new long[]{0x0288000002400200L,0x0000080600D90020L,0x0000000000522C00L});
    public static final BitSet FOLLOW_GTEQ_in_cmpExpr3203 = new BitSet(new long[]{0x0288000002400200L,0x0000080600D90020L,0x0000000000522C00L});
    public static final BitSet FOLLOW_LTEQ_in_cmpExpr3232 = new BitSet(new long[]{0x0288000002400200L,0x0000080600D90020L,0x0000000000522C00L});
    public static final BitSet FOLLOW_GT_in_cmpExpr3261 = new BitSet(new long[]{0x0288000002400200L,0x0000080600D90020L,0x0000000000522C00L});
    public static final BitSet FOLLOW_LT_in_cmpExpr3290 = new BitSet(new long[]{0x0288000002400200L,0x0000080600D90020L,0x0000000000522C00L});
    public static final BitSet FOLLOW_bitExpr_in_cmpExpr3297 = new BitSet(new long[]{0x1800100000000402L,0x0000000003000000L});
    public static final BitSet FOLLOW_shiftExpr_in_bitExpr3336 = new BitSet(new long[]{0x0000000000081022L});
    public static final BitSet FOLLOW_BAR_in_bitExpr3363 = new BitSet(new long[]{0x0288000002400200L,0x0000080600D90020L,0x0000000000522C00L});
    public static final BitSet FOLLOW_AMP_in_bitExpr3392 = new BitSet(new long[]{0x0288000002400200L,0x0000080600D90020L,0x0000000000522C00L});
    public static final BitSet FOLLOW_CARET_in_bitExpr3421 = new BitSet(new long[]{0x0288000002400200L,0x0000080600D90020L,0x0000000000522C00L});
    public static final BitSet FOLLOW_shiftExpr_in_bitExpr3428 = new BitSet(new long[]{0x0000000000081022L});
    public static final BitSet FOLLOW_addExpr_in_shiftExpr3461 = new BitSet(new long[]{0xA000000000000002L,0x0000000004000000L});
    public static final BitSet FOLLOW_LTLT_in_shiftExpr3488 = new BitSet(new long[]{0x0288000002400200L,0x0000080600D90020L,0x0000000000522C00L});
    public static final BitSet FOLLOW_GTGT_in_shiftExpr3517 = new BitSet(new long[]{0x0288000002400200L,0x0000080600D90020L,0x0000000000522C00L});
    public static final BitSet FOLLOW_GTGTGT_in_shiftExpr3546 = new BitSet(new long[]{0x0288000002400200L,0x0000080600D90020L,0x0000000000522C00L});
    public static final BitSet FOLLOW_addExpr_in_shiftExpr3553 = new BitSet(new long[]{0xA000000000000002L,0x0000000004000000L});
    public static final BitSet FOLLOW_multExpr_in_addExpr3588 = new BitSet(new long[]{0x0000000000000002L,0x0000020000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_PLUS_in_addExpr3615 = new BitSet(new long[]{0x0288000002400200L,0x0000080600D90020L,0x0000000000522C00L});
    public static final BitSet FOLLOW_SUB_in_addExpr3644 = new BitSet(new long[]{0x0288000002400200L,0x0000080600D90020L,0x0000000000522C00L});
    public static final BitSet FOLLOW_multExpr_in_addExpr3651 = new BitSet(new long[]{0x0000000000000002L,0x0000020000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_unarExpr_in_multExpr3690 = new BitSet(new long[]{0x0000000000000002L,0x0000008000000000L,0x0000000000000050L});
    public static final BitSet FOLLOW_STAR_in_multExpr3717 = new BitSet(new long[]{0x0288000002400200L,0x0000080600D90020L,0x0000000000522C00L});
    public static final BitSet FOLLOW_SLASH_in_multExpr3746 = new BitSet(new long[]{0x0288000002400200L,0x0000080600D90020L,0x0000000000522C00L});
    public static final BitSet FOLLOW_PERCENT_in_multExpr3775 = new BitSet(new long[]{0x0288000002400200L,0x0000080600D90020L,0x0000000000522C00L});
    public static final BitSet FOLLOW_unarExpr_in_multExpr3782 = new BitSet(new long[]{0x0000000000000002L,0x0000008000000000L,0x0000000000000050L});
    public static final BitSet FOLLOW_SUB_in_unarExpr3830 = new BitSet(new long[]{0x0288000002400000L,0x0000000600D90020L,0x0000000000420400L});
    public static final BitSet FOLLOW_SUBSUB_in_unarExpr3849 = new BitSet(new long[]{0x0288000002400000L,0x0000000600D90020L,0x0000000000420400L});
    public static final BitSet FOLLOW_PLUSPLUS_in_unarExpr3868 = new BitSet(new long[]{0x0288000002400000L,0x0000000600D90020L,0x0000000000420400L});
    public static final BitSet FOLLOW_BANG_in_unarExpr3887 = new BitSet(new long[]{0x0288000002400000L,0x0000000600D90020L,0x0000000000420400L});
    public static final BitSet FOLLOW_TILDE_in_unarExpr3906 = new BitSet(new long[]{0x0288000002400000L,0x0000000600D90020L,0x0000000000420400L});
    public static final BitSet FOLLOW_psExpr_in_unarExpr3913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_psExpr_in_unarExpr3933 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_PLUSPLUS_in_unarExpr3935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_psExpr_in_unarExpr3992 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_SUBSUB_in_unarExpr3994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_psExpr_in_unarExpr4053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_prefixExpr_in_psExpr4082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_suffixExpr_in_psExpr4090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_methodCallOrSlice_in_suffixExpr4108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_suffixExpr4124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_methodCallOrSlice4157 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_LPAREN_in_methodCallOrSlice4159 = new BitSet(new long[]{0x0288000002400200L,0x0000080600D90020L,0x0000000020522C02L});
    public static final BitSet FOLLOW_exprList_in_methodCallOrSlice4161 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_RPAREN_in_methodCallOrSlice4164 = new BitSet(new long[]{0x0000000800000002L,0x0000000000900000L});
    public static final BitSet FOLLOW_pureCallOrSlice_in_methodCallOrSlice4166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_methodCallOrSlice4218 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_LBRACKET_in_methodCallOrSlice4220 = new BitSet(new long[]{0x0288000002400200L,0x0000080600D90020L,0x0000000020522C00L});
    public static final BitSet FOLLOW_expr_in_methodCallOrSlice4222 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_RBRACKET_in_methodCallOrSlice4224 = new BitSet(new long[]{0x0000000800000002L,0x0000000000900000L});
    public static final BitSet FOLLOW_pureCallOrSlice_in_methodCallOrSlice4226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_methodCallOrSlice4282 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_DOT_in_methodCallOrSlice4284 = new BitSet(new long[]{0x0288000002000002L,0x0000000400D90020L,0x0000000000420400L});
    public static final BitSet FOLLOW_suffixExpr_in_methodCallOrSlice4286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_pureCallOrSlice4305 = new BitSet(new long[]{0x0288000002400200L,0x0000080600D90020L,0x0000000020522C02L});
    public static final BitSet FOLLOW_exprList_in_pureCallOrSlice4307 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_RPAREN_in_pureCallOrSlice4310 = new BitSet(new long[]{0x0000000800000002L,0x0000000000900000L});
    public static final BitSet FOLLOW_pureCallOrSlice_in_pureCallOrSlice4312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACKET_in_pureCallOrSlice4348 = new BitSet(new long[]{0x0288000002400200L,0x0000080600D90020L,0x0000000020522C00L});
    public static final BitSet FOLLOW_expr_in_pureCallOrSlice4350 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_RBRACKET_in_pureCallOrSlice4352 = new BitSet(new long[]{0x0000000800000002L,0x0000000000900000L});
    public static final BitSet FOLLOW_pureCallOrSlice_in_pureCallOrSlice4354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_pureCallOrSlice4391 = new BitSet(new long[]{0x0288000002000000L,0x0000000400D90020L,0x0000000000420400L});
    public static final BitSet FOLLOW_methodCallOrSlice_in_pureCallOrSlice4394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objLit_in_value4414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcLit_in_value4422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayLit_in_value4430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_elementarySymbol_in_value4440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_value4450 = new BitSet(new long[]{0x0388000482420200L,0x0000080600D90060L,0x00000008A0D72C05L});
    public static final BitSet FOLLOW_expr_in_value4454 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_value4456 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_RPAREN_in_value4459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_value4475 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_typeParamOpt_in_value4477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEW_in_prefixExpr4499 = new BitSet(new long[]{0x0040002000010000L,0x0000000000884020L,0x0000000200000000L});
    public static final BitSet FOLLOW_type_in_prefixExpr4502 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_LPAREN_in_prefixExpr4504 = new BitSet(new long[]{0x0288000002400200L,0x0000080600D90020L,0x0000000020522C02L});
    public static final BitSet FOLLOW_exprList_in_prefixExpr4507 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_RPAREN_in_prefixExpr4510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CAST_in_prefixExpr4519 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_LPAREN_in_prefixExpr4522 = new BitSet(new long[]{0x0288000002400200L,0x0000080600D90020L,0x0000000020522C00L});
    public static final BitSet FOLLOW_expr_in_prefixExpr4525 = new BitSet(new long[]{0x0000000010000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_prefixExpr4528 = new BitSet(new long[]{0x0040002000010000L,0x0000000020084020L,0x0000000200000000L});
    public static final BitSet FOLLOW_funcType_in_prefixExpr4531 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_RPAREN_in_prefixExpr4535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classDecl_in_topLevelDecl4554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interfaceDecl_in_topLevelDecl4574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumDecl_in_topLevelDecl4594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typedefDecl_in_topLevelDecl4614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_topLevelAccess_in_enumDecl4650 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_ENUM_in_enumDecl4653 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_IDENTIFIER_in_enumDecl4655 = new BitSet(new long[]{0x0000000000000000L,0x0000000001080000L});
    public static final BitSet FOLLOW_typeParamOpt_in_enumDecl4657 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_enumBody_in_enumDecl4659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_enumBody4709 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000020L});
    public static final BitSet FOLLOW_enumValueDecl_in_enumBody4712 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000020L});
    public static final BitSet FOLLOW_RBRACE_in_enumBody4716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_enumValueDecl4756 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_LPAREN_in_enumValueDecl4762 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000020L,0x0000000000000002L});
    public static final BitSet FOLLOW_paramList_in_enumValueDecl4765 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_RPAREN_in_enumValueDecl4768 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_SEMI_in_enumValueDecl4771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_enumValueDecl4794 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_SEMI_in_enumValueDecl4799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_topLevelAccess_in_classDecl4848 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_CLASS_in_classDecl4851 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_IDENTIFIER_in_classDecl4853 = new BitSet(new long[]{0x0000800000000000L,0x0000000001080100L});
    public static final BitSet FOLLOW_typeParamOpt_in_classDecl4855 = new BitSet(new long[]{0x0000800000000000L,0x0000000000080100L});
    public static final BitSet FOLLOW_inheritListOpt_in_classDecl4857 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_classBodyScope_in_classDecl4859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_classBodyScope4906 = new BitSet(new long[]{0x0200002000000000L,0x5200001000001000L,0x0000000080000100L});
    public static final BitSet FOLLOW_classMember_in_classBodyScope4909 = new BitSet(new long[]{0x0200002000000000L,0x5200001000001000L,0x0000000080000100L});
    public static final BitSet FOLLOW_RBRACE_in_classBodyScope4913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDeclClass_in_classMember4959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcDecl_in_classMember4979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDecl_in_varDeclList5022 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_varDeclList_in_varDeclList5024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttrList_in_varDeclClass5052 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_VAR_in_varDeclClass5055 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_IDENTIFIER_in_varDeclClass5057 = new BitSet(new long[]{0x0000080008000000L,0x0000000000800000L,0x0000000000000004L});
    public static final BitSet FOLLOW_propDecl_in_varDeclClass5059 = new BitSet(new long[]{0x0000080008000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_typeTag_in_varDeclClass5062 = new BitSet(new long[]{0x0000080000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_varInit_in_varDeclClass5065 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_SEMI_in_varDeclClass5068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_varDecl5133 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_varDeclPartList_in_varDecl5136 = new BitSet(new long[]{0x0000000010000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_COMMA_in_varDecl5139 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_varDeclPartList_in_varDecl5142 = new BitSet(new long[]{0x0000000010000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_SEMI_in_varDecl5146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_varDeclPartList5167 = new BitSet(new long[]{0x0000080008000002L,0x0000000000800000L});
    public static final BitSet FOLLOW_propDecl_in_varDeclPartList5169 = new BitSet(new long[]{0x0000080008000002L});
    public static final BitSet FOLLOW_typeTag_in_varDeclPartList5172 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_varInit_in_varDeclPartList5175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_propDecl5226 = new BitSet(new long[]{0x0000002200000000L,0x0000000400000020L});
    public static final BitSet FOLLOW_propAccessor_in_propDecl5230 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_COMMA_in_propDecl5232 = new BitSet(new long[]{0x0000002200000000L,0x0000000400000020L});
    public static final BitSet FOLLOW_propAccessor_in_propDecl5236 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_RPAREN_in_propDecl5238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQ_in_varInit5379 = new BitSet(new long[]{0x0288000002400200L,0x0000080600D90020L,0x0000000020522C00L});
    public static final BitSet FOLLOW_expr_in_varInit5381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttrList_in_funcDecl5423 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_FUNCTION_in_funcDecl5426 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_NEW_in_funcDecl5428 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_LPAREN_in_funcDecl5430 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000020L,0x0000000000000002L});
    public static final BitSet FOLLOW_paramList_in_funcDecl5432 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_RPAREN_in_funcDecl5435 = new BitSet(new long[]{0x0000000008000000L,0x0000000000080000L,0x0000000000000004L});
    public static final BitSet FOLLOW_typeTag_in_funcDecl5437 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L,0x0000000000000004L});
    public static final BitSet FOLLOW_block_in_funcDecl5440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttrList_in_funcDecl5495 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_FUNCTION_in_funcDecl5498 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_IDENTIFIER_in_funcDecl5500 = new BitSet(new long[]{0x0000000000000000L,0x0000000001800000L});
    public static final BitSet FOLLOW_typeParamOpt_in_funcDecl5502 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_LPAREN_in_funcDecl5504 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000020L,0x0000000000000002L});
    public static final BitSet FOLLOW_paramList_in_funcDecl5506 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_RPAREN_in_funcDecl5509 = new BitSet(new long[]{0x0000000008000000L,0x0000000000080000L,0x0000000000000004L});
    public static final BitSet FOLLOW_typeTag_in_funcDecl5511 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L,0x0000000000000004L});
    public static final BitSet FOLLOW_block_in_funcDecl5514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttrList_in_funcProtoDecl5584 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_FUNCTION_in_funcProtoDecl5586 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_NEW_in_funcProtoDecl5588 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_LPAREN_in_funcProtoDecl5590 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000020L,0x0000000000000002L});
    public static final BitSet FOLLOW_paramList_in_funcProtoDecl5592 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_RPAREN_in_funcProtoDecl5595 = new BitSet(new long[]{0x0000000008000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_typeTag_in_funcProtoDecl5597 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_SEMI_in_funcProtoDecl5600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttrList_in_funcProtoDecl5641 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_FUNCTION_in_funcProtoDecl5643 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_IDENTIFIER_in_funcProtoDecl5645 = new BitSet(new long[]{0x0000000000000000L,0x0000000001800000L});
    public static final BitSet FOLLOW_typeParamOpt_in_funcProtoDecl5647 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_LPAREN_in_funcProtoDecl5649 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000020L,0x0000000000000002L});
    public static final BitSet FOLLOW_paramList_in_funcProtoDecl5651 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_RPAREN_in_funcProtoDecl5654 = new BitSet(new long[]{0x0000000008000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_typeTag_in_funcProtoDecl5656 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_SEMI_in_funcProtoDecl5659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_in_funcProtoDecl5703 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_NEW_in_funcProtoDecl5705 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_LPAREN_in_funcProtoDecl5707 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000020L,0x0000000000000002L});
    public static final BitSet FOLLOW_paramList_in_funcProtoDecl5709 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_RPAREN_in_funcProtoDecl5712 = new BitSet(new long[]{0x0000000008000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_typeTag_in_funcProtoDecl5714 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_SEMI_in_funcProtoDecl5717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_in_funcProtoDecl5755 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_IDENTIFIER_in_funcProtoDecl5757 = new BitSet(new long[]{0x0000000000000000L,0x0000000001800000L});
    public static final BitSet FOLLOW_typeParamOpt_in_funcProtoDecl5759 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_LPAREN_in_funcProtoDecl5761 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000020L,0x0000000000000002L});
    public static final BitSet FOLLOW_paramList_in_funcProtoDecl5763 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_RPAREN_in_funcProtoDecl5766 = new BitSet(new long[]{0x0000000008000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_typeTag_in_funcProtoDecl5768 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_SEMI_in_funcProtoDecl5771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_topLevelAccess_in_interfaceDecl5830 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_INTERFACE_in_interfaceDecl5833 = new BitSet(new long[]{0x0040802000010000L,0x0000000000084120L,0x0000000200000000L});
    public static final BitSet FOLLOW_type_in_interfaceDecl5835 = new BitSet(new long[]{0x0000800000000000L,0x0000000000080100L});
    public static final BitSet FOLLOW_inheritListOpt_in_interfaceDecl5837 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_LBRACE_in_interfaceDecl5839 = new BitSet(new long[]{0x0200002000000000L,0x5200001000001000L,0x0000000080000100L});
    public static final BitSet FOLLOW_interfaceBody_in_interfaceDecl5842 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_RBRACE_in_interfaceDecl5844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDecl_in_interfaceBody5868 = new BitSet(new long[]{0x0200002000000000L,0x1200001000001000L,0x0000000080000100L});
    public static final BitSet FOLLOW_interfaceBody_in_interfaceBody5870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcProtoDecl_in_interfaceBody5880 = new BitSet(new long[]{0x0200002000000000L,0x1200001000001000L,0x0000000080000100L});
    public static final BitSet FOLLOW_interfaceBody_in_interfaceBody5882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inherit_in_inheritList5916 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_COMMA_in_inheritList5919 = new BitSet(new long[]{0x0000800000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_inherit_in_inheritList5922 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_inheritList_in_inheritListOpt5952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXTENDS_in_inherit5998 = new BitSet(new long[]{0x0040002000010000L,0x0000000000084020L,0x0000000200000000L});
    public static final BitSet FOLLOW_type_in_inherit6000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IMPLEMENTS_in_inherit6028 = new BitSet(new long[]{0x0040002000010000L,0x0000000000084020L,0x0000000200000000L});
    public static final BitSet FOLLOW_type_in_inherit6030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPEDEF_in_typedefDecl6070 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_IDENTIFIER_in_typedefDecl6072 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_EQ_in_typedefDecl6074 = new BitSet(new long[]{0x0040002000010000L,0x0000000020084020L,0x0000000200000000L});
    public static final BitSet FOLLOW_funcType_in_typedefDecl6076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GT_in_typeExtend6100 = new BitSet(new long[]{0x0040002000010000L,0x0000000020084020L,0x0000000200000000L});
    public static final BitSet FOLLOW_funcType_in_typeExtend6102 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_COMMA_in_typeExtend6104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_anonType6128 = new BitSet(new long[]{0x0800000000000000L,0x4000000000000020L,0x0000000080000000L});
    public static final BitSet FOLLOW_anonTypeFieldList_in_anonType6162 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_varDeclList_in_anonType6181 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_typeExtend_in_anonType6200 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000020L,0x0000000080000000L});
    public static final BitSet FOLLOW_anonTypeFieldList_in_anonType6232 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_varDeclList_in_anonType6262 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_RBRACE_in_anonType6289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_anonTypeField_in_anonTypeFieldList6315 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_COMMA_in_anonTypeFieldList6318 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_anonTypeField_in_anonTypeFieldList6321 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_LBRACE_in_objLit6337 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_objLitElemList_in_objLit6340 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_RBRACE_in_objLit6342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_anonTypeField6367 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_COLON_in_anonTypeField6369 = new BitSet(new long[]{0x0040002000010000L,0x0000000020084020L,0x0000000200000000L});
    public static final BitSet FOLLOW_funcType_in_anonTypeField6372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objLitElem_in_objLitElemList6400 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_COMMA_in_objLitElemList6403 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_objLitElem_in_objLitElemList6406 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_objLitElem6432 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_COLON_in_objLitElem6434 = new BitSet(new long[]{0x0288000002400200L,0x0000080600D90020L,0x0000000020522C00L});
    public static final BitSet FOLLOW_expr_in_objLitElem6437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LONGLITERAL_in_elementarySymbol6460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_elementarySymbol6481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTLITERAL_in_elementarySymbol6501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRINGLITERAL_in_elementarySymbol6522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARLITERAL_in_elementarySymbol6543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOATNUM_in_elementarySymbol6564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_elementarySymbol6585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_elementarySymbol6610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeParam_in_synpred49_Haxe1714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_anonType_in_synpred50_Haxe1698 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_synpred50_Haxe1703 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_primitiveType_in_synpred50_Haxe1708 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_typeParam_in_synpred50_Haxe1714 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_typeParam_in_synpred52_Haxe1824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_synpred56_Haxe1986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignExpr_in_synpred57_Haxe1997 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_SEMI_in_synpred57_Haxe1999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_synpred59_Haxe2042 = new BitSet(new long[]{0x0388000482420200L,0x0000080600D90060L,0x00000008A0D72C05L});
    public static final BitSet FOLLOW_statement_in_synpred59_Haxe2045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_synpred75_Haxe2388 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_SEMI_in_synpred75_Haxe2391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_synpred76_Haxe2403 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_COLON_in_synpred76_Haxe2405 = new BitSet(new long[]{0x0388000482420200L,0x0000080600D90060L,0x00000008A0D72C05L});
    public static final BitSet FOLLOW_statement_in_synpred76_Haxe2407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDecl_in_synpred79_Haxe2573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_psExpr_in_synpred111_Haxe3933 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_PLUSPLUS_in_synpred111_Haxe3935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_psExpr_in_synpred112_Haxe3992 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_SUBSUB_in_synpred112_Haxe3994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_methodCallOrSlice_in_synpred114_Haxe4108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_synpred117_Haxe4157 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_LPAREN_in_synpred117_Haxe4159 = new BitSet(new long[]{0x0288000002400200L,0x0000080600D90020L,0x0000000020522C02L});
    public static final BitSet FOLLOW_exprList_in_synpred117_Haxe4161 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_RPAREN_in_synpred117_Haxe4164 = new BitSet(new long[]{0x0000000800000002L,0x0000000000900000L});
    public static final BitSet FOLLOW_pureCallOrSlice_in_synpred117_Haxe4166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_synpred119_Haxe4218 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_LBRACKET_in_synpred119_Haxe4220 = new BitSet(new long[]{0x0288000002400200L,0x0000080600D90020L,0x0000000020522C00L});
    public static final BitSet FOLLOW_expr_in_synpred119_Haxe4222 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_RBRACKET_in_synpred119_Haxe4224 = new BitSet(new long[]{0x0000000800000002L,0x0000000000900000L});
    public static final BitSet FOLLOW_pureCallOrSlice_in_synpred119_Haxe4226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_synpred130_Haxe4454 = new BitSet(new long[]{0x0000000000000002L});

}