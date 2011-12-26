// $ANTLR 3.4 Haxe.g 2011-12-25 19:53:12

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
        this.state.ruleMemo = new HashMap[274+1];
         

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
            // elements: typeTag, QUES, varInit
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
            // elements: typeList, IDENTIFIER, typeConstraint
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
            // elements: NEW, paramList, block, declAttrList, FUNCTION, typeTag
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
                    // elements: statement, exp2, FOR, exp1, IN
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

            // Haxe.g:259:17: ( expr ( COMMA ! expr )* )
            // Haxe.g:259:19: expr ( COMMA ! expr )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_expr_in_exprList2798);
            expr176=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr176.getTree());

            // Haxe.g:259:24: ( COMMA ! expr )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==COMMA) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // Haxe.g:259:25: COMMA ! expr
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
    // Haxe.g:262:1: expr : ( UNTYPED ^ assignExpr | assignExpr );
    public final HaxeParser.expr_return expr() throws RecognitionException {
        HaxeParser.expr_return retval = new HaxeParser.expr_return();
        retval.start = input.LT(1);

        int expr_StartIndex = input.index();

        Object root_0 = null;

        Token UNTYPED179=null;
        HaxeParser.assignExpr_return assignExpr180 =null;

        HaxeParser.assignExpr_return assignExpr181 =null;


        Object UNTYPED179_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return retval; }

            // Haxe.g:262:17: ( UNTYPED ^ assignExpr | assignExpr )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==UNTYPED) ) {
                alt45=1;
            }
            else if ( (LA45_0==BANG||LA45_0==CAST||LA45_0==CHARLITERAL||LA45_0==FALSE||LA45_0==FLOATNUM||LA45_0==FUNCTION||LA45_0==IDENTIFIER||LA45_0==INTLITERAL||(LA45_0 >= LBRACE && LA45_0 <= LBRACKET)||(LA45_0 >= LONGLITERAL && LA45_0 <= LPAREN)||(LA45_0 >= NEW && LA45_0 <= NULL)||LA45_0==PLUSPLUS||(LA45_0 >= STRINGLITERAL && LA45_0 <= SUB)||LA45_0==SUBSUB||LA45_0==THIS||LA45_0==TILDE||LA45_0==TRUE) ) {
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
                    // Haxe.g:262:19: UNTYPED ^ assignExpr
                    {
                    root_0 = (Object)adaptor.nil();


                    UNTYPED179=(Token)match(input,UNTYPED,FOLLOW_UNTYPED_in_expr2846); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    UNTYPED179_tree = 
                    (Object)adaptor.create(UNTYPED179)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(UNTYPED179_tree, root_0);
                    }

                    pushFollow(FOLLOW_assignExpr_in_expr2849);
                    assignExpr180=assignExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignExpr180.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:263:19: assignExpr
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_assignExpr_in_expr2869);
                    assignExpr181=assignExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignExpr181.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // Haxe.g:266:1: assignExpr : iterExpr ( assignOp ^ iterExpr )? ;
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

            // Haxe.g:266:17: ( iterExpr ( assignOp ^ iterExpr )? )
            // Haxe.g:266:19: iterExpr ( assignOp ^ iterExpr )?
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_iterExpr_in_assignExpr2899);
            iterExpr182=iterExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, iterExpr182.getTree());

            // Haxe.g:266:28: ( assignOp ^ iterExpr )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==AMPEQ||LA46_0==BAREQ||LA46_0==CARETEQ||LA46_0==EQ||LA46_0==GTGTEQ||LA46_0==GTGTGTEQ||LA46_0==LTLTEQ||LA46_0==PERCENTEQ||LA46_0==PLUSEQ||LA46_0==SLASHEQ||LA46_0==STAREQ||LA46_0==SUBEQ) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // Haxe.g:266:29: assignOp ^ iterExpr
                    {
                    pushFollow(FOLLOW_assignOp_in_assignExpr2902);
                    assignOp183=assignOp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(assignOp183.getTree(), root_0);

                    pushFollow(FOLLOW_iterExpr_in_assignExpr2905);
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
    // Haxe.g:270:1: iterExpr : ternaryExpr ( ELLIPSIS ^ ternaryExpr )? ;
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

            // Haxe.g:270:17: ( ternaryExpr ( ELLIPSIS ^ ternaryExpr )? )
            // Haxe.g:270:19: ternaryExpr ( ELLIPSIS ^ ternaryExpr )?
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_ternaryExpr_in_iterExpr2945);
            ternaryExpr185=ternaryExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, ternaryExpr185.getTree());

            // Haxe.g:270:31: ( ELLIPSIS ^ ternaryExpr )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==ELLIPSIS) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // Haxe.g:271:21: ELLIPSIS ^ ternaryExpr
                    {
                    ELLIPSIS186=(Token)match(input,ELLIPSIS,FOLLOW_ELLIPSIS_in_iterExpr2969); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ELLIPSIS186_tree = 
                    new BinaryExpressionNode(ELLIPSIS186) 
                    ;
                    root_0 = (Object)adaptor.becomeRoot(ELLIPSIS186_tree, root_0);
                    }

                    pushFollow(FOLLOW_ternaryExpr_in_iterExpr2975);
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
    // Haxe.g:274:1: ternaryExpr : logicOrExpr ( QUES ^ expr COLON ! ternaryExpr )? ;
    public final HaxeParser.ternaryExpr_return ternaryExpr() throws RecognitionException {
        HaxeParser.ternaryExpr_return retval = new HaxeParser.ternaryExpr_return();
        retval.start = input.LT(1);

        int ternaryExpr_StartIndex = input.index();

        Object root_0 = null;

        Token QUES189=null;
        Token COLON191=null;
        HaxeParser.logicOrExpr_return logicOrExpr188 =null;

        HaxeParser.expr_return expr190 =null;

        HaxeParser.ternaryExpr_return ternaryExpr192 =null;


        Object QUES189_tree=null;
        Object COLON191_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return retval; }

            // Haxe.g:274:17: ( logicOrExpr ( QUES ^ expr COLON ! ternaryExpr )? )
            // Haxe.g:274:19: logicOrExpr ( QUES ^ expr COLON ! ternaryExpr )?
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_logicOrExpr_in_ternaryExpr3006);
            logicOrExpr188=logicOrExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, logicOrExpr188.getTree());

            // Haxe.g:274:31: ( QUES ^ expr COLON ! ternaryExpr )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==QUES) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // Haxe.g:274:32: QUES ^ expr COLON ! ternaryExpr
                    {
                    QUES189=(Token)match(input,QUES,FOLLOW_QUES_in_ternaryExpr3009); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    QUES189_tree = 
                    (Object)adaptor.create(QUES189)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(QUES189_tree, root_0);
                    }

                    pushFollow(FOLLOW_expr_in_ternaryExpr3012);
                    expr190=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr190.getTree());

                    COLON191=(Token)match(input,COLON,FOLLOW_COLON_in_ternaryExpr3014); if (state.failed) return retval;

                    pushFollow(FOLLOW_ternaryExpr_in_ternaryExpr3017);
                    ternaryExpr192=ternaryExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ternaryExpr192.getTree());

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
    // Haxe.g:277:1: logicOrExpr : logicAndExpr ( BARBAR ^ logicAndExpr )* ;
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

            // Haxe.g:277:17: ( logicAndExpr ( BARBAR ^ logicAndExpr )* )
            // Haxe.g:277:19: logicAndExpr ( BARBAR ^ logicAndExpr )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_logicAndExpr_in_logicOrExpr3048);
            logicAndExpr193=logicAndExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, logicAndExpr193.getTree());

            // Haxe.g:277:32: ( BARBAR ^ logicAndExpr )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==BARBAR) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // Haxe.g:277:33: BARBAR ^ logicAndExpr
            	    {
            	    BARBAR194=(Token)match(input,BARBAR,FOLLOW_BARBAR_in_logicOrExpr3051); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    BARBAR194_tree = 
            	    new BinaryExpressionNode(BARBAR194) 
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(BARBAR194_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_logicAndExpr_in_logicOrExpr3057);
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
    // Haxe.g:280:1: logicAndExpr : cmpExpr ( AMPAMP ^ cmpExpr )* ;
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

            // Haxe.g:280:17: ( cmpExpr ( AMPAMP ^ cmpExpr )* )
            // Haxe.g:280:19: cmpExpr ( AMPAMP ^ cmpExpr )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_cmpExpr_in_logicAndExpr3091);
            cmpExpr196=cmpExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, cmpExpr196.getTree());

            // Haxe.g:280:26: ( AMPAMP ^ cmpExpr )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==AMPAMP) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // Haxe.g:280:27: AMPAMP ^ cmpExpr
            	    {
            	    AMPAMP197=(Token)match(input,AMPAMP,FOLLOW_AMPAMP_in_logicAndExpr3093); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    AMPAMP197_tree = 
            	    new BinaryExpressionNode(AMPAMP197) 
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(AMPAMP197_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_cmpExpr_in_logicAndExpr3099);
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
    // Haxe.g:283:1: cmpExpr : bitExpr ( ( EQEQ ^| BANGEQ ^| GTEQ ^| LTEQ ^| GT ^| LT ^) bitExpr )* ;
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

            // Haxe.g:283:17: ( bitExpr ( ( EQEQ ^| BANGEQ ^| GTEQ ^| LTEQ ^| GT ^| LT ^) bitExpr )* )
            // Haxe.g:283:19: bitExpr ( ( EQEQ ^| BANGEQ ^| GTEQ ^| LTEQ ^| GT ^| LT ^) bitExpr )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_bitExpr_in_cmpExpr3138);
            bitExpr199=bitExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bitExpr199.getTree());

            // Haxe.g:283:27: ( ( EQEQ ^| BANGEQ ^| GTEQ ^| LTEQ ^| GT ^| LT ^) bitExpr )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==BANGEQ||LA52_0==EQEQ||(LA52_0 >= GT && LA52_0 <= GTEQ)||(LA52_0 >= LT && LA52_0 <= LTEQ)) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // Haxe.g:283:28: ( EQEQ ^| BANGEQ ^| GTEQ ^| LTEQ ^| GT ^| LT ^) bitExpr
            	    {
            	    // Haxe.g:283:28: ( EQEQ ^| BANGEQ ^| GTEQ ^| LTEQ ^| GT ^| LT ^)
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
            	            // Haxe.g:284:23: EQEQ ^
            	            {
            	            EQEQ200=(Token)match(input,EQEQ,FOLLOW_EQEQ_in_cmpExpr3165); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            EQEQ200_tree = 
            	            new BinaryExpressionNode(EQEQ200) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(EQEQ200_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // Haxe.g:285:23: BANGEQ ^
            	            {
            	            BANGEQ201=(Token)match(input,BANGEQ,FOLLOW_BANGEQ_in_cmpExpr3194); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            BANGEQ201_tree = 
            	            new BinaryExpressionNode(BANGEQ201) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(BANGEQ201_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // Haxe.g:286:23: GTEQ ^
            	            {
            	            GTEQ202=(Token)match(input,GTEQ,FOLLOW_GTEQ_in_cmpExpr3223); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            GTEQ202_tree = 
            	            new BinaryExpressionNode(GTEQ202) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(GTEQ202_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // Haxe.g:287:23: LTEQ ^
            	            {
            	            LTEQ203=(Token)match(input,LTEQ,FOLLOW_LTEQ_in_cmpExpr3252); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            LTEQ203_tree = 
            	            new BinaryExpressionNode(LTEQ203) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(LTEQ203_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 5 :
            	            // Haxe.g:288:23: GT ^
            	            {
            	            GT204=(Token)match(input,GT,FOLLOW_GT_in_cmpExpr3281); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            GT204_tree = 
            	            new BinaryExpressionNode(GT204) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(GT204_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 6 :
            	            // Haxe.g:289:23: LT ^
            	            {
            	            LT205=(Token)match(input,LT,FOLLOW_LT_in_cmpExpr3310); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            LT205_tree = 
            	            new BinaryExpressionNode(LT205) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(LT205_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_bitExpr_in_cmpExpr3317);
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
    // Haxe.g:292:1: bitExpr : shiftExpr ( ( BAR ^| AMP ^| CARET ^) shiftExpr )* ;
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

            // Haxe.g:292:17: ( shiftExpr ( ( BAR ^| AMP ^| CARET ^) shiftExpr )* )
            // Haxe.g:292:19: shiftExpr ( ( BAR ^| AMP ^| CARET ^) shiftExpr )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_shiftExpr_in_bitExpr3356);
            shiftExpr207=shiftExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, shiftExpr207.getTree());

            // Haxe.g:292:29: ( ( BAR ^| AMP ^| CARET ^) shiftExpr )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==AMP||LA54_0==BAR||LA54_0==CARET) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // Haxe.g:292:30: ( BAR ^| AMP ^| CARET ^) shiftExpr
            	    {
            	    // Haxe.g:292:30: ( BAR ^| AMP ^| CARET ^)
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
            	            // Haxe.g:293:23: BAR ^
            	            {
            	            BAR208=(Token)match(input,BAR,FOLLOW_BAR_in_bitExpr3383); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            BAR208_tree = 
            	            new BinaryExpressionNode(BAR208) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(BAR208_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // Haxe.g:294:23: AMP ^
            	            {
            	            AMP209=(Token)match(input,AMP,FOLLOW_AMP_in_bitExpr3412); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            AMP209_tree = 
            	            new BinaryExpressionNode(AMP209) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(AMP209_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // Haxe.g:295:23: CARET ^
            	            {
            	            CARET210=(Token)match(input,CARET,FOLLOW_CARET_in_bitExpr3441); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            CARET210_tree = 
            	            new BinaryExpressionNode(CARET210) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(CARET210_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_shiftExpr_in_bitExpr3448);
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
    // Haxe.g:298:1: shiftExpr : addExpr ( ( LTLT ^| GTGT ^| GTGTGT ^) addExpr )* ;
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

            // Haxe.g:298:17: ( addExpr ( ( LTLT ^| GTGT ^| GTGTGT ^) addExpr )* )
            // Haxe.g:298:19: addExpr ( ( LTLT ^| GTGT ^| GTGTGT ^) addExpr )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_addExpr_in_shiftExpr3481);
            addExpr212=addExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, addExpr212.getTree());

            // Haxe.g:298:27: ( ( LTLT ^| GTGT ^| GTGTGT ^) addExpr )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==GTGT||LA56_0==GTGTGT||LA56_0==LTLT) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // Haxe.g:298:28: ( LTLT ^| GTGT ^| GTGTGT ^) addExpr
            	    {
            	    // Haxe.g:298:28: ( LTLT ^| GTGT ^| GTGTGT ^)
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
            	            // Haxe.g:299:23: LTLT ^
            	            {
            	            LTLT213=(Token)match(input,LTLT,FOLLOW_LTLT_in_shiftExpr3508); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            LTLT213_tree = 
            	            new BinaryExpressionNode(LTLT213) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(LTLT213_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // Haxe.g:300:23: GTGT ^
            	            {
            	            GTGT214=(Token)match(input,GTGT,FOLLOW_GTGT_in_shiftExpr3537); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            GTGT214_tree = 
            	            new BinaryExpressionNode(GTGT214) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(GTGT214_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // Haxe.g:301:23: GTGTGT ^
            	            {
            	            GTGTGT215=(Token)match(input,GTGTGT,FOLLOW_GTGTGT_in_shiftExpr3566); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            GTGTGT215_tree = 
            	            new BinaryExpressionNode(GTGTGT215) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(GTGTGT215_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_addExpr_in_shiftExpr3573);
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
    // Haxe.g:304:1: addExpr : multExpr ( ( PLUS ^| SUB ^) multExpr )* ;
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

            // Haxe.g:304:17: ( multExpr ( ( PLUS ^| SUB ^) multExpr )* )
            // Haxe.g:304:19: multExpr ( ( PLUS ^| SUB ^) multExpr )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_multExpr_in_addExpr3608);
            multExpr217=multExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, multExpr217.getTree());

            // Haxe.g:304:28: ( ( PLUS ^| SUB ^) multExpr )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==PLUS||LA58_0==SUB) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // Haxe.g:304:29: ( PLUS ^| SUB ^) multExpr
            	    {
            	    // Haxe.g:304:29: ( PLUS ^| SUB ^)
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
            	            // Haxe.g:305:23: PLUS ^
            	            {
            	            PLUS218=(Token)match(input,PLUS,FOLLOW_PLUS_in_addExpr3635); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            PLUS218_tree = 
            	            new BinaryExpressionNode(PLUS218) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(PLUS218_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // Haxe.g:306:23: SUB ^
            	            {
            	            SUB219=(Token)match(input,SUB,FOLLOW_SUB_in_addExpr3664); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            SUB219_tree = 
            	            new BinaryExpressionNode(SUB219) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(SUB219_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_multExpr_in_addExpr3671);
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
    // Haxe.g:309:1: multExpr : unarExpr ( ( STAR ^| SLASH ^| PERCENT ^) unarExpr )* ;
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

            // Haxe.g:309:17: ( unarExpr ( ( STAR ^| SLASH ^| PERCENT ^) unarExpr )* )
            // Haxe.g:309:19: unarExpr ( ( STAR ^| SLASH ^| PERCENT ^) unarExpr )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_unarExpr_in_multExpr3710);
            unarExpr221=unarExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, unarExpr221.getTree());

            // Haxe.g:309:28: ( ( STAR ^| SLASH ^| PERCENT ^) unarExpr )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==PERCENT||LA60_0==SLASH||LA60_0==STAR) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // Haxe.g:309:29: ( STAR ^| SLASH ^| PERCENT ^) unarExpr
            	    {
            	    // Haxe.g:309:29: ( STAR ^| SLASH ^| PERCENT ^)
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
            	            // Haxe.g:310:23: STAR ^
            	            {
            	            STAR222=(Token)match(input,STAR,FOLLOW_STAR_in_multExpr3737); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            STAR222_tree = 
            	            new BinaryExpressionNode(STAR222) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(STAR222_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // Haxe.g:311:23: SLASH ^
            	            {
            	            SLASH223=(Token)match(input,SLASH,FOLLOW_SLASH_in_multExpr3766); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            SLASH223_tree = 
            	            new BinaryExpressionNode(SLASH223) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(SLASH223_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // Haxe.g:312:23: PERCENT ^
            	            {
            	            PERCENT224=(Token)match(input,PERCENT,FOLLOW_PERCENT_in_multExpr3795); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            PERCENT224_tree = 
            	            new BinaryExpressionNode(PERCENT224) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(PERCENT224_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_unarExpr_in_multExpr3802);
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
    // Haxe.g:315:1: unarExpr : ( ( SUB ^| SUBSUB ^| PLUSPLUS ^| BANG ^| TILDE ^) prefixExpr | prefixExpr ( PLUSPLUS ^| SUBSUB ^)? );
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
        Token SUBSUB234=null;
        HaxeParser.prefixExpr_return prefixExpr231 =null;

        HaxeParser.prefixExpr_return prefixExpr232 =null;


        Object SUB226_tree=null;
        Object SUBSUB227_tree=null;
        Object PLUSPLUS228_tree=null;
        Object BANG229_tree=null;
        Object TILDE230_tree=null;
        Object PLUSPLUS233_tree=null;
        Object SUBSUB234_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 48) ) { return retval; }

            // Haxe.g:315:17: ( ( SUB ^| SUBSUB ^| PLUSPLUS ^| BANG ^| TILDE ^) prefixExpr | prefixExpr ( PLUSPLUS ^| SUBSUB ^)? )
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==BANG||LA63_0==PLUSPLUS||LA63_0==SUB||LA63_0==SUBSUB||LA63_0==TILDE) ) {
                alt63=1;
            }
            else if ( (LA63_0==CAST||LA63_0==CHARLITERAL||LA63_0==FALSE||LA63_0==FLOATNUM||LA63_0==FUNCTION||LA63_0==IDENTIFIER||LA63_0==INTLITERAL||(LA63_0 >= LBRACE && LA63_0 <= LBRACKET)||(LA63_0 >= LONGLITERAL && LA63_0 <= LPAREN)||(LA63_0 >= NEW && LA63_0 <= NULL)||LA63_0==STRINGLITERAL||LA63_0==THIS||LA63_0==TRUE) ) {
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
                    // Haxe.g:315:19: ( SUB ^| SUBSUB ^| PLUSPLUS ^| BANG ^| TILDE ^) prefixExpr
                    {
                    root_0 = (Object)adaptor.nil();


                    // Haxe.g:315:19: ( SUB ^| SUBSUB ^| PLUSPLUS ^| BANG ^| TILDE ^)
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
                            // Haxe.g:316:13: SUB ^
                            {
                            SUB226=(Token)match(input,SUB,FOLLOW_SUB_in_unarExpr3850); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            SUB226_tree = 
                            new UnarExpressionNode(SUB226) 
                            ;
                            root_0 = (Object)adaptor.becomeRoot(SUB226_tree, root_0);
                            }

                            }
                            break;
                        case 2 :
                            // Haxe.g:317:13: SUBSUB ^
                            {
                            SUBSUB227=(Token)match(input,SUBSUB,FOLLOW_SUBSUB_in_unarExpr3869); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            SUBSUB227_tree = 
                            new UnarExpressionNode(SUBSUB227) 
                            ;
                            root_0 = (Object)adaptor.becomeRoot(SUBSUB227_tree, root_0);
                            }

                            }
                            break;
                        case 3 :
                            // Haxe.g:318:13: PLUSPLUS ^
                            {
                            PLUSPLUS228=(Token)match(input,PLUSPLUS,FOLLOW_PLUSPLUS_in_unarExpr3888); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            PLUSPLUS228_tree = 
                            new UnarExpressionNode(PLUSPLUS228) 
                            ;
                            root_0 = (Object)adaptor.becomeRoot(PLUSPLUS228_tree, root_0);
                            }

                            }
                            break;
                        case 4 :
                            // Haxe.g:319:13: BANG ^
                            {
                            BANG229=(Token)match(input,BANG,FOLLOW_BANG_in_unarExpr3907); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            BANG229_tree = 
                            new UnarExpressionNode(BANG229) 
                            ;
                            root_0 = (Object)adaptor.becomeRoot(BANG229_tree, root_0);
                            }

                            }
                            break;
                        case 5 :
                            // Haxe.g:320:13: TILDE ^
                            {
                            TILDE230=(Token)match(input,TILDE,FOLLOW_TILDE_in_unarExpr3926); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            TILDE230_tree = 
                            new UnarExpressionNode(TILDE230) 
                            ;
                            root_0 = (Object)adaptor.becomeRoot(TILDE230_tree, root_0);
                            }

                            }
                            break;

                    }


                    pushFollow(FOLLOW_prefixExpr_in_unarExpr3933);
                    prefixExpr231=prefixExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, prefixExpr231.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:321:19: prefixExpr ( PLUSPLUS ^| SUBSUB ^)?
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_prefixExpr_in_unarExpr3953);
                    prefixExpr232=prefixExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, prefixExpr232.getTree());

                    // Haxe.g:321:30: ( PLUSPLUS ^| SUBSUB ^)?
                    int alt62=3;
                    int LA62_0 = input.LA(1);

                    if ( (LA62_0==PLUSPLUS) ) {
                        alt62=1;
                    }
                    else if ( (LA62_0==SUBSUB) ) {
                        alt62=2;
                    }
                    switch (alt62) {
                        case 1 :
                            // Haxe.g:321:31: PLUSPLUS ^
                            {
                            PLUSPLUS233=(Token)match(input,PLUSPLUS,FOLLOW_PLUSPLUS_in_unarExpr3956); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            PLUSPLUS233_tree = 
                            new UnarExpressionNode(PLUSPLUS233) 
                            ;
                            root_0 = (Object)adaptor.becomeRoot(PLUSPLUS233_tree, root_0);
                            }

                            }
                            break;
                        case 2 :
                            // Haxe.g:321:61: SUBSUB ^
                            {
                            SUBSUB234=(Token)match(input,SUBSUB,FOLLOW_SUBSUB_in_unarExpr3962); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            SUBSUB234_tree = 
                            new UnarExpressionNode(SUBSUB234) 
                            ;
                            root_0 = (Object)adaptor.becomeRoot(SUBSUB234_tree, root_0);
                            }

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
            if ( state.backtracking>0 ) { memoize(input, 48, unarExpr_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "unarExpr"


    public static class prefixExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "prefixExpr"
    // Haxe.g:324:1: prefixExpr : ( NEW ^ type LPAREN ! ( exprList )? RPAREN !| CAST ^ LPAREN ! expr ( COMMA ! funcType )? RPAREN !| methodCallOrSlice );
    public final HaxeParser.prefixExpr_return prefixExpr() throws RecognitionException {
        HaxeParser.prefixExpr_return retval = new HaxeParser.prefixExpr_return();
        retval.start = input.LT(1);

        int prefixExpr_StartIndex = input.index();

        Object root_0 = null;

        Token NEW235=null;
        Token LPAREN237=null;
        Token RPAREN239=null;
        Token CAST240=null;
        Token LPAREN241=null;
        Token COMMA243=null;
        Token RPAREN245=null;
        HaxeParser.type_return type236 =null;

        HaxeParser.exprList_return exprList238 =null;

        HaxeParser.expr_return expr242 =null;

        HaxeParser.funcType_return funcType244 =null;

        HaxeParser.methodCallOrSlice_return methodCallOrSlice246 =null;


        Object NEW235_tree=null;
        Object LPAREN237_tree=null;
        Object RPAREN239_tree=null;
        Object CAST240_tree=null;
        Object LPAREN241_tree=null;
        Object COMMA243_tree=null;
        Object RPAREN245_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 49) ) { return retval; }

            // Haxe.g:324:17: ( NEW ^ type LPAREN ! ( exprList )? RPAREN !| CAST ^ LPAREN ! expr ( COMMA ! funcType )? RPAREN !| methodCallOrSlice )
            int alt66=3;
            switch ( input.LA(1) ) {
            case NEW:
                {
                alt66=1;
                }
                break;
            case CAST:
                {
                alt66=2;
                }
                break;
            case CHARLITERAL:
            case FALSE:
            case FLOATNUM:
            case FUNCTION:
            case IDENTIFIER:
            case INTLITERAL:
            case LBRACE:
            case LBRACKET:
            case LONGLITERAL:
            case LPAREN:
            case NULL:
            case STRINGLITERAL:
            case THIS:
            case TRUE:
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
                    // Haxe.g:324:19: NEW ^ type LPAREN ! ( exprList )? RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    NEW235=(Token)match(input,NEW,FOLLOW_NEW_in_prefixExpr4004); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NEW235_tree = 
                    (Object)adaptor.create(NEW235)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(NEW235_tree, root_0);
                    }

                    pushFollow(FOLLOW_type_in_prefixExpr4007);
                    type236=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, type236.getTree());

                    LPAREN237=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_prefixExpr4009); if (state.failed) return retval;

                    // Haxe.g:324:37: ( exprList )?
                    int alt64=2;
                    int LA64_0 = input.LA(1);

                    if ( (LA64_0==BANG||LA64_0==CAST||LA64_0==CHARLITERAL||LA64_0==FALSE||LA64_0==FLOATNUM||LA64_0==FUNCTION||LA64_0==IDENTIFIER||LA64_0==INTLITERAL||(LA64_0 >= LBRACE && LA64_0 <= LBRACKET)||(LA64_0 >= LONGLITERAL && LA64_0 <= LPAREN)||(LA64_0 >= NEW && LA64_0 <= NULL)||LA64_0==PLUSPLUS||(LA64_0 >= STRINGLITERAL && LA64_0 <= SUB)||LA64_0==SUBSUB||LA64_0==THIS||LA64_0==TILDE||LA64_0==TRUE||LA64_0==UNTYPED) ) {
                        alt64=1;
                    }
                    switch (alt64) {
                        case 1 :
                            // Haxe.g:324:37: exprList
                            {
                            pushFollow(FOLLOW_exprList_in_prefixExpr4012);
                            exprList238=exprList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, exprList238.getTree());

                            }
                            break;

                    }


                    RPAREN239=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_prefixExpr4015); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // Haxe.g:325:19: CAST ^ LPAREN ! expr ( COMMA ! funcType )? RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    CAST240=(Token)match(input,CAST,FOLLOW_CAST_in_prefixExpr4036); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CAST240_tree = 
                    (Object)adaptor.create(CAST240)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(CAST240_tree, root_0);
                    }

                    LPAREN241=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_prefixExpr4039); if (state.failed) return retval;

                    pushFollow(FOLLOW_expr_in_prefixExpr4042);
                    expr242=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr242.getTree());

                    // Haxe.g:325:38: ( COMMA ! funcType )?
                    int alt65=2;
                    int LA65_0 = input.LA(1);

                    if ( (LA65_0==COMMA) ) {
                        alt65=1;
                    }
                    switch (alt65) {
                        case 1 :
                            // Haxe.g:325:39: COMMA ! funcType
                            {
                            COMMA243=(Token)match(input,COMMA,FOLLOW_COMMA_in_prefixExpr4045); if (state.failed) return retval;

                            pushFollow(FOLLOW_funcType_in_prefixExpr4048);
                            funcType244=funcType();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, funcType244.getTree());

                            }
                            break;

                    }


                    RPAREN245=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_prefixExpr4052); if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // Haxe.g:326:19: methodCallOrSlice
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_methodCallOrSlice_in_prefixExpr4073);
                    methodCallOrSlice246=methodCallOrSlice();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, methodCallOrSlice246.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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


    public static class methodCallOrSlice_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "methodCallOrSlice"
    // Haxe.g:329:1: methodCallOrSlice : ( value ( ( LPAREN ( exprList )? RPAREN ( pureCallOrSlice )? -> ^( SUFFIX_EXPR[\"MethodCall\", $LPAREN, $RPAREN] value ( exprList )? ( pureCallOrSlice )? ) ) | ( LBRACKET expr RBRACKET ( pureCallOrSlice )? -> ^( SUFFIX_EXPR[\"Slice\", $LBRACKET, $RBRACKET] value expr ( pureCallOrSlice )? ) ) | ( DOT methodCallOrSlice -> ^( value methodCallOrSlice ) ) ) | value );
    public final HaxeParser.methodCallOrSlice_return methodCallOrSlice() throws RecognitionException {
        HaxeParser.methodCallOrSlice_return retval = new HaxeParser.methodCallOrSlice_return();
        retval.start = input.LT(1);

        int methodCallOrSlice_StartIndex = input.index();

        Object root_0 = null;

        Token LPAREN248=null;
        Token RPAREN250=null;
        Token LBRACKET252=null;
        Token RBRACKET254=null;
        Token DOT256=null;
        HaxeParser.value_return value247 =null;

        HaxeParser.exprList_return exprList249 =null;

        HaxeParser.pureCallOrSlice_return pureCallOrSlice251 =null;

        HaxeParser.expr_return expr253 =null;

        HaxeParser.pureCallOrSlice_return pureCallOrSlice255 =null;

        HaxeParser.methodCallOrSlice_return methodCallOrSlice257 =null;

        HaxeParser.value_return value258 =null;


        Object LPAREN248_tree=null;
        Object RPAREN250_tree=null;
        Object LBRACKET252_tree=null;
        Object RBRACKET254_tree=null;
        Object DOT256_tree=null;
        RewriteRuleTokenStream stream_LBRACKET=new RewriteRuleTokenStream(adaptor,"token LBRACKET");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_RBRACKET=new RewriteRuleTokenStream(adaptor,"token RBRACKET");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_pureCallOrSlice=new RewriteRuleSubtreeStream(adaptor,"rule pureCallOrSlice");
        RewriteRuleSubtreeStream stream_methodCallOrSlice=new RewriteRuleSubtreeStream(adaptor,"rule methodCallOrSlice");
        RewriteRuleSubtreeStream stream_value=new RewriteRuleSubtreeStream(adaptor,"rule value");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_exprList=new RewriteRuleSubtreeStream(adaptor,"rule exprList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 50) ) { return retval; }

            // Haxe.g:330:17: ( value ( ( LPAREN ( exprList )? RPAREN ( pureCallOrSlice )? -> ^( SUFFIX_EXPR[\"MethodCall\", $LPAREN, $RPAREN] value ( exprList )? ( pureCallOrSlice )? ) ) | ( LBRACKET expr RBRACKET ( pureCallOrSlice )? -> ^( SUFFIX_EXPR[\"Slice\", $LBRACKET, $RBRACKET] value expr ( pureCallOrSlice )? ) ) | ( DOT methodCallOrSlice -> ^( value methodCallOrSlice ) ) ) | value )
            int alt71=2;
            switch ( input.LA(1) ) {
            case LBRACE:
                {
                int LA71_1 = input.LA(2);

                if ( (synpred122_Haxe()) ) {
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
                break;
            case FUNCTION:
                {
                int LA71_2 = input.LA(2);

                if ( (synpred122_Haxe()) ) {
                    alt71=1;
                }
                else if ( (true) ) {
                    alt71=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 71, 2, input);

                    throw nvae;

                }
                }
                break;
            case LBRACKET:
                {
                int LA71_3 = input.LA(2);

                if ( (synpred122_Haxe()) ) {
                    alt71=1;
                }
                else if ( (true) ) {
                    alt71=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 71, 3, input);

                    throw nvae;

                }
                }
                break;
            case LONGLITERAL:
                {
                int LA71_4 = input.LA(2);

                if ( (synpred122_Haxe()) ) {
                    alt71=1;
                }
                else if ( (true) ) {
                    alt71=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 71, 4, input);

                    throw nvae;

                }
                }
                break;
            case NULL:
                {
                int LA71_5 = input.LA(2);

                if ( (synpred122_Haxe()) ) {
                    alt71=1;
                }
                else if ( (true) ) {
                    alt71=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 71, 5, input);

                    throw nvae;

                }
                }
                break;
            case INTLITERAL:
                {
                int LA71_6 = input.LA(2);

                if ( (synpred122_Haxe()) ) {
                    alt71=1;
                }
                else if ( (true) ) {
                    alt71=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 71, 6, input);

                    throw nvae;

                }
                }
                break;
            case STRINGLITERAL:
                {
                int LA71_7 = input.LA(2);

                if ( (synpred122_Haxe()) ) {
                    alt71=1;
                }
                else if ( (true) ) {
                    alt71=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 71, 7, input);

                    throw nvae;

                }
                }
                break;
            case CHARLITERAL:
                {
                int LA71_8 = input.LA(2);

                if ( (synpred122_Haxe()) ) {
                    alt71=1;
                }
                else if ( (true) ) {
                    alt71=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 71, 8, input);

                    throw nvae;

                }
                }
                break;
            case FLOATNUM:
                {
                int LA71_9 = input.LA(2);

                if ( (synpred122_Haxe()) ) {
                    alt71=1;
                }
                else if ( (true) ) {
                    alt71=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 71, 9, input);

                    throw nvae;

                }
                }
                break;
            case TRUE:
                {
                int LA71_10 = input.LA(2);

                if ( (synpred122_Haxe()) ) {
                    alt71=1;
                }
                else if ( (true) ) {
                    alt71=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 71, 10, input);

                    throw nvae;

                }
                }
                break;
            case FALSE:
                {
                int LA71_11 = input.LA(2);

                if ( (synpred122_Haxe()) ) {
                    alt71=1;
                }
                else if ( (true) ) {
                    alt71=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 71, 11, input);

                    throw nvae;

                }
                }
                break;
            case LPAREN:
                {
                int LA71_12 = input.LA(2);

                if ( (synpred122_Haxe()) ) {
                    alt71=1;
                }
                else if ( (true) ) {
                    alt71=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 71, 12, input);

                    throw nvae;

                }
                }
                break;
            case IDENTIFIER:
                {
                int LA71_13 = input.LA(2);

                if ( (synpred122_Haxe()) ) {
                    alt71=1;
                }
                else if ( (true) ) {
                    alt71=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 71, 13, input);

                    throw nvae;

                }
                }
                break;
            case THIS:
                {
                int LA71_14 = input.LA(2);

                if ( (synpred122_Haxe()) ) {
                    alt71=1;
                }
                else if ( (true) ) {
                    alt71=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 71, 14, input);

                    throw nvae;

                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;

            }

            switch (alt71) {
                case 1 :
                    // Haxe.g:330:19: value ( ( LPAREN ( exprList )? RPAREN ( pureCallOrSlice )? -> ^( SUFFIX_EXPR[\"MethodCall\", $LPAREN, $RPAREN] value ( exprList )? ( pureCallOrSlice )? ) ) | ( LBRACKET expr RBRACKET ( pureCallOrSlice )? -> ^( SUFFIX_EXPR[\"Slice\", $LBRACKET, $RBRACKET] value expr ( pureCallOrSlice )? ) ) | ( DOT methodCallOrSlice -> ^( value methodCallOrSlice ) ) )
                    {
                    pushFollow(FOLLOW_value_in_methodCallOrSlice4127);
                    value247=value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_value.add(value247.getTree());

                    // Haxe.g:330:25: ( ( LPAREN ( exprList )? RPAREN ( pureCallOrSlice )? -> ^( SUFFIX_EXPR[\"MethodCall\", $LPAREN, $RPAREN] value ( exprList )? ( pureCallOrSlice )? ) ) | ( LBRACKET expr RBRACKET ( pureCallOrSlice )? -> ^( SUFFIX_EXPR[\"Slice\", $LBRACKET, $RBRACKET] value expr ( pureCallOrSlice )? ) ) | ( DOT methodCallOrSlice -> ^( value methodCallOrSlice ) ) )
                    int alt70=3;
                    switch ( input.LA(1) ) {
                    case LPAREN:
                        {
                        alt70=1;
                        }
                        break;
                    case LBRACKET:
                        {
                        alt70=2;
                        }
                        break;
                    case DOT:
                        {
                        alt70=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 70, 0, input);

                        throw nvae;

                    }

                    switch (alt70) {
                        case 1 :
                            // Haxe.g:331:15: ( LPAREN ( exprList )? RPAREN ( pureCallOrSlice )? -> ^( SUFFIX_EXPR[\"MethodCall\", $LPAREN, $RPAREN] value ( exprList )? ( pureCallOrSlice )? ) )
                            {
                            // Haxe.g:331:15: ( LPAREN ( exprList )? RPAREN ( pureCallOrSlice )? -> ^( SUFFIX_EXPR[\"MethodCall\", $LPAREN, $RPAREN] value ( exprList )? ( pureCallOrSlice )? ) )
                            // Haxe.g:331:16: LPAREN ( exprList )? RPAREN ( pureCallOrSlice )?
                            {
                            LPAREN248=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_methodCallOrSlice4146); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN248);


                            // Haxe.g:331:23: ( exprList )?
                            int alt67=2;
                            int LA67_0 = input.LA(1);

                            if ( (LA67_0==BANG||LA67_0==CAST||LA67_0==CHARLITERAL||LA67_0==FALSE||LA67_0==FLOATNUM||LA67_0==FUNCTION||LA67_0==IDENTIFIER||LA67_0==INTLITERAL||(LA67_0 >= LBRACE && LA67_0 <= LBRACKET)||(LA67_0 >= LONGLITERAL && LA67_0 <= LPAREN)||(LA67_0 >= NEW && LA67_0 <= NULL)||LA67_0==PLUSPLUS||(LA67_0 >= STRINGLITERAL && LA67_0 <= SUB)||LA67_0==SUBSUB||LA67_0==THIS||LA67_0==TILDE||LA67_0==TRUE||LA67_0==UNTYPED) ) {
                                alt67=1;
                            }
                            switch (alt67) {
                                case 1 :
                                    // Haxe.g:331:23: exprList
                                    {
                                    pushFollow(FOLLOW_exprList_in_methodCallOrSlice4148);
                                    exprList249=exprList();

                                    state._fsp--;
                                    if (state.failed) return retval;
                                    if ( state.backtracking==0 ) stream_exprList.add(exprList249.getTree());

                                    }
                                    break;

                            }


                            RPAREN250=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_methodCallOrSlice4151); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN250);


                            // Haxe.g:331:40: ( pureCallOrSlice )?
                            int alt68=2;
                            int LA68_0 = input.LA(1);

                            if ( (LA68_0==DOT||LA68_0==LBRACKET||LA68_0==LPAREN) ) {
                                alt68=1;
                            }
                            switch (alt68) {
                                case 1 :
                                    // Haxe.g:331:40: pureCallOrSlice
                                    {
                                    pushFollow(FOLLOW_pureCallOrSlice_in_methodCallOrSlice4153);
                                    pureCallOrSlice251=pureCallOrSlice();

                                    state._fsp--;
                                    if (state.failed) return retval;
                                    if ( state.backtracking==0 ) stream_pureCallOrSlice.add(pureCallOrSlice251.getTree());

                                    }
                                    break;

                            }


                            // AST REWRITE
                            // elements: value, pureCallOrSlice, exprList
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {

                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (Object)adaptor.nil();
                            // 332:13: -> ^( SUFFIX_EXPR[\"MethodCall\", $LPAREN, $RPAREN] value ( exprList )? ( pureCallOrSlice )? )
                            {
                                // Haxe.g:332:16: ^( SUFFIX_EXPR[\"MethodCall\", $LPAREN, $RPAREN] value ( exprList )? ( pureCallOrSlice )? )
                                {
                                Object root_1 = (Object)adaptor.nil();
                                root_1 = (Object)adaptor.becomeRoot(
                                new HaxeTree(SUFFIX_EXPR, "MethodCall", LPAREN248, RPAREN250)
                                , root_1);

                                adaptor.addChild(root_1, stream_value.nextTree());

                                // Haxe.g:332:78: ( exprList )?
                                if ( stream_exprList.hasNext() ) {
                                    adaptor.addChild(root_1, stream_exprList.nextTree());

                                }
                                stream_exprList.reset();

                                // Haxe.g:332:88: ( pureCallOrSlice )?
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


                            }
                            break;
                        case 2 :
                            // Haxe.g:333:15: ( LBRACKET expr RBRACKET ( pureCallOrSlice )? -> ^( SUFFIX_EXPR[\"Slice\", $LBRACKET, $RBRACKET] value expr ( pureCallOrSlice )? ) )
                            {
                            // Haxe.g:333:15: ( LBRACKET expr RBRACKET ( pureCallOrSlice )? -> ^( SUFFIX_EXPR[\"Slice\", $LBRACKET, $RBRACKET] value expr ( pureCallOrSlice )? ) )
                            // Haxe.g:333:16: LBRACKET expr RBRACKET ( pureCallOrSlice )?
                            {
                            LBRACKET252=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_methodCallOrSlice4202); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_LBRACKET.add(LBRACKET252);


                            pushFollow(FOLLOW_expr_in_methodCallOrSlice4204);
                            expr253=expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expr.add(expr253.getTree());

                            RBRACKET254=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_methodCallOrSlice4206); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_RBRACKET.add(RBRACKET254);


                            // Haxe.g:333:39: ( pureCallOrSlice )?
                            int alt69=2;
                            int LA69_0 = input.LA(1);

                            if ( (LA69_0==DOT||LA69_0==LBRACKET||LA69_0==LPAREN) ) {
                                alt69=1;
                            }
                            switch (alt69) {
                                case 1 :
                                    // Haxe.g:333:39: pureCallOrSlice
                                    {
                                    pushFollow(FOLLOW_pureCallOrSlice_in_methodCallOrSlice4208);
                                    pureCallOrSlice255=pureCallOrSlice();

                                    state._fsp--;
                                    if (state.failed) return retval;
                                    if ( state.backtracking==0 ) stream_pureCallOrSlice.add(pureCallOrSlice255.getTree());

                                    }
                                    break;

                            }


                            // AST REWRITE
                            // elements: pureCallOrSlice, expr, value
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {

                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (Object)adaptor.nil();
                            // 334:13: -> ^( SUFFIX_EXPR[\"Slice\", $LBRACKET, $RBRACKET] value expr ( pureCallOrSlice )? )
                            {
                                // Haxe.g:334:16: ^( SUFFIX_EXPR[\"Slice\", $LBRACKET, $RBRACKET] value expr ( pureCallOrSlice )? )
                                {
                                Object root_1 = (Object)adaptor.nil();
                                root_1 = (Object)adaptor.becomeRoot(
                                new HaxeTree(SUFFIX_EXPR, "Slice", LBRACKET252, RBRACKET254)
                                , root_1);

                                adaptor.addChild(root_1, stream_value.nextTree());

                                adaptor.addChild(root_1, stream_expr.nextTree());

                                // Haxe.g:334:82: ( pureCallOrSlice )?
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


                            }
                            break;
                        case 3 :
                            // Haxe.g:335:15: ( DOT methodCallOrSlice -> ^( value methodCallOrSlice ) )
                            {
                            // Haxe.g:335:15: ( DOT methodCallOrSlice -> ^( value methodCallOrSlice ) )
                            // Haxe.g:335:16: DOT methodCallOrSlice
                            {
                            DOT256=(Token)match(input,DOT,FOLLOW_DOT_in_methodCallOrSlice4257); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DOT.add(DOT256);


                            pushFollow(FOLLOW_methodCallOrSlice_in_methodCallOrSlice4259);
                            methodCallOrSlice257=methodCallOrSlice();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_methodCallOrSlice.add(methodCallOrSlice257.getTree());

                            // AST REWRITE
                            // elements: value, methodCallOrSlice
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {

                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (Object)adaptor.nil();
                            // 336:13: -> ^( value methodCallOrSlice )
                            {
                                // Haxe.g:336:16: ^( value methodCallOrSlice )
                                {
                                Object root_1 = (Object)adaptor.nil();
                                root_1 = (Object)adaptor.becomeRoot(stream_value.nextNode(), root_1);

                                adaptor.addChild(root_1, stream_methodCallOrSlice.nextTree());

                                adaptor.addChild(root_0, root_1);
                                }

                            }


                            retval.tree = root_0;
                            }

                            }


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // Haxe.g:337:19: value
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_value_in_methodCallOrSlice4301);
                    value258=value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, value258.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 50, methodCallOrSlice_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "methodCallOrSlice"


    public static class pureCallOrSlice_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "pureCallOrSlice"
    // Haxe.g:340:1: pureCallOrSlice : ( LPAREN ( exprList )? RPAREN ( pureCallOrSlice )? -> ^( SUFFIX_EXPR[\"MethodCall\", $LPAREN, $RPAREN] ( exprList )? ( pureCallOrSlice )? ) | LBRACKET expr RBRACKET ( pureCallOrSlice )? -> ^( SUFFIX_EXPR[\"Slice\", $LBRACKET, $RBRACKET] expr ( pureCallOrSlice )? ) | DOT ! methodCallOrSlice );
    public final HaxeParser.pureCallOrSlice_return pureCallOrSlice() throws RecognitionException {
        HaxeParser.pureCallOrSlice_return retval = new HaxeParser.pureCallOrSlice_return();
        retval.start = input.LT(1);

        int pureCallOrSlice_StartIndex = input.index();

        Object root_0 = null;

        Token LPAREN259=null;
        Token RPAREN261=null;
        Token LBRACKET263=null;
        Token RBRACKET265=null;
        Token DOT267=null;
        HaxeParser.exprList_return exprList260 =null;

        HaxeParser.pureCallOrSlice_return pureCallOrSlice262 =null;

        HaxeParser.expr_return expr264 =null;

        HaxeParser.pureCallOrSlice_return pureCallOrSlice266 =null;

        HaxeParser.methodCallOrSlice_return methodCallOrSlice268 =null;


        Object LPAREN259_tree=null;
        Object RPAREN261_tree=null;
        Object LBRACKET263_tree=null;
        Object RBRACKET265_tree=null;
        Object DOT267_tree=null;
        RewriteRuleTokenStream stream_LBRACKET=new RewriteRuleTokenStream(adaptor,"token LBRACKET");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_RBRACKET=new RewriteRuleTokenStream(adaptor,"token RBRACKET");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_pureCallOrSlice=new RewriteRuleSubtreeStream(adaptor,"rule pureCallOrSlice");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_exprList=new RewriteRuleSubtreeStream(adaptor,"rule exprList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 51) ) { return retval; }

            // Haxe.g:340:17: ( LPAREN ( exprList )? RPAREN ( pureCallOrSlice )? -> ^( SUFFIX_EXPR[\"MethodCall\", $LPAREN, $RPAREN] ( exprList )? ( pureCallOrSlice )? ) | LBRACKET expr RBRACKET ( pureCallOrSlice )? -> ^( SUFFIX_EXPR[\"Slice\", $LBRACKET, $RBRACKET] expr ( pureCallOrSlice )? ) | DOT ! methodCallOrSlice )
            int alt75=3;
            switch ( input.LA(1) ) {
            case LPAREN:
                {
                alt75=1;
                }
                break;
            case LBRACKET:
                {
                alt75=2;
                }
                break;
            case DOT:
                {
                alt75=3;
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
                    // Haxe.g:340:19: LPAREN ( exprList )? RPAREN ( pureCallOrSlice )?
                    {
                    LPAREN259=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_pureCallOrSlice4326); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN259);


                    // Haxe.g:340:26: ( exprList )?
                    int alt72=2;
                    int LA72_0 = input.LA(1);

                    if ( (LA72_0==BANG||LA72_0==CAST||LA72_0==CHARLITERAL||LA72_0==FALSE||LA72_0==FLOATNUM||LA72_0==FUNCTION||LA72_0==IDENTIFIER||LA72_0==INTLITERAL||(LA72_0 >= LBRACE && LA72_0 <= LBRACKET)||(LA72_0 >= LONGLITERAL && LA72_0 <= LPAREN)||(LA72_0 >= NEW && LA72_0 <= NULL)||LA72_0==PLUSPLUS||(LA72_0 >= STRINGLITERAL && LA72_0 <= SUB)||LA72_0==SUBSUB||LA72_0==THIS||LA72_0==TILDE||LA72_0==TRUE||LA72_0==UNTYPED) ) {
                        alt72=1;
                    }
                    switch (alt72) {
                        case 1 :
                            // Haxe.g:340:26: exprList
                            {
                            pushFollow(FOLLOW_exprList_in_pureCallOrSlice4328);
                            exprList260=exprList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_exprList.add(exprList260.getTree());

                            }
                            break;

                    }


                    RPAREN261=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_pureCallOrSlice4331); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN261);


                    // Haxe.g:340:43: ( pureCallOrSlice )?
                    int alt73=2;
                    int LA73_0 = input.LA(1);

                    if ( (LA73_0==DOT||LA73_0==LBRACKET||LA73_0==LPAREN) ) {
                        alt73=1;
                    }
                    switch (alt73) {
                        case 1 :
                            // Haxe.g:340:43: pureCallOrSlice
                            {
                            pushFollow(FOLLOW_pureCallOrSlice_in_pureCallOrSlice4333);
                            pureCallOrSlice262=pureCallOrSlice();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_pureCallOrSlice.add(pureCallOrSlice262.getTree());

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
                    // 341:17: -> ^( SUFFIX_EXPR[\"MethodCall\", $LPAREN, $RPAREN] ( exprList )? ( pureCallOrSlice )? )
                    {
                        // Haxe.g:341:20: ^( SUFFIX_EXPR[\"MethodCall\", $LPAREN, $RPAREN] ( exprList )? ( pureCallOrSlice )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        new HaxeTree(SUFFIX_EXPR, "MethodCall", LPAREN259, RPAREN261)
                        , root_1);

                        // Haxe.g:341:76: ( exprList )?
                        if ( stream_exprList.hasNext() ) {
                            adaptor.addChild(root_1, stream_exprList.nextTree());

                        }
                        stream_exprList.reset();

                        // Haxe.g:341:86: ( pureCallOrSlice )?
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
                    // Haxe.g:342:18: LBRACKET expr RBRACKET ( pureCallOrSlice )?
                    {
                    LBRACKET263=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_pureCallOrSlice4386); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LBRACKET.add(LBRACKET263);


                    pushFollow(FOLLOW_expr_in_pureCallOrSlice4388);
                    expr264=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr264.getTree());

                    RBRACKET265=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_pureCallOrSlice4390); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RBRACKET.add(RBRACKET265);


                    // Haxe.g:342:41: ( pureCallOrSlice )?
                    int alt74=2;
                    int LA74_0 = input.LA(1);

                    if ( (LA74_0==DOT||LA74_0==LBRACKET||LA74_0==LPAREN) ) {
                        alt74=1;
                    }
                    switch (alt74) {
                        case 1 :
                            // Haxe.g:342:41: pureCallOrSlice
                            {
                            pushFollow(FOLLOW_pureCallOrSlice_in_pureCallOrSlice4392);
                            pureCallOrSlice266=pureCallOrSlice();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_pureCallOrSlice.add(pureCallOrSlice266.getTree());

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
                    // 342:58: -> ^( SUFFIX_EXPR[\"Slice\", $LBRACKET, $RBRACKET] expr ( pureCallOrSlice )? )
                    {
                        // Haxe.g:342:61: ^( SUFFIX_EXPR[\"Slice\", $LBRACKET, $RBRACKET] expr ( pureCallOrSlice )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        new HaxeTree(SUFFIX_EXPR, "Slice", LBRACKET263, RBRACKET265)
                        , root_1);

                        adaptor.addChild(root_1, stream_expr.nextTree());

                        // Haxe.g:343:75: ( pureCallOrSlice )?
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
                    // Haxe.g:344:18: DOT ! methodCallOrSlice
                    {
                    root_0 = (Object)adaptor.nil();


                    DOT267=(Token)match(input,DOT,FOLLOW_DOT_in_pureCallOrSlice4444); if (state.failed) return retval;

                    pushFollow(FOLLOW_methodCallOrSlice_in_pureCallOrSlice4447);
                    methodCallOrSlice268=methodCallOrSlice();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, methodCallOrSlice268.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 51, pureCallOrSlice_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "pureCallOrSlice"


    public static class value_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "value"
    // Haxe.g:347:1: value : ( objLit | funcLit | arrayLit | elementarySymbol | LPAREN ! ( expr | statement ) RPAREN !| id typeParamOpt );
    public final HaxeParser.value_return value() throws RecognitionException {
        HaxeParser.value_return retval = new HaxeParser.value_return();
        retval.start = input.LT(1);

        int value_StartIndex = input.index();

        Object root_0 = null;

        Token LPAREN273=null;
        Token RPAREN276=null;
        HaxeParser.objLit_return objLit269 =null;

        HaxeParser.funcLit_return funcLit270 =null;

        HaxeParser.arrayLit_return arrayLit271 =null;

        HaxeParser.elementarySymbol_return elementarySymbol272 =null;

        HaxeParser.expr_return expr274 =null;

        HaxeParser.statement_return statement275 =null;

        HaxeParser.id_return id277 =null;

        HaxeParser.typeParamOpt_return typeParamOpt278 =null;


        Object LPAREN273_tree=null;
        Object RPAREN276_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 52) ) { return retval; }

            // Haxe.g:349:5: ( objLit | funcLit | arrayLit | elementarySymbol | LPAREN ! ( expr | statement ) RPAREN !| id typeParamOpt )
            int alt77=6;
            switch ( input.LA(1) ) {
            case LBRACE:
                {
                alt77=1;
                }
                break;
            case FUNCTION:
                {
                alt77=2;
                }
                break;
            case LBRACKET:
                {
                alt77=3;
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
                alt77=4;
                }
                break;
            case LPAREN:
                {
                alt77=5;
                }
                break;
            case IDENTIFIER:
            case THIS:
                {
                alt77=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 77, 0, input);

                throw nvae;

            }

            switch (alt77) {
                case 1 :
                    // Haxe.g:349:9: objLit
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_objLit_in_value4483);
                    objLit269=objLit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, objLit269.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:350:7: funcLit
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_funcLit_in_value4491);
                    funcLit270=funcLit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, funcLit270.getTree());

                    }
                    break;
                case 3 :
                    // Haxe.g:351:7: arrayLit
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_arrayLit_in_value4499);
                    arrayLit271=arrayLit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arrayLit271.getTree());

                    }
                    break;
                case 4 :
                    // Haxe.g:352:9: elementarySymbol
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_elementarySymbol_in_value4509);
                    elementarySymbol272=elementarySymbol();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, elementarySymbol272.getTree());

                    }
                    break;
                case 5 :
                    // Haxe.g:353:9: LPAREN ! ( expr | statement ) RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    LPAREN273=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_value4519); if (state.failed) return retval;

                    // Haxe.g:353:17: ( expr | statement )
                    int alt76=2;
                    switch ( input.LA(1) ) {
                    case UNTYPED:
                        {
                        int LA76_1 = input.LA(2);

                        if ( (synpred132_Haxe()) ) {
                            alt76=1;
                        }
                        else if ( (true) ) {
                            alt76=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 76, 1, input);

                            throw nvae;

                        }
                        }
                        break;
                    case SUB:
                        {
                        int LA76_2 = input.LA(2);

                        if ( (synpred132_Haxe()) ) {
                            alt76=1;
                        }
                        else if ( (true) ) {
                            alt76=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 76, 2, input);

                            throw nvae;

                        }
                        }
                        break;
                    case SUBSUB:
                        {
                        int LA76_3 = input.LA(2);

                        if ( (synpred132_Haxe()) ) {
                            alt76=1;
                        }
                        else if ( (true) ) {
                            alt76=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 76, 3, input);

                            throw nvae;

                        }
                        }
                        break;
                    case PLUSPLUS:
                        {
                        int LA76_4 = input.LA(2);

                        if ( (synpred132_Haxe()) ) {
                            alt76=1;
                        }
                        else if ( (true) ) {
                            alt76=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 76, 4, input);

                            throw nvae;

                        }
                        }
                        break;
                    case BANG:
                        {
                        int LA76_5 = input.LA(2);

                        if ( (synpred132_Haxe()) ) {
                            alt76=1;
                        }
                        else if ( (true) ) {
                            alt76=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 76, 5, input);

                            throw nvae;

                        }
                        }
                        break;
                    case TILDE:
                        {
                        int LA76_6 = input.LA(2);

                        if ( (synpred132_Haxe()) ) {
                            alt76=1;
                        }
                        else if ( (true) ) {
                            alt76=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 76, 6, input);

                            throw nvae;

                        }
                        }
                        break;
                    case NEW:
                        {
                        int LA76_7 = input.LA(2);

                        if ( (synpred132_Haxe()) ) {
                            alt76=1;
                        }
                        else if ( (true) ) {
                            alt76=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 76, 7, input);

                            throw nvae;

                        }
                        }
                        break;
                    case CAST:
                        {
                        int LA76_8 = input.LA(2);

                        if ( (synpred132_Haxe()) ) {
                            alt76=1;
                        }
                        else if ( (true) ) {
                            alt76=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 76, 8, input);

                            throw nvae;

                        }
                        }
                        break;
                    case LBRACE:
                        {
                        int LA76_9 = input.LA(2);

                        if ( (synpred132_Haxe()) ) {
                            alt76=1;
                        }
                        else if ( (true) ) {
                            alt76=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 76, 9, input);

                            throw nvae;

                        }
                        }
                        break;
                    case FUNCTION:
                        {
                        int LA76_10 = input.LA(2);

                        if ( (synpred132_Haxe()) ) {
                            alt76=1;
                        }
                        else if ( (true) ) {
                            alt76=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 76, 10, input);

                            throw nvae;

                        }
                        }
                        break;
                    case LBRACKET:
                        {
                        int LA76_11 = input.LA(2);

                        if ( (synpred132_Haxe()) ) {
                            alt76=1;
                        }
                        else if ( (true) ) {
                            alt76=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 76, 11, input);

                            throw nvae;

                        }
                        }
                        break;
                    case LONGLITERAL:
                        {
                        int LA76_12 = input.LA(2);

                        if ( (synpred132_Haxe()) ) {
                            alt76=1;
                        }
                        else if ( (true) ) {
                            alt76=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 76, 12, input);

                            throw nvae;

                        }
                        }
                        break;
                    case NULL:
                        {
                        int LA76_13 = input.LA(2);

                        if ( (synpred132_Haxe()) ) {
                            alt76=1;
                        }
                        else if ( (true) ) {
                            alt76=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 76, 13, input);

                            throw nvae;

                        }
                        }
                        break;
                    case INTLITERAL:
                        {
                        int LA76_14 = input.LA(2);

                        if ( (synpred132_Haxe()) ) {
                            alt76=1;
                        }
                        else if ( (true) ) {
                            alt76=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 76, 14, input);

                            throw nvae;

                        }
                        }
                        break;
                    case STRINGLITERAL:
                        {
                        int LA76_15 = input.LA(2);

                        if ( (synpred132_Haxe()) ) {
                            alt76=1;
                        }
                        else if ( (true) ) {
                            alt76=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 76, 15, input);

                            throw nvae;

                        }
                        }
                        break;
                    case CHARLITERAL:
                        {
                        int LA76_16 = input.LA(2);

                        if ( (synpred132_Haxe()) ) {
                            alt76=1;
                        }
                        else if ( (true) ) {
                            alt76=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 76, 16, input);

                            throw nvae;

                        }
                        }
                        break;
                    case FLOATNUM:
                        {
                        int LA76_17 = input.LA(2);

                        if ( (synpred132_Haxe()) ) {
                            alt76=1;
                        }
                        else if ( (true) ) {
                            alt76=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 76, 17, input);

                            throw nvae;

                        }
                        }
                        break;
                    case TRUE:
                        {
                        int LA76_18 = input.LA(2);

                        if ( (synpred132_Haxe()) ) {
                            alt76=1;
                        }
                        else if ( (true) ) {
                            alt76=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 76, 18, input);

                            throw nvae;

                        }
                        }
                        break;
                    case FALSE:
                        {
                        int LA76_19 = input.LA(2);

                        if ( (synpred132_Haxe()) ) {
                            alt76=1;
                        }
                        else if ( (true) ) {
                            alt76=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 76, 19, input);

                            throw nvae;

                        }
                        }
                        break;
                    case LPAREN:
                        {
                        int LA76_20 = input.LA(2);

                        if ( (synpred132_Haxe()) ) {
                            alt76=1;
                        }
                        else if ( (true) ) {
                            alt76=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 76, 20, input);

                            throw nvae;

                        }
                        }
                        break;
                    case IDENTIFIER:
                        {
                        int LA76_21 = input.LA(2);

                        if ( (synpred132_Haxe()) ) {
                            alt76=1;
                        }
                        else if ( (true) ) {
                            alt76=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 76, 21, input);

                            throw nvae;

                        }
                        }
                        break;
                    case THIS:
                        {
                        int LA76_22 = input.LA(2);

                        if ( (synpred132_Haxe()) ) {
                            alt76=1;
                        }
                        else if ( (true) ) {
                            alt76=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 76, 22, input);

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
                        alt76=2;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 76, 0, input);

                        throw nvae;

                    }

                    switch (alt76) {
                        case 1 :
                            // Haxe.g:353:18: expr
                            {
                            pushFollow(FOLLOW_expr_in_value4523);
                            expr274=expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr274.getTree());

                            }
                            break;
                        case 2 :
                            // Haxe.g:353:23: statement
                            {
                            pushFollow(FOLLOW_statement_in_value4525);
                            statement275=statement();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, statement275.getTree());

                            }
                            break;

                    }


                    RPAREN276=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_value4528); if (state.failed) return retval;

                    }
                    break;
                case 6 :
                    // Haxe.g:355:9: id typeParamOpt
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_id_in_value4544);
                    id277=id();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, id277.getTree());

                    pushFollow(FOLLOW_typeParamOpt_in_value4546);
                    typeParamOpt278=typeParamOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeParamOpt278.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 52, value_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "value"


    public static class topLevelDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "topLevelDecl"
    // Haxe.g:359:1: topLevelDecl : ( classDecl | interfaceDecl | enumDecl | typedefDecl );
    public final HaxeParser.topLevelDecl_return topLevelDecl() throws RecognitionException {
        HaxeParser.topLevelDecl_return retval = new HaxeParser.topLevelDecl_return();
        retval.start = input.LT(1);

        int topLevelDecl_StartIndex = input.index();

        Object root_0 = null;

        HaxeParser.classDecl_return classDecl279 =null;

        HaxeParser.interfaceDecl_return interfaceDecl280 =null;

        HaxeParser.enumDecl_return enumDecl281 =null;

        HaxeParser.typedefDecl_return typedefDecl282 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 53) ) { return retval; }

            // Haxe.g:359:17: ( classDecl | interfaceDecl | enumDecl | typedefDecl )
            int alt78=4;
            switch ( input.LA(1) ) {
            case EXTERN:
            case PRIVATE:
                {
                switch ( input.LA(2) ) {
                case CLASS:
                    {
                    alt78=1;
                    }
                    break;
                case INTERFACE:
                    {
                    alt78=2;
                    }
                    break;
                case ENUM:
                    {
                    alt78=3;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 78, 1, input);

                    throw nvae;

                }

                }
                break;
            case CLASS:
                {
                alt78=1;
                }
                break;
            case INTERFACE:
                {
                alt78=2;
                }
                break;
            case ENUM:
                {
                alt78=3;
                }
                break;
            case TYPEDEF:
                {
                alt78=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 78, 0, input);

                throw nvae;

            }

            switch (alt78) {
                case 1 :
                    // Haxe.g:359:19: classDecl
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_classDecl_in_topLevelDecl4565);
                    classDecl279=classDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, classDecl279.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:360:19: interfaceDecl
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_interfaceDecl_in_topLevelDecl4585);
                    interfaceDecl280=interfaceDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceDecl280.getTree());

                    }
                    break;
                case 3 :
                    // Haxe.g:361:19: enumDecl
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_enumDecl_in_topLevelDecl4605);
                    enumDecl281=enumDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, enumDecl281.getTree());

                    }
                    break;
                case 4 :
                    // Haxe.g:362:19: typedefDecl
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_typedefDecl_in_topLevelDecl4625);
                    typedefDecl282=typedefDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typedefDecl282.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 53, topLevelDecl_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "topLevelDecl"


    public static class enumDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "enumDecl"
    // Haxe.g:365:1: enumDecl : ( topLevelAccess )? ENUM IDENTIFIER typeParamOpt enumBody -> ^( IDENTIFIER ( topLevelAccess )? ( typeParamOpt )? ( enumBody )? ) ;
    public final HaxeParser.enumDecl_return enumDecl() throws RecognitionException {
        HaxeParser.enumDecl_return retval = new HaxeParser.enumDecl_return();
        retval.start = input.LT(1);

        int enumDecl_StartIndex = input.index();

        Object root_0 = null;

        Token ENUM284=null;
        Token IDENTIFIER285=null;
        HaxeParser.topLevelAccess_return topLevelAccess283 =null;

        HaxeParser.typeParamOpt_return typeParamOpt286 =null;

        HaxeParser.enumBody_return enumBody287 =null;


        Object ENUM284_tree=null;
        Object IDENTIFIER285_tree=null;
        RewriteRuleTokenStream stream_ENUM=new RewriteRuleTokenStream(adaptor,"token ENUM");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleSubtreeStream stream_enumBody=new RewriteRuleSubtreeStream(adaptor,"rule enumBody");
        RewriteRuleSubtreeStream stream_typeParamOpt=new RewriteRuleSubtreeStream(adaptor,"rule typeParamOpt");
        RewriteRuleSubtreeStream stream_topLevelAccess=new RewriteRuleSubtreeStream(adaptor,"rule topLevelAccess");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 54) ) { return retval; }

            // Haxe.g:365:17: ( ( topLevelAccess )? ENUM IDENTIFIER typeParamOpt enumBody -> ^( IDENTIFIER ( topLevelAccess )? ( typeParamOpt )? ( enumBody )? ) )
            // Haxe.g:365:19: ( topLevelAccess )? ENUM IDENTIFIER typeParamOpt enumBody
            {
            // Haxe.g:365:19: ( topLevelAccess )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==EXTERN||LA79_0==PRIVATE) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // Haxe.g:365:19: topLevelAccess
                    {
                    pushFollow(FOLLOW_topLevelAccess_in_enumDecl4661);
                    topLevelAccess283=topLevelAccess();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_topLevelAccess.add(topLevelAccess283.getTree());

                    }
                    break;

            }


            ENUM284=(Token)match(input,ENUM,FOLLOW_ENUM_in_enumDecl4664); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ENUM.add(ENUM284);


            IDENTIFIER285=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_enumDecl4666); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER285);


            pushFollow(FOLLOW_typeParamOpt_in_enumDecl4668);
            typeParamOpt286=typeParamOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeParamOpt.add(typeParamOpt286.getTree());

            pushFollow(FOLLOW_enumBody_in_enumDecl4670);
            enumBody287=enumBody();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_enumBody.add(enumBody287.getTree());

            // AST REWRITE
            // elements: enumBody, typeParamOpt, topLevelAccess, IDENTIFIER
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 365:73: -> ^( IDENTIFIER ( topLevelAccess )? ( typeParamOpt )? ( enumBody )? )
            {
                // Haxe.g:365:76: ^( IDENTIFIER ( topLevelAccess )? ( typeParamOpt )? ( enumBody )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                new EnumNode(stream_IDENTIFIER.nextToken())
                , root_1);

                // Haxe.g:365:99: ( topLevelAccess )?
                if ( stream_topLevelAccess.hasNext() ) {
                    adaptor.addChild(root_1, stream_topLevelAccess.nextTree());

                }
                stream_topLevelAccess.reset();

                // Haxe.g:365:115: ( typeParamOpt )?
                if ( stream_typeParamOpt.hasNext() ) {
                    adaptor.addChild(root_1, stream_typeParamOpt.nextTree());

                }
                stream_typeParamOpt.reset();

                // Haxe.g:365:129: ( enumBody )?
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
            if ( state.backtracking>0 ) { memoize(input, 54, enumDecl_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "enumDecl"


    public static class enumBody_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "enumBody"
    // Haxe.g:368:1: enumBody : LBRACE ( enumValueDecl )* RBRACE -> ^( BLOCK_SCOPE[$LBRACE, $RBRACE] ( enumValueDecl )* ) ;
    public final HaxeParser.enumBody_return enumBody() throws RecognitionException {
        HaxeParser.enumBody_return retval = new HaxeParser.enumBody_return();
        retval.start = input.LT(1);

        int enumBody_StartIndex = input.index();

        Object root_0 = null;

        Token LBRACE288=null;
        Token RBRACE290=null;
        HaxeParser.enumValueDecl_return enumValueDecl289 =null;


        Object LBRACE288_tree=null;
        Object RBRACE290_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_enumValueDecl=new RewriteRuleSubtreeStream(adaptor,"rule enumValueDecl");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 55) ) { return retval; }

            // Haxe.g:368:17: ( LBRACE ( enumValueDecl )* RBRACE -> ^( BLOCK_SCOPE[$LBRACE, $RBRACE] ( enumValueDecl )* ) )
            // Haxe.g:368:19: LBRACE ( enumValueDecl )* RBRACE
            {
            LBRACE288=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_enumBody4720); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACE.add(LBRACE288);


            // Haxe.g:368:26: ( enumValueDecl )*
            loop80:
            do {
                int alt80=2;
                int LA80_0 = input.LA(1);

                if ( (LA80_0==IDENTIFIER) ) {
                    alt80=1;
                }


                switch (alt80) {
            	case 1 :
            	    // Haxe.g:368:27: enumValueDecl
            	    {
            	    pushFollow(FOLLOW_enumValueDecl_in_enumBody4723);
            	    enumValueDecl289=enumValueDecl();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_enumValueDecl.add(enumValueDecl289.getTree());

            	    }
            	    break;

            	default :
            	    break loop80;
                }
            } while (true);


            RBRACE290=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_enumBody4727); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACE.add(RBRACE290);


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
            // 368:50: -> ^( BLOCK_SCOPE[$LBRACE, $RBRACE] ( enumValueDecl )* )
            {
                // Haxe.g:368:53: ^( BLOCK_SCOPE[$LBRACE, $RBRACE] ( enumValueDecl )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                new BlockScopeNode(BLOCK_SCOPE, LBRACE288, RBRACE290)
                , root_1);

                // Haxe.g:368:101: ( enumValueDecl )*
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
            if ( state.backtracking>0 ) { memoize(input, 55, enumBody_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "enumBody"


    public static class enumValueDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "enumValueDecl"
    // Haxe.g:371:1: enumValueDecl : ( IDENTIFIER ^ LPAREN ! ( paramList )? RPAREN ! SEMI !| IDENTIFIER SEMI !);
    public final HaxeParser.enumValueDecl_return enumValueDecl() throws RecognitionException {
        HaxeParser.enumValueDecl_return retval = new HaxeParser.enumValueDecl_return();
        retval.start = input.LT(1);

        int enumValueDecl_StartIndex = input.index();

        Object root_0 = null;

        Token IDENTIFIER291=null;
        Token LPAREN292=null;
        Token RPAREN294=null;
        Token SEMI295=null;
        Token IDENTIFIER296=null;
        Token SEMI297=null;
        HaxeParser.paramList_return paramList293 =null;


        Object IDENTIFIER291_tree=null;
        Object LPAREN292_tree=null;
        Object RPAREN294_tree=null;
        Object SEMI295_tree=null;
        Object IDENTIFIER296_tree=null;
        Object SEMI297_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 56) ) { return retval; }

            // Haxe.g:371:17: ( IDENTIFIER ^ LPAREN ! ( paramList )? RPAREN ! SEMI !| IDENTIFIER SEMI !)
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==IDENTIFIER) ) {
                int LA82_1 = input.LA(2);

                if ( (LA82_1==LPAREN) ) {
                    alt82=1;
                }
                else if ( (LA82_1==SEMI) ) {
                    alt82=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 82, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 82, 0, input);

                throw nvae;

            }
            switch (alt82) {
                case 1 :
                    // Haxe.g:371:19: IDENTIFIER ^ LPAREN ! ( paramList )? RPAREN ! SEMI !
                    {
                    root_0 = (Object)adaptor.nil();


                    IDENTIFIER291=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_enumValueDecl4767); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER291_tree = 
                    new VarDeclarationNode(IDENTIFIER291) 
                    ;
                    root_0 = (Object)adaptor.becomeRoot(IDENTIFIER291_tree, root_0);
                    }

                    LPAREN292=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_enumValueDecl4773); if (state.failed) return retval;

                    // Haxe.g:371:59: ( paramList )?
                    int alt81=2;
                    int LA81_0 = input.LA(1);

                    if ( (LA81_0==IDENTIFIER||LA81_0==QUES) ) {
                        alt81=1;
                    }
                    switch (alt81) {
                        case 1 :
                            // Haxe.g:371:59: paramList
                            {
                            pushFollow(FOLLOW_paramList_in_enumValueDecl4776);
                            paramList293=paramList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, paramList293.getTree());

                            }
                            break;

                    }


                    RPAREN294=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_enumValueDecl4779); if (state.failed) return retval;

                    SEMI295=(Token)match(input,SEMI,FOLLOW_SEMI_in_enumValueDecl4782); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // Haxe.g:372:19: IDENTIFIER SEMI !
                    {
                    root_0 = (Object)adaptor.nil();


                    IDENTIFIER296=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_enumValueDecl4805); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER296_tree = 
                    new VarDeclarationNode(IDENTIFIER296) 
                    ;
                    adaptor.addChild(root_0, IDENTIFIER296_tree);
                    }

                    SEMI297=(Token)match(input,SEMI,FOLLOW_SEMI_in_enumValueDecl4810); if (state.failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 56, enumValueDecl_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "enumValueDecl"


    public static class classDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "classDecl"
    // Haxe.g:376:1: classDecl : ( topLevelAccess )? CLASS IDENTIFIER typeParamOpt inheritListOpt classBodyScope -> ^( IDENTIFIER ( topLevelAccess )? ( typeParamOpt )? ( inheritListOpt )? ( classBodyScope )? ) ;
    public final HaxeParser.classDecl_return classDecl() throws RecognitionException {
        HaxeParser.classDecl_return retval = new HaxeParser.classDecl_return();
        retval.start = input.LT(1);

        int classDecl_StartIndex = input.index();

        Object root_0 = null;

        Token CLASS299=null;
        Token IDENTIFIER300=null;
        HaxeParser.topLevelAccess_return topLevelAccess298 =null;

        HaxeParser.typeParamOpt_return typeParamOpt301 =null;

        HaxeParser.inheritListOpt_return inheritListOpt302 =null;

        HaxeParser.classBodyScope_return classBodyScope303 =null;


        Object CLASS299_tree=null;
        Object IDENTIFIER300_tree=null;
        RewriteRuleTokenStream stream_CLASS=new RewriteRuleTokenStream(adaptor,"token CLASS");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleSubtreeStream stream_classBodyScope=new RewriteRuleSubtreeStream(adaptor,"rule classBodyScope");
        RewriteRuleSubtreeStream stream_typeParamOpt=new RewriteRuleSubtreeStream(adaptor,"rule typeParamOpt");
        RewriteRuleSubtreeStream stream_topLevelAccess=new RewriteRuleSubtreeStream(adaptor,"rule topLevelAccess");
        RewriteRuleSubtreeStream stream_inheritListOpt=new RewriteRuleSubtreeStream(adaptor,"rule inheritListOpt");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 57) ) { return retval; }

            // Haxe.g:376:17: ( ( topLevelAccess )? CLASS IDENTIFIER typeParamOpt inheritListOpt classBodyScope -> ^( IDENTIFIER ( topLevelAccess )? ( typeParamOpt )? ( inheritListOpt )? ( classBodyScope )? ) )
            // Haxe.g:376:19: ( topLevelAccess )? CLASS IDENTIFIER typeParamOpt inheritListOpt classBodyScope
            {
            // Haxe.g:376:19: ( topLevelAccess )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==EXTERN||LA83_0==PRIVATE) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // Haxe.g:376:19: topLevelAccess
                    {
                    pushFollow(FOLLOW_topLevelAccess_in_classDecl4859);
                    topLevelAccess298=topLevelAccess();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_topLevelAccess.add(topLevelAccess298.getTree());

                    }
                    break;

            }


            CLASS299=(Token)match(input,CLASS,FOLLOW_CLASS_in_classDecl4862); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CLASS.add(CLASS299);


            IDENTIFIER300=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_classDecl4864); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER300);


            pushFollow(FOLLOW_typeParamOpt_in_classDecl4866);
            typeParamOpt301=typeParamOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeParamOpt.add(typeParamOpt301.getTree());

            pushFollow(FOLLOW_inheritListOpt_in_classDecl4868);
            inheritListOpt302=inheritListOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_inheritListOpt.add(inheritListOpt302.getTree());

            pushFollow(FOLLOW_classBodyScope_in_classDecl4870);
            classBodyScope303=classBodyScope();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_classBodyScope.add(classBodyScope303.getTree());

            // AST REWRITE
            // elements: classBodyScope, IDENTIFIER, topLevelAccess, inheritListOpt, typeParamOpt
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 376:95: -> ^( IDENTIFIER ( topLevelAccess )? ( typeParamOpt )? ( inheritListOpt )? ( classBodyScope )? )
            {
                // Haxe.g:376:98: ^( IDENTIFIER ( topLevelAccess )? ( typeParamOpt )? ( inheritListOpt )? ( classBodyScope )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                new ClassNode(stream_IDENTIFIER.nextToken())
                , root_1);

                // Haxe.g:376:122: ( topLevelAccess )?
                if ( stream_topLevelAccess.hasNext() ) {
                    adaptor.addChild(root_1, stream_topLevelAccess.nextTree());

                }
                stream_topLevelAccess.reset();

                // Haxe.g:376:138: ( typeParamOpt )?
                if ( stream_typeParamOpt.hasNext() ) {
                    adaptor.addChild(root_1, stream_typeParamOpt.nextTree());

                }
                stream_typeParamOpt.reset();

                // Haxe.g:376:152: ( inheritListOpt )?
                if ( stream_inheritListOpt.hasNext() ) {
                    adaptor.addChild(root_1, stream_inheritListOpt.nextTree());

                }
                stream_inheritListOpt.reset();

                // Haxe.g:376:168: ( classBodyScope )?
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
            if ( state.backtracking>0 ) { memoize(input, 57, classDecl_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "classDecl"


    public static class classBodyScope_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "classBodyScope"
    // Haxe.g:379:1: classBodyScope : LBRACE ( classMember )* RBRACE -> ^( BLOCK_SCOPE[$LBRACE, $RBRACE] ( classMember )* ) ;
    public final HaxeParser.classBodyScope_return classBodyScope() throws RecognitionException {
        HaxeParser.classBodyScope_return retval = new HaxeParser.classBodyScope_return();
        retval.start = input.LT(1);

        int classBodyScope_StartIndex = input.index();

        Object root_0 = null;

        Token LBRACE304=null;
        Token RBRACE306=null;
        HaxeParser.classMember_return classMember305 =null;


        Object LBRACE304_tree=null;
        Object RBRACE306_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_classMember=new RewriteRuleSubtreeStream(adaptor,"rule classMember");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 58) ) { return retval; }

            // Haxe.g:379:17: ( LBRACE ( classMember )* RBRACE -> ^( BLOCK_SCOPE[$LBRACE, $RBRACE] ( classMember )* ) )
            // Haxe.g:379:19: LBRACE ( classMember )* RBRACE
            {
            LBRACE304=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_classBodyScope4917); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACE.add(LBRACE304);


            // Haxe.g:379:26: ( classMember )*
            loop84:
            do {
                int alt84=2;
                int LA84_0 = input.LA(1);

                if ( (LA84_0==DYNAMIC||LA84_0==FUNCTION||LA84_0==INLINE||LA84_0==OVERRIDE||LA84_0==PRIVATE||LA84_0==PUBLIC||LA84_0==STATIC||LA84_0==VAR) ) {
                    alt84=1;
                }


                switch (alt84) {
            	case 1 :
            	    // Haxe.g:379:27: classMember
            	    {
            	    pushFollow(FOLLOW_classMember_in_classBodyScope4920);
            	    classMember305=classMember();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_classMember.add(classMember305.getTree());

            	    }
            	    break;

            	default :
            	    break loop84;
                }
            } while (true);


            RBRACE306=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_classBodyScope4924); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACE.add(RBRACE306);


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
            // 379:48: -> ^( BLOCK_SCOPE[$LBRACE, $RBRACE] ( classMember )* )
            {
                // Haxe.g:379:51: ^( BLOCK_SCOPE[$LBRACE, $RBRACE] ( classMember )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                new BlockScopeNode(BLOCK_SCOPE, LBRACE304, RBRACE306)
                , root_1);

                // Haxe.g:379:99: ( classMember )*
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
            if ( state.backtracking>0 ) { memoize(input, 58, classBodyScope_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "classBodyScope"


    public static class classMember_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "classMember"
    // Haxe.g:382:1: classMember : ( varDeclClass | funcDecl );
    public final HaxeParser.classMember_return classMember() throws RecognitionException {
        HaxeParser.classMember_return retval = new HaxeParser.classMember_return();
        retval.start = input.LT(1);

        int classMember_StartIndex = input.index();

        Object root_0 = null;

        HaxeParser.varDeclClass_return varDeclClass307 =null;

        HaxeParser.funcDecl_return funcDecl308 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 59) ) { return retval; }

            // Haxe.g:382:17: ( varDeclClass | funcDecl )
            int alt85=2;
            alt85 = dfa85.predict(input);
            switch (alt85) {
                case 1 :
                    // Haxe.g:382:19: varDeclClass
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_varDeclClass_in_classMember4970);
                    varDeclClass307=varDeclClass();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclClass307.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:383:19: funcDecl
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_funcDecl_in_classMember4990);
                    funcDecl308=funcDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, funcDecl308.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 59, classMember_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "classMember"


    public static class varDeclList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "varDeclList"
    // Haxe.g:387:1: varDeclList : varDecl varDeclList ;
    public final HaxeParser.varDeclList_return varDeclList() throws RecognitionException {
        HaxeParser.varDeclList_return retval = new HaxeParser.varDeclList_return();
        retval.start = input.LT(1);

        int varDeclList_StartIndex = input.index();

        Object root_0 = null;

        HaxeParser.varDecl_return varDecl309 =null;

        HaxeParser.varDeclList_return varDeclList310 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 60) ) { return retval; }

            // Haxe.g:387:17: ( varDecl varDeclList )
            // Haxe.g:387:19: varDecl varDeclList
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_varDecl_in_varDeclList5033);
            varDecl309=varDecl();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, varDecl309.getTree());

            pushFollow(FOLLOW_varDeclList_in_varDeclList5035);
            varDeclList310=varDeclList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclList310.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 60, varDeclList_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "varDeclList"


    public static class varDeclClass_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "varDeclClass"
    // Haxe.g:390:1: varDeclClass : ( declAttrList )? VAR IDENTIFIER ( propDecl )? ( typeTag )? ( varInit )? SEMI -> ^( IDENTIFIER ( declAttrList )? ( propDecl )? ( typeTag )? ( varInit )? ) ;
    public final HaxeParser.varDeclClass_return varDeclClass() throws RecognitionException {
        HaxeParser.varDeclClass_return retval = new HaxeParser.varDeclClass_return();
        retval.start = input.LT(1);

        int varDeclClass_StartIndex = input.index();

        Object root_0 = null;

        Token VAR312=null;
        Token IDENTIFIER313=null;
        Token SEMI317=null;
        HaxeParser.declAttrList_return declAttrList311 =null;

        HaxeParser.propDecl_return propDecl314 =null;

        HaxeParser.typeTag_return typeTag315 =null;

        HaxeParser.varInit_return varInit316 =null;


        Object VAR312_tree=null;
        Object IDENTIFIER313_tree=null;
        Object SEMI317_tree=null;
        RewriteRuleTokenStream stream_VAR=new RewriteRuleTokenStream(adaptor,"token VAR");
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleSubtreeStream stream_typeTag=new RewriteRuleSubtreeStream(adaptor,"rule typeTag");
        RewriteRuleSubtreeStream stream_declAttrList=new RewriteRuleSubtreeStream(adaptor,"rule declAttrList");
        RewriteRuleSubtreeStream stream_propDecl=new RewriteRuleSubtreeStream(adaptor,"rule propDecl");
        RewriteRuleSubtreeStream stream_varInit=new RewriteRuleSubtreeStream(adaptor,"rule varInit");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 61) ) { return retval; }

            // Haxe.g:390:17: ( ( declAttrList )? VAR IDENTIFIER ( propDecl )? ( typeTag )? ( varInit )? SEMI -> ^( IDENTIFIER ( declAttrList )? ( propDecl )? ( typeTag )? ( varInit )? ) )
            // Haxe.g:390:19: ( declAttrList )? VAR IDENTIFIER ( propDecl )? ( typeTag )? ( varInit )? SEMI
            {
            // Haxe.g:390:19: ( declAttrList )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==DYNAMIC||LA86_0==INLINE||LA86_0==OVERRIDE||LA86_0==PRIVATE||LA86_0==PUBLIC||LA86_0==STATIC) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // Haxe.g:390:19: declAttrList
                    {
                    pushFollow(FOLLOW_declAttrList_in_varDeclClass5063);
                    declAttrList311=declAttrList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declAttrList.add(declAttrList311.getTree());

                    }
                    break;

            }


            VAR312=(Token)match(input,VAR,FOLLOW_VAR_in_varDeclClass5066); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_VAR.add(VAR312);


            IDENTIFIER313=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_varDeclClass5068); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER313);


            // Haxe.g:390:48: ( propDecl )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==LPAREN) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // Haxe.g:390:48: propDecl
                    {
                    pushFollow(FOLLOW_propDecl_in_varDeclClass5070);
                    propDecl314=propDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_propDecl.add(propDecl314.getTree());

                    }
                    break;

            }


            // Haxe.g:390:58: ( typeTag )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==COLON) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // Haxe.g:390:58: typeTag
                    {
                    pushFollow(FOLLOW_typeTag_in_varDeclClass5073);
                    typeTag315=typeTag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeTag.add(typeTag315.getTree());

                    }
                    break;

            }


            // Haxe.g:390:67: ( varInit )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==EQ) ) {
                alt89=1;
            }
            switch (alt89) {
                case 1 :
                    // Haxe.g:390:67: varInit
                    {
                    pushFollow(FOLLOW_varInit_in_varDeclClass5076);
                    varInit316=varInit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_varInit.add(varInit316.getTree());

                    }
                    break;

            }


            SEMI317=(Token)match(input,SEMI,FOLLOW_SEMI_in_varDeclClass5079); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SEMI.add(SEMI317);


            // AST REWRITE
            // elements: IDENTIFIER, varInit, typeTag, declAttrList, propDecl
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 390:81: -> ^( IDENTIFIER ( declAttrList )? ( propDecl )? ( typeTag )? ( varInit )? )
            {
                // Haxe.g:390:84: ^( IDENTIFIER ( declAttrList )? ( propDecl )? ( typeTag )? ( varInit )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                new VarDeclarationNode(stream_IDENTIFIER.nextToken())
                , root_1);

                // Haxe.g:390:117: ( declAttrList )?
                if ( stream_declAttrList.hasNext() ) {
                    adaptor.addChild(root_1, stream_declAttrList.nextTree());

                }
                stream_declAttrList.reset();

                // Haxe.g:390:131: ( propDecl )?
                if ( stream_propDecl.hasNext() ) {
                    adaptor.addChild(root_1, stream_propDecl.nextTree());

                }
                stream_propDecl.reset();

                // Haxe.g:390:141: ( typeTag )?
                if ( stream_typeTag.hasNext() ) {
                    adaptor.addChild(root_1, stream_typeTag.nextTree());

                }
                stream_typeTag.reset();

                // Haxe.g:390:150: ( varInit )?
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
            if ( state.backtracking>0 ) { memoize(input, 61, varDeclClass_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "varDeclClass"


    public static class varDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "varDecl"
    // Haxe.g:393:1: varDecl : VAR ! varDeclPartList ( COMMA ! varDeclPartList )* SEMI !;
    public final HaxeParser.varDecl_return varDecl() throws RecognitionException {
        HaxeParser.varDecl_return retval = new HaxeParser.varDecl_return();
        retval.start = input.LT(1);

        int varDecl_StartIndex = input.index();

        Object root_0 = null;

        Token VAR318=null;
        Token COMMA320=null;
        Token SEMI322=null;
        HaxeParser.varDeclPartList_return varDeclPartList319 =null;

        HaxeParser.varDeclPartList_return varDeclPartList321 =null;


        Object VAR318_tree=null;
        Object COMMA320_tree=null;
        Object SEMI322_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 62) ) { return retval; }

            // Haxe.g:393:12: ( VAR ! varDeclPartList ( COMMA ! varDeclPartList )* SEMI !)
            // Haxe.g:393:14: VAR ! varDeclPartList ( COMMA ! varDeclPartList )* SEMI !
            {
            root_0 = (Object)adaptor.nil();


            VAR318=(Token)match(input,VAR,FOLLOW_VAR_in_varDecl5144); if (state.failed) return retval;

            pushFollow(FOLLOW_varDeclPartList_in_varDecl5147);
            varDeclPartList319=varDeclPartList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclPartList319.getTree());

            // Haxe.g:393:35: ( COMMA ! varDeclPartList )*
            loop90:
            do {
                int alt90=2;
                int LA90_0 = input.LA(1);

                if ( (LA90_0==COMMA) ) {
                    alt90=1;
                }


                switch (alt90) {
            	case 1 :
            	    // Haxe.g:393:36: COMMA ! varDeclPartList
            	    {
            	    COMMA320=(Token)match(input,COMMA,FOLLOW_COMMA_in_varDecl5150); if (state.failed) return retval;

            	    pushFollow(FOLLOW_varDeclPartList_in_varDecl5153);
            	    varDeclPartList321=varDeclPartList();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclPartList321.getTree());

            	    }
            	    break;

            	default :
            	    break loop90;
                }
            } while (true);


            SEMI322=(Token)match(input,SEMI,FOLLOW_SEMI_in_varDecl5157); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 62, varDecl_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "varDecl"


    public static class varDeclPartList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "varDeclPartList"
    // Haxe.g:396:1: varDeclPartList : IDENTIFIER ( propDecl )? ( typeTag )? ( varInit )? -> ^( IDENTIFIER ( propDecl )? ( typeTag )? ( varInit )? ) ;
    public final HaxeParser.varDeclPartList_return varDeclPartList() throws RecognitionException {
        HaxeParser.varDeclPartList_return retval = new HaxeParser.varDeclPartList_return();
        retval.start = input.LT(1);

        int varDeclPartList_StartIndex = input.index();

        Object root_0 = null;

        Token IDENTIFIER323=null;
        HaxeParser.propDecl_return propDecl324 =null;

        HaxeParser.typeTag_return typeTag325 =null;

        HaxeParser.varInit_return varInit326 =null;


        Object IDENTIFIER323_tree=null;
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleSubtreeStream stream_typeTag=new RewriteRuleSubtreeStream(adaptor,"rule typeTag");
        RewriteRuleSubtreeStream stream_propDecl=new RewriteRuleSubtreeStream(adaptor,"rule propDecl");
        RewriteRuleSubtreeStream stream_varInit=new RewriteRuleSubtreeStream(adaptor,"rule varInit");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 63) ) { return retval; }

            // Haxe.g:396:17: ( IDENTIFIER ( propDecl )? ( typeTag )? ( varInit )? -> ^( IDENTIFIER ( propDecl )? ( typeTag )? ( varInit )? ) )
            // Haxe.g:396:19: IDENTIFIER ( propDecl )? ( typeTag )? ( varInit )?
            {
            IDENTIFIER323=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_varDeclPartList5178); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER323);


            // Haxe.g:396:30: ( propDecl )?
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==LPAREN) ) {
                alt91=1;
            }
            switch (alt91) {
                case 1 :
                    // Haxe.g:396:30: propDecl
                    {
                    pushFollow(FOLLOW_propDecl_in_varDeclPartList5180);
                    propDecl324=propDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_propDecl.add(propDecl324.getTree());

                    }
                    break;

            }


            // Haxe.g:396:40: ( typeTag )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==COLON) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // Haxe.g:396:40: typeTag
                    {
                    pushFollow(FOLLOW_typeTag_in_varDeclPartList5183);
                    typeTag325=typeTag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeTag.add(typeTag325.getTree());

                    }
                    break;

            }


            // Haxe.g:396:49: ( varInit )?
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==EQ) ) {
                alt93=1;
            }
            switch (alt93) {
                case 1 :
                    // Haxe.g:396:49: varInit
                    {
                    pushFollow(FOLLOW_varInit_in_varDeclPartList5186);
                    varInit326=varInit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_varInit.add(varInit326.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: IDENTIFIER, varInit, typeTag, propDecl
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 396:58: -> ^( IDENTIFIER ( propDecl )? ( typeTag )? ( varInit )? )
            {
                // Haxe.g:396:61: ^( IDENTIFIER ( propDecl )? ( typeTag )? ( varInit )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                new VarDeclarationNode(stream_IDENTIFIER.nextToken())
                , root_1);

                // Haxe.g:396:94: ( propDecl )?
                if ( stream_propDecl.hasNext() ) {
                    adaptor.addChild(root_1, stream_propDecl.nextTree());

                }
                stream_propDecl.reset();

                // Haxe.g:396:104: ( typeTag )?
                if ( stream_typeTag.hasNext() ) {
                    adaptor.addChild(root_1, stream_typeTag.nextTree());

                }
                stream_typeTag.reset();

                // Haxe.g:396:113: ( varInit )?
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
            if ( state.backtracking>0 ) { memoize(input, 63, varDeclPartList_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "varDeclPartList"


    public static class propDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "propDecl"
    // Haxe.g:399:1: propDecl : LPAREN a1= propAccessor COMMA a2= propAccessor RPAREN -> ^( PROPERTY_DECL[\"PROPERTY_DECL\"] ( $a1)? ( $a2)? ) ;
    public final HaxeParser.propDecl_return propDecl() throws RecognitionException {
        HaxeParser.propDecl_return retval = new HaxeParser.propDecl_return();
        retval.start = input.LT(1);

        int propDecl_StartIndex = input.index();

        Object root_0 = null;

        Token LPAREN327=null;
        Token COMMA328=null;
        Token RPAREN329=null;
        HaxeParser.propAccessor_return a1 =null;

        HaxeParser.propAccessor_return a2 =null;


        Object LPAREN327_tree=null;
        Object COMMA328_tree=null;
        Object RPAREN329_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_propAccessor=new RewriteRuleSubtreeStream(adaptor,"rule propAccessor");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 64) ) { return retval; }

            // Haxe.g:399:17: ( LPAREN a1= propAccessor COMMA a2= propAccessor RPAREN -> ^( PROPERTY_DECL[\"PROPERTY_DECL\"] ( $a1)? ( $a2)? ) )
            // Haxe.g:399:19: LPAREN a1= propAccessor COMMA a2= propAccessor RPAREN
            {
            LPAREN327=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_propDecl5237); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN327);


            pushFollow(FOLLOW_propAccessor_in_propDecl5241);
            a1=propAccessor();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_propAccessor.add(a1.getTree());

            COMMA328=(Token)match(input,COMMA,FOLLOW_COMMA_in_propDecl5243); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COMMA.add(COMMA328);


            pushFollow(FOLLOW_propAccessor_in_propDecl5247);
            a2=propAccessor();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_propAccessor.add(a2.getTree());

            RPAREN329=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_propDecl5249); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN329);


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
            // 399:71: -> ^( PROPERTY_DECL[\"PROPERTY_DECL\"] ( $a1)? ( $a2)? )
            {
                // Haxe.g:399:74: ^( PROPERTY_DECL[\"PROPERTY_DECL\"] ( $a1)? ( $a2)? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                new HaxeTree(PROPERTY_DECL, "PROPERTY_DECL")
                , root_1);

                // Haxe.g:399:118: ( $a1)?
                if ( stream_a1.hasNext() ) {
                    adaptor.addChild(root_1, stream_a1.nextTree());

                }
                stream_a1.reset();

                // Haxe.g:399:123: ( $a2)?
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
            if ( state.backtracking>0 ) { memoize(input, 64, propDecl_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "propDecl"


    public static class propAccessor_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "propAccessor"
    // Haxe.g:402:1: propAccessor : ( IDENTIFIER | NULL | DEFAULT | DYNAMIC );
    public final HaxeParser.propAccessor_return propAccessor() throws RecognitionException {
        HaxeParser.propAccessor_return retval = new HaxeParser.propAccessor_return();
        retval.start = input.LT(1);

        int propAccessor_StartIndex = input.index();

        Object root_0 = null;

        Token set330=null;

        Object set330_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 65) ) { return retval; }

            // Haxe.g:402:17: ( IDENTIFIER | NULL | DEFAULT | DYNAMIC )
            // Haxe.g:
            {
            root_0 = (Object)adaptor.nil();


            set330=(Token)input.LT(1);

            if ( input.LA(1)==DEFAULT||input.LA(1)==DYNAMIC||input.LA(1)==IDENTIFIER||input.LA(1)==NULL ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (Object)adaptor.create(set330)
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
            if ( state.backtracking>0 ) { memoize(input, 65, propAccessor_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "propAccessor"


    public static class varInit_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "varInit"
    // Haxe.g:408:1: varInit : EQ expr -> ^( VAR_INIT[\"VAR_INIT\"] expr ) ;
    public final HaxeParser.varInit_return varInit() throws RecognitionException {
        HaxeParser.varInit_return retval = new HaxeParser.varInit_return();
        retval.start = input.LT(1);

        int varInit_StartIndex = input.index();

        Object root_0 = null;

        Token EQ331=null;
        HaxeParser.expr_return expr332 =null;


        Object EQ331_tree=null;
        RewriteRuleTokenStream stream_EQ=new RewriteRuleTokenStream(adaptor,"token EQ");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 66) ) { return retval; }

            // Haxe.g:408:17: ( EQ expr -> ^( VAR_INIT[\"VAR_INIT\"] expr ) )
            // Haxe.g:408:19: EQ expr
            {
            EQ331=(Token)match(input,EQ,FOLLOW_EQ_in_varInit5390); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_EQ.add(EQ331);


            pushFollow(FOLLOW_expr_in_varInit5392);
            expr332=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr332.getTree());

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
            // 408:27: -> ^( VAR_INIT[\"VAR_INIT\"] expr )
            {
                // Haxe.g:408:30: ^( VAR_INIT[\"VAR_INIT\"] expr )
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
            if ( state.backtracking>0 ) { memoize(input, 66, varInit_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "varInit"


    public static class funcDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "funcDecl"
    // Haxe.g:411:1: funcDecl : ( ( declAttrList )? FUNCTION NEW LPAREN ( paramList )? RPAREN ( typeTag )? block -> ^( FUNCTION NEW ( declAttrList )? ( paramList )? ( typeTag )? ( block )? ) | ( declAttrList )? FUNCTION IDENTIFIER typeParamOpt LPAREN ( paramList )? RPAREN ( typeTag )? block -> ^( FUNCTION IDENTIFIER ( declAttrList )? ( paramList )? ( typeTag )? ( block )? ( typeParamOpt )? ) );
    public final HaxeParser.funcDecl_return funcDecl() throws RecognitionException {
        HaxeParser.funcDecl_return retval = new HaxeParser.funcDecl_return();
        retval.start = input.LT(1);

        int funcDecl_StartIndex = input.index();

        Object root_0 = null;

        Token FUNCTION334=null;
        Token NEW335=null;
        Token LPAREN336=null;
        Token RPAREN338=null;
        Token FUNCTION342=null;
        Token IDENTIFIER343=null;
        Token LPAREN345=null;
        Token RPAREN347=null;
        HaxeParser.declAttrList_return declAttrList333 =null;

        HaxeParser.paramList_return paramList337 =null;

        HaxeParser.typeTag_return typeTag339 =null;

        HaxeParser.block_return block340 =null;

        HaxeParser.declAttrList_return declAttrList341 =null;

        HaxeParser.typeParamOpt_return typeParamOpt344 =null;

        HaxeParser.paramList_return paramList346 =null;

        HaxeParser.typeTag_return typeTag348 =null;

        HaxeParser.block_return block349 =null;


        Object FUNCTION334_tree=null;
        Object NEW335_tree=null;
        Object LPAREN336_tree=null;
        Object RPAREN338_tree=null;
        Object FUNCTION342_tree=null;
        Object IDENTIFIER343_tree=null;
        Object LPAREN345_tree=null;
        Object RPAREN347_tree=null;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 67) ) { return retval; }

            // Haxe.g:411:9: ( ( declAttrList )? FUNCTION NEW LPAREN ( paramList )? RPAREN ( typeTag )? block -> ^( FUNCTION NEW ( declAttrList )? ( paramList )? ( typeTag )? ( block )? ) | ( declAttrList )? FUNCTION IDENTIFIER typeParamOpt LPAREN ( paramList )? RPAREN ( typeTag )? block -> ^( FUNCTION IDENTIFIER ( declAttrList )? ( paramList )? ( typeTag )? ( block )? ( typeParamOpt )? ) )
            int alt100=2;
            alt100 = dfa100.predict(input);
            switch (alt100) {
                case 1 :
                    // Haxe.g:411:13: ( declAttrList )? FUNCTION NEW LPAREN ( paramList )? RPAREN ( typeTag )? block
                    {
                    // Haxe.g:411:13: ( declAttrList )?
                    int alt94=2;
                    int LA94_0 = input.LA(1);

                    if ( (LA94_0==DYNAMIC||LA94_0==INLINE||LA94_0==OVERRIDE||LA94_0==PRIVATE||LA94_0==PUBLIC||LA94_0==STATIC) ) {
                        alt94=1;
                    }
                    switch (alt94) {
                        case 1 :
                            // Haxe.g:411:13: declAttrList
                            {
                            pushFollow(FOLLOW_declAttrList_in_funcDecl5434);
                            declAttrList333=declAttrList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_declAttrList.add(declAttrList333.getTree());

                            }
                            break;

                    }


                    FUNCTION334=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcDecl5437); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION334);


                    NEW335=(Token)match(input,NEW,FOLLOW_NEW_in_funcDecl5439); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEW.add(NEW335);


                    LPAREN336=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcDecl5441); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN336);


                    // Haxe.g:411:47: ( paramList )?
                    int alt95=2;
                    int LA95_0 = input.LA(1);

                    if ( (LA95_0==IDENTIFIER||LA95_0==QUES) ) {
                        alt95=1;
                    }
                    switch (alt95) {
                        case 1 :
                            // Haxe.g:411:47: paramList
                            {
                            pushFollow(FOLLOW_paramList_in_funcDecl5443);
                            paramList337=paramList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_paramList.add(paramList337.getTree());

                            }
                            break;

                    }


                    RPAREN338=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcDecl5446); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN338);


                    // Haxe.g:411:65: ( typeTag )?
                    int alt96=2;
                    int LA96_0 = input.LA(1);

                    if ( (LA96_0==COLON) ) {
                        alt96=1;
                    }
                    switch (alt96) {
                        case 1 :
                            // Haxe.g:411:65: typeTag
                            {
                            pushFollow(FOLLOW_typeTag_in_funcDecl5448);
                            typeTag339=typeTag();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_typeTag.add(typeTag339.getTree());

                            }
                            break;

                    }


                    pushFollow(FOLLOW_block_in_funcDecl5451);
                    block340=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block340.getTree());

                    // AST REWRITE
                    // elements: FUNCTION, typeTag, block, NEW, paramList, declAttrList
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 412:17: -> ^( FUNCTION NEW ( declAttrList )? ( paramList )? ( typeTag )? ( block )? )
                    {
                        // Haxe.g:412:20: ^( FUNCTION NEW ( declAttrList )? ( paramList )? ( typeTag )? ( block )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        new FunctionNode(stream_FUNCTION.nextToken())
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_NEW.nextNode()
                        );

                        // Haxe.g:412:49: ( declAttrList )?
                        if ( stream_declAttrList.hasNext() ) {
                            adaptor.addChild(root_1, stream_declAttrList.nextTree());

                        }
                        stream_declAttrList.reset();

                        // Haxe.g:412:63: ( paramList )?
                        if ( stream_paramList.hasNext() ) {
                            adaptor.addChild(root_1, stream_paramList.nextTree());

                        }
                        stream_paramList.reset();

                        // Haxe.g:412:74: ( typeTag )?
                        if ( stream_typeTag.hasNext() ) {
                            adaptor.addChild(root_1, stream_typeTag.nextTree());

                        }
                        stream_typeTag.reset();

                        // Haxe.g:412:83: ( block )?
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
                    // Haxe.g:413:13: ( declAttrList )? FUNCTION IDENTIFIER typeParamOpt LPAREN ( paramList )? RPAREN ( typeTag )? block
                    {
                    // Haxe.g:413:13: ( declAttrList )?
                    int alt97=2;
                    int LA97_0 = input.LA(1);

                    if ( (LA97_0==DYNAMIC||LA97_0==INLINE||LA97_0==OVERRIDE||LA97_0==PRIVATE||LA97_0==PUBLIC||LA97_0==STATIC) ) {
                        alt97=1;
                    }
                    switch (alt97) {
                        case 1 :
                            // Haxe.g:413:13: declAttrList
                            {
                            pushFollow(FOLLOW_declAttrList_in_funcDecl5506);
                            declAttrList341=declAttrList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_declAttrList.add(declAttrList341.getTree());

                            }
                            break;

                    }


                    FUNCTION342=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcDecl5509); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION342);


                    IDENTIFIER343=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_funcDecl5511); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER343);


                    pushFollow(FOLLOW_typeParamOpt_in_funcDecl5513);
                    typeParamOpt344=typeParamOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeParamOpt.add(typeParamOpt344.getTree());

                    LPAREN345=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcDecl5515); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN345);


                    // Haxe.g:413:67: ( paramList )?
                    int alt98=2;
                    int LA98_0 = input.LA(1);

                    if ( (LA98_0==IDENTIFIER||LA98_0==QUES) ) {
                        alt98=1;
                    }
                    switch (alt98) {
                        case 1 :
                            // Haxe.g:413:67: paramList
                            {
                            pushFollow(FOLLOW_paramList_in_funcDecl5517);
                            paramList346=paramList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_paramList.add(paramList346.getTree());

                            }
                            break;

                    }


                    RPAREN347=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcDecl5520); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN347);


                    // Haxe.g:413:85: ( typeTag )?
                    int alt99=2;
                    int LA99_0 = input.LA(1);

                    if ( (LA99_0==COLON) ) {
                        alt99=1;
                    }
                    switch (alt99) {
                        case 1 :
                            // Haxe.g:413:85: typeTag
                            {
                            pushFollow(FOLLOW_typeTag_in_funcDecl5522);
                            typeTag348=typeTag();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_typeTag.add(typeTag348.getTree());

                            }
                            break;

                    }


                    pushFollow(FOLLOW_block_in_funcDecl5525);
                    block349=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block349.getTree());

                    // AST REWRITE
                    // elements: typeParamOpt, typeTag, block, declAttrList, paramList, IDENTIFIER, FUNCTION
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 414:17: -> ^( FUNCTION IDENTIFIER ( declAttrList )? ( paramList )? ( typeTag )? ( block )? ( typeParamOpt )? )
                    {
                        // Haxe.g:414:20: ^( FUNCTION IDENTIFIER ( declAttrList )? ( paramList )? ( typeTag )? ( block )? ( typeParamOpt )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        new FunctionNode(stream_FUNCTION.nextToken())
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_IDENTIFIER.nextNode()
                        );

                        // Haxe.g:414:56: ( declAttrList )?
                        if ( stream_declAttrList.hasNext() ) {
                            adaptor.addChild(root_1, stream_declAttrList.nextTree());

                        }
                        stream_declAttrList.reset();

                        // Haxe.g:414:70: ( paramList )?
                        if ( stream_paramList.hasNext() ) {
                            adaptor.addChild(root_1, stream_paramList.nextTree());

                        }
                        stream_paramList.reset();

                        // Haxe.g:414:81: ( typeTag )?
                        if ( stream_typeTag.hasNext() ) {
                            adaptor.addChild(root_1, stream_typeTag.nextTree());

                        }
                        stream_typeTag.reset();

                        // Haxe.g:414:90: ( block )?
                        if ( stream_block.hasNext() ) {
                            adaptor.addChild(root_1, stream_block.nextTree());

                        }
                        stream_block.reset();

                        // Haxe.g:414:97: ( typeParamOpt )?
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
            if ( state.backtracking>0 ) { memoize(input, 67, funcDecl_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "funcDecl"


    public static class funcProtoDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "funcProtoDecl"
    // Haxe.g:417:1: funcProtoDecl : ( declAttrList FUNCTION NEW LPAREN ( paramList )? RPAREN ( typeTag )? SEMI -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTag )? ( declAttrList )? ) | declAttrList FUNCTION IDENTIFIER typeParamOpt LPAREN ( paramList )? RPAREN ( typeTag )? SEMI -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTag )? ( declAttrList )? ( typeParamOpt )? ) | FUNCTION NEW LPAREN ( paramList )? RPAREN ( typeTag )? SEMI -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTag )? ) | FUNCTION IDENTIFIER typeParamOpt LPAREN ( paramList )? RPAREN ( typeTag )? SEMI -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTag )? ( typeParamOpt )? ) );
    public final HaxeParser.funcProtoDecl_return funcProtoDecl() throws RecognitionException {
        HaxeParser.funcProtoDecl_return retval = new HaxeParser.funcProtoDecl_return();
        retval.start = input.LT(1);

        int funcProtoDecl_StartIndex = input.index();

        Object root_0 = null;

        Token FUNCTION351=null;
        Token NEW352=null;
        Token LPAREN353=null;
        Token RPAREN355=null;
        Token SEMI357=null;
        Token FUNCTION359=null;
        Token IDENTIFIER360=null;
        Token LPAREN362=null;
        Token RPAREN364=null;
        Token SEMI366=null;
        Token FUNCTION367=null;
        Token NEW368=null;
        Token LPAREN369=null;
        Token RPAREN371=null;
        Token SEMI373=null;
        Token FUNCTION374=null;
        Token IDENTIFIER375=null;
        Token LPAREN377=null;
        Token RPAREN379=null;
        Token SEMI381=null;
        HaxeParser.declAttrList_return declAttrList350 =null;

        HaxeParser.paramList_return paramList354 =null;

        HaxeParser.typeTag_return typeTag356 =null;

        HaxeParser.declAttrList_return declAttrList358 =null;

        HaxeParser.typeParamOpt_return typeParamOpt361 =null;

        HaxeParser.paramList_return paramList363 =null;

        HaxeParser.typeTag_return typeTag365 =null;

        HaxeParser.paramList_return paramList370 =null;

        HaxeParser.typeTag_return typeTag372 =null;

        HaxeParser.typeParamOpt_return typeParamOpt376 =null;

        HaxeParser.paramList_return paramList378 =null;

        HaxeParser.typeTag_return typeTag380 =null;


        Object FUNCTION351_tree=null;
        Object NEW352_tree=null;
        Object LPAREN353_tree=null;
        Object RPAREN355_tree=null;
        Object SEMI357_tree=null;
        Object FUNCTION359_tree=null;
        Object IDENTIFIER360_tree=null;
        Object LPAREN362_tree=null;
        Object RPAREN364_tree=null;
        Object SEMI366_tree=null;
        Object FUNCTION367_tree=null;
        Object NEW368_tree=null;
        Object LPAREN369_tree=null;
        Object RPAREN371_tree=null;
        Object SEMI373_tree=null;
        Object FUNCTION374_tree=null;
        Object IDENTIFIER375_tree=null;
        Object LPAREN377_tree=null;
        Object RPAREN379_tree=null;
        Object SEMI381_tree=null;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 68) ) { return retval; }

            // Haxe.g:418:5: ( declAttrList FUNCTION NEW LPAREN ( paramList )? RPAREN ( typeTag )? SEMI -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTag )? ( declAttrList )? ) | declAttrList FUNCTION IDENTIFIER typeParamOpt LPAREN ( paramList )? RPAREN ( typeTag )? SEMI -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTag )? ( declAttrList )? ( typeParamOpt )? ) | FUNCTION NEW LPAREN ( paramList )? RPAREN ( typeTag )? SEMI -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTag )? ) | FUNCTION IDENTIFIER typeParamOpt LPAREN ( paramList )? RPAREN ( typeTag )? SEMI -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTag )? ( typeParamOpt )? ) )
            int alt109=4;
            alt109 = dfa109.predict(input);
            switch (alt109) {
                case 1 :
                    // Haxe.g:418:9: declAttrList FUNCTION NEW LPAREN ( paramList )? RPAREN ( typeTag )? SEMI
                    {
                    pushFollow(FOLLOW_declAttrList_in_funcProtoDecl5595);
                    declAttrList350=declAttrList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declAttrList.add(declAttrList350.getTree());

                    FUNCTION351=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcProtoDecl5597); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION351);


                    NEW352=(Token)match(input,NEW,FOLLOW_NEW_in_funcProtoDecl5599); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEW.add(NEW352);


                    LPAREN353=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcProtoDecl5601); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN353);


                    // Haxe.g:418:42: ( paramList )?
                    int alt101=2;
                    int LA101_0 = input.LA(1);

                    if ( (LA101_0==IDENTIFIER||LA101_0==QUES) ) {
                        alt101=1;
                    }
                    switch (alt101) {
                        case 1 :
                            // Haxe.g:418:42: paramList
                            {
                            pushFollow(FOLLOW_paramList_in_funcProtoDecl5603);
                            paramList354=paramList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_paramList.add(paramList354.getTree());

                            }
                            break;

                    }


                    RPAREN355=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcProtoDecl5606); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN355);


                    // Haxe.g:418:60: ( typeTag )?
                    int alt102=2;
                    int LA102_0 = input.LA(1);

                    if ( (LA102_0==COLON) ) {
                        alt102=1;
                    }
                    switch (alt102) {
                        case 1 :
                            // Haxe.g:418:60: typeTag
                            {
                            pushFollow(FOLLOW_typeTag_in_funcProtoDecl5608);
                            typeTag356=typeTag();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_typeTag.add(typeTag356.getTree());

                            }
                            break;

                    }


                    SEMI357=(Token)match(input,SEMI,FOLLOW_SEMI_in_funcProtoDecl5611); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI357);


                    // AST REWRITE
                    // elements: typeTag, paramList, FUNCTION, NEW, declAttrList
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 419:13: -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTag )? ( declAttrList )? )
                    {
                        // Haxe.g:419:16: ^( FUNCTION ( NEW )? ( paramList )? ( typeTag )? ( declAttrList )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_FUNCTION.nextNode()
                        , root_1);

                        // Haxe.g:419:27: ( NEW )?
                        if ( stream_NEW.hasNext() ) {
                            adaptor.addChild(root_1, 
                            stream_NEW.nextNode()
                            );

                        }
                        stream_NEW.reset();

                        // Haxe.g:419:32: ( paramList )?
                        if ( stream_paramList.hasNext() ) {
                            adaptor.addChild(root_1, stream_paramList.nextTree());

                        }
                        stream_paramList.reset();

                        // Haxe.g:419:43: ( typeTag )?
                        if ( stream_typeTag.hasNext() ) {
                            adaptor.addChild(root_1, stream_typeTag.nextTree());

                        }
                        stream_typeTag.reset();

                        // Haxe.g:419:52: ( declAttrList )?
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
                    // Haxe.g:420:9: declAttrList FUNCTION IDENTIFIER typeParamOpt LPAREN ( paramList )? RPAREN ( typeTag )? SEMI
                    {
                    pushFollow(FOLLOW_declAttrList_in_funcProtoDecl5652);
                    declAttrList358=declAttrList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declAttrList.add(declAttrList358.getTree());

                    FUNCTION359=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcProtoDecl5654); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION359);


                    IDENTIFIER360=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_funcProtoDecl5656); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER360);


                    pushFollow(FOLLOW_typeParamOpt_in_funcProtoDecl5658);
                    typeParamOpt361=typeParamOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeParamOpt.add(typeParamOpt361.getTree());

                    LPAREN362=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcProtoDecl5660); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN362);


                    // Haxe.g:420:62: ( paramList )?
                    int alt103=2;
                    int LA103_0 = input.LA(1);

                    if ( (LA103_0==IDENTIFIER||LA103_0==QUES) ) {
                        alt103=1;
                    }
                    switch (alt103) {
                        case 1 :
                            // Haxe.g:420:62: paramList
                            {
                            pushFollow(FOLLOW_paramList_in_funcProtoDecl5662);
                            paramList363=paramList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_paramList.add(paramList363.getTree());

                            }
                            break;

                    }


                    RPAREN364=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcProtoDecl5665); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN364);


                    // Haxe.g:420:80: ( typeTag )?
                    int alt104=2;
                    int LA104_0 = input.LA(1);

                    if ( (LA104_0==COLON) ) {
                        alt104=1;
                    }
                    switch (alt104) {
                        case 1 :
                            // Haxe.g:420:80: typeTag
                            {
                            pushFollow(FOLLOW_typeTag_in_funcProtoDecl5667);
                            typeTag365=typeTag();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_typeTag.add(typeTag365.getTree());

                            }
                            break;

                    }


                    SEMI366=(Token)match(input,SEMI,FOLLOW_SEMI_in_funcProtoDecl5670); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI366);


                    // AST REWRITE
                    // elements: IDENTIFIER, typeParamOpt, declAttrList, paramList, FUNCTION, typeTag
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 421:13: -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTag )? ( declAttrList )? ( typeParamOpt )? )
                    {
                        // Haxe.g:421:16: ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTag )? ( declAttrList )? ( typeParamOpt )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_FUNCTION.nextNode()
                        , root_1);

                        // Haxe.g:421:27: ( IDENTIFIER )?
                        if ( stream_IDENTIFIER.hasNext() ) {
                            adaptor.addChild(root_1, 
                            stream_IDENTIFIER.nextNode()
                            );

                        }
                        stream_IDENTIFIER.reset();

                        // Haxe.g:421:39: ( paramList )?
                        if ( stream_paramList.hasNext() ) {
                            adaptor.addChild(root_1, stream_paramList.nextTree());

                        }
                        stream_paramList.reset();

                        // Haxe.g:421:50: ( typeTag )?
                        if ( stream_typeTag.hasNext() ) {
                            adaptor.addChild(root_1, stream_typeTag.nextTree());

                        }
                        stream_typeTag.reset();

                        // Haxe.g:421:59: ( declAttrList )?
                        if ( stream_declAttrList.hasNext() ) {
                            adaptor.addChild(root_1, stream_declAttrList.nextTree());

                        }
                        stream_declAttrList.reset();

                        // Haxe.g:421:73: ( typeParamOpt )?
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
                    // Haxe.g:422:9: FUNCTION NEW LPAREN ( paramList )? RPAREN ( typeTag )? SEMI
                    {
                    FUNCTION367=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcProtoDecl5714); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION367);


                    NEW368=(Token)match(input,NEW,FOLLOW_NEW_in_funcProtoDecl5716); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEW.add(NEW368);


                    LPAREN369=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcProtoDecl5718); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN369);


                    // Haxe.g:422:29: ( paramList )?
                    int alt105=2;
                    int LA105_0 = input.LA(1);

                    if ( (LA105_0==IDENTIFIER||LA105_0==QUES) ) {
                        alt105=1;
                    }
                    switch (alt105) {
                        case 1 :
                            // Haxe.g:422:29: paramList
                            {
                            pushFollow(FOLLOW_paramList_in_funcProtoDecl5720);
                            paramList370=paramList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_paramList.add(paramList370.getTree());

                            }
                            break;

                    }


                    RPAREN371=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcProtoDecl5723); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN371);


                    // Haxe.g:422:47: ( typeTag )?
                    int alt106=2;
                    int LA106_0 = input.LA(1);

                    if ( (LA106_0==COLON) ) {
                        alt106=1;
                    }
                    switch (alt106) {
                        case 1 :
                            // Haxe.g:422:47: typeTag
                            {
                            pushFollow(FOLLOW_typeTag_in_funcProtoDecl5725);
                            typeTag372=typeTag();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_typeTag.add(typeTag372.getTree());

                            }
                            break;

                    }


                    SEMI373=(Token)match(input,SEMI,FOLLOW_SEMI_in_funcProtoDecl5728); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI373);


                    // AST REWRITE
                    // elements: FUNCTION, paramList, NEW, typeTag
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 423:13: -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTag )? )
                    {
                        // Haxe.g:423:16: ^( FUNCTION ( NEW )? ( paramList )? ( typeTag )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_FUNCTION.nextNode()
                        , root_1);

                        // Haxe.g:423:27: ( NEW )?
                        if ( stream_NEW.hasNext() ) {
                            adaptor.addChild(root_1, 
                            stream_NEW.nextNode()
                            );

                        }
                        stream_NEW.reset();

                        // Haxe.g:423:32: ( paramList )?
                        if ( stream_paramList.hasNext() ) {
                            adaptor.addChild(root_1, stream_paramList.nextTree());

                        }
                        stream_paramList.reset();

                        // Haxe.g:423:43: ( typeTag )?
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
                    // Haxe.g:424:9: FUNCTION IDENTIFIER typeParamOpt LPAREN ( paramList )? RPAREN ( typeTag )? SEMI
                    {
                    FUNCTION374=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcProtoDecl5766); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION374);


                    IDENTIFIER375=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_funcProtoDecl5768); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER375);


                    pushFollow(FOLLOW_typeParamOpt_in_funcProtoDecl5770);
                    typeParamOpt376=typeParamOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeParamOpt.add(typeParamOpt376.getTree());

                    LPAREN377=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcProtoDecl5772); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN377);


                    // Haxe.g:424:49: ( paramList )?
                    int alt107=2;
                    int LA107_0 = input.LA(1);

                    if ( (LA107_0==IDENTIFIER||LA107_0==QUES) ) {
                        alt107=1;
                    }
                    switch (alt107) {
                        case 1 :
                            // Haxe.g:424:49: paramList
                            {
                            pushFollow(FOLLOW_paramList_in_funcProtoDecl5774);
                            paramList378=paramList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_paramList.add(paramList378.getTree());

                            }
                            break;

                    }


                    RPAREN379=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcProtoDecl5777); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN379);


                    // Haxe.g:424:67: ( typeTag )?
                    int alt108=2;
                    int LA108_0 = input.LA(1);

                    if ( (LA108_0==COLON) ) {
                        alt108=1;
                    }
                    switch (alt108) {
                        case 1 :
                            // Haxe.g:424:67: typeTag
                            {
                            pushFollow(FOLLOW_typeTag_in_funcProtoDecl5779);
                            typeTag380=typeTag();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_typeTag.add(typeTag380.getTree());

                            }
                            break;

                    }


                    SEMI381=(Token)match(input,SEMI,FOLLOW_SEMI_in_funcProtoDecl5782); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI381);


                    // AST REWRITE
                    // elements: paramList, IDENTIFIER, typeParamOpt, typeTag, FUNCTION
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 425:13: -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTag )? ( typeParamOpt )? )
                    {
                        // Haxe.g:425:16: ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTag )? ( typeParamOpt )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_FUNCTION.nextNode()
                        , root_1);

                        // Haxe.g:425:27: ( IDENTIFIER )?
                        if ( stream_IDENTIFIER.hasNext() ) {
                            adaptor.addChild(root_1, 
                            stream_IDENTIFIER.nextNode()
                            );

                        }
                        stream_IDENTIFIER.reset();

                        // Haxe.g:425:39: ( paramList )?
                        if ( stream_paramList.hasNext() ) {
                            adaptor.addChild(root_1, stream_paramList.nextTree());

                        }
                        stream_paramList.reset();

                        // Haxe.g:425:50: ( typeTag )?
                        if ( stream_typeTag.hasNext() ) {
                            adaptor.addChild(root_1, stream_typeTag.nextTree());

                        }
                        stream_typeTag.reset();

                        // Haxe.g:425:59: ( typeParamOpt )?
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
            if ( state.backtracking>0 ) { memoize(input, 68, funcProtoDecl_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "funcProtoDecl"


    public static class interfaceDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "interfaceDecl"
    // Haxe.g:428:1: interfaceDecl : ( topLevelAccess )? INTERFACE type inheritListOpt LBRACE ! interfaceBody RBRACE !;
    public final HaxeParser.interfaceDecl_return interfaceDecl() throws RecognitionException {
        HaxeParser.interfaceDecl_return retval = new HaxeParser.interfaceDecl_return();
        retval.start = input.LT(1);

        int interfaceDecl_StartIndex = input.index();

        Object root_0 = null;

        Token INTERFACE383=null;
        Token LBRACE386=null;
        Token RBRACE388=null;
        HaxeParser.topLevelAccess_return topLevelAccess382 =null;

        HaxeParser.type_return type384 =null;

        HaxeParser.inheritListOpt_return inheritListOpt385 =null;

        HaxeParser.interfaceBody_return interfaceBody387 =null;


        Object INTERFACE383_tree=null;
        Object LBRACE386_tree=null;
        Object RBRACE388_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 69) ) { return retval; }

            // Haxe.g:429:5: ( ( topLevelAccess )? INTERFACE type inheritListOpt LBRACE ! interfaceBody RBRACE !)
            // Haxe.g:429:9: ( topLevelAccess )? INTERFACE type inheritListOpt LBRACE ! interfaceBody RBRACE !
            {
            root_0 = (Object)adaptor.nil();


            // Haxe.g:429:9: ( topLevelAccess )?
            int alt110=2;
            int LA110_0 = input.LA(1);

            if ( (LA110_0==EXTERN||LA110_0==PRIVATE) ) {
                alt110=1;
            }
            switch (alt110) {
                case 1 :
                    // Haxe.g:429:9: topLevelAccess
                    {
                    pushFollow(FOLLOW_topLevelAccess_in_interfaceDecl5841);
                    topLevelAccess382=topLevelAccess();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, topLevelAccess382.getTree());

                    }
                    break;

            }


            INTERFACE383=(Token)match(input,INTERFACE,FOLLOW_INTERFACE_in_interfaceDecl5844); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            INTERFACE383_tree = 
            (Object)adaptor.create(INTERFACE383)
            ;
            adaptor.addChild(root_0, INTERFACE383_tree);
            }

            pushFollow(FOLLOW_type_in_interfaceDecl5846);
            type384=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type384.getTree());

            pushFollow(FOLLOW_inheritListOpt_in_interfaceDecl5848);
            inheritListOpt385=inheritListOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, inheritListOpt385.getTree());

            LBRACE386=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_interfaceDecl5850); if (state.failed) return retval;

            pushFollow(FOLLOW_interfaceBody_in_interfaceDecl5853);
            interfaceBody387=interfaceBody();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceBody387.getTree());

            RBRACE388=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_interfaceDecl5855); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 69, interfaceDecl_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "interfaceDecl"


    public static class interfaceBody_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "interfaceBody"
    // Haxe.g:432:1: interfaceBody : ( varDecl interfaceBody | funcProtoDecl interfaceBody |);
    public final HaxeParser.interfaceBody_return interfaceBody() throws RecognitionException {
        HaxeParser.interfaceBody_return retval = new HaxeParser.interfaceBody_return();
        retval.start = input.LT(1);

        int interfaceBody_StartIndex = input.index();

        Object root_0 = null;

        HaxeParser.varDecl_return varDecl389 =null;

        HaxeParser.interfaceBody_return interfaceBody390 =null;

        HaxeParser.funcProtoDecl_return funcProtoDecl391 =null;

        HaxeParser.interfaceBody_return interfaceBody392 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 70) ) { return retval; }

            // Haxe.g:433:5: ( varDecl interfaceBody | funcProtoDecl interfaceBody |)
            int alt111=3;
            switch ( input.LA(1) ) {
            case VAR:
                {
                alt111=1;
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
                alt111=2;
                }
                break;
            case EOF:
            case RBRACE:
                {
                alt111=3;
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
                    // Haxe.g:433:9: varDecl interfaceBody
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_varDecl_in_interfaceBody5879);
                    varDecl389=varDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDecl389.getTree());

                    pushFollow(FOLLOW_interfaceBody_in_interfaceBody5881);
                    interfaceBody390=interfaceBody();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceBody390.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:434:9: funcProtoDecl interfaceBody
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_funcProtoDecl_in_interfaceBody5891);
                    funcProtoDecl391=funcProtoDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, funcProtoDecl391.getTree());

                    pushFollow(FOLLOW_interfaceBody_in_interfaceBody5893);
                    interfaceBody392=interfaceBody();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceBody392.getTree());

                    }
                    break;
                case 3 :
                    // Haxe.g:437:5: 
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
            if ( state.backtracking>0 ) { memoize(input, 70, interfaceBody_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "interfaceBody"


    public static class inheritList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "inheritList"
    // Haxe.g:439:1: inheritList : inherit ( COMMA ! inherit )* ;
    public final HaxeParser.inheritList_return inheritList() throws RecognitionException {
        HaxeParser.inheritList_return retval = new HaxeParser.inheritList_return();
        retval.start = input.LT(1);

        int inheritList_StartIndex = input.index();

        Object root_0 = null;

        Token COMMA394=null;
        HaxeParser.inherit_return inherit393 =null;

        HaxeParser.inherit_return inherit395 =null;


        Object COMMA394_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 71) ) { return retval; }

            // Haxe.g:440:5: ( inherit ( COMMA ! inherit )* )
            // Haxe.g:440:10: inherit ( COMMA ! inherit )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_inherit_in_inheritList5927);
            inherit393=inherit();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, inherit393.getTree());

            // Haxe.g:440:18: ( COMMA ! inherit )*
            loop112:
            do {
                int alt112=2;
                int LA112_0 = input.LA(1);

                if ( (LA112_0==COMMA) ) {
                    alt112=1;
                }


                switch (alt112) {
            	case 1 :
            	    // Haxe.g:440:19: COMMA ! inherit
            	    {
            	    COMMA394=(Token)match(input,COMMA,FOLLOW_COMMA_in_inheritList5930); if (state.failed) return retval;

            	    pushFollow(FOLLOW_inherit_in_inheritList5933);
            	    inherit395=inherit();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, inherit395.getTree());

            	    }
            	    break;

            	default :
            	    break loop112;
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
            if ( state.backtracking>0 ) { memoize(input, 71, inheritList_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "inheritList"


    public static class inheritListOpt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "inheritListOpt"
    // Haxe.g:443:1: inheritListOpt : ( inheritList -> ^( INHERIT_LIST_OPT[\"INHERIT_LIST_OPT\"] ( inheritList )? ) |);
    public final HaxeParser.inheritListOpt_return inheritListOpt() throws RecognitionException {
        HaxeParser.inheritListOpt_return retval = new HaxeParser.inheritListOpt_return();
        retval.start = input.LT(1);

        int inheritListOpt_StartIndex = input.index();

        Object root_0 = null;

        HaxeParser.inheritList_return inheritList396 =null;


        RewriteRuleSubtreeStream stream_inheritList=new RewriteRuleSubtreeStream(adaptor,"rule inheritList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 72) ) { return retval; }

            // Haxe.g:444:5: ( inheritList -> ^( INHERIT_LIST_OPT[\"INHERIT_LIST_OPT\"] ( inheritList )? ) |)
            int alt113=2;
            int LA113_0 = input.LA(1);

            if ( (LA113_0==EXTENDS||LA113_0==IMPLEMENTS) ) {
                alt113=1;
            }
            else if ( (LA113_0==LBRACE) ) {
                alt113=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 113, 0, input);

                throw nvae;

            }
            switch (alt113) {
                case 1 :
                    // Haxe.g:444:10: inheritList
                    {
                    pushFollow(FOLLOW_inheritList_in_inheritListOpt5963);
                    inheritList396=inheritList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_inheritList.add(inheritList396.getTree());

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
                    // 444:22: -> ^( INHERIT_LIST_OPT[\"INHERIT_LIST_OPT\"] ( inheritList )? )
                    {
                        // Haxe.g:444:25: ^( INHERIT_LIST_OPT[\"INHERIT_LIST_OPT\"] ( inheritList )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        new HaxeTree(INHERIT_LIST_OPT, "INHERIT_LIST_OPT")
                        , root_1);

                        // Haxe.g:444:74: ( inheritList )?
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
                    // Haxe.g:446:5: 
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
            if ( state.backtracking>0 ) { memoize(input, 72, inheritListOpt_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "inheritListOpt"


    public static class inherit_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "inherit"
    // Haxe.g:448:1: inherit : ( EXTENDS type -> ^( EXTENDS ( type )? ) | IMPLEMENTS type -> ^( IMPLEMENTS ( type )? ) );
    public final HaxeParser.inherit_return inherit() throws RecognitionException {
        HaxeParser.inherit_return retval = new HaxeParser.inherit_return();
        retval.start = input.LT(1);

        int inherit_StartIndex = input.index();

        Object root_0 = null;

        Token EXTENDS397=null;
        Token IMPLEMENTS399=null;
        HaxeParser.type_return type398 =null;

        HaxeParser.type_return type400 =null;


        Object EXTENDS397_tree=null;
        Object IMPLEMENTS399_tree=null;
        RewriteRuleTokenStream stream_IMPLEMENTS=new RewriteRuleTokenStream(adaptor,"token IMPLEMENTS");
        RewriteRuleTokenStream stream_EXTENDS=new RewriteRuleTokenStream(adaptor,"token EXTENDS");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 73) ) { return retval; }

            // Haxe.g:448:12: ( EXTENDS type -> ^( EXTENDS ( type )? ) | IMPLEMENTS type -> ^( IMPLEMENTS ( type )? ) )
            int alt114=2;
            int LA114_0 = input.LA(1);

            if ( (LA114_0==EXTENDS) ) {
                alt114=1;
            }
            else if ( (LA114_0==IMPLEMENTS) ) {
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
                    // Haxe.g:448:17: EXTENDS type
                    {
                    EXTENDS397=(Token)match(input,EXTENDS,FOLLOW_EXTENDS_in_inherit6009); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EXTENDS.add(EXTENDS397);


                    pushFollow(FOLLOW_type_in_inherit6011);
                    type398=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type398.getTree());

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
                    // 448:34: -> ^( EXTENDS ( type )? )
                    {
                        // Haxe.g:448:37: ^( EXTENDS ( type )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_EXTENDS.nextNode()
                        , root_1);

                        // Haxe.g:448:47: ( type )?
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
                    // Haxe.g:449:14: IMPLEMENTS type
                    {
                    IMPLEMENTS399=(Token)match(input,IMPLEMENTS,FOLLOW_IMPLEMENTS_in_inherit6039); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IMPLEMENTS.add(IMPLEMENTS399);


                    pushFollow(FOLLOW_type_in_inherit6041);
                    type400=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type400.getTree());

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
                    // 449:30: -> ^( IMPLEMENTS ( type )? )
                    {
                        // Haxe.g:449:33: ^( IMPLEMENTS ( type )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_IMPLEMENTS.nextNode()
                        , root_1);

                        // Haxe.g:449:46: ( type )?
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
            if ( state.backtracking>0 ) { memoize(input, 73, inherit_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "inherit"


    public static class typedefDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "typedefDecl"
    // Haxe.g:452:1: typedefDecl : TYPEDEF IDENTIFIER EQ funcType ;
    public final HaxeParser.typedefDecl_return typedefDecl() throws RecognitionException {
        HaxeParser.typedefDecl_return retval = new HaxeParser.typedefDecl_return();
        retval.start = input.LT(1);

        int typedefDecl_StartIndex = input.index();

        Object root_0 = null;

        Token TYPEDEF401=null;
        Token IDENTIFIER402=null;
        Token EQ403=null;
        HaxeParser.funcType_return funcType404 =null;


        Object TYPEDEF401_tree=null;
        Object IDENTIFIER402_tree=null;
        Object EQ403_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 74) ) { return retval; }

            // Haxe.g:453:5: ( TYPEDEF IDENTIFIER EQ funcType )
            // Haxe.g:453:10: TYPEDEF IDENTIFIER EQ funcType
            {
            root_0 = (Object)adaptor.nil();


            TYPEDEF401=(Token)match(input,TYPEDEF,FOLLOW_TYPEDEF_in_typedefDecl6081); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TYPEDEF401_tree = 
            (Object)adaptor.create(TYPEDEF401)
            ;
            adaptor.addChild(root_0, TYPEDEF401_tree);
            }

            IDENTIFIER402=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_typedefDecl6083); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER402_tree = 
            (Object)adaptor.create(IDENTIFIER402)
            ;
            adaptor.addChild(root_0, IDENTIFIER402_tree);
            }

            EQ403=(Token)match(input,EQ,FOLLOW_EQ_in_typedefDecl6085); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            EQ403_tree = 
            (Object)adaptor.create(EQ403)
            ;
            adaptor.addChild(root_0, EQ403_tree);
            }

            pushFollow(FOLLOW_funcType_in_typedefDecl6087);
            funcType404=funcType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, funcType404.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 74, typedefDecl_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "typedefDecl"


    public static class typeExtend_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "typeExtend"
    // Haxe.g:456:1: typeExtend : GT ^ funcType COMMA !;
    public final HaxeParser.typeExtend_return typeExtend() throws RecognitionException {
        HaxeParser.typeExtend_return retval = new HaxeParser.typeExtend_return();
        retval.start = input.LT(1);

        int typeExtend_StartIndex = input.index();

        Object root_0 = null;

        Token GT405=null;
        Token COMMA407=null;
        HaxeParser.funcType_return funcType406 =null;


        Object GT405_tree=null;
        Object COMMA407_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 75) ) { return retval; }

            // Haxe.g:456:17: ( GT ^ funcType COMMA !)
            // Haxe.g:456:19: GT ^ funcType COMMA !
            {
            root_0 = (Object)adaptor.nil();


            GT405=(Token)match(input,GT,FOLLOW_GT_in_typeExtend6109); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            GT405_tree = 
            (Object)adaptor.create(GT405)
            ;
            root_0 = (Object)adaptor.becomeRoot(GT405_tree, root_0);
            }

            pushFollow(FOLLOW_funcType_in_typeExtend6112);
            funcType406=funcType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, funcType406.getTree());

            COMMA407=(Token)match(input,COMMA,FOLLOW_COMMA_in_typeExtend6114); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 75, typeExtend_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "typeExtend"


    public static class anonType_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "anonType"
    // Haxe.g:459:1: anonType : LBRACE ! ( anonTypeFieldList | varDeclList | typeExtend ( anonTypeFieldList | varDeclList )? )? RBRACE !;
    public final HaxeParser.anonType_return anonType() throws RecognitionException {
        HaxeParser.anonType_return retval = new HaxeParser.anonType_return();
        retval.start = input.LT(1);

        int anonType_StartIndex = input.index();

        Object root_0 = null;

        Token LBRACE408=null;
        Token RBRACE414=null;
        HaxeParser.anonTypeFieldList_return anonTypeFieldList409 =null;

        HaxeParser.varDeclList_return varDeclList410 =null;

        HaxeParser.typeExtend_return typeExtend411 =null;

        HaxeParser.anonTypeFieldList_return anonTypeFieldList412 =null;

        HaxeParser.varDeclList_return varDeclList413 =null;


        Object LBRACE408_tree=null;
        Object RBRACE414_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 76) ) { return retval; }

            // Haxe.g:459:17: ( LBRACE ! ( anonTypeFieldList | varDeclList | typeExtend ( anonTypeFieldList | varDeclList )? )? RBRACE !)
            // Haxe.g:459:19: LBRACE ! ( anonTypeFieldList | varDeclList | typeExtend ( anonTypeFieldList | varDeclList )? )? RBRACE !
            {
            root_0 = (Object)adaptor.nil();


            LBRACE408=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_anonType6151); if (state.failed) return retval;

            // Haxe.g:460:21: ( anonTypeFieldList | varDeclList | typeExtend ( anonTypeFieldList | varDeclList )? )?
            int alt116=4;
            switch ( input.LA(1) ) {
                case IDENTIFIER:
                    {
                    alt116=1;
                    }
                    break;
                case VAR:
                    {
                    alt116=2;
                    }
                    break;
                case GT:
                    {
                    alt116=3;
                    }
                    break;
            }

            switch (alt116) {
                case 1 :
                    // Haxe.g:461:23: anonTypeFieldList
                    {
                    pushFollow(FOLLOW_anonTypeFieldList_in_anonType6199);
                    anonTypeFieldList409=anonTypeFieldList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, anonTypeFieldList409.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:462:23: varDeclList
                    {
                    pushFollow(FOLLOW_varDeclList_in_anonType6224);
                    varDeclList410=varDeclList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclList410.getTree());

                    }
                    break;
                case 3 :
                    // Haxe.g:463:23: typeExtend ( anonTypeFieldList | varDeclList )?
                    {
                    pushFollow(FOLLOW_typeExtend_in_anonType6249);
                    typeExtend411=typeExtend();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeExtend411.getTree());

                    // Haxe.g:463:34: ( anonTypeFieldList | varDeclList )?
                    int alt115=3;
                    int LA115_0 = input.LA(1);

                    if ( (LA115_0==IDENTIFIER) ) {
                        alt115=1;
                    }
                    else if ( (LA115_0==VAR) ) {
                        alt115=2;
                    }
                    switch (alt115) {
                        case 1 :
                            // Haxe.g:463:36: anonTypeFieldList
                            {
                            pushFollow(FOLLOW_anonTypeFieldList_in_anonType6253);
                            anonTypeFieldList412=anonTypeFieldList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, anonTypeFieldList412.getTree());

                            }
                            break;
                        case 2 :
                            // Haxe.g:463:56: varDeclList
                            {
                            pushFollow(FOLLOW_varDeclList_in_anonType6257);
                            varDeclList413=varDeclList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclList413.getTree());

                            }
                            break;

                    }


                    }
                    break;

            }


            RBRACE414=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_anonType6304); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 76, anonType_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "anonType"


    public static class anonTypeFieldList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "anonTypeFieldList"
    // Haxe.g:468:1: anonTypeFieldList : anonTypeField ( COMMA ! anonTypeField )* ;
    public final HaxeParser.anonTypeFieldList_return anonTypeFieldList() throws RecognitionException {
        HaxeParser.anonTypeFieldList_return retval = new HaxeParser.anonTypeFieldList_return();
        retval.start = input.LT(1);

        int anonTypeFieldList_StartIndex = input.index();

        Object root_0 = null;

        Token COMMA416=null;
        HaxeParser.anonTypeField_return anonTypeField415 =null;

        HaxeParser.anonTypeField_return anonTypeField417 =null;


        Object COMMA416_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 77) ) { return retval; }

            // Haxe.g:469:17: ( anonTypeField ( COMMA ! anonTypeField )* )
            // Haxe.g:469:19: anonTypeField ( COMMA ! anonTypeField )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_anonTypeField_in_anonTypeFieldList6351);
            anonTypeField415=anonTypeField();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, anonTypeField415.getTree());

            // Haxe.g:469:33: ( COMMA ! anonTypeField )*
            loop117:
            do {
                int alt117=2;
                int LA117_0 = input.LA(1);

                if ( (LA117_0==COMMA) ) {
                    alt117=1;
                }


                switch (alt117) {
            	case 1 :
            	    // Haxe.g:469:34: COMMA ! anonTypeField
            	    {
            	    COMMA416=(Token)match(input,COMMA,FOLLOW_COMMA_in_anonTypeFieldList6354); if (state.failed) return retval;

            	    pushFollow(FOLLOW_anonTypeField_in_anonTypeFieldList6357);
            	    anonTypeField417=anonTypeField();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, anonTypeField417.getTree());

            	    }
            	    break;

            	default :
            	    break loop117;
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
            if ( state.backtracking>0 ) { memoize(input, 77, anonTypeFieldList_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "anonTypeFieldList"


    public static class objLit_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "objLit"
    // Haxe.g:472:1: objLit : LBRACE ! objLitElemList RBRACE !;
    public final HaxeParser.objLit_return objLit() throws RecognitionException {
        HaxeParser.objLit_return retval = new HaxeParser.objLit_return();
        retval.start = input.LT(1);

        int objLit_StartIndex = input.index();

        Object root_0 = null;

        Token LBRACE418=null;
        Token RBRACE420=null;
        HaxeParser.objLitElemList_return objLitElemList419 =null;


        Object LBRACE418_tree=null;
        Object RBRACE420_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 78) ) { return retval; }

            // Haxe.g:472:17: ( LBRACE ! objLitElemList RBRACE !)
            // Haxe.g:472:19: LBRACE ! objLitElemList RBRACE !
            {
            root_0 = (Object)adaptor.nil();


            LBRACE418=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_objLit6393); if (state.failed) return retval;

            pushFollow(FOLLOW_objLitElemList_in_objLit6396);
            objLitElemList419=objLitElemList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, objLitElemList419.getTree());

            RBRACE420=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_objLit6398); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 78, objLit_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "objLit"


    public static class anonTypeField_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "anonTypeField"
    // Haxe.g:475:1: anonTypeField : IDENTIFIER COLON ! funcType ;
    public final HaxeParser.anonTypeField_return anonTypeField() throws RecognitionException {
        HaxeParser.anonTypeField_return retval = new HaxeParser.anonTypeField_return();
        retval.start = input.LT(1);

        int anonTypeField_StartIndex = input.index();

        Object root_0 = null;

        Token IDENTIFIER421=null;
        Token COLON422=null;
        HaxeParser.funcType_return funcType423 =null;


        Object IDENTIFIER421_tree=null;
        Object COLON422_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 79) ) { return retval; }

            // Haxe.g:475:17: ( IDENTIFIER COLON ! funcType )
            // Haxe.g:475:19: IDENTIFIER COLON ! funcType
            {
            root_0 = (Object)adaptor.nil();


            IDENTIFIER421=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_anonTypeField6426); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER421_tree = 
            (Object)adaptor.create(IDENTIFIER421)
            ;
            adaptor.addChild(root_0, IDENTIFIER421_tree);
            }

            COLON422=(Token)match(input,COLON,FOLLOW_COLON_in_anonTypeField6428); if (state.failed) return retval;

            pushFollow(FOLLOW_funcType_in_anonTypeField6431);
            funcType423=funcType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, funcType423.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 79, anonTypeField_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "anonTypeField"


    public static class objLitElemList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "objLitElemList"
    // Haxe.g:478:1: objLitElemList : objLitElem ( COMMA ! objLitElem )* ;
    public final HaxeParser.objLitElemList_return objLitElemList() throws RecognitionException {
        HaxeParser.objLitElemList_return retval = new HaxeParser.objLitElemList_return();
        retval.start = input.LT(1);

        int objLitElemList_StartIndex = input.index();

        Object root_0 = null;

        Token COMMA425=null;
        HaxeParser.objLitElem_return objLitElem424 =null;

        HaxeParser.objLitElem_return objLitElem426 =null;


        Object COMMA425_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 80) ) { return retval; }

            // Haxe.g:478:17: ( objLitElem ( COMMA ! objLitElem )* )
            // Haxe.g:478:19: objLitElem ( COMMA ! objLitElem )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_objLitElem_in_objLitElemList6461);
            objLitElem424=objLitElem();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, objLitElem424.getTree());

            // Haxe.g:478:30: ( COMMA ! objLitElem )*
            loop118:
            do {
                int alt118=2;
                int LA118_0 = input.LA(1);

                if ( (LA118_0==COMMA) ) {
                    alt118=1;
                }


                switch (alt118) {
            	case 1 :
            	    // Haxe.g:478:31: COMMA ! objLitElem
            	    {
            	    COMMA425=(Token)match(input,COMMA,FOLLOW_COMMA_in_objLitElemList6464); if (state.failed) return retval;

            	    pushFollow(FOLLOW_objLitElem_in_objLitElemList6467);
            	    objLitElem426=objLitElem();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, objLitElem426.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 80, objLitElemList_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "objLitElemList"


    public static class objLitElem_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "objLitElem"
    // Haxe.g:481:1: objLitElem : IDENTIFIER COLON ! expr ;
    public final HaxeParser.objLitElem_return objLitElem() throws RecognitionException {
        HaxeParser.objLitElem_return retval = new HaxeParser.objLitElem_return();
        retval.start = input.LT(1);

        int objLitElem_StartIndex = input.index();

        Object root_0 = null;

        Token IDENTIFIER427=null;
        Token COLON428=null;
        HaxeParser.expr_return expr429 =null;


        Object IDENTIFIER427_tree=null;
        Object COLON428_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 81) ) { return retval; }

            // Haxe.g:481:17: ( IDENTIFIER COLON ! expr )
            // Haxe.g:481:19: IDENTIFIER COLON ! expr
            {
            root_0 = (Object)adaptor.nil();


            IDENTIFIER427=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_objLitElem6503); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER427_tree = 
            (Object)adaptor.create(IDENTIFIER427)
            ;
            adaptor.addChild(root_0, IDENTIFIER427_tree);
            }

            COLON428=(Token)match(input,COLON,FOLLOW_COLON_in_objLitElem6505); if (state.failed) return retval;

            pushFollow(FOLLOW_expr_in_objLitElem6508);
            expr429=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr429.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 81, objLitElem_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "objLitElem"


    public static class elementarySymbol_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "elementarySymbol"
    // Haxe.g:485:1: elementarySymbol : ( LONGLITERAL -> LONGLITERAL[$LONGLITERAL, \"INT\"] | NULL -> NULL[$NULL,\"Unknown<0>\"] | INTLITERAL -> INTLITERAL[$INTLITERAL, \"INT\"] | STRINGLITERAL -> STRINGLITERAL[$STRINGLITERAL,\"STRING\"] | CHARLITERAL -> CHARLITERAL[$CHARLITERAL, \"STRING\"] | FLOATNUM -> FLOATNUM[$FLOATNUM, \"FLOAT\"] | TRUE -> TRUE[$TRUE,\"BOOL\"] | FALSE -> FALSE[$FALSE,\"BOOL\"] );
    public final HaxeParser.elementarySymbol_return elementarySymbol() throws RecognitionException {
        HaxeParser.elementarySymbol_return retval = new HaxeParser.elementarySymbol_return();
        retval.start = input.LT(1);

        int elementarySymbol_StartIndex = input.index();

        Object root_0 = null;

        Token LONGLITERAL430=null;
        Token NULL431=null;
        Token INTLITERAL432=null;
        Token STRINGLITERAL433=null;
        Token CHARLITERAL434=null;
        Token FLOATNUM435=null;
        Token TRUE436=null;
        Token FALSE437=null;

        Object LONGLITERAL430_tree=null;
        Object NULL431_tree=null;
        Object INTLITERAL432_tree=null;
        Object STRINGLITERAL433_tree=null;
        Object CHARLITERAL434_tree=null;
        Object FLOATNUM435_tree=null;
        Object TRUE436_tree=null;
        Object FALSE437_tree=null;
        RewriteRuleTokenStream stream_INTLITERAL=new RewriteRuleTokenStream(adaptor,"token INTLITERAL");
        RewriteRuleTokenStream stream_FALSE=new RewriteRuleTokenStream(adaptor,"token FALSE");
        RewriteRuleTokenStream stream_TRUE=new RewriteRuleTokenStream(adaptor,"token TRUE");
        RewriteRuleTokenStream stream_FLOATNUM=new RewriteRuleTokenStream(adaptor,"token FLOATNUM");
        RewriteRuleTokenStream stream_STRINGLITERAL=new RewriteRuleTokenStream(adaptor,"token STRINGLITERAL");
        RewriteRuleTokenStream stream_NULL=new RewriteRuleTokenStream(adaptor,"token NULL");
        RewriteRuleTokenStream stream_CHARLITERAL=new RewriteRuleTokenStream(adaptor,"token CHARLITERAL");
        RewriteRuleTokenStream stream_LONGLITERAL=new RewriteRuleTokenStream(adaptor,"token LONGLITERAL");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 82) ) { return retval; }

            // Haxe.g:486:5: ( LONGLITERAL -> LONGLITERAL[$LONGLITERAL, \"INT\"] | NULL -> NULL[$NULL,\"Unknown<0>\"] | INTLITERAL -> INTLITERAL[$INTLITERAL, \"INT\"] | STRINGLITERAL -> STRINGLITERAL[$STRINGLITERAL,\"STRING\"] | CHARLITERAL -> CHARLITERAL[$CHARLITERAL, \"STRING\"] | FLOATNUM -> FLOATNUM[$FLOATNUM, \"FLOAT\"] | TRUE -> TRUE[$TRUE,\"BOOL\"] | FALSE -> FALSE[$FALSE,\"BOOL\"] )
            int alt119=8;
            switch ( input.LA(1) ) {
            case LONGLITERAL:
                {
                alt119=1;
                }
                break;
            case NULL:
                {
                alt119=2;
                }
                break;
            case INTLITERAL:
                {
                alt119=3;
                }
                break;
            case STRINGLITERAL:
                {
                alt119=4;
                }
                break;
            case CHARLITERAL:
                {
                alt119=5;
                }
                break;
            case FLOATNUM:
                {
                alt119=6;
                }
                break;
            case TRUE:
                {
                alt119=7;
                }
                break;
            case FALSE:
                {
                alt119=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 119, 0, input);

                throw nvae;

            }

            switch (alt119) {
                case 1 :
                    // Haxe.g:486:7: LONGLITERAL
                    {
                    LONGLITERAL430=(Token)match(input,LONGLITERAL,FOLLOW_LONGLITERAL_in_elementarySymbol6542); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LONGLITERAL.add(LONGLITERAL430);


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
                    // 486:21: -> LONGLITERAL[$LONGLITERAL, \"INT\"]
                    {
                        adaptor.addChild(root_0, 
                        new ConstantNode(LONGLITERAL, LONGLITERAL430, "INT")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // Haxe.g:487:7: NULL
                    {
                    NULL431=(Token)match(input,NULL,FOLLOW_NULL_in_elementarySymbol6560); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NULL.add(NULL431);


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
                    // 487:21: -> NULL[$NULL,\"Unknown<0>\"]
                    {
                        adaptor.addChild(root_0, 
                        new ConstantNode(NULL, NULL431, "Unknown<0>")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 3 :
                    // Haxe.g:488:7: INTLITERAL
                    {
                    INTLITERAL432=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_elementarySymbol6585); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INTLITERAL.add(INTLITERAL432);


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
                    // 488:21: -> INTLITERAL[$INTLITERAL, \"INT\"]
                    {
                        adaptor.addChild(root_0, 
                        new ConstantNode(INTLITERAL, INTLITERAL432, "INT")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 4 :
                    // Haxe.g:489:7: STRINGLITERAL
                    {
                    STRINGLITERAL433=(Token)match(input,STRINGLITERAL,FOLLOW_STRINGLITERAL_in_elementarySymbol6604); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STRINGLITERAL.add(STRINGLITERAL433);


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
                    // 489:21: -> STRINGLITERAL[$STRINGLITERAL,\"STRING\"]
                    {
                        adaptor.addChild(root_0, 
                        new ConstantNode(STRINGLITERAL, STRINGLITERAL433, "STRING")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 5 :
                    // Haxe.g:490:7: CHARLITERAL
                    {
                    CHARLITERAL434=(Token)match(input,CHARLITERAL,FOLLOW_CHARLITERAL_in_elementarySymbol6620); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CHARLITERAL.add(CHARLITERAL434);


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
                    // 490:21: -> CHARLITERAL[$CHARLITERAL, \"STRING\"]
                    {
                        adaptor.addChild(root_0, 
                        new ConstantNode(CHARLITERAL, CHARLITERAL434, "STRING")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 6 :
                    // Haxe.g:491:7: FLOATNUM
                    {
                    FLOATNUM435=(Token)match(input,FLOATNUM,FOLLOW_FLOATNUM_in_elementarySymbol6638); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FLOATNUM.add(FLOATNUM435);


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
                    // 491:21: -> FLOATNUM[$FLOATNUM, \"FLOAT\"]
                    {
                        adaptor.addChild(root_0, 
                        new ConstantNode(FLOATNUM, FLOATNUM435, "FLOAT")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 7 :
                    // Haxe.g:492:7: TRUE
                    {
                    TRUE436=(Token)match(input,TRUE,FOLLOW_TRUE_in_elementarySymbol6659); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TRUE.add(TRUE436);


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
                    // 492:21: -> TRUE[$TRUE,\"BOOL\"]
                    {
                        adaptor.addChild(root_0, 
                        new ConstantNode(TRUE, TRUE436, "BOOL")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 8 :
                    // Haxe.g:493:7: FALSE
                    {
                    FALSE437=(Token)match(input,FALSE,FOLLOW_FALSE_in_elementarySymbol6684); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FALSE.add(FALSE437);


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
                    // 493:21: -> FALSE[$FALSE,\"BOOL\"]
                    {
                        adaptor.addChild(root_0, 
                        new ConstantNode(FALSE, FALSE437, "BOOL")
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
            if ( state.backtracking>0 ) { memoize(input, 82, elementarySymbol_StartIndex); }

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
        int alt122=3;
        switch ( input.LA(1) ) {
        case LBRACE:
            {
            alt122=1;
            }
            break;
        case IDENTIFIER:
            {
            alt122=2;
            }
            break;
        case BOOLEAN:
        case DYNAMIC:
        case FLOAT:
        case INT:
        case VOID:
            {
            alt122=3;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 122, 0, input);

            throw nvae;

        }

        switch (alt122) {
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
        loop123:
        do {
            int alt123=2;
            int LA123_0 = input.LA(1);

            if ( (LA123_0==LT) ) {
                alt123=1;
            }


            switch (alt123) {
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
        	    break loop123;
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

    // $ANTLR start synpred122_Haxe
    public final void synpred122_Haxe_fragment() throws RecognitionException {
        // Haxe.g:330:19: ( value ( ( LPAREN ( exprList )? RPAREN ( pureCallOrSlice )? ) | ( LBRACKET expr RBRACKET ( pureCallOrSlice )? ) | ( DOT methodCallOrSlice ) ) )
        // Haxe.g:330:19: value ( ( LPAREN ( exprList )? RPAREN ( pureCallOrSlice )? ) | ( LBRACKET expr RBRACKET ( pureCallOrSlice )? ) | ( DOT methodCallOrSlice ) )
        {
        pushFollow(FOLLOW_value_in_synpred122_Haxe4127);
        value();

        state._fsp--;
        if (state.failed) return ;

        // Haxe.g:330:25: ( ( LPAREN ( exprList )? RPAREN ( pureCallOrSlice )? ) | ( LBRACKET expr RBRACKET ( pureCallOrSlice )? ) | ( DOT methodCallOrSlice ) )
        int alt139=3;
        switch ( input.LA(1) ) {
        case LPAREN:
            {
            alt139=1;
            }
            break;
        case LBRACKET:
            {
            alt139=2;
            }
            break;
        case DOT:
            {
            alt139=3;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 139, 0, input);

            throw nvae;

        }

        switch (alt139) {
            case 1 :
                // Haxe.g:331:15: ( LPAREN ( exprList )? RPAREN ( pureCallOrSlice )? )
                {
                // Haxe.g:331:15: ( LPAREN ( exprList )? RPAREN ( pureCallOrSlice )? )
                // Haxe.g:331:16: LPAREN ( exprList )? RPAREN ( pureCallOrSlice )?
                {
                match(input,LPAREN,FOLLOW_LPAREN_in_synpred122_Haxe4146); if (state.failed) return ;

                // Haxe.g:331:23: ( exprList )?
                int alt136=2;
                int LA136_0 = input.LA(1);

                if ( (LA136_0==BANG||LA136_0==CAST||LA136_0==CHARLITERAL||LA136_0==FALSE||LA136_0==FLOATNUM||LA136_0==FUNCTION||LA136_0==IDENTIFIER||LA136_0==INTLITERAL||(LA136_0 >= LBRACE && LA136_0 <= LBRACKET)||(LA136_0 >= LONGLITERAL && LA136_0 <= LPAREN)||(LA136_0 >= NEW && LA136_0 <= NULL)||LA136_0==PLUSPLUS||(LA136_0 >= STRINGLITERAL && LA136_0 <= SUB)||LA136_0==SUBSUB||LA136_0==THIS||LA136_0==TILDE||LA136_0==TRUE||LA136_0==UNTYPED) ) {
                    alt136=1;
                }
                switch (alt136) {
                    case 1 :
                        // Haxe.g:331:23: exprList
                        {
                        pushFollow(FOLLOW_exprList_in_synpred122_Haxe4148);
                        exprList();

                        state._fsp--;
                        if (state.failed) return ;

                        }
                        break;

                }


                match(input,RPAREN,FOLLOW_RPAREN_in_synpred122_Haxe4151); if (state.failed) return ;

                // Haxe.g:331:40: ( pureCallOrSlice )?
                int alt137=2;
                int LA137_0 = input.LA(1);

                if ( (LA137_0==DOT||LA137_0==LBRACKET||LA137_0==LPAREN) ) {
                    alt137=1;
                }
                switch (alt137) {
                    case 1 :
                        // Haxe.g:331:40: pureCallOrSlice
                        {
                        pushFollow(FOLLOW_pureCallOrSlice_in_synpred122_Haxe4153);
                        pureCallOrSlice();

                        state._fsp--;
                        if (state.failed) return ;

                        }
                        break;

                }


                }


                }
                break;
            case 2 :
                // Haxe.g:333:15: ( LBRACKET expr RBRACKET ( pureCallOrSlice )? )
                {
                // Haxe.g:333:15: ( LBRACKET expr RBRACKET ( pureCallOrSlice )? )
                // Haxe.g:333:16: LBRACKET expr RBRACKET ( pureCallOrSlice )?
                {
                match(input,LBRACKET,FOLLOW_LBRACKET_in_synpred122_Haxe4202); if (state.failed) return ;

                pushFollow(FOLLOW_expr_in_synpred122_Haxe4204);
                expr();

                state._fsp--;
                if (state.failed) return ;

                match(input,RBRACKET,FOLLOW_RBRACKET_in_synpred122_Haxe4206); if (state.failed) return ;

                // Haxe.g:333:39: ( pureCallOrSlice )?
                int alt138=2;
                int LA138_0 = input.LA(1);

                if ( (LA138_0==DOT||LA138_0==LBRACKET||LA138_0==LPAREN) ) {
                    alt138=1;
                }
                switch (alt138) {
                    case 1 :
                        // Haxe.g:333:39: pureCallOrSlice
                        {
                        pushFollow(FOLLOW_pureCallOrSlice_in_synpred122_Haxe4208);
                        pureCallOrSlice();

                        state._fsp--;
                        if (state.failed) return ;

                        }
                        break;

                }


                }


                }
                break;
            case 3 :
                // Haxe.g:335:15: ( DOT methodCallOrSlice )
                {
                // Haxe.g:335:15: ( DOT methodCallOrSlice )
                // Haxe.g:335:16: DOT methodCallOrSlice
                {
                match(input,DOT,FOLLOW_DOT_in_synpred122_Haxe4257); if (state.failed) return ;

                pushFollow(FOLLOW_methodCallOrSlice_in_synpred122_Haxe4259);
                methodCallOrSlice();

                state._fsp--;
                if (state.failed) return ;

                }


                }
                break;

        }


        }

    }
    // $ANTLR end synpred122_Haxe

    // $ANTLR start synpred132_Haxe
    public final void synpred132_Haxe_fragment() throws RecognitionException {
        // Haxe.g:353:18: ( expr )
        // Haxe.g:353:18: expr
        {
        pushFollow(FOLLOW_expr_in_synpred132_Haxe4523);
        expr();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred132_Haxe

    // Delegated rules

    public final boolean synpred132_Haxe() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred132_Haxe_fragment(); // can never throw exception
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


    protected DFA85 dfa85 = new DFA85(this);
    protected DFA100 dfa100 = new DFA100(this);
    protected DFA109 dfa109 = new DFA109(this);
    static final String DFA85_eotS =
        "\10\uffff";
    static final String DFA85_eofS =
        "\10\uffff";
    static final String DFA85_minS =
        "\6\45\2\uffff";
    static final String DFA85_maxS =
        "\6\u009f\2\uffff";
    static final String DFA85_acceptS =
        "\6\uffff\1\1\1\2";
    static final String DFA85_specialS =
        "\10\uffff}>";
    static final String[] DFA85_transitionS = {
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

    static final short[] DFA85_eot = DFA.unpackEncodedString(DFA85_eotS);
    static final short[] DFA85_eof = DFA.unpackEncodedString(DFA85_eofS);
    static final char[] DFA85_min = DFA.unpackEncodedStringToUnsignedChars(DFA85_minS);
    static final char[] DFA85_max = DFA.unpackEncodedStringToUnsignedChars(DFA85_maxS);
    static final short[] DFA85_accept = DFA.unpackEncodedString(DFA85_acceptS);
    static final short[] DFA85_special = DFA.unpackEncodedString(DFA85_specialS);
    static final short[][] DFA85_transition;

    static {
        int numStates = DFA85_transitionS.length;
        DFA85_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA85_transition[i] = DFA.unpackEncodedString(DFA85_transitionS[i]);
        }
    }

    class DFA85 extends DFA {

        public DFA85(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 85;
            this.eot = DFA85_eot;
            this.eof = DFA85_eof;
            this.min = DFA85_min;
            this.max = DFA85_max;
            this.accept = DFA85_accept;
            this.special = DFA85_special;
            this.transition = DFA85_transition;
        }
        public String getDescription() {
            return "382:1: classMember : ( varDeclClass | funcDecl );";
        }
    }
    static final String DFA100_eotS =
        "\11\uffff";
    static final String DFA100_eofS =
        "\11\uffff";
    static final String DFA100_minS =
        "\6\45\1\105\2\uffff";
    static final String DFA100_maxS =
        "\6\u0088\1\141\2\uffff";
    static final String DFA100_acceptS =
        "\7\uffff\1\1\1\2";
    static final String DFA100_specialS =
        "\11\uffff}>";
    static final String[] DFA100_transitionS = {
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

    static final short[] DFA100_eot = DFA.unpackEncodedString(DFA100_eotS);
    static final short[] DFA100_eof = DFA.unpackEncodedString(DFA100_eofS);
    static final char[] DFA100_min = DFA.unpackEncodedStringToUnsignedChars(DFA100_minS);
    static final char[] DFA100_max = DFA.unpackEncodedStringToUnsignedChars(DFA100_maxS);
    static final short[] DFA100_accept = DFA.unpackEncodedString(DFA100_acceptS);
    static final short[] DFA100_special = DFA.unpackEncodedString(DFA100_specialS);
    static final short[][] DFA100_transition;

    static {
        int numStates = DFA100_transitionS.length;
        DFA100_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA100_transition[i] = DFA.unpackEncodedString(DFA100_transitionS[i]);
        }
    }

    class DFA100 extends DFA {

        public DFA100(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 100;
            this.eot = DFA100_eot;
            this.eof = DFA100_eof;
            this.min = DFA100_min;
            this.max = DFA100_max;
            this.accept = DFA100_accept;
            this.special = DFA100_special;
            this.transition = DFA100_transition;
        }
        public String getDescription() {
            return "411:1: funcDecl : ( ( declAttrList )? FUNCTION NEW LPAREN ( paramList )? RPAREN ( typeTag )? block -> ^( FUNCTION NEW ( declAttrList )? ( paramList )? ( typeTag )? ( block )? ) | ( declAttrList )? FUNCTION IDENTIFIER typeParamOpt LPAREN ( paramList )? RPAREN ( typeTag )? block -> ^( FUNCTION IDENTIFIER ( declAttrList )? ( paramList )? ( typeTag )? ( block )? ( typeParamOpt )? ) );";
        }
    }
    static final String DFA109_eotS =
        "\14\uffff";
    static final String DFA109_eofS =
        "\14\uffff";
    static final String DFA109_minS =
        "\6\45\2\105\4\uffff";
    static final String DFA109_maxS =
        "\6\u0088\2\141\4\uffff";
    static final String DFA109_acceptS =
        "\10\uffff\1\3\1\4\1\1\1\2";
    static final String DFA109_specialS =
        "\14\uffff}>";
    static final String[] DFA109_transitionS = {
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

    static final short[] DFA109_eot = DFA.unpackEncodedString(DFA109_eotS);
    static final short[] DFA109_eof = DFA.unpackEncodedString(DFA109_eofS);
    static final char[] DFA109_min = DFA.unpackEncodedStringToUnsignedChars(DFA109_minS);
    static final char[] DFA109_max = DFA.unpackEncodedStringToUnsignedChars(DFA109_maxS);
    static final short[] DFA109_accept = DFA.unpackEncodedString(DFA109_acceptS);
    static final short[] DFA109_special = DFA.unpackEncodedString(DFA109_specialS);
    static final short[][] DFA109_transition;

    static {
        int numStates = DFA109_transitionS.length;
        DFA109_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA109_transition[i] = DFA.unpackEncodedString(DFA109_transitionS[i]);
        }
    }

    class DFA109 extends DFA {

        public DFA109(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 109;
            this.eot = DFA109_eot;
            this.eof = DFA109_eof;
            this.min = DFA109_min;
            this.max = DFA109_max;
            this.accept = DFA109_accept;
            this.special = DFA109_special;
            this.transition = DFA109_transition;
        }
        public String getDescription() {
            return "417:1: funcProtoDecl : ( declAttrList FUNCTION NEW LPAREN ( paramList )? RPAREN ( typeTag )? SEMI -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTag )? ( declAttrList )? ) | declAttrList FUNCTION IDENTIFIER typeParamOpt LPAREN ( paramList )? RPAREN ( typeTag )? SEMI -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTag )? ( declAttrList )? ( typeParamOpt )? ) | FUNCTION NEW LPAREN ( paramList )? RPAREN ( typeTag )? SEMI -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTag )? ) | FUNCTION IDENTIFIER typeParamOpt LPAREN ( paramList )? RPAREN ( typeTag )? SEMI -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTag )? ( typeParamOpt )? ) );";
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
    public static final BitSet FOLLOW_UNTYPED_in_expr2846 = new BitSet(new long[]{0x0288000002400200L,0x0000080600D90020L,0x0000000000522C00L});
    public static final BitSet FOLLOW_assignExpr_in_expr2849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignExpr_in_expr2869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iterExpr_in_assignExpr2899 = new BitSet(new long[]{0x4000080000104082L,0x0000050008000001L,0x00000000000010A0L});
    public static final BitSet FOLLOW_assignOp_in_assignExpr2902 = new BitSet(new long[]{0x0288000002400200L,0x0000080600D90020L,0x0000000000522C00L});
    public static final BitSet FOLLOW_iterExpr_in_assignExpr2905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ternaryExpr_in_iterExpr2945 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_ELLIPSIS_in_iterExpr2969 = new BitSet(new long[]{0x0288000002400200L,0x0000080600D90020L,0x0000000000522C00L});
    public static final BitSet FOLLOW_ternaryExpr_in_iterExpr2975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicOrExpr_in_ternaryExpr3006 = new BitSet(new long[]{0x0000000000000002L,0x2000000000000000L});
    public static final BitSet FOLLOW_QUES_in_ternaryExpr3009 = new BitSet(new long[]{0x0288000002400200L,0x0000080600D90020L,0x0000000020522C00L});
    public static final BitSet FOLLOW_expr_in_ternaryExpr3012 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_COLON_in_ternaryExpr3014 = new BitSet(new long[]{0x0288000002400200L,0x0000080600D90020L,0x0000000000522C00L});
    public static final BitSet FOLLOW_ternaryExpr_in_ternaryExpr3017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicAndExpr_in_logicOrExpr3048 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_BARBAR_in_logicOrExpr3051 = new BitSet(new long[]{0x0288000002400200L,0x0000080600D90020L,0x0000000000522C00L});
    public static final BitSet FOLLOW_logicAndExpr_in_logicOrExpr3057 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_cmpExpr_in_logicAndExpr3091 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_AMPAMP_in_logicAndExpr3093 = new BitSet(new long[]{0x0288000002400200L,0x0000080600D90020L,0x0000000000522C00L});
    public static final BitSet FOLLOW_cmpExpr_in_logicAndExpr3099 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_bitExpr_in_cmpExpr3138 = new BitSet(new long[]{0x1800100000000402L,0x0000000003000000L});
    public static final BitSet FOLLOW_EQEQ_in_cmpExpr3165 = new BitSet(new long[]{0x0288000002400200L,0x0000080600D90020L,0x0000000000522C00L});
    public static final BitSet FOLLOW_BANGEQ_in_cmpExpr3194 = new BitSet(new long[]{0x0288000002400200L,0x0000080600D90020L,0x0000000000522C00L});
    public static final BitSet FOLLOW_GTEQ_in_cmpExpr3223 = new BitSet(new long[]{0x0288000002400200L,0x0000080600D90020L,0x0000000000522C00L});
    public static final BitSet FOLLOW_LTEQ_in_cmpExpr3252 = new BitSet(new long[]{0x0288000002400200L,0x0000080600D90020L,0x0000000000522C00L});
    public static final BitSet FOLLOW_GT_in_cmpExpr3281 = new BitSet(new long[]{0x0288000002400200L,0x0000080600D90020L,0x0000000000522C00L});
    public static final BitSet FOLLOW_LT_in_cmpExpr3310 = new BitSet(new long[]{0x0288000002400200L,0x0000080600D90020L,0x0000000000522C00L});
    public static final BitSet FOLLOW_bitExpr_in_cmpExpr3317 = new BitSet(new long[]{0x1800100000000402L,0x0000000003000000L});
    public static final BitSet FOLLOW_shiftExpr_in_bitExpr3356 = new BitSet(new long[]{0x0000000000081022L});
    public static final BitSet FOLLOW_BAR_in_bitExpr3383 = new BitSet(new long[]{0x0288000002400200L,0x0000080600D90020L,0x0000000000522C00L});
    public static final BitSet FOLLOW_AMP_in_bitExpr3412 = new BitSet(new long[]{0x0288000002400200L,0x0000080600D90020L,0x0000000000522C00L});
    public static final BitSet FOLLOW_CARET_in_bitExpr3441 = new BitSet(new long[]{0x0288000002400200L,0x0000080600D90020L,0x0000000000522C00L});
    public static final BitSet FOLLOW_shiftExpr_in_bitExpr3448 = new BitSet(new long[]{0x0000000000081022L});
    public static final BitSet FOLLOW_addExpr_in_shiftExpr3481 = new BitSet(new long[]{0xA000000000000002L,0x0000000004000000L});
    public static final BitSet FOLLOW_LTLT_in_shiftExpr3508 = new BitSet(new long[]{0x0288000002400200L,0x0000080600D90020L,0x0000000000522C00L});
    public static final BitSet FOLLOW_GTGT_in_shiftExpr3537 = new BitSet(new long[]{0x0288000002400200L,0x0000080600D90020L,0x0000000000522C00L});
    public static final BitSet FOLLOW_GTGTGT_in_shiftExpr3566 = new BitSet(new long[]{0x0288000002400200L,0x0000080600D90020L,0x0000000000522C00L});
    public static final BitSet FOLLOW_addExpr_in_shiftExpr3573 = new BitSet(new long[]{0xA000000000000002L,0x0000000004000000L});
    public static final BitSet FOLLOW_multExpr_in_addExpr3608 = new BitSet(new long[]{0x0000000000000002L,0x0000020000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_PLUS_in_addExpr3635 = new BitSet(new long[]{0x0288000002400200L,0x0000080600D90020L,0x0000000000522C00L});
    public static final BitSet FOLLOW_SUB_in_addExpr3664 = new BitSet(new long[]{0x0288000002400200L,0x0000080600D90020L,0x0000000000522C00L});
    public static final BitSet FOLLOW_multExpr_in_addExpr3671 = new BitSet(new long[]{0x0000000000000002L,0x0000020000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_unarExpr_in_multExpr3710 = new BitSet(new long[]{0x0000000000000002L,0x0000008000000000L,0x0000000000000050L});
    public static final BitSet FOLLOW_STAR_in_multExpr3737 = new BitSet(new long[]{0x0288000002400200L,0x0000080600D90020L,0x0000000000522C00L});
    public static final BitSet FOLLOW_SLASH_in_multExpr3766 = new BitSet(new long[]{0x0288000002400200L,0x0000080600D90020L,0x0000000000522C00L});
    public static final BitSet FOLLOW_PERCENT_in_multExpr3795 = new BitSet(new long[]{0x0288000002400200L,0x0000080600D90020L,0x0000000000522C00L});
    public static final BitSet FOLLOW_unarExpr_in_multExpr3802 = new BitSet(new long[]{0x0000000000000002L,0x0000008000000000L,0x0000000000000050L});
    public static final BitSet FOLLOW_SUB_in_unarExpr3850 = new BitSet(new long[]{0x0288000002400000L,0x0000000600D90020L,0x0000000000420400L});
    public static final BitSet FOLLOW_SUBSUB_in_unarExpr3869 = new BitSet(new long[]{0x0288000002400000L,0x0000000600D90020L,0x0000000000420400L});
    public static final BitSet FOLLOW_PLUSPLUS_in_unarExpr3888 = new BitSet(new long[]{0x0288000002400000L,0x0000000600D90020L,0x0000000000420400L});
    public static final BitSet FOLLOW_BANG_in_unarExpr3907 = new BitSet(new long[]{0x0288000002400000L,0x0000000600D90020L,0x0000000000420400L});
    public static final BitSet FOLLOW_TILDE_in_unarExpr3926 = new BitSet(new long[]{0x0288000002400000L,0x0000000600D90020L,0x0000000000420400L});
    public static final BitSet FOLLOW_prefixExpr_in_unarExpr3933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_prefixExpr_in_unarExpr3953 = new BitSet(new long[]{0x0000000000000002L,0x0000080000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_PLUSPLUS_in_unarExpr3956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUBSUB_in_unarExpr3962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEW_in_prefixExpr4004 = new BitSet(new long[]{0x0040002000010000L,0x0000000000884020L,0x0000000200000000L});
    public static final BitSet FOLLOW_type_in_prefixExpr4007 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_LPAREN_in_prefixExpr4009 = new BitSet(new long[]{0x0288000002400200L,0x0000080600D90020L,0x0000000020522C02L});
    public static final BitSet FOLLOW_exprList_in_prefixExpr4012 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_RPAREN_in_prefixExpr4015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CAST_in_prefixExpr4036 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_LPAREN_in_prefixExpr4039 = new BitSet(new long[]{0x0288000002400200L,0x0000080600D90020L,0x0000000020522C00L});
    public static final BitSet FOLLOW_expr_in_prefixExpr4042 = new BitSet(new long[]{0x0000000010000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_prefixExpr4045 = new BitSet(new long[]{0x0040002000010000L,0x0000000020084020L,0x0000000200000000L});
    public static final BitSet FOLLOW_funcType_in_prefixExpr4048 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_RPAREN_in_prefixExpr4052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_methodCallOrSlice_in_prefixExpr4073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_methodCallOrSlice4127 = new BitSet(new long[]{0x0000000800000000L,0x0000000000900000L});
    public static final BitSet FOLLOW_LPAREN_in_methodCallOrSlice4146 = new BitSet(new long[]{0x0288000002400200L,0x0000080600D90020L,0x0000000020522C02L});
    public static final BitSet FOLLOW_exprList_in_methodCallOrSlice4148 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_RPAREN_in_methodCallOrSlice4151 = new BitSet(new long[]{0x0000000800000002L,0x0000000000900000L});
    public static final BitSet FOLLOW_pureCallOrSlice_in_methodCallOrSlice4153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACKET_in_methodCallOrSlice4202 = new BitSet(new long[]{0x0288000002400200L,0x0000080600D90020L,0x0000000020522C00L});
    public static final BitSet FOLLOW_expr_in_methodCallOrSlice4204 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_RBRACKET_in_methodCallOrSlice4206 = new BitSet(new long[]{0x0000000800000002L,0x0000000000900000L});
    public static final BitSet FOLLOW_pureCallOrSlice_in_methodCallOrSlice4208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_methodCallOrSlice4257 = new BitSet(new long[]{0x0288000002000000L,0x0000000400D90020L,0x0000000000420400L});
    public static final BitSet FOLLOW_methodCallOrSlice_in_methodCallOrSlice4259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_methodCallOrSlice4301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_pureCallOrSlice4326 = new BitSet(new long[]{0x0288000002400200L,0x0000080600D90020L,0x0000000020522C02L});
    public static final BitSet FOLLOW_exprList_in_pureCallOrSlice4328 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_RPAREN_in_pureCallOrSlice4331 = new BitSet(new long[]{0x0000000800000002L,0x0000000000900000L});
    public static final BitSet FOLLOW_pureCallOrSlice_in_pureCallOrSlice4333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACKET_in_pureCallOrSlice4386 = new BitSet(new long[]{0x0288000002400200L,0x0000080600D90020L,0x0000000020522C00L});
    public static final BitSet FOLLOW_expr_in_pureCallOrSlice4388 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_RBRACKET_in_pureCallOrSlice4390 = new BitSet(new long[]{0x0000000800000002L,0x0000000000900000L});
    public static final BitSet FOLLOW_pureCallOrSlice_in_pureCallOrSlice4392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_pureCallOrSlice4444 = new BitSet(new long[]{0x0288000002000000L,0x0000000400D90020L,0x0000000000420400L});
    public static final BitSet FOLLOW_methodCallOrSlice_in_pureCallOrSlice4447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objLit_in_value4483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcLit_in_value4491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayLit_in_value4499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_elementarySymbol_in_value4509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_value4519 = new BitSet(new long[]{0x0388000482420200L,0x0000080600D90060L,0x00000008A0D72C05L});
    public static final BitSet FOLLOW_expr_in_value4523 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_value4525 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_RPAREN_in_value4528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_value4544 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_typeParamOpt_in_value4546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classDecl_in_topLevelDecl4565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interfaceDecl_in_topLevelDecl4585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumDecl_in_topLevelDecl4605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typedefDecl_in_topLevelDecl4625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_topLevelAccess_in_enumDecl4661 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_ENUM_in_enumDecl4664 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_IDENTIFIER_in_enumDecl4666 = new BitSet(new long[]{0x0000000000000000L,0x0000000001080000L});
    public static final BitSet FOLLOW_typeParamOpt_in_enumDecl4668 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_enumBody_in_enumDecl4670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_enumBody4720 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000020L});
    public static final BitSet FOLLOW_enumValueDecl_in_enumBody4723 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000020L});
    public static final BitSet FOLLOW_RBRACE_in_enumBody4727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_enumValueDecl4767 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_LPAREN_in_enumValueDecl4773 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000020L,0x0000000000000002L});
    public static final BitSet FOLLOW_paramList_in_enumValueDecl4776 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_RPAREN_in_enumValueDecl4779 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_SEMI_in_enumValueDecl4782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_enumValueDecl4805 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_SEMI_in_enumValueDecl4810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_topLevelAccess_in_classDecl4859 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_CLASS_in_classDecl4862 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_IDENTIFIER_in_classDecl4864 = new BitSet(new long[]{0x0000800000000000L,0x0000000001080100L});
    public static final BitSet FOLLOW_typeParamOpt_in_classDecl4866 = new BitSet(new long[]{0x0000800000000000L,0x0000000000080100L});
    public static final BitSet FOLLOW_inheritListOpt_in_classDecl4868 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_classBodyScope_in_classDecl4870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_classBodyScope4917 = new BitSet(new long[]{0x0200002000000000L,0x5200001000001000L,0x0000000080000100L});
    public static final BitSet FOLLOW_classMember_in_classBodyScope4920 = new BitSet(new long[]{0x0200002000000000L,0x5200001000001000L,0x0000000080000100L});
    public static final BitSet FOLLOW_RBRACE_in_classBodyScope4924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDeclClass_in_classMember4970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcDecl_in_classMember4990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDecl_in_varDeclList5033 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_varDeclList_in_varDeclList5035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttrList_in_varDeclClass5063 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_VAR_in_varDeclClass5066 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_IDENTIFIER_in_varDeclClass5068 = new BitSet(new long[]{0x0000080008000000L,0x0000000000800000L,0x0000000000000004L});
    public static final BitSet FOLLOW_propDecl_in_varDeclClass5070 = new BitSet(new long[]{0x0000080008000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_typeTag_in_varDeclClass5073 = new BitSet(new long[]{0x0000080000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_varInit_in_varDeclClass5076 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_SEMI_in_varDeclClass5079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_varDecl5144 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_varDeclPartList_in_varDecl5147 = new BitSet(new long[]{0x0000000010000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_COMMA_in_varDecl5150 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_varDeclPartList_in_varDecl5153 = new BitSet(new long[]{0x0000000010000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_SEMI_in_varDecl5157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_varDeclPartList5178 = new BitSet(new long[]{0x0000080008000002L,0x0000000000800000L});
    public static final BitSet FOLLOW_propDecl_in_varDeclPartList5180 = new BitSet(new long[]{0x0000080008000002L});
    public static final BitSet FOLLOW_typeTag_in_varDeclPartList5183 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_varInit_in_varDeclPartList5186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_propDecl5237 = new BitSet(new long[]{0x0000002200000000L,0x0000000400000020L});
    public static final BitSet FOLLOW_propAccessor_in_propDecl5241 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_COMMA_in_propDecl5243 = new BitSet(new long[]{0x0000002200000000L,0x0000000400000020L});
    public static final BitSet FOLLOW_propAccessor_in_propDecl5247 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_RPAREN_in_propDecl5249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQ_in_varInit5390 = new BitSet(new long[]{0x0288000002400200L,0x0000080600D90020L,0x0000000020522C00L});
    public static final BitSet FOLLOW_expr_in_varInit5392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttrList_in_funcDecl5434 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_FUNCTION_in_funcDecl5437 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_NEW_in_funcDecl5439 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_LPAREN_in_funcDecl5441 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000020L,0x0000000000000002L});
    public static final BitSet FOLLOW_paramList_in_funcDecl5443 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_RPAREN_in_funcDecl5446 = new BitSet(new long[]{0x0000000008000000L,0x0000000000080000L,0x0000000000000004L});
    public static final BitSet FOLLOW_typeTag_in_funcDecl5448 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L,0x0000000000000004L});
    public static final BitSet FOLLOW_block_in_funcDecl5451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttrList_in_funcDecl5506 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_FUNCTION_in_funcDecl5509 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_IDENTIFIER_in_funcDecl5511 = new BitSet(new long[]{0x0000000000000000L,0x0000000001800000L});
    public static final BitSet FOLLOW_typeParamOpt_in_funcDecl5513 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_LPAREN_in_funcDecl5515 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000020L,0x0000000000000002L});
    public static final BitSet FOLLOW_paramList_in_funcDecl5517 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_RPAREN_in_funcDecl5520 = new BitSet(new long[]{0x0000000008000000L,0x0000000000080000L,0x0000000000000004L});
    public static final BitSet FOLLOW_typeTag_in_funcDecl5522 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L,0x0000000000000004L});
    public static final BitSet FOLLOW_block_in_funcDecl5525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttrList_in_funcProtoDecl5595 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_FUNCTION_in_funcProtoDecl5597 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_NEW_in_funcProtoDecl5599 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_LPAREN_in_funcProtoDecl5601 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000020L,0x0000000000000002L});
    public static final BitSet FOLLOW_paramList_in_funcProtoDecl5603 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_RPAREN_in_funcProtoDecl5606 = new BitSet(new long[]{0x0000000008000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_typeTag_in_funcProtoDecl5608 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_SEMI_in_funcProtoDecl5611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttrList_in_funcProtoDecl5652 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_FUNCTION_in_funcProtoDecl5654 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_IDENTIFIER_in_funcProtoDecl5656 = new BitSet(new long[]{0x0000000000000000L,0x0000000001800000L});
    public static final BitSet FOLLOW_typeParamOpt_in_funcProtoDecl5658 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_LPAREN_in_funcProtoDecl5660 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000020L,0x0000000000000002L});
    public static final BitSet FOLLOW_paramList_in_funcProtoDecl5662 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_RPAREN_in_funcProtoDecl5665 = new BitSet(new long[]{0x0000000008000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_typeTag_in_funcProtoDecl5667 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_SEMI_in_funcProtoDecl5670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_in_funcProtoDecl5714 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_NEW_in_funcProtoDecl5716 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_LPAREN_in_funcProtoDecl5718 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000020L,0x0000000000000002L});
    public static final BitSet FOLLOW_paramList_in_funcProtoDecl5720 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_RPAREN_in_funcProtoDecl5723 = new BitSet(new long[]{0x0000000008000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_typeTag_in_funcProtoDecl5725 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_SEMI_in_funcProtoDecl5728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_in_funcProtoDecl5766 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_IDENTIFIER_in_funcProtoDecl5768 = new BitSet(new long[]{0x0000000000000000L,0x0000000001800000L});
    public static final BitSet FOLLOW_typeParamOpt_in_funcProtoDecl5770 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_LPAREN_in_funcProtoDecl5772 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000020L,0x0000000000000002L});
    public static final BitSet FOLLOW_paramList_in_funcProtoDecl5774 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_RPAREN_in_funcProtoDecl5777 = new BitSet(new long[]{0x0000000008000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_typeTag_in_funcProtoDecl5779 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_SEMI_in_funcProtoDecl5782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_topLevelAccess_in_interfaceDecl5841 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_INTERFACE_in_interfaceDecl5844 = new BitSet(new long[]{0x0040802000010000L,0x0000000000084120L,0x0000000200000000L});
    public static final BitSet FOLLOW_type_in_interfaceDecl5846 = new BitSet(new long[]{0x0000800000000000L,0x0000000000080100L});
    public static final BitSet FOLLOW_inheritListOpt_in_interfaceDecl5848 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_LBRACE_in_interfaceDecl5850 = new BitSet(new long[]{0x0200002000000000L,0x5200001000001000L,0x0000000080000100L});
    public static final BitSet FOLLOW_interfaceBody_in_interfaceDecl5853 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_RBRACE_in_interfaceDecl5855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDecl_in_interfaceBody5879 = new BitSet(new long[]{0x0200002000000000L,0x1200001000001000L,0x0000000080000100L});
    public static final BitSet FOLLOW_interfaceBody_in_interfaceBody5881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcProtoDecl_in_interfaceBody5891 = new BitSet(new long[]{0x0200002000000000L,0x1200001000001000L,0x0000000080000100L});
    public static final BitSet FOLLOW_interfaceBody_in_interfaceBody5893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inherit_in_inheritList5927 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_COMMA_in_inheritList5930 = new BitSet(new long[]{0x0000800000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_inherit_in_inheritList5933 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_inheritList_in_inheritListOpt5963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXTENDS_in_inherit6009 = new BitSet(new long[]{0x0040002000010000L,0x0000000000084020L,0x0000000200000000L});
    public static final BitSet FOLLOW_type_in_inherit6011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IMPLEMENTS_in_inherit6039 = new BitSet(new long[]{0x0040002000010000L,0x0000000000084020L,0x0000000200000000L});
    public static final BitSet FOLLOW_type_in_inherit6041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPEDEF_in_typedefDecl6081 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_IDENTIFIER_in_typedefDecl6083 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_EQ_in_typedefDecl6085 = new BitSet(new long[]{0x0040002000010000L,0x0000000020084020L,0x0000000200000000L});
    public static final BitSet FOLLOW_funcType_in_typedefDecl6087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GT_in_typeExtend6109 = new BitSet(new long[]{0x0040002000010000L,0x0000000020084020L,0x0000000200000000L});
    public static final BitSet FOLLOW_funcType_in_typeExtend6112 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_COMMA_in_typeExtend6114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_anonType6151 = new BitSet(new long[]{0x0800000000000000L,0x4000000000000020L,0x0000000080000000L});
    public static final BitSet FOLLOW_anonTypeFieldList_in_anonType6199 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_varDeclList_in_anonType6224 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_typeExtend_in_anonType6249 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000020L,0x0000000080000000L});
    public static final BitSet FOLLOW_anonTypeFieldList_in_anonType6253 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_varDeclList_in_anonType6257 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_RBRACE_in_anonType6304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_anonTypeField_in_anonTypeFieldList6351 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_COMMA_in_anonTypeFieldList6354 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_anonTypeField_in_anonTypeFieldList6357 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_LBRACE_in_objLit6393 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_objLitElemList_in_objLit6396 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_RBRACE_in_objLit6398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_anonTypeField6426 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_COLON_in_anonTypeField6428 = new BitSet(new long[]{0x0040002000010000L,0x0000000020084020L,0x0000000200000000L});
    public static final BitSet FOLLOW_funcType_in_anonTypeField6431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objLitElem_in_objLitElemList6461 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_COMMA_in_objLitElemList6464 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_objLitElem_in_objLitElemList6467 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_objLitElem6503 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_COLON_in_objLitElem6505 = new BitSet(new long[]{0x0288000002400200L,0x0000080600D90020L,0x0000000020522C00L});
    public static final BitSet FOLLOW_expr_in_objLitElem6508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LONGLITERAL_in_elementarySymbol6542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_elementarySymbol6560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTLITERAL_in_elementarySymbol6585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRINGLITERAL_in_elementarySymbol6604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARLITERAL_in_elementarySymbol6620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOATNUM_in_elementarySymbol6638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_elementarySymbol6659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_elementarySymbol6684 = new BitSet(new long[]{0x0000000000000002L});
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
    public static final BitSet FOLLOW_value_in_synpred122_Haxe4127 = new BitSet(new long[]{0x0000000800000000L,0x0000000000900000L});
    public static final BitSet FOLLOW_LPAREN_in_synpred122_Haxe4146 = new BitSet(new long[]{0x0288000002400200L,0x0000080600D90020L,0x0000000020522C02L});
    public static final BitSet FOLLOW_exprList_in_synpred122_Haxe4148 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_RPAREN_in_synpred122_Haxe4151 = new BitSet(new long[]{0x0000000800000002L,0x0000000000900000L});
    public static final BitSet FOLLOW_pureCallOrSlice_in_synpred122_Haxe4153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACKET_in_synpred122_Haxe4202 = new BitSet(new long[]{0x0288000002400200L,0x0000080600D90020L,0x0000000020522C00L});
    public static final BitSet FOLLOW_expr_in_synpred122_Haxe4204 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_RBRACKET_in_synpred122_Haxe4206 = new BitSet(new long[]{0x0000000800000002L,0x0000000000900000L});
    public static final BitSet FOLLOW_pureCallOrSlice_in_synpred122_Haxe4208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_synpred122_Haxe4257 = new BitSet(new long[]{0x0288000002000000L,0x0000000400D90020L,0x0000000000420400L});
    public static final BitSet FOLLOW_methodCallOrSlice_in_synpred122_Haxe4259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_synpred132_Haxe4523 = new BitSet(new long[]{0x0000000000000002L});

}