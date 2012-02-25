// $ANTLR 3.4 Haxe.g 2012-02-26 01:33:35

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ABSTRACT", "AMP", "AMPAMP", "AMPEQ", "ASSIGN_OPERATOR", "BANG", "BANGEQ", "BANGEQQ", "BAR", "BARBAR", "BAREQ", "BLOCK_SCOPE", "BOOLEAN", "BREAK", "BYTE", "CARET", "CARETEQ", "CASE", "CAST", "CATCH", "CHAR", "CHARLITERAL", "CLASS", "COLON", "COMMA", "COMMENT", "CONST", "CONTINUE", "DECL_ATTR_LIST", "DEFAULT", "DIGIT", "DO", "DOT", "DOUBLE", "DYNAMIC", "ELLIPSIS", "ELSE", "ELSE_TOKEN", "ENDIF_TOKEN", "ENUM", "EQ", "EQEQ", "ESC_SEQ", "EXPONENT", "EXTENDS", "EXTERN", "EscapeSequence", "FALSE", "FINAL", "FINALLY", "FLOAT", "FLOATNUM", "FOR", "FUNCTION", "GOTO", "GT", "GTEQ", "GTGT", "GTGTEQ", "GTGTGT", "GTGTGTEQ", "HEX_DIGIT", "HexDigit", "HexPrefix", "IDENT", "IDENTIFIER", "IF", "IF_TOKEN", "IMPLEMENTS", "IMPORT", "IN", "INHERIT_LIST_OPT", "INLINE", "INSTANCEOF", "INT", "INTERFACE", "INTLITERAL", "INTNUM", "IntegerNumber", "LBRACE", "LBRACKET", "LONG", "LONGLITERAL", "LPAREN", "LT", "LTEQ", "LTLT", "LTLTEQ", "LongSuffix", "MINUS_BIGGER", "MODULE", "MONKEYS_AT", "NATIVE", "NEVER", "NEW", "NULL", "OCTAL_ESC", "OVERRIDE", "PACKAGE", "PARAM_LIST", "PERCENT", "PERCENTEQ", "PLUS", "PLUSEQ", "PLUSPLUS", "PP_AND_EXPRESSION", "PP_CONDITIONAL", "PP_ELSE", "PP_ELSEIF", "PP_END", "PP_ERROR", "PP_EXPRESSION", "PP_IF", "PP_OR_EXPRESSION", "PP_PRIMARY_EXPRESSION", "PP_UNARY_EXPRESSION", "PREFIX_EXPR", "PREPROCESSOR_DIRECTIVE", "PRIVATE", "PROPERTY_DECL", "PROTECTED", "PUBLIC", "QUES", "RBRACE", "RBRACKET", "RETURN", "RPAREN", "SEMI", "SHORT", "SLASH", "SLASHEQ", "STAR", "STAREQ", "STATIC", "STRICTFP", "STRINGLITERAL", "SUB", "SUBEQ", "SUBSUB", "SUFFIX_EXPR", "SUPER", "SWITCH", "THIS", "THROW", "THROWS", "TILDE", "TRANSIENT", "TRUE", "TRY", "TS", "TYPEDEF", "TYPE_PARAM_OPT", "TYPE_TAG", "UNICODE_ESC", "UNTYPED", "USING", "VAR", "VAR_INIT", "VOID", "VOLATILE", "WHILE", "WS"
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
    public static final int DIGIT=34;
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
    public static final int ESC_SEQ=46;
    public static final int EXPONENT=47;
    public static final int EXTENDS=48;
    public static final int EXTERN=49;
    public static final int EscapeSequence=50;
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
    public static final int NEVER=97;
    public static final int NEW=98;
    public static final int NULL=99;
    public static final int OCTAL_ESC=100;
    public static final int OVERRIDE=101;
    public static final int PACKAGE=102;
    public static final int PARAM_LIST=103;
    public static final int PERCENT=104;
    public static final int PERCENTEQ=105;
    public static final int PLUS=106;
    public static final int PLUSEQ=107;
    public static final int PLUSPLUS=108;
    public static final int PP_AND_EXPRESSION=109;
    public static final int PP_CONDITIONAL=110;
    public static final int PP_ELSE=111;
    public static final int PP_ELSEIF=112;
    public static final int PP_END=113;
    public static final int PP_ERROR=114;
    public static final int PP_EXPRESSION=115;
    public static final int PP_IF=116;
    public static final int PP_OR_EXPRESSION=117;
    public static final int PP_PRIMARY_EXPRESSION=118;
    public static final int PP_UNARY_EXPRESSION=119;
    public static final int PREFIX_EXPR=120;
    public static final int PREPROCESSOR_DIRECTIVE=121;
    public static final int PRIVATE=122;
    public static final int PROPERTY_DECL=123;
    public static final int PROTECTED=124;
    public static final int PUBLIC=125;
    public static final int QUES=126;
    public static final int RBRACE=127;
    public static final int RBRACKET=128;
    public static final int RETURN=129;
    public static final int RPAREN=130;
    public static final int SEMI=131;
    public static final int SHORT=132;
    public static final int SLASH=133;
    public static final int SLASHEQ=134;
    public static final int STAR=135;
    public static final int STAREQ=136;
    public static final int STATIC=137;
    public static final int STRICTFP=138;
    public static final int STRINGLITERAL=139;
    public static final int SUB=140;
    public static final int SUBEQ=141;
    public static final int SUBSUB=142;
    public static final int SUFFIX_EXPR=143;
    public static final int SUPER=144;
    public static final int SWITCH=145;
    public static final int THIS=146;
    public static final int THROW=147;
    public static final int THROWS=148;
    public static final int TILDE=149;
    public static final int TRANSIENT=150;
    public static final int TRUE=151;
    public static final int TRY=152;
    public static final int TS=153;
    public static final int TYPEDEF=154;
    public static final int TYPE_PARAM_OPT=155;
    public static final int TYPE_TAG=156;
    public static final int UNICODE_ESC=157;
    public static final int UNTYPED=158;
    public static final int USING=159;
    public static final int VAR=160;
    public static final int VAR_INIT=161;
    public static final int VOID=162;
    public static final int VOLATILE=163;
    public static final int WHILE=164;
    public static final int WS=165;

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
        this.state.ruleMemo = new HashMap[264+1];
         

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
                else if ( (LA16_1==EOF||LA16_1==CLASS||LA16_1==COMMA||(LA16_1 >= ENUM && LA16_1 <= EQ)||(LA16_1 >= EXTENDS && LA16_1 <= EXTERN)||LA16_1==GT||(LA16_1 >= IMPLEMENTS && LA16_1 <= IMPORT)||LA16_1==INTERFACE||LA16_1==LBRACE||(LA16_1 >= LPAREN && LA16_1 <= LT)||LA16_1==MINUS_BIGGER||LA16_1==PRIVATE||LA16_1==RBRACE||(LA16_1 >= RPAREN && LA16_1 <= SEMI)||LA16_1==TYPEDEF||LA16_1==USING) ) {
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
                else if ( (LA16_2==EOF||LA16_2==CLASS||LA16_2==COMMA||(LA16_2 >= ENUM && LA16_2 <= EQ)||(LA16_2 >= EXTENDS && LA16_2 <= EXTERN)||LA16_2==GT||(LA16_2 >= IMPLEMENTS && LA16_2 <= IMPORT)||LA16_2==INTERFACE||LA16_2==LBRACE||(LA16_2 >= LPAREN && LA16_2 <= LT)||LA16_2==MINUS_BIGGER||LA16_2==PRIVATE||LA16_2==RBRACE||(LA16_2 >= RPAREN && LA16_2 <= SEMI)||LA16_2==TYPEDEF||LA16_2==USING) ) {
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
                    // elements: a, DOT, id
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


    public static class typeTag_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "typeTag"
    // Haxe.g:175:1: typeTag : COLON funcType -> ^( TYPE_TAG[\"TYPE_TAG\"] funcType ) ;
    public final HaxeParser.typeTag_return typeTag() throws RecognitionException {
        HaxeParser.typeTag_return retval = new HaxeParser.typeTag_return();
        retval.start = input.LT(1);

        int typeTag_StartIndex = input.index();

        Object root_0 = null;

        Token COLON63=null;
        HaxeParser.funcType_return funcType64 =null;


        Object COLON63_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleSubtreeStream stream_funcType=new RewriteRuleSubtreeStream(adaptor,"rule funcType");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return retval; }

            // Haxe.g:175:17: ( COLON funcType -> ^( TYPE_TAG[\"TYPE_TAG\"] funcType ) )
            // Haxe.g:175:19: COLON funcType
            {
            COLON63=(Token)match(input,COLON,FOLLOW_COLON_in_typeTag1457); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COLON.add(COLON63);


            pushFollow(FOLLOW_funcType_in_typeTag1459);
            funcType64=funcType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_funcType.add(funcType64.getTree());

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
            // 175:34: -> ^( TYPE_TAG[\"TYPE_TAG\"] funcType )
            {
                // Haxe.g:175:37: ^( TYPE_TAG[\"TYPE_TAG\"] funcType )
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
            if ( state.backtracking>0 ) { memoize(input, 18, typeTag_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "typeTag"


    public static class typeList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "typeList"
    // Haxe.g:178:1: typeList : ( funcType ( COMMA ! typeList )? | typeConstraint ( COMMA ! typeList )? );
    public final HaxeParser.typeList_return typeList() throws RecognitionException {
        HaxeParser.typeList_return retval = new HaxeParser.typeList_return();
        retval.start = input.LT(1);

        int typeList_StartIndex = input.index();

        Object root_0 = null;

        Token COMMA66=null;
        Token COMMA69=null;
        HaxeParser.funcType_return funcType65 =null;

        HaxeParser.typeList_return typeList67 =null;

        HaxeParser.typeConstraint_return typeConstraint68 =null;

        HaxeParser.typeList_return typeList70 =null;


        Object COMMA66_tree=null;
        Object COMMA69_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return retval; }

            // Haxe.g:178:17: ( funcType ( COMMA ! typeList )? | typeConstraint ( COMMA ! typeList )? )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==BOOLEAN||LA22_0==DYNAMIC||LA22_0==FLOAT||LA22_0==INT||LA22_0==LBRACE||LA22_0==THIS||LA22_0==VOID) ) {
                alt22=1;
            }
            else if ( (LA22_0==IDENTIFIER) ) {
                int LA22_2 = input.LA(2);

                if ( (LA22_2==COLON) ) {
                    alt22=2;
                }
                else if ( (LA22_2==EOF||LA22_2==COMMA||LA22_2==DOT||LA22_2==GT||LA22_2==LT||LA22_2==MINUS_BIGGER||LA22_2==RPAREN) ) {
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
                    // Haxe.g:178:19: funcType ( COMMA ! typeList )?
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_funcType_in_typeList1503);
                    funcType65=funcType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, funcType65.getTree());

                    // Haxe.g:178:28: ( COMMA ! typeList )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==COMMA) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // Haxe.g:178:29: COMMA ! typeList
                            {
                            COMMA66=(Token)match(input,COMMA,FOLLOW_COMMA_in_typeList1506); if (state.failed) return retval;

                            pushFollow(FOLLOW_typeList_in_typeList1509);
                            typeList67=typeList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, typeList67.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // Haxe.g:179:19: typeConstraint ( COMMA ! typeList )?
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_typeConstraint_in_typeList1531);
                    typeConstraint68=typeConstraint();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeConstraint68.getTree());

                    // Haxe.g:179:34: ( COMMA ! typeList )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==COMMA) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // Haxe.g:179:35: COMMA ! typeList
                            {
                            COMMA69=(Token)match(input,COMMA,FOLLOW_COMMA_in_typeList1534); if (state.failed) return retval;

                            pushFollow(FOLLOW_typeList_in_typeList1537);
                            typeList70=typeList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, typeList70.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 19, typeList_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "typeList"


    public static class funcType_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "funcType"
    // Haxe.g:182:1: funcType : type ( MINUS_BIGGER ! type )* ;
    public final HaxeParser.funcType_return funcType() throws RecognitionException {
        HaxeParser.funcType_return retval = new HaxeParser.funcType_return();
        retval.start = input.LT(1);

        int funcType_StartIndex = input.index();

        Object root_0 = null;

        Token MINUS_BIGGER72=null;
        HaxeParser.type_return type71 =null;

        HaxeParser.type_return type73 =null;


        Object MINUS_BIGGER72_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return retval; }

            // Haxe.g:182:17: ( type ( MINUS_BIGGER ! type )* )
            // Haxe.g:182:19: type ( MINUS_BIGGER ! type )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_type_in_funcType1572);
            type71=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type71.getTree());

            // Haxe.g:182:24: ( MINUS_BIGGER ! type )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==MINUS_BIGGER) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // Haxe.g:182:25: MINUS_BIGGER ! type
            	    {
            	    MINUS_BIGGER72=(Token)match(input,MINUS_BIGGER,FOLLOW_MINUS_BIGGER_in_funcType1575); if (state.failed) return retval;

            	    pushFollow(FOLLOW_type_in_funcType1578);
            	    type73=type();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, type73.getTree());

            	    }
            	    break;

            	default :
            	    break loop23;
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
            if ( state.backtracking>0 ) { memoize(input, 20, funcType_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "funcType"


    public static class primitiveType_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "primitiveType"
    // Haxe.g:185:1: primitiveType : ( INT | FLOAT | DYNAMIC | BOOLEAN | VOID );
    public final HaxeParser.primitiveType_return primitiveType() throws RecognitionException {
        HaxeParser.primitiveType_return retval = new HaxeParser.primitiveType_return();
        retval.start = input.LT(1);

        int primitiveType_StartIndex = input.index();

        Object root_0 = null;

        Token set74=null;

        Object set74_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return retval; }

            // Haxe.g:185:17: ( INT | FLOAT | DYNAMIC | BOOLEAN | VOID )
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
            if ( state.backtracking>0 ) { memoize(input, 21, primitiveType_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "primitiveType"


    public static class type_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "type"
    // Haxe.g:188:1: type : ( anonType ^| dotIdent ^| primitiveType ^) ( typeParam )* ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return retval; }

            // Haxe.g:188:17: ( ( anonType ^| dotIdent ^| primitiveType ^) ( typeParam )* )
            // Haxe.g:188:19: ( anonType ^| dotIdent ^| primitiveType ^) ( typeParam )*
            {
            root_0 = (Object)adaptor.nil();


            // Haxe.g:188:19: ( anonType ^| dotIdent ^| primitiveType ^)
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
            case BOOLEAN:
            case DYNAMIC:
            case FLOAT:
            case INT:
            case VOID:
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
                    // Haxe.g:188:20: anonType ^
                    {
                    pushFollow(FOLLOW_anonType_in_type1664);
                    anonType75=anonType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(anonType75.getTree(), root_0);

                    }
                    break;
                case 2 :
                    // Haxe.g:188:32: dotIdent ^
                    {
                    pushFollow(FOLLOW_dotIdent_in_type1669);
                    dotIdent76=dotIdent();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(dotIdent76.getTree(), root_0);

                    }
                    break;
                case 3 :
                    // Haxe.g:188:44: primitiveType ^
                    {
                    pushFollow(FOLLOW_primitiveType_in_type1674);
                    primitiveType77=primitiveType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(primitiveType77.getTree(), root_0);

                    }
                    break;

            }


            // Haxe.g:188:61: ( typeParam )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==LT) ) {
                    int LA25_8 = input.LA(2);

                    if ( (synpred48_Haxe()) ) {
                        alt25=1;
                    }


                }


                switch (alt25) {
            	case 1 :
            	    // Haxe.g:188:62: typeParam
            	    {
            	    pushFollow(FOLLOW_typeParam_in_type1680);
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

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 22, type_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "type"


    public static class typeParam_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "typeParam"
    // Haxe.g:191:1: typeParam : LT ! typeList ( typeParam )? GT !;
    public final HaxeParser.typeParam_return typeParam() throws RecognitionException {
        HaxeParser.typeParam_return retval = new HaxeParser.typeParam_return();
        retval.start = input.LT(1);

        int typeParam_StartIndex = input.index();

        Object root_0 = null;

        Token LT79=null;
        Token GT82=null;
        HaxeParser.typeList_return typeList80 =null;

        HaxeParser.typeParam_return typeParam81 =null;


        Object LT79_tree=null;
        Object GT82_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return retval; }

            // Haxe.g:191:17: ( LT ! typeList ( typeParam )? GT !)
            // Haxe.g:191:19: LT ! typeList ( typeParam )? GT !
            {
            root_0 = (Object)adaptor.nil();


            LT79=(Token)match(input,LT,FOLLOW_LT_in_typeParam1717); if (state.failed) return retval;

            pushFollow(FOLLOW_typeList_in_typeParam1720);
            typeList80=typeList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, typeList80.getTree());

            // Haxe.g:191:32: ( typeParam )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==LT) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // Haxe.g:191:32: typeParam
                    {
                    pushFollow(FOLLOW_typeParam_in_typeParam1722);
                    typeParam81=typeParam();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeParam81.getTree());

                    }
                    break;

            }


            GT82=(Token)match(input,GT,FOLLOW_GT_in_typeParam1725); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 23, typeParam_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "typeParam"


    public static class typeParamOpt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "typeParamOpt"
    // Haxe.g:194:1: typeParamOpt : ( typeParam -> ^( TYPE_PARAM_OPT[\"TYPE_PARAM_OPT\"] ( typeParam )? ) |);
    public final HaxeParser.typeParamOpt_return typeParamOpt() throws RecognitionException {
        HaxeParser.typeParamOpt_return retval = new HaxeParser.typeParamOpt_return();
        retval.start = input.LT(1);

        int typeParamOpt_StartIndex = input.index();

        Object root_0 = null;

        HaxeParser.typeParam_return typeParam83 =null;


        RewriteRuleSubtreeStream stream_typeParam=new RewriteRuleSubtreeStream(adaptor,"rule typeParam");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return retval; }

            // Haxe.g:195:5: ( typeParam -> ^( TYPE_PARAM_OPT[\"TYPE_PARAM_OPT\"] ( typeParam )? ) |)
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==LT) ) {
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
            else if ( (LA27_0==EOF||(LA27_0 >= AMP && LA27_0 <= AMPEQ)||LA27_0==BANGEQ||(LA27_0 >= BAR && LA27_0 <= BAREQ)||(LA27_0 >= CARET && LA27_0 <= CARETEQ)||(LA27_0 >= COLON && LA27_0 <= COMMA)||LA27_0==DOT||LA27_0==ELLIPSIS||(LA27_0 >= EQ && LA27_0 <= EQEQ)||LA27_0==EXTENDS||(LA27_0 >= GT && LA27_0 <= GTGTGTEQ)||LA27_0==IMPLEMENTS||LA27_0==IN||(LA27_0 >= LBRACE && LA27_0 <= LBRACKET)||LA27_0==LPAREN||(LA27_0 >= LTEQ && LA27_0 <= LTLTEQ)||(LA27_0 >= PERCENT && LA27_0 <= PLUSPLUS)||(LA27_0 >= QUES && LA27_0 <= RBRACKET)||(LA27_0 >= RPAREN && LA27_0 <= SEMI)||(LA27_0 >= SLASH && LA27_0 <= STAREQ)||(LA27_0 >= SUB && LA27_0 <= SUBSUB)) ) {
                alt27=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;

            }
            switch (alt27) {
                case 1 :
                    // Haxe.g:195:10: typeParam
                    {
                    pushFollow(FOLLOW_typeParam_in_typeParamOpt1768);
                    typeParam83=typeParam();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeParam.add(typeParam83.getTree());

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
                    // 195:20: -> ^( TYPE_PARAM_OPT[\"TYPE_PARAM_OPT\"] ( typeParam )? )
                    {
                        // Haxe.g:195:23: ^( TYPE_PARAM_OPT[\"TYPE_PARAM_OPT\"] ( typeParam )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        new HaxeTree(TYPE_PARAM_OPT, "TYPE_PARAM_OPT")
                        , root_1);

                        // Haxe.g:195:68: ( typeParam )?
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
                    // Haxe.g:197:5: 
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
            if ( state.backtracking>0 ) { memoize(input, 24, typeParamOpt_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "typeParamOpt"


    public static class typeConstraint_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "typeConstraint"
    // Haxe.g:199:1: typeConstraint : IDENTIFIER COLON LPAREN typeList RPAREN -> ^( $typeConstraint ( IDENTIFIER )? ( typeList )? ) ;
    public final HaxeParser.typeConstraint_return typeConstraint() throws RecognitionException {
        HaxeParser.typeConstraint_return retval = new HaxeParser.typeConstraint_return();
        retval.start = input.LT(1);

        int typeConstraint_StartIndex = input.index();

        Object root_0 = null;

        Token IDENTIFIER84=null;
        Token COLON85=null;
        Token LPAREN86=null;
        Token RPAREN88=null;
        HaxeParser.typeList_return typeList87 =null;


        Object IDENTIFIER84_tree=null;
        Object COLON85_tree=null;
        Object LPAREN86_tree=null;
        Object RPAREN88_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_typeList=new RewriteRuleSubtreeStream(adaptor,"rule typeList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return retval; }

            // Haxe.g:200:5: ( IDENTIFIER COLON LPAREN typeList RPAREN -> ^( $typeConstraint ( IDENTIFIER )? ( typeList )? ) )
            // Haxe.g:200:9: IDENTIFIER COLON LPAREN typeList RPAREN
            {
            IDENTIFIER84=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_typeConstraint1817); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER84);


            COLON85=(Token)match(input,COLON,FOLLOW_COLON_in_typeConstraint1819); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COLON.add(COLON85);


            LPAREN86=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_typeConstraint1821); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN86);


            pushFollow(FOLLOW_typeList_in_typeConstraint1823);
            typeList87=typeList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeList.add(typeList87.getTree());

            RPAREN88=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_typeConstraint1825); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN88);


            // AST REWRITE
            // elements: typeConstraint, IDENTIFIER, typeList
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 200:49: -> ^( $typeConstraint ( IDENTIFIER )? ( typeList )? )
            {
                // Haxe.g:200:52: ^( $typeConstraint ( IDENTIFIER )? ( typeList )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_retval.nextNode(), root_1);

                // Haxe.g:200:70: ( IDENTIFIER )?
                if ( stream_IDENTIFIER.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_IDENTIFIER.nextNode()
                    );

                }
                stream_IDENTIFIER.reset();

                // Haxe.g:200:82: ( typeList )?
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
            if ( state.backtracking>0 ) { memoize(input, 25, typeConstraint_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "typeConstraint"


    public static class functionReturn_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "functionReturn"
    // Haxe.g:204:1: functionReturn : ( declAttrList )? FUNCTION NEW LPAREN ( paramList )? RPAREN ( typeTag )? block -> ^( FUNCTION NEW ( declAttrList )? ( paramList )? ( typeTag )? ( block )? ) ;
    public final HaxeParser.functionReturn_return functionReturn() throws RecognitionException {
        HaxeParser.functionReturn_return retval = new HaxeParser.functionReturn_return();
        retval.start = input.LT(1);

        int functionReturn_StartIndex = input.index();

        Object root_0 = null;

        Token FUNCTION90=null;
        Token NEW91=null;
        Token LPAREN92=null;
        Token RPAREN94=null;
        HaxeParser.declAttrList_return declAttrList89 =null;

        HaxeParser.paramList_return paramList93 =null;

        HaxeParser.typeTag_return typeTag95 =null;

        HaxeParser.block_return block96 =null;


        Object FUNCTION90_tree=null;
        Object NEW91_tree=null;
        Object LPAREN92_tree=null;
        Object RPAREN94_tree=null;
        RewriteRuleTokenStream stream_FUNCTION=new RewriteRuleTokenStream(adaptor,"token FUNCTION");
        RewriteRuleTokenStream stream_NEW=new RewriteRuleTokenStream(adaptor,"token NEW");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_typeTag=new RewriteRuleSubtreeStream(adaptor,"rule typeTag");
        RewriteRuleSubtreeStream stream_declAttrList=new RewriteRuleSubtreeStream(adaptor,"rule declAttrList");
        RewriteRuleSubtreeStream stream_paramList=new RewriteRuleSubtreeStream(adaptor,"rule paramList");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return retval; }

            // Haxe.g:205:5: ( ( declAttrList )? FUNCTION NEW LPAREN ( paramList )? RPAREN ( typeTag )? block -> ^( FUNCTION NEW ( declAttrList )? ( paramList )? ( typeTag )? ( block )? ) )
            // Haxe.g:205:10: ( declAttrList )? FUNCTION NEW LPAREN ( paramList )? RPAREN ( typeTag )? block
            {
            // Haxe.g:205:10: ( declAttrList )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==DYNAMIC||LA28_0==INLINE||LA28_0==OVERRIDE||LA28_0==PRIVATE||LA28_0==PUBLIC||LA28_0==STATIC) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // Haxe.g:205:10: declAttrList
                    {
                    pushFollow(FOLLOW_declAttrList_in_functionReturn1864);
                    declAttrList89=declAttrList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declAttrList.add(declAttrList89.getTree());

                    }
                    break;

            }


            FUNCTION90=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_functionReturn1867); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION90);


            NEW91=(Token)match(input,NEW,FOLLOW_NEW_in_functionReturn1869); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_NEW.add(NEW91);


            LPAREN92=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_functionReturn1871); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN92);


            // Haxe.g:205:44: ( paramList )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==IDENTIFIER||LA29_0==QUES) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // Haxe.g:205:44: paramList
                    {
                    pushFollow(FOLLOW_paramList_in_functionReturn1873);
                    paramList93=paramList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_paramList.add(paramList93.getTree());

                    }
                    break;

            }


            RPAREN94=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_functionReturn1876); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN94);


            // Haxe.g:205:62: ( typeTag )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==COLON) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // Haxe.g:205:62: typeTag
                    {
                    pushFollow(FOLLOW_typeTag_in_functionReturn1878);
                    typeTag95=typeTag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeTag.add(typeTag95.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_block_in_functionReturn1881);
            block96=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block96.getTree());

            // AST REWRITE
            // elements: paramList, declAttrList, NEW, block, typeTag, FUNCTION
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 205:77: -> ^( FUNCTION NEW ( declAttrList )? ( paramList )? ( typeTag )? ( block )? )
            {
                // Haxe.g:205:80: ^( FUNCTION NEW ( declAttrList )? ( paramList )? ( typeTag )? ( block )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                new FunctionNode(stream_FUNCTION.nextToken())
                , root_1);

                adaptor.addChild(root_1, 
                stream_NEW.nextNode()
                );

                // Haxe.g:205:109: ( declAttrList )?
                if ( stream_declAttrList.hasNext() ) {
                    adaptor.addChild(root_1, stream_declAttrList.nextTree());

                }
                stream_declAttrList.reset();

                // Haxe.g:205:123: ( paramList )?
                if ( stream_paramList.hasNext() ) {
                    adaptor.addChild(root_1, stream_paramList.nextTree());

                }
                stream_paramList.reset();

                // Haxe.g:205:134: ( typeTag )?
                if ( stream_typeTag.hasNext() ) {
                    adaptor.addChild(root_1, stream_typeTag.nextTree());

                }
                stream_typeTag.reset();

                // Haxe.g:205:143: ( block )?
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
            if ( state.backtracking>0 ) { memoize(input, 26, functionReturn_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "functionReturn"


    public static class statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "statement"
    // Haxe.g:208:1: statement : ( block | ( assignExpr | expr ) SEMI !| varDecl | IF ^ parExpression statement ( ELSE ! statement )? | FOR LPAREN expr IN iterExpr RPAREN statement -> ^( FOR expr iterExpr statement ) | WHILE ^ parExpression statement | DO ^ statement WHILE ! parExpression SEMI !| TRY ^ block ( catchStmt )+ | SWITCH ^ LPAREN ! expr RPAREN ! LBRACE ! ( caseStmt )+ RBRACE !| RETURN ^ ( expr )? SEMI !| THROW ^ expr SEMI !| ( BREAK | CONTINUE ) SEMI !| IDENTIFIER COLON statement -> ^( COLON ( IDENTIFIER )? ( statement )? ) | SEMI !);
    public final HaxeParser.statement_return statement() throws RecognitionException {
        HaxeParser.statement_return retval = new HaxeParser.statement_return();
        retval.start = input.LT(1);

        int statement_StartIndex = input.index();

        Object root_0 = null;

        Token SEMI100=null;
        Token IF102=null;
        Token ELSE105=null;
        Token FOR107=null;
        Token LPAREN108=null;
        Token IN110=null;
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
        Token set138=null;
        Token SEMI139=null;
        Token IDENTIFIER140=null;
        Token COLON141=null;
        Token SEMI143=null;
        HaxeParser.block_return block97 =null;

        HaxeParser.assignExpr_return assignExpr98 =null;

        HaxeParser.expr_return expr99 =null;

        HaxeParser.varDecl_return varDecl101 =null;

        HaxeParser.parExpression_return parExpression103 =null;

        HaxeParser.statement_return statement104 =null;

        HaxeParser.statement_return statement106 =null;

        HaxeParser.expr_return expr109 =null;

        HaxeParser.iterExpr_return iterExpr111 =null;

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

        HaxeParser.statement_return statement142 =null;


        Object SEMI100_tree=null;
        Object IF102_tree=null;
        Object ELSE105_tree=null;
        Object FOR107_tree=null;
        Object LPAREN108_tree=null;
        Object IN110_tree=null;
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
        Object set138_tree=null;
        Object SEMI139_tree=null;
        Object IDENTIFIER140_tree=null;
        Object COLON141_tree=null;
        Object SEMI143_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_FOR=new RewriteRuleTokenStream(adaptor,"token FOR");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_IN=new RewriteRuleTokenStream(adaptor,"token IN");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_iterExpr=new RewriteRuleSubtreeStream(adaptor,"rule iterExpr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return retval; }

            // Haxe.g:209:5: ( block | ( assignExpr | expr ) SEMI !| varDecl | IF ^ parExpression statement ( ELSE ! statement )? | FOR LPAREN expr IN iterExpr RPAREN statement -> ^( FOR expr iterExpr statement ) | WHILE ^ parExpression statement | DO ^ statement WHILE ! parExpression SEMI !| TRY ^ block ( catchStmt )+ | SWITCH ^ LPAREN ! expr RPAREN ! LBRACE ! ( caseStmt )+ RBRACE !| RETURN ^ ( expr )? SEMI !| THROW ^ expr SEMI !| ( BREAK | CONTINUE ) SEMI !| IDENTIFIER COLON statement -> ^( COLON ( IDENTIFIER )? ( statement )? ) | SEMI !)
            int alt36=14;
            switch ( input.LA(1) ) {
            case LBRACE:
                {
                int LA36_1 = input.LA(2);

                if ( (synpred54_Haxe()) ) {
                    alt36=1;
                }
                else if ( (synpred56_Haxe()) ) {
                    alt36=2;
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

                if ( (synpred54_Haxe()) ) {
                    alt36=1;
                }
                else if ( (true) ) {
                    alt36=14;
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
            case CAST:
            case CHARLITERAL:
            case FALSE:
            case FLOATNUM:
            case FUNCTION:
            case INTLITERAL:
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
                alt36=2;
                }
                break;
            case IDENTIFIER:
                {
                int LA36_20 = input.LA(2);

                if ( (synpred56_Haxe()) ) {
                    alt36=2;
                }
                else if ( (synpred72_Haxe()) ) {
                    alt36=13;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 36, 20, input);

                    throw nvae;

                }
                }
                break;
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
            case CONTINUE:
                {
                alt36=12;
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
                    // Haxe.g:209:10: block
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_block_in_statement1930);
                    block97=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, block97.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:210:10: ( assignExpr | expr ) SEMI !
                    {
                    root_0 = (Object)adaptor.nil();


                    // Haxe.g:210:10: ( assignExpr | expr )
                    int alt31=2;
                    switch ( input.LA(1) ) {
                    case SUB:
                        {
                        int LA31_1 = input.LA(2);

                        if ( (synpred55_Haxe()) ) {
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
                        break;
                    case SUBSUB:
                        {
                        int LA31_2 = input.LA(2);

                        if ( (synpred55_Haxe()) ) {
                            alt31=1;
                        }
                        else if ( (true) ) {
                            alt31=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 31, 2, input);

                            throw nvae;

                        }
                        }
                        break;
                    case PLUSPLUS:
                        {
                        int LA31_3 = input.LA(2);

                        if ( (synpred55_Haxe()) ) {
                            alt31=1;
                        }
                        else if ( (true) ) {
                            alt31=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 31, 3, input);

                            throw nvae;

                        }
                        }
                        break;
                    case BANG:
                        {
                        int LA31_4 = input.LA(2);

                        if ( (synpred55_Haxe()) ) {
                            alt31=1;
                        }
                        else if ( (true) ) {
                            alt31=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 31, 4, input);

                            throw nvae;

                        }
                        }
                        break;
                    case TILDE:
                        {
                        int LA31_5 = input.LA(2);

                        if ( (synpred55_Haxe()) ) {
                            alt31=1;
                        }
                        else if ( (true) ) {
                            alt31=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 31, 5, input);

                            throw nvae;

                        }
                        }
                        break;
                    case NEW:
                        {
                        int LA31_6 = input.LA(2);

                        if ( (synpred55_Haxe()) ) {
                            alt31=1;
                        }
                        else if ( (true) ) {
                            alt31=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 31, 6, input);

                            throw nvae;

                        }
                        }
                        break;
                    case CAST:
                        {
                        int LA31_7 = input.LA(2);

                        if ( (synpred55_Haxe()) ) {
                            alt31=1;
                        }
                        else if ( (true) ) {
                            alt31=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 31, 7, input);

                            throw nvae;

                        }
                        }
                        break;
                    case LBRACE:
                        {
                        int LA31_8 = input.LA(2);

                        if ( (synpred55_Haxe()) ) {
                            alt31=1;
                        }
                        else if ( (true) ) {
                            alt31=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 31, 8, input);

                            throw nvae;

                        }
                        }
                        break;
                    case FUNCTION:
                        {
                        int LA31_9 = input.LA(2);

                        if ( (synpred55_Haxe()) ) {
                            alt31=1;
                        }
                        else if ( (true) ) {
                            alt31=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 31, 9, input);

                            throw nvae;

                        }
                        }
                        break;
                    case LONGLITERAL:
                        {
                        int LA31_10 = input.LA(2);

                        if ( (synpred55_Haxe()) ) {
                            alt31=1;
                        }
                        else if ( (true) ) {
                            alt31=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 31, 10, input);

                            throw nvae;

                        }
                        }
                        break;
                    case NULL:
                        {
                        int LA31_11 = input.LA(2);

                        if ( (synpred55_Haxe()) ) {
                            alt31=1;
                        }
                        else if ( (true) ) {
                            alt31=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 31, 11, input);

                            throw nvae;

                        }
                        }
                        break;
                    case INTLITERAL:
                        {
                        int LA31_12 = input.LA(2);

                        if ( (synpred55_Haxe()) ) {
                            alt31=1;
                        }
                        else if ( (true) ) {
                            alt31=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 31, 12, input);

                            throw nvae;

                        }
                        }
                        break;
                    case STRINGLITERAL:
                        {
                        int LA31_13 = input.LA(2);

                        if ( (synpred55_Haxe()) ) {
                            alt31=1;
                        }
                        else if ( (true) ) {
                            alt31=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 31, 13, input);

                            throw nvae;

                        }
                        }
                        break;
                    case CHARLITERAL:
                        {
                        int LA31_14 = input.LA(2);

                        if ( (synpred55_Haxe()) ) {
                            alt31=1;
                        }
                        else if ( (true) ) {
                            alt31=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 31, 14, input);

                            throw nvae;

                        }
                        }
                        break;
                    case FLOATNUM:
                        {
                        int LA31_15 = input.LA(2);

                        if ( (synpred55_Haxe()) ) {
                            alt31=1;
                        }
                        else if ( (true) ) {
                            alt31=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 31, 15, input);

                            throw nvae;

                        }
                        }
                        break;
                    case TRUE:
                        {
                        int LA31_16 = input.LA(2);

                        if ( (synpred55_Haxe()) ) {
                            alt31=1;
                        }
                        else if ( (true) ) {
                            alt31=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 31, 16, input);

                            throw nvae;

                        }
                        }
                        break;
                    case FALSE:
                        {
                        int LA31_17 = input.LA(2);

                        if ( (synpred55_Haxe()) ) {
                            alt31=1;
                        }
                        else if ( (true) ) {
                            alt31=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 31, 17, input);

                            throw nvae;

                        }
                        }
                        break;
                    case LPAREN:
                        {
                        int LA31_18 = input.LA(2);

                        if ( (synpred55_Haxe()) ) {
                            alt31=1;
                        }
                        else if ( (true) ) {
                            alt31=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 31, 18, input);

                            throw nvae;

                        }
                        }
                        break;
                    case IDENTIFIER:
                        {
                        int LA31_19 = input.LA(2);

                        if ( (synpred55_Haxe()) ) {
                            alt31=1;
                        }
                        else if ( (true) ) {
                            alt31=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 31, 19, input);

                            throw nvae;

                        }
                        }
                        break;
                    case THIS:
                        {
                        int LA31_20 = input.LA(2);

                        if ( (synpred55_Haxe()) ) {
                            alt31=1;
                        }
                        else if ( (true) ) {
                            alt31=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 31, 20, input);

                            throw nvae;

                        }
                        }
                        break;
                    case UNTYPED:
                        {
                        alt31=2;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 31, 0, input);

                        throw nvae;

                    }

                    switch (alt31) {
                        case 1 :
                            // Haxe.g:210:11: assignExpr
                            {
                            pushFollow(FOLLOW_assignExpr_in_statement1942);
                            assignExpr98=assignExpr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, assignExpr98.getTree());

                            }
                            break;
                        case 2 :
                            // Haxe.g:210:22: expr
                            {
                            pushFollow(FOLLOW_expr_in_statement1944);
                            expr99=expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr99.getTree());

                            }
                            break;

                    }


                    SEMI100=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement1947); if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // Haxe.g:211:10: varDecl
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_varDecl_in_statement1959);
                    varDecl101=varDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDecl101.getTree());

                    }
                    break;
                case 4 :
                    // Haxe.g:212:19: IF ^ parExpression statement ( ELSE ! statement )?
                    {
                    root_0 = (Object)adaptor.nil();


                    IF102=(Token)match(input,IF,FOLLOW_IF_in_statement1979); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IF102_tree = 
                    new IfNode(IF102) 
                    ;
                    root_0 = (Object)adaptor.becomeRoot(IF102_tree, root_0);
                    }

                    pushFollow(FOLLOW_parExpression_in_statement1985);
                    parExpression103=parExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, parExpression103.getTree());

                    pushFollow(FOLLOW_statement_in_statement1987);
                    statement104=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement104.getTree());

                    // Haxe.g:212:55: ( ELSE ! statement )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==ELSE) ) {
                        int LA32_1 = input.LA(2);

                        if ( (synpred58_Haxe()) ) {
                            alt32=1;
                        }
                    }
                    switch (alt32) {
                        case 1 :
                            // Haxe.g:212:56: ELSE ! statement
                            {
                            ELSE105=(Token)match(input,ELSE,FOLLOW_ELSE_in_statement1990); if (state.failed) return retval;

                            pushFollow(FOLLOW_statement_in_statement1993);
                            statement106=statement();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, statement106.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 5 :
                    // Haxe.g:213:19: FOR LPAREN expr IN iterExpr RPAREN statement
                    {
                    FOR107=(Token)match(input,FOR,FOLLOW_FOR_in_statement2015); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FOR.add(FOR107);


                    LPAREN108=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_statement2017); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN108);


                    pushFollow(FOLLOW_expr_in_statement2019);
                    expr109=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr109.getTree());

                    IN110=(Token)match(input,IN,FOLLOW_IN_in_statement2021); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IN.add(IN110);


                    pushFollow(FOLLOW_iterExpr_in_statement2023);
                    iterExpr111=iterExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_iterExpr.add(iterExpr111.getTree());

                    RPAREN112=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_statement2025); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN112);


                    pushFollow(FOLLOW_statement_in_statement2027);
                    statement113=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement113.getTree());

                    // AST REWRITE
                    // elements: statement, expr, FOR, iterExpr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 213:64: -> ^( FOR expr iterExpr statement )
                    {
                        // Haxe.g:213:67: ^( FOR expr iterExpr statement )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        new ForNode(stream_FOR.nextToken())
                        , root_1);

                        adaptor.addChild(root_1, stream_expr.nextTree());

                        adaptor.addChild(root_1, stream_iterExpr.nextTree());

                        adaptor.addChild(root_1, stream_statement.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 6 :
                    // Haxe.g:214:19: WHILE ^ parExpression statement
                    {
                    root_0 = (Object)adaptor.nil();


                    WHILE114=(Token)match(input,WHILE,FOLLOW_WHILE_in_statement2062); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    WHILE114_tree = 
                    new WhileNode(WHILE114) 
                    ;
                    root_0 = (Object)adaptor.becomeRoot(WHILE114_tree, root_0);
                    }

                    pushFollow(FOLLOW_parExpression_in_statement2068);
                    parExpression115=parExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, parExpression115.getTree());

                    pushFollow(FOLLOW_statement_in_statement2070);
                    statement116=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement116.getTree());

                    }
                    break;
                case 7 :
                    // Haxe.g:215:19: DO ^ statement WHILE ! parExpression SEMI !
                    {
                    root_0 = (Object)adaptor.nil();


                    DO117=(Token)match(input,DO,FOLLOW_DO_in_statement2090); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DO117_tree = 
                    new DoWhileNode(DO117) 
                    ;
                    root_0 = (Object)adaptor.becomeRoot(DO117_tree, root_0);
                    }

                    pushFollow(FOLLOW_statement_in_statement2096);
                    statement118=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement118.getTree());

                    WHILE119=(Token)match(input,WHILE,FOLLOW_WHILE_in_statement2098); if (state.failed) return retval;

                    pushFollow(FOLLOW_parExpression_in_statement2101);
                    parExpression120=parExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, parExpression120.getTree());

                    SEMI121=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement2103); if (state.failed) return retval;

                    }
                    break;
                case 8 :
                    // Haxe.g:216:19: TRY ^ block ( catchStmt )+
                    {
                    root_0 = (Object)adaptor.nil();


                    TRY122=(Token)match(input,TRY,FOLLOW_TRY_in_statement2124); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    TRY122_tree = 
                    new TryNode(TRY122) 
                    ;
                    root_0 = (Object)adaptor.becomeRoot(TRY122_tree, root_0);
                    }

                    pushFollow(FOLLOW_block_in_statement2130);
                    block123=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, block123.getTree());

                    // Haxe.g:216:39: ( catchStmt )+
                    int cnt33=0;
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==CATCH) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // Haxe.g:216:39: catchStmt
                    	    {
                    	    pushFollow(FOLLOW_catchStmt_in_statement2132);
                    	    catchStmt124=catchStmt();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, catchStmt124.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt33 >= 1 ) break loop33;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(33, input);
                                throw eee;
                        }
                        cnt33++;
                    } while (true);


                    }
                    break;
                case 9 :
                    // Haxe.g:217:19: SWITCH ^ LPAREN ! expr RPAREN ! LBRACE ! ( caseStmt )+ RBRACE !
                    {
                    root_0 = (Object)adaptor.nil();


                    SWITCH125=(Token)match(input,SWITCH,FOLLOW_SWITCH_in_statement2153); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SWITCH125_tree = 
                    new SwitchNode(SWITCH125) 
                    ;
                    root_0 = (Object)adaptor.becomeRoot(SWITCH125_tree, root_0);
                    }

                    LPAREN126=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_statement2159); if (state.failed) return retval;

                    pushFollow(FOLLOW_expr_in_statement2162);
                    expr127=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr127.getTree());

                    RPAREN128=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_statement2164); if (state.failed) return retval;

                    LBRACE129=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_statement2167); if (state.failed) return retval;

                    // Haxe.g:217:68: ( caseStmt )+
                    int cnt34=0;
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==CASE||LA34_0==DEFAULT) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // Haxe.g:217:68: caseStmt
                    	    {
                    	    pushFollow(FOLLOW_caseStmt_in_statement2170);
                    	    caseStmt130=caseStmt();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, caseStmt130.getTree());

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


                    RBRACE131=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_statement2173); if (state.failed) return retval;

                    }
                    break;
                case 10 :
                    // Haxe.g:218:19: RETURN ^ ( expr )? SEMI !
                    {
                    root_0 = (Object)adaptor.nil();


                    RETURN132=(Token)match(input,RETURN,FOLLOW_RETURN_in_statement2194); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RETURN132_tree = 
                    new ReturnNode(RETURN132) 
                    ;
                    root_0 = (Object)adaptor.becomeRoot(RETURN132_tree, root_0);
                    }

                    // Haxe.g:218:39: ( expr )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==BANG||LA35_0==CAST||LA35_0==CHARLITERAL||LA35_0==FALSE||LA35_0==FLOATNUM||LA35_0==FUNCTION||LA35_0==IDENTIFIER||LA35_0==INTLITERAL||LA35_0==LBRACE||(LA35_0 >= LONGLITERAL && LA35_0 <= LPAREN)||(LA35_0 >= NEW && LA35_0 <= NULL)||LA35_0==PLUSPLUS||(LA35_0 >= STRINGLITERAL && LA35_0 <= SUB)||LA35_0==SUBSUB||LA35_0==THIS||LA35_0==TILDE||LA35_0==TRUE||LA35_0==UNTYPED) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // Haxe.g:218:39: expr
                            {
                            pushFollow(FOLLOW_expr_in_statement2200);
                            expr133=expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr133.getTree());

                            }
                            break;

                    }


                    SEMI134=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement2203); if (state.failed) return retval;

                    }
                    break;
                case 11 :
                    // Haxe.g:219:19: THROW ^ expr SEMI !
                    {
                    root_0 = (Object)adaptor.nil();


                    THROW135=(Token)match(input,THROW,FOLLOW_THROW_in_statement2224); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    THROW135_tree = 
                    (Object)adaptor.create(THROW135)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(THROW135_tree, root_0);
                    }

                    pushFollow(FOLLOW_expr_in_statement2227);
                    expr136=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr136.getTree());

                    SEMI137=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement2229); if (state.failed) return retval;

                    }
                    break;
                case 12 :
                    // Haxe.g:220:19: ( BREAK | CONTINUE ) SEMI !
                    {
                    root_0 = (Object)adaptor.nil();


                    set138=(Token)input.LT(1);

                    if ( input.LA(1)==BREAK||input.LA(1)==CONTINUE ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (Object)adaptor.create(set138)
                        );
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    SEMI139=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement2258); if (state.failed) return retval;

                    }
                    break;
                case 13 :
                    // Haxe.g:221:8: IDENTIFIER COLON statement
                    {
                    IDENTIFIER140=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_statement2268); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER140);


                    COLON141=(Token)match(input,COLON,FOLLOW_COLON_in_statement2270); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(COLON141);


                    pushFollow(FOLLOW_statement_in_statement2272);
                    statement142=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement142.getTree());

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
                    // 221:51: -> ^( COLON ( IDENTIFIER )? ( statement )? )
                    {
                        // Haxe.g:221:54: ^( COLON ( IDENTIFIER )? ( statement )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_COLON.nextNode()
                        , root_1);

                        // Haxe.g:221:62: ( IDENTIFIER )?
                        if ( stream_IDENTIFIER.hasNext() ) {
                            adaptor.addChild(root_1, 
                            stream_IDENTIFIER.nextNode()
                            );

                        }
                        stream_IDENTIFIER.reset();

                        // Haxe.g:221:74: ( statement )?
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
                    // Haxe.g:222:10: SEMI !
                    {
                    root_0 = (Object)adaptor.nil();


                    SEMI143=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement2311); if (state.failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 27, statement_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "statement"


    public static class parExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "parExpression"
    // Haxe.g:225:1: parExpression : LPAREN ! expr RPAREN !;
    public final HaxeParser.parExpression_return parExpression() throws RecognitionException {
        HaxeParser.parExpression_return retval = new HaxeParser.parExpression_return();
        retval.start = input.LT(1);

        int parExpression_StartIndex = input.index();

        Object root_0 = null;

        Token LPAREN144=null;
        Token RPAREN146=null;
        HaxeParser.expr_return expr145 =null;


        Object LPAREN144_tree=null;
        Object RPAREN146_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return retval; }

            // Haxe.g:226:5: ( LPAREN ! expr RPAREN !)
            // Haxe.g:226:9: LPAREN ! expr RPAREN !
            {
            root_0 = (Object)adaptor.nil();


            LPAREN144=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_parExpression2335); if (state.failed) return retval;

            pushFollow(FOLLOW_expr_in_parExpression2338);
            expr145=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr145.getTree());

            RPAREN146=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_parExpression2340); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 28, parExpression_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "parExpression"


    public static class block_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "block"
    // Haxe.g:229:1: block : ( LBRACE ( blockStmt )* RBRACE -> ^( BLOCK_SCOPE[$LBRACE, $RBRACE] ( blockStmt )* ) | SEMI !);
    public final HaxeParser.block_return block() throws RecognitionException {
        HaxeParser.block_return retval = new HaxeParser.block_return();
        retval.start = input.LT(1);

        int block_StartIndex = input.index();

        Object root_0 = null;

        Token LBRACE147=null;
        Token RBRACE149=null;
        Token SEMI150=null;
        HaxeParser.blockStmt_return blockStmt148 =null;


        Object LBRACE147_tree=null;
        Object RBRACE149_tree=null;
        Object SEMI150_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_blockStmt=new RewriteRuleSubtreeStream(adaptor,"rule blockStmt");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return retval; }

            // Haxe.g:229:17: ( LBRACE ( blockStmt )* RBRACE -> ^( BLOCK_SCOPE[$LBRACE, $RBRACE] ( blockStmt )* ) | SEMI !)
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
                    // Haxe.g:229:19: LBRACE ( blockStmt )* RBRACE
                    {
                    LBRACE147=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_block2364); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LBRACE.add(LBRACE147);


                    // Haxe.g:229:26: ( blockStmt )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==BANG||LA37_0==BREAK||LA37_0==CAST||(LA37_0 >= CHARLITERAL && LA37_0 <= CLASS)||LA37_0==CONTINUE||LA37_0==DO||LA37_0==EXTERN||LA37_0==FALSE||(LA37_0 >= FLOATNUM && LA37_0 <= FUNCTION)||(LA37_0 >= IDENTIFIER && LA37_0 <= IF)||LA37_0==INTLITERAL||LA37_0==LBRACE||(LA37_0 >= LONGLITERAL && LA37_0 <= LPAREN)||(LA37_0 >= NEW && LA37_0 <= NULL)||LA37_0==PLUSPLUS||LA37_0==PRIVATE||LA37_0==RETURN||LA37_0==SEMI||(LA37_0 >= STRINGLITERAL && LA37_0 <= SUB)||LA37_0==SUBSUB||(LA37_0 >= SWITCH && LA37_0 <= THROW)||LA37_0==TILDE||(LA37_0 >= TRUE && LA37_0 <= TRY)||LA37_0==UNTYPED||LA37_0==VAR||LA37_0==WHILE) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // Haxe.g:229:27: blockStmt
                    	    {
                    	    pushFollow(FOLLOW_blockStmt_in_block2367);
                    	    blockStmt148=blockStmt();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_blockStmt.add(blockStmt148.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop37;
                        }
                    } while (true);


                    RBRACE149=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_block2371); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RBRACE.add(RBRACE149);


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
                    // 229:46: -> ^( BLOCK_SCOPE[$LBRACE, $RBRACE] ( blockStmt )* )
                    {
                        // Haxe.g:229:49: ^( BLOCK_SCOPE[$LBRACE, $RBRACE] ( blockStmt )* )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        new BlockScopeNode(BLOCK_SCOPE, LBRACE147, RBRACE149)
                        , root_1);

                        // Haxe.g:229:97: ( blockStmt )*
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
                    // Haxe.g:230:19: SEMI !
                    {
                    root_0 = (Object)adaptor.nil();


                    SEMI150=(Token)match(input,SEMI,FOLLOW_SEMI_in_block2405); if (state.failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 29, block_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "block"


    public static class blockStmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "blockStmt"
    // Haxe.g:233:1: blockStmt : ( varDecl | classDecl | statement );
    public final HaxeParser.blockStmt_return blockStmt() throws RecognitionException {
        HaxeParser.blockStmt_return retval = new HaxeParser.blockStmt_return();
        retval.start = input.LT(1);

        int blockStmt_StartIndex = input.index();

        Object root_0 = null;

        HaxeParser.varDecl_return varDecl151 =null;

        HaxeParser.classDecl_return classDecl152 =null;

        HaxeParser.statement_return statement153 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return retval; }

            // Haxe.g:234:5: ( varDecl | classDecl | statement )
            int alt39=3;
            switch ( input.LA(1) ) {
            case VAR:
                {
                int LA39_1 = input.LA(2);

                if ( (synpred75_Haxe()) ) {
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
            case CLASS:
            case EXTERN:
            case PRIVATE:
                {
                alt39=2;
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
                    // Haxe.g:234:10: varDecl
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_varDecl_in_blockStmt2438);
                    varDecl151=varDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDecl151.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:235:10: classDecl
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_classDecl_in_blockStmt2449);
                    classDecl152=classDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, classDecl152.getTree());

                    }
                    break;
                case 3 :
                    // Haxe.g:236:10: statement
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_statement_in_blockStmt2460);
                    statement153=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement153.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 30, blockStmt_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "blockStmt"


    public static class caseStmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "caseStmt"
    // Haxe.g:239:1: caseStmt : ( CASE ^ exprList COLON ! statement | DEFAULT ^ COLON ! statement );
    public final HaxeParser.caseStmt_return caseStmt() throws RecognitionException {
        HaxeParser.caseStmt_return retval = new HaxeParser.caseStmt_return();
        retval.start = input.LT(1);

        int caseStmt_StartIndex = input.index();

        Object root_0 = null;

        Token CASE154=null;
        Token COLON156=null;
        Token DEFAULT158=null;
        Token COLON159=null;
        HaxeParser.exprList_return exprList155 =null;

        HaxeParser.statement_return statement157 =null;

        HaxeParser.statement_return statement160 =null;


        Object CASE154_tree=null;
        Object COLON156_tree=null;
        Object DEFAULT158_tree=null;
        Object COLON159_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return retval; }

            // Haxe.g:239:17: ( CASE ^ exprList COLON ! statement | DEFAULT ^ COLON ! statement )
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
                    // Haxe.g:239:19: CASE ^ exprList COLON ! statement
                    {
                    root_0 = (Object)adaptor.nil();


                    CASE154=(Token)match(input,CASE,FOLLOW_CASE_in_caseStmt2484); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CASE154_tree = 
                    (Object)adaptor.create(CASE154)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(CASE154_tree, root_0);
                    }

                    pushFollow(FOLLOW_exprList_in_caseStmt2487);
                    exprList155=exprList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, exprList155.getTree());

                    COLON156=(Token)match(input,COLON,FOLLOW_COLON_in_caseStmt2489); if (state.failed) return retval;

                    pushFollow(FOLLOW_statement_in_caseStmt2492);
                    statement157=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement157.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:240:19: DEFAULT ^ COLON ! statement
                    {
                    root_0 = (Object)adaptor.nil();


                    DEFAULT158=(Token)match(input,DEFAULT,FOLLOW_DEFAULT_in_caseStmt2512); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DEFAULT158_tree = 
                    (Object)adaptor.create(DEFAULT158)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(DEFAULT158_tree, root_0);
                    }

                    COLON159=(Token)match(input,COLON,FOLLOW_COLON_in_caseStmt2515); if (state.failed) return retval;

                    pushFollow(FOLLOW_statement_in_caseStmt2518);
                    statement160=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement160.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 31, caseStmt_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "caseStmt"


    public static class catchStmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "catchStmt"
    // Haxe.g:243:1: catchStmt : CATCH ^ LPAREN ! param RPAREN ! block ;
    public final HaxeParser.catchStmt_return catchStmt() throws RecognitionException {
        HaxeParser.catchStmt_return retval = new HaxeParser.catchStmt_return();
        retval.start = input.LT(1);

        int catchStmt_StartIndex = input.index();

        Object root_0 = null;

        Token CATCH161=null;
        Token LPAREN162=null;
        Token RPAREN164=null;
        HaxeParser.param_return param163 =null;

        HaxeParser.block_return block165 =null;


        Object CATCH161_tree=null;
        Object LPAREN162_tree=null;
        Object RPAREN164_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return retval; }

            // Haxe.g:244:3: ( CATCH ^ LPAREN ! param RPAREN ! block )
            // Haxe.g:244:3: CATCH ^ LPAREN ! param RPAREN ! block
            {
            root_0 = (Object)adaptor.nil();


            CATCH161=(Token)match(input,CATCH,FOLLOW_CATCH_in_catchStmt2554); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            CATCH161_tree = 
            new HaxeTree(CATCH161) 
            ;
            root_0 = (Object)adaptor.becomeRoot(CATCH161_tree, root_0);
            }

            LPAREN162=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_catchStmt2560); if (state.failed) return retval;

            pushFollow(FOLLOW_param_in_catchStmt2563);
            param163=param();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, param163.getTree());

            RPAREN164=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_catchStmt2565); if (state.failed) return retval;

            pushFollow(FOLLOW_block_in_catchStmt2568);
            block165=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, block165.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 32, catchStmt_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "catchStmt"


    public static class exprList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "exprList"
    // Haxe.g:248:1: exprList : expr ( COMMA ! expr )* ;
    public final HaxeParser.exprList_return exprList() throws RecognitionException {
        HaxeParser.exprList_return retval = new HaxeParser.exprList_return();
        retval.start = input.LT(1);

        int exprList_StartIndex = input.index();

        Object root_0 = null;

        Token COMMA167=null;
        HaxeParser.expr_return expr166 =null;

        HaxeParser.expr_return expr168 =null;


        Object COMMA167_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return retval; }

            // Haxe.g:248:17: ( expr ( COMMA ! expr )* )
            // Haxe.g:248:19: expr ( COMMA ! expr )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_expr_in_exprList2590);
            expr166=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr166.getTree());

            // Haxe.g:248:24: ( COMMA ! expr )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==COMMA) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // Haxe.g:248:25: COMMA ! expr
            	    {
            	    COMMA167=(Token)match(input,COMMA,FOLLOW_COMMA_in_exprList2593); if (state.failed) return retval;

            	    pushFollow(FOLLOW_expr_in_exprList2596);
            	    expr168=expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr168.getTree());

            	    }
            	    break;

            	default :
            	    break loop41;
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
            if ( state.backtracking>0 ) { memoize(input, 33, exprList_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "exprList"


    public static class expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expr"
    // Haxe.g:251:1: expr : ( UNTYPED ^ assignExpr | assignExpr );
    public final HaxeParser.expr_return expr() throws RecognitionException {
        HaxeParser.expr_return retval = new HaxeParser.expr_return();
        retval.start = input.LT(1);

        int expr_StartIndex = input.index();

        Object root_0 = null;

        Token UNTYPED169=null;
        HaxeParser.assignExpr_return assignExpr170 =null;

        HaxeParser.assignExpr_return assignExpr171 =null;


        Object UNTYPED169_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return retval; }

            // Haxe.g:251:17: ( UNTYPED ^ assignExpr | assignExpr )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==UNTYPED) ) {
                alt42=1;
            }
            else if ( (LA42_0==BANG||LA42_0==CAST||LA42_0==CHARLITERAL||LA42_0==FALSE||LA42_0==FLOATNUM||LA42_0==FUNCTION||LA42_0==IDENTIFIER||LA42_0==INTLITERAL||LA42_0==LBRACE||(LA42_0 >= LONGLITERAL && LA42_0 <= LPAREN)||(LA42_0 >= NEW && LA42_0 <= NULL)||LA42_0==PLUSPLUS||(LA42_0 >= STRINGLITERAL && LA42_0 <= SUB)||LA42_0==SUBSUB||LA42_0==THIS||LA42_0==TILDE||LA42_0==TRUE) ) {
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
                    // Haxe.g:251:19: UNTYPED ^ assignExpr
                    {
                    root_0 = (Object)adaptor.nil();


                    UNTYPED169=(Token)match(input,UNTYPED,FOLLOW_UNTYPED_in_expr2638); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    UNTYPED169_tree = 
                    (Object)adaptor.create(UNTYPED169)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(UNTYPED169_tree, root_0);
                    }

                    pushFollow(FOLLOW_assignExpr_in_expr2641);
                    assignExpr170=assignExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignExpr170.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:252:19: assignExpr
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_assignExpr_in_expr2661);
                    assignExpr171=assignExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignExpr171.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 34, expr_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "expr"


    public static class assignExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assignExpr"
    // Haxe.g:255:1: assignExpr : ternaryExpr ( assignOp ^ ternaryExpr )? ;
    public final HaxeParser.assignExpr_return assignExpr() throws RecognitionException {
        HaxeParser.assignExpr_return retval = new HaxeParser.assignExpr_return();
        retval.start = input.LT(1);

        int assignExpr_StartIndex = input.index();

        Object root_0 = null;

        HaxeParser.ternaryExpr_return ternaryExpr172 =null;

        HaxeParser.assignOp_return assignOp173 =null;

        HaxeParser.ternaryExpr_return ternaryExpr174 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return retval; }

            // Haxe.g:255:17: ( ternaryExpr ( assignOp ^ ternaryExpr )? )
            // Haxe.g:255:19: ternaryExpr ( assignOp ^ ternaryExpr )?
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_ternaryExpr_in_assignExpr2691);
            ternaryExpr172=ternaryExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, ternaryExpr172.getTree());

            // Haxe.g:255:31: ( assignOp ^ ternaryExpr )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==AMPEQ||LA43_0==BAREQ||LA43_0==CARETEQ||LA43_0==EQ||LA43_0==GTGTEQ||LA43_0==GTGTGTEQ||LA43_0==LTLTEQ||LA43_0==PERCENTEQ||LA43_0==PLUSEQ||LA43_0==SLASHEQ||LA43_0==STAREQ||LA43_0==SUBEQ) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // Haxe.g:255:32: assignOp ^ ternaryExpr
                    {
                    pushFollow(FOLLOW_assignOp_in_assignExpr2694);
                    assignOp173=assignOp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(assignOp173.getTree(), root_0);

                    pushFollow(FOLLOW_ternaryExpr_in_assignExpr2697);
                    ternaryExpr174=ternaryExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ternaryExpr174.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 35, assignExpr_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "assignExpr"


    public static class ternaryExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ternaryExpr"
    // Haxe.g:258:1: ternaryExpr : logicOrExpr ( QUES ^ expr COLON ! ternaryExpr )? ;
    public final HaxeParser.ternaryExpr_return ternaryExpr() throws RecognitionException {
        HaxeParser.ternaryExpr_return retval = new HaxeParser.ternaryExpr_return();
        retval.start = input.LT(1);

        int ternaryExpr_StartIndex = input.index();

        Object root_0 = null;

        Token QUES176=null;
        Token COLON178=null;
        HaxeParser.logicOrExpr_return logicOrExpr175 =null;

        HaxeParser.expr_return expr177 =null;

        HaxeParser.ternaryExpr_return ternaryExpr179 =null;


        Object QUES176_tree=null;
        Object COLON178_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return retval; }

            // Haxe.g:258:17: ( logicOrExpr ( QUES ^ expr COLON ! ternaryExpr )? )
            // Haxe.g:258:19: logicOrExpr ( QUES ^ expr COLON ! ternaryExpr )?
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_logicOrExpr_in_ternaryExpr2728);
            logicOrExpr175=logicOrExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, logicOrExpr175.getTree());

            // Haxe.g:258:31: ( QUES ^ expr COLON ! ternaryExpr )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==QUES) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // Haxe.g:258:32: QUES ^ expr COLON ! ternaryExpr
                    {
                    QUES176=(Token)match(input,QUES,FOLLOW_QUES_in_ternaryExpr2731); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    QUES176_tree = 
                    (Object)adaptor.create(QUES176)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(QUES176_tree, root_0);
                    }

                    pushFollow(FOLLOW_expr_in_ternaryExpr2734);
                    expr177=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr177.getTree());

                    COLON178=(Token)match(input,COLON,FOLLOW_COLON_in_ternaryExpr2736); if (state.failed) return retval;

                    pushFollow(FOLLOW_ternaryExpr_in_ternaryExpr2739);
                    ternaryExpr179=ternaryExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ternaryExpr179.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 36, ternaryExpr_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "ternaryExpr"


    public static class logicOrExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "logicOrExpr"
    // Haxe.g:261:1: logicOrExpr : logicAndExpr ( BARBAR ^ logicAndExpr )* ;
    public final HaxeParser.logicOrExpr_return logicOrExpr() throws RecognitionException {
        HaxeParser.logicOrExpr_return retval = new HaxeParser.logicOrExpr_return();
        retval.start = input.LT(1);

        int logicOrExpr_StartIndex = input.index();

        Object root_0 = null;

        Token BARBAR181=null;
        HaxeParser.logicAndExpr_return logicAndExpr180 =null;

        HaxeParser.logicAndExpr_return logicAndExpr182 =null;


        Object BARBAR181_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return retval; }

            // Haxe.g:261:17: ( logicAndExpr ( BARBAR ^ logicAndExpr )* )
            // Haxe.g:261:19: logicAndExpr ( BARBAR ^ logicAndExpr )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_logicAndExpr_in_logicOrExpr2770);
            logicAndExpr180=logicAndExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, logicAndExpr180.getTree());

            // Haxe.g:261:32: ( BARBAR ^ logicAndExpr )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==BARBAR) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // Haxe.g:261:33: BARBAR ^ logicAndExpr
            	    {
            	    BARBAR181=(Token)match(input,BARBAR,FOLLOW_BARBAR_in_logicOrExpr2773); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    BARBAR181_tree = 
            	    new BinaryExpressionNode(BARBAR181) 
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(BARBAR181_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_logicAndExpr_in_logicOrExpr2779);
            	    logicAndExpr182=logicAndExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, logicAndExpr182.getTree());

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
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 37, logicOrExpr_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "logicOrExpr"


    public static class logicAndExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "logicAndExpr"
    // Haxe.g:264:1: logicAndExpr : iterExpr ( AMPAMP ^ iterExpr )* ;
    public final HaxeParser.logicAndExpr_return logicAndExpr() throws RecognitionException {
        HaxeParser.logicAndExpr_return retval = new HaxeParser.logicAndExpr_return();
        retval.start = input.LT(1);

        int logicAndExpr_StartIndex = input.index();

        Object root_0 = null;

        Token AMPAMP184=null;
        HaxeParser.iterExpr_return iterExpr183 =null;

        HaxeParser.iterExpr_return iterExpr185 =null;


        Object AMPAMP184_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return retval; }

            // Haxe.g:264:17: ( iterExpr ( AMPAMP ^ iterExpr )* )
            // Haxe.g:264:19: iterExpr ( AMPAMP ^ iterExpr )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_iterExpr_in_logicAndExpr2813);
            iterExpr183=iterExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, iterExpr183.getTree());

            // Haxe.g:264:27: ( AMPAMP ^ iterExpr )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==AMPAMP) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // Haxe.g:264:28: AMPAMP ^ iterExpr
            	    {
            	    AMPAMP184=(Token)match(input,AMPAMP,FOLLOW_AMPAMP_in_logicAndExpr2815); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    AMPAMP184_tree = 
            	    new BinaryExpressionNode(AMPAMP184) 
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(AMPAMP184_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_iterExpr_in_logicAndExpr2821);
            	    iterExpr185=iterExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, iterExpr185.getTree());

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
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 38, logicAndExpr_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "logicAndExpr"


    public static class iterExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "iterExpr"
    // Haxe.g:267:1: iterExpr : cmpExpr ( ELLIPSIS ^ cmpExpr )? ;
    public final HaxeParser.iterExpr_return iterExpr() throws RecognitionException {
        HaxeParser.iterExpr_return retval = new HaxeParser.iterExpr_return();
        retval.start = input.LT(1);

        int iterExpr_StartIndex = input.index();

        Object root_0 = null;

        Token ELLIPSIS187=null;
        HaxeParser.cmpExpr_return cmpExpr186 =null;

        HaxeParser.cmpExpr_return cmpExpr188 =null;


        Object ELLIPSIS187_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return retval; }

            // Haxe.g:267:17: ( cmpExpr ( ELLIPSIS ^ cmpExpr )? )
            // Haxe.g:267:19: cmpExpr ( ELLIPSIS ^ cmpExpr )?
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_cmpExpr_in_iterExpr2871);
            cmpExpr186=cmpExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, cmpExpr186.getTree());

            // Haxe.g:267:27: ( ELLIPSIS ^ cmpExpr )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==ELLIPSIS) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // Haxe.g:267:28: ELLIPSIS ^ cmpExpr
                    {
                    ELLIPSIS187=(Token)match(input,ELLIPSIS,FOLLOW_ELLIPSIS_in_iterExpr2874); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ELLIPSIS187_tree = 
                    new BinaryExpressionNode(ELLIPSIS187) 
                    ;
                    root_0 = (Object)adaptor.becomeRoot(ELLIPSIS187_tree, root_0);
                    }

                    pushFollow(FOLLOW_cmpExpr_in_iterExpr2880);
                    cmpExpr188=cmpExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, cmpExpr188.getTree());

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


    public static class cmpExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "cmpExpr"
    // Haxe.g:270:1: cmpExpr : bitExpr ( ( EQEQ ^| BANGEQ ^| GTEQ ^| LTEQ ^| GT ^| LT ^) bitExpr )* ;
    public final HaxeParser.cmpExpr_return cmpExpr() throws RecognitionException {
        HaxeParser.cmpExpr_return retval = new HaxeParser.cmpExpr_return();
        retval.start = input.LT(1);

        int cmpExpr_StartIndex = input.index();

        Object root_0 = null;

        Token EQEQ190=null;
        Token BANGEQ191=null;
        Token GTEQ192=null;
        Token LTEQ193=null;
        Token GT194=null;
        Token LT195=null;
        HaxeParser.bitExpr_return bitExpr189 =null;

        HaxeParser.bitExpr_return bitExpr196 =null;


        Object EQEQ190_tree=null;
        Object BANGEQ191_tree=null;
        Object GTEQ192_tree=null;
        Object LTEQ193_tree=null;
        Object GT194_tree=null;
        Object LT195_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return retval; }

            // Haxe.g:270:17: ( bitExpr ( ( EQEQ ^| BANGEQ ^| GTEQ ^| LTEQ ^| GT ^| LT ^) bitExpr )* )
            // Haxe.g:270:19: bitExpr ( ( EQEQ ^| BANGEQ ^| GTEQ ^| LTEQ ^| GT ^| LT ^) bitExpr )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_bitExpr_in_cmpExpr2919);
            bitExpr189=bitExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bitExpr189.getTree());

            // Haxe.g:270:27: ( ( EQEQ ^| BANGEQ ^| GTEQ ^| LTEQ ^| GT ^| LT ^) bitExpr )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==BANGEQ||LA49_0==EQEQ||(LA49_0 >= GT && LA49_0 <= GTEQ)||(LA49_0 >= LT && LA49_0 <= LTEQ)) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // Haxe.g:270:28: ( EQEQ ^| BANGEQ ^| GTEQ ^| LTEQ ^| GT ^| LT ^) bitExpr
            	    {
            	    // Haxe.g:270:28: ( EQEQ ^| BANGEQ ^| GTEQ ^| LTEQ ^| GT ^| LT ^)
            	    int alt48=6;
            	    switch ( input.LA(1) ) {
            	    case EQEQ:
            	        {
            	        alt48=1;
            	        }
            	        break;
            	    case BANGEQ:
            	        {
            	        alt48=2;
            	        }
            	        break;
            	    case GTEQ:
            	        {
            	        alt48=3;
            	        }
            	        break;
            	    case LTEQ:
            	        {
            	        alt48=4;
            	        }
            	        break;
            	    case GT:
            	        {
            	        alt48=5;
            	        }
            	        break;
            	    case LT:
            	        {
            	        alt48=6;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 48, 0, input);

            	        throw nvae;

            	    }

            	    switch (alt48) {
            	        case 1 :
            	            // Haxe.g:271:23: EQEQ ^
            	            {
            	            EQEQ190=(Token)match(input,EQEQ,FOLLOW_EQEQ_in_cmpExpr2946); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            EQEQ190_tree = 
            	            new BinaryExpressionNode(EQEQ190) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(EQEQ190_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // Haxe.g:272:23: BANGEQ ^
            	            {
            	            BANGEQ191=(Token)match(input,BANGEQ,FOLLOW_BANGEQ_in_cmpExpr2975); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            BANGEQ191_tree = 
            	            new BinaryExpressionNode(BANGEQ191) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(BANGEQ191_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // Haxe.g:273:23: GTEQ ^
            	            {
            	            GTEQ192=(Token)match(input,GTEQ,FOLLOW_GTEQ_in_cmpExpr3004); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            GTEQ192_tree = 
            	            new BinaryExpressionNode(GTEQ192) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(GTEQ192_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // Haxe.g:274:23: LTEQ ^
            	            {
            	            LTEQ193=(Token)match(input,LTEQ,FOLLOW_LTEQ_in_cmpExpr3033); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            LTEQ193_tree = 
            	            new BinaryExpressionNode(LTEQ193) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(LTEQ193_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 5 :
            	            // Haxe.g:275:23: GT ^
            	            {
            	            GT194=(Token)match(input,GT,FOLLOW_GT_in_cmpExpr3062); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            GT194_tree = 
            	            new BinaryExpressionNode(GT194) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(GT194_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 6 :
            	            // Haxe.g:276:23: LT ^
            	            {
            	            LT195=(Token)match(input,LT,FOLLOW_LT_in_cmpExpr3091); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            LT195_tree = 
            	            new BinaryExpressionNode(LT195) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(LT195_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_bitExpr_in_cmpExpr3098);
            	    bitExpr196=bitExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, bitExpr196.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 40, cmpExpr_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "cmpExpr"


    public static class bitExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "bitExpr"
    // Haxe.g:279:1: bitExpr : shiftExpr ( ( BAR ^| AMP ^| CARET ^) shiftExpr )* ;
    public final HaxeParser.bitExpr_return bitExpr() throws RecognitionException {
        HaxeParser.bitExpr_return retval = new HaxeParser.bitExpr_return();
        retval.start = input.LT(1);

        int bitExpr_StartIndex = input.index();

        Object root_0 = null;

        Token BAR198=null;
        Token AMP199=null;
        Token CARET200=null;
        HaxeParser.shiftExpr_return shiftExpr197 =null;

        HaxeParser.shiftExpr_return shiftExpr201 =null;


        Object BAR198_tree=null;
        Object AMP199_tree=null;
        Object CARET200_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return retval; }

            // Haxe.g:279:17: ( shiftExpr ( ( BAR ^| AMP ^| CARET ^) shiftExpr )* )
            // Haxe.g:279:19: shiftExpr ( ( BAR ^| AMP ^| CARET ^) shiftExpr )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_shiftExpr_in_bitExpr3137);
            shiftExpr197=shiftExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, shiftExpr197.getTree());

            // Haxe.g:279:29: ( ( BAR ^| AMP ^| CARET ^) shiftExpr )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==AMP||LA51_0==BAR||LA51_0==CARET) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // Haxe.g:279:30: ( BAR ^| AMP ^| CARET ^) shiftExpr
            	    {
            	    // Haxe.g:279:30: ( BAR ^| AMP ^| CARET ^)
            	    int alt50=3;
            	    switch ( input.LA(1) ) {
            	    case BAR:
            	        {
            	        alt50=1;
            	        }
            	        break;
            	    case AMP:
            	        {
            	        alt50=2;
            	        }
            	        break;
            	    case CARET:
            	        {
            	        alt50=3;
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
            	            // Haxe.g:280:23: BAR ^
            	            {
            	            BAR198=(Token)match(input,BAR,FOLLOW_BAR_in_bitExpr3164); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            BAR198_tree = 
            	            new BinaryExpressionNode(BAR198) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(BAR198_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // Haxe.g:281:23: AMP ^
            	            {
            	            AMP199=(Token)match(input,AMP,FOLLOW_AMP_in_bitExpr3193); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            AMP199_tree = 
            	            new BinaryExpressionNode(AMP199) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(AMP199_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // Haxe.g:282:23: CARET ^
            	            {
            	            CARET200=(Token)match(input,CARET,FOLLOW_CARET_in_bitExpr3222); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            CARET200_tree = 
            	            new BinaryExpressionNode(CARET200) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(CARET200_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_shiftExpr_in_bitExpr3229);
            	    shiftExpr201=shiftExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, shiftExpr201.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 41, bitExpr_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "bitExpr"


    public static class shiftExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "shiftExpr"
    // Haxe.g:285:1: shiftExpr : addExpr ( ( LTLT ^| GTGT ^| GTGTGT ^) addExpr )* ;
    public final HaxeParser.shiftExpr_return shiftExpr() throws RecognitionException {
        HaxeParser.shiftExpr_return retval = new HaxeParser.shiftExpr_return();
        retval.start = input.LT(1);

        int shiftExpr_StartIndex = input.index();

        Object root_0 = null;

        Token LTLT203=null;
        Token GTGT204=null;
        Token GTGTGT205=null;
        HaxeParser.addExpr_return addExpr202 =null;

        HaxeParser.addExpr_return addExpr206 =null;


        Object LTLT203_tree=null;
        Object GTGT204_tree=null;
        Object GTGTGT205_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 42) ) { return retval; }

            // Haxe.g:285:17: ( addExpr ( ( LTLT ^| GTGT ^| GTGTGT ^) addExpr )* )
            // Haxe.g:285:19: addExpr ( ( LTLT ^| GTGT ^| GTGTGT ^) addExpr )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_addExpr_in_shiftExpr3262);
            addExpr202=addExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, addExpr202.getTree());

            // Haxe.g:285:27: ( ( LTLT ^| GTGT ^| GTGTGT ^) addExpr )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==GTGT||LA53_0==GTGTGT||LA53_0==LTLT) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // Haxe.g:285:28: ( LTLT ^| GTGT ^| GTGTGT ^) addExpr
            	    {
            	    // Haxe.g:285:28: ( LTLT ^| GTGT ^| GTGTGT ^)
            	    int alt52=3;
            	    switch ( input.LA(1) ) {
            	    case LTLT:
            	        {
            	        alt52=1;
            	        }
            	        break;
            	    case GTGT:
            	        {
            	        alt52=2;
            	        }
            	        break;
            	    case GTGTGT:
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
            	            // Haxe.g:286:23: LTLT ^
            	            {
            	            LTLT203=(Token)match(input,LTLT,FOLLOW_LTLT_in_shiftExpr3289); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            LTLT203_tree = 
            	            new BinaryExpressionNode(LTLT203) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(LTLT203_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // Haxe.g:287:23: GTGT ^
            	            {
            	            GTGT204=(Token)match(input,GTGT,FOLLOW_GTGT_in_shiftExpr3318); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            GTGT204_tree = 
            	            new BinaryExpressionNode(GTGT204) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(GTGT204_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // Haxe.g:288:23: GTGTGT ^
            	            {
            	            GTGTGT205=(Token)match(input,GTGTGT,FOLLOW_GTGTGT_in_shiftExpr3347); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            GTGTGT205_tree = 
            	            new BinaryExpressionNode(GTGTGT205) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(GTGTGT205_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_addExpr_in_shiftExpr3354);
            	    addExpr206=addExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, addExpr206.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 42, shiftExpr_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "shiftExpr"


    public static class addExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "addExpr"
    // Haxe.g:291:1: addExpr : multExpr ( ( PLUS ^| SUB ^) multExpr )* ;
    public final HaxeParser.addExpr_return addExpr() throws RecognitionException {
        HaxeParser.addExpr_return retval = new HaxeParser.addExpr_return();
        retval.start = input.LT(1);

        int addExpr_StartIndex = input.index();

        Object root_0 = null;

        Token PLUS208=null;
        Token SUB209=null;
        HaxeParser.multExpr_return multExpr207 =null;

        HaxeParser.multExpr_return multExpr210 =null;


        Object PLUS208_tree=null;
        Object SUB209_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 43) ) { return retval; }

            // Haxe.g:291:17: ( multExpr ( ( PLUS ^| SUB ^) multExpr )* )
            // Haxe.g:291:19: multExpr ( ( PLUS ^| SUB ^) multExpr )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_multExpr_in_addExpr3389);
            multExpr207=multExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, multExpr207.getTree());

            // Haxe.g:291:28: ( ( PLUS ^| SUB ^) multExpr )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==PLUS||LA55_0==SUB) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // Haxe.g:291:29: ( PLUS ^| SUB ^) multExpr
            	    {
            	    // Haxe.g:291:29: ( PLUS ^| SUB ^)
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
            	            // Haxe.g:292:23: PLUS ^
            	            {
            	            PLUS208=(Token)match(input,PLUS,FOLLOW_PLUS_in_addExpr3416); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            PLUS208_tree = 
            	            new BinaryExpressionNode(PLUS208) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(PLUS208_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // Haxe.g:293:23: SUB ^
            	            {
            	            SUB209=(Token)match(input,SUB,FOLLOW_SUB_in_addExpr3445); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            SUB209_tree = 
            	            new BinaryExpressionNode(SUB209) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(SUB209_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_multExpr_in_addExpr3452);
            	    multExpr210=multExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, multExpr210.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 43, addExpr_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "addExpr"


    public static class multExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "multExpr"
    // Haxe.g:296:1: multExpr : unarExpr ( ( STAR ^| SLASH ^| PERCENT ^) unarExpr )* ;
    public final HaxeParser.multExpr_return multExpr() throws RecognitionException {
        HaxeParser.multExpr_return retval = new HaxeParser.multExpr_return();
        retval.start = input.LT(1);

        int multExpr_StartIndex = input.index();

        Object root_0 = null;

        Token STAR212=null;
        Token SLASH213=null;
        Token PERCENT214=null;
        HaxeParser.unarExpr_return unarExpr211 =null;

        HaxeParser.unarExpr_return unarExpr215 =null;


        Object STAR212_tree=null;
        Object SLASH213_tree=null;
        Object PERCENT214_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 44) ) { return retval; }

            // Haxe.g:296:17: ( unarExpr ( ( STAR ^| SLASH ^| PERCENT ^) unarExpr )* )
            // Haxe.g:296:19: unarExpr ( ( STAR ^| SLASH ^| PERCENT ^) unarExpr )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_unarExpr_in_multExpr3491);
            unarExpr211=unarExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, unarExpr211.getTree());

            // Haxe.g:296:28: ( ( STAR ^| SLASH ^| PERCENT ^) unarExpr )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==PERCENT||LA57_0==SLASH||LA57_0==STAR) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // Haxe.g:296:29: ( STAR ^| SLASH ^| PERCENT ^) unarExpr
            	    {
            	    // Haxe.g:296:29: ( STAR ^| SLASH ^| PERCENT ^)
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
            	            // Haxe.g:297:23: STAR ^
            	            {
            	            STAR212=(Token)match(input,STAR,FOLLOW_STAR_in_multExpr3518); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            STAR212_tree = 
            	            new BinaryExpressionNode(STAR212) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(STAR212_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // Haxe.g:298:23: SLASH ^
            	            {
            	            SLASH213=(Token)match(input,SLASH,FOLLOW_SLASH_in_multExpr3547); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            SLASH213_tree = 
            	            new BinaryExpressionNode(SLASH213) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(SLASH213_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // Haxe.g:299:23: PERCENT ^
            	            {
            	            PERCENT214=(Token)match(input,PERCENT,FOLLOW_PERCENT_in_multExpr3576); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            PERCENT214_tree = 
            	            new BinaryExpressionNode(PERCENT214) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(PERCENT214_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_unarExpr_in_multExpr3583);
            	    unarExpr215=unarExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, unarExpr215.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 44, multExpr_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "multExpr"


    public static class unarExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "unarExpr"
    // Haxe.g:302:1: unarExpr : ( ( SUB ^| SUBSUB ^| PLUSPLUS ^| BANG ^| TILDE ^) prefixExpr | prefixExpr ( PLUSPLUS ^| SUBSUB ^)? );
    public final HaxeParser.unarExpr_return unarExpr() throws RecognitionException {
        HaxeParser.unarExpr_return retval = new HaxeParser.unarExpr_return();
        retval.start = input.LT(1);

        int unarExpr_StartIndex = input.index();

        Object root_0 = null;

        Token SUB216=null;
        Token SUBSUB217=null;
        Token PLUSPLUS218=null;
        Token BANG219=null;
        Token TILDE220=null;
        Token PLUSPLUS223=null;
        Token SUBSUB224=null;
        HaxeParser.prefixExpr_return prefixExpr221 =null;

        HaxeParser.prefixExpr_return prefixExpr222 =null;


        Object SUB216_tree=null;
        Object SUBSUB217_tree=null;
        Object PLUSPLUS218_tree=null;
        Object BANG219_tree=null;
        Object TILDE220_tree=null;
        Object PLUSPLUS223_tree=null;
        Object SUBSUB224_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 45) ) { return retval; }

            // Haxe.g:302:17: ( ( SUB ^| SUBSUB ^| PLUSPLUS ^| BANG ^| TILDE ^) prefixExpr | prefixExpr ( PLUSPLUS ^| SUBSUB ^)? )
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==BANG||LA60_0==PLUSPLUS||LA60_0==SUB||LA60_0==SUBSUB||LA60_0==TILDE) ) {
                alt60=1;
            }
            else if ( (LA60_0==CAST||LA60_0==CHARLITERAL||LA60_0==FALSE||LA60_0==FLOATNUM||LA60_0==FUNCTION||LA60_0==IDENTIFIER||LA60_0==INTLITERAL||LA60_0==LBRACE||(LA60_0 >= LONGLITERAL && LA60_0 <= LPAREN)||(LA60_0 >= NEW && LA60_0 <= NULL)||LA60_0==STRINGLITERAL||LA60_0==THIS||LA60_0==TRUE) ) {
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
                    // Haxe.g:302:19: ( SUB ^| SUBSUB ^| PLUSPLUS ^| BANG ^| TILDE ^) prefixExpr
                    {
                    root_0 = (Object)adaptor.nil();


                    // Haxe.g:302:19: ( SUB ^| SUBSUB ^| PLUSPLUS ^| BANG ^| TILDE ^)
                    int alt58=5;
                    switch ( input.LA(1) ) {
                    case SUB:
                        {
                        alt58=1;
                        }
                        break;
                    case SUBSUB:
                        {
                        alt58=2;
                        }
                        break;
                    case PLUSPLUS:
                        {
                        alt58=3;
                        }
                        break;
                    case BANG:
                        {
                        alt58=4;
                        }
                        break;
                    case TILDE:
                        {
                        alt58=5;
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
                            // Haxe.g:303:13: SUB ^
                            {
                            SUB216=(Token)match(input,SUB,FOLLOW_SUB_in_unarExpr3631); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            SUB216_tree = 
                            new UnarExpressionNode(SUB216) 
                            ;
                            root_0 = (Object)adaptor.becomeRoot(SUB216_tree, root_0);
                            }

                            }
                            break;
                        case 2 :
                            // Haxe.g:304:13: SUBSUB ^
                            {
                            SUBSUB217=(Token)match(input,SUBSUB,FOLLOW_SUBSUB_in_unarExpr3650); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            SUBSUB217_tree = 
                            new UnarExpressionNode(SUBSUB217) 
                            ;
                            root_0 = (Object)adaptor.becomeRoot(SUBSUB217_tree, root_0);
                            }

                            }
                            break;
                        case 3 :
                            // Haxe.g:305:13: PLUSPLUS ^
                            {
                            PLUSPLUS218=(Token)match(input,PLUSPLUS,FOLLOW_PLUSPLUS_in_unarExpr3669); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            PLUSPLUS218_tree = 
                            new UnarExpressionNode(PLUSPLUS218) 
                            ;
                            root_0 = (Object)adaptor.becomeRoot(PLUSPLUS218_tree, root_0);
                            }

                            }
                            break;
                        case 4 :
                            // Haxe.g:306:13: BANG ^
                            {
                            BANG219=(Token)match(input,BANG,FOLLOW_BANG_in_unarExpr3688); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            BANG219_tree = 
                            new UnarExpressionNode(BANG219) 
                            ;
                            root_0 = (Object)adaptor.becomeRoot(BANG219_tree, root_0);
                            }

                            }
                            break;
                        case 5 :
                            // Haxe.g:307:13: TILDE ^
                            {
                            TILDE220=(Token)match(input,TILDE,FOLLOW_TILDE_in_unarExpr3707); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            TILDE220_tree = 
                            new UnarExpressionNode(TILDE220) 
                            ;
                            root_0 = (Object)adaptor.becomeRoot(TILDE220_tree, root_0);
                            }

                            }
                            break;

                    }


                    pushFollow(FOLLOW_prefixExpr_in_unarExpr3714);
                    prefixExpr221=prefixExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, prefixExpr221.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:308:19: prefixExpr ( PLUSPLUS ^| SUBSUB ^)?
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_prefixExpr_in_unarExpr3734);
                    prefixExpr222=prefixExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, prefixExpr222.getTree());

                    // Haxe.g:308:30: ( PLUSPLUS ^| SUBSUB ^)?
                    int alt59=3;
                    int LA59_0 = input.LA(1);

                    if ( (LA59_0==PLUSPLUS) ) {
                        alt59=1;
                    }
                    else if ( (LA59_0==SUBSUB) ) {
                        alt59=2;
                    }
                    switch (alt59) {
                        case 1 :
                            // Haxe.g:308:31: PLUSPLUS ^
                            {
                            PLUSPLUS223=(Token)match(input,PLUSPLUS,FOLLOW_PLUSPLUS_in_unarExpr3737); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            PLUSPLUS223_tree = 
                            new UnarExpressionNode(PLUSPLUS223) 
                            ;
                            root_0 = (Object)adaptor.becomeRoot(PLUSPLUS223_tree, root_0);
                            }

                            }
                            break;
                        case 2 :
                            // Haxe.g:308:61: SUBSUB ^
                            {
                            SUBSUB224=(Token)match(input,SUBSUB,FOLLOW_SUBSUB_in_unarExpr3743); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            SUBSUB224_tree = 
                            new UnarExpressionNode(SUBSUB224) 
                            ;
                            root_0 = (Object)adaptor.becomeRoot(SUBSUB224_tree, root_0);
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
            if ( state.backtracking>0 ) { memoize(input, 45, unarExpr_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "unarExpr"


    public static class prefixExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "prefixExpr"
    // Haxe.g:311:1: prefixExpr : ( NEW ^ type LPAREN ! ( exprList )? RPAREN !| CAST ^ LPAREN ! expr ( COMMA ! funcType )? RPAREN !| methodCallOrSlice );
    public final HaxeParser.prefixExpr_return prefixExpr() throws RecognitionException {
        HaxeParser.prefixExpr_return retval = new HaxeParser.prefixExpr_return();
        retval.start = input.LT(1);

        int prefixExpr_StartIndex = input.index();

        Object root_0 = null;

        Token NEW225=null;
        Token LPAREN227=null;
        Token RPAREN229=null;
        Token CAST230=null;
        Token LPAREN231=null;
        Token COMMA233=null;
        Token RPAREN235=null;
        HaxeParser.type_return type226 =null;

        HaxeParser.exprList_return exprList228 =null;

        HaxeParser.expr_return expr232 =null;

        HaxeParser.funcType_return funcType234 =null;

        HaxeParser.methodCallOrSlice_return methodCallOrSlice236 =null;


        Object NEW225_tree=null;
        Object LPAREN227_tree=null;
        Object RPAREN229_tree=null;
        Object CAST230_tree=null;
        Object LPAREN231_tree=null;
        Object COMMA233_tree=null;
        Object RPAREN235_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 46) ) { return retval; }

            // Haxe.g:311:17: ( NEW ^ type LPAREN ! ( exprList )? RPAREN !| CAST ^ LPAREN ! expr ( COMMA ! funcType )? RPAREN !| methodCallOrSlice )
            int alt63=3;
            switch ( input.LA(1) ) {
            case NEW:
                {
                alt63=1;
                }
                break;
            case CAST:
                {
                alt63=2;
                }
                break;
            case CHARLITERAL:
            case FALSE:
            case FLOATNUM:
            case FUNCTION:
            case IDENTIFIER:
            case INTLITERAL:
            case LBRACE:
            case LONGLITERAL:
            case LPAREN:
            case NULL:
            case STRINGLITERAL:
            case THIS:
            case TRUE:
                {
                alt63=3;
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
                    // Haxe.g:311:19: NEW ^ type LPAREN ! ( exprList )? RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    NEW225=(Token)match(input,NEW,FOLLOW_NEW_in_prefixExpr3785); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NEW225_tree = 
                    (Object)adaptor.create(NEW225)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(NEW225_tree, root_0);
                    }

                    pushFollow(FOLLOW_type_in_prefixExpr3788);
                    type226=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, type226.getTree());

                    LPAREN227=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_prefixExpr3790); if (state.failed) return retval;

                    // Haxe.g:311:37: ( exprList )?
                    int alt61=2;
                    int LA61_0 = input.LA(1);

                    if ( (LA61_0==BANG||LA61_0==CAST||LA61_0==CHARLITERAL||LA61_0==FALSE||LA61_0==FLOATNUM||LA61_0==FUNCTION||LA61_0==IDENTIFIER||LA61_0==INTLITERAL||LA61_0==LBRACE||(LA61_0 >= LONGLITERAL && LA61_0 <= LPAREN)||(LA61_0 >= NEW && LA61_0 <= NULL)||LA61_0==PLUSPLUS||(LA61_0 >= STRINGLITERAL && LA61_0 <= SUB)||LA61_0==SUBSUB||LA61_0==THIS||LA61_0==TILDE||LA61_0==TRUE||LA61_0==UNTYPED) ) {
                        alt61=1;
                    }
                    switch (alt61) {
                        case 1 :
                            // Haxe.g:311:37: exprList
                            {
                            pushFollow(FOLLOW_exprList_in_prefixExpr3793);
                            exprList228=exprList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, exprList228.getTree());

                            }
                            break;

                    }


                    RPAREN229=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_prefixExpr3796); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // Haxe.g:312:19: CAST ^ LPAREN ! expr ( COMMA ! funcType )? RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    CAST230=(Token)match(input,CAST,FOLLOW_CAST_in_prefixExpr3817); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CAST230_tree = 
                    (Object)adaptor.create(CAST230)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(CAST230_tree, root_0);
                    }

                    LPAREN231=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_prefixExpr3820); if (state.failed) return retval;

                    pushFollow(FOLLOW_expr_in_prefixExpr3823);
                    expr232=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr232.getTree());

                    // Haxe.g:312:38: ( COMMA ! funcType )?
                    int alt62=2;
                    int LA62_0 = input.LA(1);

                    if ( (LA62_0==COMMA) ) {
                        alt62=1;
                    }
                    switch (alt62) {
                        case 1 :
                            // Haxe.g:312:39: COMMA ! funcType
                            {
                            COMMA233=(Token)match(input,COMMA,FOLLOW_COMMA_in_prefixExpr3826); if (state.failed) return retval;

                            pushFollow(FOLLOW_funcType_in_prefixExpr3829);
                            funcType234=funcType();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, funcType234.getTree());

                            }
                            break;

                    }


                    RPAREN235=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_prefixExpr3833); if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // Haxe.g:313:19: methodCallOrSlice
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_methodCallOrSlice_in_prefixExpr3854);
                    methodCallOrSlice236=methodCallOrSlice();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, methodCallOrSlice236.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 46, prefixExpr_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "prefixExpr"


    public static class methodCallOrSlice_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "methodCallOrSlice"
    // Haxe.g:316:1: methodCallOrSlice : ( value LPAREN ( exprList )? RPAREN ( pureCallOrSlice )? -> ^( SUFFIX_EXPR[\"MethodCall\", $LPAREN, $RPAREN] value ( exprList )? ( pureCallOrSlice )? ) | value LBRACKET expr RBRACKET ( pureCallOrSlice )? -> ^( SUFFIX_EXPR[\"Slice\", $LBRACKET, $RBRACKET] value expr ( pureCallOrSlice )? ) | value pureCallOrSlice -> ^( value pureCallOrSlice ) | value );
    public final HaxeParser.methodCallOrSlice_return methodCallOrSlice() throws RecognitionException {
        HaxeParser.methodCallOrSlice_return retval = new HaxeParser.methodCallOrSlice_return();
        retval.start = input.LT(1);

        int methodCallOrSlice_StartIndex = input.index();

        Object root_0 = null;

        Token LPAREN238=null;
        Token RPAREN240=null;
        Token LBRACKET243=null;
        Token RBRACKET245=null;
        HaxeParser.value_return value237 =null;

        HaxeParser.exprList_return exprList239 =null;

        HaxeParser.pureCallOrSlice_return pureCallOrSlice241 =null;

        HaxeParser.value_return value242 =null;

        HaxeParser.expr_return expr244 =null;

        HaxeParser.pureCallOrSlice_return pureCallOrSlice246 =null;

        HaxeParser.value_return value247 =null;

        HaxeParser.pureCallOrSlice_return pureCallOrSlice248 =null;

        HaxeParser.value_return value249 =null;


        Object LPAREN238_tree=null;
        Object RPAREN240_tree=null;
        Object LBRACKET243_tree=null;
        Object RBRACKET245_tree=null;
        RewriteRuleTokenStream stream_LBRACKET=new RewriteRuleTokenStream(adaptor,"token LBRACKET");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_RBRACKET=new RewriteRuleTokenStream(adaptor,"token RBRACKET");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_pureCallOrSlice=new RewriteRuleSubtreeStream(adaptor,"rule pureCallOrSlice");
        RewriteRuleSubtreeStream stream_value=new RewriteRuleSubtreeStream(adaptor,"rule value");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_exprList=new RewriteRuleSubtreeStream(adaptor,"rule exprList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 47) ) { return retval; }

            // Haxe.g:317:17: ( value LPAREN ( exprList )? RPAREN ( pureCallOrSlice )? -> ^( SUFFIX_EXPR[\"MethodCall\", $LPAREN, $RPAREN] value ( exprList )? ( pureCallOrSlice )? ) | value LBRACKET expr RBRACKET ( pureCallOrSlice )? -> ^( SUFFIX_EXPR[\"Slice\", $LBRACKET, $RBRACKET] value expr ( pureCallOrSlice )? ) | value pureCallOrSlice -> ^( value pureCallOrSlice ) | value )
            int alt67=4;
            switch ( input.LA(1) ) {
            case LBRACE:
                {
                int LA67_1 = input.LA(2);

                if ( (synpred115_Haxe()) ) {
                    alt67=1;
                }
                else if ( (synpred117_Haxe()) ) {
                    alt67=2;
                }
                else if ( (synpred118_Haxe()) ) {
                    alt67=3;
                }
                else if ( (true) ) {
                    alt67=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 67, 1, input);

                    throw nvae;

                }
                }
                break;
            case FUNCTION:
                {
                int LA67_2 = input.LA(2);

                if ( (synpred115_Haxe()) ) {
                    alt67=1;
                }
                else if ( (synpred117_Haxe()) ) {
                    alt67=2;
                }
                else if ( (synpred118_Haxe()) ) {
                    alt67=3;
                }
                else if ( (true) ) {
                    alt67=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 67, 2, input);

                    throw nvae;

                }
                }
                break;
            case LONGLITERAL:
                {
                int LA67_3 = input.LA(2);

                if ( (synpred115_Haxe()) ) {
                    alt67=1;
                }
                else if ( (synpred117_Haxe()) ) {
                    alt67=2;
                }
                else if ( (synpred118_Haxe()) ) {
                    alt67=3;
                }
                else if ( (true) ) {
                    alt67=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 67, 3, input);

                    throw nvae;

                }
                }
                break;
            case NULL:
                {
                int LA67_4 = input.LA(2);

                if ( (synpred115_Haxe()) ) {
                    alt67=1;
                }
                else if ( (synpred117_Haxe()) ) {
                    alt67=2;
                }
                else if ( (synpred118_Haxe()) ) {
                    alt67=3;
                }
                else if ( (true) ) {
                    alt67=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 67, 4, input);

                    throw nvae;

                }
                }
                break;
            case INTLITERAL:
                {
                int LA67_5 = input.LA(2);

                if ( (synpred115_Haxe()) ) {
                    alt67=1;
                }
                else if ( (synpred117_Haxe()) ) {
                    alt67=2;
                }
                else if ( (synpred118_Haxe()) ) {
                    alt67=3;
                }
                else if ( (true) ) {
                    alt67=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 67, 5, input);

                    throw nvae;

                }
                }
                break;
            case STRINGLITERAL:
                {
                int LA67_6 = input.LA(2);

                if ( (synpred115_Haxe()) ) {
                    alt67=1;
                }
                else if ( (synpred117_Haxe()) ) {
                    alt67=2;
                }
                else if ( (synpred118_Haxe()) ) {
                    alt67=3;
                }
                else if ( (true) ) {
                    alt67=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 67, 6, input);

                    throw nvae;

                }
                }
                break;
            case CHARLITERAL:
                {
                int LA67_7 = input.LA(2);

                if ( (synpred115_Haxe()) ) {
                    alt67=1;
                }
                else if ( (synpred117_Haxe()) ) {
                    alt67=2;
                }
                else if ( (synpred118_Haxe()) ) {
                    alt67=3;
                }
                else if ( (true) ) {
                    alt67=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 67, 7, input);

                    throw nvae;

                }
                }
                break;
            case FLOATNUM:
                {
                int LA67_8 = input.LA(2);

                if ( (synpred115_Haxe()) ) {
                    alt67=1;
                }
                else if ( (synpred117_Haxe()) ) {
                    alt67=2;
                }
                else if ( (synpred118_Haxe()) ) {
                    alt67=3;
                }
                else if ( (true) ) {
                    alt67=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 67, 8, input);

                    throw nvae;

                }
                }
                break;
            case TRUE:
                {
                int LA67_9 = input.LA(2);

                if ( (synpred115_Haxe()) ) {
                    alt67=1;
                }
                else if ( (synpred117_Haxe()) ) {
                    alt67=2;
                }
                else if ( (synpred118_Haxe()) ) {
                    alt67=3;
                }
                else if ( (true) ) {
                    alt67=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 67, 9, input);

                    throw nvae;

                }
                }
                break;
            case FALSE:
                {
                int LA67_10 = input.LA(2);

                if ( (synpred115_Haxe()) ) {
                    alt67=1;
                }
                else if ( (synpred117_Haxe()) ) {
                    alt67=2;
                }
                else if ( (synpred118_Haxe()) ) {
                    alt67=3;
                }
                else if ( (true) ) {
                    alt67=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 67, 10, input);

                    throw nvae;

                }
                }
                break;
            case LPAREN:
                {
                int LA67_11 = input.LA(2);

                if ( (synpred115_Haxe()) ) {
                    alt67=1;
                }
                else if ( (synpred117_Haxe()) ) {
                    alt67=2;
                }
                else if ( (synpred118_Haxe()) ) {
                    alt67=3;
                }
                else if ( (true) ) {
                    alt67=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 67, 11, input);

                    throw nvae;

                }
                }
                break;
            case IDENTIFIER:
                {
                int LA67_12 = input.LA(2);

                if ( (synpred115_Haxe()) ) {
                    alt67=1;
                }
                else if ( (synpred117_Haxe()) ) {
                    alt67=2;
                }
                else if ( (synpred118_Haxe()) ) {
                    alt67=3;
                }
                else if ( (true) ) {
                    alt67=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 67, 12, input);

                    throw nvae;

                }
                }
                break;
            case THIS:
                {
                int LA67_13 = input.LA(2);

                if ( (synpred115_Haxe()) ) {
                    alt67=1;
                }
                else if ( (synpred117_Haxe()) ) {
                    alt67=2;
                }
                else if ( (synpred118_Haxe()) ) {
                    alt67=3;
                }
                else if ( (true) ) {
                    alt67=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 67, 13, input);

                    throw nvae;

                }
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
                    // Haxe.g:317:19: value LPAREN ( exprList )? RPAREN ( pureCallOrSlice )?
                    {
                    pushFollow(FOLLOW_value_in_methodCallOrSlice3912);
                    value237=value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_value.add(value237.getTree());

                    LPAREN238=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_methodCallOrSlice3914); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN238);


                    // Haxe.g:317:32: ( exprList )?
                    int alt64=2;
                    int LA64_0 = input.LA(1);

                    if ( (LA64_0==BANG||LA64_0==CAST||LA64_0==CHARLITERAL||LA64_0==FALSE||LA64_0==FLOATNUM||LA64_0==FUNCTION||LA64_0==IDENTIFIER||LA64_0==INTLITERAL||LA64_0==LBRACE||(LA64_0 >= LONGLITERAL && LA64_0 <= LPAREN)||(LA64_0 >= NEW && LA64_0 <= NULL)||LA64_0==PLUSPLUS||(LA64_0 >= STRINGLITERAL && LA64_0 <= SUB)||LA64_0==SUBSUB||LA64_0==THIS||LA64_0==TILDE||LA64_0==TRUE||LA64_0==UNTYPED) ) {
                        alt64=1;
                    }
                    switch (alt64) {
                        case 1 :
                            // Haxe.g:317:32: exprList
                            {
                            pushFollow(FOLLOW_exprList_in_methodCallOrSlice3916);
                            exprList239=exprList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_exprList.add(exprList239.getTree());

                            }
                            break;

                    }


                    RPAREN240=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_methodCallOrSlice3919); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN240);


                    // Haxe.g:317:49: ( pureCallOrSlice )?
                    int alt65=2;
                    int LA65_0 = input.LA(1);

                    if ( (LA65_0==DOT||LA65_0==LBRACKET) ) {
                        alt65=1;
                    }
                    switch (alt65) {
                        case 1 :
                            // Haxe.g:317:49: pureCallOrSlice
                            {
                            pushFollow(FOLLOW_pureCallOrSlice_in_methodCallOrSlice3921);
                            pureCallOrSlice241=pureCallOrSlice();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_pureCallOrSlice.add(pureCallOrSlice241.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: exprList, value, pureCallOrSlice
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 318:13: -> ^( SUFFIX_EXPR[\"MethodCall\", $LPAREN, $RPAREN] value ( exprList )? ( pureCallOrSlice )? )
                    {
                        // Haxe.g:318:16: ^( SUFFIX_EXPR[\"MethodCall\", $LPAREN, $RPAREN] value ( exprList )? ( pureCallOrSlice )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        new HaxeTree(SUFFIX_EXPR, "MethodCall", LPAREN238, RPAREN240)
                        , root_1);

                        adaptor.addChild(root_1, stream_value.nextTree());

                        // Haxe.g:318:78: ( exprList )?
                        if ( stream_exprList.hasNext() ) {
                            adaptor.addChild(root_1, stream_exprList.nextTree());

                        }
                        stream_exprList.reset();

                        // Haxe.g:318:88: ( pureCallOrSlice )?
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
                    // Haxe.g:319:19: value LBRACKET expr RBRACKET ( pureCallOrSlice )?
                    {
                    pushFollow(FOLLOW_value_in_methodCallOrSlice3972);
                    value242=value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_value.add(value242.getTree());

                    LBRACKET243=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_methodCallOrSlice3974); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LBRACKET.add(LBRACKET243);


                    pushFollow(FOLLOW_expr_in_methodCallOrSlice3976);
                    expr244=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr244.getTree());

                    RBRACKET245=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_methodCallOrSlice3978); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RBRACKET.add(RBRACKET245);


                    // Haxe.g:319:48: ( pureCallOrSlice )?
                    int alt66=2;
                    int LA66_0 = input.LA(1);

                    if ( (LA66_0==DOT||LA66_0==LBRACKET) ) {
                        alt66=1;
                    }
                    switch (alt66) {
                        case 1 :
                            // Haxe.g:319:48: pureCallOrSlice
                            {
                            pushFollow(FOLLOW_pureCallOrSlice_in_methodCallOrSlice3980);
                            pureCallOrSlice246=pureCallOrSlice();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_pureCallOrSlice.add(pureCallOrSlice246.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: value, expr, pureCallOrSlice
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 320:13: -> ^( SUFFIX_EXPR[\"Slice\", $LBRACKET, $RBRACKET] value expr ( pureCallOrSlice )? )
                    {
                        // Haxe.g:320:16: ^( SUFFIX_EXPR[\"Slice\", $LBRACKET, $RBRACKET] value expr ( pureCallOrSlice )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        new HaxeTree(SUFFIX_EXPR, "Slice", LBRACKET243, RBRACKET245)
                        , root_1);

                        adaptor.addChild(root_1, stream_value.nextTree());

                        adaptor.addChild(root_1, stream_expr.nextTree());

                        // Haxe.g:320:82: ( pureCallOrSlice )?
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
                    // Haxe.g:321:19: value pureCallOrSlice
                    {
                    pushFollow(FOLLOW_value_in_methodCallOrSlice4031);
                    value247=value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_value.add(value247.getTree());

                    pushFollow(FOLLOW_pureCallOrSlice_in_methodCallOrSlice4033);
                    pureCallOrSlice248=pureCallOrSlice();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_pureCallOrSlice.add(pureCallOrSlice248.getTree());

                    // AST REWRITE
                    // elements: pureCallOrSlice, value
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 321:41: -> ^( value pureCallOrSlice )
                    {
                        // Haxe.g:321:44: ^( value pureCallOrSlice )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_value.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_pureCallOrSlice.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 4 :
                    // Haxe.g:322:19: value
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_value_in_methodCallOrSlice4061);
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
            if ( state.backtracking>0 ) { memoize(input, 47, methodCallOrSlice_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "methodCallOrSlice"


    public static class pureCallOrSlice_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "pureCallOrSlice"
    // Haxe.g:325:1: pureCallOrSlice : ( LBRACKET expr RBRACKET ( pureCallOrSlice )? -> ^( SUFFIX_EXPR[\"Slice\", $LBRACKET, $RBRACKET] expr ( pureCallOrSlice )? ) | DOT ! methodCallOrSlice );
    public final HaxeParser.pureCallOrSlice_return pureCallOrSlice() throws RecognitionException {
        HaxeParser.pureCallOrSlice_return retval = new HaxeParser.pureCallOrSlice_return();
        retval.start = input.LT(1);

        int pureCallOrSlice_StartIndex = input.index();

        Object root_0 = null;

        Token LBRACKET250=null;
        Token RBRACKET252=null;
        Token DOT254=null;
        HaxeParser.expr_return expr251 =null;

        HaxeParser.pureCallOrSlice_return pureCallOrSlice253 =null;

        HaxeParser.methodCallOrSlice_return methodCallOrSlice255 =null;


        Object LBRACKET250_tree=null;
        Object RBRACKET252_tree=null;
        Object DOT254_tree=null;
        RewriteRuleTokenStream stream_LBRACKET=new RewriteRuleTokenStream(adaptor,"token LBRACKET");
        RewriteRuleTokenStream stream_RBRACKET=new RewriteRuleTokenStream(adaptor,"token RBRACKET");
        RewriteRuleSubtreeStream stream_pureCallOrSlice=new RewriteRuleSubtreeStream(adaptor,"rule pureCallOrSlice");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 48) ) { return retval; }

            // Haxe.g:325:17: ( LBRACKET expr RBRACKET ( pureCallOrSlice )? -> ^( SUFFIX_EXPR[\"Slice\", $LBRACKET, $RBRACKET] expr ( pureCallOrSlice )? ) | DOT ! methodCallOrSlice )
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==LBRACKET) ) {
                alt69=1;
            }
            else if ( (LA69_0==DOT) ) {
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
                    // Haxe.g:325:19: LBRACKET expr RBRACKET ( pureCallOrSlice )?
                    {
                    LBRACKET250=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_pureCallOrSlice4086); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LBRACKET.add(LBRACKET250);


                    pushFollow(FOLLOW_expr_in_pureCallOrSlice4088);
                    expr251=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr251.getTree());

                    RBRACKET252=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_pureCallOrSlice4090); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RBRACKET.add(RBRACKET252);


                    // Haxe.g:325:42: ( pureCallOrSlice )?
                    int alt68=2;
                    int LA68_0 = input.LA(1);

                    if ( (LA68_0==DOT||LA68_0==LBRACKET) ) {
                        alt68=1;
                    }
                    switch (alt68) {
                        case 1 :
                            // Haxe.g:325:42: pureCallOrSlice
                            {
                            pushFollow(FOLLOW_pureCallOrSlice_in_pureCallOrSlice4092);
                            pureCallOrSlice253=pureCallOrSlice();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_pureCallOrSlice.add(pureCallOrSlice253.getTree());

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
                    // 325:59: -> ^( SUFFIX_EXPR[\"Slice\", $LBRACKET, $RBRACKET] expr ( pureCallOrSlice )? )
                    {
                        // Haxe.g:325:62: ^( SUFFIX_EXPR[\"Slice\", $LBRACKET, $RBRACKET] expr ( pureCallOrSlice )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        new HaxeTree(SUFFIX_EXPR, "Slice", LBRACKET250, RBRACKET252)
                        , root_1);

                        adaptor.addChild(root_1, stream_expr.nextTree());

                        // Haxe.g:326:75: ( pureCallOrSlice )?
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
                    // Haxe.g:327:19: DOT ! methodCallOrSlice
                    {
                    root_0 = (Object)adaptor.nil();


                    DOT254=(Token)match(input,DOT,FOLLOW_DOT_in_pureCallOrSlice4145); if (state.failed) return retval;

                    pushFollow(FOLLOW_methodCallOrSlice_in_pureCallOrSlice4148);
                    methodCallOrSlice255=methodCallOrSlice();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, methodCallOrSlice255.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 48, pureCallOrSlice_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "pureCallOrSlice"


    public static class value_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "value"
    // Haxe.g:330:1: value : ( objLit | funcLit | elementarySymbol | LPAREN ! ( expr | statement ) RPAREN !| id typeParamOpt );
    public final HaxeParser.value_return value() throws RecognitionException {
        HaxeParser.value_return retval = new HaxeParser.value_return();
        retval.start = input.LT(1);

        int value_StartIndex = input.index();

        Object root_0 = null;

        Token LPAREN259=null;
        Token RPAREN262=null;
        HaxeParser.objLit_return objLit256 =null;

        HaxeParser.funcLit_return funcLit257 =null;

        HaxeParser.elementarySymbol_return elementarySymbol258 =null;

        HaxeParser.expr_return expr260 =null;

        HaxeParser.statement_return statement261 =null;

        HaxeParser.id_return id263 =null;

        HaxeParser.typeParamOpt_return typeParamOpt264 =null;


        Object LPAREN259_tree=null;
        Object RPAREN262_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 49) ) { return retval; }

            // Haxe.g:332:5: ( objLit | funcLit | elementarySymbol | LPAREN ! ( expr | statement ) RPAREN !| id typeParamOpt )
            int alt71=5;
            switch ( input.LA(1) ) {
            case LBRACE:
                {
                alt71=1;
                }
                break;
            case FUNCTION:
                {
                alt71=2;
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
                alt71=3;
                }
                break;
            case LPAREN:
                {
                alt71=4;
                }
                break;
            case IDENTIFIER:
            case THIS:
                {
                alt71=5;
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
                    // Haxe.g:332:9: objLit
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_objLit_in_value4184);
                    objLit256=objLit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, objLit256.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:333:7: funcLit
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_funcLit_in_value4192);
                    funcLit257=funcLit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, funcLit257.getTree());

                    }
                    break;
                case 3 :
                    // Haxe.g:334:9: elementarySymbol
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_elementarySymbol_in_value4202);
                    elementarySymbol258=elementarySymbol();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, elementarySymbol258.getTree());

                    }
                    break;
                case 4 :
                    // Haxe.g:335:9: LPAREN ! ( expr | statement ) RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    LPAREN259=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_value4212); if (state.failed) return retval;

                    // Haxe.g:335:17: ( expr | statement )
                    int alt70=2;
                    switch ( input.LA(1) ) {
                    case UNTYPED:
                        {
                        int LA70_1 = input.LA(2);

                        if ( (synpred124_Haxe()) ) {
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
                    case SUB:
                        {
                        int LA70_2 = input.LA(2);

                        if ( (synpred124_Haxe()) ) {
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
                    case SUBSUB:
                        {
                        int LA70_3 = input.LA(2);

                        if ( (synpred124_Haxe()) ) {
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
                    case PLUSPLUS:
                        {
                        int LA70_4 = input.LA(2);

                        if ( (synpred124_Haxe()) ) {
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
                    case BANG:
                        {
                        int LA70_5 = input.LA(2);

                        if ( (synpred124_Haxe()) ) {
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
                    case TILDE:
                        {
                        int LA70_6 = input.LA(2);

                        if ( (synpred124_Haxe()) ) {
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
                    case NEW:
                        {
                        int LA70_7 = input.LA(2);

                        if ( (synpred124_Haxe()) ) {
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
                    case CAST:
                        {
                        int LA70_8 = input.LA(2);

                        if ( (synpred124_Haxe()) ) {
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
                    case LBRACE:
                        {
                        int LA70_9 = input.LA(2);

                        if ( (synpred124_Haxe()) ) {
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
                    case FUNCTION:
                        {
                        int LA70_10 = input.LA(2);

                        if ( (synpred124_Haxe()) ) {
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
                    case LONGLITERAL:
                        {
                        int LA70_11 = input.LA(2);

                        if ( (synpred124_Haxe()) ) {
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
                    case NULL:
                        {
                        int LA70_12 = input.LA(2);

                        if ( (synpred124_Haxe()) ) {
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
                    case INTLITERAL:
                        {
                        int LA70_13 = input.LA(2);

                        if ( (synpred124_Haxe()) ) {
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
                    case STRINGLITERAL:
                        {
                        int LA70_14 = input.LA(2);

                        if ( (synpred124_Haxe()) ) {
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
                    case CHARLITERAL:
                        {
                        int LA70_15 = input.LA(2);

                        if ( (synpred124_Haxe()) ) {
                            alt70=1;
                        }
                        else if ( (true) ) {
                            alt70=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 70, 15, input);

                            throw nvae;

                        }
                        }
                        break;
                    case FLOATNUM:
                        {
                        int LA70_16 = input.LA(2);

                        if ( (synpred124_Haxe()) ) {
                            alt70=1;
                        }
                        else if ( (true) ) {
                            alt70=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 70, 16, input);

                            throw nvae;

                        }
                        }
                        break;
                    case TRUE:
                        {
                        int LA70_17 = input.LA(2);

                        if ( (synpred124_Haxe()) ) {
                            alt70=1;
                        }
                        else if ( (true) ) {
                            alt70=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 70, 17, input);

                            throw nvae;

                        }
                        }
                        break;
                    case FALSE:
                        {
                        int LA70_18 = input.LA(2);

                        if ( (synpred124_Haxe()) ) {
                            alt70=1;
                        }
                        else if ( (true) ) {
                            alt70=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 70, 18, input);

                            throw nvae;

                        }
                        }
                        break;
                    case LPAREN:
                        {
                        int LA70_19 = input.LA(2);

                        if ( (synpred124_Haxe()) ) {
                            alt70=1;
                        }
                        else if ( (true) ) {
                            alt70=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 70, 19, input);

                            throw nvae;

                        }
                        }
                        break;
                    case IDENTIFIER:
                        {
                        int LA70_20 = input.LA(2);

                        if ( (synpred124_Haxe()) ) {
                            alt70=1;
                        }
                        else if ( (true) ) {
                            alt70=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 70, 20, input);

                            throw nvae;

                        }
                        }
                        break;
                    case THIS:
                        {
                        int LA70_21 = input.LA(2);

                        if ( (synpred124_Haxe()) ) {
                            alt70=1;
                        }
                        else if ( (true) ) {
                            alt70=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 70, 21, input);

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
                        alt70=2;
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
                            // Haxe.g:335:18: expr
                            {
                            pushFollow(FOLLOW_expr_in_value4216);
                            expr260=expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr260.getTree());

                            }
                            break;
                        case 2 :
                            // Haxe.g:335:23: statement
                            {
                            pushFollow(FOLLOW_statement_in_value4218);
                            statement261=statement();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, statement261.getTree());

                            }
                            break;

                    }


                    RPAREN262=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_value4221); if (state.failed) return retval;

                    }
                    break;
                case 5 :
                    // Haxe.g:337:9: id typeParamOpt
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_id_in_value4237);
                    id263=id();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, id263.getTree());

                    pushFollow(FOLLOW_typeParamOpt_in_value4239);
                    typeParamOpt264=typeParamOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeParamOpt264.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 49, value_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "value"


    public static class topLevelDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "topLevelDecl"
    // Haxe.g:341:1: topLevelDecl : ( classDecl | interfaceDecl | enumDecl | typedefDecl );
    public final HaxeParser.topLevelDecl_return topLevelDecl() throws RecognitionException {
        HaxeParser.topLevelDecl_return retval = new HaxeParser.topLevelDecl_return();
        retval.start = input.LT(1);

        int topLevelDecl_StartIndex = input.index();

        Object root_0 = null;

        HaxeParser.classDecl_return classDecl265 =null;

        HaxeParser.interfaceDecl_return interfaceDecl266 =null;

        HaxeParser.enumDecl_return enumDecl267 =null;

        HaxeParser.typedefDecl_return typedefDecl268 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 50) ) { return retval; }

            // Haxe.g:341:17: ( classDecl | interfaceDecl | enumDecl | typedefDecl )
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
                    // Haxe.g:341:19: classDecl
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_classDecl_in_topLevelDecl4258);
                    classDecl265=classDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, classDecl265.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:342:19: interfaceDecl
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_interfaceDecl_in_topLevelDecl4278);
                    interfaceDecl266=interfaceDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceDecl266.getTree());

                    }
                    break;
                case 3 :
                    // Haxe.g:343:19: enumDecl
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_enumDecl_in_topLevelDecl4298);
                    enumDecl267=enumDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, enumDecl267.getTree());

                    }
                    break;
                case 4 :
                    // Haxe.g:344:19: typedefDecl
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_typedefDecl_in_topLevelDecl4318);
                    typedefDecl268=typedefDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typedefDecl268.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 50, topLevelDecl_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "topLevelDecl"


    public static class enumDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "enumDecl"
    // Haxe.g:347:1: enumDecl : ( topLevelAccess )? ENUM IDENTIFIER typeParamOpt enumBody -> ^( IDENTIFIER ( topLevelAccess )? ( typeParamOpt )? ( enumBody )? ) ;
    public final HaxeParser.enumDecl_return enumDecl() throws RecognitionException {
        HaxeParser.enumDecl_return retval = new HaxeParser.enumDecl_return();
        retval.start = input.LT(1);

        int enumDecl_StartIndex = input.index();

        Object root_0 = null;

        Token ENUM270=null;
        Token IDENTIFIER271=null;
        HaxeParser.topLevelAccess_return topLevelAccess269 =null;

        HaxeParser.typeParamOpt_return typeParamOpt272 =null;

        HaxeParser.enumBody_return enumBody273 =null;


        Object ENUM270_tree=null;
        Object IDENTIFIER271_tree=null;
        RewriteRuleTokenStream stream_ENUM=new RewriteRuleTokenStream(adaptor,"token ENUM");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleSubtreeStream stream_enumBody=new RewriteRuleSubtreeStream(adaptor,"rule enumBody");
        RewriteRuleSubtreeStream stream_typeParamOpt=new RewriteRuleSubtreeStream(adaptor,"rule typeParamOpt");
        RewriteRuleSubtreeStream stream_topLevelAccess=new RewriteRuleSubtreeStream(adaptor,"rule topLevelAccess");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 51) ) { return retval; }

            // Haxe.g:347:17: ( ( topLevelAccess )? ENUM IDENTIFIER typeParamOpt enumBody -> ^( IDENTIFIER ( topLevelAccess )? ( typeParamOpt )? ( enumBody )? ) )
            // Haxe.g:347:19: ( topLevelAccess )? ENUM IDENTIFIER typeParamOpt enumBody
            {
            // Haxe.g:347:19: ( topLevelAccess )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==EXTERN||LA73_0==PRIVATE) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // Haxe.g:347:19: topLevelAccess
                    {
                    pushFollow(FOLLOW_topLevelAccess_in_enumDecl4354);
                    topLevelAccess269=topLevelAccess();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_topLevelAccess.add(topLevelAccess269.getTree());

                    }
                    break;

            }


            ENUM270=(Token)match(input,ENUM,FOLLOW_ENUM_in_enumDecl4357); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ENUM.add(ENUM270);


            IDENTIFIER271=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_enumDecl4359); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER271);


            pushFollow(FOLLOW_typeParamOpt_in_enumDecl4361);
            typeParamOpt272=typeParamOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeParamOpt.add(typeParamOpt272.getTree());

            pushFollow(FOLLOW_enumBody_in_enumDecl4363);
            enumBody273=enumBody();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_enumBody.add(enumBody273.getTree());

            // AST REWRITE
            // elements: topLevelAccess, enumBody, typeParamOpt, IDENTIFIER
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 347:73: -> ^( IDENTIFIER ( topLevelAccess )? ( typeParamOpt )? ( enumBody )? )
            {
                // Haxe.g:347:76: ^( IDENTIFIER ( topLevelAccess )? ( typeParamOpt )? ( enumBody )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                new EnumNode(stream_IDENTIFIER.nextToken())
                , root_1);

                // Haxe.g:347:99: ( topLevelAccess )?
                if ( stream_topLevelAccess.hasNext() ) {
                    adaptor.addChild(root_1, stream_topLevelAccess.nextTree());

                }
                stream_topLevelAccess.reset();

                // Haxe.g:347:115: ( typeParamOpt )?
                if ( stream_typeParamOpt.hasNext() ) {
                    adaptor.addChild(root_1, stream_typeParamOpt.nextTree());

                }
                stream_typeParamOpt.reset();

                // Haxe.g:347:129: ( enumBody )?
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
            if ( state.backtracking>0 ) { memoize(input, 51, enumDecl_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "enumDecl"


    public static class enumBody_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "enumBody"
    // Haxe.g:350:1: enumBody : LBRACE ( enumValueDecl )* RBRACE -> ^( BLOCK_SCOPE[$LBRACE, $RBRACE] ( enumValueDecl )* ) ;
    public final HaxeParser.enumBody_return enumBody() throws RecognitionException {
        HaxeParser.enumBody_return retval = new HaxeParser.enumBody_return();
        retval.start = input.LT(1);

        int enumBody_StartIndex = input.index();

        Object root_0 = null;

        Token LBRACE274=null;
        Token RBRACE276=null;
        HaxeParser.enumValueDecl_return enumValueDecl275 =null;


        Object LBRACE274_tree=null;
        Object RBRACE276_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_enumValueDecl=new RewriteRuleSubtreeStream(adaptor,"rule enumValueDecl");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 52) ) { return retval; }

            // Haxe.g:350:17: ( LBRACE ( enumValueDecl )* RBRACE -> ^( BLOCK_SCOPE[$LBRACE, $RBRACE] ( enumValueDecl )* ) )
            // Haxe.g:350:19: LBRACE ( enumValueDecl )* RBRACE
            {
            LBRACE274=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_enumBody4413); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACE.add(LBRACE274);


            // Haxe.g:350:26: ( enumValueDecl )*
            loop74:
            do {
                int alt74=2;
                int LA74_0 = input.LA(1);

                if ( (LA74_0==IDENTIFIER) ) {
                    alt74=1;
                }


                switch (alt74) {
            	case 1 :
            	    // Haxe.g:350:27: enumValueDecl
            	    {
            	    pushFollow(FOLLOW_enumValueDecl_in_enumBody4416);
            	    enumValueDecl275=enumValueDecl();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_enumValueDecl.add(enumValueDecl275.getTree());

            	    }
            	    break;

            	default :
            	    break loop74;
                }
            } while (true);


            RBRACE276=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_enumBody4420); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACE.add(RBRACE276);


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
            // 350:50: -> ^( BLOCK_SCOPE[$LBRACE, $RBRACE] ( enumValueDecl )* )
            {
                // Haxe.g:350:53: ^( BLOCK_SCOPE[$LBRACE, $RBRACE] ( enumValueDecl )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                new BlockScopeNode(BLOCK_SCOPE, LBRACE274, RBRACE276)
                , root_1);

                // Haxe.g:350:101: ( enumValueDecl )*
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
            if ( state.backtracking>0 ) { memoize(input, 52, enumBody_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "enumBody"


    public static class enumValueDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "enumValueDecl"
    // Haxe.g:353:1: enumValueDecl : ( IDENTIFIER ^ LPAREN ! ( paramList )? RPAREN ! SEMI !| IDENTIFIER SEMI !);
    public final HaxeParser.enumValueDecl_return enumValueDecl() throws RecognitionException {
        HaxeParser.enumValueDecl_return retval = new HaxeParser.enumValueDecl_return();
        retval.start = input.LT(1);

        int enumValueDecl_StartIndex = input.index();

        Object root_0 = null;

        Token IDENTIFIER277=null;
        Token LPAREN278=null;
        Token RPAREN280=null;
        Token SEMI281=null;
        Token IDENTIFIER282=null;
        Token SEMI283=null;
        HaxeParser.paramList_return paramList279 =null;


        Object IDENTIFIER277_tree=null;
        Object LPAREN278_tree=null;
        Object RPAREN280_tree=null;
        Object SEMI281_tree=null;
        Object IDENTIFIER282_tree=null;
        Object SEMI283_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 53) ) { return retval; }

            // Haxe.g:353:17: ( IDENTIFIER ^ LPAREN ! ( paramList )? RPAREN ! SEMI !| IDENTIFIER SEMI !)
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
                    // Haxe.g:353:19: IDENTIFIER ^ LPAREN ! ( paramList )? RPAREN ! SEMI !
                    {
                    root_0 = (Object)adaptor.nil();


                    IDENTIFIER277=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_enumValueDecl4460); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER277_tree = 
                    new VarDeclarationNode(IDENTIFIER277) 
                    ;
                    root_0 = (Object)adaptor.becomeRoot(IDENTIFIER277_tree, root_0);
                    }

                    LPAREN278=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_enumValueDecl4466); if (state.failed) return retval;

                    // Haxe.g:353:59: ( paramList )?
                    int alt75=2;
                    int LA75_0 = input.LA(1);

                    if ( (LA75_0==IDENTIFIER||LA75_0==QUES) ) {
                        alt75=1;
                    }
                    switch (alt75) {
                        case 1 :
                            // Haxe.g:353:59: paramList
                            {
                            pushFollow(FOLLOW_paramList_in_enumValueDecl4469);
                            paramList279=paramList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, paramList279.getTree());

                            }
                            break;

                    }


                    RPAREN280=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_enumValueDecl4472); if (state.failed) return retval;

                    SEMI281=(Token)match(input,SEMI,FOLLOW_SEMI_in_enumValueDecl4475); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // Haxe.g:354:19: IDENTIFIER SEMI !
                    {
                    root_0 = (Object)adaptor.nil();


                    IDENTIFIER282=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_enumValueDecl4498); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER282_tree = 
                    new VarDeclarationNode(IDENTIFIER282) 
                    ;
                    adaptor.addChild(root_0, IDENTIFIER282_tree);
                    }

                    SEMI283=(Token)match(input,SEMI,FOLLOW_SEMI_in_enumValueDecl4503); if (state.failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 53, enumValueDecl_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "enumValueDecl"


    public static class classDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "classDecl"
    // Haxe.g:358:1: classDecl : ( topLevelAccess )? CLASS IDENTIFIER typeParamOpt inheritListOpt classBodyScope -> ^( IDENTIFIER ( topLevelAccess )? ( typeParamOpt )? ( inheritListOpt )? ( classBodyScope )? ) ;
    public final HaxeParser.classDecl_return classDecl() throws RecognitionException {
        HaxeParser.classDecl_return retval = new HaxeParser.classDecl_return();
        retval.start = input.LT(1);

        int classDecl_StartIndex = input.index();

        Object root_0 = null;

        Token CLASS285=null;
        Token IDENTIFIER286=null;
        HaxeParser.topLevelAccess_return topLevelAccess284 =null;

        HaxeParser.typeParamOpt_return typeParamOpt287 =null;

        HaxeParser.inheritListOpt_return inheritListOpt288 =null;

        HaxeParser.classBodyScope_return classBodyScope289 =null;


        Object CLASS285_tree=null;
        Object IDENTIFIER286_tree=null;
        RewriteRuleTokenStream stream_CLASS=new RewriteRuleTokenStream(adaptor,"token CLASS");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleSubtreeStream stream_classBodyScope=new RewriteRuleSubtreeStream(adaptor,"rule classBodyScope");
        RewriteRuleSubtreeStream stream_typeParamOpt=new RewriteRuleSubtreeStream(adaptor,"rule typeParamOpt");
        RewriteRuleSubtreeStream stream_topLevelAccess=new RewriteRuleSubtreeStream(adaptor,"rule topLevelAccess");
        RewriteRuleSubtreeStream stream_inheritListOpt=new RewriteRuleSubtreeStream(adaptor,"rule inheritListOpt");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 54) ) { return retval; }

            // Haxe.g:358:17: ( ( topLevelAccess )? CLASS IDENTIFIER typeParamOpt inheritListOpt classBodyScope -> ^( IDENTIFIER ( topLevelAccess )? ( typeParamOpt )? ( inheritListOpt )? ( classBodyScope )? ) )
            // Haxe.g:358:19: ( topLevelAccess )? CLASS IDENTIFIER typeParamOpt inheritListOpt classBodyScope
            {
            // Haxe.g:358:19: ( topLevelAccess )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==EXTERN||LA77_0==PRIVATE) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // Haxe.g:358:19: topLevelAccess
                    {
                    pushFollow(FOLLOW_topLevelAccess_in_classDecl4552);
                    topLevelAccess284=topLevelAccess();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_topLevelAccess.add(topLevelAccess284.getTree());

                    }
                    break;

            }


            CLASS285=(Token)match(input,CLASS,FOLLOW_CLASS_in_classDecl4555); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CLASS.add(CLASS285);


            IDENTIFIER286=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_classDecl4557); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER286);


            pushFollow(FOLLOW_typeParamOpt_in_classDecl4559);
            typeParamOpt287=typeParamOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeParamOpt.add(typeParamOpt287.getTree());

            pushFollow(FOLLOW_inheritListOpt_in_classDecl4561);
            inheritListOpt288=inheritListOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_inheritListOpt.add(inheritListOpt288.getTree());

            pushFollow(FOLLOW_classBodyScope_in_classDecl4563);
            classBodyScope289=classBodyScope();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_classBodyScope.add(classBodyScope289.getTree());

            // AST REWRITE
            // elements: topLevelAccess, inheritListOpt, typeParamOpt, IDENTIFIER, classBodyScope
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 358:95: -> ^( IDENTIFIER ( topLevelAccess )? ( typeParamOpt )? ( inheritListOpt )? ( classBodyScope )? )
            {
                // Haxe.g:358:98: ^( IDENTIFIER ( topLevelAccess )? ( typeParamOpt )? ( inheritListOpt )? ( classBodyScope )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                new ClassNode(stream_IDENTIFIER.nextToken())
                , root_1);

                // Haxe.g:358:122: ( topLevelAccess )?
                if ( stream_topLevelAccess.hasNext() ) {
                    adaptor.addChild(root_1, stream_topLevelAccess.nextTree());

                }
                stream_topLevelAccess.reset();

                // Haxe.g:358:138: ( typeParamOpt )?
                if ( stream_typeParamOpt.hasNext() ) {
                    adaptor.addChild(root_1, stream_typeParamOpt.nextTree());

                }
                stream_typeParamOpt.reset();

                // Haxe.g:358:152: ( inheritListOpt )?
                if ( stream_inheritListOpt.hasNext() ) {
                    adaptor.addChild(root_1, stream_inheritListOpt.nextTree());

                }
                stream_inheritListOpt.reset();

                // Haxe.g:358:168: ( classBodyScope )?
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
            if ( state.backtracking>0 ) { memoize(input, 54, classDecl_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "classDecl"


    public static class classBodyScope_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "classBodyScope"
    // Haxe.g:361:1: classBodyScope : LBRACE ( classMember )* RBRACE -> ^( BLOCK_SCOPE[$LBRACE, $RBRACE] ( classMember )* ) ;
    public final HaxeParser.classBodyScope_return classBodyScope() throws RecognitionException {
        HaxeParser.classBodyScope_return retval = new HaxeParser.classBodyScope_return();
        retval.start = input.LT(1);

        int classBodyScope_StartIndex = input.index();

        Object root_0 = null;

        Token LBRACE290=null;
        Token RBRACE292=null;
        HaxeParser.classMember_return classMember291 =null;


        Object LBRACE290_tree=null;
        Object RBRACE292_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_classMember=new RewriteRuleSubtreeStream(adaptor,"rule classMember");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 55) ) { return retval; }

            // Haxe.g:361:17: ( LBRACE ( classMember )* RBRACE -> ^( BLOCK_SCOPE[$LBRACE, $RBRACE] ( classMember )* ) )
            // Haxe.g:361:19: LBRACE ( classMember )* RBRACE
            {
            LBRACE290=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_classBodyScope4610); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACE.add(LBRACE290);


            // Haxe.g:361:26: ( classMember )*
            loop78:
            do {
                int alt78=2;
                int LA78_0 = input.LA(1);

                if ( (LA78_0==DYNAMIC||LA78_0==FUNCTION||LA78_0==INLINE||LA78_0==OVERRIDE||LA78_0==PRIVATE||LA78_0==PUBLIC||LA78_0==STATIC||LA78_0==VAR) ) {
                    alt78=1;
                }


                switch (alt78) {
            	case 1 :
            	    // Haxe.g:361:27: classMember
            	    {
            	    pushFollow(FOLLOW_classMember_in_classBodyScope4613);
            	    classMember291=classMember();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_classMember.add(classMember291.getTree());

            	    }
            	    break;

            	default :
            	    break loop78;
                }
            } while (true);


            RBRACE292=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_classBodyScope4617); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACE.add(RBRACE292);


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
            // 361:48: -> ^( BLOCK_SCOPE[$LBRACE, $RBRACE] ( classMember )* )
            {
                // Haxe.g:361:51: ^( BLOCK_SCOPE[$LBRACE, $RBRACE] ( classMember )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                new BlockScopeNode(BLOCK_SCOPE, LBRACE290, RBRACE292)
                , root_1);

                // Haxe.g:361:99: ( classMember )*
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
            if ( state.backtracking>0 ) { memoize(input, 55, classBodyScope_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "classBodyScope"


    public static class classMember_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "classMember"
    // Haxe.g:364:1: classMember : ( varDeclClass | funcDecl );
    public final HaxeParser.classMember_return classMember() throws RecognitionException {
        HaxeParser.classMember_return retval = new HaxeParser.classMember_return();
        retval.start = input.LT(1);

        int classMember_StartIndex = input.index();

        Object root_0 = null;

        HaxeParser.varDeclClass_return varDeclClass293 =null;

        HaxeParser.funcDecl_return funcDecl294 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 56) ) { return retval; }

            // Haxe.g:364:17: ( varDeclClass | funcDecl )
            int alt79=2;
            alt79 = dfa79.predict(input);
            switch (alt79) {
                case 1 :
                    // Haxe.g:364:19: varDeclClass
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_varDeclClass_in_classMember4663);
                    varDeclClass293=varDeclClass();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclClass293.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:365:19: funcDecl
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_funcDecl_in_classMember4683);
                    funcDecl294=funcDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, funcDecl294.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 56, classMember_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "classMember"


    public static class varDeclList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "varDeclList"
    // Haxe.g:369:1: varDeclList : varDecl varDeclList ;
    public final HaxeParser.varDeclList_return varDeclList() throws RecognitionException {
        HaxeParser.varDeclList_return retval = new HaxeParser.varDeclList_return();
        retval.start = input.LT(1);

        int varDeclList_StartIndex = input.index();

        Object root_0 = null;

        HaxeParser.varDecl_return varDecl295 =null;

        HaxeParser.varDeclList_return varDeclList296 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 57) ) { return retval; }

            // Haxe.g:369:17: ( varDecl varDeclList )
            // Haxe.g:369:19: varDecl varDeclList
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_varDecl_in_varDeclList4726);
            varDecl295=varDecl();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, varDecl295.getTree());

            pushFollow(FOLLOW_varDeclList_in_varDeclList4728);
            varDeclList296=varDeclList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclList296.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 57, varDeclList_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "varDeclList"


    public static class varDeclClass_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "varDeclClass"
    // Haxe.g:372:1: varDeclClass : ( declAttrList )? VAR IDENTIFIER ( propDecl )? ( typeTag )? ( varInit )? SEMI -> ^( IDENTIFIER ( declAttrList )? ( propDecl )? ( typeTag )? ( varInit )? ) ;
    public final HaxeParser.varDeclClass_return varDeclClass() throws RecognitionException {
        HaxeParser.varDeclClass_return retval = new HaxeParser.varDeclClass_return();
        retval.start = input.LT(1);

        int varDeclClass_StartIndex = input.index();

        Object root_0 = null;

        Token VAR298=null;
        Token IDENTIFIER299=null;
        Token SEMI303=null;
        HaxeParser.declAttrList_return declAttrList297 =null;

        HaxeParser.propDecl_return propDecl300 =null;

        HaxeParser.typeTag_return typeTag301 =null;

        HaxeParser.varInit_return varInit302 =null;


        Object VAR298_tree=null;
        Object IDENTIFIER299_tree=null;
        Object SEMI303_tree=null;
        RewriteRuleTokenStream stream_VAR=new RewriteRuleTokenStream(adaptor,"token VAR");
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleSubtreeStream stream_typeTag=new RewriteRuleSubtreeStream(adaptor,"rule typeTag");
        RewriteRuleSubtreeStream stream_declAttrList=new RewriteRuleSubtreeStream(adaptor,"rule declAttrList");
        RewriteRuleSubtreeStream stream_propDecl=new RewriteRuleSubtreeStream(adaptor,"rule propDecl");
        RewriteRuleSubtreeStream stream_varInit=new RewriteRuleSubtreeStream(adaptor,"rule varInit");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 58) ) { return retval; }

            // Haxe.g:372:17: ( ( declAttrList )? VAR IDENTIFIER ( propDecl )? ( typeTag )? ( varInit )? SEMI -> ^( IDENTIFIER ( declAttrList )? ( propDecl )? ( typeTag )? ( varInit )? ) )
            // Haxe.g:372:19: ( declAttrList )? VAR IDENTIFIER ( propDecl )? ( typeTag )? ( varInit )? SEMI
            {
            // Haxe.g:372:19: ( declAttrList )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==DYNAMIC||LA80_0==INLINE||LA80_0==OVERRIDE||LA80_0==PRIVATE||LA80_0==PUBLIC||LA80_0==STATIC) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // Haxe.g:372:19: declAttrList
                    {
                    pushFollow(FOLLOW_declAttrList_in_varDeclClass4756);
                    declAttrList297=declAttrList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declAttrList.add(declAttrList297.getTree());

                    }
                    break;

            }


            VAR298=(Token)match(input,VAR,FOLLOW_VAR_in_varDeclClass4759); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_VAR.add(VAR298);


            IDENTIFIER299=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_varDeclClass4761); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER299);


            // Haxe.g:372:48: ( propDecl )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==LPAREN) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // Haxe.g:372:48: propDecl
                    {
                    pushFollow(FOLLOW_propDecl_in_varDeclClass4763);
                    propDecl300=propDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_propDecl.add(propDecl300.getTree());

                    }
                    break;

            }


            // Haxe.g:372:58: ( typeTag )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==COLON) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // Haxe.g:372:58: typeTag
                    {
                    pushFollow(FOLLOW_typeTag_in_varDeclClass4766);
                    typeTag301=typeTag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeTag.add(typeTag301.getTree());

                    }
                    break;

            }


            // Haxe.g:372:67: ( varInit )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==EQ) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // Haxe.g:372:67: varInit
                    {
                    pushFollow(FOLLOW_varInit_in_varDeclClass4769);
                    varInit302=varInit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_varInit.add(varInit302.getTree());

                    }
                    break;

            }


            SEMI303=(Token)match(input,SEMI,FOLLOW_SEMI_in_varDeclClass4772); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SEMI.add(SEMI303);


            // AST REWRITE
            // elements: IDENTIFIER, typeTag, propDecl, varInit, declAttrList
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 372:81: -> ^( IDENTIFIER ( declAttrList )? ( propDecl )? ( typeTag )? ( varInit )? )
            {
                // Haxe.g:372:84: ^( IDENTIFIER ( declAttrList )? ( propDecl )? ( typeTag )? ( varInit )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                new VarDeclarationNode(stream_IDENTIFIER.nextToken())
                , root_1);

                // Haxe.g:372:117: ( declAttrList )?
                if ( stream_declAttrList.hasNext() ) {
                    adaptor.addChild(root_1, stream_declAttrList.nextTree());

                }
                stream_declAttrList.reset();

                // Haxe.g:372:131: ( propDecl )?
                if ( stream_propDecl.hasNext() ) {
                    adaptor.addChild(root_1, stream_propDecl.nextTree());

                }
                stream_propDecl.reset();

                // Haxe.g:372:141: ( typeTag )?
                if ( stream_typeTag.hasNext() ) {
                    adaptor.addChild(root_1, stream_typeTag.nextTree());

                }
                stream_typeTag.reset();

                // Haxe.g:372:150: ( varInit )?
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
            if ( state.backtracking>0 ) { memoize(input, 58, varDeclClass_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "varDeclClass"


    public static class varDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "varDecl"
    // Haxe.g:375:1: varDecl : VAR ! varDeclPartList ( COMMA ! varDeclPartList )* SEMI !;
    public final HaxeParser.varDecl_return varDecl() throws RecognitionException {
        HaxeParser.varDecl_return retval = new HaxeParser.varDecl_return();
        retval.start = input.LT(1);

        int varDecl_StartIndex = input.index();

        Object root_0 = null;

        Token VAR304=null;
        Token COMMA306=null;
        Token SEMI308=null;
        HaxeParser.varDeclPartList_return varDeclPartList305 =null;

        HaxeParser.varDeclPartList_return varDeclPartList307 =null;


        Object VAR304_tree=null;
        Object COMMA306_tree=null;
        Object SEMI308_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 59) ) { return retval; }

            // Haxe.g:375:12: ( VAR ! varDeclPartList ( COMMA ! varDeclPartList )* SEMI !)
            // Haxe.g:375:14: VAR ! varDeclPartList ( COMMA ! varDeclPartList )* SEMI !
            {
            root_0 = (Object)adaptor.nil();


            VAR304=(Token)match(input,VAR,FOLLOW_VAR_in_varDecl4837); if (state.failed) return retval;

            pushFollow(FOLLOW_varDeclPartList_in_varDecl4840);
            varDeclPartList305=varDeclPartList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclPartList305.getTree());

            // Haxe.g:375:35: ( COMMA ! varDeclPartList )*
            loop84:
            do {
                int alt84=2;
                int LA84_0 = input.LA(1);

                if ( (LA84_0==COMMA) ) {
                    alt84=1;
                }


                switch (alt84) {
            	case 1 :
            	    // Haxe.g:375:36: COMMA ! varDeclPartList
            	    {
            	    COMMA306=(Token)match(input,COMMA,FOLLOW_COMMA_in_varDecl4843); if (state.failed) return retval;

            	    pushFollow(FOLLOW_varDeclPartList_in_varDecl4846);
            	    varDeclPartList307=varDeclPartList();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclPartList307.getTree());

            	    }
            	    break;

            	default :
            	    break loop84;
                }
            } while (true);


            SEMI308=(Token)match(input,SEMI,FOLLOW_SEMI_in_varDecl4850); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 59, varDecl_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "varDecl"


    public static class varDeclPartList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "varDeclPartList"
    // Haxe.g:378:1: varDeclPartList : IDENTIFIER ( propDecl )? ( typeTag )? ( varInit )? -> ^( IDENTIFIER ( propDecl )? ( typeTag )? ( varInit )? ) ;
    public final HaxeParser.varDeclPartList_return varDeclPartList() throws RecognitionException {
        HaxeParser.varDeclPartList_return retval = new HaxeParser.varDeclPartList_return();
        retval.start = input.LT(1);

        int varDeclPartList_StartIndex = input.index();

        Object root_0 = null;

        Token IDENTIFIER309=null;
        HaxeParser.propDecl_return propDecl310 =null;

        HaxeParser.typeTag_return typeTag311 =null;

        HaxeParser.varInit_return varInit312 =null;


        Object IDENTIFIER309_tree=null;
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleSubtreeStream stream_typeTag=new RewriteRuleSubtreeStream(adaptor,"rule typeTag");
        RewriteRuleSubtreeStream stream_propDecl=new RewriteRuleSubtreeStream(adaptor,"rule propDecl");
        RewriteRuleSubtreeStream stream_varInit=new RewriteRuleSubtreeStream(adaptor,"rule varInit");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 60) ) { return retval; }

            // Haxe.g:378:17: ( IDENTIFIER ( propDecl )? ( typeTag )? ( varInit )? -> ^( IDENTIFIER ( propDecl )? ( typeTag )? ( varInit )? ) )
            // Haxe.g:378:19: IDENTIFIER ( propDecl )? ( typeTag )? ( varInit )?
            {
            IDENTIFIER309=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_varDeclPartList4871); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER309);


            // Haxe.g:378:30: ( propDecl )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==LPAREN) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // Haxe.g:378:30: propDecl
                    {
                    pushFollow(FOLLOW_propDecl_in_varDeclPartList4873);
                    propDecl310=propDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_propDecl.add(propDecl310.getTree());

                    }
                    break;

            }


            // Haxe.g:378:40: ( typeTag )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==COLON) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // Haxe.g:378:40: typeTag
                    {
                    pushFollow(FOLLOW_typeTag_in_varDeclPartList4876);
                    typeTag311=typeTag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeTag.add(typeTag311.getTree());

                    }
                    break;

            }


            // Haxe.g:378:49: ( varInit )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==EQ) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // Haxe.g:378:49: varInit
                    {
                    pushFollow(FOLLOW_varInit_in_varDeclPartList4879);
                    varInit312=varInit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_varInit.add(varInit312.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: propDecl, IDENTIFIER, typeTag, varInit
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 378:58: -> ^( IDENTIFIER ( propDecl )? ( typeTag )? ( varInit )? )
            {
                // Haxe.g:378:61: ^( IDENTIFIER ( propDecl )? ( typeTag )? ( varInit )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                new VarDeclarationNode(stream_IDENTIFIER.nextToken())
                , root_1);

                // Haxe.g:378:94: ( propDecl )?
                if ( stream_propDecl.hasNext() ) {
                    adaptor.addChild(root_1, stream_propDecl.nextTree());

                }
                stream_propDecl.reset();

                // Haxe.g:378:104: ( typeTag )?
                if ( stream_typeTag.hasNext() ) {
                    adaptor.addChild(root_1, stream_typeTag.nextTree());

                }
                stream_typeTag.reset();

                // Haxe.g:378:113: ( varInit )?
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
            if ( state.backtracking>0 ) { memoize(input, 60, varDeclPartList_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "varDeclPartList"


    public static class propDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "propDecl"
    // Haxe.g:381:1: propDecl : LPAREN a1= propAccessor COMMA a2= propAccessor RPAREN -> ^( PROPERTY_DECL[\"PROPERTY_DECL\"] $a1 $a2) ;
    public final HaxeParser.propDecl_return propDecl() throws RecognitionException {
        HaxeParser.propDecl_return retval = new HaxeParser.propDecl_return();
        retval.start = input.LT(1);

        int propDecl_StartIndex = input.index();

        Object root_0 = null;

        Token LPAREN313=null;
        Token COMMA314=null;
        Token RPAREN315=null;
        HaxeParser.propAccessor_return a1 =null;

        HaxeParser.propAccessor_return a2 =null;


        Object LPAREN313_tree=null;
        Object COMMA314_tree=null;
        Object RPAREN315_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_propAccessor=new RewriteRuleSubtreeStream(adaptor,"rule propAccessor");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 61) ) { return retval; }

            // Haxe.g:381:17: ( LPAREN a1= propAccessor COMMA a2= propAccessor RPAREN -> ^( PROPERTY_DECL[\"PROPERTY_DECL\"] $a1 $a2) )
            // Haxe.g:381:19: LPAREN a1= propAccessor COMMA a2= propAccessor RPAREN
            {
            LPAREN313=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_propDecl4930); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN313);


            pushFollow(FOLLOW_propAccessor_in_propDecl4934);
            a1=propAccessor();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_propAccessor.add(a1.getTree());

            COMMA314=(Token)match(input,COMMA,FOLLOW_COMMA_in_propDecl4936); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COMMA.add(COMMA314);


            pushFollow(FOLLOW_propAccessor_in_propDecl4940);
            a2=propAccessor();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_propAccessor.add(a2.getTree());

            RPAREN315=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_propDecl4942); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN315);


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
            // 381:71: -> ^( PROPERTY_DECL[\"PROPERTY_DECL\"] $a1 $a2)
            {
                // Haxe.g:381:74: ^( PROPERTY_DECL[\"PROPERTY_DECL\"] $a1 $a2)
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                new HaxeTree(PROPERTY_DECL, "PROPERTY_DECL")
                , root_1);

                adaptor.addChild(root_1, stream_a1.nextTree());

                adaptor.addChild(root_1, stream_a2.nextTree());

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
            if ( state.backtracking>0 ) { memoize(input, 61, propDecl_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "propDecl"


    public static class propAccessor_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "propAccessor"
    // Haxe.g:384:1: propAccessor : ( IDENTIFIER | NULL | DEFAULT | DYNAMIC | NEVER );
    public final HaxeParser.propAccessor_return propAccessor() throws RecognitionException {
        HaxeParser.propAccessor_return retval = new HaxeParser.propAccessor_return();
        retval.start = input.LT(1);

        int propAccessor_StartIndex = input.index();

        Object root_0 = null;

        Token set316=null;

        Object set316_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 62) ) { return retval; }

            // Haxe.g:384:17: ( IDENTIFIER | NULL | DEFAULT | DYNAMIC | NEVER )
            // Haxe.g:
            {
            root_0 = (Object)adaptor.nil();


            set316=(Token)input.LT(1);

            if ( input.LA(1)==DEFAULT||input.LA(1)==DYNAMIC||input.LA(1)==IDENTIFIER||input.LA(1)==NEVER||input.LA(1)==NULL ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (Object)adaptor.create(set316)
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
            if ( state.backtracking>0 ) { memoize(input, 62, propAccessor_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "propAccessor"


    public static class varInit_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "varInit"
    // Haxe.g:391:1: varInit : EQ expr -> ^( VAR_INIT[\"VAR_INIT\"] expr ) ;
    public final HaxeParser.varInit_return varInit() throws RecognitionException {
        HaxeParser.varInit_return retval = new HaxeParser.varInit_return();
        retval.start = input.LT(1);

        int varInit_StartIndex = input.index();

        Object root_0 = null;

        Token EQ317=null;
        HaxeParser.expr_return expr318 =null;


        Object EQ317_tree=null;
        RewriteRuleTokenStream stream_EQ=new RewriteRuleTokenStream(adaptor,"token EQ");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 63) ) { return retval; }

            // Haxe.g:391:17: ( EQ expr -> ^( VAR_INIT[\"VAR_INIT\"] expr ) )
            // Haxe.g:391:19: EQ expr
            {
            EQ317=(Token)match(input,EQ,FOLLOW_EQ_in_varInit5101); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_EQ.add(EQ317);


            pushFollow(FOLLOW_expr_in_varInit5103);
            expr318=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr318.getTree());

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
            // 391:27: -> ^( VAR_INIT[\"VAR_INIT\"] expr )
            {
                // Haxe.g:391:30: ^( VAR_INIT[\"VAR_INIT\"] expr )
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
            if ( state.backtracking>0 ) { memoize(input, 63, varInit_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "varInit"


    public static class funcDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "funcDecl"
    // Haxe.g:394:1: funcDecl : ( ( declAttrList )? FUNCTION NEW LPAREN ( paramList )? RPAREN ( typeTag )? block -> ^( FUNCTION NEW ( declAttrList )? ( paramList )? ( typeTag )? ( block )? ) | ( declAttrList )? FUNCTION IDENTIFIER typeParamOpt LPAREN ( paramList )? RPAREN ( typeTag )? block -> ^( FUNCTION IDENTIFIER ( declAttrList )? ( paramList )? ( typeTag )? ( block )? ( typeParamOpt )? ) );
    public final HaxeParser.funcDecl_return funcDecl() throws RecognitionException {
        HaxeParser.funcDecl_return retval = new HaxeParser.funcDecl_return();
        retval.start = input.LT(1);

        int funcDecl_StartIndex = input.index();

        Object root_0 = null;

        Token FUNCTION320=null;
        Token NEW321=null;
        Token LPAREN322=null;
        Token RPAREN324=null;
        Token FUNCTION328=null;
        Token IDENTIFIER329=null;
        Token LPAREN331=null;
        Token RPAREN333=null;
        HaxeParser.declAttrList_return declAttrList319 =null;

        HaxeParser.paramList_return paramList323 =null;

        HaxeParser.typeTag_return typeTag325 =null;

        HaxeParser.block_return block326 =null;

        HaxeParser.declAttrList_return declAttrList327 =null;

        HaxeParser.typeParamOpt_return typeParamOpt330 =null;

        HaxeParser.paramList_return paramList332 =null;

        HaxeParser.typeTag_return typeTag334 =null;

        HaxeParser.block_return block335 =null;


        Object FUNCTION320_tree=null;
        Object NEW321_tree=null;
        Object LPAREN322_tree=null;
        Object RPAREN324_tree=null;
        Object FUNCTION328_tree=null;
        Object IDENTIFIER329_tree=null;
        Object LPAREN331_tree=null;
        Object RPAREN333_tree=null;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 64) ) { return retval; }

            // Haxe.g:394:9: ( ( declAttrList )? FUNCTION NEW LPAREN ( paramList )? RPAREN ( typeTag )? block -> ^( FUNCTION NEW ( declAttrList )? ( paramList )? ( typeTag )? ( block )? ) | ( declAttrList )? FUNCTION IDENTIFIER typeParamOpt LPAREN ( paramList )? RPAREN ( typeTag )? block -> ^( FUNCTION IDENTIFIER ( declAttrList )? ( paramList )? ( typeTag )? ( block )? ( typeParamOpt )? ) )
            int alt94=2;
            alt94 = dfa94.predict(input);
            switch (alt94) {
                case 1 :
                    // Haxe.g:394:13: ( declAttrList )? FUNCTION NEW LPAREN ( paramList )? RPAREN ( typeTag )? block
                    {
                    // Haxe.g:394:13: ( declAttrList )?
                    int alt88=2;
                    int LA88_0 = input.LA(1);

                    if ( (LA88_0==DYNAMIC||LA88_0==INLINE||LA88_0==OVERRIDE||LA88_0==PRIVATE||LA88_0==PUBLIC||LA88_0==STATIC) ) {
                        alt88=1;
                    }
                    switch (alt88) {
                        case 1 :
                            // Haxe.g:394:13: declAttrList
                            {
                            pushFollow(FOLLOW_declAttrList_in_funcDecl5145);
                            declAttrList319=declAttrList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_declAttrList.add(declAttrList319.getTree());

                            }
                            break;

                    }


                    FUNCTION320=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcDecl5148); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION320);


                    NEW321=(Token)match(input,NEW,FOLLOW_NEW_in_funcDecl5150); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEW.add(NEW321);


                    LPAREN322=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcDecl5152); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN322);


                    // Haxe.g:394:47: ( paramList )?
                    int alt89=2;
                    int LA89_0 = input.LA(1);

                    if ( (LA89_0==IDENTIFIER||LA89_0==QUES) ) {
                        alt89=1;
                    }
                    switch (alt89) {
                        case 1 :
                            // Haxe.g:394:47: paramList
                            {
                            pushFollow(FOLLOW_paramList_in_funcDecl5154);
                            paramList323=paramList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_paramList.add(paramList323.getTree());

                            }
                            break;

                    }


                    RPAREN324=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcDecl5157); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN324);


                    // Haxe.g:394:65: ( typeTag )?
                    int alt90=2;
                    int LA90_0 = input.LA(1);

                    if ( (LA90_0==COLON) ) {
                        alt90=1;
                    }
                    switch (alt90) {
                        case 1 :
                            // Haxe.g:394:65: typeTag
                            {
                            pushFollow(FOLLOW_typeTag_in_funcDecl5159);
                            typeTag325=typeTag();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_typeTag.add(typeTag325.getTree());

                            }
                            break;

                    }


                    pushFollow(FOLLOW_block_in_funcDecl5162);
                    block326=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block326.getTree());

                    // AST REWRITE
                    // elements: FUNCTION, typeTag, paramList, declAttrList, block, NEW
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 395:17: -> ^( FUNCTION NEW ( declAttrList )? ( paramList )? ( typeTag )? ( block )? )
                    {
                        // Haxe.g:395:20: ^( FUNCTION NEW ( declAttrList )? ( paramList )? ( typeTag )? ( block )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        new FunctionNode(stream_FUNCTION.nextToken())
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_NEW.nextNode()
                        );

                        // Haxe.g:395:49: ( declAttrList )?
                        if ( stream_declAttrList.hasNext() ) {
                            adaptor.addChild(root_1, stream_declAttrList.nextTree());

                        }
                        stream_declAttrList.reset();

                        // Haxe.g:395:63: ( paramList )?
                        if ( stream_paramList.hasNext() ) {
                            adaptor.addChild(root_1, stream_paramList.nextTree());

                        }
                        stream_paramList.reset();

                        // Haxe.g:395:74: ( typeTag )?
                        if ( stream_typeTag.hasNext() ) {
                            adaptor.addChild(root_1, stream_typeTag.nextTree());

                        }
                        stream_typeTag.reset();

                        // Haxe.g:395:83: ( block )?
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
                    // Haxe.g:396:13: ( declAttrList )? FUNCTION IDENTIFIER typeParamOpt LPAREN ( paramList )? RPAREN ( typeTag )? block
                    {
                    // Haxe.g:396:13: ( declAttrList )?
                    int alt91=2;
                    int LA91_0 = input.LA(1);

                    if ( (LA91_0==DYNAMIC||LA91_0==INLINE||LA91_0==OVERRIDE||LA91_0==PRIVATE||LA91_0==PUBLIC||LA91_0==STATIC) ) {
                        alt91=1;
                    }
                    switch (alt91) {
                        case 1 :
                            // Haxe.g:396:13: declAttrList
                            {
                            pushFollow(FOLLOW_declAttrList_in_funcDecl5217);
                            declAttrList327=declAttrList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_declAttrList.add(declAttrList327.getTree());

                            }
                            break;

                    }


                    FUNCTION328=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcDecl5220); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION328);


                    IDENTIFIER329=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_funcDecl5222); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER329);


                    pushFollow(FOLLOW_typeParamOpt_in_funcDecl5224);
                    typeParamOpt330=typeParamOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeParamOpt.add(typeParamOpt330.getTree());

                    LPAREN331=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcDecl5226); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN331);


                    // Haxe.g:396:67: ( paramList )?
                    int alt92=2;
                    int LA92_0 = input.LA(1);

                    if ( (LA92_0==IDENTIFIER||LA92_0==QUES) ) {
                        alt92=1;
                    }
                    switch (alt92) {
                        case 1 :
                            // Haxe.g:396:67: paramList
                            {
                            pushFollow(FOLLOW_paramList_in_funcDecl5228);
                            paramList332=paramList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_paramList.add(paramList332.getTree());

                            }
                            break;

                    }


                    RPAREN333=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcDecl5231); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN333);


                    // Haxe.g:396:85: ( typeTag )?
                    int alt93=2;
                    int LA93_0 = input.LA(1);

                    if ( (LA93_0==COLON) ) {
                        alt93=1;
                    }
                    switch (alt93) {
                        case 1 :
                            // Haxe.g:396:85: typeTag
                            {
                            pushFollow(FOLLOW_typeTag_in_funcDecl5233);
                            typeTag334=typeTag();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_typeTag.add(typeTag334.getTree());

                            }
                            break;

                    }


                    pushFollow(FOLLOW_block_in_funcDecl5236);
                    block335=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block335.getTree());

                    // AST REWRITE
                    // elements: typeTag, paramList, block, declAttrList, FUNCTION, IDENTIFIER, typeParamOpt
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 397:17: -> ^( FUNCTION IDENTIFIER ( declAttrList )? ( paramList )? ( typeTag )? ( block )? ( typeParamOpt )? )
                    {
                        // Haxe.g:397:20: ^( FUNCTION IDENTIFIER ( declAttrList )? ( paramList )? ( typeTag )? ( block )? ( typeParamOpt )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        new FunctionNode(stream_FUNCTION.nextToken())
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_IDENTIFIER.nextNode()
                        );

                        // Haxe.g:397:56: ( declAttrList )?
                        if ( stream_declAttrList.hasNext() ) {
                            adaptor.addChild(root_1, stream_declAttrList.nextTree());

                        }
                        stream_declAttrList.reset();

                        // Haxe.g:397:70: ( paramList )?
                        if ( stream_paramList.hasNext() ) {
                            adaptor.addChild(root_1, stream_paramList.nextTree());

                        }
                        stream_paramList.reset();

                        // Haxe.g:397:81: ( typeTag )?
                        if ( stream_typeTag.hasNext() ) {
                            adaptor.addChild(root_1, stream_typeTag.nextTree());

                        }
                        stream_typeTag.reset();

                        // Haxe.g:397:90: ( block )?
                        if ( stream_block.hasNext() ) {
                            adaptor.addChild(root_1, stream_block.nextTree());

                        }
                        stream_block.reset();

                        // Haxe.g:397:97: ( typeParamOpt )?
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
            if ( state.backtracking>0 ) { memoize(input, 64, funcDecl_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "funcDecl"


    public static class funcProtoDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "funcProtoDecl"
    // Haxe.g:400:1: funcProtoDecl : ( declAttrList FUNCTION NEW LPAREN ( paramList )? RPAREN ( typeTag )? SEMI -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTag )? ( declAttrList )? ) | declAttrList FUNCTION IDENTIFIER typeParamOpt LPAREN ( paramList )? RPAREN ( typeTag )? SEMI -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTag )? ( declAttrList )? ( typeParamOpt )? ) | FUNCTION NEW LPAREN ( paramList )? RPAREN ( typeTag )? SEMI -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTag )? ) | FUNCTION IDENTIFIER typeParamOpt LPAREN ( paramList )? RPAREN ( typeTag )? SEMI -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTag )? ( typeParamOpt )? ) );
    public final HaxeParser.funcProtoDecl_return funcProtoDecl() throws RecognitionException {
        HaxeParser.funcProtoDecl_return retval = new HaxeParser.funcProtoDecl_return();
        retval.start = input.LT(1);

        int funcProtoDecl_StartIndex = input.index();

        Object root_0 = null;

        Token FUNCTION337=null;
        Token NEW338=null;
        Token LPAREN339=null;
        Token RPAREN341=null;
        Token SEMI343=null;
        Token FUNCTION345=null;
        Token IDENTIFIER346=null;
        Token LPAREN348=null;
        Token RPAREN350=null;
        Token SEMI352=null;
        Token FUNCTION353=null;
        Token NEW354=null;
        Token LPAREN355=null;
        Token RPAREN357=null;
        Token SEMI359=null;
        Token FUNCTION360=null;
        Token IDENTIFIER361=null;
        Token LPAREN363=null;
        Token RPAREN365=null;
        Token SEMI367=null;
        HaxeParser.declAttrList_return declAttrList336 =null;

        HaxeParser.paramList_return paramList340 =null;

        HaxeParser.typeTag_return typeTag342 =null;

        HaxeParser.declAttrList_return declAttrList344 =null;

        HaxeParser.typeParamOpt_return typeParamOpt347 =null;

        HaxeParser.paramList_return paramList349 =null;

        HaxeParser.typeTag_return typeTag351 =null;

        HaxeParser.paramList_return paramList356 =null;

        HaxeParser.typeTag_return typeTag358 =null;

        HaxeParser.typeParamOpt_return typeParamOpt362 =null;

        HaxeParser.paramList_return paramList364 =null;

        HaxeParser.typeTag_return typeTag366 =null;


        Object FUNCTION337_tree=null;
        Object NEW338_tree=null;
        Object LPAREN339_tree=null;
        Object RPAREN341_tree=null;
        Object SEMI343_tree=null;
        Object FUNCTION345_tree=null;
        Object IDENTIFIER346_tree=null;
        Object LPAREN348_tree=null;
        Object RPAREN350_tree=null;
        Object SEMI352_tree=null;
        Object FUNCTION353_tree=null;
        Object NEW354_tree=null;
        Object LPAREN355_tree=null;
        Object RPAREN357_tree=null;
        Object SEMI359_tree=null;
        Object FUNCTION360_tree=null;
        Object IDENTIFIER361_tree=null;
        Object LPAREN363_tree=null;
        Object RPAREN365_tree=null;
        Object SEMI367_tree=null;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 65) ) { return retval; }

            // Haxe.g:401:5: ( declAttrList FUNCTION NEW LPAREN ( paramList )? RPAREN ( typeTag )? SEMI -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTag )? ( declAttrList )? ) | declAttrList FUNCTION IDENTIFIER typeParamOpt LPAREN ( paramList )? RPAREN ( typeTag )? SEMI -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTag )? ( declAttrList )? ( typeParamOpt )? ) | FUNCTION NEW LPAREN ( paramList )? RPAREN ( typeTag )? SEMI -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTag )? ) | FUNCTION IDENTIFIER typeParamOpt LPAREN ( paramList )? RPAREN ( typeTag )? SEMI -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTag )? ( typeParamOpt )? ) )
            int alt103=4;
            alt103 = dfa103.predict(input);
            switch (alt103) {
                case 1 :
                    // Haxe.g:401:9: declAttrList FUNCTION NEW LPAREN ( paramList )? RPAREN ( typeTag )? SEMI
                    {
                    pushFollow(FOLLOW_declAttrList_in_funcProtoDecl5306);
                    declAttrList336=declAttrList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declAttrList.add(declAttrList336.getTree());

                    FUNCTION337=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcProtoDecl5308); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION337);


                    NEW338=(Token)match(input,NEW,FOLLOW_NEW_in_funcProtoDecl5310); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEW.add(NEW338);


                    LPAREN339=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcProtoDecl5312); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN339);


                    // Haxe.g:401:42: ( paramList )?
                    int alt95=2;
                    int LA95_0 = input.LA(1);

                    if ( (LA95_0==IDENTIFIER||LA95_0==QUES) ) {
                        alt95=1;
                    }
                    switch (alt95) {
                        case 1 :
                            // Haxe.g:401:42: paramList
                            {
                            pushFollow(FOLLOW_paramList_in_funcProtoDecl5314);
                            paramList340=paramList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_paramList.add(paramList340.getTree());

                            }
                            break;

                    }


                    RPAREN341=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcProtoDecl5317); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN341);


                    // Haxe.g:401:60: ( typeTag )?
                    int alt96=2;
                    int LA96_0 = input.LA(1);

                    if ( (LA96_0==COLON) ) {
                        alt96=1;
                    }
                    switch (alt96) {
                        case 1 :
                            // Haxe.g:401:60: typeTag
                            {
                            pushFollow(FOLLOW_typeTag_in_funcProtoDecl5319);
                            typeTag342=typeTag();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_typeTag.add(typeTag342.getTree());

                            }
                            break;

                    }


                    SEMI343=(Token)match(input,SEMI,FOLLOW_SEMI_in_funcProtoDecl5322); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI343);


                    // AST REWRITE
                    // elements: typeTag, FUNCTION, paramList, NEW, declAttrList
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 402:13: -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTag )? ( declAttrList )? )
                    {
                        // Haxe.g:402:16: ^( FUNCTION ( NEW )? ( paramList )? ( typeTag )? ( declAttrList )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_FUNCTION.nextNode()
                        , root_1);

                        // Haxe.g:402:27: ( NEW )?
                        if ( stream_NEW.hasNext() ) {
                            adaptor.addChild(root_1, 
                            stream_NEW.nextNode()
                            );

                        }
                        stream_NEW.reset();

                        // Haxe.g:402:32: ( paramList )?
                        if ( stream_paramList.hasNext() ) {
                            adaptor.addChild(root_1, stream_paramList.nextTree());

                        }
                        stream_paramList.reset();

                        // Haxe.g:402:43: ( typeTag )?
                        if ( stream_typeTag.hasNext() ) {
                            adaptor.addChild(root_1, stream_typeTag.nextTree());

                        }
                        stream_typeTag.reset();

                        // Haxe.g:402:52: ( declAttrList )?
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
                    // Haxe.g:403:9: declAttrList FUNCTION IDENTIFIER typeParamOpt LPAREN ( paramList )? RPAREN ( typeTag )? SEMI
                    {
                    pushFollow(FOLLOW_declAttrList_in_funcProtoDecl5363);
                    declAttrList344=declAttrList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declAttrList.add(declAttrList344.getTree());

                    FUNCTION345=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcProtoDecl5365); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION345);


                    IDENTIFIER346=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_funcProtoDecl5367); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER346);


                    pushFollow(FOLLOW_typeParamOpt_in_funcProtoDecl5369);
                    typeParamOpt347=typeParamOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeParamOpt.add(typeParamOpt347.getTree());

                    LPAREN348=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcProtoDecl5371); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN348);


                    // Haxe.g:403:62: ( paramList )?
                    int alt97=2;
                    int LA97_0 = input.LA(1);

                    if ( (LA97_0==IDENTIFIER||LA97_0==QUES) ) {
                        alt97=1;
                    }
                    switch (alt97) {
                        case 1 :
                            // Haxe.g:403:62: paramList
                            {
                            pushFollow(FOLLOW_paramList_in_funcProtoDecl5373);
                            paramList349=paramList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_paramList.add(paramList349.getTree());

                            }
                            break;

                    }


                    RPAREN350=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcProtoDecl5376); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN350);


                    // Haxe.g:403:80: ( typeTag )?
                    int alt98=2;
                    int LA98_0 = input.LA(1);

                    if ( (LA98_0==COLON) ) {
                        alt98=1;
                    }
                    switch (alt98) {
                        case 1 :
                            // Haxe.g:403:80: typeTag
                            {
                            pushFollow(FOLLOW_typeTag_in_funcProtoDecl5378);
                            typeTag351=typeTag();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_typeTag.add(typeTag351.getTree());

                            }
                            break;

                    }


                    SEMI352=(Token)match(input,SEMI,FOLLOW_SEMI_in_funcProtoDecl5381); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI352);


                    // AST REWRITE
                    // elements: declAttrList, typeTag, IDENTIFIER, paramList, typeParamOpt, FUNCTION
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 404:13: -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTag )? ( declAttrList )? ( typeParamOpt )? )
                    {
                        // Haxe.g:404:16: ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTag )? ( declAttrList )? ( typeParamOpt )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_FUNCTION.nextNode()
                        , root_1);

                        // Haxe.g:404:27: ( IDENTIFIER )?
                        if ( stream_IDENTIFIER.hasNext() ) {
                            adaptor.addChild(root_1, 
                            stream_IDENTIFIER.nextNode()
                            );

                        }
                        stream_IDENTIFIER.reset();

                        // Haxe.g:404:39: ( paramList )?
                        if ( stream_paramList.hasNext() ) {
                            adaptor.addChild(root_1, stream_paramList.nextTree());

                        }
                        stream_paramList.reset();

                        // Haxe.g:404:50: ( typeTag )?
                        if ( stream_typeTag.hasNext() ) {
                            adaptor.addChild(root_1, stream_typeTag.nextTree());

                        }
                        stream_typeTag.reset();

                        // Haxe.g:404:59: ( declAttrList )?
                        if ( stream_declAttrList.hasNext() ) {
                            adaptor.addChild(root_1, stream_declAttrList.nextTree());

                        }
                        stream_declAttrList.reset();

                        // Haxe.g:404:73: ( typeParamOpt )?
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
                    // Haxe.g:405:9: FUNCTION NEW LPAREN ( paramList )? RPAREN ( typeTag )? SEMI
                    {
                    FUNCTION353=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcProtoDecl5425); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION353);


                    NEW354=(Token)match(input,NEW,FOLLOW_NEW_in_funcProtoDecl5427); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEW.add(NEW354);


                    LPAREN355=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcProtoDecl5429); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN355);


                    // Haxe.g:405:29: ( paramList )?
                    int alt99=2;
                    int LA99_0 = input.LA(1);

                    if ( (LA99_0==IDENTIFIER||LA99_0==QUES) ) {
                        alt99=1;
                    }
                    switch (alt99) {
                        case 1 :
                            // Haxe.g:405:29: paramList
                            {
                            pushFollow(FOLLOW_paramList_in_funcProtoDecl5431);
                            paramList356=paramList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_paramList.add(paramList356.getTree());

                            }
                            break;

                    }


                    RPAREN357=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcProtoDecl5434); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN357);


                    // Haxe.g:405:47: ( typeTag )?
                    int alt100=2;
                    int LA100_0 = input.LA(1);

                    if ( (LA100_0==COLON) ) {
                        alt100=1;
                    }
                    switch (alt100) {
                        case 1 :
                            // Haxe.g:405:47: typeTag
                            {
                            pushFollow(FOLLOW_typeTag_in_funcProtoDecl5436);
                            typeTag358=typeTag();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_typeTag.add(typeTag358.getTree());

                            }
                            break;

                    }


                    SEMI359=(Token)match(input,SEMI,FOLLOW_SEMI_in_funcProtoDecl5439); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI359);


                    // AST REWRITE
                    // elements: paramList, NEW, FUNCTION, typeTag
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 406:13: -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTag )? )
                    {
                        // Haxe.g:406:16: ^( FUNCTION ( NEW )? ( paramList )? ( typeTag )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_FUNCTION.nextNode()
                        , root_1);

                        // Haxe.g:406:27: ( NEW )?
                        if ( stream_NEW.hasNext() ) {
                            adaptor.addChild(root_1, 
                            stream_NEW.nextNode()
                            );

                        }
                        stream_NEW.reset();

                        // Haxe.g:406:32: ( paramList )?
                        if ( stream_paramList.hasNext() ) {
                            adaptor.addChild(root_1, stream_paramList.nextTree());

                        }
                        stream_paramList.reset();

                        // Haxe.g:406:43: ( typeTag )?
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
                    // Haxe.g:407:9: FUNCTION IDENTIFIER typeParamOpt LPAREN ( paramList )? RPAREN ( typeTag )? SEMI
                    {
                    FUNCTION360=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcProtoDecl5477); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION360);


                    IDENTIFIER361=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_funcProtoDecl5479); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER361);


                    pushFollow(FOLLOW_typeParamOpt_in_funcProtoDecl5481);
                    typeParamOpt362=typeParamOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeParamOpt.add(typeParamOpt362.getTree());

                    LPAREN363=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcProtoDecl5483); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN363);


                    // Haxe.g:407:49: ( paramList )?
                    int alt101=2;
                    int LA101_0 = input.LA(1);

                    if ( (LA101_0==IDENTIFIER||LA101_0==QUES) ) {
                        alt101=1;
                    }
                    switch (alt101) {
                        case 1 :
                            // Haxe.g:407:49: paramList
                            {
                            pushFollow(FOLLOW_paramList_in_funcProtoDecl5485);
                            paramList364=paramList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_paramList.add(paramList364.getTree());

                            }
                            break;

                    }


                    RPAREN365=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcProtoDecl5488); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN365);


                    // Haxe.g:407:67: ( typeTag )?
                    int alt102=2;
                    int LA102_0 = input.LA(1);

                    if ( (LA102_0==COLON) ) {
                        alt102=1;
                    }
                    switch (alt102) {
                        case 1 :
                            // Haxe.g:407:67: typeTag
                            {
                            pushFollow(FOLLOW_typeTag_in_funcProtoDecl5490);
                            typeTag366=typeTag();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_typeTag.add(typeTag366.getTree());

                            }
                            break;

                    }


                    SEMI367=(Token)match(input,SEMI,FOLLOW_SEMI_in_funcProtoDecl5493); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI367);


                    // AST REWRITE
                    // elements: paramList, typeTag, FUNCTION, IDENTIFIER, typeParamOpt
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 408:13: -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTag )? ( typeParamOpt )? )
                    {
                        // Haxe.g:408:16: ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTag )? ( typeParamOpt )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_FUNCTION.nextNode()
                        , root_1);

                        // Haxe.g:408:27: ( IDENTIFIER )?
                        if ( stream_IDENTIFIER.hasNext() ) {
                            adaptor.addChild(root_1, 
                            stream_IDENTIFIER.nextNode()
                            );

                        }
                        stream_IDENTIFIER.reset();

                        // Haxe.g:408:39: ( paramList )?
                        if ( stream_paramList.hasNext() ) {
                            adaptor.addChild(root_1, stream_paramList.nextTree());

                        }
                        stream_paramList.reset();

                        // Haxe.g:408:50: ( typeTag )?
                        if ( stream_typeTag.hasNext() ) {
                            adaptor.addChild(root_1, stream_typeTag.nextTree());

                        }
                        stream_typeTag.reset();

                        // Haxe.g:408:59: ( typeParamOpt )?
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
            if ( state.backtracking>0 ) { memoize(input, 65, funcProtoDecl_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "funcProtoDecl"


    public static class interfaceDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "interfaceDecl"
    // Haxe.g:411:1: interfaceDecl : ( topLevelAccess )? INTERFACE type inheritListOpt LBRACE ! interfaceBody RBRACE !;
    public final HaxeParser.interfaceDecl_return interfaceDecl() throws RecognitionException {
        HaxeParser.interfaceDecl_return retval = new HaxeParser.interfaceDecl_return();
        retval.start = input.LT(1);

        int interfaceDecl_StartIndex = input.index();

        Object root_0 = null;

        Token INTERFACE369=null;
        Token LBRACE372=null;
        Token RBRACE374=null;
        HaxeParser.topLevelAccess_return topLevelAccess368 =null;

        HaxeParser.type_return type370 =null;

        HaxeParser.inheritListOpt_return inheritListOpt371 =null;

        HaxeParser.interfaceBody_return interfaceBody373 =null;


        Object INTERFACE369_tree=null;
        Object LBRACE372_tree=null;
        Object RBRACE374_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 66) ) { return retval; }

            // Haxe.g:412:5: ( ( topLevelAccess )? INTERFACE type inheritListOpt LBRACE ! interfaceBody RBRACE !)
            // Haxe.g:412:9: ( topLevelAccess )? INTERFACE type inheritListOpt LBRACE ! interfaceBody RBRACE !
            {
            root_0 = (Object)adaptor.nil();


            // Haxe.g:412:9: ( topLevelAccess )?
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==EXTERN||LA104_0==PRIVATE) ) {
                alt104=1;
            }
            switch (alt104) {
                case 1 :
                    // Haxe.g:412:9: topLevelAccess
                    {
                    pushFollow(FOLLOW_topLevelAccess_in_interfaceDecl5552);
                    topLevelAccess368=topLevelAccess();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, topLevelAccess368.getTree());

                    }
                    break;

            }


            INTERFACE369=(Token)match(input,INTERFACE,FOLLOW_INTERFACE_in_interfaceDecl5555); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            INTERFACE369_tree = 
            (Object)adaptor.create(INTERFACE369)
            ;
            adaptor.addChild(root_0, INTERFACE369_tree);
            }

            pushFollow(FOLLOW_type_in_interfaceDecl5557);
            type370=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type370.getTree());

            pushFollow(FOLLOW_inheritListOpt_in_interfaceDecl5559);
            inheritListOpt371=inheritListOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, inheritListOpt371.getTree());

            LBRACE372=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_interfaceDecl5561); if (state.failed) return retval;

            pushFollow(FOLLOW_interfaceBody_in_interfaceDecl5564);
            interfaceBody373=interfaceBody();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceBody373.getTree());

            RBRACE374=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_interfaceDecl5566); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 66, interfaceDecl_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "interfaceDecl"


    public static class interfaceBody_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "interfaceBody"
    // Haxe.g:415:1: interfaceBody : ( varDecl interfaceBody | funcProtoDecl interfaceBody |);
    public final HaxeParser.interfaceBody_return interfaceBody() throws RecognitionException {
        HaxeParser.interfaceBody_return retval = new HaxeParser.interfaceBody_return();
        retval.start = input.LT(1);

        int interfaceBody_StartIndex = input.index();

        Object root_0 = null;

        HaxeParser.varDecl_return varDecl375 =null;

        HaxeParser.interfaceBody_return interfaceBody376 =null;

        HaxeParser.funcProtoDecl_return funcProtoDecl377 =null;

        HaxeParser.interfaceBody_return interfaceBody378 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 67) ) { return retval; }

            // Haxe.g:416:5: ( varDecl interfaceBody | funcProtoDecl interfaceBody |)
            int alt105=3;
            switch ( input.LA(1) ) {
            case VAR:
                {
                alt105=1;
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
                alt105=2;
                }
                break;
            case EOF:
            case RBRACE:
                {
                alt105=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 105, 0, input);

                throw nvae;

            }

            switch (alt105) {
                case 1 :
                    // Haxe.g:416:9: varDecl interfaceBody
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_varDecl_in_interfaceBody5590);
                    varDecl375=varDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDecl375.getTree());

                    pushFollow(FOLLOW_interfaceBody_in_interfaceBody5592);
                    interfaceBody376=interfaceBody();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceBody376.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:417:9: funcProtoDecl interfaceBody
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_funcProtoDecl_in_interfaceBody5602);
                    funcProtoDecl377=funcProtoDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, funcProtoDecl377.getTree());

                    pushFollow(FOLLOW_interfaceBody_in_interfaceBody5604);
                    interfaceBody378=interfaceBody();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceBody378.getTree());

                    }
                    break;
                case 3 :
                    // Haxe.g:420:5: 
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
            if ( state.backtracking>0 ) { memoize(input, 67, interfaceBody_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "interfaceBody"


    public static class inheritList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "inheritList"
    // Haxe.g:422:1: inheritList : inherit ( COMMA ! inherit )* ;
    public final HaxeParser.inheritList_return inheritList() throws RecognitionException {
        HaxeParser.inheritList_return retval = new HaxeParser.inheritList_return();
        retval.start = input.LT(1);

        int inheritList_StartIndex = input.index();

        Object root_0 = null;

        Token COMMA380=null;
        HaxeParser.inherit_return inherit379 =null;

        HaxeParser.inherit_return inherit381 =null;


        Object COMMA380_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 68) ) { return retval; }

            // Haxe.g:423:5: ( inherit ( COMMA ! inherit )* )
            // Haxe.g:423:10: inherit ( COMMA ! inherit )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_inherit_in_inheritList5638);
            inherit379=inherit();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, inherit379.getTree());

            // Haxe.g:423:18: ( COMMA ! inherit )*
            loop106:
            do {
                int alt106=2;
                int LA106_0 = input.LA(1);

                if ( (LA106_0==COMMA) ) {
                    alt106=1;
                }


                switch (alt106) {
            	case 1 :
            	    // Haxe.g:423:19: COMMA ! inherit
            	    {
            	    COMMA380=(Token)match(input,COMMA,FOLLOW_COMMA_in_inheritList5641); if (state.failed) return retval;

            	    pushFollow(FOLLOW_inherit_in_inheritList5644);
            	    inherit381=inherit();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, inherit381.getTree());

            	    }
            	    break;

            	default :
            	    break loop106;
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
            if ( state.backtracking>0 ) { memoize(input, 68, inheritList_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "inheritList"


    public static class inheritListOpt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "inheritListOpt"
    // Haxe.g:426:1: inheritListOpt : ( inheritList -> ^( INHERIT_LIST_OPT[\"INHERIT_LIST_OPT\"] ( inheritList )? ) |);
    public final HaxeParser.inheritListOpt_return inheritListOpt() throws RecognitionException {
        HaxeParser.inheritListOpt_return retval = new HaxeParser.inheritListOpt_return();
        retval.start = input.LT(1);

        int inheritListOpt_StartIndex = input.index();

        Object root_0 = null;

        HaxeParser.inheritList_return inheritList382 =null;


        RewriteRuleSubtreeStream stream_inheritList=new RewriteRuleSubtreeStream(adaptor,"rule inheritList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 69) ) { return retval; }

            // Haxe.g:427:5: ( inheritList -> ^( INHERIT_LIST_OPT[\"INHERIT_LIST_OPT\"] ( inheritList )? ) |)
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==EXTENDS||LA107_0==IMPLEMENTS) ) {
                alt107=1;
            }
            else if ( (LA107_0==LBRACE) ) {
                alt107=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 107, 0, input);

                throw nvae;

            }
            switch (alt107) {
                case 1 :
                    // Haxe.g:427:10: inheritList
                    {
                    pushFollow(FOLLOW_inheritList_in_inheritListOpt5674);
                    inheritList382=inheritList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_inheritList.add(inheritList382.getTree());

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
                    // 427:22: -> ^( INHERIT_LIST_OPT[\"INHERIT_LIST_OPT\"] ( inheritList )? )
                    {
                        // Haxe.g:427:25: ^( INHERIT_LIST_OPT[\"INHERIT_LIST_OPT\"] ( inheritList )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        new HaxeTree(INHERIT_LIST_OPT, "INHERIT_LIST_OPT")
                        , root_1);

                        // Haxe.g:427:74: ( inheritList )?
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
                    // Haxe.g:429:5: 
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
            if ( state.backtracking>0 ) { memoize(input, 69, inheritListOpt_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "inheritListOpt"


    public static class inherit_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "inherit"
    // Haxe.g:431:1: inherit : ( EXTENDS type -> ^( EXTENDS ( type )? ) | IMPLEMENTS type -> ^( IMPLEMENTS ( type )? ) );
    public final HaxeParser.inherit_return inherit() throws RecognitionException {
        HaxeParser.inherit_return retval = new HaxeParser.inherit_return();
        retval.start = input.LT(1);

        int inherit_StartIndex = input.index();

        Object root_0 = null;

        Token EXTENDS383=null;
        Token IMPLEMENTS385=null;
        HaxeParser.type_return type384 =null;

        HaxeParser.type_return type386 =null;


        Object EXTENDS383_tree=null;
        Object IMPLEMENTS385_tree=null;
        RewriteRuleTokenStream stream_IMPLEMENTS=new RewriteRuleTokenStream(adaptor,"token IMPLEMENTS");
        RewriteRuleTokenStream stream_EXTENDS=new RewriteRuleTokenStream(adaptor,"token EXTENDS");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 70) ) { return retval; }

            // Haxe.g:431:12: ( EXTENDS type -> ^( EXTENDS ( type )? ) | IMPLEMENTS type -> ^( IMPLEMENTS ( type )? ) )
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==EXTENDS) ) {
                alt108=1;
            }
            else if ( (LA108_0==IMPLEMENTS) ) {
                alt108=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 108, 0, input);

                throw nvae;

            }
            switch (alt108) {
                case 1 :
                    // Haxe.g:431:17: EXTENDS type
                    {
                    EXTENDS383=(Token)match(input,EXTENDS,FOLLOW_EXTENDS_in_inherit5720); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EXTENDS.add(EXTENDS383);


                    pushFollow(FOLLOW_type_in_inherit5722);
                    type384=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type384.getTree());

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
                    // 431:34: -> ^( EXTENDS ( type )? )
                    {
                        // Haxe.g:431:37: ^( EXTENDS ( type )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_EXTENDS.nextNode()
                        , root_1);

                        // Haxe.g:431:47: ( type )?
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
                    // Haxe.g:432:14: IMPLEMENTS type
                    {
                    IMPLEMENTS385=(Token)match(input,IMPLEMENTS,FOLLOW_IMPLEMENTS_in_inherit5750); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IMPLEMENTS.add(IMPLEMENTS385);


                    pushFollow(FOLLOW_type_in_inherit5752);
                    type386=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type386.getTree());

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
                    // 432:30: -> ^( IMPLEMENTS ( type )? )
                    {
                        // Haxe.g:432:33: ^( IMPLEMENTS ( type )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_IMPLEMENTS.nextNode()
                        , root_1);

                        // Haxe.g:432:46: ( type )?
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
            if ( state.backtracking>0 ) { memoize(input, 70, inherit_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "inherit"


    public static class typedefDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "typedefDecl"
    // Haxe.g:435:1: typedefDecl : TYPEDEF IDENTIFIER EQ funcType ;
    public final HaxeParser.typedefDecl_return typedefDecl() throws RecognitionException {
        HaxeParser.typedefDecl_return retval = new HaxeParser.typedefDecl_return();
        retval.start = input.LT(1);

        int typedefDecl_StartIndex = input.index();

        Object root_0 = null;

        Token TYPEDEF387=null;
        Token IDENTIFIER388=null;
        Token EQ389=null;
        HaxeParser.funcType_return funcType390 =null;


        Object TYPEDEF387_tree=null;
        Object IDENTIFIER388_tree=null;
        Object EQ389_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 71) ) { return retval; }

            // Haxe.g:436:5: ( TYPEDEF IDENTIFIER EQ funcType )
            // Haxe.g:436:10: TYPEDEF IDENTIFIER EQ funcType
            {
            root_0 = (Object)adaptor.nil();


            TYPEDEF387=(Token)match(input,TYPEDEF,FOLLOW_TYPEDEF_in_typedefDecl5792); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TYPEDEF387_tree = 
            (Object)adaptor.create(TYPEDEF387)
            ;
            adaptor.addChild(root_0, TYPEDEF387_tree);
            }

            IDENTIFIER388=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_typedefDecl5794); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER388_tree = 
            (Object)adaptor.create(IDENTIFIER388)
            ;
            adaptor.addChild(root_0, IDENTIFIER388_tree);
            }

            EQ389=(Token)match(input,EQ,FOLLOW_EQ_in_typedefDecl5796); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            EQ389_tree = 
            (Object)adaptor.create(EQ389)
            ;
            adaptor.addChild(root_0, EQ389_tree);
            }

            pushFollow(FOLLOW_funcType_in_typedefDecl5798);
            funcType390=funcType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, funcType390.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 71, typedefDecl_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "typedefDecl"


    public static class typeExtend_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "typeExtend"
    // Haxe.g:439:1: typeExtend : GT ^ funcType COMMA !;
    public final HaxeParser.typeExtend_return typeExtend() throws RecognitionException {
        HaxeParser.typeExtend_return retval = new HaxeParser.typeExtend_return();
        retval.start = input.LT(1);

        int typeExtend_StartIndex = input.index();

        Object root_0 = null;

        Token GT391=null;
        Token COMMA393=null;
        HaxeParser.funcType_return funcType392 =null;


        Object GT391_tree=null;
        Object COMMA393_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 72) ) { return retval; }

            // Haxe.g:439:17: ( GT ^ funcType COMMA !)
            // Haxe.g:439:19: GT ^ funcType COMMA !
            {
            root_0 = (Object)adaptor.nil();


            GT391=(Token)match(input,GT,FOLLOW_GT_in_typeExtend5820); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            GT391_tree = 
            (Object)adaptor.create(GT391)
            ;
            root_0 = (Object)adaptor.becomeRoot(GT391_tree, root_0);
            }

            pushFollow(FOLLOW_funcType_in_typeExtend5823);
            funcType392=funcType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, funcType392.getTree());

            COMMA393=(Token)match(input,COMMA,FOLLOW_COMMA_in_typeExtend5825); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 72, typeExtend_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "typeExtend"


    public static class anonType_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "anonType"
    // Haxe.g:442:1: anonType : LBRACE ! ( anonTypeFieldList | varDeclList | typeExtend ( anonTypeFieldList | varDeclList )? )? RBRACE !;
    public final HaxeParser.anonType_return anonType() throws RecognitionException {
        HaxeParser.anonType_return retval = new HaxeParser.anonType_return();
        retval.start = input.LT(1);

        int anonType_StartIndex = input.index();

        Object root_0 = null;

        Token LBRACE394=null;
        Token RBRACE400=null;
        HaxeParser.anonTypeFieldList_return anonTypeFieldList395 =null;

        HaxeParser.varDeclList_return varDeclList396 =null;

        HaxeParser.typeExtend_return typeExtend397 =null;

        HaxeParser.anonTypeFieldList_return anonTypeFieldList398 =null;

        HaxeParser.varDeclList_return varDeclList399 =null;


        Object LBRACE394_tree=null;
        Object RBRACE400_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 73) ) { return retval; }

            // Haxe.g:442:17: ( LBRACE ! ( anonTypeFieldList | varDeclList | typeExtend ( anonTypeFieldList | varDeclList )? )? RBRACE !)
            // Haxe.g:442:19: LBRACE ! ( anonTypeFieldList | varDeclList | typeExtend ( anonTypeFieldList | varDeclList )? )? RBRACE !
            {
            root_0 = (Object)adaptor.nil();


            LBRACE394=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_anonType5862); if (state.failed) return retval;

            // Haxe.g:443:21: ( anonTypeFieldList | varDeclList | typeExtend ( anonTypeFieldList | varDeclList )? )?
            int alt110=4;
            switch ( input.LA(1) ) {
                case IDENTIFIER:
                    {
                    alt110=1;
                    }
                    break;
                case VAR:
                    {
                    alt110=2;
                    }
                    break;
                case GT:
                    {
                    alt110=3;
                    }
                    break;
            }

            switch (alt110) {
                case 1 :
                    // Haxe.g:444:23: anonTypeFieldList
                    {
                    pushFollow(FOLLOW_anonTypeFieldList_in_anonType5910);
                    anonTypeFieldList395=anonTypeFieldList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, anonTypeFieldList395.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:445:23: varDeclList
                    {
                    pushFollow(FOLLOW_varDeclList_in_anonType5935);
                    varDeclList396=varDeclList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclList396.getTree());

                    }
                    break;
                case 3 :
                    // Haxe.g:446:23: typeExtend ( anonTypeFieldList | varDeclList )?
                    {
                    pushFollow(FOLLOW_typeExtend_in_anonType5960);
                    typeExtend397=typeExtend();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeExtend397.getTree());

                    // Haxe.g:446:34: ( anonTypeFieldList | varDeclList )?
                    int alt109=3;
                    int LA109_0 = input.LA(1);

                    if ( (LA109_0==IDENTIFIER) ) {
                        alt109=1;
                    }
                    else if ( (LA109_0==VAR) ) {
                        alt109=2;
                    }
                    switch (alt109) {
                        case 1 :
                            // Haxe.g:446:36: anonTypeFieldList
                            {
                            pushFollow(FOLLOW_anonTypeFieldList_in_anonType5964);
                            anonTypeFieldList398=anonTypeFieldList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, anonTypeFieldList398.getTree());

                            }
                            break;
                        case 2 :
                            // Haxe.g:446:56: varDeclList
                            {
                            pushFollow(FOLLOW_varDeclList_in_anonType5968);
                            varDeclList399=varDeclList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclList399.getTree());

                            }
                            break;

                    }


                    }
                    break;

            }


            RBRACE400=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_anonType6015); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 73, anonType_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "anonType"


    public static class anonTypeFieldList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "anonTypeFieldList"
    // Haxe.g:451:1: anonTypeFieldList : anonTypeField ( COMMA ! anonTypeField )* ;
    public final HaxeParser.anonTypeFieldList_return anonTypeFieldList() throws RecognitionException {
        HaxeParser.anonTypeFieldList_return retval = new HaxeParser.anonTypeFieldList_return();
        retval.start = input.LT(1);

        int anonTypeFieldList_StartIndex = input.index();

        Object root_0 = null;

        Token COMMA402=null;
        HaxeParser.anonTypeField_return anonTypeField401 =null;

        HaxeParser.anonTypeField_return anonTypeField403 =null;


        Object COMMA402_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 74) ) { return retval; }

            // Haxe.g:452:17: ( anonTypeField ( COMMA ! anonTypeField )* )
            // Haxe.g:452:19: anonTypeField ( COMMA ! anonTypeField )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_anonTypeField_in_anonTypeFieldList6062);
            anonTypeField401=anonTypeField();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, anonTypeField401.getTree());

            // Haxe.g:452:33: ( COMMA ! anonTypeField )*
            loop111:
            do {
                int alt111=2;
                int LA111_0 = input.LA(1);

                if ( (LA111_0==COMMA) ) {
                    alt111=1;
                }


                switch (alt111) {
            	case 1 :
            	    // Haxe.g:452:34: COMMA ! anonTypeField
            	    {
            	    COMMA402=(Token)match(input,COMMA,FOLLOW_COMMA_in_anonTypeFieldList6065); if (state.failed) return retval;

            	    pushFollow(FOLLOW_anonTypeField_in_anonTypeFieldList6068);
            	    anonTypeField403=anonTypeField();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, anonTypeField403.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 74, anonTypeFieldList_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "anonTypeFieldList"


    public static class objLit_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "objLit"
    // Haxe.g:455:1: objLit : LBRACE ! objLitElemList RBRACE !;
    public final HaxeParser.objLit_return objLit() throws RecognitionException {
        HaxeParser.objLit_return retval = new HaxeParser.objLit_return();
        retval.start = input.LT(1);

        int objLit_StartIndex = input.index();

        Object root_0 = null;

        Token LBRACE404=null;
        Token RBRACE406=null;
        HaxeParser.objLitElemList_return objLitElemList405 =null;


        Object LBRACE404_tree=null;
        Object RBRACE406_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 75) ) { return retval; }

            // Haxe.g:455:17: ( LBRACE ! objLitElemList RBRACE !)
            // Haxe.g:455:19: LBRACE ! objLitElemList RBRACE !
            {
            root_0 = (Object)adaptor.nil();


            LBRACE404=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_objLit6104); if (state.failed) return retval;

            pushFollow(FOLLOW_objLitElemList_in_objLit6107);
            objLitElemList405=objLitElemList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, objLitElemList405.getTree());

            RBRACE406=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_objLit6109); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 75, objLit_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "objLit"


    public static class anonTypeField_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "anonTypeField"
    // Haxe.g:458:1: anonTypeField : IDENTIFIER COLON ! funcType ;
    public final HaxeParser.anonTypeField_return anonTypeField() throws RecognitionException {
        HaxeParser.anonTypeField_return retval = new HaxeParser.anonTypeField_return();
        retval.start = input.LT(1);

        int anonTypeField_StartIndex = input.index();

        Object root_0 = null;

        Token IDENTIFIER407=null;
        Token COLON408=null;
        HaxeParser.funcType_return funcType409 =null;


        Object IDENTIFIER407_tree=null;
        Object COLON408_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 76) ) { return retval; }

            // Haxe.g:458:17: ( IDENTIFIER COLON ! funcType )
            // Haxe.g:458:19: IDENTIFIER COLON ! funcType
            {
            root_0 = (Object)adaptor.nil();


            IDENTIFIER407=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_anonTypeField6137); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER407_tree = 
            (Object)adaptor.create(IDENTIFIER407)
            ;
            adaptor.addChild(root_0, IDENTIFIER407_tree);
            }

            COLON408=(Token)match(input,COLON,FOLLOW_COLON_in_anonTypeField6139); if (state.failed) return retval;

            pushFollow(FOLLOW_funcType_in_anonTypeField6142);
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
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 76, anonTypeField_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "anonTypeField"


    public static class objLitElemList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "objLitElemList"
    // Haxe.g:461:1: objLitElemList : objLitElem ( COMMA ! objLitElem )* ;
    public final HaxeParser.objLitElemList_return objLitElemList() throws RecognitionException {
        HaxeParser.objLitElemList_return retval = new HaxeParser.objLitElemList_return();
        retval.start = input.LT(1);

        int objLitElemList_StartIndex = input.index();

        Object root_0 = null;

        Token COMMA411=null;
        HaxeParser.objLitElem_return objLitElem410 =null;

        HaxeParser.objLitElem_return objLitElem412 =null;


        Object COMMA411_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 77) ) { return retval; }

            // Haxe.g:461:17: ( objLitElem ( COMMA ! objLitElem )* )
            // Haxe.g:461:19: objLitElem ( COMMA ! objLitElem )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_objLitElem_in_objLitElemList6172);
            objLitElem410=objLitElem();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, objLitElem410.getTree());

            // Haxe.g:461:30: ( COMMA ! objLitElem )*
            loop112:
            do {
                int alt112=2;
                int LA112_0 = input.LA(1);

                if ( (LA112_0==COMMA) ) {
                    alt112=1;
                }


                switch (alt112) {
            	case 1 :
            	    // Haxe.g:461:31: COMMA ! objLitElem
            	    {
            	    COMMA411=(Token)match(input,COMMA,FOLLOW_COMMA_in_objLitElemList6175); if (state.failed) return retval;

            	    pushFollow(FOLLOW_objLitElem_in_objLitElemList6178);
            	    objLitElem412=objLitElem();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, objLitElem412.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 77, objLitElemList_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "objLitElemList"


    public static class objLitElem_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "objLitElem"
    // Haxe.g:464:1: objLitElem : IDENTIFIER COLON ! expr ;
    public final HaxeParser.objLitElem_return objLitElem() throws RecognitionException {
        HaxeParser.objLitElem_return retval = new HaxeParser.objLitElem_return();
        retval.start = input.LT(1);

        int objLitElem_StartIndex = input.index();

        Object root_0 = null;

        Token IDENTIFIER413=null;
        Token COLON414=null;
        HaxeParser.expr_return expr415 =null;


        Object IDENTIFIER413_tree=null;
        Object COLON414_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 78) ) { return retval; }

            // Haxe.g:464:17: ( IDENTIFIER COLON ! expr )
            // Haxe.g:464:19: IDENTIFIER COLON ! expr
            {
            root_0 = (Object)adaptor.nil();


            IDENTIFIER413=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_objLitElem6214); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER413_tree = 
            (Object)adaptor.create(IDENTIFIER413)
            ;
            adaptor.addChild(root_0, IDENTIFIER413_tree);
            }

            COLON414=(Token)match(input,COLON,FOLLOW_COLON_in_objLitElem6216); if (state.failed) return retval;

            pushFollow(FOLLOW_expr_in_objLitElem6219);
            expr415=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr415.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 78, objLitElem_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "objLitElem"


    public static class elementarySymbol_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "elementarySymbol"
    // Haxe.g:468:1: elementarySymbol : ( LONGLITERAL -> LONGLITERAL[$LONGLITERAL, \"INT\"] | NULL -> NULL[$NULL,\"Unknown<0>\"] | INTLITERAL -> INTLITERAL[$INTLITERAL, \"INT\"] | STRINGLITERAL -> STRINGLITERAL[$STRINGLITERAL,\"STRING\"] | CHARLITERAL -> CHARLITERAL[$CHARLITERAL, \"STRING\"] | FLOATNUM -> FLOATNUM[$FLOATNUM, \"FLOAT\"] | TRUE -> TRUE[$TRUE,\"BOOL\"] | FALSE -> FALSE[$FALSE,\"BOOL\"] );
    public final HaxeParser.elementarySymbol_return elementarySymbol() throws RecognitionException {
        HaxeParser.elementarySymbol_return retval = new HaxeParser.elementarySymbol_return();
        retval.start = input.LT(1);

        int elementarySymbol_StartIndex = input.index();

        Object root_0 = null;

        Token LONGLITERAL416=null;
        Token NULL417=null;
        Token INTLITERAL418=null;
        Token STRINGLITERAL419=null;
        Token CHARLITERAL420=null;
        Token FLOATNUM421=null;
        Token TRUE422=null;
        Token FALSE423=null;

        Object LONGLITERAL416_tree=null;
        Object NULL417_tree=null;
        Object INTLITERAL418_tree=null;
        Object STRINGLITERAL419_tree=null;
        Object CHARLITERAL420_tree=null;
        Object FLOATNUM421_tree=null;
        Object TRUE422_tree=null;
        Object FALSE423_tree=null;
        RewriteRuleTokenStream stream_INTLITERAL=new RewriteRuleTokenStream(adaptor,"token INTLITERAL");
        RewriteRuleTokenStream stream_FALSE=new RewriteRuleTokenStream(adaptor,"token FALSE");
        RewriteRuleTokenStream stream_TRUE=new RewriteRuleTokenStream(adaptor,"token TRUE");
        RewriteRuleTokenStream stream_FLOATNUM=new RewriteRuleTokenStream(adaptor,"token FLOATNUM");
        RewriteRuleTokenStream stream_STRINGLITERAL=new RewriteRuleTokenStream(adaptor,"token STRINGLITERAL");
        RewriteRuleTokenStream stream_NULL=new RewriteRuleTokenStream(adaptor,"token NULL");
        RewriteRuleTokenStream stream_CHARLITERAL=new RewriteRuleTokenStream(adaptor,"token CHARLITERAL");
        RewriteRuleTokenStream stream_LONGLITERAL=new RewriteRuleTokenStream(adaptor,"token LONGLITERAL");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 79) ) { return retval; }

            // Haxe.g:469:5: ( LONGLITERAL -> LONGLITERAL[$LONGLITERAL, \"INT\"] | NULL -> NULL[$NULL,\"Unknown<0>\"] | INTLITERAL -> INTLITERAL[$INTLITERAL, \"INT\"] | STRINGLITERAL -> STRINGLITERAL[$STRINGLITERAL,\"STRING\"] | CHARLITERAL -> CHARLITERAL[$CHARLITERAL, \"STRING\"] | FLOATNUM -> FLOATNUM[$FLOATNUM, \"FLOAT\"] | TRUE -> TRUE[$TRUE,\"BOOL\"] | FALSE -> FALSE[$FALSE,\"BOOL\"] )
            int alt113=8;
            switch ( input.LA(1) ) {
            case LONGLITERAL:
                {
                alt113=1;
                }
                break;
            case NULL:
                {
                alt113=2;
                }
                break;
            case INTLITERAL:
                {
                alt113=3;
                }
                break;
            case STRINGLITERAL:
                {
                alt113=4;
                }
                break;
            case CHARLITERAL:
                {
                alt113=5;
                }
                break;
            case FLOATNUM:
                {
                alt113=6;
                }
                break;
            case TRUE:
                {
                alt113=7;
                }
                break;
            case FALSE:
                {
                alt113=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 113, 0, input);

                throw nvae;

            }

            switch (alt113) {
                case 1 :
                    // Haxe.g:469:7: LONGLITERAL
                    {
                    LONGLITERAL416=(Token)match(input,LONGLITERAL,FOLLOW_LONGLITERAL_in_elementarySymbol6253); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LONGLITERAL.add(LONGLITERAL416);


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
                    // 469:21: -> LONGLITERAL[$LONGLITERAL, \"INT\"]
                    {
                        adaptor.addChild(root_0, 
                        new ConstantNode(LONGLITERAL, LONGLITERAL416, "INT")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // Haxe.g:470:7: NULL
                    {
                    NULL417=(Token)match(input,NULL,FOLLOW_NULL_in_elementarySymbol6271); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NULL.add(NULL417);


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
                    // 470:21: -> NULL[$NULL,\"Unknown<0>\"]
                    {
                        adaptor.addChild(root_0, 
                        new ConstantNode(NULL, NULL417, "Unknown<0>")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 3 :
                    // Haxe.g:471:7: INTLITERAL
                    {
                    INTLITERAL418=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_elementarySymbol6296); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INTLITERAL.add(INTLITERAL418);


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
                    // 471:21: -> INTLITERAL[$INTLITERAL, \"INT\"]
                    {
                        adaptor.addChild(root_0, 
                        new ConstantNode(INTLITERAL, INTLITERAL418, "INT")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 4 :
                    // Haxe.g:472:7: STRINGLITERAL
                    {
                    STRINGLITERAL419=(Token)match(input,STRINGLITERAL,FOLLOW_STRINGLITERAL_in_elementarySymbol6315); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STRINGLITERAL.add(STRINGLITERAL419);


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
                    // 472:21: -> STRINGLITERAL[$STRINGLITERAL,\"STRING\"]
                    {
                        adaptor.addChild(root_0, 
                        new ConstantNode(STRINGLITERAL, STRINGLITERAL419, "STRING")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 5 :
                    // Haxe.g:473:7: CHARLITERAL
                    {
                    CHARLITERAL420=(Token)match(input,CHARLITERAL,FOLLOW_CHARLITERAL_in_elementarySymbol6331); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CHARLITERAL.add(CHARLITERAL420);


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
                    // 473:21: -> CHARLITERAL[$CHARLITERAL, \"STRING\"]
                    {
                        adaptor.addChild(root_0, 
                        new ConstantNode(CHARLITERAL, CHARLITERAL420, "STRING")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 6 :
                    // Haxe.g:474:7: FLOATNUM
                    {
                    FLOATNUM421=(Token)match(input,FLOATNUM,FOLLOW_FLOATNUM_in_elementarySymbol6349); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FLOATNUM.add(FLOATNUM421);


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
                    // 474:21: -> FLOATNUM[$FLOATNUM, \"FLOAT\"]
                    {
                        adaptor.addChild(root_0, 
                        new ConstantNode(FLOATNUM, FLOATNUM421, "FLOAT")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 7 :
                    // Haxe.g:475:7: TRUE
                    {
                    TRUE422=(Token)match(input,TRUE,FOLLOW_TRUE_in_elementarySymbol6370); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TRUE.add(TRUE422);


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
                    // 475:21: -> TRUE[$TRUE,\"BOOL\"]
                    {
                        adaptor.addChild(root_0, 
                        new ConstantNode(TRUE, TRUE422, "BOOL")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 8 :
                    // Haxe.g:476:7: FALSE
                    {
                    FALSE423=(Token)match(input,FALSE,FOLLOW_FALSE_in_elementarySymbol6395); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FALSE.add(FALSE423);


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
                    // 476:21: -> FALSE[$FALSE,\"BOOL\"]
                    {
                        adaptor.addChild(root_0, 
                        new ConstantNode(FALSE, FALSE423, "BOOL")
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
            if ( state.backtracking>0 ) { memoize(input, 79, elementarySymbol_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "elementarySymbol"

    // $ANTLR start synpred48_Haxe
    public final void synpred48_Haxe_fragment() throws RecognitionException {
        // Haxe.g:188:62: ( typeParam )
        // Haxe.g:188:62: typeParam
        {
        pushFollow(FOLLOW_typeParam_in_synpred48_Haxe1680);
        typeParam();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred48_Haxe

    // $ANTLR start synpred50_Haxe
    public final void synpred50_Haxe_fragment() throws RecognitionException {
        // Haxe.g:195:10: ( typeParam )
        // Haxe.g:195:10: typeParam
        {
        pushFollow(FOLLOW_typeParam_in_synpred50_Haxe1768);
        typeParam();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred50_Haxe

    // $ANTLR start synpred54_Haxe
    public final void synpred54_Haxe_fragment() throws RecognitionException {
        // Haxe.g:209:10: ( block )
        // Haxe.g:209:10: block
        {
        pushFollow(FOLLOW_block_in_synpred54_Haxe1930);
        block();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred54_Haxe

    // $ANTLR start synpred55_Haxe
    public final void synpred55_Haxe_fragment() throws RecognitionException {
        // Haxe.g:210:11: ( assignExpr )
        // Haxe.g:210:11: assignExpr
        {
        pushFollow(FOLLOW_assignExpr_in_synpred55_Haxe1942);
        assignExpr();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred55_Haxe

    // $ANTLR start synpred56_Haxe
    public final void synpred56_Haxe_fragment() throws RecognitionException {
        // Haxe.g:210:10: ( ( assignExpr | expr ) SEMI )
        // Haxe.g:210:10: ( assignExpr | expr ) SEMI
        {
        // Haxe.g:210:10: ( assignExpr | expr )
        int alt116=2;
        switch ( input.LA(1) ) {
        case SUB:
            {
            int LA116_1 = input.LA(2);

            if ( (synpred55_Haxe()) ) {
                alt116=1;
            }
            else if ( (true) ) {
                alt116=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 116, 1, input);

                throw nvae;

            }
            }
            break;
        case SUBSUB:
            {
            int LA116_2 = input.LA(2);

            if ( (synpred55_Haxe()) ) {
                alt116=1;
            }
            else if ( (true) ) {
                alt116=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 116, 2, input);

                throw nvae;

            }
            }
            break;
        case PLUSPLUS:
            {
            int LA116_3 = input.LA(2);

            if ( (synpred55_Haxe()) ) {
                alt116=1;
            }
            else if ( (true) ) {
                alt116=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 116, 3, input);

                throw nvae;

            }
            }
            break;
        case BANG:
            {
            int LA116_4 = input.LA(2);

            if ( (synpred55_Haxe()) ) {
                alt116=1;
            }
            else if ( (true) ) {
                alt116=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 116, 4, input);

                throw nvae;

            }
            }
            break;
        case TILDE:
            {
            int LA116_5 = input.LA(2);

            if ( (synpred55_Haxe()) ) {
                alt116=1;
            }
            else if ( (true) ) {
                alt116=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 116, 5, input);

                throw nvae;

            }
            }
            break;
        case NEW:
            {
            int LA116_6 = input.LA(2);

            if ( (synpred55_Haxe()) ) {
                alt116=1;
            }
            else if ( (true) ) {
                alt116=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 116, 6, input);

                throw nvae;

            }
            }
            break;
        case CAST:
            {
            int LA116_7 = input.LA(2);

            if ( (synpred55_Haxe()) ) {
                alt116=1;
            }
            else if ( (true) ) {
                alt116=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 116, 7, input);

                throw nvae;

            }
            }
            break;
        case LBRACE:
            {
            int LA116_8 = input.LA(2);

            if ( (synpred55_Haxe()) ) {
                alt116=1;
            }
            else if ( (true) ) {
                alt116=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 116, 8, input);

                throw nvae;

            }
            }
            break;
        case FUNCTION:
            {
            int LA116_9 = input.LA(2);

            if ( (synpred55_Haxe()) ) {
                alt116=1;
            }
            else if ( (true) ) {
                alt116=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 116, 9, input);

                throw nvae;

            }
            }
            break;
        case LONGLITERAL:
            {
            int LA116_10 = input.LA(2);

            if ( (synpred55_Haxe()) ) {
                alt116=1;
            }
            else if ( (true) ) {
                alt116=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 116, 10, input);

                throw nvae;

            }
            }
            break;
        case NULL:
            {
            int LA116_11 = input.LA(2);

            if ( (synpred55_Haxe()) ) {
                alt116=1;
            }
            else if ( (true) ) {
                alt116=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 116, 11, input);

                throw nvae;

            }
            }
            break;
        case INTLITERAL:
            {
            int LA116_12 = input.LA(2);

            if ( (synpred55_Haxe()) ) {
                alt116=1;
            }
            else if ( (true) ) {
                alt116=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 116, 12, input);

                throw nvae;

            }
            }
            break;
        case STRINGLITERAL:
            {
            int LA116_13 = input.LA(2);

            if ( (synpred55_Haxe()) ) {
                alt116=1;
            }
            else if ( (true) ) {
                alt116=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 116, 13, input);

                throw nvae;

            }
            }
            break;
        case CHARLITERAL:
            {
            int LA116_14 = input.LA(2);

            if ( (synpred55_Haxe()) ) {
                alt116=1;
            }
            else if ( (true) ) {
                alt116=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 116, 14, input);

                throw nvae;

            }
            }
            break;
        case FLOATNUM:
            {
            int LA116_15 = input.LA(2);

            if ( (synpred55_Haxe()) ) {
                alt116=1;
            }
            else if ( (true) ) {
                alt116=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 116, 15, input);

                throw nvae;

            }
            }
            break;
        case TRUE:
            {
            int LA116_16 = input.LA(2);

            if ( (synpred55_Haxe()) ) {
                alt116=1;
            }
            else if ( (true) ) {
                alt116=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 116, 16, input);

                throw nvae;

            }
            }
            break;
        case FALSE:
            {
            int LA116_17 = input.LA(2);

            if ( (synpred55_Haxe()) ) {
                alt116=1;
            }
            else if ( (true) ) {
                alt116=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 116, 17, input);

                throw nvae;

            }
            }
            break;
        case LPAREN:
            {
            int LA116_18 = input.LA(2);

            if ( (synpred55_Haxe()) ) {
                alt116=1;
            }
            else if ( (true) ) {
                alt116=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 116, 18, input);

                throw nvae;

            }
            }
            break;
        case IDENTIFIER:
            {
            int LA116_19 = input.LA(2);

            if ( (synpred55_Haxe()) ) {
                alt116=1;
            }
            else if ( (true) ) {
                alt116=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 116, 19, input);

                throw nvae;

            }
            }
            break;
        case THIS:
            {
            int LA116_20 = input.LA(2);

            if ( (synpred55_Haxe()) ) {
                alt116=1;
            }
            else if ( (true) ) {
                alt116=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 116, 20, input);

                throw nvae;

            }
            }
            break;
        case UNTYPED:
            {
            alt116=2;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 116, 0, input);

            throw nvae;

        }

        switch (alt116) {
            case 1 :
                // Haxe.g:210:11: assignExpr
                {
                pushFollow(FOLLOW_assignExpr_in_synpred56_Haxe1942);
                assignExpr();

                state._fsp--;
                if (state.failed) return ;

                }
                break;
            case 2 :
                // Haxe.g:210:22: expr
                {
                pushFollow(FOLLOW_expr_in_synpred56_Haxe1944);
                expr();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        match(input,SEMI,FOLLOW_SEMI_in_synpred56_Haxe1947); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred56_Haxe

    // $ANTLR start synpred58_Haxe
    public final void synpred58_Haxe_fragment() throws RecognitionException {
        // Haxe.g:212:56: ( ELSE statement )
        // Haxe.g:212:56: ELSE statement
        {
        match(input,ELSE,FOLLOW_ELSE_in_synpred58_Haxe1990); if (state.failed) return ;

        pushFollow(FOLLOW_statement_in_synpred58_Haxe1993);
        statement();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred58_Haxe

    // $ANTLR start synpred72_Haxe
    public final void synpred72_Haxe_fragment() throws RecognitionException {
        // Haxe.g:221:8: ( IDENTIFIER COLON statement )
        // Haxe.g:221:8: IDENTIFIER COLON statement
        {
        match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_synpred72_Haxe2268); if (state.failed) return ;

        match(input,COLON,FOLLOW_COLON_in_synpred72_Haxe2270); if (state.failed) return ;

        pushFollow(FOLLOW_statement_in_synpred72_Haxe2272);
        statement();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred72_Haxe

    // $ANTLR start synpred75_Haxe
    public final void synpred75_Haxe_fragment() throws RecognitionException {
        // Haxe.g:234:10: ( varDecl )
        // Haxe.g:234:10: varDecl
        {
        pushFollow(FOLLOW_varDecl_in_synpred75_Haxe2438);
        varDecl();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred75_Haxe

    // $ANTLR start synpred115_Haxe
    public final void synpred115_Haxe_fragment() throws RecognitionException {
        // Haxe.g:317:19: ( value LPAREN ( exprList )? RPAREN ( pureCallOrSlice )? )
        // Haxe.g:317:19: value LPAREN ( exprList )? RPAREN ( pureCallOrSlice )?
        {
        pushFollow(FOLLOW_value_in_synpred115_Haxe3912);
        value();

        state._fsp--;
        if (state.failed) return ;

        match(input,LPAREN,FOLLOW_LPAREN_in_synpred115_Haxe3914); if (state.failed) return ;

        // Haxe.g:317:32: ( exprList )?
        int alt124=2;
        int LA124_0 = input.LA(1);

        if ( (LA124_0==BANG||LA124_0==CAST||LA124_0==CHARLITERAL||LA124_0==FALSE||LA124_0==FLOATNUM||LA124_0==FUNCTION||LA124_0==IDENTIFIER||LA124_0==INTLITERAL||LA124_0==LBRACE||(LA124_0 >= LONGLITERAL && LA124_0 <= LPAREN)||(LA124_0 >= NEW && LA124_0 <= NULL)||LA124_0==PLUSPLUS||(LA124_0 >= STRINGLITERAL && LA124_0 <= SUB)||LA124_0==SUBSUB||LA124_0==THIS||LA124_0==TILDE||LA124_0==TRUE||LA124_0==UNTYPED) ) {
            alt124=1;
        }
        switch (alt124) {
            case 1 :
                // Haxe.g:317:32: exprList
                {
                pushFollow(FOLLOW_exprList_in_synpred115_Haxe3916);
                exprList();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        match(input,RPAREN,FOLLOW_RPAREN_in_synpred115_Haxe3919); if (state.failed) return ;

        // Haxe.g:317:49: ( pureCallOrSlice )?
        int alt125=2;
        int LA125_0 = input.LA(1);

        if ( (LA125_0==DOT||LA125_0==LBRACKET) ) {
            alt125=1;
        }
        switch (alt125) {
            case 1 :
                // Haxe.g:317:49: pureCallOrSlice
                {
                pushFollow(FOLLOW_pureCallOrSlice_in_synpred115_Haxe3921);
                pureCallOrSlice();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        }

    }
    // $ANTLR end synpred115_Haxe

    // $ANTLR start synpred117_Haxe
    public final void synpred117_Haxe_fragment() throws RecognitionException {
        // Haxe.g:319:19: ( value LBRACKET expr RBRACKET ( pureCallOrSlice )? )
        // Haxe.g:319:19: value LBRACKET expr RBRACKET ( pureCallOrSlice )?
        {
        pushFollow(FOLLOW_value_in_synpred117_Haxe3972);
        value();

        state._fsp--;
        if (state.failed) return ;

        match(input,LBRACKET,FOLLOW_LBRACKET_in_synpred117_Haxe3974); if (state.failed) return ;

        pushFollow(FOLLOW_expr_in_synpred117_Haxe3976);
        expr();

        state._fsp--;
        if (state.failed) return ;

        match(input,RBRACKET,FOLLOW_RBRACKET_in_synpred117_Haxe3978); if (state.failed) return ;

        // Haxe.g:319:48: ( pureCallOrSlice )?
        int alt126=2;
        int LA126_0 = input.LA(1);

        if ( (LA126_0==DOT||LA126_0==LBRACKET) ) {
            alt126=1;
        }
        switch (alt126) {
            case 1 :
                // Haxe.g:319:48: pureCallOrSlice
                {
                pushFollow(FOLLOW_pureCallOrSlice_in_synpred117_Haxe3980);
                pureCallOrSlice();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        }

    }
    // $ANTLR end synpred117_Haxe

    // $ANTLR start synpred118_Haxe
    public final void synpred118_Haxe_fragment() throws RecognitionException {
        // Haxe.g:321:19: ( value pureCallOrSlice )
        // Haxe.g:321:19: value pureCallOrSlice
        {
        pushFollow(FOLLOW_value_in_synpred118_Haxe4031);
        value();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_pureCallOrSlice_in_synpred118_Haxe4033);
        pureCallOrSlice();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred118_Haxe

    // $ANTLR start synpred124_Haxe
    public final void synpred124_Haxe_fragment() throws RecognitionException {
        // Haxe.g:335:18: ( expr )
        // Haxe.g:335:18: expr
        {
        pushFollow(FOLLOW_expr_in_synpred124_Haxe4216);
        expr();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred124_Haxe

    // Delegated rules

    public final boolean synpred54_Haxe() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred54_Haxe_fragment(); // can never throw exception
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
    public final boolean synpred124_Haxe() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred124_Haxe_fragment(); // can never throw exception
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
    public final boolean synpred72_Haxe() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred72_Haxe_fragment(); // can never throw exception
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
    public final boolean synpred55_Haxe() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred55_Haxe_fragment(); // can never throw exception
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
    protected DFA94 dfa94 = new DFA94(this);
    protected DFA103 dfa103 = new DFA103(this);
    static final String DFA79_eotS =
        "\10\uffff";
    static final String DFA79_eofS =
        "\10\uffff";
    static final String DFA79_minS =
        "\6\46\2\uffff";
    static final String DFA79_maxS =
        "\6\u00a0\2\uffff";
    static final String DFA79_acceptS =
        "\6\uffff\1\1\1\2";
    static final String DFA79_specialS =
        "\10\uffff}>";
    static final String[] DFA79_transitionS = {
            "\1\3\22\uffff\1\7\22\uffff\1\2\30\uffff\1\4\24\uffff\1\5\2\uffff"+
            "\1\5\13\uffff\1\1\26\uffff\1\6",
            "\1\3\22\uffff\1\7\22\uffff\1\2\30\uffff\1\4\24\uffff\1\5\2"+
            "\uffff\1\5\13\uffff\1\1\26\uffff\1\6",
            "\1\3\22\uffff\1\7\22\uffff\1\2\30\uffff\1\4\24\uffff\1\5\2"+
            "\uffff\1\5\13\uffff\1\1\26\uffff\1\6",
            "\1\3\22\uffff\1\7\22\uffff\1\2\30\uffff\1\4\24\uffff\1\5\2"+
            "\uffff\1\5\13\uffff\1\1\26\uffff\1\6",
            "\1\3\22\uffff\1\7\22\uffff\1\2\30\uffff\1\4\24\uffff\1\5\2"+
            "\uffff\1\5\13\uffff\1\1\26\uffff\1\6",
            "\1\3\22\uffff\1\7\22\uffff\1\2\30\uffff\1\4\24\uffff\1\5\2"+
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
            return "364:1: classMember : ( varDeclClass | funcDecl );";
        }
    }
    static final String DFA94_eotS =
        "\11\uffff";
    static final String DFA94_eofS =
        "\11\uffff";
    static final String DFA94_minS =
        "\6\46\1\105\2\uffff";
    static final String DFA94_maxS =
        "\6\u0089\1\142\2\uffff";
    static final String DFA94_acceptS =
        "\7\uffff\1\1\1\2";
    static final String DFA94_specialS =
        "\11\uffff}>";
    static final String[] DFA94_transitionS = {
            "\1\3\22\uffff\1\6\22\uffff\1\2\30\uffff\1\4\24\uffff\1\5\2\uffff"+
            "\1\5\13\uffff\1\1",
            "\1\3\22\uffff\1\6\22\uffff\1\2\30\uffff\1\4\24\uffff\1\5\2"+
            "\uffff\1\5\13\uffff\1\1",
            "\1\3\22\uffff\1\6\22\uffff\1\2\30\uffff\1\4\24\uffff\1\5\2"+
            "\uffff\1\5\13\uffff\1\1",
            "\1\3\22\uffff\1\6\22\uffff\1\2\30\uffff\1\4\24\uffff\1\5\2"+
            "\uffff\1\5\13\uffff\1\1",
            "\1\3\22\uffff\1\6\22\uffff\1\2\30\uffff\1\4\24\uffff\1\5\2"+
            "\uffff\1\5\13\uffff\1\1",
            "\1\3\22\uffff\1\6\22\uffff\1\2\30\uffff\1\4\24\uffff\1\5\2"+
            "\uffff\1\5\13\uffff\1\1",
            "\1\10\34\uffff\1\7",
            "",
            ""
    };

    static final short[] DFA94_eot = DFA.unpackEncodedString(DFA94_eotS);
    static final short[] DFA94_eof = DFA.unpackEncodedString(DFA94_eofS);
    static final char[] DFA94_min = DFA.unpackEncodedStringToUnsignedChars(DFA94_minS);
    static final char[] DFA94_max = DFA.unpackEncodedStringToUnsignedChars(DFA94_maxS);
    static final short[] DFA94_accept = DFA.unpackEncodedString(DFA94_acceptS);
    static final short[] DFA94_special = DFA.unpackEncodedString(DFA94_specialS);
    static final short[][] DFA94_transition;

    static {
        int numStates = DFA94_transitionS.length;
        DFA94_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA94_transition[i] = DFA.unpackEncodedString(DFA94_transitionS[i]);
        }
    }

    class DFA94 extends DFA {

        public DFA94(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 94;
            this.eot = DFA94_eot;
            this.eof = DFA94_eof;
            this.min = DFA94_min;
            this.max = DFA94_max;
            this.accept = DFA94_accept;
            this.special = DFA94_special;
            this.transition = DFA94_transition;
        }
        public String getDescription() {
            return "394:1: funcDecl : ( ( declAttrList )? FUNCTION NEW LPAREN ( paramList )? RPAREN ( typeTag )? block -> ^( FUNCTION NEW ( declAttrList )? ( paramList )? ( typeTag )? ( block )? ) | ( declAttrList )? FUNCTION IDENTIFIER typeParamOpt LPAREN ( paramList )? RPAREN ( typeTag )? block -> ^( FUNCTION IDENTIFIER ( declAttrList )? ( paramList )? ( typeTag )? ( block )? ( typeParamOpt )? ) );";
        }
    }
    static final String DFA103_eotS =
        "\14\uffff";
    static final String DFA103_eofS =
        "\14\uffff";
    static final String DFA103_minS =
        "\6\46\2\105\4\uffff";
    static final String DFA103_maxS =
        "\6\u0089\2\142\4\uffff";
    static final String DFA103_acceptS =
        "\10\uffff\1\3\1\4\1\1\1\2";
    static final String DFA103_specialS =
        "\14\uffff}>";
    static final String[] DFA103_transitionS = {
            "\1\3\22\uffff\1\6\22\uffff\1\2\30\uffff\1\4\24\uffff\1\5\2\uffff"+
            "\1\5\13\uffff\1\1",
            "\1\3\22\uffff\1\7\22\uffff\1\2\30\uffff\1\4\24\uffff\1\5\2"+
            "\uffff\1\5\13\uffff\1\1",
            "\1\3\22\uffff\1\7\22\uffff\1\2\30\uffff\1\4\24\uffff\1\5\2"+
            "\uffff\1\5\13\uffff\1\1",
            "\1\3\22\uffff\1\7\22\uffff\1\2\30\uffff\1\4\24\uffff\1\5\2"+
            "\uffff\1\5\13\uffff\1\1",
            "\1\3\22\uffff\1\7\22\uffff\1\2\30\uffff\1\4\24\uffff\1\5\2"+
            "\uffff\1\5\13\uffff\1\1",
            "\1\3\22\uffff\1\7\22\uffff\1\2\30\uffff\1\4\24\uffff\1\5\2"+
            "\uffff\1\5\13\uffff\1\1",
            "\1\11\34\uffff\1\10",
            "\1\13\34\uffff\1\12",
            "",
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
            return "400:1: funcProtoDecl : ( declAttrList FUNCTION NEW LPAREN ( paramList )? RPAREN ( typeTag )? SEMI -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTag )? ( declAttrList )? ) | declAttrList FUNCTION IDENTIFIER typeParamOpt LPAREN ( paramList )? RPAREN ( typeTag )? SEMI -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTag )? ( declAttrList )? ( typeParamOpt )? ) | FUNCTION NEW LPAREN ( paramList )? RPAREN ( typeTag )? SEMI -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTag )? ) | FUNCTION IDENTIFIER typeParamOpt LPAREN ( paramList )? RPAREN ( typeTag )? SEMI -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTag )? ( typeParamOpt )? ) );";
        }
    }
 

    public static final BitSet FOLLOW_myPackage_in_module177 = new BitSet(new long[]{0x0002080004000000L,0x0400000000008200L,0x0000000084000000L});
    public static final BitSet FOLLOW_topLevelList_in_module180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_topLevel_in_topLevelList229 = new BitSet(new long[]{0x0002080004000002L,0x0400000000008200L,0x0000000084000000L});
    public static final BitSet FOLLOW_IMPORT_in_topLevel263 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L,0x0000000000040000L});
    public static final BitSet FOLLOW_dotIdent_in_topLevel266 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_SEMI_in_topLevel268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_USING_in_topLevel289 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L,0x0000000000040000L});
    public static final BitSet FOLLOW_dotIdent_in_topLevel292 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_SEMI_in_topLevel294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_topLevelDecl_in_topLevel315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PACKAGE_in_myPackage347 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L,0x0000000000040000L});
    public static final BitSet FOLLOW_dotIdent_in_myPackage350 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_SEMI_in_myPackage352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MONKEYS_AT_in_meta382 = new BitSet(new long[]{0x0040004008010000L,0x0000000000004020L,0x0000000400000000L});
    public static final BitSet FOLLOW_metaName_in_meta384 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
    public static final BitSet FOLLOW_LPAREN_in_meta387 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000020L,0x0000000000000004L});
    public static final BitSet FOLLOW_paramList_in_meta389 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RPAREN_in_meta392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_metaName411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveType_in_metaName419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_in_metaName428 = new BitSet(new long[]{0x0040004008010000L,0x0000000000004020L,0x0000000400000000L});
    public static final BitSet FOLLOW_metaName_in_metaName430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_meta_in_typeDeclFlags448 = new BitSet(new long[]{0x0002000000000002L,0x0400000080000000L});
    public static final BitSet FOLLOW_STATIC_in_declAttr603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INLINE_in_declAttr623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DYNAMIC_in_declAttr643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OVERRIDE_in_declAttr663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_access_in_declAttr683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttr_in_declAttrList712 = new BitSet(new long[]{0x0000004000000002L,0x2400002000001000L,0x0000000000000200L});
    public static final BitSet FOLLOW_param_in_paramList757 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_COMMA_in_paramList760 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000020L});
    public static final BitSet FOLLOW_param_in_paramList762 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_QUES_in_param812 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_IDENTIFIER_in_param815 = new BitSet(new long[]{0x0000100008000002L});
    public static final BitSet FOLLOW_typeTag_in_param817 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_varInit_in_param820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_id882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIS_in_id905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_dotIdent940 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_DOT_in_dotIdent942 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L,0x0000000000040000L});
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
    public static final BitSet FOLLOW_LPAREN_in_funcLit1401 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000020L,0x0000000000000004L});
    public static final BitSet FOLLOW_paramList_in_funcLit1404 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RPAREN_in_funcLit1407 = new BitSet(new long[]{0x0000000008000000L,0x0000000000080000L,0x0000000000000008L});
    public static final BitSet FOLLOW_typeTag_in_funcLit1410 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L,0x0000000000000008L});
    public static final BitSet FOLLOW_block_in_funcLit1413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_in_typeTag1457 = new BitSet(new long[]{0x0040004000010000L,0x0000000000084020L,0x0000000400040000L});
    public static final BitSet FOLLOW_funcType_in_typeTag1459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcType_in_typeList1503 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_COMMA_in_typeList1506 = new BitSet(new long[]{0x0040004000010000L,0x0000000000084020L,0x0000000400040000L});
    public static final BitSet FOLLOW_typeList_in_typeList1509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeConstraint_in_typeList1531 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_COMMA_in_typeList1534 = new BitSet(new long[]{0x0040004000010000L,0x0000000000084020L,0x0000000400040000L});
    public static final BitSet FOLLOW_typeList_in_typeList1537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_funcType1572 = new BitSet(new long[]{0x0000000000000002L,0x0000000020000000L});
    public static final BitSet FOLLOW_MINUS_BIGGER_in_funcType1575 = new BitSet(new long[]{0x0040004000010000L,0x0000000000084020L,0x0000000400040000L});
    public static final BitSet FOLLOW_type_in_funcType1578 = new BitSet(new long[]{0x0000000000000002L,0x0000000020000000L});
    public static final BitSet FOLLOW_anonType_in_type1664 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_dotIdent_in_type1669 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_primitiveType_in_type1674 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_typeParam_in_type1680 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_LT_in_typeParam1717 = new BitSet(new long[]{0x0040004000010000L,0x0000000000084020L,0x0000000400040000L});
    public static final BitSet FOLLOW_typeList_in_typeParam1720 = new BitSet(new long[]{0x0800000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_typeParam_in_typeParam1722 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_GT_in_typeParam1725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeParam_in_typeParamOpt1768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_typeConstraint1817 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_COLON_in_typeConstraint1819 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_LPAREN_in_typeConstraint1821 = new BitSet(new long[]{0x0040004000010000L,0x0000000000084020L,0x0000000400040000L});
    public static final BitSet FOLLOW_typeList_in_typeConstraint1823 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RPAREN_in_typeConstraint1825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttrList_in_functionReturn1864 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_FUNCTION_in_functionReturn1867 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_NEW_in_functionReturn1869 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_LPAREN_in_functionReturn1871 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000020L,0x0000000000000004L});
    public static final BitSet FOLLOW_paramList_in_functionReturn1873 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RPAREN_in_functionReturn1876 = new BitSet(new long[]{0x0000000008000000L,0x0000000000080000L,0x0000000000000008L});
    public static final BitSet FOLLOW_typeTag_in_functionReturn1878 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L,0x0000000000000008L});
    public static final BitSet FOLLOW_block_in_functionReturn1881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_statement1930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignExpr_in_statement1942 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_expr_in_statement1944 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_SEMI_in_statement1947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDecl_in_statement1959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_statement1979 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_parExpression_in_statement1985 = new BitSet(new long[]{0x0388000882420200L,0x0000100C00C90060L,0x0000001141AE580AL});
    public static final BitSet FOLLOW_statement_in_statement1987 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_ELSE_in_statement1990 = new BitSet(new long[]{0x0388000882420200L,0x0000100C00C90060L,0x0000001141AE580AL});
    public static final BitSet FOLLOW_statement_in_statement1993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_statement2015 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_LPAREN_in_statement2017 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00C90020L,0x0000000040A45800L});
    public static final BitSet FOLLOW_expr_in_statement2019 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_IN_in_statement2021 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00C90020L,0x0000000000A45800L});
    public static final BitSet FOLLOW_iterExpr_in_statement2023 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RPAREN_in_statement2025 = new BitSet(new long[]{0x0388000882420200L,0x0000100C00C90060L,0x0000001141AE580AL});
    public static final BitSet FOLLOW_statement_in_statement2027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_statement2062 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_parExpression_in_statement2068 = new BitSet(new long[]{0x0388000882420200L,0x0000100C00C90060L,0x0000001141AE580AL});
    public static final BitSet FOLLOW_statement_in_statement2070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DO_in_statement2090 = new BitSet(new long[]{0x0388000882420200L,0x0000100C00C90060L,0x0000001141AE580AL});
    public static final BitSet FOLLOW_statement_in_statement2096 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_WHILE_in_statement2098 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_parExpression_in_statement2101 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_SEMI_in_statement2103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRY_in_statement2124 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L,0x0000000000000008L});
    public static final BitSet FOLLOW_block_in_statement2130 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_catchStmt_in_statement2132 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_SWITCH_in_statement2153 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_LPAREN_in_statement2159 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00C90020L,0x0000000040A45800L});
    public static final BitSet FOLLOW_expr_in_statement2162 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RPAREN_in_statement2164 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_LBRACE_in_statement2167 = new BitSet(new long[]{0x0000000200200000L});
    public static final BitSet FOLLOW_caseStmt_in_statement2170 = new BitSet(new long[]{0x0000000200200000L,0x8000000000000000L});
    public static final BitSet FOLLOW_RBRACE_in_statement2173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_statement2194 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00C90020L,0x0000000040A45808L});
    public static final BitSet FOLLOW_expr_in_statement2200 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_SEMI_in_statement2203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THROW_in_statement2224 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00C90020L,0x0000000040A45800L});
    public static final BitSet FOLLOW_expr_in_statement2227 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_SEMI_in_statement2229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_statement2250 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_SEMI_in_statement2258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_statement2268 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_COLON_in_statement2270 = new BitSet(new long[]{0x0388000882420200L,0x0000100C00C90060L,0x0000001141AE580AL});
    public static final BitSet FOLLOW_statement_in_statement2272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMI_in_statement2311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_parExpression2335 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00C90020L,0x0000000040A45800L});
    public static final BitSet FOLLOW_expr_in_parExpression2338 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RPAREN_in_parExpression2340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_block2364 = new BitSet(new long[]{0x038A000886420200L,0x8400100C00C90060L,0x0000001141AE580AL});
    public static final BitSet FOLLOW_blockStmt_in_block2367 = new BitSet(new long[]{0x038A000886420200L,0x8400100C00C90060L,0x0000001141AE580AL});
    public static final BitSet FOLLOW_RBRACE_in_block2371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMI_in_block2405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDecl_in_blockStmt2438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classDecl_in_blockStmt2449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_blockStmt2460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CASE_in_caseStmt2484 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00C90020L,0x0000000040A45800L});
    public static final BitSet FOLLOW_exprList_in_caseStmt2487 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_COLON_in_caseStmt2489 = new BitSet(new long[]{0x0388000882420200L,0x0000100C00C90060L,0x0000001141AE580AL});
    public static final BitSet FOLLOW_statement_in_caseStmt2492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_caseStmt2512 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_COLON_in_caseStmt2515 = new BitSet(new long[]{0x0388000882420200L,0x0000100C00C90060L,0x0000001141AE580AL});
    public static final BitSet FOLLOW_statement_in_caseStmt2518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CATCH_in_catchStmt2554 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_LPAREN_in_catchStmt2560 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000020L});
    public static final BitSet FOLLOW_param_in_catchStmt2563 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RPAREN_in_catchStmt2565 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L,0x0000000000000008L});
    public static final BitSet FOLLOW_block_in_catchStmt2568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_exprList2590 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_COMMA_in_exprList2593 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00C90020L,0x0000000040A45800L});
    public static final BitSet FOLLOW_expr_in_exprList2596 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_UNTYPED_in_expr2638 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00C90020L,0x0000000000A45800L});
    public static final BitSet FOLLOW_assignExpr_in_expr2641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignExpr_in_expr2661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ternaryExpr_in_assignExpr2691 = new BitSet(new long[]{0x4000100000104082L,0x00000A0008000001L,0x0000000000002140L});
    public static final BitSet FOLLOW_assignOp_in_assignExpr2694 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00C90020L,0x0000000000A45800L});
    public static final BitSet FOLLOW_ternaryExpr_in_assignExpr2697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicOrExpr_in_ternaryExpr2728 = new BitSet(new long[]{0x0000000000000002L,0x4000000000000000L});
    public static final BitSet FOLLOW_QUES_in_ternaryExpr2731 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00C90020L,0x0000000040A45800L});
    public static final BitSet FOLLOW_expr_in_ternaryExpr2734 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_COLON_in_ternaryExpr2736 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00C90020L,0x0000000000A45800L});
    public static final BitSet FOLLOW_ternaryExpr_in_ternaryExpr2739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicAndExpr_in_logicOrExpr2770 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_BARBAR_in_logicOrExpr2773 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00C90020L,0x0000000000A45800L});
    public static final BitSet FOLLOW_logicAndExpr_in_logicOrExpr2779 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_iterExpr_in_logicAndExpr2813 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_AMPAMP_in_logicAndExpr2815 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00C90020L,0x0000000000A45800L});
    public static final BitSet FOLLOW_iterExpr_in_logicAndExpr2821 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_cmpExpr_in_iterExpr2871 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_ELLIPSIS_in_iterExpr2874 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00C90020L,0x0000000000A45800L});
    public static final BitSet FOLLOW_cmpExpr_in_iterExpr2880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bitExpr_in_cmpExpr2919 = new BitSet(new long[]{0x1800200000000402L,0x0000000003000000L});
    public static final BitSet FOLLOW_EQEQ_in_cmpExpr2946 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00C90020L,0x0000000000A45800L});
    public static final BitSet FOLLOW_BANGEQ_in_cmpExpr2975 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00C90020L,0x0000000000A45800L});
    public static final BitSet FOLLOW_GTEQ_in_cmpExpr3004 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00C90020L,0x0000000000A45800L});
    public static final BitSet FOLLOW_LTEQ_in_cmpExpr3033 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00C90020L,0x0000000000A45800L});
    public static final BitSet FOLLOW_GT_in_cmpExpr3062 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00C90020L,0x0000000000A45800L});
    public static final BitSet FOLLOW_LT_in_cmpExpr3091 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00C90020L,0x0000000000A45800L});
    public static final BitSet FOLLOW_bitExpr_in_cmpExpr3098 = new BitSet(new long[]{0x1800200000000402L,0x0000000003000000L});
    public static final BitSet FOLLOW_shiftExpr_in_bitExpr3137 = new BitSet(new long[]{0x0000000000081022L});
    public static final BitSet FOLLOW_BAR_in_bitExpr3164 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00C90020L,0x0000000000A45800L});
    public static final BitSet FOLLOW_AMP_in_bitExpr3193 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00C90020L,0x0000000000A45800L});
    public static final BitSet FOLLOW_CARET_in_bitExpr3222 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00C90020L,0x0000000000A45800L});
    public static final BitSet FOLLOW_shiftExpr_in_bitExpr3229 = new BitSet(new long[]{0x0000000000081022L});
    public static final BitSet FOLLOW_addExpr_in_shiftExpr3262 = new BitSet(new long[]{0xA000000000000002L,0x0000000004000000L});
    public static final BitSet FOLLOW_LTLT_in_shiftExpr3289 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00C90020L,0x0000000000A45800L});
    public static final BitSet FOLLOW_GTGT_in_shiftExpr3318 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00C90020L,0x0000000000A45800L});
    public static final BitSet FOLLOW_GTGTGT_in_shiftExpr3347 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00C90020L,0x0000000000A45800L});
    public static final BitSet FOLLOW_addExpr_in_shiftExpr3354 = new BitSet(new long[]{0xA000000000000002L,0x0000000004000000L});
    public static final BitSet FOLLOW_multExpr_in_addExpr3389 = new BitSet(new long[]{0x0000000000000002L,0x0000040000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_PLUS_in_addExpr3416 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00C90020L,0x0000000000A45800L});
    public static final BitSet FOLLOW_SUB_in_addExpr3445 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00C90020L,0x0000000000A45800L});
    public static final BitSet FOLLOW_multExpr_in_addExpr3452 = new BitSet(new long[]{0x0000000000000002L,0x0000040000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_unarExpr_in_multExpr3491 = new BitSet(new long[]{0x0000000000000002L,0x0000010000000000L,0x00000000000000A0L});
    public static final BitSet FOLLOW_STAR_in_multExpr3518 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00C90020L,0x0000000000A45800L});
    public static final BitSet FOLLOW_SLASH_in_multExpr3547 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00C90020L,0x0000000000A45800L});
    public static final BitSet FOLLOW_PERCENT_in_multExpr3576 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00C90020L,0x0000000000A45800L});
    public static final BitSet FOLLOW_unarExpr_in_multExpr3583 = new BitSet(new long[]{0x0000000000000002L,0x0000010000000000L,0x00000000000000A0L});
    public static final BitSet FOLLOW_SUB_in_unarExpr3631 = new BitSet(new long[]{0x0288000002400000L,0x0000000C00C90020L,0x0000000000840800L});
    public static final BitSet FOLLOW_SUBSUB_in_unarExpr3650 = new BitSet(new long[]{0x0288000002400000L,0x0000000C00C90020L,0x0000000000840800L});
    public static final BitSet FOLLOW_PLUSPLUS_in_unarExpr3669 = new BitSet(new long[]{0x0288000002400000L,0x0000000C00C90020L,0x0000000000840800L});
    public static final BitSet FOLLOW_BANG_in_unarExpr3688 = new BitSet(new long[]{0x0288000002400000L,0x0000000C00C90020L,0x0000000000840800L});
    public static final BitSet FOLLOW_TILDE_in_unarExpr3707 = new BitSet(new long[]{0x0288000002400000L,0x0000000C00C90020L,0x0000000000840800L});
    public static final BitSet FOLLOW_prefixExpr_in_unarExpr3714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_prefixExpr_in_unarExpr3734 = new BitSet(new long[]{0x0000000000000002L,0x0000100000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_PLUSPLUS_in_unarExpr3737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUBSUB_in_unarExpr3743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEW_in_prefixExpr3785 = new BitSet(new long[]{0x0040004000010000L,0x0000000000084020L,0x0000000400040000L});
    public static final BitSet FOLLOW_type_in_prefixExpr3788 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_LPAREN_in_prefixExpr3790 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00C90020L,0x0000000040A45804L});
    public static final BitSet FOLLOW_exprList_in_prefixExpr3793 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RPAREN_in_prefixExpr3796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CAST_in_prefixExpr3817 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_LPAREN_in_prefixExpr3820 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00C90020L,0x0000000040A45800L});
    public static final BitSet FOLLOW_expr_in_prefixExpr3823 = new BitSet(new long[]{0x0000000010000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_COMMA_in_prefixExpr3826 = new BitSet(new long[]{0x0040004000010000L,0x0000000000084020L,0x0000000400040000L});
    public static final BitSet FOLLOW_funcType_in_prefixExpr3829 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RPAREN_in_prefixExpr3833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_methodCallOrSlice_in_prefixExpr3854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_methodCallOrSlice3912 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_LPAREN_in_methodCallOrSlice3914 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00C90020L,0x0000000040A45804L});
    public static final BitSet FOLLOW_exprList_in_methodCallOrSlice3916 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RPAREN_in_methodCallOrSlice3919 = new BitSet(new long[]{0x0000001000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_pureCallOrSlice_in_methodCallOrSlice3921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_methodCallOrSlice3972 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_LBRACKET_in_methodCallOrSlice3974 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00C90020L,0x0000000040A45800L});
    public static final BitSet FOLLOW_expr_in_methodCallOrSlice3976 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RBRACKET_in_methodCallOrSlice3978 = new BitSet(new long[]{0x0000001000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_pureCallOrSlice_in_methodCallOrSlice3980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_methodCallOrSlice4031 = new BitSet(new long[]{0x0000001000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_pureCallOrSlice_in_methodCallOrSlice4033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_methodCallOrSlice4061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACKET_in_pureCallOrSlice4086 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00C90020L,0x0000000040A45800L});
    public static final BitSet FOLLOW_expr_in_pureCallOrSlice4088 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RBRACKET_in_pureCallOrSlice4090 = new BitSet(new long[]{0x0000001000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_pureCallOrSlice_in_pureCallOrSlice4092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_pureCallOrSlice4145 = new BitSet(new long[]{0x0288000002000000L,0x0000000800C90020L,0x0000000000840800L});
    public static final BitSet FOLLOW_methodCallOrSlice_in_pureCallOrSlice4148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objLit_in_value4184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcLit_in_value4192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_elementarySymbol_in_value4202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_value4212 = new BitSet(new long[]{0x0388000882420200L,0x0000100C00C90060L,0x0000001141AE580AL});
    public static final BitSet FOLLOW_expr_in_value4216 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_statement_in_value4218 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RPAREN_in_value4221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_value4237 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_typeParamOpt_in_value4239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classDecl_in_topLevelDecl4258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interfaceDecl_in_topLevelDecl4278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumDecl_in_topLevelDecl4298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typedefDecl_in_topLevelDecl4318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_topLevelAccess_in_enumDecl4354 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_ENUM_in_enumDecl4357 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_IDENTIFIER_in_enumDecl4359 = new BitSet(new long[]{0x0000000000000000L,0x0000000001080000L});
    public static final BitSet FOLLOW_typeParamOpt_in_enumDecl4361 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_enumBody_in_enumDecl4363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_enumBody4413 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000020L});
    public static final BitSet FOLLOW_enumValueDecl_in_enumBody4416 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000020L});
    public static final BitSet FOLLOW_RBRACE_in_enumBody4420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_enumValueDecl4460 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_LPAREN_in_enumValueDecl4466 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000020L,0x0000000000000004L});
    public static final BitSet FOLLOW_paramList_in_enumValueDecl4469 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RPAREN_in_enumValueDecl4472 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_SEMI_in_enumValueDecl4475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_enumValueDecl4498 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_SEMI_in_enumValueDecl4503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_topLevelAccess_in_classDecl4552 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_CLASS_in_classDecl4555 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_IDENTIFIER_in_classDecl4557 = new BitSet(new long[]{0x0001000000000000L,0x0000000001080100L});
    public static final BitSet FOLLOW_typeParamOpt_in_classDecl4559 = new BitSet(new long[]{0x0001000000000000L,0x0000000000080100L});
    public static final BitSet FOLLOW_inheritListOpt_in_classDecl4561 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_classBodyScope_in_classDecl4563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_classBodyScope4610 = new BitSet(new long[]{0x0200004000000000L,0xA400002000001000L,0x0000000100000200L});
    public static final BitSet FOLLOW_classMember_in_classBodyScope4613 = new BitSet(new long[]{0x0200004000000000L,0xA400002000001000L,0x0000000100000200L});
    public static final BitSet FOLLOW_RBRACE_in_classBodyScope4617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDeclClass_in_classMember4663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcDecl_in_classMember4683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDecl_in_varDeclList4726 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_varDeclList_in_varDeclList4728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttrList_in_varDeclClass4756 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_VAR_in_varDeclClass4759 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_IDENTIFIER_in_varDeclClass4761 = new BitSet(new long[]{0x0000100008000000L,0x0000000000800000L,0x0000000000000008L});
    public static final BitSet FOLLOW_propDecl_in_varDeclClass4763 = new BitSet(new long[]{0x0000100008000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_typeTag_in_varDeclClass4766 = new BitSet(new long[]{0x0000100000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_varInit_in_varDeclClass4769 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_SEMI_in_varDeclClass4772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_varDecl4837 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_varDeclPartList_in_varDecl4840 = new BitSet(new long[]{0x0000000010000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_COMMA_in_varDecl4843 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_varDeclPartList_in_varDecl4846 = new BitSet(new long[]{0x0000000010000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_SEMI_in_varDecl4850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_varDeclPartList4871 = new BitSet(new long[]{0x0000100008000002L,0x0000000000800000L});
    public static final BitSet FOLLOW_propDecl_in_varDeclPartList4873 = new BitSet(new long[]{0x0000100008000002L});
    public static final BitSet FOLLOW_typeTag_in_varDeclPartList4876 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_varInit_in_varDeclPartList4879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_propDecl4930 = new BitSet(new long[]{0x0000004200000000L,0x0000000A00000020L});
    public static final BitSet FOLLOW_propAccessor_in_propDecl4934 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_COMMA_in_propDecl4936 = new BitSet(new long[]{0x0000004200000000L,0x0000000A00000020L});
    public static final BitSet FOLLOW_propAccessor_in_propDecl4940 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RPAREN_in_propDecl4942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQ_in_varInit5101 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00C90020L,0x0000000040A45800L});
    public static final BitSet FOLLOW_expr_in_varInit5103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttrList_in_funcDecl5145 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_FUNCTION_in_funcDecl5148 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_NEW_in_funcDecl5150 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_LPAREN_in_funcDecl5152 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000020L,0x0000000000000004L});
    public static final BitSet FOLLOW_paramList_in_funcDecl5154 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RPAREN_in_funcDecl5157 = new BitSet(new long[]{0x0000000008000000L,0x0000000000080000L,0x0000000000000008L});
    public static final BitSet FOLLOW_typeTag_in_funcDecl5159 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L,0x0000000000000008L});
    public static final BitSet FOLLOW_block_in_funcDecl5162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttrList_in_funcDecl5217 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_FUNCTION_in_funcDecl5220 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_IDENTIFIER_in_funcDecl5222 = new BitSet(new long[]{0x0000000000000000L,0x0000000001800000L});
    public static final BitSet FOLLOW_typeParamOpt_in_funcDecl5224 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_LPAREN_in_funcDecl5226 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000020L,0x0000000000000004L});
    public static final BitSet FOLLOW_paramList_in_funcDecl5228 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RPAREN_in_funcDecl5231 = new BitSet(new long[]{0x0000000008000000L,0x0000000000080000L,0x0000000000000008L});
    public static final BitSet FOLLOW_typeTag_in_funcDecl5233 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L,0x0000000000000008L});
    public static final BitSet FOLLOW_block_in_funcDecl5236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttrList_in_funcProtoDecl5306 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_FUNCTION_in_funcProtoDecl5308 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_NEW_in_funcProtoDecl5310 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_LPAREN_in_funcProtoDecl5312 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000020L,0x0000000000000004L});
    public static final BitSet FOLLOW_paramList_in_funcProtoDecl5314 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RPAREN_in_funcProtoDecl5317 = new BitSet(new long[]{0x0000000008000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_typeTag_in_funcProtoDecl5319 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_SEMI_in_funcProtoDecl5322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttrList_in_funcProtoDecl5363 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_FUNCTION_in_funcProtoDecl5365 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_IDENTIFIER_in_funcProtoDecl5367 = new BitSet(new long[]{0x0000000000000000L,0x0000000001800000L});
    public static final BitSet FOLLOW_typeParamOpt_in_funcProtoDecl5369 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_LPAREN_in_funcProtoDecl5371 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000020L,0x0000000000000004L});
    public static final BitSet FOLLOW_paramList_in_funcProtoDecl5373 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RPAREN_in_funcProtoDecl5376 = new BitSet(new long[]{0x0000000008000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_typeTag_in_funcProtoDecl5378 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_SEMI_in_funcProtoDecl5381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_in_funcProtoDecl5425 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_NEW_in_funcProtoDecl5427 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_LPAREN_in_funcProtoDecl5429 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000020L,0x0000000000000004L});
    public static final BitSet FOLLOW_paramList_in_funcProtoDecl5431 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RPAREN_in_funcProtoDecl5434 = new BitSet(new long[]{0x0000000008000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_typeTag_in_funcProtoDecl5436 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_SEMI_in_funcProtoDecl5439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_in_funcProtoDecl5477 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_IDENTIFIER_in_funcProtoDecl5479 = new BitSet(new long[]{0x0000000000000000L,0x0000000001800000L});
    public static final BitSet FOLLOW_typeParamOpt_in_funcProtoDecl5481 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_LPAREN_in_funcProtoDecl5483 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000020L,0x0000000000000004L});
    public static final BitSet FOLLOW_paramList_in_funcProtoDecl5485 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RPAREN_in_funcProtoDecl5488 = new BitSet(new long[]{0x0000000008000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_typeTag_in_funcProtoDecl5490 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_SEMI_in_funcProtoDecl5493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_topLevelAccess_in_interfaceDecl5552 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_INTERFACE_in_interfaceDecl5555 = new BitSet(new long[]{0x0040004000010000L,0x0000000000084020L,0x0000000400040000L});
    public static final BitSet FOLLOW_type_in_interfaceDecl5557 = new BitSet(new long[]{0x0001000000000000L,0x0000000000080100L});
    public static final BitSet FOLLOW_inheritListOpt_in_interfaceDecl5559 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_LBRACE_in_interfaceDecl5561 = new BitSet(new long[]{0x0200004000000000L,0xA400002000001000L,0x0000000100000200L});
    public static final BitSet FOLLOW_interfaceBody_in_interfaceDecl5564 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_RBRACE_in_interfaceDecl5566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDecl_in_interfaceBody5590 = new BitSet(new long[]{0x0200004000000000L,0x2400002000001000L,0x0000000100000200L});
    public static final BitSet FOLLOW_interfaceBody_in_interfaceBody5592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcProtoDecl_in_interfaceBody5602 = new BitSet(new long[]{0x0200004000000000L,0x2400002000001000L,0x0000000100000200L});
    public static final BitSet FOLLOW_interfaceBody_in_interfaceBody5604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inherit_in_inheritList5638 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_COMMA_in_inheritList5641 = new BitSet(new long[]{0x0001000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_inherit_in_inheritList5644 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_inheritList_in_inheritListOpt5674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXTENDS_in_inherit5720 = new BitSet(new long[]{0x0040004000010000L,0x0000000000084020L,0x0000000400040000L});
    public static final BitSet FOLLOW_type_in_inherit5722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IMPLEMENTS_in_inherit5750 = new BitSet(new long[]{0x0040004000010000L,0x0000000000084020L,0x0000000400040000L});
    public static final BitSet FOLLOW_type_in_inherit5752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPEDEF_in_typedefDecl5792 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_IDENTIFIER_in_typedefDecl5794 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_EQ_in_typedefDecl5796 = new BitSet(new long[]{0x0040004000010000L,0x0000000000084020L,0x0000000400040000L});
    public static final BitSet FOLLOW_funcType_in_typedefDecl5798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GT_in_typeExtend5820 = new BitSet(new long[]{0x0040004000010000L,0x0000000000084020L,0x0000000400040000L});
    public static final BitSet FOLLOW_funcType_in_typeExtend5823 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_COMMA_in_typeExtend5825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_anonType5862 = new BitSet(new long[]{0x0800000000000000L,0x8000000000000020L,0x0000000100000000L});
    public static final BitSet FOLLOW_anonTypeFieldList_in_anonType5910 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_varDeclList_in_anonType5935 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_typeExtend_in_anonType5960 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000020L,0x0000000100000000L});
    public static final BitSet FOLLOW_anonTypeFieldList_in_anonType5964 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_varDeclList_in_anonType5968 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_RBRACE_in_anonType6015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_anonTypeField_in_anonTypeFieldList6062 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_COMMA_in_anonTypeFieldList6065 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_anonTypeField_in_anonTypeFieldList6068 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_LBRACE_in_objLit6104 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_objLitElemList_in_objLit6107 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_RBRACE_in_objLit6109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_anonTypeField6137 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_COLON_in_anonTypeField6139 = new BitSet(new long[]{0x0040004000010000L,0x0000000000084020L,0x0000000400040000L});
    public static final BitSet FOLLOW_funcType_in_anonTypeField6142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objLitElem_in_objLitElemList6172 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_COMMA_in_objLitElemList6175 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_objLitElem_in_objLitElemList6178 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_objLitElem6214 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_COLON_in_objLitElem6216 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00C90020L,0x0000000040A45800L});
    public static final BitSet FOLLOW_expr_in_objLitElem6219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LONGLITERAL_in_elementarySymbol6253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_elementarySymbol6271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTLITERAL_in_elementarySymbol6296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRINGLITERAL_in_elementarySymbol6315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARLITERAL_in_elementarySymbol6331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOATNUM_in_elementarySymbol6349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_elementarySymbol6370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_elementarySymbol6395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeParam_in_synpred48_Haxe1680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeParam_in_synpred50_Haxe1768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_synpred54_Haxe1930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignExpr_in_synpred55_Haxe1942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignExpr_in_synpred56_Haxe1942 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_expr_in_synpred56_Haxe1944 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_SEMI_in_synpred56_Haxe1947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_synpred58_Haxe1990 = new BitSet(new long[]{0x0388000882420200L,0x0000100C00C90060L,0x0000001141AE580AL});
    public static final BitSet FOLLOW_statement_in_synpred58_Haxe1993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_synpred72_Haxe2268 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_COLON_in_synpred72_Haxe2270 = new BitSet(new long[]{0x0388000882420200L,0x0000100C00C90060L,0x0000001141AE580AL});
    public static final BitSet FOLLOW_statement_in_synpred72_Haxe2272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDecl_in_synpred75_Haxe2438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_synpred115_Haxe3912 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_LPAREN_in_synpred115_Haxe3914 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00C90020L,0x0000000040A45804L});
    public static final BitSet FOLLOW_exprList_in_synpred115_Haxe3916 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RPAREN_in_synpred115_Haxe3919 = new BitSet(new long[]{0x0000001000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_pureCallOrSlice_in_synpred115_Haxe3921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_synpred117_Haxe3972 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_LBRACKET_in_synpred117_Haxe3974 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00C90020L,0x0000000040A45800L});
    public static final BitSet FOLLOW_expr_in_synpred117_Haxe3976 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RBRACKET_in_synpred117_Haxe3978 = new BitSet(new long[]{0x0000001000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_pureCallOrSlice_in_synpred117_Haxe3980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_synpred118_Haxe4031 = new BitSet(new long[]{0x0000001000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_pureCallOrSlice_in_synpred118_Haxe4033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_synpred124_Haxe4216 = new BitSet(new long[]{0x0000000000000002L});

}