// $ANTLR 3.4 Haxe.g 2012-02-06 23:19:16

package haxe.imp.parser.antlr.main;

import haxe.imp.parser.antlr.tree.HaxeTree;
import haxe.imp.parser.antlr.tree.specific.AssignOperationNode;
import haxe.imp.parser.antlr.tree.specific.BinaryExpressionNode;
import haxe.imp.parser.antlr.tree.specific.BlockScopeNode;
import haxe.imp.parser.antlr.tree.specific.ClassNode;
import haxe.imp.parser.antlr.tree.specific.UnarExpressionNode;
import haxe.imp.parser.antlr.tree.specific.EnumNode;
import haxe.imp.parser.antlr.tree.specific.ErrorNode;
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
        this.state.ruleMemo = new HashMap[270+1];
         

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
    // Haxe.g:67:1: module : ( myPackage )? topLevelList -> ^( MODULE[\"MODULE\"] ( myPackage )? ( topLevelList )? ) ;
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

            // Haxe.g:67:17: ( ( myPackage )? topLevelList -> ^( MODULE[\"MODULE\"] ( myPackage )? ( topLevelList )? ) )
            // Haxe.g:67:19: ( myPackage )? topLevelList
            {
            // Haxe.g:67:19: ( myPackage )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==PACKAGE) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // Haxe.g:67:19: myPackage
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
            // 67:43: -> ^( MODULE[\"MODULE\"] ( myPackage )? ( topLevelList )? )
            {
                // Haxe.g:67:46: ^( MODULE[\"MODULE\"] ( myPackage )? ( topLevelList )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                new HaxeTree(MODULE, "MODULE")
                , root_1);

                // Haxe.g:67:75: ( myPackage )?
                if ( stream_myPackage.hasNext() ) {
                    adaptor.addChild(root_1, stream_myPackage.nextTree());

                }
                stream_myPackage.reset();

                // Haxe.g:67:86: ( topLevelList )?
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

            // Haxe.g:70:17: ( ( topLevel )* )
            // Haxe.g:70:19: ( topLevel )*
            {
            root_0 = (Object)adaptor.nil();


            // Haxe.g:70:19: ( topLevel )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==CLASS||LA2_0==ENUM||LA2_0==EXTERN||LA2_0==IMPORT||LA2_0==INTERFACE||LA2_0==PRIVATE||LA2_0==TYPEDEF||LA2_0==USING) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // Haxe.g:70:20: topLevel
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
    // Haxe.g:73:1: topLevel : ( IMPORT ^ dotIdent SEMI !| USING ^ dotIdent SEMI !| topLevelDecl );
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

            // Haxe.g:73:17: ( IMPORT ^ dotIdent SEMI !| USING ^ dotIdent SEMI !| topLevelDecl )
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
                    // Haxe.g:73:19: IMPORT ^ dotIdent SEMI !
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
                    // Haxe.g:74:19: USING ^ dotIdent SEMI !
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
                    // Haxe.g:75:19: topLevelDecl
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
    // Haxe.g:79:1: myPackage : PACKAGE ^ dotIdent SEMI !;
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

            // Haxe.g:79:17: ( PACKAGE ^ dotIdent SEMI !)
            // Haxe.g:79:19: PACKAGE ^ dotIdent SEMI !
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
    // Haxe.g:83:1: meta : MONKEYS_AT metaName ( LPAREN ( paramList )? RPAREN )? ;
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

            // Haxe.g:83:9: ( MONKEYS_AT metaName ( LPAREN ( paramList )? RPAREN )? )
            // Haxe.g:83:11: MONKEYS_AT metaName ( LPAREN ( paramList )? RPAREN )?
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

            // Haxe.g:83:31: ( LPAREN ( paramList )? RPAREN )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==LPAREN) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // Haxe.g:83:32: LPAREN ( paramList )? RPAREN
                    {
                    LPAREN16=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_meta387); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LPAREN16_tree = 
                    (Object)adaptor.create(LPAREN16)
                    ;
                    adaptor.addChild(root_0, LPAREN16_tree);
                    }

                    // Haxe.g:83:39: ( paramList )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==IDENTIFIER||LA4_0==QUES) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // Haxe.g:83:39: paramList
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
    // Haxe.g:86:1: metaName : ( IDENTIFIER | primitiveType | COLON metaName );
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

            // Haxe.g:87:5: ( IDENTIFIER | primitiveType | COLON metaName )
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
                    // Haxe.g:87:7: IDENTIFIER
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
                    // Haxe.g:88:7: primitiveType
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
                    // Haxe.g:90:7: COLON metaName
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
    // Haxe.g:93:1: typeDeclFlags : ( meta )* ( EXTERN | PRIVATE )* ;
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

            // Haxe.g:94:5: ( ( meta )* ( EXTERN | PRIVATE )* )
            // Haxe.g:94:7: ( meta )* ( EXTERN | PRIVATE )*
            {
            root_0 = (Object)adaptor.nil();


            // Haxe.g:94:7: ( meta )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==MONKEYS_AT) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // Haxe.g:94:8: meta
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


            // Haxe.g:94:15: ( EXTERN | PRIVATE )*
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
    // Haxe.g:100:1: topLevelAccess : ( PRIVATE | EXTERN );
    public final HaxeParser.topLevelAccess_return topLevelAccess() throws RecognitionException {
        HaxeParser.topLevelAccess_return retval = new HaxeParser.topLevelAccess_return();
        retval.start = input.LT(1);

        int topLevelAccess_StartIndex = input.index();

        Object root_0 = null;

        Token set25=null;

        Object set25_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return retval; }

            // Haxe.g:100:17: ( PRIVATE | EXTERN )
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
    // Haxe.g:104:1: access : ( PUBLIC | PRIVATE );
    public final HaxeParser.access_return access() throws RecognitionException {
        HaxeParser.access_return retval = new HaxeParser.access_return();
        retval.start = input.LT(1);

        int access_StartIndex = input.index();

        Object root_0 = null;

        Token set26=null;

        Object set26_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return retval; }

            // Haxe.g:104:17: ( PUBLIC | PRIVATE )
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
    // Haxe.g:108:1: declAttr : ( STATIC | INLINE | DYNAMIC | OVERRIDE | access );
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

            // Haxe.g:108:17: ( STATIC | INLINE | DYNAMIC | OVERRIDE | access )
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
                    // Haxe.g:108:19: STATIC
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
                    // Haxe.g:109:19: INLINE
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
                    // Haxe.g:110:19: DYNAMIC
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
                    // Haxe.g:111:19: OVERRIDE
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
                    // Haxe.g:112:19: access
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
    // Haxe.g:116:1: declAttrList : ( declAttr )+ -> ^( DECL_ATTR_LIST[\"DECL_ATTR_LIST\"] ( declAttr )+ ) ;
    public final HaxeParser.declAttrList_return declAttrList() throws RecognitionException {
        HaxeParser.declAttrList_return retval = new HaxeParser.declAttrList_return();
        retval.start = input.LT(1);

        int declAttrList_StartIndex = input.index();

        Object root_0 = null;

        HaxeParser.declAttr_return declAttr32 =null;


        RewriteRuleSubtreeStream stream_declAttr=new RewriteRuleSubtreeStream(adaptor,"rule declAttr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return retval; }

            // Haxe.g:116:17: ( ( declAttr )+ -> ^( DECL_ATTR_LIST[\"DECL_ATTR_LIST\"] ( declAttr )+ ) )
            // Haxe.g:116:19: ( declAttr )+
            {
            // Haxe.g:116:19: ( declAttr )+
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
            	    // Haxe.g:116:19: declAttr
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
            // 116:29: -> ^( DECL_ATTR_LIST[\"DECL_ATTR_LIST\"] ( declAttr )+ )
            {
                // Haxe.g:116:32: ^( DECL_ATTR_LIST[\"DECL_ATTR_LIST\"] ( declAttr )+ )
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
    // Haxe.g:119:1: paramList : param ( COMMA param )* -> ^( PARAM_LIST[\"PARAM_LIST\"] ( param )+ ) ;
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

            // Haxe.g:119:17: ( param ( COMMA param )* -> ^( PARAM_LIST[\"PARAM_LIST\"] ( param )+ ) )
            // Haxe.g:119:19: param ( COMMA param )*
            {
            pushFollow(FOLLOW_param_in_paramList757);
            param33=param();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_param.add(param33.getTree());

            // Haxe.g:119:25: ( COMMA param )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==COMMA) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // Haxe.g:119:26: COMMA param
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
            // 119:40: -> ^( PARAM_LIST[\"PARAM_LIST\"] ( param )+ )
            {
                // Haxe.g:119:43: ^( PARAM_LIST[\"PARAM_LIST\"] ( param )+ )
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
    // Haxe.g:122:1: param : ( QUES )? IDENTIFIER ( typeTag )? ( varInit )? -> ^( VAR[$IDENTIFIER] ( typeTag )? ( varInit )? ( QUES )? ) ;
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

            // Haxe.g:122:17: ( ( QUES )? IDENTIFIER ( typeTag )? ( varInit )? -> ^( VAR[$IDENTIFIER] ( typeTag )? ( varInit )? ( QUES )? ) )
            // Haxe.g:122:19: ( QUES )? IDENTIFIER ( typeTag )? ( varInit )?
            {
            // Haxe.g:122:19: ( QUES )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==QUES) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // Haxe.g:122:19: QUES
                    {
                    QUES36=(Token)match(input,QUES,FOLLOW_QUES_in_param812); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_QUES.add(QUES36);


                    }
                    break;

            }


            IDENTIFIER37=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_param815); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER37);


            // Haxe.g:122:36: ( typeTag )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==COLON) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // Haxe.g:122:36: typeTag
                    {
                    pushFollow(FOLLOW_typeTag_in_param817);
                    typeTag38=typeTag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeTag.add(typeTag38.getTree());

                    }
                    break;

            }


            // Haxe.g:122:45: ( varInit )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==EQ) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // Haxe.g:122:45: varInit
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
            // 122:54: -> ^( VAR[$IDENTIFIER] ( typeTag )? ( varInit )? ( QUES )? )
            {
                // Haxe.g:122:57: ^( VAR[$IDENTIFIER] ( typeTag )? ( varInit )? ( QUES )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                new VarDeclarationNode(VAR, IDENTIFIER37)
                , root_1);

                // Haxe.g:122:96: ( typeTag )?
                if ( stream_typeTag.hasNext() ) {
                    adaptor.addChild(root_1, stream_typeTag.nextTree());

                }
                stream_typeTag.reset();

                // Haxe.g:122:105: ( varInit )?
                if ( stream_varInit.hasNext() ) {
                    adaptor.addChild(root_1, stream_varInit.nextTree());

                }
                stream_varInit.reset();

                // Haxe.g:122:114: ( QUES )?
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
    // Haxe.g:125:1: id : ( IDENTIFIER | THIS );
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

            // Haxe.g:125:17: ( IDENTIFIER | THIS )
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
                    // Haxe.g:125:19: IDENTIFIER
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
                    // Haxe.g:126:19: THIS
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
    // Haxe.g:129:1: dotIdent : ( id DOT a= dotIdent -> ^( DOT id $a) | id -> id );
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

            // Haxe.g:129:17: ( id DOT a= dotIdent -> ^( DOT id $a) | id -> id )
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
                    // Haxe.g:129:19: id DOT a= dotIdent
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
                    // 129:37: -> ^( DOT id $a)
                    {
                        // Haxe.g:129:41: ^( DOT id $a)
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
                    // Haxe.g:130:19: id
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
                    // 130:22: -> id
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
    // Haxe.g:133:1: assignOp : ( EQ -> EQ | PLUSEQ -> PLUSEQ | SUBEQ -> SUBEQ | STAREQ -> STAREQ | SLASHEQ -> SLASHEQ | PERCENTEQ -> PERCENTEQ | AMPEQ -> AMPEQ | BAREQ -> BAREQ | CARETEQ -> CARETEQ | LTLTEQ -> LTLTEQ | GTGTEQ -> GTGTEQ | GTGTGTEQ -> GTGTGTEQ );
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

            // Haxe.g:133:17: ( EQ -> EQ | PLUSEQ -> PLUSEQ | SUBEQ -> SUBEQ | STAREQ -> STAREQ | SLASHEQ -> SLASHEQ | PERCENTEQ -> PERCENTEQ | AMPEQ -> AMPEQ | BAREQ -> BAREQ | CARETEQ -> CARETEQ | LTLTEQ -> LTLTEQ | GTGTEQ -> GTGTEQ | GTGTGTEQ -> GTGTGTEQ )
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
                    // Haxe.g:133:19: EQ
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
                    // 133:28: -> EQ
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
                    // Haxe.g:134:19: PLUSEQ
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
                    // 134:28: -> PLUSEQ
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
                    // Haxe.g:135:19: SUBEQ
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
                    // 135:28: -> SUBEQ
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
                    // Haxe.g:136:19: STAREQ
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
                    // 136:28: -> STAREQ
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
                    // Haxe.g:137:19: SLASHEQ
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
                    // 137:28: -> SLASHEQ
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
                    // Haxe.g:138:19: PERCENTEQ
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
                    // 138:29: -> PERCENTEQ
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
                    // Haxe.g:139:19: AMPEQ
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
                    // 139:28: -> AMPEQ
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
                    // Haxe.g:140:19: BAREQ
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
                    // 140:28: -> BAREQ
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
                    // Haxe.g:141:19: CARETEQ
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
                    // 141:28: -> CARETEQ
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
                    // Haxe.g:142:19: LTLTEQ
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
                    // 142:28: -> LTLTEQ
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
                    // Haxe.g:143:19: GTGTEQ
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
                    // 143:28: -> GTGTEQ
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
                    // Haxe.g:144:19: GTGTGTEQ
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
                    // 144:28: -> GTGTGTEQ
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
    // Haxe.g:147:1: funcLit : FUNCTION ^ LPAREN ! ( paramList )? RPAREN ! ( typeTag )? block ;
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

            // Haxe.g:147:17: ( FUNCTION ^ LPAREN ! ( paramList )? RPAREN ! ( typeTag )? block )
            // Haxe.g:147:19: FUNCTION ^ LPAREN ! ( paramList )? RPAREN ! ( typeTag )? block
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

            // Haxe.g:147:51: ( paramList )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==IDENTIFIER||LA18_0==QUES) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // Haxe.g:147:51: paramList
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

            // Haxe.g:147:70: ( typeTag )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==COLON) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // Haxe.g:147:70: typeTag
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
    // Haxe.g:150:1: arrayLit : LBRACKET ! ( exprList )? RBRACKET !;
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

            // Haxe.g:150:17: ( LBRACKET ! ( exprList )? RBRACKET !)
            // Haxe.g:150:19: LBRACKET ! ( exprList )? RBRACKET !
            {
            root_0 = (Object)adaptor.nil();


            LBRACKET63=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_arrayLit1445); if (state.failed) return retval;

            // Haxe.g:150:29: ( exprList )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==BANG||LA20_0==CAST||LA20_0==CHARLITERAL||LA20_0==FALSE||LA20_0==FLOATNUM||LA20_0==FUNCTION||LA20_0==IDENTIFIER||LA20_0==INTLITERAL||(LA20_0 >= LBRACE && LA20_0 <= LBRACKET)||(LA20_0 >= LONGLITERAL && LA20_0 <= LPAREN)||(LA20_0 >= NEW && LA20_0 <= NULL)||LA20_0==PLUSPLUS||(LA20_0 >= STRINGLITERAL && LA20_0 <= SUB)||LA20_0==SUBSUB||LA20_0==THIS||LA20_0==TILDE||LA20_0==TRUE||LA20_0==UNTYPED) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // Haxe.g:150:29: exprList
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
    // Haxe.g:178:1: typeTag : COLON funcType -> ^( TYPE_TAG[\"TYPE_TAG\"] funcType ) ;
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

            // Haxe.g:178:17: ( COLON funcType -> ^( TYPE_TAG[\"TYPE_TAG\"] funcType ) )
            // Haxe.g:178:19: COLON funcType
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
            // 178:34: -> ^( TYPE_TAG[\"TYPE_TAG\"] funcType )
            {
                // Haxe.g:178:37: ^( TYPE_TAG[\"TYPE_TAG\"] funcType )
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
    // Haxe.g:181:1: typeList : ( funcType ( COMMA ! typeList )? | typeConstraint ( COMMA ! typeList )? );
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

            // Haxe.g:181:17: ( funcType ( COMMA ! typeList )? | typeConstraint ( COMMA ! typeList )? )
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
                    // Haxe.g:181:19: funcType ( COMMA ! typeList )?
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_funcType_in_typeList1542);
                    funcType68=funcType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, funcType68.getTree());

                    // Haxe.g:181:28: ( COMMA ! typeList )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==COMMA) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // Haxe.g:181:29: COMMA ! typeList
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
                    // Haxe.g:182:19: typeConstraint ( COMMA ! typeList )?
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_typeConstraint_in_typeList1570);
                    typeConstraint71=typeConstraint();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeConstraint71.getTree());

                    // Haxe.g:182:34: ( COMMA ! typeList )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==COMMA) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // Haxe.g:182:35: COMMA ! typeList
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
    // Haxe.g:185:1: funcType : type ( MINUS_BIGGER ! type )* ;
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

            // Haxe.g:185:17: ( type ( MINUS_BIGGER ! type )* )
            // Haxe.g:185:19: type ( MINUS_BIGGER ! type )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_type_in_funcType1611);
            type74=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type74.getTree());

            // Haxe.g:185:24: ( MINUS_BIGGER ! type )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==MINUS_BIGGER) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // Haxe.g:185:25: MINUS_BIGGER ! type
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
    // Haxe.g:188:1: primitiveType : ( INT | FLOAT | DYNAMIC | BOOLEAN | VOID );
    public final HaxeParser.primitiveType_return primitiveType() throws RecognitionException {
        HaxeParser.primitiveType_return retval = new HaxeParser.primitiveType_return();
        retval.start = input.LT(1);

        int primitiveType_StartIndex = input.index();

        Object root_0 = null;

        Token set77=null;

        Object set77_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return retval; }

            // Haxe.g:188:17: ( INT | FLOAT | DYNAMIC | BOOLEAN | VOID )
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
    // Haxe.g:191:1: type : ( ( anonType ^| IDENTIFIER ^| primitiveType ^) ( typeParam )* |);
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

            // Haxe.g:191:9: ( ( anonType ^| IDENTIFIER ^| primitiveType ^) ( typeParam )* |)
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
                    // Haxe.g:191:14: ( anonType ^| IDENTIFIER ^| primitiveType ^) ( typeParam )*
                    {
                    root_0 = (Object)adaptor.nil();


                    // Haxe.g:191:14: ( anonType ^| IDENTIFIER ^| primitiveType ^)
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
                            // Haxe.g:191:15: anonType ^
                            {
                            pushFollow(FOLLOW_anonType_in_type1698);
                            anonType78=anonType();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(anonType78.getTree(), root_0);

                            }
                            break;
                        case 2 :
                            // Haxe.g:191:27: IDENTIFIER ^
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
                            // Haxe.g:191:41: primitiveType ^
                            {
                            pushFollow(FOLLOW_primitiveType_in_type1708);
                            primitiveType80=primitiveType();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(primitiveType80.getTree(), root_0);

                            }
                            break;

                    }


                    // Haxe.g:191:58: ( typeParam )*
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
                    	    // Haxe.g:191:59: typeParam
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
                    // Haxe.g:193:9: 
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
    // Haxe.g:195:1: typeParam : LT ! typeList ( typeParam )? GT !;
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

            // Haxe.g:195:17: ( LT ! typeList ( typeParam )? GT !)
            // Haxe.g:195:19: LT ! typeList ( typeParam )? GT !
            {
            root_0 = (Object)adaptor.nil();


            LT82=(Token)match(input,LT,FOLLOW_LT_in_typeParam1773); if (state.failed) return retval;

            pushFollow(FOLLOW_typeList_in_typeParam1776);
            typeList83=typeList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, typeList83.getTree());

            // Haxe.g:195:32: ( typeParam )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==LT) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // Haxe.g:195:32: typeParam
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
    // Haxe.g:198:1: typeParamOpt : ( typeParam -> ^( TYPE_PARAM_OPT[\"TYPE_PARAM_OPT\"] ( typeParam )? ) |);
    public final HaxeParser.typeParamOpt_return typeParamOpt() throws RecognitionException {
        HaxeParser.typeParamOpt_return retval = new HaxeParser.typeParamOpt_return();
        retval.start = input.LT(1);

        int typeParamOpt_StartIndex = input.index();

        Object root_0 = null;

        HaxeParser.typeParam_return typeParam86 =null;


        RewriteRuleSubtreeStream stream_typeParam=new RewriteRuleSubtreeStream(adaptor,"rule typeParam");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return retval; }

            // Haxe.g:199:5: ( typeParam -> ^( TYPE_PARAM_OPT[\"TYPE_PARAM_OPT\"] ( typeParam )? ) |)
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
                    // Haxe.g:199:10: typeParam
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
                    // 199:20: -> ^( TYPE_PARAM_OPT[\"TYPE_PARAM_OPT\"] ( typeParam )? )
                    {
                        // Haxe.g:199:23: ^( TYPE_PARAM_OPT[\"TYPE_PARAM_OPT\"] ( typeParam )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        new HaxeTree(TYPE_PARAM_OPT, "TYPE_PARAM_OPT")
                        , root_1);

                        // Haxe.g:199:68: ( typeParam )?
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
                    // Haxe.g:201:5: 
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
    // Haxe.g:203:1: typeConstraint : IDENTIFIER COLON LPAREN typeList RPAREN -> ^( $typeConstraint ( IDENTIFIER )? ( typeList )? ) ;
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

            // Haxe.g:204:5: ( IDENTIFIER COLON LPAREN typeList RPAREN -> ^( $typeConstraint ( IDENTIFIER )? ( typeList )? ) )
            // Haxe.g:204:9: IDENTIFIER COLON LPAREN typeList RPAREN
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
            // 204:49: -> ^( $typeConstraint ( IDENTIFIER )? ( typeList )? )
            {
                // Haxe.g:204:52: ^( $typeConstraint ( IDENTIFIER )? ( typeList )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_retval.nextNode(), root_1);

                // Haxe.g:204:70: ( IDENTIFIER )?
                if ( stream_IDENTIFIER.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_IDENTIFIER.nextNode()
                    );

                }
                stream_IDENTIFIER.reset();

                // Haxe.g:204:82: ( typeList )?
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
    // Haxe.g:208:1: functionReturn : ( declAttrList )? FUNCTION NEW LPAREN ( paramList )? RPAREN ( typeTag )? block -> ^( FUNCTION NEW ( declAttrList )? ( paramList )? ( typeTag )? ( block )? ) ;
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

            // Haxe.g:209:5: ( ( declAttrList )? FUNCTION NEW LPAREN ( paramList )? RPAREN ( typeTag )? block -> ^( FUNCTION NEW ( declAttrList )? ( paramList )? ( typeTag )? ( block )? ) )
            // Haxe.g:209:10: ( declAttrList )? FUNCTION NEW LPAREN ( paramList )? RPAREN ( typeTag )? block
            {
            // Haxe.g:209:10: ( declAttrList )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==DYNAMIC||LA30_0==INLINE||LA30_0==OVERRIDE||LA30_0==PRIVATE||LA30_0==PUBLIC||LA30_0==STATIC) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // Haxe.g:209:10: declAttrList
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


            // Haxe.g:209:44: ( paramList )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==IDENTIFIER||LA31_0==QUES) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // Haxe.g:209:44: paramList
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


            // Haxe.g:209:62: ( typeTag )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==COLON) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // Haxe.g:209:62: typeTag
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
            // 209:77: -> ^( FUNCTION NEW ( declAttrList )? ( paramList )? ( typeTag )? ( block )? )
            {
                // Haxe.g:209:80: ^( FUNCTION NEW ( declAttrList )? ( paramList )? ( typeTag )? ( block )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                new FunctionNode(stream_FUNCTION.nextToken())
                , root_1);

                adaptor.addChild(root_1, 
                stream_NEW.nextNode()
                );

                // Haxe.g:209:109: ( declAttrList )?
                if ( stream_declAttrList.hasNext() ) {
                    adaptor.addChild(root_1, stream_declAttrList.nextTree());

                }
                stream_declAttrList.reset();

                // Haxe.g:209:123: ( paramList )?
                if ( stream_paramList.hasNext() ) {
                    adaptor.addChild(root_1, stream_paramList.nextTree());

                }
                stream_paramList.reset();

                // Haxe.g:209:134: ( typeTag )?
                if ( stream_typeTag.hasNext() ) {
                    adaptor.addChild(root_1, stream_typeTag.nextTree());

                }
                stream_typeTag.reset();

                // Haxe.g:209:143: ( block )?
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
    // Haxe.g:212:1: statement : ( block | ( assignExpr | expr ) SEMI !| varDecl | IF ^ parExpression statement ( ELSE ! statement )? | FOR LPAREN exp1= expr IN exp2= expr RPAREN statement -> ^( FOR ^( IN $exp1 $exp2) statement ) | WHILE ^ parExpression statement | DO ^ statement WHILE ! parExpression SEMI !| TRY ^ block ( catchStmt )+ | SWITCH ^ LPAREN ! expr RPAREN ! LBRACE ! ( caseStmt )+ RBRACE !| RETURN ^ ( expr )? SEMI !| THROW ^ expr SEMI !| ( BREAK | CONTINUE ) SEMI !| IDENTIFIER COLON statement -> ^( COLON ( IDENTIFIER )? ( statement )? ) | SEMI !);
    public final HaxeParser.statement_return statement() throws RecognitionException {
        HaxeParser.statement_return retval = new HaxeParser.statement_return();
        retval.start = input.LT(1);

        int statement_StartIndex = input.index();

        Object root_0 = null;

        Token SEMI103=null;
        Token IF105=null;
        Token ELSE108=null;
        Token FOR110=null;
        Token LPAREN111=null;
        Token IN112=null;
        Token RPAREN113=null;
        Token WHILE115=null;
        Token DO118=null;
        Token WHILE120=null;
        Token SEMI122=null;
        Token TRY123=null;
        Token SWITCH126=null;
        Token LPAREN127=null;
        Token RPAREN129=null;
        Token LBRACE130=null;
        Token RBRACE132=null;
        Token RETURN133=null;
        Token SEMI135=null;
        Token THROW136=null;
        Token SEMI138=null;
        Token set139=null;
        Token SEMI140=null;
        Token IDENTIFIER141=null;
        Token COLON142=null;
        Token SEMI144=null;
        HaxeParser.expr_return exp1 =null;

        HaxeParser.expr_return exp2 =null;

        HaxeParser.block_return block100 =null;

        HaxeParser.assignExpr_return assignExpr101 =null;

        HaxeParser.expr_return expr102 =null;

        HaxeParser.varDecl_return varDecl104 =null;

        HaxeParser.parExpression_return parExpression106 =null;

        HaxeParser.statement_return statement107 =null;

        HaxeParser.statement_return statement109 =null;

        HaxeParser.statement_return statement114 =null;

        HaxeParser.parExpression_return parExpression116 =null;

        HaxeParser.statement_return statement117 =null;

        HaxeParser.statement_return statement119 =null;

        HaxeParser.parExpression_return parExpression121 =null;

        HaxeParser.block_return block124 =null;

        HaxeParser.catchStmt_return catchStmt125 =null;

        HaxeParser.expr_return expr128 =null;

        HaxeParser.caseStmt_return caseStmt131 =null;

        HaxeParser.expr_return expr134 =null;

        HaxeParser.expr_return expr137 =null;

        HaxeParser.statement_return statement143 =null;


        Object SEMI103_tree=null;
        Object IF105_tree=null;
        Object ELSE108_tree=null;
        Object FOR110_tree=null;
        Object LPAREN111_tree=null;
        Object IN112_tree=null;
        Object RPAREN113_tree=null;
        Object WHILE115_tree=null;
        Object DO118_tree=null;
        Object WHILE120_tree=null;
        Object SEMI122_tree=null;
        Object TRY123_tree=null;
        Object SWITCH126_tree=null;
        Object LPAREN127_tree=null;
        Object RPAREN129_tree=null;
        Object LBRACE130_tree=null;
        Object RBRACE132_tree=null;
        Object RETURN133_tree=null;
        Object SEMI135_tree=null;
        Object THROW136_tree=null;
        Object SEMI138_tree=null;
        Object set139_tree=null;
        Object SEMI140_tree=null;
        Object IDENTIFIER141_tree=null;
        Object COLON142_tree=null;
        Object SEMI144_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_FOR=new RewriteRuleTokenStream(adaptor,"token FOR");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_IN=new RewriteRuleTokenStream(adaptor,"token IN");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return retval; }

            // Haxe.g:213:5: ( block | ( assignExpr | expr ) SEMI !| varDecl | IF ^ parExpression statement ( ELSE ! statement )? | FOR LPAREN exp1= expr IN exp2= expr RPAREN statement -> ^( FOR ^( IN $exp1 $exp2) statement ) | WHILE ^ parExpression statement | DO ^ statement WHILE ! parExpression SEMI !| TRY ^ block ( catchStmt )+ | SWITCH ^ LPAREN ! expr RPAREN ! LBRACE ! ( caseStmt )+ RBRACE !| RETURN ^ ( expr )? SEMI !| THROW ^ expr SEMI !| ( BREAK | CONTINUE ) SEMI !| IDENTIFIER COLON statement -> ^( COLON ( IDENTIFIER )? ( statement )? ) | SEMI !)
            int alt38=14;
            switch ( input.LA(1) ) {
            case LBRACE:
                {
                int LA38_1 = input.LA(2);

                if ( (synpred56_Haxe()) ) {
                    alt38=1;
                }
                else if ( (synpred58_Haxe()) ) {
                    alt38=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 38, 1, input);

                    throw nvae;

                }
                }
                break;
            case SEMI:
                {
                int LA38_2 = input.LA(2);

                if ( (synpred56_Haxe()) ) {
                    alt38=1;
                }
                else if ( (true) ) {
                    alt38=14;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 38, 2, input);

                    throw nvae;

                }
                }
                break;
            case BANG:
            case CAST:
            case CHARLITERAL:
            case FALSE:
            case FLOATNUM:
            case FUNCTION:
            case INTLITERAL:
            case LBRACKET:
            case LONGLITERAL:
            case LPAREN:
            case NEW:
            case NULL:
            case PLUSPLUS:
            case STRINGLITERAL:
            case SUB:
            case SUBSUB:
            case THIS:
            case TILDE:
            case TRUE:
            case UNTYPED:
                {
                alt38=2;
                }
                break;
            case IDENTIFIER:
                {
                int LA38_21 = input.LA(2);

                if ( (synpred58_Haxe()) ) {
                    alt38=2;
                }
                else if ( (synpred74_Haxe()) ) {
                    alt38=13;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 38, 21, input);

                    throw nvae;

                }
                }
                break;
            case VAR:
                {
                alt38=3;
                }
                break;
            case IF:
                {
                alt38=4;
                }
                break;
            case FOR:
                {
                alt38=5;
                }
                break;
            case WHILE:
                {
                alt38=6;
                }
                break;
            case DO:
                {
                alt38=7;
                }
                break;
            case TRY:
                {
                alt38=8;
                }
                break;
            case SWITCH:
                {
                alt38=9;
                }
                break;
            case RETURN:
                {
                alt38=10;
                }
                break;
            case THROW:
                {
                alt38=11;
                }
                break;
            case BREAK:
            case CONTINUE:
                {
                alt38=12;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;

            }

            switch (alt38) {
                case 1 :
                    // Haxe.g:213:10: block
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
                    // Haxe.g:214:10: ( assignExpr | expr ) SEMI !
                    {
                    root_0 = (Object)adaptor.nil();


                    // Haxe.g:214:10: ( assignExpr | expr )
                    int alt33=2;
                    switch ( input.LA(1) ) {
                    case SUB:
                        {
                        int LA33_1 = input.LA(2);

                        if ( (synpred57_Haxe()) ) {
                            alt33=1;
                        }
                        else if ( (true) ) {
                            alt33=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 33, 1, input);

                            throw nvae;

                        }
                        }
                        break;
                    case SUBSUB:
                        {
                        int LA33_2 = input.LA(2);

                        if ( (synpred57_Haxe()) ) {
                            alt33=1;
                        }
                        else if ( (true) ) {
                            alt33=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 33, 2, input);

                            throw nvae;

                        }
                        }
                        break;
                    case PLUSPLUS:
                        {
                        int LA33_3 = input.LA(2);

                        if ( (synpred57_Haxe()) ) {
                            alt33=1;
                        }
                        else if ( (true) ) {
                            alt33=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 33, 3, input);

                            throw nvae;

                        }
                        }
                        break;
                    case BANG:
                        {
                        int LA33_4 = input.LA(2);

                        if ( (synpred57_Haxe()) ) {
                            alt33=1;
                        }
                        else if ( (true) ) {
                            alt33=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 33, 4, input);

                            throw nvae;

                        }
                        }
                        break;
                    case TILDE:
                        {
                        int LA33_5 = input.LA(2);

                        if ( (synpred57_Haxe()) ) {
                            alt33=1;
                        }
                        else if ( (true) ) {
                            alt33=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 33, 5, input);

                            throw nvae;

                        }
                        }
                        break;
                    case NEW:
                        {
                        int LA33_6 = input.LA(2);

                        if ( (synpred57_Haxe()) ) {
                            alt33=1;
                        }
                        else if ( (true) ) {
                            alt33=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 33, 6, input);

                            throw nvae;

                        }
                        }
                        break;
                    case CAST:
                        {
                        int LA33_7 = input.LA(2);

                        if ( (synpred57_Haxe()) ) {
                            alt33=1;
                        }
                        else if ( (true) ) {
                            alt33=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 33, 7, input);

                            throw nvae;

                        }
                        }
                        break;
                    case LBRACE:
                        {
                        int LA33_8 = input.LA(2);

                        if ( (synpred57_Haxe()) ) {
                            alt33=1;
                        }
                        else if ( (true) ) {
                            alt33=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 33, 8, input);

                            throw nvae;

                        }
                        }
                        break;
                    case FUNCTION:
                        {
                        int LA33_9 = input.LA(2);

                        if ( (synpred57_Haxe()) ) {
                            alt33=1;
                        }
                        else if ( (true) ) {
                            alt33=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 33, 9, input);

                            throw nvae;

                        }
                        }
                        break;
                    case LBRACKET:
                        {
                        int LA33_10 = input.LA(2);

                        if ( (synpred57_Haxe()) ) {
                            alt33=1;
                        }
                        else if ( (true) ) {
                            alt33=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 33, 10, input);

                            throw nvae;

                        }
                        }
                        break;
                    case LONGLITERAL:
                        {
                        int LA33_11 = input.LA(2);

                        if ( (synpred57_Haxe()) ) {
                            alt33=1;
                        }
                        else if ( (true) ) {
                            alt33=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 33, 11, input);

                            throw nvae;

                        }
                        }
                        break;
                    case NULL:
                        {
                        int LA33_12 = input.LA(2);

                        if ( (synpred57_Haxe()) ) {
                            alt33=1;
                        }
                        else if ( (true) ) {
                            alt33=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 33, 12, input);

                            throw nvae;

                        }
                        }
                        break;
                    case INTLITERAL:
                        {
                        int LA33_13 = input.LA(2);

                        if ( (synpred57_Haxe()) ) {
                            alt33=1;
                        }
                        else if ( (true) ) {
                            alt33=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 33, 13, input);

                            throw nvae;

                        }
                        }
                        break;
                    case STRINGLITERAL:
                        {
                        int LA33_14 = input.LA(2);

                        if ( (synpred57_Haxe()) ) {
                            alt33=1;
                        }
                        else if ( (true) ) {
                            alt33=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 33, 14, input);

                            throw nvae;

                        }
                        }
                        break;
                    case CHARLITERAL:
                        {
                        int LA33_15 = input.LA(2);

                        if ( (synpred57_Haxe()) ) {
                            alt33=1;
                        }
                        else if ( (true) ) {
                            alt33=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 33, 15, input);

                            throw nvae;

                        }
                        }
                        break;
                    case FLOATNUM:
                        {
                        int LA33_16 = input.LA(2);

                        if ( (synpred57_Haxe()) ) {
                            alt33=1;
                        }
                        else if ( (true) ) {
                            alt33=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 33, 16, input);

                            throw nvae;

                        }
                        }
                        break;
                    case TRUE:
                        {
                        int LA33_17 = input.LA(2);

                        if ( (synpred57_Haxe()) ) {
                            alt33=1;
                        }
                        else if ( (true) ) {
                            alt33=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 33, 17, input);

                            throw nvae;

                        }
                        }
                        break;
                    case FALSE:
                        {
                        int LA33_18 = input.LA(2);

                        if ( (synpred57_Haxe()) ) {
                            alt33=1;
                        }
                        else if ( (true) ) {
                            alt33=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 33, 18, input);

                            throw nvae;

                        }
                        }
                        break;
                    case LPAREN:
                        {
                        int LA33_19 = input.LA(2);

                        if ( (synpred57_Haxe()) ) {
                            alt33=1;
                        }
                        else if ( (true) ) {
                            alt33=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 33, 19, input);

                            throw nvae;

                        }
                        }
                        break;
                    case IDENTIFIER:
                        {
                        int LA33_20 = input.LA(2);

                        if ( (synpred57_Haxe()) ) {
                            alt33=1;
                        }
                        else if ( (true) ) {
                            alt33=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 33, 20, input);

                            throw nvae;

                        }
                        }
                        break;
                    case THIS:
                        {
                        int LA33_21 = input.LA(2);

                        if ( (synpred57_Haxe()) ) {
                            alt33=1;
                        }
                        else if ( (true) ) {
                            alt33=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 33, 21, input);

                            throw nvae;

                        }
                        }
                        break;
                    case UNTYPED:
                        {
                        alt33=2;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 33, 0, input);

                        throw nvae;

                    }

                    switch (alt33) {
                        case 1 :
                            // Haxe.g:214:11: assignExpr
                            {
                            pushFollow(FOLLOW_assignExpr_in_statement1998);
                            assignExpr101=assignExpr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, assignExpr101.getTree());

                            }
                            break;
                        case 2 :
                            // Haxe.g:214:22: expr
                            {
                            pushFollow(FOLLOW_expr_in_statement2000);
                            expr102=expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr102.getTree());

                            }
                            break;

                    }


                    SEMI103=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement2003); if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // Haxe.g:215:10: varDecl
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_varDecl_in_statement2015);
                    varDecl104=varDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDecl104.getTree());

                    }
                    break;
                case 4 :
                    // Haxe.g:216:19: IF ^ parExpression statement ( ELSE ! statement )?
                    {
                    root_0 = (Object)adaptor.nil();


                    IF105=(Token)match(input,IF,FOLLOW_IF_in_statement2035); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IF105_tree = 
                    new IfNode(IF105) 
                    ;
                    root_0 = (Object)adaptor.becomeRoot(IF105_tree, root_0);
                    }

                    pushFollow(FOLLOW_parExpression_in_statement2041);
                    parExpression106=parExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, parExpression106.getTree());

                    pushFollow(FOLLOW_statement_in_statement2043);
                    statement107=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement107.getTree());

                    // Haxe.g:216:55: ( ELSE ! statement )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==ELSE) ) {
                        int LA34_1 = input.LA(2);

                        if ( (synpred60_Haxe()) ) {
                            alt34=1;
                        }
                    }
                    switch (alt34) {
                        case 1 :
                            // Haxe.g:216:56: ELSE ! statement
                            {
                            ELSE108=(Token)match(input,ELSE,FOLLOW_ELSE_in_statement2046); if (state.failed) return retval;

                            pushFollow(FOLLOW_statement_in_statement2049);
                            statement109=statement();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, statement109.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 5 :
                    // Haxe.g:217:19: FOR LPAREN exp1= expr IN exp2= expr RPAREN statement
                    {
                    FOR110=(Token)match(input,FOR,FOLLOW_FOR_in_statement2071); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FOR.add(FOR110);


                    LPAREN111=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_statement2073); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN111);


                    pushFollow(FOLLOW_expr_in_statement2077);
                    exp1=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(exp1.getTree());

                    IN112=(Token)match(input,IN,FOLLOW_IN_in_statement2079); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IN.add(IN112);


                    pushFollow(FOLLOW_expr_in_statement2083);
                    exp2=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(exp2.getTree());

                    RPAREN113=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_statement2085); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN113);


                    pushFollow(FOLLOW_statement_in_statement2087);
                    statement114=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement114.getTree());

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
                    // 217:70: -> ^( FOR ^( IN $exp1 $exp2) statement )
                    {
                        // Haxe.g:217:73: ^( FOR ^( IN $exp1 $exp2) statement )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        new ForNode(stream_FOR.nextToken())
                        , root_1);

                        // Haxe.g:217:88: ^( IN $exp1 $exp2)
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
                    // Haxe.g:218:19: WHILE ^ parExpression statement
                    {
                    root_0 = (Object)adaptor.nil();


                    WHILE115=(Token)match(input,WHILE,FOLLOW_WHILE_in_statement2128); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    WHILE115_tree = 
                    new WhileNode(WHILE115) 
                    ;
                    root_0 = (Object)adaptor.becomeRoot(WHILE115_tree, root_0);
                    }

                    pushFollow(FOLLOW_parExpression_in_statement2134);
                    parExpression116=parExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, parExpression116.getTree());

                    pushFollow(FOLLOW_statement_in_statement2136);
                    statement117=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement117.getTree());

                    }
                    break;
                case 7 :
                    // Haxe.g:219:19: DO ^ statement WHILE ! parExpression SEMI !
                    {
                    root_0 = (Object)adaptor.nil();


                    DO118=(Token)match(input,DO,FOLLOW_DO_in_statement2156); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DO118_tree = 
                    new DoWhileNode(DO118) 
                    ;
                    root_0 = (Object)adaptor.becomeRoot(DO118_tree, root_0);
                    }

                    pushFollow(FOLLOW_statement_in_statement2162);
                    statement119=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement119.getTree());

                    WHILE120=(Token)match(input,WHILE,FOLLOW_WHILE_in_statement2164); if (state.failed) return retval;

                    pushFollow(FOLLOW_parExpression_in_statement2167);
                    parExpression121=parExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, parExpression121.getTree());

                    SEMI122=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement2169); if (state.failed) return retval;

                    }
                    break;
                case 8 :
                    // Haxe.g:220:19: TRY ^ block ( catchStmt )+
                    {
                    root_0 = (Object)adaptor.nil();


                    TRY123=(Token)match(input,TRY,FOLLOW_TRY_in_statement2190); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    TRY123_tree = 
                    new TryNode(TRY123) 
                    ;
                    root_0 = (Object)adaptor.becomeRoot(TRY123_tree, root_0);
                    }

                    pushFollow(FOLLOW_block_in_statement2196);
                    block124=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, block124.getTree());

                    // Haxe.g:220:39: ( catchStmt )+
                    int cnt35=0;
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==CATCH) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // Haxe.g:220:39: catchStmt
                    	    {
                    	    pushFollow(FOLLOW_catchStmt_in_statement2198);
                    	    catchStmt125=catchStmt();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, catchStmt125.getTree());

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


                    }
                    break;
                case 9 :
                    // Haxe.g:221:19: SWITCH ^ LPAREN ! expr RPAREN ! LBRACE ! ( caseStmt )+ RBRACE !
                    {
                    root_0 = (Object)adaptor.nil();


                    SWITCH126=(Token)match(input,SWITCH,FOLLOW_SWITCH_in_statement2219); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SWITCH126_tree = 
                    new SwitchNode(SWITCH126) 
                    ;
                    root_0 = (Object)adaptor.becomeRoot(SWITCH126_tree, root_0);
                    }

                    LPAREN127=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_statement2225); if (state.failed) return retval;

                    pushFollow(FOLLOW_expr_in_statement2228);
                    expr128=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr128.getTree());

                    RPAREN129=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_statement2230); if (state.failed) return retval;

                    LBRACE130=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_statement2233); if (state.failed) return retval;

                    // Haxe.g:221:68: ( caseStmt )+
                    int cnt36=0;
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==CASE||LA36_0==DEFAULT) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // Haxe.g:221:68: caseStmt
                    	    {
                    	    pushFollow(FOLLOW_caseStmt_in_statement2236);
                    	    caseStmt131=caseStmt();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, caseStmt131.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt36 >= 1 ) break loop36;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(36, input);
                                throw eee;
                        }
                        cnt36++;
                    } while (true);


                    RBRACE132=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_statement2239); if (state.failed) return retval;

                    }
                    break;
                case 10 :
                    // Haxe.g:222:19: RETURN ^ ( expr )? SEMI !
                    {
                    root_0 = (Object)adaptor.nil();


                    RETURN133=(Token)match(input,RETURN,FOLLOW_RETURN_in_statement2260); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RETURN133_tree = 
                    new ReturnNode(RETURN133) 
                    ;
                    root_0 = (Object)adaptor.becomeRoot(RETURN133_tree, root_0);
                    }

                    // Haxe.g:222:39: ( expr )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==BANG||LA37_0==CAST||LA37_0==CHARLITERAL||LA37_0==FALSE||LA37_0==FLOATNUM||LA37_0==FUNCTION||LA37_0==IDENTIFIER||LA37_0==INTLITERAL||(LA37_0 >= LBRACE && LA37_0 <= LBRACKET)||(LA37_0 >= LONGLITERAL && LA37_0 <= LPAREN)||(LA37_0 >= NEW && LA37_0 <= NULL)||LA37_0==PLUSPLUS||(LA37_0 >= STRINGLITERAL && LA37_0 <= SUB)||LA37_0==SUBSUB||LA37_0==THIS||LA37_0==TILDE||LA37_0==TRUE||LA37_0==UNTYPED) ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // Haxe.g:222:39: expr
                            {
                            pushFollow(FOLLOW_expr_in_statement2266);
                            expr134=expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr134.getTree());

                            }
                            break;

                    }


                    SEMI135=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement2269); if (state.failed) return retval;

                    }
                    break;
                case 11 :
                    // Haxe.g:223:19: THROW ^ expr SEMI !
                    {
                    root_0 = (Object)adaptor.nil();


                    THROW136=(Token)match(input,THROW,FOLLOW_THROW_in_statement2290); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    THROW136_tree = 
                    (Object)adaptor.create(THROW136)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(THROW136_tree, root_0);
                    }

                    pushFollow(FOLLOW_expr_in_statement2293);
                    expr137=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr137.getTree());

                    SEMI138=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement2295); if (state.failed) return retval;

                    }
                    break;
                case 12 :
                    // Haxe.g:224:19: ( BREAK | CONTINUE ) SEMI !
                    {
                    root_0 = (Object)adaptor.nil();


                    set139=(Token)input.LT(1);

                    if ( input.LA(1)==BREAK||input.LA(1)==CONTINUE ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (Object)adaptor.create(set139)
                        );
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    SEMI140=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement2324); if (state.failed) return retval;

                    }
                    break;
                case 13 :
                    // Haxe.g:225:8: IDENTIFIER COLON statement
                    {
                    IDENTIFIER141=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_statement2334); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER141);


                    COLON142=(Token)match(input,COLON,FOLLOW_COLON_in_statement2336); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(COLON142);


                    pushFollow(FOLLOW_statement_in_statement2338);
                    statement143=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement143.getTree());

                    // AST REWRITE
                    // elements: COLON, statement, IDENTIFIER
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 225:51: -> ^( COLON ( IDENTIFIER )? ( statement )? )
                    {
                        // Haxe.g:225:54: ^( COLON ( IDENTIFIER )? ( statement )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_COLON.nextNode()
                        , root_1);

                        // Haxe.g:225:62: ( IDENTIFIER )?
                        if ( stream_IDENTIFIER.hasNext() ) {
                            adaptor.addChild(root_1, 
                            stream_IDENTIFIER.nextNode()
                            );

                        }
                        stream_IDENTIFIER.reset();

                        // Haxe.g:225:74: ( statement )?
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
                case 14 :
                    // Haxe.g:226:10: SEMI !
                    {
                    root_0 = (Object)adaptor.nil();


                    SEMI144=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement2377); if (state.failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // Haxe.g:229:1: parExpression : LPAREN ! expr RPAREN !;
    public final HaxeParser.parExpression_return parExpression() throws RecognitionException {
        HaxeParser.parExpression_return retval = new HaxeParser.parExpression_return();
        retval.start = input.LT(1);

        int parExpression_StartIndex = input.index();

        Object root_0 = null;

        Token LPAREN145=null;
        Token RPAREN147=null;
        HaxeParser.expr_return expr146 =null;


        Object LPAREN145_tree=null;
        Object RPAREN147_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return retval; }

            // Haxe.g:230:5: ( LPAREN ! expr RPAREN !)
            // Haxe.g:230:9: LPAREN ! expr RPAREN !
            {
            root_0 = (Object)adaptor.nil();


            LPAREN145=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_parExpression2401); if (state.failed) return retval;

            pushFollow(FOLLOW_expr_in_parExpression2404);
            expr146=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr146.getTree());

            RPAREN147=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_parExpression2406); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // Haxe.g:233:1: block : ( LBRACE ( blockStmt )* RBRACE -> ^( BLOCK_SCOPE[$LBRACE, $RBRACE] ( blockStmt )* ) | SEMI !);
    public final HaxeParser.block_return block() throws RecognitionException {
        HaxeParser.block_return retval = new HaxeParser.block_return();
        retval.start = input.LT(1);

        int block_StartIndex = input.index();

        Object root_0 = null;

        Token LBRACE148=null;
        Token RBRACE150=null;
        Token SEMI151=null;
        HaxeParser.blockStmt_return blockStmt149 =null;


        Object LBRACE148_tree=null;
        Object RBRACE150_tree=null;
        Object SEMI151_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_blockStmt=new RewriteRuleSubtreeStream(adaptor,"rule blockStmt");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return retval; }

            // Haxe.g:233:17: ( LBRACE ( blockStmt )* RBRACE -> ^( BLOCK_SCOPE[$LBRACE, $RBRACE] ( blockStmt )* ) | SEMI !)
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==LBRACE) ) {
                alt40=1;
            }
            else if ( (LA40_0==SEMI) ) {
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
                    // Haxe.g:233:19: LBRACE ( blockStmt )* RBRACE
                    {
                    LBRACE148=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_block2430); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LBRACE.add(LBRACE148);


                    // Haxe.g:233:26: ( blockStmt )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==BANG||LA39_0==BREAK||LA39_0==CAST||(LA39_0 >= CHARLITERAL && LA39_0 <= CLASS)||LA39_0==CONTINUE||LA39_0==DO||LA39_0==EXTERN||LA39_0==FALSE||(LA39_0 >= FLOATNUM && LA39_0 <= FUNCTION)||(LA39_0 >= IDENTIFIER && LA39_0 <= IF)||LA39_0==INTLITERAL||(LA39_0 >= LBRACE && LA39_0 <= LBRACKET)||(LA39_0 >= LONGLITERAL && LA39_0 <= LPAREN)||(LA39_0 >= NEW && LA39_0 <= NULL)||LA39_0==PLUSPLUS||LA39_0==PRIVATE||LA39_0==RETURN||LA39_0==SEMI||(LA39_0 >= STRINGLITERAL && LA39_0 <= SUB)||LA39_0==SUBSUB||(LA39_0 >= SWITCH && LA39_0 <= THROW)||LA39_0==TILDE||(LA39_0 >= TRUE && LA39_0 <= TRY)||LA39_0==UNTYPED||LA39_0==VAR||LA39_0==WHILE) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // Haxe.g:233:27: blockStmt
                    	    {
                    	    pushFollow(FOLLOW_blockStmt_in_block2433);
                    	    blockStmt149=blockStmt();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_blockStmt.add(blockStmt149.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop39;
                        }
                    } while (true);


                    RBRACE150=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_block2437); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RBRACE.add(RBRACE150);


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
                    // 233:46: -> ^( BLOCK_SCOPE[$LBRACE, $RBRACE] ( blockStmt )* )
                    {
                        // Haxe.g:233:49: ^( BLOCK_SCOPE[$LBRACE, $RBRACE] ( blockStmt )* )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        new BlockScopeNode(BLOCK_SCOPE, LBRACE148, RBRACE150)
                        , root_1);

                        // Haxe.g:233:97: ( blockStmt )*
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
                    // Haxe.g:234:19: SEMI !
                    {
                    root_0 = (Object)adaptor.nil();


                    SEMI151=(Token)match(input,SEMI,FOLLOW_SEMI_in_block2471); if (state.failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // Haxe.g:237:1: blockStmt : ( varDecl | classDecl | statement );
    public final HaxeParser.blockStmt_return blockStmt() throws RecognitionException {
        HaxeParser.blockStmt_return retval = new HaxeParser.blockStmt_return();
        retval.start = input.LT(1);

        int blockStmt_StartIndex = input.index();

        Object root_0 = null;

        HaxeParser.varDecl_return varDecl152 =null;

        HaxeParser.classDecl_return classDecl153 =null;

        HaxeParser.statement_return statement154 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return retval; }

            // Haxe.g:238:5: ( varDecl | classDecl | statement )
            int alt41=3;
            switch ( input.LA(1) ) {
            case VAR:
                {
                int LA41_1 = input.LA(2);

                if ( (synpred77_Haxe()) ) {
                    alt41=1;
                }
                else if ( (true) ) {
                    alt41=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 41, 1, input);

                    throw nvae;

                }
                }
                break;
            case CLASS:
            case EXTERN:
            case PRIVATE:
                {
                alt41=2;
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
                alt41=3;
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
                    // Haxe.g:238:10: varDecl
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_varDecl_in_blockStmt2504);
                    varDecl152=varDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDecl152.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:239:10: classDecl
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_classDecl_in_blockStmt2515);
                    classDecl153=classDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, classDecl153.getTree());

                    }
                    break;
                case 3 :
                    // Haxe.g:240:10: statement
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_statement_in_blockStmt2526);
                    statement154=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement154.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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


    public static class caseStmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "caseStmt"
    // Haxe.g:243:1: caseStmt : ( CASE ^ exprList COLON ! statement | DEFAULT ^ COLON ! statement );
    public final HaxeParser.caseStmt_return caseStmt() throws RecognitionException {
        HaxeParser.caseStmt_return retval = new HaxeParser.caseStmt_return();
        retval.start = input.LT(1);

        int caseStmt_StartIndex = input.index();

        Object root_0 = null;

        Token CASE155=null;
        Token COLON157=null;
        Token DEFAULT159=null;
        Token COLON160=null;
        HaxeParser.exprList_return exprList156 =null;

        HaxeParser.statement_return statement158 =null;

        HaxeParser.statement_return statement161 =null;


        Object CASE155_tree=null;
        Object COLON157_tree=null;
        Object DEFAULT159_tree=null;
        Object COLON160_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return retval; }

            // Haxe.g:243:17: ( CASE ^ exprList COLON ! statement | DEFAULT ^ COLON ! statement )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==CASE) ) {
                alt42=1;
            }
            else if ( (LA42_0==DEFAULT) ) {
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
                    // Haxe.g:243:19: CASE ^ exprList COLON ! statement
                    {
                    root_0 = (Object)adaptor.nil();


                    CASE155=(Token)match(input,CASE,FOLLOW_CASE_in_caseStmt2550); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CASE155_tree = 
                    (Object)adaptor.create(CASE155)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(CASE155_tree, root_0);
                    }

                    pushFollow(FOLLOW_exprList_in_caseStmt2553);
                    exprList156=exprList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, exprList156.getTree());

                    COLON157=(Token)match(input,COLON,FOLLOW_COLON_in_caseStmt2555); if (state.failed) return retval;

                    pushFollow(FOLLOW_statement_in_caseStmt2558);
                    statement158=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement158.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:244:19: DEFAULT ^ COLON ! statement
                    {
                    root_0 = (Object)adaptor.nil();


                    DEFAULT159=(Token)match(input,DEFAULT,FOLLOW_DEFAULT_in_caseStmt2578); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DEFAULT159_tree = 
                    (Object)adaptor.create(DEFAULT159)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(DEFAULT159_tree, root_0);
                    }

                    COLON160=(Token)match(input,COLON,FOLLOW_COLON_in_caseStmt2581); if (state.failed) return retval;

                    pushFollow(FOLLOW_statement_in_caseStmt2584);
                    statement161=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement161.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 32, caseStmt_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "caseStmt"


    public static class catchStmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "catchStmt"
    // Haxe.g:247:1: catchStmt : CATCH ^ LPAREN ! param RPAREN ! block ;
    public final HaxeParser.catchStmt_return catchStmt() throws RecognitionException {
        HaxeParser.catchStmt_return retval = new HaxeParser.catchStmt_return();
        retval.start = input.LT(1);

        int catchStmt_StartIndex = input.index();

        Object root_0 = null;

        Token CATCH162=null;
        Token LPAREN163=null;
        Token RPAREN165=null;
        HaxeParser.param_return param164 =null;

        HaxeParser.block_return block166 =null;


        Object CATCH162_tree=null;
        Object LPAREN163_tree=null;
        Object RPAREN165_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return retval; }

            // Haxe.g:248:3: ( CATCH ^ LPAREN ! param RPAREN ! block )
            // Haxe.g:248:3: CATCH ^ LPAREN ! param RPAREN ! block
            {
            root_0 = (Object)adaptor.nil();


            CATCH162=(Token)match(input,CATCH,FOLLOW_CATCH_in_catchStmt2620); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            CATCH162_tree = 
            new HaxeTree(CATCH162) 
            ;
            root_0 = (Object)adaptor.becomeRoot(CATCH162_tree, root_0);
            }

            LPAREN163=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_catchStmt2626); if (state.failed) return retval;

            pushFollow(FOLLOW_param_in_catchStmt2629);
            param164=param();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, param164.getTree());

            RPAREN165=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_catchStmt2631); if (state.failed) return retval;

            pushFollow(FOLLOW_block_in_catchStmt2634);
            block166=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, block166.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 33, catchStmt_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "catchStmt"


    public static class exprList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "exprList"
    // Haxe.g:252:1: exprList : expr ( COMMA ! expr )* ;
    public final HaxeParser.exprList_return exprList() throws RecognitionException {
        HaxeParser.exprList_return retval = new HaxeParser.exprList_return();
        retval.start = input.LT(1);

        int exprList_StartIndex = input.index();

        Object root_0 = null;

        Token COMMA168=null;
        HaxeParser.expr_return expr167 =null;

        HaxeParser.expr_return expr169 =null;


        Object COMMA168_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return retval; }

            // Haxe.g:252:17: ( expr ( COMMA ! expr )* )
            // Haxe.g:252:19: expr ( COMMA ! expr )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_expr_in_exprList2656);
            expr167=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr167.getTree());

            // Haxe.g:252:24: ( COMMA ! expr )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==COMMA) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // Haxe.g:252:25: COMMA ! expr
            	    {
            	    COMMA168=(Token)match(input,COMMA,FOLLOW_COMMA_in_exprList2659); if (state.failed) return retval;

            	    pushFollow(FOLLOW_expr_in_exprList2662);
            	    expr169=expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr169.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 34, exprList_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "exprList"


    public static class expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expr"
    // Haxe.g:255:1: expr : ( UNTYPED ^ assignExpr | assignExpr );
    public final HaxeParser.expr_return expr() throws RecognitionException {
        HaxeParser.expr_return retval = new HaxeParser.expr_return();
        retval.start = input.LT(1);

        int expr_StartIndex = input.index();

        Object root_0 = null;

        Token UNTYPED170=null;
        HaxeParser.assignExpr_return assignExpr171 =null;

        HaxeParser.assignExpr_return assignExpr172 =null;


        Object UNTYPED170_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return retval; }

            // Haxe.g:255:17: ( UNTYPED ^ assignExpr | assignExpr )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==UNTYPED) ) {
                alt44=1;
            }
            else if ( (LA44_0==BANG||LA44_0==CAST||LA44_0==CHARLITERAL||LA44_0==FALSE||LA44_0==FLOATNUM||LA44_0==FUNCTION||LA44_0==IDENTIFIER||LA44_0==INTLITERAL||(LA44_0 >= LBRACE && LA44_0 <= LBRACKET)||(LA44_0 >= LONGLITERAL && LA44_0 <= LPAREN)||(LA44_0 >= NEW && LA44_0 <= NULL)||LA44_0==PLUSPLUS||(LA44_0 >= STRINGLITERAL && LA44_0 <= SUB)||LA44_0==SUBSUB||LA44_0==THIS||LA44_0==TILDE||LA44_0==TRUE) ) {
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
                    // Haxe.g:255:19: UNTYPED ^ assignExpr
                    {
                    root_0 = (Object)adaptor.nil();


                    UNTYPED170=(Token)match(input,UNTYPED,FOLLOW_UNTYPED_in_expr2704); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    UNTYPED170_tree = 
                    (Object)adaptor.create(UNTYPED170)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(UNTYPED170_tree, root_0);
                    }

                    pushFollow(FOLLOW_assignExpr_in_expr2707);
                    assignExpr171=assignExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignExpr171.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:256:19: assignExpr
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_assignExpr_in_expr2727);
                    assignExpr172=assignExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignExpr172.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 35, expr_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "expr"


    public static class assignExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assignExpr"
    // Haxe.g:259:1: assignExpr : iterExpr ( assignOp ^ iterExpr )? ;
    public final HaxeParser.assignExpr_return assignExpr() throws RecognitionException {
        HaxeParser.assignExpr_return retval = new HaxeParser.assignExpr_return();
        retval.start = input.LT(1);

        int assignExpr_StartIndex = input.index();

        Object root_0 = null;

        HaxeParser.iterExpr_return iterExpr173 =null;

        HaxeParser.assignOp_return assignOp174 =null;

        HaxeParser.iterExpr_return iterExpr175 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return retval; }

            // Haxe.g:259:17: ( iterExpr ( assignOp ^ iterExpr )? )
            // Haxe.g:259:19: iterExpr ( assignOp ^ iterExpr )?
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_iterExpr_in_assignExpr2757);
            iterExpr173=iterExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, iterExpr173.getTree());

            // Haxe.g:259:28: ( assignOp ^ iterExpr )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==AMPEQ||LA45_0==BAREQ||LA45_0==CARETEQ||LA45_0==EQ||LA45_0==GTGTEQ||LA45_0==GTGTGTEQ||LA45_0==LTLTEQ||LA45_0==PERCENTEQ||LA45_0==PLUSEQ||LA45_0==SLASHEQ||LA45_0==STAREQ||LA45_0==SUBEQ) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // Haxe.g:259:29: assignOp ^ iterExpr
                    {
                    pushFollow(FOLLOW_assignOp_in_assignExpr2760);
                    assignOp174=assignOp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(assignOp174.getTree(), root_0);

                    pushFollow(FOLLOW_iterExpr_in_assignExpr2763);
                    iterExpr175=iterExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, iterExpr175.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 36, assignExpr_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "assignExpr"


    public static class iterExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "iterExpr"
    // Haxe.g:263:1: iterExpr : ternaryExpr ( ELLIPSIS ^ ternaryExpr )? ;
    public final HaxeParser.iterExpr_return iterExpr() throws RecognitionException {
        HaxeParser.iterExpr_return retval = new HaxeParser.iterExpr_return();
        retval.start = input.LT(1);

        int iterExpr_StartIndex = input.index();

        Object root_0 = null;

        Token ELLIPSIS177=null;
        HaxeParser.ternaryExpr_return ternaryExpr176 =null;

        HaxeParser.ternaryExpr_return ternaryExpr178 =null;


        Object ELLIPSIS177_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return retval; }

            // Haxe.g:263:17: ( ternaryExpr ( ELLIPSIS ^ ternaryExpr )? )
            // Haxe.g:263:19: ternaryExpr ( ELLIPSIS ^ ternaryExpr )?
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_ternaryExpr_in_iterExpr2803);
            ternaryExpr176=ternaryExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, ternaryExpr176.getTree());

            // Haxe.g:263:31: ( ELLIPSIS ^ ternaryExpr )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==ELLIPSIS) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // Haxe.g:264:21: ELLIPSIS ^ ternaryExpr
                    {
                    ELLIPSIS177=(Token)match(input,ELLIPSIS,FOLLOW_ELLIPSIS_in_iterExpr2827); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ELLIPSIS177_tree = 
                    new BinaryExpressionNode(ELLIPSIS177) 
                    ;
                    root_0 = (Object)adaptor.becomeRoot(ELLIPSIS177_tree, root_0);
                    }

                    pushFollow(FOLLOW_ternaryExpr_in_iterExpr2833);
                    ternaryExpr178=ternaryExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ternaryExpr178.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 37, iterExpr_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "iterExpr"


    public static class ternaryExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ternaryExpr"
    // Haxe.g:267:1: ternaryExpr : logicOrExpr ( QUES ^ expr COLON ! ternaryExpr )? ;
    public final HaxeParser.ternaryExpr_return ternaryExpr() throws RecognitionException {
        HaxeParser.ternaryExpr_return retval = new HaxeParser.ternaryExpr_return();
        retval.start = input.LT(1);

        int ternaryExpr_StartIndex = input.index();

        Object root_0 = null;

        Token QUES180=null;
        Token COLON182=null;
        HaxeParser.logicOrExpr_return logicOrExpr179 =null;

        HaxeParser.expr_return expr181 =null;

        HaxeParser.ternaryExpr_return ternaryExpr183 =null;


        Object QUES180_tree=null;
        Object COLON182_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return retval; }

            // Haxe.g:267:17: ( logicOrExpr ( QUES ^ expr COLON ! ternaryExpr )? )
            // Haxe.g:267:19: logicOrExpr ( QUES ^ expr COLON ! ternaryExpr )?
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_logicOrExpr_in_ternaryExpr2864);
            logicOrExpr179=logicOrExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, logicOrExpr179.getTree());

            // Haxe.g:267:31: ( QUES ^ expr COLON ! ternaryExpr )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==QUES) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // Haxe.g:267:32: QUES ^ expr COLON ! ternaryExpr
                    {
                    QUES180=(Token)match(input,QUES,FOLLOW_QUES_in_ternaryExpr2867); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    QUES180_tree = 
                    (Object)adaptor.create(QUES180)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(QUES180_tree, root_0);
                    }

                    pushFollow(FOLLOW_expr_in_ternaryExpr2870);
                    expr181=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr181.getTree());

                    COLON182=(Token)match(input,COLON,FOLLOW_COLON_in_ternaryExpr2872); if (state.failed) return retval;

                    pushFollow(FOLLOW_ternaryExpr_in_ternaryExpr2875);
                    ternaryExpr183=ternaryExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ternaryExpr183.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 38, ternaryExpr_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "ternaryExpr"


    public static class logicOrExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "logicOrExpr"
    // Haxe.g:270:1: logicOrExpr : logicAndExpr ( BARBAR ^ logicAndExpr )* ;
    public final HaxeParser.logicOrExpr_return logicOrExpr() throws RecognitionException {
        HaxeParser.logicOrExpr_return retval = new HaxeParser.logicOrExpr_return();
        retval.start = input.LT(1);

        int logicOrExpr_StartIndex = input.index();

        Object root_0 = null;

        Token BARBAR185=null;
        HaxeParser.logicAndExpr_return logicAndExpr184 =null;

        HaxeParser.logicAndExpr_return logicAndExpr186 =null;


        Object BARBAR185_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return retval; }

            // Haxe.g:270:17: ( logicAndExpr ( BARBAR ^ logicAndExpr )* )
            // Haxe.g:270:19: logicAndExpr ( BARBAR ^ logicAndExpr )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_logicAndExpr_in_logicOrExpr2906);
            logicAndExpr184=logicAndExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, logicAndExpr184.getTree());

            // Haxe.g:270:32: ( BARBAR ^ logicAndExpr )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==BARBAR) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // Haxe.g:270:33: BARBAR ^ logicAndExpr
            	    {
            	    BARBAR185=(Token)match(input,BARBAR,FOLLOW_BARBAR_in_logicOrExpr2909); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    BARBAR185_tree = 
            	    new BinaryExpressionNode(BARBAR185) 
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(BARBAR185_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_logicAndExpr_in_logicOrExpr2915);
            	    logicAndExpr186=logicAndExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, logicAndExpr186.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 39, logicOrExpr_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "logicOrExpr"


    public static class logicAndExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "logicAndExpr"
    // Haxe.g:273:1: logicAndExpr : cmpExpr ( AMPAMP ^ cmpExpr )* ;
    public final HaxeParser.logicAndExpr_return logicAndExpr() throws RecognitionException {
        HaxeParser.logicAndExpr_return retval = new HaxeParser.logicAndExpr_return();
        retval.start = input.LT(1);

        int logicAndExpr_StartIndex = input.index();

        Object root_0 = null;

        Token AMPAMP188=null;
        HaxeParser.cmpExpr_return cmpExpr187 =null;

        HaxeParser.cmpExpr_return cmpExpr189 =null;


        Object AMPAMP188_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return retval; }

            // Haxe.g:273:17: ( cmpExpr ( AMPAMP ^ cmpExpr )* )
            // Haxe.g:273:19: cmpExpr ( AMPAMP ^ cmpExpr )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_cmpExpr_in_logicAndExpr2949);
            cmpExpr187=cmpExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, cmpExpr187.getTree());

            // Haxe.g:273:26: ( AMPAMP ^ cmpExpr )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==AMPAMP) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // Haxe.g:273:27: AMPAMP ^ cmpExpr
            	    {
            	    AMPAMP188=(Token)match(input,AMPAMP,FOLLOW_AMPAMP_in_logicAndExpr2951); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    AMPAMP188_tree = 
            	    new BinaryExpressionNode(AMPAMP188) 
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(AMPAMP188_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_cmpExpr_in_logicAndExpr2957);
            	    cmpExpr189=cmpExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, cmpExpr189.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 40, logicAndExpr_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "logicAndExpr"


    public static class cmpExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "cmpExpr"
    // Haxe.g:276:1: cmpExpr : bitExpr ( ( EQEQ ^| BANGEQ ^| GTEQ ^| LTEQ ^| GT ^| LT ^) bitExpr )* ;
    public final HaxeParser.cmpExpr_return cmpExpr() throws RecognitionException {
        HaxeParser.cmpExpr_return retval = new HaxeParser.cmpExpr_return();
        retval.start = input.LT(1);

        int cmpExpr_StartIndex = input.index();

        Object root_0 = null;

        Token EQEQ191=null;
        Token BANGEQ192=null;
        Token GTEQ193=null;
        Token LTEQ194=null;
        Token GT195=null;
        Token LT196=null;
        HaxeParser.bitExpr_return bitExpr190 =null;

        HaxeParser.bitExpr_return bitExpr197 =null;


        Object EQEQ191_tree=null;
        Object BANGEQ192_tree=null;
        Object GTEQ193_tree=null;
        Object LTEQ194_tree=null;
        Object GT195_tree=null;
        Object LT196_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return retval; }

            // Haxe.g:276:17: ( bitExpr ( ( EQEQ ^| BANGEQ ^| GTEQ ^| LTEQ ^| GT ^| LT ^) bitExpr )* )
            // Haxe.g:276:19: bitExpr ( ( EQEQ ^| BANGEQ ^| GTEQ ^| LTEQ ^| GT ^| LT ^) bitExpr )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_bitExpr_in_cmpExpr2996);
            bitExpr190=bitExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bitExpr190.getTree());

            // Haxe.g:276:27: ( ( EQEQ ^| BANGEQ ^| GTEQ ^| LTEQ ^| GT ^| LT ^) bitExpr )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==BANGEQ||LA51_0==EQEQ||(LA51_0 >= GT && LA51_0 <= GTEQ)||(LA51_0 >= LT && LA51_0 <= LTEQ)) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // Haxe.g:276:28: ( EQEQ ^| BANGEQ ^| GTEQ ^| LTEQ ^| GT ^| LT ^) bitExpr
            	    {
            	    // Haxe.g:276:28: ( EQEQ ^| BANGEQ ^| GTEQ ^| LTEQ ^| GT ^| LT ^)
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
            	            // Haxe.g:277:23: EQEQ ^
            	            {
            	            EQEQ191=(Token)match(input,EQEQ,FOLLOW_EQEQ_in_cmpExpr3023); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            EQEQ191_tree = 
            	            new BinaryExpressionNode(EQEQ191) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(EQEQ191_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // Haxe.g:278:23: BANGEQ ^
            	            {
            	            BANGEQ192=(Token)match(input,BANGEQ,FOLLOW_BANGEQ_in_cmpExpr3052); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            BANGEQ192_tree = 
            	            new BinaryExpressionNode(BANGEQ192) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(BANGEQ192_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // Haxe.g:279:23: GTEQ ^
            	            {
            	            GTEQ193=(Token)match(input,GTEQ,FOLLOW_GTEQ_in_cmpExpr3081); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            GTEQ193_tree = 
            	            new BinaryExpressionNode(GTEQ193) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(GTEQ193_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // Haxe.g:280:23: LTEQ ^
            	            {
            	            LTEQ194=(Token)match(input,LTEQ,FOLLOW_LTEQ_in_cmpExpr3110); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            LTEQ194_tree = 
            	            new BinaryExpressionNode(LTEQ194) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(LTEQ194_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 5 :
            	            // Haxe.g:281:23: GT ^
            	            {
            	            GT195=(Token)match(input,GT,FOLLOW_GT_in_cmpExpr3139); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            GT195_tree = 
            	            new BinaryExpressionNode(GT195) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(GT195_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 6 :
            	            // Haxe.g:282:23: LT ^
            	            {
            	            LT196=(Token)match(input,LT,FOLLOW_LT_in_cmpExpr3168); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            LT196_tree = 
            	            new BinaryExpressionNode(LT196) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(LT196_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_bitExpr_in_cmpExpr3175);
            	    bitExpr197=bitExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, bitExpr197.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 41, cmpExpr_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "cmpExpr"


    public static class bitExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "bitExpr"
    // Haxe.g:285:1: bitExpr : shiftExpr ( ( BAR ^| AMP ^| CARET ^) shiftExpr )* ;
    public final HaxeParser.bitExpr_return bitExpr() throws RecognitionException {
        HaxeParser.bitExpr_return retval = new HaxeParser.bitExpr_return();
        retval.start = input.LT(1);

        int bitExpr_StartIndex = input.index();

        Object root_0 = null;

        Token BAR199=null;
        Token AMP200=null;
        Token CARET201=null;
        HaxeParser.shiftExpr_return shiftExpr198 =null;

        HaxeParser.shiftExpr_return shiftExpr202 =null;


        Object BAR199_tree=null;
        Object AMP200_tree=null;
        Object CARET201_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 42) ) { return retval; }

            // Haxe.g:285:17: ( shiftExpr ( ( BAR ^| AMP ^| CARET ^) shiftExpr )* )
            // Haxe.g:285:19: shiftExpr ( ( BAR ^| AMP ^| CARET ^) shiftExpr )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_shiftExpr_in_bitExpr3214);
            shiftExpr198=shiftExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, shiftExpr198.getTree());

            // Haxe.g:285:29: ( ( BAR ^| AMP ^| CARET ^) shiftExpr )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==AMP||LA53_0==BAR||LA53_0==CARET) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // Haxe.g:285:30: ( BAR ^| AMP ^| CARET ^) shiftExpr
            	    {
            	    // Haxe.g:285:30: ( BAR ^| AMP ^| CARET ^)
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
            	            // Haxe.g:286:23: BAR ^
            	            {
            	            BAR199=(Token)match(input,BAR,FOLLOW_BAR_in_bitExpr3241); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            BAR199_tree = 
            	            new BinaryExpressionNode(BAR199) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(BAR199_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // Haxe.g:287:23: AMP ^
            	            {
            	            AMP200=(Token)match(input,AMP,FOLLOW_AMP_in_bitExpr3270); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            AMP200_tree = 
            	            new BinaryExpressionNode(AMP200) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(AMP200_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // Haxe.g:288:23: CARET ^
            	            {
            	            CARET201=(Token)match(input,CARET,FOLLOW_CARET_in_bitExpr3299); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            CARET201_tree = 
            	            new BinaryExpressionNode(CARET201) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(CARET201_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_shiftExpr_in_bitExpr3306);
            	    shiftExpr202=shiftExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, shiftExpr202.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 42, bitExpr_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "bitExpr"


    public static class shiftExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "shiftExpr"
    // Haxe.g:291:1: shiftExpr : addExpr ( ( LTLT ^| GTGT ^| GTGTGT ^) addExpr )* ;
    public final HaxeParser.shiftExpr_return shiftExpr() throws RecognitionException {
        HaxeParser.shiftExpr_return retval = new HaxeParser.shiftExpr_return();
        retval.start = input.LT(1);

        int shiftExpr_StartIndex = input.index();

        Object root_0 = null;

        Token LTLT204=null;
        Token GTGT205=null;
        Token GTGTGT206=null;
        HaxeParser.addExpr_return addExpr203 =null;

        HaxeParser.addExpr_return addExpr207 =null;


        Object LTLT204_tree=null;
        Object GTGT205_tree=null;
        Object GTGTGT206_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 43) ) { return retval; }

            // Haxe.g:291:17: ( addExpr ( ( LTLT ^| GTGT ^| GTGTGT ^) addExpr )* )
            // Haxe.g:291:19: addExpr ( ( LTLT ^| GTGT ^| GTGTGT ^) addExpr )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_addExpr_in_shiftExpr3339);
            addExpr203=addExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, addExpr203.getTree());

            // Haxe.g:291:27: ( ( LTLT ^| GTGT ^| GTGTGT ^) addExpr )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==GTGT||LA55_0==GTGTGT||LA55_0==LTLT) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // Haxe.g:291:28: ( LTLT ^| GTGT ^| GTGTGT ^) addExpr
            	    {
            	    // Haxe.g:291:28: ( LTLT ^| GTGT ^| GTGTGT ^)
            	    int alt54=3;
            	    switch ( input.LA(1) ) {
            	    case LTLT:
            	        {
            	        alt54=1;
            	        }
            	        break;
            	    case GTGT:
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
            	            // Haxe.g:292:23: LTLT ^
            	            {
            	            LTLT204=(Token)match(input,LTLT,FOLLOW_LTLT_in_shiftExpr3366); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            LTLT204_tree = 
            	            new BinaryExpressionNode(LTLT204) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(LTLT204_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // Haxe.g:293:23: GTGT ^
            	            {
            	            GTGT205=(Token)match(input,GTGT,FOLLOW_GTGT_in_shiftExpr3395); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            GTGT205_tree = 
            	            new BinaryExpressionNode(GTGT205) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(GTGT205_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // Haxe.g:294:23: GTGTGT ^
            	            {
            	            GTGTGT206=(Token)match(input,GTGTGT,FOLLOW_GTGTGT_in_shiftExpr3424); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            GTGTGT206_tree = 
            	            new BinaryExpressionNode(GTGTGT206) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(GTGTGT206_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_addExpr_in_shiftExpr3431);
            	    addExpr207=addExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, addExpr207.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 43, shiftExpr_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "shiftExpr"


    public static class addExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "addExpr"
    // Haxe.g:297:1: addExpr : multExpr ( ( PLUS ^| SUB ^) multExpr )* ;
    public final HaxeParser.addExpr_return addExpr() throws RecognitionException {
        HaxeParser.addExpr_return retval = new HaxeParser.addExpr_return();
        retval.start = input.LT(1);

        int addExpr_StartIndex = input.index();

        Object root_0 = null;

        Token PLUS209=null;
        Token SUB210=null;
        HaxeParser.multExpr_return multExpr208 =null;

        HaxeParser.multExpr_return multExpr211 =null;


        Object PLUS209_tree=null;
        Object SUB210_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 44) ) { return retval; }

            // Haxe.g:297:17: ( multExpr ( ( PLUS ^| SUB ^) multExpr )* )
            // Haxe.g:297:19: multExpr ( ( PLUS ^| SUB ^) multExpr )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_multExpr_in_addExpr3466);
            multExpr208=multExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, multExpr208.getTree());

            // Haxe.g:297:28: ( ( PLUS ^| SUB ^) multExpr )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==PLUS||LA57_0==SUB) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // Haxe.g:297:29: ( PLUS ^| SUB ^) multExpr
            	    {
            	    // Haxe.g:297:29: ( PLUS ^| SUB ^)
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
            	            // Haxe.g:298:23: PLUS ^
            	            {
            	            PLUS209=(Token)match(input,PLUS,FOLLOW_PLUS_in_addExpr3493); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            PLUS209_tree = 
            	            new BinaryExpressionNode(PLUS209) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(PLUS209_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // Haxe.g:299:23: SUB ^
            	            {
            	            SUB210=(Token)match(input,SUB,FOLLOW_SUB_in_addExpr3522); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            SUB210_tree = 
            	            new BinaryExpressionNode(SUB210) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(SUB210_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_multExpr_in_addExpr3529);
            	    multExpr211=multExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, multExpr211.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 44, addExpr_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "addExpr"


    public static class multExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "multExpr"
    // Haxe.g:302:1: multExpr : unarExpr ( ( STAR ^| SLASH ^| PERCENT ^) unarExpr )* ;
    public final HaxeParser.multExpr_return multExpr() throws RecognitionException {
        HaxeParser.multExpr_return retval = new HaxeParser.multExpr_return();
        retval.start = input.LT(1);

        int multExpr_StartIndex = input.index();

        Object root_0 = null;

        Token STAR213=null;
        Token SLASH214=null;
        Token PERCENT215=null;
        HaxeParser.unarExpr_return unarExpr212 =null;

        HaxeParser.unarExpr_return unarExpr216 =null;


        Object STAR213_tree=null;
        Object SLASH214_tree=null;
        Object PERCENT215_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 45) ) { return retval; }

            // Haxe.g:302:17: ( unarExpr ( ( STAR ^| SLASH ^| PERCENT ^) unarExpr )* )
            // Haxe.g:302:19: unarExpr ( ( STAR ^| SLASH ^| PERCENT ^) unarExpr )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_unarExpr_in_multExpr3568);
            unarExpr212=unarExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, unarExpr212.getTree());

            // Haxe.g:302:28: ( ( STAR ^| SLASH ^| PERCENT ^) unarExpr )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==PERCENT||LA59_0==SLASH||LA59_0==STAR) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // Haxe.g:302:29: ( STAR ^| SLASH ^| PERCENT ^) unarExpr
            	    {
            	    // Haxe.g:302:29: ( STAR ^| SLASH ^| PERCENT ^)
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
            	            // Haxe.g:303:23: STAR ^
            	            {
            	            STAR213=(Token)match(input,STAR,FOLLOW_STAR_in_multExpr3595); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            STAR213_tree = 
            	            new BinaryExpressionNode(STAR213) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(STAR213_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // Haxe.g:304:23: SLASH ^
            	            {
            	            SLASH214=(Token)match(input,SLASH,FOLLOW_SLASH_in_multExpr3624); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            SLASH214_tree = 
            	            new BinaryExpressionNode(SLASH214) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(SLASH214_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // Haxe.g:305:23: PERCENT ^
            	            {
            	            PERCENT215=(Token)match(input,PERCENT,FOLLOW_PERCENT_in_multExpr3653); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            PERCENT215_tree = 
            	            new BinaryExpressionNode(PERCENT215) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(PERCENT215_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_unarExpr_in_multExpr3660);
            	    unarExpr216=unarExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, unarExpr216.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 45, multExpr_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "multExpr"


    public static class unarExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "unarExpr"
    // Haxe.g:308:1: unarExpr : ( ( SUB ^| SUBSUB ^| PLUSPLUS ^| BANG ^| TILDE ^) prefixExpr | prefixExpr ( PLUSPLUS ^| SUBSUB ^)? );
    public final HaxeParser.unarExpr_return unarExpr() throws RecognitionException {
        HaxeParser.unarExpr_return retval = new HaxeParser.unarExpr_return();
        retval.start = input.LT(1);

        int unarExpr_StartIndex = input.index();

        Object root_0 = null;

        Token SUB217=null;
        Token SUBSUB218=null;
        Token PLUSPLUS219=null;
        Token BANG220=null;
        Token TILDE221=null;
        Token PLUSPLUS224=null;
        Token SUBSUB225=null;
        HaxeParser.prefixExpr_return prefixExpr222 =null;

        HaxeParser.prefixExpr_return prefixExpr223 =null;


        Object SUB217_tree=null;
        Object SUBSUB218_tree=null;
        Object PLUSPLUS219_tree=null;
        Object BANG220_tree=null;
        Object TILDE221_tree=null;
        Object PLUSPLUS224_tree=null;
        Object SUBSUB225_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 46) ) { return retval; }

            // Haxe.g:308:17: ( ( SUB ^| SUBSUB ^| PLUSPLUS ^| BANG ^| TILDE ^) prefixExpr | prefixExpr ( PLUSPLUS ^| SUBSUB ^)? )
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==BANG||LA62_0==PLUSPLUS||LA62_0==SUB||LA62_0==SUBSUB||LA62_0==TILDE) ) {
                alt62=1;
            }
            else if ( (LA62_0==CAST||LA62_0==CHARLITERAL||LA62_0==FALSE||LA62_0==FLOATNUM||LA62_0==FUNCTION||LA62_0==IDENTIFIER||LA62_0==INTLITERAL||(LA62_0 >= LBRACE && LA62_0 <= LBRACKET)||(LA62_0 >= LONGLITERAL && LA62_0 <= LPAREN)||(LA62_0 >= NEW && LA62_0 <= NULL)||LA62_0==STRINGLITERAL||LA62_0==THIS||LA62_0==TRUE) ) {
                alt62=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;

            }
            switch (alt62) {
                case 1 :
                    // Haxe.g:308:19: ( SUB ^| SUBSUB ^| PLUSPLUS ^| BANG ^| TILDE ^) prefixExpr
                    {
                    root_0 = (Object)adaptor.nil();


                    // Haxe.g:308:19: ( SUB ^| SUBSUB ^| PLUSPLUS ^| BANG ^| TILDE ^)
                    int alt60=5;
                    switch ( input.LA(1) ) {
                    case SUB:
                        {
                        alt60=1;
                        }
                        break;
                    case SUBSUB:
                        {
                        alt60=2;
                        }
                        break;
                    case PLUSPLUS:
                        {
                        alt60=3;
                        }
                        break;
                    case BANG:
                        {
                        alt60=4;
                        }
                        break;
                    case TILDE:
                        {
                        alt60=5;
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
                            // Haxe.g:309:13: SUB ^
                            {
                            SUB217=(Token)match(input,SUB,FOLLOW_SUB_in_unarExpr3708); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            SUB217_tree = 
                            new UnarExpressionNode(SUB217) 
                            ;
                            root_0 = (Object)adaptor.becomeRoot(SUB217_tree, root_0);
                            }

                            }
                            break;
                        case 2 :
                            // Haxe.g:310:13: SUBSUB ^
                            {
                            SUBSUB218=(Token)match(input,SUBSUB,FOLLOW_SUBSUB_in_unarExpr3727); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            SUBSUB218_tree = 
                            new UnarExpressionNode(SUBSUB218) 
                            ;
                            root_0 = (Object)adaptor.becomeRoot(SUBSUB218_tree, root_0);
                            }

                            }
                            break;
                        case 3 :
                            // Haxe.g:311:13: PLUSPLUS ^
                            {
                            PLUSPLUS219=(Token)match(input,PLUSPLUS,FOLLOW_PLUSPLUS_in_unarExpr3746); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            PLUSPLUS219_tree = 
                            new UnarExpressionNode(PLUSPLUS219) 
                            ;
                            root_0 = (Object)adaptor.becomeRoot(PLUSPLUS219_tree, root_0);
                            }

                            }
                            break;
                        case 4 :
                            // Haxe.g:312:13: BANG ^
                            {
                            BANG220=(Token)match(input,BANG,FOLLOW_BANG_in_unarExpr3765); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            BANG220_tree = 
                            new UnarExpressionNode(BANG220) 
                            ;
                            root_0 = (Object)adaptor.becomeRoot(BANG220_tree, root_0);
                            }

                            }
                            break;
                        case 5 :
                            // Haxe.g:313:13: TILDE ^
                            {
                            TILDE221=(Token)match(input,TILDE,FOLLOW_TILDE_in_unarExpr3784); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            TILDE221_tree = 
                            new UnarExpressionNode(TILDE221) 
                            ;
                            root_0 = (Object)adaptor.becomeRoot(TILDE221_tree, root_0);
                            }

                            }
                            break;

                    }


                    pushFollow(FOLLOW_prefixExpr_in_unarExpr3791);
                    prefixExpr222=prefixExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, prefixExpr222.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:314:19: prefixExpr ( PLUSPLUS ^| SUBSUB ^)?
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_prefixExpr_in_unarExpr3811);
                    prefixExpr223=prefixExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, prefixExpr223.getTree());

                    // Haxe.g:314:30: ( PLUSPLUS ^| SUBSUB ^)?
                    int alt61=3;
                    int LA61_0 = input.LA(1);

                    if ( (LA61_0==PLUSPLUS) ) {
                        alt61=1;
                    }
                    else if ( (LA61_0==SUBSUB) ) {
                        alt61=2;
                    }
                    switch (alt61) {
                        case 1 :
                            // Haxe.g:314:31: PLUSPLUS ^
                            {
                            PLUSPLUS224=(Token)match(input,PLUSPLUS,FOLLOW_PLUSPLUS_in_unarExpr3814); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            PLUSPLUS224_tree = 
                            new UnarExpressionNode(PLUSPLUS224) 
                            ;
                            root_0 = (Object)adaptor.becomeRoot(PLUSPLUS224_tree, root_0);
                            }

                            }
                            break;
                        case 2 :
                            // Haxe.g:314:61: SUBSUB ^
                            {
                            SUBSUB225=(Token)match(input,SUBSUB,FOLLOW_SUBSUB_in_unarExpr3820); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            SUBSUB225_tree = 
                            new UnarExpressionNode(SUBSUB225) 
                            ;
                            root_0 = (Object)adaptor.becomeRoot(SUBSUB225_tree, root_0);
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
            if ( state.backtracking>0 ) { memoize(input, 46, unarExpr_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "unarExpr"


    public static class prefixExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "prefixExpr"
    // Haxe.g:317:1: prefixExpr : ( NEW ^ type LPAREN ! ( exprList )? RPAREN !| CAST ^ LPAREN ! expr ( COMMA ! funcType )? RPAREN !| methodCallOrSlice );
    public final HaxeParser.prefixExpr_return prefixExpr() throws RecognitionException {
        HaxeParser.prefixExpr_return retval = new HaxeParser.prefixExpr_return();
        retval.start = input.LT(1);

        int prefixExpr_StartIndex = input.index();

        Object root_0 = null;

        Token NEW226=null;
        Token LPAREN228=null;
        Token RPAREN230=null;
        Token CAST231=null;
        Token LPAREN232=null;
        Token COMMA234=null;
        Token RPAREN236=null;
        HaxeParser.type_return type227 =null;

        HaxeParser.exprList_return exprList229 =null;

        HaxeParser.expr_return expr233 =null;

        HaxeParser.funcType_return funcType235 =null;

        HaxeParser.methodCallOrSlice_return methodCallOrSlice237 =null;


        Object NEW226_tree=null;
        Object LPAREN228_tree=null;
        Object RPAREN230_tree=null;
        Object CAST231_tree=null;
        Object LPAREN232_tree=null;
        Object COMMA234_tree=null;
        Object RPAREN236_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 47) ) { return retval; }

            // Haxe.g:317:17: ( NEW ^ type LPAREN ! ( exprList )? RPAREN !| CAST ^ LPAREN ! expr ( COMMA ! funcType )? RPAREN !| methodCallOrSlice )
            int alt65=3;
            switch ( input.LA(1) ) {
            case NEW:
                {
                alt65=1;
                }
                break;
            case CAST:
                {
                alt65=2;
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
                alt65=3;
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
                    // Haxe.g:317:19: NEW ^ type LPAREN ! ( exprList )? RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    NEW226=(Token)match(input,NEW,FOLLOW_NEW_in_prefixExpr3862); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NEW226_tree = 
                    (Object)adaptor.create(NEW226)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(NEW226_tree, root_0);
                    }

                    pushFollow(FOLLOW_type_in_prefixExpr3865);
                    type227=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, type227.getTree());

                    LPAREN228=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_prefixExpr3867); if (state.failed) return retval;

                    // Haxe.g:317:37: ( exprList )?
                    int alt63=2;
                    int LA63_0 = input.LA(1);

                    if ( (LA63_0==BANG||LA63_0==CAST||LA63_0==CHARLITERAL||LA63_0==FALSE||LA63_0==FLOATNUM||LA63_0==FUNCTION||LA63_0==IDENTIFIER||LA63_0==INTLITERAL||(LA63_0 >= LBRACE && LA63_0 <= LBRACKET)||(LA63_0 >= LONGLITERAL && LA63_0 <= LPAREN)||(LA63_0 >= NEW && LA63_0 <= NULL)||LA63_0==PLUSPLUS||(LA63_0 >= STRINGLITERAL && LA63_0 <= SUB)||LA63_0==SUBSUB||LA63_0==THIS||LA63_0==TILDE||LA63_0==TRUE||LA63_0==UNTYPED) ) {
                        alt63=1;
                    }
                    switch (alt63) {
                        case 1 :
                            // Haxe.g:317:37: exprList
                            {
                            pushFollow(FOLLOW_exprList_in_prefixExpr3870);
                            exprList229=exprList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, exprList229.getTree());

                            }
                            break;

                    }


                    RPAREN230=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_prefixExpr3873); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // Haxe.g:318:19: CAST ^ LPAREN ! expr ( COMMA ! funcType )? RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    CAST231=(Token)match(input,CAST,FOLLOW_CAST_in_prefixExpr3894); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CAST231_tree = 
                    (Object)adaptor.create(CAST231)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(CAST231_tree, root_0);
                    }

                    LPAREN232=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_prefixExpr3897); if (state.failed) return retval;

                    pushFollow(FOLLOW_expr_in_prefixExpr3900);
                    expr233=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr233.getTree());

                    // Haxe.g:318:38: ( COMMA ! funcType )?
                    int alt64=2;
                    int LA64_0 = input.LA(1);

                    if ( (LA64_0==COMMA) ) {
                        alt64=1;
                    }
                    switch (alt64) {
                        case 1 :
                            // Haxe.g:318:39: COMMA ! funcType
                            {
                            COMMA234=(Token)match(input,COMMA,FOLLOW_COMMA_in_prefixExpr3903); if (state.failed) return retval;

                            pushFollow(FOLLOW_funcType_in_prefixExpr3906);
                            funcType235=funcType();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, funcType235.getTree());

                            }
                            break;

                    }


                    RPAREN236=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_prefixExpr3910); if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // Haxe.g:319:19: methodCallOrSlice
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_methodCallOrSlice_in_prefixExpr3931);
                    methodCallOrSlice237=methodCallOrSlice();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, methodCallOrSlice237.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 47, prefixExpr_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "prefixExpr"


    public static class methodCallOrSlice_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "methodCallOrSlice"
    // Haxe.g:322:1: methodCallOrSlice : ( value ( ( LPAREN ( exprList )? RPAREN ( pureCallOrSlice )? -> ^( SUFFIX_EXPR[\"MethodCall\", $LPAREN, $RPAREN] value ( exprList )? ( pureCallOrSlice )? ) ) | ( LBRACKET expr RBRACKET ( pureCallOrSlice )? -> ^( SUFFIX_EXPR[\"Slice\", $LBRACKET, $RBRACKET] value expr ( pureCallOrSlice )? ) ) | ( DOT methodCallOrSlice -> ^( value methodCallOrSlice ) ) ) | value );
    public final HaxeParser.methodCallOrSlice_return methodCallOrSlice() throws RecognitionException {
        HaxeParser.methodCallOrSlice_return retval = new HaxeParser.methodCallOrSlice_return();
        retval.start = input.LT(1);

        int methodCallOrSlice_StartIndex = input.index();

        Object root_0 = null;

        Token LPAREN239=null;
        Token RPAREN241=null;
        Token LBRACKET243=null;
        Token RBRACKET245=null;
        Token DOT247=null;
        HaxeParser.value_return value238 =null;

        HaxeParser.exprList_return exprList240 =null;

        HaxeParser.pureCallOrSlice_return pureCallOrSlice242 =null;

        HaxeParser.expr_return expr244 =null;

        HaxeParser.pureCallOrSlice_return pureCallOrSlice246 =null;

        HaxeParser.methodCallOrSlice_return methodCallOrSlice248 =null;

        HaxeParser.value_return value249 =null;


        Object LPAREN239_tree=null;
        Object RPAREN241_tree=null;
        Object LBRACKET243_tree=null;
        Object RBRACKET245_tree=null;
        Object DOT247_tree=null;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 48) ) { return retval; }

            // Haxe.g:323:17: ( value ( ( LPAREN ( exprList )? RPAREN ( pureCallOrSlice )? -> ^( SUFFIX_EXPR[\"MethodCall\", $LPAREN, $RPAREN] value ( exprList )? ( pureCallOrSlice )? ) ) | ( LBRACKET expr RBRACKET ( pureCallOrSlice )? -> ^( SUFFIX_EXPR[\"Slice\", $LBRACKET, $RBRACKET] value expr ( pureCallOrSlice )? ) ) | ( DOT methodCallOrSlice -> ^( value methodCallOrSlice ) ) ) | value )
            int alt70=2;
            switch ( input.LA(1) ) {
            case LBRACE:
                {
                int LA70_1 = input.LA(2);

                if ( (synpred120_Haxe()) ) {
                    alt70=1;
                }
                else if ( (true) ) {
                    alt70=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 70, 1, input);

                    throw nvae;

                }
                }
                break;
            case FUNCTION:
                {
                int LA70_2 = input.LA(2);

                if ( (synpred120_Haxe()) ) {
                    alt70=1;
                }
                else if ( (true) ) {
                    alt70=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 70, 2, input);

                    throw nvae;

                }
                }
                break;
            case LBRACKET:
                {
                int LA70_3 = input.LA(2);

                if ( (synpred120_Haxe()) ) {
                    alt70=1;
                }
                else if ( (true) ) {
                    alt70=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 70, 3, input);

                    throw nvae;

                }
                }
                break;
            case LONGLITERAL:
                {
                int LA70_4 = input.LA(2);

                if ( (synpred120_Haxe()) ) {
                    alt70=1;
                }
                else if ( (true) ) {
                    alt70=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 70, 4, input);

                    throw nvae;

                }
                }
                break;
            case NULL:
                {
                int LA70_5 = input.LA(2);

                if ( (synpred120_Haxe()) ) {
                    alt70=1;
                }
                else if ( (true) ) {
                    alt70=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 70, 5, input);

                    throw nvae;

                }
                }
                break;
            case INTLITERAL:
                {
                int LA70_6 = input.LA(2);

                if ( (synpred120_Haxe()) ) {
                    alt70=1;
                }
                else if ( (true) ) {
                    alt70=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 70, 6, input);

                    throw nvae;

                }
                }
                break;
            case STRINGLITERAL:
                {
                int LA70_7 = input.LA(2);

                if ( (synpred120_Haxe()) ) {
                    alt70=1;
                }
                else if ( (true) ) {
                    alt70=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 70, 7, input);

                    throw nvae;

                }
                }
                break;
            case CHARLITERAL:
                {
                int LA70_8 = input.LA(2);

                if ( (synpred120_Haxe()) ) {
                    alt70=1;
                }
                else if ( (true) ) {
                    alt70=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 70, 8, input);

                    throw nvae;

                }
                }
                break;
            case FLOATNUM:
                {
                int LA70_9 = input.LA(2);

                if ( (synpred120_Haxe()) ) {
                    alt70=1;
                }
                else if ( (true) ) {
                    alt70=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 70, 9, input);

                    throw nvae;

                }
                }
                break;
            case TRUE:
                {
                int LA70_10 = input.LA(2);

                if ( (synpred120_Haxe()) ) {
                    alt70=1;
                }
                else if ( (true) ) {
                    alt70=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 70, 10, input);

                    throw nvae;

                }
                }
                break;
            case FALSE:
                {
                int LA70_11 = input.LA(2);

                if ( (synpred120_Haxe()) ) {
                    alt70=1;
                }
                else if ( (true) ) {
                    alt70=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 70, 11, input);

                    throw nvae;

                }
                }
                break;
            case LPAREN:
                {
                int LA70_12 = input.LA(2);

                if ( (synpred120_Haxe()) ) {
                    alt70=1;
                }
                else if ( (true) ) {
                    alt70=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 70, 12, input);

                    throw nvae;

                }
                }
                break;
            case IDENTIFIER:
                {
                int LA70_13 = input.LA(2);

                if ( (synpred120_Haxe()) ) {
                    alt70=1;
                }
                else if ( (true) ) {
                    alt70=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 70, 13, input);

                    throw nvae;

                }
                }
                break;
            case THIS:
                {
                int LA70_14 = input.LA(2);

                if ( (synpred120_Haxe()) ) {
                    alt70=1;
                }
                else if ( (true) ) {
                    alt70=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 70, 14, input);

                    throw nvae;

                }
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
                    // Haxe.g:323:19: value ( ( LPAREN ( exprList )? RPAREN ( pureCallOrSlice )? -> ^( SUFFIX_EXPR[\"MethodCall\", $LPAREN, $RPAREN] value ( exprList )? ( pureCallOrSlice )? ) ) | ( LBRACKET expr RBRACKET ( pureCallOrSlice )? -> ^( SUFFIX_EXPR[\"Slice\", $LBRACKET, $RBRACKET] value expr ( pureCallOrSlice )? ) ) | ( DOT methodCallOrSlice -> ^( value methodCallOrSlice ) ) )
                    {
                    pushFollow(FOLLOW_value_in_methodCallOrSlice3985);
                    value238=value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_value.add(value238.getTree());

                    // Haxe.g:323:25: ( ( LPAREN ( exprList )? RPAREN ( pureCallOrSlice )? -> ^( SUFFIX_EXPR[\"MethodCall\", $LPAREN, $RPAREN] value ( exprList )? ( pureCallOrSlice )? ) ) | ( LBRACKET expr RBRACKET ( pureCallOrSlice )? -> ^( SUFFIX_EXPR[\"Slice\", $LBRACKET, $RBRACKET] value expr ( pureCallOrSlice )? ) ) | ( DOT methodCallOrSlice -> ^( value methodCallOrSlice ) ) )
                    int alt69=3;
                    switch ( input.LA(1) ) {
                    case LPAREN:
                        {
                        alt69=1;
                        }
                        break;
                    case LBRACKET:
                        {
                        alt69=2;
                        }
                        break;
                    case DOT:
                        {
                        alt69=3;
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
                            // Haxe.g:324:15: ( LPAREN ( exprList )? RPAREN ( pureCallOrSlice )? -> ^( SUFFIX_EXPR[\"MethodCall\", $LPAREN, $RPAREN] value ( exprList )? ( pureCallOrSlice )? ) )
                            {
                            // Haxe.g:324:15: ( LPAREN ( exprList )? RPAREN ( pureCallOrSlice )? -> ^( SUFFIX_EXPR[\"MethodCall\", $LPAREN, $RPAREN] value ( exprList )? ( pureCallOrSlice )? ) )
                            // Haxe.g:324:16: LPAREN ( exprList )? RPAREN ( pureCallOrSlice )?
                            {
                            LPAREN239=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_methodCallOrSlice4004); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN239);


                            // Haxe.g:324:23: ( exprList )?
                            int alt66=2;
                            int LA66_0 = input.LA(1);

                            if ( (LA66_0==BANG||LA66_0==CAST||LA66_0==CHARLITERAL||LA66_0==FALSE||LA66_0==FLOATNUM||LA66_0==FUNCTION||LA66_0==IDENTIFIER||LA66_0==INTLITERAL||(LA66_0 >= LBRACE && LA66_0 <= LBRACKET)||(LA66_0 >= LONGLITERAL && LA66_0 <= LPAREN)||(LA66_0 >= NEW && LA66_0 <= NULL)||LA66_0==PLUSPLUS||(LA66_0 >= STRINGLITERAL && LA66_0 <= SUB)||LA66_0==SUBSUB||LA66_0==THIS||LA66_0==TILDE||LA66_0==TRUE||LA66_0==UNTYPED) ) {
                                alt66=1;
                            }
                            switch (alt66) {
                                case 1 :
                                    // Haxe.g:324:23: exprList
                                    {
                                    pushFollow(FOLLOW_exprList_in_methodCallOrSlice4006);
                                    exprList240=exprList();

                                    state._fsp--;
                                    if (state.failed) return retval;
                                    if ( state.backtracking==0 ) stream_exprList.add(exprList240.getTree());

                                    }
                                    break;

                            }


                            RPAREN241=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_methodCallOrSlice4009); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN241);


                            // Haxe.g:324:40: ( pureCallOrSlice )?
                            int alt67=2;
                            int LA67_0 = input.LA(1);

                            if ( (LA67_0==DOT||LA67_0==LBRACKET||LA67_0==LPAREN) ) {
                                alt67=1;
                            }
                            switch (alt67) {
                                case 1 :
                                    // Haxe.g:324:40: pureCallOrSlice
                                    {
                                    pushFollow(FOLLOW_pureCallOrSlice_in_methodCallOrSlice4011);
                                    pureCallOrSlice242=pureCallOrSlice();

                                    state._fsp--;
                                    if (state.failed) return retval;
                                    if ( state.backtracking==0 ) stream_pureCallOrSlice.add(pureCallOrSlice242.getTree());

                                    }
                                    break;

                            }


                            // AST REWRITE
                            // elements: value, exprList, pureCallOrSlice
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {

                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (Object)adaptor.nil();
                            // 325:13: -> ^( SUFFIX_EXPR[\"MethodCall\", $LPAREN, $RPAREN] value ( exprList )? ( pureCallOrSlice )? )
                            {
                                // Haxe.g:325:16: ^( SUFFIX_EXPR[\"MethodCall\", $LPAREN, $RPAREN] value ( exprList )? ( pureCallOrSlice )? )
                                {
                                Object root_1 = (Object)adaptor.nil();
                                root_1 = (Object)adaptor.becomeRoot(
                                new HaxeTree(SUFFIX_EXPR, "MethodCall", LPAREN239, RPAREN241)
                                , root_1);

                                adaptor.addChild(root_1, stream_value.nextTree());

                                // Haxe.g:325:78: ( exprList )?
                                if ( stream_exprList.hasNext() ) {
                                    adaptor.addChild(root_1, stream_exprList.nextTree());

                                }
                                stream_exprList.reset();

                                // Haxe.g:325:88: ( pureCallOrSlice )?
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
                            // Haxe.g:326:15: ( LBRACKET expr RBRACKET ( pureCallOrSlice )? -> ^( SUFFIX_EXPR[\"Slice\", $LBRACKET, $RBRACKET] value expr ( pureCallOrSlice )? ) )
                            {
                            // Haxe.g:326:15: ( LBRACKET expr RBRACKET ( pureCallOrSlice )? -> ^( SUFFIX_EXPR[\"Slice\", $LBRACKET, $RBRACKET] value expr ( pureCallOrSlice )? ) )
                            // Haxe.g:326:16: LBRACKET expr RBRACKET ( pureCallOrSlice )?
                            {
                            LBRACKET243=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_methodCallOrSlice4060); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_LBRACKET.add(LBRACKET243);


                            pushFollow(FOLLOW_expr_in_methodCallOrSlice4062);
                            expr244=expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expr.add(expr244.getTree());

                            RBRACKET245=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_methodCallOrSlice4064); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_RBRACKET.add(RBRACKET245);


                            // Haxe.g:326:39: ( pureCallOrSlice )?
                            int alt68=2;
                            int LA68_0 = input.LA(1);

                            if ( (LA68_0==DOT||LA68_0==LBRACKET||LA68_0==LPAREN) ) {
                                alt68=1;
                            }
                            switch (alt68) {
                                case 1 :
                                    // Haxe.g:326:39: pureCallOrSlice
                                    {
                                    pushFollow(FOLLOW_pureCallOrSlice_in_methodCallOrSlice4066);
                                    pureCallOrSlice246=pureCallOrSlice();

                                    state._fsp--;
                                    if (state.failed) return retval;
                                    if ( state.backtracking==0 ) stream_pureCallOrSlice.add(pureCallOrSlice246.getTree());

                                    }
                                    break;

                            }


                            // AST REWRITE
                            // elements: pureCallOrSlice, value, expr
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {

                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (Object)adaptor.nil();
                            // 327:13: -> ^( SUFFIX_EXPR[\"Slice\", $LBRACKET, $RBRACKET] value expr ( pureCallOrSlice )? )
                            {
                                // Haxe.g:327:16: ^( SUFFIX_EXPR[\"Slice\", $LBRACKET, $RBRACKET] value expr ( pureCallOrSlice )? )
                                {
                                Object root_1 = (Object)adaptor.nil();
                                root_1 = (Object)adaptor.becomeRoot(
                                new HaxeTree(SUFFIX_EXPR, "Slice", LBRACKET243, RBRACKET245)
                                , root_1);

                                adaptor.addChild(root_1, stream_value.nextTree());

                                adaptor.addChild(root_1, stream_expr.nextTree());

                                // Haxe.g:327:82: ( pureCallOrSlice )?
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
                            // Haxe.g:328:15: ( DOT methodCallOrSlice -> ^( value methodCallOrSlice ) )
                            {
                            // Haxe.g:328:15: ( DOT methodCallOrSlice -> ^( value methodCallOrSlice ) )
                            // Haxe.g:328:16: DOT methodCallOrSlice
                            {
                            DOT247=(Token)match(input,DOT,FOLLOW_DOT_in_methodCallOrSlice4115); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DOT.add(DOT247);


                            pushFollow(FOLLOW_methodCallOrSlice_in_methodCallOrSlice4117);
                            methodCallOrSlice248=methodCallOrSlice();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_methodCallOrSlice.add(methodCallOrSlice248.getTree());

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
                            // 329:13: -> ^( value methodCallOrSlice )
                            {
                                // Haxe.g:329:16: ^( value methodCallOrSlice )
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
                    // Haxe.g:330:19: value
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_value_in_methodCallOrSlice4159);
                    value249=value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, value249.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 48, methodCallOrSlice_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "methodCallOrSlice"


    public static class pureCallOrSlice_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "pureCallOrSlice"
    // Haxe.g:333:1: pureCallOrSlice : ( LPAREN ( exprList )? RPAREN ( pureCallOrSlice )? -> ^( SUFFIX_EXPR[\"MethodCall\", $LPAREN, $RPAREN] ( exprList )? ( pureCallOrSlice )? ) | LBRACKET expr RBRACKET ( pureCallOrSlice )? -> ^( SUFFIX_EXPR[\"Slice\", $LBRACKET, $RBRACKET] expr ( pureCallOrSlice )? ) | DOT ! methodCallOrSlice );
    public final HaxeParser.pureCallOrSlice_return pureCallOrSlice() throws RecognitionException {
        HaxeParser.pureCallOrSlice_return retval = new HaxeParser.pureCallOrSlice_return();
        retval.start = input.LT(1);

        int pureCallOrSlice_StartIndex = input.index();

        Object root_0 = null;

        Token LPAREN250=null;
        Token RPAREN252=null;
        Token LBRACKET254=null;
        Token RBRACKET256=null;
        Token DOT258=null;
        HaxeParser.exprList_return exprList251 =null;

        HaxeParser.pureCallOrSlice_return pureCallOrSlice253 =null;

        HaxeParser.expr_return expr255 =null;

        HaxeParser.pureCallOrSlice_return pureCallOrSlice257 =null;

        HaxeParser.methodCallOrSlice_return methodCallOrSlice259 =null;


        Object LPAREN250_tree=null;
        Object RPAREN252_tree=null;
        Object LBRACKET254_tree=null;
        Object RBRACKET256_tree=null;
        Object DOT258_tree=null;
        RewriteRuleTokenStream stream_LBRACKET=new RewriteRuleTokenStream(adaptor,"token LBRACKET");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_RBRACKET=new RewriteRuleTokenStream(adaptor,"token RBRACKET");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_pureCallOrSlice=new RewriteRuleSubtreeStream(adaptor,"rule pureCallOrSlice");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_exprList=new RewriteRuleSubtreeStream(adaptor,"rule exprList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 49) ) { return retval; }

            // Haxe.g:333:17: ( LPAREN ( exprList )? RPAREN ( pureCallOrSlice )? -> ^( SUFFIX_EXPR[\"MethodCall\", $LPAREN, $RPAREN] ( exprList )? ( pureCallOrSlice )? ) | LBRACKET expr RBRACKET ( pureCallOrSlice )? -> ^( SUFFIX_EXPR[\"Slice\", $LBRACKET, $RBRACKET] expr ( pureCallOrSlice )? ) | DOT ! methodCallOrSlice )
            int alt74=3;
            switch ( input.LA(1) ) {
            case LPAREN:
                {
                alt74=1;
                }
                break;
            case LBRACKET:
                {
                alt74=2;
                }
                break;
            case DOT:
                {
                alt74=3;
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
                    // Haxe.g:333:19: LPAREN ( exprList )? RPAREN ( pureCallOrSlice )?
                    {
                    LPAREN250=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_pureCallOrSlice4184); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN250);


                    // Haxe.g:333:26: ( exprList )?
                    int alt71=2;
                    int LA71_0 = input.LA(1);

                    if ( (LA71_0==BANG||LA71_0==CAST||LA71_0==CHARLITERAL||LA71_0==FALSE||LA71_0==FLOATNUM||LA71_0==FUNCTION||LA71_0==IDENTIFIER||LA71_0==INTLITERAL||(LA71_0 >= LBRACE && LA71_0 <= LBRACKET)||(LA71_0 >= LONGLITERAL && LA71_0 <= LPAREN)||(LA71_0 >= NEW && LA71_0 <= NULL)||LA71_0==PLUSPLUS||(LA71_0 >= STRINGLITERAL && LA71_0 <= SUB)||LA71_0==SUBSUB||LA71_0==THIS||LA71_0==TILDE||LA71_0==TRUE||LA71_0==UNTYPED) ) {
                        alt71=1;
                    }
                    switch (alt71) {
                        case 1 :
                            // Haxe.g:333:26: exprList
                            {
                            pushFollow(FOLLOW_exprList_in_pureCallOrSlice4186);
                            exprList251=exprList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_exprList.add(exprList251.getTree());

                            }
                            break;

                    }


                    RPAREN252=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_pureCallOrSlice4189); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN252);


                    // Haxe.g:333:43: ( pureCallOrSlice )?
                    int alt72=2;
                    int LA72_0 = input.LA(1);

                    if ( (LA72_0==DOT||LA72_0==LBRACKET||LA72_0==LPAREN) ) {
                        alt72=1;
                    }
                    switch (alt72) {
                        case 1 :
                            // Haxe.g:333:43: pureCallOrSlice
                            {
                            pushFollow(FOLLOW_pureCallOrSlice_in_pureCallOrSlice4191);
                            pureCallOrSlice253=pureCallOrSlice();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_pureCallOrSlice.add(pureCallOrSlice253.getTree());

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
                    // 334:17: -> ^( SUFFIX_EXPR[\"MethodCall\", $LPAREN, $RPAREN] ( exprList )? ( pureCallOrSlice )? )
                    {
                        // Haxe.g:334:20: ^( SUFFIX_EXPR[\"MethodCall\", $LPAREN, $RPAREN] ( exprList )? ( pureCallOrSlice )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        new HaxeTree(SUFFIX_EXPR, "MethodCall", LPAREN250, RPAREN252)
                        , root_1);

                        // Haxe.g:334:76: ( exprList )?
                        if ( stream_exprList.hasNext() ) {
                            adaptor.addChild(root_1, stream_exprList.nextTree());

                        }
                        stream_exprList.reset();

                        // Haxe.g:334:86: ( pureCallOrSlice )?
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
                    // Haxe.g:335:18: LBRACKET expr RBRACKET ( pureCallOrSlice )?
                    {
                    LBRACKET254=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_pureCallOrSlice4244); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LBRACKET.add(LBRACKET254);


                    pushFollow(FOLLOW_expr_in_pureCallOrSlice4246);
                    expr255=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr255.getTree());

                    RBRACKET256=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_pureCallOrSlice4248); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RBRACKET.add(RBRACKET256);


                    // Haxe.g:335:41: ( pureCallOrSlice )?
                    int alt73=2;
                    int LA73_0 = input.LA(1);

                    if ( (LA73_0==DOT||LA73_0==LBRACKET||LA73_0==LPAREN) ) {
                        alt73=1;
                    }
                    switch (alt73) {
                        case 1 :
                            // Haxe.g:335:41: pureCallOrSlice
                            {
                            pushFollow(FOLLOW_pureCallOrSlice_in_pureCallOrSlice4250);
                            pureCallOrSlice257=pureCallOrSlice();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_pureCallOrSlice.add(pureCallOrSlice257.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: pureCallOrSlice, expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 335:58: -> ^( SUFFIX_EXPR[\"Slice\", $LBRACKET, $RBRACKET] expr ( pureCallOrSlice )? )
                    {
                        // Haxe.g:335:61: ^( SUFFIX_EXPR[\"Slice\", $LBRACKET, $RBRACKET] expr ( pureCallOrSlice )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        new HaxeTree(SUFFIX_EXPR, "Slice", LBRACKET254, RBRACKET256)
                        , root_1);

                        adaptor.addChild(root_1, stream_expr.nextTree());

                        // Haxe.g:336:75: ( pureCallOrSlice )?
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
                    // Haxe.g:337:18: DOT ! methodCallOrSlice
                    {
                    root_0 = (Object)adaptor.nil();


                    DOT258=(Token)match(input,DOT,FOLLOW_DOT_in_pureCallOrSlice4302); if (state.failed) return retval;

                    pushFollow(FOLLOW_methodCallOrSlice_in_pureCallOrSlice4305);
                    methodCallOrSlice259=methodCallOrSlice();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, methodCallOrSlice259.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 49, pureCallOrSlice_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "pureCallOrSlice"


    public static class value_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "value"
    // Haxe.g:340:1: value : ( objLit | funcLit | arrayLit | elementarySymbol | LPAREN ! ( expr | statement ) RPAREN !| id typeParamOpt );
    public final HaxeParser.value_return value() throws RecognitionException {
        HaxeParser.value_return retval = new HaxeParser.value_return();
        retval.start = input.LT(1);

        int value_StartIndex = input.index();

        Object root_0 = null;

        Token LPAREN264=null;
        Token RPAREN267=null;
        HaxeParser.objLit_return objLit260 =null;

        HaxeParser.funcLit_return funcLit261 =null;

        HaxeParser.arrayLit_return arrayLit262 =null;

        HaxeParser.elementarySymbol_return elementarySymbol263 =null;

        HaxeParser.expr_return expr265 =null;

        HaxeParser.statement_return statement266 =null;

        HaxeParser.id_return id268 =null;

        HaxeParser.typeParamOpt_return typeParamOpt269 =null;


        Object LPAREN264_tree=null;
        Object RPAREN267_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 50) ) { return retval; }

            // Haxe.g:342:5: ( objLit | funcLit | arrayLit | elementarySymbol | LPAREN ! ( expr | statement ) RPAREN !| id typeParamOpt )
            int alt76=6;
            switch ( input.LA(1) ) {
            case LBRACE:
                {
                alt76=1;
                }
                break;
            case FUNCTION:
                {
                alt76=2;
                }
                break;
            case LBRACKET:
                {
                alt76=3;
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
                alt76=4;
                }
                break;
            case LPAREN:
                {
                alt76=5;
                }
                break;
            case IDENTIFIER:
            case THIS:
                {
                alt76=6;
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
                    // Haxe.g:342:9: objLit
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_objLit_in_value4341);
                    objLit260=objLit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, objLit260.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:343:7: funcLit
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_funcLit_in_value4349);
                    funcLit261=funcLit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, funcLit261.getTree());

                    }
                    break;
                case 3 :
                    // Haxe.g:344:7: arrayLit
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_arrayLit_in_value4357);
                    arrayLit262=arrayLit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arrayLit262.getTree());

                    }
                    break;
                case 4 :
                    // Haxe.g:345:9: elementarySymbol
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_elementarySymbol_in_value4367);
                    elementarySymbol263=elementarySymbol();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, elementarySymbol263.getTree());

                    }
                    break;
                case 5 :
                    // Haxe.g:346:9: LPAREN ! ( expr | statement ) RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    LPAREN264=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_value4377); if (state.failed) return retval;

                    // Haxe.g:346:17: ( expr | statement )
                    int alt75=2;
                    switch ( input.LA(1) ) {
                    case UNTYPED:
                        {
                        int LA75_1 = input.LA(2);

                        if ( (synpred130_Haxe()) ) {
                            alt75=1;
                        }
                        else if ( (true) ) {
                            alt75=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 75, 1, input);

                            throw nvae;

                        }
                        }
                        break;
                    case SUB:
                        {
                        int LA75_2 = input.LA(2);

                        if ( (synpred130_Haxe()) ) {
                            alt75=1;
                        }
                        else if ( (true) ) {
                            alt75=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 75, 2, input);

                            throw nvae;

                        }
                        }
                        break;
                    case SUBSUB:
                        {
                        int LA75_3 = input.LA(2);

                        if ( (synpred130_Haxe()) ) {
                            alt75=1;
                        }
                        else if ( (true) ) {
                            alt75=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 75, 3, input);

                            throw nvae;

                        }
                        }
                        break;
                    case PLUSPLUS:
                        {
                        int LA75_4 = input.LA(2);

                        if ( (synpred130_Haxe()) ) {
                            alt75=1;
                        }
                        else if ( (true) ) {
                            alt75=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 75, 4, input);

                            throw nvae;

                        }
                        }
                        break;
                    case BANG:
                        {
                        int LA75_5 = input.LA(2);

                        if ( (synpred130_Haxe()) ) {
                            alt75=1;
                        }
                        else if ( (true) ) {
                            alt75=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 75, 5, input);

                            throw nvae;

                        }
                        }
                        break;
                    case TILDE:
                        {
                        int LA75_6 = input.LA(2);

                        if ( (synpred130_Haxe()) ) {
                            alt75=1;
                        }
                        else if ( (true) ) {
                            alt75=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 75, 6, input);

                            throw nvae;

                        }
                        }
                        break;
                    case NEW:
                        {
                        int LA75_7 = input.LA(2);

                        if ( (synpred130_Haxe()) ) {
                            alt75=1;
                        }
                        else if ( (true) ) {
                            alt75=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 75, 7, input);

                            throw nvae;

                        }
                        }
                        break;
                    case CAST:
                        {
                        int LA75_8 = input.LA(2);

                        if ( (synpred130_Haxe()) ) {
                            alt75=1;
                        }
                        else if ( (true) ) {
                            alt75=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 75, 8, input);

                            throw nvae;

                        }
                        }
                        break;
                    case LBRACE:
                        {
                        int LA75_9 = input.LA(2);

                        if ( (synpred130_Haxe()) ) {
                            alt75=1;
                        }
                        else if ( (true) ) {
                            alt75=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 75, 9, input);

                            throw nvae;

                        }
                        }
                        break;
                    case FUNCTION:
                        {
                        int LA75_10 = input.LA(2);

                        if ( (synpred130_Haxe()) ) {
                            alt75=1;
                        }
                        else if ( (true) ) {
                            alt75=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 75, 10, input);

                            throw nvae;

                        }
                        }
                        break;
                    case LBRACKET:
                        {
                        int LA75_11 = input.LA(2);

                        if ( (synpred130_Haxe()) ) {
                            alt75=1;
                        }
                        else if ( (true) ) {
                            alt75=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 75, 11, input);

                            throw nvae;

                        }
                        }
                        break;
                    case LONGLITERAL:
                        {
                        int LA75_12 = input.LA(2);

                        if ( (synpred130_Haxe()) ) {
                            alt75=1;
                        }
                        else if ( (true) ) {
                            alt75=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 75, 12, input);

                            throw nvae;

                        }
                        }
                        break;
                    case NULL:
                        {
                        int LA75_13 = input.LA(2);

                        if ( (synpred130_Haxe()) ) {
                            alt75=1;
                        }
                        else if ( (true) ) {
                            alt75=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 75, 13, input);

                            throw nvae;

                        }
                        }
                        break;
                    case INTLITERAL:
                        {
                        int LA75_14 = input.LA(2);

                        if ( (synpred130_Haxe()) ) {
                            alt75=1;
                        }
                        else if ( (true) ) {
                            alt75=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 75, 14, input);

                            throw nvae;

                        }
                        }
                        break;
                    case STRINGLITERAL:
                        {
                        int LA75_15 = input.LA(2);

                        if ( (synpred130_Haxe()) ) {
                            alt75=1;
                        }
                        else if ( (true) ) {
                            alt75=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 75, 15, input);

                            throw nvae;

                        }
                        }
                        break;
                    case CHARLITERAL:
                        {
                        int LA75_16 = input.LA(2);

                        if ( (synpred130_Haxe()) ) {
                            alt75=1;
                        }
                        else if ( (true) ) {
                            alt75=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 75, 16, input);

                            throw nvae;

                        }
                        }
                        break;
                    case FLOATNUM:
                        {
                        int LA75_17 = input.LA(2);

                        if ( (synpred130_Haxe()) ) {
                            alt75=1;
                        }
                        else if ( (true) ) {
                            alt75=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 75, 17, input);

                            throw nvae;

                        }
                        }
                        break;
                    case TRUE:
                        {
                        int LA75_18 = input.LA(2);

                        if ( (synpred130_Haxe()) ) {
                            alt75=1;
                        }
                        else if ( (true) ) {
                            alt75=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 75, 18, input);

                            throw nvae;

                        }
                        }
                        break;
                    case FALSE:
                        {
                        int LA75_19 = input.LA(2);

                        if ( (synpred130_Haxe()) ) {
                            alt75=1;
                        }
                        else if ( (true) ) {
                            alt75=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 75, 19, input);

                            throw nvae;

                        }
                        }
                        break;
                    case LPAREN:
                        {
                        int LA75_20 = input.LA(2);

                        if ( (synpred130_Haxe()) ) {
                            alt75=1;
                        }
                        else if ( (true) ) {
                            alt75=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 75, 20, input);

                            throw nvae;

                        }
                        }
                        break;
                    case IDENTIFIER:
                        {
                        int LA75_21 = input.LA(2);

                        if ( (synpred130_Haxe()) ) {
                            alt75=1;
                        }
                        else if ( (true) ) {
                            alt75=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 75, 21, input);

                            throw nvae;

                        }
                        }
                        break;
                    case THIS:
                        {
                        int LA75_22 = input.LA(2);

                        if ( (synpred130_Haxe()) ) {
                            alt75=1;
                        }
                        else if ( (true) ) {
                            alt75=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 75, 22, input);

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
                        alt75=2;
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
                            // Haxe.g:346:18: expr
                            {
                            pushFollow(FOLLOW_expr_in_value4381);
                            expr265=expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr265.getTree());

                            }
                            break;
                        case 2 :
                            // Haxe.g:346:23: statement
                            {
                            pushFollow(FOLLOW_statement_in_value4383);
                            statement266=statement();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, statement266.getTree());

                            }
                            break;

                    }


                    RPAREN267=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_value4386); if (state.failed) return retval;

                    }
                    break;
                case 6 :
                    // Haxe.g:348:9: id typeParamOpt
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_id_in_value4402);
                    id268=id();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, id268.getTree());

                    pushFollow(FOLLOW_typeParamOpt_in_value4404);
                    typeParamOpt269=typeParamOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeParamOpt269.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 50, value_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "value"


    public static class topLevelDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "topLevelDecl"
    // Haxe.g:352:1: topLevelDecl : ( classDecl | interfaceDecl | enumDecl | typedefDecl );
    public final HaxeParser.topLevelDecl_return topLevelDecl() throws RecognitionException {
        HaxeParser.topLevelDecl_return retval = new HaxeParser.topLevelDecl_return();
        retval.start = input.LT(1);

        int topLevelDecl_StartIndex = input.index();

        Object root_0 = null;

        HaxeParser.classDecl_return classDecl270 =null;

        HaxeParser.interfaceDecl_return interfaceDecl271 =null;

        HaxeParser.enumDecl_return enumDecl272 =null;

        HaxeParser.typedefDecl_return typedefDecl273 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 51) ) { return retval; }

            // Haxe.g:352:17: ( classDecl | interfaceDecl | enumDecl | typedefDecl )
            int alt77=4;
            switch ( input.LA(1) ) {
            case EXTERN:
            case PRIVATE:
                {
                switch ( input.LA(2) ) {
                case CLASS:
                    {
                    alt77=1;
                    }
                    break;
                case INTERFACE:
                    {
                    alt77=2;
                    }
                    break;
                case ENUM:
                    {
                    alt77=3;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 77, 1, input);

                    throw nvae;

                }

                }
                break;
            case CLASS:
                {
                alt77=1;
                }
                break;
            case INTERFACE:
                {
                alt77=2;
                }
                break;
            case ENUM:
                {
                alt77=3;
                }
                break;
            case TYPEDEF:
                {
                alt77=4;
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
                    // Haxe.g:352:19: classDecl
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_classDecl_in_topLevelDecl4423);
                    classDecl270=classDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, classDecl270.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:353:19: interfaceDecl
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_interfaceDecl_in_topLevelDecl4443);
                    interfaceDecl271=interfaceDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceDecl271.getTree());

                    }
                    break;
                case 3 :
                    // Haxe.g:354:19: enumDecl
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_enumDecl_in_topLevelDecl4463);
                    enumDecl272=enumDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, enumDecl272.getTree());

                    }
                    break;
                case 4 :
                    // Haxe.g:355:19: typedefDecl
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_typedefDecl_in_topLevelDecl4483);
                    typedefDecl273=typedefDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typedefDecl273.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 51, topLevelDecl_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "topLevelDecl"


    public static class enumDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "enumDecl"
    // Haxe.g:358:1: enumDecl : ( topLevelAccess )? ENUM IDENTIFIER typeParamOpt enumBody -> ^( IDENTIFIER ( topLevelAccess )? ( typeParamOpt )? ( enumBody )? ) ;
    public final HaxeParser.enumDecl_return enumDecl() throws RecognitionException {
        HaxeParser.enumDecl_return retval = new HaxeParser.enumDecl_return();
        retval.start = input.LT(1);

        int enumDecl_StartIndex = input.index();

        Object root_0 = null;

        Token ENUM275=null;
        Token IDENTIFIER276=null;
        HaxeParser.topLevelAccess_return topLevelAccess274 =null;

        HaxeParser.typeParamOpt_return typeParamOpt277 =null;

        HaxeParser.enumBody_return enumBody278 =null;


        Object ENUM275_tree=null;
        Object IDENTIFIER276_tree=null;
        RewriteRuleTokenStream stream_ENUM=new RewriteRuleTokenStream(adaptor,"token ENUM");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleSubtreeStream stream_enumBody=new RewriteRuleSubtreeStream(adaptor,"rule enumBody");
        RewriteRuleSubtreeStream stream_typeParamOpt=new RewriteRuleSubtreeStream(adaptor,"rule typeParamOpt");
        RewriteRuleSubtreeStream stream_topLevelAccess=new RewriteRuleSubtreeStream(adaptor,"rule topLevelAccess");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 52) ) { return retval; }

            // Haxe.g:358:17: ( ( topLevelAccess )? ENUM IDENTIFIER typeParamOpt enumBody -> ^( IDENTIFIER ( topLevelAccess )? ( typeParamOpt )? ( enumBody )? ) )
            // Haxe.g:358:19: ( topLevelAccess )? ENUM IDENTIFIER typeParamOpt enumBody
            {
            // Haxe.g:358:19: ( topLevelAccess )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==EXTERN||LA78_0==PRIVATE) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // Haxe.g:358:19: topLevelAccess
                    {
                    pushFollow(FOLLOW_topLevelAccess_in_enumDecl4519);
                    topLevelAccess274=topLevelAccess();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_topLevelAccess.add(topLevelAccess274.getTree());

                    }
                    break;

            }


            ENUM275=(Token)match(input,ENUM,FOLLOW_ENUM_in_enumDecl4522); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ENUM.add(ENUM275);


            IDENTIFIER276=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_enumDecl4524); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER276);


            pushFollow(FOLLOW_typeParamOpt_in_enumDecl4526);
            typeParamOpt277=typeParamOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeParamOpt.add(typeParamOpt277.getTree());

            pushFollow(FOLLOW_enumBody_in_enumDecl4528);
            enumBody278=enumBody();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_enumBody.add(enumBody278.getTree());

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
            // 358:73: -> ^( IDENTIFIER ( topLevelAccess )? ( typeParamOpt )? ( enumBody )? )
            {
                // Haxe.g:358:76: ^( IDENTIFIER ( topLevelAccess )? ( typeParamOpt )? ( enumBody )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                new EnumNode(stream_IDENTIFIER.nextToken())
                , root_1);

                // Haxe.g:358:99: ( topLevelAccess )?
                if ( stream_topLevelAccess.hasNext() ) {
                    adaptor.addChild(root_1, stream_topLevelAccess.nextTree());

                }
                stream_topLevelAccess.reset();

                // Haxe.g:358:115: ( typeParamOpt )?
                if ( stream_typeParamOpt.hasNext() ) {
                    adaptor.addChild(root_1, stream_typeParamOpt.nextTree());

                }
                stream_typeParamOpt.reset();

                // Haxe.g:358:129: ( enumBody )?
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
            if ( state.backtracking>0 ) { memoize(input, 52, enumDecl_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "enumDecl"


    public static class enumBody_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "enumBody"
    // Haxe.g:361:1: enumBody : LBRACE ( enumValueDecl )* RBRACE -> ^( BLOCK_SCOPE[$LBRACE, $RBRACE] ( enumValueDecl )* ) ;
    public final HaxeParser.enumBody_return enumBody() throws RecognitionException {
        HaxeParser.enumBody_return retval = new HaxeParser.enumBody_return();
        retval.start = input.LT(1);

        int enumBody_StartIndex = input.index();

        Object root_0 = null;

        Token LBRACE279=null;
        Token RBRACE281=null;
        HaxeParser.enumValueDecl_return enumValueDecl280 =null;


        Object LBRACE279_tree=null;
        Object RBRACE281_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_enumValueDecl=new RewriteRuleSubtreeStream(adaptor,"rule enumValueDecl");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 53) ) { return retval; }

            // Haxe.g:361:17: ( LBRACE ( enumValueDecl )* RBRACE -> ^( BLOCK_SCOPE[$LBRACE, $RBRACE] ( enumValueDecl )* ) )
            // Haxe.g:361:19: LBRACE ( enumValueDecl )* RBRACE
            {
            LBRACE279=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_enumBody4578); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACE.add(LBRACE279);


            // Haxe.g:361:26: ( enumValueDecl )*
            loop79:
            do {
                int alt79=2;
                int LA79_0 = input.LA(1);

                if ( (LA79_0==IDENTIFIER) ) {
                    alt79=1;
                }


                switch (alt79) {
            	case 1 :
            	    // Haxe.g:361:27: enumValueDecl
            	    {
            	    pushFollow(FOLLOW_enumValueDecl_in_enumBody4581);
            	    enumValueDecl280=enumValueDecl();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_enumValueDecl.add(enumValueDecl280.getTree());

            	    }
            	    break;

            	default :
            	    break loop79;
                }
            } while (true);


            RBRACE281=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_enumBody4585); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACE.add(RBRACE281);


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
            // 361:50: -> ^( BLOCK_SCOPE[$LBRACE, $RBRACE] ( enumValueDecl )* )
            {
                // Haxe.g:361:53: ^( BLOCK_SCOPE[$LBRACE, $RBRACE] ( enumValueDecl )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                new BlockScopeNode(BLOCK_SCOPE, LBRACE279, RBRACE281)
                , root_1);

                // Haxe.g:361:101: ( enumValueDecl )*
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
            if ( state.backtracking>0 ) { memoize(input, 53, enumBody_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "enumBody"


    public static class enumValueDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "enumValueDecl"
    // Haxe.g:364:1: enumValueDecl : ( IDENTIFIER ^ LPAREN ! ( paramList )? RPAREN ! SEMI !| IDENTIFIER SEMI !);
    public final HaxeParser.enumValueDecl_return enumValueDecl() throws RecognitionException {
        HaxeParser.enumValueDecl_return retval = new HaxeParser.enumValueDecl_return();
        retval.start = input.LT(1);

        int enumValueDecl_StartIndex = input.index();

        Object root_0 = null;

        Token IDENTIFIER282=null;
        Token LPAREN283=null;
        Token RPAREN285=null;
        Token SEMI286=null;
        Token IDENTIFIER287=null;
        Token SEMI288=null;
        HaxeParser.paramList_return paramList284 =null;


        Object IDENTIFIER282_tree=null;
        Object LPAREN283_tree=null;
        Object RPAREN285_tree=null;
        Object SEMI286_tree=null;
        Object IDENTIFIER287_tree=null;
        Object SEMI288_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 54) ) { return retval; }

            // Haxe.g:364:17: ( IDENTIFIER ^ LPAREN ! ( paramList )? RPAREN ! SEMI !| IDENTIFIER SEMI !)
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==IDENTIFIER) ) {
                int LA81_1 = input.LA(2);

                if ( (LA81_1==LPAREN) ) {
                    alt81=1;
                }
                else if ( (LA81_1==SEMI) ) {
                    alt81=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 81, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 81, 0, input);

                throw nvae;

            }
            switch (alt81) {
                case 1 :
                    // Haxe.g:364:19: IDENTIFIER ^ LPAREN ! ( paramList )? RPAREN ! SEMI !
                    {
                    root_0 = (Object)adaptor.nil();


                    IDENTIFIER282=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_enumValueDecl4625); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER282_tree = 
                    new VarDeclarationNode(IDENTIFIER282) 
                    ;
                    root_0 = (Object)adaptor.becomeRoot(IDENTIFIER282_tree, root_0);
                    }

                    LPAREN283=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_enumValueDecl4631); if (state.failed) return retval;

                    // Haxe.g:364:59: ( paramList )?
                    int alt80=2;
                    int LA80_0 = input.LA(1);

                    if ( (LA80_0==IDENTIFIER||LA80_0==QUES) ) {
                        alt80=1;
                    }
                    switch (alt80) {
                        case 1 :
                            // Haxe.g:364:59: paramList
                            {
                            pushFollow(FOLLOW_paramList_in_enumValueDecl4634);
                            paramList284=paramList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, paramList284.getTree());

                            }
                            break;

                    }


                    RPAREN285=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_enumValueDecl4637); if (state.failed) return retval;

                    SEMI286=(Token)match(input,SEMI,FOLLOW_SEMI_in_enumValueDecl4640); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // Haxe.g:365:19: IDENTIFIER SEMI !
                    {
                    root_0 = (Object)adaptor.nil();


                    IDENTIFIER287=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_enumValueDecl4663); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER287_tree = 
                    new VarDeclarationNode(IDENTIFIER287) 
                    ;
                    adaptor.addChild(root_0, IDENTIFIER287_tree);
                    }

                    SEMI288=(Token)match(input,SEMI,FOLLOW_SEMI_in_enumValueDecl4668); if (state.failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 54, enumValueDecl_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "enumValueDecl"


    public static class classDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "classDecl"
    // Haxe.g:369:1: classDecl : ( topLevelAccess )? CLASS IDENTIFIER typeParamOpt inheritListOpt classBodyScope -> ^( IDENTIFIER ( topLevelAccess )? ( typeParamOpt )? ( inheritListOpt )? ( classBodyScope )? ) ;
    public final HaxeParser.classDecl_return classDecl() throws RecognitionException {
        HaxeParser.classDecl_return retval = new HaxeParser.classDecl_return();
        retval.start = input.LT(1);

        int classDecl_StartIndex = input.index();

        Object root_0 = null;

        Token CLASS290=null;
        Token IDENTIFIER291=null;
        HaxeParser.topLevelAccess_return topLevelAccess289 =null;

        HaxeParser.typeParamOpt_return typeParamOpt292 =null;

        HaxeParser.inheritListOpt_return inheritListOpt293 =null;

        HaxeParser.classBodyScope_return classBodyScope294 =null;


        Object CLASS290_tree=null;
        Object IDENTIFIER291_tree=null;
        RewriteRuleTokenStream stream_CLASS=new RewriteRuleTokenStream(adaptor,"token CLASS");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleSubtreeStream stream_classBodyScope=new RewriteRuleSubtreeStream(adaptor,"rule classBodyScope");
        RewriteRuleSubtreeStream stream_typeParamOpt=new RewriteRuleSubtreeStream(adaptor,"rule typeParamOpt");
        RewriteRuleSubtreeStream stream_topLevelAccess=new RewriteRuleSubtreeStream(adaptor,"rule topLevelAccess");
        RewriteRuleSubtreeStream stream_inheritListOpt=new RewriteRuleSubtreeStream(adaptor,"rule inheritListOpt");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 55) ) { return retval; }

            // Haxe.g:369:17: ( ( topLevelAccess )? CLASS IDENTIFIER typeParamOpt inheritListOpt classBodyScope -> ^( IDENTIFIER ( topLevelAccess )? ( typeParamOpt )? ( inheritListOpt )? ( classBodyScope )? ) )
            // Haxe.g:369:19: ( topLevelAccess )? CLASS IDENTIFIER typeParamOpt inheritListOpt classBodyScope
            {
            // Haxe.g:369:19: ( topLevelAccess )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==EXTERN||LA82_0==PRIVATE) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // Haxe.g:369:19: topLevelAccess
                    {
                    pushFollow(FOLLOW_topLevelAccess_in_classDecl4717);
                    topLevelAccess289=topLevelAccess();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_topLevelAccess.add(topLevelAccess289.getTree());

                    }
                    break;

            }


            CLASS290=(Token)match(input,CLASS,FOLLOW_CLASS_in_classDecl4720); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CLASS.add(CLASS290);


            IDENTIFIER291=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_classDecl4722); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER291);


            pushFollow(FOLLOW_typeParamOpt_in_classDecl4724);
            typeParamOpt292=typeParamOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeParamOpt.add(typeParamOpt292.getTree());

            pushFollow(FOLLOW_inheritListOpt_in_classDecl4726);
            inheritListOpt293=inheritListOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_inheritListOpt.add(inheritListOpt293.getTree());

            pushFollow(FOLLOW_classBodyScope_in_classDecl4728);
            classBodyScope294=classBodyScope();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_classBodyScope.add(classBodyScope294.getTree());

            // AST REWRITE
            // elements: classBodyScope, topLevelAccess, typeParamOpt, IDENTIFIER, inheritListOpt
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 369:95: -> ^( IDENTIFIER ( topLevelAccess )? ( typeParamOpt )? ( inheritListOpt )? ( classBodyScope )? )
            {
                // Haxe.g:369:98: ^( IDENTIFIER ( topLevelAccess )? ( typeParamOpt )? ( inheritListOpt )? ( classBodyScope )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                new ClassNode(stream_IDENTIFIER.nextToken())
                , root_1);

                // Haxe.g:369:122: ( topLevelAccess )?
                if ( stream_topLevelAccess.hasNext() ) {
                    adaptor.addChild(root_1, stream_topLevelAccess.nextTree());

                }
                stream_topLevelAccess.reset();

                // Haxe.g:369:138: ( typeParamOpt )?
                if ( stream_typeParamOpt.hasNext() ) {
                    adaptor.addChild(root_1, stream_typeParamOpt.nextTree());

                }
                stream_typeParamOpt.reset();

                // Haxe.g:369:152: ( inheritListOpt )?
                if ( stream_inheritListOpt.hasNext() ) {
                    adaptor.addChild(root_1, stream_inheritListOpt.nextTree());

                }
                stream_inheritListOpt.reset();

                // Haxe.g:369:168: ( classBodyScope )?
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
            if ( state.backtracking>0 ) { memoize(input, 55, classDecl_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "classDecl"


    public static class classBodyScope_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "classBodyScope"
    // Haxe.g:372:1: classBodyScope : LBRACE ( classMember )* RBRACE -> ^( BLOCK_SCOPE[$LBRACE, $RBRACE] ( classMember )* ) ;
    public final HaxeParser.classBodyScope_return classBodyScope() throws RecognitionException {
        HaxeParser.classBodyScope_return retval = new HaxeParser.classBodyScope_return();
        retval.start = input.LT(1);

        int classBodyScope_StartIndex = input.index();

        Object root_0 = null;

        Token LBRACE295=null;
        Token RBRACE297=null;
        HaxeParser.classMember_return classMember296 =null;


        Object LBRACE295_tree=null;
        Object RBRACE297_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_classMember=new RewriteRuleSubtreeStream(adaptor,"rule classMember");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 56) ) { return retval; }

            // Haxe.g:372:17: ( LBRACE ( classMember )* RBRACE -> ^( BLOCK_SCOPE[$LBRACE, $RBRACE] ( classMember )* ) )
            // Haxe.g:372:19: LBRACE ( classMember )* RBRACE
            {
            LBRACE295=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_classBodyScope4775); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACE.add(LBRACE295);


            // Haxe.g:372:26: ( classMember )*
            loop83:
            do {
                int alt83=2;
                int LA83_0 = input.LA(1);

                if ( (LA83_0==DYNAMIC||LA83_0==FUNCTION||LA83_0==INLINE||LA83_0==OVERRIDE||LA83_0==PRIVATE||LA83_0==PUBLIC||LA83_0==STATIC||LA83_0==VAR) ) {
                    alt83=1;
                }


                switch (alt83) {
            	case 1 :
            	    // Haxe.g:372:27: classMember
            	    {
            	    pushFollow(FOLLOW_classMember_in_classBodyScope4778);
            	    classMember296=classMember();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_classMember.add(classMember296.getTree());

            	    }
            	    break;

            	default :
            	    break loop83;
                }
            } while (true);


            RBRACE297=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_classBodyScope4782); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACE.add(RBRACE297);


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
            // 372:48: -> ^( BLOCK_SCOPE[$LBRACE, $RBRACE] ( classMember )* )
            {
                // Haxe.g:372:51: ^( BLOCK_SCOPE[$LBRACE, $RBRACE] ( classMember )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                new BlockScopeNode(BLOCK_SCOPE, LBRACE295, RBRACE297)
                , root_1);

                // Haxe.g:372:99: ( classMember )*
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
            if ( state.backtracking>0 ) { memoize(input, 56, classBodyScope_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "classBodyScope"


    public static class classMember_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "classMember"
    // Haxe.g:375:1: classMember : ( varDeclClass | funcDecl );
    public final HaxeParser.classMember_return classMember() throws RecognitionException {
        HaxeParser.classMember_return retval = new HaxeParser.classMember_return();
        retval.start = input.LT(1);

        int classMember_StartIndex = input.index();

        Object root_0 = null;

        HaxeParser.varDeclClass_return varDeclClass298 =null;

        HaxeParser.funcDecl_return funcDecl299 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 57) ) { return retval; }

            // Haxe.g:375:17: ( varDeclClass | funcDecl )
            int alt84=2;
            alt84 = dfa84.predict(input);
            switch (alt84) {
                case 1 :
                    // Haxe.g:375:19: varDeclClass
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_varDeclClass_in_classMember4828);
                    varDeclClass298=varDeclClass();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclClass298.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:376:19: funcDecl
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_funcDecl_in_classMember4848);
                    funcDecl299=funcDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, funcDecl299.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 57, classMember_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "classMember"


    public static class varDeclList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "varDeclList"
    // Haxe.g:380:1: varDeclList : varDecl varDeclList ;
    public final HaxeParser.varDeclList_return varDeclList() throws RecognitionException {
        HaxeParser.varDeclList_return retval = new HaxeParser.varDeclList_return();
        retval.start = input.LT(1);

        int varDeclList_StartIndex = input.index();

        Object root_0 = null;

        HaxeParser.varDecl_return varDecl300 =null;

        HaxeParser.varDeclList_return varDeclList301 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 58) ) { return retval; }

            // Haxe.g:380:17: ( varDecl varDeclList )
            // Haxe.g:380:19: varDecl varDeclList
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_varDecl_in_varDeclList4891);
            varDecl300=varDecl();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, varDecl300.getTree());

            pushFollow(FOLLOW_varDeclList_in_varDeclList4893);
            varDeclList301=varDeclList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclList301.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 58, varDeclList_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "varDeclList"


    public static class varDeclClass_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "varDeclClass"
    // Haxe.g:383:1: varDeclClass : ( declAttrList )? VAR IDENTIFIER ( propDecl )? ( typeTag )? ( varInit )? SEMI -> ^( IDENTIFIER ( declAttrList )? ( propDecl )? ( typeTag )? ( varInit )? ) ;
    public final HaxeParser.varDeclClass_return varDeclClass() throws RecognitionException {
        HaxeParser.varDeclClass_return retval = new HaxeParser.varDeclClass_return();
        retval.start = input.LT(1);

        int varDeclClass_StartIndex = input.index();

        Object root_0 = null;

        Token VAR303=null;
        Token IDENTIFIER304=null;
        Token SEMI308=null;
        HaxeParser.declAttrList_return declAttrList302 =null;

        HaxeParser.propDecl_return propDecl305 =null;

        HaxeParser.typeTag_return typeTag306 =null;

        HaxeParser.varInit_return varInit307 =null;


        Object VAR303_tree=null;
        Object IDENTIFIER304_tree=null;
        Object SEMI308_tree=null;
        RewriteRuleTokenStream stream_VAR=new RewriteRuleTokenStream(adaptor,"token VAR");
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleSubtreeStream stream_typeTag=new RewriteRuleSubtreeStream(adaptor,"rule typeTag");
        RewriteRuleSubtreeStream stream_declAttrList=new RewriteRuleSubtreeStream(adaptor,"rule declAttrList");
        RewriteRuleSubtreeStream stream_propDecl=new RewriteRuleSubtreeStream(adaptor,"rule propDecl");
        RewriteRuleSubtreeStream stream_varInit=new RewriteRuleSubtreeStream(adaptor,"rule varInit");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 59) ) { return retval; }

            // Haxe.g:383:17: ( ( declAttrList )? VAR IDENTIFIER ( propDecl )? ( typeTag )? ( varInit )? SEMI -> ^( IDENTIFIER ( declAttrList )? ( propDecl )? ( typeTag )? ( varInit )? ) )
            // Haxe.g:383:19: ( declAttrList )? VAR IDENTIFIER ( propDecl )? ( typeTag )? ( varInit )? SEMI
            {
            // Haxe.g:383:19: ( declAttrList )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==DYNAMIC||LA85_0==INLINE||LA85_0==OVERRIDE||LA85_0==PRIVATE||LA85_0==PUBLIC||LA85_0==STATIC) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // Haxe.g:383:19: declAttrList
                    {
                    pushFollow(FOLLOW_declAttrList_in_varDeclClass4921);
                    declAttrList302=declAttrList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declAttrList.add(declAttrList302.getTree());

                    }
                    break;

            }


            VAR303=(Token)match(input,VAR,FOLLOW_VAR_in_varDeclClass4924); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_VAR.add(VAR303);


            IDENTIFIER304=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_varDeclClass4926); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER304);


            // Haxe.g:383:48: ( propDecl )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==LPAREN) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // Haxe.g:383:48: propDecl
                    {
                    pushFollow(FOLLOW_propDecl_in_varDeclClass4928);
                    propDecl305=propDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_propDecl.add(propDecl305.getTree());

                    }
                    break;

            }


            // Haxe.g:383:58: ( typeTag )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==COLON) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // Haxe.g:383:58: typeTag
                    {
                    pushFollow(FOLLOW_typeTag_in_varDeclClass4931);
                    typeTag306=typeTag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeTag.add(typeTag306.getTree());

                    }
                    break;

            }


            // Haxe.g:383:67: ( varInit )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==EQ) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // Haxe.g:383:67: varInit
                    {
                    pushFollow(FOLLOW_varInit_in_varDeclClass4934);
                    varInit307=varInit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_varInit.add(varInit307.getTree());

                    }
                    break;

            }


            SEMI308=(Token)match(input,SEMI,FOLLOW_SEMI_in_varDeclClass4937); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SEMI.add(SEMI308);


            // AST REWRITE
            // elements: IDENTIFIER, declAttrList, typeTag, varInit, propDecl
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 383:81: -> ^( IDENTIFIER ( declAttrList )? ( propDecl )? ( typeTag )? ( varInit )? )
            {
                // Haxe.g:383:84: ^( IDENTIFIER ( declAttrList )? ( propDecl )? ( typeTag )? ( varInit )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                new VarDeclarationNode(stream_IDENTIFIER.nextToken())
                , root_1);

                // Haxe.g:383:117: ( declAttrList )?
                if ( stream_declAttrList.hasNext() ) {
                    adaptor.addChild(root_1, stream_declAttrList.nextTree());

                }
                stream_declAttrList.reset();

                // Haxe.g:383:131: ( propDecl )?
                if ( stream_propDecl.hasNext() ) {
                    adaptor.addChild(root_1, stream_propDecl.nextTree());

                }
                stream_propDecl.reset();

                // Haxe.g:383:141: ( typeTag )?
                if ( stream_typeTag.hasNext() ) {
                    adaptor.addChild(root_1, stream_typeTag.nextTree());

                }
                stream_typeTag.reset();

                // Haxe.g:383:150: ( varInit )?
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
            if ( state.backtracking>0 ) { memoize(input, 59, varDeclClass_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "varDeclClass"


    public static class varDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "varDecl"
    // Haxe.g:386:1: varDecl : VAR ! varDeclPartList ( COMMA ! varDeclPartList )* SEMI !;
    public final HaxeParser.varDecl_return varDecl() throws RecognitionException {
        HaxeParser.varDecl_return retval = new HaxeParser.varDecl_return();
        retval.start = input.LT(1);

        int varDecl_StartIndex = input.index();

        Object root_0 = null;

        Token VAR309=null;
        Token COMMA311=null;
        Token SEMI313=null;
        HaxeParser.varDeclPartList_return varDeclPartList310 =null;

        HaxeParser.varDeclPartList_return varDeclPartList312 =null;


        Object VAR309_tree=null;
        Object COMMA311_tree=null;
        Object SEMI313_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 60) ) { return retval; }

            // Haxe.g:386:12: ( VAR ! varDeclPartList ( COMMA ! varDeclPartList )* SEMI !)
            // Haxe.g:386:14: VAR ! varDeclPartList ( COMMA ! varDeclPartList )* SEMI !
            {
            root_0 = (Object)adaptor.nil();


            VAR309=(Token)match(input,VAR,FOLLOW_VAR_in_varDecl5002); if (state.failed) return retval;

            pushFollow(FOLLOW_varDeclPartList_in_varDecl5005);
            varDeclPartList310=varDeclPartList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclPartList310.getTree());

            // Haxe.g:386:35: ( COMMA ! varDeclPartList )*
            loop89:
            do {
                int alt89=2;
                int LA89_0 = input.LA(1);

                if ( (LA89_0==COMMA) ) {
                    alt89=1;
                }


                switch (alt89) {
            	case 1 :
            	    // Haxe.g:386:36: COMMA ! varDeclPartList
            	    {
            	    COMMA311=(Token)match(input,COMMA,FOLLOW_COMMA_in_varDecl5008); if (state.failed) return retval;

            	    pushFollow(FOLLOW_varDeclPartList_in_varDecl5011);
            	    varDeclPartList312=varDeclPartList();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclPartList312.getTree());

            	    }
            	    break;

            	default :
            	    break loop89;
                }
            } while (true);


            SEMI313=(Token)match(input,SEMI,FOLLOW_SEMI_in_varDecl5015); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 60, varDecl_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "varDecl"


    public static class varDeclPartList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "varDeclPartList"
    // Haxe.g:389:1: varDeclPartList : IDENTIFIER ( propDecl )? ( typeTag )? ( varInit )? -> ^( IDENTIFIER ( propDecl )? ( typeTag )? ( varInit )? ) ;
    public final HaxeParser.varDeclPartList_return varDeclPartList() throws RecognitionException {
        HaxeParser.varDeclPartList_return retval = new HaxeParser.varDeclPartList_return();
        retval.start = input.LT(1);

        int varDeclPartList_StartIndex = input.index();

        Object root_0 = null;

        Token IDENTIFIER314=null;
        HaxeParser.propDecl_return propDecl315 =null;

        HaxeParser.typeTag_return typeTag316 =null;

        HaxeParser.varInit_return varInit317 =null;


        Object IDENTIFIER314_tree=null;
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleSubtreeStream stream_typeTag=new RewriteRuleSubtreeStream(adaptor,"rule typeTag");
        RewriteRuleSubtreeStream stream_propDecl=new RewriteRuleSubtreeStream(adaptor,"rule propDecl");
        RewriteRuleSubtreeStream stream_varInit=new RewriteRuleSubtreeStream(adaptor,"rule varInit");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 61) ) { return retval; }

            // Haxe.g:389:17: ( IDENTIFIER ( propDecl )? ( typeTag )? ( varInit )? -> ^( IDENTIFIER ( propDecl )? ( typeTag )? ( varInit )? ) )
            // Haxe.g:389:19: IDENTIFIER ( propDecl )? ( typeTag )? ( varInit )?
            {
            IDENTIFIER314=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_varDeclPartList5036); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER314);


            // Haxe.g:389:30: ( propDecl )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==LPAREN) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // Haxe.g:389:30: propDecl
                    {
                    pushFollow(FOLLOW_propDecl_in_varDeclPartList5038);
                    propDecl315=propDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_propDecl.add(propDecl315.getTree());

                    }
                    break;

            }


            // Haxe.g:389:40: ( typeTag )?
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==COLON) ) {
                alt91=1;
            }
            switch (alt91) {
                case 1 :
                    // Haxe.g:389:40: typeTag
                    {
                    pushFollow(FOLLOW_typeTag_in_varDeclPartList5041);
                    typeTag316=typeTag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeTag.add(typeTag316.getTree());

                    }
                    break;

            }


            // Haxe.g:389:49: ( varInit )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==EQ) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // Haxe.g:389:49: varInit
                    {
                    pushFollow(FOLLOW_varInit_in_varDeclPartList5044);
                    varInit317=varInit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_varInit.add(varInit317.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: typeTag, propDecl, varInit, IDENTIFIER
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 389:58: -> ^( IDENTIFIER ( propDecl )? ( typeTag )? ( varInit )? )
            {
                // Haxe.g:389:61: ^( IDENTIFIER ( propDecl )? ( typeTag )? ( varInit )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                new VarDeclarationNode(stream_IDENTIFIER.nextToken())
                , root_1);

                // Haxe.g:389:94: ( propDecl )?
                if ( stream_propDecl.hasNext() ) {
                    adaptor.addChild(root_1, stream_propDecl.nextTree());

                }
                stream_propDecl.reset();

                // Haxe.g:389:104: ( typeTag )?
                if ( stream_typeTag.hasNext() ) {
                    adaptor.addChild(root_1, stream_typeTag.nextTree());

                }
                stream_typeTag.reset();

                // Haxe.g:389:113: ( varInit )?
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
            if ( state.backtracking>0 ) { memoize(input, 61, varDeclPartList_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "varDeclPartList"


    public static class propDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "propDecl"
    // Haxe.g:392:1: propDecl : LPAREN a1= propAccessor COMMA a2= propAccessor RPAREN -> ^( PROPERTY_DECL[\"PROPERTY_DECL\"] ( $a1)? ( $a2)? ) ;
    public final HaxeParser.propDecl_return propDecl() throws RecognitionException {
        HaxeParser.propDecl_return retval = new HaxeParser.propDecl_return();
        retval.start = input.LT(1);

        int propDecl_StartIndex = input.index();

        Object root_0 = null;

        Token LPAREN318=null;
        Token COMMA319=null;
        Token RPAREN320=null;
        HaxeParser.propAccessor_return a1 =null;

        HaxeParser.propAccessor_return a2 =null;


        Object LPAREN318_tree=null;
        Object COMMA319_tree=null;
        Object RPAREN320_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_propAccessor=new RewriteRuleSubtreeStream(adaptor,"rule propAccessor");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 62) ) { return retval; }

            // Haxe.g:392:17: ( LPAREN a1= propAccessor COMMA a2= propAccessor RPAREN -> ^( PROPERTY_DECL[\"PROPERTY_DECL\"] ( $a1)? ( $a2)? ) )
            // Haxe.g:392:19: LPAREN a1= propAccessor COMMA a2= propAccessor RPAREN
            {
            LPAREN318=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_propDecl5095); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN318);


            pushFollow(FOLLOW_propAccessor_in_propDecl5099);
            a1=propAccessor();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_propAccessor.add(a1.getTree());

            COMMA319=(Token)match(input,COMMA,FOLLOW_COMMA_in_propDecl5101); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COMMA.add(COMMA319);


            pushFollow(FOLLOW_propAccessor_in_propDecl5105);
            a2=propAccessor();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_propAccessor.add(a2.getTree());

            RPAREN320=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_propDecl5107); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN320);


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
            // 392:71: -> ^( PROPERTY_DECL[\"PROPERTY_DECL\"] ( $a1)? ( $a2)? )
            {
                // Haxe.g:392:74: ^( PROPERTY_DECL[\"PROPERTY_DECL\"] ( $a1)? ( $a2)? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                new HaxeTree(PROPERTY_DECL, "PROPERTY_DECL")
                , root_1);

                // Haxe.g:392:118: ( $a1)?
                if ( stream_a1.hasNext() ) {
                    adaptor.addChild(root_1, stream_a1.nextTree());

                }
                stream_a1.reset();

                // Haxe.g:392:123: ( $a2)?
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
            if ( state.backtracking>0 ) { memoize(input, 62, propDecl_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "propDecl"


    public static class propAccessor_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "propAccessor"
    // Haxe.g:395:1: propAccessor : ( IDENTIFIER | NULL | DEFAULT | DYNAMIC );
    public final HaxeParser.propAccessor_return propAccessor() throws RecognitionException {
        HaxeParser.propAccessor_return retval = new HaxeParser.propAccessor_return();
        retval.start = input.LT(1);

        int propAccessor_StartIndex = input.index();

        Object root_0 = null;

        Token set321=null;

        Object set321_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 63) ) { return retval; }

            // Haxe.g:395:17: ( IDENTIFIER | NULL | DEFAULT | DYNAMIC )
            // Haxe.g:
            {
            root_0 = (Object)adaptor.nil();


            set321=(Token)input.LT(1);

            if ( input.LA(1)==DEFAULT||input.LA(1)==DYNAMIC||input.LA(1)==IDENTIFIER||input.LA(1)==NULL ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (Object)adaptor.create(set321)
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
            if ( state.backtracking>0 ) { memoize(input, 63, propAccessor_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "propAccessor"


    public static class varInit_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "varInit"
    // Haxe.g:401:1: varInit : EQ expr -> ^( VAR_INIT[\"VAR_INIT\"] expr ) ;
    public final HaxeParser.varInit_return varInit() throws RecognitionException {
        HaxeParser.varInit_return retval = new HaxeParser.varInit_return();
        retval.start = input.LT(1);

        int varInit_StartIndex = input.index();

        Object root_0 = null;

        Token EQ322=null;
        HaxeParser.expr_return expr323 =null;


        Object EQ322_tree=null;
        RewriteRuleTokenStream stream_EQ=new RewriteRuleTokenStream(adaptor,"token EQ");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 64) ) { return retval; }

            // Haxe.g:401:17: ( EQ expr -> ^( VAR_INIT[\"VAR_INIT\"] expr ) )
            // Haxe.g:401:19: EQ expr
            {
            EQ322=(Token)match(input,EQ,FOLLOW_EQ_in_varInit5248); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_EQ.add(EQ322);


            pushFollow(FOLLOW_expr_in_varInit5250);
            expr323=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr323.getTree());

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
            // 401:27: -> ^( VAR_INIT[\"VAR_INIT\"] expr )
            {
                // Haxe.g:401:30: ^( VAR_INIT[\"VAR_INIT\"] expr )
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
            if ( state.backtracking>0 ) { memoize(input, 64, varInit_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "varInit"


    public static class funcDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "funcDecl"
    // Haxe.g:404:1: funcDecl : ( ( declAttrList )? FUNCTION NEW LPAREN ( paramList )? RPAREN ( typeTag )? block -> ^( FUNCTION NEW ( declAttrList )? ( paramList )? ( typeTag )? ( block )? ) | ( declAttrList )? FUNCTION IDENTIFIER typeParamOpt LPAREN ( paramList )? RPAREN ( typeTag )? block -> ^( FUNCTION IDENTIFIER ( declAttrList )? ( paramList )? ( typeTag )? ( block )? ( typeParamOpt )? ) );
    public final HaxeParser.funcDecl_return funcDecl() throws RecognitionException {
        HaxeParser.funcDecl_return retval = new HaxeParser.funcDecl_return();
        retval.start = input.LT(1);

        int funcDecl_StartIndex = input.index();

        Object root_0 = null;

        Token FUNCTION325=null;
        Token NEW326=null;
        Token LPAREN327=null;
        Token RPAREN329=null;
        Token FUNCTION333=null;
        Token IDENTIFIER334=null;
        Token LPAREN336=null;
        Token RPAREN338=null;
        HaxeParser.declAttrList_return declAttrList324 =null;

        HaxeParser.paramList_return paramList328 =null;

        HaxeParser.typeTag_return typeTag330 =null;

        HaxeParser.block_return block331 =null;

        HaxeParser.declAttrList_return declAttrList332 =null;

        HaxeParser.typeParamOpt_return typeParamOpt335 =null;

        HaxeParser.paramList_return paramList337 =null;

        HaxeParser.typeTag_return typeTag339 =null;

        HaxeParser.block_return block340 =null;


        Object FUNCTION325_tree=null;
        Object NEW326_tree=null;
        Object LPAREN327_tree=null;
        Object RPAREN329_tree=null;
        Object FUNCTION333_tree=null;
        Object IDENTIFIER334_tree=null;
        Object LPAREN336_tree=null;
        Object RPAREN338_tree=null;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 65) ) { return retval; }

            // Haxe.g:404:9: ( ( declAttrList )? FUNCTION NEW LPAREN ( paramList )? RPAREN ( typeTag )? block -> ^( FUNCTION NEW ( declAttrList )? ( paramList )? ( typeTag )? ( block )? ) | ( declAttrList )? FUNCTION IDENTIFIER typeParamOpt LPAREN ( paramList )? RPAREN ( typeTag )? block -> ^( FUNCTION IDENTIFIER ( declAttrList )? ( paramList )? ( typeTag )? ( block )? ( typeParamOpt )? ) )
            int alt99=2;
            alt99 = dfa99.predict(input);
            switch (alt99) {
                case 1 :
                    // Haxe.g:404:13: ( declAttrList )? FUNCTION NEW LPAREN ( paramList )? RPAREN ( typeTag )? block
                    {
                    // Haxe.g:404:13: ( declAttrList )?
                    int alt93=2;
                    int LA93_0 = input.LA(1);

                    if ( (LA93_0==DYNAMIC||LA93_0==INLINE||LA93_0==OVERRIDE||LA93_0==PRIVATE||LA93_0==PUBLIC||LA93_0==STATIC) ) {
                        alt93=1;
                    }
                    switch (alt93) {
                        case 1 :
                            // Haxe.g:404:13: declAttrList
                            {
                            pushFollow(FOLLOW_declAttrList_in_funcDecl5292);
                            declAttrList324=declAttrList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_declAttrList.add(declAttrList324.getTree());

                            }
                            break;

                    }


                    FUNCTION325=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcDecl5295); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION325);


                    NEW326=(Token)match(input,NEW,FOLLOW_NEW_in_funcDecl5297); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEW.add(NEW326);


                    LPAREN327=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcDecl5299); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN327);


                    // Haxe.g:404:47: ( paramList )?
                    int alt94=2;
                    int LA94_0 = input.LA(1);

                    if ( (LA94_0==IDENTIFIER||LA94_0==QUES) ) {
                        alt94=1;
                    }
                    switch (alt94) {
                        case 1 :
                            // Haxe.g:404:47: paramList
                            {
                            pushFollow(FOLLOW_paramList_in_funcDecl5301);
                            paramList328=paramList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_paramList.add(paramList328.getTree());

                            }
                            break;

                    }


                    RPAREN329=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcDecl5304); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN329);


                    // Haxe.g:404:65: ( typeTag )?
                    int alt95=2;
                    int LA95_0 = input.LA(1);

                    if ( (LA95_0==COLON) ) {
                        alt95=1;
                    }
                    switch (alt95) {
                        case 1 :
                            // Haxe.g:404:65: typeTag
                            {
                            pushFollow(FOLLOW_typeTag_in_funcDecl5306);
                            typeTag330=typeTag();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_typeTag.add(typeTag330.getTree());

                            }
                            break;

                    }


                    pushFollow(FOLLOW_block_in_funcDecl5309);
                    block331=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block331.getTree());

                    // AST REWRITE
                    // elements: block, typeTag, FUNCTION, paramList, NEW, declAttrList
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 405:17: -> ^( FUNCTION NEW ( declAttrList )? ( paramList )? ( typeTag )? ( block )? )
                    {
                        // Haxe.g:405:20: ^( FUNCTION NEW ( declAttrList )? ( paramList )? ( typeTag )? ( block )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        new FunctionNode(stream_FUNCTION.nextToken())
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_NEW.nextNode()
                        );

                        // Haxe.g:405:49: ( declAttrList )?
                        if ( stream_declAttrList.hasNext() ) {
                            adaptor.addChild(root_1, stream_declAttrList.nextTree());

                        }
                        stream_declAttrList.reset();

                        // Haxe.g:405:63: ( paramList )?
                        if ( stream_paramList.hasNext() ) {
                            adaptor.addChild(root_1, stream_paramList.nextTree());

                        }
                        stream_paramList.reset();

                        // Haxe.g:405:74: ( typeTag )?
                        if ( stream_typeTag.hasNext() ) {
                            adaptor.addChild(root_1, stream_typeTag.nextTree());

                        }
                        stream_typeTag.reset();

                        // Haxe.g:405:83: ( block )?
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
                    // Haxe.g:406:13: ( declAttrList )? FUNCTION IDENTIFIER typeParamOpt LPAREN ( paramList )? RPAREN ( typeTag )? block
                    {
                    // Haxe.g:406:13: ( declAttrList )?
                    int alt96=2;
                    int LA96_0 = input.LA(1);

                    if ( (LA96_0==DYNAMIC||LA96_0==INLINE||LA96_0==OVERRIDE||LA96_0==PRIVATE||LA96_0==PUBLIC||LA96_0==STATIC) ) {
                        alt96=1;
                    }
                    switch (alt96) {
                        case 1 :
                            // Haxe.g:406:13: declAttrList
                            {
                            pushFollow(FOLLOW_declAttrList_in_funcDecl5364);
                            declAttrList332=declAttrList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_declAttrList.add(declAttrList332.getTree());

                            }
                            break;

                    }


                    FUNCTION333=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcDecl5367); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION333);


                    IDENTIFIER334=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_funcDecl5369); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER334);


                    pushFollow(FOLLOW_typeParamOpt_in_funcDecl5371);
                    typeParamOpt335=typeParamOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeParamOpt.add(typeParamOpt335.getTree());

                    LPAREN336=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcDecl5373); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN336);


                    // Haxe.g:406:67: ( paramList )?
                    int alt97=2;
                    int LA97_0 = input.LA(1);

                    if ( (LA97_0==IDENTIFIER||LA97_0==QUES) ) {
                        alt97=1;
                    }
                    switch (alt97) {
                        case 1 :
                            // Haxe.g:406:67: paramList
                            {
                            pushFollow(FOLLOW_paramList_in_funcDecl5375);
                            paramList337=paramList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_paramList.add(paramList337.getTree());

                            }
                            break;

                    }


                    RPAREN338=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcDecl5378); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN338);


                    // Haxe.g:406:85: ( typeTag )?
                    int alt98=2;
                    int LA98_0 = input.LA(1);

                    if ( (LA98_0==COLON) ) {
                        alt98=1;
                    }
                    switch (alt98) {
                        case 1 :
                            // Haxe.g:406:85: typeTag
                            {
                            pushFollow(FOLLOW_typeTag_in_funcDecl5380);
                            typeTag339=typeTag();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_typeTag.add(typeTag339.getTree());

                            }
                            break;

                    }


                    pushFollow(FOLLOW_block_in_funcDecl5383);
                    block340=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block340.getTree());

                    // AST REWRITE
                    // elements: typeParamOpt, typeTag, IDENTIFIER, paramList, declAttrList, FUNCTION, block
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 407:17: -> ^( FUNCTION IDENTIFIER ( declAttrList )? ( paramList )? ( typeTag )? ( block )? ( typeParamOpt )? )
                    {
                        // Haxe.g:407:20: ^( FUNCTION IDENTIFIER ( declAttrList )? ( paramList )? ( typeTag )? ( block )? ( typeParamOpt )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        new FunctionNode(stream_FUNCTION.nextToken())
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_IDENTIFIER.nextNode()
                        );

                        // Haxe.g:407:56: ( declAttrList )?
                        if ( stream_declAttrList.hasNext() ) {
                            adaptor.addChild(root_1, stream_declAttrList.nextTree());

                        }
                        stream_declAttrList.reset();

                        // Haxe.g:407:70: ( paramList )?
                        if ( stream_paramList.hasNext() ) {
                            adaptor.addChild(root_1, stream_paramList.nextTree());

                        }
                        stream_paramList.reset();

                        // Haxe.g:407:81: ( typeTag )?
                        if ( stream_typeTag.hasNext() ) {
                            adaptor.addChild(root_1, stream_typeTag.nextTree());

                        }
                        stream_typeTag.reset();

                        // Haxe.g:407:90: ( block )?
                        if ( stream_block.hasNext() ) {
                            adaptor.addChild(root_1, stream_block.nextTree());

                        }
                        stream_block.reset();

                        // Haxe.g:407:97: ( typeParamOpt )?
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
            if ( state.backtracking>0 ) { memoize(input, 65, funcDecl_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "funcDecl"


    public static class funcProtoDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "funcProtoDecl"
    // Haxe.g:410:1: funcProtoDecl : ( declAttrList FUNCTION NEW LPAREN ( paramList )? RPAREN ( typeTag )? SEMI -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTag )? ( declAttrList )? ) | declAttrList FUNCTION IDENTIFIER typeParamOpt LPAREN ( paramList )? RPAREN ( typeTag )? SEMI -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTag )? ( declAttrList )? ( typeParamOpt )? ) | FUNCTION NEW LPAREN ( paramList )? RPAREN ( typeTag )? SEMI -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTag )? ) | FUNCTION IDENTIFIER typeParamOpt LPAREN ( paramList )? RPAREN ( typeTag )? SEMI -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTag )? ( typeParamOpt )? ) );
    public final HaxeParser.funcProtoDecl_return funcProtoDecl() throws RecognitionException {
        HaxeParser.funcProtoDecl_return retval = new HaxeParser.funcProtoDecl_return();
        retval.start = input.LT(1);

        int funcProtoDecl_StartIndex = input.index();

        Object root_0 = null;

        Token FUNCTION342=null;
        Token NEW343=null;
        Token LPAREN344=null;
        Token RPAREN346=null;
        Token SEMI348=null;
        Token FUNCTION350=null;
        Token IDENTIFIER351=null;
        Token LPAREN353=null;
        Token RPAREN355=null;
        Token SEMI357=null;
        Token FUNCTION358=null;
        Token NEW359=null;
        Token LPAREN360=null;
        Token RPAREN362=null;
        Token SEMI364=null;
        Token FUNCTION365=null;
        Token IDENTIFIER366=null;
        Token LPAREN368=null;
        Token RPAREN370=null;
        Token SEMI372=null;
        HaxeParser.declAttrList_return declAttrList341 =null;

        HaxeParser.paramList_return paramList345 =null;

        HaxeParser.typeTag_return typeTag347 =null;

        HaxeParser.declAttrList_return declAttrList349 =null;

        HaxeParser.typeParamOpt_return typeParamOpt352 =null;

        HaxeParser.paramList_return paramList354 =null;

        HaxeParser.typeTag_return typeTag356 =null;

        HaxeParser.paramList_return paramList361 =null;

        HaxeParser.typeTag_return typeTag363 =null;

        HaxeParser.typeParamOpt_return typeParamOpt367 =null;

        HaxeParser.paramList_return paramList369 =null;

        HaxeParser.typeTag_return typeTag371 =null;


        Object FUNCTION342_tree=null;
        Object NEW343_tree=null;
        Object LPAREN344_tree=null;
        Object RPAREN346_tree=null;
        Object SEMI348_tree=null;
        Object FUNCTION350_tree=null;
        Object IDENTIFIER351_tree=null;
        Object LPAREN353_tree=null;
        Object RPAREN355_tree=null;
        Object SEMI357_tree=null;
        Object FUNCTION358_tree=null;
        Object NEW359_tree=null;
        Object LPAREN360_tree=null;
        Object RPAREN362_tree=null;
        Object SEMI364_tree=null;
        Object FUNCTION365_tree=null;
        Object IDENTIFIER366_tree=null;
        Object LPAREN368_tree=null;
        Object RPAREN370_tree=null;
        Object SEMI372_tree=null;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 66) ) { return retval; }

            // Haxe.g:411:5: ( declAttrList FUNCTION NEW LPAREN ( paramList )? RPAREN ( typeTag )? SEMI -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTag )? ( declAttrList )? ) | declAttrList FUNCTION IDENTIFIER typeParamOpt LPAREN ( paramList )? RPAREN ( typeTag )? SEMI -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTag )? ( declAttrList )? ( typeParamOpt )? ) | FUNCTION NEW LPAREN ( paramList )? RPAREN ( typeTag )? SEMI -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTag )? ) | FUNCTION IDENTIFIER typeParamOpt LPAREN ( paramList )? RPAREN ( typeTag )? SEMI -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTag )? ( typeParamOpt )? ) )
            int alt108=4;
            alt108 = dfa108.predict(input);
            switch (alt108) {
                case 1 :
                    // Haxe.g:411:9: declAttrList FUNCTION NEW LPAREN ( paramList )? RPAREN ( typeTag )? SEMI
                    {
                    pushFollow(FOLLOW_declAttrList_in_funcProtoDecl5453);
                    declAttrList341=declAttrList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declAttrList.add(declAttrList341.getTree());

                    FUNCTION342=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcProtoDecl5455); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION342);


                    NEW343=(Token)match(input,NEW,FOLLOW_NEW_in_funcProtoDecl5457); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEW.add(NEW343);


                    LPAREN344=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcProtoDecl5459); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN344);


                    // Haxe.g:411:42: ( paramList )?
                    int alt100=2;
                    int LA100_0 = input.LA(1);

                    if ( (LA100_0==IDENTIFIER||LA100_0==QUES) ) {
                        alt100=1;
                    }
                    switch (alt100) {
                        case 1 :
                            // Haxe.g:411:42: paramList
                            {
                            pushFollow(FOLLOW_paramList_in_funcProtoDecl5461);
                            paramList345=paramList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_paramList.add(paramList345.getTree());

                            }
                            break;

                    }


                    RPAREN346=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcProtoDecl5464); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN346);


                    // Haxe.g:411:60: ( typeTag )?
                    int alt101=2;
                    int LA101_0 = input.LA(1);

                    if ( (LA101_0==COLON) ) {
                        alt101=1;
                    }
                    switch (alt101) {
                        case 1 :
                            // Haxe.g:411:60: typeTag
                            {
                            pushFollow(FOLLOW_typeTag_in_funcProtoDecl5466);
                            typeTag347=typeTag();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_typeTag.add(typeTag347.getTree());

                            }
                            break;

                    }


                    SEMI348=(Token)match(input,SEMI,FOLLOW_SEMI_in_funcProtoDecl5469); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI348);


                    // AST REWRITE
                    // elements: declAttrList, typeTag, NEW, paramList, FUNCTION
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 412:13: -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTag )? ( declAttrList )? )
                    {
                        // Haxe.g:412:16: ^( FUNCTION ( NEW )? ( paramList )? ( typeTag )? ( declAttrList )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_FUNCTION.nextNode()
                        , root_1);

                        // Haxe.g:412:27: ( NEW )?
                        if ( stream_NEW.hasNext() ) {
                            adaptor.addChild(root_1, 
                            stream_NEW.nextNode()
                            );

                        }
                        stream_NEW.reset();

                        // Haxe.g:412:32: ( paramList )?
                        if ( stream_paramList.hasNext() ) {
                            adaptor.addChild(root_1, stream_paramList.nextTree());

                        }
                        stream_paramList.reset();

                        // Haxe.g:412:43: ( typeTag )?
                        if ( stream_typeTag.hasNext() ) {
                            adaptor.addChild(root_1, stream_typeTag.nextTree());

                        }
                        stream_typeTag.reset();

                        // Haxe.g:412:52: ( declAttrList )?
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
                    // Haxe.g:413:9: declAttrList FUNCTION IDENTIFIER typeParamOpt LPAREN ( paramList )? RPAREN ( typeTag )? SEMI
                    {
                    pushFollow(FOLLOW_declAttrList_in_funcProtoDecl5510);
                    declAttrList349=declAttrList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declAttrList.add(declAttrList349.getTree());

                    FUNCTION350=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcProtoDecl5512); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION350);


                    IDENTIFIER351=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_funcProtoDecl5514); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER351);


                    pushFollow(FOLLOW_typeParamOpt_in_funcProtoDecl5516);
                    typeParamOpt352=typeParamOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeParamOpt.add(typeParamOpt352.getTree());

                    LPAREN353=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcProtoDecl5518); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN353);


                    // Haxe.g:413:62: ( paramList )?
                    int alt102=2;
                    int LA102_0 = input.LA(1);

                    if ( (LA102_0==IDENTIFIER||LA102_0==QUES) ) {
                        alt102=1;
                    }
                    switch (alt102) {
                        case 1 :
                            // Haxe.g:413:62: paramList
                            {
                            pushFollow(FOLLOW_paramList_in_funcProtoDecl5520);
                            paramList354=paramList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_paramList.add(paramList354.getTree());

                            }
                            break;

                    }


                    RPAREN355=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcProtoDecl5523); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN355);


                    // Haxe.g:413:80: ( typeTag )?
                    int alt103=2;
                    int LA103_0 = input.LA(1);

                    if ( (LA103_0==COLON) ) {
                        alt103=1;
                    }
                    switch (alt103) {
                        case 1 :
                            // Haxe.g:413:80: typeTag
                            {
                            pushFollow(FOLLOW_typeTag_in_funcProtoDecl5525);
                            typeTag356=typeTag();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_typeTag.add(typeTag356.getTree());

                            }
                            break;

                    }


                    SEMI357=(Token)match(input,SEMI,FOLLOW_SEMI_in_funcProtoDecl5528); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI357);


                    // AST REWRITE
                    // elements: IDENTIFIER, FUNCTION, typeParamOpt, typeTag, paramList, declAttrList
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 414:13: -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTag )? ( declAttrList )? ( typeParamOpt )? )
                    {
                        // Haxe.g:414:16: ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTag )? ( declAttrList )? ( typeParamOpt )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_FUNCTION.nextNode()
                        , root_1);

                        // Haxe.g:414:27: ( IDENTIFIER )?
                        if ( stream_IDENTIFIER.hasNext() ) {
                            adaptor.addChild(root_1, 
                            stream_IDENTIFIER.nextNode()
                            );

                        }
                        stream_IDENTIFIER.reset();

                        // Haxe.g:414:39: ( paramList )?
                        if ( stream_paramList.hasNext() ) {
                            adaptor.addChild(root_1, stream_paramList.nextTree());

                        }
                        stream_paramList.reset();

                        // Haxe.g:414:50: ( typeTag )?
                        if ( stream_typeTag.hasNext() ) {
                            adaptor.addChild(root_1, stream_typeTag.nextTree());

                        }
                        stream_typeTag.reset();

                        // Haxe.g:414:59: ( declAttrList )?
                        if ( stream_declAttrList.hasNext() ) {
                            adaptor.addChild(root_1, stream_declAttrList.nextTree());

                        }
                        stream_declAttrList.reset();

                        // Haxe.g:414:73: ( typeParamOpt )?
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
                    // Haxe.g:415:9: FUNCTION NEW LPAREN ( paramList )? RPAREN ( typeTag )? SEMI
                    {
                    FUNCTION358=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcProtoDecl5572); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION358);


                    NEW359=(Token)match(input,NEW,FOLLOW_NEW_in_funcProtoDecl5574); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEW.add(NEW359);


                    LPAREN360=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcProtoDecl5576); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN360);


                    // Haxe.g:415:29: ( paramList )?
                    int alt104=2;
                    int LA104_0 = input.LA(1);

                    if ( (LA104_0==IDENTIFIER||LA104_0==QUES) ) {
                        alt104=1;
                    }
                    switch (alt104) {
                        case 1 :
                            // Haxe.g:415:29: paramList
                            {
                            pushFollow(FOLLOW_paramList_in_funcProtoDecl5578);
                            paramList361=paramList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_paramList.add(paramList361.getTree());

                            }
                            break;

                    }


                    RPAREN362=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcProtoDecl5581); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN362);


                    // Haxe.g:415:47: ( typeTag )?
                    int alt105=2;
                    int LA105_0 = input.LA(1);

                    if ( (LA105_0==COLON) ) {
                        alt105=1;
                    }
                    switch (alt105) {
                        case 1 :
                            // Haxe.g:415:47: typeTag
                            {
                            pushFollow(FOLLOW_typeTag_in_funcProtoDecl5583);
                            typeTag363=typeTag();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_typeTag.add(typeTag363.getTree());

                            }
                            break;

                    }


                    SEMI364=(Token)match(input,SEMI,FOLLOW_SEMI_in_funcProtoDecl5586); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI364);


                    // AST REWRITE
                    // elements: FUNCTION, typeTag, NEW, paramList
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 416:13: -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTag )? )
                    {
                        // Haxe.g:416:16: ^( FUNCTION ( NEW )? ( paramList )? ( typeTag )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_FUNCTION.nextNode()
                        , root_1);

                        // Haxe.g:416:27: ( NEW )?
                        if ( stream_NEW.hasNext() ) {
                            adaptor.addChild(root_1, 
                            stream_NEW.nextNode()
                            );

                        }
                        stream_NEW.reset();

                        // Haxe.g:416:32: ( paramList )?
                        if ( stream_paramList.hasNext() ) {
                            adaptor.addChild(root_1, stream_paramList.nextTree());

                        }
                        stream_paramList.reset();

                        // Haxe.g:416:43: ( typeTag )?
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
                    // Haxe.g:417:9: FUNCTION IDENTIFIER typeParamOpt LPAREN ( paramList )? RPAREN ( typeTag )? SEMI
                    {
                    FUNCTION365=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcProtoDecl5624); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION365);


                    IDENTIFIER366=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_funcProtoDecl5626); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER366);


                    pushFollow(FOLLOW_typeParamOpt_in_funcProtoDecl5628);
                    typeParamOpt367=typeParamOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeParamOpt.add(typeParamOpt367.getTree());

                    LPAREN368=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcProtoDecl5630); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN368);


                    // Haxe.g:417:49: ( paramList )?
                    int alt106=2;
                    int LA106_0 = input.LA(1);

                    if ( (LA106_0==IDENTIFIER||LA106_0==QUES) ) {
                        alt106=1;
                    }
                    switch (alt106) {
                        case 1 :
                            // Haxe.g:417:49: paramList
                            {
                            pushFollow(FOLLOW_paramList_in_funcProtoDecl5632);
                            paramList369=paramList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_paramList.add(paramList369.getTree());

                            }
                            break;

                    }


                    RPAREN370=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcProtoDecl5635); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN370);


                    // Haxe.g:417:67: ( typeTag )?
                    int alt107=2;
                    int LA107_0 = input.LA(1);

                    if ( (LA107_0==COLON) ) {
                        alt107=1;
                    }
                    switch (alt107) {
                        case 1 :
                            // Haxe.g:417:67: typeTag
                            {
                            pushFollow(FOLLOW_typeTag_in_funcProtoDecl5637);
                            typeTag371=typeTag();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_typeTag.add(typeTag371.getTree());

                            }
                            break;

                    }


                    SEMI372=(Token)match(input,SEMI,FOLLOW_SEMI_in_funcProtoDecl5640); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI372);


                    // AST REWRITE
                    // elements: FUNCTION, paramList, typeParamOpt, IDENTIFIER, typeTag
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 418:13: -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTag )? ( typeParamOpt )? )
                    {
                        // Haxe.g:418:16: ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTag )? ( typeParamOpt )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_FUNCTION.nextNode()
                        , root_1);

                        // Haxe.g:418:27: ( IDENTIFIER )?
                        if ( stream_IDENTIFIER.hasNext() ) {
                            adaptor.addChild(root_1, 
                            stream_IDENTIFIER.nextNode()
                            );

                        }
                        stream_IDENTIFIER.reset();

                        // Haxe.g:418:39: ( paramList )?
                        if ( stream_paramList.hasNext() ) {
                            adaptor.addChild(root_1, stream_paramList.nextTree());

                        }
                        stream_paramList.reset();

                        // Haxe.g:418:50: ( typeTag )?
                        if ( stream_typeTag.hasNext() ) {
                            adaptor.addChild(root_1, stream_typeTag.nextTree());

                        }
                        stream_typeTag.reset();

                        // Haxe.g:418:59: ( typeParamOpt )?
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
            if ( state.backtracking>0 ) { memoize(input, 66, funcProtoDecl_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "funcProtoDecl"


    public static class interfaceDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "interfaceDecl"
    // Haxe.g:421:1: interfaceDecl : ( topLevelAccess )? INTERFACE type inheritListOpt LBRACE ! interfaceBody RBRACE !;
    public final HaxeParser.interfaceDecl_return interfaceDecl() throws RecognitionException {
        HaxeParser.interfaceDecl_return retval = new HaxeParser.interfaceDecl_return();
        retval.start = input.LT(1);

        int interfaceDecl_StartIndex = input.index();

        Object root_0 = null;

        Token INTERFACE374=null;
        Token LBRACE377=null;
        Token RBRACE379=null;
        HaxeParser.topLevelAccess_return topLevelAccess373 =null;

        HaxeParser.type_return type375 =null;

        HaxeParser.inheritListOpt_return inheritListOpt376 =null;

        HaxeParser.interfaceBody_return interfaceBody378 =null;


        Object INTERFACE374_tree=null;
        Object LBRACE377_tree=null;
        Object RBRACE379_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 67) ) { return retval; }

            // Haxe.g:422:5: ( ( topLevelAccess )? INTERFACE type inheritListOpt LBRACE ! interfaceBody RBRACE !)
            // Haxe.g:422:9: ( topLevelAccess )? INTERFACE type inheritListOpt LBRACE ! interfaceBody RBRACE !
            {
            root_0 = (Object)adaptor.nil();


            // Haxe.g:422:9: ( topLevelAccess )?
            int alt109=2;
            int LA109_0 = input.LA(1);

            if ( (LA109_0==EXTERN||LA109_0==PRIVATE) ) {
                alt109=1;
            }
            switch (alt109) {
                case 1 :
                    // Haxe.g:422:9: topLevelAccess
                    {
                    pushFollow(FOLLOW_topLevelAccess_in_interfaceDecl5699);
                    topLevelAccess373=topLevelAccess();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, topLevelAccess373.getTree());

                    }
                    break;

            }


            INTERFACE374=(Token)match(input,INTERFACE,FOLLOW_INTERFACE_in_interfaceDecl5702); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            INTERFACE374_tree = 
            (Object)adaptor.create(INTERFACE374)
            ;
            adaptor.addChild(root_0, INTERFACE374_tree);
            }

            pushFollow(FOLLOW_type_in_interfaceDecl5704);
            type375=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type375.getTree());

            pushFollow(FOLLOW_inheritListOpt_in_interfaceDecl5706);
            inheritListOpt376=inheritListOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, inheritListOpt376.getTree());

            LBRACE377=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_interfaceDecl5708); if (state.failed) return retval;

            pushFollow(FOLLOW_interfaceBody_in_interfaceDecl5711);
            interfaceBody378=interfaceBody();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceBody378.getTree());

            RBRACE379=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_interfaceDecl5713); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 67, interfaceDecl_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "interfaceDecl"


    public static class interfaceBody_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "interfaceBody"
    // Haxe.g:425:1: interfaceBody : ( varDecl interfaceBody | funcProtoDecl interfaceBody |);
    public final HaxeParser.interfaceBody_return interfaceBody() throws RecognitionException {
        HaxeParser.interfaceBody_return retval = new HaxeParser.interfaceBody_return();
        retval.start = input.LT(1);

        int interfaceBody_StartIndex = input.index();

        Object root_0 = null;

        HaxeParser.varDecl_return varDecl380 =null;

        HaxeParser.interfaceBody_return interfaceBody381 =null;

        HaxeParser.funcProtoDecl_return funcProtoDecl382 =null;

        HaxeParser.interfaceBody_return interfaceBody383 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 68) ) { return retval; }

            // Haxe.g:426:5: ( varDecl interfaceBody | funcProtoDecl interfaceBody |)
            int alt110=3;
            switch ( input.LA(1) ) {
            case VAR:
                {
                alt110=1;
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
                alt110=2;
                }
                break;
            case EOF:
            case RBRACE:
                {
                alt110=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 110, 0, input);

                throw nvae;

            }

            switch (alt110) {
                case 1 :
                    // Haxe.g:426:9: varDecl interfaceBody
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_varDecl_in_interfaceBody5737);
                    varDecl380=varDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDecl380.getTree());

                    pushFollow(FOLLOW_interfaceBody_in_interfaceBody5739);
                    interfaceBody381=interfaceBody();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceBody381.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:427:9: funcProtoDecl interfaceBody
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_funcProtoDecl_in_interfaceBody5749);
                    funcProtoDecl382=funcProtoDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, funcProtoDecl382.getTree());

                    pushFollow(FOLLOW_interfaceBody_in_interfaceBody5751);
                    interfaceBody383=interfaceBody();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceBody383.getTree());

                    }
                    break;
                case 3 :
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
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 68, interfaceBody_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "interfaceBody"


    public static class inheritList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "inheritList"
    // Haxe.g:432:1: inheritList : inherit ( COMMA ! inherit )* ;
    public final HaxeParser.inheritList_return inheritList() throws RecognitionException {
        HaxeParser.inheritList_return retval = new HaxeParser.inheritList_return();
        retval.start = input.LT(1);

        int inheritList_StartIndex = input.index();

        Object root_0 = null;

        Token COMMA385=null;
        HaxeParser.inherit_return inherit384 =null;

        HaxeParser.inherit_return inherit386 =null;


        Object COMMA385_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 69) ) { return retval; }

            // Haxe.g:433:5: ( inherit ( COMMA ! inherit )* )
            // Haxe.g:433:10: inherit ( COMMA ! inherit )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_inherit_in_inheritList5785);
            inherit384=inherit();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, inherit384.getTree());

            // Haxe.g:433:18: ( COMMA ! inherit )*
            loop111:
            do {
                int alt111=2;
                int LA111_0 = input.LA(1);

                if ( (LA111_0==COMMA) ) {
                    alt111=1;
                }


                switch (alt111) {
            	case 1 :
            	    // Haxe.g:433:19: COMMA ! inherit
            	    {
            	    COMMA385=(Token)match(input,COMMA,FOLLOW_COMMA_in_inheritList5788); if (state.failed) return retval;

            	    pushFollow(FOLLOW_inherit_in_inheritList5791);
            	    inherit386=inherit();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, inherit386.getTree());

            	    }
            	    break;

            	default :
            	    break loop111;
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
            if ( state.backtracking>0 ) { memoize(input, 69, inheritList_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "inheritList"


    public static class inheritListOpt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "inheritListOpt"
    // Haxe.g:436:1: inheritListOpt : ( inheritList -> ^( INHERIT_LIST_OPT[\"INHERIT_LIST_OPT\"] ( inheritList )? ) |);
    public final HaxeParser.inheritListOpt_return inheritListOpt() throws RecognitionException {
        HaxeParser.inheritListOpt_return retval = new HaxeParser.inheritListOpt_return();
        retval.start = input.LT(1);

        int inheritListOpt_StartIndex = input.index();

        Object root_0 = null;

        HaxeParser.inheritList_return inheritList387 =null;


        RewriteRuleSubtreeStream stream_inheritList=new RewriteRuleSubtreeStream(adaptor,"rule inheritList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 70) ) { return retval; }

            // Haxe.g:437:5: ( inheritList -> ^( INHERIT_LIST_OPT[\"INHERIT_LIST_OPT\"] ( inheritList )? ) |)
            int alt112=2;
            int LA112_0 = input.LA(1);

            if ( (LA112_0==EXTENDS||LA112_0==IMPLEMENTS) ) {
                alt112=1;
            }
            else if ( (LA112_0==LBRACE) ) {
                alt112=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 112, 0, input);

                throw nvae;

            }
            switch (alt112) {
                case 1 :
                    // Haxe.g:437:10: inheritList
                    {
                    pushFollow(FOLLOW_inheritList_in_inheritListOpt5821);
                    inheritList387=inheritList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_inheritList.add(inheritList387.getTree());

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
                    // 437:22: -> ^( INHERIT_LIST_OPT[\"INHERIT_LIST_OPT\"] ( inheritList )? )
                    {
                        // Haxe.g:437:25: ^( INHERIT_LIST_OPT[\"INHERIT_LIST_OPT\"] ( inheritList )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        new HaxeTree(INHERIT_LIST_OPT, "INHERIT_LIST_OPT")
                        , root_1);

                        // Haxe.g:437:74: ( inheritList )?
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
                    // Haxe.g:439:5: 
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
            if ( state.backtracking>0 ) { memoize(input, 70, inheritListOpt_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "inheritListOpt"


    public static class inherit_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "inherit"
    // Haxe.g:441:1: inherit : ( EXTENDS type -> ^( EXTENDS ( type )? ) | IMPLEMENTS type -> ^( IMPLEMENTS ( type )? ) );
    public final HaxeParser.inherit_return inherit() throws RecognitionException {
        HaxeParser.inherit_return retval = new HaxeParser.inherit_return();
        retval.start = input.LT(1);

        int inherit_StartIndex = input.index();

        Object root_0 = null;

        Token EXTENDS388=null;
        Token IMPLEMENTS390=null;
        HaxeParser.type_return type389 =null;

        HaxeParser.type_return type391 =null;


        Object EXTENDS388_tree=null;
        Object IMPLEMENTS390_tree=null;
        RewriteRuleTokenStream stream_IMPLEMENTS=new RewriteRuleTokenStream(adaptor,"token IMPLEMENTS");
        RewriteRuleTokenStream stream_EXTENDS=new RewriteRuleTokenStream(adaptor,"token EXTENDS");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 71) ) { return retval; }

            // Haxe.g:441:12: ( EXTENDS type -> ^( EXTENDS ( type )? ) | IMPLEMENTS type -> ^( IMPLEMENTS ( type )? ) )
            int alt113=2;
            int LA113_0 = input.LA(1);

            if ( (LA113_0==EXTENDS) ) {
                alt113=1;
            }
            else if ( (LA113_0==IMPLEMENTS) ) {
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
                    // Haxe.g:441:17: EXTENDS type
                    {
                    EXTENDS388=(Token)match(input,EXTENDS,FOLLOW_EXTENDS_in_inherit5867); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EXTENDS.add(EXTENDS388);


                    pushFollow(FOLLOW_type_in_inherit5869);
                    type389=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type389.getTree());

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
                    // 441:34: -> ^( EXTENDS ( type )? )
                    {
                        // Haxe.g:441:37: ^( EXTENDS ( type )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_EXTENDS.nextNode()
                        , root_1);

                        // Haxe.g:441:47: ( type )?
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
                    // Haxe.g:442:14: IMPLEMENTS type
                    {
                    IMPLEMENTS390=(Token)match(input,IMPLEMENTS,FOLLOW_IMPLEMENTS_in_inherit5897); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IMPLEMENTS.add(IMPLEMENTS390);


                    pushFollow(FOLLOW_type_in_inherit5899);
                    type391=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type391.getTree());

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
                    // 442:30: -> ^( IMPLEMENTS ( type )? )
                    {
                        // Haxe.g:442:33: ^( IMPLEMENTS ( type )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_IMPLEMENTS.nextNode()
                        , root_1);

                        // Haxe.g:442:46: ( type )?
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
            if ( state.backtracking>0 ) { memoize(input, 71, inherit_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "inherit"


    public static class typedefDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "typedefDecl"
    // Haxe.g:445:1: typedefDecl : TYPEDEF IDENTIFIER EQ funcType ;
    public final HaxeParser.typedefDecl_return typedefDecl() throws RecognitionException {
        HaxeParser.typedefDecl_return retval = new HaxeParser.typedefDecl_return();
        retval.start = input.LT(1);

        int typedefDecl_StartIndex = input.index();

        Object root_0 = null;

        Token TYPEDEF392=null;
        Token IDENTIFIER393=null;
        Token EQ394=null;
        HaxeParser.funcType_return funcType395 =null;


        Object TYPEDEF392_tree=null;
        Object IDENTIFIER393_tree=null;
        Object EQ394_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 72) ) { return retval; }

            // Haxe.g:446:5: ( TYPEDEF IDENTIFIER EQ funcType )
            // Haxe.g:446:10: TYPEDEF IDENTIFIER EQ funcType
            {
            root_0 = (Object)adaptor.nil();


            TYPEDEF392=(Token)match(input,TYPEDEF,FOLLOW_TYPEDEF_in_typedefDecl5939); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TYPEDEF392_tree = 
            (Object)adaptor.create(TYPEDEF392)
            ;
            adaptor.addChild(root_0, TYPEDEF392_tree);
            }

            IDENTIFIER393=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_typedefDecl5941); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER393_tree = 
            (Object)adaptor.create(IDENTIFIER393)
            ;
            adaptor.addChild(root_0, IDENTIFIER393_tree);
            }

            EQ394=(Token)match(input,EQ,FOLLOW_EQ_in_typedefDecl5943); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            EQ394_tree = 
            (Object)adaptor.create(EQ394)
            ;
            adaptor.addChild(root_0, EQ394_tree);
            }

            pushFollow(FOLLOW_funcType_in_typedefDecl5945);
            funcType395=funcType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, funcType395.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 72, typedefDecl_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "typedefDecl"


    public static class typeExtend_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "typeExtend"
    // Haxe.g:449:1: typeExtend : GT ^ funcType COMMA !;
    public final HaxeParser.typeExtend_return typeExtend() throws RecognitionException {
        HaxeParser.typeExtend_return retval = new HaxeParser.typeExtend_return();
        retval.start = input.LT(1);

        int typeExtend_StartIndex = input.index();

        Object root_0 = null;

        Token GT396=null;
        Token COMMA398=null;
        HaxeParser.funcType_return funcType397 =null;


        Object GT396_tree=null;
        Object COMMA398_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 73) ) { return retval; }

            // Haxe.g:449:17: ( GT ^ funcType COMMA !)
            // Haxe.g:449:19: GT ^ funcType COMMA !
            {
            root_0 = (Object)adaptor.nil();


            GT396=(Token)match(input,GT,FOLLOW_GT_in_typeExtend5967); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            GT396_tree = 
            (Object)adaptor.create(GT396)
            ;
            root_0 = (Object)adaptor.becomeRoot(GT396_tree, root_0);
            }

            pushFollow(FOLLOW_funcType_in_typeExtend5970);
            funcType397=funcType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, funcType397.getTree());

            COMMA398=(Token)match(input,COMMA,FOLLOW_COMMA_in_typeExtend5972); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 73, typeExtend_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "typeExtend"


    public static class anonType_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "anonType"
    // Haxe.g:452:1: anonType : LBRACE ! ( anonTypeFieldList | varDeclList | typeExtend ( anonTypeFieldList | varDeclList )? )? RBRACE !;
    public final HaxeParser.anonType_return anonType() throws RecognitionException {
        HaxeParser.anonType_return retval = new HaxeParser.anonType_return();
        retval.start = input.LT(1);

        int anonType_StartIndex = input.index();

        Object root_0 = null;

        Token LBRACE399=null;
        Token RBRACE405=null;
        HaxeParser.anonTypeFieldList_return anonTypeFieldList400 =null;

        HaxeParser.varDeclList_return varDeclList401 =null;

        HaxeParser.typeExtend_return typeExtend402 =null;

        HaxeParser.anonTypeFieldList_return anonTypeFieldList403 =null;

        HaxeParser.varDeclList_return varDeclList404 =null;


        Object LBRACE399_tree=null;
        Object RBRACE405_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 74) ) { return retval; }

            // Haxe.g:452:17: ( LBRACE ! ( anonTypeFieldList | varDeclList | typeExtend ( anonTypeFieldList | varDeclList )? )? RBRACE !)
            // Haxe.g:452:19: LBRACE ! ( anonTypeFieldList | varDeclList | typeExtend ( anonTypeFieldList | varDeclList )? )? RBRACE !
            {
            root_0 = (Object)adaptor.nil();


            LBRACE399=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_anonType6009); if (state.failed) return retval;

            // Haxe.g:453:21: ( anonTypeFieldList | varDeclList | typeExtend ( anonTypeFieldList | varDeclList )? )?
            int alt115=4;
            switch ( input.LA(1) ) {
                case IDENTIFIER:
                    {
                    alt115=1;
                    }
                    break;
                case VAR:
                    {
                    alt115=2;
                    }
                    break;
                case GT:
                    {
                    alt115=3;
                    }
                    break;
            }

            switch (alt115) {
                case 1 :
                    // Haxe.g:454:23: anonTypeFieldList
                    {
                    pushFollow(FOLLOW_anonTypeFieldList_in_anonType6057);
                    anonTypeFieldList400=anonTypeFieldList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, anonTypeFieldList400.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:455:23: varDeclList
                    {
                    pushFollow(FOLLOW_varDeclList_in_anonType6082);
                    varDeclList401=varDeclList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclList401.getTree());

                    }
                    break;
                case 3 :
                    // Haxe.g:456:23: typeExtend ( anonTypeFieldList | varDeclList )?
                    {
                    pushFollow(FOLLOW_typeExtend_in_anonType6107);
                    typeExtend402=typeExtend();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeExtend402.getTree());

                    // Haxe.g:456:34: ( anonTypeFieldList | varDeclList )?
                    int alt114=3;
                    int LA114_0 = input.LA(1);

                    if ( (LA114_0==IDENTIFIER) ) {
                        alt114=1;
                    }
                    else if ( (LA114_0==VAR) ) {
                        alt114=2;
                    }
                    switch (alt114) {
                        case 1 :
                            // Haxe.g:456:36: anonTypeFieldList
                            {
                            pushFollow(FOLLOW_anonTypeFieldList_in_anonType6111);
                            anonTypeFieldList403=anonTypeFieldList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, anonTypeFieldList403.getTree());

                            }
                            break;
                        case 2 :
                            // Haxe.g:456:56: varDeclList
                            {
                            pushFollow(FOLLOW_varDeclList_in_anonType6115);
                            varDeclList404=varDeclList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclList404.getTree());

                            }
                            break;

                    }


                    }
                    break;

            }


            RBRACE405=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_anonType6162); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 74, anonType_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "anonType"


    public static class anonTypeFieldList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "anonTypeFieldList"
    // Haxe.g:461:1: anonTypeFieldList : anonTypeField ( COMMA ! anonTypeField )* ;
    public final HaxeParser.anonTypeFieldList_return anonTypeFieldList() throws RecognitionException {
        HaxeParser.anonTypeFieldList_return retval = new HaxeParser.anonTypeFieldList_return();
        retval.start = input.LT(1);

        int anonTypeFieldList_StartIndex = input.index();

        Object root_0 = null;

        Token COMMA407=null;
        HaxeParser.anonTypeField_return anonTypeField406 =null;

        HaxeParser.anonTypeField_return anonTypeField408 =null;


        Object COMMA407_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 75) ) { return retval; }

            // Haxe.g:462:17: ( anonTypeField ( COMMA ! anonTypeField )* )
            // Haxe.g:462:19: anonTypeField ( COMMA ! anonTypeField )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_anonTypeField_in_anonTypeFieldList6209);
            anonTypeField406=anonTypeField();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, anonTypeField406.getTree());

            // Haxe.g:462:33: ( COMMA ! anonTypeField )*
            loop116:
            do {
                int alt116=2;
                int LA116_0 = input.LA(1);

                if ( (LA116_0==COMMA) ) {
                    alt116=1;
                }


                switch (alt116) {
            	case 1 :
            	    // Haxe.g:462:34: COMMA ! anonTypeField
            	    {
            	    COMMA407=(Token)match(input,COMMA,FOLLOW_COMMA_in_anonTypeFieldList6212); if (state.failed) return retval;

            	    pushFollow(FOLLOW_anonTypeField_in_anonTypeFieldList6215);
            	    anonTypeField408=anonTypeField();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, anonTypeField408.getTree());

            	    }
            	    break;

            	default :
            	    break loop116;
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
            if ( state.backtracking>0 ) { memoize(input, 75, anonTypeFieldList_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "anonTypeFieldList"


    public static class objLit_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "objLit"
    // Haxe.g:465:1: objLit : LBRACE ! objLitElemList RBRACE !;
    public final HaxeParser.objLit_return objLit() throws RecognitionException {
        HaxeParser.objLit_return retval = new HaxeParser.objLit_return();
        retval.start = input.LT(1);

        int objLit_StartIndex = input.index();

        Object root_0 = null;

        Token LBRACE409=null;
        Token RBRACE411=null;
        HaxeParser.objLitElemList_return objLitElemList410 =null;


        Object LBRACE409_tree=null;
        Object RBRACE411_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 76) ) { return retval; }

            // Haxe.g:465:17: ( LBRACE ! objLitElemList RBRACE !)
            // Haxe.g:465:19: LBRACE ! objLitElemList RBRACE !
            {
            root_0 = (Object)adaptor.nil();


            LBRACE409=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_objLit6251); if (state.failed) return retval;

            pushFollow(FOLLOW_objLitElemList_in_objLit6254);
            objLitElemList410=objLitElemList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, objLitElemList410.getTree());

            RBRACE411=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_objLit6256); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 76, objLit_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "objLit"


    public static class anonTypeField_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "anonTypeField"
    // Haxe.g:468:1: anonTypeField : IDENTIFIER COLON ! funcType ;
    public final HaxeParser.anonTypeField_return anonTypeField() throws RecognitionException {
        HaxeParser.anonTypeField_return retval = new HaxeParser.anonTypeField_return();
        retval.start = input.LT(1);

        int anonTypeField_StartIndex = input.index();

        Object root_0 = null;

        Token IDENTIFIER412=null;
        Token COLON413=null;
        HaxeParser.funcType_return funcType414 =null;


        Object IDENTIFIER412_tree=null;
        Object COLON413_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 77) ) { return retval; }

            // Haxe.g:468:17: ( IDENTIFIER COLON ! funcType )
            // Haxe.g:468:19: IDENTIFIER COLON ! funcType
            {
            root_0 = (Object)adaptor.nil();


            IDENTIFIER412=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_anonTypeField6284); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER412_tree = 
            (Object)adaptor.create(IDENTIFIER412)
            ;
            adaptor.addChild(root_0, IDENTIFIER412_tree);
            }

            COLON413=(Token)match(input,COLON,FOLLOW_COLON_in_anonTypeField6286); if (state.failed) return retval;

            pushFollow(FOLLOW_funcType_in_anonTypeField6289);
            funcType414=funcType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, funcType414.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 77, anonTypeField_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "anonTypeField"


    public static class objLitElemList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "objLitElemList"
    // Haxe.g:471:1: objLitElemList : objLitElem ( COMMA ! objLitElem )* ;
    public final HaxeParser.objLitElemList_return objLitElemList() throws RecognitionException {
        HaxeParser.objLitElemList_return retval = new HaxeParser.objLitElemList_return();
        retval.start = input.LT(1);

        int objLitElemList_StartIndex = input.index();

        Object root_0 = null;

        Token COMMA416=null;
        HaxeParser.objLitElem_return objLitElem415 =null;

        HaxeParser.objLitElem_return objLitElem417 =null;


        Object COMMA416_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 78) ) { return retval; }

            // Haxe.g:471:17: ( objLitElem ( COMMA ! objLitElem )* )
            // Haxe.g:471:19: objLitElem ( COMMA ! objLitElem )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_objLitElem_in_objLitElemList6319);
            objLitElem415=objLitElem();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, objLitElem415.getTree());

            // Haxe.g:471:30: ( COMMA ! objLitElem )*
            loop117:
            do {
                int alt117=2;
                int LA117_0 = input.LA(1);

                if ( (LA117_0==COMMA) ) {
                    alt117=1;
                }


                switch (alt117) {
            	case 1 :
            	    // Haxe.g:471:31: COMMA ! objLitElem
            	    {
            	    COMMA416=(Token)match(input,COMMA,FOLLOW_COMMA_in_objLitElemList6322); if (state.failed) return retval;

            	    pushFollow(FOLLOW_objLitElem_in_objLitElemList6325);
            	    objLitElem417=objLitElem();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, objLitElem417.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 78, objLitElemList_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "objLitElemList"


    public static class objLitElem_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "objLitElem"
    // Haxe.g:474:1: objLitElem : IDENTIFIER COLON ! expr ;
    public final HaxeParser.objLitElem_return objLitElem() throws RecognitionException {
        HaxeParser.objLitElem_return retval = new HaxeParser.objLitElem_return();
        retval.start = input.LT(1);

        int objLitElem_StartIndex = input.index();

        Object root_0 = null;

        Token IDENTIFIER418=null;
        Token COLON419=null;
        HaxeParser.expr_return expr420 =null;


        Object IDENTIFIER418_tree=null;
        Object COLON419_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 79) ) { return retval; }

            // Haxe.g:474:17: ( IDENTIFIER COLON ! expr )
            // Haxe.g:474:19: IDENTIFIER COLON ! expr
            {
            root_0 = (Object)adaptor.nil();


            IDENTIFIER418=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_objLitElem6361); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER418_tree = 
            (Object)adaptor.create(IDENTIFIER418)
            ;
            adaptor.addChild(root_0, IDENTIFIER418_tree);
            }

            COLON419=(Token)match(input,COLON,FOLLOW_COLON_in_objLitElem6363); if (state.failed) return retval;

            pushFollow(FOLLOW_expr_in_objLitElem6366);
            expr420=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr420.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 79, objLitElem_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "objLitElem"


    public static class elementarySymbol_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "elementarySymbol"
    // Haxe.g:478:1: elementarySymbol : ( LONGLITERAL -> LONGLITERAL[$LONGLITERAL, \"INT\"] | NULL -> NULL[$NULL,\"Unknown<0>\"] | INTLITERAL -> INTLITERAL[$INTLITERAL, \"INT\"] | STRINGLITERAL -> STRINGLITERAL[$STRINGLITERAL,\"STRING\"] | CHARLITERAL -> CHARLITERAL[$CHARLITERAL, \"STRING\"] | FLOATNUM -> FLOATNUM[$FLOATNUM, \"FLOAT\"] | TRUE -> TRUE[$TRUE,\"BOOL\"] | FALSE -> FALSE[$FALSE,\"BOOL\"] );
    public final HaxeParser.elementarySymbol_return elementarySymbol() throws RecognitionException {
        HaxeParser.elementarySymbol_return retval = new HaxeParser.elementarySymbol_return();
        retval.start = input.LT(1);

        int elementarySymbol_StartIndex = input.index();

        Object root_0 = null;

        Token LONGLITERAL421=null;
        Token NULL422=null;
        Token INTLITERAL423=null;
        Token STRINGLITERAL424=null;
        Token CHARLITERAL425=null;
        Token FLOATNUM426=null;
        Token TRUE427=null;
        Token FALSE428=null;

        Object LONGLITERAL421_tree=null;
        Object NULL422_tree=null;
        Object INTLITERAL423_tree=null;
        Object STRINGLITERAL424_tree=null;
        Object CHARLITERAL425_tree=null;
        Object FLOATNUM426_tree=null;
        Object TRUE427_tree=null;
        Object FALSE428_tree=null;
        RewriteRuleTokenStream stream_INTLITERAL=new RewriteRuleTokenStream(adaptor,"token INTLITERAL");
        RewriteRuleTokenStream stream_FALSE=new RewriteRuleTokenStream(adaptor,"token FALSE");
        RewriteRuleTokenStream stream_TRUE=new RewriteRuleTokenStream(adaptor,"token TRUE");
        RewriteRuleTokenStream stream_FLOATNUM=new RewriteRuleTokenStream(adaptor,"token FLOATNUM");
        RewriteRuleTokenStream stream_STRINGLITERAL=new RewriteRuleTokenStream(adaptor,"token STRINGLITERAL");
        RewriteRuleTokenStream stream_NULL=new RewriteRuleTokenStream(adaptor,"token NULL");
        RewriteRuleTokenStream stream_CHARLITERAL=new RewriteRuleTokenStream(adaptor,"token CHARLITERAL");
        RewriteRuleTokenStream stream_LONGLITERAL=new RewriteRuleTokenStream(adaptor,"token LONGLITERAL");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 80) ) { return retval; }

            // Haxe.g:479:5: ( LONGLITERAL -> LONGLITERAL[$LONGLITERAL, \"INT\"] | NULL -> NULL[$NULL,\"Unknown<0>\"] | INTLITERAL -> INTLITERAL[$INTLITERAL, \"INT\"] | STRINGLITERAL -> STRINGLITERAL[$STRINGLITERAL,\"STRING\"] | CHARLITERAL -> CHARLITERAL[$CHARLITERAL, \"STRING\"] | FLOATNUM -> FLOATNUM[$FLOATNUM, \"FLOAT\"] | TRUE -> TRUE[$TRUE,\"BOOL\"] | FALSE -> FALSE[$FALSE,\"BOOL\"] )
            int alt118=8;
            switch ( input.LA(1) ) {
            case LONGLITERAL:
                {
                alt118=1;
                }
                break;
            case NULL:
                {
                alt118=2;
                }
                break;
            case INTLITERAL:
                {
                alt118=3;
                }
                break;
            case STRINGLITERAL:
                {
                alt118=4;
                }
                break;
            case CHARLITERAL:
                {
                alt118=5;
                }
                break;
            case FLOATNUM:
                {
                alt118=6;
                }
                break;
            case TRUE:
                {
                alt118=7;
                }
                break;
            case FALSE:
                {
                alt118=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 118, 0, input);

                throw nvae;

            }

            switch (alt118) {
                case 1 :
                    // Haxe.g:479:7: LONGLITERAL
                    {
                    LONGLITERAL421=(Token)match(input,LONGLITERAL,FOLLOW_LONGLITERAL_in_elementarySymbol6400); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LONGLITERAL.add(LONGLITERAL421);


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
                    // 479:21: -> LONGLITERAL[$LONGLITERAL, \"INT\"]
                    {
                        adaptor.addChild(root_0, 
                        new ConstantNode(LONGLITERAL, LONGLITERAL421, "INT")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // Haxe.g:480:7: NULL
                    {
                    NULL422=(Token)match(input,NULL,FOLLOW_NULL_in_elementarySymbol6418); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NULL.add(NULL422);


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
                    // 480:21: -> NULL[$NULL,\"Unknown<0>\"]
                    {
                        adaptor.addChild(root_0, 
                        new ConstantNode(NULL, NULL422, "Unknown<0>")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 3 :
                    // Haxe.g:481:7: INTLITERAL
                    {
                    INTLITERAL423=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_elementarySymbol6443); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INTLITERAL.add(INTLITERAL423);


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
                    // 481:21: -> INTLITERAL[$INTLITERAL, \"INT\"]
                    {
                        adaptor.addChild(root_0, 
                        new ConstantNode(INTLITERAL, INTLITERAL423, "INT")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 4 :
                    // Haxe.g:482:7: STRINGLITERAL
                    {
                    STRINGLITERAL424=(Token)match(input,STRINGLITERAL,FOLLOW_STRINGLITERAL_in_elementarySymbol6462); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STRINGLITERAL.add(STRINGLITERAL424);


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
                    // 482:21: -> STRINGLITERAL[$STRINGLITERAL,\"STRING\"]
                    {
                        adaptor.addChild(root_0, 
                        new ConstantNode(STRINGLITERAL, STRINGLITERAL424, "STRING")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 5 :
                    // Haxe.g:483:7: CHARLITERAL
                    {
                    CHARLITERAL425=(Token)match(input,CHARLITERAL,FOLLOW_CHARLITERAL_in_elementarySymbol6478); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CHARLITERAL.add(CHARLITERAL425);


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
                    // 483:21: -> CHARLITERAL[$CHARLITERAL, \"STRING\"]
                    {
                        adaptor.addChild(root_0, 
                        new ConstantNode(CHARLITERAL, CHARLITERAL425, "STRING")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 6 :
                    // Haxe.g:484:7: FLOATNUM
                    {
                    FLOATNUM426=(Token)match(input,FLOATNUM,FOLLOW_FLOATNUM_in_elementarySymbol6496); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FLOATNUM.add(FLOATNUM426);


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
                    // 484:21: -> FLOATNUM[$FLOATNUM, \"FLOAT\"]
                    {
                        adaptor.addChild(root_0, 
                        new ConstantNode(FLOATNUM, FLOATNUM426, "FLOAT")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 7 :
                    // Haxe.g:485:7: TRUE
                    {
                    TRUE427=(Token)match(input,TRUE,FOLLOW_TRUE_in_elementarySymbol6517); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TRUE.add(TRUE427);


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
                    // 485:21: -> TRUE[$TRUE,\"BOOL\"]
                    {
                        adaptor.addChild(root_0, 
                        new ConstantNode(TRUE, TRUE427, "BOOL")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 8 :
                    // Haxe.g:486:7: FALSE
                    {
                    FALSE428=(Token)match(input,FALSE,FOLLOW_FALSE_in_elementarySymbol6542); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FALSE.add(FALSE428);


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
                    // 486:21: -> FALSE[$FALSE,\"BOOL\"]
                    {
                        adaptor.addChild(root_0, 
                        new ConstantNode(FALSE, FALSE428, "BOOL")
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
            if ( state.backtracking>0 ) { memoize(input, 80, elementarySymbol_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "elementarySymbol"

    // $ANTLR start synpred49_Haxe
    public final void synpred49_Haxe_fragment() throws RecognitionException {
        // Haxe.g:191:59: ( typeParam )
        // Haxe.g:191:59: typeParam
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
        // Haxe.g:191:14: ( ( anonType | IDENTIFIER | primitiveType ) ( typeParam )* )
        // Haxe.g:191:14: ( anonType | IDENTIFIER | primitiveType ) ( typeParam )*
        {
        // Haxe.g:191:14: ( anonType | IDENTIFIER | primitiveType )
        int alt121=3;
        switch ( input.LA(1) ) {
        case LBRACE:
            {
            alt121=1;
            }
            break;
        case IDENTIFIER:
            {
            alt121=2;
            }
            break;
        case BOOLEAN:
        case DYNAMIC:
        case FLOAT:
        case INT:
        case VOID:
            {
            alt121=3;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 121, 0, input);

            throw nvae;

        }

        switch (alt121) {
            case 1 :
                // Haxe.g:191:15: anonType
                {
                pushFollow(FOLLOW_anonType_in_synpred50_Haxe1698);
                anonType();

                state._fsp--;
                if (state.failed) return ;

                }
                break;
            case 2 :
                // Haxe.g:191:27: IDENTIFIER
                {
                match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_synpred50_Haxe1703); if (state.failed) return ;

                }
                break;
            case 3 :
                // Haxe.g:191:41: primitiveType
                {
                pushFollow(FOLLOW_primitiveType_in_synpred50_Haxe1708);
                primitiveType();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        // Haxe.g:191:58: ( typeParam )*
        loop122:
        do {
            int alt122=2;
            int LA122_0 = input.LA(1);

            if ( (LA122_0==LT) ) {
                alt122=1;
            }


            switch (alt122) {
        	case 1 :
        	    // Haxe.g:191:59: typeParam
        	    {
        	    pushFollow(FOLLOW_typeParam_in_synpred50_Haxe1714);
        	    typeParam();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop122;
            }
        } while (true);


        }

    }
    // $ANTLR end synpred50_Haxe

    // $ANTLR start synpred52_Haxe
    public final void synpred52_Haxe_fragment() throws RecognitionException {
        // Haxe.g:199:10: ( typeParam )
        // Haxe.g:199:10: typeParam
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
        // Haxe.g:213:10: ( block )
        // Haxe.g:213:10: block
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
        // Haxe.g:214:11: ( assignExpr )
        // Haxe.g:214:11: assignExpr
        {
        pushFollow(FOLLOW_assignExpr_in_synpred57_Haxe1998);
        assignExpr();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred57_Haxe

    // $ANTLR start synpred58_Haxe
    public final void synpred58_Haxe_fragment() throws RecognitionException {
        // Haxe.g:214:10: ( ( assignExpr | expr ) SEMI )
        // Haxe.g:214:10: ( assignExpr | expr ) SEMI
        {
        // Haxe.g:214:10: ( assignExpr | expr )
        int alt123=2;
        switch ( input.LA(1) ) {
        case SUB:
            {
            int LA123_1 = input.LA(2);

            if ( (synpred57_Haxe()) ) {
                alt123=1;
            }
            else if ( (true) ) {
                alt123=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 123, 1, input);

                throw nvae;

            }
            }
            break;
        case SUBSUB:
            {
            int LA123_2 = input.LA(2);

            if ( (synpred57_Haxe()) ) {
                alt123=1;
            }
            else if ( (true) ) {
                alt123=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 123, 2, input);

                throw nvae;

            }
            }
            break;
        case PLUSPLUS:
            {
            int LA123_3 = input.LA(2);

            if ( (synpred57_Haxe()) ) {
                alt123=1;
            }
            else if ( (true) ) {
                alt123=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 123, 3, input);

                throw nvae;

            }
            }
            break;
        case BANG:
            {
            int LA123_4 = input.LA(2);

            if ( (synpred57_Haxe()) ) {
                alt123=1;
            }
            else if ( (true) ) {
                alt123=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 123, 4, input);

                throw nvae;

            }
            }
            break;
        case TILDE:
            {
            int LA123_5 = input.LA(2);

            if ( (synpred57_Haxe()) ) {
                alt123=1;
            }
            else if ( (true) ) {
                alt123=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 123, 5, input);

                throw nvae;

            }
            }
            break;
        case NEW:
            {
            int LA123_6 = input.LA(2);

            if ( (synpred57_Haxe()) ) {
                alt123=1;
            }
            else if ( (true) ) {
                alt123=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 123, 6, input);

                throw nvae;

            }
            }
            break;
        case CAST:
            {
            int LA123_7 = input.LA(2);

            if ( (synpred57_Haxe()) ) {
                alt123=1;
            }
            else if ( (true) ) {
                alt123=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 123, 7, input);

                throw nvae;

            }
            }
            break;
        case LBRACE:
            {
            int LA123_8 = input.LA(2);

            if ( (synpred57_Haxe()) ) {
                alt123=1;
            }
            else if ( (true) ) {
                alt123=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 123, 8, input);

                throw nvae;

            }
            }
            break;
        case FUNCTION:
            {
            int LA123_9 = input.LA(2);

            if ( (synpred57_Haxe()) ) {
                alt123=1;
            }
            else if ( (true) ) {
                alt123=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 123, 9, input);

                throw nvae;

            }
            }
            break;
        case LBRACKET:
            {
            int LA123_10 = input.LA(2);

            if ( (synpred57_Haxe()) ) {
                alt123=1;
            }
            else if ( (true) ) {
                alt123=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 123, 10, input);

                throw nvae;

            }
            }
            break;
        case LONGLITERAL:
            {
            int LA123_11 = input.LA(2);

            if ( (synpred57_Haxe()) ) {
                alt123=1;
            }
            else if ( (true) ) {
                alt123=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 123, 11, input);

                throw nvae;

            }
            }
            break;
        case NULL:
            {
            int LA123_12 = input.LA(2);

            if ( (synpred57_Haxe()) ) {
                alt123=1;
            }
            else if ( (true) ) {
                alt123=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 123, 12, input);

                throw nvae;

            }
            }
            break;
        case INTLITERAL:
            {
            int LA123_13 = input.LA(2);

            if ( (synpred57_Haxe()) ) {
                alt123=1;
            }
            else if ( (true) ) {
                alt123=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 123, 13, input);

                throw nvae;

            }
            }
            break;
        case STRINGLITERAL:
            {
            int LA123_14 = input.LA(2);

            if ( (synpred57_Haxe()) ) {
                alt123=1;
            }
            else if ( (true) ) {
                alt123=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 123, 14, input);

                throw nvae;

            }
            }
            break;
        case CHARLITERAL:
            {
            int LA123_15 = input.LA(2);

            if ( (synpred57_Haxe()) ) {
                alt123=1;
            }
            else if ( (true) ) {
                alt123=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 123, 15, input);

                throw nvae;

            }
            }
            break;
        case FLOATNUM:
            {
            int LA123_16 = input.LA(2);

            if ( (synpred57_Haxe()) ) {
                alt123=1;
            }
            else if ( (true) ) {
                alt123=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 123, 16, input);

                throw nvae;

            }
            }
            break;
        case TRUE:
            {
            int LA123_17 = input.LA(2);

            if ( (synpred57_Haxe()) ) {
                alt123=1;
            }
            else if ( (true) ) {
                alt123=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 123, 17, input);

                throw nvae;

            }
            }
            break;
        case FALSE:
            {
            int LA123_18 = input.LA(2);

            if ( (synpred57_Haxe()) ) {
                alt123=1;
            }
            else if ( (true) ) {
                alt123=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 123, 18, input);

                throw nvae;

            }
            }
            break;
        case LPAREN:
            {
            int LA123_19 = input.LA(2);

            if ( (synpred57_Haxe()) ) {
                alt123=1;
            }
            else if ( (true) ) {
                alt123=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 123, 19, input);

                throw nvae;

            }
            }
            break;
        case IDENTIFIER:
            {
            int LA123_20 = input.LA(2);

            if ( (synpred57_Haxe()) ) {
                alt123=1;
            }
            else if ( (true) ) {
                alt123=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 123, 20, input);

                throw nvae;

            }
            }
            break;
        case THIS:
            {
            int LA123_21 = input.LA(2);

            if ( (synpred57_Haxe()) ) {
                alt123=1;
            }
            else if ( (true) ) {
                alt123=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 123, 21, input);

                throw nvae;

            }
            }
            break;
        case UNTYPED:
            {
            alt123=2;
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
                // Haxe.g:214:11: assignExpr
                {
                pushFollow(FOLLOW_assignExpr_in_synpred58_Haxe1998);
                assignExpr();

                state._fsp--;
                if (state.failed) return ;

                }
                break;
            case 2 :
                // Haxe.g:214:22: expr
                {
                pushFollow(FOLLOW_expr_in_synpred58_Haxe2000);
                expr();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        match(input,SEMI,FOLLOW_SEMI_in_synpred58_Haxe2003); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred58_Haxe

    // $ANTLR start synpred60_Haxe
    public final void synpred60_Haxe_fragment() throws RecognitionException {
        // Haxe.g:216:56: ( ELSE statement )
        // Haxe.g:216:56: ELSE statement
        {
        match(input,ELSE,FOLLOW_ELSE_in_synpred60_Haxe2046); if (state.failed) return ;

        pushFollow(FOLLOW_statement_in_synpred60_Haxe2049);
        statement();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred60_Haxe

    // $ANTLR start synpred74_Haxe
    public final void synpred74_Haxe_fragment() throws RecognitionException {
        // Haxe.g:225:8: ( IDENTIFIER COLON statement )
        // Haxe.g:225:8: IDENTIFIER COLON statement
        {
        match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_synpred74_Haxe2334); if (state.failed) return ;

        match(input,COLON,FOLLOW_COLON_in_synpred74_Haxe2336); if (state.failed) return ;

        pushFollow(FOLLOW_statement_in_synpred74_Haxe2338);
        statement();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred74_Haxe

    // $ANTLR start synpred77_Haxe
    public final void synpred77_Haxe_fragment() throws RecognitionException {
        // Haxe.g:238:10: ( varDecl )
        // Haxe.g:238:10: varDecl
        {
        pushFollow(FOLLOW_varDecl_in_synpred77_Haxe2504);
        varDecl();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred77_Haxe

    // $ANTLR start synpred120_Haxe
    public final void synpred120_Haxe_fragment() throws RecognitionException {
        // Haxe.g:323:19: ( value ( ( LPAREN ( exprList )? RPAREN ( pureCallOrSlice )? ) | ( LBRACKET expr RBRACKET ( pureCallOrSlice )? ) | ( DOT methodCallOrSlice ) ) )
        // Haxe.g:323:19: value ( ( LPAREN ( exprList )? RPAREN ( pureCallOrSlice )? ) | ( LBRACKET expr RBRACKET ( pureCallOrSlice )? ) | ( DOT methodCallOrSlice ) )
        {
        pushFollow(FOLLOW_value_in_synpred120_Haxe3985);
        value();

        state._fsp--;
        if (state.failed) return ;

        // Haxe.g:323:25: ( ( LPAREN ( exprList )? RPAREN ( pureCallOrSlice )? ) | ( LBRACKET expr RBRACKET ( pureCallOrSlice )? ) | ( DOT methodCallOrSlice ) )
        int alt137=3;
        switch ( input.LA(1) ) {
        case LPAREN:
            {
            alt137=1;
            }
            break;
        case LBRACKET:
            {
            alt137=2;
            }
            break;
        case DOT:
            {
            alt137=3;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 137, 0, input);

            throw nvae;

        }

        switch (alt137) {
            case 1 :
                // Haxe.g:324:15: ( LPAREN ( exprList )? RPAREN ( pureCallOrSlice )? )
                {
                // Haxe.g:324:15: ( LPAREN ( exprList )? RPAREN ( pureCallOrSlice )? )
                // Haxe.g:324:16: LPAREN ( exprList )? RPAREN ( pureCallOrSlice )?
                {
                match(input,LPAREN,FOLLOW_LPAREN_in_synpred120_Haxe4004); if (state.failed) return ;

                // Haxe.g:324:23: ( exprList )?
                int alt134=2;
                int LA134_0 = input.LA(1);

                if ( (LA134_0==BANG||LA134_0==CAST||LA134_0==CHARLITERAL||LA134_0==FALSE||LA134_0==FLOATNUM||LA134_0==FUNCTION||LA134_0==IDENTIFIER||LA134_0==INTLITERAL||(LA134_0 >= LBRACE && LA134_0 <= LBRACKET)||(LA134_0 >= LONGLITERAL && LA134_0 <= LPAREN)||(LA134_0 >= NEW && LA134_0 <= NULL)||LA134_0==PLUSPLUS||(LA134_0 >= STRINGLITERAL && LA134_0 <= SUB)||LA134_0==SUBSUB||LA134_0==THIS||LA134_0==TILDE||LA134_0==TRUE||LA134_0==UNTYPED) ) {
                    alt134=1;
                }
                switch (alt134) {
                    case 1 :
                        // Haxe.g:324:23: exprList
                        {
                        pushFollow(FOLLOW_exprList_in_synpred120_Haxe4006);
                        exprList();

                        state._fsp--;
                        if (state.failed) return ;

                        }
                        break;

                }


                match(input,RPAREN,FOLLOW_RPAREN_in_synpred120_Haxe4009); if (state.failed) return ;

                // Haxe.g:324:40: ( pureCallOrSlice )?
                int alt135=2;
                int LA135_0 = input.LA(1);

                if ( (LA135_0==DOT||LA135_0==LBRACKET||LA135_0==LPAREN) ) {
                    alt135=1;
                }
                switch (alt135) {
                    case 1 :
                        // Haxe.g:324:40: pureCallOrSlice
                        {
                        pushFollow(FOLLOW_pureCallOrSlice_in_synpred120_Haxe4011);
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
                // Haxe.g:326:15: ( LBRACKET expr RBRACKET ( pureCallOrSlice )? )
                {
                // Haxe.g:326:15: ( LBRACKET expr RBRACKET ( pureCallOrSlice )? )
                // Haxe.g:326:16: LBRACKET expr RBRACKET ( pureCallOrSlice )?
                {
                match(input,LBRACKET,FOLLOW_LBRACKET_in_synpred120_Haxe4060); if (state.failed) return ;

                pushFollow(FOLLOW_expr_in_synpred120_Haxe4062);
                expr();

                state._fsp--;
                if (state.failed) return ;

                match(input,RBRACKET,FOLLOW_RBRACKET_in_synpred120_Haxe4064); if (state.failed) return ;

                // Haxe.g:326:39: ( pureCallOrSlice )?
                int alt136=2;
                int LA136_0 = input.LA(1);

                if ( (LA136_0==DOT||LA136_0==LBRACKET||LA136_0==LPAREN) ) {
                    alt136=1;
                }
                switch (alt136) {
                    case 1 :
                        // Haxe.g:326:39: pureCallOrSlice
                        {
                        pushFollow(FOLLOW_pureCallOrSlice_in_synpred120_Haxe4066);
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
                // Haxe.g:328:15: ( DOT methodCallOrSlice )
                {
                // Haxe.g:328:15: ( DOT methodCallOrSlice )
                // Haxe.g:328:16: DOT methodCallOrSlice
                {
                match(input,DOT,FOLLOW_DOT_in_synpred120_Haxe4115); if (state.failed) return ;

                pushFollow(FOLLOW_methodCallOrSlice_in_synpred120_Haxe4117);
                methodCallOrSlice();

                state._fsp--;
                if (state.failed) return ;

                }


                }
                break;

        }


        }

    }
    // $ANTLR end synpred120_Haxe

    // $ANTLR start synpred130_Haxe
    public final void synpred130_Haxe_fragment() throws RecognitionException {
        // Haxe.g:346:18: ( expr )
        // Haxe.g:346:18: expr
        {
        pushFollow(FOLLOW_expr_in_synpred130_Haxe4381);
        expr();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred130_Haxe

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
    public final boolean synpred77_Haxe() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred77_Haxe_fragment(); // can never throw exception
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
    public final boolean synpred74_Haxe() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred74_Haxe_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred60_Haxe() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred60_Haxe_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA84 dfa84 = new DFA84(this);
    protected DFA99 dfa99 = new DFA99(this);
    protected DFA108 dfa108 = new DFA108(this);
    static final String DFA84_eotS =
        "\10\uffff";
    static final String DFA84_eofS =
        "\10\uffff";
    static final String DFA84_minS =
        "\6\45\2\uffff";
    static final String DFA84_maxS =
        "\6\u009f\2\uffff";
    static final String DFA84_acceptS =
        "\6\uffff\1\1\1\2";
    static final String DFA84_specialS =
        "\10\uffff}>";
    static final String[] DFA84_transitionS = {
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

    static final short[] DFA84_eot = DFA.unpackEncodedString(DFA84_eotS);
    static final short[] DFA84_eof = DFA.unpackEncodedString(DFA84_eofS);
    static final char[] DFA84_min = DFA.unpackEncodedStringToUnsignedChars(DFA84_minS);
    static final char[] DFA84_max = DFA.unpackEncodedStringToUnsignedChars(DFA84_maxS);
    static final short[] DFA84_accept = DFA.unpackEncodedString(DFA84_acceptS);
    static final short[] DFA84_special = DFA.unpackEncodedString(DFA84_specialS);
    static final short[][] DFA84_transition;

    static {
        int numStates = DFA84_transitionS.length;
        DFA84_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA84_transition[i] = DFA.unpackEncodedString(DFA84_transitionS[i]);
        }
    }

    class DFA84 extends DFA {

        public DFA84(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 84;
            this.eot = DFA84_eot;
            this.eof = DFA84_eof;
            this.min = DFA84_min;
            this.max = DFA84_max;
            this.accept = DFA84_accept;
            this.special = DFA84_special;
            this.transition = DFA84_transition;
        }
        public String getDescription() {
            return "375:1: classMember : ( varDeclClass | funcDecl );";
        }
    }
    static final String DFA99_eotS =
        "\11\uffff";
    static final String DFA99_eofS =
        "\11\uffff";
    static final String DFA99_minS =
        "\6\45\1\105\2\uffff";
    static final String DFA99_maxS =
        "\6\u0088\1\141\2\uffff";
    static final String DFA99_acceptS =
        "\7\uffff\1\1\1\2";
    static final String DFA99_specialS =
        "\11\uffff}>";
    static final String[] DFA99_transitionS = {
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

    static final short[] DFA99_eot = DFA.unpackEncodedString(DFA99_eotS);
    static final short[] DFA99_eof = DFA.unpackEncodedString(DFA99_eofS);
    static final char[] DFA99_min = DFA.unpackEncodedStringToUnsignedChars(DFA99_minS);
    static final char[] DFA99_max = DFA.unpackEncodedStringToUnsignedChars(DFA99_maxS);
    static final short[] DFA99_accept = DFA.unpackEncodedString(DFA99_acceptS);
    static final short[] DFA99_special = DFA.unpackEncodedString(DFA99_specialS);
    static final short[][] DFA99_transition;

    static {
        int numStates = DFA99_transitionS.length;
        DFA99_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA99_transition[i] = DFA.unpackEncodedString(DFA99_transitionS[i]);
        }
    }

    class DFA99 extends DFA {

        public DFA99(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 99;
            this.eot = DFA99_eot;
            this.eof = DFA99_eof;
            this.min = DFA99_min;
            this.max = DFA99_max;
            this.accept = DFA99_accept;
            this.special = DFA99_special;
            this.transition = DFA99_transition;
        }
        public String getDescription() {
            return "404:1: funcDecl : ( ( declAttrList )? FUNCTION NEW LPAREN ( paramList )? RPAREN ( typeTag )? block -> ^( FUNCTION NEW ( declAttrList )? ( paramList )? ( typeTag )? ( block )? ) | ( declAttrList )? FUNCTION IDENTIFIER typeParamOpt LPAREN ( paramList )? RPAREN ( typeTag )? block -> ^( FUNCTION IDENTIFIER ( declAttrList )? ( paramList )? ( typeTag )? ( block )? ( typeParamOpt )? ) );";
        }
    }
    static final String DFA108_eotS =
        "\14\uffff";
    static final String DFA108_eofS =
        "\14\uffff";
    static final String DFA108_minS =
        "\6\45\2\105\4\uffff";
    static final String DFA108_maxS =
        "\6\u0088\2\141\4\uffff";
    static final String DFA108_acceptS =
        "\10\uffff\1\3\1\4\1\1\1\2";
    static final String DFA108_specialS =
        "\14\uffff}>";
    static final String[] DFA108_transitionS = {
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

    static final short[] DFA108_eot = DFA.unpackEncodedString(DFA108_eotS);
    static final short[] DFA108_eof = DFA.unpackEncodedString(DFA108_eofS);
    static final char[] DFA108_min = DFA.unpackEncodedStringToUnsignedChars(DFA108_minS);
    static final char[] DFA108_max = DFA.unpackEncodedStringToUnsignedChars(DFA108_maxS);
    static final short[] DFA108_accept = DFA.unpackEncodedString(DFA108_acceptS);
    static final short[] DFA108_special = DFA.unpackEncodedString(DFA108_specialS);
    static final short[][] DFA108_transition;

    static {
        int numStates = DFA108_transitionS.length;
        DFA108_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA108_transition[i] = DFA.unpackEncodedString(DFA108_transitionS[i]);
        }
    }

    class DFA108 extends DFA {

        public DFA108(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 108;
            this.eot = DFA108_eot;
            this.eof = DFA108_eof;
            this.min = DFA108_min;
            this.max = DFA108_max;
            this.accept = DFA108_accept;
            this.special = DFA108_special;
            this.transition = DFA108_transition;
        }
        public String getDescription() {
            return "410:1: funcProtoDecl : ( declAttrList FUNCTION NEW LPAREN ( paramList )? RPAREN ( typeTag )? SEMI -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTag )? ( declAttrList )? ) | declAttrList FUNCTION IDENTIFIER typeParamOpt LPAREN ( paramList )? RPAREN ( typeTag )? SEMI -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTag )? ( declAttrList )? ( typeParamOpt )? ) | FUNCTION NEW LPAREN ( paramList )? RPAREN ( typeTag )? SEMI -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTag )? ) | FUNCTION IDENTIFIER typeParamOpt LPAREN ( paramList )? RPAREN ( typeTag )? SEMI -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTag )? ( typeParamOpt )? ) );";
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
    public static final BitSet FOLLOW_assignExpr_in_statement1998 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_statement2000 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_SEMI_in_statement2003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDecl_in_statement2015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_statement2035 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_parExpression_in_statement2041 = new BitSet(new long[]{0x0388000482420200L,0x0000080600D90060L,0x00000008A0D72C05L});
    public static final BitSet FOLLOW_statement_in_statement2043 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_ELSE_in_statement2046 = new BitSet(new long[]{0x0388000482420200L,0x0000080600D90060L,0x00000008A0D72C05L});
    public static final BitSet FOLLOW_statement_in_statement2049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_statement2071 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_LPAREN_in_statement2073 = new BitSet(new long[]{0x0288000002400200L,0x0000080600D90020L,0x0000000020522C00L});
    public static final BitSet FOLLOW_expr_in_statement2077 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_IN_in_statement2079 = new BitSet(new long[]{0x0288000002400200L,0x0000080600D90020L,0x0000000020522C00L});
    public static final BitSet FOLLOW_expr_in_statement2083 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_RPAREN_in_statement2085 = new BitSet(new long[]{0x0388000482420200L,0x0000080600D90060L,0x00000008A0D72C05L});
    public static final BitSet FOLLOW_statement_in_statement2087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_statement2128 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_parExpression_in_statement2134 = new BitSet(new long[]{0x0388000482420200L,0x0000080600D90060L,0x00000008A0D72C05L});
    public static final BitSet FOLLOW_statement_in_statement2136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DO_in_statement2156 = new BitSet(new long[]{0x0388000482420200L,0x0000080600D90060L,0x00000008A0D72C05L});
    public static final BitSet FOLLOW_statement_in_statement2162 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_WHILE_in_statement2164 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_parExpression_in_statement2167 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_SEMI_in_statement2169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRY_in_statement2190 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L,0x0000000000000004L});
    public static final BitSet FOLLOW_block_in_statement2196 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_catchStmt_in_statement2198 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_SWITCH_in_statement2219 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_LPAREN_in_statement2225 = new BitSet(new long[]{0x0288000002400200L,0x0000080600D90020L,0x0000000020522C00L});
    public static final BitSet FOLLOW_expr_in_statement2228 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_RPAREN_in_statement2230 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_LBRACE_in_statement2233 = new BitSet(new long[]{0x0000000200200000L});
    public static final BitSet FOLLOW_caseStmt_in_statement2236 = new BitSet(new long[]{0x0000000200200000L,0x4000000000000000L});
    public static final BitSet FOLLOW_RBRACE_in_statement2239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_statement2260 = new BitSet(new long[]{0x0288000002400200L,0x0000080600D90020L,0x0000000020522C04L});
    public static final BitSet FOLLOW_expr_in_statement2266 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_SEMI_in_statement2269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THROW_in_statement2290 = new BitSet(new long[]{0x0288000002400200L,0x0000080600D90020L,0x0000000020522C00L});
    public static final BitSet FOLLOW_expr_in_statement2293 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_SEMI_in_statement2295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_statement2316 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_SEMI_in_statement2324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_statement2334 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_COLON_in_statement2336 = new BitSet(new long[]{0x0388000482420200L,0x0000080600D90060L,0x00000008A0D72C05L});
    public static final BitSet FOLLOW_statement_in_statement2338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMI_in_statement2377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_parExpression2401 = new BitSet(new long[]{0x0288000002400200L,0x0000080600D90020L,0x0000000020522C00L});
    public static final BitSet FOLLOW_expr_in_parExpression2404 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_RPAREN_in_parExpression2406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_block2430 = new BitSet(new long[]{0x0389000486420200L,0x4200080600D90060L,0x00000008A0D72C05L});
    public static final BitSet FOLLOW_blockStmt_in_block2433 = new BitSet(new long[]{0x0389000486420200L,0x4200080600D90060L,0x00000008A0D72C05L});
    public static final BitSet FOLLOW_RBRACE_in_block2437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMI_in_block2471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDecl_in_blockStmt2504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classDecl_in_blockStmt2515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_blockStmt2526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CASE_in_caseStmt2550 = new BitSet(new long[]{0x0288000002400200L,0x0000080600D90020L,0x0000000020522C00L});
    public static final BitSet FOLLOW_exprList_in_caseStmt2553 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_COLON_in_caseStmt2555 = new BitSet(new long[]{0x0388000482420200L,0x0000080600D90060L,0x00000008A0D72C05L});
    public static final BitSet FOLLOW_statement_in_caseStmt2558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_caseStmt2578 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_COLON_in_caseStmt2581 = new BitSet(new long[]{0x0388000482420200L,0x0000080600D90060L,0x00000008A0D72C05L});
    public static final BitSet FOLLOW_statement_in_caseStmt2584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CATCH_in_catchStmt2620 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_LPAREN_in_catchStmt2626 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000020L});
    public static final BitSet FOLLOW_param_in_catchStmt2629 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_RPAREN_in_catchStmt2631 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L,0x0000000000000004L});
    public static final BitSet FOLLOW_block_in_catchStmt2634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_exprList2656 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_COMMA_in_exprList2659 = new BitSet(new long[]{0x0288000002400200L,0x0000080600D90020L,0x0000000020522C00L});
    public static final BitSet FOLLOW_expr_in_exprList2662 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_UNTYPED_in_expr2704 = new BitSet(new long[]{0x0288000002400200L,0x0000080600D90020L,0x0000000000522C00L});
    public static final BitSet FOLLOW_assignExpr_in_expr2707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignExpr_in_expr2727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iterExpr_in_assignExpr2757 = new BitSet(new long[]{0x4000080000104082L,0x0000050008000001L,0x00000000000010A0L});
    public static final BitSet FOLLOW_assignOp_in_assignExpr2760 = new BitSet(new long[]{0x0288000002400200L,0x0000080600D90020L,0x0000000000522C00L});
    public static final BitSet FOLLOW_iterExpr_in_assignExpr2763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ternaryExpr_in_iterExpr2803 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_ELLIPSIS_in_iterExpr2827 = new BitSet(new long[]{0x0288000002400200L,0x0000080600D90020L,0x0000000000522C00L});
    public static final BitSet FOLLOW_ternaryExpr_in_iterExpr2833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicOrExpr_in_ternaryExpr2864 = new BitSet(new long[]{0x0000000000000002L,0x2000000000000000L});
    public static final BitSet FOLLOW_QUES_in_ternaryExpr2867 = new BitSet(new long[]{0x0288000002400200L,0x0000080600D90020L,0x0000000020522C00L});
    public static final BitSet FOLLOW_expr_in_ternaryExpr2870 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_COLON_in_ternaryExpr2872 = new BitSet(new long[]{0x0288000002400200L,0x0000080600D90020L,0x0000000000522C00L});
    public static final BitSet FOLLOW_ternaryExpr_in_ternaryExpr2875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicAndExpr_in_logicOrExpr2906 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_BARBAR_in_logicOrExpr2909 = new BitSet(new long[]{0x0288000002400200L,0x0000080600D90020L,0x0000000000522C00L});
    public static final BitSet FOLLOW_logicAndExpr_in_logicOrExpr2915 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_cmpExpr_in_logicAndExpr2949 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_AMPAMP_in_logicAndExpr2951 = new BitSet(new long[]{0x0288000002400200L,0x0000080600D90020L,0x0000000000522C00L});
    public static final BitSet FOLLOW_cmpExpr_in_logicAndExpr2957 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_bitExpr_in_cmpExpr2996 = new BitSet(new long[]{0x1800100000000402L,0x0000000003000000L});
    public static final BitSet FOLLOW_EQEQ_in_cmpExpr3023 = new BitSet(new long[]{0x0288000002400200L,0x0000080600D90020L,0x0000000000522C00L});
    public static final BitSet FOLLOW_BANGEQ_in_cmpExpr3052 = new BitSet(new long[]{0x0288000002400200L,0x0000080600D90020L,0x0000000000522C00L});
    public static final BitSet FOLLOW_GTEQ_in_cmpExpr3081 = new BitSet(new long[]{0x0288000002400200L,0x0000080600D90020L,0x0000000000522C00L});
    public static final BitSet FOLLOW_LTEQ_in_cmpExpr3110 = new BitSet(new long[]{0x0288000002400200L,0x0000080600D90020L,0x0000000000522C00L});
    public static final BitSet FOLLOW_GT_in_cmpExpr3139 = new BitSet(new long[]{0x0288000002400200L,0x0000080600D90020L,0x0000000000522C00L});
    public static final BitSet FOLLOW_LT_in_cmpExpr3168 = new BitSet(new long[]{0x0288000002400200L,0x0000080600D90020L,0x0000000000522C00L});
    public static final BitSet FOLLOW_bitExpr_in_cmpExpr3175 = new BitSet(new long[]{0x1800100000000402L,0x0000000003000000L});
    public static final BitSet FOLLOW_shiftExpr_in_bitExpr3214 = new BitSet(new long[]{0x0000000000081022L});
    public static final BitSet FOLLOW_BAR_in_bitExpr3241 = new BitSet(new long[]{0x0288000002400200L,0x0000080600D90020L,0x0000000000522C00L});
    public static final BitSet FOLLOW_AMP_in_bitExpr3270 = new BitSet(new long[]{0x0288000002400200L,0x0000080600D90020L,0x0000000000522C00L});
    public static final BitSet FOLLOW_CARET_in_bitExpr3299 = new BitSet(new long[]{0x0288000002400200L,0x0000080600D90020L,0x0000000000522C00L});
    public static final BitSet FOLLOW_shiftExpr_in_bitExpr3306 = new BitSet(new long[]{0x0000000000081022L});
    public static final BitSet FOLLOW_addExpr_in_shiftExpr3339 = new BitSet(new long[]{0xA000000000000002L,0x0000000004000000L});
    public static final BitSet FOLLOW_LTLT_in_shiftExpr3366 = new BitSet(new long[]{0x0288000002400200L,0x0000080600D90020L,0x0000000000522C00L});
    public static final BitSet FOLLOW_GTGT_in_shiftExpr3395 = new BitSet(new long[]{0x0288000002400200L,0x0000080600D90020L,0x0000000000522C00L});
    public static final BitSet FOLLOW_GTGTGT_in_shiftExpr3424 = new BitSet(new long[]{0x0288000002400200L,0x0000080600D90020L,0x0000000000522C00L});
    public static final BitSet FOLLOW_addExpr_in_shiftExpr3431 = new BitSet(new long[]{0xA000000000000002L,0x0000000004000000L});
    public static final BitSet FOLLOW_multExpr_in_addExpr3466 = new BitSet(new long[]{0x0000000000000002L,0x0000020000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_PLUS_in_addExpr3493 = new BitSet(new long[]{0x0288000002400200L,0x0000080600D90020L,0x0000000000522C00L});
    public static final BitSet FOLLOW_SUB_in_addExpr3522 = new BitSet(new long[]{0x0288000002400200L,0x0000080600D90020L,0x0000000000522C00L});
    public static final BitSet FOLLOW_multExpr_in_addExpr3529 = new BitSet(new long[]{0x0000000000000002L,0x0000020000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_unarExpr_in_multExpr3568 = new BitSet(new long[]{0x0000000000000002L,0x0000008000000000L,0x0000000000000050L});
    public static final BitSet FOLLOW_STAR_in_multExpr3595 = new BitSet(new long[]{0x0288000002400200L,0x0000080600D90020L,0x0000000000522C00L});
    public static final BitSet FOLLOW_SLASH_in_multExpr3624 = new BitSet(new long[]{0x0288000002400200L,0x0000080600D90020L,0x0000000000522C00L});
    public static final BitSet FOLLOW_PERCENT_in_multExpr3653 = new BitSet(new long[]{0x0288000002400200L,0x0000080600D90020L,0x0000000000522C00L});
    public static final BitSet FOLLOW_unarExpr_in_multExpr3660 = new BitSet(new long[]{0x0000000000000002L,0x0000008000000000L,0x0000000000000050L});
    public static final BitSet FOLLOW_SUB_in_unarExpr3708 = new BitSet(new long[]{0x0288000002400000L,0x0000000600D90020L,0x0000000000420400L});
    public static final BitSet FOLLOW_SUBSUB_in_unarExpr3727 = new BitSet(new long[]{0x0288000002400000L,0x0000000600D90020L,0x0000000000420400L});
    public static final BitSet FOLLOW_PLUSPLUS_in_unarExpr3746 = new BitSet(new long[]{0x0288000002400000L,0x0000000600D90020L,0x0000000000420400L});
    public static final BitSet FOLLOW_BANG_in_unarExpr3765 = new BitSet(new long[]{0x0288000002400000L,0x0000000600D90020L,0x0000000000420400L});
    public static final BitSet FOLLOW_TILDE_in_unarExpr3784 = new BitSet(new long[]{0x0288000002400000L,0x0000000600D90020L,0x0000000000420400L});
    public static final BitSet FOLLOW_prefixExpr_in_unarExpr3791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_prefixExpr_in_unarExpr3811 = new BitSet(new long[]{0x0000000000000002L,0x0000080000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_PLUSPLUS_in_unarExpr3814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUBSUB_in_unarExpr3820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEW_in_prefixExpr3862 = new BitSet(new long[]{0x0040002000010000L,0x0000000000884020L,0x0000000200000000L});
    public static final BitSet FOLLOW_type_in_prefixExpr3865 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_LPAREN_in_prefixExpr3867 = new BitSet(new long[]{0x0288000002400200L,0x0000080600D90020L,0x0000000020522C02L});
    public static final BitSet FOLLOW_exprList_in_prefixExpr3870 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_RPAREN_in_prefixExpr3873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CAST_in_prefixExpr3894 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_LPAREN_in_prefixExpr3897 = new BitSet(new long[]{0x0288000002400200L,0x0000080600D90020L,0x0000000020522C00L});
    public static final BitSet FOLLOW_expr_in_prefixExpr3900 = new BitSet(new long[]{0x0000000010000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_prefixExpr3903 = new BitSet(new long[]{0x0040002000010000L,0x0000000020084020L,0x0000000200000000L});
    public static final BitSet FOLLOW_funcType_in_prefixExpr3906 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_RPAREN_in_prefixExpr3910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_methodCallOrSlice_in_prefixExpr3931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_methodCallOrSlice3985 = new BitSet(new long[]{0x0000000800000000L,0x0000000000900000L});
    public static final BitSet FOLLOW_LPAREN_in_methodCallOrSlice4004 = new BitSet(new long[]{0x0288000002400200L,0x0000080600D90020L,0x0000000020522C02L});
    public static final BitSet FOLLOW_exprList_in_methodCallOrSlice4006 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_RPAREN_in_methodCallOrSlice4009 = new BitSet(new long[]{0x0000000800000002L,0x0000000000900000L});
    public static final BitSet FOLLOW_pureCallOrSlice_in_methodCallOrSlice4011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACKET_in_methodCallOrSlice4060 = new BitSet(new long[]{0x0288000002400200L,0x0000080600D90020L,0x0000000020522C00L});
    public static final BitSet FOLLOW_expr_in_methodCallOrSlice4062 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_RBRACKET_in_methodCallOrSlice4064 = new BitSet(new long[]{0x0000000800000002L,0x0000000000900000L});
    public static final BitSet FOLLOW_pureCallOrSlice_in_methodCallOrSlice4066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_methodCallOrSlice4115 = new BitSet(new long[]{0x0288000002000000L,0x0000000400D90020L,0x0000000000420400L});
    public static final BitSet FOLLOW_methodCallOrSlice_in_methodCallOrSlice4117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_methodCallOrSlice4159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_pureCallOrSlice4184 = new BitSet(new long[]{0x0288000002400200L,0x0000080600D90020L,0x0000000020522C02L});
    public static final BitSet FOLLOW_exprList_in_pureCallOrSlice4186 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_RPAREN_in_pureCallOrSlice4189 = new BitSet(new long[]{0x0000000800000002L,0x0000000000900000L});
    public static final BitSet FOLLOW_pureCallOrSlice_in_pureCallOrSlice4191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACKET_in_pureCallOrSlice4244 = new BitSet(new long[]{0x0288000002400200L,0x0000080600D90020L,0x0000000020522C00L});
    public static final BitSet FOLLOW_expr_in_pureCallOrSlice4246 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_RBRACKET_in_pureCallOrSlice4248 = new BitSet(new long[]{0x0000000800000002L,0x0000000000900000L});
    public static final BitSet FOLLOW_pureCallOrSlice_in_pureCallOrSlice4250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_pureCallOrSlice4302 = new BitSet(new long[]{0x0288000002000000L,0x0000000400D90020L,0x0000000000420400L});
    public static final BitSet FOLLOW_methodCallOrSlice_in_pureCallOrSlice4305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objLit_in_value4341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcLit_in_value4349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayLit_in_value4357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_elementarySymbol_in_value4367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_value4377 = new BitSet(new long[]{0x0388000482420200L,0x0000080600D90060L,0x00000008A0D72C05L});
    public static final BitSet FOLLOW_expr_in_value4381 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_value4383 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_RPAREN_in_value4386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_value4402 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_typeParamOpt_in_value4404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classDecl_in_topLevelDecl4423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interfaceDecl_in_topLevelDecl4443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumDecl_in_topLevelDecl4463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typedefDecl_in_topLevelDecl4483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_topLevelAccess_in_enumDecl4519 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_ENUM_in_enumDecl4522 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_IDENTIFIER_in_enumDecl4524 = new BitSet(new long[]{0x0000000000000000L,0x0000000001080000L});
    public static final BitSet FOLLOW_typeParamOpt_in_enumDecl4526 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_enumBody_in_enumDecl4528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_enumBody4578 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000020L});
    public static final BitSet FOLLOW_enumValueDecl_in_enumBody4581 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000020L});
    public static final BitSet FOLLOW_RBRACE_in_enumBody4585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_enumValueDecl4625 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_LPAREN_in_enumValueDecl4631 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000020L,0x0000000000000002L});
    public static final BitSet FOLLOW_paramList_in_enumValueDecl4634 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_RPAREN_in_enumValueDecl4637 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_SEMI_in_enumValueDecl4640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_enumValueDecl4663 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_SEMI_in_enumValueDecl4668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_topLevelAccess_in_classDecl4717 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_CLASS_in_classDecl4720 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_IDENTIFIER_in_classDecl4722 = new BitSet(new long[]{0x0000800000000000L,0x0000000001080100L});
    public static final BitSet FOLLOW_typeParamOpt_in_classDecl4724 = new BitSet(new long[]{0x0000800000000000L,0x0000000000080100L});
    public static final BitSet FOLLOW_inheritListOpt_in_classDecl4726 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_classBodyScope_in_classDecl4728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_classBodyScope4775 = new BitSet(new long[]{0x0200002000000000L,0x5200001000001000L,0x0000000080000100L});
    public static final BitSet FOLLOW_classMember_in_classBodyScope4778 = new BitSet(new long[]{0x0200002000000000L,0x5200001000001000L,0x0000000080000100L});
    public static final BitSet FOLLOW_RBRACE_in_classBodyScope4782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDeclClass_in_classMember4828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcDecl_in_classMember4848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDecl_in_varDeclList4891 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_varDeclList_in_varDeclList4893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttrList_in_varDeclClass4921 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_VAR_in_varDeclClass4924 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_IDENTIFIER_in_varDeclClass4926 = new BitSet(new long[]{0x0000080008000000L,0x0000000000800000L,0x0000000000000004L});
    public static final BitSet FOLLOW_propDecl_in_varDeclClass4928 = new BitSet(new long[]{0x0000080008000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_typeTag_in_varDeclClass4931 = new BitSet(new long[]{0x0000080000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_varInit_in_varDeclClass4934 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_SEMI_in_varDeclClass4937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_varDecl5002 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_varDeclPartList_in_varDecl5005 = new BitSet(new long[]{0x0000000010000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_COMMA_in_varDecl5008 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_varDeclPartList_in_varDecl5011 = new BitSet(new long[]{0x0000000010000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_SEMI_in_varDecl5015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_varDeclPartList5036 = new BitSet(new long[]{0x0000080008000002L,0x0000000000800000L});
    public static final BitSet FOLLOW_propDecl_in_varDeclPartList5038 = new BitSet(new long[]{0x0000080008000002L});
    public static final BitSet FOLLOW_typeTag_in_varDeclPartList5041 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_varInit_in_varDeclPartList5044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_propDecl5095 = new BitSet(new long[]{0x0000002200000000L,0x0000000400000020L});
    public static final BitSet FOLLOW_propAccessor_in_propDecl5099 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_COMMA_in_propDecl5101 = new BitSet(new long[]{0x0000002200000000L,0x0000000400000020L});
    public static final BitSet FOLLOW_propAccessor_in_propDecl5105 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_RPAREN_in_propDecl5107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQ_in_varInit5248 = new BitSet(new long[]{0x0288000002400200L,0x0000080600D90020L,0x0000000020522C00L});
    public static final BitSet FOLLOW_expr_in_varInit5250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttrList_in_funcDecl5292 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_FUNCTION_in_funcDecl5295 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_NEW_in_funcDecl5297 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_LPAREN_in_funcDecl5299 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000020L,0x0000000000000002L});
    public static final BitSet FOLLOW_paramList_in_funcDecl5301 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_RPAREN_in_funcDecl5304 = new BitSet(new long[]{0x0000000008000000L,0x0000000000080000L,0x0000000000000004L});
    public static final BitSet FOLLOW_typeTag_in_funcDecl5306 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L,0x0000000000000004L});
    public static final BitSet FOLLOW_block_in_funcDecl5309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttrList_in_funcDecl5364 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_FUNCTION_in_funcDecl5367 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_IDENTIFIER_in_funcDecl5369 = new BitSet(new long[]{0x0000000000000000L,0x0000000001800000L});
    public static final BitSet FOLLOW_typeParamOpt_in_funcDecl5371 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_LPAREN_in_funcDecl5373 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000020L,0x0000000000000002L});
    public static final BitSet FOLLOW_paramList_in_funcDecl5375 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_RPAREN_in_funcDecl5378 = new BitSet(new long[]{0x0000000008000000L,0x0000000000080000L,0x0000000000000004L});
    public static final BitSet FOLLOW_typeTag_in_funcDecl5380 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L,0x0000000000000004L});
    public static final BitSet FOLLOW_block_in_funcDecl5383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttrList_in_funcProtoDecl5453 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_FUNCTION_in_funcProtoDecl5455 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_NEW_in_funcProtoDecl5457 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_LPAREN_in_funcProtoDecl5459 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000020L,0x0000000000000002L});
    public static final BitSet FOLLOW_paramList_in_funcProtoDecl5461 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_RPAREN_in_funcProtoDecl5464 = new BitSet(new long[]{0x0000000008000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_typeTag_in_funcProtoDecl5466 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_SEMI_in_funcProtoDecl5469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttrList_in_funcProtoDecl5510 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_FUNCTION_in_funcProtoDecl5512 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_IDENTIFIER_in_funcProtoDecl5514 = new BitSet(new long[]{0x0000000000000000L,0x0000000001800000L});
    public static final BitSet FOLLOW_typeParamOpt_in_funcProtoDecl5516 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_LPAREN_in_funcProtoDecl5518 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000020L,0x0000000000000002L});
    public static final BitSet FOLLOW_paramList_in_funcProtoDecl5520 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_RPAREN_in_funcProtoDecl5523 = new BitSet(new long[]{0x0000000008000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_typeTag_in_funcProtoDecl5525 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_SEMI_in_funcProtoDecl5528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_in_funcProtoDecl5572 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_NEW_in_funcProtoDecl5574 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_LPAREN_in_funcProtoDecl5576 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000020L,0x0000000000000002L});
    public static final BitSet FOLLOW_paramList_in_funcProtoDecl5578 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_RPAREN_in_funcProtoDecl5581 = new BitSet(new long[]{0x0000000008000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_typeTag_in_funcProtoDecl5583 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_SEMI_in_funcProtoDecl5586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_in_funcProtoDecl5624 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_IDENTIFIER_in_funcProtoDecl5626 = new BitSet(new long[]{0x0000000000000000L,0x0000000001800000L});
    public static final BitSet FOLLOW_typeParamOpt_in_funcProtoDecl5628 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_LPAREN_in_funcProtoDecl5630 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000020L,0x0000000000000002L});
    public static final BitSet FOLLOW_paramList_in_funcProtoDecl5632 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_RPAREN_in_funcProtoDecl5635 = new BitSet(new long[]{0x0000000008000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_typeTag_in_funcProtoDecl5637 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_SEMI_in_funcProtoDecl5640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_topLevelAccess_in_interfaceDecl5699 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_INTERFACE_in_interfaceDecl5702 = new BitSet(new long[]{0x0040802000010000L,0x0000000000084120L,0x0000000200000000L});
    public static final BitSet FOLLOW_type_in_interfaceDecl5704 = new BitSet(new long[]{0x0000800000000000L,0x0000000000080100L});
    public static final BitSet FOLLOW_inheritListOpt_in_interfaceDecl5706 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_LBRACE_in_interfaceDecl5708 = new BitSet(new long[]{0x0200002000000000L,0x5200001000001000L,0x0000000080000100L});
    public static final BitSet FOLLOW_interfaceBody_in_interfaceDecl5711 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_RBRACE_in_interfaceDecl5713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDecl_in_interfaceBody5737 = new BitSet(new long[]{0x0200002000000000L,0x1200001000001000L,0x0000000080000100L});
    public static final BitSet FOLLOW_interfaceBody_in_interfaceBody5739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcProtoDecl_in_interfaceBody5749 = new BitSet(new long[]{0x0200002000000000L,0x1200001000001000L,0x0000000080000100L});
    public static final BitSet FOLLOW_interfaceBody_in_interfaceBody5751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inherit_in_inheritList5785 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_COMMA_in_inheritList5788 = new BitSet(new long[]{0x0000800000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_inherit_in_inheritList5791 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_inheritList_in_inheritListOpt5821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXTENDS_in_inherit5867 = new BitSet(new long[]{0x0040002000010000L,0x0000000000084020L,0x0000000200000000L});
    public static final BitSet FOLLOW_type_in_inherit5869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IMPLEMENTS_in_inherit5897 = new BitSet(new long[]{0x0040002000010000L,0x0000000000084020L,0x0000000200000000L});
    public static final BitSet FOLLOW_type_in_inherit5899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPEDEF_in_typedefDecl5939 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_IDENTIFIER_in_typedefDecl5941 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_EQ_in_typedefDecl5943 = new BitSet(new long[]{0x0040002000010000L,0x0000000020084020L,0x0000000200000000L});
    public static final BitSet FOLLOW_funcType_in_typedefDecl5945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GT_in_typeExtend5967 = new BitSet(new long[]{0x0040002000010000L,0x0000000020084020L,0x0000000200000000L});
    public static final BitSet FOLLOW_funcType_in_typeExtend5970 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_COMMA_in_typeExtend5972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_anonType6009 = new BitSet(new long[]{0x0800000000000000L,0x4000000000000020L,0x0000000080000000L});
    public static final BitSet FOLLOW_anonTypeFieldList_in_anonType6057 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_varDeclList_in_anonType6082 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_typeExtend_in_anonType6107 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000020L,0x0000000080000000L});
    public static final BitSet FOLLOW_anonTypeFieldList_in_anonType6111 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_varDeclList_in_anonType6115 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_RBRACE_in_anonType6162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_anonTypeField_in_anonTypeFieldList6209 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_COMMA_in_anonTypeFieldList6212 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_anonTypeField_in_anonTypeFieldList6215 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_LBRACE_in_objLit6251 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_objLitElemList_in_objLit6254 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_RBRACE_in_objLit6256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_anonTypeField6284 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_COLON_in_anonTypeField6286 = new BitSet(new long[]{0x0040002000010000L,0x0000000020084020L,0x0000000200000000L});
    public static final BitSet FOLLOW_funcType_in_anonTypeField6289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objLitElem_in_objLitElemList6319 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_COMMA_in_objLitElemList6322 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_objLitElem_in_objLitElemList6325 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_objLitElem6361 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_COLON_in_objLitElem6363 = new BitSet(new long[]{0x0288000002400200L,0x0000080600D90020L,0x0000000020522C00L});
    public static final BitSet FOLLOW_expr_in_objLitElem6366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LONGLITERAL_in_elementarySymbol6400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_elementarySymbol6418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTLITERAL_in_elementarySymbol6443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRINGLITERAL_in_elementarySymbol6462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARLITERAL_in_elementarySymbol6478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOATNUM_in_elementarySymbol6496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_elementarySymbol6517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_elementarySymbol6542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeParam_in_synpred49_Haxe1714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_anonType_in_synpred50_Haxe1698 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_synpred50_Haxe1703 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_primitiveType_in_synpred50_Haxe1708 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_typeParam_in_synpred50_Haxe1714 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_typeParam_in_synpred52_Haxe1824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_synpred56_Haxe1986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignExpr_in_synpred57_Haxe1998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignExpr_in_synpred58_Haxe1998 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_synpred58_Haxe2000 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_SEMI_in_synpred58_Haxe2003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_synpred60_Haxe2046 = new BitSet(new long[]{0x0388000482420200L,0x0000080600D90060L,0x00000008A0D72C05L});
    public static final BitSet FOLLOW_statement_in_synpred60_Haxe2049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_synpred74_Haxe2334 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_COLON_in_synpred74_Haxe2336 = new BitSet(new long[]{0x0388000482420200L,0x0000080600D90060L,0x00000008A0D72C05L});
    public static final BitSet FOLLOW_statement_in_synpred74_Haxe2338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDecl_in_synpred77_Haxe2504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_synpred120_Haxe3985 = new BitSet(new long[]{0x0000000800000000L,0x0000000000900000L});
    public static final BitSet FOLLOW_LPAREN_in_synpred120_Haxe4004 = new BitSet(new long[]{0x0288000002400200L,0x0000080600D90020L,0x0000000020522C02L});
    public static final BitSet FOLLOW_exprList_in_synpred120_Haxe4006 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_RPAREN_in_synpred120_Haxe4009 = new BitSet(new long[]{0x0000000800000002L,0x0000000000900000L});
    public static final BitSet FOLLOW_pureCallOrSlice_in_synpred120_Haxe4011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACKET_in_synpred120_Haxe4060 = new BitSet(new long[]{0x0288000002400200L,0x0000080600D90020L,0x0000000020522C00L});
    public static final BitSet FOLLOW_expr_in_synpred120_Haxe4062 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_RBRACKET_in_synpred120_Haxe4064 = new BitSet(new long[]{0x0000000800000002L,0x0000000000900000L});
    public static final BitSet FOLLOW_pureCallOrSlice_in_synpred120_Haxe4066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_synpred120_Haxe4115 = new BitSet(new long[]{0x0288000002000000L,0x0000000400D90020L,0x0000000000420400L});
    public static final BitSet FOLLOW_methodCallOrSlice_in_synpred120_Haxe4117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_synpred130_Haxe4381 = new BitSet(new long[]{0x0000000000000002L});

}