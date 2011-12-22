// $ANTLR 3.4 Haxe.g 2011-12-22 23:17:06

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
        this.state.ruleMemo = new HashMap[268+1];
         

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
            // elements: varInit, QUES, typeTag
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
                else if ( (LA16_1==EOF||(LA16_1 >= AMP && LA16_1 <= AMPEQ)||LA16_1==BANGEQ||(LA16_1 >= BAR && LA16_1 <= BAREQ)||(LA16_1 >= CARET && LA16_1 <= CARETEQ)||(LA16_1 >= CLASS && LA16_1 <= COMMA)||LA16_1==ELLIPSIS||(LA16_1 >= ENUM && LA16_1 <= EQEQ)||(LA16_1 >= EXTENDS && LA16_1 <= EXTERN)||(LA16_1 >= GT && LA16_1 <= GTGTGTEQ)||(LA16_1 >= IMPLEMENTS && LA16_1 <= IN)||LA16_1==INTERFACE||(LA16_1 >= LBRACE && LA16_1 <= LBRACKET)||(LA16_1 >= LPAREN && LA16_1 <= LTLTEQ)||LA16_1==MINUS_BIGGER||(LA16_1 >= PERCENT && LA16_1 <= PLUSPLUS)||LA16_1==PRIVATE||(LA16_1 >= QUES && LA16_1 <= RBRACKET)||(LA16_1 >= RPAREN && LA16_1 <= SEMI)||(LA16_1 >= SLASH && LA16_1 <= STAREQ)||(LA16_1 >= SUB && LA16_1 <= SUBSUB)||LA16_1==TYPEDEF||LA16_1==USING) ) {
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
                else if ( (LA16_2==EOF||(LA16_2 >= AMP && LA16_2 <= AMPEQ)||LA16_2==BANGEQ||(LA16_2 >= BAR && LA16_2 <= BAREQ)||(LA16_2 >= CARET && LA16_2 <= CARETEQ)||(LA16_2 >= CLASS && LA16_2 <= COMMA)||LA16_2==ELLIPSIS||(LA16_2 >= ENUM && LA16_2 <= EQEQ)||(LA16_2 >= EXTENDS && LA16_2 <= EXTERN)||(LA16_2 >= GT && LA16_2 <= GTGTGTEQ)||(LA16_2 >= IMPLEMENTS && LA16_2 <= IN)||LA16_2==INTERFACE||(LA16_2 >= LBRACE && LA16_2 <= LBRACKET)||(LA16_2 >= LPAREN && LA16_2 <= LTLTEQ)||LA16_2==MINUS_BIGGER||(LA16_2 >= PERCENT && LA16_2 <= PLUSPLUS)||LA16_2==PRIVATE||(LA16_2 >= QUES && LA16_2 <= RBRACKET)||(LA16_2 >= RPAREN && LA16_2 <= SEMI)||(LA16_2 >= SLASH && LA16_2 <= STAREQ)||(LA16_2 >= SUB && LA16_2 <= SUBSUB)||LA16_2==TYPEDEF||LA16_2==USING) ) {
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
                    // elements: id, DOT, a
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

            if ( (LA20_0==BANG||LA20_0==CAST||LA20_0==CHARLITERAL||LA20_0==FALSE||LA20_0==FLOATNUM||LA20_0==FUNCTION||LA20_0==IDENTIFIER||LA20_0==INTLITERAL||LA20_0==LBRACE||(LA20_0 >= LONGLITERAL && LA20_0 <= LPAREN)||(LA20_0 >= NEW && LA20_0 <= NULL)||LA20_0==PLUS||LA20_0==PLUSPLUS||(LA20_0 >= STRINGLITERAL && LA20_0 <= SUB)||LA20_0==SUBSUB||LA20_0==THIS||LA20_0==TILDE||LA20_0==TRUE||LA20_0==UNTYPED) ) {
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

            if ( (LA23_0==EOF||LA23_0==BOOLEAN||LA23_0==COMMA||LA23_0==DYNAMIC||LA23_0==FLOAT||LA23_0==GT||LA23_0==INT||LA23_0==LBRACE||LA23_0==LT||LA23_0==MINUS_BIGGER||LA23_0==RPAREN||LA23_0==THIS||LA23_0==VOID) ) {
                alt23=1;
            }
            else if ( (LA23_0==IDENTIFIER) ) {
                int LA23_2 = input.LA(2);

                if ( (LA23_2==COLON) ) {
                    alt23=2;
                }
                else if ( (LA23_2==EOF||LA23_2==COMMA||LA23_2==DOT||LA23_2==GT||LA23_2==LT||LA23_2==MINUS_BIGGER||LA23_2==RPAREN) ) {
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
    // Haxe.g:190:1: type : ( ( anonType ^| dotIdent ^| primitiveType ^) ( typeParam )* |);
    public final HaxeParser.type_return type() throws RecognitionException {
        HaxeParser.type_return retval = new HaxeParser.type_return();
        retval.start = input.LT(1);

        int type_StartIndex = input.index();

        Object root_0 = null;

        HaxeParser.anonType_return anonType78 =null;

        HaxeParser.dotIdent_return dotIdent79 =null;

        HaxeParser.primitiveType_return primitiveType80 =null;

        HaxeParser.typeParam_return typeParam81 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return retval; }

            // Haxe.g:190:9: ( ( anonType ^| dotIdent ^| primitiveType ^) ( typeParam )* |)
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
                    // Haxe.g:190:14: ( anonType ^| dotIdent ^| primitiveType ^) ( typeParam )*
                    {
                    root_0 = (Object)adaptor.nil();


                    // Haxe.g:190:14: ( anonType ^| dotIdent ^| primitiveType ^)
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
                            // Haxe.g:190:27: dotIdent ^
                            {
                            pushFollow(FOLLOW_dotIdent_in_type1703);
                            dotIdent79=dotIdent();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(dotIdent79.getTree(), root_0);

                            }
                            break;
                        case 3 :
                            // Haxe.g:190:39: primitiveType ^
                            {
                            pushFollow(FOLLOW_primitiveType_in_type1708);
                            primitiveType80=primitiveType();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(primitiveType80.getTree(), root_0);

                            }
                            break;

                    }


                    // Haxe.g:190:56: ( typeParam )*
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
                    	    // Haxe.g:190:57: typeParam
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
            else if ( (LA29_0==EOF||(LA29_0 >= AMP && LA29_0 <= AMPEQ)||LA29_0==BANGEQ||(LA29_0 >= BAR && LA29_0 <= BAREQ)||(LA29_0 >= CARET && LA29_0 <= CARETEQ)||(LA29_0 >= COLON && LA29_0 <= COMMA)||LA29_0==ELLIPSIS||(LA29_0 >= EQ && LA29_0 <= EQEQ)||LA29_0==EXTENDS||(LA29_0 >= GT && LA29_0 <= GTGTGTEQ)||LA29_0==IMPLEMENTS||LA29_0==IN||(LA29_0 >= LBRACE && LA29_0 <= LBRACKET)||LA29_0==LPAREN||(LA29_0 >= LTEQ && LA29_0 <= LTLTEQ)||(LA29_0 >= PERCENT && LA29_0 <= PLUSPLUS)||(LA29_0 >= QUES && LA29_0 <= RBRACKET)||(LA29_0 >= RPAREN && LA29_0 <= SEMI)||(LA29_0 >= SLASH && LA29_0 <= STAREQ)||(LA29_0 >= SUB && LA29_0 <= SUBSUB)) ) {
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
            // elements: typeTag, declAttrList, NEW, FUNCTION, block, paramList
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
            case BANG:
            case PLUS:
            case PLUSPLUS:
            case SUB:
            case SUBSUB:
            case TILDE:
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
            case NEW:
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
            case CAST:
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
            case FUNCTION:
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
            case LONGLITERAL:
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
            case NULL:
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
            case INTLITERAL:
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
            case STRINGLITERAL:
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
            case CHARLITERAL:
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
            case FLOATNUM:
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
            case TRUE:
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
            case FALSE:
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
            case LPAREN:
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
            case IDENTIFIER:
                {
                int LA39_16 = input.LA(2);

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
                        new NoViableAltException("", 39, 16, input);

                    throw nvae;

                }
                }
                break;
            case THIS:
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
            case DYNAMIC:
            case INLINE:
            case OVERRIDE:
            case PRIVATE:
            case PUBLIC:
            case STATIC:
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
                    // elements: exp1, exp2, statement, IN, FOR
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

                    if ( (LA36_0==BANG||LA36_0==CAST||LA36_0==CHARLITERAL||LA36_0==FALSE||LA36_0==FLOATNUM||LA36_0==FUNCTION||LA36_0==IDENTIFIER||LA36_0==INTLITERAL||LA36_0==LBRACE||(LA36_0 >= LONGLITERAL && LA36_0 <= LPAREN)||(LA36_0 >= NEW && LA36_0 <= NULL)||LA36_0==PLUS||LA36_0==PLUSPLUS||(LA36_0 >= STRINGLITERAL && LA36_0 <= SUB)||LA36_0==SUBSUB||LA36_0==THIS||LA36_0==TILDE||LA36_0==TRUE||LA36_0==UNTYPED) ) {
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

                        if ( (LA40_0==BANG||LA40_0==BREAK||LA40_0==CAST||(LA40_0 >= CHARLITERAL && LA40_0 <= CLASS)||LA40_0==CONTINUE||LA40_0==DO||LA40_0==DYNAMIC||LA40_0==EXTERN||LA40_0==FALSE||(LA40_0 >= FLOATNUM && LA40_0 <= FUNCTION)||(LA40_0 >= IDENTIFIER && LA40_0 <= IF)||LA40_0==INLINE||LA40_0==INTLITERAL||LA40_0==LBRACE||(LA40_0 >= LONGLITERAL && LA40_0 <= LPAREN)||(LA40_0 >= NEW && LA40_0 <= NULL)||LA40_0==OVERRIDE||LA40_0==PLUS||LA40_0==PLUSPLUS||LA40_0==PRIVATE||LA40_0==PUBLIC||LA40_0==RETURN||LA40_0==SEMI||LA40_0==STATIC||(LA40_0 >= STRINGLITERAL && LA40_0 <= SUB)||LA40_0==SUBSUB||(LA40_0 >= SWITCH && LA40_0 <= THROW)||LA40_0==TILDE||(LA40_0 >= TRUE && LA40_0 <= TRY)||LA40_0==UNTYPED||LA40_0==VAR||LA40_0==WHILE) ) {
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
            case STATIC:
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
            case INLINE:
                {
                int LA42_2 = input.LA(2);

                if ( (synpred79_Haxe()) ) {
                    alt42=1;
                }
                else if ( (true) ) {
                    alt42=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 42, 2, input);

                    throw nvae;

                }
                }
                break;
            case DYNAMIC:
                {
                int LA42_3 = input.LA(2);

                if ( (synpred79_Haxe()) ) {
                    alt42=1;
                }
                else if ( (true) ) {
                    alt42=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 42, 3, input);

                    throw nvae;

                }
                }
                break;
            case OVERRIDE:
                {
                int LA42_4 = input.LA(2);

                if ( (synpred79_Haxe()) ) {
                    alt42=1;
                }
                else if ( (true) ) {
                    alt42=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 42, 4, input);

                    throw nvae;

                }
                }
                break;
            case PRIVATE:
                {
                int LA42_5 = input.LA(2);

                if ( (synpred79_Haxe()) ) {
                    alt42=1;
                }
                else if ( (synpred80_Haxe()) ) {
                    alt42=2;
                }
                else if ( (true) ) {
                    alt42=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 42, 5, input);

                    throw nvae;

                }
                }
                break;
            case VAR:
                {
                int LA42_6 = input.LA(2);

                if ( (synpred79_Haxe()) ) {
                    alt42=1;
                }
                else if ( (true) ) {
                    alt42=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 42, 6, input);

                    throw nvae;

                }
                }
                break;
            case PUBLIC:
                {
                int LA42_7 = input.LA(2);

                if ( (synpred79_Haxe()) ) {
                    alt42=1;
                }
                else if ( (true) ) {
                    alt42=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 42, 7, input);

                    throw nvae;

                }
                }
                break;
            case CLASS:
            case EXTERN:
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

            if ( (LA45_0==BANG||LA45_0==CAST||LA45_0==CHARLITERAL||LA45_0==FALSE||LA45_0==FLOATNUM||LA45_0==FUNCTION||LA45_0==IDENTIFIER||LA45_0==INTLITERAL||LA45_0==LBRACE||(LA45_0 >= LONGLITERAL && LA45_0 <= LPAREN)||(LA45_0 >= NEW && LA45_0 <= NULL)||LA45_0==PLUS||LA45_0==PLUSPLUS||(LA45_0 >= STRINGLITERAL && LA45_0 <= SUB)||LA45_0==SUBSUB||LA45_0==THIS||LA45_0==TILDE||LA45_0==TRUE) ) {
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
    // Haxe.g:314:1: multExpr : psExpr ( ( STAR ^| SLASH ^| PERCENT ^) psExpr )* ;
    public final HaxeParser.multExpr_return multExpr() throws RecognitionException {
        HaxeParser.multExpr_return retval = new HaxeParser.multExpr_return();
        retval.start = input.LT(1);

        int multExpr_StartIndex = input.index();

        Object root_0 = null;

        Token STAR222=null;
        Token SLASH223=null;
        Token PERCENT224=null;
        HaxeParser.psExpr_return psExpr221 =null;

        HaxeParser.psExpr_return psExpr225 =null;


        Object STAR222_tree=null;
        Object SLASH223_tree=null;
        Object PERCENT224_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 47) ) { return retval; }

            // Haxe.g:314:17: ( psExpr ( ( STAR ^| SLASH ^| PERCENT ^) psExpr )* )
            // Haxe.g:314:19: psExpr ( ( STAR ^| SLASH ^| PERCENT ^) psExpr )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_psExpr_in_multExpr3690);
            psExpr221=psExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, psExpr221.getTree());

            // Haxe.g:314:26: ( ( STAR ^| SLASH ^| PERCENT ^) psExpr )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==PERCENT||LA60_0==SLASH||LA60_0==STAR) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // Haxe.g:314:27: ( STAR ^| SLASH ^| PERCENT ^) psExpr
            	    {
            	    // Haxe.g:314:27: ( STAR ^| SLASH ^| PERCENT ^)
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


            	    pushFollow(FOLLOW_psExpr_in_multExpr3782);
            	    psExpr225=psExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, psExpr225.getTree());

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


    public static class psExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "psExpr"
    // Haxe.g:320:1: psExpr : ( prefixExpr | suffixExpr | value );
    public final HaxeParser.psExpr_return psExpr() throws RecognitionException {
        HaxeParser.psExpr_return retval = new HaxeParser.psExpr_return();
        retval.start = input.LT(1);

        int psExpr_StartIndex = input.index();

        Object root_0 = null;

        HaxeParser.prefixExpr_return prefixExpr226 =null;

        HaxeParser.suffixExpr_return suffixExpr227 =null;

        HaxeParser.value_return value228 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 48) ) { return retval; }

            // Haxe.g:321:5: ( prefixExpr | suffixExpr | value )
            int alt61=3;
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
                alt61=1;
                }
                break;
            case LBRACE:
                {
                int LA61_5 = input.LA(2);

                if ( (synpred107_Haxe()) ) {
                    alt61=2;
                }
                else if ( (true) ) {
                    alt61=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 61, 5, input);

                    throw nvae;

                }
                }
                break;
            case LONGLITERAL:
                {
                int LA61_6 = input.LA(2);

                if ( (synpred107_Haxe()) ) {
                    alt61=2;
                }
                else if ( (true) ) {
                    alt61=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 61, 6, input);

                    throw nvae;

                }
                }
                break;
            case NULL:
                {
                int LA61_7 = input.LA(2);

                if ( (synpred107_Haxe()) ) {
                    alt61=2;
                }
                else if ( (true) ) {
                    alt61=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 61, 7, input);

                    throw nvae;

                }
                }
                break;
            case INTLITERAL:
                {
                int LA61_8 = input.LA(2);

                if ( (synpred107_Haxe()) ) {
                    alt61=2;
                }
                else if ( (true) ) {
                    alt61=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 61, 8, input);

                    throw nvae;

                }
                }
                break;
            case STRINGLITERAL:
                {
                int LA61_9 = input.LA(2);

                if ( (synpred107_Haxe()) ) {
                    alt61=2;
                }
                else if ( (true) ) {
                    alt61=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 61, 9, input);

                    throw nvae;

                }
                }
                break;
            case CHARLITERAL:
                {
                int LA61_10 = input.LA(2);

                if ( (synpred107_Haxe()) ) {
                    alt61=2;
                }
                else if ( (true) ) {
                    alt61=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 61, 10, input);

                    throw nvae;

                }
                }
                break;
            case FLOATNUM:
                {
                int LA61_11 = input.LA(2);

                if ( (synpred107_Haxe()) ) {
                    alt61=2;
                }
                else if ( (true) ) {
                    alt61=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 61, 11, input);

                    throw nvae;

                }
                }
                break;
            case TRUE:
                {
                int LA61_12 = input.LA(2);

                if ( (synpred107_Haxe()) ) {
                    alt61=2;
                }
                else if ( (true) ) {
                    alt61=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 61, 12, input);

                    throw nvae;

                }
                }
                break;
            case FALSE:
                {
                int LA61_13 = input.LA(2);

                if ( (synpred107_Haxe()) ) {
                    alt61=2;
                }
                else if ( (true) ) {
                    alt61=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 61, 13, input);

                    throw nvae;

                }
                }
                break;
            case LPAREN:
                {
                int LA61_14 = input.LA(2);

                if ( (synpred107_Haxe()) ) {
                    alt61=2;
                }
                else if ( (true) ) {
                    alt61=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 61, 14, input);

                    throw nvae;

                }
                }
                break;
            case IDENTIFIER:
                {
                int LA61_15 = input.LA(2);

                if ( (synpred107_Haxe()) ) {
                    alt61=2;
                }
                else if ( (true) ) {
                    alt61=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 61, 15, input);

                    throw nvae;

                }
                }
                break;
            case THIS:
                {
                int LA61_16 = input.LA(2);

                if ( (synpred107_Haxe()) ) {
                    alt61=2;
                }
                else if ( (true) ) {
                    alt61=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 61, 16, input);

                    throw nvae;

                }
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
                    // Haxe.g:321:10: prefixExpr
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_prefixExpr_in_psExpr3824);
                    prefixExpr226=prefixExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, prefixExpr226.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:322:10: suffixExpr
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_suffixExpr_in_psExpr3835);
                    suffixExpr227=suffixExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, suffixExpr227.getTree());

                    }
                    break;
                case 3 :
                    // Haxe.g:323:10: value
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_value_in_psExpr3846);
                    value228=value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, value228.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
            if ( state.backtracking>0 ) { memoize(input, 48, psExpr_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "psExpr"


    public static class prefixExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "prefixExpr"
    // Haxe.g:326:1: prefixExpr : ( ( SUB | SUBSUB | PLUS | PLUSPLUS | BANG | TILDE ) ^ value | newExpr | cast | funcLit );
    public final HaxeParser.prefixExpr_return prefixExpr() throws RecognitionException {
        HaxeParser.prefixExpr_return retval = new HaxeParser.prefixExpr_return();
        retval.start = input.LT(1);

        int prefixExpr_StartIndex = input.index();

        Object root_0 = null;

        Token set229=null;
        HaxeParser.value_return value230 =null;

        HaxeParser.newExpr_return newExpr231 =null;

        HaxeParser.cast_return cast232 =null;

        HaxeParser.funcLit_return funcLit233 =null;


        Object set229_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 49) ) { return retval; }

            // Haxe.g:327:5: ( ( SUB | SUBSUB | PLUS | PLUSPLUS | BANG | TILDE ) ^ value | newExpr | cast | funcLit )
            int alt62=4;
            switch ( input.LA(1) ) {
            case BANG:
            case PLUS:
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
                alt62=2;
                }
                break;
            case CAST:
                {
                alt62=3;
                }
                break;
            case FUNCTION:
                {
                alt62=4;
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
                    // Haxe.g:327:10: ( SUB | SUBSUB | PLUS | PLUSPLUS | BANG | TILDE ) ^ value
                    {
                    root_0 = (Object)adaptor.nil();


                    set229=(Token)input.LT(1);

                    set229=(Token)input.LT(1);

                    if ( input.LA(1)==BANG||input.LA(1)==PLUS||input.LA(1)==PLUSPLUS||input.LA(1)==SUB||input.LA(1)==SUBSUB||input.LA(1)==TILDE ) {
                        input.consume();
                        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(set229)
                        , root_0);
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    pushFollow(FOLLOW_value_in_prefixExpr3885);
                    value230=value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, value230.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:328:10: newExpr
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_newExpr_in_prefixExpr3896);
                    newExpr231=newExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, newExpr231.getTree());

                    }
                    break;
                case 3 :
                    // Haxe.g:329:10: cast
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_cast_in_prefixExpr3907);
                    cast232=cast();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, cast232.getTree());

                    }
                    break;
                case 4 :
                    // Haxe.g:330:10: funcLit
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_funcLit_in_prefixExpr3926);
                    funcLit233=funcLit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, funcLit233.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
            if ( state.backtracking>0 ) { memoize(input, 49, prefixExpr_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "prefixExpr"


    public static class suffixExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "suffixExpr"
    // Haxe.g:333:1: suffixExpr : ( value methodCallOrSliceList -> ^( SUFFIX_EXPR[\"CallOrSlice\"] ( value )? ( methodCallOrSliceList )? ) | value PLUSPLUS -> ^( SUFFIX_EXPR[\"SUFFIX_EXPR\"] ( value )? ( PLUSPLUS )? ) | value SUBSUB -> ^( SUFFIX_EXPR[\"SUFFIX_EXPR\"] ( value )? SUBSUB ) );
    public final HaxeParser.suffixExpr_return suffixExpr() throws RecognitionException {
        HaxeParser.suffixExpr_return retval = new HaxeParser.suffixExpr_return();
        retval.start = input.LT(1);

        int suffixExpr_StartIndex = input.index();

        Object root_0 = null;

        Token PLUSPLUS237=null;
        Token SUBSUB239=null;
        HaxeParser.value_return value234 =null;

        HaxeParser.methodCallOrSliceList_return methodCallOrSliceList235 =null;

        HaxeParser.value_return value236 =null;

        HaxeParser.value_return value238 =null;


        Object PLUSPLUS237_tree=null;
        Object SUBSUB239_tree=null;
        RewriteRuleTokenStream stream_SUBSUB=new RewriteRuleTokenStream(adaptor,"token SUBSUB");
        RewriteRuleTokenStream stream_PLUSPLUS=new RewriteRuleTokenStream(adaptor,"token PLUSPLUS");
        RewriteRuleSubtreeStream stream_methodCallOrSliceList=new RewriteRuleSubtreeStream(adaptor,"rule methodCallOrSliceList");
        RewriteRuleSubtreeStream stream_value=new RewriteRuleSubtreeStream(adaptor,"rule value");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 50) ) { return retval; }

            // Haxe.g:334:5: ( value methodCallOrSliceList -> ^( SUFFIX_EXPR[\"CallOrSlice\"] ( value )? ( methodCallOrSliceList )? ) | value PLUSPLUS -> ^( SUFFIX_EXPR[\"SUFFIX_EXPR\"] ( value )? ( PLUSPLUS )? ) | value SUBSUB -> ^( SUFFIX_EXPR[\"SUFFIX_EXPR\"] ( value )? SUBSUB ) )
            int alt63=3;
            switch ( input.LA(1) ) {
            case LBRACE:
                {
                int LA63_1 = input.LA(2);

                if ( (synpred116_Haxe()) ) {
                    alt63=1;
                }
                else if ( (synpred117_Haxe()) ) {
                    alt63=2;
                }
                else if ( (true) ) {
                    alt63=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 63, 1, input);

                    throw nvae;

                }
                }
                break;
            case LONGLITERAL:
                {
                int LA63_2 = input.LA(2);

                if ( (synpred116_Haxe()) ) {
                    alt63=1;
                }
                else if ( (synpred117_Haxe()) ) {
                    alt63=2;
                }
                else if ( (true) ) {
                    alt63=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 63, 2, input);

                    throw nvae;

                }
                }
                break;
            case NULL:
                {
                int LA63_3 = input.LA(2);

                if ( (synpred116_Haxe()) ) {
                    alt63=1;
                }
                else if ( (synpred117_Haxe()) ) {
                    alt63=2;
                }
                else if ( (true) ) {
                    alt63=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 63, 3, input);

                    throw nvae;

                }
                }
                break;
            case INTLITERAL:
                {
                int LA63_4 = input.LA(2);

                if ( (synpred116_Haxe()) ) {
                    alt63=1;
                }
                else if ( (synpred117_Haxe()) ) {
                    alt63=2;
                }
                else if ( (true) ) {
                    alt63=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 63, 4, input);

                    throw nvae;

                }
                }
                break;
            case STRINGLITERAL:
                {
                int LA63_5 = input.LA(2);

                if ( (synpred116_Haxe()) ) {
                    alt63=1;
                }
                else if ( (synpred117_Haxe()) ) {
                    alt63=2;
                }
                else if ( (true) ) {
                    alt63=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 63, 5, input);

                    throw nvae;

                }
                }
                break;
            case CHARLITERAL:
                {
                int LA63_6 = input.LA(2);

                if ( (synpred116_Haxe()) ) {
                    alt63=1;
                }
                else if ( (synpred117_Haxe()) ) {
                    alt63=2;
                }
                else if ( (true) ) {
                    alt63=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 63, 6, input);

                    throw nvae;

                }
                }
                break;
            case FLOATNUM:
                {
                int LA63_7 = input.LA(2);

                if ( (synpred116_Haxe()) ) {
                    alt63=1;
                }
                else if ( (synpred117_Haxe()) ) {
                    alt63=2;
                }
                else if ( (true) ) {
                    alt63=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 63, 7, input);

                    throw nvae;

                }
                }
                break;
            case TRUE:
                {
                int LA63_8 = input.LA(2);

                if ( (synpred116_Haxe()) ) {
                    alt63=1;
                }
                else if ( (synpred117_Haxe()) ) {
                    alt63=2;
                }
                else if ( (true) ) {
                    alt63=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 63, 8, input);

                    throw nvae;

                }
                }
                break;
            case FALSE:
                {
                int LA63_9 = input.LA(2);

                if ( (synpred116_Haxe()) ) {
                    alt63=1;
                }
                else if ( (synpred117_Haxe()) ) {
                    alt63=2;
                }
                else if ( (true) ) {
                    alt63=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 63, 9, input);

                    throw nvae;

                }
                }
                break;
            case LPAREN:
                {
                int LA63_10 = input.LA(2);

                if ( (synpred116_Haxe()) ) {
                    alt63=1;
                }
                else if ( (synpred117_Haxe()) ) {
                    alt63=2;
                }
                else if ( (true) ) {
                    alt63=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 63, 10, input);

                    throw nvae;

                }
                }
                break;
            case IDENTIFIER:
                {
                int LA63_11 = input.LA(2);

                if ( (synpred116_Haxe()) ) {
                    alt63=1;
                }
                else if ( (synpred117_Haxe()) ) {
                    alt63=2;
                }
                else if ( (true) ) {
                    alt63=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 63, 11, input);

                    throw nvae;

                }
                }
                break;
            case THIS:
                {
                int LA63_12 = input.LA(2);

                if ( (synpred116_Haxe()) ) {
                    alt63=1;
                }
                else if ( (synpred117_Haxe()) ) {
                    alt63=2;
                }
                else if ( (true) ) {
                    alt63=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 63, 12, input);

                    throw nvae;

                }
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
                    // Haxe.g:334:10: value methodCallOrSliceList
                    {
                    pushFollow(FOLLOW_value_in_suffixExpr3951);
                    value234=value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_value.add(value234.getTree());

                    pushFollow(FOLLOW_methodCallOrSliceList_in_suffixExpr3953);
                    methodCallOrSliceList235=methodCallOrSliceList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_methodCallOrSliceList.add(methodCallOrSliceList235.getTree());

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
                    // 334:38: -> ^( SUFFIX_EXPR[\"CallOrSlice\"] ( value )? ( methodCallOrSliceList )? )
                    {
                        // Haxe.g:334:41: ^( SUFFIX_EXPR[\"CallOrSlice\"] ( value )? ( methodCallOrSliceList )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        new HaxeTree(SUFFIX_EXPR, "CallOrSlice")
                        , root_1);

                        // Haxe.g:334:80: ( value )?
                        if ( stream_value.hasNext() ) {
                            adaptor.addChild(root_1, stream_value.nextTree());

                        }
                        stream_value.reset();

                        // Haxe.g:334:87: ( methodCallOrSliceList )?
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
                    // Haxe.g:335:10: value PLUSPLUS
                    {
                    pushFollow(FOLLOW_value_in_suffixExpr3980);
                    value236=value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_value.add(value236.getTree());

                    PLUSPLUS237=(Token)match(input,PLUSPLUS,FOLLOW_PLUSPLUS_in_suffixExpr3982); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PLUSPLUS.add(PLUSPLUS237);


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
                    // 335:38: -> ^( SUFFIX_EXPR[\"SUFFIX_EXPR\"] ( value )? ( PLUSPLUS )? )
                    {
                        // Haxe.g:335:41: ^( SUFFIX_EXPR[\"SUFFIX_EXPR\"] ( value )? ( PLUSPLUS )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        new HaxeTree(SUFFIX_EXPR, "SUFFIX_EXPR")
                        , root_1);

                        // Haxe.g:335:80: ( value )?
                        if ( stream_value.hasNext() ) {
                            adaptor.addChild(root_1, stream_value.nextTree());

                        }
                        stream_value.reset();

                        // Haxe.g:335:87: ( PLUSPLUS )?
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
                    // Haxe.g:336:10: value SUBSUB
                    {
                    pushFollow(FOLLOW_value_in_suffixExpr4022);
                    value238=value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_value.add(value238.getTree());

                    SUBSUB239=(Token)match(input,SUBSUB,FOLLOW_SUBSUB_in_suffixExpr4024); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SUBSUB.add(SUBSUB239);


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
                    // 336:38: -> ^( SUFFIX_EXPR[\"SUFFIX_EXPR\"] ( value )? SUBSUB )
                    {
                        // Haxe.g:336:41: ^( SUFFIX_EXPR[\"SUFFIX_EXPR\"] ( value )? SUBSUB )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        new HaxeTree(SUFFIX_EXPR, "SUFFIX_EXPR")
                        , root_1);

                        // Haxe.g:336:80: ( value )?
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
    // Haxe.g:339:1: methodCallOrSlice : ( LPAREN ( exprList )? RPAREN -> ^( SUFFIX_EXPR[\"MethodCall\"] LPAREN[$LPAREN] ( exprList )? RPAREN[$LPAREN] ) | LBRACKET expr RBRACKET -> ^( SUFFIX_EXPR[\"Slice\"] LBRACKET[$LBRACKET] ( expr )? RBRACKET[$RBRACKET] ) );
    public final HaxeParser.methodCallOrSlice_return methodCallOrSlice() throws RecognitionException {
        HaxeParser.methodCallOrSlice_return retval = new HaxeParser.methodCallOrSlice_return();
        retval.start = input.LT(1);

        int methodCallOrSlice_StartIndex = input.index();

        Object root_0 = null;

        Token LPAREN240=null;
        Token RPAREN242=null;
        Token LBRACKET243=null;
        Token RBRACKET245=null;
        HaxeParser.exprList_return exprList241 =null;

        HaxeParser.expr_return expr244 =null;


        Object LPAREN240_tree=null;
        Object RPAREN242_tree=null;
        Object LBRACKET243_tree=null;
        Object RBRACKET245_tree=null;
        RewriteRuleTokenStream stream_LBRACKET=new RewriteRuleTokenStream(adaptor,"token LBRACKET");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_RBRACKET=new RewriteRuleTokenStream(adaptor,"token RBRACKET");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_exprList=new RewriteRuleSubtreeStream(adaptor,"rule exprList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 51) ) { return retval; }

            // Haxe.g:340:5: ( LPAREN ( exprList )? RPAREN -> ^( SUFFIX_EXPR[\"MethodCall\"] LPAREN[$LPAREN] ( exprList )? RPAREN[$LPAREN] ) | LBRACKET expr RBRACKET -> ^( SUFFIX_EXPR[\"Slice\"] LBRACKET[$LBRACKET] ( expr )? RBRACKET[$RBRACKET] ) )
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==LPAREN) ) {
                alt65=1;
            }
            else if ( (LA65_0==LBRACKET) ) {
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
                    // Haxe.g:340:10: LPAREN ( exprList )? RPAREN
                    {
                    LPAREN240=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_methodCallOrSlice4074); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN240);


                    // Haxe.g:340:17: ( exprList )?
                    int alt64=2;
                    int LA64_0 = input.LA(1);

                    if ( (LA64_0==BANG||LA64_0==CAST||LA64_0==CHARLITERAL||LA64_0==FALSE||LA64_0==FLOATNUM||LA64_0==FUNCTION||LA64_0==IDENTIFIER||LA64_0==INTLITERAL||LA64_0==LBRACE||(LA64_0 >= LONGLITERAL && LA64_0 <= LPAREN)||(LA64_0 >= NEW && LA64_0 <= NULL)||LA64_0==PLUS||LA64_0==PLUSPLUS||(LA64_0 >= STRINGLITERAL && LA64_0 <= SUB)||LA64_0==SUBSUB||LA64_0==THIS||LA64_0==TILDE||LA64_0==TRUE||LA64_0==UNTYPED) ) {
                        alt64=1;
                    }
                    switch (alt64) {
                        case 1 :
                            // Haxe.g:340:17: exprList
                            {
                            pushFollow(FOLLOW_exprList_in_methodCallOrSlice4076);
                            exprList241=exprList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_exprList.add(exprList241.getTree());

                            }
                            break;

                    }


                    RPAREN242=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_methodCallOrSlice4079); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN242);


                    // AST REWRITE
                    // elements: RPAREN, exprList, LPAREN
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 340:34: -> ^( SUFFIX_EXPR[\"MethodCall\"] LPAREN[$LPAREN] ( exprList )? RPAREN[$LPAREN] )
                    {
                        // Haxe.g:340:37: ^( SUFFIX_EXPR[\"MethodCall\"] LPAREN[$LPAREN] ( exprList )? RPAREN[$LPAREN] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        new HaxeTree(SUFFIX_EXPR, "MethodCall")
                        , root_1);

                        adaptor.addChild(root_1, 
                        new HaxeTree(LPAREN, LPAREN240)
                        );

                        // Haxe.g:343:17: ( exprList )?
                        if ( stream_exprList.hasNext() ) {
                            adaptor.addChild(root_1, stream_exprList.nextTree());

                        }
                        stream_exprList.reset();

                        adaptor.addChild(root_1, 
                        new HaxeTree(RPAREN, LPAREN240)
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // Haxe.g:344:10: LBRACKET expr RBRACKET
                    {
                    LBRACKET243=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_methodCallOrSlice4166); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LBRACKET.add(LBRACKET243);


                    pushFollow(FOLLOW_expr_in_methodCallOrSlice4168);
                    expr244=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr244.getTree());

                    RBRACKET245=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_methodCallOrSlice4170); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RBRACKET.add(RBRACKET245);


                    // AST REWRITE
                    // elements: RBRACKET, expr, LBRACKET
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 344:33: -> ^( SUFFIX_EXPR[\"Slice\"] LBRACKET[$LBRACKET] ( expr )? RBRACKET[$RBRACKET] )
                    {
                        // Haxe.g:344:36: ^( SUFFIX_EXPR[\"Slice\"] LBRACKET[$LBRACKET] ( expr )? RBRACKET[$RBRACKET] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        new HaxeTree(SUFFIX_EXPR, "Slice")
                        , root_1);

                        adaptor.addChild(root_1, 
                        new HaxeTree(LBRACKET, LBRACKET243)
                        );

                        // Haxe.g:347:17: ( expr )?
                        if ( stream_expr.hasNext() ) {
                            adaptor.addChild(root_1, stream_expr.nextTree());

                        }
                        stream_expr.reset();

                        adaptor.addChild(root_1, 
                        new HaxeTree(RBRACKET, RBRACKET245)
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
            if ( state.backtracking>0 ) { memoize(input, 51, methodCallOrSlice_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "methodCallOrSlice"


    public static class methodCallOrSliceList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "methodCallOrSliceList"
    // Haxe.g:350:1: methodCallOrSliceList : ( methodCallOrSlice methodCallOrSliceList | methodCallOrSlice );
    public final HaxeParser.methodCallOrSliceList_return methodCallOrSliceList() throws RecognitionException {
        HaxeParser.methodCallOrSliceList_return retval = new HaxeParser.methodCallOrSliceList_return();
        retval.start = input.LT(1);

        int methodCallOrSliceList_StartIndex = input.index();

        Object root_0 = null;

        HaxeParser.methodCallOrSlice_return methodCallOrSlice246 =null;

        HaxeParser.methodCallOrSliceList_return methodCallOrSliceList247 =null;

        HaxeParser.methodCallOrSlice_return methodCallOrSlice248 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 52) ) { return retval; }

            // Haxe.g:351:5: ( methodCallOrSlice methodCallOrSliceList | methodCallOrSlice )
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==LPAREN) ) {
                int LA66_1 = input.LA(2);

                if ( (synpred120_Haxe()) ) {
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
            else if ( (LA66_0==LBRACKET) ) {
                int LA66_2 = input.LA(2);

                if ( (synpred120_Haxe()) ) {
                    alt66=1;
                }
                else if ( (true) ) {
                    alt66=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 66, 2, input);

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
                    // Haxe.g:351:10: methodCallOrSlice methodCallOrSliceList
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_methodCallOrSlice_in_methodCallOrSliceList4266);
                    methodCallOrSlice246=methodCallOrSlice();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, methodCallOrSlice246.getTree());

                    pushFollow(FOLLOW_methodCallOrSliceList_in_methodCallOrSliceList4268);
                    methodCallOrSliceList247=methodCallOrSliceList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, methodCallOrSliceList247.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:352:10: methodCallOrSlice
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_methodCallOrSlice_in_methodCallOrSliceList4279);
                    methodCallOrSlice248=methodCallOrSlice();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, methodCallOrSlice248.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
            if ( state.backtracking>0 ) { memoize(input, 52, methodCallOrSliceList_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "methodCallOrSliceList"


    public static class value_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "value"
    // Haxe.g:355:1: value : ( objLit | elementarySymbol | LPAREN ! ( expr | statement ) RPAREN !| dotIdent typeParamOpt );
    public final HaxeParser.value_return value() throws RecognitionException {
        HaxeParser.value_return retval = new HaxeParser.value_return();
        retval.start = input.LT(1);

        int value_StartIndex = input.index();

        Object root_0 = null;

        Token LPAREN251=null;
        Token RPAREN254=null;
        HaxeParser.objLit_return objLit249 =null;

        HaxeParser.elementarySymbol_return elementarySymbol250 =null;

        HaxeParser.expr_return expr252 =null;

        HaxeParser.statement_return statement253 =null;

        HaxeParser.dotIdent_return dotIdent255 =null;

        HaxeParser.typeParamOpt_return typeParamOpt256 =null;


        Object LPAREN251_tree=null;
        Object RPAREN254_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 53) ) { return retval; }

            // Haxe.g:358:5: ( objLit | elementarySymbol | LPAREN ! ( expr | statement ) RPAREN !| dotIdent typeParamOpt )
            int alt68=4;
            switch ( input.LA(1) ) {
            case LBRACE:
                {
                alt68=1;
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
                alt68=2;
                }
                break;
            case LPAREN:
                {
                alt68=3;
                }
                break;
            case IDENTIFIER:
            case THIS:
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
                    // Haxe.g:358:9: objLit
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_objLit_in_value4308);
                    objLit249=objLit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, objLit249.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:359:9: elementarySymbol
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_elementarySymbol_in_value4318);
                    elementarySymbol250=elementarySymbol();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, elementarySymbol250.getTree());

                    }
                    break;
                case 3 :
                    // Haxe.g:360:9: LPAREN ! ( expr | statement ) RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    LPAREN251=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_value4328); if (state.failed) return retval;

                    // Haxe.g:360:17: ( expr | statement )
                    int alt67=2;
                    switch ( input.LA(1) ) {
                    case BANG:
                    case PLUS:
                    case PLUSPLUS:
                    case SUB:
                    case SUBSUB:
                    case TILDE:
                        {
                        int LA67_1 = input.LA(2);

                        if ( (synpred123_Haxe()) ) {
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
                        break;
                    case NEW:
                        {
                        int LA67_2 = input.LA(2);

                        if ( (synpred123_Haxe()) ) {
                            alt67=1;
                        }
                        else if ( (true) ) {
                            alt67=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 67, 2, input);

                            throw nvae;

                        }
                        }
                        break;
                    case CAST:
                        {
                        int LA67_3 = input.LA(2);

                        if ( (synpred123_Haxe()) ) {
                            alt67=1;
                        }
                        else if ( (true) ) {
                            alt67=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 67, 3, input);

                            throw nvae;

                        }
                        }
                        break;
                    case FUNCTION:
                        {
                        int LA67_4 = input.LA(2);

                        if ( (synpred123_Haxe()) ) {
                            alt67=1;
                        }
                        else if ( (true) ) {
                            alt67=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 67, 4, input);

                            throw nvae;

                        }
                        }
                        break;
                    case LBRACE:
                        {
                        int LA67_5 = input.LA(2);

                        if ( (synpred123_Haxe()) ) {
                            alt67=1;
                        }
                        else if ( (true) ) {
                            alt67=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 67, 5, input);

                            throw nvae;

                        }
                        }
                        break;
                    case LONGLITERAL:
                        {
                        int LA67_6 = input.LA(2);

                        if ( (synpred123_Haxe()) ) {
                            alt67=1;
                        }
                        else if ( (true) ) {
                            alt67=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 67, 6, input);

                            throw nvae;

                        }
                        }
                        break;
                    case NULL:
                        {
                        int LA67_7 = input.LA(2);

                        if ( (synpred123_Haxe()) ) {
                            alt67=1;
                        }
                        else if ( (true) ) {
                            alt67=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 67, 7, input);

                            throw nvae;

                        }
                        }
                        break;
                    case INTLITERAL:
                        {
                        int LA67_8 = input.LA(2);

                        if ( (synpred123_Haxe()) ) {
                            alt67=1;
                        }
                        else if ( (true) ) {
                            alt67=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 67, 8, input);

                            throw nvae;

                        }
                        }
                        break;
                    case STRINGLITERAL:
                        {
                        int LA67_9 = input.LA(2);

                        if ( (synpred123_Haxe()) ) {
                            alt67=1;
                        }
                        else if ( (true) ) {
                            alt67=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 67, 9, input);

                            throw nvae;

                        }
                        }
                        break;
                    case CHARLITERAL:
                        {
                        int LA67_10 = input.LA(2);

                        if ( (synpred123_Haxe()) ) {
                            alt67=1;
                        }
                        else if ( (true) ) {
                            alt67=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 67, 10, input);

                            throw nvae;

                        }
                        }
                        break;
                    case FLOATNUM:
                        {
                        int LA67_11 = input.LA(2);

                        if ( (synpred123_Haxe()) ) {
                            alt67=1;
                        }
                        else if ( (true) ) {
                            alt67=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 67, 11, input);

                            throw nvae;

                        }
                        }
                        break;
                    case TRUE:
                        {
                        int LA67_12 = input.LA(2);

                        if ( (synpred123_Haxe()) ) {
                            alt67=1;
                        }
                        else if ( (true) ) {
                            alt67=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 67, 12, input);

                            throw nvae;

                        }
                        }
                        break;
                    case FALSE:
                        {
                        int LA67_13 = input.LA(2);

                        if ( (synpred123_Haxe()) ) {
                            alt67=1;
                        }
                        else if ( (true) ) {
                            alt67=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 67, 13, input);

                            throw nvae;

                        }
                        }
                        break;
                    case LPAREN:
                        {
                        int LA67_14 = input.LA(2);

                        if ( (synpred123_Haxe()) ) {
                            alt67=1;
                        }
                        else if ( (true) ) {
                            alt67=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 67, 14, input);

                            throw nvae;

                        }
                        }
                        break;
                    case IDENTIFIER:
                        {
                        int LA67_15 = input.LA(2);

                        if ( (synpred123_Haxe()) ) {
                            alt67=1;
                        }
                        else if ( (true) ) {
                            alt67=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 67, 15, input);

                            throw nvae;

                        }
                        }
                        break;
                    case THIS:
                        {
                        int LA67_16 = input.LA(2);

                        if ( (synpred123_Haxe()) ) {
                            alt67=1;
                        }
                        else if ( (true) ) {
                            alt67=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 67, 16, input);

                            throw nvae;

                        }
                        }
                        break;
                    case UNTYPED:
                        {
                        int LA67_17 = input.LA(2);

                        if ( (synpred123_Haxe()) ) {
                            alt67=1;
                        }
                        else if ( (true) ) {
                            alt67=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 67, 17, input);

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
                        alt67=2;
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
                            // Haxe.g:360:18: expr
                            {
                            pushFollow(FOLLOW_expr_in_value4332);
                            expr252=expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr252.getTree());

                            }
                            break;
                        case 2 :
                            // Haxe.g:360:23: statement
                            {
                            pushFollow(FOLLOW_statement_in_value4334);
                            statement253=statement();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, statement253.getTree());

                            }
                            break;

                    }


                    RPAREN254=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_value4337); if (state.failed) return retval;

                    }
                    break;
                case 4 :
                    // Haxe.g:361:9: dotIdent typeParamOpt
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_dotIdent_in_value4348);
                    dotIdent255=dotIdent();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dotIdent255.getTree());

                    pushFollow(FOLLOW_typeParamOpt_in_value4350);
                    typeParamOpt256=typeParamOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeParamOpt256.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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


    public static class newExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "newExpr"
    // Haxe.g:364:1: newExpr : NEW type LPAREN ( exprList )? RPAREN -> ^( NEW ( type )? ( exprList )? ) ;
    public final HaxeParser.newExpr_return newExpr() throws RecognitionException {
        HaxeParser.newExpr_return retval = new HaxeParser.newExpr_return();
        retval.start = input.LT(1);

        int newExpr_StartIndex = input.index();

        Object root_0 = null;

        Token NEW257=null;
        Token LPAREN259=null;
        Token RPAREN261=null;
        HaxeParser.type_return type258 =null;

        HaxeParser.exprList_return exprList260 =null;


        Object NEW257_tree=null;
        Object LPAREN259_tree=null;
        Object RPAREN261_tree=null;
        RewriteRuleTokenStream stream_NEW=new RewriteRuleTokenStream(adaptor,"token NEW");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        RewriteRuleSubtreeStream stream_exprList=new RewriteRuleSubtreeStream(adaptor,"rule exprList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 54) ) { return retval; }

            // Haxe.g:365:5: ( NEW type LPAREN ( exprList )? RPAREN -> ^( NEW ( type )? ( exprList )? ) )
            // Haxe.g:365:9: NEW type LPAREN ( exprList )? RPAREN
            {
            NEW257=(Token)match(input,NEW,FOLLOW_NEW_in_newExpr4380); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_NEW.add(NEW257);


            pushFollow(FOLLOW_type_in_newExpr4382);
            type258=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(type258.getTree());

            LPAREN259=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_newExpr4384); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN259);


            // Haxe.g:365:25: ( exprList )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==BANG||LA69_0==CAST||LA69_0==CHARLITERAL||LA69_0==FALSE||LA69_0==FLOATNUM||LA69_0==FUNCTION||LA69_0==IDENTIFIER||LA69_0==INTLITERAL||LA69_0==LBRACE||(LA69_0 >= LONGLITERAL && LA69_0 <= LPAREN)||(LA69_0 >= NEW && LA69_0 <= NULL)||LA69_0==PLUS||LA69_0==PLUSPLUS||(LA69_0 >= STRINGLITERAL && LA69_0 <= SUB)||LA69_0==SUBSUB||LA69_0==THIS||LA69_0==TILDE||LA69_0==TRUE||LA69_0==UNTYPED) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // Haxe.g:365:25: exprList
                    {
                    pushFollow(FOLLOW_exprList_in_newExpr4386);
                    exprList260=exprList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_exprList.add(exprList260.getTree());

                    }
                    break;

            }


            RPAREN261=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_newExpr4389); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN261);


            // AST REWRITE
            // elements: type, exprList, NEW
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 365:42: -> ^( NEW ( type )? ( exprList )? )
            {
                // Haxe.g:365:45: ^( NEW ( type )? ( exprList )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_NEW.nextNode()
                , root_1);

                // Haxe.g:365:51: ( type )?
                if ( stream_type.hasNext() ) {
                    adaptor.addChild(root_1, stream_type.nextTree());

                }
                stream_type.reset();

                // Haxe.g:365:57: ( exprList )?
                if ( stream_exprList.hasNext() ) {
                    adaptor.addChild(root_1, stream_exprList.nextTree());

                }
                stream_exprList.reset();

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
            if ( state.backtracking>0 ) { memoize(input, 54, newExpr_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "newExpr"


    public static class cast_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "cast"
    // Haxe.g:368:1: cast : ( CAST LPAREN expr ( COMMA funcType )? RPAREN -> ^( CAST ( expr )? ( funcType )? ) | CAST LPAREN expr RPAREN -> ^( CAST ( expr )? ) );
    public final HaxeParser.cast_return cast() throws RecognitionException {
        HaxeParser.cast_return retval = new HaxeParser.cast_return();
        retval.start = input.LT(1);

        int cast_StartIndex = input.index();

        Object root_0 = null;

        Token CAST262=null;
        Token LPAREN263=null;
        Token COMMA265=null;
        Token RPAREN267=null;
        Token CAST268=null;
        Token LPAREN269=null;
        Token RPAREN271=null;
        HaxeParser.expr_return expr264 =null;

        HaxeParser.funcType_return funcType266 =null;

        HaxeParser.expr_return expr270 =null;


        Object CAST262_tree=null;
        Object LPAREN263_tree=null;
        Object COMMA265_tree=null;
        Object RPAREN267_tree=null;
        Object CAST268_tree=null;
        Object LPAREN269_tree=null;
        Object RPAREN271_tree=null;
        RewriteRuleTokenStream stream_CAST=new RewriteRuleTokenStream(adaptor,"token CAST");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_funcType=new RewriteRuleSubtreeStream(adaptor,"rule funcType");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 55) ) { return retval; }

            // Haxe.g:369:5: ( CAST LPAREN expr ( COMMA funcType )? RPAREN -> ^( CAST ( expr )? ( funcType )? ) | CAST LPAREN expr RPAREN -> ^( CAST ( expr )? ) )
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==CAST) ) {
                int LA71_1 = input.LA(2);

                if ( (synpred127_Haxe()) ) {
                    alt71=1;
                }
                else if ( (true) ) {
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
                    // Haxe.g:369:9: CAST LPAREN expr ( COMMA funcType )? RPAREN
                    {
                    CAST262=(Token)match(input,CAST,FOLLOW_CAST_in_cast4424); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CAST.add(CAST262);


                    LPAREN263=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_cast4426); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN263);


                    pushFollow(FOLLOW_expr_in_cast4428);
                    expr264=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr264.getTree());

                    // Haxe.g:369:26: ( COMMA funcType )?
                    int alt70=2;
                    int LA70_0 = input.LA(1);

                    if ( (LA70_0==COMMA) ) {
                        alt70=1;
                    }
                    switch (alt70) {
                        case 1 :
                            // Haxe.g:369:27: COMMA funcType
                            {
                            COMMA265=(Token)match(input,COMMA,FOLLOW_COMMA_in_cast4431); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_COMMA.add(COMMA265);


                            pushFollow(FOLLOW_funcType_in_cast4433);
                            funcType266=funcType();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_funcType.add(funcType266.getTree());

                            }
                            break;

                    }


                    RPAREN267=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_cast4437); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN267);


                    // AST REWRITE
                    // elements: funcType, CAST, expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 369:53: -> ^( CAST ( expr )? ( funcType )? )
                    {
                        // Haxe.g:369:56: ^( CAST ( expr )? ( funcType )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_CAST.nextNode()
                        , root_1);

                        // Haxe.g:369:63: ( expr )?
                        if ( stream_expr.hasNext() ) {
                            adaptor.addChild(root_1, stream_expr.nextTree());

                        }
                        stream_expr.reset();

                        // Haxe.g:369:69: ( funcType )?
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
                    // Haxe.g:370:9: CAST LPAREN expr RPAREN
                    {
                    CAST268=(Token)match(input,CAST,FOLLOW_CAST_in_cast4461); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CAST.add(CAST268);


                    LPAREN269=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_cast4463); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN269);


                    pushFollow(FOLLOW_expr_in_cast4465);
                    expr270=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr270.getTree());

                    RPAREN271=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_cast4467); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN271);


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
                    // 370:53: -> ^( CAST ( expr )? )
                    {
                        // Haxe.g:370:56: ^( CAST ( expr )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_CAST.nextNode()
                        , root_1);

                        // Haxe.g:370:63: ( expr )?
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
            if ( state.backtracking>0 ) { memoize(input, 55, cast_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "cast"


    public static class topLevelDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "topLevelDecl"
    // Haxe.g:375:1: topLevelDecl : ( classDecl | interfaceDecl | enumDecl | typedefDecl );
    public final HaxeParser.topLevelDecl_return topLevelDecl() throws RecognitionException {
        HaxeParser.topLevelDecl_return retval = new HaxeParser.topLevelDecl_return();
        retval.start = input.LT(1);

        int topLevelDecl_StartIndex = input.index();

        Object root_0 = null;

        HaxeParser.classDecl_return classDecl272 =null;

        HaxeParser.interfaceDecl_return interfaceDecl273 =null;

        HaxeParser.enumDecl_return enumDecl274 =null;

        HaxeParser.typedefDecl_return typedefDecl275 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 56) ) { return retval; }

            // Haxe.g:375:17: ( classDecl | interfaceDecl | enumDecl | typedefDecl )
            int alt72=4;
            switch ( input.LA(1) ) {
            case EXTERN:
            case PRIVATE:
                {
                switch ( input.LA(2) ) {
                case CLASS:
                    {
                    alt72=1;
                    }
                    break;
                case INTERFACE:
                    {
                    alt72=2;
                    }
                    break;
                case ENUM:
                    {
                    alt72=3;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 72, 1, input);

                    throw nvae;

                }

                }
                break;
            case CLASS:
                {
                alt72=1;
                }
                break;
            case INTERFACE:
                {
                alt72=2;
                }
                break;
            case ENUM:
                {
                alt72=3;
                }
                break;
            case TYPEDEF:
                {
                alt72=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 72, 0, input);

                throw nvae;

            }

            switch (alt72) {
                case 1 :
                    // Haxe.g:375:19: classDecl
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_classDecl_in_topLevelDecl4515);
                    classDecl272=classDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, classDecl272.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:376:19: interfaceDecl
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_interfaceDecl_in_topLevelDecl4535);
                    interfaceDecl273=interfaceDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceDecl273.getTree());

                    }
                    break;
                case 3 :
                    // Haxe.g:377:19: enumDecl
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_enumDecl_in_topLevelDecl4555);
                    enumDecl274=enumDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, enumDecl274.getTree());

                    }
                    break;
                case 4 :
                    // Haxe.g:378:19: typedefDecl
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_typedefDecl_in_topLevelDecl4575);
                    typedefDecl275=typedefDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typedefDecl275.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
            if ( state.backtracking>0 ) { memoize(input, 56, topLevelDecl_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "topLevelDecl"


    public static class enumDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "enumDecl"
    // Haxe.g:381:1: enumDecl : ( topLevelAccess )? ENUM IDENTIFIER typeParamOpt enumBody -> ^( IDENTIFIER ( topLevelAccess )? ( typeParamOpt )? ( enumBody )? ) ;
    public final HaxeParser.enumDecl_return enumDecl() throws RecognitionException {
        HaxeParser.enumDecl_return retval = new HaxeParser.enumDecl_return();
        retval.start = input.LT(1);

        int enumDecl_StartIndex = input.index();

        Object root_0 = null;

        Token ENUM277=null;
        Token IDENTIFIER278=null;
        HaxeParser.topLevelAccess_return topLevelAccess276 =null;

        HaxeParser.typeParamOpt_return typeParamOpt279 =null;

        HaxeParser.enumBody_return enumBody280 =null;


        Object ENUM277_tree=null;
        Object IDENTIFIER278_tree=null;
        RewriteRuleTokenStream stream_ENUM=new RewriteRuleTokenStream(adaptor,"token ENUM");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleSubtreeStream stream_enumBody=new RewriteRuleSubtreeStream(adaptor,"rule enumBody");
        RewriteRuleSubtreeStream stream_typeParamOpt=new RewriteRuleSubtreeStream(adaptor,"rule typeParamOpt");
        RewriteRuleSubtreeStream stream_topLevelAccess=new RewriteRuleSubtreeStream(adaptor,"rule topLevelAccess");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 57) ) { return retval; }

            // Haxe.g:381:17: ( ( topLevelAccess )? ENUM IDENTIFIER typeParamOpt enumBody -> ^( IDENTIFIER ( topLevelAccess )? ( typeParamOpt )? ( enumBody )? ) )
            // Haxe.g:381:19: ( topLevelAccess )? ENUM IDENTIFIER typeParamOpt enumBody
            {
            // Haxe.g:381:19: ( topLevelAccess )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==EXTERN||LA73_0==PRIVATE) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // Haxe.g:381:19: topLevelAccess
                    {
                    pushFollow(FOLLOW_topLevelAccess_in_enumDecl4611);
                    topLevelAccess276=topLevelAccess();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_topLevelAccess.add(topLevelAccess276.getTree());

                    }
                    break;

            }


            ENUM277=(Token)match(input,ENUM,FOLLOW_ENUM_in_enumDecl4614); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ENUM.add(ENUM277);


            IDENTIFIER278=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_enumDecl4616); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER278);


            pushFollow(FOLLOW_typeParamOpt_in_enumDecl4618);
            typeParamOpt279=typeParamOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeParamOpt.add(typeParamOpt279.getTree());

            pushFollow(FOLLOW_enumBody_in_enumDecl4620);
            enumBody280=enumBody();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_enumBody.add(enumBody280.getTree());

            // AST REWRITE
            // elements: IDENTIFIER, topLevelAccess, enumBody, typeParamOpt
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 381:73: -> ^( IDENTIFIER ( topLevelAccess )? ( typeParamOpt )? ( enumBody )? )
            {
                // Haxe.g:381:76: ^( IDENTIFIER ( topLevelAccess )? ( typeParamOpt )? ( enumBody )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                new EnumNode(stream_IDENTIFIER.nextToken())
                , root_1);

                // Haxe.g:381:99: ( topLevelAccess )?
                if ( stream_topLevelAccess.hasNext() ) {
                    adaptor.addChild(root_1, stream_topLevelAccess.nextTree());

                }
                stream_topLevelAccess.reset();

                // Haxe.g:381:115: ( typeParamOpt )?
                if ( stream_typeParamOpt.hasNext() ) {
                    adaptor.addChild(root_1, stream_typeParamOpt.nextTree());

                }
                stream_typeParamOpt.reset();

                // Haxe.g:381:129: ( enumBody )?
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
            if ( state.backtracking>0 ) { memoize(input, 57, enumDecl_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "enumDecl"


    public static class enumBody_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "enumBody"
    // Haxe.g:384:1: enumBody : LBRACE ( enumValueDecl )* RBRACE -> ^( BLOCK_SCOPE[$LBRACE, $RBRACE] ( enumValueDecl )* ) ;
    public final HaxeParser.enumBody_return enumBody() throws RecognitionException {
        HaxeParser.enumBody_return retval = new HaxeParser.enumBody_return();
        retval.start = input.LT(1);

        int enumBody_StartIndex = input.index();

        Object root_0 = null;

        Token LBRACE281=null;
        Token RBRACE283=null;
        HaxeParser.enumValueDecl_return enumValueDecl282 =null;


        Object LBRACE281_tree=null;
        Object RBRACE283_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_enumValueDecl=new RewriteRuleSubtreeStream(adaptor,"rule enumValueDecl");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 58) ) { return retval; }

            // Haxe.g:384:17: ( LBRACE ( enumValueDecl )* RBRACE -> ^( BLOCK_SCOPE[$LBRACE, $RBRACE] ( enumValueDecl )* ) )
            // Haxe.g:384:19: LBRACE ( enumValueDecl )* RBRACE
            {
            LBRACE281=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_enumBody4670); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACE.add(LBRACE281);


            // Haxe.g:384:26: ( enumValueDecl )*
            loop74:
            do {
                int alt74=2;
                int LA74_0 = input.LA(1);

                if ( (LA74_0==IDENTIFIER) ) {
                    alt74=1;
                }


                switch (alt74) {
            	case 1 :
            	    // Haxe.g:384:27: enumValueDecl
            	    {
            	    pushFollow(FOLLOW_enumValueDecl_in_enumBody4673);
            	    enumValueDecl282=enumValueDecl();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_enumValueDecl.add(enumValueDecl282.getTree());

            	    }
            	    break;

            	default :
            	    break loop74;
                }
            } while (true);


            RBRACE283=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_enumBody4677); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACE.add(RBRACE283);


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
            // 384:50: -> ^( BLOCK_SCOPE[$LBRACE, $RBRACE] ( enumValueDecl )* )
            {
                // Haxe.g:384:53: ^( BLOCK_SCOPE[$LBRACE, $RBRACE] ( enumValueDecl )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                new BlockScopeNode(BLOCK_SCOPE, LBRACE281, RBRACE283)
                , root_1);

                // Haxe.g:384:101: ( enumValueDecl )*
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
            if ( state.backtracking>0 ) { memoize(input, 58, enumBody_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "enumBody"


    public static class enumValueDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "enumValueDecl"
    // Haxe.g:387:1: enumValueDecl : ( IDENTIFIER ^ LPAREN ! ( paramList )? RPAREN ! SEMI !| IDENTIFIER SEMI !);
    public final HaxeParser.enumValueDecl_return enumValueDecl() throws RecognitionException {
        HaxeParser.enumValueDecl_return retval = new HaxeParser.enumValueDecl_return();
        retval.start = input.LT(1);

        int enumValueDecl_StartIndex = input.index();

        Object root_0 = null;

        Token IDENTIFIER284=null;
        Token LPAREN285=null;
        Token RPAREN287=null;
        Token SEMI288=null;
        Token IDENTIFIER289=null;
        Token SEMI290=null;
        HaxeParser.paramList_return paramList286 =null;


        Object IDENTIFIER284_tree=null;
        Object LPAREN285_tree=null;
        Object RPAREN287_tree=null;
        Object SEMI288_tree=null;
        Object IDENTIFIER289_tree=null;
        Object SEMI290_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 59) ) { return retval; }

            // Haxe.g:387:17: ( IDENTIFIER ^ LPAREN ! ( paramList )? RPAREN ! SEMI !| IDENTIFIER SEMI !)
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==IDENTIFIER) ) {
                int LA76_1 = input.LA(2);

                if ( (LA76_1==LPAREN) ) {
                    alt76=1;
                }
                else if ( (LA76_1==SEMI) ) {
                    alt76=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 76, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 76, 0, input);

                throw nvae;

            }
            switch (alt76) {
                case 1 :
                    // Haxe.g:387:19: IDENTIFIER ^ LPAREN ! ( paramList )? RPAREN ! SEMI !
                    {
                    root_0 = (Object)adaptor.nil();


                    IDENTIFIER284=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_enumValueDecl4717); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER284_tree = 
                    new VarDeclarationNode(IDENTIFIER284) 
                    ;
                    root_0 = (Object)adaptor.becomeRoot(IDENTIFIER284_tree, root_0);
                    }

                    LPAREN285=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_enumValueDecl4723); if (state.failed) return retval;

                    // Haxe.g:387:59: ( paramList )?
                    int alt75=2;
                    int LA75_0 = input.LA(1);

                    if ( (LA75_0==IDENTIFIER||LA75_0==QUES) ) {
                        alt75=1;
                    }
                    switch (alt75) {
                        case 1 :
                            // Haxe.g:387:59: paramList
                            {
                            pushFollow(FOLLOW_paramList_in_enumValueDecl4726);
                            paramList286=paramList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, paramList286.getTree());

                            }
                            break;

                    }


                    RPAREN287=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_enumValueDecl4729); if (state.failed) return retval;

                    SEMI288=(Token)match(input,SEMI,FOLLOW_SEMI_in_enumValueDecl4732); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // Haxe.g:388:19: IDENTIFIER SEMI !
                    {
                    root_0 = (Object)adaptor.nil();


                    IDENTIFIER289=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_enumValueDecl4755); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER289_tree = 
                    new VarDeclarationNode(IDENTIFIER289) 
                    ;
                    adaptor.addChild(root_0, IDENTIFIER289_tree);
                    }

                    SEMI290=(Token)match(input,SEMI,FOLLOW_SEMI_in_enumValueDecl4760); if (state.failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
            if ( state.backtracking>0 ) { memoize(input, 59, enumValueDecl_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "enumValueDecl"


    public static class classDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "classDecl"
    // Haxe.g:392:1: classDecl : ( topLevelAccess )? CLASS IDENTIFIER typeParamOpt inheritListOpt classBodyScope -> ^( IDENTIFIER ( topLevelAccess )? ( typeParamOpt )? ( inheritListOpt )? ( classBodyScope )? ) ;
    public final HaxeParser.classDecl_return classDecl() throws RecognitionException {
        HaxeParser.classDecl_return retval = new HaxeParser.classDecl_return();
        retval.start = input.LT(1);

        int classDecl_StartIndex = input.index();

        Object root_0 = null;

        Token CLASS292=null;
        Token IDENTIFIER293=null;
        HaxeParser.topLevelAccess_return topLevelAccess291 =null;

        HaxeParser.typeParamOpt_return typeParamOpt294 =null;

        HaxeParser.inheritListOpt_return inheritListOpt295 =null;

        HaxeParser.classBodyScope_return classBodyScope296 =null;


        Object CLASS292_tree=null;
        Object IDENTIFIER293_tree=null;
        RewriteRuleTokenStream stream_CLASS=new RewriteRuleTokenStream(adaptor,"token CLASS");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleSubtreeStream stream_classBodyScope=new RewriteRuleSubtreeStream(adaptor,"rule classBodyScope");
        RewriteRuleSubtreeStream stream_typeParamOpt=new RewriteRuleSubtreeStream(adaptor,"rule typeParamOpt");
        RewriteRuleSubtreeStream stream_topLevelAccess=new RewriteRuleSubtreeStream(adaptor,"rule topLevelAccess");
        RewriteRuleSubtreeStream stream_inheritListOpt=new RewriteRuleSubtreeStream(adaptor,"rule inheritListOpt");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 60) ) { return retval; }

            // Haxe.g:392:17: ( ( topLevelAccess )? CLASS IDENTIFIER typeParamOpt inheritListOpt classBodyScope -> ^( IDENTIFIER ( topLevelAccess )? ( typeParamOpt )? ( inheritListOpt )? ( classBodyScope )? ) )
            // Haxe.g:392:19: ( topLevelAccess )? CLASS IDENTIFIER typeParamOpt inheritListOpt classBodyScope
            {
            // Haxe.g:392:19: ( topLevelAccess )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==EXTERN||LA77_0==PRIVATE) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // Haxe.g:392:19: topLevelAccess
                    {
                    pushFollow(FOLLOW_topLevelAccess_in_classDecl4809);
                    topLevelAccess291=topLevelAccess();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_topLevelAccess.add(topLevelAccess291.getTree());

                    }
                    break;

            }


            CLASS292=(Token)match(input,CLASS,FOLLOW_CLASS_in_classDecl4812); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CLASS.add(CLASS292);


            IDENTIFIER293=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_classDecl4814); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER293);


            pushFollow(FOLLOW_typeParamOpt_in_classDecl4816);
            typeParamOpt294=typeParamOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeParamOpt.add(typeParamOpt294.getTree());

            pushFollow(FOLLOW_inheritListOpt_in_classDecl4818);
            inheritListOpt295=inheritListOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_inheritListOpt.add(inheritListOpt295.getTree());

            pushFollow(FOLLOW_classBodyScope_in_classDecl4820);
            classBodyScope296=classBodyScope();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_classBodyScope.add(classBodyScope296.getTree());

            // AST REWRITE
            // elements: inheritListOpt, typeParamOpt, classBodyScope, IDENTIFIER, topLevelAccess
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 392:95: -> ^( IDENTIFIER ( topLevelAccess )? ( typeParamOpt )? ( inheritListOpt )? ( classBodyScope )? )
            {
                // Haxe.g:392:98: ^( IDENTIFIER ( topLevelAccess )? ( typeParamOpt )? ( inheritListOpt )? ( classBodyScope )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                new ClassNode(stream_IDENTIFIER.nextToken())
                , root_1);

                // Haxe.g:392:122: ( topLevelAccess )?
                if ( stream_topLevelAccess.hasNext() ) {
                    adaptor.addChild(root_1, stream_topLevelAccess.nextTree());

                }
                stream_topLevelAccess.reset();

                // Haxe.g:392:138: ( typeParamOpt )?
                if ( stream_typeParamOpt.hasNext() ) {
                    adaptor.addChild(root_1, stream_typeParamOpt.nextTree());

                }
                stream_typeParamOpt.reset();

                // Haxe.g:392:152: ( inheritListOpt )?
                if ( stream_inheritListOpt.hasNext() ) {
                    adaptor.addChild(root_1, stream_inheritListOpt.nextTree());

                }
                stream_inheritListOpt.reset();

                // Haxe.g:392:168: ( classBodyScope )?
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
            if ( state.backtracking>0 ) { memoize(input, 60, classDecl_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "classDecl"


    public static class classBodyScope_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "classBodyScope"
    // Haxe.g:395:1: classBodyScope : LBRACE ( classMember )* RBRACE -> ^( BLOCK_SCOPE[$LBRACE, $RBRACE] ( classMember )* ) ;
    public final HaxeParser.classBodyScope_return classBodyScope() throws RecognitionException {
        HaxeParser.classBodyScope_return retval = new HaxeParser.classBodyScope_return();
        retval.start = input.LT(1);

        int classBodyScope_StartIndex = input.index();

        Object root_0 = null;

        Token LBRACE297=null;
        Token RBRACE299=null;
        HaxeParser.classMember_return classMember298 =null;


        Object LBRACE297_tree=null;
        Object RBRACE299_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_classMember=new RewriteRuleSubtreeStream(adaptor,"rule classMember");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 61) ) { return retval; }

            // Haxe.g:395:17: ( LBRACE ( classMember )* RBRACE -> ^( BLOCK_SCOPE[$LBRACE, $RBRACE] ( classMember )* ) )
            // Haxe.g:395:19: LBRACE ( classMember )* RBRACE
            {
            LBRACE297=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_classBodyScope4867); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACE.add(LBRACE297);


            // Haxe.g:395:26: ( classMember )*
            loop78:
            do {
                int alt78=2;
                int LA78_0 = input.LA(1);

                if ( (LA78_0==DYNAMIC||LA78_0==FUNCTION||LA78_0==INLINE||LA78_0==OVERRIDE||LA78_0==PRIVATE||LA78_0==PUBLIC||LA78_0==STATIC||LA78_0==VAR) ) {
                    alt78=1;
                }


                switch (alt78) {
            	case 1 :
            	    // Haxe.g:395:27: classMember
            	    {
            	    pushFollow(FOLLOW_classMember_in_classBodyScope4870);
            	    classMember298=classMember();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_classMember.add(classMember298.getTree());

            	    }
            	    break;

            	default :
            	    break loop78;
                }
            } while (true);


            RBRACE299=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_classBodyScope4874); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACE.add(RBRACE299);


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
            // 395:48: -> ^( BLOCK_SCOPE[$LBRACE, $RBRACE] ( classMember )* )
            {
                // Haxe.g:395:51: ^( BLOCK_SCOPE[$LBRACE, $RBRACE] ( classMember )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                new BlockScopeNode(BLOCK_SCOPE, LBRACE297, RBRACE299)
                , root_1);

                // Haxe.g:395:99: ( classMember )*
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
            if ( state.backtracking>0 ) { memoize(input, 61, classBodyScope_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "classBodyScope"


    public static class classMember_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "classMember"
    // Haxe.g:398:1: classMember : ( varDecl | funcDecl );
    public final HaxeParser.classMember_return classMember() throws RecognitionException {
        HaxeParser.classMember_return retval = new HaxeParser.classMember_return();
        retval.start = input.LT(1);

        int classMember_StartIndex = input.index();

        Object root_0 = null;

        HaxeParser.varDecl_return varDecl300 =null;

        HaxeParser.funcDecl_return funcDecl301 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 62) ) { return retval; }

            // Haxe.g:398:17: ( varDecl | funcDecl )
            int alt79=2;
            alt79 = dfa79.predict(input);
            switch (alt79) {
                case 1 :
                    // Haxe.g:398:19: varDecl
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_varDecl_in_classMember4920);
                    varDecl300=varDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDecl300.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:399:19: funcDecl
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_funcDecl_in_classMember4941);
                    funcDecl301=funcDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, funcDecl301.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
            if ( state.backtracking>0 ) { memoize(input, 62, classMember_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "classMember"


    public static class varDeclList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "varDeclList"
    // Haxe.g:403:1: varDeclList : varDecl varDeclList ;
    public final HaxeParser.varDeclList_return varDeclList() throws RecognitionException {
        HaxeParser.varDeclList_return retval = new HaxeParser.varDeclList_return();
        retval.start = input.LT(1);

        int varDeclList_StartIndex = input.index();

        Object root_0 = null;

        HaxeParser.varDecl_return varDecl302 =null;

        HaxeParser.varDeclList_return varDeclList303 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 63) ) { return retval; }

            // Haxe.g:403:17: ( varDecl varDeclList )
            // Haxe.g:403:19: varDecl varDeclList
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_varDecl_in_varDeclList4984);
            varDecl302=varDecl();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, varDecl302.getTree());

            pushFollow(FOLLOW_varDeclList_in_varDeclList4986);
            varDeclList303=varDeclList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclList303.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // Haxe.g:406:1: varDecl : varDeclPartList SEMI !;
    public final HaxeParser.varDecl_return varDecl() throws RecognitionException {
        HaxeParser.varDecl_return retval = new HaxeParser.varDecl_return();
        retval.start = input.LT(1);

        int varDecl_StartIndex = input.index();

        Object root_0 = null;

        Token SEMI305=null;
        HaxeParser.varDeclPartList_return varDeclPartList304 =null;


        Object SEMI305_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 64) ) { return retval; }

            // Haxe.g:406:17: ( varDeclPartList SEMI !)
            // Haxe.g:406:19: varDeclPartList SEMI !
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_varDeclPartList_in_varDecl5019);
            varDeclPartList304=varDeclPartList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclPartList304.getTree());

            SEMI305=(Token)match(input,SEMI,FOLLOW_SEMI_in_varDecl5021); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // Haxe.g:409:1: varDeclPartList : ( declAttrList )? VAR IDENTIFIER ( propDecl )? ( COMMA IDENTIFIER ( propDecl )? )* ( typeTag )? ( varInit )? -> ( ^( IDENTIFIER ( declAttrList )? ( propDecl )? ( typeTag )? ( varInit )? ) )+ ;
    public final HaxeParser.varDeclPartList_return varDeclPartList() throws RecognitionException {
        HaxeParser.varDeclPartList_return retval = new HaxeParser.varDeclPartList_return();
        retval.start = input.LT(1);

        int varDeclPartList_StartIndex = input.index();

        Object root_0 = null;

        Token VAR307=null;
        Token IDENTIFIER308=null;
        Token COMMA310=null;
        Token IDENTIFIER311=null;
        HaxeParser.declAttrList_return declAttrList306 =null;

        HaxeParser.propDecl_return propDecl309 =null;

        HaxeParser.propDecl_return propDecl312 =null;

        HaxeParser.typeTag_return typeTag313 =null;

        HaxeParser.varInit_return varInit314 =null;


        Object VAR307_tree=null;
        Object IDENTIFIER308_tree=null;
        Object COMMA310_tree=null;
        Object IDENTIFIER311_tree=null;
        RewriteRuleTokenStream stream_VAR=new RewriteRuleTokenStream(adaptor,"token VAR");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleSubtreeStream stream_typeTag=new RewriteRuleSubtreeStream(adaptor,"rule typeTag");
        RewriteRuleSubtreeStream stream_declAttrList=new RewriteRuleSubtreeStream(adaptor,"rule declAttrList");
        RewriteRuleSubtreeStream stream_propDecl=new RewriteRuleSubtreeStream(adaptor,"rule propDecl");
        RewriteRuleSubtreeStream stream_varInit=new RewriteRuleSubtreeStream(adaptor,"rule varInit");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 65) ) { return retval; }

            // Haxe.g:409:17: ( ( declAttrList )? VAR IDENTIFIER ( propDecl )? ( COMMA IDENTIFIER ( propDecl )? )* ( typeTag )? ( varInit )? -> ( ^( IDENTIFIER ( declAttrList )? ( propDecl )? ( typeTag )? ( varInit )? ) )+ )
            // Haxe.g:409:19: ( declAttrList )? VAR IDENTIFIER ( propDecl )? ( COMMA IDENTIFIER ( propDecl )? )* ( typeTag )? ( varInit )?
            {
            // Haxe.g:409:19: ( declAttrList )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==DYNAMIC||LA80_0==INLINE||LA80_0==OVERRIDE||LA80_0==PRIVATE||LA80_0==PUBLIC||LA80_0==STATIC) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // Haxe.g:409:19: declAttrList
                    {
                    pushFollow(FOLLOW_declAttrList_in_varDeclPartList5048);
                    declAttrList306=declAttrList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declAttrList.add(declAttrList306.getTree());

                    }
                    break;

            }


            VAR307=(Token)match(input,VAR,FOLLOW_VAR_in_varDeclPartList5051); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_VAR.add(VAR307);


            IDENTIFIER308=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_varDeclPartList5053); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER308);


            // Haxe.g:409:48: ( propDecl )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==LPAREN) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // Haxe.g:409:48: propDecl
                    {
                    pushFollow(FOLLOW_propDecl_in_varDeclPartList5055);
                    propDecl309=propDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_propDecl.add(propDecl309.getTree());

                    }
                    break;

            }


            // Haxe.g:409:58: ( COMMA IDENTIFIER ( propDecl )? )*
            loop83:
            do {
                int alt83=2;
                int LA83_0 = input.LA(1);

                if ( (LA83_0==COMMA) ) {
                    alt83=1;
                }


                switch (alt83) {
            	case 1 :
            	    // Haxe.g:409:59: COMMA IDENTIFIER ( propDecl )?
            	    {
            	    COMMA310=(Token)match(input,COMMA,FOLLOW_COMMA_in_varDeclPartList5059); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA310);


            	    IDENTIFIER311=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_varDeclPartList5061); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER311);


            	    // Haxe.g:409:76: ( propDecl )?
            	    int alt82=2;
            	    int LA82_0 = input.LA(1);

            	    if ( (LA82_0==LPAREN) ) {
            	        alt82=1;
            	    }
            	    switch (alt82) {
            	        case 1 :
            	            // Haxe.g:409:76: propDecl
            	            {
            	            pushFollow(FOLLOW_propDecl_in_varDeclPartList5063);
            	            propDecl312=propDecl();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) stream_propDecl.add(propDecl312.getTree());

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop83;
                }
            } while (true);


            // Haxe.g:409:89: ( typeTag )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==COLON) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // Haxe.g:409:89: typeTag
                    {
                    pushFollow(FOLLOW_typeTag_in_varDeclPartList5069);
                    typeTag313=typeTag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeTag.add(typeTag313.getTree());

                    }
                    break;

            }


            // Haxe.g:409:98: ( varInit )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==EQ) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // Haxe.g:409:98: varInit
                    {
                    pushFollow(FOLLOW_varInit_in_varDeclPartList5072);
                    varInit314=varInit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_varInit.add(varInit314.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: IDENTIFIER, typeTag, varInit, declAttrList, propDecl
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 409:107: -> ( ^( IDENTIFIER ( declAttrList )? ( propDecl )? ( typeTag )? ( varInit )? ) )+
            {
                if ( !(stream_IDENTIFIER.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_IDENTIFIER.hasNext() ) {
                    // Haxe.g:409:111: ^( IDENTIFIER ( declAttrList )? ( propDecl )? ( typeTag )? ( varInit )? )
                    {
                    Object root_1 = (Object)adaptor.nil();
                    root_1 = (Object)adaptor.becomeRoot(
                    new VarDeclarationNode(stream_IDENTIFIER.nextToken())
                    , root_1);

                    // Haxe.g:409:144: ( declAttrList )?
                    if ( stream_declAttrList.hasNext() ) {
                        adaptor.addChild(root_1, stream_declAttrList.nextTree());

                    }
                    stream_declAttrList.reset();

                    // Haxe.g:409:158: ( propDecl )?
                    if ( stream_propDecl.hasNext() ) {
                        adaptor.addChild(root_1, stream_propDecl.nextTree());

                    }
                    stream_propDecl.reset();

                    // Haxe.g:409:168: ( typeTag )?
                    if ( stream_typeTag.hasNext() ) {
                        adaptor.addChild(root_1, stream_typeTag.nextTree());

                    }
                    stream_typeTag.reset();

                    // Haxe.g:409:177: ( varInit )?
                    if ( stream_varInit.hasNext() ) {
                        adaptor.addChild(root_1, stream_varInit.nextTree());

                    }
                    stream_varInit.reset();

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_IDENTIFIER.reset();

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
    // Haxe.g:412:1: propDecl : LPAREN a1= propAccessor COMMA a2= propAccessor RPAREN -> ^( PROPERTY_DECL[\"PROPERTY_DECL\"] ( $a1)? ( $a2)? ) ;
    public final HaxeParser.propDecl_return propDecl() throws RecognitionException {
        HaxeParser.propDecl_return retval = new HaxeParser.propDecl_return();
        retval.start = input.LT(1);

        int propDecl_StartIndex = input.index();

        Object root_0 = null;

        Token LPAREN315=null;
        Token COMMA316=null;
        Token RPAREN317=null;
        HaxeParser.propAccessor_return a1 =null;

        HaxeParser.propAccessor_return a2 =null;


        Object LPAREN315_tree=null;
        Object COMMA316_tree=null;
        Object RPAREN317_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_propAccessor=new RewriteRuleSubtreeStream(adaptor,"rule propAccessor");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 66) ) { return retval; }

            // Haxe.g:412:17: ( LPAREN a1= propAccessor COMMA a2= propAccessor RPAREN -> ^( PROPERTY_DECL[\"PROPERTY_DECL\"] ( $a1)? ( $a2)? ) )
            // Haxe.g:412:19: LPAREN a1= propAccessor COMMA a2= propAccessor RPAREN
            {
            LPAREN315=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_propDecl5129); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN315);


            pushFollow(FOLLOW_propAccessor_in_propDecl5133);
            a1=propAccessor();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_propAccessor.add(a1.getTree());

            COMMA316=(Token)match(input,COMMA,FOLLOW_COMMA_in_propDecl5135); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COMMA.add(COMMA316);


            pushFollow(FOLLOW_propAccessor_in_propDecl5139);
            a2=propAccessor();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_propAccessor.add(a2.getTree());

            RPAREN317=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_propDecl5141); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN317);


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
            // 412:71: -> ^( PROPERTY_DECL[\"PROPERTY_DECL\"] ( $a1)? ( $a2)? )
            {
                // Haxe.g:412:74: ^( PROPERTY_DECL[\"PROPERTY_DECL\"] ( $a1)? ( $a2)? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                new HaxeTree(PROPERTY_DECL, "PROPERTY_DECL")
                , root_1);

                // Haxe.g:412:118: ( $a1)?
                if ( stream_a1.hasNext() ) {
                    adaptor.addChild(root_1, stream_a1.nextTree());

                }
                stream_a1.reset();

                // Haxe.g:412:123: ( $a2)?
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
    // Haxe.g:415:1: propAccessor : ( IDENTIFIER | NULL | DEFAULT | DYNAMIC );
    public final HaxeParser.propAccessor_return propAccessor() throws RecognitionException {
        HaxeParser.propAccessor_return retval = new HaxeParser.propAccessor_return();
        retval.start = input.LT(1);

        int propAccessor_StartIndex = input.index();

        Object root_0 = null;

        Token set318=null;

        Object set318_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 67) ) { return retval; }

            // Haxe.g:415:17: ( IDENTIFIER | NULL | DEFAULT | DYNAMIC )
            // Haxe.g:
            {
            root_0 = (Object)adaptor.nil();


            set318=(Token)input.LT(1);

            if ( input.LA(1)==DEFAULT||input.LA(1)==DYNAMIC||input.LA(1)==IDENTIFIER||input.LA(1)==NULL ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (Object)adaptor.create(set318)
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
    // Haxe.g:421:1: varInit : EQ expr -> ^( VAR_INIT[\"VAR_INIT\"] expr ) ;
    public final HaxeParser.varInit_return varInit() throws RecognitionException {
        HaxeParser.varInit_return retval = new HaxeParser.varInit_return();
        retval.start = input.LT(1);

        int varInit_StartIndex = input.index();

        Object root_0 = null;

        Token EQ319=null;
        HaxeParser.expr_return expr320 =null;


        Object EQ319_tree=null;
        RewriteRuleTokenStream stream_EQ=new RewriteRuleTokenStream(adaptor,"token EQ");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 68) ) { return retval; }

            // Haxe.g:421:17: ( EQ expr -> ^( VAR_INIT[\"VAR_INIT\"] expr ) )
            // Haxe.g:421:19: EQ expr
            {
            EQ319=(Token)match(input,EQ,FOLLOW_EQ_in_varInit5282); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_EQ.add(EQ319);


            pushFollow(FOLLOW_expr_in_varInit5284);
            expr320=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr320.getTree());

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
            // 421:27: -> ^( VAR_INIT[\"VAR_INIT\"] expr )
            {
                // Haxe.g:421:30: ^( VAR_INIT[\"VAR_INIT\"] expr )
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
    // Haxe.g:424:1: funcDecl : ( ( declAttrList )? FUNCTION NEW LPAREN ( paramList )? RPAREN ( typeTag )? block -> ^( FUNCTION NEW ( declAttrList )? ( paramList )? ( typeTag )? ( block )? ) | ( declAttrList )? FUNCTION IDENTIFIER typeParamOpt LPAREN ( paramList )? RPAREN ( typeTag )? block -> ^( FUNCTION IDENTIFIER ( declAttrList )? ( paramList )? ( typeTag )? ( block )? ( typeParamOpt )? ) );
    public final HaxeParser.funcDecl_return funcDecl() throws RecognitionException {
        HaxeParser.funcDecl_return retval = new HaxeParser.funcDecl_return();
        retval.start = input.LT(1);

        int funcDecl_StartIndex = input.index();

        Object root_0 = null;

        Token FUNCTION322=null;
        Token NEW323=null;
        Token LPAREN324=null;
        Token RPAREN326=null;
        Token FUNCTION330=null;
        Token IDENTIFIER331=null;
        Token LPAREN333=null;
        Token RPAREN335=null;
        HaxeParser.declAttrList_return declAttrList321 =null;

        HaxeParser.paramList_return paramList325 =null;

        HaxeParser.typeTag_return typeTag327 =null;

        HaxeParser.block_return block328 =null;

        HaxeParser.declAttrList_return declAttrList329 =null;

        HaxeParser.typeParamOpt_return typeParamOpt332 =null;

        HaxeParser.paramList_return paramList334 =null;

        HaxeParser.typeTag_return typeTag336 =null;

        HaxeParser.block_return block337 =null;


        Object FUNCTION322_tree=null;
        Object NEW323_tree=null;
        Object LPAREN324_tree=null;
        Object RPAREN326_tree=null;
        Object FUNCTION330_tree=null;
        Object IDENTIFIER331_tree=null;
        Object LPAREN333_tree=null;
        Object RPAREN335_tree=null;
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

            // Haxe.g:424:9: ( ( declAttrList )? FUNCTION NEW LPAREN ( paramList )? RPAREN ( typeTag )? block -> ^( FUNCTION NEW ( declAttrList )? ( paramList )? ( typeTag )? ( block )? ) | ( declAttrList )? FUNCTION IDENTIFIER typeParamOpt LPAREN ( paramList )? RPAREN ( typeTag )? block -> ^( FUNCTION IDENTIFIER ( declAttrList )? ( paramList )? ( typeTag )? ( block )? ( typeParamOpt )? ) )
            int alt92=2;
            alt92 = dfa92.predict(input);
            switch (alt92) {
                case 1 :
                    // Haxe.g:424:13: ( declAttrList )? FUNCTION NEW LPAREN ( paramList )? RPAREN ( typeTag )? block
                    {
                    // Haxe.g:424:13: ( declAttrList )?
                    int alt86=2;
                    int LA86_0 = input.LA(1);

                    if ( (LA86_0==DYNAMIC||LA86_0==INLINE||LA86_0==OVERRIDE||LA86_0==PRIVATE||LA86_0==PUBLIC||LA86_0==STATIC) ) {
                        alt86=1;
                    }
                    switch (alt86) {
                        case 1 :
                            // Haxe.g:424:13: declAttrList
                            {
                            pushFollow(FOLLOW_declAttrList_in_funcDecl5326);
                            declAttrList321=declAttrList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_declAttrList.add(declAttrList321.getTree());

                            }
                            break;

                    }


                    FUNCTION322=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcDecl5329); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION322);


                    NEW323=(Token)match(input,NEW,FOLLOW_NEW_in_funcDecl5331); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEW.add(NEW323);


                    LPAREN324=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcDecl5333); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN324);


                    // Haxe.g:424:47: ( paramList )?
                    int alt87=2;
                    int LA87_0 = input.LA(1);

                    if ( (LA87_0==IDENTIFIER||LA87_0==QUES) ) {
                        alt87=1;
                    }
                    switch (alt87) {
                        case 1 :
                            // Haxe.g:424:47: paramList
                            {
                            pushFollow(FOLLOW_paramList_in_funcDecl5335);
                            paramList325=paramList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_paramList.add(paramList325.getTree());

                            }
                            break;

                    }


                    RPAREN326=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcDecl5338); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN326);


                    // Haxe.g:424:65: ( typeTag )?
                    int alt88=2;
                    int LA88_0 = input.LA(1);

                    if ( (LA88_0==COLON) ) {
                        alt88=1;
                    }
                    switch (alt88) {
                        case 1 :
                            // Haxe.g:424:65: typeTag
                            {
                            pushFollow(FOLLOW_typeTag_in_funcDecl5340);
                            typeTag327=typeTag();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_typeTag.add(typeTag327.getTree());

                            }
                            break;

                    }


                    pushFollow(FOLLOW_block_in_funcDecl5343);
                    block328=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block328.getTree());

                    // AST REWRITE
                    // elements: declAttrList, NEW, paramList, FUNCTION, typeTag, block
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 425:17: -> ^( FUNCTION NEW ( declAttrList )? ( paramList )? ( typeTag )? ( block )? )
                    {
                        // Haxe.g:425:20: ^( FUNCTION NEW ( declAttrList )? ( paramList )? ( typeTag )? ( block )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        new FunctionNode(stream_FUNCTION.nextToken())
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_NEW.nextNode()
                        );

                        // Haxe.g:425:49: ( declAttrList )?
                        if ( stream_declAttrList.hasNext() ) {
                            adaptor.addChild(root_1, stream_declAttrList.nextTree());

                        }
                        stream_declAttrList.reset();

                        // Haxe.g:425:63: ( paramList )?
                        if ( stream_paramList.hasNext() ) {
                            adaptor.addChild(root_1, stream_paramList.nextTree());

                        }
                        stream_paramList.reset();

                        // Haxe.g:425:74: ( typeTag )?
                        if ( stream_typeTag.hasNext() ) {
                            adaptor.addChild(root_1, stream_typeTag.nextTree());

                        }
                        stream_typeTag.reset();

                        // Haxe.g:425:83: ( block )?
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
                    // Haxe.g:426:13: ( declAttrList )? FUNCTION IDENTIFIER typeParamOpt LPAREN ( paramList )? RPAREN ( typeTag )? block
                    {
                    // Haxe.g:426:13: ( declAttrList )?
                    int alt89=2;
                    int LA89_0 = input.LA(1);

                    if ( (LA89_0==DYNAMIC||LA89_0==INLINE||LA89_0==OVERRIDE||LA89_0==PRIVATE||LA89_0==PUBLIC||LA89_0==STATIC) ) {
                        alt89=1;
                    }
                    switch (alt89) {
                        case 1 :
                            // Haxe.g:426:13: declAttrList
                            {
                            pushFollow(FOLLOW_declAttrList_in_funcDecl5398);
                            declAttrList329=declAttrList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_declAttrList.add(declAttrList329.getTree());

                            }
                            break;

                    }


                    FUNCTION330=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcDecl5401); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION330);


                    IDENTIFIER331=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_funcDecl5403); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER331);


                    pushFollow(FOLLOW_typeParamOpt_in_funcDecl5405);
                    typeParamOpt332=typeParamOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeParamOpt.add(typeParamOpt332.getTree());

                    LPAREN333=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcDecl5407); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN333);


                    // Haxe.g:426:67: ( paramList )?
                    int alt90=2;
                    int LA90_0 = input.LA(1);

                    if ( (LA90_0==IDENTIFIER||LA90_0==QUES) ) {
                        alt90=1;
                    }
                    switch (alt90) {
                        case 1 :
                            // Haxe.g:426:67: paramList
                            {
                            pushFollow(FOLLOW_paramList_in_funcDecl5409);
                            paramList334=paramList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_paramList.add(paramList334.getTree());

                            }
                            break;

                    }


                    RPAREN335=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcDecl5412); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN335);


                    // Haxe.g:426:85: ( typeTag )?
                    int alt91=2;
                    int LA91_0 = input.LA(1);

                    if ( (LA91_0==COLON) ) {
                        alt91=1;
                    }
                    switch (alt91) {
                        case 1 :
                            // Haxe.g:426:85: typeTag
                            {
                            pushFollow(FOLLOW_typeTag_in_funcDecl5414);
                            typeTag336=typeTag();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_typeTag.add(typeTag336.getTree());

                            }
                            break;

                    }


                    pushFollow(FOLLOW_block_in_funcDecl5417);
                    block337=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block337.getTree());

                    // AST REWRITE
                    // elements: paramList, FUNCTION, IDENTIFIER, typeParamOpt, block, typeTag, declAttrList
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 427:17: -> ^( FUNCTION IDENTIFIER ( declAttrList )? ( paramList )? ( typeTag )? ( block )? ( typeParamOpt )? )
                    {
                        // Haxe.g:427:20: ^( FUNCTION IDENTIFIER ( declAttrList )? ( paramList )? ( typeTag )? ( block )? ( typeParamOpt )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        new FunctionNode(stream_FUNCTION.nextToken())
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_IDENTIFIER.nextNode()
                        );

                        // Haxe.g:427:56: ( declAttrList )?
                        if ( stream_declAttrList.hasNext() ) {
                            adaptor.addChild(root_1, stream_declAttrList.nextTree());

                        }
                        stream_declAttrList.reset();

                        // Haxe.g:427:70: ( paramList )?
                        if ( stream_paramList.hasNext() ) {
                            adaptor.addChild(root_1, stream_paramList.nextTree());

                        }
                        stream_paramList.reset();

                        // Haxe.g:427:81: ( typeTag )?
                        if ( stream_typeTag.hasNext() ) {
                            adaptor.addChild(root_1, stream_typeTag.nextTree());

                        }
                        stream_typeTag.reset();

                        // Haxe.g:427:90: ( block )?
                        if ( stream_block.hasNext() ) {
                            adaptor.addChild(root_1, stream_block.nextTree());

                        }
                        stream_block.reset();

                        // Haxe.g:427:97: ( typeParamOpt )?
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
    // Haxe.g:430:1: funcProtoDecl : ( declAttrList FUNCTION NEW LPAREN ( paramList )? RPAREN ( typeTag )? SEMI -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTag )? ( declAttrList )? ) | declAttrList FUNCTION IDENTIFIER typeParamOpt LPAREN ( paramList )? RPAREN ( typeTag )? SEMI -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTag )? ( declAttrList )? ( typeParamOpt )? ) | FUNCTION NEW LPAREN ( paramList )? RPAREN ( typeTag )? SEMI -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTag )? ) | FUNCTION IDENTIFIER typeParamOpt LPAREN ( paramList )? RPAREN ( typeTag )? SEMI -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTag )? ( typeParamOpt )? ) );
    public final HaxeParser.funcProtoDecl_return funcProtoDecl() throws RecognitionException {
        HaxeParser.funcProtoDecl_return retval = new HaxeParser.funcProtoDecl_return();
        retval.start = input.LT(1);

        int funcProtoDecl_StartIndex = input.index();

        Object root_0 = null;

        Token FUNCTION339=null;
        Token NEW340=null;
        Token LPAREN341=null;
        Token RPAREN343=null;
        Token SEMI345=null;
        Token FUNCTION347=null;
        Token IDENTIFIER348=null;
        Token LPAREN350=null;
        Token RPAREN352=null;
        Token SEMI354=null;
        Token FUNCTION355=null;
        Token NEW356=null;
        Token LPAREN357=null;
        Token RPAREN359=null;
        Token SEMI361=null;
        Token FUNCTION362=null;
        Token IDENTIFIER363=null;
        Token LPAREN365=null;
        Token RPAREN367=null;
        Token SEMI369=null;
        HaxeParser.declAttrList_return declAttrList338 =null;

        HaxeParser.paramList_return paramList342 =null;

        HaxeParser.typeTag_return typeTag344 =null;

        HaxeParser.declAttrList_return declAttrList346 =null;

        HaxeParser.typeParamOpt_return typeParamOpt349 =null;

        HaxeParser.paramList_return paramList351 =null;

        HaxeParser.typeTag_return typeTag353 =null;

        HaxeParser.paramList_return paramList358 =null;

        HaxeParser.typeTag_return typeTag360 =null;

        HaxeParser.typeParamOpt_return typeParamOpt364 =null;

        HaxeParser.paramList_return paramList366 =null;

        HaxeParser.typeTag_return typeTag368 =null;


        Object FUNCTION339_tree=null;
        Object NEW340_tree=null;
        Object LPAREN341_tree=null;
        Object RPAREN343_tree=null;
        Object SEMI345_tree=null;
        Object FUNCTION347_tree=null;
        Object IDENTIFIER348_tree=null;
        Object LPAREN350_tree=null;
        Object RPAREN352_tree=null;
        Object SEMI354_tree=null;
        Object FUNCTION355_tree=null;
        Object NEW356_tree=null;
        Object LPAREN357_tree=null;
        Object RPAREN359_tree=null;
        Object SEMI361_tree=null;
        Object FUNCTION362_tree=null;
        Object IDENTIFIER363_tree=null;
        Object LPAREN365_tree=null;
        Object RPAREN367_tree=null;
        Object SEMI369_tree=null;
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

            // Haxe.g:431:5: ( declAttrList FUNCTION NEW LPAREN ( paramList )? RPAREN ( typeTag )? SEMI -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTag )? ( declAttrList )? ) | declAttrList FUNCTION IDENTIFIER typeParamOpt LPAREN ( paramList )? RPAREN ( typeTag )? SEMI -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTag )? ( declAttrList )? ( typeParamOpt )? ) | FUNCTION NEW LPAREN ( paramList )? RPAREN ( typeTag )? SEMI -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTag )? ) | FUNCTION IDENTIFIER typeParamOpt LPAREN ( paramList )? RPAREN ( typeTag )? SEMI -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTag )? ( typeParamOpt )? ) )
            int alt101=4;
            alt101 = dfa101.predict(input);
            switch (alt101) {
                case 1 :
                    // Haxe.g:431:9: declAttrList FUNCTION NEW LPAREN ( paramList )? RPAREN ( typeTag )? SEMI
                    {
                    pushFollow(FOLLOW_declAttrList_in_funcProtoDecl5487);
                    declAttrList338=declAttrList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declAttrList.add(declAttrList338.getTree());

                    FUNCTION339=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcProtoDecl5489); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION339);


                    NEW340=(Token)match(input,NEW,FOLLOW_NEW_in_funcProtoDecl5491); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEW.add(NEW340);


                    LPAREN341=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcProtoDecl5493); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN341);


                    // Haxe.g:431:42: ( paramList )?
                    int alt93=2;
                    int LA93_0 = input.LA(1);

                    if ( (LA93_0==IDENTIFIER||LA93_0==QUES) ) {
                        alt93=1;
                    }
                    switch (alt93) {
                        case 1 :
                            // Haxe.g:431:42: paramList
                            {
                            pushFollow(FOLLOW_paramList_in_funcProtoDecl5495);
                            paramList342=paramList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_paramList.add(paramList342.getTree());

                            }
                            break;

                    }


                    RPAREN343=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcProtoDecl5498); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN343);


                    // Haxe.g:431:60: ( typeTag )?
                    int alt94=2;
                    int LA94_0 = input.LA(1);

                    if ( (LA94_0==COLON) ) {
                        alt94=1;
                    }
                    switch (alt94) {
                        case 1 :
                            // Haxe.g:431:60: typeTag
                            {
                            pushFollow(FOLLOW_typeTag_in_funcProtoDecl5500);
                            typeTag344=typeTag();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_typeTag.add(typeTag344.getTree());

                            }
                            break;

                    }


                    SEMI345=(Token)match(input,SEMI,FOLLOW_SEMI_in_funcProtoDecl5503); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI345);


                    // AST REWRITE
                    // elements: NEW, FUNCTION, declAttrList, paramList, typeTag
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 432:13: -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTag )? ( declAttrList )? )
                    {
                        // Haxe.g:432:16: ^( FUNCTION ( NEW )? ( paramList )? ( typeTag )? ( declAttrList )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_FUNCTION.nextNode()
                        , root_1);

                        // Haxe.g:432:27: ( NEW )?
                        if ( stream_NEW.hasNext() ) {
                            adaptor.addChild(root_1, 
                            stream_NEW.nextNode()
                            );

                        }
                        stream_NEW.reset();

                        // Haxe.g:432:32: ( paramList )?
                        if ( stream_paramList.hasNext() ) {
                            adaptor.addChild(root_1, stream_paramList.nextTree());

                        }
                        stream_paramList.reset();

                        // Haxe.g:432:43: ( typeTag )?
                        if ( stream_typeTag.hasNext() ) {
                            adaptor.addChild(root_1, stream_typeTag.nextTree());

                        }
                        stream_typeTag.reset();

                        // Haxe.g:432:52: ( declAttrList )?
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
                    // Haxe.g:433:9: declAttrList FUNCTION IDENTIFIER typeParamOpt LPAREN ( paramList )? RPAREN ( typeTag )? SEMI
                    {
                    pushFollow(FOLLOW_declAttrList_in_funcProtoDecl5544);
                    declAttrList346=declAttrList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declAttrList.add(declAttrList346.getTree());

                    FUNCTION347=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcProtoDecl5546); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION347);


                    IDENTIFIER348=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_funcProtoDecl5548); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER348);


                    pushFollow(FOLLOW_typeParamOpt_in_funcProtoDecl5550);
                    typeParamOpt349=typeParamOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeParamOpt.add(typeParamOpt349.getTree());

                    LPAREN350=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcProtoDecl5552); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN350);


                    // Haxe.g:433:62: ( paramList )?
                    int alt95=2;
                    int LA95_0 = input.LA(1);

                    if ( (LA95_0==IDENTIFIER||LA95_0==QUES) ) {
                        alt95=1;
                    }
                    switch (alt95) {
                        case 1 :
                            // Haxe.g:433:62: paramList
                            {
                            pushFollow(FOLLOW_paramList_in_funcProtoDecl5554);
                            paramList351=paramList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_paramList.add(paramList351.getTree());

                            }
                            break;

                    }


                    RPAREN352=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcProtoDecl5557); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN352);


                    // Haxe.g:433:80: ( typeTag )?
                    int alt96=2;
                    int LA96_0 = input.LA(1);

                    if ( (LA96_0==COLON) ) {
                        alt96=1;
                    }
                    switch (alt96) {
                        case 1 :
                            // Haxe.g:433:80: typeTag
                            {
                            pushFollow(FOLLOW_typeTag_in_funcProtoDecl5559);
                            typeTag353=typeTag();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_typeTag.add(typeTag353.getTree());

                            }
                            break;

                    }


                    SEMI354=(Token)match(input,SEMI,FOLLOW_SEMI_in_funcProtoDecl5562); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI354);


                    // AST REWRITE
                    // elements: typeParamOpt, typeTag, paramList, declAttrList, FUNCTION, IDENTIFIER
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 434:13: -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTag )? ( declAttrList )? ( typeParamOpt )? )
                    {
                        // Haxe.g:434:16: ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTag )? ( declAttrList )? ( typeParamOpt )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_FUNCTION.nextNode()
                        , root_1);

                        // Haxe.g:434:27: ( IDENTIFIER )?
                        if ( stream_IDENTIFIER.hasNext() ) {
                            adaptor.addChild(root_1, 
                            stream_IDENTIFIER.nextNode()
                            );

                        }
                        stream_IDENTIFIER.reset();

                        // Haxe.g:434:39: ( paramList )?
                        if ( stream_paramList.hasNext() ) {
                            adaptor.addChild(root_1, stream_paramList.nextTree());

                        }
                        stream_paramList.reset();

                        // Haxe.g:434:50: ( typeTag )?
                        if ( stream_typeTag.hasNext() ) {
                            adaptor.addChild(root_1, stream_typeTag.nextTree());

                        }
                        stream_typeTag.reset();

                        // Haxe.g:434:59: ( declAttrList )?
                        if ( stream_declAttrList.hasNext() ) {
                            adaptor.addChild(root_1, stream_declAttrList.nextTree());

                        }
                        stream_declAttrList.reset();

                        // Haxe.g:434:73: ( typeParamOpt )?
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
                    // Haxe.g:435:9: FUNCTION NEW LPAREN ( paramList )? RPAREN ( typeTag )? SEMI
                    {
                    FUNCTION355=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcProtoDecl5606); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION355);


                    NEW356=(Token)match(input,NEW,FOLLOW_NEW_in_funcProtoDecl5608); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEW.add(NEW356);


                    LPAREN357=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcProtoDecl5610); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN357);


                    // Haxe.g:435:29: ( paramList )?
                    int alt97=2;
                    int LA97_0 = input.LA(1);

                    if ( (LA97_0==IDENTIFIER||LA97_0==QUES) ) {
                        alt97=1;
                    }
                    switch (alt97) {
                        case 1 :
                            // Haxe.g:435:29: paramList
                            {
                            pushFollow(FOLLOW_paramList_in_funcProtoDecl5612);
                            paramList358=paramList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_paramList.add(paramList358.getTree());

                            }
                            break;

                    }


                    RPAREN359=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcProtoDecl5615); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN359);


                    // Haxe.g:435:47: ( typeTag )?
                    int alt98=2;
                    int LA98_0 = input.LA(1);

                    if ( (LA98_0==COLON) ) {
                        alt98=1;
                    }
                    switch (alt98) {
                        case 1 :
                            // Haxe.g:435:47: typeTag
                            {
                            pushFollow(FOLLOW_typeTag_in_funcProtoDecl5617);
                            typeTag360=typeTag();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_typeTag.add(typeTag360.getTree());

                            }
                            break;

                    }


                    SEMI361=(Token)match(input,SEMI,FOLLOW_SEMI_in_funcProtoDecl5620); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI361);


                    // AST REWRITE
                    // elements: paramList, NEW, typeTag, FUNCTION
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 436:13: -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTag )? )
                    {
                        // Haxe.g:436:16: ^( FUNCTION ( NEW )? ( paramList )? ( typeTag )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_FUNCTION.nextNode()
                        , root_1);

                        // Haxe.g:436:27: ( NEW )?
                        if ( stream_NEW.hasNext() ) {
                            adaptor.addChild(root_1, 
                            stream_NEW.nextNode()
                            );

                        }
                        stream_NEW.reset();

                        // Haxe.g:436:32: ( paramList )?
                        if ( stream_paramList.hasNext() ) {
                            adaptor.addChild(root_1, stream_paramList.nextTree());

                        }
                        stream_paramList.reset();

                        // Haxe.g:436:43: ( typeTag )?
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
                    // Haxe.g:437:9: FUNCTION IDENTIFIER typeParamOpt LPAREN ( paramList )? RPAREN ( typeTag )? SEMI
                    {
                    FUNCTION362=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcProtoDecl5658); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION362);


                    IDENTIFIER363=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_funcProtoDecl5660); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER363);


                    pushFollow(FOLLOW_typeParamOpt_in_funcProtoDecl5662);
                    typeParamOpt364=typeParamOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeParamOpt.add(typeParamOpt364.getTree());

                    LPAREN365=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcProtoDecl5664); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN365);


                    // Haxe.g:437:49: ( paramList )?
                    int alt99=2;
                    int LA99_0 = input.LA(1);

                    if ( (LA99_0==IDENTIFIER||LA99_0==QUES) ) {
                        alt99=1;
                    }
                    switch (alt99) {
                        case 1 :
                            // Haxe.g:437:49: paramList
                            {
                            pushFollow(FOLLOW_paramList_in_funcProtoDecl5666);
                            paramList366=paramList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_paramList.add(paramList366.getTree());

                            }
                            break;

                    }


                    RPAREN367=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcProtoDecl5669); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN367);


                    // Haxe.g:437:67: ( typeTag )?
                    int alt100=2;
                    int LA100_0 = input.LA(1);

                    if ( (LA100_0==COLON) ) {
                        alt100=1;
                    }
                    switch (alt100) {
                        case 1 :
                            // Haxe.g:437:67: typeTag
                            {
                            pushFollow(FOLLOW_typeTag_in_funcProtoDecl5671);
                            typeTag368=typeTag();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_typeTag.add(typeTag368.getTree());

                            }
                            break;

                    }


                    SEMI369=(Token)match(input,SEMI,FOLLOW_SEMI_in_funcProtoDecl5674); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI369);


                    // AST REWRITE
                    // elements: typeTag, paramList, IDENTIFIER, FUNCTION, typeParamOpt
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 438:13: -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTag )? ( typeParamOpt )? )
                    {
                        // Haxe.g:438:16: ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTag )? ( typeParamOpt )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_FUNCTION.nextNode()
                        , root_1);

                        // Haxe.g:438:27: ( IDENTIFIER )?
                        if ( stream_IDENTIFIER.hasNext() ) {
                            adaptor.addChild(root_1, 
                            stream_IDENTIFIER.nextNode()
                            );

                        }
                        stream_IDENTIFIER.reset();

                        // Haxe.g:438:39: ( paramList )?
                        if ( stream_paramList.hasNext() ) {
                            adaptor.addChild(root_1, stream_paramList.nextTree());

                        }
                        stream_paramList.reset();

                        // Haxe.g:438:50: ( typeTag )?
                        if ( stream_typeTag.hasNext() ) {
                            adaptor.addChild(root_1, stream_typeTag.nextTree());

                        }
                        stream_typeTag.reset();

                        // Haxe.g:438:59: ( typeParamOpt )?
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
    // Haxe.g:441:1: interfaceDecl : ( topLevelAccess )? INTERFACE type inheritListOpt LBRACE ! interfaceBody RBRACE !;
    public final HaxeParser.interfaceDecl_return interfaceDecl() throws RecognitionException {
        HaxeParser.interfaceDecl_return retval = new HaxeParser.interfaceDecl_return();
        retval.start = input.LT(1);

        int interfaceDecl_StartIndex = input.index();

        Object root_0 = null;

        Token INTERFACE371=null;
        Token LBRACE374=null;
        Token RBRACE376=null;
        HaxeParser.topLevelAccess_return topLevelAccess370 =null;

        HaxeParser.type_return type372 =null;

        HaxeParser.inheritListOpt_return inheritListOpt373 =null;

        HaxeParser.interfaceBody_return interfaceBody375 =null;


        Object INTERFACE371_tree=null;
        Object LBRACE374_tree=null;
        Object RBRACE376_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 71) ) { return retval; }

            // Haxe.g:442:5: ( ( topLevelAccess )? INTERFACE type inheritListOpt LBRACE ! interfaceBody RBRACE !)
            // Haxe.g:442:9: ( topLevelAccess )? INTERFACE type inheritListOpt LBRACE ! interfaceBody RBRACE !
            {
            root_0 = (Object)adaptor.nil();


            // Haxe.g:442:9: ( topLevelAccess )?
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==EXTERN||LA102_0==PRIVATE) ) {
                alt102=1;
            }
            switch (alt102) {
                case 1 :
                    // Haxe.g:442:9: topLevelAccess
                    {
                    pushFollow(FOLLOW_topLevelAccess_in_interfaceDecl5733);
                    topLevelAccess370=topLevelAccess();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, topLevelAccess370.getTree());

                    }
                    break;

            }


            INTERFACE371=(Token)match(input,INTERFACE,FOLLOW_INTERFACE_in_interfaceDecl5736); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            INTERFACE371_tree = 
            (Object)adaptor.create(INTERFACE371)
            ;
            adaptor.addChild(root_0, INTERFACE371_tree);
            }

            pushFollow(FOLLOW_type_in_interfaceDecl5738);
            type372=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type372.getTree());

            pushFollow(FOLLOW_inheritListOpt_in_interfaceDecl5740);
            inheritListOpt373=inheritListOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, inheritListOpt373.getTree());

            LBRACE374=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_interfaceDecl5742); if (state.failed) return retval;

            pushFollow(FOLLOW_interfaceBody_in_interfaceDecl5745);
            interfaceBody375=interfaceBody();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceBody375.getTree());

            RBRACE376=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_interfaceDecl5747); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // Haxe.g:445:1: interfaceBody : ( varDecl interfaceBody | funcProtoDecl interfaceBody |);
    public final HaxeParser.interfaceBody_return interfaceBody() throws RecognitionException {
        HaxeParser.interfaceBody_return retval = new HaxeParser.interfaceBody_return();
        retval.start = input.LT(1);

        int interfaceBody_StartIndex = input.index();

        Object root_0 = null;

        HaxeParser.varDecl_return varDecl377 =null;

        HaxeParser.interfaceBody_return interfaceBody378 =null;

        HaxeParser.funcProtoDecl_return funcProtoDecl379 =null;

        HaxeParser.interfaceBody_return interfaceBody380 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 72) ) { return retval; }

            // Haxe.g:446:5: ( varDecl interfaceBody | funcProtoDecl interfaceBody |)
            int alt103=3;
            alt103 = dfa103.predict(input);
            switch (alt103) {
                case 1 :
                    // Haxe.g:446:9: varDecl interfaceBody
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_varDecl_in_interfaceBody5771);
                    varDecl377=varDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDecl377.getTree());

                    pushFollow(FOLLOW_interfaceBody_in_interfaceBody5773);
                    interfaceBody378=interfaceBody();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceBody378.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:447:9: funcProtoDecl interfaceBody
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_funcProtoDecl_in_interfaceBody5783);
                    funcProtoDecl379=funcProtoDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, funcProtoDecl379.getTree());

                    pushFollow(FOLLOW_interfaceBody_in_interfaceBody5785);
                    interfaceBody380=interfaceBody();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceBody380.getTree());

                    }
                    break;
                case 3 :
                    // Haxe.g:450:5: 
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
    // Haxe.g:452:1: inheritList : inherit ( COMMA ! inherit )* ;
    public final HaxeParser.inheritList_return inheritList() throws RecognitionException {
        HaxeParser.inheritList_return retval = new HaxeParser.inheritList_return();
        retval.start = input.LT(1);

        int inheritList_StartIndex = input.index();

        Object root_0 = null;

        Token COMMA382=null;
        HaxeParser.inherit_return inherit381 =null;

        HaxeParser.inherit_return inherit383 =null;


        Object COMMA382_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 73) ) { return retval; }

            // Haxe.g:453:5: ( inherit ( COMMA ! inherit )* )
            // Haxe.g:453:10: inherit ( COMMA ! inherit )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_inherit_in_inheritList5819);
            inherit381=inherit();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, inherit381.getTree());

            // Haxe.g:453:18: ( COMMA ! inherit )*
            loop104:
            do {
                int alt104=2;
                int LA104_0 = input.LA(1);

                if ( (LA104_0==COMMA) ) {
                    alt104=1;
                }


                switch (alt104) {
            	case 1 :
            	    // Haxe.g:453:19: COMMA ! inherit
            	    {
            	    COMMA382=(Token)match(input,COMMA,FOLLOW_COMMA_in_inheritList5822); if (state.failed) return retval;

            	    pushFollow(FOLLOW_inherit_in_inheritList5825);
            	    inherit383=inherit();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, inherit383.getTree());

            	    }
            	    break;

            	default :
            	    break loop104;
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
    // Haxe.g:456:1: inheritListOpt : ( inheritList -> ^( INHERIT_LIST_OPT[\"INHERIT_LIST_OPT\"] ( inheritList )? ) |);
    public final HaxeParser.inheritListOpt_return inheritListOpt() throws RecognitionException {
        HaxeParser.inheritListOpt_return retval = new HaxeParser.inheritListOpt_return();
        retval.start = input.LT(1);

        int inheritListOpt_StartIndex = input.index();

        Object root_0 = null;

        HaxeParser.inheritList_return inheritList384 =null;


        RewriteRuleSubtreeStream stream_inheritList=new RewriteRuleSubtreeStream(adaptor,"rule inheritList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 74) ) { return retval; }

            // Haxe.g:457:5: ( inheritList -> ^( INHERIT_LIST_OPT[\"INHERIT_LIST_OPT\"] ( inheritList )? ) |)
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( (LA105_0==EXTENDS||LA105_0==IMPLEMENTS) ) {
                alt105=1;
            }
            else if ( (LA105_0==LBRACE) ) {
                alt105=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 105, 0, input);

                throw nvae;

            }
            switch (alt105) {
                case 1 :
                    // Haxe.g:457:10: inheritList
                    {
                    pushFollow(FOLLOW_inheritList_in_inheritListOpt5855);
                    inheritList384=inheritList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_inheritList.add(inheritList384.getTree());

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
                    // 457:22: -> ^( INHERIT_LIST_OPT[\"INHERIT_LIST_OPT\"] ( inheritList )? )
                    {
                        // Haxe.g:457:25: ^( INHERIT_LIST_OPT[\"INHERIT_LIST_OPT\"] ( inheritList )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        new HaxeTree(INHERIT_LIST_OPT, "INHERIT_LIST_OPT")
                        , root_1);

                        // Haxe.g:457:74: ( inheritList )?
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
                    // Haxe.g:459:5: 
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
    // Haxe.g:461:1: inherit : ( EXTENDS type -> ^( EXTENDS ( type )? ) | IMPLEMENTS type -> ^( IMPLEMENTS ( type )? ) );
    public final HaxeParser.inherit_return inherit() throws RecognitionException {
        HaxeParser.inherit_return retval = new HaxeParser.inherit_return();
        retval.start = input.LT(1);

        int inherit_StartIndex = input.index();

        Object root_0 = null;

        Token EXTENDS385=null;
        Token IMPLEMENTS387=null;
        HaxeParser.type_return type386 =null;

        HaxeParser.type_return type388 =null;


        Object EXTENDS385_tree=null;
        Object IMPLEMENTS387_tree=null;
        RewriteRuleTokenStream stream_IMPLEMENTS=new RewriteRuleTokenStream(adaptor,"token IMPLEMENTS");
        RewriteRuleTokenStream stream_EXTENDS=new RewriteRuleTokenStream(adaptor,"token EXTENDS");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 75) ) { return retval; }

            // Haxe.g:461:12: ( EXTENDS type -> ^( EXTENDS ( type )? ) | IMPLEMENTS type -> ^( IMPLEMENTS ( type )? ) )
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( (LA106_0==EXTENDS) ) {
                alt106=1;
            }
            else if ( (LA106_0==IMPLEMENTS) ) {
                alt106=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 106, 0, input);

                throw nvae;

            }
            switch (alt106) {
                case 1 :
                    // Haxe.g:461:17: EXTENDS type
                    {
                    EXTENDS385=(Token)match(input,EXTENDS,FOLLOW_EXTENDS_in_inherit5901); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EXTENDS.add(EXTENDS385);


                    pushFollow(FOLLOW_type_in_inherit5903);
                    type386=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type386.getTree());

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
                    // 461:34: -> ^( EXTENDS ( type )? )
                    {
                        // Haxe.g:461:37: ^( EXTENDS ( type )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_EXTENDS.nextNode()
                        , root_1);

                        // Haxe.g:461:47: ( type )?
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
                    // Haxe.g:462:14: IMPLEMENTS type
                    {
                    IMPLEMENTS387=(Token)match(input,IMPLEMENTS,FOLLOW_IMPLEMENTS_in_inherit5931); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IMPLEMENTS.add(IMPLEMENTS387);


                    pushFollow(FOLLOW_type_in_inherit5933);
                    type388=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type388.getTree());

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
                    // 462:30: -> ^( IMPLEMENTS ( type )? )
                    {
                        // Haxe.g:462:33: ^( IMPLEMENTS ( type )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_IMPLEMENTS.nextNode()
                        , root_1);

                        // Haxe.g:462:46: ( type )?
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
    // Haxe.g:465:1: typedefDecl : TYPEDEF IDENTIFIER EQ funcType ;
    public final HaxeParser.typedefDecl_return typedefDecl() throws RecognitionException {
        HaxeParser.typedefDecl_return retval = new HaxeParser.typedefDecl_return();
        retval.start = input.LT(1);

        int typedefDecl_StartIndex = input.index();

        Object root_0 = null;

        Token TYPEDEF389=null;
        Token IDENTIFIER390=null;
        Token EQ391=null;
        HaxeParser.funcType_return funcType392 =null;


        Object TYPEDEF389_tree=null;
        Object IDENTIFIER390_tree=null;
        Object EQ391_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 76) ) { return retval; }

            // Haxe.g:466:5: ( TYPEDEF IDENTIFIER EQ funcType )
            // Haxe.g:466:10: TYPEDEF IDENTIFIER EQ funcType
            {
            root_0 = (Object)adaptor.nil();


            TYPEDEF389=(Token)match(input,TYPEDEF,FOLLOW_TYPEDEF_in_typedefDecl5973); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TYPEDEF389_tree = 
            (Object)adaptor.create(TYPEDEF389)
            ;
            adaptor.addChild(root_0, TYPEDEF389_tree);
            }

            IDENTIFIER390=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_typedefDecl5975); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER390_tree = 
            (Object)adaptor.create(IDENTIFIER390)
            ;
            adaptor.addChild(root_0, IDENTIFIER390_tree);
            }

            EQ391=(Token)match(input,EQ,FOLLOW_EQ_in_typedefDecl5977); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            EQ391_tree = 
            (Object)adaptor.create(EQ391)
            ;
            adaptor.addChild(root_0, EQ391_tree);
            }

            pushFollow(FOLLOW_funcType_in_typedefDecl5979);
            funcType392=funcType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, funcType392.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // Haxe.g:469:1: typeExtend : GT funcType COMMA !;
    public final HaxeParser.typeExtend_return typeExtend() throws RecognitionException {
        HaxeParser.typeExtend_return retval = new HaxeParser.typeExtend_return();
        retval.start = input.LT(1);

        int typeExtend_StartIndex = input.index();

        Object root_0 = null;

        Token GT393=null;
        Token COMMA395=null;
        HaxeParser.funcType_return funcType394 =null;


        Object GT393_tree=null;
        Object COMMA395_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 77) ) { return retval; }

            // Haxe.g:470:5: ( GT funcType COMMA !)
            // Haxe.g:470:10: GT funcType COMMA !
            {
            root_0 = (Object)adaptor.nil();


            GT393=(Token)match(input,GT,FOLLOW_GT_in_typeExtend6003); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            GT393_tree = 
            (Object)adaptor.create(GT393)
            ;
            adaptor.addChild(root_0, GT393_tree);
            }

            pushFollow(FOLLOW_funcType_in_typeExtend6005);
            funcType394=funcType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, funcType394.getTree());

            COMMA395=(Token)match(input,COMMA,FOLLOW_COMMA_in_typeExtend6007); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // Haxe.g:473:1: anonType : LBRACE ! (| anonTypeFieldList | varDeclList | typeExtend (| anonTypeFieldList | varDeclList ) ) RBRACE !;
    public final HaxeParser.anonType_return anonType() throws RecognitionException {
        HaxeParser.anonType_return retval = new HaxeParser.anonType_return();
        retval.start = input.LT(1);

        int anonType_StartIndex = input.index();

        Object root_0 = null;

        Token LBRACE396=null;
        Token RBRACE402=null;
        HaxeParser.anonTypeFieldList_return anonTypeFieldList397 =null;

        HaxeParser.varDeclList_return varDeclList398 =null;

        HaxeParser.typeExtend_return typeExtend399 =null;

        HaxeParser.anonTypeFieldList_return anonTypeFieldList400 =null;

        HaxeParser.varDeclList_return varDeclList401 =null;


        Object LBRACE396_tree=null;
        Object RBRACE402_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 78) ) { return retval; }

            // Haxe.g:474:5: ( LBRACE ! (| anonTypeFieldList | varDeclList | typeExtend (| anonTypeFieldList | varDeclList ) ) RBRACE !)
            // Haxe.g:474:9: LBRACE ! (| anonTypeFieldList | varDeclList | typeExtend (| anonTypeFieldList | varDeclList ) ) RBRACE !
            {
            root_0 = (Object)adaptor.nil();


            LBRACE396=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_anonType6031); if (state.failed) return retval;

            // Haxe.g:475:13: (| anonTypeFieldList | varDeclList | typeExtend (| anonTypeFieldList | varDeclList ) )
            int alt108=4;
            switch ( input.LA(1) ) {
            case RBRACE:
                {
                alt108=1;
                }
                break;
            case IDENTIFIER:
                {
                alt108=2;
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
                alt108=3;
                }
                break;
            case GT:
                {
                alt108=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 108, 0, input);

                throw nvae;

            }

            switch (alt108) {
                case 1 :
                    // Haxe.g:476:13: 
                    {
                    }
                    break;
                case 2 :
                    // Haxe.g:476:17: anonTypeFieldList
                    {
                    pushFollow(FOLLOW_anonTypeFieldList_in_anonType6065);
                    anonTypeFieldList397=anonTypeFieldList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, anonTypeFieldList397.getTree());

                    }
                    break;
                case 3 :
                    // Haxe.g:477:17: varDeclList
                    {
                    pushFollow(FOLLOW_varDeclList_in_anonType6084);
                    varDeclList398=varDeclList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclList398.getTree());

                    }
                    break;
                case 4 :
                    // Haxe.g:478:17: typeExtend (| anonTypeFieldList | varDeclList )
                    {
                    pushFollow(FOLLOW_typeExtend_in_anonType6103);
                    typeExtend399=typeExtend();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeExtend399.getTree());

                    // Haxe.g:478:28: (| anonTypeFieldList | varDeclList )
                    int alt107=3;
                    switch ( input.LA(1) ) {
                    case RBRACE:
                        {
                        alt107=1;
                        }
                        break;
                    case IDENTIFIER:
                        {
                        alt107=2;
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
                        alt107=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 107, 0, input);

                        throw nvae;

                    }

                    switch (alt107) {
                        case 1 :
                            // Haxe.g:479:25: 
                            {
                            }
                            break;
                        case 2 :
                            // Haxe.g:479:29: anonTypeFieldList
                            {
                            pushFollow(FOLLOW_anonTypeFieldList_in_anonType6135);
                            anonTypeFieldList400=anonTypeFieldList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, anonTypeFieldList400.getTree());

                            }
                            break;
                        case 3 :
                            // Haxe.g:480:29: varDeclList
                            {
                            pushFollow(FOLLOW_varDeclList_in_anonType6165);
                            varDeclList401=varDeclList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclList401.getTree());

                            }
                            break;

                    }


                    }
                    break;

            }


            RBRACE402=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_anonType6192); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // Haxe.g:485:1: anonTypeFieldList : anonTypeField ( COMMA ! anonTypeField )* ;
    public final HaxeParser.anonTypeFieldList_return anonTypeFieldList() throws RecognitionException {
        HaxeParser.anonTypeFieldList_return retval = new HaxeParser.anonTypeFieldList_return();
        retval.start = input.LT(1);

        int anonTypeFieldList_StartIndex = input.index();

        Object root_0 = null;

        Token COMMA404=null;
        HaxeParser.anonTypeField_return anonTypeField403 =null;

        HaxeParser.anonTypeField_return anonTypeField405 =null;


        Object COMMA404_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 79) ) { return retval; }

            // Haxe.g:486:5: ( anonTypeField ( COMMA ! anonTypeField )* )
            // Haxe.g:486:10: anonTypeField ( COMMA ! anonTypeField )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_anonTypeField_in_anonTypeFieldList6218);
            anonTypeField403=anonTypeField();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, anonTypeField403.getTree());

            // Haxe.g:486:24: ( COMMA ! anonTypeField )*
            loop109:
            do {
                int alt109=2;
                int LA109_0 = input.LA(1);

                if ( (LA109_0==COMMA) ) {
                    alt109=1;
                }


                switch (alt109) {
            	case 1 :
            	    // Haxe.g:486:25: COMMA ! anonTypeField
            	    {
            	    COMMA404=(Token)match(input,COMMA,FOLLOW_COMMA_in_anonTypeFieldList6221); if (state.failed) return retval;

            	    pushFollow(FOLLOW_anonTypeField_in_anonTypeFieldList6224);
            	    anonTypeField405=anonTypeField();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, anonTypeField405.getTree());

            	    }
            	    break;

            	default :
            	    break loop109;
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
    // Haxe.g:489:1: objLit : '{' ! objLitElemList '}' !;
    public final HaxeParser.objLit_return objLit() throws RecognitionException {
        HaxeParser.objLit_return retval = new HaxeParser.objLit_return();
        retval.start = input.LT(1);

        int objLit_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal406=null;
        Token char_literal408=null;
        HaxeParser.objLitElemList_return objLitElemList407 =null;


        Object char_literal406_tree=null;
        Object char_literal408_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 80) ) { return retval; }

            // Haxe.g:489:9: ( '{' ! objLitElemList '}' !)
            // Haxe.g:489:11: '{' ! objLitElemList '}' !
            {
            root_0 = (Object)adaptor.nil();


            char_literal406=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_objLit6240); if (state.failed) return retval;

            pushFollow(FOLLOW_objLitElemList_in_objLit6243);
            objLitElemList407=objLitElemList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, objLitElemList407.getTree());

            char_literal408=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_objLit6245); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // Haxe.g:492:1: anonTypeField : IDENTIFIER COLON ! funcType ;
    public final HaxeParser.anonTypeField_return anonTypeField() throws RecognitionException {
        HaxeParser.anonTypeField_return retval = new HaxeParser.anonTypeField_return();
        retval.start = input.LT(1);

        int anonTypeField_StartIndex = input.index();

        Object root_0 = null;

        Token IDENTIFIER409=null;
        Token COLON410=null;
        HaxeParser.funcType_return funcType411 =null;


        Object IDENTIFIER409_tree=null;
        Object COLON410_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 81) ) { return retval; }

            // Haxe.g:493:5: ( IDENTIFIER COLON ! funcType )
            // Haxe.g:493:10: IDENTIFIER COLON ! funcType
            {
            root_0 = (Object)adaptor.nil();


            IDENTIFIER409=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_anonTypeField6270); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER409_tree = 
            (Object)adaptor.create(IDENTIFIER409)
            ;
            adaptor.addChild(root_0, IDENTIFIER409_tree);
            }

            COLON410=(Token)match(input,COLON,FOLLOW_COLON_in_anonTypeField6272); if (state.failed) return retval;

            pushFollow(FOLLOW_funcType_in_anonTypeField6275);
            funcType411=funcType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, funcType411.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // Haxe.g:496:1: objLitElemList : objLitElem ( COMMA ! objLitElem )* ;
    public final HaxeParser.objLitElemList_return objLitElemList() throws RecognitionException {
        HaxeParser.objLitElemList_return retval = new HaxeParser.objLitElemList_return();
        retval.start = input.LT(1);

        int objLitElemList_StartIndex = input.index();

        Object root_0 = null;

        Token COMMA413=null;
        HaxeParser.objLitElem_return objLitElem412 =null;

        HaxeParser.objLitElem_return objLitElem414 =null;


        Object COMMA413_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 82) ) { return retval; }

            // Haxe.g:497:5: ( objLitElem ( COMMA ! objLitElem )* )
            // Haxe.g:497:10: objLitElem ( COMMA ! objLitElem )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_objLitElem_in_objLitElemList6303);
            objLitElem412=objLitElem();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, objLitElem412.getTree());

            // Haxe.g:497:21: ( COMMA ! objLitElem )*
            loop110:
            do {
                int alt110=2;
                int LA110_0 = input.LA(1);

                if ( (LA110_0==COMMA) ) {
                    alt110=1;
                }


                switch (alt110) {
            	case 1 :
            	    // Haxe.g:497:22: COMMA ! objLitElem
            	    {
            	    COMMA413=(Token)match(input,COMMA,FOLLOW_COMMA_in_objLitElemList6306); if (state.failed) return retval;

            	    pushFollow(FOLLOW_objLitElem_in_objLitElemList6309);
            	    objLitElem414=objLitElem();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, objLitElem414.getTree());

            	    }
            	    break;

            	default :
            	    break loop110;
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
    // Haxe.g:500:1: objLitElem : IDENTIFIER COLON ! expr ;
    public final HaxeParser.objLitElem_return objLitElem() throws RecognitionException {
        HaxeParser.objLitElem_return retval = new HaxeParser.objLitElem_return();
        retval.start = input.LT(1);

        int objLitElem_StartIndex = input.index();

        Object root_0 = null;

        Token IDENTIFIER415=null;
        Token COLON416=null;
        HaxeParser.expr_return expr417 =null;


        Object IDENTIFIER415_tree=null;
        Object COLON416_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 83) ) { return retval; }

            // Haxe.g:501:5: ( IDENTIFIER COLON ! expr )
            // Haxe.g:501:10: IDENTIFIER COLON ! expr
            {
            root_0 = (Object)adaptor.nil();


            IDENTIFIER415=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_objLitElem6335); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER415_tree = 
            (Object)adaptor.create(IDENTIFIER415)
            ;
            adaptor.addChild(root_0, IDENTIFIER415_tree);
            }

            COLON416=(Token)match(input,COLON,FOLLOW_COLON_in_objLitElem6337); if (state.failed) return retval;

            pushFollow(FOLLOW_expr_in_objLitElem6340);
            expr417=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr417.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // Haxe.g:504:1: elementarySymbol : ( LONGLITERAL -> LONGLITERAL[$LONGLITERAL, \"INT\"] | NULL -> ^( NULL[$NULL,\"Unknown<0>\"] ) | INTLITERAL -> INTLITERAL[$INTLITERAL, \"INT\"] | STRINGLITERAL -> STRINGLITERAL[$STRINGLITERAL,\"STRING\"] | CHARLITERAL -> CHARLITERAL[$CHARLITERAL, \"STRING\"] | FLOATNUM -> FLOATNUM[$FLOATNUM, \"FLOAT\"] | TRUE -> TRUE[$TRUE,\"BOOL\"] | FALSE -> FALSE[$FALSE,\"BOOL\"] );
    public final HaxeParser.elementarySymbol_return elementarySymbol() throws RecognitionException {
        HaxeParser.elementarySymbol_return retval = new HaxeParser.elementarySymbol_return();
        retval.start = input.LT(1);

        int elementarySymbol_StartIndex = input.index();

        Object root_0 = null;

        Token LONGLITERAL418=null;
        Token NULL419=null;
        Token INTLITERAL420=null;
        Token STRINGLITERAL421=null;
        Token CHARLITERAL422=null;
        Token FLOATNUM423=null;
        Token TRUE424=null;
        Token FALSE425=null;

        Object LONGLITERAL418_tree=null;
        Object NULL419_tree=null;
        Object INTLITERAL420_tree=null;
        Object STRINGLITERAL421_tree=null;
        Object CHARLITERAL422_tree=null;
        Object FLOATNUM423_tree=null;
        Object TRUE424_tree=null;
        Object FALSE425_tree=null;
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

            // Haxe.g:505:5: ( LONGLITERAL -> LONGLITERAL[$LONGLITERAL, \"INT\"] | NULL -> ^( NULL[$NULL,\"Unknown<0>\"] ) | INTLITERAL -> INTLITERAL[$INTLITERAL, \"INT\"] | STRINGLITERAL -> STRINGLITERAL[$STRINGLITERAL,\"STRING\"] | CHARLITERAL -> CHARLITERAL[$CHARLITERAL, \"STRING\"] | FLOATNUM -> FLOATNUM[$FLOATNUM, \"FLOAT\"] | TRUE -> TRUE[$TRUE,\"BOOL\"] | FALSE -> FALSE[$FALSE,\"BOOL\"] )
            int alt111=8;
            switch ( input.LA(1) ) {
            case LONGLITERAL:
                {
                alt111=1;
                }
                break;
            case NULL:
                {
                alt111=2;
                }
                break;
            case INTLITERAL:
                {
                alt111=3;
                }
                break;
            case STRINGLITERAL:
                {
                alt111=4;
                }
                break;
            case CHARLITERAL:
                {
                alt111=5;
                }
                break;
            case FLOATNUM:
                {
                alt111=6;
                }
                break;
            case TRUE:
                {
                alt111=7;
                }
                break;
            case FALSE:
                {
                alt111=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 111, 0, input);

                throw nvae;

            }

            switch (alt111) {
                case 1 :
                    // Haxe.g:505:9: LONGLITERAL
                    {
                    LONGLITERAL418=(Token)match(input,LONGLITERAL,FOLLOW_LONGLITERAL_in_elementarySymbol6363); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LONGLITERAL.add(LONGLITERAL418);


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
                    // 505:24: -> LONGLITERAL[$LONGLITERAL, \"INT\"]
                    {
                        adaptor.addChild(root_0, 
                        new ConstantNode(LONGLITERAL, LONGLITERAL418, "INT")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // Haxe.g:506:9: NULL
                    {
                    NULL419=(Token)match(input,NULL,FOLLOW_NULL_in_elementarySymbol6384); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NULL.add(NULL419);


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
                    // 506:14: -> ^( NULL[$NULL,\"Unknown<0>\"] )
                    {
                        // Haxe.g:506:17: ^( NULL[$NULL,\"Unknown<0>\"] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        new ConstantNode(NULL, NULL419, "Unknown<0>")
                        , root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 3 :
                    // Haxe.g:507:9: INTLITERAL
                    {
                    INTLITERAL420=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_elementarySymbol6404); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INTLITERAL.add(INTLITERAL420);


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
                    // 507:23: -> INTLITERAL[$INTLITERAL, \"INT\"]
                    {
                        adaptor.addChild(root_0, 
                        new ConstantNode(INTLITERAL, INTLITERAL420, "INT")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 4 :
                    // Haxe.g:508:9: STRINGLITERAL
                    {
                    STRINGLITERAL421=(Token)match(input,STRINGLITERAL,FOLLOW_STRINGLITERAL_in_elementarySymbol6425); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STRINGLITERAL.add(STRINGLITERAL421);


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
                    // 508:26: -> STRINGLITERAL[$STRINGLITERAL,\"STRING\"]
                    {
                        adaptor.addChild(root_0, 
                        new ConstantNode(STRINGLITERAL, STRINGLITERAL421, "STRING")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 5 :
                    // Haxe.g:509:9: CHARLITERAL
                    {
                    CHARLITERAL422=(Token)match(input,CHARLITERAL,FOLLOW_CHARLITERAL_in_elementarySymbol6446); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CHARLITERAL.add(CHARLITERAL422);


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
                    // 509:24: -> CHARLITERAL[$CHARLITERAL, \"STRING\"]
                    {
                        adaptor.addChild(root_0, 
                        new ConstantNode(CHARLITERAL, CHARLITERAL422, "STRING")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 6 :
                    // Haxe.g:510:9: FLOATNUM
                    {
                    FLOATNUM423=(Token)match(input,FLOATNUM,FOLLOW_FLOATNUM_in_elementarySymbol6467); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FLOATNUM.add(FLOATNUM423);


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
                    // 510:21: -> FLOATNUM[$FLOATNUM, \"FLOAT\"]
                    {
                        adaptor.addChild(root_0, 
                        new ConstantNode(FLOATNUM, FLOATNUM423, "FLOAT")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 7 :
                    // Haxe.g:511:9: TRUE
                    {
                    TRUE424=(Token)match(input,TRUE,FOLLOW_TRUE_in_elementarySymbol6488); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TRUE.add(TRUE424);


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
                    // 511:21: -> TRUE[$TRUE,\"BOOL\"]
                    {
                        adaptor.addChild(root_0, 
                        new ConstantNode(TRUE, TRUE424, "BOOL")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 8 :
                    // Haxe.g:512:9: FALSE
                    {
                    FALSE425=(Token)match(input,FALSE,FOLLOW_FALSE_in_elementarySymbol6513); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FALSE.add(FALSE425);


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
                    // 512:22: -> FALSE[$FALSE,\"BOOL\"]
                    {
                        adaptor.addChild(root_0, 
                        new ConstantNode(FALSE, FALSE425, "BOOL")
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
        // Haxe.g:190:57: ( typeParam )
        // Haxe.g:190:57: typeParam
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
        // Haxe.g:190:14: ( ( anonType | dotIdent | primitiveType ) ( typeParam )* )
        // Haxe.g:190:14: ( anonType | dotIdent | primitiveType ) ( typeParam )*
        {
        // Haxe.g:190:14: ( anonType | dotIdent | primitiveType )
        int alt114=3;
        switch ( input.LA(1) ) {
        case LBRACE:
            {
            alt114=1;
            }
            break;
        case IDENTIFIER:
        case THIS:
            {
            alt114=2;
            }
            break;
        case BOOLEAN:
        case DYNAMIC:
        case FLOAT:
        case INT:
        case VOID:
            {
            alt114=3;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 114, 0, input);

            throw nvae;

        }

        switch (alt114) {
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
                // Haxe.g:190:27: dotIdent
                {
                pushFollow(FOLLOW_dotIdent_in_synpred50_Haxe1703);
                dotIdent();

                state._fsp--;
                if (state.failed) return ;

                }
                break;
            case 3 :
                // Haxe.g:190:39: primitiveType
                {
                pushFollow(FOLLOW_primitiveType_in_synpred50_Haxe1708);
                primitiveType();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        // Haxe.g:190:56: ( typeParam )*
        loop115:
        do {
            int alt115=2;
            int LA115_0 = input.LA(1);

            if ( (LA115_0==LT) ) {
                alt115=1;
            }


            switch (alt115) {
        	case 1 :
        	    // Haxe.g:190:57: typeParam
        	    {
        	    pushFollow(FOLLOW_typeParam_in_synpred50_Haxe1714);
        	    typeParam();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop115;
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

    // $ANTLR start synpred80_Haxe
    public final void synpred80_Haxe_fragment() throws RecognitionException {
        // Haxe.g:240:10: ( classDecl )
        // Haxe.g:240:10: classDecl
        {
        pushFollow(FOLLOW_classDecl_in_synpred80_Haxe2584);
        classDecl();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred80_Haxe

    // $ANTLR start synpred107_Haxe
    public final void synpred107_Haxe_fragment() throws RecognitionException {
        // Haxe.g:322:10: ( suffixExpr )
        // Haxe.g:322:10: suffixExpr
        {
        pushFollow(FOLLOW_suffixExpr_in_synpred107_Haxe3835);
        suffixExpr();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred107_Haxe

    // $ANTLR start synpred116_Haxe
    public final void synpred116_Haxe_fragment() throws RecognitionException {
        // Haxe.g:334:10: ( value methodCallOrSliceList )
        // Haxe.g:334:10: value methodCallOrSliceList
        {
        pushFollow(FOLLOW_value_in_synpred116_Haxe3951);
        value();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_methodCallOrSliceList_in_synpred116_Haxe3953);
        methodCallOrSliceList();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred116_Haxe

    // $ANTLR start synpred117_Haxe
    public final void synpred117_Haxe_fragment() throws RecognitionException {
        // Haxe.g:335:10: ( value PLUSPLUS )
        // Haxe.g:335:10: value PLUSPLUS
        {
        pushFollow(FOLLOW_value_in_synpred117_Haxe3980);
        value();

        state._fsp--;
        if (state.failed) return ;

        match(input,PLUSPLUS,FOLLOW_PLUSPLUS_in_synpred117_Haxe3982); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred117_Haxe

    // $ANTLR start synpred120_Haxe
    public final void synpred120_Haxe_fragment() throws RecognitionException {
        // Haxe.g:351:10: ( methodCallOrSlice methodCallOrSliceList )
        // Haxe.g:351:10: methodCallOrSlice methodCallOrSliceList
        {
        pushFollow(FOLLOW_methodCallOrSlice_in_synpred120_Haxe4266);
        methodCallOrSlice();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_methodCallOrSliceList_in_synpred120_Haxe4268);
        methodCallOrSliceList();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred120_Haxe

    // $ANTLR start synpred123_Haxe
    public final void synpred123_Haxe_fragment() throws RecognitionException {
        // Haxe.g:360:18: ( expr )
        // Haxe.g:360:18: expr
        {
        pushFollow(FOLLOW_expr_in_synpred123_Haxe4332);
        expr();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred123_Haxe

    // $ANTLR start synpred127_Haxe
    public final void synpred127_Haxe_fragment() throws RecognitionException {
        // Haxe.g:369:9: ( CAST LPAREN expr ( COMMA funcType )? RPAREN )
        // Haxe.g:369:9: CAST LPAREN expr ( COMMA funcType )? RPAREN
        {
        match(input,CAST,FOLLOW_CAST_in_synpred127_Haxe4424); if (state.failed) return ;

        match(input,LPAREN,FOLLOW_LPAREN_in_synpred127_Haxe4426); if (state.failed) return ;

        pushFollow(FOLLOW_expr_in_synpred127_Haxe4428);
        expr();

        state._fsp--;
        if (state.failed) return ;

        // Haxe.g:369:26: ( COMMA funcType )?
        int alt125=2;
        int LA125_0 = input.LA(1);

        if ( (LA125_0==COMMA) ) {
            alt125=1;
        }
        switch (alt125) {
            case 1 :
                // Haxe.g:369:27: COMMA funcType
                {
                match(input,COMMA,FOLLOW_COMMA_in_synpred127_Haxe4431); if (state.failed) return ;

                pushFollow(FOLLOW_funcType_in_synpred127_Haxe4433);
                funcType();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        match(input,RPAREN,FOLLOW_RPAREN_in_synpred127_Haxe4437); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred127_Haxe

    // Delegated rules

    public final boolean synpred127_Haxe() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred127_Haxe_fragment(); // can never throw exception
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
    public final boolean synpred123_Haxe() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred123_Haxe_fragment(); // can never throw exception
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
    public final boolean synpred80_Haxe() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred80_Haxe_fragment(); // can never throw exception
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


    protected DFA79 dfa79 = new DFA79(this);
    protected DFA92 dfa92 = new DFA92(this);
    protected DFA101 dfa101 = new DFA101(this);
    protected DFA103 dfa103 = new DFA103(this);
    static final String DFA79_eotS =
        "\10\uffff";
    static final String DFA79_eofS =
        "\10\uffff";
    static final String DFA79_minS =
        "\6\45\2\uffff";
    static final String DFA79_maxS =
        "\6\u009f\2\uffff";
    static final String DFA79_acceptS =
        "\6\uffff\1\1\1\2";
    static final String DFA79_specialS =
        "\10\uffff}>";
    static final String[] DFA79_transitionS = {
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
            return "398:1: classMember : ( varDecl | funcDecl );";
        }
    }
    static final String DFA92_eotS =
        "\11\uffff";
    static final String DFA92_eofS =
        "\11\uffff";
    static final String DFA92_minS =
        "\6\45\1\105\2\uffff";
    static final String DFA92_maxS =
        "\6\u0088\1\141\2\uffff";
    static final String DFA92_acceptS =
        "\7\uffff\1\1\1\2";
    static final String DFA92_specialS =
        "\11\uffff}>";
    static final String[] DFA92_transitionS = {
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

    static final short[] DFA92_eot = DFA.unpackEncodedString(DFA92_eotS);
    static final short[] DFA92_eof = DFA.unpackEncodedString(DFA92_eofS);
    static final char[] DFA92_min = DFA.unpackEncodedStringToUnsignedChars(DFA92_minS);
    static final char[] DFA92_max = DFA.unpackEncodedStringToUnsignedChars(DFA92_maxS);
    static final short[] DFA92_accept = DFA.unpackEncodedString(DFA92_acceptS);
    static final short[] DFA92_special = DFA.unpackEncodedString(DFA92_specialS);
    static final short[][] DFA92_transition;

    static {
        int numStates = DFA92_transitionS.length;
        DFA92_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA92_transition[i] = DFA.unpackEncodedString(DFA92_transitionS[i]);
        }
    }

    class DFA92 extends DFA {

        public DFA92(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 92;
            this.eot = DFA92_eot;
            this.eof = DFA92_eof;
            this.min = DFA92_min;
            this.max = DFA92_max;
            this.accept = DFA92_accept;
            this.special = DFA92_special;
            this.transition = DFA92_transition;
        }
        public String getDescription() {
            return "424:1: funcDecl : ( ( declAttrList )? FUNCTION NEW LPAREN ( paramList )? RPAREN ( typeTag )? block -> ^( FUNCTION NEW ( declAttrList )? ( paramList )? ( typeTag )? ( block )? ) | ( declAttrList )? FUNCTION IDENTIFIER typeParamOpt LPAREN ( paramList )? RPAREN ( typeTag )? block -> ^( FUNCTION IDENTIFIER ( declAttrList )? ( paramList )? ( typeTag )? ( block )? ( typeParamOpt )? ) );";
        }
    }
    static final String DFA101_eotS =
        "\14\uffff";
    static final String DFA101_eofS =
        "\14\uffff";
    static final String DFA101_minS =
        "\6\45\2\105\4\uffff";
    static final String DFA101_maxS =
        "\6\u0088\2\141\4\uffff";
    static final String DFA101_acceptS =
        "\10\uffff\1\3\1\4\1\1\1\2";
    static final String DFA101_specialS =
        "\14\uffff}>";
    static final String[] DFA101_transitionS = {
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
            return "430:1: funcProtoDecl : ( declAttrList FUNCTION NEW LPAREN ( paramList )? RPAREN ( typeTag )? SEMI -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTag )? ( declAttrList )? ) | declAttrList FUNCTION IDENTIFIER typeParamOpt LPAREN ( paramList )? RPAREN ( typeTag )? SEMI -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTag )? ( declAttrList )? ( typeParamOpt )? ) | FUNCTION NEW LPAREN ( paramList )? RPAREN ( typeTag )? SEMI -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTag )? ) | FUNCTION IDENTIFIER typeParamOpt LPAREN ( paramList )? RPAREN ( typeTag )? SEMI -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTag )? ( typeParamOpt )? ) );";
        }
    }
    static final String DFA103_eotS =
        "\11\uffff";
    static final String DFA103_eofS =
        "\1\10\10\uffff";
    static final String DFA103_minS =
        "\6\45\3\uffff";
    static final String DFA103_maxS =
        "\6\u009f\3\uffff";
    static final String DFA103_acceptS =
        "\6\uffff\1\1\1\2\1\3";
    static final String DFA103_specialS =
        "\11\uffff}>";
    static final String[] DFA103_transitionS = {
            "\1\3\23\uffff\1\7\22\uffff\1\2\27\uffff\1\4\24\uffff\1\5\2\uffff"+
            "\1\5\1\uffff\1\10\11\uffff\1\1\26\uffff\1\6",
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
            "",
            ""
    };

    static final short[] DFA103_eot = DFA.unpackEncodedString(DFA103_eotS);
    static final short[] DFA103_eof = DFA.unpackEncodedString(DFA103_eofS);
    static final char[] DFA103_min = DFA.unpackEncodedStringToUnsignedChars(DFA103_minS);
    static final char[] DFA103_max = DFA.unpackEncodedStringToUnsignedChars(DFA103_maxS);
    static final short[] DFA103_accept = DFA.unpackEncodedString(DFA103_acceptS);
    static final short[] DFA103_special = DFA.unpackEncodedString(DFA103_specialS);
    static final short[][] DFA103_transition;

    static {
        int numStates = DFA103_transitionS.length;
        DFA103_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA103_transition[i] = DFA.unpackEncodedString(DFA103_transitionS[i]);
        }
    }

    class DFA103 extends DFA {

        public DFA103(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 103;
            this.eot = DFA103_eot;
            this.eof = DFA103_eof;
            this.min = DFA103_min;
            this.max = DFA103_max;
            this.accept = DFA103_accept;
            this.special = DFA103_special;
            this.transition = DFA103_transition;
        }
        public String getDescription() {
            return "445:1: interfaceBody : ( varDecl interfaceBody | funcProtoDecl interfaceBody |);";
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
    public static final BitSet FOLLOW_LBRACKET_in_arrayLit1445 = new BitSet(new long[]{0x0288000002400200L,0x80000A0600C90020L,0x0000000020522C00L});
    public static final BitSet FOLLOW_exprList_in_arrayLit1448 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_RBRACKET_in_arrayLit1451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_in_typeTag1496 = new BitSet(new long[]{0x0040002000010000L,0x0000000020084020L,0x0000000200020000L});
    public static final BitSet FOLLOW_funcType_in_typeTag1498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcType_in_typeList1542 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_COMMA_in_typeList1545 = new BitSet(new long[]{0x0040002000010000L,0x0000000020084020L,0x0000000200020000L});
    public static final BitSet FOLLOW_typeList_in_typeList1548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeConstraint_in_typeList1570 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_COMMA_in_typeList1573 = new BitSet(new long[]{0x0040002000010000L,0x0000000020084020L,0x0000000200020000L});
    public static final BitSet FOLLOW_typeList_in_typeList1576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_funcType1611 = new BitSet(new long[]{0x0000000000000002L,0x0000000020000000L});
    public static final BitSet FOLLOW_MINUS_BIGGER_in_funcType1614 = new BitSet(new long[]{0x0040002000010000L,0x0000000020084020L,0x0000000200020000L});
    public static final BitSet FOLLOW_type_in_funcType1617 = new BitSet(new long[]{0x0000000000000002L,0x0000000020000000L});
    public static final BitSet FOLLOW_anonType_in_type1698 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_dotIdent_in_type1703 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_primitiveType_in_type1708 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_typeParam_in_type1714 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_LT_in_typeParam1773 = new BitSet(new long[]{0x0040002000010000L,0x0000000020084020L,0x0000000200020000L});
    public static final BitSet FOLLOW_typeList_in_typeParam1776 = new BitSet(new long[]{0x0800000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_typeParam_in_typeParam1778 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_GT_in_typeParam1781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeParam_in_typeParamOpt1824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_typeConstraint1873 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_COLON_in_typeConstraint1875 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_LPAREN_in_typeConstraint1877 = new BitSet(new long[]{0x0040002000010000L,0x0000000020084020L,0x0000000200020000L});
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
    public static final BitSet FOLLOW_parExpression_in_statement2037 = new BitSet(new long[]{0x0388002482420200L,0x12000A1600C91060L,0x00000008A0D72D05L});
    public static final BitSet FOLLOW_statement_in_statement2039 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_ELSE_in_statement2042 = new BitSet(new long[]{0x0388002482420200L,0x12000A1600C91060L,0x00000008A0D72D05L});
    public static final BitSet FOLLOW_statement_in_statement2045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_statement2067 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_LPAREN_in_statement2069 = new BitSet(new long[]{0x0288000002400200L,0x00000A0600C90020L,0x0000000020522C00L});
    public static final BitSet FOLLOW_expr_in_statement2073 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_IN_in_statement2075 = new BitSet(new long[]{0x0288000002400200L,0x00000A0600C90020L,0x0000000020522C00L});
    public static final BitSet FOLLOW_expr_in_statement2079 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_RPAREN_in_statement2081 = new BitSet(new long[]{0x0388002482420200L,0x12000A1600C91060L,0x00000008A0D72D05L});
    public static final BitSet FOLLOW_statement_in_statement2083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_statement2124 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_parExpression_in_statement2130 = new BitSet(new long[]{0x0388002482420200L,0x12000A1600C91060L,0x00000008A0D72D05L});
    public static final BitSet FOLLOW_statement_in_statement2132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DO_in_statement2152 = new BitSet(new long[]{0x0388002482420200L,0x12000A1600C91060L,0x00000008A0D72D05L});
    public static final BitSet FOLLOW_statement_in_statement2158 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_WHILE_in_statement2160 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_parExpression_in_statement2163 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_SEMI_in_statement2165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRY_in_statement2186 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L,0x0000000000000004L});
    public static final BitSet FOLLOW_block_in_statement2192 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_catchStmt_in_statement2194 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_SWITCH_in_statement2215 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_LPAREN_in_statement2221 = new BitSet(new long[]{0x0288000002400200L,0x00000A0600C90020L,0x0000000020522C00L});
    public static final BitSet FOLLOW_expr_in_statement2224 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_RPAREN_in_statement2226 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_LBRACE_in_statement2229 = new BitSet(new long[]{0x0000000200200000L});
    public static final BitSet FOLLOW_caseStmt_in_statement2232 = new BitSet(new long[]{0x0000000200200000L,0x4000000000000000L});
    public static final BitSet FOLLOW_RBRACE_in_statement2235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_statement2256 = new BitSet(new long[]{0x0288000002400200L,0x00000A0600C90020L,0x0000000020522C04L});
    public static final BitSet FOLLOW_expr_in_statement2262 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_SEMI_in_statement2265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THROW_in_statement2286 = new BitSet(new long[]{0x0288000002400200L,0x00000A0600C90020L,0x0000000020522C00L});
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
    public static final BitSet FOLLOW_COLON_in_statement2405 = new BitSet(new long[]{0x0388002482420200L,0x12000A1600C91060L,0x00000008A0D72D05L});
    public static final BitSet FOLLOW_statement_in_statement2407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMI_in_statement2446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_parExpression2470 = new BitSet(new long[]{0x0288000002400200L,0x00000A0600C90020L,0x0000000020522C00L});
    public static final BitSet FOLLOW_expr_in_parExpression2473 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_RPAREN_in_parExpression2475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_block2499 = new BitSet(new long[]{0x0389002486420200L,0x52000A1600C91060L,0x00000008A0D72D05L});
    public static final BitSet FOLLOW_blockStmt_in_block2502 = new BitSet(new long[]{0x0389002486420200L,0x52000A1600C91060L,0x00000008A0D72D05L});
    public static final BitSet FOLLOW_RBRACE_in_block2506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMI_in_block2540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDecl_in_blockStmt2573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classDecl_in_blockStmt2584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_blockStmt2595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BREAK_in_breakStmt2618 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_SEMI_in_breakStmt2620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONTINUE_in_continueStmt2653 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_SEMI_in_continueStmt2655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CASE_in_caseStmt2692 = new BitSet(new long[]{0x0288000002400200L,0x00000A0600C90020L,0x0000000020522C00L});
    public static final BitSet FOLLOW_exprList_in_caseStmt2695 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_COLON_in_caseStmt2697 = new BitSet(new long[]{0x0388002482420200L,0x12000A1600C91060L,0x00000008A0D72D05L});
    public static final BitSet FOLLOW_statement_in_caseStmt2700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_caseStmt2720 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_COLON_in_caseStmt2723 = new BitSet(new long[]{0x0388002482420200L,0x12000A1600C91060L,0x00000008A0D72D05L});
    public static final BitSet FOLLOW_statement_in_caseStmt2726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CATCH_in_catchStmt2762 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_LPAREN_in_catchStmt2768 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000020L});
    public static final BitSet FOLLOW_param_in_catchStmt2771 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_RPAREN_in_catchStmt2773 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L,0x0000000000000004L});
    public static final BitSet FOLLOW_block_in_catchStmt2776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_exprList2798 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_COMMA_in_exprList2801 = new BitSet(new long[]{0x0288000002400200L,0x00000A0600C90020L,0x0000000020522C00L});
    public static final BitSet FOLLOW_expr_in_exprList2804 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_assignExpr_in_expr2830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNTYPED_in_expr2841 = new BitSet(new long[]{0x0288000002400200L,0x00000A0600C90020L,0x0000000000522C00L});
    public static final BitSet FOLLOW_assignExpr_in_expr2843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iterExpr_in_assignExpr2875 = new BitSet(new long[]{0x4000080000104082L,0x0000050008000001L,0x00000000000010A0L});
    public static final BitSet FOLLOW_assignOp_in_assignExpr2878 = new BitSet(new long[]{0x0288000002400200L,0x00000A0600C90020L,0x0000000000522C00L});
    public static final BitSet FOLLOW_iterExpr_in_assignExpr2881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ternaryExpr_in_iterExpr2909 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_ELLIPSIS_in_iterExpr2933 = new BitSet(new long[]{0x0288000002400200L,0x00000A0600C90020L,0x0000000000522C00L});
    public static final BitSet FOLLOW_ternaryExpr_in_iterExpr2939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicOrExpr_in_ternaryExpr2973 = new BitSet(new long[]{0x0000000000000002L,0x2000000000000000L});
    public static final BitSet FOLLOW_QUES_in_ternaryExpr2976 = new BitSet(new long[]{0x0288000002400200L,0x00000A0600C90020L,0x0000000020522C00L});
    public static final BitSet FOLLOW_expr_in_ternaryExpr2982 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_COLON_in_ternaryExpr2984 = new BitSet(new long[]{0x0288000002400200L,0x00000A0600C90020L,0x0000000000522C00L});
    public static final BitSet FOLLOW_logicOrExpr_in_ternaryExpr2987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicAndExpr_in_logicOrExpr3007 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_BARBAR_in_logicOrExpr3031 = new BitSet(new long[]{0x0288000002400200L,0x00000A0600C90020L,0x0000000000522C00L});
    public static final BitSet FOLLOW_logicAndExpr_in_logicOrExpr3037 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_cmpExpr_in_logicAndExpr3071 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_AMPAMP_in_logicAndExpr3073 = new BitSet(new long[]{0x0288000002400200L,0x00000A0600C90020L,0x0000000000522C00L});
    public static final BitSet FOLLOW_cmpExpr_in_logicAndExpr3079 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_bitExpr_in_cmpExpr3118 = new BitSet(new long[]{0x1800100000000402L,0x0000000003000000L});
    public static final BitSet FOLLOW_EQEQ_in_cmpExpr3145 = new BitSet(new long[]{0x0288000002400200L,0x00000A0600C90020L,0x0000000000522C00L});
    public static final BitSet FOLLOW_BANGEQ_in_cmpExpr3174 = new BitSet(new long[]{0x0288000002400200L,0x00000A0600C90020L,0x0000000000522C00L});
    public static final BitSet FOLLOW_GTEQ_in_cmpExpr3203 = new BitSet(new long[]{0x0288000002400200L,0x00000A0600C90020L,0x0000000000522C00L});
    public static final BitSet FOLLOW_LTEQ_in_cmpExpr3232 = new BitSet(new long[]{0x0288000002400200L,0x00000A0600C90020L,0x0000000000522C00L});
    public static final BitSet FOLLOW_GT_in_cmpExpr3261 = new BitSet(new long[]{0x0288000002400200L,0x00000A0600C90020L,0x0000000000522C00L});
    public static final BitSet FOLLOW_LT_in_cmpExpr3290 = new BitSet(new long[]{0x0288000002400200L,0x00000A0600C90020L,0x0000000000522C00L});
    public static final BitSet FOLLOW_bitExpr_in_cmpExpr3297 = new BitSet(new long[]{0x1800100000000402L,0x0000000003000000L});
    public static final BitSet FOLLOW_shiftExpr_in_bitExpr3336 = new BitSet(new long[]{0x0000000000081022L});
    public static final BitSet FOLLOW_BAR_in_bitExpr3363 = new BitSet(new long[]{0x0288000002400200L,0x00000A0600C90020L,0x0000000000522C00L});
    public static final BitSet FOLLOW_AMP_in_bitExpr3392 = new BitSet(new long[]{0x0288000002400200L,0x00000A0600C90020L,0x0000000000522C00L});
    public static final BitSet FOLLOW_CARET_in_bitExpr3421 = new BitSet(new long[]{0x0288000002400200L,0x00000A0600C90020L,0x0000000000522C00L});
    public static final BitSet FOLLOW_shiftExpr_in_bitExpr3428 = new BitSet(new long[]{0x0000000000081022L});
    public static final BitSet FOLLOW_addExpr_in_shiftExpr3461 = new BitSet(new long[]{0xA000000000000002L,0x0000000004000000L});
    public static final BitSet FOLLOW_LTLT_in_shiftExpr3488 = new BitSet(new long[]{0x0288000002400200L,0x00000A0600C90020L,0x0000000000522C00L});
    public static final BitSet FOLLOW_GTGT_in_shiftExpr3517 = new BitSet(new long[]{0x0288000002400200L,0x00000A0600C90020L,0x0000000000522C00L});
    public static final BitSet FOLLOW_GTGTGT_in_shiftExpr3546 = new BitSet(new long[]{0x0288000002400200L,0x00000A0600C90020L,0x0000000000522C00L});
    public static final BitSet FOLLOW_addExpr_in_shiftExpr3553 = new BitSet(new long[]{0xA000000000000002L,0x0000000004000000L});
    public static final BitSet FOLLOW_multExpr_in_addExpr3588 = new BitSet(new long[]{0x0000000000000002L,0x0000020000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_PLUS_in_addExpr3615 = new BitSet(new long[]{0x0288000002400200L,0x00000A0600C90020L,0x0000000000522C00L});
    public static final BitSet FOLLOW_SUB_in_addExpr3644 = new BitSet(new long[]{0x0288000002400200L,0x00000A0600C90020L,0x0000000000522C00L});
    public static final BitSet FOLLOW_multExpr_in_addExpr3651 = new BitSet(new long[]{0x0000000000000002L,0x0000020000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_psExpr_in_multExpr3690 = new BitSet(new long[]{0x0000000000000002L,0x0000008000000000L,0x0000000000000050L});
    public static final BitSet FOLLOW_STAR_in_multExpr3717 = new BitSet(new long[]{0x0288000002400200L,0x00000A0600C90020L,0x0000000000522C00L});
    public static final BitSet FOLLOW_SLASH_in_multExpr3746 = new BitSet(new long[]{0x0288000002400200L,0x00000A0600C90020L,0x0000000000522C00L});
    public static final BitSet FOLLOW_PERCENT_in_multExpr3775 = new BitSet(new long[]{0x0288000002400200L,0x00000A0600C90020L,0x0000000000522C00L});
    public static final BitSet FOLLOW_psExpr_in_multExpr3782 = new BitSet(new long[]{0x0000000000000002L,0x0000008000000000L,0x0000000000000050L});
    public static final BitSet FOLLOW_prefixExpr_in_psExpr3824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_suffixExpr_in_psExpr3835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_psExpr3846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_prefixExpr3870 = new BitSet(new long[]{0x0088000002000000L,0x0000000400C90020L,0x0000000000420400L});
    public static final BitSet FOLLOW_value_in_prefixExpr3885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_newExpr_in_prefixExpr3896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cast_in_prefixExpr3907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcLit_in_prefixExpr3926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_suffixExpr3951 = new BitSet(new long[]{0x0000000000000000L,0x0000000000900000L});
    public static final BitSet FOLLOW_methodCallOrSliceList_in_suffixExpr3953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_suffixExpr3980 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_PLUSPLUS_in_suffixExpr3982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_suffixExpr4022 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_SUBSUB_in_suffixExpr4024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_methodCallOrSlice4074 = new BitSet(new long[]{0x0288000002400200L,0x00000A0600C90020L,0x0000000020522C02L});
    public static final BitSet FOLLOW_exprList_in_methodCallOrSlice4076 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_RPAREN_in_methodCallOrSlice4079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACKET_in_methodCallOrSlice4166 = new BitSet(new long[]{0x0288000002400200L,0x00000A0600C90020L,0x0000000020522C00L});
    public static final BitSet FOLLOW_expr_in_methodCallOrSlice4168 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_RBRACKET_in_methodCallOrSlice4170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_methodCallOrSlice_in_methodCallOrSliceList4266 = new BitSet(new long[]{0x0000000000000000L,0x0000000000900000L});
    public static final BitSet FOLLOW_methodCallOrSliceList_in_methodCallOrSliceList4268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_methodCallOrSlice_in_methodCallOrSliceList4279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objLit_in_value4308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_elementarySymbol_in_value4318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_value4328 = new BitSet(new long[]{0x0388002482420200L,0x12000A1600C91060L,0x00000008A0D72D05L});
    public static final BitSet FOLLOW_expr_in_value4332 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_value4334 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_RPAREN_in_value4337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dotIdent_in_value4348 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_typeParamOpt_in_value4350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEW_in_newExpr4380 = new BitSet(new long[]{0x0040002000010000L,0x0000000000884020L,0x0000000200020000L});
    public static final BitSet FOLLOW_type_in_newExpr4382 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_LPAREN_in_newExpr4384 = new BitSet(new long[]{0x0288000002400200L,0x00000A0600C90020L,0x0000000020522C02L});
    public static final BitSet FOLLOW_exprList_in_newExpr4386 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_RPAREN_in_newExpr4389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CAST_in_cast4424 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_LPAREN_in_cast4426 = new BitSet(new long[]{0x0288000002400200L,0x00000A0600C90020L,0x0000000020522C00L});
    public static final BitSet FOLLOW_expr_in_cast4428 = new BitSet(new long[]{0x0000000010000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_cast4431 = new BitSet(new long[]{0x0040002000010000L,0x0000000020084020L,0x0000000200020000L});
    public static final BitSet FOLLOW_funcType_in_cast4433 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_RPAREN_in_cast4437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CAST_in_cast4461 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_LPAREN_in_cast4463 = new BitSet(new long[]{0x0288000002400200L,0x00000A0600C90020L,0x0000000020522C00L});
    public static final BitSet FOLLOW_expr_in_cast4465 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_RPAREN_in_cast4467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classDecl_in_topLevelDecl4515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interfaceDecl_in_topLevelDecl4535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumDecl_in_topLevelDecl4555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typedefDecl_in_topLevelDecl4575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_topLevelAccess_in_enumDecl4611 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_ENUM_in_enumDecl4614 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_IDENTIFIER_in_enumDecl4616 = new BitSet(new long[]{0x0000000000000000L,0x0000000001080000L});
    public static final BitSet FOLLOW_typeParamOpt_in_enumDecl4618 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_enumBody_in_enumDecl4620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_enumBody4670 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000020L});
    public static final BitSet FOLLOW_enumValueDecl_in_enumBody4673 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000020L});
    public static final BitSet FOLLOW_RBRACE_in_enumBody4677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_enumValueDecl4717 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_LPAREN_in_enumValueDecl4723 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000020L,0x0000000000000002L});
    public static final BitSet FOLLOW_paramList_in_enumValueDecl4726 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_RPAREN_in_enumValueDecl4729 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_SEMI_in_enumValueDecl4732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_enumValueDecl4755 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_SEMI_in_enumValueDecl4760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_topLevelAccess_in_classDecl4809 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_CLASS_in_classDecl4812 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_IDENTIFIER_in_classDecl4814 = new BitSet(new long[]{0x0000800000000000L,0x0000000001080100L});
    public static final BitSet FOLLOW_typeParamOpt_in_classDecl4816 = new BitSet(new long[]{0x0000800000000000L,0x0000000000080100L});
    public static final BitSet FOLLOW_inheritListOpt_in_classDecl4818 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_classBodyScope_in_classDecl4820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_classBodyScope4867 = new BitSet(new long[]{0x0200002000000000L,0x5200001000001000L,0x0000000080000100L});
    public static final BitSet FOLLOW_classMember_in_classBodyScope4870 = new BitSet(new long[]{0x0200002000000000L,0x5200001000001000L,0x0000000080000100L});
    public static final BitSet FOLLOW_RBRACE_in_classBodyScope4874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDecl_in_classMember4920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcDecl_in_classMember4941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDecl_in_varDeclList4984 = new BitSet(new long[]{0x0000002000000000L,0x1200001000001000L,0x0000000080000100L});
    public static final BitSet FOLLOW_varDeclList_in_varDeclList4986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDeclPartList_in_varDecl5019 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_SEMI_in_varDecl5021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttrList_in_varDeclPartList5048 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_VAR_in_varDeclPartList5051 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_IDENTIFIER_in_varDeclPartList5053 = new BitSet(new long[]{0x0000080018000002L,0x0000000000800000L});
    public static final BitSet FOLLOW_propDecl_in_varDeclPartList5055 = new BitSet(new long[]{0x0000080018000002L});
    public static final BitSet FOLLOW_COMMA_in_varDeclPartList5059 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_IDENTIFIER_in_varDeclPartList5061 = new BitSet(new long[]{0x0000080018000002L,0x0000000000800000L});
    public static final BitSet FOLLOW_propDecl_in_varDeclPartList5063 = new BitSet(new long[]{0x0000080018000002L});
    public static final BitSet FOLLOW_typeTag_in_varDeclPartList5069 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_varInit_in_varDeclPartList5072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_propDecl5129 = new BitSet(new long[]{0x0000002200000000L,0x0000000400000020L});
    public static final BitSet FOLLOW_propAccessor_in_propDecl5133 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_COMMA_in_propDecl5135 = new BitSet(new long[]{0x0000002200000000L,0x0000000400000020L});
    public static final BitSet FOLLOW_propAccessor_in_propDecl5139 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_RPAREN_in_propDecl5141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQ_in_varInit5282 = new BitSet(new long[]{0x0288000002400200L,0x00000A0600C90020L,0x0000000020522C00L});
    public static final BitSet FOLLOW_expr_in_varInit5284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttrList_in_funcDecl5326 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_FUNCTION_in_funcDecl5329 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_NEW_in_funcDecl5331 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_LPAREN_in_funcDecl5333 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000020L,0x0000000000000002L});
    public static final BitSet FOLLOW_paramList_in_funcDecl5335 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_RPAREN_in_funcDecl5338 = new BitSet(new long[]{0x0000000008000000L,0x0000000000080000L,0x0000000000000004L});
    public static final BitSet FOLLOW_typeTag_in_funcDecl5340 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L,0x0000000000000004L});
    public static final BitSet FOLLOW_block_in_funcDecl5343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttrList_in_funcDecl5398 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_FUNCTION_in_funcDecl5401 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_IDENTIFIER_in_funcDecl5403 = new BitSet(new long[]{0x0000000000000000L,0x0000000001800000L});
    public static final BitSet FOLLOW_typeParamOpt_in_funcDecl5405 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_LPAREN_in_funcDecl5407 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000020L,0x0000000000000002L});
    public static final BitSet FOLLOW_paramList_in_funcDecl5409 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_RPAREN_in_funcDecl5412 = new BitSet(new long[]{0x0000000008000000L,0x0000000000080000L,0x0000000000000004L});
    public static final BitSet FOLLOW_typeTag_in_funcDecl5414 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L,0x0000000000000004L});
    public static final BitSet FOLLOW_block_in_funcDecl5417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttrList_in_funcProtoDecl5487 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_FUNCTION_in_funcProtoDecl5489 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_NEW_in_funcProtoDecl5491 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_LPAREN_in_funcProtoDecl5493 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000020L,0x0000000000000002L});
    public static final BitSet FOLLOW_paramList_in_funcProtoDecl5495 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_RPAREN_in_funcProtoDecl5498 = new BitSet(new long[]{0x0000000008000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_typeTag_in_funcProtoDecl5500 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_SEMI_in_funcProtoDecl5503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttrList_in_funcProtoDecl5544 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_FUNCTION_in_funcProtoDecl5546 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_IDENTIFIER_in_funcProtoDecl5548 = new BitSet(new long[]{0x0000000000000000L,0x0000000001800000L});
    public static final BitSet FOLLOW_typeParamOpt_in_funcProtoDecl5550 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_LPAREN_in_funcProtoDecl5552 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000020L,0x0000000000000002L});
    public static final BitSet FOLLOW_paramList_in_funcProtoDecl5554 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_RPAREN_in_funcProtoDecl5557 = new BitSet(new long[]{0x0000000008000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_typeTag_in_funcProtoDecl5559 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_SEMI_in_funcProtoDecl5562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_in_funcProtoDecl5606 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_NEW_in_funcProtoDecl5608 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_LPAREN_in_funcProtoDecl5610 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000020L,0x0000000000000002L});
    public static final BitSet FOLLOW_paramList_in_funcProtoDecl5612 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_RPAREN_in_funcProtoDecl5615 = new BitSet(new long[]{0x0000000008000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_typeTag_in_funcProtoDecl5617 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_SEMI_in_funcProtoDecl5620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_in_funcProtoDecl5658 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_IDENTIFIER_in_funcProtoDecl5660 = new BitSet(new long[]{0x0000000000000000L,0x0000000001800000L});
    public static final BitSet FOLLOW_typeParamOpt_in_funcProtoDecl5662 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_LPAREN_in_funcProtoDecl5664 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000020L,0x0000000000000002L});
    public static final BitSet FOLLOW_paramList_in_funcProtoDecl5666 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_RPAREN_in_funcProtoDecl5669 = new BitSet(new long[]{0x0000000008000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_typeTag_in_funcProtoDecl5671 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_SEMI_in_funcProtoDecl5674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_topLevelAccess_in_interfaceDecl5733 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_INTERFACE_in_interfaceDecl5736 = new BitSet(new long[]{0x0040802000010000L,0x0000000000084120L,0x0000000200020000L});
    public static final BitSet FOLLOW_type_in_interfaceDecl5738 = new BitSet(new long[]{0x0000800000000000L,0x0000000000080100L});
    public static final BitSet FOLLOW_inheritListOpt_in_interfaceDecl5740 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_LBRACE_in_interfaceDecl5742 = new BitSet(new long[]{0x0200002000000000L,0x5200001000001000L,0x0000000080000100L});
    public static final BitSet FOLLOW_interfaceBody_in_interfaceDecl5745 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_RBRACE_in_interfaceDecl5747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDecl_in_interfaceBody5771 = new BitSet(new long[]{0x0200002000000000L,0x1200001000001000L,0x0000000080000100L});
    public static final BitSet FOLLOW_interfaceBody_in_interfaceBody5773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcProtoDecl_in_interfaceBody5783 = new BitSet(new long[]{0x0200002000000000L,0x1200001000001000L,0x0000000080000100L});
    public static final BitSet FOLLOW_interfaceBody_in_interfaceBody5785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inherit_in_inheritList5819 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_COMMA_in_inheritList5822 = new BitSet(new long[]{0x0000800000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_inherit_in_inheritList5825 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_inheritList_in_inheritListOpt5855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXTENDS_in_inherit5901 = new BitSet(new long[]{0x0040002000010000L,0x0000000000084020L,0x0000000200020000L});
    public static final BitSet FOLLOW_type_in_inherit5903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IMPLEMENTS_in_inherit5931 = new BitSet(new long[]{0x0040002000010000L,0x0000000000084020L,0x0000000200020000L});
    public static final BitSet FOLLOW_type_in_inherit5933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPEDEF_in_typedefDecl5973 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_IDENTIFIER_in_typedefDecl5975 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_EQ_in_typedefDecl5977 = new BitSet(new long[]{0x0040002000010000L,0x0000000020084020L,0x0000000200020000L});
    public static final BitSet FOLLOW_funcType_in_typedefDecl5979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GT_in_typeExtend6003 = new BitSet(new long[]{0x0040002000010000L,0x0000000020084020L,0x0000000200020000L});
    public static final BitSet FOLLOW_funcType_in_typeExtend6005 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_COMMA_in_typeExtend6007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_anonType6031 = new BitSet(new long[]{0x0800002000000000L,0x5200001000001020L,0x0000000080000100L});
    public static final BitSet FOLLOW_anonTypeFieldList_in_anonType6065 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_varDeclList_in_anonType6084 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_typeExtend_in_anonType6103 = new BitSet(new long[]{0x0000002000000000L,0x5200001000001020L,0x0000000080000100L});
    public static final BitSet FOLLOW_anonTypeFieldList_in_anonType6135 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_varDeclList_in_anonType6165 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_RBRACE_in_anonType6192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_anonTypeField_in_anonTypeFieldList6218 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_COMMA_in_anonTypeFieldList6221 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_anonTypeField_in_anonTypeFieldList6224 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_LBRACE_in_objLit6240 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_objLitElemList_in_objLit6243 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_RBRACE_in_objLit6245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_anonTypeField6270 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_COLON_in_anonTypeField6272 = new BitSet(new long[]{0x0040002000010000L,0x0000000020084020L,0x0000000200020000L});
    public static final BitSet FOLLOW_funcType_in_anonTypeField6275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objLitElem_in_objLitElemList6303 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_COMMA_in_objLitElemList6306 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_objLitElem_in_objLitElemList6309 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_objLitElem6335 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_COLON_in_objLitElem6337 = new BitSet(new long[]{0x0288000002400200L,0x00000A0600C90020L,0x0000000020522C00L});
    public static final BitSet FOLLOW_expr_in_objLitElem6340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LONGLITERAL_in_elementarySymbol6363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_elementarySymbol6384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTLITERAL_in_elementarySymbol6404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRINGLITERAL_in_elementarySymbol6425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARLITERAL_in_elementarySymbol6446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOATNUM_in_elementarySymbol6467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_elementarySymbol6488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_elementarySymbol6513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeParam_in_synpred49_Haxe1714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_anonType_in_synpred50_Haxe1698 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_dotIdent_in_synpred50_Haxe1703 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_primitiveType_in_synpred50_Haxe1708 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_typeParam_in_synpred50_Haxe1714 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_typeParam_in_synpred52_Haxe1824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_synpred56_Haxe1986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignExpr_in_synpred57_Haxe1997 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_SEMI_in_synpred57_Haxe1999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_synpred59_Haxe2042 = new BitSet(new long[]{0x0388002482420200L,0x12000A1600C91060L,0x00000008A0D72D05L});
    public static final BitSet FOLLOW_statement_in_synpred59_Haxe2045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_synpred75_Haxe2388 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_SEMI_in_synpred75_Haxe2391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_synpred76_Haxe2403 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_COLON_in_synpred76_Haxe2405 = new BitSet(new long[]{0x0388002482420200L,0x12000A1600C91060L,0x00000008A0D72D05L});
    public static final BitSet FOLLOW_statement_in_synpred76_Haxe2407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDecl_in_synpred79_Haxe2573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classDecl_in_synpred80_Haxe2584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_suffixExpr_in_synpred107_Haxe3835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_synpred116_Haxe3951 = new BitSet(new long[]{0x0000000000000000L,0x0000000000900000L});
    public static final BitSet FOLLOW_methodCallOrSliceList_in_synpred116_Haxe3953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_synpred117_Haxe3980 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_PLUSPLUS_in_synpred117_Haxe3982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_methodCallOrSlice_in_synpred120_Haxe4266 = new BitSet(new long[]{0x0000000000000000L,0x0000000000900000L});
    public static final BitSet FOLLOW_methodCallOrSliceList_in_synpred120_Haxe4268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_synpred123_Haxe4332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CAST_in_synpred127_Haxe4424 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_LPAREN_in_synpred127_Haxe4426 = new BitSet(new long[]{0x0288000002400200L,0x00000A0600C90020L,0x0000000020522C00L});
    public static final BitSet FOLLOW_expr_in_synpred127_Haxe4428 = new BitSet(new long[]{0x0000000010000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_synpred127_Haxe4431 = new BitSet(new long[]{0x0040002000010000L,0x0000000020084020L,0x0000000200020000L});
    public static final BitSet FOLLOW_funcType_in_synpred127_Haxe4433 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_RPAREN_in_synpred127_Haxe4437 = new BitSet(new long[]{0x0000000000000002L});

}